package com.xiaomi.ai.domain.phonecall.contact;

import com.miui.tsmclient.util.Constants;
import com.xiaomi.phonenum.data.AccountCertification;

/* JADX INFO: loaded from: classes7.dex */
public enum ContactType {
    DEFAULT(AccountCertification.Source.SOURCE_TYPE_OPERATOR_TELECOM),
    APP(Constants.ENTRY_TYPE_APP),
    WATCH("WATCH"),
    TV("TV");

    private String text;

    ContactType(String str) {
        this.text = str;
    }

    public static ContactType fromString(String str) {
        for (ContactType contactType : values()) {
            if (contactType.getText().equalsIgnoreCase(str)) {
                return contactType;
            }
        }
        return null;
    }

    public String getText() {
        return this.text;
    }
}
