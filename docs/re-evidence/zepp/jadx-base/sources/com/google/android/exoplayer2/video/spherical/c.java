package com.google.android.exoplayer2.video.spherical;

import android.opengl.GLES20;
import androidx.annotation.Nullable;
import com.alipay.sdk.m.u.i;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class c {
    private static final String[] j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", i.d};
    private static final String[] k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", i.d};
    private static final float[] l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    private static final float[] n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};
    private int a;

    @Nullable
    private a b;

    @Nullable
    private a c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public static class a {
        private final int a;
        private final FloatBuffer b;
        private final FloatBuffer c;
        private final int d;

        public a(Projection.SubMesh subMesh) {
            this.a = subMesh.getVertexCount();
            this.b = GlUtil.createBuffer(subMesh.vertices);
            this.c = GlUtil.createBuffer(subMesh.textureCoords);
            int i = subMesh.mode;
            if (i == 1) {
                this.d = 5;
            } else if (i != 2) {
                this.d = 4;
            } else {
                this.d = 6;
            }
        }
    }

    public static boolean c(Projection projection) {
        Projection.Mesh mesh = projection.a;
        Projection.Mesh mesh2 = projection.b;
        return mesh.getSubMeshCount() == 1 && mesh.getSubMesh(0).textureId == 0 && mesh2.getSubMeshCount() == 1 && mesh2.getSubMesh(0).textureId == 0;
    }

    public void a(int textureId, float[] mvpMatrix, boolean rightEye) {
        float[] fArr;
        a aVar = rightEye ? this.c : this.b;
        if (aVar == null) {
            return;
        }
        GLES20.glUseProgram(this.d);
        GlUtil.checkGlError();
        GLES20.glEnableVertexAttribArray(this.g);
        GLES20.glEnableVertexAttribArray(this.h);
        GlUtil.checkGlError();
        int i = this.a;
        if (i == 1) {
            fArr = rightEye ? n : m;
        } else if (i == 2) {
            fArr = rightEye ? p : o;
        } else {
            fArr = l;
        }
        GLES20.glUniformMatrix3fv(this.f, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(this.e, 1, false, mvpMatrix, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, textureId);
        GLES20.glUniform1i(this.i, 0);
        GlUtil.checkGlError();
        GLES20.glVertexAttribPointer(this.g, 3, 5126, false, 12, (Buffer) aVar.b);
        GlUtil.checkGlError();
        GLES20.glVertexAttribPointer(this.h, 2, 5126, false, 8, (Buffer) aVar.c);
        GlUtil.checkGlError();
        GLES20.glDrawArrays(aVar.d, 0, aVar.a);
        GlUtil.checkGlError();
        GLES20.glDisableVertexAttribArray(this.g);
        GLES20.glDisableVertexAttribArray(this.h);
    }

    public void b() {
        int iCompileProgram = GlUtil.compileProgram(j, k);
        this.d = iCompileProgram;
        this.e = GLES20.glGetUniformLocation(iCompileProgram, "uMvpMatrix");
        this.f = GLES20.glGetUniformLocation(this.d, "uTexMatrix");
        this.g = GLES20.glGetAttribLocation(this.d, "aPosition");
        this.h = GLES20.glGetAttribLocation(this.d, "aTexCoords");
        this.i = GLES20.glGetUniformLocation(this.d, "uTexture");
    }

    public void d(Projection projection) {
        if (c(projection)) {
            this.a = projection.c;
            a aVar = new a(projection.a.getSubMesh(0));
            this.b = aVar;
            if (!projection.d) {
                aVar = new a(projection.b.getSubMesh(0));
            }
            this.c = aVar;
        }
    }

    public void e() {
        int i = this.d;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
        }
    }
}
