package defpackage;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class edi {
    public static final String[] j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f16527k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};
    public static final float[] l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f16529b;
    public a c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FloatBuffer f16531b;
        public final FloatBuffer c;
        public final int d;

        public a(cdi.b bVar) {
            this.f16530a = bVar.a();
            this.f16531b = yza.f(bVar.c);
            this.c = yza.f(bVar.d);
            int i = bVar.f5219b;
            if (i == 1) {
                this.d = 5;
            } else if (i != 2) {
                this.d = 4;
            } else {
                this.d = 6;
            }
        }
    }

    public static boolean c(cdi cdiVar) {
        cdi.a aVar = cdiVar.f5215a;
        cdi.a aVar2 = cdiVar.f5216b;
        return aVar.b() == 1 && aVar.a(0).f5218a == 0 && aVar2.b() == 1 && aVar2.a(0).f5218a == 0;
    }

    public void a(int i, float[] fArr, boolean z) {
        float[] fArr2;
        a aVar = z ? this.c : this.f16529b;
        if (aVar == null) {
            return;
        }
        GLES20.glUseProgram(this.d);
        yza.b();
        GLES20.glEnableVertexAttribArray(this.g);
        GLES20.glEnableVertexAttribArray(this.h);
        yza.b();
        int i2 = this.f16528a;
        if (i2 == 1) {
            fArr2 = z ? n : m;
        } else if (i2 == 2) {
            fArr2 = z ? p : o;
        } else {
            fArr2 = l;
        }
        GLES20.glUniformMatrix3fv(this.f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.i, 0);
        yza.b();
        GLES20.glVertexAttribPointer(this.g, 3, 5126, false, 12, (Buffer) aVar.f16531b);
        yza.b();
        GLES20.glVertexAttribPointer(this.h, 2, 5126, false, 8, (Buffer) aVar.c);
        yza.b();
        GLES20.glDrawArrays(aVar.d, 0, aVar.f16530a);
        yza.b();
        GLES20.glDisableVertexAttribArray(this.g);
        GLES20.glDisableVertexAttribArray(this.h);
    }

    public void b() {
        int iD = yza.d(j, f16527k);
        this.d = iD;
        this.e = GLES20.glGetUniformLocation(iD, "uMvpMatrix");
        this.f = GLES20.glGetUniformLocation(this.d, "uTexMatrix");
        this.g = GLES20.glGetAttribLocation(this.d, "aPosition");
        this.h = GLES20.glGetAttribLocation(this.d, "aTexCoords");
        this.i = GLES20.glGetUniformLocation(this.d, "uTexture");
    }

    public void d(cdi cdiVar) {
        if (c(cdiVar)) {
            this.f16528a = cdiVar.c;
            a aVar = new a(cdiVar.f5215a.a(0));
            this.f16529b = aVar;
            if (!cdiVar.d) {
                aVar = new a(cdiVar.f5216b.a(0));
            }
            this.c = aVar;
        }
    }
}
