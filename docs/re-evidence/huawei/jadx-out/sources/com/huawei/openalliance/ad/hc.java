package com.huawei.openalliance.ad;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.huawei.openalliance.ad.inter.data.ImageInfo;
import com.huawei.openalliance.ad.inter.data.VideoInfo;

/* JADX INFO: loaded from: classes12.dex */
public class hc extends ni<hm> implements hd<hm> {
    private boolean g;

    @Override // com.huawei.openalliance.ad.hd
    public void c() {
        if (this.f19384b == null) {
            return;
        }
        this.f19384b.e();
    }

    @Override // com.huawei.openalliance.ad.hd
    public void b() {
        if (this.f19384b == null) {
            return;
        }
        this.f19384b.d();
    }

    @Override // com.huawei.openalliance.ad.hd
    public void a(boolean z) {
        if (this.f19384b == null) {
            return;
        }
        this.f19384b.b(z);
    }

    @Override // com.huawei.openalliance.ad.hd
    public void a(VideoInfo videoInfo) {
        if (videoInfo == null) {
            return;
        }
        ((hm) d()).a(videoInfo, videoInfo.b(this.f19738c));
    }

    @Override // com.huawei.openalliance.ad.hd
    public void a(ImageInfo imageInfo) {
        hw.c("NativeVideoP", "checkPreviewImageHashAndLoad " + imageInfo);
        if (imageInfo == null) {
            return;
        }
        boolean zB = imageInfo.b(this.f19738c);
        hw.b("NativeVideoP", "imageInfo checkHash result %s", Boolean.valueOf(zB));
        if (zB) {
            b(imageInfo);
        }
    }

    @Override // com.huawei.openalliance.ad.hd
    public void a(gz gzVar) {
        if (gzVar == null) {
            this.f19383a = null;
            return;
        }
        this.f19383a = gzVar.a();
        if (this.f19383a != null) {
            this.f19384b.a(this.f19383a);
        }
    }

    @Override // com.huawei.openalliance.ad.hd
    public void a(long j, long j2, long j3, long j4) {
        this.f19384b.a(j, j2, (int) j3, (int) j4);
    }

    @Override // com.huawei.openalliance.ad.hd
    public void a(int i, int i2) {
        if (this.g) {
            return;
        }
        this.g = true;
        new com.huawei.openalliance.ad.analysis.c(this.f19738c).a(this.f19383a, i, i2);
    }

    @Override // com.huawei.openalliance.ad.hd
    public void a() {
        if (this.f19383a == null || this.f19384b == null) {
            return;
        }
        this.f19384b.a(this.f19738c, this.f19383a);
    }

    private void b(final ImageInfo imageInfo) {
        if (imageInfo == null) {
            hw.b("NativeVideoP", "image info null");
        } else {
            com.huawei.openalliance.ad.utils.bd.a(this.f19738c, imageInfo.getUrl(), new com.huawei.openalliance.ad.utils.bd.a() { // from class: com.huawei.openalliance.ad.hc.1
                @Override // com.huawei.openalliance.ad.utils.bd.a
                public void a(final Drawable drawable) {
                    com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.hc.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ((hm) hc.this.d()).a(imageInfo, drawable);
                        }
                    });
                }

                @Override // com.huawei.openalliance.ad.utils.bd.a
                public void a() {
                    hw.c("NativeVideoP", "preview image load failed");
                }
            });
        }
    }

    public hc(Context context, hm hmVar) {
        super(context);
        this.g = false;
        a(hmVar);
        this.f19384b = new pc(context, hb.a(context, hmVar.getLinkedNativeAd()));
    }
}
