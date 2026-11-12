package defpackage;

import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.DeferrableSurface;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class tyl extends DeferrableSurface {
    public final Surface m;

    @Override // androidx.camera.core.impl.DeferrableSurface
    public lhe<Surface> n() {
        return oua.h(this.m);
    }
}
