package com.huawei.health.ecologydevice.ui.measure.fragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.gson.Gson;
import com.google.json.JsonSanitizer;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.manager.ResourceFileListener;
import com.huawei.health.ecologydevice.fitness.SkipperTargetSettingActivity;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.era;
import defpackage.erj;
import defpackage.iov;
import defpackage.qrk;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes7.dex */
public class RopeDeviceIntroductionFragment extends BaseRopeIntroductionFragment implements View.OnClickListener, ResourceFileListener {
    private static final String TAG = "PDROPE_DeviceIntroduction";
    private LinearLayout mDeviceInfoLayout;
    private HealthTextView mDeviceInfoTv;
    private HealthTextView mLastCaloriesTv;
    private HealthTextView mLastCaloriesUnitsTv;
    private HealthTextView mLastDurationTv;
    private HealthTextView mLastDurationUnitsTv;
    private ImageView mLastJumpRight;
    private HealthTextView mLastTimeTv;
    private HealthTextView mLastValueTv;
    private HealthTextView mLastValueUnitsTv;
    private LinearLayout mModeCountLayout;
    private HealthTextView mModeCountTv;
    private LinearLayout mModeFreeLayout;
    private HealthTextView mModeFreeTv;
    private LinearLayout mModeTimeLayout;
    private HealthTextView mModeTimeTv;
    private ImageView mOtherDeviceRight;

