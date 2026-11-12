package com.huami.ad.web;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huami.ad.AdRequestParamsDelegate;
import com.huami.ad.entity.SportAd;
import com.huami.ad.web.AdAPI;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.handler.ResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.Single;
import rx.SingleSubscriber;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes4.dex */
public class AdAPI {
    public static final List<String> HOME_PAGE_ADS_ARRAY;
    public static final List<String> HOME_PAGE_ADS_ARRAY_ABOARD;
    public static final String TYPE_BODY_FAT_TEXT_CHAIN = "body_fat_text_chain";
    public static final String TYPE_BODY_WEIGHT_TEXT_CHAIN = "body_weight_text_chain";
    public static final String TYPE_FITNESS_BKE = "fitness_bke";
    public static final String TYPE_FITNESS_BSPORT = "fitness_bsport";
    public static final String TYPE_GPS_POINT = "sport_gps_point";
    public static final String TYPE_HOMEPAGE_AD = "homepage_ad";
    public static final String TYPE_HOMEPAGE_SERVICE = "homepage_service";
    public static final String TYPE_ME_BANNER = "me_banner";
    public static final String TYPE_RIDE_AKE = "ride_ake";
    public static final String TYPE_RIDE_ASPORT = "ride_asport";
    public static final String TYPE_RIDE_BKE = "ride_bke";
    public static final String TYPE_RIDE_BSPORT = "ride_bsport";
    public static final String TYPE_RUN_INAKE = "run_inake";
    public static final String TYPE_RUN_INASPORT = "run_inasport";
    public static final String TYPE_RUN_INBKE = "run_inbke";
    public static final String TYPE_RUN_INBSPORT = "run_inbsport";
    public static final String TYPE_RUN_OUTAKE = "run_outake";
    public static final String TYPE_RUN_OUTASPORT = "run_outasport";
    public static final String TYPE_RUN_OUTBKE = "run_outbke";
    public static final String TYPE_RUN_OUTBSPORT = "run_outbsport";
    public static final String TYPE_RUN_TREADAKE = "run_treadake";
    public static final String TYPE_RUN_TREADASPORT = "run_treadasport";
    public static final String TYPE_RUN_TREADBKE = "run_treadbke";
    public static final String TYPE_RUN_TREADPATHBKE = "run_treadpathbke";
    public static final String TYPE_SPORT_BTN_REPLACE = "sport_btn_replace";
    public static final String TYPE_SPORT_EXERCISE = "sport_exercise";
    public static final String TYPE_SPORT_FINISH_CHAIN = "sport_text_chain_e";
    public static final String TYPE_SPORT_RACE = "sport_race";
    public static final String TYPE_SPORT_TEXT_CHAIN = "sport_text_chain";
    public static final String TYPE_SPORT_TRAINING_AD = "sport_training_ad";
    public static final String TYPE_WALK_AKE = "walk_ake";
    public static final String TYPE_WALK_ASPORT = "walk_asport";
    public static final String TYPE_WALK_BKE = "walk_bke";
    public static final String TYPE_WALK_BSPORT = "walk_bsport";
    private static final String a = "AdAPI";
    private static final String b = "discovery/" + HMAppConfig.getSocial() + "/cards/";
    private static final String c = "sport_ad";
    private static final String d = "sport_summary_ad";
    private static final String e = "training_video_ad";
    private static final String f = "step_detail_ad";

    public class a extends ResponseHandler {
        public final /* synthetic */ SingleSubscriber a;
        public final /* synthetic */ List b;

        /* JADX INFO: renamed from: com.huami.ad.web.AdAPI$a$a, reason: collision with other inner class name */
        public class C0273a extends TypeToken<Map<String, List<SportAd>>> {
            public C0273a() {
            }
        }

