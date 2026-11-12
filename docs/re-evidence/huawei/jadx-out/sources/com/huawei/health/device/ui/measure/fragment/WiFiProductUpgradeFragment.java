package com.huawei.health.device.ui.measure.fragment;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.ui.util.RoundProgressView;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.unite.DeviceServiceInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetWifiDeviceInfoReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetWifiDeviceInfoRsp;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceServiceInfoReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceServiceInfoRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.cpl;
import defpackage.dmp;
import defpackage.dyg;
import defpackage.ean;
import defpackage.eas;
import defpackage.eby;
import defpackage.ecf;
import defpackage.ecj;
import defpackage.ecr;
import defpackage.elk;
import defpackage.lqo;
import defpackage.njy;
import defpackage.piq;
import defpackage.pjc;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.qsp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class WiFiProductUpgradeFragment extends BaseFragment implements View.OnClickListener {
    private static final float ALPHA_VALUE_STATUS_DONG = 0.3f;
    private static final float ALPHA_VALUE_STATUS_NOMAL = 1.0f;
    private static final String CER_VERSION = "cer_version";
    private static final int DEFAULT_PADDING = 0;
    private static final String DEVICE_ID = "devId";
    private static final String DEVICE_PAIRING_GUIDE_ACTIVITY = "com.huawei.ui.device.activity.adddevice.PairingGuideActivity";
    private static final float FLOAT_WEIGHT_VALUE = 0.5f;
    private static final String KIND_ID = "kind_id";
    private static final int MSG_CHECKING_VERSION = 10;
    private static final int MSG_EXIST_NEW_VERSION = 3;
    private static final int MSG_GET_VERSION_FAIL = 2;
    private static final int MSG_GET_VERSION_SUCCESS = 1;
    private static final int MSG_NOT_EXIST_DEVICE = 4;
    private static final String PAIR_GUIDE = "pair_guide";
    private static final String PRODUCT_ID = "productId";
    private static final String TAG = "WiFiProductUpgradeFragment";
    private static final String UPDATE_NODES = "update_nodes";
    private static final String UUID_LIST = "uuid_list";
    private static final String VERSION = "version";
    private Context mContext;
    private ContentValues mDeviceInfo;
    private LinearLayout mUpdateLinearLayout;
    private RelativeLayout mUpdateRelativeLayout;
    private ImageView mVersionLogo;
    private String mProductId = null;
    private String mUniqueId = null;
    private String mNewVer = null;
    private HealthTextView mNowVersionText = null;
    private HealthTextView mNoNewVersionText = null;
    private HealthTextView mNewVersionText = null;
    private LinearLayout mLatestVersionLayout = null;
    private String mNowVersion = null;
    private String mReleaseNote = null;
    private WifiHandler mHandler = null;
    private RoundProgressView mRoundProgress = null;
    private HealthButton mCheckVersionUpdate = null;
    private eby mWiFiDevice = null;
    private boolean mIsExistNewVer = false;
    private boolean mIsFromProductView = false;
    private View.OnClickListener positiveListener = new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductUpgradeFragment$$ExternalSyntheticLambda2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f$0.m941x42da7332(view);
        }
    };

    /* JADX INFO: renamed from: lambda$new$0$com-huawei-health-device-ui-measure-fragment-WiFiProductUpgradeFragment, reason: not valid java name */
    /* synthetic */ void m941x42da7332(View view) {
        Fragment selectFragment = getSelectFragment(DeviceCategoryFragment.class);
        if (this.mIsFromProductView && selectFragment != null) {
            popupFragment(DeviceCategoryFragment.class);
            return;
        }
        elk elkVarSwitchProductGroupItem = switchProductGroupItem(ResourceManager.c().b().d(), HealthDevice.HealthDeviceKind.HDK_WEIGHT.name());
        if (this.mainActivity == null) {
            LogUtil.j(TAG, "positiveListener mainActivity is null");
        } else if (elkVarSwitchProductGroupItem != null) {
            LogUtil.a(TAG, "onClick item: ", elkVarSwitchProductGroupItem.toString());
            startPairingGuideActivity();
        } else {
            LogUtil.j(TAG, "WEIGHT ProductGroup is error");
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        LogUtil.d(TAG, "onCreateView child: ", this.child, " view: ", viewGroup2);
        this.child = layoutInflater.inflate(R.layout.wifi_upgrade_layout, viewGroup, false);
        this.mIsExistNewVer = getArguments().getBoolean("is_exist_new_version");
        initView();
        initData();
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
        }
        return viewGroup2;
    }

    private void initView() {
        setTitle(this.mainActivity.getString(R.string.IDS_device_wear_home_device_ota_upgrade));
        this.mUpdateLinearLayout = (LinearLayout) this.child.findViewById(R.id.update_img_linearlayout);
        this.mUpdateRelativeLayout = (RelativeLayout) this.child.findViewById(R.id.no_new_version_relativelayout);
        this.mNowVersionText = (HealthTextView) qsp.a(this.child, R.id.now_version_nodes_tv);
        this.mNoNewVersionText = (HealthTextView) qsp.a(this.child, R.id.no_new_version_tv);
        this.mNewVersionText = (HealthTextView) qsp.a(this.child, R.id.new_version_tv);
        this.mLatestVersionLayout = (LinearLayout) qsp.a(this.child, R.id.latest_version_button);
        this.mRoundProgress = (RoundProgressView) qsp.a(this.child, R.id.version_update_anim);
        this.mCheckVersionUpdate = (HealthButton) qsp.a(this.child, R.id.check_version_update);
        this.mVersionLogo = (ImageView) qsp.a(this.child, R.id.image_logo);
        this.mLatestVersionLayout.setOnClickListener(this);
        this.mCheckVersionUpdate.setOnClickListener(this);
        if (this.mIsExistNewVer) {
            showLatestVersionLayout(true);
        } else {
            showLatestVersionLayout(false);
        }
        initViewTahiti();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public void initViewTahiti() {
        super.initViewTahiti();
        Context context = BaseApplication.getContext();
        this.mContext = context;
        if (qrs.af(context)) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0, 0.5f);
            layoutParams.gravity = 1;
            this.mUpdateLinearLayout.setLayoutParams(layoutParams);
            this.mUpdateRelativeLayout.setLayoutParams(layoutParams);
        }
    }

    private void startPairingGuideActivity() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            LogUtil.j(TAG, "DeviceMainActivity is null");
            return;
        }
        List<pjc> listC = piq.e().c(this.mProductId);
        if (njy.e(listC)) {
            LogUtil.j(TAG, "DevicePluginInfoBean is null");
            return;
        }
        pjc pjcVar = listC.get(0);
        String strK = pjcVar.k();
        if (TextUtils.isEmpty(strK)) {
            LogUtil.j(TAG, "pairGuid is empty");
            return;
        }
        String strN = pjcVar.n();
        if (TextUtils.isEmpty(strN)) {
            LogUtil.j(TAG, "kindId is empty");
            return;
        }
        List<String> listS = pjcVar.s();
        if (njy.e(listS)) {
            LogUtil.j(TAG, "uuidList is empty");
            return;
        }
        Iterator<String> it = listS.iterator();
        while (it.hasNext()) {
            LogUtil.j(TAG, "uuidList uuid: ", it.next());
        }
        LogUtil.a(TAG, "pairGuide: ", strK, "kindId: ", strN);
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
            LogUtil.e(TAG, "startPairingGuideActivity ActivityNotFoundException");
        }
        activity.finish();
    }

    private void checkDevice() {
        if (this.mWiFiDevice == null) {
            LogUtil.j(TAG, "checkDevice() mWiFiDevice is null");
            return;
        }
        String devId = getDevId();
        if (TextUtils.isEmpty(devId)) {
            LogUtil.j(TAG, "devId is null");
            return;
        }
        WifiDeviceGetWifiDeviceInfoReq wifiDeviceGetWifiDeviceInfoReq = new WifiDeviceGetWifiDeviceInfoReq();
        wifiDeviceGetWifiDeviceInfoReq.setDevId(devId);
        lqo.b(this.mainActivity).b(wifiDeviceGetWifiDeviceInfoReq, new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductUpgradeFragment$$ExternalSyntheticLambda1
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f$0.m939xc8227991((WifiDeviceGetWifiDeviceInfoRsp) obj, str, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$checkDevice$1$com-huawei-health-device-ui-measure-fragment-WiFiProductUpgradeFragment, reason: not valid java name */
    /* synthetic */ void m939xc8227991(WifiDeviceGetWifiDeviceInfoRsp wifiDeviceGetWifiDeviceInfoRsp, String str, boolean z) {
        int iIntValue;
        String resultDesc;
        if (!z) {
            if (wifiDeviceGetWifiDeviceInfoRsp == null) {
                iIntValue = Constants.CODE_UNKNOWN_ERROR;
                resultDesc = "unknown error";
            } else {
                iIntValue = wifiDeviceGetWifiDeviceInfoRsp.getResultCode().intValue();
                resultDesc = wifiDeviceGetWifiDeviceInfoRsp.getResultDesc();
                if (iIntValue == 112000000) {
                    LogUtil.a(TAG, "device already not exists");
                    this.mHandler.sendEmptyMessage(4);
                }
            }
            LogUtil.a(TAG, "checkDevice() errCode: ", Integer.valueOf(iIntValue), " resultDesc: ", resultDesc);
            return;
        }
        if (wifiDeviceGetWifiDeviceInfoRsp == null || wifiDeviceGetWifiDeviceInfoRsp.getDeviceDetailInfo() != null) {
            LogUtil.a(TAG, "checkDevice() device already exists");
        } else {
            LogUtil.a(TAG, "checkDevice() device already not exists");
            this.mHandler.sendEmptyMessage(4);
        }
    }

    private elk switchProductGroupItem(ArrayList<elk> arrayList, String str) {
        elk elkVar = null;
        for (elk elkVar2 : arrayList) {
            LogUtil.a(TAG, " item.kind.name(): ", elkVar2.e().name(), " device_Type: ", str);
            if (elkVar2.e().name().equals(str)) {
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
        this.mHandler = new WifiHandler(this);
        ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
        this.mDeviceInfo = contentValues;
        if (contentValues != null) {
            this.mProductId = contentValues.getAsString("productId");
            this.mUniqueId = this.mDeviceInfo.getAsString("uniqueId");
        }
        if (!TextUtils.isEmpty(this.mUniqueId)) {
            if (dmp.d().b(this.mUniqueId, false) instanceof eby) {
                this.mWiFiDevice = (eby) dmp.d().b(this.mUniqueId, false);
            }
        } else {
            LogUtil.j(TAG, "productId is empty, can't get WiFiDevice");
        }
        reGetWifiDevice();
        if (this.mWiFiDevice == null) {
            LogUtil.j(TAG, "wifi device is null");
            this.mHandler.sendEmptyMessage(4);
        }
        this.mIsFromProductView = getArguments().getBoolean("fromProductView", false);
        if (this.mIsExistNewVer) {
            checkDevice();
            this.mNewVer = getArguments().getString("version");
            this.mNowVersion = getArguments().getString(CER_VERSION);
            this.mReleaseNote = getArguments().getString(UPDATE_NODES);
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            this.mHandler.sendMessage(messageObtain);
        } else {
            detectionExistNewVersion();
        }
        if ("a8ba095d-4123-43c4-a30a-0240011c58de".equals(this.mProductId)) {
            this.mVersionLogo.setImageResource(R.drawable.wifi_device_honor_ota_logo);
        } else if ("e4b0b1d5-2003-4d88-8b5f-c4f64542040b".equals(this.mProductId)) {
            this.mVersionLogo.setImageResource(R.drawable.wifi_device_ota_logo);
        } else {
            LogUtil.j(TAG, "other wifi product");
        }
        ecr.a(this.mainActivity.getApplicationContext()).a();
    }

    private void reGetWifiDevice() {
        if (this.mWiFiDevice == null) {
            MeasurableDevice measurableDeviceA = null;
            String string = getArguments() != null ? getArguments().getString(DEVICE_ID) : null;
            LogUtil.a(TAG, "initData mDeviceId: ", dyg.b(string));
            eby ebyVarD = !TextUtils.isEmpty(string) ? ecf.d(string) : null;
            if (ebyVarD != null && !TextUtils.isEmpty(ebyVarD.getSerialNumber())) {
                measurableDeviceA = dmp.d().a(ebyVarD.getSerialNumber(), false);
            }
            if (measurableDeviceA == null || !(measurableDeviceA instanceof eby)) {
                return;
            }
            this.mWiFiDevice = (eby) measurableDeviceA;
            if (TextUtils.isEmpty(this.mProductId)) {
                this.mProductId = this.mWiFiDevice.getProductId();
            }
            if (TextUtils.isEmpty(this.mUniqueId)) {
                this.mUniqueId = this.mWiFiDevice.getUniqueId();
            }
            if (this.mDeviceInfo == null) {
                this.mDeviceInfo = new ContentValues();
            }
            this.mDeviceInfo.put("uniqueId", this.mUniqueId);
            this.mDeviceInfo.put("productId", this.mProductId);
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
        getDeviceStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getDevId() {
        eby ebyVar = this.mWiFiDevice;
        if (ebyVar != null && ebyVar.a() != null) {
            LogUtil.a(TAG, "device info: ", this.mWiFiDevice.a().toString());
            String strC = this.mWiFiDevice.a().c();
            if (!TextUtils.isEmpty(strC)) {
                return strC;
            }
            LogUtil.j(TAG, "devId is null");
            return "";
        }
        LogUtil.j(TAG, "device id is null");
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showLatestVersionLayout(boolean z) {
        this.mLatestVersionLayout.setVisibility(z ? 0 : 8);
    }

    private void getDeviceStatus() {
        showLatestVersionLayout(false);
        WifiDeviceServiceInfoReq wifiDeviceServiceInfoReq = new WifiDeviceServiceInfoReq();
        String devId = getDevId();
        if (TextUtils.isEmpty(devId)) {
            LogUtil.j(TAG, "getDeviceStatus devId is null");
            return;
        }
        wifiDeviceServiceInfoReq.setDevId(devId);
        wifiDeviceServiceInfoReq.setSid("devOtaInfo");
        lqo.b(this.mainActivity.getApplicationContext()).d(wifiDeviceServiceInfoReq, new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductUpgradeFragment$$ExternalSyntheticLambda0
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f$0.m940x7044e9f2((WifiDeviceServiceInfoRsp) obj, str, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processDeviceInfo, reason: merged with bridge method [inline-methods] */
    public void m940x7044e9f2(WifiDeviceServiceInfoRsp wifiDeviceServiceInfoRsp, String str, boolean z) {
        Message messageObtain = Message.obtain();
        if (z) {
            messageObtain.what = 1;
            if (wifiDeviceServiceInfoRsp != null && wifiDeviceServiceInfoRsp.getDeviceServiceInfo() != null && !wifiDeviceServiceInfoRsp.getDeviceServiceInfo().isEmpty()) {
                for (DeviceServiceInfo deviceServiceInfo : wifiDeviceServiceInfoRsp.getDeviceServiceInfo()) {
                    LogUtil.d(TAG, "device service info size: ", Integer.valueOf(wifiDeviceServiceInfoRsp.getDeviceServiceInfo().size()));
                    Map<String, String> data = deviceServiceInfo.getData();
                    this.mNewVer = data.get("fwNewVer");
                    this.mNowVersion = data.get("fwCurVer");
                    this.mReleaseNote = data.get("releaseNote");
                    String str2 = data.get("status");
                    LogUtil.a(TAG, "service address: ", cpl.e(deviceServiceInfo.getSid()), ", note: ", this.mReleaseNote, ", newver: ", this.mNewVer, ", curver: ", this.mNowVersion, ", status: ", str2);
                    if (TextUtils.isEmpty(this.mNewVer) || TextUtils.isEmpty(this.mNowVersion)) {
                        messageObtain.what = 2;
                        break;
                    } else if (this.mNewVer.equals(this.mNowVersion) || str2 == null || !str2.equals("1")) {
                        LogUtil.j(TAG, "processDeviceInfo default");
                    } else {
                        messageObtain.what = 3;
                        LogUtil.d(TAG, "exist new version curver: ", this.mNowVersion, ", new ver: ", this.mNewVer);
                        break;
                    }
                }
            } else {
                messageObtain.what = 2;
                LogUtil.d(TAG, "get device info is empty.");
            }
            LogUtil.a(TAG, "res: ", wifiDeviceServiceInfoRsp, ", text: ", str);
        } else {
            if (wifiDeviceServiceInfoRsp != null && wifiDeviceServiceInfoRsp.getResultCode().intValue() == 112000000) {
                this.mHandler.sendEmptyMessage(4);
            }
            messageObtain.what = 2;
            LogUtil.d(TAG, "get device status fail. text: ", str);
        }
        this.mHandler.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDestroy() {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            return false;
        }
        LogUtil.j(TAG, "DeviceMainActivity is Destroyed");
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.latest_version_button) {
            WiFiVersionDetailsFragment wiFiVersionDetailsFragment = new WiFiVersionDetailsFragment();
            dyg.e(false, TAG, "onClick last version: ", wiFiVersionDetailsFragment);
            Bundle bundle = new Bundle();
            bundle.putString("productId", this.mProductId);
            bundle.putString("version", this.mNewVer);
            bundle.putString(CER_VERSION, this.mNowVersion);
            bundle.putString(UPDATE_NODES, this.mReleaseNote);
            bundle.putBoolean("show_update", true);
            bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
            wiFiVersionDetailsFragment.setArguments(bundle);
            switchFragment(wiFiVersionDetailsFragment);
            return;
        }
        if (view.getId() == R.id.check_version_update) {
            LogUtil.a(TAG, "check version update tag: ", view.getTag());
            if (view.getTag() == null || qrs.a(view.getTag().toString()) != 3) {
                detectionExistNewVersion();
                return;
            }
            WiFiUpdateGuideFragment wiFiUpdateGuideFragment = new WiFiUpdateGuideFragment();
            LogUtil.d(TAG, "onClick check version: ", wiFiUpdateGuideFragment);
            Bundle bundle2 = new Bundle();
            bundle2.putString("productId", this.mProductId);
            bundle2.putString("version", this.mNewVer);
            bundle2.putString(CER_VERSION, this.mNowVersion);
            bundle2.putString(UPDATE_NODES, this.mReleaseNote);
            bundle2.putParcelable("commonDeviceInfo", this.mDeviceInfo);
            wiFiUpdateGuideFragment.setArguments(bundle2);
            switchFragment(wiFiUpdateGuideFragment);
            return;
        }
        LogUtil.a(TAG, "--------no click------");
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mRoundProgress = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckVersionUpdateEnable(int i) {
        if (i == 1) {
            this.mCheckVersionUpdate.setAlpha(1.0f);
            this.mCheckVersionUpdate.setEnabled(true);
            this.mNoNewVersionText.setText(R.string.IDS_hwh_me_settings_app_update);
        } else if (i == 2) {
            this.mCheckVersionUpdate.setAlpha(1.0f);
            this.mCheckVersionUpdate.setEnabled(true);
            this.mNoNewVersionText.setText(R.string.IDS_device_wifi_ota_check_fail);
            this.mCheckVersionUpdate.setText(R.string.IDS_retry);
        } else if (i == 3) {
            this.mCheckVersionUpdate.setAlpha(1.0f);
            this.mCheckVersionUpdate.setEnabled(true);
            this.mCheckVersionUpdate.setText(R.string.IDS_device_manager_update_health);
            this.mNoNewVersionText.setText(R.string.IDS_ota_update_state_check_new_version);
        } else if (i == 10) {
            this.mCheckVersionUpdate.setAlpha(ALPHA_VALUE_STATUS_DONG);
            this.mCheckVersionUpdate.setEnabled(false);
            this.mCheckVersionUpdate.setText(R.string.IDS_ota_update_button_check_version);
            this.mNoNewVersionText.setText(R.string.IDS_ota_update_state_checking);
        } else {
            LogUtil.a(TAG, "check is empty");
        }
        this.mCheckVersionUpdate.setTag(Integer.valueOf(i));
    }

    static class WifiHandler extends StaticHandler<WiFiProductUpgradeFragment> {
        WifiHandler(WiFiProductUpgradeFragment wiFiProductUpgradeFragment) {
            super(wiFiProductUpgradeFragment);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        public void handleMessage(WiFiProductUpgradeFragment wiFiProductUpgradeFragment, Message message) {
            if (wiFiProductUpgradeFragment.isDestroy()) {
                return;
            }
            if (!wiFiProductUpgradeFragment.isAdded()) {
                LogUtil.j(WiFiProductUpgradeFragment.TAG, "WifiHandler mFragment is not add");
                return;
            }
            LogUtil.a(WiFiProductUpgradeFragment.TAG, "WifiHandler what: ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1) {
                if (wiFiProductUpgradeFragment.mNowVersion != null) {
                    wiFiProductUpgradeFragment.mNowVersionText.setText(wiFiProductUpgradeFragment.mNowVersion);
                }
                eas.b().c(wiFiProductUpgradeFragment.getDevId(), false);
                wiFiProductUpgradeFragment.mRoundProgress.a();
                wiFiProductUpgradeFragment.setCheckVersionUpdateEnable(1);
                return;
            }
            if (i == 2) {
                eas.b().c(wiFiProductUpgradeFragment.getDevId(), false);
                wiFiProductUpgradeFragment.mRoundProgress.a();
                wiFiProductUpgradeFragment.setCheckVersionUpdateEnable(2);
            } else {
                if (i != 3) {
                    if (i == 4) {
                        wiFiProductUpgradeFragment.showNoDeviceDialog();
                        return;
                    } else {
                        LogUtil.j(WiFiProductUpgradeFragment.TAG, "WifiHandler what is other");
                        return;
                    }
                }
                eas.b().c(wiFiProductUpgradeFragment.getDevId(), true);
                wiFiProductUpgradeFragment.mRoundProgress.a();
                wiFiProductUpgradeFragment.setCheckVersionUpdateEnable(3);
                wiFiProductUpgradeFragment.mNewVersionText.setText(wiFiProductUpgradeFragment.mNewVer);
                wiFiProductUpgradeFragment.mNowVersionText.setText(wiFiProductUpgradeFragment.mNowVersion);
                wiFiProductUpgradeFragment.showLatestVersionLayout(true);
                wiFiProductUpgradeFragment.mIsExistNewVer = true;
            }
        }
    }
}
