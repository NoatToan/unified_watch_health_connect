package com.huami.ad.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.message.ui.submessage.SubMessageActivity;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tHÆ\u0003JG\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\r\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR$\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/huami/ad/entity/AdExtension;", "", "", "component1", "", "component2", "", "component3", "component4", "", "component5", "jsbridgeAuth", "subType", "useNetworkType", "image", DeviceSettingApiImpl.PARAMS_SOURCE, "copy", "toString", "hashCode", "other", "equals", "a", "Z", "getJsbridgeAuth", "()Z", "b", "Ljava/lang/String;", "getSubType", "()Ljava/lang/String;", "c", LogUtil.I, "getUseNetworkType", "()I", GoogleApiAvailabilityLight.a, "getImage", "e", "Ljava/util/List;", "getDeviceSources", "()Ljava/util/List;", "<init>", "(ZLjava/lang/String;ILjava/lang/String;Ljava/util/List;)V", "ad_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AdExtension {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("jsbridge_auth")
    private final boolean jsbridgeAuth;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName(SubMessageActivity.EXTRA_SUB_TYPE)
    @Nullable
    private final String subType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("use_network_type")
    private final int useNetworkType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("image")
    @Nullable
    private final String image;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("device_sources")
    @Nullable
    private final List<Integer> deviceSources;

    public AdExtension(boolean z, @Nullable String str, int i, @Nullable String str2, @Nullable List<Integer> list) {
        this.jsbridgeAuth = z;
        this.subType = str;
        this.useNetworkType = i;
        this.image = str2;
        this.deviceSources = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdExtension copy$default(AdExtension adExtension, boolean z, String str, int i, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = adExtension.jsbridgeAuth;
        }
        if ((i2 & 2) != 0) {
            str = adExtension.subType;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            i = adExtension.useNetworkType;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = adExtension.image;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            list = adExtension.deviceSources;
        }
        return adExtension.copy(z, str3, i3, str4, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getJsbridgeAuth() {
        return this.jsbridgeAuth;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUseNetworkType() {
        return this.useNetworkType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final List<Integer> component5() {
        return this.deviceSources;
    }

    @NotNull
    public final AdExtension copy(boolean jsbridgeAuth, @Nullable String subType, int useNetworkType, @Nullable String image, @Nullable List<Integer> deviceSources) {
        return new AdExtension(jsbridgeAuth, subType, useNetworkType, image, deviceSources);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdExtension)) {
            return false;
        }
        AdExtension adExtension = (AdExtension) other;
        return this.jsbridgeAuth == adExtension.jsbridgeAuth && Intrinsics.areEqual(this.subType, adExtension.subType) && this.useNetworkType == adExtension.useNetworkType && Intrinsics.areEqual(this.image, adExtension.image) && Intrinsics.areEqual(this.deviceSources, adExtension.deviceSources);
    }

    @Nullable
    public final List<Integer> getDeviceSources() {
        return this.deviceSources;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    public final boolean getJsbridgeAuth() {
        return this.jsbridgeAuth;
    }

    @Nullable
    public final String getSubType() {
        return this.subType;
    }

    public final int getUseNetworkType() {
        return this.useNetworkType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.jsbridgeAuth;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.subType;
        int iHashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.useNetworkType) * 31;
        String str2 = this.image;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Integer> list = this.deviceSources;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdExtension(jsbridgeAuth=" + this.jsbridgeAuth + ", subType=" + ((Object) this.subType) + ", useNetworkType=" + this.useNetworkType + ", image=" + ((Object) this.image) + ", deviceSources=" + this.deviceSources + ')';
    }

    public /* synthetic */ AdExtension(boolean z, String str, int i, String str2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, str, (i2 & 4) != 0 ? 0 : i, str2, (i2 & 16) != 0 ? null : list);
    }
}
