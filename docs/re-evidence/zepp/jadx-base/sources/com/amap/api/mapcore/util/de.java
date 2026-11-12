package com.amap.api.mapcore.util;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes2.dex */
public class de {
    private boolean a;
    public int d;
    public int e;
    public int f;

    public final boolean a(String str, String str2) {
        int iB = b(str, str2);
        this.d = iB;
        return iB != 0;
    }

    public final int b(String str) {
        return GLES20.glGetAttribLocation(this.d, str);
    }

    public final int c(String str) {
        return GLES20.glGetUniformLocation(this.d, str);
    }

    private static int a(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        return iGlCreateShader;
    }

    private int b(String str, String str2) {
        this.e = a(35633, str);
        this.f = a(35632, str2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, this.e);
        GLES20.glAttachShader(iGlCreateProgram, this.f);
        GLES20.glLinkProgram(iGlCreateProgram);
        return iGlCreateProgram;
    }

    public final void a() {
        int i = this.d;
        if (i >= 0) {
            GLES20.glDeleteProgram(i);
        }
        int i2 = this.e;
        if (i2 >= 0) {
            GLES20.glDeleteShader(i2);
        }
        int i3 = this.f;
        if (i3 >= 0) {
            GLES20.glDeleteShader(i3);
        }
        this.a = true;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean a(String str) {
        String strConcat = "amap_sdk_shaders/".concat(String.valueOf(str));
        String strA = ds.a(strConcat);
        if (strA != null) {
            int iIndexOf = strA.indexOf(36);
            if (iIndexOf >= 0 && strA.charAt(iIndexOf + 1) == '$') {
                int iB = b(strA.substring(0, iIndexOf), strA.substring(iIndexOf + 2));
                this.d = iB;
                return iB != 0;
            }
            throw new IllegalArgumentException("not a shader file ".concat(String.valueOf(strConcat)));
        }
        throw new IllegalArgumentException("shader file not found: ".concat(String.valueOf(strConcat)));
    }
}
