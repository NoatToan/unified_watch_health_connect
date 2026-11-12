package defpackage;

import android.opengl.GLES20;
import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes10.dex */
public class xza {
    public static void a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Logger.e("ZZR-GL", str + ": glError 0x" + Integer.toHexString(iGlGetError));
        }
    }

    public static void b(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new RuntimeException("Unable to locate '" + str + "' in program");
    }
}
