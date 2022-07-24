package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

/*
 *  Note: as the explosion is static (does not moves) nor it should be
 *  a factor in any collision (does not have mass), we hardcoded some
 *  properties of the class:
 *  - Its initial velocity is set to 0 (Vector2D(0.0, 0.0));
 *  - Its radius is set to 2.0 (results in a good sized explosion asset);
 *  - Its mass is set to 0.0 (as explosions are energy and therefore do
 *  not have any mass).
 */

class Explosion(pointOfExplosion: Point2D) :
  SpaceObject("Explosion", '#', pointOfExplosion, Vector2D(0.0, 0.0), 2.0, 0.0) {

  var is_triggered: Boolean = false
    private set

  fun explosionTriggered() {
    is_triggered = true
  }
}
