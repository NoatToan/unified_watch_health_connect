package ky0;

import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f107412b;

    public /* synthetic */ l0(w0 w0Var, int i14) {
        this.f107411a = i14;
        this.f107412b = w0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        Object value2;
        switch (this.f107411a) {
            case 0:
                this.f107412b.I4();
                break;
            case 1:
                p2 p2Var = this.f107412b.f107607o1;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, sy0.h.a((sy0.h) value)));
                break;
            case 2:
                this.f107412b.I4();
                break;
            default:
                p2 p2Var2 = this.f107412b.f107607o1;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, sy0.h.a((sy0.h) value2)));
                break;
        }
        return Unit.INSTANCE;
    }
}
