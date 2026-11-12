package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class ul5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile ul5 f35899b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<Integer, kp5> f35900a = new HashMap<>();

    public static ul5 c() {
        if (f35899b == null) {
            synchronized (ul5.class) {
                try {
                    if (f35899b == null) {
                        f35899b = new ul5();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f35899b;
    }

    public kp5 a(int i) {
        kp5 kp5Var = this.f35900a.get(Integer.valueOf(i));
        if (kp5Var != null) {
            return kp5Var;
        }
        kp5 kp5VarB = b(i);
        this.f35900a.put(Integer.valueOf(i), kp5VarB);
        return kp5VarB;
    }

    public final kp5 b(int i) {
        if (i == 402) {
            return new kp5(i, c0j.na, pni.O, iji.b3);
        }
        if (i == 403) {
            return new kp5(i, c0j.b0, pni.H, iji.b3);
        }
        if (i == 10000) {
            return new kp5(i, c0j.x7, pni.f0, iji.H);
        }
        if (i == 30000) {
            return new kp5(i, c0j.Gc, pni.A, iji.D0);
        }
        switch (i) {
            case 2:
                return new kp5(i, c0j.g7, pni.M, iji.l);
            case 3:
                return new kp5(i, c0j.u7, pni.a0, iji.E);
            case 4:
                return new kp5(i, c0j.k7, pni.T, iji.R2);
            case 5:
                return new kp5(i, c0j.t7, pni.Y, iji.D);
            case 6:
                return new kp5(i, c0j.q7, pni.W, iji.A);
            case 7:
                return new kp5(i, c0j.v7, pni.b0, iji.F);
            case 8:
                return new kp5(i, c0j.i7, pni.P, iji.w);
            case 9:
                return new kp5(i, c0j.h7, pni.N, iji.v);
            case 10:
                return new kp5(i, c0j.n7, pni.S, iji.y);
            case 11:
                return new kp5(i, c0j.l7, 0, iji.G);
            case 12:
                return new kp5(i, c0j.w7, pni.e0, iji.G);
            case 13:
                return new kp5(i, c0j.r7, pni.U, iji.B);
            case 14:
                return new kp5(i, c0j.jm, pni.N, iji.v);
            case 15:
                return new kp5(i, c0j.tm, pni.R, iji.x);
            case 16:
                return new kp5(i, c0j.f7, pni.K, iji.d);
            case 17:
                return new kp5(i, c0j.j7, pni.Q, iji.J2);
            default:
                switch (i) {
                    case 19:
                        return new kp5(i, c0j.s7, pni.C3, iji.C);
                    case 20:
                        return new kp5(i, c0j.Zn, pni.I3, iji.r2);
                    case 21:
                        return new kp5(i, c0j.nn, pni.G3, iji.o2);
                    case 22:
                        return new kp5(i, c0j.o7, pni.u0, iji.z);
                    case 23:
                        return new kp5(i, c0j.yo, pni.c0, iji.y);
                    case 24:
                        return new kp5(i, c0j.mb, pni.I3, iji.r2);
                    case 25:
                        return new kp5(i, c0j.P4, pni.heart_health_icon, iji.D0);
                    case 26:
                        return new kp5(i, c0j.O4, pni.K, iji.D0);
                    default:
                        return new kp5(i, 0, 0, 0);
                }
        }
    }
}
