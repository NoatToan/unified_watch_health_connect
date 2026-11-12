package com.huawei.health.device.ui.measure.fragment;

import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import defpackage.ddq;
import defpackage.dnj;
import defpackage.dso;
import defpackage.dwd;
import defpackage.dxm;
import defpackage.dxw;
import defpackage.dyg;
import defpackage.dyq;
import defpackage.elh;
import defpackage.elo;
import defpackage.eny;
import defpackage.iun;
import defpackage.lmf;
import defpackage.nkf;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class WifiWeightResultFragment extends BaseFragment {
    private static final int PERCENTAGE_100 = 100;
    private static final String TAG = "WifiWeightResultFragment";
    private static final int TARGET_TIMES = 3;
    private HealthTextView mBetweenGoalTv;
    private HealthTextView mBodyFatValueTv;
    private HealthButton mCompleteBtn;
    private ContentValues mDeviceInfo;
    private HealthButton mRemeasureBtn;
    private LinearLayout mUserLayout;
    private double mWeight;
    private HealthTextView mWeightUnitTv;
    private HealthTextView mWeightValueTv;
    private double mTargetWeightValue = 0.0d;
    private String mProductId = "";
    private elh mProductInfo = null;
    private dso mWeightAndFatRateData = null;

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        dyg.a(false, TAG, "onCreate");
        super.onCreate(bundle);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.child = layoutInflater.inflate(R.layout.device_weight_measure_result, viewGroup, false);
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        initView();
        initData();
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
        }
        return viewGroup2;
    }

    private void initView() {
        this.mWeightValueTv = (HealthTextView) this.child.findViewById(R.id.tv_weight_mearsure_result_value);
        this.mWeightUnitTv = (HealthTextView) this.child.findViewById(R.id.tv_weight_mearsure_result_value_unit);
        this.mBodyFatValueTv = (HealthTextView) this.child.findViewById(R.id.tv_body_fat_value);
        this.mBetweenGoalTv = (HealthTextView) this.child.findViewById(R.id.tv_sugar_measure_result_msg);
        this.mCompleteBtn = (HealthButton) this.child.findViewById(R.id.bt_device_measure_result_save);
        this.mRemeasureBtn = (HealthButton) this.child.findViewById(R.id.bt_device_measure_result_remeasure);
        this.mUserLayout = (LinearLayout) this.child.findViewById(R.id.weight_result_user_layout);
        this.mCompleteBtn.setText(R.string.IDS_device_show_complete);
        this.mCompleteBtn.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WifiWeightResultFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m953x8e7060a9(view);
            }
        });
        this.mRemeasureBtn.setVisibility(8);
        this.mUserLayout.setVisibility(8);
    }

    /* JADX INFO: renamed from: lambda$initView$0$com-huawei-health-device-ui-measure-fragment-WifiWeightResultFragment, reason: not valid java name */
    /* synthetic */ void m953x8e7060a9(View view) {
        goBackToLastPage();
    }

    private void initData() {
        String strH;
        ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
        this.mDeviceInfo = contentValues;
        if (contentValues == null) {
            dyg.d(false, TAG, "mDeviceInfo is null");
            strH = "";
        } else {
            this.mProductId = contentValues.getAsString("productId");
            strH = dxm.h(this.mDeviceInfo.getAsString("uniqueId"));
        }
        if (!(getArguments().getSerializable("HealthData") instanceof dso)) {
            dyg.d(false, TAG, "HealthData is not WeightAndFatRateData");
        } else {
            this.mWeightAndFatRateData = (dso) getArguments().getSerializable("HealthData");
        }
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        this.mProductInfo = elhVarD;
        if (elhVarD == null || elhVarD.s().size() <= 0) {
            return;
        }
        if (TextUtils.isEmpty(strH)) {
            setTitle(elo.a(this.mProductId, this.mProductInfo.l().d()));
        } else {
            setTitle(elo.a(this.mProductId, this.mProductInfo.l().d()) + " - " + strH);
        }
        showWeightData();
        sendEventToKaKa();
        getUserTargetWeightValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showWeightData() {
        String strE;
        dyg.a(false, TAG, "refreshWeightDataView");
        dwd data = parseData(this.mWeightAndFatRateData);
        if (UnitUtil.f()) {
            strE = UnitUtil.e(UnitUtil.h(this.mWeight), 1, dyq.b(this.mWeight, this.mProductId));
            this.mWeightUnitTv.setText(R.string.IDS_device_measure_weight_value_unit_eng);
        } else {
            double d = this.mWeight;
            strE = UnitUtil.e(d, 1, dyq.b(d, this.mProductId));
        }
        this.mWeightValueTv.setText(strE);
        this.mBodyFatValueTv.setText(data.e());
        this.mBodyFatValueTv.setTextColor(data.d());
        this.mBetweenGoalTv.setText(data.b());
        dnj singleUserById = MultiUsersManager.INSTANCE.getSingleUserById(this.mWeightAndFatRateData.o());
        if (!this.mWeightAndFatRateData.s()) {
            if (singleUserById != null && singleUserById.m() != 1) {
                this.mBetweenGoalTv.setVisibility(8);
            } else {
                this.mBetweenGoalTv.setVisibility(0);
            }
        } else {
            this.mBetweenGoalTv.setVisibility(8);
        }
        if (this.mTargetWeightValue == 0.0d) {
            this.mBetweenGoalTv.setVisibility(8);
        }
    }

    private void getUserTargetWeightValue() {
        nkf.a().a(new ResponseCallback<Float>() { // from class: com.huawei.health.device.ui.measure.fragment.WifiWeightResultFragment.1
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public void onResponse(int i, Float f) {
                LogUtil.j(WifiWeightResultFragment.TAG, "getUserTargetWeightValue data ", f);
                if (f == null) {
                    return;
                }
                try {
                    WifiWeightResultFragment.this.mTargetWeightValue = Double.parseDouble(String.valueOf(f));
                } catch (NumberFormatException e) {
                    ReleaseLogUtil.d(WifiWeightResultFragment.TAG, "getUserTargetWeightValue NumberFormatException: ", ExceptionUtils.c(e));
                }
                WifiWeightResultFragment.this.mainActivity.runOnUiThread(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.WifiWeightResultFragment.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        WifiWeightResultFragment.this.showWeightData();
                    }
                });
            }
        });
    }

    private void sendEventToKaKa() {
        String asString;
        String strD = this.mProductInfo.l().d();
        dyg.e(false, TAG, "deviceName is ", strD);
        HashMap map = new HashMap(16);
        map.put("device_name", strD);
        map.put(DeviceCategoryFragment.DEVICE_TYPE, this.mProductInfo.m().name());
        map.put("measure_time", new SimpleDateFormat(HwDrmConstant.TIME_FORMAT).format(new Date(System.currentTimeMillis())));
        lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_MEASURE_SUCCEED_2060011.value(), map, 0);
        ddq.d().setEvent(BaseApplication.getContext(), String.valueOf(KakaConstants.TASK_MEASURE_TODAY_WEIGHT), map);
        LogUtil.a(TAG, "wifi test sendWeightDetailSyncSuccessBroadcast");
        ContentValues contentValues = this.mDeviceInfo;
        if (contentValues == null) {
            asString = "";
        } else {
            asString = contentValues.getAsString("uniqueId");
        }
        dxm.c(dxw.d(), this.mProductId, asString);
    }

    private dwd parseData(dso dsoVar) {
        String string;
        String string2;
        dwd dwdVar = new dwd();
        this.mWeight = dsoVar.getWeight();
        double bodyFatRat = dsoVar.getBodyFatRat();
        dwdVar.b(new DecimalFormat("0.0").format(this.mWeight));
        setModeFatValue(dwdVar, bodyFatRat);
        dyg.e(false, TAG, "parseData mTargetWeightValue is ", Double.valueOf(this.mTargetWeightValue));
        float f = (float) (this.mWeight - this.mTargetWeightValue);
        if (UnitUtil.f()) {
            string = getResources().getString(com.huawei.ui.commonui.R.string.IDS_lb_string, UnitUtil.e(UnitUtil.h(Math.abs(f)), 1, dyq.b(this.mWeight, this.mProductId)));
        } else {
            string = getResources().getString(com.huawei.ui.commonui.R.string.IDS_kg_string, UnitUtil.e(Math.abs(f), 1, dyq.b(this.mWeight, this.mProductId)));
        }
        if (eny.a().e() > 3) {
            dwdVar.d("");
            return dwdVar;
        }
        if (eny.a().c(this.mTargetWeightValue, this.mWeight)) {
            dwdVar.d(getResources().getString(R.string.IDS_device_wifi_measure_result_equal_target_msg));
            return dwdVar;
        }
        double d = this.mWeight;
        double d2 = this.mTargetWeightValue;
        if (d > d2) {
            string2 = getResources().getString(R.string.IDS_device_wifi_measure_result_less_target_msg, string);
        } else if (d < d2) {
            string2 = getResources().getString(R.string.IDS_device_wifi_measure_result_more_target_msg, string);
        } else if (d == d2) {
            string2 = getResources().getString(R.string.IDS_device_wifi_measure_result_equal_target_msg);
        } else {
            dyg.d(false, TAG, "parseData default");
            string2 = null;
        }
        dwdVar.d(string2);
        return dwdVar;
    }

    private void setModeFatValue(dwd dwdVar, double d) {
        String string;
        if (d <= 0.0d) {
            string = getResources().getString(R.string.IDS_device_measure_weight_defualt_value);
            dwdVar.a(getResources().getColor(R.color.hw_device_measure_weight_bodyfat_zero_result));
        } else {
            NumberFormat percentInstance = NumberFormat.getPercentInstance();
            percentInstance.setMinimumFractionDigits(1);
            string = percentInstance.format(d / 100.0d);
            dwdVar.a(getResources().getColor(R.color.hw_device_measure_bottom_inside_circle_msg_color));
        }
        dwdVar.a(string);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        goBackToLastPage();
        return false;
    }

    private void goBackToLastPage() {
        SharedPreferenceManager.e(this.mainActivity, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "health_wifi_notify_TIMESTAMP", this.mWeightAndFatRateData.g(), new StorageParams());
        if (!this.mWeightAndFatRateData.s()) {
            MultiUsersManager.INSTANCE.setCurrentUser(MultiUsersManager.INSTANCE.getSingleUserById(this.mWeightAndFatRateData.o()));
            Intent intent = new Intent();
            intent.setPackage(BaseApplication.getAppPackage());
            intent.putExtra("healthdata", "MyHealthData_jump_mainActivity");
            intent.putExtra("base_health_data_type_key", 1);
            intent.putExtra("weight_user_id", MultiUsersManager.INSTANCE.getCurrentUser().i());
            iun.d("", intent);
        } else {
            Intent intent2 = new Intent();
            intent2.setPackage(BaseApplication.getAppPackage());
            intent2.setClassName(BaseApplication.getAppPackage(), "com.huawei.ui.main.stories.health.activity.healthdata.ClaimMeasureDataActivity");
            try {
                this.mainActivity.startActivity(intent2);
            } catch (ActivityNotFoundException unused) {
                LogUtil.e(TAG, "goBackToLastPage ClaimMeasureData ActivityNotFoundException");
            }
            dyg.a(false, TAG, "current data is suspected data");
        }
        if (this.mainActivity instanceof DeviceMainActivity) {
            ((DeviceMainActivity) this.mainActivity).c(true);
        }
        if (dxm.y(this.mProductId)) {
            popupFragment(HagridDeviceManagerFragment.class);
        } else {
            LogUtil.a(TAG, "not show dialog.");
            popupFragment(WiFiProductIntroductionFragment.class);
        }
    }
}
