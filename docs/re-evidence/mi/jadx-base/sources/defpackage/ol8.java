package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class ol8 {
    public static final float[] m = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public static final float[] n = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FloatBuffer f29266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FloatBuffer f29267b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public float[] h = new float[16];
    public float[] i = new float[16];
    public float[] j = new float[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f29268k = new float[16];
    public i2o l;

    public ol8() {
        float[] fArr = m;
        this.f29266a = a(fArr);
        this.f29267b = a(n);
        this.c = 2;
        this.d = 2;
        this.e = fArr.length / 2;
        this.g = 8;
        this.f = 8;
        Matrix.setIdentityM(this.h, 0);
        Matrix.setIdentityM(this.i, 0);
        Matrix.setIdentityM(this.j, 0);
        Matrix.setIdentityM(this.f29268k, 0);
    }

    public final FloatBuffer a(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public void b(int i) {
        GLES20.glUseProgram(this.l.a());
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glUniform1i(this.l.e, 0);
        xza.a("GL_TEXTURE_2D sTexture");
        GLES20.glUniformMatrix4fv(this.l.f20711b, 1, false, c(), 0);
        xza.a("glUniformMatrix4fv uMVPMatrixLoc");
        GLES20.glEnableVertexAttribArray(this.l.c);
        GLES20.glVertexAttribPointer(this.l.c, this.c, 5126, false, this.f, (Buffer) this.f29266a);
        xza.a("VAO aPositionLoc");
        GLES20.glEnableVertexAttribArray(this.l.d);
        GLES20.glVertexAttribPointer(this.l.d, this.d, 5126, false, this.g, (Buffer) this.f29267b);
        xza.a("VAO aTextureCoordLoc");
        GLES20.glDrawArrays(5, 0, this.e);
        GLES20.glDisableVertexAttribArray(this.l.c);
        GLES20.glDisableVertexAttribArray(this.l.d);
        GLES20.glBindTexture(3553, 0);
        GLES20.glUseProgram(0);
    }

    public final float[] c() {
        Matrix.multiplyMM(this.f29268k, 0, this.i, 0, this.j, 0);
        float[] fArr = this.f29268k;
        Matrix.multiplyMM(fArr, 0, this.h, 0, fArr, 0);
        return this.f29268k;
    }

    public void d(i2o i2oVar) {
        this.l = i2oVar;
    }
}
