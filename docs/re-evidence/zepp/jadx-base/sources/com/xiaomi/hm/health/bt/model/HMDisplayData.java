package com.xiaomi.hm.health.bt.model;

/* JADX INFO: loaded from: classes19.dex */
public class HMDisplayData {
    public static final byte TYPE_ALIPAY = 1;
    public static final byte TYPE_UNKNOWN = 0;
    public static final byte TYPE_WEATHER = 2;
    public boolean a;
    public byte b;
    public byte c;

    public HMDisplayData() {
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HMDisplayData hMDisplayData = (HMDisplayData) o;
        return this.a == hMDisplayData.a && this.b == hMDisplayData.b && this.c == hMDisplayData.c;
    }

    public byte getIndex() {
        return this.b;
    }

    public byte getType() {
        return this.c;
    }

    public int hashCode() {
        return ((((this.a ? 1 : 0) * 31) + this.b) * 31) + this.c;
    }

    public boolean isEnable() {
        return this.a;
    }

    public void setEnable(boolean enable) {
        this.a = enable;
    }

    public void setIndex(byte index) {
        this.b = index;
    }

    public void setType(byte type) {
        this.c = type;
    }

    public String toString() {
        return "HMDisplayData{enable=" + this.a + ", index=" + ((int) this.b) + ", type=" + ((int) this.c) + '}';
    }

    public HMDisplayData(boolean enable, byte index, byte type) {
        this.a = enable;
        this.b = index;
        this.c = type;
    }
}
