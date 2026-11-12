package com.xiaomi.fitness.watch.face.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.watch.face.FaceTabListFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/DeviceFaceRecommendListItem;", "", "position", "", "tabName", "", "tabIcon", "tabType", "config_type", "config_value", "<init>", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getPosition", "()I", "getTabName", "()Ljava/lang/String;", "getTabIcon", "getTabType", "getConfig_type", "getConfig_value", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceFaceRecommendListItem {

    @SerializedName("config_type")
    private final int config_type;

    @SerializedName("config_value")
    @NotNull
    private final String config_value;

    @SerializedName("position")
    private final int position;

    @SerializedName("icon")
    @NotNull
    private final String tabIcon;

    @SerializedName("name")
    @NotNull
    private final String tabName;

    @SerializedName(FaceTabListFragment.TAB_TYPE)
    private final int tabType;

    public DeviceFaceRecommendListItem(int i, @NotNull String tabName, @NotNull String tabIcon, int i2, int i3, @NotNull String config_value) {
        Intrinsics.checkNotNullParameter(tabName, "tabName");
        Intrinsics.checkNotNullParameter(tabIcon, "tabIcon");
        Intrinsics.checkNotNullParameter(config_value, "config_value");
        this.position = i;
        this.tabName = tabName;
        this.tabIcon = tabIcon;
        this.tabType = i2;
        this.config_type = i3;
        this.config_value = config_value;
    }

    public static /* synthetic */ DeviceFaceRecommendListItem copy$default(DeviceFaceRecommendListItem deviceFaceRecommendListItem, int i, String str, String str2, int i2, int i3, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = deviceFaceRecommendListItem.position;
        }
        if ((i4 & 2) != 0) {
            str = deviceFaceRecommendListItem.tabName;
        }
        String str4 = str;
        if ((i4 & 4) != 0) {
            str2 = deviceFaceRecommendListItem.tabIcon;
        }
        String str5 = str2;
        if ((i4 & 8) != 0) {
            i2 = deviceFaceRecommendListItem.tabType;
        }
        int i5 = i2;
        if ((i4 & 16) != 0) {
            i3 = deviceFaceRecommendListItem.config_type;
        }
        int i6 = i3;
        if ((i4 & 32) != 0) {
            str3 = deviceFaceRecommendListItem.config_value;
        }
        return deviceFaceRecommendListItem.copy(i, str4, str5, i5, i6, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTabName() {
        return this.tabName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTabIcon() {
        return this.tabIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTabType() {
        return this.tabType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getConfig_type() {
        return this.config_type;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getConfig_value() {
        return this.config_value;
    }

    @NotNull
    public final DeviceFaceRecommendListItem copy(int position, @NotNull String tabName, @NotNull String tabIcon, int tabType, int config_type, @NotNull String config_value) {
        Intrinsics.checkNotNullParameter(tabName, "tabName");
        Intrinsics.checkNotNullParameter(tabIcon, "tabIcon");
        Intrinsics.checkNotNullParameter(config_value, "config_value");
        return new DeviceFaceRecommendListItem(position, tabName, tabIcon, tabType, config_type, config_value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceFaceRecommendListItem)) {
            return false;
        }
        DeviceFaceRecommendListItem deviceFaceRecommendListItem = (DeviceFaceRecommendListItem) other;
        return this.position == deviceFaceRecommendListItem.position && Intrinsics.areEqual(this.tabName, deviceFaceRecommendListItem.tabName) && Intrinsics.areEqual(this.tabIcon, deviceFaceRecommendListItem.tabIcon) && this.tabType == deviceFaceRecommendListItem.tabType && this.config_type == deviceFaceRecommendListItem.config_type && Intrinsics.areEqual(this.config_value, deviceFaceRecommendListItem.config_value);
    }

    public final int getConfig_type() {
        return this.config_type;
    }

    @NotNull
    public final String getConfig_value() {
        return this.config_value;
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final String getTabIcon() {
        return this.tabIcon;
    }

    @NotNull
    public final String getTabName() {
        return this.tabName;
    }

    public final int getTabType() {
        return this.tabType;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.position) * 31) + this.tabName.hashCode()) * 31) + this.tabIcon.hashCode()) * 31) + Integer.hashCode(this.tabType)) * 31) + Integer.hashCode(this.config_type)) * 31) + this.config_value.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceFaceRecommendListItem(position=" + this.position + ", tabName=" + this.tabName + ", tabIcon=" + this.tabIcon + ", tabType=" + this.tabType + ", config_type=" + this.config_type + ", config_value=" + this.config_value + ")";
    }
}
