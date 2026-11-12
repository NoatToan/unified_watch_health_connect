package com.xiaomi.camera.sample.test;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import com.xiaomi.onetrack.c.q;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012J \u0010\u001c\u001a\u00020\u00162\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J \u0010!\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0002J\u0012\u0010\"\u001a\u0004\u0018\u00010\n2\u0006\u0010#\u001a\u00020\bH\u0002J\u0018\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\b2\u0006\u0010%\u001a\u00020\nH\u0002J\u0010\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010(J\u0010\u0010)\u001a\u00020\u00162\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010*\u001a\u00020\u0012J\b\u0010+\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010,\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/xiaomi/camera/sample/test/GLSportInfoRender;", "", "<init>", "()V", "vertexShaderCode", "", "fragmentShaderCode", "eglDisplay", "Landroid/opengl/EGLDisplay;", "eglConfig", "Landroid/opengl/EGLConfig;", "eglContext", "Landroid/opengl/EGLContext;", "eglSurface", "Landroid/opengl/EGLSurface;", "context", "Landroid/content/Context;", "glTextureId", "", "hasInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "init", "", "ctx", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "width", "height", "render", "renderVideoFrame", "renderBitmap", "initEGL", "", "initOpenGL", "chooseEglConfig", "display", "createEglContext", q.f13857a, "createEGLSurface", "surface", "Landroid/view/Surface;", "makeCurrent", "getTexture", "getDefaultEGLSurface", "destroyEGLSurface", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GLSportInfoRender {
    private Context context;

    @Nullable
    private EGLConfig eglConfig;

    @Nullable
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;

    @Nullable
    private EGLSurface eglSurface;

    @NotNull
    private final String vertexShaderCode = "uniform mat4 uMVPMatrix;\nattribute vec4 vPosition;\nuniform mat4 uTexPMatrix;\nattribute vec4 vTexCoordinate;\nvarying vec2 aTexCoordinate;\nvoid main() {\n  gl_Position = uMVPMatrix * vPosition;\n  aTexCoordinate = (uTexPMatrix * vTexCoordinate).xy;\n}";

    @NotNull
    private final String fragmentShaderCode = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES vTexture;\nvarying vec2 aTexCoordinate;\nvoid main() {\n  gl_FragColor = texture2D(vTexture, aTexCoordinate);\n}\n";
    private int glTextureId = -1;

    @NotNull
    private final AtomicBoolean hasInit = new AtomicBoolean(false);

    private final EGLConfig chooseEglConfig(EGLDisplay display) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(display, new int[]{12320, 32, 12321, 8, 12324, 8, 12323, 8, 12322, 8, 12352, 4, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        return null;
    }

    private final EGLContext createEglContext(EGLDisplay display, EGLConfig config) {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(display, config, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        Intrinsics.checkNotNullExpressionValue(eGLContextEglCreateContext, "eglCreateContext(...)");
        return eGLContextEglCreateContext;
    }

    private final boolean initEGL(SurfaceTexture surfaceTexture) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.eglDisplay = eGLDisplayEglGetDisplay;
        EGLDisplay eGLDisplay = null;
        if (eGLDisplayEglGetDisplay == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eglDisplay");
            eGLDisplayEglGetDisplay = null;
        }
        if (Intrinsics.areEqual(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            return false;
        }
        EGLDisplay eGLDisplay2 = this.eglDisplay;
        if (eGLDisplay2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eglDisplay");
            eGLDisplay2 = null;
        }
        if (!EGL14.eglInitialize(eGLDisplay2, null, 0, null, 0)) {
            return false;
        }
        EGLDisplay eGLDisplay3 = this.eglDisplay;
        if (eGLDisplay3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eglDisplay");
            eGLDisplay3 = null;
        }
        EGLConfig eGLConfigChooseEglConfig = chooseEglConfig(eGLDisplay3);
        this.eglConfig = eGLConfigChooseEglConfig;
        if (eGLConfigChooseEglConfig == null) {
            return false;
        }
        EGLDisplay eGLDisplay4 = this.eglDisplay;
        if (eGLDisplay4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eglDisplay");
        } else {
            eGLDisplay = eGLDisplay4;
        }
        EGLConfig eGLConfig = this.eglConfig;
        Intrinsics.checkNotNull(eGLConfig);
        EGLContext eGLContextCreateEglContext = createEglContext(eGLDisplay, eGLConfig);
        this.eglContext = eGLContextCreateEglContext;
        if (Intrinsics.areEqual(eGLContextCreateEglContext, EGL14.EGL_NO_CONTEXT)) {
            return false;
        }
        EGLSurface eGLSurfaceCreateEGLSurface = createEGLSurface(new Surface(surfaceTexture));
        this.eglSurface = eGLSurfaceCreateEGLSurface;
        makeCurrent(eGLSurfaceCreateEGLSurface);
        return true;
    }

    private final void initOpenGL(Context context, int width, int height) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glViewport(0, 0, width, height);
    }

    private final void renderBitmap() {
    }

    private final void renderVideoFrame() {
    }

    @NotNull
    public final EGLSurface createEGLSurface(@Nullable Surface surface) {
        int[] iArr = {12344};
        EGLDisplay eGLDisplay = this.eglDisplay;
        if (eGLDisplay == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eglDisplay");
            eGLDisplay = null;
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, this.eglConfig, surface, iArr, 0);
        Intrinsics.checkNotNullExpressionValue(eGLSurfaceEglCreateWindowSurface, "eglCreateWindowSurface(...)");
        return eGLSurfaceEglCreateWindowSurface;
    }

    public final void destroyEGLSurface(@Nullable EGLSurface surface) {
        EGLDisplay eGLDisplay = this.eglDisplay;
        if (eGLDisplay == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eglDisplay");
            eGLDisplay = null;
        }
        EGL14.eglDestroySurface(eGLDisplay, surface);
    }

    @Nullable
    /* JADX INFO: renamed from: getDefaultEGLSurface, reason: from getter */
    public final EGLSurface getEglSurface() {
        return this.eglSurface;
    }

    public final int getTexture() {
        if (this.glTextureId == -1) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            this.glTextureId = iArr[0];
        }
        return this.glTextureId;
    }

    public final void init(@NotNull Context ctx, @NotNull SurfaceTexture surfaceTexture, int width, int height) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        this.context = ctx;
        initEGL(surfaceTexture);
        initOpenGL(ctx, width, height);
    }

    public final void makeCurrent(@Nullable EGLSurface eglSurface) {
        EGLDisplay eGLDisplay = this.eglDisplay;
        if (eGLDisplay == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eglDisplay");
            eGLDisplay = null;
        }
        EGL14.eglMakeCurrent(eGLDisplay, eglSurface, eglSurface, this.eglContext);
    }

    public final void render(@Nullable EGLSurface eglSurface, int width, int height) {
        try {
            makeCurrent(eglSurface);
            renderVideoFrame();
            renderBitmap();
        } catch (Exception unused) {
        }
    }
}
