package defpackage;

import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.SurfaceConfig;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class o9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qk8 f28893a;

    public o9f() {
        this((qk8) za6.a(qk8.class));
    }

    public Size a(Size size) {
        Size sizeA;
        qk8 qk8Var = this.f28893a;
        return (qk8Var == null || (sizeA = qk8Var.a(SurfaceConfig.ConfigType.PRIV)) == null || sizeA.getWidth() * sizeA.getHeight() <= size.getWidth() * size.getHeight()) ? size : sizeA;
    }

    @VisibleForTesting
    public o9f(qk8 qk8Var) {
        this.f28893a = qk8Var;
    }
}
