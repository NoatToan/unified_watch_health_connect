package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceContentBase;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.scrollview.ScrollViewListener;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepPopularCoursesActivity;
import com.huawei.ui.main.stories.fitness.activity.coresleep.model.SingleTab;
import com.huawei.ui.main.stories.fitness.activity.coresleep.model.SleepCourseBean;
import com.huawei.ui.main.stories.fitness.activity.coresleep.model.SleepSeriesCourseBean;
import defpackage.lls;
import defpackage.njy;
import defpackage.out;
import defpackage.qpn;
import defpackage.qqs;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class SleepPopularCoursesActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f26827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomTitleBar f26828c;
    private HealthScrollView d;
    private HealthTextView e;
    private ViewGroup f;
    private int h;
    private qpn j;
    private HealthTextView k;
    private HealthSubTabWidget n;
    private LinearLayout o;
    private boolean i = true;
    private final ScrollViewListener g = new ScrollViewListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepPopularCoursesActivity.4
        @Override // com.huawei.ui.commonui.scrollview.ScrollViewListener
        public void onScrollChanged(HealthScrollView healthScrollView, int i, int i2, int i3, int i4) {
            if (((int) (((double) SleepPopularCoursesActivity.this.f26828c.getMeasuredHeight()) * 1.0E-4d)) > i2) {
                SleepPopularCoursesActivity.this.o.setVisibility(0);
                SleepPopularCoursesActivity.this.f26828c.setTitleText("");
            } else {
                SleepPopularCoursesActivity.this.o.setVisibility(8);
                SleepPopularCoursesActivity.this.f26828c.setTitleText(SleepPopularCoursesActivity.this.f26826a);
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("SleepPopularCoursesActivity", "onCreate");
        super.onCreate(bundle);
        this.f26827b = this;
        cancelAdaptRingRegion();
        setContentView(R.layout.activity_sleep_popular_courses);
        Intent intent = getIntent();
        if (intent == null) {
            ReleaseLogUtil.a("SleepPopularCoursesActivity", "intent is null");
            return;
        }
        this.h = intent.getIntExtra(CommonUtil.PAGE_TYPE, 0);
        d();
        e();
        b();
        if (c()) {
            a();
        }
    }

    private void d() {
        LogUtil.a("SleepPopularCoursesActivity", "initView");
        ImageView imageView = (ImageView) out.d(this, R.id.sleep_course_background_image);
        if (qqs.e(this.f26827b)) {
            imageView.setImageResource(R.drawable.ic_popular_courses_dark_background);
        } else {
            imageView.setImageResource(R.drawable.ic_popular_courses_background);
        }
        this.f = (ViewGroup) findViewById(com.huawei.health.servicesui.R.id.no_network_layout);
        CustomTitleBar customTitleBar = (CustomTitleBar) out.d(this, R.id.sleep_popular_courses_title_bar);
        this.f26828c = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(ContextCompat.getColor(this, R.color.common_transparent));
        this.f26828c.setLeftButtonTextColor(ContextCompat.getDrawable(this.f26827b, com.huawei.health.servicesui.R.drawable.course_array_left), getColor(com.huawei.health.servicesui.R.color.emui_toolbar_icon_dark), qre.f(R.string.accessibility_go_back));
        this.o = (LinearLayout) out.d(this, R.id.popular_courses_top_layout);
        this.e = (HealthTextView) out.d(this, R.id.popular_courses_text);
        this.k = (HealthTextView) out.d(this, R.id.popular_courses_sub_text);
        HealthScrollView healthScrollView = (HealthScrollView) out.d(this, R.id.series_course_scroll_view);
        this.d = healthScrollView;
        healthScrollView.setScrollViewListener(this.g);
        this.n = (HealthSubTabWidget) findViewById(R.id.series_course_sub_tab);
        HealthViewPager healthViewPager = (HealthViewPager) findViewById(R.id.series_course_sub_tab_vp);
        healthViewPager.setIsAutoHeight(true);
        this.j = new qpn(this, healthViewPager, this.n);
        healthViewPager.setIsAutoHeight(true);
        healthViewPager.addOnPageChangeListener(new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepPopularCoursesActivity.2
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                LogUtil.a("SleepPopularCoursesActivity", "page is selected: ", Integer.valueOf(i));
            }
        });
    }

    private void e() {
        LogUtil.a("SleepPopularCoursesActivity", "initListener");
        this.f26828c.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: uao
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49866a.c(view);
            }
        });
    }

    public /* synthetic */ void c(View view) {
        if (qrs.c(500)) {
            LogUtil.e("SleepPopularCoursesActivity", "click title bar left button too fast");
        } else {
            finish();
        }
    }

    private void a() {
        final int i;
        LogUtil.a("SleepPopularCoursesActivity", "requestData");
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            ReleaseLogUtil.a("SleepPopularCoursesActivity", "marketingApi is null");
            return;
        }
        int i2 = this.h;
        if (i2 == 1) {
            i = 4055;
        } else if (i2 == 3) {
            i = 4057;
        } else {
            if (i2 != 30) {
                LogUtil.e("SleepPopularCoursesActivity", "mPageType is invalid");
                return;
            }
            i = 4059;
        }
        marketingApi.getResourceResultInfo(i).addOnSuccessListener(new OnSuccessListener() { // from class: uak
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f49862a.a(i, marketingApi, (Map) obj);
            }
        });
    }

    public /* synthetic */ void a(int i, MarketingApi marketingApi, Map map) {
        if (map == null) {
            LogUtil.e("SleepPopularCoursesActivity", "no section map for ", Integer.valueOf(i));
            return;
        }
        Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules((Map<Integer, ResourceResultInfo>) map);
        if (mapFilterMarketingRules == null) {
            LogUtil.e("SleepPopularCoursesActivity", "no section map for ", Integer.valueOf(i), ", after ruling");
            return;
        }
        ResourceResultInfo resourceResultInfo = mapFilterMarketingRules.get(Integer.valueOf(i));
        if (resourceResultInfo == null) {
            LogUtil.e("SleepPopularCoursesActivity", "no resourceResultInfo for ", Integer.valueOf(i));
            return;
        }
        List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
        if (njy.e(resources)) {
            LogUtil.e("SleepPopularCoursesActivity", "no briefInfoList for ", Integer.valueOf(i));
        } else {
            e(resources);
        }
    }

    private void e(List<ResourceBriefInfo> list) {
        LogUtil.a("SleepPopularCoursesActivity", "parseBriefInfo");
        LogUtil.a("SleepPopularCoursesActivity", "briefInfoList.size() = ", Integer.valueOf(list.size()), " briefInfoList = ", list);
        ResourceContentBase content = list.get(0).getContent();
        if (content == null) {
            LogUtil.e("SleepPopularCoursesActivity", "requestData failed cause contentBase is null!");
            return;
        }
        String content2 = content.getContent();
        if (TextUtils.isEmpty(content2)) {
            LogUtil.e("SleepPopularCoursesActivity", "requestData failed cause content is empty!");
            return;
        }
        LogUtil.a("SleepPopularCoursesActivity", "content = ", content2);
        SleepCourseBean sleepCourseBean = (SleepCourseBean) lls.b(content2, new TypeToken<SleepCourseBean>() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepPopularCoursesActivity.3
        });
        if (sleepCourseBean == null) {
            LogUtil.e("SleepPopularCoursesActivity", "sleepBean is null");
        } else {
            LogUtil.a("SleepPopularCoursesActivity", "sleepBean = ", sleepCourseBean);
            a(sleepCourseBean);
        }
    }

    private void a(SleepCourseBean sleepCourseBean) {
        LogUtil.a("SleepPopularCoursesActivity", "handleData");
        List<SleepSeriesCourseBean> gridContents = sleepCourseBean.getGridContents();
        List<SingleTab> tabs = sleepCourseBean.getTabs();
        if (njy.e(gridContents)) {
            LogUtil.e("SleepPopularCoursesActivity", "seriesBeans is null");
            return;
        }
        if (njy.e(tabs)) {
            LogUtil.a("SleepPopularCoursesActivity", "singleTabs is null");
            this.i = false;
        }
        this.f26826a = sleepCourseBean.getName();
        String subTitle = sleepCourseBean.getSubTitle();
        this.e.setText(this.f26826a);
        this.k.setText(subTitle);
        if (!this.i) {
            b(gridContents);
            return;
        }
        List<List<SleepSeriesCourseBean>> listE = e(gridContents, tabs);
        int size = tabs.size();
        for (int i = 0; i < size; i++) {
            List<SleepSeriesCourseBean> list = listE.get(i);
            LogUtil.a("SleepPopularCoursesActivity", "seriesCourseBeans: ", list, "+ i ", Integer.valueOf(i));
            b(list);
        }
    }

    private void b(final List<SleepSeriesCourseBean> list) {
        LogUtil.a("SleepPopularCoursesActivity", "initFragment");
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: ual
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d(list);
                }
            });
        } else if (list == null) {
            LogUtil.e("SleepPopularCoursesActivity", "data is null");
        } else {
            c(list);
        }
    }

    public /* synthetic */ void d(List list) {
        b((List<SleepSeriesCourseBean>) list);
    }

    private void c(List<SleepSeriesCourseBean> list) {
        LogUtil.a("SleepPopularCoursesActivity", "initSubTab");
        SeriesCourseTabFragment seriesCourseTabFragmentE = SeriesCourseTabFragment.e(list);
        if (this.i) {
            this.j.b(this.n.b(list.get(0).getTabName()), seriesCourseTabFragmentE, false);
            this.n.setVisibility(0);
        } else {
            this.j.b(this.n.b(""), seriesCourseTabFragmentE, false);
            this.n.setVisibility(8);
        }
    }

    private List<List<SleepSeriesCourseBean>> e(List<SleepSeriesCourseBean> list, List<SingleTab> list2) {
        LogUtil.a("SleepPopularCoursesActivity", "parseTabList");
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list2.get(i));
        }
        Collections.sort(arrayList, new Comparator() { // from class: uar
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SleepPopularCoursesActivity.e((SingleTab) obj, (SingleTab) obj2);
            }
        });
        int size2 = list.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String tabName = ((SingleTab) arrayList.get(i2)).getTabName();
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < size2; i3++) {
                if (list.get(i3).getTabName().equals(tabName)) {
                    arrayList3.add(list.get(i3));
                }
            }
            arrayList2.add(arrayList3);
        }
        LogUtil.a("SleepPopularCoursesActivity", "packageList: ", arrayList2);
        return arrayList2;
    }

    public static /* synthetic */ int e(SingleTab singleTab, SingleTab singleTab2) {
        return singleTab2.getTabPriority() - singleTab.getTabPriority();
    }

    private void b() {
        LogUtil.a("SleepPopularCoursesActivity", "initNetWorkLayout");
        this.f.setOnClickListener(new View.OnClickListener() { // from class: uan
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(view);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        h();
        if (c()) {
            a();
        }
    }

    private boolean c() {
        LogUtil.a("SleepPopularCoursesActivity", "checkNetWorkConnected");
        if (!health.compact.a.CommonUtil.ab(this.f26827b)) {
            a(1);
            return false;
        }
        h();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LogUtil.a("SleepPopularCoursesActivity", "showLoadingLayout");
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: uas
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49869c.h();
                }
            });
        } else {
            this.f.setVisibility(8);
            this.d.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void a(final int i) {
        LogUtil.a("SleepPopularCoursesActivity", "showNetWorkLayout");
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: uam
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49865a.a(i);
                }
            });
            return;
        }
        this.f.setVisibility(0);
        this.d.setVisibility(8);
        HealthTextView healthTextView = (HealthTextView) this.f.findViewById(R.id.tips_no_net_work);
        if (i == 1) {
            qsp.e((TextView) healthTextView, R.string.IDS_hwh_home_group_network_disconnection);
        } else {
            if (i != 2) {
                return;
            }
            qsp.e((TextView) healthTextView, R.string.IDS_heart_rate_measuring_status_data_fail);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
