package com.service.mi.wallet.entity.resp;

import com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildType;
import com.service.mi.entity.SpError;
import com.service.mi.wallet.entity.MediaContent;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class PreDigitizeResp extends BaseWalletResponse {
    public boolean isExpirationDateApplicable;
    public boolean isHolderNameApplicable;
    private boolean isSecurityCodeApplicable;
    private String messageId;
    private MediaContent termsAndConditionsContent;

    public PreDigitizeResp(String str, String str2) {
        super(str, str2);
    }

    public String getMessageId() {
        return this.messageId;
    }

    public MediaContent getTermsAndConditionsContent() {
        return this.termsAndConditionsContent;
    }

    public boolean isExpirationDateApplicable() {
        return this.isExpirationDateApplicable;
    }

    public boolean isHolderNameApplicable() {
        return this.isHolderNameApplicable;
    }

    public boolean isNeedRetry() {
        return AMap3DTileBuildType.HOUSING.equalsIgnoreCase(getResultCode());
    }

    public boolean isSecurityCodeApplicable() {
        return this.isSecurityCodeApplicable;
    }

    public void setExpirationDateApplicable(boolean z) {
        this.isExpirationDateApplicable = z;
    }

    public void setHolderNameApplicable(boolean z) {
        this.isHolderNameApplicable = z;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setSecurityCodeApplicable(boolean z) {
        this.isSecurityCodeApplicable = z;
    }

    public void setTermsAndConditionsContent(MediaContent mediaContent) {
        this.termsAndConditionsContent = mediaContent;
    }

    public PreDigitizeResp(String str, String str2, List<SpError> list) {
        super(str, str2);
        setSpErrors(list);
    }
}
