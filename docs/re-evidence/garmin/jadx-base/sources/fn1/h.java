package fn1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km1.c f72203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f72204c;

    public /* synthetic */ h(km1.c cVar, int i14, int i15) {
        this.f72202a = i15;
        this.f72203b = cVar;
        this.f72204c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (this.f72202a) {
            case 0:
                num.intValue();
                m.c(this.f72203b, mVar, p0.t(this.f72204c | 1));
                break;
            default:
                num.getClass();
                m.b(this.f72203b, mVar, p0.t(this.f72204c | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
