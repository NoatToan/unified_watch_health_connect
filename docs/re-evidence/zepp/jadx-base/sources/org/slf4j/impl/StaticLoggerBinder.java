package org.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

/* JADX INFO: loaded from: classes23.dex */
public class StaticLoggerBinder implements LoggerFactoryBinder {
    private final ILoggerFactory a = new b();
    private static final StaticLoggerBinder b = new StaticLoggerBinder();
    public static String REQUESTED_API_VERSION = "1.6.99";
    private static final String c = b.class.getName();

    private StaticLoggerBinder() {
    }

    public static StaticLoggerBinder getSingleton() {
        return b;
    }

    @Override // org.slf4j.spi.LoggerFactoryBinder
    public ILoggerFactory getLoggerFactory() {
        return this.a;
    }

    @Override // org.slf4j.spi.LoggerFactoryBinder
    public String getLoggerFactoryClassStr() {
        return c;
    }
}
