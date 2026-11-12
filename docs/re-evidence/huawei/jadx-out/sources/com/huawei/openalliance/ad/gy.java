package com.huawei.openalliance.ad;

import android.app.Activity;
import android.view.View;
import com.huawei.openalliance.ad.activity.PPSActivity;
import com.huawei.openalliance.ad.views.PPSWebView;

/* JADX INFO: loaded from: classes12.dex */
public class gy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PPSActivity.b f18855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ha f18856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PPSWebView f18857c;
    private js d;

    public js f() {
        return this.d;
    }

    public void e() {
        js jsVar = this.d;
        if (jsVar instanceof com.huawei.openalliance.ad.linked.view.c) {
            ((com.huawei.openalliance.ad.linked.view.c) jsVar).e();
        }
    }

    public void d() {
        js jsVar = this.d;
        if (jsVar instanceof com.huawei.openalliance.ad.linked.view.c) {
            ((com.huawei.openalliance.ad.linked.view.c) jsVar).b();
        } else if (jsVar instanceof com.huawei.openalliance.ad.linked.view.b) {
            ((com.huawei.openalliance.ad.linked.view.b) jsVar).resumeView();
        }
    }

    public void c() {
        js jsVar = this.d;
        if (jsVar instanceof com.huawei.openalliance.ad.linked.view.c) {
            ((com.huawei.openalliance.ad.linked.view.c) jsVar).c();
        } else if (jsVar instanceof com.huawei.openalliance.ad.linked.view.b) {
            ((com.huawei.openalliance.ad.linked.view.b) jsVar).pauseView();
        }
    }

    public void b() {
        js jsVar = this.d;
        if (jsVar instanceof com.huawei.openalliance.ad.linked.view.c) {
            ((com.huawei.openalliance.ad.linked.view.c) jsVar).d();
        }
    }

    public void a(js jsVar) {
        this.d = jsVar;
    }

    public void a(PPSActivity.b bVar) {
        this.f18855a = bVar;
    }

    public void a() {
        hw.a("LinkedLandVideoViewAdapter", "destroy adapter");
        js jsVar = this.d;
        if (jsVar instanceof com.huawei.openalliance.ad.linked.view.c) {
            ((com.huawei.openalliance.ad.linked.view.c) jsVar).a();
        }
    }

    public View a(Activity activity) {
        ha haVar = this.f18856b;
        if (haVar == null) {
            return this.f18857c;
        }
        if (!haVar.l() || !this.f18856b.m() || com.huawei.openalliance.ad.utils.dk.a(activity)) {
            return this.f18857c;
        }
        ha haVar2 = this.f18856b;
        if (haVar2 instanceof gz) {
            js jsVar = this.d;
            if ((jsVar instanceof com.huawei.openalliance.ad.linked.view.c) && this.f18857c != null) {
                com.huawei.openalliance.ad.linked.view.c cVar = (com.huawei.openalliance.ad.linked.view.c) jsVar;
                cVar.a(haVar2);
                cVar.a(this.f18857c);
                g();
                return cVar;
            }
        }
        return this.f18857c;
    }

    private void g() {
        js jsVar = this.d;
        if (jsVar instanceof com.huawei.openalliance.ad.linked.view.c) {
            ((com.huawei.openalliance.ad.linked.view.c) jsVar).setPlayModeChangeListener(this.f18855a);
        }
    }

    public gy(ha haVar, js jsVar, PPSWebView pPSWebView) {
        this.f18856b = haVar;
        this.d = jsVar;
        this.f18857c = pPSWebView;
    }
}
