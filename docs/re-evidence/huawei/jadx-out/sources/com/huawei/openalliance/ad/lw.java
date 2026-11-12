package com.huawei.openalliance.ad;

import android.content.Context;
import android.view.View;
import com.huawei.openalliance.ad.db.bean.ContentRecord;

/* JADX INFO: loaded from: classes12.dex */
public class lw implements mh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private me f19505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private mq f19506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19507c;
    private boolean d = true;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;

    @Override // com.huawei.openalliance.ad.mv
    public void l() {
        hw.b("OmPresent", "resume");
        if (!this.d && this.e) {
            hw.c("OmPresent", "resume: Video completed");
            return;
        }
        me meVar = this.f19505a;
        if (meVar instanceof mg) {
            ((mg) meVar).l();
        }
    }

    @Override // com.huawei.openalliance.ad.mv
    public void k() {
        hw.b("OmPresent", "pause");
        if (!this.d && this.e) {
            hw.c("OmPresent", "pause: Video completed");
            return;
        }
        me meVar = this.f19505a;
        if (meVar instanceof mg) {
            ((mg) meVar).k();
        }
    }

    @Override // com.huawei.openalliance.ad.mv
    public void j() {
        hw.b("OmPresent", "skipped");
        me meVar = this.f19505a;
        if (meVar instanceof mg) {
            ((mg) meVar).j();
        }
    }

    @Override // com.huawei.openalliance.ad.mv
    public void i() {
        if (this.d || !this.e) {
            me meVar = this.f19505a;
            if (meVar instanceof mg) {
                ((mg) meVar).i();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.mv
    public void h() {
        if (this.d || !this.e) {
            me meVar = this.f19505a;
            if (meVar instanceof mg) {
                ((mg) meVar).h();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.mv
    public void g() {
        hw.b("OmPresent", "complete");
        if (this.d || !this.e) {
            me meVar = this.f19505a;
            if (meVar instanceof mg) {
                ((mg) meVar).g();
                this.e = true;
            }
        }
    }

    @Override // com.huawei.openalliance.ad.mu
    public void f() {
        hw.b("OmPresent", "load");
        if (this.d || !this.f) {
            me meVar = this.f19505a;
            if (meVar instanceof lz) {
                ((lz) meVar).f();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.mu
    public void e() {
        hw.b("OmPresent", "impressionOccurred");
        if (this.f) {
            return;
        }
        me meVar = this.f19505a;
        if (meVar instanceof lz) {
            ((lz) meVar).e();
            this.f = true;
        }
        me meVar2 = this.f19505a;
        if (meVar2 instanceof mg) {
            ((mg) meVar2).f();
            this.f = true;
        }
    }

    @Override // com.huawei.openalliance.ad.mq
    public void d() {
        mq mqVar = this.f19506b;
        if (mqVar == null) {
            return;
        }
        mqVar.d();
    }

    @Override // com.huawei.openalliance.ad.mq
    public void c() {
        mq mqVar = this.f19506b;
        if (mqVar == null) {
            hw.b("OmPresent", "AdSessionAgent is null");
        } else {
            mqVar.c();
        }
    }

    @Override // com.huawei.openalliance.ad.mv
    public void b(boolean z) {
        me meVar = this.f19505a;
        if (meVar instanceof mg) {
            ((mg) meVar).b(z);
        }
    }

    @Override // com.huawei.openalliance.ad.mv
    public void b(float f) {
        if (!this.d && this.e) {
            hw.c("OmPresent", "volumeChange: Video completed");
            return;
        }
        me meVar = this.f19505a;
        if (meVar instanceof mg) {
            ((mg) meVar).b(f);
        }
    }

    @Override // com.huawei.openalliance.ad.mh
    public void b() {
        hw.b("OmPresent", "release");
        if (this.g) {
            this.d = true;
            this.e = false;
            this.f = false;
            me meVar = this.f19505a;
            if (meVar != null) {
                meVar.b();
            }
            mq mqVar = this.f19506b;
            if (mqVar != null) {
                mqVar.d();
            }
            this.g = false;
        }
    }

    @Override // com.huawei.openalliance.ad.mh
    public void a(boolean z) {
        this.d = z;
    }

    @Override // com.huawei.openalliance.ad.mv
    public void a(my myVar) {
        if (!this.d && this.e) {
            hw.c("OmPresent", "loaded: Video completed");
            return;
        }
        if (this.h) {
            if (hw.a()) {
                hw.a("OmPresent", "Already loaded");
            }
        } else {
            me meVar = this.f19505a;
            if (meVar instanceof mg) {
                ((mg) meVar).a(myVar);
            }
            this.h = true;
        }
    }

    @Override // com.huawei.openalliance.ad.mv
    public void a(mw mwVar) {
        me meVar = this.f19505a;
        if (meVar instanceof mg) {
            ((mg) meVar).a(mwVar);
        }
    }

    @Override // com.huawei.openalliance.ad.mq
    public void a(View view, mp mpVar, String str) {
        mq mqVar = this.f19506b;
        if (mqVar == null) {
            return;
        }
        mqVar.a(view, mpVar, str);
    }

    @Override // com.huawei.openalliance.ad.mq
    public void a(View view) {
        if (this.f19507c) {
            return;
        }
        mq mqVar = this.f19506b;
        if (mqVar == null) {
            hw.b("OmPresent", "AdSessionAgent is null");
        } else {
            mqVar.a(view);
        }
    }

    @Override // com.huawei.openalliance.ad.mh
    public void a(Context context, ContentRecord contentRecord, lu luVar, boolean z) {
        if ((contentRecord != null ? contentRecord.b(context) : null) == null) {
            hw.b("OmPresent", "om is null, no initialization is required");
            return;
        }
        if (this.g) {
            return;
        }
        hw.b("OmPresent", "init omPresent");
        this.f19506b = ly.a(context, contentRecord, luVar, z);
        me meVarA = md.a(contentRecord);
        this.f19505a = meVarA;
        meVarA.a(this.f19506b);
        this.f19507c = z;
        this.g = true;
        this.h = false;
        this.f = false;
    }

    @Override // com.huawei.openalliance.ad.mv
    public void a(float f, boolean z) {
        hw.b("OmPresent", "start");
        if (!this.d && this.e) {
            hw.c("OmPresent", "start: Video completed");
            return;
        }
        me meVar = this.f19505a;
        if (meVar instanceof mg) {
            ((mg) meVar).a(f, z);
        }
    }

    @Override // com.huawei.openalliance.ad.mv
    public void a(float f) {
        if (hw.a()) {
            hw.a("OmPresent", "onProgress, isAllowRepeat= %s, isVideoComplete= %s", Boolean.valueOf(this.d), Boolean.valueOf(this.e));
        }
        if (this.d || !this.e) {
            me meVar = this.f19505a;
            if (meVar instanceof mg) {
                ((mg) meVar).a(f);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.mh
    public mq a() {
        return this.f19506b;
    }
}
