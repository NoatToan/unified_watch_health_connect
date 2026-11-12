package com.xiaomi.hm.health.share;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes21.dex */
public class ShareSleep implements Parcelable {
    public static final Parcelable.Creator<ShareSleep> CREATOR = new a();
    public String date;
    public String sleepDeepHour;
    public String sleepDeepMin;
    public String sleepDurationHour;
    public String sleepDurationMin;
    public int sleepScore;
    public String start;
    public String startUnit;
    public String stop;
    public String stopUnit;
    public long time;
    public String valueTitle;

    public class a implements Parcelable.Creator<ShareSleep> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareSleep createFromParcel(Parcel source) {
            return new ShareSleep(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareSleep[] newArray(int size) {
            return new ShareSleep[size];
        }
    }

    public ShareSleep() {
        this.sleepDurationHour = "0";
        this.sleepDurationMin = "0";
        this.start = "00:00";
        this.startUnit = "";
        this.stop = "00:00";
        this.stopUnit = "";
        this.sleepDeepHour = "0";
        this.sleepDeepMin = "0";
        this.date = "";
        this.time = 0L;
        this.valueTitle = "";
        this.sleepScore = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "===========\n睡眠时长 : " + this.sleepDurationHour + ":" + this.sleepDeepMin + "\n入睡时间 : " + this.startUnit + this.start + "\n醒来时间 : " + this.stopUnit + this.stop + "\n深睡时长 : " + this.sleepDeepHour + ":" + this.sleepDeepMin + "\n深睡得分 : " + this.sleepScore + "\n   日期 : " + this.date + "\n";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.sleepDurationHour);
        dest.writeString(this.sleepDurationMin);
        dest.writeString(this.start);
        dest.writeString(this.startUnit);
        dest.writeString(this.stop);
        dest.writeString(this.stopUnit);
        dest.writeString(this.sleepDeepHour);
        dest.writeString(this.sleepDeepMin);
        dest.writeString(this.date);
        dest.writeLong(this.time);
        dest.writeString(this.valueTitle);
        dest.writeInt(this.sleepScore);
    }

    private ShareSleep(Parcel in) {
        this.sleepDurationHour = in.readString();
        this.sleepDurationMin = in.readString();
        this.start = in.readString();
        this.startUnit = in.readString();
        this.stop = in.readString();
        this.stopUnit = in.readString();
        this.sleepDeepHour = in.readString();
        this.sleepDeepMin = in.readString();
        this.date = in.readString();
        this.time = in.readLong();
        this.valueTitle = in.readString();
        this.sleepScore = in.readInt();
    }
}
