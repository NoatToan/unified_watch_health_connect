package com.huawei.health.ecologydevice.ui.measure.fragment;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.huawei.ecologydevice.R;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.api.DeviceMainActivityApi;
import com.huawei.health.device.api.VersionVerifyUtilApi;
import com.huawei.health.device.callback.VersionNoSupportCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.constants.WeightConstants;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack;
import com.huawei.health.ecologydevice.callback.IdialogButtonClickCallback;
import com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack;
import com.huawei.health.ecologydevice.fitness.ScannerController;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.manager.RopeCloudAuthManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceBindFailedFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceConnectingFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.utils.ProductCreateFactory;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.dmg;
import defpackage.dxw;
import defpackage.efj;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.emk;
import defpackage.enq;
import defpackage.epq;
import defpackage.eqt;
import defpackage.eqw;
import defpackage.era;
import defpackage.eru;
import defpackage.etg;
import defpackage.etk;
import defpackage.etn;
import defpackage.njy;
import defpackage.pig;
import defpackage.pip;
import defpackage.piq;
import defpackage.pis;
import defpackage.piu;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class RopeSkippingGuideFragment extends BaseFragment {
    private static final int DELAY_500MS = 500;
    private static final int DELAY_TIME = 500;
    private static final int DEVICE_SCAN_REFRESH = 0;
    private static final int DEVICE_SCAN_TIMEOUT = 1;
    private static final int DOWNLOAD_RESOURCE_SUCCESS = 104;
    private static final int DOWNLOAD_TIME_OUT = 108;
    private static final int DOWNLOAD_TIME_OUT_DELAY_30000MS = 30000;
    private static final String HUAWEI_FIT = "HUAWEI FIT";
    private static final String ISBIND_SUCCESS = "isBindSuccess";
    private static final String PRODUCT_ID = "productId";
    private static final String RELEASE_TAG = "EcologyDevice_RopeSkippingGuideFragment";
    private static final String ROPE_DEVICE_CONNECTING = "ropeDeviceConnecting";
    private static final int SCAN_DEVICE = 109;
    private static final String TAG = "PDROPE_RopeSkippingGuideFragment";
    private ActivityResultLauncher mActivityResultLauncherBt;
    private ActivityResultLauncher mActivityResultLauncherLocation;
    private String mDeviceBleName;
    private String mDeviceMac;
    private String mDevicePid;
    private String mEnterType;
    private HealthButton mFinishButton;
    private boolean mIsGoRopeJump;
    private HealthTextView mPairSuccess;
    private HealthTextView mPairing;
    private String mProductId;
    private elh mProductInfo;
    private ScannerController mScannerController;
    private String mTitle;
    private ImageView mWaitingImg;
    private HealthDevice.HealthDeviceKind mKind = HealthDevice.HealthDeviceKind.HDK_ROPE_SKIPPING;
    private RopeHandler mHandler = new RopeHandler();
    private BluetoothAdapter mBluetoothAdapter = null;
    private boolean mIsBtEnableShowing = false;
    private boolean mIsDownloadFail = false;
    private ArrayList<HealthDevice> mListHealthDevice = new ArrayList<>();
    private String mMainTitleStr = HUAWEI_FIT;
    private ScannerController.ScanResultCallback mResultCallback = new ScannerController.ScanResultCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.RopeSkippingGuideFragment.1
        @Override // com.huawei.health.ecologydevice.fitness.ScannerController.ScanResultCallback
        public void onResult(int i, HealthDevice healthDevice) {
            if (i == 1) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 0;
                messageObtain.obj = healthDevice;
                RopeSkippingGuideFragment.this.mHandler.sendMessage(messageObtain);
                RopeSkippingGuideFragment ropeSkippingGuideFragment = RopeSkippingGuideFragment.this;
                ropeSkippingGuideFragment.tickBiNfcConnectRope(ropeSkippingGuideFragment.mainActivity, 2);
                return;
            }
            if (i == 2) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 1;
                RopeSkippingGuideFragment.this.mHandler.sendMessage(messageObtain2);
                RopeSkippingGuideFragment ropeSkippingGuideFragment2 = RopeSkippingGuideFragment.this;
                ropeSkippingGuideFragment2.tickBiNfcConnectRope(ropeSkippingGuideFragment2.mainActivity, 0);
                return;
            }
            if (i == 3) {
                boolean zC = enq.d().c();
                boolean zG = enq.d().g(RopeSkippingGuideFragment.this.mProductId);
                if (zC && zG) {
                    HealthDevice healthDeviceB = enq.d().b(RopeSkippingGuideFragment.this.mProductId);
                    Message messageObtain3 = Message.obtain();
                    messageObtain3.what = 0;
                    messageObtain3.obj = healthDeviceB;
                    RopeSkippingGuideFragment.this.mHandler.sendMessage(messageObtain3);
                    RopeSkippingGuideFragment ropeSkippingGuideFragment3 = RopeSkippingGuideFragment.this;
                    ropeSkippingGuideFragment3.tickBiNfcConnectRope(ropeSkippingGuideFragment3.mainActivity, 0);
                    return;
                }
                return;
            }
            LogUtil.d("other branch", new Object[0]);
        }
    };
    private DownloadResultCallBack mDownloadResultCallback = new DownloadResultCallBack() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.RopeSkippingGuideFragment.2
        @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack
        public void setDownloadStatus(int i, int i2) {
            if (i == 0) {
                return;
            }
            LogUtil.a(RopeSkippingGuideFragment.TAG, "setDownloadStatus status: ", Integer.valueOf(i));
            if (i != 1) {
                RopeSkippingGuideFragment.this.sendEmptyMessage(108);
            } else {
                piq.e().c();
                RopeSkippingGuideFragment.this.handleUpdateProductMap();
            }
            ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).onDownloadIndexAllDestroy();
        }
    };

    private void initParam(Bundle bundle) {
        if (bundle == null) {
            LogUtil.a(TAG, "bundle is null");
        }
        if (!TextUtils.isEmpty(bundle.getString("PAYLOAD_FROM_NFC"))) {
            this.mIsGoRopeJump = true;
        }
        if (bundle.getBoolean("KEY_TO_GET_START_FROM_QRCODE")) {
            this.mIsGoRopeJump = bundle.getBoolean("KEY_TO_GET_START_FROM_QRCODE");
        }
        this.mDevicePid = bundle.getString("PID_FROM_QRCODE");
        this.mDeviceMac = bundle.getString("BLE_FROM_QRCODE");
        String string = bundle.getString("BLENAME_FROM_QRCODE");
        this.mDeviceBleName = string;
        LogUtil.a(TAG, "RopeSkippingGuideFragment", " mDevicePid=", this.mDevicePid, " mDeviceBleName=", string);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        initParam(arguments);
        if (!isNeedScanAndBind()) {
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        if (layoutInflater == null) {
            LogUtil.d(TAG, "onCreateView inflater is null");
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            return null;
        }
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        this.mCustomTitleBar.setCustomTitleBarTypeNormal();
        View viewInflate = layoutInflater.inflate(R.layout.device_rope_skipping_guid, (ViewGroup) null);
        if (viewGroup2 != null) {
            viewGroup2.addView(viewInflate);
        }
        LogUtil.d(TAG, "onCreateView");
        initView(viewInflate);
        this.mTitle = getArguments().getString("title");
        this.mCustomTitleBar.setTitleText(this.mTitle);
        registerActivityResultLocation();
        registerActivityResultBt();
        if (arguments != null && arguments.getBoolean(ISBIND_SUCCESS)) {
            new Handler().postDelayed(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.RopeSkippingGuideFragment$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1024x7cf8f91();
                }
            }, 500L);
        } else if (arguments != null && arguments.getBoolean("KEY_TO_GET_START_FROM_QRCODE")) {
            initDownLoad();
        } else {
            this.mWaitingImg.setBackgroundResource(R.drawable.ic_connect_failed);
        }
        initViewClickListener();
        initDeviceInfo();
        return viewGroup2;
    }

    /* JADX INFO: renamed from: lambda$onCreateView$0$com-huawei-health-ecologydevice-ui-measure-fragment-RopeSkippingGuideFragment, reason: not valid java name */
    /* synthetic */ void m1024x7cf8f91() {
        this.mPairing.setVisibility(8);
        this.mFinishButton.setVisibility(0);
        this.mPairSuccess.setVisibility(0);
        this.mWaitingImg.setBackgroundResource(R.drawable.ic_connect_succeed);
    }

    private void initDeviceInfo() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            LogUtil.j(TAG, "getArguments is null");
            return;
        }
        if (TextUtils.isEmpty(arguments.getString("PAYLOAD_FROM_NFC"))) {
            this.mEnterType = "QRCODE";
        } else {
            this.mEnterType = "NFC";
        }
        LogUtil.d(TAG, "mEnterType=", this.mEnterType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tickBiNfcConnectRope(Context context, int i) {
        new etg.b().e(0.0d).d(this.mProductId).b("262").a(this.mEnterType).d(0).j(this.mProductId).e(this.mDeviceMac).a(i).b().c(context);
    }

    private boolean isNeedScanAndBind() {
        ProductMapParseUtil.a(BaseApplication.getContext());
        ProductMapInfo productMapInfoD = ProductMap.d(this.mDevicePid);
        if (productMapInfoD != null) {
            this.mProductId = productMapInfoD.f();
        }
        MeasurableDevice bondedDevice = getBondedDevice(this.mProductId);
        if (this.mProductId == null || bondedDevice == null) {
            return true;
        }
        eqt.c().b(this.mProductId, this.mDeviceMac);
        goRopeDeviceIntroductionFragment(this.mProductId, bondedDevice.getUniqueId(), bondedDevice.getDeviceName());
        return false;
    }

    public Intent createIntent(String str, String str2) {
        LogUtil.a(TAG, "enter createIntent");
        elh elhVarD = ResourceManager.c().d(str);
        if (this.mainActivity == null || elhVarD == null) {
            LogUtil.e(TAG, "createIntent: context or productInfo is null");
            return null;
        }
        String strA = elo.a(elhVarD.t(), elhVarD.l().d());
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction("SWITCH_PLUGINDEVICE");
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(BaseApplication.getContext(), "com.huawei.health.device.ui.DeviceMainActivity");
        intent.putExtra("productId", str);
        intent.putExtra("arg1", ROPE_DEVICE_CONNECTING);
        intent.putExtra("DeviceType", elhVarD.m().name());
        intent.putExtra("DeviceName", strA);
        intent.putExtra("DeviceIconPath", elhVarD.l().b());
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", str2);
        contentValues.put("productId", str);
        intent.putExtra("commonDeviceInfo", contentValues);
        return intent;
    }

    public void startRopeDeviceConnectingPage(String str, String str2) {
        LogUtil.a(TAG, "startRopeDeviceConnectingPage: productId=", str, ", uniqueId=", etk.c(str2));
        Intent intentCreateIntent = createIntent(str, str2);
        if (intentCreateIntent == null) {
            LogUtil.e(TAG, "startRopeDeviceConnectingPage: intent is null");
            popupFragment(null);
        } else {
            DeviceConnectingFragment deviceConnectingFragment = new DeviceConnectingFragment();
            deviceConnectingFragment.setArguments(intentCreateIntent.getExtras());
            switchFragment((Fragment) null, deviceConnectingFragment);
        }
    }

    private void initDownLoad() {
        if (this.mBluetoothAdapter == null) {
            BluetoothManager bluetoothManager = this.mainActivity.getSystemService("bluetooth") instanceof BluetoothManager ? (BluetoothManager) this.mainActivity.getSystemService("bluetooth") : null;
            if (bluetoothManager == null) {
                LogUtil.j(TAG, "no BT Manager in this phone");
                return;
            }
            this.mBluetoothAdapter = bluetoothManager.getAdapter();
        }
        startDownloadResource();
    }

    private void initView(View view) {
        this.mFinishButton = (HealthButton) view.findViewById(R.id.hw_device_rope_skipping_ok);
        ImageView imageView = (ImageView) view.findViewById(R.id.hw_device_rope_skipping_img_1);
        this.mWaitingImg = imageView;
        imageView.setBackgroundResource(R.drawable.ic_connecting);
        this.mPairing = (HealthTextView) view.findViewById(R.id.hw_device_rope_skipping_pairing);
        this.mPairSuccess = (HealthTextView) view.findViewById(R.id.hw_device_rope_skipping_paired);
    }

    private void initViewClickListener() {
        this.mFinishButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.RopeSkippingGuideFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1022x883bac7f(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initViewClickListener$1$com-huawei-health-ecologydevice-ui-measure-fragment-RopeSkippingGuideFragment, reason: not valid java name */
    /* synthetic */ void m1022x883bac7f(View view) {
        if (this.mFinishButton.getText().toString().equals(getResources().getString(R.string.IDS_device_show_complete))) {
            jumpToProductIntroductionFragment();
        } else if (this.mFinishButton.getText().toString().equals(getResources().getString(R.string.IDS_hwh_stressdialog_download_again))) {
            this.mFinishButton.setVisibility(8);
            reDownloadResource();
        } else {
            LogUtil.a(TAG, "RopeSkippingGuideFragment mFinishButton Text Mismatch");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (njy.e(this.mListHealthDevice)) {
            return;
        }
        this.mListHealthDevice.clear();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        if (getActivity() == null || !this.mIsDownloadFail) {
            return false;
        }
        getActivity().finish();
        return false;
    }

    private void jumpToProductIntroductionFragment() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                if (arguments.getBoolean(ISBIND_SUCCESS)) {
                    ContentValues contentValues = (ContentValues) arguments.getParcelable("commonDeviceInfo");
                    Bundle bundle = new Bundle();
                    bundle.putString("productId", arguments.getString("productId"));
                    bundle.putBoolean(ISBIND_SUCCESS, true);
                    bundle.putBoolean(BaseRopeIntroductionFragment.KEY_FROM_SCAN, false);
                    bundle.putParcelable("commonDeviceInfo", contentValues);
                    ProductFragment productFragmentCreateProductFragment = ProductCreateFactory.createProductFragment(arguments.getString("productId"));
                    productFragmentCreateProductFragment.setArguments(bundle);
                    switchFragment(productFragmentCreateProductFragment);
                    return;
                }
            } catch (Exception unused) {
                LogUtil.e(TAG, "jumpToProductIntroductionFragment Exception");
            }
        }
        popupFragment(ProductIntroductionFragment.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goDeviceBindWaitingFragment(HealthDevice healthDevice) {
        if (!isTargetDevice(healthDevice)) {
            LogUtil.j(TAG, "this scan devcie is not target device");
            return;
        }
        this.mScannerController.e();
        if (getActivity() == null) {
            return;
        }
        this.mListHealthDevice.add(healthDevice);
        epq epqVar = new epq();
        epqVar.c(this.mListHealthDevice);
        emk.c().a(epqVar);
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.mProductId);
        bundle.putInt("position", 0);
        bundle.putString("title", this.mTitle);
        bundle.putBoolean("is_go_rope_jump", this.mIsGoRopeJump);
        bundle.putString("DeviceName", healthDevice.getDeviceName());
        bundle.putString("DeviceIconPath", getProductImagePath(this.mProductId));
        bundle.putString("DeviceType", "HDK_ROPE_SKIPPING");
        bundle.putParcelable(AdShowExtras.DOWNLOAD_SOURCE, efj.c().e());
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", healthDevice.getUniqueId());
        contentValues.put("productId", this.mProductId);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        Fragment pluginDeviceFragment = ((DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class)).getPluginDeviceFragment(WeightConstants.FragmentType.DEVICE_BIND_WAITING);
        if (pluginDeviceFragment == null) {
            LogUtil.j(TAG, "nextFragment is null");
        } else {
            pluginDeviceFragment.setArguments(bundle);
            switchFragment(pluginDeviceFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goDeviceBindFailedFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.mProductId);
        bundle.putString("title", this.mTitle);
        bundle.putBoolean(DeviceBindFailedFragment.IS_FROM_BIND, true);
        DeviceBindFailedFragment deviceBindFailedFragment = new DeviceBindFailedFragment();
        deviceBindFailedFragment.setArguments(bundle);
        switchFragment(deviceBindFailedFragment);
        LogUtil.d(TAG, "goDeviceBindFailedFragment Fail to bind device ", bundle);
    }

    private void goRopeDeviceIntroductionFragment(String str, String str2, String str3) {
        String string;
        if (this.mIsGoRopeJump && !"1".equals(era.a("pageVersion", this.mProductId))) {
            if (!PermissionDialogHelper.c(this.mainActivity) || !eru.a()) {
                LogUtil.d(TAG, "no bt or permission jump to deviceConnecting page");
                startRopeDeviceConnectingPage(str, str2);
                return;
            } else {
                goToMainRopeTab(str, str2);
                return;
            }
        }
        if (getArguments() == null) {
            string = "";
        } else {
            string = getArguments().getString("PAYLOAD_FROM_NFC");
        }
        Bundle bundle = new Bundle();
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", str2);
        contentValues.put("productId", str);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        bundle.putBoolean(ISBIND_SUCCESS, true);
        bundle.putString("PAYLOAD_FROM_NFC", string);
        bundle.putString("BLENAME_FROM_QRCODE", str3);
        Fragment fragmentCreateProductFragment = ProductCreateFactory.createProductFragment(str);
        fragmentCreateProductFragment.setArguments(bundle);
        switchFragment(fragmentCreateProductFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUpdateProductMap() {
        this.mIsDownloadFail = false;
        showDownloadView();
        sendEmptyDelayMessage(108, 30000L);
        efj efjVarC = efj.c();
        efj.c().b(true);
        efjVarC.a(this.mKind.name(), this.mDevicePid, new DownloadDeviceInfoCallBack() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.RopeSkippingGuideFragment.3
            @Override // com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack
            public void onSuccess() {
                LogUtil.a(RopeSkippingGuideFragment.TAG, "onSuccess");
                RopeSkippingGuideFragment.this.refreshProductInfo();
                RopeSkippingGuideFragment.this.removeMessage(108);
                RopeSkippingGuideFragment.this.sendEmptyMessage(104);
            }

            @Override // com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack
            public void onFailure(int i) {
                LogUtil.a(RopeSkippingGuideFragment.TAG, "onFailure");
                RopeSkippingGuideFragment.this.sendEmptyMessage(108);
            }

            @Override // com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack
            public void onNetworkError() {
                LogUtil.a(RopeSkippingGuideFragment.TAG, "onNetworkError");
                RopeSkippingGuideFragment.this.sendEmptyMessage(108);
            }
        });
    }

    private void startDownloadResource() {
        setFirstDownloadFlag();
        DownloadManagerApi downloadManagerApi = (DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class);
        if (!CommonUtil.ab(this.mainActivity)) {
            LogUtil.j(TAG, "startDownloadResource net is error");
            sendEmptyMessage(108);
        } else {
            downloadManagerApi.addDownloadIndexAllCallBack(this.mDownloadResultCallback);
            ReleaseLogUtil.d(RELEASE_TAG, "downLoad index_all");
            downloadManagerApi.downloadIndexAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshProductInfo() {
        ProductMapInfo productMapInfoD = ProductMap.d(this.mDevicePid);
        if (productMapInfoD != null) {
            this.mProductId = productMapInfoD.f();
        }
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        if (elhVarD == null) {
            LogUtil.j(TAG, "handlerToRefresh productInfo is null");
        } else {
            this.mProductInfo = elhVarD;
        }
    }

    private void reDownloadResource() {
        if (CommonUtil.ab(BaseApplication.getContext())) {
            this.mIsDownloadFail = false;
            showDownloadView();
            sendEmptyDelayMessage(108, 30000L);
            startDownloadResource();
            return;
        }
        sendEmptyMessage(108);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showBondingView() {
        this.mPairing.setText(R.string.IDS_blite_guide_paire_opt_title);
        this.mTitle = getTitle();
        this.mCustomTitleBar.setTitleText(this.mTitle);
        this.mFinishButton.setVisibility(8);
        this.mFinishButton.setText(R.string.IDS_device_show_complete);
        LogUtil.a(TAG, "showBondingView mTitle ", this.mTitle);
    }

    private void showDownloadView() {
        this.mPairing.setText(R.string.IDS_device_download_resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDownloadFail() {
        this.mIsDownloadFail = true;
        this.mPairing.setText(R.string.IDS_update_download_failed);
        this.mFinishButton.setVisibility(0);
        this.mFinishButton.setText(R.string.IDS_hwh_stressdialog_download_again);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCancel() {
        LogUtil.a(TAG, "enter handleCancel");
        for (pis pisVar : piu.c().b()) {
            if (etn.f(this.mProductId)) {
                pig.c().c(pisVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEmptyMessage(int i) {
        RopeHandler ropeHandler = this.mHandler;
        if (ropeHandler != null) {
            ropeHandler.sendEmptyMessage(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEmptyDelayMessage(int i, long j) {
        RopeHandler ropeHandler = this.mHandler;
        if (ropeHandler != null) {
            ropeHandler.sendEmptyMessageDelayed(i, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMessage(int i) {
        RopeHandler ropeHandler = this.mHandler;
        if (ropeHandler != null) {
            ropeHandler.removeMessages(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishFragment() {
        popupFragment(null);
    }

    private void setFirstDownloadFlag() {
        RopeCloudAuthManager.e(this.mProductId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void judgingBluetoothOnOff() {
        if (this.mBluetoothAdapter == null) {
            LogUtil.j(TAG, "no BT in this phone");
            finishFragment();
            return;
        }
        this.mScannerController = new ScannerController(this.mProductInfo, this.mKind.name());
        try {
            boolean z = this.mIsBtEnableShowing;
            if (z) {
                LogUtil.a(TAG, "judgingBluetoothOnOff mIsBtEnableShowing", Boolean.valueOf(z));
            } else {
                if (this.mBluetoothAdapter.isEnabled()) {
                    return;
                }
                LogUtil.a(TAG, "judgingBluetoothOnOff enableBluetooth");
                this.mIsBtEnableShowing = true;
                eru.c(this.mActivityResultLauncherBt, "android.bluetooth.adapter.action.REQUEST_ENABLE");
            }
        } catch (SecurityException e) {
            LogUtil.e(TAG, "judgingBluetoothOnOff SecurityException:", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openGpsLocation() {
        LogUtil.a(TAG, "openGpsLocation jump to GPS Setting");
        eqw.d(this.mainActivity, isAdded(), new IdialogButtonClickCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.RopeSkippingGuideFragment.4
            @Override // com.huawei.health.ecologydevice.callback.IdialogButtonClickCallback
            public void onClick(View view) {
                eru.c(RopeSkippingGuideFragment.this.mActivityResultLauncherLocation, "android.settings.LOCATION_SOURCE_SETTINGS");
            }

            @Override // com.huawei.health.ecologydevice.callback.IdialogButtonClickCallback
            public void onCancelClick(View view) {
                LogUtil.a(RopeSkippingGuideFragment.TAG, "openGpsLocation onCancelClick");
                RopeSkippingGuideFragment.this.finishFragment();
            }
        });
    }

    private void registerActivityResultLocation() {
        this.mActivityResultLauncherLocation = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.RopeSkippingGuideFragment$$ExternalSyntheticLambda3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                this.f$0.m1026xae728c37((ActivityResult) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$registerActivityResultLocation$2$com-huawei-health-ecologydevice-ui-measure-fragment-RopeSkippingGuideFragment, reason: not valid java name */
    /* synthetic */ void m1026xae728c37(ActivityResult activityResult) {
        judgingBluetoothOnOff();
        if (this.mIsBtEnableShowing) {
            return;
        }
        LogUtil.a(TAG, "registerActivityResultLocation start SCAN_DEVICE");
        sendEmptyDelayMessage(109, 500L);
    }

    private void registerActivityResultBt() {
        this.mActivityResultLauncherBt = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.RopeSkippingGuideFragment$$ExternalSyntheticLambda4
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                this.f$0.m1025xac706a15((ActivityResult) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$registerActivityResultBt$3$com-huawei-health-ecologydevice-ui-measure-fragment-RopeSkippingGuideFragment, reason: not valid java name */
    /* synthetic */ void m1025xac706a15(ActivityResult activityResult) {
        LogUtil.a(TAG, "registerForActivityResult result=", activityResult);
        this.mIsBtEnableShowing = false;
        if (activityResult.getResultCode() == 0) {
            finishFragment();
        } else {
            LogUtil.a(TAG, "registerActivityResultBt start SCAN_DEVICE");
            sendEmptyDelayMessage(109, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkPermission() {
        PermissionUtil.PermissionType permissionTypeC = PermissionDialogHelper.c();
        PermissionDialogHelper.e(getActivity(), permissionTypeC, new AnonymousClass5(this.mainActivity, permissionTypeC));
    }

    /* JADX INFO: renamed from: com.huawei.health.ecologydevice.ui.measure.fragment.RopeSkippingGuideFragment$5, reason: invalid class name */
    class AnonymousClass5 extends CustomPermissionAction {
        final /* synthetic */ PermissionUtil.PermissionType val$permissionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(Context context, PermissionUtil.PermissionType permissionType) {
            super(context);
            this.val$permissionType = permissionType;
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            if (this.val$permissionType == PermissionUtil.PermissionType.LOCATION && !eru.a(RopeSkippingGuideFragment.this.mainActivity)) {
                LogUtil.a(RopeSkippingGuideFragment.TAG, "Permission GpsClose is close");
                RopeSkippingGuideFragment.this.openGpsLocation();
                return;
            }
            LogUtil.a(RopeSkippingGuideFragment.TAG, "checkPermission judgingBluetoothOnOff");
            RopeSkippingGuideFragment.this.judgingBluetoothOnOff();
            if (RopeSkippingGuideFragment.this.mIsBtEnableShowing) {
                return;
            }
            LogUtil.a(RopeSkippingGuideFragment.TAG, "checkPermission start SCAN_DEVICE");
            RopeSkippingGuideFragment.this.sendEmptyDelayMessage(109, 500L);
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            super.onDenied(str);
            RopeSkippingGuideFragment.this.finishFragment();
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            LogUtil.j(RopeSkippingGuideFragment.TAG, "permission onForeverDenied");
            qrs.c(RopeSkippingGuideFragment.this.mainActivity, permissionType, (CustomTextAlertDialog) null, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.RopeSkippingGuideFragment$5$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m1027x255b5e4b(view);
                }
            }, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.RopeSkippingGuideFragment$5$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m1028x5d4b44c(view);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onForeverDenied$0$com-huawei-health-ecologydevice-ui-measure-fragment-RopeSkippingGuideFragment$5, reason: not valid java name */
        /* synthetic */ void m1027x255b5e4b(View view) {
            RopeSkippingGuideFragment.this.finishFragment();
        }

        /* JADX INFO: renamed from: lambda$onForeverDenied$1$com-huawei-health-ecologydevice-ui-measure-fragment-RopeSkippingGuideFragment$5, reason: not valid java name */
        /* synthetic */ void m1028x5d4b44c(View view) {
            RopeSkippingGuideFragment.this.finishFragment();
        }
    }

    private MeasurableDevice getBondedDevice(String str) {
        ArrayList<MeasurableDevice> bondedDevices = dmg.a().getBondedDevices(str, false);
        if (njy.e(bondedDevices)) {
            return null;
        }
        for (MeasurableDevice measurableDevice : bondedDevices) {
            if (isTargetDevice(measurableDevice)) {
                return measurableDevice;
            }
        }
        return null;
    }

    private boolean isTargetDevice(HealthDevice healthDevice) {
        if (TextUtils.isEmpty(this.mDeviceMac) || !this.mDeviceMac.equals(healthDevice.getAddress())) {
            return !TextUtils.isEmpty(this.mDeviceBleName) && this.mDeviceBleName.equals(healthDevice.getDeviceName());
        }
        return true;
    }

    private String getTitle() {
        elh elhVar = this.mProductInfo;
        if (elhVar != null) {
            this.mMainTitleStr = elo.a(this.mProductId, elhVar.l().d());
            if (!LanguageUtil.bb(dxw.d()) && !LanguageUtil.ac(dxw.d()) && !LanguageUtil.l(dxw.d())) {
                this.mMainTitleStr = HUAWEI_FIT;
            }
        }
        return this.mMainTitleStr;
    }

    private String getProductImagePath(String str) {
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null || elhVarD.d() == null || elhVarD.d().get(0) == null) {
            LogUtil.a(TAG, "productInfo is null");
            return "";
        }
        return elg.e().d(str, elhVarD.d().get(0).d());
    }

    static class RopeHandler extends Handler {
        private WeakReference<RopeSkippingGuideFragment> mWeakReference;

        private RopeHandler(RopeSkippingGuideFragment ropeSkippingGuideFragment) {
            this.mWeakReference = new WeakReference<>(ropeSkippingGuideFragment);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            RopeSkippingGuideFragment ropeSkippingGuideFragment = this.mWeakReference.get();
            if (ropeSkippingGuideFragment == null || !ropeSkippingGuideFragment.isAdded() || ropeSkippingGuideFragment.isRemoving() || ropeSkippingGuideFragment.isDetached()) {
                LogUtil.d(RopeSkippingGuideFragment.TAG, "fragment isAdded");
                return;
            }
            int i = message.what;
            if (i == 0) {
                if (message.obj instanceof HealthDevice) {
                    ropeSkippingGuideFragment.goDeviceBindWaitingFragment((HealthDevice) message.obj);
                    return;
                }
                return;
            }
            if (i == 1) {
                ReleaseLogUtil.d(RopeSkippingGuideFragment.RELEASE_TAG, "DEVICE_SCAN_TIMEOUT mList isEmpty ", Boolean.valueOf(ropeSkippingGuideFragment.mListHealthDevice.isEmpty()));
                if (ropeSkippingGuideFragment.mListHealthDevice.isEmpty()) {
                    ropeSkippingGuideFragment.goDeviceBindFailedFragment();
                    return;
                }
                return;
            }
            if (i == 104) {
                ReleaseLogUtil.d(RopeSkippingGuideFragment.RELEASE_TAG, "DOWNLOAD_RESOURCE_SUCCESS");
                if (ropeSkippingGuideFragment.needUpdateAppVersion()) {
                    return;
                }
                ropeSkippingGuideFragment.showBondingView();
                ropeSkippingGuideFragment.checkPermission();
                return;
            }
            if (i == 108) {
                ReleaseLogUtil.e(RopeSkippingGuideFragment.RELEASE_TAG, "DOWNLOAD_TIME_OUT");
                ropeSkippingGuideFragment.handleCancel();
                ropeSkippingGuideFragment.showDownloadFail();
            } else if (i != 109) {
                LogUtil.j(RopeSkippingGuideFragment.TAG, "not have this case");
            } else {
                ReleaseLogUtil.d(RopeSkippingGuideFragment.TAG, "SCAN_DEVICE");
                ropeSkippingGuideFragment.startBinding();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startBinding() {
        ScannerController scannerController = this.mScannerController;
        if (scannerController == null) {
            return;
        }
        scannerController.d(this.mResultCallback);
        this.mScannerController.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean needUpdateAppVersion() {
        VersionVerifyUtilApi versionVerifyUtilApi = (VersionVerifyUtilApi) Services.b("PluginDevice", VersionVerifyUtilApi.class);
        if (!pip.f45449c.containsKey(this.mKind.name()) || versionVerifyUtilApi.isPublishVersion(this.mProductId, this.mKind.name())) {
            return false;
        }
        LogUtil.a(TAG, "current device needs to update the app version, mProductId = ", this.mProductId);
        versionVerifyUtilApi.noSupportDevice(getContext(), getActivity(), new VersionNoSupportCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.RopeSkippingGuideFragment$$ExternalSyntheticLambda2
            @Override // com.huawei.health.device.callback.VersionNoSupportCallback
            public final void onDialogClose() {
                this.f$0.m1023xec6f306b();
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: lambda$needUpdateAppVersion$4$com-huawei-health-ecologydevice-ui-measure-fragment-RopeSkippingGuideFragment, reason: not valid java name */
    /* synthetic */ void m1023xec6f306b() {
        popupFragment(null);
    }
}
