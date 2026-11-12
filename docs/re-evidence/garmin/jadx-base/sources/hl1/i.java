package hl1;

import android.content.DialogInterface;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import gl1.y;
import h5.e0;
import i3.bf;
import i3.h7;
import l72.s0;
import l72.u0;
import l72.w;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f84401b;

    public /* synthetic */ i(e23.a aVar, int i14) {
        this.f84400a = i14;
        this.f84401b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0304  */
    /* JADX WARN: Code duplicated, block: B:130:0x0353  */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0420  */
    /* JADX WARN: Code duplicated, block: B:174:0x0478  */
    /* JADX WARN: Code duplicated, block: B:188:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:215:0x0574  */
    /* JADX WARN: Code duplicated, block: B:46:0x0137  */
    /* JADX WARN: Code duplicated, block: B:76:0x0202  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f84400a;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = 2;
        e23.a aVar2 = this.f84401b;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f84401b, null, y.Q(mVar, R.string.lbl_record_activity), mVar, null);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f84401b, null, y.Q(mVar2, R.string.select_a_technique), mVar2, null);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.c();
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarQ = x2.q(aVar3, j92.b.f97901d.f97905d);
                    boolean zB = mVar3.B(aVar2);
                    Object objQ = mVar3.q();
                    if (zB) {
                        objQ = new gt1.s(aVar2, 15);
                        mVar3.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new gt1.s(aVar2, 15);
                            mVar3.K(objQ);
                        }
                    }
                    ht1.a.f85531a.getClass();
                    h7.a((e23.a) objQ, rVarQ, false, null, null, ht1.a.f85532b, mVar3, 1572864, 60);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    Object objQ2 = mVar4.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new bf(24);
                        mVar4.K(objQ2);
                    }
                    h4.r rVarC = p5.v.c((e23.l) objQ2, aVar4, false);
                    i91.a.f92320a.getClass();
                    h7.a(this.f84401b, rVarC, false, null, null, i91.a.f92322c, mVar4, 1572864, 60);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    boolean zB2 = mVar5.B(aVar2);
                    Object objQ3 = mVar5.q();
                    if (zB2) {
                        objQ3 = new gt1.s(aVar2, 25);
                        mVar5.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new gt1.s(aVar2, 25);
                            mVar5.K(objQ3);
                        }
                    }
                    u0.a(null, null, null, null, (e23.a) objQ3, mVar5, 0, 15);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    String strQ = y.Q(mVar6, R.string.follower_setup_follower_approval_title);
                    boolean zB3 = mVar6.B(aVar2);
                    Object objQ4 = mVar6.q();
                    if (zB3) {
                        objQ4 = new ii0.h(aVar2, 2);
                        mVar6.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new ii0.h(aVar2, 2);
                            mVar6.K(objQ4);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ4, null, strQ, mVar6, null);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h4.r rVarC2 = wz1.i.c(h4.r.S, mVar7);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar7.getU());
                    i2 i2VarX = mVar7.x();
                    h4.r rVarC3 = h4.k.c(rVarC2, mVar7);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar5);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar7);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar7, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar7);
                    c2.u uVar = c2.u.f22885a;
                    String strQ2 = y.Q(mVar7, R.string.concept_discover_friends);
                    boolean zB4 = mVar7.B(aVar2);
                    Object objQ5 = mVar7.q();
                    if (zB4) {
                        objQ5 = new ii0.h(aVar2, 4);
                        mVar7.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new ii0.h(aVar2, 4);
                            mVar7.K(objQ5);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ5, null, strQ2, mVar7, null);
                    mVar7.y();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ik1.b.d(aVar2, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 9:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    String strQ3 = y.Q(mVar8, R.string.lbl_filter);
                    boolean zB5 = mVar8.B(aVar2);
                    Object objQ6 = mVar8.q();
                    if (zB5) {
                        objQ6 = new j22.d(aVar2, i16);
                        mVar8.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new j22.d(aVar2, i16);
                            mVar8.K(objQ6);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ6, null, strQ3, mVar8, null);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    String strQ4 = y.Q(mVar9, R.string.active_intelligence);
                    boolean zB6 = mVar9.B(aVar2);
                    Object objQ7 = mVar9.q();
                    if (zB6) {
                        objQ7 = new j22.d(aVar2, i15);
                        mVar9.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new j22.d(aVar2, i15);
                            mVar9.K(objQ7);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ7, null, strQ4, mVar9, null);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                jl1.f.c(aVar2, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                jl1.f.a(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                k62.b.c(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f84401b, null, y.Q(mVar10, R.string.concept_workouts), mVar10, null);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                k62.b.b(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(1 & iIntValue11, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f84401b, null, y.Q(mVar11, R.string.concept_workouts), mVar11, null);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(1 & iIntValue12, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    w wVar = w.f111301a;
                    String strQ5 = y.Q(mVar12, R.string.lbl_save);
                    boolean zB7 = mVar12.B(aVar2);
                    Object objQ8 = mVar12.q();
                    if (zB7) {
                        objQ8 = new j22.d(aVar2, 26);
                        mVar12.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new j22.d(aVar2, 26);
                            mVar12.K(objQ8);
                        }
                    }
                    wVar.j(0, (e23.a) objQ8, strQ5, mVar12);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                kh0.g.g(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                kh0.w.d(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                kh0.w.e(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar13.n(1 & iIntValue13, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f84401b, null, y.Q(mVar13, R.string.lbl_find_my_device), mVar13, null);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 22:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar14.n(1 & iIntValue14, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    String strQ6 = y.Q(mVar14, R.string.lbl_golf_course);
                    boolean zB8 = mVar14.B(aVar2);
                    Object objQ9 = mVar14.q();
                    if (zB8) {
                        objQ9 = new kb0.p(aVar2, 10);
                        mVar14.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new kb0.p(aVar2, 10);
                            mVar14.K(objQ9);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ9, null, strQ6, mVar14, null);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                kl0.b.f(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                kl0.b.a(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                gl.b.a(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                ky0.x1.a(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 27:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (mVar15.n(1 & iIntValue15, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f84401b, null, y.Q(mVar15, R.string.lbl_reschedule_workout), mVar15, null);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                l71.h.h(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    boolean zB9 = mVar16.B(aVar2);
                    Object objQ10 = mVar16.q();
                    if (zB9) {
                        objQ10 = new l72.t(aVar2, 9);
                        mVar16.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new l72.t(aVar2, 9);
                            mVar16.K(objQ10);
                        }
                    }
                    s0.f111243a.getClass();
                    h7.a((e23.a) objQ10, null, false, null, null, s0.f111245c, mVar16, 1572864, 62);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(e23.a aVar, int i14, int i15) {
        this.f84400a = i15;
        this.f84401b = aVar;
    }
}
