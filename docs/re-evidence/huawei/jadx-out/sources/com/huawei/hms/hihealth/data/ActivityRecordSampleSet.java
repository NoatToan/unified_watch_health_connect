package com.huawei.hms.hihealth.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.common.internal.safeparcel.SafeParcelReader;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.health.aabz;

/* JADX INFO: loaded from: classes34.dex */
public final class ActivityRecordSampleSet implements Parcelable {
    public static final Parcelable.Creator<ActivityRecordSampleSet> CREATOR = new aab();
    private static final int DATASETID = 2;
    private static final int SESSIONID = 1;
    private static final String TAG = "ActivityRecordSampleSet";
    private final ActivityRecord mActivityRecord;
    private final SampleSet mSampleSet;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.mActivityRecord, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.mSampleSet, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("mActivityRecord", this.mActivityRecord).add("mSampleSet", this.mSampleSet).toString();
    }

    public boolean isSampleSetEmpty() {
        return this.mSampleSet.isEmpty();
    }

    public int hashCode() {
        return Objects.hashCode(this.mActivityRecord, this.mSampleSet);
    }

    public SampleSet getSampleSet() {
        return this.mSampleSet;
    }

    public ActivityRecord getActivityRecord() {
        return this.mActivityRecord;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityRecordSampleSet)) {
            return false;
        }
        ActivityRecordSampleSet activityRecordSampleSet = (ActivityRecordSampleSet) obj;
        return Objects.equal(this.mActivityRecord, activityRecordSampleSet.mActivityRecord) && Objects.equal(this.mSampleSet, activityRecordSampleSet.mSampleSet);
    }

    public ActivityRecordSampleSet(ActivityRecord activityRecord, SampleSet sampleSet) {
        this.mActivityRecord = activityRecord;
        this.mSampleSet = sampleSet;
    }

    class aab implements Parcelable.Creator<ActivityRecordSampleSet> {
        @Override // android.os.Parcelable.Creator
        public ActivityRecordSampleSet createFromParcel(Parcel parcel) {
            return new ActivityRecordSampleSet(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ActivityRecordSampleSet[] newArray(int i) {
            return new ActivityRecordSampleSet[i];
        }

        aab() {
        }
    }

    protected ActivityRecordSampleSet(Parcel parcel) {
        int i;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        SampleSet sampleSet = null;
        int i2 = 0;
        ActivityRecord activityRecord = null;
        while (true) {
            i = i2 + 1;
            if (i2 > iValidateObjectHeader || parcel.dataPosition() >= iValidateObjectHeader) {
                break;
            }
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                activityRecord = (ActivityRecord) SafeParcelReader.createParcelable(parcel, header, ActivityRecord.CREATOR);
            } else if (fieldId != 2) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                sampleSet = (SampleSet) SafeParcelReader.createParcelable(parcel, header, SampleSet.CREATOR);
            }
            i2 = i;
        }
        if (i > iValidateObjectHeader) {
            aabz.aab(TAG, "Max loop reached, ActivityRecordSampleSet parcel failed");
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        this.mActivityRecord = activityRecord;
        this.mSampleSet = sampleSet;
    }
}
