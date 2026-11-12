package fp0;

import android.content.DialogInterface;
import android.widget.TextView;
import androidx.lifecycle.w1;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.contacts.edit.EditContactActivity;
import com.garmin.android.apps.connectmobile.fitness_age.presentation.FitnessAgeReportsActivity;
import com.garmin.android.apps.connectmobile.follow.domain.InviteFriendsActivity;
import cw.v;
import e23.p;
import ep0.a0;
import ep0.d0;
import fo1.o0;
import g02.p1;
import g81.t;
import gw0.u;
import h4.r;
import h5.e0;
import ho1.o;
import hq.r0;
import i3.c5;
import i3.e9;
import i3.ff;
import i3.g2;
import i3.hf;
import i3.i7;
import i3.mc;
import i3.mh;
import i3.pc;
import id0.f5;
import id0.n2;
import java.util.LinkedHashMap;
import java.util.Map;
import l3.e1;
import l72.f0;
import lc.m0;
import lc.u0;
import lc.v0;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.p0;
import p3.x1;
import pv0.w;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f73186b;

    public /* synthetic */ l(Object obj, int i14) {
        this.f73185a = i14;
        this.f73186b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:211:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:216:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:221:0x0613  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v113, types: [java.lang.Object, o13.l] */
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
        Integer num;
        Integer num2;
        Integer num3;
        String strP;
        int i14;
        int iH;
        pc pcVar;
        Object obj3;
        int i15 = this.f73185a;
        int i16 = 14;
        p3.m.a aVar = p3.m.f135153a;
        Object obj4 = null;
        iIntValue = 0;
        int iIntValue = 0;
        Object obj5 = this.f73186b;
        switch (i15) {
            case 0:
                d0 d0Var = (d0) obj5;
                p3.m mVar = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    a0 a0Var = d0Var.f64876e;
                    c02.h.c(a0Var != null ? a0Var.f64859a : null, a0Var != null ? a0Var.f64860b : null, null, mVar, 0, 4);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f fVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f) obj5;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f.f46045f;
                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    boolean zD4 = fVar.v6().D4();
                    boolean z14 = fVar.v6().f74014m;
                    fy1.d dVar = fVar.v6().f74018q;
                    fVar.u6(zD4, z14, dVar != null ? dVar.f73895f : 0, fVar.v6().f74019r, mVar2, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p1 p1Var = (p1) obj5;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar = h4.d.a.f81534l;
                    c2.j jVar = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97918c;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    r.a aVar3 = r.S;
                    s2 s2VarA = q2.a(iVarI, bVar, mVar3, 48);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    r rVarC = h4.k.c(aVar3, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar4);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar3);
                    u2 u2Var = u2.f22900a;
                    p<p3.m, Integer, Unit> pVar = p1Var.f74518b;
                    if (pVar == null) {
                        mVar3.C(968738355);
                        mVar3.f();
                    } else {
                        v.h.D(mVar3, 1832364942, pVar, mVar3, 0);
                    }
                    String str = p1Var.f74517a;
                    d92.b.f58624b.getClass();
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar3), mVar3, 0, 0, 131070);
                    p<p3.m, Integer, Unit> pVar2 = p1Var.f74519c;
                    if (pVar2 == null) {
                        mVar3.C(969025043);
                        mVar3.f();
                    } else {
                        v.h.D(mVar3, 1832374190, pVar2, mVar3, 0);
                    }
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                ((g3.f) obj5).f75599e.i(fFloatValue);
                return Unit.INSTANCE;
            case 4:
                g62.a0 a0Var2 = (g62.a0) obj5;
                m52.k kVar = (m52.k) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i17 = g62.a0.f76053l;
                kVar.getClass();
                int i18 = a0Var2.f76056h;
                if (i18 == iIntValue5) {
                    g62.e0 e0Var = a0Var2.f76057i;
                    if (e0Var == null) {
                        s.m("sportsLegAdapter");
                        throw null;
                    }
                    e0Var.notifyItemChanged(iIntValue5);
                    a0Var2.f76056h = -1;
                    a0Var2.f76055g = null;
                    TextView textView = a0Var2.f76058j;
                    if (textView != null) {
                        textView.setEnabled(false);
                        return Unit.INSTANCE;
                    }
                    s.m("actionButton");
                    throw null;
                }
                if (i18 > -1) {
                    g62.e0 e0Var2 = a0Var2.f76057i;
                    if (e0Var2 == null) {
                        s.m("sportsLegAdapter");
                        throw null;
                    }
                    e0Var2.notifyItemChanged(i18);
                }
                a0Var2.f76056h = iIntValue5;
                a0Var2.f76055g = kVar;
                TextView textView2 = a0Var2.f76058j;
                if (textView2 != null) {
                    textView2.setEnabled(true);
                    return Unit.INSTANCE;
                }
                s.m("actionButton");
                throw null;
            case 5:
                h61.a aVar5 = (h61.a) obj5;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    r.a aVar6 = r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar2, h4.d.a.f81536n, mVar4, 0);
                    int iHashCode2 = Long.hashCode(mVar4.getU());
                    i2 i2VarX2 = mVar4.x();
                    r rVarC2 = h4.k.c(aVar6, mVar4);
                    h5.g.V.getClass();
                    e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar7);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar4, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                    b0 b0Var = b0.f22601a;
                    String strQ = gl1.y.Q(mVar4, R.string.activities_training_effect_anaerobic_capacity);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97933j;
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar4), mVar4, 0, 0, 131070);
                    int iIntValue7 = (aVar5 == null || (num3 = aVar5.f82197b) == null) ? 0 : num3.intValue();
                    Integer num4 = aVar5 != null ? aVar5.f82200e : null;
                    gl.c.f77766a.getClass();
                    g70.c.c(iIntValue7, num4, gl.c.a(mVar4).k(), mVar4, 0);
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    c2.l.f(x2.h(aVar6, eVar.f97917b), mVar4);
                    mh.c(gl1.y.Q(mVar4, R.string.lbl_aerobic_capacity), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar4), mVar4, 0, 0, 131070);
                    g70.c.c((aVar5 == null || (num2 = aVar5.f82198c) == null) ? 0 : num2.intValue(), aVar5 != null ? aVar5.f82201f : null, gl.c.a(mVar4).i(), mVar4, 0);
                    c2.l.f(x2.h(aVar6, eVar.f97917b), mVar4);
                    mh.c(gl1.y.Q(mVar4, R.string.lbl_aerobic_endurance), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar4), mVar4, 0, 0, 131070);
                    if (aVar5 != null && (num = aVar5.f82199d) != null) {
                        iIntValue = num.intValue();
                    }
                    g70.c.c(iIntValue, aVar5 != null ? aVar5.f82202g : null, gl.c.a(mVar4).o(), mVar4, 0);
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 6:
                InviteFriendsActivity inviteFriendsActivity = (InviteFriendsActivity) obj5;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                InviteFriendsActivity.a aVar8 = InviteFriendsActivity.f35263d;
                if (mVar5.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    wn1.n nVar = (wn1.n) inviteFriendsActivity.f35266c.getValue();
                    String strValueOf = String.valueOf(inviteFriendsActivity.f35265b);
                    boolean zR = mVar5.r(inviteFriendsActivity);
                    Object objQ = mVar5.q();
                    if (zR) {
                        objQ = new InviteFriendsActivity.b(inviteFriendsActivity);
                        mVar5.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new InviteFriendsActivity.b(inviteFriendsActivity);
                            mVar5.K(objQ);
                        }
                    }
                    e23.a aVar9 = (e23.a) objQ;
                    boolean zR2 = mVar5.r(inviteFriendsActivity);
                    Object objQ2 = mVar5.q();
                    if (zR2) {
                        objQ2 = new InviteFriendsActivity.c(inviteFriendsActivity);
                        mVar5.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new InviteFriendsActivity.c(inviteFriendsActivity);
                            mVar5.K(objQ2);
                        }
                    }
                    e23.a aVar10 = (e23.a) ((k23.g) objQ2);
                    boolean zR3 = mVar5.r(inviteFriendsActivity);
                    Object objQ3 = mVar5.q();
                    if (zR3) {
                        objQ3 = new InviteFriendsActivity.d(inviteFriendsActivity);
                        mVar5.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new InviteFriendsActivity.d(inviteFriendsActivity);
                            mVar5.K(objQ3);
                        }
                    }
                    ao1.k.f(nVar, strValueOf, aVar9, aVar10, (e23.a) ((k23.g) objQ3), mVar5, wn1.n.f186263n);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 7:
                us1.k kVar3 = (us1.k) obj5;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    String strQ2 = gl1.y.Q(mVar6, kVar3.f172430a);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar6), mVar6, 0, 0, 131070);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 8:
                w wVar = (w) obj;
                pv0.y yVar = (pv0.y) obj2;
                wVar.getClass();
                yVar.getClass();
                qv0.a aVar11 = ((u) obj5).f79761b;
                int i19 = u.b.f79781a[wVar.ordinal()];
                if (i19 != 1) {
                    if ((i19 == 2 || i19 == 3) && (yVar instanceof pv0.y.b)) {
                        aVar11.f((pv0.y.b) yVar);
                    }
                } else if (yVar instanceof pv0.y.a) {
                    aVar11.h((pv0.y.a) yVar);
                }
                return Unit.INSTANCE;
            case 9:
                o51.c cVar = (o51.c) obj5;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    i7.a(n5.c.a(cVar.f129222d, mVar7, 0), null, null, fb1.c.g(d92.b.f58623a, mVar7), mVar7, 48, 4);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                h81.e.c((t) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                int i24 = h81.h.f82423h;
                ((h81.h) obj5).g((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                jo.c cVar2 = (jo.c) obj5;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    hf.a(s.g(((jo.c.AbstractC1918c) cVar2).f99727c, Boolean.TRUE), null, null, false, d92.c.a(ff.f88115a, mVar8), mVar8, 48, 92);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 13:
                ho.y yVar2 = (ho.y) obj5;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    boolean z15 = yVar2.f84695f;
                    Integer num5 = yVar2.f84693d;
                    if (z15) {
                        mVar9.C(-603147329);
                        f0.f110999a.l(null, 0L, mVar9, 0);
                        mVar9.f();
                    } else {
                        mVar9.C(-603040069);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarA = x0.a(j92.f.f97933j, d92.b.a(mVar9).k().c(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        long jC = yVar2.f84692c ? x0VarA.c() : o4.d0.c(0.5f, x0VarA.c(), 14);
                        if (num5 == null) {
                            mVar9.C(-602793341);
                            mVar9.f();
                        } else {
                            mVar9.C(-602793340);
                            int iIntValue13 = num5.intValue();
                            if (s.g(yVar2.f84694e, Boolean.TRUE)) {
                                mVar9.C(159981192);
                                mVar9.f();
                                strP = String.valueOf(iIntValue13);
                            } else {
                                mVar9.C(160060087);
                                strP = gl1.y.P(R.string.lbl_string_with_positive_sign_end, new Object[]{Integer.valueOf(iIntValue13)}, mVar9);
                                mVar9.f();
                            }
                            obj4 = strP;
                            mVar9.f();
                        }
                        if (obj4 == null) {
                            obj4 = "";
                        }
                        if (num5 == null || !yVar2.f84691b) {
                            i14 = R.string.message_show_all_activities;
                        } else {
                            i14 = num5.intValue() == 1 ? R.string.lbl_show_one_activity : R.string.lbl_show_count_activities;
                        }
                        String strP2 = gl1.y.P(i14, new Object[]{obj4}, mVar9);
                        x0 x0VarA2 = x0.a(x0VarA, jC, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        d6.h.f57752b.getClass();
                        int i25 = d6.h.f57755e;
                        d6.p.f57793b.getClass();
                        mh.c(strP2, null, 0L, null, 0L, null, 0L, d6.h.a(i25), 0L, d6.p.f57795d, false, 1, 0, null, x0VarA2, mVar9, 0, 24960, 109566);
                        mVar9.f();
                    }
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 14:
                ho1.l lVar = (ho1.l) obj5;
                w1 w1Var = lVar.f84815a;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                ho1.l.a aVar12 = ho1.l.f84814d;
                if (mVar10.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    int i26 = ho1.l.b.f84818a[((o) lVar.f84817c.getValue()).ordinal()];
                    if (i26 == 1) {
                        mVar10.C(-805294777);
                        ho1.n.c((o0) w1Var.getValue(), mVar10, 0);
                        mVar10.f();
                    } else if (i26 == 2) {
                        mVar10.C(-805291871);
                        ho1.n.a((o0) w1Var.getValue(), mVar10, 0);
                        mVar10.f();
                    } else {
                        if (i26 != 3) {
                            throw n23.j.m(mVar10, -805296484);
                        }
                        mVar10.C(-805289151);
                        ho1.n.b((o0) w1Var.getValue(), mVar10, 0);
                        mVar10.f();
                    }
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                hq.c.a((hq.e) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                LinkedHashMap linkedHashMap = ((com.garmin.android.apps.connectmobile.activities.stats.exercises.c) obj5).f29906y;
                r0 r0Var = (r0) obj;
                r0 r0Var2 = (r0) obj2;
                int i27 = com.garmin.android.apps.connectmobile.activities.stats.exercises.c.A;
                if (s.g(r0Var.f85141b, r0Var2.f85141b)) {
                    Integer num6 = (Integer) linkedHashMap.get(r0Var.f85140a.f41106e);
                    int iIntValue15 = num6 != null ? num6.intValue() : Integer.MAX_VALUE;
                    Integer num7 = (Integer) linkedHashMap.get(r0Var2.f85140a.f41106e);
                    iH = s.h(iIntValue15, num7 != null ? num7.intValue() : Integer.MAX_VALUE);
                } else {
                    Integer num8 = r0Var.f85141b;
                    int iIntValue16 = num8 != null ? num8.intValue() : Integer.MAX_VALUE;
                    Integer num9 = r0Var2.f85141b;
                    iH = s.h(iIntValue16, num9 != null ? num9.intValue() : Integer.MAX_VALUE);
                }
                return Integer.valueOf(iH);
            case 17:
                hs.a aVar13 = (hs.a) obj5;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    hs.g.b((qr.t) aVar13.f85306a.getValue(), mVar11, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                hs.e.a((r22.p1) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                i10.h hVar = (i10.h) obj5;
                Integer num10 = (Integer) obj;
                int iIntValue18 = num10.intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                hVar.f87062f = iIntValue18;
                if (zBooleanValue) {
                    hVar.f87061e.j(num10);
                }
                return Unit.INSTANCE;
            case 20:
                EditContactActivity editContactActivity = (EditContactActivity) obj5;
                ((Integer) obj2).getClass();
                EditContactActivity.a aVar14 = EditContactActivity.f32500n;
                ((DialogInterface) obj).getClass();
                editContactActivity.f32510j = false;
                editContactActivity.da().y4();
                return Unit.INSTANCE;
            case 21:
                g2 g2Var = (g2) obj5;
                ge1.b.T(g2Var.getCoroutineScope(), null, null, new g2.a.b(g2Var, (n4.c) obj2, null), 3);
                return Unit.INSTANCE;
            case 22:
                return (s1.f0) obj5;
            case 23:
                try {
                    ((c5) obj5).j((Long) obj, (Long) obj2);
                    break;
                } catch (IllegalArgumentException unused) {
                }
                return Unit.INSTANCE;
            case 24:
                mc mcVar = (mc) obj5;
                g6.m mVar12 = (g6.m) obj;
                float fI = g6.a.i(((g6.a) obj2).f75988a);
                l3.p0 p0Var = new l3.p0();
                p0Var.a(pc.Hidden, fI);
                if (((int) (mVar12.f76013a & 4294967295L)) > fI / 2 && !mcVar.f88992a) {
                    p0Var.a(pc.PartiallyExpanded, fI / 2.0f);
                }
                int i28 = (int) (mVar12.f76013a & 4294967295L);
                if (i28 != 0) {
                    p0Var.a(pc.Expanded, Math.max(0.0f, fI - i28));
                }
                Unit unit = Unit.INSTANCE;
                e1 e1Var = new e1(p0Var.f109381a);
                int i29 = e9.b.f87968a[((pc) mcVar.f88996e.f109326h.getF182175a()).ordinal()];
                if (i29 != 1) {
                    Map<T, Float> map = e1Var.f109228a;
                    if (i29 == 2) {
                        pcVar = pc.PartiallyExpanded;
                        if (!map.containsKey(pcVar)) {
                            pcVar = pc.Expanded;
                            if (!map.containsKey(pcVar)) {
                                pcVar = pc.Hidden;
                            }
                        }
                    } else {
                        if (i29 != 3) {
                            u0.r();
                            return null;
                        }
                        pcVar = pc.Expanded;
                        if (!map.containsKey(pcVar)) {
                            pcVar = pc.Hidden;
                        }
                    }
                } else {
                    pcVar = pc.Hidden;
                }
                return new o13.p(e1Var, pcVar);
            case 25:
                float fFloatValue2 = ((Float) obj2).floatValue();
                ((b5.a0) obj).a();
                ((p005kotlin.jvm.internal.o0) obj5).f105806a = fFloatValue2;
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                ic1.i.a aVar15 = ic1.i.f92620g;
                ((ic1.i) obj5).h((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 27:
                v vVar = (v) obj5;
                n2 n2Var = n2.f92856a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return vVar;
            case 28:
                com.garmin.android.apps.connectmobile.training.atp.biz.s sVar = (com.garmin.android.apps.connectmobile.training.atp.biz.s) obj5;
                f5 f5Var = f5.f92755a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return sVar;
            default:
                FitnessAgeReportsActivity fitnessAgeReportsActivity = (FitnessAgeReportsActivity) obj5;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                FitnessAgeReportsActivity.a aVar16 = FitnessAgeReportsActivity.f35216c;
                if (mVar13.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    m0 m0VarI = gl1.y.I(new v0[0], mVar13);
                    String str2 = com.garmin.android.apps.connectmobile.fitness_age.presentation.b.d.f35228b.f35224a;
                    boolean zR4 = mVar13.r(fitnessAgeReportsActivity) | mVar13.r(m0VarI);
                    Object objQ4 = mVar13.q();
                    if (zR4) {
                        obj3 = objQ4;
                        hy.h hVar2 = new hy.h(i16, fitnessAgeReportsActivity, m0VarI);
                        mVar13.K(hVar2);
                        obj3 = hVar2;
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            obj3 = objQ4;
                            hy.h hVar3 = new hy.h(i16, fitnessAgeReportsActivity, m0VarI);
                            mVar13.K(hVar3);
                            obj3 = hVar3;
                        }
                    }
                    obj3 = objQ4;
                    nc.y.b(m0VarI, str2, null, null, null, null, null, null, (e23.l) obj3, mVar13, 0, 1020);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l(Object obj, int i14, int i15) {
        this.f73185a = i15;
        this.f73186b = obj;
    }
}
