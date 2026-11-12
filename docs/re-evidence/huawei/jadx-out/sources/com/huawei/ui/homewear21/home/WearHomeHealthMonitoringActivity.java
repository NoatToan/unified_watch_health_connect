package com.huawei.ui.homewear21.home;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.basichealth.bloodpressure.BloodPressureSyncManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.LifeBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.ActivityReminder;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity;
import com.huawei.ui.device.activity.bloodoxygen.HighLandBloodOxygenSettingActivity;
import com.huawei.ui.device.activity.coresleep.CoreSleepSelectorActivity;
import com.huawei.ui.device.activity.emotionautomonitor.EmotionAutoMonitorActivity;
import com.huawei.ui.device.activity.pressautomonitor.PressAutoMonitorActivity;
import com.huawei.ui.device.activity.sleepbreathe.SleepBreatheActivity;
import com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.WearHomeHealthMonitoringActivity;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;
import defpackage.ddv;
import defpackage.dfd;
import defpackage.eey;
import defpackage.ets;
import defpackage.ipg;
import defpackage.lmf;
import defpackage.loj;
import defpackage.lxp;
import defpackage.lyv;
import defpackage.mbt;
import defpackage.mbu;
import defpackage.mbw;
import defpackage.mgb;
import defpackage.mgd;
import defpackage.mgg;
import defpackage.mgi;
import defpackage.mhs;
import defpackage.mim;
import defpackage.qhp;
import defpackage.qpx;
import defpackage.rfq;
import defpackage.thf;
import defpackage.thh;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class WearHomeHealthMonitoringActivity extends WearHomeBaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26227a;
    private final CompoundButton.OnCheckedChangeListener d = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homewear21.home.WearHomeHealthMonitoringActivity$$ExternalSyntheticLambda17
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f26228b.b(compoundButton, z);
        }
    };
    private String e;

    /* synthetic */ void b(CompoundButton compoundButton, final boolean z) {
        if (!this.mIsClickScreen) {
            LogUtil.j("WearHomeBaseActivity", "mIdleRemindListener return");
            return;
        }
        if (compoundButton == null) {
            return;
        }
        LogUtil.a("WearHomeBaseActivity", "Reminder is onCheckedChanged isChecked is ", Boolean.valueOf(z));
        compoundButton.setClickable(false);
        getItem(this.mGeneralList, 1).b(z);
        c(compoundButton, z);
        compoundButton.setOnClickListener(new View.OnClickListener() { // from class: tgn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WearHomeHealthMonitoringActivity.e(z, view);
            }
        });
    }

    public static /* synthetic */ void e(boolean z, View view) {
        LogUtil.a("WearHomeBaseActivity", "onClick: HOME_1010023");
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (!z) {
            map.put("status", "0");
        } else {
            map.put("status", "1");
        }
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010023.value(), map, 0);
    }

    private void c(final CompoundButton compoundButton, boolean z) {
        boolean zD = eey.d(this.mCurrentDeviceInfo, 154);
        ReleaseLogUtil.d("R_WearHomeHealthMonitoringActivity", "setActivityReminder isSupportCircleReminderSwitch :", Boolean.valueOf(zD));
        if (zD) {
            qhp.b("900200004", z);
            compoundButton.setClickable(true);
            return;
        }
        if (d("custom.activity_reminder", z)) {
            LogUtil.a("WearHomeBaseActivity", "is family mode");
        } else {
            mhs.a().setSwitchSetting("custom.activity_reminder", c(z), new IBaseResponseCallback() { // from class: tgk
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f49099c.d(compoundButton, i, obj);
                }
            });
        }
        ActivityReminder activityReminder = new ActivityReminder();
        activityReminder.setEnabled(z);
        byte[] bArrC = lxp.c(activityReminder);
        if (mgg.d("WearHomeBaseActivity") == null) {
            LogUtil.j("WearHomeBaseActivity", "sendSetSwitchSettingCmd getConnectDeviceInfo is null");
        } else {
            LogUtil.a("03", 1, "WearHomeBaseActivity", "sendSetSwitchSettingCmd enter", activityReminder);
            mhs.a().sendSetSwitchSettingCmd(bArrC, "", 7, 7);
        }
        if (mgi.d("WearHomeBaseActivity") == null) {
            LogUtil.j("WearHomeBaseActivity", "sendSetSwitchSettingCmd HwGetAw70DeviceInfoUtil.getConnectDeviceInfo is null");
        } else {
            LogUtil.a("03", 1, "WearHomeBaseActivity", "sendSetSwitchSettingCmd Aw70 enter", activityReminder);
            mhs.a().sendSetSwitchSettingCmd(bArrC, lyv.a(), 7, 7);
        }
    }

    public /* synthetic */ void d(CompoundButton compoundButton, int i, Object obj) {
        LogUtil.a("WearHomeBaseActivity", "setActivityReminder errorCode is ", Integer.valueOf(i), ",objectData is ", obj);
        if (i != 0) {
            runOnUiThread(new Runnable() { // from class: tgq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49105b.e();
                }
            });
        }
        compoundButton.setClickable(true);
    }

    public /* synthetic */ void e() {
        qpx.b(this.mContext, R.string.IDS_music_management_operation_failed);
    }

    private String c(boolean z) {
        ActivityReminder activityReminder = new ActivityReminder();
        activityReminder.setEnabled(z);
        return new Gson().toJson(activityReminder);
    }

    @Override // com.huawei.ui.homewear21.home.WearHomeBaseActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mCustomTitleBar.setTitleText(BaseApplication.getContext().getString(R.string.IDS_device_home_health_monitor));
    }

    @Override // com.huawei.ui.homewear21.home.WearHomeBaseActivity
    protected void initGeneralList() {
        this.mGeneralList.clear();
        if (this.mDeviceCapability.isSupportCoreSleep() && loj.c(58)) {
            addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.home_ic_list_accuratesleep, 23, 3), new thf(getString(R.string.IDS_fitness_core_sleep_title), "", getString(R.string.IDS_status_disabled)), new CompoundButton.OnCheckedChangeListener[0]);
            d(this.mGeneralList);
        }
        boolean zD = eey.d(this.mCurrentDeviceInfo, 154);
        if (this.mDeviceCapability.isActivityReminder() || zD) {
            l();
        }
        if (this.mDeviceCapability.isSupportContinueHeartRate()) {
            LogUtil.a("WearHomeBaseActivity", "prepare add press continue heart rate item");
            g();
        }
        if (this.mDeviceCapability.isSupportHeartRateEnable() && !this.mDeviceCapability.isSupportContinueHeartRate()) {
            LogUtil.a("WearHomeBaseActivity", "prepare add press cycle heart rate item");
            m();
        }
        boolean zD2 = eey.d(this.mCurrentDeviceInfo, 206);
        boolean zE = ets.e();
        if (this.mDeviceCapability.isSupportPressAutoMonitor() && (!zD2 || zE)) {
            LogUtil.a("WearHomeBaseActivity", "prepare add press auto monitor item");
            k();
        }
        if (zD2 && !zE) {
            LogUtil.a("WearHomeBaseActivity", "prepare add emotion auto monitor item");
            n();
        }
        if (this.mDeviceCapability.isSupportCycleBloodOxygenSwitch()) {
            f();
        }
        if (mbw.a()) {
            t();
        }
        if (BloodPressureSyncManager.b()) {
            h();
        }
        boolean zC = dfd.c(this.mCurrentDeviceInfo);
        LogUtil.a("WearHomeBaseActivity", "isSupportHighLand", Boolean.valueOf(zC));
        if (zC && ipg.e()) {
            LogUtil.a("WearHomeBaseActivity", "prepare add high land blood oxygen item");
            o();
        }
        boolean zB = mbt.a().b(this.mCurrentDeviceInfo);
        LogUtil.a("WearHomeBaseActivity", "device isSupportSleepBreathe：", Boolean.valueOf(zB));
        if (zB) {
            q();
        }
        d();
    }

    private void o() {
        addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.ic_blood_oxygen_high_land, 60, 3), new thf(getString(R.string.IDS_highland_health), "", getString(R.string.IDS_status_enabled)), new CompoundButton.OnCheckedChangeListener[0]);
        c();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        e(i, i2, intent);
        e(i);
    }

    private void e(int i, int i2, Intent intent) {
        String stringExtra;
        if (i == 23) {
            if (i2 != -1) {
                return;
            }
            if (intent == null) {
                stringExtra = "";
            } else {
                DeviceSettingsInteractors deviceSettingsInteractors = this.mDeviceInteractors;
                stringExtra = intent.getStringExtra("status");
            }
            LogUtil.a("WearHomeBaseActivity", "coreSleepButton:", stringExtra);
            DeviceSettingsInteractors deviceSettingsInteractors2 = this.mDeviceInteractors;
            if ("0".equals(stringExtra)) {
                setSettingItemRightText(23, this.mGeneralList, getString(R.string.IDS_status_disabled));
                return;
            } else {
                setSettingItemRightText(23, this.mGeneralList, getString(R.string.IDS_status_enabled));
                return;
            }
        }
        if (i != 24) {
            if (i == 35) {
                j(this.mGeneralList);
                return;
            }
            if (i == 68) {
                a(i2, intent);
                return;
            } else if (i == 329) {
                f(this.mGeneralList);
                return;
            } else {
                LogUtil.j("WearHomeBaseActivity", "handleReturnedResult default branch.");
                return;
            }
        }
        if (i2 != -1) {
            return;
        }
        DeviceSettingsInteractors deviceSettingsInteractors3 = this.mDeviceInteractors;
        String stringExtra2 = intent.getStringExtra("status");
        LogUtil.a("WearHomeBaseActivity", "heartRateButton:", stringExtra2);
        DeviceSettingsInteractors deviceSettingsInteractors4 = this.mDeviceInteractors;
        if ("0".equals(stringExtra2)) {
            this.f26227a = false;
            setSettingItemRightText(24, this.mGeneralList, getString(R.string.IDS_status_disabled));
        } else {
            this.f26227a = true;
            setSettingItemRightText(24, this.mGeneralList, getString(R.string.IDS_status_enabled));
        }
    }

    private void e(int i) {
        LogUtil.a("WearHomeBaseActivity", "onActivityResult processOtherActivityResult");
        if (i == 52) {
            e(this.mGeneralList);
            return;
        }
        if (i == 123) {
            LogUtil.a("WearHomeBaseActivity", "onActivityResult ID_SLEEP_BREATHE");
            q();
        } else if (i == 59) {
            h();
        } else {
            if (i == 60) {
                LogUtil.a("WearHomeBaseActivity", "onActivityResult SUPPORT_HIGH_LAND_BLOOD_OXYGEN");
                c();
                a();
                return;
            }
            LogUtil.j("WearHomeBaseActivity", "handleTemperature default branch.");
        }
    }

    @Override // com.huawei.ui.homewear21.home.WearHomeBaseActivity
    protected void setItemClick(int i) {
        if (i >= this.mGeneralList.size()) {
            return;
        }
        HashMap map = new HashMap(16);
        int iB = this.mGeneralList.get(i).b();
        if (iB == 1) {
            LogUtil.j("WearHomeBaseActivity", "DeviceSettingConstants.ID_DEVICE_SETTING_IDLE:");
            return;
        }
        if (iB == 35) {
            b();
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090022.value(), map, 0);
            return;
        }
        if (iB == 47) {
            startActivity(CycleBloodOxygenSettingActivity.class, 47);
            return;
        }
        if (iB == 52) {
            startActivity(TemperatureMonitoringActivity.class, 52);
            return;
        }
        if (iB == 78) {
            startActivity(EmotionAutoMonitorActivity.class, 78);
            return;
        }
        if (iB == 123) {
            s();
            return;
        }
        if (iB == 329) {
            startActivity(PressAutoMonitorActivity.class, 329);
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010050.value(), map, 0);
        } else if (iB == 23) {
            e(map);
        } else if (iB == 24) {
            b();
        } else {
            d(iB);
        }
    }

    private void d(int i) {
        if (i == 59) {
            BloodPressureUtil.c(new BaseResponseCallback<String>() { // from class: com.huawei.ui.homewear21.home.WearHomeHealthMonitoringActivity.4
                @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onResponse(int i2, String str) {
                    if (i2 == -1) {
                        LogUtil.j("WearHomeBaseActivity", "updOldBloodPressurePlan error ", str);
                    }
                    AppRouter.e(Uri.parse("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.health-data-subpage?h5pro=true&path=bloodPressureSettingNew")).e(268435456).b(BaseApplication.getContext());
                }
            });
            return;
        }
        if (i == 60) {
            startActivity(HighLandBloodOxygenSettingActivity.class, 60);
        } else if (i == 68) {
            r();
        } else {
            LogUtil.j("WearHomeBaseActivity", "setItemClickContinue else branch.");
        }
    }

    private void e(Map<String, Object> map) {
        Intent intent = new Intent(this.mContext, (Class<?>) CoreSleepSelectorActivity.class);
        intent.putExtra("device_id", this.mDeviceMac);
        intent.putExtra("coreSleepEnable", this.f26227a);
        startActivityForResult(intent, 23);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090005.value(), map, 0);
    }

    private void k() {
        addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.home_ic_list_press_auto_monitor, 329, 3), new thf(getString(R.string.IDS_press_auto_monitor), "", getString(R.string.IDS_status_enabled)), new CompoundButton.OnCheckedChangeListener[0]);
        f(this.mGeneralList);
    }

    private void n() {
        addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.home_ic_list_press_auto_monitor, 78, 3), new thf(getString(R.string.IDS_emotion_auto_monitor), "", getString(R.string.IDS_status_enabled)), new CompoundButton.OnCheckedChangeListener[0]);
        h(this.mGeneralList);
    }

    private void c() {
        mhs.a().getSwitchSetting("highland.blood.oxygen.switch", new IBaseResponseCallback() { // from class: tgw
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f49111a.a(i, obj);
            }
        });
    }

    public /* synthetic */ void a(int i, Object obj) {
        String str;
        LogUtil.a("WearHomeBaseActivity", "initHighLandItem errorCode: ", Integer.valueOf(i));
        if (i == 0 && (obj instanceof String)) {
            str = (String) obj;
        } else {
            str = "0";
        }
        final String strA = a(str);
        LogUtil.a("WearHomeBaseActivity", "showStatus high land:", strA);
        runOnUiThread(new Runnable() { // from class: tgo
            @Override // java.lang.Runnable
            public final void run() {
                this.f49102b.e(strA);
            }
        });
    }

    public /* synthetic */ void e(String str) {
        getItem(this.mGeneralList, 60).a(str);
        refreshGeneralDataAdapter();
    }

    private void f(final List<rfq> list) {
        mhs.a().getSwitchSetting("press_auto_monitor_switch_status", new IBaseResponseCallback() { // from class: tgm
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.e(list, i, obj);
            }
        });
    }

    public /* synthetic */ void e(final List list, int i, Object obj) {
        final String string;
        LogUtil.a("WearHomeBaseActivity", "showPressItem errorCode: ", Integer.valueOf(i), " ; objectData: ", obj);
        boolean z = (i == 0 && (obj instanceof String)) ? !"false".equals((String) obj) : false;
        LogUtil.a("WearHomeBaseActivity", "showPressItem isEnable: ", Boolean.valueOf(z));
        if (z) {
            string = getString(R.string.IDS_status_enabled);
        } else {
            string = getString(R.string.IDS_status_disabled);
        }
        runOnUiThread(new Runnable() { // from class: tgt
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a(list, string);
            }
        });
    }

    public /* synthetic */ void a(List list, String str) {
        getItem(list, 329).a(str);
        refreshGeneralDataAdapter();
    }

    /* JADX INFO: renamed from: com.huawei.ui.homewear21.home.WearHomeHealthMonitoringActivity$1, reason: invalid class name */
    public class AnonymousClass1 implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f26229b;

        AnonymousClass1(List list) {
            this.f26229b = list;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i == 0 && (obj instanceof String)) {
                final String strA = WearHomeHealthMonitoringActivity.this.a((String) obj);
                LogUtil.a("WearHomeBaseActivity", "showEmotionItem howStatus :", strA);
                WearHomeHealthMonitoringActivity wearHomeHealthMonitoringActivity = WearHomeHealthMonitoringActivity.this;
                final List list = this.f26229b;
                wearHomeHealthMonitoringActivity.runOnUiThread(new Runnable() { // from class: thc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.e(list, strA);
                    }
                });
            }
        }

        public /* synthetic */ void e(List list, String str) {
            WearHomeHealthMonitoringActivity.this.getItem(list, 78).a(str);
            WearHomeHealthMonitoringActivity.this.refreshGeneralDataAdapter();
        }
    }

    private void h(List<rfq> list) {
        mgd.b(new LifeBaseResponseCallback(this, new AnonymousClass1(list)));
    }

    private void f() {
        addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.ic_blood_oxygen, 47, 3), new thf(getString(R.string.IDS_blood_oxygen_switch), "", getString(R.string.IDS_status_enabled)), new CompoundButton.OnCheckedChangeListener[0]);
        a();
    }

    private void a() {
        if (mgb.d(this.mDeviceMac) == 2) {
            String strE = SharedPreferenceManager.e(this.mContext, "100", "custom.blood.oxygen.switch");
            LogUtil.a("WearHomeBaseActivity", "initBloodOxygenItem is:", strE);
            getItem(this.mGeneralList, 47).a(a(strE));
            refreshGeneralDataAdapter();
            return;
        }
        mhs.a().getSwitchSetting("custom.blood.oxygen.switch", new IBaseResponseCallback() { // from class: tha
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.b(i, obj);
            }
        });
    }

    public /* synthetic */ void b(int i, Object obj) {
        String str;
        LogUtil.a("WearHomeBaseActivity", "initBloodOxygenItem errorCode: ", Integer.valueOf(i));
        if (i == 0 && (obj instanceof String)) {
            str = (String) obj;
        } else {
            str = "0";
        }
        final String strA = a(str);
        LogUtil.a("WearHomeBaseActivity", "showStatus", strA);
        runOnUiThread(new Runnable() { // from class: tgz
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b(strA);
            }
        });
    }

    public /* synthetic */ void b(String str) {
        getItem(this.mGeneralList, 47).a(str);
        refreshGeneralDataAdapter();
    }

    private void m() {
        addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.ic_continue_heart, 24, 3), new thf(getString(R.string.IDS_settings_continue_HeartRate_switch), "", getString(R.string.IDS_status_disabled)), new CompoundButton.OnCheckedChangeListener[0]);
        b(this.mGeneralList);
    }

    private void b(final List<rfq> list) {
        if (mgb.d(this.mDeviceMac) == 2) {
            String strE = SharedPreferenceManager.e(this.mContext, "102", "heart_rate_button");
            LogUtil.a("WearHomeBaseActivity", "changeHeartRateSwitch familyStatus is:", strE);
            getItem(list, 24).a(a(strE));
            refreshGeneralDataAdapter();
            return;
        }
        mhs.a().getSwitchSetting("heart_rate_button", new IBaseResponseCallback() { // from class: tgh
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.b(list, i, obj);
            }
        });
    }

    public /* synthetic */ void b(final List list, int i, Object obj) {
        final String string;
        LogUtil.a("WearHomeBaseActivity", "changeHeartRateSwitch errorCode is ", Integer.valueOf(i));
        final boolean enable = false;
        if (i == 0 && (obj instanceof String)) {
            enable = setEnable(i, (String) obj, false);
        }
        LogUtil.a("WearHomeBaseActivity", "changeHeartRateSwitch isEnable is ", Boolean.valueOf(enable));
        if (enable) {
            string = getString(R.string.IDS_status_enabled);
        } else {
            string = getString(R.string.IDS_status_disabled);
        }
        runOnUiThread(new Runnable() { // from class: tgy
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a(list, string, enable);
            }
        });
    }

    public /* synthetic */ void a(List list, String str, boolean z) {
        getItem(list, 24).a(str);
        refreshGeneralDataAdapter();
        e(z);
    }

    private void g() {
        addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.ic_continue_heart, 35, 3), new thf(getString(R.string.IDS_settings_continue_HeartRate_switch), "", getString(R.string.IDS_status_enabled)), new CompoundButton.OnCheckedChangeListener[0]);
        j(this.mGeneralList);
    }

    private void j(final List<rfq> list) {
        if (mgb.d(this.mDeviceMac) == 2) {
            String strE = SharedPreferenceManager.e(this.mContext, "101", "continue_heart_rate");
            LogUtil.a("WearHomeBaseActivity", "showContinueHearItem familyStatus is:", strE);
            getItem(list, 35).a(a(strE));
            refreshGeneralDataAdapter();
            return;
        }
        mhs.a().getSwitchSetting("continue_heart_rate", new IBaseResponseCallback() { // from class: thd
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f49121a.c(list, i, obj);
            }
        });
    }

    public /* synthetic */ void c(final List list, int i, Object obj) {
        final String string;
        LogUtil.a("WearHomeBaseActivity", "showContinueHearItem errorCode is ", Integer.valueOf(i));
        final boolean enable = false;
        if (i == 0 && (obj instanceof String)) {
            enable = setEnable(i, (String) obj, false);
        }
        LogUtil.a("WearHomeBaseActivity", "showContinueHearItem isEnable is ", Boolean.valueOf(enable));
        if (enable) {
            string = getString(R.string.IDS_status_enabled);
        } else {
            string = getString(R.string.IDS_status_disabled);
        }
        runOnUiThread(new Runnable() { // from class: thb
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c(list, string, enable);
            }
        });
    }

    public /* synthetic */ void c(List list, String str, boolean z) {
        getItem(list, 35).a(str);
        refreshGeneralDataAdapter();
        e(z);
    }

    private void e(boolean z) {
        if (!mbw.a()) {
            LogUtil.a("WearHomeBaseActivity", "checkTemperatureStatusByHeartRate isn't Sport Temperature.");
            return;
        }
        LogUtil.a("WearHomeBaseActivity", "checkTemperatureStatusByHeartRate isEnable : ", Boolean.valueOf(z));
        if (z) {
            return;
        }
        mbu.e().c();
    }

    private void e(List<rfq> list) {
        String string;
        if (Utils.o()) {
            int iN = CommonUtil.n(this, mim.d("continuous_temp_monitoring"));
            if (iN == 1) {
                string = getString(R.string.IDS_status_enabled);
            } else {
                string = getString(R.string.IDS_status_disabled);
            }
            LogUtil.a("WearHomeBaseActivity", "setTemperatureStatus isOpened is", Integer.valueOf(iN));
            getItem(list, 52).a(string);
            refreshGeneralDataAdapter();
        }
    }

    private void l() {
        LogUtil.a("WearHomeBaseActivity", "showReminderItem getIdleRemind");
        addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.home_ic_list_idlereminders, 1, 0), new thf(getString(R.string.IDS_settings_moving_remind), getString(R.string.IDS_btsetting_stand_alert_message), ""), this.d);
        boolean zD = eey.d(this.mCurrentDeviceInfo, 154);
        ReleaseLogUtil.d("R_WearHomeHealthMonitoringActivity", "showReminderItem isSupportCircleReminderSwitch :", Boolean.valueOf(zD));
        if (zD) {
            i();
        } else {
            if (c("custom.activity_reminder", 1)) {
                return;
            }
            mhs.a().getSwitchSetting("custom.activity_reminder", new IBaseResponseCallback() { // from class: tgs
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f49106c.c(i, obj);
                }
            });
        }
    }

    public /* synthetic */ void c(int i, Object obj) {
        final boolean z = true;
        if (i == 0 && (obj instanceof String)) {
            try {
                String strReplaceAll = (String) obj;
                if (strReplaceAll.contains(k.g)) {
                    LogUtil.a("WearHomeBaseActivity", "showReminderItem info contains enable");
                    strReplaceAll = strReplaceAll.replaceAll(k.g, "isEnable");
                }
                boolean zIsEnabled = ((ActivityReminder) new Gson().fromJson(strReplaceAll, ActivityReminder.class)).isEnabled();
                try {
                    LogUtil.a("WearHomeBaseActivity", "showReminderItem getActivityReminder ", Boolean.valueOf(zIsEnabled));
                    z = zIsEnabled;
                } catch (JsonSyntaxException unused) {
                    z = zIsEnabled;
                    LogUtil.e("WearHomeBaseActivity", "showReminderItem JsonSyntaxException");
                }
            } catch (JsonSyntaxException unused2) {
            }
        }
        runOnUiThread(new Runnable() { // from class: tgx
            @Override // java.lang.Runnable
            public final void run() {
                this.f49113b.b(z);
            }
        });
    }

    public /* synthetic */ void b(boolean z) {
        getItem(this.mGeneralList, 1).b(z);
        refreshGeneralDataAdapter();
    }

    private void i() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900200004");
        qhp.c(arrayList, new LifeBaseResponseCallback(this, new AnonymousClass3()));
    }

    /* JADX INFO: renamed from: com.huawei.ui.homewear21.home.WearHomeHealthMonitoringActivity$3, reason: invalid class name */
    public class AnonymousClass3 implements IBaseResponseCallback {
        AnonymousClass3() {
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            final boolean zEquals = obj instanceof HashMap ? "1".equals((String) ((HashMap) obj).get("900200004")) : true;
            ReleaseLogUtil.d("R_WearHomeHealthMonitoringActivity", "refreshReminderItemByCircleSwitch isEnable:", Boolean.valueOf(zEquals));
            WearHomeHealthMonitoringActivity.this.runOnUiThread(new Runnable() { // from class: the
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c(zEquals);
                }
            });
        }

        public /* synthetic */ void c(boolean z) {
            WearHomeHealthMonitoringActivity wearHomeHealthMonitoringActivity = WearHomeHealthMonitoringActivity.this;
            wearHomeHealthMonitoringActivity.getItem(wearHomeHealthMonitoringActivity.mGeneralList, 1).b(z);
            WearHomeHealthMonitoringActivity.this.refreshGeneralDataAdapter();
        }
    }

    private void h() {
        addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.home_ic_blood_pressure, 59, 3), new thf(getString(R.string.IDS_regular_blood_pressure_measure), "", ""), new CompoundButton.OnCheckedChangeListener[0]);
    }

    private void d(final List<rfq> list) {
        mhs.a().getSwitchSetting("core_sleep_button", new IBaseResponseCallback() { // from class: tgu
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.a(list, i, obj);
            }
        });
    }

    public /* synthetic */ void a(final List list, int i, Object obj) {
        final String string;
        LogUtil.a("WearHomeBaseActivity", "changeSleepSwitch errorCode is ", Integer.valueOf(i));
        this.f26227a = false;
        if (i == 0 && (obj instanceof String)) {
            this.f26227a = setEnable(i, (String) obj, false);
        }
        LogUtil.a("WearHomeBaseActivity", "changeSleepSwitch isEnable is ", Boolean.valueOf(this.f26227a));
        if (this.f26227a) {
            string = getString(R.string.IDS_status_enabled);
        } else {
            string = getString(R.string.IDS_status_disabled);
        }
        runOnUiThread(new Runnable() { // from class: tgp
            @Override // java.lang.Runnable
            public final void run() {
                this.f49104c.c(list, string);
            }
        });
    }

    public /* synthetic */ void c(List list, String str) {
        setSettingItemRightText(23, list, str);
        refreshGeneralDataAdapter();
    }

    private void t() {
        String string;
        if (Utils.o()) {
            string = getString(R.string.IDS_continuous_monitoring_skins);
        } else if (mbw.d()) {
            string = getString(R.string.IDS_temp_slightly_upper_remind);
        } else {
            string = getString(R.string.IDS_temp_monitoring);
        }
        addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.ic_temperature, 52, 3), new thf(string, "", ""), new CompoundButton.OnCheckedChangeListener[0]);
        e(this.mGeneralList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if ("1".equals(str)) {
            return getString(R.string.IDS_status_enabled);
        }
        return getString(R.string.IDS_status_disabled);
    }

    private boolean c(String str, int i) {
        if (mgb.d(this.mDeviceMac) != 2) {
            return false;
        }
        String strE = SharedPreferenceManager.e(this.mContext, String.valueOf(10008), str);
        getItem(this.mGeneralList, i).b(TextUtils.isEmpty(strE) ? true : Boolean.parseBoolean(strE));
        refreshGeneralDataAdapter();
        return true;
    }

    private boolean d(String str, boolean z) {
        if (mgb.d(this.mDeviceMac) != 2) {
            return false;
        }
        SharedPreferenceManager.e(this.mContext, String.valueOf(10008), str, Boolean.toString(z), null);
        return true;
    }

    private void s() {
        Intent intent = new Intent(this.mContext, (Class<?>) SleepBreatheActivity.class);
        intent.putExtra("SleepBreatheEnable", this.e);
        startActivityForResult(intent, 123);
    }

    private void q() {
        addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.ic_sleep_breathe_nmpa, 123, 3), new thf(getString(mbt.a().b() ? R.string.IDS_sleep_breathe_banner_title_nmpa : R.string.IDS_sleep_breathe_banner_title), "", getString(R.string.IDS_status_enabled)), new CompoundButton.OnCheckedChangeListener[0]);
        a(this.mGeneralList);
    }

    private void a(final List<rfq> list) {
        mhs.a().getSwitchSetting("sleep_breathe_key", new IBaseResponseCallback() { // from class: tgi
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.d(list, i, obj);
            }
        });
    }

    public /* synthetic */ void d(final List list, int i, Object obj) {
        LogUtil.a("WearHomeBaseActivity", "changeSleepBreatheSwitch errorCode: ", Integer.valueOf(i));
        this.e = "false";
        if (i == 0 && (obj instanceof String)) {
            this.e = (String) obj;
            if ("1".equals(obj)) {
                this.e = "true";
            }
        }
        mbt.a().d(this.e);
        runOnUiThread(new Runnable() { // from class: tgv
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c(list);
            }
        });
    }

    public /* synthetic */ void c(List list) {
        setSettingItemRightText(123, list, getString("true".equals(this.e) ? R.string.IDS_status_enabled : R.string.IDS_status_disabled));
        refreshGeneralDataAdapter();
    }

    private void d() {
        boolean zD = eey.d(this.mCurrentDeviceInfo, 114);
        LogUtil.a("WearHomeBaseActivity", "addMenstrualPredictItem isSupportMenstrualPredict: ", Boolean.valueOf(zD));
        if (zD) {
            String strE = SharedPreferenceManager.e(this.mContext, Integer.toString(10100), "PHYSIOLOGICAL_SHOW_STATE_KEY");
            LogUtil.a("WearHomeBaseActivity", "addMenstrualPredictItem showState: ", strE);
            if ("false".equals(strE)) {
                return;
            }
            addGeneralSettingItem(this.mIsConnected, new thh(R.drawable.ic_menstrual_predict, 68, 3), new thf(getString(R.string.IDS_menstrual_predict), "", getString(R.string.IDS_status_disabled)), new CompoundButton.OnCheckedChangeListener[0]);
            j();
        }
    }

    private void j() {
        mhs.a().getSwitchSetting("menstrual_predict_switch", new IBaseResponseCallback() { // from class: tgr
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.d(i, obj);
            }
        });
    }

    public /* synthetic */ void d(int i, Object obj) {
        String str;
        LogUtil.a("WearHomeBaseActivity", "initMenstrualPredictStatus errorCode: ", Integer.valueOf(i));
        if (i == 0 && (obj instanceof String)) {
            str = (String) obj;
        } else {
            str = "0";
        }
        final String strA = a(str);
        LogUtil.a("WearHomeBaseActivity", "initMenstrualPredictStatus showStatus: ", strA);
        runOnUiThread(new Runnable() { // from class: tgl
            @Override // java.lang.Runnable
            public final void run() {
                this.f49100b.d(strA);
            }
        });
    }

    public /* synthetic */ void d(String str) {
        getItem(this.mGeneralList, 68).a(str);
        refreshGeneralDataAdapter();
    }

    private void a(int i, Intent intent) {
        String stringExtra;
        LogUtil.a("WearHomeBaseActivity", "showMenstrualPredictResultStatus resultCode: ", Integer.valueOf(i));
        if (i != -1) {
            return;
        }
        if (intent == null) {
            stringExtra = "";
        } else {
            stringExtra = intent.getStringExtra("menstrualPredictResultStatus");
        }
        LogUtil.a("WearHomeBaseActivity", "showMenstrualPredictResultStatus switchStatus: ", stringExtra);
        if ("1".equals(stringExtra)) {
            setSettingItemRightText(68, this.mGeneralList, getString(R.string.IDS_status_enabled));
        } else {
            setSettingItemRightText(68, this.mGeneralList, getString(R.string.IDS_status_disabled));
        }
    }

    private void r() {
        AppRouter.e(Uri.parse("huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.cycle-calendar?h5pro=true&path=Settings&from=deviceTab&type=dual")).i();
    }

    private void b() {
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        ddv ddvVarB = ddv.b();
        builder.addPath("#/healthCheck/continuousHeartRate?isHeartRate=true");
        ddvVarB.loadH5ProApp(BaseApplication.getContext(), "com.huawei.health.h5.dm-ccbk", builder);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
