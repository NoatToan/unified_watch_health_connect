package com.huawei.hms.support.api.entity.hwid;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes34.dex */
public class LabelInfo implements Parcelable {
    public static final Parcelable.Creator<LabelInfo> CREATOR = new Parcelable.Creator<LabelInfo>() { // from class: com.huawei.hms.support.api.entity.hwid.LabelInfo.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LabelInfo createFromParcel(Parcel parcel) {
            return new LabelInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LabelInfo[] newArray(int i) {
            return new LabelInfo[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f16512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f16513b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LabelInfo() {
        this.f16512a = -1;
        this.f16513b = "";
    }

    protected LabelInfo(Parcel parcel) {
        this.f16512a = parcel.readInt();
        this.f16513b = parcel.readString();
    }

    public int getLabelType() {
        return this.f16512a;
    }

    public void setLabelType(int i) {
        this.f16512a = i;
    }

    public String getLabelName() {
        return this.f16513b;
    }

    public void setLabelName(String str) {
        this.f16513b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f16512a);
        parcel.writeString(this.f16513b);
    }

    public boolean isEquals(LabelInfo labelInfo) {
        return labelInfo != null && getLabelType() == labelInfo.getLabelType() && getLabelName().equals(labelInfo.getLabelName());
    }
}
