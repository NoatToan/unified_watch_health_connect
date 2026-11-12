package g52;

import android.content.Context;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import ds.f0;
import e2.i0;
import e2.k0;
import f5.z0;
import gw0.g0;
import h5.e0;
import ho.w;
import i3.ec;
import i3.j2;
import i3.mc;
import i3.mh;
import i3.rj;
import i3.u7;
import ii0.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.i3;
import l72.x0;
import lc.y;
import nr.l0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.a2;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import p5.v;
import u1.y0;
import v62.u4;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f75957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f75958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f75959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f75960e;

    public /* synthetic */ d(DateTime dateTime, DateTime dateTime2, o82.g gVar, n61.f fVar) {
        this.f75956a = 29;
        this.f75957b = dateTime;
        this.f75958c = dateTime2;
        this.f75960e = gVar;
        this.f75959d = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x0691  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:31:0x010f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        float f14;
        int i14;
        float f15;
        float f16;
        float f17;
        u4.d dVarA;
        int i15 = this.f75956a;
        int i16 = 28;
        int i17 = 21;
        p3.m.a aVar = p3.m.f135153a;
        Object obj3 = this.f75959d;
        Object obj4 = this.f75960e;
        Object obj5 = this.f75958c;
        Object obj6 = this.f75957b;
        switch (i15) {
            case 0:
                ((Integer) obj2).getClass();
                e.a((LocalDate) obj6, (LocalDate) obj5, (z42.d) obj3, (o82.g) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                i.a((z42.i) obj3, (LocalDate) obj6, (LocalDate) obj5, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                gk1.c.a((com.garmin.android.apps.connectmobile.googlehealthconnect.a) obj6, (y) obj5, (gk1.e) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                o70.n nVar = (o70.n) obj6;
                i53.c cVar = (i53.c) obj5;
                String str = (String) obj3;
                String str2 = (String) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    int i18 = gp.l.a.f78391b[nVar.ordinal()];
                    if (i18 == 1 || i18 == 2) {
                        mVar.C(-340595047);
                        gp.l.b(cVar, str, str2, mVar, 0);
                        mVar.f();
                    } else {
                        if (i18 != 3 && i18 != 4) {
                            throw n23.j.m(mVar, -2089199258);
                        }
                        mVar.C(-340322030);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 4:
                h4.r rVar = (h4.r) obj6;
                ds.n nVar2 = (ds.n) obj5;
                nr.p0 p0Var = (nr.p0) obj3;
                List list = (List) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    aVar2.getClass();
                    h4.r rVarD = x2.d(rVar, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g gVar = h4.d.a.f81524b;
                    z0 z0VarD = c2.q.d(gVar, false);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarD, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, z0VarD, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar2);
                    u uVar = u.f22885a;
                    h4.r rVarD2 = x2.d(aVar2, 1.0f);
                    t4.d dVarA2 = n5.c.a(R.drawable.template_route_background, mVar2, 0);
                    f5.k.f68985a.getClass();
                    h4.r rVarA = l4.r.a(rVarD2, dVarA2, null, f5.k.a.f68993h, 0.0f, null, 54);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.g.a aVar4 = h4.d.a.f81536n;
                    z zVarA = c2.y.a(kVar, aVar4, mVar2, 0);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarA, mVar2);
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar, zVarA, mVar2);
                    b4.c(c1623g, i2VarX2, mVar2);
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, mVar2);
                    b0 b0Var = b0.f22601a;
                    String str3 = p0Var.f127282a;
                    List<l0> list2 = p0Var.f127285d;
                    String str4 = p0Var.f127283b;
                    Integer num = p0Var.f127284c;
                    Integer numValueOf = Integer.valueOf(R.drawable.template_route_header);
                    ds.n nVar3 = ds.n.f61012i;
                    if (nVar2 == nVar3) {
                        g6.f.a aVar5 = g6.f.f75994b;
                        f14 = 48;
                    } else {
                        g6.f.a aVar6 = g6.f.f75994b;
                        f14 = 0;
                    }
                    f0.a(str3, str4, num, numValueOf, null, 0L, 0L, 0L, f14, null, mVar2, 0, 752);
                    h4.r rVarD3 = x2.d(aVar2, 1.0f);
                    z0 z0VarD2 = c2.q.d(gVar, false);
                    int iHashCode3 = Long.hashCode(mVar2.getU());
                    i2 i2VarX3 = mVar2.x();
                    h4.r rVarC3 = h4.k.c(rVarD3, mVar2);
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar, z0VarD2, mVar2);
                    b4.c(c1623g, i2VarX3, mVar2);
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar2, iHashCode3, bVar);
                    }
                    b4.c(fVar, rVarC3, mVar2);
                    h4.r rVarC4 = uVar.c(aVar2, h4.d.a.f81530h);
                    if (nVar2 == nVar3) {
                        f15 = 72;
                        i14 = 0;
                    } else {
                        i14 = 0;
                        f15 = 0;
                    }
                    h4.r rVarC5 = c2.l.C(rVarC4, 0.0f, 0.0f, 0.0f, f15, 7);
                    z zVarA2 = c2.y.a(kVar, aVar4, mVar2, i14);
                    int iHashCode4 = Long.hashCode(mVar2.getU());
                    i2 i2VarX4 = mVar2.x();
                    h4.r rVarC6 = h4.k.c(rVarC5, mVar2);
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar, zVarA2, mVar2);
                    b4.c(c1623g, i2VarX4, mVar2);
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar2, iHashCode4, bVar);
                    }
                    b4.c(fVar, rVarC6, mVar2);
                    h4.r rVarF = x2.f(aVar2, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f18 = j92.b.f97899b.f97920e;
                    h4.r rVarA2 = b0Var.a(c2.l.C(rVarF, f18, 0.0f, 0.0f, f18, 6), 1.0f, true);
                    s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81535m, mVar2, 48);
                    int iHashCode5 = Long.hashCode(mVar2.getU());
                    i2 i2VarX5 = mVar2.x();
                    h4.r rVarC7 = h4.k.c(rVarA2, mVar2);
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar, s2VarA, mVar2);
                    b4.c(c1623g, i2VarX5, mVar2);
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar2, iHashCode5, bVar);
                    }
                    b4.c(fVar, rVarC7, mVar2);
                    u2 u2Var = u2.f22900a;
                    l0 l0Var = (l0) h0.e0(0, list2);
                    r22.p pVar = l0Var != null ? l0Var.f127250a : null;
                    x0 x0Var = x0.f111346a;
                    String strH = pVar != null ? pVar.f149774a : null;
                    if (strH == null) {
                        strH = sn.a.h(mVar2, 2058007179, R.string.no_value, mVar2);
                    } else {
                        mVar2.C(2058006559);
                        mVar2.f();
                    }
                    x0Var.f(6 | (x0.f111348c << 24), 116, null, u2Var, null, null, strH, pVar != null ? pVar.f149776c : null, pVar != null ? pVar.f149775b : null, null, mVar2);
                    gs.l.b(c2.l.C(x2.f(aVar2, 0.58f), 16, 0.0f, 54, 0.0f, 10), list, 0, mVar2, 6, 4);
                    mVar2.y();
                    mVar2.C(-200138427);
                    Iterator it = h0.Q(h0.U(list2, 1), 2).iterator();
                    while (it.hasNext()) {
                        gs.l.a((List) it.next(), mVar2, 0);
                    }
                    mVar2.f();
                    mVar2.y();
                    mVar2.y();
                    mVar2.y();
                    t4.d dVarA3 = n5.c.a(R.drawable.garmin_logo_tag_vertical, mVar2, 0);
                    h4.r.a aVar7 = h4.r.S;
                    if (nVar2 == ds.n.f61012i) {
                        f16 = 64;
                    } else {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f16 = j92.b.f97899b.f97922g;
                    }
                    h4.r rVarC8 = c2.l.C(aVar7, 0.0f, f16, 0.0f, 0.0f, 13);
                    h4.d.f81522a.getClass();
                    y0.a(dVarA3, null, uVar.c(rVarC8, h4.d.a.f81526d), null, null, 0.0f, null, mVar2, 48, 120);
                    mVar2.y();
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                gs.u.a((h4.r) obj6, (e23.a) obj5, (String) obj3, (ds.n) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                gt1.e.a((String) obj6, (String) obj5, (h4.r) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                gt1.u.a((String) obj6, (p1) obj5, (e23.a) obj3, (e23.a) obj4, (p3.m) obj, p0.t(433));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                g0.f((pv0.c) obj6, (Long) obj5, (Long) obj3, (e23.l) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                n1 n1Var = (n1) obj6;
                Integer num2 = (Integer) obj5;
                String str5 = (String) obj3;
                String str6 = (String) obj4;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    h4.r rVarX = x2.x(x2.f(aVar8, 1.0f), null, 3);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC9 = c2.l.C(rVarX, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                    Object objQ = mVar3.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new a11.h0(n1Var, 12);
                        mVar3.K(objQ);
                    }
                    h4.r rVarF2 = f5.g0.f(rVarC9, (e23.l) objQ);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar2 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA2 = q2.a(c2.j.f22698h, bVar2, mVar3, 54);
                    int iHashCode6 = Long.hashCode(mVar3.getU());
                    i2 i2VarX6 = mVar3.x();
                    h4.r rVarC10 = h4.k.c(rVarF2, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar9);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA2, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX6, mVar3);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar3, iHashCode6, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC10, mVar3);
                    u2 u2Var2 = u2.f22900a;
                    Object objQ2 = mVar3.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new a2(0);
                        mVar3.K(objQ2);
                    }
                    n1 n1Var2 = (n1) objQ2;
                    int intValue = n1Var2.getIntValue();
                    int intValue2 = n1Var.getIntValue();
                    int iIntValue4 = num2 != null ? num2.intValue() : 0;
                    if (intValue2 > 0) {
                        f17 = intValue / (intValue2 - intValue);
                        float f19 = (iIntValue4 / 1441) - f17;
                        if (f17 > 1.0f || f19 >= f17) {
                            if (f19 <= 1.0f) {
                                f17 = f19;
                            } else {
                                f17 = 0.2f;
                            }
                        }
                    } else {
                        f17 = 0.2f;
                    }
                    Object objQ3 = mVar3.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new g11.e(28);
                        mVar3.K(objQ3);
                    }
                    h4.r rVarC11 = v.c((e23.l) objQ3, aVar8, false);
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var2 = j92.f.f97935l;
                    s5.x0 x0VarF = d92.c.f(x0Var2, mVar3);
                    d6.h.f57752b.getClass();
                    d6.h hVarA = d6.h.a(d6.h.f57757g);
                    Object objQ4 = mVar3.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new a11.h0(n1Var2, 13);
                        mVar3.K(objQ4);
                    }
                    mh.c(str5, rVarC11, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, (e23.l) objQ4, x0VarF, mVar3, 0, 1572864, 64508);
                    if (str6 == null) {
                        mVar3.C(1884377933);
                        mVar3.f();
                    } else {
                        mVar3.C(1884377934);
                        g6.f.a aVar10 = g6.f.f75994b;
                        c2.l.f(x2.h(x2.f(aVar8, f17), 0), mVar3);
                        s5.x0 x0VarF2 = d92.c.f(x0Var2, mVar3);
                        h4.r rVarA3 = u2Var2.a(aVar8, 1.0f, true);
                        Object objQ5 = mVar3.q();
                        if (objQ5 == c2565a) {
                            objQ5 = new g11.e(29);
                            mVar3.K(objQ5);
                        }
                        mh.c(str6, v.c((e23.l) objQ5, rVarA3, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, mVar3, 0, 0, 131068);
                        Unit unit = Unit.INSTANCE;
                        mVar3.f();
                    }
                    Object objQ6 = mVar3.q();
                    if (objQ6 == c2565a) {
                        objQ6 = new h02.a(0);
                        mVar3.K(objQ6);
                    }
                    mh.c(str5, v.c((e23.l) objQ6, aVar8, false), 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar3), mVar3, 0, 0, 130044);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                h50.g.a((i50.d) obj6, (i50.i) obj5, (e23.l) obj3, (h4.r) obj4, (p3.m) obj, p0.t(3073));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                h62.k.i((i53.c) obj6, (i53.c) obj5, (e23.p) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                il1.a aVar11 = (il1.a) obj6;
                kl1.a aVar12 = (kl1.a) obj5;
                hl1.c cVar2 = (hl1.c) obj3;
                p1 p1Var = (p1) obj4;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int iOrdinal = aVar11 != null ? aVar11.ordinal() : 0;
                    Object objQ7 = mVar4.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ7 == c2565a2) {
                        objQ7 = new a2(iOrdinal);
                        mVar4.K(objQ7);
                    }
                    n1 n1Var3 = (n1) objQ7;
                    h4.r rVarB = u1.a2.b(h4.r.S, u1.a2.a(mVar4), true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA3 = c2.y.a(kVar2, h4.d.a.f81536n, mVar4, 0);
                    int iHashCode7 = Long.hashCode(mVar4.getU());
                    i2 i2VarX7 = mVar4.x();
                    h4.r rVarC12 = h4.k.c(rVarB, mVar4);
                    h5.g.V.getClass();
                    e0.a aVar13 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar13);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX7, mVar4);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode7))) {
                        v.h.z(iHashCode7, mVar4, iHashCode7, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC12, mVar4);
                    b0 b0Var2 = b0.f22601a;
                    i53.d<il1.a, List<zf2.d>> dVar = ((hl1.b) p1Var.getF182175a()).f84358b;
                    int intValue3 = n1Var3.getIntValue();
                    Object objQ8 = mVar4.q();
                    if (objQ8 == c2565a2) {
                        objQ8 = new a11.h0(n1Var3, 14);
                        mVar4.K(objQ8);
                    }
                    e23.l lVar = (e23.l) objQ8;
                    boolean zR = mVar4.r(cVar2);
                    Object objQ9 = mVar4.q();
                    if (zR || objQ9 == c2565a2) {
                        objQ9 = new g12.f(cVar2, i16);
                        mVar4.K(objQ9);
                    }
                    il1.c.a(dVar, aVar12, false, intValue3, lVar, (e23.l) objQ9, null, mVar4, 24960, 64);
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ((hn.b) obj6).b((String) obj5, (String) obj3, (Integer) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ho.p.a((h4.r) obj6, (eo.d) obj5, (eo.d) obj3, (e23.p) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                w.f((jo.c.a) obj6, (e23.p) obj5, (e23.l) obj3, (e23.l) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                ht1.d.b((String) obj6, (e23.q) obj5, (h4.r) obj3, (e23.a) obj4, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                ht1.w.i((h4.r) obj6, (String) obj5, (String) obj3, (p1) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                i11.h.a((h4.r) obj6, (String) obj5, (String) obj3, (String) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                i11.h.b((String) obj6, (String) obj5, (String) obj3, (z3.e) obj4, (p3.m) obj, p0.t(3073));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                i11.m.a((mc) obj6, (o53.b0) obj5, (b11.f) obj3, (v21.e) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                u7.b((j2) obj6, (ec) obj5, (rj) obj3, (e23.p) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                i51.g.b((o51.j) obj6, (e23.l) obj5, (e23.l) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                d91.s sVar = (d91.s) obj6;
                p1 p1Var2 = (p1) obj5;
                e23.r rVar2 = (e23.r) obj3;
                p1 p1Var3 = (p1) obj4;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                    Object objQ10 = mVar5.q();
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new i11.i(p1Var2, 11);
                        mVar5.K(objQ10);
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i3.u.a(zBooleanValue, (e23.a) objQ10, null, 0L, null, null, k2.i.a(j92.b.f97900c.f97910b), com.nimbusds.jose.shaded.gson.internal.a.c(mVar5), 0.0f, 0.0f, z3.f.c(744985285, new fb0.b(rVar2, sVar, p1Var3, p1Var2, 10), mVar5), mVar5, 48, 48, 1852);
                    d91.f fVar2 = sVar.f58586h;
                    if (fVar2 == null || (dVarA = fVar2.f58532b) == null) {
                        s62.a.f157643a.getClass();
                        dVarA = u4.a(t62.b.f162798a);
                    }
                    u4.d dVar2 = dVarA;
                    h4.d.f81522a.getClass();
                    r1.b.a(dVar2, null, null, h4.d.a.f81528f, null, null, z3.f.c(-1028125743, new a6.c(sVar, 8), mVar5), mVar5, 1575936, 54);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                ic1.l.a((ic1.m) obj6, (e23.a) obj5, (e23.a) obj3, (e23.l) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                x.c((Integer) obj6, (List) obj5, (h4.r) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 26:
                i53.c cVar3 = (i53.c) obj6;
                ArrayList arrayList = (ArrayList) obj5;
                p1 p1Var4 = (p1) obj3;
                e23.l lVar2 = (e23.l) obj4;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    i0 i0VarA = k0.a(0, 0, 3, mVar6);
                    Object objQ11 = mVar6.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                    if (objQ11 == c2565a3) {
                        objQ11 = p3.l0.j(t13.h.f161748a, mVar6);
                        mVar6.K(objQ11);
                    }
                    o53.b0 b0Var3 = (o53.b0) objQ11;
                    f82.b bVar5 = new f82.b();
                    boolean zR2 = mVar6.r(arrayList) | mVar6.B(p1Var4) | mVar6.B(lVar2);
                    Object objQ12 = mVar6.q();
                    if (zR2 || objQ12 == c2565a3) {
                        objQ12 = new gw1.c(arrayList, i17, lVar2, p1Var4);
                        mVar6.K(objQ12);
                    }
                    e82.a.b(cVar3, bVar5, i0VarA, null, null, (e23.p) objQ12, mVar6, 0, 24);
                    rl1.i iVar = (rl1.i) p1Var4.getF182175a();
                    boolean zR3 = mVar6.r(arrayList) | mVar6.B(p1Var4) | mVar6.r(b0Var3) | mVar6.B(i0VarA);
                    Object objQ13 = mVar6.q();
                    if (zR3 || objQ13 == c2565a3) {
                        objQ13 = new in1.k.a(arrayList, b0Var3, p1Var4, i0VarA, null);
                        mVar6.K(objQ13);
                    }
                    p3.l0.e((e23.p) objQ13, iVar, mVar6);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 27:
                e23.a aVar14 = (e23.a) obj6;
                p1 p1Var5 = (p1) obj5;
                ix.j jVar = (ix.j) obj3;
                Context context = (Context) obj4;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    if (((ix.l) p1Var5.getF182175a()).f95667g) {
                        mVar7.C(870003747);
                        String strQ = gl1.y.Q(mVar7, R.string.gcm_body_battery_lbl_body_battery);
                        boolean zB = mVar7.B(aVar14);
                        Object objQ14 = mVar7.q();
                        if (zB) {
                            objQ14 = new ii0.h(aVar14, 24);
                            mVar7.K(objQ14);
                        } else {
                            aVar.getClass();
                            if (objQ14 == p3.m.a.f135155b) {
                                objQ14 = new ii0.h(aVar14, 24);
                                mVar7.K(objQ14);
                            }
                        }
                        e23.a aVar15 = (e23.a) objQ14;
                        i53.f fVarA = i53.a.a(new i3("HELP", gl1.y.Q(mVar7, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        boolean zB2 = mVar7.B(p1Var5) | mVar7.r(jVar) | mVar7.r(context);
                        Object objQ15 = mVar7.q();
                        if (zB2) {
                            objQ15 = new gw1.d(context, i17, jVar, p1Var5);
                            mVar7.K(objQ15);
                        } else {
                            aVar.getClass();
                            if (objQ15 == p3.m.a.f135155b) {
                                objQ15 = new gw1.d(context, i17, jVar, p1Var5);
                                mVar7.K(objQ15);
                            }
                        }
                        z02.f.d(strQ, null, null, aVar15, fVarA, null, (e23.l) objQ15, mVar7, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                        mVar7.f();
                    } else {
                        mVar7.C(871355874);
                        mVar7.f();
                    }
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar16 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                ((com.garmin.android.apps.connectmobile.contacts.emergency.e) obj6).u6((e23.a) obj5, (e23.a) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                DateTime dateTime = (DateTime) obj6;
                DateTime dateTime2 = (DateTime) obj5;
                o82.g gVar2 = (o82.g) obj4;
                n61.f fVar3 = (n61.f) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    b81.c.a(dateTime, dateTime2, gVar2, fVar3, mVar8, n61.f.f123849h << 9);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i14, int i15) {
        this.f75956a = i15;
        this.f75957b = obj;
        this.f75958c = obj2;
        this.f75959d = obj3;
        this.f75960e = obj4;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f75956a = i14;
        this.f75957b = obj;
        this.f75958c = obj2;
        this.f75959d = obj3;
        this.f75960e = obj4;
    }

    public /* synthetic */ d(z42.i iVar, LocalDate localDate, LocalDate localDate2, e23.a aVar, int i14) {
        this.f75956a = 1;
        this.f75959d = iVar;
        this.f75957b = localDate;
        this.f75958c = localDate2;
        this.f75960e = aVar;
    }
}
