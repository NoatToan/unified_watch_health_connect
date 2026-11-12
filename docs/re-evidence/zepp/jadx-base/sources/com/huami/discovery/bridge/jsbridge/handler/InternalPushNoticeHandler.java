package com.huami.discovery.bridge.jsbridge.handler;

import android.content.Context;
import com.google.gson.JsonParser;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.api.ApiHandler;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.notification.TransportUri;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR(\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/huami/discovery/bridge/jsbridge/handler/InternalPushNoticeHandler;", "", "Lcom/huami/discovery/bridge/jsbridge/handler/Handler;", "handler", "", TransportUri.ACTION_ADD, "", "data", "Lcom/huami/discovery/bridge/jsbridge/JsCallBackFunction;", "function", "handle", "", "Lkotlin/Function0;", "Lcom/huami/discovery/bridge/jsbridge/api/ApiHandler;", "a", "Ljava/util/Map;", "handlerMap", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "bridge_release"}, k = 1, mv = {1, 5, 1})
public final class InternalPushNoticeHandler {

    @NotNull
    public static final String TYPE = "type";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Function0<ApiHandler>> handlerMap = new LinkedHashMap();

    public InternalPushNoticeHandler(@NotNull Context context) {
        add(ThemeHandlerKt.getThemeHandler(context));
    }

    public final void add(@NotNull Handler handler) {
        this.handlerMap.put(handler.getKey(), handler.getHandleData());
    }

    public final void handle(@NotNull String data, @NotNull JsCallBackFunction function) {
        ApiHandler apiHandlerInvoke;
        Function0<ApiHandler> function0 = this.handlerMap.get(new JsonParser().parse(data).getAsJsonObject().getAsJsonObject().get("type").getAsString());
        if (function0 == null || (apiHandlerInvoke = function0.invoke()) == null) {
            return;
        }
        apiHandlerInvoke.handleData(data, function);
    }
}
