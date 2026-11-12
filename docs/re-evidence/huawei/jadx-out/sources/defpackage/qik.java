package defpackage;

import android.content.Context;
import android.opengl.GLES20;

/* JADX INFO: loaded from: classes43.dex */
public class qik {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f46270a = "ShaderHelper";

    public static int e(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader == 0) {
            String str2 = f46270a;
            qid.e(str2, "getShader Error creating vertex shader.");
            throw new RuntimeException(str2 + qid.a() + " Error creating vertex shader.");
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        StringBuilder sb = new StringBuilder();
        String str3 = f46270a;
        sb.append(str3);
        sb.append("_ES20_ERROR");
        qid.e(sb.toString(), "Could not compile shader " + i + ":");
        qid.e(str3 + "_ES20_ERROR", GLES20.glGetShaderInfoLog(iGlCreateShader));
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public static int a(String str) {
        return e(35633, str);
    }

    public static int e(String str) {
        return e(35632, str);
    }

    public static int a(Context context, String str, String str2) {
        int iC;
        synchronized (qik.class) {
            iC = c(qie.c(context, str), qie.c(context, str2));
        }
        return iC;
    }

    public static int c(String str, String str2) {
        return c(a(str), e(str2));
    }

    public static int c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram == 0) {
            qid.e(f46270a, "Error creating program..");
            throw new RuntimeException("Error creating program.");
        }
        GLES20.glAttachShader(iGlCreateProgram, i);
        qii.d("glAttachShader vertexShader");
        GLES20.glAttachShader(iGlCreateProgram, i2);
        qii.d("glAttachShader fragShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            StringBuilder sb = new StringBuilder();
            String str = f46270a;
            sb.append(str);
            sb.append("_ES20_ERROR");
            qid.e(sb.toString(), qid.a() + "Could not link program: ");
            qid.e(str + "_ES20_ERROR", qid.a() + GLES20.glGetProgramInfoLog(iGlCreateProgram));
            GLES20.glDeleteProgram(iGlCreateProgram);
            throw new RuntimeException("Error creating program.");
        }
        qid.e(f46270a, qid.a() + "program ID=" + iGlCreateProgram);
        GLES20.glDeleteShader(i);
        GLES20.glDeleteShader(i2);
        return iGlCreateProgram;
    }
}
