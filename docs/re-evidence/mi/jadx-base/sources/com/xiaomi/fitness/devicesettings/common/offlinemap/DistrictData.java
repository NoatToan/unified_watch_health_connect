package com.xiaomi.fitness.devicesettings.common.offlinemap;

import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010$\u001a\u00020\u0003H\u0016J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003Ja\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010.\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictData;", "", "name", "", "level", "adcode", MediaStoreUtil.MediaInfo.SIZE, "districts", "", "downloadStatus", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DownloadStatus;", "downloadProgress", "", "expandable", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DownloadStatus;IZ)V", "getName", "()Ljava/lang/String;", "getLevel", "getAdcode", "getSize", "getDistricts", "()Ljava/util/List;", "getDownloadStatus", "()Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DownloadStatus;", "setDownloadStatus", "(Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DownloadStatus;)V", "getDownloadProgress", "()I", "setDownloadProgress", "(I)V", "getExpandable", "()Z", "setExpandable", "(Z)V", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DistrictData {

    @NotNull
    private final String adcode;

    @Nullable
    private final List<DistrictData> districts;
    private int downloadProgress;

    @NotNull
    private DownloadStatus downloadStatus;
    private boolean expandable;

    @NotNull
    private final String level;

    @NotNull
    private final String name;

    @NotNull
    private final String size;

    public DistrictData(@NotNull String name, @NotNull String level, @NotNull String adcode, @NotNull String size, @Nullable List<DistrictData> list, @NotNull DownloadStatus downloadStatus, int i, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(adcode, "adcode");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(downloadStatus, "downloadStatus");
        this.name = name;
        this.level = level;
        this.adcode = adcode;
        this.size = size;
        this.districts = list;
        this.downloadStatus = downloadStatus;
        this.downloadProgress = i;
        this.expandable = z;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAdcode() {
        return this.adcode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @Nullable
    public final List<DistrictData> component5() {
        return this.districts;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DownloadStatus getDownloadStatus() {
        return this.downloadStatus;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getDownloadProgress() {
        return this.downloadProgress;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getExpandable() {
        return this.expandable;
    }

    @NotNull
    public final DistrictData copy(@NotNull String name, @NotNull String level, @NotNull String adcode, @NotNull String size, @Nullable List<DistrictData> districts, @NotNull DownloadStatus downloadStatus, int downloadProgress, boolean expandable) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(adcode, "adcode");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(downloadStatus, "downloadStatus");
        return new DistrictData(name, level, adcode, size, districts, downloadStatus, downloadProgress, expandable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DistrictData)) {
            return false;
        }
        DistrictData districtData = (DistrictData) other;
        return Intrinsics.areEqual(this.name, districtData.name) && Intrinsics.areEqual(this.level, districtData.level) && Intrinsics.areEqual(this.adcode, districtData.adcode) && Intrinsics.areEqual(this.size, districtData.size) && Intrinsics.areEqual(this.districts, districtData.districts) && this.downloadStatus == districtData.downloadStatus && this.downloadProgress == districtData.downloadProgress && this.expandable == districtData.expandable;
    }

    @NotNull
    public final String getAdcode() {
        return this.adcode;
    }

    @Nullable
    public final List<DistrictData> getDistricts() {
        return this.districts;
    }

    public final int getDownloadProgress() {
        return this.downloadProgress;
    }

    @NotNull
    public final DownloadStatus getDownloadStatus() {
        return this.downloadStatus;
    }

    public final boolean getExpandable() {
        return this.expandable;
    }

    @NotNull
    public final String getLevel() {
        return this.level;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = ((((((this.name.hashCode() * 31) + this.level.hashCode()) * 31) + this.adcode.hashCode()) * 31) + this.size.hashCode()) * 31;
        List<DistrictData> list = this.districts;
        return ((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.downloadStatus.hashCode()) * 31) + Integer.hashCode(this.downloadProgress)) * 31) + Boolean.hashCode(this.expandable);
    }

    public final void setDownloadProgress(int i) {
        this.downloadProgress = i;
    }

    public final void setDownloadStatus(@NotNull DownloadStatus downloadStatus) {
        Intrinsics.checkNotNullParameter(downloadStatus, "<set-?>");
        this.downloadStatus = downloadStatus;
    }

    public final void setExpandable(boolean z) {
        this.expandable = z;
    }

    @NotNull
    public String toString() {
        return "{name:" + this.name + ",level:" + this.level + ",adcode:" + this.adcode + ",downloadStatus:" + this.downloadStatus + ",downloadProgress" + this.downloadProgress + ",[" + this.districts + "]}";
    }

    public /* synthetic */ DistrictData(String str, String str2, String str3, String str4, List list, DownloadStatus downloadStatus, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, (i2 & 32) != 0 ? DownloadStatus.STATUS_IDEL : downloadStatus, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? false : z);
    }
}
