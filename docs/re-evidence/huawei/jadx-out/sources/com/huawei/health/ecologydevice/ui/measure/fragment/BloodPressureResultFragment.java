package com.huawei.health.ecologydevice.ui.measure.fragment;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import defpackage.ddq;
import defpackage.dmz;
import defpackage.dxw;
import defpackage.elh;
import defpackage.ems;
import defpackage.eni;
import defpackage.enw;
import defpackage.era;
import defpackage.etn;
import defpackage.iov;
import defpackage.lmf;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class BloodPressureResultFragment extends BaseFragment {
    private static final String TAG = "BloodPressureResultFragment";
    private boolean hasStopMeasure = false;
    private View.OnClickListener mDeviceMeasureOnClick = new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BloodPressureResultFragment$$ExternalSyntheticLambda1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f$0.m981x1e0c4eba(view);
        }
    };
    private String mProductId;
    private String mUniqueId;

    /* JADX INFO: renamed from: lambda$new$0$com-huawei-health-ecologydevice-ui-measure-fragment-BloodPressureResultFragment, reason: not valid java name */
    /* synthetic */ void m981x1e0c4eba(View view) {
        if (view == null) {
            LogUtil.a(TAG, "BloodPressureResultFragment onClick view is null");
            return;
        }
        if (R.id.bt_device_measure_result_save == view.getId()) {
            saveBloodPressureData();
        } else if (R.id.bt_device_measure_result_remeasure != view.getId()) {
            LogUtil.a(TAG, "BloodPressureResultFragment onClick");
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
            LogUtil.a(TAG, "BloodPressureResultFragment onCreateView inflater is null");
            return viewGroup2;
        }
        this.child = layoutInflater.inflate(R.layout.device_blood_pressure_measure_result, viewGroup, false);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
        }
        Serializable serializable = getArguments().getSerializable("HealthData");
        if (serializable == null) {
            LogUtil.j(TAG, "BloodPressureResultFragment onCreateView serializable = null");
        } else if (serializable instanceof eni) {
            initView((eni) serializable);
        }
        LogUtil.d(TAG, "BloodPressureResultFragment productId is " + this.mProductId);
        if (this.mProductId != null) {
            reportProductInfoToKaka();
        }
        super.setTitle(getArguments().getString("title"));
        return viewGroup2;
    }

    private void reportProductInfoToKaka() {
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        String strC = elhVarD != null ? etn.c(this.mProductId, elhVarD.l().d()) : null;
        String strName = elhVarD != null ? elhVarD.m().name() : null;
        LogUtil.d(TAG, "BloodPressureResultFragment deviceName is " + strC);
        HashMap map = new HashMap(16);
        map.put("device_name", strC);
        map.put(DeviceCategoryFragment.DEVICE_TYPE, strName);
        map.put("measure_time", new SimpleDateFormat(HwDrmConstant.TIME_FORMAT).format(new Date(System.currentTimeMillis())));
        map.put("prodId", era.b(this.mProductId));
        lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_MEASURE_SUCCEED_2060012.value(), map, 0);
        ddq.d().setEvent(BaseApplication.getContext(), String.valueOf(KakaConstants.TASK_MEASURE_TODAY_BLOOD_PRESSURE), map);
    }

    private void initView(eni eniVar) {
        LogUtil.a(TAG, "BloodPressureResultFragment initView");
        short systolic = eniVar.getSystolic();
        short diastolic = eniVar.getDiastolic();
        if (this.child == null) {
            LogUtil.e(TAG, "BloodPressureResultFragment showPressureResultView() child == null");
            return;
        }
        ((HealthTextView) this.child.findViewById(R.id.measure_pressure_result_systolic_pressure)).setText(UnitUtil.e(systolic, 1, 0));
        ((HealthTextView) this.child.findViewById(R.id.measure_pressure_result_diastolic_pressure)).setText(UnitUtil.e(diastolic, 1, 0));
        ((HealthTextView) this.child.findViewById(R.id.measure_pressure_result_heart_rate)).setText(UnitUtil.e(eniVar.getHeartRate(), 1, 0));
        ((HealthTextView) this.child.findViewById(R.id.tv_pressure_result_level)).setText(String.format(Locale.ENGLISH, this.mainActivity.getResources().getString(R.string.IDS_device_measureactivity_reference_result), getMeasureResuleValueString(this.mainActivity, systolic, diastolic)));
        HealthButton healthButton = (HealthButton) this.child.findViewById(R.id.bt_device_measure_result_save);
        healthButton.setVisibility(0);
        healthButton.setOnClickListener(this.mDeviceMeasureOnClick);
        HealthButton healthButton2 = (HealthButton) this.child.findViewById(R.id.bt_device_measure_result_remeasure);
        healthButton2.setVisibility(0);
        healthButton2.setOnClickListener(this.mDeviceMeasureOnClick);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public void saveResultData() {
        super.saveResultData();
        saveBloodPressureData();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public void release() {
        super.release();
        onDestroy();
        popupFragment(ProductIntroductionFragment.class);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        LogUtil.e(TAG, "BloodPressureResultFragment onDestroyView");
        if (this.hasStopMeasure) {
            return;
        }
        ((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).stopMeasure(this.mProductId, this.mUniqueId);
        this.hasStopMeasure = true;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        return super.showCustomAlertDialog(R.string.IDS_device_cancel_save_data);
    }

    private void saveBloodPressureData() {
        HealthDeviceEntryApi healthDeviceEntryApi = (HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class);
        HealthDevice bondedDeviceByUniqueId = healthDeviceEntryApi.getBondedDeviceByUniqueId(this.mUniqueId);
        if (bondedDeviceByUniqueId != null) {
            Serializable serializable = getArguments().getSerializable("HealthData");
            HealthData healthData = serializable instanceof HealthData ? (HealthData) serializable : null;
            enw enwVar = new enw(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value());
            enwVar.c(new IBaseResponseCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BloodPressureResultFragment$$ExternalSyntheticLambda0
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f$0.m982xb9d1e807(i, obj);
                }
            });
            enwVar.onDataChanged(bondedDeviceByUniqueId, healthData);
        }
        healthDeviceEntryApi.stopMeasure(this.mProductId, this.mUniqueId);
        this.hasStopMeasure = true;
    }

    /* JADX INFO: renamed from: lambda$saveBloodPressureData$1$com-huawei-health-ecologydevice-ui-measure-fragment-BloodPressureResultFragment, reason: not valid java name */
    /* synthetic */ void m982xb9d1e807(int i, Object obj) {
        LogUtil.a(TAG, "BloodPressureResultFragment saveBloodPressureData() onResponse() err_code:", Integer.valueOf(i));
        FragmentActivity activity = getActivity();
        if (activity == null) {
            LogUtil.a(TAG, "BloodPressureResultFragment saveBloodPressureData() onResponse() mainActivity == null");
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(dmz.y);
        intent.putExtra("healthdata", "MyHealthData_jump_mainActivity");
        intent.setClassName(dmz.y, "com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity");
        intent.setFlags(603979776);
        iov.d(activity, intent);
        activity.finish();
    }

    private static String getMeasureResuleValueString(Context context, int i, int i2) {
        int iB = ems.b((short) i, (short) i2);
        if (iB == 0) {
            return context.getResources().getString(R.string.IDS_device_measure_pressure_result_level_low);
        }
        if (iB == 1) {
            return context.getResources().getString(R.string.IDS_device_measure_pressure_result_level_normal);
        }
        if (iB == 2) {
            return context.getResources().getString(R.string.IDS_device_measureactivity_result_high);
        }
        if (iB == 3) {
            return context.getResources().getString(R.string.IDS_device_measure_pressure_result_level_mild);
        }
        if (iB == 4) {
            return context.getResources().getString(R.string.IDS_device_measure_pressure_result_level_moderate);
        }
        if (iB == 5) {
            return context.getResources().getString(R.string.IDS_device_show_bloodpressure_level_high);
        }
        return "";
    }
}
