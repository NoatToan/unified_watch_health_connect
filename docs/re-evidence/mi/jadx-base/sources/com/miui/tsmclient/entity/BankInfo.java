package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class BankInfo implements Parcelable {
    public static final Parcelable.Creator<BankInfo> CREATOR = new Parcelable.Creator<BankInfo>() { // from class: com.miui.tsmclient.entity.BankInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BankInfo createFromParcel(Parcel parcel) {
            return new BankInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BankInfo[] newArray(int i) {
            return new BankInfo[i];
        }
    };
    private boolean isCreditSupported;
    private boolean isDebitSupported;
    private String mActivityLabel;
    private String mActivityLabelExplain;
    private String mBankName;
    private String mCreditActivityExplain;
    private String mCreditActivityLabel;
    private String mCreditIssuerId;
    private String mCreditProtocolUrl;
    private String mCreditWebUrl;
    private String mDebitActivityExplain;
    private String mDebitActivityLabel;
    private String mDebitIssuerId;
    private String mDebitProtocolUrl;
    private String mDebitWebUrl;
    private String mLogoURL;

    public BankInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getActivityLabel() {
        return this.mActivityLabel;
    }

    public String getActivityLabelExplain() {
        return this.mActivityLabelExplain;
    }

    public String getBankName() {
        return this.mBankName;
    }

    public String getCreditActivityExplain() {
        return this.mCreditActivityExplain;
    }

    public String getCreditActivityLabel() {
        return this.mCreditActivityLabel;
    }

    public String getCreditIssuerId() {
        return this.mCreditIssuerId;
    }

    public String getCreditProtocolUrl() {
        return this.mCreditProtocolUrl;
    }

    public String getCreditWebUrl() {
        return TextUtils.isEmpty(this.mCreditWebUrl) ? "" : this.mCreditWebUrl;
    }

    public String getDebitActivityExplain() {
        return this.mDebitActivityExplain;
    }

    public String getDebitActivityLabel() {
        return this.mDebitActivityLabel;
    }

    public String getDebitIssuerId() {
        return this.mDebitIssuerId;
    }

    public String getDebitProtocolUrl() {
        return this.mDebitProtocolUrl;
    }

    public String getDebitWebUrl() {
        return TextUtils.isEmpty(this.mDebitWebUrl) ? "" : this.mDebitWebUrl;
    }

    public String getLogoURL() {
        return this.mLogoURL;
    }

    public boolean isCreditSupported() {
        return this.isCreditSupported;
    }

    public boolean isDebitSupported() {
        return this.isDebitSupported;
    }

    public void setActivityLabel(String str) {
        this.mActivityLabel = str;
    }

    public void setActivityLabelExplain(String str) {
        this.mActivityLabelExplain = str;
    }

    public void setBankName(String str) {
        this.mBankName = str;
    }

    public void setCreditActivityExplain(String str) {
        this.mCreditActivityExplain = str;
    }

    public void setCreditActivityLabel(String str) {
        this.mCreditActivityLabel = str;
    }

    public void setCreditIssuerId(String str) {
        this.mCreditIssuerId = str;
    }

    public void setCreditProtocolUrl(String str) {
        this.mCreditProtocolUrl = str;
    }

    public void setCreditSupported(boolean z) {
        this.isCreditSupported = z;
    }

    public void setCreditWebUrl(String str) {
        this.mCreditWebUrl = str;
    }

    public void setDebitActivityExplain(String str) {
        this.mDebitActivityExplain = str;
    }

    public void setDebitActivityLabel(String str) {
        this.mDebitActivityLabel = str;
    }

    public void setDebitIssuerId(String str) {
        this.mDebitIssuerId = str;
    }

    public void setDebitProtocolUrl(String str) {
        this.mDebitProtocolUrl = str;
    }

    public void setDebitSupported(boolean z) {
        this.isDebitSupported = z;
    }

    public void setDebitWebUrl(String str) {
        this.mDebitWebUrl = str;
    }

    public void setLogoURL(String str) {
        this.mLogoURL = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mBankName);
        parcel.writeString(this.mLogoURL);
        parcel.writeString(this.mDebitIssuerId);
        parcel.writeString(this.mCreditIssuerId);
        parcel.writeByte(this.isDebitSupported ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isCreditSupported ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mDebitProtocolUrl);
        parcel.writeString(this.mCreditProtocolUrl);
        parcel.writeString(this.mDebitWebUrl);
        parcel.writeString(this.mCreditWebUrl);
        parcel.writeString(this.mActivityLabel);
        parcel.writeString(this.mActivityLabelExplain);
        parcel.writeString(this.mDebitActivityLabel);
        parcel.writeString(this.mDebitActivityExplain);
        parcel.writeString(this.mCreditActivityLabel);
        parcel.writeString(this.mCreditActivityExplain);
    }

    public BankInfo(Parcel parcel) {
        this.mBankName = parcel.readString();
        this.mLogoURL = parcel.readString();
        this.mDebitIssuerId = parcel.readString();
        this.mCreditIssuerId = parcel.readString();
        this.isDebitSupported = parcel.readByte() != 0;
        this.isCreditSupported = parcel.readByte() != 0;
        this.mDebitProtocolUrl = parcel.readString();
        this.mCreditProtocolUrl = parcel.readString();
        this.mDebitWebUrl = parcel.readString();
        this.mCreditWebUrl = parcel.readString();
        this.mActivityLabel = parcel.readString();
        this.mActivityLabelExplain = parcel.readString();
        this.mDebitActivityLabel = parcel.readString();
        this.mDebitActivityExplain = parcel.readString();
        this.mCreditActivityLabel = parcel.readString();
        this.mCreditActivityExplain = parcel.readString();
    }
}
