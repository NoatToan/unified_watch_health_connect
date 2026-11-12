package c02;

import c2.a0;
import c2.c1;
import c2.t;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import h4.r;
import i3.i7;
import i3.mh;
import l72.p2;
import o4.e0;
import p005kotlin.Unit;
import p3.x1;
import u1.y0;
import v62.e1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22366b;

    public /* synthetic */ d(boolean z14, int i14) {
        this.f22365a = i14;
        this.f22366b = z14;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f22365a;
        boolean z14 = this.f22366b;
        switch (i14) {
            case 0:
                t tVar = (t) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(tVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    if (z14) {
                        mVar.C(442027541);
                        t4.d dVarA = n5.c.a(R.drawable.ic_chackmark, mVar, 0);
                        gl.c.f77766a.getClass();
                        long jE = gl.c.a(mVar).e();
                        r.a aVar = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        r rVarQ = x2.q(aVar, j92.b.f97901d.f97903b);
                        h4.d.f81522a.getClass();
                        i7.a(dVarA, null, tVar.c(rVarQ, h4.d.a.f81528f), jE, mVar, 48, 0);
                        mVar.f();
                    } else {
                        mVar.C(442378740);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                t tVar2 = (t) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                tVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(tVar2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (z14) {
                        mVar2.C(770840819);
                        s62.a.f157643a.getClass();
                        u4.d dVarA2 = e1.a(t62.b.f162798a);
                        e0.a aVar2 = e0.f128843b;
                        d92.b.f58623a.getClass();
                        o4.r rVarA = e0.a.a(aVar2, d92.b.a(mVar2).f().e());
                        r.a aVar3 = r.S;
                        h4.d.f81522a.getClass();
                        g6.f.a aVar4 = g6.f.f75994b;
                        y0.b(dVarA2, "", x2.q(tVar2.c(aVar3, h4.d.a.f81528f), 16), rVarA, mVar2, 48, 56);
                        mVar2.f();
                    } else {
                        mVar2.C(771224692);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (z14) {
                        mVar3.C(-424931879);
                        p2.f111205a.a(y.Q(mVar3, R.string.txt_loading), mVar3, 0);
                        mVar3.f();
                    } else {
                        mVar3.C(-424839623);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                r rVar = (r) obj;
                p3.m mVar4 = (p3.m) obj2;
                v.h.y(1522717427, rVar, (Integer) obj3, mVar4);
                x1 x1Var4 = p3.n.f135158a;
                r rVarA2 = l4.k.a(rVar, !z14 ? 0.0f : 0.5f);
                mVar4.f();
                return rVarA2;
            case 4:
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i15 = qn0.i.f145805f;
                rVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar5.B(rVar2) ? 4 : 2;
                }
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int i16 = ((iIntValue4 << 3) & 112) | 6;
                    rVar2.k(z3.f.c(-482528558, new pk1.g(rVar2, 19), mVar5), mVar5, i16);
                    rVar2.j(z3.f.c(584151838, new pk1.g(rVar2, 20), mVar5), mVar5, i16);
                    rVar2.j(z3.f.c(1593371925, new pk1.g(rVar2, 21), mVar5), mVar5, i16);
                    rVar2.j(z3.f.c(-555028906, new ap2.f(rVar2, z14, 14), mVar5), mVar5, i16);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                a0 a0Var = (a0) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                a0Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar6.B(a0Var) ? 4 : 2;
                }
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    c2.l.f(a0Var.a(r.S, 1.0f, true), mVar6);
                    if (z14) {
                        mVar6.C(-2124408886);
                        String strQ = y.Q(mVar6, R.string.msg_setup_wifi_info);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar6), mVar6, 0, 0, 131070);
                        mVar6.f();
                    } else {
                        mVar6.C(-2124246477);
                        mVar6.f();
                    }
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((c1) obj).getClass();
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    gl.c.f77766a.getClass();
                    zw1.e.a(0, gl.c.a(mVar7).l(), y.Q(mVar7, R.string.lbl_primary_muscles), mVar7);
                    if (z14) {
                        mVar7.C(-1973063076);
                        zw1.e.a(0, gl.c.a(mVar7).r(), y.Q(mVar7, R.string.lbl_secondary_muscles), mVar7);
                        mVar7.f();
                    } else {
                        mVar7.C(-1972892018);
                        mVar7.f();
                    }
                    d92.b.f58623a.getClass();
                    zw1.e.a(0, d92.b.a(mVar7).c().g(), y.Q(mVar7, R.string.lbl_untargeted_muscles), mVar7);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
        }
    }
}
