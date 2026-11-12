package com.xiaomi.hm.health.device.setting.network.bean;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0002\u001a\u00020\u0000J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\u001aR$\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\u001aR$\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\n\"\u0004\b \u0010\u001aR$\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\n\"\u0004\b#\u0010\u001a¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/QuickStart;", "Lcom/xiaomi/hm/health/device/setting/network/bean/IWatchSettings;", "clone", "", "other", "", "equals", "", "hashCode", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "targetAppStartByLongPressSideKey", "targetAppStartByLongPressUpKey", "targetAppStartByClickDownKey", "targetAppStartByClickSelectKey", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/hm/health/device/setting/network/bean/QuickStart;", "", "toString", "a", "Ljava/lang/Integer;", "getTargetAppStartByLongPressSideKey", "setTargetAppStartByLongPressSideKey", "(Ljava/lang/Integer;)V", "b", "getTargetAppStartByLongPressUpKey", "setTargetAppStartByLongPressUpKey", "c", "getTargetAppStartByClickDownKey", "setTargetAppStartByClickDownKey", GoogleApiAvailabilityLight.a, "getTargetAppStartByClickSelectKey", "setTargetAppStartByClickSelectKey", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class QuickStart implements IWatchSettings {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("sideKey")
    @Nullable
    private Integer targetAppStartByLongPressSideKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("upKey")
    @Nullable
    private Integer targetAppStartByLongPressUpKey;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("downKey")
    @Nullable
    private Integer targetAppStartByClickDownKey;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("selectKey")
    @Nullable
    private Integer targetAppStartByClickSelectKey;

    public QuickStart() {
        this(null, null, null, null, 15, null);
    }

    public QuickStart(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.targetAppStartByLongPressSideKey = num;
        this.targetAppStartByLongPressUpKey = num2;
        this.targetAppStartByClickDownKey = num3;
        this.targetAppStartByClickSelectKey = num4;
    }

    public static /* synthetic */ QuickStart copy$default(QuickStart quickStart, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = quickStart.targetAppStartByLongPressSideKey;
        }
        if ((i & 2) != 0) {
            num2 = quickStart.targetAppStartByLongPressUpKey;
        }
        if ((i & 4) != 0) {
            num3 = quickStart.targetAppStartByClickDownKey;
        }
        if ((i & 8) != 0) {
            num4 = quickStart.targetAppStartByClickSelectKey;
        }
        return quickStart.copy(num, num2, num3, num4);
    }

    @NotNull
    public final QuickStart clone() {
        return new QuickStart(this.targetAppStartByLongPressSideKey, this.targetAppStartByLongPressUpKey, this.targetAppStartByClickDownKey, this.targetAppStartByClickSelectKey);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getTargetAppStartByLongPressSideKey() {
        return this.targetAppStartByLongPressSideKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTargetAppStartByLongPressUpKey() {
        return this.targetAppStartByLongPressUpKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTargetAppStartByClickDownKey() {
        return this.targetAppStartByClickDownKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getTargetAppStartByClickSelectKey() {
        return this.targetAppStartByClickSelectKey;
    }

    @NotNull
    public final QuickStart copy(@Nullable Integer targetAppStartByLongPressSideKey, @Nullable Integer targetAppStartByLongPressUpKey, @Nullable Integer targetAppStartByClickDownKey, @Nullable Integer targetAppStartByClickSelectKey) {
        return new QuickStart(targetAppStartByLongPressSideKey, targetAppStartByLongPressUpKey, targetAppStartByClickDownKey, targetAppStartByClickSelectKey);
    }

    public boolean equals(@Nullable Object other) {
        QuickStart quickStart = other instanceof QuickStart ? (QuickStart) other : null;
        return quickStart != null && Intrinsics.areEqual(this.targetAppStartByLongPressSideKey, quickStart.targetAppStartByLongPressSideKey) && Intrinsics.areEqual(this.targetAppStartByLongPressUpKey, quickStart.targetAppStartByLongPressUpKey) && Intrinsics.areEqual(this.targetAppStartByClickDownKey, quickStart.targetAppStartByClickDownKey) && Intrinsics.areEqual(this.targetAppStartByClickSelectKey, quickStart.targetAppStartByClickSelectKey);
    }

    @Nullable
    public final Integer getTargetAppStartByClickDownKey() {
        return this.targetAppStartByClickDownKey;
    }

    @Nullable
    public final Integer getTargetAppStartByClickSelectKey() {
        return this.targetAppStartByClickSelectKey;
    }

    @Nullable
    public final Integer getTargetAppStartByLongPressSideKey() {
        return this.targetAppStartByLongPressSideKey;
    }

    @Nullable
    public final Integer getTargetAppStartByLongPressUpKey() {
        return this.targetAppStartByLongPressUpKey;
    }

    public int hashCode() {
        Integer num = this.targetAppStartByLongPressSideKey;
        int iIntValue = (num == null ? 0 : num.intValue()) * 31;
        Integer num2 = this.targetAppStartByLongPressUpKey;
        int iIntValue2 = (iIntValue + (num2 == null ? 0 : num2.intValue())) * 31;
        Integer num3 = this.targetAppStartByClickDownKey;
        int iIntValue3 = (iIntValue2 + (num3 == null ? 0 : num3.intValue())) * 31;
        Integer num4 = this.targetAppStartByClickSelectKey;
        return iIntValue3 + (num4 != null ? num4.intValue() : 0);
    }

    public final void setTargetAppStartByClickDownKey(@Nullable Integer num) {
        this.targetAppStartByClickDownKey = num;
    }

    public final void setTargetAppStartByClickSelectKey(@Nullable Integer num) {
        this.targetAppStartByClickSelectKey = num;
    }

    public final void setTargetAppStartByLongPressSideKey(@Nullable Integer num) {
        this.targetAppStartByLongPressSideKey = num;
    }

    public final void setTargetAppStartByLongPressUpKey(@Nullable Integer num) {
        this.targetAppStartByLongPressUpKey = num;
    }

    @NotNull
    public String toString() {
        return "QuickStart(targetAppStartByLongPressSideKey=" + this.targetAppStartByLongPressSideKey + ", targetAppStartByLongPressUpKey=" + this.targetAppStartByLongPressUpKey + ", targetAppStartByClickDownKey=" + this.targetAppStartByClickDownKey + ", targetAppStartByClickSelectKey=" + this.targetAppStartByClickSelectKey + ")";
    }

    public /* synthetic */ QuickStart(Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4);
    }
}
