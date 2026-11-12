package t0;

import am.j;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Surface;
import b0.b0;
import com.google.android.gms.gcm.Task;
import com.google.firebase.crashlytics.internal.common.IdManager;
import i3.e5;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k7.h;
import r0.l;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f161627a = {12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f161628b = {12445, 13632, 12344};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f161629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f161630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f161631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f161632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f161633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FloatBuffer f161634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final FloatBuffer f161635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t0.c f161636j;

    public class a implements l {
        @Override // r0.l
        public final String a() {
            Locale locale = Locale.US;
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n";
        }
    }

    public class b implements l {
        @Override // r0.l
        public final String a() {
            Locale locale = Locale.US;
            return "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}";
        }
    }

    public class c implements l {
        @Override // r0.l
        public final String a() {
            Locale locale = Locale.US;
            return "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}";
        }
    }

    /* JADX INFO: renamed from: t0.d$d, reason: collision with other inner class name */
    public static class C3050d extends f {
        public C3050d() {
            super("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
        }
    }

    public enum e {
        UNKNOWN,
        DEFAULT,
        YUV
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f161641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f161642b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f161643c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f161644d = -1;

        /* JADX WARN: Code duplicated, block: B:32:0x0075  */
        /* JADX WARN: Code duplicated, block: B:34:0x007a  */
        /* JADX WARN: Code duplicated, block: B:36:0x007f  */
        public f(String str, String str2) throws Throwable {
            int iJ;
            int iJ2;
            int iGlCreateProgram;
            try {
                iJ = d.j(35633, str);
                try {
                    iJ2 = d.j(35632, str2);
                    try {
                        iGlCreateProgram = GLES20.glCreateProgram();
                        try {
                            d.b("glCreateProgram");
                            GLES20.glAttachShader(iGlCreateProgram, iJ);
                            d.b("glAttachShader");
                            GLES20.glAttachShader(iGlCreateProgram, iJ2);
                            d.b("glAttachShader");
                            GLES20.glLinkProgram(iGlCreateProgram);
                            int[] iArr = new int[1];
                            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                            if (iArr[0] == 1) {
                                this.f161641a = iGlCreateProgram;
                                a();
                            } else {
                                throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                            }
                        } catch (IllegalArgumentException e4) {
                            e = e4;
                            if (iJ != -1) {
                                GLES20.glDeleteShader(iJ);
                            }
                            if (iJ2 != -1) {
                                GLES20.glDeleteShader(iJ2);
                            }
                            if (iGlCreateProgram != -1) {
                                GLES20.glDeleteProgram(iGlCreateProgram);
                            }
                            throw e;
                        } catch (IllegalStateException e14) {
                            e = e14;
                            if (iJ != -1) {
                                GLES20.glDeleteShader(iJ);
                            }
                            if (iJ2 != -1) {
                                GLES20.glDeleteShader(iJ2);
                            }
                            if (iGlCreateProgram != -1) {
                                GLES20.glDeleteProgram(iGlCreateProgram);
                            }
                            throw e;
                        }
                    } catch (IllegalArgumentException | IllegalStateException e15) {
                        e = e15;
                        iGlCreateProgram = -1;
                    }
                } catch (IllegalArgumentException | IllegalStateException e16) {
                    e = e16;
                    iJ2 = -1;
                    iGlCreateProgram = iJ2;
                    if (iJ != -1) {
                        GLES20.glDeleteShader(iJ);
                    }
                    if (iJ2 != -1) {
                        GLES20.glDeleteShader(iJ2);
                    }
                    if (iGlCreateProgram != -1) {
                        GLES20.glDeleteProgram(iGlCreateProgram);
                    }
                    throw e;
                }
            } catch (IllegalArgumentException | IllegalStateException e17) {
                e = e17;
                iJ = -1;
                iJ2 = -1;
            }
        }

        public final void a() {
            int i14 = this.f161641a;
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(i14, "aPosition");
            this.f161644d = iGlGetAttribLocation;
            d.e(iGlGetAttribLocation, "aPosition");
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i14, "uTransMatrix");
            this.f161642b = iGlGetUniformLocation;
            d.e(iGlGetUniformLocation, "uTransMatrix");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i14, "uAlphaScale");
            this.f161643c = iGlGetUniformLocation2;
            d.e(iGlGetUniformLocation2, "uAlphaScale");
        }

        public void b() {
            GLES20.glUseProgram(this.f161641a);
            d.b("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.f161644d);
            d.b("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f161644d, 2, 5126, false, 0, (Buffer) d.f161634h);
            d.b("glVertexAttribPointer");
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            GLES20.glUniformMatrix4fv(this.f161642b, 1, false, fArr, 0);
            d.b("glUniformMatrix4fv");
            GLES20.glUniform1f(this.f161643c, 1.0f);
            d.b("glUniform1f");
        }
    }

    static {
        Locale locale = Locale.US;
        f161629c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f161630d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f161631e = new a();
        f161632f = new b();
        f161633g = new c();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        f161634h = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        f161635i = floatBufferAsFloatBuffer2;
        f161636j = new t0.c(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    private d() {
    }

    public static void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        fb1.c.y(sn.a.i(str, ": EGL error: 0x"), Integer.toHexString(iEglGetError));
    }

    public static void b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        fb1.c.y(sn.a.i(str, ": GL error 0x"), Integer.toHexString(iGlGetError));
    }

    public static void c(Thread thread) {
        h.f(thread == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    public static void d(boolean z14, AtomicBoolean atomicBoolean) {
        h.f(z14 == atomicBoolean.get(), z14 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    public static void e(int i14, String str) {
        if (i14 >= 0) {
            return;
        }
        vb.h.z(j.m("Unable to locate '", str, "' in program"));
    }

    public static HashMap f(b0 b0Var, Map map) {
        Object gVar;
        e eVar;
        HashMap map2 = new HashMap();
        e[] eVarArrValues = e.values();
        int length = eVarArrValues.length;
        for (int i14 = 0; i14 < length; i14++) {
            e eVar2 = eVarArrValues[i14];
            l lVar = (l) map.get(eVar2);
            if (lVar != null) {
                gVar = new g(b0Var, lVar);
            } else if (eVar2 == e.YUV || eVar2 == (eVar = e.DEFAULT)) {
                gVar = new g(b0Var, eVar2);
            } else {
                h.f(eVar2 == e.UNKNOWN, "Unhandled input format: " + eVar2);
                if (b0Var.a()) {
                    gVar = new C3050d();
                } else {
                    l lVar2 = (l) map.get(eVar);
                    gVar = lVar2 != null ? new g(b0Var, lVar2) : new g(b0Var, eVar);
                }
            }
            Objects.toString(eVar2);
            gVar.toString();
            map2.put(eVar2, gVar);
        }
        return map2;
    }

    public static int g() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b("glGenTextures");
        int i14 = iArr[0];
        GLES20.glBindTexture(36197, i14);
        b("glBindTexture " + i14);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, Task.EXTRAS_LIMIT_BYTES, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("glTexParameter");
        return i14;
    }

    public static EGLSurface h(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        vb.h.z("surface was null");
        return null;
    }

    public static String i() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return IdManager.DEFAULT_VERSION_NAME;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        return e5.g(strGroup, ".", strGroup2);
    }

    public static int j(int i14, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i14);
        b("glCreateShader type=" + i14);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        vb.h.z(sn.a.e(i14, "Could not compile shader type ", ":", strGlGetShaderInfoLog));
        return 0;
    }

    public static class g extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f161645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f161646f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f161647g;

        /* JADX WARN: Illegal instructions before constructor call */
        public g(b0 b0Var, l lVar) {
            String str = b0Var.a() ? d.f161630d : d.f161629c;
            try {
                String strA = lVar.a();
                if (strA == null || !strA.contains("vTextureCoord") || !strA.contains("sTexture")) {
                    throw new IllegalArgumentException("Invalid fragment shader");
                }
                super(str, strA);
                this.f161645e = -1;
                this.f161646f = -1;
                this.f161647g = -1;
                a();
                int i14 = this.f161641a;
                int iGlGetUniformLocation = GLES20.glGetUniformLocation(i14, "sTexture");
                this.f161645e = iGlGetUniformLocation;
                d.e(iGlGetUniformLocation, "sTexture");
                int iGlGetAttribLocation = GLES20.glGetAttribLocation(i14, "aTextureCoord");
                this.f161647g = iGlGetAttribLocation;
                d.e(iGlGetAttribLocation, "aTextureCoord");
                int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i14, "uTexMatrix");
                this.f161646f = iGlGetUniformLocation2;
                d.e(iGlGetUniformLocation2, "uTexMatrix");
            } catch (Throwable th3) {
                if (th3 instanceof IllegalArgumentException) {
                    throw th3;
                }
                n23.j.w("Unable retrieve fragment shader source", th3);
                throw null;
            }
        }

        @Override // t0.d.f
        public final void b() {
            super.b();
            GLES20.glUniform1i(this.f161645e, 0);
            GLES20.glEnableVertexAttribArray(this.f161647g);
            d.b("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f161647g, 2, 5126, false, 0, (Buffer) d.f161635i);
            d.b("glVertexAttribPointer");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public g(b0 b0Var, e eVar) {
            l lVar;
            if (b0Var.a()) {
                h.b(eVar != e.UNKNOWN, "No default sampler shader available for" + eVar);
                if (eVar == e.YUV) {
                    lVar = d.f161633g;
                } else {
                    lVar = d.f161632f;
                }
            } else {
                lVar = d.f161631e;
            }
            this(b0Var, lVar);
        }
    }
}
