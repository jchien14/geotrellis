package geotrellis.op.logic

import geotrellis._
import geotrellis.op._
import geotrellis.process._

case class Collect[A](ops:Seq[Op[A]]) extends Op[Seq[A]] {
  def _run(context:Context) = runAsync(ops.toList)
  val nextSteps:Steps = {
    case as:List[_] => Result(as.asInstanceOf[List[A]].toSeq) 
  }
}