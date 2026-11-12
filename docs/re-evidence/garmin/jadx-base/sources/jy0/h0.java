package jy0;

import c2.x2;
import i3.i7;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f101712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f101713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h4.r f101714d;

    public /* synthetic */ h0(int i14, int i15, h4.r rVar, int i16) {
        this.f101711a = 2;
        this.f101712b = i14;
        this.f101713c = i15;
        this.f101714d = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f101711a;
        h4.r rVar = this.f101714d;
        int i15 = this.f101713c;
        int i16 = this.f101712b;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                num.getClass();
                i0.b(rVar, mVar, p0.t(i16 | 1), i15);
                break;
            case 1:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (i16 == i15) {
                        mVar.C(280547429);
                        int i17 = b3.b.C0219b.f15504a;
                        u4.d dVarA = e3.a.a();
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC = c2.l.C(this.f101714d, j92.b.f97899b.f97923h, 0.0f, 0.0f, 0.0f, 14);
                        h4.d.f81522a.getClass();
                        i7.b(dVarA, null, x2.y(rVarC, h4.d.a.f81528f, 2), 0L, mVar, 48, 8);
                        mVar.f();
                    } else {
                        mVar.C(280980840);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            case 2:
                num.getClass();
                qx1.n.a(i16, i15, p0.t(1), rVar, mVar);
                break;
            case 3:
                int iIntValue2 = num.intValue();
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (i16 == i15) {
                        mVar.C(-1833320167);
                        int i18 = b3.b.C0219b.f15504a;
                        u4.d dVarA2 = e3.a.a();
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC2 = c2.l.C(this.f101714d, j92.b.f97899b.f97923h, 0.0f, 0.0f, 0.0f, 14);
                        h4.d.f81522a.getClass();
                        i7.b(dVarA2, null, x2.y(rVarC2, h4.d.a.f81528f, 2), 0L, mVar, 48, 8);
                        mVar.f();
                    } else {
                        mVar.C(-1832886756);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                ys1.h.b(i16, i15, p0.t(1), rVar, mVar);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h0(int i14, int i15, h4.r rVar, int i16, byte b14) {
        this.f101711a = i16;
        this.f101712b = i14;
        this.f101713c = i15;
        this.f101714d = rVar;
    }

    public /* synthetic */ h0(h4.r rVar, int i14, int i15) {
        this.f101711a = 0;
        this.f101714d = rVar;
        this.f101712b = i14;
        this.f101713c = i15;
    }

    public /* synthetic */ h0(h4.r rVar, int i14, int i15, int i16) {
        this.f101711a = 4;
        this.f101714d = rVar;
        this.f101712b = i14;
        this.f101713c = i15;
    }
}
