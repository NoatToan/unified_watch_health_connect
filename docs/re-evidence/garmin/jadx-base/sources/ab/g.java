package ab;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float[] f2446i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f2447j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float[] f2448k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f2450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.media3.common.util.b f2451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2456h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FloatBuffer f2458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FloatBuffer f2459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f2460d;

        public a(e.b bVar) {
            float[] fArr = bVar.f2444c;
            this.f2457a = fArr.length / 3;
            this.f2458b = GlUtil.d(fArr);
            this.f2459c = GlUtil.d(bVar.f2445d);
            int i14 = bVar.f2443b;
            if (i14 == 1) {
                this.f2460d = 5;
            } else if (i14 != 2) {
                this.f2460d = 4;
            } else {
                this.f2460d = 6;
            }
        }
    }

    public static boolean b(e eVar) {
        e.a aVar = eVar.f2437a;
        e.a aVar2 = eVar.f2438b;
        e.b[] bVarArr = aVar.f2441a;
        if (bVarArr.length == 1 && bVarArr[0].f2442a == 0) {
            e.b[] bVarArr2 = aVar2.f2441a;
            if (bVarArr2.length == 1 && bVarArr2[0].f2442a == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            androidx.media3.common.util.b bVar = new androidx.media3.common.util.b("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f2451c = bVar;
            this.f2452d = GLES20.glGetUniformLocation(bVar.f8515a, "uMvpMatrix");
            this.f2453e = GLES20.glGetUniformLocation(this.f2451c.f8515a, "uTexMatrix");
            this.f2454f = this.f2451c.b("aPosition");
            this.f2455g = this.f2451c.b("aTexCoords");
            this.f2456h = GLES20.glGetUniformLocation(this.f2451c.f8515a, "uTexture");
        } catch (GlUtil.GlException unused) {
        }
    }
}
