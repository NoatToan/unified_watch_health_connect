package com.xiaomi.hm.health.bodyfat.model;

import android.text.TextUtils;
import com.xiaomi.hm.health.databases.model.UserInfos;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class BFUserInfo implements Serializable {
    public static final int SYNC_OK = 0;
    public static final float TARGET_WEIGHT_DEFAULT = -1.0f;
    private static final String s = BFUserInfo.class.getSimpleName();
    private static final long serialVersionUID = 1;
    private String b;
    private String h;
    private long m;
    private long n;
    private long o;
    private int r;
    private String a = "";
    private String c = "";
    private int d = -1;
    private int e = -1;
    private float f = -1.0f;
    private float g = -1.0f;
    private String i = "";
    private String j = "";
    private String k = "";
    private int l = -1;
    private int p = 0;
    private transient boolean q = false;

    public static BFUserInfo getHMUserInfo(UserInfos userInfos) {
        if (userInfos == null) {
            return null;
        }
        BFUserInfo bFUserInfo = new BFUserInfo();
        bFUserInfo.a = userInfos.getAvatarPath() == null ? "" : userInfos.getAvatarPath();
        bFUserInfo.b = userInfos.getUserId();
        bFUserInfo.c = userInfos.getName() == null ? "" : userInfos.getName();
        bFUserInfo.d = userInfos.getGender() == null ? -1 : userInfos.getGender().intValue();
        bFUserInfo.e = userInfos.getHeight() != null ? userInfos.getHeight().intValue() : -1;
        bFUserInfo.f = userInfos.getWeight() == null ? -1.0f : userInfos.getWeight().floatValue();
        bFUserInfo.g = userInfos.getTargetWeight() != null ? userInfos.getTargetWeight().floatValue() : -1.0f;
        bFUserInfo.i = userInfos.getAvatarUrl() == null ? "" : userInfos.getAvatarUrl();
        bFUserInfo.j = userInfos.getBirthday() != null ? userInfos.getBirthday() : "";
        bFUserInfo.m = TextUtils.isEmpty(userInfos.getCreat_time()) ? 0L : Long.parseLong(userInfos.getCreat_time());
        bFUserInfo.n = TextUtils.isEmpty(userInfos.getLast_login_time()) ? 0L : Long.parseLong(userInfos.getLast_login_time());
        boolean z = false;
        bFUserInfo.p = userInfos.getSynced() == null ? 0 : userInfos.getSynced().intValue();
        if (userInfos.getDownloaded() != null && userInfos.getDownloaded().booleanValue()) {
            z = true;
        }
        bFUserInfo.q = z;
        return bFUserInfo;
    }

    public String getAvatar() {
        return this.i;
    }

    public String getAvatarPath() {
        return this.a;
    }

    public String getBirthday() {
        return this.j;
    }

    public long getCreatTime() {
        return this.m;
    }

    public int getGender() {
        return this.d;
    }

    public int getHeight() {
        return this.e;
    }

    public String getHmBirthday() {
        return this.k;
    }

    public long getLastLoginTime() {
        return this.n;
    }

    public long getLoginTime() {
        return this.o;
    }

    public int getMeasureMode() {
        return this.r;
    }

    public String getNickname() {
        return this.c;
    }

    public String getSignature() {
        return this.h;
    }

    public int getSynced() {
        return this.p;
    }

    public float getTargetWeight() {
        return this.g;
    }

    public void getUserInfos(UserInfos userInfos) {
        userInfos.setUserId(this.b);
        userInfos.setName(this.c);
        userInfos.setBirthday(this.j);
        userInfos.setAvatarUrl(this.i);
        userInfos.setAvatarPath(this.a);
        userInfos.setGender(Integer.valueOf(this.d));
        userInfos.setHeight(Integer.valueOf(this.e));
        userInfos.setWeight(Float.valueOf(this.f));
        userInfos.setTargetWeight(Float.valueOf(this.g));
        userInfos.setCreat_time(String.valueOf(this.m));
        userInfos.setLast_login_time(String.valueOf(this.n));
        userInfos.setSynced(Integer.valueOf(this.p));
        userInfos.setDownloaded(Boolean.valueOf(this.q));
    }

    public String getUserid() {
        return this.b;
    }

    public float getWeight() {
        return this.f;
    }

    public boolean isDownloaded() {
        return this.q;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.b) || this.d == -1 || TextUtils.isEmpty(this.j) || this.e == -1 || this.f == -1.0f) ? false : true;
    }

    public void setAvatar(String str) {
        this.i = str;
    }

    public void setAvatarPath(String str) {
        this.a = str;
    }

    public void setBirthday(String str) {
        this.j = str;
    }

    public void setCreatTime(long j) {
        this.m = j;
    }

    public void setDownloaded(boolean z) {
        this.q = z;
    }

    public void setGender(int i) {
        this.d = i;
    }

    public void setHeight(int i) {
        this.e = i;
    }

    public void setHmBirthday(String str) {
        this.k = str;
    }

    public void setLastLoginTime(long j) {
        this.n = j;
    }

    public void setLoginTime(long j) {
        this.o = j;
    }

    public void setMeasureMode(int i) {
        this.r = i;
    }

    public void setNickname(String str) {
        this.c = str;
    }

    public void setSignature(String str) {
        this.h = str;
    }

    public void setSynced(int i) {
        this.p = i;
    }

    public void setTargetWeight(float f) {
        this.g = f;
    }

    public void setUserid(String str) {
        this.b = str;
    }

    public void setWeight(float f) {
        this.f = f;
    }
}
