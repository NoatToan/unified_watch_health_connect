package com.xiaomi.ai.domain.phonecall.common;

/* JADX INFO: loaded from: classes7.dex */
public class NickNameInfo {
    private String name;
    private String nickName;

    public NickNameInfo() {
        this.nickName = "";
        this.name = "";
    }

    public String getName() {
        return this.name;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public NickNameInfo(NickNameInfo nickNameInfo) {
        this.nickName = nickNameInfo.nickName;
        this.name = nickNameInfo.name;
    }

    public NickNameInfo(String str, String str2) {
        this.nickName = str;
        this.name = str2;
    }
}
