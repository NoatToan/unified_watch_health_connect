package com.huawei.openalliance.ad;

/* JADX INFO: loaded from: classes12.dex */
public class jo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19370a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19371b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f19372c = 0;
    private long d = 0;
    private String e;

    public long e() {
        return this.d;
    }

    public long d() {
        return this.f19372c;
    }

    public void c() {
        if (hw.a()) {
            hw.a(this.e, "onVideoEnd");
        }
        this.f19371b = false;
        this.f19370a = false;
        this.f19372c = 0L;
        this.d = 0L;
    }

    public void b() {
        if (hw.a()) {
            hw.a(this.e, "onBufferStart");
        }
        if (this.f19370a) {
            return;
        }
        this.f19370a = true;
        this.f19372c = System.currentTimeMillis();
    }

    public void a() {
        if (hw.a()) {
            hw.a(this.e, "onPlayStart");
        }
        if (this.f19371b) {
            return;
        }
        this.f19371b = true;
        this.d = System.currentTimeMillis();
    }

    public jo(String str) {
        this.e = "VideoMonitor_" + str;
    }
}
