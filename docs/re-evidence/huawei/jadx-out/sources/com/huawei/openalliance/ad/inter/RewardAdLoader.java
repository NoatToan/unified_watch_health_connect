package com.huawei.openalliance.ad.inter;

import android.content.Context;
import android.location.Location;
import android.util.Pair;
import com.huawei.openalliance.ad.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.en;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.IRewardAd;
import com.huawei.openalliance.ad.inter.listeners.RewardAdListener;
import com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager;
import com.huawei.openalliance.ad.ot;
import com.huawei.openalliance.ad.px;
import com.huawei.openalliance.ad.rg;
import com.huawei.openalliance.ad.utils.ae;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bo;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.o;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class RewardAdLoader implements IRewardAdLoader, px.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f19124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f19126c;
    private rg d;
    private String f;
    private Boolean g;
    private RewardAdListener h;
    private RequestOptions i;
    private String j;
    private Location k;
    private String l;
    private Integer n;
    private b e = b.IDLE;
    private DelayInfo m = new DelayInfo();

    enum b {
        IDLE,
        LOADING
    }

    @Override // com.huawei.openalliance.ad.inter.IRewardAdLoader
    public void setRequestOptions(RequestOptions requestOptions) {
        this.i = requestOptions;
    }

    @Override // com.huawei.openalliance.ad.inter.IRewardAdLoader
    public void setLocation(Location location) {
        this.k = location;
    }

    @Override // com.huawei.openalliance.ad.inter.IRewardAdLoader
    public void setListener(RewardAdListener rewardAdListener) {
        this.h = rewardAdListener;
    }

    @Override // com.huawei.openalliance.ad.inter.IRewardAdLoader
    public void setExtraInfo(String str) {
        this.f19125b = str;
    }

    @Override // com.huawei.openalliance.ad.inter.IRewardAdLoader
    public void setContentBundle(String str) {
        this.j = str;
    }

    @Override // com.huawei.openalliance.ad.inter.IRewardAdLoader
    public void loadAds(int i, boolean z) {
        this.m.a(System.currentTimeMillis());
        hw.b("RewardAdLoader", "loadAds");
        if (!as.b(this.f19124a)) {
            a(1001);
            return;
        }
        if (b.LOADING == this.e) {
            hw.b("RewardAdLoader", "waiting for request finish");
            a(901);
            return;
        }
        String[] strArr = this.f19126c;
        if (strArr == null || strArr.length == 0) {
            hw.c("RewardAdLoader", "empty ad ids");
            a(902);
            return;
        }
        en.a(this.f19124a).e();
        bo.b(this.f19124a, this.i);
        this.e = b.LOADING;
        Pair<String, Boolean> pairB = com.huawei.openalliance.ad.utils.d.b(this.f19124a, true);
        if (pairB == null && cc.h(this.f19124a)) {
            hw.b("RewardAdLoader", "start to request oaid " + System.currentTimeMillis());
            OAIDServiceManager.getInstance(this.f19124a).requireOaid(new a(i, z));
            return;
        }
        if (pairB != null) {
            hw.b("RewardAdLoader", "use cached oaid " + System.currentTimeMillis());
            a((String) pairB.first);
            a(((Boolean) pairB.second).booleanValue());
        }
        a(i, z);
    }

    @Override // com.huawei.openalliance.ad.px.a
    public void a(final Map<String, List<IRewardAd>> map) {
        StringBuilder sb = new StringBuilder("onAdsLoaded, size:");
        sb.append(map != null ? Integer.valueOf(map.size()) : null);
        sb.append(", listener:");
        sb.append(this.h);
        hw.b("RewardAdLoader", sb.toString());
        if (this.h == null) {
            return;
        }
        this.m.u().i(System.currentTimeMillis());
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.RewardAdLoader.2
            @Override // java.lang.Runnable
            public void run() {
                RewardAdListener rewardAdListener = RewardAdLoader.this.h;
                RewardAdLoader.this.m.b(System.currentTimeMillis());
                if (rewardAdListener != null) {
                    rewardAdListener.onAdsLoaded(map);
                }
                com.huawei.openalliance.ad.analysis.d.a(RewardAdLoader.this.f19124a, 200, RewardAdLoader.this.l, 7, map, RewardAdLoader.this.m);
            }
        });
        ae.a(this.f19124a, map);
    }

    public void a(Integer num) {
        this.n = num;
    }

    @Override // com.huawei.openalliance.ad.px.a
    public void a(final int i) {
        hw.b("RewardAdLoader", "onAdFailed, errorCode:" + i);
        if (this.h == null) {
            return;
        }
        this.m.u().i(System.currentTimeMillis());
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.RewardAdLoader.3
            @Override // java.lang.Runnable
            public void run() {
                RewardAdListener rewardAdListener = RewardAdLoader.this.h;
                RewardAdLoader.this.m.b(System.currentTimeMillis());
                if (rewardAdListener != null) {
                    rewardAdListener.onAdFailed(i);
                }
                com.huawei.openalliance.ad.analysis.d.a(RewardAdLoader.this.f19124a, i, RewardAdLoader.this.l, 7, (Map) null, RewardAdLoader.this.m);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        this.f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final boolean z) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        o.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.RewardAdLoader.1
            @Override // java.lang.Runnable
            public void run() {
                hw.b("RewardAdLoader", "doRequestAd " + System.currentTimeMillis());
                RewardAdLoader.this.m.d(System.currentTimeMillis() - jCurrentTimeMillis);
                AdSlotParam.Builder builder = new AdSlotParam.Builder();
                builder.setAdIds(Arrays.asList(RewardAdLoader.this.f19126c)).setDeviceType(i).setOrientation(1).setWidth(com.huawei.openalliance.ad.utils.d.d(RewardAdLoader.this.f19124a)).setHeight(com.huawei.openalliance.ad.utils.d.e(RewardAdLoader.this.f19124a)).setOaid(RewardAdLoader.this.f).setTrackLimited(RewardAdLoader.this.g).setLocation(RewardAdLoader.this.k).setRequestOptions(RewardAdLoader.this.i).setTest(z).setContentBundle(RewardAdLoader.this.j);
                if (RewardAdLoader.this.n != null) {
                    builder.c(RewardAdLoader.this.n);
                }
                ot otVar = new ot(RewardAdLoader.this.f19124a);
                otVar.a(RewardAdLoader.this.m);
                AdContentRsp adContentRspB = otVar.b(builder.build(), RewardAdLoader.this.f19125b);
                if (adContentRspB != null) {
                    RewardAdLoader.this.l = adContentRspB.k();
                }
                RewardAdLoader.this.m.u().h(System.currentTimeMillis());
                RewardAdLoader.this.d.a(adContentRspB);
                RewardAdLoader.this.e = b.IDLE;
            }
        }, o.a.NETWORK, false);
    }

    class a extends OAIDServiceManager.OaidResultCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f19135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f19136c;

        @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
        public int b() {
            return 7;
        }

        @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
        public void a(String str, boolean z) {
            hw.b("RewardAdLoader", "onOaidAcquired " + System.currentTimeMillis());
            RewardAdLoader.this.a(str);
            RewardAdLoader.this.a(z);
            RewardAdLoader.this.a(this.f19135b, this.f19136c);
            com.huawei.openalliance.ad.utils.d.a(RewardAdLoader.this.f19124a, str, z);
        }

        @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
        public void a() {
            hw.b("RewardAdLoader", "onOaidAcquireFailed " + System.currentTimeMillis());
            RewardAdLoader.this.a(this.f19135b, this.f19136c);
        }

        public a(int i, boolean z) {
            this.f19135b = i;
            this.f19136c = z;
        }
    }

    public RewardAdLoader(Context context, String[] strArr) {
        if (!as.b(context)) {
            this.f19126c = new String[0];
            return;
        }
        this.f19124a = context.getApplicationContext();
        if (strArr == null || strArr.length <= 0) {
            this.f19126c = new String[0];
        } else {
            String[] strArr2 = new String[strArr.length];
            this.f19126c = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        }
        this.d = new px(context, this);
    }
}
