package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class vs1 extends ai3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f37174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f37175b;

    public vs1(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f37174a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f37175b = handler;
    }

    @Override // defpackage.ai3
    public Executor b() {
        return this.f37174a;
    }

    @Override // defpackage.ai3
    public Handler c() {
        return this.f37175b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ai3)) {
            return false;
        }
        ai3 ai3Var = (ai3) obj;
        return this.f37174a.equals(ai3Var.b()) && this.f37175b.equals(ai3Var.c());
    }

    public int hashCode() {
        return ((this.f37174a.hashCode() ^ 1000003) * 1000003) ^ this.f37175b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f37174a + ", schedulerHandler=" + this.f37175b + "}";
    }
}
