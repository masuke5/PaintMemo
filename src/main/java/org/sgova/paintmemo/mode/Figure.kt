package org.sgova.paintmemo.mode

import java.awt.Color
import java.awt.Graphics

interface Figure {
	val color: Color
	var startX: Int
	var startY: Int
	var x: Int
	var y: Int
	
	fun reshape(g: Graphics)
}