package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public class ry6 implements ll9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sy6 f33055a;

    public ry6(sy6 sy6Var) {
        this.f33055a = sy6Var;
    }

    public static qy6 b(hy6 hy6Var, py6 py6Var) {
        return c(hy6Var, py6Var, Executors.newSingleThreadExecutor());
    }

    public static qy6 c(hy6 hy6Var, py6 py6Var, Executor executor) {
        return new qy6(py6Var, hy6Var.h(), new qy6.c(hy6Var.k(), hy6Var.j(), hy6Var.f()), hy6Var.d(), hy6Var.c(), hy6Var.g(), hy6Var.e(), executor, hy6Var.i());
    }

    @Override // defpackage.ll9
    public kl9 a(hy6 hy6Var) {
        return b(hy6Var, this.f33055a.a(hy6Var));
    }
}
