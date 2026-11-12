package com.xiaomi.hm.health.databases.model;

/* JADX INFO: loaded from: classes20.dex */
public class FriendMessage {
    public Integer count;
    public String fromUid;
    public String fromUsername;
    public String icon;
    public Long id;
    public Integer status;
    public Integer type;
    public Long updateTime;

    public FriendMessage(Long l, String str, String str2, Long l2, Integer num, Integer num2, Integer num3, String str3) {
        this.id = l;
        this.fromUid = str;
        this.fromUsername = str2;
        this.updateTime = l2;
        this.type = num;
        this.count = num2;
        this.status = num3;
        this.icon = str3;
    }

    public Integer getCount() {
        return this.count;
    }

    public String getFromUid() {
        return this.fromUid;
    }

    public String getFromUsername() {
        return this.fromUsername;
    }

    public String getIcon() {
        return this.icon;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getType() {
        return this.type;
    }

    public Long getUpdateTime() {
        return this.updateTime;
    }

    public void setCount(Integer num) {
        this.count = num;
    }

    public void setFromUid(String str) {
        this.fromUid = str;
    }

    public void setFromUsername(String str) {
        this.fromUsername = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setUpdateTime(Long l) {
        this.updateTime = l;
    }

    public FriendMessage() {
    }
}
