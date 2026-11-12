package com.huawei.android.location.activityrecognition;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class HwActivityRecognitionExtendEvent implements Parcelable {
    public static final Parcelable.Creator<HwActivityRecognitionExtendEvent> CREATOR = new Parcelable.Creator<HwActivityRecognitionExtendEvent>() { // from class: com.huawei.android.location.activityrecognition.HwActivityRecognitionExtendEvent.3
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public HwActivityRecognitionExtendEvent createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i = parcel.readInt();
            long j = parcel.readLong();
            OtherParameters otherParameters = (OtherParameters) parcel.readParcelable(OtherParameters.class.getClassLoader());
            if (HwActivityRecognition.e() == 1) {
                return new HwActivityRecognitionExtendEvent(string, i, j, otherParameters, parcel.readInt());
            }
            return new HwActivityRecognitionExtendEvent(string, i, j, otherParameters);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public HwActivityRecognitionExtendEvent[] newArray(int i) {
            return new HwActivityRecognitionExtendEvent[i];
        }
    };
    private final String mActivity;
    private int mConfidence;
    private final int mEventType;
    private final OtherParameters mOtherParams;
    private final long mTimestampNs;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public HwActivityRecognitionExtendEvent(String str, int i, long j, OtherParameters otherParameters) {
        this.mActivity = str;
        this.mEventType = i;
        this.mTimestampNs = j;
        this.mOtherParams = otherParameters;
        this.mConfidence = -2;
    }

    public HwActivityRecognitionExtendEvent(String str, int i, long j, OtherParameters otherParameters, int i2) {
        this.mActivity = str;
        this.mEventType = i;
        this.mTimestampNs = j;
        this.mOtherParams = otherParameters;
        this.mConfidence = i2;
    }

    public String getActivity() {
        return this.mActivity;
    }

    public int getEventType() {
        return this.mEventType;
    }

    public long getTimestampNs() {
        return this.mTimestampNs;
    }

    public OtherParameters getOtherParams() {
        return this.mOtherParams;
    }

    public int getConfidence() {
        return this.mConfidence;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mActivity);
        parcel.writeInt(this.mEventType);
        parcel.writeLong(this.mTimestampNs);
        parcel.writeParcelable(this.mOtherParams, i);
        if (HwActivityRecognition.e() == 1) {
            parcel.writeInt(this.mConfidence);
        }
    }

    public String toString() {
        OtherParameters otherParameters = this.mOtherParams;
        if (otherParameters != null) {
            String str = this.mActivity;
            int i = this.mEventType;
            long j = this.mTimestampNs;
            double d = otherParameters.getmParam1();
            double d2 = this.mOtherParams.getmParam2();
            double d3 = this.mOtherParams.getmParam3();
            double d4 = this.mOtherParams.getmParam4();
            return String.format("Activity='%s', EventType=%s, TimestampNs=%s, Param1=%s, Param2=%s, Param3=%s, Param4=%s, Param5=%s, Confidence=%s", str, Integer.valueOf(i), Long.valueOf(j), Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), this.mOtherParams.getmParam5(), Integer.valueOf(this.mConfidence));
        }
        return String.format("Activity='%s', EventType=%s, TimestampNs=%s, Confidence=%s", this.mActivity, Integer.valueOf(this.mEventType), Long.valueOf(this.mTimestampNs), Integer.valueOf(this.mConfidence));
    }
}
