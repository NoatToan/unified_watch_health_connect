package w51;

import android.content.DialogInterface;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import i3.i7;
import i3.mh;
import l72.i3;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;
import u62.q4;
import v62.b3;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f182312b;

    public /* synthetic */ n0(e23.a aVar, int i14) {
        this.f182311a = i14;
        this.f182312b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025a  */
    /* JADX WARN: Code duplicated, block: B:150:0x047a  */
    /* JADX WARN: Code duplicated, block: B:164:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:179:0x0563  */
    /* JADX WARN: Code duplicated, block: B:198:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:203:0x062a  */
    /* JADX WARN: Code duplicated, block: B:218:0x067e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x0138  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c3  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f182311a;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f182312b;
        switch (i14) {
            case 0:
                boolean z14 = false;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if ((iIntValue & 3) != 2) {
                    z14 = true;
                }
                if (mVar.n(1 & iIntValue, z14)) {
                    x1 x1Var = p3.n.f135158a;
                    l72.f0.f110999a.i(gl1.y.Q(mVar, R.string.lbl_discard), x2.f(h4.r.S, 1.0f), false, this.f182312b, mVar, 48, 4);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.d(aVar3, 1.0f), vb.h.e(d92.b.f58623a, mVar2), m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81537o, mVar2, 54);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarE, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    l72.u0.a(b0Var.b(c2.l.D(aVar3), h4.d.a.f81538p), null, gl1.y.Q(mVar2, R.string.lbl_close), null, this.f182312b, mVar2, 0, 10);
                    s62.a.f157643a.getClass();
                    b82.n.c(f72.t.a(t62.c.f162799a), gl1.y.Q(mVar2, R.string.lbl_gc_plus_not_supported), gl1.y.Q(mVar2, R.string.msg_gc_plus_not_supported), null, null, mVar2, 0, 24);
                    c2.l.f(b0Var.a(aVar3, 1.0f, true), mVar2);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                w52.t0.a(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                w70.e.b(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                wa0.b.a(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 5:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    int i15 = b3.a.f15501a;
                    u4.d dVarA = c3.a.a();
                    boolean zB = mVar3.B(aVar2);
                    Object objQ = mVar3.q();
                    if (zB) {
                        objQ = new j(aVar2, 17);
                        mVar3.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new j(aVar2, 17);
                            mVar3.K(objQ);
                        }
                    }
                    wg2.l.c(dVarA, (e23.a) objQ, null, mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar4, R.string.pulse_ox_lbl_acclimation);
                    b.u uVar = (b.u) mVar4.A(g02.d.f74342a);
                    boolean zR = mVar4.r(uVar);
                    Object objQ2 = mVar4.q();
                    if (zR) {
                        objQ2 = new wl.e.a(uVar);
                        mVar4.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new wl.e.a(uVar);
                            mVar4.K(objQ2);
                        }
                    }
                    e23.a aVar5 = (e23.a) ((k23.g) objQ2);
                    i53.f fVarA = i53.a.a(new i3("menu_item_help", gl1.y.Q(mVar4, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB2 = mVar4.B(aVar2);
                    Object objQ3 = mVar4.q();
                    if (zB2) {
                        objQ3 = new rx1.m(aVar2, 22);
                        mVar4.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new rx1.m(aVar2, 22);
                            mVar4.K(objQ3);
                        }
                    }
                    z02.f.d(strQ, null, null, aVar5, fVarA, null, (e23.l) objQ3, mVar4, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                wn0.g.l(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                w13.b.a(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 9:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    t4.d dVarA2 = n5.c.a(R.drawable.ic_remove_red, mVar5, 0);
                    String strQ2 = gl1.y.Q(mVar5, R.string.lbl_delete);
                    o4.d0.f128823b.getClass();
                    long j8 = o4.d0.f128832k;
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarQ = x2.q(aVar6, j92.b.f97901d.f97903b);
                    boolean zB3 = mVar5.B(aVar2);
                    Object objQ4 = mVar5.q();
                    if (zB3) {
                        objQ4 = new j(aVar2, 26);
                        mVar5.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new j(aVar2, 26);
                            mVar5.K(objQ4);
                        }
                    }
                    i7.a(dVarA2, strQ2, u1.w.d(rVarQ, false, null, null, (e23.a) objQ4, 15), j8, mVar5, 3072, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 10:
                boolean z15 = false;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if ((iIntValue6 & 3) != 2) {
                    z15 = true;
                }
                if (mVar6.n(iIntValue6 & 1, z15)) {
                    x1 x1Var6 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA3 = b3.a(t62.b.f162798a);
                    String strQ3 = gl1.y.Q(mVar6, R.string.lbl_edit);
                    long jG = fb1.c.g(d92.b.f58623a, mVar6);
                    h4.r.a aVar7 = h4.r.S;
                    d92.b.f58625c.getClass();
                    h4.r rVarQ2 = x2.q(aVar7, j92.b.f97901d.f97903b);
                    boolean zB4 = mVar6.B(aVar2);
                    Object objQ5 = mVar6.q();
                    if (zB4) {
                        objQ5 = new j(aVar2, 27);
                        mVar6.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new j(aVar2, 27);
                            mVar6.K(objQ5);
                        }
                    }
                    i7.b(dVarA3, strQ3, u1.w.d(rVarQ2, false, null, null, (e23.a) objQ5, 15), jG, mVar6, 0, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 11:
                boolean z16 = false;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if ((iIntValue7 & 3) != 2) {
                    z16 = true;
                }
                if (mVar7.n(iIntValue7 & 1, z16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = c2.l.y(aVar8, j92.b.f97899b.f97918c);
                    boolean zB5 = mVar7.B(aVar2);
                    Object objQ6 = mVar7.q();
                    if (zB5) {
                        objQ6 = new wv0.v(aVar2, 1);
                        mVar7.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new wv0.v(aVar2, 1);
                            mVar7.K(objQ6);
                        }
                    }
                    l72.u0.a(rVarY, null, null, null, (e23.a) objQ6, mVar7, 0, 14);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    h4.r.a aVar9 = h4.r.S;
                    h4.r rVarD = x2.d(aVar9, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar10 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA2 = c2.y.a(c2.j.f22694d, aVar10, mVar8, 48);
                    int iHashCode2 = Long.hashCode(mVar8.getU());
                    i2 i2VarX2 = mVar8.x();
                    h4.r rVarC2 = h4.k.c(rVarD, mVar8);
                    h5.g.V.getClass();
                    h5.e0.a aVar11 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar11);
                    } else {
                        mVar8.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar8);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar8);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar8, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar8);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarC3 = c2.l.C(aVar9, 0.0f, eVar.f97923h, 0.0f, 0.0f, 13);
                    s62.a.f157643a.getClass();
                    g6.f.a aVar12 = g6.f.f75994b;
                    g02.i.a(rVarC3, q4.a(t62.a.f162797a), lc.u0.f(mVar8), d92.b.a(mVar8).e().g(), j92.b.f97901d.f97906e, 12, null, mVar8, 196608, 192);
                    h4.r rVarC4 = c2.l.C(aVar9, 0.0f, eVar.f97920e, 0.0f, eVar.f97918c, 5);
                    String strQ4 = gl1.y.Q(mVar8, R.string.lbl_nothing_to_see_here);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), mVar8);
                    d6.h.f57752b.getClass();
                    int i16 = d6.h.f57755e;
                    mh.c(strQ4, rVarC4, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB, mVar8, 0, 0, 130044);
                    mh.c(gl1.y.Q(mVar8, R.string.lbl_stp_training_plans_unable_to_load), null, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar8), mVar8, 0, 0, 130046);
                    l72.f0.f110999a.d(0, 9, this.f182312b, c2.l.C(aVar9, 0.0f, eVar.f97921f, 0.0f, 0.0f, 13), gl1.y.Q(mVar8, R.string.lbl_reload), mVar8, null, false);
                    mVar8.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f182312b, null, gl1.y.Q(mVar9, R.string.choose_a_focus_title), mVar9, null);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                x91.m.a(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 15:
                boolean z17 = false;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if ((iIntValue10 & 3) != 2) {
                    z17 = true;
                }
                if (mVar10.n(iIntValue10 & 1, z17)) {
                    x1 x1Var10 = p3.n.f135158a;
                    boolean zB6 = mVar10.B(aVar2);
                    Object objQ7 = mVar10.q();
                    if (zB6) {
                        objQ7 = new wv0.v(aVar2, 19);
                        mVar10.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new wv0.v(aVar2, 19);
                            mVar10.K(objQ7);
                        }
                    }
                    l72.u0.a(null, null, null, null, (e23.a) objQ7, mVar10, 0, 15);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f182312b, null, gl1.y.Q(mVar11, R.string.lbl_demographics_help), mVar11, null);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                xq0.b.a(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 18:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    String strQ5 = gl1.y.Q(mVar12, R.string.lbl_settings);
                    boolean zB7 = mVar12.B(aVar2);
                    Object objQ8 = mVar12.q();
                    if (zB7) {
                        objQ8 = new wv0.v(aVar2, 23);
                        mVar12.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new wv0.v(aVar2, 23);
                            mVar12.K(objQ8);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ8, null, strQ5, mVar12, null);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 19:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f182312b, null, gl1.y.Q(mVar13, R.string.lbl_what_i_do), mVar13, null);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 20:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    String strQ6 = gl1.y.Q(mVar14, R.string.lbl_subscriptions);
                    boolean zB8 = mVar14.B(aVar2);
                    Object objQ9 = mVar14.q();
                    if (zB8) {
                        objQ9 = new ya0.l(aVar2, 5);
                        mVar14.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new ya0.l(aVar2, 5);
                            mVar14.K(objQ9);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ9, null, strQ6, mVar14, null);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 21:
                boolean z18 = false;
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if ((iIntValue15 & 3) != 2) {
                    z18 = true;
                }
                if (mVar15.n(iIntValue15 & 1, z18)) {
                    x1 x1Var15 = p3.n.f135158a;
                    boolean zB9 = mVar15.B(aVar2);
                    Object objQ10 = mVar15.q();
                    if (zB9) {
                        objQ10 = new ya0.l(aVar2, 10);
                        mVar15.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new ya0.l(aVar2, 10);
                            mVar15.K(objQ10);
                        }
                    }
                    l72.u0.a(null, null, null, null, (e23.a) objQ10, mVar15, 0, 15);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                yr.f0.a(aVar2, (p3.m) obj, p3.p0.t(7));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                yu1.c.a(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 24:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                dialogInterface.getClass();
                dialogInterface.dismiss();
                aVar2.invoke();
                return Unit.INSTANCE;
            case 25:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    yz1.s.f(aVar2, mVar16, 0);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                yz1.s.f(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                z21.f.d(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                zo1.r0.e(aVar2, (p3.m) obj, p3.p0.t(7));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n0(e23.a aVar, int i14, int i15) {
        this.f182311a = i15;
        this.f182312b = aVar;
    }
}
