package com.xiaomi.fitness.devicesettings.common.offlinemap;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0003H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictUrlData;", "", "infocode", "", "info", "version", "adcode", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInfocode", "()Ljava/lang/String;", "getInfo", "getVersion", "getAdcode", "getUrl", "toString", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DistrictUrlData {

    @NotNull
    private final String adcode;

    @NotNull
    private final String info;

    @NotNull
    private final String infocode;

    @Nullable
    private final String url;

    @NotNull
    private final String version;

    public DistrictUrlData(@NotNull String infocode, @NotNull String info, @NotNull String version, @NotNull String adcode, @Nullable String str) {
        Intrinsics.checkNotNullParameter(infocode, "infocode");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(adcode, "adcode");
        this.infocode = infocode;
        this.info = info;
        this.version = version;
        this.adcode = adcode;
        this.url = str;
    }

    public static /* synthetic */ DistrictUrlData copy$default(DistrictUrlData districtUrlData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = districtUrlData.infocode;
        }
        if ((i & 2) != 0) {
            str2 = districtUrlData.info;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = districtUrlData.version;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = districtUrlData.adcode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = districtUrlData.url;
        }
        return districtUrlData.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInfocode() {
        return this.infocode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAdcode() {
        return this.adcode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final DistrictUrlData copy(@NotNull String infocode, @NotNull String info, @NotNull String version, @NotNull String adcode, @Nullable String url) {
        Intrinsics.checkNotNullParameter(infocode, "infocode");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(adcode, "adcode");
        return new DistrictUrlData(infocode, info, version, adcode, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DistrictUrlData)) {
            return false;
        }
        DistrictUrlData districtUrlData = (DistrictUrlData) other;
        return Intrinsics.areEqual(this.infocode, districtUrlData.infocode) && Intrinsics.areEqual(this.info, districtUrlData.info) && Intrinsics.areEqual(this.version, districtUrlData.version) && Intrinsics.areEqual(this.adcode, districtUrlData.adcode) && Intrinsics.areEqual(this.url, districtUrlData.url);
    }

    @NotNull
    public final String getAdcode() {
        return this.adcode;
    }

    @NotNull
    public final String getInfo() {
        return this.info;
    }

    @NotNull
    public final String getInfocode() {
        return this.infocode;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = ((((((this.infocode.hashCode() * 31) + this.info.hashCode()) * 31) + this.version.hashCode()) * 31) + this.adcode.hashCode()) * 31;
        String str = this.url;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "{infocode:" + this.infocode + ",info:" + this.info + ",version:" + this.version + ",adcode:" + this.adcode + ",url:" + this.url + "}";
    }
}
