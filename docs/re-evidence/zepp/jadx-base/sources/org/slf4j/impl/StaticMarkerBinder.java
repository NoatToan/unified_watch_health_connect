package org.slf4j.impl;

import org.slf4j.IMarkerFactory;
import org.slf4j.helpers.BasicMarkerFactory;
import org.slf4j.spi.MarkerFactoryBinder;

/* JADX INFO: loaded from: classes23.dex */
public class StaticMarkerBinder implements MarkerFactoryBinder {
    public static final StaticMarkerBinder SINGLETON = new StaticMarkerBinder();
    public final IMarkerFactory a = new BasicMarkerFactory();

    private StaticMarkerBinder() {
    }

    public static StaticMarkerBinder getSingleton() {
        return SINGLETON;
    }

    @Override // org.slf4j.spi.MarkerFactoryBinder
    public IMarkerFactory getMarkerFactory() {
        return this.a;
    }

    @Override // org.slf4j.spi.MarkerFactoryBinder
    public String getMarkerFactoryClassStr() {
        return BasicMarkerFactory.class.getName();
    }
}
