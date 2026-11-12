package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements VideoDecoderOutputBufferRenderer {
    private final a a;

    public static final class a implements GLSurfaceView.Renderer {
        private static final String n = "varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n";
        private static final String p = "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n";
        private final GLSurfaceView a;
        private final int[] b = new int[3];
        private final int[] c = new int[3];
        private final int[] d = new int[3];
        private final int[] e = new int[3];
        private final AtomicReference<VideoDecoderOutputBuffer> f = new AtomicReference<>();
        private final FloatBuffer[] g = new FloatBuffer[3];
        private int h;
        private int i;
        private VideoDecoderOutputBuffer j;
        private static final float[] k = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
        private static final float[] l = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        private static final float[] m = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
        private static final String[] o = {"y_tex", "u_tex", "v_tex"};
        private static final FloatBuffer q = GlUtil.createBuffer(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        public a(GLSurfaceView surfaceView) {
            this.a = surfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.d;
                this.e[i] = -1;
                iArr[i] = -1;
            }
        }

        private void b() {
            GLES20.glGenTextures(3, this.b, 0);
            for (int i = 0; i < 3; i++) {
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.h, o[i]), i);
                GLES20.glActiveTexture(33984 + i);
                GLES20.glBindTexture(3553, this.b[i]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            GlUtil.checkGlError();
        }

        public void a(VideoDecoderOutputBuffer outputBuffer) {
            VideoDecoderOutputBuffer andSet = this.f.getAndSet(outputBuffer);
            if (andSet != null) {
                andSet.release();
            }
            this.a.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 unused) {
            VideoDecoderOutputBuffer andSet = this.f.getAndSet(null);
            if (andSet == null && this.j == null) {
                return;
            }
            if (andSet != null) {
                VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.j;
                if (videoDecoderOutputBuffer != null) {
                    videoDecoderOutputBuffer.release();
                }
                this.j = andSet;
            }
            VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = (VideoDecoderOutputBuffer) Assertions.checkNotNull(this.j);
            float[] fArr = l;
            int i = videoDecoderOutputBuffer2.colorspace;
            if (i == 1) {
                fArr = k;
            } else if (i == 3) {
                fArr = m;
            }
            GLES20.glUniformMatrix3fv(this.i, 1, false, fArr, 0);
            int[] iArr = (int[]) Assertions.checkNotNull(videoDecoderOutputBuffer2.yuvStrides);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) Assertions.checkNotNull(videoDecoderOutputBuffer2.yuvPlanes);
            int i2 = 0;
            while (i2 < 3) {
                int i3 = i2 == 0 ? videoDecoderOutputBuffer2.height : (videoDecoderOutputBuffer2.height + 1) / 2;
                GLES20.glActiveTexture(33984 + i2);
                GLES20.glBindTexture(3553, this.b[i2]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i2], i3, 0, 6409, 5121, byteBufferArr[i2]);
                i2++;
            }
            int i4 = (iArr[0] + 1) / 2;
            int[] iArr2 = {videoDecoderOutputBuffer2.width, i4, i4};
            for (int i5 = 0; i5 < 3; i5++) {
                if (this.d[i5] != iArr2[i5] || this.e[i5] != iArr[i5]) {
                    Assertions.checkState(iArr[i5] != 0);
                    float f = iArr2[i5] / iArr[i5];
                    this.g[i5] = GlUtil.createBuffer(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f, 0.0f, f, 1.0f});
                    GLES20.glVertexAttribPointer(this.c[i5], 2, 5126, false, 0, (Buffer) this.g[i5]);
                    this.d[i5] = iArr2[i5];
                    this.e[i5] = iArr[i5];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            GlUtil.checkGlError();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 unused, int width, int height) {
            GLES20.glViewport(0, 0, width, height);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 unused, EGLConfig config) {
            int iCompileProgram = GlUtil.compileProgram(n, p);
            this.h = iCompileProgram;
            GLES20.glUseProgram(iCompileProgram);
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.h, "in_pos");
            GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
            GLES20.glVertexAttribPointer(iGlGetAttribLocation, 2, 5126, false, 0, (Buffer) q);
            this.c[0] = GLES20.glGetAttribLocation(this.h, "in_tc_y");
            GLES20.glEnableVertexAttribArray(this.c[0]);
            this.c[1] = GLES20.glGetAttribLocation(this.h, "in_tc_u");
            GLES20.glEnableVertexAttribArray(this.c[1]);
            this.c[2] = GLES20.glGetAttribLocation(this.h, "in_tc_v");
            GLES20.glEnableVertexAttribArray(this.c[2]);
            GlUtil.checkGlError();
            this.i = GLES20.glGetUniformLocation(this.h, "mColorConversion");
            GlUtil.checkGlError();
            b();
            GlUtil.checkGlError();
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    @Deprecated
    public VideoDecoderOutputBufferRenderer getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    @Override // com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer
    public void setOutputBuffer(VideoDecoderOutputBuffer outputBuffer) {
        this.a.a(outputBuffer);
    }

    public VideoDecoderGLSurfaceView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        a aVar = new a(this);
        this.a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }
}
