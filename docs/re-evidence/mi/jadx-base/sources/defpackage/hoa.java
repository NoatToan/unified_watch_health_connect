package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class hoa {
    public static final float[] m = {0.0f, 0.57735026f, -0.5f, -0.28867513f, 0.5f, -0.28867513f};
    public static final float[] n = {0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    public static final float[] o = {-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};
    public static final float[] p = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    public static final float[] q = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float[] f20286r = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FloatBuffer f20287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FloatBuffer f20288b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public ioa h;
    public float[] i = new float[16];
    public float[] j = new float[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f20289k = new float[16];
    public float[] l = new float[16];

    public hoa() {
        float[] fArr = q;
        this.f20287a = a(fArr);
        this.f20288b = a(f20286r);
        this.c = 2;
        this.d = 2;
        this.e = fArr.length / 2;
        this.g = 8;
        this.f = 8;
        Matrix.setIdentityM(this.i, 0);
        Matrix.setIdentityM(this.j, 0);
        Matrix.setIdentityM(this.f20289k, 0);
        Matrix.setIdentityM(this.l, 0);
    }

    public final FloatBuffer a(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public void b(int i, float[] fArr, float[] fArr2) {
        GLES20.glUseProgram(this.h.a());
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.h.f, 0);
        xza.a("TEXTURE_EXTERNAL_OES sTextureOES");
        GLES20.glUniformMatrix4fv(this.h.f21940b, 1, false, c(fArr2), 0);
        xza.a("glUniformMatrix4fv uMVPMatrixLoc");
        GLES20.glUniformMatrix4fv(this.h.d, 1, false, fArr, 0);
        xza.a("glUniformMatrix4fv uTexMatrixLoc");
        GLES20.glEnableVertexAttribArray(this.h.c);
        GLES20.glVertexAttribPointer(this.h.c, this.c, 5126, false, this.f, (Buffer) this.f20287a);
        xza.a("VAO aPositionLoc");
        GLES20.glEnableVertexAttribArray(this.h.e);
        GLES20.glVertexAttribPointer(this.h.e, this.d, 5126, false, this.g, (Buffer) this.f20288b);
        xza.a("VAO aTextureCoordLoc");
        GLES20.glDrawArrays(5, 0, this.e);
        GLES20.glDisableVertexAttribArray(this.h.c);
        GLES20.glDisableVertexAttribArray(this.h.e);
        GLES20.glBindTexture(36197, 0);
        GLES20.glUseProgram(0);
    }

    public final float[] c(float[] fArr) {
        Matrix.multiplyMM(this.l, 0, this.j, 0, this.f20289k, 0);
        float[] fArr2 = this.l;
        Matrix.multiplyMM(fArr2, 0, this.i, 0, fArr2, 0);
        if (fArr != null && fArr.length == 16) {
            float[] fArr3 = this.l;
            Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr3, 0);
        }
        return this.l;
    }

    public void d(ioa ioaVar) {
        this.h = ioaVar;
    }
}
