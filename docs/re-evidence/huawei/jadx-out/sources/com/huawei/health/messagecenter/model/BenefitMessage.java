package com.huawei.health.messagecenter.model;

/* JADX INFO: loaded from: classes7.dex */
public class BenefitMessage {
    private String mBenefitData;
    private String mBenefitType;

    public BenefitMessage() {
    }

    public BenefitMessage(String str, String str2) {
        this.mBenefitType = str;
        this.mBenefitData = str2;
    }

    public String getBenefitType() {
        return this.mBenefitType;
    }

    public void setBenefitType(String str) {
        this.mBenefitType = str;
    }

    public String getBenefitData() {
        return this.mBenefitData;
    }

    public void setBenefitData(String str) {
        this.mBenefitData = str;
    }
}
