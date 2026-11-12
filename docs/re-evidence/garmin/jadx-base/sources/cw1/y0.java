package cw1;

import p3.a2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class y0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f56255b;

    public /* synthetic */ y0(double d14, int i14) {
        this.f56254a = i14;
        this.f56255b = d14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f56254a) {
            case 0:
                return new a2((int) this.f56255b);
            default:
                return p3.p0.n(Double.valueOf(this.f56255b));
        }
    }
}
