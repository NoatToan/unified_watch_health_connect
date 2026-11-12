package com.huawei.openalliance.ad.inter;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.ads.VideoConfiguration;
import com.huawei.openalliance.ad.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.ApiNames;
import com.huawei.openalliance.ad.en;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.BiddingInfo;
import com.huawei.openalliance.ad.inter.data.RewardVerifyConfig;
import com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener;
import com.huawei.openalliance.ad.inter.listeners.InterstitialAdListener;
import com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager;
import com.huawei.openalliance.ad.ot;
import com.huawei.openalliance.ad.pg;
import com.huawei.openalliance.ad.utils.ab;
import com.huawei.openalliance.ad.utils.ae;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.bo;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.o;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class g implements pg.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f19225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f19226c;
    private InterstitialAdListener d;
    private String e;
    private String f;
    private Location g;
    private IRewardAdStatusListener h;
    private String i;
    private Boolean j;
    private Bundle k;
    private String l;
    private pg n;
    private RequestOptions o;
    private pg.a p;
    private RewardVerifyConfig r;
    private Integer s;
    private VideoConfiguration t;
    private BiddingInfo u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f19224a = c.IDLE;
    private DelayInfo m = new DelayInfo();
    private List<com.huawei.openalliance.ad.inter.data.b> q = new ArrayList();
    private com.huawei.openalliance.ad.inter.listeners.a v = new d(this);

    enum c {
        IDLE,
        LOADING
    }

    public BiddingInfo g() {
        BiddingInfo biddingInfo = this.u;
        return biddingInfo == null ? new BiddingInfo() : biddingInfo;
    }

    public final void f() {
        hw.b("InterstitialAdManager", "show, adlist= %s", Boolean.valueOf(this.q.isEmpty()));
        for (com.huawei.openalliance.ad.inter.data.b bVar : this.q) {
            if (bVar != null && !bVar.b_()) {
                VideoConfiguration videoConfiguration = this.t;
                if (videoConfiguration != null) {
                    bVar.a(videoConfiguration);
                }
                bVar.setRewardVerifyConfig(this.r);
                bVar.a(this.f19225b, this.v);
                return;
            }
        }
    }

    public final Bundle e() {
        Bundle bundle = this.k;
        return bundle == null ? new Bundle() : bundle;
    }

    public final boolean d() {
        return this.f19224a == c.LOADING;
    }

    public final boolean c() {
        if (bm.a(this.q)) {
            return false;
        }
        for (com.huawei.openalliance.ad.inter.data.b bVar : this.q) {
            if (bVar != null && !bVar.b_()) {
                a(bVar.getBiddingInfo());
                return true;
            }
        }
        return false;
    }

    public void c(String str) {
        this.f19226c = str;
    }

    public void b(String str) {
        this.f = str;
    }

    public final String b() {
        return this.e;
    }

    @Override // com.huawei.openalliance.ad.pg.a
    public void a(final Map<String, List<com.huawei.openalliance.ad.inter.data.b>> map) {
        b(map);
        StringBuilder sb = new StringBuilder("onAdsLoaded, size:");
        sb.append(map != null ? Integer.valueOf(map.size()) : null);
        hw.b("InterstitialAdManager", sb.toString());
        this.m.u().i(System.currentTimeMillis());
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.g.2
            @Override // java.lang.Runnable
            public void run() {
                g.this.m.b(System.currentTimeMillis());
                if (g.this.d != null) {
                    g.this.d.onAdLoaded();
                }
                if (g.this.p != null) {
                    g.this.p.a(map);
                }
                com.huawei.openalliance.ad.analysis.d.a(g.this.f19225b, 200, g.this.l, 12, map, g.this.m);
            }
        });
        ae.b(this.f19225b, map);
    }

    public void a(List<com.huawei.openalliance.ad.inter.data.b> list) {
        this.q = list;
    }

    public final void a(String str) {
        this.e = str;
    }

    public void a(Integer num) {
        this.s = num;
    }

    public void a(pg.a aVar) {
        this.p = aVar;
    }

    public final void a(InterstitialAdListener interstitialAdListener) {
        this.d = interstitialAdListener;
    }

    public final void a(IRewardAdStatusListener iRewardAdStatusListener) {
        if (this.h != null) {
            hw.b("InterstitialAdManager", "Update rewarded video listener.");
        }
        this.h = iRewardAdStatusListener;
    }

    public void a(RewardVerifyConfig rewardVerifyConfig) {
        this.r = rewardVerifyConfig;
    }

    public void a(BiddingInfo biddingInfo) {
        this.u = biddingInfo;
    }

    public final void a(RequestOptions requestOptions, int i) {
        this.m.a(System.currentTimeMillis());
        hw.b("InterstitialAdManager", ApiNames.LOAD_AD);
        if (!as.b(this.f19225b)) {
            a(1001);
            return;
        }
        if (requestOptions != null && h()) {
            this.o = requestOptions;
            bo.b(this.f19225b.getApplicationContext(), requestOptions);
            en.a(this.f19225b).e();
            this.f19224a = c.LOADING;
            this.q.clear();
            Pair<String, Boolean> pairB = com.huawei.openalliance.ad.utils.d.b(this.f19225b, true);
            if (pairB == null && cc.h(this.f19225b)) {
                hw.b("InterstitialAdManager", "start to request oaid " + System.currentTimeMillis());
                OAIDServiceManager.getInstance(this.f19225b).requireOaid(new b(i));
                return;
            }
            if (pairB != null) {
                hw.b("InterstitialAdManager", "use cached oaid " + System.currentTimeMillis());
                d((String) pairB.first);
                a(((Boolean) pairB.second).booleanValue());
            }
            b(i);
        }
    }

    public void a(VideoConfiguration videoConfiguration) {
        this.t = videoConfiguration;
    }

    public void a(Location location) {
        this.g = location;
    }

    @Override // com.huawei.openalliance.ad.pg.a
    public void a(final int i) {
        hw.b("InterstitialAdManager", "onAdFailed: %s", Integer.valueOf(i));
        this.m.u().i(System.currentTimeMillis());
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.g.1
            @Override // java.lang.Runnable
            public void run() {
                g.this.m.b(System.currentTimeMillis());
                if (g.this.d != null) {
                    g.this.d.onAdFailed(i);
                }
                if (g.this.p != null) {
                    g.this.p.a(i);
                }
                com.huawei.openalliance.ad.analysis.d.a(g.this.f19225b, i, g.this.l, 12, (Map) null, g.this.m);
            }
        });
    }

    public final InterstitialAdListener a() {
        return this.d;
    }

    private boolean h() {
        if (!as.b(this.f19225b)) {
            InterstitialAdListener interstitialAdListener = this.d;
            if (interstitialAdListener != null) {
                interstitialAdListener.onAdFailed(1001);
            }
            return false;
        }
        if (this.f19224a == c.LOADING) {
            hw.b("InterstitialAdManager", "waiting for request finish");
            InterstitialAdListener interstitialAdListener2 = this.d;
            if (interstitialAdListener2 != null) {
                interstitialAdListener2.onAdFailed(1101);
            }
            return false;
        }
        if (!TextUtils.isEmpty(this.e)) {
            return true;
        }
        hw.c("InterstitialAdManager", "empty ad ids");
        InterstitialAdListener interstitialAdListener3 = this.d;
        if (interstitialAdListener3 != null) {
            interstitialAdListener3.onAdFailed(-4);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        this.i = str;
    }

    private void b(Map<String, List<com.huawei.openalliance.ad.inter.data.b>> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (List<com.huawei.openalliance.ad.inter.data.b> list : map.values()) {
            if (!bm.a(list)) {
                for (com.huawei.openalliance.ad.inter.data.b bVar : list) {
                    if (bVar.isExpired() || !bVar.c_()) {
                        hw.b("InterstitialAdManager", "ad is invalid, content id:" + bVar.getContentId());
                    } else {
                        this.q.add(bVar);
                    }
                }
                Collections.sort(this.q, new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        o.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.g.3
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                g.this.m.d(System.currentTimeMillis() - jCurrentTimeMillis);
                AdSlotParam.Builder builder = new AdSlotParam.Builder();
                g.this.a(builder, i);
                ot otVar = new ot(g.this.f19225b);
                otVar.a(g.this.m);
                AdContentRsp adContentRspC = otVar.c(builder.build(), g.this.f19226c);
                if (adContentRspC != null) {
                    g.this.l = adContentRspC.k();
                }
                g.this.m.u().h(System.currentTimeMillis());
                g.this.n.a(adContentRspC);
                g.this.f19224a = c.IDLE;
            }
        }, o.a.NETWORK, false);
    }

    static class d implements com.huawei.openalliance.ad.inter.listeners.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<g> f19239a;

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void f() {
            g gVar = this.f19239a.get();
            if (gVar == null || gVar.d == null) {
                return;
            }
            gVar.d.onVideoStarted();
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void e() {
            g gVar = this.f19239a.get();
            if (gVar == null || gVar.d == null) {
                return;
            }
            gVar.d.onAdLeave();
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void d() {
            g gVar = this.f19239a.get();
            if (gVar != null) {
                if (gVar.d != null) {
                    gVar.d.onAdClosed();
                }
                if (gVar.h != null) {
                    gVar.h.onAdClosed();
                }
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void c() {
            g gVar = this.f19239a.get();
            if (gVar == null || gVar.h == null) {
                return;
            }
            gVar.h.onAdCompleted();
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void b() {
            g gVar = this.f19239a.get();
            if (gVar != null) {
                if (gVar.d != null) {
                    gVar.d.onAdClicked();
                }
                if (gVar.h != null) {
                    gVar.h.onAdClicked();
                }
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void a(int i, int i2) {
            g gVar = this.f19239a.get();
            if (gVar != null) {
                if (gVar.d != null) {
                    gVar.d.onAdFailed(i);
                }
                if (gVar.h != null) {
                    gVar.h.onAdError(i, i2);
                }
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void a() {
            g gVar = this.f19239a.get();
            if (gVar != null) {
                if (gVar.d != null) {
                    gVar.d.onAdOpened();
                }
                if (gVar.h != null) {
                    gVar.h.onAdShown();
                }
            }
        }

        public d(g gVar) {
            this.f19239a = new WeakReference<>(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdSlotParam.Builder builder, int i) {
        ArrayList arrayList = new ArrayList(1);
        if (i == 0) {
            i = ab.k(this.f19225b);
        }
        arrayList.add(this.e);
        builder.setAdIds(arrayList).setDeviceType(i).setTest(false).setOrientation(this.f19225b.getResources().getConfiguration().orientation != 1 ? 0 : 1).setWidth(com.huawei.openalliance.ad.utils.d.d(this.f19225b)).setHeight(com.huawei.openalliance.ad.utils.d.e(this.f19225b)).setOaid(this.i).setTrackLimited(this.j).setRequestOptions(this.o).setContentBundle(this.f).setLocation(this.g);
        Integer num = this.s;
        if (num != null) {
            builder.c(num);
        }
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

    class b extends OAIDServiceManager.OaidResultCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19234a;

        @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
        public int b() {
            return 12;
        }

        @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
        public void a(String str, boolean z) {
            hw.b("InterstitialAdManager", "onOaidAcquired " + System.currentTimeMillis());
            g.this.d(str);
            g.this.a(z);
            g.this.b(this.f19234a);
            com.huawei.openalliance.ad.utils.d.a(g.this.f19225b, str, z);
        }

        @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
        public void a() {
            hw.b("InterstitialAdManager", "onOaidAcquireFailed " + System.currentTimeMillis());
            g.this.b(this.f19234a);
        }

        public b(int i) {
            this.f19234a = 0;
            if (i != 0) {
                this.f19234a = i;
            }
        }
    }

    public g(Context context) {
        this.f19225b = context;
        this.n = new pg(context, this);
    }
}
