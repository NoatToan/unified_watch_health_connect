package com.xiaomi.fitness.health.ecg.net;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/net/SetPrivacyRequestParams;", "", "model", "", "type", "time", "", "appVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getModel", "()Ljava/lang/String;", "getType", "getTime", "()J", "getAppVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SetPrivacyRequestParams {

    @SerializedName("app_version")
    @Nullable
    private final String appVersion;

    @SerializedName("model")
    @NotNull
    private final String model;

    @SerializedName("time")
    private final long time;

    @SerializedName("type")
    @NotNull
    private final String type;

    public SetPrivacyRequestParams(@NotNull String model, @NotNull String type, long j, @Nullable String str) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(type, "type");
        this.model = model;
        this.type = type;
        this.time = j;
        this.appVersion = str;
    }

    public static /* synthetic */ SetPrivacyRequestParams copy$default(SetPrivacyRequestParams setPrivacyRequestParams, String str, String str2, long j, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setPrivacyRequestParams.model;
        }
        if ((i & 2) != 0) {
            str2 = setPrivacyRequestParams.type;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            j = setPrivacyRequestParams.time;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = setPrivacyRequestParams.appVersion;
        }
        return setPrivacyRequestParams.copy(str, str4, j2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final SetPrivacyRequestParams copy(@NotNull String model, @NotNull String type, long time, @Nullable String appVersion) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(type, "type");
        return new SetPrivacyRequestParams(model, type, time, appVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetPrivacyRequestParams)) {
            return false;
        }
        SetPrivacyRequestParams setPrivacyRequestParams = (SetPrivacyRequestParams) other;
        return Intrinsics.areEqual(this.model, setPrivacyRequestParams.model) && Intrinsics.areEqual(this.type, setPrivacyRequestParams.type) && this.time == setPrivacyRequestParams.time && Intrinsics.areEqual(this.appVersion, setPrivacyRequestParams.appVersion);
    }

    @Nullable
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((this.model.hashCode() * 31) + this.type.hashCode()) * 31) + Long.hashCode(this.time)) * 31;
        String str = this.appVersion;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "SetPrivacyRequestParams(model=" + this.model + ", type=" + this.type + ", time=" + this.time + ", appVersion=" + this.appVersion + ")";
    }
}
