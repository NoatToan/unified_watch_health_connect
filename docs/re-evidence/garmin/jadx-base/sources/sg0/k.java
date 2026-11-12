package sg0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f159108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ue0.l f159109c;

    public /* synthetic */ k(o0 o0Var, ue0.l lVar, int i14) {
        this.f159107a = i14;
        this.f159108b = o0Var;
        this.f159109c = lVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f159107a) {
            case 0:
                this.f159108b.invoke(this.f159109c);
                break;
            default:
                this.f159108b.invoke(this.f159109c);
                break;
        }
        return Unit.INSTANCE;
    }
}
