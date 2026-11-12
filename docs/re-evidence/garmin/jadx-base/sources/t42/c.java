package t42;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f162328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f162329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f162330d;

    public /* synthetic */ c(Long l14, e23.a aVar, e23.a aVar2, int i14, int i15) {
        this.f162327a = i15;
        this.f162328b = l14;
        this.f162329c = aVar;
        this.f162330d = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f162327a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                og.a.c(this.f162328b, this.f162329c, this.f162330d, mVar, p0.t(1));
                break;
            default:
                og2.k.f(this.f162328b, this.f162329c, this.f162330d, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
