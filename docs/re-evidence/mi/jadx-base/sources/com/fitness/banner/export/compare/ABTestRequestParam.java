package com.fitness.banner.export.compare;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/fitness/banner/export/compare/ABTestRequestParam;", "", "abTestType", "", "appVersion", "", "deviceModel", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getAbTestType", "()I", "getAppVersion", "()Ljava/lang/String;", "getDeviceModel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ABTestRequestParam {

    @SerializedName("ab_test_type")
    private final int abTestType;

    @SerializedName("app_version")
    @NotNull
    private final String appVersion;

    @SerializedName("device_model")
    @NotNull
    private final String deviceModel;

    public ABTestRequestParam(int i, @NotNull String appVersion, @NotNull String deviceModel) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        this.abTestType = i;
        this.appVersion = appVersion;
        this.deviceModel = deviceModel;
    }

    public static /* synthetic */ ABTestRequestParam copy$default(ABTestRequestParam aBTestRequestParam, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aBTestRequestParam.abTestType;
        }
        if ((i2 & 2) != 0) {
            str = aBTestRequestParam.appVersion;
        }
        if ((i2 & 4) != 0) {
            str2 = aBTestRequestParam.deviceModel;
        }
        return aBTestRequestParam.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAbTestType() {
        return this.abTestType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    public final ABTestRequestParam copy(int abTestType, @NotNull String appVersion, @NotNull String deviceModel) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        return new ABTestRequestParam(abTestType, appVersion, deviceModel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ABTestRequestParam)) {
            return false;
        }
        ABTestRequestParam aBTestRequestParam = (ABTestRequestParam) other;
        return this.abTestType == aBTestRequestParam.abTestType && Intrinsics.areEqual(this.appVersion, aBTestRequestParam.appVersion) && Intrinsics.areEqual(this.deviceModel, aBTestRequestParam.deviceModel);
    }

    public final int getAbTestType() {
        return this.abTestType;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.abTestType) * 31) + this.appVersion.hashCode()) * 31) + this.deviceModel.hashCode();
    }

    @NotNull
    public String toString() {
        return "ABTestRequestParam(abTestType=" + this.abTestType + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ")";
    }
}
