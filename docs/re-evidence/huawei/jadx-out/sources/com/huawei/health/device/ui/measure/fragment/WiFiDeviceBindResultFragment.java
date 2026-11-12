package com.huawei.health.device.ui.measure.fragment;

import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.AnimationDrawable;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.device.wifi.interfaces.DeviceCallBack;
import com.huawei.health.device.wifi.interfaces.ScanDeviceCallback;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.health.device.wifi.manager.DeviceRegisterManager;
import com.huawei.health.ecologydevice.connectivity.ScanFilter;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.ProductIntroductionFragment;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.RegisterInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceUnbindReq;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dmp;
import defpackage.drk;
import defpackage.drw;
import defpackage.dxm;
import defpackage.dxw;
import defpackage.dyg;
import defpackage.dyj;
import defpackage.ean;
import defpackage.ebh;
import defpackage.ebi;
import defpackage.ebv;
import defpackage.eby;
import defpackage.ecj;
import defpackage.ecq;
import defpackage.ect;
import defpackage.ecx;
import defpackage.elh;
import defpackage.etn;
import defpackage.lqo;
import defpackage.qrs;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ohos.ace.adapter.capability.web.WebDataBaseColumns;

/* JADX INFO: loaded from: classes7.dex */
public class WiFiDeviceBindResultFragment extends BaseFragment implements View.OnClickListener {
    private static final int ANIMATION_DURATION = 1000;
    private static final int ANIMATION_END_VALUE = 3;
    private static final int DEVICE_WORK_TIMEOUT = 180000;
    private static final int FAIL_REGISTER_FOUR = 4;
    private static final int FAIL_REGISTER_ONE = 1;
    private static final int FAIL_REGISTER_THREE = 3;
    private static final int FAIL_REGISTER_TWO = 2;
    private static final int FAIL_SOFTAP_ONE = 1;
    private static final int FAIL_SOFTAP_THREE = 3;
    private static final int FAIL_SOFTAP_TWO = 2;
    private static final int IMAGE_LAYOUT_OF_SCREEN = 3;
    private static final int INIT_MULTCAST_ONE = 1;
    private static final int INIT_MULTCAST_TWO = 2;
    private static final int INIT_SOFTAP_VALUE = 1;
    private static final int MSG_DEVICE_BLE_CONFIG_NETWORK = 16;
    private static final int MSG_DEVICE_START_CONFIG = 15;
    private static final int MSG_DEVICE_WORK_SET_UNIT = 12;
    private static final int MSG_DEVICE_WORK_STATUS_BINDING = 13;
    private static final int MSG_DEVICE_WORK_STATUS_FAIL = 5;
    private static final int MSG_DEVICE_WORK_STATUS_INIT = 14;
    private static final int MSG_DEVICE_WORK_STATUS_PAIR_STATUS = 7;
    private static final int MSG_DEVICE_WORK_STATUS_START = 4;
    private static final int MSG_DEVICE_WORK_STATUS_SUCCESS = 6;
    private static final int MSG_DEVICE_WORK_STATUS_TIMEOUT = 8;
    private static final int PAIR_REGISTER_VALUE = 2;
    private static final int REQUEST_CODE_FOR_UNBIND = 101;
    private static final int RESULT_CODE_FOR_UNBIND = 102;
    private static final int SCAN_COUNT = 2;
    private static final String TAG = "WiFiDeviceBindResultFragment";
    private static String mUniqueId;
    private ebv mAddDeviceInfo;
    private ecq mAddDeviceManager;
    private AnimationDrawable mAnimation;
    private DeviceCallBack mBaseCallback;
    private LinearLayout mBindFailBtn;
    private LinearLayout mBindFailLayout;
    private LinearLayout mBindFailLayoutButton;
    private HealthTextView mBindFailText;
    private LinearLayout mBindRetryBtn;
    private LinearLayout mBindSuccessLayout;
    private LinearLayout mBindSuccessLayoutButton;
    private LinearLayout mBindingLayout;
    private WiFiDeviceBindResultFragment mContext;
    private String mDeviceId;
    private ContentValues mDeviceInfo;
    private LinearLayout mDevicePairResultImageLayout;
    private float mDeviceWeight;
    private NoTitleCustomAlertDialog mDialog;
    private ImageView mErrorImg;
    private HealthTextView mFailNext;
    private MyHandler mHandler;
    private boolean mIsHagrid;
    private String mOuthName;
    private String mOuthPwd;
    private HealthTextView mPairingStage;
    private HealthTextView mPairingStageAnim;
    private String mProductId;
    private elh mProductInfo;
    private ImageView mProgressView;
    private ScanCallback mScanCallback;
    private ecx mScanManager;
    private String mSerialNumber;
    private String mTitle;
    private HealthButton mUserInfoBtn;
    private ValueAnimator mValueAnimator;
    private int mConfigMode = -1;
    private int mCurrentStatus = 14;
    private String[] mStageLoadingList = {".", "..", "..."};
    private boolean mIsBleScale = false;
    private boolean isHonourDevice = false;
    private boolean mIsGotoUserInfoActivity = false;

