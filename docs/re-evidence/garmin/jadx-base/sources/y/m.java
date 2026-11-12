package y;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.core.impl.i2;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f192951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f192952b = false;

    public m(i2 i2Var) {
        this.f192951a = i2Var.b(AutoFlashUnderExposedQuirk.class) != null;
    }
}
