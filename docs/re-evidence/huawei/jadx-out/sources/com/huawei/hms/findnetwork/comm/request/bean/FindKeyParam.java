package com.huawei.hms.findnetwork.comm.request.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes33.dex */
public class FindKeyParam implements Parcelable {
    public static final Parcelable.Creator<FindKeyParam> CREATOR = new a();
    private String keyFactor;
    private int period;
    private String publicKey;
    private String workKey;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FindKeyParam createFromParcel(Parcel parcel) {
            return new FindKeyParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FindKeyParam[] newArray(int i) {
            return new FindKeyParam[i];
        }
    }

    public FindKeyParam() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public FindKeyParam(Parcel parcel) {
        this.publicKey = parcel.readString();
        this.workKey = parcel.readString();
        this.period = parcel.readInt();
        this.keyFactor = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.publicKey);
        parcel.writeString(this.workKey);
        parcel.writeInt(this.period);
        parcel.writeString(this.keyFactor);
    }

    public void setWorkKey(String str) {
        this.workKey = str;
    }

    public void setPublicKey(String str) {
        this.publicKey = str;
    }

    public void setPeriod(int i) {
        this.period = i;
    }

    public void setKeyFactor(String str) {
        this.keyFactor = str;
    }

    public String getWorkKey() {
        return this.workKey;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public int getPeriod() {
        return this.period;
    }

    public String getKeyFactor() {
        return this.keyFactor;
    }
}
