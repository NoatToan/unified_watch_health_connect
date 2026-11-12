package com.huawei.health.device.ui.measure.fragment;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.callback.ScaleDialogCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.device.ui.measure.adapter.HagridDeviceManagerAdapter;
import com.huawei.health.device.ui.measure.adapter.WeightResultConfirmAdapter;
import com.huawei.health.device.ui.privacy.HonorDevicePrivacyActivity;
import com.huawei.health.device.ui.util.DeviceManagerInfoHandler;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.device.wifi.control.claim.ClaimWeightDataManager;
import com.huawei.health.device.wifi.interfaces.CommBaseCallback;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetSubUserAuthMsgReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetSubUserAuthMsgRsp;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceShareMemberInfoBySubUserReq;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.utils.OnlineImUtil;
import com.huawei.plugindevice.R;
import com.huawei.profile.profile.ProfileExtendConstants;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.dmh;
import defpackage.dmp;
import defpackage.dnj;
import defpackage.doq;
import defpackage.dst;
import defpackage.dsz;
import defpackage.dti;
import defpackage.duy;
import defpackage.dvf;
import defpackage.dvh;
import defpackage.dvi;
import defpackage.dvk;
import defpackage.dvr;
import defpackage.dwe;
import defpackage.dwq;
import defpackage.dxi;
import defpackage.dxm;
import defpackage.dxn;
import defpackage.dxp;
import defpackage.dxw;
import defpackage.dyg;
import defpackage.dyj;
import defpackage.dyk;
import defpackage.dyn;
import defpackage.dyq;
import defpackage.dys;
import defpackage.eal;
import defpackage.ean;
import defpackage.eas;
import defpackage.eby;
import defpackage.ecf;
import defpackage.ecl;
import defpackage.ecs;
import defpackage.efx;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.eny;
import defpackage.era;
import defpackage.etn;
import defpackage.lli;
import defpackage.lqo;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class HagridDeviceManagerFragment extends BaseFragment implements View.OnClickListener, DownloadResultCallBack {
    private static final String[] EVENT_SUBSCRIBE_LIST = {"get_device_ssid_result", "manager_info_success", "manager_info_failed", "set_weight_unit_result", "device_reset_result", "get_weight_unit_result", "wifi_scale_auth_refresh", "sub_user_unauthorize_notification", "multi_user_auto_cancle_dialog", "event_bus_sub_user_exit_device", "event_bus_config_wifi"};
    private static final String TAG = "HagridDeviceManagerFragment";
    private static final String TAG_RELEASE = "R_Weight_HagridDeviceManagerFragment";
    private boolean hadCheckUpdate;
    private HagridDeviceManagerAdapter mAdapter;
    private HealthTextView mAddUserView;
    private dsz mConditionBeforeRequestHandler;
    private HealthTextView mConnectStatusPromptMessage;
    private HealthTextView mConnectStatusTextView;
    private ContentValues mContentValues;
    private CustomViewDialog mCustomViewDialog;
    private String mDevId;
    private ImageView mDeviceImg;
    private dvf mEventManager;
    private String mGoto;
    private RelativeLayout mGuestMeasureLayout;
    private RelativeLayout mHagrideUserGuideLayout;
    private RelativeLayout mHagrideWeightDataClaimLayout;
    private RelativeLayout mHagrideWeightDataManagerLayout;
    private byte[] mHuid;
    private boolean mIsClickDeviceVersionUpdateItem;
    private boolean mIsNfcConnectScales;
    private boolean mIsWaitForAccountInfo;
    private ListView mItemListView;
    private HealthDevice.HealthDeviceKind mKind;
    private CommonDialog21 mLoadingDialog;
    private PopViewList mPopView;
    private String mProductId;
    private elh mProductInfo;
    private HealthScrollView mScrollView;
    private ImageView mShowMoreDataArrowImage;
    private LinearLayout mShowMoreDataLayout;
    private HealthTextView mStartMeasureTextView;
    private String mUniqueId;
    private String mUrl;
    private WeightResultConfirmAdapter mUserAdapter;
    private LinearLayout mUserLayout;
    private ListView mUserListView;
    private ImageView mWeightDataClaimImg;
    private ImageView mWeightDataClaimRedPointImage;
    private HealthTextView mWeightDataClaimText;
    private RelativeLayout mWeightDataFromSmartLifeLayout;
    private HealthTextView mWeightDeviceConnectStatus;
    private dti mWeightInteractor;
    private LinearLayout mWeightLayoutContainer;
    private LinearLayout mWeightValueLayoutContainer;
    private eby mWiFiDevice;
    private dvi myHandler;
    private String mAccountInfo = null;
    private CountDownTimer mLoadingConditionTimer = new CountDownTimer(6000, 1000) { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment.1
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            LogUtil.j(HagridDeviceManagerFragment.TAG_RELEASE, "mLoadingConditionTimer: receive account info timeout");
            if (HagridDeviceManagerFragment.this.mConditionBeforeRequestHandler != null) {
                HagridDeviceManagerFragment.this.mConditionBeforeRequestHandler.sendEmptyMessage(10);
            }
        }
    };
    private boolean mIsMainUser = false;
    private int mGetHuidType = 0;
    private int mDownloadStatus = -1;
    private CommBaseCallback commBaseCallback = new CommBaseCallback<HagridDeviceManagerFragment>(this) { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment.2
        @Override // com.huawei.health.device.wifi.interfaces.CommBaseCallback
        public void onResult(HagridDeviceManagerFragment hagridDeviceManagerFragment, int i, String str, Object obj) {
            boolean z = false;
            boolean z2 = (hagridDeviceManagerFragment == null || hagridDeviceManagerFragment.isDestory()) ? false : true;
            if (hagridDeviceManagerFragment != null) {
                if (hagridDeviceManagerFragment.isAdded() && hagridDeviceManagerFragment.myHandler != null) {
                    z = true;
                }
                if (z2 && z) {
                    hagridDeviceManagerFragment.myHandler.sendEmptyMessage(1);
                }
            }
        }
    };

    public boolean getIsClickDeviceVersionUpdateItem() {
        return this.mIsClickDeviceVersionUpdateItem;
    }

    public void setAccountInfo(String str) {
        this.mAccountInfo = str;
    }

    public CountDownTimer getLoadingConditionTimer() {
        return this.mLoadingConditionTimer;
    }

    public dvi getManagerHandler() {
        return this.myHandler;
    }

    @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack
    public void setDownloadStatus(int i, int i2) {
        this.mDownloadStatus = i;
        if (i == -2) {
            qpx.a(BaseApplication.getContext(), R.string.IDS_network_error);
            ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).onDownloadIndexAllDestroy();
        } else if (i != 0) {
            LogUtil.a(TAG, "setDownloadStatus mDownloadStatus: ", Integer.valueOf(i));
            ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).onDownloadIndexAllDestroy();
        }
    }

    public void switchToSubUserWifiPage() {
        LogUtil.a(TAG, "switchToSubUserWifiPage");
        if (this.mAdapter == null) {
            LogUtil.j(TAG_RELEASE, "switchToSubUserWifiPage mAdapter is null.");
            return;
        }
        MeasurableDevice measurableDeviceB = dmp.d().b(this.mUniqueId, false);
        if (measurableDeviceB != null) {
            if (measurableDeviceB instanceof eby) {
                this.mWiFiDevice = (eby) measurableDeviceB;
                this.mAdapter.c(14, createSettingItem(12, getViewString(R.string.IDS_device_user_manager), "", ""));
                ClaimWeightDataManager.INSTANCE.registerCallBack(getClass().getSimpleName(), this.commBaseCallback);
                return;
            }
            LogUtil.j(TAG, "switchToSubUserWifiPage, bond device isn't wifi device");
            return;
        }
        LogUtil.j(TAG, "switchToSubUserWifiPage, no bond device");
    }

    public void connectSuccess() {
        checkUpdateVersion();
        LogUtil.a(TAG, "connectSuccess");
        if (this.mConnectStatusTextView == null || this.mConnectStatusPromptMessage == null || this.mainActivity == null) {
            return;
        }
        LogUtil.a(TAG, "connectSuccess update text status");
        LogUtil.a(TAG, "connectSuccess mConnectStatusTextView is ", this.mConnectStatusTextView);
        this.mConnectStatusTextView.setText(this.mainActivity.getString(R.string.IDS_myfitnesspal_login));
        this.mConnectStatusPromptMessage.setVisibility(8);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a(TAG, "onCreate");
        this.myHandler = new dvi(this);
        this.mConditionBeforeRequestHandler = new dsz(this, this.mainActivity);
        dvf dvfVar = new dvf();
        this.mEventManager = dvfVar;
        EventBus.b(dvfVar, 0, EVENT_SUBSCRIBE_LIST);
        this.mEventManager.e(this.myHandler, this, this.mUniqueId, this.mProductId);
        downloadIndexAllResources();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Throwable {
        LogUtil.a(TAG, "onCreateView");
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        this.child = layoutInflater.inflate(R.layout.hygride_product_manager_layout, viewGroup, false);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
        }
        initView();
        initData();
        initViewData();
        setListener();
        dti dtiVarD = dti.d(this.mProductId, this.mUniqueId);
        this.mWeightInteractor = dtiVarD;
        dtiVarD.c(this.mainActivity, this.child);
        initManager();
        initUnitType();
        if (dyk.a().a(this.mUniqueId)) {
            LogUtil.a(TAG, "init WeightInteractor and init Handler");
            this.mWeightInteractor.d();
        } else {
            this.mWeightDeviceConnectStatus.setText(getViewString(R.string.IDS_user_profile_health_show_unparied));
            this.mStartMeasureTextView.setText(getViewString(R.string.IDS_device_start_paring_title));
        }
        if (getActivity() instanceof DeviceMainActivity) {
            ((DeviceMainActivity) getActivity()).e(HagridDeviceManagerFragment.class);
        }
        Bundle arguments = getArguments();
        if (arguments != null && "Delete".equals(arguments.getString("operateCode"))) {
            dvk.b().a(this.mainActivity);
        }
        if (!TextUtils.isEmpty(this.mUniqueId)) {
            dxm.au(this.mUniqueId);
        }
        return viewGroup2;
    }

    private void checkUpdateVersion() {
        if (this.hadCheckUpdate) {
            return;
        }
        this.hadCheckUpdate = true;
        Intent intent = new Intent("action_start_check_scale");
        intent.putExtra("commonDeviceInfo", this.mContentValues);
        dxw.d().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    private void initManager() {
        dvr.a().a(this.mUniqueId, this.mProductId, this.mWeightInteractor);
        dvr.a().c(this.myHandler);
        this.mEventManager.e(this.myHandler, this, this.mUniqueId, this.mProductId);
        dvk.b().c(this.mUniqueId, this.mProductId, this.mainActivity, this.myHandler, this);
        this.mWeightInteractor.a(this.myHandler);
    }

    private void downloadIndexAllResources() {
        if (dxp.b()) {
            ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).addDownloadIndexAllCallBack(this);
            ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexAll();
        } else {
            this.mDownloadStatus = 1;
        }
    }

    public void gotoHagridDeviceWlanUseGuideFragment() {
        LogUtil.a(TAG, "gotoHagridDeviceWlanUseGuideFragment");
        Bundle bundle = new Bundle();
        ContentValues contentValues = this.mContentValues;
        if (contentValues == null) {
            contentValues = new ContentValues();
        }
        if (!contentValues.containsKey("productId")) {
            contentValues.put("productId", this.mProductId);
            contentValues.put("uniqueId", this.mUniqueId);
        }
        bundle.putParcelable("commonDeviceInfo", contentValues);
        bundle.putString("productId", this.mProductId);
        bundle.putString("cloudDeviceId", this.mDevId);
        bundle.putParcelable("commonDeviceInfo", this.mContentValues);
        bundle.putByteArray("mainHuid", this.mHuid);
        bundle.putInt(ParamConstants.Param.VIEW_TYPE, 13);
        Fragment selectFragment = getSelectFragment(HagridDeviceWlanUseGuideFragment.class);
        Fragment hagridDeviceWlanUseGuideFragment = selectFragment instanceof BaseFragment ? (BaseFragment) selectFragment : null;
        if (!(hagridDeviceWlanUseGuideFragment instanceof HagridDeviceWlanUseGuideFragment)) {
            hagridDeviceWlanUseGuideFragment = new HagridDeviceWlanUseGuideFragment();
        }
        if (this.mAccountInfo != null) {
            LogUtil.a(TAG, "gotoHagridDeviceWlanUseGuideFragment mAccountInfo is not null");
            bundle.putString("accountInfo", this.mAccountInfo);
        }
        hagridDeviceWlanUseGuideFragment.setArguments(bundle);
        switchFragment(hagridDeviceWlanUseGuideFragment);
    }

    private void clickRequestDeviceShareItem() {
        if (qrs.r()) {
            LogUtil.j(TAG, "clickRequestDeviceShareItem click too fast.");
            return;
        }
        if (!(dmp.d().b(this.mUniqueId, true) instanceof efx)) {
            showSelectBindDeviceDialog();
            return;
        }
        if (isBluetoothConnect()) {
            this.mIsClickDeviceVersionUpdateItem = false;
            showLoadingDialog(getString(R.string.IDS_getting_file));
            LogUtil.a(TAG, "clickRequestDeviceShareItem mGetHuidType:", Integer.valueOf(this.mGetHuidType));
            if (this.mGetHuidType != 1) {
                startLoadingConditionTimer();
                return;
            }
            if (!this.mIsMainUser) {
                destroyLoadingDialog();
                byte[] bArr = this.mHuid;
                if (bArr == null || bArr.length == 0) {
                    LogUtil.a(TAG, "is only ble device goto config wifi");
                    configWifi();
                    return;
                } else {
                    LogUtil.a(TAG, "clickRequestDeviceShareItem: wifi sub user");
                    dealClickDeviceShare(new DeviceManagerInfoHandler());
                    return;
                }
            }
            LogUtil.j(TAG, "clickRequestDeviceShareItem: main user");
            destroyLoadingDialog();
            return;
        }
        LogUtil.a(TAG, "clickRequestDeviceShareItem click toast not connect");
        qpx.a(BaseApplication.getContext(), R.string.IDS_plugin_device_weight_device_not_connect);
    }

    private void dealClickDeviceShare(DeviceManagerInfoHandler deviceManagerInfoHandler) {
        byte[] bArr = this.mHuid;
        if (bArr == null || bArr.length == 0) {
            deviceManagerInfoHandler.b(new DeviceManagerInfoHandler.GetManagerAccountInfoListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment$$ExternalSyntheticLambda8
                @Override // com.huawei.health.device.ui.util.DeviceManagerInfoHandler.GetManagerAccountInfoListener
                public final void managerAccountInfo(String str) {
                    this.f$0.m847x5b22c281(str);
                }
            });
            deviceManagerInfoHandler.b();
        } else {
            this.myHandler.sendEmptyMessage(15);
        }
    }

    /* JADX INFO: renamed from: lambda$dealClickDeviceShare$0$com-huawei-health-device-ui-measure-fragment-HagridDeviceManagerFragment, reason: not valid java name */
    /* synthetic */ void m847x5b22c281(String str) {
        LogUtil.a(TAG, "managerAccountInfo account: ", str);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.mAccountInfo = str;
        dvi dviVar = this.myHandler;
        if (dviVar != null) {
            dviVar.sendEmptyMessage(15);
        }
    }

    private void startLoadingConditionTimer() {
        CountDownTimer countDownTimer = this.mLoadingConditionTimer;
        if (countDownTimer != null && this.mGetHuidType == 3) {
            countDownTimer.cancel();
            this.mLoadingConditionTimer.start();
        } else {
            if (countDownTimer != null) {
                this.myHandler.sendEmptyMessage(5);
                this.mLoadingConditionTimer.cancel();
                this.mLoadingConditionTimer.start();
                return;
            }
            LogUtil.j(TAG, "startLoadingConditionTimer mGetHuidType is ", Integer.valueOf(this.mGetHuidType));
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
        LogUtil.a(TAG_RELEASE, "showLoadingDialog: mLoadingDialog is not null");
    }

    public void destroyLoadingDialog() {
        CommonDialog21 commonDialog21 = this.mLoadingDialog;
        if (commonDialog21 != null) {
            commonDialog21.cancel();
            this.mLoadingDialog = null;
        }
    }

    private boolean checkWiFiIsOpen() {
        Activity activity = BaseApplication.getActivity();
        if (this.mainActivity == null && (activity instanceof DeviceMainActivity)) {
            LogUtil.a(TAG, "mainActivity is null, get top activity");
            this.mainActivity = activity;
        }
        if (ecs.e(this.mainActivity)) {
            return true;
        }
        LogUtil.a(TAG, "checkWiFiIsOpen checkWifiStatus false");
        dxi.a(this.mainActivity);
        return false;
    }

    private void setListener() {
        this.mStartMeasureTextView.setOnClickListener(this);
        this.mHagrideUserGuideLayout.setOnClickListener(this);
        this.mHagrideWeightDataClaimLayout.setOnClickListener(this);
        this.mHagrideWeightDataManagerLayout.setOnClickListener(this);
        this.mGuestMeasureLayout.setOnClickListener(this);
        this.mShowMoreDataLayout.setOnClickListener(this);
        this.mItemListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment$$ExternalSyntheticLambda11
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                this.f$0.m854xaeeed031(adapterView, view, i, j);
            }
        });
        setTouchListener();
    }

    /* JADX INFO: renamed from: lambda$setListener$1$com-huawei-health-device-ui-measure-fragment-HagridDeviceManagerFragment, reason: not valid java name */
    /* synthetic */ void m854xaeeed031(AdapterView adapterView, View view, int i, long j) {
        HagridDeviceManagerAdapter hagridDeviceManagerAdapter = this.mAdapter;
        if (hagridDeviceManagerAdapter == null) {
            return;
        }
        dwe item = hagridDeviceManagerAdapter.getItem(i);
        if (item == null) {
            LogUtil.j(TAG, "setListener onItemClick item is null");
            return;
        }
        int iE = item.e();
        LogUtil.a(TAG, "clickRequestDeviceShareItem click item is ", Integer.valueOf(iE));
        if (dys.a().e(this.mainActivity, this.mUniqueId)) {
            return;
        }
        onItemCLick(iE);
    }

    private void onItemCLick(int i) {
        if (i == 6) {
            otaUpdate();
            return;
        }
        if (i == 9) {
            dvk.b().d(this.mUniqueId, this.mWeightInteractor, this);
            return;
        }
        if (i == 12) {
            dvh.e(this.mainActivity, this.mUniqueId, this.mWiFiDevice, this.mContentValues, this);
            return;
        }
        if (i == 13) {
            clickWifiItem();
            return;
        }
        if (i == 1) {
            dvh.e(this.mainActivity, this.mUniqueId, this.mProductId, this.mUrl, this);
            return;
        }
        if (i == 15) {
            dvr.a().c(this);
            return;
        }
        if (i == 14) {
            if (CommonUtil.ab(this.mainActivity) || checkWiFiIsOpen()) {
                LogUtil.a(TAG, "onItemClick Check network is connected");
                clickRequestDeviceShareItem();
                return;
            } else {
                LogUtil.j(TAG, "onItemClick network is not connected");
                return;
            }
        }
        if (i == 18) {
            duy.e().d(this.mWeightInteractor, this.mWiFiDevice, this.mainActivity);
            return;
        }
        if (i == 19) {
            betaFeedback();
            return;
        }
        if (i != 20) {
            LogUtil.j(TAG_RELEASE, "onItemClick other.");
            return;
        }
        if (qrs.r()) {
            ReleaseLogUtil.e(TAG_RELEASE, "help & customer click too fast.");
            return;
        }
        if (dmh.a() && !lli.e().b() && !lli.e().f()) {
            lli.e().b(false, null);
        }
        GRSManager.c(this.mainActivity).d("helpCustomerUrl", new dmh(this));
    }

    private void betaFeedback() {
        if (!(dmp.d().b(this.mUniqueId, true) instanceof efx)) {
            LogUtil.a(TAG, "betaFeedback showSelectBindDeviceDialog");
            showSelectBindDeviceDialog();
        } else {
            duy.e().d();
        }
    }

    private void setTouchListener() {
        this.mItemListView.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment$$ExternalSyntheticLambda9
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f$0.m855x601d8cfb(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setTouchListener$2$com-huawei-health-device-ui-measure-fragment-HagridDeviceManagerFragment, reason: not valid java name */
    /* synthetic */ boolean m855x601d8cfb(View view, MotionEvent motionEvent) {
        this.mScrollView.requestDisallowInterceptTouchEvent(false);
        return false;
    }

    private boolean isBluetoothConnect() {
        dti dtiVar = this.mWeightInteractor;
        if (dtiVar != null) {
            return dtiVar.c();
        }
        return false;
    }

    private void otaUpdate() {
        if (qrs.r()) {
            LogUtil.j(TAG, "otaUpdate click too fast.");
            return;
        }
        if (dxm.ai(this.mProductId)) {
            if (this.mWeightInteractor != null) {
                LogUtil.a(TAG, "otaUpdate mini OTA update");
                this.mWeightInteractor.controller(6, null);
                return;
            } else {
                LogUtil.j(TAG, "otaUpdate mWeightInteractor is null");
                return;
            }
        }
        if (!(dmp.d().b(this.mUniqueId, true) instanceof efx)) {
            LogUtil.a(TAG, "otaUpdate showSelectBindDeviceDialog");
            showSelectBindDeviceDialog();
            return;
        }
        if (isBluetoothConnect()) {
            if (this.mWiFiDevice != null) {
                if (!CommonUtil.ab(this.mainActivity)) {
                    dxi.a(this.mainActivity);
                    return;
                } else if (this.mWiFiDevice.a().m() == 1) {
                    upgradeForWiFi();
                    return;
                } else {
                    LogUtil.a(TAG, "Configured network but not main user.");
                    startVersionActivity(false);
                    return;
                }
            }
            upgradeForBluetooth();
            return;
        }
        LogUtil.a(TAG, "otaUpdate toast not connect");
        qpx.e(BaseApplication.getContext(), R.string.IDS_plugin_device_weight_device_not_connect);
    }

    private void upgradeForWiFi() {
        ReleaseLogUtil.d(TAG_RELEASE, "upgradeForWiFi in");
        Map<String, String> mapC = eas.b().c(this.mWiFiDevice.e());
        if (mapC != null && "2".equals(mapC.get("status"))) {
            if (eas.d(this.mWiFiDevice.e())) {
                mapC.put("status", "1");
                eas.b().a(this.mWiFiDevice.e(), mapC);
                LogUtil.j(TAG_RELEASE, "upgradeForWiFi Upgrade timed out");
            } else {
                LogUtil.a(TAG, "upgradeForWiFi during upgrade");
                Bundle bundle = new Bundle();
                bundle.putParcelable("commonDeviceInfo", this.mContentValues);
                bundle.putBoolean("fromProductView", true);
                bundle.putString("version", mapC.get("fwNewVer"));
                bundle.putString("cer_version", mapC.get("fwCurVer"));
                bundle.putString("update_nodes", mapC.get("releaseNote"));
                HagridWiFiOtaUpdateFragment hagridWiFiOtaUpdateFragment = new HagridWiFiOtaUpdateFragment();
                hagridWiFiOtaUpdateFragment.setArguments(bundle);
                switchFragment(hagridWiFiOtaUpdateFragment);
                return;
            }
        }
        eas.b().c(this.mWiFiDevice.e(), false);
        HagridWifiProductUpgradeFragment hagridWifiProductUpgradeFragment = new HagridWifiProductUpgradeFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("commonDeviceInfo", this.mContentValues);
        bundle2.putBoolean("fromProductView", true);
        hagridWifiProductUpgradeFragment.setArguments(bundle2);
        switchFragment(hagridWifiProductUpgradeFragment);
    }

    private void upgradeForBluetooth() {
        HagridDeviceManagerAdapter hagridDeviceManagerAdapter = this.mAdapter;
        if (hagridDeviceManagerAdapter == null) {
            LogUtil.j(TAG, "otaUpdate click updateItme mAdapter is null");
            return;
        }
        dwe dweVarA = hagridDeviceManagerAdapter.a(6);
        if (dweVarA == null || !dweVarA.f()) {
            LogUtil.j(TAG, "otaUpdate click updateItem is not enable");
            return;
        }
        boolean z = true;
        this.mIsClickDeviceVersionUpdateItem = true;
        showLoadingDialog(getString(R.string.IDS_getting_file));
        LogUtil.a(TAG, "upgradeForBluetooth mGetHuidType:", Integer.valueOf(this.mGetHuidType), ",mIsWaitForAccountInfo:", Boolean.valueOf(this.mIsWaitForAccountInfo));
        if (this.mGetHuidType != 1 && this.mIsWaitForAccountInfo) {
            startLoadingConditionTimer();
            return;
        }
        destroyLoadingDialog();
        byte[] bArr = this.mHuid;
        boolean z2 = bArr == null || bArr.length == 0;
        if (!this.mIsMainUser && !z2) {
            z = false;
        }
        startVersionActivity(z);
    }

    public void clickWifiItem() {
        if (qrs.r()) {
            LogUtil.j(TAG, "clickWifiItem click too fast.");
            return;
        }
        if (!(dmp.d().b(this.mUniqueId, true) instanceof efx)) {
            showSelectBindDeviceDialog();
            return;
        }
        if (isBluetoothConnect()) {
            HagridDeviceManagerAdapter hagridDeviceManagerAdapter = this.mAdapter;
            if (hagridDeviceManagerAdapter == null) {
                LogUtil.j(TAG, "clickWifiItem mAdapter is null");
                return;
            }
            dwe dweVarA = hagridDeviceManagerAdapter.a(13);
            if (dweVarA != null && dweVarA.f()) {
                configWifi();
                return;
            } else {
                LogUtil.j(TAG_RELEASE, "clickWifiItem is not enable");
                return;
            }
        }
        LogUtil.a(TAG, "clickWifiItem click toast not connect.");
        qpx.e(BaseApplication.getContext(), getViewString(R.string.IDS_plugin_device_weight_device_not_connect));
    }

    public void configWifi() {
        Fragment wiFiInfoConfirmFragment;
        if (!checkWiFiIsOpen()) {
            LogUtil.j(TAG, "kWiFi is not Open");
            return;
        }
        LogUtil.a(TAG, "configWifi and wifi is Open");
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4");
        Bundle bundle = new Bundle();
        bundle.putParcelable("commonDeviceInfo", this.mContentValues);
        bundle.putString("deviceSsid", strE);
        if (dxm.y(this.mProductId)) {
            wiFiInfoConfirmFragment = new HagridWiFiInfoConfirmFragment();
        } else {
            wiFiInfoConfirmFragment = new WiFiInfoConfirmFragment();
        }
        wiFiInfoConfirmFragment.setArguments(bundle);
        switchFragment(wiFiInfoConfirmFragment);
    }

    private void refreshUnreadMsgNum() {
        eby ebyVar = this.mWiFiDevice;
        if (ebyVar == null || ebyVar.a().m() != 1) {
            LogUtil.a(TAG_RELEASE, "refreshUnreadMsgNum: not manager");
            return;
        }
        WifiDeviceGetSubUserAuthMsgReq wifiDeviceGetSubUserAuthMsgReq = new WifiDeviceGetSubUserAuthMsgReq();
        wifiDeviceGetSubUserAuthMsgReq.setDevId(this.mDevId);
        lqo.b(BaseApplication.getContext()).b(wifiDeviceGetSubUserAuthMsgReq, new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment$$ExternalSyntheticLambda5
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f$0.m853x6b445fb6((CloudCommonReponse) obj, str, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$refreshUnreadMsgNum$3$com-huawei-health-device-ui-measure-fragment-HagridDeviceManagerFragment, reason: not valid java name */
    /* synthetic */ void m853x6b445fb6(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        LogUtil.a(TAG, "wifiDeviceGetSubUserAuthMsg request result: ", Boolean.valueOf(z));
        if (!z || TextUtils.isEmpty(str)) {
            return;
        }
        WifiDeviceGetSubUserAuthMsgRsp wifiDeviceGetSubUserAuthMsgRsp = (WifiDeviceGetSubUserAuthMsgRsp) new Gson().fromJson(str, WifiDeviceGetSubUserAuthMsgRsp.class);
        if (wifiDeviceGetSubUserAuthMsgRsp == null) {
            LogUtil.j(TAG_RELEASE, "wifiDeviceGetSubUserAuthMsg return fail: authMsgRsp is null");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 7;
        messageObtain.arg1 = ecl.a(wifiDeviceGetSubUserAuthMsgRsp.getAuthMsgs());
        if (this.myHandler == null) {
            this.myHandler = new dvi(this);
        }
        this.myHandler.sendMessage(messageObtain);
    }

    private void initView() {
        this.mScrollView = (HealthScrollView) qsp.a(this.child, R.id.hygride_product_manager_scroll_view);
        ListView listView = (ListView) qsp.a(this.child, R.id.list_device_setting);
        this.mItemListView = listView;
        if (listView != null) {
            listView.setSelector(new ColorDrawable(0));
        }
        this.mDeviceImg = (ImageView) qsp.a(this.child, R.id.device_img);
        this.mWeightDeviceConnectStatus = (HealthTextView) qsp.a(this.child, R.id.weight_device_connect_status_tv);
        this.mStartMeasureTextView = (HealthTextView) qsp.a(this.child, R.id.weight_start_measure_tv);
        this.mHagrideUserGuideLayout = (RelativeLayout) qsp.a(this.child, R.id.hygride_user_guide_layout);
        this.mHagrideWeightDataClaimLayout = (RelativeLayout) qsp.a(this.child, R.id.hygride_weight_data_claim_layout);
        this.mWeightDataClaimText = (HealthTextView) qsp.a(this.child, R.id.weight_data_claim_text);
        this.mWeightDataClaimImg = (ImageView) qsp.a(this.child, R.id.weight_data_claim_img);
        this.mWeightDataClaimRedPointImage = (ImageView) qsp.a(this.child, R.id.weight_data_claim_red_point_img);
        this.mHagrideWeightDataManagerLayout = (RelativeLayout) qsp.a(this.child, R.id.hygride_weight_data_manager_layout);
        this.mGuestMeasureLayout = (RelativeLayout) qsp.a(this.child, R.id.hygride_guest_weight_layout);
        this.mCustomTitleBar.setRightButtonVisibility(0);
        HealthTextView healthTextView = (HealthTextView) qsp.a(this.child, R.id.weight_device_connect_status_tv);
        this.mConnectStatusTextView = healthTextView;
        LogUtil.a(TAG, "init mConnectStatusTextView is ", healthTextView);
        this.mConnectStatusPromptMessage = (HealthTextView) qsp.a(this.child, R.id.connect_status_prompt_message);
        this.mWeightValueLayoutContainer = (LinearLayout) qsp.a(this.child, R.id.weight_value_layout_container);
        this.mWeightLayoutContainer = (LinearLayout) qsp.a(this.child, R.id.weight_layout_container);
        this.mWeightDataFromSmartLifeLayout = (RelativeLayout) qsp.a(this.child, R.id.weight_data_from_smart_life_layout);
        this.mShowMoreDataLayout = (LinearLayout) qsp.a(this.child, R.id.more_data_show_layout);
        this.mShowMoreDataArrowImage = (ImageView) qsp.a(this.child, R.id.smart_life_img_arrow);
        if (LanguageUtil.ba(this.mainActivity)) {
            this.mShowMoreDataArrowImage.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            this.mShowMoreDataArrowImage.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
        Resources resources = BaseApplication.getContext().getResources();
        if (resources != null) {
            this.mCustomTitleBar.setTitleBarBackgroundColor(resources.getColor(R.color.wear_home_bg_color));
            this.mCustomTitleBar.setRightButtonDrawable(resources.getDrawable(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_share));
        }
        this.mCustomTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m852xed61f7b5(view);
            }
        });
        PopViewList popViewList = this.mPopView;
        if (popViewList == null || !popViewList.c()) {
            return;
        }
        LogUtil.j(TAG, "initView mPopView dismiss");
        this.mPopView.d();
    }

    /* JADX INFO: renamed from: lambda$initView$4$com-huawei-health-device-ui-measure-fragment-HagridDeviceManagerFragment, reason: not valid java name */
    /* synthetic */ void m852xed61f7b5(View view) {
        showUnbindDeviceMenu();
    }

    private void showUnbindDeviceMenu() {
        ArrayList arrayList = new ArrayList(Arrays.asList(getResources().getString(R.string.IDS_device_wear_home_delete_device)));
        boolean zC = SharedPreferenceManager.c(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        boolean zD = etn.d(BaseApplication.getContext());
        if (CompileParameterUtil.c("IS_LUPIN_SUPPORT_PRIVACY", false) && zD && "25c6df38-ca23-11e9-a32f-2a2ae2dbcce4".equals(this.mProductId) && zC) {
            arrayList.add(getResources().getString(R.string.IDS_honor_privacy));
        }
        PopViewList popViewList = new PopViewList(this.mainActivity, this.mCustomTitleBar, arrayList);
        this.mPopView = popViewList;
        popViewList.b(new PopViewList.PopViewClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment$$ExternalSyntheticLambda3
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public final void setOnClick(int i) {
                this.f$0.m858x35622561(i);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showUnbindDeviceMenu$5$com-huawei-health-device-ui-measure-fragment-HagridDeviceManagerFragment, reason: not valid java name */
    /* synthetic */ void m858x35622561(int i) {
        if (i != 0) {
            if (i == 1) {
                startActivityForResult(new Intent(BaseApplication.getContext(), (Class<?>) HonorDevicePrivacyActivity.class), 1001);
                return;
            } else {
                LogUtil.j(TAG, "unknown position : ", Integer.valueOf(i));
                return;
            }
        }
        dti dtiVar = this.mWeightInteractor;
        if (dtiVar != null) {
            dtiVar.e();
        }
        dvk.b().a(this.mainActivity);
    }

    private void initData() {
        this.mProductId = getArguments().getString("productId");
        eny.a().d(this.mProductId);
        this.mGoto = getArguments().getString("goto");
        ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
        this.mContentValues = contentValues;
        if (contentValues != null) {
            this.mProductId = contentValues.getAsString("productId");
            this.mUniqueId = this.mContentValues.getAsString("uniqueId");
        } else {
            this.mContentValues = new ContentValues();
            LogUtil.j(TAG, "initData mContentValues is null");
        }
        if (TextUtils.isEmpty(this.mProductId)) {
            LogUtil.j(TAG_RELEASE, "initData mProductId is null");
            this.mainActivity.onBackPressed();
            return;
        }
        if (TextUtils.isEmpty(this.mUrl)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m851x3774f7ce();
                }
            });
        }
        initDeviceData();
        getBindByisNfc();
        ArrayList arrayList = new ArrayList(10);
        initItemList(arrayList);
        HagridDeviceManagerAdapter hagridDeviceManagerAdapter = new HagridDeviceManagerAdapter(this.mainActivity, this.mProductId);
        this.mAdapter = hagridDeviceManagerAdapter;
        hagridDeviceManagerAdapter.e(arrayList);
        this.mItemListView.setAdapter((ListAdapter) this.mAdapter);
        duy.e().c(this.mainActivity, this.mProductId, this.mUniqueId, this);
        dvk.b().c(this.mUniqueId, this.mProductId, this.mainActivity, this.myHandler, this);
    }

    /* JADX INFO: renamed from: lambda$initData$6$com-huawei-health-device-ui-measure-fragment-HagridDeviceManagerFragment, reason: not valid java name */
    /* synthetic */ void m851x3774f7ce() {
        this.mUrl = dyq.a(this.mProductId);
    }

    private void initDeviceData() {
        if (TextUtils.isEmpty(this.mUniqueId)) {
            LogUtil.j(TAG, "initData get uniqueId from device");
            MeasurableDevice measurableDeviceB = dmp.d().b(this.mProductId);
            if (measurableDeviceB != null) {
                String uniqueId = measurableDeviceB.getUniqueId();
                this.mUniqueId = uniqueId;
                this.mContentValues.put("uniqueId", uniqueId);
                this.mContentValues.put("productId", this.mProductId);
            }
        }
        LogUtil.a(TAG, "initData unique ", dyg.b(this.mUniqueId));
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        this.mProductInfo = elhVarD;
        if (elhVarD != null) {
            this.mKind = elhVarD.m();
        } else {
            LogUtil.j(TAG, "initData mProductInfo is null");
        }
        MeasurableDevice measurableDeviceB2 = dmp.d().b(this.mUniqueId, false);
        if (measurableDeviceB2 != null && (measurableDeviceB2 instanceof eby)) {
            this.mWiFiDevice = (eby) measurableDeviceB2;
            LogUtil.a(TAG, "initData this device is change type");
            this.mDevId = this.mWiFiDevice.e();
            ClaimWeightDataManager.INSTANCE.registerCallBack(getClass().getSimpleName(), this.commBaseCallback);
            dvr.a().c(this.mWiFiDevice);
            dxn.c(TAG_RELEASE, this.mainActivity, this.mWiFiDevice, this.mUniqueId);
        }
        dyj.c(this.mainActivity, measurableDeviceB2, this.mProductId, this.mUniqueId);
    }

    private void getBindByisNfc() {
        if (dxm.v(this.mProductId) && !dxi.c(this.mHuid, this.mainActivity, TAG)) {
            boolean z = getArguments().getBoolean("isNfcConnect");
            this.mIsNfcConnectScales = z;
            if (!z) {
                String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "isNfcConnect" + this.mUniqueId);
                LogUtil.a(TAG, "isNfcConnectResult = ", strE);
                if ("true".equals(strE)) {
                    this.mIsNfcConnectScales = true;
                    return;
                } else {
                    LogUtil.a(TAG, "getBooleanExtra mIsNfcCommect from sharePreference = ", Boolean.valueOf(this.mIsNfcConnectScales));
                    this.mIsNfcConnectScales = false;
                    return;
                }
            }
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "isNfcConnect" + this.mUniqueId, this.mIsNfcConnectScales + "", null);
            StringBuilder sb = new StringBuilder("isNfcConnect");
            sb.append(this.mUniqueId);
            LogUtil.a(TAG, "set mIsNfcConnectScales = ", sb.toString());
            return;
        }
        LogUtil.j(TAG, "current device manage is current user");
    }

    private void initUnitType() {
        setWeightUnitResult(dvr.a().b());
    }

    public void updateItemView(final String str) {
        if (getActivity() == null) {
            LogUtil.j(TAG, "updateItemView getActivity is null");
        } else {
            getActivity().runOnUiThread(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m861x874d60e6(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$updateItemView$7$com-huawei-health-device-ui-measure-fragment-HagridDeviceManagerFragment, reason: not valid java name */
    /* synthetic */ void m861x874d60e6(String str) {
        dwe dweVarCreateSettingItem = createSettingItem(18, getViewString(R.string.IDS_device_rope_wifi_log), "", str);
        HagridDeviceManagerAdapter hagridDeviceManagerAdapter = this.mAdapter;
        if (hagridDeviceManagerAdapter != null) {
            hagridDeviceManagerAdapter.d(18, dweVarCreateSettingItem);
            this.mAdapter.c(dweVarCreateSettingItem);
        }
    }

    public void setWeightUnitResult(int i) {
        if (i == 1) {
            this.mAdapter.c(createSettingItem(15, getViewString(R.string.IDS_hw_device_body_scale_show_unit), "", getViewString(R.string.IDS_unit_kg)));
        } else if (i == 3) {
            this.mAdapter.c(createSettingItem(15, getViewString(R.string.IDS_hw_device_body_scale_show_unit), "", getViewString(R.string.IDS_device_weight_value_g)));
        } else if (i == 2) {
            this.mAdapter.c(createSettingItem(15, getViewString(R.string.IDS_hw_device_body_scale_show_unit), "", getViewString(R.string.IDS_device_measure_weight_value_unit_eng)));
        } else {
            this.mAdapter.c(createSettingItem(15, getViewString(R.string.IDS_hw_device_body_scale_show_unit), "", ""));
        }
        LogUtil.a(TAG, "setWeightUnitResult mUnitType", String.valueOf(i));
    }

    private String getViewString(int i) {
        return BaseApplication.getContext().getResources().getString(i);
    }

    private void initItemList(List<dwe> list) {
        list.clear();
        showClaimDataView();
        list.add(createSettingItem(15, getViewString(R.string.IDS_hw_device_body_scale_show_unit), "", ""));
        this.mIsWaitForAccountInfo = false;
        if (dxm.ai(this.mProductId) || dxm.q(this.mProductId)) {
            list.add(createSettingItem(9, getViewString(R.string.IDS_settings_restore_factory_settings), "", ""));
            addMiniScaleItems(list);
        } else if (this.mWiFiDevice != null) {
            MeasurableDevice measurableDeviceB = dmp.d().b(this.mUniqueId, true);
            if (this.mWiFiDevice.a().m() == 1) {
                LogUtil.a(TAG, "is manager addHagridWifiManagerItems");
                addHagridWifiManagerItems(list);
            } else {
                addNonManagerItems(measurableDeviceB, list);
            }
        } else {
            LogUtil.a(TAG, "is only BLE device add updateItem");
            this.mIsWaitForAccountInfo = true;
            addHagridBleItems(list);
        }
        if (!Utils.o() && !CommonUtil.bu() && dxm.am(this.mProductId)) {
            list.add(createSettingItem(18, getViewString(R.string.IDS_device_rope_wifi_log), "", ""));
            list.add(createSettingItem(19, getViewString(R.string.IDS_device_rope_beta_upload), "", ""));
        }
        if (dxm.as(this.mProductId)) {
            addHelpCustomerServiceItem(list);
        }
    }

    private void addHelpCustomerServiceItem(List<dwe> list) {
        int i;
        if (CommonUtil.ap()) {
            LogUtil.j(TAG, "beta app not support");
            return;
        }
        if (CommonUtil.ca()) {
            ReleaseLogUtil.e(TAG_RELEASE, "store demo version not support");
            return;
        }
        if (!Utils.h()) {
            ReleaseLogUtil.e(TAG_RELEASE, "is not login status");
            return;
        }
        int iN = CommonUtil.n(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
        ReleaseLogUtil.d(TAG_RELEASE, "siteId : ", Integer.valueOf(iN));
        if (iN != 1 || LanguageUtil.o(this.mainActivity) || LanguageUtil.q(this.mainActivity)) {
            if (OnlineImUtil.isShowOnlineEntry()) {
                i = R.string.IDS_hw_personal_cetenr_help_customer_service;
            } else {
                i = R.string.IDS_hwh_health_vo2max_help;
            }
            list.add(createSettingItem(20, getViewString(i), "", ""));
        }
    }

    private void addNonManagerItems(MeasurableDevice measurableDevice, List<dwe> list) {
        String str;
        if (measurableDevice == null) {
            LogUtil.j(TAG, "initItemList the device is not exist");
            return;
        }
        if (qrs.ah(BaseApplication.getContext())) {
            str = String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_pad_device_auto_sync_data), new Object[0]);
        } else {
            str = String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_device_request_wlan_auto_sync_data_sub_content), new Object[0]);
        }
        LogUtil.a(TAG, "initItemList getDeviceManagerStatus is", Boolean.valueOf(dxi.b(this.mUniqueId)));
        if ((measurableDevice instanceof efx) && !dxi.b(this.mUniqueId)) {
            list.add(createSettingItem(13, getViewString(R.string.IDS_device_wifi_config_network), str, ""));
        } else {
            list.add(createSettingItem(12, getViewString(R.string.IDS_device_user_manager), "", ""));
        }
        LogUtil.a(TAG, "initItemList mIsNfcConnectScales is", Boolean.valueOf(this.mIsNfcConnectScales));
        if (!this.mIsNfcConnectScales) {
            list.add(createSettingItem(9, getViewString(R.string.IDS_settings_restore_factory_settings), "", ""));
        }
        if (measurableDevice instanceof eby) {
            return;
        }
        list.add(getUpdateItem());
    }

    private void showWeightDataView() {
        if (!(getActivity() instanceof DeviceMainActivity)) {
            LogUtil.j(TAG, "getActivity() is not instantof DeviceMainActivity");
            return;
        }
        DeviceMainActivity deviceMainActivity = (DeviceMainActivity) getActivity();
        if (deviceMainActivity != null && deviceMainActivity.f()) {
            this.mWeightDataFromSmartLifeLayout.setVisibility(0);
            this.mWeightValueLayoutContainer.setVisibility(8);
            this.mWeightLayoutContainer.setVisibility(8);
        } else {
            this.mWeightDataFromSmartLifeLayout.setVisibility(8);
            this.mWeightValueLayoutContainer.setVisibility(0);
            this.mWeightLayoutContainer.setVisibility(0);
        }
    }

    public void showClaimDataView() {
        if (dxm.an(this.mProductId)) {
            this.mGuestMeasureLayout.setVisibility(8);
            this.mWeightDataClaimText.setText(getViewString(R.string.IDS_hw_device_weight_guest_measurement));
            this.mWeightDataClaimText.setTextColor(this.mainActivity.getResources().getColor(R.color.textColorPrimary));
            this.mWeightDataClaimImg.setImageResource(R.drawable.ic_guest_measure);
            this.mWeightDataClaimImg.setImageDrawable(this.mainActivity.getResources().getDrawable(R.drawable.ic_guest_measure));
            this.mWeightDataClaimRedPointImage.setVisibility(8);
            if (dxm.q(this.mProductId)) {
                this.mHagrideWeightDataManagerLayout.setVisibility(0);
                return;
            }
            return;
        }
        this.mHagrideWeightDataManagerLayout.setVisibility(8);
        this.mWeightDataClaimText.setText(getViewString(R.string.IDS_device_wifi_scale_manager));
        this.mWeightDataClaimText.setTextColor(this.mainActivity.getResources().getColor(R.color.textColorPrimary));
        this.mWeightDataClaimImg.setImageResource(R.drawable.ic_setup_list_data);
        this.mWeightDataClaimImg.setImageDrawable(this.mainActivity.getResources().getDrawable(R.drawable.ic_setup_list_data));
        this.mWeightDataClaimRedPointImage.setVisibility(8);
    }

    private void addHagridWifiManagerItems(List<dwe> list) {
        String str;
        list.add(createSettingItem(16, getViewString(R.string.IDS_device_hygride_manager_settings), "", ""));
        list.add(createSettingItem(12, getViewString(R.string.IDS_device_user_manager), "", ""));
        if (qrs.ah(BaseApplication.getContext())) {
            str = String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_pad_device_auto_sync_data), new Object[0]);
        } else {
            str = String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_device_request_wlan_auto_sync_data_sub_content), new Object[0]);
        }
        LogUtil.a(TAG, "addHagridWifiManagerItems show config network");
        list.add(createSettingItem(13, getViewString(R.string.IDS_device_wifi_config_network), str, ""));
        list.add(createSettingItem(9, getViewString(R.string.IDS_settings_restore_factory_settings), "", ""));
        list.add(getUpdateItem());
    }

    private void addHagridBleItems(List<dwe> list) {
        String str;
        if (!dxi.b(this.mUniqueId)) {
            if (qrs.ah(BaseApplication.getContext())) {
                str = String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_pad_device_auto_sync_data), new Object[0]);
            } else {
                str = String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_device_request_wlan_auto_sync_data_sub_content), new Object[0]);
            }
            LogUtil.a(TAG, "addHagridBleItems show config network");
            list.add(createSettingItem(13, getViewString(R.string.IDS_device_wifi_config_network), str, ""));
        } else {
            LogUtil.a(TAG, "addHagridBleItems show device share! ");
            list.add(createSettingItem(14, getViewString(R.string.IDS_device_user_manager), "", ""));
        }
        LogUtil.a(TAG, "addHagridBleItems mIsNfcConnectScales is", Boolean.valueOf(this.mIsNfcConnectScales));
        if (!this.mIsNfcConnectScales) {
            list.add(createSettingItem(9, getViewString(R.string.IDS_settings_restore_factory_settings), "", ""));
        }
        list.add(getUpdateItem());
    }

    private void addMiniScaleItems(List<dwe> list) {
        list.add(getUpdateItem());
    }

    private dwe getUpdateItem() {
        String viewString;
        if (dxm.ag(this.mProductId)) {
            viewString = getViewString(R.string.IDS_device_scale_device_firmware_version);
        } else {
            viewString = getViewString(R.string.IDS_device_wear_home_device_ota_upgrade);
        }
        return createSettingItem(6, viewString, "", "");
    }

    private String getSubUserNum() throws Throwable {
        String viewString = getViewString(R.string.IDS_device_wifi_scale_sub_user_num);
        eal ealVarA = ecf.a(this.mWiFiDevice.a().c());
        String str = String.format(Locale.ENGLISH, viewString, UnitUtil.e(((ealVarA == null || ealVarA.b()) ? 0 : ealVarA.e().size()) + 1, 1, 0), UnitUtil.e((dxm.u(this.mProductId) || "b29df4e3-b1f7-4e40-960d-4cfb63ccca05".equals(this.mProductId)) ? 10 : 5, 1, 0));
        ean.e(this.mWiFiDevice.e());
        return str;
    }

    public dwe createSettingItem(int i, String str, String str2, String str3) {
        dwe dweVar = new dwe();
        dweVar.d(i);
        dweVar.e(str);
        dweVar.c(str2);
        dweVar.e(true);
        dweVar.b(str3);
        return dweVar;
    }

    private void initViewData() throws Throwable {
        if ("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4".equals(this.mProductId)) {
            this.mDeviceImg.setImageResource(R.drawable.pic_huawei_hagrid_img);
        } else if ("25c6df38-ca23-11e9-a32f-2a2ae2dbcce4".equals(this.mProductId)) {
            this.mDeviceImg.setImageResource(R.drawable.pic_honor_mini_img);
        } else {
            elh elhVarD = ResourceManager.c().d(this.mProductId);
            if (elhVarD != null) {
                String strC = elhVarD.c("device_manager_img");
                if (TextUtils.isEmpty(strC)) {
                    LogUtil.j(TAG, "initViewData img = null");
                    return;
                }
                String strD = elg.e().d(this.mProductId, strC);
                if (TextUtils.isEmpty(strD)) {
                    return;
                }
                Bitmap bitmapC = elo.c(strD);
                if (bitmapC != null) {
                    LogUtil.a(TAG, "initViewData bitmap != null");
                    this.mDeviceImg.setImageBitmap(bitmapC);
                } else {
                    LogUtil.j(TAG, "initViewData bitmap = null");
                }
            }
        }
        if (!TextUtils.isEmpty(this.mProductId) && this.mProductInfo != null) {
            String strH = dxm.h(this.mUniqueId);
            if (TextUtils.isEmpty(dxm.h(this.mUniqueId))) {
                setTitle(elo.a(this.mProductId, this.mProductInfo.l().d()));
            } else {
                setTitle(elo.a(this.mProductId, this.mProductInfo.l().d()) + " - " + strH);
            }
        }
        HagridDeviceManagerAdapter hagridDeviceManagerAdapter = this.mAdapter;
        if (hagridDeviceManagerAdapter == null || hagridDeviceManagerAdapter.a(6) == null) {
            return;
        }
        firmwareVersionRedDot();
    }

    private void firmwareVersionRedDot() {
        if (dxm.v(this.mProductId)) {
            boolean zC = dxn.c(this.mainActivity, this.mUniqueId);
            if (this.mWiFiDevice == null && !dxi.b(this.mUniqueId) && zC) {
                LogUtil.a(TAG, " unconfigured network && no device manager &&  have new version");
                this.mAdapter.a(6).c(true);
                this.mAdapter.notifyDataSetChanged();
                return;
            }
            eby ebyVar = this.mWiFiDevice;
            if (ebyVar != null && ebyVar.a().m() == 1 && zC) {
                LogUtil.a(TAG, " configured network && is main user && have new version");
                this.mAdapter.a(6).c(true);
                this.mAdapter.notifyDataSetChanged();
                return;
            } else {
                this.mAdapter.a(6).c(false);
                this.mAdapter.notifyDataSetChanged();
                return;
            }
        }
        eas easVarB = eas.b();
        eby ebyVar2 = this.mWiFiDevice;
        if (easVarB.j(ebyVar2 != null ? ebyVar2.e() : "") && this.mWiFiDevice.a().m() == 1) {
            this.mAdapter.a(6).c(true);
            this.mAdapter.notifyDataSetChanged();
        } else {
            this.mAdapter.a(6).c(false);
            this.mAdapter.notifyDataSetChanged();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.mStartMeasureTextView) {
            checkBluetoothPermissions();
            return;
        }
        if (view == this.mHagrideUserGuideLayout) {
            dealClickUserGuide();
            return;
        }
        if (view == this.mHagrideWeightDataClaimLayout) {
            LogUtil.a(TAG, "click mHagrideWeightDataClaimLayout");
            if (this.mWeightDataClaimText.getText().toString().equals(getResources().getString(R.string.IDS_device_wifi_scale_manager))) {
                LogUtil.a(TAG, "mHagrideWeightDataClaimLayout scale data manage");
                dealDataManager();
                return;
            } else {
                if (this.mWeightDataClaimText.getText().toString().equals(getResources().getString(R.string.IDS_hw_device_weight_guest_measurement))) {
                    LogUtil.a(TAG, "mHagrideWeightDataClaimLayout guest measure");
                    dealClickWeightDataClaim();
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("productId", this.mProductId);
                intent.setClassName(this.mainActivity, "com.huawei.ui.main.stories.health.activity.healthdata.ClaimMeasureDataActivity");
                try {
                    this.mainActivity.startActivity(intent);
                    return;
                } catch (ActivityNotFoundException unused) {
                    LogUtil.e(TAG, "onClick startActivity ActivityNotFoundException occur.");
                    return;
                }
            }
        }
        if (view == this.mHagrideWeightDataManagerLayout) {
            dealDataManager();
            return;
        }
        if (view == this.mShowMoreDataLayout) {
            era.e(this.mainActivity);
        } else if (view == this.mGuestMeasureLayout) {
            LogUtil.a(TAG_RELEASE, "click mGuestMeasureLayout.");
            dealClickWeightDataClaim();
        } else {
            LogUtil.j(TAG_RELEASE, "Click invalid.");
        }
    }

    private void dealClickUserGuide() {
        if (dys.a().e(this.mainActivity, this.mUniqueId)) {
            LogUtil.j(TAG, "onclick mHagrideUserGuideLayout pair invalid and bluetooth switch is off");
        } else {
            dvh.e(this.mainActivity, this.mUniqueId, this.mProductId, this.mUrl, this);
        }
    }

    private void dealClickWeightDataClaim() {
        if (dys.a().e(this.mainActivity, this.mUniqueId)) {
            LogUtil.j(TAG, "onclick mWeightDataClaimText or mGuestMeasureLayout pair invalid and bluetooth switch is off");
        } else {
            gotoGuestUserInfoGuidFragment();
        }
    }

    private void checkBluetoothPermissions() {
        if (Build.VERSION.SDK_INT > 30 && PermissionUtil.e(this.mainActivity, PermissionUtil.PermissionType.SCAN) != PermissionUtil.PermissionResult.GRANTED) {
            PermissionUtil.d(this.mainActivity, PermissionUtil.PermissionType.SCAN, new CustomPermissionAction(this.mainActivity) { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment.3
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a(HagridDeviceManagerFragment.TAG, "startMeasure doActionWithPermissions onGranted");
                    HagridDeviceManagerFragment.this.startMeasure();
                }
            });
        } else {
            startMeasure();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startMeasure() {
        LogUtil.a(TAG, "enter checkBluetoothEnabled");
        if (BluetoothAdapter.getDefaultAdapter() == null || getActivity() == null) {
            LogUtil.e(TAG, "checkBluetoothEnabled BluetoothAdapter or getActivity is null");
            return;
        }
        if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            LogUtil.a(TAG, "click mStartMeasureTextView");
            MeasurableDevice measurableDeviceB = dmp.d().b(this.mUniqueId, true);
            if (measurableDeviceB == null) {
                LogUtil.j(TAG, "device is null");
                return;
            } else if (!(measurableDeviceB instanceof efx)) {
                LogUtil.a(TAG, "device is not bound, jump to bond page");
                startPaireGuide();
                return;
            } else {
                startBleMeasure();
                return;
            }
        }
        dys.a().c(this.mainActivity, 2);
    }

    private void startPaireGuide() {
        if (dyn.a().b(this.mDownloadStatus)) {
            if (dxp.b()) {
                downloadIndexAllResources();
            } else {
                dvh.b(getActivity(), this.mProductId, this.mUniqueId);
            }
        }
    }

    private void gotoGuestUserInfoGuidFragment() {
        if (!(dmp.d().b(this.mUniqueId, true) instanceof efx)) {
            LogUtil.j(TAG, "gotoGuestUserInfoGuidFragment is not BleDevice");
            showSelectBindDeviceDialog();
            return;
        }
        LogUtil.d(TAG, "gotoGuestUserInfoGuidFragment className: ", GuestUserInfoGuideFragment.class.getName());
        BaseFragment baseFragmentC = dst.c(GuestUserInfoGuideFragment.class.getName());
        if (baseFragmentC != null) {
            Bundle bundle = new Bundle();
            bundle.putString("productId", this.mProductId);
            bundle.putParcelable("commonDeviceInfo", this.mContentValues);
            bundle.putBoolean("deviceMgrMeasure", true);
            baseFragmentC.setArguments(bundle);
            switchFragment(baseFragmentC);
            return;
        }
        LogUtil.j(TAG, "gotoGuestUserInfoGuidFragment guestMeasureFragment is null");
    }

    private void startBleMeasure() {
        List<dnj> allUser = MultiUsersManager.INSTANCE.getAllUser();
        LogUtil.a(TAG, "startBleMeasure allUser number:", Integer.valueOf(allUser.size()));
        if (allUser.size() <= 1) {
            jumpToMeasureFragment();
            return;
        }
        CustomViewDialog customViewDialogInitCustomViewDialog = initCustomViewDialog();
        this.mCustomViewDialog = customViewDialogInitCustomViewDialog;
        if (customViewDialogInitCustomViewDialog != null && !customViewDialogInitCustomViewDialog.isShowing()) {
            initUserData(allUser);
            ViewGroup.LayoutParams layoutParams = this.mUserLayout.getLayoutParams();
            layoutParams.height = dyk.a().c(this.mUserListView, this.mainActivity);
            layoutParams.width = -1;
            this.mUserLayout.setLayoutParams(layoutParams);
            this.mCustomViewDialog.show();
            return;
        }
        LogUtil.j(TAG, "showDialog: mCustomViewDialog is null | isShowing.");
    }

    private void initUserData(List<dnj> list) {
        WeightResultConfirmAdapter weightResultConfirmAdapter = this.mUserAdapter;
        if (weightResultConfirmAdapter == null) {
            LogUtil.j(TAG, "initUserData: mUserAdapter is null.");
            return;
        }
        weightResultConfirmAdapter.a(list);
        HealthTextView healthTextView = this.mAddUserView;
        if (healthTextView != null) {
            healthTextView.setVisibility(this.mUserAdapter.getCount() >= 10 ? 8 : 0);
        }
        String strI = MultiUsersManager.INSTANCE.getCurrentUser().i();
        if (TextUtils.isEmpty(strI)) {
            LogUtil.j(TAG, "initUserData: uuid is empty");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            dnj dnjVar = list.get(i);
            if (dnjVar == null) {
                LogUtil.j(TAG, "initUserData: tmpUser is null");
                return;
            } else {
                if (strI.equals(dnjVar.i())) {
                    this.mUserAdapter.e(i);
                    showSelectionUser(i);
                    return;
                }
            }
        }
    }

    private void showSelectionUser(int i) {
        ListView listView = this.mUserListView;
        if (listView != null) {
            listView.setSelection(i);
        }
    }

    private CustomViewDialog initCustomViewDialog() {
        CustomViewDialog customViewDialog = this.mCustomViewDialog;
        if (customViewDialog != null) {
            return customViewDialog;
        }
        if (getActivity() != null) {
            CustomViewDialog.Builder builder = new CustomViewDialog.Builder(getActivity());
            builder.a(getActivity().getString(R.string.IDS_hw_device_hygride_select_current_measure_user)).d(getDialogView()).d(R.string.IDS_contact_confirm, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m849x6316218(view);
                }
            }).c(R.string.IDS_settings_button_cancal_ios_btn, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m850x20a25b37(view);
                }
            });
            CustomViewDialog customViewDialogD = builder.d();
            this.mCustomViewDialog = customViewDialogD;
            customViewDialogD.setCancelable(false);
        }
        return this.mCustomViewDialog;
    }

    /* JADX INFO: renamed from: lambda$initCustomViewDialog$8$com-huawei-health-device-ui-measure-fragment-HagridDeviceManagerFragment, reason: not valid java name */
    /* synthetic */ void m849x6316218(View view) {
        this.mCustomViewDialog.dismiss();
        int iC = this.mUserAdapter.c();
        Object item = this.mUserAdapter.getItem(iC);
        if (item instanceof dnj) {
            MultiUsersManager.INSTANCE.setCurrentUser((dnj) item);
            jumpToMeasureFragment();
            return;
        }
        LogUtil.e(TAG, "change failed :", Integer.valueOf(iC));
    }

    /* JADX INFO: renamed from: lambda$initCustomViewDialog$9$com-huawei-health-device-ui-measure-fragment-HagridDeviceManagerFragment, reason: not valid java name */
    /* synthetic */ void m850x20a25b37(View view) {
        this.mCustomViewDialog.dismiss();
    }

    private View getDialogView() {
        if (getActivity() == null) {
            return null;
        }
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.weight_measure_result_confirm_dialog_view, (ViewGroup) null, false);
        this.mUserLayout = (LinearLayout) viewInflate.findViewById(R.id.weight_measure_result_confrim_list_layout);
        this.mUserListView = (ListView) viewInflate.findViewById(R.id.weight_measure_result_confrim_user_list);
        WeightResultConfirmAdapter weightResultConfirmAdapter = new WeightResultConfirmAdapter(getActivity(), null);
        this.mUserAdapter = weightResultConfirmAdapter;
        this.mUserListView.setAdapter((ListAdapter) weightResultConfirmAdapter);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.weight_measure_result_confrim_add_new_user_text);
        this.mAddUserView = healthTextView;
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m848x54f409a(view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: lambda$getDialogView$10$com-huawei-health-device-ui-measure-fragment-HagridDeviceManagerFragment, reason: not valid java name */
    /* synthetic */ void m848x54f409a(View view) {
        enterAddNewUser();
    }

    private void enterAddNewUser() {
        try {
            Intent intent = new Intent();
            intent.setPackage(BaseApplication.getAppPackage());
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity");
            intent.putExtra("weight_user_id_key", "");
            intent.putExtra("claimWeightData", true);
            startActivityForResult(intent, 0);
        } catch (IllegalStateException e) {
            LogUtil.e(TAG, "enterAddNewUser occur IllegalStateException: ", ExceptionUtils.c(e));
        }
    }

    private void jumpToMeasureFragment() {
        BaseFragment baseFragmentA = dst.a(this.mKind.name());
        if (baseFragmentA != null) {
            Bundle bundle = new Bundle();
            bundle.putString("view", "measure");
            bundle.putString("kind", this.mKind.name());
            bundle.putParcelable("commonDeviceInfo", this.mContentValues);
            bundle.putString("goback", "hygride");
            bundle.putBoolean("status", isBluetoothConnect());
            bundle.putBoolean("deviceMgrMeasure", true);
            bundle.putInt("type", -1);
            baseFragmentA.setArguments(bundle);
            switchFragment(baseFragmentA);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        LogUtil.a(TAG, BaseDialog.LIFE_CYCLE_ON_RESUME);
        super.onResume();
        dvr.a().c();
        getBindByisNfc();
        ean.c(this.mainActivity, this.mWiFiDevice, this.mProductInfo);
        refreshSubUserNum();
        refreshWifiName();
        if (dmp.d().b(this.mUniqueId, true) != null && this.mWeightInteractor != null && dyk.a().a(this.mUniqueId)) {
            LogUtil.j(TAG, "mWeightInteractor onResume");
            this.mWeightInteractor.a(this.mainActivity);
            this.mWeightInteractor.onResume();
        }
        if (!dxm.ai(this.mProductId) && !dxm.q(this.mProductId) && !this.myHandler.hasMessages(3)) {
            this.myHandler.sendEmptyMessageDelayed(3, ProfileExtendConstants.TIME_OUT);
        }
        initManager();
        this.mEventManager.c();
        refreshUnreadMsgNum();
        ClaimWeightDataManager.INSTANCE.queryBluetoothClaimData();
        showClaimDataView();
        showWeightDataView();
        showConfigureAutoUpgrade();
    }

    private void showConfigureAutoUpgrade() {
        if (this.mainActivity == null) {
            LogUtil.j(TAG, "showConfigureAutoUpgradeDialog mainActivity is null");
            return;
        }
        if (!dxm.v(this.mProductId)) {
            LogUtil.j(TAG, "showConfigureAutoUpgradeDialog is not new hag");
            return;
        }
        if (dyk.a().e("hagridConfigureAutoUpgrade", 1, this.mUniqueId) < 1) {
            LogUtil.j(TAG, "showConfigureAutoUpgradeDialog day less than one");
            return;
        }
        eby ebyVar = this.mWiFiDevice;
        if (ebyVar == null) {
            LogUtil.j(TAG, "showConfigureAutoUpgradeDialog is not WiFiDevice");
            return;
        }
        if (ebyVar.a().m() != 1) {
            LogUtil.j(TAG, "showConfigureAutoUpgradeDialog is not main user");
            return;
        }
        if (!dxn.c(this.mainActivity, this.mUniqueId)) {
            LogUtil.j(TAG, "showConfigureAutoUpgradeDialog is not new version");
            return;
        }
        String strE = eas.e(this.mWiFiDevice.e());
        LogUtil.a(TAG, "showConfigureAutoUpgradeDialog autoUpgradeStatus:", strE);
        if ("0".equals(strE)) {
            showConfigureAutoUpgradeDialog();
        } else {
            LogUtil.j(TAG, "showConfigureAutoUpgradeDialog auto upgrade status open");
        }
    }

    private void showConfigureAutoUpgradeDialog() {
        View viewInflate = getActivity().getLayoutInflater().inflate(R.layout.configure_atuo_upgrade_dialog, (ViewGroup) null);
        final HealthCheckBox healthCheckBox = (HealthCheckBox) viewInflate.findViewById(R.id.id_device_auto_upgrade_switch);
        dys.a().b(this.mainActivity, viewInflate, new ScaleDialogCallback() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment$$ExternalSyntheticLambda2
            @Override // com.huawei.health.device.callback.ScaleDialogCallback
            public final void operationResult(int i) {
                this.f$0.m856x2d017b7c(healthCheckBox, i);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showConfigureAutoUpgradeDialog$11$com-huawei-health-device-ui-measure-fragment-HagridDeviceManagerFragment, reason: not valid java name */
    /* synthetic */ void m856x2d017b7c(HealthCheckBox healthCheckBox, int i) {
        if (i == 0) {
            LogUtil.a(TAG, "showConfigureAutoUpgradeDialog to upgrade");
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "hagridConfigureAutoUpgrade" + this.mUniqueId, String.valueOf(System.currentTimeMillis()), null);
            dyk.a().d(healthCheckBox, this.mWiFiDevice);
            upgradeForWiFi();
            return;
        }
        LogUtil.a(TAG, "showConfigureAutoUpgradeDialog is cancel");
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "hagridConfigureAutoUpgrade" + this.mUniqueId, String.valueOf(System.currentTimeMillis()), null);
        dyk.a().d(healthCheckBox, this.mWiFiDevice);
    }

    public void refreshSubUserNum() {
        eby ebyVar = this.mWiFiDevice;
        if (ebyVar == null || this.mAdapter == null) {
            return;
        }
        if (ebyVar.a().m() == 1) {
            this.mAdapter.c(createSettingItem(12, getViewString(R.string.IDS_device_user_manager), "", getSubUserNum()));
        } else {
            subUserRefreshNum();
        }
    }

    private void subUserRefreshNum() {
        WifiDeviceShareMemberInfoBySubUserReq wifiDeviceShareMemberInfoBySubUserReq = new WifiDeviceShareMemberInfoBySubUserReq();
        wifiDeviceShareMemberInfoBySubUserReq.setDevId(this.mDevId);
        lqo.b(this.mainActivity).c(wifiDeviceShareMemberInfoBySubUserReq, new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment$$ExternalSyntheticLambda12
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f$0.m860xbb16452a((CloudCommonReponse) obj, str, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$subUserRefreshNum$13$com-huawei-health-device-ui-measure-fragment-HagridDeviceManagerFragment, reason: not valid java name */
    /* synthetic */ void m860xbb16452a(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        if (this.mainActivity != null && z) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("members");
                if (jSONArray != null && jSONArray.length() > 0) {
                    final int length = jSONArray.length();
                    this.mainActivity.runOnUiThread(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m859xa0a54c0b(length);
                        }
                    });
                    return;
                }
                LogUtil.j(TAG, "AuthorizeSubUser members is zero");
                return;
            } catch (JSONException unused) {
                LogUtil.e(TAG, "AuthorizeSubUser members is JSONException");
                return;
            }
        }
        LogUtil.j(TAG, "getMemberInfoBySubUser fail");
    }

    /* JADX INFO: renamed from: lambda$subUserRefreshNum$12$com-huawei-health-device-ui-measure-fragment-HagridDeviceManagerFragment, reason: not valid java name */
    /* synthetic */ void m859xa0a54c0b(int i) {
        this.mAdapter.c(createSettingItem(12, getViewString(R.string.IDS_device_user_manager), "", String.format(Locale.ENGLISH, getViewString(R.string.IDS_device_wifi_scale_sub_user_num), UnitUtil.e(i + 1, 1, 0), UnitUtil.e((dxm.u(this.mProductId) || "b29df4e3-b1f7-4e40-960d-4cfb63ccca05".equals(this.mProductId)) ? 10 : 5, 1, 0))));
    }

    private void refreshWifiName() {
        String str;
        eby ebyVar = this.mWiFiDevice;
        if (ebyVar == null || this.mAdapter == null) {
            return;
        }
        boolean z = ebyVar.a().m() == 1;
        LogUtil.a(TAG, "enter refreshWifiName isMainUser is", Boolean.valueOf(z));
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "hagrid_wifi_ssid" + this.mUniqueId);
        if (TextUtils.isEmpty(strE)) {
            strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "hagrid_wifi_ssid" + this.mProductId);
            if (TextUtils.isEmpty(strE)) {
                strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "hagrid_wifi_ssid");
            }
        }
        if (!z) {
            strE = "";
        }
        if (qrs.ah(BaseApplication.getContext())) {
            str = String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_pad_device_auto_sync_data), new Object[0]);
        } else {
            str = String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_device_request_wlan_auto_sync_data_sub_content), new Object[0]);
        }
        LogUtil.a(TAG, "refreshWifiName mWiFiDevice and nAdapter are not null and show config network ");
        this.mAdapter.c(createSettingItem(13, getViewString(R.string.IDS_device_wifi_config_network), str, strE));
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        doq.e().a();
        MeasurableDevice measurableDeviceB = dmp.d().b(this.mUniqueId, true);
        if (measurableDeviceB != null && !(measurableDeviceB instanceof eby) && this.mWeightInteractor != null && !dxm.aj(this.mProductId)) {
            this.mWeightInteractor.d(false);
            this.mWeightInteractor.onDestroy();
        }
        if (!"devicebind".equals(this.mGoto)) {
            return true;
        }
        this.mainActivity.setResult(-1);
        this.mainActivity.finish();
        return false;
    }

    public boolean isDestory() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            LogUtil.j(TAG_RELEASE, "DeviceMainActivity is null");
            return true;
        }
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            return false;
        }
        LogUtil.j(TAG_RELEASE, "DeviceMainActivity is Destroyed");
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (this.mWiFiDevice != null) {
            ClaimWeightDataManager.INSTANCE.unRegisterCallBack(getClass().getSimpleName());
        }
        PopViewList popViewList = this.mPopView;
        if (popViewList != null && popViewList.c()) {
            LogUtil.a(TAG, "onDestroyView popview dismiss");
            this.mPopView.d();
        }
        LogUtil.a(TAG, "onDestroyView");
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a(TAG, "onDestroy start");
        EventBus.a(this.mEventManager, EVENT_SUBSCRIBE_LIST);
        dvi dviVar = this.myHandler;
        if (dviVar != null) {
            dviVar.removeCallbacksAndMessages(null);
            this.myHandler.c();
            this.myHandler = null;
        }
        CountDownTimer countDownTimer = this.mLoadingConditionTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        destroyLoadingDialog();
        dsz dszVar = this.mConditionBeforeRequestHandler;
        if (dszVar != null) {
            dszVar.removeCallbacksAndMessages(null);
            this.mConditionBeforeRequestHandler.d();
            this.mConditionBeforeRequestHandler = null;
        }
    }

    private void dealDataManager() {
        if (!dxm.c(this.mProductId, this.mUniqueId)) {
            if (isBluetoothConnect()) {
                gotoDataMangerFragment();
                return;
            } else {
                qpx.e(BaseApplication.getContext(), R.string.IDS_plugin_device_weight_device_not_connect);
                return;
            }
        }
        if (dys.a().e(this.mainActivity, this.mUniqueId)) {
            LogUtil.j(TAG, "dealDataManager return");
        } else if (!(dmp.d().b(this.mUniqueId, true) instanceof efx)) {
            LogUtil.a(TAG, "otaUpdate showSelectBindDeviceDialog");
            showSelectBindDeviceDialog();
        } else {
            gotoDataMangerFragment();
        }
    }

    private void gotoDataMangerFragment() {
        LogUtil.a(TAG, "gotoDataMangerFragment");
        Bundle bundle = new Bundle();
        bundle.putParcelable("commonDeviceInfo", this.mContentValues);
        eby ebyVar = this.mWiFiDevice;
        if (ebyVar != null) {
            bundle.putString("deviceId", ebyVar.e());
        }
        WiFiBodyFatScaleDataManagerFragment wiFiBodyFatScaleDataManagerFragment = new WiFiBodyFatScaleDataManagerFragment();
        wiFiBodyFatScaleDataManagerFragment.setArguments(bundle);
        switchFragment(wiFiBodyFatScaleDataManagerFragment);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1001) {
            configWifi();
        }
        if (i == 1001 && i2 == 10005) {
            LogUtil.j(TAG, "privacy result enter");
            if (intent == null) {
                LogUtil.j(TAG, "onActivityResult data is null");
                return;
            } else if (intent.getBooleanExtra("revoke_honor_privacy", false)) {
                dwq.c(false);
                dvk.b().e(dmp.d().b(this.mUniqueId, false));
            }
        }
        if (intent == null) {
            LogUtil.j(TAG, "onActivityResult data is null");
            return;
        }
        if (i2 == 1) {
            String stringExtra = intent.getStringExtra(HwPayConstant.KEY_USER_ID);
            if (TextUtils.isEmpty(stringExtra)) {
                LogUtil.j(TAG, "onActivityResult userId is null");
                return;
            }
            dnj singleUserById = MultiUsersManager.INSTANCE.getSingleUserById(stringExtra);
            if (singleUserById == null) {
                LogUtil.j(TAG, "onActivityResult newUser is null");
            } else {
                MultiUsersManager.INSTANCE.setCurrentUser(singleUserById);
                initUserData(MultiUsersManager.INSTANCE.getAllUser());
            }
        }
    }

    public void startVersionActivity(boolean z) {
        if (this.mWeightInteractor.c()) {
            Intent intent = new Intent();
            intent.setPackage(this.mainActivity.getPackageName());
            intent.setClassName(this.mainActivity.getPackageName(), "com.huawei.ui.device.activity.update.WeightUpdateVersionActivity");
            intent.putExtra("productId", this.mProductId);
            intent.putExtra("commonDeviceInfo", this.mContentValues);
            if (dxm.a(this.mProductId, this.mUniqueId)) {
                intent.putExtra("isUpdateDialog", true);
            } else {
                intent.putExtra("fromsetting", true);
            }
            intent.putExtra("user_type", z);
            startActivityForResult(intent, 1001);
            return;
        }
        qpx.a(BaseApplication.getContext(), R.string.IDS_plugin_device_weight_device_not_connect);
    }

    public void dealWithLoadingResult(boolean z) {
        CommonDialog21 commonDialog21;
        dsz dszVar;
        if (getActivity() == null || getActivity().isFinishing() || (commonDialog21 = this.mLoadingDialog) == null || !commonDialog21.isShowing()) {
            LogUtil.j(TAG_RELEASE, "dealLoadingResult: deal with loading result fail");
            return;
        }
        if (z && (dszVar = this.mConditionBeforeRequestHandler) != null) {
            dszVar.sendEmptyMessage(11);
            return;
        }
        dsz dszVar2 = this.mConditionBeforeRequestHandler;
        if (dszVar2 != null) {
            dszVar2.sendEmptyMessage(12);
        }
    }

    public void showSelectBindDeviceDialog() {
        if (dyn.a().b(this.mDownloadStatus)) {
            dys.a().b(this.mainActivity, new ScaleDialogCallback() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment$$ExternalSyntheticLambda13
                @Override // com.huawei.health.device.callback.ScaleDialogCallback
                public final void operationResult(int i) {
                    this.f$0.m857x8c97241(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$showSelectBindDeviceDialog$14$com-huawei-health-device-ui-measure-fragment-HagridDeviceManagerFragment, reason: not valid java name */
    /* synthetic */ void m857x8c97241(int i) {
        if (i == 0) {
            if (dxp.b()) {
                downloadIndexAllResources();
                return;
            } else {
                dvh.b(this.mainActivity, this.mProductId, this.mUniqueId);
                return;
            }
        }
        LogUtil.j(TAG, "showSelectBindDeviceDialog negative");
    }

    public void setHuidType(int i) {
        this.mGetHuidType = i;
    }

    public int getHuidType() {
        return this.mGetHuidType;
    }

    public void setHuid(byte[] bArr) {
        this.mHuid = bArr == null ? null : (byte[]) bArr.clone();
    }

    public byte[] getHuid() {
        byte[] bArr = this.mHuid;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    public void setMainUser(boolean z) {
        this.mIsMainUser = z;
    }

    public boolean isMainUser() {
        return this.mIsMainUser;
    }

    public void setDevId(String str) {
        this.mDevId = str;
    }

    public ContentValues getContentValues() {
        return this.mContentValues;
    }

    public eby getWiFiDevice() {
        return this.mWiFiDevice;
    }

    public void setWiFiDevice(eby ebyVar) {
        this.mWiFiDevice = ebyVar;
    }

    public elh getProductInfo() {
        return this.mProductInfo;
    }

    public dti getWeightInteractor() {
        return this.mWeightInteractor;
    }

    public String getProductId() {
        return this.mProductId;
    }

    public HagridDeviceManagerAdapter getAdapter() {
        return this.mAdapter;
    }

    public Activity getMainActivity() {
        return this.mainActivity;
    }

    public boolean isClickDeviceVersionUpdateItem() {
        return this.mIsClickDeviceVersionUpdateItem;
    }

    public String getUniqueId() {
        return this.mUniqueId;
    }
}
