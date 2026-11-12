package com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.gson.reflect.TypeToken;
import com.huawei.ecologydevice.R;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.SportIntroductionContentFragment;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.up.model.UserInfomation;
import defpackage.izn;
import defpackage.ofe;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public class RateControlDescriptionFragment extends BaseFragment {
    private static final String TAG = "RateControlDescriptionFragment";
    private HealthButton mButtonAgree;
    private HealthCheckBox mCheckBox;
    private String mDeviceMac;
    private LinearLayout mLinearLayoutBottom;
    private HealthTextView mTextAge;
    private HealthTextView mTextDescription;
    private HealthTextView mTextDescriptionTip;
    private HealthTextView mTextDescriptionTitle;
    private HealthButton mTextDisAgree;
    private HealthTextView mTextEdit;
    private HealthTextView mTextGender;
    private HealthTextView mTextHeight;
    private HealthTextView mTextWeight;
    private int mType;

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mDeviceMac = arguments.getString("uniqueId");
            this.mType = arguments.getInt("deviceType");
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ViewGroup viewGroup2 = viewOnCreateView instanceof ViewGroup ? (ViewGroup) viewOnCreateView : null;
        this.child = layoutInflater.inflate(R.layout.fragment_rate_control_description, viewGroup, false);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
            initView(this.child);
            initData();
            return viewGroup2;
        }
        return this.child;
    }

    private void initView(View view) {
        this.mTextDescriptionTitle = (HealthTextView) view.findViewById(R.id.rate_mode_description_title_tv);
        this.mTextDescription = (HealthTextView) view.findViewById(R.id.rate_mode_description_tv);
        this.mTextDescriptionTip = (HealthTextView) view.findViewById(R.id.rate_control_tip_tv);
        this.mLinearLayoutBottom = (LinearLayout) view.findViewById(R.id.linearlayout_rate_control_bottom);
        this.mTextGender = (HealthTextView) view.findViewById(R.id.rate_control_gander);
        this.mTextAge = (HealthTextView) view.findViewById(R.id.rate_control_age);
        this.mTextHeight = (HealthTextView) view.findViewById(R.id.rate_control_height);
        this.mTextWeight = (HealthTextView) view.findViewById(R.id.rate_control_weight);
        this.mCheckBox = (HealthCheckBox) view.findViewById(R.id.check_box_select);
        this.mButtonAgree = (HealthButton) view.findViewById(R.id.rate_control_agree);
        this.mTextDisAgree = (HealthButton) view.findViewById(R.id.rate_control_disagree);
        this.mTextEdit = (HealthTextView) view.findViewById(R.id.rate_control_edit);
    }

    private void initData() {
        setTitle(getString(this.mType == 265 ? R.string.IDS_rate_control_ride : R.string.IDS_rate_control_running));
        this.mCustomTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.mLinearLayoutBottom.setVisibility(TextUtils.isEmpty(this.mDeviceMac) ? 8 : 0);
        this.mTextDescriptionTitle.setText(getString(this.mType == 265 ? R.string.IDS_description_rate_ride_mode : R.string.IDS_description_rate_control_mode));
        this.mTextDescription.setText(getString(this.mType == 265 ? R.string.IDS_description_rate_ride_detail : R.string.IDS_description_rate_control_detail));
        this.mTextDescriptionTip.setText(getString(this.mType == 265 ? R.string.IDS_rate_control_ride_description : R.string.IDS_rate_control_description));
        this.mButtonAgree.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment.RateControlDescriptionFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1107xb1a58276(view);
            }
        });
        this.mTextDisAgree.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment.RateControlDescriptionFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1108x78d4ce95(view);
            }
        });
        this.mTextEdit.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment.RateControlDescriptionFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1109x40041ab4(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initData$0$com-huawei-health-ecologydevice-ui-measure-fragment-sportfragment-RateControlDescriptionFragment, reason: not valid java name */
    /* synthetic */ void m1107xb1a58276(View view) {
        if (this.mCheckBox.isChecked() && !TextUtils.isEmpty(this.mDeviceMac)) {
            LinkedList<String> noShowDescriptionList = getNoShowDescriptionList();
            if (noShowDescriptionList == null) {
                noShowDescriptionList = new LinkedList<>();
            }
            noShowDescriptionList.add(this.mDeviceMac);
            SharedPreferenceManager.c("sport_introduction_content", getRateModeDescriptionKey(), ofe.c(noShowDescriptionList));
        }
        this.mainActivity.onBackPressed();
        RateControlFragment rateControlFragment = new RateControlFragment();
        rateControlFragment.setArguments(getArguments());
        addFragment(getSelectFragment(SportIntroductionContentFragment.class), rateControlFragment);
    }

    /* JADX INFO: renamed from: lambda$initData$1$com-huawei-health-ecologydevice-ui-measure-fragment-sportfragment-RateControlDescriptionFragment, reason: not valid java name */
    /* synthetic */ void m1108x78d4ce95(View view) {
        popupFragment(SportIntroductionContentFragment.class);
    }

    /* JADX INFO: renamed from: lambda$initData$2$com-huawei-health-ecologydevice-ui-measure-fragment-sportfragment-RateControlDescriptionFragment, reason: not valid java name */
    /* synthetic */ void m1109x40041ab4(View view) {
        LogUtil.a(TAG, "edit userInfo");
        AppRouter.c("/HWUserProfileMgr/UserInfoActivity").b(this.mainActivity);
    }

    private void setUserInformation() {
        String str = TAG;
        LogUtil.a(str, "setUserInformation");
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.j(str, "setUserInformation userProfileMgrApi is null");
            return;
        }
        UserInfomation localUserInfo = userProfileMgrApi.getLocalUserInfo();
        if (localUserInfo == null) {
            LogUtil.j(str, "setUserInformation userInformation is null");
            return;
        }
        this.mTextGender.setText(getString(localUserInfo.getGender() == 0 ? R.string.IDS_sns_boy : R.string.IDS_sns_girl));
        this.mTextAge.setText(String.valueOf(localUserInfo.getAgeOrDefaultValue()));
        this.mTextHeight.setText(getResources().getQuantityString(R.plurals.IDS_rate_control_des_cm, 0, Integer.valueOf(localUserInfo.getHeightOrDefaultValue())));
        this.mTextWeight.setText(getResources().getQuantityString(R.plurals.IDS_rate_control_des_kg, 0, Float.valueOf(localUserInfo.getWeightOrDefaultValue())));
    }

    private LinkedList<String> getNoShowDescriptionList() {
        String strB = SharedPreferenceManager.b("sport_introduction_content", getRateModeDescriptionKey(), "");
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        return (LinkedList) izn.d(strB, new TypeToken<LinkedList<String>>() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment.RateControlDescriptionFragment.1
        });
    }

    private String getRateModeDescriptionKey() {
        return "rate_mode_description" + LoginInit.getInstance(this.mainActivity).getAccountInfo(1011);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        setUserInformation();
    }
}
