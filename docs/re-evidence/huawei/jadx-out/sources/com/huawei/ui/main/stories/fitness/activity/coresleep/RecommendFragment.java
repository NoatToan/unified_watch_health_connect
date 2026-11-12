package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.marketing.datatype.MultiGridsTemplate;
import com.huawei.health.marketing.datatype.RcmItem;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.adapter.SleepRecommendAdapter;
import defpackage.dkf;
import defpackage.qrs;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class RecommendFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f26701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SleepRecommendAdapter f26702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MultiGridsTemplate f26703c;
    private Context d;
    private View e;
    private List<RcmItem> f;
    private int g;
    private HealthRecycleView h;
    private LinearLayout i;
    private HealthSubHeader j;

    public static RecommendFragment d(ResourceBriefInfo resourceBriefInfo, String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("topicId", str);
        bundle.putInt("positionId", i);
        if (resourceBriefInfo != null) {
            bundle.putInt("contentType", resourceBriefInfo.getContentType());
        }
        RecommendFragment recommendFragment = new RecommendFragment();
        recommendFragment.setArguments(bundle);
        return recommendFragment;
    }

    public void c(MultiGridsTemplate multiGridsTemplate, List<RcmItem> list) {
        this.f26703c = multiGridsTemplate;
        this.f = list;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f26701a = arguments.getInt("contentType");
            this.g = arguments.getInt("positionId");
        }
        this.d = getContext();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.e == null) {
            this.e = layoutInflater.inflate(R.layout.series_course_recommend_fragment, viewGroup, false);
            b();
        }
        c();
        return this.e;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LogUtil.a("RecommendFragment", "onConfigurationChanged");
    }

    private void b() {
        HealthSubHeader healthSubHeader = (HealthSubHeader) this.e.findViewById(R.id.sub_header);
        this.j = healthSubHeader;
        b(healthSubHeader);
        this.j.setMoreTextVisibility(4);
        this.j.setRightArrayVisibility(0);
        this.j.setSubHeaderBackgroundColor(this.d.getResources().getColor(com.huawei.health.servicesui.R.color.common_transparent));
        LinearLayout linearLayout = (LinearLayout) this.e.findViewById(R.id.root_view_layout);
        this.i = linearLayout;
        linearLayout.post(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.RecommendFragment.4
            @Override // java.lang.Runnable
            public void run() {
                RecommendFragment.this.i.setMinimumWidth(qrs.q());
            }
        });
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.e.findViewById(R.id.recommend_recycle_view);
        this.h = healthRecycleView;
        dkf.d(healthRecycleView);
        this.h.setLayoutManager(new LinearLayoutManager(this.d, 0, false));
        if (this.f26702b == null) {
            this.f26702b = new SleepRecommendAdapter(this.d);
        }
        this.h.setAdapter(this.f26702b);
    }

    private void b(HealthSubHeader healthSubHeader) {
        ViewGroup.LayoutParams layoutParams = healthSubHeader.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginEnd(((Integer) BaseActivity.getSafeRegionWidth().second).intValue());
            healthSubHeader.setLayoutParams(layoutParams2);
        }
    }

    public void c() {
        MultiGridsTemplate multiGridsTemplate = this.f26703c;
        if (multiGridsTemplate == null) {
            LogUtil.e("RecommendFragment", "updateData mData is null");
            return;
        }
        String name = multiGridsTemplate.getName();
        if (this.f26703c.getNameVisibility().booleanValue() && !TextUtils.isEmpty(name)) {
            this.j.setVisibility(0);
            this.j.setHeadTitleText(name);
        } else {
            this.j.setVisibility(4);
        }
        final String linkValue = this.f26703c.getLinkValue();
        if (TextUtils.isEmpty(linkValue)) {
            this.j.setRightArrayVisibility(4);
        } else {
            this.j.setRightArrayVisibility(0);
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.RecommendFragment.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    RecommendFragment.this.d(linkValue);
                }
            });
        }
        SleepRecommendAdapter sleepRecommendAdapter = this.f26702b;
        if (sleepRecommendAdapter != null) {
            sleepRecommendAdapter.c(this.f26701a, this.f26703c, this.g, this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        MarketRouterApi marketRouterApi;
        LogUtil.a("RecommendFragment", "onClick");
        if (TextUtils.isEmpty(str) || qrs.r() || (marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class)) == null) {
            return;
        }
        marketRouterApi.router(str);
    }
}
