package com.huawei.openalliance.ad.views.interfaces;

/* JADX INFO: loaded from: classes12.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f21245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f21247c;
    private Integer d;
    private Integer e;

    public Integer e() {
        return this.e;
    }

    public Integer d() {
        return this.d;
    }

    public String c() {
        return this.f21247c;
    }

    public boolean b() {
        return this.f21246b;
    }

    public boolean a() {
        return this.f21245a;
    }

    public void a(Integer num) {
        this.e = num;
    }

    public b(boolean z, boolean z2, String str, int i) {
        this(z, z2, str);
        this.d = Integer.valueOf(i);
    }

    public b(boolean z, boolean z2, String str) {
        this.e = 0;
        this.f21245a = z;
        this.f21246b = z2;
        this.f21247c = str;
    }
}
