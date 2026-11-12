package com.xiaomi.hm.health.bt.model;

import com.xiaomi.hm.health.bt.profile.user.BirthDateExt;
import com.xiaomi.hm.health.bt.profile.user.GenderExt;
import java.io.Serializable;
import java.util.Calendar;

/* JADX INFO: loaded from: classes11.dex */
public class UserInfoExt implements Serializable {
    public static final byte DEFAULT_INDEX = 0;
    private static final long INVALID_HUAMI_ID = -1;
    private static final long serialVersionUID = 1;
    private byte[] alias;
    private BirthDateExt date;
    private GenderExt gender;
    private int goal;
    private short height;
    private long huamiId;
    private short idc;
    private String nickName = null;
    private String registerRegion;
    private byte type;
    private long uid;
    private short weight;
    private float weightFloat;

    public UserInfoExt() {
        this.date = new BirthDateExt((short) 1990, (byte) 10, (byte) 1);
        GenderExt genderExt = GenderExt.MALE;
        this.huamiId = -1L;
        this.goal = 8000;
        this.registerRegion = null;
        this.idc = (short) 1;
        this.height = (short) 175;
        this.weight = (short) 65;
        this.gender = genderExt;
        this.date = new BirthDateExt((short) 1985, (byte) 10, (byte) 1);
        this.uid = 170420175L;
        this.alias = "test".getBytes();
        this.type = (byte) 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserInfoExt userInfoExt = (UserInfoExt) obj;
        return this.height == userInfoExt.height && this.weight == userInfoExt.weight && this.weightFloat == userInfoExt.weightFloat && this.uid == userInfoExt.uid && this.date.equals(userInfoExt.date) && this.gender.getValue() == userInfoExt.gender.getValue();
    }

    public int getAge() {
        return Calendar.getInstance().get(1) - this.date.getYear();
    }

    public String getAlias() {
        return new String(this.alias);
    }

    public BirthDateExt getBirthDate() {
        return this.date;
    }

    public GenderExt getGender() {
        return this.gender;
    }

    public int getGoal() {
        return this.goal;
    }

    public short getHeight() {
        return this.height;
    }

    public long getHuamiId() {
        return this.huamiId;
    }

    public short getIdc() {
        return this.idc;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getRegisterRegion() {
        return this.registerRegion;
    }

    public byte getType() {
        return this.type;
    }

    public long getUid() {
        return this.uid;
    }

    public short getWeight() {
        return this.weight;
    }

    public float getWeightFloat() {
        return this.weightFloat;
    }

    public int hashCode() {
        return (((((((this.date.hashCode() * 31) + this.gender.getValue()) * 31) + this.height) * 31) + this.weight) * 31) + ((int) this.uid);
    }

    public boolean isHuamiIdValid() {
        return this.huamiId != -1;
    }

    public void setAlias(String str) {
        this.alias = str.getBytes();
    }

    public void setBirthDate(BirthDateExt birthDateExt) {
        this.date = birthDateExt;
    }

    public void setGender(GenderExt genderExt) {
        this.gender = genderExt;
    }

    public void setGoal(int i) {
        this.goal = i;
    }

    public void setHeight(short s) {
        this.height = s;
    }

    public void setHuamiId(long j) {
        this.huamiId = j;
    }

    public void setIdc(short s) {
        this.idc = s;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setRegisterRegion(String str) {
        this.registerRegion = str;
    }

    public void setType(byte b2) {
        this.type = b2;
    }

    public void setUid(long j) {
        this.uid = j;
    }

    public void setWeight(short s) {
        this.weight = s;
    }

    public void setWeightFloat(float f) {
        this.weightFloat = f;
    }

    public UserInfoExt(long j, short s, short s2, GenderExt genderExt, BirthDateExt birthDateExt) {
        this.date = new BirthDateExt((short) 1990, (byte) 10, (byte) 1);
        GenderExt genderExt2 = GenderExt.MALE;
        this.huamiId = -1L;
        this.goal = 8000;
        this.registerRegion = null;
        this.idc = (short) 1;
        this.uid = j;
        this.height = s;
        this.weight = s2;
        this.weightFloat = s2;
        this.gender = genderExt;
        this.date = birthDateExt;
    }
}
