package com.huawei.health.device.ui.measure.fragment.device;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.huawei.devicesdk.callback.DeviceStatusChangeCallback;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.device.api.DeviceMainActivityApi;
import com.huawei.health.device.callback.BindHealthDeviceCallback;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.callback.VersionNoSupportCallback;
import com.huawei.health.device.connectivity.comm.BleDeviceHelper;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.fatscale.multiusers.WeightDataManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.device.ui.measure.fragment.HagridDeviceBindResultFragment;
import com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment;
import com.huawei.health.device.ui.measure.fragment.WiFiDeviceBindResultFragment;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.ecologydevice.callback.NemoDeviceCallback;
import com.huawei.health.ecologydevice.connectivity.ScanFilter;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.manager.RopeCloudAuthManager;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.HeartRateDeviceRunGuide;
import com.huawei.health.ecologydevice.ui.measure.fragment.ProductIntroductionFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.RopeSkippingGuideFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceBindFailedFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceBindSuccessFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceSilentGuideFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.utils.ProductCreateFactory;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.plugindevice.R;
import com.huawei.pluginmgr.hwwear.bean.DeviceDownloadSourceInfo;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.dmm;
import defpackage.dmp;
import defpackage.dmr;
import defpackage.dmu;
import defpackage.doq;
import defpackage.drw;
import defpackage.dso;
import defpackage.dti;
import defpackage.dxe;
import defpackage.dxi;
import defpackage.dxm;
import defpackage.dxw;
import defpackage.dxx;
import defpackage.dyg;
import defpackage.dyj;
import defpackage.dyn;
import defpackage.dyq;
import defpackage.dys;
import defpackage.dzu;
import defpackage.eby;
import defpackage.ecf;
import defpackage.efx;
import defpackage.elc;
import defpackage.elg;
import defpackage.elh;
import defpackage.emh;
import defpackage.emk;
import defpackage.emr;
import defpackage.enq;
import defpackage.epq;
import defpackage.ept;
import defpackage.era;
import defpackage.esj;
import defpackage.est;
import defpackage.esw;
import defpackage.ete;
import defpackage.etg;
import defpackage.etn;
import defpackage.hcd;
import defpackage.iog;
import defpackage.ioi;
import defpackage.njy;
import defpackage.pip;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceBindWaitingFragment extends BaseFragment {
    private static final int BIND_ANIMATION_STOP_INDEX = 3;
    private static final String BUNDLE_KEY_AUTO_DEVICE_SSID = "auth_device_id";
    private static final String BUNDLE_KEY_BIND_START = "is_bind_started";
    private static final String BUNDLE_KEY_DEVICE_WEIGHT = "deviceWeight";
    private static final String BUNDLE_KEY_HAS_MANAGER = "hasManager";
    private static final String BUNDLE_KEY_IS_BIND_SUCCESS = "isBindSuccess";
    private static final String BUNDLE_KEY_MAIN_HUID = "mainHuid";
    private static final String BUNDLE_KEY_PRODUCT_ID = "productId";
    private static final String BUNDLE_KEY_RESIS_FAT = "deviceResis";
    private static final String BUNDLE_KEY_VIEW = "view";
    private static final String BUNDLE_VALUE_BIND_RESULT_CONFIRM = "bindResultConfirm";
    private static final int CONNECT_TIMEOUT = 1;
    private static final int DELAY_TIME = 1000;
    private static final String DEVICE_ASSOCIATION = "DEVICE_ASSOCIATION";
    private static final String DOBBY_SCALE = "Dobby";
    private static final int ERROR_NUMBER = 907127004;
    private static final String HEALTH_APP_MAIN_ACTIVITY = "com.huawei.health.MainActivity";
    private static final String HOME_TAB_DEVICE = "HOME";
    private static final String HOME_TAB_NAME = "homeTabName";
    private static final String HUAWEI_SCALE_3BLE = "HUAWEI Scale 3 BLE-";
    private static final String IS_GO_ROPE_JUMP = "is_go_rope_jump";
    private static final int MSG_BIND_FAIL = 2;
    private static final int MSG_DEVICE_CHECK_FAIL = 3;
    private static final String OVERSEA_HAGRID_B29_SCALE = "Hagrid-B29";
    private static final String OVERSEA_HAG_SCALE = "HAG";
    private static final String PAIR_YES = "yes";
    private static final String RELEASE_TAG = "R_Weight_PluginDevice_DeviceBindWaitingFragment";
    private static final int REQUEST_GPS_LOCATION = 3;
    private static final int SCAN_TIMEOUT = 30000;
    private static final String SKIP_PRODUCT_INTRODUCTION_FRAGMENT = "SKIP_PRODUCT_INTRODUCTION_FRAGMENT";
    private static final String TAG = "PluginDevice_DeviceBindWaitingFragment";
    private static final int UPDATE_DATA_BASE_FAIL_VALUE = 0;
    private static final int WEIGHT = -1;
    public static final Observer sSkipProductIntroductionObserver = new Observer() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment.1
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            Object obj = objArr[0];
            if (obj instanceof Integer) {
                int unused = DeviceBindWaitingFragment.sSportType = ((Integer) obj).intValue();
            }
            if (DeviceBindWaitingFragment.sSkipProductIntroductionObserver != null) {
                ObserverManagerUtil.a(DeviceBindWaitingFragment.sSkipProductIntroductionObserver, "SKIP_PRODUCT_INTRODUCTION_FRAGMENT");
            }
        }
    };
    private static int sSportType = 0;
    private dxe gpslUtil;
    private AnimationDrawable mAnimationDrawable;
    private CustomAlertDialog mCustomAlertDialog;
    private HealthTextView mDeviceBindingTextView;
    private HealthTextView mDeviceBindingUnderTextView;
    private int mDeviceBluetoothType;
    private String mDeviceIconPath;
    private ImageView mDeviceImageView;
    private ContentValues mDeviceInfo;
    private epq mDeviceManagerModel;
    private esw mDeviceResourceTool;
    private String mDeviceSn;
    private String mDeviceStateListenId;
    private String mDeviceType;
    private DeviceDownloadSourceInfo mDownloadSource;
    private Handler mHandler;
    private HealthDevice mHealthDevice;
    private ioi mInteractor;
    private boolean mIsGoRopeJump;
    private boolean mIsInvalidation;
    private boolean mIsNfcCommect;
    private boolean mIsUniformDeviceManagementFlag;
    private MeasurableDevice mMeasurableDevice;
    private LinearLayout mNetWorkErrorLayout;
    private ImageView mPairGuideProgressAnim;
    private int mPosition;
    private String mProductId;
    private elh mProductInfo;
    private HealthProgressBar mProgressBar;
    private LinearLayout mResourceErrorLayout;
    private String mSsid;
    private TimerTask mTask;
    private ept mThirdPartyUniteDevice;
    private Timer mTimer;
    private String mTitle;
    private String mUniqueId;
    private float mWeight;
    private dso mWeightAndFatRateData;
    private BleDeviceHelper mBleDeviceHelper = null;
    private String mMeasureKit = "74e12d04-cf14-4ce8-9e42-7a085f79b708";
    private boolean mIsHealthDataStatus = false;
    private boolean mIsBindStarted = false;
    private boolean mIsBingTimeout = false;
    private boolean mIsJump = false;
    private Timer mConnectTimer = null;
    private NoTitleCustomAlertDialog mDialog = null;
    private boolean isFromScanFragment = false;
    private boolean mIsHasManaer = false;
    private boolean mIsHasBondedProduct = false;
    private boolean isGotoUserInfoActivity = false;
    private String mDeviceIdFromDevice = "";
    private boolean mIsDownloadResourceFailed = false;
    private byte[] mMainHuid = null;
    private ArrayList<String> mUuidList = new ArrayList<>(16);
    private int mErrorCode = Integer.MIN_VALUE;
    private boolean mIsJumpToSetting = false;
    private boolean mIsOnceRejectDevice = false;
    private IHealthDeviceCallback iHealthDeviceCallback = new IHealthDeviceCallback() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment.2
        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(HealthDevice healthDevice, HealthData healthData) {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(HealthDevice healthDevice, List<HealthData> list) {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onProgressChanged(HealthDevice healthDevice, HealthData healthData) {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onStatusChanged(HealthDevice healthDevice, int i) {
            LogUtil.a(DeviceBindWaitingFragment.TAG, "iHealthDeviceCallback onStatusChanged > status: " + i + ", mIsBingTimeout: " + DeviceBindWaitingFragment.this.mIsBingTimeout);
            if (i != -2 || DeviceBindWaitingFragment.this.mIsBingTimeout) {
                return;
            }
            LogUtil.a(DeviceBindWaitingFragment.TAG, "send user auth command- user authentication is completed, the binding of success");
            DeviceBindWaitingFragment.this.cancelTimer();
            DeviceBindWaitingFragment.this.jumpToCompUserInfo(false);
            dmp.d().a(DeviceBindWaitingFragment.this.mProductId, DeviceBindWaitingFragment.this.mProductInfo.q(), DeviceBindWaitingFragment.this.mMeasurableDevice, new IDeviceEventHandler() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment.2.1
                @Override // com.huawei.health.device.callback.IDeviceEventHandler
                public void onDeviceFound(HealthDevice healthDevice2) {
                }

                @Override // com.huawei.health.device.callback.IDeviceEventHandler
                public void onScanFailed(int i2) {
                }

                @Override // com.huawei.health.device.callback.IDeviceEventHandler
                public void onStateChanged(int i2) {
                }
            });
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onFailed(HealthDevice healthDevice, int i) {
            LogUtil.a(DeviceBindWaitingFragment.TAG, " send user auth command- user authentication is completed- the binding of fail");
        }
    };
    private BindHealthDeviceCallback mBindCallback = new BindHealthDeviceCallback() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment.3
        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(HealthDevice healthDevice, HealthData healthData) {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(HealthDevice healthDevice, List<HealthData> list) {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onProgressChanged(HealthDevice healthDevice, HealthData healthData) {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onStatusChanged(HealthDevice healthDevice, int i) {
        }

        @Override // com.huawei.health.device.callback.BindHealthDeviceCallback
        public void onStatusChanged(HealthDevice healthDevice, int i, Bundle bundle) {
            ReleaseLogUtil.d(DeviceBindWaitingFragment.RELEASE_TAG, "mBindCallback onStatusChanged > status: ", Integer.valueOf(i), ", mIsBingTimeout: ", Boolean.valueOf(DeviceBindWaitingFragment.this.mIsBingTimeout));
            DeviceBindWaitingFragment.this.processCallbackResult(i, bundle);
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onFailed(HealthDevice healthDevice, int i) {
            if (i == 3 && DeviceBindWaitingFragment.this.mHandler != null) {
                DeviceBindWaitingFragment.this.mHandler.sendEmptyMessage(2);
            }
            LogUtil.a(DeviceBindWaitingFragment.TAG, " send user auth command, user authentication is completed, the binding of fail");
        }
    };
    IDeviceEventHandler mBindingStatusCallback = new IDeviceEventHandler() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment.4
        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onDeviceFound(HealthDevice healthDevice) {
            LogUtil.d(DeviceBindWaitingFragment.TAG, "onDeviceFound");
        }

        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onScanFailed(int i) {
            LogUtil.d(DeviceBindWaitingFragment.TAG, "onScanFailed code:", Integer.valueOf(i));
        }

        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onStateChanged(int i) {
            ReleaseLogUtil.d(DeviceBindWaitingFragment.RELEASE_TAG, "onStateChanged code :", Integer.valueOf(i));
            if (i == 7) {
                DeviceBindWaitingFragment.this.passDevicePair();
                if (dxm.ac(DeviceBindWaitingFragment.this.mProductId) || dxm.ag(DeviceBindWaitingFragment.this.mProductId)) {
                    LogUtil.j(DeviceBindWaitingFragment.TAG, "is own fat scale");
                    return;
                } else {
                    etn.c();
                    return;
                }
            }
            if (i == 8) {
                ReleaseLogUtil.d(DeviceBindWaitingFragment.RELEASE_TAG, "PAIRING_FAILED");
                DeviceBindWaitingFragment.this.pairDeviceFailed();
            } else if (i == 10) {
                drw.e().a(DeviceBindWaitingFragment.this.mProductId, DeviceBindWaitingFragment.this.mProductInfo.q(), DeviceBindWaitingFragment.this.mHealthDevice, this);
                ReleaseLogUtil.d(DeviceBindWaitingFragment.RELEASE_TAG, "PAIRING_STATE_OK");
            } else if (i == -1) {
                DeviceBindWaitingFragment.this.mErrorCode = -1;
                DeviceBindWaitingFragment.this.pairDeviceFailed();
            } else {
                LogUtil.d(DeviceBindWaitingFragment.TAG, "in else branch");
            }
        }
    };
    private DeviceStatusChangeCallback mDeviceStatusChangeCallback = new DeviceStatusChangeCallback() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment$$ExternalSyntheticLambda4
        @Override // com.huawei.devicesdk.callback.DeviceStatusChangeCallback
        public final void onConnectStatusChanged(DeviceInfo deviceInfo, int i, int i2) {
            this.f$0.m959x3790e493(deviceInfo, i, i2);
        }
    };
    private BroadcastReceiver mNetBroadcastReceiver = new BroadcastReceiver() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if (CommonUtil.ab(context)) {
                    DeviceBindWaitingFragment.this.startDownloadThirdPartyDevicePlugin();
                    DeviceBindWaitingFragment.this.unregisterNetworkBroadcastReceiver();
                } else {
                    ReleaseLogUtil.e(DeviceBindWaitingFragment.TAG, "onReceive, net work is error");
                }
            }
        }
    };

    /* JADX INFO: renamed from: lambda$new$0$com-huawei-health-device-ui-measure-fragment-device-DeviceBindWaitingFragment, reason: not valid java name */
    /* synthetic */ void m959x3790e493(DeviceInfo deviceInfo, int i, int i2) {
        LogUtil.a(TAG, "new device pair -> deviceInfo: ", deviceInfo.getDeviceName(), "status: ", Integer.valueOf(i), "errCode: ", Integer.valueOf(i2));
        if (i == 30) {
            LogUtil.a(TAG, "bonded_device_success");
            emk.c().a(this.mDeviceStateListenId);
            drw.e().a(this.mProductId, this.mProductInfo.q(), this.mThirdPartyUniteDevice, this.mBindingStatusCallback);
        } else if (i == 31) {
            LogUtil.a(TAG, "bonded_device_ing");
        } else {
            if (i == 32) {
                LogUtil.a(TAG, "bonded_device_failed");
                emk.c().a(this.mDeviceStateListenId);
                pairDeviceFailed();
                return;
            }
            LogUtil.a(TAG, "unknown status", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void passDevicePair() {
        String strC;
        ReleaseLogUtil.d(RELEASE_TAG, "DeviceBindWaitingFragment PAIRING_PASSED");
        if (isSwitchPage()) {
            strC = this.mUniqueId;
        } else {
            strC = this.mDeviceManagerModel.c(this.mPosition);
        }
        etg.d(this.mProductId, strC, this.mUniqueId);
        if (getDataStatus() && Utils.h() && (!Utils.o() || !isShowAuthorizeDialog())) {
            showAuthorizeAlertDialog();
        } else {
            jumpToActivity();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pairDeviceFailed() {
        LogUtil.a(TAG, "DeviceBindWaitingFragment PAIRING_FAILED mDeviceBluetoothType:", Integer.valueOf(this.mDeviceBluetoothType));
        if (isSwitchPage() && getActivity() != null) {
            getActivity().setResult(1);
        }
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.mProductId);
        bundle.putString("title", this.mTitle);
        if (this.mErrorCode == -1) {
            bundle.putInt("errorCode", -1);
            this.mErrorCode = Integer.MIN_VALUE;
        }
        if ("9bf158ba-49b0-46aa-9fdf-ed75da1569cf".equals(this.mProductId) || dxm.ad(this.mProductId)) {
            LogUtil.a(TAG, "dnurse or scale");
            bundle.putBoolean(DeviceBindFailedFragment.IS_FROM_BIND, false);
        } else {
            bundle.putBoolean(DeviceBindFailedFragment.IS_FROM_BIND, true);
        }
        LogUtil.a(ERROR_NUMBER, "PluginDevice_PluginDevice", bundle, false, "Fail to bind device ", bundle);
        DeviceBindFailedFragment deviceBindFailedFragment = new DeviceBindFailedFragment();
        if (etn.j(this.mProductId)) {
            dmp.d().d(emh.b().d(), this.mUniqueId);
        } else {
            dmp.d().o(this.mUniqueId);
        }
        deviceBindFailedFragment.setArguments(bundle);
        switchFragment(deviceBindFailedFragment);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        LogUtil.d(TAG, "DeviceBindWaitingFragment onDestroyView");
        BleDeviceHelper bleDeviceHelper = this.mBleDeviceHelper;
        if (bleDeviceHelper != null) {
            bleDeviceHelper.c(null);
        }
        super.onDestroyView();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        this.mInteractor = ioi.d();
        ReleaseLogUtil.d(RELEASE_TAG, "DeviceBindWaitingFragment onCreate");
        super.onCreate(bundle);
        if (bundle != null) {
            this.mIsBindStarted = bundle.getBoolean(BUNDLE_KEY_BIND_START, false);
        }
        this.mHandler = new ConnectHandler(this);
        this.mIsJump = false;
        this.mDeviceManagerModel = emk.c().d();
        Bundle arguments = getArguments();
        initVariables(arguments);
        LogUtil.a(TAG, "DeviceBindWaitingFragment productId is ", this.mProductId, ",mDeviceType = ", this.mDeviceType);
        LogUtil.a(TAG, "HealthUtils.isSwitchPage(getContext()):", Boolean.valueOf(isSwitchPage()));
        if (isEcologyHeadphones(this.mProductId)) {
            return;
        }
        if (!isSwitchPage()) {
            if (this.mDeviceManagerModel == null) {
                LogUtil.a(TAG, "mDeviceManagerModel == null");
                return;
            }
            if (initDeviceData()) {
                elh elhVarD = ResourceManager.c().d(this.mProductId);
                this.mProductInfo = elhVarD;
                if (elhVarD == null) {
                    resetProductInfo(arguments);
                }
                insertDeviceData();
                return;
            }
            return;
        }
        stop();
    }

    private boolean isEcologyHeadphones(String str) {
        return "4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c".equals(str);
    }

    private void initVariables(Bundle bundle) {
        if (bundle != null) {
            try {
                this.mUuidList = bundle.getStringArrayList(BasePairManagerJsApi.UUID_LIST);
                this.mProductId = bundle.getString("productId");
                this.mIsGoRopeJump = bundle.getBoolean(IS_GO_ROPE_JUMP, false);
                this.mDeviceInfo = (ContentValues) bundle.getParcelable("commonDeviceInfo");
                this.mDownloadSource = (DeviceDownloadSourceInfo) bundle.getParcelable(AdShowExtras.DOWNLOAD_SOURCE);
                boolean z = bundle.getBoolean("isNfcConnect", false);
                this.mIsNfcCommect = z;
                LogUtil.a(TAG, "onCreate getBoolean mIsNfcCommect = ", Boolean.valueOf(z));
                ContentValues contentValues = this.mDeviceInfo;
                if (contentValues != null) {
                    this.mProductId = contentValues.getAsString("productId");
                    this.mUniqueId = this.mDeviceInfo.getAsString("uniqueId");
                }
                if (njy.b(this.mUuidList)) {
                    this.mProductId = this.mUuidList.get(0);
                }
                this.mPosition = bundle.getInt("position");
                this.mTitle = bundle.getString("title");
                this.mDeviceType = bundle.getString("DeviceType");
                this.mDeviceIconPath = bundle.getString("DeviceIconPath");
                this.mIsInvalidation = bundle.getBoolean("is_invalidation", false);
                this.isFromScanFragment = bundle.getBoolean("from_scan_fragment", false);
            } catch (Exception unused) {
                LogUtil.e(TAG, "DeviceBindWaitingFragment onCreate Exception");
            }
        }
    }

    private boolean initDeviceData() {
        if (isSwitchPage()) {
            return isHealthDeviceNull();
        }
        ArrayList<ept> arrayList = new ArrayList<>(10);
        ArrayList<HealthDevice> arrayList2 = new ArrayList<>(10);
        if (this.mDeviceManagerModel == null) {
            LogUtil.a(TAG, "mDeviceManagerModel == null");
            return false;
        }
        boolean zB = ete.d().b();
        this.mIsUniformDeviceManagementFlag = zB;
        if (zB) {
            arrayList = this.mDeviceManagerModel.e();
        } else {
            arrayList2 = this.mDeviceManagerModel.a();
        }
        if (njy.e(arrayList) && njy.e(arrayList2) && getActivity() != null) {
            LogUtil.a(TAG, "DeviceBindWaitingFragment destroy activity");
            getActivity().finish();
            return false;
        }
        if (!njy.c(arrayList, this.mPosition) && !njy.c(arrayList2, this.mPosition)) {
            return false;
        }
        if (this.mIsUniformDeviceManagementFlag) {
            this.mThirdPartyUniteDevice = arrayList.get(this.mPosition);
            return true;
        }
        this.mHealthDevice = arrayList2.get(this.mPosition);
        return true;
    }

    private boolean isHealthDeviceNull() {
        if ("9bf158ba-49b0-46aa-9fdf-ed75da1569cf".equals(this.mProductId)) {
            dmr dmrVar = new dmr();
            this.mHealthDevice = dmrVar;
            this.mUniqueId = dmrVar.getUniqueId();
        } else {
            if (enq.d().c()) {
                HealthDevice healthDeviceB = enq.d().b(this.mProductId);
                this.mHealthDevice = healthDeviceB;
                return healthDeviceB != null;
            }
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.mUniqueId);
            int i = this.mDeviceBluetoothType;
            if (i != 1) {
                if (i == 2) {
                    this.mHealthDevice = dmu.a(remoteDevice);
                }
            }
            this.mHealthDevice = efx.b(remoteDevice);
        }
        return this.mHealthDevice != null;
    }

    private void resetProductInfo(Bundle bundle) {
        HealthDevice healthDevice = this.mHealthDevice;
        if (healthDevice != null && !(healthDevice instanceof MeasurableDevice)) {
            LogUtil.j(TAG, "resetProductInfo mHealthDevice not MeasurableDevice");
            return;
        }
        String strC = this.mDeviceManagerModel.c(this.mPosition);
        String strD = this.mDeviceManagerModel.d(this.mPosition);
        elh elhVar = new elh();
        this.mProductInfo = elhVar;
        elhVar.l(ResourceManager.c().a(strC, "SHA-256"));
        this.mProductInfo.b("ic_heartrate_devices", strD, strC);
        this.mProductInfo.a("1");
        dmm.e eVar = new dmm.e();
        eVar.e(1);
        eVar.b(10L, TimeUnit.SECONDS);
        this.mProductInfo.b(eVar.b());
        this.mProductInfo.f(this.mMeasureKit);
        if (bundle != null) {
            try {
                this.mProductInfo.a(HealthDevice.HealthDeviceKind.valueOf(bundle.getString("scan_kind")));
            } catch (Exception unused) {
                LogUtil.e(TAG, "DeviceBindWaitingFragment onCreate Exception");
            }
        }
    }

    private void insertDeviceData() {
        elh elhVar = this.mProductInfo;
        if (elhVar == null || elhVar.v() == null) {
            LogUtil.j(TAG, "insertDeviceData mProductInfo = null");
            return;
        }
        String strA = this.mProductInfo.v().a();
        ReleaseLogUtil.d(RELEASE_TAG, "insertDeviceData pair = ", strA);
        if (dxm.ad(this.mProductId) && !dzu.e(this.mProductId, "HDK_WEIGHT")) {
            dzu.c(getContext(), getActivity(), new VersionNoSupportCallback() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment$$ExternalSyntheticLambda5
                @Override // com.huawei.health.device.callback.VersionNoSupportCallback
                public final void onDialogClose() {
                    this.f$0.m957x2958787();
                }
            });
            cancelTimer();
            return;
        }
        if (needUpdateAppVersion()) {
            ReleaseLogUtil.d(RELEASE_TAG, "current device needs to update the app version, mProductId = ", CommonUtil.bu() ? dyg.b(this.mProductId) : this.mProductId);
            dzu.c(getContext(), getActivity(), new VersionNoSupportCallback() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment$$ExternalSyntheticLambda6
                @Override // com.huawei.health.device.callback.VersionNoSupportCallback
                public final void onDialogClose() {
                    this.f$0.m958x9be69c8();
                }
            });
            cancelTimer();
            return;
        }
        queryDeviceByUniqueId();
        if (dxm.ag(this.mProductId)) {
            dti.b(this.mProductId, this.mUniqueId);
        }
        if (this.mIsUniformDeviceManagementFlag) {
            bindDeviceByUdsProcess(strA);
            return;
        }
        if (etn.j(this.mProductId)) {
            if (!(this.mHealthDevice instanceof MeasurableDevice)) {
                LogUtil.j(TAG, "attachUniqueId is null or mHealthDevice no instanceof MeasurableDevice");
                this.mBindingStatusCallback.onStateChanged(-1);
                return;
            } else {
                drw.e().d(emh.b().d(), this.mProductId, this.mProductInfo.q(), (MeasurableDevice) this.mHealthDevice, this.mBindingStatusCallback);
                return;
            }
        }
        bindDeviceByOldProcess(strA);
    }

    /* JADX INFO: renamed from: lambda$insertDeviceData$1$com-huawei-health-device-ui-measure-fragment-device-DeviceBindWaitingFragment, reason: not valid java name */
    /* synthetic */ void m957x2958787() {
        popupFragment(null);
    }

    /* JADX INFO: renamed from: lambda$insertDeviceData$2$com-huawei-health-device-ui-measure-fragment-device-DeviceBindWaitingFragment, reason: not valid java name */
    /* synthetic */ void m958x9be69c8() {
        popupFragment(null);
    }

    private void queryDeviceByUniqueId() {
        if (!"2GYA".equals(era.b(this.mProductId))) {
            LogUtil.a(TAG, "is not new HEAD repo device");
        } else {
            emr.d().e(0, this.mUniqueId, new HiDataClientListener() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment$$ExternalSyntheticLambda9
                @Override // com.huawei.hihealth.data.listener.HiDataClientListener
                public final void onResult(List list) {
                    this.f$0.m960x9c3a1717(list);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$queryDeviceByUniqueId$3$com-huawei-health-device-ui-measure-fragment-device-DeviceBindWaitingFragment, reason: not valid java name */
    /* synthetic */ void m960x9c3a1717(List list) {
        esj.c().a(isJumpVibrantLifePage(list));
    }

    private boolean isJumpVibrantLifePage(List<HiHealthClient> list) {
        if (njy.e(list)) {
            LogUtil.a(TAG, "isJumpVibrantLifePage clientList is empty");
            return true;
        }
        LogUtil.a(TAG, "isJumpVibrantLifePage clientList size", Integer.valueOf(list.size()));
        Iterator<HiHealthClient> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getHiDeviceInfo() != null) {
                LogUtil.a(TAG, "isJumpVibrantLifePage hiHealthClient.getHiDeviceInfo() != null");
                return false;
            }
        }
        return true;
    }

    private boolean needUpdateAppVersion() {
        String strName = this.mProductInfo.m().name();
        LogUtil.a(TAG, "mProductInfo.getKind() = ", strName);
        return pip.f45449c.containsKey(strName) && !dzu.e(this.mProductId, strName);
    }

    private void bindDeviceByUdsProcess(String str) {
        ReleaseLogUtil.d(RELEASE_TAG, "enter bindDeviceByUdsProcess");
        ept eptVar = this.mThirdPartyUniteDevice;
        if (eptVar == null) {
            LogUtil.a(TAG, "mThirdPartyUniteDevice == null ");
            return;
        }
        if (eptVar.b() != null) {
            ept eptVar2 = this.mThirdPartyUniteDevice;
            eptVar2.b(eptVar2.b().getDeviceMac());
        }
        if (PAIR_YES.equals(str)) {
            if (enq.d().c()) {
                drw.e().a(this.mProductId, this.mProductInfo.q(), this.mThirdPartyUniteDevice, this.mBindingStatusCallback);
                return;
            }
            if (BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.mThirdPartyUniteDevice.getAddress()).getBondState() != 12) {
                ReleaseLogUtil.d(RELEASE_TAG, "create system bond");
                this.mDeviceStateListenId = UUID.randomUUID().toString();
                emk.c().d(this.mDeviceStateListenId, this.mDeviceStatusChangeCallback);
                emk.c().b(this.mThirdPartyUniteDevice);
                return;
            }
            drw.e().a(this.mProductId, this.mProductInfo.q(), this.mThirdPartyUniteDevice, this.mBindingStatusCallback);
            return;
        }
        drw.e().a(this.mProductId, this.mProductInfo.q(), this.mThirdPartyUniteDevice, this.mBindingStatusCallback);
    }

    private void bindDeviceByOldProcess(String str) {
        ReleaseLogUtil.d(RELEASE_TAG, "enter bindDeviceByOldProcess");
        if (PAIR_YES.equals(str)) {
            if (enq.d().c()) {
                drw.e().a(this.mProductId, this.mProductInfo.q(), this.mHealthDevice, this.mBindingStatusCallback);
                return;
            }
            if (this.mHealthDevice == null) {
                LogUtil.a(TAG, "bindDeviceByOldProcess HealthDevice is null");
                return;
            }
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.mHealthDevice.getAddress());
            try {
                if (remoteDevice.getBondState() != 12) {
                    LogUtil.a(TAG, "bindDeviceByOldProcess not BOND_BONDED");
                    createBond(remoteDevice.getClass(), remoteDevice);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
                    BleDeviceHelper bleDeviceHelper = new BleDeviceHelper(remoteDevice);
                    this.mBleDeviceHelper = bleDeviceHelper;
                    bleDeviceHelper.c(this.mBindingStatusCallback);
                    dxw.d().registerReceiver(bleDeviceHelper, intentFilter);
                } else {
                    drw.e().a(this.mProductId, this.mProductInfo.q(), this.mHealthDevice, this.mBindingStatusCallback);
                }
                return;
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                LogUtil.e(TAG, "bindDeviceByOldProcess Exception:", ExceptionUtils.c(e));
                return;
            }
        }
        drw.e().a(this.mProductId, this.mProductInfo.q(), this.mHealthDevice, this.mBindingStatusCallback);
    }

    private void bindWeightDevice() {
        HealthDevice healthDevice = this.mHealthDevice;
        if (healthDevice instanceof MeasurableDevice) {
            MeasurableDevice measurableDevice = (MeasurableDevice) healthDevice;
            this.mMeasurableDevice = measurableDevice;
            measurableDevice.setMeasureKitUuid(this.mProductInfo.q());
            Bundle bundle = new Bundle();
            bundle.putInt("type", -2);
            bundle.putString("productId", this.mProductId);
            if (dxm.ag(this.mProductId)) {
                drw.e().e(this.mProductId, this.mUniqueId, this.mBindCallback, bundle, this.mMeasurableDevice);
            } else {
                drw.e().e(this.mProductId, this.mUniqueId, this.iHealthDeviceCallback, bundle, this.mMeasurableDevice);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jumpToCompUserInfo(boolean z) {
        if (this.mIsJump) {
            return;
        }
        etn.c();
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.mProductId);
        bundle.putString("goto", "devicebind");
        bundle.putString("title", this.mTitle);
        bundle.putBoolean("isBleScale", true);
        bundle.putBoolean("isHonourDevice", z);
        bundle.putBoolean("isNfcConnect", this.mIsNfcCommect);
        LogUtil.a(TAG, "jumpToCompUserInfo put isNfcConnect is true");
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", this.mUniqueId);
        contentValues.put("productId", this.mProductId);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        Fragment wiFiDeviceBindResultFragment = new WiFiDeviceBindResultFragment();
        wiFiDeviceBindResultFragment.setArguments(bundle);
        switchFragment(wiFiDeviceBindResultFragment);
        WeightDataManager.INSTANCE.setInitFlag(true);
        this.mIsJump = true;
    }

    public boolean createBond(Class cls, BluetoothDevice bluetoothDevice) throws IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        if (cls == null || bluetoothDevice == null) {
            LogUtil.a(TAG, "DeviceBindWaitingFragment createBond param is null");
            return false;
        }
        Boolean bool = (Boolean) cls.getMethod("createBond", new Class[0]).invoke(bluetoothDevice, new Object[0]);
        if (bool == null) {
            LogUtil.a(TAG, "DeviceBindWaitingFragment createBond returnValue is null");
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Throwable {
        if (layoutInflater == null) {
            LogUtil.a(TAG, "DeviceBindWaitingFragment onCreateView inflater is null");
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            return null;
        }
        ReleaseLogUtil.d(RELEASE_TAG, "DeviceBindWaitingFragment onCreateView");
        ViewGroup viewGroup2 = (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle);
        this.child = layoutInflater.inflate(isSwitchPage() ? R.layout.device_measure_bind_device_layout : R.layout.device_measure_bind_device, viewGroup, false);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
        }
        RopeCloudAuthManager.e(this.mProductId);
        if (isSwitchPage()) {
            initView();
            startBindingDevice();
            super.setTitle(getActivity().getString(R.string.IDS_device_bind_connect));
            return viewGroup2;
        }
        HealthTextView healthTextView = (HealthTextView) this.child.findViewById(R.id.device_measure_search_prompt);
        ((HealthProgressBar) this.child.findViewById(R.id.hw_device_bind_pb)).setLayerType(1, null);
        if (dxm.ab(this.mProductId)) {
            healthTextView.setText(BaseApplication.getContext().getString(R.string.IDS_plugin_device_weight_device_pair_new_tip, 3));
            startTimer();
        } else {
            healthTextView.setText(R.string.IDS_device_selection_waiting_for_binding);
            if (etn.g(this.mProductId) || etn.n(this.mProductId)) {
                startTimer();
            }
        }
        healthTextView.setVisibility(0);
        super.setTitle(this.mTitle);
        return viewGroup2;
    }

    private boolean isSwitchPage() {
        return etn.a(getContext()) && !this.isFromScanFragment;
    }

    private void showBindingAnimation() {
        AnimationDrawable animationDrawable = this.mAnimationDrawable;
        if (animationDrawable == null || animationDrawable.isRunning()) {
            return;
        }
        this.mAnimationDrawable.start();
        this.mPairGuideProgressAnim.setBackground(null);
    }

    private void stopBindingAnimation() {
        AnimationDrawable animationDrawable = this.mAnimationDrawable;
        if (animationDrawable == null || !animationDrawable.isRunning()) {
            return;
        }
        this.mAnimationDrawable.stop();
        Drawable frame = this.mAnimationDrawable.getFrame(3);
        if (frame != null) {
            this.mPairGuideProgressAnim.setBackground(frame);
        }
    }

    private void initView() throws Throwable {
        ImageView imageView = (ImageView) this.child.findViewById(R.id.device_pair_guide_progress_anim);
        this.mPairGuideProgressAnim = imageView;
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            this.mAnimationDrawable = (AnimationDrawable) this.mPairGuideProgressAnim.getDrawable();
        }
        this.mDeviceImageView = (ImageView) this.child.findViewById(R.id.device_show_image);
        this.mDeviceBindingTextView = (HealthTextView) this.child.findViewById(R.id.device_binding_text);
        this.mDeviceBindingUnderTextView = (HealthTextView) this.child.findViewById(R.id.device_binding_under_text);
        this.mNetWorkErrorLayout = (LinearLayout) this.child.findViewById(R.id.device_error_bad_layout);
        this.mResourceErrorLayout = (LinearLayout) this.child.findViewById(R.id.device_download_bad_layout);
        this.mProgressBar = (HealthProgressBar) this.child.findViewById(R.id.download_progress);
        LinearLayout linearLayout = (LinearLayout) this.child.findViewById(R.id.device_image_layout);
        if (qrs.ah(this.mainActivity)) {
            LogUtil.a(TAG, "isPad enter");
            dyn.a().a(this.mainActivity, linearLayout, 0.8d, false);
        }
        refreshDeviceImage();
        showBindingAnimation();
    }

    private void refreshDeviceImage() throws Throwable {
        if (dxm.ad(this.mProductId)) {
            getProductId();
            elh elhVarD = ResourceManager.c().d(this.mProductId);
            this.mProductInfo = elhVarD;
            if (elhVarD != null) {
                this.mDeviceIconPath = elg.e().d(this.mProductInfo.t(), this.mProductInfo.l().b());
            } else {
                this.mDeviceImageView.setImageResource(R.drawable.icon_fat_scales_pair);
                return;
            }
        }
        if (TextUtils.isEmpty(this.mDeviceIconPath)) {
            LogUtil.j(TAG, "refreshDeviceImage mDeviceIconPath is null");
            return;
        }
        Bitmap bitmapH = EzPluginManager.b().h(this.mDeviceIconPath);
        if (bitmapH != null) {
            this.mDeviceImageView.setImageBitmap(bitmapH);
        } else {
            LogUtil.j(TAG, "refreshDeviceImage error");
        }
    }

    private void setBindingText() {
        int i;
        this.mDeviceBindingTextView.setText(R.string.IDS_blite_guide_paire_opt_title);
        boolean zAh = qrs.ah(BaseApplication.getContext());
        if ("9bf158ba-49b0-46aa-9fdf-ed75da1569cf".equals(this.mProductId)) {
            i = zAh ? R.string.IDS_device_bind_audio_hint_pad : R.string.IDS_device_bind_audio_hint;
        } else if ("HDK_WEIGHT".equals(this.mDeviceType)) {
            i = R.string.IDS_device_paring_tips;
        } else {
            i = zAh ? R.string.IDS_device_binding_hint_pad : R.string.IDS_device_binding_tips;
        }
        this.mDeviceBindingUnderTextView.setText(BaseApplication.getContext().getString(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloadSuccess() throws Throwable {
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        this.mProductInfo = elhVarD;
        if (elhVarD == null) {
            LogUtil.e(TAG, "setDownloadSuccess mProductInfo is null");
            pairDeviceFailed();
            return;
        }
        this.mDeviceBluetoothType = elhVarD.v().c();
        this.mProgressBar.setVisibility(8);
        this.mResourceErrorLayout.setVisibility(8);
        this.mNetWorkErrorLayout.setVisibility(8);
        setBindingText();
        showBindingAnimation();
        refreshDeviceImage();
        if (Build.VERSION.SDK_INT > 30) {
            checkScanPermission();
        } else {
            checkGpsEnabledAndOpen();
            checkBluetoothEnabled();
        }
    }

    private void checkGpsEnabledAndOpen() {
        LogUtil.a(TAG, "checkGpsEnabledAndOpen comming");
        if (this.gpslUtil == null) {
            this.gpslUtil = new dxe();
        }
        if (!this.gpslUtil.c(getActivity())) {
            LogUtil.a(TAG, "location permission not granted");
            this.gpslUtil.e(getActivity());
        } else {
            LogUtil.j(TAG, "location permission granted");
        }
        if (!this.gpslUtil.b(getActivity())) {
            LogUtil.a(TAG, "GPS service not enable");
            checkPermission(getActivity());
            dys.a().b((Activity) getActivity());
            return;
        }
        LogUtil.j(TAG, "GPS service enable");
    }

    public void checkScanPermission() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            LogUtil.e(TAG, "checkScanPermission context is null");
        } else {
            LogUtil.a(TAG, "checkScanPermission comming");
            PermissionUtil.d(activity, PermissionUtil.PermissionType.SCAN, new AnonymousClass6(activity));
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment$6, reason: invalid class name */
    class AnonymousClass6 extends CustomPermissionAction {
        AnonymousClass6(Context context) {
            super(context);
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            LogUtil.a(DeviceBindWaitingFragment.TAG, "Scan Permission onGranted");
            DeviceBindWaitingFragment.this.checkBluetoothEnabled();
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            super.onDenied(str);
            LogUtil.a(DeviceBindWaitingFragment.TAG, "Scan Permission onDenied");
            DeviceBindWaitingFragment.this.enterToMainActivity();
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            DeviceBindWaitingFragment.this.mIsJumpToSetting = true;
            LogUtil.a(DeviceBindWaitingFragment.TAG, "Scan Permission onForeverDenied mIsJumpToSetting", Boolean.valueOf(DeviceBindWaitingFragment.this.mIsJumpToSetting));
            onForeverDenied(permissionType, null, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment$6$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m966xe4f563c8(view);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onForeverDenied$0$com-huawei-health-device-ui-measure-fragment-device-DeviceBindWaitingFragment$6, reason: not valid java name */
        /* synthetic */ void m966xe4f563c8(View view) {
            DeviceBindWaitingFragment.this.enterToMainActivity();
        }
    }

    public void checkPermission(Context context) {
        if (context == null) {
            LogUtil.j(TAG, "checkPermission, error ");
            return;
        }
        if (this.gpslUtil == null) {
            this.gpslUtil = new dxe();
        }
        boolean zC = this.gpslUtil.c(context);
        LogUtil.a(TAG, "checkPermission, isCheckPermission: ", Boolean.valueOf(zC));
        if (zC) {
            return;
        }
        this.gpslUtil.e(getActivity());
    }

    private void startPairingDevice() {
        ReleaseLogUtil.d(RELEASE_TAG, "startPairingDevice");
        if (isEcologyHeadphones(this.mProductId)) {
            if (needUpdateAppVersion()) {
                LogUtil.a(TAG, "current device needs to update the app version, mProductId = ", this.mProductId);
                dzu.c(getContext(), getActivity(), new VersionNoSupportCallback() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment$$ExternalSyntheticLambda0
                    @Override // com.huawei.health.device.callback.VersionNoSupportCallback
                    public final void onDialogClose() {
                        this.f$0.m965xda83a04d();
                    }
                });
                return;
            } else {
                new elc().b(this.mUniqueId, new NemoDeviceCallback() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment.7
                    @Override // com.huawei.health.ecologydevice.callback.NemoDeviceCallback
                    public void bondSuccess(BluetoothDevice bluetoothDevice) {
                        LogUtil.a(DeviceBindWaitingFragment.TAG, "startPairingDevice--bondSuccess");
                        new elc().a(DeviceBindWaitingFragment.this.getActivity(), DeviceBindWaitingFragment.this.mUniqueId);
                        etn.c();
                        FragmentActivity activity = DeviceBindWaitingFragment.this.getActivity();
                        if (activity != null) {
                            activity.finish();
                        }
                    }

                    @Override // com.huawei.health.ecologydevice.callback.NemoDeviceCallback
                    public void bondError(int i) {
                        LogUtil.j(DeviceBindWaitingFragment.TAG, "startPairingDevice,bindState:", Integer.valueOf(i));
                        DeviceBindWaitingFragment.this.pairDeviceFailed();
                    }
                });
                return;
            }
        }
        if (initDeviceData()) {
            if (dxm.ab(this.mProductId) || etn.g(this.mProductId) || etn.n(this.mProductId)) {
                startTimer();
            }
            insertDeviceData();
            return;
        }
        LogUtil.e(TAG, "setDownloadSuccess initDeviceData failed");
        pairDeviceFailed();
    }

    /* JADX INFO: renamed from: lambda$startPairingDevice$4$com-huawei-health-device-ui-measure-fragment-device-DeviceBindWaitingFragment, reason: not valid java name */
    /* synthetic */ void m965xda83a04d() {
        popupFragment(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedLayout() {
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            setNetWorkErrorLayout();
            return;
        }
        stopBindingAnimation();
        this.mDeviceBindingTextView.setText(R.string.IDS_downlod_device_error);
        this.mDeviceBindingUnderTextView.setText(R.string.IDS_network_check);
        this.mProgressBar.setVisibility(8);
        this.mNetWorkErrorLayout.setVisibility(8);
        this.mResourceErrorLayout.setVisibility(0);
        this.mResourceErrorLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m961xdef53701(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setFailedLayout$5$com-huawei-health-device-ui-measure-fragment-device-DeviceBindWaitingFragment, reason: not valid java name */
    /* synthetic */ void m961xdef53701(View view) {
        startDownloadThirdPartyDevicePlugin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProgressBarLayout(int i) {
        if (i > 0) {
            this.mProgressBar.setProgress(i);
        }
    }

    private void setNetWorkErrorLayout() {
        BroadcastReceiver broadcastReceiver;
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            if (getActivity() != null && (broadcastReceiver = this.mNetBroadcastReceiver) != null) {
                getActivity().registerReceiver(broadcastReceiver, intentFilter);
            }
        } catch (IllegalArgumentException unused) {
            LogUtil.e(TAG, "handleDownloadNetError register receiver is error");
        }
        stopBindingAnimation();
        this.mDeviceBindingTextView.setText(R.string.IDS_downlod_device_error);
        this.mDeviceBindingUnderTextView.setText(R.string.IDS_network_check);
        this.mProgressBar.setVisibility(8);
        this.mNetWorkErrorLayout.setVisibility(0);
        this.mResourceErrorLayout.setVisibility(8);
        this.mNetWorkErrorLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m962x94437ddf(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setNetWorkErrorLayout$6$com-huawei-health-device-ui-measure-fragment-device-DeviceBindWaitingFragment, reason: not valid java name */
    /* synthetic */ void m962x94437ddf(View view) {
        startActivity(new Intent("android.settings.SETTINGS"));
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(BUNDLE_KEY_BIND_START, this.mIsBindStarted);
    }

    private void startBindingDevice() throws Throwable {
        if (this.mIsBindStarted) {
            LogUtil.j(TAG, "startBindingDevice failed: DeviceBindWaitingFragment is not visible");
            return;
        }
        if (getActivity() == null) {
            LogUtil.j(TAG, "startDownloadThirdPartyDevicePlugin activity is null");
            pairDeviceFailed();
            return;
        }
        ReleaseLogUtil.d(RELEASE_TAG, "startBindingDevice productId: ", dyg.b(this.mProductId), ", code: ", dyg.b(this.mUniqueId));
        if (etn.j(this.mProductId)) {
            if (etn.b(emh.b().d(), this.mUniqueId)) {
                pairDeviceFailed();
                return;
            }
        } else if (etn.d(this.mProductId, this.mUniqueId)) {
            if (isEcologyHeadphones(this.mProductId)) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    new elc().a(activity, this.mUniqueId);
                    activity.finish();
                }
                LogUtil.j(TAG, "activity is null");
                return;
            }
            LogUtil.e(TAG, "startDownloadThirdPartyDevicePlugin device is bond");
            if (this.mIsInvalidation && (dxm.ac(this.mProductId) || dxm.ag(this.mProductId))) {
                LogUtil.j(TAG, "is own scale device");
            } else {
                pairDeviceFailed();
                return;
            }
        }
        ReleaseLogUtil.d(RELEASE_TAG, "isPluginAvaiable:", Boolean.valueOf(EzPluginManager.b().j(this.mProductId)));
        if (!CommonUtil.ab(getContext())) {
            if (EzPluginManager.b().j(this.mProductId)) {
                setDownloadSuccess();
                return;
            } else {
                setNetWorkErrorLayout();
                return;
            }
        }
        if (TextUtils.isEmpty(this.mDeviceType)) {
            LogUtil.e(TAG, "startDownloadThirdPartyDevicePlugin mDeviceType is null");
            pairDeviceFailed();
        } else {
            startDownloadThirdPartyDevicePlugin();
            this.mIsBindStarted = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startDownloadThirdPartyDevicePlugin() {
        List listSingletonList;
        LogUtil.a(TAG, "startDownloadThirdPartyDevicePlugin");
        this.mProgressBar.setVisibility(0);
        this.mNetWorkErrorLayout.setVisibility(8);
        this.mResourceErrorLayout.setVisibility(8);
        setBindingText();
        showBindingAnimation();
        esw eswVar = this.mDeviceResourceTool;
        if (eswVar != null) {
            eswVar.a();
        }
        if (njy.b(this.mUuidList)) {
            listSingletonList = this.mUuidList;
        } else {
            listSingletonList = Collections.singletonList(this.mProductId);
        }
        esw eswVar2 = new esw(getActivity(), this.mDeviceType, 1, listSingletonList, new est() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment.8
            @Override // defpackage.ess
            public void onSuccess() throws Throwable {
                LogUtil.a(DeviceBindWaitingFragment.TAG, "startDownloadThirdPartyDevicePlugin onSuccess");
                DeviceBindWaitingFragment.this.mIsDownloadResourceFailed = false;
                DeviceBindWaitingFragment.this.getProductId();
                DeviceBindWaitingFragment.this.setDownloadSuccess();
            }

            @Override // defpackage.ess
            public void onDownload(int i) {
                super.onDownload(i);
                DeviceBindWaitingFragment.this.setProgressBarLayout(i);
            }

            @Override // defpackage.ess
            public void onFailure(int i) {
                DeviceBindWaitingFragment.this.mIsDownloadResourceFailed = true;
                DeviceBindWaitingFragment.this.setFailedLayout();
                ReleaseLogUtil.e(DeviceBindWaitingFragment.TAG, DeviceBindWaitingFragment.this.mDeviceType, " download failure, errorCode is ", Integer.valueOf(i));
            }
        });
        this.mDeviceResourceTool = eswVar2;
        eswVar2.e(this.mDownloadSource);
        this.mDeviceResourceTool.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterNetworkBroadcastReceiver() {
        try {
            if (this.mNetBroadcastReceiver == null || getActivity() == null) {
                return;
            }
            LogUtil.a(TAG, "unregister mNetBroadcastReceiver");
            getActivity().unregisterReceiver(this.mNetBroadcastReceiver);
            this.mNetBroadcastReceiver = null;
        } catch (IllegalArgumentException unused) {
            LogUtil.e(TAG, "unregisterBroadcastReceiver is error");
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        LogUtil.a(TAG, "onDestroy");
        elh elhVar = this.mProductInfo;
        if (elhVar != null && elhVar.v().c() == 2) {
            drw.e().b();
        }
        if (this.mBleDeviceHelper != null) {
            dxw.d().unregisterReceiver(this.mBleDeviceHelper);
            this.mBleDeviceHelper = null;
        }
        esw eswVar = this.mDeviceResourceTool;
        if (eswVar != null) {
            eswVar.a();
            this.mDeviceResourceTool = null;
        }
        stopBindingAnimation();
        unregisterNetworkBroadcastReceiver();
        doq.e().c(this.mBindCallback);
        super.onDestroy();
    }

    private void saveDeviceKind(HealthDevice.HealthDeviceKind healthDeviceKind) {
        LogUtil.a(TAG, "saveDeviceKind");
        StorageParams storageParams = new StorageParams();
        if (HealthDevice.HealthDeviceKind.HDK_WEIGHT.equals(healthDeviceKind)) {
            setSharedPreference("BIND_WEIGHT", storageParams);
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_BLOOD_PRESSURE.equals(healthDeviceKind)) {
            setSharedPreference("BIND_BLOOD_PRESSURE", storageParams);
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR.equals(healthDeviceKind)) {
            setSharedPreference("BIND_BLOOD_SUGAR", storageParams);
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_HEART_RATE.equals(healthDeviceKind)) {
            setSharedPreference("BIND_HEART_RATE", storageParams);
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_BODY_TEMPERATURE.equals(healthDeviceKind)) {
            setSharedPreference("BIND_BODY_TEMPERATURE", storageParams);
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_BLOOD_OXYGEN.equals(healthDeviceKind)) {
            setSharedPreference("BIND_BLOOD_OXYGEN", storageParams);
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_ROPE_SKIPPING.equals(healthDeviceKind)) {
            setSharedPreference("BIND_ROPE_SKIPPING", storageParams);
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_TREADMILL.equals(healthDeviceKind)) {
            setSharedPreference("BIND_TREADMILL", storageParams);
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_EXERCISE_BIKE.equals(healthDeviceKind)) {
            setSharedPreference("BIND_EXERCISE_BIKE", storageParams);
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_ROWING_MACHINE.equals(healthDeviceKind)) {
            setSharedPreference("BIND_ROWING_MACHINE", storageParams);
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_ELLIPTICAL_MACHINE.equals(healthDeviceKind)) {
            setSharedPreference("BIND_ELLIPTICAL_MACHINE", storageParams);
        } else if (HealthDevice.HealthDeviceKind.HDK_WALKING_MACHINE.equals(healthDeviceKind)) {
            setSharedPreference("BIND_WALKING_MACHINE", storageParams);
        } else {
            LogUtil.d(TAG, "in else branch");
        }
    }

    private void setSharedPreference(String str, StorageParams storageParams) {
        SharedPreferenceManager.e(dxw.d(), String.valueOf(10000), str, "1", storageParams);
    }

    private boolean getDataStatus() {
        if ("true".equals(this.mInteractor.c(7))) {
            this.mIsHealthDataStatus = true;
        } else {
            this.mIsHealthDataStatus = false;
        }
        return !this.mIsHealthDataStatus;
    }

    private void jumpToActivity() {
        saveDeviceKind(this.mProductInfo.m());
        drw.e().b();
        boolean z = false;
        MeasurableDevice measurableDeviceB = dmp.d().b(this.mUniqueId, false);
        setHourDeviceBind();
        ReleaseLogUtil.d(RELEASE_TAG, "sSportType is " + sSportType);
        if (hcd.f36391c.containsKey(Integer.valueOf(sSportType))) {
            if (!((HealthDevice.HealthDeviceKind) hcd.f36391c.get(Integer.valueOf(sSportType))).equals(this.mProductInfo.m())) {
                LogUtil.a(TAG, "wrong device");
                ObserverManagerUtil.e("DEVICE_ASSOCIATION", new Object[0]);
            } else {
                LogUtil.a(TAG, "already binded, return to cp page");
                ObserverManagerUtil.e("DEVICE_ASSOCIATION", this.mUniqueId, hcd.e.get(Integer.valueOf(sSportType)));
            }
            sSportType = 0;
            popupFragment(null);
            return;
        }
        boolean zEquals = HiAnalyticsConstant.KeyAndValue.NUMBER_01.equals(this.mProductInfo.r());
        if (measurableDeviceB != null && measurableDeviceB.isAutoDevice()) {
            z = true;
        }
        if ("1".equals(this.mProductInfo.g())) {
            if (etn.j(this.mProductId)) {
                etn.b(getContext(), this.mProductInfo, this.mProductId, this.mUniqueId, getArguments() == null ? "" : getArguments().getString("fittings_host_sn"));
                ((DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class)).onBackPressed(this.mainActivity);
                return;
            } else {
                popupFragment(null);
                etn.c(getContext(), this.mProductInfo, this.mProductId, this.mUniqueId);
                return;
            }
        }
        if (CommonUtil.cj() && BleConstants.BLE_THIRD_DEVICE_H5.equals(this.mProductInfo.n().b())) {
            switchToSuccessOrH5Intro();
            return;
        }
        if (z && zEquals) {
            switchToSuccessOrSilent(new Bundle());
            return;
        }
        if (measurableDeviceB != null && this.mProductInfo.m().equals(HealthDevice.HealthDeviceKind.HDK_HEART_RATE)) {
            switchToSuccessOrHeartRate(new Bundle());
        } else if (measurableDeviceB != null && (this.mProductInfo.m().equals(HealthDevice.HealthDeviceKind.HDK_ROPE_SKIPPING) || etn.n(this.mProductId))) {
            enterRopeSkippingOrSport();
        } else {
            defaultJump();
        }
    }

    private void defaultJump() {
        ReleaseLogUtil.d(RELEASE_TAG, "------------ is honour new device> " + dxm.ac(this.mProductId));
        if (dxm.ac(this.mProductId) || dxm.ag(this.mProductId)) {
            bindWeightDevice();
        } else if (dxm.z(this.mProductId)) {
            jumpToCompUserInfo(true);
        } else {
            this.mHandler.postDelayed(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m956x6ad97c9();
                }
            }, 1000L);
        }
    }

    /* JADX INFO: renamed from: lambda$defaultJump$7$com-huawei-health-device-ui-measure-fragment-device-DeviceBindWaitingFragment, reason: not valid java name */
    /* synthetic */ void m956x6ad97c9() {
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.mProductId);
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", this.mUniqueId);
        contentValues.put("productId", this.mProductId);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        bundle.putBoolean(BUNDLE_KEY_IS_BIND_SUCCESS, true);
        bundle.putBoolean(IS_GO_ROPE_JUMP, this.mIsGoRopeJump);
        bundle.putBoolean("isNfcConnect", this.mIsNfcCommect);
        LogUtil.a(TAG, "jumpToActivity putBoolean mIsNfcCommect = ", Boolean.valueOf(this.mIsNfcCommect));
        setCourseEquipmentParameters(bundle);
        switchToSuccessOrIntroduction(bundle);
    }

    private void setCourseEquipmentParameters(Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            LogUtil.a(TAG, "argumentsBundle is null");
            return;
        }
        int i = arguments.getInt("KEY_INTENT_COURSE_ENTRANCE", 0);
        String string = arguments.getString("KEY_INTENT_EQUIPMENT_TYPE");
        bundle.putInt("KEY_INTENT_COURSE_ENTRANCE", i);
        bundle.putString("KEY_INTENT_EQUIPMENT_TYPE", string);
        LogUtil.a(TAG, "setCourseEquipmentParameters courseEntryType = " + i + ", courseEquipmentType = " + string);
    }

    private void switchToSuccessOrH5Intro() {
        Bundle bundle = new Bundle();
        putData(bundle);
        if (isSwitchPage()) {
            DeviceBindSuccessFragment deviceBindSuccessFragment = new DeviceBindSuccessFragment();
            deviceBindSuccessFragment.setArguments(bundle);
            switchFragment(deviceBindSuccessFragment);
        } else {
            Intent intentB = etn.b(this.mProductInfo, this.mProductId, this.mUniqueId);
            if (intentB != null) {
                startActivity(intentB);
                popupFragment(null);
            }
        }
    }

    private void switchToSuccessOrIntroduction(Bundle bundle) {
        if (isSwitchPage()) {
            DeviceBindSuccessFragment deviceBindSuccessFragment = new DeviceBindSuccessFragment();
            deviceBindSuccessFragment.setArguments(bundle);
            switchFragment(deviceBindSuccessFragment);
        } else {
            ProductIntroductionFragment productIntroductionFragment = new ProductIntroductionFragment();
            productIntroductionFragment.setArguments(bundle);
            switchFragment(productIntroductionFragment);
        }
    }

    private void switchToSuccessOrHeartRate(Bundle bundle) {
        Fragment heartRateDeviceRunGuide;
        putData(bundle);
        if (isSwitchPage()) {
            heartRateDeviceRunGuide = new DeviceBindSuccessFragment();
        } else {
            heartRateDeviceRunGuide = new HeartRateDeviceRunGuide();
        }
        heartRateDeviceRunGuide.setArguments(bundle);
        switchFragment(heartRateDeviceRunGuide);
    }

    private void switchToSuccessOrSilent(Bundle bundle) {
        Fragment deviceSilentGuideFragment;
        bundle.putString(BUNDLE_KEY_VIEW, "bond");
        putData(bundle);
        if (isSwitchPage()) {
            deviceSilentGuideFragment = new DeviceBindSuccessFragment();
        } else {
            deviceSilentGuideFragment = new DeviceSilentGuideFragment();
        }
        deviceSilentGuideFragment.setArguments(bundle);
        switchFragment(deviceSilentGuideFragment);
    }

    private void putData(Bundle bundle) {
        bundle.putString("productId", this.mProductId);
        bundle.putString("title", this.mTitle);
        bundle.putBoolean(BUNDLE_KEY_IS_BIND_SUCCESS, true);
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", this.mUniqueId);
        contentValues.put("productId", this.mProductId);
        bundle.putParcelable("commonDeviceInfo", contentValues);
    }

    private void enterRopeSkippingOrSport() {
        Fragment fragmentCreateProductFragment;
        LogUtil.a(TAG, "enterRopeSkippingOrSport");
        cancelTimer();
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.mProductId);
        bundle.putString("title", this.mTitle);
        bundle.putBoolean(BUNDLE_KEY_IS_BIND_SUCCESS, true);
        bundle.putBoolean(IS_GO_ROPE_JUMP, this.mIsGoRopeJump);
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", this.mUniqueId);
        contentValues.put("productId", this.mProductId);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        setCourseEquipmentParameters(bundle);
        if (isSwitchPage()) {
            fragmentCreateProductFragment = new DeviceBindSuccessFragment();
        } else if (this.mProductInfo.m().equals(HealthDevice.HealthDeviceKind.HDK_ROPE_SKIPPING)) {
            fragmentCreateProductFragment = new RopeSkippingGuideFragment();
        } else if (etn.n(this.mProductId)) {
            fragmentCreateProductFragment = new SportDeviceIntroductionFragment();
        } else {
            fragmentCreateProductFragment = ProductCreateFactory.createProductFragment(this.mProductId);
        }
        fragmentCreateProductFragment.setArguments(bundle);
        switchFragment(fragmentCreateProductFragment);
    }

    private void setHourDeviceBind() {
        if ("7a1063dd-0e0f-4a72-9939-461476ff0259".equalsIgnoreCase(this.mProductId) && dxm.d()) {
            dxm.n();
            Bundle bundle = new Bundle();
            bundle.putInt("type", -2);
            drw.e().b(this.mProductId, this.mUniqueId, new IHealthDeviceCallback() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment.9
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
                }
            }, bundle);
        }
    }

    private boolean isShowAuthorizeDialog() {
        return "true".equals(SharedPreferenceManager.e(getActivity(), Integer.toString(10025), "health_manual_record_sync_agree"));
    }

    private void showAuthorizeAlertDialog() {
        CustomAlertDialog customAlertDialog = this.mCustomAlertDialog;
        if (customAlertDialog != null && customAlertDialog.isShowing()) {
            LogUtil.a(TAG, "CustomAlertDialog, is showing.");
            return;
        }
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        iog popOutWindowInfo = userProfileMgrApi.getPopOutWindowInfo(getActivity(), "privacy_health_data_");
        int iE = popOutWindowInfo.e();
        long jA = popOutWindowInfo.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (iE >= 3 || jCurrentTimeMillis - jA <= 86400000) {
            jumpToActivity();
            return;
        }
        userProfileMgrApi.setPopOutWindowInfo(getActivity(), "privacy_health_data_");
        View viewInflate = getActivity().getLayoutInflater().inflate(R.layout.commonui_dialog_health_tip, (ViewGroup) null);
        ((LinearLayout) viewInflate.findViewById(R.id.remind_layout)).setVisibility(8);
        ((HealthTextView) viewInflate.findViewById(R.id.hw_health_service_item_one)).setText(R.string.IDS_hwh_privacy_dialog_common_text_one);
        judgeHealthLayout(viewInflate);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(getActivity());
        builder.a(viewInflate);
        builder.d(R.string.IDS_service_area_notice_title);
        builder.d(R.string.IDS_user_permission_ok, new DialogInterface.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment$$ExternalSyntheticLambda12
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.m963x3a58924d(dialogInterface, i);
            }
        });
        builder.a(R.string.IDS_common_disagree, new DialogInterface.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.m964x4181748e(dialogInterface, i);
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        this.mCustomAlertDialog = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        this.mCustomAlertDialog.show();
    }

    /* JADX INFO: renamed from: lambda$showAuthorizeAlertDialog$8$com-huawei-health-device-ui-measure-fragment-device-DeviceBindWaitingFragment, reason: not valid java name */
    /* synthetic */ void m963x3a58924d(DialogInterface dialogInterface, int i) {
        if (!this.mIsHealthDataStatus) {
            this.mInteractor.e(7, true, "DeviceBindWaitingFragment", null);
        }
        jumpToActivity();
    }

    /* JADX INFO: renamed from: lambda$showAuthorizeAlertDialog$9$com-huawei-health-device-ui-measure-fragment-device-DeviceBindWaitingFragment, reason: not valid java name */
    /* synthetic */ void m964x4181748e(DialogInterface dialogInterface, int i) {
        jumpToActivity();
    }

    private void judgeHealthLayout(View view) {
        if (this.mIsHealthDataStatus) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.health_status_layout);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.health_tip);
        linearLayout.setVisibility(0);
        if (!Utils.o()) {
            healthTextView.setText(R.string.IDS_hwh_user_health_agreement_china);
        } else {
            healthTextView.setText(R.string.IDS_hwh_user_health_agreement_oversea_blood_oxygen);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        if (etn.g(this.mProductId) || etn.n(this.mProductId)) {
            cancelTimer();
        }
        if (this.mIsDownloadResourceFailed) {
            return true;
        }
        return !dxm.aw(this.mProductId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelTimer() {
        synchronized (this) {
            Timer timer = this.mConnectTimer;
            if (timer != null) {
                timer.cancel();
                this.mConnectTimer = null;
                LogUtil.a(TAG, "Cancel the timer connected devices");
            } else {
                LogUtil.a(TAG, "Connection timer has been canceled");
            }
        }
    }

    private void startTimer() {
        synchronized (this) {
            if (this.mConnectTimer == null) {
                this.mConnectTimer = new Timer(TAG);
                LogUtil.a(TAG, "Start the timer connected devices");
                this.mConnectTimer.schedule(new MyTimerTask(this), 30000L);
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        LogUtil.a(TAG, "onResume mIsJumpToSetting ", Boolean.valueOf(this.mIsJumpToSetting));
        if (this.mIsJumpToSetting) {
            this.mIsJumpToSetting = false;
            checkScanPermission();
        }
        if (this.isGotoUserInfoActivity) {
            Bundle bundle = new Bundle();
            bundle.putString("productId", this.mProductId);
            bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
            bundle.putString("goto", "devicebind");
            bundle.putBoolean("isNfcConnect", this.mIsNfcCommect);
            LogUtil.a(TAG, "onResume putBoolean mIsNfcCommect = ", Boolean.valueOf(this.mIsNfcCommect));
            HagridDeviceManagerFragment hagridDeviceManagerFragment = new HagridDeviceManagerFragment();
            hagridDeviceManagerFragment.setArguments(bundle);
            switchFragment(hagridDeviceManagerFragment);
        }
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stop() {
        if (this.mProductId != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("type", -6);
            bundle.putString("productId", this.mProductId);
            HealthDevice healthDeviceA = drw.e().a(this.mUniqueId);
            if (healthDeviceA != null) {
                doq.e().prepare(healthDeviceA, null, bundle);
            } else {
                doq.e().prepare(null, null, bundle);
            }
        }
        drw.e().d(this.mProductId, this.mUniqueId, -6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processCallbackResult(int i, Bundle bundle) {
        if (bundle == null) {
            LogUtil.j(TAG, "processCallbackResult bundle is null");
            return;
        }
        MeasurableDevice measurableDevice = (MeasurableDevice) this.mHealthDevice;
        LogUtil.a(TAG, "processCallbackResult status = ", Integer.valueOf(i), "measurableDevice code:", CommonUtil.n(measurableDevice.getUniqueId()));
        boolean z = false;
        if (i == -7) {
            try {
                byte[] byteArray = bundle.getByteArray("huid");
                this.mMainHuid = byteArray;
                LogUtil.a(TAG, "processCallbackResult mMainHuid = ", byteArray);
            } catch (ArrayIndexOutOfBoundsException unused) {
                LogUtil.e(TAG, "huid getByteArray exception");
            }
            byte[] bArr = this.mMainHuid;
            if (bArr != null && bArr.length != 0) {
                z = true;
            }
            this.mIsHasManaer = z;
            LogUtil.a(TAG, "mIsHasManager = ", Boolean.valueOf(z));
            processBindedSameWiFi(bundle);
            return;
        }
        if (i == -8) {
            this.mIsHasManaer = false;
            if (!this.mIsHasBondedProduct || this.mHandler == null) {
                return;
            }
            LogUtil.a(TAG, "try to bond different scales of same product");
            this.mHandler.sendEmptyMessage(3);
            return;
        }
        if (i == -12) {
            if (bundle.getInt("ret") != 0) {
                LogUtil.j(TAG, " send config info failed");
                return;
            } else {
                LogUtil.a(TAG, " send config info success.");
                return;
            }
        }
        processCallbackResultPro(i, bundle, measurableDevice);
    }

    private void processCallbackResultPro(int i, Bundle bundle, MeasurableDevice measurableDevice) {
        if (i == -13) {
            if (bundle.getInt("ret") != 0) {
                LogUtil.j(TAG, " set manager info failed");
                return;
            } else {
                LogUtil.a(TAG, " set manager info success.");
                return;
            }
        }
        if (i == -16) {
            String string = bundle.getString(HealthEngineRequestManager.PARAMS_DEVICE_SN);
            this.mDeviceSn = string;
            LogUtil.a(TAG, " save device info, deviceSn:", dyg.b(string), "measurableDevice code:", dyg.b(measurableDevice.getUniqueId()));
            measurableDevice.setSerialNumber(this.mDeviceSn);
            checkAndUpdateLocalDevice(measurableDevice, this.mDeviceSn);
            return;
        }
        if (i == -9) {
            this.mSsid = bundle.getString("deviceSsid");
            dxm.d(this.mDeviceSn, measurableDevice.getUniqueId());
            dxm.b(measurableDevice.getUniqueId(), this.mDeviceSn);
            setDeviceInfo(measurableDevice, i);
            gotoBluetoothPairSuccessPage(this.mIsHasManaer);
            cancelTimer();
            return;
        }
        if (i == -2) {
            processBindType(bundle);
            return;
        }
        if (i != -14) {
            LogUtil.j(TAG, " status others");
            return;
        }
        saveDevice(measurableDevice, "");
        setDeviceInfo(measurableDevice, i);
        gotoBluetoothPairSuccessPage(false);
        cancelTimer();
    }

    private void setDeviceInfo(MeasurableDevice measurableDevice, int i) {
        if (this.mDeviceInfo == null) {
            this.mDeviceInfo = new ContentValues();
        }
        if (i == -9) {
            this.mUniqueId = measurableDevice.getUniqueId();
        }
        this.mDeviceInfo.put("uniqueId", measurableDevice.getUniqueId());
        this.mDeviceInfo.put("productId", this.mProductId);
    }

    private void gotoBluetoothPairSuccessPage(boolean z) {
        LogUtil.a(TAG, "gotoBluetoothPairSuccessPage = ", Boolean.valueOf(z));
        etn.c();
        if (this.mIsJump) {
            return;
        }
        dxx.a(this.mUniqueId);
        dyj.e(this.mProductId);
        this.mIsJump = true;
        if (getContext() != null) {
            Bundle bundle = new Bundle();
            if (z) {
                HagridDeviceBindResultFragment.setBindStatus(9);
            } else {
                HagridDeviceBindResultFragment.setBindStatus(10);
            }
            bundle.putString(BUNDLE_KEY_VIEW, BUNDLE_VALUE_BIND_RESULT_CONFIRM);
            bundle.putBoolean(BUNDLE_KEY_IS_BIND_SUCCESS, true);
            bundle.putString("productId", this.mProductId);
            this.isGotoUserInfoActivity = true;
            bundle.putFloat(BUNDLE_KEY_DEVICE_WEIGHT, this.mWeight);
            bundle.putString("productId", this.mProductId);
            bundle.putBoolean(BUNDLE_KEY_HAS_MANAGER, z);
            bundle.putByteArray(BUNDLE_KEY_MAIN_HUID, this.mMainHuid);
            bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
            if (!dxm.ai(this.mProductId) && !dxm.q(this.mProductId)) {
                bundle.putString("deviceSsid", this.mSsid);
                bundle.putString(BUNDLE_KEY_AUTO_DEVICE_SSID, this.mProductId);
                bundle.putString("cloudDeviceId", this.mDeviceIdFromDevice);
            }
            dso dsoVar = this.mWeightAndFatRateData;
            if (dsoVar != null) {
                bundle.putSerializable(BUNDLE_KEY_RESIS_FAT, dsoVar);
            }
            bundle.putBoolean("isNfcConnect", this.mIsNfcCommect);
            LogUtil.a(TAG, "gotoBluetoothPairSuccessPage putBoolean mIsNfcCommect = ", Boolean.valueOf(this.mIsNfcCommect));
            HagridDeviceBindResultFragment hagridDeviceBindResultFragment = new HagridDeviceBindResultFragment();
            hagridDeviceBindResultFragment.setArguments(bundle);
            switchFragment(this, hagridDeviceBindResultFragment);
        }
    }

    private void processBindType(Bundle bundle) {
        if (bundle == null) {
            LogUtil.j(TAG, "processBindType bundle is null");
            return;
        }
        byte b2 = bundle.getByte("ret");
        if (b2 == 2) {
            LogUtil.e(TAG, "binding failed.");
            cancelTimer();
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.sendEmptyMessage(2);
                return;
            }
            return;
        }
        if (b2 != 1) {
            LogUtil.a(TAG, "other ret");
        } else {
            if (dxm.ag(this.mProductId)) {
                EventBus.a(new EventBus.d("reset_wifi"));
            }
            LogUtil.a(TAG, "processBindType ret = 1 set hasManager = true");
            this.mIsHasManaer = true;
        }
        this.mWeight = bundle.getFloat("weight_data", -1.0f);
        if (bundle.getSerializable("resis_data") instanceof dso) {
            this.mWeightAndFatRateData = (dso) bundle.getSerializable("resis_data");
        }
        if (!dyq.d(this.mProductId, this.mWeight)) {
            cancelTimer();
            Handler handler2 = this.mHandler;
            if (handler2 != null) {
                handler2.sendEmptyMessage(2);
                return;
            }
            return;
        }
        cancelTimer();
        startTimer();
        LogUtil.a(TAG, "bind is completed, ret is ", Byte.valueOf(b2));
    }

    private void checkAndUpdateLocalDevice(MeasurableDevice measurableDevice, final String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "serialNumber is empty");
            return;
        }
        boolean z = false;
        MeasurableDevice measurableDeviceA = dmp.d().a(str, false);
        if (measurableDeviceA == null) {
            ReleaseLogUtil.e(RELEASE_TAG, "device is null , save current device as new one");
            saveDevice(measurableDevice, str);
            return;
        }
        if (measurableDeviceA instanceof eby) {
            eby ebyVar = (eby) measurableDeviceA;
            if (!TextUtils.equals(this.mDeviceIdFromDevice, ebyVar.e())) {
                LogUtil.j(TAG, "device rebind, unbind local device");
                new dxi().c(ebyVar.e(), new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment$$ExternalSyntheticLambda3
                    @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                    public final void operationResult(Object obj, String str2, boolean z2) {
                        DeviceBindWaitingFragment.lambda$checkAndUpdateLocalDevice$10(str, (CloudCommonReponse) obj, str2, z2);
                    }
                });
                z = true;
            }
        }
        upDateDeviceUniqueId(measurableDevice, z);
        checkRegisterDeviceInfo(this.mProductId, measurableDevice, str);
    }

    static /* synthetic */ void lambda$checkAndUpdateLocalDevice$10(String str, CloudCommonReponse cloudCommonReponse, String str2, boolean z) {
        LogUtil.a(TAG, "operationResult isSuccess ", Boolean.valueOf(z));
        ecf.c(str);
    }

    private void upDateDeviceUniqueId(MeasurableDevice measurableDevice, boolean z) {
        Handler handler;
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", measurableDevice.getUniqueId());
        if (z) {
            contentValues.put(Wpt.MODE, (Integer) 1);
        }
        int iA = dmp.d().a(contentValues, "sn=?", new String[]{measurableDevice.getSerialNumber()});
        LogUtil.a(TAG, "upDateDeviceUniqueId affected rows:", Integer.valueOf(iA));
        if (iA > 0 || (handler = this.mHandler) == null) {
            return;
        }
        handler.sendEmptyMessage(2);
    }

    private void checkRegisterDeviceInfo(String str, HealthDevice healthDevice, String str2) {
        if (this.mIsOnceRejectDevice) {
            return;
        }
        this.mIsOnceRejectDevice = true;
        dmp.d().a(str, healthDevice, str2);
    }

    private void saveDevice(MeasurableDevice measurableDevice, String str) {
        dmp.d().d(this.mProductId, this.mProductInfo.q(), measurableDevice, new IDeviceEventHandler() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment.10
            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onDeviceFound(HealthDevice healthDevice) {
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onScanFailed(int i) {
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onStateChanged(int i) {
            }
        }, str);
        LogUtil.a(TAG, "band sendWeightDetailSyncSuccessBroadcast");
        dxm.c(getContext(), this.mProductId, this.mUniqueId);
    }

    private void processBindedSameWiFi(Bundle bundle) {
        if (bundle == null) {
            LogUtil.j(TAG, "processBindedSameWiFi bundle is null");
        } else if (bundle.getString("cloudDeviceID") != null) {
            this.mDeviceIdFromDevice = bundle.getString("cloudDeviceID");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getProductId() {
        String strJudgeProductIdByDeviceName = judgeProductIdByDeviceName(this.mTitle);
        if (!TextUtils.isEmpty(strJudgeProductIdByDeviceName)) {
            this.mProductId = strJudgeProductIdByDeviceName;
            return;
        }
        if (njy.b(this.mUuidList)) {
            for (String str : this.mUuidList) {
                elh elhVarD = ResourceManager.c().d(str);
                if (elhVarD == null) {
                    LogUtil.j(TAG, "productInfo is null");
                } else {
                    ScanFilter scanFilterX = elhVarD.x();
                    if (scanFilterX == null) {
                        LogUtil.j(TAG, "scanFilter is null");
                    } else {
                        boolean zB = scanFilterX.b(this.mTitle);
                        LogUtil.j(TAG, "getProductId deviceNameMatched:", Boolean.valueOf(zB));
                        if (zB) {
                            this.mProductId = str;
                            LogUtil.j(TAG, "getProductId productId:", str);
                            stop();
                        }
                    }
                }
            }
        }
    }

    private String judgeProductIdByDeviceName(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = (str.contains(DOBBY_SCALE) || str.contains(HUAWEI_SCALE_3BLE)) ? "c943c933-442e-4c34-bcd0-66597f24aaed" : "";
        if (str.contains(OVERSEA_HAGRID_B29_SCALE)) {
            str2 = "b29df4e3-b1f7-4e40-960d-4cfb63ccca05";
        } else if (str.contains(OVERSEA_HAG_SCALE)) {
            str2 = "8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4";
        } else {
            LogUtil.j(TAG, "other hagr device");
        }
        if (str.contains("CH100")) {
            str2 = "33123f39-7fc1-420b-9882-a4b0d6c61100";
        }
        if (str.contains("CH18")) {
            str2 = "34fa0346-d46c-439d-9cb0-2f696618846b";
        }
        if (str.contains("CH100S")) {
            str2 = "ccd1f0f8-8c57-4bd7-a884-0ef38482f15f";
        }
        return str.contains("AH100") ? "7a1063dd-0e0f-4a72-9939-461476ff0259" : str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkBluetoothEnabled() {
        ReleaseLogUtil.d(RELEASE_TAG, "enter checkBluetoothEnabled");
        if (BluetoothAdapter.getDefaultAdapter() == null || getActivity() == null) {
            LogUtil.e(TAG, "checkBluetoothEnabled BluetoothAdapter or getActivity is null");
            enterToMainActivity();
            return;
        }
        if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            startPairingDevice();
            return;
        }
        String string = getActivity().getResources().getString(R.string.IDS_app_name_health);
        String string2 = getActivity().getResources().getString(R.string.IDS_device_bt_open_request_info);
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(getActivity());
        builder.a(String.format(Locale.ENGLISH, string2, string));
        builder.c(R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m954xc900810a(view);
            }
        });
        builder.a(R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m955xd029634b(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: renamed from: lambda$checkBluetoothEnabled$11$com-huawei-health-device-ui-measure-fragment-device-DeviceBindWaitingFragment, reason: not valid java name */
    /* synthetic */ void m954xc900810a(View view) {
        LogUtil.a(TAG, "checkBluetoothEnabled enable bluetooth");
        startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
    }

    /* JADX INFO: renamed from: lambda$checkBluetoothEnabled$12$com-huawei-health-device-ui-measure-fragment-device-DeviceBindWaitingFragment, reason: not valid java name */
    /* synthetic */ void m955xd029634b(View view) {
        LogUtil.a(TAG, "checkBluetoothEnabled not to enable bluetooth");
        enterToMainActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a(TAG, "onActivityResult");
        if (i != 1 || i2 == 0) {
            return;
        }
        startPairingDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enterToMainActivity() {
        LogUtil.a(TAG, "enterToMainActivity");
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.MainActivity");
        intent.setFlags(67108864);
        intent.putExtra("homeTabName", "HOME");
        startActivity(intent);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            LogUtil.a(TAG, "finish");
            activity.finish();
        }
    }

    static class MyTimerTask extends TimerTask {
        private WeakReference<DeviceBindWaitingFragment> mWeakRef;

        MyTimerTask(DeviceBindWaitingFragment deviceBindWaitingFragment) {
            this.mWeakRef = new WeakReference<>(deviceBindWaitingFragment);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            DeviceBindWaitingFragment deviceBindWaitingFragment = this.mWeakRef.get();
            if (deviceBindWaitingFragment == null) {
                return;
            }
            LogUtil.a(DeviceBindWaitingFragment.TAG, "connect timeout...");
            deviceBindWaitingFragment.mIsBingTimeout = true;
            if (deviceBindWaitingFragment.mProductInfo != null && deviceBindWaitingFragment.mProductInfo.v().c() == 2) {
                drw.e().b();
            }
            if (deviceBindWaitingFragment.mBleDeviceHelper != null) {
                dxw.d().unregisterReceiver(deviceBindWaitingFragment.mBleDeviceHelper);
                deviceBindWaitingFragment.mBleDeviceHelper = null;
            }
            doq.e().c(deviceBindWaitingFragment.mBindCallback);
            deviceBindWaitingFragment.mHandler.sendEmptyMessage(1);
        }
    }

    static class ConnectHandler extends BaseHandler<DeviceBindWaitingFragment> {
        ConnectHandler(DeviceBindWaitingFragment deviceBindWaitingFragment) {
            super(deviceBindWaitingFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        public void handleMessageWhenReferenceNotNull(final DeviceBindWaitingFragment deviceBindWaitingFragment, Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    switchFragment(deviceBindWaitingFragment, 11);
                    return;
                } else {
                    deviceBindWaitingFragment.cancelTimer();
                    LogUtil.d(DeviceBindWaitingFragment.TAG, "DeviceBindWaitingFragment bind fail...");
                    setConnectFail(deviceBindWaitingFragment, message);
                    return;
                }
            }
            deviceBindWaitingFragment.cancelTimer();
            LogUtil.a(DeviceBindWaitingFragment.TAG, "DeviceBindWaitingFragment connect timeout...");
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(deviceBindWaitingFragment.mainActivity);
            if (etn.g(deviceBindWaitingFragment.mProductId) || etn.n(deviceBindWaitingFragment.mProductId)) {
                builder.a(deviceBindWaitingFragment.mainActivity.getApplication().getString(R.string.IDS_device_rope_skipping_pair_timeout));
            } else {
                builder.a(deviceBindWaitingFragment.mainActivity.getApplication().getString(R.string.IDS_device_scale_pair_timeout, new Object[]{String.valueOf(3)}));
            }
            builder.c(R.string.IDS_device_permisson, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingFragment$ConnectHandler$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeviceBindWaitingFragment.ConnectHandler.lambda$handleMessageWhenReferenceNotNull$0(deviceBindWaitingFragment, view);
                }
            });
            deviceBindWaitingFragment.mDialog = builder.c();
            deviceBindWaitingFragment.mDialog.setCancelable(false);
            deviceBindWaitingFragment.mDialog.show();
        }

        static /* synthetic */ void lambda$handleMessageWhenReferenceNotNull$0(DeviceBindWaitingFragment deviceBindWaitingFragment, View view) {
            deviceBindWaitingFragment.mDialog.dismiss();
            drw.e().d(deviceBindWaitingFragment.mProductId, deviceBindWaitingFragment.mUniqueId, -6);
            drw.e().l(deviceBindWaitingFragment.mUniqueId);
            deviceBindWaitingFragment.popupFragment(ProductIntroductionFragment.class);
        }

        private void setConnectFail(DeviceBindWaitingFragment deviceBindWaitingFragment, Message message) {
            deviceBindWaitingFragment.cancelTimer();
            LogUtil.j(DeviceBindWaitingFragment.TAG, "DeviceBindWaitingFragment connect fail...");
            switchFragment(deviceBindWaitingFragment, message.obj != null ? ((Integer) message.obj).intValue() : 3);
        }

        private void switchFragment(DeviceBindWaitingFragment deviceBindWaitingFragment, int i) {
            HagridDeviceBindResultFragment.setBindStatus(i);
            Bundle bundle = new Bundle();
            bundle.putString("productId", deviceBindWaitingFragment.mProductId);
            ContentValues contentValues = new ContentValues();
            contentValues.put("uniqueId", deviceBindWaitingFragment.mUniqueId);
            contentValues.put("productId", deviceBindWaitingFragment.mProductId);
            bundle.putParcelable("commonDeviceInfo", contentValues);
            HagridDeviceBindResultFragment hagridDeviceBindResultFragment = new HagridDeviceBindResultFragment();
            hagridDeviceBindResultFragment.setArguments(bundle);
            deviceBindWaitingFragment.switchFragment(hagridDeviceBindResultFragment);
            deviceBindWaitingFragment.stop();
        }
    }
}
