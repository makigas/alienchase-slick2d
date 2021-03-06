/*
 * This file is part of Alien Chase.
 * Copyright (C) 2012 Dani Rodríguez.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package yt.makigas93.juego1;

import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Tierra implements IColisionable {
    private Rectangle colision;
    private boolean huboChoque;

    public Tierra() {
        this.colision = new Rectangle(0.0f, 0.0f, 2.0f, 360.0f);
        this.huboChoque = false;
    }

    public boolean haChocado() {
        return this.huboChoque;
    }

    public Shape getAreaColision() {
        return this.colision;
    }

    public void alColisionar(IColisionable colision) {
        if (colision.getClass().getSimpleName().equals("Alien")) {
            this.huboChoque = true;
        }
    }

    public void sincronizarArea() {
    }
}
