package defpackage;

import android.media.MediaCodec;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.o;
import androidx.camera.core.t;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class nqo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28268a;

    public nqo() {
        this.f28268a = xa6.a(cqo.class) != null;
    }

    public final int b(DeferrableSurface deferrableSurface) {
        if (deferrableSurface.e() == MediaCodec.class || deferrableSurface.e() == t.class) {
            return 2;
        }
        return deferrableSurface.e() == o.class ? 0 : 1;
    }

    public final /* synthetic */ int c(DeferrableSurface deferrableSurface, DeferrableSurface deferrableSurface2) {
        return b(deferrableSurface) - b(deferrableSurface2);
    }

    public void d(List<DeferrableSurface> list) {
        if (this.f28268a) {
            Collections.sort(list, new Comparator() { // from class: mqo
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return this.f27108a.c((DeferrableSurface) obj, (DeferrableSurface) obj2);
                }
            });
        }
    }
}
