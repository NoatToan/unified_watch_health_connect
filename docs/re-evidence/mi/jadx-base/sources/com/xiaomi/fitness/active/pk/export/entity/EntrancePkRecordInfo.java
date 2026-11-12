package com.xiaomi.fitness.active.pk.export.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JH\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/active/pk/export/entity/EntrancePkRecordInfo;", "", "myIcon", "", "oppoIcon", "myTotalScore", "", "oppoTotalScore", "showCrownEnable", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "getMyIcon", "()Ljava/lang/String;", "getOppoIcon", "getMyTotalScore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOppoTotalScore", "getShowCrownEnable", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/xiaomi/fitness/active/pk/export/entity/EntrancePkRecordInfo;", "equals", "other", "hashCode", "toString", "active-pk-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EntrancePkRecordInfo {

    @Nullable
    private final String myIcon;

    @Nullable
    private final Integer myTotalScore;

    @Nullable
    private final String oppoIcon;

    @Nullable
    private final Integer oppoTotalScore;
    private final boolean showCrownEnable;

    public EntrancePkRecordInfo(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, boolean z) {
        this.myIcon = str;
        this.oppoIcon = str2;
        this.myTotalScore = num;
        this.oppoTotalScore = num2;
        this.showCrownEnable = z;
    }

    public static /* synthetic */ EntrancePkRecordInfo copy$default(EntrancePkRecordInfo entrancePkRecordInfo, String str, String str2, Integer num, Integer num2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entrancePkRecordInfo.myIcon;
        }
        if ((i & 2) != 0) {
            str2 = entrancePkRecordInfo.oppoIcon;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            num = entrancePkRecordInfo.myTotalScore;
        }
        Integer num3 = num;
        if ((i & 8) != 0) {
            num2 = entrancePkRecordInfo.oppoTotalScore;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            z = entrancePkRecordInfo.showCrownEnable;
        }
        return entrancePkRecordInfo.copy(str, str3, num3, num4, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMyIcon() {
        return this.myIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOppoIcon() {
        return this.oppoIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMyTotalScore() {
        return this.myTotalScore;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getOppoTotalScore() {
        return this.oppoTotalScore;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShowCrownEnable() {
        return this.showCrownEnable;
    }

    @NotNull
    public final EntrancePkRecordInfo copy(@Nullable String myIcon, @Nullable String oppoIcon, @Nullable Integer myTotalScore, @Nullable Integer oppoTotalScore, boolean showCrownEnable) {
        return new EntrancePkRecordInfo(myIcon, oppoIcon, myTotalScore, oppoTotalScore, showCrownEnable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntrancePkRecordInfo)) {
            return false;
        }
        EntrancePkRecordInfo entrancePkRecordInfo = (EntrancePkRecordInfo) other;
        return Intrinsics.areEqual(this.myIcon, entrancePkRecordInfo.myIcon) && Intrinsics.areEqual(this.oppoIcon, entrancePkRecordInfo.oppoIcon) && Intrinsics.areEqual(this.myTotalScore, entrancePkRecordInfo.myTotalScore) && Intrinsics.areEqual(this.oppoTotalScore, entrancePkRecordInfo.oppoTotalScore) && this.showCrownEnable == entrancePkRecordInfo.showCrownEnable;
    }

    @Nullable
    public final String getMyIcon() {
        return this.myIcon;
    }

    @Nullable
    public final Integer getMyTotalScore() {
        return this.myTotalScore;
    }

    @Nullable
    public final String getOppoIcon() {
        return this.oppoIcon;
    }

    @Nullable
    public final Integer getOppoTotalScore() {
        return this.oppoTotalScore;
    }

    public final boolean getShowCrownEnable() {
        return this.showCrownEnable;
    }

    public int hashCode() {
        String str = this.myIcon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.oppoIcon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.myTotalScore;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.oppoTotalScore;
        return ((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31) + Boolean.hashCode(this.showCrownEnable);
    }

    @NotNull
    public String toString() {
        return "EntrancePkRecordInfo(myIcon=" + this.myIcon + ", oppoIcon=" + this.oppoIcon + ", myTotalScore=" + this.myTotalScore + ", oppoTotalScore=" + this.oppoTotalScore + ", showCrownEnable=" + this.showCrownEnable + ")";
    }

    public /* synthetic */ EntrancePkRecordInfo(String str, String str2, Integer num, Integer num2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, num2, (i & 16) != 0 ? false : z);
    }
}
