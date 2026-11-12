package com.huawei.openalliance.ad;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class ir implements iy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WeakReference<com.huawei.openalliance.ad.linked.view.b> f19265a;

    @Override // com.huawei.openalliance.ad.iy
    public void a(final int i) {
        hw.b("LinkedVideoStreamListener", "stream error, code: %s", Integer.valueOf(i));
        final com.huawei.openalliance.ad.linked.view.b bVar = this.f19265a.get();
        if (bVar != null) {
            com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.ir.1
                @Override // java.lang.Runnable
                public void run() {
                    bVar.a(i);
                    bVar.g();
                }
            });
        }
    }

    public ir(com.huawei.openalliance.ad.linked.view.b bVar) {
        this.f19265a = new WeakReference<>(bVar);
    }
}
