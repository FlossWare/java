/*
 * Copyright (C) 2014 Scot P. Floess
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
package org.flossware.reflect.klass.accessible;

import java.lang.reflect.Field;
import org.flossware.common.IntegrityUtil;

/**
 * Manages retrieving fields.
 *
 * @author Scot P. Floess
 */
public class FieldAccessibleMgr extends AbstractAccessibleObjectMgr<Field> {

    /**
     * {@inheritDoc}
     */
    @Override
    public Field[] getAccessibles(final Class klass) {
        return IntegrityUtil.ensure(klass, "Class must be set").getDeclaredFields();
    }
}
