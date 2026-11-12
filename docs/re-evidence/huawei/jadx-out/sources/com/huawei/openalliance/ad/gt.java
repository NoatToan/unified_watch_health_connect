package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.BiddingInfo;
import com.huawei.openalliance.ad.inter.data.InterstitialAd;
import com.huawei.openalliance.ad.inter.listeners.InterstitialAdCallback;
import com.huawei.openalliance.ad.inter.listeners.InterstitialAdListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class gt implements gs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterstitialAdListener f18836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterstitialAdCallback f18837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterstitialAd f18838c;
    private Context d;
    private List<com.huawei.openalliance.ad.inter.data.b> e = new ArrayList();
    private pg.a f;

    @Override // com.huawei.openalliance.ad.gs
    public void a(qy qyVar) {
    }

    @Override // com.huawei.openalliance.ad.gs
    public void a(Map map) {
        StringBuilder sb = new StringBuilder("onAdsLoaded, size:");
        sb.append(map != null ? Integer.valueOf(map.size()) : null);
        hw.b("InterstitialAd", sb.toString());
        b(map);
        InterstitialAdListener interstitialAdListener = this.f18836a;
        if (interstitialAdListener != null) {
            interstitialAdListener.onAdLoaded();
        }
        InterstitialAdCallback interstitialAdCallback = this.f18837b;
        if (interstitialAdCallback != null) {
            interstitialAdCallback.onAdsLoaded(this.f18838c);
        }
        pg.a aVar = this.f;
        if (aVar != null) {
            aVar.a((Map<String, List<com.huawei.openalliance.ad.inter.data.b>>) map);
        }
        com.huawei.openalliance.ad.utils.ae.b(this.d, map);
    }

    static class a implements Serializable, Comparator<com.huawei.openalliance.ad.inter.data.b> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(com.huawei.openalliance.ad.inter.data.b bVar, com.huawei.openalliance.ad.inter.data.b bVar2) {
            if (a(bVar.getBiddingInfo()) && !a(bVar2.getBiddingInfo())) {
                return -1;
            }
            if (a(bVar.getBiddingInfo()) && a(bVar2.getBiddingInfo())) {
                return (bVar.getBiddingInfo().getPrice().floatValue() <= 0.0f || Float.compare(bVar.getBiddingInfo().getPrice().floatValue(), bVar2.getBiddingInfo().getPrice().floatValue()) >= 0) ? -1 : 1;
            }
            return 1;
        }

        private boolean a(BiddingInfo biddingInfo) {
            return (biddingInfo == null || biddingInfo.getPrice() == null) ? false : true;
        }

        a() {
        }
    }

    @Override // com.huawei.openalliance.ad.gs
    public void a(int i) {
        hw.b("InterstitialAd", "onAdFailed, errorCode:" + i);
        InterstitialAdListener interstitialAdListener = this.f18836a;
        if (interstitialAdListener != null) {
            interstitialAdListener.onAdFailed(i);
        }
        pg.a aVar = this.f;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    private void b(Map<String, List<com.huawei.openalliance.ad.inter.data.b>> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (List<com.huawei.openalliance.ad.inter.data.b> list : map.values()) {
            if (!com.huawei.openalliance.ad.utils.bm.a(list)) {
                for (com.huawei.openalliance.ad.inter.data.b bVar : list) {
                    if (bVar.isExpired() || !bVar.c_()) {
                        hw.b("InterstitialAd", "expired is true, content id:" + bVar.getContentId());
                    } else {
                        this.e.add(bVar);
                    }
                }
                Collections.sort(this.e, new a());
                this.f18838c.a(this.e);
            }
        }
    }

    public gt(Context context, InterstitialAdCallback interstitialAdCallback, pg.a aVar) {
        this.d = context;
        this.f18837b = interstitialAdCallback;
        this.f = aVar;
        if (interstitialAdCallback != null) {
            this.f18836a = interstitialAdCallback.getInterstitialAdListener();
        }
        if (this.f18838c == null) {
            InterstitialAd interstitialAd = new InterstitialAd(context);
            this.f18838c = interstitialAd;
            interstitialAd.setAdListener(this.f18836a);
        }
        this.e.clear();
    }
}
