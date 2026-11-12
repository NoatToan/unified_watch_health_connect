package b82;

import i3.i7;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f16451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f16452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16456g;

    public /* synthetic */ b(h4.r rVar, e23.p pVar, e23.p pVar2, long j8, int i14, int i15) {
        this.f16450a = 0;
        this.f16451b = rVar;
        this.f16455f = pVar;
        this.f16456g = pVar2;
        this.f16452c = j8;
        this.f16453d = i14;
        this.f16454e = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16450a) {
            case 0:
                ((Integer) obj2).getClass();
                c.a(this.f16451b, (e23.p) this.f16455f, (e23.p) this.f16456g, this.f16452c, (p3.m) obj, p3.p0.t(this.f16453d | 1), this.f16454e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                i7.b((u4.d) this.f16455f, (String) this.f16456g, this.f16451b, this.f16452c, (p3.m) obj, p3.p0.t(this.f16453d | 1), this.f16454e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                i7.a((t4.d) this.f16455f, (String) this.f16456g, this.f16451b, this.f16452c, (p3.m) obj, p3.p0.t(this.f16453d | 1), this.f16454e);
                break;
            default:
                ((Integer) obj2).getClass();
                l72.n0.a(this.f16451b, (l72.j0) this.f16455f, this.f16452c, (e23.l) this.f16456g, (p3.m) obj, p3.p0.t(this.f16453d | 1), this.f16454e);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(h4.r rVar, l72.j0 j0Var, long j8, e23.l lVar, int i14, int i15) {
        this.f16450a = 3;
        this.f16451b = rVar;
        this.f16455f = j0Var;
        this.f16452c = j8;
        this.f16456g = lVar;
        this.f16453d = i14;
        this.f16454e = i15;
    }

    public /* synthetic */ b(Object obj, String str, h4.r rVar, long j8, int i14, int i15, int i16) {
        this.f16450a = i16;
        this.f16455f = obj;
        this.f16456g = str;
        this.f16451b = rVar;
        this.f16452c = j8;
        this.f16453d = i14;
        this.f16454e = i15;
    }
}
