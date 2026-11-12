package com.projectseptember.RNGL;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.SimpleViewManager;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.bg8;
import defpackage.e4f;
import defpackage.g9p;
import defpackage.h3i;
import defpackage.hva;
import defpackage.i3i;
import defpackage.iej;
import defpackage.rj3;
import defpackage.sk1;
import defpackage.wu5;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class GLCanvasManager extends SimpleViewManager<GLCanvas> {
    public static final int COMMAND_CAPTURE_FRAME = 1;
    public static final String REACT_CLASS = "GLCanvas";
    private bg8 executorSupplier;

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return e4f.d("captureFrame", 1);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return e4f.f("captureFrame", e4f.d("registrationName", "onGLCaptureFrame"), "load", e4f.d("registrationName", "onGLLoad"), BroadcastsKt.SILENT_PUSHING_PROGRESS, e4f.d("registrationName", "onGLProgress"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @iej(name = "autoRedraw")
    public void setAutoRedraw(GLCanvas gLCanvas, boolean z) {
        gLCanvas.setAutoRedraw(z);
    }

    @iej(name = "backgroundColor")
    public void setBackgroundColor(GLCanvas gLCanvas, Integer num) {
        gLCanvas.setBackgroundColor(num.intValue());
    }

    @iej(name = "data")
    public void setData(GLCanvas gLCanvas, ReadableMap readableMap) {
        gLCanvas.setData(readableMap == null ? null : hva.b(readableMap));
    }

    @iej(name = "imagesToPreload")
    public void setImagesToPreload(GLCanvas gLCanvas, ReadableArray readableArray) {
        gLCanvas.setImagesToPreload(readableArray);
    }

    @iej(name = "nbContentTextures")
    public void setNbContentTextures(GLCanvas gLCanvas, int i) {
        gLCanvas.setNbContentTextures(i);
    }

    @iej(name = "pixelRatio")
    public void setPixelRatio(GLCanvas gLCanvas, float f) {
        gLCanvas.setPixelRatio(f);
    }

    @iej(name = "pointerEvents")
    public void setPointerEvents(GLCanvas gLCanvas, String str) {
        if (str != null) {
            gLCanvas.setPointerEvents(PointerEvents.valueOf(str.toUpperCase(Locale.US).replace("-", RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR)));
        }
    }

    @iej(name = "renderId")
    public void setRenderId(GLCanvas gLCanvas, int i) {
        gLCanvas.setRenderId(i);
    }

    @iej(name = "overlay")
    public void setZOrderMediaOverlay(GLCanvas gLCanvas, boolean z) {
        gLCanvas.setZOrderMediaOverlay(z);
    }

    @iej(name = "setZOrderOnTop")
    public void setZOrderOnTop(GLCanvas gLCanvas, boolean z) {
        gLCanvas.setZOrderOnTop(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public GLCanvas createViewInstance(g9p g9pVar) {
        if (this.executorSupplier == null) {
            this.executorSupplier = new wu5(new i3i(h3i.m().m()).d());
        }
        return new GLCanvas(g9pVar, this.executorSupplier);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(GLCanvas gLCanvas, int i, ReadableArray readableArray) {
        sk1.c(gLCanvas);
        sk1.c(readableArray);
        if (i != 1) {
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), getClass().getSimpleName()));
        }
        gLCanvas.x(rj3.a(readableArray.getMap(0)));
    }
}
