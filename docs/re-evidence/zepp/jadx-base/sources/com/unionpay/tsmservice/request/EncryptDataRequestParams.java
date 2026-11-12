package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class EncryptDataRequestParams extends RequestParams {
    public static final Parcelable.Creator<EncryptDataRequestParams> CREATOR = new a();
    private List<String> b;

    public static class a implements Parcelable.Creator<EncryptDataRequestParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EncryptDataRequestParams createFromParcel(Parcel parcel) {
            return new EncryptDataRequestParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EncryptDataRequestParams[] newArray(int i) {
            return new EncryptDataRequestParams[i];
        }
    }

    public EncryptDataRequestParams() {
    }

    public List<String> getData() {
        return this.b;
    }

    public void setData(List<String> list) {
        this.b = list;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeList(this.b);
    }

    public EncryptDataRequestParams(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        parcel.readList(arrayList, ClassLoader.getSystemClassLoader());
    }
}
