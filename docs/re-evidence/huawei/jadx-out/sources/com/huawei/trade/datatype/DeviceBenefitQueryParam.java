package com.huawei.trade.datatype;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes15.dex */
public class DeviceBenefitQueryParam {
    private static final String TAG = "DevBenefitQueryParam";

    @SerializedName("benefitType")
    private DeviceBenefitType mBenefitType;

    @SerializedName("deviceCategory")
    private int mDeviceCategory;

    @SerializedName("deviceInfo")
    private DeviceInfo mDeviceInfo;

    @SerializedName("deviceNumber")
    private String mDeviceNumber;

    @SerializedName(HealthEngineRequestManager.PARAMS_DEVICE_SN)
    private String mDeviceSn;

    @SerializedName("deviceSnType")
    private int mDeviceSnType;

    @SerializedName("deviceType")
    private String mDeviceType;

    @SerializedName("deviceUdid")
    private String mDeviceUdid;

    @SerializedName("isNeedProductInfo")
    private boolean mIsNeedProductInfo;

    @SerializedName("salt")
    private String mSalt;

    public static class Builder {
        private DeviceBenefitType mBenefitType;
        private int mDeviceCategory;
        private DeviceInfo mDeviceInfo;
        private String mDeviceNumber;
        private String mDeviceSn;
        private int mDeviceSnType;
        private String mDeviceType;
        private String mDeviceUdid;
        private boolean mIsNeedProductInfo;
        private String mSalt;

        public DeviceBenefitQueryParam build() {
            return new DeviceBenefitQueryParam(this);
        }

        public Builder setDeviceType(String str) {
            this.mDeviceType = str;
            return this;
        }

        public Builder setDeviceSn(String str) {
            this.mDeviceSn = str;
            return this;
        }

        public Builder setDeviceUdid(String str) {
            this.mDeviceUdid = str;
            return this;
        }

        public Builder setDeviceNumber(String str) {
            this.mDeviceNumber = str;
            return this;
        }

        public Builder setSalt(String str) {
            this.mSalt = str;
            return this;
        }

        public Builder setBenefitType(DeviceBenefitType deviceBenefitType) {
            this.mBenefitType = deviceBenefitType;
            return this;
        }

        public Builder setNeedProductInfo(boolean z) {
            this.mIsNeedProductInfo = z;
            return this;
        }

        public Builder setDeviceInfo(DeviceInfo deviceInfo) {
            this.mDeviceInfo = deviceInfo;
            return this;
        }

        public Builder setDeviceCategory(int i) {
            this.mDeviceCategory = i;
            return this;
        }

        public Builder setDeviceSnType(int i) {
            this.mDeviceSnType = i;
            return this;
        }
    }

    public DeviceBenefitQueryParam(Builder builder) {
        if (builder != null) {
            this.mDeviceType = builder.mDeviceType;
            this.mDeviceSn = builder.mDeviceSn;
            this.mDeviceUdid = builder.mDeviceUdid;
            this.mDeviceNumber = builder.mDeviceNumber;
            this.mSalt = builder.mSalt;
            this.mBenefitType = builder.mBenefitType;
            this.mIsNeedProductInfo = builder.mIsNeedProductInfo;
            this.mDeviceInfo = builder.mDeviceInfo;
            this.mDeviceCategory = builder.mDeviceCategory;
            this.mDeviceSnType = builder.mDeviceSnType;
            return;
        }
        LogUtil.j(TAG, "builder is null");
    }

    public String getDeviceType() {
        return this.mDeviceType;
    }

    public String getDeviceSn() {
        return this.mDeviceSn;
    }

    public String getDeviceUdid() {
        return this.mDeviceUdid;
    }

    public String getDeviceNumber() {
        return this.mDeviceNumber;
    }

    public String getSalt() {
        return this.mSalt;
    }

    public DeviceBenefitType getBenefitType() {
        return this.mBenefitType;
    }

    public boolean isNeedProductInfo() {
        return this.mIsNeedProductInfo;
    }

    public DeviceInfo getDeviceInfo() {
        return this.mDeviceInfo;
    }

    public int getDeviceCategory() {
        return this.mDeviceCategory;
    }

    public int getDeviceSnType() {
        return this.mDeviceSnType;
    }

    public enum DeviceBenefitType {
        DEVICE_BENEFIT_TYPE_ALL(0),
        DEVICE_BENEFIT_TYPE_INBOX(1),
        DEVICE_BENEFIT_TYPE_PERF_PURCHASE(2);

        private int defaultIndex;

        DeviceBenefitType(int i) {
            this.defaultIndex = i;
        }
    }

    public enum DeviceCategory {
        DEVICE_CATEGORY_PHONE(1),
        DEVICE_CATEGORY_WEAR(2);

        private int category;

        DeviceCategory(int i) {
            this.category = i;
        }

        public int getCategory() {
            return this.category;
        }
    }

    public enum DeviceSnType {
        DEVICE_SN_TYPE_SN(1),
        DEVICE_SN_TYPE_ODID(2),
        DEVICE_SN_TYPE_UDID(3);

        private int snType;

        DeviceSnType(int i) {
            this.snType = i;
        }

        public int getSnType() {
            return this.snType;
        }
    }
}
