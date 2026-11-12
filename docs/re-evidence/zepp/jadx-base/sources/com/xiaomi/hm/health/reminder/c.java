package com.xiaomi.hm.health.reminder;

/* JADX INFO: loaded from: classes21.dex */
class c {
    public static final String b = "LIGHT";
    public static final String c = "NORMAL";
    public static final String d = "HEAVY";
    private String a;

    public c(String mode) {
        this.a = "NORMAL";
        this.a = mode;
    }

    public String a() {
        return this.a;
    }

    public String toString() {
        return "Vibration{mode='" + this.a + "'}";
    }
}
