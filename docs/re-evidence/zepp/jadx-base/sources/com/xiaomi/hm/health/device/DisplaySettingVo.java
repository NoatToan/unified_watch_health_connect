package com.xiaomi.hm.health.device;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.DisplayType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b.\u0010/J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003JE\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010+R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010\u001b¨\u00060"}, d2 = {"Lcom/xiaomi/hm/health/device/DisplaySettingVo;", "", "", "component1", "component2", "Lcom/xiaomi/hm/health/device/ItemType;", "component3", "Lcom/xiaomi/hm/health/device/AppCardStatus;", "component4", "component5", "component6", "iconRes", "titleRes", "itemType", "status", "index", "sourceType", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getIconRes", "()I", "b", "getTitleRes", "c", "Lcom/xiaomi/hm/health/device/ItemType;", "getItemType", "()Lcom/xiaomi/hm/health/device/ItemType;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/AppCardStatus;", "getStatus", "()Lcom/xiaomi/hm/health/device/AppCardStatus;", "setStatus", "(Lcom/xiaomi/hm/health/device/AppCardStatus;)V", "e", "getIndex", "setIndex", "(I)V", "f", "getSourceType", "<init>", "(IILcom/xiaomi/hm/health/device/ItemType;Lcom/xiaomi/hm/health/device/AppCardStatus;II)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DisplaySettingVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int iconRes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int titleRes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final ItemType itemType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private AppCardStatus status;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private int index;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int sourceType;

    public DisplaySettingVo(@DrawableRes int i, @StringRes int i2, @NotNull ItemType itemType, @NotNull AppCardStatus appCardStatus, int i3, int i4) {
        this.iconRes = i;
        this.titleRes = i2;
        this.itemType = itemType;
        this.status = appCardStatus;
        this.index = i3;
        this.sourceType = i4;
    }

    public static /* synthetic */ DisplaySettingVo copy$default(DisplaySettingVo displaySettingVo, int i, int i2, ItemType itemType, AppCardStatus appCardStatus, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = displaySettingVo.iconRes;
        }
        if ((i5 & 2) != 0) {
            i2 = displaySettingVo.titleRes;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            itemType = displaySettingVo.itemType;
        }
        ItemType itemType2 = itemType;
        if ((i5 & 8) != 0) {
            appCardStatus = displaySettingVo.status;
        }
        AppCardStatus appCardStatus2 = appCardStatus;
        if ((i5 & 16) != 0) {
            i3 = displaySettingVo.index;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = displaySettingVo.sourceType;
        }
        return displaySettingVo.copy(i, i6, itemType2, appCardStatus2, i7, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIconRes() {
        return this.iconRes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTitleRes() {
        return this.titleRes;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ItemType getItemType() {
        return this.itemType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AppCardStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getSourceType() {
        return this.sourceType;
    }

    @NotNull
    public final DisplaySettingVo copy(@DrawableRes int iconRes, @StringRes int titleRes, @NotNull ItemType itemType, @NotNull AppCardStatus status, int index, int sourceType) {
        return new DisplaySettingVo(iconRes, titleRes, itemType, status, index, sourceType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplaySettingVo)) {
            return false;
        }
        DisplaySettingVo displaySettingVo = (DisplaySettingVo) other;
        return this.iconRes == displaySettingVo.iconRes && this.titleRes == displaySettingVo.titleRes && this.itemType == displaySettingVo.itemType && this.status == displaySettingVo.status && this.index == displaySettingVo.index && this.sourceType == displaySettingVo.sourceType;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final ItemType getItemType() {
        return this.itemType;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    @NotNull
    public final AppCardStatus getStatus() {
        return this.status;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public int hashCode() {
        return (((((((((this.iconRes * 31) + this.titleRes) * 31) + this.itemType.hashCode()) * 31) + this.status.hashCode()) * 31) + this.index) * 31) + this.sourceType;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setStatus(@NotNull AppCardStatus appCardStatus) {
        this.status = appCardStatus;
    }

    @NotNull
    public String toString() {
        return "DisplaySettingVo(iconRes=" + this.iconRes + ", titleRes=" + this.titleRes + ", itemType=" + this.itemType + ", status=" + this.status + ", index=" + this.index + ", sourceType=" + this.sourceType + ")";
    }

    public /* synthetic */ DisplaySettingVo(int i, int i2, ItemType itemType, AppCardStatus appCardStatus, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, i2, (i5 & 4) != 0 ? ItemType.TYPE_NORMAL : itemType, (i5 & 8) != 0 ? AppCardStatus.HIDDEN : appCardStatus, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? DisplayType.NONE.getValue() : i4);
    }
}
