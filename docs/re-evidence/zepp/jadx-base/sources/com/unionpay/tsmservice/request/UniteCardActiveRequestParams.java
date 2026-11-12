package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class UniteCardActiveRequestParams extends RequestParams {
    public static final Parcelable.Creator<UniteCardActiveRequestParams> CREATOR = new a();
    private String b;
    private String c;

    public static class a implements Parcelable.Creator<UniteCardActiveRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UniteCardActiveRequestParams createFromParcel(Parcel parcel) {
            return new UniteCardActiveRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UniteCardActiveRequestParams[] newArray(int i) {
            return new UniteCardActiveRequestParams[i];
        }
    }

    public UniteCardActiveRequestParams() {
    }

    public String getActiveCode() {
        return this.c;
    }

    public String getMPanId() {
        return this.b;
    }

    public void setActiveCode(String str) {
        this.c = str;
    }

    public void setMPanId(String str) {
        this.b = str;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public UniteCardActiveRequestParams(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
