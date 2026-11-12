package j21;

import c2.a0;
import c2.b0;
import c2.c1;
import c2.t2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import gl1.y;
import h5.e0;
import i3.mh;
import i3.ve;
import java.util.Locale;
import kotlin.o3;
import l72.n2;
import l72.p2;
import l72.r1;
import l72.w;
import o4.d0;
import o53.f0;
import p005kotlin.Unit;
import p006l2.l2;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import p5.v;
import s5.x0;
import s70.r0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f96703b;

    public /* synthetic */ p(String str, int i14) {
        this.f96702a = i14;
        this.f96703b = str;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0438  */
    /* JADX WARN: Code duplicated, block: B:14:0x0057  */
    /* JADX WARN: Code duplicated, block: B:159:0x049d  */
    /* JADX WARN: Code duplicated, block: B:186:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:260:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:267:0x0921  */
    /* JADX WARN: Code duplicated, block: B:301:0x0a5e  */
    /* JADX WARN: Code duplicated, block: B:351:0x0c3f  */
    /* JADX WARN: Code duplicated, block: B:89:0x02a7  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        int i14 = this.f96702a;
        int i15 = 11;
        int i16 = 3;
        p3.m.a aVar = p3.m.f135153a;
        int i17 = 17;
        String str = this.f96703b;
        boolean z14 = false;
        switch (i14) {
            case 0:
                h4.r rVar = (h4.r) obj;
                p3.m mVar = (p3.m) obj2;
                v.h.y(-406827007, rVar, (Integer) obj3, mVar);
                x1 x1Var = p3.n.f135158a;
                boolean zB = mVar.B(str);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new i11.g(str, 27);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new i11.g(str, 27);
                        mVar.K(objQ);
                    }
                }
                h4.r rVarC = v.c((e23.l) objQ, rVar, false);
                mVar.f();
                return rVarC;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c1) obj).getClass();
                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strQ = y.Q(mVar2, R.string.label_last_4w);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97933j;
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131070);
                    if (str == null) {
                        mVar2.C(-1853525047);
                        mVar2.f();
                    } else {
                        mVar2.C(-1853525046);
                        mh.c(y.P(R.string.lbl_common_since_date, new Object[]{str}, mVar2), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131070);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                c2.t tVar = (c2.t) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar3.B(tVar) ? 4 : 2;
                }
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC2 = tVar.c(aVar2, h4.d.a.f81528f);
                    c2.j.f22691a.getClass();
                    z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar3, 0);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    h4.r rVarC3 = h4.k.c(rVarC2, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar3);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar3);
                    b0 b0Var = b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(this.f96703b, b0Var.b(aVar2, h4.d.a.f81537o), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar3), mVar3, 0, 0, 131068);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                h4.r rVar2 = (h4.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                v.h.y(-476555346, rVar2, (Integer) obj3, mVar4);
                x1 x1Var4 = p3.n.f135158a;
                boolean zB2 = mVar4.B(str);
                Object objQ2 = mVar4.q();
                if (zB2) {
                    objQ2 = new jl0.e(str, i15);
                    mVar4.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new jl0.e(str, i15);
                        mVar4.K(objQ2);
                    }
                }
                h4.r rVarC4 = v.c((e23.l) objQ2, rVar2, false);
                mVar4.f();
                return rVarC4;
            case 4:
                t2 t2Var = (t2) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                w.a aVar4 = w.a.f111302a;
                t2Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar5.B(t2Var) ? 4 : 2;
                }
                if (mVar5.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar5);
                    h4.r.a aVar5 = h4.r.S;
                    h4.d.f81522a.getClass();
                    mh.c(this.f96703b, t2Var.c(aVar5, h4.d.a.f81534l), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar5, 0, 0, 131068);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar6.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    d6.p.f57793b.getClass();
                    int i18 = d6.p.f57795d;
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = c2.l.y(aVar6, j92.b.f97899b.f97917b);
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(upperCase, rVarY, 0L, null, 0L, null, 0L, null, 0L, i18, false, 1, 0, null, d92.c.e(j92.f.f97933j), mVar6, 0, 28032, 102396);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                h4.r rVar3 = (h4.r) obj;
                p3.m mVar7 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                p2 p2Var = p2.f111205a;
                rVar3.getClass();
                mVar7.C(-1310841567);
                x1 x1Var7 = p3.n.f135158a;
                boolean zB3 = mVar7.B(str);
                Object objQ3 = mVar7.q();
                if (zB3) {
                    objQ3 = new jl0.e(str, 29);
                    mVar7.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new jl0.e(str, 29);
                        mVar7.K(objQ3);
                    }
                }
                h4.r rVarC5 = v.c((e23.l) objQ3, rVar3, false);
                mVar7.f();
                return rVarC5;
            case 7:
                h4.r rVar4 = (h4.r) obj;
                p3.m mVar8 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                p2 p2Var2 = p2.f111205a;
                rVar4.getClass();
                mVar8.C(2076261540);
                x1 x1Var8 = p3.n.f135158a;
                boolean zB4 = mVar8.B(str);
                Object objQ4 = mVar8.q();
                if (zB4) {
                    objQ4 = new n2(str, z14 ? 1 : 0);
                    mVar8.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new n2(str, z14 ? 1 : 0);
                        mVar8.K(objQ4);
                    }
                }
                h4.r rVarC6 = v.c((e23.l) objQ4, rVar4, false);
                mVar8.f();
                return rVarC6;
            case 8:
                h4.r rVar5 = (h4.r) obj;
                p3.m mVar9 = (p3.m) obj2;
                v.h.y(-105652354, rVar5, (Integer) obj3, mVar9);
                x1 x1Var9 = p3.n.f135158a;
                h4.r rVarC7 = o3.c(rVar5, str);
                mVar9.f();
                return rVarC7;
            case 9:
                p3.m mVar10 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var10 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                long jC = d0.c(0.6f, d92.b.a(mVar10).e().d(), 14);
                d92.b.f58625c.getClass();
                ve.a(c2.l.y(h4.r.S, j92.b.f97899b.f97920e), k2.i.a(j92.b.f97900c.f97910b), jC, 0L, 0.0f, 0.0f, null, z3.f.c(-1393044170, new fv1.b(str, 21), mVar10), mVar10, 12582912, 120);
                return Unit.INSTANCE;
            case 10:
                c2.t tVar2 = (c2.t) obj;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                tVar2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar11.B(tVar2) ? 4 : 2;
                }
                if (mVar11.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var11 = p3.n.f135158a;
                    h4.r rVarY2 = c2.l.y(h4.r.S, yz1.k.d(mVar11));
                    h4.d.f81522a.getClass();
                    h4.r rVarC8 = tVar2.c(rVarY2, h4.d.a.f81528f);
                    l2.a aVar7 = l2.f108642a;
                    long jB = f0.B(4);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var2 = j92.f.f97930g;
                    p006l2.y.b(this.f96703b, rVarC8, d92.c.b(d92.c.e(x0Var2), mVar11), null, 0, false, 1, 0, null, l2.a.a(aVar7, jB, x0Var2.f157322a.fontSize), mVar11, 1572864, 440);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                c2.t tVar3 = (c2.t) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                tVar3.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar12.B(tVar3) ? 4 : 2;
                }
                if (mVar12.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var12 = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC9 = tVar3.c(aVar8, h4.d.a.f81528f);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(this.f96703b, rVarC9, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar12), mVar12, 0, 0, 131068);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar13.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var13 = p3.n.f135158a;
                    r1.b(y.P(R.string.lbl_activity_type_workouts, new Object[]{str}, mVar13), null, mVar13, 0, 2);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar14.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var14 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarC10 = c2.l.C(c2.l.A(rVarF, eVar.f97920e, 0.0f, 2), 0.0f, eVar.f97920e, 0.0f, eVar.f97918c, 5);
                    d92.b.f58624b.getClass();
                    mh.c(this.f96703b, rVarC10, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, mVar14, 0, 0, 131068);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar15.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var15 = p3.n.f135158a;
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    h4.r rVarC11 = c2.l.C(c2.l.A(rVarF2, eVar2.f97920e, 0.0f, 2), 0.0f, eVar2.f97916a, 0.0f, eVar2.f97918c, 5);
                    d92.b.f58624b.getClass();
                    g02.q.b(this.f96703b, rVarC11, 3, d92.c.f(j92.f.f97932i, mVar15), null, null, null, null, mVar15, 384, PsExtractor.VIDEO_STREAM_MASK);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                h4.r rVar6 = (h4.r) obj;
                p3.m mVar16 = (p3.m) obj2;
                v.h.y(1198322614, rVar6, (Integer) obj3, mVar16);
                x1 x1Var16 = p3.n.f135158a;
                boolean zB5 = mVar16.B(str);
                Object objQ5 = mVar16.q();
                if (zB5) {
                    objQ5 = new o60.b(str, i16);
                    mVar16.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new o60.b(str, i16);
                        mVar16.K(objQ5);
                    }
                }
                h4.r rVarC12 = v.c((e23.l) objQ5, rVar6, false);
                mVar16.f();
                return rVarC12;
            case 16:
                p3.m mVar17 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar17.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var17 = p3.n.f135158a;
                    h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC13 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                    d92.b.f58624b.getClass();
                    x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar17);
                    d6.h.f57752b.getClass();
                    mh.c(this.f96703b, rVarC13, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar17, 0, 0, 130044);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar18 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar18.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var18 = p3.n.f135158a;
                    h4.r rVarF4 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC14 = c2.l.C(rVarF4, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                    d92.b.f58624b.getClass();
                    x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar18);
                    d6.h.f57752b.getClass();
                    mh.c(this.f96703b, rVarC14, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, mVar18, 0, 0, 130044);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 18:
                h4.r rVar7 = (h4.r) obj;
                p3.m mVar19 = (p3.m) obj2;
                v.h.y(-529253000, rVar7, (Integer) obj3, mVar19);
                x1 x1Var19 = p3.n.f135158a;
                boolean zB6 = mVar19.B(str);
                Object objQ6 = mVar19.q();
                if (zB6) {
                    objQ6 = new o60.b(str, i17);
                    mVar19.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new o60.b(str, i17);
                        mVar19.K(objQ6);
                    }
                }
                h4.r rVarC15 = v.c((e23.l) objQ6, rVar7, true);
                mVar19.f();
                return rVarC15;
            case 19:
                p3.m mVar20 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar20.n(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    x1 x1Var20 = p3.n.f135158a;
                    rv1.i.b(str, mVar20, 0);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 20:
                h4.r rVar8 = (h4.r) obj;
                p3.m mVar21 = (p3.m) obj2;
                v.h.y(-917925262, rVar8, (Integer) obj3, mVar21);
                x1 x1Var21 = p3.n.f135158a;
                boolean zB7 = mVar21.B(str);
                Object objQ7 = mVar21.q();
                if (zB7) {
                    objQ7 = new r0(str, 11);
                    mVar21.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new r0(str, 11);
                        mVar21.K(objQ7);
                    }
                }
                h4.r rVarC16 = v.c((e23.l) objQ7, rVar8, false);
                mVar21.f();
                return rVarC16;
            case 21:
                c2.t tVar4 = (c2.t) obj;
                p3.m mVar22 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                tVar4.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= mVar22.B(tVar4) ? 4 : 2;
                }
                if (mVar22.n(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    x1 x1Var22 = p3.n.f135158a;
                    h4.r.a aVar9 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC17 = tVar4.c(aVar9, h4.d.a.f81528f);
                    c2.j.f22691a.getClass();
                    z zVarA2 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar22, 0);
                    int iHashCode2 = Long.hashCode(mVar22.getU());
                    i2 i2VarX2 = mVar22.x();
                    h4.r rVarC18 = h4.k.c(rVarC17, mVar22);
                    h5.g.V.getClass();
                    e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar22.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar22.z();
                    if (mVar22.getT()) {
                        mVar22.M(aVar10);
                    } else {
                        mVar22.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar22);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar22);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar22.getT() || !p005kotlin.jvm.internal.s.g(mVar22.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar22, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC18, mVar22);
                    b0 b0Var2 = b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(this.f96703b, b0Var2.b(aVar9, h4.d.a.f81537o), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97928e, mVar22), mVar22, 0, 0, 131068);
                    mVar22.y();
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 22:
                t2 t2Var2 = (t2) obj;
                p3.m mVar23 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= mVar23.B(t2Var2) ? 4 : 2;
                }
                if (mVar23.n(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    x1 x1Var23 = p3.n.f135158a;
                    l72.x0 x0Var3 = l72.x0.f111346a;
                    String strQ2 = y.Q(mVar23, R.string.calories_average_total);
                    String strQ3 = y.Q(mVar23, R.string.lbl_total);
                    String str2 = this.f96703b;
                    b92.a aVarB = ty.a.b(strQ3, str2, mVar23);
                    int i19 = iIntValue14 & 14;
                    int i24 = b92.a.f16960b;
                    int i25 = l72.x0.f111348c;
                    x0Var3.a((i25 << 24) | i19, 60, aVarB, t2Var2, null, null, str2, strQ2, null, null, mVar23);
                    x0Var3.h(t2Var2, mVar23, i19 | (i25 << 3));
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
            case 23:
                h4.r rVar9 = (h4.r) obj;
                p3.m mVar24 = (p3.m) obj2;
                v.h.y(947786814, rVar9, (Integer) obj3, mVar24);
                x1 x1Var24 = p3.n.f135158a;
                boolean zB8 = mVar24.B(str);
                Object objQ8 = mVar24.q();
                if (zB8) {
                    objQ8 = new u91.c(str, 2);
                    mVar24.K(objQ8);
                } else {
                    aVar.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new u91.c(str, 2);
                        mVar24.K(objQ8);
                    }
                }
                h4.r rVarC19 = v.c((e23.l) objQ8, rVar9, false);
                mVar24.f();
                return rVarC19;
            case 24:
                t2 t2Var3 = (t2) obj;
                p3.m mVar25 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= mVar25.B(t2Var3) ? 4 : 2;
                }
                if (mVar25.n(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    x1 x1Var25 = p3.n.f135158a;
                    l72.x0 x0Var4 = l72.x0.f111346a;
                    String str3 = this.f96703b;
                    str3.getClass();
                    String strQ4 = y.Q(mVar25, R.string.activity_stats_details_total_time_label);
                    int i26 = iIntValue15 & 14;
                    int i27 = l72.x0.f111348c;
                    x0Var4.f((i27 << 24) | i26, 124, null, t2Var3, null, null, str3, strQ4, null, null, mVar25);
                    x0Var4.h(t2Var3, mVar25, i26 | (i27 << 3));
                } else {
                    mVar25.e();
                }
                return Unit.INSTANCE;
            case 25:
                p3.m mVar26 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar26.n(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    x1 x1Var26 = p3.n.f135158a;
                    h4.r.a aVar11 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar11, j92.b.f97899b.f97918c), mVar26);
                    d92.b.f58624b.getClass();
                    mh.c(this.f96703b, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar26), mVar26, 0, 0, 131070);
                } else {
                    mVar26.e();
                }
                return Unit.INSTANCE;
            case 26:
                t2 t2Var4 = (t2) obj;
                p3.m mVar27 = (p3.m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                t2Var4.getClass();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= mVar27.B(t2Var4) ? 4 : 2;
                }
                if (mVar27.n(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    x1 x1Var27 = p3.n.f135158a;
                    wr1.g.b(t2Var4, str, mVar27, iIntValue17 & 14);
                } else {
                    mVar27.e();
                }
                return Unit.INSTANCE;
            case 27:
                t2 t2Var5 = (t2) obj;
                p3.m mVar28 = (p3.m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                t2Var5.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= mVar28.B(t2Var5) ? 4 : 2;
                }
                if (mVar28.n(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    x1 x1Var28 = p3.n.f135158a;
                    wr1.g.b(t2Var5, str, mVar28, iIntValue18 & 14);
                } else {
                    mVar28.e();
                }
                return Unit.INSTANCE;
            case 28:
                p3.m mVar29 = (p3.m) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar29.n(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    x1 x1Var29 = p3.n.f135158a;
                    h4.r rVarF5 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA = c2.l.A(rVarF5, 0.0f, j92.b.f97899b.f97918c, 1);
                    d92.b.f58624b.getClass();
                    mh.c(this.f96703b, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar29), mVar29, 0, 0, 131068);
                } else {
                    mVar29.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar30 = (p3.m) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar30.n(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    x1 x1Var30 = p3.n.f135158a;
                    h4.r.a aVar12 = h4.r.S;
                    String str4 = this.f96703b;
                    boolean zB9 = mVar30.B(str4);
                    Object objQ9 = mVar30.q();
                    if (zB9) {
                        obj4 = objQ9;
                        y01.k kVar = new y01.k(str4, i17);
                        mVar30.K(kVar);
                        obj4 = kVar;
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            obj4 = objQ9;
                            y01.k kVar2 = new y01.k(str4, i17);
                            mVar30.K(kVar2);
                            obj4 = kVar2;
                        }
                    }
                    obj4 = objQ9;
                    h4.r rVarC20 = v.c((e23.l) obj4, aVar12, false);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarA = x0.a(j92.f.f97933j, ds.e0.e(mVar30), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    d6.h.f57752b.getClass();
                    mh.c(str4, rVarC20, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA, mVar30, 0, 0, 130044);
                } else {
                    mVar30.e();
                }
                return Unit.INSTANCE;
        }
    }
}
