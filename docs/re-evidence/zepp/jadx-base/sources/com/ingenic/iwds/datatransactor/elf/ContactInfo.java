package com.ingenic.iwds.datatransactor.elf;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.sdk.m.u.i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class ContactInfo implements Parcelable {
    public static final Parcelable.Creator<ContactInfo> CREATOR = new Parcelable.Creator<ContactInfo>() { // from class: com.ingenic.iwds.datatransactor.elf.ContactInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContactInfo createFromParcel(Parcel parcel) {
            ContactInfo contactInfo = new ContactInfo();
            contactInfo.operation = parcel.readInt();
            contactInfo.raw_id = parcel.readString();
            contactInfo.name = parcel.readString();
            contactInfo.phoneList = parcel.readArrayList(PhoneInfo.class.getClassLoader());
            contactInfo.email = parcel.readArrayList(EmailInfo.class.getClassLoader());
            return contactInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContactInfo[] newArray(int i) {
            return new ContactInfo[i];
        }
    };
    public static final int OPT_ADD = 0;
    public static final int OPT_DEL = 2;
    public static final int OPT_UPDATE = 1;
    public List<EmailInfo> email;
    public String name;
    public int operation;
    public List<PhoneInfo> phoneList;
    public String raw_id;

    public static class EmailInfo implements Parcelable {
        public static final Parcelable.Creator<EmailInfo> CREATOR = new Parcelable.Creator<EmailInfo>() { // from class: com.ingenic.iwds.datatransactor.elf.ContactInfo.EmailInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public EmailInfo createFromParcel(Parcel parcel) {
                EmailInfo emailInfo = new EmailInfo();
                emailInfo.type = parcel.readInt();
                emailInfo.email = parcel.readString();
                return emailInfo;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public EmailInfo[] newArray(int i) {
                return new EmailInfo[i];
            }
        };
        public String email;
        public int type;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.type);
            parcel.writeString(this.email);
        }
    }

    public static class PhoneInfo implements Parcelable {
        public static final Parcelable.Creator<PhoneInfo> CREATOR = new Parcelable.Creator<PhoneInfo>() { // from class: com.ingenic.iwds.datatransactor.elf.ContactInfo.PhoneInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public PhoneInfo createFromParcel(Parcel parcel) {
                PhoneInfo phoneInfo = new PhoneInfo();
                phoneInfo.type = parcel.readInt();
                phoneInfo.number = parcel.readString();
                return phoneInfo;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public PhoneInfo[] newArray(int i) {
                return new PhoneInfo[i];
            }
        };
        public String number;
        public int type;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.type);
            parcel.writeString(this.number);
        }
    }

    public ContactInfo() {
        this.phoneList = new ArrayList();
        this.email = new ArrayList();
        this.operation = -1;
        this.raw_id = "";
        this.name = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<EmailInfo> getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public List<PhoneInfo> getPhoneList() {
        return this.phoneList;
    }

    public String getRaw_id() {
        return this.raw_id;
    }

    public int getState() {
        return this.operation;
    }

    public void setEmail(List<EmailInfo> list) {
        this.email = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPhoneList(List<PhoneInfo> list) {
        this.phoneList = list;
    }

    public void setState(int i) {
        this.operation = i;
    }

    public String toString() {
        return "{operation: " + this.operation + " raw_id: " + this.raw_id + " name: " + this.name + ", phoneList: " + this.phoneList + ", email: " + this.email + i.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.operation);
        parcel.writeString(this.raw_id);
        parcel.writeString(this.name);
        parcel.writeList(this.phoneList);
        parcel.writeList(this.email);
    }

    public ContactInfo(String str, String str2) {
        this.phoneList = new ArrayList();
        this.email = new ArrayList();
        this.operation = -1;
        this.raw_id = str;
        this.name = str2;
    }
}
