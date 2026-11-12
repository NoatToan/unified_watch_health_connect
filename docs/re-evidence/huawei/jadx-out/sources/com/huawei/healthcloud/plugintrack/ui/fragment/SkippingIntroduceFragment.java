package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.huawei.health.sportservice.SportDataOutputApi;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.SportBaseActivity;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.SkippingViewModel;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.illustration.IllustrationView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.jcp;
import defpackage.qre;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes10.dex */
public class SkippingIntroduceFragment extends BaseSportingFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f11092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IllustrationView f11093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IllustrationView f11094c;
    private LinearLayout d;
    private CustomTitleBar e;
    private SkippingViewModel i;

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public int getLayoutId() {
        return R.layout.skipping_sport_intro_fragment;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initView(View view) {
        this.e = (CustomTitleBar) view.findViewById(R.id.title_bar);
        this.f11093b = (IllustrationView) view.findViewById(R.id.skipping_intro_1);
        this.f11094c = (IllustrationView) view.findViewById(R.id.skipping_intro_2);
        this.f11092a = (HealthButton) view.findViewById(R.id.known_button);
        this.d = (LinearLayout) view.findViewById(R.id.skipping_intro_layout);
        this.f11092a.setOnClickListener(new View.OnClickListener() { // from class: jof
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f38769b.e(view2);
            }
        });
        this.e.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: joh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f38770a.b(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        FragmentActivity activity = getActivity();
        if (activity instanceof SportBaseActivity) {
            ((SportBaseActivity) activity).c(0);
            if (this.i.e()) {
                this.i.b(true);
                return;
            }
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            SportDataOutputApi sportDataOutputApi = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class);
            if (sportDataOutputApi != null) {
                LogUtil.a("Track_SkippingIntroduceFragment", "sportDataOutputApi != null");
                sportDataOutputApi.destroyModel();
            }
            activity.onBackPressed();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment, com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        if (z && getActivity() != null) {
            getActivity().getWindow().clearFlags(1024);
        }
        super.setUserVisibleHint(z);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initViewModel() {
        this.i = (SkippingViewModel) new ViewModelProvider(requireActivity()).get(SkippingViewModel.class);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initData() {
        Bitmap bitmapE = e("pic_rope_introduce_first");
        if (bitmapE != null) {
            this.f11093b.setIllustration(bitmapE);
        }
        Bitmap bitmapE2 = e("pic_rope_introduce_second");
        if (bitmapE2 != null) {
            this.f11094c.setIllustration(bitmapE2);
        }
        c();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c();
    }

    private void c() {
        CustomTitleBar customTitleBar = this.e;
        if (customTitleBar != null) {
            customTitleBar.setTitleText(getString(R.string.IDS_track_skip_use_type));
            if (LanguageUtil.ba(getContext())) {
                this.e.setLeftButtonDrawable(ContextCompat.getDrawable(getContext(), com.huawei.ui.commonui.R.drawable.health_navbar_rtl_back_selector), qre.f(com.huawei.ui.commonui.R.string.accessibility_go_back));
            } else {
                this.e.setLeftButtonDrawable(ContextCompat.getDrawable(getContext(), com.huawei.ui.commonui.R.drawable.health_navbar_back_selector), qre.f(com.huawei.ui.commonui.R.string.accessibility_go_back));
            }
        }
        if (this.f11093b != null) {
            this.f11093b.setSubHeader(getString(R.string.IDS_track_skip_use_type_one));
        }
        if (this.f11094c != null) {
            this.f11094c.setSubHeader(getString(R.string.IDS_track_skip_use_type_two));
        }
        HealthButton healthButton = this.f11092a;
        if (healthButton != null) {
            healthButton.setText(getString(R.string.IDS_hw_pressure_known));
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setVisibility(this.i.getDataSource() == 5 ? 8 : 0);
        }
    }

    private Bitmap e(String str) {
        String strB = jcp.d().b(str, "png");
        LogUtil.a("Track_SkippingIntroduceFragment", "getSkipBitmap() imagePath: ", strB);
        return jcp.d().d(strB);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public String getLogTag() {
        return "Track_SkippingIntroduceFragment";
    }
}
