package com.huawei.hms.hihealth.options;

import android.os.Parcelable;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.health.aabq;
import com.huawei.hms.health.aabv;
import com.huawei.hms.health.aabw;
import com.huawei.hms.health.aaby;
import com.huawei.hms.health.aacs;
import com.huawei.hms.hihealth.data.ActivityRecord;
import com.huawei.hms.hihealth.data.DataCollector;
import com.huawei.hms.hihealth.data.DataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes34.dex */
public class DeleteOptions extends aabq {
    public static final Parcelable.Creator<DeleteOptions> CREATOR = new aabq.aab(DeleteOptions.class);

    @aaby(id = 6)
    private final List<ActivityRecord> mActivityRecords;

    @aaby(id = 2)
    private final List<DataCollector> mDataCollectors;

    @aaby(id = 1)
    private final List<DataType> mDataTypes;

    @aaby(id = 4)
    private final long mEndTime;

    @aaby(id = 7)
    private final boolean mIsDeleteAllActivityRecords;

    @aaby(id = 5)
    private final boolean mIsDeleteAllData;

    @aaby(id = 3)
    private final long mStartTime;

    public static class Builder {
        private long aabb;
        private long aabc;
        private List<DataType> aab = new ArrayList();
        private List<DataCollector> aaba = new ArrayList();
        private boolean aabd = false;
        private List<ActivityRecord> aabe = new ArrayList();
        private boolean aabf = false;

        public Builder setTimeInterval(long j, long j2, TimeUnit timeUnit) {
            Preconditions.checkArgument(j >= 0, "Start time is illegal");
            Preconditions.checkArgument(j2 >= j, "End time is illegal");
            this.aabb = timeUnit.toMillis(j);
            this.aabc = timeUnit.toMillis(j2);
            return this;
        }

        public Builder deleteAllData() {
            Preconditions.checkArgument(this.aab.isEmpty(), "deleteAllData() can not be used together with addDataType(), because deleteAllData() will delete all data");
            Preconditions.checkArgument(this.aaba.isEmpty(), "deleteAllData() can not be use together with addDataCollector(), because deleteAllData() will delete all data");
            this.aabd = true;
            return this;
        }

        public Builder deleteAllActivityRecords() {
            Preconditions.checkArgument(this.aabe.isEmpty(), "deleteAllActivityRecords() can not be used together with addActivityRecord(), because deleteAllActivityRecords() will delete all activityRecords");
            this.aabf = true;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0016  */
        public DeleteOptions build() {
            boolean z;
            long j = this.aabb;
            if (j >= 0) {
                long j2 = this.aabc;
                if (j2 <= 0 || j2 < j) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Time range is invalid");
            Preconditions.checkState((this.aabd || !this.aaba.isEmpty() || !this.aab.isEmpty()) || (this.aabf || !this.aabe.isEmpty()), "No data or activityRecord marked for deletion");
            if (!this.aabe.isEmpty()) {
                for (ActivityRecord activityRecord : this.aabe) {
                    Preconditions.checkState(activityRecord.getStartTime(TimeUnit.MILLISECONDS) >= this.aabb && activityRecord.getEndTime(TimeUnit.MILLISECONDS) <= this.aabc, "Start time or end time of activity record is outside the set time interval");
                    Preconditions.checkArgument(aacs.aabc(activityRecord.getPackageName()), "must specify the valid package name.");
                }
            }
            return new DeleteOptions(this);
        }

        public Builder addDataType(DataType dataType) {
            Preconditions.checkArgument(!this.aabd, "addDataType() can not be used together with deleteAllData(), because deleteAllData() will be delete all data.");
            Preconditions.checkArgument(dataType != null, "data type should not be null");
            if (!this.aab.contains(dataType)) {
                this.aab.add(dataType);
            }
            return this;
        }

        public Builder addDataCollector(DataCollector dataCollector) {
            Preconditions.checkArgument(!this.aabd, "addDataCollector() can not be used together with deleteAllData(), because deleteAllData() will be delete all data.");
            Preconditions.checkArgument(dataCollector != null, "DataCollector should not be null");
            if (!this.aaba.contains(dataCollector)) {
                this.aaba.add(dataCollector);
            }
            return this;
        }

        public Builder addActivityRecord(ActivityRecord activityRecord) {
            Preconditions.checkArgument(!this.aabf, "addActivityRecord() can not be used together with deleteAllActivityRecords()");
            Preconditions.checkArgument(activityRecord != null, "ActivityRecord should not be null");
            Preconditions.checkArgument(activityRecord.getEndTime(TimeUnit.MILLISECONDS) > 0, "Cannot delete a activityRecord that has not ended");
            Preconditions.checkArgument(aacs.aabc(activityRecord.getPackageName()), "must specify the valid package name.");
            this.aabe.add(activityRecord);
            return this;
        }
    }

    public String toString() {
        return Objects.toStringHelper(this).add("dateTypes", this.mDataTypes).add("dataCollectors", this.mDataCollectors).add("startTime", Long.valueOf(this.mStartTime)).add("endTime", Long.valueOf(this.mEndTime)).add("deleteAllData", Boolean.valueOf(this.mIsDeleteAllData)).add("activityRecords", this.mActivityRecords).add("isDeleteAllActivityRecords", Boolean.valueOf(this.mIsDeleteAllActivityRecords)).toString();
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.mStartTime), Long.valueOf(this.mEndTime));
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.mStartTime, TimeUnit.MILLISECONDS);
    }

    public long getEndTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.mEndTime, TimeUnit.MILLISECONDS);
    }

    public List<DataType> getDataTypes() {
        return this.mDataTypes;
    }

    public List<DataCollector> getDataCollectors() {
        return this.mDataCollectors;
    }

    public List<ActivityRecord> getActivityRecords() {
        return this.mActivityRecords;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeleteOptions)) {
            return false;
        }
        DeleteOptions deleteOptions = (DeleteOptions) obj;
        return Objects.equal(this.mDataTypes, deleteOptions.mDataTypes) && Objects.equal(this.mDataCollectors, deleteOptions.mDataCollectors) && this.mStartTime == deleteOptions.mStartTime && this.mEndTime == deleteOptions.mEndTime && this.mIsDeleteAllData == deleteOptions.mIsDeleteAllData && Objects.equal(this.mActivityRecords, deleteOptions.mActivityRecords) && this.mIsDeleteAllActivityRecords == deleteOptions.mIsDeleteAllActivityRecords;
    }

    public boolean deleteAllData() {
        return this.mIsDeleteAllData;
    }

    public boolean deleteAllActivityRecords() {
        return this.mIsDeleteAllActivityRecords;
    }

    @aabw
    public DeleteOptions(@aabv(id = 1) List<DataType> list, @aabv(id = 2) List<DataCollector> list2, @aabv(id = 3) long j, @aabv(id = 4) long j2, @aabv(id = 5) boolean z, @aabv(id = 6) List<ActivityRecord> list3, @aabv(id = 7) boolean z2) {
        this.mDataTypes = Collections.unmodifiableList(list);
        this.mDataCollectors = list2;
        this.mStartTime = j;
        this.mEndTime = j2;
        this.mIsDeleteAllData = z;
        this.mActivityRecords = list3;
        this.mIsDeleteAllActivityRecords = z2;
    }

    private DeleteOptions(Builder builder) {
        this(builder.aab, builder.aaba, builder.aabb, builder.aabc, builder.aabd, builder.aabe, builder.aabf);
    }
}
