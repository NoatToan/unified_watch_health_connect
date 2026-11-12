package com.huawei.health.ecologydevice.ui.measure.fragment;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.huawei.ecologydevice.R;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.device.api.VersionVerifyUtilApi;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.ecologydevice.callback.IdialogButtonClickCallback;
import com.huawei.health.ecologydevice.callback.NfcMeasureCallback;
import com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.open.data.model.CommonUiResponse;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.dmg;
import defpackage.dmz;
import defpackage.dxw;
import defpackage.efj;
import defpackage.efx;
import defpackage.ejo;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.emq;
import defpackage.emr;
import defpackage.eqw;
import defpackage.eru;
import defpackage.ete;
import defpackage.etg;
import defpackage.etn;
import defpackage.iov;
import defpackage.pig;
import defpackage.pip;
import defpackage.pis;
import defpackage.piu;
import defpackage.qrk;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public class BloodSugarIntroductionFragment extends BaseFragment implements View.OnClickListener {
    private static final String BLOOD_SUGAR_UNIT_MMOL_L = "mmol/L";
    private static final int DELAY_500MS = 500;
    private static final int DOWNLOAD_RESOURCE_SUCCESS = 104;
    private static final int DOWNLOAD_TIME_OUT = 108;
    private static final int DOWNLOAD_TIME_OUT_DELAY_30S = 30000;
    private static final int REQUEST_ENABLE_BT = 2;
    private static final int REQUEST_GPS_LOCATION = 1;
    private static final int SCAN_DEVICE = 109;
    private static final int SHOW_INPUT_PIN = 107;
    private static final int STATE_CHANGED = 106;
    private static final String TAG = "BloodSugarIntroductionFragment";
    private static final int TO_FRESH = 105;
    private BluetoothAdapter mBluetoothAdapter;
    private BluetoothDevice mBluetoothDevice;
    private BroadcastReceiver mBroadcastReceiver;
    private int mCurrentStatus;
    private ImageView mDefaultDeviceImage;
    private efx mDevice;
    private HealthTextView mDeviceBondStatus;
    private ImageView mDeviceImage;
    private String mDeviceMacAddress;
    private RelativeLayout mDeviceMeasureValueLayout;
    private String mDeviceName;
    private String mDevicePid;
    private String mDevicePin;
    private String mDeviceType;
    private String mEnterType;
    private HealthTextView mFirstConnectFailedTv;
    private HealthTextView mLastMeasure;
    private HealthTextView mLastMeasureDate;
    private LinearLayout mLastMeasureLayout;
    private LinearLayout mMeasureLevelLayout;
    private HealthTextView mMeasureValue;
    private HealthTextView mMeasureValueLevel;
    private HealthTextView mMeasureValueUnit;
    private String mProductId;
    private elh mProductInfo;
    private HealthProgressBar mReBondLoadingPb;
    private HealthTextView mReBondTv;
    private int mReconnectCount;
    private ImageView mRightArrow;
    private ejo mRocheGlucoseManager;
    private long mStartConnectTime;
    private HealthTextView mTimePeriod;
    private final HealthDevice.HealthDeviceKind mKind = HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR;
    private boolean mIsBtEnableShowing = false;
    private CustomViewDialog mDialogForConnectFail = null;
    private BloodSugarHandler mBloodSugarHandler = new BloodSugarHandler();
    private final NfcMeasureCallback mNfcMeasureCallback = new NfcMeasureCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BloodSugarIntroductionFragment.1
        @Override // com.huawei.health.ecologydevice.callback.NfcMeasureCallback
        public void onStartMeasuring() {
        }

        @Override // com.huawei.health.ecologydevice.callback.NfcMeasureCallback
        public void onDataChanged(HealthDevice healthDevice, HealthData healthData) {
            int i;
            try {
                if (healthDevice instanceof efx) {
                    BloodSugarIntroductionFragment.this.mDevice = (efx) healthDevice;
                }
                int bondState = BloodSugarIntroductionFragment.this.mDevice.c().getBondState();
                if (BloodSugarIntroductionFragment.this.mDevice.c() == null || bondState != 12) {
                    return;
                }
                BloodSugarIntroductionFragment bloodSugarIntroductionFragment = BloodSugarIntroductionFragment.this;
                bloodSugarIntroductionFragment.mBluetoothDevice = bloodSugarIntroductionFragment.mDevice.c();
                elh elhVarD = BloodSugarIntroductionFragment.this.mProductId != null ? ResourceManager.c().d(BloodSugarIntroductionFragment.this.mProductId) : null;
                if (BloodSugarIntroductionFragment.this.mDeviceType != null) {
                    try {
                        i = Integer.parseInt(BloodSugarIntroductionFragment.this.mDeviceType);
                    } catch (NumberFormatException e) {
                        LogUtil.a(BloodSugarIntroductionFragment.TAG, e.getMessage());
                        i = 10001;
                    }
                } else {
                    i = 10001;
                }
                if (elhVarD != null && elhVarD.l() != null) {
                    String strA = elo.a(BloodSugarIntroductionFragment.this.mProductId, elhVarD.l().d());
                    BloodSugarIntroductionFragment bloodSugarIntroductionFragment2 = BloodSugarIntroductionFragment.this;
                    bloodSugarIntroductionFragment2.registerDeviceInfo(bloodSugarIntroductionFragment2.mDevice, strA, i, BloodSugarIntroductionFragment.this.mProductId);
                } else {
                    BloodSugarIntroductionFragment bloodSugarIntroductionFragment3 = BloodSugarIntroductionFragment.this;
                    bloodSugarIntroductionFragment3.registerDeviceInfo(bloodSugarIntroductionFragment3.mDevice, BloodSugarIntroductionFragment.this.getContext().getResources().getString(R.string.IDS_device_group_name_blood_glucose_scale), i, BloodSugarIntroductionFragment.this.mProductId);
                }
                BloodSugarIntroductionFragment bloodSugarIntroductionFragment4 = BloodSugarIntroductionFragment.this;
                bloodSugarIntroductionFragment4.tickBiNfcConnectBloodSugar(bloodSugarIntroductionFragment4.getContext(), etg.c(BloodSugarIntroductionFragment.this.mStartConnectTime), bondState, BloodSugarIntroductionFragment.this.mReconnectCount);
            } catch (SecurityException e2) {
                LogUtil.e(BloodSugarIntroductionFragment.TAG, "onDataChanged SecurityException:", ExceptionUtils.c(e2));
            }
        }

        @Override // com.huawei.health.ecologydevice.callback.NfcMeasureCallback
        public void onStatusChanged(int i, int i2, int i3) {
            LogUtil.a(BloodSugarIntroductionFragment.TAG, "onStatusChanged and status=", Integer.valueOf(i));
            BloodSugarIntroductionFragment.this.mReconnectCount = i3;
            BloodSugarIntroductionFragment.this.mCurrentStatus = i;
            BloodSugarIntroductionFragment.this.sendEmptyMessage(106);
            if (i == 13) {
                BloodSugarIntroductionFragment bloodSugarIntroductionFragment = BloodSugarIntroductionFragment.this;
                bloodSugarIntroductionFragment.tickBiNfcConnectBloodSugar(bloodSugarIntroductionFragment.getContext(), 0.0d, i2, i3);
            }
        }
    };

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        ejo ejoVar;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            LogUtil.a(TAG, "bundle is null");
        } else if (initParam(arguments) && (ejoVar = this.mRocheGlucoseManager) != null) {
            ejoVar.b(this.mNfcMeasureCallback);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater == null) {
            LogUtil.a(TAG, "BloodSugarIntroductionFragment onCreateView inflater is null");
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            return null;
        }
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        this.child = layoutInflater.inflate(R.layout.blood_sugar_introduction_layout, viewGroup, false);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
            initView(this.child);
        }
        initTitleBar();
        handleUpdateProductMap();
        return viewGroup2;
    }

    private void initView(View view) {
        this.mDefaultDeviceImage = (ImageView) view.findViewById(R.id.device_default_image_iv);
        this.mDeviceImage = (ImageView) view.findViewById(R.id.device_image_iv);
        this.mDeviceBondStatus = (HealthTextView) view.findViewById(R.id.device_connect_status);
        this.mFirstConnectFailedTv = (HealthTextView) view.findViewById(R.id.device_first_connect_failed_tips);
        this.mReBondTv = (HealthTextView) view.findViewById(R.id.device_reconnect_tv);
        this.mReBondLoadingPb = (HealthProgressBar) view.findViewById(R.id.device_reconnect_pb);
        this.mDeviceMeasureValueLayout = (RelativeLayout) view.findViewById(R.id.device_measure_value_layout);
        if ("NFC".equals(this.mEnterType) || "QRCODE".equals(this.mEnterType)) {
            this.mDeviceMeasureValueLayout.setVisibility(8);
        }
        this.mMeasureValue = (HealthTextView) view.findViewById(R.id.third_party_measure_value);
        this.mMeasureValueUnit = (HealthTextView) view.findViewById(R.id.third_party_device_type_unit);
        this.mMeasureValueLevel = (HealthTextView) view.findViewById(R.id.third_party_measure_value_level);
        this.mLastMeasure = (HealthTextView) view.findViewById(R.id.device_last_measure);
        this.mLastMeasureDate = (HealthTextView) view.findViewById(R.id.device_measure_date);
        this.mRightArrow = (ImageView) view.findViewById(R.id.iv_right_arrow);
        this.mTimePeriod = (HealthTextView) view.findViewById(R.id.device_measure_time_period);
        this.mLastMeasureLayout = (LinearLayout) view.findViewById(R.id.device_last_sugar_layout);
        this.mMeasureLevelLayout = (LinearLayout) view.findViewById(R.id.device_measure_level_layout);
        this.mFirstConnectFailedTv.setVisibility(8);
        this.mMeasureValueUnit.setVisibility(0);
        this.mMeasureValueUnit.setText(BLOOD_SUGAR_UNIT_MMOL_L);
        this.mReBondTv.setOnClickListener(this);
        this.mLastMeasureLayout.setOnClickListener(this);
        this.mLastMeasureLayout.setClickable(false);
    }

    private void initTitleBar() {
        this.mCustomTitleBar.setRightButtonVisibility(8);
        Resources resources = getContext().getResources();
        if (resources != null) {
            this.mCustomTitleBar.setTitleBarBackgroundColor(resources.getColor(R.color.wear_home_bg_color));
            super.setTitle(resources.getString(R.string.IDS_device_group_name_blood_glucose_scale));
        }
    }

    private boolean initParam(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        this.mDeviceMacAddress = bundle.getString("BLE_FROM_QRCODE");
        this.mDeviceName = bundle.getString("BLENAME_FROM_QRCODE");
        if (TextUtils.isEmpty(this.mDeviceMacAddress) && TextUtils.isEmpty(this.mDeviceName)) {
            return false;
        }
        this.mDeviceType = bundle.getString("DEVICE_TYPE_INDEX");
        this.mDevicePid = bundle.getString("PID_FROM_QRCODE");
        this.mDevicePin = bundle.getString("PIN_FROM_QRCODE");
        if (TextUtils.isEmpty(bundle.getString("PAYLOAD_FROM_NFC"))) {
            LogUtil.d(TAG, "QRCODE");
            this.mEnterType = "QRCODE";
        } else {
            LogUtil.d(TAG, "NFC");
            this.mEnterType = "NFC";
        }
        if (!checkInputIsValid()) {
            return false;
        }
        if (this.mBluetoothAdapter == null && getActivity() != null) {
            BluetoothManager bluetoothManager = getActivity().getSystemService("bluetooth") instanceof BluetoothManager ? (BluetoothManager) getActivity().getSystemService("bluetooth") : null;
            if (bluetoothManager == null) {
                LogUtil.j(TAG, "no BT Manager in this phone");
                return false;
            }
            this.mBluetoothAdapter = bluetoothManager.getAdapter();
        }
        if (this.mBluetoothAdapter == null) {
            return false;
        }
        if (this.mRocheGlucoseManager == null) {
            this.mRocheGlucoseManager = ejo.b();
        }
        this.mRocheGlucoseManager.d(this.mDeviceName, this.mDeviceMacAddress);
        ete.d().d(this.mKind.name());
        this.mRocheGlucoseManager.c(ete.d().b());
        return true;
    }

    private boolean checkInputIsValid() {
        if (TextUtils.isEmpty(this.mDevicePid) || TextUtils.isEmpty(this.mDeviceType)) {
            LogUtil.j(TAG, "mDevicePid || mDeviceType is null");
            return false;
        }
        if (TextUtils.isEmpty(this.mEnterType)) {
            LogUtil.j(TAG, "mEnterType is null");
            return false;
        }
        LogUtil.d(TAG, "mDevicePid=", this.mDevicePid, " mEnterType=", this.mEnterType, " mDeviceType=", this.mDeviceType, " mDevicePin=", this.mDevicePin);
        return true;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LogUtil.a(TAG, BaseDialog.LIFE_CYCLE_ON_RESUME);
        emr.d().e(new CommonUiResponse() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BloodSugarIntroductionFragment$$ExternalSyntheticLambda0
            @Override // com.huawei.health.ecologydevice.open.data.model.CommonUiResponse
            public final void onResponse(int i, Object obj) {
                this.f$0.handleLastBloodSugarData(i, (HiHealthData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void handleLastBloodSugarData(int i, T t) {
        if (i != 0) {
            LogUtil.j(TAG, "Failed to handleLastBloodSugarData, errorCode=", Integer.valueOf(i));
            etn.e(this.mBloodSugarHandler, 103, (Object) null);
        } else {
            etn.e(this.mBloodSugarHandler, 102, t);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        BloodSugarHandler bloodSugarHandler = this.mBloodSugarHandler;
        if (bloodSugarHandler != null) {
            bloodSugarHandler.removeCallbacksAndMessages(null);
            this.mBloodSugarHandler = null;
        }
        ejo ejoVar = this.mRocheGlucoseManager;
        if (ejoVar != null) {
            ejoVar.d();
        }
        if (this.mBroadcastReceiver != null) {
            getContext().unregisterReceiver(this.mBroadcastReceiver);
        }
        handleCancel();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
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
        if (i == 1) {
            checkPermissions();
            return;
        }
        LogUtil.a(TAG, "onActivityResult else is" + i2);
    }

    private void handleUpdateProductMap() {
        LogUtil.a(TAG, "begin update product map");
        showDownloadView();
        sendEmptyDelayMessage(108, 30000L);
        efj.c().a(this.mKind.name(), this.mDevicePid, new DownloadDeviceInfoCallBack() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BloodSugarIntroductionFragment.2
            @Override // com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack
            public void onSuccess() {
                LogUtil.a(BloodSugarIntroductionFragment.TAG, "onSuccess");
                BloodSugarIntroductionFragment.this.refreshProductInfo();
                BloodSugarIntroductionFragment.this.removeMessage(108);
                BloodSugarIntroductionFragment.this.sendEmptyMessage(104);
            }

            @Override // com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack
            public void onFailure(int i) {
                LogUtil.a(BloodSugarIntroductionFragment.TAG, "onFailure");
            }

            @Override // com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack
            public void onNetworkError() {
                LogUtil.a(BloodSugarIntroductionFragment.TAG, "onNetworkError");
            }
        });
    }

    private void showDownloadView() {
        this.mDeviceBondStatus.setText(R.string.IDS_device_download_resource);
        this.mReBondLoadingPb.setVisibility(0);
        this.mReBondTv.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDownloadFail() {
        this.mDeviceBondStatus.setText(R.string.IDS_update_download_failed);
        this.mFirstConnectFailedTv.setVisibility(0);
        this.mFirstConnectFailedTv.setText(R.string.IDS_device_download_fail_tips);
        this.mReBondLoadingPb.setVisibility(8);
        this.mReBondTv.setVisibility(0);
        this.mReBondTv.setText(R.string.IDS_hwh_stressdialog_download_again);
        new etg.b().c(108).j(this.mProductId).b().c(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void judgingBluetoothOnOff() {
        BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
        if (bluetoothAdapter == null) {
            LogUtil.j(TAG, "no BT in this phone");
            finishFragment();
        } else if (!bluetoothAdapter.isEnabled() && !this.mIsBtEnableShowing) {
            this.mIsBtEnableShowing = true;
            eqw.e(getContext(), new IdialogButtonClickCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BloodSugarIntroductionFragment.3
                @Override // com.huawei.health.ecologydevice.callback.IdialogButtonClickCallback
                public void onClick(View view) {
                    PermissionDialogHelper.a(BloodSugarIntroductionFragment.this, 2);
                }

                @Override // com.huawei.health.ecologydevice.callback.IdialogButtonClickCallback
                public void onCancelClick(View view) {
                    BloodSugarIntroductionFragment.this.finishFragment();
                }
            });
        } else {
            checkPermissions();
        }
    }

    private void checkPermissions() {
        PermissionUtil.PermissionType permissionTypeC = PermissionDialogHelper.c();
        PermissionDialogHelper.e(getActivity(), permissionTypeC, new AnonymousClass4(this.mainActivity, permissionTypeC));
    }

    /* JADX INFO: renamed from: com.huawei.health.ecologydevice.ui.measure.fragment.BloodSugarIntroductionFragment$4, reason: invalid class name */
    class AnonymousClass4 extends CustomPermissionAction {
        final /* synthetic */ PermissionUtil.PermissionType val$permissionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Context context, PermissionUtil.PermissionType permissionType) {
            super(context);
            this.val$permissionType = permissionType;
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            if (this.val$permissionType != PermissionUtil.PermissionType.LOCATION || eru.a(BloodSugarIntroductionFragment.this.mainActivity)) {
                BloodSugarIntroductionFragment.this.sendEmptyDelayMessage(109, 500L);
            } else {
                LogUtil.a(BloodSugarIntroductionFragment.TAG, "Permission GpsClose is close");
                BloodSugarIntroductionFragment.this.openGpsLocation();
            }
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            super.onDenied(str);
            BloodSugarIntroductionFragment.this.finishFragment();
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            super.onForeverDenied(permissionType);
            qrs.c(BloodSugarIntroductionFragment.this.mainActivity, permissionType, (CustomTextAlertDialog) null, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BloodSugarIntroductionFragment$4$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m984xa2d9b65(view);
                }
            }, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BloodSugarIntroductionFragment$4$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m985x4fcede04(view);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onForeverDenied$0$com-huawei-health-ecologydevice-ui-measure-fragment-BloodSugarIntroductionFragment$4, reason: not valid java name */
        /* synthetic */ void m984xa2d9b65(View view) {
            BloodSugarIntroductionFragment.this.finishFragment();
        }

        /* JADX INFO: renamed from: lambda$onForeverDenied$1$com-huawei-health-ecologydevice-ui-measure-fragment-BloodSugarIntroductionFragment$4, reason: not valid java name */
        /* synthetic */ void m985x4fcede04(View view) {
            BloodSugarIntroductionFragment.this.finishFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openGpsLocation() {
        LogUtil.a(TAG, "openGpsLocation jump to GPS Setting");
        eqw.d(this.mainActivity, isAdded(), new IdialogButtonClickCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BloodSugarIntroductionFragment.5
            @Override // com.huawei.health.ecologydevice.callback.IdialogButtonClickCallback
            public void onClick(View view) {
                BloodSugarIntroductionFragment bloodSugarIntroductionFragment = BloodSugarIntroductionFragment.this;
                eru.b(bloodSugarIntroductionFragment, bloodSugarIntroductionFragment.isAdded(), 1);
            }

            @Override // com.huawei.health.ecologydevice.callback.IdialogButtonClickCallback
            public void onCancelClick(View view) {
                LogUtil.a(BloodSugarIntroductionFragment.TAG, "openGpsLocation onCancelClick");
                BloodSugarIntroductionFragment.this.finishFragment();
            }
        });
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
            return;
        }
        this.mProductInfo = elhVarD;
        if (((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isCorrectProductId(elhVarD.t())) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMessage(int i) {
        BloodSugarHandler bloodSugarHandler = this.mBloodSugarHandler;
        if (bloodSugarHandler != null) {
            bloodSugarHandler.removeMessages(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEmptyMessage(int i) {
        BloodSugarHandler bloodSugarHandler = this.mBloodSugarHandler;
        if (bloodSugarHandler != null) {
            bloodSugarHandler.sendEmptyMessage(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEmptyDelayMessage(int i, long j) {
        BloodSugarHandler bloodSugarHandler = this.mBloodSugarHandler;
        if (bloodSugarHandler != null) {
            bloodSugarHandler.sendEmptyMessageDelayed(i, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showLateBloodSugarData(HiHealthData hiHealthData) {
        LinearLayout linearLayout = this.mLastMeasureLayout;
        if (linearLayout == null || this.mMeasureLevelLayout == null) {
            LogUtil.j(TAG, "refreshBloodPressureData view is null");
            return;
        }
        if (hiHealthData == null) {
            showEmptyView();
            return;
        }
        linearLayout.setVisibility(0);
        this.mMeasureLevelLayout.setVisibility(0);
        this.mRightArrow.setVisibility(0);
        this.mTimePeriod.setVisibility(0);
        this.mLastMeasure.setText(R.string.IDS_hw_device_last_measurement);
        if (LanguageUtil.ba(this.mainActivity)) {
            this.mRightArrow.setImageResource(R.drawable.common_ui_arrow_left);
        } else {
            this.mRightArrow.setImageResource(R.drawable.common_ui_arrow_right);
        }
        setBloodSugarLevelTextAndColor(emq.c(BaseApplication.getContext(), hiHealthData.getType(), (float) hiHealthData.getDouble("point_value")));
        this.mLastMeasureDate.setText(qrk.f(hiHealthData.getStartTime()));
        this.mMeasureValue.setText(UnitUtil.e(hiHealthData.getDouble("point_value"), 1, 1));
        this.mTimePeriod.setText(emq.d(BigDecimal.valueOf(hiHealthData.getType()).intValue()));
    }

    private void setBloodSugarLevelTextAndColor(int i) {
        Resources resources = BaseApplication.getContext().getResources();
        switch (i) {
            case 1001:
                this.mMeasureValueLevel.setText(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_too_low));
                this.mMeasureValueLevel.setTextColor(resources.getColor(R.color.color_blood_low));
                break;
            case 1002:
                this.mMeasureValueLevel.setText(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_overall_low));
                this.mMeasureValueLevel.setTextColor(resources.getColor(R.color.color_blood_low));
                break;
            case 1003:
                this.mMeasureValueLevel.setText(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_overall_normal));
                this.mMeasureValueLevel.setTextColor(resources.getColor(R.color.color_blood_normal));
                break;
            case 1004:
                this.mMeasureValueLevel.setText(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_overall_high));
                this.mMeasureValueLevel.setTextColor(resources.getColor(R.color.color_blood_high));
                break;
            case 1005:
                this.mMeasureValueLevel.setText(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_too_high));
                this.mMeasureValueLevel.setTextColor(resources.getColor(R.color.color_blood_high));
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showEmptyView() {
        LinearLayout linearLayout = this.mLastMeasureLayout;
        if (linearLayout == null || this.mMeasureLevelLayout == null) {
            LogUtil.j(TAG, "refreshBloodPressureData view is null");
            return;
        }
        linearLayout.setVisibility(8);
        this.mMeasureLevelLayout.setVisibility(8);
        if (this.mKind == HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR) {
            this.mMeasureValue.setText("- -");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishFragment() {
        popupFragment(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showBondingView() {
        this.mDeviceBondStatus.setText(R.string.IDS_blite_guide_paire_opt_title);
        this.mFirstConnectFailedTv.setVisibility(8);
        this.mReBondTv.setVisibility(8);
        this.mReBondLoadingPb.setVisibility(0);
        setProductNameAndImage();
    }

    private void showBondedView() {
        if (isNeedLoadH5Page()) {
            bindDeviceAndLoadH5Page();
            return;
        }
        setProductNameAndImage();
        this.mDeviceMeasureValueLayout.setVisibility(0);
        this.mLastMeasureLayout.setClickable(true);
        this.mDeviceBondStatus.setText(R.string.IDS_user_profile_health_show_paried);
        this.mReBondTv.setVisibility(0);
        this.mReBondLoadingPb.setVisibility(8);
        this.mFirstConnectFailedTv.setVisibility(8);
        this.mReBondTv.setText(R.string.IDS_device_measureactivity_guide_start_measure);
        this.mReBondTv.setTextColor(getResources().getColor(R.color.card_device_view_color3));
    }

    private boolean isNeedLoadH5Page() {
        ProductMapInfo productMapInfoD = ProductMap.d(this.mDevicePid);
        if (productMapInfoD == null) {
            return false;
        }
        elh elhVarD = ResourceManager.c().d(productMapInfoD.f());
        this.mProductInfo = elhVarD;
        return BleConstants.BLE_THIRD_DEVICE_H5.equals(elhVarD.n().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadH5Page() {
        if (TextUtils.isEmpty(this.mDeviceMacAddress)) {
            MeasurableDevice bondedDeviceByBroadcastName = dmg.a().getBondedDeviceByBroadcastName(this.mProductId, this.mDeviceName);
            if (bondedDeviceByBroadcastName == null) {
                LogUtil.a(TAG, "measurableDevice is null");
                if (getActivity() != null) {
                    getActivity().finish();
                    return;
                }
                return;
            }
            this.mDeviceMacAddress = bondedDeviceByBroadcastName.getUniqueId();
        }
        if ("1".equals(this.mProductInfo.g())) {
            etn.c(getContext(), this.mProductInfo, this.mProductId, this.mDeviceMacAddress);
        } else {
            Intent intentB = etn.b(this.mProductInfo, this.mProductId, this.mDeviceMacAddress);
            if (intentB != null && getContext() != null) {
                intentB.putExtra("url", elg.e().e(this.mProductId) + "?enterType=" + this.mEnterType);
                iov.d(getContext(), intentB);
            }
        }
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    private void bindDeviceAndLoadH5Page() {
        ((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).bindDevice(this.mProductId, this.mProductInfo.q(), this.mDevice, new IDeviceEventHandler() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BloodSugarIntroductionFragment.6
            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onDeviceFound(HealthDevice healthDevice) {
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onScanFailed(int i) {
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onStateChanged(int i) {
                if (i == 7) {
                    LogUtil.a(BloodSugarIntroductionFragment.TAG, "PAIRING PASSED");
                    BloodSugarIntroductionFragment.this.loadH5Page();
                    etg.d(BloodSugarIntroductionFragment.this.mProductId, BloodSugarIntroductionFragment.this.mDeviceMacAddress, BloodSugarIntroductionFragment.this.mDeviceMacAddress);
                }
            }
        });
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
                showInputPinTipsDialog();
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showInputPinTipsDialog() {
        try {
            BluetoothDevice bluetoothDevice = this.mBluetoothDevice;
            if (bluetoothDevice != null && bluetoothDevice.getBondState() == 12) {
                showBondedView();
                return;
            }
            if (!TextUtils.isEmpty(this.mDevicePin)) {
                this.mBroadcastReceiver = new BroadcastReceiver() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BloodSugarIntroductionFragment.7
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                        abortBroadcast();
                        if (bluetoothDevice2 != null) {
                            try {
                                bluetoothDevice2.setPin(BloodSugarIntroductionFragment.this.mDevicePin.getBytes("UTF-8"));
                            } catch (UnsupportedEncodingException unused) {
                                LogUtil.e(BloodSugarIntroductionFragment.TAG, "encode UnsupportedEncodingException");
                            }
                        }
                    }
                };
                getContext().registerReceiver(this.mBroadcastReceiver, new IntentFilter("android.bluetooth.device.action.PAIRING_REQUEST"));
            }
            ejo ejoVar = this.mRocheGlucoseManager;
            if (ejoVar != null) {
                ejoVar.c();
            }
        } catch (SecurityException e) {
            LogUtil.e(TAG, "showInputPinTipsDialog SecurityException:", ExceptionUtils.c(e));
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
            builder.b(R.string.IDS_device_wifi_bind_fail).d(viewInflate).d(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BloodSugarIntroductionFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m983x6fc3f385(view);
                }
            });
            CustomViewDialog customViewDialogD = builder.d();
            this.mDialogForConnectFail = customViewDialogD;
            customViewDialogD.setCancelable(false);
        }
        this.mDialogForConnectFail.show();
    }

    /* JADX INFO: renamed from: lambda$showConnectFailDialog$0$com-huawei-health-ecologydevice-ui-measure-fragment-BloodSugarIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m983x6fc3f385(View view) {
        LogUtil.a(TAG, "showConnectionNoteDialog onclick PositiveButton");
        finishFragment();
    }

    private void reDownloadResource() {
        if (CommonUtil.ab(BaseApplication.getContext())) {
            showDownloadView();
            sendEmptyDelayMessage(108, 30000L);
            handleUpdateProductMap();
            return;
        }
        showDownloadFail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scanDevice() {
        if (this.mRocheGlucoseManager != null) {
            this.mStartConnectTime = System.currentTimeMillis();
            this.mRocheGlucoseManager.a();
        }
    }

    private Bitmap getProductImage() {
        String strD;
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        if (elhVarD != null && elhVarD.d().size() > 0) {
            strD = elg.e().d(this.mProductId, elhVarD.d().get(0).d());
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
        this.mDeviceImage.setImageBitmap(getProductImage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tickBiNfcConnectBloodSugar(Context context, double d, int i, int i2) {
        new etg.b().e(d).d(this.mProductId).b(this.mDeviceType).a(this.mEnterType).d(i2).j(this.mProductId).a(i).b().c(context);
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
                judgingBluetoothOnOff();
                return;
            } else if (this.mReBondTv.getText().toString().equals(getResources().getString(R.string.IDS_hwh_stressdialog_download_again))) {
                this.mFirstConnectFailedTv.setVisibility(8);
                reDownloadResource();
                return;
            } else {
                LogUtil.j(TAG, "not have this view");
                return;
            }
        }
        if (view == this.mLastMeasureLayout) {
            Intent intent = new Intent();
            intent.setPackage(dmz.y);
            intent.setClassName(dmz.y, "com.huawei.ui.main.stories.health.activity.healthdata.BloodSugarHistoryActivity");
            startActivity(intent);
            return;
        }
        LogUtil.j(TAG, "click is other view");
    }

    static class BloodSugarHandler extends Handler {
        private final WeakReference<BloodSugarIntroductionFragment> mWeakReference;

        private BloodSugarHandler(BloodSugarIntroductionFragment bloodSugarIntroductionFragment) {
            super(Looper.myLooper());
            this.mWeakReference = new WeakReference<>(bloodSugarIntroductionFragment);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            BloodSugarIntroductionFragment bloodSugarIntroductionFragment = this.mWeakReference.get();
            if (bloodSugarIntroductionFragment == null || !bloodSugarIntroductionFragment.isAdded() || bloodSugarIntroductionFragment.isRemoving() || bloodSugarIntroductionFragment.isDetached()) {
                return;
            }
            switch (message.what) {
                case 102:
                    LogUtil.d(BloodSugarIntroductionFragment.TAG, "UPDATE_BLOOD_SUGAR_DATA");
                    if (message.obj instanceof HiHealthData) {
                        bloodSugarIntroductionFragment.showLateBloodSugarData((HiHealthData) message.obj);
                    }
                    break;
                case 103:
                    LogUtil.d(BloodSugarIntroductionFragment.TAG, "UPDATE_DATA_EMPTY");
                    bloodSugarIntroductionFragment.showEmptyView();
                    break;
                case 104:
                    LogUtil.d(BloodSugarIntroductionFragment.TAG, "DOWNLOAD_RESOURCE_SUCCESS");
                    removeMessages(108);
                    if (!bloodSugarIntroductionFragment.needUpdateAppVersion()) {
                        bloodSugarIntroductionFragment.showBondingView();
                        bloodSugarIntroductionFragment.judgingBluetoothOnOff();
                        break;
                    }
                    break;
                case 105:
                default:
                    LogUtil.j(BloodSugarIntroductionFragment.TAG, "not have this case: ", Integer.valueOf(message.what));
                    break;
                case 106:
                    LogUtil.d(BloodSugarIntroductionFragment.TAG, "STATE_CHANGED");
                    bloodSugarIntroductionFragment.showDeviceCurrentState();
                    break;
                case 107:
                    bloodSugarIntroductionFragment.showInputPinTipsDialog();
                    break;
                case 108:
                    bloodSugarIntroductionFragment.handleCancel();
                    bloodSugarIntroductionFragment.showDownloadFail();
                    break;
                case 109:
                    bloodSugarIntroductionFragment.scanDevice();
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean needUpdateAppVersion() {
        VersionVerifyUtilApi versionVerifyUtilApi = (VersionVerifyUtilApi) Services.b("PluginDevice", VersionVerifyUtilApi.class);
        if (!pip.f45449c.containsKey(this.mKind.name()) || versionVerifyUtilApi.isPublishVersion(this.mProductId, this.mKind.name())) {
            return false;
        }
        LogUtil.a(TAG, "current device needs to update the app version, mProductId = ", this.mProductId);
        versionVerifyUtilApi.noSupportDevice(getContext(), getActivity());
        return true;
    }
}
