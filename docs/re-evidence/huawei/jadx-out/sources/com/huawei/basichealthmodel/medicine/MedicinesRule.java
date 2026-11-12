package com.huawei.basichealthmodel.medicine;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes23.dex */
public class MedicinesRule implements Parcelable {
    public static final Parcelable.Creator<MedicinesRule> CREATOR = new Parcelable.Creator<MedicinesRule>() { // from class: com.huawei.basichealthmodel.medicine.MedicinesRule.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MedicinesRule createFromParcel(Parcel parcel) {
            return new MedicinesRule(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public MedicinesRule[] newArray(int i) {
            return new MedicinesRule[i];
        }
    };
    private static final String R_TAG = "R_HL_MedicinesRule";
    private static final String TAG = "MedicinesRule";

    @SerializedName("endTime")
    private long mEndTime;

    @SerializedName("medicationMark")
    private String mMedicationMark;

    @SerializedName("medicationName")
    private String mMedicationName;

    @SerializedName("medicationRuleDrug")
    private int mMedicationRuleDrug;

    @SerializedName("medicinePeriod")
    private int mMedicinePeriod;

    @SerializedName("medicineTime")
    private int mMedicineTime;

    @SerializedName("ruleId")
    private int mRuleId;

    @SerializedName("ruleType")
    private int mRuleType;

    @SerializedName("source")
    private int mSource;

    @SerializedName("startTime")
    private long mStartTime;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MedicinesRule() {
    }

    public MedicinesRule(Parcel parcel) {
        if (parcel == null) {
            return;
        }
        this.mRuleId = parcel.readInt();
        this.mStartTime = parcel.readLong();
        this.mEndTime = parcel.readLong();
        this.mRuleType = parcel.readInt();
        this.mMedicineTime = parcel.readInt();
        this.mSource = parcel.readInt();
        this.mMedicationName = parcel.readString();
        this.mMedicationMark = parcel.readString();
        this.mMedicationRuleDrug = parcel.readInt();
        this.mMedicinePeriod = parcel.readInt();
    }

    public int getRuleId() {
        return this.mRuleId;
    }

    public void setRuleId(int i) {
        this.mRuleId = i;
    }

    public long getStartTime() {
        return this.mStartTime;
    }

    public void setStartTime(long j) {
        this.mStartTime = j;
    }

    public long getEndTime() {
        return this.mEndTime;
    }

    public void setEndTime(long j) {
        this.mEndTime = j;
    }

    public int getRuleType() {
        return this.mRuleType;
    }

    public void setRuleType(int i) {
        this.mRuleType = i;
    }

    public int getMedicineTime() {
        return this.mMedicineTime;
    }

    public void setMedicineTime(int i) {
        this.mMedicineTime = i;
    }

    public int getSource() {
        return this.mSource;
    }

    public void setSource(int i) {
        this.mSource = i;
    }

    public String getName() {
        return this.mMedicationName;
    }

    public void setName(String str) {
        this.mMedicationName = str;
    }

    public String getMark() {
        return this.mMedicationMark;
    }

    public void setMark(String str) {
        this.mMedicationMark = str;
    }

    public int getDrug() {
        return this.mMedicationRuleDrug;
    }

    public void setDrug(int i) {
        this.mMedicationRuleDrug = i;
    }

    public int getMedicinePeriod() {
        int i = this.mMedicinePeriod;
        if (i > 0) {
            return i;
        }
        ReleaseLogUtil.d(R_TAG, "getMedicinePeriod mMedicinePeriod ", Integer.valueOf(i));
        return 127;
    }

    public void setMedicinePeriod(int i) {
        if (i <= 0) {
            ReleaseLogUtil.d(R_TAG, "setMedicinePeriod medicinePeriod ", Integer.valueOf(i));
        } else {
            this.mMedicinePeriod = i;
        }
    }

    public String toString() {
        return "MedicinesRule{mRuleId=" + this.mRuleId + ", mStartTime=" + this.mStartTime + ", mEndTime=" + this.mEndTime + ", mRuleType=" + this.mRuleType + ", mMedicineTime=" + this.mMedicineTime + ", mSource=" + this.mSource + ", mMedicationName=" + this.mMedicationName + ", mMedicationMark=" + this.mMedicationMark + ", mMedicationRuleDrug=" + this.mMedicationRuleDrug + ", mMedicinePeriod=" + this.mMedicinePeriod + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            return;
        }
        parcel.writeInt(this.mRuleId);
        parcel.writeLong(this.mStartTime);
        parcel.writeLong(this.mEndTime);
        parcel.writeInt(this.mRuleType);
        parcel.writeInt(this.mMedicineTime);
        parcel.writeInt(this.mSource);
        parcel.writeString(this.mMedicationName);
        parcel.writeString(this.mMedicationMark);
        parcel.writeInt(this.mMedicationRuleDrug);
        parcel.writeInt(this.mMedicinePeriod);
    }
}
