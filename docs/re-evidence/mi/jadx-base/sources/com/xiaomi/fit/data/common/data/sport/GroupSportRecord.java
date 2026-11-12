package com.xiaomi.fit.data.common.data.sport;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001+B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u001d\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015¨\u0006,"}, d2 = {"Lcom/xiaomi/fit/data/common/data/sport/GroupSportRecord;", "Landroid/os/Parcelable;", "startTime", "", "duration", "", "<init>", "(JI)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getStartTime", "()J", "getDuration", "()I", "endTime", "getEndTime", "count", "getCount", "()Ljava/lang/Integer;", FitnessReportKey.setCount, "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "calories", "getCalories", "setCalories", "avgHr", "getAvgHr", "setAvgHr", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "CREATOR", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupSportRecord implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Integer avgHr;

    @Nullable
    private Integer calories;

    @Nullable
    private Integer count;
    private final int duration;
    private final long endTime;
    private final long startTime;

    /* JADX INFO: renamed from: com.xiaomi.fit.data.common.data.sport.GroupSportRecord$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fit/data/common/data/sport/GroupSportRecord$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fit/data/common/data/sport/GroupSportRecord;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fit/data/common/data/sport/GroupSportRecord;", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<GroupSportRecord> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public GroupSportRecord createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupSportRecord(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public GroupSportRecord[] newArray(int size) {
            return new GroupSportRecord[size];
        }
    }

    public GroupSportRecord(long j, int i) {
        this.startTime = j;
        this.duration = i;
        this.endTime = j + ((long) i);
    }

    public static /* synthetic */ GroupSportRecord copy$default(GroupSportRecord groupSportRecord, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = groupSportRecord.startTime;
        }
        if ((i2 & 2) != 0) {
            i = groupSportRecord.duration;
        }
        return groupSportRecord.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    public final GroupSportRecord copy(long startTime, int duration) {
        return new GroupSportRecord(startTime, duration);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupSportRecord)) {
            return false;
        }
        GroupSportRecord groupSportRecord = (GroupSportRecord) other;
        return this.startTime == groupSportRecord.startTime && this.duration == groupSportRecord.duration;
    }

    @Nullable
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    @Nullable
    public final Integer getCalories() {
        return this.calories;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (Long.hashCode(this.startTime) * 31) + Integer.hashCode(this.duration);
    }

    public final void setAvgHr(@Nullable Integer num) {
        this.avgHr = num;
    }

    public final void setCalories(@Nullable Integer num) {
        this.calories = num;
    }

    public final void setCount(@Nullable Integer num) {
        this.count = num;
    }

    @NotNull
    public String toString() {
        return "GroupSportRecord(startTime=" + this.startTime + ", duration=" + this.duration + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.startTime);
        parcel.writeInt(this.duration);
        parcel.writeValue(this.count);
        parcel.writeValue(this.calories);
        parcel.writeValue(this.avgHr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GroupSportRecord(@NotNull Parcel parcel) {
        this(parcel.readLong(), parcel.readInt());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Class cls = Integer.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        this.count = value instanceof Integer ? (Integer) value : null;
        Object value2 = parcel.readValue(cls.getClassLoader());
        this.calories = value2 instanceof Integer ? (Integer) value2 : null;
        Object value3 = parcel.readValue(cls.getClassLoader());
        this.avgHr = value3 instanceof Integer ? (Integer) value3 : null;
    }
}
