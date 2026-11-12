package com.huawei.health.threeCircle.remind.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.peh;

/* JADX INFO: loaded from: classes9.dex */
public class ThreeCircleRemindData implements Parcelable {
    public static final Parcelable.Creator<ThreeCircleRemindData> CREATOR = new Parcelable.Creator<ThreeCircleRemindData>() { // from class: com.huawei.health.threeCircle.remind.model.ThreeCircleRemindData.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ThreeCircleRemindData createFromParcel(Parcel parcel) {
            return new ThreeCircleRemindData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ThreeCircleRemindData[] newArray(int i) {
            return new ThreeCircleRemindData[i];
        }
    };
    private DeviceEventData mDeviceEventData;
    private int mPriority;
    private String mRemindText;
    private String mRemindType;
    private String mSubRemindType;
    private long mTimeMill;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ThreeCircleRemindData(Parcel parcel) {
        this.mRemindType = parcel.readString();
        this.mSubRemindType = parcel.readString();
        this.mPriority = parcel.readInt();
        this.mRemindText = parcel.readString();
        this.mDeviceEventData = (DeviceEventData) parcel.readParcelable(DeviceEventData.class.getClassLoader());
        this.mTimeMill = parcel.readLong();
    }

    private ThreeCircleRemindData(d dVar) {
        this.mRemindType = dVar.e;
        this.mPriority = dVar.f10244c;
        this.mSubRemindType = dVar.f10243b;
        this.mRemindText = dVar.f10242a;
        this.mDeviceEventData = dVar.d;
        this.mTimeMill = dVar.j;
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10244c;
        private DeviceEventData d;
        private String e;
        private long j;

        public ThreeCircleRemindData c() {
            return new ThreeCircleRemindData(this);
        }

        public d a(String str) {
            this.e = str;
            return this;
        }

        public d a(int i) {
            this.f10244c = i;
            return this;
        }

        public d d(String str) {
            this.f10243b = str;
            return this;
        }

        public d e(String str) {
            this.f10242a = str;
            return this;
        }

        public d e(DeviceEventData deviceEventData) {
            this.d = deviceEventData;
            return this;
        }

        public d e(long j) {
            this.j = j;
            return this;
        }
    }

    public int getPriority() {
        return this.mPriority;
    }

    public String getRemindType() {
        return this.mRemindType;
    }

    public String getRemindText() {
        return this.mRemindText;
    }

    public DeviceEventData getDeviceEventData() {
        return this.mDeviceEventData;
    }

    public String getSubRemindType() {
        return this.mSubRemindType;
    }

    public String toString() {
        return peh.c(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mRemindType);
        parcel.writeString(this.mSubRemindType);
        parcel.writeInt(this.mPriority);
        parcel.writeString(this.mRemindText);
        parcel.writeParcelable(this.mDeviceEventData, i);
        parcel.writeLong(this.mTimeMill);
    }
}
