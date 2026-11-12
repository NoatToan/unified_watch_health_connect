package com.huami.heartrate.repository.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import defpackage.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R!\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/huami/heartrate/repository/entity/HeartRateData;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "component3", "", "component4", "time", "restingHrData", "manualHrData", "wholeHrData", "copy", "", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "J", "getTime", "()J", "b", LogUtil.I, "getRestingHrData", "()I", "c", "Ljava/util/List;", "getManualHrData", "()Ljava/util/List;", GoogleApiAvailabilityLight.a, "[B", "getWholeHrData", "()[B", "<init>", "(JILjava/util/List;[B)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HeartRateData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HeartRateData> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int restingHrData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<HeartRateEntity> manualHrData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final byte[] wholeHrData;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<HeartRateData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final HeartRateData createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            long j = parcel.readLong();
            int i = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(HeartRateEntity.CREATOR.createFromParcel(parcel));
                }
            }
            return new HeartRateData(j, i, arrayList, parcel.createByteArray());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final HeartRateData[] newArray(int i) {
            return new HeartRateData[i];
        }
    }

    public HeartRateData(long j, int i, @Nullable List<HeartRateEntity> list, @Nullable byte[] bArr) {
        this.time = j;
        this.restingHrData = i;
        this.manualHrData = list;
        this.wholeHrData = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeartRateData copy$default(HeartRateData heartRateData, long j, int i, List list, byte[] bArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = heartRateData.time;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            i = heartRateData.restingHrData;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            list = heartRateData.manualHrData;
        }
        List list2 = list;
        if ((i2 & 8) != 0) {
            bArr = heartRateData.wholeHrData;
        }
        return heartRateData.copy(j2, i3, list2, bArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRestingHrData() {
        return this.restingHrData;
    }

    @Nullable
    public final List<HeartRateEntity> component3() {
        return this.manualHrData;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final byte[] getWholeHrData() {
        return this.wholeHrData;
    }

    @NotNull
    public final HeartRateData copy(long time, int restingHrData, @Nullable List<HeartRateEntity> manualHrData, @Nullable byte[] wholeHrData) {
        return new HeartRateData(time, restingHrData, manualHrData, wholeHrData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRateData)) {
            return false;
        }
        HeartRateData heartRateData = (HeartRateData) other;
        return this.time == heartRateData.time && this.restingHrData == heartRateData.restingHrData && Intrinsics.areEqual(this.manualHrData, heartRateData.manualHrData) && Intrinsics.areEqual(this.wholeHrData, heartRateData.wholeHrData);
    }

    @Nullable
    public final List<HeartRateEntity> getManualHrData() {
        return this.manualHrData;
    }

    public final int getRestingHrData() {
        return this.restingHrData;
    }

    public final long getTime() {
        return this.time;
    }

    @Nullable
    public final byte[] getWholeHrData() {
        return this.wholeHrData;
    }

    public int hashCode() {
        int iA = ((b.a(this.time) * 31) + this.restingHrData) * 31;
        List<HeartRateEntity> list = this.manualHrData;
        int iHashCode = (iA + (list == null ? 0 : list.hashCode())) * 31;
        byte[] bArr = this.wholeHrData;
        return iHashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    @NotNull
    public String toString() {
        return "HeartRateData(time=" + this.time + ", restingHrData=" + this.restingHrData + ", manualHrData=" + this.manualHrData + ", wholeHrData=" + Arrays.toString(this.wholeHrData) + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeLong(this.time);
        parcel.writeInt(this.restingHrData);
        List<HeartRateEntity> list = this.manualHrData;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<HeartRateEntity> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, flags);
            }
        }
        parcel.writeByteArray(this.wholeHrData);
    }

    public /* synthetic */ HeartRateData(long j, int i, List list, byte[] bArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : bArr);
    }
}
