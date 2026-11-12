package com.huawei.openalliance.ad;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.constant.ErrorCode;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.INativeAdLoader;
import com.huawei.openalliance.ad.inter.NativeAdLoader;
import com.huawei.openalliance.ad.inter.data.BannerSize;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.inter.data.ImageInfo;
import com.huawei.openalliance.ad.inter.listeners.ContentIdListener;
import com.huawei.openalliance.ad.inter.listeners.NativeAdListener;
import com.huawei.openalliance.ad.views.PPSBannerView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes41.dex */
public class nh extends jr<com.huawei.openalliance.ad.views.interfaces.h> implements oe<com.huawei.openalliance.ad.views.interfaces.h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private INativeAdLoader f19722c;
    private Context d;
    private rc e;
    private ContentRecord f;
    private INativeAd g;
    private RequestOptions h;
    private String i;
    private Location j;
    private Integer k;
    private Integer l;
    private int m;

    @Override // com.huawei.openalliance.ad.oe
    public void b(String str) {
        this.i = str;
    }

    @Override // com.huawei.openalliance.ad.oe
    public void b(Integer num) {
        this.l = num;
    }

    @Override // com.huawei.openalliance.ad.oe
    public boolean a(BannerSize bannerSize, float f) {
        boolean z = false;
        if (!(d() instanceof PPSBannerView)) {
            return false;
        }
        PPSBannerView pPSBannerView = (PPSBannerView) d();
        Context applicationContext = pPSBannerView.getContext().getApplicationContext();
        int width = pPSBannerView.getWidth();
        int height = pPSBannerView.getHeight();
        if (hw.a()) {
            hw.a("BannerPresenter", "banner view width: %s, height: %s", Integer.valueOf(width), Integer.valueOf(height));
        }
        DisplayMetrics displayMetricsF = com.huawei.openalliance.ad.utils.d.f(this.d);
        if (width > displayMetricsF.widthPixels || height > displayMetricsF.heightPixels) {
            hw.c("BannerPresenter", "Ad view is off screen");
            return false;
        }
        int iA = bannerSize.a();
        int iB = bannerSize.b();
        float f2 = iA - width;
        float f3 = iA;
        float f4 = iB - height;
        float f5 = iB;
        float f6 = f4 / f5;
        if (f2 / f3 < f && f6 < f) {
            z = true;
        }
        if (!z) {
            float fI = com.huawei.openalliance.ad.utils.d.i(applicationContext);
            if (fI > 0.0f) {
                hw.c("BannerPresenter", "Not enough space to show ad. Needs %s×%s dp, but only has %s×%s dp", Integer.valueOf(Math.round(f3 / fI)), Integer.valueOf(Math.round(f5 / fI)), Integer.valueOf(Math.round(width / fI)), Integer.valueOf(Math.round(height / fI)));
            }
        }
        return z;
    }

    @Override // com.huawei.openalliance.ad.oe
    public boolean a() {
        return com.huawei.openalliance.ad.utils.as.b(this.d);
    }

    @Override // com.huawei.openalliance.ad.oe
    public void a(String str, int i, List<String> list, int i2) {
        if (str == null || str.isEmpty()) {
            hw.c("BannerPresenter", "adId is null or empty when load ad");
            com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.nh.1
                @Override // java.lang.Runnable
                public void run() {
                    nh.this.d().a(702);
                }
            });
            return;
        }
        hw.a("BannerPresenter", "loadAd ,adId:%s", str);
        this.m = i2;
        NativeAdLoader nativeAdLoader = new NativeAdLoader(this.d, new String[]{str}, i, list);
        this.f19722c = nativeAdLoader;
        if (nativeAdLoader instanceof NativeAdLoader) {
            nativeAdLoader.setLocation(this.j);
            ((NativeAdLoader) this.f19722c).a(Integer.valueOf(this.m));
            ((NativeAdLoader) this.f19722c).setContentBundle(this.i);
        }
        this.f19722c.setAdWidth(this.k);
        this.f19722c.setAdHeight(this.l);
        this.f19722c.setRequestOptions(this.h);
        this.f19722c.setListener(new NativeAdListener() { // from class: com.huawei.openalliance.ad.nh.2
            @Override // com.huawei.openalliance.ad.inter.listeners.NativeAdListener
            public void onAdsLoaded(Map<String, List<INativeAd>> map) {
                hw.a("BannerPresenter", "loadAd onAdsLoaded");
                nh nhVar = nh.this;
                nhVar.g = nhVar.a(map);
                com.huawei.openalliance.ad.utils.o.b(new Runnable() { // from class: com.huawei.openalliance.ad.nh.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        nh.this.c();
                    }
                });
                nh.this.b();
            }

            @Override // com.huawei.openalliance.ad.inter.listeners.NativeAdListener
            public void onAdFailed(final int i3) {
                hw.a("BannerPresenter", "loadAd onAdFailed");
                com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.nh.2.2
                    @Override // java.lang.Runnable
                    public void run() {
                        nh.this.d().a(i3);
                    }
                });
            }
        });
        this.f19722c.setContentIdListener(new a(this));
        this.f19722c.loadAds(com.huawei.openalliance.ad.utils.ab.k(this.d), null, false);
    }

    @Override // com.huawei.openalliance.ad.oe
    public void a(Integer num) {
        this.k = num;
    }

    @Override // com.huawei.openalliance.ad.oe
    public void a(com.huawei.openalliance.ad.inter.data.e eVar) {
        this.g = eVar;
        this.f = pl.a(eVar);
        Context context = this.d;
        this.e = new pc(context, new ss(context, eVar == null ? 8 : eVar.e()), this.f);
    }

    @Override // com.huawei.openalliance.ad.oe
    public void a(RequestOptions requestOptions) {
        this.h = requestOptions;
    }

    @Override // com.huawei.openalliance.ad.oe
    public void a(Location location) {
        this.j = location;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        INativeAd iNativeAd = this.g;
        if (iNativeAd == null) {
            hw.c("BannerPresenter", "downLoadBitmap nativeAd is null");
            a(ErrorCode.ERROR_CODE_OTHER);
            return;
        }
        List<ImageInfo> imageInfos = iNativeAd.getImageInfos();
        if (com.huawei.openalliance.ad.utils.bm.a(imageInfos)) {
            hw.c("BannerPresenter", "downLoadBitmap imageInfo is null");
            a(ErrorCode.ERROR_CODE_OTHER);
            return;
        }
        String strA = a(imageInfos.get(0), System.currentTimeMillis());
        if (strA != null) {
            com.huawei.openalliance.ad.utils.bd.a(this.d, strA, new com.huawei.openalliance.ad.utils.bd.a() { // from class: com.huawei.openalliance.ad.nh.4
                @Override // com.huawei.openalliance.ad.utils.bd.a
                public void a(final Drawable drawable) {
                    com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.nh.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            nh.this.d().a(drawable, nh.this.g);
                        }
                    });
                }

                @Override // com.huawei.openalliance.ad.utils.bd.a
                public void a() {
                    hw.c("BannerPresenter", "loadImage onFail");
                    nh.this.a(ErrorCode.ERROR_CODE_OTHER);
                }
            }, this.f);
        } else {
            hw.c("BannerPresenter", "downLoadBitmap filePath is null");
            a(ErrorCode.ERROR_CODE_OTHER);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        INativeAd iNativeAd;
        final long jBK;
        if (this.m == 1 || (iNativeAd = this.g) == null) {
            return;
        }
        String strAq = iNativeAd instanceof com.huawei.openalliance.ad.inter.data.e ? ((com.huawei.openalliance.ad.inter.data.e) iNativeAd).aq() : null;
        hw.b("BannerPresenter", "setBannerRefresh: %s", strAq);
        if (TextUtils.isEmpty(strAq)) {
            return;
        }
        if ("N".equalsIgnoreCase(strAq)) {
            jBK = 0;
        } else if ("Y".equalsIgnoreCase(strAq)) {
            jBK = fp.b(this.d).bK();
        } else {
            try {
                jBK = Long.parseLong(strAq);
            } catch (NumberFormatException e) {
                hw.c("BannerPresenter", "parseIntOrDefault exception: " + e.getClass().getSimpleName());
                return;
            }
        }
        com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.nh.3
            @Override // java.lang.Runnable
            public void run() {
                nh.this.d().a(jBK);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i) {
        com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.nh.5
            @Override // java.lang.Runnable
            public void run() {
                nh.this.d().a(i);
                if (i == 499) {
                    nh.this.d().a();
                }
            }
        });
    }

    private String a(ImageInfo imageInfo, long j) {
        return new ow(this.d, this.g).a(imageInfo, j);
    }

    static class a implements ContentIdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<nh> f19735a;

        @Override // com.huawei.openalliance.ad.inter.listeners.ContentIdListener
        public void a(final List<String> list) {
            hw.b("BannerPresenter", "loadAd onInValidContentIdsGot");
            com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.nh.a.1
                @Override // java.lang.Runnable
                public void run() {
                    nh nhVar = (nh) a.this.f19735a.get();
                    if (nhVar == null) {
                        hw.c("BannerPresenter", "onInValidContentIdsGot presenter is null");
                    } else {
                        nhVar.d().a(list);
                    }
                }
            });
        }

        public a(nh nhVar) {
            this.f19735a = new WeakReference<>(nhVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public INativeAd a(Map<String, List<INativeAd>> map) {
        if (map == null) {
            return null;
        }
        Iterator<Map.Entry<String, List<INativeAd>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<INativeAd> it2 = it.next().getValue().iterator();
            if (it2.hasNext()) {
                return it2.next();
            }
        }
        return null;
    }

    public nh(Context context, com.huawei.openalliance.ad.views.interfaces.h hVar) {
        a(hVar);
        this.d = context != null ? context.getApplicationContext() : context;
    }
}
