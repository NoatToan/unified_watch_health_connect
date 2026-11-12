package com.xiaomi.fit.data.common.data.sport;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0019HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012¨\u0006&"}, d2 = {"Lcom/xiaomi/fit/data/common/data/sport/GroupSportDetailInfo;", "Landroid/os/Parcelable;", "startTime", "", "endTime", "<init>", "(JJ)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getStartTime", "()J", "getEndTime", "sportRecordInfo", "Lcom/xiaomi/fit/data/common/data/sport/GroupSportRecord;", "getSportRecordInfo", "()Lcom/xiaomi/fit/data/common/data/sport/GroupSportRecord;", "setSportRecordInfo", "(Lcom/xiaomi/fit/data/common/data/sport/GroupSportRecord;)V", "restRecordInfo", "getRestRecordInfo", "setRestRecordInfo", "writeToParcel", "", "flags", "", "describeContents", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "CREATOR", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupSportDetailInfo implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long endTime;

    @Nullable
    private GroupSportRecord restRecordInfo;

    @Nullable
    private GroupSportRecord sportRecordInfo;
    private final long startTime;

    /* JADX INFO: renamed from: com.xiaomi.fit.data.common.data.sport.GroupSportDetailInfo$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fit/data/common/data/sport/GroupSportDetailInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fit/data/common/data/sport/GroupSportDetailInfo;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fit/data/common/data/sport/GroupSportDetailInfo;", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<GroupSportDetailInfo> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public GroupSportDetailInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupSportDetailInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public GroupSportDetailInfo[] newArray(int size) {
            return new GroupSportDetailInfo[size];
        }
    }

    public GroupSportDetailInfo(long j, long j2) {
        this.startTime = j;
        this.endTime = j2;
    }

    public static /* synthetic */ GroupSportDetailInfo copy$default(GroupSportDetailInfo groupSportDetailInfo, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = groupSportDetailInfo.startTime;
        }
        if ((i & 2) != 0) {
            j2 = groupSportDetailInfo.endTime;
        }
        return groupSportDetailInfo.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final GroupSportDetailInfo copy(long startTime, long endTime) {
        return new GroupSportDetailInfo(startTime, endTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupSportDetailInfo)) {
            return false;
        }
        GroupSportDetailInfo groupSportDetailInfo = (GroupSportDetailInfo) other;
        return this.startTime == groupSportDetailInfo.startTime && this.endTime == groupSportDetailInfo.endTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final GroupSportRecord getRestRecordInfo() {
        return this.restRecordInfo;
    }

    @Nullable
    public final GroupSportRecord getSportRecordInfo() {
        return this.sportRecordInfo;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime);
    }

    public final void setRestRecordInfo(@Nullable GroupSportRecord groupSportRecord) {
        this.restRecordInfo = groupSportRecord;
    }

    public final void setSportRecordInfo(@Nullable GroupSportRecord groupSportRecord) {
        this.sportRecordInfo = groupSportRecord;
    }

    @NotNull
    public String toString() {
        return "GroupSportDetailInfo(startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeParcelable(this.sportRecordInfo, flags);
        parcel.writeParcelable(this.restRecordInfo, flags);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GroupSportDetailInfo(@NotNull Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.sportRecordInfo = (GroupSportRecord) parcel.readParcelable(GroupSportRecord.class.getClassLoader());
        this.restRecordInfo = (GroupSportRecord) parcel.readParcelable(GroupSportRecord.class.getClassLoader());
    }
}
