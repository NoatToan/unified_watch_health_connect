package com.xiaomi.eco;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/eco/EcoBindResponse;", "", "code", "", "data", "Lcom/xiaomi/eco/Data;", "message", "<init>", "(Ljava/lang/String;Lcom/xiaomi/eco/Data;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getData", "()Lcom/xiaomi/eco/Data;", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EcoBindResponse {

    @SerializedName("code")
    @NotNull
    private final String code;

    @SerializedName("data")
    @NotNull
    private final Data data;

    @SerializedName("message")
    @NotNull
    private final String message;

    public EcoBindResponse(@NotNull String code, @NotNull Data data, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public static /* synthetic */ EcoBindResponse copy$default(EcoBindResponse ecoBindResponse, String str, Data data, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ecoBindResponse.code;
        }
        if ((i & 2) != 0) {
            data = ecoBindResponse.data;
        }
        if ((i & 4) != 0) {
            str2 = ecoBindResponse.message;
        }
        return ecoBindResponse.copy(str, data, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final EcoBindResponse copy(@NotNull String code, @NotNull Data data, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(message, "message");
        return new EcoBindResponse(code, data, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcoBindResponse)) {
            return false;
        }
        EcoBindResponse ecoBindResponse = (EcoBindResponse) other;
        return Intrinsics.areEqual(this.code, ecoBindResponse.code) && Intrinsics.areEqual(this.data, ecoBindResponse.data) && Intrinsics.areEqual(this.message, ecoBindResponse.message);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.data.hashCode()) * 31) + this.message.hashCode();
    }

    @NotNull
    public String toString() {
        return "EcoBindResponse(code=" + this.code + ", data=" + this.data + ", message=" + this.message + ")";
    }
}
