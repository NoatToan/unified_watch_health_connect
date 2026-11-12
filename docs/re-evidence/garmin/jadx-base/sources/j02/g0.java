package j02;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.m2;
import s1.j1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lj02/g0;", "Lj02/i;", "Le2/n;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 implements i<e2.n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e2.i0 f96069a;

    public g0(e2.i0 i0Var) {
        this.f96069a = i0Var;
    }

    @Override // j02.i
    public final int a() {
        return this.f96069a.i();
    }

    @Override // j02.i
    public final int b() {
        return this.f96069a.h();
    }

    @Override // j02.i
    public final f0 c() {
        return new f0(this.f96069a.j());
    }

    @Override // j02.i
    public final Unit d(int i14, int i15) {
        this.f96069a.k(i14, i15);
        return Unit.INSTANCE;
    }

    @Override // j02.i
    public final Object e(float f14, j1 j1Var, a0 a0Var) {
        return m2.a(this.f96069a, f14, j1Var, a0Var);
    }
}
