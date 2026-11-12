package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.work.Data;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class jgk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final FloatBuffer f38575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f38576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f38577c;
    private static final FloatBuffer d;
    private float[] e;
    private int f;
    private int g;
    private int h;
    private int i;
    private float[] j;
    private int k;
    private int m;

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
        f38577c = fArr;
        float[] fArr2 = {0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        f38576b = fArr2;
        f38575a = jgl.e(fArr);
        d = jgl.e(fArr2);
    }

    public jgk(int i, int i2) {
        this();
    }

    public jgk() {
        this.e = new float[16];
        float[] fArr = new float[16];
        this.j = fArr;
        this.i = -12345;
        Matrix.setIdentityM(fArr, 0);
    }

    public int a() {
        return this.i;
    }

    public void c() {
        int iE = jgl.e("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec4 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = uSTMatrix * aTextureCoord;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec4 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord.xy/vTextureCoord.z);}\n");
        this.g = iE;
        if (iE == 0) {
            throw new jgm("failed creating program");
        }
        this.h = GLES20.glGetAttribLocation(iE, "aPosition");
        this.f = GLES20.glGetAttribLocation(this.g, "aTextureCoord");
        this.m = GLES20.glGetUniformLocation(this.g, "uMVPMatrix");
        this.k = GLES20.glGetUniformLocation(this.g, "uSTMatrix");
        this.i = b();
    }

    public static int b() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, Data.MAX_DATA_BYTES, 9728);
        return iArr[0];
    }

    public void e() {
        GLES20.glUseProgram(this.g);
        GLES20.glEnableVertexAttribArray(this.h);
        GLES20.glVertexAttribPointer(this.h, 3, 5126, false, 12, (Buffer) f38575a);
        GLES20.glEnableVertexAttribArray(this.f);
        GLES20.glVertexAttribPointer(this.f, 4, 5126, false, 16, (Buffer) d);
        Matrix.setIdentityM(this.e, 0);
        GLES20.glUniformMatrix4fv(this.m, 1, false, this.e, 0);
        GLES20.glUniformMatrix4fv(this.k, 1, false, this.j, 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.h);
        GLES20.glDisableVertexAttribArray(this.f);
        GLES20.glUseProgram(0);
    }
}
