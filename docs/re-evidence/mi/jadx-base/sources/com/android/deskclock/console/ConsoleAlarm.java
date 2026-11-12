package com.android.deskclock.console;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class ConsoleAlarm implements Parcelable {
    public static final Parcelable.Creator<ConsoleAlarm> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6821b;
    public String c;

    public static class a implements Parcelable.Creator<ConsoleAlarm> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConsoleAlarm createFromParcel(Parcel parcel) {
            return new ConsoleAlarm(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ConsoleAlarm[] newArray(int i) {
            return new ConsoleAlarm[i];
        }
    }

    public ConsoleAlarm() {
    }

    public long a() {
        return this.f6821b;
    }

    public int c() {
        return this.f6820a;
    }

    public String d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(int i) {
        this.f6820a = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6820a);
        parcel.writeLong(this.f6821b);
        parcel.writeString(this.c);
    }

    public ConsoleAlarm(Parcel parcel) {
        this.f6820a = parcel.readInt();
        this.f6821b = parcel.readLong();
        this.c = parcel.readString();
    }
}
