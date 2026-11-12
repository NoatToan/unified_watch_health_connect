package com.huawei.ui.main.stories.health.activity.healthdata;

import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.knit.model.KnitSubPageConfig;
import com.huawei.health.knit.section.listener.BasePageResTrigger;
import com.huawei.health.knit.section.listener.IPageResTrigger;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.KnitTemperatureActivity;
import com.huawei.ui.main.stories.health.temperature.activity.TemperatureIntroduceActivity;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDataModelActivity;
import com.huawei.ui.main.stories.template.PopMenuManager;
import com.huawei.ui.main.stories.template.data.IPopMenuItemClick;
import com.huawei.ui.main.stories.template.health.common.CommonHealthNoDeviceFragment;
import com.huawei.ui.main.stories.template.health.module.HealthDataDetailActivity;
import com.huawei.ui.main.stories.utils.LastTimeHealthDataReader;
import defpackage.dmz;
import defpackage.drw;
import defpackage.ecu;
import defpackage.etn;
import defpackage.idy;
import defpackage.iov;
import defpackage.lmf;
import defpackage.mbw;
import defpackage.mgg;
import defpackage.njy;
import defpackage.peh;
import defpackage.qpx;
import defpackage.qqj;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import defpackage.vbk;
import defpackage.wpo;
import defpackage.wup;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class KnitTemperatureActivity extends KnitHealthDetailActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthToolBar f27573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f27574c;
    private boolean d;
    private boolean f;
    private CustomTitleBar h;
    private LastTimeHealthDataReader<KnitTemperatureActivity> i;
    private a j;
    private boolean g = false;
    private long e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27572a = null;

    public static /* synthetic */ void a(View view) {
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configExtraView(LinearLayout linearLayout) {
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public int getPageType() {
        return 24;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        vbk.e(true);
        this.f27574c = this;
        g();
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public Fragment onCreateEmptyFragment(KnitSubPageConfig knitSubPageConfig) {
        LogUtil.a("Knit_TemperatureActivity", "onCreateEmptyFragment");
        this.f = Utils.o();
        if (knitSubPageConfig != null) {
            Bundle bundle = new Bundle();
            int resPosId = knitSubPageConfig.getResPosId();
            String strC = peh.c(knitSubPageConfig);
            IPageResTrigger extra = getResTrigger(getPageType(), resPosId, false).setExtra(bundle);
            if (extra instanceof BasePageResTrigger) {
                this.g = true;
                return KnitFragment.newInstance(strC, (BasePageResTrigger) extra);
            }
        }
        return CommonHealthNoDeviceFragment.e("BodyTemperatureCardConstructor", 24);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public String getLogTag() {
        return "Knit_TemperatureActivity";
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && "MyHealthData".equals(this.f27572a)) {
            e();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configTitleBar(final CustomTitleBar customTitleBar) {
        LogUtil.e("Knit_TemperatureActivity", "goto configTitleBar");
        if (this.f27574c == null) {
            this.f27574c = BaseApplication.getContext();
        }
        this.h = customTitleBar;
        if (this.f) {
            customTitleBar.setTitleText(getString(R.string.IDS_health_skin_temperature));
        } else {
            customTitleBar.setTitleText(getString(R.string.IDS_settings_health_temperature));
        }
        this.h.setRightButtonDrawable(ContextCompat.getDrawable(this, R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        this.h.setRightButtonClickable(true);
        this.h.setRightButtonVisibility(0);
        LogUtil.e("Knit_TemperatureActivity", "View.VISIBLE configTitleBar");
        final PopMenuManager popMenuManager = new PopMenuManager() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.KnitTemperatureActivity.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.ui.main.stories.template.PopMenuManager
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomTitleBar getTitleBar() {
                return customTitleBar;
            }

            @Override // com.huawei.ui.main.stories.template.IMenuItemManager
            public List<wpo> getMenuItemList() {
                return KnitTemperatureActivity.this.h();
            }
        };
        customTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: uqq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                popMenuManager.showPopMenu();
            }
        });
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<wpo> h() {
        wpo wpoVar = new wpo(c(), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.KnitTemperatureActivity.4
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                KnitTemperatureActivity.this.f();
            }
        });
        wpo wpoVar2 = new wpo(getResources().getString(R.string.IDS_privacy_all_data), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.KnitTemperatureActivity.3
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                KnitTemperatureActivity.this.l();
            }
        });
        wpo wpoVar3 = new wpo(getResources().getString(R.string.IDS_fitness_core_sleep_explain_title), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.KnitTemperatureActivity.2
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                KnitTemperatureActivity.this.n();
            }
        });
        ArrayList<wpo> arrayList = new ArrayList<>();
        if (!EnvironmentInfo.m()) {
            arrayList.add(wpoVar);
        }
        arrayList.add(wpoVar2);
        arrayList.add(wpoVar3);
        return arrayList;
    }

    private String c() {
        if (Utils.o()) {
            return getString(R.string.IDS_continuous_monitoring_skins);
        }
        if (mbw.d()) {
            return getString(R.string.IDS_temp_hyperthermia_warning);
        }
        return getString(R.string.IDS_temp_monitoring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        b(0);
        PageModelArgs pageModelArgs = new PageModelArgs(this.f ? CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON : 106, "PrivacyDataConstructor", 3, 1);
        pageModelArgs.setClassType(0);
        PrivacyDataModelActivity.b(this.f27574c, pageModelArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        b(1);
        try {
            iov.d(this.f27574c, new Intent(this.f27574c, (Class<?>) TemperatureIntroduceActivity.class));
        } catch (ActivityNotFoundException e) {
            LogUtil.e("Knit_TemperatureActivity", "ActivityNotFoundException", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        String multiLinkBleMac;
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Knit_TemperatureActivity");
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
            wup.b(this.f27574c, R.string.IDS_device_wifi_go_connect, R.string.IDS_core_sleep_not_connect);
            return;
        }
        if (!mbw.a()) {
            wup.b(this.f27574c, R.string.IDS_device_wifi_go_connect, R.string.IDS_hw_show_main_device_not_connect);
            return;
        }
        DeviceInfo deviceInfoD = mgg.d("Knit_TemperatureActivity");
        if (deviceInfoD == null) {
            multiLinkBleMac = "";
        } else {
            multiLinkBleMac = deviceInfoD.getMultiLinkBleMac();
        }
        Intent intent = new Intent();
        intent.setClassName(this.f27574c, "com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity");
        intent.setFlags(268435456);
        if (!TextUtils.isEmpty(multiLinkBleMac)) {
            intent.putExtra("device_id", multiLinkBleMac);
        }
        intent.setFlags(67108864);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("Knit_TemperatureActivity", "ActivityNotFoundException", e.getMessage());
        }
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configToolBar(HealthToolBar healthToolBar) {
        LogUtil.e("Knit_TemperatureActivity", "goto configToolBar");
        if (this.f) {
            return;
        }
        this.f27573b = healthToolBar;
        this.f27573b.d(View.inflate(this.f27574c, R.layout.hw_toolbar_bottomview, null));
        this.f27573b.setIcon(1, d());
        HealthToolBar healthToolBar2 = this.f27573b;
        healthToolBar2.setIconTitle(1, healthToolBar2.getResources().getString(R.string.IDS_hw_health_show_healthdata_input));
        this.f27573b.setIcon(3, R.mipmap.ic_thermometer);
        HealthToolBar healthToolBar3 = this.f27573b;
        healthToolBar3.setIconTitle(3, healthToolBar3.getResources().getString(R.string.IDS_device_group_name_temperature_scale));
        if (EnvironmentInfo.m()) {
            this.f27573b.setIconVisible(3, 8);
        }
        this.f27573b.setOnSingleTapListener(new HealthToolBar.OnSingleTapListener() { // from class: uql
            @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
            public final void onSingleTap(int i) {
                this.f50468c.d(i);
            }
        });
        setMinibarBottomMargin(getResources().getDimensionPixelSize(R.dimen.hwappbarpattern_height));
    }

    public /* synthetic */ void d(int i) {
        if (qrs.c(500)) {
            return;
        }
        if (i == 1) {
            e(String.valueOf(1), AnalyticsValue.HEALTH_HEALTH_TEMPERATURE_INPUT_2060049.value());
        } else if (i == 3) {
            e(String.valueOf(3), AnalyticsValue.HEALTH_PLUGIN_DEVICE_BEGIN_MEASURE_2060043.value());
        } else {
            LogUtil.j("Knit_TemperatureActivity", "unKnow click");
        }
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public boolean getExtra(Bundle bundle) {
        long j = bundle.getLong("key_bundle_health_last_data_time", 0L);
        long j2 = bundle.getLong("key_marker_view_time", 0L);
        Intent intent = getIntent();
        this.j = new a(j, j2);
        if (intent == null) {
            return true;
        }
        long longExtra = intent.getLongExtra("key_bundle_health_last_data_time", 0L);
        this.e = longExtra;
        bundle.putLong("key_bundle_health_last_data_time", longExtra);
        return this.e != 0;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public DataInfos getSubPageDataInfos(int i) {
        if (i == 0) {
            return DataInfos.TemperatureDayDetail;
        }
        if (i == 1) {
            return DataInfos.TemperatureWeekDetail;
        }
        if (i == 2) {
            return DataInfos.TemperatureMonthDetail;
        }
        return DataInfos.NoDataPlaceHolder;
    }

    private Drawable d() {
        Drawable drawable = ContextCompat.getDrawable(this.f27574c, R.drawable.ic_public_detection);
        return LanguageUtil.ba(this.f27574c) ? qqz.e(this.f27574c, drawable) : drawable;
    }

    protected void c(String str) {
        if (String.valueOf(1).equals(str)) {
            j();
        } else if (String.valueOf(3).equals(str)) {
            p();
        } else {
            LogUtil.j("Knit_TemperatureActivity", "unknow position=", str);
        }
    }

    private void j() {
        String strValue = AnalyticsValue.HEALTH_HEALTH_TEMPERATURE_INPUT_2060049.value();
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(this.f27574c, strValue, map, 0);
        Intent intent = new Intent(this.f27574c, (Class<?>) InputTemperatureActivity.class);
        intent.putExtra("isShowInput", true);
        try {
            this.f27574c.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("Knit_TemperatureActivity", "ActivityNotFoundException", e.getMessage());
        }
    }

    private void p() {
        if (a() > 0) {
            LogUtil.j("Knit_TemperatureActivity", "getBondedProducts() > 0");
            i();
        } else {
            q();
        }
    }

    private int a() {
        ArrayList<String> arrayListD = drw.e().d(HealthDevice.HealthDeviceKind.HDK_BODY_TEMPERATURE);
        if (njy.e(arrayListD)) {
            return 0;
        }
        return arrayListD.size();
    }

    private void i() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.getState() == 12) {
            o();
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f27574c);
        builder.b(R.string.IDS_device_bluetooth_open_request);
        builder.c(R.string.IDS_device_ui_dialog_yes, new View.OnClickListener() { // from class: uqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(view);
            }
        });
        builder.a(R.string.IDS_device_ui_dialog_no, new View.OnClickListener() { // from class: uqw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KnitTemperatureActivity.a(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void c(View view) {
        if (Build.VERSION.SDK_INT > 30 && PermissionUtil.e(this, PermissionUtil.PermissionType.SCAN) != PermissionUtil.PermissionResult.GRANTED) {
            LogUtil.j("Knit_TemperatureActivity", "no scan Permission");
            PermissionUtil.a(this, PermissionUtil.c(PermissionUtil.PermissionType.SCAN), new PermissionsResultAction() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.KnitTemperatureActivity.5
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    KnitTemperatureActivity.this.b();
                }

                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    qpx.e(this, R.string.IDS_nearby_permission_exception);
                }
            });
        } else {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1001);
        } catch (ActivityNotFoundException unused) {
            LogUtil.j("Knit_TemperatureActivity", "createBluetoothDialog ActivityNotFoundException");
        } catch (SecurityException unused2) {
            ReleaseLogUtil.b("Knit_TemperatureActivity", "createBluetoothDialog SecurityException");
        }
    }

    private void q() {
        String string = this.f27574c.getString(R.string.IDS_hw_temperature_no_device_tip, 1, 2);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.f27574c);
        builder.d(R.string.IDS_hw_temperature_no_device_title).e(string).d(R.string.IDS_hw_temperature_no_device_bind, new DialogInterface.OnClickListener() { // from class: uqs
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f50469a.b(dialogInterface, i);
            }
        }).a(R.string.IDS_hw_health_show_common_dialog_cancle_button, new DialogInterface.OnClickListener() { // from class: uqo
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("Knit_TemperatureActivity", "onClick negative button");
            }
        });
        builder.b().show();
    }

    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        String strValue = AnalyticsValue.HEALTH_HEALTH_TEMPERATURE_DETAIL_BIND_2060048.value();
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(this.f27574c, strValue, map, 0);
        r();
    }

    private void r() {
        etn.a(this, "HDK_BODY_TEMPERATURE");
    }

    private void o() {
        Intent intent = new Intent();
        intent.setPackage(dmz.y);
        intent.setClassName(dmz.y, "com.huawei.health.device.ui.DeviceMainActivity");
        intent.putExtra("kind", "HDK_BODY_TEMPERATURE");
        String strValue = AnalyticsValue.HEALTH_HEALTH_TEMPERATURE_DETAIL_MEASURE_2060047.value();
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(this.f27574c, strValue, map, 0);
        intent.putExtra("view", "MeasureDevice");
        try {
            this.f27574c.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("Knit_TemperatureActivity", "ActivityNotFoundException", e.getMessage());
        }
    }

    private void e(final String str, String str2) {
        LoginInit.getInstance(this).browsingToLogin(new IBaseResponseCallback() { // from class: uqv
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f50471b.c(str, i, obj);
            }
        }, str2);
    }

    public /* synthetic */ void c(String str, int i, Object obj) {
        if (i != 0) {
            LogUtil.a("Knit_TemperatureActivity", "browsingToLogin errorCode is not success", Integer.valueOf(i));
        } else {
            LogUtil.e("Knit_TemperatureActivity", "clickMenuAndToLogin");
            c(str);
        }
    }

    private void b(int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        idy.b(AnalyticsValue.TEMPERATURE_MORE_2060079.value(), map);
    }

    private void m() {
        LogUtil.e("Knit_TemperatureActivity", "setTitleBarShow");
        if (this.f27574c instanceof HealthDataDetailActivity) {
            LogUtil.e("Knit_TemperatureActivity", "mContext instanceof HealthDataDetailActivity");
            if (((HealthDataDetailActivity) this.f27574c).e() > 0) {
                c(0);
                refreshTitleBar(false);
                this.d = false;
            } else {
                c(8);
                refreshTitleBar(true);
            }
        }
    }

    private void c(final int i) {
        runOnUiThread(new Runnable() { // from class: uqr
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a(i);
            }
        });
    }

    public /* synthetic */ void a(int i) {
        this.h.setRightButtonVisibility(i);
    }

    private void g() {
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.getStringExtra("healthdata") != null) {
                this.f27572a = intent.getStringExtra("healthdata");
            }
            boolean booleanExtra = intent.getBooleanExtra("refreshCard", false);
            LogUtil.a("Knit_TemperatureActivity", "mIsRefreshCard = ", Boolean.valueOf(booleanExtra));
            if (booleanExtra) {
                qqj.a(this.f27574c, 24);
            }
        }
    }

    private void e() {
        LogUtil.a("Knit_TemperatureActivity", "onBackPressed jumpToDeviceActivity is Success");
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.device.ui.DeviceMainActivity");
        intent.putExtra("kind", "HDK_UNKNOWN");
        intent.putExtra("view", "ListDevice");
        startActivity(intent);
        finish();
    }

    private void k() {
        if (this.i == null) {
            this.i = new LastTimeHealthDataReader<>(this, this.j);
        }
        this.i.b(LastTimeHealthDataReader.CardData.TEMPERATURE);
    }

    static class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<KnitTemperatureActivity> f27580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f27581b;
        private long e;

        private a(KnitTemperatureActivity knitTemperatureActivity, long j, long j2) {
            this.f27580a = new WeakReference<>(knitTemperatureActivity);
            this.f27581b = j;
            this.e = j2;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(final int i, final Object obj) {
            long startTime;
            if (!HandlerExecutor.c()) {
                HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.KnitTemperatureActivity.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.a(i, obj);
                    }
                });
                return;
            }
            KnitTemperatureActivity knitTemperatureActivity = this.f27580a.get();
            if (knitTemperatureActivity == null) {
                LogUtil.j("Knit_TemperatureActivity", "LastTimeCallback activity is null");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("key_bundle_health_last_data_time", this.f27581b);
            bundle.putLong("key_marker_view_time", this.e);
            if (!(obj instanceof HiHealthData)) {
                LogUtil.j("Knit_TemperatureActivity", "read last data time from database,mLastTimestamp=0");
                startTime = 0;
            } else {
                startTime = ((HiHealthData) obj).getStartTime();
                LogUtil.a("Knit_TemperatureActivity", "read last data time from database,mLastTimestamp=", Long.valueOf(startTime));
            }
            if (startTime != 0 || Utils.o()) {
                LogUtil.j("Knit_TemperatureActivity", "show not empty fragment");
                knitTemperatureActivity.refreshTitleBar(true);
                knitTemperatureActivity.h.setVisibility(0);
                knitTemperatureActivity.hideEmptyFragment();
                knitTemperatureActivity.showNonEmptyFragment();
            } else {
                LogUtil.j("Knit_TemperatureActivity", "show empty fragment");
                knitTemperatureActivity.showEmptyFragment();
                knitTemperatureActivity.hideNonEmptyFragment();
                knitTemperatureActivity.refreshTitleBar(false);
                knitTemperatureActivity.h.setVisibility(knitTemperatureActivity.g ? 0 : 8);
            }
            if (knitTemperatureActivity.e == 0) {
                LogUtil.a("Knit_TemperatureActivity", "reset start time");
                knitTemperatureActivity.e = startTime;
                bundle.putLong("key_bundle_health_last_data_time", startTime);
                knitTemperatureActivity.onBundleArrived(bundle);
            }
        }
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        k();
        super.onResume();
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void onKnitPageSelected(int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        lmf.d().c(this.f27574c.getApplicationContext(), AnalyticsValue.TEMPERATURE_SWITCH_RANGE_2060075.value(), map, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1001 || i2 == 0) {
            return;
        }
        o();
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
