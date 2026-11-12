package com.ingenic.iwds.datatransactor.elf;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class PhoneState implements Parcelable {
    public static final Parcelable.Creator<PhoneState> CREATOR = new Parcelable.Creator<PhoneState>() { // from class: com.ingenic.iwds.datatransactor.elf.PhoneState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PhoneState createFromParcel(Parcel parcel) {
            PhoneState phoneState = new PhoneState();
            phoneState.state = parcel.readInt();
            phoneState.number = parcel.readString();
            phoneState.name = parcel.readString();
            return phoneState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PhoneState[] newArray(int i) {
            return new PhoneState[i];
        }
    };
    public static final int STATE_IDLE = 0;
    public static final int STATE_INCOMING = 1;
    public static final int STATE_OFFHOOK = 2;
    public static final int STATE_SEND_SMS = 21;
    public static final int STATE_SEND_SMS_LIST = -1;
    public static final int STATE_SYNC_PHONE_DISABLED = -2;
    public String name;
    public String number;
    public int state;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PhoneStete:state:" + this.state + ",number:" + this.number + ",name:" + this.name;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.state);
        parcel.writeString(this.number);
        parcel.writeString(this.name);
    }
}
