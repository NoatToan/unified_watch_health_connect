package rk0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f153094b;

    public /* synthetic */ e(q0 q0Var, int i14) {
        this.f153093a = i14;
        this.f153094b = q0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f153093a) {
            case 0:
                this.f153094b.T1();
                break;
            case 1:
                this.f153094b.T1();
                break;
            case 2:
                this.f153094b.T1();
                break;
            case 3:
                this.f153094b.T1();
                break;
            case 4:
                this.f153094b.delete();
                break;
            case 5:
                this.f153094b.a();
                break;
            default:
                this.f153094b.a();
                break;
        }
        return Unit.INSTANCE;
    }
}
