package com.huawei.watchface.mvp.model.datatype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes20.dex */
public class MaterialFileUploadURLInfo implements Parcelable {
    public static final Parcelable.Creator<MaterialFileUploadURLInfo> CREATOR = new Parcelable.Creator<MaterialFileUploadURLInfo>() { // from class: com.huawei.watchface.mvp.model.datatype.MaterialFileUploadURLInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MaterialFileUploadURLInfo createFromParcel(Parcel parcel) {
            return new MaterialFileUploadURLInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MaterialFileUploadURLInfo[] newArray(int i) {
            return new MaterialFileUploadURLInfo[i];
        }
    };
    private WiseContentHeaders headers;
    private String method;
    private String url;

    public MaterialFileUploadURLInfo(Parcel parcel) {
        this.url = parcel.readString();
        this.method = parcel.readString();
        this.headers = (WiseContentHeaders) new Gson().fromJson(parcel.readString(), WiseContentHeaders.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public WiseContentHeaders getHeaders() {
        return this.headers;
    }

    public String getMethod() {
        return this.method;
    }

    public String getUrl() {
        return this.url;
    }

    public void setHeaders(WiseContentHeaders wiseContentHeaders) {
        this.headers = wiseContentHeaders;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeString(this.method);
        parcel.writeParcelable(this.headers, i);
    }
}
