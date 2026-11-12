package dj0;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f59911b;

    public /* synthetic */ e(h hVar, int i14, int i15) {
        this.f59910a = i15;
        this.f59911b = hVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f59910a;
        h hVar = this.f59911b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i15 = h.f59916g;
        switch (i14) {
            case 0:
                hVar.i(mVar, p0.t(1));
                break;
            case 1:
                hVar.h(mVar, p0.t(1));
                break;
            case 2:
                hVar.k(mVar, p0.t(1));
                break;
            default:
                hVar.j(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
