package io.chrisdavenport.condemned

import munit.CatsEffectSuite
// import cats.effect._

class UnsafeRefSpec extends CatsEffectSuite {
  // TODO ref suite

  test("Unsafe Ref Set Work as Expected") {
    val u = UnsafeRef.of(0)
    u.set(5)
    assertEquals(u.get, 5)
  }

}
