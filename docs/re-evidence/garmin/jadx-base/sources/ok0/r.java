package ok0;

import p005kotlin.Unit;
import p3.p0;
import sk0.l1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f132515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f132516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z3.e f132517d;

    public /* synthetic */ r(boolean z14, e23.a aVar, z3.e eVar, int i14, int i15) {
        this.f132514a = i15;
        this.f132515b = z14;
        this.f132516c = aVar;
        this.f132517d = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f132514a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                s.c(this.f132515b, this.f132516c, this.f132517d, mVar, p0.t(385));
                break;
            default:
                l1.c(this.f132515b, this.f132516c, this.f132517d, mVar, p0.t(385));
                break;
        }
        return Unit.INSTANCE;
    }
}
