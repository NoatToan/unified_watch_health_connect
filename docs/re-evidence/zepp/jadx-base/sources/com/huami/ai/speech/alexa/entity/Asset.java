package com.huami.ai.speech.alexa.entity;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/Asset;", "", "", "component1", "component2", "component3", "component4", "assetId", HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_DISPLAY_NAME, "sampleUrl", "type", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getAssetId", "()Ljava/lang/String;", "b", "getDisplayName", "c", "getSampleUrl", GoogleApiAvailabilityLight.a, "getType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Asset {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("assetId")
    @NotNull
    private final String assetId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_DISPLAY_NAME)
    @NotNull
    private final String displayName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("sampleUrl")
    @NotNull
    private final String sampleUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("type")
    @NotNull
    private final String type;

    public Asset(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.assetId = str;
        this.displayName = str2;
        this.sampleUrl = str3;
        this.type = str4;
    }

    public static /* synthetic */ Asset copy$default(Asset asset, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = asset.assetId;
        }
        if ((i & 2) != 0) {
            str2 = asset.displayName;
        }
        if ((i & 4) != 0) {
            str3 = asset.sampleUrl;
        }
        if ((i & 8) != 0) {
            str4 = asset.type;
        }
        return asset.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAssetId() {
        return this.assetId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSampleUrl() {
        return this.sampleUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final Asset copy(@NotNull String assetId, @NotNull String displayName, @NotNull String sampleUrl, @NotNull String type) {
        return new Asset(assetId, displayName, sampleUrl, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) other;
        return Intrinsics.areEqual(this.assetId, asset.assetId) && Intrinsics.areEqual(this.displayName, asset.displayName) && Intrinsics.areEqual(this.sampleUrl, asset.sampleUrl) && Intrinsics.areEqual(this.type, asset.type);
    }

    @NotNull
    public final String getAssetId() {
        return this.assetId;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getSampleUrl() {
        return this.sampleUrl;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.assetId.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.sampleUrl.hashCode()) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "Asset(assetId=" + this.assetId + ", displayName=" + this.displayName + ", sampleUrl=" + this.sampleUrl + ", type=" + this.type + ')';
    }
}
