package com.xiaomi.hm.health.eventbus;

/* JADX INFO: loaded from: classes21.dex */
public class EventDetailBack {
    public static int HEART_RATE = 5;
    public static int SPORT = 3;
    public static int SPORT_DETAIL = 4;
    private int a;

    public EventDetailBack(int status) {
        this.a = 1;
        this.a = status;
    }

    public int getStatus() {
        return this.a;
    }
}
