package com.xiaomi.hm.health.databases.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes20.dex */
public class Friend implements Parcelable {
    public static final Parcelable.Creator<Friend> CREATOR = new a();
    public String birthDay;
    public Integer calorie;
    public Integer careCountByHim;
    public Integer careCountByMe;
    public Long createTime;
    public Integer distance;
    public String icon;
    public Long lastDetailUpdateTime;
    public Long lastUpdateTime;
    public String remarkName;
    public Integer sleepTime;
    public Integer step;
    public Integer tz;
    public String uid;
    public String username;
    public Integer weight;

    public class a implements Parcelable.Creator<Friend> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Friend createFromParcel(Parcel parcel) {
            return new Friend(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Friend[] newArray(int i) {
            return new Friend[i];
        }
    }

    public Friend(Parcel parcel) {
        this.uid = "";
        this.username = "";
        this.icon = "";
        this.weight = 0;
        this.step = 0;
        this.sleepTime = 0;
        this.careCountByHim = 0;
        this.careCountByMe = 0;
        this.lastUpdateTime = 0L;
        this.lastDetailUpdateTime = 0L;
        this.remarkName = "";
        this.createTime = 0L;
        this.tz = 0;
        this.distance = 0;
        this.calorie = 0;
        this.birthDay = "";
        this.uid = parcel.readString();
        this.username = parcel.readString();
        this.icon = parcel.readString();
        this.weight = Integer.valueOf(parcel.readInt());
        this.step = Integer.valueOf(parcel.readInt());
        this.sleepTime = Integer.valueOf(parcel.readInt());
        this.careCountByHim = Integer.valueOf(parcel.readInt());
        this.careCountByMe = Integer.valueOf(parcel.readInt());
        this.lastUpdateTime = Long.valueOf(parcel.readLong());
        this.lastDetailUpdateTime = Long.valueOf(parcel.readLong());
        this.remarkName = parcel.readString();
        this.createTime = Long.valueOf(parcel.readLong());
        this.tz = Integer.valueOf(parcel.readInt());
        this.distance = Integer.valueOf(parcel.readInt());
        this.calorie = Integer.valueOf(parcel.readInt());
        this.birthDay = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBirthDay() {
        return this.birthDay;
    }

    public Integer getCalorie() {
        return this.calorie;
    }

    public Integer getCareCountByHim() {
        return this.careCountByHim;
    }

    public Integer getCareCountByMe() {
        return this.careCountByMe;
    }

    public Long getCreateTime() {
        return this.createTime;
    }

    public String getDisplayName() {
        String str = this.remarkName;
        return (str == null || "".equals(str)) ? this.username : this.remarkName;
    }

    public Integer getDistance() {
        return this.distance;
    }

    public String getIcon() {
        return this.icon;
    }

    public Long getLastDetailUpdateTime() {
        return this.lastDetailUpdateTime;
    }

    public Long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public String getRemarkName() {
        return this.remarkName;
    }

    public Integer getSleepTime() {
        return this.sleepTime;
    }

    public Integer getStep() {
        return this.step;
    }

    public Integer getTz() {
        return this.tz;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUsername() {
        return this.username;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setBirthDay(String str) {
        this.birthDay = str;
    }

    public void setCalorie(Integer num) {
        this.calorie = num;
    }

    public void setCareCountByHim(Integer num) {
        this.careCountByHim = num;
    }

    public void setCareCountByMe(Integer num) {
        this.careCountByMe = num;
    }

    public void setCreateTime(Long l) {
        this.createTime = l;
    }

    public void setDistance(Integer num) {
        this.distance = num;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setLastDetailUpdateTime(Long l) {
        this.lastDetailUpdateTime = l;
    }

    public void setLastUpdateTime(Long l) {
        this.lastUpdateTime = l;
    }

    public void setRemarkName(String str) {
        this.remarkName = str;
    }

    public void setSleepTime(Integer num) {
        this.sleepTime = num;
    }

    public void setStep(Integer num) {
        this.step = num;
    }

    public void setTz(Integer num) {
        this.tz = num;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public void setWeight(Integer num) {
        this.weight = num;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.username);
        parcel.writeString(this.icon);
        parcel.writeInt(this.weight.intValue());
        parcel.writeInt(this.step.intValue());
        parcel.writeInt(this.sleepTime.intValue());
        parcel.writeInt(this.careCountByHim.intValue());
        parcel.writeInt(this.careCountByMe.intValue());
        parcel.writeLong(this.lastUpdateTime.longValue());
        parcel.writeLong(this.lastDetailUpdateTime.longValue());
        parcel.writeString(this.remarkName);
        parcel.writeLong(this.createTime.longValue());
        parcel.writeInt(this.tz.intValue());
        parcel.writeInt(this.distance.intValue());
        parcel.writeInt(this.calorie.intValue());
        parcel.writeString(this.birthDay);
    }

    public Friend(String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l, Long l2, String str4, Long l3, Integer num6, Integer num7, Integer num8, String str5) {
        this.uid = "";
        this.username = "";
        this.icon = "";
        this.weight = 0;
        this.step = 0;
        this.sleepTime = 0;
        this.careCountByHim = 0;
        this.careCountByMe = 0;
        this.lastUpdateTime = 0L;
        this.lastDetailUpdateTime = 0L;
        this.remarkName = "";
        this.createTime = 0L;
        this.tz = 0;
        this.distance = 0;
        this.calorie = 0;
        this.birthDay = "";
        this.uid = str;
        this.username = str2;
        this.icon = str3;
        this.weight = num;
        this.step = num2;
        this.sleepTime = num3;
        this.careCountByHim = num4;
        this.careCountByMe = num5;
        this.lastUpdateTime = l;
        this.lastDetailUpdateTime = l2;
        this.remarkName = str4;
        this.createTime = l3;
        this.tz = num6;
        this.distance = num7;
        this.calorie = num8;
        this.birthDay = str5;
    }

    public Friend() {
        this.uid = "";
        this.username = "";
        this.icon = "";
        this.weight = 0;
        this.step = 0;
        this.sleepTime = 0;
        this.careCountByHim = 0;
        this.careCountByMe = 0;
        this.lastUpdateTime = 0L;
        this.lastDetailUpdateTime = 0L;
        this.remarkName = "";
        this.createTime = 0L;
        this.tz = 0;
        this.distance = 0;
        this.calorie = 0;
        this.birthDay = "";
    }
}
