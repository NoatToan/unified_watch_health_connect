package ds0;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f61083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f61084c;

    public /* synthetic */ k(l lVar, int i14, int i15) {
        this.f61082a = i15;
        this.f61083b = lVar;
        this.f61084c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f61082a;
        int i15 = this.f61084c;
        l lVar = this.f61083b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i16 = l.f61085f;
        switch (i14) {
            case 0:
                lVar.g(mVar, p0.t(i15 | 1));
                break;
            case 1:
                lVar.h(mVar, p0.t(i15 | 1));
                break;
            default:
                lVar.i(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
