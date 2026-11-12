package com.unicom.online.account.kernel;

import java.util.HashMap;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f31190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f31191c;
    public long d;

    public final String toString() {
        return "{url':" + this.f31189a + "', startTime:" + this.f31190b + ", endTime:" + this.f31191c + '}';
    }

    public final void b() {
        this.f31189a = "";
        this.f31190b = 0L;
        this.f31191c = 0L;
        this.d = 0L;
    }

    public final HashMap<String, Object> a() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("url", this.f31189a);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31190b);
        map.put("startTime", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f31191c);
        map.put("endTime", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.d);
        map.put("forcedTime", sb3.toString());
        return map;
    }
}
