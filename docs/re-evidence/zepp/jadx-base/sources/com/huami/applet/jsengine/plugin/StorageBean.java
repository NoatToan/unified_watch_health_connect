package com.huami.applet.jsengine.plugin;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/huami/applet/jsengine/plugin/StorageBean;", "", "", "component1", "component2", "Lcom/huami/applet/jsengine/plugin/Method;", "component3", "Lcom/huami/applet/jsengine/plugin/Params;", "component4", "jsonrpc", "id", "method", "params", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getJsonrpc", "()Ljava/lang/String;", "getId", "Lcom/huami/applet/jsengine/plugin/Method;", "getMethod", "()Lcom/huami/applet/jsengine/plugin/Method;", "Lcom/huami/applet/jsengine/plugin/Params;", "getParams", "()Lcom/huami/applet/jsengine/plugin/Params;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huami/applet/jsengine/plugin/Method;Lcom/huami/applet/jsengine/plugin/Params;)V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StorageBean {

    @NotNull
    private final String id;

    @NotNull
    private final String jsonrpc;

    @NotNull
    private final Method method;

    @NotNull
    private final Params params;

    public StorageBean(@NotNull String str, @NotNull String str2, @NotNull Method method, @NotNull Params params) {
        this.jsonrpc = str;
        this.id = str2;
        this.method = method;
        this.params = params;
    }

    public static /* synthetic */ StorageBean copy$default(StorageBean storageBean, String str, String str2, Method method, Params params, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storageBean.jsonrpc;
        }
        if ((i & 2) != 0) {
            str2 = storageBean.id;
        }
        if ((i & 4) != 0) {
            method = storageBean.method;
        }
        if ((i & 8) != 0) {
            params = storageBean.params;
        }
        return storageBean.copy(str, str2, method, params);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Method getMethod() {
        return this.method;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Params getParams() {
        return this.params;
    }

    @NotNull
    public final StorageBean copy(@NotNull String jsonrpc, @NotNull String id, @NotNull Method method, @NotNull Params params) {
        return new StorageBean(jsonrpc, id, method, params);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StorageBean)) {
            return false;
        }
        StorageBean storageBean = (StorageBean) other;
        return Intrinsics.areEqual(this.jsonrpc, storageBean.jsonrpc) && Intrinsics.areEqual(this.id, storageBean.id) && Intrinsics.areEqual(this.method, storageBean.method) && Intrinsics.areEqual(this.params, storageBean.params);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    @NotNull
    public final Method getMethod() {
        return this.method;
    }

    @NotNull
    public final Params getParams() {
        return this.params;
    }

    public int hashCode() {
        return (((((this.jsonrpc.hashCode() * 31) + this.id.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
    }

    @NotNull
    public String toString() {
        return "StorageBean(jsonrpc=" + this.jsonrpc + ", id=" + this.id + ", method=" + this.method + ", params=" + this.params + ')';
    }
}