    @Override // com.huawei.health.ecologydevice.callback.RopeDeviceDataListener
    public void onRopeSportStatusChange(int i) {
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment
    protected int getLayoutId() {
        return R.layout.rope_device_introduction_layout;
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment
    protected void initChildView() {
        if (this.child == null) {
            LogUtil.j(TAG, "initChildView child is null");
            return;
        }
        this.mRopeHistoryLayout = (ViewGroup) this.child.findViewById(R.id.rope_device_go_details);
        this.mRopeHistoryLayout.setOnClickListener(this);
        this.mLastTimeTv = (HealthTextView) this.child.findViewById(R.id.rope_device_last_time);
        this.mLastValueTv = (HealthTextView) this.child.findViewById(R.id.rope_device_last_value);
        this.mLastValueUnitsTv = (HealthTextView) this.child.findViewById(R.id.rope_device_last_value_units);
        this.mLastDurationTv = (HealthTextView) this.child.findViewById(R.id.rope_device_last_duration);
        this.mLastDurationUnitsTv = (HealthTextView) this.child.findViewById(R.id.rope_device_last_duration_units);
        this.mLastCaloriesTv = (HealthTextView) this.child.findViewById(R.id.rope_device_last_calories);
        this.mLastCaloriesUnitsTv = (HealthTextView) this.child.findViewById(R.id.rope_device_last_calories_units);
        LinearLayout linearLayout = (LinearLayout) this.child.findViewById(R.id.rope_device_mode_free_layout);
        this.mModeFreeLayout = linearLayout;
        linearLayout.setOnClickListener(this);
        this.mModeFreeTv = (HealthTextView) this.child.findViewById(R.id.rope_device_mode_free);
        LinearLayout linearLayout2 = (LinearLayout) this.child.findViewById(R.id.rope_device_mode_count_layout);
        this.mModeCountLayout = linearLayout2;
        linearLayout2.setOnClickListener(this);
        this.mModeCountTv = (HealthTextView) this.child.findViewById(R.id.rope_device_mode_count);
        LinearLayout linearLayout3 = (LinearLayout) this.child.findViewById(R.id.rope_device_mode_time_layout);
        this.mModeTimeLayout = linearLayout3;
        linearLayout3.setOnClickListener(this);
        this.mModeTimeTv = (HealthTextView) this.child.findViewById(R.id.rope_device_mode_time);
        LinearLayout linearLayout4 = (LinearLayout) this.child.findViewById(R.id.rope_device_info_layout);
        this.mDeviceInfoLayout = linearLayout4;
        linearLayout4.setOnClickListener(this);
        this.mDeviceInfoTv = (HealthTextView) this.child.findViewById(R.id.rope_device_info_tv);
        this.mLastJumpRight = (ImageView) this.child.findViewById(R.id.rope_device_last_jump_icon_right);
        this.mOtherDeviceRight = (ImageView) this.child.findViewById(R.id.rope_device_other_icon_right);
        fontAdaptation();
        initRtLanguageView();
        initMoreMenuData();
    }

    private void initMoreMenuData() {
        if ("yes".equals(this.mProductInfo.c("ota"))) {
            this.mMoreMenuList.add(getResources().getString(R.string.IDS_device_wear_home_device_ota_upgrade));
        }
        this.mMoreMenuList.add(getResources().getString(R.string.IDS_device_wear_home_delete_device));
        setOtaRedPoint(true);
    }

    private void initRtLanguageView() {
        if (LanguageUtil.ba(getActivity())) {
            this.mLastJumpRight.setBackgroundResource(R.drawable.common_ui_arrow_left);
            this.mOtherDeviceRight.setBackgroundResource(R.drawable.common_ui_arrow_left);
        }
    }

    private void fontAdaptation() {
        if (qrs.u()) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.health_common_10dp);
            this.mModeFreeLayout.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            this.mModeCountLayout.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            this.mModeTimeLayout.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            return;
        }
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.health_common_15dp);
        this.mModeFreeLayout.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize2);
        this.mModeCountLayout.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize2);
        this.mModeTimeLayout.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (getActivity() == null) {
            return;
        }
        if (qrs.r()) {
            LogUtil.a(TAG, "click too fast");
            return;
        }
        if (view == this.mModeFreeLayout) {
            LogUtil.d(TAG, "onClick mode free");
            goSkipperTargetSettingActivity(6);
            return;
        }
        if (view == this.mModeCountLayout) {
            LogUtil.d(TAG, "onClick mode count");
            goSkipperTargetSettingActivity(5);
            return;
        }
        if (view == this.mModeTimeLayout) {
            LogUtil.d(TAG, "onClick mode time");
            goSkipperTargetSettingActivity(0);
            return;
        }
        if (view == this.mDeviceInfoLayout || view == this.mDeviceInfoTv) {
            LogUtil.d(TAG, "onClick device info");
            if (this.mDeviceInformation != null) {
                goToDeviceInfoFragment();
                return;
            }
            return;
        }
        if (view == this.mRopeHistoryLayout) {
            LogUtil.d(TAG, "onClick start history activity");
            erj.d(this.mainActivity, 283);
        } else {
            LogUtil.d(TAG, "onClick unknown view");
        }
    }

    private void goSkipperTargetSettingActivity(int i) {
        saveDeviceName();
        Intent intent = new Intent(getActivity(), (Class<?>) SkipperTargetSettingActivity.class);
        intent.putExtra("currentSkipperTarget", i);
        iov.d(getActivity(), intent);
    }

    private void saveDeviceName() {
        SharedPreferences.Editor editorEdit = BaseApplication.getContext().getSharedPreferences("device_name", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("device_name_key", this.mTitle);
            editorEdit.apply();
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment
    protected void onDeviceStateChanged() {
        super.onDeviceStateChanged();
        if (checkMacAddress()) {
            return;
        }
        setViewClickable(this.mRopeDeviceDataManager.c() == 2);
    }

    private void setViewClickable(boolean z) {
        if (getContext() == null) {
            return;
        }
        this.mModeFreeLayout.setClickable(z);
        this.mModeFreeTv.setTextColor(getResources().getColor(z ? R.color.textColorSecondary : R.color.textColorTertiary));
        this.mModeCountLayout.setClickable(z);
        this.mModeCountTv.setTextColor(getResources().getColor(z ? R.color.textColorSecondary : R.color.textColorTertiary));
        this.mModeTimeLayout.setClickable(z);
        this.mModeTimeTv.setTextColor(getResources().getColor(z ? R.color.textColorSecondary : R.color.textColorTertiary));
        this.mDeviceInfoLayout.setClickable(z);
        this.mDeviceInfoTv.setTextColor(getResources().getColor(z ? R.color.textColorPrimary : R.color.textColorTertiary));
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment
    protected void initDefaultRopeView() {
        this.mRopeHistoryLayout.setVisibility(8);
        this.mLastTimeTv.setText("- -");
        this.mLastValueTv.setText("- -");
        this.mLastDurationTv.setText("- -");
        this.mLastCaloriesTv.setText("- -");
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment
    protected void refreshLastRopeDataUi() {
        if (this.mRopeDeviceDataManager == null) {
            LogUtil.j(TAG, "onNewLastRopeData mRopeDeviceDataManager is null");
            return;
        }
        this.mRopeHistoryLayout.setVisibility(0);
        HiHealthData hiHealthDataE = this.mRopeDeviceDataManager.e();
        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) new Gson().fromJson(JsonSanitizer.sanitize(hiHealthDataE.getMetaData()), HiTrackMetaData.class);
        if (hiTrackMetaData != null) {
            int lastRopeValue = parseLastRopeValue(hiTrackMetaData);
            long totalTime = hiTrackMetaData.getTotalTime();
            String strD = era.d(hiTrackMetaData.getTotalCalories());
            this.mLastTimeTv.setText(qrk.d(hiHealthDataE.getStartTime()));
            this.mLastValueTv.setText(UnitUtil.e(lastRopeValue, 1, 0));
            this.mLastDurationTv.setText(era.b(totalTime));
            this.mLastCaloriesTv.setText(strD);
            this.mLastValueUnitsTv.setText(era.b(getContext(), lastRopeValue));
            this.mLastDurationUnitsTv.setText(getContext().getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit, ""));
            this.mLastCaloriesUnitsTv.setText(getContext().getResources().getString(R.string.IDS_plugindameon_hw_show_sport_kcal_string, ""));
        }
    }

    private int parseLastRopeValue(HiTrackMetaData hiTrackMetaData) {
        String str = hiTrackMetaData.getExtendTrackMap().get("skipNum");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return CommonUtil.j(str);
    }
}
