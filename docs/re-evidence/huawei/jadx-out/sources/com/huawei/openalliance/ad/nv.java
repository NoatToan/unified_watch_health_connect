package com.huawei.openalliance.ad;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.huawei.openalliance.ad.inter.data.PlacementMediaFile;

/* JADX INFO: loaded from: classes12.dex */
public class nv extends jr<com.huawei.openalliance.ad.views.interfaces.o> implements ok<com.huawei.openalliance.ad.views.interfaces.o> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f19779c;

    @Override // com.huawei.openalliance.ad.ok
    public void a(final com.huawei.openalliance.ad.inter.data.h hVar) {
        if (hVar != null) {
            com.huawei.openalliance.ad.utils.o.b(new Runnable() { // from class: com.huawei.openalliance.ad.nv.2
                @Override // java.lang.Runnable
                public void run() {
                    PlacementMediaFile mediaFile = hVar.getMediaFile();
                    sn snVar = new sn();
                    snVar.d(mediaFile.getUrl());
                    snVar.c(mediaFile.getSha256());
                    snVar.b("placement");
                    snVar.b(mediaFile.getCheckSha256() == 0);
                    snVar.c(true);
                    snVar.a(pq.a(hVar));
                    so soVarA = new sl(nv.this.f19779c, snVar).a();
                    if (soVarA == null) {
                        nv.this.a((PlacementMediaFile) null);
                        return;
                    }
                    String strC = dk.a(nv.this.f19779c, "normal").c(soVarA.a());
                    if (!com.huawei.openalliance.ad.utils.ai.b(strC)) {
                        nv.this.a((PlacementMediaFile) null);
                    } else {
                        mediaFile.b(strC);
                        nv.this.a(mediaFile);
                    }
                }
            });
        }
    }

    public void a(final PlacementMediaFile placementMediaFile) {
        if (placementMediaFile == null) {
            d().a(null, null);
        } else {
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.nv.1
                @Override // java.lang.Runnable
                public void run() {
                    if (placementMediaFile.a(nv.this.f19779c)) {
                        nv.this.b(placementMediaFile);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final PlacementMediaFile placementMediaFile) {
        if (placementMediaFile == null) {
            return;
        }
        com.huawei.openalliance.ad.utils.bd.a(this.f19779c, placementMediaFile.b(), new com.huawei.openalliance.ad.utils.bd.a() { // from class: com.huawei.openalliance.ad.nv.3
            @Override // com.huawei.openalliance.ad.utils.bd.a
            public void a(final Drawable drawable) {
                com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.nv.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        nv.this.d().a(placementMediaFile, drawable);
                    }
                });
            }

            @Override // com.huawei.openalliance.ad.utils.bd.a
            public void a() {
                hw.c("PlacementImageViewPresenter", "placement image load failed");
                com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.nv.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        nv.this.d().a(null, null);
                    }
                });
            }
        });
    }

    public nv(Context context, com.huawei.openalliance.ad.views.interfaces.o oVar) {
        a(oVar);
        this.f19779c = context;
    }
}
