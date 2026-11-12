package defpackage;

import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public class fgg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Hashtable f17763a = new Hashtable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Hashtable f17764b = new Hashtable();

    static {
        a("B-163", d7l.l);
        a("B-233", d7l.t);
        a("B-283", d7l.n);
        a("B-409", d7l.D);
        a("B-571", d7l.F);
        a("K-163", d7l.f15190b);
        a("K-233", d7l.s);
        a("K-283", d7l.m);
        a("K-409", d7l.C);
        a("K-571", d7l.E);
        a("P-192", d7l.G);
        a("P-224", d7l.z);
        a("P-256", d7l.H);
        a("P-384", d7l.A);
        a("P-521", d7l.B);
    }

    public static void a(String str, fe feVar) {
        f17763a.put(str.toUpperCase(), feVar);
        f17764b.put(feVar, str);
    }

    public static hqr b(String str) {
        fe feVarE = e(str);
        if (feVarE == null) {
            return null;
        }
        return c(feVarE);
    }

    public static hqr c(fe feVar) {
        return c7l.i(feVar);
    }

    public static String d(fe feVar) {
        return (String) f17764b.get(feVar);
    }

    public static fe e(String str) {
        return (fe) f17763a.get(plo.i(str));
    }
}
