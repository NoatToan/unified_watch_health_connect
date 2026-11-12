package aq;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f11965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11966c;

    public /* synthetic */ g(h hVar, int i14, int i15) {
        this.f11964a = i15;
        this.f11965b = hVar;
        this.f11966c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f11964a;
        int i15 = this.f11966c;
        h hVar = this.f11965b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i16 = h.f11972f;
        switch (i14) {
            case 0:
                hVar.h(mVar, p3.p0.t(i15 | 1));
                break;
            case 1:
                hVar.i(mVar, p3.p0.t(i15 | 1));
                break;
            default:
                hVar.g(mVar, p3.p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
