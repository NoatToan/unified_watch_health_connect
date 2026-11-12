package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class CardTypeListItem implements Parcelable {
    public static final Parcelable.Creator<CardTypeListItem> CREATOR = new a();
    private String a;
    private String b;
    private String c;

    public static class a implements Parcelable.Creator<CardTypeListItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CardTypeListItem createFromParcel(Parcel parcel) {
            return new CardTypeListItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CardTypeListItem[] newArray(int i) {
            return new CardTypeListItem[i];
        }
    }

    public CardTypeListItem() {
        this.a = "";
        this.b = "";
        this.c = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBankLogoUrl() {
        return this.c;
    }

    public String getBankName() {
        return this.b;
    }

    public String getCardType() {
        return this.a;
    }

    public void setBankLogoUrl(String str) {
        this.c = str;
    }

    public void setBankName(String str) {
        this.b = str;
    }

    public void setCardType(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public CardTypeListItem(Parcel parcel) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
