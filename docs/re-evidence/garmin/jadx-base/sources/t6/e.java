package t6;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import i3.e5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.lang3.StringUtils;
import u6.n;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public int A;
    public float B;
    public int C;
    public float D;
    public int[] E;
    public float F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public final d L;
    public final d M;
    public final d N;
    public final d O;
    public final d P;
    public final d Q;
    public final d R;
    public final d S;
    public final d[] T;
    public final ArrayList<d> U;
    public final boolean[] V;
    public b[] W;
    public e X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f162602a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f162603a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u6.c f162604b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f162605b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u6.c f162606c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f162607c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u6.l f162608d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f162609d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f162610e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f162611e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f162612f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f162613f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f162614g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f162615g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f162616h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f162617h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f162618i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f162619i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f162620j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Object f162621j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q6.h f162622k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f162623k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f162624l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f162625l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f162626m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public String f162627m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f162628n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f162629n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f162630o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f162631o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f162632p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final float[] f162633p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f162634q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final e[] f162635q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f162636r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final e[] f162637r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f162638s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public e f162639s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f162640t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public e f162641t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f162642u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f162643u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f162644v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f162645v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f162646w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f162647x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f162648y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f162649z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f162650a;

        static {
            int[] iArr = new int[d.a.values().length];
            f162650a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f162650a[d.a.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f162650a[d.a.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f162650a[d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f162650a[d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f162650a[d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f162650a[d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f162650a[d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f162650a[d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e(String str) {
        this.f162602a = false;
        this.f162608d = null;
        this.f162610e = null;
        this.f162612f = new boolean[]{true, true};
        this.f162614g = true;
        this.f162616h = true;
        this.f162618i = -1;
        this.f162620j = -1;
        this.f162622k = new q6.h(this);
        this.f162626m = false;
        this.f162628n = false;
        this.f162630o = false;
        this.f162632p = false;
        this.f162634q = -1;
        this.f162636r = -1;
        this.f162638s = 0;
        this.f162640t = 0;
        this.f162642u = 0;
        this.f162644v = new int[2];
        this.f162646w = 0;
        this.f162647x = 0;
        this.f162648y = 1.0f;
        this.f162649z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = -1;
        this.D = 1.0f;
        this.E = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.F = Float.NaN;
        this.G = false;
        this.I = false;
        this.J = 0;
        this.K = 0;
        d dVar = new d(this, d.a.LEFT);
        this.L = dVar;
        d dVar2 = new d(this, d.a.TOP);
        this.M = dVar2;
        d dVar3 = new d(this, d.a.RIGHT);
        this.N = dVar3;
        d dVar4 = new d(this, d.a.BOTTOM);
        this.O = dVar4;
        d dVar5 = new d(this, d.a.BASELINE);
        this.P = dVar5;
        this.Q = new d(this, d.a.CENTER_X);
        this.R = new d(this, d.a.CENTER_Y);
        d dVar6 = new d(this, d.a.CENTER);
        this.S = dVar6;
        this.T = new d[]{dVar, dVar3, dVar2, dVar4, dVar5, dVar6};
        this.U = new ArrayList<>();
        this.V = new boolean[2];
        b bVar = b.FIXED;
        this.W = new b[]{bVar, bVar};
        this.X = null;
        this.Y = 0;
        this.Z = 0;
        this.f162603a0 = 0.0f;
        this.f162605b0 = -1;
        this.f162607c0 = 0;
        this.f162609d0 = 0;
        this.f162611e0 = 0;
        this.f162617h0 = 0.5f;
        this.f162619i0 = 0.5f;
        this.f162623k0 = 0;
        this.f162625l0 = false;
        this.f162627m0 = null;
        this.f162629n0 = 0;
        this.f162631o0 = 0;
        this.f162633p0 = new float[]{-1.0f, -1.0f};
        this.f162635q0 = new e[]{null, null};
        this.f162637r0 = new e[]{null, null};
        this.f162639s0 = null;
        this.f162641t0 = null;
        this.f162643u0 = -1;
        this.f162645v0 = -1;
        a();
        this.f162627m0 = str;
    }

    public static void I(int i14, int i15, String str, StringBuilder sb3) {
        if (i14 == i15) {
            return;
        }
        q6.f.q(i14, str, " :   ", ",\n", sb3);
    }

    public static void J(StringBuilder sb3, String str, float f14, float f15) {
        if (f14 == f15) {
            return;
        }
        sb3.append(str);
        sb3.append(" :   ");
        sb3.append(f14);
        sb3.append(",\n");
    }

    public static void q(StringBuilder sb3, String str, int i14, int i15, int i16, int i17, int i18, float f14, b bVar) {
        sb3.append(str);
        sb3.append(" :  {\n");
        String string = bVar.toString();
        if (!b.FIXED.toString().equals(string)) {
            sn.a.t(sb3, "      behavior", " :   ", string, ",\n");
        }
        I(i14, 0, "      size", sb3);
        I(i15, 0, "      min", sb3);
        I(i16, Integer.MAX_VALUE, "      max", sb3);
        I(i17, 0, "      matchMin", sb3);
        I(i18, 0, "      matchDef", sb3);
        J(sb3, "      matchPercent", f14, 1.0f);
        sb3.append("    },\n");
    }

    public static void r(StringBuilder sb3, String str, d dVar) {
        if (dVar.f162588f == null) {
            return;
        }
        am.j.y(sb3, "    ", str, " : [ '");
        sb3.append(dVar.f162588f);
        sb3.append("'");
        if (dVar.f162590h != Integer.MIN_VALUE || dVar.f162589g != 0) {
            sb3.append(",");
            sb3.append(dVar.f162589g);
            if (dVar.f162590h != Integer.MIN_VALUE) {
                sb3.append(",");
                sb3.append(dVar.f162590h);
                sb3.append(",");
            }
        }
        sb3.append(" ] ,\n");
    }

    public final boolean A() {
        d dVar = this.M;
        d dVar2 = dVar.f162588f;
        if (dVar2 != null && dVar2.f162588f == dVar) {
            return true;
        }
        d dVar3 = this.O;
        d dVar4 = dVar3.f162588f;
        return dVar4 != null && dVar4.f162588f == dVar3;
    }

    public final boolean B() {
        return this.f162614g && this.f162623k0 != 8;
    }

    public boolean C() {
        if (this.f162626m) {
            return true;
        }
        return this.L.f162585c && this.N.f162585c;
    }

    public boolean D() {
        if (this.f162628n) {
            return true;
        }
        return this.M.f162585c && this.O.f162585c;
    }

    public void E() {
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.S.j();
        this.X = null;
        this.F = Float.NaN;
        this.Y = 0;
        this.Z = 0;
        this.f162603a0 = 0.0f;
        this.f162605b0 = -1;
        this.f162607c0 = 0;
        this.f162609d0 = 0;
        this.f162611e0 = 0;
        this.f162613f0 = 0;
        this.f162615g0 = 0;
        this.f162617h0 = 0.5f;
        this.f162619i0 = 0.5f;
        b[] bVarArr = this.W;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f162621j0 = null;
        this.f162623k0 = 0;
        this.f162629n0 = 0;
        this.f162631o0 = 0;
        float[] fArr = this.f162633p0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f162634q = -1;
        this.f162636r = -1;
        int[] iArr = this.E;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f162640t = 0;
        this.f162642u = 0;
        this.f162648y = 1.0f;
        this.B = 1.0f;
        this.f162647x = Integer.MAX_VALUE;
        this.A = Integer.MAX_VALUE;
        this.f162646w = 0;
        this.f162649z = 0;
        this.C = -1;
        this.D = 1.0f;
        boolean[] zArr = this.f162612f;
        zArr[0] = true;
        zArr[1] = true;
        this.I = false;
        boolean[] zArr2 = this.V;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f162614g = true;
        int[] iArr2 = this.f162644v;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f162618i = -1;
        this.f162620j = -1;
    }

    public final void F() {
        e eVar = this.X;
        if (eVar != null && (eVar instanceof f)) {
            ((f) eVar).getClass();
        }
        ArrayList<d> arrayList = this.U;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.get(i14).j();
        }
    }

    public final void G() {
        this.f162626m = false;
        this.f162628n = false;
        this.f162630o = false;
        this.f162632p = false;
        ArrayList<d> arrayList = this.U;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            d dVar = arrayList.get(i14);
            dVar.f162585c = false;
            dVar.f162584b = 0;
        }
    }

    public void H(m6.c cVar) {
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.P.k();
        this.S.k();
        this.Q.k();
        this.R.k();
    }

    public final void K(int i14) {
        this.f162611e0 = i14;
        this.G = i14 > 0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    public final void L(String str) {
        float fAbs;
        int i14 = 0;
        if (str == null || str.length() == 0) {
            this.f162603a0 = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i15 = 0;
        int i16 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase("W")) {
                i15 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i16 = i15;
            i15 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i15);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i14;
                }
            } else {
                String strSubstring3 = str.substring(i15, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i14;
                } else {
                    float f14 = Float.parseFloat(strSubstring3);
                    float f15 = Float.parseFloat(strSubstring4);
                    if (f14 <= 0.0f || f15 <= 0.0f) {
                        fAbs = i14;
                    } else {
                        fAbs = i16 == 1 ? Math.abs(f15 / f14) : Math.abs(f14 / f15);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i14 = (fAbs > i14 ? 1 : (fAbs == i14 ? 0 : -1));
        if (i14 > 0) {
            this.f162603a0 = fAbs;
            this.f162605b0 = i16;
        }
    }

    public final void M(int i14, int i15) {
        if (this.f162626m) {
            return;
        }
        this.L.l(i14);
        this.N.l(i15);
        this.f162607c0 = i14;
        this.Y = i15 - i14;
        this.f162626m = true;
    }

    public final void N(int i14, int i15) {
        if (this.f162628n) {
            return;
        }
        this.M.l(i14);
        this.O.l(i15);
        this.f162609d0 = i14;
        this.Z = i15 - i14;
        if (this.G) {
            this.P.l(i14 + this.f162611e0);
        }
        this.f162628n = true;
    }

    public final void O(int i14) {
        this.Z = i14;
        int i15 = this.f162615g0;
        if (i14 < i15) {
            this.Z = i15;
        }
    }

    public final void P(b bVar) {
        this.W[0] = bVar;
    }

    public final void Q(int i14, float f14, int i15, int i16) {
        this.f162640t = i14;
        this.f162646w = i15;
        if (i16 == Integer.MAX_VALUE) {
            i16 = 0;
        }
        this.f162647x = i16;
        this.f162648y = f14;
        if (f14 <= 0.0f || f14 >= 1.0f || i14 != 0) {
            return;
        }
        this.f162640t = 2;
    }

    public final void R(b bVar) {
        this.W[1] = bVar;
    }

    public final void S(int i14, float f14, int i15, int i16) {
        this.f162642u = i14;
        this.f162649z = i15;
        if (i16 == Integer.MAX_VALUE) {
            i16 = 0;
        }
        this.A = i16;
        this.B = f14;
        if (f14 <= 0.0f || f14 >= 1.0f || i14 != 0) {
            return;
        }
        this.f162642u = 2;
    }

    public final void T(int i14) {
        this.Y = i14;
        int i15 = this.f162613f0;
        if (i14 < i15) {
            this.Y = i15;
        }
    }

    public void U(boolean z14, boolean z15) {
        int i14;
        int i15;
        u6.l lVar = this.f162608d;
        boolean z16 = z14 & lVar.f168845g;
        n nVar = this.f162610e;
        boolean z17 = z15 & nVar.f168845g;
        int i16 = lVar.f168846h.f168809g;
        int i17 = nVar.f168846h.f168809g;
        int i18 = lVar.f168847i.f168809g;
        int i19 = nVar.f168847i.f168809g;
        int i24 = i19 - i17;
        if (i18 - i16 < 0 || i24 < 0 || i16 == Integer.MIN_VALUE || i16 == Integer.MAX_VALUE || i17 == Integer.MIN_VALUE || i17 == Integer.MAX_VALUE || i18 == Integer.MIN_VALUE || i18 == Integer.MAX_VALUE || i19 == Integer.MIN_VALUE || i19 == Integer.MAX_VALUE) {
            i18 = 0;
            i19 = 0;
            i16 = 0;
            i17 = 0;
        }
        int i25 = i18 - i16;
        int i26 = i19 - i17;
        if (z16) {
            this.f162607c0 = i16;
        }
        if (z17) {
            this.f162609d0 = i17;
        }
        if (this.f162623k0 == 8) {
            this.Y = 0;
            this.Z = 0;
            return;
        }
        if (z16) {
            if (this.W[0] == b.FIXED && i25 < (i15 = this.Y)) {
                i25 = i15;
            }
            this.Y = i25;
            int i27 = this.f162613f0;
            if (i25 < i27) {
                this.Y = i27;
            }
        }
        if (z17) {
            if (this.W[1] == b.FIXED && i26 < (i14 = this.Z)) {
                i26 = i14;
            }
            this.Z = i26;
            int i28 = this.f162615g0;
            if (i26 < i28) {
                this.Z = i28;
            }
        }
    }

    public void V(m6.d dVar, boolean z14) {
        int i14;
        int i15;
        n nVar;
        u6.l lVar;
        dVar.getClass();
        int iN = m6.d.n(this.L);
        int iN2 = m6.d.n(this.M);
        int iN3 = m6.d.n(this.N);
        int iN4 = m6.d.n(this.O);
        if (z14 && (lVar = this.f162608d) != null) {
            u6.f fVar = lVar.f168846h;
            if (fVar.f168812j) {
                u6.f fVar2 = lVar.f168847i;
                if (fVar2.f168812j) {
                    iN = fVar.f168809g;
                    iN3 = fVar2.f168809g;
                }
            }
        }
        if (z14 && (nVar = this.f162610e) != null) {
            u6.f fVar3 = nVar.f168846h;
            if (fVar3.f168812j) {
                u6.f fVar4 = nVar.f168847i;
                if (fVar4.f168812j) {
                    iN2 = fVar3.f168809g;
                    iN4 = fVar4.f168809g;
                }
            }
        }
        int i16 = iN4 - iN2;
        if (iN3 - iN < 0 || i16 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i17 = iN3 - iN;
        int i18 = iN4 - iN2;
        this.f162607c0 = iN;
        this.f162609d0 = iN2;
        if (this.f162623k0 == 8) {
            this.Y = 0;
            this.Z = 0;
            return;
        }
        b[] bVarArr = this.W;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i17 < (i15 = this.Y)) {
            i17 = i15;
        }
        if (bVarArr[1] == bVar2 && i18 < (i14 = this.Z)) {
            i18 = i14;
        }
        this.Y = i17;
        this.Z = i18;
        int i19 = this.f162615g0;
        if (i18 < i19) {
            this.Z = i19;
        }
        int i24 = this.f162613f0;
        if (i17 < i24) {
            this.Y = i24;
        }
        int i25 = this.f162647x;
        if (i25 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.Y = Math.min(this.Y, i25);
        }
        int i26 = this.A;
        if (i26 > 0 && this.W[1] == b.MATCH_CONSTRAINT) {
            this.Z = Math.min(this.Z, i26);
        }
        int i27 = this.Y;
        if (i17 != i27) {
            this.f162618i = i27;
        }
        int i28 = this.Z;
        if (i18 != i28) {
            this.f162620j = i28;
        }
    }

    public final void a() {
        d dVar = this.L;
        ArrayList<d> arrayList = this.U;
        arrayList.add(dVar);
        arrayList.add(this.M);
        arrayList.add(this.N);
        arrayList.add(this.O);
        arrayList.add(this.Q);
        arrayList.add(this.R);
        arrayList.add(this.S);
        arrayList.add(this.P);
    }

    public final void b(f fVar, m6.d dVar, HashSet<e> hashSet, int i14, boolean z14) {
        if (z14) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.a(fVar, dVar, this);
            hashSet.remove(this);
            c(dVar, fVar.d0(64));
        }
        if (i14 == 0) {
            HashSet<d> hashSet2 = this.L.f162583a;
            if (hashSet2 != null) {
                Iterator<d> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f162586d.b(fVar, dVar, hashSet, i14, true);
                }
            }
            HashSet<d> hashSet3 = this.N.f162583a;
            if (hashSet3 != null) {
                Iterator<d> it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    it3.next().f162586d.b(fVar, dVar, hashSet, i14, true);
                }
                return;
            }
            return;
        }
        HashSet<d> hashSet4 = this.M.f162583a;
        if (hashSet4 != null) {
            Iterator<d> it4 = hashSet4.iterator();
            while (it4.hasNext()) {
                it4.next().f162586d.b(fVar, dVar, hashSet, i14, true);
            }
        }
        HashSet<d> hashSet5 = this.O.f162583a;
        if (hashSet5 != null) {
            Iterator<d> it5 = hashSet5.iterator();
            while (it5.hasNext()) {
                it5.next().f162586d.b(fVar, dVar, hashSet, i14, true);
            }
        }
        HashSet<d> hashSet6 = this.P.f162583a;
        if (hashSet6 != null) {
            Iterator<d> it6 = hashSet6.iterator();
            while (it6.hasNext()) {
                it6.next().f162586d.b(fVar, dVar, hashSet, i14, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:140:0x024f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0258  */
    /* JADX WARN: Code duplicated, block: B:146:0x025f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0269  */
    /* JADX WARN: Code duplicated, block: B:151:0x0270  */
    /* JADX WARN: Code duplicated, block: B:152:0x027b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0287  */
    /* JADX WARN: Code duplicated, block: B:156:0x0290  */
    /* JADX WARN: Code duplicated, block: B:158:0x0296 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x02b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x02db  */
    /* JADX WARN: Code duplicated, block: B:181:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:184:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:185:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:188:0x0304  */
    /* JADX WARN: Code duplicated, block: B:190:0x030b  */
    /* JADX WARN: Code duplicated, block: B:193:0x0312  */
    /* JADX WARN: Code duplicated, block: B:195:0x0317  */
    /* JADX WARN: Code duplicated, block: B:198:0x0336  */
    /* JADX WARN: Code duplicated, block: B:200:0x033e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0340 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x0344  */
    /* JADX WARN: Code duplicated, block: B:205:0x0348 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:207:0x034c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0350 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:270:0x03fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:271:0x0400  */
    /* JADX WARN: Code duplicated, block: B:277:0x0415 A[PHI: r13
      0x0415: PHI (r13v39 int) = (r13v25 int), (r13v25 int), (r13v37 int), (r13v25 int), (r13v25 int), (r13v25 int), (r13v25 int), (r13v25 int) binds: [B:279:0x041d, B:281:0x0420, B:274:0x040b, B:260:0x03e0, B:266:0x03ee, B:268:0x03f2, B:269:0x03f4, B:265:0x03ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:279:0x041d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:280:0x041f  */
    /* JADX WARN: Code duplicated, block: B:289:0x043b  */
    /* JADX WARN: Code duplicated, block: B:293:0x0450  */
    /* JADX WARN: Code duplicated, block: B:295:0x0455 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:297:0x0459  */
    /* JADX WARN: Code duplicated, block: B:300:0x045d  */
    /* JADX WARN: Code duplicated, block: B:304:0x0467  */
    /* JADX WARN: Code duplicated, block: B:307:0x0473  */
    /* JADX WARN: Code duplicated, block: B:310:0x0479  */
    /* JADX WARN: Code duplicated, block: B:312:0x047c  */
    /* JADX WARN: Code duplicated, block: B:315:0x0496  */
    /* JADX WARN: Code duplicated, block: B:334:0x04df  */
    /* JADX WARN: Code duplicated, block: B:351:0x0592  */
    /* JADX WARN: Code duplicated, block: B:368:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:371:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:373:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:410:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:412:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:414:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:415:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:418:0x071b  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:421:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:427:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x0107  */
    /* JADX WARN: Code duplicated, block: B:72:0x011e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0124  */
    /* JADX WARN: Code duplicated, block: B:78:0x0136  */
    /* JADX WARN: Code duplicated, block: B:82:0x0146  */
    /* JADX WARN: Code duplicated, block: B:99:0x0194  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r17v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r60v0, types: [t6.e] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v12 */
    public void c(m6.d dVar, boolean z14) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        HashSet<d> hashSet;
        e eVar;
        e eVar2;
        WeakReference<d> weakReference;
        m6.e eVar3;
        boolean[] zArr;
        d dVar2;
        boolean[] zArr2;
        boolean[] zArr3;
        ?? r14;
        boolean z19;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        b bVar;
        b bVar2;
        boolean z24;
        b bVar3;
        boolean z25;
        float f14;
        int i30;
        int i34;
        m6.h hVar;
        int i35;
        int i36;
        int i37;
        boolean z26;
        int i38;
        boolean z27;
        b bVar4;
        b bVar5;
        boolean z28;
        d dVar3;
        boolean z29;
        m6.h hVar2;
        m6.h hVar3;
        b bVar6;
        m6.h hVar4;
        ?? r19;
        ?? r15;
        int i39;
        ?? r16;
        int i44;
        boolean z34;
        m6.h hVar5;
        m6.h hVar6;
        m6.h hVar7;
        int i45;
        char c14;
        int i46;
        int i47;
        m6.h hVar8;
        m6.e eVar4;
        int i48;
        float f15;
        ?? r27;
        n nVar;
        boolean z35;
        u6.l lVar;
        int i49;
        int i54;
        int i55;
        ?? Z;
        boolean zA;
        u6.l lVar2;
        boolean z36;
        m6.d dVar4 = dVar;
        d dVar5 = this.L;
        m6.h hVarK = dVar4.k(dVar5);
        d dVar6 = this.N;
        m6.h hVarK2 = dVar4.k(dVar6);
        d dVar7 = this.M;
        m6.h hVarK3 = dVar4.k(dVar7);
        d dVar8 = this.O;
        m6.h hVarK4 = dVar4.k(dVar8);
        d dVar9 = this.P;
        m6.h hVarK5 = dVar4.k(dVar9);
        e eVar5 = this.X;
        if (eVar5 != null) {
            b[] bVarArr = eVar5.W;
            i15 = 0;
            b bVar7 = bVarArr[0];
            b bVar8 = b.WRAP_CONTENT;
            i16 = bVar7 == bVar8 ? 1 : 0;
            i17 = bVarArr[1] == bVar8 ? 1 : 0;
            int i56 = this.f162638s;
            if (i56 != 1) {
                i14 = 1;
                if (i56 == 2) {
                    i16 = 0;
                } else if (i56 == 3) {
                }
            } else {
                i14 = 1;
                i17 = 0;
            }
            i18 = this.f162623k0;
            boolean[] zArr4 = this.V;
            i19 = i17;
            if (i18 != 8 && !this.f162625l0) {
                ArrayList<d> arrayList = this.U;
                int size = arrayList.size();
                i24 = i16;
                int i57 = i15;
                while (true) {
                    if (i57 >= size) {
                        if (zArr4[i15] || zArr4[i14]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i58 = size;
                    HashSet<d> hashSet2 = arrayList.get(i57).f162583a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i57++;
                    size = i58;
                }
            } else {
                i24 = i16;
            }
            z15 = this.f162626m;
            if (z15 || this.f162628n) {
                z16 = this.f162616h;
                if (z15) {
                    dVar4.d(hVarK, this.f162607c0);
                    dVar4.d(hVarK2, this.f162607c0 + this.Y);
                    if (i24 != 0 || (eVar2 = this.X) == null) {
                        z17 = z16;
                    } else if (z16) {
                        f fVar = (f) eVar2;
                        WeakReference<d> weakReference2 = fVar.O0;
                        if (weakReference2 == null || weakReference2.get() == null) {
                            z17 = z16;
                        } else {
                            z17 = z16;
                            if (dVar5.d() > fVar.O0.get().d()) {
                            }
                            weakReference = fVar.Q0;
                            if (weakReference != null || weakReference.get() == null || dVar6.d() > fVar.Q0.get().d()) {
                                fVar.Q0 = new WeakReference<>(dVar6);
                            }
                        }
                        fVar.O0 = new WeakReference<>(dVar5);
                        weakReference = fVar.Q0;
                        if (weakReference != null) {
                            fVar.Q0 = new WeakReference<>(dVar6);
                        } else {
                            fVar.Q0 = new WeakReference<>(dVar6);
                        }
                    } else {
                        z17 = z16;
                        dVar4.f(dVar4.k(eVar2.N), hVarK2, i15, 5);
                    }
                } else {
                    z17 = z16;
                }
                if (this.f162628n) {
                    dVar4.d(hVarK3, this.f162609d0);
                    dVar4.d(hVarK4, this.f162609d0 + this.Z);
                    hashSet = dVar9.f162583a;
                    if (hashSet != null && hashSet.size() > 0) {
                        dVar4.d(hVarK5, this.f162609d0 + this.f162611e0);
                    }
                    if (i19 != 0 || (eVar = this.X) == null) {
                        z18 = false;
                    } else if (z17) {
                        f fVar2 = (f) eVar;
                        WeakReference<d> weakReference3 = fVar2.N0;
                        if (weakReference3 == null || weakReference3.get() == null || dVar7.d() > fVar2.N0.get().d()) {
                            fVar2.N0 = new WeakReference<>(dVar7);
                        }
                        WeakReference<d> weakReference4 = fVar2.P0;
                        if (weakReference4 == null || weakReference4.get() == null || dVar8.d() > fVar2.P0.get().d()) {
                            fVar2.P0 = new WeakReference<>(dVar8);
                        }
                        z18 = false;
                    } else {
                        z18 = false;
                        dVar4.f(dVar4.k(eVar.O), hVarK4, 0, 5);
                    }
                } else {
                    z18 = false;
                }
                if (this.f162626m && this.f162628n) {
                    this.f162626m = z18;
                    this.f162628n = z18;
                    return;
                }
            }
            eVar3 = m6.d.f116820r;
            if (eVar3 != null) {
                eVar3.f116844h++;
            }
            zArr = this.f162612f;
            if (!z14 && (lVar2 = this.f162608d) != null) {
                dVar2 = dVar9;
                n nVar2 = this.f162610e;
                zArr2 = zArr;
                if (nVar2 != null) {
                    u6.f fVar3 = lVar2.f168846h;
                    zArr3 = zArr4;
                    if (fVar3.f168812j && lVar2.f168847i.f168812j && nVar2.f168846h.f168812j && nVar2.f168847i.f168812j) {
                        if (eVar3 != null) {
                            eVar3.f116840d++;
                        }
                        dVar4.d(hVarK, fVar3.f168809g);
                        dVar4.d(hVarK2, this.f162608d.f168847i.f168809g);
                        dVar4.d(hVarK3, this.f162610e.f168846h.f168809g);
                        dVar4.d(hVarK4, this.f162610e.f168847i.f168809g);
                        dVar4.d(hVarK5, this.f162610e.f168830k.f168809g);
                        if (this.X == null) {
                            z36 = false;
                        } else {
                            if (i24 != 0 && zArr2[0] && !z()) {
                                dVar4.f(dVar4.k(this.X.N), hVarK2, 0, 8);
                            }
                            if (i19 == 0 || !zArr2[i14] || A()) {
                                z36 = false;
                            } else {
                                z36 = false;
                                dVar4.f(dVar4.k(this.X.O), hVarK4, 0, 8);
                            }
                        }
                        this.f162626m = z36;
                        this.f162628n = z36;
                        return;
                    }
                }
                if (eVar3 != null) {
                    eVar3.f116841e++;
                }
                if (this.X != null) {
                    if (y(0)) {
                        ((f) this.X).Y(this, 0);
                        int i59 = i14;
                        i55 = i59 == true ? 1 : 0;
                        Z = i59;
                    } else {
                        i55 = i14;
                        Z = z();
                    }
                    if (y(i55)) {
                        ((f) this.X).Y(this, i55);
                        zA = true;
                    } else {
                        zA = A();
                    }
                    if (Z == 0 && i24 != 0 && this.f162623k0 != 8 && dVar5.f162588f == null && dVar6.f162588f == null) {
                        dVar4.f(dVar4.k(this.X.N), hVarK2, 0, 1);
                    }
                    if (!zA && i19 != 0 && this.f162623k0 != 8 && dVar7.f162588f == null && dVar8.f162588f == null && dVar2 == null) {
                        dVar4.f(dVar4.k(this.X.O), hVarK4, 0, 1);
                    }
                    r14 = Z;
                    z19 = zA;
                } else {
                    r14 = 0;
                    z19 = false;
                }
                i25 = this.Y;
                i26 = this.f162613f0;
                if (i25 >= i26) {
                    i26 = i25;
                }
                i27 = this.Z;
                i28 = this.f162615g0;
                if (i27 < i28) {
                    i29 = i28;
                } else {
                    i29 = i27;
                }
                b[] bVarArr2 = this.W;
                bVar = bVarArr2[0];
                bVar2 = b.MATCH_CONSTRAINT;
                if (bVar != bVar2) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                bVar3 = bVarArr2[1];
                if (bVar3 != bVar2) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                int i64 = this.f162605b0;
                this.C = i64;
                f14 = this.f162603a0;
                this.D = f14;
                i30 = this.f162640t;
                i34 = this.f162642u;
                if (f14 > 0.0f) {
                    hVar = hVarK4;
                    if (this.f162623k0 != 8) {
                        if (bVar == bVar2 || i30 != 0) {
                            i54 = i30;
                        } else {
                            i54 = 3;
                        }
                        if (bVar3 == bVar2 || i34 != 0) {
                            i37 = i34;
                        } else {
                            i37 = 3;
                        }
                        if (bVar == bVar2 || bVar3 != bVar2 || i54 != 3 || i37 != 3) {
                            if (bVar == bVar2 || i54 != 3) {
                                if (bVar3 != bVar2 && i37 == 3) {
                                    this.C = 1;
                                    if (i64 == -1) {
                                        this.D = 1.0f / f14;
                                    }
                                    i35 = (int) (this.D * i25);
                                    i36 = i54;
                                    if (bVar != bVar2) {
                                        i37 = 4;
                                    }
                                }
                                z26 = true;
                            } else {
                                this.C = 0;
                                i26 = (int) (i27 * f14);
                                if (bVar3 != bVar2) {
                                    i37 = i37;
                                    i35 = i29;
                                    i36 = 4;
                                }
                            }
                            int[] iArr = this.f162644v;
                            iArr[0] = i36;
                            iArr[1] = i37;
                            if (z26) {
                                int i65 = this.C;
                                i38 = -1;
                                boolean z37 = i65 != 0 || i65 == -1;
                                if (z26 || !((i49 = this.C) == 1 || i49 == i38)) {
                                    z27 = false;
                                } else {
                                    z27 = true;
                                }
                                bVar4 = this.W[0];
                                bVar5 = b.WRAP_CONTENT;
                                if (bVar4 == bVar5 || !(this instanceof f)) {
                                    z28 = false;
                                } else {
                                    z28 = true;
                                }
                                if (z28) {
                                    i26 = 0;
                                }
                                dVar3 = this.S;
                                z29 = !dVar3.h();
                                boolean z38 = zArr3[0];
                                boolean z39 = zArr3[1];
                                if (this.f162634q != 2 || this.f162626m) {
                                    hVar2 = hVarK;
                                    hVar3 = hVarK2;
                                    bVar6 = bVar5;
                                    hVar4 = hVarK5;
                                    r19 = r14;
                                    r15 = i24;
                                    i39 = i36;
                                    r16 = i19;
                                    i44 = i37;
                                    z34 = z29;
                                } else {
                                    if (!z14 || (lVar = this.f162608d) == null) {
                                        z35 = z37;
                                    } else {
                                        u6.f fVar4 = lVar.f168846h;
                                        z35 = z37;
                                        if (fVar4.f168812j && lVar.f168847i.f168812j) {
                                            if (z14) {
                                                dVar4.d(hVarK, fVar4.f168809g);
                                                dVar4.d(hVarK2, this.f162608d.f168847i.f168809g);
                                                if (this.X != null && i24 != 0 && zArr2[0] && !z()) {
                                                    dVar4.f(dVar4.k(this.X.N), hVarK2, 0, 8);
                                                }
                                            }
                                            hVar2 = hVarK;
                                            hVar3 = hVarK2;
                                            bVar6 = bVar5;
                                            hVar4 = hVarK5;
                                            r19 = r14;
                                            r15 = i24;
                                            i39 = i36;
                                            r16 = i19;
                                            i44 = i37;
                                            z34 = z29;
                                        }
                                    }
                                    e eVar6 = this.X;
                                    m6.h hVarK6 = eVar6 != null ? dVar4.k(eVar6.N) : null;
                                    e eVar7 = this.X;
                                    m6.h hVarK7 = eVar7 != null ? dVar4.k(eVar7.L) : null;
                                    boolean z44 = zArr2[0];
                                    b[] bVarArr3 = this.W;
                                    ?? r17 = i24;
                                    i39 = i36;
                                    i44 = i37;
                                    b bVar9 = bVarArr3[0];
                                    int i66 = this.f162607c0;
                                    ?? r110 = r14;
                                    int i67 = this.f162613f0;
                                    int i68 = this.E[0];
                                    float f16 = this.f162617h0;
                                    boolean z45 = bVarArr3[1] == bVar2;
                                    boolean z46 = z29;
                                    hVar3 = hVarK2;
                                    ?? r18 = i19;
                                    hVar2 = hVarK;
                                    bVar6 = bVar5;
                                    hVar4 = hVarK5;
                                    dVar4 = dVar;
                                    e(dVar4, true, r17, r18, z44, hVarK7, hVarK6, bVar9, z28, this.L, this.N, i66, i26, i67, i68, f16, z35, z45, r110, z19, z38, i39, i44, this.f162646w, this.f162647x, this.f162648y, z46);
                                    r15 = r17;
                                    r16 = r18;
                                    r19 = r110;
                                    z34 = z46;
                                }
                                if (z14 || (nVar = this.f162610e) == null) {
                                    hVar5 = r33;
                                    hVar6 = hVar;
                                    hVar7 = hVar4;
                                    i45 = 0;
                                    c14 = 1;
                                    i46 = 8;
                                    i47 = 1;
                                } else {
                                    u6.f fVar5 = nVar.f168846h;
                                    if (fVar5.f168812j && nVar.f168847i.f168812j) {
                                        int i69 = fVar5.f168809g;
                                        hVar5 = hVarK3;
                                        dVar4.d(hVar5, i69);
                                        hVar6 = hVar;
                                        dVar4.d(hVar6, this.f162610e.f168847i.f168809g);
                                        hVar7 = hVar4;
                                        dVar4.d(hVar7, this.f162610e.f168830k.f168809g);
                                        e eVar8 = this.X;
                                        if (eVar8 == null || z19 || r16 == 0) {
                                            i45 = 0;
                                            c14 = 1;
                                        } else {
                                            c14 = 1;
                                            if (zArr2[1]) {
                                                i45 = 0;
                                                i46 = 8;
                                                dVar4.f(dVar4.k(eVar8.O), hVar6, 0, 8);
                                            } else {
                                                i45 = 0;
                                            }
                                            i47 = i45;
                                        }
                                        i46 = 8;
                                        i47 = i45;
                                    } else {
                                        hVar5 = r33;
                                        hVar6 = hVar;
                                        hVar7 = hVar4;
                                        i45 = 0;
                                        c14 = 1;
                                        i46 = 8;
                                        i47 = 1;
                                    }
                                }
                                if (this.f162636r == 2) {
                                    i47 = i45;
                                }
                                if (i47 != 0 || this.f162628n) {
                                    hVar8 = hVar5;
                                } else {
                                    ?? r24 = (this.W[c14] == bVar6 && (this instanceof f)) ? c14 : i45;
                                    int i74 = r24 != 0 ? i45 : i35;
                                    e eVar9 = this.X;
                                    m6.h hVarK8 = eVar9 != null ? dVar4.k(eVar9.O) : null;
                                    e eVar10 = this.X;
                                    m6.h hVarK9 = eVar10 != null ? dVar4.k(eVar10.M) : null;
                                    int i75 = this.f162611e0;
                                    if (i75 > 0 || this.f162623k0 == i46) {
                                        r27 = z34;
                                        d dVar10 = dVar2;
                                        if (dVar10.f162588f != null) {
                                            dVar4.e(hVar7, hVar5, i75, i46);
                                            dVar4.e(hVar7, dVar4.k(dVar10.f162588f), dVar10.e(), i46);
                                            if (r16 != 0) {
                                                dVar4.f(hVarK8, dVar4.k(dVar8), i45, 5);
                                            }
                                            r27 = i45;
                                        } else if (this.f162623k0 == i46) {
                                            dVar4.e(hVar7, hVar5, dVar10.e(), i46);
                                            r27 = z34;
                                        } else {
                                            dVar4.e(hVar7, hVar5, i75, i46);
                                            r27 = z34;
                                        }
                                    }
                                    r27 = z34;
                                    boolean z47 = zArr2[c14];
                                    b[] bVarArr4 = this.W;
                                    int i76 = i45;
                                    char c15 = c14;
                                    hVar8 = hVar5;
                                    dVar4 = dVar;
                                    e(dVar4, false, r16, r15, z47, hVarK9, hVarK8, bVarArr4[c14], r24, this.M, this.O, this.f162609d0, i74, this.f162615g0, this.E[c15], this.f162619i0, z27, bVarArr4[i76] == bVar2 ? c15 : i76, z19, r19, z39, i44, i39, this.f162649z, this.A, this.B, r27);
                                }
                                if (z26) {
                                    i48 = this.C;
                                    f15 = this.D;
                                    if (i48 == 1) {
                                        m6.b bVarL = dVar4.l();
                                        bVarL.f116814d.k(hVar6, -1.0f);
                                        bVarL.f116814d.k(hVar8, 1.0f);
                                        bVarL.f116814d.k(hVar3, f15);
                                        bVarL.f116814d.k(hVar2, -f15);
                                        dVar4.c(bVarL);
                                    } else {
                                        m6.b bVarL2 = dVar4.l();
                                        bVarL2.f116814d.k(hVar3, -1.0f);
                                        bVarL2.f116814d.k(hVar2, 1.0f);
                                        bVarL2.f116814d.k(hVar6, f15);
                                        bVarL2.f116814d.k(hVar8, -f15);
                                        dVar4.c(bVarL2);
                                    }
                                }
                                if (dVar3.h()) {
                                    e eVar11 = dVar3.f162588f.f162586d;
                                    float radians = (float) Math.toRadians(this.F + 90.0f);
                                    int iE = dVar3.e();
                                    d.a aVar = d.a.LEFT;
                                    m6.h hVarK10 = dVar4.k(k(aVar));
                                    d.a aVar2 = d.a.TOP;
                                    m6.h hVarK11 = dVar4.k(k(aVar2));
                                    d.a aVar3 = d.a.RIGHT;
                                    m6.h hVarK12 = dVar4.k(k(aVar3));
                                    d.a aVar4 = d.a.BOTTOM;
                                    m6.h hVarK13 = dVar4.k(k(aVar4));
                                    m6.h hVarK14 = dVar4.k(eVar11.k(aVar));
                                    m6.h hVarK15 = dVar4.k(eVar11.k(aVar2));
                                    m6.h hVarK16 = dVar4.k(eVar11.k(aVar3));
                                    m6.h hVarK17 = dVar4.k(eVar11.k(aVar4));
                                    m6.b bVarL3 = dVar4.l();
                                    double d14 = radians;
                                    double dSin = Math.sin(d14);
                                    double d15 = iE;
                                    bVarL3.f116814d.k(hVarK15, 0.5f);
                                    bVarL3.f116814d.k(hVarK17, 0.5f);
                                    bVarL3.f116814d.k(hVarK11, -0.5f);
                                    bVarL3.f116814d.k(hVarK13, -0.5f);
                                    bVarL3.f116812b = -((float) (dSin * d15));
                                    dVar4.c(bVarL3);
                                    m6.b bVarL4 = dVar4.l();
                                    float fCos = (float) (Math.cos(d14) * d15);
                                    bVarL4.f116814d.k(hVarK14, 0.5f);
                                    bVarL4.f116814d.k(hVarK16, 0.5f);
                                    bVarL4.f116814d.k(hVarK10, -0.5f);
                                    bVarL4.f116814d.k(hVarK12, -0.5f);
                                    bVarL4.f116812b = -fCos;
                                    dVar4.c(bVarL4);
                                }
                                this.f162626m = false;
                                this.f162628n = false;
                                eVar4 = m6.d.f116820r;
                                if (eVar4 != null) {
                                    eVar4.getClass();
                                }
                            }
                            i38 = -1;
                            if (z26) {
                                z27 = false;
                            } else {
                                z27 = false;
                            }
                            bVar4 = this.W[0];
                            bVar5 = b.WRAP_CONTENT;
                            if (bVar4 == bVar5) {
                                z28 = false;
                            } else {
                                z28 = false;
                            }
                            if (z28) {
                                i26 = 0;
                            }
                            dVar3 = this.S;
                            z29 = !dVar3.h();
                            boolean z310 = zArr3[0];
                            boolean z311 = zArr3[1];
                            if (this.f162634q != 2) {
                                hVar2 = hVarK;
                                hVar3 = hVarK2;
                                bVar6 = bVar5;
                                hVar4 = hVarK5;
                                r19 = r14;
                                r15 = i24;
                                i39 = i36;
                                r16 = i19;
                                i44 = i37;
                                z34 = z29;
                            } else {
                                hVar2 = hVarK;
                                hVar3 = hVarK2;
                                bVar6 = bVar5;
                                hVar4 = hVarK5;
                                r19 = r14;
                                r15 = i24;
                                i39 = i36;
                                r16 = i19;
                                i44 = i37;
                                z34 = z29;
                            }
                            if (z14) {
                                hVar5 = r33;
                                hVar6 = hVar;
                                hVar7 = hVar4;
                                i45 = 0;
                                c14 = 1;
                                i46 = 8;
                                i47 = 1;
                            } else {
                                hVar5 = r33;
                                hVar6 = hVar;
                                hVar7 = hVar4;
                                i45 = 0;
                                c14 = 1;
                                i46 = 8;
                                i47 = 1;
                            }
                            if (this.f162636r == 2) {
                                i47 = i45;
                            }
                            if (i47 != 0) {
                                hVar8 = hVar5;
                            } else {
                                hVar8 = hVar5;
                            }
                            if (z26) {
                                i48 = this.C;
                                f15 = this.D;
                                if (i48 == 1) {
                                    m6.b bVarL5 = dVar4.l();
                                    bVarL5.f116814d.k(hVar6, -1.0f);
                                    bVarL5.f116814d.k(hVar8, 1.0f);
                                    bVarL5.f116814d.k(hVar3, f15);
                                    bVarL5.f116814d.k(hVar2, -f15);
                                    dVar4.c(bVarL5);
                                } else {
                                    m6.b bVarL6 = dVar4.l();
                                    bVarL6.f116814d.k(hVar3, -1.0f);
                                    bVarL6.f116814d.k(hVar2, 1.0f);
                                    bVarL6.f116814d.k(hVar6, f15);
                                    bVarL6.f116814d.k(hVar8, -f15);
                                    dVar4.c(bVarL6);
                                }
                            }
                            if (dVar3.h()) {
                                e eVar12 = dVar3.f162588f.f162586d;
                                float radians2 = (float) Math.toRadians(this.F + 90.0f);
                                int iE2 = dVar3.e();
                                d.a aVar5 = d.a.LEFT;
                                m6.h hVarK18 = dVar4.k(k(aVar5));
                                d.a aVar6 = d.a.TOP;
                                m6.h hVarK19 = dVar4.k(k(aVar6));
                                d.a aVar7 = d.a.RIGHT;
                                m6.h hVarK110 = dVar4.k(k(aVar7));
                                d.a aVar8 = d.a.BOTTOM;
                                m6.h hVarK111 = dVar4.k(k(aVar8));
                                m6.h hVarK112 = dVar4.k(eVar12.k(aVar5));
                                m6.h hVarK113 = dVar4.k(eVar12.k(aVar6));
                                m6.h hVarK114 = dVar4.k(eVar12.k(aVar7));
                                m6.h hVarK115 = dVar4.k(eVar12.k(aVar8));
                                m6.b bVarL7 = dVar4.l();
                                double d16 = radians2;
                                double dSin2 = Math.sin(d16);
                                double d17 = iE2;
                                bVarL7.f116814d.k(hVarK113, 0.5f);
                                bVarL7.f116814d.k(hVarK115, 0.5f);
                                bVarL7.f116814d.k(hVarK19, -0.5f);
                                bVarL7.f116814d.k(hVarK111, -0.5f);
                                bVarL7.f116812b = -((float) (dSin2 * d17));
                                dVar4.c(bVarL7);
                                m6.b bVarL8 = dVar4.l();
                                float fCos2 = (float) (Math.cos(d16) * d17);
                                bVarL8.f116814d.k(hVarK112, 0.5f);
                                bVarL8.f116814d.k(hVarK114, 0.5f);
                                bVarL8.f116814d.k(hVarK18, -0.5f);
                                bVarL8.f116814d.k(hVarK110, -0.5f);
                                bVarL8.f116812b = -fCos2;
                                dVar4.c(bVarL8);
                            }
                            this.f162626m = false;
                            this.f162628n = false;
                            eVar4 = m6.d.f116820r;
                            if (eVar4 != null) {
                                eVar4.getClass();
                            }
                        }
                        if (i64 == -1) {
                            if (z24 && !z25) {
                                this.C = 0;
                            } else if (!z24 && z25) {
                                this.C = 1;
                                if (i64 == -1) {
                                    this.D = 1.0f / f14;
                                }
                            }
                        }
                        if (this.C == 0 && (!dVar7.h() || !dVar8.h())) {
                            this.C = 1;
                        } else if (this.C == 1 && (!dVar5.h() || !dVar6.h())) {
                            this.C = 0;
                        }
                        if (this.C == -1 && (!dVar7.h() || !dVar8.h() || !dVar5.h() || !dVar6.h())) {
                            if (dVar7.h() && dVar8.h()) {
                                this.C = 0;
                            } else if (dVar5.h() && dVar6.h()) {
                                this.D = 1.0f / this.D;
                                this.C = 1;
                            }
                        }
                        if (this.C == -1) {
                            int i77 = this.f162646w;
                            if (i77 > 0 && this.f162649z == 0) {
                                this.C = 0;
                            } else if (i77 == 0 && this.f162649z > 0) {
                                this.D = 1.0f / this.D;
                                this.C = 1;
                            }
                        }
                        i36 = i54;
                        i35 = i29;
                        z26 = true;
                        int[] iArr2 = this.f162644v;
                        iArr2[0] = i36;
                        iArr2[1] = i37;
                        if (z26) {
                            int i610 = this.C;
                            i38 = -1;
                            if (i610 != 0) {
                            }
                            if (z26) {
                                z27 = false;
                            } else {
                                z27 = false;
                            }
                            bVar4 = this.W[0];
                            bVar5 = b.WRAP_CONTENT;
                            if (bVar4 == bVar5) {
                                z28 = false;
                            } else {
                                z28 = false;
                            }
                            if (z28) {
                                i26 = 0;
                            }
                            dVar3 = this.S;
                            z29 = !dVar3.h();
                            boolean z312 = zArr3[0];
                            boolean z313 = zArr3[1];
                            if (this.f162634q != 2) {
                                hVar2 = hVarK;
                                hVar3 = hVarK2;
                                bVar6 = bVar5;
                                hVar4 = hVarK5;
                                r19 = r14;
                                r15 = i24;
                                i39 = i36;
                                r16 = i19;
                                i44 = i37;
                                z34 = z29;
                            } else {
                                hVar2 = hVarK;
                                hVar3 = hVarK2;
                                bVar6 = bVar5;
                                hVar4 = hVarK5;
                                r19 = r14;
                                r15 = i24;
                                i39 = i36;
                                r16 = i19;
                                i44 = i37;
                                z34 = z29;
                            }
                            if (z14) {
                                hVar5 = r33;
                                hVar6 = hVar;
                                hVar7 = hVar4;
                                i45 = 0;
                                c14 = 1;
                                i46 = 8;
                                i47 = 1;
                            } else {
                                hVar5 = r33;
                                hVar6 = hVar;
                                hVar7 = hVar4;
                                i45 = 0;
                                c14 = 1;
                                i46 = 8;
                                i47 = 1;
                            }
                            if (this.f162636r == 2) {
                                i47 = i45;
                            }
                            if (i47 != 0) {
                                hVar8 = hVar5;
                            } else {
                                hVar8 = hVar5;
                            }
                            if (z26) {
                                i48 = this.C;
                                f15 = this.D;
                                if (i48 == 1) {
                                    m6.b bVarL9 = dVar4.l();
                                    bVarL9.f116814d.k(hVar6, -1.0f);
                                    bVarL9.f116814d.k(hVar8, 1.0f);
                                    bVarL9.f116814d.k(hVar3, f15);
                                    bVarL9.f116814d.k(hVar2, -f15);
                                    dVar4.c(bVarL9);
                                } else {
                                    m6.b bVarL10 = dVar4.l();
                                    bVarL10.f116814d.k(hVar3, -1.0f);
                                    bVarL10.f116814d.k(hVar2, 1.0f);
                                    bVarL10.f116814d.k(hVar6, f15);
                                    bVarL10.f116814d.k(hVar8, -f15);
                                    dVar4.c(bVarL10);
                                }
                            }
                            if (dVar3.h()) {
                                e eVar13 = dVar3.f162588f.f162586d;
                                float radians3 = (float) Math.toRadians(this.F + 90.0f);
                                int iE3 = dVar3.e();
                                d.a aVar9 = d.a.LEFT;
                                m6.h hVarK116 = dVar4.k(k(aVar9));
                                d.a aVar10 = d.a.TOP;
                                m6.h hVarK117 = dVar4.k(k(aVar10));
                                d.a aVar11 = d.a.RIGHT;
                                m6.h hVarK118 = dVar4.k(k(aVar11));
                                d.a aVar12 = d.a.BOTTOM;
                                m6.h hVarK119 = dVar4.k(k(aVar12));
                                m6.h hVarK1110 = dVar4.k(eVar13.k(aVar9));
                                m6.h hVarK1111 = dVar4.k(eVar13.k(aVar10));
                                m6.h hVarK1112 = dVar4.k(eVar13.k(aVar11));
                                m6.h hVarK1113 = dVar4.k(eVar13.k(aVar12));
                                m6.b bVarL11 = dVar4.l();
                                double d18 = radians3;
                                double dSin3 = Math.sin(d18);
                                double d19 = iE3;
                                bVarL11.f116814d.k(hVarK1111, 0.5f);
                                bVarL11.f116814d.k(hVarK1113, 0.5f);
                                bVarL11.f116814d.k(hVarK117, -0.5f);
                                bVarL11.f116814d.k(hVarK119, -0.5f);
                                bVarL11.f116812b = -((float) (dSin3 * d19));
                                dVar4.c(bVarL11);
                                m6.b bVarL12 = dVar4.l();
                                float fCos3 = (float) (Math.cos(d18) * d19);
                                bVarL12.f116814d.k(hVarK1110, 0.5f);
                                bVarL12.f116814d.k(hVarK1112, 0.5f);
                                bVarL12.f116814d.k(hVarK116, -0.5f);
                                bVarL12.f116814d.k(hVarK118, -0.5f);
                                bVarL12.f116812b = -fCos3;
                                dVar4.c(bVarL12);
                            }
                            this.f162626m = false;
                            this.f162628n = false;
                            eVar4 = m6.d.f116820r;
                            if (eVar4 != null) {
                                eVar4.getClass();
                            }
                        }
                        i38 = -1;
                        if (z26) {
                            z27 = false;
                        } else {
                            z27 = false;
                        }
                        bVar4 = this.W[0];
                        bVar5 = b.WRAP_CONTENT;
                        if (bVar4 == bVar5) {
                            z28 = false;
                        } else {
                            z28 = false;
                        }
                        if (z28) {
                            i26 = 0;
                        }
                        dVar3 = this.S;
                        z29 = !dVar3.h();
                        boolean z314 = zArr3[0];
                        boolean z315 = zArr3[1];
                        if (this.f162634q != 2) {
                            hVar2 = hVarK;
                            hVar3 = hVarK2;
                            bVar6 = bVar5;
                            hVar4 = hVarK5;
                            r19 = r14;
                            r15 = i24;
                            i39 = i36;
                            r16 = i19;
                            i44 = i37;
                            z34 = z29;
                        } else {
                            hVar2 = hVarK;
                            hVar3 = hVarK2;
                            bVar6 = bVar5;
                            hVar4 = hVarK5;
                            r19 = r14;
                            r15 = i24;
                            i39 = i36;
                            r16 = i19;
                            i44 = i37;
                            z34 = z29;
                        }
                        if (z14) {
                            hVar5 = r33;
                            hVar6 = hVar;
                            hVar7 = hVar4;
                            i45 = 0;
                            c14 = 1;
                            i46 = 8;
                            i47 = 1;
                        } else {
                            hVar5 = r33;
                            hVar6 = hVar;
                            hVar7 = hVar4;
                            i45 = 0;
                            c14 = 1;
                            i46 = 8;
                            i47 = 1;
                        }
                        if (this.f162636r == 2) {
                            i47 = i45;
                        }
                        if (i47 != 0) {
                            hVar8 = hVar5;
                        } else {
                            hVar8 = hVar5;
                        }
                        if (z26) {
                            i48 = this.C;
                            f15 = this.D;
                            if (i48 == 1) {
                                m6.b bVarL13 = dVar4.l();
                                bVarL13.f116814d.k(hVar6, -1.0f);
                                bVarL13.f116814d.k(hVar8, 1.0f);
                                bVarL13.f116814d.k(hVar3, f15);
                                bVarL13.f116814d.k(hVar2, -f15);
                                dVar4.c(bVarL13);
                            } else {
                                m6.b bVarL14 = dVar4.l();
                                bVarL14.f116814d.k(hVar3, -1.0f);
                                bVarL14.f116814d.k(hVar2, 1.0f);
                                bVarL14.f116814d.k(hVar6, f15);
                                bVarL14.f116814d.k(hVar8, -f15);
                                dVar4.c(bVarL14);
                            }
                        }
                        if (dVar3.h()) {
                            e eVar14 = dVar3.f162588f.f162586d;
                            float radians4 = (float) Math.toRadians(this.F + 90.0f);
                            int iE4 = dVar3.e();
                            d.a aVar13 = d.a.LEFT;
                            m6.h hVarK1114 = dVar4.k(k(aVar13));
                            d.a aVar14 = d.a.TOP;
                            m6.h hVarK1115 = dVar4.k(k(aVar14));
                            d.a aVar15 = d.a.RIGHT;
                            m6.h hVarK1116 = dVar4.k(k(aVar15));
                            d.a aVar16 = d.a.BOTTOM;
                            m6.h hVarK1117 = dVar4.k(k(aVar16));
                            m6.h hVarK1118 = dVar4.k(eVar14.k(aVar13));
                            m6.h hVarK1119 = dVar4.k(eVar14.k(aVar14));
                            m6.h hVarK11110 = dVar4.k(eVar14.k(aVar15));
                            m6.h hVarK11111 = dVar4.k(eVar14.k(aVar16));
                            m6.b bVarL15 = dVar4.l();
                            double d110 = radians4;
                            double dSin4 = Math.sin(d110);
                            double d111 = iE4;
                            bVarL15.f116814d.k(hVarK1119, 0.5f);
                            bVarL15.f116814d.k(hVarK11111, 0.5f);
                            bVarL15.f116814d.k(hVarK1115, -0.5f);
                            bVarL15.f116814d.k(hVarK1117, -0.5f);
                            bVarL15.f116812b = -((float) (dSin4 * d111));
                            dVar4.c(bVarL15);
                            m6.b bVarL16 = dVar4.l();
                            float fCos4 = (float) (Math.cos(d110) * d111);
                            bVarL16.f116814d.k(hVarK1118, 0.5f);
                            bVarL16.f116814d.k(hVarK11110, 0.5f);
                            bVarL16.f116814d.k(hVarK1114, -0.5f);
                            bVarL16.f116814d.k(hVarK1116, -0.5f);
                            bVarL16.f116812b = -fCos4;
                            dVar4.c(bVarL16);
                        }
                        this.f162626m = false;
                        this.f162628n = false;
                        eVar4 = m6.d.f116820r;
                        if (eVar4 != null) {
                            eVar4.getClass();
                        }
                    }
                    z26 = false;
                    int[] iArr3 = this.f162644v;
                    iArr3[0] = i36;
                    iArr3[1] = i37;
                    if (z26) {
                        int i611 = this.C;
                        i38 = -1;
                        if (i611 != 0) {
                        }
                        if (z26) {
                            z27 = false;
                        } else {
                            z27 = false;
                        }
                        bVar4 = this.W[0];
                        bVar5 = b.WRAP_CONTENT;
                        if (bVar4 == bVar5) {
                            z28 = false;
                        } else {
                            z28 = false;
                        }
                        if (z28) {
                            i26 = 0;
                        }
                        dVar3 = this.S;
                        z29 = !dVar3.h();
                        boolean z316 = zArr3[0];
                        boolean z317 = zArr3[1];
                        if (this.f162634q != 2) {
                            hVar2 = hVarK;
                            hVar3 = hVarK2;
                            bVar6 = bVar5;
                            hVar4 = hVarK5;
                            r19 = r14;
                            r15 = i24;
                            i39 = i36;
                            r16 = i19;
                            i44 = i37;
                            z34 = z29;
                        } else {
                            hVar2 = hVarK;
                            hVar3 = hVarK2;
                            bVar6 = bVar5;
                            hVar4 = hVarK5;
                            r19 = r14;
                            r15 = i24;
                            i39 = i36;
                            r16 = i19;
                            i44 = i37;
                            z34 = z29;
                        }
                        if (z14) {
                            hVar5 = r33;
                            hVar6 = hVar;
                            hVar7 = hVar4;
                            i45 = 0;
                            c14 = 1;
                            i46 = 8;
                            i47 = 1;
                        } else {
                            hVar5 = r33;
                            hVar6 = hVar;
                            hVar7 = hVar4;
                            i45 = 0;
                            c14 = 1;
                            i46 = 8;
                            i47 = 1;
                        }
                        if (this.f162636r == 2) {
                            i47 = i45;
                        }
                        if (i47 != 0) {
                            hVar8 = hVar5;
                        } else {
                            hVar8 = hVar5;
                        }
                        if (z26) {
                            i48 = this.C;
                            f15 = this.D;
                            if (i48 == 1) {
                                m6.b bVarL17 = dVar4.l();
                                bVarL17.f116814d.k(hVar6, -1.0f);
                                bVarL17.f116814d.k(hVar8, 1.0f);
                                bVarL17.f116814d.k(hVar3, f15);
                                bVarL17.f116814d.k(hVar2, -f15);
                                dVar4.c(bVarL17);
                            } else {
                                m6.b bVarL18 = dVar4.l();
                                bVarL18.f116814d.k(hVar3, -1.0f);
                                bVarL18.f116814d.k(hVar2, 1.0f);
                                bVarL18.f116814d.k(hVar6, f15);
                                bVarL18.f116814d.k(hVar8, -f15);
                                dVar4.c(bVarL18);
                            }
                        }
                        if (dVar3.h()) {
                            e eVar15 = dVar3.f162588f.f162586d;
                            float radians5 = (float) Math.toRadians(this.F + 90.0f);
                            int iE5 = dVar3.e();
                            d.a aVar17 = d.a.LEFT;
                            m6.h hVarK11112 = dVar4.k(k(aVar17));
                            d.a aVar18 = d.a.TOP;
                            m6.h hVarK11113 = dVar4.k(k(aVar18));
                            d.a aVar19 = d.a.RIGHT;
                            m6.h hVarK11114 = dVar4.k(k(aVar19));
                            d.a aVar110 = d.a.BOTTOM;
                            m6.h hVarK11115 = dVar4.k(k(aVar110));
                            m6.h hVarK11116 = dVar4.k(eVar15.k(aVar17));
                            m6.h hVarK11117 = dVar4.k(eVar15.k(aVar18));
                            m6.h hVarK11118 = dVar4.k(eVar15.k(aVar19));
                            m6.h hVarK11119 = dVar4.k(eVar15.k(aVar110));
                            m6.b bVarL19 = dVar4.l();
                            double d112 = radians5;
                            double dSin5 = Math.sin(d112);
                            double d113 = iE5;
                            bVarL19.f116814d.k(hVarK11117, 0.5f);
                            bVarL19.f116814d.k(hVarK11119, 0.5f);
                            bVarL19.f116814d.k(hVarK11113, -0.5f);
                            bVarL19.f116814d.k(hVarK11115, -0.5f);
                            bVarL19.f116812b = -((float) (dSin5 * d113));
                            dVar4.c(bVarL19);
                            m6.b bVarL110 = dVar4.l();
                            float fCos5 = (float) (Math.cos(d112) * d113);
                            bVarL110.f116814d.k(hVarK11116, 0.5f);
                            bVarL110.f116814d.k(hVarK11118, 0.5f);
                            bVarL110.f116814d.k(hVarK11112, -0.5f);
                            bVarL110.f116814d.k(hVarK11114, -0.5f);
                            bVarL110.f116812b = -fCos5;
                            dVar4.c(bVarL110);
                        }
                        this.f162626m = false;
                        this.f162628n = false;
                        eVar4 = m6.d.f116820r;
                        if (eVar4 != null) {
                            eVar4.getClass();
                        }
                    }
                    i38 = -1;
                    if (z26) {
                        z27 = false;
                    } else {
                        z27 = false;
                    }
                    bVar4 = this.W[0];
                    bVar5 = b.WRAP_CONTENT;
                    if (bVar4 == bVar5) {
                        z28 = false;
                    } else {
                        z28 = false;
                    }
                    if (z28) {
                        i26 = 0;
                    }
                    dVar3 = this.S;
                    z29 = !dVar3.h();
                    boolean z318 = zArr3[0];
                    boolean z319 = zArr3[1];
                    if (this.f162634q != 2) {
                        hVar2 = hVarK;
                        hVar3 = hVarK2;
                        bVar6 = bVar5;
                        hVar4 = hVarK5;
                        r19 = r14;
                        r15 = i24;
                        i39 = i36;
                        r16 = i19;
                        i44 = i37;
                        z34 = z29;
                    } else {
                        hVar2 = hVarK;
                        hVar3 = hVarK2;
                        bVar6 = bVar5;
                        hVar4 = hVarK5;
                        r19 = r14;
                        r15 = i24;
                        i39 = i36;
                        r16 = i19;
                        i44 = i37;
                        z34 = z29;
                    }
                    if (z14) {
                        hVar5 = r33;
                        hVar6 = hVar;
                        hVar7 = hVar4;
                        i45 = 0;
                        c14 = 1;
                        i46 = 8;
                        i47 = 1;
                    } else {
                        hVar5 = r33;
                        hVar6 = hVar;
                        hVar7 = hVar4;
                        i45 = 0;
                        c14 = 1;
                        i46 = 8;
                        i47 = 1;
                    }
                    if (this.f162636r == 2) {
                        i47 = i45;
                    }
                    if (i47 != 0) {
                        hVar8 = hVar5;
                    } else {
                        hVar8 = hVar5;
                    }
                    if (z26) {
                        i48 = this.C;
                        f15 = this.D;
                        if (i48 == 1) {
                            m6.b bVarL111 = dVar4.l();
                            bVarL111.f116814d.k(hVar6, -1.0f);
                            bVarL111.f116814d.k(hVar8, 1.0f);
                            bVarL111.f116814d.k(hVar3, f15);
                            bVarL111.f116814d.k(hVar2, -f15);
                            dVar4.c(bVarL111);
                        } else {
                            m6.b bVarL112 = dVar4.l();
                            bVarL112.f116814d.k(hVar3, -1.0f);
                            bVarL112.f116814d.k(hVar2, 1.0f);
                            bVarL112.f116814d.k(hVar6, f15);
                            bVarL112.f116814d.k(hVar8, -f15);
                            dVar4.c(bVarL112);
                        }
                    }
                    if (dVar3.h()) {
                        e eVar16 = dVar3.f162588f.f162586d;
                        float radians6 = (float) Math.toRadians(this.F + 90.0f);
                        int iE6 = dVar3.e();
                        d.a aVar111 = d.a.LEFT;
                        m6.h hVarK111110 = dVar4.k(k(aVar111));
                        d.a aVar112 = d.a.TOP;
                        m6.h hVarK111111 = dVar4.k(k(aVar112));
                        d.a aVar113 = d.a.RIGHT;
                        m6.h hVarK111112 = dVar4.k(k(aVar113));
                        d.a aVar114 = d.a.BOTTOM;
                        m6.h hVarK111113 = dVar4.k(k(aVar114));
                        m6.h hVarK111114 = dVar4.k(eVar16.k(aVar111));
                        m6.h hVarK111115 = dVar4.k(eVar16.k(aVar112));
                        m6.h hVarK111116 = dVar4.k(eVar16.k(aVar113));
                        m6.h hVarK111117 = dVar4.k(eVar16.k(aVar114));
                        m6.b bVarL113 = dVar4.l();
                        double d114 = radians6;
                        double dSin6 = Math.sin(d114);
                        double d115 = iE6;
                        bVarL113.f116814d.k(hVarK111115, 0.5f);
                        bVarL113.f116814d.k(hVarK111117, 0.5f);
                        bVarL113.f116814d.k(hVarK111111, -0.5f);
                        bVarL113.f116814d.k(hVarK111113, -0.5f);
                        bVarL113.f116812b = -((float) (dSin6 * d115));
                        dVar4.c(bVarL113);
                        m6.b bVarL114 = dVar4.l();
                        float fCos6 = (float) (Math.cos(d114) * d115);
                        bVarL114.f116814d.k(hVarK111114, 0.5f);
                        bVarL114.f116814d.k(hVarK111116, 0.5f);
                        bVarL114.f116814d.k(hVarK111110, -0.5f);
                        bVarL114.f116814d.k(hVarK111112, -0.5f);
                        bVarL114.f116812b = -fCos6;
                        dVar4.c(bVarL114);
                    }
                    this.f162626m = false;
                    this.f162628n = false;
                    eVar4 = m6.d.f116820r;
                    if (eVar4 != null) {
                        eVar4.getClass();
                    }
                }
                hVar = hVarK4;
                i35 = i29;
                i36 = i30;
                i37 = i34;
                z26 = false;
                int[] iArr4 = this.f162644v;
                iArr4[0] = i36;
                iArr4[1] = i37;
                if (z26) {
                    int i612 = this.C;
                    i38 = -1;
                    if (i612 != 0) {
                    }
                    if (z26) {
                        z27 = false;
                    } else {
                        z27 = false;
                    }
                    bVar4 = this.W[0];
                    bVar5 = b.WRAP_CONTENT;
                    if (bVar4 == bVar5) {
                        z28 = false;
                    } else {
                        z28 = false;
                    }
                    if (z28) {
                        i26 = 0;
                    }
                    dVar3 = this.S;
                    z29 = !dVar3.h();
                    boolean z3110 = zArr3[0];
                    boolean z3111 = zArr3[1];
                    if (this.f162634q != 2) {
                        hVar2 = hVarK;
                        hVar3 = hVarK2;
                        bVar6 = bVar5;
                        hVar4 = hVarK5;
                        r19 = r14;
                        r15 = i24;
                        i39 = i36;
                        r16 = i19;
                        i44 = i37;
                        z34 = z29;
                    } else {
                        hVar2 = hVarK;
                        hVar3 = hVarK2;
                        bVar6 = bVar5;
                        hVar4 = hVarK5;
                        r19 = r14;
                        r15 = i24;
                        i39 = i36;
                        r16 = i19;
                        i44 = i37;
                        z34 = z29;
                    }
                    if (z14) {
                        hVar5 = r33;
                        hVar6 = hVar;
                        hVar7 = hVar4;
                        i45 = 0;
                        c14 = 1;
                        i46 = 8;
                        i47 = 1;
                    } else {
                        hVar5 = r33;
                        hVar6 = hVar;
                        hVar7 = hVar4;
                        i45 = 0;
                        c14 = 1;
                        i46 = 8;
                        i47 = 1;
                    }
                    if (this.f162636r == 2) {
                        i47 = i45;
                    }
                    if (i47 != 0) {
                        hVar8 = hVar5;
                    } else {
                        hVar8 = hVar5;
                    }
                    if (z26) {
                        i48 = this.C;
                        f15 = this.D;
                        if (i48 == 1) {
                            m6.b bVarL115 = dVar4.l();
                            bVarL115.f116814d.k(hVar6, -1.0f);
                            bVarL115.f116814d.k(hVar8, 1.0f);
                            bVarL115.f116814d.k(hVar3, f15);
                            bVarL115.f116814d.k(hVar2, -f15);
                            dVar4.c(bVarL115);
                        } else {
                            m6.b bVarL116 = dVar4.l();
                            bVarL116.f116814d.k(hVar3, -1.0f);
                            bVarL116.f116814d.k(hVar2, 1.0f);
                            bVarL116.f116814d.k(hVar6, f15);
                            bVarL116.f116814d.k(hVar8, -f15);
                            dVar4.c(bVarL116);
                        }
                    }
                    if (dVar3.h()) {
                        e eVar17 = dVar3.f162588f.f162586d;
                        float radians7 = (float) Math.toRadians(this.F + 90.0f);
                        int iE7 = dVar3.e();
                        d.a aVar115 = d.a.LEFT;
                        m6.h hVarK111118 = dVar4.k(k(aVar115));
                        d.a aVar116 = d.a.TOP;
                        m6.h hVarK111119 = dVar4.k(k(aVar116));
                        d.a aVar117 = d.a.RIGHT;
                        m6.h hVarK1111110 = dVar4.k(k(aVar117));
                        d.a aVar118 = d.a.BOTTOM;
                        m6.h hVarK1111111 = dVar4.k(k(aVar118));
                        m6.h hVarK1111112 = dVar4.k(eVar17.k(aVar115));
                        m6.h hVarK1111113 = dVar4.k(eVar17.k(aVar116));
                        m6.h hVarK1111114 = dVar4.k(eVar17.k(aVar117));
                        m6.h hVarK1111115 = dVar4.k(eVar17.k(aVar118));
                        m6.b bVarL117 = dVar4.l();
                        double d116 = radians7;
                        double dSin7 = Math.sin(d116);
                        double d117 = iE7;
                        bVarL117.f116814d.k(hVarK1111113, 0.5f);
                        bVarL117.f116814d.k(hVarK1111115, 0.5f);
                        bVarL117.f116814d.k(hVarK111119, -0.5f);
                        bVarL117.f116814d.k(hVarK1111111, -0.5f);
                        bVarL117.f116812b = -((float) (dSin7 * d117));
                        dVar4.c(bVarL117);
                        m6.b bVarL118 = dVar4.l();
                        float fCos7 = (float) (Math.cos(d116) * d117);
                        bVarL118.f116814d.k(hVarK1111112, 0.5f);
                        bVarL118.f116814d.k(hVarK1111114, 0.5f);
                        bVarL118.f116814d.k(hVarK111118, -0.5f);
                        bVarL118.f116814d.k(hVarK1111110, -0.5f);
                        bVarL118.f116812b = -fCos7;
                        dVar4.c(bVarL118);
                    }
                    this.f162626m = false;
                    this.f162628n = false;
                    eVar4 = m6.d.f116820r;
                    if (eVar4 != null) {
                        eVar4.getClass();
                    }
                }
                i38 = -1;
                if (z26) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                bVar4 = this.W[0];
                bVar5 = b.WRAP_CONTENT;
                if (bVar4 == bVar5) {
                    z28 = false;
                } else {
                    z28 = false;
                }
                if (z28) {
                    i26 = 0;
                }
                dVar3 = this.S;
                z29 = !dVar3.h();
                boolean z3112 = zArr3[0];
                boolean z3113 = zArr3[1];
                if (this.f162634q != 2) {
                    hVar2 = hVarK;
                    hVar3 = hVarK2;
                    bVar6 = bVar5;
                    hVar4 = hVarK5;
                    r19 = r14;
                    r15 = i24;
                    i39 = i36;
                    r16 = i19;
                    i44 = i37;
                    z34 = z29;
                } else {
                    hVar2 = hVarK;
                    hVar3 = hVarK2;
                    bVar6 = bVar5;
                    hVar4 = hVarK5;
                    r19 = r14;
                    r15 = i24;
                    i39 = i36;
                    r16 = i19;
                    i44 = i37;
                    z34 = z29;
                }
                if (z14) {
                    hVar5 = r33;
                    hVar6 = hVar;
                    hVar7 = hVar4;
                    i45 = 0;
                    c14 = 1;
                    i46 = 8;
                    i47 = 1;
                } else {
                    hVar5 = r33;
                    hVar6 = hVar;
                    hVar7 = hVar4;
                    i45 = 0;
                    c14 = 1;
                    i46 = 8;
                    i47 = 1;
                }
                if (this.f162636r == 2) {
                    i47 = i45;
                }
                if (i47 != 0) {
                    hVar8 = hVar5;
                } else {
                    hVar8 = hVar5;
                }
                if (z26) {
                    i48 = this.C;
                    f15 = this.D;
                    if (i48 == 1) {
                        m6.b bVarL119 = dVar4.l();
                        bVarL119.f116814d.k(hVar6, -1.0f);
                        bVarL119.f116814d.k(hVar8, 1.0f);
                        bVarL119.f116814d.k(hVar3, f15);
                        bVarL119.f116814d.k(hVar2, -f15);
                        dVar4.c(bVarL119);
                    } else {
                        m6.b bVarL1110 = dVar4.l();
                        bVarL1110.f116814d.k(hVar3, -1.0f);
                        bVarL1110.f116814d.k(hVar2, 1.0f);
                        bVarL1110.f116814d.k(hVar6, f15);
                        bVarL1110.f116814d.k(hVar8, -f15);
                        dVar4.c(bVarL1110);
                    }
                }
                if (dVar3.h()) {
                    e eVar18 = dVar3.f162588f.f162586d;
                    float radians8 = (float) Math.toRadians(this.F + 90.0f);
                    int iE8 = dVar3.e();
                    d.a aVar119 = d.a.LEFT;
                    m6.h hVarK1111116 = dVar4.k(k(aVar119));
                    d.a aVar1110 = d.a.TOP;
                    m6.h hVarK1111117 = dVar4.k(k(aVar1110));
                    d.a aVar1111 = d.a.RIGHT;
                    m6.h hVarK1111118 = dVar4.k(k(aVar1111));
                    d.a aVar1112 = d.a.BOTTOM;
                    m6.h hVarK1111119 = dVar4.k(k(aVar1112));
                    m6.h hVarK11111110 = dVar4.k(eVar18.k(aVar119));
                    m6.h hVarK11111111 = dVar4.k(eVar18.k(aVar1110));
                    m6.h hVarK11111112 = dVar4.k(eVar18.k(aVar1111));
                    m6.h hVarK11111113 = dVar4.k(eVar18.k(aVar1112));
                    m6.b bVarL1111 = dVar4.l();
                    double d118 = radians8;
                    double dSin8 = Math.sin(d118);
                    double d119 = iE8;
                    bVarL1111.f116814d.k(hVarK11111111, 0.5f);
                    bVarL1111.f116814d.k(hVarK11111113, 0.5f);
                    bVarL1111.f116814d.k(hVarK1111117, -0.5f);
                    bVarL1111.f116814d.k(hVarK1111119, -0.5f);
                    bVarL1111.f116812b = -((float) (dSin8 * d119));
                    dVar4.c(bVarL1111);
                    m6.b bVarL1112 = dVar4.l();
                    float fCos8 = (float) (Math.cos(d118) * d119);
                    bVarL1112.f116814d.k(hVarK11111110, 0.5f);
                    bVarL1112.f116814d.k(hVarK11111112, 0.5f);
                    bVarL1112.f116814d.k(hVarK1111116, -0.5f);
                    bVarL1112.f116814d.k(hVarK1111118, -0.5f);
                    bVarL1112.f116812b = -fCos8;
                    dVar4.c(bVarL1112);
                }
                this.f162626m = false;
                this.f162628n = false;
                eVar4 = m6.d.f116820r;
                if (eVar4 != null) {
                    eVar4.getClass();
                }
            }
            dVar2 = dVar9;
            zArr2 = zArr;
            zArr3 = zArr4;
            if (eVar3 != null) {
                eVar3.f116841e++;
            }
            if (this.X != null) {
                if (y(0)) {
                    ((f) this.X).Y(this, 0);
                    int i510 = i14;
                    i55 = i510 == true ? 1 : 0;
                    Z = i510;
                } else {
                    i55 = i14;
                    Z = z();
                }
                if (y(i55)) {
                    ((f) this.X).Y(this, i55);
                    zA = true;
                } else {
                    zA = A();
                }
                if (Z == 0) {
                    dVar4.f(dVar4.k(this.X.N), hVarK2, 0, 1);
                }
                if (!zA) {
                    dVar4.f(dVar4.k(this.X.O), hVarK4, 0, 1);
                }
                r14 = Z;
                z19 = zA;
            } else {
                r14 = 0;
                z19 = false;
            }
            i25 = this.Y;
            i26 = this.f162613f0;
            if (i25 >= i26) {
                i26 = i25;
            }
            i27 = this.Z;
            i28 = this.f162615g0;
            if (i27 < i28) {
                i29 = i28;
            } else {
                i29 = i27;
            }
            b[] bVarArr5 = this.W;
            bVar = bVarArr5[0];
            bVar2 = b.MATCH_CONSTRAINT;
            if (bVar != bVar2) {
                z24 = true;
            } else {
                z24 = false;
            }
            bVar3 = bVarArr5[1];
            if (bVar3 != bVar2) {
                z25 = true;
            } else {
                z25 = false;
            }
            int i613 = this.f162605b0;
            this.C = i613;
            f14 = this.f162603a0;
            this.D = f14;
            i30 = this.f162640t;
            i34 = this.f162642u;
            if (f14 > 0.0f) {
                hVar = hVarK4;
                if (this.f162623k0 != 8) {
                    if (bVar == bVar2) {
                        i54 = i30;
                    } else {
                        i54 = i30;
                    }
                    if (bVar3 == bVar2) {
                        i37 = i34;
                    } else {
                        i37 = i34;
                    }
                    if (bVar == bVar2) {
                        if (bVar == bVar2) {
                            if (bVar3 != bVar2) {
                                i36 = i54;
                                i35 = i29;
                            } else {
                                i36 = i54;
                                i35 = i29;
                            }
                            z26 = true;
                        } else {
                            if (bVar3 != bVar2) {
                                i36 = i54;
                                i35 = i29;
                            } else {
                                i36 = i54;
                                i35 = i29;
                            }
                            z26 = true;
                        }
                    } else if (bVar == bVar2) {
                        if (bVar3 != bVar2) {
                            i36 = i54;
                            i35 = i29;
                        } else {
                            i36 = i54;
                            i35 = i29;
                        }
                        z26 = true;
                    } else {
                        if (bVar3 != bVar2) {
                            i36 = i54;
                            i35 = i29;
                        } else {
                            i36 = i54;
                            i35 = i29;
                        }
                        z26 = true;
                    }
                    int[] iArr5 = this.f162644v;
                    iArr5[0] = i36;
                    iArr5[1] = i37;
                    if (z26) {
                        int i614 = this.C;
                        i38 = -1;
                        if (i614 != 0) {
                        }
                        if (z26) {
                            z27 = false;
                        } else {
                            z27 = false;
                        }
                        bVar4 = this.W[0];
                        bVar5 = b.WRAP_CONTENT;
                        if (bVar4 == bVar5) {
                            z28 = false;
                        } else {
                            z28 = false;
                        }
                        if (z28) {
                            i26 = 0;
                        }
                        dVar3 = this.S;
                        z29 = !dVar3.h();
                        boolean z3114 = zArr3[0];
                        boolean z3115 = zArr3[1];
                        if (this.f162634q != 2) {
                            hVar2 = hVarK;
                            hVar3 = hVarK2;
                            bVar6 = bVar5;
                            hVar4 = hVarK5;
                            r19 = r14;
                            r15 = i24;
                            i39 = i36;
                            r16 = i19;
                            i44 = i37;
                            z34 = z29;
                        } else {
                            hVar2 = hVarK;
                            hVar3 = hVarK2;
                            bVar6 = bVar5;
                            hVar4 = hVarK5;
                            r19 = r14;
                            r15 = i24;
                            i39 = i36;
                            r16 = i19;
                            i44 = i37;
                            z34 = z29;
                        }
                        if (z14) {
                            hVar5 = r33;
                            hVar6 = hVar;
                            hVar7 = hVar4;
                            i45 = 0;
                            c14 = 1;
                            i46 = 8;
                            i47 = 1;
                        } else {
                            hVar5 = r33;
                            hVar6 = hVar;
                            hVar7 = hVar4;
                            i45 = 0;
                            c14 = 1;
                            i46 = 8;
                            i47 = 1;
                        }
                        if (this.f162636r == 2) {
                            i47 = i45;
                        }
                        if (i47 != 0) {
                            hVar8 = hVar5;
                        } else {
                            hVar8 = hVar5;
                        }
                        if (z26) {
                            i48 = this.C;
                            f15 = this.D;
                            if (i48 == 1) {
                                m6.b bVarL1113 = dVar4.l();
                                bVarL1113.f116814d.k(hVar6, -1.0f);
                                bVarL1113.f116814d.k(hVar8, 1.0f);
                                bVarL1113.f116814d.k(hVar3, f15);
                                bVarL1113.f116814d.k(hVar2, -f15);
                                dVar4.c(bVarL1113);
                            } else {
                                m6.b bVarL1114 = dVar4.l();
                                bVarL1114.f116814d.k(hVar3, -1.0f);
                                bVarL1114.f116814d.k(hVar2, 1.0f);
                                bVarL1114.f116814d.k(hVar6, f15);
                                bVarL1114.f116814d.k(hVar8, -f15);
                                dVar4.c(bVarL1114);
                            }
                        }
                        if (dVar3.h()) {
                            e eVar19 = dVar3.f162588f.f162586d;
                            float radians9 = (float) Math.toRadians(this.F + 90.0f);
                            int iE9 = dVar3.e();
                            d.a aVar1113 = d.a.LEFT;
                            m6.h hVarK11111114 = dVar4.k(k(aVar1113));
                            d.a aVar1114 = d.a.TOP;
                            m6.h hVarK11111115 = dVar4.k(k(aVar1114));
                            d.a aVar1115 = d.a.RIGHT;
                            m6.h hVarK11111116 = dVar4.k(k(aVar1115));
                            d.a aVar1116 = d.a.BOTTOM;
                            m6.h hVarK11111117 = dVar4.k(k(aVar1116));
                            m6.h hVarK11111118 = dVar4.k(eVar19.k(aVar1113));
                            m6.h hVarK11111119 = dVar4.k(eVar19.k(aVar1114));
                            m6.h hVarK111111110 = dVar4.k(eVar19.k(aVar1115));
                            m6.h hVarK111111111 = dVar4.k(eVar19.k(aVar1116));
                            m6.b bVarL1115 = dVar4.l();
                            double d1110 = radians9;
                            double dSin9 = Math.sin(d1110);
                            double d1111 = iE9;
                            bVarL1115.f116814d.k(hVarK11111119, 0.5f);
                            bVarL1115.f116814d.k(hVarK111111111, 0.5f);
                            bVarL1115.f116814d.k(hVarK11111115, -0.5f);
                            bVarL1115.f116814d.k(hVarK11111117, -0.5f);
                            bVarL1115.f116812b = -((float) (dSin9 * d1111));
                            dVar4.c(bVarL1115);
                            m6.b bVarL1116 = dVar4.l();
                            float fCos9 = (float) (Math.cos(d1110) * d1111);
                            bVarL1116.f116814d.k(hVarK11111118, 0.5f);
                            bVarL1116.f116814d.k(hVarK111111110, 0.5f);
                            bVarL1116.f116814d.k(hVarK11111114, -0.5f);
                            bVarL1116.f116814d.k(hVarK11111116, -0.5f);
                            bVarL1116.f116812b = -fCos9;
                            dVar4.c(bVarL1116);
                        }
                        this.f162626m = false;
                        this.f162628n = false;
                        eVar4 = m6.d.f116820r;
                        if (eVar4 != null) {
                            eVar4.getClass();
                        }
                    }
                    i38 = -1;
                    if (z26) {
                        z27 = false;
                    } else {
                        z27 = false;
                    }
                    bVar4 = this.W[0];
                    bVar5 = b.WRAP_CONTENT;
                    if (bVar4 == bVar5) {
                        z28 = false;
                    } else {
                        z28 = false;
                    }
                    if (z28) {
                        i26 = 0;
                    }
                    dVar3 = this.S;
                    z29 = !dVar3.h();
                    boolean z3116 = zArr3[0];
                    boolean z3117 = zArr3[1];
                    if (this.f162634q != 2) {
                        hVar2 = hVarK;
                        hVar3 = hVarK2;
                        bVar6 = bVar5;
                        hVar4 = hVarK5;
                        r19 = r14;
                        r15 = i24;
                        i39 = i36;
                        r16 = i19;
                        i44 = i37;
                        z34 = z29;
                    } else {
                        hVar2 = hVarK;
                        hVar3 = hVarK2;
                        bVar6 = bVar5;
                        hVar4 = hVarK5;
                        r19 = r14;
                        r15 = i24;
                        i39 = i36;
                        r16 = i19;
                        i44 = i37;
                        z34 = z29;
                    }
                    if (z14) {
                        hVar5 = r33;
                        hVar6 = hVar;
                        hVar7 = hVar4;
                        i45 = 0;
                        c14 = 1;
                        i46 = 8;
                        i47 = 1;
                    } else {
                        hVar5 = r33;
                        hVar6 = hVar;
                        hVar7 = hVar4;
                        i45 = 0;
                        c14 = 1;
                        i46 = 8;
                        i47 = 1;
                    }
                    if (this.f162636r == 2) {
                        i47 = i45;
                    }
                    if (i47 != 0) {
                        hVar8 = hVar5;
                    } else {
                        hVar8 = hVar5;
                    }
                    if (z26) {
                        i48 = this.C;
                        f15 = this.D;
                        if (i48 == 1) {
                            m6.b bVarL1117 = dVar4.l();
                            bVarL1117.f116814d.k(hVar6, -1.0f);
                            bVarL1117.f116814d.k(hVar8, 1.0f);
                            bVarL1117.f116814d.k(hVar3, f15);
                            bVarL1117.f116814d.k(hVar2, -f15);
                            dVar4.c(bVarL1117);
                        } else {
                            m6.b bVarL1118 = dVar4.l();
                            bVarL1118.f116814d.k(hVar3, -1.0f);
                            bVarL1118.f116814d.k(hVar2, 1.0f);
                            bVarL1118.f116814d.k(hVar6, f15);
                            bVarL1118.f116814d.k(hVar8, -f15);
                            dVar4.c(bVarL1118);
                        }
                    }
                    if (dVar3.h()) {
                        e eVar110 = dVar3.f162588f.f162586d;
                        float radians10 = (float) Math.toRadians(this.F + 90.0f);
                        int iE10 = dVar3.e();
                        d.a aVar1117 = d.a.LEFT;
                        m6.h hVarK111111112 = dVar4.k(k(aVar1117));
                        d.a aVar1118 = d.a.TOP;
                        m6.h hVarK111111113 = dVar4.k(k(aVar1118));
                        d.a aVar1119 = d.a.RIGHT;
                        m6.h hVarK111111114 = dVar4.k(k(aVar1119));
                        d.a aVar11110 = d.a.BOTTOM;
                        m6.h hVarK111111115 = dVar4.k(k(aVar11110));
                        m6.h hVarK111111116 = dVar4.k(eVar110.k(aVar1117));
                        m6.h hVarK111111117 = dVar4.k(eVar110.k(aVar1118));
                        m6.h hVarK111111118 = dVar4.k(eVar110.k(aVar1119));
                        m6.h hVarK111111119 = dVar4.k(eVar110.k(aVar11110));
                        m6.b bVarL1119 = dVar4.l();
                        double d1112 = radians10;
                        double dSin10 = Math.sin(d1112);
                        double d1113 = iE10;
                        bVarL1119.f116814d.k(hVarK111111117, 0.5f);
                        bVarL1119.f116814d.k(hVarK111111119, 0.5f);
                        bVarL1119.f116814d.k(hVarK111111113, -0.5f);
                        bVarL1119.f116814d.k(hVarK111111115, -0.5f);
                        bVarL1119.f116812b = -((float) (dSin10 * d1113));
                        dVar4.c(bVarL1119);
                        m6.b bVarL11110 = dVar4.l();
                        float fCos10 = (float) (Math.cos(d1112) * d1113);
                        bVarL11110.f116814d.k(hVarK111111116, 0.5f);
                        bVarL11110.f116814d.k(hVarK111111118, 0.5f);
                        bVarL11110.f116814d.k(hVarK111111112, -0.5f);
                        bVarL11110.f116814d.k(hVarK111111114, -0.5f);
                        bVarL11110.f116812b = -fCos10;
                        dVar4.c(bVarL11110);
                    }
                    this.f162626m = false;
                    this.f162628n = false;
                    eVar4 = m6.d.f116820r;
                    if (eVar4 != null) {
                        eVar4.getClass();
                    }
                }
                z26 = false;
                int[] iArr6 = this.f162644v;
                iArr6[0] = i36;
                iArr6[1] = i37;
                if (z26) {
                    int i615 = this.C;
                    i38 = -1;
                    if (i615 != 0) {
                    }
                    if (z26) {
                        z27 = false;
                    } else {
                        z27 = false;
                    }
                    bVar4 = this.W[0];
                    bVar5 = b.WRAP_CONTENT;
                    if (bVar4 == bVar5) {
                        z28 = false;
                    } else {
                        z28 = false;
                    }
                    if (z28) {
                        i26 = 0;
                    }
                    dVar3 = this.S;
                    z29 = !dVar3.h();
                    boolean z3118 = zArr3[0];
                    boolean z3119 = zArr3[1];
                    if (this.f162634q != 2) {
                        hVar2 = hVarK;
                        hVar3 = hVarK2;
                        bVar6 = bVar5;
                        hVar4 = hVarK5;
                        r19 = r14;
                        r15 = i24;
                        i39 = i36;
                        r16 = i19;
                        i44 = i37;
                        z34 = z29;
                    } else {
                        hVar2 = hVarK;
                        hVar3 = hVarK2;
                        bVar6 = bVar5;
                        hVar4 = hVarK5;
                        r19 = r14;
                        r15 = i24;
                        i39 = i36;
                        r16 = i19;
                        i44 = i37;
                        z34 = z29;
                    }
                    if (z14) {
                        hVar5 = r33;
                        hVar6 = hVar;
                        hVar7 = hVar4;
                        i45 = 0;
                        c14 = 1;
                        i46 = 8;
                        i47 = 1;
                    } else {
                        hVar5 = r33;
                        hVar6 = hVar;
                        hVar7 = hVar4;
                        i45 = 0;
                        c14 = 1;
                        i46 = 8;
                        i47 = 1;
                    }
                    if (this.f162636r == 2) {
                        i47 = i45;
                    }
                    if (i47 != 0) {
                        hVar8 = hVar5;
                    } else {
                        hVar8 = hVar5;
                    }
                    if (z26) {
                        i48 = this.C;
                        f15 = this.D;
                        if (i48 == 1) {
                            m6.b bVarL11111 = dVar4.l();
                            bVarL11111.f116814d.k(hVar6, -1.0f);
                            bVarL11111.f116814d.k(hVar8, 1.0f);
                            bVarL11111.f116814d.k(hVar3, f15);
                            bVarL11111.f116814d.k(hVar2, -f15);
                            dVar4.c(bVarL11111);
                        } else {
                            m6.b bVarL11112 = dVar4.l();
                            bVarL11112.f116814d.k(hVar3, -1.0f);
                            bVarL11112.f116814d.k(hVar2, 1.0f);
                            bVarL11112.f116814d.k(hVar6, f15);
                            bVarL11112.f116814d.k(hVar8, -f15);
                            dVar4.c(bVarL11112);
                        }
                    }
                    if (dVar3.h()) {
                        e eVar111 = dVar3.f162588f.f162586d;
                        float radians11 = (float) Math.toRadians(this.F + 90.0f);
                        int iE11 = dVar3.e();
                        d.a aVar11111 = d.a.LEFT;
                        m6.h hVarK1111111110 = dVar4.k(k(aVar11111));
                        d.a aVar11112 = d.a.TOP;
                        m6.h hVarK1111111111 = dVar4.k(k(aVar11112));
                        d.a aVar11113 = d.a.RIGHT;
                        m6.h hVarK1111111112 = dVar4.k(k(aVar11113));
                        d.a aVar11114 = d.a.BOTTOM;
                        m6.h hVarK1111111113 = dVar4.k(k(aVar11114));
                        m6.h hVarK1111111114 = dVar4.k(eVar111.k(aVar11111));
                        m6.h hVarK1111111115 = dVar4.k(eVar111.k(aVar11112));
                        m6.h hVarK1111111116 = dVar4.k(eVar111.k(aVar11113));
                        m6.h hVarK1111111117 = dVar4.k(eVar111.k(aVar11114));
                        m6.b bVarL11113 = dVar4.l();
                        double d1114 = radians11;
                        double dSin11 = Math.sin(d1114);
                        double d1115 = iE11;
                        bVarL11113.f116814d.k(hVarK1111111115, 0.5f);
                        bVarL11113.f116814d.k(hVarK1111111117, 0.5f);
                        bVarL11113.f116814d.k(hVarK1111111111, -0.5f);
                        bVarL11113.f116814d.k(hVarK1111111113, -0.5f);
                        bVarL11113.f116812b = -((float) (dSin11 * d1115));
                        dVar4.c(bVarL11113);
                        m6.b bVarL11114 = dVar4.l();
                        float fCos11 = (float) (Math.cos(d1114) * d1115);
                        bVarL11114.f116814d.k(hVarK1111111114, 0.5f);
                        bVarL11114.f116814d.k(hVarK1111111116, 0.5f);
                        bVarL11114.f116814d.k(hVarK1111111110, -0.5f);
                        bVarL11114.f116814d.k(hVarK1111111112, -0.5f);
                        bVarL11114.f116812b = -fCos11;
                        dVar4.c(bVarL11114);
                    }
                    this.f162626m = false;
                    this.f162628n = false;
                    eVar4 = m6.d.f116820r;
                    if (eVar4 != null) {
                        eVar4.getClass();
                    }
                }
                i38 = -1;
                if (z26) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                bVar4 = this.W[0];
                bVar5 = b.WRAP_CONTENT;
                if (bVar4 == bVar5) {
                    z28 = false;
                } else {
                    z28 = false;
                }
                if (z28) {
                    i26 = 0;
                }
                dVar3 = this.S;
                z29 = !dVar3.h();
                boolean z31110 = zArr3[0];
                boolean z31111 = zArr3[1];
                if (this.f162634q != 2) {
                    hVar2 = hVarK;
                    hVar3 = hVarK2;
                    bVar6 = bVar5;
                    hVar4 = hVarK5;
                    r19 = r14;
                    r15 = i24;
                    i39 = i36;
                    r16 = i19;
                    i44 = i37;
                    z34 = z29;
                } else {
                    hVar2 = hVarK;
                    hVar3 = hVarK2;
                    bVar6 = bVar5;
                    hVar4 = hVarK5;
                    r19 = r14;
                    r15 = i24;
                    i39 = i36;
                    r16 = i19;
                    i44 = i37;
                    z34 = z29;
                }
                if (z14) {
                    hVar5 = r33;
                    hVar6 = hVar;
                    hVar7 = hVar4;
                    i45 = 0;
                    c14 = 1;
                    i46 = 8;
                    i47 = 1;
                } else {
                    hVar5 = r33;
                    hVar6 = hVar;
                    hVar7 = hVar4;
                    i45 = 0;
                    c14 = 1;
                    i46 = 8;
                    i47 = 1;
                }
                if (this.f162636r == 2) {
                    i47 = i45;
                }
                if (i47 != 0) {
                    hVar8 = hVar5;
                } else {
                    hVar8 = hVar5;
                }
                if (z26) {
                    i48 = this.C;
                    f15 = this.D;
                    if (i48 == 1) {
                        m6.b bVarL11115 = dVar4.l();
                        bVarL11115.f116814d.k(hVar6, -1.0f);
                        bVarL11115.f116814d.k(hVar8, 1.0f);
                        bVarL11115.f116814d.k(hVar3, f15);
                        bVarL11115.f116814d.k(hVar2, -f15);
                        dVar4.c(bVarL11115);
                    } else {
                        m6.b bVarL11116 = dVar4.l();
                        bVarL11116.f116814d.k(hVar3, -1.0f);
                        bVarL11116.f116814d.k(hVar2, 1.0f);
                        bVarL11116.f116814d.k(hVar6, f15);
                        bVarL11116.f116814d.k(hVar8, -f15);
                        dVar4.c(bVarL11116);
                    }
                }
                if (dVar3.h()) {
                    e eVar112 = dVar3.f162588f.f162586d;
                    float radians12 = (float) Math.toRadians(this.F + 90.0f);
                    int iE12 = dVar3.e();
                    d.a aVar11115 = d.a.LEFT;
                    m6.h hVarK1111111118 = dVar4.k(k(aVar11115));
                    d.a aVar11116 = d.a.TOP;
                    m6.h hVarK1111111119 = dVar4.k(k(aVar11116));
                    d.a aVar11117 = d.a.RIGHT;
                    m6.h hVarK11111111110 = dVar4.k(k(aVar11117));
                    d.a aVar11118 = d.a.BOTTOM;
                    m6.h hVarK11111111111 = dVar4.k(k(aVar11118));
                    m6.h hVarK11111111112 = dVar4.k(eVar112.k(aVar11115));
                    m6.h hVarK11111111113 = dVar4.k(eVar112.k(aVar11116));
                    m6.h hVarK11111111114 = dVar4.k(eVar112.k(aVar11117));
                    m6.h hVarK11111111115 = dVar4.k(eVar112.k(aVar11118));
                    m6.b bVarL11117 = dVar4.l();
                    double d1116 = radians12;
                    double dSin12 = Math.sin(d1116);
                    double d1117 = iE12;
                    bVarL11117.f116814d.k(hVarK11111111113, 0.5f);
                    bVarL11117.f116814d.k(hVarK11111111115, 0.5f);
                    bVarL11117.f116814d.k(hVarK1111111119, -0.5f);
                    bVarL11117.f116814d.k(hVarK11111111111, -0.5f);
                    bVarL11117.f116812b = -((float) (dSin12 * d1117));
                    dVar4.c(bVarL11117);
                    m6.b bVarL11118 = dVar4.l();
                    float fCos12 = (float) (Math.cos(d1116) * d1117);
                    bVarL11118.f116814d.k(hVarK11111111112, 0.5f);
                    bVarL11118.f116814d.k(hVarK11111111114, 0.5f);
                    bVarL11118.f116814d.k(hVarK1111111118, -0.5f);
                    bVarL11118.f116814d.k(hVarK11111111110, -0.5f);
                    bVarL11118.f116812b = -fCos12;
                    dVar4.c(bVarL11118);
                }
                this.f162626m = false;
                this.f162628n = false;
                eVar4 = m6.d.f116820r;
                if (eVar4 != null) {
                    eVar4.getClass();
                }
            }
            hVar = hVarK4;
            i35 = i29;
            i36 = i30;
            i37 = i34;
            z26 = false;
            int[] iArr7 = this.f162644v;
            iArr7[0] = i36;
            iArr7[1] = i37;
            if (z26) {
                int i616 = this.C;
                i38 = -1;
                if (i616 != 0) {
                }
                if (z26) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                bVar4 = this.W[0];
                bVar5 = b.WRAP_CONTENT;
                if (bVar4 == bVar5) {
                    z28 = false;
                } else {
                    z28 = false;
                }
                if (z28) {
                    i26 = 0;
                }
                dVar3 = this.S;
                z29 = !dVar3.h();
                boolean z31112 = zArr3[0];
                boolean z31113 = zArr3[1];
                if (this.f162634q != 2) {
                    hVar2 = hVarK;
                    hVar3 = hVarK2;
                    bVar6 = bVar5;
                    hVar4 = hVarK5;
                    r19 = r14;
                    r15 = i24;
                    i39 = i36;
                    r16 = i19;
                    i44 = i37;
                    z34 = z29;
                } else {
                    hVar2 = hVarK;
                    hVar3 = hVarK2;
                    bVar6 = bVar5;
                    hVar4 = hVarK5;
                    r19 = r14;
                    r15 = i24;
                    i39 = i36;
                    r16 = i19;
                    i44 = i37;
                    z34 = z29;
                }
                if (z14) {
                    hVar5 = r33;
                    hVar6 = hVar;
                    hVar7 = hVar4;
                    i45 = 0;
                    c14 = 1;
                    i46 = 8;
                    i47 = 1;
                } else {
                    hVar5 = r33;
                    hVar6 = hVar;
                    hVar7 = hVar4;
                    i45 = 0;
                    c14 = 1;
                    i46 = 8;
                    i47 = 1;
                }
                if (this.f162636r == 2) {
                    i47 = i45;
                }
                if (i47 != 0) {
                    hVar8 = hVar5;
                } else {
                    hVar8 = hVar5;
                }
                if (z26) {
                    i48 = this.C;
                    f15 = this.D;
                    if (i48 == 1) {
                        m6.b bVarL11119 = dVar4.l();
                        bVarL11119.f116814d.k(hVar6, -1.0f);
                        bVarL11119.f116814d.k(hVar8, 1.0f);
                        bVarL11119.f116814d.k(hVar3, f15);
                        bVarL11119.f116814d.k(hVar2, -f15);
                        dVar4.c(bVarL11119);
                    } else {
                        m6.b bVarL111110 = dVar4.l();
                        bVarL111110.f116814d.k(hVar3, -1.0f);
                        bVarL111110.f116814d.k(hVar2, 1.0f);
                        bVarL111110.f116814d.k(hVar6, f15);
                        bVarL111110.f116814d.k(hVar8, -f15);
                        dVar4.c(bVarL111110);
                    }
                }
                if (dVar3.h()) {
                    e eVar113 = dVar3.f162588f.f162586d;
                    float radians13 = (float) Math.toRadians(this.F + 90.0f);
                    int iE13 = dVar3.e();
                    d.a aVar11119 = d.a.LEFT;
                    m6.h hVarK11111111116 = dVar4.k(k(aVar11119));
                    d.a aVar111110 = d.a.TOP;
                    m6.h hVarK11111111117 = dVar4.k(k(aVar111110));
                    d.a aVar111111 = d.a.RIGHT;
                    m6.h hVarK11111111118 = dVar4.k(k(aVar111111));
                    d.a aVar111112 = d.a.BOTTOM;
                    m6.h hVarK11111111119 = dVar4.k(k(aVar111112));
                    m6.h hVarK111111111110 = dVar4.k(eVar113.k(aVar11119));
                    m6.h hVarK111111111111 = dVar4.k(eVar113.k(aVar111110));
                    m6.h hVarK111111111112 = dVar4.k(eVar113.k(aVar111111));
                    m6.h hVarK111111111113 = dVar4.k(eVar113.k(aVar111112));
                    m6.b bVarL111111 = dVar4.l();
                    double d1118 = radians13;
                    double dSin13 = Math.sin(d1118);
                    double d1119 = iE13;
                    bVarL111111.f116814d.k(hVarK111111111111, 0.5f);
                    bVarL111111.f116814d.k(hVarK111111111113, 0.5f);
                    bVarL111111.f116814d.k(hVarK11111111117, -0.5f);
                    bVarL111111.f116814d.k(hVarK11111111119, -0.5f);
                    bVarL111111.f116812b = -((float) (dSin13 * d1119));
                    dVar4.c(bVarL111111);
                    m6.b bVarL111112 = dVar4.l();
                    float fCos13 = (float) (Math.cos(d1118) * d1119);
                    bVarL111112.f116814d.k(hVarK111111111110, 0.5f);
                    bVarL111112.f116814d.k(hVarK111111111112, 0.5f);
                    bVarL111112.f116814d.k(hVarK11111111116, -0.5f);
                    bVarL111112.f116814d.k(hVarK11111111118, -0.5f);
                    bVarL111112.f116812b = -fCos13;
                    dVar4.c(bVarL111112);
                }
                this.f162626m = false;
                this.f162628n = false;
                eVar4 = m6.d.f116820r;
                if (eVar4 != null) {
                    eVar4.getClass();
                }
            }
            i38 = -1;
            if (z26) {
                z27 = false;
            } else {
                z27 = false;
            }
            bVar4 = this.W[0];
            bVar5 = b.WRAP_CONTENT;
            if (bVar4 == bVar5) {
                z28 = false;
            } else {
                z28 = false;
            }
            if (z28) {
                i26 = 0;
            }
            dVar3 = this.S;
            z29 = !dVar3.h();
            boolean z31114 = zArr3[0];
            boolean z31115 = zArr3[1];
            if (this.f162634q != 2) {
                hVar2 = hVarK;
                hVar3 = hVarK2;
                bVar6 = bVar5;
                hVar4 = hVarK5;
                r19 = r14;
                r15 = i24;
                i39 = i36;
                r16 = i19;
                i44 = i37;
                z34 = z29;
            } else {
                hVar2 = hVarK;
                hVar3 = hVarK2;
                bVar6 = bVar5;
                hVar4 = hVarK5;
                r19 = r14;
                r15 = i24;
                i39 = i36;
                r16 = i19;
                i44 = i37;
                z34 = z29;
            }
            if (z14) {
                hVar5 = r33;
                hVar6 = hVar;
                hVar7 = hVar4;
                i45 = 0;
                c14 = 1;
                i46 = 8;
                i47 = 1;
            } else {
                hVar5 = r33;
                hVar6 = hVar;
                hVar7 = hVar4;
                i45 = 0;
                c14 = 1;
                i46 = 8;
                i47 = 1;
            }
            if (this.f162636r == 2) {
                i47 = i45;
            }
            if (i47 != 0) {
                hVar8 = hVar5;
            } else {
                hVar8 = hVar5;
            }
            if (z26) {
                i48 = this.C;
                f15 = this.D;
                if (i48 == 1) {
                    m6.b bVarL111113 = dVar4.l();
                    bVarL111113.f116814d.k(hVar6, -1.0f);
                    bVarL111113.f116814d.k(hVar8, 1.0f);
                    bVarL111113.f116814d.k(hVar3, f15);
                    bVarL111113.f116814d.k(hVar2, -f15);
                    dVar4.c(bVarL111113);
                } else {
                    m6.b bVarL111114 = dVar4.l();
                    bVarL111114.f116814d.k(hVar3, -1.0f);
                    bVarL111114.f116814d.k(hVar2, 1.0f);
                    bVarL111114.f116814d.k(hVar6, f15);
                    bVarL111114.f116814d.k(hVar8, -f15);
                    dVar4.c(bVarL111114);
                }
            }
            if (dVar3.h()) {
                e eVar114 = dVar3.f162588f.f162586d;
                float radians14 = (float) Math.toRadians(this.F + 90.0f);
                int iE14 = dVar3.e();
                d.a aVar111113 = d.a.LEFT;
                m6.h hVarK111111111114 = dVar4.k(k(aVar111113));
                d.a aVar111114 = d.a.TOP;
                m6.h hVarK111111111115 = dVar4.k(k(aVar111114));
                d.a aVar111115 = d.a.RIGHT;
                m6.h hVarK111111111116 = dVar4.k(k(aVar111115));
                d.a aVar111116 = d.a.BOTTOM;
                m6.h hVarK111111111117 = dVar4.k(k(aVar111116));
                m6.h hVarK111111111118 = dVar4.k(eVar114.k(aVar111113));
                m6.h hVarK111111111119 = dVar4.k(eVar114.k(aVar111114));
                m6.h hVarK1111111111110 = dVar4.k(eVar114.k(aVar111115));
                m6.h hVarK1111111111111 = dVar4.k(eVar114.k(aVar111116));
                m6.b bVarL111115 = dVar4.l();
                double d11110 = radians14;
                double dSin14 = Math.sin(d11110);
                double d11111 = iE14;
                bVarL111115.f116814d.k(hVarK111111111119, 0.5f);
                bVarL111115.f116814d.k(hVarK1111111111111, 0.5f);
                bVarL111115.f116814d.k(hVarK111111111115, -0.5f);
                bVarL111115.f116814d.k(hVarK111111111117, -0.5f);
                bVarL111115.f116812b = -((float) (dSin14 * d11111));
                dVar4.c(bVarL111115);
                m6.b bVarL111116 = dVar4.l();
                float fCos14 = (float) (Math.cos(d11110) * d11111);
                bVarL111116.f116814d.k(hVarK111111111118, 0.5f);
                bVarL111116.f116814d.k(hVarK1111111111110, 0.5f);
                bVarL111116.f116814d.k(hVarK111111111114, -0.5f);
                bVarL111116.f116814d.k(hVarK111111111116, -0.5f);
                bVarL111116.f116812b = -fCos14;
                dVar4.c(bVarL111116);
            }
            this.f162626m = false;
            this.f162628n = false;
            eVar4 = m6.d.f116820r;
            if (eVar4 != null) {
                eVar4.getClass();
            }
        }
        i14 = 1;
        i15 = 0;
        i17 = i15;
        i16 = i17;
        i18 = this.f162623k0;
        boolean[] zArr5 = this.V;
        i19 = i17;
        if (i18 != 8) {
            i24 = i16;
        } else {
            i24 = i16;
        }
        z15 = this.f162626m;
        if (z15) {
            z16 = this.f162616h;
            if (z15) {
                dVar4.d(hVarK, this.f162607c0);
                dVar4.d(hVarK2, this.f162607c0 + this.Y);
                if (i24 != 0) {
                    z17 = z16;
                } else {
                    z17 = z16;
                }
            } else {
                z17 = z16;
            }
            if (this.f162628n) {
                dVar4.d(hVarK3, this.f162609d0);
                dVar4.d(hVarK4, this.f162609d0 + this.Z);
                hashSet = dVar9.f162583a;
                if (hashSet != null) {
                    dVar4.d(hVarK5, this.f162609d0 + this.f162611e0);
                }
                if (i19 != 0) {
                    z18 = false;
                } else {
                    z18 = false;
                }
            } else {
                z18 = false;
            }
            if (this.f162626m) {
                this.f162626m = z18;
                this.f162628n = z18;
                return;
            }
        } else {
            z16 = this.f162616h;
            if (z15) {
                dVar4.d(hVarK, this.f162607c0);
                dVar4.d(hVarK2, this.f162607c0 + this.Y);
                if (i24 != 0) {
                    z17 = z16;
                } else {
                    z17 = z16;
                }
            } else {
                z17 = z16;
            }
            if (this.f162628n) {
                dVar4.d(hVarK3, this.f162609d0);
                dVar4.d(hVarK4, this.f162609d0 + this.Z);
                hashSet = dVar9.f162583a;
                if (hashSet != null) {
                    dVar4.d(hVarK5, this.f162609d0 + this.f162611e0);
                }
                if (i19 != 0) {
                    z18 = false;
                } else {
                    z18 = false;
                }
            } else {
                z18 = false;
            }
            if (this.f162626m) {
                this.f162626m = z18;
                this.f162628n = z18;
                return;
            }
        }
        eVar3 = m6.d.f116820r;
        if (eVar3 != null) {
            eVar3.f116844h++;
        }
        zArr = this.f162612f;
        if (!z14) {
            dVar2 = dVar9;
            zArr2 = zArr;
            zArr3 = zArr5;
        } else {
            dVar2 = dVar9;
            zArr2 = zArr;
            zArr3 = zArr5;
        }
        if (eVar3 != null) {
            eVar3.f116841e++;
        }
        if (this.X != null) {
            if (y(0)) {
                ((f) this.X).Y(this, 0);
                int i511 = i14;
                i55 = i511 == true ? 1 : 0;
                Z = i511;
            } else {
                i55 = i14;
                Z = z();
            }
            if (y(i55)) {
                ((f) this.X).Y(this, i55);
                zA = true;
            } else {
                zA = A();
            }
            if (Z == 0) {
                dVar4.f(dVar4.k(this.X.N), hVarK2, 0, 1);
            }
            if (!zA) {
                dVar4.f(dVar4.k(this.X.O), hVarK4, 0, 1);
            }
            r14 = Z;
            z19 = zA;
        } else {
            r14 = 0;
            z19 = false;
        }
        i25 = this.Y;
        i26 = this.f162613f0;
        if (i25 >= i26) {
            i26 = i25;
        }
        i27 = this.Z;
        i28 = this.f162615g0;
        if (i27 < i28) {
            i29 = i28;
        } else {
            i29 = i27;
        }
        b[] bVarArr6 = this.W;
        bVar = bVarArr6[0];
        bVar2 = b.MATCH_CONSTRAINT;
        if (bVar != bVar2) {
            z24 = true;
        } else {
            z24 = false;
        }
        bVar3 = bVarArr6[1];
        if (bVar3 != bVar2) {
            z25 = true;
        } else {
            z25 = false;
        }
        int i617 = this.f162605b0;
        this.C = i617;
        f14 = this.f162603a0;
        this.D = f14;
        i30 = this.f162640t;
        i34 = this.f162642u;
        if (f14 > 0.0f) {
            hVar = hVarK4;
            if (this.f162623k0 != 8) {
                if (bVar == bVar2) {
                    i54 = i30;
                } else {
                    i54 = i30;
                }
                if (bVar3 == bVar2) {
                    i37 = i34;
                } else {
                    i37 = i34;
                }
                if (bVar == bVar2) {
                    if (bVar == bVar2) {
                        if (bVar3 != bVar2) {
                            i36 = i54;
                            i35 = i29;
                        } else {
                            i36 = i54;
                            i35 = i29;
                        }
                        z26 = true;
                    } else {
                        if (bVar3 != bVar2) {
                            i36 = i54;
                            i35 = i29;
                        } else {
                            i36 = i54;
                            i35 = i29;
                        }
                        z26 = true;
                    }
                } else if (bVar == bVar2) {
                    if (bVar3 != bVar2) {
                        i36 = i54;
                        i35 = i29;
                    } else {
                        i36 = i54;
                        i35 = i29;
                    }
                    z26 = true;
                } else {
                    if (bVar3 != bVar2) {
                        i36 = i54;
                        i35 = i29;
                    } else {
                        i36 = i54;
                        i35 = i29;
                    }
                    z26 = true;
                }
                int[] iArr8 = this.f162644v;
                iArr8[0] = i36;
                iArr8[1] = i37;
                if (z26) {
                    int i618 = this.C;
                    i38 = -1;
                    if (i618 != 0) {
                    }
                    if (z26) {
                        z27 = false;
                    } else {
                        z27 = false;
                    }
                    bVar4 = this.W[0];
                    bVar5 = b.WRAP_CONTENT;
                    if (bVar4 == bVar5) {
                        z28 = false;
                    } else {
                        z28 = false;
                    }
                    if (z28) {
                        i26 = 0;
                    }
                    dVar3 = this.S;
                    z29 = !dVar3.h();
                    boolean z31116 = zArr3[0];
                    boolean z31117 = zArr3[1];
                    if (this.f162634q != 2) {
                        hVar2 = hVarK;
                        hVar3 = hVarK2;
                        bVar6 = bVar5;
                        hVar4 = hVarK5;
                        r19 = r14;
                        r15 = i24;
                        i39 = i36;
                        r16 = i19;
                        i44 = i37;
                        z34 = z29;
                    } else {
                        hVar2 = hVarK;
                        hVar3 = hVarK2;
                        bVar6 = bVar5;
                        hVar4 = hVarK5;
                        r19 = r14;
                        r15 = i24;
                        i39 = i36;
                        r16 = i19;
                        i44 = i37;
                        z34 = z29;
                    }
                    if (z14) {
                        hVar5 = r33;
                        hVar6 = hVar;
                        hVar7 = hVar4;
                        i45 = 0;
                        c14 = 1;
                        i46 = 8;
                        i47 = 1;
                    } else {
                        hVar5 = r33;
                        hVar6 = hVar;
                        hVar7 = hVar4;
                        i45 = 0;
                        c14 = 1;
                        i46 = 8;
                        i47 = 1;
                    }
                    if (this.f162636r == 2) {
                        i47 = i45;
                    }
                    if (i47 != 0) {
                        hVar8 = hVar5;
                    } else {
                        hVar8 = hVar5;
                    }
                    if (z26) {
                        i48 = this.C;
                        f15 = this.D;
                        if (i48 == 1) {
                            m6.b bVarL111117 = dVar4.l();
                            bVarL111117.f116814d.k(hVar6, -1.0f);
                            bVarL111117.f116814d.k(hVar8, 1.0f);
                            bVarL111117.f116814d.k(hVar3, f15);
                            bVarL111117.f116814d.k(hVar2, -f15);
                            dVar4.c(bVarL111117);
                        } else {
                            m6.b bVarL111118 = dVar4.l();
                            bVarL111118.f116814d.k(hVar3, -1.0f);
                            bVarL111118.f116814d.k(hVar2, 1.0f);
                            bVarL111118.f116814d.k(hVar6, f15);
                            bVarL111118.f116814d.k(hVar8, -f15);
                            dVar4.c(bVarL111118);
                        }
                    }
                    if (dVar3.h()) {
                        e eVar115 = dVar3.f162588f.f162586d;
                        float radians15 = (float) Math.toRadians(this.F + 90.0f);
                        int iE15 = dVar3.e();
                        d.a aVar111117 = d.a.LEFT;
                        m6.h hVarK1111111111112 = dVar4.k(k(aVar111117));
                        d.a aVar111118 = d.a.TOP;
                        m6.h hVarK1111111111113 = dVar4.k(k(aVar111118));
                        d.a aVar111119 = d.a.RIGHT;
                        m6.h hVarK1111111111114 = dVar4.k(k(aVar111119));
                        d.a aVar1111110 = d.a.BOTTOM;
                        m6.h hVarK1111111111115 = dVar4.k(k(aVar1111110));
                        m6.h hVarK1111111111116 = dVar4.k(eVar115.k(aVar111117));
                        m6.h hVarK1111111111117 = dVar4.k(eVar115.k(aVar111118));
                        m6.h hVarK1111111111118 = dVar4.k(eVar115.k(aVar111119));
                        m6.h hVarK1111111111119 = dVar4.k(eVar115.k(aVar1111110));
                        m6.b bVarL111119 = dVar4.l();
                        double d11112 = radians15;
                        double dSin15 = Math.sin(d11112);
                        double d11113 = iE15;
                        bVarL111119.f116814d.k(hVarK1111111111117, 0.5f);
                        bVarL111119.f116814d.k(hVarK1111111111119, 0.5f);
                        bVarL111119.f116814d.k(hVarK1111111111113, -0.5f);
                        bVarL111119.f116814d.k(hVarK1111111111115, -0.5f);
                        bVarL111119.f116812b = -((float) (dSin15 * d11113));
                        dVar4.c(bVarL111119);
                        m6.b bVarL1111110 = dVar4.l();
                        float fCos15 = (float) (Math.cos(d11112) * d11113);
                        bVarL1111110.f116814d.k(hVarK1111111111116, 0.5f);
                        bVarL1111110.f116814d.k(hVarK1111111111118, 0.5f);
                        bVarL1111110.f116814d.k(hVarK1111111111112, -0.5f);
                        bVarL1111110.f116814d.k(hVarK1111111111114, -0.5f);
                        bVarL1111110.f116812b = -fCos15;
                        dVar4.c(bVarL1111110);
                    }
                    this.f162626m = false;
                    this.f162628n = false;
                    eVar4 = m6.d.f116820r;
                    if (eVar4 != null) {
                        eVar4.getClass();
                    }
                }
                i38 = -1;
                if (z26) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                bVar4 = this.W[0];
                bVar5 = b.WRAP_CONTENT;
                if (bVar4 == bVar5) {
                    z28 = false;
                } else {
                    z28 = false;
                }
                if (z28) {
                    i26 = 0;
                }
                dVar3 = this.S;
                z29 = !dVar3.h();
                boolean z31118 = zArr3[0];
                boolean z31119 = zArr3[1];
                if (this.f162634q != 2) {
                    hVar2 = hVarK;
                    hVar3 = hVarK2;
                    bVar6 = bVar5;
                    hVar4 = hVarK5;
                    r19 = r14;
                    r15 = i24;
                    i39 = i36;
                    r16 = i19;
                    i44 = i37;
                    z34 = z29;
                } else {
                    hVar2 = hVarK;
                    hVar3 = hVarK2;
                    bVar6 = bVar5;
                    hVar4 = hVarK5;
                    r19 = r14;
                    r15 = i24;
                    i39 = i36;
                    r16 = i19;
                    i44 = i37;
                    z34 = z29;
                }
                if (z14) {
                    hVar5 = r33;
                    hVar6 = hVar;
                    hVar7 = hVar4;
                    i45 = 0;
                    c14 = 1;
                    i46 = 8;
                    i47 = 1;
                } else {
                    hVar5 = r33;
                    hVar6 = hVar;
                    hVar7 = hVar4;
                    i45 = 0;
                    c14 = 1;
                    i46 = 8;
                    i47 = 1;
                }
                if (this.f162636r == 2) {
                    i47 = i45;
                }
                if (i47 != 0) {
                    hVar8 = hVar5;
                } else {
                    hVar8 = hVar5;
                }
                if (z26) {
                    i48 = this.C;
                    f15 = this.D;
                    if (i48 == 1) {
                        m6.b bVarL1111111 = dVar4.l();
                        bVarL1111111.f116814d.k(hVar6, -1.0f);
                        bVarL1111111.f116814d.k(hVar8, 1.0f);
                        bVarL1111111.f116814d.k(hVar3, f15);
                        bVarL1111111.f116814d.k(hVar2, -f15);
                        dVar4.c(bVarL1111111);
                    } else {
                        m6.b bVarL1111112 = dVar4.l();
                        bVarL1111112.f116814d.k(hVar3, -1.0f);
                        bVarL1111112.f116814d.k(hVar2, 1.0f);
                        bVarL1111112.f116814d.k(hVar6, f15);
                        bVarL1111112.f116814d.k(hVar8, -f15);
                        dVar4.c(bVarL1111112);
                    }
                }
                if (dVar3.h()) {
                    e eVar116 = dVar3.f162588f.f162586d;
                    float radians16 = (float) Math.toRadians(this.F + 90.0f);
                    int iE16 = dVar3.e();
                    d.a aVar1111111 = d.a.LEFT;
                    m6.h hVarK11111111111110 = dVar4.k(k(aVar1111111));
                    d.a aVar1111112 = d.a.TOP;
                    m6.h hVarK11111111111111 = dVar4.k(k(aVar1111112));
                    d.a aVar1111113 = d.a.RIGHT;
                    m6.h hVarK11111111111112 = dVar4.k(k(aVar1111113));
                    d.a aVar1111114 = d.a.BOTTOM;
                    m6.h hVarK11111111111113 = dVar4.k(k(aVar1111114));
                    m6.h hVarK11111111111114 = dVar4.k(eVar116.k(aVar1111111));
                    m6.h hVarK11111111111115 = dVar4.k(eVar116.k(aVar1111112));
                    m6.h hVarK11111111111116 = dVar4.k(eVar116.k(aVar1111113));
                    m6.h hVarK11111111111117 = dVar4.k(eVar116.k(aVar1111114));
                    m6.b bVarL1111113 = dVar4.l();
                    double d11114 = radians16;
                    double dSin16 = Math.sin(d11114);
                    double d11115 = iE16;
                    bVarL1111113.f116814d.k(hVarK11111111111115, 0.5f);
                    bVarL1111113.f116814d.k(hVarK11111111111117, 0.5f);
                    bVarL1111113.f116814d.k(hVarK11111111111111, -0.5f);
                    bVarL1111113.f116814d.k(hVarK11111111111113, -0.5f);
                    bVarL1111113.f116812b = -((float) (dSin16 * d11115));
                    dVar4.c(bVarL1111113);
                    m6.b bVarL1111114 = dVar4.l();
                    float fCos16 = (float) (Math.cos(d11114) * d11115);
                    bVarL1111114.f116814d.k(hVarK11111111111114, 0.5f);
                    bVarL1111114.f116814d.k(hVarK11111111111116, 0.5f);
                    bVarL1111114.f116814d.k(hVarK11111111111110, -0.5f);
                    bVarL1111114.f116814d.k(hVarK11111111111112, -0.5f);
                    bVarL1111114.f116812b = -fCos16;
                    dVar4.c(bVarL1111114);
                }
                this.f162626m = false;
                this.f162628n = false;
                eVar4 = m6.d.f116820r;
                if (eVar4 != null) {
                    eVar4.getClass();
                }
            }
            z26 = false;
            int[] iArr9 = this.f162644v;
            iArr9[0] = i36;
            iArr9[1] = i37;
            if (z26) {
                int i619 = this.C;
                i38 = -1;
                if (i619 != 0) {
                }
                if (z26) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                bVar4 = this.W[0];
                bVar5 = b.WRAP_CONTENT;
                if (bVar4 == bVar5) {
                    z28 = false;
                } else {
                    z28 = false;
                }
                if (z28) {
                    i26 = 0;
                }
                dVar3 = this.S;
                z29 = !dVar3.h();
                boolean z311110 = zArr3[0];
                boolean z311111 = zArr3[1];
                if (this.f162634q != 2) {
                    hVar2 = hVarK;
                    hVar3 = hVarK2;
                    bVar6 = bVar5;
                    hVar4 = hVarK5;
                    r19 = r14;
                    r15 = i24;
                    i39 = i36;
                    r16 = i19;
                    i44 = i37;
                    z34 = z29;
                } else {
                    hVar2 = hVarK;
                    hVar3 = hVarK2;
                    bVar6 = bVar5;
                    hVar4 = hVarK5;
                    r19 = r14;
                    r15 = i24;
                    i39 = i36;
                    r16 = i19;
                    i44 = i37;
                    z34 = z29;
                }
                if (z14) {
                    hVar5 = r33;
                    hVar6 = hVar;
                    hVar7 = hVar4;
                    i45 = 0;
                    c14 = 1;
                    i46 = 8;
                    i47 = 1;
                } else {
                    hVar5 = r33;
                    hVar6 = hVar;
                    hVar7 = hVar4;
                    i45 = 0;
                    c14 = 1;
                    i46 = 8;
                    i47 = 1;
                }
                if (this.f162636r == 2) {
                    i47 = i45;
                }
                if (i47 != 0) {
                    hVar8 = hVar5;
                } else {
                    hVar8 = hVar5;
                }
                if (z26) {
                    i48 = this.C;
                    f15 = this.D;
                    if (i48 == 1) {
                        m6.b bVarL1111115 = dVar4.l();
                        bVarL1111115.f116814d.k(hVar6, -1.0f);
                        bVarL1111115.f116814d.k(hVar8, 1.0f);
                        bVarL1111115.f116814d.k(hVar3, f15);
                        bVarL1111115.f116814d.k(hVar2, -f15);
                        dVar4.c(bVarL1111115);
                    } else {
                        m6.b bVarL1111116 = dVar4.l();
                        bVarL1111116.f116814d.k(hVar3, -1.0f);
                        bVarL1111116.f116814d.k(hVar2, 1.0f);
                        bVarL1111116.f116814d.k(hVar6, f15);
                        bVarL1111116.f116814d.k(hVar8, -f15);
                        dVar4.c(bVarL1111116);
                    }
                }
                if (dVar3.h()) {
                    e eVar117 = dVar3.f162588f.f162586d;
                    float radians17 = (float) Math.toRadians(this.F + 90.0f);
                    int iE17 = dVar3.e();
                    d.a aVar1111115 = d.a.LEFT;
                    m6.h hVarK11111111111118 = dVar4.k(k(aVar1111115));
                    d.a aVar1111116 = d.a.TOP;
                    m6.h hVarK11111111111119 = dVar4.k(k(aVar1111116));
                    d.a aVar1111117 = d.a.RIGHT;
                    m6.h hVarK111111111111110 = dVar4.k(k(aVar1111117));
                    d.a aVar1111118 = d.a.BOTTOM;
                    m6.h hVarK111111111111111 = dVar4.k(k(aVar1111118));
                    m6.h hVarK111111111111112 = dVar4.k(eVar117.k(aVar1111115));
                    m6.h hVarK111111111111113 = dVar4.k(eVar117.k(aVar1111116));
                    m6.h hVarK111111111111114 = dVar4.k(eVar117.k(aVar1111117));
                    m6.h hVarK111111111111115 = dVar4.k(eVar117.k(aVar1111118));
                    m6.b bVarL1111117 = dVar4.l();
                    double d11116 = radians17;
                    double dSin17 = Math.sin(d11116);
                    double d11117 = iE17;
                    bVarL1111117.f116814d.k(hVarK111111111111113, 0.5f);
                    bVarL1111117.f116814d.k(hVarK111111111111115, 0.5f);
                    bVarL1111117.f116814d.k(hVarK11111111111119, -0.5f);
                    bVarL1111117.f116814d.k(hVarK111111111111111, -0.5f);
                    bVarL1111117.f116812b = -((float) (dSin17 * d11117));
                    dVar4.c(bVarL1111117);
                    m6.b bVarL1111118 = dVar4.l();
                    float fCos17 = (float) (Math.cos(d11116) * d11117);
                    bVarL1111118.f116814d.k(hVarK111111111111112, 0.5f);
                    bVarL1111118.f116814d.k(hVarK111111111111114, 0.5f);
                    bVarL1111118.f116814d.k(hVarK11111111111118, -0.5f);
                    bVarL1111118.f116814d.k(hVarK111111111111110, -0.5f);
                    bVarL1111118.f116812b = -fCos17;
                    dVar4.c(bVarL1111118);
                }
                this.f162626m = false;
                this.f162628n = false;
                eVar4 = m6.d.f116820r;
                if (eVar4 != null) {
                    eVar4.getClass();
                }
            }
            i38 = -1;
            if (z26) {
                z27 = false;
            } else {
                z27 = false;
            }
            bVar4 = this.W[0];
            bVar5 = b.WRAP_CONTENT;
            if (bVar4 == bVar5) {
                z28 = false;
            } else {
                z28 = false;
            }
            if (z28) {
                i26 = 0;
            }
            dVar3 = this.S;
            z29 = !dVar3.h();
            boolean z311112 = zArr3[0];
            boolean z311113 = zArr3[1];
            if (this.f162634q != 2) {
                hVar2 = hVarK;
                hVar3 = hVarK2;
                bVar6 = bVar5;
                hVar4 = hVarK5;
                r19 = r14;
                r15 = i24;
                i39 = i36;
                r16 = i19;
                i44 = i37;
                z34 = z29;
            } else {
                hVar2 = hVarK;
                hVar3 = hVarK2;
                bVar6 = bVar5;
                hVar4 = hVarK5;
                r19 = r14;
                r15 = i24;
                i39 = i36;
                r16 = i19;
                i44 = i37;
                z34 = z29;
            }
            if (z14) {
                hVar5 = r33;
                hVar6 = hVar;
                hVar7 = hVar4;
                i45 = 0;
                c14 = 1;
                i46 = 8;
                i47 = 1;
            } else {
                hVar5 = r33;
                hVar6 = hVar;
                hVar7 = hVar4;
                i45 = 0;
                c14 = 1;
                i46 = 8;
                i47 = 1;
            }
            if (this.f162636r == 2) {
                i47 = i45;
            }
            if (i47 != 0) {
                hVar8 = hVar5;
            } else {
                hVar8 = hVar5;
            }
            if (z26) {
                i48 = this.C;
                f15 = this.D;
                if (i48 == 1) {
                    m6.b bVarL1111119 = dVar4.l();
                    bVarL1111119.f116814d.k(hVar6, -1.0f);
                    bVarL1111119.f116814d.k(hVar8, 1.0f);
                    bVarL1111119.f116814d.k(hVar3, f15);
                    bVarL1111119.f116814d.k(hVar2, -f15);
                    dVar4.c(bVarL1111119);
                } else {
                    m6.b bVarL11111110 = dVar4.l();
                    bVarL11111110.f116814d.k(hVar3, -1.0f);
                    bVarL11111110.f116814d.k(hVar2, 1.0f);
                    bVarL11111110.f116814d.k(hVar6, f15);
                    bVarL11111110.f116814d.k(hVar8, -f15);
                    dVar4.c(bVarL11111110);
                }
            }
            if (dVar3.h()) {
                e eVar118 = dVar3.f162588f.f162586d;
                float radians18 = (float) Math.toRadians(this.F + 90.0f);
                int iE18 = dVar3.e();
                d.a aVar1111119 = d.a.LEFT;
                m6.h hVarK111111111111116 = dVar4.k(k(aVar1111119));
                d.a aVar11111110 = d.a.TOP;
                m6.h hVarK111111111111117 = dVar4.k(k(aVar11111110));
                d.a aVar11111111 = d.a.RIGHT;
                m6.h hVarK111111111111118 = dVar4.k(k(aVar11111111));
                d.a aVar11111112 = d.a.BOTTOM;
                m6.h hVarK111111111111119 = dVar4.k(k(aVar11111112));
                m6.h hVarK1111111111111110 = dVar4.k(eVar118.k(aVar1111119));
                m6.h hVarK1111111111111111 = dVar4.k(eVar118.k(aVar11111110));
                m6.h hVarK1111111111111112 = dVar4.k(eVar118.k(aVar11111111));
                m6.h hVarK1111111111111113 = dVar4.k(eVar118.k(aVar11111112));
                m6.b bVarL11111111 = dVar4.l();
                double d11118 = radians18;
                double dSin18 = Math.sin(d11118);
                double d11119 = iE18;
                bVarL11111111.f116814d.k(hVarK1111111111111111, 0.5f);
                bVarL11111111.f116814d.k(hVarK1111111111111113, 0.5f);
                bVarL11111111.f116814d.k(hVarK111111111111117, -0.5f);
                bVarL11111111.f116814d.k(hVarK111111111111119, -0.5f);
                bVarL11111111.f116812b = -((float) (dSin18 * d11119));
                dVar4.c(bVarL11111111);
                m6.b bVarL11111112 = dVar4.l();
                float fCos18 = (float) (Math.cos(d11118) * d11119);
                bVarL11111112.f116814d.k(hVarK1111111111111110, 0.5f);
                bVarL11111112.f116814d.k(hVarK1111111111111112, 0.5f);
                bVarL11111112.f116814d.k(hVarK111111111111116, -0.5f);
                bVarL11111112.f116814d.k(hVarK111111111111118, -0.5f);
                bVarL11111112.f116812b = -fCos18;
                dVar4.c(bVarL11111112);
            }
            this.f162626m = false;
            this.f162628n = false;
            eVar4 = m6.d.f116820r;
            if (eVar4 != null) {
                eVar4.getClass();
            }
        }
        hVar = hVarK4;
        i35 = i29;
        i36 = i30;
        i37 = i34;
        z26 = false;
        int[] iArr10 = this.f162644v;
        iArr10[0] = i36;
        iArr10[1] = i37;
        if (z26) {
            int i6110 = this.C;
            i38 = -1;
            if (i6110 != 0) {
            }
            if (z26) {
                z27 = false;
            } else {
                z27 = false;
            }
            bVar4 = this.W[0];
            bVar5 = b.WRAP_CONTENT;
            if (bVar4 == bVar5) {
                z28 = false;
            } else {
                z28 = false;
            }
            if (z28) {
                i26 = 0;
            }
            dVar3 = this.S;
            z29 = !dVar3.h();
            boolean z311114 = zArr3[0];
            boolean z311115 = zArr3[1];
            if (this.f162634q != 2) {
                hVar2 = hVarK;
                hVar3 = hVarK2;
                bVar6 = bVar5;
                hVar4 = hVarK5;
                r19 = r14;
                r15 = i24;
                i39 = i36;
                r16 = i19;
                i44 = i37;
                z34 = z29;
            } else {
                hVar2 = hVarK;
                hVar3 = hVarK2;
                bVar6 = bVar5;
                hVar4 = hVarK5;
                r19 = r14;
                r15 = i24;
                i39 = i36;
                r16 = i19;
                i44 = i37;
                z34 = z29;
            }
            if (z14) {
                hVar5 = r33;
                hVar6 = hVar;
                hVar7 = hVar4;
                i45 = 0;
                c14 = 1;
                i46 = 8;
                i47 = 1;
            } else {
                hVar5 = r33;
                hVar6 = hVar;
                hVar7 = hVar4;
                i45 = 0;
                c14 = 1;
                i46 = 8;
                i47 = 1;
            }
            if (this.f162636r == 2) {
                i47 = i45;
            }
            if (i47 != 0) {
                hVar8 = hVar5;
            } else {
                hVar8 = hVar5;
            }
            if (z26) {
                i48 = this.C;
                f15 = this.D;
                if (i48 == 1) {
                    m6.b bVarL11111113 = dVar4.l();
                    bVarL11111113.f116814d.k(hVar6, -1.0f);
                    bVarL11111113.f116814d.k(hVar8, 1.0f);
                    bVarL11111113.f116814d.k(hVar3, f15);
                    bVarL11111113.f116814d.k(hVar2, -f15);
                    dVar4.c(bVarL11111113);
                } else {
                    m6.b bVarL11111114 = dVar4.l();
                    bVarL11111114.f116814d.k(hVar3, -1.0f);
                    bVarL11111114.f116814d.k(hVar2, 1.0f);
                    bVarL11111114.f116814d.k(hVar6, f15);
                    bVarL11111114.f116814d.k(hVar8, -f15);
                    dVar4.c(bVarL11111114);
                }
            }
            if (dVar3.h()) {
                e eVar119 = dVar3.f162588f.f162586d;
                float radians19 = (float) Math.toRadians(this.F + 90.0f);
                int iE19 = dVar3.e();
                d.a aVar11111113 = d.a.LEFT;
                m6.h hVarK1111111111111114 = dVar4.k(k(aVar11111113));
                d.a aVar11111114 = d.a.TOP;
                m6.h hVarK1111111111111115 = dVar4.k(k(aVar11111114));
                d.a aVar11111115 = d.a.RIGHT;
                m6.h hVarK1111111111111116 = dVar4.k(k(aVar11111115));
                d.a aVar11111116 = d.a.BOTTOM;
                m6.h hVarK1111111111111117 = dVar4.k(k(aVar11111116));
                m6.h hVarK1111111111111118 = dVar4.k(eVar119.k(aVar11111113));
                m6.h hVarK1111111111111119 = dVar4.k(eVar119.k(aVar11111114));
                m6.h hVarK11111111111111110 = dVar4.k(eVar119.k(aVar11111115));
                m6.h hVarK11111111111111111 = dVar4.k(eVar119.k(aVar11111116));
                m6.b bVarL11111115 = dVar4.l();
                double d111110 = radians19;
                double dSin19 = Math.sin(d111110);
                double d111111 = iE19;
                bVarL11111115.f116814d.k(hVarK1111111111111119, 0.5f);
                bVarL11111115.f116814d.k(hVarK11111111111111111, 0.5f);
                bVarL11111115.f116814d.k(hVarK1111111111111115, -0.5f);
                bVarL11111115.f116814d.k(hVarK1111111111111117, -0.5f);
                bVarL11111115.f116812b = -((float) (dSin19 * d111111));
                dVar4.c(bVarL11111115);
                m6.b bVarL11111116 = dVar4.l();
                float fCos19 = (float) (Math.cos(d111110) * d111111);
                bVarL11111116.f116814d.k(hVarK1111111111111118, 0.5f);
                bVarL11111116.f116814d.k(hVarK11111111111111110, 0.5f);
                bVarL11111116.f116814d.k(hVarK1111111111111114, -0.5f);
                bVarL11111116.f116814d.k(hVarK1111111111111116, -0.5f);
                bVarL11111116.f116812b = -fCos19;
                dVar4.c(bVarL11111116);
            }
            this.f162626m = false;
            this.f162628n = false;
            eVar4 = m6.d.f116820r;
            if (eVar4 != null) {
                eVar4.getClass();
            }
        }
        i38 = -1;
        if (z26) {
            z27 = false;
        } else {
            z27 = false;
        }
        bVar4 = this.W[0];
        bVar5 = b.WRAP_CONTENT;
        if (bVar4 == bVar5) {
            z28 = false;
        } else {
            z28 = false;
        }
        if (z28) {
            i26 = 0;
        }
        dVar3 = this.S;
        z29 = !dVar3.h();
        boolean z311116 = zArr3[0];
        boolean z311117 = zArr3[1];
        if (this.f162634q != 2) {
            hVar2 = hVarK;
            hVar3 = hVarK2;
            bVar6 = bVar5;
            hVar4 = hVarK5;
            r19 = r14;
            r15 = i24;
            i39 = i36;
            r16 = i19;
            i44 = i37;
            z34 = z29;
        } else {
            hVar2 = hVarK;
            hVar3 = hVarK2;
            bVar6 = bVar5;
            hVar4 = hVarK5;
            r19 = r14;
            r15 = i24;
            i39 = i36;
            r16 = i19;
            i44 = i37;
            z34 = z29;
        }
        if (z14) {
            hVar5 = r33;
            hVar6 = hVar;
            hVar7 = hVar4;
            i45 = 0;
            c14 = 1;
            i46 = 8;
            i47 = 1;
        } else {
            hVar5 = r33;
            hVar6 = hVar;
            hVar7 = hVar4;
            i45 = 0;
            c14 = 1;
            i46 = 8;
            i47 = 1;
        }
        if (this.f162636r == 2) {
            i47 = i45;
        }
        if (i47 != 0) {
            hVar8 = hVar5;
        } else {
            hVar8 = hVar5;
        }
        if (z26) {
            i48 = this.C;
            f15 = this.D;
            if (i48 == 1) {
                m6.b bVarL11111117 = dVar4.l();
                bVarL11111117.f116814d.k(hVar6, -1.0f);
                bVarL11111117.f116814d.k(hVar8, 1.0f);
                bVarL11111117.f116814d.k(hVar3, f15);
                bVarL11111117.f116814d.k(hVar2, -f15);
                dVar4.c(bVarL11111117);
            } else {
                m6.b bVarL11111118 = dVar4.l();
                bVarL11111118.f116814d.k(hVar3, -1.0f);
                bVarL11111118.f116814d.k(hVar2, 1.0f);
                bVarL11111118.f116814d.k(hVar6, f15);
                bVarL11111118.f116814d.k(hVar8, -f15);
                dVar4.c(bVarL11111118);
            }
        }
        if (dVar3.h()) {
            e eVar1110 = dVar3.f162588f.f162586d;
            float radians110 = (float) Math.toRadians(this.F + 90.0f);
            int iE110 = dVar3.e();
            d.a aVar11111117 = d.a.LEFT;
            m6.h hVarK11111111111111112 = dVar4.k(k(aVar11111117));
            d.a aVar11111118 = d.a.TOP;
            m6.h hVarK11111111111111113 = dVar4.k(k(aVar11111118));
            d.a aVar11111119 = d.a.RIGHT;
            m6.h hVarK11111111111111114 = dVar4.k(k(aVar11111119));
            d.a aVar111111110 = d.a.BOTTOM;
            m6.h hVarK11111111111111115 = dVar4.k(k(aVar111111110));
            m6.h hVarK11111111111111116 = dVar4.k(eVar1110.k(aVar11111117));
            m6.h hVarK11111111111111117 = dVar4.k(eVar1110.k(aVar11111118));
            m6.h hVarK11111111111111118 = dVar4.k(eVar1110.k(aVar11111119));
            m6.h hVarK11111111111111119 = dVar4.k(eVar1110.k(aVar111111110));
            m6.b bVarL11111119 = dVar4.l();
            double d111112 = radians110;
            double dSin110 = Math.sin(d111112);
            double d111113 = iE110;
            bVarL11111119.f116814d.k(hVarK11111111111111117, 0.5f);
            bVarL11111119.f116814d.k(hVarK11111111111111119, 0.5f);
            bVarL11111119.f116814d.k(hVarK11111111111111113, -0.5f);
            bVarL11111119.f116814d.k(hVarK11111111111111115, -0.5f);
            bVarL11111119.f116812b = -((float) (dSin110 * d111113));
            dVar4.c(bVarL11111119);
            m6.b bVarL111111110 = dVar4.l();
            float fCos110 = (float) (Math.cos(d111112) * d111113);
            bVarL111111110.f116814d.k(hVarK11111111111111116, 0.5f);
            bVarL111111110.f116814d.k(hVarK11111111111111118, 0.5f);
            bVarL111111110.f116814d.k(hVarK11111111111111112, -0.5f);
            bVarL111111110.f116814d.k(hVarK11111111111111114, -0.5f);
            bVarL111111110.f116812b = -fCos110;
            dVar4.c(bVarL111111110);
        }
        this.f162626m = false;
        this.f162628n = false;
        eVar4 = m6.d.f116820r;
        if (eVar4 != null) {
            eVar4.getClass();
        }
    }

    public boolean d() {
        return this.f162623k0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:221:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:223:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:230:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:232:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:241:0x041c  */
    /* JADX WARN: Code duplicated, block: B:258:0x044f  */
    /* JADX WARN: Code duplicated, block: B:260:0x0455  */
    /* JADX WARN: Code duplicated, block: B:271:0x046a  */
    /* JADX WARN: Code duplicated, block: B:276:0x0474  */
    /* JADX WARN: Code duplicated, block: B:278:0x0478  */
    /* JADX WARN: Code duplicated, block: B:279:0x047a  */
    /* JADX WARN: Code duplicated, block: B:282:0x0482  */
    /* JADX WARN: Code duplicated, block: B:288:0x0490 A[PHI: r3
      0x0490: PHI (r3v17 int) = (r3v16 int), (r3v21 int), (r3v21 int), (r3v21 int) binds: [B:281:0x0480, B:283:0x0486, B:284:0x0488, B:286:0x048c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:291:0x04a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:292:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:293:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:295:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:304:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:338:0x0520  */
    public final void e(m6.d dVar, boolean z14, boolean z15, boolean z16, boolean z17, m6.h hVar, m6.h hVar2, b bVar, boolean z18, d dVar2, d dVar3, int i14, int i15, int i16, int i17, float f14, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, int i18, int i19, int i24, int i25, float f15, boolean z28) {
        int iMin;
        int i26;
        int i27;
        boolean z29;
        m6.h hVarK;
        m6.h hVarK2;
        d dVar4;
        m6.h hVar3;
        int i28;
        int i29;
        boolean z34;
        boolean z35;
        boolean z36;
        boolean z37;
        e eVar;
        boolean z38;
        int iMin2;
        boolean z39;
        int i30;
        int iE;
        int i34;
        int i35;
        HashSet<d> hashSet;
        boolean z44;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        boolean z45;
        boolean z46;
        int i46;
        dVar = dVar;
        int i47 = i24;
        int i48 = i25;
        m6.h hVarK3 = dVar.k(dVar2);
        m6.h hVarK4 = dVar.k(dVar3);
        m6.h hVarK5 = dVar.k(dVar2.f162588f);
        m6.h hVarK6 = dVar.k(dVar3.f162588f);
        boolean zH = dVar2.h();
        boolean zH2 = dVar3.h();
        boolean zH3 = this.S.h();
        int i49 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
        if (zH3) {
            i49++;
        }
        int i54 = i49;
        int i55 = z19 ? 3 : i18;
        int iOrdinal = bVar.ordinal();
        boolean z47 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i55 == 4) ? false : true;
        int i56 = this.f162618i;
        if (i56 != -1 && z14) {
            this.f162618i = -1;
            i15 = i56;
            z47 = false;
        }
        int i57 = this.f162620j;
        if (i57 == -1 || z14) {
            i57 = i15;
        } else {
            this.f162620j = -1;
            z47 = false;
        }
        int i58 = i57;
        if (this.f162623k0 == 8) {
            z47 = false;
            iMin = 0;
        } else {
            iMin = i58;
        }
        if (z28) {
            if (!zH && !zH2 && !zH3) {
                dVar.d(hVarK3, i14);
            } else if (zH && !zH2) {
                i26 = 8;
                dVar.e(hVarK3, hVarK5, dVar2.e(), 8);
            }
            i26 = 8;
        } else {
            i26 = 8;
        }
        if (z47 != 0) {
            if (i54 == 2 || z19 || !(i55 == 1 || i55 == 0)) {
                if (i47 == -2) {
                    i47 = iMin;
                }
                if (i48 == -2) {
                    i48 = iMin;
                }
                if (iMin > 0 && i55 != 1) {
                    iMin = 0;
                }
                if (i47 > 0) {
                    dVar.f(hVarK4, hVarK3, i47, 8);
                    iMin = Math.max(iMin, i47);
                }
                if (i48 > 0) {
                    if (!z15 || i55 != 1) {
                        dVar.g(hVarK4, hVarK3, i48, 8);
                    }
                    iMin = Math.min(iMin, i48);
                }
                if (i55 == 1) {
                    if (z15) {
                        dVar.e(hVarK4, hVarK3, iMin, 8);
                    } else if (z25) {
                        dVar.e(hVarK4, hVarK3, iMin, 5);
                        dVar.g(hVarK4, hVarK3, iMin, 8);
                    } else {
                        dVar.e(hVarK4, hVarK3, iMin, 5);
                        dVar.g(hVarK4, hVarK3, iMin, 8);
                    }
                } else if (i55 == 2) {
                    d.a aVar = dVar2.f162587e;
                    d.a aVar2 = d.a.TOP;
                    if (aVar == aVar2 || aVar == d.a.BOTTOM) {
                        hVarK = dVar.k(this.X.k(aVar2));
                        hVarK2 = dVar.k(this.X.k(d.a.BOTTOM));
                    } else {
                        hVarK = dVar.k(this.X.k(d.a.LEFT));
                        hVarK2 = dVar.k(this.X.k(d.a.RIGHT));
                    }
                    m6.b bVarL = dVar.l();
                    int i59 = i47;
                    bVarL.f116814d.k(hVarK4, -1.0f);
                    bVarL.f116814d.k(hVarK3, 1.0f);
                    bVarL.f116814d.k(hVarK2, f15);
                    bVarL.f116814d.k(hVarK, -f15);
                    dVar.c(bVarL);
                    if (z15) {
                        z47 = false;
                    }
                    z29 = z17;
                    i27 = i59;
                } else {
                    i27 = i47;
                    z29 = true;
                }
            } else {
                int iMax = Math.max(i47, iMin);
                if (i48 > 0) {
                    iMax = Math.min(i48, iMax);
                }
                dVar.e(hVarK4, hVarK3, iMax, 8);
                z29 = z17;
                i27 = i47;
                z47 = false;
            }
            if (z28 || z25) {
                boolean z48 = z29;
                if (i54 >= 2 && z15 && z48) {
                    dVar.f(hVarK3, hVar, 0, 8);
                    d dVar5 = this.P;
                    boolean z49 = z14 || dVar5.f162588f == null;
                    if (!z14 && (dVar4 = dVar5.f162588f) != null) {
                        e eVar2 = dVar4.f162586d;
                        if (eVar2.f162603a0 != 0.0f) {
                            b[] bVarArr = eVar2.W;
                            b bVar2 = bVarArr[0];
                            b bVar3 = b.MATCH_CONSTRAINT;
                            if (bVar2 == bVar3 && bVarArr[1] == bVar3) {
                                z49 = true;
                            } else {
                                z49 = false;
                            }
                        } else {
                            z49 = false;
                        }
                    }
                    if (z49) {
                        dVar.f(hVar2, hVarK4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (zH || zH2 || zH3) {
                if (zH && !zH2) {
                    dVar3 = dVar3;
                    hVarK4 = hVarK4;
                    z29 = z29;
                    hVar3 = hVarK6;
                    z38 = z15;
                    i46 = (z15 && (dVar2.f162588f.f162586d instanceof t6.a)) ? 8 : 5;
                } else if (zH || !zH2) {
                    hVar3 = hVarK6;
                    if (zH && zH2) {
                        e eVar3 = dVar2.f162588f.f162586d;
                        e eVar4 = dVar3.f162588f.f162586d;
                        z29 = z29;
                        e eVar5 = this.X;
                        int i64 = 6;
                        if (z47) {
                            if (i55 == 0) {
                                if (i48 != 0 || i27 != 0) {
                                    i44 = 5;
                                    i45 = 5;
                                    z45 = true;
                                    z46 = false;
                                    z35 = true;
                                } else if (hVarK5.f116859g && hVar3.f116859g) {
                                    dVar.e(hVarK3, hVarK5, dVar2.e(), 8);
                                    dVar.e(hVarK4, hVar3, -dVar3.e(), 8);
                                    return;
                                } else {
                                    i44 = 8;
                                    i45 = 8;
                                    z45 = false;
                                    z46 = true;
                                    z35 = false;
                                }
                                if ((eVar3 instanceof t6.a) || (eVar4 instanceof t6.a)) {
                                    i28 = i44;
                                    hVarK5 = hVarK5;
                                    dVar = dVar;
                                    i55 = i55;
                                    hVarK3 = hVarK3;
                                    hVarK4 = hVarK4;
                                    i64 = 6;
                                    z36 = z46;
                                    hVar2 = hVar2;
                                    z34 = z45;
                                    i29 = 4;
                                } else {
                                    i28 = i44;
                                    hVarK5 = hVarK5;
                                    dVar = dVar;
                                    hVarK3 = hVarK3;
                                    hVarK4 = hVarK4;
                                    i64 = 6;
                                    z36 = z46;
                                    z34 = z45;
                                    i29 = i45;
                                    i55 = i55;
                                    hVar2 = hVar2;
                                }
                            } else {
                                if (i55 == 2) {
                                    if ((eVar3 instanceof t6.a) || (eVar4 instanceof t6.a)) {
                                        i28 = 5;
                                    } else {
                                        dVar = dVar;
                                        i55 = i55;
                                        hVarK3 = hVarK3;
                                        hVarK4 = hVarK4;
                                        hVarK5 = hVarK5;
                                        i64 = 6;
                                        i28 = 5;
                                        i29 = 5;
                                    }
                                    z34 = true;
                                    z35 = true;
                                    z36 = false;
                                    hVar2 = hVar2;
                                } else if (i55 == 1) {
                                    i28 = 8;
                                } else if (i55 == 3) {
                                    i55 = i55;
                                    if (this.C == -1) {
                                        if (z26) {
                                            dVar = dVar;
                                            hVar2 = hVar2;
                                            hVarK3 = hVarK3;
                                            hVarK4 = hVarK4;
                                            hVarK5 = hVarK5;
                                            i64 = z15 ? 5 : 4;
                                        } else {
                                            dVar = dVar;
                                            hVar2 = hVar2;
                                            hVarK3 = hVarK3;
                                            hVarK4 = hVarK4;
                                            hVarK5 = hVarK5;
                                            i64 = 8;
                                        }
                                        i28 = 8;
                                    } else {
                                        if (z19) {
                                            if (i19 == 2 || i19 == 1) {
                                                i38 = 5;
                                                i39 = 4;
                                            } else {
                                                i38 = 8;
                                                i39 = 5;
                                            }
                                            i29 = i39;
                                            z34 = true;
                                            z35 = true;
                                            z36 = true;
                                        } else {
                                            if (i48 > 0) {
                                                dVar = dVar;
                                                hVar2 = hVar2;
                                                hVarK3 = hVarK3;
                                                hVarK4 = hVarK4;
                                                hVarK5 = hVarK5;
                                                i64 = 6;
                                                i28 = 5;
                                            } else if (i48 != 0 || i27 != 0) {
                                                dVar = dVar;
                                                hVar2 = hVar2;
                                                hVarK3 = hVarK3;
                                                hVarK4 = hVarK4;
                                                hVarK5 = hVarK5;
                                                i64 = 6;
                                                i28 = 5;
                                                i29 = 4;
                                            } else if (z26) {
                                                i38 = (eVar3 == eVar5 || eVar4 == eVar5) ? 5 : 4;
                                                i29 = 4;
                                                z34 = true;
                                                z35 = true;
                                                z36 = true;
                                            } else {
                                                dVar = dVar;
                                                hVar2 = hVar2;
                                                hVarK3 = hVarK3;
                                                hVarK4 = hVarK4;
                                                hVarK5 = hVarK5;
                                                i64 = 6;
                                                i28 = 5;
                                                i29 = 8;
                                            }
                                            z34 = true;
                                            z35 = true;
                                            z36 = true;
                                        }
                                        i28 = i38;
                                        dVar = dVar;
                                    }
                                    i29 = 5;
                                    z34 = true;
                                    z35 = true;
                                    z36 = true;
                                } else {
                                    i28 = 5;
                                    i29 = 4;
                                    z34 = false;
                                    z35 = false;
                                }
                                i29 = 4;
                                z34 = true;
                                z35 = true;
                                z36 = false;
                                hVar2 = hVar2;
                            }
                            if (z35 || hVarK5 != hVar3 || eVar3 == eVar5) {
                                z37 = true;
                            } else {
                                z35 = false;
                                z37 = false;
                            }
                            if (z34) {
                                if (z47 && !z24 && !z26 && hVarK5 == hVar && hVar3 == hVar2) {
                                    i37 = 8;
                                    z38 = false;
                                    i36 = 8;
                                    z44 = false;
                                } else {
                                    z38 = z15;
                                    z44 = z37;
                                    i36 = i28;
                                    i37 = i64;
                                }
                                m6.h hVar4 = hVarK5;
                                eVar = eVar4;
                                dVar.b(hVarK3, hVar4, dVar2.e(), f14, hVar3, hVarK4, dVar3.e(), i37);
                                hVarK5 = hVar4;
                                i28 = i36;
                                z37 = z44;
                            } else {
                                eVar = eVar4;
                                z38 = z15;
                            }
                            if (this.f162623k0 != 8 && ((hashSet = dVar3.f162583a) == null || hashSet.size() <= 0)) {
                                return;
                            }
                            if (z35) {
                                if (z38 && hVarK5 != hVar3 && !z47 && ((eVar3 instanceof t6.a) || (eVar instanceof t6.a))) {
                                    i28 = 6;
                                }
                                dVar.f(hVarK3, hVarK5, dVar2.e(), i28);
                                dVar.g(hVarK4, hVar3, -dVar3.e(), i28);
                            }
                            if (z38 || !z27 || (eVar3 instanceof t6.a) || (eVar instanceof t6.a) || eVar == eVar5) {
                                iMin2 = i29;
                                z39 = z37;
                            } else {
                                iMin2 = 6;
                                i28 = 6;
                                z39 = true;
                            }
                            if (z39) {
                                if (z36 && (!z26 || z16)) {
                                    if (eVar3 != eVar5 && eVar != eVar5) {
                                        i64 = iMin2;
                                    }
                                    if ((eVar3 instanceof h) || (eVar instanceof h)) {
                                        i64 = 5;
                                    }
                                    if ((eVar3 instanceof t6.a) || (eVar instanceof t6.a)) {
                                        i64 = 5;
                                    }
                                    if (z26) {
                                        i35 = 5;
                                    } else {
                                        i35 = i64;
                                    }
                                    iMin2 = Math.max(i35, iMin2);
                                }
                                if (z38) {
                                    iMin2 = Math.min(i28, iMin2);
                                    if (z19 || z26 || !(eVar3 == eVar5 || eVar == eVar5)) {
                                        i34 = iMin2;
                                    } else {
                                        i34 = 4;
                                    }
                                } else {
                                    i34 = iMin2;
                                }
                                dVar.e(hVarK3, hVarK5, dVar2.e(), i34);
                                dVar.e(hVarK4, hVar3, -dVar3.e(), i34);
                            }
                            if (z38) {
                                if (hVar == hVarK5) {
                                    iE = dVar2.e();
                                } else {
                                    iE = 0;
                                }
                                if (hVarK5 != hVar) {
                                    dVar.f(hVarK3, hVar, iE, 5);
                                }
                            }
                            if (z38 || !z47 || i16 != 0 || i27 != 0) {
                                i30 = 5;
                            } else if (z47 && i55 == 3) {
                                dVar.f(hVarK4, hVarK3, 0, 8);
                                i30 = 5;
                            } else {
                                i30 = 5;
                                dVar.f(hVarK4, hVarK3, 0, 5);
                            }
                        } else {
                            if (hVarK5.f116859g && hVar3.f116859g) {
                                dVar.b(hVarK3, hVarK5, dVar2.e(), f14, hVar3, hVarK4, dVar3.e(), 8);
                                if (z15 && z29) {
                                    int iE2 = dVar3.f162588f != null ? dVar3.e() : 0;
                                    if (hVar3 != hVar2) {
                                        dVar.f(hVar2, hVarK4, iE2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i28 = 5;
                            i29 = 4;
                            z34 = true;
                            z35 = true;
                        }
                        z36 = false;
                        if (z35) {
                            z37 = true;
                        } else {
                            z37 = true;
                        }
                        if (z34) {
                            if (z47) {
                                z38 = z15;
                                z44 = z37;
                                i36 = i28;
                                i37 = i64;
                            } else {
                                z38 = z15;
                                z44 = z37;
                                i36 = i28;
                                i37 = i64;
                            }
                            m6.h hVar5 = hVarK5;
                            eVar = eVar4;
                            dVar.b(hVarK3, hVar5, dVar2.e(), f14, hVar3, hVarK4, dVar3.e(), i37);
                            hVarK5 = hVar5;
                            i28 = i36;
                            z37 = z44;
                        } else {
                            eVar = eVar4;
                            z38 = z15;
                        }
                        if (this.f162623k0 != 8) {
                        }
                        if (z35) {
                            if (z38) {
                                i28 = 6;
                            }
                            dVar.f(hVarK3, hVarK5, dVar2.e(), i28);
                            dVar.g(hVarK4, hVar3, -dVar3.e(), i28);
                        }
                        if (z38) {
                            iMin2 = i29;
                            z39 = z37;
                        } else {
                            iMin2 = i29;
                            z39 = z37;
                        }
                        if (z39) {
                            if (z36) {
                                if (eVar3 != eVar5) {
                                    i64 = iMin2;
                                }
                                if (eVar3 instanceof h) {
                                    i64 = 5;
                                } else {
                                    i64 = 5;
                                }
                                if (eVar3 instanceof t6.a) {
                                    i64 = 5;
                                } else {
                                    i64 = 5;
                                }
                                if (z26) {
                                    i35 = 5;
                                } else {
                                    i35 = i64;
                                }
                                iMin2 = Math.max(i35, iMin2);
                            }
                            if (z38) {
                                iMin2 = Math.min(i28, iMin2);
                                if (z19) {
                                    i34 = iMin2;
                                } else {
                                    i34 = iMin2;
                                }
                            } else {
                                i34 = iMin2;
                            }
                            dVar.e(hVarK3, hVarK5, dVar2.e(), i34);
                            dVar.e(hVarK4, hVar3, -dVar3.e(), i34);
                        }
                        if (z38) {
                            if (hVar == hVarK5) {
                                iE = dVar2.e();
                            } else {
                                iE = 0;
                            }
                            if (hVarK5 != hVar) {
                                dVar.f(hVarK3, hVar, iE, 5);
                            }
                        }
                        if (z38) {
                            i30 = 5;
                        } else {
                            i30 = 5;
                        }
                    }
                    i46 = i30;
                } else {
                    hVar3 = hVarK6;
                    dVar.e(hVarK4, hVar3, -dVar3.e(), 8);
                    if (z15) {
                        dVar.f(hVarK3, hVar, 0, 5);
                        dVar3 = dVar3;
                        i30 = 5;
                        hVarK4 = hVarK4;
                        z29 = z29;
                    }
                    z38 = z15;
                    i46 = i30;
                }
                if (z38 || !z29) {
                    return;
                }
                int iE3 = dVar3.f162588f != null ? dVar3.e() : 0;
                if (hVar3 != hVar2) {
                    dVar.f(hVar2, hVarK4, iE3, i46);
                    return;
                }
                return;
            }
            hVar3 = hVarK6;
            i30 = 5;
            z38 = z15;
            i46 = i30;
            if (z38) {
                return;
            } else {
                return;
            }
        }
        if (z18) {
            dVar.e(hVarK4, hVarK3, 0, 3);
            if (i16 > 0) {
                dVar.f(hVarK4, hVarK3, i16, i26);
            }
            if (i17 < Integer.MAX_VALUE) {
                dVar.g(hVarK4, hVarK3, i17, i26);
            }
        } else {
            dVar.e(hVarK4, hVarK3, iMin, i26);
        }
        z29 = z17;
        i27 = i47;
        if (z28) {
        }
        boolean z410 = z29;
        if (i54 >= 2) {
        }
    }

    public final void f(d.a aVar, e eVar, d.a aVar2, int i14) {
        d.a aVar3;
        d.a aVar4;
        boolean z14;
        d.a aVar5 = d.a.CENTER;
        if (aVar == aVar5) {
            if (aVar2 != aVar5) {
                d.a aVar6 = d.a.LEFT;
                if (aVar2 == aVar6 || aVar2 == d.a.RIGHT) {
                    f(aVar6, eVar, aVar2, 0);
                    f(d.a.RIGHT, eVar, aVar2, 0);
                    k(aVar5).a(eVar.k(aVar2), 0);
                    return;
                }
                d.a aVar7 = d.a.TOP;
                if (aVar2 == aVar7 || aVar2 == d.a.BOTTOM) {
                    f(aVar7, eVar, aVar2, 0);
                    f(d.a.BOTTOM, eVar, aVar2, 0);
                    k(aVar5).a(eVar.k(aVar2), 0);
                    return;
                }
                return;
            }
            d.a aVar8 = d.a.LEFT;
            d dVarK = k(aVar8);
            d.a aVar9 = d.a.RIGHT;
            d dVarK2 = k(aVar9);
            d.a aVar10 = d.a.TOP;
            d dVarK3 = k(aVar10);
            d.a aVar11 = d.a.BOTTOM;
            d dVarK4 = k(aVar11);
            boolean z15 = true;
            if ((dVarK == null || !dVarK.h()) && (dVarK2 == null || !dVarK2.h())) {
                f(aVar8, eVar, aVar8, 0);
                f(aVar9, eVar, aVar9, 0);
                z14 = true;
            } else {
                z14 = false;
            }
            if ((dVarK3 == null || !dVarK3.h()) && (dVarK4 == null || !dVarK4.h())) {
                f(aVar10, eVar, aVar10, 0);
                f(aVar11, eVar, aVar11, 0);
            } else {
                z15 = false;
            }
            if (z14 && z15) {
                k(aVar5).a(eVar.k(aVar5), 0);
                return;
            }
            if (z14) {
                d.a aVar12 = d.a.CENTER_X;
                k(aVar12).a(eVar.k(aVar12), 0);
                return;
            } else {
                if (z15) {
                    d.a aVar13 = d.a.CENTER_Y;
                    k(aVar13).a(eVar.k(aVar13), 0);
                    return;
                }
                return;
            }
        }
        d.a aVar14 = d.a.CENTER_X;
        if (aVar == aVar14 && (aVar2 == (aVar4 = d.a.LEFT) || aVar2 == d.a.RIGHT)) {
            d dVarK5 = k(aVar4);
            d dVarK6 = eVar.k(aVar2);
            d dVarK7 = k(d.a.RIGHT);
            dVarK5.a(dVarK6, 0);
            dVarK7.a(dVarK6, 0);
            k(aVar14).a(dVarK6, 0);
            return;
        }
        d.a aVar15 = d.a.CENTER_Y;
        if (aVar == aVar15 && (aVar2 == (aVar3 = d.a.TOP) || aVar2 == d.a.BOTTOM)) {
            d dVarK8 = eVar.k(aVar2);
            k(aVar3).a(dVarK8, 0);
            k(d.a.BOTTOM).a(dVarK8, 0);
            k(aVar15).a(dVarK8, 0);
            return;
        }
        if (aVar == aVar14 && aVar2 == aVar14) {
            d.a aVar16 = d.a.LEFT;
            k(aVar16).a(eVar.k(aVar16), 0);
            d.a aVar17 = d.a.RIGHT;
            k(aVar17).a(eVar.k(aVar17), 0);
            k(aVar14).a(eVar.k(aVar2), 0);
            return;
        }
        if (aVar == aVar15 && aVar2 == aVar15) {
            d.a aVar18 = d.a.TOP;
            k(aVar18).a(eVar.k(aVar18), 0);
            d.a aVar19 = d.a.BOTTOM;
            k(aVar19).a(eVar.k(aVar19), 0);
            k(aVar15).a(eVar.k(aVar2), 0);
            return;
        }
        d dVarK9 = k(aVar);
        d dVarK10 = eVar.k(aVar2);
        if (dVarK9.i(dVarK10)) {
            d.a aVar20 = d.a.BASELINE;
            if (aVar == aVar20) {
                d dVarK11 = k(d.a.TOP);
                d dVarK12 = k(d.a.BOTTOM);
                if (dVarK11 != null) {
                    dVarK11.j();
                }
                if (dVarK12 != null) {
                    dVarK12.j();
                }
            } else if (aVar == d.a.TOP || aVar == d.a.BOTTOM) {
                d dVarK13 = k(aVar20);
                if (dVarK13 != null) {
                    dVarK13.j();
                }
                d dVarK14 = k(aVar5);
                if (dVarK14.f162588f != dVarK10) {
                    dVarK14.j();
                }
                d dVarF = k(aVar).f();
                d dVarK15 = k(aVar15);
                if (dVarK15.h()) {
                    dVarF.j();
                    dVarK15.j();
                }
            } else if (aVar == d.a.LEFT || aVar == d.a.RIGHT) {
                d dVarK16 = k(aVar5);
                if (dVarK16.f162588f != dVarK10) {
                    dVarK16.j();
                }
                d dVarF2 = k(aVar).f();
                d dVarK17 = k(aVar14);
                if (dVarK17.h()) {
                    dVarF2.j();
                    dVarK17.j();
                }
            }
            dVarK9.a(dVarK10, i14);
        }
    }

    public final void g(d dVar, d dVar2, int i14) {
        if (dVar.f162586d == this) {
            f(dVar.f162587e, dVar2.f162586d, dVar2.f162587e, i14);
        }
    }

    public void h(e eVar, HashMap<e, e> map) {
        this.f162634q = eVar.f162634q;
        this.f162636r = eVar.f162636r;
        this.f162640t = eVar.f162640t;
        this.f162642u = eVar.f162642u;
        int[] iArr = eVar.f162644v;
        int i14 = iArr[0];
        int[] iArr2 = this.f162644v;
        iArr2[0] = i14;
        iArr2[1] = iArr[1];
        this.f162646w = eVar.f162646w;
        this.f162647x = eVar.f162647x;
        this.f162649z = eVar.f162649z;
        this.A = eVar.A;
        this.B = eVar.B;
        this.C = eVar.C;
        this.D = eVar.D;
        int[] iArr3 = eVar.E;
        this.E = Arrays.copyOf(iArr3, iArr3.length);
        this.F = eVar.F;
        this.G = eVar.G;
        this.H = eVar.H;
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.S.j();
        this.W = (b[]) Arrays.copyOf(this.W, 2);
        this.X = this.X == null ? null : map.get(eVar.X);
        this.Y = eVar.Y;
        this.Z = eVar.Z;
        this.f162603a0 = eVar.f162603a0;
        this.f162605b0 = eVar.f162605b0;
        this.f162607c0 = eVar.f162607c0;
        this.f162609d0 = eVar.f162609d0;
        this.f162611e0 = eVar.f162611e0;
        this.f162613f0 = eVar.f162613f0;
        this.f162615g0 = eVar.f162615g0;
        this.f162617h0 = eVar.f162617h0;
        this.f162619i0 = eVar.f162619i0;
        this.f162621j0 = eVar.f162621j0;
        this.f162623k0 = eVar.f162623k0;
        this.f162625l0 = eVar.f162625l0;
        this.f162627m0 = eVar.f162627m0;
        this.f162629n0 = eVar.f162629n0;
        this.f162631o0 = eVar.f162631o0;
        float[] fArr = eVar.f162633p0;
        float f14 = fArr[0];
        float[] fArr2 = this.f162633p0;
        fArr2[0] = f14;
        fArr2[1] = fArr[1];
        e[] eVarArr = eVar.f162635q0;
        e eVar2 = eVarArr[0];
        e[] eVarArr2 = this.f162635q0;
        eVarArr2[0] = eVar2;
        eVarArr2[1] = eVarArr[1];
        e[] eVarArr3 = eVar.f162637r0;
        e eVar3 = eVarArr3[0];
        e[] eVarArr4 = this.f162637r0;
        eVarArr4[0] = eVar3;
        eVarArr4[1] = eVarArr3[1];
        e eVar4 = eVar.f162639s0;
        this.f162639s0 = eVar4 == null ? null : map.get(eVar4);
        e eVar5 = eVar.f162641t0;
        this.f162641t0 = eVar5 != null ? map.get(eVar5) : null;
    }

    public final void i(m6.d dVar) {
        dVar.k(this.L);
        dVar.k(this.M);
        dVar.k(this.N);
        dVar.k(this.O);
        if (this.f162611e0 > 0) {
            dVar.k(this.P);
        }
    }

    public final void j() {
        if (this.f162608d == null) {
            this.f162608d = new u6.l(this);
        }
        if (this.f162610e == null) {
            this.f162610e = new n(this);
        }
    }

    public d k(d.a aVar) {
        switch (a.f162650a[aVar.ordinal()]) {
            case 1:
                return this.L;
            case 2:
                return this.M;
            case 3:
                return this.N;
            case 4:
                return this.O;
            case 5:
                return this.P;
            case 6:
                return this.S;
            case 7:
                return this.Q;
            case 8:
                return this.R;
            case 9:
                return null;
            default:
                vb.h.q(aVar.name());
                return null;
        }
    }

    public final b l(int i14) {
        if (i14 == 0) {
            return this.W[0];
        }
        if (i14 == 1) {
            return this.W[1];
        }
        return null;
    }

    public final int m() {
        if (this.f162623k0 == 8) {
            return 0;
        }
        return this.Z;
    }

    public final e n(int i14) {
        d dVar;
        d dVar2;
        if (i14 != 0) {
            if (i14 == 1 && (dVar2 = (dVar = this.O).f162588f) != null && dVar2.f162588f == dVar) {
                return dVar2.f162586d;
            }
            return null;
        }
        d dVar3 = this.N;
        d dVar4 = dVar3.f162588f;
        if (dVar4 == null || dVar4.f162588f != dVar3) {
            return null;
        }
        return dVar4.f162586d;
    }

    public final e o(int i14) {
        d dVar;
        d dVar2;
        if (i14 != 0) {
            if (i14 == 1 && (dVar2 = (dVar = this.M).f162588f) != null && dVar2.f162588f == dVar) {
                return dVar2.f162586d;
            }
            return null;
        }
        d dVar3 = this.L;
        d dVar4 = dVar3.f162588f;
        if (dVar4 == null || dVar4.f162588f != dVar3) {
            return null;
        }
        return dVar4.f162586d;
    }

    public void p(StringBuilder sb3) {
        sb3.append("  " + this.f162624l + ":{\n");
        StringBuilder sb4 = new StringBuilder("    actualWidth:");
        sb4.append(this.Y);
        sb3.append(sb4.toString());
        sb3.append("\n");
        sb3.append("    actualHeight:" + this.Z);
        sb3.append("\n");
        sb3.append("    actualLeft:" + this.f162607c0);
        sb3.append("\n");
        sb3.append("    actualTop:" + this.f162609d0);
        sb3.append("\n");
        r(sb3, TtmlNode.LEFT, this.L);
        r(sb3, "top", this.M);
        r(sb3, TtmlNode.RIGHT, this.N);
        r(sb3, "bottom", this.O);
        r(sb3, "baseline", this.P);
        r(sb3, "centerX", this.Q);
        r(sb3, "centerY", this.R);
        int i14 = this.Y;
        int i15 = this.f162613f0;
        int i16 = this.E[0];
        int i17 = this.f162646w;
        int i18 = this.f162640t;
        float f14 = this.f162648y;
        b bVar = this.W[0];
        float[] fArr = this.f162633p0;
        float f15 = fArr[0];
        q(sb3, "    width", i14, i15, i16, i17, i18, f14, bVar);
        int i19 = this.Z;
        int i24 = this.f162615g0;
        int i25 = this.E[1];
        int i26 = this.f162649z;
        int i27 = this.f162642u;
        float f16 = this.B;
        b bVar2 = this.W[1];
        float f17 = fArr[1];
        q(sb3, "    height", i19, i24, i25, i26, i27, f16, bVar2);
        float f18 = this.f162603a0;
        int i28 = this.f162605b0;
        if (f18 != 0.0f) {
            sb3.append("    dimensionRatio");
            sb3.append(" :  [");
            sb3.append(f18);
            sb3.append(",");
            sb3.append(i28);
            sb3.append("");
            sb3.append("],\n");
        }
        J(sb3, "    horizontalBias", this.f162617h0, 0.5f);
        J(sb3, "    verticalBias", this.f162619i0, 0.5f);
        I(this.f162629n0, 0, "    horizontalChainStyle", sb3);
        I(this.f162631o0, 0, "    verticalChainStyle", sb3);
        sb3.append("  }");
    }

    public final int s() {
        if (this.f162623k0 == 8) {
            return 0;
        }
        return this.Y;
    }

    public final int t() {
        e eVar = this.X;
        return (eVar == null || !(eVar instanceof f)) ? this.f162607c0 : ((f) eVar).E0 + this.f162607c0;
    }

    public String toString() {
        String strO = "";
        StringBuilder sbK = e5.k("");
        if (this.f162627m0 != null) {
            strO = am.j.o(this.f162627m0, StringUtils.SPACE, new StringBuilder("id: "));
        }
        sbK.append(strO);
        sbK.append("(");
        sbK.append(this.f162607c0);
        sbK.append(", ");
        sbK.append(this.f162609d0);
        sbK.append(") - (");
        sbK.append(this.Y);
        sbK.append(" x ");
        return am.j.q(sbK, this.Z, ")");
    }

    public final int u() {
        e eVar = this.X;
        return (eVar == null || !(eVar instanceof f)) ? this.f162609d0 : ((f) eVar).F0 + this.f162609d0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
    public final boolean v(int i14) {
        if (i14 == 0) {
            if ((this.L.f162588f != null ? 1 : 0) + (this.N.f162588f != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.M.f162588f != null ? 1 : 0) + (this.O.f162588f != null ? 1 : 0) + (this.P.f162588f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public final boolean w(int i14, int i15) {
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        if (i14 == 0) {
            d dVar5 = this.L;
            d dVar6 = dVar5.f162588f;
            if (dVar6 == null || !dVar6.f162585c || (dVar4 = (dVar3 = this.N).f162588f) == null || !dVar4.f162585c) {
                return false;
            }
            return (dVar4.d() - dVar3.e()) - (dVar5.e() + dVar5.f162588f.d()) >= i15;
        }
        d dVar7 = this.M;
        d dVar8 = dVar7.f162588f;
        if (dVar8 == null || !dVar8.f162585c || (dVar2 = (dVar = this.O).f162588f) == null || !dVar2.f162585c) {
            return false;
        }
        return (dVar2.d() - dVar.e()) - (dVar7.e() + dVar7.f162588f.d()) >= i15;
    }

    public final void x(d.a aVar, e eVar, d.a aVar2, int i14, int i15) {
        k(aVar).b(eVar.k(aVar2), i14, i15, true);
    }

    public final boolean y(int i14) {
        d dVar;
        d dVar2;
        int i15 = i14 * 2;
        d[] dVarArr = this.T;
        d dVar3 = dVarArr[i15];
        d dVar4 = dVar3.f162588f;
        return (dVar4 == null || dVar4.f162588f == dVar3 || (dVar2 = (dVar = dVarArr[i15 + 1]).f162588f) == null || dVar2.f162588f != dVar) ? false : true;
    }

    public final boolean z() {
        d dVar = this.L;
        d dVar2 = dVar.f162588f;
        if (dVar2 != null && dVar2.f162588f == dVar) {
            return true;
        }
        d dVar3 = this.N;
        d dVar4 = dVar3.f162588f;
        return dVar4 != null && dVar4.f162588f == dVar3;
    }

    public e() {
        this.f162602a = false;
        this.f162608d = null;
        this.f162610e = null;
        this.f162612f = new boolean[]{true, true};
        this.f162614g = true;
        this.f162616h = true;
        this.f162618i = -1;
        this.f162620j = -1;
        this.f162622k = new q6.h(this);
        this.f162626m = false;
        this.f162628n = false;
        this.f162630o = false;
        this.f162632p = false;
        this.f162634q = -1;
        this.f162636r = -1;
        this.f162638s = 0;
        this.f162640t = 0;
        this.f162642u = 0;
        this.f162644v = new int[2];
        this.f162646w = 0;
        this.f162647x = 0;
        this.f162648y = 1.0f;
        this.f162649z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = -1;
        this.D = 1.0f;
        this.E = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.F = Float.NaN;
        this.G = false;
        this.I = false;
        this.J = 0;
        this.K = 0;
        d dVar = new d(this, d.a.LEFT);
        this.L = dVar;
        d dVar2 = new d(this, d.a.TOP);
        this.M = dVar2;
        d dVar3 = new d(this, d.a.RIGHT);
        this.N = dVar3;
        d dVar4 = new d(this, d.a.BOTTOM);
        this.O = dVar4;
        d dVar5 = new d(this, d.a.BASELINE);
        this.P = dVar5;
        this.Q = new d(this, d.a.CENTER_X);
        this.R = new d(this, d.a.CENTER_Y);
        d dVar6 = new d(this, d.a.CENTER);
        this.S = dVar6;
        this.T = new d[]{dVar, dVar3, dVar2, dVar4, dVar5, dVar6};
        this.U = new ArrayList<>();
        this.V = new boolean[2];
        b bVar = b.FIXED;
        this.W = new b[]{bVar, bVar};
        this.X = null;
        this.Y = 0;
        this.Z = 0;
        this.f162603a0 = 0.0f;
        this.f162605b0 = -1;
        this.f162607c0 = 0;
        this.f162609d0 = 0;
        this.f162611e0 = 0;
        this.f162617h0 = 0.5f;
        this.f162619i0 = 0.5f;
        this.f162623k0 = 0;
        this.f162625l0 = false;
        this.f162627m0 = null;
        this.f162629n0 = 0;
        this.f162631o0 = 0;
        this.f162633p0 = new float[]{-1.0f, -1.0f};
        this.f162635q0 = new e[]{null, null};
        this.f162637r0 = new e[]{null, null};
        this.f162639s0 = null;
        this.f162641t0 = null;
        this.f162643u0 = -1;
        this.f162645v0 = -1;
        a();
    }

    public e(int i14, int i15, int i16, int i17) {
        this.f162602a = false;
        this.f162608d = null;
        this.f162610e = null;
        this.f162612f = new boolean[]{true, true};
        this.f162614g = true;
        this.f162616h = true;
        this.f162618i = -1;
        this.f162620j = -1;
        this.f162622k = new q6.h(this);
        this.f162626m = false;
        this.f162628n = false;
        this.f162630o = false;
        this.f162632p = false;
        this.f162634q = -1;
        this.f162636r = -1;
        this.f162638s = 0;
        this.f162640t = 0;
        this.f162642u = 0;
        this.f162644v = new int[2];
        this.f162646w = 0;
        this.f162647x = 0;
        this.f162648y = 1.0f;
        this.f162649z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = -1;
        this.D = 1.0f;
        this.E = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.F = Float.NaN;
        this.G = false;
        this.I = false;
        this.J = 0;
        this.K = 0;
        d dVar = new d(this, d.a.LEFT);
        this.L = dVar;
        d dVar2 = new d(this, d.a.TOP);
        this.M = dVar2;
        d dVar3 = new d(this, d.a.RIGHT);
        this.N = dVar3;
        d dVar4 = new d(this, d.a.BOTTOM);
        this.O = dVar4;
        d dVar5 = new d(this, d.a.BASELINE);
        this.P = dVar5;
        this.Q = new d(this, d.a.CENTER_X);
        this.R = new d(this, d.a.CENTER_Y);
        d dVar6 = new d(this, d.a.CENTER);
        this.S = dVar6;
        this.T = new d[]{dVar, dVar3, dVar2, dVar4, dVar5, dVar6};
        this.U = new ArrayList<>();
        this.V = new boolean[2];
        b bVar = b.FIXED;
        this.W = new b[]{bVar, bVar};
        this.X = null;
        this.f162603a0 = 0.0f;
        this.f162605b0 = -1;
        this.f162611e0 = 0;
        this.f162617h0 = 0.5f;
        this.f162619i0 = 0.5f;
        this.f162623k0 = 0;
        this.f162625l0 = false;
        this.f162627m0 = null;
        this.f162629n0 = 0;
        this.f162631o0 = 0;
        this.f162633p0 = new float[]{-1.0f, -1.0f};
        this.f162635q0 = new e[]{null, null};
        this.f162637r0 = new e[]{null, null};
        this.f162639s0 = null;
        this.f162641t0 = null;
        this.f162643u0 = -1;
        this.f162645v0 = -1;
        this.f162607c0 = i14;
        this.f162609d0 = i15;
        this.Y = i16;
        this.Z = i17;
        a();
    }

    public e(String str, int i14, int i15, int i16, int i17) {
        this(i14, i15, i16, i17);
        this.f162627m0 = str;
    }

    public e(int i14, int i15) {
        this(0, 0, i14, i15);
    }

    public e(String str, int i14, int i15) {
        this(i14, i15);
        this.f162627m0 = str;
    }
}
