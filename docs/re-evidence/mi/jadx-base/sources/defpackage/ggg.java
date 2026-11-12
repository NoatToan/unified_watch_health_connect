package defpackage;

import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public class ggg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Hashtable f18956a = new Hashtable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Hashtable f18957b = new Hashtable();

    static {
        a("B-571", e7l.F);
        a("B-409", e7l.D);
        a("B-283", e7l.n);
        a("B-233", e7l.t);
        a("B-163", e7l.l);
        a("K-571", e7l.E);
        a("K-409", e7l.C);
        a("K-283", e7l.m);
        a("K-233", e7l.s);
        a("K-163", e7l.f16348b);
        a("P-521", e7l.B);
        a("P-384", e7l.A);
        a("P-256", e7l.H);
        a("P-224", e7l.z);
        a("P-192", e7l.G);
    }

    public static void a(String str, ee eeVar) {
        f18956a.put(str, eeVar);
        f18957b.put(eeVar, str);
    }

    public static iqr b(String str) {
        ee eeVar = (ee) f18956a.get(olo.i(str));
        if (eeVar != null) {
            return c(eeVar);
        }
        return null;
    }

    public static iqr c(ee eeVar) {
        return b7l.i(eeVar);
    }

    public static String d(ee eeVar) {
        return (String) f18957b.get(eeVar);
    }

    public static ee e(String str) {
        return (ee) f18956a.get(olo.i(str));
    }
}
