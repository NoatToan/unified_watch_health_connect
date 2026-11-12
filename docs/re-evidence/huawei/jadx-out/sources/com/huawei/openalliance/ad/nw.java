package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.MediaFile;
import com.huawei.openalliance.ad.inter.data.PlacementMediaFile;
import com.huawei.openalliance.ad.views.interfaces.IPlacementVideoView;

/* JADX INFO: loaded from: classes12.dex */
public class nw extends ni<IPlacementVideoView> implements ol<IPlacementVideoView> {
    @Override // com.huawei.openalliance.ad.ol
    public void b(String str) {
        this.f = str;
    }

    @Override // com.huawei.openalliance.ad.ol
    public void a(com.huawei.openalliance.ad.inter.data.h hVar) {
        this.f19383a = pq.a(hVar);
        this.f19384b = new pc(this.f19738c, new ta(this.f19738c), this.f19383a);
        if (hVar != null) {
            this.e = Integer.valueOf(hVar.getSequence());
        }
    }

    @Override // com.huawei.openalliance.ad.ol
    public void a(final PlacementMediaFile placementMediaFile) {
        if (placementMediaFile == null) {
            return;
        }
        hw.b("PlacementVideoViewPresenter", "checkVideoHash");
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.nw.1
            @Override // java.lang.Runnable
            public void run() {
                if (2 == placementMediaFile.getPlayMode() || placementMediaFile.a(nw.this.f19738c)) {
                    com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.nw.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ((IPlacementVideoView) nw.this.d()).onCheckVideoHashResult(placementMediaFile, true);
                        }
                    });
                }
            }
        });
    }

    @Override // com.huawei.openalliance.ad.ol
    public void a(long j, int i) {
        new com.huawei.openalliance.ad.analysis.c(this.f19738c).a(this.f19383a, j, i);
    }

    @Override // com.huawei.openalliance.ad.ol
    public void a() {
        if (this.f19383a == null || this.f19383a.U() == null) {
            return;
        }
        try {
            hw.b("PlacementVideoViewPresenter", "online stream error, direct cache video.");
            MediaFile mediaFileU = this.f19383a.U();
            dw.h().a(new du(mediaFileU.e(), (int) mediaFileU.d(), mediaFileU.g() == 0, mediaFileU.f(), null, true, 1, this.f19383a.o(), this.f19383a.n(), 60, false, 0));
        } catch (Throwable th) {
            hw.c("PlacementVideoViewPresenter", "direct cache ex: %s", th.getClass().getSimpleName());
        }
    }

    public nw(Context context, IPlacementVideoView iPlacementVideoView) {
        super(context == null ? context : context.getApplicationContext());
        a(iPlacementVideoView);
        context = context != null ? context.getApplicationContext() : context;
        this.f19384b = new pc(context, new ta(context));
    }
}
