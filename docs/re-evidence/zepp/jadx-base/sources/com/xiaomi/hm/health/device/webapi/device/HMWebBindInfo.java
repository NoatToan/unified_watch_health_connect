package com.xiaomi.hm.health.device.webapi.device;

import android.os.Build;
import com.xiaomi.hm.health.device.model.HMBrandType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class HMWebBindInfo {
    public static final int TYPE_BIND = 0;
    public static final int TYPE_QUERY = 2;
    public static final int TYPE_UNBIND = 1;
    private int a;
    public JSONObject additionalInfo;
    private int b;
    private int c;
    private String d;
    private int e;
    private boolean f;
    private String g;
    private int h;
    private int i;
    public String mAuthKey;
    public long mBindTime;
    public int mBrandType;
    public String mDeviceId;
    public int mDeviceSource;
    public int mDeviceType;
    public String mFwVersion;
    public String mHrFwVersion;
    public String mPhoneBrand;
    public String mPhoneModel;
    public String mPhoneSystem;
    public String mSn;
    public String mSoftVersion;
    public String macAddress;

    private HMWebBindInfo() {
        this.mPhoneBrand = Build.BRAND;
        this.mPhoneModel = Build.MODEL;
        this.mPhoneSystem = "Android_" + Build.VERSION.RELEASE;
        this.mSoftVersion = "";
        this.mDeviceType = -1;
        this.mDeviceSource = -1;
        this.mDeviceId = "";
        this.mFwVersion = "";
        this.mHrFwVersion = "";
        this.macAddress = "";
        this.mBindTime = System.currentTimeMillis();
        this.mSn = "";
        this.mBrandType = HMBrandType.BRAND_DEFAULT.getValue();
        this.mAuthKey = "";
        this.additionalInfo = null;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = "";
        this.e = -1;
        this.f = true;
        this.g = "";
        this.h = -1;
        this.i = -1;
    }

    public static HMWebBindInfo createBindInfo(int i, int i2, String str, String str2, String str3, String str4, long j) {
        HMWebBindInfo hMWebBindInfo = new HMWebBindInfo();
        hMWebBindInfo.a = 0;
        hMWebBindInfo.mDeviceType = i;
        hMWebBindInfo.mDeviceSource = i2;
        hMWebBindInfo.mDeviceId = str;
        hMWebBindInfo.mFwVersion = str2;
        hMWebBindInfo.mSoftVersion = str3;
        hMWebBindInfo.macAddress = str4;
        hMWebBindInfo.mBindTime = j;
        return hMWebBindInfo;
    }

    public static HMWebBindInfo createQueryInfo(int i, int i2, String str) {
        HMWebBindInfo hMWebBindInfo = new HMWebBindInfo();
        hMWebBindInfo.a = 2;
        hMWebBindInfo.mDeviceType = i;
        hMWebBindInfo.macAddress = str;
        hMWebBindInfo.mDeviceSource = i2;
        return hMWebBindInfo;
    }

    public static HMWebBindInfo createUnbindInfo(int i, String str, int i2, int i3, String str2) {
        HMWebBindInfo hMWebBindInfo = new HMWebBindInfo();
        hMWebBindInfo.a = 1;
        hMWebBindInfo.mDeviceType = i;
        hMWebBindInfo.mDeviceId = str;
        hMWebBindInfo.b = i2;
        hMWebBindInfo.mDeviceSource = i3;
        hMWebBindInfo.macAddress = str2;
        return hMWebBindInfo;
    }

    public static HMWebBindInfo createUpdateInfo(int i, String str, int i2, String str2) {
        HMWebBindInfo hMWebBindInfo = new HMWebBindInfo();
        hMWebBindInfo.mDeviceType = i;
        hMWebBindInfo.mDeviceId = str;
        hMWebBindInfo.d = str2;
        hMWebBindInfo.e = i2;
        return hMWebBindInfo;
    }

    public int getActiveStatus() {
        return this.e;
    }

    public String getAuthKey() {
        return this.mAuthKey;
    }

    public long getBindTime() {
        return this.mBindTime;
    }

    public int getBindType() {
        return this.a;
    }

    public int getBrandType() {
        return this.mBrandType;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public int getDeviceSource() {
        return this.mDeviceSource;
    }

    public int getDeviceType() {
        return this.mDeviceType;
    }

    public String getDisplayName() {
        return this.d;
    }

    public String getFwVersion() {
        return this.mFwVersion;
    }

    public String getHardwareVersion() {
        return this.g;
    }

    public String getHrFwVersion() {
        return this.mHrFwVersion;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public String getPhoneBrand() {
        return this.mPhoneBrand;
    }

    public String getPhoneModel() {
        return this.mPhoneModel;
    }

    public String getPhoneSystem() {
        return this.mPhoneSystem;
    }

    public int getProductId() {
        return this.h;
    }

    public int getProductVersion() {
        return this.i;
    }

    public String getSN() {
        return this.mSn;
    }

    public String getSoftVersion() {
        return this.mSoftVersion;
    }

    public int getUidCrc() {
        return this.c;
    }

    public int getUserIdCode() {
        return this.b;
    }

    public boolean isEnableMultiDevice() {
        return this.f;
    }

    public void setActiveStatus(int i) {
        this.e = i;
    }

    public void setAuthKey(String str) {
        this.mAuthKey = str;
    }

    public void setBrandType(int i) {
        this.mBrandType = i;
    }

    public void setDeviceId(String str) {
        this.mDeviceId = str;
    }

    public void setDisplayName(String str) {
        this.d = str;
    }

    public void setEnableMultiDevice(boolean z) {
        this.f = z;
    }

    public void setHardwareVersion(String str) {
        this.g = str;
    }

    public void setHrFwVersion(String str) {
        this.mHrFwVersion = str;
    }

    public void setProductId(int i) {
        this.h = i;
    }

    public void setProductVersion(int i) {
        this.i = i;
    }

    public void setSN(String str) {
        this.mSn = str;
    }

    public void setUidCrc(int i) {
        this.c = i;
    }

    public HMWebBindInfo(int i, int i2, String str, String str2, String str3, String str4, long j) {
        this.mPhoneBrand = Build.BRAND;
        this.mPhoneModel = Build.MODEL;
        this.mPhoneSystem = "Android_" + Build.VERSION.RELEASE;
        this.mSoftVersion = "";
        this.mDeviceType = -1;
        this.mDeviceSource = -1;
        this.mDeviceId = "";
        this.mFwVersion = "";
        this.mHrFwVersion = "";
        this.macAddress = "";
        this.mBindTime = System.currentTimeMillis();
        this.mSn = "";
        this.mBrandType = HMBrandType.BRAND_DEFAULT.getValue();
        this.mAuthKey = "";
        this.additionalInfo = null;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = "";
        this.e = -1;
        this.f = true;
        this.g = "";
        this.h = -1;
        this.i = -1;
        this.a = 0;
        this.mDeviceType = i;
        this.mDeviceSource = i2;
        this.mDeviceId = str;
        this.mFwVersion = str2;
        this.mSoftVersion = str3;
        this.macAddress = str4;
        this.mBindTime = j;
    }

    public HMWebBindInfo(int i, int i2, String str) {
        this.mPhoneBrand = Build.BRAND;
        this.mPhoneModel = Build.MODEL;
        this.mPhoneSystem = "Android_" + Build.VERSION.RELEASE;
        this.mSoftVersion = "";
        this.mDeviceType = -1;
        this.mDeviceSource = -1;
        this.mDeviceId = "";
        this.mFwVersion = "";
        this.mHrFwVersion = "";
        this.macAddress = "";
        this.mBindTime = System.currentTimeMillis();
        this.mSn = "";
        this.mBrandType = HMBrandType.BRAND_DEFAULT.getValue();
        this.mAuthKey = "";
        this.additionalInfo = null;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = "";
        this.e = -1;
        this.f = true;
        this.g = "";
        this.h = -1;
        this.i = -1;
        this.a = 2;
        this.mDeviceType = i;
        this.macAddress = str;
        this.mDeviceSource = i2;
    }

    public HMWebBindInfo(int i, String str, int i2, int i3, String str2) {
        this.mPhoneBrand = Build.BRAND;
        this.mPhoneModel = Build.MODEL;
        this.mPhoneSystem = "Android_" + Build.VERSION.RELEASE;
        this.mSoftVersion = "";
        this.mDeviceType = -1;
        this.mDeviceSource = -1;
        this.mDeviceId = "";
        this.mFwVersion = "";
        this.mHrFwVersion = "";
        this.macAddress = "";
        this.mBindTime = System.currentTimeMillis();
        this.mSn = "";
        this.mBrandType = HMBrandType.BRAND_DEFAULT.getValue();
        this.mAuthKey = "";
        this.additionalInfo = null;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = "";
        this.e = -1;
        this.f = true;
        this.g = "";
        this.h = -1;
        this.i = -1;
        this.a = 1;
        this.mDeviceType = i;
        this.mDeviceId = str;
        this.b = i2;
        this.mDeviceSource = i3;
        this.macAddress = str2;
    }
}
