package com.xiaomi.hm.health.bt.profile.base;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0004R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/base/AGpsDto;", "", "", "component1", "()Ljava/lang/Integer;", "", "component2", "()Ljava/lang/Long;", "component3", "aGpsType", "aGpsUpgradeTime", "aGpsExpirationTime", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)Lcom/xiaomi/hm/health/bt/profile/base/AGpsDto;", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/Integer;", "getAGpsType", "b", "Ljava/lang/Long;", "getAGpsUpgradeTime", "c", "getAGpsExpirationTime", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AGpsDto {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer aGpsType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long aGpsUpgradeTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long aGpsExpirationTime;

    public AGpsDto(@Nullable Integer num, @Nullable Long l, @Nullable Long l2) {
        this.aGpsType = num;
        this.aGpsUpgradeTime = l;
        this.aGpsExpirationTime = l2;
    }

    public static /* synthetic */ AGpsDto copy$default(AGpsDto aGpsDto, Integer num, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = aGpsDto.aGpsType;
        }
        if ((i & 2) != 0) {
            l = aGpsDto.aGpsUpgradeTime;
        }
        if ((i & 4) != 0) {
            l2 = aGpsDto.aGpsExpirationTime;
        }
        return aGpsDto.copy(num, l, l2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getAGpsType() {
        return this.aGpsType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getAGpsUpgradeTime() {
        return this.aGpsUpgradeTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getAGpsExpirationTime() {
        return this.aGpsExpirationTime;
    }

    @NotNull
    public final AGpsDto copy(@Nullable Integer aGpsType, @Nullable Long aGpsUpgradeTime, @Nullable Long aGpsExpirationTime) {
        return new AGpsDto(aGpsType, aGpsUpgradeTime, aGpsExpirationTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AGpsDto)) {
            return false;
        }
        AGpsDto aGpsDto = (AGpsDto) other;
        return Intrinsics.areEqual(this.aGpsType, aGpsDto.aGpsType) && Intrinsics.areEqual(this.aGpsUpgradeTime, aGpsDto.aGpsUpgradeTime) && Intrinsics.areEqual(this.aGpsExpirationTime, aGpsDto.aGpsExpirationTime);
    }

    @Nullable
    public final Long getAGpsExpirationTime() {
        return this.aGpsExpirationTime;
    }

    @Nullable
    public final Integer getAGpsType() {
        return this.aGpsType;
    }

    @Nullable
    public final Long getAGpsUpgradeTime() {
        return this.aGpsUpgradeTime;
    }

    public int hashCode() {
        Integer num = this.aGpsType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.aGpsUpgradeTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.aGpsExpirationTime;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AGpsDto(aGpsType=" + this.aGpsType + ", aGpsUpgradeTime=" + this.aGpsUpgradeTime + ", aGpsExpirationTime=" + this.aGpsExpirationTime + ')';
    }
}
