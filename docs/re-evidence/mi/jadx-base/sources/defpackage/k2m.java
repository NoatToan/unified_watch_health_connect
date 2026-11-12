package defpackage;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes10.dex */
public class k2m {
    public static int a(String str, String str2) {
        int iE = e(d(str), b(str2));
        f(iE);
        return iE;
    }

    public static int b(String str) {
        return c(35632, str);
    }

    public static int c(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(" Warning! Could not create new shader, glGetError:");
            sb.append(GLES20.glGetError());
            return 0;
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Result of compiling source:\n");
        sb2.append(str);
        sb2.append("\n");
        sb2.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        GLES20.glDeleteShader(iGlCreateShader);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(" Warning! Compilation of shader failed, glGetError:");
        sb3.append(GLES20.glGetError());
        return 0;
    }

    public static int d(String str) {
        return c(35633, str);
    }

    public static int e(int i, int i2) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(" Warning! Could not create new program, glGetError:");
            sb.append(GLES20.glGetError());
            return 0;
        }
        GLES20.glAttachShader(iGlCreateProgram, i);
        GLES20.glAttachShader(iGlCreateProgram, i2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Result of linking program:");
        sb2.append(GLES20.glGetProgramInfoLog(iGlCreateProgram));
        if (iArr[0] != 0) {
            return iGlCreateProgram;
        }
        GLES20.glDeleteProgram(iGlCreateProgram);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(" Warning! Linking of program failed, glGetError:");
        sb3.append(GLES20.glGetError());
        return 0;
    }

    public static boolean f(int i) {
        GLES20.glValidateProgram(i);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(i, 35715, iArr, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("Result of validating program:");
        sb.append(iArr[0]);
        sb.append("\nLog:");
        sb.append(GLES20.glGetProgramInfoLog(i));
        return iArr[0] != 0;
    }
}
