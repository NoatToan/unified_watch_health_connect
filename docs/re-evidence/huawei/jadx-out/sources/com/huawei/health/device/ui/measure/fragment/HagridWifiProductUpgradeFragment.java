package com.huawei.health.device.ui.measure.fragment;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.MeasureController;
import com.huawei.health.device.open.MeasureKit;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.device.ui.util.RoundProgressView;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.health.versionmgr.api.VersionMgrApi;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetWifiDeviceInfoReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetWifiDeviceInfoRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dmp;
import defpackage.dnf;
import defpackage.dof;
import defpackage.doq;
import defpackage.dxm;
import defpackage.dyj;
import defpackage.ean;
import defpackage.eas;
import defpackage.eby;
import defpackage.ecf;
import defpackage.ecj;
import defpackage.ecr;
import defpackage.elh;
import defpackage.elk;
import defpackage.era;
import defpackage.lqo;
import defpackage.njy;
import defpackage.piq;
import defpackage.pjc;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qsp;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class HagridWifiProductUpgradeFragment extends BaseFragment implements View.OnClickListener {
    private static final float ALPHA_VALUE_STATUS_DONG = 0.3f;
    private static final float ALPHA_VALUE_STATUS_NOMAL = 1.0f;
    private static final String CURRENT_VERSION = "cer_version";
    private static final int DEFAULT_STATUS = -1;
    private static final int DEFAULT_VALUE = 0;
    private static final String DEVICE_ID = "devId";
    private static final String DEVICE_PAIRING_GUIDE_ACTIVITY = "com.huawei.ui.device.activity.adddevice.PairingGuideActivity";
    private static final int FAILED_REASON_NOT_FOUND = 0;
    private static final String GET_NETWORK_DEVICE_VERSION = "getNetworkDeviceVersion";
    private static final String KIND_ID = "kind_id";
    private static final int MSG_CHECKING_VERSION = 10;
    private static final int MSG_EXIST_NEW_VERSION = 3;
    private static final int MSG_GET_VERSION_FAIL = 2;
    private static final int MSG_GET_VERSION_SUCCESS = 1;
    private static final int MSG_NOT_EXIST_DEVICE = 4;
    private static final int MSG_SENDGRS_SUCCESS = 11;
    private static final String PAIR_GUIDE = "pair_guide";
    private static final String TAG = "HagridWifiProductUpgradeFragment";
    private static final String TAG_RELEASE = "R_Weight_HagridWifiProductUpgradeFragment";
    private static final String UPDATE_NODES = "update_nodes";
    private static final String UUID_LIST = "uuid_list";
    private static final String VERSION = "version";
    private String mDeviceSoftVersion;
    private ImageView mNextImage;
    private String mUniqueId;
    private ImageView mVersionLogo;
    private VersionMgrApi mVersionMgrApi;
    private String mProductId = null;
    private String mNewVer = null;
    private HealthTextView mNowVersionTv = null;
    private HealthTextView mNoNewVersionTv = null;
    private HealthTextView mNewVersionTv = null;
    private LinearLayout mLatestVersionLayout = null;
    private String mNowVersion = null;
    private String mReleaseNote = null;
    private WifiHandler mHandler = null;
    private RoundProgressView mRoundProgress = null;
    private HealthButton mCheckVersionUpdate = null;
    private eby mWiFiDevice = null;
    private boolean mIsExistNewVer = false;
    private boolean isFromProductView = false;
    private ContentValues mDeviceInfo = null;
    private String mDeviceBtMac = null;
    private boolean mIsConnected = false;
    private View.OnClickListener positiveListener = new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridWifiProductUpgradeFragment.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Fragment selectFragment = HagridWifiProductUpgradeFragment.this.getSelectFragment(DeviceCategoryFragment.class);
            if (HagridWifiProductUpgradeFragment.this.isFromProductView && selectFragment != null) {
                HagridWifiProductUpgradeFragment.this.popupFragment(DeviceCategoryFragment.class);
                return;
            }
            elk elkVarSwitchProductGroupItem = HagridWifiProductUpgradeFragment.this.switchProductGroupItem(ResourceManager.c().b().d(), HealthDevice.HealthDeviceKind.HDK_WEIGHT.name());
            if (HagridWifiProductUpgradeFragment.this.mainActivity == null) {
                LogUtil.j(HagridWifiProductUpgradeFragment.TAG_RELEASE, "positiveListener mainActivity is null");
            } else if (elkVarSwitchProductGroupItem != null) {
                LogUtil.a(HagridWifiProductUpgradeFragment.TAG, "item: ", elkVarSwitchProductGroupItem.toString());
                HagridWifiProductUpgradeFragment.this.startPairingGuideActivity();
            } else {
                LogUtil.j(HagridWifiProductUpgradeFragment.TAG, "WEIGHT ProductGroup is error");
            }
        }
    };
    private IHealthDeviceCallback mCallback = new IHealthDeviceCallback() { // from class: com.huawei.health.device.ui.measure.fragment.HagridWifiProductUpgradeFragment.2
        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(HealthDevice healthDevice, HealthData healthData) {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(HealthDevice healthDevice, List<HealthData> list) {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onFailed(HealthDevice healthDevice, int i) {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onProgressChanged(HealthDevice healthDevice, HealthData healthData) {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onStatusChanged(HealthDevice healthDevice, int i) {
            if (healthDevice != null) {
                LogUtil.a(HagridWifiProductUpgradeFragment.TAG, "mCallback onStatusChanged device name is ", healthDevice.getDeviceName());
            }
            LogUtil.a(HagridWifiProductUpgradeFragment.TAG, "mCallback onStatusChanged status is ", Integer.valueOf(i));
            if (i == 3) {
                HagridWifiProductUpgradeFragment.this.mIsConnected = false;
            } else if (i == 2) {
                HagridWifiProductUpgradeFragment.this.mIsConnected = true;
            } else {
                HagridWifiProductUpgradeFragment.this.mIsConnected = false;
                LogUtil.j(HagridWifiProductUpgradeFragment.TAG, "onStatusChanged: status: ", Integer.valueOf(i));
            }
        }
    };
    private BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() { // from class: com.huawei.health.device.ui.measure.fragment.HagridWifiProductUpgradeFragment.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j(HagridWifiProductUpgradeFragment.TAG, "mBroadcastReceiver intent is null");
                return;
            }
            String action = intent.getAction();
            LogUtil.a(HagridWifiProductUpgradeFragment.TAG, "onReceive: action: ", action);
            if ("action_app_check_new_version_state".equals(action)) {
                HagridWifiProductUpgradeFragment.this.upDateLayout(intent);
                dyj.d(HagridWifiProductUpgradeFragment.this.mProductId, HagridWifiProductUpgradeFragment.this.mNowVersion, HagridWifiProductUpgradeFragment.this.mDeviceInfo);
            }
        }
    };
    private EventBus.ICallback mEventCallback = new EventBus.ICallback() { // from class: com.huawei.health.device.ui.measure.fragment.HagridWifiProductUpgradeFragment.4
        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) {
            if ("set_scale_version_code".equals(dVar.e())) {
                LogUtil.a(HagridWifiProductUpgradeFragment.TAG, "mEventCallback get version code success");
                HagridWifiProductUpgradeFragment.this.startCheckVersion(dVar.c());
            } else {
                if ("event_bus_send_ota_url_success".equals(dVar.e())) {
                    LogUtil.a(HagridWifiProductUpgradeFragment.TAG, "[grs][ota update] grs callback success");
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 11;
                    HagridWifiProductUpgradeFragment.this.mHandler.sendMessage(messageObtain);
                    return;
                }
                if ("get_version_code_fail".equals(dVar.e())) {
                    LogUtil.j(HagridWifiProductUpgradeFragment.TAG, "mEventCallback get version code fail");
                    Message messageObtain2 = Message.obtain();
                    messageObtain2.what = 2;
                    HagridWifiProductUpgradeFragment.this.mHandler.sendMessage(messageObtain2);
                    return;
                }
                LogUtil.j(HagridWifiProductUpgradeFragment.TAG, "[grs][ota update] grs callback for another");
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void upDateLayout(Intent intent) {
        int intExtra;
        Map<String, String> mapC = eas.b().c(this.mWiFiDevice.e());
        int intExtra2 = intent.getIntExtra("state", 0);
        Message messageObtain = Message.obtain();
        if (intExtra2 == 49) {
            intExtra = intent.getIntExtra("result", 0);
            if (intExtra == 0) {
                this.mNowVersion = this.mDeviceSoftVersion;
                messageObtain.what = 1;
            } else {
                messageObtain.what = 2;
            }
            this.mHandler.sendMessage(messageObtain);
        } else if (intExtra2 != 50) {
            if (intExtra2 == 53) {
                String stringExtra = intent.getStringExtra("content");
                this.mReleaseNote = stringExtra;
                if (mapC != null) {
                    mapC.put("releaseNote", stringExtra);
                }
                eas.b().a(this.mWiFiDevice.e(), mapC);
            } else {
                LogUtil.a(TAG, "upDateLayout default case ", Integer.valueOf(intExtra2));
            }
            intExtra = -1;
        } else {
            this.mNewVer = intent.getStringExtra("content");
            intExtra = intent.getIntExtra("result", 0);
            this.mNowVersion = this.mDeviceSoftVersion;
            if (TextUtils.isEmpty(this.mNewVer) || TextUtils.isEmpty(this.mNowVersion)) {
                messageObtain.what = 2;
                this.mHandler.sendMessage(messageObtain);
            } else {
                if (!this.mNewVer.equals(this.mNowVersion)) {
                    messageObtain.what = 3;
                    this.mHandler.sendMessage(messageObtain);
                    LogUtil.a(TAG, "exist new version curver:", this.mNowVersion, ",new ver:", this.mNewVer);
                }
                if (mapC != null) {
                    mapC.put("fwNewVer", this.mNewVer);
                    mapC.put("fwCurVer", this.mDeviceSoftVersion);
                }
                eas.b().a(this.mWiFiDevice.e(), mapC);
            }
        }
        String str = this.mNewVer;
        LogUtil.a(TAG, "upDateLayout: state = ", Integer.valueOf(intExtra2), ",result = ", Integer.valueOf(intExtra), ",content = ", str, ",upDateLayout mNewVer:", str, ",mNowVersion:", this.mNowVersion, ",mReleaseNote:", this.mReleaseNote);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        unregisterBroadcastReceiver();
        return super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCheckVersion(Intent intent) {
        String strE;
        Map<String, String> mapC;
        if (intent != null && dxm.ag(this.mProductId)) {
            this.mDeviceSoftVersion = intent.getStringExtra("bleVersion");
            this.mDeviceBtMac = intent.getStringExtra(HealthEngineRequestManager.PARAMS_DEVICE_SN);
        }
        LogUtil.a(TAG, "startCheckVersion mDeviceSoftVersion=", this.mDeviceSoftVersion);
        eby ebyVar = this.mWiFiDevice;
        if (ebyVar == null) {
            strE = "";
            mapC = null;
        } else {
            strE = ebyVar.e();
            mapC = eas.b().c(strE);
        }
        if (TextUtils.isEmpty(this.mDeviceSoftVersion) && mapC != null) {
            this.mDeviceSoftVersion = mapC.get("fwCurVer");
            if (this.mWiFiDevice != null && dxm.ag(this.mProductId)) {
                LogUtil.a(TAG, "startCheckVersion getSerialNumber.");
                this.mDeviceBtMac = this.mWiFiDevice.getSerialNumber();
            }
        }
        this.mVersionMgrApi.checkScaleNewVersionService(this.mProductId, this.mDeviceSoftVersion, this.mDeviceBtMac, false, this.mUniqueId);
        if (mapC != null) {
            mapC.put("fwCurVer", this.mDeviceSoftVersion);
            eas.b().a(strE, mapC);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        LogUtil.d(TAG, "onCreateView child: ", this.child, ",view:", viewGroup2);
        this.child = layoutInflater.inflate(R.layout.wifi_upgrade_layout, viewGroup, false);
        this.mIsExistNewVer = getArguments().getBoolean("is_exist_new_version");
        this.mVersionMgrApi = (VersionMgrApi) Services.b("HWVersionMgr", VersionMgrApi.class);
        initView();
        initDataAndReceiver();
        getConnected();
        initData();
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
        }
        return viewGroup2;
    }

    private void getConnected() {
        MeasurableDevice measurableDeviceB;
        Bundle bundle = new Bundle();
        bundle.putInt("type", -1);
        bundle.putString("productId", this.mProductId);
        bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
        if (!TextUtils.isEmpty(this.mUniqueId)) {
            measurableDeviceB = dmp.d().b(this.mUniqueId, false);
        } else {
            measurableDeviceB = dmp.d().b(this.mProductId);
        }
        if (measurableDeviceB != null) {
            elh elhVarD = ResourceManager.c().d(this.mProductId);
            if (elhVarD == null) {
                LogUtil.j(TAG, "getConnected productInfo is null");
                return;
            }
            MeasureKit measureKitA = dnf.e().a(elhVarD.q());
            if (measureKitA == null) {
                LogUtil.j(TAG, "getConnected kit is null");
                return;
            }
            MeasureController measureController = measureKitA.getMeasureController();
            if (measureController != null) {
                measureController.prepare(measurableDeviceB, this.mCallback, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startPairingGuideActivity() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            health.compact.a.util.LogUtil.d(TAG, "DeviceMainActivity is null");
            return;
        }
        List<pjc> listC = piq.e().c(this.mProductId);
        if (njy.e(listC)) {
            health.compact.a.util.LogUtil.d(TAG, "DevicePluginInfoBean is null");
            return;
        }
        pjc pjcVar = listC.get(0);
        String strK = pjcVar.k();
        if (TextUtils.isEmpty(strK)) {
            health.compact.a.util.LogUtil.d(TAG, "pairGuid is empty");
            return;
        }
        String strN = pjcVar.n();
        if (TextUtils.isEmpty(strN)) {
            health.compact.a.util.LogUtil.d(TAG, "kindId is empty");
            return;
        }
        List<String> listS = pjcVar.s();
        if (njy.e(listS)) {
            health.compact.a.util.LogUtil.d(TAG, "uuidList is empty");
            return;
        }
        Iterator<String> it = listS.iterator();
        while (it.hasNext()) {
            health.compact.a.util.LogUtil.d(TAG, "uuidList uuid = ", it.next());
        }
        health.compact.a.util.LogUtil.d(TAG, "pairGuide = ", strK, "kindId = ", strN);
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(activity, DEVICE_PAIRING_GUIDE_ACTIVITY);
        if (listS instanceof ArrayList) {
            intent.putStringArrayListExtra("uuid_list", (ArrayList) listS);
        }
        intent.putExtra("is_invalidation", true);
        intent.putExtra(KIND_ID, strN);
        intent.putExtra(PAIR_GUIDE, strK);
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e(TAG, "startPairingGuideActivity startActivity ActivityNotFoundException occur.");
        }
        activity.finish();
    }

    private void unregisterBroadcastReceiver() {
        EventBus.a(this.mEventCallback, "set_scale_version_code", "event_bus_send_ota_url_success", "get_version_code_fail");
        if (this.mBroadcastReceiver == null) {
            return;
        }
        try {
            this.mainActivity.unregisterReceiver(this.mBroadcastReceiver);
            this.mBroadcastReceiver = null;
        } catch (IllegalArgumentException e) {
            LogUtil.a(TAG, e.getMessage());
        }
        dof.d().d(this.mCallback);
        doq.e().c(this.mCallback);
    }

    private void initView() {
        setTitle(this.mainActivity.getString(R.string.IDS_device_scale_device_firmware_version));
        this.mNowVersionTv = (HealthTextView) qsp.a(this.child, R.id.now_version_nodes_tv);
        this.mNoNewVersionTv = (HealthTextView) qsp.a(this.child, R.id.no_new_version_tv);
        this.mNewVersionTv = (HealthTextView) qsp.a(this.child, R.id.new_version_tv);
        this.mLatestVersionLayout = (LinearLayout) qsp.a(this.child, R.id.latest_version_button);
        this.mRoundProgress = (RoundProgressView) qsp.a(this.child, R.id.version_update_anim);
        this.mCheckVersionUpdate = (HealthButton) qsp.a(this.child, R.id.check_version_update);
        this.mVersionLogo = (ImageView) qsp.a(this.child, R.id.image_logo);
        this.mNextImage = (ImageView) qsp.a(this.child, R.id.image_device_next);
        this.mLatestVersionLayout.setOnClickListener(this);
        this.mCheckVersionUpdate.setOnClickListener(this);
        if (this.mIsExistNewVer) {
            showLatestVersionLayout(true);
        } else {
            showLatestVersionLayout(false);
        }
        if (LanguageUtil.ba(this.mainActivity)) {
            this.mNextImage.setBackground(getResources().getDrawable(R.drawable.wifi_device_public_next_left));
        } else {
            this.mNextImage.setBackground(getResources().getDrawable(R.drawable.wifi_device_public_next_right));
        }
    }

    private void setRightTitleButton() {
        this.mCustomTitleBar.setRightButtonDrawable(getResources().getDrawable(R.drawable.haiger_ota_setting), qre.f(R.string.IDS_main_btn_state_settings));
        this.mCustomTitleBar.setRightButtonClickable(true);
        this.mCustomTitleBar.setRightButtonVisibility(0);
        this.mCustomTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridWifiProductUpgradeFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m889x68c0fb01(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setRightTitleButton$0$com-huawei-health-device-ui-measure-fragment-HagridWifiProductUpgradeFragment, reason: not valid java name */
    /* synthetic */ void m889x68c0fb01(View view) {
        if (this.mWiFiDevice != null) {
            HagridOtaSettingFragment hagridOtaSettingFragment = new HagridOtaSettingFragment();
            Bundle bundle = new Bundle();
            bundle.putString("deviceId", this.mWiFiDevice.e());
            hagridOtaSettingFragment.setArguments(bundle);
            switchFragment(hagridOtaSettingFragment);
            return;
        }
        LogUtil.j(TAG, "setRightTitleButton mWiFiDevice is null");
    }

    private void checkDevice() {
        if (this.mWiFiDevice == null) {
            LogUtil.j(TAG_RELEASE, "checkDevice mWiFiDevice is null");
            return;
        }
        String devId = getDevId();
        if (TextUtils.isEmpty(devId)) {
            LogUtil.j(TAG_RELEASE, "checkDevice devId is null");
            return;
        }
        WifiDeviceGetWifiDeviceInfoReq wifiDeviceGetWifiDeviceInfoReq = new WifiDeviceGetWifiDeviceInfoReq();
        wifiDeviceGetWifiDeviceInfoReq.setDevId(devId);
        lqo.b(this.mainActivity).b(wifiDeviceGetWifiDeviceInfoReq, new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.HagridWifiProductUpgradeFragment$$ExternalSyntheticLambda1
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f$0.m888xfafc2150((WifiDeviceGetWifiDeviceInfoRsp) obj, str, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$checkDevice$1$com-huawei-health-device-ui-measure-fragment-HagridWifiProductUpgradeFragment, reason: not valid java name */
    /* synthetic */ void m888xfafc2150(WifiDeviceGetWifiDeviceInfoRsp wifiDeviceGetWifiDeviceInfoRsp, String str, boolean z) {
        int iIntValue;
        String resultDesc;
        if (z) {
            if (wifiDeviceGetWifiDeviceInfoRsp == null || wifiDeviceGetWifiDeviceInfoRsp.getDeviceDetailInfo() != null) {
                LogUtil.a(TAG_RELEASE, "checkDevice device already exists");
                return;
            } else {
                LogUtil.j(TAG_RELEASE, "checkDevice device already not exists");
                this.mHandler.sendEmptyMessage(4);
                return;
            }
        }
        if (wifiDeviceGetWifiDeviceInfoRsp != null && wifiDeviceGetWifiDeviceInfoRsp.getResultCode() != null) {
            iIntValue = wifiDeviceGetWifiDeviceInfoRsp.getResultCode().intValue();
            resultDesc = wifiDeviceGetWifiDeviceInfoRsp.getResultDesc();
            if (iIntValue == 112000000) {
                LogUtil.j(TAG, TAG, "device already not exists");
                this.mHandler.sendEmptyMessage(4);
            }
        } else {
            this.mHandler.sendEmptyMessage(4);
            iIntValue = Constants.CODE_UNKNOWN_ERROR;
            resultDesc = "unknown error";
        }
        LogUtil.a(TAG, "checkDevice() errCode: ", Integer.valueOf(iIntValue), ",resultDesc: ", resultDesc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public elk switchProductGroupItem(ArrayList<elk> arrayList, String str) {
        elk elkVar = null;
        for (elk elkVar2 : arrayList) {
            if (elkVar2.e() != null && elkVar2.e().name() != null && elkVar2.e().name().equals(str)) {
                LogUtil.a(TAG, " item.kind.name: ", elkVar2.e().name(), " deviceType: ", str);
                elkVar = elkVar2;
            }
        }
        return elkVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNoDeviceDialog() {
        Activity activity = this.mainActivity;
        eby ebyVar = this.mWiFiDevice;
        String strE = ebyVar == null ? null : ebyVar.e();
        View.OnClickListener onClickListener = this.positiveListener;
        ean.c(activity, strE, onClickListener, onClickListener);
    }

    private void initData() {
        if (this.mWiFiDevice == null) {
            MeasurableDevice measurableDeviceA = null;
            String string = getArguments() != null ? getArguments().getString(DEVICE_ID) : null;
            eby ebyVarD = !TextUtils.isEmpty(string) ? ecf.d(string) : null;
            if (ebyVarD != null && !TextUtils.isEmpty(ebyVarD.getSerialNumber())) {
                measurableDeviceA = dmp.d().a(ebyVarD.getSerialNumber(), false);
            }
            if (measurableDeviceA != null && (measurableDeviceA instanceof eby)) {
                this.mWiFiDevice = (eby) measurableDeviceA;
            }
        }
        if (this.mWiFiDevice == null) {
            LogUtil.j(TAG_RELEASE, "wifi device is null");
            this.mHandler.sendEmptyMessage(4);
            return;
        }
        if (this.mDeviceInfo == null) {
            setMyDeviceInfo();
        }
        this.isFromProductView = getArguments().getBoolean("fromProductView", false);
        if (this.mIsExistNewVer) {
            checkDevice();
            this.mNewVer = getArguments().getString("version");
            this.mNowVersion = getArguments().getString(CURRENT_VERSION);
            this.mReleaseNote = getArguments().getString(UPDATE_NODES);
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            this.mHandler.sendMessage(messageObtain);
        } else {
            detectionExistNewVersion();
        }
        String str = this.mProductId;
        if (str != null) {
            era.d(this.mVersionLogo, str);
        } else {
            LogUtil.j(TAG, "mProductId isEmpty");
        }
        ecr.a(this.mainActivity.getApplicationContext()).a();
        setRightTitleButton();
    }

    private void setMyDeviceInfo() {
        LogUtil.j(TAG, "initData mDeviceInfo is null");
        ContentValues contentValues = new ContentValues();
        this.mDeviceInfo = contentValues;
        contentValues.put("productId", this.mWiFiDevice.getProductId());
        this.mDeviceInfo.put("uniqueId", this.mWiFiDevice.getUniqueId());
        this.mDeviceInfo.put("deviceId", this.mWiFiDevice.e());
        this.mDeviceInfo.put("sn", this.mWiFiDevice.getSerialNumber());
    }

    private void initDataAndReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_app_check_new_version_state");
        BroadcastManagerUtil.c(this.mainActivity, this.mBroadcastReceiver, intentFilter, LocalBroadcast.f36595c, null);
        EventBus.b(this.mEventCallback, 0, "set_scale_version_code", "event_bus_send_ota_url_success", "get_version_code_fail");
        this.mHandler = new WifiHandler(this);
        ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
        this.mDeviceInfo = contentValues;
        if (contentValues != null) {
            this.mProductId = contentValues.getAsString("productId");
            this.mUniqueId = this.mDeviceInfo.getAsString("uniqueId");
            LogUtil.a(TAG, "mProductId:", this.mProductId);
        }
        if (this.mDeviceInfo == null || TextUtils.isEmpty(this.mUniqueId)) {
            LogUtil.j(TAG, "uniqueId is empty, can't get WiFiDevice");
            return;
        }
        MeasurableDevice measurableDeviceB = dmp.d().b(this.mUniqueId, false);
        if (measurableDeviceB == null || !(measurableDeviceB instanceof eby)) {
            LogUtil.j(TAG, "mUniqueId can not get WiFiDevice");
        } else {
            this.mWiFiDevice = (eby) measurableDeviceB;
        }
    }

    private void detectionExistNewVersion() {
        this.mRoundProgress.e();
        setCheckVersionUpdateEnable(10);
        Context context = BaseApplication.getContext();
        if (!ecj.b(context)) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            this.mHandler.sendMessage(messageObtain);
            qpx.e(context, R.string.IDS_device_wifi_not_network);
            return;
        }
        EventBus.a(new EventBus.d("event_bus_send_ota_url"));
        getDeviceStatus();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBus.a(this.mEventCallback, "set_scale_version_code", "event_bus_send_ota_url_success", "get_version_code_fail");
        this.mRoundProgress = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getDevId() {
        eby ebyVar = this.mWiFiDevice;
        if (ebyVar != null && ebyVar.a() != null) {
            LogUtil.a(TAG, "device info");
            String strC = this.mWiFiDevice.a().c();
            if (!TextUtils.isEmpty(strC)) {
                return strC;
            }
            LogUtil.j(TAG, "devId is null");
            return null;
        }
        LogUtil.j(TAG, "device id is null");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showLatestVersionLayout(boolean z) {
        this.mLatestVersionLayout.setVisibility(z ? 0 : 8);
    }

    private void getDeviceStatus() {
        LogUtil.a(TAG, "getDeviceStatus mIsConnected: ", Boolean.valueOf(this.mIsConnected));
        showLatestVersionLayout(false);
        if (this.mIsConnected || this.mWiFiDevice == null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(GET_NETWORK_DEVICE_VERSION, true);
            EventBus.a(new EventBus.d("get_scale_version_code", bundle));
            return;
        }
        LogUtil.a(TAG, "mIsConnected is false or mWiFiDevice not null");
        String strM = eas.b().c(this.mWiFiDevice.e()).get("fwCurVer");
        if (TextUtils.isEmpty(strM)) {
            strM = dxm.m(this.mUniqueId);
            LogUtil.a(TAG, "get device version by uniqueId");
        }
        if (!TextUtils.isEmpty(strM)) {
            this.mDeviceSoftVersion = strM;
            if (dxm.ag(this.mProductId)) {
                String serialNumber = this.mWiFiDevice.getSerialNumber();
                this.mDeviceBtMac = serialNumber;
                this.mVersionMgrApi.checkScaleNewVersionService(this.mProductId, this.mDeviceSoftVersion, serialNumber, false, this.mUniqueId);
                return;
            }
            LogUtil.j(TAG, "getDeviceStatus isHuaweiWspScaleProduct is false");
            return;
        }
        LogUtil.j(TAG, "getDeviceStatus nowVersion is null");
        EventBus.a(new EventBus.d("get_scale_version_code"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDestroy() {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            return false;
        }
        LogUtil.j(TAG_RELEASE, "DeviceMainActivity is Destroyed");
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i;
        if (view.getId() == R.id.latest_version_button) {
            latestVersion();
            return;
        }
        if (view.getId() == R.id.check_version_update) {
            Object tag = view.getTag();
            LogUtil.a(TAG, "check version update tag: ", tag);
            if (tag != null) {
                try {
                    i = Integer.parseInt(tag.toString());
                } catch (NumberFormatException e) {
                    LogUtil.e(TAG, "onClick exception: ", e.getMessage());
                    i = 3;
                }
            } else {
                i = 3;
            }
            if (tag == null || i != 3) {
                if (this.mIsConnected) {
                    detectionExistNewVersion();
                    return;
                } else {
                    qpx.a(this.mainActivity, R.string.IDS_plugin_device_weight_device_not_connect);
                    LogUtil.a(TAG, "onClick mIsConnected is false");
                    return;
                }
            }
            HagridWifiUpdateGuideFragment hagridWifiUpdateGuideFragment = new HagridWifiUpdateGuideFragment();
            LogUtil.a(TAG, "onClick check version: ", hagridWifiUpdateGuideFragment);
            Bundle bundle = new Bundle();
            bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
            bundle.putString("version", this.mNewVer);
            bundle.putString(CURRENT_VERSION, this.mNowVersion);
            bundle.putString(UPDATE_NODES, this.mReleaseNote);
            bundle.putString(DEVICE_ID, this.mWiFiDevice.e());
            hagridWifiUpdateGuideFragment.setArguments(bundle);
            switchFragment(hagridWifiUpdateGuideFragment);
            return;
        }
        LogUtil.j(TAG, "no click");
    }

    private void latestVersion() {
        HagridWifiVersionDetailsFragment hagridWifiVersionDetailsFragment = new HagridWifiVersionDetailsFragment();
        LogUtil.a(TAG, "onClick last version: ", hagridWifiVersionDetailsFragment);
        Bundle bundle = new Bundle();
        bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
        bundle.putString("version", this.mNewVer);
        bundle.putString(CURRENT_VERSION, this.mNowVersion);
        bundle.putString(UPDATE_NODES, this.mReleaseNote);
        bundle.putBoolean("show_update", true);
        hagridWifiVersionDetailsFragment.setArguments(bundle);
        switchFragment(hagridWifiVersionDetailsFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckVersionUpdateEnable(int i) {
        if (i == 1) {
            this.mCheckVersionUpdate.setAlpha(1.0f);
            this.mCheckVersionUpdate.setEnabled(true);
            this.mNoNewVersionTv.setText(R.string.IDS_hwh_me_settings_app_update);
        } else if (i == 2) {
            this.mCheckVersionUpdate.setAlpha(1.0f);
            this.mCheckVersionUpdate.setEnabled(true);
            this.mNoNewVersionTv.setText(R.string.IDS_device_wifi_ota_check_fail);
            this.mCheckVersionUpdate.setText(R.string.IDS_retry);
        } else if (i == 3) {
            this.mCheckVersionUpdate.setAlpha(1.0f);
            this.mCheckVersionUpdate.setEnabled(true);
            this.mCheckVersionUpdate.setText(R.string.IDS_device_manager_update_health);
            this.mNoNewVersionTv.setText(R.string.IDS_ota_update_state_check_new_version);
        } else if (i == 10) {
            this.mCheckVersionUpdate.setAlpha(ALPHA_VALUE_STATUS_DONG);
            this.mCheckVersionUpdate.setEnabled(false);
            this.mCheckVersionUpdate.setText(R.string.IDS_ota_update_button_check_version);
            this.mNoNewVersionTv.setText(R.string.IDS_ota_update_state_checking);
        } else {
            LogUtil.j(TAG, "check is empty");
        }
        this.mCheckVersionUpdate.setTag(Integer.valueOf(i));
    }

    static class WifiHandler extends StaticHandler<HagridWifiProductUpgradeFragment> {
        WifiHandler(HagridWifiProductUpgradeFragment hagridWifiProductUpgradeFragment) {
            super(hagridWifiProductUpgradeFragment);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        public void handleMessage(HagridWifiProductUpgradeFragment hagridWifiProductUpgradeFragment, Message message) {
            if (hagridWifiProductUpgradeFragment.isDestroy()) {
                return;
            }
            if (!hagridWifiProductUpgradeFragment.isAdded()) {
                LogUtil.j(HagridWifiProductUpgradeFragment.TAG_RELEASE, "WifiHandler mFragment is not add");
                return;
            }
            if (message == null) {
                LogUtil.a(HagridWifiProductUpgradeFragment.TAG, "msg is null");
                return;
            }
            LogUtil.a(HagridWifiProductUpgradeFragment.TAG, "WifiHandler what: ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1) {
                if (hagridWifiProductUpgradeFragment.mNowVersion != null) {
                    hagridWifiProductUpgradeFragment.mNowVersionTv.setText(hagridWifiProductUpgradeFragment.mNowVersion);
                }
                eas.b().c(hagridWifiProductUpgradeFragment.getDevId(), false);
                hagridWifiProductUpgradeFragment.mRoundProgress.a();
                hagridWifiProductUpgradeFragment.setCheckVersionUpdateEnable(1);
                return;
            }
            if (i == 2) {
                eas.b().c(hagridWifiProductUpgradeFragment.getDevId(), false);
                hagridWifiProductUpgradeFragment.mRoundProgress.a();
                hagridWifiProductUpgradeFragment.setCheckVersionUpdateEnable(2);
                return;
            }
            if (i != 3) {
                if (i == 4) {
                    hagridWifiProductUpgradeFragment.showNoDeviceDialog();
                    return;
                } else if (i != 11) {
                    LogUtil.j(HagridWifiProductUpgradeFragment.TAG, "WifiHandler what is other");
                    return;
                } else {
                    LogUtil.d(HagridWifiProductUpgradeFragment.TAG, "[ota][ota update] success");
                    return;
                }
            }
            eas.b().c(hagridWifiProductUpgradeFragment.getDevId(), true);
            hagridWifiProductUpgradeFragment.mRoundProgress.a();
            hagridWifiProductUpgradeFragment.setCheckVersionUpdateEnable(3);
            hagridWifiProductUpgradeFragment.mNewVersionTv.setText(hagridWifiProductUpgradeFragment.mNewVer);
            hagridWifiProductUpgradeFragment.mNowVersionTv.setText(hagridWifiProductUpgradeFragment.mNowVersion);
            hagridWifiProductUpgradeFragment.showLatestVersionLayout(true);
            hagridWifiProductUpgradeFragment.mIsExistNewVer = true;
        }
    }
}
