package m82;

import p13.h0;
import p13.x;
import p3.a2;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f117168b;

    public /* synthetic */ a(i53.c cVar, int i14) {
        this.f117167a = i14;
        this.f117168b = cVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f117167a) {
            case 0:
                return Integer.valueOf(this.f117168b.size());
            case 1:
                return p0.n(h0.b1(this.f117168b));
            default:
                return new a2(x.i(this.f117168b).f96796a);
        }
    }
}
