package da0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f58710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f58711c;

    public /* synthetic */ h(float f14, int i14, int i15) {
        this.f58709a = i15;
        this.f58710b = f14;
        this.f58711c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f58709a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                i.a(this.f58710b, mVar, p0.t(this.f58711c | 1));
                break;
            case 1:
                m0.c(this.f58710b, mVar, p0.t(this.f58711c | 1));
                break;
            default:
                m0.c(this.f58710b, mVar, p0.t(this.f58711c | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
