package com.huawei.agconnect.apms;

/* JADX INFO: loaded from: classes3.dex */
public final class jih {
    public String abc;
    public long bcd;
    public long cde = -1;
    public String def = "";
    public boolean efg = false;

    public jih(String str, long j) {
        this.abc = str;
        this.bcd = j;
    }

    public final void abc(long j) {
        this.cde = j;
    }

    public final long bcd() {
        return this.bcd;
    }

    public final long cde() {
        return this.cde;
    }

    public final String def() {
        return this.abc;
    }

    public final boolean efg() {
        if (this.efg) {
            return true;
        }
        if (this.cde == -1) {
            return false;
        }
        this.efg = true;
        return true;
    }

    public final void abc(String str) {
        this.def = str;
    }

    public final void abc(boolean z) {
        this.efg = z;
    }

    public final String abc() {
        return this.def;
    }
}
