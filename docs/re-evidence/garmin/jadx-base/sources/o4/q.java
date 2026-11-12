package o4;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lo4/q;", "", "a", "value", "", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f128955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f128930b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f128931c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f128932d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f128933e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f128934f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f128935g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f128936h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f128937i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f128938j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f128939k = 9;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f128940l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f128941m = 11;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f128942n = 12;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f128943o = 13;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f128944p = 14;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f128945q = 15;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f128946r = 16;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f128947s = 17;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f128948t = 18;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f128949u = 19;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f128950v = 20;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f128951w = 21;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f128952x = 22;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f128953y = 23;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f128954z = 24;
    public static final int A = 25;
    public static final int B = 26;
    public static final int C = 27;
    public static final int D = 28;

    private /* synthetic */ q(int i14) {
        this.f128955a = i14;
    }

    public static final /* synthetic */ q a(int i14) {
        return new q(i14);
    }

    public static String b(int i14) {
        if (i14 == 0) {
            return "Clear";
        }
        if (i14 == f128931c) {
            return "Src";
        }
        if (i14 == f128932d) {
            return "Dst";
        }
        if (i14 == f128933e) {
            return "SrcOver";
        }
        if (i14 == f128934f) {
            return "DstOver";
        }
        if (i14 == f128935g) {
            return "SrcIn";
        }
        if (i14 == f128936h) {
            return "DstIn";
        }
        if (i14 == f128937i) {
            return "SrcOut";
        }
        if (i14 == f128938j) {
            return "DstOut";
        }
        if (i14 == f128939k) {
            return "SrcAtop";
        }
        if (i14 == f128940l) {
            return "DstAtop";
        }
        if (i14 == f128941m) {
            return "Xor";
        }
        if (i14 == f128942n) {
            return "Plus";
        }
        if (i14 == f128943o) {
            return "Modulate";
        }
        if (i14 == f128944p) {
            return "Screen";
        }
        if (i14 == f128945q) {
            return "Overlay";
        }
        if (i14 == f128946r) {
            return "Darken";
        }
        if (i14 == f128947s) {
            return "Lighten";
        }
        if (i14 == f128948t) {
            return "ColorDodge";
        }
        if (i14 == f128949u) {
            return "ColorBurn";
        }
        if (i14 == f128950v) {
            return "HardLight";
        }
        if (i14 == f128951w) {
            return "Softlight";
        }
        if (i14 == f128952x) {
            return "Difference";
        }
        if (i14 == f128953y) {
            return "Exclusion";
        }
        if (i14 == f128954z) {
            return "Multiply";
        }
        if (i14 == A) {
            return "Hue";
        }
        if (i14 == B) {
            return "Saturation";
        }
        if (i14 == C) {
            return "Color";
        }
        return i14 == D ? "Luminosity" : "Unknown";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f128955a == ((q) obj).f128955a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f128955a);
    }

    public final String toString() {
        return b(this.f128955a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo4/q$a;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
