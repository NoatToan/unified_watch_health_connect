package com.huawei.openalliance.ad;

/* JADX INFO: loaded from: classes12.dex */
public class vt implements com.huawei.openalliance.ad.views.interfaces.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.huawei.openalliance.ad.views.interfaces.k f21482a;

    @Override // com.huawei.openalliance.ad.views.interfaces.z
    public void a(final int i) {
        com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.vt.2
            @Override // java.lang.Runnable
            public void run() {
                if (i == 100) {
                    vt.this.f21482a.c(false);
                }
            }
        });
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.z
    public void a() {
        com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.vt.1
            @Override // java.lang.Runnable
            public void run() {
                vt.this.f21482a.c(true);
            }
        });
    }

    public vt(com.huawei.openalliance.ad.views.interfaces.k kVar) {
        this.f21482a = kVar;
    }
}
