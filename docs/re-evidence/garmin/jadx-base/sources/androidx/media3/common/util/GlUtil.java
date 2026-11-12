package androidx.media3.common.util;

import android.opengl.GLES20;
import android.opengl.GLU;
import com.google.android.gms.gcm.Task;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class GlUtil {

    public static final class GlException extends Exception {
        public GlException(String str) {
            super(str);
        }
    }

    private GlUtil() {
    }

    public static void a(int i14, int i15) throws GlException {
        GLES20.glBindTexture(i14, i15);
        b();
        GLES20.glTexParameteri(i14, Task.EXTRAS_LIMIT_BYTES, 9729);
        b();
        GLES20.glTexParameteri(i14, 10241, 9729);
        b();
        GLES20.glTexParameteri(i14, 10242, 33071);
        b();
        GLES20.glTexParameteri(i14, 10243, 33071);
        b();
    }

    public static void b() throws GlException {
        StringBuilder sb3 = new StringBuilder();
        boolean z14 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z14) {
                sb3.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb3.append("glError: ");
            sb3.append(strGluErrorString);
            z14 = true;
        }
        if (z14) {
            throw new GlException(sb3.toString());
        }
    }

    public static void c(String str, boolean z14) throws GlException {
        if (!z14) {
            throw new GlException(str);
        }
    }

    public static FloatBuffer d(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }
}
