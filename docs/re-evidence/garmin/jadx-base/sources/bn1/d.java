package bn1;

import android.content.Context;
import b82.d2;
import c2.l;
import c2.t;
import c2.w;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import h4.r;
import l72.t2;
import o4.z0;
import o53.f0;
import p005kotlin.Unit;
import p006l2.l2;
import p006l2.y;
import p3.m;
import p3.n;
import p3.x1;
import p5.v;
import r1.e0;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f19045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19047d;

    public /* synthetic */ d(float f14, Object obj, Object obj2, int i14) {
        this.f19044a = i14;
        this.f19045b = f14;
        this.f19046c = obj;
        this.f19047d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:25:0x011c  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f19044a;
        Object obj4 = this.f19047d;
        Object obj5 = this.f19046c;
        float f14 = this.f19045b;
        switch (i14) {
            case 0:
                z0 z0Var = (z0) obj5;
                z3.e eVar = (z3.e) obj4;
                w wVar = (w) obj;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                wVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(wVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    g6.f.a aVar = g6.f.f75994b;
                    l.f(u1.n.d(x2.h(x2.f(r.S, f14), 16), z0Var, null, 6), mVar);
                    eVar.invoke(new h(wVar.j(), null), mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                e23.l lVar = (e23.l) obj5;
                Double d14 = (Double) obj4;
                t tVar = (t) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(tVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    r rVarY = l.y(r.S, f14);
                    h4.d.f81522a.getClass();
                    r rVarC = tVar.c(rVarY, h4.d.a.f81528f);
                    l2.a aVar2 = l2.f108642a;
                    long jB = f0.B(4);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97930g;
                    y.b((String) lVar.invoke(d14), rVarC, d92.c.b(x0Var, mVar2), null, 0, false, 1, 0, null, l2.a.a(aVar2, jB, x0Var.f157322a.fontSize), mVar2, 1572864, 440);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                ((Integer) obj3).getClass();
                ((e0) obj).getClass();
                x1 x1Var3 = n.f135158a;
                t2.b(f14, (e23.a) obj5, (r) obj4, (m) obj2, 0);
                break;
            default:
                yq.c cVar = (yq.c) obj5;
                Context context = (Context) obj4;
                c2.t2 t2Var = (c2.t2) obj;
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(t2Var) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var4 = n.f135158a;
                    int i15 = iIntValue3;
                    d2 d2Var = d2.f16532a;
                    r.a aVar3 = r.S;
                    float f15 = 16;
                    g6.f.a aVar4 = g6.f.f75994b;
                    r rVarA = l.A(x2.u(aVar3, f14 + f15), 0.0f, f15, 1);
                    int i16 = i15 & 14;
                    d2Var.c(t2Var, "", null, rVarA, null, 0, 0, mVar3, i16 | 48, 58);
                    d2Var.c(t2Var, gl1.y.Q(mVar3, R.string.lbl_run), null, t2Var.a(po.r.e(), 0.5f, true), null, 0, 0, mVar3, i16, 58);
                    String strQ = gl1.y.Q(mVar3, R.string.lbl_time);
                    r rVarA2 = t2Var.a(po.r.e(), 1.0f, true);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar5 = h4.d.a.f81538p;
                    int i17 = i16 | 24576;
                    d2Var.c(t2Var, strQ, null, rVarA2, aVar5, 0, 0, mVar3, i17, 50);
                    String strQ2 = gl1.y.Q(mVar3, R.string.lbl_avg_speed);
                    String strQ3 = gl1.y.Q(mVar3, yq.c.h(false));
                    r rVarA3 = t2Var.a(po.r.e(), 1.0f, true);
                    boolean zR = mVar3.r(context) | mVar3.r(cVar);
                    Object objQ = mVar3.q();
                    m.a aVar6 = m.f135153a;
                    if (zR) {
                        objQ = new ot.c(context, cVar, 3);
                        mVar3.K(objQ);
                    } else {
                        aVar6.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ot.c(context, cVar, 3);
                            mVar3.K(objQ);
                        }
                    }
                    d2Var.c(t2Var, strQ2, strQ3, v.b(rVarA3, (e23.l) objQ), aVar5, 0, 0, mVar3, i17, 48);
                    String strQ4 = gl1.y.Q(mVar3, R.string.lbl_distance);
                    String strQ5 = gl1.y.Q(mVar3, yq.c.e(false));
                    r rVarA4 = t2Var.a(po.r.e(), 1.0f, true);
                    boolean zR2 = mVar3.r(context) | mVar3.r(cVar);
                    Object objQ2 = mVar3.q();
                    if (zR2) {
                        objQ2 = new ot.c(context, cVar, 4);
                        mVar3.K(objQ2);
                    } else {
                        aVar6.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new ot.c(context, cVar, 4);
                            mVar3.K(objQ2);
                        }
                    }
                    d2Var.c(t2Var, strQ4, strQ5, v.b(rVarA4, (e23.l) objQ2), aVar5, 0, 0, mVar3, i17, 48);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
