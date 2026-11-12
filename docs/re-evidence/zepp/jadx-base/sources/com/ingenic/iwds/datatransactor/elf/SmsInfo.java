package com.ingenic.iwds.datatransactor.elf;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class SmsInfo implements Parcelable {
    public static final Parcelable.Creator<SmsInfo> CREATOR = new Parcelable.Creator<SmsInfo>() { // from class: com.ingenic.iwds.datatransactor.elf.SmsInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SmsInfo createFromParcel(Parcel parcel) {
            SmsInfo smsInfo = new SmsInfo();
            smsInfo.id = parcel.readInt();
            smsInfo.thread_id = parcel.readInt();
            smsInfo.address = parcel.readString();
            smsInfo.person = parcel.readString();
            smsInfo.body = parcel.readString();
            smsInfo.date = parcel.readLong();
            smsInfo.read = parcel.readInt();
            smsInfo.protocol = parcel.readInt();
            smsInfo.type = parcel.readInt();
            return smsInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SmsInfo[] newArray(int i) {
            return new SmsInfo[i];
        }
    };
    private String address;
    private String body;
    private long date;
    private int id;
    private String person;
    private int protocol;
    private int read;
    private int thread_id;
    private int type;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAddress() {
        return this.address;
    }

    public String getBody() {
        return this.body;
    }

    public long getDate() {
        return this.date;
    }

    public int getId() {
        return this.id;
    }

    public String getPerson() {
        return this.person;
    }

    public int getProtocol() {
        return this.protocol;
    }

    public int getRead() {
        return this.read;
    }

    public int getThreadId() {
        return this.thread_id;
    }

    public int getType() {
        return this.type;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setDate(long j) {
        this.date = j;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setPerson(String str) {
        this.person = str;
    }

    public void setProtocol(int i) {
        this.protocol = i;
    }

    public void setRead(int i) {
        this.read = i;
    }

    public void setThreadId(int i) {
        this.thread_id = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "Sms:id:" + this.id + ",thread_id:" + this.thread_id + ",address:" + this.address + ",person:" + this.person + ",body:" + this.body + ",date:" + this.date + ",read:" + this.read + ",protocol:" + this.protocol + ",type:" + this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.thread_id);
        parcel.writeString(this.address);
        parcel.writeString(this.person);
        parcel.writeString(this.body);
        parcel.writeLong(this.date);
        parcel.writeInt(this.read);
        parcel.writeInt(this.protocol);
        parcel.writeInt(this.type);
    }
}
