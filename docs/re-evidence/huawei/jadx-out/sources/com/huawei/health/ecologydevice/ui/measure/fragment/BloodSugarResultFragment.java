package com.huawei.health.ecologydevice.ui.measure.fragment;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.api.DeviceMainActivityApi;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import defpackage.ddq;
import defpackage.dxw;
import defpackage.elh;
import defpackage.emq;
import defpackage.enw;
import defpackage.eoi;
import defpackage.era;
import defpackage.etn;
import defpackage.iov;
import defpackage.lmf;
import health.compact.a.Services;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class BloodSugarResultFragment extends BaseFragment {
    private static final String TAG = "BloodSugarResultFragment";
    private View.OnClickListener mDeviceMeasureOnClick = new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BloodSugarResultFragment$$ExternalSyntheticLambda1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f$0.m986x8fe929db(view);
        }
    };
    private String mMeasureResultLevel;
    private String mMeasureValue;
    private String mProductId;
    private String mUniqueId;

    /* JADX INFO: renamed from: lambda$new$0$com-huawei-health-ecologydevice-ui-measure-fragment-BloodSugarResultFragment, reason: not valid java name */
    /* synthetic */ void m986x8fe929db(View view) {
        if (view == null) {
            LogUtil.a(TAG, "BloodSugarResultFragment onClick view is null");
            return;
        }
        if (R.id.bt_device_measure_result_save == view.getId()) {
            saveBloodSugarData();
        } else if (R.id.bt_device_measure_result_remeasure != view.getId()) {
            LogUtil.e(TAG, "BloodSugarResultFragment onClick");
        } else {
            onDestroy();
            popupFragment(ProductIntroductionFragment.class);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
            this.mProductId = getArguments().getString("productId");
            if (contentValues != null) {
                this.mProductId = contentValues.getAsString("productId");
                this.mUniqueId = contentValues.getAsString("uniqueId");
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        if (layoutInflater == null) {
            LogUtil.a(TAG, "BloodSugarResultFragment onCreateView inflater is null");
            return viewGroup2;
        }
        this.child = layoutInflater.inflate(R.layout.device_blood_sugar_measure_result, viewGroup, false);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
        }
        HealthData healthData = getArguments().getSerializable("HealthData") instanceof HealthData ? (HealthData) getArguments().getSerializable("HealthData") : null;
        if (healthData == null) {
            LogUtil.e(TAG, "BloodSugarResultFragment get null result");
        } else {
            if (healthData instanceof emq) {
                emq emqVar = (emq) healthData;
                this.mMeasureValue = new DecimalFormat("#0.0").format(emqVar.getBloodSugar());
                this.mMeasureResultLevel = eoi.b(this.mainActivity.getApplicationContext(), emq.c(emqVar.getTimePeriod(), emqVar.getBloodSugar()));
            }
            initView();
        }
        LogUtil.d(TAG, "BloodSugerResultFragment productId is " + this.mProductId);
        if (this.mProductId != null) {
            reportProductInfoToKaka();
        }
        super.setTitle(getArguments().getString("title"));
        return viewGroup2;
    }

    private void reportProductInfoToKaka() {
        HashMap map = new HashMap(16);
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        if (elhVarD != null) {
            map.put("device_name", etn.c(this.mProductId, elhVarD.l().d()));
            map.put(DeviceCategoryFragment.DEVICE_TYPE, elhVarD.m().name());
        }
        map.put("measure_time", new SimpleDateFormat(HwDrmConstant.TIME_FORMAT).format(new Date(System.currentTimeMillis())));
        map.put("prodId", era.b(this.mProductId));
        lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_MEASURE_SUCCEED_2060013.value(), map, 0);
        ddq.d().setEvent(BaseApplication.getContext(), String.valueOf(KakaConstants.TASK_MEASURE_TODAY_BLOOD_SUGAR), map);
    }

    protected void initView() {
        if (this.child != null) {
            HealthTextView healthTextView = (HealthTextView) this.child.findViewById(R.id.tv_sugar_mearsure_result_value);
            HealthTextView healthTextView2 = (HealthTextView) this.child.findViewById(R.id.tv_sugar_mearsure_result_time);
            HealthTextView healthTextView3 = (HealthTextView) this.child.findViewById(R.id.tv_sugar_measure_result_msg);
            healthTextView.setText(this.mMeasureValue);
            Bundle bundleFromDeviceMainActivity = getBundleFromDeviceMainActivity();
            if (bundleFromDeviceMainActivity != null) {
                healthTextView2.setText(bundleFromDeviceMainActivity.getString("bloodSugarMeasureTypeString"));
            }
            healthTextView3.setText(String.format(Locale.ENGLISH, this.mainActivity.getResources().getString(R.string.IDS_device_measureactivity_reference_result), this.mMeasureResultLevel));
            HealthButton healthButton = (HealthButton) this.child.findViewById(R.id.bt_device_measure_result_remeasure);
            healthButton.setVisibility(0);
            healthButton.setOnClickListener(this.mDeviceMeasureOnClick);
            HealthButton healthButton2 = (HealthButton) this.child.findViewById(R.id.bt_device_measure_result_save);
            healthButton2.setText(R.string.IDS_device_show_complete);
            healthButton2.setOnClickListener(this.mDeviceMeasureOnClick);
        }
    }

    private void saveBloodSugarData() {
        HealthDeviceEntryApi healthDeviceEntryApi = (HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class);
        HealthDevice bondedDeviceByUniqueId = healthDeviceEntryApi.getBondedDeviceByUniqueId(this.mUniqueId);
        if (bondedDeviceByUniqueId != null) {
            enw enwVar = new enw(10001);
            enwVar.c(new IBaseResponseCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BloodSugarResultFragment$$ExternalSyntheticLambda0
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f$0.m987x4afc591d(i, obj);
                }
            });
            Serializable serializable = getArguments().getSerializable("HealthData");
            enwVar.onDataChanged(bondedDeviceByUniqueId, serializable instanceof HealthData ? (HealthData) serializable : null);
        }
        healthDeviceEntryApi.stopMeasure(this.mProductId, this.mUniqueId);
    }

    /* JADX INFO: renamed from: lambda$saveBloodSugarData$1$com-huawei-health-ecologydevice-ui-measure-fragment-BloodSugarResultFragment, reason: not valid java name */
    /* synthetic */ void m987x4afc591d(int i, Object obj) {
        LogUtil.a(TAG, "BloodSugarResultFragment saveBloodSugarData() onResponse() errCode:", Integer.valueOf(i));
        FragmentActivity activity = getActivity();
        DeviceMainActivityApi deviceMainActivityApi = (DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class);
        if (activity == null) {
            LogUtil.a(TAG, "BloodSugarResultFragment saveBloodSugarData() onResponse() mainActivity == null");
            return;
        }
        if (deviceMainActivityApi.getMeasureBackClass(activity) != null) {
            Intent intent = new Intent();
            intent.setPackage(BaseApplication.getAppPackage());
            intent.putExtra("healthdata", "MyHealthData_jump_mainActivity");
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.ui.main.stories.health.activity.healthdata.BloodSugarActivity");
            iov.d(activity, intent);
            popupFragment(deviceMainActivityApi.getMeasureBackClass(activity));
        }
        activity.finish();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public void saveResultData() {
        super.saveResultData();
        saveBloodSugarData();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public void release() {
        super.release();
        onDestroy();
        popupFragment(ProductIntroductionFragment.class);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        return super.showCustomAlertDialog(R.string.IDS_device_cancel_save_data);
    }
}
