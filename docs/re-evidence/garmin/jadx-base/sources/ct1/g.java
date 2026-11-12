package ct1;

import e23.p;
import h4.r;
import o4.d0;
import p005kotlin.Unit;
import p3.p0;
import w52.q1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f55501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f55502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f55503e;

    public /* synthetic */ g(int i14, d0 d0Var, int i15, int i16) {
        this.f55499a = 1;
        this.f55500b = i14;
        this.f55503e = d0Var;
        this.f55501c = i15;
        this.f55502d = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f55499a;
        int i15 = this.f55502d;
        int i16 = this.f55501c;
        int i17 = this.f55500b;
        Object obj3 = this.f55503e;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                l.b((r) obj3, this.f55500b, this.f55501c, this.f55502d, (p3.m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                kn1.j.c(i17, (d0) obj3, (p3.m) obj, p0.t(i16 | 1), i15);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int i18 = q42.p.f142668f;
                ((q42.p) obj3).k(i17, i16, p0.t(i15 | 1), (p3.m) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                q1.b(i17, p0.t(i16 | 1), i15, (String) obj3, (p3.m) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(r rVar, int i14, int i15, int i16, int i17) {
        this.f55499a = 0;
        this.f55503e = rVar;
        this.f55500b = i14;
        this.f55501c = i15;
        this.f55502d = i16;
    }

    public /* synthetic */ g(Object obj, int i14, int i15, int i16, int i17) {
        this.f55499a = i17;
        this.f55503e = obj;
        this.f55500b = i14;
        this.f55501c = i15;
        this.f55502d = i16;
    }
}
