package cn.eid.service;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class RespParams implements Parcelable {
    public static final Parcelable.Creator<RespParams> CREATOR = new Parcelable.Creator<RespParams>() { // from class: cn.eid.service.RespParams.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RespParams createFromParcel(Parcel parcel) {
            return new RespParams(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RespParams[] newArray(int i) {
            return new RespParams[i];
        }
    };
    private long resultCode;
    private String resultDetail;

    public RespParams() {
        this.resultCode = 1L;
        this.resultDetail = "resultDetail";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getResultCode() {
        return this.resultCode;
    }

    public String getResultDetail() {
        return this.resultDetail;
    }

    public void setResultCode(long j) {
        this.resultCode = j;
    }

    public void setResultDetail(String str) {
        this.resultDetail = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.resultCode);
        parcel.writeString(this.resultDetail);
    }

    public RespParams(long j, String str) {
        this.resultCode = 1L;
        this.resultDetail = "resultDetail";
        this.resultCode = j;
        this.resultDetail = str;
    }

    public RespParams(Parcel parcel) {
        this.resultCode = 1L;
        this.resultDetail = "resultDetail";
        this.resultCode = parcel.readLong();
        this.resultDetail = parcel.readString();
    }
}
