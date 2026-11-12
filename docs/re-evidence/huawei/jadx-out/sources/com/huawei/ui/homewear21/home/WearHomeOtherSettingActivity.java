package com.huawei.ui.homewear21.home;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import androidx.media3.extractor.ts.TsExtractor;
import com.huawei.datatype.DataDeviceAvoidDisturbInfo;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.ScreenshotResponse;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.operation.h5pro.jsmodules.device.DeviceManagerService;
import com.huawei.operation.h5pro.jsmodules.gesture.SmartGestureConstant;
import com.huawei.operation.h5pro.jsmodules.gesture.SmartGestureUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.device.activity.donotdisturb.NoDisturbSettingActivity;
import com.huawei.ui.device.activity.doublephone.DoublePhoneActivity;
import com.huawei.ui.device.activity.leftrighthand.LeftRightHandSettingsActivity;
import com.huawei.ui.device.activity.onelevelmenu.OneLevelMenuManagerActivity;
import com.huawei.ui.device.interactors.NotificationPushInteractor;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.WearHomeOtherSettingActivity;
import com.huawei.up.model.UserInfomation;
import defpackage.coq;
import defpackage.ddv;
import defpackage.eey;
import defpackage.fej;
import defpackage.ffv;
import defpackage.lmf;
import defpackage.lvb;
import defpackage.lzl;
import defpackage.mgb;
import defpackage.mgg;
import defpackage.mgm;
import defpackage.mhs;
import defpackage.qhq;
import defpackage.qpx;
import defpackage.qre;
import defpackage.rcv;
import defpackage.rfq;
import defpackage.tfn;
import defpackage.thf;
import defpackage.thh;
import defpackage.top;
import defpackage.tql;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeOtherSettingActivity extends WearHomeBaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NotificationPushInteractor f26244a;
    private Handler j = new d(this);
    private final BroadcastReceiver h = new BroadcastReceiver() { // from class: com.huawei.ui.homewear21.home.WearHomeOtherSettingActivity.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("WearHomeOtherSettingActivity", "intent is null");
                return;
            }
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                LogUtil.j("WearHomeOtherSettingActivity", "mSmartGestureBroadCast intent is null");
                return;
            }
            LogUtil.a("WearHomeOtherSettingActivity", "mSmartGestureBroadCast intent is ", action);
            if (!SmartGestureConstant.ACTION_SMART_GESTURE_STATUS.equals(action)) {
                LogUtil.a("WearHomeOtherSettingActivity", "mSmartGestureBroadCast action do not match");
                return;
            }
            if (coq.d(WearHomeOtherSettingActivity.this.mGeneralList)) {
                LogUtil.a("WearHomeOtherSettingActivity", "mSmartGestureBroadCast mGeneralList isEmpty");
                return;
            }
            for (int i = 0; i < WearHomeOtherSettingActivity.this.mGeneralList.size(); i++) {
                rfq rfqVar = WearHomeOtherSettingActivity.this.mGeneralList.get(i);
                if (132 == rfqVar.b()) {
                    rfqVar.a(WearHomeOtherSettingActivity.this.c());
                    if (WearHomeOtherSettingActivity.this.mWearHomeGeneralAdapter != null) {
                        WearHomeOtherSettingActivity.this.mWearHomeGeneralAdapter.notifyItemChanged(i);
                        return;
                    }
                    return;
                }
            }
        }
    };
    private final CompoundButton.OnCheckedChangeListener e = new AnonymousClass4();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CompoundButton.OnCheckedChangeListener f26246c = new AnonymousClass2();
    private final CompoundButton.OnCheckedChangeListener d = new AnonymousClass3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CompoundButton.OnCheckedChangeListener f26245b = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homewear21.home.WearHomeOtherSettingActivity.5
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!WearHomeOtherSettingActivity.this.mIsClickScreen) {
                LogUtil.j("WearHomeOtherSettingActivity", "mMusicControllistener return");
                return;
            }
            LogUtil.a("WearHomeOtherSettingActivity", "MusicControl is onCheckedChanged isChecked is ", Boolean.valueOf(z));
            if (z && !WearHomeOtherSettingActivity.this.f26244a.e()) {
                WearHomeOtherSettingActivity.this.startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
            }
            WearHomeOtherSettingActivity wearHomeOtherSettingActivity = WearHomeOtherSettingActivity.this;
            wearHomeOtherSettingActivity.getItem(wearHomeOtherSettingActivity.mGeneralList, 34).b(z);
            lzl.a(BaseApplication.getContext()).c(z, true);
        }
    };

    /* JADX INFO: renamed from: com.huawei.ui.homewear21.home.WearHomeOtherSettingActivity$4, reason: invalid class name */
    public class AnonymousClass4 implements CompoundButton.OnCheckedChangeListener {
        AnonymousClass4() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(final CompoundButton compoundButton, final boolean z) {
            String str;
            if (!WearHomeOtherSettingActivity.this.mIsClickScreen) {
                LogUtil.j("WearHomeOtherSettingActivity", "mRotateSwitchScreenListener return");
                return;
            }
            if (compoundButton == null) {
                return;
            }
            LogUtil.a("WearHomeOtherSettingActivity", "mRotateSwitchScreenListener onCheckedChanged isChecked is ", Boolean.valueOf(z));
            compoundButton.setClickable(false);
            WearHomeOtherSettingActivity wearHomeOtherSettingActivity = WearHomeOtherSettingActivity.this;
            wearHomeOtherSettingActivity.getItem(wearHomeOtherSettingActivity.mGeneralList, 25).b(z);
            mhs.a().sendSetSwitchSettingCmd(z, WearHomeOtherSettingActivity.this.mDeviceMac, 1, 27, new IBaseResponseCallback() { // from class: com.huawei.ui.homewear21.home.WearHomeOtherSettingActivity.4.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("WearHomeOtherSettingActivity", "mRotateSwitchScreenListener errorCode: ", Integer.valueOf(i), " ; objectData: ", obj);
                    if (i != 0) {
                        qpx.b(WearHomeOtherSettingActivity.this.mContext, R.string.IDS_music_management_operation_failed);
                    }
                    compoundButton.setClickable(true);
                }
            });
            if (mgg.b(WearHomeOtherSettingActivity.this.mDeviceMac, "WearHomeOtherSettingActivity") != null) {
                if (z) {
                    str = "1";
                } else {
                    str = "0";
                }
                mhs.a().setSwitchSetting("rotate_switch_screen", str, null);
            } else {
                LogUtil.j("WearHomeOtherSettingActivity", "mRotateSwitchScreenListener deviceInfo is null");
            }
            compoundButton.setOnClickListener(new View.OnClickListener() { // from class: tiq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.b(z, view);
                }
            });
        }

        public /* synthetic */ void b(boolean z, View view) {
            LogUtil.a("WearHomeOtherSettingActivity", "onClick: HOME_1010045");
            WearHomeOtherSettingActivity.this.d(z, AnalyticsValue.HOME_1010045.value());
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.homewear21.home.WearHomeOtherSettingActivity$2, reason: invalid class name */
    public class AnonymousClass2 implements CompoundButton.OnCheckedChangeListener {
        AnonymousClass2() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(final CompoundButton compoundButton, final boolean z) {
            String str;
            if (!WearHomeOtherSettingActivity.this.mIsClickScreen) {
                LogUtil.j("WearHomeOtherSettingActivity", "mRotateWakeScreenListener return");
                return;
            }
            if (compoundButton == null) {
                return;
            }
            LogUtil.a("WearHomeOtherSettingActivity", "mRotateWakeScreenListener onCheckedChanged isChecked is ", Boolean.valueOf(z));
            compoundButton.setClickable(false);
            WearHomeOtherSettingActivity wearHomeOtherSettingActivity = WearHomeOtherSettingActivity.this;
            wearHomeOtherSettingActivity.getItem(wearHomeOtherSettingActivity.mGeneralList, 11).b(z);
            mhs.a().sendSetSwitchSettingCmd(z, WearHomeOtherSettingActivity.this.mDeviceMac, 1, 9, new IBaseResponseCallback() { // from class: com.huawei.ui.homewear21.home.WearHomeOtherSettingActivity.2.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("WearHomeOtherSettingActivity", "mRotateWakeScreenListener errorCode: ", Integer.valueOf(i), " ; objectData: ", obj);
                    if (i != 0) {
                        qpx.b(WearHomeOtherSettingActivity.this.mContext, R.string.IDS_music_management_operation_failed);
                    }
                    compoundButton.setClickable(true);
                }
            });
            if (!WearHomeOtherSettingActivity.this.e("auto_light_screen", z)) {
                if (mgg.b(WearHomeOtherSettingActivity.this.mDeviceMac, "WearHomeOtherSettingActivity") != null) {
                    if (z) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    mhs.a().setSwitchSetting("auto_light_screen", str, null);
                } else {
                    LogUtil.j("WearHomeOtherSettingActivity", "mRotateWakeScreenListener deviceInfo is null");
                }
            }
            compoundButton.setOnClickListener(new View.OnClickListener() { // from class: tis
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.c(z, view);
                }
            });
        }

        public /* synthetic */ void c(boolean z, View view) {
            LogUtil.a("WearHomeOtherSettingActivity", "onClick: HOME_1010025");
            WearHomeOtherSettingActivity.this.d(z, AnalyticsValue.HOME_1010025.value());
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.homewear21.home.WearHomeOtherSettingActivity$3, reason: invalid class name */
    public class AnonymousClass3 implements CompoundButton.OnCheckedChangeListener {
        AnonymousClass3() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(final CompoundButton compoundButton, final boolean z) {
            if (!WearHomeOtherSettingActivity.this.mIsClickScreen) {
                LogUtil.j("WearHomeOtherSettingActivity", "mBluetoothOffAlertListener return");
                return;
            }
            if (compoundButton == null) {
                return;
            }
            LogUtil.a("WearHomeOtherSettingActivity", "mBluetoothOffAlertListener onCheckedChanged isChecked is ", Boolean.valueOf(z));
            compoundButton.setClickable(false);
            WearHomeOtherSettingActivity wearHomeOtherSettingActivity = WearHomeOtherSettingActivity.this;
            wearHomeOtherSettingActivity.getItem(wearHomeOtherSettingActivity.mGeneralList, 2).b(z);
            WearHomeOtherSettingActivity.this.mDeviceInteractors.d(WearHomeOtherSettingActivity.this.mDeviceMac, z, new IBaseResponseCallback() { // from class: com.huawei.ui.homewear21.home.WearHomeOtherSettingActivity.3.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i != 0) {
                        qpx.b(WearHomeOtherSettingActivity.this.mContext, R.string.IDS_music_management_operation_failed);
                    }
                    compoundButton.setClickable(true);
                    LogUtil.a("WearHomeOtherSettingActivity", "mBluetoothOffAlertListener errorCode：", Integer.valueOf(i), ",objectData is ", obj);
                }
            });
            compoundButton.setOnClickListener(new View.OnClickListener() { // from class: tiw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.e(z, view);
                }
            });
        }

        public /* synthetic */ void e(boolean z, View view) {
            LogUtil.a("WearHomeOtherSettingActivity", "onClick: HOME_1010024");
            WearHomeOtherSettingActivity.this.d(z, AnalyticsValue.HOME_1010024.value());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z, String str) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (!z) {
            map.put("status", "0");
        } else {
            map.put("status", "1");
        }
        lmf.d().c(BaseApplication.getContext(), str, map, 0);
    }

    @Override // com.huawei.ui.homewear21.home.WearHomeBaseActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("WearHomeOtherSettingActivity", "onCreate");
        this.mCustomTitleBar.setTitleText(BaseApplication.getContext().getString(R.string.IDS_device_wear_home_device_setting));
        this.f26244a = new NotificationPushInteractor(this.mApplicationContext);
        SmartGestureUtil.registerLocalBroadcast(this.h);
    }

    @Override // com.huawei.ui.homewear21.home.WearHomeBaseActivity
    protected void initGeneralList() {
        this.mGeneralList.clear();
        if (this.mDeviceCapability.isAvoidDisturb()) {
            addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.home_ic_list_donotdisturb, 5, 3), new thf(getString(R.string.IDS_setting_disturb_title), "", ""), new CompoundButton.OnCheckedChangeListener[0]);
            l();
            refreshGeneralDataAdapter();
        }
        if (this.mDeviceCapability.isSupportPhonesInfo() && this.mDeviceCapability.isSupportNotifyDeviceBroadCast()) {
            addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.home_ic_list_phone_two, 37, 3), new thf(getString(R.string.IDS_hw_health_double_phone_menu_title), "", ""), new CompoundButton.OnCheckedChangeListener[0]);
        }
        boolean z = this.mDeviceCapability.isSupportMusicControl() && !this.mDeviceCapability.isSupportMusicInfoList();
        LogUtil.a("WearHomeOtherSettingActivity", "isSupportMusicControl is ", Boolean.valueOf(z));
        if (z) {
            g();
        }
        if (this.mDeviceCapability.isBluetoothOffAlert()) {
            h();
        }
        if (this.mDeviceCapability.isSupportOneLevelMenu()) {
            addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.home_ic_list_one_level_menu, 28, 3), new thf(getString(R.string.IDS_settings_one_level_menu_settings_title), "", ""), new CompoundButton.OnCheckedChangeListener[0]);
        }
        if (this.mDeviceCapability.isSupportAutoLightScreen()) {
            i();
        }
        if (this.mDeviceCapability.isSupportRotateSwitchScreen()) {
            j();
        }
        if (this.mDeviceCapability.isSupportLeftRightHandWearMode()) {
            f();
        }
        if (top.a()) {
            addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.home_ic_list_data_sync, 50, 3), new thf(getString(R.string.IDS_settings_data_sync_app_management), "", ""), new CompoundButton.OnCheckedChangeListener[0]);
        }
        a();
        m();
        o();
        k();
    }

    private void o() {
        boolean zD = eey.d(this.mCurrentDeviceInfo, 289);
        boolean zK = Utils.k();
        ReleaseLogUtil.d("DEVMGR_WearHomeOtherSettingActivity", "showScreenShotSettingItem isSupport: ", Boolean.valueOf(zD), " isOverseaNoCloud:", Boolean.valueOf(zK));
        if (zK || !zD) {
            return;
        }
        List<ScreenshotResponse.TypeInfo> listB = mgm.d().b();
        if (coq.d(listB)) {
            return;
        }
        if (listB.stream().filter(new Predicate() { // from class: tim
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.d.a((ScreenshotResponse.TypeInfo) obj);
            }
        }).findFirst().orElse(null) == null) {
            ReleaseLogUtil.d("DEVMGR_WearHomeOtherSettingActivity", "showScreenShotSettingItem info is null");
        } else {
            addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.ic_screenshot_setting, TsExtractor.TS_STREAM_TYPE_E_AC3, 3), new thf(getString(R.string.IDS_settings_screenshot_setting), "", ""), new CompoundButton.OnCheckedChangeListener[0]);
            tql.a(new IBaseResponseCallback() { // from class: tip
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f49160a.a(i, obj);
                }
            });
        }
    }

    public /* synthetic */ boolean a(ScreenshotResponse.TypeInfo typeInfo) {
        return typeInfo != null && this.mCurrentDeviceInfo.getDeviceModel().equals(typeInfo.getDeviceType());
    }

    public /* synthetic */ void a(int i, Object obj) {
        int i2;
        ReleaseLogUtil.d("DEVMGR_WearHomeOtherSettingActivity", "showScreenShotSettingItem getSwitchStatus object: ", obj);
        if (obj instanceof String) {
            if ("1".equals((String) obj)) {
                i2 = R.string.IDS_settings_screenshot_setting_display_watch_body;
            } else {
                i2 = R.string.IDS_settings_screenshot_setting_do_not_display_watch_body;
            }
            final String strF = qre.f(i2);
            runOnUiThread(new Runnable() { // from class: tid
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.e(strF);
                }
            });
            return;
        }
        ReleaseLogUtil.e("DEVMGR_WearHomeOtherSettingActivity", "showScreenShotSettingItem object is not String");
    }

    public /* synthetic */ void e(String str) {
        getItem(this.mGeneralList, TsExtractor.TS_STREAM_TYPE_E_AC3).a(str);
        refreshGeneralDataAdapter();
    }

    private void k() {
        DeviceFeatureSupportApi deviceFeatureSupportApi = (DeviceFeatureSupportApi) Services.d("Module_Device_Feature", DeviceFeatureSupportApi.class);
        boolean z = deviceFeatureSupportApi != null && deviceFeatureSupportApi.isSupportWheelchair(this.mCurrentDeviceInfo);
        LogUtil.a("WearHomeOtherSettingActivity", "showWheelchairItem supportCapability: ", Boolean.valueOf(z));
        if (z) {
            final AtomicReference<Boolean> atomicReference = new AtomicReference<>();
            addGeneralSettingItem(true, new thh(R.mipmap.home_ic_list_wheelchair, 134, 0), new thf(getString(R.string.IDS_settings_wheelchair_mode), getString(R.string.IDS_settings_wheelchair_mode_message), ""), new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homewear21.home.WearHomeOtherSettingActivity.10
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    LogUtil.a("WearHomeOtherSettingActivity", "onCheckedChanged isChecked:", Boolean.valueOf(z2), " wheelchairModeSwitch:", atomicReference.get());
                    if (Objects.equals(atomicReference.get(), Boolean.valueOf(z2))) {
                        return;
                    }
                    atomicReference.set(Boolean.valueOf(z2));
                    String strE = ffv.e("wheelchairSwitch", z2 ? "1" : "0");
                    LogUtil.a("WearHomeOtherSettingActivity", "WheelchairItem onCheckedChanged configData:", strE);
                    qhq.d("9005", "900500039", strE, new HiDataOperateListener() { // from class: com.huawei.ui.homewear21.home.WearHomeOtherSettingActivity.10.3
                        @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                        public void onResult(int i, Object obj) {
                            LogUtil.a("WearHomeOtherSettingActivity", "saveSampleConfig errorCode: ", Integer.valueOf(i), ", object: ", obj);
                        }
                    }, System.currentTimeMillis());
                }
            });
            c(atomicReference);
        }
    }

    private void c(AtomicReference<Boolean> atomicReference) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900500039");
        LogUtil.a("WearHomeOtherSettingActivity", "getWheelchairModeSwitch query CONFIG_ID_WHEELCHAIR_MODE_SWITCH");
        qhq.b("9005", arrayList, new AnonymousClass7(atomicReference));
    }

    /* JADX INFO: renamed from: com.huawei.ui.homewear21.home.WearHomeOtherSettingActivity$7, reason: invalid class name */
    public class AnonymousClass7 implements HiDataReadResultListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f26259b;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        AnonymousClass7(AtomicReference atomicReference) {
            this.f26259b = atomicReference;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            ReleaseLogUtil.d("DEVMGR_WearHomeOtherSettingActivity", "getWheelchairModeSwitch onResult errorCode: ", Integer.valueOf(i), ", data: ", obj);
            if (coq.e(obj, HiSampleConfig.class)) {
                List list = (List) obj;
                if (!coq.d(list)) {
                    HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(0);
                    ReleaseLogUtil.d("DEVMGR_WearHomeOtherSettingActivity", "WheelchairMode switch is ", hiSampleConfig.getConfigData());
                    final boolean zEquals = "1".equals(ffv.a(hiSampleConfig.getConfigData(), "wheelchairSwitch"));
                    WearHomeOtherSettingActivity wearHomeOtherSettingActivity = WearHomeOtherSettingActivity.this;
                    final AtomicReference atomicReference = this.f26259b;
                    wearHomeOtherSettingActivity.runOnUiThread(new Runnable() { // from class: tit
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f49165b.e(atomicReference, zEquals);
                        }
                    });
                    return;
                }
            }
            LogUtil.j("WearHomeOtherSettingActivity", "getWheelchairModeSwitch isListTypeMatch false or list is empty");
        }

        public /* synthetic */ void e(AtomicReference atomicReference, boolean z) {
            if (atomicReference.get() != null) {
                LogUtil.a("WearHomeOtherSettingActivity", "getWheelchairModeSwitch wheelchairModeSwitch.get() != null");
                return;
            }
            atomicReference.set(Boolean.valueOf(z));
            WearHomeOtherSettingActivity wearHomeOtherSettingActivity = WearHomeOtherSettingActivity.this;
            wearHomeOtherSettingActivity.getItem(wearHomeOtherSettingActivity.mGeneralList, 134).b(z);
            WearHomeOtherSettingActivity.this.refreshGeneralDataAdapter();
        }
    }

    private void m() {
        boolean zIsShowSmartGestureItem = SmartGestureUtil.isShowSmartGestureItem(this.mCurrentDeviceInfo);
        LogUtil.a("WearHomeOtherSettingActivity", "isShowSmartGestureItem: ", Boolean.valueOf(zIsShowSmartGestureItem));
        if (zIsShowSmartGestureItem) {
            addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.ic_setting_smart_gesture, UserInfomation.WEIGHT_DEFAULT_ENGLISH, 3), new thf(getString(R.string.IDS_settings_smart_gesture), "", c()), new CompoundButton.OnCheckedChangeListener[0]);
        }
    }

    private void a() {
        boolean zIsSupportEcgAuth = this.mDeviceCapability != null ? this.mDeviceCapability.isSupportEcgAuth() : false;
        boolean z = eey.d(this.mCurrentDeviceInfo, 106) && fej.a("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.ecgce");
        boolean zO = Utils.o();
        LogUtil.a("WearHomeOtherSettingActivity", "showAccessibilityItem isSupportEcgAuth:", Boolean.valueOf(zIsSupportEcgAuth), ", isSupportEcgAnalysis:", Boolean.valueOf(z), ", isOversea:", Boolean.valueOf(zO));
        if (z && zIsSupportEcgAuth && !zO) {
            addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.ic_setting_accessibility, 70, 3), new thf(getString(R.string.IDS_settings_accessibility), "", ""), new CompoundButton.OnCheckedChangeListener[0]);
        }
    }

    private void g() {
        addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.home_ic_list_music, 34, 1), new thf(getString(R.string.HomeDeviceCloud_IDS_Janus_music_control), "", ""), this.f26245b);
        boolean zD = lzl.a(BaseApplication.getContext()).d();
        getItem(this.mGeneralList, 34).b(zD);
        lzl.a(BaseApplication.getContext()).c(zD, false);
    }

    private void f() {
        addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.ic_home_peidaifangshi, 26, 3), new thf(getString(R.string.IDS_settings_wear_prefence), "", getString(R.string.IDS_WearPrefenc_left)), new CompoundButton.OnCheckedChangeListener[0]);
        d(this.mGeneralList);
    }

    private void d(final List<rfq> list) {
        mhs.a().getSwitchSetting("left_or_right_hand_wear_status", new IBaseResponseCallback() { // from class: tif
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f49149a.d(list, i, obj);
            }
        });
    }

    public /* synthetic */ void d(final List list, int i, Object obj) {
        final String string = getString(R.string.IDS_WearPrefenc_left);
        LogUtil.a("WearHomeOtherSettingActivity", "LEFT_OR_RIGHT_HAND_WEAR_STATUS errorCode: ", Integer.valueOf(i), " ; objectData: ", obj);
        if (i == 0 && (obj instanceof String) && "1".equals((String) obj)) {
            string = getString(R.string.IDS_WearPrefenc_right);
        }
        LogUtil.a("WearHomeOtherSettingActivity", "wearStatus: ", string);
        runOnUiThread(new Runnable() { // from class: tir
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(list, string);
            }
        });
    }

    public /* synthetic */ void a(List list, String str) {
        getItem(list, 26).a(str);
        refreshGeneralDataAdapter();
    }

    @Override // com.huawei.ui.homewear21.home.WearHomeBaseActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.mDeviceCapability == null) {
            LogUtil.j("WearHomeOtherSettingActivity", "onResume() mDeviceCapability is null return !");
        } else if (CommonUtil.at() && this.mDeviceCapability.isSupportSyncWifi()) {
            b();
        }
    }

    @Override // com.huawei.ui.homewear21.home.WearHomeBaseActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.j;
        if (handler != null) {
            handler.removeMessages(100);
        }
        SmartGestureUtil.unRegisterLocalBroadcast(this.h);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 5) {
            l();
            return;
        }
        if (i == 26) {
            d(this.mGeneralList);
            return;
        }
        if (i != 37) {
            LogUtil.j("WearHomeOtherSettingActivity", "onActivityResult else branch");
            return;
        }
        if (i2 != -1) {
            return;
        }
        if (this.mCurrentDeviceInfo == null) {
            LogUtil.j("WearHomeOtherSettingActivity", "mCurrentDeviceInfo is null.");
            return;
        }
        LogUtil.d("WearHomeOtherSettingActivity", "ready reconnect double phone");
        int deviceConnectState = this.mCurrentDeviceInfo.getDeviceConnectState();
        if (deviceConnectState == 2 || deviceConnectState == 1) {
            return;
        }
        LogUtil.a("WearHomeOtherSettingActivity", "begin connect in ui , name:", this.mCurrentDeviceInfo.getDeviceName());
        tfn.a().d(tfn.a().k(), this.mCurrentDeviceInfo.getDeviceIdentify());
    }

    @Override // com.huawei.ui.homewear21.home.WearHomeBaseActivity
    protected void setItemClick(int i) {
        LogUtil.a("WearHomeOtherSettingActivity", "setItemClick index: ", Integer.valueOf(i), ";size: ", Integer.valueOf(this.mGeneralList.size()));
        if (i >= this.mGeneralList.size()) {
            return;
        }
        HashMap map = new HashMap(16);
        int iB = this.mGeneralList.get(i).b();
        if (iB == 5) {
            LogUtil.a("WearHomeOtherSettingActivity", "startNoDisturbSettingActivity");
            Intent intent = new Intent(this, (Class<?>) NoDisturbSettingActivity.class);
            intent.putExtra("device_id", this.mDeviceMac);
            startActivityForResult(intent, 5);
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010029.value(), map, 0);
            return;
        }
        if (iB == 26) {
            LogUtil.a("WearHomeOtherSettingActivity", "startActivity LeftRightHandSettingsActivity");
            startActivity(LeftRightHandSettingsActivity.class, 26);
            return;
        }
        if (iB == 28) {
            LogUtil.a("WearHomeOtherSettingActivity", "OneLevelMenuManagerActivity");
            Intent intent2 = new Intent(this, (Class<?>) OneLevelMenuManagerActivity.class);
            intent2.putExtra("device_id", this.mDeviceMac);
            startActivity(intent2);
            return;
        }
        if (iB == 37) {
            startActivityForResult(new Intent(this, (Class<?>) DoublePhoneActivity.class), 37);
            return;
        }
        if (iB == 50) {
            Intent intent3 = new Intent(this, (Class<?>) WearHomeDataSyncSwitchActivity.class);
            intent3.putExtra("device_id", this.mDeviceMac);
            startActivity(intent3);
        } else if (iB == 132) {
            e();
        } else if (iB == 135) {
            tql.e(this.mCurrentDeviceInfo);
        } else {
            LogUtil.j("WearHomeOtherSettingActivity", "setItemClick else branch");
            e(iB);
        }
    }

    private void e(int i) {
        if (i == 70) {
            Intent intent = new Intent(this, (Class<?>) WearHomeAccessibilityActivity.class);
            intent.putExtra("device_id", this.mDeviceMac);
            startActivity(intent);
            return;
        }
        LogUtil.j("WearHomeOtherSettingActivity", "setItemClick else branch");
    }

    private void j() {
        addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.home_ic_list_switchscreen, 25, 1), new thf(getString(R.string.IDS_settings_screen_switch), "", ""), this.e);
        h(this.mGeneralList);
    }

    private void h(final List<rfq> list) {
        mhs.a().getSwitchSetting("rotate_switch_screen", new IBaseResponseCallback() { // from class: tie
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.a(list, i, obj);
            }
        });
    }

    public /* synthetic */ void a(final List list, int i, Object obj) {
        LogUtil.a("WearHomeOtherSettingActivity", "rotateSwitch errorCode: ", Integer.valueOf(i), " ; objectData: ", obj == null ? Constants.NULL : obj);
        final boolean z = (i == 0 && (obj instanceof String)) ? !"0".equals((String) obj) : false;
        LogUtil.a("WearHomeOtherSettingActivity", "rotateSwitch isEnable: ", Boolean.valueOf(z));
        runOnUiThread(new Runnable() { // from class: tig
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d(list, z);
            }
        });
    }

    public /* synthetic */ void d(List list, boolean z) {
        getItem(list, 25).b(z);
        refreshGeneralDataAdapter();
    }

    private void i() {
        addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.home_ic_list_awakescreen, 11, 1), new thf(getString(R.string.IDS_settings_auto_light_item), getString(R.string.IDS_btsetting_auto_light_message), ""), this.f26246c);
        a(this.mGeneralList);
    }

    private void a(final List<rfq> list) {
        if (b("auto_light_screen", 11)) {
            return;
        }
        mhs.a().getSwitchSetting("auto_light_screen", new IBaseResponseCallback() { // from class: tin
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.e(list, i, obj);
            }
        });
    }

    public /* synthetic */ void e(final List list, int i, Object obj) {
        ReleaseLogUtil.d("DEVMGR_WearHomeOtherSettingActivity", "lightScreenSwitch errorCode: ", Integer.valueOf(i), " ; objectData: ", obj);
        final boolean zEquals = true;
        if (i == 0 && (obj instanceof String)) {
            zEquals = true ^ "0".equals((String) obj);
        }
        LogUtil.a("WearHomeOtherSettingActivity", "lightScreenSwitch isEnable = ", Boolean.valueOf(zEquals));
        runOnUiThread(new Runnable() { // from class: til
            @Override // java.lang.Runnable
            public final void run() {
                this.f49157b.c(list, zEquals);
            }
        });
    }

    public /* synthetic */ void c(List list, boolean z) {
        getItem(list, 11).b(z);
        refreshGeneralDataAdapter();
    }

    private void h() {
        addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.home_ic_list_bluetoothdisconnected, 2, 1), new thf(getString(R.string.IDS_settings_anti_lost_remind), "", ""), this.d);
        LogUtil.a("WearHomeOtherSettingActivity", "showBtDisconnectItem.getWearCommonSetting");
        c(this.mGeneralList);
    }

    private void c(final List<rfq> list) {
        if (b("bt_lost_remind", 2)) {
            return;
        }
        mhs.a().getSwitchSetting("bt_lost_remind", new IBaseResponseCallback() { // from class: tij
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f49155b.c(list, i, obj);
            }
        });
    }

    public /* synthetic */ void c(final List list, int i, Object obj) {
        LogUtil.a("WearHomeOtherSettingActivity", "changeLostRemind errorCode is ", Integer.valueOf(i), " ; objectData is ", obj);
        final boolean z = (i == 0 && (obj instanceof String)) ? !"0".equals((String) obj) : false;
        LogUtil.a("WearHomeOtherSettingActivity", "changeLostRemind isEnable:", Boolean.valueOf(z));
        runOnUiThread(new Runnable() { // from class: tii
            @Override // java.lang.Runnable
            public final void run() {
                this.f49153b.e(list, z);
            }
        });
    }

    public /* synthetic */ void e(List list, boolean z) {
        getItem(list, 2).b(z);
        refreshGeneralDataAdapter();
    }

    private void l() {
        LogUtil.a("WearHomeOtherSettingActivity", "updateNoDisturb()");
        this.mDeviceInteractors.e(BaseApplication.getContext(), new IBaseResponseCallback() { // from class: tih
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f49152c.c(i, obj);
            }
        });
    }

    public /* synthetic */ void c(int i, Object obj) {
        if (obj == null) {
            LogUtil.j("WearHomeOtherSettingActivity", "updateNoDisturb objectData is null.");
            return;
        }
        final List list = (List) obj;
        if (list.isEmpty()) {
            list.add(new DataDeviceAvoidDisturbInfo());
        }
        runOnUiThread(new Runnable() { // from class: tio
            @Override // java.lang.Runnable
            public final void run() {
                this.f49159c.b(list);
            }
        });
    }

    public /* synthetic */ void b(List list) {
        e((List<DataDeviceAvoidDisturbInfo>) list);
    }

    private void e(List<DataDeviceAvoidDisturbInfo> list) {
        if (list == null || list.size() == 0) {
            LogUtil.j("WearHomeOtherSettingActivity", "list is null or size is 0");
            return;
        }
        DataDeviceAvoidDisturbInfo dataDeviceAvoidDisturbInfo = list.get(0);
        LogUtil.a("WearHomeOtherSettingActivity", "handleNoDisturbStatus() switch is ", Integer.valueOf(dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbSwitch()));
        if (dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbSwitch() == 0 && dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbTimeSwitch() == 0) {
            setSettingItemRightText(5, this.mGeneralList, this.mApplicationContext.getString(R.string.IDS_status_disabled));
        } else if (dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbSwitch() != 0) {
            setSettingItemRightText(5, this.mGeneralList, this.mApplicationContext.getString(R.string.IDS_status_enabled));
        } else if (dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbSwitch() != 0 || dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbTimeSwitch() == 0) {
            LogUtil.j("WearHomeOtherSettingActivity", "dataDeviceAvoidDisturbInfo.getDevice_avoid_disturb_switch() else");
        } else {
            setSettingItemRightText(5, this.mGeneralList, this.mDeviceInteractors.c(this.mContext, dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbStartTime(), dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbEndTime()));
        }
        c(dataDeviceAvoidDisturbInfo);
    }

    private void c(DataDeviceAvoidDisturbInfo dataDeviceAvoidDisturbInfo) {
        LogUtil.a("WearHomeOtherSettingActivity", "Enter updateDeviceSettingRotate()!");
        this.mDeviceCapability = this.mDeviceInteractors.e(this.mDeviceMac);
        if (this.mDeviceCapability == null) {
            LogUtil.j("WearHomeOtherSettingActivity", "updateDeviceSettingRotate() mDeviceCapability is null return !");
            return;
        }
        if (!this.mDeviceCapability.isSupportAutoLightScreen()) {
            LogUtil.j("WearHomeOtherSettingActivity", "updateDeviceSettingRotate() ", "mDeviceCapability not support isAuto_light_screen return !");
            return;
        }
        rcv rcvVarA = rcv.a(this.mApplicationContext);
        int iC = (rcvVarA == null || !this.mDeviceCapability.isSupportQueryAllowDisturbContent()) ? 0 : rcvVarA.c(this.mDeviceMac);
        LogUtil.a("WearHomeOtherSettingActivity", "updateDeviceSettingRotate() allowContent is ", Integer.valueOf(iC));
        if ((iC & 20) == 20) {
            if ((dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbType() & 20) == 20) {
                getItem(this.mGeneralList, 11).c((String) null);
                return;
            } else {
                getItem(this.mGeneralList, 11).c(this.mApplicationContext.getString(R.string.IDS_btsetting_auto_light_message));
                return;
            }
        }
        getItem(this.mGeneralList, 11).c(this.mApplicationContext.getString(R.string.IDS_btsetting_auto_light_message));
    }

    private void b() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: tik
            @Override // java.lang.Runnable
            public final void run() {
                this.f49156a.d();
            }
        });
    }

    public /* synthetic */ void d() {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("sync_wifi_toggle_status");
        if (userPreference == null) {
            HiHealthManager.d(BaseApplication.getContext()).setUserPreference(new HiUserPreference("sync_wifi_toggle_status", "1"), true);
            userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("sync_wifi_toggle_status");
        }
        if (userPreference != null) {
            this.j.sendMessage(this.j.obtainMessage(100, userPreference));
        }
    }

    static class d extends BaseHandler<WearHomeOtherSettingActivity> {
        d(WearHomeOtherSettingActivity wearHomeOtherSettingActivity) {
            super(wearHomeOtherSettingActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(WearHomeOtherSettingActivity wearHomeOtherSettingActivity, Message message) {
            if (message == null) {
                LogUtil.j("WearHomeOtherSettingActivity", "handleMessageWhenReferenceNotNull msg is null");
            } else if (message.what == 100) {
                Object obj = message.obj;
                if (obj instanceof HiUserPreference) {
                    wearHomeOtherSettingActivity.c((HiUserPreference) obj);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HiUserPreference hiUserPreference) {
        if (hiUserPreference == null) {
            LogUtil.j("WearHomeOtherSettingActivity", "show sync wifi toggle item param HiUserPreference is null");
            return;
        }
        String value = hiUserPreference.getValue();
        if (value != null) {
            value = value.trim();
        }
        e(!"0".equals(value));
    }

    private void e(boolean z) {
        String string;
        thh thhVar = new thh(R.mipmap.ic_home_wlan, 47, 0);
        if (Utils.o()) {
            string = getString(R.string.IDS_settings_sync_wifi);
        } else {
            string = getString(R.string.IDS_settings_sync_wlan);
        }
        thf thfVar = new thf(string, getString(R.string.IDS_settings_sync_wifi_sub_title), "");
        boolean z2 = this.mIsConnected;
        if (Utils.n() && !Utils.o()) {
            a(true);
            z2 = false;
            z = true;
        }
        addGeneralSettingItem(z2, thhVar, thfVar, new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homewear21.home.WearHomeOtherSettingActivity$$ExternalSyntheticLambda7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                this.f26247b.b(compoundButton, z3);
            }
        });
        getItem(this.mGeneralList, 47).b(z);
        refreshGeneralDataAdapter();
    }

    /* synthetic */ void b(CompoundButton compoundButton, boolean z) {
        a(z);
    }

    private void a(final boolean z) {
        LogUtil.a("WearHomeOtherSettingActivity", "click sync wifi toggle in the WearHomeOtherSettingActivity");
        ThreadPoolManager.c().execute(new Runnable() { // from class: tia
            @Override // java.lang.Runnable
            public final void run() {
                WearHomeOtherSettingActivity.c(z);
            }
        });
    }

    public static /* synthetic */ void c(boolean z) {
        HiUserPreference hiUserPreference;
        if (z) {
            hiUserPreference = new HiUserPreference("sync_wifi_toggle_status", "1");
        } else {
            hiUserPreference = new HiUserPreference("sync_wifi_toggle_status", "0");
        }
        HiHealthManager.d(BaseApplication.getContext()).setUserPreference(hiUserPreference, true);
        if (z) {
            LogUtil.a("WearHomeOtherSettingActivity", "click sync wifi toggle and send wifi data in main process");
            lvb.e().i();
        } else {
            LogUtil.a("WearHomeOtherSettingActivity", "click sync wifi toggle is closed");
        }
    }

    private boolean b(String str, int i) {
        boolean z = false;
        if (mgb.d(this.mDeviceMac) != 2) {
            return false;
        }
        String strE = SharedPreferenceManager.e(this.mContext, String.valueOf(10008), str);
        if (TextUtils.isEmpty(strE)) {
            if (!"bt_lost_remind".equals(str)) {
                z = true;
            }
        } else {
            z = Boolean.parseBoolean(strE);
        }
        getItem(this.mGeneralList, i).b(z);
        refreshGeneralDataAdapter();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str, boolean z) {
        if (mgb.d(this.mDeviceMac) != 2) {
            return false;
        }
        SharedPreferenceManager.e(this.mContext, String.valueOf(10008), str, Boolean.toString(z), null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c() {
        String string;
        boolean zIsSmartGestureOpen = SmartGestureUtil.isSmartGestureOpen();
        LogUtil.a("WearHomeOtherSettingActivity", "getSmartGestureRightText isGestureOpen: ", Boolean.valueOf(zIsSmartGestureOpen));
        if (zIsSmartGestureOpen) {
            string = getString(R.string.IDS_startup_hms_enabled);
        } else {
            string = getString(R.string.IDS_startup_hms_disabled);
        }
        LogUtil.a("WearHomeOtherSettingActivity", "getSmartGestureRightText rightText: ", string);
        return string;
    }

    private void e() {
        LogUtil.a("WearHomeOtherSettingActivity", "jumpSmartGestureH5 is enter");
        ddv ddvVarB = ddv.b();
        ddvVarB.initH5Pro();
        H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addPath("#/gestureRecognition").addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi")).addCustomizeJsModule("device", ddvVarB.getCommonJsModule("device")).addCustomizeJsModule("BasePairManager", BasePairManagerJsApi.class).setImmerse().showStatusBar().build();
        H5ProClient.getServiceManager().registerService(DeviceManagerService.class);
        H5ProClient.startH5MiniProgram(BaseApplication.getContext(), "com.huawei.health.h5.dm-ccbk", h5ProLaunchOptionBuild);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
