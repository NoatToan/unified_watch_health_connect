package com.huawei.hms.support.account.result;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes34.dex */
public class AccountIcon implements Parcelable {
    public static final Parcelable.Creator<AccountIcon> CREATOR = new Parcelable.Creator<AccountIcon>() { // from class: com.huawei.hms.support.account.result.AccountIcon.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccountIcon createFromParcel(Parcel parcel) {
            return new AccountIcon(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccountIcon[] newArray(int i) {
            return new AccountIcon[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f16478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f16479b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AccountIcon() {
    }

    private AccountIcon(Parcel parcel) {
        this.f16478a = parcel.readString();
        this.f16479b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
    }

    public AccountIcon(String str, Bitmap bitmap) {
        this.f16478a = str;
        this.f16479b = bitmap;
    }

    public Bitmap getIcon() {
        return this.f16479b;
    }

    public String getDescription() {
        return this.f16478a;
    }

    public void setIcon(Bitmap bitmap) {
        this.f16479b = bitmap;
    }

    public void setDescription(String str) {
        this.f16478a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16478a);
        parcel.writeParcelable(this.f16479b, i);
    }
}
