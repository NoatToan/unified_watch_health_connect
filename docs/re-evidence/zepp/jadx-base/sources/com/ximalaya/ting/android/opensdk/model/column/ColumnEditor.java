package com.ximalaya.ting.android.opensdk.model.column;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes22.dex */
public class ColumnEditor {

    @SerializedName("avatar_url")
    private String avatarUrl;

    @SerializedName("nickname")
    private String nickName;

    @SerializedName("personal_signature")
    private String personalsignature;
    private long uid;

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getPersonalsignature() {
        return this.personalsignature;
    }

    public long getUid() {
        return this.uid;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setPersonalsignature(String str) {
        this.personalsignature = str;
    }

    public void setUid(long j) {
        this.uid = j;
    }

    public String toString() {
        return "ColumnEditor [uid=" + this.uid + ", nickName=" + this.nickName + ", avatarUrl=" + this.avatarUrl + ", personalsignature=" + this.personalsignature + "]";
    }
}
