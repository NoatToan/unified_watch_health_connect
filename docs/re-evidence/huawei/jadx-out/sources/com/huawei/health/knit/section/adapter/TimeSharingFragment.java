package com.huawei.health.knit.section.adapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.knit.section.view.SectionPieChartBasicAdapter;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.chart.HealthRingChart;
import com.huawei.ui.commonui.chart.HealthRingChartAdapter;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.qjm;
import defpackage.qjp;
import defpackage.qsp;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class TimeSharingFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<SectionPieChartBasicAdapter.b> f7453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SectionPieChartBasicAdapter f7454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthCardView f7455c;
    private HealthRecycleView d;
    private String e;
    private View f;
    private HealthTextView g;
    private HealthRingChartAdapter h;
    private List<qjp> i;
    private HealthRingChart j;
    private HealthViewPager m;

    public static TimeSharingFragment b() {
        return new TimeSharingFragment();
    }

    public void c(List<qjp> list, String str, List<SectionPieChartBasicAdapter.b> list2) {
        this.i = list;
        this.e = str;
        this.f7453a = list2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a("TimeSharingFragment", "onCreateView");
        View viewInflate = layoutInflater.inflate(R.layout.time_sharing_fragment_layout, viewGroup, false);
        this.f = viewInflate;
        this.d = (HealthRecycleView) viewInflate.findViewById(R.id.time_sharing_basic_recycler_view);
        this.f7455c = (HealthCardView) this.f.findViewById(R.id.time_sharing_basic_recycler_view_cardview);
        this.g = (HealthTextView) this.f.findViewById(R.id.time_sharing_middle_title);
        this.j = (HealthRingChart) this.f.findViewById(R.id.time_sharing_piechart);
        e();
        this.f7455c.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.knit.section.adapter.TimeSharingFragment.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                LogUtil.a("TimeSharingFragment", "onGlobalLayout");
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) TimeSharingFragment.this.m.getLayoutParams();
                layoutParams.height = TimeSharingFragment.this.j.getMeasuredHeight() + TimeSharingFragment.this.d.getMeasuredHeight();
                TimeSharingFragment.this.m.setLayoutParams(layoutParams);
                TimeSharingFragment.this.f7455c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        return this.f;
    }

    public void d(HealthViewPager healthViewPager) {
        this.m = healthViewPager;
    }

    public void e() {
        LogUtil.a("TimeSharingFragment", "initView");
        if (this.i != null) {
            HealthRingChartAdapter healthRingChartAdapter = new HealthRingChartAdapter(getContext(), new qjm(false, true));
            this.h = healthRingChartAdapter;
            healthRingChartAdapter.c(new HealthRingChartAdapter.DataFormatter() { // from class: fqh
                @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
                public final String format(qjp qjpVar) {
                    return UnitUtil.e(qjpVar.b() * 100.0f, 2, 1);
                }
            });
            this.j.setAdapter(this.h);
            this.h.e(this.i);
        }
        qsp.b(this.g, this.e);
        this.d.setLayoutManager(new LinearLayoutManager(getContext()));
        SectionPieChartBasicAdapter sectionPieChartBasicAdapter = new SectionPieChartBasicAdapter(getContext());
        this.f7454b = sectionPieChartBasicAdapter;
        this.d.setAdapter(sectionPieChartBasicAdapter);
        List<SectionPieChartBasicAdapter.b> list = this.f7453a;
        if (list != null) {
            this.f7454b.c(list);
        }
    }
}