    static class MyHandler extends StaticHandler<WiFiDeviceBindResultFragment> {
        MyHandler(WiFiDeviceBindResultFragment wiFiDeviceBindResultFragment) {
            super(wiFiDeviceBindResultFragment);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        public void handleMessage(WiFiDeviceBindResultFragment wiFiDeviceBindResultFragment, Message message) {
            if (message == null) {
                LogUtil.j(WiFiDeviceBindResultFragment.TAG, "msg is null.");
                return;
            }
            if (wiFiDeviceBindResultFragment == null) {
                LogUtil.j(WiFiDeviceBindResultFragment.TAG, "object is null.");
                return;
            }
            LogUtil.a(WiFiDeviceBindResultFragment.TAG, "DeviceBind MyHandler what:", Integer.valueOf(message.what));
            if (wiFiDeviceBindResultFragment.isDestroy()) {
                return;
            }
            int i = message.arg1;
            wiFiDeviceBindResultFragment.mConfigMode = i;
            LogUtil.a(WiFiDeviceBindResultFragment.TAG, "DeviceBind MyHandler what:", Integer.valueOf(message.what), ", configMode: ", Integer.valueOf(i));
            int i2 = message.what;
            if (i2 == 4) {
                LogUtil.d(WiFiDeviceBindResultFragment.TAG, "msg ", "DEVICE_WORK_STATUS_START");
                wiFiDeviceBindResultFragment.mScanManager.d();
                wiFiDeviceBindResultFragment.updateStatus(i, 14);
                wiFiDeviceBindResultFragment.startConfigNetWork(wiFiDeviceBindResultFragment.mOuthName, wiFiDeviceBindResultFragment.mOuthPwd, wiFiDeviceBindResultFragment.mAddDeviceInfo);
                return;
            }
            if (i2 != 5) {
                if (i2 == 6) {
                    removeMessages(8);
                    wiFiDeviceBindResultFragment.setBiWifiDeviceBindSuccessCount();
                    wiFiDeviceBindResultFragment.updateStatus(i, 6);
                    return;
                } else if (i2 != 8) {
                    processHandler(wiFiDeviceBindResultFragment, message, i);
                    return;
                }
            }
            removeMessages(8);
            LogUtil.a(WiFiDeviceBindResultFragment.TAG, "MSG_DEVICE_WORK_STATUS_FAIL", ",errorCode:", Integer.valueOf(message.arg2));
            wiFiDeviceBindResultFragment.updateStatus(i, 5);
            if (wiFiDeviceBindResultFragment.mAddDeviceManager != null) {
                wiFiDeviceBindResultFragment.mAddDeviceManager.e();
            }
            if (wiFiDeviceBindResultFragment.mScanManager != null) {
                wiFiDeviceBindResultFragment.mScanManager.d();
            }
        }

        private void processHandler(WiFiDeviceBindResultFragment wiFiDeviceBindResultFragment, Message message, int i) {
            int i2 = message.what;
            LogUtil.a(WiFiDeviceBindResultFragment.TAG, "processHandler what:", Integer.valueOf(i2));
            if (i2 == 7) {
                if (message.arg2 == 2212) {
                    i = 3;
                }
                wiFiDeviceBindResultFragment.updateStatus(i, 7);
                return;
            }
            if (i2 == 12) {
                ean.d(wiFiDeviceBindResultFragment.mainActivity);
                return;
            }
            if (i2 == 13) {
                wiFiDeviceBindResultFragment.processingLogicEvent(i, 13, message.obj);
                return;
            }
            if (i2 == 15) {
                wiFiDeviceBindResultFragment.startConfig();
                return;
            }
            if (i2 == 16) {
                if (message.obj == null) {
                    LogUtil.e(WiFiDeviceBindResultFragment.TAG, "obj is null or obj is not instance WifiDevice");
                    return;
                }
                if (message.obj instanceof RegisterInfo) {
                    RegisterInfo registerInfo = (RegisterInfo) message.obj;
                    if (drk.b(WiFiDeviceBindResultFragment.mUniqueId, 24)) {
                        wiFiDeviceBindResultFragment.sendConfigInfoForHag2021(registerInfo);
                        return;
                    } else {
                        wiFiDeviceBindResultFragment.sendConfigInfo(registerInfo);
                        return;
                    }
                }
                return;
            }
            LogUtil.j(WiFiDeviceBindResultFragment.TAG, "message default");
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a(TAG, "onCreate");
        this.mHandler = new MyHandler(this);
        this.mContext = this;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a(TAG, "onCreateView");
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        this.child = layoutInflater.inflate(R.layout.device_wifi_bind_result_layout, viewGroup, false);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
        }
        initView();
        initData();
        initListener();
        if (this.mIsBleScale) {
            this.mHandler.removeCallbacksAndMessages(null);
            updateStatus(this.mConfigMode, 6);
        }
        return viewGroup2;
    }

    private void initView() {
        this.mBindingLayout = (LinearLayout) this.child.findViewById(R.id.id_device_wifi_binding_layout);
        this.mBindSuccessLayout = (LinearLayout) this.child.findViewById(R.id.id_device_bind_success_layout);
        this.mBindFailLayout = (LinearLayout) this.child.findViewById(R.id.id_device_bind_fail_layout);
        this.mBindSuccessLayoutButton = (LinearLayout) this.child.findViewById(R.id.id_device_bind_success_button);
        this.mBindFailLayoutButton = (LinearLayout) this.child.findViewById(R.id.id_device_bind_fail_button);
        this.mUserInfoBtn = (HealthButton) this.child.findViewById(R.id.id_btn_consum_userinfo);
        this.mFailNext = (HealthTextView) this.child.findViewById(R.id.wifi_device_bind_fail_next);
        this.mBindRetryBtn = (LinearLayout) this.child.findViewById(R.id.id_btn_retry);
        this.mBindFailBtn = (LinearLayout) this.child.findViewById(R.id.id_btn_bind_fail);
        this.mBindFailText = (HealthTextView) this.child.findViewById(R.id.id_tv_bind_fail);
        this.mPairingStage = (HealthTextView) this.child.findViewById(R.id.IDS_device_wifi_binding_promt_tv);
        this.mPairingStageAnim = (HealthTextView) this.child.findViewById(R.id.IDS_device_wifi_binding_promt_anim);
        this.mErrorImg = (ImageView) this.child.findViewById(R.id.pair_result_device_show_img);
        this.mDevicePairResultImageLayout = (LinearLayout) this.child.findViewById(R.id.pair_result_device_image_layout);
        ImageView imageView = (ImageView) this.child.findViewById(R.id.device_pair_guide_progress_anim);
        this.mProgressView = imageView;
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            this.mAnimation = (AnimationDrawable) this.mProgressView.getDrawable();
        }
        this.mAnimation.start();
        this.mErrorImg.setVisibility(8);
        setTitle(getResources().getString(R.string.IDS_device_mgr_device_pair_guide_note));
        boolean zBa = LanguageUtil.ba(BaseApplication.getContext());
        ImageView imageView2 = (ImageView) this.child.findViewById(R.id.wifi_binde_device_next_img);
        ImageView imageView3 = (ImageView) this.child.findViewById(R.id.wifi_device_bind_retry_img);
        imageView2.setBackgroundResource(zBa ? R.drawable.wifi_device_arrow_right : R.drawable.wifi_device_arrow_left);
        imageView3.setBackgroundResource(zBa ? R.drawable.wifi_device_arrow_left : R.drawable.wifi_device_arrow_right);
        refreshDevicePairResultLayout();
    }

