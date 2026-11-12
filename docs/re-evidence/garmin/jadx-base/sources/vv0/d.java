package vv0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f180435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f180436c;

    public /* synthetic */ d(f fVar, int i14, int i15) {
        this.f180434a = i15;
        this.f180435b = fVar;
        this.f180436c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f180434a;
        int i15 = this.f180436c;
        f fVar = this.f180435b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i16 = f.f180442f;
        switch (i14) {
            case 0:
                fVar.j(mVar, p3.p0.t(i15 | 1));
                break;
            case 1:
                fVar.i(mVar, p3.p0.t(i15 | 1));
                break;
            case 2:
                fVar.g(mVar, p3.p0.t(i15 | 1));
                break;
            default:
                fVar.h(mVar, p3.p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
