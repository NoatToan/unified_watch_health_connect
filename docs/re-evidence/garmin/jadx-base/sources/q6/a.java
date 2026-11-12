package q6;

import f5.y0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f143017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f143019b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f143020b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f143022c0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public y0 f143030g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public t6.e f143032h0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f143021c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f143023d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f143025e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f143027f = -1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f143029g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f143031h = 0.5f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f143033i = 0.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f143035j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f143037k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f143038l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f143039m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f143040n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f143041o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f143042p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f143043q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f143044r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f143045s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f143046t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f143047u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f143048v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f143049w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f143050x = Float.NaN;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f143051y = Float.NaN;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f143052z = Float.NaN;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public int I = 0;
    public Object J = null;
    public Object K = null;
    public Object L = null;
    public Object M = null;
    public Object N = null;
    public Object O = null;
    public Object P = null;
    public Object Q = null;
    public Object R = null;
    public Object S = null;
    public a T = null;
    public Object U = null;
    public Object V = null;
    public a W = null;
    public Object X = null;
    public Object Y = null;
    public Object Z = null;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Object f143018a0 = null;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public g.b f143024d0 = null;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public c f143026e0 = c.b();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public c f143028f0 = c.b();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final HashMap<String, Integer> f143034i0 = new HashMap<>();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public HashMap<String, Float> f143036j0 = new HashMap<>();

    /* JADX INFO: renamed from: q6.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C2690a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f143053a;

        static {
            int[] iArr = new int[g.b.values().length];
            f143053a = iArr;
            try {
                iArr[g.b.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f143053a[g.b.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f143053a[g.b.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f143053a[g.b.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f143053a[g.b.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f143053a[g.b.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f143053a[g.b.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f143053a[g.b.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f143053a[g.b.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f143053a[g.b.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f143053a[g.b.TOP_TO_BASELINE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f143053a[g.b.BOTTOM_TO_TOP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f143053a[g.b.BOTTOM_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f143053a[g.b.BOTTOM_TO_BASELINE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f143053a[g.b.BASELINE_TO_BOTTOM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f143053a[g.b.BASELINE_TO_TOP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f143053a[g.b.BASELINE_TO_BASELINE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f143053a[g.b.CIRCULAR_CONSTRAINT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f143053a[g.b.CENTER_HORIZONTALLY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f143053a[g.b.CENTER_VERTICALLY.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public a(g gVar) {
        this.f143019b = gVar;
    }

    @Override // q6.e
    public t6.e a() {
        if (this.f143032h0 == null) {
            t6.e eVar = new t6.e(this.f143026e0.f143076d, this.f143028f0.f143076d);
            this.f143032h0 = eVar;
            eVar.f162621j0 = this.f143030g0;
        }
        return this.f143032h0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, r6.e] */
    @Override // q6.e
    public void apply() {
        if (this.f143032h0 == null) {
            return;
        }
        ?? r14 = this.f143021c;
        if (r14 != 0) {
            r14.apply();
        }
        this.f143026e0.a(this.f143032h0, 0);
        this.f143028f0.a(this.f143032h0, 1);
        this.J = j(this.J);
        this.K = j(this.K);
        this.L = j(this.L);
        this.M = j(this.M);
        this.N = j(this.N);
        this.O = j(this.O);
        this.P = j(this.P);
        this.Q = j(this.Q);
        this.R = j(this.R);
        this.S = j(this.S);
        this.U = j(this.U);
        this.V = j(this.V);
        this.X = j(this.X);
        this.Y = j(this.Y);
        this.Z = j(this.Z);
        d(this.f143032h0, this.J, g.b.LEFT_TO_LEFT);
        d(this.f143032h0, this.K, g.b.LEFT_TO_RIGHT);
        d(this.f143032h0, this.L, g.b.RIGHT_TO_LEFT);
        d(this.f143032h0, this.M, g.b.RIGHT_TO_RIGHT);
        d(this.f143032h0, this.N, g.b.START_TO_START);
        d(this.f143032h0, this.O, g.b.START_TO_END);
        d(this.f143032h0, this.P, g.b.END_TO_START);
        d(this.f143032h0, this.Q, g.b.END_TO_END);
        d(this.f143032h0, this.R, g.b.TOP_TO_TOP);
        d(this.f143032h0, this.S, g.b.TOP_TO_BOTTOM);
        d(this.f143032h0, this.T, g.b.TOP_TO_BASELINE);
        d(this.f143032h0, this.U, g.b.BOTTOM_TO_TOP);
        d(this.f143032h0, this.V, g.b.BOTTOM_TO_BOTTOM);
        d(this.f143032h0, this.W, g.b.BOTTOM_TO_BASELINE);
        d(this.f143032h0, this.X, g.b.BASELINE_TO_BASELINE);
        d(this.f143032h0, this.Y, g.b.BASELINE_TO_TOP);
        d(this.f143032h0, this.Z, g.b.BASELINE_TO_BOTTOM);
        d(this.f143032h0, this.f143018a0, g.b.CIRCULAR_CONSTRAINT);
        int i14 = this.f143023d;
        if (i14 != 0) {
            this.f143032h0.f162629n0 = i14;
        }
        int i15 = this.f143025e;
        if (i15 != 0) {
            this.f143032h0.f162631o0 = i15;
        }
        float f14 = this.f143027f;
        if (f14 != -1.0f) {
            this.f143032h0.f162633p0[0] = f14;
        }
        float f15 = this.f143029g;
        if (f15 != -1.0f) {
            this.f143032h0.f162633p0[1] = f15;
        }
        t6.e eVar = this.f143032h0;
        eVar.f162617h0 = this.f143031h;
        eVar.f162619i0 = this.f143033i;
        h hVar = eVar.f162622k;
        hVar.f143144f = this.f143050x;
        hVar.f143145g = this.f143051y;
        hVar.f143146h = this.f143052z;
        hVar.f143147i = this.A;
        hVar.f143148j = this.B;
        hVar.f143149k = this.C;
        hVar.f143150l = this.D;
        hVar.f143151m = this.E;
        hVar.f143152n = this.G;
        hVar.f143153o = this.H;
        hVar.f143154p = this.F;
        int i16 = this.I;
        hVar.f143155q = i16;
        eVar.f162623k0 = i16;
        HashMap<String, Integer> map = this.f143034i0;
        if (map != null) {
            for (String str : map.keySet()) {
                Integer num = map.get(str);
                h hVar2 = this.f143032h0.f162622k;
                int iIntValue = num.intValue();
                HashMap<String, n6.a> map2 = hVar2.f143156r;
                if (map2.containsKey(str)) {
                    map2.get(str).f123792c = iIntValue;
                } else {
                    map2.put(str, new n6.a(str, 902, iIntValue));
                }
            }
        }
        HashMap<String, Float> map3 = this.f143036j0;
        if (map3 != null) {
            for (String str2 : map3.keySet()) {
                float fFloatValue = this.f143036j0.get(str2).floatValue();
                HashMap<String, n6.a> map4 = this.f143032h0.f162622k.f143156r;
                if (map4.containsKey(str2)) {
                    map4.get(str2).f123793d = fFloatValue;
                } else {
                    map4.put(str2, new n6.a(str2, 901, fFloatValue));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, r6.e] */
    @Override // q6.e
    public final r6.e b() {
        return this.f143021c;
    }

    @Override // q6.e
    public final void c(t6.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f143032h0 = eVar;
        eVar.f162621j0 = this.f143030g0;
    }

    public final void d(t6.e eVar, Object obj, g.b bVar) {
        t6.e eVarA = obj instanceof e ? ((e) obj).a() : null;
        if (eVarA == null) {
            return;
        }
        int[] iArr = C2690a.f143053a;
        int i14 = iArr[bVar.ordinal()];
        switch (iArr[bVar.ordinal()]) {
            case 1:
                t6.d.a aVar = t6.d.a.LEFT;
                eVar.k(aVar).b(eVarA.k(aVar), this.f143035j, this.f143042p, false);
                break;
            case 2:
                eVar.k(t6.d.a.LEFT).b(eVarA.k(t6.d.a.RIGHT), this.f143035j, this.f143042p, false);
                break;
            case 3:
                eVar.k(t6.d.a.RIGHT).b(eVarA.k(t6.d.a.LEFT), this.f143037k, this.f143043q, false);
                break;
            case 4:
                t6.d.a aVar2 = t6.d.a.RIGHT;
                eVar.k(aVar2).b(eVarA.k(aVar2), this.f143037k, this.f143043q, false);
                break;
            case 5:
                t6.d.a aVar3 = t6.d.a.LEFT;
                eVar.k(aVar3).b(eVarA.k(aVar3), this.f143038l, this.f143044r, false);
                break;
            case 6:
                eVar.k(t6.d.a.LEFT).b(eVarA.k(t6.d.a.RIGHT), this.f143038l, this.f143044r, false);
                break;
            case 7:
                eVar.k(t6.d.a.RIGHT).b(eVarA.k(t6.d.a.LEFT), this.f143039m, this.f143045s, false);
                break;
            case 8:
                t6.d.a aVar4 = t6.d.a.RIGHT;
                eVar.k(aVar4).b(eVarA.k(aVar4), this.f143039m, this.f143045s, false);
                break;
            case 9:
                t6.d.a aVar5 = t6.d.a.TOP;
                eVar.k(aVar5).b(eVarA.k(aVar5), this.f143040n, this.f143046t, false);
                break;
            case 10:
                eVar.k(t6.d.a.TOP).b(eVarA.k(t6.d.a.BOTTOM), this.f143040n, this.f143046t, false);
                break;
            case 11:
                eVar.x(t6.d.a.TOP, eVarA, t6.d.a.BASELINE, this.f143040n, this.f143046t);
                break;
            case 12:
                eVar.k(t6.d.a.BOTTOM).b(eVarA.k(t6.d.a.TOP), this.f143041o, this.f143047u, false);
                break;
            case 13:
                t6.d.a aVar6 = t6.d.a.BOTTOM;
                eVar.k(aVar6).b(eVarA.k(aVar6), this.f143041o, this.f143047u, false);
                break;
            case 14:
                eVar.x(t6.d.a.BOTTOM, eVarA, t6.d.a.BASELINE, this.f143041o, this.f143047u);
                break;
            case 15:
                eVar.x(t6.d.a.BASELINE, eVarA, t6.d.a.BOTTOM, this.f143048v, this.f143049w);
                break;
            case 16:
                eVar.x(t6.d.a.BASELINE, eVarA, t6.d.a.TOP, this.f143048v, this.f143049w);
                break;
            case 17:
                t6.d.a aVar7 = t6.d.a.BASELINE;
                eVar.x(aVar7, eVarA, aVar7, this.f143048v, this.f143049w);
                break;
            case 18:
                float f14 = this.f143020b0;
                int i15 = (int) this.f143022c0;
                eVar.getClass();
                t6.d.a aVar8 = t6.d.a.CENTER;
                eVar.x(aVar8, eVarA, aVar8, i15, 0);
                eVar.F = f14;
                break;
        }
    }

    public final void e(Object obj) {
        this.f143024d0 = g.b.BOTTOM_TO_BOTTOM;
        this.V = obj;
    }

    public final void f() {
        g.b bVar = this.f143024d0;
        if (bVar == null) {
            this.J = null;
            this.K = null;
            this.f143035j = 0;
            this.L = null;
            this.M = null;
            this.f143037k = 0;
            this.N = null;
            this.O = null;
            this.f143038l = 0;
            this.P = null;
            this.Q = null;
            this.f143039m = 0;
            this.R = null;
            this.S = null;
            this.f143040n = 0;
            this.U = null;
            this.V = null;
            this.f143041o = 0;
            this.X = null;
            this.f143018a0 = null;
            this.f143031h = 0.5f;
            this.f143033i = 0.5f;
            this.f143042p = 0;
            this.f143043q = 0;
            this.f143044r = 0;
            this.f143045s = 0;
            this.f143046t = 0;
            this.f143047u = 0;
            return;
        }
        switch (C2690a.f143053a[bVar.ordinal()]) {
            case 1:
            case 2:
                this.J = null;
                this.K = null;
                this.f143035j = 0;
                this.f143042p = 0;
                break;
            case 3:
            case 4:
                this.L = null;
                this.M = null;
                this.f143037k = 0;
                this.f143043q = 0;
                break;
            case 5:
            case 6:
                this.N = null;
                this.O = null;
                this.f143038l = 0;
                this.f143044r = 0;
                break;
            case 7:
            case 8:
                this.P = null;
                this.Q = null;
                this.f143039m = 0;
                this.f143045s = 0;
                break;
            case 9:
            case 10:
            case 11:
                this.R = null;
                this.S = null;
                this.T = null;
                this.f143040n = 0;
                this.f143046t = 0;
                break;
            case 12:
            case 13:
            case 14:
                this.U = null;
                this.V = null;
                this.W = null;
                this.f143041o = 0;
                this.f143047u = 0;
                break;
            case 17:
                this.X = null;
                break;
            case 18:
                this.f143018a0 = null;
                break;
        }
    }

    public final void g() {
        if (this.N != null) {
            this.f143024d0 = g.b.START_TO_START;
        } else {
            this.f143024d0 = g.b.START_TO_END;
        }
        f();
        if (this.P != null) {
            this.f143024d0 = g.b.END_TO_START;
        } else {
            this.f143024d0 = g.b.END_TO_END;
        }
        f();
        if (this.J != null) {
            this.f143024d0 = g.b.LEFT_TO_LEFT;
        } else {
            this.f143024d0 = g.b.LEFT_TO_RIGHT;
        }
        f();
        if (this.L != null) {
            this.f143024d0 = g.b.RIGHT_TO_LEFT;
        } else {
            this.f143024d0 = g.b.RIGHT_TO_RIGHT;
        }
        f();
    }

    @Override // q6.e
    public final Object getKey() {
        return this.f143017a;
    }

    public final void h() {
        if (this.R != null) {
            this.f143024d0 = g.b.TOP_TO_TOP;
        } else {
            this.f143024d0 = g.b.TOP_TO_BOTTOM;
        }
        f();
        this.f143024d0 = g.b.BASELINE_TO_BASELINE;
        f();
        if (this.U != null) {
            this.f143024d0 = g.b.BOTTOM_TO_TOP;
        } else {
            this.f143024d0 = g.b.BOTTOM_TO_BOTTOM;
        }
        f();
    }

    public final void i(Object obj) {
        this.f143024d0 = g.b.END_TO_END;
        this.Q = obj;
    }

    public final Object j(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof a) ? this.f143019b.f143086c.get(obj) : obj;
    }

    public a k(int i14) {
        g.b bVar = this.f143024d0;
        if (bVar == null) {
            this.f143035j = i14;
            this.f143037k = i14;
            this.f143038l = i14;
            this.f143039m = i14;
            this.f143040n = i14;
            this.f143041o = i14;
            return this;
        }
        switch (C2690a.f143053a[bVar.ordinal()]) {
            case 1:
            case 2:
                this.f143035j = i14;
                break;
            case 3:
            case 4:
                this.f143037k = i14;
                break;
            case 5:
            case 6:
                this.f143038l = i14;
                break;
            case 7:
            case 8:
                this.f143039m = i14;
                break;
            case 9:
            case 10:
            case 11:
                this.f143040n = i14;
                break;
            case 12:
            case 13:
            case 14:
                this.f143041o = i14;
                break;
            case 15:
            case 16:
            case 17:
                this.f143048v = i14;
                break;
            case 18:
                this.f143022c0 = i14;
                break;
        }
        return this;
    }

    public a l(Float f14) {
        return k(this.f143019b.d(f14));
    }

    public final void m(int i14) {
        g.b bVar = this.f143024d0;
        if (bVar == null) {
            this.f143042p = i14;
            this.f143043q = i14;
            this.f143044r = i14;
            this.f143045s = i14;
            this.f143046t = i14;
            this.f143047u = i14;
            return;
        }
        switch (C2690a.f143053a[bVar.ordinal()]) {
            case 1:
            case 2:
                this.f143042p = i14;
                break;
            case 3:
            case 4:
                this.f143043q = i14;
                break;
            case 5:
            case 6:
                this.f143044r = i14;
                break;
            case 7:
            case 8:
                this.f143045s = i14;
                break;
            case 9:
            case 10:
            case 11:
                this.f143046t = i14;
                break;
            case 12:
            case 13:
            case 14:
                this.f143047u = i14;
                break;
            case 15:
            case 16:
            case 17:
                this.f143049w = i14;
                break;
        }
    }

    public final void n(Float f14) {
        m(this.f143019b.d(f14));
    }

    public final void o(Object obj) {
        this.f143024d0 = g.b.START_TO_START;
        this.N = obj;
    }

    public final void p(Object obj) {
        this.f143024d0 = g.b.TOP_TO_TOP;
        this.R = obj;
    }
}
