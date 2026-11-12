package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class UniteCardActiveResult implements Parcelable {
    public static final Parcelable.Creator<UniteCardActiveResult> CREATOR = new a();
    private String a;

    public static class a implements Parcelable.Creator<UniteCardActiveResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UniteCardActiveResult createFromParcel(Parcel parcel) {
            return new UniteCardActiveResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UniteCardActiveResult[] newArray(int i) {
            return new UniteCardActiveResult[i];
        }
    }

    public UniteCardActiveResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getActiveResult() {
        return this.a;
    }

    public void setActiveResult(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public UniteCardActiveResult(Parcel parcel) {
        this.a = parcel.readString();
    }
}
