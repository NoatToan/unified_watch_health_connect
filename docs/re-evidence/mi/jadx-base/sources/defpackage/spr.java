package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class spr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f33871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public he f33872b;
    public static final ee c = new ee("2.5.29.9");
    public static final ee d = new ee("2.5.29.14");
    public static final ee e = new ee("2.5.29.15");
    public static final ee f = new ee("2.5.29.16");
    public static final ee g = new ee("2.5.29.17");
    public static final ee h = new ee("2.5.29.18");
    public static final ee i = new ee("2.5.29.19");
    public static final ee j = new ee("2.5.29.20");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ee f33869k = new ee("2.5.29.21");
    public static final ee l = new ee("2.5.29.23");
    public static final ee m = new ee("2.5.29.24");
    public static final ee n = new ee("2.5.29.27");
    public static final ee o = new ee("2.5.29.28");
    public static final ee p = new ee("2.5.29.29");
    public static final ee q = new ee("2.5.29.30");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ee f33870r = new ee("2.5.29.31");
    public static final ee s = new ee("2.5.29.32");
    public static final ee t = new ee("2.5.29.33");
    public static final ee u = new ee("2.5.29.35");
    public static final ee v = new ee("2.5.29.36");
    public static final ee w = new ee("2.5.29.37");
    public static final ee x = new ee("2.5.29.46");
    public static final ee y = new ee("2.5.29.54");
    public static final ee z = new ee("1.3.6.1.5.5.7.1.1");
    public static final ee A = new ee("1.3.6.1.5.5.7.1.11");
    public static final ee B = new ee("1.3.6.1.5.5.7.1.12");
    public static final ee C = new ee("1.3.6.1.5.5.7.1.2");
    public static final ee D = new ee("1.3.6.1.5.5.7.1.3");
    public static final ee E = new ee("1.3.6.1.5.5.7.1.4");
    public static final ee F = new ee("2.5.29.56");
    public static final ee G = new ee("2.5.29.55");

    public static re a(spr sprVar) throws IllegalArgumentException {
        try {
            return re.j(sprVar.b().r());
        } catch (IOException e2) {
            throw new IllegalArgumentException("can't convert extension: " + e2);
        }
    }

    public he b() {
        return this.f33872b;
    }

    public boolean c() {
        return this.f33871a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof spr)) {
            return false;
        }
        spr sprVar = (spr) obj;
        return sprVar.b().equals(b()) && sprVar.c() == c();
    }

    public int hashCode() {
        return c() ? b().hashCode() : ~b().hashCode();
    }
}
