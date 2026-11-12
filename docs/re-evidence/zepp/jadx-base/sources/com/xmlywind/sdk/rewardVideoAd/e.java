package com.xmlywind.sdk.rewardVideoAd;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.t;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.LoadAdRequest;
import com.xmlywind.sdk.base.models.SigMacroCommon;
import com.xmlywind.sdk.common.Constants;
import com.xmlywind.sdk.common.SDKConfig;
import com.xmlywind.sdk.common.models.AdStatus;
import com.xmlywind.sdk.common.models.SigmobError;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.mta.PointEntitySigmob;
import com.xmlywind.sdk.common.mta.PointEntitySigmobError;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class e implements com.xmlywind.sdk.base.a.b.a, f.a {
    private d c;
    private boolean d;
    private BaseAdUnit g;
    private BaseAdUnit h;
    private LoadAdRequest l;
    private int m;
    private boolean i = false;
    private Map<String, AdStatus> e = new HashMap();
    private final Handler a = new Handler(Looper.getMainLooper());
    private final Map<String, f> b = new HashMap();
    private Map<String, Long> k = new HashMap();
    private Map<String, Integer> j = new HashMap();
    private Map<String, String> f = new HashMap();

    private void a(final int i, final String str, final String str2) {
        this.a.post(new Runnable() { // from class: com.xmlywind.sdk.rewardVideoAd.e.2
            @Override // java.lang.Runnable
            public void run() {
                if (e.this.c == null || i == 0) {
                    return;
                }
                e.this.c.onVideoAdPlayError(i, str, str2);
            }
        });
    }

    private void a(final int i, String str, String str2, final int i2, BaseAdUnit baseAdUnit, final String str3, final String str4, final String str5) {
        t.a(str2, str, baseAdUnit, new t.a() { // from class: com.xmlywind.sdk.rewardVideoAd.e.11
            @Override // com.xmlywind.sdk.base.common.t.a
            public void a(Object obj) {
                if (obj instanceof PointEntitySigmob) {
                    PointEntitySigmob pointEntitySigmob = (PointEntitySigmob) obj;
                    pointEntitySigmob.setPlacement_id(str3);
                    pointEntitySigmob.setAdtype(String.valueOf(i2));
                    pointEntitySigmob.setLoad_id(str4);
                    pointEntitySigmob.setRequest_id(str5);
                    pointEntitySigmob.setError_code(String.valueOf(i));
                }
            }
        });
    }

    private void a(BaseAdUnit baseAdUnit, String str, final int i, final String str2, final String str3, int i2, String str4) {
        t.a(str, i2, str4, baseAdUnit, new t.a() { // from class: com.xmlywind.sdk.rewardVideoAd.e.12
            @Override // com.xmlywind.sdk.base.common.t.a
            public void a(Object obj) {
                if (obj instanceof PointEntitySigmobError) {
                    PointEntitySigmobError pointEntitySigmobError = (PointEntitySigmobError) obj;
                    pointEntitySigmobError.setLoad_id(str3);
                    pointEntitySigmobError.setPlacement_id(str2);
                    pointEntitySigmobError.setAdtype(String.valueOf(i));
                }
            }
        });
    }

    private void a(LoadAdRequest loadAdRequest, Activity activity, BaseAdUnit baseAdUnit) {
        AdStatus adStatus = this.e.get(loadAdRequest.getPlacementId());
        f fVar = this.b.get(loadAdRequest.getPlacementId());
        if (fVar == null) {
            SigmobError sigmobError = SigmobError.ERROR_SIGMOB_AD_PLAY_CHECK_FAIL;
            a(sigmobError.getErrorCode(), "interstitial object is null", loadAdRequest.getPlacementId());
            t.a("play", sigmobError.getErrorCode(), "interstitial class is null", baseAdUnit);
            return;
        }
        if (adStatus != AdStatus.AdStatusReady) {
            SigmobError sigmobError2 = SigmobError.ERROR_SIGMOB_AD_PLAY_CHECK_FAIL;
            a(sigmobError2.getErrorCode(), "adstatus is not ready", loadAdRequest.getPlacementId());
            t.a("play", sigmobError2.getErrorCode(), "adstatus is not ready", baseAdUnit);
            return;
        }
        String adScene = loadAdRequest.getAdScene();
        SigMacroCommon macroCommon = baseAdUnit.getMacroCommon();
        if (macroCommon instanceof SigMacroCommon) {
            if (!TextUtils.isEmpty(adScene)) {
                macroCommon.addMarcoKey(SigMacroCommon._ADSCENE_, adScene);
            }
            if (!TextUtils.isEmpty(baseAdUnit.getVideo_url())) {
                macroCommon.addMarcoKey(SigMacroCommon._VMD5_, com.xmlywind.sdk.base.common.d.f().d(baseAdUnit.getVideoPath()));
                try {
                    macroCommon.addMarcoKey(SigMacroCommon._VURL_, URLEncoder.encode(baseAdUnit.getVideo_url(), "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    SigmobLog.e(e.getMessage());
                }
            }
        }
        if (baseAdUnit.getPlayMode() == 2) {
            fVar.a(com.xmlywind.sdk.common.a.n().af(), new HashMap(), baseAdUnit);
        }
        this.l = loadAdRequest;
        fVar.a(adScene);
        Bundle bundle = new Bundle();
        bundle.putBoolean(Constants.ENABLEKEEPON, loadAdRequest.isEnable_keep_on());
        bundle.putBoolean(Constants.ENABLESCREENLOCKDISPLAYAD, loadAdRequest.isEnable_screen_lock_displayad());
        if (!TextUtils.isEmpty(adScene)) {
            bundle.putString("ad_scene", adScene);
        }
        fVar.a(activity, baseAdUnit, bundle);
        this.k.remove(loadAdRequest.getPlacementId());
        this.j.remove(loadAdRequest.getPlacementId());
    }

    private void a(String str, String str2, final int i, BaseAdUnit baseAdUnit, final String str3, final String str4, final String str5) {
        t.a(str2, str, baseAdUnit, new t.a() { // from class: com.xmlywind.sdk.rewardVideoAd.e.10
            @Override // com.xmlywind.sdk.base.common.t.a
            public void a(Object obj) {
                if (obj instanceof PointEntitySigmob) {
                    PointEntitySigmob pointEntitySigmob = (PointEntitySigmob) obj;
                    pointEntitySigmob.setPlacement_id(str3);
                    pointEntitySigmob.setAdtype(String.valueOf(i));
                    pointEntitySigmob.setLoad_id(str4);
                    pointEntitySigmob.setBid_token(str5);
                }
            }
        });
    }

    private void a(String str, String str2, final int i, final String str3, final String str4, final String str5, final String str6) {
        t.a(str2, str, (BaseAdUnit) null, new t.a() { // from class: com.xmlywind.sdk.rewardVideoAd.e.9
            @Override // com.xmlywind.sdk.base.common.t.a
            public void a(Object obj) {
                if (obj instanceof PointEntitySigmob) {
                    PointEntitySigmob pointEntitySigmob = (PointEntitySigmob) obj;
                    pointEntitySigmob.setPlacement_id(str3);
                    pointEntitySigmob.setAdtype(String.valueOf(i));
                    pointEntitySigmob.setLoad_id(str4);
                    pointEntitySigmob.setReady_filters(str5);
                    pointEntitySigmob.setBid_token(str6);
                }
            }
        });
    }

    private void b() {
        synchronized (this) {
            Iterator<String> it2 = this.e.keySet().iterator();
            while (it2.hasNext()) {
                a(it2.next());
            }
        }
    }

    private void b(final int i, final String str, final String str2) {
        this.a.post(new Runnable() { // from class: com.xmlywind.sdk.rewardVideoAd.e.4
            @Override // java.lang.Runnable
            public void run() {
                if (e.this.c != null) {
                    e.this.c.onVideoAdPreLoadFail(i, str, str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(LoadAdRequest loadAdRequest) {
        String placementId = loadAdRequest.getPlacementId();
        b();
        if (this.e.get(placementId) == AdStatus.AdStatusReady) {
            this.m++;
            if (this.b.get(placementId) == null) {
                this.b.put(placementId, new f(this));
            }
            c(placementId);
            c(0, null, placementId);
            return;
        }
        this.e.put(placementId, AdStatus.AdStatusLoading);
        try {
            String adsUrl = TextUtils.isEmpty(loadAdRequest.getBidToken()) ? SDKConfig.sharedInstance().getAdsUrl() : SDKConfig.sharedInstance().getHbAdsUrl();
            if (adsUrl == null) {
                this.e.put(placementId, AdStatus.AdStatusNone);
                c(SigmobError.ERROR_SIGMOB_REQUEST.getErrorCode(), "server url is null", placementId);
                return;
            }
            String str = (loadAdRequest.getLastCrid() == null && loadAdRequest.getLastCampid() == null) ? PointCategory.INIT : "play";
            int i = this.m;
            SigmobLog.e("adsRequest ready_filters: " + this.m);
            a(str, "request", loadAdRequest.getAdType(), placementId, loadAdRequest.getLoadId(), String.valueOf(i), loadAdRequest.getBidToken());
            loadAdRequest.setRequest_scene_type((str.equals(PointCategory.INIT) ? a.NormalRequest : a.AutoNextPreload).a().intValue());
            loadAdRequest.setExpired(b(placementId));
            com.xmlywind.sdk.base.a.b.a(adsUrl, loadAdRequest, this);
            this.m = 0;
            SigmobLog.d("adsRequest loadAdRequest = [" + loadAdRequest + "], placementId = [" + placementId + "]");
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
    }

    private boolean b(String str) {
        Integer num;
        Long l = this.k.get(str);
        return (l == null || (num = this.j.get(str)) == null || num.intValue() == 0 || System.currentTimeMillis() - l.longValue() <= ((long) num.intValue())) ? false : true;
    }

    private void c(final int i, final String str, final String str2) {
        this.a.post(new Runnable() { // from class: com.xmlywind.sdk.rewardVideoAd.e.5
            @Override // java.lang.Runnable
            public void run() {
                if (e.this.c != null) {
                    if (i != 0) {
                        e.this.c.onVideoAdLoadError(i, str, str2);
                    } else {
                        e.this.c.onVideoAdLoadSuccess(str2);
                    }
                }
            }
        });
    }

    private void c(final String str) {
        this.a.post(new Runnable() { // from class: com.xmlywind.sdk.rewardVideoAd.e.3
            @Override // java.lang.Runnable
            public void run() {
                if (e.this.c != null) {
                    e.this.c.onVideoAdPreLoadSuccess(str);
                }
            }
        });
    }

    private boolean j(BaseAdUnit baseAdUnit) {
        try {
            if (baseAdUnit.getPlayMode() == 0) {
                boolean zIsVideoExist = baseAdUnit.isVideoExist();
                boolean zIsEndCardIndexExist = baseAdUnit.isEndCardIndexExist();
                if (!zIsVideoExist) {
                    SigmobLog.e("video file not ready");
                }
                if (!zIsEndCardIndexExist) {
                    SigmobLog.e("endIndex file not ready");
                }
                if (!zIsEndCardIndexExist || !zIsVideoExist) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void a() {
        if (this.g != null) {
            com.xmlywind.sdk.base.common.d.f().e(this.g);
        }
    }

    @Override // com.xmlywind.sdk.base.a.b.a
    public void a(int i, String str, String str2, LoadAdRequest loadAdRequest) {
        this.e.put(loadAdRequest.getPlacementId(), AdStatus.AdStatusNone);
        a(i, "0", PointCategory.RESPOND, loadAdRequest.getAdType(), null, loadAdRequest.getPlacementId(), loadAdRequest.getLoadId(), str2);
        this.g = null;
        b(i, str, loadAdRequest.getPlacementId());
        c(i, str, loadAdRequest.getPlacementId());
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void a(BaseAdUnit baseAdUnit) {
        a((String) null, PointCategory.LOADSTART, baseAdUnit.getAd_type(), baseAdUnit, baseAdUnit.getAdslot_id(), baseAdUnit.getLoad_id(), "");
        com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_LOAD);
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void a(BaseAdUnit baseAdUnit, String str) {
        SigmobLog.d("onInterstitialFailed() called with: errorCode = [" + str + "]");
        int ad_type = baseAdUnit.getAd_type();
        String str2 = baseAdUnit.getadslot_id();
        String load_id = baseAdUnit.getLoad_id();
        SigmobError sigmobError = SigmobError.ERROR_SIGMOB_FILE_DOWNLOAD;
        a(baseAdUnit, PointCategory.LOAD, ad_type, str2, load_id, sigmobError.getErrorCode(), str);
        a("0", PointCategory.LOADEND, baseAdUnit.getAd_type(), baseAdUnit, baseAdUnit.getAdslot_id(), baseAdUnit.getLoad_id(), "");
        com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_LOAD_FAILURE);
        if (baseAdUnit.getPlayMode() == 0) {
            c(sigmobError.getErrorCode(), str, baseAdUnit.getAdslot_id());
            if (baseAdUnit.getAd_source_channel().equalsIgnoreCase("1000")) {
                this.f.remove(baseAdUnit.getCrid());
                com.xmlywind.sdk.base.common.d.f().e(baseAdUnit);
            }
            this.e.put(baseAdUnit.getAdslot_id(), AdStatus.AdStatusNone);
        }
    }

    public void a(LoadAdRequest loadAdRequest) {
        SigmobError sigmobErrorC;
        if (loadAdRequest == null || TextUtils.isEmpty(loadAdRequest.getPlacementId())) {
            SigmobLog.e("loadAd error loadAdRequest or placementId is null");
            c(SigmobError.ERROR_SIGMOB_REQUEST.getErrorCode(), "placementId is null", null);
            return;
        }
        try {
            if (com.xmlywind.sdk.a.b() != null && (sigmobErrorC = com.xmlywind.sdk.a.b().c()) != null) {
                SigmobLog.e("check loadAd error " + sigmobErrorC.toString());
                PointEntitySigmobError.SigmobError(PointCategory.LOAD, sigmobErrorC.getErrorCode(), sigmobErrorC.getMessage()).commit();
                c(sigmobErrorC.getErrorCode(), sigmobErrorC.getMessage(), loadAdRequest.getPlacementId());
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        loadAdRequest.setLastCampid(com.xmlywind.sdk.base.common.d.f().k());
        loadAdRequest.setLastCrid(com.xmlywind.sdk.base.common.d.f().j());
        b(loadAdRequest);
    }

    public void a(final LoadAdRequest loadAdRequest, Activity activity) {
        int errorCode;
        BaseAdUnit baseAdUnit;
        t.a aVar;
        String str;
        if (this.i) {
            SigmobError sigmobError = SigmobError.ERROR_SIGMOB_AD_PLAY_CHECK_FAIL;
            a(sigmobError.getErrorCode(), "ad is playing", loadAdRequest.getPlacementId());
            errorCode = sigmobError.getErrorCode();
            baseAdUnit = null;
            aVar = new t.a() { // from class: com.xmlywind.sdk.rewardVideoAd.e.1
                @Override // com.xmlywind.sdk.base.common.t.a
                public void a(Object obj) {
                    if (obj instanceof PointEntitySigmobError) {
                        PointEntitySigmobError pointEntitySigmobError = (PointEntitySigmobError) obj;
                        pointEntitySigmobError.setAdtype(String.valueOf(loadAdRequest.getAdType()));
                        pointEntitySigmobError.setPlacement_id(loadAdRequest.getPlacementId());
                        pointEntitySigmobError.setLoad_id(loadAdRequest.getLoadId());
                    }
                }
            };
            str = "current is Playing ";
        } else {
            BaseAdUnit baseAdUnit2 = this.g;
            this.h = baseAdUnit2;
            if (baseAdUnit2 != null) {
                baseAdUnit2.setLoad_id(loadAdRequest.getLoadId());
                this.h.setBid_token(loadAdRequest.getBidToken());
                a(loadAdRequest, activity, this.h);
                return;
            } else {
                SigmobError sigmobError2 = SigmobError.ERROR_SIGMOB_AD_PLAY_CHECK_FAIL;
                a(sigmobError2.getErrorCode(), "not ready adUnit", loadAdRequest.getPlacementId());
                errorCode = sigmobError2.getErrorCode();
                baseAdUnit = this.h;
                aVar = new t.a() { // from class: com.xmlywind.sdk.rewardVideoAd.e.6
                    @Override // com.xmlywind.sdk.base.common.t.a
                    public void a(Object obj) {
                        if (obj instanceof PointEntitySigmobError) {
                            PointEntitySigmobError pointEntitySigmobError = (PointEntitySigmobError) obj;
                            pointEntitySigmobError.setAdtype(String.valueOf(loadAdRequest.getAdType()));
                            pointEntitySigmobError.setPlacement_id(loadAdRequest.getPlacementId());
                            pointEntitySigmobError.setLoad_id(loadAdRequest.getLoadId());
                        }
                    }
                };
                str = "adunit is null";
            }
        }
        t.a("play", errorCode, str, baseAdUnit, aVar);
    }

    public void a(d dVar) {
        this.c = dVar;
    }

    @Override // com.xmlywind.sdk.base.a.b.a
    public void a(List<BaseAdUnit> list, LoadAdRequest loadAdRequest) {
        int i;
        BaseAdUnit baseAdUnit;
        int adType = loadAdRequest.getAdType();
        try {
            c(loadAdRequest.getPlacementId());
            f fVar = this.b.get(loadAdRequest.getPlacementId());
            if (fVar == null) {
                fVar = new f(this);
                this.b.put(loadAdRequest.getPlacementId(), fVar);
            }
            f fVar2 = fVar;
            if (list == null || list.size() <= 0) {
                this.e.put(loadAdRequest.getPlacementId(), AdStatus.AdStatusNone);
                SigmobError sigmobError = SigmobError.ERROR_SIGMOB_INFORMATION_LOSE;
                b(sigmobError.getErrorCode(), "ad is null", loadAdRequest.getPlacementId());
                a("0", PointCategory.RESPOND, adType, (BaseAdUnit) null, loadAdRequest.getPlacementId(), loadAdRequest.getLoadId(), loadAdRequest.getBidToken());
                c(sigmobError.getErrorCode(), "ad is null", loadAdRequest.getPlacementId());
                return;
            }
            BaseAdUnit baseAdUnit2 = list.get(0);
            try {
                if (baseAdUnit2.getAd_source_channel().equalsIgnoreCase("1000")) {
                    this.f.put(baseAdUnit2.getCrid(), baseAdUnit2.getCamp_id());
                    com.xmlywind.sdk.base.common.d.f().f(baseAdUnit2);
                }
                adType = baseAdUnit2.getAd_type();
                a("1", PointCategory.RESPOND, baseAdUnit2.getAd_type(), baseAdUnit2, baseAdUnit2.getAdslot_id(), baseAdUnit2.getLoad_id(), loadAdRequest.getBidToken());
                if (baseAdUnit2.getPlayMode() != 0) {
                    this.j.put(baseAdUnit2.getAdslot_id(), baseAdUnit2.getAdExpiredTime());
                    this.k.put(baseAdUnit2.getAdslot_id(), Long.valueOf(System.currentTimeMillis()));
                    this.e.put(baseAdUnit2.getAdslot_id(), AdStatus.AdStatusReady);
                    c(0, null, baseAdUnit2.getAdslot_id());
                }
                if (baseAdUnit2.getPlayMode() != 2) {
                    HashMap map = new HashMap();
                    map.put(Constants.AD_UNIT_KEY, baseAdUnit2);
                    map.put(Constants.BROADCAST_IDENTIFIER_KEY, baseAdUnit2.getUuid());
                    fVar2.a(com.xmlywind.sdk.common.a.n().af(), map, baseAdUnit2);
                }
                this.g = baseAdUnit2;
            } catch (Throwable th) {
                th = th;
                i = adType;
                baseAdUnit = baseAdUnit2;
                SigmobLog.e(th.getMessage());
                this.e.put(loadAdRequest.getPlacementId(), AdStatus.AdStatusNone);
                a("0", PointCategory.RESPOND, i, baseAdUnit, loadAdRequest.getPlacementId(), loadAdRequest.getLoadId(), loadAdRequest.getBidToken());
                c(SigmobError.ERROR_SIGMOB_INFORMATION_LOSE.getErrorCode(), th.getMessage(), loadAdRequest.getPlacementId());
            }
        } catch (Throwable th2) {
            th = th2;
            i = adType;
            baseAdUnit = null;
        }
    }

    public boolean a(String str) {
        AdStatus adStatus;
        AdStatus adStatus2;
        if (TextUtils.isEmpty(str) || (adStatus = this.e.get(str)) == null || adStatus != (adStatus2 = AdStatus.AdStatusReady)) {
            return false;
        }
        BaseAdUnit baseAdUnit = this.g;
        if (baseAdUnit != null && !b(str) && j(baseAdUnit)) {
            return true;
        }
        if (baseAdUnit != null) {
            com.xmlywind.sdk.base.common.d.f().e(baseAdUnit);
            this.f.remove(baseAdUnit.getCrid());
        }
        if (adStatus != adStatus2) {
            return false;
        }
        this.e.put(str, AdStatus.AdStatusNone);
        return false;
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void b(BaseAdUnit baseAdUnit) {
        SigmobLog.d("onInterstitialLoaded() called");
        com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_LOAD_SUCCESS);
        a("1", PointCategory.LOADEND, baseAdUnit.getAd_type(), baseAdUnit, baseAdUnit.getAdslot_id(), baseAdUnit.getLoad_id(), "");
        if (baseAdUnit.getPlayMode() == 0) {
            this.j.put(baseAdUnit.getAdslot_id(), baseAdUnit.getAdExpiredTime());
            this.k.put(baseAdUnit.getAdslot_id(), Long.valueOf(System.currentTimeMillis()));
            this.e.put(baseAdUnit.getAdslot_id(), AdStatus.AdStatusReady);
            c(0, null, baseAdUnit.getAdslot_id());
        }
    }

    @Override // com.xmlywind.sdk.rewardVideoAd.f.a
    public void b(BaseAdUnit baseAdUnit, String str) {
        if (baseAdUnit != null && baseAdUnit.getAd_source_channel().equalsIgnoreCase("1000")) {
            this.f.remove(baseAdUnit.getCrid());
            com.xmlywind.sdk.base.common.d.f().e(baseAdUnit);
        }
        if (baseAdUnit != null) {
            com.xmlywind.sdk.base.common.d.d(baseAdUnit);
            SigmobError sigmobError = SigmobError.ERROR_SIGMOB_AD_PLAY;
            a(sigmobError.getErrorCode(), str, baseAdUnit.getAdslot_id());
            a(baseAdUnit, "play", baseAdUnit.getAd_type(), baseAdUnit.getadslot_id(), baseAdUnit.getLoad_id(), sigmobError.getErrorCode(), str);
        }
        this.i = false;
        SigmobLog.d("onVideoPlayFail() called");
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void c(BaseAdUnit baseAdUnit) {
        SigmobLog.d("onInterstitialShown() called");
        this.d = false;
        this.i = true;
        if (baseAdUnit != null) {
            if (baseAdUnit.getAd_source_channel().equalsIgnoreCase("1000")) {
                this.f.remove(baseAdUnit.getCrid());
                com.xmlywind.sdk.base.common.d.f().e(baseAdUnit);
            }
            a((String) null, PointCategory.VOPEN, baseAdUnit.getAd_type(), baseAdUnit, baseAdUnit.getAdslot_id(), baseAdUnit.getLoad_id(), "");
            this.e.put(baseAdUnit.getAdslot_id(), AdStatus.AdStatusPlaying);
            com.xmlywind.sdk.base.common.d.f().c(baseAdUnit.getCamp_id());
            com.xmlywind.sdk.base.common.d.f().b(baseAdUnit.getCrid());
        }
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void d(BaseAdUnit baseAdUnit) {
        SigmobLog.d("onInterstitialClicked() called");
        d dVar = this.c;
        if (dVar == null || baseAdUnit == null) {
            return;
        }
        dVar.onVideoAdClicked(baseAdUnit.getAdslot_id());
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void e(BaseAdUnit baseAdUnit) {
        SigmobLog.d("onInterstitialDismissed() called");
        this.i = false;
        if (baseAdUnit == null) {
            return;
        }
        f fVar = this.b.get(baseAdUnit.getAdslot_id());
        if (fVar != null) {
            fVar.c(baseAdUnit);
        }
        if (this.c != null) {
            this.c.onVideoAdClosed(new b(baseAdUnit.getAd_type(), baseAdUnit.getAdslot_id(), this.d), baseAdUnit.getAdslot_id());
        }
        com.xmlywind.sdk.base.common.d.f().c("");
        com.xmlywind.sdk.base.common.d.f().b("");
    }

    @Override // com.xmlywind.sdk.rewardVideoAd.f.a
    public void f(BaseAdUnit baseAdUnit) {
        SigmobLog.d("onVideoComplete() called");
        this.d = true;
        d dVar = this.c;
        if (dVar == null || baseAdUnit == null) {
            return;
        }
        dVar.onVideoAdPlayComplete(baseAdUnit.getAdslot_id());
    }

    @Override // com.xmlywind.sdk.rewardVideoAd.f.a
    public void g(BaseAdUnit baseAdUnit) {
        d dVar = this.c;
        if (dVar != null && baseAdUnit != null) {
            dVar.onVideoAdPlayStart(baseAdUnit.getAdslot_id());
        }
        if (baseAdUnit.getDisableAutoLoad()) {
            return;
        }
        SigmobLog.d(baseAdUnit.getPlayMode() + " adsRequest onVideoPlay: " + this.l.getBidToken());
        if (baseAdUnit.getPlayMode() == 0 && TextUtils.isEmpty(this.l.getBidToken())) {
            this.l.setLastCampid(baseAdUnit.getCamp_id());
            this.l.setLastCrid(baseAdUnit.getCrid());
            this.a.post(new Runnable() { // from class: com.xmlywind.sdk.rewardVideoAd.e.7
                @Override // java.lang.Runnable
                public void run() {
                    e eVar = e.this;
                    eVar.b(eVar.l);
                }
            });
        }
    }

    @Override // com.xmlywind.sdk.rewardVideoAd.f.a
    public void h(BaseAdUnit baseAdUnit) {
        SigmobLog.d("onVideoSkip() called");
    }

    @Override // com.xmlywind.sdk.rewardVideoAd.f.a
    public void i(BaseAdUnit baseAdUnit) {
        d dVar = this.c;
        if (dVar != null) {
            dVar.onVideoAdPlayEnd(baseAdUnit.getAdslot_id());
        }
        if (baseAdUnit.getDisableAutoLoad()) {
            return;
        }
        SigmobLog.d(baseAdUnit.getPlayMode() + " adsRequest onVideoClose: " + this.l.getBidToken());
        if (baseAdUnit.getPlayMode() == 0 || !TextUtils.isEmpty(this.l.getBidToken())) {
            return;
        }
        this.l.setLastCampid(baseAdUnit.getCamp_id());
        this.l.setLastCrid(baseAdUnit.getCrid());
        this.e.put(baseAdUnit.getAdslot_id(), AdStatus.AdStatusNone);
        this.a.post(new Runnable() { // from class: com.xmlywind.sdk.rewardVideoAd.e.8
            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.b(eVar.l);
            }
        });
    }
}
