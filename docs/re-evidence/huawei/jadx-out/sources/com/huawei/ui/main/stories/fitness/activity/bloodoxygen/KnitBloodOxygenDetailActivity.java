package com.huawei.ui.main.stories.fitness.activity.bloodoxygen;

import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.knit.model.KnitSubPageConfig;
import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.KnitBloodOxygenDetailActivity;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDataModelActivity;
import com.huawei.ui.main.stories.template.PopMenuManager;
import com.huawei.ui.main.stories.template.data.IPopMenuItemClick;
import com.huawei.ui.main.stories.template.health.common.CommonHealthNoDeviceFragment;
import com.huawei.ui.main.stories.utils.FitnessUtils;
import com.huawei.ui.main.stories.utils.LastTimeHealthDataReader;
import defpackage.dfd;
import defpackage.drw;
import defpackage.ecu;
import defpackage.eej;
import defpackage.etn;
import defpackage.fua;
import defpackage.idy;
import defpackage.iov;
import defpackage.lmf;
import defpackage.mgg;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import defpackage.wpo;
import defpackage.wup;
import health.compact.a.EnvironmentInfo;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes19.dex */
public class KnitBloodOxygenDetailActivity extends KnitHealthDetailActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTitleBar f26582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthToolBar f26583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthToolBar.OnSingleTapListener f26584c = new HealthToolBar.OnSingleTapListener() { // from class: tvq
        @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
        public final void onSingleTap(int i) {
            this.f49719a.c(i);
        }
    };
    private LastTimeHealthDataReader<KnitBloodOxygenDetailActivity> d;
    private long e;

    public static /* synthetic */ void c(View view) {
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configExtraView(LinearLayout linearLayout) {
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public boolean getExtra(Bundle bundle) {
        return true;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public int getPageType() {
        return 20;
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
    }

    public /* synthetic */ void c(int i) {
        if (i == 1) {
            c();
        } else {
            if (i == 3) {
                if (qrs.r()) {
                    return;
                }
                startActivity(new Intent(this, (Class<?>) BloodOxygenIntroducedActivity.class));
                return;
            }
            LogUtil.d("KnitBloodOxygenDetailActivity", "unKnow click");
        }
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("KnitBloodOxygenDetailActivity", "onCreate");
        super.onCreate(bundle);
        this.e = System.currentTimeMillis();
        cancelMarginAdaptation();
        g();
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        HealthViewPager viewPager = getViewPager();
        if (viewPager != null) {
            viewPager.setOffscreenPageLimit(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        ArrayList<String> arrayListD = drw.e().d(HealthDevice.HealthDeviceKind.HDK_BLOOD_OXYGEN);
        return !njy.e(arrayListD) && arrayListD.size() > 0;
    }

    private void g() {
        if (this.d == null) {
            this.d = new LastTimeHealthDataReader<>(this, new a());
        }
        this.d.b(LastTimeHealthDataReader.CardData.BLOOD_OXYGEN);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.a("KnitBloodOxygenDetailActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        super.onResume();
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public Fragment onCreateEmptyFragment(KnitSubPageConfig knitSubPageConfig) {
        return CommonHealthNoDeviceFragment.e("BloodOxygenCardConstructor", 20);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public String getLogTag() {
        return "KnitBloodOxygenDetailActivity";
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configTitleBar(CustomTitleBar customTitleBar) {
        this.f26582a = customTitleBar;
        customTitleBar.setTitleText(getString(R.string.IDS_hw_health_blood_oxygen));
        c(this, this.f26582a, 105);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public DataInfos getSubPageDataInfos(int i) {
        if (i == 0) {
            return DataInfos.BloodOxygenDayDetail;
        }
        if (i == 1) {
            return DataInfos.BloodOxygenWeekDetail;
        }
        if (i == 2) {
            return DataInfos.BloodOxygenMonthDetail;
        }
        if (i == 3) {
            return DataInfos.BloodOxygenYearDetail;
        }
        return DataInfos.NoDataPlaceHolder;
    }

    private void c(final Context context, final CustomTitleBar customTitleBar, final int i) {
        customTitleBar.setRightButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        customTitleBar.setRightButtonClickable(true);
        customTitleBar.setRightButtonVisibility(0);
        final PopMenuManager popMenuManager = new PopMenuManager() { // from class: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.KnitBloodOxygenDetailActivity.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.ui.main.stories.template.PopMenuManager
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public CustomTitleBar getTitleBar() {
                return customTitleBar;
            }

            @Override // com.huawei.ui.main.stories.template.IMenuItemManager
            public List<wpo> getMenuItemList() {
                return KnitBloodOxygenDetailActivity.this.b(context, i);
            }
        };
        customTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: tvw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                popMenuManager.showPopMenu();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<wpo> b(final Context context, final int i) {
        wpo wpoVar = new wpo(getResources().getString(R.string.IDS_blood_oxygen_switch), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.KnitBloodOxygenDetailActivity.4
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                KnitBloodOxygenDetailActivity.this.d(context);
            }
        });
        wpo wpoVar2 = new wpo(getResources().getString(R.string.IDS_highland_health), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.KnitBloodOxygenDetailActivity.5
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                KnitBloodOxygenDetailActivity.this.e(context);
            }
        });
        wpo wpoVar3 = new wpo(getResources().getString(R.string.IDS_privacy_all_data), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.KnitBloodOxygenDetailActivity.2
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                KnitBloodOxygenDetailActivity.this.c(context, i);
            }
        });
        wpo wpoVar4 = new wpo(getResources().getString(R.string.IDS_fitness_core_sleep_explain_title), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.KnitBloodOxygenDetailActivity.1
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                KnitBloodOxygenDetailActivity.this.h();
            }
        });
        ArrayList<wpo> arrayList = new ArrayList<>();
        if (!EnvironmentInfo.m()) {
            arrayList.add(wpoVar);
        }
        boolean zB = dfd.b();
        if (fua.e() && !EnvironmentInfo.m() && zB) {
            arrayList.add(wpoVar2);
        }
        arrayList.add(wpoVar3);
        arrayList.add(wpoVar4);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        c(getApplicationContext(), AnalyticsValue.BLOOD_OXYGEN_PAGE_CLICK.value(), "6");
        startActivity(new Intent(this, (Class<?>) BloodOxygenIntroducedActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context, int i) {
        PageModelArgs pageModelArgs = new PageModelArgs(i, "PrivacyDataConstructor", 3, 1);
        pageModelArgs.setClassType(0);
        PrivacyDataModelActivity.b(context, pageModelArgs);
    }

    private void a(String str) {
        String multiLinkBleMac;
        DeviceInfo deviceInfoD = mgg.d("KnitBloodOxygenDetailActivity");
        if (deviceInfoD == null) {
            multiLinkBleMac = "";
        } else {
            multiLinkBleMac = deviceInfoD.getMultiLinkBleMac();
        }
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getContext(), str);
        intent.setFlags(268435456);
        if (!TextUtils.isEmpty(multiLinkBleMac)) {
            intent.putExtra("device_id", multiLinkBleMac);
        }
        intent.setFlags(67108864);
        iov.d(BaseApplication.getContext(), intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context) {
        if (b()) {
            wup.b(context, R.string.IDS_device_wifi_go_connect, R.string.IDS_core_sleep_not_connect);
            return;
        }
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC != null && deviceCapabilityC.isSupportCycleBloodOxygenSwitch()) {
            a("com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity");
        } else {
            wup.b(context, R.string.IDS_device_wifi_go_connect, R.string.IDS_hw_show_main_device_not_connect_blood_oxygen);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        if (b()) {
            wup.b(context, R.string.IDS_device_wifi_go_connect, R.string.IDS_core_sleep_not_connect);
        } else if (dfd.b()) {
            a("com.huawei.ui.device.activity.bloodoxygen.HighLandBloodOxygenSettingActivity");
        } else {
            wup.b(context, R.string.IDS_device_wifi_go_connect, R.string.IDS_hw_show_main_device_not_connect);
        }
    }

    public boolean b() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "KnitBloodOxygenDetailActivity");
        return deviceInfo == null || deviceInfo.getDeviceConnectState() != 2;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configToolBar(HealthToolBar healthToolBar) {
        if (e()) {
            this.f26583b = healthToolBar;
            d();
        }
    }

    private void d() {
        this.f26583b.d(View.inflate(this, R.layout.hw_toolbar_bottomview, null));
        this.f26583b.setOnSingleTapListener(this.f26584c);
        this.f26583b.a(this);
        this.f26583b.setIcon(1, R.drawable.ic_public_calibration);
        this.f26583b.setIconTitle(1, getResources().getString(R.string.IDS_hw_show_main_health_page_healthdata_bloodpresure_mesure));
        this.f26583b.setIcon(3, R.mipmap.title_right_note_btn);
        this.f26583b.setIconTitle(3, getResources().getString(R.string.IDS_fitness_core_sleep_explain_title));
    }

    private void c() {
        LoginInit.getInstance(this).browsingToLogin(new IBaseResponseCallback() { // from class: tvy
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f49722a.e(i, obj);
            }
        }, AnalyticsValue.HEALTH_HEALTH_BLOOD_OXYGEN_DETAIL_MEASURE_2060051.value());
    }

    public /* synthetic */ void e(int i, Object obj) {
        if (i == 0) {
            i();
        } else {
            LogUtil.j("KnitBloodOxygenDetailActivity", "browsingToLogin errorCode is not success", Integer.valueOf(i));
        }
    }

    private void i() {
        LogUtil.a("KnitBloodOxygenDetailActivity", "startMeasure enter");
        if (qrs.r()) {
            return;
        }
        final BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.getState() == 12) {
            j();
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.b(R.string.IDS_device_bluetooth_open_request);
        builder.c(R.string.IDS_device_ui_dialog_yes, new View.OnClickListener() { // from class: tvp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49717a.e(defaultAdapter, view);
            }
        });
        builder.a(R.string.IDS_device_ui_dialog_no, new View.OnClickListener() { // from class: tvr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KnitBloodOxygenDetailActivity.c(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        if (isFinishing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void e(BluetoothAdapter bluetoothAdapter, View view) {
        if (bluetoothAdapter == null) {
            LogUtil.j("KnitBloodOxygenDetailActivity", "startMesure bluetoothAdapter is null");
        } else if (Build.VERSION.SDK_INT > 30 && PermissionUtil.e(this, PermissionUtil.PermissionType.SCAN) != PermissionUtil.PermissionResult.GRANTED) {
            LogUtil.j("KnitBloodOxygenDetailActivity", "no scan Permission");
            PermissionUtil.a(this, PermissionUtil.c(PermissionUtil.PermissionType.SCAN), new PermissionsResultAction() { // from class: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.KnitBloodOxygenDetailActivity.7
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    KnitBloodOxygenDetailActivity.this.a();
                }

                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    qpx.e(this, R.string.IDS_nearby_permission_exception);
                }
            });
        } else {
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
        } catch (ActivityNotFoundException unused) {
            LogUtil.j("KnitBloodOxygenDetailActivity", "createBluetoothDialog ActivityNotFoundException");
        } catch (SecurityException unused2) {
            ReleaseLogUtil.b("KnitBloodOxygenDetailActivity", "createBluetoothDialog SecurityException");
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            j();
        }
    }

    private void j() {
        Intent intent = new Intent();
        intent.setPackage(com.huawei.haf.application.BaseApplication.d());
        intent.setClassName(com.huawei.haf.application.BaseApplication.d(), "com.huawei.health.device.ui.DeviceMainActivity");
        intent.putExtra("kind", "HDK_BLOOD_OXYGEN");
        if (e()) {
            String strValue = AnalyticsValue.HEALTH_HEALTH_BLOOD_OXYGEN_DETAIL_MEASURE_2060051.value();
            HashMap map = new HashMap(16);
            map.put("click", "1");
            lmf.d().c(BaseApplication.getActivity(), strValue, map, 0);
            intent.putExtra("view", "MeasureDevice");
            startActivity(intent);
            return;
        }
        f();
    }

    private void f() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.a(getString(R.string.IDS_hw_plugin_device_selection_click_bind_my_device_select)).a(getString(R.string.IDS_hw_health_show_common_dialog_ok_button), new View.OnClickListener() { // from class: tvv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KnitBloodOxygenDetailActivity.d(view);
            }
        }).d(getString(R.string.IDS_hw_health_show_common_dialog_cancle_button), new View.OnClickListener() { // from class: tvx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("KnitBloodOxygenDetailActivity", "onClick negative button");
            }
        });
        builder.c().show();
    }

    public static /* synthetic */ void d(View view) {
        String strValue = AnalyticsValue.HEALTH_HEALTH_BLOOD_OXYGEN_DETAIL_BIND_2060052.value();
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(BaseApplication.getActivity(), strValue, map, 0);
        etn.a(BaseApplication.getActivity(), "HDK_BLOOD_OXYGEN");
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("KnitBloodOxygenDetailActivity", "KnitBloodOxygenDetailActivity do destory");
        long jCurrentTimeMillis = this.e > 0 ? System.currentTimeMillis() - this.e : 0L;
        HashMap map = new HashMap(16);
        map.put("keeptime", Long.valueOf(jCurrentTimeMillis));
        idy.b(AnalyticsValue.HEALTH_HEALTH_HEALTHDATA_BLOOD_OXYGEN_2030063.value(), map);
    }

    public static void c(Context context, long j) {
        FitnessUtils.b(context, KnitBloodOxygenDetailActivity.class, j);
    }

    static class a implements IBaseResponseCallback {
        private final WeakReference<KnitBloodOxygenDetailActivity> e;

        private a(KnitBloodOxygenDetailActivity knitBloodOxygenDetailActivity) {
            this.e = new WeakReference<>(knitBloodOxygenDetailActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(final int i, final Object obj) {
            long startTime;
            if (!HandlerExecutor.c()) {
                HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.KnitBloodOxygenDetailActivity.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.a(i, obj);
                    }
                });
                return;
            }
            KnitBloodOxygenDetailActivity knitBloodOxygenDetailActivity = this.e.get();
            if (knitBloodOxygenDetailActivity == null) {
                LogUtil.j("KnitBloodOxygenDetailActivity", "LastTimeCallback activity is null");
                return;
            }
            if (!(obj instanceof HiHealthData)) {
                LogUtil.j("KnitBloodOxygenDetailActivity", "read last data time from database,mLastTimestamp=0");
                startTime = 0;
            } else {
                startTime = ((HiHealthData) obj).getStartTime();
                LogUtil.a("KnitBloodOxygenDetailActivity", "read last data time from database,mLastTimestamp=", Long.valueOf(startTime));
            }
            DeviceInfo deviceInfoC = mgg.c("KnitBloodOxygenDetailActivity");
            if (startTime != 0 || deviceInfoC != null || knitBloodOxygenDetailActivity.e() || Utils.o()) {
                knitBloodOxygenDetailActivity.refreshTitleBar(true);
                knitBloodOxygenDetailActivity.hideEmptyFragment();
            } else {
                knitBloodOxygenDetailActivity.showEmptyFragment();
                knitBloodOxygenDetailActivity.refreshTitleBar(false);
                knitBloodOxygenDetailActivity.f26582a.setVisibility(8);
            }
        }
    }

    private void c(Context context, String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (str2 != null) {
            map.put("type", str2);
        }
        lmf.d().c(context, str, map, 0);
        LogUtil.a("KnitBloodOxygenDetailActivity", "BICollect", str + Marker.ANY_NON_NULL_MARKER + map.get("type"));
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void onKnitPageSelected(int i) {
        super.onKnitPageSelected(i);
        d(i);
    }

    private void d(int i) {
        String str;
        HashMap map = new HashMap(16);
        if (i == 0) {
            str = "Day";
        } else if (i == 1) {
            str = "Week";
        } else if (i == 2) {
            str = "Month";
        } else if (i == 3) {
            str = "Year";
        } else {
            str = "Err";
        }
        map.put("click", 1);
        map.put("click_type", str);
        idy.b(AnalyticsValue.HEALTH_HEALTH_HEALTHDATA_BLOOD_OXYGEN_2030064.value(), map);
        LogUtil.a("KnitBloodOxygenDetailActivity", "addOnPageChangeListener onPageSelected position = ", Integer.valueOf(i));
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
