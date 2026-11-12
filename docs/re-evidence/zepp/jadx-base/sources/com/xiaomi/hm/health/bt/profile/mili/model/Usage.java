package com.xiaomi.hm.health.bt.profile.mili.model;

import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes18.dex */
public final class Usage {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public Usage(int wake, int vibrate, int light, int conn, int adv) {
        this.a = wake;
        this.b = vibrate;
        this.c = light;
        this.d = conn;
        this.e = adv;
    }

    public String toString() {
        return "[[[ " + Usage.class.getSimpleName() + " ]]]\n     wake: " + this.a + "ms\n  vibrate: " + this.b + "ms\n    light: " + this.c + "ms\n     conn: " + this.d + "s\n      adv: " + this.e + SOAP.XMLNS;
    }
}
