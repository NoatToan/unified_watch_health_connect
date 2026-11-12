package com.huawei.health.ecologydevice.ui.measure.fragment;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.huawei.ecologydevice.R;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.ui.fragment.SkippingPerformanceFrag;
import com.huawei.healthcloud.plugintrack.ui.view.SkippingPerformanceView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.up.api.UpApi;
import com.huawei.up.model.UserInfomation;
import defpackage.gxt;
import defpackage.lsv;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes7.dex */
public class RopePerformanceBestFragment extends BaseFragment {
    private static final String TAG = "RopePerformanceBestFragment";
    private Bundle mBundle;
    private String mCustomTitle;
    private float[] mHistoryPercents;
    private float[] mHistoryScores;
    private float[] mPercents;
    private View mPerformanceLayout;
    private float[] mScores;
    private String mTitle;

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.mBundle = arguments;
        if (arguments != null) {
            this.mTitle = arguments.getString("skipping_performance_title");
            this.mCustomTitle = getString(R.string.IDS_rope_performance_best_of_history);
            this.mHistoryScores = this.mBundle.getFloatArray("skipping_performance_history_value");
            this.mHistoryPercents = this.mBundle.getFloatArray("skipping_performance_history_rank");
            if (this.mTitle.equals(getString(R.string.IDS_rope_performance_month_title))) {
                this.mCustomTitle = getString(R.string.IDS_rope_performance_best_of_month);
                this.mScores = this.mBundle.getFloatArray("skipping_performance_value");
                this.mPercents = this.mBundle.getFloatArray("skipping_performance_rank");
                return;
            }
            return;
        }
        LogUtil.j(TAG, "onCreate bundle is null");
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a(TAG, "onCreateView");
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (layoutInflater == null) {
            LogUtil.j(TAG, "onCreateView inflater is null!");
            return viewOnCreateView;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_rope_performance_best, viewGroup, false);
        if (viewInflate != null && viewOnCreateView != null) {
            initView(viewInflate);
            if (viewOnCreateView instanceof ViewGroup) {
                ((ViewGroup) viewOnCreateView).addView(viewInflate);
            }
            return viewOnCreateView;
        }
        LogUtil.j(TAG, "onCreateView child is null or view is null!");
        return viewOnCreateView;
    }

    private void initView(View view) {
        this.mCustomTitleBar.setTitleBarBackgroundColor(ContextCompat.getColor(requireContext(), R.color.colorSubBackground));
        setTitle(this.mCustomTitle);
        if (this.mHistoryScores == null || this.mHistoryPercents == null) {
            view.findViewById(R.id.rope_performance_no_data_layout).setVisibility(0);
            view.findViewById(R.id.rope_performance_container).setVisibility(8);
        } else {
            initShareView(view);
            initTitleBar();
            getChildFragmentManager().beginTransaction().add(R.id.rope_performance_container, SkippingPerformanceFrag.class, this.mBundle, "Track_SkippingPerformanceFrag").commit();
        }
    }

    private void initTitleBar() {
        this.mCustomTitleBar.setRightButtonVisibility(0);
        if (LanguageUtil.ba(getContext())) {
            this.mCustomTitleBar.setRightButtonDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.ic_health_nav_share_black_rt), qre.f(R.string.accessibility_share));
        } else {
            this.mCustomTitleBar.setRightButtonDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
        }
        this.mCustomTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.RopePerformanceBestFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1015x66cf2745(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initTitleBar$0$com-huawei-health-ecologydevice-ui-measure-fragment-RopePerformanceBestFragment, reason: not valid java name */
    /* synthetic */ void m1015x66cf2745(View view) {
        shareData();
    }

    private void initShareView(View view) {
        this.mPerformanceLayout = qsp.a(view, R.id.rope_performance_layout);
        SkippingPerformanceView skippingPerformanceView = (SkippingPerformanceView) qsp.a(view, R.id.rope_performance_view);
        initUserInfo(view);
        skippingPerformanceView.setTitle(this.mTitle);
        skippingPerformanceView.b();
        skippingPerformanceView.setData(this.mHistoryScores, this.mHistoryPercents, true);
        skippingPerformanceView.setData(this.mScores, this.mPercents, false);
    }

    private void shareData() {
        LogUtil.a(TAG, "shareData");
        Bitmap bitmapE = lsv.e(this.mPerformanceLayout);
        if (bitmapE == null) {
            LogUtil.j(TAG, "screenCut is null");
            qpx.b(requireContext(), R.string.IDS_motiontrack_share_fail_tip);
            return;
        }
        try {
            gxt gxtVarRequestShareContent = requestShareContent(bitmapE);
            gxtVarRequestShareContent.e(false);
            ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(gxtVarRequestShareContent, getContext());
        } catch (OutOfMemoryError unused) {
            qpx.b(requireContext(), R.string.IDS_motiontrack_share_fail_tip);
            LogUtil.j(TAG, "shareData outOfMemoryError");
        }
    }

    private gxt requestShareContent(Bitmap bitmap) {
        gxt gxtVar = new gxt(1);
        gxtVar.d(bitmap);
        gxtVar.e((String) null);
        gxtVar.b((String) null);
        gxtVar.f((String) null);
        gxtVar.d(AnalyticsValue.HEALTH_ROPE_DEVICE_DATA_2170022.value());
        gxtVar.a(1);
        gxtVar.f(false);
        gxtVar.d(1);
        return gxtVar;
    }

    private void initUserInfo(View view) {
        String accountName;
        String picPath;
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        HealthTextView healthTextView = (HealthTextView) qsp.a(view, R.id.rope_performance_user_name);
        if (userInfo != null) {
            accountName = userInfo.getName();
            picPath = userInfo.getPicPath();
        } else {
            accountName = null;
            picPath = null;
        }
        if (TextUtils.isEmpty(accountName)) {
            accountName = new UpApi(BaseApplication.getContext()).getAccountName();
            if (TextUtils.isEmpty(accountName)) {
                healthTextView.setVisibility(8);
            } else {
                healthTextView.setText(accountName);
            }
        } else {
            healthTextView.setText(accountName);
        }
        ImageView imageView = (ImageView) qsp.a(view, R.id.rope_performance_user_image);
        if (!TextUtils.isEmpty(picPath)) {
            Bitmap bitmapA = qqf.a(getContext(), picPath);
            if (bitmapA != null) {
                imageView.setImageBitmap(bitmapA);
            } else {
                LogUtil.j(TAG, "initUserInfo bitmap is null!");
            }
        } else {
            LogUtil.j(TAG, "initUserInfo headImgPath is null!");
        }
        if (Utils.o() && TextUtils.isEmpty(accountName)) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        LogUtil.a(TAG, "onBackPressed");
        popupFragment(RopePerformanceHistoryFragment.class);
        return false;
    }
}
