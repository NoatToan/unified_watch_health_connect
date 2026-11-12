package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class th implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ri f89827b;

    public /* synthetic */ th(ri riVar, int i14) {
        this.f89826a = i14;
        this.f89827b = riVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f89826a) {
            case 0:
                return p3.p0.n(new x5.l0(j1.a(bi.u(this.f89827b), 14, null), 0L, (s5.w0) null, 6, (p005kotlin.jvm.internal.j) null));
            case 1:
                ri riVar = this.f89827b;
                if (bi.w(riVar)) {
                    riVar.e(riVar.b() - 12);
                }
                return Unit.INSTANCE;
            case 2:
                ri riVar2 = this.f89827b;
                if (!bi.w(riVar2)) {
                    riVar2.e(riVar2.b() + 12);
                }
                return Unit.INSTANCE;
            default:
                return p3.p0.n(new x5.l0(j1.a(this.f89827b.a(), 14, null), 0L, (s5.w0) null, 6, (p005kotlin.jvm.internal.j) null));
        }
    }
}
