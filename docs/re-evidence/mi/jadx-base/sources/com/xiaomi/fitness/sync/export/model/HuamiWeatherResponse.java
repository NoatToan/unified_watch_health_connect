package com.xiaomi.fitness.sync.export.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/sync/export/model/HuamiWeatherResponse;", "", "code", "", "message", "", "result", "Lcom/xiaomi/fitness/sync/export/model/HuamiWeatherResult;", "<init>", "(ILjava/lang/String;Lcom/xiaomi/fitness/sync/export/model/HuamiWeatherResult;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "getResult", "()Lcom/xiaomi/fitness/sync/export/model/HuamiWeatherResult;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HuamiWeatherResponse {

    @SerializedName("code")
    private final int code;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("result")
    @NotNull
    private final HuamiWeatherResult result;

    public HuamiWeatherResponse(int i, @NotNull String message, @NotNull HuamiWeatherResult result) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(result, "result");
        this.code = i;
        this.message = message;
        this.result = result;
    }

    public static /* synthetic */ HuamiWeatherResponse copy$default(HuamiWeatherResponse huamiWeatherResponse, int i, String str, HuamiWeatherResult huamiWeatherResult, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = huamiWeatherResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = huamiWeatherResponse.message;
        }
        if ((i2 & 4) != 0) {
            huamiWeatherResult = huamiWeatherResponse.result;
        }
        return huamiWeatherResponse.copy(i, str, huamiWeatherResult);
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
    public final HuamiWeatherResult getResult() {
        return this.result;
    }

    @NotNull
    public final HuamiWeatherResponse copy(int code, @NotNull String message, @NotNull HuamiWeatherResult result) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(result, "result");
        return new HuamiWeatherResponse(code, message, result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HuamiWeatherResponse)) {
            return false;
        }
        HuamiWeatherResponse huamiWeatherResponse = (HuamiWeatherResponse) other;
        return this.code == huamiWeatherResponse.code && Intrinsics.areEqual(this.message, huamiWeatherResponse.message) && Intrinsics.areEqual(this.result, huamiWeatherResponse.result);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final HuamiWeatherResult getResult() {
        return this.result;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.code) * 31) + this.message.hashCode()) * 31) + this.result.hashCode();
    }

    @NotNull
    public String toString() {
        return "HuamiWeatherResponse(code=" + this.code + ", message=" + this.message + ", result=" + this.result + ")";
    }
}
