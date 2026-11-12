package com.tsmclient.smartcard.model;

/* JADX INFO: loaded from: classes6.dex */
public class SmartCardInfo {
    public static final int ISSUABLE = 1;
    public static final int UNISSUABLE = 0;
    protected String mCardCode;
    protected String mCardId;
    protected String mCardLogoPath;
    protected String mCardName;
    protected int mIssuable = 0;

    public String getCardCode() {
        return this.mCardCode;
    }

    public String getCardId() {
        return this.mCardId;
    }

    public String getCardLogo() {
        return this.mCardLogoPath;
    }

    public String getCardName() {
        return this.mCardName;
    }

    public int getIssuable() {
        return this.mIssuable;
    }

    public void setCardCode(String str) {
        this.mCardCode = str;
    }

    public void setCardId(String str) {
        this.mCardId = str;
    }

    public void setCardLogo(String str) {
        this.mCardLogoPath = str;
    }

    public void setCardName(String str) {
        this.mCardName = str;
    }

    public void setIssuable(int i) {
        this.mIssuable = i;
    }
}
