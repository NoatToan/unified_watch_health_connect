package com.xiaomi.hm.health.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.hm.health.manager.UnitManager;

/* JADX INFO: loaded from: classes21.dex */
public class ShareStep implements Parcelable {
    public static final Parcelable.Creator<ShareStep> CREATOR = new a();
    public String a;
    public String b;
    public String c;
    public String cal;
    public String d;
    public String date;
    public String distance;
    public String distanceUnit;
    public int step;
    public long time;

    public class a implements Parcelable.Creator<ShareStep> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareStep createFromParcel(Parcel source) {
            return new ShareStep(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareStep[] newArray(int size) {
            return new ShareStep[size];
        }
    }

    public ShareStep() {
        this.step = 0;
        this.a = "0";
        this.b = "0";
        this.distance = "0";
        this.distanceUnit = UnitManager.getInstance().getUnit(0);
        this.cal = "0";
        this.time = 0L;
        this.c = "";
        this.d = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "===========\n achieve : " + this.c + "\n    step : " + this.step + "\nduration : " + this.a + ":" + this.b + "\ndistance : " + this.distance + "\n     cal : " + this.cal + "\n    date : " + this.date + "\n";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.step);
        dest.writeString(this.a);
        dest.writeString(this.b);
        dest.writeString(this.distance);
        dest.writeString(this.distanceUnit);
        dest.writeString(this.cal);
        dest.writeString(this.c);
        dest.writeString(this.date);
        dest.writeLong(this.time);
        dest.writeString(this.d);
    }

    private ShareStep(Parcel in) {
        this.step = in.readInt();
        this.a = in.readString();
        this.b = in.readString();
        this.distance = in.readString();
        this.distanceUnit = in.readString();
        this.cal = in.readString();
        this.c = in.readString();
        this.date = in.readString();
        this.time = in.readLong();
        this.d = in.readString();
    }
}
