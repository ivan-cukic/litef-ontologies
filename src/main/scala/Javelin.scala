/*
 * This file has been automatically generated based on the
 * Javelin ontology.
 */

package javelin.vocabulary

import javelin.ontology.Implicits._

 /**
  * Javelin Ontology
  * Ontology for Javelin internal concepts and properties
  */
object Javelin {
    lazy val NS = "https://raw.githubusercontent.com/ivan-cukic/litef-ontologies/master/misanu.ivan.javelin.ttl#"

    /**
     * Javelin Ontology^^http://www.w3.org/2001/XMLSchema#string (class)
     * Ontology for Javelin internal concepts and properties^^http://www.w3.org/2001/XMLSchema#string
     */
    lazy val metadata = NS ## "metadata"

    /**
     * Ontology namespace (property)
     * Namespace for the ontology
     */
    lazy val sNamespace = NS #> "sNamespace"

    /**
     * User visible (property)
     * Should a class, resource or property be visible to the user
     */
    lazy val UserVisible = NS #> "UserVisible"

    /**
     * Modification time (property)
     * The modification time of the subject (usually a file)
     */
    lazy val sModificationTime = NS #> "sModificationTime"

    /**
     * Ontology (class)
     * Metadata about the ontology
     */
    lazy val tology = NS ## "tology"

    /**
     * Ontology namespace abbreviation (property)
     * Abbreviation for the ontology's namespace
     */
    lazy val sNamespaceAbbreviation = NS #> "sNamespaceAbbreviation"


}
