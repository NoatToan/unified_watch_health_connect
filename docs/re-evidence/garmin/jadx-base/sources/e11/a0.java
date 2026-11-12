package e11;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f61854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b11.v f61855c;

    public /* synthetic */ a0(e23.l lVar, b11.v vVar, int i14) {
        this.f61853a = i14;
        this.f61854b = lVar;
        this.f61855c = vVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f61853a) {
            case 0:
                this.f61854b.invoke(this.f61855c);
                break;
            case 1:
                this.f61854b.invoke(this.f61855c);
                break;
            case 2:
                this.f61854b.invoke(this.f61855c);
                break;
            default:
                this.f61854b.invoke(this.f61855c);
                break;
        }
        return Unit.INSTANCE;
    }
}
