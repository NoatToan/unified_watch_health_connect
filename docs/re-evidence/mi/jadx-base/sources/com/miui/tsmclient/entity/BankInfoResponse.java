package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class BankInfoResponse implements Parcelable {
    public static final Parcelable.Creator<BankInfoResponse> CREATOR = new Parcelable.Creator<BankInfoResponse>() { // from class: com.miui.tsmclient.entity.BankInfoResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BankInfoResponse createFromParcel(Parcel parcel) {
            return new BankInfoResponse(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BankInfoResponse[] newArray(int i) {
            return new BankInfoResponse[i];
        }
    };
    private boolean isSupportProtocol;
    private List<BankInfo> mBankInfoList;

    public BankInfoResponse() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<BankInfo> getBankInfoList() {
        return this.mBankInfoList;
    }

    public boolean isSupportProtocol() {
        return this.isSupportProtocol;
    }

    public void setBankInfoList(List<BankInfo> list) {
        this.mBankInfoList = list;
    }

    public void setSupportProtocol(boolean z) {
        this.isSupportProtocol = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.mBankInfoList);
        parcel.writeByte(this.isSupportProtocol ? (byte) 1 : (byte) 0);
    }

    public BankInfoResponse(Parcel parcel) {
        this.mBankInfoList = parcel.createTypedArrayList(BankInfo.CREATOR);
        this.isSupportProtocol = parcel.readByte() != 0;
    }
}
