package li0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u4.d f112833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f112834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f112835d;

    public /* synthetic */ o0(u4.d dVar, int i14, int i15, int i16, int i17) {
        this.f112832a = i17;
        this.f112833b = dVar;
        this.f112834c = i14;
        this.f112835d = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f112832a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                p0.c(this.f112833b, this.f112834c, this.f112835d, mVar, p3.p0.t(1));
                break;
            default:
                za0.q.d(this.f112833b, this.f112834c, this.f112835d, mVar, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
