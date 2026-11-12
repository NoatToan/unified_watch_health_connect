package org.slf4j.impl;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.util.ContextInitializer;
import ch.qos.logback.classic.util.ContextSelectorStaticBinder;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.status.StatusUtil;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.ILoggerFactory;
import org.slf4j.helpers.Util;
import org.slf4j.spi.LoggerFactoryBinder;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public class StaticLoggerBinder implements LoggerFactoryBinder {
    private static Object KEY = null;
    static final String NULL_CS_URL = "http://logback.qos.ch/codes.html#null_CS";
    public static String REQUESTED_API_VERSION = "1.6";
    private static StaticLoggerBinder SINGLETON;
    private boolean initialized = false;
    private LoggerContext defaultLoggerContext = new LoggerContext();
    private final ContextSelectorStaticBinder contextSelectorBinder = ContextSelectorStaticBinder.getSingleton();

    static {
        StaticLoggerBinder staticLoggerBinder = new StaticLoggerBinder();
        SINGLETON = staticLoggerBinder;
        KEY = new Object();
        staticLoggerBinder.init();
    }

    private StaticLoggerBinder() {
        this.defaultLoggerContext.setName("default");
    }

    public static StaticLoggerBinder getSingleton() {
        return SINGLETON;
    }

    public static void reset() {
        StaticLoggerBinder staticLoggerBinder = new StaticLoggerBinder();
        SINGLETON = staticLoggerBinder;
        staticLoggerBinder.init();
    }

    @Override // org.slf4j.spi.LoggerFactoryBinder
    public ILoggerFactory getLoggerFactory() {
        if (!this.initialized) {
            return this.defaultLoggerContext;
        }
        if (this.contextSelectorBinder.getContextSelector() != null) {
            return this.contextSelectorBinder.getContextSelector().getLoggerContext();
        }
        h.z("contextSelector cannot be null. See also http://logback.qos.ch/codes.html#null_CS");
        return null;
    }

    @Override // org.slf4j.spi.LoggerFactoryBinder
    public String getLoggerFactoryClassStr() {
        return this.contextSelectorBinder.getClass().getName();
    }

    public void init() {
        try {
            try {
                new ContextInitializer(this.defaultLoggerContext).autoConfig();
            } catch (JoranException e4) {
                Util.report("Failed to auto configure default logger context", e4);
            }
            if (!StatusUtil.contextHasStatusListener(this.defaultLoggerContext)) {
                StatusPrinter.printInCaseOfErrorsOrWarnings(this.defaultLoggerContext);
            }
            this.contextSelectorBinder.init(this.defaultLoggerContext, KEY);
            this.initialized = true;
        } catch (Exception e14) {
            Util.report("Failed to instantiate [" + LoggerContext.class.getName() + "]", e14);
        }
    }
}
