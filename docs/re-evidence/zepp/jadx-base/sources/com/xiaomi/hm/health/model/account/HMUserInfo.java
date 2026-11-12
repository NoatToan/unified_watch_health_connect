package com.xiaomi.hm.health.model.account;

import android.text.TextUtils;
import com.xiaomi.hm.health.databases.model.UserInfos;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class HMUserInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private int avatarScaleOfId;
    private long creatTime;
    private List<String> defaultFields;
    private long lastLoginTime;
    private long loginTime;
    private int measureMode;
    private String signature;
    private String userid;
    private String avatarPath = "";
    private String nickname = "";
    private int gender = -1;
    private int height = -1;
    private float weight = -1.0f;
    private float targetWeight = -1.0f;
    private String avatar = "";
    private String birthday = "";
    private String location = "";
    private String userIntroduction = "";
    private int age = -1;
    private int synced = 0;
    private transient boolean downloaded = false;

    private static Calendar dateFormat(String str) {
        try {
            Date date = new SimpleDateFormat("yy-MM", Locale.getDefault()).parse(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int getAgeByDate(String str) {
        int i;
        Calendar currentTime = HMPersonInfo.getCurrentTime();
        Calendar calendarDateFormat = dateFormat(str);
        if (calendarDateFormat != null && (i = currentTime.get(1) - calendarDateFormat.get(1)) >= 0) {
            return (i != 0 && currentTime.get(2) <= calendarDateFormat.get(2)) ? i - 1 : i;
        }
        return 24;
    }

    public static HMUserInfo getHMUserInfo(UserInfos userInfos) {
        if (userInfos == null) {
            return null;
        }
        HMUserInfo hMUserInfo = new HMUserInfo();
        hMUserInfo.avatarPath = userInfos.getAvatarPath() == null ? "" : userInfos.getAvatarPath();
        hMUserInfo.userid = userInfos.getUserId();
        hMUserInfo.nickname = userInfos.getName() == null ? "" : userInfos.getName();
        hMUserInfo.gender = userInfos.getGender() == null ? -1 : userInfos.getGender().intValue();
        hMUserInfo.height = userInfos.getHeight() != null ? userInfos.getHeight().intValue() : -1;
        hMUserInfo.weight = userInfos.getWeight() == null ? -1.0f : userInfos.getWeight().floatValue();
        hMUserInfo.targetWeight = userInfos.getTargetWeight() != null ? userInfos.getTargetWeight().floatValue() : -1.0f;
        hMUserInfo.avatar = userInfos.getAvatarUrl() == null ? "" : userInfos.getAvatarUrl();
        hMUserInfo.birthday = userInfos.getBirthday() == null ? "" : userInfos.getBirthday();
        hMUserInfo.location = userInfos.getLocation() == null ? "" : userInfos.getLocation();
        hMUserInfo.userIntroduction = userInfos.getUserIntroduction() != null ? userInfos.getUserIntroduction() : "";
        hMUserInfo.creatTime = TextUtils.isEmpty(userInfos.getCreat_time()) ? 0L : Long.valueOf(userInfos.getCreat_time()).longValue();
        hMUserInfo.lastLoginTime = TextUtils.isEmpty(userInfos.getLast_login_time()) ? 0L : Long.valueOf(userInfos.getLast_login_time()).longValue();
        hMUserInfo.synced = userInfos.getSynced() == null ? 0 : userInfos.getSynced().intValue();
        hMUserInfo.downloaded = userInfos.getDownloaded() != null ? userInfos.getDownloaded().booleanValue() : false;
        hMUserInfo.avatarScaleOfId = userInfos.getAvatarIdOfScale();
        hMUserInfo.measureMode = userInfos.getMeasureMode();
        hMUserInfo.defaultFields = UserInfoMapper.decodeDefaultField(userInfos.getDefaultFields());
        return hMUserInfo;
    }

    public int getAge() {
        return getAgeByDate(this.birthday);
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getAvatarPath() {
        return this.avatarPath;
    }

    public int getAvatarScaleOfId() {
        return this.avatarScaleOfId;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public long getCreatTime() {
        return this.creatTime;
    }

    public List<String> getDefaultFields() {
        return this.defaultFields;
    }

    public int getGender() {
        return this.gender;
    }

    public int getHeight() {
        return this.height;
    }

    public long getLastLoginTime() {
        return this.lastLoginTime;
    }

    public String getLocation() {
        return this.location;
    }

    public long getLoginTime() {
        return this.loginTime;
    }

    public int getMeasureMode() {
        return this.measureMode;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getSignature() {
        return this.signature;
    }

    public int getSynced() {
        return this.synced;
    }

    public float getTargetWeight() {
        return this.targetWeight;
    }

    public void getUserInfos(UserInfos userInfos) {
        userInfos.setUserId(this.userid);
        userInfos.setName(this.nickname);
        userInfos.setBirthday(this.birthday);
        userInfos.setAvatarUrl(this.avatar);
        userInfos.setAvatarPath(this.avatarPath);
        userInfos.setGender(Integer.valueOf(this.gender));
        userInfos.setHeight(Integer.valueOf(this.height));
        userInfos.setWeight(Float.valueOf(this.weight));
        userInfos.setTargetWeight(Float.valueOf(this.targetWeight));
        userInfos.setCreat_time(String.valueOf(this.creatTime));
        userInfos.setLast_login_time(String.valueOf(this.lastLoginTime));
        userInfos.setSynced(Integer.valueOf(this.synced));
        userInfos.setDownloaded(Boolean.valueOf(this.downloaded));
        userInfos.setLocation(this.location);
        userInfos.setUserIntroduction(this.userIntroduction);
        userInfos.setAvatarIdOfScale(this.avatarScaleOfId);
        userInfos.setMeasureMode(this.measureMode);
        userInfos.setDefaultFields(UserInfoMapper.encodeDefaultField(this.defaultFields));
    }

    public String getUserIntroduction() {
        return this.userIntroduction;
    }

    public String getUserid() {
        return this.userid;
    }

    public float getWeight() {
        return this.weight;
    }

    public boolean isDownloaded() {
        return this.downloaded;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.userid) || this.gender == -1 || TextUtils.isEmpty(this.birthday) || this.height == -1 || this.weight == -1.0f) ? false : true;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setAvatarPath(String str) {
        this.avatarPath = str;
    }

    public void setAvatarScaleOfId(int i) {
        this.avatarScaleOfId = i;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public void setCreatTime(long j) {
        this.creatTime = j;
    }

    public void setDefaultFields(List<String> list) {
        this.defaultFields = list;
    }

    public void setDownloaded(boolean z) {
        this.downloaded = z;
    }

    public void setGender(int i) {
        this.gender = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLastLoginTime(long j) {
        this.lastLoginTime = j;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setLoginTime(long j) {
        this.loginTime = j;
    }

    public void setMeasureMode(int i) {
        this.measureMode = i;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSynced(int i) {
        this.synced = i;
    }

    public void setTargetWeight(float f) {
        this.targetWeight = f;
    }

    public void setUserIntroduction(String str) {
        this.userIntroduction = str;
    }

    public void setUserid(String str) {
        this.userid = str;
    }

    public void setWeight(float f) {
        this.weight = f;
    }
}
