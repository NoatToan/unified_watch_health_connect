package com.xiaomi.push;

/* JADX INFO: loaded from: classes22.dex */
public enum dj {
    RegIdExpired(0),
    PackageUnregistered(1),
    Init(2);


    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final int f97a;

    dj(int i) {
        this.f97a = i;
    }

    public static dj a(int i) {
        if (i == 0) {
            return RegIdExpired;
        }
        if (i == 1) {
            return PackageUnregistered;
        }
        if (i != 2) {
            return null;
        }
        return Init;
    }

    public int a() {
        return this.f97a;
    }
}
