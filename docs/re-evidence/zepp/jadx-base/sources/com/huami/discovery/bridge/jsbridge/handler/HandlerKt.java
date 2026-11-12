package com.huami.discovery.bridge.jsbridge.handler;

import com.huami.discovery.bridge.jsbridge.api.ApiHandler;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¨\u0006\u0007"}, d2 = {"", "key", "Lkotlin/Function0;", "Lcom/huami/discovery/bridge/jsbridge/api/ApiHandler;", "handleData", "Lcom/huami/discovery/bridge/jsbridge/handler/Handler;", "handler", "bridge_release"}, k = 2, mv = {1, 5, 1})
public final class HandlerKt {
    @NotNull
    public static final Handler handler(@NotNull String str, @NotNull Function0<? extends ApiHandler> function0) {
        return new Handler(str, function0);
    }
}
