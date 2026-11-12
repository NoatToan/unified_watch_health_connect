package com.huawei.openalliance.ad;

import android.view.View;
import com.huawei.openalliance.ad.inter.data.LinkedSplashAd;
import com.huawei.openalliance.ad.inter.data.VideoInfo;

/* JADX INFO: loaded from: classes41.dex */
public class jl extends jp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f19360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f19361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected LinkedSplashAd f19362c;
    private a e;
    private long f;
    private int g;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;

    public interface a {
        void a();

        void a(long j, int i);

        void b();

        void b(long j, int i);

        void c();

        void d();

        void e();
    }

    public boolean g() {
        return m() >= b();
    }

    public void f() {
        a aVar;
        int iM = m();
        hw.b("PPSLinkedViewMonitor", "checkAutoPlay, visibleArea: %s", Integer.valueOf(iM));
        if (iM < b() || (aVar = this.e) == null) {
            return;
        }
        aVar.c();
    }

    public long e() {
        return this.i;
    }

    public int d() {
        return this.j;
    }

    protected int c() {
        return this.l;
    }

    public void b(long j, int i) {
        this.g = i;
        this.f = j;
    }

    void b(int i) {
        a aVar;
        if (i >= b()) {
            this.f19361b = false;
            if (this.f19360a) {
                return;
            }
            this.f19360a = true;
            a aVar2 = this.e;
            if (aVar2 != null) {
                aVar2.c();
                return;
            }
            return;
        }
        this.f19360a = false;
        if (i > 100 - c()) {
            if (this.f19361b && (aVar = this.e) != null) {
                aVar.e();
            }
            this.f19361b = false;
            return;
        }
        if (this.f19361b) {
            return;
        }
        this.f19361b = true;
        a aVar3 = this.e;
        if (aVar3 != null) {
            aVar3.d();
        }
    }

    protected int b() {
        return this.k;
    }

    public boolean a(long j) {
        return j >= this.f && this.j >= this.g;
    }

    public void a(LinkedSplashAd linkedSplashAd) {
        this.f19362c = linkedSplashAd;
        if (linkedSplashAd == null || linkedSplashAd.getVideoInfo() == null) {
            return;
        }
        VideoInfo videoInfo = linkedSplashAd.getVideoInfo();
        this.k = videoInfo.getAutoPlayAreaRatio();
        this.l = Math.max(100 - videoInfo.getAutoStopPlayAreaRatio(), 0);
    }

    @Override // com.huawei.openalliance.ad.jp
    protected void a(long j, int i) {
        r();
        a aVar = this.e;
        if (aVar != null) {
            aVar.b(j, i);
        }
        b(0);
    }

    @Override // com.huawei.openalliance.ad.jp
    protected void a(int i) {
        hw.b("PPSLinkedViewMonitor", "onUpdateViewShowArea, percentage: %s", Integer.valueOf(i));
        if (i > this.j) {
            this.j = i;
        }
        if (i >= this.g) {
            q();
        } else {
            r();
        }
        b(i);
    }

    @Override // com.huawei.openalliance.ad.jp
    protected void a() {
        a aVar = this.e;
        if (aVar != null) {
            aVar.b();
        }
    }

    private void r() {
        if (this.h) {
            hw.b("PPSLinkedViewMonitor", "viewShowEndRecord");
            this.h = false;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.i;
            if (hw.a()) {
                hw.a("PPSLinkedViewMonitor", "max visible area percentage: %d duration: %d", Integer.valueOf(this.j), Long.valueOf(jCurrentTimeMillis));
            }
            a aVar = this.e;
            if (aVar != null) {
                aVar.a(jCurrentTimeMillis, this.j);
            }
            this.j = 0;
        }
    }

    private void q() {
        if (this.h) {
            return;
        }
        hw.b("PPSLinkedViewMonitor", "viewShowStartRecord");
        this.h = true;
        this.i = System.currentTimeMillis();
        a aVar = this.e;
        if (aVar != null) {
            aVar.a();
        }
    }

    public jl(View view, a aVar) {
        super(view);
        this.f = 500L;
        this.g = 50;
        this.h = false;
        this.k = 100;
        this.l = 10;
        this.f19360a = false;
        this.f19361b = false;
        this.e = aVar;
        this.i = com.huawei.openalliance.ad.utils.as.c();
    }
}
