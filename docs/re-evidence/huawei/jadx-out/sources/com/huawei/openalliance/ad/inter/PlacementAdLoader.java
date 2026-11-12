package com.huawei.openalliance.ad.inter;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.openalliance.ad.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.beans.metadata.Video;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.ErrorCode;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.dw;
import com.huawei.openalliance.ad.en;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.IPlacementAd;
import com.huawei.openalliance.ad.inter.listeners.PlacementAdListener;
import com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager;
import com.huawei.openalliance.ad.ot;
import com.huawei.openalliance.ad.ox;
import com.huawei.openalliance.ad.pc;
import com.huawei.openalliance.ad.po;
import com.huawei.openalliance.ad.rj;
import com.huawei.openalliance.ad.sw;
import com.huawei.openalliance.ad.utils.ab;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.bo;
import com.huawei.openalliance.ad.utils.ck;
import com.huawei.openalliance.ad.utils.cw;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.o;
import com.huawei.openalliance.ad.utils.w;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class PlacementAdLoader implements IPlacementAdLoader, rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f19101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f19102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f19103c;
    private PlacementAdListener d;
    private ox e;
    private String f;
    private Boolean g;
    private int h;
    private String i;
    private int j;
    private boolean k;
    private boolean l;
    private dw m;
    private Map<String, List<IPlacementAd>> n;
    private Map<String, List<IPlacementAd>> o;
    private boolean p;
    private boolean q;
    private RequestOptions r;
    private Location s;
    private DelayInfo t;
    private String u;
    private int v;
    private int w;
    private Integer x;
    private String y;

    enum b {
        IDLE,
        LOADING
    }

    @Override // com.huawei.openalliance.ad.inter.IPlacementAdLoader
    public void stopCache() {
        dw dwVar = this.m;
        if (dwVar != null) {
            dwVar.i();
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IPlacementAdLoader
    public void startCache(int i) {
        hw.b("PlacementAdLoader", "startCache:" + i);
        dw dwVar = this.m;
        if (dwVar != null) {
            dwVar.a(Integer.valueOf(i));
            this.m.j();
        }
        if (this.n.isEmpty() && this.o.isEmpty()) {
            this.q = true;
            return;
        }
        w.a(this.n, i, false, 0);
        if (ck.a(this.f19102b).c()) {
            w.a(this.o, i, true, 0);
        } else {
            hw.c("PlacementAdLoader", "in background, do not preload contents");
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IPlacementAdLoader
    public void preLoadAds() {
        a(300, 1);
    }

    @Override // com.huawei.openalliance.ad.inter.IPlacementAdLoader
    public void loadAds(PlacementAdListener placementAdListener, int i, int i2) {
        this.d = placementAdListener;
        a(false, i, i2);
    }

    @Override // com.huawei.openalliance.ad.inter.IPlacementAdLoader
    public void loadAds(PlacementAdListener placementAdListener, int i) {
        loadAds(placementAdListener, i, 0);
    }

    @Override // com.huawei.openalliance.ad.inter.IPlacementAdLoader
    public void loadAds(PlacementAdListener placementAdListener) {
        loadAds(placementAdListener, 300, 1);
    }

    @Override // com.huawei.openalliance.ad.rj
    public void a(final Map<String, List<IPlacementAd>> map, final Map<String, List<IPlacementAd>> map2) {
        StringBuilder sb = new StringBuilder("onAdsLoaded, size:");
        sb.append(map == null ? 0 : map.size());
        hw.b("PlacementAdLoader", sb.toString());
        this.t.u().i(System.currentTimeMillis());
        a(map);
        this.n.clear();
        if (map != null) {
            this.n.putAll(map);
        }
        this.o.clear();
        if (map2 != null) {
            this.o.putAll(map2);
        }
        if (this.d != null) {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.PlacementAdLoader.2
                @Override // java.lang.Runnable
                public void run() {
                    PlacementAdListener placementAdListener = PlacementAdLoader.this.d;
                    PlacementAdLoader.this.t.b(System.currentTimeMillis());
                    int i = 200;
                    Map<String, List<IPlacementAd>> map3 = null;
                    if (placementAdListener != null) {
                        if (PlacementAdLoader.this.p) {
                            map3 = map2;
                        } else {
                            Map map4 = map;
                            if (map4 == null || map4.isEmpty()) {
                                i = 800;
                                placementAdListener.onAdFailed(800);
                            } else {
                                map3 = map;
                            }
                        }
                        placementAdListener.onAdsLoaded(map3);
                    }
                    com.huawei.openalliance.ad.analysis.d.a(PlacementAdLoader.this.f19102b, i, PlacementAdLoader.this.u, 60, map3, PlacementAdLoader.this.t);
                }
            });
        }
        if (this.l || this.q) {
            startCache(dw.h().g());
            this.q = false;
        }
    }

    @Override // com.huawei.openalliance.ad.rj
    public void a(final int i) {
        hw.b("PlacementAdLoader", "onAdFailed, errorCode:" + i);
        this.t.u().i(System.currentTimeMillis());
        if (this.d != null) {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.PlacementAdLoader.3
                @Override // java.lang.Runnable
                public void run() {
                    PlacementAdListener placementAdListener = PlacementAdLoader.this.d;
                    PlacementAdLoader.this.t.b(System.currentTimeMillis());
                    if (placementAdListener != null) {
                        placementAdListener.onAdFailed(i);
                    }
                    com.huawei.openalliance.ad.analysis.d.a(PlacementAdLoader.this.f19102b, i, PlacementAdLoader.this.u, 60, (Map) null, PlacementAdLoader.this.t);
                }
            });
        }
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f19114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f19115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f19116c = 4;
        private String d;
        private String e;
        private int f;
        private boolean g;
        private boolean h;
        private RequestOptions i;
        private Location j;
        private Integer k;

        public Builder setTest(boolean z) {
            this.g = z;
            return this;
        }

        public Builder setRequestOptions(RequestOptions requestOptions) {
            this.i = requestOptions;
            return this;
        }

        public Builder setMaxLength(int i) {
            this.f = i;
            return this;
        }

        public Builder setLocation(Location location) {
            this.j = location;
            return this;
        }

        public Builder setExtraInfo(String str) {
            this.d = str;
            return this;
        }

        public Builder setDeviceType(int i) {
            this.f19116c = i;
            return this;
        }

        public Builder setContentBundle(String str) {
            this.e = str;
            return this;
        }

        public Builder setAutoCache(boolean z) {
            this.h = z;
            return this;
        }

        public Builder setAdIds(String[] strArr) {
            if (strArr == null) {
                this.f19115b = null;
                return this;
            }
            this.f19115b = (String[]) Arrays.copyOf(strArr, strArr.length);
            a(strArr);
            return this;
        }

        public Context g() {
            return this.f19114a;
        }

        public boolean f() {
            return this.h;
        }

        public boolean e() {
            return this.g;
        }

        public int d() {
            return this.f;
        }

        public String c() {
            return this.d;
        }

        public PlacementAdLoader build() {
            return new PlacementAdLoader(this);
        }

        public int b() {
            return this.f19116c;
        }

        public String[] a() {
            String[] strArr = this.f19115b;
            return strArr != null ? (String[]) Arrays.copyOf(strArr, strArr.length) : new String[0];
        }

        public Builder a(Integer num) {
            this.k = num;
            return this;
        }

        private void a(final String[] strArr) {
            if (bm.a(strArr)) {
                return;
            }
            o.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.PlacementAdLoader.Builder.1
                @Override // java.lang.Runnable
                public void run() {
                    fp.b(Builder.this.f19114a).r(strArr[0]);
                }
            });
        }

        public Builder(Context context) {
            this.f19114a = context.getApplicationContext();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        this.f = str;
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException unused) {
            hw.c("PlacementAdLoader", "extra info is not json string");
            return false;
        }
    }

    private void a(boolean z, int i, int i2) {
        this.t.a(System.currentTimeMillis());
        hw.b("PlacementAdLoader", "loadAds");
        this.p = z;
        this.v = i;
        this.w = i2;
        this.n.clear();
        this.o.clear();
        if (!as.b(this.f19102b)) {
            hw.c("PlacementAdLoader", "api level too low");
            a(1001);
            return;
        }
        if (!a(this.i)) {
            hw.c("PlacementAdLoader", "extra info is invalid");
            a(ErrorCode.ERROR_PLACEMENT_INVALID_PARAM);
            return;
        }
        if (b.LOADING == this.f19101a) {
            hw.b("PlacementAdLoader", "waiting for request finish");
            a(801);
            return;
        }
        String[] strArr = this.f19103c;
        if (strArr == null || strArr.length == 0) {
            hw.c("PlacementAdLoader", "empty ad ids");
            a(ErrorCode.ERROR_PLACEMENT_EMPTY_AD_IDS);
            return;
        }
        if (i <= 0) {
            hw.c("PlacementAdLoader", "invalid totalDuration.");
            a(ErrorCode.ERROR_PLACEMENT_INVALID_PARAM);
            return;
        }
        if (i2 < 0) {
            hw.c("PlacementAdLoader", "invalid maxCount");
            a(ErrorCode.ERROR_PLACEMENT_INVALID_PARAM);
            return;
        }
        bo.b(this.f19102b, this.r);
        en.a(this.f19102b).e();
        this.f19101a = b.LOADING;
        Pair<String, Boolean> pairB = com.huawei.openalliance.ad.utils.d.b(this.f19102b, true);
        if (pairB == null && cc.h(this.f19102b)) {
            hw.b("PlacementAdLoader", "start to request oaid " + System.currentTimeMillis());
            OAIDServiceManager.getInstance(this.f19102b).requireOaid(new a(z));
            return;
        }
        if (pairB != null) {
            hw.b("PlacementAdLoader", "use cached oaid " + System.currentTimeMillis());
            b((String) pairB.first);
            a((Boolean) pairB.second);
        }
        a(this.h, z, this.i, this.j, this.k);
    }

    private void a(final Map<String, List<IPlacementAd>> map) {
        o.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.PlacementAdLoader.4
            @Override // java.lang.Runnable
            public void run() {
                List<ContentRecord> listA = po.a(map);
                byte[] bArrB = cw.b(PlacementAdLoader.this.f19102b);
                for (ContentRecord contentRecord : listA) {
                    if (contentRecord != null) {
                        contentRecord.a(bArrB);
                        pc pcVar = new pc(PlacementAdLoader.this.f19102b, sw.a(PlacementAdLoader.this.f19102b, contentRecord.f()));
                        pcVar.a(contentRecord);
                        pcVar.o();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Boolean bool) {
        this.g = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final boolean z, final String str, final int i2, final boolean z2) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        o.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.PlacementAdLoader.1
            @Override // java.lang.Runnable
            public void run() {
                hw.b("PlacementAdLoader", "doRequestAd " + System.currentTimeMillis());
                PlacementAdLoader.this.t.d(System.currentTimeMillis() - jCurrentTimeMillis);
                Video video = new Video(i2);
                int iD = com.huawei.openalliance.ad.utils.d.d(PlacementAdLoader.this.f19102b);
                int iE = com.huawei.openalliance.ad.utils.d.e(PlacementAdLoader.this.f19102b);
                boolean zJ = ab.j(PlacementAdLoader.this.f19102b);
                int i3 = zJ ? iE : iD;
                if (!zJ) {
                    iD = iE;
                }
                AdSlotParam.Builder builder = new AdSlotParam.Builder();
                builder.setAdIds(Arrays.asList(PlacementAdLoader.this.f19103c)).setDeviceType(i).setIsPreload(Boolean.valueOf(z)).setOrientation(1).setWidth(i3).setHeight(iD).setOaid(PlacementAdLoader.this.f).setTrackLimited(PlacementAdLoader.this.g).setTest(z2).setRequestOptions(PlacementAdLoader.this.r).setLocation(PlacementAdLoader.this.s).setMaxCount(PlacementAdLoader.this.w).setContentBundle(PlacementAdLoader.this.y).setTotalDuration(PlacementAdLoader.this.v).a(video);
                if (PlacementAdLoader.this.x != null) {
                    builder.c(PlacementAdLoader.this.x);
                }
                ot otVar = new ot(PlacementAdLoader.this.f19102b);
                otVar.a(PlacementAdLoader.this.t);
                AdContentRsp adContentRspA = otVar.a(builder.build(), str);
                if (adContentRspA != null) {
                    PlacementAdLoader.this.u = adContentRspA.k();
                }
                PlacementAdLoader.this.t.u().h(System.currentTimeMillis());
                PlacementAdLoader placementAdLoader = PlacementAdLoader.this;
                placementAdLoader.e = ox.a(placementAdLoader.f19102b, PlacementAdLoader.this, z);
                PlacementAdLoader.this.e.a(adContentRspA);
                PlacementAdLoader.this.f19101a = b.IDLE;
            }
        }, o.a.NETWORK, false);
    }

    private void a(int i, int i2) {
        a(true, i, i2);
        ck.a(this.f19102b).a(this.h);
        ck.a(this.f19102b).a(this.f19103c);
    }

    class a extends OAIDServiceManager.OaidResultCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f19120b;

        @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
        public int b() {
            return 60;
        }

        @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
        public void a(String str, boolean z) {
            hw.b("PlacementAdLoader", "onOaidAcquired " + System.currentTimeMillis());
            PlacementAdLoader.this.b(str);
            PlacementAdLoader.this.a(Boolean.valueOf(z));
            PlacementAdLoader placementAdLoader = PlacementAdLoader.this;
            placementAdLoader.a(placementAdLoader.h, this.f19120b, PlacementAdLoader.this.i, PlacementAdLoader.this.j, PlacementAdLoader.this.k);
            com.huawei.openalliance.ad.utils.d.a(PlacementAdLoader.this.f19102b, str, z);
        }

        @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
        public void a() {
            hw.b("PlacementAdLoader", "onOaidAcquireFailed " + System.currentTimeMillis());
            PlacementAdLoader placementAdLoader = PlacementAdLoader.this;
            placementAdLoader.a(placementAdLoader.h, this.f19120b, PlacementAdLoader.this.i, PlacementAdLoader.this.j, PlacementAdLoader.this.k);
        }

        public a(boolean z) {
            this.f19120b = z;
        }
    }

    private PlacementAdLoader(Builder builder) {
        this.f19101a = b.IDLE;
        this.n = new HashMap(4);
        this.o = new HashMap(4);
        this.p = false;
        this.q = false;
        this.t = new DelayInfo();
        if (builder == null || builder.g() == null || !as.b(builder.g())) {
            this.f19103c = new String[0];
            return;
        }
        this.f19102b = builder.g();
        String[] strArrA = builder.a();
        if (bm.a(strArrA)) {
            this.f19103c = new String[0];
        } else {
            String[] strArr = new String[strArrA.length];
            this.f19103c = strArr;
            System.arraycopy(strArrA, 0, strArr, 0, strArrA.length);
        }
        this.h = builder.b();
        this.i = builder.c();
        this.j = builder.d();
        this.k = builder.e();
        this.l = builder.f();
        this.m = dw.h();
        this.s = builder.j;
        this.r = builder.i;
        this.x = builder.k;
        this.y = builder.e;
    }
}
