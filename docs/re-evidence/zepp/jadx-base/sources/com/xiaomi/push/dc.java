package com.xiaomi.push;

/* JADX INFO: loaded from: classes22.dex */
public enum dc {
    MISC_CONFIG(1),
    PLUGIN_CONFIG(2);


    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final int f71a;

    dc(int i) {
        this.f71a = i;
    }

    public static dc a(int i) {
        if (i == 1) {
            return MISC_CONFIG;
        }
        if (i != 2) {
            return null;
        }
        return PLUGIN_CONFIG;
    }

    public int a() {
        return this.f71a;
    }
}
