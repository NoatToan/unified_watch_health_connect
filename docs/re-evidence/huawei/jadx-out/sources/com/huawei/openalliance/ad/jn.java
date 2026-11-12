package com.huawei.openalliance.ad;

/* JADX INFO: loaded from: classes12.dex */
public class jn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19366a = "PRELOAD_" + hashCode();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19367b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f19368c;

    public interface a {
        void a();
    }

    public void b() {
        synchronized (this) {
            int i = this.f19367b - 1;
            this.f19367b = i;
            if (i < 0) {
                this.f19367b = 0;
            }
            hw.a("PreloadWebViewMonitor", "dec count: " + this.f19367b);
            if (this.f19367b <= 0) {
                com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.jn.1
                    @Override // java.lang.Runnable
                    public void run() {
                        jn.this.c();
                    }
                }, this.f19366a, 60000L);
            }
        }
    }

    public void a() {
        synchronized (this) {
            this.f19367b++;
            com.huawei.openalliance.ad.utils.dq.a(this.f19366a);
            hw.a("PreloadWebViewMonitor", "inc count: " + this.f19367b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        hw.a("PreloadWebViewMonitor", "unbindService");
        this.f19368c.a();
    }

    public jn(a aVar) {
        this.f19368c = aVar;
    }
}
