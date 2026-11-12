package com.huawei.health.device.ui.measure.fragment;

import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.AnimationDrawable;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.C;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.callback.ScaleDialogCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.manager.DeviceCloudSharePreferencesManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.device.ui.util.DeviceManagerInfoHandler;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.device.wifi.interfaces.BaseCallbackInterface;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.health.device.wifi.manager.DeviceRegisterManager;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.ProductIntroductionFragment;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.RegisterInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetDeviceRegistration;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.up.api.UpApi;
import defpackage.dmp;
import defpackage.doq;
import defpackage.drk;
import defpackage.drw;
import defpackage.dso;
import defpackage.dti;
import defpackage.dxi;
import defpackage.dxm;
import defpackage.dxv;
import defpackage.dxw;
import defpackage.dyg;
import defpackage.dyj;
import defpackage.dyn;
import defpackage.dys;
import defpackage.ean;
import defpackage.ebh;
import defpackage.ebi;
import defpackage.ebv;
import defpackage.eby;
import defpackage.ecf;
import defpackage.ecj;
import defpackage.ecp;
import defpackage.ecs;
import defpackage.elh;
import defpackage.eqw;
import defpackage.eru;
import defpackage.ioi;
import defpackage.lqo;
import defpackage.niz;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import ohos.ace.adapter.capability.web.WebDataBaseColumns;

