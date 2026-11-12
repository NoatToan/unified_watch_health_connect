package a3;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.timinggates.TimingGatesActivity;
import f5.v1;
import i3.mh;
import i3.qa;
import kotlin.o3;
import l72.y2;
import p005kotlin.Unit;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a1 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f608b;

    public /* synthetic */ a1(float f14, int i14) {
        this.f607a = i14;
        this.f608b = f14;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f607a;
        float f14 = this.f608b;
        switch (i14) {
            case 0:
                f5.b1 b1Var = (f5.b1) obj;
                int iF0 = b1Var.f0(f14);
                int i15 = iF0 * 2;
                v1 v1VarQ = ((f5.y0) obj2).Q(g6.b.i(0, i15, ((g6.a) obj3).f75988a));
                return f5.b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b - i15, new t0(v1VarQ, iF0, 0));
            case 1:
                h4.r rVar = (h4.r) obj;
                p3.m mVar = (p3.m) obj2;
                v.h.y(356919554, rVar, (Integer) obj3, mVar);
                x1 x1Var = p3.n.f135158a;
                h4.r rVarH = x2.h(rVar, f14);
                mVar.f();
                return rVarH;
            case 2:
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var2 = p3.n.f135158a;
                zs1.d.a(x2.j(h4.r.S, f14, 0.0f, 2), (p3.m) obj2, 0);
                return Unit.INSTANCE;
            case 3:
                h4.r rVar2 = (h4.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                v.h.y(-986048991, rVar2, (Integer) obj3, mVar2);
                x1 x1Var3 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f15 = f14 + j92.b.f97899b.f97918c;
                g6.f.a aVar = g6.f.f75994b;
                h4.r rVarJ = x2.j(rVar2, f15, 0.0f, 2);
                mVar2.f();
                return rVarJ;
            case 4:
                jf.w wVar = (jf.w) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                wVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar3.B(wVar) ? 4 : 2;
                }
                if (mVar3.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    if (((jf.d.c) p3.p0.c(wVar.getF98679b().f98632q, mVar3, 0).getF182175a()) instanceof jf.d.c.C1894d) {
                        mVar3.C(1553901587);
                        jf.v.b(wVar, null, null, null, null, null, 0.0f, null, false, mVar3, iIntValue & 14);
                        mVar3.f();
                    } else {
                        mVar3.C(1553903708);
                        b12.k.a(f14, mVar3, 0);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    qa.f89427a.getClass();
                    x3 x3VarB = s1.f.b(f14 / 100.0f, qa.f89431e, null, mVar4, 0, 28);
                    y2 y2Var = y2.f111386a;
                    float fFloatValue = ((Number) x3VarB.getF182175a()).floatValue();
                    h4.r.a aVar2 = h4.r.S;
                    h4.r rVarF = x2.f(o3.c(aVar2, "device_setup_progress_bar"), 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    y2Var.a(fFloatValue, 0.0f, 0, 0, 124, 0L, 0L, c2.l.C(rVarF, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), mVar4);
                    String strQ = gl1.y.Q(mVar4, R.string.msg_syncing_device);
                    h4.r rVarC = c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar4);
                    d6.h.f57752b.getClass();
                    mh.c(strQ, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar4, 0, 0, 130044);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar5.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    qa.f89427a.getClass();
                    x3 x3VarB2 = s1.f.b(f14 / 100.0f, qa.f89431e, null, mVar5, 0, 28);
                    y2 y2Var2 = y2.f111386a;
                    float fFloatValue2 = ((Number) x3VarB2.getF182175a()).floatValue();
                    h4.r.a aVar3 = h4.r.S;
                    h4.r rVarF2 = x2.f(o3.c(aVar3, "device_setup_progress_bar"), 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    y2Var2.a(fFloatValue2, 0.0f, 0, 0, 124, 0L, 0L, c2.l.C(rVarF2, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), mVar5);
                    String strQ2 = gl1.y.Q(mVar5, R.string.software_update_description);
                    h4.r rVarC2 = c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar2.f97921f, 0.0f, 0.0f, 13);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar5);
                    d6.h.f57752b.getClass();
                    mh.c(strQ2, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar5, 0, 0, 130044);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            default:
                h4.r rVar3 = (h4.r) obj;
                p3.m mVar6 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                TimingGatesActivity.a aVar4 = TimingGatesActivity.f29952c;
                rVar3.getClass();
                mVar6.C(923029217);
                x1 x1Var7 = p3.n.f135158a;
                h4.r rVarU = x2.u(rVar3, f14);
                mVar6.f();
                return rVarU;
        }
    }
}
