package c21;

import e23.l;
import e23.p;
import fv0.f;
import h4.r;
import hn1.g;
import i3.ff;
import i3.h7;
import i3.hf;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import t21.u0;
import yy1.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f22969c;

    public /* synthetic */ a(l lVar, boolean z14) {
        this.f22967a = 3;
        this.f22969c = lVar;
        this.f22968b = z14;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0121  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f22967a;
        l lVar = this.f22969c;
        boolean z14 = this.f22968b;
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    hf.a(this.f22968b, this.f22969c, null, false, d92.c.a(ff.f88115a, mVar), mVar, 0, 92);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                num.getClass();
                f.a(z14, lVar, mVar, p0.t(1));
                break;
            case 2:
                num.getClass();
                g.e(z14, lVar, mVar, p0.t(49));
                break;
            case 3:
                int iIntValue2 = num.intValue();
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    boolean zB = mVar.B(lVar) | mVar.h(z14);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new ad0.e(lVar, z14, 5);
                        mVar.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ad0.e(lVar, z14, 5);
                            mVar.K(objQ);
                        }
                    }
                    i11.c.f87076a.getClass();
                    h7.a((e23.a) objQ, null, false, null, null, i11.c.f87077b, mVar, 1572864, 62);
                } else {
                    mVar.e();
                }
                break;
            case 4:
                int iIntValue3 = num.intValue();
                if (mVar.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    g6.f.a aVar = g6.f.f75994b;
                    hf.a(this.f22968b, this.f22969c, c2.l.A(r.S, 0.0f, 0, 1), false, d92.c.a(ff.f88115a, mVar), mVar, 384, 88);
                } else {
                    mVar.e();
                }
                break;
            case 5:
                int iIntValue4 = num.intValue();
                if (mVar.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    g6.f.a aVar2 = g6.f.f75994b;
                    hf.a(this.f22968b, this.f22969c, c2.l.A(r.S, 0.0f, 0, 1), false, d92.c.a(ff.f88115a, mVar), mVar, 384, 88);
                } else {
                    mVar.e();
                }
                break;
            case 6:
                num.getClass();
                u0.a(z14, lVar, mVar, p0.t(1));
                break;
            case 7:
                int iIntValue5 = num.intValue();
                if (mVar.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    hf.a(this.f22968b, this.f22969c, null, false, d92.c.a(ff.f88115a, mVar), mVar, 0, 92);
                } else {
                    mVar.e();
                }
                break;
            case 8:
                int iIntValue6 = num.intValue();
                if (mVar.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    hf.a(this.f22968b, this.f22969c, null, false, d92.c.a(ff.f88115a, mVar), mVar, 0, 92);
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                v.a(z14, lVar, mVar, p0.t(49));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(boolean z14, l lVar, int i14) {
        this.f22967a = i14;
        this.f22968b = z14;
        this.f22969c = lVar;
    }

    public /* synthetic */ a(boolean z14, l lVar, int i14, int i15) {
        this.f22967a = i15;
        this.f22968b = z14;
        this.f22969c = lVar;
    }
}
