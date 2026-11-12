package com.huawei.openalliance.ad;

import android.opengl.GLES20;
import androidx.work.Data;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes41.dex */
public class ek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18694c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i = 36197;
    private final float[] j = new float[9];
    private float[] k = {-0.00390625f, -0.00390625f, 0.0f, -0.00390625f, 0.00390625f, -0.00390625f, -0.00390625f, 0.0f, 0.0f, 0.0f, 0.00390625f, 0.0f, -0.00390625f, 0.00390625f, 0.0f, 0.00390625f, 0.00390625f, 0.00390625f};
    private float l;

    public int b() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        a("fail to generate texture");
        int i = iArr[0];
        GLES20.glBindTexture(this.i, i);
        a("fail to bind texture ");
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, Data.MAX_DATA_BYTES, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        a("fail to create texture");
        return i;
    }

    void a(el elVar) {
        a("render - 1");
        b(elVar);
        c(elVar);
        f();
        d(elVar);
    }

    public void a() {
        try {
            GLES20.glDeleteProgram(this.f18692a);
            this.f18692a = -1;
        } catch (Throwable th) {
            hw.a(5, "TexProgram", "release", th);
        }
    }

    private void f() {
        int i = this.d;
        if (i >= 0) {
            GLES20.glUniform1fv(i, 9, this.j, 0);
            GLES20.glUniform2fv(this.e, 9, this.k, 0);
            GLES20.glUniform1f(this.f, this.l);
        }
    }

    private void e() {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f18692a, "positionLocation");
        this.g = iGlGetAttribLocation;
        a(iGlGetAttribLocation, "positionLocation");
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.f18692a, "textureCoordLocation");
        this.h = iGlGetAttribLocation2;
        a(iGlGetAttribLocation2, "textureCoordLocation");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f18692a, "matrixLocation");
        this.f18693b = iGlGetUniformLocation;
        a(iGlGetUniformLocation, "matrixLocation");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f18692a, "texMatrixLocation");
        this.f18694c = iGlGetUniformLocation2;
        a(iGlGetUniformLocation2, "texMatrixLocation");
        this.d = GLES20.glGetUniformLocation(this.f18692a, "coreLocation");
    }

    private void d(el elVar) {
        GLES20.glDrawArrays(5, elVar.c(), elVar.d());
        a("pr4 - 1");
        GLES20.glDisableVertexAttribArray(this.g);
        GLES20.glDisableVertexAttribArray(this.h);
        GLES20.glBindTexture(this.i, 0);
        GLES20.glUseProgram(0);
    }

    private void d() {
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f18692a, "textureOffsetLocation");
        this.e = iGlGetUniformLocation;
        a(iGlGetUniformLocation, "textureOffsetLocation");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f18692a, "colorAdjustLocation");
        this.f = iGlGetUniformLocation2;
        a(iGlGetUniformLocation2, "colorAdjustLocation");
        System.arraycopy(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f}, 0, this.j, 0, 9);
        this.l = 0.0f;
    }

    private void c(el elVar) {
        GLES20.glEnableVertexAttribArray(this.g);
        a("rv - 1");
        GLES20.glVertexAttribPointer(this.g, elVar.e(), 5126, false, elVar.f(), (Buffer) elVar.b());
        a("rv - 2");
        GLES20.glEnableVertexAttribArray(this.h);
        a("rv - 3");
        GLES20.glVertexAttribPointer(this.h, 2, 5126, false, elVar.j(), (Buffer) elVar.h());
        a("rv - 4");
    }

    private static int c() {
        int iB;
        int iB2 = b(35633, "uniform mat4 matrixLocation; uniform mat4 texMatrixLocation; attribute vec4 positionLocation; attribute vec4 textureCoordLocation; varying vec2 textureCoordination; void main() { gl_Position = matrixLocation * positionLocation; textureCoordination = (texMatrixLocation * textureCoordLocation).xy;}");
        if (iB2 == 0 || (iB = b(35632, "#extension GL_OES_EGL_image_external : require\n precision mediump float; varying vec2 textureCoordination; uniform samplerExternalOES sTexture; void main() {gl_FragColor = texture2D(sTexture, textureCoordination);}")) == 0) {
            return 0;
        }
        return a(iB2, iB);
    }

    private void b(el elVar) {
        GLES20.glUseProgram(this.f18692a);
        a("rtm - 1");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.i, elVar.i());
        GLES20.glUniformMatrix4fv(this.f18693b, 1, false, elVar.a(), 0);
        a("rtm - 2");
        GLES20.glUniformMatrix4fv(this.f18694c, 1, false, elVar.g(), 0);
        a("rtm - 3");
    }

    private static int b(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        a("create shader " + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        hw.c("TexProgram", "fail to compile shader: " + i + " " + GLES20.glGetShaderInfoLog(iGlCreateShader));
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    static void a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        String str2 = str + " error: " + Integer.toHexString(iGlGetError);
        hw.c("TexProgram", str2);
        throw new IllegalStateException(str2);
    }

    static void a(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalStateException("program fail to find " + str);
    }

    private static int a(int i, int i2) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        a("create program");
        if (iGlCreateProgram == 0) {
            hw.c("TexProgram", "fail not create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, i);
        a("attach shader");
        GLES20.glAttachShader(iGlCreateProgram, i2);
        a("attach shader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        hw.c("TexProgram", "fail to link");
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    public ek() {
        int iC = c();
        this.f18692a = iC;
        if (iC == 0) {
            throw new IllegalStateException("fail to create program");
        }
        e();
        if (this.d >= 0) {
            d();
            return;
        }
        this.d = -1;
        this.e = -1;
        this.f = -1;
    }
}
