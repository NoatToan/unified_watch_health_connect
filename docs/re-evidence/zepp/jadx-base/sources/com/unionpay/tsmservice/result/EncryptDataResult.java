package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class EncryptDataResult implements Parcelable {
    public static final Parcelable.Creator<EncryptDataResult> CREATOR = new a();
    private List<String> a;

    public static class a implements Parcelable.Creator<EncryptDataResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EncryptDataResult createFromParcel(Parcel parcel) {
            return new EncryptDataResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EncryptDataResult[] newArray(int i) {
            return new EncryptDataResult[i];
        }
    }

    public EncryptDataResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<String> getEncryptData() {
        return this.a;
    }

    public void setEncryptData(List<String> list) {
        this.a = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
    }

    public EncryptDataResult(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        parcel.readList(arrayList, ClassLoader.getSystemClassLoader());
    }
}
