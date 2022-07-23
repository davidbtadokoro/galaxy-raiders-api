package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

class Explosion(pointOfExplosion: Point2D) :
  SpaceObject("Explosion", '#', pointOfExplosion, Vector2D(0.0, 0.0), 2.0, 0.0) {

  var is_triggered: Boolean = false
    private set

  fun explosionTriggered() {
    is_triggered = true
  }
}
