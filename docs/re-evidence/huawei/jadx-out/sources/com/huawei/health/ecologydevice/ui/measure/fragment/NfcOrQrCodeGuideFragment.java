package com.huawei.health.ecologydevice.ui.measure.fragment;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.ecologydevice.R;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.api.DeviceDataBaseHelperApi;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.device.api.MeasureKitManagerApi;
import com.huawei.health.device.api.VersionVerifyUtilApi;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.BleMeasureController;
import com.huawei.health.device.open.MeasureController;
import com.huawei.health.device.open.MeasureKit;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack;
import com.huawei.health.ecologydevice.callback.IdialogButtonClickCallback;
import com.huawei.health.ecologydevice.callback.NemoDeviceCallback;
import com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack;
import com.huawei.health.ecologydevice.manager.MassageGunConfig;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.open.HdpMeasureController;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.utils.BluetoothUtil;
import com.huawei.health.ecologydevice.ui.measure.fragment.utils.DeviceStateCallback;
import com.huawei.health.ecologydevice.ui.measure.fragment.utils.ProductCreateFactory;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.EventMonitorRecord;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.dmg;
import defpackage.dxw;
import defpackage.eds;
import defpackage.efj;
import defpackage.efx;
import defpackage.ekx;
import defpackage.elc;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.enm;
import defpackage.eqw;
import defpackage.era;
import defpackage.eru;
import defpackage.ete;
import defpackage.etg;
import defpackage.etn;
import defpackage.iov;
import defpackage.njy;
import defpackage.pig;
import defpackage.pip;
import defpackage.piq;
import defpackage.pis;
import defpackage.piu;
import defpackage.pjc;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class NfcOrQrCodeGuideFragment extends BaseFragment implements View.OnClickListener {
    private static final int DELAY_500MS = 500;
    private static final int DOWNLOAD_NO_RESOURCE = 112;
    private static final int DOWNLOAD_RESOURCE_SUCCESS = 104;
    private static final int DOWNLOAD_TIME_OUT = 108;
    private static final int DOWNLOAD_TIME_OUT_DELAY_30000MS = 30000;
    private static final int ENABLE_BT_GET_BLUETOOTH_NAME = 1;
    private static final int ENABLE_BT_SCAN_DEVICE = 2;
    private static final String FROM_SMART_LIFE_TYPE = "FROM_SMART_LIFE";
    private static final String IMAGE_NAME = "hw_meter_bind_2";
    private static final int REFRESHED_PRODUCT_INFO = 110;
    private static final int REQUEST_ENABLE_BT = 2;
    private static final int REQUEST_ENABLE_BT_TO_H5 = 4;
    private static final int REQUEST_GPS_LOCATION = 3;
    private static final int SCAN_DEVICE = 109;
    private static final int STATE_CHANGED = 106;
    private static final int SWITCH_FRAGMENT = 111;
    private static final String TAG = "NfcOrQrCodeGuideFragment";
    private static final int TO_FRESH = 105;
    private static final Set<String> TYPE_BLUETOOTH_CONNECT_NOT_NEED = new HashSet(10);
    private BluetoothDevice mBluetoothDevice;
    private BluetoothUtil mBluetoothUtil;
    private Bundle mBundle;
    private int mCurrentStatus;
    private ImageView mDefaultDeviceImage;
    private efx mDevice;
    private HealthTextView mDeviceBondStatus;
    private int mDeviceId;
    private ImageView mDeviceImage;
    private String mDeviceMacAddress;
    private String mDeviceName;
    private String mDevicePin;
    private String mDeviceType;
    private ImageView mDialogImageView;
    private int mEnableBluetoothStatus;
    private String mEnterType;
    private HealthTextView mFirstConnectFailedTv;
    private HealthDevice mHealthDevic;
    private String mKind;
    private String mMeasureKit;
    private int mNewStatus;
    private String mPayload;
    private String mProductId;
    private elh mProductInfo;
    private HealthProgressBar mReBondLoadingPb;
    private HealthTextView mReBondTv;
    private int mReconnectCount;
    private String mSmartProductId;
    private long mStartConnectTime;
    private boolean mIsBtEnableShowing = false;
    private CustomViewDialog mDialogForConnectFail = null;
    private CustomViewDialog mCustomViewDialog = null;
    private H5DeviceHandler mH5DeviceHandler = new H5DeviceHandler();
    private DeviceStateCallback deviceStateCallback = new DeviceStateCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.NfcOrQrCodeGuideFragment.1
        @Override // com.huawei.health.ecologydevice.ui.measure.fragment.utils.DeviceStateCallback
        public void onNotify(int i, int i2, int i3, HealthDevice healthDevice) {
            LogUtil.a(NfcOrQrCodeGuideFragment.TAG, "onNotify: status = ", Integer.valueOf(i), "newStatus =", Integer.valueOf(i2), "reconnectCount =", Integer.valueOf(i3));
            NfcOrQrCodeGuideFragment.this.mCurrentStatus = i;
            NfcOrQrCodeGuideFragment.this.mReconnectCount = i3;
            NfcOrQrCodeGuideFragment.this.mNewStatus = i2;
            NfcOrQrCodeGuideFragment.this.mHealthDevic = healthDevice;
            NfcOrQrCodeGuideFragment.this.sendEmptyMessage(106);
        }
    };
    private DownloadResultCallBack mDownloadResultCallback = new DownloadResultCallBack() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.NfcOrQrCodeGuideFragment$$ExternalSyntheticLambda5
        @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack
        public final void setDownloadStatus(int i, int i2) {
            this.f$0.m999x29cd5262(i, i2);
        }
    };
    private final NemoDeviceCallback nemoDeviceCallback = new NemoDeviceCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.NfcOrQrCodeGuideFragment.2
        @Override // com.huawei.health.ecologydevice.callback.NemoDeviceCallback
        public void bondSuccess(BluetoothDevice bluetoothDevice) {
            LogUtil.a(NfcOrQrCodeGuideFragment.TAG, "NomeDeviceManager bondSuccess");
            new elc().a(NfcOrQrCodeGuideFragment.this.getActivity(), bluetoothDevice.getAddress());
            if (NfcOrQrCodeGuideFragment.this.getActivity() != null) {
                NfcOrQrCodeGuideFragment.this.getActivity().finish();
            }
        }

        @Override // com.huawei.health.ecologydevice.callback.NemoDeviceCallback
        public void bondError(int i) {
            if (i == 1) {
                LogUtil.j(NfcOrQrCodeGuideFragment.TAG, "NomeDeviceManager foundTimeout");
                NfcOrQrCodeGuideFragment.this.mCurrentStatus = 13;
                NfcOrQrCodeGuideFragment.this.sendEmptyMessage(106);
            } else {
                if (i == 2) {
                    LogUtil.j(NfcOrQrCodeGuideFragment.TAG, "NomeDeviceManager bondError");
                    NfcOrQrCodeGuideFragment.this.mCurrentStatus = 14;
                    NfcOrQrCodeGuideFragment.this.sendEmptyMessage(106);
                    return;
                }
                LogUtil.j(NfcOrQrCodeGuideFragment.TAG, "NomeDeviceManager other bindState:", Integer.valueOf(i));
            }
        }
    };

    /* JADX INFO: renamed from: lambda$new$0$com-huawei-health-ecologydevice-ui-measure-fragment-NfcOrQrCodeGuideFragment, reason: not valid java name */
    /* synthetic */ void m999x29cd5262(int i, int i2) {
        if (i == 0) {
            return;
        }
        LogUtil.a(TAG, "setDownloadStatus status: ", Integer.valueOf(i));
        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).onDownloadIndexAllDestroy();
        if (i == 1) {
            piq.e().c();
            checkDeviceType();
        } else {
            sendEmptyMessage(108);
        }
    }

    private void checkDeviceType() {
        if (TextUtils.isEmpty(this.mProductId) && ProductCreateFactory.getProductKind(HealthDevice.HealthDeviceKind.getHealthDeviceKind(this.mDeviceType)) == 1) {
            if (TextUtils.isEmpty(this.mDeviceName)) {
                H5DeviceHandler h5DeviceHandler = this.mH5DeviceHandler;
                if (h5DeviceHandler == null) {
                    LogUtil.j(TAG, "checkDeviceType mH5DeviceHandler is null:");
                    return;
                } else {
                    h5DeviceHandler.post(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.NfcOrQrCodeGuideFragment$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m998x8d91e549();
                        }
                    });
                    return;
                }
            }
            getProductIdByBluetoothName(this.mDeviceName);
            updateIndexAndProductMap();
            return;
        }
        LogUtil.a(TAG, "checkDeviceType DeviceType is not sport device:");
        updateIndexAndProductMap();
    }

    /* JADX INFO: renamed from: lambda$checkDeviceType$1$com-huawei-health-ecologydevice-ui-measure-fragment-NfcOrQrCodeGuideFragment, reason: not valid java name */
    /* synthetic */ void m998x8d91e549() {
        judgingBluetoothOnOff(1);
    }

    private void updateIndexAndProductMap() {
        LogUtil.a(TAG, "updateIndexAndProductMap");
        if (TextUtils.isEmpty(this.mSmartProductId) && ProductCreateFactory.getProductKind(HealthDevice.HealthDeviceKind.getHealthDeviceKind(this.mDeviceType)) == 1) {
            startIndoorEquipRunningActByNfc();
        } else {
            if (jumpByIndoorEquipment()) {
                return;
            }
            handleUpdateProductMap();
        }
    }

    private boolean jumpByIndoorEquipment() {
        if (ProductCreateFactory.getProductKind(HealthDevice.HealthDeviceKind.getHealthDeviceKind(this.mDeviceType)) == 1) {
            List<pjc> listC = piq.e().c(this.mProductId);
            if (njy.e(listC)) {
                return false;
            }
            LogUtil.a(TAG, "getJumpToProductPage", Integer.valueOf(listC.get(0).f()));
            if (listC.get(0).f() == 0) {
                startIndoorEquipRunningActByNfc();
                return true;
            }
        }
        return false;
    }

    private void startIndoorEquipRunningActByNfc() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("PID_FROM_QRCODE", this.mSmartProductId);
        intent.putExtra("PROTOCOL_FROM_QRCODE", era.i(this.mPayload) ? "2" : "1");
        String str = this.mDeviceMacAddress;
        if (str != null) {
            intent.putExtra("BLE_FROM_QRCODE", str.replace(":", ""));
        }
        intent.putExtra("DEVICE_TYPE_INDEX", this.mDeviceType);
        intent.putExtra("BLENAME_FROM_QRCODE", this.mDeviceName);
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.indoorequip.activity.IndoorEquipConnectedActivity");
        iov.d(activity, intent);
        activity.finish();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        BluetoothUtil bluetoothUtil;
        super.onCreate(bundle);
        initNoNeedConnectDevice();
        Bundle arguments = getArguments();
        this.mBundle = arguments;
        if (arguments == null) {
            LogUtil.a(TAG, "bundle is null");
        } else if (initParam(arguments) && (bluetoothUtil = this.mBluetoothUtil) != null) {
            bluetoothUtil.init(this.deviceStateCallback);
        }
    }

    private void initNoNeedConnectDevice() {
        Set<String> set = TYPE_BLUETOOTH_CONNECT_NOT_NEED;
        set.add("272");
        set.add("271");
        set.add("31");
        set.add("260");
        set.add("261");
        set.add(BleConstants.SPORT_TYPE_BIKE);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ProductMapParseUtil.a(BaseApplication.getContext());
        ProductMapInfo productMapInfoD = ProductMap.d(this.mSmartProductId);
        if (productMapInfoD != null) {
            this.mProductId = productMapInfoD.f();
            this.mProductInfo = ResourceManager.c().d(this.mProductId);
        }
        String str = this.mProductId;
        if (str != null && this.mProductInfo != null && isBondedDevice(str)) {
            LogUtil.a(TAG, "Device had bonded.");
            if (BleConstants.BLE_THIRD_DEVICE_H5.equals(this.mProductInfo.n().b())) {
                PermissionDialogHelper.a(this, 4);
                return super.onCreateView(layoutInflater, viewGroup, bundle);
            }
            if (jumpByIndoorEquipment()) {
                return super.onCreateView(layoutInflater, viewGroup, bundle);
            }
            switchNativeMode();
        }
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ViewGroup viewGroup2 = viewOnCreateView instanceof ViewGroup ? (ViewGroup) viewOnCreateView : null;
        if (viewGroup2 != null) {
            this.child = layoutInflater.inflate(R.layout.nfc_guide_introduction_layout, viewGroup, false);
            viewGroup2.addView(this.child);
            initView(this.child);
        }
        initDefaultImage();
        initTitleBar();
        if (BleConstants.TYPE_FASCIA_GUN_INDEX.equals(this.mDeviceType)) {
            handMassageGunMap();
        }
        reDownloadResource();
        return viewGroup2;
    }

    private void gotoH5Pro() {
        switchH5ProIntro();
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    private void initView(View view) {
        this.mDefaultDeviceImage = (ImageView) view.findViewById(R.id.device_default_image_iv);
        this.mDeviceImage = (ImageView) view.findViewById(R.id.device_image_iv);
        this.mDeviceBondStatus = (HealthTextView) view.findViewById(R.id.device_connect_status);
        this.mFirstConnectFailedTv = (HealthTextView) view.findViewById(R.id.device_first_connect_failed_tips);
        this.mReBondTv = (HealthTextView) view.findViewById(R.id.device_reconnect_tv);
        this.mReBondLoadingPb = (HealthProgressBar) view.findViewById(R.id.device_reconnect_pb);
        this.mFirstConnectFailedTv.setVisibility(8);
        this.mReBondTv.setOnClickListener(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:61:0x00cb  */
    private void initDefaultImage() {
        Resources resources = getContext().getResources();
        if (resources == null || TextUtils.isEmpty(this.mDeviceType)) {
            return;
        }
        LogUtil.d(TAG, "initDefaultImage:", this.mDeviceType);
        String str = this.mDeviceType;
        str.hashCode();
        switch (str) {
            case "31":
                this.mDefaultDeviceImage.setImageDrawable(resources.getDrawable(R.drawable.treadmill_universal));
                break;
            case "54":
                this.mDefaultDeviceImage.setImageDrawable(resources.getDrawable(R.drawable.body_fat_scale_universal));
                break;
            case "68":
                this.mDefaultDeviceImage.setImageDrawable(resources.getDrawable(R.drawable.blood_pressure_universal));
                break;
            case "082":
                this.mDefaultDeviceImage.setImageDrawable(resources.getDrawable(R.drawable.smart_headphones_universal));
                break;
            case "259":
                this.mDefaultDeviceImage.setImageDrawable(resources.getDrawable(R.drawable.indoorbike_universal));
                break;
            case "260":
                this.mDefaultDeviceImage.setImageDrawable(resources.getDrawable(R.drawable.crosstrainer_universal));
                break;
            case "261":
                this.mDefaultDeviceImage.setImageDrawable(resources.getDrawable(R.drawable.rower_universal));
                break;
            case "266":
                this.mDefaultDeviceImage.setImageDrawable(resources.getDrawable(R.drawable.smart_pillow_universal));
                break;
            case "268":
                this.mDefaultDeviceImage.setImageDrawable(resources.getDrawable(R.drawable.fascial_gun_universal));
                break;
            case "270":
                this.mDefaultDeviceImage.setImageDrawable(resources.getDrawable(R.drawable.heart_rate_monitors_universal));
                break;
            case "271":
                this.mDefaultDeviceImage.setImageDrawable(resources.getDrawable(R.drawable.ecg_paste_universal));
                break;
            case "272":
                this.mDefaultDeviceImage.setImageDrawable(resources.getDrawable(R.drawable.thermometer_universal));
                break;
            case "273":
                this.mDefaultDeviceImage.setImageDrawable(resources.getDrawable(R.drawable.pulse_oximeters_universal));
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    private void initTitleBar() {
        byte b2 = 8;
        this.mCustomTitleBar.setRightButtonVisibility(8);
        Resources resources = getContext().getResources();
        if (resources == null || TextUtils.isEmpty(this.mDeviceType)) {
            return;
        }
        this.mCustomTitleBar.setTitleBarBackgroundColor(resources.getColor(R.color.wear_home_bg_color));
        String str = this.mDeviceType;
        str.hashCode();
        switch (str.hashCode()) {
            case 1630:
                if (!str.equals("31")) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case 1695:
                if (!str.equals("54")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 1730:
                if (!str.equals("68")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 47914:
                if (!str.equals("082")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case 49750:
                if (!str.equals(BleConstants.SPORT_TYPE_BIKE)) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case 49772:
                if (!str.equals("260")) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case 49773:
                if (!str.equals("261")) {
                    b2 = -1;
                } else {
                    b2 = 6;
                }
                break;
            case 49778:
                if (!str.equals("266")) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case 49780:
                if (!str.equals(BleConstants.TYPE_FASCIA_GUN_INDEX)) {
                    b2 = -1;
                }
                break;
            case 49803:
                if (!str.equals("270")) {
                    b2 = -1;
                } else {
                    b2 = 9;
                }
                break;
            case 49804:
                if (!str.equals("271")) {
                    b2 = -1;
                } else {
                    b2 = 10;
                }
                break;
            case 49805:
                if (!str.equals("272")) {
                    b2 = -1;
                } else {
                    b2 = 11;
                }
                break;
            case 49806:
                if (!str.equals("273")) {
                    b2 = -1;
                } else {
                    b2 = 12;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                super.setTitle(resources.getString(R.string.IDS_device_group_name_treadmill_scale));
                break;
            case 1:
                super.setTitle(resources.getString(R.string.IDS_device_group_name_body_fat_scale));
                break;
            case 2:
                super.setTitle(resources.getString(R.string.IDS_device_group_name_blood_pressure_scale));
                break;
            case 3:
                super.setTitle(resources.getString(R.string.IDS_add_device_smart_headphones));
                break;
            case 4:
                super.setTitle(resources.getString(R.string.IDS_device_group_name_exercise_bike_scale));
                break;
            case 5:
                super.setTitle(resources.getString(R.string.IDS_device_group_name_elliptical_machine_scale));
                break;
            case 6:
                super.setTitle(resources.getString(R.string.IDS_device_group_name_rowing_machine_scale));
                break;
            case 7:
                super.setTitle(resources.getString(R.string.IDS_device_group_name_smart_pillow));
                break;
            case 8:
                super.setTitle(resources.getString(R.string.IDS_device_group_name_fascia_gun));
                break;
            case 9:
                super.setTitle(resources.getString(R.string.IDS_device_group_name_pulse_scale));
                break;
            case 10:
                super.setTitle(resources.getString(R.string.IDS_device_group_name_ecg_scale));
                break;
            case 11:
                super.setTitle(resources.getString(R.string.IDS_device_group_name_temperature_scale));
                break;
            case 12:
                super.setTitle(resources.getString(R.string.IDS_device_group_name_blood_oxygen_scale));
                break;
        }
    }

    private void startDownloadResource() {
        DownloadManagerApi downloadManagerApi = (DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class);
        if (!CommonUtil.ab(this.mainActivity)) {
            LogUtil.j(TAG, "startDownloadResource net is error");
            sendEmptyMessage(108);
        } else {
            downloadManagerApi.addDownloadIndexAllCallBack(this.mDownloadResultCallback);
            ReleaseLogUtil.d(TAG, "downLoad index_all");
            downloadManagerApi.downloadIndexAll();
        }
    }

    private boolean initParam(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        this.mPayload = bundle.getString("PAYLOAD_FROM_NFC");
        this.mDeviceMacAddress = bundle.getString("BLE_FROM_QRCODE");
        this.mDeviceName = bundle.getString("BLENAME_FROM_QRCODE");
        this.mDeviceType = bundle.getString("DEVICE_TYPE_INDEX");
        this.mSmartProductId = bundle.getString("PID_FROM_QRCODE");
        this.mDevicePin = bundle.getString("PIN_FROM_QRCODE");
        this.mKind = bundle.getString("DeviceType");
        String string = bundle.getString("ENTER_TYPE");
        this.mEnterType = string;
        LogUtil.a(TAG, "mEnterType:", string);
        if (TextUtils.isEmpty(this.mEnterType)) {
            this.mEnterType = Constants.LINK;
        }
        if (bundle.getBoolean(FROM_SMART_LIFE_TYPE)) {
            this.mEnterType = "";
        }
        if (!checkInputIsValid() || "082".equals(this.mDeviceType)) {
            return false;
        }
        if (BluetoothAdapter.getDefaultAdapter() == null && getActivity() != null) {
            if ((getActivity().getSystemService("bluetooth") instanceof BluetoothManager ? (BluetoothManager) getActivity().getSystemService("bluetooth") : null) == null) {
                LogUtil.j(TAG, "no BT Manager in this phone");
                return false;
            }
        }
        if (BluetoothAdapter.getDefaultAdapter() == null) {
            return false;
        }
        if (this.mBluetoothUtil == null) {
            this.mBluetoothUtil = BluetoothUtil.getInstance();
        }
        this.mBluetoothUtil.setDeviceNameAndMac(this.mDeviceName, this.mDeviceMacAddress);
        ete.d().d(this.mKind);
        this.mBluetoothUtil.setIsUniformDeviceManagementFlag(ete.d().b());
        return true;
    }

    private void saveBrDevice(BluetoothDevice bluetoothDevice) {
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        MeasureKit healthDeviceKit = ((MeasureKitManagerApi) Services.b("PluginDevice", MeasureKitManagerApi.class)).getHealthDeviceKit(this.mMeasureKit);
        ContentValues contentValues = new ContentValues();
        contentValues.put("kind", getDeviceKindName(elhVarD, healthDeviceKit));
        contentValues.put(Wpt.MODE, Integer.valueOf(getDeviceMode(elhVarD, healthDeviceKit)));
        contentValues.put(TtmlNode.TEXT_EMPHASIS_AUTO, Integer.valueOf(isAutoMeasureDevcie(elhVarD, healthDeviceKit) ? 1 : 0));
        try {
            contentValues.put("uniqueId", bluetoothDevice.getAddress());
            contentValues.put("name", bluetoothDevice.getName());
            contentValues.put("sn", "");
            contentValues.put("name", bluetoothDevice.getName());
            contentValues.put("productId", this.mProductId);
            contentValues.put(EventMonitorRecord.ADD_TIME, Long.valueOf(System.currentTimeMillis()));
            contentValues.put("kitUuid", this.mMeasureKit);
            if (((DeviceDataBaseHelperApi) Services.b("PluginDevice", DeviceDataBaseHelperApi.class)).insert(contentValues) == -1) {
                LogUtil.a(TAG, "fail to insert device data base");
            }
        } catch (SecurityException e) {
            LogUtil.e(TAG, "saveBrDevice SecurityException:", ExceptionUtils.c(e));
        }
    }

    private boolean checkInputIsValid() {
        LogUtil.a(TAG, "mDeviceMacAddress = ", this.mDeviceMacAddress, " mDeviceName", this.mDeviceName, " mDeviceType = ", this.mDeviceType, " mDevicePid = ", this.mSmartProductId, " mEnterType = ", this.mEnterType, " mDevicePin = ", this.mDevicePin);
        if (TextUtils.isEmpty(this.mDeviceMacAddress) && TextUtils.isEmpty(this.mDeviceName)) {
            return false;
        }
        return !TextUtils.isEmpty(this.mEnterType);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        H5DeviceHandler h5DeviceHandler = this.mH5DeviceHandler;
        if (h5DeviceHandler != null) {
            h5DeviceHandler.removeCallbacksAndMessages(null);
        }
        BluetoothUtil bluetoothUtil = this.mBluetoothUtil;
        if (bluetoothUtil != null) {
            bluetoothUtil.stopScanDevice();
            this.mBluetoothUtil.releaseSource();
        }
        if (this.mHealthDevic != null) {
            this.mHealthDevic = null;
        }
        this.mReconnectCount = 0;
        handleCancel();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a(TAG, "onActivityResult is : ", Integer.valueOf(i), "; resultCode is : ", Integer.valueOf(i2));
        if (i == 2) {
            this.mIsBtEnableShowing = false;
            if (i2 == 0) {
                finishFragment();
                return;
            } else {
                checkPermissions();
                return;
            }
        }
        if (i == 3) {
            checkPermissions();
            return;
        }
        if (i != 4) {
            LogUtil.a(TAG, "onActivityResult else is" + i2);
        } else if (i2 == -1) {
            gotoH5Pro();
        } else {
            finishFragment();
        }
    }

    private void handMassageGunMap() {
        ResourceManager.c().c(new Handler(Looper.getMainLooper()), new MassageGunConfig.MassageGunCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.NfcOrQrCodeGuideFragment$$ExternalSyntheticLambda3
            @Override // com.huawei.health.ecologydevice.manager.MassageGunConfig.MassageGunCallback
            public final void onMassageGunCallback(String str) {
                LogUtil.a(NfcOrQrCodeGuideFragment.TAG, "handMassageGunMap result ", Boolean.valueOf(ekx.a(str)));
            }
        });
    }

    private void handleUpdateProductMap() {
        LogUtil.a(TAG, "start handleUpdateProductMap");
        sendEmptyDelayMessage(108, 30000L);
        efj.c().b(true);
        efj.c().a(this.mKind, this.mSmartProductId, new DownloadDeviceInfoCallBack() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.NfcOrQrCodeGuideFragment.3
            @Override // com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack
            public void onSuccess() {
                LogUtil.a(NfcOrQrCodeGuideFragment.TAG, "onSuccess");
                NfcOrQrCodeGuideFragment.this.resourceDownloaded();
            }

            @Override // com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack
            public void onFailure(int i) {
                LogUtil.a(NfcOrQrCodeGuideFragment.TAG, "onFailure");
                if (i == 11) {
                    NfcOrQrCodeGuideFragment.this.sendEmptyMessage(112);
                } else {
                    NfcOrQrCodeGuideFragment.this.sendEmptyMessage(108);
                }
            }

            @Override // com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack
            public void onNetworkError() {
                LogUtil.a(NfcOrQrCodeGuideFragment.TAG, "onNetworkError");
                NfcOrQrCodeGuideFragment.this.sendEmptyMessage(108);
            }
        });
    }

    private void showDownloadView() {
        LogUtil.a(TAG, "start showDownloadView");
        this.mDeviceBondStatus.setText(R.string.IDS_device_download_resource);
        this.mReBondLoadingPb.setVisibility(0);
        this.mReBondTv.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDownloadFail(int i) {
        this.mDeviceBondStatus.setText(R.string.IDS_update_download_failed);
        this.mFirstConnectFailedTv.setVisibility(0);
        this.mFirstConnectFailedTv.setText(i == 112 ? R.string.IDS_device_mgr_no_support_new_verion : R.string.IDS_device_download_fail_tips);
        this.mReBondLoadingPb.setVisibility(8);
        this.mReBondTv.setVisibility(0);
        this.mReBondTv.setText(R.string.IDS_hwh_stressdialog_download_again);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void judgingBluetoothOnOff(int i) {
        this.mEnableBluetoothStatus = i;
        if (BluetoothAdapter.getDefaultAdapter() == null) {
            LogUtil.j(TAG, "no BT in this phone");
            finishFragment();
        } else {
            if (!BluetoothAdapter.getDefaultAdapter().isEnabled() && !this.mIsBtEnableShowing) {
                LogUtil.a(TAG, "judgingBluetoothOnOff BluetoothAdapter.getDefaultAdapter().isEnabled() is : ", Boolean.valueOf(BluetoothAdapter.getDefaultAdapter().isEnabled()));
                this.mIsBtEnableShowing = true;
                openBlueTooth();
                return;
            }
            checkPermissions();
        }
    }

    private void openBlueTooth() {
        LogUtil.a(TAG, "openBlueTooth");
        PermissionDialogHelper.d(this.mainActivity, new PermissionDialogHelper.OpenBlueToothAction() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.NfcOrQrCodeGuideFragment.4
            @Override // com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.OpenBlueToothAction
            public void onPermissionGranted() {
                try {
                    NfcOrQrCodeGuideFragment.this.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 2);
                } catch (ActivityNotFoundException unused) {
                    LogUtil.e(NfcOrQrCodeGuideFragment.TAG, "openBlueTooth from activity ActivityNotFoundException!");
                }
            }

            @Override // com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.OpenBlueToothAction
            public void onPermissionDenied() {
                LogUtil.a(NfcOrQrCodeGuideFragment.TAG, "openBlueTooth finishFragment");
                NfcOrQrCodeGuideFragment.this.finishFragment();
            }
        });
    }

    private void doAfterPaired() {
        HealthDevice healthDevice = this.mHealthDevic;
        if (healthDevice instanceof efx) {
            this.mDevice = (efx) healthDevice;
        }
        try {
            efx efxVar = this.mDevice;
            if (efxVar != null && efxVar.c() != null) {
                int bondState = this.mDevice.c().getBondState();
                LogUtil.a(TAG, "bondState = ", Integer.valueOf(bondState));
                this.mBluetoothDevice = this.mDevice.c();
                this.mDeviceMacAddress = this.mDevice.getUniqueId();
                if (this.mProductId != null) {
                    elh elhVarD = ResourceManager.c().d(this.mProductId);
                    this.mProductInfo = elhVarD;
                    this.mMeasureKit = elhVarD != null ? elhVarD.q() : "";
                    saveDevice(this.mDevice);
                    if (ProductCreateFactory.getProductKind(HealthDevice.HealthDeviceKind.getHealthDeviceKind(this.mDeviceType)) == 1) {
                        enm.c(this.mProductId, this.mDeviceMacAddress, "");
                    }
                }
                efx efxVar2 = this.mDevice;
                elh elhVar = this.mProductInfo;
                registerDeviceInfo(efxVar2, (elhVar == null || elhVar.l() == null) ? getDeviceNames() : elo.a(this.mProductId, this.mProductInfo.l().d()), this.mDeviceId, this.mProductId);
                sendEmptyMessage(111);
                String str = this.mProductId;
                String str2 = this.mDeviceMacAddress;
                etg.d(str, str2, str2);
                tickBiNfcOrQrCodeConnect(getContext(), etg.c(this.mStartConnectTime), bondState, this.mReconnectCount);
                return;
            }
            LogUtil.e(TAG, "onNotify() mDevice is null or BluetoothDevice is null");
        } catch (SecurityException e) {
            LogUtil.e(TAG, "doAfterPaired SecurityException:", ExceptionUtils.c(e));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    private String getDeviceNames() {
        Resources resources = getContext().getResources();
        if (resources == null || TextUtils.isEmpty(this.mDeviceType)) {
            return "";
        }
        String str = this.mDeviceType;
        str.hashCode();
        switch (str) {
            case "54":
                return resources.getString(R.string.IDS_device_group_name_body_fat_scale);
            case "68":
                return resources.getString(R.string.IDS_device_group_name_blood_pressure_scale);
            case "082":
                return resources.getString(R.string.IDS_add_device_smart_headphones);
            case "261":
                return resources.getString(R.string.IDS_device_group_name_rowing_machine_scale);
            case "266":
                return resources.getString(R.string.IDS_device_group_name_smart_pillow);
            case "268":
                return resources.getString(R.string.IDS_device_group_name_fascia_gun);
            case "270":
                return resources.getString(R.string.IDS_device_group_name_pulse_scale);
            case "271":
                return resources.getString(R.string.IDS_device_group_name_ecg_scale);
            case "272":
                return resources.getString(R.string.IDS_device_group_name_temperature_scale);
            case "273":
                return resources.getString(R.string.IDS_device_group_name_blood_oxygen_scale);
            default:
                return "";
        }
    }

    private void checkPermissions() {
        PermissionUtil.PermissionType permissionTypeC = PermissionDialogHelper.c();
        PermissionDialogHelper.e(getActivity(), permissionTypeC, new AnonymousClass5(this.mainActivity, permissionTypeC));
    }

    /* JADX INFO: renamed from: com.huawei.health.ecologydevice.ui.measure.fragment.NfcOrQrCodeGuideFragment$5, reason: invalid class name */
    class AnonymousClass5 extends CustomPermissionAction {
        final /* synthetic */ PermissionUtil.PermissionType val$permissionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(Context context, PermissionUtil.PermissionType permissionType) {
            super(context);
            this.val$permissionType = permissionType;
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            if (this.val$permissionType != PermissionUtil.PermissionType.LOCATION || eru.a(NfcOrQrCodeGuideFragment.this.mainActivity)) {
                NfcOrQrCodeGuideFragment.this.bondDevice();
            } else {
                LogUtil.a(NfcOrQrCodeGuideFragment.TAG, "Permission GpsClose is close");
                NfcOrQrCodeGuideFragment.this.checkGpsLocation();
            }
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            super.onDenied(str);
            NfcOrQrCodeGuideFragment.this.finishFragment();
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            super.onForeverDenied(permissionType);
            qrs.c(NfcOrQrCodeGuideFragment.this.mainActivity, permissionType, (CustomTextAlertDialog) null, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.NfcOrQrCodeGuideFragment$5$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m1003x491d7ab0(view);
                }
            }, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.NfcOrQrCodeGuideFragment$5$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m1004x2710e08f(view);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onForeverDenied$0$com-huawei-health-ecologydevice-ui-measure-fragment-NfcOrQrCodeGuideFragment$5, reason: not valid java name */
        /* synthetic */ void m1003x491d7ab0(View view) {
            NfcOrQrCodeGuideFragment.this.finishFragment();
        }

        /* JADX INFO: renamed from: lambda$onForeverDenied$1$com-huawei-health-ecologydevice-ui-measure-fragment-NfcOrQrCodeGuideFragment$5, reason: not valid java name */
        /* synthetic */ void m1004x2710e08f(View view) {
            NfcOrQrCodeGuideFragment.this.finishFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bondDevice() {
        if (this.mEnableBluetoothStatus == 2) {
            if ("082".equals(this.mDeviceType)) {
                new elc().b(this.mDeviceMacAddress, this.nemoDeviceCallback);
                return;
            } else {
                sendEmptyDelayMessage(109, 500L);
                return;
            }
        }
        jumpIndoorEquipOrDownloadResource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkGpsLocation() {
        LogUtil.a(TAG, "openGpsLocation jump to GPS Setting");
        eqw.d(this.mainActivity, isAdded(), new IdialogButtonClickCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.NfcOrQrCodeGuideFragment.6
            @Override // com.huawei.health.ecologydevice.callback.IdialogButtonClickCallback
            public void onClick(View view) {
                LogUtil.a(NfcOrQrCodeGuideFragment.TAG, "jump to GpsSetting");
                NfcOrQrCodeGuideFragment nfcOrQrCodeGuideFragment = NfcOrQrCodeGuideFragment.this;
                eru.b(nfcOrQrCodeGuideFragment, nfcOrQrCodeGuideFragment.isAdded(), 3);
            }

            @Override // com.huawei.health.ecologydevice.callback.IdialogButtonClickCallback
            public void onCancelClick(View view) {
                LogUtil.a(NfcOrQrCodeGuideFragment.TAG, "openGpsLocation onCancelClick");
                NfcOrQrCodeGuideFragment.this.finishFragment();
            }
        });
    }

    private void jumpIndoorEquipOrDownloadResource() {
        LogUtil.a(TAG, "jumpIndoorEquipOrDownloadResource");
        try {
            BluetoothDevice remoteDevice = (TextUtils.isEmpty(this.mDeviceMacAddress) || !BluetoothAdapter.checkBluetoothAddress(this.mDeviceMacAddress)) ? null : BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.mDeviceMacAddress);
            if (remoteDevice != null && !TextUtils.isEmpty(remoteDevice.getName())) {
                getProductIdByBluetoothName(remoteDevice.getName());
                updateIndexAndProductMap();
                return;
            }
            LogUtil.a(TAG, "bluetoothDevice  is null or bluetoothDevice.getName() is empty");
            startIndoorEquipRunningActByNfc();
        } catch (SecurityException e) {
            LogUtil.e(TAG, "jumpIndoorEquipOrDownloadResource SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void getProductIdByBluetoothName(String str) {
        this.mProductId = getProductIdByBluetooth(str);
        String strB = TextUtils.isEmpty(this.mSmartProductId) ? era.b(this.mProductId) : this.mSmartProductId;
        this.mSmartProductId = strB;
        LogUtil.a(TAG, "getProductIdByBluetoothName bluetoothName is ", str, ", mProductId is ", this.mProductId, ", smartProductId is ", strB);
    }

    private String getProductIdByBluetooth(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a(TAG, "broadcastName is empty");
            return "";
        }
        List<eds> deviceInfoByBluetooth = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceInfoByBluetooth(str);
        if (njy.b(deviceInfoByBluetooth)) {
            List<String> listAa = deviceInfoByBluetooth.get(0).aa();
            if (njy.b(listAa)) {
                return listAa.get(0);
            }
        }
        return "";
    }

    private void handlerToRefresh(elh elhVar) {
        if (elhVar == null) {
            LogUtil.a(TAG, "handlerToRefresh productInfo is null");
            return;
        }
        String strT = elhVar.t();
        ResourceManager.c().j(strT);
        if (((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isCorrectProductId(strT)) {
            sendEmptyMessage(105);
        }
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

    private void removeMessage(int i) {
        H5DeviceHandler h5DeviceHandler = this.mH5DeviceHandler;
        if (h5DeviceHandler != null) {
            h5DeviceHandler.removeMessages(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEmptyMessage(int i) {
        H5DeviceHandler h5DeviceHandler = this.mH5DeviceHandler;
        if (h5DeviceHandler != null) {
            h5DeviceHandler.sendEmptyMessage(i);
        }
    }

    private void sendEmptyDelayMessage(int i, long j) {
        H5DeviceHandler h5DeviceHandler = this.mH5DeviceHandler;
        if (h5DeviceHandler != null) {
            h5DeviceHandler.sendEmptyMessageDelayed(i, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishFragment() {
        popupFragment(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshProductInfo() {
        if ("082".equals(this.mDeviceType)) {
            sendEmptyMessage(REFRESHED_PRODUCT_INFO);
            return;
        }
        ProductMapInfo productMapInfoD = ProductMap.d(this.mSmartProductId);
        if (productMapInfoD == null) {
            LogUtil.a(TAG, "refreshProductInfo : mProductId is null");
            sendEmptyMessage(REFRESHED_PRODUCT_INFO);
            return;
        }
        this.mProductId = productMapInfoD.f();
        this.mProductInfo = ResourceManager.c().d(this.mProductId);
        this.mDeviceId = productMapInfoD.c();
        if (needUpdateAppVersion()) {
            return;
        }
        elh elhVar = this.mProductInfo;
        if (BleConstants.BLE_THIRD_DEVICE_H5.equals(elhVar != null ? elhVar.n().b() : "")) {
            if (!TextUtils.isEmpty(this.mProductId) && isBondedDevice(this.mProductId)) {
                LogUtil.a(TAG, "Device has bonded: mProductId = ", this.mProductId);
                switchH5ProIntro();
            }
        } else if ("68".equals(this.mDeviceType)) {
            switchBloodPressureIntroductionFragment();
            return;
        } else if (!TextUtils.isEmpty(this.mProductId) && isBondedDevice(this.mProductId)) {
            LogUtil.a(TAG, "Native Device has bonded: mProductId = ", this.mProductId);
            switchNativeMode();
            return;
        }
        sendEmptyMessage(REFRESHED_PRODUCT_INFO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void switchNativeMode() {
        LogUtil.a(TAG, "enter switchNativeMode");
        if (this.mProductInfo == null) {
            LogUtil.j(TAG, "switchNativeMode: mProductInfo is null");
            return;
        }
        if ("54".equals(this.mDeviceType) || "272".equals(this.mDeviceType)) {
            LogUtil.a(TAG, "goto ProductIntroductionFragment");
            switchProductIntroductionFragment();
        } else if (needJumpToSportPage()) {
            switchSportIntroductionFragment();
        } else if ("68".equals(this.mDeviceType)) {
            switchBloodPressureIntroductionFragment();
        } else {
            switchH5ProIntro();
        }
    }

    private boolean needJumpToSportPage() {
        return BleConstants.SPORT_TYPE_BIKE.equals(this.mDeviceType) || "261".equals(this.mDeviceType) || "260".equals(this.mDeviceType) || "31".equals(this.mDeviceType);
    }

    private void switchSportIntroductionFragment() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("productId", this.mProductId);
        contentValues.put("uniqueId", this.mDeviceMacAddress);
        contentValues.put("name", this.mDeviceName);
        this.mBundle.putParcelable("commonDeviceInfo", contentValues);
        ProductFragment productFragmentCreateProductFragment = ProductCreateFactory.createProductFragment(this.mProductId);
        productFragmentCreateProductFragment.setArguments(this.mBundle);
        switchFragment(this, productFragmentCreateProductFragment);
    }

    private void switchBloodPressureIntroductionFragment() {
        BloodPressureIntroductionFragment bloodPressureIntroductionFragment = new BloodPressureIntroductionFragment();
        bloodPressureIntroductionFragment.setArguments(this.mBundle);
        switchFragment(this, bloodPressureIntroductionFragment);
    }

    private void switchProductIntroductionFragment() {
        if (TextUtils.isEmpty(this.mBundle.getString("PID_FROM_QRCODE"))) {
            LogUtil.j(TAG, "switchProductIntroductionFragment pid is null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.mProductId);
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", this.mBundle.getString("BLE_FROM_QRCODE"));
        contentValues.put("productId", this.mProductId);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        bundle.putBoolean("isBindSuccess", true);
        Fragment productIntroductionFragment = new ProductIntroductionFragment();
        productIntroductionFragment.setArguments(bundle);
        switchFragment(this, productIntroductionFragment);
    }

    private boolean needUpdateAppVersion() {
        VersionVerifyUtilApi versionVerifyUtilApi = (VersionVerifyUtilApi) Services.b("PluginDevice", VersionVerifyUtilApi.class);
        if (!pip.f45449c.containsKey(this.mKind) || versionVerifyUtilApi.isPublishVersion(this.mProductId, this.mKind)) {
            return false;
        }
        LogUtil.a(TAG, "current device needs to update the app version, mProductId = ", this.mProductId);
        versionVerifyUtilApi.noSupportDevice(getContext(), getActivity());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showBondingView() {
        setProductNameAndImage();
        this.mDeviceBondStatus.setText(R.string.IDS_blite_guide_paire_opt_title);
        this.mFirstConnectFailedTv.setVisibility(8);
        this.mReBondTv.setVisibility(8);
        this.mReBondLoadingPb.setVisibility(0);
    }

    private void showBondedView() {
        this.mDeviceBondStatus.setText(R.string.IDS_user_profile_health_show_paried);
        this.mReBondLoadingPb.setVisibility(8);
        this.mFirstConnectFailedTv.setVisibility(8);
    }

    private void showFirstBindFail() {
        this.mFirstConnectFailedTv.setVisibility(0);
        this.mFirstConnectFailedTv.setText(R.string.IDS_device_err_connect_timeout_tips_info1);
        this.mDeviceBondStatus.setText(R.string.IDS_blite_guide_paire_opt_title);
        this.mReBondTv.setVisibility(8);
        this.mReBondLoadingPb.setVisibility(0);
    }

    private void showBondFail() {
        this.mFirstConnectFailedTv.setVisibility(8);
        this.mReBondLoadingPb.setVisibility(8);
        this.mReBondTv.setVisibility(0);
        this.mReBondTv.setText(R.string.IDS_btsdk_confirm_repair);
        this.mDeviceBondStatus.setText(R.string.IDS_device_bind_fail);
        this.mReBondTv.setTextColor(getResources().getColor(R.color.card_device_view_color3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDeviceCurrentState() {
        LogUtil.j(TAG, "showDeviceCurrentState mCurrentStatus：", Integer.valueOf(this.mCurrentStatus));
        switch (this.mCurrentStatus) {
            case 10:
                showFirstBindFail();
                break;
            case 11:
            default:
                LogUtil.j(TAG, "not have thi case");
                break;
            case 12:
                break;
            case 13:
                showConnectFailDialog();
                if (!"082".equals(this.mDeviceType)) {
                    tickBiNfcOrQrCodeConnect(getContext(), 0.0d, this.mNewStatus, this.mReconnectCount);
                }
                break;
            case 14:
                showBondFail();
                break;
            case 15:
                showBondingView();
                break;
            case 16:
                showBondedView();
                break;
            case 17:
                if (TYPE_BLUETOOTH_CONNECT_NOT_NEED.contains(this.mDeviceType)) {
                    doAfterPaired();
                } else {
                    showInputPinTipsDialog();
                }
                break;
            case 18:
                doAfterPaired();
                break;
        }
    }

    private void showInputPinTipsDialog() {
        LogUtil.d(TAG, "enter showInputPinTipsDialog()");
        HealthDevice healthDevice = this.mHealthDevic;
        if (healthDevice instanceof efx) {
            this.mDevice = (efx) healthDevice;
        }
        try {
            efx efxVar = this.mDevice;
            if (efxVar != null && efxVar.c() != null) {
                LogUtil.a(TAG, "bondState:", Integer.valueOf(this.mDevice.c().getBondState()));
                BluetoothDevice bluetoothDeviceC = this.mDevice.c();
                this.mBluetoothDevice = bluetoothDeviceC;
                if (bluetoothDeviceC != null && bluetoothDeviceC.getBondState() == 12) {
                    LogUtil.d(TAG, "showInputPinTipsDialog(): BluetoothDevice.BOND_BONDED");
                    doAfterPaired();
                }
                if (!TextUtils.isEmpty(this.mDevicePin)) {
                    showPinCodeDialog();
                    return;
                } else {
                    if (this.mBluetoothUtil == null) {
                        return;
                    }
                    LogUtil.d(TAG, "showInputPinTipsDialog(): mBluetoothUtil.createBond()");
                    this.mBluetoothUtil.createBond();
                    return;
                }
            }
            LogUtil.e(TAG, "onNotify() mDevice is null or BluetoothDevice is null");
        } catch (SecurityException e) {
            LogUtil.e(TAG, "showInputPinTipsDialog SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void showPinCodeDialog() {
        View viewInflate = View.inflate(getContext(), R.layout.input_pincode_dialog, null);
        getViewForDialog(viewInflate);
        if (this.mCustomViewDialog == null) {
            CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(getContext()).d(viewInflate).c(getContext().getString(R.string.IDS_device_hygride_button_cancel), new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.NfcOrQrCodeGuideFragment$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m1001x59995172(view);
                }
            }).a(getContext().getString(R.string.IDS_device_input), new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.NfcOrQrCodeGuideFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m1002x729aa311(view);
                }
            }).d();
            this.mCustomViewDialog = customViewDialogD;
            customViewDialogD.setCancelable(false);
        }
        this.mCustomViewDialog.show();
    }

    /* JADX INFO: renamed from: lambda$showPinCodeDialog$3$com-huawei-health-ecologydevice-ui-measure-fragment-NfcOrQrCodeGuideFragment, reason: not valid java name */
    /* synthetic */ void m1001x59995172(View view) {
        finishFragment();
    }

    /* JADX INFO: renamed from: lambda$showPinCodeDialog$4$com-huawei-health-ecologydevice-ui-measure-fragment-NfcOrQrCodeGuideFragment, reason: not valid java name */
    /* synthetic */ void m1002x729aa311(View view) {
        BluetoothUtil bluetoothUtil = this.mBluetoothUtil;
        if (bluetoothUtil != null) {
            bluetoothUtil.createBond();
        }
    }

    private void getViewForDialog(View view) {
        this.mDialogImageView = (ImageView) view.findViewById(R.id.iv_device_image);
        Bitmap productImage = getProductImage(IMAGE_NAME);
        if (productImage != null) {
            this.mDialogImageView.setImageBitmap(productImage);
        }
    }

    private void showConnectFailDialog() {
        this.mFirstConnectFailedTv.setVisibility(8);
        this.mReBondLoadingPb.setVisibility(8);
        this.mReBondTv.setVisibility(0);
        this.mReBondTv.setText(R.string.IDS_btsdk_confirm_repair);
        this.mDeviceBondStatus.setText(R.string.IDS_device_bind_fail);
        this.mReBondTv.setTextColor(getResources().getColor(R.color.textColorSecondary));
        if (getContext() == null) {
            return;
        }
        if (this.mDialogForConnectFail == null) {
            View viewInflate = LayoutInflater.from(dxw.d()).inflate(R.layout.blood_pressure_connect_timeout_dialog, (ViewGroup) null);
            CustomViewDialog.Builder builder = new CustomViewDialog.Builder(getContext());
            builder.b(R.string.IDS_device_wifi_bind_fail).d(viewInflate).d(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.NfcOrQrCodeGuideFragment$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m1000x29df096a(view);
                }
            });
            CustomViewDialog customViewDialogD = builder.d();
            this.mDialogForConnectFail = customViewDialogD;
            customViewDialogD.setCancelable(false);
        }
        this.mDialogForConnectFail.show();
    }

    /* JADX INFO: renamed from: lambda$showConnectFailDialog$5$com-huawei-health-ecologydevice-ui-measure-fragment-NfcOrQrCodeGuideFragment, reason: not valid java name */
    /* synthetic */ void m1000x29df096a(View view) {
        LogUtil.a(TAG, "showConnectionNoteDialog onclick PositiveButton");
        finishFragment();
    }

    private void reDownloadResource() {
        if (CommonUtil.ab(BaseApplication.getContext())) {
            showDownloadView();
            sendEmptyDelayMessage(108, 30000L);
            startDownloadResource();
            return;
        }
        sendEmptyMessage(108);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resourceDownloaded() {
        handlerToRefresh(ResourceManager.c().d(this.mProductId));
        removeMessage(108);
        sendEmptyMessage(104);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scanDevice() {
        if (this.mBluetoothUtil != null) {
            LogUtil.a(TAG, "enter scanDevice");
            this.mStartConnectTime = System.currentTimeMillis();
            this.mBluetoothUtil.scanDevice();
        }
    }

    private Bitmap getProductImage(String str) {
        String strD;
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        if (elhVarD != null && elhVarD.d().size() > 0) {
            if (IMAGE_NAME.equals(str)) {
                strD = elg.e().d(this.mProductId, str);
            } else {
                strD = elg.e().d(this.mProductId, elhVarD.d().get(0).d());
            }
        } else {
            strD = "";
        }
        return BitmapFactory.decodeFile(strD);
    }

    private void setProductNameAndImage() {
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        if (elhVarD != null) {
            super.setTitle(elo.a(this.mProductId, elhVarD.l().d()));
        }
        ImageView imageView = this.mDefaultDeviceImage;
        if (imageView == null || this.mDeviceImage == null) {
            return;
        }
        imageView.setVisibility(8);
        this.mDeviceImage.setVisibility(0);
        this.mDeviceImage.setImageBitmap(getProductImage(null));
    }

    private void tickBiNfcOrQrCodeConnect(Context context, double d, int i, int i2) {
        new etg.b().e(d).d(this.mProductId).b(this.mDeviceType).a(this.mEnterType).d(i2).a(i).j(this.mProductId).e(this.mDeviceMacAddress).b().c(context);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (getActivity() == null) {
            LogUtil.j(TAG, "onclick view is null");
            return;
        }
        if (qrs.r()) {
            LogUtil.a(TAG, "click too fast");
            return;
        }
        HealthTextView healthTextView = this.mReBondTv;
        if (view == healthTextView) {
            if (healthTextView.getText().toString().equals(getResources().getString(R.string.IDS_device_measureactivity_guide_start_measure))) {
                etn.b(getContext(), this.mProductId, this.mDevice.getUniqueId());
                return;
            }
            if (this.mReBondTv.getText().toString().equals(getResources().getString(R.string.IDS_btsdk_confirm_repair))) {
                showBondingView();
                judgingBluetoothOnOff(2);
            } else if (this.mReBondTv.getText().toString().equals(getResources().getString(R.string.IDS_hwh_stressdialog_download_again))) {
                this.mFirstConnectFailedTv.setVisibility(8);
                reDownloadResource();
            } else {
                LogUtil.j(TAG, "not have this view");
            }
        }
    }

    static class H5DeviceHandler extends Handler {
        private WeakReference<NfcOrQrCodeGuideFragment> mWeakReference;

        private H5DeviceHandler(NfcOrQrCodeGuideFragment nfcOrQrCodeGuideFragment) {
            this.mWeakReference = new WeakReference<>(nfcOrQrCodeGuideFragment);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            NfcOrQrCodeGuideFragment nfcOrQrCodeGuideFragment = this.mWeakReference.get();
            if (nfcOrQrCodeGuideFragment == null || !nfcOrQrCodeGuideFragment.isAdded() || nfcOrQrCodeGuideFragment.isRemoving() || nfcOrQrCodeGuideFragment.isDetached()) {
                return;
            }
            switch (message.what) {
                case 104:
                    LogUtil.d(NfcOrQrCodeGuideFragment.TAG, "DOWNLOAD_RESOURCE_SUCCESS");
                    removeMessages(108);
                    nfcOrQrCodeGuideFragment.refreshProductInfo();
                    break;
                case 105:
                case 107:
                default:
                    LogUtil.j(NfcOrQrCodeGuideFragment.TAG, "not have this case", Integer.valueOf(message.what));
                    break;
                case 106:
                    LogUtil.d(NfcOrQrCodeGuideFragment.TAG, "STATE_CHANGED");
                    nfcOrQrCodeGuideFragment.showDeviceCurrentState();
                    break;
                case 108:
                case 112:
                    nfcOrQrCodeGuideFragment.handleCancel();
                    LogUtil.j(NfcOrQrCodeGuideFragment.TAG, "DOWNLOAD fail mProductId:", nfcOrQrCodeGuideFragment.mProductId);
                    if (EzPluginManager.b().j(nfcOrQrCodeGuideFragment.mProductId)) {
                        nfcOrQrCodeGuideFragment.resourceDownloaded();
                    } else {
                        nfcOrQrCodeGuideFragment.showDownloadFail(message.what);
                    }
                    break;
                case 109:
                    nfcOrQrCodeGuideFragment.scanDevice();
                    break;
                case NfcOrQrCodeGuideFragment.REFRESHED_PRODUCT_INFO /* 110 */:
                    nfcOrQrCodeGuideFragment.showBondingView();
                    nfcOrQrCodeGuideFragment.judgingBluetoothOnOff(2);
                    break;
                case 111:
                    LogUtil.d(NfcOrQrCodeGuideFragment.TAG, "enter SWITCH_FRAGMENT case");
                    if (BleConstants.BLE_THIRD_DEVICE_H5.equals(nfcOrQrCodeGuideFragment.mProductInfo != null ? nfcOrQrCodeGuideFragment.mProductInfo.n().b() : "")) {
                        nfcOrQrCodeGuideFragment.switchH5ProIntro();
                    } else {
                        nfcOrQrCodeGuideFragment.switchNativeMode();
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void switchH5ProIntro() {
        LogUtil.d(TAG, "enter switchH5ProIntro");
        elh elhVar = this.mProductInfo;
        if (elhVar == null) {
            LogUtil.j(TAG, "switchH5ProIntro: mProductInfo is null");
        } else if ("1".equals(elhVar.g())) {
            etn.c(getActivity(), this.mProductInfo, this.mProductId, this.mDeviceMacAddress);
            popupFragment(null);
        }
    }

    private void saveDevice(efx efxVar) {
        LogUtil.d(TAG, "saveDevice");
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        MeasureKit healthDeviceKit = ((MeasureKitManagerApi) Services.b("PluginDevice", MeasureKitManagerApi.class)).getHealthDeviceKit(this.mMeasureKit);
        ContentValues contentValues = new ContentValues();
        contentValues.put("kind", getDeviceKindName(elhVarD, healthDeviceKit));
        contentValues.put(Wpt.MODE, Integer.valueOf(getDeviceMode(elhVarD, healthDeviceKit)));
        contentValues.put(TtmlNode.TEXT_EMPHASIS_AUTO, Integer.valueOf(isAutoMeasureDevcie(elhVarD, healthDeviceKit) ? 1 : 0));
        contentValues.put("uniqueId", efxVar.getUniqueId());
        contentValues.put("sn", "");
        contentValues.put("name", efxVar.getDeviceName());
        contentValues.put("productId", this.mProductId);
        contentValues.put(EventMonitorRecord.ADD_TIME, Long.valueOf(System.currentTimeMillis()));
        contentValues.put("kitUuid", this.mMeasureKit);
        if (((DeviceDataBaseHelperApi) Services.b("PluginDevice", DeviceDataBaseHelperApi.class)).insert(contentValues) == -1) {
            LogUtil.a(TAG, "fail to insert device data base");
        }
    }

    private int getDeviceMode(elh elhVar, MeasureKit measureKit) {
        if (measureKit != null) {
            return getConnectionModeByController(measureKit);
        }
        if (elhVar != null) {
            return elhVar.v().c();
        }
        LogUtil.j(TAG, "can not determine connect mode, set default connect mode");
        return 0;
    }

    private int getConnectionModeByController(MeasureKit measureKit) {
        MeasureController backgroundController = measureKit.getBackgroundController();
        if (backgroundController == null) {
            backgroundController = measureKit.getMeasureController();
        }
        if (backgroundController == null) {
            return 0;
        }
        if (backgroundController instanceof BleMeasureController) {
            return 1;
        }
        return backgroundController instanceof HdpMeasureController ? 2 : 4;
    }

    private String getDeviceKindName(elh elhVar, MeasureKit measureKit) {
        String strName = HealthDevice.HealthDeviceKind.HDK_UNKNOWN.name();
        if (measureKit != null && measureKit.getHealthDataKind() != null) {
            return measureKit.getHealthDataKind().name();
        }
        if (elhVar != null && elhVar.m() != null) {
            return elhVar.m().name();
        }
        LogUtil.j(TAG, "can not determine device kind, set defualt");
        return strName;
    }

    private boolean isAutoMeasureDevcie(elh elhVar, MeasureKit measureKit) {
        return ((elhVar != null && "10".equals(elhVar.r())) || measureKit == null || measureKit.getBackgroundController() == null) ? false : true;
    }

    private boolean isBondedDevice(String str) {
        for (ContentValues contentValues : dmg.a().getBondedDeviceByProductId(str)) {
            String asString = contentValues.getAsString("uniqueId");
            String asString2 = contentValues.getAsString("name");
            if ((!TextUtils.isEmpty(this.mDeviceMacAddress) && this.mDeviceMacAddress.equals(asString)) || (!TextUtils.isEmpty(this.mDeviceName) && this.mDeviceName.equals(asString2))) {
                if (!TextUtils.isEmpty(this.mDeviceMacAddress)) {
                    asString = this.mDeviceMacAddress;
                }
                this.mDeviceMacAddress = asString;
                return true;
            }
        }
        return false;
    }
}
