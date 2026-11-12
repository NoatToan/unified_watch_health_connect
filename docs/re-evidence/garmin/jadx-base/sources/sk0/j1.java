package sk0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1 f159705b;

    public /* synthetic */ j1(i1 i1Var, int i14) {
        this.f159704a = i14;
        this.f159705b = i1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f159704a) {
            case 0:
                return p3.p0.n(this.f159705b.q());
            case 1:
                this.f159705b.W1();
                return Unit.INSTANCE;
            case 2:
                this.f159705b.W1();
                return Unit.INSTANCE;
            default:
                this.f159705b.W1();
                return Unit.INSTANCE;
        }
    }
}
