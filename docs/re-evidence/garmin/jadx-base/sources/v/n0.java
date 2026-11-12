package v;

import android.content.Context;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c3;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f173937b;

    public n0(Context context) {
        this.f173937b = g1.b(context);
    }

    @Override // androidx.camera.core.impl.c3
    public final androidx.camera.core.impl.x0 a(c3.b bVar, int i14) {
        androidx.camera.core.impl.w1 w1VarU = androidx.camera.core.impl.w1.U();
        androidx.camera.core.impl.l2.b bVar2 = new androidx.camera.core.impl.l2.b();
        bVar2.f5612b.f5823c = i2.a(bVar, i14);
        w1VarU.X(b3.f5508u, bVar2.c());
        w1VarU.X(b3.f5510w, m0.f173929a);
        androidx.camera.core.impl.v0.a aVar = new androidx.camera.core.impl.v0.a();
        int i15 = i2.a.f173847a[bVar.ordinal()];
        int i16 = 2;
        if (i15 != 1) {
            i16 = (i15 == 2 && x.c.f188202a.b(PreviewUnderExposureQuirk.class) == null) ? 3 : 1;
        } else if (i14 == 2) {
            i16 = 5;
        }
        aVar.f5823c = i16;
        w1VarU.X(b3.f5509v, aVar.e());
        w1VarU.X(b3.f5511x, bVar == c3.b.IMAGE_CAPTURE ? s1.f174067c : z.f174138a);
        if (bVar == c3.b.PREVIEW) {
            w1VarU.X(androidx.camera.core.impl.n1.f5649q, this.f173937b.e());
        }
        w1VarU.X(androidx.camera.core.impl.n1.f5644l, Integer.valueOf(this.f173937b.c(true).getRotation()));
        if (bVar == c3.b.VIDEO_CAPTURE || bVar == c3.b.STREAM_SHARING) {
            w1VarU.X(b3.C, Boolean.TRUE);
        }
        return androidx.camera.core.impl.a2.T(w1VarU);
    }
}
