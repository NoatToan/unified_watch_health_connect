package com.xiaomi.hm.health.device.setting.network.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0006\u0010\u0002\u001a\u00020\u0000J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001R$\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/Wearing;", "Lcom/xiaomi/hm/health/device/setting/network/bean/IWatchSettings;", "clone", "", "other", "", "equals", "", "hashCode", "component1", "()Ljava/lang/Integer;", "wearingDirection", "copy", "(Ljava/lang/Integer;)Lcom/xiaomi/hm/health/device/setting/network/bean/Wearing;", "", "toString", "a", "Ljava/lang/Integer;", "getWearingDirection", "setWearingDirection", "(Ljava/lang/Integer;)V", "<init>", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Wearing implements IWatchSettings {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("wearDirection")
    @Nullable
    private Integer wearingDirection;

    /* JADX WARN: Multi-variable type inference failed */
    public Wearing() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Wearing(@Nullable Integer num) {
        this.wearingDirection = num;
    }

    public static /* synthetic */ Wearing copy$default(Wearing wearing, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = wearing.wearingDirection;
        }
        return wearing.copy(num);
    }

    @NotNull
    public final Wearing clone() {
        return new Wearing(this.wearingDirection);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getWearingDirection() {
        return this.wearingDirection;
    }

    @NotNull
    public final Wearing copy(@Nullable Integer wearingDirection) {
        return new Wearing(wearingDirection);
    }

    public boolean equals(@Nullable Object other) {
        Wearing wearing = other instanceof Wearing ? (Wearing) other : null;
        if (wearing == null) {
            return false;
        }
        return Intrinsics.areEqual(this.wearingDirection, wearing.wearingDirection);
    }

    @Nullable
    public final Integer getWearingDirection() {
        return this.wearingDirection;
    }

    public int hashCode() {
        Integer num = this.wearingDirection;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final void setWearingDirection(@Nullable Integer num) {
        this.wearingDirection = num;
    }

    @NotNull
    public String toString() {
        return "Wearing(wearingDirection=" + this.wearingDirection + ")";
    }

    public /* synthetic */ Wearing(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
