package com.ingenic.iwds.datatransactor.elf;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class CalllogInfo implements Parcelable {
    public static final Parcelable.Creator<CalllogInfo> CREATOR = new Parcelable.Creator<CalllogInfo>() { // from class: com.ingenic.iwds.datatransactor.elf.CalllogInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CalllogInfo createFromParcel(Parcel parcel) {
            CalllogInfo calllogInfo = new CalllogInfo();
            calllogInfo._id = parcel.readInt();
            calllogInfo.number = parcel.readString();
            calllogInfo.date = parcel.readLong();
            calllogInfo.duration = parcel.readInt();
            calllogInfo.type = parcel.readInt();
            calllogInfo.news = parcel.readInt();
            calllogInfo.name = parcel.readString();
            calllogInfo.is_read = parcel.readInt();
            return calllogInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CalllogInfo[] newArray(int i) {
            return new CalllogInfo[i];
        }
    };
    private int _id;
    private long date;
    private int duration;
    private int is_read;
    private String name;
    private int news;
    private String number;
    private int type;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getDate() {
        return this.date;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getIs_read() {
        return this.is_read;
    }

    public String getName() {
        return this.name;
    }

    public int getNewflag() {
        return this.news;
    }

    public String getNumber() {
        return this.number;
    }

    public int getType() {
        return this.type;
    }

    public int get_id() {
        return this._id;
    }

    public void setDate(long j) {
        this.date = j;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setIs_read(int i) {
        this.is_read = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNewflag(int i) {
        this.news = i;
    }

    public void setNumber(String str) {
        this.number = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void set_id(int i) {
        this._id = i;
    }

    public String toString() {
        return "Calllog info _id:" + this._id + ",number:" + this.number + ",date:" + this.date + ",duration:" + this.duration + ",type:" + this.type + ",new:" + this.news + ",name:" + this.name + ",is_read:" + this.is_read;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this._id);
        parcel.writeString(this.number);
        parcel.writeLong(this.date);
        parcel.writeInt(this.duration);
        parcel.writeInt(this.type);
        parcel.writeInt(this.news);
        parcel.writeString(this.name);
        parcel.writeInt(this.is_read);
    }
}
