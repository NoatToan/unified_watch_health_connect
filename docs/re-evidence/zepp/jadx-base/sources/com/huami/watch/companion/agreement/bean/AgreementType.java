package com.huami.watch.companion.agreement.bean;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public enum AgreementType {
    TOS("huami.watch.user.version.agreement", "agreement"),
    PRIVACY("huami.watch.user.version.privacy", "privacy"),
    EXPERIENCE("huami.watch.user.version.experience", "experience");

    private String type;
    private String userSettingKey;

    AgreementType(String str, String str2) {
        this.userSettingKey = str;
        this.type = str2;
    }

    public static AgreementType typeOf(@NonNull String str) {
        for (AgreementType agreementType : values()) {
            if (str.equals(agreementType.getType())) {
                return agreementType;
            }
        }
        return null;
    }

    public String getType() {
        return this.type;
    }

    public String getUserSettingKey() {
        return this.userSettingKey;
    }
}
