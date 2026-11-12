package defpackage;

import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes4.dex */
public interface n06 extends NativeModuleCallExceptionHandler {
    p06 getDevSettings();

    boolean getDevSupportEnabled();

    String getDownloadedJSBundleFile();

    String getJSBundleURLForRemoteDebugging();

    m8o[] getLastErrorStack();

    String getLastErrorTitle();

    String getSourceUrl();

    void handleReloadJS();

    boolean hasUpToDateJSBundleInCache();

    void hideRedboxDialog();

    void isPackagerRunning(mhh mhhVar);

    void onNewReactContextCreated(ReactContext reactContext);

    void onReactInstanceDestroyed(ReactContext reactContext);

    void setDevSupportEnabled(boolean z);

    void setFpsDebugEnabled(boolean z);

    void setHotModuleReplacementEnabled(boolean z);

    void setReloadOnJSChangeEnabled(boolean z);

    void setRemoteJSDebugEnabled(boolean z);

    void showDevOptionsDialog();

    void showNewJSError(String str, ReadableArray readableArray, int i);

    void startInspector();

    void stopInspector();

    void toggleElementInspector();

    void updateJSError(String str, ReadableArray readableArray, int i);
}
