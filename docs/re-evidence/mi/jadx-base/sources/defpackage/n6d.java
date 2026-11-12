package defpackage;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.DeferrableSurface;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class n6d extends DeferrableSurface {
    public final Surface m;

    public n6d(Surface surface, Size size, int i) {
        super(size, i);
        this.m = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public lhe<Surface> n() {
        return oua.h(this.m);
    }

    public n6d(Surface surface) {
        this.m = surface;
    }
}