/* JADX INFO: loaded from: classes7.dex */
public class HagridDeviceBindResultFragment extends BaseFragment implements View.OnClickListener {
    private static final int CLOUD_DEVICE_NOT_FIND_CODE = 112000050;
    private static final String TAG = "HagridDeviceBindResultFragment";
    private static final String TAG_RELEASE = "R_Weight_HagridDeviceBindResultFragment";
    private static int mBindStatus;
    private String deviceAddress;
    private AnimationDrawable mAnimation;
    private ImageView mAnimationView;
    private LinearLayout mAutoUpgradeLayout;
    private HealthCheckBox mAutoUpgradeSwitch;
    private ImageView mBackgroundImg;
    private LinearLayout mBindCancel;
    private HealthButton mBindCancelButton;
    private HealthTextView mBindCancelText;
    private LinearLayout mBindDeviceProgressLayout;
    private HealthButton mBindFinishButton;
    private HealthTextView mBindGoText;
    private LinearLayout mBindGuideBottom;
    private LinearLayout mBindGuideLayout;
    private LinearLayout mBindNextBottom;
    private HealthTextView mBindPercentSign;
    private HealthTextView mBindProgressText;
    private LinearLayout mBindResultDeviceLayout;
    private HealthButton mBindSuccessButton;
    private LinearLayout mBindSuccessLayout;
    private LinearLayout mBindSuccessLayoutBottom;
    private HealthTextView mBindSuccessText;
    private HealthTextView mBindSucessDes;
    private HealthTextView mBindWifiGuideDes;
    private ImageView mCancelImage;
    private Timer mCheckTimer;
    private String mCloudDeviceId;
    private ContentValues mContentValues;
    private Context mContext;
    private String mDeviceId;
    private String mDeviceIdentify;
    private DeviceRegisterManager mDeviceManager;
    private DeviceManagerInfoHandler mDeviceManagerInfoHandler;
    private String mDeviceSsid;
    private ImageView mGuideImg;
    private FrameLayout mGuideSuccessImg;
    private ioi mInteractors;
    private boolean mIsNfcConnect;
    private CommonDialog21 mLoadingDialog;
    private MyHandler mMyHandler;
    private ImageView mNextImage;
    private HealthTextView mPairingWifiNameText;
    private String mProductId;
    private elh mProductInfo;
    private LinearLayout mReChooseLayout;
    private eby mRegisterDevice;
    private String mSsid;
    private String mSsidPwd;
    private long mStartBindTime;
    private eby mWifiDevice;
    private boolean mIsModifyWlanInfo = false;
    private boolean mIsHealthDataStatus = false;
    private boolean mIsPersonalInfoStatus = false;
    private String mAccountInfo = "";
    private boolean mIsBinding = false;
    private boolean mIsCreateSave = false;
    private boolean mIsJumpFromWifiInfoConfirmFragment = false;
    private dxi mFragmentHelper = new dxi();
    private BaseCallbackInterface mRegisterCallback = new BaseCallbackInterface() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindResultFragment.1
        @Override // com.huawei.health.device.wifi.interfaces.BaseCallbackInterface
        public void onSuccess(Object obj) {
            if (obj != null) {
                if (obj instanceof Bundle) {
                    LogUtil.a(HagridDeviceBindResultFragment.TAG, "onSuccess startEstimatingBindProgress...");
                    if (drk.b(HagridDeviceBindResultFragment.this.mDeviceIdentify, 24)) {
                        HagridDeviceBindResultFragment.this.sendConfigInfoForNew((Bundle) obj);
                        return;
                    } else {
                        HagridDeviceBindResultFragment.this.getVerifyCodeSuccess((Bundle) obj);
                        return;
                    }
                }
                if (obj instanceof eby) {
                    LogUtil.a(HagridDeviceBindResultFragment.TAG, "onSuccess sendSetManagerInfo");
                    HagridDeviceBindResultFragment.this.mRegisterDevice = (eby) obj;
                    HagridDeviceBindResultFragment.this.sendSetManagerInfo();
                    return;
                }
                LogUtil.j(HagridDeviceBindResultFragment.TAG_RELEASE, "onSuccess else");
            }
        }

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallbackInterface
        public void onFailure(int i) {
            HagridDeviceBindResultFragment.this.mMainHandler.removeMessages(1006);
            if (i == 3103) {
                HagridDeviceBindResultFragment.this.mMyHandler.sendEmptyMessage(1004);
            } else if (i == 3101) {
                HagridDeviceBindResultFragment.this.mMyHandler.sendEmptyMessage(1005);
            } else {
                LogUtil.j(HagridDeviceBindResultFragment.TAG_RELEASE, "onFailure else");
            }
        }

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallbackInterface
        public void onStatus(int i) {
            LogUtil.a(HagridDeviceBindResultFragment.TAG, "update status: ", Integer.valueOf(i));
            if (i == 0) {
                HagridDeviceBindResultFragment.this.mMyHandler.sendEmptyMessageDelayed(1003, 2000L);
            }
        }
    };
    private EventBus.ICallback mEventCallback = new EventBus.ICallback() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindResultFragment$$ExternalSyntheticLambda4
        @Override // com.huawei.health.device.util.EventBus.ICallback
        public final void onEvent(EventBus.d dVar) {
            this.f$0.m845x65e72cff(dVar);
        }
    };
    private Handler mMainHandler = new Handler(Looper.getMainLooper()) { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindResultFragment.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1006) {
                HagridDeviceBindResultFragment.this.updateEstimatingBindProgress(message.obj instanceof Boolean ? ((Boolean) message.obj).booleanValue() : false);
            } else {
                LogUtil.j(HagridDeviceBindResultFragment.TAG, "mMainHandler other status");
            }
        }
    };

    /* JADX INFO: renamed from: lambda$new$0$com-huawei-health-device-ui-measure-fragment-HagridDeviceBindResultFragment, reason: not valid java name */
    /* synthetic */ void m845x65e72cff(EventBus.d dVar) {
        if (dVar == null) {
            LogUtil.j(TAG_RELEASE, "event is null");
            return;
        }
        Bundle bundleB = dVar.b();
        if (bundleB == null) {
            LogUtil.j(TAG_RELEASE, "bundle is null");
            return;
        }
        LogUtil.a(TAG, "event start: ", dVar.e());
        if ("send_wifi_password_result".equals(dVar.e())) {
            onReceiveWifiPasswordResult(bundleB);
            return;
        }
        if ("update_wifi_device_cloud_status".equals(dVar.e())) {
            onReceiveWifiDeviceCloudStatus(bundleB);
        } else if (!"set_manager_info_result".equals(dVar.e())) {
            LogUtil.j(TAG_RELEASE, "event is else");
        } else {
            onReceiveSetManagerInfoResult(bundleB);
        }
    }

    private void onReceiveWifiPasswordResult(Bundle bundle) {
        int i = bundle.getInt("result");
        LogUtil.a(TAG, "send wifi password result: ", Integer.valueOf(i));
        if (i == 0) {
            cancelTimer();
            startTimer();
        } else {
            this.mMyHandler.sendEmptyMessage(1004);
        }
    }

    private void onReceiveWifiDeviceCloudStatus(Bundle bundle) {
        int i = bundle.getInt("status");
        LogUtil.a(TAG, "update wifi password cloud status: ", Integer.valueOf(i));
        if (i != 2 || !isManagerUser()) {
            if (i == 3) {
                this.mMyHandler.removeMessages(1003);
                cancelTimer();
                this.mMyHandler.sendEmptyMessage(1004);
                return;
            }
            LogUtil.j(TAG, "update wifi is not SUCCESS or FAILED");
            return;
        }
        this.mMyHandler.removeMessages(1004);
        cancelTimer();
        Message messageObtain = Message.obtain();
        messageObtain.what = 1006;
        messageObtain.obj = true;
        this.mMainHandler.sendMessage(messageObtain);
        this.mMyHandler.sendEmptyMessageDelayed(1003, 2000L);
    }

    private void onReceiveSetManagerInfoResult(Bundle bundle) {
        if (bundle != null) {
            int i = bundle.getInt("ret");
            this.mMyHandler.removeMessages(1007);
            if (i == 0) {
                registerDeviceSuccess(this.mRegisterDevice);
            } else {
                this.mMyHandler.sendEmptyMessage(1007);
            }
        }
    }

    static class MyHandler extends StaticHandler<HagridDeviceBindResultFragment> {
        MyHandler(HagridDeviceBindResultFragment hagridDeviceBindResultFragment) {
            super(hagridDeviceBindResultFragment);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        public void handleMessage(HagridDeviceBindResultFragment hagridDeviceBindResultFragment, Message message) {
            LogUtil.a(HagridDeviceBindResultFragment.TAG, "HagridDeviceBindResultFragment MyHandler what: ", Integer.valueOf(message.what));
            if (hagridDeviceBindResultFragment.isDestory()) {
                return;
            }
            LogUtil.a(HagridDeviceBindResultFragment.TAG, "HagridDeviceBindResultFragment MyHandler what: ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1000) {
                hagridDeviceBindResultFragment.gotoDeviceManagerPage();
                return;
            }
            if (i == 1007) {
                int unused = HagridDeviceBindResultFragment.mBindStatus = 6;
                hagridDeviceBindResultFragment.updateStatus(6);
                if (hagridDeviceBindResultFragment.mRegisterDevice != null) {
                    hagridDeviceBindResultFragment.mRegisterDevice.a().b(2);
                }
                hagridDeviceBindResultFragment.bindUpdateDevice();
                return;
            }
            switch (i) {
                case 1003:
                    removeMessages(1007);
                    int unused2 = HagridDeviceBindResultFragment.mBindStatus = 5;
                    hagridDeviceBindResultFragment.updateStatus(5);
                    break;
                case 1004:
                    removeMessages(1007);
                    int unused3 = HagridDeviceBindResultFragment.mBindStatus = 6;
                    hagridDeviceBindResultFragment.updateStatus(6);
                    break;
                case 1005:
                    removeMessages(1007);
                    int unused4 = HagridDeviceBindResultFragment.mBindStatus = 6;
                    hagridDeviceBindResultFragment.updateStatus(6);
                    break;
                default:
                    LogUtil.j(HagridDeviceBindResultFragment.TAG, "HagridDeviceBindResultFragment MyHandler what else");
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindUpdateDevice() {
        if (this.mRegisterDevice == null) {
            LogUtil.j(TAG, "enter bindUpdateDevice, mRegisterDevice is null");
        } else {
            LogUtil.a(TAG, "enter bindUpdateDevice");
            dmp.d().b(this.mProductId, this.mProductInfo.q(), this.mRegisterDevice, new IDeviceEventHandler() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindResultFragment.3
                @Override // com.huawei.health.device.callback.IDeviceEventHandler
                public void onDeviceFound(HealthDevice healthDevice) {
                    LogUtil.a(HagridDeviceBindResultFragment.TAG, "bindUpdateDevice onDeviceFound");
                }

                @Override // com.huawei.health.device.callback.IDeviceEventHandler
                public void onScanFailed(int i) {
                    LogUtil.a(HagridDeviceBindResultFragment.TAG, "bindUpdateDevice onScanFailed: ", Integer.valueOf(i));
                }

                @Override // com.huawei.health.device.callback.IDeviceEventHandler
                public void onStateChanged(int i) {
                    LogUtil.a(HagridDeviceBindResultFragment.TAG, "bindUpdateDevice success");
                    HagridDeviceBindResultFragment.this.unbindWifiDevice();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unbindWifiDevice() {
        eby ebyVarD;
        eby ebyVar = this.mRegisterDevice;
        if (ebyVar == null) {
            LogUtil.j(TAG, "enter unbindWifiDevice, mRegisterDevice is null");
            return;
        }
        String strE = ebyVar.e();
        if (strE != null && (ebyVarD = ecf.d(strE)) != null) {
            ebyVarD.doRemoveBond();
        }
        LogUtil.a(TAG, "enter unbindWifiDevice");
        new dxi().c(this.mRegisterDevice.e(), new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindResultFragment$$ExternalSyntheticLambda6
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                LogUtil.a(HagridDeviceBindResultFragment.TAG, "operationResult isSuccess ", Boolean.valueOf(z));
            }
        });
    }

    public static void setBindStatus(int i) {
        mBindStatus = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDestory() {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            LogUtil.j(TAG_RELEASE, "DeviceMainActivity is Destroyed");
            return true;
        }
        if (isAdded()) {
            return false;
        }
        LogUtil.j(TAG_RELEASE, "MyHandler mFragment is not add");
        return false;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a(TAG, "onCreate");
        this.mMyHandler = new MyHandler(this);
        this.mInteractors = ioi.d();
        this.mDeviceManager = DeviceRegisterManager.e(BaseApplication.getContext());
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a(TAG, "onCreateView");
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        this.child = layoutInflater.inflate(R.layout.hygride_device_wifi_bind_result_layout, viewGroup, false);
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.mCustomTitleBar);
            viewGroup2.addView(this.child);
        }
        initView();
        initData();
        initListener();
        updateStatus(mBindStatus);
        return viewGroup2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.mContext = activity;
        if (activity == null) {
            LogUtil.j(TAG_RELEASE, "onActivityCreated mContext== null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendConfigInfoForNew(Bundle bundle) {
        if (bundle == null) {
            LogUtil.j(TAG_RELEASE, "onActivityCreated varBundle == null");
            return;
        }
        RegisterInfo registerInfo = (RegisterInfo) bundle.getParcelable("device_register_verifycode");
        if (registerInfo == null) {
            LogUtil.j(TAG_RELEASE, "onActivityCreated entity is null");
            return;
        }
        this.mDeviceId = registerInfo.getDevId();
        HashMap map = new HashMap(16);
        map.put("ssid", this.mSsid);
        map.put(WebDataBaseColumns.EntryColumns.COLUMN_NAME_USERPASS, this.mSsidPwd);
        map.put("devId", registerInfo.getDevId());
        map.put("psk", registerInfo.getPsk());
        map.put("code", registerInfo.getVerifyCode());
        String strC = dxv.c(true);
        String strC2 = dxv.c(false);
        String strB = dxv.b();
        map.put("cloudPrimaryUrl", strC);
        map.put("cloudStandbyUrl", strC2);
        map.put("cloudUrl", strB);
        LogUtil.a(TAG, "sendConfigInfo ssid=", dyg.b(this.mSsid), ", ssidPwd=", dyg.b(this.mSsidPwd), ", cloudPrimaryUrl=", strC, ", cloudStandbyUrl=", strC2, ", cloudUrl=", strB);
        String json = new Gson().toJson(map);
        Bundle bundle2 = new Bundle();
        bundle2.putString("configjson", json);
        EventBus.a(new EventBus.d("send_config_info_hag_2021", bundle2));
        startEstimatingBindProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getVerifyCodeSuccess(Bundle bundle) {
        if (bundle == null) {
            LogUtil.j(TAG_RELEASE, "onActivityCreated varBundle == null");
            return;
        }
        RegisterInfo registerInfo = (RegisterInfo) bundle.getParcelable("device_register_verifycode");
        if (registerInfo == null) {
            LogUtil.j(TAG_RELEASE, "onActivityCreated entity is null");
            return;
        }
        ebi ebiVar = new ebi();
        ebiVar.d(registerInfo.getDevId());
        ebiVar.c(registerInfo.getVerifyCode());
        ebiVar.e(dxv.b());
        ebiVar.a(registerInfo.getPsk());
        this.mDeviceId = ebiVar.e();
        Bundle bundle2 = new Bundle();
        if (TextUtils.isEmpty(this.mSsid)) {
            this.mSsid = getWlanInfoByKey("outhName");
        }
        if (TextUtils.isEmpty(this.mSsidPwd)) {
            this.mSsidPwd = getWlanInfoByKey("outhPd");
        }
        bundle2.putString("ssid", this.mSsid);
        bundle2.putString("pwd", this.mSsidPwd);
        bundle2.putInt("encryptMode", 100);
        bundle2.putString("deviceSsid", this.mDeviceSsid);
        bundle2.putString("registerMsg", new Gson().toJson(ebiVar, ebi.class));
        LogUtil.a(TAG, "getVerifyCodeSuccess publish EVEBUS_SEND_CONFIG_INFO");
        EventBus.a(new EventBus.d("send_config_info", bundle2));
        startEstimatingBindProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSetManagerInfo() {
        Bundle bundle = new Bundle();
        bundle.putString("huid", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        bundle.putString("deviceId", this.mDeviceId);
        UpApi upApi = new UpApi(this.mContext);
        if (dxm.u(this.mProductId)) {
            bundle.putString("accountInfo", upApi.getCurrentUserAccount());
        }
        LogUtil.a(TAG, "sendSetManagerInfo publish EVEBUS_SET_MANAGER_INFO");
        EventBus.a(new EventBus.d("set_manager_info", bundle));
        this.mRegisterDevice.setProductId(this.mProductId);
        MeasurableDevice measurableDeviceB = dmp.d().b(this.mDeviceIdentify, true);
        if (measurableDeviceB == null) {
            LogUtil.j(TAG_RELEASE, "healthBondedDevice null.");
            this.mMyHandler.sendEmptyMessage(1004);
            return;
        }
        String uniqueId = measurableDeviceB.getUniqueId();
        this.deviceAddress = uniqueId;
        this.mRegisterDevice.d(uniqueId);
        this.mRegisterDevice.setKind(HealthDevice.HealthDeviceKind.HDK_WEIGHT);
        LogUtil.a(TAG, "sendSetManagerInfo setSource CURRENT_USER_DEVICE");
        this.mRegisterDevice.a().b(1);
    }

    private void registerDeviceSuccess(eby ebyVar) {
        LogUtil.a(TAG, "registerDeviceSuccess enter");
        if (ebyVar == null) {
            LogUtil.j(TAG, "registerDeviceSuccess wifiDevice is null");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1006;
        messageObtain.obj = true;
        this.mMainHandler.sendMessage(messageObtain);
        updateWifiDevice(ebyVar);
    }

    private void updateWifiDevice(eby ebyVar) {
        dmp.d().b(this.mProductId, this.mProductInfo.q(), ebyVar, new IDeviceEventHandler() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindResultFragment.4
            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onDeviceFound(HealthDevice healthDevice) {
                LogUtil.a(HagridDeviceBindResultFragment.TAG, "updateWifiDevice onDeviceFound");
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onScanFailed(int i) {
                LogUtil.a(HagridDeviceBindResultFragment.TAG, "updateWifiDevice onScanFailed code: ", Integer.valueOf(i));
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onStateChanged(int i) {
                LogUtil.a(HagridDeviceBindResultFragment.TAG, "bindDevice onStateChanged code: ", Integer.valueOf(i));
                if (i == 7) {
                    HagridDeviceBindResultFragment.this.mMyHandler.sendEmptyMessageDelayed(1003, 2000L);
                } else if (i == 8) {
                    HagridDeviceBindResultFragment.this.mMyHandler.sendEmptyMessage(1004);
                } else {
                    LogUtil.j(HagridDeviceBindResultFragment.TAG_RELEASE, "bindDevice onStateChanged not passed or failed");
                }
            }
        });
    }

    private void initView() {
        this.mGuideImg = (ImageView) qsp.a(this.child, R.id.pair_result_guide_img);
        this.mGuideSuccessImg = (FrameLayout) qsp.a(this.child, R.id.pair_result_device_progress_img);
        this.mBindGuideLayout = (LinearLayout) qsp.a(this.child, R.id.id_device_bind_guide_layout);
        this.mBindWifiGuideDes = (HealthTextView) qsp.a(this.child, R.id.id_device_bind_guide_des);
        this.mBindGuideBottom = (LinearLayout) qsp.a(this.child, R.id.id_device_bind_guide_bottom);
        this.mBindSuccessLayout = (LinearLayout) qsp.a(this.child, R.id.id_device_bind_success_layout);
        this.mBindSuccessText = (HealthTextView) qsp.a(this.child, R.id.id_device_bind_success_txt);
        this.mBindProgressText = (HealthTextView) qsp.a(this.child, R.id.id_device_bind_progress);
        this.mBindSucessDes = (HealthTextView) qsp.a(this.child, R.id.id_device_bind_success_des);
        this.mBindPercentSign = (HealthTextView) qsp.a(this.child, R.id.id_device_bind_percent_sign);
        this.mBindSuccessLayoutBottom = (LinearLayout) qsp.a(this.child, R.id.id_device_bind_success_ll);
        this.mBindDeviceProgressLayout = (LinearLayout) qsp.a(this.child, R.id.id_device_bind_progress_ll);
        this.mBindSuccessButton = (HealthButton) qsp.a(this.child, R.id.id_device_bind_success_button);
        this.mBindFinishButton = (HealthButton) qsp.a(this.child, R.id.id_device_bind_finish_button);
        this.mBindCancelButton = (HealthButton) qsp.a(this.child, R.id.id_device_not_config_wifi_interim_button);
        this.mBindNextBottom = (LinearLayout) qsp.a(this.child, R.id.id_btn_go_next_ll);
        this.mBindGoText = (HealthTextView) qsp.a(this.child, R.id.wifi_device_bind_next_text);
        this.mBindCancel = (LinearLayout) qsp.a(this.child, R.id.id_btn_bind_cancel_ll);
        this.mBindCancelText = (HealthTextView) qsp.a(this.child, R.id.wifi_device_bind_fail_next_text);
        this.mNextImage = (ImageView) qsp.a(this.child, R.id.wifi_device_bind_retry_img);
        this.mCancelImage = (ImageView) qsp.a(this.child, R.id.wifi_binde_device_next_img);
        ImageView imageView = (ImageView) qsp.a(this.child, R.id.device_pair_guide_progress_anim);
        this.mAnimationView = imageView;
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            this.mAnimation = (AnimationDrawable) this.mAnimationView.getDrawable();
        } else {
            LogUtil.j(TAG, "mAnimationView.getDrawable() not instanceof AnimationDrawable");
        }
        this.mBackgroundImg = (ImageView) qsp.a(this.child, R.id.pair_result_device_img);
        this.mBindResultDeviceLayout = (LinearLayout) qsp.a(this.child, R.id.pair_result_device_img_layout);
        this.mCustomTitleBar = (CustomTitleBar) this.child.findViewById(R.id.device_pair_guidance_title);
        this.mCustomTitleBar.setLeftButtonVisibility(8);
        this.mAutoUpgradeLayout = (LinearLayout) qsp.a(this.child, R.id.id_device_auto_upgrade_switch_layout);
        this.mAutoUpgradeSwitch = (HealthCheckBox) qsp.a(this.child, R.id.id_device_auto_upgrade_switch);
        this.mPairingWifiNameText = (HealthTextView) qsp.a(this.child, R.id.IDS_device_wifi_binding_wifi_name_tv);
        this.mReChooseLayout = (LinearLayout) this.child.findViewById(R.id.id_device_bind_rechoose_layout);
        this.mAutoUpgradeLayout.setVisibility(8);
        showCustomBarTitle(mBindStatus);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.mNextImage.setBackgroundResource(R.drawable.wifi_device_arrow_left);
            this.mCancelImage.setBackgroundResource(R.drawable.wifi_device_arrow_right);
        }
    }

    private void initData() {
        if (getArguments() != null) {
            boolean z = getArguments().getBoolean("isNfcConnect", false);
            this.mIsNfcConnect = z;
            LogUtil.a(TAG, "initData getBoolean mIsNfcConnect: ", Boolean.valueOf(z));
            ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
            this.mContentValues = contentValues;
            LogUtil.d(TAG, "HagridDeviceBindResultFragment initData deviceInfo: ", contentValues);
            ContentValues contentValues2 = this.mContentValues;
            if (contentValues2 != null) {
                this.mProductId = contentValues2.getAsString("productId");
                String asString = this.mContentValues.getAsString("uniqueId");
                this.mDeviceIdentify = asString;
                if (TextUtils.isEmpty(asString) || TextUtils.isEmpty(this.mProductId)) {
                    LogUtil.j(TAG, "initData : deviceIdentify or mProductId is empty");
                }
            }
            initBasicInfo();
        } else {
            LogUtil.j(TAG, "getArguments() is null");
        }
        this.mProductInfo = ResourceManager.c().d(this.mProductId);
        MeasurableDevice measurableDeviceB = dmp.d().b(this.mDeviceIdentify, false);
        if (measurableDeviceB == null) {
            LogUtil.j(TAG, "initData device is null");
        }
        if (measurableDeviceB instanceof eby) {
            eby ebyVar = (eby) measurableDeviceB;
            this.mWifiDevice = ebyVar;
            LogUtil.a(TAG, "initData mWifiDevice: ", CommonUtil.n(ebyVar.toString()));
        }
    }

    private void initBasicInfo() {
        if (TextUtils.isEmpty(this.mDeviceId)) {
            String wlanInfoByKey = getWlanInfoByKey("mDeviceId");
            this.mDeviceId = wlanInfoByKey;
            if (!TextUtils.isEmpty(wlanInfoByKey)) {
                this.mIsCreateSave = !this.mIsJumpFromWifiInfoConfirmFragment;
                setWlanInfoByKey("mDeviceId", "");
            }
            LogUtil.a(TAG, "initData : mDeviceId: ", CommonUtil.n(this.mDeviceId), ", isJumpFromWifiInfoConfirmFragment: ", Boolean.valueOf(this.mIsJumpFromWifiInfoConfirmFragment));
        }
        String string = getArguments().getString("outhName");
        this.mSsid = string;
        if (TextUtils.isEmpty(string)) {
            this.mSsid = getWlanInfoByKey("outhName");
        }
        String string2 = getArguments().getString("outhPd");
        this.mSsidPwd = string2;
        if (TextUtils.isEmpty(string2)) {
            this.mSsidPwd = getWlanInfoByKey("outhPd");
        }
        String string3 = getArguments().getString("deviceSsid");
        this.mDeviceSsid = string3;
        if (TextUtils.isEmpty(string3)) {
            this.mDeviceSsid = getWlanInfoByKey("deviceSsid");
        }
        String string4 = getArguments().getString("cloudDeviceId");
        this.mCloudDeviceId = string4;
        if (TextUtils.isEmpty(string4)) {
            this.mCloudDeviceId = getWlanInfoByKey("cloudDeviceId");
        }
        if ((dxm.ai(this.mProductId) || dxm.q(this.mProductId)) && mBindStatus == 8) {
            mBindStatus = 10;
        }
        LogUtil.a(TAG, "initData mSsid: ", CommonUtil.n(this.mSsid), " mSsidPwd: ", CommonUtil.n(this.mSsidPwd), " mDeviceSsid: ", CommonUtil.n(this.mDeviceSsid), " mCloudDeviceId: ", CommonUtil.n(this.mCloudDeviceId), " mBindStatus: ", Integer.valueOf(mBindStatus), " mDeviceIdentify: ", CommonUtil.n(this.mDeviceIdentify), " mProductId: ", CommonUtil.n(this.mProductId));
    }

    private void saveWlanInfo() {
        LogUtil.a(TAG, "enter saveWlanInfo");
        DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager = new DeviceCloudSharePreferencesManager(dxw.d());
        ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
        if (contentValues != null) {
            deviceCloudSharePreferencesManager.a("productId", contentValues.getAsString("productId"));
            deviceCloudSharePreferencesManager.a("uniqueId", contentValues.getAsString("uniqueId"));
        }
        LogUtil.a(TAG, "saveWlanInfo mDeviceSsid = ", this.mDeviceSsid);
        LogUtil.a(TAG, "saveWlanInfo getArguments().getString(HonourDeviceConstants.DEVICE_SSID) = ", getArguments().getString("deviceSsid"));
        deviceCloudSharePreferencesManager.a("outhName", getArguments().getString("outhName"));
        deviceCloudSharePreferencesManager.a("outhPd", getArguments().getString("outhPd"));
        deviceCloudSharePreferencesManager.a("deviceSsid", getArguments().getString("deviceSsid"));
        deviceCloudSharePreferencesManager.a("cloudDeviceId", getArguments().getString("cloudDeviceId"));
        deviceCloudSharePreferencesManager.a("mDeviceId", this.mDeviceId);
    }

    private String getWlanInfoByKey(String str) {
        DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager = new DeviceCloudSharePreferencesManager(dxw.d());
        LogUtil.a(TAG, "enter getWlanInfoByKey spFieldName: ", str, " spFieldValue: ", deviceCloudSharePreferencesManager.e(str));
        return deviceCloudSharePreferencesManager.e(str);
    }

    private void setWlanInfoByKey(String str, String str2) {
        LogUtil.a(TAG, "enter setWlanInfoByKey spFieldName is", str, " spFieldValue: ", str2);
        new DeviceCloudSharePreferencesManager(dxw.d()).a(str, str2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        LogUtil.a(TAG, "onSaveInstanceState");
        if (getArguments() != null) {
            LogUtil.a(TAG, "onSaveInstanceState getArguments() is not null");
            saveWlanInfo();
            if (this.mainActivity instanceof DeviceMainActivity) {
                ((DeviceMainActivity) this.mainActivity).b(false);
            }
        }
    }

    public void setJumpFromWifiInfoFragment(boolean z) {
        this.mIsJumpFromWifiInfoConfirmFragment = z;
    }

    private void showCustomBarTitle(int i) {
        LogUtil.a(TAG, "showCustomBarTitle bindStatus: ", Integer.valueOf(i));
        switch (i) {
            case 1:
            case 2:
            case 3:
                if (dxm.u(this.mProductId)) {
                    this.mCustomTitleBar.setTitleText(getResources().getString(R.string.IDS_device_wifi_config_network));
                } else {
                    this.mCustomTitleBar.setTitleText(getResources().getString(R.string.IDS_device_mgr_device_pair_guide_note));
                }
                break;
            case 4:
            default:
                LogUtil.j(TAG_RELEASE, "showCustomBarTitle viewType unknown");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.mCustomTitleBar.setTitleText(getResources().getString(R.string.IDS_device_wifi_config_network));
                break;
        }
    }

    private void initListener() {
        this.mBindSuccessButton.setOnClickListener(this);
        this.mBindNextBottom.setOnClickListener(this);
        this.mBindCancel.setOnClickListener(this);
        this.mBindCancelButton.setOnClickListener(this);
        this.mBindFinishButton.setOnClickListener(this);
    }

    private void startEstimatingBindProgress() {
        LogUtil.a(TAG, "Into startEstimatingBindProgress()");
        this.mStartBindTime = System.currentTimeMillis();
        Message messageObtain = Message.obtain();
        messageObtain.what = 1006;
        messageObtain.obj = false;
        this.mMainHandler.sendMessageDelayed(messageObtain, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateEstimatingBindProgress(boolean z) {
        int iCurrentTimeMillis = (int) ((((System.currentTimeMillis() - this.mStartBindTime) - C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) * 100) / 45000);
        if (iCurrentTimeMillis < 0) {
            iCurrentTimeMillis = 0;
        }
        if (z) {
            this.mMainHandler.removeMessages(1006);
            this.mBindProgressText.setText(UnitUtil.e(100.0d, 1, 0));
        } else {
            if (iCurrentTimeMillis < 100) {
                this.mBindProgressText.setText(UnitUtil.e(iCurrentTimeMillis, 1, 0));
                Message messageObtain = Message.obtain();
                messageObtain.what = 1006;
                messageObtain.obj = false;
                this.mMainHandler.sendMessageDelayed(messageObtain, 500L);
                return;
            }
            LogUtil.a(TAG_RELEASE, "updateEstimatingBindProgress waiting for completion");
        }
    }

    private void gotoWiFiInfoDevice() {
        LogUtil.a(TAG, "gotoWiFiInfoDevice mProductId: ", this.mProductId);
        ecp.c().a();
        if (Build.VERSION.SDK_INT < 28) {
            ecs.o(this.mainActivity);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("commonDeviceInfo", this.mContentValues);
        bundle.putString("productId", this.mProductId);
        bundle.putString("deviceSsid", this.mDeviceSsid);
        bundle.putBoolean(HagridWiFiInfoConfirmFragment.KEY_SHOW_GUIDE, true);
        bundle.putParcelable("commonDeviceInfo", getContentValues());
        HagridWiFiInfoConfirmFragment hagridWiFiInfoConfirmFragment = new HagridWiFiInfoConfirmFragment();
        hagridWiFiInfoConfirmFragment.setArguments(bundle);
        switchFragment(hagridWiFiInfoConfirmFragment);
    }

    private boolean checkWiFiIsOpen() {
        if (ecs.e(this.mainActivity)) {
            return true;
        }
        LogUtil.a(TAG_RELEASE, "checkWiFiIsOpen checkWifiStatus false");
        dys.a().e((Context) this.mainActivity, new ScaleDialogCallback() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindResultFragment$$ExternalSyntheticLambda2
            @Override // com.huawei.health.device.callback.ScaleDialogCallback
            public final void operationResult(int i) {
                this.f$0.m840x2ce7e772(i);
            }
        });
        return false;
    }

    /* JADX INFO: renamed from: lambda$checkWiFiIsOpen$2$com-huawei-health-device-ui-measure-fragment-HagridDeviceBindResultFragment, reason: not valid java name */
    /* synthetic */ void m840x2ce7e772(int i) {
        LogUtil.a(TAG_RELEASE, "showWifiSwitchEnableDialog result: ", Integer.valueOf(i));
        if (i != 0) {
            LogUtil.a(TAG, "showWifiSwitchEnableDialog do nothing");
            return;
        }
        if (((WifiManager) this.mainActivity.getSystemService("wifi")).setWifiEnabled(true)) {
            LogUtil.a(TAG, "showWifiSwitchEnableDialog gotoWiFiInfoDevice");
            if (checkGpsIsOpen()) {
                gotoWiFiInfoDevice();
                return;
            }
            return;
        }
        ecs.l(this.mainActivity);
    }

    private boolean checkGpsIsOpen() {
        if (ecj.e(this.mainActivity, (LocationManager) this.mainActivity.getSystemService("location"))) {
            return true;
        }
        LogUtil.a(TAG_RELEASE, "checkGpsIsOpen: gps service is not open");
        dys.a().c(this.mainActivity);
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        LogUtil.a(TAG, "onclick ID: ", Integer.valueOf(id), " bind status: ", Integer.valueOf(mBindStatus));
        if (id == R.id.id_device_bind_success_button) {
            gotoDeviceManagerPage();
            return;
        }
        if (id == R.id.id_btn_go_next_ll) {
            LogUtil.a(TAG, "onclick retry");
            goNext();
            return;
        }
        if (id == R.id.id_device_bind_finish_button) {
            LogUtil.a(TAG, "onclick finish");
            goNext();
        } else if (id == R.id.id_btn_bind_cancel_ll) {
            LogUtil.a(TAG, "onclick cancel");
            goCancel();
        } else if (id == R.id.id_device_not_config_wifi_interim_button) {
            goCancel();
        } else {
            LogUtil.j(TAG_RELEASE, "onClick click id unknown");
        }
    }

    private void goNext() {
        LogUtil.a(TAG, "goNext mBindStatus: ", Integer.valueOf(mBindStatus));
        switch (mBindStatus) {
            case 1:
            case 2:
            case 3:
                BaseFragment hagridDeviceBindGuidFragment = getSelectFragment(HagridDeviceBindGuidFragment.class) instanceof BaseFragment ? (BaseFragment) getSelectFragment(HagridDeviceBindGuidFragment.class) : null;
                if (hagridDeviceBindGuidFragment == null) {
                    hagridDeviceBindGuidFragment = new HagridDeviceBindGuidFragment();
                }
                Bundle bundle = new Bundle();
                bundle.putString("productId", this.mProductId);
                bundle.putParcelable("commonDeviceInfo", getContentValues());
                hagridDeviceBindGuidFragment.setArguments(bundle);
                popupFragment(HagridDeviceBindGuidFragment.class);
                switchFragment((Fragment) null, hagridDeviceBindGuidFragment);
                break;
            case 4:
            default:
                LogUtil.j(TAG, "goNext else");
                break;
            case 5:
                chooseShowOpenNoticeBarMsgSwitchDialog();
                break;
            case 6:
                if (dyn.a().e(this.mContext, dti.c(getActivity(), this.mProductId))) {
                    gotoWiFiInfoDevice();
                } else {
                    LogUtil.j(TAG, "onClickBind go retry, device is disconnect");
                }
                break;
            case 7:
                LogUtil.a(TAG, "onClickBind goNext, HonourDeviceConstants.VIEW_TYPE_WLAN_WAITING_HYGRIDE");
                break;
            case 8:
                showOuthDialog();
                break;
            case 9:
            case 10:
                jumpToCompUserInfo();
                break;
            case 11:
                gotoDeivePairFragment();
                break;
        }
    }

    private void chooseShowOpenNoticeBarMsgSwitchDialog() {
        this.mFragmentHelper.e(this.mContext, new IBaseResponseCallback() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindResultFragment$$ExternalSyntheticLambda3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m841x8a4f4b9c(i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$chooseShowOpenNoticeBarMsgSwitchDialog$3$com-huawei-health-device-ui-measure-fragment-HagridDeviceBindResultFragment, reason: not valid java name */
    /* synthetic */ void m841x8a4f4b9c(int i, Object obj) {
        LogUtil.a(TAG, "chooseShowOpenNoticeBarMsgSwitchDialog: onResponse errCode: ", Integer.valueOf(i));
        gotoMainUserDeviceWlanUseGuideFragment();
    }

    private void gotoDeivePairFragment() {
        ICloudOperationResult<CloudCommonReponse> iCloudOperationResult = new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindResultFragment$$ExternalSyntheticLambda8
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                HagridDeviceBindResultFragment.lambda$gotoDeivePairFragment$4((CloudCommonReponse) obj, str, z);
            }
        };
        MeasurableDevice measurableDeviceB = dmp.d().b(this.mDeviceIdentify, false);
        if (measurableDeviceB instanceof eby) {
            this.mDeviceId = ((eby) measurableDeviceB).e();
        } else {
            LogUtil.j(TAG_RELEASE, "HagridDeviceBindResultFragment unbind wifi device error");
        }
        this.mFragmentHelper.c(this.mDeviceId, iCloudOperationResult);
        this.mFragmentHelper.a(this.mContentValues, (eby) measurableDeviceB, this.mProductInfo);
        this.mMyHandler.postDelayed(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindResultFragment$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m844xbb012722();
            }
        }, 200L);
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.mProductId);
        bundle.putParcelable("commonDeviceInfo", this.mContentValues);
        bundle.putParcelable("commonDeviceInfo", getContentValues());
        ProductIntroductionFragment productIntroductionFragment = new ProductIntroductionFragment();
        productIntroductionFragment.setArguments(bundle);
        switchFragment(productIntroductionFragment);
    }

    static /* synthetic */ void lambda$gotoDeivePairFragment$4(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        int iIntValue;
        String resultDesc;
        LogUtil.a(TAG, "onClickUnBind: ", Boolean.valueOf(z));
        if (z) {
            LogUtil.j(TAG, "HagrideDeviceBindResultFragment unbind wifi device success");
            return;
        }
        if (cloudCommonReponse == null) {
            iIntValue = Constants.CODE_UNKNOWN_ERROR;
            resultDesc = "unknown error";
        } else {
            iIntValue = cloudCommonReponse.getResultCode().intValue();
            resultDesc = cloudCommonReponse.getResultDesc();
        }
        LogUtil.j(TAG, " onClickUnBind error: ", Integer.valueOf(iIntValue), " resultDesc: ", resultDesc);
    }

    /* JADX INFO: renamed from: lambda$gotoDeivePairFragment$5$com-huawei-health-device-ui-measure-fragment-HagridDeviceBindResultFragment, reason: not valid java name */
    /* synthetic */ void m844xbb012722() {
        qpx.e(this.mainActivity, R.string.IDS_device_scale_unpair_success);
    }

    private void goCancel() {
        LogUtil.a(TAG, "goCancel mBindStatus: ", Integer.valueOf(mBindStatus));
        int i = mBindStatus;
        if (i == 3 || i == 2 || i == 1) {
            dxi.e(this.mProductId, this.mDeviceIdentify);
            BaseFragment productIntroductionFragment = getSelectFragment(HagridDeviceBindGuidFragment.class) instanceof BaseFragment ? (BaseFragment) getSelectFragment(ProductIntroductionFragment.class) : null;
            if (productIntroductionFragment == null) {
                productIntroductionFragment = new ProductIntroductionFragment();
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("commonDeviceInfo", getContentValues());
            productIntroductionFragment.setArguments(bundle);
            popupFragment(ProductIntroductionFragment.class);
            switchFragment((Fragment) null, productIntroductionFragment);
            return;
        }
        if (i == 8) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1000;
            this.mMyHandler.sendMessage(messageObtain);
            return;
        }
        if (i == 6) {
            gotoDeviceManagerPage();
            return;
        }
        if (i == 7) {
            onBackPressed();
            return;
        }
        if (i == 11) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("productId", this.mProductId);
            bundle2.putParcelable("commonDeviceInfo", this.mContentValues);
            bundle2.putBoolean("isNfcConnect", this.mIsNfcConnect);
            LogUtil.a(TAG, "goCancel bind fail putBoolean mIsNfcConnect: ", Boolean.valueOf(this.mIsNfcConnect));
            HagridDeviceManagerFragment hagridDeviceManagerFragment = new HagridDeviceManagerFragment();
            hagridDeviceManagerFragment.setArguments(bundle2);
            switchFragment((Fragment) null, hagridDeviceManagerFragment);
            return;
        }
        LogUtil.j(TAG, "goCancel mBindStatus else");
    }

    private ContentValues getContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", this.mDeviceIdentify);
        contentValues.put("productId", this.mProductId);
        return contentValues;
    }

    private void jumpToCompUserInfo() {
        if (!CommonUtil.ab(this.mContext)) {
            qpx.e(this.mContext, R.string.IDS_network_connect_error);
        } else if (dxm.y(this.mProductId)) {
            showLoadingDialog(getString(R.string.IDS_qrcode_wait_dialog_msg));
            getDeviceRegistration();
        } else {
            gotoUserInfo(true);
        }
    }

    private void showLoadingDialog(String str) {
        if (this.mLoadingDialog == null) {
            new CommonDialog21(getActivity(), R.style.app_update_dialogActivity);
            CommonDialog21 commonDialog21B = CommonDialog21.b(getActivity());
            this.mLoadingDialog = commonDialog21B;
            commonDialog21B.b(str);
            this.mLoadingDialog.c();
            this.mLoadingDialog.setCancelable(false);
            return;
        }
        LogUtil.a(TAG, "showLoadingDialog: mLoadingDialog is not null");
    }

    private void getDeviceRegistration() {
        WifiDeviceGetDeviceRegistration wifiDeviceGetDeviceRegistration = new WifiDeviceGetDeviceRegistration();
        wifiDeviceGetDeviceRegistration.setProductId(dxm.h.get(this.mProductId).intValue());
        wifiDeviceGetDeviceRegistration.setUniqueId(dxm.l(this.mDeviceIdentify));
        lqo.b(this.mContext).a(wifiDeviceGetDeviceRegistration, new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindResultFragment$$ExternalSyntheticLambda5
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f$0.m843xbba73f0a((CloudCommonReponse) obj, str, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getDeviceRegistration$6$com-huawei-health-device-ui-measure-fragment-HagridDeviceBindResultFragment, reason: not valid java name */
    /* synthetic */ void m843xbba73f0a(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        if (z) {
            if (((Integer) ((Map) new Gson().fromJson(str, new TypeToken<Map<String, Integer>>() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindResultFragment.5
            }.getType())).get("status")).intValue() != 1) {
                LogUtil.a(TAG, "device not registration,goto subuser userinfo");
                gotoUserInfo(false);
                return;
            } else {
                LogUtil.a(TAG, "status is registration,goto user info");
                gotoUserInfo(true);
                return;
            }
        }
        if (cloudCommonReponse != null && cloudCommonReponse.getResultCode().intValue() == CLOUD_DEVICE_NOT_FIND_CODE) {
            LogUtil.a(TAG, "getDeviceRegistration device cloud not find this device");
            gotoUserInfo(false);
        } else {
            gotoUserInfo(true);
            LogUtil.a(TAG, "getDeviceRegistration fail,goto sub user user info");
        }
    }

    private void destroyLoadingDialog() {
        CommonDialog21 commonDialog21 = this.mLoadingDialog;
        if (commonDialog21 == null || !commonDialog21.isShowing()) {
            return;
        }
        this.mLoadingDialog.dismiss();
        this.mLoadingDialog = null;
    }

    private void gotoUserInfo(boolean z) {
        destroyLoadingDialog();
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        if (z) {
            z = arguments.getBoolean("hasManager", true);
        }
        Intent intentData = getIntentData(arguments, z);
        saveDeviceManagerStatus(z);
        if (!isAdded() || isDetached()) {
            LogUtil.j(TAG, "gotoUserInfo, !isAdded() || isDetached()");
            return;
        }
        try {
            getContext().startActivity(intentData);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e(TAG, "gotoUserInfo startActivity ActivityNotFoundException occur.");
        }
        if (this.mainActivity == null || this.mainActivity.isFinishing() || this.mainActivity.isDestroyed()) {
            LogUtil.j(TAG, "gotoUserInfo, mainActivity is null or isFinishing or isDestroyed");
            return;
        }
        if (this.mainActivity instanceof DeviceMainActivity) {
            ((DeviceMainActivity) this.mainActivity).b(false);
        }
        this.mainActivity.finish();
    }

    private Intent getIntentData(Bundle bundle, boolean z) {
        Intent intent = new Intent();
        float f = bundle.getFloat("deviceWeight");
        String str = bundle.get("deviceSsid") instanceof String ? (String) bundle.get("deviceSsid") : null;
        try {
            intent.putExtra("mainHuid", bundle.getByteArray("mainHuid"));
        } catch (ArrayIndexOutOfBoundsException unused) {
            LogUtil.e(TAG, "jumpToCompUserInfo ArrayIndexOutOfBoundsException");
        }
        intent.putExtra("device", "wifi");
        intent.putExtra("deviceWeight", f);
        intent.putExtra("productId", this.mProductId);
        intent.putExtra("commonDeviceInfo", this.mContentValues);
        intent.putExtra("isBleScale", true);
        if (dxm.ai(this.mProductId) || dxm.q(this.mProductId)) {
            intent.putExtra("goto", "devicebind");
        } else {
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("deviceSsid", str);
            }
            intent.putExtra("auth_device_id", this.mProductId);
            intent.putExtra("hasManager", z);
            intent.putExtra("cloudDeviceId", this.mCloudDeviceId);
        }
        intent.putExtra("config_mode", 5);
        if (bundle.get("deviceResis") instanceof dso) {
            intent.putExtra("deviceResis", (dso) bundle.get("deviceResis"));
        }
        intent.putExtra("accountInfo", this.mAccountInfo);
        intent.putExtra("isNfcConnect", this.mIsNfcConnect);
        LogUtil.a(TAG, "gotoUserInfo put isNfcConnect is ", Boolean.valueOf(this.mIsNfcConnect));
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.ui.main.stories.me.activity.BindUserInfoActivity");
        return intent;
    }

    private void saveDeviceManagerStatus(boolean z) {
        DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager = new DeviceCloudSharePreferencesManager(dxw.d());
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("device_has_manager");
        stringBuffer.append(this.mDeviceIdentify);
        deviceCloudSharePreferencesManager.c(stringBuffer.toString(), z);
    }

    private void showOuthDialog() {
        View viewInflate = View.inflate(this.mContext, R.layout.dialog_user_auth_message, null);
        dxv.c(viewInflate, this.mContext, isShowOuthDialog(), isShowPersonalDialog());
        eqw.e(this.mContext, viewInflate, new IBaseResponseCallback() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindResultFragment$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m846x1a24799f(i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showOuthDialog$7$com-huawei-health-device-ui-measure-fragment-HagridDeviceBindResultFragment, reason: not valid java name */
    /* synthetic */ void m846x1a24799f(int i, Object obj) {
        LogUtil.a(TAG, "showOuthDialog, onResponse errCode=", Integer.valueOf(i));
        if (i == 0) {
            if (!this.mIsHealthDataStatus) {
                this.mInteractors.e(7, true, TAG, null);
            }
            if (!this.mIsPersonalInfoStatus) {
                this.mInteractors.e(2, true, TAG, null);
            }
            if (checkWiFiIsOpen()) {
                if (checkGpsIsOpen()) {
                    LogUtil.a(TAG, "showOuthDialog() goto wifi config page");
                    gotoWiFiInfoDevice();
                    return;
                }
                return;
            }
            LogUtil.j(TAG, "showOuthDialog wlan is not open");
        }
    }

    private boolean isShowOuthDialog() {
        return getDataStatus() && Utils.h();
    }

    private boolean isShowPersonalDialog() {
        return gePersonalInfoStatus() && Utils.h();
    }

    private boolean gePersonalInfoStatus() {
        if ("true".equals(this.mInteractors.c(2))) {
            this.mIsPersonalInfoStatus = true;
        } else {
            this.mIsPersonalInfoStatus = false;
        }
        return !this.mIsPersonalInfoStatus;
    }

    private boolean getDataStatus() {
        if ("true".equals(this.mInteractors.c(7))) {
            this.mIsHealthDataStatus = true;
        } else {
            this.mIsHealthDataStatus = false;
        }
        return !this.mIsHealthDataStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gotoDeviceManagerPage() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("commonDeviceInfo", this.mContentValues);
        bundle.putString("productId", this.mProductId);
        bundle.putString("goto", "devicebind");
        bundle.putBoolean("isNfcConnect", this.mIsNfcConnect);
        LogUtil.a(TAG, "gotoDeviceManagerPage putBoolean mIsNfcConnect: ", Boolean.valueOf(this.mIsNfcConnect));
        dxi.e(this.mProductId, this.mDeviceIdentify);
        boolean zB = drk.b(this.mDeviceIdentify, 39);
        LogUtil.a(TAG, "support prompt handle measure : ", Boolean.valueOf(zB));
        if (zB) {
            HagridDeviceWlanUseGuideFragment hagridDeviceWlanUseGuideFragment = new HagridDeviceWlanUseGuideFragment();
            bundle.putString("uniqueId", this.mDeviceIdentify);
            bundle.putInt(ParamConstants.Param.VIEW_TYPE, 14);
            switchFragment((Fragment) null, hagridDeviceWlanUseGuideFragment);
            hagridDeviceWlanUseGuideFragment.setArguments(bundle);
        } else {
            if (getSelectFragment(HagridDeviceManagerFragment.class) != null) {
                popupFragment(HagridDeviceManagerFragment.class);
            }
            HagridDeviceManagerFragment hagridDeviceManagerFragment = new HagridDeviceManagerFragment();
            switchFragment((Fragment) null, hagridDeviceManagerFragment);
            hagridDeviceManagerFragment.setArguments(bundle);
        }
        this.mMyHandler.removeMessages(1007);
    }

    private void gotoMainUserDeviceWlanUseGuideFragment() {
        LogUtil.a(TAG, "gotoMainUserDeviceWlanUseGuideFragment");
        Bundle bundle = new Bundle();
        bundle.putParcelable("commonDeviceInfo", this.mContentValues);
        bundle.putInt(ParamConstants.Param.VIEW_TYPE, 15);
        bundle.putBoolean("isNfcConnect", this.mIsNfcConnect);
        LogUtil.a(TAG, "gotoMainUserDeviceWlanUseGuideFragment put isNfcConnect is ", Boolean.valueOf(this.mIsNfcConnect));
        Fragment selectFragment = getSelectFragment(HagridDeviceWlanUseGuideFragment.class);
        BaseFragment hagridDeviceWlanUseGuideFragment = selectFragment instanceof BaseFragment ? (BaseFragment) selectFragment : null;
        if (!(hagridDeviceWlanUseGuideFragment instanceof HagridDeviceWlanUseGuideFragment)) {
            hagridDeviceWlanUseGuideFragment = new HagridDeviceWlanUseGuideFragment();
        }
        hagridDeviceWlanUseGuideFragment.setArguments(bundle);
        switchFragment(hagridDeviceWlanUseGuideFragment);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        LogUtil.a(TAG, BaseDialog.LIFE_CYCLE_ON_RESUME);
        super.onResume();
    }

    private String spliceZipText(ArrayList<elh.c> arrayList, int i, int i2) {
        StringBuilder sb = new StringBuilder(16);
        while (i < i2) {
            String strC = eru.c(arrayList, this.mProductId, i);
            if (!TextUtils.isEmpty(strC)) {
                sb.append(strC);
                if (i != i2 - 1) {
                    sb.append(System.lineSeparator());
                }
            }
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateStatus(int i) {
        this.mAnimationView.setVisibility(8);
        this.mBindDeviceProgressLayout.setVisibility(8);
        this.mAutoUpgradeLayout.setVisibility(8);
        AnimationDrawable animationDrawable = this.mAnimation;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
        LogUtil.a(TAG, "updateStatus viewType:", Integer.valueOf(i));
        switch (i) {
            case 1:
            case 3:
                showBleFailView();
                break;
            case 2:
                showScanFailView();
                break;
            case 5:
                this.mReChooseLayout.setVisibility(8);
                showWlanSuccessView();
                break;
            case 6:
                this.mReChooseLayout.setVisibility(8);
                showWlanFailView();
                break;
            case 7:
                this.mReChooseLayout.setVisibility(0);
                showWlanWaitingView();
                break;
            case 8:
                showWlanGuideView();
                break;
            case 9:
                showPairSuccessView(true);
                getDeviceManagerInfo();
                break;
            case 10:
                showPairSuccessView(false);
                break;
            case 11:
                this.mReChooseLayout.setVisibility(8);
                showDeviceCheckFailView();
                break;
        }
    }

    private void showWlanGuideView() {
        LogUtil.a(TAG, "showWlanGuideView enter");
        this.mBindGuideBottom.setVisibility(0);
        this.mBindSuccessLayout.setVisibility(8);
        this.mBindGuideLayout.setVisibility(0);
        this.mBindCancel.setVisibility(4);
        this.mBindCancelButton.setVisibility(0);
        elh elhVar = this.mProductInfo;
        if (elhVar != null) {
            setBindImageBitmap(this.mGuideImg, elhVar.aa(), 0);
            String strC = eru.c(this.mProductInfo.aa(), this.mProductId, 1);
            if (LanguageUtil.x(BaseApplication.getContext())) {
                this.mBindWifiGuideDes.setText("\u200f" + strC);
                return;
            }
            this.mBindWifiGuideDes.setText(strC);
            return;
        }
        LogUtil.j(TAG, "updateStatus mProductInfo is null");
    }

    private void getDeviceManagerInfo() {
        if (this.mDeviceManagerInfoHandler == null) {
            this.mDeviceManagerInfoHandler = new DeviceManagerInfoHandler();
        }
        this.mDeviceManagerInfoHandler.b(new DeviceManagerInfoHandler.GetManagerAccountInfoListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindResultFragment$$ExternalSyntheticLambda1
            @Override // com.huawei.health.device.ui.util.DeviceManagerInfoHandler.GetManagerAccountInfoListener
            public final void managerAccountInfo(String str) {
                this.f$0.m842x3620e3d0(str);
            }
        });
        this.mDeviceManagerInfoHandler.b();
    }

    /* JADX INFO: renamed from: lambda$getDeviceManagerInfo$8$com-huawei-health-device-ui-measure-fragment-HagridDeviceBindResultFragment, reason: not valid java name */
    /* synthetic */ void m842x3620e3d0(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.mAccountInfo = str;
    }

    private void showPairSuccessView(boolean z) {
        if (z) {
            setTitle(getResources().getString(R.string.IDS_blite_guide_paire_completed));
        } else {
            setTitle(getResources().getString(R.string.IDS_device_mgr_device_pair_guide_note));
            this.mBindSuccessButton.setText(getResources().getString(R.string.IDS_device_hygride_wlan_done));
        }
        this.mGuideImg.setVisibility(8);
        this.mBindGuideLayout.setVisibility(8);
        this.mBindGuideBottom.setVisibility(8);
        this.mGuideSuccessImg.setVisibility(0);
        this.mBindSuccessLayout.setVisibility(0);
        if (dxm.ag(this.mProductId)) {
            this.mBindGoText.setText(R.string.IDS_device_show_next);
            this.mBindCancel.setVisibility(8);
            this.mBindGuideBottom.setVisibility(0);
        } else {
            this.mBindSuccessLayoutBottom.setVisibility(0);
        }
        elh elhVar = this.mProductInfo;
        if (elhVar != null) {
            String strC = eru.c(elhVar.c(), this.mProductId, 4);
            if (LanguageUtil.z(BaseApplication.getContext())) {
                this.mBindSuccessText.setText("\u200f" + strC);
            } else {
                this.mBindSuccessText.setText(strC);
            }
            setBindImageBitmap(this.mBackgroundImg, this.mProductInfo.c(), 4);
            return;
        }
        LogUtil.j(TAG, "showPairSuccessView mProductInfo is null");
    }

    private void showScanFailView() {
        resultFailView();
        setTitle(getResources().getString(R.string.IDS_device_mgr_device_pair_guide_note));
        elh elhVar = this.mProductInfo;
        if (elhVar != null) {
            setBindImageBitmap(this.mBackgroundImg, elhVar.c(), 10);
            this.mBindSuccessText.setText(eru.c(this.mProductInfo.c(), this.mProductId, 10));
            this.mBindSucessDes.setText(spliceZipText(this.mProductInfo.c(), 11, this.mProductInfo.c().size()));
            this.mBindSucessDes.setVisibility(0);
            return;
        }
        LogUtil.j(TAG, "showScanFailView mProductInfo is null");
    }

    private void showBleFailView() {
        resultFailView();
        setTitle(getResources().getString(R.string.IDS_device_mgr_device_pair_guide_note));
        elh elhVar = this.mProductInfo;
        if (elhVar != null) {
            setBindImageBitmap(this.mBackgroundImg, elhVar.c(), 5);
            this.mBindSuccessText.setText(eru.c(this.mProductInfo.c(), this.mProductId, 5));
            this.mBindSucessDes.setText(spliceZipText(this.mProductInfo.c(), 6, 10));
            this.mBindSucessDes.setVisibility(0);
            return;
        }
        LogUtil.j(TAG, "showDeviceCheckFailView mProductInfo is null");
    }

    private void showDeviceCheckFailView() {
        resultFailView();
        this.mBindGoText.setText(com.huawei.ui.commonui.R.string.IDS_hw_health_wear_connect_device_unpair_button);
        setTitle(getResources().getString(R.string.IDS_device_mgr_device_pair_guide_note));
        this.mBindSuccessText.setText(getResources().getString(R.string.IDS_device_wifi_bind_fail));
        elh elhVar = this.mProductInfo;
        if (elhVar != null) {
            setBindImageBitmap(this.mBackgroundImg, elhVar.c(), 5);
        } else {
            LogUtil.j(TAG, "showDeviceCheckFailView mProductInfo is null");
        }
        this.mBindSucessDes.setVisibility(0);
        this.mBindSucessDes.setText(R.string.IDS_device_scale_pair_fail_unbind_tip);
    }

    private void showWlanSuccessView() {
        this.mDeviceManager.b();
        setTitle(getResources().getString(R.string.IDS_device_wifi_config_network));
        this.mBindGuideLayout.setVisibility(8);
        this.mBindSuccessLayout.setVisibility(0);
        if (this.mProductInfo != null) {
            this.mBindSuccessText.setVisibility(0);
            this.mBindSucessDes.setVisibility(0);
            setBindImageBitmap(this.mBackgroundImg, this.mProductInfo.aa(), 3);
            this.mBindSuccessText.setText(eru.c(this.mProductInfo.aa(), this.mProductId, 3));
            this.mBindSucessDes.setText(eru.c(this.mProductInfo.aa(), this.mProductId, 4));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mBindSucessDes.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.topMargin = qrs.d(BaseApplication.getContext(), 8.0f);
            this.mBindSucessDes.setLayoutParams(layoutParams);
        } else {
            LogUtil.j(TAG, "showWlanSuccessView mProductInfo is null");
        }
        this.mBindSuccessLayoutBottom.setVisibility(8);
        this.mBindGuideBottom.setVisibility(0);
        this.mBindCancel.setVisibility(8);
        this.mGuideSuccessImg.setVisibility(0);
        this.mGuideImg.setVisibility(8);
        LogUtil.a(TAG, "showWlanSuccessView mIsModifyWlanInfo:", Boolean.valueOf(this.mIsModifyWlanInfo));
        if (!this.mIsModifyWlanInfo) {
            this.mAutoUpgradeLayout.setVisibility(0);
            if (Utils.o()) {
                this.mAutoUpgradeSwitch.setChecked(false);
            }
        }
        this.mBindNextBottom.setVisibility(8);
        this.mBindFinishButton.setVisibility(0);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "hagrid_wifi_ssid" + this.mDeviceIdentify, this.mSsid, null);
        sendMultiUserInfo();
        this.mIsBinding = false;
        setUserCollectionSwitch();
        dyj.f(this.deviceAddress);
        if (TextUtils.isEmpty(this.deviceAddress)) {
            return;
        }
        this.deviceAddress = "";
    }

    private void setUserCollectionSwitch() {
        MyHandler myHandler = this.mMyHandler;
        if (myHandler != null) {
            myHandler.postDelayed(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindResultFragment$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    HagridDeviceBindResultFragment.lambda$setUserCollectionSwitch$9();
                }
            }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        }
    }

    static /* synthetic */ void lambda$setUserCollectionSwitch$9() {
        boolean zC = niz.c();
        LogUtil.a(TAG, "setUserCollectionSwitch isAnalyticsOpen:", Boolean.valueOf(zC));
        if (zC) {
            ean.e(zC);
        }
    }

    private void showWlanFailView() {
        this.mDeviceManager.b();
        resultFailView();
        this.mBindCancel.setVisibility(0);
        this.mBindFinishButton.setVisibility(8);
        if (this.mProductInfo != null) {
            this.mBindSuccessText.setVisibility(0);
            this.mBindSucessDes.setVisibility(0);
            setBindImageBitmap(this.mBackgroundImg, this.mProductInfo.aa(), 5);
            String strC = eru.c(this.mProductInfo.aa(), this.mProductId, 5);
            if (LanguageUtil.br(BaseApplication.getContext())) {
                this.mBindSuccessText.setText("\u200f" + strC);
            } else {
                this.mBindSuccessText.setText(strC);
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mBindSucessDes.getLayoutParams();
            layoutParams.gravity = GravityCompat.START;
            layoutParams.topMargin = qrs.d(BaseApplication.getContext(), 8.0f);
            this.mBindSucessDes.setLayoutParams(layoutParams);
            this.mBindSucessDes.setText(spliceZipText(this.mProductInfo.aa(), 6, this.mProductInfo.aa().size()));
        } else {
            LogUtil.a(TAG, "showWlanFailView mProductInfo is null");
        }
        this.mBindNextBottom.setVisibility(0);
        isClickNextStep(true);
        this.mBindCancelText.setText(getResources().getString(R.string.IDS_device_wlan_not_config_device));
        this.mBindGoText.setText(getResources().getString(R.string.IDS_retry));
        this.mIsBinding = false;
        this.mBindSuccessButton.setVisibility(8);
    }

    private void showWlanWaitingView() {
        LogUtil.a(TAG, "showWlanWaitingView starting");
        this.mBindDeviceProgressLayout.setVisibility(0);
        String strE = UnitUtil.e(0.0d, 1, 0);
        this.mBindPercentSign.setText(UnitUtil.e(0.0d, 2, 0).replace(strE, ""));
        this.mBindProgressText.setText(strE);
        resultFailView();
        elh elhVar = this.mProductInfo;
        if (elhVar != null) {
            setBindImageBitmap(this.mBackgroundImg, elhVar.aa(), 0);
            this.mBindSucessDes.setText(eru.c(this.mProductInfo.aa(), this.mProductId, 2));
            this.mBindSucessDes.setVisibility(0);
            if (this.mBindSucessDes.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mBindSucessDes.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.topMargin = qrs.d(BaseApplication.getContext(), 24.0f);
                this.mBindSucessDes.setLayoutParams(layoutParams);
            } else {
                LogUtil.j(TAG, "mBindSucessDes.getLayoutParams() not instanceof LinearLayout.LayoutParams");
            }
        } else {
            LogUtil.j(TAG, "showWlanWaitingView mProductInfo is null");
        }
        this.mBindSuccessText.setVisibility(8);
        this.mBindCancel.setVisibility(8);
        this.mBindNextBottom.setVisibility(8);
        configWlanInfo();
    }

    private void configWlanInfo() {
        EventBus.b(this.mEventCallback, 0, "send_wifi_password_result", "set_manager_info_result", "update_wifi_device_cloud_status");
        if (TextUtils.isEmpty(this.mSsid)) {
            String wlanInfoByKey = getWlanInfoByKey("outhName");
            this.mSsid = wlanInfoByKey;
            LogUtil.a(TAG, "configWlanInfo outhName: ", wlanInfoByKey);
        }
        if (TextUtils.isEmpty(this.mSsidPwd)) {
            String wlanInfoByKey2 = getWlanInfoByKey("outhPd");
            this.mSsidPwd = wlanInfoByKey2;
            LogUtil.a(TAG, "configWlanInfo mSsidPwd: ", wlanInfoByKey2);
        }
        this.mPairingWifiNameText.setText(String.format(Locale.ENGLISH, getString(R.string.IDS_device_wifi_current_config), this.mSsid));
        if (isManagerUser()) {
            EventBus.b(this.mEventCallback, 0, "update_wifi_device_cloud_status");
            this.mIsModifyWlanInfo = true;
            Bundle bundle = new Bundle();
            bundle.putString("wifiSsid", this.mSsid);
            bundle.putString("wifiPwd", this.mSsidPwd);
            EventBus.a(new EventBus.d("send_ssid", bundle));
            LogUtil.a(TAG, "start update wifi ssid and password");
            startEstimatingBindProgress();
        } else {
            LogUtil.a(TAG, "configWlanInfo mIsCreateSave: ", Boolean.valueOf(this.mIsCreateSave));
            LogUtil.a(TAG, "configWlanInfo not manager usr to config wlan mIsBinding: ", Boolean.valueOf(this.mIsBinding));
            this.mIsModifyWlanInfo = false;
            if (!this.mIsBinding) {
                ebv ebvVar = new ebv();
                ebvVar.h(this.mDeviceSsid);
                if (this.mIsCreateSave) {
                    ebvVar.c(this.mDeviceId);
                    this.mIsCreateSave = false;
                    startEstimatingBindProgress();
                }
                this.mDeviceManager.e(ebvVar, DeviceRegisterManager.RegisterMode.REGISTER_BLE, this.mRegisterCallback);
                this.mMyHandler.sendEmptyMessageDelayed(1007, 95000L);
                this.mIsBinding = true;
            }
        }
        LogUtil.a(TAG, "showWlanWaitingView mIsModifyWlanInfo: ", Boolean.valueOf(this.mIsModifyWlanInfo));
    }

    private void setBindImageBitmap(ImageView imageView, ArrayList<elh.c> arrayList, int i) {
        if (imageView == null) {
            LogUtil.j(TAG, "setImageBitmap ImageView is null");
        } else {
            refreshBindResultLayout();
            imageView.setImageBitmap(eru.a(arrayList, this.mProductId, i));
        }
    }

    private void resultFailView() {
        this.mGuideImg.setVisibility(8);
        this.mBindGuideLayout.setVisibility(8);
        this.mGuideSuccessImg.setVisibility(0);
        this.mBindSuccessLayout.setVisibility(0);
        this.mBindSucessDes.setVisibility(8);
        this.mBindSuccessLayoutBottom.setVisibility(8);
        this.mBindGuideBottom.setVisibility(0);
        this.mBindCancelText.setText(getResources().getString(R.string.IDS_settings_button_cancal));
        this.mBindGoText.setText(getResources().getString(R.string.IDS_retry));
    }

    private boolean isClickNextStep(boolean z) {
        if (this.mainActivity == null) {
            return false;
        }
        if (z) {
            this.mBindNextBottom.setEnabled(true);
            this.mBindGoText.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.textColorPrimary));
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                this.mNextImage.setBackgroundResource(R.drawable.wifi_device_arrow_left);
            } else {
                this.mNextImage.setBackgroundResource(R.drawable.wifi_device_arrow_right);
            }
            return true;
        }
        this.mBindNextBottom.setEnabled(false);
        this.mBindGoText.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.textColorSecondary));
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.mNextImage.setBackgroundResource(R.drawable.wifi_device_arrow_disable_left);
        } else {
            this.mNextImage.setBackgroundResource(R.drawable.wifi_device_arrow_disable_right);
        }
        return false;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        LogUtil.a(TAG, "onBackPressed");
        int i = mBindStatus;
        if (i == 5 || i == 9 || i == 10 || i == 8) {
            gotoDeviceManagerPage();
        } else {
            if (i == 7) {
                return false;
            }
            dxi.e(this.mProductId, this.mDeviceIdentify);
            int i2 = mBindStatus;
            if (i2 == 1 || i2 == 3) {
                stop();
            }
            this.mMyHandler.removeMessages(1007);
            popupFragment(HagridWiFiInfoConfirmFragment.class);
        }
        return false;
    }

    private void stop() {
        LogUtil.a(TAG, "stop enter");
        if (this.mProductId != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("type", -6);
            bundle.putString("productId", this.mProductId);
            MeasurableDevice measurableDeviceB = dmp.d().b(this.mDeviceIdentify, true);
            if (measurableDeviceB != null) {
                doq.e().prepare(measurableDeviceB, null, bundle);
            } else {
                doq.e().prepare(null, null, bundle);
            }
        }
        drw.e().d(this.mProductId, this.mDeviceIdentify, -6);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        LogUtil.a(TAG, "onDestroy");
        ebh.a(this.mainActivity);
        AnimationDrawable animationDrawable = this.mAnimation;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
        this.mIsBinding = false;
        this.mIsJumpFromWifiInfoConfirmFragment = false;
        this.mDeviceManager.b();
        this.mMyHandler.removeMessages(1007);
        EventBus.a(this.mEventCallback, "send_wifi_password_result", "update_wifi_device_cloud_status", "set_manager_info_result");
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        sendAutoUpgrade();
        super.onDestroyView();
        LogUtil.a(TAG, "onDestroyView");
    }

    private void sendAutoUpgrade() {
        String str;
        if (this.mAutoUpgradeLayout.getVisibility() == 0) {
            if (this.mAutoUpgradeSwitch.isChecked()) {
                str = "1";
            } else {
                str = "0";
            }
            LogUtil.a(TAG, "sendAutoUpgrade autoUpgradeStatus: ", str);
            ean.a(this.mDeviceId, str, niz.c());
        }
    }

    private void sendMultiUserInfo() {
        if (TextUtils.isEmpty(this.mProductId)) {
            LogUtil.j(TAG_RELEASE, "sendMultiUserInfoToScale fail: mProductId is null");
            return;
        }
        eby ebyVar = dmp.d().b(this.mDeviceIdentify, false) instanceof eby ? (eby) dmp.d().b(this.mDeviceIdentify, false) : null;
        if (ebyVar == null) {
            LogUtil.j(TAG_RELEASE, "sendMultiUserInfoToScale fail: wifiDevice is null");
            return;
        }
        String strE = ebyVar.e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        ean.b(strE, true);
    }

    private boolean isManagerUser() {
        eby ebyVar = this.mWifiDevice;
        return (ebyVar == null || ebyVar.a() == null || this.mWifiDevice.a().m() != 1) ? false : true;
    }

    private void startTimer() {
        if (this.mCheckTimer == null) {
            this.mCheckTimer = new Timer(TAG);
            LogUtil.a(TAG, "Start the timer check device status");
            this.mCheckTimer.schedule(new MyTimerTask(this), 60000L);
        }
    }

    private void cancelTimer() {
        Timer timer = this.mCheckTimer;
        if (timer != null) {
            timer.cancel();
            this.mCheckTimer = null;
            LogUtil.a(TAG, "Cancel the timer connected device");
            return;
        }
        LogUtil.j(TAG, "checkTimer has been canceled");
    }

    static class MyTimerTask extends TimerTask {
        private WeakReference<HagridDeviceBindResultFragment> mWeakRefc;

        MyTimerTask(HagridDeviceBindResultFragment hagridDeviceBindResultFragment) {
            this.mWeakRefc = new WeakReference<>(hagridDeviceBindResultFragment);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            WeakReference<HagridDeviceBindResultFragment> weakReference = this.mWeakRefc;
            if (weakReference == null) {
                LogUtil.j(HagridDeviceBindResultFragment.TAG_RELEASE, "MyTimerTask run mWeakRefc is null");
                return;
            }
            HagridDeviceBindResultFragment hagridDeviceBindResultFragment = weakReference.get();
            if (hagridDeviceBindResultFragment == null) {
                LogUtil.j(HagridDeviceBindResultFragment.TAG_RELEASE, "MyTimerTask run fragment is null");
            } else {
                LogUtil.a(HagridDeviceBindResultFragment.TAG_RELEASE, "check wifiDevice cloud status timeout");
                hagridDeviceBindResultFragment.mMyHandler.sendEmptyMessage(1004);
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LogUtil.a(TAG, "onConfigurationChanged, refresh page");
        refreshBindResultLayout();
        super.onConfigurationChanged(configuration);
    }

    private void refreshBindResultLayout() {
        LinearLayout linearLayout = this.mBindResultDeviceLayout;
        if (linearLayout != null) {
            qrs.b(linearLayout, 3);
        }
    }
}
