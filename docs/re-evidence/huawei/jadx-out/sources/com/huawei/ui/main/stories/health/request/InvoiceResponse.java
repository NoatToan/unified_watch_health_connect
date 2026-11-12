package com.huawei.ui.main.stories.health.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes19.dex */
public class InvoiceResponse implements Parcelable {
    public static final Parcelable.Creator<InvoiceResponse> CREATOR = new Parcelable.Creator<InvoiceResponse>() { // from class: com.huawei.ui.main.stories.health.request.InvoiceResponse.2
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InvoiceResponse createFromParcel(Parcel parcel) {
            return new InvoiceResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public InvoiceResponse[] newArray(int i) {
            return new InvoiceResponse[i];
        }
    };
    private int resultCode;
    private String resultDesc;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public InvoiceResponse(Parcel parcel) {
        this.resultCode = parcel.readInt();
        this.resultDesc = parcel.readString();
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public String getResultDesc() {
        return this.resultDesc;
    }

    public void setResultDesc(String str) {
        this.resultDesc = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.resultCode);
        parcel.writeString(this.resultDesc);
    }
}
