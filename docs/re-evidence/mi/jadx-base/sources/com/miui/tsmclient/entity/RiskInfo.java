package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.DeviceUtils;
import com.miui.tsmclient.util.NetworkUtil;
import com.miui.tsmclient.util.ObjectUtils;
import com.miui.tsmclient.util.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class RiskInfo implements Parcelable {
    public static final Parcelable.Creator<RiskInfo> CREATOR = new Parcelable.Creator<RiskInfo>() { // from class: com.miui.tsmclient.entity.RiskInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RiskInfo createFromParcel(Parcel parcel) {
            return new RiskInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RiskInfo[] newArray(int i) {
            return new RiskInfo[i];
        }
    };
    private static final int MAX_PHONE_NUMBER_LENGTH = 11;
    private static final String RISK_REASON_CODE_NO_SIM_CARD = "2F";
    private static final String RISK_REASON_CODE_PHONE_NUMBERS_MISMATCH = "4F";
    private String mAccountEmailLife;
    private String mAccountIDHash;
    private int mAccountScore;
    private TsmRpcModels.ApplyChannel mApplyChannel;
    private String mBillingAddress;
    private String mBillingZip;
    private TsmRpcModels.CaptureMethod mCaptureMethod;
    private String mCardHolderName;
    private String mDeviceLanguage;
    private String mDeviceLocation;
    private String mDeviceModel;
    private String mDeviceName;
    private String mDeviceNumber;
    private int mDeviceSIMNumber;
    private int mDeviceScore;
    private TsmRpcModels.DeviceType mDeviceType;
    private String mExtensiveDeviceLocation;
    private List<String> mFullDeviceNumber;
    private int mPhoneNumberScore;
    private List<String> mRiskReasonCode;
    private int mRiskScore;
    private String mRiskStandardVersion;
    private String mSourceIP;

    public static class Builder {
        private RiskInfo mRiskInfo = new RiskInfo();

        public RiskInfo build() {
            this.mRiskInfo.setDeviceLanguage(DeviceUtils.getDeviceLanguage6393());
            List<String> sIMNumber = DeviceUtils.getSIMNumber(null);
            this.mRiskInfo.setFullDeviceNumber(sIMNumber);
            this.mRiskInfo.setDeviceSIMNumber(sIMNumber.size());
            this.mRiskInfo.setDeviceName(DeviceUtils.getDeviceModel(null));
            return this.mRiskInfo;
        }

        public Builder setAccountEmailLife(String str) {
            this.mRiskInfo.setAccountEmailLife(str);
            return this;
        }

        public Builder setApplyChannel(TsmRpcModels.ApplyChannel applyChannel) {
            this.mRiskInfo.setApplyChannel(applyChannel);
            return this;
        }

        public Builder setBillingAddress(String str) {
            this.mRiskInfo.setBillingAddress(str);
            return this;
        }

        public Builder setBillingZip(String str) {
            this.mRiskInfo.setBillingZip(str);
            return this;
        }

        public Builder setCaptureMethod(TsmRpcModels.CaptureMethod captureMethod) {
            this.mRiskInfo.setCaptureMethod(captureMethod);
            return this;
        }

        public Builder setCardHolerName(String str) {
            this.mRiskInfo.setCardHolderName(str);
            return this;
        }

        public Builder setDeviceType(TsmRpcModels.DeviceType deviceType) {
            this.mRiskInfo.setDeviceType(deviceType);
            return this;
        }
    }

    public static RiskInfo getRiskInfo(TsmRpcModels.CaptureMethod captureMethod) {
        ArrayList arrayList = new ArrayList();
        String str = ObjectUtils.isCollectionEmpty(arrayList) ? "" : (String) arrayList.get(0);
        String deviceModel = DeviceUtils.getDeviceModel(null);
        RiskInfo riskInfoBuild = new Builder().build();
        riskInfoBuild.setDeviceType(TsmRpcModels.DeviceType.PHONE);
        riskInfoBuild.setDeviceName(deviceModel);
        riskInfoBuild.setApplyChannel(TsmRpcModels.ApplyChannel.XIAOMI);
        riskInfoBuild.setCaptureMethod(captureMethod);
        riskInfoBuild.setDeviceNumber(str.length() > 4 ? str.substring(str.length() - 4) : "");
        riskInfoBuild.setDeviceSIMNumber(arrayList.size());
        riskInfoBuild.setSourceIP(NetworkUtil.getLocalIpAddress());
        riskInfoBuild.setFullDeviceNumber(arrayList);
        return riskInfoBuild;
    }

    private List<String> getRiskReasonCodeList(String str, List<Pair<Integer, String>> list) {
        ArrayList arrayList = new ArrayList();
        if (ObjectUtils.isCollectionEmpty(list)) {
            arrayList.add(RISK_REASON_CODE_NO_SIM_CARD);
        } else {
            if (str.length() < 11) {
                arrayList.add(RISK_REASON_CODE_PHONE_NUMBERS_MISMATCH);
                return arrayList;
            }
            Iterator<Pair<Integer, String>> it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next().second;
                if (str2 != null && str2.length() >= 11 && TextUtils.equals(str.substring(0, 3), str2.substring(0, 3)) && TextUtils.equals(StringUtils.tail(str, 4), StringUtils.tail(str2, 4))) {
                    return arrayList;
                }
            }
            arrayList.add(RISK_REASON_CODE_PHONE_NUMBERS_MISMATCH);
        }
        return arrayList;
    }

    public TsmRpcModels.RiskInfo.Builder buildTSMRiskInfoBuilder() {
        TsmRpcModels.RiskInfo.Builder builderNewBuilder = TsmRpcModels.RiskInfo.newBuilder();
        builderNewBuilder.setDeviceType(getDeviceType());
        builderNewBuilder.setDeviceLanguage(getDeviceLanguage());
        builderNewBuilder.setDeviceName(getDeviceName());
        builderNewBuilder.setApplyChannel(getApplyChannel());
        builderNewBuilder.setDeviceLocation(getDeviceLocation());
        builderNewBuilder.setExtensiveDeviceLocation(getExtensiveDeviceLocation());
        builderNewBuilder.setCaptureMethod(getCaptureMethod());
        builderNewBuilder.setAccountEmailLife(getAccountEmailLife());
        builderNewBuilder.setCardHolderName(getCardHolderName());
        builderNewBuilder.setBillingAddress(getBillingAddress());
        builderNewBuilder.setBillingZip(getBillingZip());
        builderNewBuilder.setRiskScore(getRiskScore());
        builderNewBuilder.setRiskStandardVersion(getRiskStandardVersion());
        builderNewBuilder.setDeviceScore(getDeviceScore());
        builderNewBuilder.setAccountScore(getAccountScore());
        builderNewBuilder.setPhoneNumberScore(getPhoneNumberScore());
        builderNewBuilder.setDeviceType(getDeviceType());
        builderNewBuilder.setDeviceNumber(getDeviceNumber());
        builderNewBuilder.addAllFullDeviceNumber(getFullDeviceNumber());
        builderNewBuilder.setSourceIP(getSourceIP());
        builderNewBuilder.setDeviceSIMNumber(getDeviceSIMNumber());
        builderNewBuilder.setAccountIDHash(getAccountIDHash());
        if (!ObjectUtils.isCollectionEmpty(getRiskReasonCode())) {
            builderNewBuilder.addAllRiskReasonCode(getRiskReasonCode());
        }
        builderNewBuilder.setDeviceModel(getDeviceModel());
        return builderNewBuilder;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAccountEmailLife() {
        return this.mAccountEmailLife;
    }

    public String getAccountIDHash() {
        return this.mAccountIDHash;
    }

    public int getAccountScore() {
        return this.mAccountScore;
    }

    public TsmRpcModels.ApplyChannel getApplyChannel() {
        return this.mApplyChannel;
    }

    public String getBillingAddress() {
        return this.mBillingAddress;
    }

    public String getBillingZip() {
        return this.mBillingZip;
    }

    public TsmRpcModels.CaptureMethod getCaptureMethod() {
        return this.mCaptureMethod;
    }

    public String getCardHolderName() {
        return this.mCardHolderName;
    }

    public String getDeviceLanguage() {
        return this.mDeviceLanguage;
    }

    public String getDeviceLocation() {
        return this.mDeviceLocation;
    }

    public String getDeviceModel() {
        return DeviceUtils.getDeviceModel(null);
    }

    public String getDeviceName() {
        return this.mDeviceName;
    }

    public String getDeviceNumber() {
        return this.mDeviceNumber;
    }

    public int getDeviceSIMNumber() {
        return this.mDeviceSIMNumber;
    }

    public int getDeviceScore() {
        return this.mDeviceScore;
    }

    public TsmRpcModels.DeviceType getDeviceType() {
        return this.mDeviceType;
    }

    public String getExtensiveDeviceLocation() {
        return this.mExtensiveDeviceLocation;
    }

    public List<String> getFullDeviceNumber() {
        return this.mFullDeviceNumber;
    }

    public int getPhoneNumberScore() {
        return this.mPhoneNumberScore;
    }

    public List<String> getRiskReasonCode() {
        return this.mRiskReasonCode;
    }

    public int getRiskScore() {
        return this.mRiskScore;
    }

    public String getRiskStandardVersion() {
        return this.mRiskStandardVersion;
    }

    public String getSourceIP() {
        return this.mSourceIP;
    }

    public void setAccountEmailLife(String str) {
        this.mAccountEmailLife = str;
    }

    public void setAccountIDHash(String str) {
        this.mAccountIDHash = str;
    }

    public void setAccountScore(int i) {
        this.mAccountScore = i;
    }

    public void setApplyChannel(TsmRpcModels.ApplyChannel applyChannel) {
        this.mApplyChannel = applyChannel;
    }

    public void setBillingAddress(String str) {
        this.mBillingAddress = str;
    }

    public void setBillingZip(String str) {
        this.mBillingZip = str;
    }

    public void setCaptureMethod(TsmRpcModels.CaptureMethod captureMethod) {
        this.mCaptureMethod = captureMethod;
    }

    public void setCardHolderName(String str) {
        this.mCardHolderName = str;
    }

    public void setDeviceLanguage(String str) {
        this.mDeviceLanguage = str;
    }

    public void setDeviceLocation(String str) {
        this.mDeviceLocation = str;
    }

    public void setDeviceName(String str) {
        this.mDeviceName = str;
    }

    public void setDeviceNumber(String str) {
        this.mDeviceNumber = str;
    }

    public void setDeviceSIMNumber(int i) {
        this.mDeviceSIMNumber = i;
    }

    public void setDeviceScore(int i) {
        this.mDeviceScore = i;
    }

    public void setDeviceType(TsmRpcModels.DeviceType deviceType) {
        this.mDeviceType = deviceType;
    }

    public void setExtensiveDeviceLocation(String str) {
        this.mExtensiveDeviceLocation = str;
    }

    public void setFullDeviceNumber(List<String> list) {
        this.mFullDeviceNumber = list;
    }

    public void setPhoneNumberScore(int i) {
        this.mPhoneNumberScore = i;
    }

    public void setRiskReasonCode(List<String> list) {
        this.mRiskReasonCode = list;
    }

    public void setRiskScore(int i) {
        this.mRiskScore = i;
    }

    public void setRiskStandardVersion(String str) {
        this.mRiskStandardVersion = str;
    }

    public void setSourceIP(String str) {
        this.mSourceIP = str;
    }

    public void updateDeviceNumberAndReasonCode(List<Pair<Integer, String>> list, String str) {
        setDeviceSIMNumber(ObjectUtils.isCollectionEmpty(list) ? 0 : list.size());
        List<String> riskReasonCodeList = getRiskReasonCodeList(str, list);
        if (ObjectUtils.isCollectionEmpty(riskReasonCodeList)) {
            return;
        }
        setRiskReasonCode(riskReasonCodeList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        TsmRpcModels.DeviceType deviceType = this.mDeviceType;
        parcel.writeInt(deviceType == null ? -1 : deviceType.ordinal());
        parcel.writeString(this.mDeviceLanguage);
        parcel.writeString(this.mDeviceName);
        TsmRpcModels.ApplyChannel applyChannel = this.mApplyChannel;
        parcel.writeInt(applyChannel == null ? -1 : applyChannel.ordinal());
        parcel.writeString(this.mDeviceLocation);
        parcel.writeString(this.mExtensiveDeviceLocation);
        TsmRpcModels.CaptureMethod captureMethod = this.mCaptureMethod;
        parcel.writeInt(captureMethod != null ? captureMethod.ordinal() : -1);
        parcel.writeString(this.mAccountEmailLife);
        parcel.writeString(this.mCardHolderName);
        parcel.writeString(this.mBillingAddress);
        parcel.writeString(this.mBillingZip);
        parcel.writeInt(this.mRiskScore);
        parcel.writeString(this.mRiskStandardVersion);
        parcel.writeInt(this.mDeviceScore);
        parcel.writeInt(this.mAccountScore);
        parcel.writeInt(this.mPhoneNumberScore);
        parcel.writeStringList(this.mRiskReasonCode);
        parcel.writeString(this.mDeviceNumber);
        parcel.writeStringList(this.mFullDeviceNumber);
        parcel.writeString(this.mSourceIP);
        parcel.writeInt(this.mDeviceSIMNumber);
        parcel.writeString(this.mAccountIDHash);
        parcel.writeString(this.mDeviceModel);
    }

    private RiskInfo() {
        this.mDeviceLanguage = "";
        this.mDeviceName = "";
        this.mDeviceLocation = "";
        this.mExtensiveDeviceLocation = "";
        this.mAccountEmailLife = "";
        this.mCardHolderName = "";
        this.mBillingAddress = "";
        this.mBillingZip = "";
        this.mRiskStandardVersion = "";
        this.mDeviceNumber = "";
        this.mSourceIP = "";
        this.mAccountIDHash = "";
    }

    public RiskInfo(Parcel parcel) {
        this.mDeviceLanguage = "";
        this.mDeviceName = "";
        this.mDeviceLocation = "";
        this.mExtensiveDeviceLocation = "";
        this.mAccountEmailLife = "";
        this.mCardHolderName = "";
        this.mBillingAddress = "";
        this.mBillingZip = "";
        this.mRiskStandardVersion = "";
        this.mDeviceNumber = "";
        this.mSourceIP = "";
        this.mAccountIDHash = "";
        int i = parcel.readInt();
        this.mDeviceType = i == -1 ? null : TsmRpcModels.DeviceType.values()[i];
        this.mDeviceLanguage = parcel.readString();
        this.mDeviceName = parcel.readString();
        int i2 = parcel.readInt();
        this.mApplyChannel = i2 == -1 ? null : TsmRpcModels.ApplyChannel.values()[i2];
        this.mDeviceLocation = parcel.readString();
        this.mExtensiveDeviceLocation = parcel.readString();
        int i3 = parcel.readInt();
        this.mCaptureMethod = i3 != -1 ? TsmRpcModels.CaptureMethod.values()[i3] : null;
        this.mAccountEmailLife = parcel.readString();
        this.mCardHolderName = parcel.readString();
        this.mBillingAddress = parcel.readString();
        this.mBillingZip = parcel.readString();
        this.mRiskScore = parcel.readInt();
        this.mRiskStandardVersion = parcel.readString();
        this.mDeviceScore = parcel.readInt();
        this.mAccountScore = parcel.readInt();
        this.mPhoneNumberScore = parcel.readInt();
        this.mRiskReasonCode = parcel.createStringArrayList();
        this.mDeviceNumber = parcel.readString();
        this.mFullDeviceNumber = parcel.createStringArrayList();
        this.mSourceIP = parcel.readString();
        this.mDeviceSIMNumber = parcel.readInt();
        this.mAccountIDHash = parcel.readString();
        this.mDeviceModel = parcel.readString();
    }
}