    private void initListener() {
        this.mUserInfoBtn.setOnClickListener(this);
        this.mBindRetryBtn.setOnClickListener(this);
        this.mBindFailBtn.setOnClickListener(this);
    }

    private void initData() {
        if (getArguments() != null) {
            ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
            this.mDeviceInfo = contentValues;
            if (contentValues != null) {
                this.mProductId = contentValues.getAsString("productId");
                mUniqueId = this.mDeviceInfo.getAsString("uniqueId");
            }
            if (TextUtils.isEmpty(this.mProductId) || TextUtils.isEmpty(mUniqueId)) {
                LogUtil.j(TAG, "initData mProductId or mUniqueId is empty");
            }
            this.mOuthName = getArguments().getString("outhName");
            this.mOuthPwd = getArguments().getString("outhPd");
            this.mIsBleScale = getArguments().getBoolean("isBleScale");
            this.mDeviceWeight = getArguments().getFloat("deviceWeight");
            this.mTitle = getArguments().getString("title");
            this.isHonourDevice = getArguments().getBoolean("isHonourDevice");
            this.mIsHagrid = getArguments().getBoolean("isHygirde");
            Serializable serializable = getArguments().getSerializable("add_device_info");
            if (serializable instanceof ebv) {
                this.mAddDeviceInfo = (ebv) serializable;
            }
            this.mConfigMode = getArguments().getInt("config_mode", 1);
        }
        this.mProductInfo = ResourceManager.c().d(this.mProductId);
        this.mAddDeviceManager = ecq.c(dxw.d());
        this.mBaseCallback = new NetWorkCallback(this);
        this.mScanManager = ecx.d(this.mainActivity);
        this.mScanCallback = new ScanCallback(this);
        Message messageObtain = Message.obtain();
        messageObtain.what = 8;
        messageObtain.arg1 = this.mConfigMode;
        this.mHandler.sendMessageDelayed(messageObtain, 180000L);
    }

    private void startScanDevice() {
        if (checkHavePermission()) {
            elh elhVar = this.mProductInfo;
            if (elhVar != null) {
                this.mScanManager.d(elhVar, 2, this.mScanCallback);
            } else {
                LogUtil.j(TAG, "startScan Get device information is fail");
            }
        }
    }

