package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.constant.ApiNames;
import com.huawei.openalliance.ad.inter.data.IPlacementAd;
import com.huawei.openalliance.ad.inter.listeners.PlacementAdListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class gv implements gs {
    private boolean f;
    private Context g;
    private PlacementAdListener h;
    private String i;
    private long j;
    private long k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f18844a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f18845b = false;
    private Map<String, List<IPlacementAd>> d = new HashMap(4);
    private Map<String, List<IPlacementAd>> e = new HashMap(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dw f18846c = dw.h();

    @Override // com.huawei.openalliance.ad.gs
    public void a(qy qyVar) {
    }

    public void b(int i) {
        hw.b("PlacementAd", "startCache:" + i);
        dw dwVar = this.f18846c;
        if (dwVar != null) {
            dwVar.a(Integer.valueOf(i));
            this.f18846c.j();
        }
        if (this.d.isEmpty() && this.e.isEmpty()) {
            this.f18845b = true;
            return;
        }
        com.huawei.openalliance.ad.utils.w.a(this.d, i, false, 1);
        if (com.huawei.openalliance.ad.utils.ck.a(this.g).c()) {
            com.huawei.openalliance.ad.utils.w.a(this.e, i, true, 1);
        } else {
            hw.c("PlacementAd", "in background, do not preload contents");
        }
    }

    public void b() {
        if (this.f || this.f18845b) {
            b(dw.h().g());
            this.f18845b = false;
        }
    }

    public void a(final Map<String, List<IPlacementAd>> map, final Map<String, List<IPlacementAd>> map2) {
        this.d.clear();
        if (map != null) {
            this.d.putAll(map);
        }
        this.e.clear();
        if (map2 != null) {
            this.e.putAll(map2);
        }
        if (this.h != null) {
            com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.gv.1
                @Override // java.lang.Runnable
                public void run() {
                    int i;
                    gv gvVar;
                    Map map3;
                    gv.this.k = System.currentTimeMillis();
                    if (!gv.this.f18844a) {
                        Map map4 = map;
                        if (map4 == null || map4.isEmpty()) {
                            gv.this.a(800);
                            i = 800;
                        } else {
                            gvVar = gv.this;
                            map3 = map;
                        }
                        com.huawei.openalliance.ad.analysis.d.a(gv.this.g, ApiNames.API_LOAD_AD, gv.this.i, 1, 60, gv.this.j, gv.this.k, i);
                    }
                    gvVar = gv.this;
                    map3 = map2;
                    gvVar.a(map3);
                    i = 200;
                    com.huawei.openalliance.ad.analysis.d.a(gv.this.g, ApiNames.API_LOAD_AD, gv.this.i, 1, 60, gv.this.j, gv.this.k, i);
                }
            });
        }
    }

    @Override // com.huawei.openalliance.ad.gs
    public void a(Map map) {
        StringBuilder sb = new StringBuilder("onAdsLoaded, size:");
        sb.append(map != null ? Integer.valueOf(map.size()) : null);
        sb.append(", listener:");
        sb.append(this.h);
        hw.b("PlacementAd", sb.toString());
        PlacementAdListener placementAdListener = this.h;
        if (placementAdListener != null) {
            placementAdListener.onAdsLoaded(map);
        }
    }

    public void a(String str) {
        this.i = str;
    }

    public void a(long j) {
        this.j = j;
    }

    @Override // com.huawei.openalliance.ad.gs
    public void a(int i) {
        hw.b("PlacementAd", "onAdFailed, errorCode:" + i);
        PlacementAdListener placementAdListener = this.h;
        if (placementAdListener != null) {
            placementAdListener.onAdFailed(i);
        }
    }

    public void a() {
        dw dwVar = this.f18846c;
        if (dwVar != null) {
            dwVar.i();
        }
    }

    public gv(Context context, PlacementAdListener placementAdListener, boolean z) {
        this.g = context;
        this.h = placementAdListener;
        this.f = z;
        this.d.clear();
        this.e.clear();
    }
}
