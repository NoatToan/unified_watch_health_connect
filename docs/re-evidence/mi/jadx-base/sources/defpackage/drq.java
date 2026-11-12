package defpackage;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class drq implements vza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15854b;
    public final yxp c;
    public float[] d;
    public float[] e;
    public int f;
    public FloatBuffer g;
    public final float[] h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15855k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;

    public drq() {
        this(null);
    }

    @Override // defpackage.vza
    public void a(long j) {
        this.g.position(0);
        GLES20.glVertexAttribPointer(this.o, 3, 5126, false, 20, (Buffer) this.g);
        wza.a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.o);
        wza.a("glEnableVertexAttribArray aPositionHandle");
        this.g.position(3);
        GLES20.glVertexAttribPointer(this.p, 2, 5126, false, 20, (Buffer) this.g);
        wza.a("glVertexAttribPointer aTextureHandle");
        GLES20.glEnableVertexAttribArray(this.p);
        wza.a("glEnableVertexAttribArray aTextureHandle");
        wza.a("onDrawFrame start");
        GLES20.glUseProgram(this.f15855k);
        wza.a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.n);
        GLES20.glUniformMatrix4fv(this.l, 1, false, this.d, this.f);
        GLES20.glUniformMatrix4fv(this.m, 1, false, this.e, 0);
        GLES20.glDrawArrays(5, 0, 4);
        wza.a("glDrawArrays");
    }

    @Override // defpackage.vza
    public void b(float[] fArr, int i) {
        this.d = wza.b(fArr, this.c);
        this.f = i;
    }

    @Override // defpackage.vza
    public void c(int i, float[] fArr) {
        this.n = i;
        this.e = fArr;
    }

    @Override // defpackage.vza
    public void init() {
        Matrix.setIdentityM(this.e, 0);
        int iD = wza.d(35633, this.f15853a);
        this.i = iD;
        if (iD == 0) {
            throw new RuntimeException("failed loading vertex shader");
        }
        int iD2 = wza.d(35632, this.f15854b);
        this.j = iD2;
        if (iD2 == 0) {
            release();
            throw new RuntimeException("failed loading fragment shader");
        }
        int iC = wza.c(this.i, iD2);
        this.f15855k = iC;
        if (iC == 0) {
            release();
            throw new RuntimeException("failed creating glProgram");
        }
        this.o = GLES20.glGetAttribLocation(iC, "aPosition");
        wza.a("glGetAttribLocation aPosition");
        if (this.o == -1) {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        this.p = GLES20.glGetAttribLocation(this.f15855k, "aTextureCoord");
        wza.a("glGetAttribLocation aTextureCoord");
        if (this.p == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        this.l = GLES20.glGetUniformLocation(this.f15855k, "uMVPMatrix");
        wza.a("glGetUniformLocation uMVPMatrix");
        if (this.l == -1) {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
        this.m = GLES20.glGetUniformLocation(this.f15855k, "uSTMatrix");
        wza.a("glGetUniformLocation uSTMatrix");
        if (this.m == -1) {
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        }
    }

    @Override // defpackage.vza
    public void release() {
        GLES20.glDeleteProgram(this.f15855k);
        GLES20.glDeleteShader(this.i);
        GLES20.glDeleteShader(this.j);
        GLES20.glDeleteBuffers(1, new int[]{this.p}, 0);
        this.f15855k = 0;
        this.i = 0;
        this.j = 0;
        this.p = 0;
    }

    public drq(yxp yxpVar) {
        this("precision highp float;\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main()\n{\ngl_Position = uMVPMatrix * aPosition;\nvTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main()\n{\ngl_FragColor = texture2D(sTexture, vTextureCoord);\n}", yxpVar);
    }

    public drq(String str, String str2, yxp yxpVar) {
        this.d = new float[16];
        this.e = new float[16];
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.h = fArr;
        this.f15853a = str;
        this.f15854b = str2;
        this.c = yxpVar == null ? new yxp(new PointF(1.0f, 1.0f), new PointF(0.5f, 0.5f), 0.0f) : yxpVar;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.g = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
    }
}
