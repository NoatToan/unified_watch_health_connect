package com.xiaomi.smarthome.rn.core.bean;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class RnPluginDeviceInfo {
    public String mIconReal;
    public int mIsBluetoothSecurityChip;
    public String mModel;
    public String mName;
    public String mPrivacyVer;
    public int mProductId;
    public int mSupportVoiceCtrl;

    public synchronized int getBluetoothSecurityChip() {
        return this.mIsBluetoothSecurityChip;
    }

    public synchronized String getIconReal() {
        if (TextUtils.isEmpty(this.mIconReal)) {
            return "";
        }
        return this.mIconReal;
    }

    public synchronized String getModel() {
        if (TextUtils.isEmpty(this.mModel)) {
            return "";
        }
        return this.mModel;
    }

    public synchronized String getName() {
        if (TextUtils.isEmpty(this.mName)) {
            return "";
        }
        return this.mName;
    }
}
