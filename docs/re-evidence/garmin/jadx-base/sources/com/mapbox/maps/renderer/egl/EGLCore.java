package com.mapbox.maps.renderer.egl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import cd0.f;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.renderer.RendererError;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import d53.w;
import fb1.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import sn.a;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 @2\u00020\u0001:\u0001@B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0015\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\"H\u0000¢\u0006\u0002\b&J\u0017\u0010'\u001a\u0004\u0018\u00010\u00052\u0006\u0010(\u001a\u00020\tH\u0002¢\u0006\u0002\u0010)J\u0017\u0010*\u001a\u0004\u0018\u00010\u00052\u0006\u0010+\u001a\u00020\tH\u0002¢\u0006\u0002\u0010)J\r\u0010,\u001a\u00020$H\u0000¢\u0006\u0002\b-J\u0016\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0005J\u000e\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u001bJ\u0006\u00106\u001a\u00020\u0003J\u0010\u00107\u001a\u00020$2\u0006\u00108\u001a\u00020\u0010H\u0002J\u0006\u00109\u001a\u00020\u0003J\u0006\u0010:\u001a\u00020\u0005J\u0006\u0010;\u001a\u00020$J\u000e\u0010<\u001a\u00020$2\u0006\u00105\u001a\u00020\u001bJ\u0015\u0010=\u001a\u00020$2\u0006\u0010%\u001a\u00020\"H\u0000¢\u0006\u0002\b>J\u000e\u0010?\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u001bR\u0014\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/mapbox/maps/renderer/egl/EGLCore;", "", "translucentSurface", "", "antialiasingSampleCount", "", "sharedContext", "Landroid/opengl/EGLContext;", "mapName", "", "(ZILandroid/opengl/EGLContext;Ljava/lang/String;)V", "TAG", "getTAG$annotations", "()V", "accumulatedRendererErrorList", "Ljava/util/LinkedList;", "Lcom/mapbox/maps/renderer/RendererError;", "eglConfig", "Landroid/opengl/EGLConfig;", "eglContext", "getEglContext$maps_sdk_release", "()Landroid/opengl/EGLContext;", "setEglContext$maps_sdk_release", "(Landroid/opengl/EGLContext;)V", "eglDisplay", "Landroid/opengl/EGLDisplay;", "eglNoSurface", "Landroid/opengl/EGLSurface;", "getEglNoSurface$maps_sdk_release", "()Landroid/opengl/EGLSurface;", "mainHandler", "Landroid/os/Handler;", "rendererSetupErrorListenerSet", "Ljava/util/HashSet;", "Lcom/mapbox/maps/renderer/RendererSetupErrorListener;", "addRendererStateListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addRendererStateListener$maps_sdk_release", "checkEglError", "msg", "(Ljava/lang/String;)Ljava/lang/Integer;", "checkEglErrorAndNotify", "functionName", "clearRendererStateListeners", "clearRendererStateListeners$maps_sdk_release", "createOffscreenSurface", "width", "height", "createWindowSurface", "surface", "Landroid/view/Surface;", "makeCurrent", "eglSurface", "makeNothingCurrent", "notifyListeners", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "prepareEgl", "queryContextVersion", "release", "releaseSurface", "removeRendererStateListener", "removeRendererStateListener$maps_sdk_release", "swapBuffers", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class EGLCore {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final int[] attribsEgl3 = {12440, 3, 12344};
    private final String TAG;
    private final LinkedList<RendererError> accumulatedRendererErrorList;
    private final int antialiasingSampleCount;
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private final EGLSurface eglNoSurface;
    private final Handler mainHandler;
    private final String mapName;
    private final HashSet<RendererSetupErrorListener> rendererSetupErrorListenerSet;
    private final EGLContext sharedContext;
    private final boolean translucentSurface;

    public EGLCore(boolean z14, int i14, EGLContext eGLContext, String str) {
        eGLContext.getClass();
        str.getClass();
        this.translucentSurface = z14;
        this.antialiasingSampleCount = i14;
        this.sharedContext = eGLContext;
        this.mapName = str;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        eGLDisplay.getClass();
        this.eglDisplay = eGLDisplay;
        EGLContext eGLContext2 = EGL14.EGL_NO_CONTEXT;
        eGLContext2.getClass();
        this.eglContext = eGLContext2;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        eGLSurface.getClass();
        this.eglNoSurface = eGLSurface;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.accumulatedRendererErrorList = new LinkedList<>();
        this.rendererSetupErrorListenerSet = new HashSet<>();
        this.TAG = "Mbgl-EglCore".concat(!w.J(str) ? c.n("\\", str) : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addRendererStateListener$lambda$3(LinkedList linkedList, RendererSetupErrorListener rendererSetupErrorListener) {
        linkedList.getClass();
        rendererSetupErrorListener.getClass();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            RendererError rendererError = (RendererError) it.next();
            rendererError.getClass();
            rendererSetupErrorListener.onError(rendererError);
        }
    }

    private final Integer checkEglError(String msg) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return null;
        }
        String str = this.TAG;
        StringBuilder sbI = a.i(msg, ": EGL error: 0x");
        sbI.append(Integer.toHexString(iEglGetError));
        MapboxLogger.logE(str, sbI.toString());
        return Integer.valueOf(iEglGetError);
    }

    private final Integer checkEglErrorAndNotify(String functionName) {
        Integer numCheckEglError = checkEglError(functionName);
        if (numCheckEglError != null) {
            RendererError rendererError = numCheckEglError.intValue() == 12291 ? RendererError.OUT_OF_MEMORY : new RendererError(numCheckEglError.intValue());
            MapboxLogger.logE(this.TAG, "EGL error " + rendererError.getEglErrorCode() + " occurred for " + functionName + '!');
            notifyListeners(rendererError);
        }
        return numCheckEglError;
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    private final void notifyListeners(RendererError error) {
        this.accumulatedRendererErrorList.add(error);
        if (this.rendererSetupErrorListenerSet.isEmpty()) {
            return;
        }
        this.mainHandler.post(new f(27, new HashSet(this.rendererSetupErrorListenerSet), error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyListeners$lambda$5(HashSet hashSet, RendererError rendererError) {
        hashSet.getClass();
        rendererError.getClass();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((RendererSetupErrorListener) it.next()).onError(rendererError);
        }
    }

    public final void addRendererStateListener$maps_sdk_release(RendererSetupErrorListener listener) {
        listener.getClass();
        this.rendererSetupErrorListenerSet.add(listener);
        if (this.accumulatedRendererErrorList.isEmpty()) {
            return;
        }
        this.mainHandler.post(new f(28, new LinkedList(this.accumulatedRendererErrorList), listener));
    }

    public final void clearRendererStateListeners$maps_sdk_release() {
        this.accumulatedRendererErrorList.clear();
        this.rendererSetupErrorListenerSet.clear();
    }

    public final EGLSurface createOffscreenSurface(int width, int height) {
        int[] iArr = {12375, width, 12374, height, 12344};
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLConfig eGLConfig = this.eglConfig;
        if (eGLConfig == null) {
            s.m("eglConfig");
            throw null;
        }
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
        if (checkEglErrorAndNotify("eglCreatePbufferSurface") != null || eGLSurfaceEglCreatePbufferSurface == null) {
            return this.eglNoSurface;
        }
        MapboxLogger.logI(this.TAG, "Created PBuffer, w = " + width + ", h = " + height);
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public final EGLSurface createWindowSurface(Surface surface) {
        surface.getClass();
        try {
            int[] iArr = {12344};
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLConfig eGLConfig = this.eglConfig;
            if (eGLConfig == null) {
                s.m("eglConfig");
                throw null;
            }
            EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
            if (checkEglErrorAndNotify("eglCreateWindowSurface") == null && eGLSurfaceEglCreateWindowSurface != null) {
                return eGLSurfaceEglCreateWindowSurface;
            }
            return this.eglNoSurface;
        } catch (Exception e4) {
            MapboxLogger.logE(this.TAG, "eglCreateWindowSurface has thrown an exception:\n" + e4.getLocalizedMessage());
            return this.eglNoSurface;
        }
    }

    /* JADX INFO: renamed from: getEglContext$maps_sdk_release, reason: from getter */
    public final EGLContext getEglContext() {
        return this.eglContext;
    }

    /* JADX INFO: renamed from: getEglNoSurface$maps_sdk_release, reason: from getter */
    public final EGLSurface getEglNoSurface() {
        return this.eglNoSurface;
    }

    public final boolean makeCurrent(EGLSurface eglSurface) {
        eglSurface.getClass();
        if (s.g(EGL14.eglGetCurrentContext(), this.eglContext)) {
            return true;
        }
        if (s.g(this.eglDisplay, EGL14.EGL_NO_DISPLAY)) {
            MapboxLogger.logI(this.TAG, "NOTE: makeCurrent but eglDisplay is EGL_NO_DISPLAY");
        }
        if (EGL14.eglMakeCurrent(this.eglDisplay, eglSurface, eglSurface, this.eglContext)) {
            return true;
        }
        checkEglErrorAndNotify("eglMakeCurrent");
        return false;
    }

    public final boolean makeNothingCurrent() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            return true;
        }
        checkEglErrorAndNotify("makeNothingCurrent");
        return false;
    }

    public final boolean prepareEgl() {
        Unit unit;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        eGLDisplayEglGetDisplay.getClass();
        this.eglDisplay = eGLDisplayEglGetDisplay;
        if (s.g(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            MapboxLogger.logW(this.TAG, "Unable to get default display, eglInitialize will most likely fail shortly.");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.eglDisplay, iArr, 0, iArr, 1)) {
            checkEglErrorAndNotify("eglInitialize");
            return false;
        }
        EGLConfig eGLConfigChooseConfig = new EGLConfigChooser(this.translucentSurface, this.antialiasingSampleCount, this.mapName).chooseConfig(this.eglDisplay);
        if (eGLConfigChooseConfig != null) {
            this.eglConfig = eGLConfigChooseConfig;
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            notifyListeners(RendererError.NO_VALID_EGL_CONFIG_FOUND);
            return false;
        }
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLConfig eGLConfig = this.eglConfig;
        if (eGLConfig == null) {
            s.m("eglConfig");
            throw null;
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, this.sharedContext, attribsEgl3, 0);
        if (checkEglError("eglCreateContext") != null) {
            h.z("OpenGL ES 3.0 context could not be created");
            return false;
        }
        eGLContextEglCreateContext.getClass();
        this.eglContext = eGLContextEglCreateContext;
        int iQueryContextVersion = queryContextVersion();
        MapboxLogger.logI(this.TAG, "EGLContext created, client version " + iQueryContextVersion);
        return true;
    }

    public final int queryContextVersion() {
        int[] iArr = new int[1];
        if (!EGL14.eglQueryContext(this.eglDisplay, this.eglContext, 12440, iArr, 0)) {
            checkEglErrorAndNotify("eglQueryContext");
        }
        return iArr[0];
    }

    public final void release() {
        if (!s.g(this.eglDisplay, EGL14.EGL_NO_DISPLAY)) {
            makeNothingCurrent();
            EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
            EGL14.eglTerminate(this.eglDisplay);
        }
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        eGLDisplay.getClass();
        this.eglDisplay = eGLDisplay;
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        eGLContext.getClass();
        this.eglContext = eGLContext;
    }

    public final void releaseSurface(EGLSurface eglSurface) {
        eglSurface.getClass();
        if (eglSurface.equals(EGL14.EGL_NO_SURFACE) || s.g(this.eglDisplay, EGL14.EGL_NO_DISPLAY)) {
            MapboxLogger.logI(this.TAG, "EGL surface was already destroyed before.");
        } else {
            EGL14.eglDestroySurface(this.eglDisplay, eglSurface);
            MapboxLogger.logI(this.TAG, "EGL surface was destroyed.");
        }
    }

    public final void removeRendererStateListener$maps_sdk_release(RendererSetupErrorListener listener) {
        listener.getClass();
        this.rendererSetupErrorListenerSet.remove(listener);
    }

    public final void setEglContext$maps_sdk_release(EGLContext eGLContext) {
        eGLContext.getClass();
        this.eglContext = eGLContext;
    }

    public final int swapBuffers(EGLSurface eglSurface) {
        eglSurface.getClass();
        if (EGL14.eglSwapBuffers(this.eglDisplay, eglSurface)) {
            return 12288;
        }
        return EGL14.eglGetError();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/renderer/egl/EGLCore$Companion;", "", "()V", "attribsEgl3", "", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EGLCore(boolean z14, int i14, EGLContext eGLContext, String str, int i15, j jVar) {
        if ((i15 & 4) != 0) {
            eGLContext = EGL14.EGL_NO_CONTEXT;
            eGLContext.getClass();
        }
        this(z14, i14, eGLContext, str);
    }
}
