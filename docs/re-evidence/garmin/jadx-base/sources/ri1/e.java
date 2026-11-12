package ri1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ti1.b f152819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f152820c;

    public /* synthetic */ e(ti1.b bVar, e23.a aVar, int i14, int i15) {
        this.f152818a = i15;
        this.f152819b = bVar;
        this.f152820c = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f152818a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                i.b(this.f152819b, this.f152820c, mVar, p0.t(1));
                break;
            default:
                si1.h.b(this.f152819b, this.f152820c, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
