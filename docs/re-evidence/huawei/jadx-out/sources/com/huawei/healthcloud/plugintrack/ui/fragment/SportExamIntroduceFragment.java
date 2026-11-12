package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.huawei.health.sportservice.SportDataOutputApi;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.SportBaseActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.illustration.IllustrationView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.jcm;
import defpackage.qre;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes10.dex */
public abstract class SportExamIntroduceFragment extends BaseSportingFragment {
    private static final String TAG = "Track_SportExamIntroduceFragment";
    private CustomTitleBar mCustomTitleBar;
    private HealthTextView mIntroduceDesc;
    private IllustrationView mIntroduceFirst;
    private LinearLayout mIntroduceLayout;
    private IllustrationView mIntroduceSecond;
    private HealthButton mKnownButton;

    protected abstract void enableCanStart();

    protected abstract String getFirstTips();

    protected abstract String getFistBitmapName();

    protected abstract String getSecondBitmapName();

    protected abstract String getSecondTips();

    protected abstract String getTitle();

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initViewModel() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public int getLayoutId() {
        return R.layout.skipping_sport_intro_fragment;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initView(View view) {
        this.mCustomTitleBar = (CustomTitleBar) view.findViewById(R.id.title_bar);
        this.mIntroduceFirst = (IllustrationView) view.findViewById(R.id.skipping_intro_1);
        this.mIntroduceSecond = (IllustrationView) view.findViewById(R.id.skipping_intro_2);
        this.mKnownButton = (HealthButton) view.findViewById(R.id.known_button);
        this.mIntroduceLayout = (LinearLayout) view.findViewById(R.id.skipping_intro_layout);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.skipping_intro_desc);
        this.mIntroduceDesc = healthTextView;
        healthTextView.setText(getTitle());
        this.mKnownButton.setOnClickListener(new View.OnClickListener() { // from class: jok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.lambda$initView$0(view2);
            }
        });
        this.mCustomTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: jol
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.lambda$initView$1(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        FragmentActivity activity = getActivity();
        if (activity instanceof SportBaseActivity) {
            ((SportBaseActivity) activity).c(0);
            enableCanStart();
        } else if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            SportDataOutputApi sportDataOutputApi = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class);
            if (sportDataOutputApi != null) {
                LogUtil.a(TAG, "sportDataOutputApi != null");
                sportDataOutputApi.destroyModel();
            }
            activity.onBackPressed();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment, com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        if (z && getActivity() != null && getActivity().getWindow() != null) {
            getActivity().getWindow().clearFlags(1024);
        }
        super.setUserVisibleHint(z);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initData() {
        Bitmap bitmapA = jcm.b().a(getFistBitmapName(), "webp");
        if (bitmapA != null) {
            this.mIntroduceFirst.setIllustration(bitmapA);
        }
        Bitmap bitmapA2 = jcm.b().a(getSecondBitmapName(), "webp");
        if (bitmapA2 != null) {
            this.mIntroduceSecond.setIllustration(bitmapA2);
        }
        refreshView();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        refreshView();
    }

    private void refreshView() {
        CustomTitleBar customTitleBar = this.mCustomTitleBar;
        if (customTitleBar != null) {
            customTitleBar.setTitleText(getString(R.string.IDS_track_skip_use_type));
            if (LanguageUtil.ba(getContext())) {
                this.mCustomTitleBar.setLeftButtonDrawable(ContextCompat.getDrawable(getContext(), com.huawei.ui.commonui.R.drawable.health_navbar_rtl_back_selector), qre.f(com.huawei.ui.commonui.R.string.accessibility_go_back));
            } else {
                this.mCustomTitleBar.setLeftButtonDrawable(ContextCompat.getDrawable(getContext(), com.huawei.ui.commonui.R.drawable.health_navbar_back_selector), qre.f(com.huawei.ui.commonui.R.string.accessibility_go_back));
            }
        }
        IllustrationView illustrationView = this.mIntroduceFirst;
        if (illustrationView != null) {
            illustrationView.setSubHeader(getFirstTips());
        }
        IllustrationView illustrationView2 = this.mIntroduceSecond;
        if (illustrationView2 != null) {
            illustrationView2.setSubHeader(getSecondTips());
        }
        HealthButton healthButton = this.mKnownButton;
        if (healthButton != null) {
            healthButton.setText(getString(R.string.IDS_hw_pressure_known));
        }
        LinearLayout linearLayout = this.mIntroduceLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public String getLogTag() {
        return TAG;
    }
}
