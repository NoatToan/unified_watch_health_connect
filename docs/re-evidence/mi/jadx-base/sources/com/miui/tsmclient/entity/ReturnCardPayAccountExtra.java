package com.miui.tsmclient.entity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class ReturnCardPayAccountExtra implements Parcelable {
    public static final Parcelable.Creator<ReturnCardPayAccountExtra> CREATOR = new Parcelable.Creator<ReturnCardPayAccountExtra>() { // from class: com.miui.tsmclient.entity.ReturnCardPayAccountExtra.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReturnCardPayAccountExtra createFromParcel(Parcel parcel) {
            return new ReturnCardPayAccountExtra(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReturnCardPayAccountExtra[] newArray(int i) {
            return new ReturnCardPayAccountExtra[i];
        }
    };
    public static String KEY_RETURN_CARD_AUTH_CODE = "return_card_auth_code";
    public static String KEY_RETURN_CARD_PAY_ACCOUNT_ID = "return_card_pay_account_id";
    public static String KEY_RETURN_CARD_PAY_ACCOUNT_NAME = "return_card_pay_account_name";
    public static String KEY_RETURN_CARD_PAY_ACCOUNT_TYPE = "return_card_pay_account_type";
    public static String KEY_RETURN_CARD_PHONE_NUMBER = "return_card_phone_number";
    public static String KEY_RETURN_CARD_REASON_CODE = "return_card_reason_code";
    public static String PAY_ACCOUNT_TYPE_ALIPAY = "ALIPAY";
    public static String PAY_ACCOUNT_TYPE_DEBIT_CARD = "DEBIT_CARD";
    public static String PAY_ACCOUNT_TYPE_WECHAT_PAY = "WECHAT_PAY";
    private String mAuthCode;
    private String mPayAccountId;
    private String mPayAccountName;
    private String mPayAccountType;
    private String mPhoneNumber;

    public ReturnCardPayAccountExtra(String str, String str2, String str3) {
        this.mPayAccountType = PAY_ACCOUNT_TYPE_ALIPAY;
        this.mPayAccountName = str;
        this.mPayAccountId = str2;
        this.mPhoneNumber = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAuthCode() {
        return this.mAuthCode;
    }

    public String getPayAccountId() {
        return this.mPayAccountId;
    }

    public String getPayAccountName() {
        return this.mPayAccountName;
    }

    public String getPayAccountType() {
        return this.mPayAccountType;
    }

    public String getPhoneNumber() {
        return this.mPhoneNumber;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_RETURN_CARD_PAY_ACCOUNT_TYPE, this.mPayAccountType);
        bundle.putString(KEY_RETURN_CARD_PAY_ACCOUNT_NAME, this.mPayAccountName);
        bundle.putString(KEY_RETURN_CARD_PAY_ACCOUNT_ID, this.mPayAccountId);
        bundle.putString(KEY_RETURN_CARD_PHONE_NUMBER, this.mPhoneNumber);
        bundle.putString(KEY_RETURN_CARD_AUTH_CODE, this.mAuthCode);
        return bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mPayAccountType);
        parcel.writeString(this.mPayAccountName);
        parcel.writeString(this.mPayAccountId);
        parcel.writeString(this.mPhoneNumber);
        parcel.writeString(this.mAuthCode);
    }

    public ReturnCardPayAccountExtra(String str, String str2, String str3, String str4) {
        this.mPayAccountType = str;
        this.mPayAccountName = str2;
        this.mPayAccountId = str3;
        this.mPhoneNumber = str4;
    }

    public ReturnCardPayAccountExtra(String str, String str2) {
        this.mPayAccountType = str;
        this.mAuthCode = str2;
    }

    public ReturnCardPayAccountExtra(String str) {
        this.mPayAccountType = str;
    }

    public ReturnCardPayAccountExtra(Parcel parcel) {
        this.mPayAccountType = parcel.readString();
        this.mPayAccountName = parcel.readString();
        this.mPayAccountId = parcel.readString();
        this.mPhoneNumber = parcel.readString();
        this.mAuthCode = parcel.readString();
    }
}
