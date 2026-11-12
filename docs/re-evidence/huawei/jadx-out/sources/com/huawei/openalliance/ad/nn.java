package com.huawei.openalliance.ad;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.huawei.openalliance.ad.inter.data.ImageInfo;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.media.MediaPlayerAgent;
import com.huawei.openalliance.ad.views.interfaces.INativeVideoView;
import com.huawei.openalliance.ad.views.interfaces.IPPSNativeView;

/* JADX INFO: loaded from: classes41.dex */
public class nn extends ni<INativeVideoView> implements of<INativeVideoView> {
    private boolean g;

    @Override // com.huawei.openalliance.ad.of
    public boolean a(MediaPlayerAgent mediaPlayerAgent, com.huawei.openalliance.ad.inter.data.e eVar) {
        return false;
    }

    @Override // com.huawei.openalliance.ad.of
    public void a(boolean z) {
        if (this.f19384b == null) {
            return;
        }
        this.f19384b.b(z);
    }

    @Override // com.huawei.openalliance.ad.of
    public void a(IPPSNativeView iPPSNativeView, com.huawei.openalliance.ad.inter.data.e eVar) {
        if (iPPSNativeView == null || eVar == null || eVar.ad() || eVar.q() == null) {
            return;
        }
        Integer numQ = eVar.q();
        int iIntValue = numQ.intValue();
        if (iIntValue == 1 || iIntValue == 2) {
            hw.b("NativeVideoViewPresenter", "reportAdShowEvent Media Play over reportAdShowEvent by customExposureType: %s", numQ);
            iPPSNativeView.a(null);
        }
    }

    @Override // com.huawei.openalliance.ad.of
    public void a(com.huawei.openalliance.ad.inter.data.e eVar) {
        this.f19383a = pl.a(eVar);
        this.f19384b = new pc(this.f19738c, new sz(this.f19738c, 3), this.f19383a);
    }

    @Override // com.huawei.openalliance.ad.of
    public void a(final VideoInfo videoInfo) {
        if (videoInfo == null) {
            return;
        }
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.nn.1
            @Override // java.lang.Runnable
            public void run() {
                final boolean zB = videoInfo.b(nn.this.f19738c);
                com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.nn.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ((INativeVideoView) nn.this.d()).onCheckVideoHashResult(videoInfo, zB);
                    }
                });
            }
        });
    }

    @Override // com.huawei.openalliance.ad.of
    public void a(final ImageInfo imageInfo) {
        if (imageInfo == null) {
            return;
        }
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.nn.3
            @Override // java.lang.Runnable
            public void run() {
                if (imageInfo.b(nn.this.f19738c)) {
                    nn.this.b(imageInfo);
                }
            }
        });
    }

    @Override // com.huawei.openalliance.ad.of
    public void a(int i, int i2, long j, IPPSNativeView iPPSNativeView, com.huawei.openalliance.ad.inter.data.e eVar) {
        if (iPPSNativeView == null || eVar == null || eVar.ad() || eVar.q() == null || eVar.q().intValue() == 0) {
            return;
        }
        Integer numQ = eVar.q();
        if (numQ.intValue() == 2 && eVar.r() != null && eVar.r().intValue() >= 0) {
            int iIntValue = eVar.r().intValue();
            if (hw.a()) {
                hw.a("NativeVideoViewPresenter", "reportAdShowEvent play percentage: %s  minEffectiveVideoPlayProgress：%s", Integer.valueOf(i), eVar.r());
            }
            if (i >= iIntValue) {
                iPPSNativeView.a(null);
                return;
            }
            return;
        }
        if (numQ.intValue() == 1) {
            long j2 = ((long) i2) - j;
            if (hw.a()) {
                hw.a("NativeVideoViewPresenter", "reportAdShowEvent has playing time: %s  playTime: %s  videoStartPlayTime: %s", Long.valueOf(j2), Integer.valueOf(i2), Long.valueOf(j));
            }
            if (j2 >= eVar.getMinEffectiveShowTime()) {
                iPPSNativeView.a(null);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.of
    public void a(int i, int i2) {
        a();
        if (this.g) {
            return;
        }
        this.g = true;
        new com.huawei.openalliance.ad.analysis.c(this.f19738c).a(this.f19383a, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final ImageInfo imageInfo) {
        if (imageInfo == null) {
            return;
        }
        com.huawei.openalliance.ad.utils.bd.a(this.f19738c, imageInfo.getUrl(), new com.huawei.openalliance.ad.utils.bd.a() { // from class: com.huawei.openalliance.ad.nn.2
            @Override // com.huawei.openalliance.ad.utils.bd.a
            public void a(final Drawable drawable) {
                com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.nn.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ((INativeVideoView) nn.this.d()).onPreviewImageLoaded(imageInfo, drawable);
                    }
                });
            }

            @Override // com.huawei.openalliance.ad.utils.bd.a
            public void a() {
                hw.c("NativeVideoViewPresenter", "video cover image load failed");
            }
        });
    }

    private void a() {
        if (this.f19383a == null || this.f19383a.T() == null) {
            return;
        }
        hw.b("NativeVideoViewPresenter", "online stream error, direct cache video.");
        com.huawei.openalliance.ad.beans.metadata.VideoInfo videoInfoT = this.f19383a.T();
        dw.h().a(new du(videoInfoT.a(), videoInfoT.c(), videoInfoT.i() == 0, videoInfoT.g(), null, true, 1, this.f19383a.o(), this.f19383a.n(), 3, false, 0));
    }

    public nn(Context context, INativeVideoView iNativeVideoView) {
        super(context);
        this.g = false;
        a(iNativeVideoView);
        this.f19384b = new pc(context, new sz(context, 3));
    }
}
