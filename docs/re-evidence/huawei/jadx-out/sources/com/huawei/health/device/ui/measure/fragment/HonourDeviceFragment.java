package com.huawei.health.device.ui.measure.fragment;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.media3.common.C;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.open.MeasureController;
import com.huawei.health.device.open.MeasureKit;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.device.ui.measure.BaseInteractor;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.activity.DeviceUsageDescriptionActivity;
import com.huawei.health.versionmgr.api.VersionMgrApi;
import com.huawei.hihealth.device.open.HealthDevice;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.webview.WebViewActivity;
import defpackage.dmp;
import defpackage.dnf;
import defpackage.drw;
import defpackage.dst;
import defpackage.dtf;
import defpackage.dti;
import defpackage.dwj;
import defpackage.dwk;
import defpackage.dxm;
import defpackage.dxp;
import defpackage.dxw;
import defpackage.dyg;
import defpackage.dyj;
import defpackage.eby;
import defpackage.elh;
import defpackage.elo;
import defpackage.eny;
import defpackage.era;
import defpackage.etn;
import defpackage.lon;
import defpackage.qop;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class HonourDeviceFragment extends BaseFragment implements View.OnClickListener {
    private static final String AM16_SETTINGS = "am16_settings";
    private static final String CONNECT_STATUS = "status";
    private static final String CONNECT_TYPE_LONG_TAG = "type";
    private static final int DELAY_TIME = 3000;
    private static final int DELETE_DEVICE = 0;
    private static final String DEVICE_KIND = "kind";
    private static final String DOWNLOAD_STATUS = "false";
    private static final String GO_BACK_TAG = "goback";
    private static final String HONOUR_DEVICE = "honour_device";
    private static final String HUAWEI_FIT = "HUAWEI FIT";
    private static final int MESSAGE_DOWNLOAD_FAIL = 2;
    private static final int MESSAGE_DOWNLOAD_NOFILE = 3;
    private static final int MESSAGE_DOWNLOAD_RESOURCE_IN_PROGRESS = 1;
    private static final int MESSAGE_DOWNLOAD_RESOURCE_SUCCESS = 0;
    private static final String METIS_PRODUCTID = "9323f6b7-b459-44f4-a698-988d1769832a";
    private static final String OPEN_SERVICE = "OpenService";
    private static final int POLLEN_CLUB = 2;
    private static final int SERVICE_HOT_LINE = 1;
    private static final String SERVICE_XINQING_INDEX_URL = "/heartIndex/index.html";
    private static final String TAG = "HonourDeviceFragment";
    private static final int TIME_LOST = 120000;
    private static final int UP_VIEW_TYPE = 3;
    private static final String VIEW_TYPE = "view";
    private static final String VIEW_TYPE_MEASURE = "measure";
    private HealthTextView mBodyFatScaleDeviceStartMeasure;
    private ImageView mCleanUserDataArrowImg;
    private RelativeLayout mCleanUserDataLayout;
    private String mClubHost;
    private ImageView mDeviceImg;
    private ImageView mFirmwareUpdateArrowImg;
    private RelativeLayout mFirmwareUpdateLayout;
    private String mGoto;
    private LinearLayout mHeadPhoneShowLayout;
    private RelativeLayout mHeartFineIndexNumberLayout;
    private ImageView mHeartRateMeasureStatusImage;
    private BaseInteractor mInteractor;
    private CommonDialog21 mLoadingDialog;
    private HealthTextView mOtherTextView;
    private String mProductId;
    private elh mProductInfo;
    private dwj mServiceControl;
    private List<dwk> mServiceList;
    private ImageView mShowMoreDataArrowImage;
    private LinearLayout mShowMoreDataLayout;
    private RelativeLayout mSleepPressureLayout;
    private RelativeLayout mTahitiUserGuideLayout;
    private String mUrl;
    private RelativeLayout mUserGuideLayout;
    private RelativeLayout mWeightDataFromSmartLifeLayout;
    private LinearLayout mWeightDeviceShowLayout;
    private LinearLayout mWeightLayoutContainer;
    private LinearLayout mWeightValueLayoutContainer;
    private String mUniqueId = null;
    private ContentValues mDeviceInfo = null;
    private Handler mHandler = new InnerStaticHandler(this);

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    private boolean isNeedUpdateAm16Resource() {
        LogUtil.a(TAG, "init get AM16 resource");
        return getAm16ResourceStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveAm16ResourceStatus() {
        SharedPreferenceManager.e(dxw.d(), "BondDevice", AM16_SETTINGS, DOWNLOAD_STATUS, new StorageParams());
    }

    private boolean getAm16ResourceStatus() {
        String strE = SharedPreferenceManager.e(dxw.d(), "BondDevice", AM16_SETTINGS);
        LogUtil.a(TAG, "isDownloadFile is ", strE);
        return !DOWNLOAD_STATUS.equals(strE);
    }

    protected void showmLoadingDialog(int i) {
        if (this.mLoadingDialog == null) {
            new CommonDialog21(getActivity(), R.style.app_update_dialogActivity);
            CommonDialog21 commonDialog21B = CommonDialog21.b(getActivity());
            this.mLoadingDialog = commonDialog21B;
            commonDialog21B.b(getActivity().getString(i));
            this.mLoadingDialog.c();
            this.mLoadingDialog.setCancelable(false);
            return;
        }
        LogUtil.j(TAG, "mLoadingDialog is not null");
    }

    protected void destroymLoadingDialog() {
        CommonDialog21 commonDialog21 = this.mLoadingDialog;
        if (commonDialog21 != null) {
            commonDialog21.cancel();
            this.mLoadingDialog = null;
            LogUtil.a(TAG, "destroy mLoadingDialog");
        }
    }

    private void downloadAm16Resource() {
        if (isNeedUpdateAm16Resource() && dxm.aa(this.mProductId)) {
            showmLoadingDialog(R.string.IDS_hw_dialog_am16_message);
            this.mHandler.sendEmptyMessageDelayed(2, 120000L);
            dxp.e(this.mProductId, new IBaseResponseCallback() { // from class: com.huawei.health.device.ui.measure.fragment.HonourDeviceFragment$$ExternalSyntheticLambda6
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f$0.m898x411879ec(i, obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$downloadAm16Resource$0$com-huawei-health-device-ui-measure-fragment-HonourDeviceFragment, reason: not valid java name */
    /* synthetic */ void m898x411879ec(int i, Object obj) {
        if (i == 1) {
            this.mHandler.sendEmptyMessage(0);
            return;
        }
        if (i == -11) {
            this.mHandler.sendEmptyMessage(3);
        } else if (i == 0) {
            this.mHandler.sendEmptyMessage(1);
        } else {
            this.mHandler.sendEmptyMessage(2);
            LogUtil.j(TAG, "MESSAGE_DOWNLOAD_FAIL response, errorCode: ", Integer.valueOf(i));
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.child = layoutInflater.inflate(R.layout.fragment_honour_device_setting, viewGroup, false);
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        init();
        initListener();
        if (viewOnCreateView instanceof ViewGroup) {
            ((ViewGroup) viewOnCreateView).addView(this.child);
        }
        return viewOnCreateView;
    }

    private void initListener() {
        this.mBodyFatScaleDeviceStartMeasure.setOnClickListener(this);
        this.mHeartRateMeasureStatusImage.setOnClickListener(this);
        this.mUserGuideLayout.setOnClickListener(this);
        this.mTahitiUserGuideLayout.setOnClickListener(this);
        this.mHeartFineIndexNumberLayout.setOnClickListener(this);
        this.mSleepPressureLayout.setOnClickListener(this);
        this.mCleanUserDataLayout.setOnClickListener(this);
        this.mFirmwareUpdateLayout.setOnClickListener(this);
        this.mShowMoreDataLayout.setOnClickListener(this);
    }

    private void openAppHelpActivity(String str) {
        LogUtil.d(TAG, "openAppHelpActivity useUrl: ", str);
        dyj.d();
        Intent intent = new Intent(this.mainActivity, (Class<?>) WebViewActivity.class);
        intent.putExtra("WebViewActivity.REQUEST_URL_KEY", str);
        intent.putExtra(Constants.JUMP_MODE_KEY, 8);
        try {
            this.mainActivity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e(TAG, "openAppHelpActivity activity exception");
        }
    }

    private void openHeartIndexActivity() {
        LogUtil.a(TAG, "openHeartIndexActivity to enter");
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("healthRecommendUrl");
        LogUtil.d(TAG, "openHeartIndexActivity recommendHost: ", url);
        if (this.mServiceList.size() > 1) {
            startService(this.mServiceList.get(1));
            return;
        }
        if (TextUtils.isEmpty(url)) {
            LogUtil.j(TAG, "openHeartIndexActivity recommendHost is empty");
            return;
        }
        LogUtil.a(TAG, "xinqing service is null, create OpenService");
        dwk dwkVar = new dwk();
        dwkVar.r(url + SERVICE_XINQING_INDEX_URL);
        dwkVar.n("xinqing");
        dwkVar.f(this.mainActivity.getString(R.string.IDS_hw_heart_index));
        startService(dwkVar);
    }

    private void openSleepDecompression() {
        LogUtil.a(TAG, "openSleepDecompression to enter");
        if (this.mServiceList.size() > 1) {
            startService(this.mServiceList.get(0));
            return;
        }
        String strD = lon.c().d("domain_www_heart_ide");
        if (CommonUtil.cl()) {
            strD = lon.c().d("domain_web_debug_psy");
        }
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j(TAG, "openSleepDecompression relaxHost is empty");
            return;
        }
        LogUtil.a(TAG, "shumian service is null , create OpenService");
        dwk dwkVar = new dwk();
        dwkVar.r(strD + CompileParameterUtil.b("SERVICE_SHUMIAN_RELAX_URL", ""));
        dwkVar.n(KakaConstants.DECOMPRESSI0N);
        dwkVar.f(this.mainActivity.getString(R.string.IDS_hw_sleep_relax));
        startService(dwkVar);
    }

    private void init() {
        ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
        this.mDeviceInfo = contentValues;
        if (contentValues == null) {
            this.mProductId = getArguments().getString("productId");
        } else {
            this.mProductId = contentValues.getAsString("productId");
            this.mUniqueId = this.mDeviceInfo.getAsString("uniqueId");
        }
        if (!TextUtils.isEmpty(this.mProductId) && TextUtils.isEmpty(this.mUniqueId)) {
            HealthDevice healthDeviceA = dmp.d().a(this.mProductId);
            if (healthDeviceA != null) {
                this.mUniqueId = healthDeviceA.getUniqueId();
            } else {
                LogUtil.j(TAG, "init device is null, productId: ", dyg.b(this.mProductId));
                this.mainActivity.onBackPressed();
            }
        }
        eny.a().d(this.mProductId);
        LogUtil.a(TAG, "HonourDeviceFragment init is ", this.mProductId, ", isHonorWeightScale: ", Boolean.valueOf(eny.a().b()));
        this.mGoto = getArguments().getString("goto");
        intUrl();
        if (TextUtils.isEmpty(this.mClubHost)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.HonourDeviceFragment$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m899x80c90116();
                }
            });
        }
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        this.mProductInfo = elhVarD;
        if (elhVarD != null) {
            dnf.e().b(this.mProductInfo.q(), ResourceManager.c().a(this.mProductId) + File.separator + this.mProductInfo.o());
        }
        initView();
        initData();
        dnf.e().b("54C9739F-CA5C-4347-9F00-75B9DDF2C649");
        initOpenService();
        downloadAm16Resource();
    }

    /* JADX INFO: renamed from: lambda$init$1$com-huawei-health-device-ui-measure-fragment-HonourDeviceFragment, reason: not valid java name */
    /* synthetic */ void m899x80c90116() {
        this.mClubHost = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("domainHuafenUrl", "");
    }

    private void intUrl() {
        if (TextUtils.isEmpty(this.mUrl)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.HonourDeviceFragment$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m901x507aff87();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$intUrl$2$com-huawei-health-device-ui-measure-fragment-HonourDeviceFragment, reason: not valid java name */
    /* synthetic */ void m901x507aff87() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        if (TextUtils.isEmpty(accountInfo)) {
            accountInfo = "SG";
        }
        this.mUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("domainTipsResDbankcdn", accountInfo);
    }

    private void initData() {
        initHeadPhoneAndWeightDeviceView();
        if (dxm.aa(this.mProductId)) {
            this.mInteractor = new dtf(this.mainActivity, this.child, this.mProductId, this.mUniqueId);
            return;
        }
        if (dxm.ab(this.mProductId)) {
            if (this.mInteractor == null) {
                this.mInteractor = dti.d(this.mProductId, this.mUniqueId);
            }
            BaseInteractor baseInteractor = this.mInteractor;
            if (baseInteractor instanceof dti) {
                ((dti) baseInteractor).c(this.mainActivity, this.child);
                ((dti) this.mInteractor).d();
            }
            if (getActivity() instanceof DeviceMainActivity) {
                ((DeviceMainActivity) getActivity()).e(HonourDeviceFragment.class);
            }
            if ("33123f39-7fc1-420b-9882-a4b0d6c61100".equals(this.mProductId)) {
                this.mDeviceImg.setImageResource(R.drawable.pic_huawei_device_manager_img);
                return;
            } else if ("ccd1f0f8-8c57-4bd7-a884-0ef38482f15f".equals(this.mProductId)) {
                this.mDeviceImg.setImageResource(R.drawable.pic_honor_device_manager_img);
                return;
            } else {
                this.mDeviceImg.setImageResource(R.drawable.pic_huawei_home_device_img);
                return;
            }
        }
        LogUtil.j(TAG, "initData() is other Device");
    }

    private void initHeadPhoneAndWeightDeviceView() {
        if (dxm.aa(this.mProductId)) {
            this.mHeadPhoneShowLayout.setVisibility(0);
            this.mWeightDeviceShowLayout.setVisibility(8);
            this.mOtherTextView.setVisibility(8);
            this.mFirmwareUpdateLayout.setVisibility(8);
            this.mCleanUserDataLayout.setVisibility(8);
            fitTahiti();
            return;
        }
        this.mHeadPhoneShowLayout.setVisibility(8);
        this.mWeightDeviceShowLayout.setVisibility(0);
        this.mOtherTextView.setVisibility(0);
        this.mFirmwareUpdateLayout.setVisibility(0);
        this.mCleanUserDataLayout.setVisibility(0);
    }

    private void fitTahiti() {
        if (qrs.af(this.mainActivity)) {
            this.mTahitiUserGuideLayout.setVisibility(0);
            this.mUserGuideLayout.setVisibility(8);
        } else {
            this.mTahitiUserGuideLayout.setVisibility(8);
            this.mUserGuideLayout.setVisibility(0);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public void initViewTahiti() {
        super.initViewTahiti();
        LogUtil.a(TAG, "initViewTahiti() to enter");
        if (dxm.aa(this.mProductId)) {
            fitTahiti();
        }
    }

    private void initView() {
        this.mDeviceImg = (ImageView) qsp.a(this.child, R.id.device_img);
        this.mHeadPhoneShowLayout = (LinearLayout) qsp.a(this.child, R.id.head_phone_show_layout);
        this.mTahitiUserGuideLayout = (RelativeLayout) qsp.a(this.child, R.id.tahiti_user_guide_layout);
        this.mWeightDeviceShowLayout = (LinearLayout) qsp.a(this.child, R.id.weight_device_show_layout);
        this.mHeartRateMeasureStatusImage = (ImageView) qsp.a(this.child, R.id.heart_rate_measuring_status_img);
        this.mHeartFineIndexNumberLayout = (RelativeLayout) qsp.a(this.child, R.id.heart_fine_index_number_layout);
        this.mSleepPressureLayout = (RelativeLayout) qsp.a(this.child, R.id.sleep_pressure_layout);
        this.mBodyFatScaleDeviceStartMeasure = (HealthTextView) qsp.a(this.child, R.id.weight_start_measure_tv);
        this.mOtherTextView = (HealthTextView) qsp.a(this.child, R.id.other_text_view);
        this.mCleanUserDataLayout = (RelativeLayout) qsp.a(this.child, R.id.clean_user_data_layout);
        this.mFirmwareUpdateLayout = (RelativeLayout) qsp.a(this.child, R.id.firmware_update_layout);
        this.mCleanUserDataArrowImg = (ImageView) qsp.a(this.child, R.id.clean_user_data_arrow_img);
        this.mFirmwareUpdateArrowImg = (ImageView) qsp.a(this.child, R.id.firmware_update_arrow_img);
        this.mUserGuideLayout = (RelativeLayout) qsp.a(this.child, R.id.user_guide_layout);
        this.mWeightValueLayoutContainer = (LinearLayout) qsp.a(this.child, R.id.weight_value_layout_container);
        this.mWeightLayoutContainer = (LinearLayout) qsp.a(this.child, R.id.weight_layout_container);
        this.mWeightDataFromSmartLifeLayout = (RelativeLayout) qsp.a(this.child, R.id.weight_data_from_smart_life_layout);
        this.mShowMoreDataLayout = (LinearLayout) qsp.a(this.child, R.id.more_data_show_layout);
        this.mShowMoreDataArrowImage = (ImageView) qsp.a(this.child, R.id.smart_life_img_arrow);
        if (LanguageUtil.ba(this.mainActivity)) {
            this.mCleanUserDataArrowImg.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.mFirmwareUpdateArrowImg.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.mShowMoreDataArrowImage.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            this.mCleanUserDataArrowImg.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.mFirmwareUpdateArrowImg.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.mShowMoreDataArrowImage.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
        setTitle(this.mProductId, this.mProductInfo);
        this.mDeviceImg.setImageResource(R.mipmap.pic_am16_headset);
        Resources resources = BaseApplication.getContext().getResources();
        if (resources != null) {
            this.mCustomTitleBar.setTitleBarBackgroundColor(resources.getColor(R.color.wear_home_bg_color));
            this.mCustomTitleBar.setRightButtonDrawable(resources.getDrawable(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        }
        this.mCustomTitleBar.setRightButtonVisibility(0);
        this.mCustomTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HonourDeviceFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m900x582fa65d(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initView$3$com-huawei-health-device-ui-measure-fragment-HonourDeviceFragment, reason: not valid java name */
    /* synthetic */ void m900x582fa65d(View view) {
        showUnbindDeviceMenu();
    }

    private void showUnbindDeviceMenu() {
        ArrayList arrayList;
        if (this.mainActivity == null || this.mCustomTitleBar == null) {
            LogUtil.j(TAG, "mainActivity or mCustomTitleBar is null");
            return;
        }
        if (dxm.aa(this.mProductId)) {
            arrayList = new ArrayList(Arrays.asList(getResources().getString(R.string.IDS_device_wear_home_delete_device), getResources().getString(R.string.IDS_settings_service_call_item), getResources().getString(R.string.IDS_my_huawei_club)));
        } else {
            arrayList = new ArrayList(Arrays.asList(getResources().getString(R.string.IDS_device_wear_home_delete_device)));
        }
        new PopViewList(this.mainActivity, this.mCustomTitleBar, arrayList).b(new PopViewList.PopViewClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HonourDeviceFragment$$ExternalSyntheticLambda1
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public final void setOnClick(int i) {
                this.f$0.m902x3c544231(i);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showUnbindDeviceMenu$4$com-huawei-health-device-ui-measure-fragment-HonourDeviceFragment, reason: not valid java name */
    /* synthetic */ void m902x3c544231(int i) {
        if (i == 0) {
            deleteDevice();
            return;
        }
        if (i == 1) {
            callServiceHotLine();
        } else if (i == 2) {
            enterPollenClub();
        } else {
            LogUtil.j(TAG, "unknown position : ", Integer.valueOf(i));
        }
    }

    private void deleteDevice() {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("device_name", etn.c(this.mProductId, this.mProductInfo.l().d()));
        unbindDevice(map);
    }

    private void callServiceHotLine() {
        ResolveInfo resolveInfoResolveActivity;
        LogUtil.a(TAG, "callServiceHotLine to enter");
        dyj.a();
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(KakaConstants.SCHEME_TEL + BaseApplication.getContext().getString(R.string.IDS_main_sns_member_service_call_number_item_2)));
        PackageManager packageManager = this.mainActivity.getPackageManager();
        if (packageManager == null || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 1048576)) == null) {
            return;
        }
        intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
        try {
            this.mainActivity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e(TAG, "callServiceHotLine exception");
        }
    }

    private void enterPollenClub() {
        dyj.c();
        if (TextUtils.isEmpty(this.mClubHost)) {
            this.mClubHost = "https:/";
            LogUtil.j(TAG, "enterPollenClub mClubHost is empty");
        }
        String str = this.mClubHost + "/mhw/consumer/cn/community/mhwnews/allcircle/id_10000008";
        LogUtil.d(TAG, "enterPollenClub() -> pollenClubUrl: ", str, ", jumpModeKey: ", 1);
        Intent intent = new Intent(this.mainActivity, (Class<?>) com.huawei.operation.activity.WebViewActivity.class);
        intent.putExtra("url", str);
        intent.putExtra(Constants.JUMP_MODE_KEY, 1);
        try {
            this.mainActivity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e(TAG, "enterPollenClub exception");
        }
    }

    private void setTitle(String str, elh elhVar) {
        if (elhVar == null) {
            LogUtil.j(TAG, "setTitle error productInfo is null");
            return;
        }
        if (elhVar.l() == null) {
            LogUtil.j(TAG, "the productInfo.getManifest() is null");
            return;
        }
        String strA = elo.a(str, elhVar.l().d());
        if (METIS_PRODUCTID.equals(str) && !LanguageUtil.bb(dxw.d()) && !LanguageUtil.ac(dxw.d()) && !LanguageUtil.l(dxw.d())) {
            strA = HUAWEI_FIT;
        }
        String strH = dxm.h(this.mUniqueId);
        if (!TextUtils.isEmpty(strH)) {
            strA = strA + com.huawei.openalliance.ad.constant.Constants.LINK + strH;
        }
        setTitle(strA);
    }

    private void initOpenService() {
        this.mServiceList = new ArrayList(10);
        dwj dwjVarD = dwj.d(this.mainActivity);
        this.mServiceControl = dwjVarD;
        List<dwk> listA = dwjVarD.a();
        if (listA != null && listA.size() > 0) {
            LogUtil.a(TAG, "mServiceList size is ", Integer.valueOf(listA.size()));
            for (dwk dwkVar : listA) {
                if (dwkVar.a().contains(KakaConstants.DECOMPRESSI0N)) {
                    this.mServiceList.add(dwkVar);
                } else if (!dwkVar.a().contains("xinqing")) {
                    LogUtil.a(TAG, "initOpenService() serviceID: ", dwkVar.a());
                } else {
                    this.mServiceList.add(dwkVar);
                }
            }
        }
        dwk.e(this.mServiceList);
        LogUtil.a(TAG, "mServiceList selected size is ", Integer.valueOf(this.mServiceList.size()));
    }

    private void unbindDevice(final Map<String, Object> map) {
        if (isNoneBondedDevice()) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(getActivity());
            builder.b(R.string.IDS_device_selection_cancel_unbind_device).c(R.string.IDS_device_ui_dialog_yes, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HonourDeviceFragment$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m903x6e88d056(map, view);
                }
            }).a(R.string.IDS_device_ui_dialog_no, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HonourDeviceFragment$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a(HonourDeviceFragment.TAG, "unbindDevice NegativeButton");
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            noTitleCustomAlertDialogC.setCancelable(false);
            noTitleCustomAlertDialogC.show();
        }
    }

    /* JADX INFO: renamed from: lambda$unbindDevice$5$com-huawei-health-device-ui-measure-fragment-HonourDeviceFragment, reason: not valid java name */
    /* synthetic */ void m903x6e88d056(Map map, View view) {
        switchDeviceUnbind(map);
    }

    private void switchDeviceUnbind(Map<String, Object> map) {
        LogUtil.a(TAG, "switchDeviceUnbind");
        VersionMgrApi versionMgrApi = (VersionMgrApi) Services.b("HWVersionMgr", VersionMgrApi.class);
        if (drw.e().h(this.mProductId)) {
            if (drw.e().j(this.mProductId, this.mUniqueId)) {
                drw.e().d(this.mProductId, this.mUniqueId);
                drw.e().b(this.mProductId, this.mUniqueId);
                if (dxm.ab(this.mProductId)) {
                    dxm.g(this.mUniqueId, "");
                    versionMgrApi.resetBandUpdate(this.mProductId, this.mUniqueId);
                }
                versionMgrApi.resetBandUpdate(this.mProductId, this.mUniqueId);
                dyj.c(map);
                getActivity().finish();
                return;
            }
            return;
        }
        String str = this.mProductId;
        if (str != null && dxm.ab(str)) {
            prepare();
        }
        if (dmp.d().o(this.mUniqueId)) {
            drw.e().d(this.mProductId, this.mUniqueId, -5);
            if (dxm.ab(this.mProductId)) {
                dxm.g(this.mUniqueId, "");
                versionMgrApi.resetBandUpdate(this.mProductId, this.mUniqueId);
            }
            dyj.c(map);
            getActivity().finish();
        }
    }

    private void prepare() {
        com.huawei.health.device.model.HealthDevice healthDeviceB = drw.e().b(this.mProductId);
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        if (elhVarD == null) {
            LogUtil.j(TAG, "switchDeviceUnbind productInfo is null");
            return;
        }
        MeasureKit measureKitI = drw.e().i(elhVarD.q());
        if (measureKitI == null) {
            LogUtil.j(TAG, "kit is null");
            return;
        }
        MeasureController measureController = measureKitI.getMeasureController();
        Bundle bundle = new Bundle();
        bundle.putInt("type", -5);
        bundle.putString("productId", this.mProductId);
        if (measureController != null) {
            measureController.prepare(healthDeviceB, null, bundle);
        }
    }

    private void startService(dwk dwkVar) {
        BaseInteractor baseInteractor = this.mInteractor;
        if (baseInteractor instanceof dtf) {
            ((dtf) baseInteractor).d();
        }
        Intent intent = new Intent(this.mainActivity, (Class<?>) com.huawei.operation.activity.WebViewActivity.class);
        intent.putExtra("url", dwkVar.e());
        intent.putExtra("EXTRA_BI_ID", dwkVar.a());
        intent.putExtra("EXTRA_BI_NAME", dwkVar.d());
        intent.putExtra("EXTRA_BI_SOURCE", "OpenService");
        intent.putExtra(Constants.IS_START_FROM_HEART_RATE_BOARD, true);
        intent.putExtra("type", Constants.OPEN_SERVICE_TYPE);
        try {
            this.mainActivity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e(TAG, "startService exception.");
        }
        dyj.b(dwkVar.a(), dwkVar.d());
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BaseInteractor baseInteractor = this.mInteractor;
        if (baseInteractor != null) {
            baseInteractor.onResume();
        }
        showWeightDataView();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BaseInteractor baseInteractor = this.mInteractor;
        if (baseInteractor instanceof dti) {
            dti dtiVar = (dti) baseInteractor;
            dtiVar.b();
            dtiVar.a();
            dtiVar.d(false);
            MeasurableDevice measurableDeviceB = dmp.d().b(this.mUniqueId, true);
            if (measurableDeviceB == null || (measurableDeviceB instanceof eby)) {
                return;
            }
            measurableDeviceB.disconnect();
        }
    }

    private boolean isNoneBondedDevice() {
        if (drw.e().h(this.mProductId)) {
            return drw.e().e(this.mProductId) != null;
        }
        return dmp.d().b(this.mUniqueId, false) != null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.mBodyFatScaleDeviceStartMeasure) {
            startMeasure();
            return;
        }
        if (view == this.mUserGuideLayout) {
            openUserGuideActivity();
            return;
        }
        if (view == this.mTahitiUserGuideLayout) {
            openUserGuideActivity();
            return;
        }
        RelativeLayout relativeLayout = this.mHeartFineIndexNumberLayout;
        if (view == relativeLayout) {
            if (relativeLayout.isEnabled()) {
                openHeartIndexActivity();
                return;
            }
            return;
        }
        RelativeLayout relativeLayout2 = this.mSleepPressureLayout;
        if (view == relativeLayout2) {
            if (relativeLayout2.isEnabled()) {
                openSleepDecompression();
            }
        } else {
            if (view == this.mCleanUserDataLayout) {
                this.mInteractor.controller(5, null);
                return;
            }
            if (view == this.mShowMoreDataLayout) {
                era.e(this.mainActivity);
                return;
            }
            if (view == this.mFirmwareUpdateLayout) {
                this.mInteractor.controller(6, null);
            } else if (view == this.mHeartRateMeasureStatusImage) {
                pleasePluginHeadsets();
            } else {
                LogUtil.j(TAG, "onClick view not exist");
            }
        }
    }

    private void openUserGuideActivity() {
        String strD = dxm.d(this.mProductId);
        if (TextUtils.isEmpty(strD) || TextUtils.isEmpty(this.mUrl)) {
            LogUtil.j(TAG, "openUserGuideActivity url is empty");
            Intent intent = new Intent(this.mainActivity, (Class<?>) DeviceUsageDescriptionActivity.class);
            intent.putExtra("productId", this.mProductId);
            try {
                startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.e(TAG, "openUserGuideActivity exception");
                return;
            }
        }
        LogUtil.d(TAG, "openUserGuideActivity url: ", this.mUrl, strD);
        openAppHelpActivity(this.mUrl + strD);
    }

    private void startMeasure() {
        com.huawei.health.device.model.HealthDevice.HealthDeviceKind healthDeviceKindM = this.mProductInfo.m();
        Fragment fragmentA = dst.a(healthDeviceKindM.name());
        if (fragmentA != null) {
            BaseInteractor baseInteractor = this.mInteractor;
            if (baseInteractor != null) {
                baseInteractor.setClean();
            }
            Bundle bundle = new Bundle();
            bundle.putString(VIEW_TYPE, VIEW_TYPE_MEASURE);
            bundle.putString(DEVICE_KIND, healthDeviceKindM.name());
            bundle.putString("productId", this.mProductId);
            bundle.putString(GO_BACK_TAG, HONOUR_DEVICE);
            BaseInteractor baseInteractor2 = this.mInteractor;
            if (baseInteractor2 instanceof dti) {
                bundle.putBoolean("status", ((dti) baseInteractor2).c());
            }
            bundle.putInt("type", -1);
            bundle.putBoolean("activeMeasure", true);
            ContentValues contentValues = new ContentValues();
            contentValues.put("productId", this.mProductId);
            contentValues.put("uniqueId", this.mUniqueId);
            bundle.putParcelable("commonDeviceInfo", contentValues);
            fragmentA.setArguments(bundle);
            switchFragment(fragmentA);
        }
    }

    private void pleasePluginHeadsets() {
        View viewInflate = View.inflate(this.mainActivity, R.layout.honor_ear_phone_connect_notice_pop_view, null);
        ((HealthTextView) viewInflate.findViewById(R.id.heart_rate_ear_phone_notice)).setText(String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_pad_hw_device_earp_insert), qrs.f(BaseApplication.getContext())));
        final qop qopVar = new qop(this.mainActivity, viewInflate);
        qopVar.e(this.mHeartRateMeasureStatusImage, 3);
        new Handler().postDelayed(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.HonourDeviceFragment$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                qopVar.e();
            }
        }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        BaseInteractor baseInteractor = this.mInteractor;
        if (baseInteractor != null) {
            baseInteractor.onDestroy();
            BaseInteractor baseInteractor2 = this.mInteractor;
            if (baseInteractor2 instanceof dti) {
                dti dtiVar = (dti) baseInteractor2;
                dtiVar.b();
                dtiVar.d(false);
                MeasurableDevice measurableDeviceB = dmp.d().b(this.mUniqueId, true);
                if (measurableDeviceB != null && !(measurableDeviceB instanceof eby)) {
                    measurableDeviceB.disconnect();
                }
            }
        }
        if (!"devicebind".equals(this.mGoto)) {
            return true;
        }
        this.mainActivity.setResult(-1);
        this.mainActivity.finish();
        return false;
    }

    private void showWeightDataView() {
        if (dxm.aa(this.mProductId)) {
            return;
        }
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

    static class InnerStaticHandler extends StaticHandler<HonourDeviceFragment> {
        InnerStaticHandler(HonourDeviceFragment honourDeviceFragment) {
            super(honourDeviceFragment);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        public void handleMessage(HonourDeviceFragment honourDeviceFragment, Message message) {
            if (honourDeviceFragment == null || !honourDeviceFragment.isAdded() || honourDeviceFragment.isDetached()) {
                return;
            }
            if (message == null) {
                LogUtil.j(HonourDeviceFragment.TAG, "can not handle null message");
                return;
            }
            int i = message.what;
            if (i == 0) {
                honourDeviceFragment.saveAm16ResourceStatus();
                honourDeviceFragment.destroymLoadingDialog();
                dnf.e().e("54C9739F-CA5C-4347-9F00-75B9DDF2C649");
                if (honourDeviceFragment.mInteractor != null) {
                    honourDeviceFragment.mInteractor.onResume();
                    return;
                }
                return;
            }
            if (i == 2) {
                honourDeviceFragment.destroymLoadingDialog();
            } else if (i == 3) {
                honourDeviceFragment.saveAm16ResourceStatus();
                honourDeviceFragment.destroymLoadingDialog();
            } else {
                LogUtil.j(HonourDeviceFragment.TAG, "fall through default case");
            }
        }
    }
}
