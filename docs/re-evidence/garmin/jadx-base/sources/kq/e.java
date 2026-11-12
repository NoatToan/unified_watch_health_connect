package kq;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f106062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f106063c;

    public /* synthetic */ e(f fVar, int i14, int i15) {
        this.f106061a = i15;
        this.f106062b = fVar;
        this.f106063c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f106061a;
        int i15 = this.f106063c;
        f fVar = this.f106062b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i16 = f.f106067f;
        switch (i14) {
            case 0:
                fVar.h(mVar, p3.p0.t(i15 | 1));
                break;
            case 1:
                fVar.g(mVar, p3.p0.t(i15 | 1));
                break;
            case 2:
                fVar.i(mVar, p3.p0.t(i15 | 1));
                break;
            default:
                fVar.j(mVar, p3.p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
