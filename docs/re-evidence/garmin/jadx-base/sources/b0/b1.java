package b0;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends androidx.camera.core.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f13862d;

    public b1(androidx.camera.core.e eVar) {
        super(eVar);
        this.f13862d = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.b, java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f13862d.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
