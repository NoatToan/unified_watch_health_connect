package com.unionpay.tsmservice.result;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.TransElement;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
public class GetTransElementsResult implements Parcelable {
    public static final Parcelable.Creator<GetTransElementsResult> CREATOR = new a();
    private TransElement[] a;
    private TransElement[] b;

    public static class a implements Parcelable.Creator<GetTransElementsResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetTransElementsResult createFromParcel(Parcel parcel) {
            return new GetTransElementsResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetTransElementsResult[] newArray(int i) {
            return new GetTransElementsResult[i];
        }
    }

    public GetTransElementsResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TransElement[] getCreditElements() {
        return this.b;
    }

    public TransElement[] getDebitElements() {
        return this.a;
    }

    public void setCreditElements(TransElement[] transElementArr) {
        this.b = transElementArr;
    }

    public void setDebitElements(TransElement[] transElementArr) {
        this.a = transElementArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.a, i);
        parcel.writeParcelableArray(this.b, i);
    }

    @SuppressLint({"NewApi"})
    public GetTransElementsResult(Parcel parcel) {
        Parcelable[] parcelableArray = parcel.readParcelableArray(TransElement.class.getClassLoader());
        if (parcelableArray != null) {
            this.a = (TransElement[]) Arrays.copyOf(parcelableArray, parcelableArray.length, TransElement[].class);
        }
        Parcelable[] parcelableArray2 = parcel.readParcelableArray(TransElement.class.getClassLoader());
        if (parcelableArray2 != null) {
            this.b = (TransElement[]) Arrays.copyOf(parcelableArray2, parcelableArray2.length, TransElement[].class);
        }
    }
}
