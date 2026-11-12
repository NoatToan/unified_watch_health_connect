package kq;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f106088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f106089c;

    public /* synthetic */ j(k kVar, int i14, int i15) {
        this.f106087a = i15;
        this.f106088b = kVar;
        this.f106089c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f106087a;
        int i15 = this.f106089c;
        k kVar = this.f106088b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i16 = k.f106092f;
        switch (i14) {
            case 0:
                kVar.h(mVar, p3.p0.t(i15 | 1));
                break;
            case 1:
                kVar.g(mVar, p3.p0.t(i15 | 1));
                break;
            default:
                kVar.i(mVar, p3.p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
