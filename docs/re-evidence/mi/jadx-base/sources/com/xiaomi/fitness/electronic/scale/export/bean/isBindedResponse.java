package com.xiaomi.fitness.electronic.scale.export.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/bean/isBindedResponse;", "", "code", "", "message", "", "data", "result", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()I", "setCode", "(I)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getData", "setData", "getResult", "setResult", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class isBindedResponse {
    private int code;

    @NotNull
    private String data;

    @NotNull
    private String message;

    @NotNull
    private String result;

    public isBindedResponse() {
        this(0, null, null, null, 15, null);
    }

    public static /* synthetic */ isBindedResponse copy$default(isBindedResponse isbindedresponse, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = isbindedresponse.code;
        }
        if ((i2 & 2) != 0) {
            str = isbindedresponse.message;
        }
        if ((i2 & 4) != 0) {
            str2 = isbindedresponse.data;
        }
        if ((i2 & 8) != 0) {
            str3 = isbindedresponse.result;
        }
        return isbindedresponse.copy(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    @NotNull
    public final isBindedResponse copy(int code, @NotNull String message, @NotNull String data, @NotNull String result) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(result, "result");
        return new isBindedResponse(code, message, data, result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof isBindedResponse)) {
            return false;
        }
        isBindedResponse isbindedresponse = (isBindedResponse) other;
        return this.code == isbindedresponse.code && Intrinsics.areEqual(this.message, isbindedresponse.message) && Intrinsics.areEqual(this.data, isbindedresponse.data) && Intrinsics.areEqual(this.result, isbindedresponse.result);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getResult() {
        return this.result;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.code) * 31) + this.message.hashCode()) * 31) + this.data.hashCode()) * 31) + this.result.hashCode();
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data = str;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final void setResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.result = str;
    }

    @NotNull
    public String toString() {
        return "isBindedResponse(code=" + this.code + ", message=" + this.message + ", data=" + this.data + ", result=" + this.result + ")";
    }

    public isBindedResponse(int i, @NotNull String message, @NotNull String data, @NotNull String result) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(result, "result");
        this.code = i;
        this.message = message;
        this.data = data;
        this.result = result;
    }

    public /* synthetic */ isBindedResponse(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }
}
