package com.huawei.openalliance.ad.inter;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.constant.AnalyticsEventType;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.ErrorCode;
import com.huawei.openalliance.ad.gs;
import com.huawei.openalliance.ad.gt;
import com.huawei.openalliance.ad.gu;
import com.huawei.openalliance.ad.gv;
import com.huawei.openalliance.ad.gw;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.IPlacementAd;
import com.huawei.openalliance.ad.inter.data.IPreCheckInfo;
import com.huawei.openalliance.ad.inter.listeners.InterstitialAdCallback;
import com.huawei.openalliance.ad.inter.listeners.NativeAdListener;
import com.huawei.openalliance.ad.inter.listeners.NativePreCheckInfoListener;
import com.huawei.openalliance.ad.inter.listeners.PlacementAdListener;
import com.huawei.openalliance.ad.inter.listeners.RewardAdListener;
import com.huawei.openalliance.ad.ot;
import com.huawei.openalliance.ad.ou;
import com.huawei.openalliance.ad.pg;
import com.huawei.openalliance.ad.qd;
import com.huawei.openalliance.ad.qy;
import com.huawei.openalliance.ad.utils.af;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.br;
import com.huawei.openalliance.ad.utils.bu;
import com.huawei.openalliance.ad.utils.da;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.j;
import com.huawei.openalliance.ad.utils.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class AdContentResponseParser implements IAdContentResponseParser, ou.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<Integer, gs> f18975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private qy f18976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f18977c;
    private String d;
    private long e;
    private long f;
    private ot g;
    private boolean h;
    private NativePreCheckInfoListener i;
    private String j;

    @Override // com.huawei.openalliance.ad.inter.IAdContentResponseParser
    public void stopCache() {
        gs gsVar = this.f18975a.get(60);
        if (gsVar instanceof gv) {
            ((gv) gsVar).a();
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IAdContentResponseParser
    public void startCache(int i) {
        gs gsVar = this.f18975a.get(60);
        if (gsVar instanceof gv) {
            ((gv) gsVar).b(i);
        }
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f18993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f18994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f18995c;
        private boolean d;
        private boolean e;
        private boolean f = false;
        private RewardAdListener g;
        private NativeAdListener h;
        private PlacementAdListener i;
        private InterstitialAdCallback j;
        private pg.a k;
        private NativeAdListener l;
        private NativeAdListener m;
        private NativePreCheckInfoListener n;

        public Builder setSearchAdListener(NativeAdListener nativeAdListener) {
            this.m = nativeAdListener;
            return this;
        }

        public Builder setRewardAdListener(RewardAdListener rewardAdListener) {
            this.g = rewardAdListener;
            return this;
        }

        public Builder setPlacementAdListener(PlacementAdListener placementAdListener) {
            this.i = placementAdListener;
            return this;
        }

        public Builder setNativePreCheckInfoListener(NativePreCheckInfoListener nativePreCheckInfoListener) {
            this.n = nativePreCheckInfoListener;
            return this;
        }

        public Builder setNativeAdListener(NativeAdListener nativeAdListener) {
            this.h = nativeAdListener;
            return this;
        }

        public Builder setInterstitialAdCallback(InterstitialAdCallback interstitialAdCallback) {
            this.j = interstitialAdCallback;
            return this;
        }

        public Builder setIconAdListener(NativeAdListener nativeAdListener) {
            this.l = nativeAdListener;
            return this;
        }

        public Builder setAutoCache(boolean z) {
            this.f18994b = z;
            return this;
        }

        public Builder setAdsReturnedFromThread(boolean z) {
            this.f = z;
            return this;
        }

        public Builder enableVideoDownloadInMobileNetwork(boolean z) {
            this.d = z;
            return this;
        }

        public Builder enableDirectReturnVideoAd(boolean z) {
            this.f18995c = z;
            return this;
        }

        public Builder enableDirectCacheVideo(boolean z) {
            this.e = z;
            return this;
        }

        public AdContentResponseParser build() {
            return new AdContentResponseParser(this);
        }

        public Builder a(pg.a aVar) {
            this.k = aVar;
            return this;
        }

        public Builder(Context context) {
            this.f18993a = context;
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IAdContentResponseParser
    public void processAdResponse(String str, boolean z) {
        AdParseConfig.Builder builder = new AdParseConfig.Builder();
        builder.setAccelerate(false);
        if (!z) {
            builder.setUpdateConfig(false);
        } else {
            if (TextUtils.isEmpty(da.a().c())) {
                hw.c("AdContentResponseParser", "must set media router country code first");
                a(-1, -1);
                return;
            }
            builder.setUpdateConfig(true);
        }
        a(str, builder.build());
    }

    @Override // com.huawei.openalliance.ad.inter.IAdContentResponseParser
    public void processAdResponse(String str, AdParseConfig adParseConfig) {
        if (!a(adParseConfig)) {
            hw.a(5);
        }
        if (adParseConfig == null) {
            a(str, new AdParseConfig.Builder().build());
        } else if (!adParseConfig.b() || !TextUtils.isEmpty(da.a().c())) {
            a(str, adParseConfig);
        } else {
            hw.c("AdContentResponseParser", "must set media router country code first");
            a(-1, -1);
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IAdContentResponseParser
    public void processAdResponse(String str) {
        AdParseConfig.Builder builder = new AdParseConfig.Builder();
        builder.setUpdateConfig(false).setAccelerate(false);
        a(str, builder.build());
    }

    @Override // com.huawei.openalliance.ad.ou.a
    public void a(Map map, Map map2) {
        gs gsVar = this.f18975a.get(60);
        if (gsVar instanceof gv) {
            gv gvVar = (gv) gsVar;
            gvVar.a(this.d);
            gvVar.a(this.e);
            gvVar.a((Map<String, List<IPlacementAd>>) map, (Map<String, List<IPlacementAd>>) map2);
            gvVar.b();
        }
    }

    @Override // com.huawei.openalliance.ad.ou.a
    public void a(final int i, final Map map) {
        HashMap<Integer, gs> map2 = this.f18975a;
        if (map2 == null || !map2.containsKey(Integer.valueOf(i))) {
            return;
        }
        if (map == null || map.isEmpty()) {
            a(i, 204);
        } else if (!this.h) {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.AdContentResponseParser.4
                @Override // java.lang.Runnable
                public void run() {
                    AdContentResponseParser.this.b(i, map);
                }
            });
        } else {
            hw.b("AdContentResponseParser", "onAdLoaded in Thread");
            b(i, map);
        }
    }

    @Override // com.huawei.openalliance.ad.ou.a
    public void a(int i, int i2) {
        if (i == -1) {
            a(i2);
        } else {
            b(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, Map map) {
        gs gsVar = this.f18975a.get(Integer.valueOf(i));
        if (gsVar != null) {
            if (i == 3) {
                gsVar.a(this.f18976b);
            }
            gsVar.a(map);
        }
        bu.a(this.j);
        bu.a(new a(map, this.f18977c.getApplicationContext()), this.j, 500L);
    }

    private void b(final int i, final int i2) {
        HashMap<Integer, gs> map = this.f18975a;
        if (map == null || !map.containsKey(Integer.valueOf(i))) {
            return;
        }
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.AdContentResponseParser.6
            @Override // java.lang.Runnable
            public void run() {
                gs gsVar = (gs) AdContentResponseParser.this.f18975a.get(Integer.valueOf(i));
                int iA = af.a(i, i2);
                AdContentResponseParser.this.f = System.currentTimeMillis();
                gsVar.a(iA);
            }
        });
    }

    private boolean a(AdParseConfig adParseConfig) {
        Context context = this.f18977c;
        if (context == null || adParseConfig == null || Constants.HW_BROWSER_PACKAGE.equalsIgnoreCase(context.getPackageName())) {
            return false;
        }
        return adParseConfig.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final List<IPreCheckInfo> list) {
        if (!this.h) {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.AdContentResponseParser.3
                @Override // java.lang.Runnable
                public void run() {
                    AdContentResponseParser.this.i.onPreCheck(list);
                }
            });
            return;
        }
        try {
            this.i.onPreCheck(list);
        } catch (Throwable unused) {
            hw.c("AdContentResponseParser", "native preCheck notify err!");
        }
    }

    private void a(final String str, final AdParseConfig adParseConfig) {
        hw.b("AdContentResponseParser", "processAdResponse");
        if (br.a(this.f18975a)) {
            hw.c("AdContentResponseParser", "ad callbacks has't been set");
            return;
        }
        if (!as.b(this.f18977c)) {
            hw.c("AdContentResponseParser", "api level too low");
            a(-1, 1001);
        } else if (!TextUtils.isEmpty(str)) {
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.inter.AdContentResponseParser.1
                @Override // java.lang.Runnable
                public void run() {
                    Pair<String, Map<Integer, AdContentRsp>> pairA = AdContentResponseParser.this.g.a(str, AdContentResponseParser.this.e, AdContentResponseParser.this.f18975a.keySet(), adParseConfig.b());
                    AdContentResponseParser.this.a((String) pairA.first);
                    AdContentResponseParser.this.a(pairA, adParseConfig);
                    AdContentResponseParser.this.f18976b.a(AdContentResponseParser.this.a((Map<Integer, AdContentRsp>) pairA.second), AdContentResponseParser.this.e, adParseConfig);
                }
            });
        } else {
            hw.b("AdContentResponseParser", "request ad fail");
            a(-1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        this.d = str;
    }

    private void a(Builder builder) {
        this.f18975a = new HashMap<>(4);
        if (builder.h != null) {
            this.f18975a.put(3, new gu(builder.h, this.f18977c));
        }
        if (builder.l != null) {
            this.f18975a.put(9, new gu(builder.l, this.f18977c));
        }
        if (builder.m != null) {
            this.f18975a.put(13, new gu(builder.m, this.f18977c));
        }
        if (builder.g != null) {
            this.f18975a.put(7, new gw(this.f18977c, builder.g));
        }
        if (builder.j != null || builder.k != null) {
            this.f18975a.put(12, new gt(this.f18977c, builder.j, builder.k));
        }
        if (builder.i != null) {
            this.f18975a.put(60, new gv(this.f18977c, builder.i, builder.f18994b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Pair<String, Map<Integer, AdContentRsp>> pair, AdParseConfig adParseConfig) {
        if (!adParseConfig.d() || pair.second == null || this.i == null) {
            return;
        }
        final AdContentRsp adContentRsp = (AdContentRsp) ((Map) pair.second).get(3);
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.inter.AdContentResponseParser.2
            @Override // java.lang.Runnable
            public void run() {
                AdContentResponseParser.this.a(qd.a(AdContentResponseParser.this.f18977c, adContentRsp));
            }
        });
    }

    private void a(final int i) {
        HashMap<Integer, gs> map = this.f18975a;
        if (map == null || map.isEmpty()) {
            return;
        }
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.AdContentResponseParser.5
            @Override // java.lang.Runnable
            public void run() {
                for (Map.Entry entry : AdContentResponseParser.this.f18975a.entrySet()) {
                    ((gs) entry.getValue()).a(af.a(((Integer) entry.getKey()).intValue(), i));
                }
            }
        });
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map f18996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f18997b;

        @Override // java.lang.Runnable
        public void run() {
            if (!br.a(this.f18996a)) {
                a(this.f18996a.keySet());
            }
            hw.a(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(Set<String> set) {
            if (set == null || set.size() == 0) {
                hw.d("AdContentResponseParser", "slotIds is empty");
                return;
            }
            String packageName = this.f18997b.getPackageName();
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                j.a(this.f18997b, packageName, AnalyticsEventType.AD_REQ, String.valueOf(1), it.next(), "");
            }
        }

        private void a(final Set<String> set) {
            o.h(new Runnable() { // from class: com.huawei.openalliance.ad.inter.AdContentResponseParser.a.1
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b(set);
                }
            });
        }

        public a(Map map, Context context) {
            this.f18996a = map;
            this.f18997b = context;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, AdContentRsp> a(Map<Integer, AdContentRsp> map) {
        Set<Integer> setKeySet = this.f18975a.keySet();
        Iterator<Map.Entry<Integer, AdContentRsp>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next().getKey();
            key.intValue();
            if (!setKeySet.contains(key)) {
                it.remove();
            }
        }
        for (Integer num : setKeySet) {
            int iIntValue = num.intValue();
            if (!map.containsKey(num)) {
                b(iIntValue, ErrorCode.ERROR_CODE_OTHER);
            }
        }
        return map;
    }

    private AdContentResponseParser(Builder builder) {
        this.e = System.currentTimeMillis();
        this.h = false;
        this.i = null;
        this.j = "delay_options_timeout_task_id" + hashCode();
        if (builder == null || builder.f18993a == null || !as.b(builder.f18993a)) {
            return;
        }
        this.f18977c = builder.f18993a;
        a(builder);
        if (this.f18975a.isEmpty()) {
            return;
        }
        ou ouVar = new ou(this.f18977c, this);
        this.f18976b = ouVar;
        ouVar.a(builder.f18995c);
        this.f18976b.b(builder.d);
        this.f18976b.c(builder.e);
        this.g = new ot(this.f18977c);
        this.h = builder.f;
        this.i = builder.n;
    }
}
