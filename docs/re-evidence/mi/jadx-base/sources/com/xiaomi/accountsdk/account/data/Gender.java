package com.xiaomi.accountsdk.account.data;

import com.smarthome.core.modelconfig.PluginDeviceInfo;

/* JADX INFO: loaded from: classes6.dex */
public enum Gender {
    MALE("m"),
    FEMALE(PluginDeviceInfo.FBLUETOOTHPAIR);

    private String mGender;

    Gender(String str) {
        this.mGender = str;
    }

    public String getType() {
        return this.mGender;
    }
}
