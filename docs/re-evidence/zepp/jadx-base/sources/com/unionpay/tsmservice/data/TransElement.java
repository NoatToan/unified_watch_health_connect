package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class TransElement implements Parcelable {
    public static final Parcelable.Creator<TransElement> CREATOR = new a();
    private boolean a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    public static class a implements Parcelable.Creator<TransElement> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TransElement createFromParcel(Parcel parcel) {
            return new TransElement(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TransElement[] newArray(int i) {
            return new TransElement[i];
        }
    }

    public TransElement() {
        this.a = true;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getHint() {
        return this.d;
    }

    public String getLabel() {
        return this.b;
    }

    public String getName() {
        return this.c;
    }

    public String getType() {
        return this.f;
    }

    public String getVerfyRule() {
        return this.e;
    }

    public boolean isMustShow() {
        return this.a;
    }

    public void setHint(String str) {
        this.d = str;
    }

    public void setLabel(String str) {
        this.b = str;
    }

    public void setMustShow(boolean z) {
        this.a = z;
    }

    public void setName(String str) {
        this.c = str;
    }

    public void setType(String str) {
        this.f = str;
    }

    public void setVerfyRule(String str) {
        this.e = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    public TransElement(Parcel parcel) {
        this.a = true;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.a = 1 == parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
    }
}
