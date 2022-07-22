package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.assertFalse

@DisplayName("Given an explosion")
class ExplosionTest {
  private val explosion = Explosion(pointOfExplosion = Point2D(1.0, 1.0))

  @Test
  fun `it has a type Explosion `() {
    assertEquals("Explosion", explosion.type)
  }

  @Test
  fun `it has a symbol octothorpe `() {
    assertEquals('#', explosion.symbol)
  }

  @Test
  fun `it shows the type Explosion when converted to String `() {
    assertTrue(explosion.toString().contains("Explosion"))
  }

  @Test
  fun `it initializes untriggered `() {
    assertFalse(explosion.is_triggered)
  }

  @Test
  fun `it changes is_triggered to true after explosionTriggered() called ` () {
    assertFalse(explosion.is_triggered)
    explosion.explosionTriggered()
    assertTrue(explosion.is_triggered)
  }

}
