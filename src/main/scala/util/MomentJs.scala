package util

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js

object momentJs {

  @JSName("moment")
  object Moment extends js.Object {
    def apply(text: String): Date = js.native
    def apply(millis: Double): Date = js.native
  }
}

trait Date extends js.Object {
  def fromNow(): String = js.native
}
