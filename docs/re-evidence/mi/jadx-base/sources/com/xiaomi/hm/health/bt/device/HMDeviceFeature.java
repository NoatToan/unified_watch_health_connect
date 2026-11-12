package com.xiaomi.hm.health.bt.device;

import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import defpackage.fb;
import defpackage.g4s;
import defpackage.op;
import defpackage.qd;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class HMDeviceFeature {
    private static qd[] ALARM_SYNC_SOURCE_S;
    private static final qd[] BASE_RESOURCE_S;
    public static List<qd> MULTI_ACTIVITY_GOAL_DEVICE;
    private static final qd[] NO_RESUME_DFU_S;
    public static List<qd> SET_LANGUAGE_S;
    public static List<qd> TIMEX_DEVICE;

    static {
        qd qdVar = qd.P2;
        qd qdVar2 = qd.Q2;
        qd qdVar3 = qd.R2;
        qd qdVar4 = qd.V2;
        TIMEX_DEVICE = Arrays.asList(qdVar, qdVar2, qdVar3, qdVar4);
        qd qdVar5 = qd.O0;
        qd qdVar6 = qd.S2;
        qd qdVar7 = qd.T2;
        qd qdVar8 = qd.U2;
        MULTI_ACTIVITY_GOAL_DEVICE = Arrays.asList(qdVar, qdVar2, qdVar3, qdVar5, qdVar6, qdVar7, qdVar8, qdVar4);
        SET_LANGUAGE_S = Arrays.asList(qdVar, qdVar2, qdVar3, qdVar5, qdVar6, qdVar7, qdVar8, qdVar4);
        qd qdVar9 = qd.d0;
        qd qdVar10 = qd.e0;
        qd qdVar11 = qd.h0;
        qd qdVar12 = qd.j0;
        qd qdVar13 = qd.m0;
        qd qdVar14 = qd.l0;
        qd qdVar15 = qd.n0;
        qd qdVar16 = qd.p0;
        qd qdVar17 = qd.q0;
        qd qdVar18 = qd.r0;
        qd qdVar19 = qd.s0;
        qd qdVar20 = qd.t0;
        qd qdVar21 = qd.u0;
        qd qdVar22 = qd.E0;
        qd qdVar23 = qd.H0;
        ALARM_SYNC_SOURCE_S = new qd[]{qdVar9, qdVar10, qdVar11, qdVar12, qdVar13, qdVar14, qdVar15, qdVar16, qdVar17, qdVar18, qdVar19, qdVar20, qdVar21, qdVar22, qdVar23, qd.s1, qd.o1, qd.p1, qd.k2, qd.q1, qd.l2};
        NO_RESUME_DFU_S = new qd[]{qd.w, qd.x, qd.y, qd.X, qd.z, qd.B, qd.A, qd.C, qdVar11, qdVar12, qdVar13, qd.Z, qd.f0, qd.Y, qd.i0, qd.g0, qd.F, qd.G, qd.H, qd.I, qd.J, qd.a0, qd.b0, qd.c0, qdVar9, qdVar10, qd.w0, qd.W2, qdVar22, qdVar23, qdVar, qdVar2, qdVar3, qd.S, qd.W, qd.T, qd.V, qd.U, qd.k0};
        BASE_RESOURCE_S = new qd[]{qd.v0, qd.z0, qd.A0, qd.f1, qd.B0, qd.C0, qd.D0, qd.F0, qd.G0, qd.M0, qd.N0, qd.K0, qd.L0, qd.I0, qd.J0, qd.Q0, qd.R0, qd.P0, qd.S0, qd.n1, qdVar6, qdVar7, qdVar8, qd.h1, qd.i1, qd.A2, qd.k1, qd.B1, qd.l1, qd.m1, qd.N2, qd.O2, qd.j1, qd.A1, qd.G1, qd.H1, qd.E1, qd.F1, qd.I1, qd.J1, qd.O1, qd.P1, qd.Q1, qd.R1, qd.m2, qd.n2, qd.d1, qd.o2, qd.p2, qd.e1, qd.q2, qd.r2, qd.s2, qd.t2};
    }

    public static boolean hasFeatureAlarmSync(qd qdVar) {
        for (qd qdVar2 : ALARM_SYNC_SOURCE_S) {
            if (qdVar == qdVar2) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasFeatureBaseResource(qd qdVar) {
        for (qd qdVar2 : BASE_RESOURCE_S) {
            if (qdVar == qdVar2) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasFeatureCollectData(g4s g4sVar) {
        if (g4sVar == null) {
            return false;
        }
        qd qdVarI = g4sVar.I();
        if (qdVarI == qd.c0) {
            return ProfileUtils.compareVersion(g4sVar.e0(), "V2.0.2.78") >= 0;
        }
        return qdVarI != qd.k0 || ProfileUtils.compareVersion(g4sVar.e0(), "V2.0.3.28") >= 0;
    }

    public static boolean hasFeatureGPS(qd qdVar) {
        return op.a().a(qdVar);
    }

    public static boolean hasFeatureJHS(qd qdVar) {
        return qdVar == qd.x0 || qdVar == qd.g1 || qdVar == qd.W0 || qdVar == qd.V0 || qdVar == qd.U0 || qdVar == qd.T0 || qdVar == qd.Y0 || qdVar == qd.a1 || qdVar == qd.Z0 || qdVar == qd.X0 || qdVar == qd.D1 || qdVar == qd.c1 || qdVar == qd.b1;
    }

    private static boolean hasFeatureNoResumeDfu(qd qdVar) {
        for (qd qdVar2 : NO_RESUME_DFU_S) {
            if (qdVar == qdVar2) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasFeatureOldCollectData(g4s g4sVar) {
        if (g4sVar == null) {
            return false;
        }
        qd qdVarI = g4sVar.I();
        if (qdVarI == qd.x0 || qdVarI == qd.g1) {
            return ProfileUtils.compareVersion(g4sVar.e0(), "V1.0.7.86") < 0;
        }
        return hasFeatureJHS(qdVarI);
    }

    private static boolean hasFeatureResumeDfu(qd qdVar) {
        return !hasFeatureNoResumeDfu(qdVar);
    }

    public static boolean hasQinLingFuture(qd qdVar) {
        return qdVar == qd.c0 || qdVar == qd.k0 || qdVar == qd.y0;
    }

    public static boolean hasFeatureResumeDfu(g4s g4sVar) {
        fb fbVar = fb.f17619a;
        return fbVar.a(g4sVar.I()) ? fbVar.a(g4sVar) : hasFeatureResumeDfu(g4sVar.I());
    }
}
