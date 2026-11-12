package com.huami.applet.jsengine.monitor;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/applet/jsengine/monitor/JsEngineAnalyticsInterface;", "", "", "executionInterruptedEvent", "executionTimeoutEvent", "webViewInitializationErrorEvent", "webViewKilledEvent", "applet_release"}, k = 1, mv = {1, 5, 1})
public interface JsEngineAnalyticsInterface {
    void executionInterruptedEvent();

    void executionTimeoutEvent();

    void webViewInitializationErrorEvent();

    void webViewKilledEvent();
}
