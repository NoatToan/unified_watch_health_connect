package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class jsv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f38987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f38988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f38989c;
    protected String e;
    protected int f;
    protected final FloatBuffer g;
    protected final FloatBuffer h;
    protected int i;
    protected int j;
    protected int k;
    protected String l;
    protected int m;
    protected int n;
    protected int o;
    protected int p;
    protected int s;

    protected void e() {
    }

    public jsv(Context context, int i, int i2) {
        this.f38989c = context;
        this.m = i;
        this.f38987a = i2;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.g = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.clear();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f});
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.h = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.clear();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        c(context);
    }

    private void c(Context context) {
        this.l = jsz.d(context, this.m);
        String strD = jsz.d(context, this.f38987a);
        this.e = strD;
        int iB = jsz.b(this.l, strD);
        this.n = iB;
        this.o = GLES20.glGetAttribLocation(iB, "vPosition");
        this.f38988b = GLES20.glGetAttribLocation(this.n, "vCoord");
        this.f = GLES20.glGetUniformLocation(this.n, "vMatrix");
        this.k = GLES20.glGetUniformLocation(this.n, "vTexture");
        e();
    }

    public void e(int i, int i2, int i3, int i4) {
        this.j = i;
        this.i = i2;
        this.s = i3;
        this.p = i4;
    }

    public int c(int i) {
        GLES20.glViewport(this.s, this.p, this.j, this.i);
        GLES20.glUseProgram(this.n);
        this.g.position(0);
        GLES20.glVertexAttribPointer(this.o, 2, 5126, false, 0, (Buffer) this.g);
        GLES20.glEnableVertexAttribArray(this.o);
        this.h.position(0);
        GLES20.glVertexAttribPointer(this.f38988b, 2, 5126, false, 0, (Buffer) this.h);
        GLES20.glEnableVertexAttribArray(this.f38988b);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glUniform1i(this.k, 0);
        GLES20.glDrawArrays(5, 0, 4);
        return i;
    }

    public void a() {
        GLES20.glDeleteProgram(this.n);
    }
}
