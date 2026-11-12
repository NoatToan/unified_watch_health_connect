package com.service.mi.visa.entity.resp;

import com.service.mi.wallet.entity.MediaContent;
import com.service.mi.wallet.entity.resp.BaseWalletResponse;

/* JADX INFO: loaded from: classes6.dex */
public class EnrollPanResp extends BaseWalletResponse {
    private String appletInstanceAid;
    private boolean isSecurityCodeApplicable;
    private String messageId;
    private String sdAid;
    private String taskId;
    private MediaContent termsAndConditionsContent;
    private String vEphemeralVisaPublicCertValue;
    private String vEphemeralVisaPublicKeyID;

    public EnrollPanResp(String str, String str2) {
        super(str, str2);
    }

    public String getAppletInstanceAid() {
        return this.appletInstanceAid;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getSdAid() {
        return this.sdAid;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public MediaContent getTermsAndConditionsContent() {
        return this.termsAndConditionsContent;
    }

    public String getvEphemeralVisaPublicCertValue() {
        return this.vEphemeralVisaPublicCertValue;
    }

    public String getvEphemeralVisaPublicKeyID() {
        return this.vEphemeralVisaPublicKeyID;
    }

    public boolean isSecurityCodeApplicable() {
        return this.isSecurityCodeApplicable;
    }

    public void setAppletInstanceAid(String str) {
        this.appletInstanceAid = str;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setSdAid(String str) {
        this.sdAid = str;
    }

    public void setSecurityCodeApplicable(boolean z) {
        this.isSecurityCodeApplicable = z;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public void setTermsAndConditionsContent(MediaContent mediaContent) {
        this.termsAndConditionsContent = mediaContent;
    }

    public void setvEphemeralVisaPublicCertValue(String str) {
        this.vEphemeralVisaPublicCertValue = str;
    }

    public void setvEphemeralVisaPublicKeyID(String str) {
        this.vEphemeralVisaPublicKeyID = str;
    }
}
