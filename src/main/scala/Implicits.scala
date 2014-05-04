/*
 * Copyright (C) 2013 Ivan Cukic <ivan at mi.sanu.ac.rs>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package javelin.ontology

import com.hp.hpl.jena.rdf.model.{ ModelFactory }


/**
 * Syntax classes
 */
object Implicits {

    private
    lazy val model = ModelFactory.createDefaultModel

    implicit
    class StringToResource(ns: String) {
        def URI(f: String) = ns + f

        def ##(f: String) = model createResource URI(f)

        def #>(f: String) = model createProperty URI(f)
    }
}
