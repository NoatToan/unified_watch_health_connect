package com.xiaomi.fitness.electronic.scale.export.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/bean/DelShareResponse;", "", "code", "", "message", "", "<init>", "(ILjava/lang/String;)V", "getCode", "()I", "setCode", "(I)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DelShareResponse {
    private int code;

    @NotNull
    private String message;

    /* JADX WARN: Multi-variable type inference failed */
    public DelShareResponse() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DelShareResponse copy$default(DelShareResponse delShareResponse, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = delShareResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = delShareResponse.message;
        }
        return delShareResponse.copy(i, str);
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
    public final DelShareResponse copy(int code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new DelShareResponse(code, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DelShareResponse)) {
            return false;
        }
        DelShareResponse delShareResponse = (DelShareResponse) other;
        return this.code == delShareResponse.code && Intrinsics.areEqual(this.message, delShareResponse.message);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.message.hashCode();
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    @NotNull
    public String toString() {
        return "DelShareResponse(code=" + this.code + ", message=" + this.message + ")";
    }

    public DelShareResponse(int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i;
        this.message = message;
    }

    public /* synthetic */ DelShareResponse(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
