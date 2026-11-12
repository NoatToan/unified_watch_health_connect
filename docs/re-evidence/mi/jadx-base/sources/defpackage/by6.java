package defpackage;

import com.facebook.react.bridge.DefaultNativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes4.dex */
public class by6 implements n06 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultNativeModuleCallExceptionHandler f4720a = new DefaultNativeModuleCallExceptionHandler();

    @Override // defpackage.n06
    public p06 getDevSettings() {
        return null;
    }

    @Override // defpackage.n06
    public boolean getDevSupportEnabled() {
        return false;
    }

    @Override // defpackage.n06
    public String getDownloadedJSBundleFile() {
        return null;
    }

    @Override // defpackage.n06
    public String getJSBundleURLForRemoteDebugging() {
        return null;
    }

    @Override // defpackage.n06
    public m8o[] getLastErrorStack() {
        return null;
    }

    @Override // defpackage.n06
    public String getLastErrorTitle() {
        return null;
    }

    @Override // defpackage.n06
    public String getSourceUrl() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModuleCallExceptionHandler
    public void handleException(Exception exc) {
        this.f4720a.handleException(exc);
    }

    @Override // defpackage.n06
    public void handleReloadJS() {
    }

    @Override // defpackage.n06
    public boolean hasUpToDateJSBundleInCache() {
        return false;
    }

    @Override // defpackage.n06
    public void hideRedboxDialog() {
    }

    @Override // defpackage.n06
    public void isPackagerRunning(mhh mhhVar) {
    }

    @Override // defpackage.n06
    public void onNewReactContextCreated(ReactContext reactContext) {
    }

    @Override // defpackage.n06
    public void onReactInstanceDestroyed(ReactContext reactContext) {
    }

    @Override // defpackage.n06
    public void setDevSupportEnabled(boolean z) {
    }

    @Override // defpackage.n06
    public void setFpsDebugEnabled(boolean z) {
    }

    @Override // defpackage.n06
    public void setHotModuleReplacementEnabled(boolean z) {
    }

    @Override // defpackage.n06
    public void setReloadOnJSChangeEnabled(boolean z) {
    }

    @Override // defpackage.n06
    public void setRemoteJSDebugEnabled(boolean z) {
    }

    @Override // defpackage.n06
    public void showDevOptionsDialog() {
    }

    @Override // defpackage.n06
    public void showNewJSError(String str, ReadableArray readableArray, int i) {
    }

    @Override // defpackage.n06
    public void startInspector() {
    }

    @Override // defpackage.n06
    public void stopInspector() {
    }

    @Override // defpackage.n06
    public void toggleElementInspector() {
    }

    @Override // defpackage.n06
    public void updateJSError(String str, ReadableArray readableArray, int i) {
    }
}
