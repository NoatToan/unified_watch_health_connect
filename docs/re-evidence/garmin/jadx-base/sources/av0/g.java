package av0;

import android.app.Activity;
import android.content.Context;
import b82.o;
import c.w;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.g3;
import e23.l;
import e23.q;
import f5.z0;
import fw.p;
import gt1.j;
import gv0.a0;
import gv0.w0;
import gv0.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.d6;
import i3.fe;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import l72.c1;
import l72.f0;
import l72.u0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import s5.x0;
import v62.g0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13190a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f13196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f13197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f13198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f13199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f13200k;

    public /* synthetic */ g(Activity activity, l lVar, gv0.d dVar, y yVar, hl.a aVar, String str, String str2, pu0.b bVar, wd2.a aVar2, boolean z14) {
        this.f13193d = str;
        this.f13194e = aVar;
        this.f13195f = yVar;
        this.f13196g = bVar;
        this.f13191b = dVar;
        this.f13197h = lVar;
        this.f13198i = aVar2;
        this.f13199j = activity;
        this.f13192c = z14;
        this.f13200k = str2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0526  */
    /* JADX WARN: Code duplicated, block: B:102:0x052d  */
    /* JADX WARN: Code duplicated, block: B:104:0x056b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0571  */
    /* JADX WARN: Code duplicated, block: B:175:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:195:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:216:0x0963  */
    /* JADX WARN: Code duplicated, block: B:225:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:235:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:245:0x0ab8  */
    /* JADX WARN: Code duplicated, block: B:45:0x032c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0451  */
    /* JADX WARN: Code duplicated, block: B:80:0x045a  */
    /* JADX WARN: Code duplicated, block: B:81:0x045e  */
    /* JADX WARN: Code duplicated, block: B:86:0x047b  */
    /* JADX WARN: Code duplicated, block: B:89:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:91:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:92:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:97:0x04ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p1 p1Var;
        p1 p1Var2;
        h5.g.a.f fVar;
        z zVarA;
        int iHashCode;
        i2 i2VarX;
        r rVarC;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarX2;
        r rVarC2;
        boolean zB;
        Object objQ;
        String strQ;
        int i14 = this.f13190a;
        boolean z14 = this.f13192c;
        m.a aVar = m.f135153a;
        Object obj4 = this.f13200k;
        Object obj5 = this.f13199j;
        Object obj6 = this.f13198i;
        Object obj7 = this.f13191b;
        Object obj8 = this.f13193d;
        Object obj9 = this.f13197h;
        Object obj10 = this.f13196g;
        int i15 = 1;
        Object obj11 = this.f13195f;
        Object obj12 = this.f13194e;
        switch (i14) {
            case 0:
                p1 p1Var3 = (p1) obj8;
                gv0.d dVar = (gv0.d) obj7;
                e23.a aVar2 = (e23.a) obj9;
                b.g gVar = (b.g) obj6;
                c.q qVar = (c.q) obj5;
                uu0.c cVar = (uu0.c) obj4;
                p1 p1Var4 = (p1) obj12;
                p1 p1Var5 = (p1) obj11;
                p1 p1Var6 = (p1) obj10;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fe) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    if (((g3) p1Var3.getF182175a()).f35300a == p.SUCCESS) {
                        mVar.C(-726368238);
                        pu0.b bVar = (pu0.b) ((g3) p1Var3.getF182175a()).f35301b;
                        if (bVar == null) {
                            mVar.C(-1042578897);
                            mVar.f();
                        } else {
                            mVar.C(-1042578896);
                            g.h hVar = new g.h();
                            boolean zR = mVar.r(bVar) | mVar.r(dVar) | mVar.B(aVar2);
                            Object objQ2 = mVar.q();
                            if (zR) {
                                objQ2 = new a4.a(bVar, 8, aVar2, dVar);
                                mVar.K(objQ2);
                            } else {
                                aVar.getClass();
                                if (objQ2 == m.a.f135155b) {
                                    objQ2 = new a4.a(bVar, 8, aVar2, dVar);
                                    mVar.K(objQ2);
                                }
                            }
                            c.q qVarC = w.c(hVar, (l) objQ2, mVar, 0);
                            if (z14) {
                                mVar.C(-1582794602);
                                String strK = og.a.K(bVar);
                                if (d53.w.J(strK)) {
                                    mVar.C(-1581973505);
                                    mVar.f();
                                } else {
                                    mVar.C(-1582688489);
                                    boolean zR2 = mVar.r(gVar) | mVar.B(strK) | mVar.r(qVarC) | mVar.r(bVar) | mVar.r(dVar) | mVar.B(aVar2);
                                    Object objQ3 = mVar.q();
                                    if (zR2) {
                                        objQ3 = new h.e(gVar, strK, qVarC, aVar2, bVar, dVar, p1Var4, null);
                                        mVar.K(objQ3);
                                    } else {
                                        aVar.getClass();
                                        if (objQ3 == m.a.f135155b) {
                                            objQ3 = new h.e(gVar, strK, qVarC, aVar2, bVar, dVar, p1Var4, null);
                                            mVar.K(objQ3);
                                        }
                                    }
                                    l0.e((e23.p) objQ3, bVar, mVar);
                                    mVar.f();
                                }
                                mVar.f();
                                p1Var = p1Var5;
                                p1Var6 = p1Var6;
                            } else {
                                mVar.C(-1581810383);
                                boolean zR3 = mVar.r(bVar) | mVar.r(gVar) | mVar.r(qVarC) | mVar.r(dVar) | mVar.B(aVar2) | mVar.r(qVar) | mVar.r(cVar);
                                Object objQ4 = mVar.q();
                                if (zR3) {
                                    objQ4 = new c(bVar, qVar, cVar, gVar, qVarC, dVar, aVar2, p1Var5, p1Var4, p1Var6);
                                    p1Var = p1Var5;
                                    p1Var4 = p1Var4;
                                    mVar.K(objQ4);
                                } else {
                                    aVar.getClass();
                                    if (objQ4 == m.a.f135155b) {
                                        objQ4 = new c(bVar, qVar, cVar, gVar, qVarC, dVar, aVar2, p1Var5, p1Var4, p1Var6);
                                        p1Var = p1Var5;
                                        p1Var4 = p1Var4;
                                        mVar.K(objQ4);
                                    } else {
                                        p1Var = p1Var5;
                                    }
                                }
                                e2.c.b(null, null, null, null, null, null, false, null, (l) objQ4, mVar, 0, 511);
                                mVar.f();
                            }
                            if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                                mVar.C(-1577381847);
                                c1 c1Var = c1.f110940a;
                                String strQ2 = gl1.y.Q(mVar, R.string.failed_to_send_request_alert_title);
                                String strQ3 = gl1.y.Q(mVar, R.string.failed_to_send_sms_request_alert_message);
                                String strQ4 = gl1.y.Q(mVar, R.string.lbl_retry);
                                boolean zR4 = mVar.r(gVar) | mVar.r(qVarC) | mVar.r(bVar) | mVar.r(dVar) | mVar.B(aVar2);
                                Object objQ5 = mVar.q();
                                if (zR4) {
                                    objQ5 = new d(gVar, qVarC, aVar2, p1Var6, p1Var, bVar, dVar, p1Var4);
                                    mVar.K(objQ5);
                                } else {
                                    aVar.getClass();
                                    if (objQ5 == m.a.f135155b) {
                                        objQ5 = new d(gVar, qVarC, aVar2, p1Var6, p1Var, bVar, dVar, p1Var4);
                                        mVar.K(objQ5);
                                    }
                                }
                                e23.a<Unit> aVar3 = (e23.a) objQ5;
                                String strQ5 = gl1.y.Q(mVar, R.string.lbl_cancel);
                                Object objQ6 = mVar.q();
                                aVar.getClass();
                                if (objQ6 == m.a.f135155b) {
                                    objQ6 = new ak0.z(p1Var6, 8);
                                    mVar.K(objQ6);
                                }
                                c1Var.a(false, strQ2, strQ3, null, null, strQ4, false, false, aVar3, strQ5, (e23.a) objQ6, mVar, 0, 6, 217);
                                mVar.f();
                            } else {
                                mVar.C(-1575730849);
                                mVar.f();
                            }
                            mVar.f();
                        }
                        mVar.f();
                    } else {
                        mVar.C(-1035122187);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                String str = (String) obj8;
                hl.a aVar4 = (hl.a) obj12;
                y yVar = (y) obj11;
                pu0.b bVar2 = (pu0.b) obj10;
                gv0.d dVar2 = (gv0.d) obj7;
                l lVar = (l) obj9;
                wd2.a aVar5 = (wd2.a) obj6;
                Activity activity = (Activity) obj5;
                String str2 = (String) obj4;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fe) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    boolean zB2 = mVar2.B(str) | mVar2.r(aVar4) | mVar2.k(yVar == null ? -1 : yVar.ordinal()) | mVar2.r(bVar2) | mVar2.r(dVar2) | mVar2.B(lVar) | mVar2.r(aVar5) | mVar2.r(activity);
                    boolean z15 = this.f13192c;
                    boolean zH = zB2 | mVar2.h(z15) | mVar2.B(str2);
                    Object objQ7 = mVar2.q();
                    if (zH) {
                        objQ7 = new a0(activity, lVar, dVar2, yVar, aVar4, str, str2, bVar2, aVar5, z15);
                        mVar2.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == m.a.f135155b) {
                            objQ7 = new a0(activity, lVar, dVar2, yVar, aVar4, str, str2, bVar2, aVar5, z15);
                            mVar2.K(objQ7);
                        }
                    }
                    e2.c.b(null, null, null, null, null, null, false, null, (l) objQ7, mVar2, 0, 511);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                CustomLineChart customLineChart = (CustomLineChart) obj12;
                CustomBarChart customBarChart = (CustomBarChart) obj11;
                DateTime dateTime = (DateTime) obj10;
                DateTime dateTime2 = (DateTime) obj7;
                Context context = (Context) obj9;
                r0 r0Var = (r0) obj6;
                p1 p1Var7 = (p1) obj8;
                String str3 = (String) obj5;
                r0 r0Var2 = (r0) obj4;
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    g6.f.a aVar6 = g6.f.f75994b;
                    r rVarH = x2.h(x2.f(r.S, 1.0f), 350);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarC3 = c2.l.C(rVarH, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                    boolean z16 = this.f13192c;
                    boolean zH2 = mVar3.h(z16) | mVar3.r(customLineChart) | mVar3.r(customBarChart);
                    Object objQ8 = mVar3.q();
                    if (zH2) {
                        objQ8 = new ad0.f(z16, customLineChart, customBarChart, 8);
                        mVar3.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == m.a.f135155b) {
                            objQ8 = new ad0.f(z16, customLineChart, customBarChart, 8);
                            mVar3.K(objQ8);
                        }
                    }
                    p002j6.c.b((l) objQ8, rVarC3, new j(dateTime, dateTime2, z16, context, r0Var, p1Var7, str3, r0Var2), mVar3, 0, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                x3 x3Var = (x3) obj11;
                gv0.d dVar3 = (gv0.d) obj7;
                yu0.f fVar2 = (yu0.f) obj10;
                yu0.d dVar4 = (yu0.d) obj6;
                e23.a aVar7 = (e23.a) obj9;
                l lVar2 = (l) obj5;
                e23.a aVar8 = (e23.a) obj4;
                p1 p1Var8 = (p1) obj8;
                p1 p1Var9 = (p1) obj12;
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((fe) obj).getClass();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    r.a aVar9 = r.S;
                    r rVarD = x2.d(aVar9, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    r rVarC4 = c2.l.C(rVarD, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = c2.y.a(kVar, h4.d.a.f81536n, mVar4, 0);
                    int iHashCode3 = Long.hashCode(mVar4.getU());
                    i2 i2VarX3 = mVar4.x();
                    r rVarC5 = k.c(rVarC4, mVar4);
                    h5.g.V.getClass();
                    e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar10);
                    } else {
                        mVar4.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA2, mVar4);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX3, mVar4);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar4, iHashCode3, bVar3);
                    }
                    h5.g.a.f fVar3 = h5.g.a.f81807d;
                    b4.c(fVar3, rVarC5, mVar4);
                    r rVarA = b0.f22601a.a(x2.f(aVar9, 1.0f), 1.0f, true);
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode4 = Long.hashCode(mVar4.getU());
                    i2 i2VarX4 = mVar4.x();
                    r rVarC6 = k.c(rVarA, mVar4);
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar10);
                    } else {
                        mVar4.c();
                    }
                    b4.c(eVar2, z0VarD, mVar4);
                    b4.c(c1623g, i2VarX4, mVar4);
                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar4, iHashCode4, bVar3);
                    }
                    b4.c(fVar3, rVarC6, mVar4);
                    u uVar = u.f22885a;
                    Object objQ9 = mVar4.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ9 == c2565a) {
                        objQ9 = new jt1.h(p1Var8, 6);
                        mVar4.K(objQ9);
                    }
                    e23.a aVar11 = (e23.a) objQ9;
                    Object objQ10 = mVar4.q();
                    if (objQ10 == c2565a) {
                        objQ10 = new jt1.h(p1Var8, 7);
                        mVar4.K(objQ10);
                    }
                    e23.a aVar12 = (e23.a) objQ10;
                    boolean zB3 = mVar4.B(aVar7);
                    Object objQ11 = mVar4.q();
                    if (zB3 || objQ11 == c2565a) {
                        objQ11 = new j22.d(aVar7, 12);
                        mVar4.K(objQ11);
                    }
                    w0.b(dVar3, fVar2, this.f13192c, dVar4, aVar11, aVar12, (e23.a) objQ11, lVar2, aVar8, mVar4, 221568);
                    mVar4.y();
                    f0 f0Var = f0.f110999a;
                    String strQ6 = gl1.y.Q(mVar4, R.string.onboarding_device_setup_title);
                    r rVarA2 = c2.l.A(x2.f(aVar9, 1.0f), eVar.f97920e, 0.0f, 2);
                    boolean zB4 = mVar4.B(x3Var) | mVar4.r(dVar3);
                    Object objQ12 = mVar4.q();
                    if (zB4 || objQ12 == c2565a) {
                        objQ12 = new d6(dVar3, 23, x3Var, p1Var9);
                        mVar4.K(objQ12);
                    }
                    f0Var.d(0, 9, (e23.a) objQ12, rVarA2, strQ6, mVar4, null, false);
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                ArrayList arrayList = (ArrayList) obj12;
                a03.p pVar = (a03.p) obj11;
                ph1.d dVar5 = (ph1.d) obj10;
                po.c cVar2 = (po.c) obj7;
                String str4 = (String) obj6;
                e23.a aVar13 = (e23.a) obj9;
                String str5 = (String) obj5;
                String str6 = (String) obj4;
                p1 p1Var10 = (p1) obj8;
                m mVar5 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = n.f135158a;
                    r.a aVar14 = r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode5 = Long.hashCode(mVar5.getU());
                    i2 i2VarX5 = mVar5.x();
                    r rVarC7 = k.c(aVar14, mVar5);
                    h5.g.V.getClass();
                    e0.a aVar15 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar15);
                    } else {
                        mVar5.c();
                    }
                    h5.g.a.e eVar3 = h5.g.a.f81810g;
                    b4.c(eVar3, z0VarD2, mVar5);
                    h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                    b4.c(c1623g2, i2VarX5, mVar5);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar5.getT()) {
                        p1Var2 = p1Var10;
                    } else {
                        p1Var2 = p1Var10;
                        if (!s.g(mVar5.q(), Integer.valueOf(iHashCode5))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC7, mVar5);
                        u uVar2 = u.f22885a;
                        c2.j.f22691a.getClass();
                        zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar5, 0);
                        iHashCode = Long.hashCode(mVar5.getU());
                        i2VarX = mVar5.x();
                        rVarC = k.c(aVar14, mVar5);
                        if (mVar5.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar5.z();
                        if (mVar5.getT()) {
                            mVar5.M(aVar15);
                        } else {
                            mVar5.c();
                        }
                        b4.c(eVar3, zVarA, mVar5);
                        b4.c(c1623g2, i2VarX, mVar5);
                        if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar5, iHashCode, bVar4);
                        }
                        b4.c(fVar, rVarC, mVar5);
                        b0 b0Var = b0.f22601a;
                        float f14 = 0;
                        g6.f.a aVar16 = g6.f.f75994b;
                        h4.g.b bVar5 = h4.d.a.f81534l;
                        c2.j.g gVar2 = c2.j.f22698h;
                        r rVarE = u1.n.e(x2.f(aVar14, 1.0f), p6.b.a(d92.b.f58623a, mVar5), k2.i.c(f14, f14, 0.0f, 0.0f, 12));
                        s2VarA = q2.a(gVar2, bVar5, mVar5, 54);
                        iHashCode2 = Long.hashCode(mVar5.getU());
                        i2VarX2 = mVar5.x();
                        rVarC2 = k.c(rVarE, mVar5);
                        if (mVar5.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar5.z();
                        if (mVar5.getT()) {
                            mVar5.M(aVar15);
                        } else {
                            mVar5.c();
                        }
                        b4.c(eVar3, s2VarA, mVar5);
                        b4.c(c1623g2, i2VarX2, mVar5);
                        if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar5, iHashCode2, bVar4);
                        }
                        b4.c(fVar, rVarC2, mVar5);
                        l72.w.a.f111302a.c(u2.f22900a, str4, null, z3.f.c(-592239564, new o(str5, str6, 27), mVar5), mVar5, 3078, 2);
                        r rVarY = c2.l.y(aVar14, 8);
                        zB = mVar5.B(aVar13);
                        objQ = mVar5.q();
                        if (zB) {
                            objQ = new pf0.j(aVar13, 13);
                            mVar5.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new pf0.j(aVar13, 13);
                                mVar5.K(objQ);
                            }
                        }
                        u0.a(rVarY, null, null, null, (e23.a) objQ, mVar5, 6, 14);
                        mVar5.y();
                        po.r.c(arrayList, (a03.y) p1Var2.getF182175a(), pVar, dVar5, this.f13192c, cVar2, mVar5, 0);
                        mVar5.y();
                        mVar5.y();
                    }
                    v.h.z(iHashCode5, mVar5, iHashCode5, bVar4);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC7, mVar5);
                    u uVar3 = u.f22885a;
                    c2.j.f22691a.getClass();
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar5, 0);
                    iHashCode = Long.hashCode(mVar5.getU());
                    i2VarX = mVar5.x();
                    rVarC = k.c(aVar14, mVar5);
                    if (mVar5.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar15);
                    } else {
                        mVar5.c();
                    }
                    b4.c(eVar3, zVarA, mVar5);
                    b4.c(c1623g2, i2VarX, mVar5);
                    if (mVar5.getT()) {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar4);
                    } else {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar4);
                    }
                    b4.c(fVar, rVarC, mVar5);
                    b0 b0Var2 = b0.f22601a;
                    float f15 = 0;
                    g6.f.a aVar17 = g6.f.f75994b;
                    h4.g.b bVar6 = h4.d.a.f81534l;
                    c2.j.g gVar3 = c2.j.f22698h;
                    r rVarE2 = u1.n.e(x2.f(aVar14, 1.0f), p6.b.a(d92.b.f58623a, mVar5), k2.i.c(f15, f15, 0.0f, 0.0f, 12));
                    s2VarA = q2.a(gVar3, bVar6, mVar5, 54);
                    iHashCode2 = Long.hashCode(mVar5.getU());
                    i2VarX2 = mVar5.x();
                    rVarC2 = k.c(rVarE2, mVar5);
                    if (mVar5.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar15);
                    } else {
                        mVar5.c();
                    }
                    b4.c(eVar3, s2VarA, mVar5);
                    b4.c(c1623g2, i2VarX2, mVar5);
                    if (mVar5.getT()) {
                        v.h.z(iHashCode2, mVar5, iHashCode2, bVar4);
                    } else {
                        v.h.z(iHashCode2, mVar5, iHashCode2, bVar4);
                    }
                    b4.c(fVar, rVarC2, mVar5);
                    l72.w.a.f111302a.c(u2.f22900a, str4, null, z3.f.c(-592239564, new o(str5, str6, 27), mVar5), mVar5, 3078, 2);
                    r rVarY2 = c2.l.y(aVar14, 8);
                    zB = mVar5.B(aVar13);
                    objQ = mVar5.q();
                    if (zB) {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new pf0.j(aVar13, 13);
                            mVar5.K(objQ);
                        }
                    } else {
                        objQ = new pf0.j(aVar13, 13);
                        mVar5.K(objQ);
                    }
                    u0.a(rVarY2, null, null, null, (e23.a) objQ, mVar5, 6, 14);
                    mVar5.y();
                    po.r.c(arrayList, (a03.y) p1Var2.getF182175a(), pVar, dVar5, this.f13192c, cVar2, mVar5, 0);
                    mVar5.y();
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            default:
                o90.a aVar18 = (o90.a) obj12;
                String str7 = (String) obj11;
                i53.c cVar3 = (i53.c) obj10;
                e23.a aVar19 = (e23.a) obj9;
                p1 p1Var11 = (p1) obj8;
                o53.b0 b0Var3 = (o53.b0) obj7;
                mc mcVar = (mc) obj6;
                e23.p pVar2 = (e23.p) obj5;
                Context context2 = (Context) obj4;
                c2.a0 a0Var = (c2.a0) obj;
                m mVar6 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                a0Var.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(a0Var) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var6 = n.f135158a;
                    r.a aVar20 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarQ = x2.q(aVar20, j92.b.f97901d.f97908g);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar21 = h4.d.a.f81537o;
                    da0.f.e(aVar18, a0Var.b(rVarQ, aVar21), mVar6, 0);
                    String strQ7 = gl1.y.Q(mVar6, R.string.lbl_troubleshooting);
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar6);
                    d6.h.f57752b.getClass();
                    int i16 = d6.h.f57755e;
                    j92.e eVar4 = j92.b.f97899b;
                    float f16 = eVar4.f97921f;
                    float f17 = eVar4.f97920e;
                    mh.c(strQ7, a0Var.b(c2.l.C(aVar20, 0.0f, f16, 0.0f, 0.0f, 13), aVar21), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB, mVar6, 0, 0, 130044);
                    mh.c(g22.n.g(str7), a0Var.b(c2.l.C(x2.f(aVar20, 1.0f), 0.0f, eVar4.f97916a, 0.0f, 0.0f, 13), aVar21), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97927d, mVar6), mVar6, 0, 0, 130044);
                    String strQ8 = gl1.y.Q(mVar6, R.string.golf_lbl_searching);
                    x0 x0Var = j92.f.f97933j;
                    mh.c(strQ8, c2.l.A(x2.f(c2.l.C(aVar20, 0.0f, eVar4.f97920e, 0.0f, 0.0f, 13), 1.0f), f17, 0.0f, 2), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar6), mVar6, 0, 0, 130044);
                    mh.c(gl1.y.Q(mVar6, R.string.smart_troubleshooting_having_trouble_locating), c2.l.A(x2.f(aVar20, 1.0f), f17, 0.0f, 2), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar6), mVar6, 0, 0, 130044);
                    if (z14) {
                        mVar6.C(-1085502193);
                        mVar6.f();
                    } else {
                        mVar6.C(-1085934116);
                        l72.s sVar = l72.s.f111232a;
                        r rVarC8 = c2.l.C(c2.l.A(x2.f(aVar20, 1.0f), f17, 0.0f, 2), 0.0f, eVar4.f97921f, 0.0f, 0.0f, 13);
                        l72.s.b bVar7 = l72.s.b.ALERT;
                        String strQ9 = gl1.y.Q(mVar6, R.string.bluetooth_is_off);
                        s62.a.f157643a.getClass();
                        sVar.d(rVarC8, bVar7, g0.a(t62.b.f162798a), strQ9, null, null, null, null, mVar6, 48, 496);
                        mVar6.f();
                    }
                    mh.c(gl1.y.Q(mVar6, R.string.lbl_try_these_first), c2.l.A(c2.l.C(x2.f(aVar20, 1.0f), 0.0f, eVar4.f97920e, 0.0f, 0.0f, 13), f17, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar6), mVar6, 0, 0, 131068);
                    r rVarY3 = c2.l.y(x2.f(aVar20, 1.0f), f17);
                    c2.j.f22691a.getClass();
                    z zVarA3 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar6, 0);
                    int iHashCode6 = Long.hashCode(mVar6.getU());
                    i2 i2VarX6 = mVar6.x();
                    r rVarC9 = k.c(rVarY3, mVar6);
                    h5.g.V.getClass();
                    e0.a aVar22 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar22);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX6, mVar6);
                    h5.g.a.b bVar8 = h5.g.a.f81813j;
                    if (mVar6.getT() || !s.g(mVar6.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar6, iHashCode6, bVar8);
                    }
                    b4.c(h5.g.a.f81807d, rVarC9, mVar6);
                    b0 b0Var4 = b0.f22601a;
                    mVar6.C(376271517);
                    Iterator it = cVar3.iterator();
                    int i17 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            x.q();
                            throw null;
                        }
                        nv.e eVar5 = (nv.e) next;
                        r.a aVar23 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        r rVarA3 = c2.l.A(aVar23, 0.0f, j92.b.f97899b.f97918c, i15);
                        int i19 = eVar5.f127940a;
                        Integer num = eVar5.f127941b;
                        String strQ10 = gl1.y.Q(mVar6, i19);
                        if (num != null) {
                            mVar6.C(-1411353096);
                            strQ = gl1.y.Q(mVar6, num.intValue());
                            mVar6.f();
                        } else {
                            mVar6.C(-1411237652);
                            mVar6.f();
                            strQ = null;
                        }
                        boolean zK = mVar6.k(eVar5.ordinal()) | mVar6.B(aVar19) | mVar6.B(p1Var11) | mVar6.r(b0Var3) | mVar6.B(mcVar) | mVar6.B(pVar2) | mVar6.r(context2);
                        Iterator it3 = it;
                        Object objQ13 = mVar6.q();
                        if (zK) {
                            objQ13 = new a11.p(eVar5, aVar19, b0Var3, context2, p1Var11, mcVar, pVar2);
                            mVar6.K(objQ13);
                        } else {
                            aVar.getClass();
                            if (objQ13 == m.a.f135155b) {
                                objQ13 = new a11.p(eVar5, aVar19, b0Var3, context2, p1Var11, mcVar, pVar2);
                                mVar6.K(objQ13);
                            }
                        }
                        nv.d.a(rVarA3, i18, strQ10, strQ, (e23.a) objQ13, mVar6, 0, 0);
                        it = it3;
                        i17 = i18;
                        i15 = 1;
                    }
                    mVar6.f();
                    mVar6.y();
                    x1 x1Var7 = n.f135158a;
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(ArrayList arrayList, a03.p pVar, ph1.d dVar, boolean z14, po.c cVar, String str, e23.a aVar, String str2, String str3, p1 p1Var) {
        this.f13194e = arrayList;
        this.f13195f = pVar;
        this.f13196g = dVar;
        this.f13192c = z14;
        this.f13191b = cVar;
        this.f13198i = str;
        this.f13197h = aVar;
        this.f13199j = str2;
        this.f13200k = str3;
        this.f13193d = p1Var;
    }

    public /* synthetic */ g(o90.a aVar, String str, boolean z14, i53.c cVar, e23.a aVar2, p1 p1Var, o53.b0 b0Var, mc mcVar, e23.p pVar, Context context) {
        this.f13194e = aVar;
        this.f13195f = str;
        this.f13192c = z14;
        this.f13196g = cVar;
        this.f13197h = aVar2;
        this.f13193d = p1Var;
        this.f13191b = b0Var;
        this.f13198i = mcVar;
        this.f13199j = pVar;
        this.f13200k = context;
    }

    public /* synthetic */ g(p1 p1Var, gv0.d dVar, e23.a aVar, boolean z14, b.g gVar, c.q qVar, uu0.c cVar, p1 p1Var2, p1 p1Var3, p1 p1Var4) {
        this.f13193d = p1Var;
        this.f13191b = dVar;
        this.f13197h = aVar;
        this.f13192c = z14;
        this.f13198i = gVar;
        this.f13199j = qVar;
        this.f13200k = cVar;
        this.f13194e = p1Var2;
        this.f13195f = p1Var3;
        this.f13196g = p1Var4;
    }

    public /* synthetic */ g(p1 p1Var, gv0.d dVar, yu0.f fVar, boolean z14, yu0.d dVar2, e23.a aVar, l lVar, e23.a aVar2, p1 p1Var2, p1 p1Var3) {
        this.f13195f = p1Var;
        this.f13191b = dVar;
        this.f13196g = fVar;
        this.f13192c = z14;
        this.f13198i = dVar2;
        this.f13197h = aVar;
        this.f13199j = lVar;
        this.f13200k = aVar2;
        this.f13193d = p1Var2;
        this.f13194e = p1Var3;
    }

    public /* synthetic */ g(boolean z14, CustomLineChart customLineChart, CustomBarChart customBarChart, DateTime dateTime, DateTime dateTime2, Context context, r0 r0Var, p1 p1Var, String str, r0 r0Var2) {
        this.f13192c = z14;
        this.f13194e = customLineChart;
        this.f13195f = customBarChart;
        this.f13196g = dateTime;
        this.f13191b = dateTime2;
        this.f13197h = context;
        this.f13198i = r0Var;
        this.f13193d = p1Var;
        this.f13199j = str;
        this.f13200k = r0Var2;
    }
}
