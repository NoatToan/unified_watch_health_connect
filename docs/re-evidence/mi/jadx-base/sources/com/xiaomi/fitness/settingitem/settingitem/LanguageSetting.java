package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class LanguageSetting {

    @SerializedName("device_language")
    @Expose
    private int deviceLanguage = 0;

    @SerializedName("device_source")
    @Expose
    private int deviceSource = 58;

    @SerializedName("languageFollowMobilePhoneSwitch")
    @Expose
    private boolean languageFollowMobilePhoneSwitch = false;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LanguageSetting)) {
            return false;
        }
        LanguageSetting languageSetting = (LanguageSetting) obj;
        return this.deviceSource == languageSetting.deviceSource && this.languageFollowMobilePhoneSwitch == languageSetting.languageFollowMobilePhoneSwitch && this.deviceLanguage == languageSetting.deviceLanguage;
    }

    public int getDeviceLanguage() {
        return this.deviceLanguage;
    }

    public int getDeviceSource() {
        return this.deviceSource;
    }

    public int hashCode() {
        return ((((this.deviceSource + 31) * 31) + (this.languageFollowMobilePhoneSwitch ? 1 : 0)) * 31) + this.deviceLanguage;
    }

    public boolean isLanguageFollowMobilePhoneSwitch() {
        return this.languageFollowMobilePhoneSwitch;
    }

    public void setDeviceLanguage(int i) {
        this.deviceLanguage = i;
    }

    public void setDeviceSource(int i) {
        this.deviceSource = i;
    }

    public void setLanguageFollowMobilePhoneSwitch(boolean z) {
        this.languageFollowMobilePhoneSwitch = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LanguageSetting.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("deviceLanguage");
        sb.append('=');
        sb.append(this.deviceLanguage);
        sb.append(',');
        sb.append("deviceSource");
        sb.append('=');
        sb.append(this.deviceSource);
        sb.append(',');
        sb.append("languageFollowMobilePhoneSwitch");
        sb.append('=');
        sb.append(this.languageFollowMobilePhoneSwitch);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}
