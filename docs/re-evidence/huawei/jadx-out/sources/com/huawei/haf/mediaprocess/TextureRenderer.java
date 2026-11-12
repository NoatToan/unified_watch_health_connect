package com.huawei.haf.mediaprocess;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.work.Data;
import health.compact.a.LogUtil;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class TextureRenderer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f6001c = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    private int d;
    private int f;
    private int g;
    private int h;
    private int i;
    private FloatBuffer j;
    private int m;
    private float[] e = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f6003b = new float[16];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6002a = -12345;

    public TextureRenderer(int i) {
        this.m = i;
        float[] fArr = f6001c;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.j = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        Matrix.setIdentityM(this.f6003b, 0);
    }

    public int e() {
        return this.f6002a;
    }

    public void a(SurfaceTexture surfaceTexture, boolean z) throws IOException {
        a("onDrawFrame start");
        surfaceTexture.getTransformMatrix(this.f6003b);
        if (z) {
            float[] fArr = this.f6003b;
            fArr[5] = -fArr[5];
            fArr[13] = 1.0f - fArr[13];
        }
        GLES20.glUseProgram(this.d);
        a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f6002a);
        this.j.position(0);
        GLES20.glVertexAttribPointer(this.i, 3, 5126, false, 20, (Buffer) this.j);
        a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.i);
        a("glEnableVertexAttribArray maPositionHandle");
        this.j.position(3);
        GLES20.glVertexAttribPointer(this.h, 2, 5126, false, 20, (Buffer) this.j);
        a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.h);
        a("glEnableVertexAttribArray maTextureHandle");
        GLES20.glUniformMatrix4fv(this.f, 1, false, this.f6003b, 0);
        GLES20.glUniformMatrix4fv(this.g, 1, false, this.e, 0);
        GLES20.glDrawArrays(5, 0, 4);
        a("glDrawArrays");
        GLES20.glFinish();
    }

    public void d() throws IOException {
        int iC = c("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        this.d = iC;
        if (iC == 0) {
            throw new IOException("failed creating program");
        }
        this.i = GLES20.glGetAttribLocation(iC, "aPosition");
        a("glGetAttribLocation aPosition");
        if (this.i == -1) {
            throw new IOException("Could not get attrib location for aPosition");
        }
        this.h = GLES20.glGetAttribLocation(this.d, "aTextureCoord");
        a("glGetAttribLocation aTextureCoord");
        if (this.h == -1) {
            throw new IOException("Could not get attrib location for aTextureCoord");
        }
        this.g = GLES20.glGetUniformLocation(this.d, "uMVPMatrix");
        a("glGetUniformLocation uMVPMatrix");
        if (this.g == -1) {
            throw new IOException("Could not get attrib location for uMVPMatrix");
        }
        this.f = GLES20.glGetUniformLocation(this.d, "uSTMatrix");
        a("glGetUniformLocation uSTMatrix");
        if (this.f == -1) {
            throw new IOException("Could not get attrib location for uSTMatrix");
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.f6002a = i;
        GLES20.glBindTexture(36197, i);
        a("glBindTexture mTextureId");
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, Data.MAX_DATA_BYTES, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        a("glTexParameter");
        Matrix.setIdentityM(this.e, 0);
        int i2 = this.m;
        if (i2 != 0) {
            Matrix.rotateM(this.e, 0, i2, 0.0f, 0.0f, 1.0f);
        }
    }

    private int e(int i, String str) throws IOException {
        int iGlCreateShader = GLES20.glCreateShader(i);
        a("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    private int c(String str, String str2) throws IOException {
        int iE;
        int iE2 = e(35633, str);
        if (iE2 == 0 || (iE = e(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            return 0;
        }
        GLES20.glAttachShader(iGlCreateProgram, iE2);
        a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iE);
        a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    public void a(String str) throws IOException {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        LogUtil.d("TextureRenderer", str, ": glError ", Integer.valueOf(iGlGetError));
        throw new IOException(str + ": glError " + iGlGetError);
    }
}
