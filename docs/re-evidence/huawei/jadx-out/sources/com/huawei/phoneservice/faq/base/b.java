package com.huawei.phoneservice.faq.base;

/* JADX INFO: loaded from: classes13.dex */
public enum b {
    INIT_FAIL(-1, "NO INITIALIZED"),
    PARAMETER_ERROR(1, "PARAMETER EMPTY "),
    NO_ADDRESS(2, "NO ADDRESS "),
    NO_MODULE(3, "NO MODULE"),
    NO_GRS_ADDRESS(4, "NO GRS ADDRESS"),
    NO_ADDRESS_SERVICE(5, "NO ADDRESS BY SERVICE ERROR"),
    NO_MODULE_SERVICE(6, "NO MODULE BY SERVICE ERROR"),
    INIT_AGAIN(7, "INIT_AGAIN"),
    INIT_SUCCESS(0, "INIT SUCCESS");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f21536b;

    public boolean c() {
        int i = this.f21535a;
        return i == 0 || i == 3;
    }

    public String b() {
        return this.f21536b;
    }

    public int a() {
        return this.f21535a;
    }

    b(int i, String str) {
        this.f21535a = i;
        this.f21536b = str;
    }
}
