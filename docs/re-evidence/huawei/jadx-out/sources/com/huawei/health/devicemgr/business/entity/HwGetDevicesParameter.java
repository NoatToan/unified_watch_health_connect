package com.huawei.health.devicemgr.business.entity;

import android.os.Parcel;
import android.os.Parcelable;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes.dex */
public class HwGetDevicesParameter implements Parcelable {
    public static final Parcelable.Creator<HwGetDevicesParameter> CREATOR = new Parcelable.Creator<HwGetDevicesParameter>() { // from class: com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public HwGetDevicesParameter[] newArray(int i) {
            return new HwGetDevicesParameter[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public HwGetDevicesParameter createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
            hwGetDevicesParameter.setDeviceIdentify(string);
            hwGetDevicesParameter.setHiLinkDeviceId(string2);
            return hwGetDevicesParameter;
        }
    };
    private static final int MAX_LENGTH = 6;
    private String mDeviceIdentify = "";
    private String mHiLinkDeviceId = "";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getHiLinkDeviceId() {
        String str = this.mHiLinkDeviceId;
        return str == null ? "" : str;
    }

    public void setHiLinkDeviceId(String str) {
        this.mHiLinkDeviceId = str;
    }

    public void setDeviceIdentify(String str) {
        if (str != null) {
            String strReplaceAll = str.replaceAll(":", "");
            if (strReplaceAll.length() >= 6) {
                this.mDeviceIdentify = strReplaceAll.substring(strReplaceAll.length() - 6);
            } else {
                this.mDeviceIdentify = strReplaceAll;
            }
        }
    }

    public String getDeviceIdentify() {
        return this.mDeviceIdentify;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mDeviceIdentify);
        parcel.writeString(this.mHiLinkDeviceId);
    }

    public String toString() {
        return "[HwGetDevicesParameter:mDeviceIdentify = " + CommonUtil.n(this.mDeviceIdentify) + "]";
    }
}
