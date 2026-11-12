package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.featuremarketing.db.MarketingEventDbMgr;
import com.huawei.health.marketing.datatype.MarketingEventInfo;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.templates.FloatingBoxTemplate;
import com.huawei.health.marketing.datatype.templates.PopUpCombinationTemplate;
import com.huawei.health.marketing.datatype.templates.PopUpListItemsTemplate;
import com.huawei.health.marketing.datatype.templates.PopUpMemberTemplate;
import com.huawei.health.marketing.datatype.templates.PopUpTemplate;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.marketing.views.HealthFloatBar;
import com.huawei.health.marketing.views.HealthFloatingShapedBox;
import com.huawei.health.marketing.views.TopBannerLayout;
import com.huawei.health.marketing.views.dialog.EquityRenewalDialog;
import com.huawei.health.marketing.views.dialog.MarketingDialogFragment;
import com.huawei.health.marketing.views.dialog.MemberRenewalDialog;
import com.huawei.health.marketing.views.dialog.ReceiveCouponDialog;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.dialog.RotateDialog;
import com.huawei.ui.commonui.floatview.HealthFloatingView;
import health.compact.a.LogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public class evh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f33514b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MarketingOption f33515c;

    public evh(MarketingOption marketingOption) {
        this.f33515c = marketingOption;
    }

    public static List<View> b(Context context, Map<Integer, ResourceResultInfo> map, FragmentManager fragmentManager) {
        if (map == null) {
            LogUtil.b("MarketingResourceSetting", "ResultInfoMap is null.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, ResourceResultInfo>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next().getKey();
            int iIntValue = key.intValue();
            ResourceResultInfo resourceResultInfo = map.get(key);
            if (resourceResultInfo == null) {
                LogUtil.b("MarketingResourceSetting", "ResourceResultInfo is null. positionId: ", key);
            } else {
                List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
                if (resourceResultInfo.getTotalNum() == 0 || njy.e(resources)) {
                    LogUtil.b("MarketingResourceSetting", "resourceBriefInfoList is null. positionId: ", key);
                } else {
                    for (ResourceBriefInfo resourceBriefInfo : resources) {
                        if (resourceBriefInfo != null) {
                            List<View> listA = eup.a(context, iIntValue, resourceBriefInfo, fragmentManager);
                            if (njy.b(listA)) {
                                arrayList.addAll(listA);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    void d(int i, Map<Integer, ResourceResultInfo> map, Map<String, ?> map2) {
        if (map == null) {
            LogUtil.b("MarketingResourceSetting", "resultInfoMap is null. no valid resource.");
            return;
        }
        for (Map.Entry<Integer, ResourceResultInfo> entry : map.entrySet()) {
            Integer key = entry.getKey();
            int iIntValue = key.intValue();
            ResourceResultInfo value = entry.getValue();
            if (value == null) {
                LogUtil.b("MarketingResourceSetting", "ResourceResultInfo is null. positionId: ", key);
            } else if (value.getTotalNum() == 0) {
                LogUtil.b("MarketingResourceSetting", "ResourceResultInfo is totalNum is 0. positionId: ", key);
            } else {
                List<ResourceBriefInfo> resources = value.getResources();
                if (iIntValue != 1003 || !e(iIntValue, resources)) {
                    LogUtil.b("MarketingResourceSetting", "setResource positionId: ", key);
                    b(resources, iIntValue, i, map2);
                } else {
                    LogUtil.b("MarketingResourceSetting", "positionId is banner");
                    return;
                }
            }
        }
    }

    private boolean e(int i, List<ResourceBriefInfo> list) {
        Context context = this.f33515c.getContext();
        Map<Integer, LinearLayout> layoutMap = this.f33515c.getLayoutMap();
        if (context == null || layoutMap == null) {
            LogUtil.e("MarketingResourceSetting", "caller is dead, processMarketingBanner abort");
            return false;
        }
        LinearLayout linearLayout = layoutMap.get(Integer.valueOf(i));
        if (linearLayout == null || njy.e(list)) {
            LogUtil.b("MarketingResourceSetting", "layout or resourceBriefInfoList is null.");
            return false;
        }
        linearLayout.removeAllViews();
        linearLayout.addView(e(context, list));
        return true;
    }

    private TopBannerLayout e(Context context, List<ResourceBriefInfo> list) {
        if (context == null) {
            return null;
        }
        TopBannerLayout topBannerLayout = new TopBannerLayout(context);
        topBannerLayout.a(list);
        return topBannerLayout;
    }

    private void b(List<ResourceBriefInfo> list, int i, int i2, Map<String, ?> map) {
        for (ResourceBriefInfo resourceBriefInfo : list) {
            if (resourceBriefInfo != null) {
                this.f33514b.postDelayed(new c(resourceBriefInfo, i, i2), a(resourceBriefInfo, i2, map));
            }
        }
    }

    private int a(ResourceBriefInfo resourceBriefInfo, int i, Map<String, ?> map) {
        int iA;
        if (resourceBriefInfo.getMarketingRule() != null && (iA = evr.a(i, map, resourceBriefInfo.getMarketingRule().getTriggerEvents())) >= 0) {
            return iA * 1000;
        }
        return 0;
    }

    private void c(Context context, final int i, final ResourceBriefInfo resourceBriefInfo) {
        gbc gbcVar = new gbc(context, (PopUpListItemsTemplate) new Gson().fromJson(resourceBriefInfo.getContent().getContent(), PopUpListItemsTemplate.class));
        gbcVar.d(new RotateDialog.OnVisibleListenter() { // from class: evk
            @Override // com.huawei.ui.commonui.dialog.RotateDialog.OnVisibleListenter
            public final void onVisible(boolean z, View view) {
                evh.b(i, resourceBriefInfo, z, view);
            }
        });
        gbcVar.b();
    }

    static /* synthetic */ void b(int i, ResourceBriefInfo resourceBriefInfo, boolean z, View view) {
        if (z) {
            b(i, resourceBriefInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(int i, ResourceBriefInfo resourceBriefInfo, int i2) {
        if (resourceBriefInfo == null) {
            return false;
        }
        Context context = this.f33515c.getContext();
        if (context == null) {
            LogUtil.e("MarketingResourceSetting", "caller is dead, no need to instantiate view...");
            return false;
        }
        int contentType = resourceBriefInfo.getContentType();
        if (e(contentType)) {
            LogUtil.b("MarketingResourceSetting", "PopUp switch is off, stop setting resource. positionId: ", Integer.valueOf(i));
            return false;
        }
        if (contentType == 1) {
            LogUtil.b("MarketingResourceSetting", "TEMPLATE_POP_UP,set dialog.");
            d(context, i, resourceBriefInfo);
            return true;
        }
        if (contentType == 2) {
            LogUtil.b("MarketingResourceSetting", "TEMPLATE_FLOATING_BOX,set floatingBox.");
            d(context, i, resourceBriefInfo, i2);
            return false;
        }
        if (contentType == 45 || contentType == 50) {
            LogUtil.b("MarketingResourceSetting", "TEMPLATE_POP_UP_MULTI,set dialog.");
            f(context, i, resourceBriefInfo);
            return true;
        }
        if (contentType == 81) {
            LogUtil.b("MarketingResourceSetting", "TEMPLATE_BOX_TEMPLATE,set floating shaped box.");
            e(context, i, resourceBriefInfo, i2);
            return false;
        }
        if (contentType == 89) {
            e(context, i, resourceBriefInfo);
            return true;
        }
        if (contentType != 109) {
            switch (contentType) {
                case 67:
                    LogUtil.b("MarketingResourceSetting", "TEMPLATE_PROMOTION_BAR,set floatingBar.");
                    a(context, i, resourceBriefInfo, i2);
                    return false;
                case 68:
                case 69:
                    a(context, i, resourceBriefInfo);
                    return true;
                case 70:
                    b(context, i, resourceBriefInfo);
                    return true;
                default:
                    LogUtil.b("MarketingResourceSetting", "other contentType = ", Integer.valueOf(contentType));
                    Map<Integer, LinearLayout> layoutMap = this.f33515c.getLayoutMap();
                    if (layoutMap == null) {
                        LogUtil.e("MarketingResourceSetting", "layoutMap is null, abort");
                        return false;
                    }
                    a(layoutMap, i, eup.a(context, i, resourceBriefInfo, null));
                    return false;
            }
        }
        LogUtil.b("MarketingResourceSetting", "TEMPLATE_LIST_ITEMS_POP_UP,set dialog.");
        c(context, i, resourceBriefInfo);
        return true;
    }

    private boolean a(Map<Integer, LinearLayout> map, int i, List<View> list) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        if (map.get(Integer.valueOf(i)) == null) {
            LogUtil.e("MarketingResourceSetting", "layout is null. return.");
            return false;
        }
        LinearLayout linearLayout = map.get(Integer.valueOf(i));
        if (linearLayout == null) {
            LogUtil.e("MarketingResourceSetting", "viewGroup is null. return.");
            return false;
        }
        if (njy.e(list)) {
            LogUtil.e("MarketingResourceSetting", "views is empty. return.");
            return false;
        }
        for (View view : list) {
            if (view != null) {
                linearLayout.addView(view);
            }
        }
        return true;
    }

    private boolean e(int i) {
        if (!fxl.d(i)) {
            return false;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10000), "health_msg_switch_promotion");
        LogUtil.b("MarketingResourceSetting", "PopUp promotionRecommend = " + strE);
        return "0".equals(strE);
    }

    public static void d(Context context, final int i, final ResourceBriefInfo resourceBriefInfo) {
        if (context == null || resourceBriefInfo == null) {
            LogUtil.b("MarketingResourceSetting", "setPopUpTemplate context or resourceBriefInfo is null, positionId: " + i);
            return;
        }
        Gson gson = new Gson();
        String content = resourceBriefInfo.getContent().getContent();
        if (TextUtils.isEmpty(content)) {
            LogUtil.b("MarketingResourceSetting", "setPopUpTemplate popUpTemplateStr is empty, positionId: " + i);
            return;
        }
        PopUpTemplate popUpTemplate = (PopUpTemplate) gson.fromJson(content, PopUpTemplate.class);
        if (popUpTemplate == null) {
            LogUtil.b("MarketingResourceSetting", "setPopUpTemplate popUpTemplate parse failed, positionId: " + i);
            return;
        }
        final String linkValue = popUpTemplate.getLinkValue();
        final RotateDialog rotateDialog = new RotateDialog(context);
        rotateDialog.b(i);
        rotateDialog.e(resourceBriefInfo.getResourceId());
        rotateDialog.g(resourceBriefInfo.getResourceName());
        rotateDialog.d(fxl.e(resourceBriefInfo.getRecommendList(), popUpTemplate.getRcmResourceId()));
        rotateDialog.c(MarketingBiUtils.e(popUpTemplate));
        rotateDialog.d(new View.OnClickListener() { // from class: evl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                evh.a(linkValue, resourceBriefInfo, i, rotateDialog, view);
            }
        });
        String picture = popUpTemplate.getPicture();
        if (TextUtils.isEmpty(picture)) {
            return;
        }
        rotateDialog.b(picture);
        LogUtil.b("MarketingResourceSetting", "dialog.setBackground:", picture);
    }

    static /* synthetic */ void a(String str, ResourceBriefInfo resourceBriefInfo, int i, RotateDialog rotateDialog, View view) {
        if (!TextUtils.isEmpty(str)) {
            d(c(fxl.d(str, resourceBriefInfo.getCategory()), i, resourceBriefInfo));
        }
        rotateDialog.dismiss();
    }

    private void f(Context context, int i, ResourceBriefInfo resourceBriefInfo) {
        Activity activityJ = context instanceof Activity ? (Activity) context : BaseApplication.j();
        if (activityJ instanceof FragmentActivity) {
            FragmentManager supportFragmentManager = ((FragmentActivity) activityJ).getSupportFragmentManager();
            Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag("setPopUpMultiTemplate");
            if (fragmentFindFragmentByTag instanceof MarketingDialogFragment) {
                supportFragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).commitNowAllowingStateLoss();
            }
            MarketingDialogFragment marketingDialogFragment = new MarketingDialogFragment();
            marketingDialogFragment.e(i, resourceBriefInfo);
            marketingDialogFragment.showNow(supportFragmentManager, "setPopUpMultiTemplate");
        }
    }

    private void a(Context context, int i, ResourceBriefInfo resourceBriefInfo) {
        if (context == null || resourceBriefInfo == null || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent())) {
            return;
        }
        try {
            new MemberRenewalDialog(context).a(i, resourceBriefInfo, (PopUpMemberTemplate) new Gson().fromJson(resourceBriefInfo.getContent().getContent(), PopUpMemberTemplate.class));
        } catch (JsonSyntaxException unused) {
            LogUtil.b("MarketingResourceSetting", "PopUpMemeberTemplate JsonSyntaxException");
        }
    }

    private void e(Context context, int i, ResourceBriefInfo resourceBriefInfo) {
        if (context == null || resourceBriefInfo == null || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent())) {
            return;
        }
        try {
            new EquityRenewalDialog(context).b(i, resourceBriefInfo, (PopUpMemberTemplate) new Gson().fromJson(resourceBriefInfo.getContent().getContent(), PopUpMemberTemplate.class));
        } catch (JsonSyntaxException unused) {
            LogUtil.b("MarketingResourceSetting", "PopUpMemeberTemplate JsonSyntaxException");
        }
    }

    private void b(Context context, int i, ResourceBriefInfo resourceBriefInfo) {
        if (context == null || resourceBriefInfo == null || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent())) {
            LogUtil.e("MarketingResourceSetting", "setPopUpCouponTemplate return");
            return;
        }
        LogUtil.b("MarketingResourceSetting", "briefInfo.getContent().getContent():", resourceBriefInfo.getContent().getContent());
        String content = resourceBriefInfo.getContent().getContent();
        LogUtil.b("MarketingResourceSetting", "combinationTemplateStr:", content);
        try {
            PopUpCombinationTemplate popUpCombinationTemplate = (PopUpCombinationTemplate) new Gson().fromJson(content, PopUpCombinationTemplate.class);
            LogUtil.b("MarketingResourceSetting", "combinationTemplate:", popUpCombinationTemplate.toString());
            new ReceiveCouponDialog(context).d(i, resourceBriefInfo, popUpCombinationTemplate);
        } catch (JsonSyntaxException unused) {
            LogUtil.b("MarketingResourceSetting", "PopUpMemeberTemplate JsonSyntaxException");
        }
    }

    private void d(final Context context, final int i, final ResourceBriefInfo resourceBriefInfo, final int i2) {
        final FloatingBoxTemplate floatingBoxTemplate = (FloatingBoxTemplate) new Gson().fromJson(resourceBriefInfo.getContent().getContent(), FloatingBoxTemplate.class);
        if (fua.c(floatingBoxTemplate)) {
            return;
        }
        final HealthFloatingView healthFloatingViewE = e(context, i, resourceBriefInfo, floatingBoxTemplate);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        healthFloatingViewE.setlistener(new View.OnClickListener() { // from class: evh.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.b("MarketingResourceSetting", "float view image is clicked");
                String linkValue = floatingBoxTemplate.getLinkValue();
                if (TextUtils.isEmpty(linkValue)) {
                    return;
                }
                final String strC = evh.c(fxl.d(linkValue, resourceBriefInfo.getCategory()), i, resourceBriefInfo);
                if (!LoginInit.getInstance(context).isBrowseMode() || !fxk.b(strC)) {
                    evh.d(strC);
                    evh.a(i, resourceBriefInfo, jCurrentTimeMillis);
                } else {
                    LogUtil.b("MarketingResourceSetting", "floating view browse login");
                    LoginInit.getInstance(context).browsingToLogin(new IBaseResponseCallback() { // from class: evh.5.5
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i3, Object obj) {
                            if (i3 == 0) {
                                evh.d(strC);
                                evh.a(i, resourceBriefInfo, jCurrentTimeMillis);
                            }
                        }
                    }, "");
                }
            }
        });
        healthFloatingViewE.setCloseBtnlistener(new View.OnClickListener() { // from class: evh.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.b("MarketingResourceSetting", "float view close button is clicked");
                MarketingBiUtils.b(i, resourceBriefInfo, jCurrentTimeMillis);
                fxl.b(i, i2, resourceBriefInfo);
                healthFloatingViewE.g();
            }
        });
        healthFloatingViewE.d();
        b(context, i);
        b(i, resourceBriefInfo);
    }

    private void b(Context context, int i) {
        Integer num = fwx.f34657a.get(Integer.valueOf(i));
        if (num == null || !(context instanceof Activity)) {
            return;
        }
        View viewFindViewById = ((Activity) context).findViewById(num.intValue());
        if (viewFindViewById instanceof HealthFloatingView) {
            LogUtil.b("MarketingResourceSetting", "find excluded floating view, positionId: ", Integer.valueOf(i), " excluded positionId: ", num);
            ((HealthFloatingView) viewFindViewById).c();
        }
    }

    private HealthFloatingView e(Context context, int i, ResourceBriefInfo resourceBriefInfo, FloatingBoxTemplate floatingBoxTemplate) {
        LogUtil.b("MarketingResourceSetting", "floatingBoxTemplate: ", floatingBoxTemplate);
        HealthFloatingView healthFloatingView = new HealthFloatingView(context);
        healthFloatingView.setIconImage(floatingBoxTemplate.getPicture());
        healthFloatingView.setResourceId(resourceBriefInfo.getResourceId());
        healthFloatingView.setPositionId(i);
        healthFloatingView.setResourceName(resourceBriefInfo.getResourceName());
        healthFloatingView.setId(i);
        healthFloatingView.setAlgId("");
        healthFloatingView.setSmartRecommend(resourceBriefInfo.getSmartRecommend());
        return healthFloatingView;
    }

    private void a(Context context, int i, ResourceBriefInfo resourceBriefInfo, int i2) {
        HealthFloatBar healthFloatBar = new HealthFloatBar(context);
        healthFloatBar.setTypeId(i2);
        healthFloatBar.d(resourceBriefInfo, i);
        healthFloatBar.c();
    }

    private void e(Context context, int i, ResourceBriefInfo resourceBriefInfo, int i2) {
        HealthFloatingShapedBox healthFloatingShapedBox = new HealthFloatingShapedBox(context);
        healthFloatingShapedBox.setTypeId(i2);
        healthFloatingShapedBox.d(resourceBriefInfo, i);
        healthFloatingShapedBox.c();
    }

    public static void c(final int i, final int i2, final ResourceBriefInfo resourceBriefInfo) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: evi
            @Override // java.lang.Runnable
            public final void run() {
                LogUtil.b("MarketingResourceSetting", "saveMarketingEventInfo Result", Long.valueOf(MarketingEventDbMgr.b(BaseApplication.b()).a(new MarketingEventInfo.Builder().setHuId(LoginInit.getInstance(BaseApplication.b()).getHuidOrDefault()).setPositionId(i).setTypeId(i2).setResourceId(resourceBriefInfo.getResourceId()).setTriggerTime(Calendar.getInstance().getTimeInMillis()).setValue("done").setReservedField(null).build())));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str) {
        ((MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class)).router(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(int i, ResourceBriefInfo resourceBriefInfo, long j) {
        if (resourceBriefInfo == null) {
            return;
        }
        LogUtil.b("MarketingResourceSetting", "MarketingCyclesMgr set event Result", Long.valueOf(j));
        HashMap map = new HashMap();
        map.put("event", 2);
        map.put("resourceId", resourceBriefInfo.getResourceId());
        map.put("resourcePositionId", Integer.valueOf(i));
        map.put("resourceName", resourceBriefInfo.getResourceName());
        map.put("durationTime", Long.valueOf(System.currentTimeMillis() - j));
        map.put("pullOrder", 1);
        map.put("algId", "");
        map.put("smartRecommend", Boolean.valueOf(resourceBriefInfo.getSmartRecommend()));
        lmf.d().c(BaseApplication.b(), AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    public static void b(int i, ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("event", 1);
        map.put("resourceId", resourceBriefInfo.getResourceId());
        map.put("resourcePositionId", Integer.valueOf(i));
        map.put("resourceName", resourceBriefInfo.getResourceName());
        map.put("pullOrder", 1);
        map.put("algId", "");
        map.put("smartRecommend", Boolean.valueOf(resourceBriefInfo.getSmartRecommend()));
        lmf.d().c(BaseApplication.b(), AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str, int i, ResourceBriefInfo resourceBriefInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.contains("?") ? "&pullfrom=" : "?pullfrom=");
        String string = sb.toString();
        try {
            return string + i + "&resourceName=" + URLEncoder.encode(resourceBriefInfo.getResourceName(), "UTF-8") + "&resourceId=" + URLEncoder.encode(resourceBriefInfo.getResourceId(), "UTF-8") + "&pullOrder=1";
        } catch (UnsupportedEncodingException unused) {
            ReleaseLogUtil.a("MarketingResourceSetting", "setUrlPositionId, encode params error");
            return string + i + "&pullOrder=1";
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f33523b;
        private final int d;
        private final ResourceBriefInfo e;

        c(ResourceBriefInfo resourceBriefInfo, int i, int i2) {
            this.d = i;
            this.f33523b = i2;
            this.e = resourceBriefInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (evh.this.b(this.d, this.e, this.f33523b)) {
                evh.c(this.d, this.f33523b, this.e);
            } else {
                LogUtil.b("MarketingResourceSetting", "Setting Resource failed.");
            }
        }
    }
}
