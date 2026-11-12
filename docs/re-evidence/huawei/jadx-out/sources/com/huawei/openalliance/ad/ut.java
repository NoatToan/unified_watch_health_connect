package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.views.PPSDestView;
import com.huawei.openalliance.ad.views.PPSLinkedView;

/* JADX INFO: loaded from: classes41.dex */
public class ut {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected mh f20327a = new lw();

    public void i() {
        this.f20327a.k();
    }

    public void h() {
        this.f20327a.g();
    }

    public void g() {
        this.f20327a.h();
    }

    public void f() {
        this.f20327a.i();
    }

    public void e() {
        this.f20327a.l();
    }

    public void d() {
        this.f20327a.e();
    }

    public void c() {
        this.f20327a.j();
    }

    public void b(int i) {
        this.f20327a.b(i);
    }

    public void b() {
        this.f20327a.b();
    }

    public void a(PPSLinkedView pPSLinkedView, ContentRecord contentRecord, PPSDestView pPSDestView, Context context, com.huawei.openalliance.ad.views.aj ajVar) {
        this.f20327a.b();
        lw lwVar = new lw();
        this.f20327a = lwVar;
        lwVar.a(context, contentRecord, pPSDestView, true);
        mq mqVarA = this.f20327a.a();
        if (mqVarA != null) {
            mqVarA.a(ajVar, mp.VIDEO_CONTROLS, null);
            mqVarA.a(pPSLinkedView, mp.OTHER, null);
            this.f20327a.a(false);
            this.f20327a.b(true);
            this.f20327a.c();
            this.f20327a.a(my.a(0.0f, true, mx.STANDALONE));
        }
    }

    public void a(VideoInfo videoInfo) {
        if (this.f20327a == null || videoInfo == null) {
            return;
        }
        hw.b("LinkedSplashOmProxy", "om start");
        this.f20327a.a(videoInfo.getVideoDuration(), !"y".equals(videoInfo.getSoundSwitch()));
    }

    public void a(int i) {
        this.f20327a.a(i);
    }

    public void a() {
        this.f20327a.a(mw.CLICK);
    }
}
