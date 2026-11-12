package am;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f4003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f4004c;

    public /* synthetic */ h1(e23.l lVar, x0 x0Var, int i14) {
        this.f4002a = i14;
        this.f4003b = lVar;
        this.f4004c = x0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f4002a) {
            case 0:
                this.f4003b.invoke(this.f4004c);
                break;
            case 1:
                this.f4003b.invoke(this.f4004c);
                break;
            case 2:
                this.f4003b.invoke(this.f4004c);
                break;
            default:
                this.f4003b.invoke(this.f4004c);
                break;
        }
        return Unit.INSTANCE;
    }
}
