package com.huami.applet.jsengine.monitor;

import android.webkit.ConsoleMessage;
import com.huami.applet.jsengine.exception.JavascriptException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/applet/jsengine/monitor/JsEngineEventHandlerImpl;", "Lcom/huami/applet/jsengine/monitor/JsEngineEventHandler;", "Landroid/webkit/ConsoleMessage;", "consoleMessage", "", "onConsoleMessage", "Lcom/huami/applet/jsengine/exception/JavascriptException;", "javascriptException", "onUncaughtJavascriptError", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class JsEngineEventHandlerImpl implements JsEngineEventHandler {
    @Override // com.huami.applet.jsengine.monitor.JsEngineEventHandler
    public void onConsoleMessage(@NotNull ConsoleMessage consoleMessage) {
    }

    @Override // com.huami.applet.jsengine.monitor.JsEngineEventHandler
    public void onUncaughtJavascriptError(@NotNull JavascriptException javascriptException) {
    }
}
