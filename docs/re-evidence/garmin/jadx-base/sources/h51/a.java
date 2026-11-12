package h51;

import am.x0;
import android.content.DialogInterface;
import bd0.c0;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import c83.h;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.device.pairing.impl.gdi.reconnection.AbstractDeviceConnectionWorker;
import e23.p;
import f12.l;
import h4.r;
import h5.e0;
import h5.g;
import h62.k;
import ho.q;
import i3.ve;
import i71.s;
import i71.v;
import java.util.List;
import java.util.Map;
import l71.j;
import o4.m1;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import p13.u0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import r53.i;
import u1.y0;
import y92.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82075a;

    public /* synthetic */ a(AbstractDeviceConnectionWorker abstractDeviceConnectionWorker) {
        this.f82075a = 21;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f82075a;
        int i15 = 26;
        m.a aVar = m.f135153a;
        int i16 = 22;
        int i17 = 8;
        int i18 = 5;
        int i19 = 4;
        int i24 = 3;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                b bVar = b.f82076a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    y0.a(n5.c.a(2131231916, mVar, 0), null, null, null, null, 0.0f, null, mVar, 48, 124);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                b bVar2 = b.f82076a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    t4.d dVarA = n5.c.a(R.drawable.ic_art_pacepro, mVar2, 0);
                    r.a aVar2 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    y0.a(dVarA, null, x2.q(aVar2, j92.b.f97901d.f97908g), null, null, 0.0f, null, mVar2, 48, 120);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                k.f((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                k.d((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                Scope scope = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                h71.a aVar3 = h71.a.f82332a;
                scope.getClass();
                parametersHolder.getClass();
                t0 t0Var = s0.f105811a;
                i iVar = (i) parametersHolder.elementAt(0, t0Var.b(i.class));
                i71.a aVar4 = new i71.a(new i71.c());
                i71.p pVar = new i71.p(new i71.d());
                l.f68084a.getClass();
                return new m71.a(new i71.l(iVar, aVar4, pVar, l.a.a(), new fj1.b((fj1.a) scope.get((k23.d<?>) t0Var.b(fj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope.get((k23.d<?>) t0Var.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null))));
            case 5:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                h71.a aVar5 = h71.a.f82332a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new l71.b((m71.a) parametersHolder2.elementAt(0, s0.f105811a.b(m71.a.class)));
            case 6:
                h71.a aVar6 = h71.a.f82332a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (dw.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, dw.a.class, new h.a[0], null, null, null, 120);
            case 7:
                Scope scope2 = (Scope) obj;
                h71.a aVar7 = h71.a.f82332a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                return new iw.e((dw.a) scope2.get((k23.d<?>) s0.f105811a.b(dw.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 8:
                h71.a aVar8 = h71.a.f82332a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new s();
            case 9:
                Scope scope3 = (Scope) obj;
                h71.a aVar9 = h71.a.f82332a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                return new v((iw.e) scope3.get((k23.d<?>) s0.f105811a.b(iw.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 10:
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                h71.a aVar10 = h71.a.f82332a;
                ((Scope) obj).getClass();
                parametersHolder3.getClass();
                i iVar2 = (i) parametersHolder3.elementAt(0, s0.f105811a.b(i.class));
                i71.a aVar11 = new i71.a(new i71.c());
                i71.p pVar2 = new i71.p(new i71.d());
                l.f68084a.getClass();
                return new m71.b(new i71.n(iVar2, aVar11, pVar2, l.a.a()));
            case 11:
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                h71.a aVar12 = h71.a.f82332a;
                ((Scope) obj).getClass();
                parametersHolder4.getClass();
                return new j((m71.b) parametersHolder4.elementAt(0, s0.f105811a.b(m71.b.class)));
            case 12:
                ((Integer) obj2).getClass();
                g8.i.k((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                g8.i.j((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ha0.c cVar = ha0.c.f82622a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    Object objQ = mVar3.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new ha0.b(6);
                        mVar3.K(objQ);
                    }
                    zf2.d dVar = zf2.d.Q1;
                    ha0.d.b bVar3 = new ha0.d.b((e23.l) objQ, dVar, true);
                    Object objQ2 = mVar3.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new h02.a(27);
                        mVar3.K(objQ2);
                    }
                    zf2.d dVar2 = zf2.d.f204589e2;
                    List listK = x.k(bVar3, new ha0.d.b((e23.l) objQ2, dVar2, true));
                    j0 j0Var = j0.f134944a;
                    Object objQ3 = mVar3.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new h02.a(28);
                        mVar3.K(objQ3);
                    }
                    ha0.d.a aVar13 = new ha0.d.a((e23.l) objQ3);
                    Object objQ4 = mVar3.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new h02.a(29);
                        mVar3.K(objQ4);
                    }
                    ha0.d.b bVar4 = new ha0.d.b((e23.l) objQ4, dVar, true);
                    Object objQ5 = mVar3.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new ha0.b(false ? 1 : 0);
                        mVar3.K(objQ5);
                    }
                    ha0.d.b bVar5 = new ha0.d.b((e23.l) objQ5, zf2.d.f204603m, false);
                    Object objQ6 = mVar3.q();
                    if (objQ6 == c2565a) {
                        objQ6 = new ha0.b(1);
                        mVar3.K(objQ6);
                    }
                    ha0.d.b bVar6 = new ha0.d.b((e23.l) objQ6, zf2.d.N0, false);
                    Object objQ7 = mVar3.q();
                    if (objQ7 == c2565a) {
                        objQ7 = new ha0.b(2);
                        mVar3.K(objQ7);
                    }
                    zf2.d dVar3 = zf2.d.f204627z;
                    ha0.d.b bVar7 = new ha0.d.b((e23.l) objQ7, dVar3, false);
                    Object objQ8 = mVar3.q();
                    if (objQ8 == c2565a) {
                        objQ8 = new ha0.b(i24);
                        mVar3.K(objQ8);
                    }
                    ha0.d.b bVar8 = new ha0.d.b((e23.l) objQ8, zf2.d.O0, false);
                    Object objQ9 = mVar3.q();
                    if (objQ9 == c2565a) {
                        objQ9 = new ha0.b(i19);
                        mVar3.K(objQ9);
                    }
                    ha0.d.b bVar9 = new ha0.d.b((e23.l) objQ9, zf2.d.N1, false);
                    Object objQ10 = mVar3.q();
                    if (objQ10 == c2565a) {
                        objQ10 = new ha0.b(i18);
                        mVar3.K(objQ10);
                    }
                    o13.p pVar3 = new o13.p(aVar13, x.k(bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, new ha0.d.b((e23.l) objQ10, dVar2, true)));
                    Object objQ11 = mVar3.q();
                    if (objQ11 == c2565a) {
                        objQ11 = new ha0.b(7);
                        mVar3.K(objQ11);
                    }
                    ha0.d.a aVar14 = new ha0.d.a((e23.l) objQ11);
                    Object objQ12 = mVar3.q();
                    if (objQ12 == c2565a) {
                        objQ12 = new ha0.b(8);
                        mVar3.K(objQ12);
                    }
                    ha0.d.b bVar10 = new ha0.d.b((e23.l) objQ12, dVar3, false);
                    Object objQ13 = mVar3.q();
                    if (objQ13 == c2565a) {
                        objQ13 = new ha0.b(9);
                        mVar3.K(objQ13);
                    }
                    ha0.d.b bVar11 = new ha0.d.b((e23.l) objQ13, zf2.d.D, false);
                    Object objQ14 = mVar3.q();
                    if (objQ14 == c2565a) {
                        objQ14 = new h02.a(24);
                        mVar3.K(objQ14);
                    }
                    Map mapE = u0.e(pVar3, new o13.p(aVar14, x.k(bVar10, bVar11, new ha0.d.b((e23.l) objQ14, zf2.d.I, false))));
                    Object objQ15 = mVar3.q();
                    if (objQ15 == c2565a) {
                        objQ15 = new h02.a(25);
                        mVar3.K(objQ15);
                    }
                    e23.l lVar = (e23.l) objQ15;
                    Object objQ16 = mVar3.q();
                    if (objQ16 == c2565a) {
                        objQ16 = new h02.a(26);
                        mVar3.K(objQ16);
                    }
                    e23.l lVar2 = (e23.l) objQ16;
                    Object objQ17 = mVar3.q();
                    if (objQ17 == c2565a) {
                        objQ17 = new ha0.a(0);
                        mVar3.K(objQ17);
                    }
                    e23.a aVar15 = (e23.a) objQ17;
                    Object objQ18 = mVar3.q();
                    if (objQ18 == c2565a) {
                        objQ18 = new ha0.a(1);
                        mVar3.K(objQ18);
                    }
                    ha0.f.e(listK, j0Var, mapE, 10, false, lVar, lVar2, aVar15, (e23.a) objQ18, mVar3, 115043376);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 15:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ha0.c cVar2 = ha0.c.f82622a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    ve.a(x2.d(r.S, 1.0f), null, tn.k.a(d92.b.f58623a, mVar4), 0L, 0.0f, 0.0f, null, ha0.c.f82627f, mVar4, 12582918, 122);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 16:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.C0766a c0766a = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.f40578o;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 17:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.C0766a c0766a2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.f40578o;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                return Unit.INSTANCE;
            case 18:
                DialogInterface dialogInterface3 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.C0766a c0766a3 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.f40578o;
                dialogInterface3.getClass();
                dialogInterface3.dismiss();
                return Unit.INSTANCE;
            case 19:
                DialogInterface dialogInterface4 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.C0766a c0766a4 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.f40578o;
                dialogInterface4.getClass();
                dialogInterface4.dismiss();
                return Unit.INSTANCE;
            case 20:
                w wVar = (w) obj;
                rs2.c cVar3 = (rs2.c) obj2;
                int i25 = hk0.f.f84062g;
                wVar.getClass();
                cVar3.getClass();
                ((s80.c) KoinJavaComponent.get$default(s80.c.class, null, null, 6, null)).h(wVar, cVar3);
                return Unit.INSTANCE;
            case 21:
                DeviceProfile deviceProfile = (DeviceProfile) obj;
                nm2.a aVar16 = (nm2.a) obj2;
                Logger logger = hm2.d.f84501a;
                deviceProfile.getClass();
                aVar16.getClass();
                yl2.b bVar12 = (yl2.b) yl2.b.B6.get(String.valueOf(deviceProfile.getF92744h()));
                if (bVar12 == null) {
                    mm2.d cVar4 = deviceProfile.getConnectionType() != 2 ? new mm2.c() : new qm2.h();
                    cVar4.a(((c0) lm2.h.d()).b(String.valueOf(deviceProfile.getF92744h())), aVar16);
                    return cVar4;
                }
                try {
                    String str = bVar12.f197835d;
                    str.getClass();
                    Object objNewInstance = Class.forName(str).newInstance();
                    objNewInstance.getClass();
                    mm2.d dVar4 = (mm2.d) objNewInstance;
                    qm2.l lVar3 = bVar12.f197833b;
                    lVar3.getClass();
                    dVar4.a(lVar3, aVar16);
                    return dVar4;
                } catch (Exception e4) {
                    hm2.d.f84501a.error("Failed to createStrategy for " + bVar12, (Throwable) e4);
                    return null;
                }
            case 22:
                ((Integer) obj).intValue();
                q qVar = q.f84665a;
                ((ho.b) obj2).getClass();
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj).intValue();
                q qVar2 = q.f84665a;
                ((eo.b) obj2).getClass();
                return Unit.INSTANCE;
            case 24:
                int i26 = 9;
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                q qVar3 = q.f84665a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    x0 x0Var = x0.f4308n;
                    ho.b.C1677b c1677b = new ho.b.C1677b(x0Var, x0Var);
                    x0 x0Var2 = x0.f4312o;
                    i53.f fVarA = i53.a.a(new jo.c.a.C1916a(x.k(c1677b, new ho.b.C1677b(x0Var2, x0Var2)), true), new jo.c.a.b(new eo.d(10, 7, 2026), new eo.d(22, 7, 2026)), new jo.c.a.C1917c(5, 20, true, null, null, 24, null), new jo.c.a.e(30, 120, null, null, 12, null), new jo.c.a.f(100, 500, true, null, null, 24, null), new jo.c.a.d(eo.b.a.f64758d), new jo.c.AbstractC1918c.a(Boolean.TRUE), new jo.c.AbstractC1918c.b(Boolean.FALSE));
                    r rVarE = u1.n.e(x2.f(r.S, 1.0f), tn.k.a(d92.b.f58623a, mVar5), m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar5, 0);
                    int iHashCode = Long.hashCode(mVar5.getU());
                    i2 i2VarX = mVar5.x();
                    r rVarC = h4.k.c(rVarE, mVar5);
                    g.V.getClass();
                    e0.a aVar17 = g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar17);
                    } else {
                        mVar5.c();
                    }
                    b4.c(g.a.f81810g, zVarA, mVar5);
                    b4.c(g.a.f81809f, i2VarX, mVar5);
                    g.a.b bVar13 = g.a.f81813j;
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar13);
                    }
                    b4.c(g.a.f81807d, rVarC, mVar5);
                    b0 b0Var = b0.f22601a;
                    ho.y yVar = new ho.y(fVarA, true, true, null, null, false, null, 120, null);
                    Object objQ19 = mVar5.q();
                    aVar.getClass();
                    m.a.C2565a c2565a2 = m.a.f135155b;
                    if (objQ19 == c2565a2) {
                        objQ19 = new ha0.a(17);
                        mVar5.K(objQ19);
                    }
                    e23.a aVar18 = (e23.a) objQ19;
                    Object objQ20 = mVar5.q();
                    if (objQ20 == c2565a2) {
                        objQ20 = new h81.a(i26);
                        mVar5.K(objQ20);
                    }
                    e23.q qVar4 = (e23.q) objQ20;
                    Object objQ21 = mVar5.q();
                    if (objQ21 == c2565a2) {
                        objQ21 = new a(i16);
                        mVar5.K(objQ21);
                    }
                    p pVar4 = (p) objQ21;
                    Object objQ22 = mVar5.q();
                    if (objQ22 == c2565a2) {
                        objQ22 = new a(23);
                        mVar5.K(objQ22);
                    }
                    p pVar5 = (p) objQ22;
                    Object objQ23 = mVar5.q();
                    if (objQ23 == c2565a2) {
                        objQ23 = new ha0.b(25);
                        mVar5.K(objQ23);
                    }
                    ho.w.e(yVar, aVar18, qVar4, pVar4, pVar5, (e23.l) objQ23, mVar5, 224688);
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 25:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                q qVar5 = q.f84665a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    x0 x0Var3 = x0.f4308n;
                    ho.b.C1677b c1677b2 = new ho.b.C1677b(x0Var3, x0Var3);
                    x0 x0Var4 = x0.f4312o;
                    jo.c.a.C1916a c1916a = new jo.c.a.C1916a(x.k(c1677b2, new ho.b.C1677b(x0Var4, x0Var4)), true);
                    jo.c.a.b bVar14 = new jo.c.a.b(new eo.d(10, 7, 2026), new eo.d(22, 7, 2026));
                    jo.c.a.C1917c c1917c = new jo.c.a.C1917c(5, 20, true, null, null, 24, null);
                    jo.c.a.e eVar = new jo.c.a.e(30, 120, null, null, 12, null);
                    jo.c.a.f fVar = new jo.c.a.f(100, 500, true, null, null, 24, null);
                    jo.c.a.d dVar5 = new jo.c.a.d(eo.b.a.f64758d);
                    Boolean bool = Boolean.TRUE;
                    jo.c.AbstractC1918c.a aVar19 = new jo.c.AbstractC1918c.a(bool);
                    Boolean bool2 = Boolean.FALSE;
                    i53.f fVarA2 = i53.a.a(c1916a, bVar14, c1917c, eVar, fVar, dVar5, aVar19, new jo.c.AbstractC1918c.b(bool2), new jo.c.AbstractC1918c.a(bool), new jo.c.AbstractC1918c.b(bool2));
                    r rVarE2 = u1.n.e(x2.f(r.S, 1.0f), tn.k.a(d92.b.f58623a, mVar6), m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = y.a(kVar2, h4.d.a.f81536n, mVar6, 0);
                    int iHashCode2 = Long.hashCode(mVar6.getU());
                    i2 i2VarX2 = mVar6.x();
                    r rVarC2 = h4.k.c(rVarE2, mVar6);
                    g.V.getClass();
                    e0.a aVar20 = g.a.f81805b;
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar20);
                    } else {
                        mVar6.c();
                    }
                    b4.c(g.a.f81810g, zVarA2, mVar6);
                    b4.c(g.a.f81809f, i2VarX2, mVar6);
                    g.a.b bVar15 = g.a.f81813j;
                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar6, iHashCode2, bVar15);
                    }
                    b4.c(g.a.f81807d, rVarC2, mVar6);
                    b0 b0Var2 = b0.f22601a;
                    ho.y yVar2 = new ho.y(fVarA2, true, true, null, null, true, null, 88, null);
                    Object objQ24 = mVar6.q();
                    aVar.getClass();
                    m.a.C2565a c2565a3 = m.a.f135155b;
                    if (objQ24 == c2565a3) {
                        objQ24 = new ha0.a(16);
                        mVar6.K(objQ24);
                    }
                    e23.a aVar21 = (e23.a) objQ24;
                    Object objQ25 = mVar6.q();
                    if (objQ25 == c2565a3) {
                        objQ25 = new h81.a(i17);
                        mVar6.K(objQ25);
                    }
                    e23.q qVar6 = (e23.q) objQ25;
                    Object objQ26 = mVar6.q();
                    if (objQ26 == c2565a3) {
                        objQ26 = new a(i15);
                        mVar6.K(objQ26);
                    }
                    p pVar6 = (p) objQ26;
                    Object objQ27 = mVar6.q();
                    if (objQ27 == c2565a3) {
                        objQ27 = new a(27);
                        mVar6.K(objQ27);
                    }
                    p pVar7 = (p) objQ27;
                    Object objQ28 = mVar6.q();
                    if (objQ28 == c2565a3) {
                        objQ28 = new ha0.b(i15);
                        mVar6.K(objQ28);
                    }
                    ho.w.e(yVar2, aVar21, qVar6, pVar6, pVar7, (e23.l) objQ28, mVar6, 224688);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj).intValue();
                q qVar7 = q.f84665a;
                ((ho.b) obj2).getClass();
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj).intValue();
                q qVar8 = q.f84665a;
                ((eo.b) obj2).getClass();
                return Unit.INSTANCE;
            case 28:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ho1.a aVar22 = ho1.a.f84780a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            default:
                DialogInterface dialogInterface5 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar5 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                dialogInterface5.getClass();
                dialogInterface5.dismiss();
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(int i14, int i15) {
        this.f82075a = i15;
    }

    public /* synthetic */ a(int i14) {
        this.f82075a = i14;
    }
}
