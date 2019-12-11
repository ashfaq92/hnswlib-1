# coding=utf-8

import pytest
import findspark
findspark.init()

from pyspark import SparkContext, SparkConf


APP_NAME = 'hnswlib-pyspark-tests'


@pytest.fixture(scope="session", autouse=True)
def spark_context(request):
    """ fixture for creating a spark context
    Args:
        request: pytest.FixtureRequest object
    """
    conf = (SparkConf().set('spark.jars.packages', 'com.github.jelmerk:hnswlib-spark_2.3.0_2.11:0.0.27').setMaster("local[2]").setAppName(APP_NAME))
    sc = SparkContext(conf=conf)
    request.addfinalizer(lambda: sc.stop())

    return sc
