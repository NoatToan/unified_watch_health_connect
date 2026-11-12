package defpackage;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.Matrix;

/* JADX INFO: loaded from: classes10.dex */
public class wza {
    public static void a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": glError ");
        sb.append(iGlGetError);
        throw new RuntimeException(str + ": glError " + iGlGetError);
    }

    public static float[] b(float[] fArr, yxp yxpVar) {
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.rotateM(fArr2, 0, yxpVar.c, 0.0f, 0.0f, 1.0f);
        PointF pointF = yxpVar.f40674b;
        Matrix.translateM(fArr2, 0, pointF.x, pointF.y, 0.0f);
        PointF pointF2 = yxpVar.f40673a;
        Matrix.scaleM(fArr2, 0, pointF2.x, pointF2.y, 1.0f);
        float[] fArr3 = new float[16];
        Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
        return fArr3;
    }

    public static int c(int i, int i2) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        a("glCreateProgram");
        GLES20.glAttachShader(iGlCreateProgram, i);
        a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, i2);
        a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        GLES20.glGetProgramInfoLog(iGlCreateProgram);
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    public static int d(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        a("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not compile shader ");
        sb.append(i);
        sb.append(":");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" ");
        sb2.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }
}
