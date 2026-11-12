package com.huawei.openalliance.ad;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes41.dex */
public class nq extends np<com.huawei.openalliance.ad.views.interfaces.i> implements og {
    @Override // com.huawei.openalliance.ad.np
    protected void b(String str) {
        ((com.huawei.openalliance.ad.views.interfaces.i) d()).d();
        hw.b("PPSImageViewPresenter", "onMaterialLoaded - begin to load image");
        com.huawei.openalliance.ad.utils.bd.a(this.f19766c, str, new com.huawei.openalliance.ad.utils.bd.a() { // from class: com.huawei.openalliance.ad.nq.1
            @Override // com.huawei.openalliance.ad.utils.bd.a
            public void a(final Drawable drawable) {
                hw.b("PPSImageViewPresenter", "onMaterialLoaded - image load success");
                com.huawei.openalliance.ad.utils.dc.a(nq.this.f19766c.getApplicationContext(), new Runnable() { // from class: com.huawei.openalliance.ad.nq.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ((com.huawei.openalliance.ad.views.interfaces.i) nq.this.d()).a(drawable);
                        ((com.huawei.openalliance.ad.views.interfaces.i) nq.this.d()).c();
                    }
                });
            }

            @Override // com.huawei.openalliance.ad.utils.bd.a
            public void a() {
                hw.b("PPSImageViewPresenter", "onMaterialLoaded - image load failed");
                com.huawei.openalliance.ad.utils.dc.a(nq.this.f19766c.getApplicationContext(), new Runnable() { // from class: com.huawei.openalliance.ad.nq.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ((com.huawei.openalliance.ad.views.interfaces.i) nq.this.d()).a(-9);
                    }
                });
                nq nqVar = nq.this;
                nqVar.b(nqVar.f19383a);
            }
        }, this.f19383a);
    }

    public nq(Context context, com.huawei.openalliance.ad.views.interfaces.i iVar, int i) {
        super(context, iVar, i);
    }
}
