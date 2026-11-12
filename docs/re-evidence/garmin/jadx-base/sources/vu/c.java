package vu;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import v.h;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.badges.redesign.filter.b f180216b;

    public /* synthetic */ c(com.garmin.android.apps.connectmobile.badges.redesign.filter.b bVar, int i14) {
        this.f180215a = i14;
        this.f180216b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:53:0x015e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0176  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String string;
        String string2;
        int i14 = this.f180215a;
        final com.garmin.android.apps.connectmobile.badges.redesign.filter.b bVar = this.f180216b;
        boolean z14 = false;
        final int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.badges.redesign.filter.b.C0483b c0483b = com.garmin.android.apps.connectmobile.badges.redesign.filter.b.f30476e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-134863065, new c(bVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.badges.redesign.filter.b.C0483b c0483b2 = com.garmin.android.apps.connectmobile.badges.redesign.filter.b.f30476e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar = r.S;
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = k.c(aVar, mVar2);
                    g.V.getClass();
                    e0.a aVar2 = g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar2);
                    } else {
                        mVar2.c();
                    }
                    b4.c(g.a.f81810g, zVarA, mVar2);
                    b4.c(g.a.f81809f, i2VarX, mVar2);
                    g.a.b bVar2 = g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    String strQ = gl1.y.Q(mVar2, R.string.common_difficulty);
                    Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                    com.garmin.android.apps.connectmobile.badges.service.model.d[] dVarArr = bVar.v6().f180212a;
                    int i16 = f.f180219a;
                    context.getClass();
                    if (dVarArr == null || dVarArr.length <= 0 || dVarArr.length >= f.a.f180220a.getF134973e()) {
                        string = context.getString(R.string.common_all);
                        string.getClass();
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        for (com.garmin.android.apps.connectmobile.badges.service.model.d dVar : dVarArr) {
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(f.a(context, dVar));
                        }
                        string = sb3.toString();
                    }
                    boolean zR = mVar2.r(bVar);
                    Object objQ = mVar2.q();
                    m.a aVar3 = m.f135153a;
                    if (zR) {
                        final int i17 = z14 ? 1 : 0;
                        objQ = new e23.a() { // from class: vu.d
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.badges.redesign.filter.b.a aVar4 = bVar.f30477d;
                                        if (aVar4 != null) {
                                            aVar4.z3();
                                        }
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.badges.redesign.filter.b.a aVar5 = bVar.f30477d;
                                        if (aVar5 != null) {
                                            aVar5.q1();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == m.a.f135155b) {
                            final int i18 = z14 ? 1 : 0;
                            objQ = new e23.a() { // from class: vu.d
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.badges.redesign.filter.b.a aVar4 = bVar.f30477d;
                                            if (aVar4 != null) {
                                                aVar4.z3();
                                            }
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.badges.redesign.filter.b.a aVar5 = bVar.f30477d;
                                            if (aVar5 != null) {
                                                aVar5.q1();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    d10.d.u6(strQ, string, (e23.a) objQ, mVar2);
                    String strQ2 = gl1.y.Q(mVar2, R.string.badges_type);
                    Context context2 = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                    com.garmin.android.apps.connectmobile.badges.service.model.b[] bVarArr = bVar.v6().f180213b;
                    context2.getClass();
                    if (bVarArr == null || bVarArr.length <= 0) {
                        string2 = context2.getString(R.string.common_all);
                        string2.getClass();
                    } else {
                        int length = bVarArr.length;
                        com.garmin.android.apps.connectmobile.badges.service.model.b.f30552d.getClass();
                        if (length < com.garmin.android.apps.connectmobile.badges.service.model.b.a.a().length) {
                            StringBuilder sb4 = new StringBuilder();
                            for (com.garmin.android.apps.connectmobile.badges.service.model.b bVar3 : bVarArr) {
                                if (sb4.length() > 0) {
                                    sb4.append(", ");
                                }
                                bVar3.getClass();
                                String string3 = context2.getString(bVar3.f30557b);
                                string3.getClass();
                                sb4.append(string3);
                            }
                            string2 = sb4.toString();
                        } else {
                            string2 = context2.getString(R.string.common_all);
                            string2.getClass();
                        }
                    }
                    boolean zR2 = mVar2.r(bVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: vu.d
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.badges.redesign.filter.b.a aVar4 = bVar.f30477d;
                                        if (aVar4 != null) {
                                            aVar4.z3();
                                        }
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.badges.redesign.filter.b.a aVar5 = bVar.f30477d;
                                        if (aVar5 != null) {
                                            aVar5.q1();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: vu.d
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.badges.redesign.filter.b.a aVar4 = bVar.f30477d;
                                            if (aVar4 != null) {
                                                aVar4.z3();
                                            }
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.badges.redesign.filter.b.a aVar5 = bVar.f30477d;
                                            if (aVar5 != null) {
                                                aVar5.q1();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    d10.d.u6(strQ2, string2, (e23.a) objQ2, mVar2);
                    mVar2.y();
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
