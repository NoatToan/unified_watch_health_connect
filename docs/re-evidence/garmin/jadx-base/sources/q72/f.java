package q72;

import android.content.Context;
import android.text.format.DateFormat;
import aq.j2;
import b63.v;
import c2.a0;
import c2.q;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity;
import cr.x;
import e23.l;
import e23.p;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import i3.fe;
import i3.i7;
import i3.mh;
import i3.q1;
import i3.r1;
import i3.s1;
import i3.wa;
import i3.xa;
import jy0.c0;
import l72.d3;
import l72.f0;
import l72.h3;
import l72.i3;
import nr.v0;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l1;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import p3.z1;
import qm.y;
import qr.t;
import qx1.o;
import r02.m;
import r22.e2;
import r53.p2;
import s5.x0;
import u1.w;
import v62.a8;
import v62.u5;
import yg2.i0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f143280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f143281c;

    public /* synthetic */ f(m mVar, b0 b0Var) {
        this.f143279a = 12;
        this.f143281c = mVar;
        this.f143280b = b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:169:0x0521  */
    /* JADX WARN: Code duplicated, block: B:189:0x0595  */
    /* JADX WARN: Code duplicated, block: B:18:0x007e  */
    /* JADX WARN: Code duplicated, block: B:226:0x072f  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:269:0x08ae  */
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
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14;
        int i15;
        Object value;
        int i16 = this.f143279a;
        int i17 = 9;
        int i18 = 6;
        p3.m.a aVar = p3.m.f135153a;
        boolean z14 = false;
        char c14 = 1;
        Object obj3 = this.f143281c;
        Object obj4 = this.f143280b;
        switch (i16) {
            case 0:
                b0 b0Var = (b0) obj4;
                p1 p1Var = (p1) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    s62.a.f157643a.getClass();
                    i53.f fVarA = i53.a.a(new i3("settings", "", false, a8.a(t62.b.f162798a), (String) null, 20, (j) null));
                    boolean zR = mVar.r(b0Var) | mVar.B(p1Var);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new ph1.d(i17, b0Var, p1Var);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ph1.d(i17, b0Var, p1Var);
                            mVar.K(objQ);
                        }
                    }
                    h3.f(null, "Reports Template", null, null, null, fVarA, null, (l) objQ, null, mVar, 262192, 349);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                Context context = (Context) obj4;
                sd2.f fVar = (sd2.f) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                q80.b bVar = q80.b.f143300a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    wf.f.a aVar2 = new wf.f.a(context);
                    aVar2.f184930c = fVar.getImageURL();
                    wf.g.a(aVar2);
                    wf.f fVarA2 = aVar2.a();
                    t4.d dVarA = n5.c.a(2131231969, mVar2, 0);
                    t4.d dVarA2 = n5.c.a(2131231969, mVar2, 0);
                    r.a aVar3 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    jf.r.b(fVarA2, "", x2.q(aVar3, j92.b.f97901d.f97906e), dVarA, dVarA2, null, null, null, null, null, null, null, mVar2, 48, 0, 32736);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                qc0.b.a((qc0.d) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                y yVar = (y) obj4;
                ep.e eVar = (ep.e) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    r.a aVar4 = r.S;
                    boolean zR2 = mVar3.r(yVar);
                    Object objQ2 = mVar3.q();
                    if (zR2) {
                        objQ2 = new q42.d(yVar, 11);
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new q42.d(yVar, 11);
                            mVar3.K(objQ2);
                        }
                    }
                    r rVarD = w.d(aVar4, false, null, null, (e23.a) objQ2, 15);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    r rVarC = k.c(rVarD, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar5);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar3);
                    u uVar = u.f22885a;
                    x.e(eVar, yVar.f145466b.getB1() == 94, mVar3, 0);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                t tVar = (t) obj4;
                ps.r rVar = (ps.r) obj3;
                String str = (String) obj;
                String str2 = (String) obj2;
                int i19 = t.A2;
                str.getClass();
                str2.getClass();
                tVar.X5(tVar.f146575z, new ps.r(null, null, tVar.f146541n.e(str, rVar != null ? rVar.h() : null, false), null, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, 262123, null), v0.NAME_AND_NOTE);
                return Unit.INSTANCE;
            case 5:
                qw1.b bVar3 = (qw1.b) obj4;
                a0 a0Var = (a0) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    String strValueOf = String.valueOf(bVar3.f148376b);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97928e, mVar4);
                    r.a aVar6 = r.S;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar7 = h4.d.a.f81537o;
                    mh.c(strValueOf, a0Var.b(aVar6, aVar7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar4, 0, 0, 131068);
                    mh.c(gl1.y.P(R.string.lbl_plan_progress, new Object[]{String.valueOf(bVar3.f148378d)}, mVar4), a0Var.b(aVar6, aVar7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar4), mVar4, 0, 0, 131068);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                qx.h.a((bx.a) obj4, (l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                qx.h.b(p0.t(1), (Integer) obj4, (String) obj3, (p3.m) obj);
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                qx0.b.a((qx0.d) obj4, (l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                o.a((mx1.f) obj4, (l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 10:
                dy1.h hVar = (dy1.h) obj4;
                p pVar = (p) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    boolean z15 = hVar.f61558c;
                    boolean z16 = z15 || hVar.f61561f;
                    boolean z17 = !z15;
                    r1 r1Var = r1.f89474a;
                    long jG = fb1.c.g(d92.b.f58623a, mVar5);
                    long j8 = d92.b.a(mVar5).f().f63508c;
                    r1Var.getClass();
                    q1 q1VarA = r1.a(jG, j8, mVar5, 58);
                    boolean zB = mVar5.B(pVar) | mVar5.B(hVar);
                    Object objQ3 = mVar5.q();
                    if (zB) {
                        objQ3 = new ph1.d(20, pVar, hVar);
                        mVar5.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ph1.d(20, pVar, hVar);
                            mVar5.K(objQ3);
                        }
                    }
                    s1.a(z16, (l) objQ3, null, z17, q1VarA, mVar5, 0, 36);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 11:
                sy0.j jVar = (sy0.j) obj4;
                MultiDayActivitiesEditActivity multiDayActivitiesEditActivity = (MultiDayActivitiesEditActivity) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                MultiDayActivitiesEditActivity.a aVar8 = MultiDayActivitiesEditActivity.f39291b;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    sy0.m mVar7 = jVar.f161231f;
                    boolean zR3 = mVar6.r(multiDayActivitiesEditActivity);
                    Object objQ4 = mVar6.q();
                    if (zR3) {
                        objQ4 = new qy0.f(multiDayActivitiesEditActivity, i18);
                        mVar6.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new qy0.f(multiDayActivitiesEditActivity, i18);
                            mVar6.K(objQ4);
                        }
                    }
                    c0.a(mVar7, (l) objQ4, mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 12:
                m mVar8 = (m) obj3;
                b0 b0Var2 = (b0) obj4;
                b5.a0 a0Var2 = (b5.a0) obj;
                n4.c cVar = (n4.c) obj2;
                boolean zH = mVar8.h();
                z1 z1Var = mVar8.f148902j;
                if (zH) {
                    ge1.b.T(b0Var2, null, null, new r02.i.c.C2808c(mVar8, cVar, a0Var2, null), 3);
                } else {
                    z1Var.i(z1Var.getFloatValue() + Float.intBitsToFloat((int) (cVar.f123544a & 4294967295L)));
                }
                return Unit.INSTANCE;
            case 13:
                v21.e eVar2 = (v21.e) obj4;
                p1 p1Var2 = (p1) obj3;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    String strR = eVar2.r((v) p1Var2.getF182175a());
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strR, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, mVar9), mVar9, 0, 0, 131070);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 14:
                v21.e eVar3 = (v21.e) obj4;
                v vVar = (v) obj3;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    String strR2 = eVar3.r(vVar);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strR2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, mVar10), mVar10, 0, 0, 131070);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 15:
                q11.a aVar9 = (q11.a) obj4;
                e23.a aVar10 = (e23.a) obj3;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    f0 f0Var = f0.f110999a;
                    int i24 = r11.m.a.f149398a[aVar9.ordinal()];
                    if (i24 == 1) {
                        i14 = -1028310948;
                        i15 = R.string.label_move;
                    } else if (i24 == 2) {
                        i14 = -1028307750;
                        i15 = R.string.lbl_copy;
                    } else {
                        if (i24 != 3) {
                            throw n23.j.m(mVar11, -1028313198);
                        }
                        i14 = -1028304548;
                        i15 = R.string.lbl_remove;
                    }
                    String strH = sn.a.h(mVar11, i14, i15, mVar11);
                    r rVarF = x2.f(r.S, 1.0f);
                    boolean zB2 = mVar11.B(aVar10);
                    Object objQ5 = mVar11.q();
                    if (zB2) {
                        objQ5 = new qk0.o(aVar10, 9);
                        mVar11.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new qk0.o(aVar10, 9);
                            mVar11.K(objQ5);
                        }
                    }
                    f0Var.d(384, 9, (e23.a) objQ5, rVarF, strH, mVar11, null, false);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                r12.e.a((r12.f) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 17:
                zc.d dVar = (zc.d) obj4;
                r12.f fVar2 = (r12.f) obj3;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    r12.f.b bVar4 = fVar2.f149417d;
                    s62.a.f157643a.getClass();
                    li0.p0.d(dVar, bVar4, u5.a(t62.b.f162798a), R.string.no_muted_users_title, Integer.valueOf(R.string.msg_no_muted_users_description), mVar12, 8 | (li0.f.f112658h << 3));
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                r22.i.b((com.garmin.android.apps.connectmobile.badges.service.model.r) obj4, (l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                com.garmin.android.apps.connectmobile.badges.service.model.r rVar2 = (com.garmin.android.apps.connectmobile.badges.service.model.r) obj4;
                com.garmin.android.apps.connectmobile.badges.service.model.r rVar3 = (com.garmin.android.apps.connectmobile.badges.service.model.r) obj3;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    if (rVar2 == rVar3) {
                        mVar13.C(1988795921);
                        b3.b.f15502a.getClass();
                        i7.b(d3.f.a(), null, null, ds.e0.b(d92.b.f58623a, mVar13), mVar13, 48, 4);
                        mVar13.f();
                    } else {
                        mVar13.C(1989065962);
                        mVar13.f();
                    }
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 20:
                e2 e2Var = (e2) obj4;
                l1 l1Var = (l1) obj3;
                p3.m mVar14 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    int i25 = e2Var.f149639a;
                    double d14 = e2Var.f149641c;
                    double d15 = e2Var.f149642d;
                    double d16 = e2Var.f149640b;
                    Object objQ6 = mVar14.q();
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new j2(l1Var, 8);
                        mVar14.K(objQ6);
                    }
                    g02.x1.a(null, null, null, null, i25, d14, d15, d16, (l) objQ6, mVar14, 100663296);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                r40.a.a((r) obj4, (r40.d) obj3, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 22:
                q42.h hVar2 = (q42.h) obj4;
                x3 x3Var = (x3) obj3;
                p3.m mVar15 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar15.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    DateTime dateTimeToday = ((LocalTime) x3Var.getF182175a()).toDateTimeToday(DateTimeZone.UTC);
                    dateTimeToday.getClass();
                    String strI = com.nimbusds.jose.shaded.gson.internal.a.i(DateFormat.is24HourFormat(hVar2.f142645a) ? "HH:mm" : "h:mm a", dateTimeToday);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strI, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, mVar15), mVar15, 0, 0, 131070);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 23:
                r42.d dVar2 = (r42.d) obj4;
                int iIntValue14 = ((Integer) obj).intValue();
                int iIntValue15 = ((Integer) obj2).intValue();
                ((p1) obj3).setValue(Boolean.FALSE);
                p2 p2Var = dVar2.f150326d;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, ((LocalTime) value).withHourOfDay(iIntValue14).withMinuteOfHour(iIntValue15)));
                dVar2.x4();
                return Unit.INSTANCE;
            case 24:
                fe feVar = (fe) obj4;
                m4.b0 b0Var3 = (m4.b0) obj3;
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    d3.b(feVar, m4.e.a(r.S, b0Var3), mVar16, 6, 0);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                r72.n.c((r72.i) obj4, (l) obj3, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 26:
                r72.c cVar2 = (r72.c) obj4;
                p1 p1Var3 = (p1) obj3;
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                    boolean z18 = ((r72.c) p1Var3.getF182175a()) == cVar2;
                    wa waVar = wa.f90116a;
                    d92.b.f58623a.getClass();
                    long jA = d92.b.a(mVar17).f().a();
                    waVar.getClass();
                    xa.a(z18, null, null, false, wa.a(jA, 0L, mVar17, 14), mVar17, 48, 44);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 27:
                h82.r rVar4 = (h82.r) obj4;
                final rg0.d dVar3 = (rg0.d) obj3;
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                int i26 = rg0.d.f152524f;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    boolean zR4 = mVar18.r(dVar3);
                    Object objQ7 = mVar18.q();
                    if (zR4) {
                        final char c15 = c14 == true ? 1 : 0;
                        objQ7 = new e23.a() { // from class: rg0.b
                            @Override // e23.a
                            public final Object invoke() {
                                int i27 = c15;
                                d dVar4 = dVar3;
                                switch (i27) {
                                    case 0:
                                        int i28 = d.f152524f;
                                        dVar4.e("ACCOUNTS_YOU_CAN_VIEW");
                                        break;
                                    default:
                                        int i29 = d.f152524f;
                                        dVar4.e("AUTHORIZED_VIEWERS");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar18.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            final int c16 = c14 == true ? 1 : 0;
                            objQ7 = new e23.a() { // from class: rg0.b
                                @Override // e23.a
                                public final Object invoke() {
                                    int i27 = c16;
                                    d dVar4 = dVar3;
                                    switch (i27) {
                                        case 0:
                                            int i28 = d.f152524f;
                                            dVar4.e("ACCOUNTS_YOU_CAN_VIEW");
                                            break;
                                        default:
                                            int i29 = d.f152524f;
                                            dVar4.e("AUTHORIZED_VIEWERS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar18.K(objQ7);
                        }
                    }
                    rVar4.B(R.string.authorized_viewers, null, false, (e23.a) objQ7, mVar18, 0, 6);
                    boolean zR5 = mVar18.r(dVar3);
                    Object objQ8 = mVar18.q();
                    if (zR5) {
                        final int i27 = z14 ? 1 : 0;
                        objQ8 = new e23.a() { // from class: rg0.b
                            @Override // e23.a
                            public final Object invoke() {
                                int i28 = i27;
                                d dVar4 = dVar3;
                                switch (i28) {
                                    case 0:
                                        int i29 = d.f152524f;
                                        dVar4.e("ACCOUNTS_YOU_CAN_VIEW");
                                        break;
                                    default:
                                        int i210 = d.f152524f;
                                        dVar4.e("AUTHORIZED_VIEWERS");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar18.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            final int i28 = z14 ? 1 : 0;
                            objQ8 = new e23.a() { // from class: rg0.b
                                @Override // e23.a
                                public final Object invoke() {
                                    int i29 = i28;
                                    d dVar4 = dVar3;
                                    switch (i29) {
                                        case 0:
                                            int i210 = d.f152524f;
                                            dVar4.e("ACCOUNTS_YOU_CAN_VIEW");
                                            break;
                                        default:
                                            int i211 = d.f152524f;
                                            dVar4.e("AUTHORIZED_VIEWERS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar18.K(objQ8);
                        }
                    }
                    rVar4.B(R.string.accounts_you_can_view, null, false, (e23.a) objQ8, mVar18, 0, 6);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                rg2.g.c((i0) obj4, (String) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                rk0.h.a((r) obj4, (jk0.j) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, int i14, int i15) {
        this.f143279a = i15;
        this.f143280b = obj;
        this.f143281c = obj2;
    }

    public /* synthetic */ f(int i14, Object obj, Object obj2) {
        this.f143279a = i14;
        this.f143280b = obj;
        this.f143281c = obj2;
    }
}
