package w6;

import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class r implements Comparable<r> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String[] f182994r = {ModelSourceWrapper.POSITION, "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o6.c f182995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f182996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f182997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f182998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f182999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f183000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f183001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f183002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f183003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f183004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f183005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f183006l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n f183007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashMap<String, androidx.constraintlayout.widget.a> f183008n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f183009o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double[] f183010p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double[] f183011q;

    public r(int i14, int i15, h hVar, r rVar, r rVar2) {
        float fMin;
        float fA;
        this.f182996b = 0;
        this.f183003i = Float.NaN;
        this.f183004j = -1;
        this.f183005k = -1;
        this.f183006l = Float.NaN;
        this.f183007m = null;
        this.f183008n = new LinkedHashMap<>();
        this.f183009o = 0;
        this.f183010p = new double[18];
        this.f183011q = new double[18];
        if (rVar.f183005k != -1) {
            float f14 = hVar.f182778a / 100.0f;
            this.f182997c = f14;
            this.f182996b = hVar.f182822h;
            this.f183009o = hVar.f182829o;
            float f15 = Float.isNaN(hVar.f182823i) ? f14 : hVar.f182823i;
            float f16 = Float.isNaN(hVar.f182824j) ? f14 : hVar.f182824j;
            float f17 = rVar2.f183001g;
            float f18 = rVar.f183001g;
            float f19 = rVar2.f183002h;
            float f22 = rVar.f183002h;
            this.f182998d = this.f182997c;
            this.f183001g = (int) (((f17 - f18) * f15) + f18);
            this.f183002h = (int) (((f19 - f22) * f16) + f22);
            int i16 = hVar.f182829o;
            float f24 = hVar.f182825k;
            if (i16 != 2) {
                float f25 = Float.isNaN(f24) ? f14 : hVar.f182825k;
                float f26 = rVar2.f182999e;
                float f27 = rVar.f182999e;
                this.f182999e = j20.x.a(f26, f27, f25, f27);
                f14 = Float.isNaN(hVar.f182826l) ? f14 : hVar.f182826l;
                float f28 = rVar2.f183000f;
                float f29 = rVar.f183000f;
                this.f183000f = j20.x.a(f28, f29, f14, f29);
            } else {
                if (Float.isNaN(f24)) {
                    float f34 = rVar2.f182999e;
                    float f35 = rVar.f182999e;
                    fMin = j20.x.a(f34, f35, f14, f35);
                } else {
                    fMin = Math.min(f16, f15) * hVar.f182825k;
                }
                this.f182999e = fMin;
                if (Float.isNaN(hVar.f182826l)) {
                    float f36 = rVar2.f183000f;
                    float f37 = rVar.f183000f;
                    fA = j20.x.a(f36, f37, f14, f37);
                } else {
                    fA = hVar.f182826l;
                }
                this.f183000f = fA;
            }
            this.f183005k = rVar.f183005k;
            this.f182995a = o6.c.c(hVar.f182820f);
            this.f183004j = hVar.f182821g;
            return;
        }
        int i17 = hVar.f182829o;
        if (i17 == 1) {
            float f38 = hVar.f182778a / 100.0f;
            this.f182997c = f38;
            this.f182996b = hVar.f182822h;
            float f39 = Float.isNaN(hVar.f182823i) ? f38 : hVar.f182823i;
            float f44 = Float.isNaN(hVar.f182824j) ? f38 : hVar.f182824j;
            float f45 = rVar2.f183001g - rVar.f183001g;
            float f46 = rVar2.f183002h - rVar.f183002h;
            this.f182998d = this.f182997c;
            f38 = Float.isNaN(hVar.f182825k) ? f38 : hVar.f182825k;
            float f47 = rVar.f182999e;
            float f48 = rVar.f183001g;
            float f49 = rVar.f183000f;
            float f50 = rVar.f183002h;
            float f54 = f38;
            float f55 = ((rVar2.f183001g / 2.0f) + rVar2.f182999e) - ((f48 / 2.0f) + f47);
            float f56 = ((rVar2.f183002h / 2.0f) + rVar2.f183000f) - ((f50 / 2.0f) + f49);
            float f57 = f55 * f54;
            float f58 = f45 * f39;
            float f59 = f58 / 2.0f;
            this.f182999e = (int) ((f47 + f57) - f59);
            float f64 = f56 * f54;
            float f65 = f46 * f44;
            float f66 = f65 / 2.0f;
            this.f183000f = (int) ((f49 + f64) - f66);
            this.f183001g = (int) (f48 + f58);
            this.f183002h = (int) (f50 + f65);
            float f67 = Float.isNaN(hVar.f182826l) ? 0.0f : hVar.f182826l;
            this.f183009o = 1;
            float f68 = (int) ((rVar.f182999e + f57) - f59);
            float f69 = (int) ((rVar.f183000f + f64) - f66);
            this.f182999e = f68 + ((-f56) * f67);
            this.f183000f = f69 + (f55 * f67);
            this.f183005k = this.f183005k;
            this.f182995a = o6.c.c(hVar.f182820f);
            this.f183004j = hVar.f182821g;
            return;
        }
        if (i17 == 2) {
            float f74 = hVar.f182778a / 100.0f;
            this.f182997c = f74;
            this.f182996b = hVar.f182822h;
            float f75 = Float.isNaN(hVar.f182823i) ? f74 : hVar.f182823i;
            float f76 = Float.isNaN(hVar.f182824j) ? f74 : hVar.f182824j;
            float f77 = rVar2.f183001g;
            float f78 = rVar.f183001g;
            float f79 = f77 - f78;
            float f84 = rVar2.f183002h;
            float f85 = rVar.f183002h;
            float f86 = f84 - f85;
            this.f182998d = this.f182997c;
            float f87 = rVar.f182999e;
            float f88 = rVar.f183000f;
            float f89 = (f77 / 2.0f) + rVar2.f182999e;
            float f93 = (f84 / 2.0f) + rVar2.f183000f;
            float f94 = f79 * f75;
            this.f182999e = (int) ((((f89 - ((f78 / 2.0f) + f87)) * f74) + f87) - (f94 / 2.0f));
            float f95 = f86 * f76;
            this.f183000f = (int) ((((f93 - ((f85 / 2.0f) + f88)) * f74) + f88) - (f95 / 2.0f));
            this.f183001g = (int) (f78 + f94);
            this.f183002h = (int) (f85 + f95);
            this.f183009o = 2;
            if (!Float.isNaN(hVar.f182825k)) {
                this.f182999e = (int) (hVar.f182825k * (i14 - ((int) this.f183001g)));
            }
            if (!Float.isNaN(hVar.f182826l)) {
                this.f183000f = (int) (hVar.f182826l * (i15 - ((int) this.f183002h)));
            }
            this.f183005k = this.f183005k;
            this.f182995a = o6.c.c(hVar.f182820f);
            this.f183004j = hVar.f182821g;
            return;
        }
        int i18 = hVar.f182778a;
        if (i17 != 3) {
            float f96 = i18 / 100.0f;
            this.f182997c = f96;
            this.f182996b = hVar.f182822h;
            float f97 = Float.isNaN(hVar.f182823i) ? f96 : hVar.f182823i;
            float f98 = Float.isNaN(hVar.f182824j) ? f96 : hVar.f182824j;
            float f99 = rVar2.f183001g;
            float f100 = rVar.f183001g;
            float f101 = f99 - f100;
            float f102 = rVar2.f183002h;
            float f103 = rVar.f183002h;
            float f104 = f102 - f103;
            this.f182998d = this.f182997c;
            float f105 = rVar.f182999e;
            float f106 = rVar.f183000f;
            float f107 = ((f99 / 2.0f) + rVar2.f182999e) - ((f100 / 2.0f) + f105);
            float f108 = ((f102 / 2.0f) + rVar2.f183000f) - ((f103 / 2.0f) + f106);
            float f109 = f101 * f97;
            float f110 = f109 / 2.0f;
            this.f182999e = (int) (((f107 * f96) + f105) - f110);
            float f111 = f104 * f98;
            float f112 = f111 / 2.0f;
            this.f183000f = (int) (((f108 * f96) + f106) - f112);
            this.f183001g = (int) (f100 + f109);
            this.f183002h = (int) (f103 + f111);
            float f113 = Float.isNaN(hVar.f182825k) ? f96 : hVar.f182825k;
            float f114 = Float.isNaN(hVar.f182828n) ? 0.0f : hVar.f182828n;
            f96 = Float.isNaN(hVar.f182826l) ? f96 : hVar.f182826l;
            float f115 = Float.isNaN(hVar.f182827m) ? 0.0f : hVar.f182827m;
            this.f183009o = 0;
            this.f182999e = (int) (((f115 * f108) + ((f113 * f107) + rVar.f182999e)) - f110);
            this.f183000f = (int) (((f108 * f96) + ((f107 * f114) + rVar.f183000f)) - f112);
            this.f182995a = o6.c.c(hVar.f182820f);
            this.f183004j = hVar.f182821g;
            return;
        }
        float f116 = i18 / 100.0f;
        this.f182997c = f116;
        this.f182996b = hVar.f182822h;
        float f117 = Float.isNaN(hVar.f182823i) ? f116 : hVar.f182823i;
        float f118 = Float.isNaN(hVar.f182824j) ? f116 : hVar.f182824j;
        float f119 = rVar2.f183001g;
        float f120 = rVar.f183001g;
        float f121 = f119 - f120;
        float f122 = rVar2.f183002h;
        float f123 = rVar.f183002h;
        float f124 = f122 - f123;
        this.f182998d = this.f182997c;
        float f125 = rVar.f182999e;
        float f126 = (f120 / 2.0f) + f125;
        float f127 = rVar.f183000f;
        float f128 = (f123 / 2.0f) + f127;
        float f129 = (f119 / 2.0f) + rVar2.f182999e;
        float f130 = (f122 / 2.0f) + rVar2.f183000f;
        if (f126 > f129) {
            f126 = f129;
            f129 = f126;
        }
        if (f128 <= f130) {
            f128 = f130;
            f130 = f128;
        }
        float f131 = f129 - f126;
        float f132 = f128 - f130;
        float f133 = f121 * f117;
        float f134 = f133 / 2.0f;
        this.f182999e = (int) (((f131 * f116) + f125) - f134);
        float f135 = f124 * f118;
        float f136 = f135 / 2.0f;
        this.f183000f = (int) (((f132 * f116) + f127) - f136);
        this.f183001g = (int) (f120 + f133);
        this.f183002h = (int) (f123 + f135);
        float f137 = Float.isNaN(hVar.f182825k) ? f116 : hVar.f182825k;
        float f138 = Float.isNaN(hVar.f182828n) ? 0.0f : hVar.f182828n;
        float f139 = Float.isNaN(hVar.f182826l) ? f116 : hVar.f182826l;
        float f140 = Float.isNaN(hVar.f182827m) ? 0.0f : hVar.f182827m;
        this.f183009o = 0;
        this.f182999e = (int) (((f140 * f132) + ((f137 * f131) + rVar.f182999e)) - f134);
        this.f183000f = (int) (((f132 * f139) + ((f131 * f138) + rVar.f183000f)) - f136);
        this.f182995a = o6.c.c(hVar.f182820f);
        this.f183004j = hVar.f182821g;
    }

    public static boolean b(float f14, float f15) {
        if (Float.isNaN(f14) || Float.isNaN(f15)) {
            return Float.isNaN(f14) != Float.isNaN(f15);
        }
        return Math.abs(f14 - f15) > 1.0E-6f;
    }

    public static void e(float f14, float f15, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            float f22 = (float) dArr[i14];
            double d14 = dArr2[i14];
            int i15 = iArr[i14];
            if (i15 == 1) {
                f16 = f22;
            } else if (i15 == 2) {
                f18 = f22;
            } else if (i15 == 3) {
                f17 = f22;
            } else if (i15 == 4) {
                f19 = f22;
            }
        }
        float f24 = f16 - ((0.0f * f17) / 2.0f);
        float f25 = f18 - ((0.0f * f19) / 2.0f);
        fArr[0] = (((f17 * 1.0f) + f24) * f14) + ((1.0f - f14) * f24) + 0.0f;
        fArr[1] = (((f19 * 1.0f) + f25) * f15) + ((1.0f - f15) * f25) + 0.0f;
    }

    public final void a(androidx.constraintlayout.widget.d.a aVar) {
        int iOrdinal;
        this.f182995a = o6.c.c(aVar.f6202d.f6266d);
        androidx.constraintlayout.widget.d.c cVar = aVar.f6202d;
        this.f183004j = cVar.f6267e;
        this.f183005k = cVar.f6264b;
        this.f183003i = cVar.f6270h;
        this.f182996b = cVar.f6268f;
        float f14 = aVar.f6201c.f6280e;
        this.f183006l = aVar.f6203e.C;
        for (String str : aVar.f6205g.keySet()) {
            androidx.constraintlayout.widget.a aVar2 = aVar.f6205g.get(str);
            if (aVar2 != null && (iOrdinal = aVar2.f6151c.ordinal()) != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.f183008n.put(str, aVar2);
            }
        }
    }

    public final void c(double d14, int[] iArr, double[] dArr, float[] fArr, int i14) {
        float fSin = this.f182999e;
        float fCos = this.f183000f;
        float f14 = this.f183001g;
        float f15 = this.f183002h;
        for (int i15 = 0; i15 < iArr.length; i15++) {
            float f16 = (float) dArr[i15];
            int i16 = iArr[i15];
            if (i16 == 1) {
                fSin = f16;
            } else if (i16 == 2) {
                fCos = f16;
            } else if (i16 == 3) {
                f14 = f16;
            } else if (i16 == 4) {
                f15 = f16;
            }
        }
        n nVar = this.f183007m;
        if (nVar != null) {
            float[] fArr2 = new float[2];
            nVar.b(d14, fArr2, new float[2]);
            float f17 = fArr2[0];
            float f18 = fArr2[1];
            double d15 = f17;
            double d16 = fSin;
            double d17 = fCos;
            fSin = (float) (((Math.sin(d17) * d16) + d15) - ((double) (f14 / 2.0f)));
            fCos = (float) ((((double) f18) - (Math.cos(d17) * d16)) - ((double) (f15 / 2.0f)));
        }
        fArr[i14] = (f14 / 2.0f) + fSin + 0.0f;
        fArr[i14 + 1] = (f15 / 2.0f) + fCos + 0.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(r rVar) {
        return Float.compare(this.f182998d, rVar.f182998d);
    }

    public final void d(float f14, float f15, float f16, float f17) {
        this.f182999e = f14;
        this.f183000f = f15;
        this.f183001g = f16;
        this.f183002h = f17;
    }

    public final void f(n nVar, r rVar) {
        double d14 = (((this.f183001g / 2.0f) + this.f182999e) - rVar.f182999e) - (rVar.f183001g / 2.0f);
        double d15 = (((this.f183002h / 2.0f) + this.f183000f) - rVar.f183000f) - (rVar.f183002h / 2.0f);
        this.f183007m = nVar;
        this.f182999e = (float) Math.hypot(d15, d14);
        if (Float.isNaN(this.f183006l)) {
            this.f183000f = (float) (Math.atan2(d15, d14) + 1.5707963267948966d);
        } else {
            this.f183000f = (float) Math.toRadians(this.f183006l);
        }
    }

    public r() {
        this.f182996b = 0;
        this.f183003i = Float.NaN;
        this.f183004j = -1;
        this.f183005k = -1;
        this.f183006l = Float.NaN;
        this.f183007m = null;
        this.f183008n = new LinkedHashMap<>();
        this.f183009o = 0;
        this.f183010p = new double[18];
        this.f183011q = new double[18];
    }
}
