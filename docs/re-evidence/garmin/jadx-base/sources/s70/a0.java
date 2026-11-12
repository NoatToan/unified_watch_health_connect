package s70;

import android.content.DialogInterface;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f72.da;
import i3.h7;
import i3.i7;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import v62.b3;
import v62.x3;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f157647b;

    public /* synthetic */ a0(e23.a aVar, int i14) {
        this.f157646a = i14;
        this.f157647b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x033d  */
    /* JADX WARN: Code duplicated, block: B:135:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:151:0x0413  */
    /* JADX WARN: Code duplicated, block: B:174:0x049f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0560  */
    /* JADX WARN: Code duplicated, block: B:223:0x0661  */
    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x0123  */
    /* JADX WARN: Code duplicated, block: B:85:0x0238  */
    /* JADX WARN: Code duplicated, block: B:99:0x0290  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f157646a;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f157647b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                c0.b(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z.f157837a.getClass();
                    h7.a(this.f157647b, null, false, null, null, z.f157840d, mVar, 1572864, 62);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                si1.j.c(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 3:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f157647b, null, gl1.y.Q(mVar2, R.string.device_settings_inreach_plan_screen_title), mVar2, null);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97920e;
                    si1.q.b(0, 0, aVar2, c2.l.C(aVar3, f14, f14, f14, 0.0f, 8), mVar3);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    h4.r rVarD = c2.l.D(u1.a2.b(aVar4, u1.a2.a(mVar4), true));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar4, 0);
                    int iHashCode = Long.hashCode(mVar4.getU());
                    i2 i2VarX = mVar4.x();
                    h4.r rVarC = h4.k.c(rVarD, mVar4);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar5);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar4, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar4);
                    c2.b0 b0Var = c2.b0.f22601a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = x3.a(t62.b.f162798a);
                    String strQ = gl1.y.Q(mVar4, R.string.start_tracking_your_gear);
                    String strQ2 = gl1.y.Q(mVar4, R.string.add_gear_monitor_replace_more);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC2 = c2.l.C(aVar4, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                    String strQ3 = gl1.y.Q(mVar4, R.string.lbl_gear_add);
                    boolean zB = mVar4.B(aVar2);
                    Object objQ = mVar4.q();
                    if (zB) {
                        objQ = new sg0.q0(aVar2, 18);
                        mVar4.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new sg0.q0(aVar2, 18);
                            mVar4.K(objQ);
                        }
                    }
                    b82.n.d(dVarA, strQ, strQ2, rVarC2, strQ3, (e23.a) objQ, null, null, mVar4, 0, 192);
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = b3.a(t62.b.f162798a);
                    String strQ4 = gl1.y.Q(mVar5, R.string.lbl_edit);
                    long jA = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar5);
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58625c.getClass();
                    h4.r rVarQ = x2.q(aVar6, j92.b.f97901d.f97904c);
                    boolean zB2 = mVar5.B(aVar2);
                    Object objQ2 = mVar5.q();
                    if (zB2) {
                        objQ2 = new t21.a(aVar2, 11);
                        mVar5.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new t21.a(aVar2, 11);
                            mVar5.K(objQ2);
                        }
                    }
                    i7.b(dVarA2, strQ4, u1.w.d(rVarQ, false, null, null, (e23.a) objQ2, 15), jA, mVar5, 0, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    Integer numValueOf = Integer.valueOf(R.drawable.img_nutrition_setup_genesis_placeholder);
                    s62.a.f157643a.getClass();
                    b82.y0.c(numValueOf, da.a(t62.c.f162799a), gl1.y.Q(mVar6, R.string.track_your_nutrition), gl1.y.Q(mVar6, R.string.nutrition_introduction_description), gl1.y.Q(mVar6, R.string.set_up_nutrition), this.f157647b, null, mVar6, 0, 64);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    l72.f0 f0Var = l72.f0.f110999a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    String strQ5 = gl1.y.Q(mVar7, R.string.lbl_done);
                    boolean zB3 = mVar7.B(aVar2);
                    Object objQ3 = mVar7.q();
                    if (zB3) {
                        objQ3 = new t70.a1(aVar2, 7);
                        mVar7.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new t70.a1(aVar2, 7);
                            mVar7.K(objQ3);
                        }
                    }
                    f0Var.d(384, 9, (e23.a) objQ3, rVarF, strQ5, mVar7, null, false);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f157647b, null, gl1.y.Q(mVar8, R.string.lbl_device_settings_device_backup), mVar8, null);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    l72.f0 f0Var2 = l72.f0.f110999a;
                    String strQ6 = gl1.y.Q(mVar9, R.string.lbl_ok);
                    boolean zB4 = mVar9.B(aVar2);
                    Object objQ4 = mVar9.q();
                    if (zB4) {
                        objQ4 = new t70.a1(aVar2, 15);
                        mVar9.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new t70.a1(aVar2, 15);
                            mVar9.K(objQ4);
                        }
                    }
                    f0Var2.k(strQ6, null, false, (e23.a) objQ4, mVar9, 0, 6);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                oi0.c.a(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 12:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    p3.x1 x1Var10 = p3.n.f135158a;
                    l72.f0 f0Var3 = l72.f0.f110999a;
                    String strQ7 = gl1.y.Q(mVar10, R.string.lbl_cancel);
                    h4.r.a aVar7 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f15 = eVar.f97920e;
                    float f16 = 0;
                    g6.f.a aVar8 = g6.f.f75994b;
                    h4.r rVarB = c2.l.B(aVar7, f15, f16, f16, eVar.f97917b);
                    boolean zB5 = mVar10.B(aVar2);
                    Object objQ5 = mVar10.q();
                    if (zB5) {
                        objQ5 = new t70.a1(aVar2, 17);
                        mVar10.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new t70.a1(aVar2, 17);
                            mVar10.K(objQ5);
                        }
                    }
                    f0Var3.k(strQ7, rVarB, false, (e23.a) objQ5, mVar10, 0, 4);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(1 & iIntValue11, (iIntValue11 & 3) != 2)) {
                    p3.x1 x1Var11 = p3.n.f135158a;
                    l72.f0 f0Var4 = l72.f0.f110999a;
                    String strQ8 = gl1.y.Q(mVar11, R.string.lbl_cancel);
                    h4.r.a aVar9 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f17 = eVar2.f97920e;
                    float f18 = 0;
                    g6.f.a aVar10 = g6.f.f75994b;
                    h4.r rVarB2 = c2.l.B(aVar9, f17, f18, f18, eVar2.f97917b);
                    boolean zB6 = mVar11.B(aVar2);
                    Object objQ6 = mVar11.q();
                    if (zB6) {
                        objQ6 = new t70.a1(aVar2, 19);
                        mVar11.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new t70.a1(aVar2, 19);
                            mVar11.K(objQ6);
                        }
                    }
                    f0Var4.k(strQ8, rVarB2, false, (e23.a) objQ6, mVar11, 0, 4);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ((DialogInterface) obj).getClass();
                aVar2.invoke();
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                u72.c.b(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                u72.c.c(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 17:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(1 & iIntValue12, (iIntValue12 & 3) != 2)) {
                    p3.x1 x1Var12 = p3.n.f135158a;
                    l72.f0 f0Var5 = l72.f0.f110999a;
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    String strQ9 = gl1.y.Q(mVar12, R.string.lbl_skip_button);
                    boolean zB7 = mVar12.B(aVar2);
                    Object objQ7 = mVar12.q();
                    if (zB7) {
                        objQ7 = new u11.b(aVar2, 9);
                        mVar12.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new u11.b(aVar2, 9);
                            mVar12.K(objQ7);
                        }
                    }
                    f0Var5.i(strQ9, rVarF2, false, (e23.a) objQ7, mVar12, 48, 4);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar13.n(1 & iIntValue13, (iIntValue13 & 3) != 2)) {
                    p3.x1 x1Var13 = p3.n.f135158a;
                    l72.f0 f0Var6 = l72.f0.f110999a;
                    h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                    String strQ10 = gl1.y.Q(mVar13, R.string.view_tutorials_button);
                    boolean zB8 = mVar13.B(aVar2);
                    Object objQ8 = mVar13.q();
                    if (zB8) {
                        objQ8 = new u11.b(aVar2, 10);
                        mVar13.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new u11.b(aVar2, 10);
                            mVar13.K(objQ8);
                        }
                    }
                    f0Var6.d(384, 9, (e23.a) objQ8, rVarF3, strQ10, mVar13, null, false);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                uk0.h.e(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                uk0.h.f(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                uk0.h.c(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                uk0.h.b(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                ux1.j.f(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                ux1.j.e(aVar2, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 25:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar14.n(1 & iIntValue14, (iIntValue14 & 3) != 2)) {
                    p3.x1 x1Var14 = p3.n.f135158a;
                    c22.x0.f23314a.getClass();
                    z02.f.c(0, 54, null, this.f157647b, null, gl1.d.W(c22.x0.f23341b8), mVar14, null);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 26:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (mVar15.n(1 & iIntValue15, (iIntValue15 & 3) != 2)) {
                    p3.x1 x1Var15 = p3.n.f135158a;
                    String strQ11 = gl1.y.Q(mVar15, R.string.social_weekly_leaderboard);
                    boolean zB9 = mVar15.B(aVar2);
                    Object objQ9 = mVar15.q();
                    if (zB9) {
                        objQ9 = new ux1.g(aVar2, 21);
                        mVar15.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new ux1.g(aVar2, 21);
                            mVar15.K(objQ9);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ9, null, strQ11, mVar15, null);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 27:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar16.n(1 & iIntValue16, (iIntValue16 & 3) != 2)) {
                    p3.x1 x1Var16 = p3.n.f135158a;
                    String strQ12 = gl1.y.Q(mVar16, R.string.lbl_review_food);
                    boolean zB10 = mVar16.B(aVar2);
                    Object objQ10 = mVar16.q();
                    if (zB10) {
                        objQ10 = new ux1.g(aVar2, 27);
                        mVar16.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new ux1.g(aVar2, 27);
                            mVar16.K(objQ10);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ10, null, strQ12, mVar16, null);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 28:
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (mVar17.n(1 & iIntValue17, (iIntValue17 & 3) != 2)) {
                    p3.x1 x1Var17 = p3.n.f135158a;
                    l72.f0 f0Var7 = l72.f0.f110999a;
                    h4.r rVarF4 = x2.f(h4.r.S, 1.0f);
                    String strQ13 = gl1.y.Q(mVar17, R.string.log_food);
                    boolean zB11 = mVar17.B(aVar2);
                    Object objQ11 = mVar17.q();
                    if (zB11) {
                        objQ11 = new ux1.g(aVar2, 28);
                        mVar17.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new ux1.g(aVar2, 28);
                            mVar17.K(objQ11);
                        }
                    }
                    f0Var7.d(384, 9, (e23.a) objQ11, rVarF4, strQ13, mVar17, null, false);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    p3.x1 x1Var18 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f157647b, null, gl1.y.Q(mVar18, R.string.lbl_auto_detected_activity), mVar18, null);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a0(e23.a aVar, int i14, int i15) {
        this.f157646a = i15;
        this.f157647b = aVar;
    }
}
