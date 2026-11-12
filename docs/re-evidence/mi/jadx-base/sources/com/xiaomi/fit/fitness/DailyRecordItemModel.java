package com.xiaomi.fit.fitness;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 12\u00020\u0001:\u00011B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010#\u001a\u00020\u0005H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u0005H\u0016J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J'\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010,\u001a\u00020\u001e2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!¨\u00062"}, d2 = {"Lcom/xiaomi/fit/fitness/DailyRecordItemModel;", "Landroid/os/Parcelable;", "time", "", "zoneOffsetInSec", "", "item", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "<init>", "(JILcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getTime", "()J", "setTime", "(J)V", "getZoneOffsetInSec", "()I", "setZoneOffsetInSec", "(I)V", "getItem", "()Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "zoneName", "", "getZoneName", "()Ljava/lang/String;", "setZoneName", "(Ljava/lang/String;)V", "isCompleteSleep", "", "()Ljava/lang/Boolean;", "setCompleteSleep", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "describeContents", "writeToParcel", "", "dest", "flags", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "CREATOR", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyRecordItemModel implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Boolean isCompleteSleep;

    @NotNull
    private final DailyRecordItem item;
    private long time;

    @Nullable
    private String zoneName;
    private int zoneOffsetInSec;

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.DailyRecordItemModel$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fit/fitness/DailyRecordItemModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fit/fitness/DailyRecordItemModel;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fit/fitness/DailyRecordItemModel;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<DailyRecordItemModel> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public DailyRecordItemModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DailyRecordItemModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public DailyRecordItemModel[] newArray(int size) {
            return new DailyRecordItemModel[size];
        }
    }

    public DailyRecordItemModel(long j, int i, @NotNull DailyRecordItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.time = j;
        this.zoneOffsetInSec = i;
        this.item = item;
        this.zoneName = getZoneName(i);
    }

    public static /* synthetic */ DailyRecordItemModel copy$default(DailyRecordItemModel dailyRecordItemModel, long j, int i, DailyRecordItem dailyRecordItem, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = dailyRecordItemModel.time;
        }
        if ((i2 & 2) != 0) {
            i = dailyRecordItemModel.zoneOffsetInSec;
        }
        if ((i2 & 4) != 0) {
            dailyRecordItem = dailyRecordItemModel.item;
        }
        return dailyRecordItemModel.copy(j, i, dailyRecordItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getZoneOffsetInSec() {
        return this.zoneOffsetInSec;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DailyRecordItem getItem() {
        return this.item;
    }

    @NotNull
    public final DailyRecordItemModel copy(long time, int zoneOffsetInSec, @NotNull DailyRecordItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new DailyRecordItemModel(time, zoneOffsetInSec, item);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyRecordItemModel)) {
            return false;
        }
        DailyRecordItemModel dailyRecordItemModel = (DailyRecordItemModel) other;
        return this.time == dailyRecordItemModel.time && this.zoneOffsetInSec == dailyRecordItemModel.zoneOffsetInSec && Intrinsics.areEqual(this.item, dailyRecordItemModel.item);
    }

    @NotNull
    public final DailyRecordItem getItem() {
        return this.item;
    }

    public final long getTime() {
        return this.time;
    }

    @Nullable
    public final String getZoneName() {
        return this.zoneName;
    }

    public final int getZoneOffsetInSec() {
        return this.zoneOffsetInSec;
    }

    public int hashCode() {
        return (((Long.hashCode(this.time) * 31) + Integer.hashCode(this.zoneOffsetInSec)) * 31) + this.item.hashCode();
    }

    @Nullable
    /* JADX INFO: renamed from: isCompleteSleep, reason: from getter */
    public final Boolean getIsCompleteSleep() {
        return this.isCompleteSleep;
    }

    public final void setCompleteSleep(@Nullable Boolean bool) {
        this.isCompleteSleep = bool;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setZoneName(@Nullable String str) {
        this.zoneName = str;
    }

    public final void setZoneOffsetInSec(int i) {
        this.zoneOffsetInSec = i;
    }

    @NotNull
    public String toString() {
        return "DailyRecordItemModel(time=" + this.time + ", zoneOffsetInSec=" + this.zoneOffsetInSec + ", item=" + this.item + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        int i;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.time);
        dest.writeInt(this.zoneOffsetInSec);
        dest.writeSerializable(this.item);
        Boolean bool = this.isCompleteSleep;
        if (bool != null) {
            i = Intrinsics.areEqual(bool, Boolean.TRUE) ? 1 : 0;
        } else {
            i = -1;
        }
        dest.writeInt(i);
    }

    @Nullable
    public final String getZoneName(int zoneOffsetInSec) {
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        String currentTimeZoneID = FitnessDateUtils.getCurrentTimeZoneID();
        if (currentTZOffsetInSec == zoneOffsetInSec) {
            return currentTimeZoneID;
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DailyRecordItemModel(@NotNull Parcel parcel) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        long j = parcel.readLong();
        int i = parcel.readInt();
        Serializable serializable = parcel.readSerializable();
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.DailyRecordItem");
        this(j, i, (DailyRecordItem) serializable);
        int i2 = parcel.readInt();
        if (i2 != 0) {
            bool = i2 != 1 ? null : Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        this.isCompleteSleep = bool;
    }
}
