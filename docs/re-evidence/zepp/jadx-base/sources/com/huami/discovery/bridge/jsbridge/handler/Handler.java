package com.huami.discovery.bridge.jsbridge.handler;

import com.huami.discovery.bridge.jsbridge.api.ApiHandler;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/discovery/bridge/jsbridge/handler/Handler;", "", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "Lkotlin/Function0;", "Lcom/huami/discovery/bridge/jsbridge/api/ApiHandler;", "b", "Lkotlin/jvm/functions/Function0;", "getHandleData", "()Lkotlin/jvm/functions/Function0;", "handleData", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "bridge_release"}, k = 1, mv = {1, 5, 1})
public final class Handler {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<ApiHandler> handleData;

    /* JADX WARN: Multi-variable type inference failed */
    public Handler(@NotNull String str, @NotNull Function0<? extends ApiHandler> function0) {
        this.key = str;
        this.handleData = function0;
    }

    @NotNull
    public final Function0<ApiHandler> getHandleData() {
        return this.handleData;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
