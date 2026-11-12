package c70;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f25227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o82.a f25228c;

    public /* synthetic */ f(i iVar, o82.a aVar, int i14) {
        this.f25226a = i14;
        this.f25227b = iVar;
        this.f25228c = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f25226a) {
            case 0:
                this.f25227b.f25239h.i(this.f25228c, true);
                break;
            case 1:
                this.f25227b.f25236e.i(this.f25228c, true);
                break;
            case 2:
                this.f25227b.f25237f.i(this.f25228c, true);
                break;
            default:
                this.f25227b.f25238g.i(this.f25228c, true);
                break;
        }
        return Unit.INSTANCE;
    }
}
