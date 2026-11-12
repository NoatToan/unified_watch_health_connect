package com.baidu.ocr.sdk.model;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class IDCardResult extends ResponseResult {
    private Word address;
    private Word birthday;
    private int direction;
    private Word ethnic;
    private Word expiryDate;
    private Word gender;
    private String idCardSide;
    private Word idNumber;
    private String imageStatus;
    private Word issueAuthority;
    private Word name;
    private String riskType;
    private Word signDate;
    private int wordsResultNumber;

    public Word getAddress() {
        return this.address;
    }

    public Word getBirthday() {
        return this.birthday;
    }

    public int getDirection() {
        return this.direction;
    }

    public Word getEthnic() {
        return this.ethnic;
    }

    public Word getExpiryDate() {
        return this.expiryDate;
    }

    public Word getGender() {
        return this.gender;
    }

    public String getIdCardSide() {
        return this.idCardSide;
    }

    public Word getIdNumber() {
        return this.idNumber;
    }

    public String getImageStatus() {
        return this.imageStatus;
    }

    public Word getIssueAuthority() {
        return this.issueAuthority;
    }

    public Word getName() {
        return this.name;
    }

    public String getRiskType() {
        return this.riskType;
    }

    public Word getSignDate() {
        return this.signDate;
    }

    public int getWordsResultNumber() {
        return this.wordsResultNumber;
    }

    public void setAddress(Word word) {
        this.address = word;
    }

    public void setBirthday(Word word) {
        this.birthday = word;
    }

    public void setDirection(int i) {
        this.direction = i;
    }

    public void setEthnic(Word word) {
        this.ethnic = word;
    }

    public void setExpiryDate(Word word) {
        this.expiryDate = word;
    }

    public void setGender(Word word) {
        this.gender = word;
    }

    public void setIdCardSide(String str) {
        this.idCardSide = str;
    }

    public void setIdNumber(Word word) {
        this.idNumber = word;
    }

    public void setImageStatus(String str) {
        this.imageStatus = str;
    }

    public void setIssueAuthority(Word word) {
        this.issueAuthority = word;
    }

    public void setName(Word word) {
        this.name = word;
    }

    public void setRiskType(String str) {
        this.riskType = str;
    }

    public void setSignDate(Word word) {
        this.signDate = word;
    }

    public void setWordsResultNumber(int i) {
        this.wordsResultNumber = i;
    }

    public String toString() {
        if (TextUtils.isEmpty(this.idCardSide)) {
            return "";
        }
        if (!this.idCardSide.equals("front")) {
            if (!this.idCardSide.equals("back")) {
                return "";
            }
            return "IDCardResult back{, signDate=" + this.signDate + ", expiryDate=" + this.expiryDate + ", issueAuthority=" + this.issueAuthority + '}';
        }
        return "IDCardResult front{direction=" + this.direction + ", wordsResultNumber=" + this.wordsResultNumber + ", address=" + this.address + ", idNumber=" + this.idNumber + ", birthday=" + this.birthday + ", name=" + this.name + ", gender=" + this.gender + ", ethnic=" + this.ethnic + '}';
    }
}
