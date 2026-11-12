package g02;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74416a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f74417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f74418c;

    public /* synthetic */ i0(int i14, boolean z14, int i15) {
        this.f74418c = i14;
        this.f74417b = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f74416a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                k0.b(this.f74418c, p3.p0.t(1), mVar, this.f74417b);
                break;
            default:
                z21.f.b(this.f74417b, mVar, p3.p0.t(this.f74418c | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i0(boolean z14, int i14) {
        this.f74417b = z14;
        this.f74418c = i14;
    }
}
