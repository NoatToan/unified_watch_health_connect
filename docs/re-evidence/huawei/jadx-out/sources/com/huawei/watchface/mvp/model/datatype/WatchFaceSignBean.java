package com.huawei.watchface.mvp.model.datatype;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.secure.android.common.util.SafeString;

/* JADX INFO: loaded from: classes20.dex */
public class WatchFaceSignBean {
    private String checkSingatures;
    private String encryptSecret;
    private String interfaceSecret;

    @SerializedName("resultcode")
    private String resultCode;

    @SerializedName("resultinfo")
    private String resultInfo;
    private String secretKey;
    private String sign;
    private String spid;
    private String userId;

    public String getCheckSignatures() {
        return this.checkSingatures;
    }

    public String getEncryptSecret() {
        return this.encryptSecret;
    }

    public String getInterfaceSecret() {
        return this.interfaceSecret;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public String getResultInfo() {
        return this.resultInfo;
    }

    public String getSecretKey() {
        return this.secretKey;
    }

    public String getSign() {
        return this.sign;
    }

    public String getSpid() {
        return this.spid;
    }

    public String getUserId() {
        if (!TextUtils.isEmpty(this.sign)) {
            try {
                String str = this.sign;
                this.userId = SafeString.substring(str, str.indexOf("@") + 1);
            } catch (IndexOutOfBoundsException unused) {
                return this.userId;
            }
        }
        return this.userId;
    }

    public void setCheckSignatures(String str) {
        this.checkSingatures = str;
    }

    public void setEncryptSecret(String str) {
        this.encryptSecret = str;
    }

    public void setInterfaceSecret(String str) {
        this.interfaceSecret = str;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public void setResultInfo(String str) {
        this.resultInfo = str;
    }

    public void setSecretKey(String str) {
        this.secretKey = str;
    }

    public void setSign(String str) {
        this.sign = str;
    }

    public void setSpid(String str) {
        this.spid = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
