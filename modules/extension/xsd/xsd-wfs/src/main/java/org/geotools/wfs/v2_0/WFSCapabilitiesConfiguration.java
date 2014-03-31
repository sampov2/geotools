/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2002-2014, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.wfs.v2_0;


import net.opengis.wfs20.Wfs20Factory;

import org.geotools.wfs.WFS20Configuration;
import org.geotools.xml.Configuration;
import org.picocontainer.MutablePicoContainer;

/**
 * Parser configuration for the wfs 2.0 {@link WFSCapabilities schema}
 * 
 * @see WFSCapabilities
 */
public class WFSCapabilitiesConfiguration extends WFS20Configuration {
    /**
     * Creates a new configuration.
     * 
     * @generated
     */
    public WFSCapabilitiesConfiguration() {
 
        super(WFSCapabilities.getInstance());

        addDependency(new org.geotools.filter.v2_0.FESConfiguration());
        addDependency(new org.geotools.ows.v1_1.OWSConfiguration());
    }

    @Override
    protected void configureContext(MutablePicoContainer container) {
    	container.registerComponentInstance(Wfs20Factory.eINSTANCE);
    }
    
    protected void configureBindings(org.picocontainer.MutablePicoContainer container) {
    	//WFSCapabilities.
    	//container.registerComponentImplementation(net.opengis.wfs20.WFSCapabilitiesType.class);
    	
    	//ServiceIdentification
    	//container.registerCo
/*
        container
                .registerComponentImplementation(WFSCapabilities.Service, ServiceTypeBinding.class);
        container.registerComponentImplementation(WFSCapabilities.LatLongBoundingBox,
                LatLongBoundingBoxBinding.class);

        container.registerComponentImplementation(WFSCapabilities.DCPType, DCPTypeBinding.class);
        container.registerComponentImplementation(WFSCapabilities.Capability,
                CapabilityBinding.class);
        */
    }
}
