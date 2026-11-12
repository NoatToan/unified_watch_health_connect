package t70;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f162854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f162855c;

    public /* synthetic */ h(q qVar, e23.a aVar, int i14, int i15) {
        this.f162853a = i15;
        this.f162854b = qVar;
        this.f162855c = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f162853a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                i.a(this.f162854b, this.f162855c, mVar, p3.p0.t(49));
                break;
            default:
                i.b(this.f162854b, this.f162855c, mVar, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
