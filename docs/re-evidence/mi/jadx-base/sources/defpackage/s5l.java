package defpackage;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class s5l {
    public static final s5l f = new s5l();
    public static final o5l g = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<o5l> f33327a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<q5l> f33328b = new AtomicReference<>();
    public final AtomicReference<v5l> c = new AtomicReference<>();
    public final AtomicReference<n5l> d = new AtomicReference<>();
    public final AtomicReference<u5l> e = new AtomicReference<>();

    public class a extends n5l {
        public a() {
        }
    }

    public static class b extends o5l {
    }

    @Deprecated
    public static s5l c() {
        return f;
    }

    public static Object e(Class<?> cls, Properties properties) {
        Properties properties2 = (Properties) properties.clone();
        String simpleName = cls.getSimpleName();
        String property = properties2.getProperty("rxjava.plugin." + simpleName + ".implementation");
        if (property == null) {
            for (Map.Entry entry : properties2.entrySet()) {
                String string = entry.getKey().toString();
                if (string.startsWith("rxjava.plugin.") && string.endsWith(".class") && simpleName.equals(entry.getValue().toString())) {
                    String str = "rxjava.plugin." + string.substring(0, string.length() - 6).substring(14) + ".impl";
                    String property2 = properties2.getProperty(str);
                    if (property2 != null) {
                        property = property2;
                        break;
                    }
                    throw new IllegalStateException("Implementing class declaration for " + simpleName + " missing: " + str);
                }
            }
        }
        if (property == null) {
            return null;
        }
        try {
            return Class.forName(property).asSubclass(cls).newInstance();
        } catch (ClassCastException e) {
            throw new IllegalStateException(simpleName + " implementation is not an instance of " + simpleName + ": " + property, e);
        } catch (ClassNotFoundException e2) {
            throw new IllegalStateException(simpleName + " implementation class not found: " + property, e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(simpleName + " implementation not able to be accessed: " + property, e3);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(simpleName + " implementation not able to be instantiated: " + property, e4);
        }
    }

    public n5l a() {
        if (this.d.get() == null) {
            Object objE = e(n5l.class, System.getProperties());
            if (objE == null) {
                d8i.a(this.d, null, new a());
            } else {
                d8i.a(this.d, null, (n5l) objE);
            }
        }
        return this.d.get();
    }

    public o5l b() {
        if (this.f33327a.get() == null) {
            Object objE = e(o5l.class, System.getProperties());
            if (objE == null) {
                d8i.a(this.f33327a, null, g);
            } else {
                d8i.a(this.f33327a, null, (o5l) objE);
            }
        }
        return this.f33327a.get();
    }

    public q5l d() {
        if (this.f33328b.get() == null) {
            Object objE = e(q5l.class, System.getProperties());
            if (objE == null) {
                d8i.a(this.f33328b, null, r5l.f());
            } else {
                d8i.a(this.f33328b, null, (q5l) objE);
            }
        }
        return this.f33328b.get();
    }

    public u5l f() {
        if (this.e.get() == null) {
            Object objE = e(u5l.class, System.getProperties());
            if (objE == null) {
                d8i.a(this.e, null, u5l.h());
            } else {
                d8i.a(this.e, null, (u5l) objE);
            }
        }
        return this.e.get();
    }

    public v5l g() {
        if (this.c.get() == null) {
            Object objE = e(v5l.class, System.getProperties());
            if (objE == null) {
                d8i.a(this.c, null, w5l.f());
            } else {
                d8i.a(this.c, null, (v5l) objE);
            }
        }
        return this.c.get();
    }
}
