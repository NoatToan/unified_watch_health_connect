package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amap.api.services.district.DistrictSearchQuery;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.marketing.datatype.RecommendCardBean;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.trade.datatype.Product;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class fcn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f33858a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f33859b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f33860c = "";
    private static boolean d = false;
    private static String e = "";
    private static long f = 0;
    private static String g = "";
    private static int h = 8;
    private static String i = "";
    private static String j = "";
    private static String k = "";
    private static String l = "";
    private static String m = "";
    private static String n = "";
    private static String o = "";
    private static String s = "";

    public static void e(boolean z) {
        f33859b = z;
    }

    public static void i(String str) {
        l = str;
    }

    public static void d(boolean z) {
        d = z;
    }

    public static void n(String str) {
        i = str;
    }

    public static void o(String str) {
        g = str;
    }

    public static void k(String str) {
        j = str;
    }

    public static void d(String str) {
        e = str;
    }

    public static void t(String str) {
        m = str;
    }

    public static void q(String str) {
        s = str;
    }

    public static void s(String str) {
        n = str;
    }

    public static void a(String str) {
        f33858a = str;
    }

    public static void p(String str) {
        k = str;
    }

    public static void a(int i2) {
        LogUtil.a("VipBiUtil", "from: ", Integer.valueOf(i2));
        h = i2;
    }

    public static void b(String str) {
        LogUtil.a("VipBiUtil", "province: ", str);
        o = str;
    }

    public static void e(String str) {
        LogUtil.a("VipBiUtil", "city: ", str);
        f33860c = str;
    }

    public static String c() {
        return o;
    }

    public static String a() {
        return f33860c;
    }

    public static void c(Context context, int i2) {
        Map<String, Object> mapV = v();
        mapV.put("event", Integer.valueOf(i2));
        e(context, AnalyticsValue.VIP_AGREEMENT_DIALOG_EVENT.value(), mapV);
    }

    public static void b(Context context, int i2, RecommendCardBean recommendCardBean) {
        if (recommendCardBean == null) {
            LogUtil.e("VipBiUtil", "setVipRecommendCardEvent recommendCardBean is null");
            return;
        }
        HashMap map = new HashMap();
        map.put("event", Integer.valueOf(i2));
        map.put("cardId", recommendCardBean.getCardId() != null ? recommendCardBean.getCardId() : "");
        map.put("cardStatus", recommendCardBean.getCardStatus() != null ? recommendCardBean.getCardStatus() : "");
        map.put("cardTopic", recommendCardBean.getTitle() != null ? recommendCardBean.getTitle() : "");
        map.put("buttonTopic", recommendCardBean.getButtonText() != null ? recommendCardBean.getButtonText() : "");
        if (!TextUtils.isEmpty(recommendCardBean.getResourceId())) {
            map.put("courseId", recommendCardBean.getResourceId());
        }
        e(context, recommendCardBean.getEventId(), map);
    }

    public static boolean c(int i2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f < i2) {
            return true;
        }
        f = jElapsedRealtime;
        return false;
    }

    public static void a(Context context, int i2) {
        Map<String, Object> mapV = v();
        mapV.put("from", Integer.valueOf(h));
        mapV.put(CommonUtil.PAGE_TYPE, Integer.valueOf(i2));
        mapV.put("newEquity", Boolean.valueOf(f33859b));
        mapV.put(WebViewHelp.BI_KEY_PULL_FROM, l);
        mapV.put("fromPageTitle", e);
        e(context, AnalyticsValue.VIP_INTRO_PAGE_SHOW_EVENT.value(), mapV);
        h = 8;
    }

    public static void b(Context context, int i2) {
        Map<String, Object> mapV = v();
        mapV.put("from", Integer.valueOf(h));
        mapV.put(CommonUtil.PAGE_TYPE, Integer.valueOf(i2));
        mapV.put("newEquity", Boolean.valueOf(f33859b));
        mapV.put(WebViewHelp.BI_KEY_PULL_FROM, l);
        mapV.put("fromPageTitle", e);
        e(context, AnalyticsValue.VIP_CENTER_SHOW_EVENT.value(), mapV);
        h = 8;
    }

    public static void b(Context context, Product product) {
        Map<String, Object> mapV = v();
        mapV.put("isSale", Integer.valueOf((product.getPromotion() == null && product.getSubscriptionPromotion() == null) ? 0 : 1));
        mapV.put(HwPayConstant.KEY_PRODUCTNAME, product.getProductName());
        mapV.put("productId", product.getProductId());
        e(context, AnalyticsValue.VIP_INTRO_PRODUCT_SHOW_EVENT.value(), mapV);
    }

    public static void m(String str) {
        HashMap map = new HashMap();
        map.put("name", str);
        e(BaseApplication.b(), AnalyticsValue.VIP_INTRO_PRIVILEGE_OVERALL_SHOW_EVENT.value(), map);
    }

    public static void e(String str, int i2, int i3, boolean z) {
        String strValue;
        HashMap map = new HashMap();
        map.put("pageId", i);
        i = "";
        HashMap map2 = new HashMap();
        map2.put("type", str);
        map2.put("event", 0);
        map2.put("payResourceType", k);
        k = "";
        map2.put("name", f33858a);
        map2.put("itemId", g);
        g = "";
        map2.put(ParamConstants.Param.VIEW_TYPE, "semi_modal_package");
        map2.put("moduleName", "main_page");
        map2.put("from", Integer.valueOf(i2));
        map2.put("ActivationMode", Integer.valueOf(i3));
        HashMap map3 = new HashMap();
        map3.put(WebViewHelp.BI_KEY_PULL_FROM, l);
        l = "";
        map3.put("pullOrder", m);
        m = "";
        map3.put("fromPageTitle", e);
        e = "";
        map3.put("resourceId", n);
        n = "";
        map3.put("resourceName", s);
        s = "";
        lmn lmnVar = new lmn();
        lmnVar.d(map);
        lmnVar.e(map2);
        lmnVar.c(map3);
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            map2.putAll(marketRouterApi.getLastMarketSource());
        }
        lmf lmfVarD = lmf.d();
        Context contextB = BaseApplication.b();
        if (z) {
            strValue = AnalyticsValue.VIP_RENEWAL_PAY_SUCCESS_EVENT.value();
        } else {
            strValue = AnalyticsValue.VIP_PAY_SUCCESS_EVENT.value();
        }
        lmfVarD.a(contextB, strValue, lmnVar, 0);
        x();
        a(z);
    }

    public static void d(String str, int i2, boolean z, boolean z2) {
        String strValue;
        HashMap map = new HashMap();
        map.put("pageId", i);
        i = "";
        HashMap map2 = new HashMap();
        map2.put("type", str);
        map2.put("ActivationMode", Integer.valueOf(i2));
        map2.put("payfrom", j);
        j = "";
        lmn lmnVar = new lmn();
        lmnVar.d(map);
        lmnVar.e(map2);
        lmf lmfVarD = lmf.d();
        Context contextB = BaseApplication.b();
        if (z) {
            strValue = AnalyticsValue.PREMIER_RENEWAL_PAY_SUCCESS_EVENT.value();
        } else {
            strValue = AnalyticsValue.PREMIER_PAY_SUCCESS_EVENT.value();
        }
        lmfVarD.a(contextB, strValue, lmnVar, 0);
        if (z2) {
            a(z);
        }
    }

    public static void a(boolean z) {
        LogUtil.a("VipBiUtil", "firstOpenVipShowGuide");
        if (z) {
            LogUtil.a("VipBiUtil", "firstOpenVipShowGuide isRenew = true");
            return;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(1004), "cloud_user_privacy16");
        if ("1".equals(SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10000), "personalized_recommend")) && "true".equals(strE)) {
            LogUtil.a("VipBiUtil", "firstOpenVipShowGuide switch is all open");
            return;
        }
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.privacy-collection-display?h5pro=true&urlType=4&pName=com.huawei.health&path=guidePage");
        }
    }

    private static void x() {
        String strE = SharedPreferenceManager.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), Integer.toString(10000), "MAIN_VIP_KEY");
        LogUtil.a("VipBiUtil", "sendKakaTaskMessage vip status = :", strE);
        if ("1".equals(strE)) {
            ddq.d().finishKakaTask(BaseApplication.b(), 10005, null);
        }
    }

    public static void t() {
        e(BaseApplication.b(), AnalyticsValue.VIP_INTRO_PRIVILEGE_MORE_CLICK_EVENT.value(), v());
    }

    public static void l(String str) {
        Map<String, Object> mapV = v();
        mapV.put("name", str);
        e(BaseApplication.b(), AnalyticsValue.VIP_INTRO_PRIVILEGE_ITEM_CLICK_EVENT.value(), mapV);
        l();
        t();
    }

    public static void h(String str) {
        Uri uri = Uri.parse(qqy.g(str));
        HashMap map = new HashMap();
        map.put("operationmusic", "sleep");
        map.put("breath-training", "sleep");
        map.put("fitnesspage", "sport");
        map.put("custom-recipe", "diet");
        map.put("diet-diary", "diet");
        map.put("MemberCoupons", "welfare");
        String queryParameter = uri.getQueryParameter("acquire_name");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = str;
        }
        String str2 = str;
        for (String str3 : map.keySet()) {
            if (str.contains(str3)) {
                str2 = (String) map.get(str3);
            }
        }
        HashMap map2 = new HashMap();
        map2.put("name", queryParameter);
        map2.put("benifitType", str2);
        e(BaseApplication.b(), AnalyticsValue.VIP_INTRO_PRIVILEGE_CORE_SHOW_EVENT.value(), map2);
    }

    public static void g(String str) {
        HashMap map = new HashMap();
        map.put("operationmusic", "sleep");
        map.put("breath-training", "sleep");
        map.put("fitnesspage", "sport");
        map.put("custom-recipe", "diet");
        map.put("diet-diary", "diet");
        map.put("MemberCoupons", "welfare");
        String str2 = str;
        for (String str3 : map.keySet()) {
            if (str.contains(str3)) {
                str2 = (String) map.get(str3);
            }
        }
        Map<String, Object> mapV = v();
        mapV.put("name", str);
        mapV.put("benifitType", str2);
        e(BaseApplication.b(), AnalyticsValue.VIP_INTRO_PRIVILEGE_CORE_ITEM_CLICK_EVENT.value(), mapV);
        l();
        t();
    }

    public static void p() {
        e(BaseApplication.b(), AnalyticsValue.VIP_INTRO_HELP_SERVICE_EVENT.value(), v());
    }

    public static void r() {
        e(BaseApplication.b(), AnalyticsValue.VIP_INTRO_MEMBER_HELP_CLICK_EVENT.value(), v());
        l();
    }

    public static void m() {
        e(BaseApplication.b(), AnalyticsValue.VIP_CENTER_HELP_SHOW_EVENT.value(), v());
    }

    public static void o() {
        e(BaseApplication.b(), AnalyticsValue.VIP_CENTER_HELP_CLICK_EVENT.value(), v());
        k();
    }

    public static void j() {
        e(BaseApplication.b(), AnalyticsValue.VIP_INTRO_REDEEM_CODE_EVENT.value(), v());
    }

    public static void b() {
        e(BaseApplication.b(), AnalyticsValue.VIP_INTRO_MEMBER_REDEEM_CODE_CLICK_EVENT.value(), v());
        l();
    }

    public static void g() {
        e(BaseApplication.b(), AnalyticsValue.VIP_CENTER_RENEW_MANAGE_SHOW_EVENT.value(), v());
    }

    public static void h() {
        e(BaseApplication.b(), AnalyticsValue.VIP_CENTER_AUTO_RENEW_CLICK_EVENT.value(), v());
        k();
    }

    public static void d() {
        e(BaseApplication.b(), AnalyticsValue.VIP_INTRO_GIVEAWAY_CLICK_EVENT.value(), v());
        l();
    }

    public static void c(String str) {
        Map<String, Object> mapV = v();
        mapV.put("name", str);
        e(BaseApplication.b(), AnalyticsValue.VIP_INTRO_GIVEAWAY_ITEM_CLICK_EVENT.value(), mapV);
        l();
    }

    public static void i() {
        e(BaseApplication.b(), AnalyticsValue.VIP_INTRO_VIP_AGREEMENT_EVENT.value(), v());
        l();
    }

    public static void f() {
        e(BaseApplication.b(), AnalyticsValue.VIP_INTRO_RENEW_AGREEMENT_EVENT.value(), v());
        l();
    }

    public static void e(long j2, long j3) {
        HashMap map = new HashMap();
        map.put("enterTime", Long.valueOf(j2));
        map.put("leaveTime", Long.valueOf(j3));
        e(BaseApplication.b(), AnalyticsValue.VIP_INTRO_STAY_EVENT.value(), map);
    }

    public static void c(long j2, long j3) {
        HashMap map = new HashMap();
        map.put("enterTime", Long.valueOf(j2));
        map.put("leaveTime", Long.valueOf(j3));
        e(BaseApplication.b(), AnalyticsValue.VIP_CENTER_STAY_EVENT.value(), map);
    }

    public static void l() {
        e(BaseApplication.b(), AnalyticsValue.VIP_INTRO_CLICK_EVENT.value(), v());
    }

    public static void k() {
        e(BaseApplication.b(), AnalyticsValue.VIP_CENTER_CLICK_EVENT.value(), v());
    }

    public static void e(int i2) {
        HashMap map = new HashMap();
        map.put("entry", Integer.valueOf(i2));
        e(BaseApplication.b(), AnalyticsValue.VIP_INTRO_MEMBER_CARD_CLICK_EVENT.value(), map);
        l();
    }

    public static void b(int i2) {
        HashMap map = new HashMap();
        map.put("entry", Integer.valueOf(i2));
        e(BaseApplication.b(), AnalyticsValue.VIP_CENTER_MEMBER_CARD_CLICK_EVENT.value(), map);
        k();
    }

    public static void a(Product product) {
        Map<String, Object> mapV = v();
        mapV.put("isSale", Integer.valueOf((product.getPromotion() == null && product.getSubscriptionPromotion() == null) ? 0 : 1));
        mapV.put(HwPayConstant.KEY_PRODUCTNAME, product.getProductName());
        mapV.put("productId", product.getProductId());
        mapV.put(ParsedFieldTag.PRICE, Long.valueOf(product.getMicroPrice() / 1000));
        e(BaseApplication.b(), AnalyticsValue.VIP_INTRO_PRODUCT_CLICK_EVENT.value(), mapV);
        l();
    }

    public static void e(int i2, int i3) {
        Map<String, Object> mapV = v();
        mapV.put(CommonUtil.PAGE_TYPE, Integer.valueOf(i3));
        mapV.put("event", Integer.valueOf(i2));
        e(BaseApplication.b(), AnalyticsValue.VIP_EQUITY_CLICK_EVENT.value(), mapV);
        if (i3 == 1) {
            l();
        } else {
            k();
        }
    }

    public static void d(String str, String str2, int i2) {
        Map<String, Object> mapV = v();
        if (!TextUtils.isEmpty(str)) {
            mapV.put("name", str);
        } else {
            mapV.put("name", "vipTab");
        }
        mapV.put("from", str2);
        mapV.put("payResourceType", k);
        mapV.put("slidingScreens", Integer.valueOf(i2));
        e(BaseApplication.b(), AnalyticsValue.VIP_INTRO_OPEN_BTN_CLICK_EVENT.value(), mapV);
        l();
    }

    public static void d(String str, String str2) {
        String strValue;
        HashMap map = new HashMap();
        map.put("pageId", i);
        HashMap map2 = new HashMap();
        map2.put("event", 1);
        map2.put("payResourceType", str2);
        map2.put("name", str);
        map2.put("itemId", g);
        map2.put("moduleName", "main_page");
        HashMap map3 = new HashMap();
        map3.put(WebViewHelp.BI_KEY_PULL_FROM, l);
        map3.put("pullOrder", m);
        UserMemberInfo userMemberInfoA = irz.a();
        map2.put(FunctionSetBeanReader.BI_ELEMENT, (userMemberInfoA == null || userMemberInfoA.getMemberFlag() == -1) ? "e1" : "e2");
        lmn lmnVar = new lmn();
        lmnVar.d(map);
        lmnVar.e(map2);
        lmnVar.c(map3);
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            map2.putAll(marketRouterApi.getLastMarketSource());
        }
        if (d) {
            strValue = AnalyticsValue.VIP_RES_INTRO_OPEN_BY_BUSINESS_BTN_CLICK.value();
        } else {
            strValue = AnalyticsValue.VIP_FUNC_INTRO_OPEN_BY_BUSINESS_BTN_CLICK.value();
        }
        lmf.d().a(BaseApplication.b(), strValue, lmnVar, 0);
    }

    public static void n() {
        e(BaseApplication.b(), AnalyticsValue.VIP_CENTER_COUPON_SHOW_EVENT.value(), v());
    }

    public static void c(String str, String str2) {
        Map<String, Object> mapV = v();
        mapV.put("couponId", str);
        mapV.put("couponName", str2);
        e(BaseApplication.b(), AnalyticsValue.VIP_CENTER_COUPON_CLICK_EVENT.value(), mapV);
        k();
    }

    public static void s() {
        e(BaseApplication.b(), AnalyticsValue.VIP_CENTER_RENEW_BTN_SHOW_EVENT.value(), v());
    }

    public static void a(String str, String str2) {
        Map<String, Object> mapV = v();
        if (!TextUtils.isEmpty(str)) {
            mapV.put("name", str);
        } else {
            mapV.put("name", "vipTab");
        }
        mapV.put("from", str2);
        e(BaseApplication.b(), AnalyticsValue.VIP_CENTER_RENEW_BTN_CLICK_EVENT.value(), mapV);
        k();
    }

    public static void j(String str) {
        HashMap map = new HashMap();
        map.put("name", str);
        e(BaseApplication.b(), AnalyticsValue.VIP_CENTER_PRIVILEGE_SHOW_EVENT.value(), map);
    }

    public static void f(String str) {
        Map<String, Object> mapV = v();
        mapV.put("name", str);
        e(BaseApplication.b(), AnalyticsValue.VIP_CENTER_PRIVILEGE_CLICK_EVENT.value(), mapV);
        k();
    }

    public static void d(Context context, String str) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", str);
        map.put("from", "6");
        map.put("dataType", new String[]{"weight"});
        lmf.d().c(context, AnalyticsValue.HEALTH_HEALTH_WEIGHT_INPUT_2030017.value(), map, 0);
    }

    private static Map<String, Object> v() {
        HashMap map = new HashMap();
        map.put("click", "1");
        return map;
    }

    private static void e(final Context context, final String str, final Map<String, Object> map) {
        if (str == null || map == null) {
            return;
        }
        if (!TextUtils.isEmpty(o)) {
            map.put(DistrictSearchQuery.KEYWORDS_PROVINCE, o);
        }
        if (!TextUtils.isEmpty(f33860c)) {
            map.put(DistrictSearchQuery.KEYWORDS_CITY, f33860c);
        }
        LogUtil.a("VipBiUtil", "eventId: ", str, " eventMap: ", map);
        ThreadPoolManager.c().execute(new Runnable() { // from class: fcn.1
            @Override // java.lang.Runnable
            public void run() {
                lmf.d().c(context, str, map, 0);
            }
        });
    }

    public static Map<String, String> e() {
        HashMap map = new HashMap(16);
        map.put(WebViewHelp.BI_KEY_PULL_FROM, l);
        map.put("resourceId", n);
        map.put("resourceName", s);
        map.put("pullOrder", m);
        return map;
    }

    public static void q() {
        String strValue;
        if (CollectionUtils.c(f33858a) || CollectionUtils.c(k)) {
            return;
        }
        HashMap map = new HashMap();
        map.put("pageId", i);
        HashMap map2 = new HashMap();
        map2.put("event", 0);
        map2.put("payResourceType", k);
        map2.put("name", f33858a);
        map2.put(ParamConstants.Param.VIEW_TYPE, "semi_modal_package");
        map2.put("moduleName", "main_page");
        map2.put("itemId", g);
        HashMap map3 = new HashMap();
        map3.put(WebViewHelp.BI_KEY_PULL_FROM, l);
        map3.put("pullOrder", m);
        lmn lmnVar = new lmn();
        lmnVar.d(map);
        lmnVar.e(map2);
        lmnVar.c(map3);
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            map2.putAll(marketRouterApi.getLastMarketSource());
        }
        if (d) {
            strValue = AnalyticsValue.VIP_RES_INTRO_OPEN_BY_BUSINESS_SHOW.value();
        } else {
            strValue = AnalyticsValue.VIP_FUNC_INTRO_OPEN_BY_BUSINESS_SHOW.value();
        }
        lmf.d().a(BaseApplication.b(), strValue, lmnVar, 0);
    }
}
