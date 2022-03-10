package com.ageorgin.akkahttpaccesslog

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class MyTestedServiceSpec extends AnyWordSpec with Matchers {
  "A MyTestedService" should {
    "extract first block in a string" in {
      val myTestedService = new MyTestedService

      myTestedService.extractFirstBlock("AAAA_BBBB") should equal("BLABLA")
    }
  }
}
