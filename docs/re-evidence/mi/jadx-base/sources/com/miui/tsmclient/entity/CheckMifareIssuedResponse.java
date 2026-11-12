package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes6.dex */
public class CheckMifareIssuedResponse implements Parcelable {
    public static final Parcelable.Creator<CheckMifareIssuedResponse> CREATOR = new Parcelable.Creator<CheckMifareIssuedResponse>() { // from class: com.miui.tsmclient.entity.CheckMifareIssuedResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CheckMifareIssuedResponse createFromParcel(Parcel parcel) {
            return new CheckMifareIssuedResponse(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CheckMifareIssuedResponse[] newArray(int i) {
            return new CheckMifareIssuedResponse[i];
        }
    };

    @SerializedName(TSMAuthContants.PARAM_EXIST)
    private boolean isExist;

    @SerializedName("existCloudCard")
    private boolean isExistCloudCard;

    @SerializedName("cloudCardCid")
    private String mCloudCardCid;

    @SerializedName("decryptSectorCount")
    private int mDecryptSectorCount;

    public CheckMifareIssuedResponse() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCloudCardCid() {
        return this.mCloudCardCid;
    }

    public int getDecryptSectorCount() {
        return this.mDecryptSectorCount;
    }

    public boolean isExist() {
        return this.isExist;
    }

    public boolean isExistCloudCard() {
        return this.isExistCloudCard;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isExist ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isExistCloudCard ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mCloudCardCid);
        parcel.writeInt(this.mDecryptSectorCount);
    }

    public CheckMifareIssuedResponse(Parcel parcel) {
        this.isExist = parcel.readByte() == 1;
        this.isExistCloudCard = parcel.readByte() == 1;
        this.mCloudCardCid = parcel.readString();
        this.mDecryptSectorCount = parcel.readInt();
    }
}
