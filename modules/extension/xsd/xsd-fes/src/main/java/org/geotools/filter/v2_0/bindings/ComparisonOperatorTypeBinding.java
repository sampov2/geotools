package org.geotools.filter.v2_0.bindings;

import javax.xml.namespace.QName;

import net.opengis.fes20.ComparisonOperatorType;
import net.opengis.fes20.Fes20Factory;

import org.geotools.filter.v2_0.FES;
import org.geotools.xml.AbstractComplexEMFBinding;

public class ComparisonOperatorTypeBinding extends AbstractComplexEMFBinding {

	public ComparisonOperatorTypeBinding(Fes20Factory factory) {
		super(factory);
	}
	
	@Override
	public QName getTarget() {
		return FES.ComparisonOperatorType;
	}

	@Override
	public Class getType() {
		return ComparisonOperatorType.class;
	}
	
}