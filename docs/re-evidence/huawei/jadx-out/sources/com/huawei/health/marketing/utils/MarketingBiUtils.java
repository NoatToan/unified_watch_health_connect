package com.huawei.health.marketing.utils;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.PopUpTemplate;
import com.huawei.health.marketing.views.ColumnLinearLayout;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import defpackage.idy;
import defpackage.lmf;
import defpackage.loq;
import defpackage.njy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class MarketingBiUtils {
    public static void e(int i, ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null) {
            LogUtil.a("MarketingBiUtils", "resourceBriefInfo is null. return.");
            return;
        }
        LogUtil.a("MarketingBiUtils", "set view event Result. PositionId: ", Integer.valueOf(i), "; resourceName: ", resourceBriefInfo.getResourceName());
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

    public static void c(int i, ResourceBriefInfo resourceBriefInfo, long j) {
        if (resourceBriefInfo == null) {
            LogUtil.a("MarketingBiUtils", "resourceBriefInfo is null. return.");
            return;
        }
        LogUtil.a("MarketingBiUtils", "set click event Result. PositionId: ", Integer.valueOf(i), "; resourceName: ", resourceBriefInfo.getResourceName());
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

    public static void a(int i, int i2, ResourceBriefInfo resourceBriefInfo, Map<String, Object> map) {
        if (resourceBriefInfo == null) {
            LogUtil.a("MarketingBiUtils", "resourceBriefInfo is null. return.");
            return;
        }
        LogUtil.a("MarketingBiUtils", "set view event Result. PositionId: ", Integer.valueOf(i2), "; resourceName: ", resourceBriefInfo.getResourceName());
        HashMap map2 = new HashMap();
        map2.put("event", Integer.valueOf(i));
        map2.put("resourceId", resourceBriefInfo.getResourceId());
        map2.put("resourcePositionId", Integer.valueOf(i2));
        map2.put("resourceName", resourceBriefInfo.getResourceName());
        map2.put("pullOrder", 1);
        map2.put("algId", "");
        map2.put("smartRecommend", Boolean.valueOf(resourceBriefInfo.getSmartRecommend()));
        if (map != null && map.size() > 0) {
            map2.putAll(map);
        }
        c(map2, resourceBriefInfo);
    }

    public static boolean c(View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        int height = view.getHeight();
        int width = view.getWidth();
        Rect rect = new Rect();
        return view.getLocalVisibleRect(rect) && ColumnLinearLayout.a(rect, height, width);
    }

    public static void b(int i, ResourceBriefInfo resourceBriefInfo, long j) {
        if (resourceBriefInfo == null) {
            LogUtil.a("MarketingBiUtils", "resourceBriefInfo is null. return.");
            return;
        }
        LogUtil.a("MarketingBiUtils", "set close event Result. PositionId: ", Integer.valueOf(i), "; resourceName: ", resourceBriefInfo.getResourceName());
        HashMap map = new HashMap();
        map.put("event", 4);
        map.put("resourceId", resourceBriefInfo.getResourceId());
        map.put("resourcePositionId", Integer.valueOf(i));
        map.put("resourceName", resourceBriefInfo.getResourceName());
        map.put("durationTime", Long.valueOf(System.currentTimeMillis() - j));
        map.put("pullOrder", 1);
        map.put("algId", "");
        map.put("smartRecommend", Boolean.valueOf(resourceBriefInfo.getSmartRecommend()));
        c(map, resourceBriefInfo);
    }

    public static void c(int i, String str, int i2) {
        LogUtil.a("MarketingBiUtils", "setFitnessCourseBi sportType:", Integer.valueOf(i), ", entrance:", str, ", position:", Integer.valueOf(i2));
        HashMap map = new HashMap(2);
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(i));
        map.put("entrance", str);
        map.put("position", Integer.valueOf(i2));
        idy.b("1130015", map);
    }

    public static String c(ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null) {
            LogUtil.j("MarketingBiUtils", "ab_info resourceBriefInfo == null");
            return "noAbTest";
        }
        List<String> strategyIds = resourceBriefInfo.getStrategyIds();
        List<String> bucketIds = resourceBriefInfo.getBucketIds();
        if (njy.e(strategyIds) && njy.e(bucketIds)) {
            return "noAbTest";
        }
        LogUtil.a("MarketingBiUtils", "strategyIds: ", strategyIds, ", bucketIds: ", bucketIds);
        return HiJsonUtil.d(new loq.a(strategyIds, bucketIds));
    }

    public static void c(Map<String, Object> map, ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null) {
            LogUtil.j("MarketingBiUtils", "resourceBriefInfo is null in setAbInfoBiEvent. return.");
        } else {
            lmf.d().e(BaseApplication.b().getApplicationContext(), AnalyticsValue.MARKETING_RESOURCE.value(), map, c(resourceBriefInfo), 0);
        }
    }

    public static void d(Map<String, Object> map, Map<String, String> map2) {
        if (map2 == null || map2.size() <= 0) {
            LogUtil.j("MarketingBiUtils", "addMarketingBiParams marketingBiParam is empty");
            return;
        }
        for (String str : map2.keySet()) {
            if (!TextUtils.isEmpty(map2.get(str))) {
                map.put(str, map2.get(str));
            }
        }
    }

    public static boolean e(PopUpTemplate popUpTemplate) {
        if (popUpTemplate == null) {
            return false;
        }
        return popUpTemplate.isIntelligentFlag();
    }

    public static class FitnessOnScrollListener extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f8188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f8189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8190c;
        private int d;

        public FitnessOnScrollListener(int i, String str, int i2) {
            this.d = i;
            this.f8188a = str;
            this.f8190c = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int i2;
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f8189b && (i2 = this.d) == 22) {
                MarketingBiUtils.c(i2, this.f8188a, this.f8190c);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i > 0) {
                this.f8189b = true;
            } else {
                this.f8189b = false;
            }
            super.onScrolled(recyclerView, i, i2);
        }
    }
}
