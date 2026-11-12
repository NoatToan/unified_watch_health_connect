package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceContentBase;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.fitness.activity.coresleep.model.SleepCourseBean;
import com.huawei.ui.main.stories.fitness.activity.coresleep.model.SleepSeriesCourseBean;
import defpackage.lls;
import defpackage.njy;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class SleepSeriesCourseTopic {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26858c;
    private String d;
    private final List<SleepSeriesCourseBean> e = new ArrayList();

    public interface RequestListener {
        void onRequestDone(SleepSeriesCourseTopic sleepSeriesCourseTopic);
    }

    public String e() {
        return this.d;
    }

    public String b() {
        return this.f26857b;
    }

    public List<SleepSeriesCourseBean> d() {
        return this.e;
    }

    public SleepSeriesCourseTopic(int i) {
        this.f26858c = i;
    }

    public void b(final RequestListener requestListener) {
        LogUtil.a("SleepSeriesCourseTopic", "requestData");
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            ReleaseLogUtil.a("SleepSeriesCourseTopic", "marketingApi is null");
        } else {
            marketingApi.getResourceResultInfo(this.f26858c).addOnSuccessListener(new OnSuccessListener() { // from class: ubg
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f49885c.b(marketingApi, requestListener, (Map) obj);
                }
            });
        }
    }

    public /* synthetic */ void b(MarketingApi marketingApi, RequestListener requestListener, Map map) {
        if (map == null) {
            LogUtil.e("SleepSeriesCourseTopic", "no section map for ", Integer.valueOf(this.f26858c));
            return;
        }
        Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules((Map<Integer, ResourceResultInfo>) map);
        if (mapFilterMarketingRules == null) {
            LogUtil.e("SleepSeriesCourseTopic", "no section map for ", Integer.valueOf(this.f26858c), ", after ruling");
            return;
        }
        ResourceResultInfo resourceResultInfo = mapFilterMarketingRules.get(Integer.valueOf(this.f26858c));
        if (resourceResultInfo == null) {
            LogUtil.e("SleepSeriesCourseTopic", "no resourceResultInfo for ", Integer.valueOf(this.f26858c));
            return;
        }
        List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
        if (njy.e(resources)) {
            LogUtil.e("SleepSeriesCourseTopic", "no briefInfoList for ", Integer.valueOf(this.f26858c));
        } else {
            b(resources, requestListener);
        }
    }

    private void b(List<ResourceBriefInfo> list, RequestListener requestListener) {
        LogUtil.a("SleepSeriesCourseTopic", "parseBriefInfo");
        LogUtil.a("SleepSeriesCourseTopic", "briefInfoList.size() = ", Integer.valueOf(list.size()), " briefInfoList = ", list);
        ResourceContentBase content = list.get(0).getContent();
        if (content == null) {
            LogUtil.e("SleepSeriesCourseTopic", "requestData failed cause contentBase is null!");
            return;
        }
        String content2 = content.getContent();
        if (TextUtils.isEmpty(content2)) {
            LogUtil.e("SleepSeriesCourseTopic", "requestData failed cause content is empty!");
            return;
        }
        LogUtil.a("SleepSeriesCourseTopic", "content = ", content2);
        SleepCourseBean sleepCourseBean = (SleepCourseBean) lls.b(content2, new TypeToken<SleepCourseBean>() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepSeriesCourseTopic.1
        });
        if (sleepCourseBean == null) {
            LogUtil.e("SleepSeriesCourseTopic", "sleepBean is null");
            return;
        }
        LogUtil.a("SleepSeriesCourseTopic", "sleepBean = ", sleepCourseBean);
        LogUtil.a("SleepSeriesCourseTopic", "handleData");
        List<SleepSeriesCourseBean> gridContents = sleepCourseBean.getGridContents();
        this.e.clear();
        if (njy.b(gridContents)) {
            this.e.addAll(gridContents);
        }
        this.d = sleepCourseBean.getName();
        this.f26857b = sleepCourseBean.getSubTitle();
        requestListener.onRequestDone(this);
    }
}
