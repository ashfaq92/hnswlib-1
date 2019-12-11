package com.github.jelmerk.knn

import com.github.jelmerk.knn.{ DistanceFunctions => JDistanceFunctions }

package object scalalike {

  /**
    * Item that can be indexed
    *
    * @tparam TId Type of the vector to perform distance calculation on
    * @tparam TVector Type of the vector to perform distance calculation on
    */
  type Item[TId, TVector] = com.github.jelmerk.knn.Item[TId, TVector]

  /**
    * Result of a nearest neighbour search.
    *
    * @tparam TItem type of the item returned
    * @tparam TDistance type of the distance returned by the configured distance function
    */
  type SearchResult[TItem, TDistance] = com.github.jelmerk.knn.SearchResult[TItem, TDistance]

  /**
    * A sparse vector represented by an index array and a value array.
    *
    * @tparam TVector Type of the value array
    */
  type SparseVector[TVector] = com.github.jelmerk.knn.SparseVector[TVector]

  /**
    * Calculates the distance between 2 vectors
    */
  type DistanceFunction[TVector, TDistance] = (TVector, TVector) => TDistance

  /**
    * Called periodically to report on progress during indexing. The first argument is the number of records processed.
    * The second argument is the total number of record to index as part of this operation.
    */
  type ProgressListener = (Int, Int) => Unit

  /**
    * Calculates the cosine distance.
    */
  val floatCosineDistance: DistanceFunction[Array[Float], Float] = JDistanceFunctions.FLOAT_COSINE_DISTANCE.distance

  /**
    * Calculates the inner product.
    */
  val floatInnerProduct: DistanceFunction[Array[Float], Float] = JDistanceFunctions.FLOAT_INNER_PRODUCT.distance

  /**
    * Calculates the euclidean distance.
    */
  val floatEuclideanDistance: DistanceFunction[Array[Float], Float] = JDistanceFunctions.FLOAT_EUCLIDEAN_DISTANCE.distance

  /**
    * Calculates the canberra distance.
    */
  val floatCanberraDistance: DistanceFunction[Array[Float], Float] = JDistanceFunctions.FLOAT_CANBERRA_DISTANCE.distance

  /**
    * Calculates the bray curtis distance.
    */
  val floatBrayCurtisDistance: DistanceFunction[Array[Float], Float] = JDistanceFunctions.FLOAT_BRAY_CURTIS_DISTANCE.distance

  /**
    * Calculates the correlation distance.
    */
  val floatCorrelationDistance: DistanceFunction[Array[Float], Float] = JDistanceFunctions.FLOAT_CORRELATION_DISTANCE.distance

  /**
    * Calculates the inner product.
    */
  val floatSparseVectorInnerProduct: DistanceFunction[SparseVector[Array[Float]], Float] =
    JDistanceFunctions.FLOAT_SPARSE_VECTOR_INNER_PRODUCT.distance

  /**
    * Calculates the manhattan distance.
    */
  val floatManhattanDistance: DistanceFunction[Array[Float], Float] = JDistanceFunctions.FLOAT_MANHATTAN_DISTANCE.distance

  /**
    * Calculates the cosine distance.
    */
  val doubleCosineDistance: DistanceFunction[Array[Double], Double] = JDistanceFunctions.DOUBLE_COSINE_DISTANCE.distance

  /**
    * Calculates the inner product.
    */
  val doubleInnerProduct: DistanceFunction[Array[Double], Double] = JDistanceFunctions.DOUBLE_INNER_PRODUCT.distance

  /**
    * Calculates the euclidean distance.
    */
  val doubleEuclideanDistance: DistanceFunction[Array[Double], Double] = JDistanceFunctions.DOUBLE_EUCLIDEAN_DISTANCE.distance

  /**
    * Calculates the canberra distance.
    */
  val doubleCanberraDistance: DistanceFunction[Array[Double], Double] = JDistanceFunctions.DOUBLE_CANBERRA_DISTANCE.distance

  /**
    * Calculates the bray curtis distance.
    */
  val doubleBrayCurtisDistance: DistanceFunction[Array[Double], Double] = JDistanceFunctions.DOUBLE_BRAY_CURTIS_DISTANCE.distance

  /**
    * Calculates the bray correlation distance.
    */
  val doubleCorrelationDistance: DistanceFunction[Array[Double], Double] = JDistanceFunctions.DOUBLE_CORRELATION_DISTANCE.distance

  /**
    * Calculates the manhattan distance.
    */
  val doubleManhattanDistance: DistanceFunction[Array[Double], Double] = JDistanceFunctions.DOUBLE_MANHATTAN_DISTANCE.distance

  /**
    * Calculates the inner product.
    */
  val doubleSparseVectorInnerProduct: DistanceFunction[SparseVector[Array[Double]], Double] =
    JDistanceFunctions.DOUBLE_SPARSE_VECTOR_INNER_PRODUCT.distance
}
