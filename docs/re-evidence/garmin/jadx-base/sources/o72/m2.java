package o72;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.m1 f130482b;

    public /* synthetic */ m2(p3.m1 m1Var, int i14) {
        this.f130481a = i14;
        this.f130482b = m1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f130481a) {
            case 0:
                this.f130482b.i(0.0f);
                break;
            default:
                p3.m1 m1Var = this.f130482b;
                if (m1Var.getFloatValue() < 1.0f) {
                    m1Var.i(m1Var.getFloatValue() + 0.1f);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
