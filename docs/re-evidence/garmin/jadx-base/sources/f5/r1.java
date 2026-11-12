package f5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf5/r1;", "Lf5/v1$a;", "Lh5/o1;", "owner", "<init>", "(Lh5/o1;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r1 extends v1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h5.o1 f69090b;

    public r1(h5.o1 o1Var) {
        this.f69090b = o1Var;
    }

    @Override // f5.v1.a, g6.c
    /* JADX INFO: renamed from: getDensity */
    public final float getF69050b() {
        return this.f69090b.getDensity().getF69050b();
    }

    @Override // f5.v1.a
    /* JADX INFO: renamed from: o */
    public final g6.o getF68958c() {
        return this.f69090b.getLayoutDirection();
    }

    @Override // f5.v1.a
    /* JADX INFO: renamed from: p */
    public final int getF68957b() {
        return this.f69090b.getRoot().T.f81853p.f69144a;
    }

    @Override // f5.v1.a, g6.i
    /* JADX INFO: renamed from: r0 */
    public final float getF69051c() {
        return this.f69090b.getDensity().getF69051c();
    }
}
