package org.slf4j;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.NOPLoggerFactory;
import org.slf4j.helpers.SubstituteLogger;
import org.slf4j.helpers.SubstituteLoggerFactory;
import org.slf4j.helpers.Util;
import org.slf4j.impl.StaticLoggerBinder;

/* JADX INFO: loaded from: classes23.dex */
public final class LoggerFactory {
    public static final String a = "http://www.slf4j.org/codes.html";
    public static final String b = "http://www.slf4j.org/codes.html#StaticLoggerBinder";
    public static final String c = "http://www.slf4j.org/codes.html#multiple_bindings";
    public static final String d = "http://www.slf4j.org/codes.html#null_LF";
    public static final String e = "http://www.slf4j.org/codes.html#version_mismatch";
    public static final String f = "http://www.slf4j.org/codes.html#substituteLogger";
    public static final String g = "http://www.slf4j.org/codes.html#loggerNameMismatch";
    public static final String h = "http://www.slf4j.org/codes.html#replay";
    public static final String i = "http://www.slf4j.org/codes.html#unsuccessfulInit";
    public static final String j = "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit";
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 3;
    public static final int o = 4;
    public static volatile int p = 0;
    public static final String t = "java.vendor.url";
    public static final SubstituteLoggerFactory q = new SubstituteLoggerFactory();
    public static final NOPLoggerFactory r = new NOPLoggerFactory();
    public static final String s = "slf4j.detectLoggerNameMismatch";
    public static boolean u = Util.safeGetBooleanSystemProperty(s);
    private static final String[] v = {"1.6", "1.7"};
    private static String w = "org/slf4j/impl/StaticLoggerBinder.class";

    private LoggerFactory() {
    }

    private static final void a() {
        Set<URL> setF = null;
        try {
            if (!i()) {
                setF = f();
                p(setF);
            }
            StaticLoggerBinder.getSingleton();
            p = 3;
            o(setF);
            g();
            m();
            q.clear();
        } catch (Exception e2) {
            e(e2);
            throw new IllegalStateException("Unexpected initialization failure", e2);
        } catch (NoClassDefFoundError e3) {
            if (!j(e3.getMessage())) {
                e(e3);
                throw e3;
            }
            p = 4;
            Util.report("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            Util.report("Defaulting to no-operation (NOP) logger implementation");
            Util.report("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        } catch (NoSuchMethodError e4) {
            String message = e4.getMessage();
            if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                p = 2;
                Util.report("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                Util.report("Your binding is version 1.5.5 or earlier.");
                Util.report("Upgrade your binding to version 1.6.x.");
            }
            throw e4;
        }
    }

    private static void b(SubstituteLoggingEvent substituteLoggingEvent, int i2) {
        if (substituteLoggingEvent.getLogger().isDelegateEventAware()) {
            c(i2);
        } else {
            if (substituteLoggingEvent.getLogger().isDelegateNOP()) {
                return;
            }
            d();
        }
    }

    private static void c(int i2) {
        Util.report("A number (" + i2 + ") of logging calls during the initialization phase have been intercepted and are");
        Util.report("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        Util.report("See also http://www.slf4j.org/codes.html#replay");
    }

    private static void d() {
        Util.report("The following set of substitute loggers may have been accessed");
        Util.report("during the initialization phase. Logging calls during this");
        Util.report("phase were not honored. However, subsequent logging calls to these");
        Util.report("loggers will work as normally expected.");
        Util.report("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    public static void e(Throwable th) {
        p = 2;
        Util.report("Failed to instantiate SLF4J LoggerFactory", th);
    }

    public static Set<URL> f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = LoggerFactory.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(w) : classLoader.getResources(w);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e2) {
            Util.report("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }

    private static void g() {
        SubstituteLoggerFactory substituteLoggerFactory = q;
        synchronized (substituteLoggerFactory) {
            substituteLoggerFactory.postInitialization();
            for (SubstituteLogger substituteLogger : substituteLoggerFactory.getLoggers()) {
                substituteLogger.setDelegate(getLogger(substituteLogger.getName()));
            }
        }
    }

    public static ILoggerFactory getILoggerFactory() {
        if (p == 0) {
            synchronized (LoggerFactory.class) {
                if (p == 0) {
                    p = 1;
                    l();
                }
            }
        }
        int i2 = p;
        if (i2 == 1) {
            return q;
        }
        if (i2 == 2) {
            throw new IllegalStateException(j);
        }
        if (i2 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i2 == 4) {
            return r;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static Logger getLogger(String str) {
        return getILoggerFactory().getLogger(str);
    }

    private static boolean h(Set<URL> set) {
        return set.size() > 1;
    }

    private static boolean i() {
        String strSafeGetSystemProperty = Util.safeGetSystemProperty(t);
        if (strSafeGetSystemProperty == null) {
            return false;
        }
        return strSafeGetSystemProperty.toLowerCase().contains("android");
    }

    private static boolean j(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("org/slf4j/impl/StaticLoggerBinder") || str.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    private static boolean k(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    private static final void l() {
        a();
        if (p == 3) {
            r();
        }
    }

    private static void m() {
        LinkedBlockingQueue<SubstituteLoggingEvent> eventQueue = q.getEventQueue();
        int size = eventQueue.size();
        ArrayList<SubstituteLoggingEvent> arrayList = new ArrayList(128);
        int i2 = 0;
        while (eventQueue.drainTo(arrayList, 128) != 0) {
            for (SubstituteLoggingEvent substituteLoggingEvent : arrayList) {
                n(substituteLoggingEvent);
                int i3 = i2 + 1;
                if (i2 == 0) {
                    b(substituteLoggingEvent, size);
                }
                i2 = i3;
            }
            arrayList.clear();
        }
    }

    private static void n(SubstituteLoggingEvent substituteLoggingEvent) {
        if (substituteLoggingEvent == null) {
            return;
        }
        SubstituteLogger logger = substituteLoggingEvent.getLogger();
        String name = logger.getName();
        if (logger.isDelegateNull()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (logger.isDelegateNOP()) {
            return;
        }
        if (logger.isDelegateEventAware()) {
            logger.log(substituteLoggingEvent);
        } else {
            Util.report(name);
        }
    }

    private static void o(Set<URL> set) {
        if (set == null || !h(set)) {
            return;
        }
        Util.report("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    private static void p(Set<URL> set) {
        if (h(set)) {
            Util.report("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it2 = set.iterator();
            while (it2.hasNext()) {
                Util.report("Found binding in [" + it2.next() + "]");
            }
            Util.report("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static void q() {
        p = 0;
    }

    private static final void r() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : v) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            Util.report("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(v).toString());
            Util.report("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            Util.report("Unexpected problem occured during version sanity check", th);
        }
    }

    public static Logger getLogger(Class<?> cls) {
        Class<?> callingClass;
        Logger logger = getLogger(cls.getName());
        if (u && (callingClass = Util.getCallingClass()) != null && k(cls, callingClass)) {
            Util.report(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", logger.getName(), callingClass.getName()));
            Util.report("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return logger;
    }
}
