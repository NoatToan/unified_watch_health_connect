package com.xiaomi.hm.health.device.amazfit_watch;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.ui.bind.PhoneBindActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J>\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0007R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/device/amazfit_watch/SupportWatchItem;", "", "", "component1", "", "component2", "component3", "()Ljava/lang/Integer;", "component4", PhoneBindActivity.EXTRA_BIND_TYPE, "name", "resId", "imgUrl", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/xiaomi/hm/health/device/amazfit_watch/SupportWatchItem;", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getBindType", "()I", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "c", "Ljava/lang/Integer;", "getResId", GoogleApiAvailabilityLight.a, "getImgUrl", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SupportWatchItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int bindType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer resId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String imgUrl;

    public SupportWatchItem(int i, @Nullable String str, @Nullable Integer num, @Nullable String str2) {
        this.bindType = i;
        this.name = str;
        this.resId = num;
        this.imgUrl = str2;
    }

    public static /* synthetic */ SupportWatchItem copy$default(SupportWatchItem supportWatchItem, int i, String str, Integer num, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = supportWatchItem.bindType;
        }
        if ((i2 & 2) != 0) {
            str = supportWatchItem.name;
        }
        if ((i2 & 4) != 0) {
            num = supportWatchItem.resId;
        }
        if ((i2 & 8) != 0) {
            str2 = supportWatchItem.imgUrl;
        }
        return supportWatchItem.copy(i, str, num, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBindType() {
        return this.bindType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getResId() {
        return this.resId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @NotNull
    public final SupportWatchItem copy(int bindType, @Nullable String name, @Nullable Integer resId, @Nullable String imgUrl) {
        return new SupportWatchItem(bindType, name, resId, imgUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportWatchItem)) {
            return false;
        }
        SupportWatchItem supportWatchItem = (SupportWatchItem) other;
        return this.bindType == supportWatchItem.bindType && Intrinsics.areEqual(this.name, supportWatchItem.name) && Intrinsics.areEqual(this.resId, supportWatchItem.resId) && Intrinsics.areEqual(this.imgUrl, supportWatchItem.imgUrl);
    }

    public final int getBindType() {
        return this.bindType;
    }

    @Nullable
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getResId() {
        return this.resId;
    }

    public int hashCode() {
        int i = this.bindType * 31;
        String str = this.name;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.resId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.imgUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SupportWatchItem(bindType=" + this.bindType + ", name=" + this.name + ", resId=" + this.resId + ", imgUrl=" + this.imgUrl + ")";
    }

    public /* synthetic */ SupportWatchItem(int i, String str, Integer num, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? 0 : num, (i2 & 8) != 0 ? null : str2);
    }
}
