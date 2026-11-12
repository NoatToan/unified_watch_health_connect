package com.huawei.health.ecologydevice.ui.measure.fragment;

import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.huawei.ecologydevice.R;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.device.manager.ResourceFileListener;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.manager.SportDeviceDataManager;
import com.huawei.health.ecologydevice.ui.measure.activity.DeviceUsageDescriptionActivity;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.webview.WebViewActivity;
import defpackage.dxw;
import defpackage.ehp;
import defpackage.ehr;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.etn;
import defpackage.iov;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qre;
import defpackage.qri;
import defpackage.qrk;
import defpackage.qrs;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.io.File;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SportDeviceIntroductionFragment extends ProductFragment implements ResourceFileListener, View.OnClickListener, SportDeviceDataManager.SportDataListener {
    private static final String KEY_BLE = "BLE_FROM_QRCODE";
    private static final String KEY_BLE_NAME = "BLENAME_FROM_QRCODE";
    private static final String KEY_DEVICE_TYPE = "DEVICE_TYPE_INDEX";
    private static final String KEY_PROTOCOL = "PROTOCOL_FROM_QRCODE";
    private static final String KEY_SOURCE = "START_SPORT_SOURCE";
    private static final int LRU_CACHE_SIZE = 1048576;
    private static final int MSG_UPDATE_DEVICE_INFO = 2;
    private static final int MSG_UPDATE_HISTORY_DATA = 1;
    private static final int MSG_UPDATE_RESOURCE_FILE = 0;
    private static final String OPCODE_DELETE = "Delete";
    private static final int PLURAL_NUMBER = 2;
    private static final int SINGULAR_NUMBER = 1;
    private static final String TAG = "PDSPORT_DeviceIntroduction";
    private static final int TEXT_SIZE = 30;
    private static final int UNIT_TRANS_DISTANCE_PRECISION = 2;
    private static final int UNIT_TRANS_MILL_MIN = 60000;
    private static final int UNIT_TRANS_M_KM = 1000;
    private ImageView mDeviceImageIv;
    private View mDeviceInfoLayout;
    private HealthTextView mDeviceInfoTv;
    protected View mDeviceManualsLayout;
    protected String mDeviceName;
    protected IndoorEquipManagerApi mIndoorEquipManagerApi;
    private HealthTextView mLastTimeTv;
    private HealthTextView mLastValueTv;
    private LinearLayout mMarketingLayout;
    protected LinearLayout mModeLayout;
    protected HealthTextView mModeTv;
    protected HealthTextView mModeValueTv;
    protected SportDeviceDataManager mSportDataManager;
    protected HealthTextView mStartTv;
    private CustomTextAlertDialog mUnbindDialog;
    protected ArrayList<String> mMoreMenuList = new ArrayList<>();
    private LruCache<String, Bitmap> mBitmapLruCache = new LruCache<>(1048576);
    private ArrayList<String> mImagePathList = new ArrayList<>(10);
    private ArrayList<String> mTextList = new ArrayList<>(10);
    private SportDeviceHandler mSportDeviceHandler = new SportDeviceHandler();
    private String mMainTitleStr = "";

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mNeedOpenBlueTooth = false;
        ResourceManager.c().e(this);
        LogUtil.a(TAG, "in onCreate");
        if (getArguments() != null) {
            this.mProductId = getArguments().getString("productId");
            ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
            if (contentValues != null) {
                this.mProductId = contentValues.getAsString("productId");
                this.mUniqueId = contentValues.getAsString("uniqueId");
                this.mDeviceName = contentValues.getAsString("name");
            }
            SportDeviceDataManager sportDeviceDataManager = new SportDeviceDataManager(this.mProductId, this.mUniqueId, this);
            this.mSportDataManager = sportDeviceDataManager;
            this.mProductInfo = sportDeviceDataManager.b();
        }
        this.mIndoorEquipManagerApi = (IndoorEquipManagerApi) Services.b("PluginLinkIndoorEquip", IndoorEquipManagerApi.class);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater == null) {
            LogUtil.a(TAG, "onCreateView inflater is null");
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            return null;
        }
        LogUtil.a(TAG, "in onCreateView");
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        this.child = layoutInflater.inflate(R.layout.fragment_sport_device_introduction, viewGroup, false);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
            initView(this.child);
        }
        initTitleBar();
        if (!TextUtils.isEmpty(this.mUniqueId)) {
            ((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).setDevicesUseTime(this.mUniqueId);
        }
        return viewGroup2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        initUxConfig(new ehr(this.mProductId).a());
    }

    protected void initView(View view) {
        this.mDeviceImageIv = (ImageView) view.findViewById(R.id.iv_device_image);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.tv_device_start);
        this.mStartTv = healthTextView;
        healthTextView.setOnClickListener(this);
        this.mLastTimeTv = (HealthTextView) view.findViewById(R.id.htv_device_last_time);
        this.mLastValueTv = (HealthTextView) view.findViewById(R.id.htv_device_last_value);
        View viewFindViewById = view.findViewById(R.id.layout_device_manuals);
        this.mDeviceManualsLayout = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        View viewFindViewById2 = view.findViewById(R.id.layout_device_info);
        this.mDeviceInfoLayout = viewFindViewById2;
        viewFindViewById2.setOnClickListener(this);
        this.mDeviceInfoTv = (HealthTextView) view.findViewById(R.id.tv_device_info);
        this.mModeLayout = (LinearLayout) view.findViewById(R.id.sport_mode_desc_layout);
        this.mModeTv = (HealthTextView) view.findViewById(R.id.sport_mode_tv);
        this.mModeValueTv = (HealthTextView) view.findViewById(R.id.sport_mode_value_tv);
        this.mMarketingLayout = (LinearLayout) view.findViewById(R.id.introduction_marketing);
        initMarketing();
    }

    protected void initUxConfig(ehp ehpVar) {
        if (ehpVar != null) {
            this.mMarketingLayout.setVisibility(ehpVar.h() ? 0 : 8);
            if (!ehpVar.b().d()) {
                return;
            }
        }
        this.mMoreMenuList.add(getResources().getString(R.string.IDS_device_wear_home_delete_device));
    }

    @Override // com.huawei.health.device.manager.ResourceFileListener
    public void onResult(int i, String str) {
        LogUtil.d(TAG, "resultCode = " + i + " resultValue = " + str);
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (getActivity() == null) {
            return;
        }
        if (qrs.r()) {
            LogUtil.a(TAG, "click too fast");
            return;
        }
        if (view == this.mStartTv) {
            LogUtil.d(TAG, "onClick start training.");
            startIndoorEquipActivity();
        } else if (view == this.mDeviceManualsLayout) {
            LogUtil.d(TAG, "onClick device manuals");
            startUsageDescriptionActivity();
        } else if (view == this.mDeviceInfoLayout || view == this.mDeviceInfoTv) {
            LogUtil.d(TAG, "onClick device info, unspported yet");
        } else {
            LogUtil.d(TAG, "onClick unknown view");
        }
    }

    private void startUsageDescriptionActivity() {
        final String strE = this.mSportDataManager.e();
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j(TAG, "H5 url is empty, showing default descriptions");
            Intent intent = new Intent(this.mainActivity, (Class<?>) DeviceUsageDescriptionActivity.class);
            intent.putExtra("productId", this.mProductId);
            startActivity(intent);
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1038xe1f483ef(strE);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$startUsageDescriptionActivity$1$com-huawei-health-ecologydevice-ui-measure-fragment-SportDeviceIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m1038xe1f483ef(final String str) {
        String countryCode = LoginInit.getInstance(BaseApplication.getContext()).getCountryCode(null);
        if (TextUtils.isEmpty(countryCode)) {
            countryCode = "SG";
        }
        final String noCheckUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("domainTipsResDbankcdn", countryCode);
        if (this.mainActivity == null) {
            LogUtil.j(TAG, "mainActivity is null");
        } else if (TextUtils.isEmpty(noCheckUrl)) {
            LogUtil.j(TAG, "url is empty");
        } else {
            LogUtil.d(TAG, "url:", noCheckUrl, str);
            this.mainActivity.runOnUiThread(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1037x2a08166e(noCheckUrl, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$startUsageDescriptionActivity$0$com-huawei-health-ecologydevice-ui-measure-fragment-SportDeviceIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m1037x2a08166e(String str, String str2) {
        Intent intent = new Intent(this.mainActivity, (Class<?>) WebViewActivity.class);
        intent.putExtra("WebViewActivity.REQUEST_URL_KEY", str + str2);
        intent.putExtra(Constants.JUMP_MODE_KEY, 4);
        this.mainActivity.startActivity(intent);
    }

    private void initTitleBar() {
        this.mCustomTitleBar.setRightButtonVisibility(0);
        Resources resources = BaseApplication.getContext().getResources();
        if (resources != null) {
            this.mCustomTitleBar.setTitleBarBackgroundColor(resources.getColor(R.color.wear_home_bg_color));
        }
        this.mCustomTitleBar.setRightButtonDrawable(this.mainActivity.getResources().getDrawable(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        this.mCustomTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1034xfe15e009(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initTitleBar$2$com-huawei-health-ecologydevice-ui-measure-fragment-SportDeviceIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m1034xfe15e009(View view) {
        showMoreDeviceMenu();
    }

    private void showMoreDeviceMenu() {
        if (this.mainActivity == null || this.mCustomTitleBar == null) {
            LogUtil.j(TAG, "mainActivity or mCustomTitleBar is null");
        } else {
            new PopViewList(this.mainActivity, this.mCustomTitleBar, this.mMoreMenuList).b(new PopViewList.PopViewClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment$$ExternalSyntheticLambda2
                @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
                public final void setOnClick(int i) {
                    this.f$0.handleMoreMenuClick(i);
                }
            });
        }
    }

    protected void handleMoreMenuClick(int i) {
        if (TextUtils.equals(this.mMoreMenuList.get(i), getResources().getString(R.string.IDS_device_wear_home_delete_device))) {
            unbindHaveBindingDevice();
        } else {
            LogUtil.a(TAG, "showUnbindDeviceMenu is default");
        }
    }

    private void initMarketing() {
        try {
            int i = Integer.parseInt(getMarketingPositionId());
            final MarketingApi marketingApi = (MarketingApi) Services.b("FeatureMarketing", MarketingApi.class);
            Task<Map<Integer, ResourceResultInfo>> resourceResultInfo = marketingApi.getResourceResultInfo(i);
            resourceResultInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment$$ExternalSyntheticLambda3
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f$0.m1033x535d321b(marketingApi, (Map) obj);
                }
            });
            resourceResultInfo.addOnFailureListener(new OnFailureListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment$$ExternalSyntheticLambda4
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    LogUtil.e(SportDeviceIntroductionFragment.TAG, "initMarketing onFailure ", exc == null ? "" : exc.getMessage());
                }
            });
        } catch (NumberFormatException unused) {
            LogUtil.e(TAG, "error Marketing PositionId");
        }
    }

    /* JADX INFO: renamed from: lambda$initMarketing$3$com-huawei-health-ecologydevice-ui-measure-fragment-SportDeviceIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m1033x535d321b(MarketingApi marketingApi, Map map) {
        if (this.mMarketingLayout == null) {
            LogUtil.j(TAG, "initMarketing mMarketingLayout is null");
            return;
        }
        Iterator<View> it = marketingApi.getMarketingViewList(getContext(), marketingApi.filterMarketingRules((Map<Integer, ResourceResultInfo>) map)).iterator();
        while (it.hasNext()) {
            this.mMarketingLayout.addView(it.next());
        }
    }

    private String getMarketingPositionId() {
        return ResourceManager.c().d(this.mProductId).c("marketing_position_id");
    }

    private void unbindHaveBindingDevice() {
        LogUtil.a(TAG, "enter unBindHaveBindDevice");
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("device_name", etn.c(this.mProductId, this.mSportDataManager.c()));
        showBluetoothUnBindDialog(map);
    }

    private void showBluetoothUnBindDialog(final Map<String, Object> map) {
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(getActivity()).a(R.string.IDS_hw_health_wear_connect_device_unpair_button).b(R.string.IDS_unbind_device_wear_home).a(R.string.IDS_hw_health_wear_connect_device_unpair_button, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1035x1ddd2316(map, view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1036xd5c99097(view);
            }
        }).b();
        this.mUnbindDialog = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.mUnbindDialog.show();
    }

    /* JADX INFO: renamed from: lambda$showBluetoothUnBindDialog$5$com-huawei-health-ecologydevice-ui-measure-fragment-SportDeviceIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m1035x1ddd2316(Map map, View view) {
        CustomTextAlertDialog customTextAlertDialog = this.mUnbindDialog;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
            this.mUnbindDialog = null;
            if (unBindDeviceUniversal(this.mProductId, this.mUniqueId)) {
                unBindDeviceSuccess(map);
                return;
            }
            return;
        }
        LogUtil.a(TAG, "setPositiveButton mUnbindDialog = null");
    }

    /* JADX INFO: renamed from: lambda$showBluetoothUnBindDialog$6$com-huawei-health-ecologydevice-ui-measure-fragment-SportDeviceIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m1036xd5c99097(View view) {
        CustomTextAlertDialog customTextAlertDialog = this.mUnbindDialog;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
            this.mUnbindDialog = null;
        } else {
            LogUtil.a(TAG, "setNegativeButton mUnbindDialog = null");
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ProductFragment
    protected void autoConnectDevice() {
        LogUtil.a(TAG, "connectDevice");
    }

    protected void unBindDeviceSuccess(Map<String, Object> map) {
        this.mIndoorEquipManagerApi.unPair(this.mUniqueId);
        ((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).stopMeasure(this.mProductId, this.mUniqueId);
        lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_UNBIND_SUCCEED_2060014.value(), map, 0);
        ResourceManager.c().f();
        popupFragment(null);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ProductFragment, com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LogUtil.a(TAG, BaseDialog.LIFE_CYCLE_ON_RESUME);
        if (getArguments() != null && getArguments().getString("operateCode", "").equals(OPCODE_DELETE)) {
            unbindHaveBindingDevice();
            getArguments().remove("operateCode");
        }
        loadResourceFile();
        this.mSportDataManager.h();
    }

    private void loadResourceFile() {
        Message messageObtainMessage = this.mSportDeviceHandler.obtainMessage();
        messageObtainMessage.what = 0;
        this.mSportDeviceHandler.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.health.ecologydevice.manager.SportDeviceDataManager.SportDataListener
    public void onNewLastData(long j, int i, int i2) {
        Message messageObtainMessage = this.mSportDeviceHandler.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = Long.valueOf(j);
        messageObtainMessage.arg1 = i;
        messageObtainMessage.arg2 = i2;
        this.mSportDeviceHandler.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ProductFragment
    protected void updateUIDisconnect() {
        LogUtil.a(TAG, "upDateUIDisconnect");
    }

    static class SportDeviceHandler extends Handler {
        private WeakReference<SportDeviceIntroductionFragment> mFragment;

        private SportDeviceHandler(SportDeviceIntroductionFragment sportDeviceIntroductionFragment) {
            this.mFragment = new WeakReference<>(sportDeviceIntroductionFragment);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            super.handleMessage(message);
            SportDeviceIntroductionFragment sportDeviceIntroductionFragment = this.mFragment.get();
            if (sportDeviceIntroductionFragment == null || !sportDeviceIntroductionFragment.isAdded() || sportDeviceIntroductionFragment.isRemoving() || sportDeviceIntroductionFragment.isDetached()) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                sportDeviceIntroductionFragment.onLoadResourceFileSuccess();
            } else {
                if (i != 1) {
                    return;
                }
                sportDeviceIntroductionFragment.onNewLastHistoryData(((Long) message.obj).longValue(), message.arg1, message.arg2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNewLastHistoryData(long j, int i, int i2) {
        LogUtil.d(TAG, "lastDataTime:", Long.valueOf(j), ", lastDataValue:", Integer.valueOf(i2), ", dataType:", Integer.valueOf(i));
        this.mLastTimeTv.setVisibility(0);
        this.mLastTimeTv.setText(qrk.d(j));
        this.mLastValueTv.setText(getSpannableString(i, i2));
    }

    private Spannable getSpannableString(int i, int i2) {
        Object objValueOf;
        int i3;
        int i4;
        if (i == 1) {
            i4 = i2 <= 1000 ? 1 : 2;
            objValueOf = Float.valueOf(new BigDecimal(((double) i2) / 1000.0d).setScale(2, 4).floatValue());
            i3 = R.plurals.IDS_hwh_motiontrack_show_use_time_km;
        } else {
            int i5 = i2 <= 60000 ? 1 : 2;
            objValueOf = Integer.valueOf(i2 / 60000);
            int i6 = i5;
            i3 = R.plurals.IDS_indoor_skipper_time_minute_value;
            i4 = i6;
        }
        SpannableString spannableString = new SpannableString(getResources().getQuantityString(i3, i4, objValueOf));
        qri.a(spannableString, String.valueOf(objValueOf), new ForegroundColorSpan(getResources().getColor(R.color.textColorPrimary)));
        qri.a(spannableString, String.valueOf(objValueOf), new AbsoluteSizeSpan(30, true));
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLoadResourceFileSuccess() throws Throwable {
        parseResourceFile();
        parseDeviceImage();
        setTitle(getTitle(this.mProductId, this.mProductInfo));
    }

    private void parseResourceFile() {
        if (this.mProductInfo.d().size() == 0) {
            LogUtil.j(TAG, "productInfo.descriptions is empty");
            return;
        }
        LogUtil.d(TAG, "ResourceFile DeviceId:", this.mProductInfo.h());
        int size = this.mProductInfo.d().size();
        if (LanguageUtil.ba(getActivity())) {
            for (int i = size - 1; i >= 0; i--) {
                this.mImagePathList.add(elg.e().d(this.mProductId, this.mProductInfo.d().get(i).d()));
                this.mTextList.add(elo.a(this.mProductId, this.mProductInfo.d().get(i).c()));
            }
            return;
        }
        for (int i2 = 0; i2 < size; i2++) {
            this.mImagePathList.add(elg.e().d(this.mProductId, this.mProductInfo.d().get(i2).d()));
            this.mTextList.add(elo.a(this.mProductId, this.mProductInfo.d().get(i2).c()));
        }
    }

    private void parseDeviceImage() throws Throwable {
        Bitmap bitmapC;
        this.mDeviceImageIv.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        if (njy.e(this.mImagePathList)) {
            return;
        }
        String str = this.mImagePathList.get(0);
        if (this.mBitmapLruCache.get(str) == null) {
            bitmapC = elo.c(str);
            if (new File(str).exists() && bitmapC != null) {
                LogUtil.a(TAG, "show cache Image");
                this.mBitmapLruCache.put(str, bitmapC);
            }
        } else {
            LogUtil.j(TAG, "load exists Image");
            bitmapC = this.mBitmapLruCache.get(str);
        }
        if (bitmapC == null) {
            LogUtil.j(TAG, "bitmap is null");
        } else {
            this.mDeviceImageIv.setImageBitmap(bitmapC);
        }
    }

    private String getTitle(String str, elh elhVar) {
        String strA = elo.a(str, elhVar.l().d());
        this.mMainTitleStr = strA;
        return strA;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        finishFragment();
        return false;
    }

    private void finishFragment() {
        ResourceManager.c().f();
        popupFragment(null);
    }

    protected void startIndoorEquipActivity() {
        startIndoorEquipActivity(null);
    }

    protected void startIndoorEquipActivity(Bundle bundle) {
        String strA = this.mSportDataManager.a();
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j(TAG, "Unknown device type.");
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString(KEY_DEVICE_TYPE, strA);
        Intent intentCreateEquipConnectIntent = createEquipConnectIntent(bundle);
        LogUtil.a(TAG, "will start IndoorEquipConnectedActivity");
        iov.d(this.mainActivity, intentCreateEquipConnectIntent);
    }

    protected Intent createEquipConnectIntent(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtra(KEY_PROTOCOL, "2");
        String strD = this.mSportDataManager.d();
        if (strD != null) {
            intent.putExtra(KEY_BLE, strD.replace(":", ""));
        }
        intent.putExtra(KEY_BLE_NAME, this.mDeviceName);
        intent.putExtra(KEY_SOURCE, "ScanBtnAPP");
        intent.putExtra("productId", this.mProductId);
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.indoorequip.activity.IndoorEquipConnectedActivity");
        intent.putExtras(bundle);
        return intent;
    }
}
