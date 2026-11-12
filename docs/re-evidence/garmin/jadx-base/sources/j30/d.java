package j30;

import androidx.room.a0;
import c2.b0;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.x;
import e23.p;
import f5.z0;
import f72.j0;
import gl1.y;
import h4.r;
import h5.e0;
import i3.ff;
import i3.hf;
import i3.i7;
import i3.mh;
import l4.k;
import l72.f0;
import li0.z;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import s5.x0;
import v62.a8;
import v62.e1;
import v62.j9;
import v62.m2;
import v62.o9;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f96848b;

    public /* synthetic */ d(boolean z14, int i14) {
        this.f96847a = 29;
        this.f96848b = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f96847a;
        boolean z14 = this.f96848b;
        switch (i14) {
            case 0:
                boolean z15 = false;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if ((iIntValue & 3) != 2) {
                    z15 = true;
                }
                if (mVar.n(iIntValue & 1, z15)) {
                    x1 x1Var = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = e1.a(t62.b.f162798a);
                    long jG = fb1.c.g(d92.b.f58623a, mVar);
                    r rVarA = k.a(r.S, z14 ? 1.0f : 0.0f);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA, "", x2.q(rVarA, j92.b.f97901d.f97905d), jG, mVar, 48, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                boolean z16 = false;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if ((iIntValue2 & 3) != 2) {
                    z16 = true;
                }
                if (mVar2.n(iIntValue2 & 1, z16)) {
                    x1 x1Var2 = n.f135158a;
                    hf.a(this.f96848b, null, null, false, d92.c.a(ff.f88115a, mVar2), mVar2, 48, 92);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    if (z14) {
                        mVar3.C(-1593269985);
                        r.a aVar = r.S;
                        h4.d.f81522a.getClass();
                        z0 z0VarD = q.d(h4.d.a.f81524b, false);
                        int iHashCode = Long.hashCode(mVar3.getU());
                        i2 i2VarX = mVar3.x();
                        r rVarC = h4.k.c(aVar, mVar3);
                        h5.g.V.getClass();
                        e0.a aVar2 = h5.g.a.f81805b;
                        if (mVar3.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar2);
                        } else {
                            mVar3.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD, mVar3);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar3, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar3);
                        u uVar = u.f22885a;
                        s62.a.f157643a.getClass();
                        u4.d dVarA2 = e1.a(t62.b.f162798a);
                        long jG2 = fb1.c.g(d92.b.f58623a, mVar3);
                        String strQ = y.Q(mVar3, R.string.lbl_selected);
                        d92.b.f58625c.getClass();
                        i7.b(dVarA2, strQ, x2.q(aVar, j92.b.f97901d.f97904c), jG2, mVar3, 0, 0);
                        mVar3.y();
                        mVar3.f();
                    } else {
                        mVar3.C(-1592912493);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                boolean z17 = false;
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if ((iIntValue4 & 3) != 2) {
                    z17 = true;
                }
                if (mVar4.n(iIntValue4 & 1, z17)) {
                    x1 x1Var4 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA3 = e1.a(t62.b.f162798a);
                    long jG3 = fb1.c.g(d92.b.f58623a, mVar4);
                    r rVarA2 = k.a(r.S, z14 ? 1.0f : 0.0f);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA3, "", x2.q(rVarA2, j92.b.f97901d.f97905d), jG3, mVar4, 48, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                boolean z18 = false;
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if ((iIntValue5 & 3) != 2) {
                    z18 = true;
                }
                if (mVar5.n(iIntValue5 & 1, z18)) {
                    x1 x1Var5 = n.f135158a;
                    if (z14) {
                        mVar5.C(641178386);
                        s62.a.f157643a.getClass();
                        u4.d dVarA4 = e1.a(t62.b.f162798a);
                        long jG4 = fb1.c.g(d92.b.f58623a, mVar5);
                        r.a aVar3 = r.S;
                        d92.b.f58625c.getClass();
                        i7.b(dVarA4, null, x2.q(aVar3, j92.b.f97901d.f97904c), jG4, mVar5, 48, 0);
                        mVar5.f();
                    } else {
                        mVar5.C(641425797);
                        mVar5.f();
                    }
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                boolean z19 = false;
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if ((iIntValue6 & 3) != 2) {
                    z19 = true;
                }
                if (mVar6.n(iIntValue6 & 1, z19)) {
                    x1 x1Var6 = n.f135158a;
                    if (z14) {
                        mVar6.C(480790370);
                        s62.a.f157643a.getClass();
                        u4.d dVarA5 = e1.a(t62.b.f162798a);
                        long jG5 = fb1.c.g(d92.b.f58623a, mVar6);
                        r.a aVar4 = r.S;
                        d92.b.f58625c.getClass();
                        i7.b(dVarA5, null, x2.q(aVar4, j92.b.f97901d.f97904c), jG5, mVar6, 48, 0);
                        mVar6.f();
                    } else {
                        mVar6.C(481037781);
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
                    if (z14) {
                        mVar7.C(-2012471240);
                        f0 f0Var = f0.f110999a;
                        r.a aVar5 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f0Var.g(0, 0, a0.c(mVar7), x2.q(l.C(aVar5, 0.0f, 0.0f, j92.b.f97899b.f97917b, 0.0f, 11), j92.b.f97901d.f97903b), mVar7);
                        mVar7.f();
                    } else {
                        mVar7.C(-2012169486);
                        mVar7.f();
                    }
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    s62.a.f157643a.getClass();
                    z.i(j9.a(t62.b.f162798a), z14, mVar8, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    if (z14) {
                        mVar9.C(2052736638);
                        z.j(mVar9, 0);
                        mVar9.f();
                    } else {
                        mVar9.C(2052779883);
                        mVar9.f();
                    }
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    if (z14) {
                        mVar10.C(-536726221);
                        z.j(mVar10, 0);
                        mVar10.f();
                    } else {
                        mVar10.C(-536682976);
                        mVar10.f();
                    }
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    if (z14) {
                        mVar11.C(-113850624);
                        z.j(mVar11, 0);
                        mVar11.f();
                    } else {
                        mVar11.C(-113807379);
                        mVar11.f();
                    }
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    s62.a.f157643a.getClass();
                    z.i(o9.a(t62.b.f162798a), z14, mVar12, 0);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    if (z14) {
                        mVar13.C(-1703075175);
                        z.j(mVar13, 0);
                        mVar13.f();
                    } else {
                        mVar13.C(-1703031930);
                        mVar13.f();
                    }
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                boolean z24 = false;
                m mVar14 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if ((iIntValue14 & 3) != 2) {
                    z24 = true;
                }
                if (mVar14.n(iIntValue14 & 1, z24)) {
                    x1 x1Var14 = n.f135158a;
                    if (z14) {
                        mVar14.C(1073206471);
                        s62.a.f157643a.getClass();
                        i7.b(e1.a(t62.b.f162798a), null, null, fb1.c.g(d92.b.f58623a, mVar14), mVar14, 48, 4);
                        mVar14.f();
                    } else {
                        mVar14.C(1073451526);
                        mVar14.f();
                    }
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                boolean z25 = false;
                m mVar15 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if ((iIntValue15 & 3) != 2) {
                    z25 = true;
                }
                if (mVar15.n(iIntValue15 & 1, z25)) {
                    x1 x1Var15 = n.f135158a;
                    if (z14) {
                        mVar15.C(68470099);
                        s62.a.f157643a.getClass();
                        i7.b(e1.a(t62.b.f162798a), null, null, fb1.c.g(d92.b.f58623a, mVar15), mVar15, 48, 4);
                        mVar15.f();
                    } else {
                        mVar15.C(68715154);
                        mVar15.f();
                    }
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                m mVar16 = (m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    if (z14) {
                        mVar16.C(-1676733100);
                        String strQ2 = y.Q(mVar16, R.string.msg_error_invalid_name_x_former_twitter);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarF = d92.c.f(j92.f.f97933j, mVar16);
                        r.a aVar6 = r.S;
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        mh.c(strQ2, l.z(aVar6, eVar.f97920e, eVar.f97917b), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar16, 0, 0, 131068);
                        mVar16.f();
                    } else {
                        mVar16.C(-1676369036);
                        mVar16.f();
                    }
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 16:
                m mVar17 = (m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = n.f135158a;
                    if (z14) {
                        mVar17.C(-1479730708);
                        String strQ3 = y.Q(mVar17, R.string.msg_valid_url);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarF2 = d92.c.f(j92.f.f97933j, mVar17);
                        r.a aVar7 = r.S;
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        mh.c(strQ3, l.z(aVar7, eVar2.f97920e, eVar2.f97917b), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, mVar17, 0, 0, 131068);
                        mVar17.f();
                    } else {
                        mVar17.C(-1479410974);
                        mVar17.f();
                    }
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 17:
                m mVar18 = (m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = n.f135158a;
                    if (z14) {
                        mVar18.C(239871334);
                        String strQ4 = y.Q(mVar18, R.string.msg_error_invalid_url_facebook);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarF3 = d92.c.f(j92.f.f97933j, mVar18);
                        r.a aVar8 = r.S;
                        d92.b.f58625c.getClass();
                        j92.e eVar3 = j92.b.f97899b;
                        mh.c(strQ4, l.z(aVar8, eVar3.f97920e, eVar3.f97917b), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF3, mVar18, 0, 0, 131068);
                        mVar18.f();
                    } else {
                        mVar18.C(240226749);
                        mVar18.f();
                    }
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 18:
                boolean z26 = false;
                m mVar19 = (m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if ((iIntValue19 & 3) != 2) {
                    z26 = true;
                }
                if (mVar19.n(iIntValue19 & 1, z26)) {
                    x1 x1Var19 = n.f135158a;
                    if (z14) {
                        mVar19.C(-1445701292);
                        s62.a.f157643a.getClass();
                        i7.b(e1.a(t62.b.f162798a), null, null, fb1.c.g(d92.b.f58623a, mVar19), mVar19, 48, 4);
                        mVar19.f();
                    } else {
                        mVar19.C(-1445456237);
                        mVar19.f();
                    }
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 19:
                m mVar20 = (m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x1 x1Var20 = n.f135158a;
                    if (z14) {
                        mVar20.C(-874021623);
                        r.a aVar9 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        zd0.e.c(j92.b.f97901d.f97903b, 0, 6, 0L, l.C(aVar9, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11), mVar20);
                        mVar20.f();
                    } else {
                        mVar20.C(-873756387);
                        mVar20.f();
                    }
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 20:
                m mVar21 = (m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                x xVar = x.f37955a;
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    x1 x1Var21 = n.f135158a;
                    if (z14) {
                        mVar21.C(-940554954);
                        r.a aVar10 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        zd0.e.c(j92.b.f97901d.f97903b, 0, 6, 0L, l.C(aVar10, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11), mVar21);
                        mVar21.f();
                    } else {
                        mVar21.C(-940270498);
                        mVar21.f();
                    }
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 21:
                boolean z27 = false;
                m mVar22 = (m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if ((iIntValue22 & 3) != 2) {
                    z27 = true;
                }
                if (mVar22.n(iIntValue22 & 1, z27)) {
                    x1 x1Var22 = n.f135158a;
                    hf.a(this.f96848b, null, null, false, d92.c.a(ff.f88115a, mVar22), mVar22, 48, 92);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 22:
                boolean z28 = false;
                m mVar23 = (m) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if ((iIntValue23 & 3) != 2) {
                    z28 = true;
                }
                if (mVar23.n(iIntValue23 & 1, z28)) {
                    x1 x1Var23 = n.f135158a;
                    if (z14) {
                        mVar23.C(-286660978);
                        s62.a.f157643a.getClass();
                        u4.d dVarA6 = e1.a(t62.b.f162798a);
                        String strQ5 = y.Q(mVar23, R.string.lbl_selected);
                        long jG6 = fb1.c.g(d92.b.f58623a, mVar23);
                        r.a aVar11 = r.S;
                        d92.b.f58625c.getClass();
                        i7.b(dVarA6, strQ5, x2.q(aVar11, j92.b.f97901d.f97904c), jG6, mVar23, 0, 0);
                        mVar23.f();
                    } else {
                        mVar23.C(-286381854);
                        mVar23.f();
                    }
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
            case 23:
                m mVar24 = (m) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (mVar24.n(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    x1 x1Var24 = n.f135158a;
                    m.a aVar12 = m.f135153a;
                    if (z14) {
                        mVar24.C(662562643);
                        r.a aVar13 = r.S;
                        r rVarF = x2.f(aVar13, 1.0f);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar24, 0);
                        int iHashCode2 = Long.hashCode(mVar24.getU());
                        i2 i2VarX2 = mVar24.x();
                        r rVarC2 = h4.k.c(rVarF, mVar24);
                        h5.g.V.getClass();
                        e0.a aVar14 = h5.g.a.f81805b;
                        if (mVar24.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar24.z();
                        if (mVar24.getT()) {
                            mVar24.M(aVar14);
                        } else {
                            mVar24.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar24);
                        b4.c(h5.g.a.f81809f, i2VarX2, mVar24);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar24.getT() || !s.g(mVar24.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar24, iHashCode2, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar24);
                        b0 b0Var = b0.f22601a;
                        f0.a aVar15 = f0.a.f111000a;
                        b3.b.a aVar16 = b3.b.a.f15503a;
                        u4.d dVarA7 = d3.a.a();
                        r rVarF2 = x2.f(aVar13, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        r rVarC3 = l.C(rVarF2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7);
                        Object objQ = mVar24.q();
                        aVar12.getClass();
                        m.a.C2565a c2565a = m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new nw1.e(25);
                            mVar24.K(objQ);
                        }
                        aVar15.h(24624, 8, (e23.a) objQ, rVarC3, "Add", mVar24, dVarA7, false);
                        u4.d dVarA8 = d3.i.a();
                        r rVarF3 = x2.f(aVar13, 1.0f);
                        Object objQ2 = mVar24.q();
                        if (objQ2 == c2565a) {
                            objQ2 = new nw1.e(26);
                            mVar24.K(objQ2);
                        }
                        aVar15.h(25008, 8, (e23.a) objQ2, rVarF3, "Edit", mVar24, dVarA8, false);
                        mVar24.y();
                        mVar24.f();
                    } else {
                        mVar24.C(663247712);
                        r.a aVar17 = r.S;
                        r rVarF4 = x2.f(aVar17, 1.0f);
                        c2.j jVar = c2.j.f22691a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        float f14 = j92.b.f97899b.f97918c;
                        jVar.getClass();
                        c2.j.i iVarI = c2.j.i(f14);
                        h4.d.f81522a.getClass();
                        s2 s2VarA = q2.a(iVarI, h4.d.a.f81533k, mVar24, 0);
                        int iHashCode3 = Long.hashCode(mVar24.getU());
                        i2 i2VarX3 = mVar24.x();
                        r rVarC4 = h4.k.c(rVarF4, mVar24);
                        h5.g.V.getClass();
                        e0.a aVar18 = h5.g.a.f81805b;
                        if (mVar24.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar24.z();
                        if (mVar24.getT()) {
                            mVar24.M(aVar18);
                        } else {
                            mVar24.c();
                        }
                        b4.c(h5.g.a.f81810g, s2VarA, mVar24);
                        b4.c(h5.g.a.f81809f, i2VarX3, mVar24);
                        h5.g.a.b bVar3 = h5.g.a.f81813j;
                        if (mVar24.getT() || !s.g(mVar24.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar24, iHashCode3, bVar3);
                        }
                        b4.c(h5.g.a.f81807d, rVarC4, mVar24);
                        u2 u2Var = u2.f22900a;
                        f0.a aVar19 = f0.a.f111000a;
                        b3.b.a aVar20 = b3.b.a.f15503a;
                        u4.d dVarA9 = d3.a.a();
                        r rVarA3 = u2Var.a(aVar17, 1.0f, true);
                        Object objQ3 = mVar24.q();
                        aVar12.getClass();
                        m.a.C2565a c2565a2 = m.a.f135155b;
                        if (objQ3 == c2565a2) {
                            objQ3 = new nw1.e(27);
                            mVar24.K(objQ3);
                        }
                        aVar19.h(24624, 8, (e23.a) objQ3, rVarA3, "Add", mVar24, dVarA9, false);
                        u4.d dVarA10 = d3.i.a();
                        r rVarA4 = u2Var.a(aVar17, 1.0f, true);
                        Object objQ4 = mVar24.q();
                        if (objQ4 == c2565a2) {
                            objQ4 = new nw1.e(28);
                            mVar24.K(objQ4);
                        }
                        aVar19.h(24624, 8, (e23.a) objQ4, rVarA4, "Edit", mVar24, dVarA10, false);
                        mVar24.y();
                        mVar24.f();
                    }
                } else {
                    mVar24.e();
                }
                return Unit.INSTANCE;
            case 24:
                m mVar25 = (m) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                o72.z zVar = o72.z.f130696a;
                if (mVar25.n(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    x1 x1Var25 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA11 = j0.a(t62.c.f162799a);
                    d92.b.f58623a.getClass();
                    o72.l.d(dVarA11, d92.b.a(mVar25).f().f(), this.f96848b, mVar25, 0);
                } else {
                    mVar25.e();
                }
                return Unit.INSTANCE;
            case 25:
                m mVar26 = (m) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                o72.z zVar2 = o72.z.f130696a;
                if (mVar26.n(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    x1 x1Var26 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA12 = a8.a(t62.b.f162798a);
                    d92.b.f58623a.getClass();
                    o72.l.d(dVarA12, d92.b.a(mVar26).f().f(), this.f96848b, mVar26, 0);
                } else {
                    mVar26.e();
                }
                return Unit.INSTANCE;
            case 26:
                m mVar27 = (m) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                o72.z zVar3 = o72.z.f130696a;
                if (mVar27.n(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    x1 x1Var27 = n.f135158a;
                    s62.a.f157643a.getClass();
                    o72.l.d(m2.a(t62.b.f162798a), fb1.c.g(d92.b.f58623a, mVar27), this.f96848b, mVar27, 0);
                } else {
                    mVar27.e();
                }
                return Unit.INSTANCE;
            case 27:
                m mVar28 = (m) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                o72.z zVar4 = o72.z.f130696a;
                if (mVar28.n(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    x1 x1Var28 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA13 = m2.a(t62.b.f162798a);
                    d92.b.f58623a.getClass();
                    o72.l.d(dVarA13, d92.b.a(mVar28).f().f(), this.f96848b, mVar28, 0);
                } else {
                    mVar28.e();
                }
                return Unit.INSTANCE;
            case 28:
                m mVar29 = (m) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                o72.z zVar5 = o72.z.f130696a;
                if (mVar29.n(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    x1 x1Var29 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA14 = f72.i2.a(t62.c.f162799a);
                    d92.b.f58623a.getClass();
                    o72.l.d(dVarA14, d92.b.a(mVar29).f().f(), this.f96848b, mVar29, 0);
                } else {
                    mVar29.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                px0.b.a(z14, (m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(boolean z14, int i14, byte b14) {
        this.f96847a = i14;
        this.f96848b = z14;
    }
}
