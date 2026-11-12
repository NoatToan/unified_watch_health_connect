package com.xiaomi.hm.health.webapi.account.model;

import androidx.annotation.Nullable;
import com.google.android.gms.fitness.data.Field;
import com.google.gson.annotations.SerializedName;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.network.base.model.Bean;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class HMBeanPersonInfo extends Bean {

    @SerializedName("hasBinded")
    private int a;

    @SerializedName("nick_name")
    private String b;

    @SerializedName("gender")
    private int c = -1;

    @SerializedName("height")
    private int d = -1;

    @SerializedName("weight")
    private float e = -1.0f;

    @SerializedName("weight_float")
    private float f;

    @SerializedName("signature")
    private String g;

    @SerializedName(WebAPI.PARAM_SHARE_INVITE_AVATAR)
    private String h;

    @SerializedName(Field.NUTRIENT_CALORIES)
    private String i;

    @SerializedName("distance")
    private String j;

    @SerializedName("birthday")
    private String k;

    @SerializedName("location")
    private String l;

    @SerializedName(HMAccountWebAPI.PARAM_BIND_INTRODUCTION)
    private String m;

    @SerializedName(HMAccountWebAPI.PARAM_BIND_PERSON_ALARM_CLOCK)
    private List<HMBeanAlarmClock> n;

    @SerializedName("creat_time")
    private Long o;

    @SerializedName("last_login_time")
    private Long p;

    @SerializedName("config")
    private HMBeanConfig q;

    @SerializedName("icon")
    private String r;

    @SerializedName("userid")
    private String s;

    @SerializedName("security")
    private String t;

    @SerializedName("logintime")
    private Long u;

    @Nullable
    @SerializedName(HMAccountWebAPI.PARAM_DEFAULT_FIELDS)
    private List<String> v;

    @Nullable
    @SerializedName("manual_audit_nick_name")
    private String w;

    @Nullable
    @SerializedName("manual_audit_avatar")
    private String x;

    public List<HMBeanAlarmClock> getAlarmClocks() {
        return this.n;
    }

    public String getAvatar() {
        return this.h;
    }

    public String getBirthday() {
        return this.k;
    }

    public String getCalories() {
        return this.i;
    }

    public HMBeanConfig getConfig() {
        return this.q;
    }

    public long getCreatTime() {
        Long l = this.o;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public List<String> getDefaultFields() {
        return this.v;
    }

    public String getDistance() {
        return this.j;
    }

    public int getGender() {
        return this.c;
    }

    public int getHasBinded() {
        return this.a;
    }

    public int getHeight() {
        return this.d;
    }

    public String getIcon() {
        return this.r;
    }

    public long getLastLoginTime() {
        Long l = this.p;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public String getLocation() {
        return this.l;
    }

    public long getLogintime() {
        Long l = this.u;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    @Nullable
    public String getManualAuditAvatar() {
        return this.x;
    }

    @Nullable
    public String getManualAuditNickName() {
        return this.w;
    }

    public String getNickname() {
        return this.b;
    }

    @Override // com.huami.network.base.model.Bean
    public String[] getParses() {
        return new String[]{"data"};
    }

    public String getSecurity() {
        return this.t;
    }

    public String getSignature() {
        return this.g;
    }

    public String getUserIntroduction() {
        return this.m;
    }

    public String getUserid() {
        return this.s;
    }

    public float getWeight() {
        float f = this.f;
        return f > 0.0f ? f : this.e;
    }

    public void setAlarmClocks(List<HMBeanAlarmClock> list) {
        this.n = list;
    }

    public void setAvatar(String str) {
        this.h = str;
    }

    public void setBirthday(String str) {
        this.k = str;
    }

    public void setCalories(String str) {
        this.i = str;
    }

    public void setConfig(HMBeanConfig hMBeanConfig) {
        this.q = hMBeanConfig;
    }

    public void setCreatTime(long j) {
        this.o = Long.valueOf(j);
    }

    public void setDefaultFields(List<String> list) {
        this.v = list;
    }

    public void setDistance(String str) {
        this.j = str;
    }

    public void setGender(int i) {
        this.c = i;
    }

    public void setHasBinded(int i) {
        this.a = i;
    }

    public void setHeight(int i) {
        this.d = i;
    }

    public void setIcon(String str) {
        this.r = str;
    }

    public void setLastLoginTime(long j) {
        this.p = Long.valueOf(j);
    }

    public void setLocation(String str) {
        this.l = str;
    }

    public void setLogintime(long j) {
        this.u = Long.valueOf(j);
    }

    public void setManualAuditAvatar(@Nullable String str) {
        this.x = str;
    }

    public void setManualAuditNickName(@Nullable String str) {
        this.w = str;
    }

    public void setNickname(String str) {
        this.b = str;
    }

    public void setSecurity(String str) {
        this.t = str;
    }

    public void setSignature(String str) {
        this.g = str;
    }

    public void setUserIntroduction(String str) {
        this.m = str;
    }

    public void setUserid(String str) {
        this.s = str;
    }

    public void setWeight(float f) {
        this.e = f;
    }
}
