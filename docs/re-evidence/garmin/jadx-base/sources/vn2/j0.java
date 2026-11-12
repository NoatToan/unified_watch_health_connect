package vn2;

import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f178902b;

    public /* synthetic */ j0(k0 k0Var, int i14) {
        this.f178901a = i14;
        this.f178902b = k0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f178901a;
        k0 k0Var = this.f178902b;
        switch (i14) {
            case 0:
                Logger logger = k0.f178905d;
                k0Var.getView().q4(0, null);
                break;
            case 1:
                Logger logger2 = k0.f178905d;
                k0Var.getView().q4(-2, null);
                break;
            default:
                Logger logger3 = k0.f178905d;
                k0Var.getView().q4(-2, null);
                break;
        }
        return Unit.INSTANCE;
    }
}
