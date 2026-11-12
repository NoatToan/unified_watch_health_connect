package ohos.ace.adapter;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import ohos.ace.adapter.capability.editing.TextInputPluginAosp;
import ohos.ace.adapter.capability.surface.AceSurfacePluginAosp;
import ohos.ace.adapter.capability.surface.IAceSurface;
import ohos.ace.adapter.capability.texture.AceTexturePluginAosp;
import ohos.ace.adapter.capability.texture.IAceTexture;

/* JADX INFO: loaded from: classes20.dex */
public class AcePlatformPlugin implements InputConnectionClient {
    private static final String LOG_TAG = "AcePlatformPlugin";
    private AceResourceRegister resRegister;
    private TextInputPluginAosp textInputPlugin;
    private View view;

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeAttachSurface(Object obj);

    private native long nativeInitResRegister(AceResourceRegister aceResourceRegister, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeRegisterSurface(int i, long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeRegisterTexture(int i, long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUnregisterSurface(int i, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUnregisterTexture(int i, long j);

    public AcePlatformPlugin(Context context, int i, View view) {
        ALog.i(LOG_TAG, "AcePlatformPlugin created");
        this.view = view;
        initResRegister(i);
        this.textInputPlugin = new TextInputPluginAosp(view, i);
    }

    public void keyboardHeightChanged(int i) {
        TextInputPluginAosp textInputPluginAosp = this.textInputPlugin;
        if (textInputPluginAosp != null) {
            textInputPluginAosp.keyboardHeightChanged(i);
        }
    }

    public void addResourcePlugin(AceResourcePlugin aceResourcePlugin) {
        AceResourceRegister aceResourceRegister = this.resRegister;
        if (aceResourceRegister != null) {
            aceResourceRegister.registerPlugin(aceResourcePlugin);
        }
    }

    private void initResRegister(int i) {
        AceResourceRegister aceResourceRegister = new AceResourceRegister();
        this.resRegister = aceResourceRegister;
        long jNativeInitResRegister = nativeInitResRegister(aceResourceRegister, i);
        if (jNativeInitResRegister == 0) {
            return;
        }
        this.resRegister.setRegisterPtr(jNativeInitResRegister);
    }

    public void release() {
        AceResourceRegister aceResourceRegister = this.resRegister;
        if (aceResourceRegister != null) {
            aceResourceRegister.release();
        }
        TextInputPluginAosp textInputPluginAosp = this.textInputPlugin;
        if (textInputPluginAosp != null) {
            textInputPluginAosp.release();
        }
    }

    @Override // ohos.ace.adapter.InputConnectionClient
    public InputConnection onCreateInputConnection(View view, EditorInfo editorInfo) {
        TextInputPluginAosp textInputPluginAosp = this.textInputPlugin;
        if (textInputPluginAosp != null) {
            return textInputPluginAosp.createInputConnection(view, editorInfo);
        }
        return null;
    }

    public void initTexturePlugin(final int i) {
        addResourcePlugin(AceTexturePluginAosp.createRegister(i, new IAceTexture() { // from class: ohos.ace.adapter.AcePlatformPlugin.1
            @Override // ohos.ace.adapter.capability.texture.IAceTexture
            public void markTextureFrameAvailable(long j) {
            }

            @Override // ohos.ace.adapter.capability.texture.IAceTexture
            public void registerSurface(long j, Object obj) {
                ALog.i(AcePlatformPlugin.LOG_TAG, "registerSurface.");
                AcePlatformPlugin.this.nativeRegisterSurface(i, j, obj);
            }

            @Override // ohos.ace.adapter.capability.texture.IAceTexture
            public void registerTexture(long j, Object obj) {
                ALog.i(AcePlatformPlugin.LOG_TAG, "registerTexture.");
                AcePlatformPlugin.this.nativeRegisterTexture(i, j, obj);
            }

            @Override // ohos.ace.adapter.capability.texture.IAceTexture
            public void unregisterTexture(long j) {
                ALog.i(AcePlatformPlugin.LOG_TAG, "unregisterTexture.");
                AcePlatformPlugin.this.nativeUnregisterTexture(i, j);
            }

            @Override // ohos.ace.adapter.capability.texture.IAceTexture
            public void unregisterSurface(long j) {
                ALog.i(AcePlatformPlugin.LOG_TAG, "unregisterSurface.");
                AcePlatformPlugin.this.nativeUnregisterSurface(i, j);
            }

            @Override // ohos.ace.adapter.capability.texture.IAceTexture
            public long attachNaitveSurface(Object obj) {
                ALog.d(AcePlatformPlugin.LOG_TAG, "AttachNaitveSurface.");
                long jNativeAttachSurface = AcePlatformPlugin.this.nativeAttachSurface(obj);
                if (jNativeAttachSurface == 0) {
                    ALog.e(AcePlatformPlugin.LOG_TAG, "AttachNaitveSurface failed.");
                }
                return jNativeAttachSurface;
            }
        }));
    }

    public void initSurfacePlugin(Context context, int i) {
        addResourcePlugin(AceSurfacePluginAosp.createRegister(context, this.view, new IAceSurface() { // from class: ohos.ace.adapter.AcePlatformPlugin.2
            @Override // ohos.ace.adapter.capability.surface.IAceSurface
            public long attachNaitveSurface(Object obj) {
                ALog.i(AcePlatformPlugin.LOG_TAG, "AttachNaitveSurface.");
                long jNativeAttachSurface = AcePlatformPlugin.this.nativeAttachSurface(obj);
                if (jNativeAttachSurface == 0) {
                    ALog.e(AcePlatformPlugin.LOG_TAG, "AttachNaitveSurface failed.");
                }
                return jNativeAttachSurface;
            }
        }, i));
    }

    public void notifyLifecycleChanged(Boolean bool) {
        this.resRegister.notifyLifecycleChanged(bool);
        if (bool.booleanValue()) {
            this.textInputPlugin.hideTextInput();
        }
    }

    @Override // ohos.ace.adapter.InputConnectionClient
    public boolean isStopBackPress() {
        if (this.textInputPlugin == null || !this.view.hasFocus()) {
            return true;
        }
        return this.textInputPlugin.isStopBackPress();
    }
}