    private boolean checkHavePermission() {
        Object systemService = this.mainActivity.getSystemService("location");
        if (!(systemService instanceof LocationManager)) {
            LogUtil.j(TAG, "checkHavePermission objLocationManager is not instanceof LocationManager");
            return false;
        }
        if (ecj.e(this.mainActivity, (LocationManager) systemService)) {
            return true;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.mDialog;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            return false;
        }
        String string = getResources().getString(R.string.IDS_device_wifi_gps_service_prompt_msg);
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.mainActivity);
        builder.a(string);
        builder.c(R.string.IDS_common_enable_button, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiDeviceBindResultFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a(WiFiDeviceBindResultFragment.TAG, "showGpsDialog():click setting button");
                Intent intent = new Intent();
                intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
                try {
                    ecj.e(WiFiDeviceBindResultFragment.this.mainActivity, intent);
                } catch (ActivityNotFoundException unused) {
                    intent.setAction("android.settings.SETTINGS");
                    try {
                        ecj.e(WiFiDeviceBindResultFragment.this.mainActivity, intent);
                    } catch (Exception unused2) {
                        LogUtil.j(WiFiDeviceBindResultFragment.TAG, "checkHavePermission occurred startActivity exception");
                    }
                }
            }
        });
        builder.a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiDeviceBindResultFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WiFiDeviceBindResultFragment.this.release();
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.mDialog = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.mDialog.show();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        LogUtil.a(TAG, "onStart: ", Integer.valueOf(this.mCurrentStatus));
        super.onStart();
        Message messageObtain = Message.obtain();
        messageObtain.what = 15;
        messageObtain.arg1 = this.mConfigMode;
        this.mHandler.sendMessage(messageObtain);
    }

    private void unBindDevice(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "unBindDevice deviceid is empty");
            return;
        }
        WifiDeviceUnbindReq wifiDeviceUnbindReq = new WifiDeviceUnbindReq();
        wifiDeviceUnbindReq.setDevId(str);
        LogUtil.a(TAG, "unBindDevice :", dyg.b(str));
        lqo.b(dxw.d()).e(wifiDeviceUnbindReq, new ICloudOperationResult<CloudCommonReponse>() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiDeviceBindResultFragment.3
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public void operationResult(CloudCommonReponse cloudCommonReponse, String str2, boolean z) {
                int iIntValue;
                String resultDesc;
                LogUtil.a(WiFiDeviceBindResultFragment.TAG, "unBindDevice :", Boolean.valueOf(z));
                if (z) {
                    return;
                }
                if (cloudCommonReponse == null) {
                    iIntValue = Constants.CODE_UNKNOWN_ERROR;
                    resultDesc = "unknown error";
                } else {
                    iIntValue = cloudCommonReponse.getResultCode().intValue();
                    resultDesc = cloudCommonReponse.getResultDesc();
                }
                if (iIntValue != 112000000) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 5;
                    messageObtain.arg1 = WiFiDeviceBindResultFragment.this.mConfigMode;
                    WiFiDeviceBindResultFragment.this.mHandler.sendMessage(messageObtain);
                }
                LogUtil.a(WiFiDeviceBindResultFragment.TAG, " unBindDevice error:", Integer.valueOf(iIntValue), ",resultDesc:", resultDesc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startConfig() {
        if (this.mCurrentStatus == 14) {
            int i = this.mConfigMode;
            if (i == 1) {
                updateStatus(i, 14);
                startScanDevice();
            } else {
                if (i == 2 || i == 5) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 4;
                    messageObtain.arg1 = this.mConfigMode;
                    this.mHandler.sendMessage(messageObtain);
                    return;
                }
                LogUtil.j(TAG, " startConfig configMode: ", Integer.valueOf(i));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LogUtil.a(TAG, "onclick ID", Integer.valueOf(view.getId()));
        if (view.getId() == R.id.id_btn_consum_userinfo) {
            this.mIsGotoUserInfoActivity = true;
            if (this.mIsBleScale) {
                onClickBleScaleUserInfo();
                return;
            } else {
                onClickUserInfo();
                return;
            }
        }
        if (view.getId() == R.id.id_btn_retry) {
            onClickRetry();
        } else if (view.getId() == R.id.id_btn_bind_fail) {
            onBackPressed();
        } else {
            LogUtil.j(TAG, "onclick else");
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.mIsGotoUserInfoActivity) {
            if (this.mIsBleScale) {
                if (this.mainActivity instanceof DeviceMainActivity) {
                    ((DeviceMainActivity) this.mainActivity).d(true);
                }
                jumpToHonourDeviceFragment();
            } else {
                if (ect.c(this.mProductId) && dxm.ad(this.mProductId)) {
                    if (this.mainActivity instanceof DeviceMainActivity) {
                        ((DeviceMainActivity) this.mainActivity).d(true);
                    }
                    toDeviceManageFragment();
                    return;
                }
                popupFragment(WiFiProductIntroductionFragment.class);
            }
        }
    }

    private void onClickBleScaleUserInfo() {
        LogUtil.a(TAG, "onClickBleScaleUserInfo");
        if (this.mContext != null) {
            Intent intent = new Intent();
            intent.putExtra("device", "wifi");
            intent.putExtra("isBleScale", this.mIsBleScale);
            intent.putExtra("productId", this.mProductId);
            intent.putExtra("deviceWeight", this.mDeviceWeight);
            ContentValues contentValues = new ContentValues();
            contentValues.put("productId", this.mProductId);
            if ("7a1063dd-0e0f-4a72-9939-461476ff0259".equals(this.mProductId) || "34fa0346-d46c-439d-9cb0-2f696618846b".equals(this.mProductId) || "33123f39-7fc1-420b-9882-a4b0d6c61100".equals(this.mProductId) || "ccd1f0f8-8c57-4bd7-a884-0ef38482f15f".equals(this.mProductId)) {
                contentValues.put("uniqueId", mUniqueId);
            } else {
                contentValues.put("uniqueId", this.mDeviceId);
            }
            intent.putExtra("commonDeviceInfo", contentValues);
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.ui.main.stories.me.activity.BindUserInfoActivity");
            this.mContext.startActivityForResult(intent, 101);
        }
    }

    private void onClickUserInfo() {
        LogUtil.a(TAG, "onClickUserInfo");
        if (this.mContext != null) {
            Intent intent = new Intent();
            intent.putExtra("device", "wifi");
            intent.putExtra("productId", this.mProductId);
            intent.putExtra("auth_device_id", this.mDeviceId);
            intent.putExtra("sn", this.mSerialNumber);
            LogUtil.a(TAG, "onClickUserInfo mSerialNumber:", dyg.b(this.mSerialNumber));
            ContentValues contentValues = new ContentValues();
            contentValues.put("productId", this.mProductId);
            contentValues.put("uniqueId", this.mDeviceId);
            intent.putExtra("commonDeviceInfo", contentValues);
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.ui.main.stories.me.activity.BindUserInfoActivity");
            this.mContext.startActivity(intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 101 && i2 == 102) {
            popupFragment(null);
        }
    }

    private void onClickRetry() {
        LogUtil.a(TAG, "onClickRetry");
        popupFragment(WiFiInfoConfirmFragment.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateStatus(int i, int i2) {
        this.mCurrentStatus = i2;
        LogUtil.a(TAG, "updateStatus：", Integer.valueOf(i2), ", configMode:", Integer.valueOf(i));
        if (i2 == 7) {
            setTitle(getResources().getString(R.string.IDS_device_mgr_device_pair_guide_note));
            this.mBindingLayout.setVisibility(0);
            this.mBindSuccessLayout.setVisibility(8);
            this.mBindFailLayout.setVisibility(8);
            if (i == 3) {
                showStage(getResources().getString(R.string.IDS_device_wifi_binding_stage3, UnitUtil.e(2.0d, 1, 0), UnitUtil.e(2.0d, 1, 0)));
                return;
            }
            return;
        }
        if (i2 == 5) {
            setTitle(getResources().getString(R.string.IDS_device_wifi_bind_fail));
            this.mBindingLayout.setVisibility(8);
            this.mBindSuccessLayout.setVisibility(8);
            this.mBindFailLayout.setVisibility(0);
            this.mBindFailLayoutButton.setVisibility(0);
            this.mErrorImg.setVisibility(0);
            this.mErrorImg.setImageResource(R.drawable.ic_health_equipment_bind_failed);
            this.mFailNext.setText(R.string.IDS_settings_button_cancal);
            if (i == 1 || i == 3) {
                handleMultcastOrRegisterMode();
            } else if (i == 2) {
                handleSoftApMode();
            } else {
                LogUtil.j(TAG, "updateStatus MSG_DEVICE_WORK_STATUS_FAIL default");
            }
            ValueAnimator valueAnimator = this.mValueAnimator;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            AnimationDrawable animationDrawable = this.mAnimation;
            if (animationDrawable != null) {
                animationDrawable.stop();
            }
            this.mProgressView.setImageResource(R.mipmap.bluetooth_guide_pairing_link_line3);
            this.mProgressView.setVisibility(0);
            return;
        }
        processOtherBindType(i, i2);
    }

    private void processOtherBindType(int i, int i2) {
        if (i2 != 6) {
            if (i2 != 14) {
                LogUtil.j(TAG, "updateStatus default");
                return;
            }
            if (i == 1) {
                showStage(getResources().getString(R.string.IDS_device_wifi_binding_stage2, UnitUtil.e(1.0d, 1, 0), UnitUtil.e(2.0d, 1, 0)));
                return;
            } else if (i != 2) {
                LogUtil.j(TAG, "updateStatus MSG_DEVICE_WORK_STATUS_INIT default");
                return;
            } else {
                this.mPairingStage.setText(getResources().getString(R.string.IDS_device_wifi_binding_stage2, UnitUtil.e(1.0d, 1, 0), UnitUtil.e(1.0d, 1, 0)));
                return;
            }
        }
        setTitle(getResources().getString(R.string.IDS_blite_guide_paire_completed));
        this.mBindingLayout.setVisibility(8);
        this.mBindSuccessLayout.setVisibility(0);
        this.mBindSuccessLayoutButton.setVisibility(0);
        this.mBindFailLayout.setVisibility(8);
        this.mErrorImg.setVisibility(0);
        this.mErrorImg.setImageResource(R.drawable.device_jabra_bind_success_icon);
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        AnimationDrawable animationDrawable = this.mAnimation;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
        this.mProgressView.setImageResource(R.mipmap.bluetooth_guide_pairing_link_line3);
        this.mProgressView.setVisibility(0);
    }

    private void handleSoftApMode() {
        this.mBindFailText.setText(new SpannableStringBuilder(getResources().getString(R.string.IDS_device_wifi_bind_fail_title) + System.lineSeparator() + String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_device_wifi_bind_manual_fail_prompt_1), UnitUtil.e(1.0d, 1, 0)) + System.lineSeparator() + String.format(Locale.ENGLISH, qrs.d((Context) this.mainActivity, R.string.IDS_device_wifi_bind_auto_fail_prompt_2), UnitUtil.e(2.0d, 1, 0)) + System.lineSeparator() + getResources().getString(R.string.IDS_device_wifi_bound_device_inconsistent, 3)));
        this.mFailNext.setText(R.string.IDS_device_wifi_bind_auto);
    }

    private void handleMultcastOrRegisterMode() {
        this.mBindFailText.setText(new SpannableStringBuilder(getResources().getString(R.string.IDS_device_wifi_bind_fail_title) + System.lineSeparator() + String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_device_wifi_pair_fail_1), UnitUtil.e(1.0d, 1, 0)) + System.lineSeparator() + String.format(Locale.ENGLISH, qrs.d((Context) this.mainActivity, R.string.IDS_device_wifi_pair_fail_2), UnitUtil.e(2.0d, 1, 0)) + System.lineSeparator() + String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_device_wifi_pair_fail_3), UnitUtil.e(3.0d, 1, 0)) + System.lineSeparator() + getResources().getString(R.string.IDS_device_wifi_bound_device_inconsistent, 4)));
        this.mFailNext.setText(R.string.IDS_settings_button_cancal);
    }

    private boolean compareDevice(ScanFilter scanFilter, String str) {
        if (scanFilter == null || TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "compareDevice scanFilter is null || TextUtils.isEmpty(productId)");
            return false;
        }
        if (scanFilter.b(str)) {
            return true;
        }
        LogUtil.j(TAG, "compareDevice productId error: ", str);
        return false;
    }

    private boolean isBindSuccess(eby ebyVar) {
        if (this.mAddDeviceInfo != null) {
            return true;
        }
        elh elhVar = this.mProductInfo;
        if (elhVar == null || ebyVar == null) {
            LogUtil.j(TAG, "isBindSuccess proid is null or mDevice is null: ", Boolean.valueOf(ebyVar != null));
            return false;
        }
        return compareDevice(elhVar.x(), ebyVar.a().h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendConfigInfoForHag2021(RegisterInfo registerInfo) {
        this.mAddDeviceInfo.c(registerInfo.getDevId());
        HashMap map = new HashMap(16);
        map.put("ssid", this.mOuthName);
        map.put(WebDataBaseColumns.EntryColumns.COLUMN_NAME_USERPASS, this.mOuthPwd);
        map.put("devId", registerInfo.getDevId());
        map.put("psk", registerInfo.getPsk());
        map.put("code", registerInfo.getVerifyCode());
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("hilinkDevicePrimaryCloudUrl");
        map.put("cloudPrimaryUrl", url);
        String url2 = GRSManager.c(BaseApplication.getContext()).getUrl("hilinkDeviceStandbyCloudUrl");
        map.put("cloudStandbyUrl", url2);
        String url3 = GRSManager.c(BaseApplication.getContext()).getUrl("healthAPPToDeviceUrl");
        map.put("cloudUrl", url3);
        LogUtil.a(TAG, "sendConfigInfo ssid=", dyg.b(this.mOuthName), ", ssidPwd=", dyg.b(this.mOuthPwd), ", cloudPrimaryUrl=", url, ", cloudStandbyUrl=", url2, ", cloudUrl=", url3);
        String json = new Gson().toJson(map);
        Bundle bundle = new Bundle();
        bundle.putString("configjson", json);
        EventBus.a(new EventBus.d("send_config_info_hag_2021", bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendConfigInfo(RegisterInfo registerInfo) {
        ebi ebiVar = new ebi();
        ebiVar.d(registerInfo.getDevId());
        this.mAddDeviceInfo.c(registerInfo.getDevId());
        ebiVar.c(registerInfo.getVerifyCode());
        ebiVar.e(GRSManager.c(BaseApplication.getContext()).getUrl("healthAPPToDeviceUrl"));
        ebiVar.a(registerInfo.getPsk());
        LogUtil.d(TAG, " softApRegisterInfo = ", ebiVar);
        String json = new Gson().toJson(ebiVar, ebi.class);
        Bundle bundle = new Bundle();
        bundle.putString("ssid", this.mOuthName);
        bundle.putString("pwd", this.mOuthPwd);
        bundle.putInt("encryptMode", this.mAddDeviceInfo.b());
        bundle.putString("deviceSsid", this.mAddDeviceInfo.i());
        bundle.putString("registerMsg", json);
        EventBus.a(new EventBus.d("send_config_info", bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processingLogicEvent(int i, int i2, Object obj) {
        if (obj == null || !(obj instanceof eby)) {
            LogUtil.j(TAG, "processingLogicEvent obj is null or obj is not instance WifiDevice");
            return;
        }
        if (i2 == 13) {
            eby ebyVar = (eby) obj;
            if (this.mProductId != null) {
                if (!isBindSuccess(ebyVar)) {
                    LogUtil.a(TAG, "processingLogicEvent bind device is not need device :", ebyVar.a().toString());
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 5;
                    messageObtain.arg1 = i;
                    this.mHandler.sendMessage(messageObtain);
                    unBindDevice(ebyVar.e());
                    return;
                }
                ebyVar.setProductId(this.mProductId);
                ebyVar.setKind(HealthDevice.HealthDeviceKind.HDK_WEIGHT);
                ebyVar.a().b(1);
                this.mDeviceId = ebyVar.a().c();
                LogUtil.a(TAG, "processingLogicEvent deviceDetailInfo:", ebyVar.toString());
                mUniqueId = ebyVar.getUniqueId();
                this.mSerialNumber = ebyVar.a().l();
                boolean z = dmp.d().a(ebyVar.getSerialNumber(), false) != null;
                elh elhVar = this.mProductInfo;
                String strQ = elhVar != null ? elhVar.q() : "";
                if (z) {
                    updateWifiDevice(i, this.mProductId, strQ, ebyVar);
                } else {
                    saveWifiDevice(i, this.mProductId, strQ, ebyVar);
                }
            }
        }
    }

    private void updateWifiDevice(final int i, String str, String str2, eby ebyVar) {
        drw.e().c(str, str2, ebyVar, new IDeviceEventHandler() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiDeviceBindResultFragment.4
            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onDeviceFound(HealthDevice healthDevice) {
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onScanFailed(int i2) {
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onStateChanged(int i2) {
                LogUtil.a(WiFiDeviceBindResultFragment.TAG, "updateWifiDevice onStateChanged code:", Integer.valueOf(i2));
                WiFiDeviceBindResultFragment.this.wifiDeviceStateChanged(i, i2);
            }
        });
    }

    private void saveWifiDevice(final int i, String str, String str2, eby ebyVar) {
        drw.e().a(str, str2, ebyVar, new IDeviceEventHandler() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiDeviceBindResultFragment.5
            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onDeviceFound(HealthDevice healthDevice) {
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onScanFailed(int i2) {
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onStateChanged(int i2) {
                LogUtil.a(WiFiDeviceBindResultFragment.TAG, "saveWifiDevice onStateChanged code:", Integer.valueOf(i2));
                WiFiDeviceBindResultFragment.this.wifiDeviceStateChanged(i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wifiDeviceStateChanged(int i, int i2) {
        if (i2 == 7) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 6;
            messageObtain.arg1 = i;
            this.mHandler.sendMessage(messageObtain);
            return;
        }
        if (i2 == 8) {
            drw.e().l(mUniqueId);
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 5;
            messageObtain2.arg1 = i;
            this.mHandler.sendMessage(messageObtain2);
            return;
        }
        LogUtil.j(TAG, "wifiDevice onStateChanged not passed or failed");
    }

    class NetWorkCallback implements DeviceCallBack {
        private WeakReference<WiFiDeviceBindResultFragment> mActivity;

        NetWorkCallback(WiFiDeviceBindResultFragment wiFiDeviceBindResultFragment) {
            this.mActivity = new WeakReference<>(wiFiDeviceBindResultFragment);
        }

        @Override // com.huawei.health.device.wifi.interfaces.DeviceCallBack
        public void onSuccess(int i, Object obj) {
            if (i == 4) {
                i = 1;
            }
            int i2 = i == 5 ? 16 : 13;
            if (isDestroy()) {
                Message messageObtain = Message.obtain();
                messageObtain.what = i2;
                messageObtain.arg1 = i;
                messageObtain.obj = obj;
                WiFiDeviceBindResultFragment.this.mHandler.sendMessage(messageObtain);
                WiFiDeviceBindResultFragment.this.mHandler.sendEmptyMessage(12);
            }
        }

        @Override // com.huawei.health.device.wifi.interfaces.DeviceCallBack
        public void onFailure(int i, int i2) {
            if (i == 4) {
                i = 1;
            }
            if (isDestroy()) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 5;
                messageObtain.arg1 = i;
                messageObtain.arg2 = i2;
                WiFiDeviceBindResultFragment.this.mHandler.sendMessage(messageObtain);
            }
        }

        @Override // com.huawei.health.device.wifi.interfaces.DeviceCallBack
        public void onStatus(int i, int i2) {
            if (i == 4) {
                i = 1;
            }
            if (isDestroy()) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 7;
                messageObtain.arg1 = i;
                messageObtain.arg2 = i2;
                WiFiDeviceBindResultFragment.this.mHandler.sendMessage(messageObtain);
            }
        }

        private boolean isDestroy() {
            WeakReference<WiFiDeviceBindResultFragment> weakReference = this.mActivity;
            if (weakReference == null) {
                return false;
            }
            WiFiDeviceBindResultFragment wiFiDeviceBindResultFragment = weakReference.get();
            WiFiDeviceBindResultFragment wiFiDeviceBindResultFragment2 = wiFiDeviceBindResultFragment instanceof WiFiDeviceBindResultFragment ? wiFiDeviceBindResultFragment : null;
            return (wiFiDeviceBindResultFragment2 == null || wiFiDeviceBindResultFragment2.isDestroy()) ? false : true;
        }
    }

    public void startConfigNetWork(String str, String str2, ebv ebvVar) {
        int i = this.mConfigMode;
        if (i == 2) {
            LogUtil.a(TAG, "startConfigNetWork SOFTAP_MODE");
            this.mAddDeviceManager.a(this.mConfigMode, str, str2, ebvVar, this.mBaseCallback);
            return;
        }
        if (i != 1) {
            if (i == 3) {
                LogUtil.a(TAG, "startConfigNetWork REGISTER_MODE:", Integer.valueOf(i));
                this.mAddDeviceInfo = ebvVar;
                this.mAddDeviceManager.a(ebvVar, this.mBaseCallback);
                return;
            } else {
                if (i == 5) {
                    LogUtil.a(TAG, "startConfigNetWork REGISTER_MODE:", Integer.valueOf(i));
                    this.mAddDeviceInfo = ebvVar;
                    this.mAddDeviceManager.b(DeviceRegisterManager.RegisterMode.REGISTER_BLE, this.mAddDeviceInfo, this.mBaseCallback);
                    return;
                }
                LogUtil.a(TAG, "startConfigNetWork config mode is: ", Integer.valueOf(i));
                return;
            }
        }
        if (ebvVar == null) {
            if (TextUtils.isEmpty(this.mProductId)) {
                LogUtil.j(TAG, "startConfigNetWork mProductId is null");
                return;
            } else if (this.mProductInfo == null) {
                LogUtil.j(TAG, "startConfigNetWork mProductinfo is null");
                return;
            } else {
                LogUtil.a(TAG, "startConfigNetWork HAND_ADD_WIFIAP_MODE");
                this.mAddDeviceManager.e(str, str2, this.mProductInfo.x(), this.mProductId, this.mBaseCallback);
                return;
            }
        }
        LogUtil.a(TAG, "startConfigNetWork MULTCAST_MODE");
        this.mAddDeviceManager.a(this.mConfigMode, str, str2, ebvVar, this.mBaseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDestroy() {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            LogUtil.e(TAG, "DeviceMainActivity is Destroyed");
            return true;
        }
        if (isAdded()) {
            return false;
        }
        LogUtil.e(TAG, "MyHandler mFragment is not add");
        return false;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        if (this.mCurrentStatus == 6) {
            showConfirmInfoAndDisplay();
            return false;
        }
        popupFragment(WiFiProductIntroductionFragment.class);
        return false;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        ebh.a(this.mainActivity);
        super.onDestroy();
        ecq ecqVar = this.mAddDeviceManager;
        if (ecqVar != null) {
            ecqVar.e();
        }
        MyHandler myHandler = this.mHandler;
        if (myHandler != null) {
            myHandler.removeCallbacksAndMessages(null);
        }
        ecx ecxVar = this.mScanManager;
        if (ecxVar != null) {
            ecxVar.d();
        }
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        AnimationDrawable animationDrawable = this.mAnimation;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBiWifiDeviceBindSuccessCount() {
        dyj.a(mUniqueId, this.mProductInfo);
    }

    private void showConfirmInfoAndDisplay() {
        LogUtil.a(TAG, "showConfirmInfoAndDisplay() enter");
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.mainActivity);
        builder.b(R.string.IDS_device_wifi_confirm_info_and_display).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiDeviceBindResultFragment.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).c(R.string.IDS_apphelp_pwindows_back_button, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiDeviceBindResultFragment.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a(WiFiDeviceBindResultFragment.TAG, "showConfirmInfoAndDisplay mIsBleScale:", Boolean.valueOf(WiFiDeviceBindResultFragment.this.mIsBleScale));
                if (WiFiDeviceBindResultFragment.this.mIsBleScale) {
                    WiFiDeviceBindResultFragment.this.jumpToHonourDeviceFragment();
                    return;
                }
                if (!TextUtils.isEmpty(WiFiDeviceBindResultFragment.this.mDeviceId)) {
                    ean.b(WiFiDeviceBindResultFragment.this.mDeviceId, false);
                } else {
                    LogUtil.j(WiFiDeviceBindResultFragment.TAG, "showConfirmInfoAndDisplay() deviceid is null");
                }
                if (ect.c(WiFiDeviceBindResultFragment.this.mProductId) && dxm.ad(WiFiDeviceBindResultFragment.this.mProductId)) {
                    WiFiDeviceBindResultFragment.this.toDeviceManageFragment();
                } else {
                    WiFiDeviceBindResultFragment.this.popupFragment(WiFiProductIntroductionFragment.class);
                }
            }
        });
        builder.c().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toDeviceManageFragment() {
        etn.c();
        Bundle bundle = new Bundle();
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", mUniqueId);
        contentValues.put("productId", this.mProductId);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        bundle.putString("productId", this.mProductId);
        Fragment wiFiProductIntroductionFragment = new WiFiProductIntroductionFragment();
        wiFiProductIntroductionFragment.setArguments(bundle);
        switchFragment((Fragment) null, wiFiProductIntroductionFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jumpToHonourDeviceFragment() {
        if (this.isHonourDevice) {
            if (!dxm.s(this.mProductId)) {
                popupFragment(ProductIntroductionFragment.class);
                LogUtil.a(TAG, "jumpToHonourDeviceFragment switchFragment mProductId=", this.mProductId);
                Bundle bundle = new Bundle();
                bundle.putString("productId", this.mProductId);
                bundle.putBoolean("isBindSuccess", true);
                bundle.putBoolean("isCorrectProductId", false);
                bundle.putString("title", this.mTitle);
                ContentValues contentValues = new ContentValues();
                contentValues.put("productId", this.mProductId);
                contentValues.put("uniqueId", this.mDeviceId);
                bundle.putParcelable("commonDeviceInfo", contentValues);
                Fragment productIntroductionFragment = new ProductIntroductionFragment();
                productIntroductionFragment.setArguments(bundle);
                switchFragment(productIntroductionFragment);
                return;
            }
            LogUtil.a(TAG, "jumpToHonourDeviceFragment popupFragment mProductId=", this.mProductId);
            popupFragment(ProductIntroductionFragment.class);
            return;
        }
        if (this.mIsHagrid) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("productId", this.mProductId);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("productId", this.mProductId);
            contentValues2.put("uniqueId", this.mDeviceId);
            bundle2.putParcelable("commonDeviceInfo", contentValues2);
            bundle2.putString("goto", "devicebind");
            bundle2.putString("title", this.mTitle);
            Fragment hagridDeviceManagerFragment = new HagridDeviceManagerFragment();
            hagridDeviceManagerFragment.setArguments(bundle2);
            switchFragment(hagridDeviceManagerFragment);
            return;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putString("productId", this.mProductId);
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put("productId", this.mProductId);
        contentValues3.put("uniqueId", this.mDeviceId);
        bundle3.putParcelable("commonDeviceInfo", contentValues3);
        bundle3.putString("goto", "devicebind");
        bundle3.putString("title", this.mTitle);
        Fragment honourDeviceFragment = new HonourDeviceFragment();
        honourDeviceFragment.setArguments(bundle3);
        switchFragment(honourDeviceFragment);
    }

    private void showStage(String str) {
        this.mPairingStage.setText(str);
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator == null) {
            ValueAnimator duration = ValueAnimator.ofInt(0, 3).setDuration(1000L);
            this.mValueAnimator = duration;
            duration.setRepeatCount(-1);
            this.mValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiDeviceBindResultFragment.8
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    WiFiDeviceBindResultFragment.this.mPairingStageAnim.setText(WiFiDeviceBindResultFragment.this.mStageLoadingList[((Integer) valueAnimator2.getAnimatedValue()).intValue() % WiFiDeviceBindResultFragment.this.mStageLoadingList.length]);
                }
            });
            if (this.mValueAnimator.isRunning()) {
                return;
            }
            this.mValueAnimator.start();
            return;
        }
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiDeviceBindResultFragment.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                WiFiDeviceBindResultFragment.this.mPairingStageAnim.setText(WiFiDeviceBindResultFragment.this.mStageLoadingList[((Integer) valueAnimator2.getAnimatedValue()).intValue() % WiFiDeviceBindResultFragment.this.mStageLoadingList.length]);
            }
        });
        if (this.mValueAnimator.isRunning()) {
            return;
        }
        this.mValueAnimator.start();
    }

    static class ScanCallback extends ScanDeviceCallback<WiFiDeviceBindResultFragment> {
        @Override // com.huawei.health.device.wifi.interfaces.ScanDeviceCallback
        public /* bridge */ /* synthetic */ void onDeviceDiscovered(WiFiDeviceBindResultFragment wiFiDeviceBindResultFragment, List list) {
            onDeviceDiscovered2(wiFiDeviceBindResultFragment, (List<ebv>) list);
        }

        ScanCallback(WiFiDeviceBindResultFragment wiFiDeviceBindResultFragment) {
            super(wiFiDeviceBindResultFragment);
        }

        /* JADX INFO: renamed from: onDeviceDiscovered, reason: avoid collision after fix types in other method */
        public void onDeviceDiscovered2(WiFiDeviceBindResultFragment wiFiDeviceBindResultFragment, List<ebv> list) {
            ArrayList<ebv> arrayListRemoveRepeatDevice = wiFiDeviceBindResultFragment.removeRepeatDevice(list);
            LogUtil.a(WiFiDeviceBindResultFragment.TAG, "onDeviceDiscovered deviceInfo ", Integer.valueOf(list.size()), " mDevices:", Integer.valueOf(arrayListRemoveRepeatDevice.size()));
            if (arrayListRemoveRepeatDevice.size() > 0) {
                wiFiDeviceBindResultFragment.mScanManager.d();
                wiFiDeviceBindResultFragment.mAddDeviceInfo = arrayListRemoveRepeatDevice.get(0);
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                messageObtain.arg1 = 1;
                wiFiDeviceBindResultFragment.mHandler.sendMessage(messageObtain);
            }
        }

        @Override // com.huawei.health.device.wifi.interfaces.ScanDeviceCallback
        public void onDeviceDiscoveryFinished(WiFiDeviceBindResultFragment wiFiDeviceBindResultFragment) {
            LogUtil.a(WiFiDeviceBindResultFragment.TAG, "onDeviceDiscoveryFinished ");
            if (wiFiDeviceBindResultFragment.mHandler != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                messageObtain.arg1 = 1;
                wiFiDeviceBindResultFragment.mHandler.sendMessage(messageObtain);
            }
        }

        @Override // com.huawei.health.device.wifi.interfaces.ScanDeviceCallback
        public void onFailure(WiFiDeviceBindResultFragment wiFiDeviceBindResultFragment, Object obj) {
            LogUtil.a(WiFiDeviceBindResultFragment.TAG, "onFailure scan");
            if (wiFiDeviceBindResultFragment.mHandler != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                messageObtain.arg1 = 1;
                wiFiDeviceBindResultFragment.mHandler.sendMessage(messageObtain);
            }
        }
    }

    public ArrayList<ebv> removeRepeatDevice(List<ebv> list) {
        ArrayList<ebv> arrayList = new ArrayList<>(16);
        for (ebv ebvVar : list) {
            String strI = ebvVar.i();
            String strJ = ebvVar.j();
            String strH = ebvVar.h();
            LogUtil.a(TAG, "removeRepeatDevice ssid: ", strI, ", proId: ", strJ, ", type: ", strH);
            if (TextUtils.isEmpty(strI) || TextUtils.isEmpty(strJ) || TextUtils.isEmpty(strH)) {
                LogUtil.j(TAG, "removeRepeatDevice ssid,productId,type is null");
            } else if (!"wifiap".equals(ebvVar.h())) {
                LogUtil.j(TAG, "removeRepeatDevice source type is other ");
            } else {
                if (arrayList.size() > 0) {
                    Iterator<ebv> it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ebv next = it.next();
                            if (next != null && strI.equals(next.i()) && next.h().equals(strH)) {
                                break;
                            }
                        }
                    }
                }
                arrayList.add(ebvVar);
                break;
            }
        }
        LogUtil.a(TAG, "removeRepeatDevice all add info is ", arrayList);
        return arrayList;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LogUtil.a(TAG, "onConfigurationChanged, refresh page");
        refreshDevicePairResultLayout();
        super.onConfigurationChanged(configuration);
    }

    private void refreshDevicePairResultLayout() {
        LinearLayout linearLayout = this.mDevicePairResultImageLayout;
        if (linearLayout != null) {
            qrs.b(linearLayout, 3);
        }
    }
}
