package com.service.mi.visa.entity.resp;

import com.service.mi.wallet.entity.resp.BaseWalletResponse;

/* JADX INFO: loaded from: classes6.dex */
public class SubmitStepUpMethodResp extends BaseWalletResponse {
    private Integer codeExpiration;
    private Integer maxOTPRequestsAllowed;
    private Integer maxOTPVerificationAllowed;

    public SubmitStepUpMethodResp(String str, String str2) {
        this.resultCode = str;
        this.msg = str2;
    }

    public Integer getCodeExpiration() {
        return this.codeExpiration;
    }

    public Integer getMaxOTPRequestsAllowed() {
        return this.maxOTPRequestsAllowed;
    }

    public Integer getMaxOTPVerificationAllowed() {
        return this.maxOTPVerificationAllowed;
    }

    public void setCodeExpiration(Integer num) {
        this.codeExpiration = num;
    }

    public void setMaxOTPRequestsAllowed(Integer num) {
        this.maxOTPRequestsAllowed = num;
    }

    public void setMaxOTPVerificationAllowed(Integer num) {
        this.maxOTPVerificationAllowed = num;
    }
}
