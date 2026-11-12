package com.xiaomi.hm.health.device.setting.network.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0002\u001a\u00020\u0000J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\u0018R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\u0018R$\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\u0018¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/DndMode;", "Lcom/xiaomi/hm/health/device/setting/network/bean/IWatchSettings;", "clone", "", "other", "", "equals", "", "hashCode", "component1", "()Ljava/lang/Integer;", "component2", "component3", "dndAutoEnableMode", "dndTimingStartTime", "dndTimingEndTime", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/hm/health/device/setting/network/bean/DndMode;", "", "toString", "a", "Ljava/lang/Integer;", "getDndAutoEnableMode", "setDndAutoEnableMode", "(Ljava/lang/Integer;)V", "b", "getDndTimingStartTime", "setDndTimingStartTime", "c", "getDndTimingEndTime", "setDndTimingEndTime", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DndMode implements IWatchSettings {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("dndAutoEnableM")
    @Nullable
    private Integer dndAutoEnableMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("dndStartT")
    @Nullable
    private Integer dndTimingStartTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("dndEndT")
    @Nullable
    private Integer dndTimingEndTime;

    public DndMode() {
        this(null, null, null, 7, null);
    }

    public DndMode(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.dndAutoEnableMode = num;
        this.dndTimingStartTime = num2;
        this.dndTimingEndTime = num3;
    }

    public static /* synthetic */ DndMode copy$default(DndMode dndMode, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = dndMode.dndAutoEnableMode;
        }
        if ((i & 2) != 0) {
            num2 = dndMode.dndTimingStartTime;
        }
        if ((i & 4) != 0) {
            num3 = dndMode.dndTimingEndTime;
        }
        return dndMode.copy(num, num2, num3);
    }

    @NotNull
    public final DndMode clone() {
        return new DndMode(this.dndAutoEnableMode, this.dndTimingStartTime, this.dndTimingEndTime);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getDndAutoEnableMode() {
        return this.dndAutoEnableMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getDndTimingStartTime() {
        return this.dndTimingStartTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getDndTimingEndTime() {
        return this.dndTimingEndTime;
    }

    @NotNull
    public final DndMode copy(@Nullable Integer dndAutoEnableMode, @Nullable Integer dndTimingStartTime, @Nullable Integer dndTimingEndTime) {
        return new DndMode(dndAutoEnableMode, dndTimingStartTime, dndTimingEndTime);
    }

    public boolean equals(@Nullable Object other) {
        DndMode dndMode = other instanceof DndMode ? (DndMode) other : null;
        return dndMode != null && Intrinsics.areEqual(this.dndAutoEnableMode, dndMode.dndAutoEnableMode) && Intrinsics.areEqual(this.dndTimingStartTime, dndMode.dndTimingStartTime) && Intrinsics.areEqual(this.dndTimingEndTime, dndMode.dndTimingEndTime);
    }

    @Nullable
    public final Integer getDndAutoEnableMode() {
        return this.dndAutoEnableMode;
    }

    @Nullable
    public final Integer getDndTimingEndTime() {
        return this.dndTimingEndTime;
    }

    @Nullable
    public final Integer getDndTimingStartTime() {
        return this.dndTimingStartTime;
    }

    public int hashCode() {
        Integer num = this.dndAutoEnableMode;
        int iIntValue = (num == null ? 0 : num.intValue()) * 31;
        Integer num2 = this.dndTimingStartTime;
        int iIntValue2 = (iIntValue + (num2 == null ? 0 : num2.intValue())) * 31;
        Integer num3 = this.dndTimingEndTime;
        return iIntValue2 + (num3 != null ? num3.intValue() : 0);
    }

    public final void setDndAutoEnableMode(@Nullable Integer num) {
        this.dndAutoEnableMode = num;
    }

    public final void setDndTimingEndTime(@Nullable Integer num) {
        this.dndTimingEndTime = num;
    }

    public final void setDndTimingStartTime(@Nullable Integer num) {
        this.dndTimingStartTime = num;
    }

    @NotNull
    public String toString() {
        return "DndMode(dndAutoEnableMode=" + this.dndAutoEnableMode + ", dndTimingStartTime=" + this.dndTimingStartTime + ", dndTimingEndTime=" + this.dndTimingEndTime + ")";
    }

    public /* synthetic */ DndMode(Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}
