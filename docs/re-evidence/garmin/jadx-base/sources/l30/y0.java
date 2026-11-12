package l30;

import am.r1;
import android.content.Context;
import android.content.DialogInterface;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity;
import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity;
import com.garmin.feature.garminpay.ui.devicesettings.LostWatchActivity;
import i3.e5;
import i3.fe;
import i3.ve;
import i3.wd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.e3;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;
import u1.a2;
import u1.d2;
import v62.n8;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f109646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f109647c;

    public /* synthetic */ y0(int i14, Object obj, Object obj2) {
        this.f109645a = i14;
        this.f109646b = obj;
        this.f109647c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0338  */
    /* JADX WARN: Code duplicated, block: B:126:0x0413  */
    /* JADX WARN: Code duplicated, block: B:131:0x0443  */
    /* JADX WARN: Code duplicated, block: B:136:0x0475  */
    /* JADX WARN: Code duplicated, block: B:141:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:146:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:151:0x0509  */
    /* JADX WARN: Code duplicated, block: B:158:0x0543  */
    /* JADX WARN: Code duplicated, block: B:268:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:323:0x0a8c  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d3  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object value;
        int i14 = this.f109645a;
        int i15 = 7;
        int i16 = 14;
        int i17 = 11;
        int i18 = 6;
        p3.m.a aVar = p3.m.f135153a;
        int i19 = 0;
        int i24 = 0;
        int i25 = 1;
        Object obj4 = this.f109647c;
        Object obj5 = this.f109646b;
        switch (i14) {
            case 0:
                List list = (List) obj5;
                MultipleCoursesActivity multipleCoursesActivity = (MultipleCoursesActivity) obj4;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                ClimbDTO climbDTO = (ClimbDTO) p13.h0.e0(iIntValue, list);
                if (climbDTO != null) {
                    MultipleCoursesActivity.a aVar2 = MultipleCoursesActivity.f33000c;
                    a1 a1VarDa = multipleCoursesActivity.da();
                    a1VarDa.getClass();
                    a1VarDa.x4(new n30.j.o(climbDTO));
                }
                ClimbDTO climbDTO2 = (ClimbDTO) p13.h0.e0(iIntValue2, list);
                if (climbDTO2 != null) {
                    MultipleCoursesActivity.a aVar3 = MultipleCoursesActivity.f33000c;
                    a1 a1VarDa2 = multipleCoursesActivity.da();
                    a1VarDa2.getClass();
                    a1VarDa2.x4(new n30.j.f(climbDTO2));
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                l71.h.c((h4.r) obj5, (i71.x) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 2:
                e23.q qVar = (e23.q) obj5;
                e23.q qVar2 = (e23.q) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    h4.r rVarF = x2.f(aVar4, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.g gVar = c2.j.f22698h;
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(gVar, h4.d.a.f81534l, mVar, 54);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarF, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar5);
                    } else {
                        mVar.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, s2VarA, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar);
                    u2 u2Var = u2.f22900a;
                    h4.r rVarA = u2Var.a(aVar4, 1.0f, true);
                    h4.g gVar2 = h4.d.a.f81524b;
                    f5.z0 z0VarD = c2.q.d(gVar2, false);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    h4.r rVarC2 = h4.k.c(rVarA, mVar);
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar5);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar, z0VarD, mVar);
                    b4.c(c1623g, i2VarX2, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, mVar);
                    c2.u uVar = c2.u.f22885a;
                    qVar2.invoke(uVar, mVar, 6);
                    mVar.y();
                    if (qVar != null) {
                        mVar.C(-1409945948);
                        h4.r rVarA2 = u2Var.a(aVar4, 1.0f, true);
                        f5.z0 z0VarD2 = c2.q.d(gVar2, false);
                        int iHashCode3 = Long.hashCode(mVar.getU());
                        i2 i2VarX3 = mVar.x();
                        h4.r rVarC3 = h4.k.c(rVarA2, mVar);
                        if (mVar.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar5);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar, z0VarD2, mVar);
                        b4.c(c1623g, i2VarX3, mVar);
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar, iHashCode3, bVar);
                        }
                        b4.c(fVar, rVarC3, mVar);
                        qVar.invoke(uVar, mVar, 6);
                        mVar.y();
                        mVar.f();
                    } else {
                        mVar.C(-1409820057);
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 3:
                l72.j0 j0Var = (l72.j0) obj5;
                e23.l lVar = (e23.l) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarQ = x2.q(aVar6, j92.b.f97901d.f97904c);
                    l72.o0 o0Var = l72.o0.SMALL;
                    boolean zB = mVar2.B(j0Var) | mVar2.B(lVar);
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = new l72.l0(j0Var, lVar, 1);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new l72.l0(j0Var, lVar, 1);
                            mVar2.K(objQ);
                        }
                    }
                    l72.u0.a(rVarQ, o0Var, null, null, (e23.a) objQ, mVar2, 48, 12);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 4:
                wd wdVar = (wd) obj5;
                s5.x0 x0Var = (s5.x0) obj4;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar7 = h4.r.S;
                    e3.f110994a.getClass();
                    c2.t0.a(x2.f(x2.w(aVar7, 0.0f, e3.f110996c, 1), 1.0f), null, null, null, 0, 0, z3.f.c(-1667863846, new hv0.d(25, wdVar, x0Var), mVar3), mVar3, 1572870, 62);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 5:
                d2 d2Var = (d2) obj5;
                z3.e eVar2 = (z3.e) obj4;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    g6.f.a aVar8 = g6.f.f75994b;
                    h4.r rVarC4 = c2.l.C(a2.b(x2.d(h4.r.S, 1.0f), d2Var, true), 0.0f, 0.0f, 0.0f, 16, 7);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar4, 0);
                    int iHashCode4 = Long.hashCode(mVar4.getU());
                    i2 i2VarX4 = mVar4.x();
                    h4.r rVarC5 = h4.k.c(rVarC4, mVar4);
                    h5.g.V.getClass();
                    h5.e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar9);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar4);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar4, iHashCode4, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar4);
                    c2.b0 b0Var = c2.b0.f22601a;
                    eVar2.invoke(lh0.r.f112444a, mVar4, 6);
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                lh0.r rVar = lh0.r.f112444a;
                ((lh0.r) obj5).d((z3.e) obj4, (p3.m) obj, p3.p0.t(7));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                ll1.i.a((zd0.o.a) obj5, (e23.l) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 8:
                ll1.m mVar5 = (ll1.m) obj5;
                x3 x3Var = (x3) obj4;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    List list2 = (List) x3Var.getF182175a();
                    boolean zR = mVar6.r(mVar5);
                    Object objQ2 = mVar6.q();
                    if (zR) {
                        objQ2 = new kp2.a(mVar5, i17);
                        mVar6.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new kp2.a(mVar5, i17);
                            mVar6.K(objQ2);
                        }
                    }
                    ll1.i.b(list2, (e23.l) objQ2, mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                lm0.p.a((km0.e) obj5, (e23.l) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 10:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                DeviceSettingsActivity.a aVar10 = DeviceSettingsActivity.f51993w;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                hn2.c.ba((DeviceSettingsActivity) obj5, Boolean.TRUE, null, null, 14);
                ((i0) obj4).invoke();
                return Unit.INSTANCE;
            case 11:
                LostWatchActivity lostWatchActivity = (LostWatchActivity) obj5;
                vr2.q qVar3 = (vr2.q) obj4;
                ((Integer) obj2).intValue();
                LostWatchActivity.a aVar11 = LostWatchActivity.f52015j;
                ((DialogInterface) obj).getClass();
                lostWatchActivity.getClass();
                mr2.d dVar = lostWatchActivity.f52018h;
                if (dVar == null) {
                    p005kotlin.jvm.internal.s.m("lostWatchViewModel");
                    throw null;
                }
                Long lValueOf = Long.valueOf(dVar.getDeviceUnitId());
                mr2.d dVar2 = lostWatchActivity.f52018h;
                if (dVar2 != null) {
                    dVar.O3(qVar3, lValueOf, dVar2.getDeviceName());
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("lostWatchViewModel");
                throw null;
            case 12:
                e23.q qVar4 = (e23.q) obj5;
                fe feVar = (fe) obj4;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    qVar4.invoke(feVar, mVar7, 6);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                lv1.a.a((mv1.c) obj5, (e23.a) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ly0.g.a((ly0.o) obj5, (e23.a) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 15:
                n30.l lVar2 = (n30.l) obj5;
                e23.l lVar3 = (e23.l) obj4;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    Context context = (Context) mVar8.A(AndroidCompositionLocals_androidKt.f6042b);
                    Object objQ3 = mVar8.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = Boolean.valueOf(((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y());
                        mVar8.K(objQ3);
                    }
                    boolean zBooleanValue = ((Boolean) objQ3).booleanValue();
                    Object objQ4 = mVar8.q();
                    if (objQ4 == c2565a) {
                        objQ4 = Boolean.valueOf(r1.r());
                        mVar8.K(objQ4);
                    }
                    boolean zBooleanValue2 = ((Boolean) objQ4).booleanValue();
                    List<w20.a> listB = lVar2.b();
                    if (listB == null) {
                        mVar8.C(1836594306);
                        mVar8.f();
                    } else {
                        mVar8.C(1836594307);
                        int i26 = 0;
                        for (Object obj6 : listB) {
                            int i27 = i26 + 1;
                            if (i26 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            w20.a aVar12 = (w20.a) obj6;
                            s20.e eVar3 = s20.e.f156007a;
                            double dQ = aVar12.f181476a.q();
                            eVar3.getClass();
                            String strC = s20.e.c(dQ, context, zBooleanValue);
                            l3.a aVar13 = l3.f23124b;
                            double dR = aVar12.f181476a.r();
                            aVar13.getClass();
                            Context context2 = context;
                            String strC0 = l3.a.c0(context2, dR, zBooleanValue2, true, false);
                            boolean z14 = zBooleanValue2;
                            z3.e eVarC = z3.f.c(-759183643, new af1.l(aVar12, i26, i18), mVar8);
                            z3.e eVarC2 = z3.f.c(1470703590, new c40.i(strC, strC0, i15), mVar8);
                            h4.r rVarB = h4.r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            j92.e eVar4 = j92.b.f97899b;
                            h4.r rVarZ = c2.l.z(rVarB, eVar4.f97920e, eVar4.f97918c);
                            n30.k kVar2 = (n30.k) p13.h0.n0(lVar2.f123528d);
                            if (i26 == (kVar2 != null ? kVar2.f123523b : 0)) {
                                mVar8.C(778912721);
                                g6.f.a aVar14 = g6.f.f75994b;
                                rVarB = u1.q.b(1, d92.b.a(mVar8).j().e(), rVarB, k2.i.a(eVar4.f97918c));
                                mVar8.f();
                            } else {
                                mVar8.C(779103743);
                                mVar8.f();
                            }
                            h4.r rVarThen = rVarZ.then(rVarB);
                            boolean zB2 = mVar8.B(lVar3) | mVar8.k(i26);
                            Object objQ5 = mVar8.q();
                            if (zB2 || objQ5 == p3.m.a.f135155b) {
                                objQ5 = new au0.m(lVar3, i26, 15);
                                mVar8.K(objQ5);
                            }
                            l72.l.c(eVarC, eVarC2, rVarThen, null, false, (e23.a) objQ5, mVar8, 54, 24);
                            i26 = i27;
                            context = context2;
                            zBooleanValue2 = z14;
                            i15 = i15;
                            i18 = i18;
                        }
                        mVar8.f();
                    }
                    x1 x1Var8 = p3.n.f135158a;
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                m30.q.a((Double) obj5, (e23.l) obj4, (p3.m) obj, p3.p0.t(49));
                return Unit.INSTANCE;
            case 17:
                PreviewCatalogActivity previewCatalogActivity = (PreviewCatalogActivity) obj5;
                m72.i iVar = (m72.i) obj4;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i28 = PreviewCatalogActivity.f49781a;
                if (mVar9.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    Object objQ6 = mVar9.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ6 == c2565a2) {
                        obj3 = objQ6;
                        x72.o oVar = new x72.o(previewCatalogActivity);
                        mVar9.K(oVar);
                        obj3 = oVar;
                    }
                    obj3 = objQ6;
                    x72.o oVar2 = (x72.o) obj3;
                    Object[] objArr = new Object[0];
                    d4.l lVar4 = x72.p.f189487a;
                    boolean zR2 = mVar9.r(oVar2);
                    Object objQ7 = mVar9.q();
                    Object obj7 = objQ7;
                    if (zR2 || objQ7 == c2565a2) {
                        m72.l lVar5 = new m72.l(oVar2, 0);
                        mVar9.K(lVar5);
                        obj7 = lVar5;
                    }
                    p1 p1VarF = d4.a.f(objArr, lVar4, (e23.a) obj7, mVar9, 0);
                    x72.a.a((x72.e) p1VarF.getF182175a(), null, null, z3.f.c(-1009519315, new jj2.c(previewCatalogActivity, iVar, p1VarF, oVar2, 24), mVar9), mVar9, 3072);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 18:
                lc.m0 m0Var = (lc.m0) obj5;
                m72.i iVar2 = (m72.i) obj4;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i29 = PreviewCatalogActivity.f49781a;
                if (mVar10.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    h4.r.a aVar15 = h4.r.S;
                    h4.r rVarD = c2.l.D(a2.b(aVar15, a2.a(mVar10), true));
                    c2.j jVar = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar5 = j92.b.f97899b;
                    float f14 = eVar5.f97920e;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar3 = h4.d.a.f81533k;
                    jVar.getClass();
                    c2.z zVarA2 = c2.y.a(c2.j.k(f14, bVar3), h4.d.a.f81536n, mVar10, 0);
                    int iHashCode5 = Long.hashCode(mVar10.getU());
                    i2 i2VarX5 = mVar10.x();
                    h4.r rVarC6 = h4.k.c(rVarD, mVar10);
                    h5.g.V.getClass();
                    h5.e0.a aVar16 = h5.g.a.f81805b;
                    if (mVar10.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar16);
                    } else {
                        mVar10.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar10);
                    b4.c(h5.g.a.f81809f, i2VarX5, mVar10);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar10.getT() || !p005kotlin.jvm.internal.s.g(mVar10.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar10, iHashCode5, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC6, mVar10);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    c2.l.f(aVar15, mVar10);
                    h4.r rVarA3 = c2.l.A(aVar15, eVar5.f97920e, 0.0f, 2);
                    boolean zR3 = mVar10.r(m0Var);
                    Object objQ8 = mVar10.q();
                    if (zR3) {
                        objQ8 = new k62.j(m0Var, i17);
                        mVar10.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new k62.j(m0Var, i17);
                            mVar10.K(objQ8);
                        }
                    }
                    l72.l.d("Colors", "Role based color tokens.", null, rVarA3, null, false, (e23.a) objQ8, mVar10, 54, 52);
                    boolean zR4 = mVar10.r(m0Var);
                    Object objQ9 = mVar10.q();
                    if (zR4) {
                        objQ9 = new k62.j(m0Var, 12);
                        mVar10.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new k62.j(m0Var, 12);
                            mVar10.K(objQ9);
                        }
                    }
                    l72.l.d("Dimensions", "Dimensions for spacing, image, and radius tokens.", null, rVarA3, null, false, (e23.a) objQ9, mVar10, 54, 52);
                    boolean zR5 = mVar10.r(m0Var);
                    Object objQ10 = mVar10.q();
                    if (zR5) {
                        objQ10 = new k62.j(m0Var, 13);
                        mVar10.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new k62.j(m0Var, 13);
                            mVar10.K(objQ10);
                        }
                    }
                    l72.l.d("Typography", "Type tokens.", null, rVarA3, null, false, (e23.a) objQ10, mVar10, 54, 52);
                    boolean zR6 = mVar10.r(m0Var);
                    Object objQ11 = mVar10.q();
                    if (zR6) {
                        objQ11 = new k62.j(m0Var, i16);
                        mVar10.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new k62.j(m0Var, i16);
                            mVar10.K(objQ11);
                        }
                    }
                    l72.l.d("Iconography", "Symbols used for the User Interface, features, navigation, activity types avatars...", null, rVarA3, null, false, (e23.a) objQ11, mVar10, 54, 52);
                    boolean zR7 = mVar10.r(m0Var);
                    Object objQ12 = mVar10.q();
                    if (zR7) {
                        objQ12 = new k62.j(m0Var, 15);
                        mVar10.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new k62.j(m0Var, 15);
                            mVar10.K(objQ12);
                        }
                    }
                    l72.l.d("Components", "Reusable user interface components.", null, rVarA3, null, false, (e23.a) objQ12, mVar10, 54, 52);
                    boolean zR8 = mVar10.r(m0Var);
                    Object objQ13 = mVar10.q();
                    if (zR8) {
                        objQ13 = new k62.j(m0Var, 16);
                        mVar10.K(objQ13);
                    } else {
                        aVar.getClass();
                        if (objQ13 == p3.m.a.f135155b) {
                            objQ13 = new k62.j(m0Var, 16);
                            mVar10.K(objQ13);
                        }
                    }
                    l72.l.d("Patterns", "Reusable combinations of components.", null, rVarA3, null, false, (e23.a) objQ13, mVar10, 54, 52);
                    if (iVar2 != null) {
                        mVar10.C(-2077961403);
                        boolean zR9 = mVar10.r(m0Var);
                        Object objQ14 = mVar10.q();
                        if (zR9) {
                            objQ14 = new k62.j(m0Var, 17);
                            mVar10.K(objQ14);
                        } else {
                            aVar.getClass();
                            if (objQ14 == p3.m.a.f135155b) {
                                objQ14 = new k62.j(m0Var, 17);
                                mVar10.K(objQ14);
                            }
                        }
                        l72.l.d("GCM Components", "GCM specific components not part of GAK", null, rVarA3, null, false, (e23.a) objQ14, mVar10, 0, 52);
                        mVar10.f();
                    } else {
                        mVar10.C(-2077610638);
                        mVar10.f();
                    }
                    c2.l.f(aVar15, mVar10);
                    mVar10.y();
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 19:
                lc.h0 h0Var = (lc.h0) obj5;
                w72.a aVar17 = (w72.a) obj4;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int i30 = PreviewCatalogActivity.f49781a;
                if (mVar11.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    boolean zR10 = mVar11.r(aVar17);
                    Object objQ15 = mVar11.q();
                    if (zR10) {
                        objQ15 = new m72.n(aVar17, i19);
                        mVar11.K(objQ15);
                    } else {
                        aVar.getClass();
                        if (objQ15 == p3.m.a.f135155b) {
                            objQ15 = new m72.n(aVar17, i19);
                            mVar11.K(objQ15);
                        }
                    }
                    w72.d.a(h0Var, (e23.l) objQ15, mVar11, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 20:
                fe1.n nVar = (fe1.n) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                List list3 = (List) obj;
                ((Integer) obj2).getClass();
                list3.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj8 : arrayList) {
                    int i34 = i19 + 1;
                    if (i19 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    if (((l72.j0) list3.get(i19)).f111076e) {
                        arrayList2.add(obj8);
                    }
                    i19 = i34;
                }
                nVar.getClass();
                List<ge1.c> list4 = ((fe1.o) nVar.f70561e.f150540a.getValue()).f70582d;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj9 : list4) {
                    if (!arrayList.contains((ge1.c) obj9)) {
                        arrayList3.add(obj9);
                    }
                }
                ArrayList arrayList4 = new ArrayList(p13.h0.C0(arrayList3, arrayList2));
                p2 p2Var = nVar.f70560d;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, fe1.o.a((fe1.o) value, false, null, null, arrayList4, null, 23)));
                nVar.f70559c.b(arrayList4);
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                me1.i.a((be1.a) obj5, (h4.r) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 22:
                e23.q qVar5 = (e23.q) obj5;
                mg2.f fVar2 = (mg2.f) obj4;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    fVar2.getClass();
                    qVar5.invoke(fVar2, mVar12, 0);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 23:
                h4.r rVar2 = (h4.r) obj5;
                mg2.f fVar3 = (mg2.f) obj4;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar6 = j92.b.f97899b;
                    h4.r rVarY = c2.l.y(rVar2, eVar6.f97920e);
                    String strQ = gl1.y.Q(mVar13, R.string.lbl_close);
                    boolean zB3 = mVar13.B(fVar3);
                    Object objQ16 = mVar13.q();
                    if (zB3) {
                        objQ16 = new mg2.p(fVar3);
                        mVar13.K(objQ16);
                    } else {
                        aVar.getClass();
                        if (objQ16 == p3.m.a.f135155b) {
                            objQ16 = new mg2.p(fVar3);
                            mVar13.K(objQ16);
                        }
                    }
                    h4.r rVarD2 = u1.w.d(rVarY, false, strQ, null, (e23.a) ((k23.g) objQ16), 13);
                    k2.h hVarA = k2.i.a(eVar6.f97918c);
                    long jC = com.nimbusds.jose.shaded.gson.internal.a.c(mVar13);
                    long jA = zl.a.a(mVar13);
                    mg2.w.f118432a.getClass();
                    ve.a(rVarD2, hVarA, jC, jA, 0.0f, mg2.w.f118439h, null, z3.f.c(-182703247, new m92.f(fVar3, i25), mVar13), mVar13, 12779520, 80);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                mk1.f.a((hk1.p) obj5, (e23.l) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 25:
                String strH = (String) obj5;
                gk1.b bVar5 = (gk1.b) obj4;
                p3.m mVar14 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    String strK = ((zy0.l) KoinJavaComponent.get$default(zy0.l.class, null, null, 6, null)).k(ez0.c.GC_WEB_URL);
                    if (strH == null) {
                        strH = sn.a.h(mVar14, -1981534793, R.string.lbl_device, mVar14);
                    } else {
                        mVar14.C(-1981535227);
                        mVar14.f();
                    }
                    String strP = gl1.y.P(R.string.msg_record_activities_with_device_description_1, new Object[]{strH}, mVar14);
                    String strQ2 = gl1.y.Q(mVar14, R.string.msg_record_activities_with_device_description_2);
                    String strConcat = strK.concat("/images/feature/live-activity/genesis_screen.png");
                    s62.a.f157643a.getClass();
                    b82.y0.c(strConcat, n8.a(t62.b.f162798a), gl1.y.P(R.string.lbl_recording_activities_with_device_name, new Object[]{strH}, mVar14), e5.g(strP, "\n\n", strQ2), gl1.y.Q(mVar14, R.string.lbl_next), bVar5, z3.f.c(1646644497, new fv1.b(strH, 24), mVar14), mVar14, 1572864, 0);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 26:
                e23.l lVar6 = (e23.l) obj4;
                List list5 = (List) obj;
                ((Integer) obj2).getClass();
                list5.getClass();
                i53.c<pe0.b> cVar = ((mo.i) obj5).f119864c;
                ArrayList arrayList5 = new ArrayList();
                for (pe0.b bVar6 : cVar) {
                    int i35 = i24 + 1;
                    if (i24 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    if (((l72.j0) list5.get(i24)).f111076e) {
                        arrayList5.add(bVar6);
                    }
                    i24 = i35;
                }
                ArrayList arrayList6 = new ArrayList(p13.y.r(arrayList5, 10));
                Iterator it = arrayList5.iterator();
                while (it.hasNext()) {
                    arrayList6.add(Long.valueOf(((pe0.b) it.next()).f137402a));
                }
                lVar6.invoke(i53.a.l(arrayList6));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                mt0.p0.a((pt0.g) obj5, (e23.l) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                gl.b.e((lc.m0) obj5, (Long) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                mw0.j.e((List) obj5, (pv0.w) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ y0(Object obj, Object obj2, int i14, int i15) {
        this.f109645a = i15;
        this.f109646b = obj;
        this.f109647c = obj2;
    }
}
