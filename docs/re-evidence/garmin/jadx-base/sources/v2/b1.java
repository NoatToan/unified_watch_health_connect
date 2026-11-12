package v2;

import kotlin.a4;
import kotlin.m3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lv2/b1;", "Lx5/g0;", "<init>", "()V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b1 implements x5.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f174890a;

    public interface a {
        o53.c2 B1(v2.a aVar);

        /* JADX INFO: renamed from: Q */
        z2.h2 getF175266c();

        /* JADX INFO: renamed from: W */
        p006l2.b2 getF175265b();

        f5.c0 Z();

        m3 getSoftwareKeyboardController();

        a4 getViewConfiguration();
    }

    @Override // x5.g0
    public final void f() {
        m3 softwareKeyboardController;
        a aVar = this.f174890a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.hide();
    }

    @Override // x5.g0
    public final void h() {
        m3 softwareKeyboardController;
        a aVar = this.f174890a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.show();
    }

    public abstract void i();

    public final void j(y0 y0Var) {
        if (this.f174890a != y0Var) {
            b2.e.c("Expected textInputModifierNode to be " + y0Var + " but was " + this.f174890a);
        }
        this.f174890a = null;
    }
}
