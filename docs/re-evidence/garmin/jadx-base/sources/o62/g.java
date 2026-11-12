package o62;

import c2.x2;
import i3.p7;
import p005kotlin.Unit;
import p3.x1;
import p3.y3;
import u1.y0;
import v62.s9;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129665a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f129666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f129667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f129668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.p f129669e;

    public /* synthetic */ g(String str, boolean z14, boolean z15, e23.p pVar) {
        this.f129666b = str;
        this.f129667c = z14;
        this.f129668d = z15;
        this.f129669e = pVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f129665a) {
            case 0:
                ((Integer) obj2).getClass();
                h.a(this.f129666b, this.f129667c, this.f129668d, this.f129669e, (p3.m) obj, p3.p0.t(3073));
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (this.f129666b.length() > 0) {
                        mVar.C(64812408);
                        if (this.f129667c) {
                            mVar.C(64854847);
                            y3 y3Var = p7.f89282d;
                            g6.f.f75994b.getClass();
                            p3.v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(1379905618, new uj1.y(this.f129669e, 15), mVar), mVar, 56);
                            mVar.f();
                            Unit unit = Unit.INSTANCE;
                        } else {
                            mVar.C(65699690);
                            mVar.f();
                        }
                        mVar.f();
                    } else {
                        mVar.C(65796844);
                        if (this.f129668d) {
                            mVar.C(65869353);
                            h4.r.a aVar = h4.r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            h4.r rVarQ = x2.q(aVar, j92.b.f97901d.f97905d);
                            s62.a.f157643a.getClass();
                            y0.b(s9.a(t62.b.f162798a), null, rVarQ, null, mVar, 48, 120);
                            mVar.f();
                        } else {
                            mVar.C(66138278);
                            mVar.f();
                        }
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(String str, boolean z14, boolean z15, e23.p pVar, int i14) {
        this.f129666b = str;
        this.f129667c = z14;
        this.f129668d = z15;
        this.f129669e = pVar;
    }
}
