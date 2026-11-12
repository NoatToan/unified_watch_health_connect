package com.huawei.health.utils;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.R;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.templates.NavigationStandardTemplate;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.scrollview.HealthBottomView;
import defpackage.lmf;
import defpackage.qqt;
import defpackage.qrs;
import health.compact.a.Services;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class NavigationHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10398b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ResourceBriefInfo f10399c;
    private String d;
    private long e;

    public NavigationHelper(Context context) {
        this.f10397a = context;
    }

    public boolean b() {
        return this.f10398b;
    }

    public void c(final HealthBottomView healthBottomView) {
        if (this.f10397a == null || healthBottomView == null) {
            LogUtil.j("NavigationHelper", "mContext or tabs is null");
            return;
        }
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            this.f10398b = false;
            marketingApi.getResourceResultInfo(6001).addOnSuccessListener(new OnSuccessListener<Map<Integer, ResourceResultInfo>>() { // from class: com.huawei.health.utils.NavigationHelper.1
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Map<Integer, ResourceResultInfo> map) {
                    ResourceBriefInfo resourceBriefInfoA = NavigationHelper.this.a(marketingApi.filterMarketingRules(map));
                    if (resourceBriefInfoA != null) {
                        NavigationHelper.this.d(resourceBriefInfoA, healthBottomView);
                    } else {
                        LogUtil.a("NavigationHelper", "resourceBriefInfo is null");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ResourceBriefInfo resourceBriefInfo, final HealthBottomView healthBottomView) {
        if (!(this.f10397a instanceof Activity)) {
            LogUtil.j("NavigationHelper", "mContext is not Activity");
            return;
        }
        if (resourceBriefInfo == null || healthBottomView == null || resourceBriefInfo.getContent() == null) {
            LogUtil.j("NavigationHelper", "context or resourceBriefInfo or tabs is null");
            return;
        }
        final Activity activity = (Activity) this.f10397a;
        this.d = resourceBriefInfo.getResourceId();
        this.f10399c = resourceBriefInfo;
        final int contentType = resourceBriefInfo.getContentType();
        String content = resourceBriefInfo.getContent().getContent();
        if (TextUtils.isEmpty(content)) {
            LogUtil.j("NavigationHelper", "content is empty");
            return;
        }
        final NavigationStandardTemplate navigationStandardTemplate = (NavigationStandardTemplate) qqt.e(content, NavigationStandardTemplate.class);
        if (navigationStandardTemplate == null) {
            LogUtil.j("NavigationHelper", "navigationTemplate is null");
            return;
        }
        final String picture = navigationStandardTemplate.getPicture();
        if (TextUtils.isEmpty(picture)) {
            LogUtil.a("NavigationHelper", "imageUrl is null");
        } else {
            healthBottomView.post(new Runnable() { // from class: iqo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37971a.b(contentType, activity, navigationStandardTemplate, healthBottomView, picture);
                }
            });
        }
    }

    public /* synthetic */ void b(int i, Activity activity, NavigationStandardTemplate navigationStandardTemplate, HealthBottomView healthBottomView, String str) {
        if (i == 11) {
            e(activity);
            b(navigationStandardTemplate, healthBottomView);
        } else if (i == 26) {
            c(activity);
            healthBottomView.b(str, 2, true);
        } else if (i == 25) {
            e(activity);
            healthBottomView.b(str, 2, false);
        } else {
            e(activity);
            healthBottomView.d(R.string.IDS_hw_show_main_home_page_discover, str, 2, false);
        }
        this.e = System.currentTimeMillis();
        e(1);
        this.f10398b = true;
    }

    private void b(NavigationStandardTemplate navigationStandardTemplate, HealthBottomView healthBottomView) {
        String picture = navigationStandardTemplate.getPicture();
        String menu = navigationStandardTemplate.getMenu();
        if (TextUtils.isEmpty(menu)) {
            healthBottomView.b(picture, 2, false);
        } else {
            healthBottomView.b((CharSequence) menu, picture, 2, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResourceBriefInfo a(Map<Integer, ResourceResultInfo> map) {
        if (map == null) {
            LogUtil.a("NavigationHelper", "resourceResultInfo is null");
            return null;
        }
        ResourceResultInfo resourceResultInfo = map.get(6001);
        if (resourceResultInfo == null) {
            LogUtil.a("NavigationHelper", "resultInfo is null");
            return null;
        }
        List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
        if (resources == null || resources.isEmpty()) {
            return null;
        }
        Collections.sort(resources, new Comparator<ResourceBriefInfo>() { // from class: com.huawei.health.utils.NavigationHelper.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compare(ResourceBriefInfo resourceBriefInfo, ResourceBriefInfo resourceBriefInfo2) {
                return resourceBriefInfo2.getPriority() - resourceBriefInfo.getPriority();
            }
        });
        return resources.get(0);
    }

    public void e(int i) {
        if (this.f10397a == null || TextUtils.isEmpty(this.d)) {
            LogUtil.j("NavigationHelper", "mContext or mResourceId is null");
            return;
        }
        HashMap map = new HashMap();
        map.put("event", Integer.valueOf(i));
        map.put("resourceId", this.d);
        map.put("resourcePositionId", 6001);
        ResourceBriefInfo resourceBriefInfo = this.f10399c;
        if (resourceBriefInfo != null) {
            map.put("resourceName", resourceBriefInfo.getResourceName());
            map.put("smartRecommend", Boolean.valueOf(this.f10399c.getSmartRecommend()));
            map.put("algId", "");
        }
        map.put("pullOrder", 1);
        if (i == 2) {
            map.put("durationTime", Long.valueOf(System.currentTimeMillis() - this.e));
            this.e = System.currentTimeMillis();
        }
        lmf.d().c(this.f10397a, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    public void c(Activity activity) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            LogUtil.j("NavigationHelper", "activity is null/isFinishing/isDestroyed");
            return;
        }
        LinearLayout linearLayout = (LinearLayout) activity.findViewById(R.id.hw_main_tabs_layout);
        View viewFindViewById = activity.findViewById(R.id.extend_pic_padding);
        if (viewFindViewById == null) {
            LogUtil.j("NavigationHelper", "enableTabsExtendMode paddingView is null");
            return;
        }
        viewFindViewById.setVisibility(0);
        if (linearLayout.getLayoutParams() instanceof ViewGroup.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.topMargin = -qrs.d((Context) activity, 4.0f);
            linearLayout.setLayoutParams(layoutParams);
        }
    }

    public void e(Activity activity) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            LogUtil.j("NavigationHelper", "activity is null/isFinishing/isDestroyed");
            return;
        }
        LinearLayout linearLayout = (LinearLayout) activity.findViewById(R.id.hw_main_tabs_layout);
        View viewFindViewById = activity.findViewById(R.id.extend_pic_padding);
        if (viewFindViewById == null) {
            LogUtil.j("NavigationHelper", "disableTabsExtendMode paddingView is null");
            return;
        }
        viewFindViewById.setVisibility(8);
        if (linearLayout.getLayoutParams() instanceof ViewGroup.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.topMargin = 0;
            linearLayout.setLayoutParams(layoutParams);
        }
    }
}
