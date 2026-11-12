package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.constant.AdLoadMode;
import com.huawei.openalliance.ad.inter.listeners.AdListener;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes41.dex */
public class oc extends jr<com.huawei.openalliance.ad.views.interfaces.l> implements op<com.huawei.openalliance.ad.views.interfaces.l> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gk f19816c;
    private AdListener d;
    private Context e;
    private com.huawei.openalliance.ad.analysis.c f;

    @Override // com.huawei.openalliance.ad.op
    public void h() {
        hw.a("SplashPresenter", "notifyAdDismissed");
        AdListener adListener = this.d;
        if (adListener != null) {
            adListener.onAdDismissed();
        }
        com.huawei.openalliance.ad.utils.as.i(this.e);
    }

    @Override // com.huawei.openalliance.ad.op
    public boolean c() {
        return com.huawei.openalliance.ad.utils.d.s(this.e);
    }

    @Override // com.huawei.openalliance.ad.op
    public boolean b() {
        if (com.huawei.openalliance.ad.utils.as.b(this.e)) {
            return true;
        }
        i();
        h();
        return false;
    }

    @Override // com.huawei.openalliance.ad.op
    public void a(String str, int i) {
        this.f.a(str, i);
    }

    @Override // com.huawei.openalliance.ad.op
    public void a(AdListener adListener) {
        this.d = adListener;
    }

    @Override // com.huawei.openalliance.ad.op
    public void a() {
        d().a((AdLoadMode) com.huawei.openalliance.ad.utils.dj.a(new Callable<AdLoadMode>() { // from class: com.huawei.openalliance.ad.oc.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public AdLoadMode call() {
                return oc.this.f19816c.aS();
            }
        }, AdLoadMode.CACHE));
    }

    private void i() {
        hw.c("SplashPresenter", "notifyNotSupport");
        AdListener adListener = this.d;
        if (adListener != null) {
            adListener.onAdFailedToLoad(1001);
        }
    }

    public oc(Context context, com.huawei.openalliance.ad.views.interfaces.l lVar) {
        a(lVar);
        this.f19816c = fp.b(context);
        this.e = context.getApplicationContext();
        this.f = new com.huawei.openalliance.ad.analysis.c(this.e);
    }
}
