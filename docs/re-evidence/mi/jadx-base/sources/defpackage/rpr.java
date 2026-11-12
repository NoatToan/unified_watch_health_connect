package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class rpr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f32777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ge f32778b;
    public static final fe c = new fe("2.5.29.9");
    public static final fe d = new fe("2.5.29.14");
    public static final fe e = new fe("2.5.29.15");
    public static final fe f = new fe("2.5.29.16");
    public static final fe g = new fe("2.5.29.17");
    public static final fe h = new fe("2.5.29.18");
    public static final fe i = new fe("2.5.29.19");
    public static final fe j = new fe("2.5.29.20");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final fe f32775k = new fe("2.5.29.21");
    public static final fe l = new fe("2.5.29.23");
    public static final fe m = new fe("2.5.29.24");
    public static final fe n = new fe("2.5.29.27");
    public static final fe o = new fe("2.5.29.28");
    public static final fe p = new fe("2.5.29.29");
    public static final fe q = new fe("2.5.29.30");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final fe f32776r = new fe("2.5.29.31");
    public static final fe s = new fe("2.5.29.32");
    public static final fe t = new fe("2.5.29.33");
    public static final fe u = new fe("2.5.29.35");
    public static final fe v = new fe("2.5.29.36");
    public static final fe w = new fe("2.5.29.37");
    public static final fe x = new fe("2.5.29.46");
    public static final fe y = new fe("2.5.29.54");
    public static final fe z = new fe("1.3.6.1.5.5.7.1.1");
    public static final fe A = new fe("1.3.6.1.5.5.7.1.11");
    public static final fe B = new fe("1.3.6.1.5.5.7.1.12");
    public static final fe C = new fe("1.3.6.1.5.5.7.1.2");
    public static final fe D = new fe("1.3.6.1.5.5.7.1.3");
    public static final fe E = new fe("1.3.6.1.5.5.7.1.4");
    public static final fe F = new fe("2.5.29.56");
    public static final fe G = new fe("2.5.29.55");

    public static pe a(rpr rprVar) throws IllegalArgumentException {
        try {
            return pe.j(rprVar.b().r());
        } catch (IOException e2) {
            throw new IllegalArgumentException("can't convert extension: " + e2);
        }
    }

    public ge b() {
        return this.f32778b;
    }

    public boolean c() {
        return this.f32777a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof rpr)) {
            return false;
        }
        rpr rprVar = (rpr) obj;
        return rprVar.b().equals(b()) && rprVar.c() == c();
    }

    public int hashCode() {
        return c() ? b().hashCode() : ~b().hashCode();
    }
}
