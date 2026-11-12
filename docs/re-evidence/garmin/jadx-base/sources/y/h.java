package y;

import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.i2;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f192944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f192945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f192946c;

    public h(i2 i2Var, i2 i2Var2) {
        this.f192944a = i2Var2.a(TextureViewIsClosedQuirk.class);
        this.f192945b = i2Var.a(PreviewOrientationIncorrectQuirk.class);
        this.f192946c = i2Var.a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public final void a(ArrayList arrayList) {
        if ((this.f192944a || this.f192945b || this.f192946c) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((DeferrableSurface) it.next()).a();
            }
        }
    }
}
