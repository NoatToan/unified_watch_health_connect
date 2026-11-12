package cq;

import p005kotlin.Unit;
import p3.p0;
import s70.u1;
import vd0.c1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f55017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f55018c;

    public /* synthetic */ g(h4.r rVar, String str, int i14, int i15) {
        this.f55016a = i15;
        this.f55017b = rVar;
        this.f55018c = str;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f55016a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                u.p(p0.t(1), this.f55017b, this.f55018c, mVar);
                break;
            case 1:
                cw1.c.a(p0.t(1), this.f55017b, this.f55018c, mVar);
                break;
            case 2:
                ka0.c.a(p0.t(1), this.f55017b, this.f55018c, mVar);
                break;
            case 3:
                lb0.g.a(p0.t(1), this.f55017b, this.f55018c, mVar);
                break;
            case 4:
                p21.g.a(p0.t(1), this.f55017b, this.f55018c, mVar);
                break;
            case 5:
                rg0.i.c(p0.t(1), this.f55017b, this.f55018c, mVar);
                break;
            case 6:
                s70.s.a(p0.t(1), this.f55017b, this.f55018c, mVar);
                break;
            case 7:
                u1.a(p0.t(1), this.f55017b, this.f55018c, mVar);
                break;
            case 8:
                si1.j.b(p0.t(7), this.f55017b, this.f55018c, mVar);
                break;
            case 9:
                u11.a.a(p0.t(1), this.f55017b, this.f55018c, mVar);
                break;
            case 10:
                c1.b(p0.t(49), this.f55017b, this.f55018c, mVar);
                break;
            case 11:
                wt0.d.e(p0.t(1), this.f55017b, this.f55018c, mVar);
                break;
            case 12:
                x91.i.c(p0.t(1), this.f55017b, this.f55018c, mVar);
                break;
            case 13:
                ys1.f.a(p0.t(1), this.f55017b, this.f55018c, mVar);
                break;
            default:
                ys1.g.a(p0.t(7), this.f55017b, this.f55018c, mVar);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(String str, h4.r rVar, int i14, int i15) {
        this.f55016a = i15;
        this.f55018c = str;
        this.f55017b = rVar;
    }
}
