package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import health.compact.a.AuthorizationUtils;
import health.compact.a.Utils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class lmc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<String, String> f40430a;
    private static final HashMap<String, String> d;

    static {
        HashMap<String, String> map = new HashMap<>();
        d = map;
        HashMap<String, String> map2 = new HashMap<>();
        f40430a = map2;
        map.put("KnitFragment4040", "Recommendations_page_0001");
        map.put("MemberIntroFragment", "Member_center_Page_0001");
        map.put("MemberCenterFragment", "Member_center_Page_0001");
        map2.put("KnitFragment4040", "推荐");
        map2.put("MemberIntroFragment", "会员开通");
        map2.put("MemberCenterFragment", "会员");
    }

    public static String a(String str) {
        HashMap<String, String> map = d;
        if (!map.containsKey(str)) {
            return "";
        }
        return map.get(str);
    }

    public static String b(String str) {
        HashMap<String, String> map = f40430a;
        if (!map.containsKey(str)) {
            return "";
        }
        return map.get(str);
    }

    public static boolean d(String str) {
        if (a()) {
            return "KnitFragment".equals(str) || "MemberIntroFragment".equals(str) || "MemberCenterFragment".equals(str);
        }
        return false;
    }

    public static void a(lme lmeVar) {
        if (lmeVar == null || TextUtils.isEmpty(lmeVar.c())) {
            return;
        }
        HashMap map = new HashMap();
        map.put("pageId", lmeVar.c());
        map.put("pageName", lmeVar.d());
        map.put("pageClass", lmeVar.a());
        map.put("pageExposureTime", Long.valueOf(lmeVar.b()));
        if (njy.b(lmeVar.e())) {
            map.put("exposureInfo", new Gson().toJson(lmeVar.e()));
        }
        lmn lmnVar = new lmn();
        lmnVar.e(map);
        HashMap map2 = new HashMap(1);
        map2.put("pageId", lmeVar.c());
        lmnVar.d(map2);
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.EXPOSURE_TIME_H1000005.value(), lmnVar, 0);
    }

    public static boolean a() {
        return (niz.c() || Utils.i()) && AuthorizationUtils.c(null);
    }
}
