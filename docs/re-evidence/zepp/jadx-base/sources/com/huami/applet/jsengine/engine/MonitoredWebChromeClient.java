package com.huami.applet.jsengine.engine;

import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import com.huami.applet.jsengine.monitor.JsEngineEventHandler;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/applet/jsengine/engine/MonitoredWebChromeClient;", "Landroid/webkit/WebChromeClient;", "Landroid/webkit/ConsoleMessage;", "consoleMessage", "", "onConsoleMessage", "", "origin", "Landroid/webkit/GeolocationPermissions$Callback;", "callback", "", "onGeolocationPermissionsShowPrompt", "Lcom/huami/applet/jsengine/monitor/JsEngineEventHandler;", "a", "Lcom/huami/applet/jsengine/monitor/JsEngineEventHandler;", "jsEngineEventHandler", "<init>", "(Lcom/huami/applet/jsengine/monitor/JsEngineEventHandler;)V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class MonitoredWebChromeClient extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final JsEngineEventHandler jsEngineEventHandler;

    public MonitoredWebChromeClient(@NotNull JsEngineEventHandler jsEngineEventHandler) {
        this.jsEngineEventHandler = jsEngineEventHandler;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(@Nullable ConsoleMessage consoleMessage) {
        if (consoleMessage != null) {
            this.jsEngineEventHandler.onConsoleMessage(consoleMessage);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(@Nullable String origin, @Nullable GeolocationPermissions.Callback callback) {
        if (callback == null) {
            return;
        }
        callback.invoke(origin, false, false);
    }
}
