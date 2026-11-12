package com.xiaomi.hm.health.bodyfat.slimming.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.algo.bodyIndex.LoseWeightSportType;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightSportDetail;", "Landroid/os/Parcelable;", "Lcom/huami/algo/bodyIndex/LoseWeightSportType;", "component1", "", "component2", "", "component3", "algoSportType", "interfaceSportName", "sportTime", "copy", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Lcom/huami/algo/bodyIndex/LoseWeightSportType;", "getAlgoSportType", "()Lcom/huami/algo/bodyIndex/LoseWeightSportType;", "b", "Ljava/lang/String;", "getInterfaceSportName", "()Ljava/lang/String;", "c", LogUtil.I, "getSportTime", "()I", "<init>", "(Lcom/huami/algo/bodyIndex/LoseWeightSportType;Ljava/lang/String;I)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LoseWeightSportDetail implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoseWeightSportDetail> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final LoseWeightSportType algoSportType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String interfaceSportName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int sportTime;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<LoseWeightSportDetail> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LoseWeightSportDetail createFromParcel(@NotNull Parcel parcel) {
            return new LoseWeightSportDetail(LoseWeightSportType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LoseWeightSportDetail[] newArray(int i) {
            return new LoseWeightSportDetail[i];
        }
    }

    public LoseWeightSportDetail(@NotNull LoseWeightSportType loseWeightSportType, @NotNull String str, int i) {
        this.algoSportType = loseWeightSportType;
        this.interfaceSportName = str;
        this.sportTime = i;
    }

    public static /* synthetic */ LoseWeightSportDetail copy$default(LoseWeightSportDetail loseWeightSportDetail, LoseWeightSportType loseWeightSportType, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            loseWeightSportType = loseWeightSportDetail.algoSportType;
        }
        if ((i2 & 2) != 0) {
            str = loseWeightSportDetail.interfaceSportName;
        }
        if ((i2 & 4) != 0) {
            i = loseWeightSportDetail.sportTime;
        }
        return loseWeightSportDetail.copy(loseWeightSportType, str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LoseWeightSportType getAlgoSportType() {
        return this.algoSportType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInterfaceSportName() {
        return this.interfaceSportName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSportTime() {
        return this.sportTime;
    }

    @NotNull
    public final LoseWeightSportDetail copy(@NotNull LoseWeightSportType algoSportType, @NotNull String interfaceSportName, int sportTime) {
        return new LoseWeightSportDetail(algoSportType, interfaceSportName, sportTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoseWeightSportDetail)) {
            return false;
        }
        LoseWeightSportDetail loseWeightSportDetail = (LoseWeightSportDetail) other;
        return this.algoSportType == loseWeightSportDetail.algoSportType && Intrinsics.areEqual(this.interfaceSportName, loseWeightSportDetail.interfaceSportName) && this.sportTime == loseWeightSportDetail.sportTime;
    }

    @NotNull
    public final LoseWeightSportType getAlgoSportType() {
        return this.algoSportType;
    }

    @NotNull
    public final String getInterfaceSportName() {
        return this.interfaceSportName;
    }

    public final int getSportTime() {
        return this.sportTime;
    }

    public int hashCode() {
        return (((this.algoSportType.hashCode() * 31) + this.interfaceSportName.hashCode()) * 31) + this.sportTime;
    }

    @NotNull
    public String toString() {
        return "LoseWeightSportDetail(algoSportType=" + this.algoSportType + ", interfaceSportName=" + this.interfaceSportName + ", sportTime=" + this.sportTime + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.algoSportType.name());
        parcel.writeString(this.interfaceSportName);
        parcel.writeInt(this.sportTime);
    }
}
