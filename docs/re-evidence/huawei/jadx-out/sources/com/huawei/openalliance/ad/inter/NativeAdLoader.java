package com.huawei.openalliance.ad.inter;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.openalliance.ad.beans.inner.AdContentData;
import com.huawei.openalliance.ad.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.en;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.inter.listeners.ContentIdListener;
import com.huawei.openalliance.ad.inter.listeners.NativeAdListener;
import com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager;
import com.huawei.openalliance.ad.ot;
import com.huawei.openalliance.ad.pm;
import com.huawei.openalliance.ad.re;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.bo;
import com.huawei.openalliance.ad.utils.br;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class NativeAdLoader implements INativeAdLoader, pm.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f19081b = "NativeAdLoader";
    private String A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f19082a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f19083c;
    private Context d;
    private final String[] e;
    private String f;
    private Boolean g;
    private NativeAdListener h;
    private re i;
    private String j;
    private int k;
    private List<String> l;
    private RequestOptions m;
    private String n;
    private Location o;
    private String p;
    private DelayInfo q;
    private Integer r;
    private List<Integer> s;
    private boolean t;
    private Integer u;
    private Integer v;
    private Integer w;
    private Integer x;
    private Integer y;
    private int z;

    enum a {
        IDLE,
        LOADING
    }

    @Override // com.huawei.openalliance.ad.inter.INativeAdLoader
    public void setSupportTptAd(boolean z) {
        hw.b(f19081b, "setSupportTptAd: %s", Boolean.valueOf(z));
        this.t = z;
    }

    @Override // com.huawei.openalliance.ad.inter.INativeAdLoader
    public void setRequestOptions(RequestOptions requestOptions) {
        this.m = requestOptions;
    }

    @Override // com.huawei.openalliance.ad.inter.INativeAdLoader
    public void setMaxAdNumbers(int i) {
        this.z = i;
    }

    @Override // com.huawei.openalliance.ad.inter.INativeAdLoader
    public void setLocation(Location location) {
        this.o = location;
    }

    @Override // com.huawei.openalliance.ad.inter.INativeAdLoader
    public void setListener(NativeAdListener nativeAdListener) {
        this.h = nativeAdListener;
    }

    @Override // com.huawei.openalliance.ad.inter.INativeAdLoader
    public void setJssdkVersion(String str) {
        hw.b(f19081b, "setJssdkVersion: %s", str);
        this.A = str;
    }

    @Override // com.huawei.openalliance.ad.inter.INativeAdLoader
    public void setIsSmart(Integer num) {
        this.u = num;
    }

    @Override // com.huawei.openalliance.ad.inter.INativeAdLoader
    public void setExtraInfo(String str) {
        this.j = str;
    }

    @Override // com.huawei.openalliance.ad.inter.INativeAdLoader
    public void setDetailedCreativeType(List<Integer> list) {
        this.s = list;
    }

    @Override // com.huawei.openalliance.ad.inter.INativeAdLoader
    public void setContentIdListener(ContentIdListener contentIdListener) {
        re reVar = this.i;
        if (reVar != null) {
            reVar.a(contentIdListener);
        }
    }

    @Override // com.huawei.openalliance.ad.inter.INativeAdLoader
    public void setContentBundle(String str) {
        this.n = str;
    }

    @Override // com.huawei.openalliance.ad.inter.INativeAdLoader
    public void setAudioTotalDuration(Integer num) {
        this.y = num;
    }

    @Override // com.huawei.openalliance.ad.inter.INativeAdLoader
    public void setAdsReturnedFromThread(boolean z) {
        this.f19082a = z;
    }

    @Override // com.huawei.openalliance.ad.inter.INativeAdLoader
    public void setAdWidth(Integer num) {
        this.v = num;
    }

    @Override // com.huawei.openalliance.ad.inter.INativeAdLoader
    public void setAdHeight(Integer num) {
        this.w = num;
    }

    @Override // com.huawei.openalliance.ad.inter.INativeAdLoader
    public void loadAds(int i, boolean z) {
        loadAds(i, null, z);
    }

    @Override // com.huawei.openalliance.ad.inter.INativeAdLoader
    public void loadAds(final int i, final String str, final boolean z) {
        RequestOptions requestOptions;
        this.q.a(System.currentTimeMillis());
        String str2 = f19081b;
        hw.b(str2, "loadAds");
        if (!as.b(this.d)) {
            a(1001);
            return;
        }
        if (a.LOADING == this.f19083c) {
            hw.b(str2, "waiting for request finish");
            a(701);
            return;
        }
        String[] strArr = this.e;
        if (strArr == null || strArr.length == 0) {
            hw.c(str2, "empty ad ids");
            a(702);
            return;
        }
        if (this.k == 13 && ((requestOptions = this.m) == null || TextUtils.isEmpty(requestOptions.getSearchTerm()))) {
            hw.c(str2, "search ad's searchTerm is empty");
            a(1000);
            return;
        }
        bo.b(this.d, this.m);
        en.a(this.d).e();
        this.f19083c = a.LOADING;
        Pair<String, Boolean> pairB = com.huawei.openalliance.ad.utils.d.b(this.d, true);
        if (pairB == null && fp.b(this.d).bz() && cc.h(this.d)) {
            hw.b(str2, "start to request oaid " + System.currentTimeMillis());
            OAIDServiceManager.getInstance(this.d).requireOaid(new OAIDServiceManager.OaidResultCallback() { // from class: com.huawei.openalliance.ad.inter.NativeAdLoader.1
                @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
                public int b() {
                    return NativeAdLoader.this.k;
                }

                @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
                public void a(String str3, boolean z2) {
                    hw.b(NativeAdLoader.f19081b, "onOaidAcquired " + System.currentTimeMillis());
                    NativeAdLoader.this.a(str3);
                    NativeAdLoader.this.a(Boolean.valueOf(z2));
                    NativeAdLoader.this.a(i, str, z);
                    com.huawei.openalliance.ad.utils.d.a(NativeAdLoader.this.d, str3, z2);
                }

                @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
                public void a() {
                    hw.b(NativeAdLoader.f19081b, "onOaidAcquireFailed " + System.currentTimeMillis());
                    NativeAdLoader.this.a(i, str, z);
                }
            });
            return;
        }
        if (pairB != null) {
            hw.b(str2, "use cached oaid " + System.currentTimeMillis());
            a((String) pairB.first);
            a((Boolean) pairB.second);
        }
        a(i, str, z);
    }

    @Override // com.huawei.openalliance.ad.inter.INativeAdLoader
    public void enableDirectReturnVideoAd(boolean z) {
        re reVar = this.i;
        if (reVar != null) {
            reVar.a(z);
        }
    }

    @Override // com.huawei.openalliance.ad.inter.INativeAdLoader
    public void enableDirectCacheVideo(boolean z) {
        re reVar = this.i;
        if (reVar != null) {
            reVar.c(z);
        }
    }

    public void b(Integer num) {
        this.x = num;
        this.q.c(num);
    }

    @Override // com.huawei.openalliance.ad.pm.a
    public void a(final Map<String, List<INativeAd>> map) {
        String str = f19081b;
        StringBuilder sb = new StringBuilder("onAdsLoaded, size:");
        sb.append(map != null ? Integer.valueOf(map.size()) : null);
        sb.append(", listener:");
        sb.append(this.h);
        hw.b(str, sb.toString());
        if (this.h == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.q.u().i(jCurrentTimeMillis);
        if (this.f19082a) {
            this.q.b(jCurrentTimeMillis);
            hw.b(str, "onAdsLoaded thread");
            if (this.h != null) {
                this.h.onAdsLoaded(as.a(this.d, map));
            }
            com.huawei.openalliance.ad.analysis.d.a(this.d, 200, this.p, this.k, map, this.q);
        } else {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.NativeAdLoader.3
                @Override // java.lang.Runnable
                public void run() {
                    NativeAdListener nativeAdListener = NativeAdLoader.this.h;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    NativeAdLoader.this.q.b(jCurrentTimeMillis2);
                    long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                    NativeAdLoader.this.q.g(j);
                    hw.b(NativeAdLoader.f19081b, "onAdsLoaded main thread switch: %s ms", Long.valueOf(j));
                    if (nativeAdListener != null) {
                        nativeAdListener.onAdsLoaded(as.a(NativeAdLoader.this.d, (Map<String, List<INativeAd>>) map));
                    }
                    com.huawei.openalliance.ad.analysis.d.a(NativeAdLoader.this.d, 200, NativeAdLoader.this.p, NativeAdLoader.this.k, map, NativeAdLoader.this.q);
                }
            });
        }
        b(map);
    }

    public void a(Integer num) {
        this.r = num;
    }

    @Override // com.huawei.openalliance.ad.pm.a
    public void a(final int i) {
        String str = f19081b;
        hw.b(str, "onAdFailed, errorCode:" + i);
        if (this.h == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.q.u().i(jCurrentTimeMillis);
        if (!this.f19082a) {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.NativeAdLoader.5
                @Override // java.lang.Runnable
                public void run() {
                    NativeAdListener nativeAdListener = NativeAdLoader.this.h;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    NativeAdLoader.this.q.b(jCurrentTimeMillis2);
                    long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                    NativeAdLoader.this.q.g(j);
                    hw.b(NativeAdLoader.f19081b, "onAdFailed main thread switch: %s ms", Long.valueOf(j));
                    if (nativeAdListener != null) {
                        nativeAdListener.onAdFailed(i);
                    }
                    com.huawei.openalliance.ad.analysis.d.a(NativeAdLoader.this.d, i, NativeAdLoader.this.p, NativeAdLoader.this.k, (Map) null, NativeAdLoader.this.q);
                }
            });
            return;
        }
        this.q.b(jCurrentTimeMillis);
        hw.b(str, "onAdFailed thread");
        this.h.onAdFailed(i);
        com.huawei.openalliance.ad.analysis.d.a(this.d, i, this.p, this.k, (Map) null, this.q);
    }

    private List<AdContentData> d(Map<String, List<INativeAd>> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<INativeAd>> entry : map.entrySet()) {
            if (entry != null && !bm.a(entry.getValue())) {
                for (INativeAd iNativeAd : entry.getValue()) {
                    if (iNativeAd instanceof com.huawei.openalliance.ad.inter.data.e) {
                        com.huawei.openalliance.ad.inter.data.e eVar = (com.huawei.openalliance.ad.inter.data.e) iNativeAd;
                        if (99 == eVar.getCreativeType()) {
                            arrayList.add(eVar.v());
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(Map<String, List<INativeAd>> map) {
        String str;
        String str2;
        if (br.a(map)) {
            str = f19081b;
            str2 = "nativeAdsMap is empty";
        } else {
            List<AdContentData> listD = d(map);
            if (!bm.a(listD)) {
                if (com.huawei.openalliance.ad.utils.c.b() && com.huawei.openalliance.ad.e.b() != null) {
                    try {
                        String strB = bk.b(listD);
                        hw.a(f19081b, "contentJson : %s", strB);
                        if (this.i != null) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean(ParamConstants.Param.DOWNLOAD_IN_DATA, this.i.a());
                            bundle.putBoolean("directCacheVideo", this.i.b());
                            com.huawei.openalliance.ad.e.b().a(strB, bundle);
                        } else {
                            com.huawei.openalliance.ad.e.b().a(strB, (Bundle) null);
                        }
                        this.i.c();
                        return true;
                    } catch (Throwable th) {
                        hw.c(f19081b, "down err: %s", th.getClass().getSimpleName());
                    }
                }
                return false;
            }
            str = f19081b;
            str2 = "tpt ads is empty";
        }
        hw.a(str, str2);
        return false;
    }

    private void b(final Map<String, List<INativeAd>> map) {
        o.d(new Runnable() { // from class: com.huawei.openalliance.ad.inter.NativeAdLoader.4
            @Override // java.lang.Runnable
            public void run() {
                NativeAdLoader.this.c((Map<String, List<INativeAd>>) map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        IHiAdSplash hiAdSplash = HiAdSplash.getInstance(this.d);
        if (hiAdSplash instanceof HiAdSplash) {
            HiAdSplash hiAdSplash2 = (HiAdSplash) hiAdSplash;
            long jBI = fp.b(this.d).bI();
            long jA = hiAdSplash2.a();
            if (System.currentTimeMillis() - jA >= jBI) {
                hiAdSplash2.preloadAd();
                return;
            }
            hw.b(f19081b, "request time limit, timeInter=" + jBI + ", lastTime=" + jA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        this.f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Boolean bool) {
        this.g = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final String str, final boolean z) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        o.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.NativeAdLoader.2
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                NativeAdLoader.this.q.d(jCurrentTimeMillis2 - jCurrentTimeMillis);
                hw.b(NativeAdLoader.f19081b, "doRequestAd " + jCurrentTimeMillis2);
                AdSlotParam.Builder builder = new AdSlotParam.Builder();
                builder.setAdIds(Arrays.asList(NativeAdLoader.this.e)).setDeviceType(i).setRequestSequence(str).setOrientation(1).setWidth(com.huawei.openalliance.ad.utils.d.d(NativeAdLoader.this.d)).setHeight(com.huawei.openalliance.ad.utils.d.e(NativeAdLoader.this.d)).setOaid(NativeAdLoader.this.f).setTrackLimited(NativeAdLoader.this.g).setTest(z).setRequestOptions(NativeAdLoader.this.m).setLocation(NativeAdLoader.this.o).a(NativeAdLoader.this.r).b(NativeAdLoader.this.u).setDetailedCreativeTypeList(NativeAdLoader.this.s).setContentBundle(NativeAdLoader.this.n).setMaxCount(NativeAdLoader.this.z).a(NativeAdLoader.this.t);
                if (NativeAdLoader.this.v != null && NativeAdLoader.this.w != null) {
                    builder.setAdWidth(NativeAdLoader.this.v);
                    builder.setAdHeight(NativeAdLoader.this.w);
                }
                if (NativeAdLoader.this.x != null) {
                    builder.c(NativeAdLoader.this.x);
                }
                if (NativeAdLoader.this.y != null) {
                    builder.setTotalDuration(NativeAdLoader.this.y.intValue());
                }
                if (NativeAdLoader.this.A != null) {
                    builder.a(NativeAdLoader.this.A);
                }
                ot otVar = new ot(NativeAdLoader.this.d);
                otVar.a(NativeAdLoader.this.q);
                AdContentRsp adContentRspA = otVar.a(NativeAdLoader.this.d, builder.build(), NativeAdLoader.this.j, NativeAdLoader.this.k, NativeAdLoader.this.l);
                if (adContentRspA != null) {
                    NativeAdLoader.this.p = adContentRspA.k();
                }
                hw.b(NativeAdLoader.f19081b, "doRequestAd, ad loaded,adType is " + NativeAdLoader.this.k + ",cacheContentIds is " + NativeAdLoader.this.l);
                NativeAdLoader.this.q.u().h(System.currentTimeMillis());
                NativeAdLoader.this.i.a(adContentRspA, jCurrentTimeMillis2, new AdParseConfig.Builder().build());
                NativeAdLoader.this.f19083c = a.IDLE;
                NativeAdLoader.this.b();
            }
        }, o.a.NETWORK, false);
    }

    public NativeAdLoader(Context context, String[] strArr, boolean z) {
        this.f19083c = a.IDLE;
        this.k = 3;
        this.l = null;
        this.q = new DelayInfo();
        this.t = false;
        if (!as.b(context)) {
            this.e = new String[0];
            return;
        }
        this.d = context.getApplicationContext();
        if (strArr == null || strArr.length <= 0) {
            this.e = new String[0];
        } else {
            String[] strArr2 = new String[strArr.length];
            this.e = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        }
        pm pmVar = new pm(this.d, this, this.k, false);
        this.i = pmVar;
        pmVar.b(z);
    }

    public NativeAdLoader(Context context, String[] strArr, int i, List<String> list) {
        this(context, strArr, false);
        this.k = i;
        this.l = list;
        re reVar = this.i;
        if (reVar != null) {
            reVar.a(i);
        }
    }

    public NativeAdLoader(Context context, String[] strArr) {
        this(context, strArr, false);
    }
}
