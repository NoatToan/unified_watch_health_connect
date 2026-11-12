package com.xiaomi.hm.health.bt.model;

import com.xiaomi.hm.health.bt.profile.user.BirthDateExt;
import com.xiaomi.hm.health.bt.profile.user.GenderExt;
import java.io.Serializable;
import java.util.Calendar;

/* JADX INFO: loaded from: classes19.dex */
public class UserInfoExt implements Serializable {
    public static final byte DEFAULT_INDEX = 0;
    private static final long n = -1;
    private static final long serialVersionUID = 1;
    private String a;
    private BirthDateExt b;
    private GenderExt c;
    private short d;
    private short e;
    private float f;
    private long g;
    private long h;
    private byte[] i;
    private byte j;
    private int k;
    private String l;
    private short m;

    public UserInfoExt() {
        this.a = null;
        this.b = new BirthDateExt((short) 1990, (byte) 10, (byte) 1);
        GenderExt genderExt = GenderExt.MALE;
        this.c = genderExt;
        this.h = -1L;
        this.k = 8000;
        this.l = null;
        this.m = (short) 1;
        this.d = (short) 175;
        this.e = (short) 65;
        this.c = genderExt;
        this.b = new BirthDateExt((short) 1985, (byte) 10, (byte) 1);
        this.g = 170420175L;
        this.i = "test".getBytes();
        this.j = (byte) 0;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserInfoExt userInfoExt = (UserInfoExt) o;
        return this.d == userInfoExt.d && this.e == userInfoExt.e && this.f == userInfoExt.f && this.g == userInfoExt.g && this.b.equals(userInfoExt.b) && this.c.getValue() == userInfoExt.c.getValue();
    }

    public int getAge() {
        return Calendar.getInstance().get(1) - this.b.getYear();
    }

    public String getAlias() {
        return new String(this.i);
    }

    public BirthDateExt getBirthDate() {
        return this.b;
    }

    public GenderExt getGender() {
        return this.c;
    }

    public int getGoal() {
        return this.k;
    }

    public short getHeight() {
        return this.d;
    }

    public long getHuamiId() {
        return this.h;
    }

    public short getIdc() {
        return this.m;
    }

    public String getNickName() {
        return this.a;
    }

    public String getRegisterRegion() {
        return this.l;
    }

    public byte getType() {
        return this.j;
    }

    public long getUid() {
        return this.g;
    }

    public short getWeight() {
        return this.e;
    }

    public float getWeightFloat() {
        return this.f;
    }

    public int hashCode() {
        return (((((((this.b.hashCode() * 31) + this.c.getValue()) * 31) + this.d) * 31) + this.e) * 31) + ((int) this.g);
    }

    public boolean isHuamiIdValid() {
        return this.h != -1;
    }

    public void setAlias(String alias) {
        this.i = alias.getBytes();
    }

    public void setBirthDate(BirthDateExt date) {
        this.b = date;
    }

    public void setGender(GenderExt gender) {
        this.c = gender;
    }

    public void setGoal(int goal) {
        this.k = goal;
    }

    public void setHeight(short height) {
        this.d = height;
    }

    public void setHuamiId(long huamiId) {
        this.h = huamiId;
    }

    public void setIdc(short idc) {
        this.m = idc;
    }

    public void setNickName(String nickName) {
        this.a = nickName;
    }

    public void setRegisterRegion(String registerRegion) {
        this.l = registerRegion;
    }

    public void setType(byte type) {
        this.j = type;
    }

    public void setUid(long uid) {
        this.g = uid;
    }

    public void setWeight(short weight) {
        this.e = weight;
    }

    public void setWeightFloat(float weightFloat) {
        this.f = weightFloat;
    }

    public UserInfoExt(long uid, short height, short weight, GenderExt gender, BirthDateExt birthDate) {
        this.a = null;
        this.b = new BirthDateExt((short) 1990, (byte) 10, (byte) 1);
        this.c = GenderExt.MALE;
        this.h = -1L;
        this.k = 8000;
        this.l = null;
        this.m = (short) 1;
        this.g = uid;
        this.d = height;
        this.e = weight;
        this.f = weight;
        this.c = gender;
        this.b = birthDate;
    }
}
