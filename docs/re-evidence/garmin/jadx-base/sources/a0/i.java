package a0;

import androidx.camera.core.impl.a2;
import androidx.camera.core.impl.j2;
import androidx.camera.core.impl.v1;
import androidx.camera.core.impl.w1;
import androidx.camera.core.impl.x0;
import b0.c0;

/* JADX INFO: loaded from: classes.dex */
public class i implements j2 {
    public final x0 N;

    public static final class a implements c0<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w1 f36a = w1.U();

        public static a c(x0 x0Var) {
            a aVar = new a();
            x0Var.g(new h(0, aVar, x0Var));
            return aVar;
        }

        public final i a() {
            return new i(a2.T(this.f36a));
        }

        @Override // b0.c0
        public final v1 d() {
            throw null;
        }
    }

    public i(x0 x0Var) {
        this.N = x0Var;
    }

    @Override // androidx.camera.core.impl.j2
    public final x0 getConfig() {
        return this.N;
    }
}
