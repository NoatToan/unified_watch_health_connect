package com.huawei.health.device.ui.measure.fragment;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.huawei.health.device.callback.ScaleDialogCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.manager.ResourceFileListener;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.device.ui.measure.BaseInteractor;
import com.huawei.health.device.ui.measure.activity.WifiDeviceShareActivity;
import com.huawei.health.device.wifi.control.claim.ClaimWeightDataManager;
import com.huawei.health.device.wifi.interfaces.CommBaseCallback;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.DeviceServiceInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceControlDataModelReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceExitAuthorizeSubUserReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceUnbindReq;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.commonui.webview.WebViewActivity;
import defpackage.dmp;
import defpackage.drw;
import defpackage.dst;
import defpackage.dti;
import defpackage.dxm;
import defpackage.dxw;
import defpackage.dyg;
import defpackage.dyj;
import defpackage.dys;
import defpackage.eal;
import defpackage.ean;
import defpackage.eas;
import defpackage.eby;
import defpackage.ecf;
import defpackage.ecj;
import defpackage.ecp;
import defpackage.ecs;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.enz;
import defpackage.eph;
import defpackage.eqw;
import defpackage.era;
import defpackage.ioi;
import defpackage.lqo;
import defpackage.lsg;
import defpackage.qji;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qri;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class WiFiProductIntroductionFragment extends BaseFragment implements View.OnClickListener {
    private static final String BOOLEAN_FALSE = "false";
    private static final int CHANGE_MEASURE_WEIGHT_HINT_NUM = 4;
    private static final int COLLECTION_DEFAULT_SIZE = 16;
    private static final int DELAY_TIME_FOR_ORIENTATION = 1000;
    private static final int DELETE_DEVICE_POSITION = 0;
    private static final int DEVICE_DESCRIPTION_1_NUM = 17;
    private static final int DEVICE_DESCRIPTION_2_NUM = 10;
    private static final String DEVICE_HONOR_WIFI_WEIGHT_EN_CN_HELP = "/AH110/EMUI9.0/C001B001/en-US/index.html";
    private static final String DEVICE_HONOR_WIFI_WEIGHT_ZH_CN_HELP = "/AH110/EMUI9.0/C001B001/zh-CN/index.html";
    private static final String DEVICE_HUAWEI_WIFI_WEIGHT_EN_CN_HELP = "/CH19/EMUI9.0/C001B001/en-US/index.html";
    private static final String DEVICE_HUAWEI_WIFI_WEIGHT_ZH_CN_HELP = "/CH19/EMUI9.0/C001B001/zh-CN/index.html";
    private static final String KEY_ARG4 = "arg4";
    private static final int MSG_FACTORY_DATA_RESET_FAIL = 5;
    private static final int MSG_FACTORY_DATA_RESET_SUCCESS = 2;
    private static final int MSG_REFRESH_RESOURCE = 1;
    private static final int MSG_REFRESH_RESOURCE_FAIL = 3;
    private static final String OPERATE_DELETE = "Delete";
    private static final String[] PERMISSIONS = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    private static final String PRODUCT_ID = "productId";
    private static final int SDK_28 = 28;
    private static final String SHOW_TYPE_WIFI_DEVICE = "WiFiDevice";
    private static final int SUB_USER_MAX_NUM = 5;
    private static final String TAG = "WiFiProductIntroductionFragment";
    private static final int TEXT_SIZE = 13;
    private static final String UNDERLINE_CHAR = "_";
    private Bundle bundle;
    private String mArg4;
    private HealthButton mBindButton;
    private LinearLayout mBindLayout;
    private String mBindProductId;
    private ImageView mBindTipImg;
    private HealthTextView mBuyButton;
    private CustomTextAlertDialog mCancelDataDialog;
    private CustomTextAlertDialog mCancelDataDialogCheckNet;
    private ImageView mClaimDataImgRedPoint;
    private RelativeLayout mClaimDataLayout;
    private HealthTextView mConnectStatusTextView;
    private RelativeLayout mDataManagerLayout;
    private ContentValues mDeviceInfo;
    private LinearLayout mDeviceShareLayout;
    private RelativeLayout mDeviceUpgradeLayout;
    private ImageView mExistNewVersion;
    private ArrayList<String> mImgPathList;
    private BaseInteractor mInteractor;
    private ioi mInteractors;
    private HealthViewPager mIntroducedPager;
    private HealthTextView mIntroductionPromptTv;
    private boolean mIsBind;
    private boolean mIsBindComeInThePage;
    private boolean mIsBindDevice;
    private boolean mIsDownResources;
    private HealthProgressBar mLoadImageView;
    private HealthTextView mMacAddress;
    private HealthDotsPageIndicator mNavigationSpotLayout;
    private LinearLayout mNetWorkSettingLayout;
    private LinearLayout mNoNetWorkTipLayout;
    private PopViewList mPopView;
    private String mProductId;
    private elh mProductInfo;
    private ArrayList<String> mPrompts;
    private LinearLayout mRestoreFactoryLayout;
    private String mSerialNumber;
    private ImageView mShowMoreDataArrowImage;
    private LinearLayout mShowMoreDataLayout;
    private HealthTextView mStartMeasureTextView;
    private HealthTextView mSubUserNumTv;
    private LinearLayout mUnBindLayout;
    private CustomTextAlertDialog mUnbindDialog;
    private String mUniqueId;
    private String mUrl;
    private RelativeLayout mUserGuideLayout;
    private eph mViewAdapter;
    private RelativeLayout mWeightDataFromSmartLifeLayout;
    private LinearLayout mWeightLayoutContainer;
    private LinearLayout mWeightValueLayoutContainer;
    private eby mWiFiDevice;
    private ImageView mWifiArrowMacAddressImage;
    private ImageView mWifiArrowShareImage;
    private ImageView mWifiArrowVersionUpdateImage;
    private RelativeLayout mWifiWeightDeviceLayout;
    private MyHandler myHandler;
    private boolean mIsHealthDataStatus = false;
    private boolean mIsPersonalInfoStatus = false;
    private boolean mIsBindOtherDevice = false;
    private boolean mIsPermission = false;
    private CommBaseCallback commBaseCallback = new CommBaseCallback<WiFiProductIntroductionFragment>(this) { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment.1
        @Override // com.huawei.health.device.wifi.interfaces.CommBaseCallback
        public void onResult(WiFiProductIntroductionFragment wiFiProductIntroductionFragment, int i, String str, Object obj) {
            LogUtil.a(WiFiProductIntroductionFragment.TAG, "commBaseCallback errCode: ", Integer.valueOf(i));
            boolean z = false;
            boolean z2 = (wiFiProductIntroductionFragment == null || wiFiProductIntroductionFragment.isDestory()) ? false : true;
            if (wiFiProductIntroductionFragment != null) {
                if (wiFiProductIntroductionFragment.isAdded() && wiFiProductIntroductionFragment.myHandler != null) {
                    z = true;
                }
                if (z2 && z) {
                    wiFiProductIntroductionFragment.myHandler.sendEmptyMessage(4);
                }
            }
        }
    };
    private HealthViewPager.OnPageChangeListener mOnPageChangeListener = new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment.2
        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            LogUtil.a(WiFiProductIntroductionFragment.TAG, "onPageSelected() arg: ", Integer.valueOf(i));
            WiFiProductIntroductionFragment wiFiProductIntroductionFragment = WiFiProductIntroductionFragment.this;
            wiFiProductIntroductionFragment.setPromptText(i, wiFiProductIntroductionFragment.mIntroductionPromptTv);
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            LogUtil.a(WiFiProductIntroductionFragment.TAG, "onPageScrolled");
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            LogUtil.a(WiFiProductIntroductionFragment.TAG, "onPageScrollStateChanged() arg: ", Integer.valueOf(i));
        }
    };

    static class MyHandler extends StaticHandler<WiFiProductIntroductionFragment> {
        MyHandler(WiFiProductIntroductionFragment wiFiProductIntroductionFragment) {
            super(wiFiProductIntroductionFragment);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        public void handleMessage(WiFiProductIntroductionFragment wiFiProductIntroductionFragment, Message message) throws Throwable {
            if (!WiFiProductIntroductionFragment.isMessageTrue(wiFiProductIntroductionFragment, message)) {
                LogUtil.j(WiFiProductIntroductionFragment.TAG, "object or msg is error");
                return;
            }
            LogUtil.a(WiFiProductIntroductionFragment.TAG, "MyHandler what: ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1) {
                if (message.obj == null) {
                    LogUtil.j(WiFiProductIntroductionFragment.TAG, "msg.obj is null");
                    return;
                }
                if (message.obj instanceof String) {
                    elh elhVarD = ResourceManager.c().d((String) message.obj);
                    if (elhVarD != null) {
                        wiFiProductIntroductionFragment.updataProduct(elhVarD);
                        return;
                    }
                    return;
                }
                LogUtil.j(WiFiProductIntroductionFragment.TAG, "msg.obj not instanceof String");
                return;
            }
            if (i == 2) {
                if (wiFiProductIntroductionFragment.mIsBind != wiFiProductIntroductionFragment.isBindDevice()) {
                    wiFiProductIntroductionFragment.mIsBind = wiFiProductIntroductionFragment.isBindDevice();
                    wiFiProductIntroductionFragment.initViewData();
                    return;
                }
                return;
            }
            if (i == 3) {
                wiFiProductIntroductionFragment.mIsDownResources = false;
                wiFiProductIntroductionFragment.loadAnimation();
            } else if (i == 4) {
                wiFiProductIntroductionFragment.updateClaimNumber();
            } else if (i == 5) {
                qpx.e(wiFiProductIntroductionFragment.mainActivity, R.string.IDS_update_server_bussy);
            } else {
                LogUtil.j(WiFiProductIntroductionFragment.TAG, "MyHandler what is other");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMessageTrue(WiFiProductIntroductionFragment wiFiProductIntroductionFragment, Message message) {
        if (wiFiProductIntroductionFragment == null) {
            LogUtil.j(TAG, "MyHandler object is null");
            return false;
        }
        if (wiFiProductIntroductionFragment.isDestory()) {
            LogUtil.j(TAG, "MyHandler activity is not exist");
            return false;
        }
        if (!wiFiProductIntroductionFragment.isAdded()) {
            LogUtil.j(TAG, "MyHandler mFragment is not add");
            return false;
        }
        if (message != null) {
            return true;
        }
        LogUtil.j(TAG, "MyHandler msg is null");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateClaimNumber() {
        int size = ClaimWeightDataManager.INSTANCE.getClaimDataCatch().size();
        LogUtil.a(TAG, "updateClaimNumber size: ", Integer.valueOf(size));
        if (size > 0) {
            setDataClaimViewStyle(true, 0, 1.0f);
        } else {
            setDataClaimViewStyle(false, 8, 0.38f);
        }
    }

    private void setDataClaimViewStyle(boolean z, int i, float f) {
        this.mClaimDataLayout.setEnabled(z);
        this.mClaimDataImgRedPoint.setVisibility(i);
        this.mClaimDataLayout.setAlpha(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updataProduct(elh elhVar) {
        if (this.mIsBind) {
            LogUtil.j(TAG, "this is bind status,not updata view");
            return;
        }
        this.mProductInfo = elhVar;
        this.mIsDownResources = false;
        if (elhVar.d().size() == 0) {
            LogUtil.j(TAG, "updataProduct.descriptions.size() is 0");
            return;
        }
        loadAnimation();
        initViewAdapter();
        setBuyButton();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public void initViewTahiti() throws Throwable {
        initView();
        initViewData();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.myHandler = new MyHandler(this);
        this.mInteractors = ioi.d();
        ResourceManager.c().e(new ResourcesDownCallBack(this));
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Throwable {
        this.child = layoutInflater.inflate(R.layout.wifi_product_introduction_layout, viewGroup, false);
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
        }
        LogUtil.a(TAG, "onCreateView");
        this.bundle = getArguments();
        initView();
        initData();
        initViewData();
        initListener();
        setPagerRtl();
        this.mNavigationSpotLayout.setRtlEnable(false);
        this.mNavigationSpotLayout.setViewPager(this.mIntroducedPager);
        DeviceMainActivity deviceMainActivity = (DeviceMainActivity) getActivity();
        boolean zC = deviceMainActivity.c();
        deviceMainActivity.c(false);
        Bundle bundle2 = this.bundle;
        if (bundle2 != null) {
            if (OPERATE_DELETE.equals(bundle2.getString("operateCode"))) {
                checkNetWork(false);
                onClickUnBind();
            }
            String string = this.bundle.getString(KEY_ARG4);
            this.mArg4 = string;
            if (!TextUtils.isEmpty(string) && this.mArg4.equals(SHOW_TYPE_WIFI_DEVICE) && !zC) {
                handleOrientationDialogShow();
                return viewGroup2;
            }
            LogUtil.a(TAG, "no dialog show isShowDialog: ", Boolean.valueOf(!zC));
        }
        return viewGroup2;
    }

    private void handleOrientationDialogShow() {
        int i = getActivity().getResources().getConfiguration().orientation;
        LogUtil.a(TAG, "orientation: ", Integer.valueOf(i));
        if (i == 2) {
            this.myHandler.postDelayed(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m926x9e5fef97();
                }
            }, 1000L);
        } else {
            m926x9e5fef97();
        }
    }

    private void setPagerRtl() {
        if (this.mProductInfo == null) {
            LogUtil.j(TAG, "setPagerRtl mProductInfo is null");
        } else {
            if (this.mIsBind || !LanguageUtil.ba(getActivity())) {
                return;
            }
            this.mIntroducedPager.setCurrentItem(this.mProductInfo.d().size() - 1);
        }
    }

    private void initListener() {
        this.mClaimDataLayout.setOnClickListener(this);
        this.mDeviceUpgradeLayout.setOnClickListener(this);
        FragmentActivity activity = getActivity();
        if (activity != null && (activity instanceof BaseActivity)) {
            BaseActivity baseActivity = (BaseActivity) activity;
            this.mBindButton.setOnClickListener(qji.b(this, baseActivity, true, ""));
            this.mBuyButton.setOnClickListener(qji.b(this, baseActivity, true, ""));
        } else {
            LogUtil.j(TAG, "is null or uninstanceof BaseActivity");
            this.mBindButton.setOnClickListener(this);
            this.mBuyButton.setOnClickListener(this);
        }
        this.mStartMeasureTextView.setOnClickListener(this);
        this.mShowMoreDataLayout.setOnClickListener(this);
        this.mRestoreFactoryLayout.setOnClickListener(this);
        this.mUserGuideLayout.setOnClickListener(this);
        this.mDataManagerLayout.setOnClickListener(this);
        this.mDeviceShareLayout.setOnClickListener(this);
        this.mNetWorkSettingLayout.setOnClickListener(this);
        this.mIntroducedPager.clearOnPageChangeListeners();
        this.mIntroducedPager.addOnPageChangeListener(this.mOnPageChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isBindDevice() {
        LogUtil.a(TAG, "isBindDevice code:", dyg.d(this.mUniqueId), ",number:", dyg.b(this.mSerialNumber));
        MeasurableDevice measurableDeviceB = dmp.d().b(this.mUniqueId, false);
        if (measurableDeviceB instanceof eby) {
            LogUtil.a(TAG, "isBindDevice uniqueId device");
            this.mWiFiDevice = (eby) measurableDeviceB;
        }
        if (this.mWiFiDevice == null) {
            MeasurableDevice measurableDeviceA = dmp.d().a(this.mSerialNumber, false);
            if (measurableDeviceA instanceof eby) {
                LogUtil.a(TAG, "isBindDevice serialNumber device");
                this.mWiFiDevice = (eby) measurableDeviceA;
            }
        }
        return this.mWiFiDevice != null;
    }

    private boolean isBindTheOtherDevice(String str) {
        return (drw.e().b(str) instanceof eby ? (eby) drw.e().b(str) : null) != null;
    }

    private void initData() {
        String string = getArguments().getString("sn");
        this.mSerialNumber = string;
        LogUtil.a(TAG, "initData mSerialNumber:", dyg.b(string));
        this.mProductId = getArguments().getString("productId");
        ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
        this.mDeviceInfo = contentValues;
        if (contentValues != null) {
            this.mProductId = contentValues.getAsString("productId");
            this.mUniqueId = this.mDeviceInfo.getAsString("uniqueId");
        }
        if (TextUtils.isEmpty(this.mProductId)) {
            LogUtil.j(TAG, "initData mProductId is null");
            this.mainActivity.onBackPressed();
            return;
        }
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        this.mProductInfo = elhVarD;
        if (elhVarD == null) {
            LogUtil.j(TAG, "initData mProductInfo is null");
            this.mainActivity.onBackPressed();
            return;
        }
        if (!isUnBindDevice()) {
            this.mIsBind = isBindDevice();
        }
        LogUtil.a(TAG, "initData is Bind Device mIsBind: ", Boolean.valueOf(this.mIsBind));
        if (this.mIsBind) {
            if (this.mWiFiDevice.a().m() == 2) {
                this.mIsBindDevice = true;
            }
            ClaimWeightDataManager.INSTANCE.registerCallBack(getClass().getSimpleName(), this.commBaseCallback);
        }
        this.mUrl = GRSManager.c(BaseApplication.getContext()).getUrl("domainTipsResDbankcdn");
        dxm.au(this.mUniqueId);
    }

    private boolean isUnBindDevice() {
        if (this.mIsBindDevice) {
            if ((dmp.d().b(this.mUniqueId, false) instanceof eby ? (eby) dmp.d().b(this.mUniqueId, false) : null) == null) {
                return true;
            }
            LogUtil.j(TAG, "isUnBindDevice device is null");
        } else {
            LogUtil.j(TAG, "isUnBindDevice mIsBindDevice is false");
        }
        return false;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() throws Throwable {
        super.onResume();
        if (this.mIsPermission) {
            this.mIsPermission = false;
            gotoWiFiInfoDevice();
        }
        reFreshDevData();
        MyHandler myHandler = this.myHandler;
        if (myHandler != null) {
            myHandler.sendEmptyMessage(2);
        } else {
            LogUtil.j(TAG, "onResume myHandler is null");
        }
        if (this.mIsBind) {
            LogUtil.a(TAG, "onResume is bind");
            ClaimWeightDataManager.INSTANCE.startSync();
            this.mIsBindComeInThePage = true;
            setSubUserNum();
            ean.c(this.mainActivity, this.mWiFiDevice, this.mProductInfo);
        } else {
            this.mIsBindComeInThePage = false;
        }
        showWeightDataView();
    }

    private void initView() {
        findView();
        Bundle bundle = this.bundle;
        if (bundle != null) {
            String string = bundle.getString(KEY_ARG4);
            this.mArg4 = string;
            if (!TextUtils.isEmpty(string) && this.mArg4.equals(SHOW_TYPE_WIFI_DEVICE)) {
                this.mBuyButton.setVisibility(8);
            }
        }
        if (LanguageUtil.ba(this.mainActivity)) {
            this.mWifiArrowShareImage.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.mWifiArrowVersionUpdateImage.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.mWifiArrowMacAddressImage.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.mShowMoreDataArrowImage.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            this.mWifiArrowShareImage.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.mWifiArrowVersionUpdateImage.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.mWifiArrowMacAddressImage.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.mShowMoreDataArrowImage.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
        this.mCustomTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment$$ExternalSyntheticLambda15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m927x7965a94(view);
            }
        });
        PopViewList popViewList = this.mPopView;
        if (popViewList != null && popViewList.c()) {
            LogUtil.a(TAG, "initView mPopView dismiss");
            this.mPopView.d();
        }
        if (this.mInteractor == null) {
            this.mInteractor = dti.d(this.mProductId, this.mUniqueId);
        }
        BaseInteractor baseInteractor = this.mInteractor;
        if (baseInteractor instanceof dti) {
            ((dti) baseInteractor).d(this.mainActivity, this.child);
        }
    }

    /* JADX INFO: renamed from: lambda$initView$1$com-huawei-health-device-ui-measure-fragment-WiFiProductIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m927x7965a94(View view) {
        showUnbindDeviceMenu();
    }

    private void findView() {
        this.mWifiWeightDeviceLayout = (RelativeLayout) this.child.findViewById(R.id.wifi_weight_device_layout);
        this.mNoNetWorkTipLayout = (LinearLayout) qsp.a(this.child, R.id.wifi_device_nfc_tip_title_layout);
        this.mIntroducedPager = (HealthViewPager) this.child.findViewById(R.id.wifi_device_info_img_pager);
        this.mNetWorkSettingLayout = (LinearLayout) qsp.a(this.child, R.id.wifi_device_network_setting_layout);
        this.mUnBindLayout = (LinearLayout) qsp.a(this.child, R.id.wifi_device_unbind_layout);
        this.mBindLayout = (LinearLayout) qsp.a(this.child, R.id.wifi_device_bind_layout);
        this.mLoadImageView = (HealthProgressBar) qsp.a(this.child, R.id.wifi_device_loading_image);
        this.mIntroductionPromptTv = (HealthTextView) qsp.a(this.child, R.id.wifi_device_introduction_prompt);
        this.mNavigationSpotLayout = (HealthDotsPageIndicator) qsp.a(this.child, R.id.wifi_device_navigation_spot);
        this.mClaimDataLayout = (RelativeLayout) qsp.a(this.child, R.id.wifi_device_claim_data_layout);
        this.mDeviceUpgradeLayout = (RelativeLayout) qsp.a(this.child, R.id.wifi_device_firmware_update_layout);
        this.mClaimDataImgRedPoint = (ImageView) this.child.findViewById(R.id.claim_data_img_red_point);
        this.mRestoreFactoryLayout = (LinearLayout) qsp.a(this.child, R.id.wifi_device_restore_factory_layout);
        this.mUserGuideLayout = (RelativeLayout) qsp.a(this.child, R.id.wifi_device_user_guide_layout);
        this.mDataManagerLayout = (RelativeLayout) qsp.a(this.child, R.id.wifi_device_data_manager_layout);
        this.mDeviceShareLayout = (LinearLayout) qsp.a(this.child, R.id.wifi_device_share_layout);
        this.mBindButton = (HealthButton) qsp.a(this.child, R.id.wifi_device_bind_btn);
        this.mBuyButton = (HealthTextView) qsp.a(this.child, R.id.wifi_device_buy_btn);
        this.mSubUserNumTv = (HealthTextView) qsp.a(this.child, R.id.wifi_device_sub_user_num_text);
        this.mLoadImageView.setLayerType(1, null);
        this.mExistNewVersion = (ImageView) qsp.a(this.child, R.id.wifi_device_exist_new_version);
        this.mMacAddress = (HealthTextView) qsp.a(this.child, R.id.wifi_device_mac_address);
        this.mBindTipImg = (ImageView) qsp.a(this.child, R.id.wifi_device_bind_tip_img);
        this.mStartMeasureTextView = (HealthTextView) qsp.a(this.child, R.id.weight_start_measure_tv);
        HealthTextView healthTextView = (HealthTextView) this.child.findViewById(R.id.weight_device_connect_status_tv);
        this.mConnectStatusTextView = healthTextView;
        healthTextView.setText(this.mainActivity.getString(R.string.IDS_user_profile_health_show_paried));
        this.mWifiArrowShareImage = (ImageView) qsp.a(this.child, R.id.wifi_arrow_share_img);
        this.mWifiArrowVersionUpdateImage = (ImageView) qsp.a(this.child, R.id.wifi_arrow_version_update_img);
        this.mWifiArrowMacAddressImage = (ImageView) qsp.a(this.child, R.id.wifi_arrow_mac_address_img);
        this.mWeightValueLayoutContainer = (LinearLayout) qsp.a(this.child, R.id.weight_value_layout_container);
        this.mWeightLayoutContainer = (LinearLayout) qsp.a(this.child, R.id.weight_layout_container);
        this.mWeightDataFromSmartLifeLayout = (RelativeLayout) qsp.a(this.child, R.id.weight_data_from_smart_life_layout);
        this.mShowMoreDataLayout = (LinearLayout) qsp.a(this.child, R.id.more_data_show_layout);
        this.mShowMoreDataArrowImage = (ImageView) qsp.a(this.child, R.id.smart_life_img_arrow);
    }

    private void showWeightDataView() {
        DeviceMainActivity deviceMainActivity = getActivity() instanceof DeviceMainActivity ? (DeviceMainActivity) getActivity() : null;
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

    private void showUnbindDeviceMenu() {
        if (this.mainActivity == null || this.mCustomTitleBar == null) {
            LogUtil.j(TAG, "mainActivity or mCustomTitleBar is null");
            return;
        }
        PopViewList popViewList = new PopViewList(this.mainActivity, this.mCustomTitleBar, new ArrayList(Arrays.asList(getResources().getString(R.string.IDS_device_wear_home_delete_device))));
        this.mPopView = popViewList;
        popViewList.b(new PopViewList.PopViewClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment$$ExternalSyntheticLambda9
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public final void setOnClick(int i) {
                this.f$0.m934xd32fd240(i);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showUnbindDeviceMenu$2$com-huawei-health-device-ui-measure-fragment-WiFiProductIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m934xd32fd240(int i) {
        if (i != 0) {
            return;
        }
        checkNetWork(true);
    }

    private void checkNetWork(boolean z) {
        CustomTextAlertDialog customTextAlertDialog = this.mCancelDataDialogCheckNet;
        if (customTextAlertDialog == null || !customTextAlertDialog.isShowing()) {
            if (this.mainActivity == null) {
                this.mainActivity = BaseApplication.getActivity();
            }
            if (ecj.b(BaseApplication.getContext())) {
                if (z) {
                    showUnbindDialog();
                    return;
                }
                return;
            }
            CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.mainActivity);
            builder.a(R.string.IDS_hwh_home_group_network_disconnection);
            builder.b(R.string.IDS_device_wifi_not_network);
            builder.a(R.string.IDS_device_connect_network, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment$$ExternalSyntheticLambda11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m923x9e2eb3e1(view);
                }
            });
            builder.e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment$$ExternalSyntheticLambda12
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m924xb7300580(view);
                }
            });
            CustomTextAlertDialog customTextAlertDialogB = builder.b();
            this.mCancelDataDialogCheckNet = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
            this.mCancelDataDialogCheckNet.show();
        }
    }

    /* JADX INFO: renamed from: lambda$checkNetWork$3$com-huawei-health-device-ui-measure-fragment-WiFiProductIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m923x9e2eb3e1(View view) {
        ecs.l(this.mainActivity);
        this.mCancelDataDialogCheckNet.dismiss();
        this.mCancelDataDialogCheckNet = null;
    }

    /* JADX INFO: renamed from: lambda$checkNetWork$4$com-huawei-health-device-ui-measure-fragment-WiFiProductIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m924xb7300580(View view) {
        this.mCancelDataDialogCheckNet.dismiss();
        this.mCancelDataDialogCheckNet = null;
    }

    private void setTitle() {
        String strA = elo.a(this.mProductId, this.mProductInfo.l().d());
        String strH = dxm.h(this.mUniqueId);
        if (!TextUtils.isEmpty(strH)) {
            strA = strA + " - " + strH;
        }
        setTitle(strA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initViewData() throws Throwable {
        if (!TextUtils.isEmpty(this.mProductId) && this.mProductInfo != null) {
            setTitle();
            if (this.mIsBind) {
                this.mBindLayout.setVisibility(0);
                this.mUnBindLayout.setVisibility(8);
                initBindViewData();
            } else {
                this.mUnBindLayout.setVisibility(0);
                this.mBindLayout.setVisibility(8);
                initUnBindViewData();
            }
        }
        eas easVarB = eas.b();
        eby ebyVar = this.mWiFiDevice;
        if (easVarB.j(ebyVar != null ? ebyVar.e() : "")) {
            this.mExistNewVersion.setVisibility(0);
        } else {
            this.mExistNewVersion.setVisibility(8);
        }
        eby ebyVar2 = this.mWiFiDevice;
        if (ebyVar2 == null || TextUtils.isEmpty(ebyVar2.getAddress())) {
            return;
        }
        this.mMacAddress.setText(this.mWiFiDevice.getAddress());
    }

    private void setSubUserNum() throws Throwable {
        String string = getResources().getString(R.string.IDS_device_wifi_scale_sub_user_num);
        eal ealVarA = ecf.a(this.mWiFiDevice.a().c());
        this.mSubUserNumTv.setText(String.format(Locale.ENGLISH, string, UnitUtil.e(((ealVarA == null || ealVarA.b()) ? 0 : ealVarA.e().size()) + 1, 1, 0), UnitUtil.e(5.0d, 1, 0)));
        ean.e(this.mWiFiDevice.e());
    }

    private void initBindViewData() throws Throwable {
        setLayoutBackgroundColor(R.color.wear_home_bg_color, 0);
        this.mBindButton.setVisibility(8);
        this.mBuyButton.setVisibility(8);
        eby ebyVar = this.mWiFiDevice;
        if (ebyVar != null && ebyVar.a() != null) {
            LogUtil.a(TAG, "initBindViewData source: ", Integer.valueOf(this.mWiFiDevice.a().m()));
            if (this.mWiFiDevice.a().m() == 2) {
                this.mDeviceUpgradeLayout.setVisibility(8);
                this.mDeviceShareLayout.setVisibility(8);
            } else {
                setSubUserNum();
            }
            this.mClaimDataLayout.setEnabled(false);
            this.mClaimDataLayout.setAlpha(0.38f);
            if ("a8ba095d-4123-43c4-a30a-0240011c58de".equals(this.mProductId)) {
                this.mBindTipImg.setImageResource(R.drawable.pic_honor_device_manager_img);
                return;
            } else {
                this.mBindTipImg.setImageResource(R.drawable.pic_huawei_device_manager_img);
                return;
            }
        }
        LogUtil.j(TAG, "initBindViewData mWiFiDevice or mWiFiDevice.getDeviceInfo() is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAnimation() {
        if (ecj.b(BaseApplication.getContext()) && this.mIsDownResources) {
            this.mLoadImageView.setVisibility(0);
            this.mIntroducedPager.setVisibility(8);
        } else {
            this.mLoadImageView.setVisibility(8);
            this.mIntroducedPager.setVisibility(0);
        }
    }

    private void initUnBindViewData() {
        loadAnimation();
        initNetWorkTipView();
        if (this.mProductInfo.d().size() == 0) {
            LogUtil.j(TAG, "initUnBindViewData() deviceInfo size is zero");
            return;
        }
        this.mIntroductionPromptTv.setMovementMethod(ScrollingMovementMethod.getInstance());
        initViewAdapter();
        initUnBindButton();
    }

    private void setBuyButton() {
        String strC = this.mProductInfo.c("buy_url");
        if (strC == null || strC.trim().isEmpty() || Utils.o() || CommonUtil.bd()) {
            this.mBuyButton.setVisibility(4);
        } else {
            this.mBuyButton.setVisibility(0);
        }
    }

    private void initUnBindButton() {
        setBuyButton();
        this.mBindButton.setVisibility(0);
        setLayoutBackgroundColor(R.color.colorBackground, 8);
    }

    private void setLayoutBackgroundColor(int i, int i2) {
        Resources resources = BaseApplication.getContext().getResources();
        if (resources != null) {
            this.mCustomTitleBar.setTitleBarBackgroundColor(resources.getColor(i));
            this.mWifiWeightDeviceLayout.setBackgroundColor(resources.getColor(i));
            this.mCustomTitleBar.setRightButtonDrawable(resources.getDrawable(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_share));
        }
        this.mCustomTitleBar.setRightButtonVisibility(i2);
    }

    private void initViewAdapter() {
        this.mPrompts = new ArrayList<>(16);
        this.mImgPathList = new ArrayList<>(16);
        addImageAndText(this.mProductInfo.d().size(), this.mProductId, this.mProductInfo);
        setPromptText(0, this.mIntroductionPromptTv);
        LogUtil.a(TAG, "initViewAdapter mImgPathList size: ", Integer.valueOf(this.mImgPathList.size()));
        eph ephVar = new eph(this.mImgPathList, this.mainActivity);
        this.mViewAdapter = ephVar;
        this.mIntroducedPager.setAdapter(ephVar);
    }

    private void addImageAndText(int i, String str, elh elhVar) {
        if (!LanguageUtil.ba(getActivity())) {
            for (int i2 = 0; i2 < i; i2++) {
                this.mImgPathList.add(elg.e().d(str, elhVar.d().get(i2).d()));
                this.mPrompts.add(elo.a(str, elhVar.d().get(i2).c()));
            }
            return;
        }
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            this.mImgPathList.add(elg.e().d(str, elhVar.d().get(i).d()));
            this.mPrompts.add(elo.a(str, elhVar.d().get(i).c()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptText(int i, HealthTextView healthTextView) {
        healthTextView.setScrollY(0);
        int size = LanguageUtil.ba(getActivity()) ? (this.mProductInfo.d().size() - i) - 1 : i;
        if (size >= 0 && size < this.mProductInfo.d().size()) {
            String strTrim = this.mProductInfo.d().get(size).c().trim();
            if (i >= 0 && i < this.mPrompts.size()) {
                if ("IDS_device_wifi_scale_description_1".equals(strTrim) && this.mPrompts.get(i).contains("%s")) {
                    healthTextView.setText(String.format(Locale.ENGLISH, this.mPrompts.get(i), UnitUtil.e(17.0d, 1, 0)));
                    return;
                } else {
                    if ("IDS_device_wifi_scale_description_2".equals(strTrim) && this.mPrompts.get(i).contains("%s")) {
                        healthTextView.setText(qrs.b(this.mainActivity, String.format(Locale.ENGLISH, this.mPrompts.get(i), UnitUtil.e(10.0d, 1, 0))));
                        return;
                    }
                    LogUtil.j(TAG, "setPromptText default");
                }
            }
        }
        if (i < 0 || i >= this.mPrompts.size()) {
            return;
        }
        healthTextView.setText(qrs.b(this.mainActivity, this.mPrompts.get(i)));
    }

    private void initNetWorkTipView() {
        if (!ecj.b(BaseApplication.getContext()) && this.mIsDownResources) {
            this.mNoNetWorkTipLayout.setVisibility(0);
        } else {
            this.mNoNetWorkTipLayout.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDestory() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            LogUtil.j(TAG, "DeviceMainActivity is null");
            return true;
        }
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            return false;
        }
        LogUtil.j(TAG, "DeviceMainActivity is Destroyed");
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ResourceManager.c().f();
        if (this.mIsBind) {
            ClaimWeightDataManager.INSTANCE.unRegisterCallBack(getClass().getSimpleName());
        }
        PopViewList popViewList = this.mPopView;
        if (popViewList != null && popViewList.c()) {
            LogUtil.j(TAG, "onDestroyView mPopView dismiss");
            this.mPopView.d();
        }
        LogUtil.a(TAG, "onDestroyView");
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        MyHandler myHandler = this.myHandler;
        if (myHandler != null) {
            myHandler.removeCallbacksAndMessages(null);
            this.myHandler = null;
        }
        if (this.child instanceof ViewGroup) {
            ((ViewGroup) this.child).removeAllViews();
        }
        BaseInteractor baseInteractor = this.mInteractor;
        if (baseInteractor != null) {
            baseInteractor.onDestroy();
            this.mInteractor = null;
        }
    }

    static class ResourcesDownCallBack implements ResourceFileListener {
        private WeakReference<WiFiProductIntroductionFragment> mFragment;

        ResourcesDownCallBack(WiFiProductIntroductionFragment wiFiProductIntroductionFragment) {
            this.mFragment = new WeakReference<>(wiFiProductIntroductionFragment);
        }

        @Override // com.huawei.health.device.manager.ResourceFileListener
        public void onResult(int i, String str) {
            WeakReference<WiFiProductIntroductionFragment> weakReference = this.mFragment;
            if (weakReference == null) {
                LogUtil.j(WiFiProductIntroductionFragment.TAG, "ResoureDownCallBack mFragment is null");
                return;
            }
            WiFiProductIntroductionFragment wiFiProductIntroductionFragment = weakReference.get();
            if (wiFiProductIntroductionFragment != null) {
                if (wiFiProductIntroductionFragment.isDestory()) {
                    return;
                }
                if (!wiFiProductIntroductionFragment.isAdded()) {
                    LogUtil.j(WiFiProductIntroductionFragment.TAG, "ResoureDownCallBack mFragment is not add");
                    return;
                } else {
                    onResult(wiFiProductIntroductionFragment, i, str);
                    return;
                }
            }
            LogUtil.j(WiFiProductIntroductionFragment.TAG, "ResoureDownCallBack mFragment.get() is null");
        }

        public void onResult(WiFiProductIntroductionFragment wiFiProductIntroductionFragment, int i, String str) {
            String str2 = wiFiProductIntroductionFragment.mProductId;
            if (!TextUtils.isEmpty(str2)) {
                if (wiFiProductIntroductionFragment.myHandler == null) {
                    LogUtil.j(WiFiProductIntroductionFragment.TAG, "ResoureDownCallBack myHandler is null");
                    return;
                }
                LogUtil.a(WiFiProductIntroductionFragment.TAG, "ResoureDownCallBack resultCode: ", Integer.valueOf(i), " productId: ", str2);
                if (str2.contains(str.trim())) {
                    if (i != 200) {
                        wiFiProductIntroductionFragment.myHandler.sendEmptyMessage(3);
                        return;
                    }
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1;
                    messageObtain.obj = str;
                    wiFiProductIntroductionFragment.myHandler.sendMessage(messageObtain);
                    return;
                }
                return;
            }
            LogUtil.j(WiFiProductIntroductionFragment.TAG, "ResoureDownCallBack mProductId is null");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LogUtil.a(TAG, "onClick view.getId(): ", Integer.valueOf(view.getId()));
        if (view.getId() == R.id.wifi_device_network_setting_layout) {
            if (ecj.b(BaseApplication.getContext())) {
                return;
            }
            ecs.f(this.mainActivity);
            return;
        }
        if (view.getId() == R.id.wifi_device_buy_btn) {
            onClickBuyButton();
            return;
        }
        if (view.getId() == R.id.weight_start_measure_tv) {
            gotoMeasure();
            return;
        }
        if (view.getId() == R.id.wifi_device_bind_btn) {
            LogUtil.a(TAG, "onClick mIsBind: ", Boolean.valueOf(this.mIsBind));
            getBindOtherDevice();
            return;
        }
        if (view.getId() == R.id.more_data_show_layout) {
            era.e(this.mainActivity);
            return;
        }
        if (view.getId() == R.id.wifi_device_claim_data_layout) {
            Intent intent = new Intent();
            intent.setClassName(this.mainActivity, "com.huawei.ui.main.stories.health.activity.healthdata.ClaimMeasureDataActivity");
            try {
                this.mainActivity.startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.e(TAG, "wifi_device_claim_data_layout ActivityNotFoundException");
                return;
            }
        }
        if (view.getId() == R.id.wifi_device_firmware_update_layout) {
            upgradeOnClick();
            return;
        }
        if (view.getId() == R.id.wifi_device_restore_factory_layout) {
            restoreFactoryOnClick();
            return;
        }
        if (view.getId() == R.id.wifi_device_user_guide_layout) {
            userGuideOnClick();
            return;
        }
        if (view.getId() == R.id.wifi_device_data_manager_layout) {
            gotoScaleManagerFragment();
            return;
        }
        if (view.getId() == R.id.wifi_device_share_layout) {
            Intent intent2 = new Intent(this.mainActivity, (Class<?>) WifiDeviceShareActivity.class);
            intent2.putExtra("deviceId", this.mWiFiDevice.e());
            intent2.putExtra("productId", this.mProductId);
            if (this.mDeviceInfo == null) {
                ContentValues contentValues = new ContentValues();
                this.mDeviceInfo = contentValues;
                contentValues.put("productId", this.mProductId);
            }
            intent2.putExtra("commonDeviceInfo", this.mDeviceInfo);
            try {
                this.mainActivity.startActivity(intent2);
                return;
            } catch (ActivityNotFoundException unused2) {
                LogUtil.e(TAG, "onClick ActivityNotFoundException");
                return;
            }
        }
        LogUtil.j(TAG, "onClick view id is other ", Integer.valueOf(view.getId()));
    }

    private void userGuideOnClick() {
        if ("a8ba095d-4123-43c4-a30a-0240011c58de".equals(this.mProductId)) {
            if (CommonUtil.w(this.mainActivity)) {
                openAppHelpActivity(this.mUrl + DEVICE_HONOR_WIFI_WEIGHT_ZH_CN_HELP);
                return;
            }
            openAppHelpActivity(this.mUrl + DEVICE_HONOR_WIFI_WEIGHT_EN_CN_HELP);
            return;
        }
        if ("e4b0b1d5-2003-4d88-8b5f-c4f64542040b".equals(this.mProductId)) {
            if (CommonUtil.w(this.mainActivity)) {
                openAppHelpActivity(this.mUrl + DEVICE_HUAWEI_WIFI_WEIGHT_ZH_CN_HELP);
                return;
            }
            openAppHelpActivity(this.mUrl + DEVICE_HUAWEI_WIFI_WEIGHT_EN_CN_HELP);
            return;
        }
        LogUtil.j(TAG, "userGuideOnClick default");
    }

    private void restoreFactoryOnClick() {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.mainActivity);
        builder.a(R.string.IDS_device_bluetooth_open);
        builder.b(R.string.IDS_device_wifi_factory_data_reset_msg);
        builder.a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m930x66b565d2(view);
            }
        });
        builder.e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m931x7fb6b771(view);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        this.mCancelDataDialog = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.mCancelDataDialog.show();
    }

    /* JADX INFO: renamed from: lambda$restoreFactoryOnClick$5$com-huawei-health-device-ui-measure-fragment-WiFiProductIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m930x66b565d2(View view) {
        this.mCancelDataDialog.dismiss();
        LogUtil.a(TAG, "factory data reset");
        checkNetWork(false);
        onClickUnBind();
    }

    /* JADX INFO: renamed from: lambda$restoreFactoryOnClick$6$com-huawei-health-device-ui-measure-fragment-WiFiProductIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m931x7fb6b771(View view) {
        this.mCancelDataDialog.dismiss();
    }

    private void upgradeOnClick() {
        LogUtil.a(TAG, "onClick upgrade_button");
        if (this.mWiFiDevice == null) {
            LogUtil.j(TAG, "onClick upgrade_button mWiFiDevice is null");
            return;
        }
        Map<String, String> mapC = eas.b().c(this.mWiFiDevice.e());
        if (mapC != null) {
            String str = mapC.get("status");
            if ("2".equals(str) || "3".equals(str)) {
                Bundle bundle = new Bundle();
                bundle.putString("productId", this.mProductId);
                bundle.putBoolean("fromProductView", true);
                bundle.putString("version", mapC.get("fwNewVer"));
                bundle.putString("cer_version", mapC.get("fwCurVer"));
                bundle.putString("update_nodes", mapC.get("releaseNote"));
                if (this.mDeviceInfo == null) {
                    ContentValues contentValues = new ContentValues();
                    this.mDeviceInfo = contentValues;
                    contentValues.put("productId", this.mProductId);
                }
                bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
                WiFiOtaUpdateFragment wiFiOtaUpdateFragment = new WiFiOtaUpdateFragment();
                wiFiOtaUpdateFragment.setArguments(bundle);
                switchFragment(wiFiOtaUpdateFragment);
                return;
            }
        }
        eas.b().c(this.mWiFiDevice.e(), false);
        Bundle bundle2 = new Bundle();
        bundle2.putString("productId", this.mProductId);
        bundle2.putBoolean("fromProductView", true);
        if (this.mDeviceInfo == null) {
            ContentValues contentValues2 = new ContentValues();
            this.mDeviceInfo = contentValues2;
            contentValues2.put("productId", this.mProductId);
        }
        bundle2.putParcelable("commonDeviceInfo", this.mDeviceInfo);
        WiFiProductUpgradeFragment wiFiProductUpgradeFragment = new WiFiProductUpgradeFragment();
        wiFiProductUpgradeFragment.setArguments(bundle2);
        switchFragment(wiFiProductUpgradeFragment);
    }

    private void initAuthDialogContent(View view) {
        if (view == null) {
            LogUtil.j(TAG, "initAuthDialogContent, dialogView is null");
            return;
        }
        String string = getResources().getString(R.string.IDS_device_wifi_user_permission_dialog_message, "");
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.dialog_text_alert_message);
        if (isShowOuthDialog() || isShowPersonalDialog()) {
            StringBuffer stringBuffer = new StringBuffer(16);
            if (isShowOuthDialog()) {
                if (Utils.o()) {
                    stringBuffer.append(System.lineSeparator()).append(getResources().getString(R.string.IDS_health_item_oversea));
                } else {
                    stringBuffer.append(System.lineSeparator()).append(getResources().getString(R.string.IDS_device_wifi_user_permission_dialog_health_data_message));
                }
            }
            if (isShowPersonalDialog()) {
                stringBuffer.append(System.lineSeparator()).append(getResources().getString(R.string.IDS_device_wifi_user_permission_dialog_personal_infomation_message));
            }
            SpannableString spannableString = new SpannableString(getResources().getString(R.string.IDS_device_wifi_user_permission_dialog_message, getResources().getString(R.string.IDS_device_wifi_user_permission_dialog_params_message_new, stringBuffer)));
            qri.a(spannableString, stringBuffer.toString(), new AbsoluteSizeSpan(13, true));
            healthTextView.setText(spannableString);
            return;
        }
        healthTextView.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showOuthDialog, reason: merged with bridge method [inline-methods] */
    public void m926x9e5fef97() {
        if (this.mainActivity == null) {
            LogUtil.j(TAG, "showOuthDialog, show dialog fail, mainActivity is null");
            return;
        }
        View viewInflate = View.inflate(this.mainActivity, R.layout.dialog_user_auth_message, null);
        initAuthDialogContent(viewInflate);
        eqw.e(this.mainActivity, viewInflate, new IBaseResponseCallback() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment$$ExternalSyntheticLambda4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m933xea7ff504(i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showOuthDialog$7$com-huawei-health-device-ui-measure-fragment-WiFiProductIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m933xea7ff504(int i, Object obj) {
        LogUtil.a(TAG, "showOuthDialog, onResponse errCode: ", Integer.valueOf(i), ",objData: ", obj);
        if (i != 0) {
            if (i == -1) {
                LogUtil.j(TAG, "errorCode is error");
                return;
            } else {
                LogUtil.j(TAG, "other error code");
                return;
            }
        }
        if (!this.mIsHealthDataStatus) {
            this.mInteractors.e(7, true, TAG, null);
        }
        if (!this.mIsPersonalInfoStatus) {
            this.mInteractors.e(2, true, TAG, null);
        }
        onClickBind();
    }

    private void onClickBind() {
        LogUtil.a(TAG, "onClickBind");
        setBiModelInformation(AnalyticsValue.HEALTH_PLUGIN_DEVICE_BIND_PRODUCT_2060004.value());
        if (checkWiFiIsOpen()) {
            LogUtil.a(TAG, "onClickBind gotoWiFiInfoDevice");
            gotoWiFiInfoDevice();
        } else {
            LogUtil.j(TAG, "onClickBind not permission");
        }
    }

    private void onClickUnBind() {
        if (this.mIsBindOtherDevice) {
            LogUtil.a(TAG, "onClickUnBind other WiFiDevice");
            eby ebyVar = drw.e().b(this.mBindProductId) instanceof eby ? (eby) drw.e().b(this.mBindProductId) : null;
            proccessUnbind(ebyVar != null ? ebyVar.e() : null);
            return;
        }
        eby ebyVar2 = this.mWiFiDevice;
        if (ebyVar2 != null) {
            String uniqueId = TextUtils.isEmpty(ebyVar2.e()) ? this.mWiFiDevice.getUniqueId() : this.mWiFiDevice.e();
            if (this.mWiFiDevice.a().m() == 2) {
                sendExitAuthorization(this.mainActivity, uniqueId);
                return;
            } else {
                proccessUnbind(uniqueId);
                return;
            }
        }
        LogUtil.j(TAG, "onClickUnBind WiFiDevice is null");
    }

    private void sendExitAuthorization(Context context, final String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "sendExitAuthorization deviceid is null");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        DeviceServiceInfo deviceServiceInfo = new DeviceServiceInfo();
        HashMap map = new HashMap(16);
        map.put("dltId", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        deviceServiceInfo.setData(map);
        deviceServiceInfo.setSid("setDevParam");
        arrayList.add(deviceServiceInfo);
        WifiDeviceControlDataModelReq wifiDeviceControlDataModelReq = new WifiDeviceControlDataModelReq();
        wifiDeviceControlDataModelReq.setDeviceServiceInfo(arrayList);
        wifiDeviceControlDataModelReq.setDevId(str);
        lqo.b(context).e(wifiDeviceControlDataModelReq, new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment$$ExternalSyntheticLambda13
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str2, boolean z) {
                this.f$0.m932x260b1149(str, (CloudCommonReponse) obj, str2, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$sendExitAuthorization$8$com-huawei-health-device-ui-measure-fragment-WiFiProductIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m932x260b1149(String str, CloudCommonReponse cloudCommonReponse, String str2, boolean z) {
        if (z) {
            subUserUnBind(str);
            LogUtil.a(TAG, "sendExitAuthorization success");
        } else if (cloudCommonReponse != null) {
            Integer resultCode = cloudCommonReponse.getResultCode();
            int iIntValue = resultCode.intValue();
            LogUtil.a(TAG, "errorCode: ", resultCode, " | errorDes: ", cloudCommonReponse.getResultDesc());
            if (iIntValue == 112000030) {
                unBindLocalDevice();
            } else {
                subUserUnBind(str);
            }
        }
    }

    private void subUserUnBind(String str) {
        WifiDeviceExitAuthorizeSubUserReq wifiDeviceExitAuthorizeSubUserReq = new WifiDeviceExitAuthorizeSubUserReq();
        wifiDeviceExitAuthorizeSubUserReq.setDevId(str);
        lqo.b(dxw.d()).b(wifiDeviceExitAuthorizeSubUserReq, new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment$$ExternalSyntheticLambda3
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str2, boolean z) {
                this.f$0.m937xb8f38254((CloudCommonReponse) obj, str2, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$subUserUnBind$10$com-huawei-health-device-ui-measure-fragment-WiFiProductIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m937xb8f38254(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        int iIntValue;
        String resultDesc;
        LogUtil.a(TAG, "subUserUnBind: ", Boolean.valueOf(z));
        if (z) {
            unBindLocalDevice();
            return;
        }
        if (cloudCommonReponse == null) {
            iIntValue = Constants.CODE_UNKNOWN_ERROR;
            resultDesc = "unknown error";
        } else {
            iIntValue = cloudCommonReponse.getResultCode().intValue();
            resultDesc = cloudCommonReponse.getResultDesc();
        }
        if (iIntValue == 112000030 || iIntValue == 112000000) {
            unBindLocalDevice();
        } else if (this.mainActivity != null) {
            this.mainActivity.runOnUiThread(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m938xe78cd6fa();
                }
            });
        }
        LogUtil.a(TAG, "subUserUnBind error: ", Integer.valueOf(iIntValue), ",resultDesc: ", resultDesc);
    }

    private void proccessUnbind(String str) {
        if (str == null) {
            LogUtil.j(TAG, "proccessUnbind deviceId is null");
            return;
        }
        WifiDeviceUnbindReq wifiDeviceUnbindReq = new WifiDeviceUnbindReq();
        wifiDeviceUnbindReq.setDevId(str);
        LogUtil.a(TAG, "onClickUnBind: ", dyg.d(str));
        lqo.b(dxw.d()).e(wifiDeviceUnbindReq, new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment$$ExternalSyntheticLambda8
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str2, boolean z) {
                this.f$0.m929x47604ab9((CloudCommonReponse) obj, str2, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$proccessUnbind$12$com-huawei-health-device-ui-measure-fragment-WiFiProductIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m929x47604ab9(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        int iIntValue;
        String resultDesc;
        LogUtil.a(TAG, "onClickUnBind: ", Boolean.valueOf(z));
        if (z) {
            unBindLocalDevice();
            return;
        }
        if (cloudCommonReponse == null) {
            iIntValue = Constants.CODE_UNKNOWN_ERROR;
            resultDesc = "unknown error";
        } else {
            iIntValue = cloudCommonReponse.getResultCode().intValue();
            resultDesc = cloudCommonReponse.getResultDesc();
        }
        if (iIntValue == 112000000) {
            unBindLocalDevice();
        } else if (this.mainActivity != null) {
            this.mainActivity.runOnUiThread(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m928x2e5ef91a();
                }
            });
        }
        LogUtil.a(TAG, " onClickUnBind error: ", Integer.valueOf(iIntValue), ",resultDesc: ", resultDesc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showUnBindFail, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m938xe78cd6fa() {
        qpx.e(this.mainActivity, R.string.IDS_update_server_bussy);
    }

    private void unBindLocalDevice() {
        dxm.b(this.mUniqueId);
        if (this.mIsBindOtherDevice) {
            LogUtil.a(TAG, "unBindLocalDevice otherDevice mBindProductId: ", dyg.d(this.mBindProductId));
            drw.e().l(this.mUniqueId);
            this.mIsBindOtherDevice = false;
            m926x9e5fef97();
            return;
        }
        LogUtil.a(TAG, " unBindLocalDevice currentDevice mBindProductId: ", dyg.d(this.mProductId));
        if (this.mWiFiDevice != null) {
            SharedPreferenceManager.e(this.mainActivity, "wifi_weight_device", "support_multi_account_" + this.mWiFiDevice.e(), "", null);
            SharedPreferenceManager.e(this.mainActivity, "wifi_weight_device", "health_is_wifi_add_member_first_" + this.mWiFiDevice.e(), BOOLEAN_FALSE, null);
        }
        ClaimWeightDataManager.INSTANCE.unRegisterCallBack(getClass().getSimpleName());
        SharedPreferenceManager.e(this.mainActivity, String.valueOf(10000), "pressure_calibrate_hrv_userinfo_" + this.mUniqueId, "", null);
        SharedPreferenceManager.e(this.mainActivity, String.valueOf(10000), "wifi_scale_unit_change", "", null);
        if (this.mProductInfo != null) {
            SharedPreferenceManager.e(this.mainActivity, String.valueOf(10000), "wife_device_send_event_to_kaka_" + this.mProductInfo.h(), "", null);
        } else {
            LogUtil.j(TAG, "unBindLocalDevice mProductInfo is null");
        }
        if (!drw.e().l(this.mUniqueId) || this.mainActivity == null) {
            return;
        }
        this.mainActivity.finish();
    }

    private void setBiModelInformation(String str) {
        dyj.d(this.mProductInfo, str);
    }

    private void onClickBuyButton() {
        setBiModelInformation(AnalyticsValue.HEALTH_PLUGIN_DEVICE_BUY_PRODUCT_2060003.value());
        String strC = this.mProductInfo.c("miaomall_url");
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j(TAG, "onClickBuyButton haven't get miaomall url");
            strC = this.mProductInfo.c("buy_url");
        }
        if (!TextUtils.isEmpty(strC)) {
            Intent intent = new Intent();
            intent.setPackage(BaseApplication.getAppPackage());
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.operation.activity.WebViewActivity");
            intent.putExtra("url", strC);
            intent.putExtra("EXTRA_BI_ID", "");
            intent.putExtra("EXTRA_BI_NAME", "");
            intent.putExtra("EXTRA_BI_SOURCE", "Device");
            startActivity(intent);
            return;
        }
        enz.b(this.mainActivity, R.string.IDS_device_datasourceactivity_no_vmall);
    }

    private boolean checkWiFiIsOpen() {
        if (ecs.e(this.mainActivity)) {
            return true;
        }
        LogUtil.j(TAG, "checkWiFiIsOpen checkWifiStatus false");
        dys.a().e((Context) this.mainActivity, new ScaleDialogCallback() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment$$ExternalSyntheticLambda5
            @Override // com.huawei.health.device.callback.ScaleDialogCallback
            public final void operationResult(int i) {
                this.f$0.m925x1258f41(i);
            }
        });
        return false;
    }

    /* JADX INFO: renamed from: lambda$checkWiFiIsOpen$13$com-huawei-health-device-ui-measure-fragment-WiFiProductIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m925x1258f41(int i) {
        LogUtil.a(TAG, "showWifiSwitchEnableDialog result: ", Integer.valueOf(i));
        if (i == 0) {
            if (((WifiManager) this.mainActivity.getSystemService("wifi")).setWifiEnabled(true)) {
                gotoWiFiInfoDevice();
                return;
            } else {
                ecs.l(this.mainActivity);
                return;
            }
        }
        LogUtil.d(TAG, "showWifiSwitchEnableDialog: do nothing");
    }

    private void getBindOtherDevice() {
        if (!this.mIsBind) {
            if ("a8ba095d-4123-43c4-a30a-0240011c58de".equals(this.mProductId)) {
                boolean zIsBindTheOtherDevice = isBindTheOtherDevice("e4b0b1d5-2003-4d88-8b5f-c4f64542040b");
                this.mIsBindOtherDevice = zIsBindTheOtherDevice;
                if (zIsBindTheOtherDevice) {
                    this.mBindProductId = "e4b0b1d5-2003-4d88-8b5f-c4f64542040b";
                }
            } else if ("e4b0b1d5-2003-4d88-8b5f-c4f64542040b".equals(this.mProductId)) {
                boolean zIsBindTheOtherDevice2 = isBindTheOtherDevice("a8ba095d-4123-43c4-a30a-0240011c58de");
                this.mIsBindOtherDevice = zIsBindTheOtherDevice2;
                if (zIsBindTheOtherDevice2) {
                    this.mBindProductId = "a8ba095d-4123-43c4-a30a-0240011c58de";
                }
            } else {
                LogUtil.j(TAG, "getBindOtherDevice default");
            }
        }
        LogUtil.a(TAG, "getBindOtherDevice mIsBindOtherDevice", Boolean.valueOf(this.mIsBindOtherDevice));
        m926x9e5fef97();
    }

    private void gotoWiFiInfoDevice() {
        LogUtil.a(TAG, "gotoWiFiInfoDevice mProductId", this.mProductId);
        if (!ecj.e(this.mainActivity, (LocationManager) null)) {
            dys.a().c(this.mainActivity);
        } else {
            checkHavePermission();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gotoWiFiInfo() {
        ecp.c().a();
        if (Build.VERSION.SDK_INT < 28) {
            ecs.o(this.mainActivity);
        }
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.mProductId);
        if (this.mDeviceInfo == null) {
            ContentValues contentValues = new ContentValues();
            this.mDeviceInfo = contentValues;
            contentValues.put("productId", this.mProductId);
        }
        bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
        WiFiInfoConfirmFragment wiFiInfoConfirmFragment = new WiFiInfoConfirmFragment();
        wiFiInfoConfirmFragment.setArguments(bundle);
        switchFragment(wiFiInfoConfirmFragment);
    }

    private void checkHavePermission() {
        if (!lsg.d(this.mainActivity, PERMISSIONS)) {
            boolean zE = CommonUtil.e(this.mainActivity, "android.permission.ACCESS_COARSE_LOCATION");
            LogUtil.a(TAG, "checkHavePermission checkWifiStatus isLocationPermission ", Boolean.valueOf(zE));
            if (!zE) {
                this.mIsPermission = true;
                ecj.c(this.mainActivity, this.mainActivity.getString(R.string.IDS_hwh_motiontrack_permission_guide_location), new DialogInterface.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        WiFiProductIntroductionFragment.this.mIsPermission = false;
                    }
                });
                return;
            } else {
                requestLocationAndSave();
                return;
            }
        }
        gotoWiFiInfo();
    }

    private void requestLocationAndSave() {
        Activity activity = this.mainActivity;
        String[] strArr = PERMISSIONS;
        lsg.a(activity, strArr, new PermissionsResultAction() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment.4
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a(WiFiProductIntroductionFragment.TAG, "onGranted()");
                WiFiProductIntroductionFragment.this.gotoWiFiInfo();
            }

            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a(WiFiProductIntroductionFragment.TAG, "onDenied()");
            }
        });
        for (String str : strArr) {
            if ("android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
                CommonUtil.k(this.mainActivity, "android.permission.ACCESS_COARSE_LOCATION");
            }
        }
    }

    private void showUnbindDialog() {
        CustomTextAlertDialog customTextAlertDialog = this.mUnbindDialog;
        if (customTextAlertDialog == null || !customTextAlertDialog.isShowing()) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.mainActivity).a(R.string.IDS_hw_health_wear_connect_device_unpair_button).b(R.string.IDS_unbind_device_wear_home).a(R.string.IDS_hw_health_wear_connect_device_unpair_button, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m935x2c5b6084(view);
                }
            }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiProductIntroductionFragment$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m936x455cb223(view);
                }
            }).b();
            this.mUnbindDialog = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
            this.mUnbindDialog.show();
        }
    }

    /* JADX INFO: renamed from: lambda$showUnbindDialog$14$com-huawei-health-device-ui-measure-fragment-WiFiProductIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m935x2c5b6084(View view) {
        this.mUnbindDialog.dismiss();
        this.mUnbindDialog = null;
        onClickUnBind();
    }

    /* JADX INFO: renamed from: lambda$showUnbindDialog$15$com-huawei-health-device-ui-measure-fragment-WiFiProductIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m936x455cb223(View view) {
        this.mUnbindDialog.dismiss();
        this.mUnbindDialog = null;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        if ((this.mIsBind || this.mIsBindComeInThePage) && this.mainActivity != null) {
            this.mainActivity.finish();
            return false;
        }
        return super.onBackPressed();
    }

    private boolean getDataStatus() {
        if ("true".equals(this.mInteractors.c(7))) {
            this.mIsHealthDataStatus = true;
        } else {
            this.mIsHealthDataStatus = false;
        }
        return !this.mIsHealthDataStatus;
    }

    private boolean gePersonalInfoStatus() {
        if ("true".equals(this.mInteractors.c(2))) {
            this.mIsPersonalInfoStatus = true;
        } else {
            this.mIsPersonalInfoStatus = false;
        }
        return !this.mIsPersonalInfoStatus;
    }

    private boolean isShowOuthDialog() {
        return getDataStatus() && Utils.h();
    }

    private boolean isShowPersonalDialog() {
        return gePersonalInfoStatus() && Utils.h();
    }

    private void openAppHelpActivity(String str) {
        Intent intent = new Intent(this.mainActivity, (Class<?>) WebViewActivity.class);
        LogUtil.a(TAG, "openAppHelpActivity url: ", str);
        intent.putExtra("WebViewActivity.REQUEST_URL_KEY", str);
        intent.putExtra(Constants.JUMP_MODE_KEY, 8);
        try {
            this.mainActivity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e(TAG, "openAppHelpActivity ActivityNotFoundException");
        }
    }

    private void gotoScaleManagerFragment() {
        LogUtil.a(TAG, "gotoScaleManagerFragment");
        String strE = this.mWiFiDevice.e();
        Bundle bundle = new Bundle();
        bundle.putString("deviceId", strE);
        bundle.putString("productId", this.mProductId);
        if (this.mDeviceInfo == null) {
            ContentValues contentValues = new ContentValues();
            this.mDeviceInfo = contentValues;
            contentValues.put("productId", this.mProductId);
        }
        bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
        WiFiBodyFatScaleDataManagerFragment wiFiBodyFatScaleDataManagerFragment = new WiFiBodyFatScaleDataManagerFragment();
        wiFiBodyFatScaleDataManagerFragment.setArguments(bundle);
        switchFragment(wiFiBodyFatScaleDataManagerFragment);
    }

    private void reFreshDevData() {
        LogUtil.a(TAG, "into reFreshDevData");
        String strE = SharedPreferenceManager.e(this.mainActivity, String.valueOf(10000), "health_is_wificlear");
        LogUtil.a(TAG, "isClearCome:", strE);
        if (strE == null || strE.length() == 0 || BOOLEAN_FALSE.equals(strE)) {
            LogUtil.a(TAG, "reFreshDevData");
            ean.d();
        }
        SharedPreferenceManager.e(this.mainActivity, String.valueOf(10000), "health_is_wificlear", BOOLEAN_FALSE, null);
    }

    private void gotoMeasure() {
        if (!CommonUtil.ab(this.mainActivity)) {
            ecj.d(this.mainActivity);
            return;
        }
        BaseFragment baseFragmentA = dst.a(this.mProductId);
        if (baseFragmentA != null) {
            Bundle bundle = new Bundle();
            bundle.putString("view", "measure");
            bundle.putString("productId", this.mProductId);
            if (this.mDeviceInfo == null) {
                ContentValues contentValues = new ContentValues();
                this.mDeviceInfo = contentValues;
                contentValues.put("productId", this.mProductId);
            }
            bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
            baseFragmentA.setArguments(bundle);
            switchFragment(baseFragmentA);
        }
    }
}
