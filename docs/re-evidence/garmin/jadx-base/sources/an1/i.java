package an1;

import androidx.room.a0;
import b82.y1;
import c2.j;
import c2.l;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.WorkoutActivityProfileSelectionActivity;
import ds.e0;
import ds.z;
import e23.p;
import f72.t;
import gl1.y;
import h4.k;
import h4.r;
import i3.ff;
import i3.hf;
import i3.i7;
import i3.mh;
import i3.v5;
import o4.d0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import p5.v;
import r1.c0;
import r1.q2;
import s5.x0;
import u1.y0;
import v62.e1;
import v62.i8;
import v62.j8;
import v62.n3;
import v62.o3;
import v62.s6;
import v62.s9;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4491b;

    public /* synthetic */ i(boolean z14, int i14) {
        this.f4490a = i14;
        this.f4491b = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        u4.d dVarA;
        u4.d dVarA2;
        int i14;
        int i15;
        long jD;
        int i16 = this.f4490a;
        m.a aVar = m.f135153a;
        boolean z14 = this.f4491b;
        boolean z15 = false;
        switch (i16) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    a.f4474a.getClass();
                    c0.e(this.f4491b, null, null, null, null, a.f4475b, mVar, 196608, 30);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    z02.f.a(0, 59, null, null, null, y.Q(mVar2, z14 ? R.string.lbl_treadmill_distance : R.string.lbl_enter_distance), mVar2, null);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                y1 y1Var = y1.f16902a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    if (z14) {
                        mVar3.C(1702514404);
                        v5.a(0.0f, 0, 3, q2.e(d92.b.f58623a, mVar3), null, mVar3);
                        mVar3.f();
                    } else {
                        mVar3.C(1702618192);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                y1 y1Var2 = y1.f16902a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    if (z14) {
                        mVar4.C(-1701323925);
                        v5.a(0.0f, 0, 3, q2.e(d92.b.f58623a, mVar4), null, mVar4);
                        mVar4.f();
                    } else {
                        mVar4.C(-1701220137);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                y1 y1Var3 = y1.f16902a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    if (z14) {
                        mVar5.C(2097453258);
                        v5.a(0.0f, 0, 3, q2.e(d92.b.f58623a, mVar5), null, mVar5);
                        mVar5.f();
                    } else {
                        mVar5.C(2097557046);
                        mVar5.f();
                    }
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                y1 y1Var4 = y1.f16902a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    if (z14) {
                        mVar6.C(-2096262779);
                        v5.a(0.0f, 0, 3, q2.e(d92.b.f58623a, mVar6), null, mVar6);
                        mVar6.f();
                    } else {
                        mVar6.C(-2096158991);
                        mVar6.f();
                    }
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    String strQ = y.Q(mVar7, R.string.lbl_done);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    ba2.c.a(strQ, null, 0L, 0, false, 0, x0.a(j92.f.f97929f, d0.c(z14 ? 1.0f : 0.5f, e0.e(mVar7), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), 0.0d, mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                c12.d.c(z14, (m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 8:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    if (z14) {
                        mVar8.C(109223869);
                        s62.a.f157643a.getClass();
                        u4.d dVarA3 = t.a(t62.c.f162799a);
                        r.a aVar2 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        r rVarQ = x2.q(l.C(aVar2, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11), j92.b.f97901d.f97905d);
                        o4.e0.a aVar3 = o4.e0.f128843b;
                        gl.c.f77766a.getClass();
                        y0.b(dVarA3, "", rVarQ, o4.e0.a.a(aVar3, gl.c.a(mVar8).r()), mVar8, 48, 56);
                        mVar8.f();
                    } else {
                        mVar8.C(109652475);
                        mVar8.f();
                    }
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 9:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    t4.d dVarA4 = n5.c.a(z14 ? R.drawable.trail_image_heart_filled : R.drawable.trail_image_heart_unfilled, mVar9, 0);
                    d0.f128823b.getClass();
                    i7.a(dVarA4, null, null, d0.f128832k, mVar9, 3120, 4);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 10:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    if (z14) {
                        mVar10.C(856470333);
                        i7.a(n5.c.a(R.drawable.check, mVar10, 0), null, null, fb1.c.g(d92.b.f58623a, mVar10), mVar10, 48, 4);
                        mVar10.f();
                    } else {
                        mVar10.C(856730764);
                        mVar10.f();
                    }
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 11:
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    if (z14) {
                        mVar11.C(-405468280);
                        r.a aVar4 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        zd0.e.c(0.0f, 48, 12, 0L, l.C(aVar4, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11), mVar11);
                        mVar11.f();
                    } else {
                        mVar11.C(-405263587);
                        mVar11.f();
                    }
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 12:
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    if (z14) {
                        mVar12.C(1792219087);
                        s62.a.f157643a.getClass();
                        i7.b(e1.a(t62.b.f162798a), y.Q(mVar12, R.string.lbl_selected), null, fb1.c.g(d92.b.f58623a, mVar12), mVar12, 0, 4);
                        mVar12.f();
                    } else {
                        mVar12.C(1792449727);
                        mVar12.f();
                    }
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 13:
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                WorkoutActivityProfileSelectionActivity.b bVar = WorkoutActivityProfileSelectionActivity.f48559a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    if (z14) {
                        mVar13.C(24997872);
                        s62.a.f157643a.getClass();
                        i7.b(e1.a(t62.b.f162798a), y.Q(mVar13, R.string.lbl_selected), null, fb1.c.g(d92.b.f58623a, mVar13), mVar13, 0, 4);
                        mVar13.f();
                    } else {
                        mVar13.C(25228512);
                        mVar13.f();
                    }
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 14:
                m mVar14 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    if (z14) {
                        mVar14.C(1105942394);
                        s62.a.f157643a.getClass();
                        i7.b(e1.a(t62.b.f162798a), null, z.b(r.S, mVar14), fb1.c.g(d92.b.f58623a, mVar14), mVar14, 48, 0);
                        mVar14.f();
                    } else {
                        mVar14.C(1106273908);
                        mVar14.f();
                    }
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 15:
                float fFloatValue = ((Float) obj).floatValue();
                com.garmin.android.library.mapsdkadapter.i.d dVar = (com.garmin.android.library.mapsdkadapter.i.d) obj2;
                dVar.getClass();
                if (fFloatValue < (dt1.f.a.f61132a[dVar.ordinal()] == 1 ? 11.0f : 10.0f) && !z14) {
                    z15 = true;
                }
                return Boolean.valueOf(z15);
            case 16:
                m mVar15 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                    j jVar = j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97919d;
                    jVar.getClass();
                    j.i iVarI = j.i(f14);
                    r.a aVar5 = r.S;
                    h4.d.f81522a.getClass();
                    s2 s2VarA = c2.q2.a(iVarI, h4.d.a.f81533k, mVar15, 0);
                    int iHashCode = Long.hashCode(mVar15.getU());
                    i2 i2VarX = mVar15.x();
                    r rVarC = k.c(aVar5, mVar15);
                    h5.g.V.getClass();
                    h5.e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar15.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar15.z();
                    if (mVar15.getT()) {
                        mVar15.M(aVar6);
                    } else {
                        mVar15.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar15);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar15);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar15.getT() || !s.g(mVar15.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar15, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar15);
                    u2 u2Var = u2.f22900a;
                    if (z14) {
                        mVar15.C(-1934907787);
                        r rVarQ2 = x2.q(aVar5, j92.b.f97901d.f97904c);
                        s62.a.f157643a.getClass();
                        y0.b(s9.a(t62.b.f162798a), null, rVarQ2, null, mVar15, 48, 120);
                        mVar15.f();
                    } else {
                        mVar15.C(-1934660128);
                        mVar15.f();
                    }
                    s62.a.f157643a.getClass();
                    u4.d dVarA5 = s6.a(t62.b.f162798a);
                    long jC = a0.c(mVar15);
                    r rVarQ3 = x2.q(aVar5, j92.b.f97901d.f97904c);
                    Object objQ = mVar15.q();
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new dv0.n(8);
                        mVar15.K(objQ);
                    }
                    i7.b(dVarA5, null, v.c((e23.l) objQ, rVarQ3, false), jC, mVar15, 48, 0);
                    mVar15.y();
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 17:
                m mVar16 = (m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    j jVar2 = j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f15 = j92.b.f97899b.f97919d;
                    jVar2.getClass();
                    j.i iVarI2 = j.i(f15);
                    r.a aVar7 = r.S;
                    h4.d.f81522a.getClass();
                    s2 s2VarA2 = c2.q2.a(iVarI2, h4.d.a.f81533k, mVar16, 0);
                    int iHashCode2 = Long.hashCode(mVar16.getU());
                    i2 i2VarX2 = mVar16.x();
                    r rVarC2 = k.c(aVar7, mVar16);
                    h5.g.V.getClass();
                    h5.e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar16.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar16.z();
                    if (mVar16.getT()) {
                        mVar16.M(aVar8);
                    } else {
                        mVar16.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA2, mVar16);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar16);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar16.getT() || !s.g(mVar16.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar16, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar16);
                    u2 u2Var2 = u2.f22900a;
                    e11.d.f61868a.getClass();
                    c0.d(u2Var2, this.f4491b, null, null, null, null, e11.d.f61870c, mVar16, 1572870, 30);
                    s62.a.f157643a.getClass();
                    u4.d dVarA6 = s6.a(t62.b.f162798a);
                    long jC2 = a0.c(mVar16);
                    r rVarQ4 = x2.q(aVar7, j92.b.f97901d.f97904c);
                    Object objQ2 = mVar16.q();
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new dv0.n(16);
                        mVar16.K(objQ2);
                    }
                    i7.b(dVarA6, null, v.c((e23.l) objQ2, rVarQ4, false), jC2, mVar16, 48, 0);
                    mVar16.y();
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 18:
                m mVar17 = (m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA7 = e1.a(t62.b.f162798a);
                    long jG = fb1.c.g(d92.b.f58623a, mVar17);
                    r rVarA = l4.k.a(e60.c.b(r.S, mVar17), z14 ? 1.0f : 0.0f);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA7, "", x2.q(rVarA, j92.b.f97901d.f97905d), jG, mVar17, 48, 0);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 19:
                m mVar18 = (m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = n.f135158a;
                    if (z14) {
                        mVar18.C(-919917657);
                        b3.b.f15502a.getClass();
                        u4.d dVarA8 = d3.f.a();
                        String strQ2 = y.Q(mVar18, R.string.lbl_selected);
                        long jB = e0.b(d92.b.f58623a, mVar18);
                        r.a aVar9 = r.S;
                        d92.b.f58625c.getClass();
                        i7.b(dVarA8, strQ2, x2.q(aVar9, j92.b.f97901d.f97905d), jB, mVar18, 0, 0);
                        mVar18.f();
                    } else {
                        mVar18.C(-919634689);
                        mVar18.f();
                    }
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 20:
                m mVar19 = (m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = n.f135158a;
                    r.a aVar10 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarQ5 = x2.q(aVar10, j92.b.f97901d.f97905d);
                    if (z14) {
                        s62.a.f157643a.getClass();
                        dVarA = o3.a(t62.b.f162798a);
                    } else {
                        s62.a.f157643a.getClass();
                        dVarA = n3.a(t62.b.f162798a);
                    }
                    i7.a(u4.p.b(dVarA, mVar19), y.Q(mVar19, R.string.lbl_filters), rVarQ5, sn.a.b(mVar19), mVar19, 8, 0);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 21:
                m mVar20 = (m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x1 x1Var20 = n.f135158a;
                    hf.a(this.f4491b, null, null, false, d92.c.a(ff.f88115a, mVar20), mVar20, 48, 92);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 22:
                m mVar21 = (m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    x1 x1Var21 = n.f135158a;
                    hf.a(this.f4491b, null, null, false, d92.c.a(ff.f88115a, mVar21), mVar21, 48, 92);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 23:
                m mVar22 = (m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (mVar22.n(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    x1 x1Var22 = n.f135158a;
                    hf.a(this.f4491b, null, null, false, d92.c.a(ff.f88115a, mVar22), mVar22, 48, 92);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 24:
                m mVar23 = (m) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.f46013c;
                if (mVar23.n(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    x1 x1Var23 = n.f135158a;
                    if (z14) {
                        mVar23.C(-293186619);
                        r.a aVar12 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        r rVarQ6 = x2.q(aVar12, j92.b.f97901d.f97904c);
                        s62.a.f157643a.getClass();
                        i7.b(e1.a(t62.b.f162798a), null, rVarQ6, a0.c(mVar23), mVar23, 48, 0);
                        mVar23.f();
                    } else {
                        mVar23.C(-292892832);
                        mVar23.f();
                    }
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
            case 25:
                m mVar24 = (m) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.f46013c;
                if (mVar24.n(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    x1 x1Var24 = n.f135158a;
                    if (z14) {
                        mVar24.C(532654751);
                        r.a aVar14 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        r rVarQ7 = x2.q(aVar14, j92.b.f97901d.f97904c);
                        s62.a.f157643a.getClass();
                        i7.b(e1.a(t62.b.f162798a), null, rVarQ7, a0.c(mVar24), mVar24, 48, 0);
                        mVar24.f();
                    } else {
                        mVar24.C(532971726);
                        mVar24.f();
                    }
                } else {
                    mVar24.e();
                }
                return Unit.INSTANCE;
            case 26:
                m mVar25 = (m) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.f46013c;
                if (mVar25.n(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    x1 x1Var25 = n.f135158a;
                    if (z14) {
                        mVar25.C(-212241392);
                        r.a aVar16 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        r rVarQ8 = x2.q(aVar16, j92.b.f97901d.f97904c);
                        s62.a.f157643a.getClass();
                        i7.b(e1.a(t62.b.f162798a), null, rVarQ8, a0.c(mVar25), mVar25, 48, 0);
                        mVar25.f();
                    } else {
                        mVar25.C(-211901229);
                        mVar25.f();
                    }
                } else {
                    mVar25.e();
                }
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                gn1.d.c(z14, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 28:
                m mVar26 = (m) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (mVar26.n(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    x1 x1Var26 = n.f135158a;
                    String str = z14 ? "" : ":";
                    r.a aVar17 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarA2 = l.A(aVar17, j92.b.f97899b.f97918c, 0.0f, 2);
                    d92.b.f58624b.getClass();
                    mh.c(str, rVarA2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, mVar26, 0, 0, 131068);
                } else {
                    mVar26.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar27 = (m) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (mVar27.n(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    x1 x1Var27 = n.f135158a;
                    if (z14) {
                        s62.a.f157643a.getClass();
                        dVarA2 = i8.a(t62.b.f162798a);
                    } else {
                        s62.a.f157643a.getClass();
                        dVarA2 = j8.a(t62.b.f162798a);
                    }
                    u4.d dVar2 = dVarA2;
                    if (z14) {
                        i14 = -2066041140;
                        i15 = R.string.activity_unfavorite_icon_title;
                    } else {
                        i14 = -2065933074;
                        i15 = R.string.activity_favorite_icon_title;
                    }
                    String strH = sn.a.h(mVar27, i14, i15, mVar27);
                    if (z14) {
                        mVar27.C(-2065788924);
                        gl.c.f77766a.getClass();
                        jD = gl.c.a(mVar27).r();
                        mVar27.f();
                    } else {
                        mVar27.C(-2065704790);
                        d92.b.f58623a.getClass();
                        jD = d92.b.a(mVar27).f().d();
                        mVar27.f();
                    }
                    long j8 = jD;
                    r.a aVar18 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.b(dVar2, strH, x2.q(aVar18, j92.b.f97901d.f97905d), j8, mVar27, 0, 0);
                } else {
                    mVar27.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(boolean z14, int i14, int i15) {
        this.f4490a = i15;
        this.f4491b = z14;
    }
}
