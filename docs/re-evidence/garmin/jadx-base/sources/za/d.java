package za;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import androidx.media3.common.util.GlUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public final class d extends GLSurfaceView implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f203179b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f203180a;

    public static final class a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final float[] f203181j = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String[] f203182k = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final FloatBuffer f203183l = GlUtil.d(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GLSurfaceView f203184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f203185b = new int[3];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f203186c = new int[3];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f203187d = new int[3];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f203188e = new int[3];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AtomicReference<ia.f> f203189f = new AtomicReference<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public androidx.media3.common.util.b f203190g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f203191h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ia.f f203192i;

        public a(GLSurfaceView gLSurfaceView) {
            this.f203184a = gLSurfaceView;
            for (int i14 = 0; i14 < 3; i14++) {
                int[] iArr = this.f203187d;
                this.f203188e[i14] = -1;
                iArr[i14] = -1;
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            ia.f andSet = this.f203189f.getAndSet(null);
            if (andSet == null && this.f203192i == null) {
                return;
            }
            if (andSet != null) {
                ia.f fVar = this.f203192i;
                if (fVar != null) {
                    fVar.d();
                }
                this.f203192i = andSet;
            }
            this.f203192i.getClass();
            GLES20.glUniformMatrix3fv(this.f203191h, 1, false, f203181j, 0);
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i14, int i15) {
            GLES20.glViewport(0, 0, i14, i15);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int[] iArr = this.f203186c;
            try {
                androidx.media3.common.util.b bVar = new androidx.media3.common.util.b("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f203190g = bVar;
                GLES20.glVertexAttribPointer(bVar.b("in_pos"), 2, 5126, false, 0, (Buffer) f203183l);
                iArr[0] = this.f203190g.b("in_tc_y");
                iArr[1] = this.f203190g.b("in_tc_u");
                iArr[2] = this.f203190g.b("in_tc_v");
                this.f203191h = GLES20.glGetUniformLocation(this.f203190g.f8515a, "mColorConversion");
                GlUtil.b();
                int[] iArr2 = this.f203185b;
                try {
                    GLES20.glGenTextures(3, iArr2, 0);
                    for (int i14 = 0; i14 < 3; i14++) {
                        androidx.media3.common.util.b bVar2 = this.f203190g;
                        GLES20.glUniform1i(GLES20.glGetUniformLocation(bVar2.f8515a, f203182k[i14]), i14);
                        GLES20.glActiveTexture(33984 + i14);
                        GlUtil.a(3553, iArr2[i14]);
                    }
                    GlUtil.b();
                } catch (GlUtil.GlException unused) {
                }
                GlUtil.b();
            } catch (GlUtil.GlException unused2) {
            }
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f203180a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public e getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(ia.f fVar) {
        a aVar = this.f203180a;
        ia.f andSet = aVar.f203189f.getAndSet(fVar);
        if (andSet != null) {
            andSet.d();
        }
        aVar.f203184a.requestRender();
    }

    public d(Context context) {
        this(context, null);
    }
}
