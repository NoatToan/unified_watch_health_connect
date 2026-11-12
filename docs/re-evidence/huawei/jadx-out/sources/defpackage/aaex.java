package defpackage;

import com.huawei.openalliance.ad.constant.OsType;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.impl.StaticLoggerBinder;

/* JADX INFO: loaded from: classes20.dex */
public final class aaex {
    static volatile int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final aafi f156a = new aafi();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final aaez f157b = new aaez();
    static boolean e = aafg.b("slf4j.detectLoggerNameMismatch");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f158c = {"1.6", "1.7"};
    private static String h = "org/slf4j/impl/StaticLoggerBinder.class";

    private aaex() {
    }

    private static final void f() {
        c();
        if (d == 3) {
            h();
        }
    }

    private static boolean b(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("org/slf4j/impl/StaticLoggerBinder") || str.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    private static final void c() {
        Set<URL> setD;
        try {
            try {
                if (i()) {
                    setD = null;
                } else {
                    setD = d();
                    a(setD);
                }
                StaticLoggerBinder.getSingleton();
                d = 3;
                e(setD);
                j();
            } catch (Exception e2) {
                d(e2);
                throw new IllegalStateException("Unexpected initialization failure", e2);
            } catch (NoClassDefFoundError e3) {
                if (b(e3.getMessage())) {
                    d = 4;
                    aafg.c("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                    aafg.c("Defaulting to no-operation (NOP) logger implementation");
                    aafg.c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                    j();
                    return;
                }
                d(e3);
                throw e3;
            } catch (NoSuchMethodError e4) {
                String message = e4.getMessage();
                if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    d = 2;
                    aafg.c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    aafg.c("Your binding is version 1.5.5 or earlier.");
                    aafg.c("Upgrade your binding to version 1.6.x.");
                }
                throw e4;
            }
        } catch (Throwable th) {
            j();
            throw th;
        }
    }

    private static void j() {
        a();
        g();
        f156a.a();
    }

    private static void a() {
        aafi aafiVar = f156a;
        synchronized (aafiVar) {
            aafiVar.b();
            for (aafh aafhVar : aafiVar.c()) {
                aafhVar.c(a(aafhVar.getName()));
            }
        }
    }

    static void d(Throwable th) {
        d = 2;
        aafg.c("Failed to instantiate SLF4J LoggerFactory", th);
    }

    private static void g() {
        LinkedBlockingQueue<aafd> linkedBlockingQueueE = f156a.e();
        int size = linkedBlockingQueueE.size();
        ArrayList<aafd> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueueE.drainTo(arrayList, 128) != 0) {
            for (aafd aafdVar : arrayList) {
                d(aafdVar);
                if (i == 0) {
                    e(aafdVar, size);
                }
                i++;
            }
            arrayList.clear();
        }
    }

    private static void e(aafd aafdVar, int i) {
        if (aafdVar.e().e()) {
            a(i);
        } else {
            if (aafdVar.e().b()) {
                return;
            }
            b();
        }
    }

    private static void d(aafd aafdVar) {
        if (aafdVar == null) {
            return;
        }
        aafh aafhVarE = aafdVar.e();
        String name = aafhVarE.getName();
        if (aafhVarE.a()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (aafhVarE.b()) {
            return;
        }
        if (aafhVarE.e()) {
            aafhVarE.b(aafdVar);
        } else {
            aafg.c(name);
        }
    }

    private static void b() {
        aafg.c("The following set of substitute loggers may have been accessed");
        aafg.c("during the initialization phase. Logging calls during this");
        aafg.c("phase were not honored. However, subsequent logging calls to these");
        aafg.c("loggers will work as normally expected.");
        aafg.c("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    private static void a(int i) {
        aafg.c("A number (" + i + ") of logging calls during the initialization phase have been intercepted and are");
        aafg.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        aafg.c("See also http://www.slf4j.org/codes.html#replay");
    }

    private static final void h() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : f158c) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            aafg.c("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f158c).toString());
            aafg.c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            aafg.c("Unexpected problem occured during version sanity check", th);
        }
    }

    static Set<URL> d() {
        Enumeration<URL> resources;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = aaex.class.getClassLoader();
            if (classLoader == null) {
                resources = ClassLoader.getSystemResources(h);
            } else {
                resources = classLoader.getResources(h);
            }
            while (resources.hasMoreElements()) {
                linkedHashSet.add(resources.nextElement());
            }
        } catch (IOException e2) {
            aafg.c("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }

    private static boolean b(Set<URL> set) {
        return set.size() > 1;
    }

    private static void a(Set<URL> set) {
        if (b(set)) {
            aafg.c("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                aafg.c("Found binding in [" + it.next() + "]");
            }
            aafg.c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    private static boolean i() {
        String strA = aafg.a("java.vendor.url");
        if (strA == null) {
            return false;
        }
        return strA.toLowerCase().contains(OsType.ANDROID);
    }

    private static void e(Set<URL> set) {
        if (set == null || !b(set)) {
            return;
        }
        aafg.c("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    public static Logger a(String str) {
        return e().getLogger(str);
    }

    public static Logger a(Class<?> cls) {
        Class<?> clsD;
        Logger loggerA = a(cls.getName());
        if (e && (clsD = aafg.d()) != null && c(cls, clsD)) {
            aafg.c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", loggerA.getName(), clsD.getName()));
            aafg.c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return loggerA;
    }

    private static boolean c(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    public static ILoggerFactory e() {
        if (d == 0) {
            synchronized (aaex.class) {
                if (d == 0) {
                    d = 1;
                    f();
                }
            }
        }
        int i = d;
        if (i == 1) {
            return f156a;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return f157b;
        }
        throw new IllegalStateException("Unreachable code");
    }
}
