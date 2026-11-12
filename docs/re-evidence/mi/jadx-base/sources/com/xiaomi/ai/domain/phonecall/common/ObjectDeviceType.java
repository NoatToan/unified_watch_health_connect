package com.xiaomi.ai.domain.phonecall.common;

import com.miui.tsmclient.util.Constants;
import com.xiaomi.phonenum.data.AccountCertification;

/* JADX INFO: loaded from: classes7.dex */
public enum ObjectDeviceType {
    TELECOM(AccountCertification.Source.SOURCE_TYPE_OPERATOR_TELECOM),
    APP(Constants.ENTRY_TYPE_APP),
    WATCH("WATCH");

    private String text;

    ObjectDeviceType(String str) {
        this.text = str;
    }

    public static ObjectDeviceType fromString(String str) {
        for (ObjectDeviceType objectDeviceType : values()) {
            if (objectDeviceType.getText().equalsIgnoreCase(str)) {
                return objectDeviceType;
            }
        }
        return null;
    }

    public String getText() {
        return this.text;
    }
}
