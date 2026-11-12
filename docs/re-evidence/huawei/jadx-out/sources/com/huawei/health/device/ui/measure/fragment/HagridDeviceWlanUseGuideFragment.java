package com.huawei.health.device.ui.measure.fragment;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.callback.ScaleDialogCallback;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.ui.measure.view.HagridUsageGuideBanner;
import com.huawei.health.device.ui.measure.view.holder.HealthViewPagerHolder;
import com.huawei.health.device.ui.measure.view.holder.HealthViewPagerHolderCreator;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceAddAuthMsgBySubUserReq;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.webview.WebViewActivity;
import com.huawei.up.api.UpApi;
import com.huawei.up.model.UserInfomation;
import defpackage.dnj;
import defpackage.drk;
import defpackage.dwc;
import defpackage.dwp;
import defpackage.dxi;
import defpackage.dxm;
import defpackage.dxw;
import defpackage.dyj;
import defpackage.dyq;
import defpackage.dys;
import defpackage.eam;
import defpackage.eeq;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.eqw;
import defpackage.ioi;
import defpackage.lqo;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qri;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class HagridDeviceWlanUseGuideFragment extends BaseFragment implements View.OnClickListener {
    private static final int COLLECTION_DEFAULT_SIZE = 16;
    private static final int ERROR_CODE_NOT_BELONG = 112000000;
    private static final int ERROR_CODE_REQUEST_SENDING = 112000090;
    private static final int ERROR_CODE_REQUEST_TOO_FAST = 112000080;
    private static final String KEY_ACCOUNT_INFO = "accountInfo";
    private static final int LEFT_PADDING = 4;
    private static final String REACH_MAX_QUOTA_LIMIT = "reach max quota limit";
    private static final int REQUEST_CODE_READ_BECOME_ADMIN_HELP = 1000;
    private static final int REQUEST_CODE_READ_HAGRID_DEVICES_HELP = 1001;
    private static final String TAG = "HagridDeviceWlanUseGuideFragment";
    private static final int TEXT_SIZE = 13;
    private static int mViewType;
    private HealthTextView mBecomeAdminHelpTextView;
    private RelativeLayout mCfgWlanAfterCompleteUserInfoBottomBtnLayout;
    private LinearLayout mCfgWlanBottomLayout;
    private String mCloudDeviceId;
    private Context mContext;
    private ContentValues mDeviceInfo;
    private HealthTextView mDeviceWlanUseGuideTextView;
    private HagridUsageGuideBanner mHagridUsageGuideBanner;
    private boolean mIsNfcCommect;
    private HealthButton mKnowDetailBtn;
    private List<dwc> mList;
    private byte[] mMainHuid;
    private HealthTextView mNotNowKnowDetailTextView;
    private ImageView mNotNowRequestDeviceShareImageView;
    private LinearLayout mNotRequestDeviceShareLayout;
    private String mProductId;
    private HealthButton mRequestCfgWlanButton;
    private ImageView mRequestDeviceShareImageView;
    private LinearLayout mRequestDeviceShareLayout;
    private HealthTextView mTitleHintTextView;
    private HealthTextView mTopBecomeAdminHelpTextView;
    private String mUniqueId;
    private String mUrl;
    private LinearLayout mUseGuideBottomBtnLayout;
    private ImageView mUseGuideImage;
    private LinearLayout mUseGuideImageLayout;
    private ioi mUserProfileMgrUserPrivacy;
    private static final int[] USAGE_GUIDE_TITLES = {R.string.hagrid_guide_handle_title, R.string.hagrid_guide_implant_title, R.string.hagrid_guide_flat_title, R.string.hagrid_guide_bricks_title};
    private static final int[] HAGB29_USAGE_GUIDE_CONTENTS = {R.string.IDS_device_hagrid_b29_meausre_new, R.string.hagrid_guide_implant_content, R.string.hagrid_guide_flat_content, R.string.hagrid_guide_bricks_content};
    private static final int[] HAGB19_USAGE_GUIDE_CONTENTS = {R.string.IDS_device_hagrid_b19_meausre_new, R.string.hagrid_guide_implant_content, R.string.hagrid_guide_flat_content, R.string.hagrid_guide_bricks_content};
    private static final Pattern PATTERN = Pattern.compile("%[0-9]+\\$[s].");
    private String mUserName = "";
    private boolean mIsUploaded = false;
    private dxi mFragmentHelper = new dxi();
    private int mWidth = 0;
    private CountDownTimer mNetworkResponseMsgGetTimer = new CountDownTimer(5000, 1000) { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceWlanUseGuideFragment.1
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            LogUtil.j(HagridDeviceWlanUseGuideFragment.TAG, "mNetworkResponseMsgGetTimer: Network response timeout.");
            qpx.a(HagridDeviceWlanUseGuideFragment.this.mContext, R.string.IDS_connect_error);
        }
    };

    private static String getUserName(Context context) {
        dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
        if (mainUser != null && !TextUtils.isEmpty(mainUser.h())) {
            LogUtil.a(TAG, "getUserName mainUser is not null");
            return mainUser.h();
        }
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo != null && !TextUtils.isEmpty(userInfo.getName())) {
            LogUtil.a(TAG, "getUserName userInfomation is not null");
            return userInfo.getName();
        }
        return new UpApi(context).getLegalAccountName();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a(TAG, "enter onCreate");
        this.mUserProfileMgrUserPrivacy = ioi.d();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a(TAG, "enter onCreateView");
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (!(viewOnCreateView instanceof ViewGroup)) {
            return viewOnCreateView;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewOnCreateView;
        this.child = layoutInflater.inflate(R.layout.hagrid_device_wlan_use_guide_layout, viewGroup, false);
        this.mContext = BaseApplication.getContext();
        viewGroup2.removeView(this.mCustomTitleBar);
        viewGroup2.addView(this.child);
        initView();
        initData();
        initListener();
        updateView(mViewType);
        this.mWidth = qrs.i(this.mainActivity);
        return viewGroup2;
    }

    private void initView() {
        this.mUseGuideImage = (ImageView) this.child.findViewById(R.id.hagrid_device_wlan_use_guide_image);
        this.mNotNowRequestDeviceShareImageView = (ImageView) this.child.findViewById(R.id.hagrid_ble_device_not_now_request_device_share_img);
        this.mRequestDeviceShareImageView = (ImageView) this.child.findViewById(R.id.hagrid_ble_device_request_device_share_img);
        this.mUseGuideImageLayout = (LinearLayout) this.child.findViewById(R.id.hagrid_device_wlan_use_guide_image_layout);
        this.mCustomTitleBar = (CustomTitleBar) this.child.findViewById(R.id.hagrid_device_wlan_use_guide_title);
        this.mRequestCfgWlanButton = (HealthButton) this.child.findViewById(R.id.hagrid_ble_device_request_cfg_wlan);
        this.mBecomeAdminHelpTextView = (HealthTextView) this.child.findViewById(R.id.hagrid_ble_device_become_admin_help);
        this.mTopBecomeAdminHelpTextView = (HealthTextView) this.child.findViewById(R.id.hagrid_ble_top_device_become_admin_help);
        this.mRequestDeviceShareLayout = (LinearLayout) this.child.findViewById(R.id.hagrid_ble_device_btn_request_device_share_ll);
        this.mNotRequestDeviceShareLayout = (LinearLayout) this.child.findViewById(R.id.hagrid_ble_device_btn_not_now_request_device_share_ll);
        this.mCfgWlanBottomLayout = (LinearLayout) this.child.findViewById(R.id.hagrid_ble_device_cfg_wlan_bottom_btn_layout);
        this.mCfgWlanAfterCompleteUserInfoBottomBtnLayout = (RelativeLayout) this.child.findViewById(R.id.ble_device_cfg_wlan_after_complete_user_info_bottom_btn_layout);
        this.mKnowDetailBtn = (HealthButton) this.child.findViewById(R.id.hagrid_device_wlan_use_guide_know_detail);
        this.mNotNowKnowDetailTextView = (HealthTextView) this.child.findViewById(R.id.hagrid_device_wlan_use_guide_not_now_know_detail);
        this.mUseGuideBottomBtnLayout = (LinearLayout) this.child.findViewById(R.id.hagrid_device_wlan_use_guide_bottom_btn_layout);
        this.mDeviceWlanUseGuideTextView = (HealthTextView) this.child.findViewById(R.id.hagrid_devic_wlan_use_guide_text);
        HealthTextView healthTextView = (HealthTextView) this.child.findViewById(R.id.tv_device_device_introduction_prompt);
        this.mTitleHintTextView = healthTextView;
        healthTextView.setVisibility(8);
        HagridUsageGuideBanner hagridUsageGuideBanner = (HagridUsageGuideBanner) this.child.findViewById(R.id.hagrid_usage_guide_banner_view);
        this.mHagridUsageGuideBanner = hagridUsageGuideBanner;
        hagridUsageGuideBanner.setVisibility(8);
        refreshUseGuideImageLayout();
        this.mUseGuideImage.getLayoutParams().height = this.mUseGuideImageLayout.getLayoutParams().height;
        this.mUseGuideImage.getLayoutParams().width = this.mUseGuideImageLayout.getLayoutParams().width;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.mContext.getResources(), R.drawable.hagrid_ble_device_config_wlan_img);
        ImageView imageView = this.mUseGuideImage;
        imageView.setImageBitmap(qqf.e(bitmapDecodeResource, imageView));
        if (LanguageUtil.ba(this.mContext)) {
            this.mNotNowRequestDeviceShareImageView.setBackgroundResource(R.drawable.wifi_device_arrow_right);
            this.mRequestDeviceShareImageView.setBackgroundResource(R.drawable.wifi_device_arrow_left);
        }
    }

    private void initData() {
        LogUtil.a(TAG, "enter initData");
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                ContentValues contentValues = (ContentValues) arguments.getParcelable("commonDeviceInfo");
                this.mDeviceInfo = contentValues;
                if (contentValues != null) {
                    this.mProductId = contentValues.getAsString("productId");
                    this.mUniqueId = this.mDeviceInfo.getAsString("uniqueId");
                }
                if (TextUtils.isEmpty(this.mProductId) || TextUtils.isEmpty(this.mUniqueId)) {
                    LogUtil.j(TAG, "initData mProductId or mUniqueId is empty");
                }
                boolean z = arguments.getBoolean("isNfcConnect", false);
                this.mIsNfcCommect = z;
                LogUtil.a(TAG, "initData getBoolean mIsNfcCommect: ", Boolean.valueOf(z));
                this.mCloudDeviceId = arguments.getString("cloudDeviceId");
                this.mMainHuid = arguments.getByteArray("mainHuid");
                mViewType = arguments.getInt(ParamConstants.Param.VIEW_TYPE);
                ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceWlanUseGuideFragment$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m862xea7a7770();
                    }
                });
            } catch (ArrayIndexOutOfBoundsException unused) {
                LogUtil.e(TAG, "initData getByteArray index out of bounds");
            }
        } else {
            LogUtil.j(TAG, "initData bundle is null");
        }
        updateUserName();
    }

    /* JADX INFO: renamed from: lambda$initData$0$com-huawei-health-device-ui-measure-fragment-HagridDeviceWlanUseGuideFragment, reason: not valid java name */
    /* synthetic */ void m862xea7a7770() {
        this.mUrl = dyq.a(this.mProductId);
    }

    private void initListener() {
        this.mRequestCfgWlanButton.setOnClickListener(this);
        this.mBecomeAdminHelpTextView.setOnClickListener(this);
        this.mTopBecomeAdminHelpTextView.setOnClickListener(this);
        this.mRequestDeviceShareLayout.setOnClickListener(this);
        this.mNotRequestDeviceShareLayout.setOnClickListener(this);
        this.mUseGuideBottomBtnLayout.setOnClickListener(this);
        this.mKnowDetailBtn.setOnClickListener(this);
        this.mNotNowKnowDetailTextView.setOnClickListener(this);
        this.mCustomTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceWlanUseGuideFragment$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m863x8da10c3b(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initListener$1$com-huawei-health-device-ui-measure-fragment-HagridDeviceWlanUseGuideFragment, reason: not valid java name */
    /* synthetic */ void m863x8da10c3b(View view) {
        this.mainActivity.onBackPressed();
    }

    private void updateView(int i) {
        LogUtil.a(TAG, "enter updateView viewType: ", Integer.valueOf(i));
        mViewType = i;
        switch (i) {
            case 12:
                uploadDeviceToCloud();
                showBleDeviceCfgWlanAfterCompleteUserInfoView();
                break;
            case 13:
                showBleDeviceCfgWlanEnterFromDeviceManagerView();
                break;
            case 14:
            case 15:
                showHagridDeviceUseGuideView();
                break;
            default:
                LogUtil.j(TAG, "updateView default");
                break;
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        int i = mViewType;
        if ((i == 15) || (i == 14)) {
            gotoDeviceManagerFragment();
            return false;
        }
        if (i == 12) {
            updateView(14);
            return false;
        }
        return super.onBackPressed();
    }

    private boolean isShowAuthDialog() {
        if (!Utils.h() || !"true".equals(this.mUserProfileMgrUserPrivacy.c(7))) {
            return true;
        }
        LogUtil.j(TAG, "isShowAuthDialog false");
        return false;
    }

    private boolean isShowPersonalDialog() {
        if (!Utils.h() || !"true".equals(this.mUserProfileMgrUserPrivacy.c(2))) {
            return true;
        }
        LogUtil.j(TAG, "isShowPersonalDialog false");
        return false;
    }

    private void showUserPrivacyAuthDialog() {
        View viewInflate = View.inflate(this.mContext, R.layout.dialog_user_auth_message, null);
        initAuthDialogContent(viewInflate);
        eqw.e(this.mainActivity, viewInflate, new IBaseResponseCallback() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceWlanUseGuideFragment$$ExternalSyntheticLambda7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m868xbf581b6e(i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showUserPrivacyAuthDialog$2$com-huawei-health-device-ui-measure-fragment-HagridDeviceWlanUseGuideFragment, reason: not valid java name */
    /* synthetic */ void m868xbf581b6e(int i, Object obj) {
        LogUtil.a(TAG, "showUserPrivacyAuthDialog, onResponse errorCode: ", Integer.valueOf(i));
        if (i == 0) {
            this.mUserProfileMgrUserPrivacy.e(7, true, TAG, null);
            this.mUserProfileMgrUserPrivacy.e(2, true, TAG, null);
            requestDeviceShare();
            setUserPrivacyAuthDialogSp("false");
            if (mViewType == 12) {
                updateView(14);
            }
        }
    }

    private void requestDeviceShare() {
        if (TextUtils.isEmpty(this.mCloudDeviceId)) {
            LogUtil.j(TAG, "requestDeviceShare get device id fail");
            qpx.a(this.mainActivity, R.string.IDS_hwh_ali_sport_auth_failed);
            return;
        }
        byte[] bArr = this.mMainHuid;
        if (bArr == null || bArr.length == 0) {
            LogUtil.j(TAG, "requestDeviceShare get device huid fail");
            qpx.a(this.mainActivity, R.string.IDS_hwh_ali_sport_auth_failed);
            return;
        }
        updateUserName();
        if (CommonUtil.ab(this.mContext)) {
            startNetworkResponseMsgGetCountDown();
        } else {
            qpx.a(this.mContext, R.string.IDS_connect_error);
        }
        final WifiDeviceAddAuthMsgBySubUserReq wifiDeviceAddAuthMsgBySubUserReq = new WifiDeviceAddAuthMsgBySubUserReq();
        wifiDeviceAddAuthMsgBySubUserReq.setDevId(this.mCloudDeviceId);
        wifiDeviceAddAuthMsgBySubUserReq.setMainHuid(getMainHuid());
        wifiDeviceAddAuthMsgBySubUserReq.setNickName(this.mUserName);
        LogUtil.a(TAG, "requestDeviceShare: ", wifiDeviceAddAuthMsgBySubUserReq.toString());
        eam.d().a(this.mProductId, this.mUniqueId, new IBaseResponseCallback() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceWlanUseGuideFragment$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m866xb6837474(wifiDeviceAddAuthMsgBySubUserReq, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$requestDeviceShare$4$com-huawei-health-device-ui-measure-fragment-HagridDeviceWlanUseGuideFragment, reason: not valid java name */
    /* synthetic */ void m866xb6837474(WifiDeviceAddAuthMsgBySubUserReq wifiDeviceAddAuthMsgBySubUserReq, int i, Object obj) {
        if (i == 0) {
            stopNetworkResponseMsgGetCountDown();
            LogUtil.a(TAG, "requestDeviceShare cloud have device");
            qpx.a(this.mainActivity, R.string.IDS_hwh_ali_sport_auth_failed);
            return;
        }
        lqo.b(this.mainActivity).e(wifiDeviceAddAuthMsgBySubUserReq, new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceWlanUseGuideFragment$$ExternalSyntheticLambda1
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj2, String str, boolean z) {
                this.f$0.m865xaf5a9233((CloudCommonReponse) obj2, str, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$requestDeviceShare$3$com-huawei-health-device-ui-measure-fragment-HagridDeviceWlanUseGuideFragment, reason: not valid java name */
    /* synthetic */ void m865xaf5a9233(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        LogUtil.a(TAG, "requestDeviceShare request result: ", Boolean.valueOf(z));
        stopNetworkResponseMsgGetCountDown();
        dealRequestResult(cloudCommonReponse, str, z);
    }

    private void stopNetworkResponseMsgGetCountDown() {
        LogUtil.a(TAG, "stopNetworkResponseMsgGetCountDown.");
        CountDownTimer countDownTimer = this.mNetworkResponseMsgGetTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    private void startNetworkResponseMsgGetCountDown() {
        LogUtil.a(TAG, "startNetworkResponseMsgGetCountDown.");
        CountDownTimer countDownTimer = this.mNetworkResponseMsgGetTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.mNetworkResponseMsgGetTimer.start();
        }
    }

    private void showDeviceNotBelongUserCauseDeviceShareFailDialog() {
        dys.a().e(this.mainActivity, new ScaleDialogCallback() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceWlanUseGuideFragment$$ExternalSyntheticLambda2
            @Override // com.huawei.health.device.callback.ScaleDialogCallback
            public final void operationResult(int i) {
                this.f$0.m867xdf92deb1(i);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showDeviceNotBelongUserCauseDeviceShareFailDialog$5$com-huawei-health-device-ui-measure-fragment-HagridDeviceWlanUseGuideFragment, reason: not valid java name */
    /* synthetic */ void m867xdf92deb1(int i) {
        if (i == 0) {
            openDeviceHelp(1000);
        } else {
            LogUtil.a(TAG, "showDeviceNotBelongUserCauseDeviceShareFailDialog NegativeButton");
        }
    }

    private void openDeviceHelp(int i) {
        boolean zO = Utils.o();
        boolean zW = CommonUtil.w(this.mContext);
        StringBuilder sb = new StringBuilder();
        sb.append(this.mUrl);
        if (i == 1001) {
            sb.append(dxm.d(this.mProductId));
        } else if (zO) {
            sb.append(String.format(Locale.ENGLISH, "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%1$s&devicetype=Scale-manager", CommonUtil.z()));
        } else if (zW) {
            sb.append("/SmartWear/Scale-manager/EMUI8.0/C001B001/zh-CN/index.html");
        } else {
            sb.append("/SmartWear/Scale-manager/EMUI8.0/C001B001/en-US/index.html");
        }
        openHagridDeviceAppHelpActivity(sb.toString(), i);
    }

    private void openHagridDeviceAppHelpActivity(String str, int i) {
        int i2;
        this.mainActivity = BaseApplication.getActivity();
        if (this.mainActivity == null || this.mainActivity.isFinishing() || this.mainActivity.isDestroyed()) {
            LogUtil.j(TAG, "mainActivity is invalid");
            return;
        }
        LogUtil.a(TAG, "openHagridDeviceAppHelpActivity enter");
        if ((getSelectFragment(HagridDeviceManagerFragment.class) instanceof BaseFragment ? (BaseFragment) getSelectFragment(HagridDeviceManagerFragment.class) : null) == null || (i2 = mViewType) == 14 || i2 == 15) {
            LogUtil.j(TAG, "openHagridDeviceAppHelpActivity is null or mViewType = 14 or 15");
            gotoDeviceManagerFragment();
        }
        Intent intent = new Intent(this.mainActivity, (Class<?>) WebViewActivity.class);
        intent.putExtra("WebViewActivity.REQUEST_URL_KEY", str);
        intent.putExtra(Constants.JUMP_MODE_KEY, 8);
        this.mainActivity.startActivityForResult(intent, i);
    }

    private void dealRequestResult(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        int i;
        if (z) {
            qpx.a(this.mainActivity, R.string.IDS_hw_device_wifi_subuser_request_authorize_send_success);
            if (mViewType == 13) {
                gotoDeviceManagerFragment();
                return;
            }
            return;
        }
        if (cloudCommonReponse == null) {
            LogUtil.j(TAG, "dealRequestResult rsp is null");
            return;
        }
        int iIntValue = cloudCommonReponse.getResultCode().intValue();
        if (iIntValue == ERROR_CODE_NOT_BELONG) {
            showDeviceNotBelongUserCauseDeviceShareFailDialog();
            return;
        }
        if (iIntValue == ERROR_CODE_REQUEST_TOO_FAST) {
            if (str.contains(REACH_MAX_QUOTA_LIMIT)) {
                i = R.string.IDS_device_wifi_request_limit;
            } else {
                i = R.string.IDS_hwh_ali_sport_auth_failed;
            }
            qpx.a(this.mainActivity, i);
            return;
        }
        if (iIntValue != ERROR_CODE_REQUEST_SENDING) {
            LogUtil.e(TAG, "request fail: ", str);
            qpx.a(this.mainActivity, R.string.IDS_hwh_ali_sport_auth_failed);
        } else {
            qpx.a(this.mainActivity, R.string.IDS_hw_device_wifi_subuser_request_authorize_sending);
        }
    }

    private String getMainHuid() {
        byte[] bArr = new byte[19];
        System.arraycopy(this.mMainHuid, 0, bArr, 0, 19);
        String strD = eeq.d(eeq.e(bArr));
        return !TextUtils.isEmpty(strD) ? strD.trim() : strD;
    }

    private void updateUserName() {
        String userName = getUserName(this.mainActivity);
        if (!TextUtils.isEmpty(userName)) {
            this.mUserName = userName;
        }
        LogUtil.a(TAG, "updateUserName");
    }

    private void setUserPrivacyAuthDialogSp(String str) {
        SharedPreferenceManager.e(dxw.d(), String.valueOf(10000), "request_sync_data_dialog", str, new StorageParams());
    }

    private void initAuthDialogContent(View view) {
        if (view == null) {
            LogUtil.j(TAG, "initAuthDialogContent, dialogView is null");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        if (isShowAuthDialog()) {
            if (Utils.o()) {
                stringBuffer.append(System.lineSeparator()).append(getResources().getString(R.string.IDS_health_item_oversea));
            } else {
                stringBuffer.append(System.lineSeparator()).append(getResources().getString(R.string.IDS_device_haige_user_permission_message_health_item));
            }
        }
        if (isShowPersonalDialog()) {
            stringBuffer.append(System.lineSeparator()).append(getResources().getString(R.string.IDS_device_wifi_user_permission_dialog_personal_infomation_message));
        }
        SpannableString spannableString = new SpannableString(getResources().getString(R.string.IDS_device_haige_user_permission_message_sub, (isShowPersonalDialog() || isShowAuthDialog()) ? getResources().getString(R.string.IDS_device_haige_user_permission_message_other, stringBuffer) : ""));
        qri.a(spannableString, stringBuffer.toString(), new AbsoluteSizeSpan(13, true));
        ((HealthTextView) view.findViewById(R.id.dialog_text_alert_message)).setText(spannableString);
    }

    private boolean isShowUserPrivacyAuthDialog() {
        String strE = SharedPreferenceManager.e(this.mContext, Integer.toString(10000), "request_sync_data_dialog");
        return "true".equals(strE) || TextUtils.isEmpty(strE);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.hagrid_ble_device_request_cfg_wlan || id == R.id.hagrid_ble_device_btn_request_device_share_ll) {
            this.mFragmentHelper.e(this.mainActivity, new IBaseResponseCallback() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceWlanUseGuideFragment$$ExternalSyntheticLambda6
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f$0.m864x14a040eb(i, obj);
                }
            });
            return;
        }
        if (id == R.id.hagrid_ble_device_become_admin_help || id == R.id.hagrid_ble_top_device_become_admin_help) {
            openDeviceHelp(1000);
            return;
        }
        if (id == R.id.hagrid_ble_device_btn_not_now_request_device_share_ll) {
            updateView(14);
            return;
        }
        if (id == R.id.hagrid_device_wlan_use_guide_know_detail) {
            String string = this.mContext.getString(R.string.hagrid_guide_use_now);
            if (!TextUtils.isEmpty(string) && string.equals(this.mKnowDetailBtn.getText().toString())) {
                gotoDeviceManagerFragment();
                return;
            } else {
                openDeviceHelp(1001);
                return;
            }
        }
        if (id == R.id.hagrid_device_wlan_use_guide_not_now_know_detail) {
            String string2 = this.mContext.getString(R.string.hagrid_guide_more_tips);
            if (!TextUtils.isEmpty(string2) && string2.equals(this.mNotNowKnowDetailTextView.getText().toString())) {
                openDeviceHelp(1001);
                return;
            } else {
                gotoDeviceManagerFragment();
                return;
            }
        }
        LogUtil.j(TAG, "onClick: You click view unknown.");
    }

    /* JADX INFO: renamed from: lambda$onClick$6$com-huawei-health-device-ui-measure-fragment-HagridDeviceWlanUseGuideFragment, reason: not valid java name */
    /* synthetic */ void m864x14a040eb(int i, Object obj) {
        LogUtil.a(TAG, "onClick: onResponse errCode: ", Integer.valueOf(i));
        dyj.d(this.mUniqueId, this.mProductId);
        clickBleDeviceRequestDeviceShareButton();
    }

    private void gotoDeviceManagerFragment() {
        if (getSelectFragment(HagridDeviceManagerFragment.class) != null) {
            popupFragment(HagridDeviceManagerFragment.class);
        }
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.mProductId);
        bundle.putString("goto", "devicebind");
        bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
        bundle.putBoolean("isNfcConnect", this.mIsNfcCommect);
        LogUtil.a(TAG, "gotoDeviceManagerFragment put isNfcConnect is true");
        HagridDeviceManagerFragment hagridDeviceManagerFragment = new HagridDeviceManagerFragment();
        hagridDeviceManagerFragment.setArguments(bundle);
        uploadDeviceToCloud();
        switchFragment((Fragment) null, hagridDeviceManagerFragment);
    }

    private void uploadDeviceToCloud() {
        if (this.mIsUploaded) {
            return;
        }
        dxi.e(this.mProductId, this.mUniqueId);
        this.mIsUploaded = true;
    }

    private void clickBleDeviceRequestDeviceShareButton() {
        if (isShowUserPrivacyAuthDialog()) {
            showUserPrivacyAuthDialog();
            return;
        }
        requestDeviceShare();
        if (mViewType == 12) {
            updateView(14);
        }
    }

    private void showHagridDeviceUseGuideView() {
        int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.maxPaddingStart) - qrs.d((Context) BaseApplication.getActivity(), 4.0f);
        this.mCustomTitleBar.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.mCustomTitleBar.setTitleText(this.mContext.getString(R.string.IDS_device_hygride_use_guide_note));
        this.mCustomTitleBar.setLeftButtonVisibility(8);
        this.mCfgWlanAfterCompleteUserInfoBottomBtnLayout.setVisibility(8);
        this.mTopBecomeAdminHelpTextView.setVisibility(8);
        this.mCfgWlanBottomLayout.setVisibility(8);
        this.mUseGuideBottomBtnLayout.setVisibility(0);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.mContext.getResources(), R.drawable.hagrid_device_wlan_use_guide_img);
        boolean zB = drk.b(this.mUniqueId, 39);
        LogUtil.a(TAG, "support prompt handle measure: ", Boolean.valueOf(zB));
        if (zB || dxm.ap(this.mProductId)) {
            this.mTitleHintTextView.setVisibility(0);
            this.mDeviceWlanUseGuideTextView.setText(this.mContext.getString(R.string.IDS_device_hagrid_instructions));
            elh elhVarD = ResourceManager.c().d(this.mProductId);
            if (elhVarD == null) {
                LogUtil.j(TAG, "ProductInfo is null");
                ImageView imageView = this.mUseGuideImage;
                imageView.setImageBitmap(qqf.e(bitmapDecodeResource, imageView));
                return;
            }
            ArrayList<elh.c> arrayListAd = elhVarD.ad();
            if (njy.e(arrayListAd)) {
                LogUtil.j(TAG, "getMode useGuides is null or size is zero");
                ImageView imageView2 = this.mUseGuideImage;
                imageView2.setImageBitmap(qqf.e(bitmapDecodeResource, imageView2));
                return;
            }
            ArrayList<Object> useGuideImage = getUseGuideImage(arrayListAd);
            if (njy.e(useGuideImage)) {
                LogUtil.j(TAG, "getUseGuideImage useGuidesImgArray is null or size is zero");
                return;
            }
            ArrayList<String> useGuideText = getUseGuideText(arrayListAd);
            if (njy.e(useGuideText)) {
                LogUtil.j(TAG, "getUseGuideText useGuidesTextArray is null or size is zero");
                return;
            }
            ArrayList<String> useGuideTitle = getUseGuideTitle(arrayListAd);
            if (njy.e(useGuideTitle)) {
                LogUtil.j(TAG, "getUseGuideText useGuidesTitleArray is null or size is zero");
                return;
            }
            this.mTitleHintTextView.setVisibility(8);
            this.mDeviceWlanUseGuideTextView.setVisibility(8);
            this.mUseGuideImage.setVisibility(8);
            setHagridUsageGuideBannerData(useGuideImage, useGuideText, useGuideTitle);
            return;
        }
        this.mTitleHintTextView.setVisibility(8);
        ImageView imageView3 = this.mUseGuideImage;
        imageView3.setImageBitmap(qqf.e(bitmapDecodeResource, imageView3));
        this.mDeviceWlanUseGuideTextView.setText(this.mContext.getString(R.string.IDS_device_hagrid_scale_use_guide_description_1));
    }

    private void setHagridUsageGuideBannerData(ArrayList<Object> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
        this.mHagridUsageGuideBanner.setVisibility(0);
        this.mKnowDetailBtn.setText(this.mContext.getString(R.string.hagrid_guide_use_now));
        this.mNotNowKnowDetailTextView.setText(this.mContext.getString(R.string.hagrid_guide_more_tips));
        this.mList = new ArrayList(10);
        for (int i = 0; i < arrayList.size(); i++) {
            dwc dwcVar = new dwc();
            dwcVar.e(arrayList.get(i));
            dwcVar.c(arrayList3.get(i));
            String str = arrayList2.get(i);
            String[] strArr = new String[10];
            Matcher matcher = PATTERN.matcher(str);
            int i2 = 0;
            while (matcher.find()) {
                int i3 = i2 + 1;
                strArr[i2] = UnitUtil.e(i3, 1, 0);
                i2 = i3;
            }
            String str2 = String.format(Locale.ROOT, str, strArr);
            LogUtil.a(TAG, "counter is :", Integer.valueOf(i2), ", content is ", str2);
            dwcVar.d(str2);
            this.mList.add(dwcVar);
        }
        this.mHagridUsageGuideBanner.setViewPagerData(this.mList, new HealthViewPagerHolderCreator() { // from class: com.huawei.health.device.ui.measure.fragment.HagridDeviceWlanUseGuideFragment$$ExternalSyntheticLambda3
            @Override // com.huawei.health.device.ui.measure.view.holder.HealthViewPagerHolderCreator
            public final HealthViewPagerHolder createViewHolder() {
                return HagridDeviceWlanUseGuideFragment.lambda$setHagridUsageGuideBannerData$7();
            }
        });
    }

    static /* synthetic */ HealthViewPagerHolder lambda$setHagridUsageGuideBannerData$7() {
        return new dwp();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        HagridUsageGuideBanner hagridUsageGuideBanner;
        super.onResume();
        LogUtil.a(TAG, "enter onResume");
        if (drk.b(this.mUniqueId, 39) && (hagridUsageGuideBanner = this.mHagridUsageGuideBanner) != null && !hagridUsageGuideBanner.b()) {
            LogUtil.a(TAG, "onResume HagridUsageGuideBanner startLoop");
            this.mHagridUsageGuideBanner.e();
            this.mHagridUsageGuideBanner.d();
        } else {
            LogUtil.a(TAG, "onResume HagridUsageGuideBanner startLoop else");
            HagridUsageGuideBanner hagridUsageGuideBanner2 = this.mHagridUsageGuideBanner;
            if (hagridUsageGuideBanner2 != null) {
                hagridUsageGuideBanner2.e();
                this.mHagridUsageGuideBanner.d();
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        LogUtil.a(TAG, "enter onPause");
        if (!drk.b(this.mUniqueId, 39) || this.mHagridUsageGuideBanner == null) {
            return;
        }
        LogUtil.a(TAG, "onPause HagridUsageGuideBanner stopLoop");
        this.mHagridUsageGuideBanner.e();
    }

    private void showBleDeviceCfgWlanAfterCompleteUserInfoView() {
        int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.maxPaddingStart) - qrs.d((Context) BaseApplication.getActivity(), 4.0f);
        this.mCustomTitleBar.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.mCustomTitleBar.setTitleText(getString(R.string.IDS_device_wifi_config_network));
        this.mCustomTitleBar.setLeftButtonVisibility(8);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.mContext.getResources(), R.drawable.hagrid_ble_device_config_wlan_img);
        ImageView imageView = this.mUseGuideImage;
        imageView.setImageBitmap(qqf.e(bitmapDecodeResource, imageView));
        this.mDeviceWlanUseGuideTextView.setText(getWlanUseGuideText(getArguments(), true));
        this.mCfgWlanAfterCompleteUserInfoBottomBtnLayout.setVisibility(0);
        this.mTopBecomeAdminHelpTextView.setVisibility(0);
        this.mUseGuideBottomBtnLayout.setVisibility(8);
        this.mCfgWlanBottomLayout.setVisibility(8);
    }

    private void showBleDeviceCfgWlanEnterFromDeviceManagerView() {
        this.mCustomTitleBar.setPadding(0, 0, 0, 0);
        this.mCustomTitleBar.setTitleText(getString(R.string.IDS_device_user_manager));
        this.mCustomTitleBar.setLeftButtonVisibility(0);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.mContext.getResources(), R.drawable.hagrid_ble_device_config_wlan_img);
        ImageView imageView = this.mUseGuideImage;
        imageView.setImageBitmap(qqf.e(bitmapDecodeResource, imageView));
        this.mDeviceWlanUseGuideTextView.setText(getWlanUseGuideText(getArguments(), false));
        this.mCfgWlanAfterCompleteUserInfoBottomBtnLayout.setVisibility(8);
        this.mTopBecomeAdminHelpTextView.setVisibility(8);
        this.mUseGuideBottomBtnLayout.setVisibility(8);
        this.mCfgWlanBottomLayout.setVisibility(0);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        stopNetworkResponseMsgGetCountDown();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            gotoDeviceManagerFragment();
        }
    }

    private String getWlanUseGuideText(Bundle bundle, boolean z) {
        String string;
        String string2 = this.mContext.getString(R.string.IDS_device_hygride_bound_by_another);
        if (bundle == null || TextUtils.isEmpty(bundle.getString(KEY_ACCOUNT_INFO))) {
            LogUtil.j(TAG, "bundle or accountInfo is null.");
            return string2;
        }
        String string3 = bundle.getString(KEY_ACCOUNT_INFO);
        if (z) {
            string = this.mContext.getString(R.string.IDS_device_show_next);
        } else {
            string = this.mContext.getString(R.string.IDS_device_wifi_config_send_authority);
        }
        return String.format(Locale.ROOT, this.mContext.getString(R.string.IDS_hw_device_apply_wifiuser_new), string3, string);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LogUtil.a(TAG, "onConfigurationChanged, refresh page");
        refreshUseGuideImageLayout();
        super.onConfigurationChanged(configuration);
        int i = qrs.i(this.mainActivity);
        if (i <= 0) {
            LogUtil.j(TAG, "invalid width");
            return;
        }
        int i2 = this.mWidth;
        if (i != i2) {
            LogUtil.a(TAG, "lastWindowWidth: ", Integer.valueOf(i2), "getCurrentWindowWidth: ", Integer.valueOf(i));
            this.mWidth = i;
            HagridUsageGuideBanner hagridUsageGuideBanner = this.mHagridUsageGuideBanner;
            if (hagridUsageGuideBanner != null) {
                hagridUsageGuideBanner.getLayoutParams().width = i;
                this.mHagridUsageGuideBanner.e();
            }
        }
    }

    private void refreshUseGuideImageLayout() {
        LinearLayout linearLayout = this.mUseGuideImageLayout;
        if (linearLayout != null) {
            qrs.b(linearLayout, 2);
        }
    }

    private ArrayList<Object> getUseGuideImage(ArrayList<elh.c> arrayList) {
        LogUtil.a(TAG, "WeightMeasureGuideFragment getUseGuideImage()");
        ArrayList<Object> arrayList2 = new ArrayList<>(10);
        Iterator<elh.c> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(elg.e().d(this.mProductId, it.next().d()));
        }
        LogUtil.a(TAG, "WeightMeasureGuideFragment imgList: ", Integer.valueOf(arrayList2.size()));
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0061  */
    private ArrayList<String> getUseGuideText(ArrayList<elh.c> arrayList) {
        LogUtil.a(TAG, "WeightMeasureGuideFragment getUseGuideText()");
        ArrayList<String> arrayList2 = new ArrayList<>(10);
        for (int i = 0; i < arrayList.size(); i++) {
            elh.c cVar = arrayList.get(i);
            String strA = elo.a(this.mProductId, cVar.c());
            if (TextUtils.isEmpty(strA)) {
                if (TextUtils.isEmpty(cVar.c())) {
                    int[] iArr = HAGB19_USAGE_GUIDE_CONTENTS;
                    int length = iArr.length;
                    int[] iArr2 = HAGB29_USAGE_GUIDE_CONTENTS;
                    if (i < Math.min(length, iArr2.length)) {
                        if (this.mProductId.equals("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4")) {
                            strA = this.mContext.getString(iArr[i]);
                        } else {
                            strA = this.mContext.getString(iArr2[i]);
                        }
                    } else {
                        strA = this.mContext.getResources().getString(elo.d(cVar.c()));
                    }
                } else {
                    strA = this.mContext.getResources().getString(elo.d(cVar.c()));
                }
            }
            LogUtil.a(TAG, "getUseGuideText text is ", cVar.c(), ", value is ", strA);
            arrayList2.add(strA);
        }
        LogUtil.a(TAG, "WeightMeasureGuideFragment TextList: ", Integer.valueOf(arrayList2.size()));
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    private ArrayList<String> getUseGuideTitle(ArrayList<elh.c> arrayList) {
        LogUtil.a(TAG, "WeightMeasureGuideFragment getUseGuideTitle()");
        ArrayList<String> arrayList2 = new ArrayList<>(10);
        for (int i = 0; i < arrayList.size(); i++) {
            elh.c cVar = arrayList.get(i);
            String strA = elo.a(this.mProductId, cVar.a());
            if (TextUtils.isEmpty(strA)) {
                if (TextUtils.isEmpty(cVar.a())) {
                    int[] iArr = USAGE_GUIDE_TITLES;
                    if (i < iArr.length) {
                        strA = this.mContext.getString(iArr[i]);
                    } else {
                        strA = this.mContext.getResources().getString(elo.d(cVar.a()));
                    }
                } else {
                    strA = this.mContext.getResources().getString(elo.d(cVar.a()));
                }
            }
            LogUtil.a(TAG, "getUseGuideText title is ", cVar.a(), ", value is ", strA);
            arrayList2.add(strA);
        }
        LogUtil.a(TAG, "WeightMeasureGuideFragment TitleList: ", Integer.valueOf(arrayList2.size()));
        return arrayList2;
    }
}
