package org.geotools.wfs.v2_0;

import java.util.Map;

import javax.xml.namespace.QName;

import net.opengis.wfs.WfsFactory;
import net.opengis.wfs20.AllSomeType;
import net.opengis.wfs20.DropStoredQueryType;
import net.opengis.wfs20.ResolveValueType;
import net.opengis.wfs20.ResultTypeType;
import net.opengis.wfs20.UpdateActionType;
import net.opengis.wfs20.Wfs20Factory;

import org.geotools.filter.v2_0.FESConfiguration;
import org.geotools.gml3.XSDIdRegistry;
import org.geotools.ows.v1_1.OWSConfiguration;
import org.geotools.wfs.WFS20Configuration;
import org.geotools.wfs.v2_0.bindings.WFS_CapabilitiesTypeBinding;
import org.geotools.wfs.v2_0.bindings.EnvelopePropertyTypeBinding;
import org.geotools.wfs.v2_0.bindings.ParameterParserDelegate;
import org.geotools.wfs.v2_0.bindings.QueryExpressionTextDelegate;
import org.geotools.wfs.v2_0.bindings.QueryExpressionTextTypeBinding;
import org.geotools.wfs.v2_0.bindings.QueryTypeBinding;
import org.geotools.wfs.v2_0.bindings.ReturnFeatureTypesListTypeBinding;
import org.geotools.wfs.v2_0.bindings.TransactionTypeBinding;
import org.geotools.wfs.v2_0.bindings.TupleTypeBinding;
import org.geotools.wfs.v2_0.bindings.ValueCollectionTypeBinding;
import org.geotools.wfs.v2_0.bindings.ValueReferenceTypeBinding;
//import org.geotools.wfs.v2_0.bindings.WFS_CapabilitiesTypeBinding;
import org.geotools.xml.ComplexEMFBinding;
import org.geotools.xml.Configuration;
import org.geotools.xml.EnumSimpleBinding;
import org.geotools.xml.Parser;
import org.geotools.xml.SimpleContentComplexEMFBinding;
import org.geotools.xs.bindings.XSQNameBinding;
import org.picocontainer.MutablePicoContainer;

/**
 * Parser configuration for the http://www.opengis.net/wfs/2.0 schema.
 *
 * @generated
 *
 *
 * @source $URL$
 */
public class WFSConfiguration extends WFS20Configuration {

    /**
     * Creates a new configuration.
     * 
     * @generated
     */     
    public WFSConfiguration() {
       super(WFS.getInstance());
       
       addDependency(new OWSConfiguration());
       addDependency(new FESConfiguration());
    }
    
    @Override
    protected void configureContext(MutablePicoContainer container) {
        container.registerComponentInstance(WfsFactory.eINSTANCE);
        container.registerComponentInstance(Wfs20Factory.eINSTANCE);
        container.registerComponentInstance(new XSDIdRegistry());
        
        container.registerComponentImplementation(QueryExpressionTextDelegate.class);
        container.registerComponentImplementation(ParameterParserDelegate.class);
    }

    @Override
    protected void configureParser(Parser parser) {
        //need to force the parser delegates to engage
        parser.setForceParserDelegate(true);
    }
} 