        public a(SingleSubscriber singleSubscriber, List list) {
            this.a = singleSubscriber;
            this.b = list;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            this.a.onError(hMHttpResponseData.getError());
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            String str = new String(hMHttpResponseData.getResponseBody(), StandardCharsets.UTF_8);
            try {
                this.a.onSuccess((Map) new Gson().fromJson(str, new C0273a().getType()));
            } catch (JsonSyntaxException e) {
                StringBuilder sb = new StringBuilder();
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    sb.append((String) it2.next());
                    sb.append(", ");
                }
                HMLog.e(AdAPI.a, "Sport(" + ((Object) sb) + ") ad data error: " + str, e);
                this.a.onError(e);
            }
        }
    }

    public class b extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            HMLog.i(AdAPI.a, "onFailure: ", this.a);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            HMLog.i(AdAPI.a, "onSuccess: ", new String(hMHttpResponseData.getResponseBody(), StandardCharsets.UTF_8));
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        HOME_PAGE_ADS_ARRAY = arrayList;
        ArrayList arrayList2 = new ArrayList();
        HOME_PAGE_ADS_ARRAY_ABOARD = arrayList2;
        if (!GlobalConfig.get().isBuildMidong()) {
            arrayList.add("homepage_ad");
            arrayList.add(TYPE_SPORT_EXERCISE);
            arrayList.add(TYPE_SPORT_RACE);
            arrayList.add(TYPE_WALK_BSPORT);
            arrayList.add(TYPE_FITNESS_BSPORT);
            arrayList.add(TYPE_RIDE_BSPORT);
            arrayList.add(TYPE_RUN_INBSPORT);
            arrayList.add(TYPE_RUN_OUTBSPORT);
            arrayList.add(TYPE_ME_BANNER);
            arrayList.add(TYPE_SPORT_TEXT_CHAIN);
            arrayList.add(TYPE_SPORT_FINISH_CHAIN);
            arrayList.add(TYPE_GPS_POINT);
            arrayList.add(TYPE_SPORT_BTN_REPLACE);
            arrayList.add(TYPE_WALK_ASPORT);
            arrayList.add(TYPE_RIDE_ASPORT);
            arrayList.add(TYPE_RUN_INASPORT);
            arrayList.add(TYPE_RUN_OUTASPORT);
            arrayList.add(TYPE_RUN_TREADASPORT);
            arrayList.add(TYPE_BODY_WEIGHT_TEXT_CHAIN);
            arrayList.add(TYPE_BODY_FAT_TEXT_CHAIN);
            arrayList.add("step_detail_ad");
        }
        arrayList.add(TYPE_WALK_BKE);
        arrayList.add(TYPE_FITNESS_BKE);
        arrayList.add(TYPE_RIDE_BKE);
        arrayList.add(TYPE_RUN_INBKE);
        arrayList.add(TYPE_RUN_OUTBKE);
        arrayList.add(TYPE_RUN_TREADBKE);
        arrayList.add(TYPE_RUN_TREADPATHBKE);
        arrayList.add(TYPE_WALK_AKE);
        arrayList.add(TYPE_RIDE_AKE);
        arrayList.add(TYPE_RUN_INAKE);
        arrayList.add(TYPE_RUN_OUTAKE);
        arrayList.add(TYPE_RUN_TREADAKE);
        arrayList2.add(TYPE_RUN_TREADPATHBKE);
        if (GlobalConfig.get().isBuildMidong()) {
            return;
        }
        arrayList.add("homepage_ad");
        arrayList.add(TYPE_ME_BANNER);
    }

    private static Map<String, Object> c() {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("appname", HMAppConfig.getPackageName());
        systemParams.put("appplatform", HMAppConfig.getDeviceType());
        systemParams.put("adcode", LocWeatherManager.getInstance().getLocationAddressCode());
        return systemParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(List list, AdRequestParamsDelegate adRequestParamsDelegate, SingleSubscriber singleSubscriber) {
        f(list, adRequestParamsDelegate, new a(singleSubscriber, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List e(String str, Map map) {
        return (List) map.get(str);
    }

    private static void f(List<String> list, AdRequestParamsDelegate adRequestParamsDelegate, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        String url = HMServerDef.getUrl(b);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams(true);
        HashMap map = new HashMap();
        if (systemParams.containsKey("userid")) {
            map.put("userid", systemParams.get("userid"));
        }
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
                sb.append(',');
            }
            map.put("types", sb.substring(0, sb.length() - 1));
        }
        if (adRequestParamsDelegate != null) {
            map.put("adcode", adRequestParamsDelegate.addressCode());
            map.put("user_region", adRequestParamsDelegate.userRegionCode());
            map.put("user_country", adRequestParamsDelegate.userCountryCode());
        }
        HMWebUtil.doRequest(url, map, Support.RequestSupport.GET, false, iHMBasicHttpResponseHandler);
    }

    public static Map<String, Object> getParamsWithCountry(String str, String str2) {
        Map<String, Object> mapC = c();
        mapC.put("user_region", str);
        mapC.put("user_country", str2);
        return mapC;
    }

    public static void requestHomepageCard(IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler, String str, String str2, boolean z) {
        String url = HMServerDef.getUrl(b);
        Map<String, Object> mapC = c();
        StringBuilder sb = new StringBuilder();
        if (z) {
            Iterator<String> it2 = HOME_PAGE_ADS_ARRAY_ABOARD.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
                sb.append(',');
            }
        } else {
            Iterator<String> it3 = HOME_PAGE_ADS_ARRAY.iterator();
            while (it3.hasNext()) {
                sb.append(it3.next());
                sb.append(',');
            }
        }
        mapC.put("types", sb.substring(0, sb.length() - 1));
        mapC.put("user_region", str);
        mapC.put("user_country", str2);
        HMWebUtil.doRequest(url, mapC, Support.RequestSupport.GET, false, iHMBasicHttpResponseHandler);
    }

    public static void requestMonitor(String str) {
        HMWebUtil.doSeparateRequest(str, (Map<String, String>) null, (Map<String, Object>) new HashMap(), Support.RequestSupport.GET, false, false, (IHMBasicHttpResponseHandler) new b(str), new HMHttpConfig[0]);
    }

    public static void requestServer(String str, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        HMWebUtil.doRequest(HMServerDef.getUrl(b + str), c(), Support.RequestSupport.GET, false, iHMBasicHttpResponseHandler);
    }

    public static void requestServerWithSort(String str, String str2, String str3, String str4, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        String url = HMServerDef.getUrl(b + str);
        Map<String, Object> paramsWithCountry = getParamsWithCountry(str3, str4);
        paramsWithCountry.put("sort", str2);
        HMWebUtil.doRequest(url, paramsWithCountry, Support.RequestSupport.GET, false, iHMBasicHttpResponseHandler);
    }

    public static Single<Map<String, List<SportAd>>> requestSportAd(final List<String> list, final AdRequestParamsDelegate adRequestParamsDelegate) {
        return Single.create(new Single.OnSubscribe() { // from class: k6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                AdAPI.d(list, adRequestParamsDelegate, (SingleSubscriber) obj);
            }
        });
    }

    public static Single<List<SportAd>> requestSportAdGroup(final String str, AdRequestParamsDelegate adRequestParamsDelegate) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return requestSportAd(arrayList, adRequestParamsDelegate).map(new Func1() { // from class: l6
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return AdAPI.e(str, (Map) obj);
            }
        });
    }

    public static void requestSportImgAd(IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        HMWebUtil.doRequest(HMServerDef.getUrl(b + "sport_ad"), c(), Support.RequestSupport.GET, false, iHMBasicHttpResponseHandler);
    }

    public static void requestSportSummary(IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        HMWebUtil.doRequest(HMServerDef.getUrl(b + "sport_summary_ad"), c(), Support.RequestSupport.GET, false, iHMBasicHttpResponseHandler);
    }

    public static void requestTrainingVideo(IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        HMWebUtil.doRequest(HMServerDef.getUrl(b + "training_video_ad"), c(), Support.RequestSupport.GET, false, iHMBasicHttpResponseHandler);
    }
}
