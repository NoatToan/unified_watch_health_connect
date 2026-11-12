package am;

import android.text.TextUtils;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lam/z0;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f4390a = new z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f4391b = p13.u0.e(new o13.p(x0.f4308n, 0), new o13.p(x0.f4312o, 1), new o13.p(x0.f4316p, 2), new o13.p(x0.f4324r, 3), new o13.p(x0.f4331t, 4), new o13.p(x0.f4320q, 5), new o13.p(x0.C, 6), new o13.p(x0.D, 7), new o13.p(x0.U1, 8), new o13.p(x0.f4268a3, 9), new o13.p(x0.f4350y, 10), new o13.p(x0.f4277d3, 11), new o13.p(x0.f4323q3, 12), new o13.p(x0.f4346x, 13), new o13.p(x0.A, 14), new o13.p(x0.f4342w, 15), new o13.p(x0.E, 16));

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4392a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.J0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.D2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.V0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.f4269b1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x0.S0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x0.T0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x0.R0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[x0.f4320q.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[x0.E3.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[x0.V1.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[x0.W1.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[x0.X1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[x0.Z1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[x0.f4267a2.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[x0.f4270b2.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[x0.S1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[x0.G1.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[x0.f4287h1.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[x0.C1.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[x0.K0.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            f4392a = iArr;
        }
    }

    private z0() {
    }

    public static final boolean A(String str) {
        return b(x0.O1, str) || b(x0.H1, str) || b(x0.E1, str) || b(x0.L1, str);
    }

    public static final boolean B(String str) {
        return b(x0.C2, str);
    }

    public static final boolean C(String str) {
        return b(x0.f4352y2, str);
    }

    public static final boolean D(String str) {
        str.getClass();
        return b(x0.D3, str);
    }

    public static final boolean E(String str) {
        return b(x0.f4306m2, str) || b(x0.M2, str);
    }

    public static final boolean F(String str) {
        return b(x0.f4314o2, str) || b(x0.N2, str);
    }

    public static final boolean G(String str) {
        return !TextUtils.isEmpty(str) && b(x0.f4329s2, str);
    }

    public static final boolean H(String str) {
        return !TextUtils.isEmpty(str) && b(x0.C, str);
    }

    public static final boolean I(String str) {
        return p(str) || S(str) || J(str) || L(str) || d0(str);
    }

    public static final boolean J(String str) {
        return b(x0.A2, str) || b(x0.O2, str);
    }

    public static final boolean K(String str) {
        return b(x0.M1, str) || b(x0.D1, str) || b(x0.f4306m2, str) || b(x0.f4314o2, str) || b(x0.A2, str) || b(x0.T1, str) || b(x0.f4302l2, str) || b(x0.f4273c2, str) || b(x0.f4276d2, str) || b(x0.f4294j2, str) || b(x0.I1, str) || b(x0.f4318p2, str) || b(x0.K1, str);
    }

    public static final boolean L(String str) {
        return b(x0.B2, str) || b(x0.P2, str);
    }

    public static final boolean M(String str) {
        return b(x0.Y, str) || b(x0.Z, str);
    }

    public static final boolean N(String str) {
        return !TextUtils.isEmpty(str) && b(x0.f4326r2, str);
    }

    public static final boolean O(String str) {
        return !TextUtils.isEmpty(str) && b(x0.f4340v2, str);
    }

    public static final boolean P(String str) {
        return b(x0.f4267a2, str) || b(x0.f4270b2, str) || b(x0.Z1, str);
    }

    public static final boolean Q(String str) {
        return b(x0.f4273c2, str) || b(x0.S2, str);
    }

    public static final boolean R(String str) {
        return !TextUtils.isEmpty(str) && b(x0.E, str);
    }

    public static final boolean S(String str) {
        return b(x0.f4276d2, str) || b(x0.T2, str);
    }

    public static final boolean T(String str) {
        return !TextUtils.isEmpty(str) && b(x0.f4305m1, str);
    }

    public static final boolean U(String str) {
        return b(x0.f4294j2, str) || b(x0.U2, str);
    }

    public static final boolean V(String str) {
        return !TextUtils.isEmpty(str) && b(x0.f4336u2, str);
    }

    public static final boolean W(String str) {
        return !TextUtils.isEmpty(str) && b(x0.f4309n1, str);
    }

    public static final boolean X(String str) {
        return b(x0.I1, str) || b(x0.V2, str);
    }

    public static final boolean Y(String str) {
        return b(x0.f4338v, str) || b(x0.f4342w, str);
    }

    public static final boolean Z(String str) {
        return b(x0.D2, str);
    }

    public static final boolean a(String str, boolean z14) {
        if (!b(x0.D, str)) {
            return false;
        }
        if (z14) {
            return true;
        }
        return !p13.h0.R(p13.x.k(x0.I.f4358a, x0.Y.f4358a), str);
    }

    public static final boolean a0(String str) {
        return b0(str) || b(x0.G2, str) || b(x0.J2, str) || b(x0.I2, str);
    }

    public static final boolean b(x0 x0Var, String str) {
        y0 y0Var = (y0) KoinJavaComponent.get$default(y0.class, null, null, 6, null);
        x0Var.getClass();
        return y0Var.a(x0Var, str);
    }

    public static final boolean b0(String str) {
        return b(x0.K1, str) || b(x0.H2, str);
    }

    public static final boolean c(String str) {
        return (b(x0.f4308n, str) || b(x0.f4331t, str) || b(x0.f4324r, str) || Q(str) || b(x0.f4297k1, str) || v(str) || z(str) || b(x0.f4344w2, str) || b(x0.f4352y2, str) || b(x0.f4320q, str) || L(str) || b(x0.f4356z2, str) || U(str) || b(x0.C2, str) || b(x0.E2, str) || b(x0.F2, str)) ? false : true;
    }

    public static final boolean c0(String str) {
        return b(x0.f4302l2, str) || b(x0.R2, str);
    }

    public static final x0 d(x0 x0Var, x0 x0Var2) {
        x0Var2.getClass();
        x0 x0VarD = ((y0) KoinJavaComponent.get$default(y0.class, null, null, 6, null)).d(x0Var, x0Var2);
        return p005kotlin.jvm.internal.s.g(x0VarD.f4358a, x0.f4304m.f4358a) ? x0Var2 : x0VarD;
    }

    public static final boolean d0(String str) {
        return b(x0.f4318p2, str) || b(x0.W2, str);
    }

    public static final c3 e(x0 x0Var, boolean z14) {
        x0Var.getClass();
        if (g0(x0Var) && z14) {
            return c22.i.b(R.string.activity_options_bike_title);
        }
        return (h0(x0Var) && z14) ? c22.i.b(R.string.lbl_run) : x0Var.f4360c;
    }

    public static final boolean e0(String str) {
        return !TextUtils.isEmpty(str) && b(x0.f4322q2, str);
    }

    public static final boolean f(String str) {
        str.getClass();
        x0 x0VarM = m(str);
        switch (x0VarM == null ? -1 : a.f4392a[x0VarM.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return true;
            default:
                return false;
        }
    }

    public static final boolean f0(String str) {
        return W(str) || t(str) || e0(str) || N(str) || b(x0.C2, str) || b(x0.f4357z3, str) || b(x0.A3, str) || G(str);
    }

    public static final x0 g(x0 x0Var) {
        x0Var.getClass();
        return ((y0) KoinJavaComponent.get$default(y0.class, null, null, 6, null)).d(x0Var, x0.f4346x);
    }

    public static final boolean g0(x0 x0Var) {
        x0Var.getClass();
        return x0Var == x0.f4312o || x0Var == x0.V0 || x0Var == x0.Z0 || x0Var == x0.X0;
    }

    public static final x0 h(x0 x0Var) {
        return ((y0) KoinJavaComponent.get$default(y0.class, null, null, 6, null)).d(x0Var, x0.f4304m);
    }

    public static final boolean h0(x0 x0Var) {
        x0Var.getClass();
        return x0Var == x0.f4308n || x0Var == x0.J0;
    }

    public static final List<x0> i(x0 x0Var) {
        x0Var.getClass();
        return ((y0) KoinJavaComponent.get$default(y0.class, null, null, 6, null)).k(x0Var);
    }

    public static final boolean i0(String str) {
        return p(str) || S(str) || J(str) || L(str);
    }

    public static final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        for (x0 x0Var : i(x0.f4304m)) {
            if (x0Var != x0.F && x0Var != x0.B && x0Var != x0.E) {
                arrayList.add(x0Var);
            }
        }
        return arrayList;
    }

    public static final boolean j0(String str) {
        return Q(str) || b(x0.f4297k1, str) || b(x0.f4301l1, str);
    }

    public static final x0 k(int i14, x0 x0Var) {
        x0Var.getClass();
        x0 x0VarJ = ((y0) KoinJavaComponent.get$default(y0.class, null, null, 6, null)).j(i14);
        return x0VarJ == null ? x0Var : x0VarJ;
    }

    public static final x0 l(x0 x0Var, String str) {
        x0Var.getClass();
        x0 x0VarM = m(str);
        return x0VarM == null ? x0Var : x0VarM;
    }

    public static final x0 m(String str) {
        if (str == null) {
            return null;
        }
        for (x0 x0Var : x0.values()) {
            if (p005kotlin.jvm.internal.s.g(x0Var.f4358a, str)) {
                return x0Var;
            }
        }
        return null;
    }

    public static final int n(x0 x0Var) {
        y0 y0Var = (y0) KoinJavaComponent.get$default(y0.class, null, null, 6, null);
        x0Var.getClass();
        return y0Var.g(x0Var);
    }

    public static final boolean o(String str) {
        return b(x0.W1, str) || b(x0.X1, str) || b(x0.V1, str);
    }

    public static final boolean p(String str) {
        return b(x0.M1, str) || b(x0.K2, str);
    }

    public static final boolean q(String str) {
        return b(x0.f4356z2, str);
    }

    public static final boolean r(String str) {
        return b(x0.X, str);
    }

    public static final boolean s(String str) {
        return b(x0.T1, str) || b(x0.Q2, str);
    }

    public static final boolean t(String str) {
        return !TextUtils.isEmpty(str) && b(x0.f4293j1, str);
    }

    public static final boolean u(String str) {
        return !TextUtils.isEmpty(str) && b(x0.f4279e2, str);
    }

    public static final boolean v(String str) {
        return (!TextUtils.isEmpty(str) && b(x0.Y1, str)) || u(str);
    }

    public static final boolean w(String str) {
        return !TextUtils.isEmpty(str) && b(x0.f4290i1, str);
    }

    public static final boolean x(String str) {
        return b(x0.S0, str) || b(x0.T0, str);
    }

    public static final boolean y(String str) {
        return b(x0.D1, str) || b(x0.L2, str);
    }

    public static final boolean z(String str) {
        return !TextUtils.isEmpty(str) && b(x0.f4333t2, str);
    }
}
