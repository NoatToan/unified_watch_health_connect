package com.huami.watch.companion.esim.model;

import android.content.Context;
import android.text.TextUtils;
import com.huami.watch.companion.esim.R;
import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
public class SimpleProfileInfo implements Serializable {
    private String displayName;
    private String iccid;
    private boolean isEnabled;
    private String nickName;
    private String providerName;

    public String getDisplayName() {
        return this.displayName;
    }

    public String getI18nProviderName(Context context) {
        if ("CHINAUNICOM".equalsIgnoreCase(this.providerName)) {
            return context.getString(R.string.esim_carrier_liantong);
        }
        if ("CMCC".equalsIgnoreCase(this.providerName)) {
            return context.getString(R.string.esim_carrier_yidong);
        }
        return "中国电信".equalsIgnoreCase(this.providerName) ? context.getString(R.string.esim_carrier_dianxin) : this.providerName;
    }

    public String getIccid() {
        return this.iccid;
    }

    public String getName(Context context) {
        return TextUtils.isEmpty(this.nickName) ? getI18nProviderName(context) : this.nickName;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getProviderName() {
        return this.providerName;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    public void setIccid(String str) {
        this.iccid = str;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setProviderName(String str) {
        this.providerName = str;
    }
}
