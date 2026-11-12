package li0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f112728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f112729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f112730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h4.r f112731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f112732f;

    public /* synthetic */ g0(d0 d0Var, f fVar, float f14, h4.r rVar, int i14, int i15) {
        this.f112727a = i15;
        this.f112728b = d0Var;
        this.f112729c = fVar;
        this.f112730d = f14;
        this.f112731e = rVar;
        this.f112732f = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f112727a) {
            case 0:
                ((Integer) obj2).getClass();
                k0.e(this.f112728b, this.f112729c, this.f112730d, this.f112731e, (p3.m) obj, p3.p0.t(this.f112732f | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                k0.c(this.f112728b, this.f112729c, this.f112730d, this.f112731e, (p3.m) obj, p3.p0.t(this.f112732f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                k0.f(this.f112728b, this.f112729c, this.f112730d, this.f112731e, (p3.m) obj, p3.p0.t(this.f112732f | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
