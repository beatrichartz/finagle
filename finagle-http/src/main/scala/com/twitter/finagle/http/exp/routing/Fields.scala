package com.twitter.finagle.http.exp.routing

import com.twitter.finagle.exp.routing.Field

object Fields {

  /** A [[Field]] that represents the extracted [[ParameterMap]] found when matching a [[Route]]. */
  object ParameterMapField extends Field[ParameterMap]

  /**
   * A [[Field]] that represents the memoized [[com.twitter.finagle.http.Request.path]],
   * which does not include any potential query params from the
   * [[com.twitter.finagle.http.Request.uri]].
   */
  object PathField extends Field[String]
}
