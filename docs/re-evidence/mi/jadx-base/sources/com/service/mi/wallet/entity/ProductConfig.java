package com.service.mi.wallet.entity;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class ProductConfig implements Serializable {
    private MediaContent brandLogoMediaContents;
    private MediaContent cardBackgroundCombinedMediaContents;
    private MediaContent cardBackgroundMediaContents;
    private MediaContent coBrandLogoMediaContents;
    private String coBrandName;
    private String customerServiceEmai;
    private String customerServicePhoneNumber;
    private String customerServiceUrl;
    private String foregroundColor;
    private MediaContent iconAssetMediaContents;
    private boolean isCoBranded;
    private MediaContent issuerLogoMediaContents;
    private IssuerMobileApp issuerMobileApp;
    private String issuerName;
    private String onlineBankingLoginUrl;
    private String privacyPolicyUrl;
    private String shortDescription;
    private String termsAndConditionsUrl;

    public MediaContent getBrandLogoMediaContents() {
        return this.brandLogoMediaContents;
    }

    public MediaContent getCardBackgroundCombinedMediaContents() {
        return this.cardBackgroundCombinedMediaContents;
    }

    public MediaContent getCardBackgroundMediaContents() {
        return this.cardBackgroundMediaContents;
    }

    public MediaContent getCoBrandLogoMediaContents() {
        return this.coBrandLogoMediaContents;
    }

    public String getCoBrandName() {
        return this.coBrandName;
    }

    public String getCustomerServiceEmai() {
        return this.customerServiceEmai;
    }

    public String getCustomerServicePhoneNumber() {
        return this.customerServicePhoneNumber;
    }

    public String getCustomerServiceUrl() {
        return this.customerServiceUrl;
    }

    public String getForegroundColor() {
        return this.foregroundColor;
    }

    public MediaContent getIconAssetMediaContents() {
        return this.iconAssetMediaContents;
    }

    public MediaContent getIssuerLogoMediaContents() {
        return this.issuerLogoMediaContents;
    }

    public IssuerMobileApp getIssuerMobileApp() {
        return this.issuerMobileApp;
    }

    public String getIssuerName() {
        return this.issuerName;
    }

    public String getOnlineBankingLoginUrl() {
        return this.onlineBankingLoginUrl;
    }

    public String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    public String getTermsAndConditionsUrl() {
        return this.termsAndConditionsUrl;
    }

    public boolean isCoBranded() {
        return this.isCoBranded;
    }

    public void setBrandLogoMediaContents(MediaContent mediaContent) {
        this.brandLogoMediaContents = mediaContent;
    }

    public void setCardBackgroundCombinedMediaContents(MediaContent mediaContent) {
        this.cardBackgroundCombinedMediaContents = mediaContent;
    }

    public void setCardBackgroundMediaContents(MediaContent mediaContent) {
        this.cardBackgroundMediaContents = mediaContent;
    }

    public void setCoBrandLogoMediaContents(MediaContent mediaContent) {
        this.coBrandLogoMediaContents = mediaContent;
    }

    public void setCoBrandName(String str) {
        this.coBrandName = str;
    }

    public void setCoBranded(boolean z) {
        this.isCoBranded = z;
    }

    public void setCustomerServiceEmai(String str) {
        this.customerServiceEmai = str;
    }

    public void setCustomerServicePhoneNumber(String str) {
        this.customerServicePhoneNumber = str;
    }

    public void setCustomerServiceUrl(String str) {
        this.customerServiceUrl = str;
    }

    public void setForegroundColor(String str) {
        this.foregroundColor = str;
    }

    public void setIconAssetMediaContents(MediaContent mediaContent) {
        this.iconAssetMediaContents = mediaContent;
    }

    public void setIssuerLogoMediaContents(MediaContent mediaContent) {
        this.issuerLogoMediaContents = mediaContent;
    }

    public void setIssuerMobileApp(IssuerMobileApp issuerMobileApp) {
        this.issuerMobileApp = issuerMobileApp;
    }

    public void setIssuerName(String str) {
        this.issuerName = str;
    }

    public void setOnlineBankingLoginUrl(String str) {
        this.onlineBankingLoginUrl = str;
    }

    public void setPrivacyPolicyUrl(String str) {
        this.privacyPolicyUrl = str;
    }

    public void setShortDescription(String str) {
        this.shortDescription = str;
    }

    public void setTermsAndConditionsUrl(String str) {
        this.termsAndConditionsUrl = str;
    }
}
