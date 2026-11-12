package com.huawei.health.device.ui.measure.fragment;

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
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.ui.util.RoundProgressView;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.device.wifi.interfaces.BaseCallbackInterface;
import com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.DeviceServiceInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceControlDataModelReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetDeviceStatusReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetDeviceStatusRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dmp;
import defpackage.dti;
import defpackage.dyj;
import defpackage.dys;
import defpackage.ean;
import defpackage.eas;
import defpackage.eby;
import defpackage.ecr;
import defpackage.era;
import defpackage.lqo;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class HagridWiFiOtaUpdateFragment extends BaseFragment implements View.OnClickListener {
    private static final String CER_VERSION = "cer_version";
    private static final int DEFAULT_VALUE = 0;
    private static final String GET_NETWORK_DEVICE_VERSION = "getNetworkDeviceVersion";
    private static final int MSG_DEVICE_OFFLINE = 6;
    private static final int MSG_DEVICE_ONLINE = 5;
    private static final int MSG_UPDATE_END = 4;
    private static final int MSG_UPDATE_FAIL = 3;
    private static final int MSG_UPDATE_SUCCESS = 2;
    private static final int MSG_UPDATING = 1;
    private static final String TAG = "HagridWiFiOtaUpdateFragment";
    private static final String TAG_RELEASE = "R_Weight_HagridWiFiOtaUpdateFragment";
    private static final String UPDATE_NODES = "update_nodes";
    private static final int UPGRADE_STATUS_NORMAL = 0;
    private static final String VERSION = "version";
    private static final float VESION_UPDATE_ALPHA = 0.3f;
    private BaseCallbackInterface mBaseCallback;
    private String mUniqueId;
    private ImageView mVersionLogo;
    private dti mWeightInteractor;
    private String mProductId = null;
    private String mNewVer = null;
    private String mReleaseNote = null;
    private String mNowVersion = null;
    private boolean isFromProductView = false;
    private HealthTextView mNowVersionTv = null;
    private HealthTextView mNewVersionTv = null;
    private HealthTextView mNoNewVersionTv = null;
    private HealthTextView mOtaUpgradeTipOneTv = null;
    private HealthTextView mOtaUpgradeTipTwoTv = null;
    private LinearLayout mLatestVersionLayout = null;
    private LinearLayout mNowVersionLayout = null;
    private WifiHandler mHandler = null;
    private RoundProgressView mRoundProgress = null;
    private HealthButton mCheckVersionUpdate = null;
    private eby mWiFiDevice = null;
    private int mUpgradeStatus = 0;
    private ContentValues mDeviceInfo = null;
    private BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() { // from class: com.huawei.health.device.ui.measure.fragment.HagridWiFiOtaUpdateFragment.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j(HagridWiFiOtaUpdateFragment.TAG, "mBroadcastReceiver intent is null");
                return;
            }
            String action = intent.getAction();
            LogUtil.a(HagridWiFiOtaUpdateFragment.TAG, "mBroadcastReceiver onReceive: action = ", action);
            if (!"action_app_check_new_version_state".equals(action)) {
                LogUtil.j(HagridWiFiOtaUpdateFragment.TAG, "mBroadcastReceiver other action");
                return;
            }
            int intExtra = intent.getIntExtra("state", 0);
            if (intExtra != 50) {
                LogUtil.a(HagridWiFiOtaUpdateFragment.TAG, "mBroadcastReceiver other state:", Integer.valueOf(intExtra));
                HagridWiFiOtaUpdateFragment.this.startUpgrade();
                return;
            }
            HagridWiFiOtaUpdateFragment.this.mNewVer = intent.getStringExtra("content");
            ReleaseLogUtil.d(HagridWiFiOtaUpdateFragment.TAG_RELEASE, "mBroadcastReceiver mNewVer:", HagridWiFiOtaUpdateFragment.this.mNewVer, ",mNowVersion:", HagridWiFiOtaUpdateFragment.this.mNowVersion);
            if (TextUtils.isEmpty(HagridWiFiOtaUpdateFragment.this.mNewVer) || TextUtils.isEmpty(HagridWiFiOtaUpdateFragment.this.mNowVersion)) {
                HagridWiFiOtaUpdateFragment.this.startUpgrade();
            } else if (!HagridWiFiOtaUpdateFragment.this.mNewVer.equals(HagridWiFiOtaUpdateFragment.this.mNowVersion)) {
                HagridWiFiOtaUpdateFragment.this.startUpgrade();
            } else {
                HagridWiFiOtaUpdateFragment.this.setCheckVersionUpdateEnable(2);
            }
        }
    };

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.child = layoutInflater.inflate(R.layout.wifi_upgrade_layout, viewGroup, false);
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        initView();
        initData();
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
        }
        this.mWeightInteractor = dti.d(this.mainActivity, this.mProductId, this.mUniqueId);
        return viewGroup2;
    }

    private void initView() {
        setTitle(this.mainActivity.getString(R.string.IDS_device_scale_device_firmware_version));
        this.mNowVersionTv = (HealthTextView) qsp.a(this.child, R.id.now_version_nodes_tv);
        this.mNoNewVersionTv = (HealthTextView) qsp.a(this.child, R.id.no_new_version_tv);
        this.mOtaUpgradeTipOneTv = (HealthTextView) qsp.a(this.child, R.id.ota_upgrade_tip_one_tv);
        this.mOtaUpgradeTipTwoTv = (HealthTextView) qsp.a(this.child, R.id.ota_upgrade_tip_two_tv);
        this.mNewVersionTv = (HealthTextView) qsp.a(this.child, R.id.new_version_tv);
        this.mVersionLogo = (ImageView) qsp.a(this.child, R.id.image_logo);
        this.mLatestVersionLayout = (LinearLayout) qsp.a(this.child, R.id.latest_version_button);
        this.mRoundProgress = (RoundProgressView) qsp.a(this.child, R.id.version_update_anim);
        this.mCheckVersionUpdate = (HealthButton) qsp.a(this.child, R.id.check_version_update);
        this.mNowVersionLayout = (LinearLayout) qsp.a(this.child, R.id.now_version_layout);
        this.mOtaUpgradeTipOneTv.setVisibility(8);
        this.mOtaUpgradeTipTwoTv.setVisibility(8);
        this.mNowVersionLayout.setEnabled(false);
        this.mLatestVersionLayout.setOnClickListener(this);
        this.mCheckVersionUpdate.setOnClickListener(this);
        this.mLatestVersionLayout.setVisibility(0);
        this.mCheckVersionUpdate.setText(R.string.IDS_update_new_version_ok);
        this.mOtaUpgradeTipOneTv.setText(String.format(Locale.ROOT, this.mainActivity.getString(R.string.IDS_device_ota_upgrade_tip_one), 1));
        this.mOtaUpgradeTipTwoTv.setText(String.format(Locale.ROOT, this.mainActivity.getString(R.string.IDS_device_ota_upgrade_tip_two), 2));
    }

    private void initData() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_app_check_new_version_state");
        BroadcastManagerUtil.c(this.mainActivity, this.mBroadcastReceiver, intentFilter, LocalBroadcast.f36595c, null);
        this.mBaseCallback = new OtaStatusCallback(this);
        this.mHandler = new WifiHandler();
        if (getArguments() != null) {
            ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
            this.mDeviceInfo = contentValues;
            if (contentValues != null) {
                this.mProductId = contentValues.getAsString("productId");
                this.mUniqueId = this.mDeviceInfo.getAsString("uniqueId");
            }
            this.mNewVer = getArguments().getString("version");
            this.mNowVersion = getArguments().getString(CER_VERSION);
            this.mReleaseNote = getArguments().getString(UPDATE_NODES);
            this.mNewVersionTv.setText(this.mNewVer);
            this.mNowVersionTv.setText(this.mNowVersion);
            this.isFromProductView = getArguments().getBoolean("fromProductView");
            ContentValues contentValues2 = this.mDeviceInfo;
            if (contentValues2 != null && !TextUtils.isEmpty(contentValues2.getAsString("uniqueId"))) {
                MeasurableDevice measurableDeviceB = dmp.d().b(this.mDeviceInfo.getAsString("uniqueId"), false);
                if (measurableDeviceB instanceof eby) {
                    this.mWiFiDevice = (eby) measurableDeviceB;
                }
            }
            if (this.mWiFiDevice == null) {
                LogUtil.j(TAG_RELEASE, "initData WiFiDevice is empty");
                popupFragment(HagridDeviceManagerFragment.class);
                return;
            }
            era.d(this.mVersionLogo, this.mProductId);
            LogUtil.a(TAG, "initData mUpgradeStatus:", Integer.valueOf(this.mUpgradeStatus));
            if (this.isFromProductView) {
                initStatusData();
                return;
            }
            int i = this.mUpgradeStatus;
            if (i == 0) {
                startUpgrade();
            } else {
                setCheckVersionUpdateEnable(i);
            }
        }
    }

    private void initStatusData() {
        String str = eas.b().c(this.mWiFiDevice.e()).get("status");
        LogUtil.a(TAG, "initStatusData otaStatus:", str);
        int i = this.mUpgradeStatus;
        if (i == 0) {
            if ("3".equals(str)) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                this.mHandler.sendMessage(messageObtain);
                return;
            } else {
                if ("2".equals(str)) {
                    LogUtil.a(TAG, "initStatusData start update");
                    this.mLatestVersionLayout.setEnabled(false);
                    dyj.d(this.mProductId, this.mNowVersion, this.mNewVer, this.mDeviceInfo);
                    setCheckVersionUpdateEnable(1);
                    ecr.a(this.mainActivity.getApplicationContext()).a(this.mUniqueId, this.mBaseCallback);
                    return;
                }
                LogUtil.j(TAG, "initStatusData otaStatus is error");
                return;
            }
        }
        setCheckVersionUpdateEnable(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startUpgrade() {
        LogUtil.a(TAG, "startUpgrade");
        this.mLatestVersionLayout.setEnabled(false);
        dyj.d(this.mProductId, this.mNowVersion, this.mNewVer, this.mDeviceInfo);
        setCheckVersionUpdateEnable(1);
        updatingVersion("CH");
    }

    private void updatingVersion(String str) {
        WifiDeviceControlDataModelReq wifiDeviceControlDataModelReq = new WifiDeviceControlDataModelReq();
        ArrayList arrayList = new ArrayList(16);
        HashMap map = new HashMap(16);
        wifiDeviceControlDataModelReq.setDeviceServiceInfo(arrayList);
        eby ebyVar = this.mWiFiDevice;
        if (ebyVar != null && ebyVar.a() != null) {
            wifiDeviceControlDataModelReq.setDevId(this.mWiFiDevice.a().c());
        } else {
            LogUtil.j(TAG_RELEASE, "update device id is null");
        }
        map.put("event", "2");
        map.put("version", str);
        DeviceServiceInfo deviceServiceInfo = new DeviceServiceInfo();
        deviceServiceInfo.setData(map);
        deviceServiceInfo.setSid("setDevParam");
        arrayList.add(deviceServiceInfo);
        LogUtil.a(TAG, "version: ", map.get("version"), ", event: " + map.get("event"));
        if (this.mainActivity == null) {
            LogUtil.j(TAG, "updatingVersion mainActivity is null");
            setCheckVersionUpdateEnable(3);
        } else {
            lqo.b(this.mainActivity.getApplicationContext()).e(wifiDeviceControlDataModelReq, new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.HagridWiFiOtaUpdateFragment$$ExternalSyntheticLambda0
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str2, boolean z) {
                    this.f$0.m886x7897856f((CloudCommonReponse) obj, str2, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$updatingVersion$0$com-huawei-health-device-ui-measure-fragment-HagridWiFiOtaUpdateFragment, reason: not valid java name */
    /* synthetic */ void m886x7897856f(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        ReleaseLogUtil.d(TAG_RELEASE, "send update version. cloudCommonReponse: ", cloudCommonReponse, ", is success: ", Boolean.valueOf(z));
        Message messageObtain = Message.obtain();
        if (z) {
            messageObtain.what = 2;
        } else {
            messageObtain.what = 3;
        }
        this.mHandler.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDestroy() {
        FragmentActivity activity = getActivity();
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.latest_version_button) {
            Bundle bundle = new Bundle();
            bundle.putString("productId", this.mProductId);
            bundle.putString("version", this.mNewVer);
            bundle.putString(CER_VERSION, this.mNowVersion);
            bundle.putString(UPDATE_NODES, this.mReleaseNote);
            bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
            HagridWifiVersionDetailsFragment hagridWifiVersionDetailsFragment = new HagridWifiVersionDetailsFragment();
            hagridWifiVersionDetailsFragment.setArguments(bundle);
            switchFragment(hagridWifiVersionDetailsFragment);
            return;
        }
        if (id == R.id.check_version_update) {
            LogUtil.a(TAG, " UpgradeStatus =", Integer.valueOf(this.mUpgradeStatus));
            int i = this.mUpgradeStatus;
            if (i == 0) {
                if (qrs.r()) {
                    LogUtil.a(TAG, "isFastClick");
                    return;
                } else {
                    checkDeviceStatus();
                    return;
                }
            }
            if (i == 3) {
                LogUtil.j(TAG_RELEASE, "update fail.");
                restartUpgrade();
                return;
            } else if (i == 2) {
                LogUtil.a(TAG, "update success.");
                onBackPressed();
                return;
            } else {
                LogUtil.a(TAG, "onclick status:", Integer.valueOf(i));
                return;
            }
        }
        LogUtil.j(TAG_RELEASE, "no click");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showWifiOtaActivationPromptDialog() {
        dys.a().i(this.mainActivity);
    }

    private void checkDeviceStatus() {
        WifiDeviceGetDeviceStatusReq wifiDeviceGetDeviceStatusReq = new WifiDeviceGetDeviceStatusReq();
        eby ebyVar = this.mWiFiDevice;
        if (ebyVar != null && ebyVar.a() != null) {
            wifiDeviceGetDeviceStatusReq.setDevId(this.mWiFiDevice.a().c());
            lqo.b(BaseApplication.getContext()).c(wifiDeviceGetDeviceStatusReq, new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.HagridWiFiOtaUpdateFragment$$ExternalSyntheticLambda1
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z) {
                    this.f$0.m885xb3e48030((WifiDeviceGetDeviceStatusRsp) obj, str, z);
                }
            });
        } else {
            LogUtil.j(TAG, "checkDeviceStatus device id is null");
        }
    }

    /* JADX INFO: renamed from: lambda$checkDeviceStatus$1$com-huawei-health-device-ui-measure-fragment-HagridWiFiOtaUpdateFragment, reason: not valid java name */
    /* synthetic */ void m885xb3e48030(WifiDeviceGetDeviceStatusRsp wifiDeviceGetDeviceStatusRsp, String str, boolean z) {
        LogUtil.a(TAG, "get device status: ", wifiDeviceGetDeviceStatusRsp, ", text: ", str, ", is success: ", Boolean.valueOf(z));
        if (this.mHandler == null) {
            LogUtil.j(TAG, "checkDeviceOnlineStatus :mHandler is null");
            return;
        }
        Message messageObtain = Message.obtain();
        if (wifiDeviceGetDeviceStatusRsp != null && !TextUtils.isEmpty(wifiDeviceGetDeviceStatusRsp.getStatus()) && wifiDeviceGetDeviceStatusRsp.getStatus().equals(CustomTabsCallback.ONLINE_EXTRAS_KEY)) {
            messageObtain.what = 5;
        } else {
            messageObtain.what = 6;
        }
        this.mHandler.sendMessage(messageObtain);
    }

    private void restartUpgrade() {
        dti dtiVar = this.mWeightInteractor;
        boolean zC = dtiVar != null ? dtiVar.c() : false;
        LogUtil.a(TAG, "restartUpgrade device connect :", Boolean.valueOf(zC));
        Fragment selectFragment = getSelectFragment(HagridWifiUpdateGuideFragment.class);
        LogUtil.a(TAG, " fragment is null ? ", Boolean.valueOf(selectFragment == null));
        if (zC) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(GET_NETWORK_DEVICE_VERSION, true);
            EventBus.a(new EventBus.d("get_scale_version_code", bundle));
            this.mRoundProgress.e();
            setCheckVersionUpdateEnable(1);
            return;
        }
        if (selectFragment != null) {
            popupFragment(HagridWifiUpdateGuideFragment.class);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("productId", this.mProductId);
        bundle2.putString("version", this.mNewVer);
        bundle2.putString(CER_VERSION, this.mNowVersion);
        bundle2.putString(UPDATE_NODES, this.mReleaseNote);
        bundle2.putString("devId", this.mWiFiDevice.e());
        bundle2.putParcelable("commonDeviceInfo", this.mDeviceInfo);
        HagridWifiUpdateGuideFragment hagridWifiUpdateGuideFragment = new HagridWifiUpdateGuideFragment();
        hagridWifiUpdateGuideFragment.setArguments(bundle2);
        switchFragment(hagridWifiUpdateGuideFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckVersionUpdateEnable(int i) {
        if (i == 1) {
            this.mOtaUpgradeTipOneTv.setVisibility(8);
            this.mOtaUpgradeTipTwoTv.setVisibility(8);
            this.mRoundProgress.e();
            this.mNoNewVersionTv.setText(R.string.IDS_app_update_updating);
            this.mCheckVersionUpdate.setAlpha(VESION_UPDATE_ALPHA);
            this.mCheckVersionUpdate.setEnabled(false);
            this.mCheckVersionUpdate.setText(R.string.IDS_ota_update_state_upgrading);
        } else if (i == 2) {
            this.mOtaUpgradeTipOneTv.setVisibility(8);
            this.mOtaUpgradeTipTwoTv.setVisibility(8);
            this.mNoNewVersionTv.setText(R.string.IDS_settings_firmware_upgrade_talk_band_succeed);
            this.mCheckVersionUpdate.setAlpha(1.0f);
            this.mCheckVersionUpdate.setEnabled(true);
            this.mCheckVersionUpdate.setText(R.string.IDS_device_show_complete);
        } else if (i == 3) {
            this.mOtaUpgradeTipOneTv.setVisibility(0);
            this.mOtaUpgradeTipTwoTv.setVisibility(0);
            this.mNoNewVersionTv.setText(R.string.IDS_device_ota_upgrade_title);
            this.mCheckVersionUpdate.setAlpha(1.0f);
            this.mCheckVersionUpdate.setEnabled(true);
            this.mCheckVersionUpdate.setText(R.string.IDS_retry);
        } else {
            this.mOtaUpgradeTipOneTv.setVisibility(8);
            this.mOtaUpgradeTipTwoTv.setVisibility(8);
            LogUtil.j(TAG_RELEASE, "check is empty");
        }
        this.mUpgradeStatus = i;
    }

    static class WifiHandler extends StaticHandler<HagridWiFiOtaUpdateFragment> {
        private WifiHandler(HagridWiFiOtaUpdateFragment hagridWiFiOtaUpdateFragment) {
            super(hagridWiFiOtaUpdateFragment);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        public void handleMessage(HagridWiFiOtaUpdateFragment hagridWiFiOtaUpdateFragment, Message message) {
            if (hagridWiFiOtaUpdateFragment.isDestroy()) {
            }
            if (!hagridWiFiOtaUpdateFragment.isAdded()) {
                LogUtil.j(HagridWiFiOtaUpdateFragment.TAG_RELEASE, "WifiHandler mFragment is not add");
                return;
            }
            ReleaseLogUtil.d(HagridWiFiOtaUpdateFragment.TAG_RELEASE, "WifiHandler what: ", Integer.valueOf(message.what));
            switch (message.what) {
                case 1:
                    hagridWiFiOtaUpdateFragment.mRoundProgress.a();
                    hagridWiFiOtaUpdateFragment.setCheckVersionUpdateEnable(1);
                    break;
                case 2:
                    hagridWiFiOtaUpdateFragment.checkUpdateResult();
                    break;
                case 3:
                    hagridWiFiOtaUpdateFragment.mLatestVersionLayout.setEnabled(true);
                    hagridWiFiOtaUpdateFragment.mRoundProgress.a();
                    hagridWiFiOtaUpdateFragment.setCheckVersionUpdateEnable(3);
                    break;
                case 4:
                    HagridWiFiOtaUpdateFragment.updateEnd(hagridWiFiOtaUpdateFragment);
                    break;
                case 5:
                    hagridWiFiOtaUpdateFragment.startUpgrade();
                    break;
                case 6:
                    hagridWiFiOtaUpdateFragment.showWifiOtaActivationPromptDialog();
                    break;
                default:
                    LogUtil.j(HagridWiFiOtaUpdateFragment.TAG, "WifiHandler what is other");
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateEnd(HagridWiFiOtaUpdateFragment hagridWiFiOtaUpdateFragment) {
        eas.b().c(hagridWiFiOtaUpdateFragment.mWiFiDevice.e(), false);
        hagridWiFiOtaUpdateFragment.mLatestVersionLayout.setEnabled(true);
        hagridWiFiOtaUpdateFragment.mLatestVersionLayout.setVisibility(8);
        hagridWiFiOtaUpdateFragment.mNowVersionTv.setText(hagridWiFiOtaUpdateFragment.mNewVer);
        hagridWiFiOtaUpdateFragment.mRoundProgress.a();
        hagridWiFiOtaUpdateFragment.setCheckVersionUpdateEnable(2);
        Map<String, String> mapC = eas.b().c(hagridWiFiOtaUpdateFragment.mWiFiDevice.e());
        mapC.put("status", "1");
        eas.b().a(hagridWiFiOtaUpdateFragment.mWiFiDevice.e(), mapC);
        ean.c(hagridWiFiOtaUpdateFragment.mWiFiDevice.e(), (CommBaseCallbackInterface) null);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        if (this.mBroadcastReceiver != null) {
            this.mainActivity.unregisterReceiver(this.mBroadcastReceiver);
        }
        popupFragment(HagridDeviceManagerFragment.class);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUpdateResult() {
        ecr.a(this.mainActivity.getApplicationContext()).c(this.mUniqueId, this.mBaseCallback);
    }

    class OtaStatusCallback implements BaseCallbackInterface {
        private WeakReference<HagridWiFiOtaUpdateFragment> mActivity;

        private OtaStatusCallback(HagridWiFiOtaUpdateFragment hagridWiFiOtaUpdateFragment) {
            this.mActivity = new WeakReference<>(hagridWiFiOtaUpdateFragment);
        }

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallbackInterface
        public void onSuccess(Object obj) {
            if (isDestroy() || HagridWiFiOtaUpdateFragment.this.mHandler == null) {
                LogUtil.j(HagridWiFiOtaUpdateFragment.TAG, "onSuccess: isDestroy or mHandler is null");
                return;
            }
            if (!(obj instanceof ContentValues)) {
                LogUtil.j(HagridWiFiOtaUpdateFragment.TAG, "onSuccess: Incorrect parameter type.");
                return;
            }
            Message messageObtain = Message.obtain();
            if (HagridWiFiOtaUpdateFragment.this.isOtaSuccess((ContentValues) obj)) {
                messageObtain.what = 4;
            } else {
                messageObtain.what = 3;
            }
            HagridWiFiOtaUpdateFragment.this.mHandler.sendMessage(messageObtain);
        }

        private boolean isDestroy() {
            WeakReference<HagridWiFiOtaUpdateFragment> weakReference = this.mActivity;
            if (weakReference == null) {
                return true;
            }
            HagridWiFiOtaUpdateFragment hagridWiFiOtaUpdateFragment = weakReference.get() instanceof HagridWiFiOtaUpdateFragment ? this.mActivity.get() : null;
            return hagridWiFiOtaUpdateFragment == null || hagridWiFiOtaUpdateFragment.isDestory();
        }

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallbackInterface
        public void onFailure(int i) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            HagridWiFiOtaUpdateFragment.this.mHandler.sendMessage(messageObtain);
        }

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallbackInterface
        public void onStatus(int i) {
            if (HagridWiFiOtaUpdateFragment.this.mainActivity != null) {
                HagridWiFiOtaUpdateFragment.this.mainActivity.runOnUiThread(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.HagridWiFiOtaUpdateFragment$OtaStatusCallback$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m887xce346805();
                    }
                });
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            HagridWiFiOtaUpdateFragment.this.mHandler.sendMessage(messageObtain);
        }

        /* JADX INFO: renamed from: lambda$onStatus$0$com-huawei-health-device-ui-measure-fragment-HagridWiFiOtaUpdateFragment$OtaStatusCallback, reason: not valid java name */
        /* synthetic */ void m887xce346805() {
            qpx.e(HagridWiFiOtaUpdateFragment.this.mainActivity, R.string.IDS_device_wifi_not_network);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isOtaSuccess(ContentValues contentValues) {
        String asString = contentValues.getAsString("fwCurVer");
        String asString2 = contentValues.getAsString("status");
        if (TextUtils.isEmpty(asString) || TextUtils.isEmpty(asString2)) {
            LogUtil.j(TAG, "isOtaSuccess nowVersionDevice or status is empty");
            return false;
        }
        if (!TextUtils.equals(asString, this.mNowVersion)) {
            return "3".equals(asString2);
        }
        LogUtil.j(TAG, "isOtaSuccess: device version No change after the ota upgrade");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDestory() {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            LogUtil.j(TAG, "DeviceMainActivity is Destroyed");
            return true;
        }
        if (isAdded()) {
            return false;
        }
        LogUtil.j(TAG, "MyHandler mFragment is not add");
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        LogUtil.a(TAG, "onDestroyView");
        RoundProgressView roundProgressView = this.mRoundProgress;
        if (roundProgressView != null) {
            roundProgressView.a();
        }
        super.onDestroyView();
    }
}
