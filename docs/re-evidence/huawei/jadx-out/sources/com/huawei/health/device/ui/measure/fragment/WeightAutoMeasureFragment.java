package com.huawei.health.device.ui.measure.fragment;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import defpackage.ddq;
import defpackage.dmp;
import defpackage.dnj;
import defpackage.drl;
import defpackage.drw;
import defpackage.dso;
import defpackage.dwd;
import defpackage.dxm;
import defpackage.dyj;
import defpackage.elh;
import defpackage.elo;
import defpackage.enw;
import defpackage.eny;
import defpackage.etn;
import defpackage.lsy;
import defpackage.nkf;
import defpackage.qqf;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class WeightAutoMeasureFragment extends BaseFragment implements View.OnClickListener {
    private static final String CLASS_NAME = "WeightAutoMeasureFragment";
    private static final String DEVICE_AVAILABLE = "com.huawei.health.action.DEVICE_AVAILABLE";
    private static final String TAG = "WeightAutoMeasureFragment";
    private HealthTextView mBetweenGoal;
    private HealthTextView mBodyFat;
    private IHealthDeviceCallback mCallback;
    private Context mContext;
    private HealthData mHealthData;
    private ImageView mIconImage;
    private String mProductId;
    private Resources mResources;
    private HealthButton mSaveBtn;
    private String mUniqueId;
    private dnj mUser;
    private HealthTextView mWeight;
    private HealthTextView mWeightUnit;
    private float mWeightValue;

    public WeightAutoMeasureFragment() {
        Context context = BaseApplication.getContext();
        this.mContext = context;
        this.mResources = context.getResources();
        this.mUser = MultiUsersManager.INSTANCE.getMainUser();
        this.mCallback = new IHealthDeviceCallback() { // from class: com.huawei.health.device.ui.measure.fragment.WeightAutoMeasureFragment.1
            @Override // com.huawei.health.device.callback.IHealthDeviceCallback
            public void onDataChanged(HealthDevice healthDevice, final HealthData healthData) {
                if (WeightAutoMeasureFragment.this.mainActivity != null) {
                    WeightAutoMeasureFragment.this.mainActivity.runOnUiThread(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.WeightAutoMeasureFragment.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            WeightAutoMeasureFragment.this.handleDataChangedInUiThread(healthData);
                        }
                    });
                } else {
                    LogUtil.j("WeightAutoMeasureFragment", "WeightAutoMeasureFragment", " mCallback onDataChanged mainActivity is null");
                }
            }

            @Override // com.huawei.health.device.callback.IHealthDeviceCallback
            public void onDataChanged(HealthDevice healthDevice, List<HealthData> list) {
                LogUtil.a("WeightAutoMeasureFragment", "WeightAutoMeasureFragment", " mCallback onDataChanged");
            }

            @Override // com.huawei.health.device.callback.IHealthDeviceCallback
            public void onProgressChanged(HealthDevice healthDevice, HealthData healthData) {
                LogUtil.a("WeightAutoMeasureFragment", "WeightAutoMeasureFragment", " mCallback onProgressChanged");
            }

            @Override // com.huawei.health.device.callback.IHealthDeviceCallback
            public void onStatusChanged(HealthDevice healthDevice, int i) {
                LogUtil.a("WeightAutoMeasureFragment", "WeightAutoMeasureFragment", " mCallback onStatusChanged status ", Integer.valueOf(i));
            }

            @Override // com.huawei.health.device.callback.IHealthDeviceCallback
            public void onFailed(HealthDevice healthDevice, int i) {
                LogUtil.j("WeightAutoMeasureFragment", "WeightAutoMeasureFragment", " mCallback onFailed code", Integer.valueOf(i));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleDataChangedInUiThread(HealthData healthData) {
        if (healthData == null) {
            LogUtil.j("WeightAutoMeasureFragment", "WeightAutoMeasureFragment", " handleDataChangedInUiThread data is null");
            return;
        }
        LogUtil.a("WeightAutoMeasureFragment", "WeightAutoMeasureFragment", " handleDataChangedInUiThread");
        this.mHealthData = healthData;
        initGoalWeight();
        initStartWeight();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initGoalWeight();
        lsy.a(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.WeightAutoMeasureFragment$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m906xfe87bb72();
            }
        });
        drl.a(this.mainActivity).d(this.mCallback);
        initData();
    }

    /* JADX INFO: renamed from: lambda$onCreate$0$com-huawei-health-device-ui-measure-fragment-WeightAutoMeasureFragment, reason: not valid java name */
    /* synthetic */ void m906xfe87bb72() {
        HiUserPreference userPreference = HiHealthManager.d(this.mContext).getUserPreference("custom.start_weight_base");
        if (userPreference != null) {
            this.mUser.a(CommonUtil.f(userPreference.getValue()));
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public void release() {
        super.release();
        if (this.mainActivity != null) {
            this.mainActivity.finish();
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle);
        this.child = layoutInflater.inflate(R.layout.device_weight_auto_measure, viewGroup, false);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
        }
        if (this.child == null) {
            LogUtil.j("WeightAutoMeasureFragment", "onCreateView child is null");
            return viewGroup2;
        }
        initGoalWeight();
        this.mWeight = (HealthTextView) this.child.findViewById(R.id.tv_weight_mearsure_result_value);
        this.mWeightUnit = (HealthTextView) this.child.findViewById(R.id.tv_weight_mearsure_result_value_unit);
        this.mBetweenGoal = (HealthTextView) this.child.findViewById(R.id.tv_sugar_measure_result_msg);
        this.mBodyFat = (HealthTextView) this.child.findViewById(R.id.tv_body_fat_value);
        this.mIconImage = (ImageView) this.child.findViewById(R.id.weight_user_icon);
        this.child.findViewById(R.id.bt_device_measure_result_remeasure).setVisibility(8);
        ((HealthTextView) this.child.findViewById(R.id.weight_user_name)).setText(this.mUser.h());
        HealthButton healthButton = (HealthButton) this.child.findViewById(R.id.bt_device_measure_result_save);
        this.mSaveBtn = healthButton;
        healthButton.setText(R.string.IDS_device_measureactivity_result_save);
        this.mSaveBtn.setOnClickListener(this);
        initStartWeight();
        return viewGroup2;
    }

    private void initData() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            LogUtil.j("WeightAutoMeasureFragment", "WeightAutoMeasureFragment", " initData bundle is null");
            return;
        }
        Serializable serializable = arguments.getSerializable("HealthData");
        if (serializable instanceof HealthData) {
            this.mHealthData = (HealthData) serializable;
        }
        ContentValues contentValues = (ContentValues) arguments.getParcelable("commonDeviceInfo");
        if (contentValues != null) {
            this.mProductId = contentValues.getAsString("productId");
            this.mUniqueId = contentValues.getAsString("uniqueId");
        }
        if (TextUtils.isEmpty(this.mProductId)) {
            LogUtil.j("WeightAutoMeasureFragment", "WeightAutoMeasureFragment", " initData mProductId is empty");
            return;
        }
        LogUtil.a("WeightAutoMeasureFragment", "WeightAutoMeasureFragment", " initData");
        eny.a().d(this.mProductId);
        HashMap map = new HashMap(16);
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        if (elhVarD != null) {
            elh.d dVarL = elhVarD.l();
            if (dVarL != null) {
                map.put("device_name", dVarL.d());
            }
            HealthDevice.HealthDeviceKind healthDeviceKindM = elhVarD.m();
            if (healthDeviceKindM != null) {
                map.put(DeviceCategoryFragment.DEVICE_TYPE, healthDeviceKindM.name());
            }
        }
        map.put("measure_time", new SimpleDateFormat(HwDrmConstant.TIME_FORMAT).format(new Date(System.currentTimeMillis())));
        ddq.d().setEvent(BaseApplication.getContext(), String.valueOf(KakaConstants.TASK_ENTER_TODAY_WEIGHT), map);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public void saveResultData() {
        super.saveResultData();
        saveWeightData();
    }

    private dwd parseData() {
        String strE;
        dwd dwdVar = new dwd();
        HealthData healthData = this.mHealthData;
        if (healthData instanceof dso) {
            dso dsoVar = (dso) healthData;
            this.mWeightValue = dsoVar.getWeight();
            double bodyFatRat = dsoVar.getBodyFatRat();
            if (bodyFatRat <= 0.0d) {
                strE = this.mResources.getString(R.string.IDS_device_measure_weight_defualt_value);
                dwdVar.a(this.mResources.getColor(R.color.hw_device_measure_weight_bodyfat_zero_result));
            } else {
                strE = UnitUtil.e(bodyFatRat, 2, 1);
                dwdVar.a(this.mResources.getColor(R.color.hw_device_measure_bottom_inside_circle_msg_color));
            }
            dwdVar.a(strE);
            showViewValue(dwdVar);
            LogUtil.d("WeightAutoMeasureFragment", "WeightAutoMeasureFragment", " parseData mWeight ", Float.valueOf(this.mWeightValue), " bodyFat ", strE);
            return dwdVar;
        }
        LogUtil.j("WeightAutoMeasureFragment", "WeightAutoMeasureFragment", " parseData mHealthData is null or not WeightAndFatRateData");
        return dwdVar;
    }

    private void showViewValue(dwd dwdVar) {
        String quantityString;
        if (eny.a().e() > 3) {
            dwdVar.d("");
            return;
        }
        float fN = this.mUser.n();
        double d = this.mWeightValue;
        double d2 = fN;
        double dAbs = Math.abs(UnitUtil.d(d, getFractionDigitForWeight(d, this.mProductId)) - d2);
        if (UnitUtil.f()) {
            double dH = UnitUtil.h(dAbs);
            quantityString = this.mResources.getQuantityString(R.plurals.IDS_lb_string, UnitUtil.e(dH), UnitUtil.e(dH, 1, getFractionDigitForWeight(UnitUtil.h(this.mWeightValue), this.mProductId)));
        } else {
            quantityString = this.mResources.getQuantityString(R.plurals.IDS_kg_string, UnitUtil.e(dAbs), UnitUtil.e(dAbs, 1, getFractionDigitForWeight(this.mWeightValue, this.mProductId)));
        }
        dwdVar.d(etn.d(this.mWeightValue, this.mUser.f(), d2, quantityString));
    }

    private int getFractionDigitForWeight(double d, String str) {
        return (!dxm.y(str) || (((UnitUtil.d(d, 2) - UnitUtil.d(d, 1)) > 0.0d ? 1 : ((UnitUtil.d(d, 2) - UnitUtil.d(d, 1)) == 0.0d ? 0 : -1)) == 0)) ? 1 : 2;
    }

    private void initStartWeight() {
        if (this.mUser.f() > 0.0f) {
            m904xf0dc887c();
        } else {
            lsy.a(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.WeightAutoMeasureFragment$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m905x73273d5b();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$initStartWeight$2$com-huawei-health-device-ui-measure-fragment-WeightAutoMeasureFragment, reason: not valid java name */
    /* synthetic */ void m905x73273d5b() {
        HiUserPreference userPreference = HiHealthManager.d(this.mContext).getUserPreference("custom.start_weight_base");
        if (userPreference != null) {
            this.mUser.a(CommonUtil.f(userPreference.getValue()));
        }
        if (this.mainActivity == null) {
            LogUtil.j("WeightAutoMeasureFragment", "WeightAutoMeasureFragment", " handleDataChangedInUiThread mainActivity is null");
        } else {
            this.mainActivity.runOnUiThread(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.WeightAutoMeasureFragment$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m904xf0dc887c();
                }
            });
        }
    }

    private void initGoalWeight() {
        if (this.mUser.n() > 0.0f) {
            return;
        }
        nkf.a().a(new ResponseCallback<Float>() { // from class: com.huawei.health.device.ui.measure.fragment.WeightAutoMeasureFragment.2
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public void onResponse(int i, Float f) {
                LogUtil.j("WeightAutoMeasureFragment", "initGoalWeight data ", f);
                if (f == null) {
                    return;
                }
                WeightAutoMeasureFragment.this.mUser.c(f.floatValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initViewData, reason: merged with bridge method [inline-methods] */
    public void m904xf0dc887c() {
        sendUserInfo();
        dwd data = parseData();
        if (UnitUtil.f()) {
            double dH = UnitUtil.h(this.mWeightValue);
            this.mWeight.setText(UnitUtil.e(dH, 1, getFractionDigitForWeight(dH, this.mProductId)));
            this.mWeightUnit.setText(this.mResources.getQuantityString(R.plurals.IDS_lb_string, UnitUtil.e(dH), ""));
        } else {
            HealthTextView healthTextView = this.mWeight;
            double d = this.mWeightValue;
            healthTextView.setText(UnitUtil.e(d, 1, getFractionDigitForWeight(d, this.mProductId)));
            this.mWeightUnit.setText(this.mResources.getQuantityString(R.plurals.IDS_kg_string, UnitUtil.e(this.mWeightValue), ""));
        }
        this.mBetweenGoal.setText(data.b());
        this.mBodyFat.setText(data.e());
        this.mBodyFat.setTextColor(data.d());
        setUserNameAndPhoto();
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        if (elhVarD == null) {
            LogUtil.j("WeightAutoMeasureFragment", "WeightAutoMeasureFragment", " initViewData productInfo is null");
            return;
        }
        elh.d dVarL = elhVarD.l();
        if (dVarL == null) {
            LogUtil.j("WeightAutoMeasureFragment", "WeightAutoMeasureFragment", " initViewData productManifest is null");
        } else {
            super.setTitle(elo.a(this.mProductId, dVarL.d()));
        }
    }

    private void sendUserInfo() {
        Bundle bundle = new Bundle();
        bundle.putInt("height", this.mUser.e());
        bundle.putInt("sex", this.mUser.d());
        bundle.putInt("age", this.mUser.c());
        bundle.putInt("birthday", this.mUser.j());
        EventBus.a(new EventBus.d("weight_measure_set_user", bundle));
    }

    private void saveWeightData() {
        dyj.a(this.mProductId);
        if (this.mSaveBtn.isEnabled()) {
            MultiUsersManager.INSTANCE.setCurrentUser(this.mUser);
            MeasurableDevice measurableDeviceB = dmp.d().b(this.mUniqueId, true);
            if (measurableDeviceB != null) {
                new enw(10006).onDataChanged(measurableDeviceB, this.mHealthData);
            }
            drw drwVarE = drw.e();
            drwVarE.d(this.mProductId, this.mUniqueId, -6);
            drwVarE.d(this.mProductId, this.mUniqueId, DEVICE_AVAILABLE);
            if (this.mainActivity != null) {
                this.mainActivity.finish();
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        if (this.mSaveBtn.isEnabled()) {
            return super.showCustomAlertDialog(R.string.IDS_device_cancel_save_data);
        }
        return false;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        drw.e().d(this.mProductId, this.mUniqueId, -6);
        drl.a(this.mainActivity).b();
    }

    private void setUserNameAndPhoto() {
        String strB = this.mUser.b();
        if (TextUtils.isEmpty(strB)) {
            Bitmap bitmapK = this.mUser.k();
            if (bitmapK == null) {
                this.mIconImage.setImageResource(R.mipmap.ic_personal_head);
                return;
            } else {
                this.mIconImage.setImageBitmap(qqf.a(bitmapK));
                return;
            }
        }
        setUserPhoto(strB, this.mIconImage);
    }

    private void setUserPhoto(String str, ImageView imageView) {
        if ("default".equals(str)) {
            imageView.setImageResource(R.mipmap.ic_personal_head);
            return;
        }
        Bitmap bitmapA = qqf.a(this.mContext, str);
        if (bitmapA != null) {
            imageView.setImageBitmap(bitmapA);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j("WeightAutoMeasureFragment", "WeightAutoMeasureFragment", " onClick view is null");
        } else if (view.getId() == R.id.bt_device_measure_result_save) {
            saveWeightData();
        }
    }
}
