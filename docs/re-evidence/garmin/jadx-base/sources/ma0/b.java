package ma0;

import c2.a0;
import c2.k3;
import c2.l;
import c2.q3;
import c2.t;
import c2.t2;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.maps.android.clustering.Cluster;
import e23.p;
import e23.q;
import f5.z0;
import gg1.o0;
import gl1.y;
import h4.k;
import h4.r;
import i3.i7;
import i3.mh;
import k2.i;
import l72.j0;
import l72.x0;
import mg2.j;
import o4.m1;
import o72.b0;
import o72.g0;
import o72.x;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import r1.e0;
import v.h;
import v62.e1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117612a;

    public /* synthetic */ b(int i14) {
        this.f117612a = i14;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f117612a;
        m.a aVar = m.f135153a;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                c cVar = c.f117613a;
                ((a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                d dVar = d.f117616a;
                ((a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    String strQ = y.Q(mVar2, R.string.msg_transfer_sensors_bic);
                    r rVarF = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarC = l.C(rVarF, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                    d92.b.f58624b.getClass();
                    mh.c(strQ, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar2), mVar2, 0, 0, 131068);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj3).intValue();
                md0.b bVar = md0.b.f117889a;
                ((e0) obj).getClass();
                x1 x1Var3 = n.f135158a;
                md0.a.c("ItemEnter / ItemExit", "fadeIn + expandVertically  /  fadeOut + shrinkVertically", (m) obj2, 54);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj3).intValue();
                md0.b bVar2 = md0.b.f117889a;
                ((e0) obj).getClass();
                x1 x1Var4 = n.f135158a;
                md0.a.c("PopEnter / PopExit", "fadeIn + scaleIn(0.92)  /  fadeOut + scaleOut(0.92)", (m) obj2, 54);
                return Unit.INSTANCE;
            case 4:
                Cluster cluster = (Cluster) obj;
                int iIntValue3 = ((Integer) obj3).intValue();
                me2.a aVar2 = me2.a.f118117a;
                cluster.getClass();
                x1 x1Var5 = n.f135158a;
                me2.y.a(cluster, (m) obj2, iIntValue3 & 14);
                return Unit.INSTANCE;
            case 5:
                me2.f fVar = (me2.f) obj;
                int iIntValue4 = ((Integer) obj3).intValue();
                me2.a aVar3 = me2.a.f118117a;
                fVar.getClass();
                x1 x1Var6 = n.f135158a;
                me2.y.b(fVar, (m) obj2, iIntValue4 & 14);
                return Unit.INSTANCE;
            case 6:
                mg2.f fVar2 = (mg2.f) obj;
                m mVar3 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                j jVar = j.f118398a;
                fVar2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar3.B(fVar2) ? 4 : 2;
                }
                if (mVar3.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var7 = n.f135158a;
                    mg2.r.a(fVar2, null, mVar3, iIntValue5 & 14);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 7:
                h82.r rVar = (h82.r) obj;
                int i15 = 4;
                m mVar4 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                mh1.c cVar2 = mh1.c.f118459a;
                rVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    if (!mVar4.B(rVar)) {
                        i15 = 2;
                    }
                    iIntValue6 |= i15;
                }
                if (mVar4.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var8 = n.f135158a;
                    rVar.D(R.string.lbl_location_settings, mVar4, (iIntValue6 << 3) & 112);
                    rVar.l(R.string.msg_location_settings_help, (iIntValue6 << 6) & 896, 2, null, mVar4);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 8:
                p pVar = (p) obj;
                m mVar5 = (m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                n21.a aVar4 = n21.a.f122359a;
                pVar.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar5.r(pVar) ? 4 : 2;
                }
                if (mVar5.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    x1 x1Var9 = n.f135158a;
                    r rVarD = x2.d(r.S, 1.0f);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
                    int iHashCode = Long.hashCode(mVar5.getU());
                    i2 i2VarX = mVar5.x();
                    r rVarC2 = k.c(rVarD, mVar5);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar5);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar5);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar5, iHashCode, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar5);
                    u uVar = u.f22885a;
                    h.B(pVar, mVar5, iIntValue7 & 14);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 9:
                r rVar2 = (r) obj;
                m mVar6 = (m) obj2;
                h.y(-183132058, rVar2, (Integer) obj3, mVar6);
                x1 x1Var10 = n.f135158a;
                r rVarA = l4.k.a(rVar2, 0.5f);
                mVar6.f();
                return rVarA;
            case 10:
                o0 o0Var = (o0) obj;
                m mVar7 = (m) obj2;
                ((Integer) obj3).getClass();
                o0Var.getClass();
                mVar7.C(-351038785);
                x1 x1Var11 = n.f135158a;
                String strQ2 = y.Q(mVar7, o0Var.f77292b);
                mVar7.f();
                return strQ2;
            case 11:
                p pVar2 = (p) obj;
                m mVar8 = (m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                na0.s sVar = na0.s.f125195a;
                pVar2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar8.r(pVar2) ? 4 : 2;
                }
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var12 = n.f135158a;
                    r rVarD2 = x2.d(r.S, 1.0f);
                    h4.d.f81522a.getClass();
                    z0 z0VarD2 = c2.q.d(h4.d.a.f81528f, false);
                    int iHashCode2 = Long.hashCode(mVar8.getU());
                    i2 i2VarX2 = mVar8.x();
                    r rVarC3 = k.c(rVarD2, mVar8);
                    h5.g.V.getClass();
                    h5.e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar6);
                    } else {
                        mVar8.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD2, mVar8);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar8);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar8.getT() || !s.g(mVar8.q(), Integer.valueOf(iHashCode2))) {
                        h.z(iHashCode2, mVar8, iHashCode2, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar8);
                    u uVar2 = u.f22885a;
                    h.B(pVar2, mVar8, iIntValue8 & 14);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 12:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                m mVar9 = (m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                o62.b bVar5 = o62.b.f129645a;
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar9.h(zBooleanValue) ? 4 : 2;
                }
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    x1 x1Var13 = n.f135158a;
                    if (zBooleanValue) {
                        mVar9.C(1366862067);
                        s62.a.f157643a.getClass();
                        u4.d dVarA = e1.a(t62.b.f162798a);
                        String strQ3 = y.Q(mVar9, R.string.lbl_selected);
                        long jG = fb1.c.g(d92.b.f58623a, mVar9);
                        r.a aVar7 = r.S;
                        d92.b.f58625c.getClass();
                        i7.b(dVarA, strQ3, x2.q(aVar7, j92.b.f97901d.f97904c), jG, mVar9, 0, 0);
                        mVar9.f();
                    } else {
                        mVar9.C(1367118003);
                        mVar9.f();
                    }
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 13:
                h82.r rVar3 = (h82.r) obj;
                m mVar10 = (m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                o62.c cVar3 = o62.c.f129649a;
                rVar3.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar10.B(rVar3) ? 4 : 2;
                }
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var14 = n.f135158a;
                    int i16 = (iIntValue10 << 3) & 112;
                    rVar3.D(R.string.workout_step_target_help_title, mVar10, i16);
                    int i17 = (iIntValue10 << 6) & 896;
                    rVar3.l(R.string.workout_step_target_help_intro, i17, 2, null, mVar10);
                    rVar3.o(R.string.workout_step_target_help_msg1, i17, 2, null, mVar10);
                    rVar3.t(R.string.workout_primary_target, mVar10, i16);
                    rVar3.o(R.string.workout_step_target_help_msg2, i17, 2, null, mVar10);
                    rVar3.t(R.string.workout_secondary_target, mVar10, i16);
                    rVar3.o(R.string.workout_step_target_help_msg3, i17, 2, null, mVar10);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 14:
                j0 j0Var = (j0) obj;
                m mVar11 = (m) obj2;
                ((Integer) obj3).getClass();
                j0Var.getClass();
                mVar11.C(352923148);
                x1 x1Var15 = n.f135158a;
                mVar11.f();
                return j0Var;
            case 15:
                m mVar12 = (m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                x xVar = x.f130662a;
                ((e2.d) obj).getClass();
                if (mVar12.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var16 = n.f135158a;
                    r.a aVar8 = r.S;
                    int i18 = k3.f22728a;
                    l.f(l.F(aVar8, q3.d(mVar12)), mVar12);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 16:
                m mVar13 = (m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                x xVar2 = x.f130662a;
                ((a0) obj).getClass();
                if (mVar13.n(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    x1 x1Var17 = n.f135158a;
                    r rVarP = l.p(r.S);
                    c2.j jVar2 = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97920e;
                    jVar2.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    Object objQ = mVar13.q();
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new o62.a(27);
                        mVar13.K(objQ);
                    }
                    e2.c.b(rVarP, null, null, iVarI, null, null, false, null, (e23.l) objQ, mVar13, C.ENCODING_PCM_32BIT, 494);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 17:
                m mVar14 = (m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                x xVar3 = x.f130662a;
                ((e2.d) obj).getClass();
                if (mVar14.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    x1 x1Var18 = n.f135158a;
                    r.a aVar9 = r.S;
                    int i19 = k3.f22728a;
                    l.f(l.F(aVar9, q3.d(mVar14)), mVar14);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 18:
                m mVar15 = (m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                x xVar4 = x.f130662a;
                ((a0) obj).getClass();
                if (mVar15.n(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    x1 x1Var19 = n.f135158a;
                    r rVarP2 = l.p(r.S);
                    c2.j jVar3 = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f15 = j92.b.f97899b.f97920e;
                    jVar3.getClass();
                    c2.j.i iVarI2 = c2.j.i(f15);
                    Object objQ2 = mVar15.q();
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new o62.a(28);
                        mVar15.K(objQ2);
                    }
                    e2.c.b(rVarP2, null, null, iVarI2, null, null, false, null, (e23.l) objQ2, mVar15, C.ENCODING_PCM_32BIT, 494);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 19:
                m mVar16 = (m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                x xVar5 = x.f130662a;
                ((e2.d) obj).getClass();
                if (mVar16.n(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    x1 x1Var20 = n.f135158a;
                    r.a aVar10 = r.S;
                    int i24 = k3.f22728a;
                    l.f(l.F(aVar10, q3.d(mVar16)), mVar16);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 20:
                m mVar17 = (m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                x xVar6 = x.f130662a;
                ((a0) obj).getClass();
                if (mVar17.n(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    x1 x1Var21 = n.f135158a;
                    r rVarP3 = l.p(r.S);
                    c2.j jVar4 = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f16 = j92.b.f97899b.f97920e;
                    jVar4.getClass();
                    c2.j.i iVarI3 = c2.j.i(f16);
                    Object objQ3 = mVar17.q();
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new o62.a(26);
                        mVar17.K(objQ3);
                    }
                    e2.c.b(rVarP3, null, null, iVarI3, null, null, false, null, (e23.l) objQ3, mVar17, C.ENCODING_PCM_32BIT, 494);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 21:
                m mVar18 = (m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                x xVar7 = x.f130662a;
                ((e2.d) obj).getClass();
                if (mVar18.n(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    x1 x1Var22 = n.f135158a;
                    r.a aVar11 = r.S;
                    int i25 = k3.f22728a;
                    l.f(l.F(aVar11, q3.d(mVar18)), mVar18);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 22:
                m mVar19 = (m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                x xVar8 = x.f130662a;
                ((a0) obj).getClass();
                if (mVar19.n(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    x1 x1Var23 = n.f135158a;
                    r rVarP4 = l.p(r.S);
                    c2.j jVar5 = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f17 = j92.b.f97899b.f97920e;
                    jVar5.getClass();
                    c2.j.i iVarI4 = c2.j.i(f17);
                    Object objQ4 = mVar19.q();
                    aVar.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new o62.a(25);
                        mVar19.K(objQ4);
                    }
                    e2.c.b(rVarP4, null, null, iVarI4, null, null, false, null, (e23.l) objQ4, mVar19, C.ENCODING_PCM_32BIT, 494);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 23:
                m mVar20 = (m) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                b0 b0Var = b0.f130314a;
                ((t) obj).getClass();
                if (mVar20.n(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    x1 x1Var24 = n.f135158a;
                    o72.n.i(mVar20, 0);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 24:
                m mVar21 = (m) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                b0 b0Var2 = b0.f130314a;
                ((t) obj).getClass();
                if (mVar21.n(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    x1 x1Var25 = n.f135158a;
                    o72.n.c(mVar21, 0);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 25:
                m mVar22 = (m) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                b0 b0Var3 = b0.f130314a;
                ((t) obj).getClass();
                if (mVar22.n(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    x1 x1Var26 = n.f135158a;
                    o72.n.c(mVar22, 0);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 26:
                m mVar23 = (m) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                b0 b0Var4 = b0.f130314a;
                ((t) obj).getClass();
                if (mVar23.n(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    x1 x1Var27 = n.f135158a;
                    o72.n.c(mVar23, 0);
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
            case 27:
                m mVar24 = (m) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                o72.e0 e0Var = o72.e0.f130362a;
                ((a0) obj).getClass();
                if (mVar24.n(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    x1 x1Var28 = n.f135158a;
                    g6.f.a aVar12 = g6.f.f75994b;
                    r rVarY = l.y(r.S, 16);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus lacinia odio vitae vestibulum vestibulum. Cras venenatis euismod malesuada. Curabitur ac felis arcu. Nulla facilisi. Maecenas pharetra feugiat urna, vel placerat magna tincidunt non. Suspendisse quis arcu vel mauris vehicula condimentum. Fusce quis justo turpis. Duis volutpat orci non risus cursus, id fringilla ligula sodales. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Integer lacinia malesuada leo at tristique. \nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus lacinia odio vitae vestibulum vestibulum. Cras venenatis euismod malesuada. Curabitur ac felis arcu. Nulla facilisi. Maecenas pharetra feugiat urna, vel placerat magna tincidunt non. Suspendisse quis arcu vel mauris vehicula condimentum. Fusce quis justo turpis. Duis volutpat orci non risus cursus, id fringilla ligula sodales. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Integer lacinia malesuada leo at tristique. \nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus lacinia odio vitae vestibulum vestibulum. Cras venenatis euismod malesuada. Curabitur ac felis arcu. Nulla facilisi. Maecenas pharetra feugiat urna, vel placerat magna tincidunt non. Suspendisse quis arcu vel mauris vehicula condimentum. Fusce quis justo turpis. Duis volutpat orci non risus cursus, id fringilla ligula sodales. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Integer lacinia malesuada leo at tristique. \nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus lacinia odio vitae vestibulum vestibulum. Cras venenatis euismod malesuada. Curabitur ac felis arcu. Nulla facilisi. Maecenas pharetra feugiat urna, vel placerat magna tincidunt non. Suspendisse quis arcu vel mauris vehicula condimentum. Fusce quis justo turpis. Duis volutpat orci non risus cursus, id fringilla ligula sodales. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Integer lacinia malesuada leo at tristique. \nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus lacinia odio vitae vestibulum vestibulum. Cras venenatis euismod malesuada. Curabitur ac felis arcu. Nulla facilisi. Maecenas pharetra feugiat urna, vel placerat magna tincidunt non. Suspendisse quis arcu vel mauris vehicula condimentum. Fusce quis justo turpis. Duis volutpat orci non risus cursus, id fringilla ligula sodales. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Integer lacinia malesuada leo at tristique. \nLorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus lacinia odio vitae vestibulum vestibulum. Cras venenatis euismod malesuada. Curabitur ac felis arcu. Nulla facilisi. Maecenas pharetra feugiat urna, vel placerat magna tincidunt non. Suspendisse quis arcu vel mauris vehicula condimentum. Fusce quis justo turpis. Duis volutpat orci non risus cursus, id fringilla ligula sodales. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Integer lacinia malesuada leo at tristique. \n", rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar24), mVar24, 54, 0, 131068);
                } else {
                    mVar24.e();
                }
                return Unit.INSTANCE;
            case 28:
                t2 t2Var = (t2) obj;
                m mVar25 = (m) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                g0 g0Var = g0.f130383a;
                t2Var.getClass();
                if ((iIntValue24 & 6) == 0) {
                    iIntValue24 |= mVar25.B(t2Var) ? 4 : 2;
                }
                if (mVar25.n(iIntValue24 & 1, (iIntValue24 & 19) != 18)) {
                    x1 x1Var29 = n.f135158a;
                    int i26 = iIntValue24;
                    x0 x0Var = x0.f111346a;
                    int i27 = i26 & 14;
                    int i28 = x0.f111348c;
                    x0Var.f(i27 | 25008 | (i28 << 24), 116, null, t2Var, null, null, "90", "Average", "bpm", null, mVar25);
                    x0Var.h(t2Var, mVar25, (i28 << 3) | i27);
                } else {
                    mVar25.e();
                }
                return Unit.INSTANCE;
            default:
                t2 t2Var2 = (t2) obj;
                m mVar26 = (m) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                g0 g0Var2 = g0.f130383a;
                t2Var2.getClass();
                if ((iIntValue25 & 6) == 0) {
                    iIntValue25 |= mVar26.B(t2Var2) ? 4 : 2;
                }
                if (mVar26.n(iIntValue25 & 1, (iIntValue25 & 19) != 18)) {
                    x1 x1Var30 = n.f135158a;
                    r.a aVar13 = r.S;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar6 = h4.d.a.f81534l;
                    g6.f.a aVar14 = g6.f.f75994b;
                    float f18 = 2;
                    r rVarC4 = l.C(t2Var2.c(aVar13, bVar6), 4, 0.0f, f18, 0.0f, 10);
                    z0 z0VarD3 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode3 = Long.hashCode(mVar26.getU());
                    i2 i2VarX3 = mVar26.x();
                    r rVarC5 = k.c(rVarC4, mVar26);
                    h5.g.V.getClass();
                    h5.e0.a aVar15 = h5.g.a.f81805b;
                    if (mVar26.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar26.z();
                    if (mVar26.getT()) {
                        mVar26.M(aVar15);
                    } else {
                        mVar26.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD3, mVar26);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar26);
                    h5.g.a.b bVar7 = h5.g.a.f81813j;
                    if (mVar26.getT() || !s.g(mVar26.q(), Integer.valueOf(iHashCode3))) {
                        h.z(iHashCode3, mVar26, iHashCode3, bVar7);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar26);
                    u uVar3 = u.f22885a;
                    c2.q.a(u1.n.e(l4.k.b(x2.q(aVar13, 20), i.f102406a), ds.e0.b(d92.b.f58623a, mVar26), m1.f128891a), mVar26, 0);
                    r rVarC6 = uVar3.c(aVar13, h4.d.a.f81528f);
                    d92.b.f58624b.getClass();
                    mh.c("x2", rVarC6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(d92.c.e(j92.f.f97935l), d92.b.a(mVar26).h().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar26, 6, 0, 131068);
                    mVar26.y();
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = v62.t2.a(t62.b.f162798a);
                    long jC = androidx.room.a0.c(mVar26);
                    r rVarC7 = t2Var2.c(l.C(aVar13, f18, 0.0f, 0.0f, 0.0f, 14), bVar6);
                    float f19 = 24;
                    i7.b(dVarA2, null, x2.u(x2.h(rVarC7, f19), f19), jC, mVar26, 48, 0);
                } else {
                    mVar26.e();
                }
                return Unit.INSTANCE;
        }
    }
}
