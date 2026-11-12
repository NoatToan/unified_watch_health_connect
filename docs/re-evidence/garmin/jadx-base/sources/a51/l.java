package a51;

import a03.n0;
import a42.f0;
import aa2.u;
import android.content.Context;
import androidx.lifecycle.j1;
import b21.c7;
import b21.d1;
import b21.l4;
import b21.u6;
import c2.b0;
import c2.q;
import c2.x2;
import c2.z;
import c22.o2;
import com.garmin.android.apps.connectmobile.AppConfigurationViewActivity;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.ui.ElectronicShiftingDataActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import cw1.x0;
import e23.p;
import f5.z0;
import h4.r;
import h5.e0;
import i3.h7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import lc.m0;
import lc.u0;
import lc.y;
import o4.m1;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p13.a1;
import p13.w;
import p13.x;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import u1.y0;
import u21.s;
import u21.t;
import v62.s9;
import vc0.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1456e;

    public /* synthetic */ l(c12.e eVar, v vVar, e23.a aVar, gk1.b bVar) {
        this.f1452a = 17;
        this.f1455d = eVar;
        this.f1456e = vVar;
        this.f1453b = aVar;
        this.f1454c = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:174:0x067a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0695  */
    /* JADX WARN: Code duplicated, block: B:184:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:189:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:194:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:199:0x0709  */
    /* JADX WARN: Code duplicated, block: B:20:0x00df  */
    /* JADX WARN: Code duplicated, block: B:304:0x0a75  */
    /* JADX WARN: Code duplicated, block: B:53:0x020d  */
    /* JADX WARN: Code duplicated, block: B:80:0x02c8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        j1 j1VarA;
        j1 j1VarA2;
        j1 j1VarA3;
        j11.c cVar;
        String strQ;
        int i14 = this.f1452a;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = 3;
        int i16 = 2;
        boolean z14 = false;
        int i17 = 1;
        Object obj3 = this.f1454c;
        Object obj4 = this.f1453b;
        Object obj5 = this.f1456e;
        Object obj6 = this.f1455d;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                o.a((t41.i) obj6, (i53.c) obj5, (e23.l) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                aa2.i.c((u) obj6, (e23.a) obj4, (e23.a) obj5, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ad0.k.c((ub0.l) obj6, (zc0.e) obj5, (String) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ad0.m.a((zc0.c) obj6, (String) obj5, (e23.a) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                af0.b.a((r) obj6, (we0.f) obj5, (String) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.d.b((com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.i.EnumC0614c) obj6, (ak0.v) obj5, (ak0.u) obj3, (bk0.d) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                u2.h hVar = (u2.h) obj6;
                zc.d dVar = (zc.d) obj5;
                e23.l lVar = (e23.l) obj3;
                e23.l lVar2 = (e23.l) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    r rVarD = x2.d(r.S, 1.0f);
                    boolean zB = mVar.B(hVar) | mVar.r(dVar) | mVar.B(lVar) | mVar.B(lVar2);
                    Object objQ = mVar.q();
                    if (zB) {
                        n0 n0Var = new n0(hVar, dVar, lVar, lVar2, 3);
                        mVar.K(n0Var);
                        objQ = n0Var;
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            n0 n0Var2 = new n0(hVar, dVar, lVar, lVar2, 3);
                            mVar.K(n0Var2);
                            objQ = n0Var2;
                        }
                    }
                    e2.c.b(rVarD, null, null, null, null, null, false, null, (e23.l) objQ, mVar, 6, 510);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                at.g.a((String) obj6, (ct.b) obj5, (ct.a) obj3, (e23.a) obj4, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 8:
                i21.d dVar2 = (i21.d) obj5;
                m0 m0Var = (m0) obj3;
                NutritionActivity.g gVar = (NutritionActivity.g) obj4;
                b63.u uVar = (b63.u) obj;
                b11.a aVar2 = (b11.a) obj2;
                uVar.getClass();
                aVar2.getClass();
                if (((l4.g) obj6).b() == j11.c.DAILY_LOG) {
                    dVar2.Q4(w.c(uVar.b()));
                }
                lc.v vVarF = m0Var.f();
                if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                    j1VarA.f(aVar2, "foodLoggedResult");
                }
                gVar.invoke();
                return Unit.INSTANCE;
            case 9:
                l4.c cVar2 = (l4.c) obj6;
                i21.d dVar3 = (i21.d) obj5;
                m0 m0Var2 = (m0) obj3;
                NutritionActivity.g gVar2 = (NutritionActivity.g) obj4;
                b63.o oVar = (b63.o) obj;
                b11.i.b bVar = (b11.i.b) obj2;
                oVar.getClass();
                bVar.getClass();
                if (cVar2.b() == j11.c.DAILY_LOG) {
                    dVar3.Q4(w.c(oVar));
                }
                lc.v vVarF2 = m0Var2.f();
                if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                    String str = cVar2.f14860d;
                    str.getClass();
                    j1VarA2.f(new b11.a.c(str, bVar.f14308d, bVar.f14309e, Long.valueOf(bVar.f14310f), bVar.f14311g, bVar.f14312h, bVar.f14314j), "standaloneConsumableFoodUpdatedResult");
                }
                gVar2.invoke();
                return Unit.INSTANCE;
            case 10:
                l4.b bVar2 = (l4.b) obj6;
                i21.d dVar4 = (i21.d) obj5;
                m0 m0Var3 = (m0) obj3;
                NutritionActivity.g gVar3 = (NutritionActivity.g) obj4;
                b63.o oVar2 = (b63.o) obj;
                b11.i.b bVar3 = (b11.i.b) obj2;
                oVar2.getClass();
                bVar3.getClass();
                if (bVar2.b() == j11.c.DAILY_LOG) {
                    dVar4.Q4(w.c(oVar2));
                }
                d1.b(m0Var3, !a1.b(j11.c.PHOTO_RESULT).contains(bVar2.b()), true, "foodLoggedResult", new b11.a.c(kg.f.c(), bVar3.f14308d, bVar3.f14309e, Long.valueOf(bVar3.f14310f), bVar3.f14311g, bVar3.f14312h, bVar3.f14314j), gVar3);
                return Unit.INSTANCE;
            case 11:
                l4.h hVar2 = (l4.h) obj6;
                i21.d dVar5 = (i21.d) obj5;
                m0 m0Var4 = (m0) obj3;
                NutritionActivity.g gVar4 = (NutritionActivity.g) obj4;
                b63.o oVar3 = (b63.o) obj;
                b11.i.a aVar3 = (b11.i.a) obj2;
                oVar3.getClass();
                aVar3.getClass();
                if (hVar2.b() == j11.c.DAILY_LOG) {
                    dVar5.Q4(w.c(oVar3));
                }
                lc.v vVarF3 = m0Var4.f();
                if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                    String str2 = hVar2.f14888c;
                    str2.getClass();
                    j1VarA3.f(new b11.a.C0202a(str2, aVar3.f14298d, aVar3.f14299e, Long.valueOf(aVar3.f14300f), aVar3.f14301g, aVar3.f14302h, aVar3.f14304j), "standaloneConsumableFoodUpdatedResult");
                }
                gVar4.invoke();
                return Unit.INSTANCE;
            case 12:
                l4.a aVar4 = (l4.a) obj6;
                i21.d dVar6 = (i21.d) obj5;
                m0 m0Var5 = (m0) obj3;
                NutritionActivity.g gVar5 = (NutritionActivity.g) obj4;
                b63.o oVar4 = (b63.o) obj;
                b11.i.a aVar5 = (b11.i.a) obj2;
                oVar4.getClass();
                aVar5.getClass();
                if (aVar4.b() == j11.c.DAILY_LOG) {
                    dVar6.Q4(w.c(oVar4));
                }
                d1.b(m0Var5, !a1.b(j11.c.PHOTO_RESULT).contains(aVar4.b()), true, "foodLoggedResult", new b11.a.C0202a(kg.f.c(), aVar5.f14298d, aVar5.f14299e, Long.valueOf(aVar5.f14300f), aVar5.f14301g, aVar5.f14302h, aVar5.f14304j), gVar5);
                return Unit.INSTANCE;
            case 13:
                l4.m mVar2 = (l4.m) obj5;
                m0 m0Var6 = (m0) obj3;
                x3 x3Var = (x3) obj4;
                b11.a aVar6 = (b11.a) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                aVar6.getClass();
                ((m21.g) obj6).C4();
                m21.b bVar4 = mVar2.f14927b;
                b11.k kVar = mVar2.f14929d;
                if (bVar4 instanceof m21.b.e) {
                    cVar = j11.c.DAILY_LOG;
                } else if (bVar4 instanceof m21.b.a) {
                    cVar = j11.c.CUSTOM_MEAL;
                } else {
                    if (!(bVar4 instanceof m21.b.C2206b)) {
                        if (bVar4 instanceof m21.b.c) {
                            cVar = j11.c.RECIPE;
                        } else {
                            u0.r();
                        }
                        return null;
                    }
                    cVar = j11.c.PHOTO_RESULT;
                }
                j11.c cVar3 = cVar;
                if (aVar6 instanceof b11.a.C0202a) {
                    b63.u uVarB = mVar2.b();
                    boolean z15 = ((m21.e) x3Var.getF182175a()).f116099p;
                    b11.k kVar2 = ((m21.e) x3Var.getF182175a()).f116102s;
                    if (kVar2 != null) {
                        kVar = kVar2;
                    }
                    b11.m mVar3 = new b11.m(z15, kVar);
                    b11.a.C0202a c0202a = (b11.a.C0202a) aVar6;
                    b11.d dVar7 = c0202a.f14222e;
                    y.l(m0Var6, new l4.a(uVarB, dVar7.f14253a, c0202a.f14219b, c0202a.f14223f.f14372a, dVar7.f14258f, dVar7.f14259g, zBooleanValue, (String) null, dVar7.f14257e, i01.i.REGULAR_LOG, cVar3, mVar3, 128, (p005kotlin.jvm.internal.j) null));
                } else if (aVar6 instanceof b11.a.b) {
                    i01.i iVar = bVar4 instanceof m21.b.C2206b ? i01.i.IMAGE_RECOGNITION : i01.i.REGULAR_LOG;
                    long j8 = ((b11.a.b) aVar6).f14228d;
                    b63.u uVarB2 = mVar2.b();
                    boolean z16 = ((m21.e) x3Var.getF182175a()).f116099p;
                    b11.k kVar3 = ((m21.e) x3Var.getF182175a()).f116102s;
                    if (kVar3 != null) {
                        kVar = kVar3;
                    }
                    y.l(m0Var6, new l4.g(j8, uVarB2, iVar, cVar3, new b11.m(z16, kVar)));
                } else {
                    if (!(aVar6 instanceof b11.a.c)) {
                        u0.r();
                        return null;
                    }
                    i01.i iVar2 = bVar4 instanceof m21.b.C2206b ? i01.i.IMAGE_RECOGNITION : i01.i.REGULAR_LOG;
                    b63.u uVarB3 = mVar2.b();
                    b11.a.c cVar4 = (b11.a.c) aVar6;
                    b11.d dVar8 = cVar4.f14238e;
                    String str3 = dVar8.f14253a;
                    double d14 = cVar4.f14235b;
                    String str4 = dVar8.f14258f;
                    String str5 = dVar8.f14259g;
                    boolean z17 = ((m21.e) x3Var.getF182175a()).f116099p;
                    b11.k kVar4 = ((m21.e) x3Var.getF182175a()).f116102s;
                    if (kVar4 != null) {
                        kVar = kVar4;
                    }
                    y.l(m0Var6, new l4.b(uVarB3, str3, d14, str4, str5, iVar2, cVar3, new b11.m(z17, kVar)));
                }
                return Unit.INSTANCE;
            case 14:
                v21.e eVar = (v21.e) obj6;
                t tVar = (t) obj5;
                m0 m0Var7 = (m0) obj3;
                p1 p1Var = (p1) obj4;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    s sVar = (s) p1Var.getF182175a();
                    boolean zR = mVar4.r(tVar);
                    Object objQ2 = mVar4.q();
                    if (zR) {
                        objQ2 = new u6(tVar, z14 ? 1 : 0);
                        mVar4.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new u6(tVar, z14 ? 1 : 0);
                            mVar4.K(objQ2);
                        }
                    }
                    e23.l lVar3 = (e23.l) objQ2;
                    boolean zR2 = mVar4.r(tVar);
                    Object objQ3 = mVar4.q();
                    if (zR2) {
                        objQ3 = new b21.h(tVar, i17);
                        mVar4.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new b21.h(tVar, i17);
                            mVar4.K(objQ3);
                        }
                    }
                    e23.a aVar7 = (e23.a) objQ3;
                    boolean zR3 = mVar4.r(m0Var7) | mVar4.B(p1Var);
                    Object objQ4 = mVar4.q();
                    if (zR3) {
                        objQ4 = new c7(m0Var7, p1Var, 0);
                        mVar4.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new c7(m0Var7, p1Var, 0);
                            mVar4.K(objQ4);
                        }
                    }
                    e23.l lVar4 = (e23.l) objQ4;
                    boolean zR4 = mVar4.r(tVar);
                    Object objQ5 = mVar4.q();
                    if (zR4) {
                        objQ5 = new u6(tVar, i17);
                        mVar4.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new u6(tVar, i17);
                            mVar4.K(objQ5);
                        }
                    }
                    e23.l lVar5 = (e23.l) objQ5;
                    boolean zR5 = mVar4.r(tVar);
                    Object objQ6 = mVar4.q();
                    if (zR5) {
                        objQ6 = new u6(tVar, 2);
                        mVar4.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new u6(tVar, 2);
                            mVar4.K(objQ6);
                        }
                    }
                    e23.l lVar6 = (e23.l) objQ6;
                    boolean zR6 = mVar4.r(tVar);
                    Object objQ7 = mVar4.q();
                    if (zR6) {
                        objQ7 = new b21.h(tVar, i15);
                        mVar4.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new b21.h(tVar, i15);
                            mVar4.K(objQ7);
                        }
                    }
                    t21.m0.f(sVar, eVar, lVar3, aVar7, lVar4, lVar5, lVar6, (e23.a) objQ7, mVar4, 0, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 15:
                DateTime dateTime = (DateTime) obj6;
                DateTime dateTime2 = (DateTime) obj5;
                o82.g gVar6 = (o82.g) obj3;
                a71.e eVar2 = (a71.e) obj4;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    r rVarC = x2.c(x2.f(r.S, 1.0f), 1.0f);
                    Object objQ8 = mVar5.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ8 == c2565a) {
                        objQ8 = new b71.o(0);
                        mVar5.K(objQ8);
                    }
                    e23.l lVar7 = (e23.l) objQ8;
                    boolean zR7 = mVar5.r(dateTime) | mVar5.r(dateTime2) | mVar5.k(gVar6.ordinal()) | mVar5.r(eVar2);
                    Object objQ9 = mVar5.q();
                    if (zR7 || objQ9 == c2565a) {
                        n0 n0Var3 = new n0(dateTime, dateTime2, gVar6, eVar2, 6);
                        mVar5.K(n0Var3);
                        objQ9 = n0Var3;
                    }
                    p002j6.c.b(lVar7, rVarC, (e23.l) objQ9, mVar5, 54, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                b82.j jVar = b82.j.f16611a;
                ((b82.j) obj6).a(p0.t(1), (e23.l) obj3, (i53.c) obj5, (String) obj4, (p3.m) obj);
                return Unit.INSTANCE;
            case 17:
                c12.e eVar3 = (c12.e) obj6;
                v vVar = (v) obj5;
                e23.a aVar8 = (e23.a) obj4;
                gk1.b bVar5 = (gk1.b) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    r.a aVar9 = r.S;
                    r rVarD2 = x2.d(aVar9, 1.0f);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar6.getU());
                    i2 i2VarX = mVar6.x();
                    r rVarC2 = h4.k.c(rVarD2, mVar6);
                    h5.g.V.getClass();
                    e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar10);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar6);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar6, iHashCode, bVar6);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar6);
                    c2.u uVar2 = c2.u.f22885a;
                    h4.g gVar7 = h4.d.a.f81528f;
                    c12.d.a(uVar2.c(aVar9, gVar7), mVar6, 0);
                    c12.d.h(eVar3, uVar2.c(aVar9, gVar7), mVar6, 0);
                    c12.d.g(eVar3, vVar, aVar8, bVar5, uVar2.c(aVar9, h4.d.a.f81531i), mVar6, 0);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                c42.j.a((c42.l) obj6, (c42.o) obj5, (c42.p) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                c51.a.a((String) obj6, (String) obj5, (e23.l) obj3, (r) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                i53.f fVar = (i53.f) obj6;
                n82.f fVar2 = (n82.f) obj5;
                n82.b bVar7 = fVar2.f124961b;
                yd1.a aVar11 = (yd1.a) obj3;
                c70.i iVar3 = (c70.i) obj4;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    r.a aVar12 = r.S;
                    r rVarE = u1.n.e(x2.d(aVar12, 1.0f), vb.h.e(d92.b.f58623a, mVar7), m1.f128891a);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar13 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA = c2.y.a(c2.j.f22694d, aVar13, mVar7, 48);
                    int iHashCode2 = Long.hashCode(mVar7.getU());
                    i2 i2VarX2 = mVar7.x();
                    r rVarC3 = h4.k.c(rVarE, mVar7);
                    h5.g.V.getClass();
                    e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar14);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar7);
                    h5.g.a.b bVar8 = h5.g.a.f81813j;
                    if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar7, iHashCode2, bVar8);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar7);
                    b0 b0Var = b0.f22601a;
                    d92.b.f58625c.getClass();
                    c2.l.f(c2.l.C(aVar12, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), mVar7);
                    i53.c cVarE = i53.a.e(o2.b(fVar, mVar7));
                    int iIndexOf = fVar.indexOf(bVar7.a());
                    boolean zB2 = mVar7.B(fVar2);
                    Object objQ10 = mVar7.q();
                    if (zB2) {
                        objQ10 = new f0(fVar2, fVar, 1);
                        mVar7.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new f0(fVar2, fVar, 1);
                            mVar7.K(objQ10);
                        }
                    }
                    t82.c.a(cVarE, null, iIndexOf, 0.0f, (e23.l) objQ10, mVar7, 3072, 18);
                    if (bVar7.a() != o82.g.f130849b) {
                        mVar7.C(783525710);
                        r rVarF = x2.f(aVar12, 1.0f);
                        n82.n nVar = new n82.n(fVar2, aVar11);
                        b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                        String strQ2 = gl1.y.Q(mVar7, R.string.label_previous);
                        LinkedHashMap linkedHashMap = c0235a.f16962a;
                        linkedHashMap.put("chevron_left", strQ2);
                        linkedHashMap.put("chevron_right", gl1.y.Q(mVar7, R.string.lbl_next));
                        b92.a aVarB = c0235a.b();
                        int i18 = b92.a.f16960b;
                        q82.a.a(rVarF, nVar, aVarB, mVar7, 6, 0);
                        mVar7.f();
                    } else {
                        mVar7.C(784052338);
                        mVar7.f();
                    }
                    n82.c.a(b0Var.a(aVar12, 1.0f, true), fVar2, 3, false, z3.f.c(-1635657874, new a6.c(iVar3, 2), mVar7), mVar7, 24960, 8);
                    mVar7.y();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                cd1.d.b((fd1.e) obj6, (i53.c) obj5, (r) obj3, (String) obj4, (p3.m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 22:
                qm1.k kVar5 = (qm1.k) obj6;
                String str6 = (String) obj5;
                Context context = (Context) obj3;
                b10.c cVar5 = (b10.c) obj4;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                z3.e eVar4 = cn1.n.f28029a;
                if (mVar8.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    if ((kVar5 != null ? kVar5.f145623d : null) == null) {
                        mVar8.C(164573297);
                        mVar8.f();
                    } else {
                        mVar8.C(164573298);
                        e23.t[] tVarArr = qm1.l.b(kVar5) == qm1.o.MANUAL ? (e23.t[]) w.c(eVar4).toArray(new e23.t[0]) : (e23.t[]) x.k(eVar4, cn1.n.f28030b, cn1.n.f28031c).toArray(new e23.t[0]);
                        r.a aVar15 = r.S;
                        boolean zB3 = mVar8.B(str6);
                        Object objQ11 = mVar8.q();
                        if (zB3) {
                            objQ11 = new c82.b(str6, 26);
                            mVar8.K(objQ11);
                        } else {
                            aVar.getClass();
                            if (objQ11 == p3.m.a.f135155b) {
                                objQ11 = new c82.b(str6, 26);
                                mVar8.K(objQ11);
                            }
                        }
                        cn1.n.a(p5.v.c((e23.l) objQ11, aVar15, false), context, cVar5, kVar5, (e23.t[]) Arrays.copyOf(tVarArr, tVarArr.length), mVar8, 512);
                        mVar8.f();
                    }
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                int i19 = AppConfigurationViewActivity.f28625b;
                ((AppConfigurationViewActivity) obj6).aa(p0.t(385), (r) obj4, (String) obj5, (String) obj3, (p3.m) obj);
                return Unit.INSTANCE;
            case 24:
                String str7 = (String) obj6;
                Integer num = (Integer) obj5;
                com.garmin.android.apps.connectmobile.incidentdetection.c cVar6 = (com.garmin.android.apps.connectmobile.incidentdetection.c) obj3;
                x3 x3Var2 = (x3) obj4;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.incidentdetection.c.a aVar16 = com.garmin.android.apps.connectmobile.incidentdetection.c.f36851e;
                if (mVar9.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    if (num != null) {
                        mVar9.C(1273831271);
                        strQ = gl1.y.Q(mVar9, num.intValue());
                        mVar9.f();
                    } else {
                        mVar9.C(834097620);
                        mVar9.f();
                        strQ = "";
                    }
                    List list = (List) x3Var2.getF182175a();
                    boolean zR8 = mVar9.r(cVar6);
                    Object objQ12 = mVar9.q();
                    if (zR8) {
                        objQ12 = new cq0.g(cVar6, 0);
                        mVar9.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new cq0.g(cVar6, 0);
                            mVar9.K(objQ12);
                        }
                    }
                    cq0.r.a(str7, strQ, list, (e23.a) objQ12, mVar9, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                cq0.r.a((String) obj6, (String) obj5, (List) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                cq0.v.b((String) obj6, (String) obj5, (String) obj3, (List) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 27:
                e23.a aVar17 = (e23.a) obj4;
                ArrayList arrayList = (ArrayList) obj6;
                ElectronicShiftingDataActivity electronicShiftingDataActivity = (ElectronicShiftingDataActivity) obj5;
                p1 p1Var2 = (p1) obj3;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ElectronicShiftingDataActivity.a aVar18 = ElectronicShiftingDataActivity.f29955b;
                if (mVar10.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    z02.d.a(false, z3.f.c(-991933072, new cq0.p(aVar17, i16), mVar10), null, null, null, z3.f.c(-701189260, new c50.f(arrayList, 14, electronicShiftingDataActivity, p1Var2), mVar10), mVar10, 196656, 29);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 28:
                p1 p1Var3 = (p1) obj6;
                e23.l lVar8 = (e23.l) obj3;
                p1 p1Var4 = (p1) obj5;
                x3 x3Var3 = (x3) obj4;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                        mVar11.C(1666841199);
                        s62.a.f157643a.getClass();
                        u4.d dVarA = s9.a(t62.b.f162798a);
                        r.a aVar19 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        y0.b(dVarA, "", x2.q(aVar19, j92.b.f97901d.f97904c), null, mVar11, 48, 120);
                        mVar11.f();
                    } else if (((Boolean) x3Var3.getF182175a()).booleanValue()) {
                        mVar11.C(1667149897);
                        r.a aVar20 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        r rVarQ = x2.q(aVar20, j92.b.f97901d.f97904c);
                        boolean zB4 = mVar11.B(p1Var3) | mVar11.B(lVar8);
                        Object objQ13 = mVar11.q();
                        if (zB4) {
                            objQ13 = new k(lVar8, p1Var3, 6);
                            mVar11.K(objQ13);
                        } else {
                            aVar.getClass();
                            if (objQ13 == p3.m.a.f135155b) {
                                objQ13 = new k(lVar8, p1Var3, 6);
                                mVar11.K(objQ13);
                            }
                        }
                        cw1.g.f56037a.getClass();
                        h7.a((e23.a) objQ13, rVarQ, false, null, null, cw1.g.f56039c, mVar11, 1572864, 60);
                        mVar11.f();
                    } else {
                        mVar11.C(1667758768);
                        mVar11.f();
                    }
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                x0.a((r) obj6, (hv1.i) obj5, (m52.i) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l(int i14, int i15, e23.l lVar, Object obj, Object obj2, Object obj3, boolean z14) {
        this.f1452a = i15;
        this.f1455d = obj;
        this.f1456e = obj2;
        this.f1453b = obj3;
        this.f1454c = lVar;
    }

    public /* synthetic */ l(e23.a aVar, ArrayList arrayList, ElectronicShiftingDataActivity electronicShiftingDataActivity, p1 p1Var) {
        this.f1452a = 27;
        this.f1453b = aVar;
        this.f1455d = arrayList;
        this.f1456e = electronicShiftingDataActivity;
        this.f1454c = p1Var;
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, e23.l lVar, int i14, int i15) {
        this.f1452a = i15;
        this.f1455d = obj;
        this.f1453b = obj2;
        this.f1456e = obj3;
        this.f1454c = lVar;
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f1452a = i14;
        this.f1455d = obj;
        this.f1456e = obj2;
        this.f1454c = obj3;
        this.f1453b = obj4;
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, Object obj4, int i14, int i15) {
        this.f1452a = i15;
        this.f1455d = obj;
        this.f1456e = obj2;
        this.f1454c = obj3;
        this.f1453b = obj4;
    }

    public /* synthetic */ l(p1 p1Var, e23.l lVar, p1 p1Var2, x3 x3Var) {
        this.f1452a = 28;
        this.f1455d = p1Var;
        this.f1454c = lVar;
        this.f1456e = p1Var2;
        this.f1453b = x3Var;
    }
}
