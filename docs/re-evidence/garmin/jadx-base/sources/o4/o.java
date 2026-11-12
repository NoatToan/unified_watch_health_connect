package o4;

import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final Shader.TileMode a(int i14) {
        x1.f129034b.getClass();
        if (i14 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i14 == x1.f129035c) {
            return Shader.TileMode.REPEAT;
        }
        if (i14 == x1.f129036d) {
            return Shader.TileMode.MIRROR;
        }
        if (i14 == x1.f129037e && Build.VERSION.SDK_INT >= 31) {
            y1.f129039a.getClass();
            return Shader.TileMode.DECAL;
        }
        return Shader.TileMode.CLAMP;
    }
}
