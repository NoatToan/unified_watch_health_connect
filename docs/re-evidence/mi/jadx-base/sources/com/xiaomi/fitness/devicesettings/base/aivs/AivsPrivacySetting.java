package com.xiaomi.fitness.devicesettings.base.aivs;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/aivs/AivsPrivacySetting;", "", "code", "", "data", "Lcom/xiaomi/fitness/devicesettings/base/aivs/Data;", "message", "", "<init>", "(ILcom/xiaomi/fitness/devicesettings/base/aivs/Data;Ljava/lang/String;)V", "getCode", "()I", "getData", "()Lcom/xiaomi/fitness/devicesettings/base/aivs/Data;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AivsPrivacySetting {
    private final int code;

    @Nullable
    private final Data data;

    @NotNull
    private final String message;

    public AivsPrivacySetting(int i, @Nullable Data data, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i;
        this.data = data;
        this.message = message;
    }

    public static /* synthetic */ AivsPrivacySetting copy$default(AivsPrivacySetting aivsPrivacySetting, int i, Data data, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aivsPrivacySetting.code;
        }
        if ((i2 & 2) != 0) {
            data = aivsPrivacySetting.data;
        }
        if ((i2 & 4) != 0) {
            str = aivsPrivacySetting.message;
        }
        return aivsPrivacySetting.copy(i, data, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
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
    public final AivsPrivacySetting copy(int code, @Nullable Data data, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new AivsPrivacySetting(code, data, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AivsPrivacySetting)) {
            return false;
        }
        AivsPrivacySetting aivsPrivacySetting = (AivsPrivacySetting) other;
        return this.code == aivsPrivacySetting.code && Intrinsics.areEqual(this.data, aivsPrivacySetting.data) && Intrinsics.areEqual(this.message, aivsPrivacySetting.message);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        Data data = this.data;
        return ((iHashCode + (data == null ? 0 : data.hashCode())) * 31) + this.message.hashCode();
    }

    @NotNull
    public String toString() {
        return "AivsPrivacySetting(code=" + this.code + ", data=" + this.data + ", message=" + this.message + ")";
    }
}
