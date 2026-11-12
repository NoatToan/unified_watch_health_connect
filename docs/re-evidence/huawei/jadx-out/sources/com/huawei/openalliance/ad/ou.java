package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.inter.AdParseConfig;
import com.huawei.openalliance.ad.inter.data.IAd;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.inter.data.IPlacementAd;
import com.huawei.openalliance.ad.inter.data.IRewardAd;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ou implements qy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f19910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f19911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19912c = false;
    private boolean d = false;
    private boolean e = false;
    private pm f;

    public interface a<T extends IAd> {
        void a(int i, int i2);

        void a(int i, Map<String, List<T>> map);

        void a(Map<String, List<IPlacementAd>> map, Map<String, List<IPlacementAd>> map2);
    }

    @Override // com.huawei.openalliance.ad.qy
    public boolean c() {
        return this.e;
    }

    @Override // com.huawei.openalliance.ad.qy
    public void c(boolean z) {
        this.e = z;
    }

    @Override // com.huawei.openalliance.ad.qy
    public boolean b() {
        return this.d;
    }

    @Override // com.huawei.openalliance.ad.qy
    public void b(boolean z) {
        this.d = z;
    }

    @Override // com.huawei.openalliance.ad.qy
    public void a(boolean z) {
        this.f19912c = z;
    }

    @Override // com.huawei.openalliance.ad.qy
    public void a(Map<Integer, AdContentRsp> map, long j, AdParseConfig adParseConfig) {
        hw.b("ApiProcessor", "api parser");
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, AdContentRsp> entry : map.entrySet()) {
            Integer key = entry.getKey();
            int iIntValue = key.intValue();
            hw.a("ApiProcessor", "adType: %d", key);
            a(iIntValue, entry.getValue(), j, adParseConfig);
        }
    }

    @Override // com.huawei.openalliance.ad.qy
    public void a() {
        pm pmVar = this.f;
        if (pmVar != null) {
            pmVar.c();
        }
    }

    private void c(final int i, AdContentRsp adContentRsp) {
        hw.a("ApiProcessor", "parseRewardAds");
        new px(this.f19911b, new px.a() { // from class: com.huawei.openalliance.ad.ou.3
            @Override // com.huawei.openalliance.ad.px.a
            public void a(Map<String, List<IRewardAd>> map) {
                if (map == null || map.isEmpty()) {
                    ou.this.f19910a.a(i, 900);
                } else {
                    ou.this.f19910a.a(i, map);
                }
            }

            @Override // com.huawei.openalliance.ad.px.a
            public void a(int i2) {
                ou.this.f19910a.a(i, i2);
            }
        }).a(adContentRsp);
    }

    private void b(final int i, AdContentRsp adContentRsp, long j, AdParseConfig adParseConfig) {
        hw.a("ApiProcessor", "parseNativeAds");
        pm pmVar = new pm(this.f19911b, new pm.a() { // from class: com.huawei.openalliance.ad.ou.4
            @Override // com.huawei.openalliance.ad.pm.a
            public void a(Map<String, List<INativeAd>> map) {
                ou.this.f19910a.a(i, map);
            }

            @Override // com.huawei.openalliance.ad.pm.a
            public void a(int i2) {
                ou.this.f19910a.a(i, i2);
            }
        }, i, adParseConfig.a());
        this.f = pmVar;
        pmVar.a(this.f19912c);
        this.f.b(this.d);
        this.f.c(this.e);
        this.f.a(i);
        this.f.a(adContentRsp, j, adParseConfig);
    }

    private void b(final int i, AdContentRsp adContentRsp) {
        hw.a("ApiProcessor", "parseInterstitialAds");
        new pg(this.f19911b, new pg.a() { // from class: com.huawei.openalliance.ad.ou.2
            @Override // com.huawei.openalliance.ad.pg.a
            public void a(Map<String, List<com.huawei.openalliance.ad.inter.data.b>> map) {
                ou.this.f19910a.a(i, map);
            }

            @Override // com.huawei.openalliance.ad.pg.a
            public void a(int i2) {
                ou.this.f19910a.a(i, i2);
            }
        }).a(adContentRsp);
    }

    private void a(int i, AdContentRsp adContentRsp, long j, AdParseConfig adParseConfig) {
        if (i != 3) {
            if (i == 7) {
                c(i, adContentRsp);
                return;
            }
            if (i != 9) {
                if (i == 60) {
                    a(i, adContentRsp);
                    return;
                } else if (i == 12) {
                    b(i, adContentRsp);
                    return;
                } else if (i != 13) {
                    return;
                }
            }
        }
        b(i, adContentRsp, j, adParseConfig);
    }

    private void a(final int i, AdContentRsp adContentRsp) {
        hw.a("ApiProcessor", "parsePlacementAds");
        ox.a(this.f19911b, new rj() { // from class: com.huawei.openalliance.ad.ou.1
            @Override // com.huawei.openalliance.ad.rj
            public void a(Map<String, List<IPlacementAd>> map, Map<String, List<IPlacementAd>> map2) {
                ou.this.f19910a.a(map, map2);
            }

            @Override // com.huawei.openalliance.ad.rj
            public void a(int i2) {
                ou.this.f19910a.a(i, i2);
            }
        }, false).a(adContentRsp);
    }

    public ou(Context context, a aVar) {
        this.f19911b = context;
        this.f19910a = aVar;
    }
}
