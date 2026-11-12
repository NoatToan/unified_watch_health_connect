package defpackage;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class aqe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f3355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static qoo f3356b = new qoo();
    public static igg c = new igg();
    public static boolean d = Boolean.getBoolean("slf4j.detectLoggerNameMismatch");
    public static final String[] e = {"1.6", "1.7"};
    public static String f = "org/slf4j/impl/StaticLoggerBinder.class";

    public static final void a() {
        try {
            Set<URL> setC = c();
            m(setC);
            hdo.c();
            f3355a = 3;
            l(setC);
            d();
        } catch (Exception e2) {
            b(e2);
            throw new IllegalStateException("Unexpected initialization failure", e2);
        } catch (NoClassDefFoundError e3) {
            if (!i(e3.getMessage())) {
                b(e3);
                throw e3;
            }
            f3355a = 4;
            amq.b("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            amq.b("Defaulting to no-operation (NOP) logger implementation");
            amq.b("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        } catch (NoSuchMethodError e4) {
            String message = e4.getMessage();
            if (message != null && message.indexOf("org.slf4j.impl.StaticLoggerBinder.getSingleton()") != -1) {
                f3355a = 2;
                amq.b("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                amq.b("Your binding is version 1.5.5 or earlier.");
                amq.b("Upgrade your binding to version 1.6.x.");
            }
            throw e4;
        }
    }

    public static void b(Throwable th) {
        f3355a = 2;
        amq.c("Failed to instantiate SLF4J LoggerFactory", th);
    }

    public static Set<URL> c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = aqe.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f) : classLoader.getResources(f);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e2) {
            amq.c("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }

    public static final void d() {
        List<poo> listC = f3356b.c();
        if (listC.isEmpty()) {
            return;
        }
        amq.b("The following set of substitute loggers may have been accessed");
        amq.b("during the initialization phase. Logging calls during this");
        amq.b("phase were not honored. However, subsequent logging calls to these");
        amq.b("loggers will work as normally expected.");
        amq.b("See also http://www.slf4j.org/codes.html#substituteLogger");
        for (poo pooVar : listC) {
            pooVar.c(g(pooVar.getName()));
            amq.b(pooVar.getName());
        }
        f3356b.b();
    }

    public static stc e() {
        if (f3355a == 0) {
            f3355a = 1;
            k();
        }
        int i = f3355a;
        if (i == 1) {
            return f3356b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return hdo.c().a();
        }
        if (i == 4) {
            return c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static qpe f(Class<?> cls) {
        qpe qpeVarG = g(cls.getName());
        if (d) {
            Class<?> clsA = amq.a();
            if (j(cls, clsA)) {
                amq.b(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", qpeVarG.getName(), clsA.getName()));
                amq.b("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return qpeVarG;
    }

    public static qpe g(String str) {
        return e().a(str);
    }

    public static boolean h(Set<URL> set) {
        return set.size() > 1;
    }

    public static boolean i(String str) {
        if (str == null) {
            return false;
        }
        return (str.indexOf("org/slf4j/impl/StaticLoggerBinder") == -1 && str.indexOf("org.slf4j.impl.StaticLoggerBinder") == -1) ? false : true;
    }

    public static boolean j(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    public static final void k() {
        a();
        if (f3355a == 3) {
            n();
        }
    }

    public static void l(Set<URL> set) {
        if (h(set)) {
            amq.b("Actual binding is of type [" + hdo.c().b() + "]");
        }
    }

    public static void m(Set<URL> set) {
        if (h(set)) {
            amq.b("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                amq.b("Found binding in [" + it.next() + "]");
            }
            amq.b("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static final void n() {
        String[] strArr;
        try {
            String str = hdo.c;
            int i = 0;
            boolean z = false;
            while (true) {
                strArr = e;
                if (i >= strArr.length) {
                    break;
                }
                if (str.startsWith(strArr[i])) {
                    z = true;
                }
                i++;
            }
            if (z) {
                return;
            }
            amq.b("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(strArr).toString());
            amq.b("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            amq.c("Unexpected problem occured during version sanity check", th);
        }
    }
}
