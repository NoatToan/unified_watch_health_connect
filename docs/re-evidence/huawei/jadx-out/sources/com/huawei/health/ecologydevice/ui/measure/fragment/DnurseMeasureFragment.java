package com.huawei.health.ecologydevice.ui.measure.fragment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.api.DeviceMainActivityApi;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasuringProgressFragment;
import com.huawei.hihealth.device.open.data.MeasureResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.emq;
import defpackage.enq;
import defpackage.epn;
import defpackage.iov;
import defpackage.qrs;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes7.dex */
public class DnurseMeasureFragment extends DeviceMeasureGuideFragment {
    private static final String BLOOD_SUGAR_PRODUCE_ID = "blood_sugar_produce_id";
    private static final String BLOOD_SUGAR_TIME = "blood_sugar_time";
    private static final String BLOOD_SUGAR_UNIQUE_ID = "blood_sugar_unique_id";
    private static final String BLOOD_SUGAR_VALUE = "blood_sugar_value";
    private static final String ENTRANCE = "entrance";
    private static final String JUMP_FROM_BLOOD_SUGAR_INITIATIVE_MEASURE = "jump_from_blood_sugar_initiative_measure";
    private static final String PRODUCT_NAME = "product_name";
    private static final String SAVE_DATA_CLASS_NAME = "com.huawei.ui.main.stories.health.activity.healthdata.BloodSugarDeviceMeasureActivity";
    private static final String TAG = "DnurseMeasureFragment";
    private static final String TAG_RELEASE = "DEVMGR_EcologyDevice_DnurseMeasureFragment";
    private static final String TIME_PERIOD = "time_period";
    private boolean isMeasure = false;
    private ImageView mImgGuide;

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment
    public void handleDataChangedInUiThreadUniversal(MeasureResult measureResult, boolean z) {
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment
    public void handleStatusChangedInUiThreadUniversal(int i) {
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment
    public epn getMode() {
        epn epnVar = new epn();
        epnVar.a(1);
        epnVar.b(false);
        super.setTitle(getResources().getString(R.string.IDS_device_device_name_dnurse));
        return epnVar;
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment, com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.mProductId = getArguments().getString("productId");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        requestPermissions();
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment, com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.child != null) {
            this.mImgGuide = (ImageView) this.child.findViewById(R.id.device_guide_img_prompt);
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        LogUtil.d(TAG, "DnurseMeasureFragment onActivityCreated");
        if (!enq.d().c()) {
            startMeasure();
        } else {
            handleDataChangedInUiThread(enq.d().b(this.mProductId), enq.d().d(this.mProductId), true);
        }
        super.onActivityCreated(bundle);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment, com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        cancelGuideImageAnimation();
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment
    public void handleDataChangedInUiThread(HealthDevice healthDevice, HealthData healthData, boolean z) {
        LogUtil.a(TAG, "DnurseMeasureFragment handleDataChangedInUiThread, (data != null) ? ", Boolean.valueOf(healthData != null));
        if (healthData != null) {
            LogUtil.d(TAG, "DnurseMeasureFragment data=" + healthData);
            startSaveDataPage(healthData);
        }
    }

    private void startSaveDataPage(HealthData healthData) {
        if (healthData instanceof emq) {
            emq emqVar = (emq) healthData;
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getContext(), SAVE_DATA_CLASS_NAME);
            intent.putExtra(ENTRANCE, JUMP_FROM_BLOOD_SUGAR_INITIATIVE_MEASURE);
            intent.putExtra(PRODUCT_NAME, getResources().getString(R.string.IDS_device_device_name_dnurse));
            intent.putExtra(TIME_PERIOD, emq.d(emqVar.getStartTime()));
            intent.putExtra(BLOOD_SUGAR_TIME, emqVar.getStartTime());
            intent.putExtra(BLOOD_SUGAR_VALUE, emqVar.getBloodSugar());
            intent.putExtra(BLOOD_SUGAR_PRODUCE_ID, this.mProductId);
            intent.putExtra(BLOOD_SUGAR_UNIQUE_ID, this.mUniqueId);
            iov.d(getActivity(), intent);
            if (getActivity() != null) {
                getActivity().finish();
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment
    public void handleStatusChangedInUiThread(HealthDevice healthDevice, int i) {
        ReleaseLogUtil.d(TAG_RELEASE, "DnurseMeasureFragment handleStatusChangedInUiThread, status = ", Integer.valueOf(i));
        updateGuideImg(i);
        updateGuideMsg(i);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment
    public void handleFailedEventInUiThread(int i) {
        ReleaseLogUtil.a(TAG_RELEASE, "DnurseMeasureFragment handleFailedEventInUiThread, code =", Integer.valueOf(i));
    }

    private void updateGuideImg(int i) {
        ImageView imageView = this.mImgGuide;
        if (imageView == null) {
            LogUtil.e(TAG, "updateGuideImg mImgGuide is null");
        }
        switch (i) {
            case 0:
                imageView.setImageResource(R.drawable.hw_device_dnurse_glucose_measure_guide_insert_device);
                ((AnimationDrawable) this.mImgGuide.getDrawable()).start();
                break;
            case 1:
            case 2:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                break;
            case 3:
            case 5:
            case 6:
                imageView.setImageResource(R.drawable.hw_device_dnurse_glucose_measure_guide_insert_testpaper);
                ((AnimationDrawable) this.mImgGuide.getDrawable()).start();
                break;
            case 4:
                imageView.setImageResource(R.drawable.hw_device_dnurse_glucose_measure_guide_drop_blood);
                if (this.mImgGuide.getDrawable() instanceof AnimationDrawable) {
                    ((AnimationDrawable) this.mImgGuide.getDrawable()).start();
                }
                break;
            case 8:
            default:
                LogUtil.j(TAG, "DnurseMeasureFragment updateGuideImg, unsupport type");
                break;
        }
    }

    private void updateGuideMsg(int i) {
        HealthTextView healthTextView = (HealthTextView) this.child.findViewById(R.id.device_measure_guide_tv_prompt);
        updateGuideMsgCaseOne(healthTextView, i);
        updateGuideMsgCaseTwo(healthTextView, i);
        changeIsMeasure(i);
    }

    private void updateGuideMsgCaseTwo(HealthTextView healthTextView, int i) {
        if (i == 7) {
            healthTextView.setText(getResources().getString(R.string.IDS_device_measureactivity_measuring));
            showDeviceMeasuringProgressView();
            return;
        }
        if (i == 9) {
            healthTextView.setText(getResources().getString(R.string.IDS_device_measure_sugar_readyfor_measure_msg_err_device_sleep));
            return;
        }
        if (i != 11) {
            switch (i) {
                case 14:
                    healthTextView.setText(getResources().getString(R.string.IDS_device_measure_sugar_readyfor_measure_msg_err_cannot_broadcast));
                    break;
                case 15:
                    healthTextView.setText(getResources().getString(R.string.IDS_device_measure_sugar_readyfor_measure_msg_err_cannot_record));
                    break;
                case 16:
                    healthTextView.setText(getResources().getString(R.string.IDS_device_measure_sugar_readyfor_measure_msg_err_recognize));
                    break;
                case 17:
                    healthTextView.setText(getResources().getString(R.string.IDS_device_measure_sugar_readyfor_measure_msg_err_time_out));
                    break;
                default:
                    LogUtil.j(TAG, "DnurseMeasureFragment updateGuideMsg, unsupport type in CaseTwo");
                    break;
            }
            return;
        }
        healthTextView.setText(getResources().getString(R.string.IDS_device_measure_sugar_readyfor_measure_msg_err_device_misstated));
    }

    private void updateGuideMsgCaseOne(HealthTextView healthTextView, int i) {
        if (i == 10) {
            healthTextView.setText(getResources().getString(R.string.IDS_device_measure_sugar_readyfor_measure_msg_err_voltage_low));
            return;
        }
        if (i == 12) {
            healthTextView.setText(getResources().getString(R.string.IDS_device_measure_sugar_readyfor_measure_msg_err_temperature_low));
            return;
        }
        if (i != 13) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                    healthTextView.setText(getResources().getString(R.string.IDS_device_measure_sugar_readyfor_measure_msg_not_insert_device_insert));
                    break;
                case 3:
                case 6:
                    healthTextView.setText(getResources().getString(R.string.IDS_device_measure_sugar_readyfor_measure_msg_recognized_paper_insert));
                    break;
                case 4:
                    healthTextView.setText(getResources().getString(R.string.IDS_device_measure_sugar_readyfor_measure_msg_insert_paper_blood));
                    break;
                case 5:
                    healthTextView.setText(getResources().getString(R.string.IDS_device_measure_sugar_readyfor_measure_msg_insert_old_paper_change));
                    break;
                default:
                    LogUtil.j(TAG, "DnurseMeasureFragment updateGuideMsg, unsupport type in CaseOne");
                    break;
            }
            return;
        }
        healthTextView.setText(getResources().getString(R.string.IDS_device_measure_sugar_readyfor_measure_msg_err_temperature_high));
    }

    private void changeIsMeasure(int i) {
        if (i != 7) {
            this.isMeasure = false;
        }
    }

    private void showDeviceMeasuringProgressView() {
        if (this.isMeasure) {
            return;
        }
        DeviceMeasuringProgressFragment deviceMeasuringProgressFragment = new DeviceMeasuringProgressFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", getResources().getString(R.string.IDS_device_selection_start_measure));
        bundle.putInt("content", R.string.IDS_device_measureactivity_measuring);
        deviceMeasuringProgressFragment.setArguments(bundle);
        switchFragment(deviceMeasuringProgressFragment);
        this.isMeasure = true;
    }

    private void cancelGuideImageAnimation() {
        ImageView imageView = this.mImgGuide;
        if (imageView == null) {
            LogUtil.j(TAG, "cancelGuideImageAnimation mImgGuide is null return");
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
            LogUtil.a(TAG, "cancelGuideImageAnimation stop guide image animation");
        }
    }

    private void requestPermissions() {
        if (getActivity() == null) {
            LogUtil.j(TAG, "DnurseMeasureFragment getActivity() is null");
        } else {
            PermissionUtil.d(getActivity(), PermissionUtil.PermissionType.AUDIO_CALLS, new PermissionsResultAction(getActivity()));
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment, com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        popupFragment(ProductIntroductionFragment.class);
        return false;
    }

    static class PermissionsResultAction extends com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction {
        private final SoftReference<Activity> mReference;

        PermissionsResultAction(Activity activity) {
            this.mReference = new SoftReference<>(activity);
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            LogUtil.a(DnurseMeasureFragment.TAG, "onGranted");
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            LogUtil.a(DnurseMeasureFragment.TAG, "onDenied: ", str);
            Activity activity = this.mReference.get();
            if (activity == null) {
                return;
            }
            ((DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class)).popupFragment(activity, DnurseMeasureFragment.class);
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            super.onForeverDenied(permissionType);
            LogUtil.a(DnurseMeasureFragment.TAG, "onForeverDenied: ");
            Activity activity = this.mReference.get();
            if (activity == null) {
                return;
            }
            qrs.a(activity, activity.getString(R.string.IDS_device_am16_permission_str));
        }
    }
}
