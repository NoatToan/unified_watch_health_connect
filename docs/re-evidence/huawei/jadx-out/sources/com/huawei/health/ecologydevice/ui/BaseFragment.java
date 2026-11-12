package com.huawei.health.ecologydevice.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.api.DeviceInfoUtilsApi;
import com.huawei.health.device.api.DeviceMainActivityApi;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.api.JsonParserApi;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.dxw;
import defpackage.elh;
import defpackage.emh;
import defpackage.era;
import defpackage.lmf;
import defpackage.lsy;
import defpackage.qrs;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseFragment extends Fragment {
    private static final String NFC_OR_SCAN_DEVICE = "OneHopOrScan";
    private static final String PRIVACY_DATA_SOURCE_NFC_SCAN_DEVICE_NAME = "privacy_data_source_nfc_scan_D85D9FAF0AA347F39179FA0DC65CC9D7";
    private static final int QUERY_RESULT_DEFAULT = -1;
    private static final String TAG = "BaseFragment";
    private static final int USE_THE_LAST_THREE_DIGITS = 3;
    private static lmf sBiAnalyticsUtil = lmf.d();
    protected View child;
    public CustomTitleBar mCustomTitleBar;
    public Activity mainActivity;
    protected HashMap<String, List> mPresetDeviceInChinaMap = new HashMap<>(16);
    protected HashMap<String, List> mPresetDeviceInOverseaMap = new HashMap<>(16);
    private boolean mIsResume = false;

    public void initViewTahiti() {
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (qrs.t()) {
            initViewTahiti();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mainActivity = getActivity();
        buildPresetDeviceInChinaMap();
        buildPresetDeviceInOverseaMap();
    }

    private void buildPresetDeviceInOverseaMap() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add("33123f39-7fc1-420b-9882-a4b0d6c61100");
        arrayList.add("ccd1f0f8-8c57-4bd7-a884-0ef38482f15f");
        ArrayList arrayList2 = new ArrayList(10);
        arrayList2.add("f83a5e21-3686-42f8-9a13-7296172a7ced");
        arrayList2.add("79da9d7e-561c-4e14-8a6b-b1d5dc07198a");
        arrayList2.add("fe33600f-dbb2-4382-9417-21ab8eeb6e42");
        this.mPresetDeviceInOverseaMap.put(HealthDevice.HealthDeviceKind.HDK_HEART_RATE.name(), arrayList2);
        this.mPresetDeviceInOverseaMap.put(HealthDevice.HealthDeviceKind.HDK_WEIGHT.name(), arrayList);
    }

    private void buildPresetDeviceInChinaMap() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add("34fa0346-d46c-439d-9cb0-2f696618846b");
        arrayList.add("7a1063dd-0e0f-4a72-9939-461476ff0259");
        arrayList.add("578d0675-cece-4426-bf28-43ce31eb7b5d");
        arrayList.add("6ab08ad8-753b-4dd9-bf3a-798a0a1d81bf");
        arrayList.add("9684a253-0fb5-4560-8fa3-b925163f8b67");
        ArrayList arrayList2 = new ArrayList(10);
        arrayList2.add("408553b8-0535-4561-8dbf-55c2bbd61b77");
        arrayList2.add("c647e381-165c-44d2-8e7b-6339c7904fde");
        arrayList2.add("4ff7df35-c532-4247-ab42-12b260917bc0");
        arrayList2.add("825c82bd-84fe-44a0-9884-6a764bd73183");
        arrayList2.add("54af062d-b049-4880-beda-f0cbe64e9205");
        ArrayList arrayList3 = new ArrayList(10);
        arrayList3.add("f83a5e21-3686-42f8-9a13-7296172a7ced");
        arrayList3.add("79da9d7e-561c-4e14-8a6b-b1d5dc07198a");
        arrayList3.add("fe33600f-dbb2-4382-9417-21ab8eeb6e42");
        ArrayList arrayList4 = new ArrayList(10);
        arrayList4.add("e570b133-357b-4b49-b894-600a27a0e826");
        arrayList4.add("9bf158ba-49b0-46aa-9fdf-ed75da1569cf");
        this.mPresetDeviceInChinaMap.put(HealthDevice.HealthDeviceKind.HDK_BLOOD_PRESSURE.name(), arrayList2);
        this.mPresetDeviceInChinaMap.put(HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR.name(), arrayList4);
        this.mPresetDeviceInChinaMap.put(HealthDevice.HealthDeviceKind.HDK_HEART_RATE.name(), arrayList3);
        this.mPresetDeviceInChinaMap.put(HealthDevice.HealthDeviceKind.HDK_WEIGHT.name(), arrayList);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.base_fragment, viewGroup, false);
        CustomTitleBar customTitleBar = (CustomTitleBar) viewInflate.findViewById(R.id.device_main_title);
        this.mCustomTitleBar = customTitleBar;
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: ent
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33241c.m969x46f02557(view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: lambda$onCreateView$0$com-huawei-health-ecologydevice-ui-BaseFragment, reason: not valid java name */
    public /* synthetic */ void m969x46f02557(View view) {
        this.mainActivity.onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        qrs.e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getUserVisibleHint() && !this.mIsResume) {
            this.mIsResume = true;
            sBiAnalyticsUtil.e(getClass().getSimpleName(), new LinkedHashMap<>(16));
        }
        LogUtil.d(TAG, "BaseFragment currentFragment name is ", getTag());
        ((DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class)).setCurrentFragment(this.mainActivity, this);
        if ("WiFiInfoConfirmFragment".equals(getTag()) || "WifiDeviceShareAccountActivity".equals(getTag()) || "HagridWiFiInfoConfirmFragment".equals(getTag())) {
            LogUtil.a(TAG, "BaseFragment currentFragment name is ", getTag());
            this.mainActivity.getWindow().addFlags(8192);
        } else {
            this.mainActivity.getWindow().clearFlags(8192);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        LogUtil.a(TAG, "hidden: ", Boolean.valueOf(z));
        if (z) {
            sBiAnalyticsUtil.b(getClass().getSimpleName(), new LinkedHashMap<>(16));
            return;
        }
        sBiAnalyticsUtil.e(getClass().getSimpleName(), new LinkedHashMap<>(16));
        LogUtil.d(TAG, "BaseFragment currentFragment name is ", getTag());
        ((DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class)).setCurrentFragment(this.mainActivity, this);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            if (this.mIsResume) {
                return;
            }
            this.mIsResume = true;
            sBiAnalyticsUtil.e(getClass().getSimpleName(), new LinkedHashMap<>(16));
            return;
        }
        if (this.mIsResume) {
            this.mIsResume = false;
            sBiAnalyticsUtil.b(getClass().getSimpleName(), new LinkedHashMap<>(16));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (getUserVisibleHint() && this.mIsResume) {
            this.mIsResume = false;
            sBiAnalyticsUtil.b(getClass().getSimpleName(), new LinkedHashMap<>(16));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.mainActivity != null) {
            this.mainActivity = null;
        }
    }

    public void setTitle(String str) {
        CustomTitleBar customTitleBar;
        if (str == null || (customTitleBar = this.mCustomTitleBar) == null) {
            return;
        }
        customTitleBar.setTitleText(str);
    }

    protected Bundle getBundleFromDeviceMainActivity() {
        return ((DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class)).getBundleFromDeviceMainActivity(getActivity());
    }

    public void popupFragment(Class<?> cls) {
        ((DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class)).popupFragment(getActivity(), cls);
    }

    public void goToMainRopeTab(String str, String str2) {
        String bondedDeviceAddress = ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).getBondedDeviceAddress(str, str2);
        if (!TextUtils.isEmpty(bondedDeviceAddress)) {
            emh.b().j();
            emh.b().c(str);
            emh.b().a(true, bondedDeviceAddress);
        } else {
            LogUtil.e(TAG, "query device mac is error");
        }
        Intent intent = new Intent();
        intent.setClassName(getActivity(), "com.huawei.health.MainActivity");
        intent.setFlags(131072);
        intent.putExtra(BleConstants.SPORT_TYPE, 283);
        intent.putExtra("mLaunchSource", 11);
        intent.putExtra("isToSportTab", true);
        startActivity(intent);
        popupFragment(null);
    }

    protected void switchFragment(Fragment fragment, String str) {
        ((DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class)).switchFragment(getActivity(), this, fragment, str);
    }

    public void switchFragment(Fragment fragment) {
        switchFragment(this, fragment);
    }

    protected void addFragment(Fragment fragment) {
        ((DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class)).addFragment(getActivity(), this, fragment);
    }

    protected void addFragment(Fragment fragment, Fragment fragment2) {
        if (fragment == null) {
            return;
        }
        ((DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class)).addFragment(getActivity(), fragment, fragment2);
    }

    protected void switchFragment(Fragment fragment, Fragment fragment2) {
        ((DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class)).switchFragment(this.mainActivity, fragment, fragment2);
    }

    public Fragment getSelectFragment(Class<?> cls) {
        return ((DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class)).getSelectFragment(getActivity(), cls);
    }

    public boolean onBackPressed() {
        LogUtil.d(TAG, "BaseFragment onBackPressed invoke");
        return true;
    }

    public void saveResultData() {
        LogUtil.d(TAG, "Save weight or bloodpressure Result Data");
    }

    public void release() {
        LogUtil.d(TAG, "Release fragment and activity");
    }

    public boolean showCustomAlertDialog(int i) {
        if (this.mainActivity == null) {
            LogUtil.j(TAG, "showCustomAlertDialog getActivity is null");
            return false;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.mainActivity);
        builder.b(i);
        builder.c(R.string.IDS_device_ui_dialog_yes, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.BaseFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseFragment.this.saveResultData();
            }
        });
        builder.a(R.string.IDS_device_ui_dialog_no, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.BaseFragment.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseFragment.this.release();
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
        return false;
    }

    public boolean unBindDeviceUniversal(String str, String str2) {
        HealthDeviceEntryApi healthDeviceEntryApi = (HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class);
        if (healthDeviceEntryApi.isDeviceKitUniversal(str)) {
            return healthDeviceEntryApi.unbindDeviceUniversalByUniqueId(str, str2);
        }
        return healthDeviceEntryApi.unbindDeviceByUniqueId(str2);
    }

    public HiAggregateOption createHiAggregateOption() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(new int[]{2006, 2007});
        hiAggregateOption.setConstantsKey(new String[]{"BLOOD_PRESSURE_SYSTOLIC", "BLOOD_PRESSURE_DIASTOLIC"});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setCount(1);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setSortOrder(1);
        return hiAggregateOption;
    }

    public int query(ArrayList<elh> arrayList, elh elhVar) {
        String strT = elhVar.t();
        for (elh elhVar2 : arrayList) {
            String strT2 = elhVar2.t();
            if (strT2 != null && strT2.equals(strT)) {
                return arrayList.indexOf(elhVar2);
            }
        }
        return -1;
    }

    public void registerDeviceInfo(HealthDevice healthDevice, String str, int i, String str2) {
        LogUtil.a(TAG, "registerDeviceInfo param is HealthDevice");
        if (healthDevice == null) {
            return;
        }
        writeNameToUserPreference(healthDevice, str);
        HiDeviceInfo hiDevice = getHiDevice(healthDevice, i);
        String strB = era.b(str2);
        hiDevice.setProdId(strB);
        LogUtil.a(TAG, "registerDeviceInfo prodId is ：", strB);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        HiHealthManager.d(dxw.d()).registerDataClient(hiDevice, arrayList, null);
    }

    private HiDeviceInfo getHiDevice(HealthDevice healthDevice, int i) {
        String uniqueId = healthDevice.getUniqueId();
        String deviceName = healthDevice.getDeviceName();
        HiDeviceInfo hiDeviceInfo = new HiDeviceInfo(10001);
        if (i > 1) {
            hiDeviceInfo.setDeviceType(i);
        }
        hiDeviceInfo.setDeviceUniqueCode(uniqueId);
        hiDeviceInfo.setDeviceName(getHandledName(deviceName, uniqueId));
        return hiDeviceInfo;
    }

    private void writeNameToUserPreference(HealthDevice healthDevice, final String str) {
        final String uniqueId = healthDevice.getUniqueId();
        if (TextUtils.isEmpty(uniqueId) || TextUtils.isEmpty(str)) {
            return;
        }
        lsy.a(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.BaseFragment.3
            @Override // java.lang.Runnable
            public void run() {
                JsonParserApi jsonParserApi = (JsonParserApi) Services.b("PluginDevice", JsonParserApi.class);
                HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference(BaseFragment.PRIVACY_DATA_SOURCE_NFC_SCAN_DEVICE_NAME);
                Map<String, Object> map = new HashMap<>();
                if (userPreference == null) {
                    userPreference = new HiUserPreference();
                } else {
                    map = jsonParserApi.fromJsonObject(userPreference.getValue());
                    userPreference.setSyncStatus(0);
                }
                String str2 = uniqueId;
                map.put(str2, BaseFragment.this.getHandledName(str, str2));
                userPreference.setKey(BaseFragment.PRIVACY_DATA_SOURCE_NFC_SCAN_DEVICE_NAME);
                userPreference.setValue(jsonParserApi.toJsonObject(map).toString());
                LogUtil.a(BaseFragment.TAG, "privacy hiUserPreference set ", Boolean.valueOf(HiHealthManager.d(BaseApplication.getContext()).setUserPreference(userPreference)));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getHandledName(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        String strReplaceAll = str2.replaceAll(":", "");
        if (strReplaceAll.length() < 3) {
            return str + Constants.LINK + strReplaceAll;
        }
        return str + Constants.LINK + strReplaceAll.substring(strReplaceAll.length() - 3);
    }
}
