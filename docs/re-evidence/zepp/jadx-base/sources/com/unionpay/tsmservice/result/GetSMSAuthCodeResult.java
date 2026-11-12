package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.data.SMSAuthCode;

/* JADX INFO: loaded from: classes18.dex */
public class GetSMSAuthCodeResult implements Parcelable {
    public static final Parcelable.Creator<GetSMSAuthCodeResult> CREATOR = new a();
    private SMSAuthCode a;

    public static class a implements Parcelable.Creator<GetSMSAuthCodeResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetSMSAuthCodeResult createFromParcel(Parcel parcel) {
            return new GetSMSAuthCodeResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetSMSAuthCodeResult[] newArray(int i) {
            return new GetSMSAuthCodeResult[i];
        }
    }

    public GetSMSAuthCodeResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SMSAuthCode getSmsAuthCode() {
        return this.a;
    }

    public void setSmsAuthCode(SMSAuthCode sMSAuthCode) {
        this.a = sMSAuthCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public GetSMSAuthCodeResult(Parcel parcel) {
        this.a = (SMSAuthCode) parcel.readParcelable(SMSAuthCode.class.getClassLoader());
    }
}
