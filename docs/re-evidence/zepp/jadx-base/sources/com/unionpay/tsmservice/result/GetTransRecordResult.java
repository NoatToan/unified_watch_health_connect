package com.unionpay.tsmservice.result;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.TransRecord;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
public class GetTransRecordResult implements Parcelable {
    public static final Parcelable.Creator<GetTransRecordResult> CREATOR = new a();
    private TransRecord[] a;

    public static class a implements Parcelable.Creator<GetTransRecordResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetTransRecordResult createFromParcel(Parcel parcel) {
            return new GetTransRecordResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetTransRecordResult[] newArray(int i) {
            return new GetTransRecordResult[i];
        }
    }

    public GetTransRecordResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TransRecord[] getTransRecord() {
        return this.a;
    }

    public void setTransRecord(TransRecord[] transRecordArr) {
        this.a = transRecordArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.a, i);
    }

    @SuppressLint({"NewApi"})
    public GetTransRecordResult(Parcel parcel) {
        Parcelable[] parcelableArray = parcel.readParcelableArray(TransRecord.class.getClassLoader());
        if (parcelableArray != null) {
            this.a = (TransRecord[]) Arrays.copyOf(parcelableArray, parcelableArray.length, TransRecord[].class);
        }
    }
}
