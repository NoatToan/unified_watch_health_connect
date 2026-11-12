package com.xiaomi.smarthome.core.entity.account;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public enum AccountType implements Parcelable {
    MI,
    WX,
    OAUTH;

    public static final Parcelable.Creator<AccountType> CREATOR = new Parcelable.Creator<AccountType>() { // from class: com.xiaomi.smarthome.core.entity.account.AccountType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AccountType createFromParcel(Parcel parcel) {
            return AccountType.values()[parcel.readInt()];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AccountType[] newArray(int i) {
            return new AccountType[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
