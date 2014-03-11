package geotrellis.raster.op.local

import geotrellis._

/**
 * Operation to get the flooring of values.
 */
object Floor extends Serializable {
  /** Takes the Flooring of each raster cell value. */
  def apply(r: Raster) = 
    r.dualMap { z: Int => z }
              { z: Double => math.floor(z) } // math.floor(Double.NaN) == Double.NaN
}
