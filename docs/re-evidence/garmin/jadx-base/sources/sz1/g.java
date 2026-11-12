package sz1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oz1.b f161554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f161555c;

    public /* synthetic */ g(oz1.b bVar, int i14, int i15) {
        this.f161553a = i15;
        this.f161554b = bVar;
        this.f161555c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f161553a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                h.a(this.f161554b, mVar, p0.t(this.f161555c | 1));
                break;
            default:
                l.c(this.f161554b, mVar, p0.t(this.f161555c | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
