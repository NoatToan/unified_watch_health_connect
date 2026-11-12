package c62;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f24893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f24894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f24895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24896e;

    public /* synthetic */ t0(w0 w0Var, boolean z14, e23.a aVar, int i14, int i15) {
        this.f24892a = i15;
        this.f24893b = w0Var;
        this.f24894c = z14;
        this.f24895d = aVar;
        this.f24896e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f24892a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                this.f24893b.b(this.f24894c, this.f24895d, mVar, p3.p0.t(this.f24896e | 1));
                break;
            default:
                this.f24893b.e(this.f24894c, this.f24895d, mVar, p3.p0.t(this.f24896e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
