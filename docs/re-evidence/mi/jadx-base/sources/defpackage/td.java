package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Ltd;", "", "Lqd;", "source", "", PluginDeviceInfo.FDESC, PluginDeviceInfo.FMODEL, "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class td {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final td f34581a = new td();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ArrayList<qd> f34582b;

    @NotNull
    public static final ArrayList<qd> c;

    static {
        qd qdVar = qd.p0;
        qd qdVar2 = qd.q0;
        qd qdVar3 = qd.o1;
        qd qdVar4 = qd.p1;
        qd qdVar5 = qd.l2;
        qd qdVar6 = qd.q1;
        qd qdVar7 = qd.k2;
        qd qdVar8 = qd.B2;
        qd qdVar9 = qd.C2;
        f34582b = CollectionsKt__CollectionsKt.arrayListOf(qdVar, qdVar2, qdVar3, qdVar4, qdVar5, qdVar6, qdVar7, qdVar8, qdVar9);
        c = CollectionsKt__CollectionsKt.arrayListOf(qd.s2, qd.t2, qd.O0, qd.h0, qd.j0, qd.m0, qd.Q1, qd.R1, qd.i0, qdVar, qdVar2, qd.t1, qd.u1, qd.v1, qd.w1, qd.k1, qd.B1, qd.l0, qd.n0, qd.A0, qd.f1, qd.K0, qd.B0, qd.L0, qd.C0, qd.D0, qd.I0, qd.Q0, qd.R0, qd.J0, qdVar3, qdVar4, qdVar5, qdVar6, qdVar7, qd.I2, qd.K2, qd.J2, qd.M2, qd.G2, qd.H2, qd.L2, qd.G1, qd.l1, qd.m1, qd.N2, qd.d1, qd.e1, qd.T1, qd.U1, qd.K1, qd.M1, qd.L1, qd.N1, qd.E1, qd.F1, qd.O2, qd.j1, qd.A1, qd.d3, qd.e3, qd.h1, qd.A2, qd.i1, qdVar8, qdVar9, qd.d0, qd.E0, qd.H0, qd.I1, qd.J1, qd.v0, qd.z0, qd.w0, qd.e0, qd.r1, qd.r0, qd.s0, qd.t0, qd.u0, qd.S0, qd.n1, qd.q2, qd.r2, qd.P0, qd.g0, qd.x1, qd.b2, qd.c2, qd.O1, qd.P1);
    }

    public final boolean a(@NotNull qd source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return c.contains(source);
    }

    public final boolean b(@NotNull qd source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return !f34582b.contains(source);
    }
}
