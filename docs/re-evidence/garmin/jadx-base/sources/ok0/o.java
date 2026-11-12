package ok0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f132506b;

    public /* synthetic */ o(n nVar, int i14) {
        this.f132505a = i14;
        this.f132506b = nVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f132505a) {
            case 0:
                this.f132506b.d();
                return Unit.INSTANCE;
            case 1:
                this.f132506b.d();
                return Unit.INSTANCE;
            case 2:
                this.f132506b.d();
                return Unit.INSTANCE;
            case 3:
                return p0.n(this.f132506b.q());
            case 4:
                this.f132506b.u1();
                return Unit.INSTANCE;
            default:
                this.f132506b.u1();
                return Unit.INSTANCE;
        }
    }
}
