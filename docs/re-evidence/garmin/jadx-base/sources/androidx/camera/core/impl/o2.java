package androidx.camera.core.impl;

import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class o2 extends DeferrableSurface {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Surface f5678n;

    public o2(Surface surface, int i14) {
        this.f5678n = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public final ListenableFuture<Surface> e() {
        return l0.j.e(this.f5678n);
    }
}
