package com.xiaomi.hm.health.databases.model.trainning;

import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.entity.EcgData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class Coach implements Serializable {
    private static final long serialVersionUID = 1;

    @SerializedName("gender")
    public Integer gender;

    @SerializedName("homePageUrl")
    public String homePageUrl;

    @SerializedName("huamiId")
    public String huamiId;

    @SerializedName("id")
    public Long id;

    @SerializedName("introduction")
    public String introduction;

    @SerializedName("name")
    public String name;

    @SerializedName("portrait")
    public String portrait;

    @SerializedName(EcgData.TIMESTAMP_SERVER_UPDATED)
    public Long updateTime;

    public Coach(String str, Long l, String str2, Integer num, String str3, String str4, Long l2, String str5) {
        this.gender = 0;
        this.huamiId = str;
        this.id = l;
        this.name = str2;
        this.gender = num;
        this.introduction = str3;
        this.portrait = str4;
        this.updateTime = l2;
        this.homePageUrl = str5;
    }

    public Integer getGender() {
        return this.gender;
    }

    public String getHomePageUrl() {
        return this.homePageUrl;
    }

    public String getHuamiId() {
        return this.huamiId;
    }

    public Long getId() {
        return this.id;
    }

    public String getIntroduction() {
        return this.introduction;
    }

    public String getName() {
        return this.name;
    }

    public String getPortrait() {
        return this.portrait;
    }

    public Long getUpdateTime() {
        return this.updateTime;
    }

    public void setGender(Integer num) {
        this.gender = num;
    }

    public void setHomePageUrl(String str) {
        this.homePageUrl = str;
    }

    public void setHuamiId(String str) {
        this.huamiId = str;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public void setIntroduction(String str) {
        this.introduction = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPortrait(String str) {
        this.portrait = str;
    }

    public void setUpdateTime(Long l) {
        this.updateTime = l;
    }

    public Coach() {
        this.gender = 0;
    }
}
