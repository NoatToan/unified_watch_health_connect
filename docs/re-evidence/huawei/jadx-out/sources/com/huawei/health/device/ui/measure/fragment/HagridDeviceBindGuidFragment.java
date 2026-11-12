package com.huawei.health.device.ui.measure.fragment;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.huawei.devicesdk.callback.DeviceScanCallback;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.device.callback.BindHealthDeviceCallback;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.connectivity.comm.BleDeviceHelper;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.device.ui.measure.adapter.ScanProductListAdapter;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.ecologydevice.connectivity.ScanFilter;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.ProductIntroductionFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.unitedevice.entity.UniteDevice;
import defpackage.cmy;
import defpackage.ddq;
import defpackage.dmm;
import defpackage.dmp;
import defpackage.doq;
import defpackage.drw;
import defpackage.dso;
import defpackage.dxi;
import defpackage.dxm;
import defpackage.dxw;
import defpackage.dyg;
import defpackage.dyj;
import defpackage.dyq;
import defpackage.eby;
import defpackage.ecf;
import defpackage.efn;
import defpackage.efx;
import defpackage.elh;
import defpackage.enq;
import defpackage.era;
import defpackage.erh;
import defpackage.eru;
import defpackage.iog;
import defpackage.ioi;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class HagridDeviceBindGuidFragment extends BaseFragment implements View.OnClickListener {
    private static final int BUILDER_VIEW_DEFAULT_MARGIN = 0;
    private static final String BUNDLE_KEY_AUTO_DEVICE_SSID = "auth_device_id";
    private static final String BUNDLE_KEY_DEVICE_WEIGHT = "deviceWeight";
    private static final String BUNDLE_KEY_HAS_MANAGER = "hasManager";
    private static final String BUNDLE_KEY_IS_BIND_SUCCESS = "isBindSuccess";
    private static final String BUNDLE_KEY_MAIN_HUID = "mainHuid";
    private static final String BUNDLE_KEY_PRODUCT_ID = "productId";
    private static final String BUNDLE_KEY_RESIS_FAT = "deviceResis";
    private static final String BUNDLE_KEY_VIEW = "view";
    private static final String BUNDLE_VALUE_BIND_RESULT_CONFIRM = "bindResultConfirm";
    private static final int DEVICE_REGISTE_SUCCESS = 2;
    private static final int DEVICE_SCAN_REFRESH = 0;
    private static final int DEVICE_SCAN_TIMEOUT = 1;
    private static final int GET_PART_MAC = 24;
    private static final int INDEX_TWO = 2;
    private static final Object LOCK = new Object();
    private static final int MAP_DEFAULT_SIZE = 16;
    private static final int MEASURE_TIMEOUT = 90000;
    private static final int MESSAGE_LOADING_TIMEOUT = 5;
    private static final int MINIMUM_SCAN_INTERVAL = 6000;
    private static final int MSG_BIND_FAIL = 2;
    private static final int MSG_CONNECT_TIMEOUT = 1;
    private static final int MSG_DEVICE_CHECK_FAIL = 3;
    private static final int MSG_SCAN_SECOND_DEVICE_FAIL = 4;
    private static final int MSG_SCAN_TARGET_DEVICE = 7;
    private static final int MSG_START_SCAN = 6;
    private static final int NUMBEN_TWO = 2;
    private static final int RESULT_CODE_NOT_FOUND = 1001;
    private static final int SCAN_SECOND_DEVICE_TIMEOUT = 2000;
    private static final int SCAN_TIMEOUT = 30000;
    private static final int START_SCAN_DELAY_TIME = 2000;
    private static final String TAG = "HagridDeviceBindGuidFragment";
    private static final String TAG_RELEASE = "R_Weight_HagridDeviceBindGuidFragment";
    private static final int UPDATE_DATA_BASE_FAIL_VALUE = 0;
    private static final int WEIGHT_DEFAULTS = -1;
    private static final int ZIP_BIND_PAIRED_BOOT = 0;
    private static final int ZIP_BIND_PAIRING = 2;
    private ScanProductListAdapter mAdapter;
    private LinearLayout mBackLayout;
    private LinearLayout mBackgroundLayout;
    private HealthTextView mBluetoothPairCancelText;
    private HealthTextView mBluetoothPairConfirmText;
    private ImageView mBluetoothPairResultGuideImg;
    private HealthTextView mBluetoothPairStepDescription;
    private HealthTextView mBluetoothPairStepTitle;
    private Context mContext;
    private CustomAlertDialog mCustomAlertDialog;
    private ContentValues mDeviceInfo;
    private CustomViewDialog mDeviceListDialog;
    private efn mDeviceScanManager;
    private String mDeviceSn;
    private NoTitleCustomAlertDialog mDialog;
    private Handler mHandler;
    private BindCallback mHandlerCallback;
    private ioi mInteractor;
    private boolean mIsAllowBackPress;
    private boolean mIsBeingPaired;
    private boolean mIsNfcCommect;
    private boolean mIsRebind;
    private long mLastScanTime;
    private HealthTextView mListTitleTv;
    private ListView mListView;
    private HealthProgressBar mLoading;
    private LinearLayout mNextLayout;
    private String mProductId;
    private elh mProductInfo;
    private HealthDevice mSelectedHealthDevice;
    private int mSelectedPosition;
    private String mSsid;
    private String mUniqueId;
    private float mWeight;
    private dso mWeightAndFatRateData;
    private BindHealthDeviceCallback mBindCallback = new BindHealthDeviceCallback() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindGuidFragment.1
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
            LogUtil.a(HagridDeviceBindGuidFragment.TAG, "onStatusChanged > status: ", Integer.valueOf(i), ", mIsBingTimeout: ", Boolean.valueOf(HagridDeviceBindGuidFragment.this.mIsBingTimeout));
            HagridDeviceBindGuidFragment.this.processCallbackResult(i, bundle);
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onFailed(HealthDevice healthDevice, int i) {
            if (i == 3 && HagridDeviceBindGuidFragment.this.mHandler != null) {
                HagridDeviceBindGuidFragment.this.mHandler.sendEmptyMessage(2);
            }
            LogUtil.a(HagridDeviceBindGuidFragment.TAG_RELEASE, " send user auth command, user authentication is completed, the binding of fail");
        }
    };
    private IDeviceEventHandler mBindingStatusCallback = new IDeviceEventHandler() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindGuidFragment.2
        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onDeviceFound(HealthDevice healthDevice) {
        }

        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onScanFailed(int i) {
        }

        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onStateChanged(int i) {
            if (i == 7) {
                HagridDeviceBindGuidFragment.this.passDevicePair();
                return;
            }
            if (i != 8) {
                if (i == 10) {
                    drw.e().a(HagridDeviceBindGuidFragment.this.mProductId, HagridDeviceBindGuidFragment.this.mProductInfo.q(), HagridDeviceBindGuidFragment.this.mSelectedHealthDevice, this);
                    return;
                } else {
                    LogUtil.j(HagridDeviceBindGuidFragment.TAG_RELEASE, "in else branch");
                    return;
                }
            }
            LogUtil.j(HagridDeviceBindGuidFragment.TAG_RELEASE, "DeviceBindWaitingFragment bind fail");
            Bundle bundle = new Bundle();
            bundle.putString("productId", HagridDeviceBindGuidFragment.this.mProductId);
            LogUtil.a(907127004, HagridDeviceBindGuidFragment.TAG, bundle, false, "Fail to bind device ", bundle);
            dmp.d().o(HagridDeviceBindGuidFragment.this.mUniqueId);
            HagridDeviceBindGuidFragment.this.showFailScanDialog();
        }
    };
    private boolean mIsHealthDataStatus = false;
    private BleDeviceHelper mBleDeviceHelper = null;
    private boolean mIsBingTimeout = false;
    private Timer mConnectTimer = null;
    private ArrayList<HealthDevice> mListItems = new ArrayList<>(10);
    private final Object mListItemLock = new Object();
    private boolean mIsHasManaer = false;
    private boolean mIsHasBondedProduct = false;
    private String mScanKind = HealthDevice.HealthDeviceKind.HDK_UNKNOWN.name();
    private boolean mIsJump = false;
    private boolean isGotoUserInfoActivity = false;
    private byte[] mMainHuid = null;
    private String mDeviceIdFromDevice = "";
    private boolean mIsFromIconnectDialog = false;
    private boolean mIsConnectBluetooth = false;
    private AdapterView.OnItemClickListener mOnItemClickListener = new AdapterView.OnItemClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindGuidFragment$$ExternalSyntheticLambda5
        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
            this.f$0.m834xfeb03eb(adapterView, view, i, j);
        }
    };

    static class DeviceScanHandler extends Handler {
        private final WeakReference<HagridDeviceBindGuidFragment> weakRef;

        DeviceScanHandler(HagridDeviceBindGuidFragment hagridDeviceBindGuidFragment) {
            this.weakRef = new WeakReference<>(hagridDeviceBindGuidFragment);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message == null) {
                LogUtil.j(HagridDeviceBindGuidFragment.TAG_RELEASE, "DeviceScanHandler mHandler handleMessage:msg == null");
                return;
            }
            HagridDeviceBindGuidFragment hagridDeviceBindGuidFragment = this.weakRef.get();
            if (hagridDeviceBindGuidFragment == null) {
                LogUtil.j(HagridDeviceBindGuidFragment.TAG_RELEASE, "DeviceScanHandler mHandler handleMessage:context is null");
            } else {
                handleMessagePatchOne(message, hagridDeviceBindGuidFragment);
                handleMessagePatchTwo(message, hagridDeviceBindGuidFragment);
            }
        }

        private void handleMessagePatchOne(Message message, HagridDeviceBindGuidFragment hagridDeviceBindGuidFragment) {
            int i = message.what;
            if (i == 0) {
                synchronized (HagridDeviceBindGuidFragment.LOCK) {
                    if (message.obj instanceof HealthDevice) {
                        hagridDeviceBindGuidFragment.refreshDialogDeviceList((HealthDevice) message.obj);
                    }
                }
                return;
            }
            if (i == 1) {
                synchronized (HagridDeviceBindGuidFragment.LOCK) {
                    hagridDeviceBindGuidFragment.jumpScanFail(hagridDeviceBindGuidFragment);
                }
            } else {
                if (i != 2) {
                    if (i != 5 || hagridDeviceBindGuidFragment.mListTitleTv == null || hagridDeviceBindGuidFragment.mLoading == null) {
                        return;
                    }
                    hagridDeviceBindGuidFragment.mLoading.setVisibility(8);
                    hagridDeviceBindGuidFragment.mListTitleTv.setText(R.string.IDS_device_mgr_device_scan_completed_title);
                    return;
                }
                LogUtil.a(HagridDeviceBindGuidFragment.TAG, "DEVICE_REGISTE_SUCCESS");
            }
        }

        private void handleMessagePatchTwo(Message message, HagridDeviceBindGuidFragment hagridDeviceBindGuidFragment) {
            int i = message.what;
            if (i == 4) {
                hagridDeviceBindGuidFragment.gotoBindingDevicePage();
                return;
            }
            if (i == 6) {
                if (hagridDeviceBindGuidFragment.isBluetoothOpen()) {
                    hagridDeviceBindGuidFragment.startScanDevice();
                    return;
                } else {
                    hagridDeviceBindGuidFragment.showBluetoothOpenDialog();
                    return;
                }
            }
            if (i != 7) {
                return;
            }
            synchronized (HagridDeviceBindGuidFragment.LOCK) {
                if (message.obj instanceof HealthDevice) {
                    hagridDeviceBindGuidFragment.mSelectedHealthDevice = (HealthDevice) message.obj;
                    LogUtil.a(HagridDeviceBindGuidFragment.TAG, "scan the target device gotoBinding");
                    hagridDeviceBindGuidFragment.gotoBindingDevicePage();
                }
            }
        }
    }

    /* JADX INFO: renamed from: lambda$new$0$com-huawei-health-device-ui-measure-fragment-HagridDeviceBindGuidFragment, reason: not valid java name */
    /* synthetic */ void m834xfeb03eb(AdapterView adapterView, View view, int i, long j) {
        if (j == -1) {
            LogUtil.j(TAG_RELEASE, "device not found !");
            stopScan();
            return;
        }
        if (ResourceManager.c().d(this.mProductId) == null) {
            if (i >= this.mListItems.size()) {
                LogUtil.a(TAG_RELEASE, "DeviceScanningFragment illegal selected item");
                stopScan();
                return;
            } else {
                this.mSelectedHealthDevice = this.mListItems.get(i);
                this.mSelectedPosition = i;
            }
        } else {
            this.mSelectedPosition = i;
        }
        stopScan();
        buidDeviceWaiting();
        showSecondStep();
        CustomViewDialog customViewDialog = this.mDeviceListDialog;
        if (customViewDialog == null || !customViewDialog.isShowing()) {
            return;
        }
        this.mDeviceListDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshDialogDeviceList(HealthDevice healthDevice) {
        if (isDeviceExistInListItems(healthDevice) || this.mHandler == null) {
            LogUtil.a(TAG, "refreshDialogDeviceList, isDeviceExistInListItems is true, return");
            return;
        }
        CustomViewDialog customViewDialog = this.mDeviceListDialog;
        boolean z = customViewDialog != null && customViewDialog.isShowing();
        LogUtil.a(TAG, "refreshDialogDeviceList, mListItems add " + healthDevice.getDeviceName());
        this.mListItems.add(healthDevice);
        if (!z && this.mListItems.size() == 1) {
            this.mSelectedHealthDevice = healthDevice;
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            this.mHandler.sendMessageDelayed(messageObtain, 2000L);
            return;
        }
        if (this.mListItems.size() == 2) {
            this.mHandler.removeMessages(4);
            showDeviceListDialog();
        }
        ScanProductListAdapter scanProductListAdapter = this.mAdapter;
        if (scanProductListAdapter != null) {
            scanProductListAdapter.a(this.mListItems);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gotoBindingDevicePage() {
        stopScan();
        this.mInteractor = ioi.d();
        this.mHandler = new ConnectHandler(this);
        this.mIsJump = false;
        this.mProductInfo = ResourceManager.c().d(this.mProductId);
        this.mUniqueId = this.mSelectedHealthDevice.getUniqueId();
        insertDeviceData();
        startTimer(90000, 1);
        if (this.mIsFromIconnectDialog) {
            return;
        }
        showSecondStep();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jumpScanFail(HagridDeviceBindGuidFragment hagridDeviceBindGuidFragment) {
        HagridDeviceBindResultFragment.setBindStatus(2);
        Bundle bundle = new Bundle();
        bundle.putString("productId", hagridDeviceBindGuidFragment.mProductId);
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", this.mUniqueId);
        contentValues.put("productId", this.mProductId);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        Fragment hagridDeviceBindResultFragment = new HagridDeviceBindResultFragment();
        hagridDeviceBindResultFragment.setArguments(bundle);
        hagridDeviceBindGuidFragment.switchFragment(hagridDeviceBindResultFragment);
    }

    private boolean isDeviceExistInListItems(HealthDevice healthDevice) {
        if (healthDevice == null) {
            LogUtil.j(TAG, "isDeviceExistInListItems device is null");
            return false;
        }
        Iterator<HealthDevice> it = this.mListItems.iterator();
        while (it.hasNext()) {
            String address = it.next().getAddress();
            if (address != null && address.equals(healthDevice.getAddress())) {
                return true;
            }
        }
        if (!this.mIsRebind || !TextUtils.equals(healthDevice.getAddress(), this.mUniqueId)) {
            return dmp.d().b(healthDevice.getAddress(), false) != null;
        }
        LogUtil.a(TAG, "the huid has lost need rebind");
        return false;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mProductId = getArguments().getString("productId");
        ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
        this.mDeviceInfo = contentValues;
        if (contentValues == null) {
            LogUtil.j(TAG, "start bind guide fragment, mDevcieInfo is null");
        } else {
            this.mProductId = contentValues.getAsString("productId");
            String asString = this.mDeviceInfo.getAsString("uniqueId");
            this.mUniqueId = asString;
            LogUtil.d(TAG, "onCreate productId ", this.mProductId, " mUniqueId ", asString);
        }
        this.mProductInfo = ResourceManager.c().d(this.mProductId);
        this.mIsRebind = getArguments().getBoolean("isRebind");
        this.mIsFromIconnectDialog = getArguments().getBoolean("isFromIconnectDialog");
        this.mIsConnectBluetooth = getArguments().getBoolean("connect_bluetooth");
        boolean z = getArguments().getBoolean("isNfcConnect", false);
        this.mIsNfcCommect = z;
        LogUtil.a(TAG, "onCreate getBoolean mIsNfcCommect = ", Boolean.valueOf(z));
        stop();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a(TAG, "HagridDeviceBindGuidFragment onCreateView");
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        View viewInflate = layoutInflater.inflate(R.layout.device_bind_guide_hygride, viewGroup, false);
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.mCustomTitleBar);
            viewGroup2.addView(viewInflate);
        }
        initView(viewInflate);
        this.mIsAllowBackPress = true;
        this.mIsBeingPaired = false;
        this.mHandler = new DeviceScanHandler(this);
        this.mHandlerCallback = new BindCallback();
        if (this.mIsFromIconnectDialog) {
            LogUtil.a(TAG, "onCreateView is from iconnect dialog showBindingView");
            showBindingView();
        }
        if (this.mIsConnectBluetooth) {
            stopScan();
            buidDeviceWaiting();
            showSecondStep();
        }
        return viewGroup2;
    }

    private void initView(View view) {
        if (LanguageUtil.ba(getActivity())) {
            ImageView imageView = (ImageView) view.findViewById(R.id.device_bind_guide_iv_back);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.device_bind_guide_iv_next);
            imageView.setBackgroundResource(R.drawable.ic_arrows_left_black);
            imageView2.setBackgroundResource(R.drawable.ic_arrows_right_black);
        }
        this.mCustomTitleBar = (CustomTitleBar) view.findViewById(R.id.device_pair_guidance_title);
        this.mCustomTitleBar.setLeftButtonVisibility(0);
        this.mBluetoothPairCancelText = (HealthTextView) view.findViewById(R.id.device_bind_guide_tv_next);
        this.mBluetoothPairConfirmText = (HealthTextView) view.findViewById(R.id.device_bind_guide_tv_back);
        this.mBluetoothPairCancelText.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_device_hygride_button_cancel).toUpperCase(Locale.ENGLISH));
        this.mBluetoothPairConfirmText.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_device_show_next).toUpperCase(Locale.ENGLISH));
        this.mBluetoothPairStepTitle = (HealthTextView) view.findViewById(R.id.id_device_bind_guide_tv_pair_step_title);
        this.mBluetoothPairStepDescription = (HealthTextView) view.findViewById(R.id.id_device_bind_guide_tv_pair_step_description);
        this.mBluetoothPairResultGuideImg = (ImageView) view.findViewById(R.id.pair_result_guide_img);
        this.mBackgroundLayout = (LinearLayout) view.findViewById(R.id.pair_result_guide_img_layout);
        setBindImageBitmap(this.mBluetoothPairResultGuideImg, 0);
        elh elhVar = this.mProductInfo;
        if (elhVar != null) {
            this.mBluetoothPairStepTitle.setText(eru.c(elhVar.c(), this.mProductId, 0));
            this.mBluetoothPairStepDescription.setText(eru.c(this.mProductInfo.c(), this.mProductId, 1));
        } else {
            LogUtil.j(TAG, "onCreateView mProductInfo is null");
        }
        this.mBackLayout = (LinearLayout) view.findViewById(R.id.back_step_button_layout);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.next_step_button_layout);
        this.mNextLayout = linearLayout;
        linearLayout.setOnClickListener(this);
        this.mBackLayout.setOnClickListener(this);
    }

    private void showBindingView() {
        this.mBluetoothPairConfirmText.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_startup_next).toUpperCase(Locale.ENGLISH));
        this.mBluetoothPairStepTitle.setText(R.string.IDS_blite_guide_paire_opt_title);
        this.mBluetoothPairStepDescription.setText(R.string.IDS_device_hygride_pair_tip2);
        setBindImageBitmap(this.mBluetoothPairResultGuideImg, 2);
        elh elhVar = this.mProductInfo;
        if (elhVar != null) {
            this.mBluetoothPairStepTitle.setText(eru.c(elhVar.c(), this.mProductId, 2));
            this.mBluetoothPairStepDescription.setText(eru.c(this.mProductInfo.c(), this.mProductId, 3));
        } else {
            LogUtil.j(TAG, "showSecondStep mProductInfo is null");
        }
        this.mBackLayout.setVisibility(4);
        this.mNextLayout.setVisibility(4);
    }

    private void showSecondStep() {
        this.mIsBeingPaired = true;
        this.mIsAllowBackPress = false;
        showBindingView();
    }

    private void setBindImageBitmap(ImageView imageView, int i) {
        if (imageView == null) {
            LogUtil.j(TAG, "setBindImageBitmap ImageView is null");
            return;
        }
        refreshBackgroundLayout();
        elh elhVar = this.mProductInfo;
        if (elhVar == null) {
            LogUtil.j(TAG, "setBindImageBitmap mProductInfo is null");
        } else {
            imageView.setImageBitmap(eru.a(elhVar.c(), this.mProductId, i));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.mContext = activity;
        if (activity == null) {
            LogUtil.j(TAG_RELEASE, "onActivityCreated mContext is null");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.back_step_button_layout) {
            this.mainActivity.onBackPressed();
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.mHandler = null;
                return;
            }
            return;
        }
        if (id == R.id.next_step_button_layout) {
            Handler handler2 = this.mHandler;
            if (handler2 != null) {
                handler2.removeMessages(4);
            }
            stopScan();
            if (isBluetoothOpen()) {
                showDeviceListDialog();
                startScanDevice();
                return;
            } else {
                showBluetoothOpenDialog();
                return;
            }
        }
        LogUtil.j(TAG_RELEASE, "unknow click item");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showBluetoothOpenDialog() {
        LogUtil.a(TAG, "enter showBluetoothOpenDialog");
        if (this.mDialog == null) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.mainActivity);
            builder.b(R.string.IDS_device_bluetooth_open_request);
            builder.c(R.string.IDS_device_ui_dialog_yes, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindGuidFragment$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m837x9269784f(view);
                }
            });
            builder.a(R.string.IDS_device_ui_dialog_no, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindGuidFragment$$ExternalSyntheticLambda8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m838xc617a310(view);
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            this.mDialog = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
        }
        if (this.mDialog.isShowing()) {
            return;
        }
        this.mDialog.show();
    }

    /* JADX INFO: renamed from: lambda$showBluetoothOpenDialog$1$com-huawei-health-device-ui-measure-fragment-HagridDeviceBindGuidFragment, reason: not valid java name */
    /* synthetic */ void m837x9269784f(View view) {
        if (Build.VERSION.SDK_INT > 30 && PermissionUtil.e(this.mainActivity, PermissionUtil.PermissionType.SCAN) != PermissionUtil.PermissionResult.GRANTED) {
            PermissionUtil.d(this.mainActivity, PermissionUtil.PermissionType.SCAN, new CustomPermissionAction(this.mainActivity) { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindGuidFragment.3
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    HagridDeviceBindGuidFragment.this.openBluetoothsatrtScan();
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    qpx.e(HagridDeviceBindGuidFragment.this.mainActivity, R.string.IDS_nearby_permission_exception);
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                    qrs.b(HagridDeviceBindGuidFragment.this.mainActivity, PermissionUtil.PermissionType.SCAN);
                }
            });
        } else {
            openBluetoothsatrtScan();
        }
    }

    /* JADX INFO: renamed from: lambda$showBluetoothOpenDialog$2$com-huawei-health-device-ui-measure-fragment-HagridDeviceBindGuidFragment, reason: not valid java name */
    /* synthetic */ void m838xc617a310(View view) {
        this.mDialog = null;
        this.mainActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openBluetoothsatrtScan() {
        LogUtil.a(TAG, "showBluetoothOpenDialog isEnable ", Boolean.valueOf(BluetoothAdapter.getDefaultAdapter().enable()));
        this.mDialog.dismiss();
        this.mDialog = null;
        startScanDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isBluetoothOpen() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            if (defaultAdapter.isEnabled()) {
                LogUtil.a(TAG, "bluetooth is open");
                return true;
            }
            LogUtil.j(TAG, "bluetooth is close");
            return false;
        }
        LogUtil.j(TAG_RELEASE, "bluetooth is null");
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        LogUtil.a(TAG, "HagridDeviceBindGuidFragment onStart");
        super.onStart();
        if (this.mIsFromIconnectDialog) {
            LogUtil.a(TAG, "onStart, is from iconnect dialog");
            bindTargetDevice();
            return;
        }
        if (this.mIsBeingPaired || !njy.e(this.mListItems)) {
            return;
        }
        if (isBluetoothOpen()) {
            startScanDevice();
            return;
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeMessages(6);
            this.mHandler.sendEmptyMessageDelayed(6, 2000L);
        }
    }

    private void setHealthLayout(View view) {
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
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeMessages(6);
        }
        if (!this.mIsAllowBackPress) {
            return false;
        }
        Handler handler2 = this.mHandler;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
        stopScan();
        stop();
        return true;
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

    private void startBinding() {
        String str = this.mProductId;
        if (str != null) {
            LogUtil.d(TAG, "DeviceScanningFragment startBinding mProductId is ", str);
            elh elhVarD = ResourceManager.c().d(this.mProductId);
            if (dxm.aq(this.mProductId)) {
                if (elhVarD != null) {
                    drw.e().a(ScanMode.BLE, elhVarD.ac(), this.mHandlerCallback);
                    return;
                }
                LogUtil.a(TAG, "DeviceScanningFragment productInfo is null.");
                ArrayList arrayList = new ArrayList(0);
                cmy.a aVar = new cmy.a();
                aVar.b(2);
                aVar.a("moredevice");
                arrayList.add(aVar.c());
                drw.e().a(ScanMode.BLE, arrayList, this.mHandlerCallback);
                return;
            }
            if (elhVarD != null) {
                LogUtil.a(TAG, "DeviceScanningFragment productInfo is not null");
                this.mDeviceScanManager.a(elhVarD.v(), elhVarD.x(), this.mHandlerCallback);
                return;
            }
            LogUtil.a(TAG, "DeviceScanningFragment for more heart rate device");
            dmm.e eVar = new dmm.e();
            eVar.e(1);
            eVar.b(CommonUtil.j(HealthZonePushReceiver.SLEEP_SCORE_NOTIFY), TimeUnit.SECONDS);
            this.mDeviceScanManager.a(eVar.b(), ScanFilter.c("moredevice", this.mScanKind, ScanFilter.MatchRule.FRONT), this.mHandlerCallback);
        }
    }

    public void stopScan() {
        efn efnVar = this.mDeviceScanManager;
        if (efnVar != null) {
            efnVar.c();
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        LogUtil.a(TAG, "DeviceScanningFragment onDestroy");
        super.onDestroy();
        stopScan();
        synchronized (LOCK) {
            if (this.mAdapter != null) {
                this.mAdapter = null;
            }
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
        doq.e().c(this.mBindCallback);
        if (this.mHandlerCallback != null) {
            this.mHandlerCallback = null;
        }
    }

    class BindCallback implements IDeviceEventHandler, DeviceScanCallback {
        private boolean isHasDeviceByScan;

        private BindCallback() {
            this.isHasDeviceByScan = false;
        }

        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onDeviceFound(HealthDevice healthDevice) {
            if (healthDevice == null) {
                LogUtil.j(HagridDeviceBindGuidFragment.TAG, "BindCallback onDeviceFound device is null");
                return;
            }
            String deviceName = healthDevice.getDeviceName();
            LogUtil.a(HagridDeviceBindGuidFragment.TAG, "Callback, onDeviceFound: ", deviceName);
            if (TextUtils.isEmpty(deviceName)) {
                LogUtil.j(HagridDeviceBindGuidFragment.TAG, "BindCallback onDeviceFound deviceName is null");
                return;
            }
            Message messageObtain = Message.obtain();
            String address = healthDevice.getAddress();
            if (HagridDeviceBindGuidFragment.this.mIsFromIconnectDialog && !TextUtils.isEmpty(address) && !TextUtils.isEmpty(HagridDeviceBindGuidFragment.this.mUniqueId) && TextUtils.equals(address, HagridDeviceBindGuidFragment.this.mUniqueId)) {
                LogUtil.a(HagridDeviceBindGuidFragment.TAG, "is from iconnect scan");
                messageObtain.what = 7;
            } else {
                messageObtain.what = 0;
            }
            messageObtain.obj = healthDevice;
            if (HagridDeviceBindGuidFragment.this.mHandler != null) {
                HagridDeviceBindGuidFragment.this.mHandler.sendMessage(messageObtain);
            }
        }

        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onScanFailed(int i) {
            LogUtil.d(HagridDeviceBindGuidFragment.TAG, "DeviceScanningFragment onScanFailed");
            if (i != 1) {
                if (i == 3) {
                    HagridDeviceBindGuidFragment.this.foundDeviceOfMineNotExist();
                    return;
                } else {
                    LogUtil.j(HagridDeviceBindGuidFragment.TAG, "DeviceScanningFragment, unknown code = ", Integer.valueOf(i));
                    return;
                }
            }
            if (njy.e(HagridDeviceBindGuidFragment.this.mListItems)) {
                HagridDeviceBindGuidFragment.this.foundDeviceOfMineNotExist();
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 5;
            if (HagridDeviceBindGuidFragment.this.mHandler != null) {
                HagridDeviceBindGuidFragment.this.mHandler.sendMessage(messageObtain);
            }
        }

        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onStateChanged(int i) {
            if (i == 1001) {
                boolean zC = enq.d().c();
                boolean zG = enq.d().g(HagridDeviceBindGuidFragment.this.mProductId);
                if (zC && zG) {
                    HealthDevice healthDeviceB = enq.d().b(HagridDeviceBindGuidFragment.this.mProductId);
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 0;
                    messageObtain.obj = healthDeviceB;
                    if (HagridDeviceBindGuidFragment.this.mHandler != null) {
                        HagridDeviceBindGuidFragment.this.mHandler.sendMessage(messageObtain);
                    }
                }
            }
        }

        @Override // com.huawei.devicesdk.callback.DeviceScanCallback
        public void scanResult(UniteDevice uniteDevice, byte[] bArr, String str, int i) {
            LogUtil.a(HagridDeviceBindGuidFragment.TAG, "scanResult errorCode: ", Integer.valueOf(i));
            efx efxVarD = efx.d(uniteDevice);
            if (i != 20 || efxVarD == null) {
                if (i == 22) {
                    if (HagridDeviceBindGuidFragment.this.mListItems != null && HagridDeviceBindGuidFragment.this.mListItems.size() == 0 && !this.isHasDeviceByScan) {
                        LogUtil.j(HagridDeviceBindGuidFragment.TAG, "scanResult: scan finish and list has on device, do scan time out");
                        HagridDeviceBindGuidFragment.this.foundDeviceOfMineNotExist();
                        return;
                    } else {
                        LogUtil.d(HagridDeviceBindGuidFragment.TAG, "scanResult: scan finish and list has device, do nothing");
                        return;
                    }
                }
                LogUtil.j(HagridDeviceBindGuidFragment.TAG, "scanResult: scan faild, do scan time out");
                HagridDeviceBindGuidFragment.this.foundDeviceOfMineNotExist();
                return;
            }
            String deviceName = efxVarD.getDeviceName();
            LogUtil.a(HagridDeviceBindGuidFragment.TAG, "scanResult deviceName: ", deviceName);
            if (TextUtils.isEmpty(deviceName)) {
                return;
            }
            if (!this.isHasDeviceByScan) {
                this.isHasDeviceByScan = true;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 0;
            messageObtain.obj = efxVarD;
            if (HagridDeviceBindGuidFragment.this.mHandler != null) {
                HagridDeviceBindGuidFragment.this.mHandler.sendMessage(messageObtain);
            }
        }
    }

    private void bindTargetDevice() {
        LogUtil.a(TAG, "is from iconnect but code = 5");
        if (TextUtils.isEmpty(this.mUniqueId)) {
            LogUtil.a(TAG, "bindTargetDevice but uniqueId = null");
            startScanDevice();
            return;
        }
        LogUtil.a(TAG, "is from iconnect but code = 5 mUniqueId = ", CommonUtil.n(this.mUniqueId));
        BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.mUniqueId);
        if (remoteDevice == null) {
            LogUtil.a(TAG, "bindTargetDevice but bluetoothDevice = null or fromBluetoothDevice = null");
            startScanDevice();
            return;
        }
        efx efxVarB = efx.b(remoteDevice);
        LogUtil.a(TAG, "bindTargetDevice name = ", efxVarB.getDeviceName(), ",uniqueId = ", CommonUtil.n(efxVarB.getUniqueId()));
        Message messageObtain = Message.obtain();
        messageObtain.what = 7;
        messageObtain.obj = efxVarB;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void passDevicePair() {
        LogUtil.a(TAG, "DeviceBindWaitingFragment PAIRING_PASSED");
        HashMap map = new HashMap(16);
        if (Utils.o()) {
            String strD = erh.d(this.mSelectedHealthDevice.getAddress());
            if (strD != null && !TextUtils.isEmpty(strD) && strD.length() > 24) {
                map.put("macAddress for bi:::", strD.substring(0, 24));
                LogUtil.a(TAG, "macAddress fuzzyData:", CommonUtil.n(strD.substring(0, 24)));
            }
        } else {
            map.put("macAddress", erh.d(this.mSelectedHealthDevice.getAddress()));
            LogUtil.a(TAG, "macAddress fuzzyData:", CommonUtil.n(this.mSelectedHealthDevice.getAddress()));
        }
        map.put("device_name", this.mProductInfo.l().d());
        map.put(DeviceCategoryFragment.DEVICE_TYPE, this.mProductInfo.m().name());
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        if (elhVarD != null) {
            map.put("deviceId", elhVarD.h());
        }
        String strB = era.b(this.mProductId);
        map.put("prodId", strB);
        dyj.e(map);
        LogUtil.a(TAG, "deviceName for bi:", this.mProductInfo.l().d(), "device_type for bi :::", this.mProductInfo.m().name(), "prodId for bi:", strB);
        map.put("productId", this.mProductId);
        ddq.d().setEvent(BaseApplication.getContext(), String.valueOf(1500), map);
        if (getDataStatus() && Utils.h() && (!Utils.o() || !isShowAuthorizeDialog())) {
            showAuthorizeAlertDialog();
        } else {
            jumpToActivity();
        }
    }

    private void jumpToActivity() {
        era.d(this.mProductInfo.m());
        drw.e().b();
        bindWeightDevice();
    }

    private void bindWeightDevice() {
        HealthDevice healthDevice = this.mSelectedHealthDevice;
        if (healthDevice instanceof MeasurableDevice) {
            MeasurableDevice measurableDevice = (MeasurableDevice) healthDevice;
            measurableDevice.setMeasureKitUuid(this.mProductInfo.q());
            Bundle bundle = new Bundle();
            bundle.putInt("type", -2);
            bundle.putString("productId", this.mProductId);
            drw.e().e(this.mProductId, this.mUniqueId, this.mBindCallback, bundle, measurableDevice);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processCallbackResult(int i, Bundle bundle) {
        if (bundle == null) {
            LogUtil.j(TAG_RELEASE, "processCallbackResult bundle is null");
            return;
        }
        MeasurableDevice measurableDevice = (MeasurableDevice) this.mSelectedHealthDevice;
        if (i == -7) {
            getHuid(bundle);
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
                LogUtil.j(TAG_RELEASE, " send config info failed");
                return;
            } else {
                LogUtil.a(TAG, " send config info success.");
                return;
            }
        }
        if (i == -13) {
            if (bundle.getInt("ret") != 0) {
                LogUtil.j(TAG_RELEASE, " set manager info failed");
                return;
            } else {
                LogUtil.a(TAG, " set manager info success.");
                return;
            }
        }
        if (i == -16) {
            this.mDeviceSn = bundle.getString(HealthEngineRequestManager.PARAMS_DEVICE_SN);
            LogUtil.a(TAG, " get device version and sn.");
            return;
        }
        if (i == -9) {
            getDeviceSsid(bundle, measurableDevice);
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
        if (this.mDeviceInfo == null) {
            this.mDeviceInfo = new ContentValues();
        }
        this.mDeviceInfo.put("uniqueId", measurableDevice.getUniqueId());
        this.mDeviceInfo.put("productId", this.mProductId);
        gotoBluetoothPairSuccessPage(false);
        cancelTimer();
    }

    private void getHuid(Bundle bundle) {
        try {
            this.mMainHuid = bundle.getByteArray("huid");
        } catch (Exception unused) {
            LogUtil.e(TAG, "huid getByteArray exception");
        }
        byte[] bArr = this.mMainHuid;
        boolean z = bArr == null || bArr.length == 0;
        this.mIsHasManaer = z;
        LogUtil.a(TAG, "mIsHasManager = ", Boolean.valueOf(z));
    }

    private void getDeviceSsid(Bundle bundle, MeasurableDevice measurableDevice) {
        this.mSsid = bundle.getString("deviceSsid");
        LogUtil.a(TAG, " save device info, deviceSn:", dyg.b(this.mDeviceSn));
        dxm.d(this.mDeviceSn, measurableDevice.getUniqueId());
        dxm.b(measurableDevice.getUniqueId(), this.mDeviceSn);
        measurableDevice.setSerialNumber(this.mDeviceSn);
        checkAndUpdateLocalDevice(measurableDevice, this.mDeviceSn);
        if (this.mDeviceInfo == null) {
            this.mDeviceInfo = new ContentValues();
        }
        String uniqueId = measurableDevice.getUniqueId();
        this.mUniqueId = uniqueId;
        this.mDeviceInfo.put("uniqueId", uniqueId);
        this.mDeviceInfo.put("productId", this.mProductId);
        gotoBluetoothPairSuccessPage(this.mIsHasManaer);
        cancelTimer();
    }

    private void checkAndUpdateLocalDevice(MeasurableDevice measurableDevice, final String str) {
        boolean z = false;
        MeasurableDevice measurableDeviceA = dmp.d().a(str, false);
        if (measurableDeviceA == null) {
            saveDevice(measurableDevice, str);
            return;
        }
        if (measurableDeviceA instanceof eby) {
            eby ebyVar = (eby) measurableDeviceA;
            if (!TextUtils.equals(this.mDeviceIdFromDevice, ebyVar.e())) {
                LogUtil.j(TAG, "device rebind, unbind local wifi device");
                new dxi().c(ebyVar.e(), new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindGuidFragment$$ExternalSyntheticLambda4
                    @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                    public final void operationResult(Object obj, String str2, boolean z2) {
                        HagridDeviceBindGuidFragment.lambda$checkAndUpdateLocalDevice$3(str, (CloudCommonReponse) obj, str2, z2);
                    }
                });
                z = true;
            }
        }
        upDateDeviceUniqueId(measurableDevice, z);
    }

    static /* synthetic */ void lambda$checkAndUpdateLocalDevice$3(String str, CloudCommonReponse cloudCommonReponse, String str2, boolean z) {
        LogUtil.a(TAG, "operationResult isSuccess ", Boolean.valueOf(z));
        ecf.c(str);
    }

    private void processBindedSameWiFi(Bundle bundle) {
        if (bundle == null) {
            LogUtil.j(TAG, "processBindedSameWiFi bundle is null");
        } else if (bundle.getString("cloudDeviceID") != null) {
            this.mDeviceIdFromDevice = bundle.getString("cloudDeviceID");
        }
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

    private void processBindType(Bundle bundle) {
        if (bundle == null) {
            LogUtil.j(TAG_RELEASE, "processBindType bundle is null");
            return;
        }
        byte b2 = bundle.getByte("ret");
        if (b2 == 2) {
            LogUtil.e(TAG_RELEASE, "binding failed.");
            cancelTimer();
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.sendEmptyMessage(1);
                return;
            }
            return;
        }
        if (b2 != 1) {
            LogUtil.a(TAG, "processBindType default");
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
        startTimer(30000, 3);
        LogUtil.a(TAG, "bind is completed, ret is ", Byte.valueOf(b2));
    }

    private void saveDevice(MeasurableDevice measurableDevice, String str) {
        dmp.d().d(this.mProductId, this.mProductInfo.q(), measurableDevice, new IDeviceEventHandler() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindGuidFragment.4
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
        dxm.c(this.mContext, this.mProductId, this.mUniqueId);
    }

    private void startTimer(int i, int i2) {
        synchronized (this) {
            if (this.mConnectTimer == null) {
                this.mConnectTimer = new Timer(TAG);
                LogUtil.a(TAG, "Start the timer connected devices");
                this.mConnectTimer.schedule(new MyTimerTask(this, i2), i);
            }
        }
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
                LogUtil.a(TAG_RELEASE, "Connection timer has been canceled");
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
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
        setHealthLayout(viewInflate);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(getActivity());
        builder.a(viewInflate);
        builder.d(R.string.IDS_service_area_notice_title);
        builder.d(R.string.IDS_user_permission_ok, new DialogInterface.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindGuidFragment$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.m835xb19f3a1(dialogInterface, i);
            }
        });
        builder.a(R.string.IDS_common_disagree, new DialogInterface.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindGuidFragment$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.m836x3ec81e62(dialogInterface, i);
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        this.mCustomAlertDialog = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        this.mCustomAlertDialog.show();
    }

    /* JADX INFO: renamed from: lambda$showAuthorizeAlertDialog$4$com-huawei-health-device-ui-measure-fragment-HagridDeviceBindGuidFragment, reason: not valid java name */
    /* synthetic */ void m835xb19f3a1(DialogInterface dialogInterface, int i) {
        if (!this.mIsHealthDataStatus) {
            this.mInteractor.e(7, true, "DeviceBindWaitingFragment", null);
        }
        jumpToActivity();
    }

    /* JADX INFO: renamed from: lambda$showAuthorizeAlertDialog$5$com-huawei-health-device-ui-measure-fragment-HagridDeviceBindGuidFragment, reason: not valid java name */
    /* synthetic */ void m836x3ec81e62(DialogInterface dialogInterface, int i) {
        jumpToActivity();
    }

    static class MyTimerTask extends TimerTask {
        private int mType;
        private WeakReference<HagridDeviceBindGuidFragment> mWeakReference;

        MyTimerTask(HagridDeviceBindGuidFragment hagridDeviceBindGuidFragment, int i) {
            this.mWeakReference = new WeakReference<>(hagridDeviceBindGuidFragment);
            this.mType = i;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            HagridDeviceBindGuidFragment hagridDeviceBindGuidFragment = this.mWeakReference.get();
            if (hagridDeviceBindGuidFragment == null) {
                return;
            }
            LogUtil.j(HagridDeviceBindGuidFragment.TAG_RELEASE, "connect timeout...");
            hagridDeviceBindGuidFragment.mIsBingTimeout = true;
            if (hagridDeviceBindGuidFragment.mProductInfo != null && hagridDeviceBindGuidFragment.mProductInfo.v().c() == 2) {
                drw.e().b();
            }
            if (hagridDeviceBindGuidFragment.mBleDeviceHelper != null) {
                dxw.d().unregisterReceiver(hagridDeviceBindGuidFragment.mBleDeviceHelper);
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = Integer.valueOf(this.mType);
            if (hagridDeviceBindGuidFragment.mHandler != null) {
                hagridDeviceBindGuidFragment.mHandler.sendMessage(messageObtain);
            }
        }
    }

    private boolean getDataStatus() {
        if ("true".equals(this.mInteractor.c(7))) {
            this.mIsHealthDataStatus = true;
        } else {
            this.mIsHealthDataStatus = false;
        }
        return !this.mIsHealthDataStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showFailScanDialog() {
        String str = String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_device_common_err_bind_failed_prompts), UnitUtil.e(1.0d, 1, 0), UnitUtil.e(1.0d, 1, 0), UnitUtil.e(2.0d, 1, 0));
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(getContext());
        builder.a(str).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindGuidFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m839x7512ca6b(view);
            }
        });
        builder.b().show();
    }

    /* JADX INFO: renamed from: lambda$showFailScanDialog$6$com-huawei-health-device-ui-measure-fragment-HagridDeviceBindGuidFragment, reason: not valid java name */
    /* synthetic */ void m839x7512ca6b(View view) {
        DeviceMainActivity deviceMainActivity;
        if (!(getActivity() instanceof DeviceMainActivity) || (deviceMainActivity = (DeviceMainActivity) getActivity()) == null) {
            return;
        }
        deviceMainActivity.a(ProductIntroductionFragment.class);
    }

    private void showDeviceListDialog() {
        if (this.mDeviceListDialog == null) {
            initDeviceListDialog();
        }
        CustomViewDialog customViewDialog = this.mDeviceListDialog;
        if (customViewDialog == null || !customViewDialog.isShowing()) {
            this.mLoading.setVisibility(0);
            HealthTextView healthTextView = this.mListTitleTv;
            if (healthTextView != null) {
                healthTextView.setText(R.string.IDS_device_mgr_device_scaning_title);
            }
            this.mIsAllowBackPress = false;
            CustomViewDialog customViewDialog2 = this.mDeviceListDialog;
            if (customViewDialog2 != null) {
                customViewDialog2.show();
            }
        }
    }

    private void initDeviceListDialog() {
        Object systemService = this.mContext.getSystemService("layout_inflater");
        View viewInflate = systemService instanceof LayoutInflater ? ((LayoutInflater) systemService).inflate(R.layout.device_search_list_dialog, (ViewGroup) null) : null;
        Context context = getContext();
        if (context == null) {
            LogUtil.j(TAG_RELEASE, "initDeviceListDialog context is null");
            return;
        }
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(context);
        if (viewInflate != null) {
            this.mListView = (ListView) viewInflate.findViewById(R.id.device_list);
            HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.device_search_listview_title);
            this.mListTitleTv = healthTextView;
            healthTextView.setText(R.string.IDS_device_mgr_device_scaning_title);
            this.mAdapter = new ScanProductListAdapter(this.mListItems, this.mContext, this.mProductId);
            HealthProgressBar healthProgressBar = (HealthProgressBar) viewInflate.findViewById(R.id.dialog_listview_loading);
            this.mLoading = healthProgressBar;
            healthProgressBar.setLayerType(1, null);
            this.mLoading.setVisibility(0);
            this.mListView.setAdapter((ListAdapter) this.mAdapter);
            addFootView();
        }
        this.mListView.setOnItemClickListener(this.mOnItemClickListener);
        builder.c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindGuidFragment$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m833xa6afb758(view);
            }
        });
        builder.b(viewInflate, 0, 0);
        builder.b(false);
        CustomViewDialog customViewDialogD = builder.d();
        this.mDeviceListDialog = customViewDialogD;
        customViewDialogD.setCancelable(false);
    }

    /* JADX INFO: renamed from: lambda$initDeviceListDialog$7$com-huawei-health-device-ui-measure-fragment-HagridDeviceBindGuidFragment, reason: not valid java name */
    /* synthetic */ void m833xa6afb758(View view) {
        stopScan();
        this.mIsAllowBackPress = true;
    }

    private void buidDeviceWaiting() {
        this.mInteractor = ioi.d();
        this.mHandler = new ConnectHandler(this);
        this.mIsJump = false;
        if (this.mSelectedPosition < this.mListItems.size()) {
            this.mSelectedHealthDevice = this.mListItems.get(this.mSelectedPosition);
            this.mProductInfo = ResourceManager.c().d(this.mProductId);
            this.mUniqueId = this.mSelectedHealthDevice.getUniqueId();
            elh elhVar = this.mProductInfo;
            if (elhVar != null && elhVar.v() != null) {
                LogUtil.a(TAG, "DeviceBindWaitingFragment pair is ", this.mProductInfo.v().a());
            } else {
                LogUtil.j(TAG, "buidDeviceWaiting mProductInfo is null");
            }
            insertDeviceData();
        }
        startTimer(90000, 1);
    }

    private void insertDeviceData() {
        elh elhVar = this.mProductInfo;
        if (elhVar == null) {
            LogUtil.j(TAG, "insertDeviceData mProductInfo is null");
        } else {
            if (elhVar.v().a().equals("yes")) {
                return;
            }
            drw.e().a(this.mProductId, this.mProductInfo.q(), this.mSelectedHealthDevice, this.mBindingStatusCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startScanDevice() {
        LogUtil.a(TAG, "startScanDevice");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.mLastScanTime;
        if (j < 6000) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeMessages(6);
                this.mHandler.sendEmptyMessageDelayed(6, 6000 - j);
                return;
            }
            return;
        }
        this.mLastScanTime = jElapsedRealtime;
        synchronized (this.mListItemLock) {
            LogUtil.a(TAG, "startScanDevice, reset mListItems");
            this.mListItems.clear();
            ScanProductListAdapter scanProductListAdapter = this.mAdapter;
            if (scanProductListAdapter != null) {
                scanProductListAdapter.a(this.mListItems);
            }
        }
        this.mDeviceScanManager = new efn();
        startBinding();
    }

    private void addFootView() {
        View viewInflate = ((LayoutInflater) this.mContext.getSystemService("layout_inflater")).inflate(R.layout.device_search_list_not_found_my_device_button, (ViewGroup) null);
        viewInflate.findViewById(R.id.not_found_device_tip).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceBindGuidFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m832x1893df47(view);
            }
        });
        this.mListView.addFooterView(viewInflate);
    }

    /* JADX INFO: renamed from: lambda$addFootView$8$com-huawei-health-device-ui-measure-fragment-HagridDeviceBindGuidFragment, reason: not valid java name */
    /* synthetic */ void m832x1893df47(View view) {
        foundDeviceOfMineNotExist();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void foundDeviceOfMineNotExist() {
        CustomViewDialog customViewDialog = this.mDeviceListDialog;
        if (customViewDialog != null && customViewDialog.isShowing()) {
            this.mDeviceListDialog.dismiss();
        }
        stopScan();
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        }
    }

    private void gotoBluetoothPairSuccessPage(boolean z) {
        LogUtil.a(TAG, "gotoBluetoothPairSuccessPage = ", Boolean.valueOf(z));
        if (this.mIsJump) {
            return;
        }
        dyj.b(this.mProductId);
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
            HagridDeviceBindResultFragment hagridDeviceBindResultFragment = new HagridDeviceBindResultFragment();
            hagridDeviceBindResultFragment.setArguments(bundle);
            switchFragment(this, hagridDeviceBindResultFragment);
        }
    }

    static class ConnectHandler extends BaseHandler<HagridDeviceBindGuidFragment> {
        ConnectHandler(HagridDeviceBindGuidFragment hagridDeviceBindGuidFragment) {
            super(hagridDeviceBindGuidFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        public void handleMessageWhenReferenceNotNull(HagridDeviceBindGuidFragment hagridDeviceBindGuidFragment, Message message) {
            if (hagridDeviceBindGuidFragment == null) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                LogUtil.d(HagridDeviceBindGuidFragment.TAG, "DeviceBindWaitingFragment connect timeout");
                setConnectFail(hagridDeviceBindGuidFragment, message);
            } else if (i == 2) {
                LogUtil.d(HagridDeviceBindGuidFragment.TAG, "DeviceBindWaitingFragment bind fail...");
                setConnectFail(hagridDeviceBindGuidFragment, message);
            } else {
                if (i != 3) {
                    return;
                }
                switchFragment(hagridDeviceBindGuidFragment, 11);
            }
        }

        private void setConnectFail(HagridDeviceBindGuidFragment hagridDeviceBindGuidFragment, Message message) {
            hagridDeviceBindGuidFragment.cancelTimer();
            LogUtil.j(HagridDeviceBindGuidFragment.TAG_RELEASE, "DeviceBindWaitingFragment connect timeout...");
            switchFragment(hagridDeviceBindGuidFragment, message.obj != null ? ((Integer) message.obj).intValue() : 3);
        }

        private void switchFragment(HagridDeviceBindGuidFragment hagridDeviceBindGuidFragment, int i) {
            HagridDeviceBindResultFragment.setBindStatus(i);
            Bundle bundle = new Bundle();
            bundle.putString("productId", hagridDeviceBindGuidFragment.mProductId);
            ContentValues contentValues = new ContentValues();
            contentValues.put("uniqueId", hagridDeviceBindGuidFragment.mUniqueId);
            contentValues.put("productId", hagridDeviceBindGuidFragment.mProductId);
            bundle.putParcelable("commonDeviceInfo", contentValues);
            HagridDeviceBindResultFragment hagridDeviceBindResultFragment = new HagridDeviceBindResultFragment();
            hagridDeviceBindResultFragment.setArguments(bundle);
            hagridDeviceBindGuidFragment.switchFragment(hagridDeviceBindResultFragment);
            hagridDeviceBindGuidFragment.stop();
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LogUtil.a(TAG, "onConfigurationChanged, refresh page");
        refreshBackgroundLayout();
        super.onConfigurationChanged(configuration);
    }

    private void refreshBackgroundLayout() {
        LinearLayout linearLayout = this.mBackgroundLayout;
        if (linearLayout != null) {
            qrs.b(linearLayout, 2);
        }
    }
}
