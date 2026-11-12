package com.xiaomi.push;

/* JADX INFO: loaded from: classes11.dex */
public enum ih {
    MISC_CONFIG(1),
    PLUGIN_CONFIG(2);


    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final int f111a;

    ih(int i) {
        this.f111a = i;
    }

    public int a() {
        return this.f111a;
    }

    public static ih a(int i) {
        if (i == 1) {
            return MISC_CONFIG;
        }
        if (i != 2) {
            return null;
        }
        return PLUGIN_CONFIG;
    }
}
