package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import androidx.work.Data;
import com.miui.tsmclient.model.mitsm.h;
import defpackage.kqq;
import defpackage.lqq;
import defpackage.rk1;
import defpackage.yza;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes4.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements lqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f8458a;

    public static final class a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final float[] f8459k = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
        public static final float[] l = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        public static final float[] m = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
        public static final String[] n = {"y_tex", "u_tex", "v_tex"};
        public static final FloatBuffer o = yza.f(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GLSurfaceView f8460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f8461b = new int[3];
        public final int[] c = new int[3];
        public final int[] d = new int[3];
        public final int[] e = new int[3];
        public final AtomicReference<kqq> f = new AtomicReference<>();
        public final FloatBuffer[] g = new FloatBuffer[3];
        public int h;
        public int i;
        public kqq j;

        public a(GLSurfaceView gLSurfaceView) {
            this.f8460a = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.d;
                this.e[i] = -1;
                iArr[i] = -1;
            }
        }

        public void a(kqq kqqVar) {
            kqq andSet = this.f.getAndSet(kqqVar);
            if (andSet != null) {
                andSet.r();
            }
            this.f8460a.requestRender();
        }

        public final void b() {
            GLES20.glGenTextures(3, this.f8461b, 0);
            for (int i = 0; i < 3; i++) {
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.h, n[i]), i);
                GLES20.glActiveTexture(33984 + i);
                GLES20.glBindTexture(3553, this.f8461b[i]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, Data.MAX_DATA_BYTES, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            yza.b();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            kqq andSet = this.f.getAndSet(null);
            if (andSet == null && this.j == null) {
                return;
            }
            if (andSet != null) {
                kqq kqqVar = this.j;
                if (kqqVar != null) {
                    kqqVar.r();
                }
                this.j = andSet;
            }
            kqq kqqVar2 = (kqq) rk1.e(this.j);
            float[] fArr = l;
            int i = kqqVar2.h;
            if (i == 1) {
                fArr = f8459k;
            } else if (i == 3) {
                fArr = m;
            }
            GLES20.glUniformMatrix3fv(this.i, 1, false, fArr, 0);
            int[] iArr = (int[]) rk1.e(kqqVar2.g);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) rk1.e(kqqVar2.f);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = kqqVar2.e;
                if (i2 != 0) {
                    i3 = (i3 + 1) / 2;
                }
                int i4 = i3;
                GLES20.glActiveTexture(33984 + i2);
                GLES20.glBindTexture(3553, this.f8461b[i2]);
                GLES20.glPixelStorei(h.c, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i2], i4, 0, 6409, 5121, byteBufferArr[i2]);
            }
            int i5 = kqqVar2.d;
            int i6 = (i5 + 1) / 2;
            int[] iArr2 = {i5, i6, i6};
            for (int i7 = 0; i7 < 3; i7++) {
                if (this.d[i7] != iArr2[i7] || this.e[i7] != iArr[i7]) {
                    rk1.g(iArr[i7] != 0);
                    float f = iArr2[i7] / iArr[i7];
                    this.g[i7] = yza.f(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f, 0.0f, f, 1.0f});
                    GLES20.glVertexAttribPointer(this.c[i7], 2, 5126, false, 0, (Buffer) this.g[i7]);
                    this.d[i7] = iArr2[i7];
                    this.e[i7] = iArr[i7];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            yza.b();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int iC = yza.c("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.h = iC;
            GLES20.glUseProgram(iC);
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.h, "in_pos");
            GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
            GLES20.glVertexAttribPointer(iGlGetAttribLocation, 2, 5126, false, 0, (Buffer) o);
            this.c[0] = GLES20.glGetAttribLocation(this.h, "in_tc_y");
            GLES20.glEnableVertexAttribArray(this.c[0]);
            this.c[1] = GLES20.glGetAttribLocation(this.h, "in_tc_u");
            GLES20.glEnableVertexAttribArray(this.c[1]);
            this.c[2] = GLES20.glGetAttribLocation(this.h, "in_tc_v");
            GLES20.glEnableVertexAttribArray(this.c[2]);
            yza.b();
            this.i = GLES20.glGetUniformLocation(this.h, "mColorConversion");
            yza.b();
            b();
            yza.b();
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    @Deprecated
    public lqq getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(kqq kqqVar) {
        this.f8458a.a(kqqVar);
    }

    public VideoDecoderGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f8458a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }
}
