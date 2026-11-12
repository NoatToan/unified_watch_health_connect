package defpackage;

import android.opengl.GLES20;
import com.huawei.hwlogsmodel.LogUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class jgl {
    public static int e(String str, String str2) {
        int iA;
        int iA2 = a(35633, str);
        if (iA2 == 0 || (iA = a(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        c("glCreateProgram");
        if (iGlCreateProgram == 0) {
            LogUtil.e("Track_EncodeDecodeSurface", "Could not create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iA2);
        c("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iA);
        c("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        LogUtil.e("Track_EncodeDecodeSurface", "Could not link program: ");
        LogUtil.e("Track_EncodeDecodeSurface", GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    public static int a(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        c("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        LogUtil.e("Track_EncodeDecodeSurface", "Could not compile shader ", Integer.valueOf(i), ":");
        LogUtil.e("Track_EncodeDecodeSurface", " ", GLES20.glGetShaderInfoLog(iGlCreateShader));
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public static void c(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        String str2 = str + ": glError 0x" + Integer.toHexString(iGlGetError);
        LogUtil.e("Track_EncodeDecodeSurface", str2);
        throw new jgm(str2);
    }

    public static FloatBuffer e(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }
}
