package v83;

import androidx.room.a0;
import i3.e5;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public class v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v f176271f = new v();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f176272g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<v83.b> f176273a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<t> f176274b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<x> f176275c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<v83.a> f176276d = new AtomicReference<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference<w> f176277e = new AtomicReference<>();

    public static class a extends v83.b {
    }

    public class b extends v83.a {
        public b(v vVar) {
        }
    }

    public static Object d(Class<?> cls, Properties properties) {
        Properties properties2 = (Properties) properties.clone();
        String simpleName = cls.getSimpleName();
        String property = properties2.getProperty("rxjava.plugin." + simpleName + ".implementation");
        if (property == null) {
            for (Map.Entry entry : properties2.entrySet()) {
                String string = entry.getKey().toString();
                if (string.startsWith("rxjava.plugin.") && string.endsWith(".class") && simpleName.equals(entry.getValue().toString())) {
                    String strM = am.j.m("rxjava.plugin.", string.substring(0, string.length() - 6).substring(14), ".impl");
                    String property2 = properties2.getProperty(strM);
                    if (property2 != null) {
                        property = property2;
                        break;
                    }
                    vb.h.z(a0.j("Implementing class declaration for ", simpleName, " missing: ", strM));
                    return null;
                }
            }
        }
        if (property == null) {
            return null;
        }
        try {
            return Class.forName(property).asSubclass(cls).newInstance();
        } catch (ClassCastException e4) {
            com.airbnb.lottie.animation.keyframe.a.x(j20.x.d(simpleName, " implementation is not an instance of ", simpleName, ": ", property), e4);
            return null;
        } catch (ClassNotFoundException e14) {
            com.airbnb.lottie.animation.keyframe.a.x(e5.g(simpleName, " implementation class not found: ", property), e14);
            return null;
        } catch (IllegalAccessException e15) {
            com.airbnb.lottie.animation.keyframe.a.x(e5.g(simpleName, " implementation not able to be accessed: ", property), e15);
            return null;
        } catch (InstantiationException e16) {
            com.airbnb.lottie.animation.keyframe.a.x(e5.g(simpleName, " implementation not able to be instantiated: ", property), e16);
            return null;
        }
    }

    public final v83.a a() {
        AtomicReference<v83.a> atomicReference = this.f176276d;
        if (atomicReference.get() == null) {
            Object objD = d(v83.a.class, System.getProperties());
            if (objD == null) {
                b bVar = new b(this);
                while (!atomicReference.compareAndSet(null, bVar) && atomicReference.get() == null) {
                }
            } else {
                v83.a aVar = (v83.a) objD;
                while (!atomicReference.compareAndSet(null, aVar) && atomicReference.get() == null) {
                }
            }
        }
        return atomicReference.get();
    }

    public final v83.b b() {
        AtomicReference<v83.b> atomicReference = this.f176273a;
        if (atomicReference.get() == null) {
            Object objD = d(v83.b.class, System.getProperties());
            if (objD == null) {
                while (!atomicReference.compareAndSet(null, f176272g) && atomicReference.get() == null) {
                }
            } else {
                v83.b bVar = (v83.b) objD;
                while (!atomicReference.compareAndSet(null, bVar) && atomicReference.get() == null) {
                }
            }
        }
        return atomicReference.get();
    }

    public final t c() {
        AtomicReference<t> atomicReference = this.f176274b;
        if (atomicReference.get() == null) {
            Object objD = d(t.class, System.getProperties());
            if (objD == null) {
                u uVar = u.f176270a;
                while (!atomicReference.compareAndSet(null, uVar) && atomicReference.get() == null) {
                }
            } else {
                t tVar = (t) objD;
                while (!atomicReference.compareAndSet(null, tVar) && atomicReference.get() == null) {
                }
            }
        }
        return atomicReference.get();
    }

    public final w e() {
        AtomicReference<w> atomicReference = this.f176277e;
        if (atomicReference.get() == null) {
            Object objD = d(w.class, System.getProperties());
            if (objD == null) {
                w wVar = w.f176278a;
                while (!atomicReference.compareAndSet(null, wVar) && atomicReference.get() == null) {
                }
            } else {
                w wVar2 = (w) objD;
                while (!atomicReference.compareAndSet(null, wVar2) && atomicReference.get() == null) {
                }
            }
        }
        return atomicReference.get();
    }

    public final x f() {
        AtomicReference<x> atomicReference = this.f176275c;
        if (atomicReference.get() == null) {
            Object objD = d(x.class, System.getProperties());
            if (objD == null) {
                y yVar = y.f176279a;
                while (!atomicReference.compareAndSet(null, yVar) && atomicReference.get() == null) {
                }
            } else {
                x xVar = (x) objD;
                while (!atomicReference.compareAndSet(null, xVar) && atomicReference.get() == null) {
                }
            }
        }
        return atomicReference.get();
    }
}
