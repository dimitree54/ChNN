package we.rashchenko.utils

import kotlin.math.pow
import kotlin.math.sqrt

data class Vector2(val x: Float, val y: Float){
	fun dst(v: Vector2): Float = sqrt((x - v.x).pow(2) + (y - v.y).pow(2))
	fun scl(v: Vector2): Vector2 = Vector2(x * v.x, y * v.y)
	companion object{
		val ZERO = Vector2(0f, 0f)
		val ONES = Vector2(1f, 1f)
	}
}