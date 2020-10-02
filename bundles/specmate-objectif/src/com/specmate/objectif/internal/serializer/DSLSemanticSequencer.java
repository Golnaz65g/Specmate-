/*
 * generated by Xtext 2.19.0
 */
package com.specmate.objectif.internal.serializer;

import com.google.inject.Inject;
import com.specmate.objectif.internal.dSL.AND_Node;
import com.specmate.objectif.internal.dSL.BusinessRule;
import com.specmate.objectif.internal.dSL.DSLPackage;
import com.specmate.objectif.internal.dSL.Literal;
import com.specmate.objectif.internal.dSL.Model;
import com.specmate.objectif.internal.dSL.OR_Node;
import com.specmate.objectif.internal.services.DSLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class DSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DSLPackage.AND_NODE:
				sequence_AND_Node(context, (AND_Node) semanticObject); 
				return; 
			case DSLPackage.BUSINESS_RULE:
				sequence_BusinessRule(context, (BusinessRule) semanticObject); 
				return; 
			case DSLPackage.LITERAL:
				sequence_Literal(context, (Literal) semanticObject); 
				return; 
			case DSLPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case DSLPackage.OR_NODE:
				sequence_OR_Node(context, (OR_Node) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AND_Node returns AND_Node
	 *
	 * Constraint:
	 *     (node=Literal (and?='UND' subNode=AND_Node)?)
	 */
	protected void sequence_AND_Node(ISerializationContext context, AND_Node semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BusinessRule returns BusinessRule
	 *
	 * Constraint:
	 *     (cause=OR_Node (effect=BusinessRule | effect=OR_Node) (alternative=BusinessRule | alternative=OR_Node)?)
	 */
	protected void sequence_BusinessRule(ISerializationContext context, BusinessRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns Literal
	 *
	 * Constraint:
	 *     content+=CHARACTER_SQUENCE+
	 */
	protected void sequence_Literal(ISerializationContext context, Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     rules+=BusinessRule+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OR_Node returns OR_Node
	 *
	 * Constraint:
	 *     (node=AND_Node (or?='ODER' subNode=OR_Node)?)
	 */
	protected void sequence_OR_Node(ISerializationContext context, OR_Node semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
