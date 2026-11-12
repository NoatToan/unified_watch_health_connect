package defpackage;

import com.typesafe.config.ConfigException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public class vb4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jc4 f36694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ob4 f36695b;
    public static final ob4 c;
    public static final gc4 d;
    public static final mcm e;
    public static final ncm f;

    public static class a implements Callable<nb4> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ClassLoader f36696a;

        public a(ClassLoader classLoader) {
            this.f36696a = classLoader;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public nb4 call() {
            return vb4.p().e(skh.p("reference.conf", lc4.b().i(this.f36696a)).r().r()).resolve();
        }
    }

    public static class b implements wcm.a {
        @Override // wcm.a
        public mc4 a(String str, lc4 lc4Var) {
            return skh.p(str, lc4Var);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static String f36697a = "loads";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Map<String, Boolean> f36698b;
        public static final boolean c;

        static {
            Map<String, Boolean> mapA = a();
            f36698b = mapA;
            c = mapA.get(f36697a).booleanValue();
        }

        public static Map<String, Boolean> a() {
            HashMap map = new HashMap();
            map.put(f36697a, Boolean.FALSE);
            String property = System.getProperty("config.trace");
            if (property == null) {
                return map;
            }
            for (String str : property.split(",")) {
                if (str.equals(f36697a)) {
                    map.put(f36697a, Boolean.TRUE);
                } else {
                    System.err.println("config.trace property contains unknown trace topic '" + str + "'");
                }
            }
            return map;
        }

        public static boolean b() {
            return c;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final yb4 f36699a = new wcm(null);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g00 f36700a = vb4.l();
    }

    public static class f implements wcm.a {
        @Override // wcm.a
        public mc4 a(String str, lc4 lc4Var) {
            return skh.l(new File(str), lc4Var);
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public nb4 f36701a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ClassLoader f36702b = null;
        public Map<String, nb4> c = new HashMap();

        public synchronized nb4 a(ClassLoader classLoader, String str, Callable<nb4> callable) {
            nb4 nb4VarCall;
            try {
                if (classLoader != this.f36702b) {
                    this.c.clear();
                    this.f36702b = classLoader;
                }
                nb4 nb4VarP = vb4.p();
                if (nb4VarP != this.f36701a) {
                    this.c.clear();
                    this.f36701a = nb4VarP;
                }
                nb4VarCall = this.c.get(str);
                if (nb4VarCall == null) {
                    try {
                        nb4VarCall = callable.call();
                        if (nb4VarCall == null) {
                            throw new ConfigException.BugOrBroken("null config from cache updater");
                        }
                        this.c.put(str, nb4VarCall);
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception e2) {
                        throw new ConfigException.Generic(e2.getMessage(), e2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            return nb4VarCall;
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f36703a = new g();
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static volatile g00 f36704a = vb4.m();
    }

    static {
        ocm ocmVarR = ocm.r("hardcoded value");
        f36694a = ocmVarR;
        f36695b = new ob4(ocmVarR, true);
        c = new ob4(ocmVarR, false);
        d = new gc4(ocmVarR);
        e = new mcm(ocmVarR, Collections.emptyList());
        f = ncm.B0(ocmVarR);
    }

    public static nb4 c(ClassLoader classLoader, String str, Callable<nb4> callable) {
        try {
            return h.f36703a.a(classLoader, str, callable);
        } catch (ExceptionInInitializerError e2) {
            throw wb4.b(e2);
        }
    }

    public static yb4 d() {
        try {
            return d.f36699a;
        } catch (ExceptionInInitializerError e2) {
            throw wb4.b(e2);
        }
    }

    public static nb4 e(ClassLoader classLoader) {
        return c(classLoader, "defaultReference", new a(classLoader));
    }

    public static mcm f(jc4 jc4Var) {
        return (jc4Var == null || jc4Var == f36694a) ? e : new mcm(jc4Var, Collections.emptyList());
    }

    public static g00 g(jc4 jc4Var) {
        return jc4Var == f36694a ? f : ncm.B0(jc4Var);
    }

    public static g00 h() {
        try {
            return e.f36700a;
        } catch (ExceptionInInitializerError e2) {
            throw wb4.b(e2);
        }
    }

    public static h00 i(Object obj, jc4 jc4Var, gpa gpaVar) {
        if (jc4Var == null) {
            throw new ConfigException.BugOrBroken("origin not supposed to be null");
        }
        if (obj == null) {
            return jc4Var != f36694a ? new gc4(jc4Var) : d;
        }
        if (obj instanceof Boolean) {
            if (jc4Var != f36694a) {
                return new ob4(jc4Var, ((Boolean) obj).booleanValue());
            }
            return ((Boolean) obj).booleanValue() ? f36695b : c;
        }
        if (obj instanceof String) {
            return new qc4(jc4Var, (String) obj);
        }
        if (obj instanceof Number) {
            if (obj instanceof Double) {
                return new sb4(jc4Var, ((Double) obj).doubleValue(), null);
            }
            if (obj instanceof Integer) {
                return new cc4(jc4Var, ((Integer) obj).intValue(), null);
            }
            return obj instanceof Long ? new ec4(jc4Var, ((Long) obj).longValue(), null) : hc4.k0(jc4Var, ((Number) obj).doubleValue(), null);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof Iterable)) {
                throw new ConfigException.BugOrBroken("bug in method caller: not valid to create ConfigValue from: " + obj);
            }
            Iterator it = ((Iterable) obj).iterator();
            if (!it.hasNext()) {
                return f(jc4Var);
            }
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                arrayList.add(i(it.next(), jc4Var, gpaVar));
            }
            return new mcm(jc4Var, arrayList);
        }
        Map map = (Map) obj;
        if (map.isEmpty()) {
            return g(jc4Var);
        }
        if (gpaVar != gpa.KEYS_ARE_KEYS) {
            return kdi.b(jc4Var, map);
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (!(key instanceof String)) {
                throw new ConfigException.BugOrBroken("bug in method caller: not valid to create ConfigObject from map with non-String key: " + key);
            }
            map2.put((String) key, i(entry.getValue(), jc4Var, gpaVar));
        }
        return new ncm(jc4Var, map2);
    }

    public static Properties j() {
        Properties properties = System.getProperties();
        Properties properties2 = new Properties();
        synchronized (properties) {
            properties2.putAll(properties);
        }
        return properties2;
    }

    public static ConfigException.NotResolved k(qlh qlhVar, ConfigException.NotResolved notResolved) {
        String str = qlhVar.k() + " has not been resolved, you need to call Config#resolve(), see API docs for Config#resolve()";
        return str.equals(notResolved.getMessage()) ? notResolved : new ConfigException.NotResolved(str, notResolved);
    }

    public static g00 l() {
        Map<String, String> map = System.getenv();
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            map2.put(key, new qc4(ocm.r("env var " + key), entry.getValue()));
        }
        return new ncm(ocm.r("env variables"), map2, iqk.RESOLVED, false);
    }

    public static g00 m() {
        return (g00) skh.n(j(), lc4.b().k("system properties")).r();
    }

    public static ic4 n(File file, lc4 lc4Var) {
        return wcm.g(new f(), file.getPath(), lc4Var);
    }

    public static ic4 o(String str, lc4 lc4Var) {
        return wcm.g(new b(), str, lc4Var);
    }

    public static nb4 p() {
        return q().r();
    }

    public static g00 q() {
        try {
            return i.f36704a;
        } catch (ExceptionInInitializerError e2) {
            throw wb4.b(e2);
        }
    }

    public static void r(String str) {
        System.err.println(str);
    }

    public static boolean s() {
        try {
            return c.b();
        } catch (ExceptionInInitializerError e2) {
            throw wb4.b(e2);
        }
    }
}
