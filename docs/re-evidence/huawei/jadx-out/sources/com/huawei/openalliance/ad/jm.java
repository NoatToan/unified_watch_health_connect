package com.huawei.openalliance.ad;

import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public class jm extends jp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f19363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f19364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19365c;
    private boolean e;
    private long f;
    private int g;

    public interface a {
        void a();

        void a(long j, int i);

        void b();

        void b(long j, int i);
    }

    public long d() {
        return this.f;
    }

    public int c() {
        return this.g;
    }

    public void b(long j, int i) {
        this.f19365c = i;
        this.f19364b = j;
    }

    public void b() {
        this.f19365c = 50;
        this.f19364b = 500L;
    }

    public boolean a(long j) {
        return j >= this.f19364b && this.g >= this.f19365c;
    }

    @Override // com.huawei.openalliance.ad.jp
    protected void a(long j, int i) {
        f();
        a aVar = this.f19363a;
        if (aVar != null) {
            aVar.b(j, i);
        }
    }

    @Override // com.huawei.openalliance.ad.jp
    protected void a(int i) {
        if (i > this.g) {
            this.g = i;
        }
        if (i >= this.f19365c) {
            e();
        } else {
            f();
        }
    }

    @Override // com.huawei.openalliance.ad.jp
    protected void a() {
        a aVar = this.f19363a;
        if (aVar != null) {
            aVar.b();
        }
    }

    private void f() {
        if (this.e) {
            hw.b("PPSNativeViewMonitor", "viewShowEndRecord");
            this.e = false;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f;
            if (hw.a()) {
                hw.a("PPSNativeViewMonitor", "max visible area percentage: %d duration: %d", Integer.valueOf(this.g), Long.valueOf(jCurrentTimeMillis));
            }
            a aVar = this.f19363a;
            if (aVar != null) {
                aVar.a(jCurrentTimeMillis, this.g);
            }
            this.g = 0;
        }
    }

    private void e() {
        if (this.e) {
            return;
        }
        hw.b("PPSNativeViewMonitor", "viewShowStartRecord");
        this.e = true;
        this.f = System.currentTimeMillis();
        a aVar = this.f19363a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public jm(View view, a aVar) {
        super(view);
        this.f19364b = 500L;
        this.f19365c = 50;
        this.e = false;
        this.f19363a = aVar;
        this.f = com.huawei.openalliance.ad.utils.as.c();
    }
}
