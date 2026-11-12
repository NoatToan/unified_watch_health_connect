package com.service.mi.visa.entity;

import com.service.mi.wallet.entity.MediaContent;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class CardMetaData implements Serializable {
    private String backgroundColor;
    private String bankAppAddress;
    private String bankAppName;
    private String contactEmail;
    private String contactName;
    private String contactNumber;
    private String contactWebsite;
    private String foregroundColor;
    private String labelColor;
    private String longDescription;
    private List<MediaContent> mediaContents;
    private String privacyPolicyURL;
    private String shortDescription;
    private String termsAndConditionsID;
    private String termsAndConditionsURL;
    private String unsupportedCardVerificationTypes;
    private String unsupportedPresentationTypes;

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public String getBankAppAddress() {
        return this.bankAppAddress;
    }

    public String getBankAppName() {
        return this.bankAppName;
    }

    public String getContactEmail() {
        return this.contactEmail;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public String getContactWebsite() {
        return this.contactWebsite;
    }

    public String getForegroundColor() {
        return this.foregroundColor;
    }

    public String getLabelColor() {
        return this.labelColor;
    }

    public String getLongDescription() {
        return this.longDescription;
    }

    public List<MediaContent> getMediaContents() {
        return this.mediaContents;
    }

    public String getPrivacyPolicyURL() {
        return this.privacyPolicyURL;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    public String getTermsAndConditionsID() {
        return this.termsAndConditionsID;
    }

    public String getTermsAndConditionsURL() {
        return this.termsAndConditionsURL;
    }

    public String getUnsupportedCardVerificationTypes() {
        return this.unsupportedCardVerificationTypes;
    }

    public String getUnsupportedPresentationTypes() {
        return this.unsupportedPresentationTypes;
    }

    public void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public void setBankAppAddress(String str) {
        this.bankAppAddress = str;
    }

    public void setBankAppName(String str) {
        this.bankAppName = str;
    }

    public void setContactEmail(String str) {
        this.contactEmail = str;
    }

    public void setContactName(String str) {
        this.contactName = str;
    }

    public void setContactNumber(String str) {
        this.contactNumber = str;
    }

    public void setContactWebsite(String str) {
        this.contactWebsite = str;
    }

    public void setForegroundColor(String str) {
        this.foregroundColor = str;
    }

    public void setLabelColor(String str) {
        this.labelColor = str;
    }

    public void setLongDescription(String str) {
        this.longDescription = str;
    }

    public void setMediaContents(List<MediaContent> list) {
        this.mediaContents = list;
    }

    public void setPrivacyPolicyURL(String str) {
        this.privacyPolicyURL = str;
    }

    public void setShortDescription(String str) {
        this.shortDescription = str;
    }

    public void setTermsAndConditionsID(String str) {
        this.termsAndConditionsID = str;
    }

    public void setTermsAndConditionsURL(String str) {
        this.termsAndConditionsURL = str;
    }

    public void setUnsupportedCardVerificationTypes(String str) {
        this.unsupportedCardVerificationTypes = str;
    }

    public void setUnsupportedPresentationTypes(String str) {
        this.unsupportedPresentationTypes = str;
    }
}
