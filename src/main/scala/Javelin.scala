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
    lazy val NS = "http://ivan.fomentgroup.org/ontologies/javelin#"

    /**
     * Ontology namespace abbreviation (property)
     * Abbreviation for the ontology's namespace
     */
    lazy val hasNamespaceAbbreviation = NS #> "hasNamespaceAbbreviation"

    /**
     * User visible (property)
     * Should a class, resource or property be visible to the user
     */
    lazy val isUserVisible = NS #> "isUserVisible"

    /**
     * Modification time (property)
     * The modification time of the subject (usually a file)
     */
    lazy val hasModificationTime = NS #> "hasModificationTime"

    /**
     * Ontology (class)
     * Metadata about the ontology
     */
    lazy val Ontology = NS ## "Ontology"

    /**
     * Ontology namespace (property)
     * Namespace for the ontology
     */
    lazy val hasNamespace = NS #> "hasNamespace"

    /**
     * Javelin Ontology^^http://www.w3.org/2001/XMLSchema#string (class)
     * Ontology for Javelin internal concepts and properties^^http://www.w3.org/2001/XMLSchema#string
     */
    lazy val metadata = NS ## "metadata"


}
