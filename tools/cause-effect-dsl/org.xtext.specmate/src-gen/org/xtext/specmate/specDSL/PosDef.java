/**
 * generated by Xtext 2.17.1
 */
package org.xtext.specmate.specDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pos Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.specmate.specDSL.PosDef#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.specmate.specDSL.PosDef#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see org.xtext.specmate.specDSL.SpecDSLPackage#getPosDef()
 * @model
 * @generated
 */
public interface PosDef extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.specmate.specDSL.SpecDSLPackage#getPosDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.specmate.specDSL.PosDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.specmate.specDSL.POSTag}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags</em>' containment reference list.
   * @see org.xtext.specmate.specDSL.SpecDSLPackage#getPosDef_Tags()
   * @model containment="true"
   * @generated
   */
  EList<POSTag> getTags();

} // PosDef
