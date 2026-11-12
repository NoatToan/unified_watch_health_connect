package com.huawei.health.ecologydevice.ui.measure.fragment.device;

import android.app.Activity;
import android.content.ContentValues;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentActivity;
import com.huawei.ecologydevice.R;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.device.api.DeviceMainActivityApi;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.device.api.HwChMeasureControllerApi;
import com.huawei.health.device.api.HwWspMeasureControllerApi;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.callback.WeightInsertStatusCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.MeasureController;
import com.huawei.health.device.open.MeasureKit;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.ProductIntroductionFragment;
import com.huawei.hihealth.device.open.data.MeasureRecord;
import com.huawei.hihealth.device.open.data.MeasureResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.profile.ProfileExtendConstants;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.dmg;
import defpackage.dmr;
import defpackage.dso;
import defpackage.dxw;
import defpackage.efx;
import defpackage.elh;
import defpackage.elo;
import defpackage.ens;
import defpackage.enw;
import defpackage.eny;
import defpackage.eph;
import defpackage.epn;
import defpackage.eqw;
import defpackage.era;
import defpackage.erh;
import defpackage.etn;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qrs;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DeviceMeasureGuideFragment extends BaseFragment {
    private static final String DEVICE_AVAILABLE = "com.huawei.health.action.DEVICE_AVAILABLE";
    private static final int MEASURE_GUIDE = 994;
    private static final long MEASURE_TIME_UPPER_LIMIT = 120000;
    private static final int OVERTIME_MEASURE = 0;
    private static final String PRODUCT_ID = "productId";
    private static final int STEP_FOUR = 4;
    private static final int STEP_ONE = 1;
    private static final int STEP_THREE = 3;
    private static final int STEP_TWO = 2;
    private static final String TAG = "DeviceMeasureGuideFragment";
    private static final String TAG_RELEASE = "DEVMGR_EcologyDevice_DeviceMeasureGuideFragment";
    private static final String TYPE = "type";
    private static final int TYPE_UNKNOWN = 0;
    private static final int ZIP_MEASURE_INDEX_ONE = 1;
    private static final int ZIP_MEASURE_INDEX_THREE = 3;
    private static final int ZIP_MEASURE_INDEX_TWO = 2;
    private static final int ZIP_MEASURE_INDEX_ZEOR = 0;
    private static MyHandler sHandler;
    private ens mAnimationHandler;
    MeasureController mControl;
    protected ContentValues mDeviceInfo;
    private LinearLayout mGuideImageLayout;
    HealthDevice mHealthDevice;
    private IHealthDeviceCallback mHealthDeviceCallback;
    private ArrayList<Object> mImgArray;
    private ArrayList<String> mImgArrayForStrings;
    private ImageView mImgGuide;
    protected boolean mIsStatus;
    protected String mKind;
    private HealthTextView mMeasureGuideDescription;
    private LinearLayout mMeasureGuideLayout;
    private HealthTextView mMeasureGuideTitle;
    private ArrayList<String> mModelStringList;
    protected String mProductId;
    private HealthTextView mPrompt;
    private HealthTextView mPromptTextView;
    private Timer mTimer;
    private TimerTask mTimerTask;
    protected int mType;
    protected String mUniqueId;
    protected Bundle mArgs = new Bundle();
    private boolean mIsDeviceMgrMeasure = false;
    private HealthViewPager.OnPageChangeListener mOnPageChangeListener = new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment.1
        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            LogUtil.a(DeviceMeasureGuideFragment.TAG, "DeviceMeasureGuideFragment onPageSelected() position = ", Integer.valueOf(i));
            DeviceMeasureGuideFragment deviceMeasureGuideFragment = DeviceMeasureGuideFragment.this;
            deviceMeasureGuideFragment.setmPromptText(i, deviceMeasureGuideFragment.mPrompt);
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            LogUtil.a(DeviceMeasureGuideFragment.TAG, "DeviceMeasureGuideFragment onPageSelected() position = ", Integer.valueOf(i));
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            LogUtil.a(DeviceMeasureGuideFragment.TAG, "DeviceMeasureGuideFragment stateChanged: position = ", Integer.valueOf(i));
        }
    };
    private int mCurrentImg = 0;
    private IHealthDeviceCallback mConnectCallback = new AnonymousClass2();

    static /* synthetic */ void lambda$getOnClickListener$1(View view) {
    }

    protected epn getMode() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void handleDataChangedInUiThread(HealthDevice healthDevice, HealthData healthData, boolean z);

    protected abstract void handleDataChangedInUiThreadUniversal(MeasureResult measureResult, boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void handleFailedEventInUiThread(int i);

    protected abstract void handleStatusChangedInUiThread(HealthDevice healthDevice, int i);

    protected abstract void handleStatusChangedInUiThreadUniversal(int i);

    static class InnerHealthDeviceCallback implements IHealthDeviceCallback {
        WeakReference<DeviceMeasureGuideFragment> weakReference;

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(HealthDevice healthDevice, List<HealthData> list) {
        }

        InnerHealthDeviceCallback(DeviceMeasureGuideFragment deviceMeasureGuideFragment) {
            this.weakReference = new WeakReference<>(deviceMeasureGuideFragment);
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(final HealthDevice healthDevice, final HealthData healthData) {
            LogUtil.a(DeviceMeasureGuideFragment.TAG, "InnerHealthDeviceCallback onDataChanged");
            final DeviceMeasureGuideFragment deviceMeasureGuideFragment = this.weakReference.get();
            if (deviceMeasureGuideFragment == null) {
                LogUtil.j(DeviceMeasureGuideFragment.TAG, "InnerHealthDeviceCallback onDataChanged fragment is null");
                return;
            }
            deviceMeasureGuideFragment.stopTimer();
            if ((healthData instanceof dso) && ((dso) healthData).t()) {
                enw enwVar = new enw(10006);
                enwVar.onDataChanged(healthDevice, healthData);
                enwVar.e(new WeightInsertStatusCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment$InnerHealthDeviceCallback$$ExternalSyntheticLambda3
                    @Override // com.huawei.health.device.callback.WeightInsertStatusCallback
                    public final void isSuccess(boolean z) {
                        DeviceMeasureGuideFragment.InnerHealthDeviceCallback.lambda$onDataChanged$0(z);
                    }
                });
            } else if (deviceMeasureGuideFragment.getActivity() != null) {
                deviceMeasureGuideFragment.getActivity().runOnUiThread(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment$InnerHealthDeviceCallback$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeviceMeasureGuideFragment.InnerHealthDeviceCallback.lambda$onDataChanged$1(deviceMeasureGuideFragment, healthDevice, healthData);
                    }
                });
            } else {
                LogUtil.j(DeviceMeasureGuideFragment.TAG, "InnerHealthDeviceCallback onDataChanged activity is null");
            }
        }

        static /* synthetic */ void lambda$onDataChanged$0(boolean z) {
            if (z) {
                LogUtil.a(DeviceMeasureGuideFragment.TAG, "insert history weight data success");
            }
        }

        static /* synthetic */ void lambda$onDataChanged$1(DeviceMeasureGuideFragment deviceMeasureGuideFragment, HealthDevice healthDevice, HealthData healthData) {
            if (deviceMeasureGuideFragment.getContext() != null) {
                deviceMeasureGuideFragment.handleDataChangedInUiThread(healthDevice, healthData, true);
            }
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onProgressChanged(final HealthDevice healthDevice, final HealthData healthData) {
            LogUtil.a(DeviceMeasureGuideFragment.TAG, "InnerHealthDeviceCallback onProgressChanged");
            final DeviceMeasureGuideFragment deviceMeasureGuideFragment = this.weakReference.get();
            if (deviceMeasureGuideFragment != null) {
                deviceMeasureGuideFragment.restartTimer();
                if (deviceMeasureGuideFragment.getActivity() != null) {
                    deviceMeasureGuideFragment.getActivity().runOnUiThread(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment$InnerHealthDeviceCallback$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            deviceMeasureGuideFragment.handleDataChangedInUiThread(healthDevice, healthData, false);
                        }
                    });
                    return;
                }
                return;
            }
            LogUtil.j(DeviceMeasureGuideFragment.TAG, "InnerHealthDeviceCallback onProgressChanged fragment is null");
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onStatusChanged(HealthDevice healthDevice, int i) {
            LogUtil.a(DeviceMeasureGuideFragment.TAG, "InnerHealthDeviceCallback onStatusChanged status = ", Integer.valueOf(i));
            final DeviceMeasureGuideFragment deviceMeasureGuideFragment = this.weakReference.get();
            if (deviceMeasureGuideFragment != null) {
                deviceMeasureGuideFragment.statusChange(healthDevice, i);
                if (i == 2) {
                    LogUtil.a(DeviceMeasureGuideFragment.TAG, "onStatusChanged connected");
                    if (deviceMeasureGuideFragment.getActivity() != null) {
                        FragmentActivity activity = deviceMeasureGuideFragment.getActivity();
                        Objects.requireNonNull(deviceMeasureGuideFragment);
                        activity.runOnUiThread(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment$InnerHealthDeviceCallback$$ExternalSyntheticLambda2
                            @Override // java.lang.Runnable
                            public final void run() {
                                deviceMeasureGuideFragment.setTextConnectStatus();
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            LogUtil.j(DeviceMeasureGuideFragment.TAG, "InnerHealthDeviceCallback onStatusChanged fragment is null");
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onFailed(HealthDevice healthDevice, final int i) {
            ReleaseLogUtil.d(DeviceMeasureGuideFragment.TAG_RELEASE, "InnerHealthDeviceCallback onFailed code = ", Integer.valueOf(i));
            final DeviceMeasureGuideFragment deviceMeasureGuideFragment = this.weakReference.get();
            if (deviceMeasureGuideFragment == null) {
                LogUtil.j(DeviceMeasureGuideFragment.TAG, "InnerHealthDeviceCallback onStatusChanged onFailed is null");
                return;
            }
            FragmentActivity activity = deviceMeasureGuideFragment.getActivity();
            if (activity == null) {
                LogUtil.a(DeviceMeasureGuideFragment.TAG, "InnerHealthDeviceCallback activity is null");
            } else {
                activity.runOnUiThread(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment$InnerHealthDeviceCallback$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        deviceMeasureGuideFragment.handleFailedEventInUiThread(i);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment$2, reason: invalid class name */
    class AnonymousClass2 implements IHealthDeviceCallback {
        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onProgressChanged(HealthDevice healthDevice, HealthData healthData) {
        }

        AnonymousClass2() {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(HealthDevice healthDevice, HealthData healthData) {
            LogUtil.a(DeviceMeasureGuideFragment.TAG, "mConnectCallback onDataChanged");
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(HealthDevice healthDevice, List<HealthData> list) {
            LogUtil.a(DeviceMeasureGuideFragment.TAG, "mConnectCallback onDataChanged 2");
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onStatusChanged(HealthDevice healthDevice, int i) {
            LogUtil.a(DeviceMeasureGuideFragment.TAG, "mConnectCallback onStatusChanged status = ", Integer.valueOf(i));
            ((HwWspMeasureControllerApi) Services.b("PluginDevice", HwWspMeasureControllerApi.class)).unRegisterCallback(DeviceMeasureGuideFragment.this.mConnectCallback);
            ((HwChMeasureControllerApi) Services.b("PluginDevice", HwChMeasureControllerApi.class)).unRegisterCallback(DeviceMeasureGuideFragment.this.mConnectCallback);
            if (i == 2) {
                DeviceMeasureGuideFragment.this.doStartMeasure(false);
                if (DeviceMeasureGuideFragment.this.getActivity() != null) {
                    DeviceMeasureGuideFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment$2$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m1065x22fb75da();
                        }
                    });
                    return;
                }
                return;
            }
            if ((!((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isHuaweiWspScaleProduct(DeviceMeasureGuideFragment.this.mProductId) || (((HwWspMeasureControllerApi) Services.b("PluginDevice", HwWspMeasureControllerApi.class)).getState() != 2 && ((HwWspMeasureControllerApi) Services.b("PluginDevice", HwWspMeasureControllerApi.class)).getState() != 1)) && !DeviceMeasureGuideFragment.this.mIsDeviceMgrMeasure) {
                DeviceMeasureGuideFragment.this.doStartMeasure(true);
            } else {
                DeviceMeasureGuideFragment.this.doStartMeasure(false);
            }
        }

        /* JADX INFO: renamed from: lambda$onStatusChanged$0$com-huawei-health-ecologydevice-ui-measure-fragment-device-DeviceMeasureGuideFragment$2, reason: not valid java name */
        /* synthetic */ void m1065x22fb75da() {
            DeviceMeasureGuideFragment.this.setTextConnectStatus();
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onFailed(HealthDevice healthDevice, int i) {
            LogUtil.a(DeviceMeasureGuideFragment.TAG, "mConnectCallback onFailed code = ", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void statusChange(HealthDevice healthDevice, int i) {
        if (healthDevice instanceof dmr) {
            dmr dmrVar = (dmr) healthDevice;
            HashMap map = new HashMap(16);
            map.put("click", "1");
            map.put("DnuDevice_Sn", erh.d(dmrVar.c()));
            map.put("device_name", etn.c(dmrVar.getProductId(), dmrVar.getDeviceName()));
            map.put(DeviceCategoryFragment.DEVICE_TYPE, dmrVar.getKind().name());
            map.put("prodId", era.b(dmrVar.getProductId()));
            lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_BEGIN_MEASURE_2060010.value(), map, 0);
        }
        processStatusChanged(healthDevice, i);
        LogUtil.a(TAG, "DeviceMeasureGuideFragment onStatusChanged 2");
    }

    private void processStatusChanged(final HealthDevice healthDevice, final int i) {
        LogUtil.a(TAG, "DeviceMeasureGuideFragment onStatusChanged status ", Integer.valueOf(i));
        if (getActivity() != null) {
            getActivity().runOnUiThread(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1064xa1596b56(healthDevice, i);
                }
            });
        } else {
            LogUtil.j(TAG, "processStatusChanged default");
        }
    }

    /* JADX INFO: renamed from: lambda$processStatusChanged$0$com-huawei-health-ecologydevice-ui-measure-fragment-device-DeviceMeasureGuideFragment, reason: not valid java name */
    /* synthetic */ void m1064xa1596b56(HealthDevice healthDevice, int i) {
        if (getActivity() != null) {
            handleStatusChangedInUiThread(healthDevice, i);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHealthDeviceCallback = new InnerHealthDeviceCallback(this);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a(TAG, "DeviceMeasureGuideFragment onCreateView");
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        this.child = layoutInflater.inflate(R.layout.device_operation_guide, viewGroup, false);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
        }
        initViewAndData();
        if (getMode() == null) {
            LogUtil.a(TAG, "DeviceMeasureGuideFragment getMode() is null");
            Serializable serializable = getArguments().getSerializable("DeviceMeasureOperateModel");
            if (serializable == null) {
                LogUtil.j(TAG, "DeviceMeasureGuideFragment onCreateView serializable = null");
                return viewGroup2;
            }
            initView(serializable);
            return viewGroup2;
        }
        LogUtil.a(TAG, "DeviceMeasureGuideFragment getMode() is not null");
        initView(getMode());
        return viewGroup2;
    }

    private void initViewAndData() {
        this.mMeasureGuideLayout = (LinearLayout) this.child.findViewById(R.id.id_device_measure_guide_layout);
        this.mPromptTextView = (HealthTextView) this.child.findViewById(R.id.device_measure_guide_tv_prompt);
        this.mMeasureGuideTitle = (HealthTextView) this.child.findViewById(R.id.id_device_measure_guide_tv_pair_step_title);
        this.mMeasureGuideDescription = (HealthTextView) this.child.findViewById(R.id.id_device_measure_guide_tv_pair_step_description);
        this.mProductId = getArguments().getString("productId");
        this.mKind = getArguments().getString("kind");
        this.mType = getArguments().getInt("type");
        ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
        this.mDeviceInfo = contentValues;
        if (contentValues == null) {
            LogUtil.j(TAG, "initData mDeviceInfo is empty");
        } else {
            this.mProductId = contentValues.getAsString("productId");
            this.mUniqueId = this.mDeviceInfo.getAsString("uniqueId");
        }
        if (TextUtils.isEmpty(this.mProductId) || TextUtils.isEmpty(this.mUniqueId)) {
            LogUtil.j(TAG, "initData mProductId or mUniqueId is empty");
            this.mProductId = getArguments().getString("productId");
        }
        this.mKind = getArguments().getString("kind");
        this.mType = getArguments().getInt("type");
        HonourDeviceConstantsApi honourDeviceConstantsApi = (HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class);
        if (honourDeviceConstantsApi.isHuaweiWspScaleProduct(this.mProductId) && this.mType == 0) {
            LogUtil.a(TAG, "DeviceMeasureGuideFragment set type -1");
            this.mType = -1;
        }
        this.mIsStatus = getArguments().getBoolean("status");
        this.mIsDeviceMgrMeasure = getArguments().getBoolean("deviceMgrMeasure");
        if (!TextUtils.isEmpty(this.mUniqueId)) {
            this.mHealthDevice = dmg.a().getBondedDeviceByUniqueId(this.mUniqueId, false);
        }
        initControl();
        String deviceNameByProductId = honourDeviceConstantsApi.getDeviceNameByProductId(this.mProductId);
        String deviceIdentify = honourDeviceConstantsApi.getDeviceIdentify(this.mUniqueId);
        if (!TextUtils.isEmpty(deviceIdentify)) {
            deviceNameByProductId = deviceNameByProductId + " - " + deviceIdentify;
        }
        if (TextUtils.isEmpty(deviceNameByProductId)) {
            return;
        }
        super.setTitle(deviceNameByProductId);
    }

    private void initControl() {
        if (this.mProductId != null) {
            elh elhVarD = ResourceManager.c().d(this.mProductId);
            MeasureKit measureKit = ((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).getMeasureKit(elhVarD != null ? elhVarD.q() : null);
            if (measureKit != null) {
                this.mControl = measureKit.getMeasureController();
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        cancelGuideImgAnimation();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        LogUtil.a(TAG, "DeviceMeasureGuideFragment stop Timer");
        stopTimer();
        HealthDeviceEntryApi healthDeviceEntryApi = (HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class);
        if (healthDeviceEntryApi.isDeviceKitUniversal(this.mProductId)) {
            healthDeviceEntryApi.sendLocalBroadcastUniversal(this.mProductId, this.mUniqueId, DEVICE_AVAILABLE);
        } else {
            healthDeviceEntryApi.sendLocalBroadcast(this.mProductId, this.mUniqueId, DEVICE_AVAILABLE);
        }
        ((HwChMeasureControllerApi) Services.b("PluginDevice", HwChMeasureControllerApi.class)).unRegisterCallback(this.mHealthDeviceCallback);
        ((HwWspMeasureControllerApi) Services.b("PluginDevice", HwWspMeasureControllerApi.class)).unRegisterCallback(this.mHealthDeviceCallback);
        super.onDestroy();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public void release() {
        super.release();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        HonourDeviceConstantsApi honourDeviceConstantsApi = (HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class);
        if (honourDeviceConstantsApi.isHuaweiWspScaleProduct(this.mProductId) && ((HwWspMeasureControllerApi) Services.b("PluginDevice", HwWspMeasureControllerApi.class)).getState() != 2) {
            this.mType = -6;
        }
        if (this.mControl != null && honourDeviceConstantsApi.isHonourWeightDevice(this.mProductId)) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
            bundle.putString("productId", this.mProductId);
            bundle.putInt("type", this.mType);
            LogUtil.a(TAG, "DeviceMeasureGuideFragment onDestroy mControl is not null");
            this.mControl.prepare(this.mHealthDevice, null, bundle);
        }
        if (this.mProductId != null) {
            ((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).stopMeasureBleScale(this.mProductId, this.mUniqueId, this.mType);
        }
        popupFragment(ProductIntroductionFragment.class);
        return false;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public void saveResultData() {
        super.saveResultData();
    }

    protected void initView(Object obj) {
        lightTheScreen();
        if (this.child != null && (obj instanceof epn)) {
            epn epnVar = (epn) obj;
            LogUtil.a(TAG, "DeviceMeasureGuideFragment initView");
            this.mImgGuide = (ImageView) this.child.findViewById(R.id.device_guide_img_prompt);
            this.mImgArray = epnVar.d();
            this.mImgArrayForStrings = epnVar.e();
            this.mModelStringList = epnVar.b();
            RelativeLayout relativeLayout = (RelativeLayout) this.child.findViewById(R.id.device_guide_img_prompt_layout);
            RelativeLayout relativeLayout2 = (RelativeLayout) this.child.findViewById(R.id.device_guide_images_prompt_layout);
            this.mGuideImageLayout = (LinearLayout) this.child.findViewById(R.id.device_guide_img_prompt_inner_layout);
            refreshGuideImageLayout();
            ArrayList<String> arrayList = this.mImgArrayForStrings;
            if (arrayList != null && arrayList.size() > 1) {
                LogUtil.a(TAG, "init imagesRelative");
                relativeLayout.setVisibility(8);
                relativeLayout2.setVisibility(0);
                initGuideImagesView();
            } else {
                LogUtil.a(TAG, "init imageRelative image");
                setTextLocation(relativeLayout, relativeLayout2, epnVar);
            }
            HealthButton healthButton = (HealthButton) this.child.findViewById(R.id.bt_device_measure_guide_next);
            if (epnVar.c()) {
                healthButton.setVisibility(0);
                healthButton.setOnClickListener(getOnClickListener());
            } else {
                healthButton.setVisibility(8);
            }
        }
    }

    private void setTextLocation(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, epn epnVar) {
        boolean z = false;
        relativeLayout.setVisibility(0);
        relativeLayout2.setVisibility(8);
        this.mMeasureGuideLayout.setVisibility(0);
        if (!((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isDualModeProduct(this.mProductId) || !njy.c(this.mModelStringList, 1)) {
            LogUtil.a(TAG, "is not dual model");
            this.mPromptTextView.setVisibility(0);
            this.mMeasureGuideTitle.setVisibility(8);
            this.mMeasureGuideDescription.setVisibility(8);
            this.mPromptTextView.setText(epnVar.a());
        } else {
            LogUtil.a(TAG, "setTextLocation is dual model strList.size = ", Integer.valueOf(this.mModelStringList.size()));
            this.mMeasureGuideTitle.setText(this.mModelStringList.get(0));
            this.mMeasureGuideDescription.setText(getContent());
            this.mPromptTextView.setVisibility(8);
            this.mMeasureGuideTitle.setVisibility(0);
            this.mMeasureGuideDescription.setVisibility(0);
            if (this.mProductId.equals("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4") || this.mProductId.equals("b29df4e3-b1f7-4e40-960d-4cfb63ccca05")) {
                LogUtil.a(TAG, "set mMeasureGuideDescription start");
                this.mMeasureGuideDescription.setGravity(GravityCompat.START);
            } else {
                LogUtil.a(TAG, "set mMeasureGuideDescription center");
                this.mMeasureGuideDescription.setGravity(17);
            }
        }
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        boolean z2 = elhVarD != null && elhVarD.m() == HealthDevice.HealthDeviceKind.HDK_BLOOD_PRESSURE;
        if (z2 && epnVar.a() != null && epnVar.a().toString().contains(System.lineSeparator())) {
            z = true;
        }
        if (z2 && z) {
            this.mPromptTextView.setGravity(GravityCompat.START);
        } else {
            this.mPromptTextView.setGravity(17);
        }
        showGuideImgAnimation();
    }

    private String getContent() {
        String string;
        if (this.mProductId.equals("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4")) {
            string = BaseApplication.getContext().getString(R.string.IDS_device_hagrid_b19_meausre_new);
            LogUtil.a(TAG, "setTextLocation hag b19 device");
        } else if (this.mProductId.equals("b29df4e3-b1f7-4e40-960d-4cfb63ccca05")) {
            string = BaseApplication.getContext().getString(R.string.IDS_device_hagrid_b29_meausre_new);
            LogUtil.a(TAG, "setTextLocation hag b29 device");
        } else {
            LogUtil.j(TAG, "setTextLocation other device");
            string = "";
        }
        if (!TextUtils.isEmpty(string)) {
            return String.format(Locale.ROOT, string, UnitUtil.e(1.0d, 1, 0), UnitUtil.e(2.0d, 1, 0), UnitUtil.e(3.0d, 1, 0), UnitUtil.e(4.0d, 1, 0));
        }
        return this.mModelStringList.get(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextConnectStatus() {
        if (this.mMeasureGuideLayout == null || this.mMeasureGuideTitle == null || this.mMeasureGuideDescription == null || this.mPromptTextView == null) {
            LogUtil.j(TAG, "setTextConnectStatus view = null");
            return;
        }
        if (((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isDualModeProduct(this.mProductId) && njy.c(this.mModelStringList, 3)) {
            LogUtil.a(TAG, "setTextLocation is dual model strList.size = ", Integer.valueOf(this.mModelStringList.size()));
            this.mMeasureGuideTitle.setText(this.mModelStringList.get(2));
            this.mMeasureGuideDescription.setText(this.mModelStringList.get(3));
            this.mPromptTextView.setVisibility(8);
            this.mMeasureGuideTitle.setVisibility(0);
            this.mMeasureGuideDescription.setVisibility(0);
            if (this.mProductId.equals("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4") || this.mProductId.equals("b29df4e3-b1f7-4e40-960d-4cfb63ccca05")) {
                LogUtil.a(TAG, "set setTextConnectStatus start");
                this.mMeasureGuideDescription.setGravity(GravityCompat.START);
            } else {
                LogUtil.a(TAG, "set setTextConnectStatus center");
                this.mMeasureGuideDescription.setGravity(17);
            }
        }
    }

    private void initGuideImagesView() {
        LogUtil.a(TAG, "enter initGuideImagesView");
        HealthViewPager healthViewPager = (HealthViewPager) this.child.findViewById(R.id.vp_device_device_img);
        HealthTextView healthTextView = (HealthTextView) this.child.findViewById(R.id.tv_device_device_introduction_prompt);
        this.mPrompt = healthTextView;
        healthTextView.setMovementMethod(ScrollingMovementMethod.getInstance());
        setmPromptText(0, this.mPrompt);
        HealthDotsPageIndicator healthDotsPageIndicator = (HealthDotsPageIndicator) this.child.findViewById(R.id.device_navigation_spot);
        eph ephVar = new eph(this.mainActivity, this.mImgArray);
        healthViewPager.setVisibility(0);
        healthViewPager.setAdapter(ephVar);
        healthViewPager.setOnPageChangeListener(this.mOnPageChangeListener);
        healthDotsPageIndicator.setRtlEnable(false);
        healthDotsPageIndicator.setViewPager(healthViewPager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setmPromptText(int i, HealthTextView healthTextView) {
        if (healthTextView != null && i < this.mImgArrayForStrings.size() && i >= 0) {
            healthTextView.setText(this.mImgArrayForStrings.get(i));
        }
    }

    private void lightTheScreen() {
        this.mainActivity.getWindow().setFlags(128, 128);
    }

    private void showGuideImgAnimation() {
        LogUtil.a(TAG, "DeviceMeasureGuideFragment showGuideImgAnimation()");
        ArrayList<Object> arrayList = this.mImgArray;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        if (this.mImgArray.size() == this.mCurrentImg) {
            this.mCurrentImg = 0;
        }
        LogUtil.a(TAG, "DeviceMeasureGuideFragment showGuideImgAnimation() mImgArray size is ", Integer.valueOf(this.mImgArray.size()));
        Object obj = this.mImgArray.get(this.mCurrentImg);
        this.mCurrentImg++;
        LogUtil.a(TAG, "DeviceMeasureGuideFragment showGuideImgAnimation() mCurrentImgId = ", obj);
        if (obj instanceof Integer) {
            this.mImgGuide.setImageResource(((Integer) obj).intValue());
        }
        if (obj instanceof String) {
            this.mImgGuide.setImageBitmap(elo.c((String) obj));
        }
        if (((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isHuaweiOrHonourDevice(this.mProductId)) {
            return;
        }
        LogUtil.a(TAG, "is not dual model");
        ens ensVar = new ens(this.mainActivity, obj, this.mCurrentImg, this.mImgGuide, this.mImgArray);
        this.mAnimationHandler = ensVar;
        ensVar.sendEmptyMessageDelayed(MEASURE_GUIDE, ProfileExtendConstants.TIME_OUT);
    }

    protected View.OnClickListener getOnClickListener() {
        return new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceMeasureGuideFragment.lambda$getOnClickListener$1(view);
            }
        };
    }

    private void cancelGuideImgAnimation() {
        LogUtil.a(TAG, "DeviceMeasureGuideFragment cancelGuideImgAnimation()");
        this.mCurrentImg = 0;
        ens ensVar = this.mAnimationHandler;
        if (ensVar == null || !ensVar.hasMessages(MEASURE_GUIDE)) {
            return;
        }
        this.mAnimationHandler.removeMessages(MEASURE_GUIDE);
    }

    public void startMeasure() {
        startMeasure(false);
    }

    public void startMeasure(boolean z) {
        if (this.mProductId != null) {
            LogUtil.a(TAG, "DeviceMeasureGuideFragment startMeasure");
            eny.a().d(this.mProductId);
            prepareStartTimer();
            if (((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).isDeviceKitUniversal(this.mProductId)) {
                doStartMeasureUniversal();
            } else if (((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isHuaweiWspScaleProduct(this.mProductId)) {
                LogUtil.a(TAG, "is Mini orHagrid startMeasure = ", Boolean.valueOf(z));
                toPrepareStart();
            } else {
                doStartMeasure(z);
            }
        }
    }

    private void toPrepareStart() {
        LogUtil.a(TAG, "DeviceMeasureGuideFragment toPrepareStart");
        MeasurableDevice bondedDeviceByUniqueId = dmg.a().getBondedDeviceByUniqueId(this.mUniqueId, true);
        if (!(bondedDeviceByUniqueId instanceof efx)) {
            stopTimer();
            processStatusChanged(bondedDeviceByUniqueId, 15);
        } else if (this.mControl != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
            bundle.putString("productId", this.mProductId);
            bundle.putInt("type", this.mType);
            bundle.putBoolean("queryStatusOnly", true);
            LogUtil.a(TAG, "DeviceMeasureGuideFragment mType = ", Integer.valueOf(this.mType));
            this.mControl.prepare(this.mHealthDevice, this.mConnectCallback, bundle);
        }
    }

    private void doStartMeasureUniversal() {
        LogUtil.a(TAG, "DeviceMeasureGuideFragment doStartMeasureUniversal");
        ((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).startMeasureUniversal(this.mProductId, this.mUniqueId, new AnonymousClass3(), getBundle());
    }

    /* JADX INFO: renamed from: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment$3, reason: invalid class name */
    class AnonymousClass3 implements com.huawei.hihealth.device.open.IHealthDeviceCallback {
        @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
        public void onProgressChanged(com.huawei.hihealth.device.open.HealthDevice healthDevice, MeasureRecord measureRecord) {
        }

        AnonymousClass3() {
        }

        @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
        public void onDataChanged(com.huawei.hihealth.device.open.HealthDevice healthDevice, MeasureResult measureResult) {
            LogUtil.a(DeviceMeasureGuideFragment.TAG, "DeviceMeasureGuideFragment onDataChanged");
            DeviceMeasureGuideFragment.this.measureDataResult(measureResult);
        }

        @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
        public void onStatusChanged(com.huawei.hihealth.device.open.HealthDevice healthDevice, final int i) {
            LogUtil.a(DeviceMeasureGuideFragment.TAG, "DeviceMeasureGuideFragment onStatusChanged status", Integer.valueOf(i));
            if (DeviceMeasureGuideFragment.this.getActivity() != null) {
                DeviceMeasureGuideFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment$3$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m1066x22fb75db(i);
                    }
                });
            } else {
                LogUtil.j(DeviceMeasureGuideFragment.TAG, "DeviceMeasureGuideFragment activity is null");
            }
            LogUtil.a(DeviceMeasureGuideFragment.TAG, "DeviceMeasureGuideFragment onStatusChanged 2");
        }

        /* JADX INFO: renamed from: lambda$onStatusChanged$0$com-huawei-health-ecologydevice-ui-measure-fragment-device-DeviceMeasureGuideFragment$3, reason: not valid java name */
        /* synthetic */ void m1066x22fb75db(int i) {
            if (DeviceMeasureGuideFragment.this.getActivity() != null) {
                DeviceMeasureGuideFragment.this.handleStatusChangedInUiThreadUniversal(i);
            }
        }

        @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
        public void onFailed(com.huawei.hihealth.device.open.HealthDevice healthDevice, int i) {
            ReleaseLogUtil.d(DeviceMeasureGuideFragment.TAG_RELEASE, "DeviceMeasureGuideFragment onFailed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void measureDataResult(final MeasureResult measureResult) {
        stopTimer();
        if (getActivity() != null) {
            getActivity().runOnUiThread(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1063x3de9a9b0(measureResult);
                }
            });
        } else {
            LogUtil.a(TAG, "DeviceMeasureGuideFragment activity is null");
        }
    }

    /* JADX INFO: renamed from: lambda$measureDataResult$2$com-huawei-health-ecologydevice-ui-measure-fragment-device-DeviceMeasureGuideFragment, reason: not valid java name */
    /* synthetic */ void m1063x3de9a9b0(MeasureResult measureResult) {
        handleDataChangedInUiThreadUniversal(measureResult, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doStartMeasure(boolean z) {
        LogUtil.a(TAG, "DeviceMeasureGuideFragment doStartMeasure");
        HealthDeviceEntryApi healthDeviceEntryApi = (HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class);
        if (this.mControl != null && ((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isHonourWeightDevice(this.mProductId)) {
            LogUtil.a(TAG, "isHonourWeightDevice doStartMeasure");
            if (this.mArgs == null) {
                this.mArgs = new Bundle();
            }
            this.mArgs.putBoolean("measureButtonOnClick", true);
            if (this.mType == -1) {
                this.mArgs.putInt("type", -1);
            } else {
                this.mArgs.putInt("type", -4);
                this.mArgs.putBoolean("activeMeasure", true);
            }
            if (z) {
                if (!healthDeviceEntryApi.startMeasureReconnect(this.mProductId, this.mUniqueId, this.mHealthDeviceCallback, getBundle(), true)) {
                    eqw.b(this.mainActivity);
                    LogUtil.j(TAG, "DeviceMeasureGuideFragment doStartMeasure measure reconnect fail");
                }
            } else {
                healthDeviceEntryApi.startMeasure(this.mProductId, this.mUniqueId, this.mHealthDeviceCallback, getBundle());
            }
            LogUtil.a(TAG, "DeviceMeasureGuideFragment doStartMeasure prepare is:");
            return;
        }
        healthDeviceEntryApi.startMeasure(this.mProductId, this.mUniqueId, this.mHealthDeviceCallback, getBundle());
    }

    private Bundle getBundle() {
        Bundle bundle = this.mArgs;
        if (bundle == null || bundle.size() == 0) {
            return null;
        }
        return this.mArgs;
    }

    static class MyHandler extends BaseHandler<Activity> {
        private WeakReference<DeviceMeasureGuideFragment> mWeakReference;

        MyHandler(Looper looper, Activity activity, DeviceMeasureGuideFragment deviceMeasureGuideFragment) {
            super(looper, activity);
            this.mWeakReference = new WeakReference<>(deviceMeasureGuideFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        public void handleMessageWhenReferenceNotNull(final Activity activity, Message message) {
            if (message.what != 0) {
                return;
            }
            LogUtil.a(DeviceMeasureGuideFragment.TAG, "DeviceMeasureGuideFragment prepareStartTimer receive msg");
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
            builder.b(R.string.IDS_device_measure_overtime);
            builder.c(R.string.IDS_device_permisson, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment$MyHandler$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m1067xb331beab(activity, view);
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            noTitleCustomAlertDialogC.setCancelable(false);
            noTitleCustomAlertDialogC.show();
        }

        /* JADX INFO: renamed from: lambda$handleMessageWhenReferenceNotNull$0$com-huawei-health-ecologydevice-ui-measure-fragment-device-DeviceMeasureGuideFragment$MyHandler, reason: not valid java name */
        /* synthetic */ void m1067xb331beab(Activity activity, View view) {
            DeviceMeasureGuideFragment deviceMeasureGuideFragment;
            WeakReference<DeviceMeasureGuideFragment> weakReference = this.mWeakReference;
            if (weakReference != null && (deviceMeasureGuideFragment = weakReference.get()) != null && deviceMeasureGuideFragment.getArguments() != null && "honour_device".equals(deviceMeasureGuideFragment.getArguments().getString("goback", ""))) {
                ((DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class)).onBackPressed(activity);
            } else {
                ((DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class)).popupFragment(activity, ProductIntroductionFragment.class);
            }
        }
    }

    static class MyTimerTask extends TimerTask {
        String mProductId;
        int mType;
        String mUniqueId;

        MyTimerTask(String str, String str2, int i) {
            this.mProductId = str;
            this.mUniqueId = str2;
            this.mType = i;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            LogUtil.a(DeviceMeasureGuideFragment.TAG, "DeviceMeasureGuideFragment prepareStartTimer send msg");
            if (((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isHuaweiWspScaleProduct(this.mProductId) && ((HwWspMeasureControllerApi) Services.b("PluginDevice", HwWspMeasureControllerApi.class)).getState() != 2) {
                this.mType = -6;
            }
            HealthDeviceEntryApi healthDeviceEntryApi = (HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class);
            String str = this.mProductId;
            if (str != null) {
                healthDeviceEntryApi.stopMeasureBleScale(str, this.mUniqueId, this.mType);
            }
            DeviceMeasureGuideFragment.sHandler.sendEmptyMessage(0);
            healthDeviceEntryApi.sendLocalBroadcast(this.mProductId, this.mUniqueId, DeviceMeasureGuideFragment.DEVICE_AVAILABLE);
        }
    }

    private void prepareStartTimer() {
        sHandler = new MyHandler(Looper.getMainLooper(), getActivity(), this);
        this.mTimerTask = new MyTimerTask(this.mProductId, this.mUniqueId, this.mType);
        synchronized (DeviceMeasureGuideFragment.class) {
            this.mTimer = new Timer(TAG);
            LogUtil.a(TAG, "DeviceMeasureGuideFragment start Timer");
            this.mTimer.schedule(this.mTimerTask, 120000L);
        }
    }

    protected void stopTimer() {
        synchronized (DeviceMeasureGuideFragment.class) {
            Timer timer = this.mTimer;
            if (timer != null) {
                timer.cancel();
                this.mTimer = null;
            }
        }
        TimerTask timerTask = this.mTimerTask;
        if (timerTask != null) {
            timerTask.cancel();
            this.mTimerTask = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restartTimer() {
        try {
            TimerTask timerTask = this.mTimerTask;
            if (timerTask != null) {
                timerTask.cancel();
                this.mTimerTask = new MyTimerTask(this.mProductId, this.mUniqueId, this.mType);
                synchronized (DeviceMeasureGuideFragment.class) {
                    try {
                        Timer timer = this.mTimer;
                        if (timer != null) {
                            timer.schedule(this.mTimerTask, 120000L);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (IllegalStateException e) {
            LogUtil.e(TAG, "restartTimer IllegalStateException ", e.getMessage());
            prepareStartTimer();
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LogUtil.a(TAG, "onConfigurationChanged, refresh page");
        refreshGuideImageLayout();
        super.onConfigurationChanged(configuration);
    }

    private void refreshGuideImageLayout() {
        LinearLayout linearLayout = this.mGuideImageLayout;
        if (linearLayout != null) {
            qrs.b(linearLayout, 2);
        }
    }
}
