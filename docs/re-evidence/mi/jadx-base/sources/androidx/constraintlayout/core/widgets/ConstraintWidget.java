package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import com.miui.tsmclient.net.TSMAuthContants;
import defpackage.air;
import defpackage.at3;
import defpackage.iz5;
import defpackage.mpq;
import defpackage.njr;
import defpackage.sac;
import defpackage.z83;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidget {
    public static float U0 = 0.5f;
    public int A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F;
    public boolean F0;
    public boolean G;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public int J0;
    public int K0;
    public boolean L0;
    public boolean M;
    public boolean M0;
    public float[] N0;
    public ConstraintWidget[] O0;
    public ConstraintWidget[] P0;
    public ConstraintWidget Q0;
    public ConstraintWidget R0;
    public int S0;
    public int T0;
    public ConstraintAnchor X;
    public ConstraintAnchor[] Y;
    public ArrayList<ConstraintAnchor> Z;
    public boolean[] a0;
    public DimensionBehaviour[] b0;
    public at3 c;
    public ConstraintWidget c0;
    public at3 d;
    public int d0;
    public int e0;
    public float f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public String o;
    public int o0;
    public int p0;
    public float q0;
    public float r0;
    public Object s0;
    public int t0;
    public int u0;
    public boolean v0;
    public String w0;
    public String x0;
    public int y0;
    public int z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1900a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public njr[] f1901b = new njr[2];
    public sac e = null;
    public mpq f = null;
    public boolean[] g = {true, true};
    public boolean h = false;
    public boolean i = true;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1902k = true;
    public int l = -1;
    public int m = -1;
    public air n = new air(this);
    public boolean p = false;
    public boolean q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1903r = false;
    public boolean s = false;
    public int t = -1;
    public int u = -1;
    public int v = 0;
    public int w = 0;
    public int x = 0;
    public int[] y = new int[2];
    public int z = 0;
    public int A = 0;
    public float B = 1.0f;
    public int C = 0;
    public int D = 0;
    public float E = 1.0f;
    public int H = -1;
    public float I = 1.0f;
    public int[] J = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float K = 0.0f;
    public boolean L = false;
    public boolean N = false;
    public int O = 0;
    public int P = 0;
    public ConstraintAnchor Q = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
    public ConstraintAnchor R = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
    public ConstraintAnchor S = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
    public ConstraintAnchor T = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
    public ConstraintAnchor U = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
    public ConstraintAnchor V = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
    public ConstraintAnchor W = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f1905b;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            f1905b = iArr;
            try {
                iArr[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1905b[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1905b[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1905b[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            f1904a = iArr2;
            try {
                iArr2[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1904a[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1904a[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1904a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1904a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1904a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1904a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1904a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1904a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public ConstraintWidget() {
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.X = constraintAnchor;
        this.Y = new ConstraintAnchor[]{this.Q, this.S, this.R, this.T, this.U, constraintAnchor};
        this.Z = new ArrayList<>();
        this.a0 = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.b0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.c0 = null;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.0f;
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        float f = U0;
        this.q0 = f;
        this.r0 = f;
        this.t0 = 0;
        this.u0 = 0;
        this.v0 = false;
        this.w0 = null;
        this.x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new ConstraintWidget[]{null, null};
        this.P0 = new ConstraintWidget[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        d();
    }

    public float A() {
        return this.q0;
    }

    public final void A0(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public int B() {
        return this.J0;
    }

    public final void B0(StringBuilder sb, String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public DimensionBehaviour C() {
        return this.b0[0];
    }

    public final void C0(StringBuilder sb, String str, float f, int i) {
        if (f == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f);
        sb.append(",");
        sb.append(i);
        sb.append("");
        sb.append("],\n");
    }

    public int D() {
        ConstraintAnchor constraintAnchor = this.Q;
        int i = constraintAnchor != null ? constraintAnchor.g : 0;
        ConstraintAnchor constraintAnchor2 = this.S;
        return constraintAnchor2 != null ? i + constraintAnchor2.g : i;
    }

    public void D0(boolean z) {
        this.v0 = z;
    }

    public int E() {
        return this.O;
    }

    public void E0(int i) {
        this.n0 = i;
        this.L = i > 0;
    }

    public int F() {
        return this.P;
    }

    public void F0(Object obj) {
        this.s0 = obj;
    }

    public int G(int i) {
        if (i == 0) {
            return Y();
        }
        if (i == 1) {
            return z();
        }
        return 0;
    }

    public void G0(String str) {
        this.w0 = str;
    }

    public int H() {
        return this.J[1];
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    public void H0(String str) {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.f0 = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i2 = 0;
        int i3 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase("W")) {
                i2 = strSubstring.equalsIgnoreCase(com.xiaomi.onetrack.api.c.f13756b) ? 1 : -1;
            }
            i3 = i2;
            i2 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i2);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i;
                }
            } else {
                String strSubstring3 = str.substring(i2, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i;
                } else {
                    float f = Float.parseFloat(strSubstring3);
                    float f2 = Float.parseFloat(strSubstring4);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        fAbs = i;
                    } else {
                        fAbs = i3 == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
        if (i > 0) {
            this.f0 = fAbs;
            this.g0 = i3;
        }
    }

    public int I() {
        return this.J[0];
    }

    public void I0(int i) {
        if (this.L) {
            int i2 = i - this.n0;
            int i3 = this.e0 + i2;
            this.i0 = i2;
            this.R.t(i2);
            this.T.t(i3);
            this.U.t(i);
            this.q = true;
        }
    }

    public int J() {
        return this.p0;
    }

    public void J0(int i, int i2) {
        if (this.p) {
            return;
        }
        this.Q.t(i);
        this.S.t(i2);
        this.h0 = i;
        this.d0 = i2 - i;
        this.p = true;
    }

    public int K() {
        return this.o0;
    }

    public void K0(int i) {
        this.Q.t(i);
        this.h0 = i;
    }

    public ConstraintWidget L(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.T).f) != null && constraintAnchor2.f == constraintAnchor) {
                return constraintAnchor2.d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.S;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        if (constraintAnchor4 == null || constraintAnchor4.f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.d;
    }

    public void L0(int i) {
        this.R.t(i);
        this.i0 = i;
    }

    public ConstraintWidget M() {
        return this.c0;
    }

    public void M0(int i, int i2) {
        if (this.q) {
            return;
        }
        this.R.t(i);
        this.T.t(i2);
        this.i0 = i;
        this.e0 = i2 - i;
        if (this.L) {
            this.U.t(i + this.n0);
        }
        this.q = true;
    }

    public ConstraintWidget N(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.R).f) != null && constraintAnchor2.f == constraintAnchor) {
                return constraintAnchor2.d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.Q;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        if (constraintAnchor4 == null || constraintAnchor4.f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.d;
    }

    public void N0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.h0 = i;
        this.i0 = i2;
        if (this.u0 == 8) {
            this.d0 = 0;
            this.e0 = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.b0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i7 < (i6 = this.d0)) {
            i7 = i6;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i8 < (i5 = this.e0)) {
            i8 = i5;
        }
        this.d0 = i7;
        this.e0 = i8;
        int i9 = this.p0;
        if (i8 < i9) {
            this.e0 = i9;
        }
        int i10 = this.o0;
        if (i7 < i10) {
            this.d0 = i10;
        }
        int i11 = this.A;
        if (i11 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.d0 = Math.min(this.d0, i11);
        }
        int i12 = this.D;
        if (i12 > 0 && this.b0[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.e0 = Math.min(this.e0, i12);
        }
        int i13 = this.d0;
        if (i7 != i13) {
            this.l = i13;
        }
        int i14 = this.e0;
        if (i8 != i14) {
            this.m = i14;
        }
    }

    public int O() {
        return Z() + this.d0;
    }

    public void O0(boolean z) {
        this.L = z;
    }

    public njr P(int i) {
        if (i == 0) {
            return this.e;
        }
        if (i == 1) {
            return this.f;
        }
        return null;
    }

    public void P0(int i) {
        this.e0 = i;
        int i2 = this.p0;
        if (i < i2) {
            this.e0 = i2;
        }
    }

    public void Q(StringBuilder sb) {
        sb.append("  " + this.o + ":{\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    actualWidth:");
        sb2.append(this.d0);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.e0);
        sb.append("\n");
        sb.append("    actualLeft:" + this.h0);
        sb.append("\n");
        sb.append("    actualTop:" + this.i0);
        sb.append("\n");
        S(sb, "left", this.Q);
        S(sb, "top", this.R);
        S(sb, TSMAuthContants.PARAM_KEY_RIGHT, this.S);
        S(sb, "bottom", this.T);
        S(sb, "baseline", this.U);
        S(sb, "centerX", this.V);
        S(sb, "centerY", this.W);
        R(sb, "    width", this.d0, this.o0, this.J[0], this.l, this.z, this.w, this.B, this.N0[0]);
        R(sb, "    height", this.e0, this.p0, this.J[1], this.m, this.C, this.x, this.E, this.N0[1]);
        C0(sb, "    dimensionRatio", this.f0, this.g0);
        A0(sb, "    horizontalBias", this.q0, U0);
        A0(sb, "    verticalBias", this.r0, U0);
        B0(sb, "    horizontalChainStyle", this.J0, 0);
        B0(sb, "    verticalChainStyle", this.K0, 0);
        sb.append("  }");
    }

    public void Q0(float f) {
        this.q0 = f;
    }

    public final void R(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        B0(sb, "      size", i, 0);
        B0(sb, "      min", i2, 0);
        B0(sb, "      max", i3, Integer.MAX_VALUE);
        B0(sb, "      matchMin", i5, 0);
        B0(sb, "      matchDef", i6, 0);
        A0(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public void R0(int i) {
        this.J0 = i;
    }

    public final void S(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.f);
        sb.append("'");
        if (constraintAnchor.h != Integer.MIN_VALUE || constraintAnchor.g != 0) {
            sb.append(",");
            sb.append(constraintAnchor.g);
            if (constraintAnchor.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(constraintAnchor.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public void S0(int i, int i2) {
        this.h0 = i;
        int i3 = i2 - i;
        this.d0 = i3;
        int i4 = this.o0;
        if (i3 < i4) {
            this.d0 = i4;
        }
    }

    public float T() {
        return this.r0;
    }

    public void T0(DimensionBehaviour dimensionBehaviour) {
        this.b0[0] = dimensionBehaviour;
    }

    public int U() {
        return this.K0;
    }

    public void U0(int i, int i2, int i3, float f) {
        this.w = i;
        this.z = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.A = i3;
        this.B = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.w = 2;
    }

    public DimensionBehaviour V() {
        return this.b0[1];
    }

    public void V0(float f) {
        this.N0[0] = f;
    }

    public int W() {
        int i = this.Q != null ? this.R.g : 0;
        return this.S != null ? i + this.T.g : i;
    }

    public void W0(int i, boolean z) {
        this.a0[i] = z;
    }

    public int X() {
        return this.u0;
    }

    public void X0(boolean z) {
        this.M = z;
    }

    public int Y() {
        if (this.u0 == 8) {
            return 0;
        }
        return this.d0;
    }

    public void Y0(boolean z) {
        this.N = z;
    }

    public int Z() {
        ConstraintWidget constraintWidget = this.c0;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.h0 : ((d) constraintWidget).c1 + this.h0;
    }

    public void Z0(int i, int i2) {
        this.O = i;
        this.P = i2;
        c1(false);
    }

    public int a0() {
        ConstraintWidget constraintWidget = this.c0;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.i0 : ((d) constraintWidget).d1 + this.i0;
    }

    public void a1(int i) {
        this.J[1] = i;
    }

    public boolean b0() {
        return this.L;
    }

    public void b1(int i) {
        this.J[0] = i;
    }

    public boolean c0(int i) {
        if (i == 0) {
            return (this.Q.f != null ? 1 : 0) + (this.S.f != null ? 1 : 0) < 2;
        }
        return ((this.R.f != null ? 1 : 0) + (this.T.f != null ? 1 : 0)) + (this.U.f != null ? 1 : 0) < 2;
    }

    public void c1(boolean z) {
        this.i = z;
    }

    public final void d() {
        this.Z.add(this.Q);
        this.Z.add(this.R);
        this.Z.add(this.S);
        this.Z.add(this.T);
        this.Z.add(this.V);
        this.Z.add(this.W);
        this.Z.add(this.X);
        this.Z.add(this.U);
    }

    public boolean d0() {
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            if (this.Z.get(i).m()) {
                return true;
            }
        }
        return false;
    }

    public void d1(int i) {
        if (i < 0) {
            this.p0 = 0;
        } else {
            this.p0 = i;
        }
    }

    public void e(d dVar, androidx.constraintlayout.core.c cVar, HashSet<ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            g.a(dVar, cVar, this);
            hashSet.remove(this);
            g(cVar, dVar.Y1(64));
        }
        if (i == 0) {
            HashSet<ConstraintAnchor> hashSetD = this.Q.d();
            if (hashSetD != null) {
                Iterator<ConstraintAnchor> it = hashSetD.iterator();
                while (it.hasNext()) {
                    it.next().d.e(dVar, cVar, hashSet, i, true);
                }
            }
            HashSet<ConstraintAnchor> hashSetD2 = this.S.d();
            if (hashSetD2 != null) {
                Iterator<ConstraintAnchor> it2 = hashSetD2.iterator();
                while (it2.hasNext()) {
                    it2.next().d.e(dVar, cVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSetD3 = this.R.d();
        if (hashSetD3 != null) {
            Iterator<ConstraintAnchor> it3 = hashSetD3.iterator();
            while (it3.hasNext()) {
                it3.next().d.e(dVar, cVar, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSetD4 = this.T.d();
        if (hashSetD4 != null) {
            Iterator<ConstraintAnchor> it4 = hashSetD4.iterator();
            while (it4.hasNext()) {
                it4.next().d.e(dVar, cVar, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSetD5 = this.U.d();
        if (hashSetD5 != null) {
            Iterator<ConstraintAnchor> it5 = hashSetD5.iterator();
            while (it5.hasNext()) {
                it5.next().d.e(dVar, cVar, hashSet, i, true);
            }
        }
    }

    public boolean e0() {
        return (this.l == -1 && this.m == -1) ? false : true;
    }

    public void e1(int i) {
        if (i < 0) {
            this.o0 = 0;
        } else {
            this.o0 = i;
        }
    }

    public boolean f() {
        return (this instanceof i) || (this instanceof f);
    }

    public boolean f0(int i, int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i == 0) {
            ConstraintAnchor constraintAnchor3 = this.Q.f;
            return constraintAnchor3 != null && constraintAnchor3.n() && (constraintAnchor2 = this.S.f) != null && constraintAnchor2.n() && (this.S.f.e() - this.S.f()) - (this.Q.f.e() + this.Q.f()) >= i2;
        }
        ConstraintAnchor constraintAnchor4 = this.R.f;
        return constraintAnchor4 != null && constraintAnchor4.n() && (constraintAnchor = this.T.f) != null && constraintAnchor.n() && (this.T.f.e() - this.T.f()) - (this.R.f.e() + this.R.f()) >= i2;
        return false;
    }

    public void f1(int i, int i2) {
        this.h0 = i;
        this.i0 = i2;
    }

    /* JADX WARN: Code duplicated, block: B:183:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:185:0x02c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:187:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:190:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:194:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:197:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:200:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:202:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:203:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:206:0x0305  */
    /* JADX WARN: Code duplicated, block: B:215:0x031b  */
    /* JADX WARN: Code duplicated, block: B:227:0x0373  */
    /* JADX WARN: Code duplicated, block: B:230:0x038d  */
    /* JADX WARN: Code duplicated, block: B:231:0x0395  */
    /* JADX WARN: Code duplicated, block: B:234:0x039b  */
    /* JADX WARN: Code duplicated, block: B:235:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:238:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:239:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:242:0x042c  */
    /* JADX WARN: Code duplicated, block: B:244:0x0432  */
    /* JADX WARN: Code duplicated, block: B:246:0x0438  */
    /* JADX WARN: Code duplicated, block: B:259:0x0490  */
    /* JADX WARN: Code duplicated, block: B:264:0x04a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:269:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:272:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:274:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:277:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:278:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:281:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:282:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:285:0x04df  */
    /* JADX WARN: Code duplicated, block: B:287:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:289:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:291:0x0503  */
    /* JADX WARN: Code duplicated, block: B:293:0x0510  */
    /* JADX WARN: Code duplicated, block: B:295:0x0514  */
    /* JADX WARN: Code duplicated, block: B:296:0x051c  */
    /* JADX WARN: Code duplicated, block: B:300:0x0543  */
    /* JADX WARN: Code duplicated, block: B:301:0x0546  */
    /* JADX WARN: Code duplicated, block: B:303:0x0587  */
    /* JADX WARN: Code duplicated, block: B:306:0x058f  */
    /* JADX WARN: Code duplicated, block: B:308:0x0596  */
    /* JADX WARN: Code duplicated, block: B:309:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:312:0x05bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r15v5, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r53v0, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v6 */
    public void g(androidx.constraintlayout.core.c cVar, boolean z) {
        boolean z2;
        boolean z3;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        int i2;
        boolean z7;
        DimensionBehaviour dimensionBehaviour;
        DimensionBehaviour dimensionBehaviour2;
        boolean z8;
        int i3;
        boolean z9;
        boolean z10;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        int i4;
        int i5;
        int i6;
        ?? r15;
        int i7;
        ?? r16;
        ?? r9;
        ConstraintWidget constraintWidget3;
        SolverVariable solverVariableQ;
        ConstraintWidget constraintWidget4;
        SolverVariable solverVariableQ2;
        ConstraintAnchor constraintAnchor;
        ?? r27;
        DimensionBehaviour[] dimensionBehaviourArr;
        boolean z11;
        mpq mpqVar;
        iz5 iz5Var;
        ConstraintWidget constraintWidget5;
        SolverVariable solverVariableQ3;
        ConstraintWidget constraintWidget6;
        SolverVariable solverVariableQ4;
        DimensionBehaviour[] dimensionBehaviourArr2;
        boolean z12;
        sac sacVar;
        int i8;
        int i9;
        boolean zK0;
        boolean zM0;
        sac sacVar2;
        mpq mpqVar2;
        SolverVariable solverVariableQ5 = cVar.q(this.Q);
        SolverVariable solverVariableQ6 = cVar.q(this.S);
        SolverVariable solverVariableQ7 = cVar.q(this.R);
        SolverVariable solverVariableQ8 = cVar.q(this.T);
        SolverVariable solverVariableQ9 = cVar.q(this.U);
        ConstraintWidget constraintWidget7 = this.c0;
        if (constraintWidget7 == null) {
            z2 = false;
            z3 = false;
        } else {
            boolean z13 = constraintWidget7 != null && constraintWidget7.b0[0] == DimensionBehaviour.WRAP_CONTENT;
            boolean z14 = constraintWidget7 != null && constraintWidget7.b0[1] == DimensionBehaviour.WRAP_CONTENT;
            int i10 = this.v;
            if (i10 == 1) {
                z2 = z13;
                z3 = false;
            } else if (i10 == 2) {
                z3 = z14;
                z2 = false;
            } else if (i10 != 3) {
                z3 = z14;
                z2 = z13;
            } else {
                z2 = false;
                z3 = false;
            }
        }
        if (this.u0 == 8 && !this.v0 && !d0()) {
            boolean[] zArr = this.a0;
            if (!zArr[0] && !zArr[1]) {
                return;
            }
        }
        boolean z15 = this.p;
        if (z15 || this.q) {
            if (z15) {
                cVar.f(solverVariableQ5, this.h0);
                cVar.f(solverVariableQ6, this.h0 + this.d0);
                if (z2 && (constraintWidget2 = this.c0) != null) {
                    if (this.f1902k) {
                        d dVar = (d) constraintWidget2;
                        dVar.D1(this.Q);
                        dVar.C1(this.S);
                    } else {
                        cVar.h(cVar.q(constraintWidget2.S), solverVariableQ6, 0, 5);
                    }
                }
            }
            if (this.q) {
                cVar.f(solverVariableQ7, this.i0);
                cVar.f(solverVariableQ8, this.i0 + this.e0);
                if (this.U.m()) {
                    cVar.f(solverVariableQ9, this.i0 + this.n0);
                }
                if (z3 && (constraintWidget = this.c0) != null) {
                    if (this.f1902k) {
                        d dVar2 = (d) constraintWidget;
                        dVar2.I1(this.R);
                        dVar2.H1(this.T);
                    } else {
                        cVar.h(cVar.q(constraintWidget.T), solverVariableQ8, 0, 5);
                    }
                }
            }
            if (this.p && this.q) {
                this.p = false;
                this.q = false;
                return;
            }
        }
        boolean z16 = androidx.constraintlayout.core.c.f1886r;
        if (z && (sacVar2 = this.e) != null && (mpqVar2 = this.f) != null) {
            iz5 iz5Var2 = sacVar2.h;
            if (iz5Var2.j && sacVar2.i.j && mpqVar2.h.j && mpqVar2.i.j) {
                cVar.f(solverVariableQ5, iz5Var2.g);
                cVar.f(solverVariableQ6, this.e.i.g);
                cVar.f(solverVariableQ7, this.f.h.g);
                cVar.f(solverVariableQ8, this.f.i.g);
                cVar.f(solverVariableQ9, this.f.f27079k.g);
                if (this.c0 != null) {
                    if (z2 && this.g[0] && !k0()) {
                        cVar.h(cVar.q(this.c0.S), solverVariableQ6, 0, 8);
                    }
                    if (z3 && this.g[1] && !m0()) {
                        cVar.h(cVar.q(this.c0.T), solverVariableQ8, 0, 8);
                    }
                }
                this.p = false;
                this.q = false;
                return;
            }
        }
        if (this.c0 != null) {
            if (h0(0)) {
                ((d) this.c0).z1(this, 0);
                zK0 = true;
            } else {
                zK0 = k0();
            }
            if (h0(1)) {
                ((d) this.c0).z1(this, 1);
                zM0 = true;
            } else {
                zM0 = m0();
            }
            if (!zK0 && z2 && this.u0 != 8 && this.Q.f == null && this.S.f == null) {
                cVar.h(cVar.q(this.c0.S), solverVariableQ6, 0, 1);
            }
            if (!zM0 && z3 && this.u0 != 8 && this.R.f == null && this.T.f == null && this.U == null) {
                cVar.h(cVar.q(this.c0.T), solverVariableQ8, 0, 1);
            }
            z5 = zK0;
            z4 = zM0;
        } else {
            z4 = false;
            z5 = false;
        }
        int i11 = this.d0;
        int i12 = this.o0;
        if (i11 >= i12) {
            i12 = i11;
        }
        int i13 = this.e0;
        int i14 = this.p0;
        if (i13 >= i14) {
            i14 = i13;
        }
        DimensionBehaviour[] dimensionBehaviourArr3 = this.b0;
        DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr3[0];
        DimensionBehaviour dimensionBehaviour4 = DimensionBehaviour.MATCH_CONSTRAINT;
        int i15 = i12;
        boolean z17 = dimensionBehaviour3 != dimensionBehaviour4;
        DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr3[1];
        int i16 = i14;
        SolverVariable solverVariable3 = solverVariableQ9;
        boolean z18 = dimensionBehaviour5 != dimensionBehaviour4;
        int i17 = this.g0;
        this.H = i17;
        SolverVariable solverVariable4 = solverVariableQ8;
        float f = this.f0;
        this.I = f;
        SolverVariable solverVariable5 = solverVariableQ7;
        int i18 = this.w;
        int i19 = this.x;
        if (f > 0.0f && this.u0 != 8) {
            if (dimensionBehaviour3 == dimensionBehaviour4 && i18 == 0) {
                i18 = 3;
            }
            if (dimensionBehaviour5 == dimensionBehaviour4 && i19 == 0) {
                i19 = 3;
            }
            if (dimensionBehaviour3 == dimensionBehaviour4 && dimensionBehaviour5 == dimensionBehaviour4) {
                i9 = 3;
                if (i18 == 3 && i19 == 3) {
                    s1(z2, z3, z17, z18);
                }
                i15 = i15;
                i = i16;
                z6 = true;
                int[] iArr = this.y;
                iArr[0] = i18;
                iArr[1] = i19;
                this.h = z6;
                if (z6) {
                    int i20 = this.H;
                    i2 = -1;
                    boolean z19 = i20 != 0 || i20 == -1;
                    if (z6 || !((i8 = this.H) == 1 || i8 == i2)) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    dimensionBehaviour = this.b0[0];
                    dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour2 || !(this instanceof d)) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (z8) {
                        i3 = 0;
                    } else {
                        i3 = i15;
                    }
                    z9 = !this.X.o();
                    boolean[] zArr2 = this.a0;
                    boolean z20 = zArr2[0];
                    z10 = zArr2[1];
                    if (this.t != 2 || this.p) {
                        solverVariable = solverVariableQ6;
                        solverVariable2 = solverVariableQ5;
                    } else if (!z || (sacVar = this.e) == null) {
                        constraintWidget5 = this.c0;
                        if (constraintWidget5 != null) {
                            solverVariableQ3 = cVar.q(constraintWidget5.S);
                        } else {
                            solverVariableQ3 = null;
                        }
                        constraintWidget6 = this.c0;
                        if (constraintWidget6 != null) {
                            solverVariableQ4 = cVar.q(constraintWidget6.Q);
                        } else {
                            solverVariableQ4 = null;
                        }
                        boolean z21 = this.g[0];
                        dimensionBehaviourArr2 = this.b0;
                        DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr2[0];
                        ConstraintAnchor constraintAnchor2 = this.Q;
                        ConstraintAnchor constraintAnchor3 = this.S;
                        int i21 = this.h0;
                        int i22 = this.o0;
                        int i23 = this.J[0];
                        float f2 = this.q0;
                        if (dimensionBehaviourArr2[1] == dimensionBehaviour4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        solverVariable = solverVariableQ6;
                        solverVariable2 = solverVariableQ5;
                        i(cVar, true, z2, z3, z21, solverVariableQ4, solverVariableQ3, dimensionBehaviour6, z8, constraintAnchor2, constraintAnchor3, i21, i3, i22, i23, f2, z19, z12, z5, z4, z20, i18, i19, this.z, this.A, this.B, z9);
                    } else {
                        iz5 iz5Var3 = sacVar.h;
                        if (!iz5Var3.j || !sacVar.i.j) {
                            constraintWidget5 = this.c0;
                            if (constraintWidget5 != null) {
                                solverVariableQ3 = cVar.q(constraintWidget5.S);
                            } else {
                                solverVariableQ3 = null;
                            }
                            constraintWidget6 = this.c0;
                            if (constraintWidget6 != null) {
                                solverVariableQ4 = cVar.q(constraintWidget6.Q);
                            } else {
                                solverVariableQ4 = null;
                            }
                            boolean z22 = this.g[0];
                            dimensionBehaviourArr2 = this.b0;
                            DimensionBehaviour dimensionBehaviour7 = dimensionBehaviourArr2[0];
                            ConstraintAnchor constraintAnchor4 = this.Q;
                            ConstraintAnchor constraintAnchor5 = this.S;
                            int i24 = this.h0;
                            int i25 = this.o0;
                            int i26 = this.J[0];
                            float f3 = this.q0;
                            if (dimensionBehaviourArr2[1] == dimensionBehaviour4) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            solverVariable = solverVariableQ6;
                            solverVariable2 = solverVariableQ5;
                            i(cVar, true, z2, z3, z22, solverVariableQ4, solverVariableQ3, dimensionBehaviour7, z8, constraintAnchor4, constraintAnchor5, i24, i3, i25, i26, f3, z19, z12, z5, z4, z20, i18, i19, this.z, this.A, this.B, z9);
                        } else if (z) {
                            cVar.f(solverVariableQ5, iz5Var3.g);
                            cVar.f(solverVariableQ6, this.e.i.g);
                            if (this.c0 != null && z2 && this.g[0] && !k0()) {
                                cVar.h(cVar.q(this.c0.S), solverVariableQ6, 0, 8);
                            }
                            solverVariable = solverVariableQ6;
                            solverVariable2 = solverVariableQ5;
                        } else {
                            solverVariable = solverVariableQ6;
                            solverVariable2 = solverVariableQ5;
                        }
                    }
                    if (z) {
                        ?? r17 = this;
                        mpqVar = r17.f;
                        if (mpqVar != null) {
                            iz5Var = mpqVar.h;
                            if (!iz5Var.j && mpqVar.i.j) {
                                cVar = cVar;
                                solverVariable5 = solverVariable5;
                                cVar.f(solverVariable5, iz5Var.g);
                                solverVariable4 = solverVariable4;
                                cVar.f(solverVariable4, r17.f.i.g);
                                solverVariable3 = solverVariable3;
                                cVar.f(solverVariable3, r17.f.f27079k.g);
                                ConstraintWidget constraintWidget8 = r17.c0;
                                if (constraintWidget8 == null || z4 || !z3) {
                                    i4 = 8;
                                    i5 = 0;
                                    i6 = 1;
                                } else {
                                    i6 = 1;
                                    if (r17.g[1]) {
                                        i4 = 8;
                                        i5 = 0;
                                        cVar.h(cVar.q(constraintWidget8.T), solverVariable4, 0, 8);
                                    } else {
                                        i4 = 8;
                                        i5 = 0;
                                    }
                                }
                                i7 = i5;
                                r16 = r17;
                            }
                            if (r16.u == 2 && i7 != 0 && !r16.q) {
                                if (r16.b0[i6] == dimensionBehaviour2 || !(r16 instanceof d)) {
                                    r9 = i5;
                                } else {
                                    r9 = i6;
                                }
                                if (r9 != 0) {
                                    i = i5;
                                }
                                constraintWidget3 = r16.c0;
                                if (constraintWidget3 != null) {
                                    solverVariableQ = cVar.q(constraintWidget3.T);
                                } else {
                                    solverVariableQ = null;
                                }
                                constraintWidget4 = r16.c0;
                                if (constraintWidget4 != null) {
                                    solverVariableQ2 = cVar.q(constraintWidget4.R);
                                } else {
                                    solverVariableQ2 = null;
                                }
                                if (r16.n0 <= 0 || r16.u0 == i4) {
                                    constraintAnchor = r16.U;
                                    if (constraintAnchor.f != null) {
                                        cVar.e(solverVariable3, solverVariable5, r(), i4);
                                        cVar.e(solverVariable3, cVar.q(r16.U.f), r16.U.f(), i4);
                                        if (z3 != 0) {
                                            cVar.h(solverVariableQ, cVar.q(r16.T), i5, 5);
                                        }
                                        r27 = i5;
                                    } else {
                                        if (r16.u0 == i4) {
                                            cVar.e(solverVariable3, solverVariable5, constraintAnchor.f(), i4);
                                        } else {
                                            cVar.e(solverVariable3, solverVariable5, r(), i4);
                                        }
                                        r27 = z9;
                                    }
                                } else {
                                    r27 = z9;
                                }
                                boolean z23 = r16.g[i6];
                                dimensionBehaviourArr = r16.b0;
                                DimensionBehaviour dimensionBehaviour8 = dimensionBehaviourArr[i6];
                                ConstraintAnchor constraintAnchor6 = r16.R;
                                ConstraintAnchor constraintAnchor7 = r16.T;
                                int i27 = r16.i0;
                                int i28 = r16.p0;
                                int i29 = r16.J[i6];
                                float f4 = r16.r0;
                                if (dimensionBehaviourArr[0] == dimensionBehaviour4) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                i(cVar, false, z3, z2, z23, solverVariableQ2, solverVariableQ, dimensionBehaviour8, r9, constraintAnchor6, constraintAnchor7, i27, i, i28, i29, f4, z7, z11, z4, z5, z10, i19, i18, r16.C, r16.D, r16.E, r27);
                            }
                            if (z6) {
                                if (this.H == 1) {
                                    cVar.k(solverVariable4, solverVariable5, solverVariable, solverVariable2, this.I, 8);
                                } else {
                                    cVar.k(solverVariable, solverVariable2, solverVariable4, solverVariable5, this.I, 8);
                                }
                            }
                            if (this.X.o()) {
                                cVar.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                            }
                            this.p = false;
                            this.q = false;
                        }
                        i4 = 8;
                        i5 = 0;
                        i6 = 1;
                        r15 = r17;
                    } else {
                        i4 = 8;
                        i5 = 0;
                        i6 = 1;
                        r15 = this;
                    }
                    i7 = i6;
                    r16 = r15;
                    if (r16.u == 2) {
                        if (r16.b0[i6] == dimensionBehaviour2) {
                            r9 = i5;
                        } else {
                            r9 = i5;
                        }
                        if (r9 != 0) {
                            i = i5;
                        }
                        constraintWidget3 = r16.c0;
                        if (constraintWidget3 != null) {
                            solverVariableQ = cVar.q(constraintWidget3.T);
                        } else {
                            solverVariableQ = null;
                        }
                        constraintWidget4 = r16.c0;
                        if (constraintWidget4 != null) {
                            solverVariableQ2 = cVar.q(constraintWidget4.R);
                        } else {
                            solverVariableQ2 = null;
                        }
                        if (r16.n0 <= 0) {
                            constraintAnchor = r16.U;
                            if (constraintAnchor.f != null) {
                                cVar.e(solverVariable3, solverVariable5, r(), i4);
                                cVar.e(solverVariable3, cVar.q(r16.U.f), r16.U.f(), i4);
                                if (z3 != 0) {
                                    cVar.h(solverVariableQ, cVar.q(r16.T), i5, 5);
                                }
                                r27 = i5;
                            } else {
                                if (r16.u0 == i4) {
                                    cVar.e(solverVariable3, solverVariable5, constraintAnchor.f(), i4);
                                } else {
                                    cVar.e(solverVariable3, solverVariable5, r(), i4);
                                }
                                r27 = z9;
                            }
                        } else {
                            constraintAnchor = r16.U;
                            if (constraintAnchor.f != null) {
                                cVar.e(solverVariable3, solverVariable5, r(), i4);
                                cVar.e(solverVariable3, cVar.q(r16.U.f), r16.U.f(), i4);
                                if (z3 != 0) {
                                    cVar.h(solverVariableQ, cVar.q(r16.T), i5, 5);
                                }
                                r27 = i5;
                            } else {
                                if (r16.u0 == i4) {
                                    cVar.e(solverVariable3, solverVariable5, constraintAnchor.f(), i4);
                                } else {
                                    cVar.e(solverVariable3, solverVariable5, r(), i4);
                                }
                                r27 = z9;
                            }
                        }
                        boolean z24 = r16.g[i6];
                        dimensionBehaviourArr = r16.b0;
                        DimensionBehaviour dimensionBehaviour9 = dimensionBehaviourArr[i6];
                        ConstraintAnchor constraintAnchor8 = r16.R;
                        ConstraintAnchor constraintAnchor9 = r16.T;
                        int i210 = r16.i0;
                        int i211 = r16.p0;
                        int i212 = r16.J[i6];
                        float f5 = r16.r0;
                        if (dimensionBehaviourArr[0] == dimensionBehaviour4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        i(cVar, false, z3, z2, z24, solverVariableQ2, solverVariableQ, dimensionBehaviour9, r9, constraintAnchor8, constraintAnchor9, i210, i, i211, i212, f5, z7, z11, z4, z5, z10, i19, i18, r16.C, r16.D, r16.E, r27);
                    }
                    if (z6) {
                        if (this.H == 1) {
                            cVar.k(solverVariable4, solverVariable5, solverVariable, solverVariable2, this.I, 8);
                        } else {
                            cVar.k(solverVariable, solverVariable2, solverVariable4, solverVariable5, this.I, 8);
                        }
                    }
                    if (this.X.o()) {
                        cVar.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                    }
                    this.p = false;
                    this.q = false;
                }
                i2 = -1;
                if (z6) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                dimensionBehaviour = this.b0[0];
                dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z8) {
                    i3 = 0;
                } else {
                    i3 = i15;
                }
                z9 = !this.X.o();
                boolean[] zArr3 = this.a0;
                boolean z25 = zArr3[0];
                z10 = zArr3[1];
                if (this.t != 2) {
                    solverVariable = solverVariableQ6;
                    solverVariable2 = solverVariableQ5;
                } else {
                    solverVariable = solverVariableQ6;
                    solverVariable2 = solverVariableQ5;
                }
                if (z) {
                    ?? r18 = this;
                    mpqVar = r18.f;
                    if (mpqVar != null) {
                        iz5Var = mpqVar.h;
                        if (!iz5Var.j) {
                        }
                    }
                    i4 = 8;
                    i5 = 0;
                    i6 = 1;
                    r15 = r18;
                } else {
                    i4 = 8;
                    i5 = 0;
                    i6 = 1;
                    r15 = this;
                }
                i7 = i6;
                r16 = r15;
                if (r16.u == 2) {
                    if (r16.b0[i6] == dimensionBehaviour2) {
                        r9 = i5;
                    } else {
                        r9 = i5;
                    }
                    if (r9 != 0) {
                        i = i5;
                    }
                    constraintWidget3 = r16.c0;
                    if (constraintWidget3 != null) {
                        solverVariableQ = cVar.q(constraintWidget3.T);
                    } else {
                        solverVariableQ = null;
                    }
                    constraintWidget4 = r16.c0;
                    if (constraintWidget4 != null) {
                        solverVariableQ2 = cVar.q(constraintWidget4.R);
                    } else {
                        solverVariableQ2 = null;
                    }
                    if (r16.n0 <= 0) {
                        constraintAnchor = r16.U;
                        if (constraintAnchor.f != null) {
                            cVar.e(solverVariable3, solverVariable5, r(), i4);
                            cVar.e(solverVariable3, cVar.q(r16.U.f), r16.U.f(), i4);
                            if (z3 != 0) {
                                cVar.h(solverVariableQ, cVar.q(r16.T), i5, 5);
                            }
                            r27 = i5;
                        } else {
                            if (r16.u0 == i4) {
                                cVar.e(solverVariable3, solverVariable5, constraintAnchor.f(), i4);
                            } else {
                                cVar.e(solverVariable3, solverVariable5, r(), i4);
                            }
                            r27 = z9;
                        }
                    } else {
                        constraintAnchor = r16.U;
                        if (constraintAnchor.f != null) {
                            cVar.e(solverVariable3, solverVariable5, r(), i4);
                            cVar.e(solverVariable3, cVar.q(r16.U.f), r16.U.f(), i4);
                            if (z3 != 0) {
                                cVar.h(solverVariableQ, cVar.q(r16.T), i5, 5);
                            }
                            r27 = i5;
                        } else {
                            if (r16.u0 == i4) {
                                cVar.e(solverVariable3, solverVariable5, constraintAnchor.f(), i4);
                            } else {
                                cVar.e(solverVariable3, solverVariable5, r(), i4);
                            }
                            r27 = z9;
                        }
                    }
                    boolean z26 = r16.g[i6];
                    dimensionBehaviourArr = r16.b0;
                    DimensionBehaviour dimensionBehaviour10 = dimensionBehaviourArr[i6];
                    ConstraintAnchor constraintAnchor10 = r16.R;
                    ConstraintAnchor constraintAnchor11 = r16.T;
                    int i213 = r16.i0;
                    int i214 = r16.p0;
                    int i215 = r16.J[i6];
                    float f6 = r16.r0;
                    if (dimensionBehaviourArr[0] == dimensionBehaviour4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i(cVar, false, z3, z2, z26, solverVariableQ2, solverVariableQ, dimensionBehaviour10, r9, constraintAnchor10, constraintAnchor11, i213, i, i214, i215, f6, z7, z11, z4, z5, z10, i19, i18, r16.C, r16.D, r16.E, r27);
                }
                if (z6) {
                    if (this.H == 1) {
                        cVar.k(solverVariable4, solverVariable5, solverVariable, solverVariable2, this.I, 8);
                    } else {
                        cVar.k(solverVariable, solverVariable2, solverVariable4, solverVariable5, this.I, 8);
                    }
                }
                if (this.X.o()) {
                    cVar.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                }
                this.p = false;
                this.q = false;
            }
            i9 = 3;
            if (dimensionBehaviour3 == dimensionBehaviour4 && i18 == i9) {
                this.H = 0;
                int i30 = (int) (f * i13);
                if (dimensionBehaviour5 != dimensionBehaviour4) {
                    i18 = 4;
                    i19 = i19;
                    i = i16;
                    z6 = false;
                    i15 = i30;
                } else {
                    i15 = i30;
                    i = i16;
                    z6 = true;
                }
            } else {
                if (dimensionBehaviour5 == dimensionBehaviour4 && i19 == i9) {
                    this.H = 1;
                    if (i17 == -1) {
                        this.I = 1.0f / f;
                    }
                    int i31 = (int) (this.I * i11);
                    if (dimensionBehaviour3 != dimensionBehaviour4) {
                        i19 = 4;
                        i = i31;
                        i18 = i18;
                    } else {
                        i = i31;
                        i18 = i18;
                        i19 = i19;
                        i15 = i15;
                    }
                } else {
                    i15 = i15;
                    i = i16;
                }
                z6 = true;
            }
            int[] iArr2 = this.y;
            iArr2[0] = i18;
            iArr2[1] = i19;
            this.h = z6;
            if (z6) {
                int i216 = this.H;
                i2 = -1;
                if (i216 != 0) {
                }
                if (z6) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                dimensionBehaviour = this.b0[0];
                dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z8) {
                    i3 = 0;
                } else {
                    i3 = i15;
                }
                z9 = !this.X.o();
                boolean[] zArr4 = this.a0;
                boolean z27 = zArr4[0];
                z10 = zArr4[1];
                if (this.t != 2) {
                    solverVariable = solverVariableQ6;
                    solverVariable2 = solverVariableQ5;
                } else {
                    solverVariable = solverVariableQ6;
                    solverVariable2 = solverVariableQ5;
                }
                if (z) {
                    ?? r19 = this;
                    mpqVar = r19.f;
                    if (mpqVar != null) {
                        iz5Var = mpqVar.h;
                        if (!iz5Var.j) {
                        }
                    }
                    i4 = 8;
                    i5 = 0;
                    i6 = 1;
                    r15 = r19;
                } else {
                    i4 = 8;
                    i5 = 0;
                    i6 = 1;
                    r15 = this;
                }
                i7 = i6;
                r16 = r15;
                if (r16.u == 2) {
                    if (r16.b0[i6] == dimensionBehaviour2) {
                        r9 = i5;
                    } else {
                        r9 = i5;
                    }
                    if (r9 != 0) {
                        i = i5;
                    }
                    constraintWidget3 = r16.c0;
                    if (constraintWidget3 != null) {
                        solverVariableQ = cVar.q(constraintWidget3.T);
                    } else {
                        solverVariableQ = null;
                    }
                    constraintWidget4 = r16.c0;
                    if (constraintWidget4 != null) {
                        solverVariableQ2 = cVar.q(constraintWidget4.R);
                    } else {
                        solverVariableQ2 = null;
                    }
                    if (r16.n0 <= 0) {
                        constraintAnchor = r16.U;
                        if (constraintAnchor.f != null) {
                            cVar.e(solverVariable3, solverVariable5, r(), i4);
                            cVar.e(solverVariable3, cVar.q(r16.U.f), r16.U.f(), i4);
                            if (z3 != 0) {
                                cVar.h(solverVariableQ, cVar.q(r16.T), i5, 5);
                            }
                            r27 = i5;
                        } else {
                            if (r16.u0 == i4) {
                                cVar.e(solverVariable3, solverVariable5, constraintAnchor.f(), i4);
                            } else {
                                cVar.e(solverVariable3, solverVariable5, r(), i4);
                            }
                            r27 = z9;
                        }
                    } else {
                        constraintAnchor = r16.U;
                        if (constraintAnchor.f != null) {
                            cVar.e(solverVariable3, solverVariable5, r(), i4);
                            cVar.e(solverVariable3, cVar.q(r16.U.f), r16.U.f(), i4);
                            if (z3 != 0) {
                                cVar.h(solverVariableQ, cVar.q(r16.T), i5, 5);
                            }
                            r27 = i5;
                        } else {
                            if (r16.u0 == i4) {
                                cVar.e(solverVariable3, solverVariable5, constraintAnchor.f(), i4);
                            } else {
                                cVar.e(solverVariable3, solverVariable5, r(), i4);
                            }
                            r27 = z9;
                        }
                    }
                    boolean z28 = r16.g[i6];
                    dimensionBehaviourArr = r16.b0;
                    DimensionBehaviour dimensionBehaviour11 = dimensionBehaviourArr[i6];
                    ConstraintAnchor constraintAnchor12 = r16.R;
                    ConstraintAnchor constraintAnchor13 = r16.T;
                    int i217 = r16.i0;
                    int i218 = r16.p0;
                    int i219 = r16.J[i6];
                    float f7 = r16.r0;
                    if (dimensionBehaviourArr[0] == dimensionBehaviour4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i(cVar, false, z3, z2, z28, solverVariableQ2, solverVariableQ, dimensionBehaviour11, r9, constraintAnchor12, constraintAnchor13, i217, i, i218, i219, f7, z7, z11, z4, z5, z10, i19, i18, r16.C, r16.D, r16.E, r27);
                }
                if (z6) {
                    if (this.H == 1) {
                        cVar.k(solverVariable4, solverVariable5, solverVariable, solverVariable2, this.I, 8);
                    } else {
                        cVar.k(solverVariable, solverVariable2, solverVariable4, solverVariable5, this.I, 8);
                    }
                }
                if (this.X.o()) {
                    cVar.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                }
                this.p = false;
                this.q = false;
            }
            i2 = -1;
            if (z6) {
                z7 = false;
            } else {
                z7 = false;
            }
            dimensionBehaviour = this.b0[0];
            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
            if (dimensionBehaviour == dimensionBehaviour2) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z8) {
                i3 = 0;
            } else {
                i3 = i15;
            }
            z9 = !this.X.o();
            boolean[] zArr5 = this.a0;
            boolean z29 = zArr5[0];
            z10 = zArr5[1];
            if (this.t != 2) {
                solverVariable = solverVariableQ6;
                solverVariable2 = solverVariableQ5;
            } else {
                solverVariable = solverVariableQ6;
                solverVariable2 = solverVariableQ5;
            }
            if (z) {
                ?? r110 = this;
                mpqVar = r110.f;
                if (mpqVar != null) {
                    iz5Var = mpqVar.h;
                    if (!iz5Var.j) {
                    }
                }
                i4 = 8;
                i5 = 0;
                i6 = 1;
                r15 = r110;
            } else {
                i4 = 8;
                i5 = 0;
                i6 = 1;
                r15 = this;
            }
            i7 = i6;
            r16 = r15;
            if (r16.u == 2) {
                if (r16.b0[i6] == dimensionBehaviour2) {
                    r9 = i5;
                } else {
                    r9 = i5;
                }
                if (r9 != 0) {
                    i = i5;
                }
                constraintWidget3 = r16.c0;
                if (constraintWidget3 != null) {
                    solverVariableQ = cVar.q(constraintWidget3.T);
                } else {
                    solverVariableQ = null;
                }
                constraintWidget4 = r16.c0;
                if (constraintWidget4 != null) {
                    solverVariableQ2 = cVar.q(constraintWidget4.R);
                } else {
                    solverVariableQ2 = null;
                }
                if (r16.n0 <= 0) {
                    constraintAnchor = r16.U;
                    if (constraintAnchor.f != null) {
                        cVar.e(solverVariable3, solverVariable5, r(), i4);
                        cVar.e(solverVariable3, cVar.q(r16.U.f), r16.U.f(), i4);
                        if (z3 != 0) {
                            cVar.h(solverVariableQ, cVar.q(r16.T), i5, 5);
                        }
                        r27 = i5;
                    } else {
                        if (r16.u0 == i4) {
                            cVar.e(solverVariable3, solverVariable5, constraintAnchor.f(), i4);
                        } else {
                            cVar.e(solverVariable3, solverVariable5, r(), i4);
                        }
                        r27 = z9;
                    }
                } else {
                    constraintAnchor = r16.U;
                    if (constraintAnchor.f != null) {
                        cVar.e(solverVariable3, solverVariable5, r(), i4);
                        cVar.e(solverVariable3, cVar.q(r16.U.f), r16.U.f(), i4);
                        if (z3 != 0) {
                            cVar.h(solverVariableQ, cVar.q(r16.T), i5, 5);
                        }
                        r27 = i5;
                    } else {
                        if (r16.u0 == i4) {
                            cVar.e(solverVariable3, solverVariable5, constraintAnchor.f(), i4);
                        } else {
                            cVar.e(solverVariable3, solverVariable5, r(), i4);
                        }
                        r27 = z9;
                    }
                }
                boolean z210 = r16.g[i6];
                dimensionBehaviourArr = r16.b0;
                DimensionBehaviour dimensionBehaviour12 = dimensionBehaviourArr[i6];
                ConstraintAnchor constraintAnchor14 = r16.R;
                ConstraintAnchor constraintAnchor15 = r16.T;
                int i2110 = r16.i0;
                int i2111 = r16.p0;
                int i2112 = r16.J[i6];
                float f8 = r16.r0;
                if (dimensionBehaviourArr[0] == dimensionBehaviour4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i(cVar, false, z3, z2, z210, solverVariableQ2, solverVariableQ, dimensionBehaviour12, r9, constraintAnchor14, constraintAnchor15, i2110, i, i2111, i2112, f8, z7, z11, z4, z5, z10, i19, i18, r16.C, r16.D, r16.E, r27);
            }
            if (z6) {
                if (this.H == 1) {
                    cVar.k(solverVariable4, solverVariable5, solverVariable, solverVariable2, this.I, 8);
                } else {
                    cVar.k(solverVariable, solverVariable2, solverVariable4, solverVariable5, this.I, 8);
                }
            }
            if (this.X.o()) {
                cVar.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
            }
            this.p = false;
            this.q = false;
        }
        i18 = i18;
        i19 = i19;
        i = i16;
        z6 = false;
        int[] iArr3 = this.y;
        iArr3[0] = i18;
        iArr3[1] = i19;
        this.h = z6;
        if (z6) {
            int i2113 = this.H;
            i2 = -1;
            if (i2113 != 0) {
            }
            if (z6) {
                z7 = false;
            } else {
                z7 = false;
            }
            dimensionBehaviour = this.b0[0];
            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
            if (dimensionBehaviour == dimensionBehaviour2) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z8) {
                i3 = 0;
            } else {
                i3 = i15;
            }
            z9 = !this.X.o();
            boolean[] zArr6 = this.a0;
            boolean z211 = zArr6[0];
            z10 = zArr6[1];
            if (this.t != 2) {
                solverVariable = solverVariableQ6;
                solverVariable2 = solverVariableQ5;
            } else {
                solverVariable = solverVariableQ6;
                solverVariable2 = solverVariableQ5;
            }
            if (z) {
                ?? r111 = this;
                mpqVar = r111.f;
                if (mpqVar != null) {
                    iz5Var = mpqVar.h;
                    if (!iz5Var.j) {
                    }
                }
                i4 = 8;
                i5 = 0;
                i6 = 1;
                r15 = r111;
            } else {
                i4 = 8;
                i5 = 0;
                i6 = 1;
                r15 = this;
            }
            i7 = i6;
            r16 = r15;
            if (r16.u == 2) {
                if (r16.b0[i6] == dimensionBehaviour2) {
                    r9 = i5;
                } else {
                    r9 = i5;
                }
                if (r9 != 0) {
                    i = i5;
                }
                constraintWidget3 = r16.c0;
                if (constraintWidget3 != null) {
                    solverVariableQ = cVar.q(constraintWidget3.T);
                } else {
                    solverVariableQ = null;
                }
                constraintWidget4 = r16.c0;
                if (constraintWidget4 != null) {
                    solverVariableQ2 = cVar.q(constraintWidget4.R);
                } else {
                    solverVariableQ2 = null;
                }
                if (r16.n0 <= 0) {
                    constraintAnchor = r16.U;
                    if (constraintAnchor.f != null) {
                        cVar.e(solverVariable3, solverVariable5, r(), i4);
                        cVar.e(solverVariable3, cVar.q(r16.U.f), r16.U.f(), i4);
                        if (z3 != 0) {
                            cVar.h(solverVariableQ, cVar.q(r16.T), i5, 5);
                        }
                        r27 = i5;
                    } else {
                        if (r16.u0 == i4) {
                            cVar.e(solverVariable3, solverVariable5, constraintAnchor.f(), i4);
                        } else {
                            cVar.e(solverVariable3, solverVariable5, r(), i4);
                        }
                        r27 = z9;
                    }
                } else {
                    constraintAnchor = r16.U;
                    if (constraintAnchor.f != null) {
                        cVar.e(solverVariable3, solverVariable5, r(), i4);
                        cVar.e(solverVariable3, cVar.q(r16.U.f), r16.U.f(), i4);
                        if (z3 != 0) {
                            cVar.h(solverVariableQ, cVar.q(r16.T), i5, 5);
                        }
                        r27 = i5;
                    } else {
                        if (r16.u0 == i4) {
                            cVar.e(solverVariable3, solverVariable5, constraintAnchor.f(), i4);
                        } else {
                            cVar.e(solverVariable3, solverVariable5, r(), i4);
                        }
                        r27 = z9;
                    }
                }
                boolean z212 = r16.g[i6];
                dimensionBehaviourArr = r16.b0;
                DimensionBehaviour dimensionBehaviour13 = dimensionBehaviourArr[i6];
                ConstraintAnchor constraintAnchor16 = r16.R;
                ConstraintAnchor constraintAnchor17 = r16.T;
                int i2114 = r16.i0;
                int i2115 = r16.p0;
                int i2116 = r16.J[i6];
                float f9 = r16.r0;
                if (dimensionBehaviourArr[0] == dimensionBehaviour4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i(cVar, false, z3, z2, z212, solverVariableQ2, solverVariableQ, dimensionBehaviour13, r9, constraintAnchor16, constraintAnchor17, i2114, i, i2115, i2116, f9, z7, z11, z4, z5, z10, i19, i18, r16.C, r16.D, r16.E, r27);
            }
            if (z6) {
                if (this.H == 1) {
                    cVar.k(solverVariable4, solverVariable5, solverVariable, solverVariable2, this.I, 8);
                } else {
                    cVar.k(solverVariable, solverVariable2, solverVariable4, solverVariable5, this.I, 8);
                }
            }
            if (this.X.o()) {
                cVar.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
            }
            this.p = false;
            this.q = false;
        }
        i2 = -1;
        if (z6) {
            z7 = false;
        } else {
            z7 = false;
        }
        dimensionBehaviour = this.b0[0];
        dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour == dimensionBehaviour2) {
            z8 = false;
        } else {
            z8 = false;
        }
        if (z8) {
            i3 = 0;
        } else {
            i3 = i15;
        }
        z9 = !this.X.o();
        boolean[] zArr7 = this.a0;
        boolean z213 = zArr7[0];
        z10 = zArr7[1];
        if (this.t != 2) {
            solverVariable = solverVariableQ6;
            solverVariable2 = solverVariableQ5;
        } else {
            solverVariable = solverVariableQ6;
            solverVariable2 = solverVariableQ5;
        }
        if (z) {
            ?? r112 = this;
            mpqVar = r112.f;
            if (mpqVar != null) {
                iz5Var = mpqVar.h;
                if (!iz5Var.j) {
                }
            }
            i4 = 8;
            i5 = 0;
            i6 = 1;
            r15 = r112;
        } else {
            i4 = 8;
            i5 = 0;
            i6 = 1;
            r15 = this;
        }
        i7 = i6;
        r16 = r15;
        if (r16.u == 2) {
            if (r16.b0[i6] == dimensionBehaviour2) {
                r9 = i5;
            } else {
                r9 = i5;
            }
            if (r9 != 0) {
                i = i5;
            }
            constraintWidget3 = r16.c0;
            if (constraintWidget3 != null) {
                solverVariableQ = cVar.q(constraintWidget3.T);
            } else {
                solverVariableQ = null;
            }
            constraintWidget4 = r16.c0;
            if (constraintWidget4 != null) {
                solverVariableQ2 = cVar.q(constraintWidget4.R);
            } else {
                solverVariableQ2 = null;
            }
            if (r16.n0 <= 0) {
                constraintAnchor = r16.U;
                if (constraintAnchor.f != null) {
                    cVar.e(solverVariable3, solverVariable5, r(), i4);
                    cVar.e(solverVariable3, cVar.q(r16.U.f), r16.U.f(), i4);
                    if (z3 != 0) {
                        cVar.h(solverVariableQ, cVar.q(r16.T), i5, 5);
                    }
                    r27 = i5;
                } else {
                    if (r16.u0 == i4) {
                        cVar.e(solverVariable3, solverVariable5, constraintAnchor.f(), i4);
                    } else {
                        cVar.e(solverVariable3, solverVariable5, r(), i4);
                    }
                    r27 = z9;
                }
            } else {
                constraintAnchor = r16.U;
                if (constraintAnchor.f != null) {
                    cVar.e(solverVariable3, solverVariable5, r(), i4);
                    cVar.e(solverVariable3, cVar.q(r16.U.f), r16.U.f(), i4);
                    if (z3 != 0) {
                        cVar.h(solverVariableQ, cVar.q(r16.T), i5, 5);
                    }
                    r27 = i5;
                } else {
                    if (r16.u0 == i4) {
                        cVar.e(solverVariable3, solverVariable5, constraintAnchor.f(), i4);
                    } else {
                        cVar.e(solverVariable3, solverVariable5, r(), i4);
                    }
                    r27 = z9;
                }
            }
            boolean z214 = r16.g[i6];
            dimensionBehaviourArr = r16.b0;
            DimensionBehaviour dimensionBehaviour14 = dimensionBehaviourArr[i6];
            ConstraintAnchor constraintAnchor18 = r16.R;
            ConstraintAnchor constraintAnchor19 = r16.T;
            int i2117 = r16.i0;
            int i2118 = r16.p0;
            int i2119 = r16.J[i6];
            float f10 = r16.r0;
            if (dimensionBehaviourArr[0] == dimensionBehaviour4) {
                z11 = true;
            } else {
                z11 = false;
            }
            i(cVar, false, z3, z2, z214, solverVariableQ2, solverVariableQ, dimensionBehaviour14, r9, constraintAnchor18, constraintAnchor19, i2117, i, i2118, i2119, f10, z7, z11, z4, z5, z10, i19, i18, r16.C, r16.D, r16.E, r27);
        }
        if (z6) {
            if (this.H == 1) {
                cVar.k(solverVariable4, solverVariable5, solverVariable, solverVariable2, this.I, 8);
            } else {
                cVar.k(solverVariable, solverVariable2, solverVariable4, solverVariable5, this.I, 8);
            }
        }
        if (this.X.o()) {
            cVar.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
        }
        this.p = false;
        this.q = false;
    }

    public void g0(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        q(type).b(constraintWidget.q(type2), i, i2, true);
    }

    public void g1(ConstraintWidget constraintWidget) {
        this.c0 = constraintWidget;
    }

    public boolean h() {
        return this.u0 != 8;
    }

    public final boolean h0(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i2 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = this.Y;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i2];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        return (constraintAnchor4 == null || constraintAnchor4.f == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i2 + 1]).f) == null || constraintAnchor2.f != constraintAnchor) ? false : true;
    }

    public void h1(float f) {
        this.r0 = f;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x018b  */
    /* JADX WARN: Code duplicated, block: B:108:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:112:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:238:0x0418  */
    /* JADX WARN: Code duplicated, block: B:240:0x041c  */
    /* JADX WARN: Code duplicated, block: B:246:0x042f  */
    /* JADX WARN: Code duplicated, block: B:249:0x0465  */
    /* JADX WARN: Code duplicated, block: B:257:0x0487  */
    /* JADX WARN: Code duplicated, block: B:267:0x049f  */
    /* JADX WARN: Code duplicated, block: B:270:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:280:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:283:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:284:0x04df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:304:0x0506  */
    /* JADX WARN: Code duplicated, block: B:306:0x0509  */
    /* JADX WARN: Code duplicated, block: B:308:0x050f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:314:0x0528 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:315:0x052a  */
    /* JADX WARN: Code duplicated, block: B:316:0x052f  */
    /* JADX WARN: Code duplicated, block: B:318:0x0532  */
    /* JADX WARN: Code duplicated, block: B:319:0x0537  */
    /* JADX WARN: Code duplicated, block: B:321:0x053a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:353:0x0585 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:382:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:70:0x010d  */
    /* JADX WARN: Code duplicated, block: B:71:0x010f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0112  */
    /* JADX WARN: Code duplicated, block: B:74:0x0114  */
    /* JADX WARN: Code duplicated, block: B:81:0x011f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0129  */
    /* JADX WARN: Code duplicated, block: B:87:0x012e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0139  */
    /* JADX WARN: Code duplicated, block: B:92:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x013f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0147  */
    /* JADX WARN: Code duplicated, block: B:96:0x015c  */
    /* JADX WARN: Code duplicated, block: B:98:0x015f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void i(androidx.constraintlayout.core.c cVar, boolean z, boolean z2, boolean z3, boolean z4, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        int i9;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int iMin;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z13;
        ConstraintAnchor.Type typeK;
        ConstraintAnchor.Type type;
        SolverVariable solverVariableQ;
        SolverVariable solverVariableQ2;
        ConstraintAnchor constraintAnchor3;
        int iF;
        int i17;
        boolean z14;
        int i18;
        char c;
        char c2;
        boolean z15;
        boolean z16;
        int i19;
        int i20;
        boolean z17;
        SolverVariable solverVariable3;
        int i21;
        boolean z18;
        boolean z19;
        SolverVariable solverVariable4;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        SolverVariable solverVariable5;
        ConstraintWidget constraintWidget3;
        int i22;
        int i23;
        int iF2;
        int iMin2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        int i30 = i8;
        SolverVariable solverVariableQ3 = cVar.q(constraintAnchor);
        SolverVariable solverVariableQ4 = cVar.q(constraintAnchor2);
        SolverVariable solverVariableQ5 = cVar.q(constraintAnchor.j());
        SolverVariable solverVariableQ6 = cVar.q(constraintAnchor2.j());
        androidx.constraintlayout.core.c.x();
        boolean zO = constraintAnchor.o();
        boolean zO2 = constraintAnchor2.o();
        boolean zO3 = this.X.o();
        int i31 = zO2 ? (zO ? 1 : 0) + 1 : zO ? 1 : 0;
        if (zO3) {
            i31++;
        }
        int i32 = z6 ? 3 : i5;
        int i33 = a.f1905b[dimensionBehaviour.ordinal()];
        if (i33 != 1 && i33 != 2 && i33 != 3 && i33 == 4) {
            i9 = i32;
            z12 = i9 != 4;
            i10 = this.l;
            if (i10 != -1 && z) {
                this.l = -1;
                i2 = i10;
                z12 = false;
            }
            i11 = this.m;
            if (i11 != -1 || z) {
                i11 = i2;
            } else {
                this.m = -1;
                z12 = false;
            }
            i12 = i11;
            if (this.u0 == 8) {
                iMin = 0;
                z12 = false;
            } else {
                iMin = i12;
            }
            if (!z11) {
                if (zO && !zO2 && !zO3) {
                    cVar.f(solverVariableQ3, i);
                } else if (zO && !zO2) {
                    i13 = 8;
                    cVar.e(solverVariableQ3, solverVariableQ5, constraintAnchor.f(), 8);
                }
                i13 = 8;
            } else {
                i13 = 8;
            }
            if (!z12) {
                if (i31 == 2 && !z6 && (i9 == 1 || i9 == 0)) {
                    int iMax = Math.max(i7, iMin);
                    if (i30 > 0) {
                        iMax = Math.min(i30, iMax);
                    }
                    cVar.e(solverVariableQ4, solverVariableQ3, iMax, 8);
                    z13 = false;
                } else {
                    if (i7 == -2) {
                        i14 = iMin;
                    } else {
                        i14 = i7;
                    }
                    if (i30 == -2) {
                        i15 = iMin;
                    } else {
                        i15 = i30;
                    }
                    if (iMin > 0 && i9 != 1) {
                        iMin = 0;
                    }
                    if (i14 > 0) {
                        cVar.h(solverVariableQ4, solverVariableQ3, i14, 8);
                        iMin = Math.max(iMin, i14);
                    }
                    if (i15 > 0) {
                        if (z2 || i9 != 1) {
                            cVar.j(solverVariableQ4, solverVariableQ3, i15, 8);
                        }
                        iMin = Math.min(iMin, i15);
                    }
                    if (i9 == 1) {
                        if (z2) {
                            cVar.e(solverVariableQ4, solverVariableQ3, iMin, 8);
                        } else if (z8) {
                            cVar.e(solverVariableQ4, solverVariableQ3, iMin, 5);
                            cVar.j(solverVariableQ4, solverVariableQ3, iMin, 8);
                        } else {
                            cVar.e(solverVariableQ4, solverVariableQ3, iMin, 5);
                            cVar.j(solverVariableQ4, solverVariableQ3, iMin, 8);
                        }
                        i30 = i15;
                        i31 = i31 == true ? 1 : 0;
                        solverVariableQ4 = solverVariableQ4;
                        z13 = z12;
                        solverVariableQ6 = solverVariableQ6;
                        z4 = z4;
                        i16 = i14;
                        solverVariableQ5 = solverVariableQ5;
                    } else if (i9 == 2) {
                        typeK = constraintAnchor.k();
                        type = ConstraintAnchor.Type.TOP;
                        if (typeK != type || constraintAnchor.k() == ConstraintAnchor.Type.BOTTOM) {
                            solverVariableQ = cVar.q(this.c0.q(type));
                            solverVariableQ2 = cVar.q(this.c0.q(ConstraintAnchor.Type.BOTTOM));
                        } else {
                            solverVariableQ = cVar.q(this.c0.q(ConstraintAnchor.Type.LEFT));
                            solverVariableQ2 = cVar.q(this.c0.q(ConstraintAnchor.Type.RIGHT));
                        }
                        SolverVariable solverVariable6 = solverVariableQ;
                        SolverVariable solverVariable7 = solverVariableQ2;
                        androidx.constraintlayout.core.b bVarR = cVar.r();
                        int i34 = i15;
                        i31 = i31 == true ? 1 : 0;
                        solverVariableQ6 = solverVariableQ6;
                        int i35 = i14;
                        solverVariableQ5 = solverVariableQ5;
                        solverVariableQ4 = solverVariableQ4;
                        cVar.d(bVarR.k(solverVariableQ4, solverVariableQ3, solverVariable7, solverVariable6, f2));
                        if (z2) {
                            z12 = false;
                        }
                        i30 = i34;
                        i16 = i35;
                        z13 = z12;
                        z4 = z4;
                    } else {
                        int i36 = i15;
                        int i37 = i14;
                        i31 = i31 == true ? 1 : 0;
                        solverVariableQ5 = solverVariableQ5;
                        solverVariableQ4 = solverVariableQ4;
                        solverVariableQ6 = solverVariableQ6;
                        i30 = i36;
                        i16 = i37;
                        z13 = z12;
                        z4 = true;
                    }
                }
                if (z11 || z8) {
                    if (i31 >= 2 && z2 && z4) {
                        cVar.h(solverVariableQ3, solverVariable, 0, 8);
                        Object[] objArr = z || this.U.f == null;
                        if (!z && (constraintAnchor3 = this.U.f) != null) {
                            ConstraintWidget constraintWidget6 = constraintAnchor3.d;
                            if (constraintWidget6.f0 == 0.0f) {
                                return;
                            }
                            DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.b0;
                            DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                            DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                            if (dimensionBehaviour2 != dimensionBehaviour3 || dimensionBehaviourArr[1] != dimensionBehaviour3) {
                                return;
                            }
                        } else if (objArr == false) {
                            return;
                        }
                        cVar.h(solverVariable2, solverVariableQ4, 0, 8);
                        return;
                    }
                    return;
                }
                if (zO || zO2 || zO3) {
                    if (!zO || zO2) {
                        if (!zO && zO2) {
                            cVar.e(solverVariableQ4, solverVariableQ6, -constraintAnchor2.f(), 8);
                            if (!z2) {
                                i17 = 5;
                                iF = 0;
                            } else if (this.j && solverVariableQ3.g && (constraintWidget4 = this.c0) != null) {
                                d dVar = (d) constraintWidget4;
                                if (z) {
                                    dVar.D1(constraintAnchor);
                                } else {
                                    dVar.I1(constraintAnchor);
                                }
                                i17 = 5;
                                iF = 0;
                            } else {
                                cVar.h(solverVariableQ3, solverVariable, 0, 5);
                                iF = 0;
                                i17 = 5;
                            }
                        } else if (zO && zO2) {
                            ConstraintWidget constraintWidget7 = constraintAnchor.f.d;
                            boolean z20 = false;
                            ConstraintWidget constraintWidget8 = constraintAnchor2.f.d;
                            ConstraintWidget constraintWidgetM = M();
                            int i38 = 6;
                            if (z13) {
                                if (i9 == 0) {
                                    if (i30 != 0 || i16 != 0) {
                                        z20 = false;
                                        i28 = 5;
                                        i29 = 5;
                                        z16 = true;
                                        z15 = true;
                                    } else if (solverVariableQ5.g && solverVariableQ6.g) {
                                        cVar.e(solverVariableQ3, solverVariableQ5, constraintAnchor.f(), 8);
                                        cVar.e(solverVariableQ4, solverVariableQ6, -constraintAnchor2.f(), 8);
                                        return;
                                    } else {
                                        i28 = 8;
                                        i29 = 8;
                                        z16 = false;
                                        z15 = false;
                                        z20 = true;
                                    }
                                    if ((constraintWidget7 instanceof androidx.constraintlayout.core.widgets.a) || (constraintWidget8 instanceof androidx.constraintlayout.core.widgets.a)) {
                                        z14 = true;
                                        i18 = 8;
                                        c2 = 5;
                                        i20 = 4;
                                    } else {
                                        i20 = i29;
                                        z14 = true;
                                        i18 = 8;
                                        c2 = 5;
                                    }
                                    i19 = i28;
                                    c = 3;
                                } else {
                                    i18 = 8;
                                    if (i9 == 2) {
                                        if ((constraintWidget7 instanceof androidx.constraintlayout.core.widgets.a) || (constraintWidget8 instanceof androidx.constraintlayout.core.widgets.a)) {
                                            c = 3;
                                            z14 = true;
                                            c2 = 5;
                                            i20 = 4;
                                        } else {
                                            c = 3;
                                            z14 = true;
                                            c2 = 5;
                                            i20 = 5;
                                        }
                                        i19 = 5;
                                    } else if (i9 == 1) {
                                        solverVariable2 = solverVariable2;
                                        z20 = false;
                                        i38 = 6;
                                        i19 = 8;
                                        c = 3;
                                        z14 = true;
                                        c2 = 5;
                                        i20 = 4;
                                    } else {
                                        c = 3;
                                        if (i9 != 3) {
                                            z14 = true;
                                            c2 = 5;
                                            i20 = 4;
                                            i19 = 5;
                                            z15 = false;
                                            z16 = false;
                                        } else if (this.H == -1) {
                                            if (z9) {
                                                solverVariable2 = solverVariable2;
                                                i19 = 8;
                                                c = 3;
                                                z14 = true;
                                                c2 = 5;
                                                i38 = z2 ? 5 : 4;
                                            } else {
                                                solverVariable2 = solverVariable2;
                                                i38 = 8;
                                                i19 = 8;
                                                c = 3;
                                                z14 = true;
                                                c2 = 5;
                                            }
                                            i20 = 5;
                                            z15 = true;
                                            z16 = true;
                                            z20 = true;
                                        } else if (z6) {
                                            if (i6 != 2) {
                                                z14 = true;
                                                if (i6 != 1) {
                                                    i26 = 8;
                                                    i27 = 5;
                                                }
                                                i19 = i26;
                                                i20 = i27;
                                                z15 = z14;
                                                z16 = z15;
                                                z20 = z16;
                                                i38 = 6;
                                                c = 3;
                                                c2 = 5;
                                                solverVariable2 = solverVariable2;
                                            } else {
                                                z14 = true;
                                            }
                                            i26 = 5;
                                            i27 = 4;
                                            i19 = i26;
                                            i20 = i27;
                                            z15 = z14;
                                            z16 = z15;
                                            z20 = z16;
                                            i38 = 6;
                                            c = 3;
                                            c2 = 5;
                                            solverVariable2 = solverVariable2;
                                        } else {
                                            z14 = true;
                                            if (i30 > 0) {
                                                z15 = true;
                                                z16 = true;
                                                z20 = true;
                                                c = 3;
                                                c2 = 5;
                                                i20 = 5;
                                            } else if (i30 != 0 || i16 != 0) {
                                                z15 = true;
                                                z16 = true;
                                                z20 = true;
                                                c = 3;
                                                c2 = 5;
                                                i20 = 4;
                                            } else if (z9) {
                                                solverVariable2 = solverVariable2;
                                                i19 = (constraintWidget7 == constraintWidgetM || constraintWidget8 == constraintWidgetM) ? 5 : 4;
                                                z15 = true;
                                                z16 = true;
                                                z20 = true;
                                                i38 = 6;
                                                c = 3;
                                                c2 = 5;
                                                i20 = 4;
                                            } else {
                                                z15 = true;
                                                z16 = true;
                                                z20 = true;
                                                i20 = 8;
                                                c = 3;
                                                c2 = 5;
                                            }
                                            i19 = 5;
                                        }
                                    }
                                    z15 = true;
                                    z16 = true;
                                }
                                if (z15 || solverVariableQ5 != solverVariableQ6 || constraintWidget7 == constraintWidgetM) {
                                    z17 = z14;
                                } else {
                                    z15 = false;
                                    z17 = false;
                                }
                                if (z16) {
                                    if (z13 && !z7 && !z9 && solverVariableQ5 == solverVariable && solverVariableQ6 == solverVariable2) {
                                        i19 = i18;
                                        i25 = i19;
                                        z18 = false;
                                        z17 = false;
                                    } else {
                                        i25 = i38;
                                        z18 = z2;
                                    }
                                    solverVariable3 = solverVariableQ5;
                                    i21 = 4;
                                    cVar.c(solverVariableQ3, solverVariable3, constraintAnchor.f(), f, solverVariableQ6, solverVariableQ4, constraintAnchor2.f(), i25);
                                } else {
                                    solverVariable3 = solverVariableQ5;
                                    i21 = 4;
                                    z18 = z2;
                                }
                                z19 = z17;
                                if (this.u0 != i18 && !constraintAnchor2.m()) {
                                    return;
                                }
                                solverVariable4 = solverVariable3;
                                if (z15) {
                                    if (z18 || solverVariable4 == solverVariableQ6 || z13) {
                                        constraintWidget = constraintWidget8;
                                        constraintWidget2 = constraintWidget7;
                                    } else {
                                        constraintWidget2 = constraintWidget7;
                                        if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.a) {
                                            constraintWidget = constraintWidget8;
                                        } else {
                                            constraintWidget = constraintWidget8;
                                            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
                                            }
                                            solverVariable5 = solverVariableQ3;
                                            cVar.h(solverVariable5, solverVariable4, constraintAnchor.f(), i24);
                                            cVar.j(solverVariableQ4, solverVariableQ6, -constraintAnchor2.f(), i24);
                                            i19 = i24;
                                        }
                                        i24 = 6;
                                        solverVariable5 = solverVariableQ3;
                                        cVar.h(solverVariable5, solverVariable4, constraintAnchor.f(), i24);
                                        cVar.j(solverVariableQ4, solverVariableQ6, -constraintAnchor2.f(), i24);
                                        i19 = i24;
                                    }
                                    i24 = i19;
                                    solverVariable5 = solverVariableQ3;
                                    cVar.h(solverVariable5, solverVariable4, constraintAnchor.f(), i24);
                                    cVar.j(solverVariableQ4, solverVariableQ6, -constraintAnchor2.f(), i24);
                                    i19 = i24;
                                } else {
                                    constraintWidget = constraintWidget8;
                                    constraintWidget2 = constraintWidget7;
                                    solverVariable5 = solverVariableQ3;
                                }
                                if (z18 || !z10 || (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.a) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.a)) {
                                    constraintWidget3 = constraintWidgetM;
                                } else {
                                    constraintWidget3 = constraintWidgetM;
                                    if (constraintWidget != constraintWidget3) {
                                        i22 = 6;
                                        i23 = 6;
                                        z19 = z14;
                                    }
                                    if (z19) {
                                        if (z20 || (z9 && !z3)) {
                                            iMin2 = i22;
                                        } else {
                                            int i39 = (constraintWidget2 == constraintWidget3 || constraintWidget == constraintWidget3) ? 6 : i22;
                                            if ((constraintWidget2 instanceof f) || (constraintWidget instanceof f)) {
                                                i39 = 5;
                                            }
                                            if ((constraintWidget2 instanceof androidx.constraintlayout.core.widgets.a) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.a)) {
                                                i39 = 5;
                                            }
                                            if (z9) {
                                                i39 = 5;
                                            }
                                            iMin2 = Math.max(i39, i22);
                                        }
                                        if (z18) {
                                            iMin2 = Math.min(i23, iMin2);
                                            if (z6 && !z9 && (constraintWidget2 == constraintWidget3 || constraintWidget == constraintWidget3)) {
                                                iMin2 = i21;
                                            }
                                        }
                                        cVar.e(solverVariable5, solverVariable4, constraintAnchor.f(), iMin2);
                                        cVar.e(solverVariableQ4, solverVariableQ6, -constraintAnchor2.f(), iMin2);
                                    }
                                    if (z18) {
                                        if (solverVariable == solverVariable4) {
                                            iF2 = constraintAnchor.f();
                                        } else {
                                            iF2 = 0;
                                        }
                                        if (solverVariable4 != solverVariable) {
                                            i17 = 5;
                                            cVar.h(solverVariable5, solverVariable, iF2, 5);
                                        } else {
                                            i17 = 5;
                                        }
                                    } else {
                                        i17 = 5;
                                    }
                                    if (!z18 && z13) {
                                        solverVariableQ6 = solverVariableQ6;
                                        if (i3 == 0 && i16 == 0) {
                                            if (z13 && i9 == 3) {
                                                iF = 0;
                                                cVar.h(solverVariableQ4, solverVariable5, 0, i18);
                                            } else {
                                                iF = 0;
                                                cVar.h(solverVariableQ4, solverVariable5, 0, i17);
                                            }
                                        }
                                    }
                                    iF = 0;
                                }
                                i22 = i20;
                                i23 = i19;
                                if (z19) {
                                    if (z20) {
                                        iMin2 = i22;
                                    } else {
                                        iMin2 = i22;
                                    }
                                    if (z18) {
                                        iMin2 = Math.min(i23, iMin2);
                                        if (z6) {
                                            iMin2 = i21;
                                        }
                                    }
                                    cVar.e(solverVariable5, solverVariable4, constraintAnchor.f(), iMin2);
                                    cVar.e(solverVariableQ4, solverVariableQ6, -constraintAnchor2.f(), iMin2);
                                }
                                if (z18) {
                                    i17 = 5;
                                } else {
                                    if (solverVariable == solverVariable4) {
                                        iF2 = constraintAnchor.f();
                                    } else {
                                        iF2 = 0;
                                    }
                                    if (solverVariable4 != solverVariable) {
                                        i17 = 5;
                                        cVar.h(solverVariable5, solverVariable, iF2, 5);
                                    } else {
                                        i17 = 5;
                                    }
                                }
                                if (!z18) {
                                }
                            } else {
                                z14 = true;
                                i18 = 8;
                                if (solverVariableQ5.g && solverVariableQ6.g) {
                                    cVar.c(solverVariableQ3, solverVariableQ5, constraintAnchor.f(), f, solverVariableQ6, solverVariableQ4, constraintAnchor2.f(), 8);
                                    if (z2 && z4) {
                                        int iF3 = constraintAnchor2.f != null ? constraintAnchor2.f() : 0;
                                        if (solverVariableQ6 != solverVariable2) {
                                            cVar.h(solverVariable2, solverVariableQ4, iF3, 5);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                c = 3;
                                c2 = 5;
                                z15 = true;
                                z16 = true;
                                i19 = 5;
                                i20 = 4;
                            }
                            z20 = false;
                            if (z15) {
                                z17 = z14;
                            } else {
                                z17 = z14;
                            }
                            if (z16) {
                                if (z13) {
                                    i25 = i38;
                                    z18 = z2;
                                } else {
                                    i25 = i38;
                                    z18 = z2;
                                }
                                solverVariable3 = solverVariableQ5;
                                i21 = 4;
                                cVar.c(solverVariableQ3, solverVariable3, constraintAnchor.f(), f, solverVariableQ6, solverVariableQ4, constraintAnchor2.f(), i25);
                            } else {
                                solverVariable3 = solverVariableQ5;
                                i21 = 4;
                                z18 = z2;
                            }
                            z19 = z17;
                            if (this.u0 != i18) {
                            }
                            solverVariable4 = solverVariable3;
                            if (z15) {
                                if (z18) {
                                    constraintWidget = constraintWidget8;
                                    constraintWidget2 = constraintWidget7;
                                    i24 = i19;
                                } else {
                                    constraintWidget = constraintWidget8;
                                    constraintWidget2 = constraintWidget7;
                                    i24 = i19;
                                }
                                solverVariable5 = solverVariableQ3;
                                cVar.h(solverVariable5, solverVariable4, constraintAnchor.f(), i24);
                                cVar.j(solverVariableQ4, solverVariableQ6, -constraintAnchor2.f(), i24);
                                i19 = i24;
                            } else {
                                constraintWidget = constraintWidget8;
                                constraintWidget2 = constraintWidget7;
                                solverVariable5 = solverVariableQ3;
                            }
                            if (z18) {
                                constraintWidget3 = constraintWidgetM;
                                i22 = i20;
                                i23 = i19;
                            } else {
                                constraintWidget3 = constraintWidgetM;
                                i22 = i20;
                                i23 = i19;
                            }
                            if (z19) {
                                if (z20) {
                                    iMin2 = i22;
                                } else {
                                    iMin2 = i22;
                                }
                                if (z18) {
                                    iMin2 = Math.min(i23, iMin2);
                                    if (z6) {
                                        iMin2 = i21;
                                    }
                                }
                                cVar.e(solverVariable5, solverVariable4, constraintAnchor.f(), iMin2);
                                cVar.e(solverVariableQ4, solverVariableQ6, -constraintAnchor2.f(), iMin2);
                            }
                            if (z18) {
                                i17 = 5;
                            } else {
                                if (solverVariable == solverVariable4) {
                                    iF2 = constraintAnchor.f();
                                } else {
                                    iF2 = 0;
                                }
                                if (solverVariable4 != solverVariable) {
                                    i17 = 5;
                                    cVar.h(solverVariable5, solverVariable, iF2, 5);
                                } else {
                                    i17 = 5;
                                }
                            }
                            if (!z18) {
                            }
                        } else {
                            iF = 0;
                            i17 = 5;
                        }
                        z18 = z2;
                    } else {
                        z18 = z2;
                        i17 = (z2 && (constraintAnchor.f.d instanceof androidx.constraintlayout.core.widgets.a)) ? 8 : 5;
                    }
                    solverVariableQ6 = solverVariableQ6;
                    iF = 0;
                } else {
                    i17 = 5;
                    iF = 0;
                    z18 = z2;
                }
                if (z18 && z4) {
                    if (constraintAnchor2.f != null) {
                        iF = constraintAnchor2.f();
                    }
                    if (solverVariableQ6 != solverVariable2) {
                        if (!this.j || !solverVariableQ4.g || (constraintWidget5 = this.c0) == null) {
                            cVar.h(solverVariable2, solverVariableQ4, iF, i17);
                            return;
                        }
                        d dVar2 = (d) constraintWidget5;
                        if (z) {
                            dVar2.C1(constraintAnchor2);
                            return;
                        } else {
                            dVar2.H1(constraintAnchor2);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (z5) {
                cVar.e(solverVariableQ4, solverVariableQ3, 0, 3);
                if (i3 > 0) {
                    cVar.h(solverVariableQ4, solverVariableQ3, i3, 8);
                }
                if (i4 < Integer.MAX_VALUE) {
                    cVar.j(solverVariableQ4, solverVariableQ3, i4, 8);
                }
            } else {
                cVar.e(solverVariableQ4, solverVariableQ3, iMin, i13);
            }
            z13 = z12;
            i16 = i7;
            if (z11) {
            }
            if (i31 >= 2) {
            }
        }
        i9 = i32;
        i10 = this.l;
        if (i10 != -1) {
            this.l = -1;
            i2 = i10;
            z12 = false;
        }
        i11 = this.m;
        if (i11 != -1) {
            i11 = i2;
        } else {
            i11 = i2;
        }
        i12 = i11;
        if (this.u0 == 8) {
            iMin = 0;
            z12 = false;
        } else {
            iMin = i12;
        }
        if (!z11) {
            i13 = 8;
        } else if (zO) {
            if (zO) {
                i13 = 8;
            } else {
                i13 = 8;
            }
        } else if (zO) {
            i13 = 8;
        } else {
            i13 = 8;
        }
        if (!z12) {
            if (i31 == 2) {
            }
            if (i7 == -2) {
                i14 = iMin;
            } else {
                i14 = i7;
            }
            if (i30 == -2) {
                i15 = iMin;
            } else {
                i15 = i30;
            }
            if (iMin > 0) {
                iMin = 0;
            }
            if (i14 > 0) {
                cVar.h(solverVariableQ4, solverVariableQ3, i14, 8);
                iMin = Math.max(iMin, i14);
            }
            if (i15 > 0) {
                if (z2) {
                    cVar.j(solverVariableQ4, solverVariableQ3, i15, 8);
                } else {
                    cVar.j(solverVariableQ4, solverVariableQ3, i15, 8);
                }
                iMin = Math.min(iMin, i15);
            }
            if (i9 == 1) {
                if (z2) {
                    cVar.e(solverVariableQ4, solverVariableQ3, iMin, 8);
                } else if (z8) {
                    cVar.e(solverVariableQ4, solverVariableQ3, iMin, 5);
                    cVar.j(solverVariableQ4, solverVariableQ3, iMin, 8);
                } else {
                    cVar.e(solverVariableQ4, solverVariableQ3, iMin, 5);
                    cVar.j(solverVariableQ4, solverVariableQ3, iMin, 8);
                }
                i30 = i15;
                i31 = i31 == true ? 1 : 0;
                solverVariableQ4 = solverVariableQ4;
                z13 = z12;
                solverVariableQ6 = solverVariableQ6;
                z4 = z4;
                i16 = i14;
                solverVariableQ5 = solverVariableQ5;
            } else if (i9 == 2) {
                typeK = constraintAnchor.k();
                type = ConstraintAnchor.Type.TOP;
                if (typeK != type) {
                    solverVariableQ = cVar.q(this.c0.q(type));
                    solverVariableQ2 = cVar.q(this.c0.q(ConstraintAnchor.Type.BOTTOM));
                } else {
                    solverVariableQ = cVar.q(this.c0.q(type));
                    solverVariableQ2 = cVar.q(this.c0.q(ConstraintAnchor.Type.BOTTOM));
                }
                SolverVariable solverVariable8 = solverVariableQ;
                SolverVariable solverVariable9 = solverVariableQ2;
                androidx.constraintlayout.core.b bVarR2 = cVar.r();
                int i310 = i15;
                i31 = i31 == true ? 1 : 0;
                solverVariableQ6 = solverVariableQ6;
                int i311 = i14;
                solverVariableQ5 = solverVariableQ5;
                solverVariableQ4 = solverVariableQ4;
                cVar.d(bVarR2.k(solverVariableQ4, solverVariableQ3, solverVariable9, solverVariable8, f2));
                if (z2) {
                    z12 = false;
                }
                i30 = i310;
                i16 = i311;
                z13 = z12;
                z4 = z4;
            } else {
                int i312 = i15;
                int i313 = i14;
                i31 = i31 == true ? 1 : 0;
                solverVariableQ5 = solverVariableQ5;
                solverVariableQ4 = solverVariableQ4;
                solverVariableQ6 = solverVariableQ6;
                i30 = i312;
                i16 = i313;
                z13 = z12;
                z4 = true;
            }
            if (z11) {
            }
            if (i31 >= 2) {
            }
        }
        if (z5) {
            cVar.e(solverVariableQ4, solverVariableQ3, 0, 3);
            if (i3 > 0) {
                cVar.h(solverVariableQ4, solverVariableQ3, i3, 8);
            }
            if (i4 < Integer.MAX_VALUE) {
                cVar.j(solverVariableQ4, solverVariableQ3, i4, 8);
            }
        } else {
            cVar.e(solverVariableQ4, solverVariableQ3, iMin, i13);
        }
        z13 = z12;
        i16 = i7;
        if (z11) {
        }
        if (i31 >= 2) {
        }
    }

    public boolean i0() {
        return this.f1903r;
    }

    public void i1(int i) {
        this.K0 = i;
    }

    public void j(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        k(type, constraintWidget, type2, 0);
    }

    public boolean j0(int i) {
        return this.a0[i];
    }

    public void j1(int i, int i2) {
        this.i0 = i;
        int i3 = i2 - i;
        this.e0 = i3;
        int i4 = this.p0;
        if (i3 < i4) {
            this.e0 = i4;
        }
    }

    public void k(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type == type5) {
            if (type2 != type5) {
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
                if (type2 == type6 || type2 == ConstraintAnchor.Type.RIGHT) {
                    k(type6, constraintWidget, type2, 0);
                    k(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                    q(type5).a(constraintWidget.q(type2), 0);
                    return;
                }
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.TOP;
                if (type2 == type7 || type2 == ConstraintAnchor.Type.BOTTOM) {
                    k(type7, constraintWidget, type2, 0);
                    k(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    q(type5).a(constraintWidget.q(type2), 0);
                    return;
                }
                return;
            }
            ConstraintAnchor.Type type8 = ConstraintAnchor.Type.LEFT;
            ConstraintAnchor constraintAnchorQ = q(type8);
            ConstraintAnchor.Type type9 = ConstraintAnchor.Type.RIGHT;
            ConstraintAnchor constraintAnchorQ2 = q(type9);
            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.TOP;
            ConstraintAnchor constraintAnchorQ3 = q(type10);
            ConstraintAnchor.Type type11 = ConstraintAnchor.Type.BOTTOM;
            ConstraintAnchor constraintAnchorQ4 = q(type11);
            boolean z2 = true;
            if ((constraintAnchorQ == null || !constraintAnchorQ.o()) && (constraintAnchorQ2 == null || !constraintAnchorQ2.o())) {
                k(type8, constraintWidget, type8, 0);
                k(type9, constraintWidget, type9, 0);
                z = true;
            } else {
                z = false;
            }
            if ((constraintAnchorQ3 == null || !constraintAnchorQ3.o()) && (constraintAnchorQ4 == null || !constraintAnchorQ4.o())) {
                k(type10, constraintWidget, type10, 0);
                k(type11, constraintWidget, type11, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                q(type5).a(constraintWidget.q(type5), 0);
                return;
            }
            if (z) {
                ConstraintAnchor.Type type12 = ConstraintAnchor.Type.CENTER_X;
                q(type12).a(constraintWidget.q(type12), 0);
                return;
            } else {
                if (z2) {
                    ConstraintAnchor.Type type13 = ConstraintAnchor.Type.CENTER_Y;
                    q(type13).a(constraintWidget.q(type13), 0);
                    return;
                }
                return;
            }
        }
        ConstraintAnchor.Type type14 = ConstraintAnchor.Type.CENTER_X;
        if (type == type14 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor constraintAnchorQ5 = q(type4);
            ConstraintAnchor constraintAnchorQ6 = constraintWidget.q(type2);
            ConstraintAnchor constraintAnchorQ7 = q(ConstraintAnchor.Type.RIGHT);
            constraintAnchorQ5.a(constraintAnchorQ6, 0);
            constraintAnchorQ7.a(constraintAnchorQ6, 0);
            q(type14).a(constraintAnchorQ6, 0);
            return;
        }
        ConstraintAnchor.Type type15 = ConstraintAnchor.Type.CENTER_Y;
        if (type == type15 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor constraintAnchorQ8 = constraintWidget.q(type2);
            q(type3).a(constraintAnchorQ8, 0);
            q(ConstraintAnchor.Type.BOTTOM).a(constraintAnchorQ8, 0);
            q(type15).a(constraintAnchorQ8, 0);
            return;
        }
        if (type == type14 && type2 == type14) {
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.LEFT;
            q(type16).a(constraintWidget.q(type16), 0);
            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.RIGHT;
            q(type17).a(constraintWidget.q(type17), 0);
            q(type14).a(constraintWidget.q(type2), 0);
            return;
        }
        if (type == type15 && type2 == type15) {
            ConstraintAnchor.Type type18 = ConstraintAnchor.Type.TOP;
            q(type18).a(constraintWidget.q(type18), 0);
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.BOTTOM;
            q(type19).a(constraintWidget.q(type19), 0);
            q(type15).a(constraintWidget.q(type2), 0);
            return;
        }
        ConstraintAnchor constraintAnchorQ9 = q(type);
        ConstraintAnchor constraintAnchorQ10 = constraintWidget.q(type2);
        if (constraintAnchorQ9.p(constraintAnchorQ10)) {
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.BASELINE;
            if (type == type20) {
                ConstraintAnchor constraintAnchorQ11 = q(ConstraintAnchor.Type.TOP);
                ConstraintAnchor constraintAnchorQ12 = q(ConstraintAnchor.Type.BOTTOM);
                if (constraintAnchorQ11 != null) {
                    constraintAnchorQ11.q();
                }
                if (constraintAnchorQ12 != null) {
                    constraintAnchorQ12.q();
                }
            } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                ConstraintAnchor constraintAnchorQ13 = q(type20);
                if (constraintAnchorQ13 != null) {
                    constraintAnchorQ13.q();
                }
                ConstraintAnchor constraintAnchorQ14 = q(type5);
                if (constraintAnchorQ14.j() != constraintAnchorQ10) {
                    constraintAnchorQ14.q();
                }
                ConstraintAnchor constraintAnchorG = q(type).g();
                ConstraintAnchor constraintAnchorQ15 = q(type15);
                if (constraintAnchorQ15.o()) {
                    constraintAnchorG.q();
                    constraintAnchorQ15.q();
                }
            } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor constraintAnchorQ16 = q(type5);
                if (constraintAnchorQ16.j() != constraintAnchorQ10) {
                    constraintAnchorQ16.q();
                }
                ConstraintAnchor constraintAnchorG2 = q(type).g();
                ConstraintAnchor constraintAnchorQ17 = q(type14);
                if (constraintAnchorQ17.o()) {
                    constraintAnchorG2.q();
                    constraintAnchorQ17.q();
                }
            }
            constraintAnchorQ9.a(constraintAnchorQ10, i);
        }
    }

    public boolean k0() {
        ConstraintAnchor constraintAnchor = this.Q;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 != null && constraintAnchor2.f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.S;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        return constraintAnchor4 != null && constraintAnchor4.f == constraintAnchor3;
    }

    public void k1(DimensionBehaviour dimensionBehaviour) {
        this.b0[1] = dimensionBehaviour;
    }

    public void l(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.h() == this) {
            k(constraintAnchor.k(), constraintAnchor2.h(), constraintAnchor2.k(), i);
        }
    }

    public boolean l0() {
        return this.M;
    }

    public void l1(int i, int i2, int i3, float f) {
        this.x = i;
        this.C = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.D = i3;
        this.E = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.x = 2;
    }

    public void m(ConstraintWidget constraintWidget, float f, int i) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        g0(type, constraintWidget, type, i, 0);
        this.K = f;
    }

    public boolean m0() {
        ConstraintAnchor constraintAnchor = this.R;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 != null && constraintAnchor2.f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.T;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        return constraintAnchor4 != null && constraintAnchor4.f == constraintAnchor3;
    }

    public void m1(float f) {
        this.N0[1] = f;
    }

    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        this.t = constraintWidget.t;
        this.u = constraintWidget.u;
        this.w = constraintWidget.w;
        this.x = constraintWidget.x;
        int[] iArr = this.y;
        int[] iArr2 = constraintWidget.y;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.z = constraintWidget.z;
        this.A = constraintWidget.A;
        this.C = constraintWidget.C;
        this.D = constraintWidget.D;
        this.E = constraintWidget.E;
        this.F = constraintWidget.F;
        this.G = constraintWidget.G;
        this.H = constraintWidget.H;
        this.I = constraintWidget.I;
        int[] iArr3 = constraintWidget.J;
        this.J = Arrays.copyOf(iArr3, iArr3.length);
        this.K = constraintWidget.K;
        this.L = constraintWidget.L;
        this.M = constraintWidget.M;
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.W.q();
        this.X.q();
        this.b0 = (DimensionBehaviour[]) Arrays.copyOf(this.b0, 2);
        this.c0 = this.c0 == null ? null : map.get(constraintWidget.c0);
        this.d0 = constraintWidget.d0;
        this.e0 = constraintWidget.e0;
        this.f0 = constraintWidget.f0;
        this.g0 = constraintWidget.g0;
        this.h0 = constraintWidget.h0;
        this.i0 = constraintWidget.i0;
        this.j0 = constraintWidget.j0;
        this.k0 = constraintWidget.k0;
        this.l0 = constraintWidget.l0;
        this.m0 = constraintWidget.m0;
        this.n0 = constraintWidget.n0;
        this.o0 = constraintWidget.o0;
        this.p0 = constraintWidget.p0;
        this.q0 = constraintWidget.q0;
        this.r0 = constraintWidget.r0;
        this.s0 = constraintWidget.s0;
        this.t0 = constraintWidget.t0;
        this.u0 = constraintWidget.u0;
        this.v0 = constraintWidget.v0;
        this.w0 = constraintWidget.w0;
        this.x0 = constraintWidget.x0;
        this.y0 = constraintWidget.y0;
        this.z0 = constraintWidget.z0;
        this.A0 = constraintWidget.A0;
        this.B0 = constraintWidget.B0;
        this.C0 = constraintWidget.C0;
        this.D0 = constraintWidget.D0;
        this.E0 = constraintWidget.E0;
        this.F0 = constraintWidget.F0;
        this.G0 = constraintWidget.G0;
        this.H0 = constraintWidget.H0;
        this.J0 = constraintWidget.J0;
        this.K0 = constraintWidget.K0;
        this.L0 = constraintWidget.L0;
        this.M0 = constraintWidget.M0;
        float[] fArr = this.N0;
        float[] fArr2 = constraintWidget.N0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.O0;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.O0;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.P0;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.P0;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget2 = constraintWidget.Q0;
        this.Q0 = constraintWidget2 == null ? null : map.get(constraintWidget2);
        ConstraintWidget constraintWidget3 = constraintWidget.R0;
        this.R0 = constraintWidget3 != null ? map.get(constraintWidget3) : null;
    }

    public boolean n0() {
        return this.N;
    }

    public void n1(int i) {
        this.u0 = i;
    }

    public void o(androidx.constraintlayout.core.c cVar) {
        cVar.q(this.Q);
        cVar.q(this.R);
        cVar.q(this.S);
        cVar.q(this.T);
        if (this.n0 > 0) {
            cVar.q(this.U);
        }
    }

    public boolean o0() {
        return this.i && this.u0 != 8;
    }

    public void o1(int i) {
        this.d0 = i;
        int i2 = this.o0;
        if (i < i2) {
            this.d0 = i2;
        }
    }

    public void p() {
        if (this.e == null) {
            this.e = new sac(this);
        }
        if (this.f == null) {
            this.f = new mpq(this);
        }
    }

    public boolean p0() {
        return this.p || (this.Q.n() && this.S.n());
    }

    public void p1(int i) {
        if (i < 0 || i > 3) {
            return;
        }
        this.v = i;
    }

    public ConstraintAnchor q(ConstraintAnchor.Type type) {
        switch (a.f1904a[type.ordinal()]) {
            case 1:
                return this.Q;
            case 2:
                return this.R;
            case 3:
                return this.S;
            case 4:
                return this.T;
            case 5:
                return this.U;
            case 6:
                return this.X;
            case 7:
                return this.V;
            case 8:
                return this.W;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public boolean q0() {
        return this.q || (this.R.n() && this.T.n());
    }

    public void q1(int i) {
        this.h0 = i;
    }

    public int r() {
        return this.n0;
    }

    public boolean r0() {
        return this.s;
    }

    public void r1(int i) {
        this.i0 = i;
    }

    public float s(int i) {
        if (i == 0) {
            return this.q0;
        }
        if (i == 1) {
            return this.r0;
        }
        return -1.0f;
    }

    public void s0() {
        this.f1903r = true;
    }

    public void s1(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.H == -1) {
            if (z3 && !z4) {
                this.H = 0;
            } else if (!z3 && z4) {
                this.H = 1;
                if (this.g0 == -1) {
                    this.I = 1.0f / this.I;
                }
            }
        }
        if (this.H == 0 && (!this.R.o() || !this.T.o())) {
            this.H = 1;
        } else if (this.H == 1 && (!this.Q.o() || !this.S.o())) {
            this.H = 0;
        }
        if (this.H == -1 && (!this.R.o() || !this.T.o() || !this.Q.o() || !this.S.o())) {
            if (this.R.o() && this.T.o()) {
                this.H = 0;
            } else if (this.Q.o() && this.S.o()) {
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
        if (this.H == -1) {
            int i = this.z;
            if (i > 0 && this.C == 0) {
                this.H = 0;
            } else {
                if (i != 0 || this.C <= 0) {
                    return;
                }
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
    }

    public int t() {
        return a0() + this.e0;
    }

    public void t0() {
        this.s = true;
    }

    public void t1(boolean z, boolean z2) {
        int i;
        int i2;
        boolean zK = z & this.e.k();
        boolean zK2 = z2 & this.f.k();
        sac sacVar = this.e;
        int i3 = sacVar.h.g;
        mpq mpqVar = this.f;
        int i4 = mpqVar.h.g;
        int i5 = sacVar.i.g;
        int i6 = mpqVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (zK) {
            this.h0 = i3;
        }
        if (zK2) {
            this.i0 = i4;
        }
        if (this.u0 == 8) {
            this.d0 = 0;
            this.e0 = 0;
            return;
        }
        if (zK) {
            if (this.b0[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.d0)) {
                i8 = i2;
            }
            this.d0 = i8;
            int i10 = this.o0;
            if (i8 < i10) {
                this.d0 = i10;
            }
        }
        if (zK2) {
            if (this.b0[1] == DimensionBehaviour.FIXED && i9 < (i = this.e0)) {
                i9 = i;
            }
            this.e0 = i9;
            int i11 = this.p0;
            if (i9 < i11) {
                this.e0 = i11;
            }
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.x0 != null) {
            str = "type: " + this.x0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.w0 != null) {
            str2 = "id: " + this.w0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.h0);
        sb.append(", ");
        sb.append(this.i0);
        sb.append(") - (");
        sb.append(this.d0);
        sb.append(" x ");
        sb.append(this.e0);
        sb.append(")");
        return sb.toString();
    }

    public Object u() {
        return this.s0;
    }

    public boolean u0() {
        DimensionBehaviour[] dimensionBehaviourArr = this.b0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour2 && dimensionBehaviourArr[1] == dimensionBehaviour2;
    }

    public void u1(androidx.constraintlayout.core.c cVar, boolean z) {
        mpq mpqVar;
        sac sacVar;
        int iY = cVar.y(this.Q);
        int iY2 = cVar.y(this.R);
        int iY3 = cVar.y(this.S);
        int iY4 = cVar.y(this.T);
        if (z && (sacVar = this.e) != null) {
            iz5 iz5Var = sacVar.h;
            if (iz5Var.j) {
                iz5 iz5Var2 = sacVar.i;
                if (iz5Var2.j) {
                    iY = iz5Var.g;
                    iY3 = iz5Var2.g;
                }
            }
        }
        if (z && (mpqVar = this.f) != null) {
            iz5 iz5Var3 = mpqVar.h;
            if (iz5Var3.j) {
                iz5 iz5Var4 = mpqVar.i;
                if (iz5Var4.j) {
                    iY2 = iz5Var3.g;
                    iY4 = iz5Var4.g;
                }
            }
        }
        int i = iY4 - iY2;
        if (iY3 - iY < 0 || i < 0 || iY == Integer.MIN_VALUE || iY == Integer.MAX_VALUE || iY2 == Integer.MIN_VALUE || iY2 == Integer.MAX_VALUE || iY3 == Integer.MIN_VALUE || iY3 == Integer.MAX_VALUE || iY4 == Integer.MIN_VALUE || iY4 == Integer.MAX_VALUE) {
            iY = 0;
            iY4 = 0;
            iY2 = 0;
            iY3 = 0;
        }
        N0(iY, iY2, iY3, iY4);
    }

    public String v() {
        return this.w0;
    }

    public void v0() {
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.W.q();
        this.X.q();
        this.c0 = null;
        this.K = 0.0f;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.0f;
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = 0;
        this.p0 = 0;
        float f = U0;
        this.q0 = f;
        this.r0 = f;
        DimensionBehaviour[] dimensionBehaviourArr = this.b0;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.s0 = null;
        this.t0 = 0;
        this.u0 = 0;
        this.x0 = null;
        this.G0 = false;
        this.H0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = false;
        this.M0 = false;
        float[] fArr = this.N0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.t = -1;
        this.u = -1;
        int[] iArr = this.J;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.w = 0;
        this.x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.z = 0;
        this.C = 0;
        this.h = false;
        this.H = -1;
        this.I = 1.0f;
        this.I0 = false;
        boolean[] zArr = this.g;
        zArr[0] = true;
        zArr[1] = true;
        this.N = false;
        boolean[] zArr2 = this.a0;
        zArr2[0] = false;
        zArr2[1] = false;
        this.i = true;
        int[] iArr2 = this.y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.l = -1;
        this.m = -1;
    }

    public DimensionBehaviour w(int i) {
        if (i == 0) {
            return C();
        }
        if (i == 1) {
            return V();
        }
        return null;
    }

    public void w0() {
        x0();
        h1(U0);
        Q0(U0);
    }

    public float x() {
        return this.f0;
    }

    public void x0() {
        ConstraintWidget constraintWidgetM = M();
        if (constraintWidgetM != null && (constraintWidgetM instanceof d) && ((d) M()).Q1()) {
            return;
        }
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            this.Z.get(i).q();
        }
    }

    public int y() {
        return this.g0;
    }

    public void y0() {
        this.p = false;
        this.q = false;
        this.f1903r = false;
        this.s = false;
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            this.Z.get(i).r();
        }
    }

    public int z() {
        if (this.u0 == 8) {
            return 0;
        }
        return this.e0;
    }

    public void z0(z83 z83Var) {
        this.Q.s(z83Var);
        this.R.s(z83Var);
        this.S.s(z83Var);
        this.T.s(z83Var);
        this.U.s(z83Var);
        this.X.s(z83Var);
        this.V.s(z83Var);
        this.W.s(z83Var);
    }
}
