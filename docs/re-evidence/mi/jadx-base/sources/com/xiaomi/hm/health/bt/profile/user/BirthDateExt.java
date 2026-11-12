package com.xiaomi.hm.health.bt.profile.user;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class BirthDateExt implements Serializable {
    private static final long serialVersionUID = 1;
    private byte day;
    private byte month;
    private short year;

    public BirthDateExt(short s, byte b2, byte b3) {
        this.year = s;
        this.month = b2;
        this.day = b3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BirthDateExt birthDateExt = (BirthDateExt) obj;
        return this.year == birthDateExt.year && this.month == birthDateExt.month && this.day == birthDateExt.day;
    }

    public byte getDay() {
        return this.day;
    }

    public byte getMonth() {
        return this.month;
    }

    public short getYear() {
        return this.year;
    }

    public int hashCode() {
        return (((this.year * 31) + this.month) * 31) + this.day;
    }

    public String toString() {
        return "[year:" + ((int) this.year) + ",month:" + ((int) this.month) + ",day:" + ((int) this.day) + "]";
    }
}
