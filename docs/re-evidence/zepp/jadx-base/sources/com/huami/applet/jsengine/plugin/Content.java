package com.huami.applet.jsengine.plugin;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/huami/applet/jsengine/plugin/Content;", "", "", "component1", "component2", "Lcom/huami/applet/jsengine/plugin/Result;", "component3", "Lcom/huami/applet/jsengine/plugin/Error;", "component4", "jsonrpc", "id", "result", "error", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getJsonrpc", "()Ljava/lang/String;", "getId", "Lcom/huami/applet/jsengine/plugin/Result;", "getResult", "()Lcom/huami/applet/jsengine/plugin/Result;", "Lcom/huami/applet/jsengine/plugin/Error;", "getError", "()Lcom/huami/applet/jsengine/plugin/Error;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huami/applet/jsengine/plugin/Result;Lcom/huami/applet/jsengine/plugin/Error;)V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Content {

    @Nullable
    private final Error error;

    @NotNull
    private final String id;

    @NotNull
    private final String jsonrpc;

    @Nullable
    private final Result result;

    public Content(@NotNull String str, @NotNull String str2, @Nullable Result result, @Nullable Error error) {
        this.jsonrpc = str;
        this.id = str2;
        this.result = result;
        this.error = error;
    }

    public static /* synthetic */ Content copy$default(Content content, String str, String str2, Result result, Error error, int i, Object obj) {
        if ((i & 1) != 0) {
            str = content.jsonrpc;
        }
        if ((i & 2) != 0) {
            str2 = content.id;
        }
        if ((i & 4) != 0) {
            result = content.result;
        }
        if ((i & 8) != 0) {
            error = content.error;
        }
        return content.copy(str, str2, result, error);
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

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Result getResult() {
        return this.result;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Error getError() {
        return this.error;
    }

    @NotNull
    public final Content copy(@NotNull String jsonrpc, @NotNull String id, @Nullable Result result, @Nullable Error error) {
        return new Content(jsonrpc, id, result, error);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Content)) {
            return false;
        }
        Content content = (Content) other;
        return Intrinsics.areEqual(this.jsonrpc, content.jsonrpc) && Intrinsics.areEqual(this.id, content.id) && Intrinsics.areEqual(this.result, content.result) && Intrinsics.areEqual(this.error, content.error);
    }

    @Nullable
    public final Error getError() {
        return this.error;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    @Nullable
    public final Result getResult() {
        return this.result;
    }

    public int hashCode() {
        int iHashCode = ((this.jsonrpc.hashCode() * 31) + this.id.hashCode()) * 31;
        Result result = this.result;
        int iHashCode2 = (iHashCode + (result == null ? 0 : result.hashCode())) * 31;
        Error error = this.error;
        return iHashCode2 + (error != null ? error.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Content(jsonrpc=" + this.jsonrpc + ", id=" + this.id + ", result=" + this.result + ", error=" + this.error + ')';
    }

    public /* synthetic */ Content(String str, String str2, Result result, Error error, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : result, (i & 8) != 0 ? null : error);
    }
}
