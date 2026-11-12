package bv1;

import g81.i0;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f21448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21450d;

    public /* synthetic */ v(Object obj, boolean z14, int i14, int i15) {
        this.f21447a = i15;
        this.f21450d = obj;
        this.f21448b = z14;
        this.f21449c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21447a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(this.f21449c | 1);
                y.c((iw1.a) this.f21450d, this.f21448b, (p3.m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(this.f21449c | 1);
                c.w.b(this.f21448b, (e23.p) this.f21450d, (p3.m) obj, iT2);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int iT3 = p0.t(this.f21449c | 1);
                d81.a0.b(this.f21448b, (i0) this.f21450d, (p3.m) obj, iT3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iT4 = p0.t(this.f21449c | 1);
                ic1.b.c((Double) this.f21450d, this.f21448b, (p3.m) obj, iT4);
                break;
            case 4:
                ((Integer) obj2).intValue();
                int iT5 = p0.t(this.f21449c | 1);
                ik1.b.c(this.f21448b, (hk1.r) this.f21450d, (p3.m) obj, iT5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iT6 = p0.t(this.f21449c | 1);
                in1.j.b((rl1.h) this.f21450d, this.f21448b, (p3.m) obj, iT6);
                break;
            case 6:
                ((Integer) obj2).intValue();
                int iT7 = p0.t(this.f21449c | 1);
                mc1.a.a((dc1.a) this.f21450d, this.f21448b, (p3.m) obj, iT7);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int iT8 = p0.t(this.f21449c | 1);
                ox.f.a(this.f21448b, (bx.a) this.f21450d, (p3.m) obj, iT8);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iT9 = p0.t(this.f21449c | 1);
                rv1.g.c((yw1.r) this.f21450d, this.f21448b, (p3.m) obj, iT9);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int iT10 = p0.t(this.f21449c | 1);
                rv1.g.b((yw1.q) this.f21450d, this.f21448b, (p3.m) obj, iT10);
                break;
            case 10:
                ((Integer) obj2).intValue();
                int iT11 = p0.t(this.f21449c | 1);
                rw0.o.b(this.f21448b, (e23.l) this.f21450d, (p3.m) obj, iT11);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT12 = p0.t(this.f21449c | 1);
                wt0.d.a(this.f21448b, (tt0.e.a) this.f21450d, (p3.m) obj, iT12);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ v(boolean z14, Object obj, int i14, int i15) {
        this.f21447a = i15;
        this.f21448b = z14;
        this.f21450d = obj;
        this.f21449c = i14;
    }
}
