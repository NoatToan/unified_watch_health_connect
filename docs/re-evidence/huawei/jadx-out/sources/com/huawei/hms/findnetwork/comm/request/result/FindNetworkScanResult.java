package com.huawei.hms.findnetwork.comm.request.result;

import com.huawei.hms.findnetwork.comm.util.MaskUtil;

/* JADX INFO: loaded from: classes33.dex */
public class FindNetworkScanResult {
    private String mMac;
    private float mPreciseDistance;
    private String mRelativeDistance;
    private String mRssi;
    private String mSN;
    private String mStandbyDevice;
    private int mStatus;

    public String toString() {
        return "FindNetworkScanResult{fid=" + MaskUtil.maskSn(this.mSN) + ", mStatus=" + this.mStatus + ", mRssi=" + this.mRssi + ", mMac=" + MaskUtil.maskMac(this.mMac) + ", mStandbyDevice=" + MaskUtil.maskCommon(this.mStandbyDevice) + '}';
    }

    public void setmStatus(int i) {
        this.mStatus = i;
    }

    public void setmSN(String str) {
        this.mSN = str;
    }

    public void setmRssi(String str) {
        this.mRssi = str;
    }

    public void setmRelativeDistance(String str) {
        this.mRelativeDistance = str;
    }

    public void setmPreciseDistance(float f) {
        this.mPreciseDistance = f;
    }

    public void setmMac(String str) {
        this.mMac = str;
    }

    public void setStandbyDevice(String str) {
        this.mStandbyDevice = str;
    }

    public int getmStatus() {
        return this.mStatus;
    }

    public String getmSN() {
        return this.mSN;
    }

    public String getmRssi() {
        return this.mRssi;
    }

    public String getmRelativeDistance() {
        return this.mRelativeDistance;
    }

    public float getmPreciseDistance() {
        return this.mPreciseDistance;
    }

    public String getmMac() {
        return this.mMac;
    }

    public String getStandbyDevice() {
        return this.mStandbyDevice;
    }
}
