package com.xiaomi.fitness.login.bean;

import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class PrivacyAgreeModel {
    public static final String TYPE_ACCEPT = "accept";
    public static final String TYPE_REVOKE = "remove";

    @SerializedName("app_version")
    public String appVersion;

    @SerializedName("privacy_version")
    public String privacyVersion;
    public long time;
    public String did = "xiaomiwear_app";
    public String type = TYPE_ACCEPT;

    @SerializedName("privacy_id")
    public int privacyId = 1;

    public String toString() {
        return "PrivacyAgreeModel{did='" + this.did + "', type='" + this.type + "', time=" + this.time + ", appVersion='" + this.appVersion + "', privacyId=" + this.privacyId + ", privacyVersion='" + this.privacyVersion + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
