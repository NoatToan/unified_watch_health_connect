package com.huawei.health.ecologydevice.ui.measure.fragment;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.huawei.ecologydevice.R;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.api.DeviceInfoUtilsApi;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.device.manager.ResourceFileListener;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.callback.IdialogButtonClickCallback;
import com.huawei.health.ecologydevice.callback.RopeDeviceDataListener;
import com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack;
import com.huawei.health.ecologydevice.fitness.datastruct.DeviceInformation;
import com.huawei.health.ecologydevice.fitness.datastruct.SwitchStatusData;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.DeviceInfoFragment;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.dxw;
import defpackage.efj;
import defpackage.ehp;
import defpackage.ehr;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.emd;
import defpackage.emh;
import defpackage.emj;
import defpackage.eqw;
import defpackage.era;
import defpackage.esk;
import defpackage.etg;
import defpackage.etk;
import defpackage.etn;
import defpackage.lmf;
import defpackage.nio;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseRopeIntroductionFragment extends ProductFragment implements RopeDeviceDataListener, ResourceFileListener {
    private static final int AUTO_CONNECT_DEVICE_DELAYED = 500;
    private static final int AUTO_CONNECT_ROPE_DEVICE = 105;
    private static final String BATTERY_NORMAL_KEY = "battery_normal_key";
    private static final String HUAWEI_FIT = "HUAWEI FIT";
    public static final String KEY_FROM_SCAN = "IsFromScan";
    private static final int LRU_CACHE_SIZE = 1048576;
    private static final int MAX_CONNECTION_FAILURES = 3;
    private static final String METIS_PRODUCTID = "9323f6b7-b459-44f4-a698-988d1769832a";
    private static final String NFC = "NFC";
    private static final String OPCODE_DELETE = "Delete";
    private static final String QRCODE = "QRCODE";
    private static final int REMOVE = 2;
    private static final String ROPE_DEVICE_INFO = "rope_device_info";
    private static final String SCAN = "SCAN";
    private static final int SELECTING_AUTHORIZATION_FUNCTION = 116;
    private static final int SHOW_CONNECTION_NOTE_DIALOG = 104;
    private static final String SP_BATTERY_NUM = "sp_battery_num";
    private static final String SP_DEVICE_INFO = "RopeDeviceIntroductionSp";
    private static final String TAG = "BaseRopeIntroductionFragment";
    private static final int UPDATE_ROPE_SKIPPING_BATTERY_STATUS = 107;
    private static final int UPDATE_ROPE_SKIPPING_CONNECTION_STATUS = 109;
    private static final int UPDATE_ROPE_SKIPPING_DATA = 106;
    private static final int UPDATE_ROPE_SKIPPING_DEVICE_INFO = 108;
    private static final int UPDATE_ROPE_SKIPPING_RESOURCE_FILE = 110;
    private static final int UPDATE_ROPE_SKIPPING_REVERSE_CONTROL = 114;
    private static final int UPDATE_ROPE_SKIPPING_ROPE_CONFIG_SETTING = 115;
    private static final int UPDATE_ROPE_SKIPPING_ROPE_CONFIG_SWITCH = 117;
    private static final int UPDATE_ROPE_SKIPPING_SET_DEFAULT_VALUE = 111;
    private static final int UPDATE_ROPE_SKIPPING_SET_MONTH_DATA = 112;
    private static final int UPDATE_ROPE_SKIPPING_SET_ROPE_MODE = 113;
    private ImageView mBatteryIconIv;
    private String mBatteryKey;
    private LinearLayout mBatteryLayout;
    private int mBatteryValue;
    private HealthTextView mBatteryValueTv;
    private HealthTextView mConnectStatusTv;
    private CustomViewDialog mConnectionNoteDialog;
    private LinearLayout mContainerLayout;
    private ImageView mDeviceImageIv;
    protected DeviceInformation mDeviceInformation;
    private String mEnterType;
    private boolean mIsNeedProgressBarVisiable;
    protected String mMacAddress;
    private LinearLayout mMarketingLayout;
    private RelativeLayout mPerformanceLayout;
    private LinearLayout mPersonalPerformanceLayout;
    private PopViewList mPopViewList;
    private HealthProgressBar mReconnectLoadingPb;
    private HealthTextView mReconnectTv;
    protected emd mRopeDeviceDataManager;
    protected ViewGroup mRopeHistoryLayout;
    private long mStartConnectTime;
    protected String mTitle;
    protected ArrayList<String> mMoreMenuList = new ArrayList<>();
    private HealthDevice.HealthDeviceKind mKind = HealthDevice.HealthDeviceKind.HDK_ROPE_SKIPPING;
    private RopeDeviceHandler mRopeDeviceHandler = new RopeDeviceHandler();
    private int mReconnectionTime = 0;
    private LruCache<String, Bitmap> mBitmapLruCache = new LruCache<>(1048576);
    private ArrayList<String> mImagePathList = new ArrayList<>(10);
    private boolean mIsOtaUpdate = false;

    protected abstract int getLayoutId();

    protected abstract void initChildView();

    protected void initDefaultRopeView() {
    }

    @Override // com.huawei.health.ecologydevice.callback.RopeDeviceDataListener
    public void onQuaryTrackDetailDataSuccess() {
    }

    protected void refreshLastRopeDataUi() {
    }

    protected void refreshMonthDataUi() {
    }

    protected void selectingAuthorizationFunction() {
    }

    protected void startReverseControl() {
    }

    protected void updataRopeConfigSetting() {
    }

    protected void updateRopeMode() {
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a(TAG, "in onCreate");
        this.mNeedOpenBlueTooth = true;
        ResourceManager.c().e(this);
        if (getArguments() != null) {
            ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
            if (contentValues != null) {
                this.mProductId = contentValues.getAsString("productId");
                this.mUniqueId = contentValues.getAsString("uniqueId");
            }
            LogUtil.d(TAG, "Rope device product id:", this.mProductId, ",mCode:", etk.c(this.mUniqueId));
            emd emdVar = new emd(this.mProductId, this.mUniqueId, this);
            this.mRopeDeviceDataManager = emdVar;
            this.mProductInfo = emdVar.f();
            String bondedDeviceAddress = ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).getBondedDeviceAddress(this.mProductId, this.mUniqueId);
            this.mMacAddress = bondedDeviceAddress;
            if (!TextUtils.isEmpty(bondedDeviceAddress)) {
                this.mBatteryKey = nio.e(this.mMacAddress);
            } else {
                this.mBatteryKey = BATTERY_NORMAL_KEY;
            }
            int iC = SharedPreferenceManager.c(SP_BATTERY_NUM, this.mBatteryKey, 0);
            this.mBatteryValue = iC;
            this.mIsNeedProgressBarVisiable = iC == 0;
        }
        if (this.mMacAddress != null && getContext() != null) {
            String strB = SharedPreferenceManager.b(SP_DEVICE_INFO, this.mMacAddress, "");
            if (!TextUtils.isEmpty(strB)) {
                this.mDeviceInformation = (DeviceInformation) new Gson().fromJson(strB, DeviceInformation.class);
            }
        }
        handleUpdateProductMap();
        setSportTypeToSharePreference(this.mainActivity, 283);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater == null) {
            LogUtil.j(TAG, "RopeDeviceIntroductionFragment onCreateView inflater is null");
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            return null;
        }
        LogUtil.a(TAG, "in onCreateView");
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        View viewInflate = layoutInflater.inflate(R.layout.base_rope_device_introduction_layout, viewGroup, false);
        if (viewGroup2 != null) {
            viewGroup2.addView(viewInflate);
            initView(viewInflate);
            this.child = layoutInflater.inflate(getLayoutId(), viewGroup, false);
            this.mContainerLayout.addView(this.child);
            initChildView();
            initMarketing();
            initUxConfig(new ehr(this.mProductId).a());
        }
        initDeviceInfo();
        if (!TextUtils.isEmpty(this.mUniqueId)) {
            ((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).setDevicesUseTime(this.mUniqueId);
        }
        return viewGroup2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        emj.b().c();
    }

    protected void initUxConfig(ehp ehpVar) {
        if (ehpVar != null) {
            this.mMarketingLayout.setVisibility(ehpVar.h() ? 0 : 8);
        }
        initPerformanceView(ehpVar);
    }

    private void initPerformanceView(ehp ehpVar) {
        if (ehpVar != null) {
            if (ehpVar.d() == null || !ehpVar.d().c()) {
                return;
            }
        } else if (!"true".equals(era.a("isSupportScore", this.mProductId))) {
            return;
        }
        this.mPersonalPerformanceLayout.setVisibility(0);
        this.mPerformanceLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m971x39b4411a(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initPerformanceView$0$com-huawei-health-ecologydevice-ui-measure-fragment-BaseRopeIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m971x39b4411a(View view) {
        addFragment(new RopePerformanceHistoryFragment());
        tickBiRopeLevel2PageBrowsing(this.mainActivity, "rope_performance_history");
    }

    private void initMarketing() {
        int i;
        if (era.f(this.mProductId)) {
            i = 4037;
        } else {
            try {
                i = Integer.parseInt(era.a("marketing_position_id", this.mProductId));
            } catch (NumberFormatException unused) {
                LogUtil.e(TAG, "error Marketing PositionId");
                return;
            }
        }
        final MarketingApi marketingApi = (MarketingApi) Services.b("FeatureMarketing", MarketingApi.class);
        Task<Map<Integer, ResourceResultInfo>> resourceResultInfo = marketingApi.getResourceResultInfo(i);
        resourceResultInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment$$ExternalSyntheticLambda0
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f$0.m970x6f067e28(marketingApi, (Map) obj);
            }
        });
        resourceResultInfo.addOnFailureListener(new OnFailureListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment$$ExternalSyntheticLambda1
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                LogUtil.e(BaseRopeIntroductionFragment.TAG, "initMarketing onFailure ", exc == null ? "" : exc.getMessage());
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initMarketing$1$com-huawei-health-ecologydevice-ui-measure-fragment-BaseRopeIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m970x6f067e28(MarketingApi marketingApi, Map map) {
        if (this.mMarketingLayout == null) {
            LogUtil.j(TAG, "initMarketing mMarketingLayout is null");
            return;
        }
        Iterator<View> it = marketingApi.getMarketingViewList(getContext(), marketingApi.filterMarketingRules((Map<Integer, ResourceResultInfo>) map)).iterator();
        while (it.hasNext()) {
            this.mMarketingLayout.addView(it.next());
        }
    }

    private void initDeviceInfo() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            LogUtil.j(TAG, "getArguments is null");
            return;
        }
        if (arguments.getBoolean(KEY_FROM_SCAN)) {
            this.mEnterType = SCAN;
        } else if (TextUtils.isEmpty(arguments.getString("PAYLOAD_FROM_NFC"))) {
            this.mEnterType = QRCODE;
        } else {
            this.mEnterType = NFC;
        }
        LogUtil.d(TAG, "mEnterType=", this.mEnterType);
    }

    private void initView(View view) {
        this.mCustomTitleBar.setRightButtonVisibility(0);
        Resources resources = BaseApplication.getContext().getResources();
        if (resources != null) {
            this.mCustomTitleBar.setTitleBarBackgroundColor(resources.getColor(R.color.wear_home_bg_color));
        }
        this.mCustomTitleBar.setRightButtonDrawable(this.mainActivity.getResources().getDrawable(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        this.mCustomTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f$0.m972xcd878e8d(view2);
            }
        });
        this.mContainerLayout = (LinearLayout) view.findViewById(R.id.container_layout);
        this.mDeviceImageIv = (ImageView) view.findViewById(R.id.rope_device_image_iv);
        this.mConnectStatusTv = (HealthTextView) view.findViewById(R.id.rope_device_connect_status);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.rope_device_reconnect_tv);
        this.mReconnectTv = healthTextView;
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f$0.m973xfc38f8ac(view2);
            }
        });
        this.mReconnectLoadingPb = (HealthProgressBar) view.findViewById(R.id.rope_device_reconnect_pb);
        this.mBatteryLayout = (LinearLayout) view.findViewById(R.id.rope_device_battery_layout);
        this.mBatteryIconIv = (ImageView) view.findViewById(R.id.rope_device_battery_iv);
        this.mBatteryValueTv = (HealthTextView) view.findViewById(R.id.rope_device_battery_tv);
        this.mPersonalPerformanceLayout = (LinearLayout) view.findViewById(R.id.personal_performance_layout);
        this.mPerformanceLayout = (RelativeLayout) view.findViewById(R.id.performance_layout);
        this.mMarketingLayout = (LinearLayout) view.findViewById(R.id.rope_skip_introduction_marketing);
    }

    /* JADX INFO: renamed from: lambda$initView$3$com-huawei-health-ecologydevice-ui-measure-fragment-BaseRopeIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m972xcd878e8d(View view) {
        showUnbindDeviceMenu();
    }

    /* JADX INFO: renamed from: lambda$initView$4$com-huawei-health-ecologydevice-ui-measure-fragment-BaseRopeIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m973xfc38f8ac(View view) {
        connectToDevice();
    }

    private void handleUpdateProductMap() {
        if (this.mainActivity == null) {
            LogUtil.j(TAG, "handleUpdateProductMap mainActivity is null");
            return;
        }
        final String strB = era.b(this.mProductId);
        if (efj.c().d(this.mainActivity, strB)) {
            efj.c().b(true);
            efj.c().a(this.mKind.name(), strB, new DownloadDeviceInfoCallBack() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment.1
                @Override // com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack
                public void onSuccess() {
                    LogUtil.a(BaseRopeIntroductionFragment.TAG, "onSuccess");
                    efj.c().b(BaseRopeIntroductionFragment.this.mainActivity, strB);
                }

                @Override // com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack
                public void onFailure(int i) {
                    LogUtil.a(BaseRopeIntroductionFragment.TAG, "onFailure");
                }

                @Override // com.huawei.health.ecologydevice.clouddevice.DownloadDeviceInfoCallBack
                public void onNetworkError() {
                    LogUtil.a(BaseRopeIntroductionFragment.TAG, "onNetworkError");
                }
            });
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ProductFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LogUtil.a(TAG, "in onStart");
        onDeviceStateChanged();
        loadResourceFile();
        if (this.mRopeDeviceDataManager == null) {
            LogUtil.j(TAG, "onStart mRopeDeviceDataManager is null");
            return;
        }
        if (this.mRopeHistoryLayout != null) {
            LogUtil.j(TAG, "onStart mRopeHistoryLayout is not null");
            this.mRopeDeviceDataManager.l();
        }
        if (this.mRopeDeviceDataManager.c() != 2 || this.mRopeDeviceHandler == null) {
            return;
        }
        LogUtil.d(TAG, "onStart STATE_CONNECTED");
        this.mRopeDeviceHandler.post(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m974x36270877();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onStart$5$com-huawei-health-ecologydevice-ui-measure-fragment-BaseRopeIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m974x36270877() {
        emd emdVar = this.mRopeDeviceDataManager;
        if (emdVar != null) {
            emdVar.p();
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ProductFragment
    protected void autoConnectDevice() {
        if (this.mRopeDeviceDataManager == null) {
            LogUtil.j(TAG, "mRopeDeviceDataManager is null");
            return;
        }
        this.mMacAddress = ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).getBondedDeviceAddress(this.mProductId, this.mUniqueId);
        this.mRopeDeviceDataManager.e(this.mProductId, this.mUniqueId);
        if (this.mRopeDeviceDataManager.c() == 2) {
            LogUtil.a(TAG, "getBleDeviceState STATE_CONNECTED");
            return;
        }
        CustomViewDialog customViewDialog = this.mConnectionNoteDialog;
        if (customViewDialog != null && customViewDialog.isShowing()) {
            LogUtil.a(TAG, "mConnectionNoteDialog isShowing");
        } else {
            this.mRopeDeviceHandler.sendEmptyMessageDelayed(105, 500L);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ProductFragment, com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getArguments() == null || !OPCODE_DELETE.equals(getArguments().getString("operateCode", ""))) {
            return;
        }
        LogUtil.a(TAG, "in onResume");
        unbindHaveBindingDevice();
        getArguments().remove("operateCode");
    }

    private void loadResourceFile() {
        RopeDeviceHandler ropeDeviceHandler = this.mRopeDeviceHandler;
        if (ropeDeviceHandler != null) {
            Message messageObtainMessage = ropeDeviceHandler.obtainMessage();
            messageObtainMessage.what = UPDATE_ROPE_SKIPPING_RESOURCE_FILE;
            this.mRopeDeviceHandler.sendMessage(messageObtainMessage);
        }
    }

    private boolean checkOtaVersion() {
        DeviceInformation deviceInformation;
        if (this.mProductInfo != null && (deviceInformation = this.mDeviceInformation) != null) {
            int otaVersion = getOtaVersion(deviceInformation.getSoftwareVersion());
            String strC = this.mProductInfo.c("otaVersion");
            if (TextUtils.isEmpty(strC)) {
                return false;
            }
            LogUtil.a(TAG, "softwareVersion = ", Integer.valueOf(otaVersion), " productInfoOtaVersion = ", strC);
            if (otaVersion < getOtaVersion(strC)) {
                return true;
            }
        }
        return false;
    }

    private int getOtaVersion(String str) {
        return qrs.a(str.toLowerCase(Locale.ENGLISH).replace("v", "").replace(".", ""));
    }

    public void setOtaRedPoint(boolean z) {
        if (njy.e(this.mMoreMenuList)) {
            LogUtil.e(TAG, "setOtaRedPoint mMoreMenuList is empty");
        } else if (checkOtaVersion() && !this.mMoreMenuList.contains(File.separator) && z) {
            this.mMoreMenuList.add(File.separator);
            this.mMoreMenuList.add(getResources().getString(R.string.IDS_device_wear_home_device_ota_upgrade));
        }
    }

    private void showUnbindDeviceMenu() {
        if (this.mainActivity == null || this.mCustomTitleBar == null) {
            LogUtil.j(TAG, "mainActivity or mCustomTitleBar is null");
            return;
        }
        if (njy.e(this.mMoreMenuList)) {
            LogUtil.e(TAG, "showUnbindDeviceMenu mMoreMenuList is empty");
            return;
        }
        PopViewList.PopViewClickListener popViewClickListener = new PopViewList.PopViewClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment$$ExternalSyntheticLambda7
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public final void setOnClick(int i) {
                this.f$0.m975x18682477(i);
            }
        };
        this.mPopViewList = new PopViewList(this.mainActivity, this.mCustomTitleBar, this.mMoreMenuList);
        if (!checkOtaVersion()) {
            this.mPopViewList.b(getResources().getString(R.string.IDS_device_wear_home_device_ota_upgrade), 2);
        }
        this.mPopViewList.b(popViewClickListener);
    }

    /* JADX INFO: renamed from: lambda$showUnbindDeviceMenu$6$com-huawei-health-ecologydevice-ui-measure-fragment-BaseRopeIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m975x18682477(int i) {
        String str = this.mMoreMenuList.get(i);
        if (TextUtils.equals(str, getResources().getString(R.string.IDS_device_wear_home_device_ota_upgrade))) {
            if (era.j(this.mProductId)) {
                highRopeOta();
            } else {
                etn.c(this.mainActivity, this.mProductInfo, this.mProductId, this.mUniqueId);
            }
            tickBiRopeLevel2PageBrowsing(this.mainActivity, "OTA");
            return;
        }
        if (TextUtils.equals(str, getResources().getString(R.string.IDS_device_wear_home_delete_device))) {
            unbindHaveBindingDevice();
            return;
        }
        if (TextUtils.equals(str, getResources().getString(R.string.IDS_device_rope_device_info))) {
            goToDeviceInfoFragment();
            return;
        }
        if (TextUtils.equals(str, getResources().getString(R.string.IDS_indoor_skipper_log_collection))) {
            LogUtil.a(TAG, "collect log");
            this.mRopeDeviceDataManager.h();
        } else {
            if (TextUtils.equals(str, getResources().getString(R.string.IDS_home_rope_device_authorization))) {
                RopeDeviceHandler ropeDeviceHandler = this.mRopeDeviceHandler;
                if (ropeDeviceHandler != null) {
                    ropeDeviceHandler.sendEmptyMessage(116);
                    return;
                }
                return;
            }
            LogUtil.a(TAG, "ProductIntroductionFragment showUnbindDeviceMenu else");
        }
    }

    private void highRopeOta() {
        if (this.mRopeDeviceDataManager == null || this.mainActivity == null) {
            LogUtil.j(TAG, "highRopeOta mRopeDeviceDataManager or mainActivity is null");
        } else if (this.mRopeDeviceDataManager.c() != 2) {
            LogUtil.j(TAG, "highRopeOta disconnected");
            qpx.e(this.mainActivity, getResources().getString(R.string.IDS_rope_connect_dialog_title));
        } else {
            this.mRopeDeviceDataManager.s();
            this.mIsOtaUpdate = true;
        }
    }

    private void unbindHaveBindingDevice() {
        LogUtil.a(TAG, "unBindHaveBindDevice to enter");
        final HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("device_name", etn.c(this.mProductId, this.mRopeDeviceDataManager.g()));
        eqw.c(this.mainActivity, new IdialogButtonClickCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment.2
            @Override // com.huawei.health.ecologydevice.callback.IdialogButtonClickCallback
            public void onClick(View view) {
                emh.b().h();
                BaseRopeIntroductionFragment.this.unBindDevice(map);
            }

            @Override // com.huawei.health.ecologydevice.callback.IdialogButtonClickCallback
            public void onCancelClick(View view) {
                LogUtil.a(BaseRopeIntroductionFragment.TAG, "unbindHaveBindingDevice cancle");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unBindDevice(Map<String, Object> map) {
        if (unBindDeviceUniversal(this.mProductId, this.mUniqueId)) {
            ((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).stopMeasure(this.mProductId, this.mUniqueId);
            lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_UNBIND_SUCCEED_2060014.value(), map, 0);
            ResourceManager.c().f();
            popupFragment(null);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ProductFragment
    public void updateUIDisconnect() {
        LogUtil.a(TAG, "upDateUIDisconnect");
        this.mConnectStatusTv.setText(R.string.IDS_device_rope_device_not_connected);
        this.mReconnectLoadingPb.setVisibility(8);
        this.mBatteryLayout.setVisibility(8);
        this.mReconnectTv.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectToDevice() {
        if (this.mRopeDeviceDataManager == null) {
            LogUtil.j(TAG, "mRopeDeviceDataManager is null");
            return;
        }
        try {
            LogUtil.a(TAG, "connectToDevice enter");
            int iB = esk.b().b(this.mainActivity);
            if (iB == 0) {
                ResourceManager.c().f();
                popupFragment(null);
                return;
            }
            if (this.mIsBtEnableShowing) {
                LogUtil.a(TAG, "connectToDevice cancle mIsBtEnableShowing =", Boolean.valueOf(this.mIsBtEnableShowing));
                return;
            }
            if (!checkPermission()) {
                LogUtil.a(TAG, "checkPermission cancle mIsBtEnableShowing =", Boolean.valueOf(this.mIsBtEnableShowing));
                return;
            }
            if (iB != 1) {
                LogUtil.a(TAG, "judgeBlueTooth cancle mIsBtEnableShowing =", Boolean.valueOf(this.mIsBtEnableShowing));
                openBlueTooth(101);
            } else if (getActivity() != null) {
                LogUtil.a(TAG, "mRopeDeviceDataManager connectToDevice");
                this.mRopeDeviceDataManager.a();
                this.mReconnectionTime++;
                this.mStartConnectTime = System.currentTimeMillis();
            }
        } catch (SecurityException e) {
            LogUtil.e(TAG, "connectToDevice SecurityException:", ExceptionUtils.c(e));
        }
    }

    protected void goToDeviceInfoFragment() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(ROPE_DEVICE_INFO, this.mDeviceInformation);
        bundle.putString("productId", this.mProductId);
        bundle.putString("uniqueId", this.mUniqueId);
        DeviceInfoFragment deviceInfoFragment = new DeviceInfoFragment();
        deviceInfoFragment.setArguments(bundle);
        addFragment(deviceInfoFragment);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ProductFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a(TAG, "onActivityResult requestCode", Integer.valueOf(i), " resultCode", Integer.valueOf(i2));
        if (i == 101) {
            this.mIsBtEnableShowing = false;
            if (i2 == -1) {
                LogUtil.a(TAG, "REQUEST_ENABLE_BT User access the bt");
                autoConnectDevice();
            } else {
                LogUtil.a(TAG, "REQUEST_ENABLE_BT User dined the bt");
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.RopeDeviceDataListener
    public void onNewDeviceState() {
        RopeDeviceHandler ropeDeviceHandler = this.mRopeDeviceHandler;
        if (ropeDeviceHandler == null || this.mRopeDeviceDataManager == null) {
            return;
        }
        ropeDeviceHandler.sendEmptyMessage(109);
        if (this.mReconnectionTime < 3 || this.mRopeDeviceDataManager.c() != 0) {
            return;
        }
        LogUtil.a(TAG, "mReconnectionTime:", Integer.valueOf(this.mReconnectionTime));
        this.mRopeDeviceHandler.sendEmptyMessage(104);
    }

    @Override // com.huawei.health.ecologydevice.callback.RopeDeviceDataListener
    public void onNewBatteryState() {
        RopeDeviceHandler ropeDeviceHandler = this.mRopeDeviceHandler;
        if (ropeDeviceHandler == null || this.mRopeDeviceDataManager == null) {
            return;
        }
        Message messageObtainMessage = ropeDeviceHandler.obtainMessage();
        messageObtainMessage.what = 107;
        messageObtainMessage.arg1 = this.mRopeDeviceDataManager.d();
        this.mRopeDeviceHandler.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.health.ecologydevice.callback.RopeDeviceDataListener
    public void onNewDeviceInfo() {
        emd emdVar = this.mRopeDeviceDataManager;
        if (emdVar != null) {
            this.mDeviceInformation = emdVar.b();
            String bondedDeviceAddress = ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).getBondedDeviceAddress(this.mProductId, this.mUniqueId);
            this.mMacAddress = bondedDeviceAddress;
            if (TextUtils.isEmpty(bondedDeviceAddress) || getContext() == null) {
                return;
            }
            SharedPreferenceManager.c(SP_DEVICE_INFO, this.mMacAddress, new Gson().toJson(this.mDeviceInformation));
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.RopeDeviceDataListener
    public void onNewLastRope() {
        RopeDeviceHandler ropeDeviceHandler = this.mRopeDeviceHandler;
        if (ropeDeviceHandler != null) {
            ropeDeviceHandler.sendEmptyMessage(106);
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.RopeDeviceDataListener
    public void onRopeMonthDataSuccess() {
        RopeDeviceHandler ropeDeviceHandler = this.mRopeDeviceHandler;
        if (ropeDeviceHandler != null) {
            ropeDeviceHandler.sendEmptyMessage(112);
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.RopeDeviceDataListener
    public void onSetDefaultValue() {
        RopeDeviceHandler ropeDeviceHandler = this.mRopeDeviceHandler;
        if (ropeDeviceHandler != null) {
            Message messageObtainMessage = ropeDeviceHandler.obtainMessage();
            messageObtainMessage.what = 111;
            this.mRopeDeviceHandler.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.RopeDeviceDataListener
    public void onSetRopeMode() {
        RopeDeviceHandler ropeDeviceHandler = this.mRopeDeviceHandler;
        if (ropeDeviceHandler != null) {
            ropeDeviceHandler.sendEmptyMessage(113);
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.RopeDeviceDataListener
    public void onReverseControl() {
        RopeDeviceHandler ropeDeviceHandler = this.mRopeDeviceHandler;
        if (ropeDeviceHandler != null) {
            ropeDeviceHandler.sendEmptyMessage(UPDATE_ROPE_SKIPPING_REVERSE_CONTROL);
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.RopeDeviceDataListener
    public void onRopeConfigSetting() {
        RopeDeviceHandler ropeDeviceHandler = this.mRopeDeviceHandler;
        if (ropeDeviceHandler != null) {
            ropeDeviceHandler.sendEmptyMessage(UPDATE_ROPE_SKIPPING_ROPE_CONFIG_SETTING);
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.RopeDeviceDataListener
    public void onRopeConfigSwitch() {
        RopeDeviceHandler ropeDeviceHandler = this.mRopeDeviceHandler;
        if (ropeDeviceHandler != null) {
            ropeDeviceHandler.sendEmptyMessage(UPDATE_ROPE_SKIPPING_ROPE_CONFIG_SWITCH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showConnectionNoteDialog() {
        if (getContext() == null) {
            return;
        }
        if (this.mConnectionNoteDialog == null) {
            View viewInflate = LayoutInflater.from(dxw.d()).inflate(R.layout.rope_device_connection_note_dialog, (ViewGroup) null);
            ((HealthTextView) viewInflate.findViewById(R.id.dialog_content)).setText(qrs.ah(getContext()) ? R.string.IDS_device_reopen_bt_pad : R.string.IDS_device_mgr_pair_note_open_bluetooth);
            CustomViewDialog.Builder builder = new CustomViewDialog.Builder(getContext());
            builder.a(getString(R.string.IDS_device_mgr_pair_note_can_not_connect)).d(viewInflate).d(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a(BaseRopeIntroductionFragment.TAG, "showConnectionNoteDialog onclick PositiveButton");
                }
            });
            CustomViewDialog customViewDialogD = builder.d();
            this.mConnectionNoteDialog = customViewDialogD;
            customViewDialogD.setCancelable(false);
        }
        this.mConnectionNoteDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLoadResourceFileSuccess() throws Throwable {
        parseResourceFile();
        parseDeviceImage();
        String title = getTitle(this.mProductId, this.mProductInfo);
        this.mTitle = title;
        setTitle(title);
    }

    private void parseResourceFile() {
        if (this.mProductInfo.d().size() == 0) {
            LogUtil.j(TAG, "productInfo.descriptions.size() == 0");
            return;
        }
        LogUtil.d(TAG, "ResourceFile DeviceId:", this.mProductInfo.h());
        int size = this.mProductInfo.d().size();
        for (int i = 0; i < size; i++) {
            this.mImagePathList.add(elg.e().d(this.mProductId, this.mProductInfo.d().get(i).d()));
        }
    }

    private void parseDeviceImage() throws Throwable {
        Bitmap bitmapC;
        this.mDeviceImageIv.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        if (njy.e(this.mImagePathList)) {
            LogUtil.j(TAG, "showUnbindPairAndCancelBindView mImgPathList is null");
            this.mDeviceImageIv.setImageDrawable(this.mainActivity.getResources().getDrawable(R.drawable.img_rope));
            return;
        }
        String str = this.mImagePathList.get(0);
        if (this.mBitmapLruCache.get(str) == null) {
            bitmapC = elo.c(str);
            if (new File(str).exists() && bitmapC != null) {
                LogUtil.a(TAG, "showUnbindPairAndCancelBindView cache Image");
                this.mBitmapLruCache.put(str, bitmapC);
            }
        } else {
            LogUtil.j(TAG, "showUnbindPairAndCancelBindView load exists Image");
            bitmapC = this.mBitmapLruCache.get(str);
        }
        if (bitmapC == null) {
            LogUtil.j(TAG, "showUnbindPairAndCancelBindView bitmap is null");
        } else {
            this.mDeviceImageIv.setImageBitmap(bitmapC);
        }
    }

    private void setSportTypeToSharePreference(Context context, int i) {
        SharedPreferenceManager.e(context, Integer.toString(20002), "map_tracking_sport_type", Integer.toString(i), new StorageParams());
    }

    private String getTitle(String str, elh elhVar) {
        return (!METIS_PRODUCTID.equals(str) || LanguageUtil.bb(dxw.d()) || LanguageUtil.ac(dxw.d()) || LanguageUtil.l(dxw.d())) ? elo.a(str, elhVar.l().d()) : HUAWEI_FIT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNewBatteryValue(int i) {
        if (checkMacAddress()) {
            return;
        }
        this.mBatteryIconIv.setImageDrawable(getBetteryDrawable(i));
        this.mBatteryValueTv.setText(UnitUtil.e(i, 2, 0));
        this.mBatteryValue = i;
        this.mReconnectLoadingPb.setVisibility(8);
        this.mBatteryLayout.setVisibility(0);
        SharedPreferenceManager.d(SP_BATTERY_NUM, this.mBatteryKey, i);
    }

    protected void onDeviceStateChanged() {
        if (this.mRopeDeviceDataManager == null) {
            return;
        }
        if (checkMacAddress()) {
            LogUtil.a(TAG, "is not the MAC address of the device being connected");
            return;
        }
        int iC = this.mRopeDeviceDataManager.c();
        if (iC != 0) {
            if (iC == 1) {
                changeConnectingUiByStatus();
                return;
            }
            if (iC == 2) {
                this.mConnectStatusTv.setText(R.string.IDS_device_rope_device_connected);
                this.mReconnectTv.setVisibility(8);
                if (this.mBatteryValue == 0) {
                    this.mReconnectLoadingPb.setVisibility(0);
                    this.mBatteryLayout.setVisibility(8);
                } else {
                    this.mReconnectLoadingPb.setVisibility(8);
                    this.mBatteryLayout.setVisibility(0);
                    this.mBatteryIconIv.setImageDrawable(getBetteryDrawable(this.mBatteryValue));
                    this.mBatteryValueTv.setText(UnitUtil.e(this.mBatteryValue, 2, 0));
                }
                tickBiNfcConnectRope(getContext(), etg.c(this.mStartConnectTime), 2, this.mReconnectionTime);
                this.mReconnectionTime = 0;
                return;
            }
            if (iC != 3) {
                return;
            }
        }
        this.mConnectStatusTv.setText(R.string.IDS_device_rope_device_not_connected);
        this.mReconnectLoadingPb.setVisibility(8);
        this.mBatteryLayout.setVisibility(8);
        this.mReconnectTv.setVisibility(0);
        if (this.mRopeDeviceDataManager.c() != 0 || this.mReconnectionTime <= 0) {
            return;
        }
        tickBiNfcConnectRope(getContext(), etg.c(this.mStartConnectTime), 3, this.mReconnectionTime);
    }

    protected boolean checkMacAddress() {
        if (this.mRopeDeviceDataManager == null) {
            return true;
        }
        return !this.mMacAddress.equals(emh.b().a()) && this.mRopeDeviceDataManager.c() == 2;
    }

    private void changeConnectingUiByStatus() {
        if (this.mIsNeedProgressBarVisiable) {
            this.mConnectStatusTv.setText(R.string.IDS_device_rope_device_connecting);
            this.mReconnectLoadingPb.setVisibility(0);
            this.mReconnectTv.setVisibility(8);
            this.mBatteryLayout.setVisibility(8);
            return;
        }
        this.mConnectStatusTv.setText(R.string.IDS_device_rope_device_connecting);
        this.mReconnectTv.setVisibility(8);
        this.mReconnectLoadingPb.setVisibility(8);
        this.mBatteryLayout.setVisibility(0);
        this.mBatteryIconIv.setImageDrawable(getBetteryDrawable(this.mBatteryValue));
        this.mBatteryValueTv.setText(UnitUtil.e(this.mBatteryValue, 2, 0));
    }

    private Drawable getBetteryDrawable(int i) {
        Drawable drawableD = qrs.d(i);
        return LanguageUtil.ba(this.mainActivity) ? qqz.e(this.mainActivity, drawableD) : drawableD;
    }

    protected void updataRopeConfigSwitch() {
        SwitchStatusData switchStatusDataO = this.mRopeDeviceDataManager.o();
        if (era.j(this.mProductId) && this.mIsOtaUpdate) {
            if (switchStatusDataO != null && switchStatusDataO.isOpenBr() && !TextUtils.isEmpty(switchStatusDataO.getBrMacAddress())) {
                era.e(this.mainActivity, switchStatusDataO.getBrMacAddress(), "");
            }
            this.mIsOtaUpdate = false;
        }
    }

    private void tickBiNfcConnectRope(Context context, double d, int i, int i2) {
        if (!SCAN.equals(this.mEnterType)) {
            LogUtil.a(TAG, "mEnterType = ", this.mEnterType);
        } else {
            new etg.b().e(d).d(this.mProductId).b("262").a(this.mEnterType).d(i2).j(this.mProductId).e(this.mUniqueId).a(i).b().c(context);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        removeCallBack();
        popupFragment(null);
        return false;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        removeCallBack();
        ResourceManager.c().f();
        esk.b().c();
        LogUtil.a(TAG, "BaseRopeIntroductionFragment onDestroy");
    }

    protected void removeCallBack() {
        LogUtil.a(TAG, "removeCallBack");
        RopeDeviceHandler ropeDeviceHandler = this.mRopeDeviceHandler;
        if (ropeDeviceHandler != null) {
            ropeDeviceHandler.removeCallbacksAndMessages(null);
            this.mRopeDeviceHandler = null;
        }
        emd emdVar = this.mRopeDeviceDataManager;
        if (emdVar != null) {
            emdVar.t();
            this.mRopeDeviceDataManager = null;
        }
        efj.c().b();
    }

    @Override // com.huawei.health.device.manager.ResourceFileListener
    public void onResult(int i, String str) {
        LogUtil.d(TAG, "resultCode = ", Integer.valueOf(i), " resultValue = ", str);
        if (TextUtils.isEmpty(str) || i == -1) {
            LogUtil.j(TAG, "ProResourceFile load failure");
            return;
        }
        if (i == 200) {
            LogUtil.a(TAG, "ProResourceFile load success");
        } else if (i == 300) {
            LogUtil.a(TAG, "GET FILE SIZE SUCCESS");
        } else {
            LogUtil.j(TAG, "unhandled resultCode = ", Integer.valueOf(i));
        }
    }

    protected void tickBiRopeLevel2PageBrowsing(Context context, String str) {
        new etg.b().j(this.mProductId).e(this.mUniqueId).c(str).b().b(context);
    }

    static class RopeDeviceHandler extends Handler {
        private WeakReference<BaseRopeIntroductionFragment> mFragment;

        private RopeDeviceHandler(BaseRopeIntroductionFragment baseRopeIntroductionFragment) {
            this.mFragment = new WeakReference<>(baseRopeIntroductionFragment);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            super.handleMessage(message);
            BaseRopeIntroductionFragment baseRopeIntroductionFragment = this.mFragment.get();
            if (baseRopeIntroductionFragment == null || !baseRopeIntroductionFragment.isAdded() || baseRopeIntroductionFragment.isRemoving() || baseRopeIntroductionFragment.isDetached()) {
                return;
            }
            handMessage(message, baseRopeIntroductionFragment);
        }

        private void handMessage(Message message, BaseRopeIntroductionFragment baseRopeIntroductionFragment) throws Throwable {
            switch (message.what) {
                case 104:
                    baseRopeIntroductionFragment.showConnectionNoteDialog();
                    break;
                case 105:
                    if (baseRopeIntroductionFragment.mRopeDeviceDataManager.c() == 0) {
                        baseRopeIntroductionFragment.connectToDevice();
                    }
                    break;
                case 106:
                    baseRopeIntroductionFragment.refreshLastRopeDataUi();
                    break;
                case 107:
                    baseRopeIntroductionFragment.onNewBatteryValue(message.arg1);
                    break;
                case 109:
                    baseRopeIntroductionFragment.onDeviceStateChanged();
                    break;
                case BaseRopeIntroductionFragment.UPDATE_ROPE_SKIPPING_RESOURCE_FILE /* 110 */:
                    baseRopeIntroductionFragment.onLoadResourceFileSuccess();
                    break;
                case 111:
                    baseRopeIntroductionFragment.initDefaultRopeView();
                    break;
                case 112:
                    baseRopeIntroductionFragment.refreshMonthDataUi();
                    break;
                case 113:
                    baseRopeIntroductionFragment.updateRopeMode();
                    break;
                case BaseRopeIntroductionFragment.UPDATE_ROPE_SKIPPING_REVERSE_CONTROL /* 114 */:
                    baseRopeIntroductionFragment.startReverseControl();
                    break;
                case BaseRopeIntroductionFragment.UPDATE_ROPE_SKIPPING_ROPE_CONFIG_SETTING /* 115 */:
                    baseRopeIntroductionFragment.updataRopeConfigSetting();
                    break;
                case 116:
                    baseRopeIntroductionFragment.selectingAuthorizationFunction();
                    break;
                case BaseRopeIntroductionFragment.UPDATE_ROPE_SKIPPING_ROPE_CONFIG_SWITCH /* 117 */:
                    baseRopeIntroductionFragment.updataRopeConfigSwitch();
                    break;
            }
        }
    }
}
