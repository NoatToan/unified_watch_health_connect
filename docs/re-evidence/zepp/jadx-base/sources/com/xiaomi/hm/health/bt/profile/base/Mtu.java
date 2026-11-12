package com.xiaomi.hm.health.bt.profile.base;

/* JADX INFO: loaded from: classes11.dex */
public class Mtu {
    public static final int APP_MTU_DEFAULT = 20;
    public static final int ATT_HEADER_SIZE = 3;
    public static final int ATT_MTU_MAX = 247;
    public static final int ATT_MTU_MIN = 23;
    private static final int b = 244;
    private static final int c = 20;
    private int a;

    public Mtu(int appMtu) {
        this.a = 20;
        this.a = appMtu;
    }

    public static Mtu createDefault() {
        return new Mtu(20);
    }

    public synchronized void resetMtu() {
        this.a = 20;
    }

    public synchronized void setAttMtuSize(int size) {
        if (size < 23 || size > 247) {
            return;
        }
        this.a = size - 3;
    }

    public synchronized int size() {
        return this.a;
    }
}
