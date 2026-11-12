package com.xiaomi.hm.health.mainpage;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.v2.MainPermissionManager;
import com.huami.lib.v2.ZeppPermissionManagerKt;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.amazfit_watch.HMWatchLogic;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.model.WeatherSetting;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import com.xiaomi.hm.health.mainpage.MainPermissionManagerImpl;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.utils.TelephonyUtil;
import com.xiaomi.hm.health.utils.Utils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0016\u0010\u0011\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0016J\u0016\u0010\u0012\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0006\u0010\u0015\u001a\u00020\u0002R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/mainpage/MainPermissionManagerImpl;", "Lcom/huami/lib/v2/MainPermissionManager;", "", "i", "", DbUtils.Const.Columns.Event.EVENT_ID, "value", "g", "deviceName", "enableBluetooth", "", "hasBoundBleDevice", "hasBoundWeightDevice", "isIncallNameDisplayEnabled", "onLocationPermissionGranted", "", "permissions", "onPermissionsDenied", "onPermissionsGrant", "supportInComingCall", "supportWeather", "requestLocation", "Landroidx/appcompat/app/AppCompatActivity;", "e", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class MainPermissionManagerImpl extends MainPermissionManager {

    @NotNull
    private static final String f = "MainPermissionManager";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final AppCompatActivity activity;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "request location after open permission.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "showGotoLocationServerDialog...";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "click go setting";
        }
    }

    public MainPermissionManagerImpl(@NotNull AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        this.activity = appCompatActivity;
    }

    private final void g(String eventId, String value) {
        Analytics.recordEvent(new CountEventBuilder(eventId).setValue(value));
    }

    public static /* synthetic */ void h(MainPermissionManagerImpl mainPermissionManagerImpl, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        mainPermissionManagerImpl.g(str, str2);
    }

    private final void i() {
        HMLog.debug(f, b.a);
        new AlertDialogFragment.Builder(this.activity).setTitle(R.string.loaction_tips).setMessage(R.string.open_location_msg_new).setPositiveButton(R.string.per_go_setting, new DialogInterface.OnClickListener() { // from class: bv4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MainPermissionManagerImpl.j(this.a, dialogInterface, i);
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show(this.activity.getSupportFragmentManager());
        h(this, StatEvent.EventId.GPS_OFF, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(MainPermissionManagerImpl mainPermissionManagerImpl, DialogInterface dialogInterface, int i) {
        HMLog.debug(f, c.a);
        mainPermissionManagerImpl.activity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    @Override // com.huami.lib.v2.MainPermissionManager
    @NotNull
    public String deviceName() {
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        return HMDeviceUtils.getDeviceDescription(hMDeviceManager.getBoundDeviceSource(hMDeviceManager.getMajorDeviceTypeNew()));
    }

    @Override // com.huami.lib.v2.MainPermissionManager
    public void enableBluetooth() {
        Utils.enableBluetooth(this.activity);
    }

    @Override // com.huami.lib.v2.MainPermissionManager
    public boolean hasBoundBleDevice() {
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        if (!hMDeviceManager.hasBoundBleDevice()) {
            HMDeviceType majorDeviceTypeNew = hMDeviceManager.getMajorDeviceTypeNew();
            if (!((majorDeviceTypeNew == HMDeviceType.SENSORHUB || majorDeviceTypeNew == HMDeviceType.VDevice) ? false : true)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.huami.lib.v2.MainPermissionManager
    public boolean hasBoundWeightDevice() {
        return HMDeviceManager.getInstance().hasBound(HMDeviceType.WEIGHT);
    }

    @Override // com.huami.lib.v2.MainPermissionManager
    public boolean isIncallNameDisplayEnabled() {
        HMMiliConfig miliConfig = HMPersonInfo.getInstance().getMiliConfig();
        if (miliConfig == null) {
            return false;
        }
        return miliConfig.isIncallNameDisplayEnabled();
    }

    @Override // com.huami.lib.v2.MainPermissionManager
    public void onLocationPermissionGranted() {
        if (Utils.isLocationServerOpen(this.activity)) {
            Utils.enableBluetooth(this.activity);
        } else {
            i();
        }
        HMLog.info(f, a.a);
        requestLocation();
    }

    @Override // com.huami.lib.v2.MainPermissionManager
    public void onPermissionsDenied(@NotNull List<String> permissions) {
        if (permissions.contains(Build.VERSION.SDK_INT >= 31 ? "android.permission.ACCESS_COARSE_LOCATION" : "android.permission.ACCESS_FINE_LOCATION")) {
            g(StatEvent.EventId.MISS_PERMISSION, "Location");
        }
    }

    @Override // com.huami.lib.v2.MainPermissionManager
    public void onPermissionsGrant(@NotNull List<String> permissions) {
        if (ZeppPermissionManagerKt.hasPermission(this.activity, "android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN")) {
            WatchManager watchManager = WatchManager.INSTANCE;
            if (watchManager.hasBoundWatch()) {
                Application application = this.activity.getApplication();
                BraceletApp braceletApp = application instanceof BraceletApp ? (BraceletApp) application : null;
                if (braceletApp != null) {
                    braceletApp.initPhoneConnection();
                }
                HMWatchLogic.connectCurrentDevice();
                watchManager.checkNeedToShowNLSTip(this.activity);
            }
        }
        if (permissions.contains("android.permission.READ_CONTACTS")) {
            TelephonyUtil.INSTANCE.preReadContacts(this.activity, f);
        }
    }

    public final void requestLocation() {
        LocWeatherManager.getInstance().requestLocationLimited();
    }

    @Override // com.huami.lib.v2.MainPermissionManager
    public boolean supportInComingCall() {
        if (!HMDeviceManager.getInstance().hasBound(HMDeviceType.MILI)) {
            return false;
        }
        HMMiliConfig miliConfig = HMPersonInfo.getInstance().getMiliConfig();
        return miliConfig == null ? false : miliConfig.isInComingCallEnabled();
    }

    @Override // com.huami.lib.v2.MainPermissionManager
    public boolean supportWeather() {
        if (WeatherSetting.fromJsonString(HMPersonInfo.getInstance().getMiliConfig().getWeatherSetting()).getAutoLocate()) {
            HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
            if (HMDeviceConfig.hasFeatureWeather(hMDeviceManager.getBoundDeviceSource(hMDeviceManager.getMajorDeviceType()))) {
                return true;
            }
        }
        return false;
    }
}
