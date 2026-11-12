package com.xiaomi.hm.health.device.setting.vo;

import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/DisplayNameVo;", "", "", "component1", "component2", DeviceSettingApiImpl.META_KEY_PRODUCT_NAME, "customName", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getProductName", "()Ljava/lang/String;", "b", "getCustomName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DisplayNameVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String productName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String customName;

    public DisplayNameVo(@NotNull String str, @Nullable String str2) {
        this.productName = str;
        this.customName = str2;
    }

    public static /* synthetic */ DisplayNameVo copy$default(DisplayNameVo displayNameVo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = displayNameVo.productName;
        }
        if ((i & 2) != 0) {
            str2 = displayNameVo.customName;
        }
        return displayNameVo.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCustomName() {
        return this.customName;
    }

    @NotNull
    public final DisplayNameVo copy(@NotNull String productName, @Nullable String customName) {
        return new DisplayNameVo(productName, customName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayNameVo)) {
            return false;
        }
        DisplayNameVo displayNameVo = (DisplayNameVo) other;
        return Intrinsics.areEqual(this.productName, displayNameVo.productName) && Intrinsics.areEqual(this.customName, displayNameVo.customName);
    }

    @Nullable
    public final String getCustomName() {
        return this.customName;
    }

    @NotNull
    public final String getProductName() {
        return this.productName;
    }

    public int hashCode() {
        int iHashCode = this.productName.hashCode() * 31;
        String str = this.customName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "DisplayNameVo(productName=" + this.productName + ", customName=" + this.customName + ")";
    }
}
