package com.huawei.openalliance.ad.inter;

import android.content.Context;
import android.util.Pair;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.AdLoadMode;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.RTCMethods;
import com.huawei.openalliance.ad.db;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.dd;
import com.huawei.openalliance.ad.en;
import com.huawei.openalliance.ad.ew;
import com.huawei.openalliance.ad.fl;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.fz;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.na;
import com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager;
import com.huawei.openalliance.ad.ot;
import com.huawei.openalliance.ad.po;
import com.huawei.openalliance.ad.pv;
import com.huawei.openalliance.ad.qw;
import com.huawei.openalliance.ad.ri;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.bo;
import com.huawei.openalliance.ad.utils.bu;
import com.huawei.openalliance.ad.utils.cu;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dj;
import com.huawei.openalliance.ad.utils.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class HiAdSplash implements IHiAdSplash {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HiAdSplash f19053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f19054b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f19055c;
    private gk d;
    private fz e;
    private AdSlotParam f;
    private long g;
    private Integer h = null;

    @Override // com.huawei.openalliance.ad.inter.IHiAdSplash
    public void setUsePostAtFront(boolean z) {
        this.d.a(z);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAdSplash
    public void setSmartScreenSloganTime(int i) {
        if (!as.b(this.f19055c) || i < 0 || i > 5000) {
            return;
        }
        this.d.d(i);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAdSplash
    public void setSloganShowTimeWhenNoAd(final int i) {
        if (cc.b(this.f19055c)) {
            hw.b("HiAdSplash", "setSloganShowTimeWhenNoAd");
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAdSplash.9
                @Override // java.lang.Runnable
                public void run() {
                    na.a(HiAdSplash.this.f19055c).a(RTCMethods.SET_SLOGAN_TIME_NO_AD, String.valueOf(i), null, null);
                }
            });
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAdSplash
    public void setSloganDefTime(int i) {
        if (as.b(this.f19055c)) {
            if (i < 0 || i > 5000) {
                hw.d("HiAdSplash", "time is out limit");
            } else {
                this.d.c(i);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAdSplash
    public void setExSplashShowTime(final int i) {
        if (cc.b(this.f19055c)) {
            hw.b("HiAdSplash", "setExSplashShowTime");
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAdSplash.2
                @Override // java.lang.Runnable
                public void run() {
                    na.a(HiAdSplash.this.f19055c).a(RTCMethods.SET_SPLASH_TIME, String.valueOf(i), null, null);
                }
            });
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAdSplash
    public void setDefaultSplashMode(int i) {
        if (1 == i || 2 == i) {
            fp.b(this.f19055c).k(i);
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAdSplash
    public void setAllowMobileTraffic(int i) {
        this.h = (i == 0 || i == 1) ? Integer.valueOf(i) : null;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAdSplash
    public void preloadSmartScreenAd(AdSlotParam adSlotParam) {
        a(adSlotParam, 18);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAdSplash
    public void preloadSmartScreenAd() {
        preloadSmartScreenAd(this.f);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAdSplash
    public void preloadAd(AdSlotParam adSlotParam) {
        a(adSlotParam, 1);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAdSplash
    public void preloadAd() {
        preloadAd(this.f);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAdSplash
    public boolean isSmartSplashAvailable(AdSlotParam adSlotParam) {
        adSlotParam.d(18);
        return b(adSlotParam);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAdSplash
    public boolean isExSplashEnable(Context context) {
        return com.huawei.openalliance.ad.utils.d.s(context);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAdSplash
    public boolean isAvailable(AdSlotParam adSlotParam) {
        adSlotParam.d(1);
        return b(adSlotParam);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAdSplash
    public Integer getAllowMobileTraffic() {
        return this.h;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAdSplash
    public void enableLinkedVideo(final boolean z) {
        if (cc.b(this.f19055c)) {
            hw.b("HiAdSplash", RTCMethods.ENABLE_LINKED_VIDEO);
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAdSplash.7
                @Override // java.lang.Runnable
                public void run() {
                    na.a(HiAdSplash.this.f19055c).a(RTCMethods.ENABLE_LINKED_VIDEO, String.valueOf(z), null, null);
                }
            });
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAdSplash
    public void dismissExSplashSlogan() {
        if (cc.b(this.f19055c)) {
            hw.b("HiAdSplash", RTCMethods.DISMISS_EXSPLASH_SLOGAN);
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAdSplash.8
                @Override // java.lang.Runnable
                public void run() {
                    na.a(HiAdSplash.this.f19055c).a(RTCMethods.DISMISS_EXSPLASH_SLOGAN, null, null, null);
                }
            });
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAdSplash
    public void dismissExSplash() {
        if (cc.b(this.f19055c)) {
            hw.b("HiAdSplash", RTCMethods.DISMISS_EXSPLASH);
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAdSplash.10
                @Override // java.lang.Runnable
                public void run() {
                    na.a(HiAdSplash.this.f19055c).a(RTCMethods.DISMISS_EXSPLASH, null, null, null);
                }
            });
        }
    }

    public void a(AdSlotParam adSlotParam) {
        if (adSlotParam != null) {
            this.f = adSlotParam.I();
        }
    }

    public long a() {
        return this.g;
    }

    public static IHiAdSplash getInstance(Context context) {
        return a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(AdSlotParam adSlotParam) {
        adSlotParam.a(false);
        int iD = adSlotParam.D();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ot otVar = new ot(this.f19055c);
        otVar.a(otVar.a(this.f19055c, adSlotParam, iD), adSlotParam, new a(iD), (qw) null, jCurrentTimeMillis, 1);
    }

    private boolean b(final AdSlotParam adSlotParam) {
        if (adSlotParam == null || !as.b(this.f19055c)) {
            return false;
        }
        en.a(this.f19055c).e();
        this.f = adSlotParam.I();
        int iA = com.huawei.openalliance.ad.utils.d.a(this.f19055c, adSlotParam.b());
        int iB = com.huawei.openalliance.ad.utils.d.b(this.f19055c, adSlotParam.b());
        adSlotParam.b(iA);
        adSlotParam.c(iB);
        boolean zBooleanValue = ((Boolean) dj.a(new Callable<Boolean>() { // from class: com.huawei.openalliance.ad.inter.HiAdSplash.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean call() {
                AdLoadMode adLoadModeAS = HiAdSplash.this.d.aS();
                long jAZ = HiAdSplash.this.d.aZ();
                hw.b("HiAdSplash", "isAvailable mode: " + adLoadModeAS + " sloganShowTime: " + jAZ);
                if (AdLoadMode.CACHE != adLoadModeAS || 0 != jAZ || (!HiAdSplash.this.b() && HiAdSplash.this.e.a(adSlotParam.a().get(0), adSlotParam.b(), HiAdSplash.this.d.ba(), adSlotParam.D()) != null)) {
                    hw.b("HiAdSplash", "isAvailable call true");
                    return true;
                }
                hw.b("HiAdSplash", "isAvailable call false");
                o.b(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAdSplash.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Pair<String, Boolean> pairB = com.huawei.openalliance.ad.utils.d.b(HiAdSplash.this.f19055c, true);
                        if (pairB == null && HiAdSplash.this.d.by() && cc.h(HiAdSplash.this.f19055c)) {
                            HiAdSplash.this.a(adSlotParam, HiAdSplash.this.f19055c);
                            return;
                        }
                        if (pairB != null) {
                            hw.b("HiAdSplash", "use cached oaid ");
                            adSlotParam.a((String) pairB.first);
                            adSlotParam.a((Boolean) pairB.second);
                        }
                        HiAdSplash.this.c(adSlotParam);
                    }
                });
                return false;
            }
        }, false)).booleanValue();
        hw.b("HiAdSplash", "isAvailable " + zBooleanValue);
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        db dbVar = new db(this.f19055c);
        dbVar.a(new dd(this.f19055c));
        return dbVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AdSlotParam adSlotParam, int i) {
        hw.a("HiAdSplash", "do preload from sdk");
        ot otVar = new ot(this.f19055c);
        otVar.a(otVar.a(this.f19055c, adSlotParam, i), adSlotParam, new b(i), (qw) null, this.g, 1);
    }

    private void a(final String str, final int i) {
        bu.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAdSplash.5
            @Override // java.lang.Runnable
            public void run() {
                o.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAdSplash.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        int iA = fl.a(HiAdSplash.this.f19055c).a(str);
                        if (iA == 0 || (1 != iA && as.d(HiAdSplash.this.f19055c))) {
                            new pv(HiAdSplash.this.f19055c, true, i).d();
                        }
                    }
                }, o.a.DISK_CACHE, false);
            }
        }, 30000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdSlotParam adSlotParam, List<String> list, List<String> list2) {
        hw.a("HiAdSplash", "do preload from kit");
        adSlotParam.a(this.h);
        String strA = com.huawei.openalliance.ad.e.a();
        if (!dg.b(strA)) {
            adSlotParam.c(strA);
        }
        adSlotParam.a(cu.a(this.f19055c, adSlotParam.l()));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MapKeyNames.AD_SLOT_PARAM, bk.b(adSlotParam));
            jSONObject.put(MapKeyNames.KIT_RELOAD_ADIDS, bk.b(list));
            jSONObject.put(MapKeyNames.SDK_KIT_RELOAD_ADIDS, bk.b(list2));
            final AdSlotParam adSlotParamI = adSlotParam.I();
            na.a(this.f19055c).a(RTCMethods.PRELOAD_SPLASH_AD, jSONObject.toString(), new RemoteCallResultCallback<String>() { // from class: com.huawei.openalliance.ad.inter.HiAdSplash.6
                @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                public void onRemoteCallResult(String str, CallResult<String> callResult) {
                    if (callResult.getCode() != 200) {
                        hw.b("HiAdSplash", "call kit preload failed");
                        HiAdSplash.this.b(adSlotParamI, 1);
                    }
                }
            }, String.class);
        } catch (Throwable th) {
            hw.c("HiAdSplash", "do kit preload failed: %s", th.getClass().getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final AdSlotParam adSlotParam, final Context context) {
        final int iD = adSlotParam.D();
        OAIDServiceManager.getInstance(context).requireOaid(new OAIDServiceManager.OaidResultCallback() { // from class: com.huawei.openalliance.ad.inter.HiAdSplash.3
            @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
            public int b() {
                return iD;
            }

            @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
            public void a(String str, boolean z) {
                hw.b("HiAdSplash", "onOaidAcquired " + System.currentTimeMillis());
                adSlotParam.a(str);
                adSlotParam.a(Boolean.valueOf(z));
                com.huawei.openalliance.ad.utils.d.a(context, str, z);
                HiAdSplash.this.c(adSlotParam);
            }

            @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
            public void a() {
                hw.b("HiAdSplash", "onOaidAcquireFailed " + System.currentTimeMillis());
                HiAdSplash.this.c(adSlotParam);
            }
        });
    }

    private void a(final AdSlotParam adSlotParam, final int i) {
        hw.b("HiAdSplash", "preloadAd request");
        if (adSlotParam != null) {
            hw.b("HiAdSplash", "request preload splash ad");
            en.a(this.f19055c).e();
            final List<String> listA = adSlotParam.a();
            if (bm.a(listA)) {
                return;
            }
            o.b(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAdSplash.4
                @Override // java.lang.Runnable
                public void run() {
                    adSlotParam.d(i);
                    adSlotParam.a(true);
                    HiAdSplash.this.g = System.currentTimeMillis();
                    Pair<String, Boolean> pairB = com.huawei.openalliance.ad.utils.d.b(HiAdSplash.this.f19055c, true);
                    if (pairB != null) {
                        adSlotParam.a((String) pairB.first);
                        adSlotParam.a((Boolean) pairB.second);
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (String str : listA) {
                        int iA = fl.a(HiAdSplash.this.f19055c).a(str);
                        if (iA != 0) {
                            if (iA == 2) {
                                arrayList2.add(str);
                            } else if (iA != 3) {
                                arrayList.add(str);
                            } else {
                                arrayList3.add(str);
                            }
                        }
                    }
                    if (!com.huawei.openalliance.ad.utils.d.c(HiAdSplash.this.f19055c, i)) {
                        AdSlotParam adSlotParamI = adSlotParam.I();
                        arrayList.addAll(arrayList2);
                        arrayList.addAll(arrayList3);
                        if (bm.a(arrayList)) {
                            return;
                        }
                        adSlotParamI.a(arrayList);
                        HiAdSplash.this.b(adSlotParamI, i);
                        return;
                    }
                    if (!bm.a(arrayList2) || !bm.a(arrayList3)) {
                        HiAdSplash.this.a(adSlotParam.I(), arrayList2, arrayList3);
                    }
                    if (bm.a(arrayList)) {
                        return;
                    }
                    AdSlotParam adSlotParamI2 = adSlotParam.I();
                    adSlotParamI2.a(arrayList);
                    HiAdSplash.this.b(adSlotParamI2, i);
                }
            });
            bo.b(this.f19055c, adSlotParam.l());
            a(listA.get(0), i);
        }
    }

    private static IHiAdSplash a(Context context) {
        HiAdSplash hiAdSplash;
        synchronized (f19054b) {
            if (f19053a == null) {
                f19053a = new HiAdSplash(context);
            }
            hiAdSplash = f19053a;
        }
        return hiAdSplash;
    }

    /* JADX INFO: loaded from: classes41.dex */
    public static class a implements ri {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f19079a;

        @Override // com.huawei.openalliance.ad.ri
        public List<ContentRecord> b(AdContentRsp adContentRsp) {
            return po.a(adContentRsp, this.f19079a);
        }

        @Override // com.huawei.openalliance.ad.ri
        public List<ContentRecord> a(AdContentRsp adContentRsp) {
            return new ArrayList(0);
        }

        public a(int i) {
            this.f19079a = i;
        }
    }

    public static class b implements ri {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f19080a;

        @Override // com.huawei.openalliance.ad.ri
        public List<ContentRecord> b(AdContentRsp adContentRsp) {
            return po.a(adContentRsp, this.f19080a);
        }

        @Override // com.huawei.openalliance.ad.ri
        public List<ContentRecord> a(AdContentRsp adContentRsp) {
            return po.b(adContentRsp, this.f19080a);
        }

        public b(int i) {
            this.f19080a = i;
        }
    }

    private HiAdSplash(Context context) {
        this.f19055c = context.getApplicationContext();
        this.d = fp.b(context);
        this.e = ew.a(context);
    }
}
