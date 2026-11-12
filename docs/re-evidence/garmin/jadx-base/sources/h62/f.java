package h62;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f82221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f82222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f82223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f82224e;

    public /* synthetic */ f(boolean z14, boolean z15, e23.a aVar, e23.a aVar2, int i14, int i15) {
        this.f82220a = i15;
        this.f82221b = z14;
        this.f82222c = z15;
        this.f82223d = aVar;
        this.f82224e = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f82220a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                k.c(this.f82221b, this.f82222c, this.f82223d, this.f82224e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(7);
                q31.e.a(this.f82221b, this.f82222c, this.f82223d, this.f82224e, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
