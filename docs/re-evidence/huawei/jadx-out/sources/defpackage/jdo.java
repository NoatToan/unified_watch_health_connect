package defpackage;

import android.text.TextUtils;
import com.amap.api.services.district.DistrictSearchQuery;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.route.utils.RouteSourceUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class jdo {
    public static void e() {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put(CommonUtil.PAGE_TYPE, 2);
        lmf.d().c(BaseApplication.b(), "1040081", map, 0);
    }

    public static void c() {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put(CommonUtil.PAGE_TYPE, 3);
        lmf.d().c(BaseApplication.b(), "1040081", map, 0);
    }

    public static void j() {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("event", 4);
        lmf.d().c(BaseApplication.b(), "1040083", map, 0);
    }

    public static void f() {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("event", 3);
        lmf.d().c(BaseApplication.b(), "1040083", map, 0);
    }

    public static void a() {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("event", 1);
        lmf.d().c(BaseApplication.b(), "1040083", map, 0);
    }

    public static void d(int i) {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        lmf.d().c(BaseApplication.b(), RouteSourceUtils.RUNNING_ROUTE_ANALYSIS_1040087, map, 0);
    }

    public static void b() {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("event", 2);
        lmf.d().c(BaseApplication.b(), "1040083", map, 0);
    }

    public static void e(boolean z, int i) {
        HashMap map = new HashMap(7);
        map.put("click", 1);
        map.put("searchResult", z + "");
        map.put(DistrictSearchQuery.KEYWORDS_CITY, h());
        map.put("routeStyle", Integer.valueOf(i));
        map.put(BleConstants.SPORT_TYPE, 258);
        map.put("orderType", null);
        map.put(CommonUtil.PAGE_TYPE, 2);
        lmf.d().c(BaseApplication.b(), "1040082", map, 0);
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Track_RouteBiUtils", "routeId is empty, no bi");
            return;
        }
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("event", 1);
        map.put("routeID", str);
        lmf.d().c(BaseApplication.b(), "1040090", map, 0);
    }

    public static void d(int i, int i2, String str, int i3) {
        HashMap map = new HashMap(6);
        map.put("click", 1);
        map.put("from", Integer.valueOf(i2));
        map.put("sportPage", 258);
        map.put("routeStyle", Integer.valueOf(i));
        map.put(WebViewHelp.BI_KEY_PULL_FROM, str);
        map.put("status", Integer.valueOf(i3));
        lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), "1040079", map, 0);
    }

    public static void c(long j) {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("grades", Long.valueOf(j));
        lmf.d().c(BaseApplication.b(), "1040080", map, 0);
    }

    public static void d() {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put(CommonUtil.PAGE_TYPE, 1);
        lmf.d().c(BaseApplication.b(), "1040081", map, 0);
    }

    public static void b(String str, String str2, String str3, boolean z) {
        HashMap map = new HashMap(5);
        map.put("event", 1);
        map.put(FunctionSetBeanReader.BI_ELEMENT, str);
        map.put("resource_id", str2);
        map.put("resource_name", str3);
        map.put("resourceType", z ? "graffiti" : "routes");
        HashMap map2 = new HashMap(1);
        map2.put("pageId", "Sport_routes_0004");
        lmn lmnVar = new lmn();
        lmnVar.e(map);
        lmnVar.d(map2);
        lmf.d().a(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), "1040090", lmnVar, 0);
    }

    public static void c(int i, String str, String str2, boolean z) {
        HashMap map = new HashMap(6);
        map.put("event", 1);
        map.put(FunctionSetBeanReader.BI_ELEMENT, "m4");
        map.put("value", Integer.valueOf(i));
        map.put("resource_id", str);
        map.put("resource_name", str2);
        map.put("resourceType", z ? "graffiti" : "routes");
        HashMap map2 = new HashMap(1);
        map2.put("pageId", "Sport_routes_0004");
        lmn lmnVar = new lmn();
        lmnVar.e(map);
        lmnVar.d(map2);
        lmf.d().a(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), "1040090", lmnVar, 0);
    }

    public static void b(int i, String str, String str2, String str3, boolean z) {
        HashMap map = new HashMap(5);
        map.put("event", Integer.valueOf(i));
        map.put(FunctionSetBeanReader.BI_ELEMENT, str);
        map.put("resource_id", str2);
        map.put("resource_name", str3);
        map.put("resourceType", z ? "graffiti" : "routes");
        HashMap map2 = new HashMap(1);
        map2.put("pageId", "Sport_routes_0004");
        lmn lmnVar = new lmn();
        lmnVar.e(map);
        lmnVar.d(map2);
        lmf.d().a(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), "1040079", lmnVar, 0);
    }

    private static String h() {
        HotPathCityInfo hotPathCityInfo;
        if (jdn.a() != null) {
            return jdn.a().getCityName();
        }
        String strE = buh.e("RUNNING_PATH_CITY_INFO");
        if (!TextUtils.isEmpty(strE) && (hotPathCityInfo = (HotPathCityInfo) qqt.e(strE, HotPathCityInfo.class)) != null) {
            return hotPathCityInfo.getCityName();
        }
        return "";
    }
}
