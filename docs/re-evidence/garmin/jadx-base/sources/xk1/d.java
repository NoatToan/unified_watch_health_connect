package xk1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f191218b;

    public /* synthetic */ d(f fVar, int i14, int i15) {
        this.f191217a = i15;
        this.f191218b = fVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f191217a;
        f fVar = this.f191218b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i15 = f.f191223j;
        switch (i14) {
            case 0:
                fVar.h(mVar, p0.t(1));
                break;
            case 1:
                fVar.g(mVar, p0.t(1));
                break;
            default:
                fVar.i(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
