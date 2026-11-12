package com.huami.watch.companion.agreement.bean;

import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huami.account.UserLegalInfoManager;

/* JADX INFO: loaded from: classes16.dex */
public class AgreementVersion implements Comparable<AgreementVersion> {

    @SerializedName(UserLegalInfoManager.KEY_LANGUAGE)
    private String country;
    private long createTime;
    private String groupId;
    private boolean isAgree;
    private boolean isSynced;
    private int status;
    private String targetDevice;
    private String type;
    private String version;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AgreementVersion)) {
            return super.equals(obj);
        }
        AgreementVersion agreementVersion = (AgreementVersion) obj;
        return getCountry().equals(agreementVersion.getCountry()) && getVersion().equals(agreementVersion.getVersion()) && getType().equals(agreementVersion.getType());
    }

    public String getCountry() {
        return this.country;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public int getStatus() {
        return this.status;
    }

    public String getTargetDevice() {
        return this.targetDevice;
    }

    public String getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean isAgree() {
        return this.isAgree;
    }

    public boolean isSynced() {
        return this.isSynced;
    }

    public void setAgree(boolean z) {
        this.isAgree = z;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setSynced(boolean z) {
        this.isSynced = z;
    }

    public void setTargetDevice(String str) {
        this.targetDevice = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return new Gson().toJson(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull AgreementVersion agreementVersion) {
        try {
            return (int) (Long.parseLong(this.version) - Long.parseLong(agreementVersion.getVersion()));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
