package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import androidx.media3.common.x;
import fa.k;
import fa.z;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f9262b;

    @Deprecated
    public b() {
        this.f9262b = null;
    }

    @Override // androidx.media3.exoplayer.mediacodec.c.b
    public final c a(c.a aVar) {
        Context context;
        int i14 = z.f70071a;
        if (i14 < 23 || (i14 < 31 && ((context = this.f9262b) == null || i14 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new g.b().a(aVar);
        }
        int iH = x.h(aVar.f9265c.f8386n);
        k.f("Creating an asynchronous MediaCodec adapter for track type ".concat(z.C(iH)));
        return new a.b(iH).a(aVar);
    }

    public b(Context context) {
        this.f9262b = context;
    }
}
