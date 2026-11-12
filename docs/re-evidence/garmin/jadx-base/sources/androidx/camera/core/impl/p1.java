package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends DeferrableSurface {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Surface f5683n;

    public p1(Surface surface, Size size, int i14) {
        super(size, i14);
        this.f5683n = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public final ListenableFuture<Surface> e() {
        return l0.j.e(this.f5683n);
    }

    public p1(Surface surface) {
        this.f5683n = surface;
    }
}
