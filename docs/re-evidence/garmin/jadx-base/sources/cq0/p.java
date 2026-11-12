package cq0;

import a03.h0;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import ca0.v0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.ui.ElectronicShiftingDataActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.WorkoutActivityProfileSelectionActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.C;
import cw1.q0;
import ew1.m0;
import h5.e0;
import i3.h1;
import i3.mh;
import l72.f0;
import l72.i3;
import l72.u0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import s5.x0;
import v62.d9;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f55165b;

    public /* synthetic */ p(e23.a aVar, int i14) {
        this.f55164a = i14;
        this.f55165b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:133:0x043b  */
    /* JADX WARN: Code duplicated, block: B:224:0x0695  */
    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:238:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:254:0x075b  */
    /* JADX WARN: Code duplicated, block: B:279:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:54:0x0164  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e2  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f55164a;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f55165b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    f0.f110999a.d(384, 9, this.f55165b, x2.f(h4.r.S, 1.0f), gl1.y.Q(mVar, R.string.lbl_done), mVar, null, false);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (aVar2 == null) {
                        mVar2.C(1373246067);
                        f0 f0Var = f0.f110999a;
                        h4.r.a aVar3 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f0Var.g(0, 2, 0L, c2.l.y(aVar3, j92.b.f97899b.f97918c), mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(1373466136);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ElectronicShiftingDataActivity.a aVar4 = ElectronicShiftingDataActivity.f29955b;
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar3, R.string.lbl_electronic_shifting);
                    boolean zB = mVar3.B(aVar2);
                    Object objQ = mVar3.q();
                    if (zB) {
                        objQ = new v0(aVar2, 23);
                        mVar3.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new v0(aVar2, 23);
                            mVar3.K(objQ);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ, null, strQ, mVar3, null);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                cv0.i.a(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    cw1.e.f56020a.getClass();
                    h1.c(this.f55165b, null, false, null, null, null, null, null, cw1.e.f56022c, mVar4, C.ENCODING_PCM_32BIT, 510);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    f0 f0Var2 = f0.f110999a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    String strQ2 = gl1.y.Q(mVar5, R.string.lbl_next);
                    boolean zB2 = mVar5.B(aVar2);
                    Object objQ2 = mVar5.q();
                    if (zB2) {
                        objQ2 = new v0(aVar2, 29);
                        mVar5.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new v0(aVar2, 29);
                            mVar5.K(objQ2);
                        }
                    }
                    f0Var2.d(384, 9, (e23.a) objQ2, rVarF, strQ2, mVar5, null, false);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                q0.a(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    f0 f0Var3 = f0.f110999a;
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    String strQ3 = gl1.y.Q(mVar6, R.string.common_confirm);
                    boolean zB3 = mVar6.B(aVar2);
                    Object objQ3 = mVar6.q();
                    if (zB3) {
                        objQ3 = new cw1.p0(aVar2, 2);
                        mVar6.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new cw1.p0(aVar2, 2);
                            mVar6.K(objQ3);
                        }
                    }
                    f0Var3.d(384, 9, (e23.a) objQ3, rVarF2, strQ3, mVar6, null, false);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    f0 f0Var4 = f0.f110999a;
                    h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                    String strQ4 = gl1.y.Q(mVar7, R.string.edit_preferences);
                    boolean zB4 = mVar7.B(aVar2);
                    Object objQ4 = mVar7.q();
                    if (zB4) {
                        objQ4 = new cw1.p0(aVar2, 1);
                        mVar7.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new cw1.p0(aVar2, 1);
                            mVar7.K(objQ4);
                        }
                    }
                    f0Var4.i(strQ4, rVarF3, false, (e23.a) objQ4, mVar7, 48, 4);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f55165b, null, gl1.y.Q(mVar8, R.string.mct_reminders), mVar8, null);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f55165b, null, gl1.y.Q(mVar9, R.string.devices_page_title), mVar9, null);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                WorkoutActivityProfileSelectionActivity.b bVar = WorkoutActivityProfileSelectionActivity.f48559a;
                if (mVar10.n(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f55165b, null, gl1.y.Q(mVar10, R.string.lbl_choose_activity_type), mVar10, null);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(1 & iIntValue11, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    u0.a(null, null, null, null, this.f55165b, mVar11, 0, 15);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(1 & iIntValue12, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f55165b, null, gl1.y.Q(mVar12, R.string.concept_activities), mVar12, null);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar13.n(1 & iIntValue13, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f55165b, null, gl1.y.Q(mVar13, R.string.lbl_overview), mVar13, null);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar14.n(1 & iIntValue14, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar14, 0);
                    int iHashCode = Long.hashCode(mVar14.getU());
                    i2 i2VarX = mVar14.x();
                    h4.r rVarC = h4.k.c(aVar5, mVar14);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar14.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar14.z();
                    if (mVar14.getT()) {
                        mVar14.M(aVar6);
                    } else {
                        mVar14.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar14);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar14);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar14.getT() || !p005kotlin.jvm.internal.s.g(mVar14.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar14, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar14);
                    b0 b0Var = b0.f22601a;
                    z02.f.c(0, 54, null, this.f55165b, null, gl1.y.Q(mVar14, R.string.profile_view_user_trail_reviews), mVar14, null);
                    mVar14.y();
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (mVar15.n(1 & iIntValue15, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    String strQ5 = gl1.y.Q(mVar15, R.string.lbl_learn_more_about_lifestyle_logging);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarA = x0.a(j92.f.f97931h, ds.e0.e(mVar15), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    h4.r.a aVar7 = h4.r.S;
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97920e;
                    h4.r rVarC2 = c2.l.C(aVar7, f14, 0.0f, f14, f14, 2);
                    boolean zB5 = mVar15.B(aVar2);
                    Object objQ5 = mVar15.q();
                    if (zB5) {
                        objQ5 = new eu.a(aVar2, 2);
                        mVar15.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new eu.a(aVar2, 2);
                            mVar15.K(objQ5);
                        }
                    }
                    mh.c(strQ5, u1.w.d(rVarC2, false, null, null, (e23.a) objQ5, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, mVar15, 0, 0, 131068);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar16.n(1 & iIntValue16, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    String strQ6 = gl1.y.Q(mVar16, R.string.terms_and_conditions);
                    boolean zB6 = mVar16.B(aVar2);
                    Object objQ6 = mVar16.q();
                    if (zB6) {
                        objQ6 = new eu.a(aVar2, 3);
                        mVar16.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new eu.a(aVar2, 3);
                            mVar16.K(objQ6);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ6, null, strQ6, mVar16, null);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                m0.a aVar8 = m0.f66573c;
                if (mVar17.n(1 & iIntValue17, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    f0.f110999a.d(384, 9, this.f55165b, x2.f(h4.r.S, 1.0f), gl1.y.Q(mVar17, R.string.find_a_race), mVar17, null, false);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                xy2.b.g(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (mVar18.n(1 & iIntValue18, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    h4.r.a aVar9 = h4.r.S;
                    h4.r rVarD = u1.w.d(x2.f(aVar9, 1.0f), false, null, null, this.f55165b, 15);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarY = c2.l.y(rVarD, eVar.f97920e);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar3 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar3, mVar18, 48);
                    int iHashCode2 = Long.hashCode(mVar18.getU());
                    i2 i2VarX2 = mVar18.x();
                    h4.r rVarC3 = h4.k.c(rVarY, mVar18);
                    h5.g.V.getClass();
                    e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar18.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar18.z();
                    if (mVar18.getT()) {
                        mVar18.M(aVar10);
                    } else {
                        mVar18.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar18);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar18);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar18.getT() || !p005kotlin.jvm.internal.s.g(mVar18.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar18, iHashCode2, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar18);
                    u2 u2Var = u2.f22900a;
                    s62.a.f157643a.getClass();
                    t62.b.f162798a.getClass();
                    u4.d dVarA = e72.b.a(d9.f175854a);
                    f02.h.f67736a.getClass();
                    long jA = f02.h.a(mVar18);
                    gl.c.f77766a.getClass();
                    g02.i.a(c2.l.C(aVar9, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11), dVarA, jA, gl.c.f77767b.M, eVar.f97923h, 0.0f, null, mVar18, 0, 224);
                    String strQ7 = gl1.y.Q(mVar18, R.string.activity_view_personal_records_label);
                    d92.b.f58624b.getClass();
                    mh.c(strQ7, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar18), mVar18, 0, 0, 131070);
                    mVar18.y();
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 21:
                p3.m mVar19 = (p3.m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (mVar19.n(1 & iIntValue19, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = p3.n.f135158a;
                    String strQ8 = gl1.y.Q(mVar19, R.string.lbl_close);
                    boolean zB7 = mVar19.B(aVar2);
                    Object objQ7 = mVar19.q();
                    if (zB7) {
                        objQ7 = new eu.a(aVar2, 19);
                        mVar19.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new eu.a(aVar2, 19);
                            mVar19.K(objQ7);
                        }
                    }
                    u0.a(null, null, strQ8, null, (e23.a) objQ7, mVar19, 0, 11);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                fv0.a.a(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                fv0.i.a(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                p3.m mVar20 = (p3.m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (mVar20.n(1 & iIntValue20, (iIntValue20 & 3) != 2)) {
                    x1 x1Var20 = p3.n.f135158a;
                    boolean zB8 = mVar20.B(aVar2);
                    Object objQ8 = mVar20.q();
                    if (zB8) {
                        objQ8 = new gt1.s(aVar2, 4);
                        mVar20.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new gt1.s(aVar2, 4);
                            mVar20.K(objQ8);
                        }
                    }
                    u0.a(null, null, null, null, (e23.a) objQ8, mVar20, 0, 15);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                gw0.t.e(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 26:
                p3.m mVar21 = (p3.m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (mVar21.n(1 & iIntValue21, (iIntValue21 & 3) != 2)) {
                    x1 x1Var21 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f55165b, null, gl1.y.Q(mVar21, R.string.nutrition), mVar21, null);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                h21.k.b(aVar2, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 28:
                p3.m mVar22 = (p3.m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (mVar22.n(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    x1 x1Var22 = p3.n.f135158a;
                    String strQ9 = gl1.y.Q(mVar22, R.string.pacepro_title);
                    b.u uVar = (b.u) mVar22.A(g02.d.f74342a);
                    boolean zR = mVar22.r(uVar);
                    Object objQ9 = mVar22.q();
                    if (zR) {
                        objQ9 = new h51.d.a(uVar);
                        mVar22.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new h51.d.a(uVar);
                            mVar22.K(objQ9);
                        }
                    }
                    e23.a aVar11 = (e23.a) ((k23.g) objQ9);
                    i53.f fVarA = i53.a.a(new i3("HelpScreen", gl1.y.Q(mVar22, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB9 = mVar22.B(aVar2);
                    Object objQ10 = mVar22.q();
                    if (zB9) {
                        objQ10 = new h0(aVar2, 26);
                        mVar22.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new h0(aVar2, 26);
                            mVar22.K(objQ10);
                        }
                    }
                    z02.f.d(strQ9, null, null, aVar11, fVarA, null, (e23.l) objQ10, mVar22, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar23 = (p3.m) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (mVar23.n(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    x1 x1Var23 = p3.n.f135158a;
                    z02.f.c(0, 54, null, this.f55165b, null, gl1.y.Q(mVar23, R.string.lbl_all_activities), mVar23, null);
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ p(e23.a aVar, int i14, int i15) {
        this.f55164a = i15;
        this.f55165b = aVar;
    }
}
