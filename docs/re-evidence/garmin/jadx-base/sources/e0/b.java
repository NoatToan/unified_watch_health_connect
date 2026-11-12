package e0;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.ListenableFuture;
import l0.j;
import l0.m;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le0/b;", "Landroidx/camera/core/impl/DeferrableSurface;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends DeferrableSurface {
    public b(Size size, int i14) {
        super(size, i14);
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public final ListenableFuture<Surface> e() {
        j.a aVar = j.f107810a;
        m.c cVar = m.c.f107817b;
        cVar.getClass();
        return cVar;
    }
}
