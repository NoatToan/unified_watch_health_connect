package com.xiaomi.hm.health.bt.profile.user;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class BirthDateExt implements Serializable {
    private static final long serialVersionUID = 1;
    private short a;
    private byte b;
    private byte c;

    public BirthDateExt(short year, byte month, byte day) {
        this.a = year;
        this.b = month;
        this.c = day;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BirthDateExt birthDateExt = (BirthDateExt) o;
        return this.a == birthDateExt.a && this.b == birthDateExt.b && this.c == birthDateExt.c;
    }

    public byte getDay() {
        return this.c;
    }

    public byte getMonth() {
        return this.b;
    }

    public short getYear() {
        return this.a;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        return "[year:" + ((int) this.a) + ",month:" + ((int) this.b) + ",day:" + ((int) this.c) + "]";
    }
}
