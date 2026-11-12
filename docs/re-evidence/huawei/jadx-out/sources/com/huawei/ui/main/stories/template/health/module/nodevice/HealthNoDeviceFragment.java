package com.huawei.ui.main.stories.template.health.module.nodevice;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.template.ResourceParseHelper;
import com.huawei.ui.main.stories.template.health.HealthMvpFragment;
import com.huawei.ui.main.stories.template.health.config.HealthNoDeviceConfig;
import com.huawei.ui.main.stories.template.health.module.HealthDataDetailActivity;
import com.huawei.ui.main.stories.template.health.module.nodevice.bean.NoDataPageInfoBean;
import com.huawei.ui.main.stories.template.health.view.NoDataResolutionView;
import com.huawei.ui.main.stories.template.health.view.NoDataViewContainer;
import defpackage.dlo;
import defpackage.qqf;
import defpackage.wqn;
import health.compact.a.CommonUtil;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class HealthNoDeviceFragment extends HealthMvpFragment<HealthNoDeviceContract.Presenter> implements HealthNoDeviceContract.View, ResourceParseHelper.ConfigInfoCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f29022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f29023c;
    private NoDataViewContainer d;
    private Activity e;
    private ImageView f;
    private ConstraintLayout g;
    private boolean h;
    private HealthNoDeviceConfig i;
    private NoDataResolutionView j;
    private NestedScrollView k;
    private String l;
    private HealthTextView m;
    private ImageView n;
    private int o;
    private CustomTitleBar q;
    private int s;

    @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.ConfigInfoCallback
    public void getTitleName(String str) {
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment
    public void initData() {
    }

    public static HealthNoDeviceFragment a(HealthNoDeviceConfig healthNoDeviceConfig, NoDataPageInfoBean noDataPageInfoBean) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_config", healthNoDeviceConfig);
        bundle.putParcelable("extra_page_info", noDataPageInfoBean);
        HealthNoDeviceFragment healthNoDeviceFragment = new HealthNoDeviceFragment();
        healthNoDeviceFragment.setArguments(bundle);
        return healthNoDeviceFragment;
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment
    public View getContentView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_health_no_device, viewGroup, false);
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment
    public void initViews(View view) {
        this.n = (ImageView) view.findViewById(R.id.no_data_fragment_head_img);
        this.j = (NoDataResolutionView) view.findViewById(R.id.health_detail_resolution_view);
        this.d = (NoDataViewContainer) view.findViewById(R.id.no_data_fragment_view_container);
        this.f29023c = (LinearLayout) view.findViewById(R.id.common_bonded_product_no_data_layout);
        this.f = (ImageView) view.findViewById(R.id.has_device_no_data_img);
        this.f29022b = (TextView) view.findViewById(R.id.has_device_no_data_desc);
        Bundle arguments = getArguments();
        if (arguments != null) {
            NoDataPageInfoBean noDataPageInfoBean = (NoDataPageInfoBean) arguments.getParcelable("extra_page_info");
            if (noDataPageInfoBean != null) {
                this.o = noDataPageInfoBean.getPageType();
                this.l = noDataPageInfoBean.getServiceId();
                this.h = noDataPageInfoBean.isHasDevice();
                a(noDataPageInfoBean);
            }
            HealthNoDeviceConfig healthNoDeviceConfig = (HealthNoDeviceConfig) arguments.getParcelable("extra_config");
            this.i = healthNoDeviceConfig;
            this.d.setConfigInfo(healthNoDeviceConfig, this.h);
        }
        if (this.h) {
            this.f29023c.setVisibility(0);
            this.j.setVisibility(8);
            this.n.setVisibility(8);
        }
        this.k = (NestedScrollView) view.findViewById(R.id.health_detail_no_data_scrollview);
        e();
        this.m = (HealthTextView) view.findViewById(R.id.tips_net_work_down);
        this.g = (ConstraintLayout) view.findViewById(R.id.net_work_layout);
        this.m.setOnClickListener(new View.OnClickListener() { // from class: wqc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f52344c.c(view2);
            }
        });
        ResourceParseHelper.c(this);
        this.e = getActivity();
        b();
        getPresenter().requestActivityInfo(this.o);
        this.d.setMarketingResource(getActivity(), this.l);
    }

    public /* synthetic */ void c(View view) {
        this.m.setClickable(false);
        FragmentActivity activity = getActivity();
        if (activity instanceof HealthDataDetailActivity) {
            ((HealthDataDetailActivity) activity).b();
        }
    }

    private void e() {
        int i;
        String str = this.l;
        str.hashCode();
        if (str.equals("BloodSugarCardConstructor")) {
            i = 3038;
        } else {
            i = !str.equals("BodyTemperatureCardConstructor") ? 0 : 3040;
        }
        ScrollUtil.a(this.k, getActivity().getWindow().getDecorView(), i);
    }

    private void a(NoDataPageInfoBean noDataPageInfoBean) {
        ResourceParseHelper.e(noDataPageInfoBean.getDesc(), this.l, this);
        ResourceParseHelper.b(noDataPageInfoBean.getImageName(), this.l, this);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment
    public void initViewTahiti() {
        super.initViewTahiti();
        NoDataViewContainer noDataViewContainer = this.d;
        if (noDataViewContainer != null) {
            noDataViewContainer.refreshTahiti();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!CommonUtil.ab(getActivity())) {
            this.g.setVisibility(0);
        } else {
            this.g.setVisibility(8);
        }
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public HealthNoDeviceContract.Presenter onCreatePresenter() {
        return (HealthNoDeviceContract.Presenter) wqn.e(this.i.getContentPresenter(), this);
    }

    @Override // com.huawei.ui.main.stories.template.health.module.nodevice.HealthNoDeviceContract.View
    public void onResponsePageModule(List<dlo> list) {
        this.d.setAllViewData(list);
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getPresenter().detachView();
        if (this.j != null) {
            this.j = null;
        }
        if (this.e != null) {
            this.e = null;
        }
        ResourceParseHelper.c();
        super.onDestroy();
    }

    @Override // com.huawei.ui.main.stories.template.BaseView
    public Context getViewContext() {
        return getContext();
    }

    @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.ConfigInfoCallback
    public void getDescription(String str) {
        if (this.h) {
            TextView textView = this.f29022b;
            if (textView != null) {
                textView.setText(str);
                return;
            }
            return;
        }
        NoDataResolutionView noDataResolutionView = this.j;
        if (noDataResolutionView != null) {
            noDataResolutionView.setData(str);
        }
    }

    @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.ConfigInfoCallback
    public void getImagePath(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HealthNoDeviceFragment", "imgPath must not be null");
            return;
        }
        if (getActivity() == null) {
            LogUtil.j("HealthNoDeviceFragment", "getImagePath getActivity is null");
            return;
        }
        Activity activity = this.e;
        if (activity == null || activity.isFinishing() || this.e.isDestroyed()) {
            return;
        }
        RequestOptions requestOptionsSkipMemoryCache = new RequestOptions().skipMemoryCache(true);
        if (this.h) {
            qqf.e(str, requestOptionsSkipMemoryCache, this.f);
        } else {
            qqf.e(str, requestOptionsSkipMemoryCache, this.n);
        }
    }

    @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.ConfigInfoCallback
    public void showParseErrorAlert() {
        HealthTextView healthTextView = this.m;
        if (healthTextView != null) {
            healthTextView.setClickable(true);
            this.m.setVisibility(0);
            this.j.setVisibility(4);
            this.d.setVisibility(4);
        }
    }

    private void b() {
        Activity activity = this.e;
        if (activity instanceof HealthDataDetailActivity) {
            CustomTitleBar customTitleBar = ((HealthDataDetailActivity) activity).getCustomTitleBar();
            this.q = customTitleBar;
            this.s = customTitleBar.getMeasuredHeight();
        }
        this.k.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: com.huawei.ui.main.stories.template.health.module.nodevice.HealthNoDeviceFragment$$ExternalSyntheticLambda1
            @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
            public final void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                this.f29024a.b(nestedScrollView, i, i2, i3, i4);
            }
        });
    }

    /* synthetic */ void b(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        this.f29021a = this.n.getMeasuredHeight() - this.s;
        Resources resources = getContext().getResources();
        if (this.f29021a > i2) {
            this.q.setTitleBarBackgroundColor(resources.getColor(R.color.no_fragment_title_bgcolor_alpha));
        } else {
            this.q.setTitleBarBackgroundColor(resources.getColor(R.color.colorBackground));
        }
    }
}
