package com.huawei.watchface.mvp.model.datatype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes20.dex */
public class WatchFacePayResultBean implements Parcelable {
    public static final Parcelable.Creator<WatchFacePayResultBean> CREATOR = new Parcelable.Creator<WatchFacePayResultBean>() { // from class: com.huawei.watchface.mvp.model.datatype.WatchFacePayResultBean.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WatchFacePayResultBean createFromParcel(Parcel parcel) {
            return new WatchFacePayResultBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WatchFacePayResultBean[] newArray(int i) {
            return new WatchFacePayResultBean[i];
        }
    };

    @SerializedName("resultcode")
    private String mResultCode;

    @SerializedName("resultinfo")
    private String mResultInfo;

    public WatchFacePayResultBean(Parcel parcel) {
        this.mResultInfo = parcel.readString();
        this.mResultCode = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getResultCode() {
        return this.mResultCode;
    }

    public String getResultInfo() {
        return this.mResultInfo;
    }

    public void setResultCode(String str) {
        this.mResultCode = str;
    }

    public void setResultInfo(String str) {
        this.mResultInfo = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mResultInfo);
        parcel.writeString(this.mResultCode);
    }
}
