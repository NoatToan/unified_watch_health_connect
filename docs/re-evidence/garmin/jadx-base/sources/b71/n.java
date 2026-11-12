package b71;

import android.content.Context;
import android.content.DialogInterface;
import c2.b0;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f2.t;
import f5.z0;
import h4.r;
import h5.e0;
import i3.h7;
import i3.i7;
import i3.mh;
import java.util.List;
import l72.f0;
import l72.h3;
import l72.j0;
import l72.p2;
import okhttp3.OkHttpClient;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import s5.x0;
import u1.a2;
import u1.w;
import ug2.q0;
import v62.n1;
import v62.o1;
import v62.x3;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f16363b;

    public /* synthetic */ n(e23.l lVar, int i14) {
        this.f16362a = 21;
        this.f16363b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:119:0x033d  */
    /* JADX WARN: Code duplicated, block: B:138:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:162:0x044f  */
    /* JADX WARN: Code duplicated, block: B:216:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:221:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:49:0x016f  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x0230  */
    /* JADX WARN: Code duplicated, block: B:91:0x028e  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f16362a;
        int i15 = 12;
        p3.m.a aVar = p3.m.f135153a;
        int i16 = 1;
        e23.l lVar = this.f16363b;
        switch (i14) {
            case 0:
                List list = (List) obj;
                int iIntValue = ((Integer) obj2).intValue();
                list.getClass();
                lVar.invoke(Boolean.valueOf(((j0) list.get(iIntValue)).f111076e));
                return Unit.INSTANCE;
            case 1:
                Scope scope = (Scope) obj;
                bz0.o oVar = bz0.o.f22274a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                OkHttpClient okHttpClient = (OkHttpClient) lVar.invoke(scope.get((k23.d<?>) s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                bz0.o.f22274a.getClass();
                if (bz0.o.h().i()) {
                    jd2.b.b(okHttpClient, jd2.a.HTTP_EVENTS);
                } else {
                    jd2.b.a(okHttpClient, jd2.a.HTTP_EVENTS);
                }
                return okHttpClient;
            case 2:
                lVar.invoke(new e50.a.a0(((Double) obj).doubleValue(), ((Double) obj2).doubleValue()));
                return Unit.INSTANCE;
            case 3:
                lVar.invoke(new e50.a.s(((Long) obj).longValue(), ((Long) obj2).longValue()));
                return Unit.INSTANCE;
            case 4:
                Integer num = (Integer) obj2;
                num.intValue();
                ((List) obj).getClass();
                if (lVar != null) {
                    lVar.invoke(num);
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    r.a aVar2 = r.S;
                    r rVarD = x2.d(aVar2, 1.0f);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = h4.k.c(rVarD, mVar);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, z0VarD, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar);
                    u uVar = u.f22885a;
                    r rVarB = a2.b(aVar2, a2.a(mVar), true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    r rVarC2 = h4.k.c(rVarB, mVar);
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar, zVarA, mVar);
                    b4.c(c1623g, i2VarX2, mVar);
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, mVar);
                    b0 b0Var = b0.f22601a;
                    String strQ = gl1.y.Q(mVar, R.string.msg_lifestyle_logging_terms_and_conditions);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar);
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    mh.c(strQ, c2.l.y(aVar2, eVar2.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 131068);
                    c2.l.f(b0Var.a(aVar2, 1.0f, true), mVar);
                    mVar.y();
                    r rVarY = c2.l.y(uVar.c(x2.f(aVar2, 1.0f), h4.d.a.f81531i), eVar2.f97920e);
                    z zVarA2 = y.a(kVar, h4.d.a.f81537o, mVar, 48);
                    int iHashCode3 = Long.hashCode(mVar.getU());
                    i2 i2VarX3 = mVar.x();
                    r rVarC3 = h4.k.c(rVarY, mVar);
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar, zVarA2, mVar);
                    b4.c(c1623g, i2VarX3, mVar);
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar, iHashCode3, bVar);
                    }
                    b4.c(fVar, rVarC3, mVar);
                    f0 f0Var = f0.f110999a;
                    String strQ2 = gl1.y.Q(mVar, R.string.lbl_i_accept);
                    g6.f.a aVar4 = g6.f.f75994b;
                    r rVarC4 = c2.l.C(x2.f(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, 12, 7);
                    boolean zB = mVar.B(lVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new e40.g(lVar, 20);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e40.g(lVar, 20);
                            mVar.K(objQ);
                        }
                    }
                    f0Var.d(384, 9, (e23.a) objQ, rVarC4, strQ2, mVar, null, false);
                    String strQ3 = gl1.y.Q(mVar, R.string.lbl_i_do_not_accept);
                    r rVarF = x2.f(aVar2, 1.0f);
                    boolean zB2 = mVar.B(lVar);
                    Object objQ2 = mVar.q();
                    if (zB2) {
                        objQ2 = new e40.g(lVar, 21);
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e40.g(lVar, 21);
                            mVar.K(objQ2);
                        }
                    }
                    f0Var.i(strQ3, rVarF, false, (e23.a) objQ2, mVar, 48, 4);
                    mVar.y();
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).intValue();
                ex.b bVar2 = f2.l.f68229d;
                return (f2.c) lVar.invoke((t) obj);
            case 7:
                String str = (String) obj;
                ((Boolean) obj2).booleanValue();
                str.getClass();
                lVar.invoke(str);
                return Unit.INSTANCE;
            case 8:
                List list2 = (List) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                list2.getClass();
                lVar.invoke(Boolean.valueOf(((j0) list2.get(iIntValue3)).f111076e));
                return Unit.INSTANCE;
            case 9:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    r.a aVar5 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarQ = x2.q(aVar5, j92.b.f97901d.f97904c);
                    boolean zB3 = mVar2.B(lVar);
                    Object objQ3 = mVar2.q();
                    if (zB3) {
                        objQ3 = new gt1.k(lVar, 9);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new gt1.k(lVar, 9);
                            mVar2.K(objQ3);
                        }
                    }
                    jt1.a.f100804a.getClass();
                    h7.a((e23.a) objQ3, rVarQ, false, null, null, jt1.a.f100805b, mVar2, 1572864, 60);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 10:
                l52.r rVar = (l52.r) obj;
                l52.i.a aVar6 = (l52.i.a) obj2;
                rVar.getClass();
                aVar6.getClass();
                if (((Boolean) lVar.invoke(aVar6)).booleanValue()) {
                    int i17 = o13.q.f128596b;
                    rVar.a(aVar6);
                }
                return Unit.INSTANCE;
            case 11:
                l52.r rVar2 = (l52.r) obj;
                l52.i.a aVar7 = (l52.i.a) obj2;
                rVar2.getClass();
                aVar7.getClass();
                if (((Boolean) lVar.invoke(aVar7)).booleanValue()) {
                    Boolean bool = Boolean.TRUE;
                    int i18 = o13.q.f128596b;
                    rVar2.a(bool);
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    t4.d dVarA = n5.c.a(R.drawable.close_x, mVar3, 0);
                    r.a aVar8 = r.S;
                    boolean zB4 = mVar3.B(lVar);
                    Object objQ4 = mVar3.q();
                    if (zB4) {
                        objQ4 = new me2.d(lVar, i16);
                        mVar3.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new me2.d(lVar, i16);
                            mVar3.K(objQ4);
                        }
                    }
                    i7.a(dVarA, null, w.d(aVar8, false, null, null, (e23.a) objQ4, 15), com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar3), mVar3, 48, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 13:
                lVar.invoke(obj);
                return Unit.INSTANCE;
            case 14:
                lVar.invoke(obj);
                return Unit.INSTANCE;
            case 15:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    boolean zB5 = mVar4.B(lVar);
                    Object objQ5 = mVar4.q();
                    if (zB5) {
                        objQ5 = new me2.d(lVar, 11);
                        mVar4.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new me2.d(lVar, 11);
                            mVar4.K(objQ5);
                        }
                    }
                    pk1.b.f138273a.getClass();
                    y02.a.a((e23.a) objQ5, null, pk1.b.f138274b, mVar4, 384);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = x3.a(t62.b.f162798a);
                    String strQ4 = gl1.y.Q(mVar5, R.string.no_gear_in_this_collection);
                    String strQ5 = gl1.y.Q(mVar5, R.string.add_gear_collection_to_track_for_example);
                    String strQ6 = gl1.y.Q(mVar5, R.string.lbl_gear_add);
                    boolean zB6 = mVar5.B(lVar);
                    Object objQ6 = mVar5.q();
                    if (zB6) {
                        objQ6 = new me2.d(lVar, i15);
                        mVar5.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new me2.d(lVar, i15);
                            mVar5.K(objQ6);
                        }
                    }
                    b82.n.d(dVarA2, strQ4, strQ5, null, strQ6, (e23.a) objQ6, null, null, mVar5, 0, 200);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    p2 p2Var = p2.f111205a;
                    String strQ7 = gl1.y.Q(mVar6, R.string.help_product_support);
                    boolean zB7 = mVar6.B(lVar);
                    Object objQ7 = mVar6.q();
                    if (zB7) {
                        objQ7 = new me2.d(lVar, 13);
                        mVar6.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new me2.d(lVar, 13);
                            mVar6.K(objQ7);
                        }
                    }
                    p2Var.g(strQ7, null, null, null, null, false, false, (e23.a) objQ7, mVar6, 0, 254);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA3 = o1.a(t62.b.f162798a);
                    long jA = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar7);
                    r.a aVar9 = r.S;
                    boolean zB8 = mVar7.B(lVar);
                    Object objQ8 = mVar7.q();
                    if (zB8) {
                        objQ8 = new sq1.e(lVar, 23);
                        mVar7.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new sq1.e(lVar, 23);
                            mVar7.K(objQ8);
                        }
                    }
                    i7.b(dVarA3, null, w.d(aVar9, false, null, null, (e23.a) objQ8, 15), jA, mVar7, 48, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 19:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA4 = o1.a(t62.b.f162798a);
                    long jA2 = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar8);
                    r.a aVar10 = r.S;
                    boolean zB9 = mVar8.B(lVar);
                    Object objQ9 = mVar8.q();
                    if (zB9) {
                        objQ9 = new sq1.e(lVar, 24);
                        mVar8.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new sq1.e(lVar, 24);
                            mVar8.K(objQ9);
                        }
                    }
                    i7.b(dVarA4, null, w.d(aVar10, false, null, null, (e23.a) objQ9, 15), jA2, mVar8, 48, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 20:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA5 = o1.a(t62.b.f162798a);
                    String strQ8 = gl1.y.Q(mVar9, R.string.live_activity);
                    boolean zB10 = mVar9.B(lVar);
                    Object objQ10 = mVar9.q();
                    if (zB10) {
                        objQ10 = new ub0.h(lVar, 6);
                        mVar9.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new ub0.h(lVar, 6);
                            mVar9.K(objQ10);
                        }
                    }
                    h3.e(dVarA5, strQ8, null, null, (e23.a) objQ10, null, null, mVar9, 0, 108);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                q0.f(lVar, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA6 = n1.a(t62.b.f162798a);
                    r.a aVar11 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarM = x2.m(aVar11, j92.b.f97901d.f97904c);
                    boolean zB11 = mVar10.B(lVar);
                    Object objQ11 = mVar10.q();
                    if (zB11) {
                        objQ11 = new ub0.h(lVar, 7);
                        mVar10.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new ub0.h(lVar, 7);
                            mVar10.K(objQ11);
                        }
                    }
                    i7.b(dVarA6, null, w.d(rVarM, false, null, null, (e23.a) objQ11, 15), sn.a.b(mVar10), mVar10, 48, 0);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 23:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                Logger logger = vc0.s.f177006e;
                dialogInterface.getClass();
                lVar.invoke(Boolean.TRUE);
                dialogInterface.cancel();
                return Unit.INSTANCE;
            case 24:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                Logger logger2 = vc0.s.f177006e;
                dialogInterface2.getClass();
                lVar.invoke(Boolean.TRUE);
                dialogInterface2.cancel();
                return Unit.INSTANCE;
            case 25:
                int iIntValue13 = ((Integer) obj2).intValue();
                ((List) obj).getClass();
                lVar.invoke(vt0.b.f180058l.get(iIntValue13));
                return Unit.INSTANCE;
            case 26:
                String str2 = (String) obj;
                ((Boolean) obj2).booleanValue();
                str2.getClass();
                lVar.invoke(str2);
                return Unit.INSTANCE;
            case 27:
                List list3 = (List) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                list3.getClass();
                lVar.invoke(((j0) list3.get(iIntValue14)).f111076e ? y31.a.OVERNIGHT_AVERAGES : null);
                return Unit.INSTANCE;
            default:
                List list4 = (List) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                list4.getClass();
                lVar.invoke(((j0) list4.get(iIntValue15)).f111076e ? y31.a.OVERNIGHT_AVERAGES : null);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n(e23.l lVar, int i14, byte b14) {
        this.f16362a = i14;
        this.f16363b = lVar;
    }
}
