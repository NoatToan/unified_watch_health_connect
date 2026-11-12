package com.xiaomi.fitness.devicesettings.base.clock.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class AlarmIntervalBean implements Parcelable {
    public static final Parcelable.Creator<AlarmIntervalBean> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11951b;
    public long c;
    public boolean d;

    public class a implements Parcelable.Creator<AlarmIntervalBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AlarmIntervalBean createFromParcel(Parcel parcel) {
            return new AlarmIntervalBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AlarmIntervalBean[] newArray(int i) {
            return new AlarmIntervalBean[i];
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AlarmIntervalBean clone() {
        AlarmIntervalBean alarmIntervalBean = new AlarmIntervalBean();
        alarmIntervalBean.d = this.d;
        alarmIntervalBean.f11950a = this.f11950a;
        alarmIntervalBean.f11951b = this.f11951b;
        alarmIntervalBean.c = this.c;
        return alarmIntervalBean;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11950a);
        parcel.writeString(this.f11951b);
        parcel.writeLong(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
    }

    public AlarmIntervalBean() {
    }

    public AlarmIntervalBean(Parcel parcel) {
        this.f11950a = parcel.readInt();
        this.f11951b = parcel.readString();
        this.c = parcel.readLong();
        this.d = parcel.readByte() == 1;
    }
}
