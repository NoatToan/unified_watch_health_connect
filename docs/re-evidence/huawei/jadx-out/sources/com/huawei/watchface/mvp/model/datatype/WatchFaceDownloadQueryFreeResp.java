package com.huawei.watchface.mvp.model.datatype;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes45.dex */
public class WatchFaceDownloadQueryFreeResp implements Parcelable {
    public static final Parcelable.Creator<WatchFaceDownloadQueryFreeResp> CREATOR = new Parcelable.Creator<WatchFaceDownloadQueryFreeResp>() { // from class: com.huawei.watchface.mvp.model.datatype.WatchFaceDownloadQueryFreeResp.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WatchFaceDownloadQueryFreeResp createFromParcel(Parcel parcel) {
            return new WatchFaceDownloadQueryFreeResp(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WatchFaceDownloadQueryFreeResp[] newArray(int i) {
            return new WatchFaceDownloadQueryFreeResp[i];
        }
    };
    private String cipherVersion;
    private String downUrl;
    private String hashCode;
    private String licenseResp;
    private Integer resultcode;
    private String resultinfo;

    public WatchFaceDownloadQueryFreeResp(Parcel parcel) {
        if (parcel.readByte() == 0) {
            this.resultcode = null;
        } else {
            this.resultcode = Integer.valueOf(parcel.readInt());
        }
        this.resultinfo = parcel.readString();
        this.downUrl = parcel.readString();
        this.licenseResp = parcel.readString();
        this.cipherVersion = parcel.readString();
        this.hashCode = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCipherVersion() {
        return this.cipherVersion;
    }

    public String getDownUrl() {
        return this.downUrl;
    }

    public String getHashCode() {
        return this.hashCode;
    }

    public String getLicenseResp() {
        return this.licenseResp;
    }

    public Integer getResultcode() {
        return this.resultcode;
    }

    public String getResultinfo() {
        return this.resultinfo;
    }

    public void setCipherVersion(String str) {
        this.cipherVersion = str;
    }

    public void setDownUrl(String str) {
        this.downUrl = str;
    }

    public void setHashCode(String str) {
        this.hashCode = str;
    }

    public void setLicenseResp(String str) {
        this.licenseResp = str;
    }

    public void setResultcode(Integer num) {
        this.resultcode = num;
    }

    public void setResultinfo(String str) {
        this.resultinfo = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.resultcode == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.resultcode.intValue());
        }
        parcel.writeString(this.resultinfo);
        parcel.writeString(this.downUrl);
        parcel.writeString(this.licenseResp);
        parcel.writeString(this.cipherVersion);
        parcel.writeString(this.hashCode);
    }
}
