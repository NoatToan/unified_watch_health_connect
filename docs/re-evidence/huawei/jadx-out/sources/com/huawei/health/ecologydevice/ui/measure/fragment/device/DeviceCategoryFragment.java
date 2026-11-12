package com.huawei.health.ecologydevice.ui.measure.fragment.device;

import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.huawei.ecologydevice.R;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.DeviceInfoUtilsApi;
import com.huawei.health.device.api.DeviceMainActivityApi;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.device.constants.WeightConstants;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.adapter.ProductListAdapter;
import com.huawei.health.ecologydevice.ui.measure.adapter.WeightListAdapter;
import com.huawei.health.ecologydevice.ui.measure.fragment.ProductIntroductionFragment;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dru;
import defpackage.dxw;
import defpackage.elg;
import defpackage.elh;
import defpackage.esq;
import defpackage.est;
import defpackage.etn;
import defpackage.ioi;
import defpackage.lmf;
import defpackage.lon;
import defpackage.lsj;
import defpackage.lsn;
import defpackage.qpx;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceCategoryFragment extends BaseFragment {
    private static final String AM16_PRODUCTID = "6d5416d9-2167-41df-ab10-c492e152b44f";
    private static final String APP_GALLERY_HEALTH_URL = "/uowap/index.html#/detailApp/C10414141";
    private static final String BIND_ON_H5_PAGE_FLAG = "H5";
    private static final String CLASS_NAME_HEALTH_KIT_DETAIL = "com.huawei.ui.thirdpartservice.activity.healthkit.HealthKitActivity";
    private static final int DELAY_TIME = 500;
    public static final String DEVICE_KIND = "device_kind";
    private static final String DEVICE_LIST_TO_HEALTH_KIT_AUTHORIZATION = "device_list_to_health_kit_authorization";
    public static final String DEVICE_TYPE = "device_type";
    private static final String GOOGLE_CHINA_HEALTH_URL = "/app/C10414141?appId=C10414141&channel=4026633";
    private static final String GOOGLE_HEALTH_URL = "/store/apps/details?id=com.huawei.health";
    private static final String HEART_RATE_UNKNOWN_PRODUCT_ID = "aa:bb:cc:dd";
    private static final String HONOR_DEVICE = "honor";
    private static final String HUAWEI_DEVICE = "huawei";
    private static final String METIS_PRODUCTID = "9323f6b7-b459-44f4-a698-988d1769832a";
    private static final String TAG = "PluginDevice_DeviceCategoryFragment";
    public static final String WIFI_UPDATE_BACK_FINISH = "back_to_finish";
    private Bundle mBundle;
    private Context mContext;
    private ListView mDeviceListView;
    private String mDeviceType;
    private esq mDownloadDeviceResourceTool;
    private RelativeLayout mErrorRyt;
    private HealthTextView mErrorText;
    private View mMainView;
    private String mProductId;
    private ProductListAdapter mProductListAdapter;
    private String mUniqueId;
    private WeightListAdapter mWeightListAdapter;
    protected ArrayList<elh> mProductInfos = new ArrayList<>(10);
    private boolean mIsBackToFinish = false;
    private boolean mIsRebind = false;
    private boolean mIsAutoJump = false;
    private ArrayList<elh> mHuawei = new ArrayList<>(10);
    private ArrayList<elh> mHonor = new ArrayList<>(10);
    private ArrayList<elh> mOther = new ArrayList<>(10);
    private AdapterView.OnItemClickListener mOnItemClickListener = new AdapterView.OnItemClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.1
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            DeviceCategoryFragment deviceCategoryFragment = DeviceCategoryFragment.this;
            deviceCategoryFragment.handleClickEvent(i, deviceCategoryFragment.mProductListAdapter);
        }
    };

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mBundle = getArguments();
        this.mContext = BaseApplication.getContext();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        if (layoutInflater == null) {
            LogUtil.a(TAG, "onCreateView inflater is null");
            return viewGroup2;
        }
        View viewInflate = layoutInflater.inflate(R.layout.device_category_fragment, viewGroup, false);
        this.mMainView = viewInflate;
        if (viewGroup2 != null) {
            viewGroup2.addView(viewInflate);
        }
        bindView();
        new Handler().postDelayed(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.2
            @Override // java.lang.Runnable
            public void run() {
                DeviceCategoryFragment.this.downloadIndexFile();
            }
        }, 500L);
        return viewGroup2;
    }

    private void bindView() {
        if (this.mainActivity == null) {
            LogUtil.j(TAG, "bindView mainActivity == null");
            return;
        }
        Bundle bundle = this.mBundle;
        if (bundle == null) {
            LogUtil.j(TAG, "bindView mBundle == null");
            return;
        }
        setTitle(bundle.getString(DEVICE_KIND));
        this.mDeviceListView = (ListView) this.mMainView.findViewById(R.id.device_list_view);
        this.mDeviceType = this.mBundle.getString(DEVICE_TYPE);
        this.mIsBackToFinish = this.mBundle.getBoolean(WIFI_UPDATE_BACK_FINISH);
        LogUtil.a(TAG, "bindView mDeviceType = ", this.mDeviceType);
        RelativeLayout relativeLayout = (RelativeLayout) this.mMainView.findViewById(R.id.addDevice_error_layout);
        this.mErrorRyt = relativeLayout;
        relativeLayout.setVisibility(8);
        this.mErrorRyt.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1057xae42a265(view);
            }
        });
        this.mErrorText = (HealthTextView) this.mMainView.findViewById(R.id.adddevice_error_text);
        this.mIsRebind = this.mBundle.getBoolean("isRebind", true);
        ContentValues contentValues = (ContentValues) this.mBundle.getParcelable("commonDeviceInfo");
        if (contentValues != null) {
            this.mUniqueId = contentValues.getAsString("uniqueId");
            this.mProductId = contentValues.getAsString("productId");
        }
        initListView();
        showLocalDeviceResource();
    }

    /* JADX INFO: renamed from: lambda$bindView$0$com-huawei-health-ecologydevice-ui-measure-fragment-device-DeviceCategoryFragment, reason: not valid java name */
    /* synthetic */ void m1057xae42a265(View view) {
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            LogUtil.a(TAG, "Network is not Connected");
            qpx.e(this.mainActivity, R.string.IDS_connect_error);
        } else {
            this.mErrorRyt.setVisibility(8);
            downloadIndexFile();
        }
    }

    private void initListView() {
        if (HealthDevice.HealthDeviceKind.HDK_WEIGHT.name().equals(this.mDeviceType)) {
            WeightListAdapter weightListAdapter = new WeightListAdapter(this.mainActivity, this.mProductInfos);
            this.mWeightListAdapter = weightListAdapter;
            this.mDeviceListView.setAdapter((ListAdapter) weightListAdapter);
            this.mDeviceListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment$$ExternalSyntheticLambda0
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    this.f$0.m1058x63fc4837(adapterView, view, i, j);
                }
            });
        } else {
            ProductListAdapter productListAdapter = new ProductListAdapter(this.mProductInfos);
            this.mProductListAdapter = productListAdapter;
            this.mDeviceListView.setAdapter((ListAdapter) productListAdapter);
            this.mDeviceListView.setOnItemClickListener(this.mOnItemClickListener);
        }
        addFootView();
    }

    /* JADX INFO: renamed from: lambda$initListView$1$com-huawei-health-ecologydevice-ui-measure-fragment-device-DeviceCategoryFragment, reason: not valid java name */
    /* synthetic */ void m1058x63fc4837(AdapterView adapterView, View view, int i, long j) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_SELECT_DEVICE_2060002.value(), map, 0);
        elh item = this.mWeightListAdapter.getItem(i);
        if (item != null) {
            if (isDeviceResourceCanUsing(item)) {
                jumpToIntroductionFragment(item.l(), item);
            } else {
                showAppVersionNotSupportDeviceDialog();
            }
        }
    }

    private void addFootView() {
        LayoutInflater layoutInflater = this.mainActivity.getSystemService("layout_inflater") instanceof LayoutInflater ? (LayoutInflater) this.mainActivity.getSystemService("layout_inflater") : null;
        if (layoutInflater == null) {
            LogUtil.j(TAG, "fuc addFootView inflater is null");
            return;
        }
        View viewInflate = layoutInflater.inflate(R.layout.device_no_find_button_layout, (ViewGroup) null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.not_found_device);
        this.mDeviceListView.addFooterView(viewInflate);
        viewInflate.setVisibility(0);
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1056x42e3d7bf(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$addFootView$2$com-huawei-health-ecologydevice-ui-measure-fragment-device-DeviceCategoryFragment, reason: not valid java name */
    /* synthetic */ void m1056x42e3d7bf(View view) {
        clickNotFoundDeviceButton(this.mDeviceType);
    }

    private void jumpToIntroductionFragment(elh.d dVar, elh elhVar) {
        if (dVar != null) {
            Fragment productIntroductionFragment = new ProductIntroductionFragment();
            HonourDeviceConstantsApi honourDeviceConstantsApi = (HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class);
            if (((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).isWiFiDevice(elhVar.t())) {
                productIntroductionFragment = getPluginDeviceFragment(WeightConstants.FragmentType.WIFI_PRODUCT_INTRODUCTION);
            } else if (honourDeviceConstantsApi.isNoneHuaWeiWeightBondedDevice(elhVar.t()) && !this.mIsRebind && !honourDeviceConstantsApi.isHuaweiWspScaleProduct(elhVar.t())) {
                productIntroductionFragment = getNextFragment(elhVar.t());
            } else {
                LogUtil.j(TAG, "jumpToIntroductionFragment else");
            }
            if (productIntroductionFragment == null) {
                LogUtil.j(TAG, "jumpToIntroductionFragment nextFragment is null");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("productId", elhVar.t());
            bundle.putBoolean("isRebind", this.mIsRebind);
            ContentValues contentValues = new ContentValues();
            contentValues.put("uniqueId", this.mUniqueId);
            contentValues.put("productId", elhVar.t());
            bundle.putParcelable("commonDeviceInfo", contentValues);
            bundle.putBoolean("isAdd", true);
            productIntroductionFragment.setArguments(bundle);
            switchFragment(productIntroductionFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleClickEvent(int i, ProductListAdapter productListAdapter) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_SELECT_DEVICE_2060002.value(), map, 0);
        if (i >= productListAdapter.getCount()) {
            LogUtil.j(TAG, "handleClickEvent outofbounds exception ");
            return;
        }
        dru druVar = productListAdapter.getItem(i) instanceof dru ? (dru) productListAdapter.getItem(i) : null;
        if (druVar == null || druVar.e() != 0) {
            return;
        }
        dealWithItemClickEvent(druVar);
    }

    private void dealWithItemClickEvent(dru druVar) {
        elh elhVar = druVar.i() instanceof elh ? (elh) druVar.i() : null;
        boolean zEquals = "true".equals(ioi.d().c(402));
        if (elhVar != null) {
            if (CommonUtil.cj() && "PRO_GPRS".equals(elhVar.u())) {
                etn.c(getActivity(), elhVar, elhVar.t(), elhVar.v().a());
                if (getActivity() != null) {
                    getActivity().finish();
                    return;
                }
                return;
            }
            if (isDeviceResourceCanUsing(elhVar)) {
                Fragment productIntroductionFragment = new ProductIntroductionFragment();
                HonourDeviceConstantsApi honourDeviceConstantsApi = (HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class);
                if (((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).isWiFiDevice(elhVar.t())) {
                    productIntroductionFragment = getPluginDeviceFragment(WeightConstants.FragmentType.WIFI_PRODUCT_INTRODUCTION);
                } else if (honourDeviceConstantsApi.isNoneHuaWeiWeightBondedDevice(elhVar.t()) && !this.mIsRebind && !honourDeviceConstantsApi.isHuaweiWspScaleProduct(elhVar.t())) {
                    productIntroductionFragment = getNextFragment(elhVar.t());
                } else if (BIND_ON_H5_PAGE_FLAG.equals(elhVar.e()) && zEquals) {
                    startWebViewActivity(elhVar.t());
                    return;
                } else {
                    if (BIND_ON_H5_PAGE_FLAG.equals(elhVar.e()) && !zEquals) {
                        startHealthKitActivity(elhVar.t());
                        return;
                    }
                    LogUtil.j(TAG, "handleClickEvent else");
                }
                if (productIntroductionFragment == null) {
                    LogUtil.j(TAG, "dealWithItemClickEvent nextFragment is null");
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("productId", elhVar.t());
                bundle.putBoolean("isRebind", this.mIsRebind);
                ContentValues contentValues = new ContentValues();
                contentValues.put("uniqueId", this.mUniqueId);
                contentValues.put("productId", elhVar.t());
                bundle.putParcelable("commonDeviceInfo", contentValues);
                productIntroductionFragment.setArguments(bundle);
                switchFragment(productIntroductionFragment);
                return;
            }
            showAppVersionNotSupportDeviceDialog();
        }
    }

    private Fragment getPluginDeviceFragment(WeightConstants.FragmentType fragmentType) {
        return ((DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class)).getPluginDeviceFragment(fragmentType);
    }

    private void startHealthKitActivity(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e(TAG, "startHealthKitActivity productId is null");
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(this.mContext.getPackageName());
        intent.setClassName(this.mContext, CLASS_NAME_HEALTH_KIT_DETAIL);
        intent.putExtra("productId", str);
        intent.putExtra(DEVICE_LIST_TO_HEALTH_KIT_AUTHORIZATION, true);
        elh elhVarD = ResourceManager.c().d(str);
        ContentValues contentValues = new ContentValues();
        if (elhVarD == null) {
            LogUtil.e(TAG, "startHealthKitActivity deviceProductInfo is null");
            return;
        }
        contentValues.put("name", elhVarD.l().d());
        contentValues.put("deviceType", elhVarD.m().name());
        intent.putExtra("commonDeviceInfo", contentValues);
        startActivity(intent);
    }

    private void startWebViewActivity(String str) {
        Intent intent = new Intent();
        intent.setPackage(this.mContext.getPackageName());
        intent.setClassName(this.mContext, "com.huawei.operation.activity.WebViewActivity");
        intent.putExtra("url", elg.e().e(str) + "#/type=4/uuidpre=" + etn.d(str));
        intent.putExtra("productId", str);
        elh elhVarD = ResourceManager.c().d(str);
        ContentValues contentValues = new ContentValues();
        if (elhVarD == null) {
            return;
        }
        contentValues.put("name", etn.c(str, elhVarD.l().d()));
        contentValues.put("deviceType", elhVarD.m().name());
        intent.putExtra("commonDeviceInfo", contentValues);
        LogUtil.a(TAG, "sannuo_type=4_device list page to H5 interface,Productid=", str);
        startActivity(intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r0 >= r2) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean isDeviceResourceCanUsing(elh elhVar) {
        int iE = CommonUtil.e(BaseApplication.getContext());
        Object[] objArr = {"isDeviceResourceCanUsing currentVersion =", Integer.valueOf(iE)};
        String str = TAG;
        LogUtil.a(TAG, objArr);
        String strA = elhVar.a();
        String strB = elhVar.b();
        try {
            if (!Utils.o()) {
                if (TextUtils.isEmpty(strA) || iE >= Long.parseLong(strA)) {
                    str = str;
                    return true;
                }
            } else {
                if (!TextUtils.isEmpty(strB)) {
                    long j = iE;
                    long j2 = Long.parseLong(strB);
                    str = j2;
                }
                return true;
            }
            str = str;
            return false;
        } catch (NumberFormatException unused) {
            LogUtil.e(str, "isDeviceResourceCanUsing NumberFormatException");
            return false;
        }
    }

    private Fragment getNextFragment(String str) {
        if (((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isHuaweiWspScaleProduct(str)) {
            return getPluginDeviceFragment(WeightConstants.FragmentType.HAGRID_DEVICE_MANAGER);
        }
        return getPluginDeviceFragment(WeightConstants.FragmentType.HONOUR_DEVICE);
    }

    private void showLocalDeviceResource() {
        createDownLoadFileTool();
        this.mDownloadDeviceResourceTool.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadIndexFile() {
        createDownLoadFileTool();
        this.mDownloadDeviceResourceTool.a();
    }

    private void createDownLoadFileTool() {
        if (this.mDownloadDeviceResourceTool == null) {
            esq esqVar = new esq(this.mainActivity, this.mDeviceType, 1, new est() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.3
                @Override // defpackage.ess
                public void onRefresh(Message message) {
                    DeviceCategoryFragment.this.refreshList(message);
                }

                @Override // defpackage.ess
                public void onShowErrorLayout() {
                    if (DeviceCategoryFragment.this.isAdded()) {
                        DeviceCategoryFragment.this.showErrorLayout();
                    }
                }
            });
            this.mDownloadDeviceResourceTool = esqVar;
            esqVar.d(this.mPresetDeviceInChinaMap, this.mPresetDeviceInOverseaMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showErrorLayout() {
        this.mErrorText.setText(getString(R.string.IDS_device_plugin_download_error));
        this.mErrorRyt.setVisibility(0);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a(TAG, "onDestroy() enter");
        esq esqVar = this.mDownloadDeviceResourceTool;
        if (esqVar != null) {
            esqVar.b();
            this.mDownloadDeviceResourceTool = null;
        }
        this.mainActivity = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshList(Message message) {
        elh elhVar = message.obj instanceof elh ? (elh) message.obj : null;
        if (elhVar == null || elhVar.m() == null) {
            return;
        }
        int iC = elhVar.v().c();
        if (elhVar.m().name() != null && this.mDeviceType.equals(elhVar.m().name())) {
            if (TextUtils.equals("true", elhVar.c("is_dual_mode")) && !((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isSupportWifiDevice()) {
                LogUtil.j(TAG, "buildNeedUpdateDownLoadDeviceList has no cloud and is hagride device");
                return;
            } else {
                refreshDeviceList(elhVar);
                return;
            }
        }
        LogUtil.a(TAG, "productInfo is null scanMode = ", Integer.valueOf(iC));
    }

    private void refreshDeviceList(elh elhVar) {
        if (METIS_PRODUCTID.equals(elhVar.t()) || AM16_PRODUCTID.equals(elhVar.t()) || !((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isShowWiFiDevice(elhVar.t())) {
            LogUtil.a(TAG, "refreshDeviceList: productInfo", elhVar);
            return;
        }
        if (this.mDeviceType.equals(HealthDevice.HealthDeviceKind.HDK_WEIGHT.name())) {
            String strC = elhVar.l().c();
            LogUtil.a(TAG, "handleMessage company", strC);
            if (isAdded()) {
                sort(this.mProductInfos, elhVar, strC);
            }
            try {
                autoJumpPairedPage();
                this.mWeightListAdapter.d(this.mProductInfos);
                this.mWeightListAdapter.notifyDataSetChanged();
                return;
            } catch (IllegalStateException e) {
                LogUtil.a(TAG, " handleMessage TO_REFRESH HDK_WEIGHT isMain", Boolean.valueOf(Looper.myLooper() == Looper.getMainLooper()));
                LogUtil.a(TAG, " handleMessage TO_REFRESH HDK_WEIGHT e", e.getMessage());
                return;
            }
        }
        this.mProductListAdapter.a(elhVar);
        try {
            this.mProductListAdapter.notifyDataSetChanged();
        } catch (IllegalStateException e2) {
            LogUtil.a(TAG, " handleMessage TO_REFRESH isMain", Boolean.valueOf(Looper.myLooper() == Looper.getMainLooper()));
            LogUtil.a(TAG, " handleMessage TO_REFRESH e", e2.getMessage());
        }
    }

    private void autoJumpPairedPage() {
        if (TextUtils.isEmpty(this.mProductId) || this.mIsAutoJump) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.mProductInfos.size()) {
                i = -1;
                break;
            } else if (this.mProductId.equals(this.mProductInfos.get(i).t())) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            LogUtil.j(TAG, "jumpToIntroductionFragment position < 0");
            return;
        }
        elh elhVar = this.mProductInfos.get(i);
        if (elhVar == null) {
            LogUtil.j(TAG, "jumpToIntroductionFragment productInfo is null");
            return;
        }
        this.mIsAutoJump = true;
        if (isDeviceResourceCanUsing(elhVar)) {
            jumpToIntroductionFragment(elhVar.l(), elhVar);
        } else {
            showAppVersionNotSupportDeviceDialog();
        }
    }

    private void sort(ArrayList<elh> arrayList, elh elhVar, String str) {
        if (arrayList.isEmpty()) {
            elh elhVar2 = new elh(1);
            if (HUAWEI_DEVICE.equalsIgnoreCase(str)) {
                elhVar2.g(getString(R.string.IDS_device_huawei_band));
                elhVar2.c(true);
                elhVar.e(false);
            } else if (HONOR_DEVICE.equalsIgnoreCase(str)) {
                elhVar2.g(getString(R.string.IDS_device_honor_band));
                elhVar2.c(false);
                elhVar.e(false);
            } else {
                elhVar2.g(getString(R.string.IDS_user_profile_more).toUpperCase(Locale.getDefault()));
                elhVar2.c(false);
            }
            arrayList.add(elhVar2);
            arrayList.add(elhVar);
            return;
        }
        productInfosSort(arrayList);
        int iQuery = query(arrayList, elhVar);
        if (HUAWEI_DEVICE.equalsIgnoreCase(str)) {
            judgeHuaweiDevice(elhVar, iQuery, arrayList);
            return;
        }
        if (HONOR_DEVICE.equalsIgnoreCase(str)) {
            judgeHonorDevice(elhVar, iQuery, arrayList);
            return;
        }
        if (this.mOther.size() <= 0) {
            elh elhVar3 = new elh(1);
            elhVar3.g(getString(R.string.IDS_user_profile_more).toUpperCase(Locale.getDefault()));
            elhVar3.c(false);
            arrayList.add(arrayList.size(), elhVar3);
        }
        if (iQuery == -1) {
            arrayList.add(arrayList.size(), elhVar);
        } else {
            arrayList.set(iQuery, elhVar);
        }
    }

    private void judgeHuaweiDevice(elh elhVar, int i, ArrayList<elh> arrayList) {
        if (this.mHuawei.size() <= 0) {
            elh elhVar2 = new elh(1);
            if (isAdded()) {
                elhVar2.g(getString(R.string.IDS_device_huawei_band));
            } else {
                LogUtil.a(TAG, "not attached to a context");
            }
            elhVar2.c(true);
            arrayList.add(0, elhVar2);
            elhVar.e(false);
        }
        if (i == -1) {
            arrayList.add(1, elhVar);
        } else {
            arrayList.set(i, elhVar);
        }
    }

    private void judgeHonorDevice(elh elhVar, int i, ArrayList<elh> arrayList) {
        if (this.mHonor.size() <= 0) {
            elh elhVar2 = new elh(1);
            elhVar2.g(getString(R.string.IDS_device_honor_band));
            elhVar2.c(false);
            if (this.mHuawei.size() <= 0) {
                arrayList.add(this.mHuawei.size(), elhVar2);
            } else {
                arrayList.add(this.mHuawei.size() + 1, elhVar2);
            }
            elhVar.e(false);
        }
        if (i == -1) {
            if (this.mHuawei.size() <= 0) {
                arrayList.add(this.mHuawei.size() + 1, elhVar);
                return;
            } else {
                arrayList.add(this.mHuawei.size() + 2, elhVar);
                return;
            }
        }
        arrayList.set(i, elhVar);
    }

    private void productInfosSort(ArrayList<elh> arrayList) {
        this.mHuawei.clear();
        this.mHonor.clear();
        this.mOther.clear();
        for (elh elhVar : arrayList) {
            elh.d dVarL = elhVar.l();
            if (dVarL != null) {
                String strC = dVarL.c();
                if (strC != null) {
                    if (strC.equalsIgnoreCase(HUAWEI_DEVICE)) {
                        this.mHuawei.add(elhVar);
                    } else if (strC.equalsIgnoreCase(HONOR_DEVICE)) {
                        this.mHonor.add(elhVar);
                    } else {
                        LogUtil.a(TAG, "productInfosSort is other info");
                    }
                } else {
                    this.mOther.add(elhVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void switchDeviceScanningFragment() {
        if (isAdded()) {
            setTitle(getResources().getString(R.string.IDS_device_search_title));
            Bundle bundle = new Bundle();
            bundle.putString("productId", HEART_RATE_UNKNOWN_PRODUCT_ID);
            bundle.putString("scan_kind", HealthDevice.HealthDeviceKind.HDK_HEART_RATE.name());
            bundle.putString("title", getString(R.string.IDS_device_search_title));
            Fragment deviceScanningFragment = new DeviceScanningFragment();
            ContentValues contentValues = new ContentValues();
            contentValues.put("uniqueId", this.mUniqueId);
            contentValues.put("productId", HEART_RATE_UNKNOWN_PRODUCT_ID);
            bundle.putParcelable("commonDeviceInfo", contentValues);
            deviceScanningFragment.setArguments(bundle);
            switchFragment(deviceScanningFragment);
        }
    }

    private void clickNotFoundDeviceButton(String str) {
        if (HealthDevice.HealthDeviceKind.HDK_HEART_RATE.name().equals(str)) {
            HashMap map = new HashMap(16);
            map.put("click", "1");
            lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_MORE_DEVICE_SEARCH_2060017.value(), map, 0);
            if (BluetoothAdapter.getDefaultAdapter().getState() != 12) {
                NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.mainActivity);
                builder.b(R.string.IDS_device_bluetooth_open_request);
                builder.c(R.string.IDS_device_ui_dialog_yes, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        DeviceCategoryFragment.this.switchDeviceScanningFragment();
                    }
                });
                builder.a(R.string.IDS_device_ui_dialog_no, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
                NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
                noTitleCustomAlertDialogC.setCancelable(false);
                noTitleCustomAlertDialogC.show();
                return;
            }
            switchDeviceScanningFragment();
            return;
        }
        showNoFoundDeviceDialog();
    }

    private void showNoFoundDeviceDialog() {
        boolean zO = Utils.o();
        LogUtil.a(TAG, "isOverSea = ", Boolean.valueOf(zO));
        if (zO && !CommonUtil.bd()) {
            showOverSeaDownloadDialog();
        } else if (lsj.c(this.mContext, "com.huawei.appmarket") && !CommonUtil.bd()) {
            showHuaweiMarketDownloadAppDialog();
        } else {
            showOtherMarketDownloadAppDialog();
        }
    }

    private void showAppVersionNotSupportDeviceDialog() {
        if (Utils.o()) {
            showOverSeaDownloadDialog();
        } else if (lsj.c(this.mContext, "com.huawei.appmarket")) {
            showHuaweiMarketDownloadAppDialog();
        } else {
            showHuaweiVmallDownloadByBrowserDialog();
        }
    }

    private void showOverSeaDownloadDialog() {
        if (lsj.c(this.mContext, "com.android.vending") && lsn.c(this.mContext)) {
            showGooglePlayDownloadAppDialog();
        } else if (lsj.c(this.mContext, "com.huawei.appmarket")) {
            showHuaweiMarketDownloadAppDialog();
        } else {
            showAppGalleryDownloadByBrowserDialog();
        }
    }

    private void showAppGalleryDownloadByBrowserDialog() {
        showNoTitleCustomAlertDialog(new NoTitleCustomAlertDialog.Builder(this.mainActivity).a(getDownloadAppDialogText(this.mContext.getResources().getString(R.string.IDS_device_mgr_no_support_device_content))).c(R.string.IDS_device_to_go_into_app_market, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DeviceCategoryFragment.this.gotoAppGalleryDownloadByBrowser();
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openDownloadByBrowserActivity(final String str) {
        if (StringUtils.g(str)) {
            LogUtil.j(TAG, "openDownloadByBrowserActivity: downloadPageUrl is invalid");
        } else if (this.mainActivity == null) {
            LogUtil.j(TAG, "openDownloadByBrowserActivity: mainActivity is null");
        } else {
            this.mainActivity.runOnUiThread(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.8
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        DeviceCategoryFragment.this.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str)));
                    } catch (ActivityNotFoundException unused) {
                        LogUtil.e(DeviceCategoryFragment.TAG, "openDownloadByBrowserActivity: startActivity ActivityNotFoundException");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gotoAppGalleryDownloadByBrowser() {
        ThreadPoolManager.c().a("appGalleryDownloadByBrowser", new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.9
            @Override // java.lang.Runnable
            public void run() {
                String countryCode = SharedPreferenceUtil.getInstance(DeviceCategoryFragment.this.mContext).getCountryCode();
                String noCheckUrl = GRSManager.c(DeviceCategoryFragment.this.mContext).getNoCheckUrl("domainAppgalleryCloudHuawei", countryCode);
                if (StringUtils.g(noCheckUrl)) {
                    LogUtil.j(DeviceCategoryFragment.TAG, "gotoAppGalleryDownloadByBrowser: appGalleryUrl is invalid");
                    return;
                }
                LogUtil.a(DeviceCategoryFragment.TAG, "gotoAppGalleryDownloadByBrowser: countryCode:", countryCode);
                DeviceCategoryFragment.this.openDownloadByBrowserActivity(noCheckUrl + DeviceCategoryFragment.APP_GALLERY_HEALTH_URL);
            }
        });
    }

    private void showHuaweiVmallDownloadByBrowserDialog() {
        showNoTitleCustomAlertDialog(new NoTitleCustomAlertDialog.Builder(this.mainActivity).a(getDownloadAppDialogText(this.mContext.getResources().getString(R.string.IDS_device_mgr_no_support_device_content))).c(R.string.IDS_device_to_go_into_app_market, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DeviceCategoryFragment.this.gotoHuaweiVmallDownloadByBrowser();
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gotoHuaweiVmallDownloadByBrowser() {
        ThreadPoolManager.c().a("huaweiVmallDownloadBrowser", new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.12
            @Override // java.lang.Runnable
            public void run() {
                String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainAVmall");
                if (StringUtils.g(url)) {
                    LogUtil.j(DeviceCategoryFragment.TAG, "gotoHuaweiVmallDownloadByBrowser: googlePlayUrl is invalid");
                    return;
                }
                DeviceCategoryFragment.this.openDownloadByBrowserActivity(url + DeviceCategoryFragment.GOOGLE_CHINA_HEALTH_URL);
            }
        });
    }

    private void showGooglePlayDownloadByBrowserDialog() {
        showNoTitleCustomAlertDialog(new NoTitleCustomAlertDialog.Builder(this.mainActivity).a(getDownloadAppDialogText(this.mContext.getResources().getString(R.string.IDS_device_mgr_no_support_device_content_over_sea))).c(R.string.IDS_device_to_go_into_app_market, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DeviceCategoryFragment.this.gotoGooglePlayDownloadByBrowser();
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gotoGooglePlayDownloadByBrowser() {
        ThreadPoolManager.c().a("googlePlayDownloadByBrowser", new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.15
            @Override // java.lang.Runnable
            public void run() {
                String strD = lon.c().d("domain_play_google");
                if (StringUtils.g(strD)) {
                    LogUtil.j(DeviceCategoryFragment.TAG, "gotoGooglePlayDownloadByBrowser: googlePlayUrl is invalid");
                    return;
                }
                DeviceCategoryFragment.this.openDownloadByBrowserActivity(strD + DeviceCategoryFragment.GOOGLE_HEALTH_URL);
            }
        });
    }

    private void showHuaweiMarketDownloadAppDialog() {
        showNoTitleCustomAlertDialog(new NoTitleCustomAlertDialog.Builder(this.mainActivity).a(getDownloadAppDialogText(this.mContext.getResources().getString(R.string.IDS_device_mgr_no_support_device_content))).c(R.string.IDS_device_to_go_into_app_market, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CommonUtil.a(DeviceCategoryFragment.this.mainActivity, "com.huawei.health");
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }));
    }

    private void showGooglePlayDownloadAppDialog() {
        showNoTitleCustomAlertDialog(new NoTitleCustomAlertDialog.Builder(this.mainActivity).a(getDownloadAppDialogText(this.mContext.getResources().getString(R.string.IDS_device_mgr_no_support_device_content_over_sea))).c(R.string.IDS_device_to_go_into_app_market, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.19
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CommonUtil.b(DeviceCategoryFragment.this.mainActivity, "com.huawei.health");
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.18
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }));
    }

    private void showOtherMarketDownloadAppDialog() {
        showNoTitleCustomAlertDialog(new NoTitleCustomAlertDialog.Builder(this.mainActivity).a(getDownloadAppDialogText(this.mContext.getResources().getString(R.string.IDS_device_mgr_no_support_device_common_content))).c(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment.20
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a(DeviceCategoryFragment.TAG, "click known button");
            }
        }));
    }

    private void showNoTitleCustomAlertDialog(NoTitleCustomAlertDialog.Builder builder) {
        if (builder == null) {
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private String getDownloadAppDialogText(String str) {
        return this.mContext.getResources().getString(R.string.IDS_device_mgr_not_found_device_tips1) + System.lineSeparator() + str;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        if (this.mIsBackToFinish && this.mainActivity != null) {
            this.mainActivity.finish();
            return false;
        }
        return super.onBackPressed();
    }
}
