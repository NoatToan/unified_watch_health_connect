package com.huawei.multisimservice.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import defpackage.oek;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class EUICCDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<EUICCDeviceInfo> CREATOR = new Parcelable.Creator<EUICCDeviceInfo>() { // from class: com.huawei.multisimservice.model.EUICCDeviceInfo.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public EUICCDeviceInfo createFromParcel(Parcel parcel) {
            return new EUICCDeviceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public EUICCDeviceInfo[] newArray(int i) {
            return new EUICCDeviceInfo[i];
        }
    };

    @SerializedName("activeType")
    private int activeType;

    @SerializedName("carrierType")
    private int carrierType;
    private oek esDevInfo;

    @SerializedName("apiVersion")
    private String mAidlVersion;
    private String mCiphertext;
    private String mCiphertextSign;

    @SerializedName("deviceImei")
    private String mDeviceIMEI;

    @SerializedName("deviceSerialNumber")
    private String mDeviceSerialNumber;

    @SerializedName("deviceType")
    private int mDeviceType;

    @SerializedName("eid")
    private String mEID;
    private List<EUICCInfo> mEUICCInfoList;

    @SerializedName("iCcid")
    private String mICCID;

    @SerializedName("iMsi")
    private String mIMSI;

    @SerializedName("techVersion")
    private String mOsVersion;

    @SerializedName(HwPayConstant.KEY_PRODUCTNAME)
    private String mProductName;

    @SerializedName("resultCode")
    private int mResultCode;

    @SerializedName("supportEuiccBinding")
    private String supportEuiccBinding;
    private long timeTemp;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getActiveType() {
        return this.activeType;
    }

    public void setActiveType(int i) {
        this.activeType = i;
    }

    public oek getEsDevInfo() {
        return this.esDevInfo;
    }

    public void setEsDevInfo(oek oekVar) {
        this.esDevInfo = oekVar;
    }

    public EUICCDeviceInfo() {
        this.mEUICCInfoList = null;
        this.activeType = 1;
    }

    public EUICCDeviceInfo(Parcel parcel) {
        this.mEUICCInfoList = null;
        this.activeType = 1;
        this.mResultCode = parcel.readInt();
        this.mDeviceType = parcel.readInt();
        this.mDeviceIMEI = parcel.readString();
        this.mDeviceSerialNumber = parcel.readString();
        this.mProductName = parcel.readString();
        this.mEID = parcel.readString();
        this.mOsVersion = parcel.readString();
        this.mAidlVersion = parcel.readString();
        this.mCiphertext = parcel.readString();
        this.mCiphertextSign = parcel.readString();
        this.timeTemp = parcel.readLong();
        if (this.mEUICCInfoList == null) {
            this.mEUICCInfoList = new ArrayList();
        }
        parcel.readTypedList(this.mEUICCInfoList, EUICCInfo.CREATOR);
    }

    public int getCarrierType() {
        return this.carrierType;
    }

    public void setCarrierType(int i) {
        this.carrierType = i;
    }

    public int getResultCode() {
        return this.mResultCode;
    }

    public void setResultCode(int i) {
        this.mResultCode = i;
    }

    public int getDeviceType() {
        return this.mDeviceType;
    }

    public void setDeviceType(int i) {
        this.mDeviceType = i;
    }

    public String getDeviceIMEI() {
        return this.mDeviceIMEI;
    }

    public void setDeviceIMEI(String str) {
        this.mDeviceIMEI = str;
    }

    public String getDeviceSerialNumber() {
        return this.mDeviceSerialNumber;
    }

    public void setDeviceSerialNumber(String str) {
        this.mDeviceSerialNumber = str;
    }

    public String getProductName() {
        return this.mProductName;
    }

    public void setProductName(String str) {
        this.mProductName = str;
    }

    public String getEID() {
        return this.mEID;
    }

    public void setEID(String str) {
        this.mEID = str;
    }

    public List<EUICCInfo> getSimInfoList() {
        return new ArrayList(this.mEUICCInfoList);
    }

    public void setSimInfoList(List<EUICCInfo> list) {
        this.mEUICCInfoList = list;
    }

    public String getIMSI() {
        return this.mIMSI;
    }

    public void setIMSI(String str) {
        this.mIMSI = str;
    }

    public String getICCID() {
        return this.mICCID;
    }

    public void setICCID(String str) {
        this.mICCID = str;
    }

    public String getmOsVersion() {
        return this.mOsVersion;
    }

    public void setmOsVersion(String str) {
        this.mOsVersion = str;
    }

    public String getmAidlVersion() {
        return this.mAidlVersion;
    }

    public void setmAidlVersion(String str) {
        this.mAidlVersion = str;
    }

    public String getmCiphertext() {
        return this.mCiphertext;
    }

    public void setmCiphertext(String str) {
        this.mCiphertext = str;
    }

    public String getmCiphertextSign() {
        return this.mCiphertextSign;
    }

    public void setmCiphertextSign(String str) {
        this.mCiphertextSign = str;
    }

    public long getTimeTemp() {
        return this.timeTemp;
    }

    public void setTimeTemp(long j) {
        this.timeTemp = j;
    }

    public String getSupportEuiccBinding() {
        return this.supportEuiccBinding;
    }

    public void setSupportEuiccBinding(String str) {
        this.supportEuiccBinding = str;
    }

    public String toString() {
        return "EUICCDeviceInfo{carrierType=" + this.carrierType + ", mResultCode=" + this.mResultCode + ", mDeviceType=" + this.mDeviceType + ", mdi='" + CommonUtil.n(this.mDeviceIMEI) + "', mdn='" + CommonUtil.n(this.mDeviceSerialNumber) + "', mProductName='" + this.mProductName + "', mE='" + CommonUtil.n(this.mEID) + "', mEUICCInfoList=" + this.mEUICCInfoList + ", iM='" + CommonUtil.n(this.mIMSI) + "', iC='" + CommonUtil.n(this.mICCID) + "', mOsVersion='" + this.mOsVersion + "', mAidlVersion='" + this.mAidlVersion + "', mCt='" + CommonUtil.n(this.mCiphertext) + "', mCts='" + CommonUtil.n(this.mCiphertextSign) + "', timeTemp=" + this.timeTemp + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mResultCode);
        parcel.writeInt(this.mDeviceType);
        parcel.writeString(this.mDeviceIMEI);
        parcel.writeString(this.mDeviceSerialNumber);
        parcel.writeString(this.mProductName);
        parcel.writeString(this.mEID);
        parcel.writeString(this.mOsVersion);
        parcel.writeString(this.mAidlVersion);
        parcel.writeString(this.mCiphertext);
        parcel.writeString(this.mCiphertextSign);
        parcel.writeLong(this.timeTemp);
        parcel.writeTypedList(this.mEUICCInfoList);
    }
}
