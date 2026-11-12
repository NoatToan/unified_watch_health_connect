package com.unicom.online.account.kernel;

/* JADX INFO: loaded from: classes20.dex */
public final class e {
    public static c i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31186c;
    public String d;
    public String e;
    public int f;
    public f g;
    public String h;

    public final String toString() {
        return "{result=" + this.f31184a + ", type=" + this.f31185b + ", ret_code='" + this.f31186c + "', apikey='" + this.d + "', seq='" + this.e + "', setTime=" + this.f + ", err_info=" + this.g + ", sdk_v='" + this.h + "', access_process=" + i + '}';
    }

    public static c a() {
        if (i == null) {
            i = new c();
        }
        return i;
    }
}
