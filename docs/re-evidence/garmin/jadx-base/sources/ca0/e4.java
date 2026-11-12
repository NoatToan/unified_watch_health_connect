package ca0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e4 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f26208b;

    public /* synthetic */ e4(u1 u1Var, int i14) {
        this.f26207a = i14;
        this.f26208b = u1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f26207a) {
            case 0:
                this.f26208b.invoke();
                break;
            case 1:
                this.f26208b.invoke();
                break;
            default:
                this.f26208b.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
