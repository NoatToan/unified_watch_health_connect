package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import androidx.work.Data;
import com.xiaomi.fitness.common.utils.RomUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class yza {
    public static void a(int i, String str, int i2) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
            StringBuilder sb = new StringBuilder(String.valueOf(strGlGetShaderInfoLog).length() + 10 + String.valueOf(str).length());
            sb.append(strGlGetShaderInfoLog);
            sb.append(", source: ");
            sb.append(str);
            j(sb.toString());
        }
        GLES20.glAttachShader(i2, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        b();
    }

    public static void b() {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            String strValueOf = String.valueOf(GLU.gluErrorString(iGlGetError));
            toe.c("GlUtil", strValueOf.length() != 0 ? "glError ".concat(strValueOf) : new String("glError "));
        }
    }

    public static int c(String str, String str2) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        b();
        a(35633, str, iGlCreateProgram);
        a(35632, str2, iGlCreateProgram);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String strValueOf = String.valueOf(GLES20.glGetProgramInfoLog(iGlCreateProgram));
            j(strValueOf.length() != 0 ? "Unable to link shader program: \n".concat(strValueOf) : new String("Unable to link shader program: \n"));
        }
        b();
        return iGlCreateProgram;
    }

    public static int d(String[] strArr, String[] strArr2) {
        return c(TextUtils.join("\n", strArr), TextUtils.join("\n", strArr2));
    }

    public static FloatBuffer e(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static FloatBuffer f(float[] fArr) {
        return (FloatBuffer) e(fArr.length).put(fArr).flip();
    }

    public static int g() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, Data.MAX_DATA_BYTES, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b();
        return iArr[0];
    }

    public static boolean h(Context context) {
        String strEglQueryString;
        int i = wlq.f38110a;
        if (i < 24) {
            return false;
        }
        if (i >= 26 || !(RomUtils.SAMSUNG.equals(wlq.c) || "XT1650".equals(wlq.d))) {
            return (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean i() {
        String strEglQueryString;
        return wlq.f38110a >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static void j(String str) {
        toe.c("GlUtil", str);
    }
}
