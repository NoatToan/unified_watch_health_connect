package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class g extends t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f5555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f5556b;

    public g(Executor executor, Handler handler) {
        if (executor == null) {
            j20.x.l("Null cameraExecutor");
            throw null;
        }
        this.f5555a = executor;
        if (handler != null) {
            this.f5556b = handler;
        } else {
            j20.x.l("Null schedulerHandler");
            throw null;
        }
    }

    @Override // androidx.camera.core.impl.t0
    public final Executor a() {
        return this.f5555a;
    }

    @Override // androidx.camera.core.impl.t0
    public final Handler b() {
        return this.f5556b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f5555a.equals(t0Var.a()) && this.f5556b.equals(t0Var.b());
    }

    public final int hashCode() {
        return ((this.f5555a.hashCode() ^ 1000003) * 1000003) ^ this.f5556b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f5555a + ", schedulerHandler=" + this.f5556b + StringSubstitutor.DEFAULT_VAR_END;
    }
}
