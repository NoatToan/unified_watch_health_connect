package com.miui.tsmclient.sesdk;

/* JADX INFO: loaded from: classes6.dex */
public class Sector {
    private boolean isEncrypted;
    private String mContent;
    private int mCountOfVerifiedKey;
    private int mIndex;
    private String mKeyA;
    private String mKeyB;

    public Sector() {
        this.mCountOfVerifiedKey = -1;
    }

    public String getContent() {
        return this.mContent;
    }

    public int getCountOfVerifiedKey() {
        return this.mCountOfVerifiedKey;
    }

    public int getIndex() {
        return this.mIndex;
    }

    public String getKeyA() {
        return this.mKeyA;
    }

    public String getKeyB() {
        return this.mKeyB;
    }

    public boolean isEncrypted() {
        return this.isEncrypted;
    }

    public void setContent(String str) {
        this.mContent = str;
    }

    public void setCountOfVerifiedKey(int i) {
        this.mCountOfVerifiedKey = i;
    }

    public void setEncrypted(boolean z) {
        this.isEncrypted = z;
    }

    public void setIndex(int i) {
        this.mIndex = i;
    }

    public void setKeyA(String str) {
        this.mKeyA = str;
    }

    public void setKeyB(String str) {
        this.mKeyB = str;
    }

    public Sector(int i, String str, int i2) {
        this.mIndex = i;
        this.mContent = str;
        this.mCountOfVerifiedKey = i2;
    }

    public Sector(int i, String str, String str2, String str3, boolean z) {
        this.mCountOfVerifiedKey = -1;
        this.mIndex = i;
        this.mKeyA = str;
        this.mKeyB = str2;
        this.mContent = str3;
        this.isEncrypted = z;
    }
}
