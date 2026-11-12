package cr;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c80.l0;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutPreCreateActivity;
import f62.q0;
import f62.u0;
import i3.k4;
import java.util.List;
import lc.m0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55286a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f55287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f55288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f55289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f55290e;

    public /* synthetic */ t(long j8, h4.r rVar, m0 m0Var, boolean z14, int i14) {
        this.f55288c = j8;
        this.f55289d = rVar;
        this.f55290e = m0Var;
        this.f55287b = z14;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:34:0x0100  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        c2.j.e eVar;
        int i14 = this.f55286a;
        boolean z14 = this.f55287b;
        long j8 = this.f55288c;
        boolean z15 = false;
        final int i15 = 1;
        Object obj3 = this.f55290e;
        Object obj4 = this.f55289d;
        switch (i14) {
            case 0:
                String str = (String) obj4;
                String str2 = (String) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    m92.y.b(o4.d0.a(j8), str, x.g(z14, mVar), null, str2, null, mVar, 0, 40);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                WorkoutPreCreateActivity workoutPreCreateActivity = (WorkoutPreCreateActivity) obj4;
                List list = (List) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                WorkoutPreCreateActivity.a aVar = WorkoutPreCreateActivity.f48888d;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-729307111, new q0(s9.c.c(((u0) workoutPreCreateActivity.f48889a.getValue()).f69347i, mVar2), (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b), workoutPreCreateActivity, list, this.f55287b, this.f55288c), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                vb1.i.c((h4.r) obj4, (l0.e.a) obj3, this.f55287b, this.f55288c, (p3.m) obj, p0.t(65));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                vx.c.d((h4.r) obj4, (k4) obj3, this.f55288c, this.f55287b, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                yx1.c.a(this.f55288c, (h4.r) obj4, (m0) obj3, this.f55287b, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                h4.r rVar = (h4.r) obj4;
                final z2.p pVar = (z2.p) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (j8 != 9205357640488583168L) {
                        mVar3.C(3458246);
                        if (z14) {
                            c2.j.a.f22700a.getClass();
                            eVar = c2.j.a.f22702c;
                        } else {
                            c2.j.a.f22700a.getClass();
                            eVar = c2.j.a.f22701b;
                        }
                        h4.r rVarO = x2.o(rVar, g6.h.c(j8), g6.h.b(j8), 0.0f, 0.0f, 12);
                        h4.d.f81522a.getClass();
                        s2 s2VarA = q2.a(eVar, h4.d.a.f81533k, mVar3, 0);
                        int iHashCode = Long.hashCode(mVar3.getU());
                        i2 i2VarX = mVar3.x();
                        h4.r rVarC = h4.k.c(rVarO, mVar3);
                        h5.g.V.getClass();
                        h5.e0.a aVar3 = h5.g.a.f81805b;
                        if (mVar3.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar3);
                        } else {
                            mVar3.c();
                        }
                        b4.c(h5.g.a.f81810g, s2VarA, mVar3);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                        b4.a(mVar3, Integer.valueOf(iHashCode), h5.g.a.f81813j);
                        b4.b(h5.g.a.f81814k, mVar3);
                        b4.c(h5.g.a.f81807d, rVarC, mVar3);
                        u2 u2Var = u2.f22900a;
                        h4.r.a aVar4 = h4.r.S;
                        boolean zR = mVar3.r(pVar);
                        Object objQ = mVar3.q();
                        if (zR) {
                            final int i16 = z15 ? 1 : 0;
                            objQ = new e23.a() { // from class: z2.b
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i16) {
                                        case 0:
                                            return Boolean.valueOf((pVar.a() & 9223372034707292159L) != 9205357640488583168L);
                                        default:
                                            return Boolean.valueOf((pVar.a() & 9223372034707292159L) != 9205357640488583168L);
                                    }
                                }
                            };
                            mVar3.K(objQ);
                        } else {
                            aVar2.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                final int i17 = z15 ? 1 : 0;
                                objQ = new e23.a() { // from class: z2.b
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i17) {
                                            case 0:
                                                return Boolean.valueOf((pVar.a() & 9223372034707292159L) != 9205357640488583168L);
                                            default:
                                                return Boolean.valueOf((pVar.a() & 9223372034707292159L) != 9205357640488583168L);
                                        }
                                    }
                                };
                                mVar3.K(objQ);
                            }
                        }
                        z2.c.c(6, (e23.a) objQ, aVar4, mVar3, z14);
                        mVar3.y();
                        mVar3.f();
                    } else {
                        mVar3.C(4389176);
                        boolean zR2 = mVar3.r(pVar);
                        Object objQ2 = mVar3.q();
                        if (zR2) {
                            objQ2 = new e23.a() { // from class: z2.b
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            return Boolean.valueOf((pVar.a() & 9223372034707292159L) != 9205357640488583168L);
                                        default:
                                            return Boolean.valueOf((pVar.a() & 9223372034707292159L) != 9205357640488583168L);
                                    }
                                }
                            };
                            mVar3.K(objQ2);
                        } else {
                            aVar2.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new e23.a() { // from class: z2.b
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i15) {
                                            case 0:
                                                return Boolean.valueOf((pVar.a() & 9223372034707292159L) != 9205357640488583168L);
                                            default:
                                                return Boolean.valueOf((pVar.a() & 9223372034707292159L) != 9205357640488583168L);
                                        }
                                    }
                                };
                                mVar3.K(objQ2);
                            }
                        }
                        z2.c.c(0, (e23.a) objQ2, rVar, mVar3, z14);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ t(long j8, String str, boolean z14, String str2) {
        this.f55288c = j8;
        this.f55289d = str;
        this.f55287b = z14;
        this.f55290e = str2;
    }

    public /* synthetic */ t(long j8, boolean z14, h4.r rVar, z2.p pVar) {
        this.f55288c = j8;
        this.f55287b = z14;
        this.f55289d = rVar;
        this.f55290e = pVar;
    }

    public /* synthetic */ t(WorkoutPreCreateActivity workoutPreCreateActivity, List list, boolean z14, long j8) {
        this.f55289d = workoutPreCreateActivity;
        this.f55290e = list;
        this.f55287b = z14;
        this.f55288c = j8;
    }

    public /* synthetic */ t(h4.r rVar, l0.e.a aVar, boolean z14, long j8, int i14) {
        this.f55289d = rVar;
        this.f55290e = aVar;
        this.f55287b = z14;
        this.f55288c = j8;
    }

    public /* synthetic */ t(h4.r rVar, k4 k4Var, long j8, boolean z14, int i14) {
        this.f55289d = rVar;
        this.f55290e = k4Var;
        this.f55288c = j8;
        this.f55287b = z14;
    }
}
