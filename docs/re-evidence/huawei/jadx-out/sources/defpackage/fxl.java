package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.google.gson.Gson;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ColumRecommendInfo;
import com.huawei.health.marketing.datatype.RcmItem;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.TopBannerTemplate;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.marketing.views.HealthFloatBar;
import com.huawei.health.marketing.views.SportBannerLayout;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.floatview.HealthFloatingView;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.commonui.woundplastadview.WoundPlast;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class fxl {
    public static boolean d(int i) {
        return i == 1 || i == 109 || i == 68 || i == 69 || i == 89 || i == 70 || i == 45 || i == 50 || i == 2 || i == 81 || i == 67;
    }

    public static String d(Context context) {
        String strA = CommonUtil.a(context);
        return strA.contains(Constants.LINK) ? strA.substring(0, strA.indexOf(Constants.LINK)) : strA;
    }

    public static String e() {
        if (EnvironmentInfo.m()) {
            LogUtil.b("MarketingUtils", "getMarketClientType is mobile app engine");
            return "1";
        }
        if (qrs.ah(BaseApplication.getContext())) {
            return "5";
        }
        if (SystemInfo.d()) {
            return "1";
        }
        if (SystemInfo.c()) {
            return SystemInfo.j() ? "2" : "1";
        }
        return "3";
    }

    public static void e(Context context, LinearLayout linearLayout, int i) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.e("MarketingUtils", "initMarketing failed cause context is null!");
            return;
        }
        if (linearLayout == null) {
            com.huawei.hwlogsmodel.LogUtil.e("MarketingUtils", "initMarketing failed cause marketingLayout is null!");
            return;
        }
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            Task<Map<Integer, ResourceResultInfo>> resourceResultInfo = marketingApi.getResourceResultInfo(i);
            com.huawei.hwlogsmodel.LogUtil.a("MarketingUtils", "request positionId = ", Integer.valueOf(i));
            resourceResultInfo.addOnSuccessListener(new d(context, marketingApi, linearLayout));
        }
    }

    static class d implements OnSuccessListener<Map<Integer, ResourceResultInfo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        MarketingApi f34692a;
        LinearLayout d;
        WeakReference<Context> e;

        d(Context context, MarketingApi marketingApi, LinearLayout linearLayout) {
            this.e = new WeakReference<>(context);
            this.f34692a = marketingApi;
            this.d = linearLayout;
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final Map<Integer, ResourceResultInfo> map) {
            WeakReference<Context> weakReference = this.e;
            if (weakReference == null) {
                com.huawei.hwlogsmodel.LogUtil.j("MarketingUtils", "ResourceSucceedListener mWeakReference is null.");
                return;
            }
            final Context context = weakReference.get();
            if (context == null) {
                com.huawei.hwlogsmodel.LogUtil.j("MarketingUtils", "ResourceSucceedListener context is null.");
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: fxl.d.2
                    @Override // java.lang.Runnable
                    public void run() {
                        final Map<Integer, ResourceResultInfo> mapFilterMarketingRules = d.this.f34692a.filterMarketingRules(map);
                        HandlerExecutor.b(new Runnable() { // from class: fxl.d.2.4
                            @Override // java.lang.Runnable
                            public void run() {
                                d.this.a(d.this.f34692a.getMarketingViewList(context, mapFilterMarketingRules), d.this.d);
                            }
                        });
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(List<View> list, LinearLayout linearLayout) {
            if (njy.e(list)) {
                com.huawei.hwlogsmodel.LogUtil.j("MarketingUtils", "generationViews viewList is empty");
                return;
            }
            for (View view : list) {
                if (view instanceof SportBannerLayout) {
                    ((SportBannerLayout) view).setParentViewGroup(linearLayout);
                    com.huawei.hwlogsmodel.LogUtil.a("MarketingUtils", "SportBanner parent width:", Integer.valueOf(linearLayout.getWidth()), " height:", Integer.valueOf(linearLayout.getHeight()));
                }
                linearLayout.addView(view);
            }
        }
    }

    public static void e(final int i, final LinearLayout linearLayout) {
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            marketingApi.getResourceResultInfo(i).addOnSuccessListener(new OnSuccessListener<Map<Integer, ResourceResultInfo>>() { // from class: fxl.4
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Map<Integer, ResourceResultInfo> map) {
                    com.huawei.hwlogsmodel.LogUtil.a("MarketingUtils", "get woundPlast success. positionId: ", Integer.valueOf(i));
                    ResourceResultInfo resourceResultInfo = marketingApi.filterMarketingRules(map).get(Integer.valueOf(i));
                    if (resourceResultInfo == null || resourceResultInfo.getTotalNum() == 0) {
                        com.huawei.hwlogsmodel.LogUtil.j("MarketingUtils", "wound plast resourceResultInfo is null. PositionId: ", Integer.valueOf(i));
                        return;
                    }
                    final ResourceBriefInfo resourceBriefInfo = resourceResultInfo.getResources().get(0);
                    String content = resourceBriefInfo.getContent().getContent();
                    Gson gson = new Gson();
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    final TopBannerTemplate topBannerTemplate = (TopBannerTemplate) gson.fromJson(content, TopBannerTemplate.class);
                    WoundPlast woundPlast = new WoundPlast(com.huawei.haf.application.BaseApplication.b());
                    woundPlast.setAdImage(topBannerTemplate.getPicture());
                    woundPlast.setImageSizeMode(WoundPlast.ImageSizeMode.SMALL_IMAGE);
                    woundPlast.setAdClickListener(new View.OnClickListener() { // from class: fxl.4.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            MarketingBiUtils.c(i, resourceBriefInfo, jCurrentTimeMillis);
                            fxl.d(topBannerTemplate.getLinkValue(), i, resourceBriefInfo);
                        }
                    });
                    woundPlast.setCloseBtnClickListener(new View.OnClickListener() { // from class: fxl.4.4
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            fxl.b(i, 1, resourceBriefInfo);
                            linearLayout.setVisibility(8);
                            MarketingBiUtils.b(i, resourceBriefInfo, jCurrentTimeMillis);
                        }
                    });
                    linearLayout.addView(woundPlast);
                    MarketingBiUtils.e(i, resourceBriefInfo);
                }
            });
        }
    }

    private static void b(View view, String str, boolean z) {
        com.huawei.hwlogsmodel.LogUtil.a("MarketingUtils", "setFloatBarVisible");
        if (view == null) {
            com.huawei.hwlogsmodel.LogUtil.d("MarketingUtils", "view is null.");
            return;
        }
        if (!z) {
            com.huawei.hwlogsmodel.LogUtil.d("MarketingUtils", "view is inVisible.");
            return;
        }
        View viewFindViewWithTag = view.findViewWithTag(67);
        if (!(viewFindViewWithTag instanceof HealthFloatBar)) {
            com.huawei.hwlogsmodel.LogUtil.j("MarketingUtils", "floatBar is not HealthFloatBar. positionId = ", 8002, "contenttype is", 67);
            ObserverManagerUtil.e("HEALTH_FLOAT_BAR_STATE_CHANGE", 8);
        } else {
            ((HealthFloatBar) viewFindViewWithTag).setPageVisibility(str);
            qso.d().a(viewFindViewWithTag, true);
        }
    }

    private static void a(View view, String str, boolean z) {
        com.huawei.hwlogsmodel.LogUtil.a("MarketingUtils", "setShapedFloatBoxVisible");
        if (view == null) {
            com.huawei.hwlogsmodel.LogUtil.d("MarketingUtils", "view is null.");
            return;
        }
        View viewFindViewWithTag = view.findViewWithTag(81);
        qso.d().a(viewFindViewWithTag, true);
        if (!z) {
            com.huawei.hwlogsmodel.LogUtil.d("MarketingUtils", "view is inVisible.");
        } else if (!(viewFindViewWithTag instanceof HealthFloatBar)) {
            com.huawei.hwlogsmodel.LogUtil.j("MarketingUtils", "floatBar is not HealthFloatBar. positionId = ", 8002, "contenttype is", 81);
            ObserverManagerUtil.e("HEALTH_FLOAT_BAR_STATE_CHANGE", 8);
        } else {
            ((HealthFloatBar) viewFindViewWithTag).setPageVisibility(str);
        }
    }

    private static void d(View view, boolean z, int i) {
        com.huawei.hwlogsmodel.LogUtil.a("MarketingUtils", "setFloatingViewVisible, positionId: ", Integer.valueOf(i));
        HealthFloatingView healthFloatingViewC = ScrollUtil.c(view, i);
        if (healthFloatingViewC == null) {
            com.huawei.hwlogsmodel.LogUtil.j("MarketingUtils", "floatview is null. positionId = ", Integer.valueOf(i));
            return;
        }
        if (z) {
            if (healthFloatingViewC.f()) {
                healthFloatingViewC.h();
                qkz.d(healthFloatingViewC);
                return;
            }
            return;
        }
        if (healthFloatingViewC.f()) {
            return;
        }
        healthFloatingViewC.c();
    }

    public static void c(View view, boolean z, int i, String str) {
        com.huawei.hwlogsmodel.LogUtil.a("MarketingUtils", "setViewVisible, isVisible: ", Boolean.valueOf(z), ", positionId: ", Integer.valueOf(i));
        if (z) {
            qkz.a(i);
        }
        if (view == null) {
            com.huawei.hwlogsmodel.LogUtil.d("MarketingUtils", "view is null.");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            b(view, str, z);
            a(view, str, z);
        }
        d(view, z, i);
    }

    public static void b(int i, int i2, ResourceBriefInfo resourceBriefInfo) {
        MarketingApi marketingApi = (MarketingApi) Services.b("FeatureMarketing", MarketingApi.class);
        if (resourceBriefInfo != null) {
            marketingApi.recordResourcePresent(i, i2, resourceBriefInfo);
        }
    }

    public static void e(String str, int i, ResourceBriefInfo resourceBriefInfo, int i2) {
        if (TextUtils.isEmpty(str)) {
            com.huawei.hwlogsmodel.LogUtil.j("MarketingUtils", "linkUrl is null.");
            return;
        }
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        String strD = d(str, resourceBriefInfo.getCategory());
        if (marketRouterApi != null) {
            marketRouterApi.router(d(strD, resourceBriefInfo, i, i2));
        }
    }

    public static void d(String str, int i, ResourceBriefInfo resourceBriefInfo) {
        e(str, i, resourceBriefInfo, 1);
    }

    public static String d(String str, ResourceBriefInfo resourceBriefInfo, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.contains("?") ? "&pullfrom=" : "?pullfrom=");
        sb.append(i);
        String string = sb.toString();
        if (resourceBriefInfo == null) {
            return string;
        }
        return string + "&resourceName=" + resourceBriefInfo.getResourceName() + "&resourceId=" + resourceBriefInfo.getResourceId() + "&pullOrder=" + i2;
    }

    public static void d(ColumRecommendInfo columRecommendInfo, ResourceBriefInfo resourceBriefInfo) {
        if (columRecommendInfo == null || resourceBriefInfo == null) {
            return;
        }
        String strE = e(resourceBriefInfo.getRecommendList(), columRecommendInfo.getItemId());
        if (!TextUtils.isEmpty(strE)) {
            columRecommendInfo.setAlgId(strE);
            columRecommendInfo.setSmartRecommend(true);
        }
        columRecommendInfo.setAbInfo(MarketingBiUtils.c(resourceBriefInfo));
        columRecommendInfo.setRecommendInfoGenerated(true);
    }

    public static String e(List<RcmItem> list, String str) {
        if (TextUtils.isEmpty(str)) {
            com.huawei.hwlogsmodel.LogUtil.j("MarketingUtils", "getSingleGridAlgId itemId is null.");
            return "";
        }
        if (njy.e(list)) {
            com.huawei.hwlogsmodel.LogUtil.j("MarketingUtils", "getSingleGridAlgId recommendList is null.");
            return "";
        }
        for (RcmItem rcmItem : list) {
            if (rcmItem != null && str.equals(rcmItem.getItemId())) {
                return rcmItem.getAlgId();
            }
        }
        return "";
    }

    public static String c(String str, int i, int i2, ColumRecommendInfo columRecommendInfo, ResourceBriefInfo resourceBriefInfo) {
        String strC;
        String strE;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (resourceBriefInfo == null) {
            com.huawei.hwlogsmodel.LogUtil.j("MarketingUtils", "briefInfo is null.");
            return str;
        }
        if (columRecommendInfo == null) {
            com.huawei.hwlogsmodel.LogUtil.j("MarketingUtils", "content is null.");
            return str;
        }
        String itemId = columRecommendInfo.getItemId();
        if (columRecommendInfo instanceof SingleGridContent) {
            SingleGridContent singleGridContent = (SingleGridContent) columRecommendInfo;
            itemId = resourceBriefInfo.getSmartRecommend() ? singleGridContent.getItemId() : singleGridContent.getDynamicDataId();
        }
        if (columRecommendInfo.isRecommendInfoGenerated()) {
            strC = columRecommendInfo.getAbInfo();
            strE = columRecommendInfo.getAlgId();
        } else {
            strC = MarketingBiUtils.c(resourceBriefInfo);
            strE = e(resourceBriefInfo.getRecommendList(), itemId);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.contains("?") ? "&pullfrom=" : "?pullfrom=");
        sb.append(i);
        sb.append("&resourceName=");
        sb.append(resourceBriefInfo.getResourceName());
        sb.append("&resourceId=");
        sb.append(resourceBriefInfo.getResourceId());
        sb.append("&pullOrder=");
        sb.append(i2);
        sb.append("&algId=");
        sb.append(strE);
        sb.append("&itemId=");
        sb.append(itemId);
        String string = sb.toString();
        if (TextUtils.isEmpty(strC)) {
            return string;
        }
        return string + "&ab_info=" + strC;
    }

    public static String d(String str, String str2) {
        if (TextUtils.isEmpty(str) || !"Merchandise".equals(str2)) {
            return str;
        }
        if (str.contains("?")) {
            return str + "&pullCategory=" + str2;
        }
        return str + "?pullCategory=" + str2;
    }

    public static String d() {
        if (qrs.ah(BaseApplication.getContext())) {
            return "5";
        }
        if (SystemInfo.d()) {
            return "1";
        }
        if (SystemInfo.c()) {
            return SystemInfo.j() ? "2" : "1";
        }
        return "3";
    }

    public static boolean b(long j, long j2) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (j != 0 && j2 != 0) {
            return j <= timeInMillis && timeInMillis <= j2;
        }
        if (j == 0 || j2 != 0) {
            return j != 0 || j2 == 0 || timeInMillis <= j2;
        }
        return j <= timeInMillis;
    }

    public static boolean c(Context context) {
        if (b(context)) {
            return "true".equals(SharedPreferenceManager.e(context, Integer.toString(1004), "cloud_user_privacy16"));
        }
        return false;
    }

    public static boolean b(Context context) {
        return "1".equals(SharedPreferenceManager.e(context, Integer.toString(10000), "personalized_recommend"));
    }

    public static boolean a(List<String> list) {
        boolean z;
        boolean z2;
        if (njy.e(list)) {
            com.huawei.hwlogsmodel.LogUtil.a("MarketingUtils", "UserLabelKey is empty.");
            return true;
        }
        UserLabelServiceApi userLabelServiceApi = (UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class);
        if (userLabelServiceApi == null) {
            com.huawei.hwlogsmodel.LogUtil.j("MarketingUtils", "UserLabelServiceApi is null.");
            return true;
        }
        Context contextB = com.huawei.haf.application.BaseApplication.b();
        if (c(contextB) || !userLabelServiceApi.isContainsHealthLabel(list)) {
            z = true;
        } else {
            com.huawei.hwlogsmodel.LogUtil.a("MarketingUtils", "Contain health label. Health service switch is close.");
            z = false;
        }
        if (b(contextB) || !userLabelServiceApi.isContainsOtherLabel(list)) {
            z2 = true;
        } else {
            com.huawei.hwlogsmodel.LogUtil.a("MarketingUtils", "Contain other label. Personalized recommend switch is close.");
            z2 = false;
        }
        return z && z2;
    }

    public static int c(long j, long j2) {
        return Math.abs(lsl.a(j, j2)) - 1;
    }

    public static void d(int i, ResourceBriefInfo resourceBriefInfo, long j, String str, boolean z, int i2) {
        HashMap map = new HashMap();
        map.put("resourcePositionId", Integer.valueOf(i));
        map.put("resourceId", resourceBriefInfo.getResourceId());
        map.put("resourceName", resourceBriefInfo.getResourceName());
        map.put("event", 2);
        map.put("itemCardName", str);
        map.put("smartRecommend", Boolean.valueOf(z));
        map.put("algId", "");
        map.put("pullOrder", Integer.valueOf(i2 + 1));
        map.put("durationTime", Long.valueOf(System.currentTimeMillis() - j));
        lmf.d().c(com.huawei.haf.application.BaseApplication.b(), AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    public static boolean d(long j, long j2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j != 0 && j2 != 0) {
            return j <= jCurrentTimeMillis && jCurrentTimeMillis <= j2;
        }
        if (j == 0 || j2 != 0) {
            return j != 0 || j2 == 0 || jCurrentTimeMillis <= j2;
        }
        return j <= jCurrentTimeMillis;
    }
}
