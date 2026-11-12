package com.xiaomi.hm.health.device;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.internal.ServerProtocol;
import com.huami.account.DeviceAuthParams;
import com.huami.account.HMLoginManager;
import com.huami.account.HMLogoutManager;
import com.huami.account.XiaoaiAuthParams;
import com.huami.account.XiaomiTokenMananger;
import com.huami.account.bean.LogoutResult;
import com.huami.account.service.UserInfoPolicyService;
import com.huami.ai.helper.DeviceSpeechSupportFuncKt;
import com.huami.ai.speech.alexa.uitls.AlexaLanguage;
import com.huami.ai.speech.alexa.uitls.AlexaSupportUtilsKt;
import com.huami.ai.speech.simplify.alexa.language.AlexaLanguageRepo;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.profile.channel.module.find.FindDeviceWrapper;
import com.huami.device.core.agps.impl.store.AgpsTimeStore;
import com.huami.device.feature.health.HealthDetect;
import com.huami.device.feature.health.user.HealthConfig;
import com.huami.device.feature.health.user.HealthSettingConfig;
import com.huami.device.feature.health.util.HrModeExtKt;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.device.feature.notification.data.AppsNotificationRepo;
import com.huami.device.feature.notification.utils.AppUtil;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.AccountWebExtApi;
import com.huami.devicex.injection.basic.DeviceTokenApi;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.basic.MiuiFnApi;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.injection.other.AppUtilApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.view.ViewUtils;
import com.huami.lib.view.scroll.HMExpandHeadView;
import com.huami.lib.view.scroll.HMScrollView;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.passport.ErrorCode;
import com.huami.prelaunch.PreLaunchUtilKt;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.watch.companion.esim.ui.activity.EsimActivity;
import com.huami.web.container.WebActivity;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceSpanUtils;
import com.xiaomi.hm.health.baseui.DarkModeUtilKt;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.model.HMColorTheme;
import com.xiaomi.hm.health.bt.model.HMDisplayType;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HMLiftWristConfig;
import com.xiaomi.hm.health.bt.model.HMProDisplayItem;
import com.xiaomi.hm.health.bt.model.HmLocale;
import com.xiaomi.hm.health.bt.model.PasswordInfo;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.ConnectionParameters;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.user.LocationExt;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.databases.model.Reminder;
import com.xiaomi.hm.health.device.HMMiLiSettingActivity;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.device.beep.BeepSettingActivity;
import com.xiaomi.hm.health.device.bind.analytic.ui.UIAnalytic;
import com.xiaomi.hm.health.device.callback.DeviceManualFaqCallback;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.event.EventWHTypeChanged;
import com.xiaomi.hm.health.device.event.HMDeviceAlarmEvent;
import com.xiaomi.hm.health.device.event.HMDeviceBatteryEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.firmware.FwUpgradeFeature;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeInfoActivity;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.device.fw_upgrade.NetFwUpgradeManager;
import com.xiaomi.hm.health.device.health.ui.HealthDetectSettingActivity;
import com.xiaomi.hm.health.device.model.WeatherSetting;
import com.xiaomi.hm.health.device.prelaunch.PreLaunchParserKt;
import com.xiaomi.hm.health.device.realtimedata.IRealtimeData;
import com.xiaomi.hm.health.device.reminder.ReminderEventFactory;
import com.xiaomi.hm.health.device.setting.appsort.HMAppSortDataManager;
import com.xiaomi.hm.health.device.setting.consts.webapi.WebApi;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.settings.SettingFeatureConfig;
import com.xiaomi.hm.health.device.settings.sport.MiliSportSettingActivity;
import com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinManager;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinUtils;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.eventbus.EventFwCheckResult;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMCalendarConfig;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMNightModeConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMSportHRBroadcastConfig;
import com.xiaomi.hm.health.speech.constant.AboutSpeechSpecs;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindManager;
import com.xiaomi.hm.health.ui.smartplay.eventremind.ReminderChangedEvent;
import com.xiaomi.hm.health.ui.smartplay.eventremind.RxUtil;
import com.xiaomi.hm.health.utils.CincoAnalytics;
import com.xiaomi.hm.health.utils.DeviceManualUtils;
import com.xiaomi.mipush.sdk.Constants;
import de.greenrobot.event.EventBus;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.netty.util.internal.StringUtil;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import rx.Observable;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes20.dex */
public class HMMiLiSettingActivity extends BaseTitleActivity implements View.OnClickListener {
    public static final int DEVICE_MIJIA_AUTHORIZE_RESULT_CODE = 20;
    private static final String F1 = "HMMiLiSettingActivity";
    private static final String G1 = "V1.2.7.06";
    private static final int H1 = 1970;
    private static final int I1 = 10;
    private static final int J1 = 98;
    private static final int K1 = 22;
    private static WeakReference<HMMiLiSettingActivity> L1 = null;
    private static final int M1 = 30000;
    public static final /* synthetic */ boolean N1 = false;
    public static final int TO_MIBAND_3_REQUEST_CODE = 1;
    public static final int UNBIND_REQUEST_CODE = 0;
    public static final Lazy<UserInfoPolicyService> userInfoPolicyServiceLazy = KoinJavaComponent.inject(UserInfoPolicyService.class);
    private Lazy<AppUtilApi> A1;
    private HealthSettingConfig B1;
    private boolean C1;
    private final Handler D1;
    private LoadingDialog E1;
    private String K0;
    private LinearLayout N0;
    private ListTile U0;
    private ListTile W;
    private final Lazy<DeviceManagerApi> W0;
    private final Lazy<DeviceTimeStoreApi> X0;
    private ListTile Y;
    private final Lazy<KeeperProxyApi> Y0;
    private ListTile Z;
    private final Lazy<DeviceUtilsApi> Z0;
    private final Lazy<AgpsTimeStore> a1;
    private final Lazy<MiuiFnApi> b1;
    private final Lazy<DeviceTokenApi> c1;
    private final Lazy<DeviceXNavigator> d1;
    private final Lazy<AccountWebExtApi> e1;
    private final HMPersonInfo f1;
    private final HMMiliConfig g1;
    public HMDeviceSource h1;
    private HMMiLiDevice i1;
    private DeviceManagerApi j1;
    private HMDeviceSource k1;
    private HMProDisplayItem l1;
    private ListTile m0;
    private int m1;
    private ListTile n0;
    private View n1;
    private ListTile o0;
    private AlertDialogFragment o1;
    private ListTile p0;
    private CheckBox p1;
    private ListTile q0;
    private CheckBox q1;
    private ImageView r1;
    private ListTile s0;
    private String s1;
    private NotificationManager t1;
    private ListTile u0;
    private String u1;
    private String v1;
    private ListTile w0;
    private LoadingDialogHelper w1;
    private HMExpandHeadView x;
    private ListTile x0;
    private PasswordInfo x1;
    private ListTile y0;
    private float y1;
    private ListTile z0;
    private Lazy<AlexaLanguageRepo> z1;
    private final int y = 100;
    private final int z = 10;
    private ImageView A = null;
    private ImageView B = null;
    private TextView C = null;
    private TextView D = null;
    private TextView E = null;
    private ListTile F = null;
    private ListTile G = null;
    private ListTile H = null;
    private ListTile I = null;
    private ListTile J = null;
    private ListTile K = null;
    private ListTile L = null;
    private ListTile M = null;
    private ListTile N = null;
    private ListTile O = null;
    private ListTile P = null;
    private ListTile Q = null;
    private ListTile R = null;
    private ListTile S = null;
    private ListTile T = null;
    private ListTile U = null;
    private ListTile V = null;
    private ListTile X = null;
    private boolean r0 = false;
    private ListTile t0 = null;
    private ListTile v0 = null;
    private ListTile A0 = null;
    private ListTile B0 = null;
    private ListTile C0 = null;
    private ListTile D0 = null;
    private ListTile E0 = null;
    private ListTile F0 = null;
    private ListTile G0 = null;
    private ListTile H0 = null;
    private ListTile I0 = null;
    private ListTile J0 = null;
    private ListTile L0 = null;
    private ListTile M0 = null;
    private ListTile O0 = null;
    private ListTile P0 = null;
    private ListTile Q0 = null;
    private ListTile R0 = null;
    private ListTile S0 = null;
    private ListTile T0 = null;
    private View V0 = null;

    public class a implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.HMMiLiSettingActivity$a$a, reason: collision with other inner class name */
        public class C0797a extends HMCallback {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ CompoundButton b;

            public C0797a(boolean z, CompoundButton compoundButton) {
                this.a = z;
                this.b = compoundButton;
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean z) {
                super.onFinish(z);
                HMLog.d(HMMiLiSettingActivity.F1, "enableSleepAssistHr:" + z, new Object[0]);
                if (!z) {
                    HMMiLiSettingActivity.this.S2(this.b, this.a);
                    return;
                }
                HMMiLiSettingActivity.this.w1.hideLoading();
                HealthDetect healthDetect = HealthDetect.INSTANCE;
                healthDetect.getUserConfig().setSleepAssistEnable(this.a);
                healthDetect.getUserConfig().save(false);
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onStart() {
                HMMiLiSettingActivity.this.w1.showLoading(this.a ? R.string.dialog_starting : R.string.dialog_closing);
            }
        }

        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (compoundButton.isPressed()) {
                HMMiLiSettingActivity hMMiLiSettingActivity = HMMiLiSettingActivity.this;
                if (hMMiLiSettingActivity.x1(hMMiLiSettingActivity.i1)) {
                    return;
                }
                HMMiLiSettingActivity.this.i1.enableSleepAssistHr(z, new C0797a(z, compoundButton));
                Analytics.recordEvent(new CountEventBuilder(HMMiLiSettingActivity.this.v1).setValue(StatEvent.DEVICE_OPERATE_SLEEP_ASSIST));
            }
        }
    }

    public class a0 extends HMCallback {
        public a0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b() {
            return "set setConnectionParameters success";
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            HMLog.info(HMMiLiSettingActivity.F1, new Function0() { // from class: com.xiaomi.hm.health.device.n
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMMiLiSettingActivity.a0.b();
                }
            });
        }
    }

    public class b extends HMCallback {
        public b() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            HMLog.i(HMMiLiSettingActivity.F1, "set calendar: " + z, new Object[0]);
        }
    }

    public class b0 extends BLEStatueListenerAdapter {
        public b0() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean z) {
            HMMiLiSettingActivity.this.O3(z);
            if (HMMiLiSettingActivity.this.U0 != null) {
                HMMiLiSettingActivity.this.U0.setEnabled(z);
            }
            if (z) {
                if (HMMiLiSettingActivity.this.k1 == HMDeviceSource.MILI_TEMPO && HMMiLiSettingActivity.this.N.getVisibility() == 8) {
                    HMMiLiSettingActivity.this.G3();
                }
                HMMiLiSettingActivity.this.C2();
                HMMiLiSettingActivity.this.p3();
                HMMiLiSettingActivity.this.o3();
                HMMiLiSettingActivity.this.R3();
                HMMiLiSettingActivity.this.D3();
                HMMiLiSettingActivity.this.z3();
            }
        }
    }

    public class c extends HMCallback {
        public c() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            HMLog.i(HMMiLiSettingActivity.F1, "set startDayOfWeek: " + z, new Object[0]);
        }
    }

    public class c0 implements DeviceManualFaqCallback {
        public c0() {
        }

        @Override // com.xiaomi.hm.health.device.callback.DeviceManualFaqCallback
        public void hide() {
            HMMiLiSettingActivity.this.F0.setVisibility(8);
        }

        @Override // com.xiaomi.hm.health.device.callback.DeviceManualFaqCallback
        public void show(String str) {
            HMMiLiSettingActivity.this.K0 = str;
            HMMiLiSettingActivity.this.F0.setVisibility(0);
        }
    }

    public class d extends HMCallback<PasswordInfo> {
        public d() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(PasswordInfo passwordInfo) {
            if (passwordInfo == null || passwordInfo.getState() != 0) {
                HMMiLiSettingActivity.this.N.setTips(R.string.not_set);
            } else {
                HMMiLiSettingActivity.this.x1 = passwordInfo;
                HMMiLiSettingActivity.this.N.setTips("****");
            }
        }
    }

    public static class d0 extends Handler {
        private d0() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            HMMiLiSettingActivity.h1(message.what);
            super.handleMessage(message);
        }
    }

    public class e extends HMCallback {
        public e() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            if (z) {
                HMMiLiSettingActivity hMMiLiSettingActivity = HMMiLiSettingActivity.this;
                int i = hMMiLiSettingActivity.m1 + 1;
                hMMiLiSettingActivity.m1 = i;
                if (i == 4) {
                    Toast.makeText(HMMiLiSettingActivity.this, HMDeviceConfig.hasBoundWatch() ? R.string.chaohu_setting_finding_tips : R.string.mili_setting_finding_tips, 0).show();
                }
            }
        }
    }

    public class f implements View.OnLongClickListener {
        private LoadingDialog a = null;

        public class a implements IHMDataCallback<File> {
            public a() {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onStop(File file, HMDeviceError hMDeviceError) {
                f.this.g();
                f.this.l(hMDeviceError.isErrorNone());
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
            public void onProgress(Progress progress) {
                f.this.k(progress.progress + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + progress.total);
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
            public void onStart() {
                f.this.k("0/0");
            }
        }

        public f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            HMMiLiSettingActivity.this.runOnUiThread(new Runnable() { // from class: com.xiaomi.hm.health.device.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.h();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h() {
            LoadingDialog loadingDialog = this.a;
            if (loadingDialog != null) {
                loadingDialog.dismiss();
                this.a = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(String str) {
            if (HMMiLiSettingActivity.this.isDestroyed()) {
                return;
            }
            if (this.a == null) {
                LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(HMMiLiSettingActivity.this);
                this.a = loadingDialogShowDialog;
                loadingDialogShowDialog.setCancelable(false);
            }
            this.a.setMessage(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(boolean z) {
            if (HMMiLiSettingActivity.this.isDestroyed()) {
                return;
            }
            Toast.makeText(HMMiLiSettingActivity.this, z ? R.string.sync_device_log_success : R.string.sync_device_log_failed, 0).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(final String str) {
            HMMiLiSettingActivity.this.runOnUiThread(new Runnable() { // from class: com.xiaomi.hm.health.device.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.i(str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(final boolean z) {
            HMMiLiSettingActivity.this.runOnUiThread(new Runnable() { // from class: com.xiaomi.hm.health.device.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.j(z);
                }
            });
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (HMMiLiSettingActivity.this.i1 != null && HMMiLiSettingActivity.this.i1.isConnected()) {
                HMMiLiSettingActivity.this.i1.getDeviceLog(new File(FileUtils.getExternalStorageDirectoryCompatible(HMMiLiSettingActivity.this.getBaseContext()), ((DeviceUtilsApi) HMMiLiSettingActivity.this.Z0.getValue()).getDeviceLogName(HMMiLiSettingActivity.this.k1)), new a());
            }
            return true;
        }
    }

    public class g extends XiaomiTokenMananger.OnDeviceAuthCallback {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public g(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
        public void onError(ErrorCode errorCode) {
            HMMiLiSettingActivity.this.z2();
        }

        @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
        public void onSuccess() {
            HMMiLiSettingActivity.this.A2(new DeviceAuthParams(this.a, this.b));
        }

        @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
        public void onUserCancel() {
            HMMiLiSettingActivity.this.y2();
        }
    }

    public class h implements DialogInterface.OnClickListener {

        public class a extends HMCallback {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;

            public a(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean z) {
                super.onFinish(z);
                if (!z) {
                    HMMiLiSettingActivity.this.y3(this.b);
                } else {
                    HMMiLiSettingActivity.this.g1.setLongPressSettings(this.a);
                    HMMiLiSettingActivity.this.f1.saveInfo(2);
                }
            }
        }

        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ((HMMiLiProDevice) HMMiLiSettingActivity.this.i1).setLongPressKey(i, new a(i, HMMiLiSettingActivity.this.g1.getLongPressSettings()));
            HMMiLiSettingActivity.this.y3(i);
        }
    }

    public class i extends HMCallback {
        public i() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            if (z) {
                HMMiLiSettingActivity.this.B1.setHrDetectType(2);
                HMMiLiSettingActivity.this.B1.save(false);
                HMLog.d(HMMiLiSettingActivity.F1, "post heart type", new Object[0]);
                EventBus.getDefault().post(new EventWHTypeChanged());
            }
        }
    }

    public class j extends HMCallback {
        public j() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            if (z) {
                HMMiLiSettingActivity.this.B1.setHrDetectType(1);
                HMMiLiSettingActivity.this.B1.save(false);
                HMLog.d(HMMiLiSettingActivity.F1, "post heart type", new Object[0]);
                EventBus.getDefault().post(new EventWHTypeChanged());
            }
        }
    }

    public class k implements DialogInterface.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public class a extends HMCallback {
            public a() {
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean z) {
                super.onFinish(z);
                if (z) {
                    HMMiLiSettingActivity.this.B1.setHrDetectType(k.this.b);
                    HMMiLiSettingActivity.this.B1.save(false);
                    HMLog.d(HMMiLiSettingActivity.F1, "post heart type", new Object[0]);
                    EventBus.getDefault().post(new EventWHTypeChanged());
                }
            }
        }

        public k(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.a == i) {
                return;
            }
            if (i == 0 || i == 1) {
                HMMiLiSettingActivity.this.P2(i);
            } else if (i == 2) {
                HMMiLiSettingActivity.this.t3(0);
                HMMiLiSettingActivity.this.i1.enableHeartRate(false, HMMiLiSettingActivity.this.B1.getFreq(), new a());
            }
        }
    }

    public class l implements CompoundButton.OnCheckedChangeListener {

        public class a extends HMCallback {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ CompoundButton b;

            public a(boolean z, CompoundButton compoundButton) {
                this.a = z;
                this.b = compoundButton;
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean z) {
                super.onFinish(z);
                if (!z) {
                    HMMiLiSettingActivity.this.S2(this.b, this.a);
                    return;
                }
                HMMiLiSettingActivity.this.w1.hideLoading();
                HMMiLiSettingActivity.this.g1.setLiftWristBrightView(this.a);
                HMMiLiSettingActivity.this.f1.saveInfo(2);
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onStart() {
                HMMiLiSettingActivity.this.w1.showLoading(this.a ? R.string.dialog_starting : R.string.dialog_closing);
            }
        }

        public l() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            HMMiLiSettingActivity.this.S.setEnabled(z);
            if (compoundButton.isPressed()) {
                HMMiLiSettingActivity hMMiLiSettingActivity = HMMiLiSettingActivity.this;
                if (hMMiLiSettingActivity.x1(hMMiLiSettingActivity.i1)) {
                    return;
                }
                ((HMMiLiProDevice) HMMiLiSettingActivity.this.i1).enableWristBright(new HMLiftWristConfig(z), new a(z, compoundButton));
                Analytics.recordEvent(new CountEventBuilder(HMMiLiSettingActivity.this.u1).setValue("LightScreen"));
            }
        }
    }

    public class m extends HMCallback {
        public m() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            HMLog.d(HMMiLiSettingActivity.F1, "setWearLocation:" + z, new Object[0]);
            if (z) {
                HMMiLiSettingActivity.this.f1.saveInfo(2);
            } else {
                HMMiLiSettingActivity.this.Y2();
            }
        }
    }

    public class n extends HMCallback {
        public n() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            HMLog.d(HMMiLiSettingActivity.F1, "setColorTheme:" + z, new Object[0]);
            if (z) {
                HMMiLiSettingActivity.this.f1.saveInfo(2);
            } else {
                HMMiLiSettingActivity.this.Y2();
            }
        }
    }

    public class o implements DialogInterface.OnClickListener {
        public final /* synthetic */ SortableAppItems a;
        public final /* synthetic */ HashMap b;

        public class a extends HMCallback {
            public a() {
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean z) {
                super.onFinish(z);
                HMLog.d(HMMiLiSettingActivity.F1, "setDisplayItem:" + z, new Object[0]);
            }
        }

        public o(SortableAppItems sortableAppItems, HashMap map) {
            this.a = sortableAppItems;
            this.b = map;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (!HMMiLiSettingActivity.this.i1.isConnected()) {
                CustomToast.makeText(HMMiLiSettingActivity.this, R.string.alarm_save_failed, 0).show();
                return;
            }
            SortableAppItems sortableAppItems = this.a;
            Objects.requireNonNull(sortableAppItems);
            HMAppSortDataManager.getMiliProDisplaySetting(sortableAppItems, HMMiLiSettingActivity.this.l1.getValue());
            DeviceXFunctionsKt.getPropertyStoreApi().setProperty(Property.PROPERTY_APP_SORT_CONFIG, HMAppSortDataManager.toDisplaySettingJsonString(this.b));
            DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
            ((HMMiLiProDevice) HMMiLiSettingActivity.this.i1).setDisplayItem(HMMiLiSettingActivity.this.l1, new a());
        }
    }

    public class p implements DialogInterface.OnClickListener {
        public final /* synthetic */ HMMiLiProDevice a;
        public final /* synthetic */ int b;

        public class a extends HMCallback {
            public a() {
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean z) {
                super.onFinish(z);
                HMLog.i(HMMiLiSettingActivity.F1, "onFinish :  " + z, new Object[0]);
                if (!z) {
                    CustomToast.makeText(HMMiLiSettingActivity.this, R.string.alarm_save_failed, 0).show();
                    return;
                }
                HMMiLiSettingActivity.this.g1.setTimePanelType(0);
                HMMiLiSettingActivity.this.g1.setTimePanelLang(p.this.b);
                HMMiLiSettingActivity.this.f1.saveInfo(2);
            }
        }

        public class b extends HMCallback {
            public b() {
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean z) {
                super.onFinish(z);
                HMLog.i(HMMiLiSettingActivity.F1, "onFinish :  " + z, new Object[0]);
                if (!z) {
                    CustomToast.makeText(HMMiLiSettingActivity.this, R.string.alarm_save_failed, 0).show();
                    return;
                }
                HMMiLiSettingActivity.this.g1.setTimePanelType(1);
                HMMiLiSettingActivity.this.g1.setTimePanelLang(p.this.b);
                HMMiLiSettingActivity.this.f1.saveInfo(2);
            }
        }

        public p(HMMiLiProDevice hMMiLiProDevice, int i) {
            this.a = hMMiLiProDevice;
            this.b = i;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HMDisplayType hMDisplayType;
            int i2 = 1;
            if (HMMiLiSettingActivity.this.p1.isChecked()) {
                this.a.setDisplayType(HMDisplayType.ONLY_TIME, new a());
                i2 = 0;
            } else {
                int i3 = this.b;
                if (i3 != 0) {
                    hMDisplayType = i3 != 1 ? HMDisplayType.ENGLISH : HMDisplayType.TRAD_CHINESE;
                } else {
                    hMDisplayType = HMDisplayType.SIMPLE_CHINESE;
                }
                this.a.setDisplayType(hMDisplayType, new b());
            }
            HMLog.i(HMMiLiSettingActivity.F1, "save :  " + i2 + ";" + this.b, new Object[0]);
        }
    }

    public class q extends HMCallback<Boolean> {
        public final /* synthetic */ boolean a;

        public q(boolean z) {
            this.a = z;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            HMLog.i(HMMiLiSettingActivity.F1, "york 开启抬腕亮屏: " + this.a + ", result = " + z, new Object[0]);
            if (z) {
                DeviceXFunctionsKt.getPropertyStoreApi().setYorkLiftWristSwitch(true);
            }
            super.onFinish(z);
        }
    }

    public class r implements HMLogoutManager.OnLogoutListener {

        public class a implements LoadingDialog.OnAnimEndListener {
            public a() {
            }

            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onAnimEnd(LoadingDialog loadingDialog) {
            }

            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onDismiss(LoadingDialog loadingDialog) {
                UnitManager.getInstance().clear();
                HMLogoutManager.logout(6);
                HMMiLiSettingActivity.this.finish();
            }
        }

        public r() {
        }

        @Override // com.huami.account.HMLogoutManager.OnLogoutListener
        public void onLogoutSuccess() {
            HMMiLiSettingActivity.this.w1.hideLoading();
            LoadingDialog loadingDialog = new LoadingDialog(HMMiLiSettingActivity.this);
            loadingDialog.show();
            loadingDialog.setSuccess(HMMiLiSettingActivity.this.getString(R.string.logout_success), 500, new a());
        }

        @Override // com.huami.account.HMLogoutManager.OnLogoutListener
        public void onStartLogout(LogoutResult logoutResult) {
            if (logoutResult.isSuccess()) {
                HMMiLiSettingActivity.this.w1.showLoading(R.string.logout_ongoing);
                ((AgpsTimeStore) HMMiLiSettingActivity.this.a1.getValue()).reset();
            } else {
                HMMiLiSettingActivity.this.w1.hideLoading();
                HMMiLiSettingActivity hMMiLiSettingActivity = HMMiLiSettingActivity.this;
                IconToast.showError(hMMiLiSettingActivity, hMMiLiSettingActivity.getString(R.string.logout_failed));
            }
        }

        @Override // com.huami.account.HMLogoutManager.OnLogoutListener
        public void onSyncDataWhenLogout() {
            HMMiLiSettingActivity.this.w1.showLoading();
        }
    }

    public class s implements XiaomiTokenMananger.OnBindInfoCallback {
        public s() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
            HMMiLiSettingActivity.this.x2();
        }

        @Override // com.huami.account.XiaomiTokenMananger.OnBindInfoCallback
        public void onBoundXiaomiLogin(String str) {
            HMMiLiSettingActivity.this.T3(str);
        }

        @Override // com.huami.account.XiaomiTokenMananger.OnBindInfoCallback
        public void onError() {
            HMMiLiSettingActivity.this.w1.hideLoading();
            IconToast.showError(HMMiLiSettingActivity.this.getApplicationContext(), R.string.speech_account_authorize_result_fail);
        }

        @Override // com.huami.account.XiaomiTokenMananger.OnBindInfoCallback
        public void onGetBindStatusError() {
            HMMiLiSettingActivity.this.w1.hideLoading();
            IconToast.showError(HMMiLiSettingActivity.this.getApplicationContext(), R.string.speech_account_authorize_result_fail);
        }

        @Override // com.huami.account.XiaomiTokenMananger.OnBindInfoCallback
        public void onNotSupportXiaomiBind() {
            HMMiLiSettingActivity hMMiLiSettingActivity = HMMiLiSettingActivity.this;
            hMMiLiSettingActivity.g3(hMMiLiSettingActivity.getString(R.string.speech_account_authorize_no_unique_xiaomi_account_title), HMMiLiSettingActivity.this.getString(R.string.speech_account_authorize_illegal_account_type_login), HMMiLiSettingActivity.this.getString(R.string.speech_account_authorize_base_dialog_button_cancel_desc), HMMiLiSettingActivity.this.getString(R.string.speech_account_authorize_base_dialog_button_custom_operation_switch_account), new DialogInterface.OnClickListener() { // from class: com.xiaomi.hm.health.device.j
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.b(dialogInterface, i);
                }
            });
        }

        @Override // com.huami.account.XiaomiTokenMananger.OnBindInfoCallback
        public void onUnboundXiaomiLogin() {
            HMMiLiSettingActivity.this.U3();
        }

        @Override // com.huami.account.XiaomiTokenMananger.OnBindInfoCallback
        public void onXiaomiLogin(String str) {
            HMMiLiSettingActivity.this.T3(str);
        }
    }

    public class t implements XiaomiTokenMananger.OnAuthCallback {
        public final /* synthetic */ String a;

        public t(String str) {
            this.a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(DialogInterface dialogInterface, int i) {
            HMMiLiSettingActivity.this.v2();
            HMMiLiSettingActivity.this.E2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(String str, DialogInterface dialogInterface, int i) {
            HMMiLiSettingActivity.this.T3(str);
        }

        @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
        public void onDifferentAccount() {
            HMMiLiSettingActivity hMMiLiSettingActivity = HMMiLiSettingActivity.this;
            String string = hMMiLiSettingActivity.getString(R.string.speech_account_authorize_no_unique_xiaomi_account_title);
            String string2 = HMMiLiSettingActivity.this.getString(R.string.speech_account_authorize_no_unique_xiaomi_account_content, new Object[]{this.a});
            String string3 = HMMiLiSettingActivity.this.getString(R.string.speech_account_authorize_base_dialog_button_cancel_desc);
            String string4 = HMMiLiSettingActivity.this.getString(R.string.speech_account_authorize_no_unique_xiaomi_account_dialog_custom_operation_reauthorize);
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.xiaomi.hm.health.device.k
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.c(dialogInterface, i);
                }
            };
            final String str = this.a;
            hMMiLiSettingActivity.h3(string, string2, string3, string4, onClickListener, new DialogInterface.OnClickListener() { // from class: com.xiaomi.hm.health.device.l
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.d(str, dialogInterface, i);
                }
            });
        }

        @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
        public void onError(ErrorCode errorCode) {
            HMMiLiSettingActivity.this.w1.hideLoading();
            IconToast.showError(HMMiLiSettingActivity.this.getApplicationContext(), R.string.speech_account_authorize_result_fail);
            HMMiLiSettingActivity.this.E2();
        }

        @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
        public void onSuccess() {
            HMMiLiSettingActivity.this.w1.hideLoading();
            IconToast.showSuccess(HMMiLiSettingActivity.this.getApplicationContext(), R.string.speech_account_authorize_result_success);
            HMMiLiSettingActivity.this.K3(this.a);
            if (!HMMiLiSettingActivity.this.r0) {
                WebHelper.launch(AboutSpeechSpecs.XIAOMI_SPEECH_ENGINE_USER_FAQ_URL);
            }
            HMMiLiSettingActivity.this.E2();
        }

        @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
        public void onUserCancel() {
            HMMiLiSettingActivity.this.w1.hideLoading();
            HMMiLiSettingActivity.this.E2();
        }
    }

    public class u implements XiaomiTokenMananger.OnBindXiaomiCallback {
        public u() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
            HMMiLiSettingActivity.this.x2();
        }

        @Override // com.huami.account.XiaomiTokenMananger.OnBindXiaomiCallback
        public void onAlreadyBind(String str) {
            HMMiLiSettingActivity hMMiLiSettingActivity = HMMiLiSettingActivity.this;
            hMMiLiSettingActivity.g3(hMMiLiSettingActivity.getString(R.string.speech_account_authorize_no_unique_xiaomi_account_title), HMMiLiSettingActivity.this.getString(R.string.speech_account_authorize_unique_wechat_account_login), HMMiLiSettingActivity.this.getString(R.string.speech_account_authorize_base_dialog_button_cancel_desc), HMMiLiSettingActivity.this.getString(R.string.speech_account_authorize_base_dialog_button_custom_operation_switch_account), new DialogInterface.OnClickListener() { // from class: com.xiaomi.hm.health.device.m
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.b(dialogInterface, i);
                }
            });
            HMMiLiSettingActivity.this.E2();
        }

        @Override // com.huami.account.XiaomiTokenMananger.OnBindXiaomiCallback
        public void onError() {
            HMMiLiSettingActivity.this.w1.hideLoading();
            IconToast.showError(HMMiLiSettingActivity.this.getApplicationContext(), R.string.speech_account_authorize_result_fail);
            HMMiLiSettingActivity.this.E2();
        }

        @Override // com.huami.account.XiaomiTokenMananger.OnBindXiaomiCallback
        public void onSuccess(String str) {
            HMMiLiSettingActivity.this.w1.hideLoading();
            IconToast.showSuccess(HMMiLiSettingActivity.this.getApplicationContext(), R.string.speech_account_authorize_result_success);
            HMMiLiSettingActivity.this.K3(str);
            if (HMMiLiSettingActivity.this.r0) {
                return;
            }
            WebHelper.launch(AboutSpeechSpecs.XIAOMI_SPEECH_ENGINE_USER_FAQ_URL);
        }

        @Override // com.huami.account.XiaomiTokenMananger.OnBindXiaomiCallback
        public void onUserCancel() {
            HMMiLiSettingActivity.this.w1.hideLoading();
            HMMiLiSettingActivity.this.E2();
        }
    }

    public static /* synthetic */ class v {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            a = iArr;
            try {
                iArr[HMDeviceSource.MILI_PEYTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMDeviceSource.MILI_PEYTO_L.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMDeviceSource.MILI_PEYTO_WL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMDeviceSource.MILI_TEMPO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMDeviceSource.MILI_PRO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[HMDeviceSource.MILI_QINLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[HMDeviceSource.MILI_ROCKY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[HMDeviceSource.MILI_PRO_I.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[HMDeviceSource.MILI_NFC.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[HMDeviceSource.MILI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[HMDeviceSource.MILI_1A.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[HMDeviceSource.MILI_AMAZFIT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[HMDeviceSource.MILI_1S.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[HMDeviceSource.MILI_CHONGQING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[HMDeviceSource.MILI_WUHAN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[HMDeviceSource.MILI_RIO.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[HMDeviceSource.MILI_TOKYO.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[HMDeviceSource.MILI_BEATS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[HMDeviceSource.MILI_BEATS_W.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[HMDeviceSource.MILI_BEATS_P.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[HMDeviceSource.MILI_CINCO.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[HMDeviceSource.MILI_CINCO_L.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[HMDeviceSource.MILI_PYH.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[HMDeviceSource.MILI_PYH_W.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[HMDeviceSource.MILI_FALCON_DISNEY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[HMDeviceSource.MILI_FALCON.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[HMDeviceSource.MILI_FALCON_W.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                a[HMDeviceSource.MILI_FALCON_L.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                a[HMDeviceSource.MILI_FALCON_WL.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                a[HMDeviceSource.MILI_HAWK.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                a[HMDeviceSource.MILI_HAWK_L.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                a[HMDeviceSource.MILI_HAWK_W.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                a[HMDeviceSource.MILI_HAWK_WL.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                a[HMDeviceSource.MILI_HAWK_SWK.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                a[HMDeviceSource.MILI_HAWK_SWK_W.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                a[HMDeviceSource.MILI_KESTREL.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                a[HMDeviceSource.MILI_KESTREL_L.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                a[HMDeviceSource.MILI_KESTREL_W.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                a[HMDeviceSource.MILI_KESTREL_WL.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                a[HMDeviceSource.MILI_ATHENS.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                a[HMDeviceSource.MILI_VULTURE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                a[HMDeviceSource.MILI_ONYX.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                a[HMDeviceSource.MILI_CORSICA.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                a[HMDeviceSource.MILI_ONYX_W.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                a[HMDeviceSource.MILI_CORSICA_W.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                a[HMDeviceSource.MILI_NEWTON.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                a[HMDeviceSource.MILI_NEWTON_W.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                a[HMDeviceSource.MILI_LINCS.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                a[HMDeviceSource.MILI_LINCS_W.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                a[HMDeviceSource.MILI_PRAGUE.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                a[HMDeviceSource.MILI_PRAGUE_W.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                a[HMDeviceSource.MILI_VENICE.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                a[HMDeviceSource.MILI_VENICE_W.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                a[HMDeviceSource.MILI_LONDON.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                a[HMDeviceSource.MILI_LONDON_W.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                a[HMDeviceSource.MILI_ANETO.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                a[HMDeviceSource.MILI_KONGMING.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                a[HMDeviceSource.MILI_KONGMING_L.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                a[HMDeviceSource.MILI_KONGMING_PRO.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                a[HMDeviceSource.MILI_YORK.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                a[HMDeviceSource.MILI_DTH.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                a[HMDeviceSource.MILI_DTH_W.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP_L.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP_O.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP_OL.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
        }
    }

    public class w implements CompoundButton.OnCheckedChangeListener {

        public class a extends HMCallback {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ CompoundButton b;

            public a(boolean z, CompoundButton compoundButton) {
                this.a = z;
                this.b = compoundButton;
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean z) {
                super.onFinish(z);
                if (!z) {
                    HMMiLiSettingActivity.this.S2(this.b, this.a);
                    return;
                }
                HMMiLiSettingActivity.this.w1.hideLoading();
                HMMiLiSettingActivity.this.g1.setFlipWrist(this.a);
                HMMiLiSettingActivity.this.f1.saveInfo(2);
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onStart() {
                HMMiLiSettingActivity.this.w1.showLoading(this.a ? R.string.dialog_starting : R.string.dialog_closing);
            }
        }

        public w() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (compoundButton.isPressed()) {
                HMMiLiSettingActivity hMMiLiSettingActivity = HMMiLiSettingActivity.this;
                if (hMMiLiSettingActivity.x1(hMMiLiSettingActivity.i1)) {
                    return;
                }
                ((HMMiLiProDevice) HMMiLiSettingActivity.this.i1).enableWristFlip(z, new a(z, compoundButton));
                Analytics.recordEvent(new CountEventBuilder(HMMiLiSettingActivity.this.v1).setValue(StatEvent.DEVICE_OPERATE_SWITCH_DISPLAY));
            }
        }
    }

    public class x implements CompoundButton.OnCheckedChangeListener {

        public class a extends HMCallback {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ CompoundButton b;

            public a(boolean z, CompoundButton compoundButton) {
                this.a = z;
                this.b = compoundButton;
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean z) {
                super.onFinish(z);
                if (!z) {
                    HMMiLiSettingActivity.this.S2(this.b, this.a);
                    return;
                }
                HMMiLiSettingActivity.this.w1.hideLoading();
                DeviceXFunctionsKt.getPropertyStoreApi().setProperty(Property.PROPERTY_MESSAGE_PREVIEW, ((DeviceUtilsApi) HMMiLiSettingActivity.this.Z0.getValue()).toMsgPreviewStr(this.a));
                DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onStart() {
                HMMiLiSettingActivity.this.w1.showLoading(this.a ? R.string.dialog_starting : R.string.dialog_closing);
            }
        }

        public x() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (compoundButton.isPressed()) {
                HMMiLiSettingActivity hMMiLiSettingActivity = HMMiLiSettingActivity.this;
                if (hMMiLiSettingActivity.x1(hMMiLiSettingActivity.i1)) {
                    return;
                }
                ((HMMiLiProDevice) HMMiLiSettingActivity.this.i1).enableMessagePreview(z, new a(z, compoundButton));
            }
        }
    }

    public class y implements CompoundButton.OnCheckedChangeListener {

        public class a extends HMCallback {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ CompoundButton b;

            public a(boolean z, CompoundButton compoundButton) {
                this.a = z;
                this.b = compoundButton;
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean z) {
                super.onFinish(z);
                if (!z) {
                    HMMiLiSettingActivity.this.S2(this.b, this.a);
                    return;
                }
                HMMiLiSettingActivity.this.w1.hideLoading();
                DeviceXFunctionsKt.getPropertyStoreApi().setProperty(Property.PROPERTY_LOCK_SCREEN_WUHAN, ((DeviceUtilsApi) HMMiLiSettingActivity.this.Z0.getValue()).toPropertyBoolStr(this.a));
                DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onStart() {
                HMMiLiSettingActivity.this.w1.showLoading(this.a ? R.string.dialog_starting : R.string.dialog_closing);
            }
        }

        public y() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (compoundButton.isPressed()) {
                HMMiLiSettingActivity hMMiLiSettingActivity = HMMiLiSettingActivity.this;
                if (hMMiLiSettingActivity.x1(hMMiLiSettingActivity.i1)) {
                    return;
                }
                ((HMMiLiProDevice) HMMiLiSettingActivity.this.i1).enableLockScreen(z, new a(z, compoundButton));
            }
        }
    }

    public class z implements HMScrollView.OnHMScrollViewStateChanged {
        public z() {
        }

        @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
        public void onBottomExpand(float f) {
        }

        @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
        public void onExpandViewExpand(float f) {
        }

        @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
        public void onExpandViewExpandStart() {
        }

        @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
        public void onExpandViewRelease(float f) {
        }

        @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
        public void onScrollerScroll(float f) {
            HMLog.d(HMMiLiSettingActivity.F1, "onScroll " + f, new Object[0]);
            int iQ1 = HMMiLiSettingActivity.this.q1(f);
            int i = iQ1 >= 0 ? iQ1 : 0;
            if (GlobalConfig.get().isBuildMidong()) {
                return;
            }
            HMMiLiSettingActivity.this.getTitleBarView().setBackgroundColor(Color.argb(i, 62, 138, 225));
            HMMiLiSettingActivity.this.setTintColor(Color.argb(i, 62, 138, 225));
        }
    }

    public HMMiLiSettingActivity() {
        Lazy<DeviceManagerApi> lazyInject = KoinJavaComponent.inject(DeviceManagerApi.class);
        this.W0 = lazyInject;
        this.X0 = KoinJavaComponent.inject(DeviceTimeStoreApi.class);
        this.Y0 = KoinJavaComponent.inject(KeeperProxyApi.class);
        this.Z0 = KoinJavaComponent.inject(DeviceUtilsApi.class);
        this.a1 = KoinJavaComponent.inject(AgpsTimeStore.class);
        this.b1 = KoinJavaComponent.inject(MiuiFnApi.class);
        this.c1 = KoinJavaComponent.inject(DeviceTokenApi.class);
        this.d1 = KoinJavaComponent.inject(DeviceXNavigator.class);
        this.e1 = KoinJavaComponent.inject(AccountWebExtApi.class);
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.f1 = hMPersonInfo;
        this.g1 = hMPersonInfo.getMiliConfig();
        this.h1 = lazyInject.getValue().getBoundDeviceSource(HMDeviceType.MILI);
        this.i1 = null;
        this.j1 = null;
        this.k1 = HMDeviceSource.MILI;
        this.l1 = null;
        this.m1 = 0;
        this.n1 = null;
        this.s1 = null;
        this.u1 = StatEvent.DEVICE_BAND_OPERATE;
        this.v1 = StatEvent.DEVICE_FIND_MILI;
        this.x1 = null;
        this.z1 = KoinJavaComponent.inject(AlexaLanguageRepo.class);
        this.A1 = KoinJavaComponent.inject(AppUtilApi.class);
        this.B1 = HealthDetect.INSTANCE.getUserConfig();
        this.C1 = false;
        this.D1 = new d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String A1() {
        return "Device is null while find device";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A2(@NonNull XiaoaiAuthParams xiaoaiAuthParams) {
        this.w1.hideLoading();
        IconToast.showSuccess(getApplicationContext(), R.string.speech_account_authorize_result_success);
        K3(null);
        if (!this.r0) {
            D2();
        }
        E2();
    }

    private void A3() {
        int enableAlarmSize = AlarmClockManager.getInstance().getEnableAlarmSize();
        if (enableAlarmSize <= 0) {
            this.Z.setTips(R.string.alert_disable);
            return;
        }
        this.Z.setTips(String.format(getString(R.string.enabled_alarms), enableAlarmSize + ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B1() {
        m3(this.i1.getBatteryInfo());
    }

    private void B2(final String str) {
        h3(getString(R.string.speech_account_authorize_no_unique_xiaomi_account_title), getString(R.string.speech_account_authorize_no_unique_xiaomi_account_content, new Object[]{str}), getString(R.string.speech_account_authorize_base_dialog_button_cancel_desc), getString(R.string.speech_account_authorize_no_unique_xiaomi_account_dialog_custom_operation_reauthorize), new DialogInterface.OnClickListener() { // from class: z83
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.M1(dialogInterface, i2);
            }
        }, new DialogInterface.OnClickListener() { // from class: va3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.N1(str, dialogInterface, i2);
            }
        });
    }

    private void B3() {
        this.U0 = (ListTile) findViewById(R.id.item_wallet);
        HMDeviceType majorDeviceType = this.W0.getValue().getMajorDeviceType();
        if (this.W0.getValue().getBindInfo(majorDeviceType) == null) {
            HMLog.i(F1, majorDeviceType + ":无法获取绑定设备信息, 不显示卡包入口", new Object[0]);
            this.U0.setVisibility(8);
            return;
        }
        if (NfcDeviceConfigKt.hasFeatureNfc()) {
            this.U0.setVisibility(0);
            this.U0.setOnClickListener(new View.OnClickListener() { // from class: f93
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.u2(view);
                }
            });
        } else {
            HMLog.i(F1, "不支持NFC, 不显示卡包入口", new Object[0]);
            this.U0.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C1(String str, View view) {
        this.d1.getValue().startHMFwChangeLogActivity(this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C2() {
        WebApi.loadH5Url(this.W0.getValue().getMiliDevice(), Locale.getDefault(), 75, new Function1() { // from class: na3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.R1((String) obj);
            }
        });
    }

    private void C3() {
        HMNightModeConfig hMNightModeConfigFromJsonString = HMNightModeConfig.fromJsonString();
        int nightMode = hMNightModeConfigFromJsonString.getNightMode();
        if (nightMode == 0) {
            this.P0.setTips(R.string.has_close);
            return;
        }
        if (nightMode == 1) {
            this.P0.setTips(R.string.night_mode_open_after_sunset);
            return;
        }
        if (nightMode != 2) {
            return;
        }
        int startMinute = hMNightModeConfigFromJsonString.getStartMinute();
        int endMinute = hMNightModeConfigFromJsonString.getEndMinute();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (startMinute >= endMinute) {
            sb2.append(getString(R.string.unit_tomorrow));
            sb2.append(StringUtil.SPACE);
        }
        sb.append(TimeUtils.formatTime((Context) DeviceXFunctionsKt.getContext(), startMinute));
        sb2.append(TimeUtils.formatTime((Context) DeviceXFunctionsKt.getContext(), endMinute));
        this.P0.setTips(((Object) sb) + Constants.WAVE_SEPARATOR + ((Object) sb2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D1(CompoundButton compoundButton, boolean z2) {
        if (compoundButton.isPressed()) {
            this.g1.setVibrate(z2);
            this.f1.saveInfo(2);
            Analytics.recordEvent(new CountEventBuilder(this.u1).setValue(StatEvent.DEVICE_OPERATE_VIBRATE_NOTIFY));
        }
    }

    private void D2() {
        WebHelper.launch(AboutSpeechSpecs.XIAOMI_SPEECH_ENGINE_USER_FAQ_URL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3() {
        HMMiLiDevice hMMiLiDevice = this.i1;
        int i2 = HMNowTimeConfig.INSTANCE.supportNowTime(this.k1, hMMiLiDevice == null ? null : hMMiLiDevice.getDeviceInfo()) ? 0 : 8;
        ListTile listTile = this.J0;
        if (listTile != null) {
            listTile.setVisibility(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E1(View view) {
        this.d1.getValue().startSettingItemLibraryActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E2() {
        if (this.r0) {
            this.r0 = false;
        }
    }

    private void E3() {
        if (HMNowTimeConfig.INSTANCE.fromNowTimeConfig().getEnable()) {
            this.J0.setTips(R.string.alert_enable);
        } else {
            this.J0.setTips(R.string.alert_disable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F1(View view) {
        CincoAnalytics.cincoOperateAnalytics("Identity_HeartRate");
        this.d1.getValue().startSportHRBroadcastActivity(this);
    }

    private void F2(int i2) {
        this.C.setText(TypefaceSpanUtils.getStyledDigitsSpannableStringBuilder(getString(R.string.battery_level_mili_setting, new Object[]{String.valueOf(i2)}), this, Font.KM, Integer.valueOf((int) ViewUtils.sp2px(this, 72.0f)), null));
    }

    private void F3() {
        if (OffWistConfig.INSTANCE.offWistConfig().getEnabled()) {
            this.R.setTips(R.string.alert_enable);
        } else {
            this.R.setTips(R.string.alert_disable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G1(View view) {
        CincoAnalytics.cincoOperateAnalytics("Bind_Limit");
        this.d1.getValue().startAvoidSpiteBindingActivity(this);
    }

    private void G2(HMColorTheme hMColorTheme) {
        HMLog.d(F1, "colorTheme:" + hMColorTheme, new Object[0]);
        this.i1.setColorTheme(hMColorTheme, new n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3() {
        HMMiLiDevice hMMiLiDevice = this.i1;
        if (hMMiLiDevice != null) {
            DeviceInfo deviceInfo = hMMiLiDevice.getDeviceInfo();
            if (deviceInfo == null || deviceInfo.getFirmwareVersion() <= ProfileUtils.getVersionCodeFromVersionName(G1)) {
                this.N.setVisibility(8);
            } else {
                this.N.setVisibility(0);
                ((HMMiLiProDevice) this.i1).getPassword(new d());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H1(View view) {
        startActivity(new Intent(this, (Class<?>) HealthDetectSettingActivity.class));
    }

    private void H2() {
        HMBaseBleDevice hMBaseBleDevice;
        if (NfcDeviceConfigKt.hasFeatureNfc() && (hMBaseBleDevice = (HMBaseBleDevice) this.W0.getValue().getDevice(HMDeviceType.MILI)) != null && hMBaseBleDevice.isConnected()) {
            ConnectionParameters connectionParameters = new ConnectionParameters();
            connectionParameters.setConnIntMin(10);
            connectionParameters.setConnIntMax(20);
            hMBaseBleDevice.setConnectionParameters(connectionParameters, new a0());
        }
    }

    private void H3(int i2) {
        this.O0.setTips(getString(i2 == 0 ? R.string.ring_type_default : R.string.ring_type_incall));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I1(View view) {
        if (this.Z0.getValue().isFastDoubleClick(view) || userInfoPolicyServiceLazy.getValue().interceptWithShowTip()) {
            return;
        }
        CincoAnalytics.cincoOperateAnalytics("Unbind");
        this.d1.getValue().startHMUnbindDeviceActivity(this, 0, 0);
        Analytics.recordEvent(new CountEventBuilder(this.u1).setValue("Unbind"));
    }

    private void I2(boolean z2) {
        int childCount = this.N0.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.N0.getChildAt(i2);
            if (childAt instanceof ListTile) {
                childAt.setEnabled(z2);
            }
        }
        if (z2) {
            this.S.setEnabled(this.g1.isLiftWristBrightView());
        }
        View viewFindViewById = findViewById(R.id.func_more_mask);
        viewFindViewById.setVisibility(z2 ? 8 : 0);
        viewFindViewById.setEnabled(z2);
        findViewById(R.id.item_more).setAlpha(z2 ? 1.0f : 0.6f);
    }

    private void I3() {
        if (ConfigHelperKt.hasFeature(Feature.SECONDARY_SCREEN_S, this.k1)) {
            this.D0.setVisibility(0);
        } else {
            this.D0.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J1(DialogInterface dialogInterface, int i2) {
        HMLogoutManager.processDataWhenLogout(this, new r());
    }

    private void J2(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    private void J3() {
        if (this.Z0.getValue().fromSedentaryConfig(this.f1.getMiliConfig().getSedentaryRemind()).isEnable()) {
            this.n0.setTips(R.string.alert_enable);
        } else {
            this.n0.setTips(R.string.alert_disable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K1(String str) {
        if (str == null || str.trim().length() <= 0) {
            getSubTitleTextView().setVisibility(8);
        } else {
            getSubTitleTextView().setVisibility(0);
            J2(getSubTitleTextView(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K2() {
        String strCurrentAlexaLanguage = this.z1.getValue().currentAlexaLanguage();
        for (final AlexaLanguage alexaLanguage : AlexaSupportUtilsKt.getAllAlexaLanguage()) {
            if (alexaLanguage.getLanguageCode().equals(strCurrentAlexaLanguage)) {
                if (this.q0 != null) {
                    runOnUiThread(new Runnable() { // from class: fa3
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.S1(alexaLanguage);
                        }
                    });
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K3(String str) {
        this.Z0.getValue().updateSpeechEngineAuthorize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L1(Device device, View view) {
        AlertDialogFragment alertDialogFragmentNewInstance = EditDeviceDisplayNameDialog.newInstance(device, getBaseContext(), new EditDeviceDisplayNameDialog.IDisplayNameListener() { // from class: z93
            @Override // com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog.IDisplayNameListener
            public final void onDisplayNameChanged(String str) {
                this.a.K1(str);
            }
        });
        if (alertDialogFragmentNewInstance != null) {
            alertDialogFragmentNewInstance.show(getSupportFragmentManager());
        }
    }

    private void L2(LocationExt locationExt) {
        HMLog.d(F1, "LocationExt:" + locationExt, new Object[0]);
        this.i1.setWearLocation(locationExt, new m());
    }

    private void L3() {
        this.J.setTitle(FwUpgradeFeature.supportSilentUpgrade(HMDeviceType.MILI) ? getString(R.string.system_version) : getString(R.string.mili_setting_fw_version));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M1(DialogInterface dialogInterface, int i2) {
        v2();
        E2();
    }

    private void M2() {
        final boolean zIsYorkLiftWristOn = DeviceXFunctionsKt.getPropertyStoreApi().isYorkLiftWristOn();
        HMLog.info(new Function0() { // from class: ja3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMMiLiSettingActivity.T1(zIsYorkLiftWristOn);
            }
        });
        if (this.k1 != HMDeviceSource.MILI_YORK || zIsYorkLiftWristOn == this.g1.isLiftWristBrightView()) {
            return;
        }
        HMLiftWristConfig hMLiftWristConfigFromLiftWristConfig = this.Z0.getValue().fromLiftWristConfig(this.g1.isLiftWristBrightView(), this.f1.getMiliConfig().getLiftWristTime());
        if (zIsYorkLiftWristOn) {
            hMLiftWristConfigFromLiftWristConfig.setAllDay(true);
        }
        hMLiftWristConfigFromLiftWristConfig.setEnable(zIsYorkLiftWristOn);
        this.f1.getMiliConfig().setLiftWristTime(this.Z0.getValue().toLiftWristConfig(hMLiftWristConfigFromLiftWristConfig));
        this.f1.getMiliConfig().setLiftWristBrightView(zIsYorkLiftWristOn);
        this.f1.saveInfo(2);
        this.e1.getValue().updateProfile(false);
        ((HMMiLiProDevice) this.i1).enableWristBright(hMLiftWristConfigFromLiftWristConfig, new q(zIsYorkLiftWristOn));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.xiaomi.hm.health.model.account.HMMiliConfig] */
    private void M3() {
        ?? IsUnlockEnabled = !TextUtils.isEmpty(this.s1) ? this.b1.getValue().isUnlockEnabled(this, this.s1) : 0;
        if (this.b1.getValue().isMiui(this)) {
            this.W.setTips(IsUnlockEnabled != 0 ? R.string.alert_enable : R.string.alert_disable);
        } else {
            this.W.setTips((CharSequence) null);
        }
        ?? miliConfig = this.f1.getMiliConfig();
        if (miliConfig.getScreenLock() != IsUnlockEnabled) {
            miliConfig.setScreenLock(IsUnlockEnabled);
            this.f1.saveInfo(2);
            this.e1.getValue().updateProfile(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N1(String str, DialogInterface dialogInterface, int i2) {
        T3(str);
    }

    private void N2() {
        if (HMDeviceConfig.hasFeatureReminder(this.k1)) {
            this.Y.setVisibility(0);
            List<Reminder> enableReminders = EventRemindManager.getEnableReminders();
            if (enableReminders != null && enableReminders.size() != 0) {
                this.Y.setTips(getResources().getQuantityString(R.plurals.event_remind_count, enableReminders.size(), Integer.valueOf(enableReminders.size())));
            } else if (Language.isSpainish()) {
                this.Y.setTips(getResources().getQuantityString(R.plurals.event_remind_count, 0, 0));
            } else {
                this.Y.setTips(getString(ConfigHelperKt.hasMiliFeature(Feature.SUPPORT_EVENT_REMIND_NEW_NAME) ? R.string.schedule_null : R.string.event_remind_close));
            }
            this.Y.setOnClickListener(new View.OnClickListener() { // from class: n93
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.U1(view);
                }
            });
        }
    }

    private void N3() {
        String deviceDescription = this.Z0.getValue().getDeviceDescription(this.k1);
        V2();
        int[] iArr = v.a;
        switch (iArr[this.k1.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                this.F.setVisibility(8);
                this.O.setVisibility(8);
                this.I.setVisibility(8);
                this.U.setVisibility(0);
                this.V.setVisibility(0);
                this.Q.setVisibility(0);
                this.S.setVisibility(0);
                this.S.setEnabled(this.g1.isLiftWristBrightView());
                this.L.setVisibility(8);
                this.M.setVisibility(8);
                this.B0.setVisibility(8);
                this.H.setVisibility(0);
                switch (iArr[this.k1.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        this.U.setVisibility(8);
                        this.V.setVisibility(8);
                        this.S.setVisibility(8);
                        this.C0.setVisibility(0);
                        this.E0.setVisibility(8);
                        this.L0.setVisibility(0);
                        this.V0.setVisibility(0);
                        this.Q.setSubtitle(R.string.watch_setting_ges_screen_tips);
                        k1();
                        this.B0.setVisibility(0);
                        this.H.setVisibility(8);
                        this.O0.setVisibility(0);
                        break;
                    case 4:
                        this.U.setVisibility(8);
                        this.V.setVisibility(8);
                        this.S.setVisibility(8);
                        if (Language.isSimplifiedChinese()) {
                            this.E0.setVisibility(0);
                            this.E0.setTitle(getString(R.string.play_with_device, new Object[]{deviceDescription}));
                        }
                        this.C0.setVisibility(0);
                        this.L0.setVisibility(0);
                        this.L0.setTitle(R.string.setting_peyto_apps_title_band);
                        this.L0.setSubtitle(R.string.setting_tempo_apps_tips);
                        this.V0.setVisibility(0);
                        k1();
                        this.B0.setVisibility(0);
                        this.H.setVisibility(8);
                        this.O0.setVisibility(0);
                        G3();
                        break;
                    case 5:
                        this.M.setVisibility(0);
                        this.L.setVisibility(0);
                        this.L.setTitle(getString(R.string.play_with_device, new Object[]{deviceDescription}));
                        break;
                    case 6:
                        HMLog.d(F1, "source:MILI_QINLING", new Object[0]);
                        break;
                    case 7:
                        HMLog.d(F1, "source:MILI_ROCKY", new Object[0]);
                        break;
                    case 8:
                        this.H.setVisibility(8);
                        break;
                    case 9:
                        this.H.setVisibility(8);
                        break;
                    default:
                        this.L.setVisibility(0);
                        this.L.setTitle(getString(R.string.play_with_device, new Object[]{deviceDescription}));
                        break;
                }
                break;
            case 10:
                this.H.setVisibility(8);
                this.O.setVisibility(8);
                break;
            case 11:
            case 12:
                this.F.setVisibility(8);
                this.H.setVisibility(8);
                this.O.setVisibility(8);
                break;
            case 13:
                this.F.setVisibility(8);
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                this.F.setVisibility(8);
                this.O.setVisibility(8);
                this.I.setVisibility(8);
                this.U.setVisibility(8);
                this.V.setVisibility(8);
                this.S.setVisibility(8);
                this.L.setVisibility(8);
                this.M.setVisibility(8);
                this.Q.setVisibility(0);
                this.C0.setVisibility(0);
                k1();
                this.B0.setVisibility(0);
                this.H.setVisibility(8);
                this.L0.setVisibility(0);
                ListTile listTile = this.L0;
                int i2 = R.string.setting_peyto_apps_title_band;
                listTile.setTitle(i2);
                ListTile listTile2 = this.L0;
                int i3 = R.string.setting_tempo_apps_tips;
                listTile2.setSubtitle(i3);
                this.V0.setVisibility(0);
                this.O0.setVisibility(0);
                C3();
                this.t0.setVisibility(0);
                this.E0.setVisibility(0);
                this.E0.setTitle(getString(R.string.play_with_device, new Object[]{deviceDescription}));
                HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_RIO;
                HMDeviceSource hMDeviceSource2 = this.k1;
                if (hMDeviceSource == hMDeviceSource2) {
                    this.B0.setVisibility(8);
                    this.H.setVisibility(8);
                    if (!Language.isEnglish()) {
                        this.E0.setVisibility(8);
                    }
                } else if (HMDeviceSource.MILI_TOKYO == hMDeviceSource2) {
                    this.S0.setVisibility(0);
                    this.E0.setVisibility(8);
                    this.t0.setVisibility(8);
                    this.W.setVisibility(8);
                    ListTile listTile3 = this.L0;
                    if (HMDeviceConfig.hasBoundWatch()) {
                        i2 = R.string.setting_peyto_apps_title;
                    }
                    listTile3.setTitle(i2);
                    ListTile listTile4 = this.L0;
                    if (HMDeviceConfig.hasBoundWatch()) {
                        i3 = R.string.setting_peyto_apps_tips;
                    }
                    listTile4.setSubtitle(i3);
                    DeviceInfo deviceInfo = this.i1.getDeviceInfo();
                    if (deviceInfo != null && deviceInfo.getDeviceFeature().hasSw(1)) {
                        this.I0.setVisibility(0);
                        this.J0.setVisibility(0);
                    }
                }
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                this.F.setVisibility(8);
                this.O.setVisibility(8);
                this.I.setVisibility(8);
                this.Q.setVisibility(0);
                this.L.setVisibility(8);
                this.M.setVisibility(8);
                this.U.setVisibility(8);
                this.V.setVisibility(8);
                this.S.setVisibility(8);
                this.B0.setVisibility(0);
                k1();
                this.H.setVisibility(8);
                this.O0.setVisibility(0);
                this.C0.setVisibility(0);
                this.L0.setVisibility(0);
                this.L0.setTitle(HMDeviceConfig.hasBoundWatch() ? R.string.setting_peyto_apps_title : R.string.setting_peyto_apps_title_band);
                this.L0.setSubtitle(HMDeviceConfig.hasBoundWatch() ? R.string.setting_peyto_apps_tips : R.string.setting_tempo_apps_tips);
                ListTile listTile5 = this.D0;
                HMDeviceSource hMDeviceSource3 = this.k1;
                HMDeviceSource hMDeviceSource4 = HMDeviceSource.MILI_CINCO_L;
                listTile5.setVisibility((hMDeviceSource3 == hMDeviceSource4 || hMDeviceSource3 == HMDeviceSource.MILI_CINCO) ? 8 : 0);
                if (this.k1 == HMDeviceSource.MILI_ANETO) {
                    this.W.setVisibility(8);
                    this.O0.setVisibility(8);
                    this.Q.setVisibility(8);
                    this.D0.setVisibility(8);
                }
                HMDeviceSource hMDeviceSource5 = HMDeviceSource.MILI_BEATS;
                HMDeviceSource hMDeviceSource6 = this.k1;
                boolean z2 = (hMDeviceSource5 == hMDeviceSource6 || HMDeviceSource.MILI_CINCO == hMDeviceSource6) && Language.isSimplifiedChinese();
                HMDeviceSource hMDeviceSource7 = HMDeviceSource.MILI_BEATS_W;
                HMDeviceSource hMDeviceSource8 = this.k1;
                if (hMDeviceSource7 == hMDeviceSource8 || hMDeviceSource4 == hMDeviceSource8 || z2) {
                    this.E0.setVisibility(0);
                    this.E0.setTitle(String.format(getString(R.string.play_ch_tips), this.Z0.getValue().getMiLiDeviceDescription(this.k1)));
                }
                if (S3()) {
                    this.M0.setVisibility(0);
                }
                C3();
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                this.F.setVisibility(8);
                this.O.setVisibility(8);
                this.I.setVisibility(8);
                this.S.setEnabled(this.g1.isLiftWristBrightView());
                this.L.setVisibility(8);
                this.M.setVisibility(8);
                this.U.setVisibility(8);
                this.V.setVisibility(8);
                this.S.setVisibility(8);
                this.C0.setVisibility(0);
                this.Q.setVisibility(0);
                this.Q.setSubtitle(R.string.watch_setting_ges_screen_tips);
                k1();
                this.B0.setVisibility(0);
                this.H.setVisibility(8);
                this.O0.setVisibility(0);
                this.L0.setVisibility(0);
                HMDeviceSource hMDeviceSource9 = HMDeviceSource.MILI_DTH;
                HMDeviceSource hMDeviceSource10 = this.k1;
                if (hMDeviceSource9 == hMDeviceSource10 || HMDeviceSource.MILI_DTH_W == hMDeviceSource10) {
                    this.E0.setVisibility(8);
                    this.E0.setTitle(String.format(getString(R.string.play_ch_tips), this.Z0.getValue().getMiLiDeviceDescription(this.k1)));
                }
                DeviceInfo deviceInfo2 = this.i1.getDeviceInfo();
                if (deviceInfo2 != null && deviceInfo2.getDeviceFeature().hasSw(1)) {
                    this.I0.setVisibility(0);
                }
                break;
        }
        if (this.W0.getValue().supportHealthDetect() && this.B0.getVisibility() == 0) {
            this.B0.setVisibility(8);
        }
        w3();
        setTitleText(deviceDescription);
        getTitleTextView().setFocusableInTouchMode(true);
        getTitleTextView().setEllipsize(TextUtils.TruncateAt.MARQUEE);
        getTitleTextView().setMarqueeRepeatLimit(1);
        String boundDeviceAddress = this.j1.getBoundDeviceAddress(HMDeviceType.MILI);
        this.P.setTips(boundDeviceAddress);
        this.Z0.getValue().enableGetMacAddress(this, this.P, boundDeviceAddress);
        P3();
        n3();
        I3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O1(View view) {
        CincoAnalytics.cincoOperateAnalytics("LightScreen");
        this.d1.getValue().startGesScreenActivity(this, this.h1);
    }

    private void O2(@Nullable String str, String str2, int i2, DialogInterface.OnClickListener onClickListener) {
        this.w1.hideLoading();
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(this);
        if (!TextUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        builder.setCancelable(false);
        builder.setMessage(str2);
        builder.setPositiveButton(i2, onClickListener);
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        builder.show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O3(boolean z2) {
        if (z2) {
            I2(true);
            this.B.setVisibility(8);
            this.D.setVisibility(0);
            this.E.setVisibility(0);
            this.C.setVisibility(0);
            l3();
            HMMiLiDevice hMMiLiDevice = this.i1;
            if (hMMiLiDevice != null) {
                m3(hMMiLiDevice.getBatteryInfo());
                r3();
                q3();
                return;
            }
            return;
        }
        I2(false);
        HMMiLiDevice hMMiLiDevice2 = this.i1;
        if (hMMiLiDevice2 != null && !hMMiLiDevice2.isConnected()) {
            this.B.setVisibility(0);
            this.D.setVisibility(8);
            this.E.setVisibility(8);
            this.C.setVisibility(8);
            this.A.setVisibility(8);
            return;
        }
        this.B.setVisibility(8);
        this.D.setVisibility(0);
        this.E.setVisibility(0);
        this.C.setVisibility(0);
        HMMiLiDevice hMMiLiDevice3 = this.i1;
        if (hMMiLiDevice3 != null) {
            m3(hMMiLiDevice3.getBatteryInfo());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P1(IRealtimeData iRealtimeData, View view) {
        iRealtimeData.start(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P2(final int i2) {
        new AlertDialogFragment.Builder(this).setMessage(R.string.setting_heartrate_detect_battery_tips).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: ga3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.a.V1(i2, dialogInterface, i3);
            }
        }).setCancelable(true).show(getSupportFragmentManager());
    }

    private void P3() {
        int watchfaceType = WatchSkinUtils.getWatchfaceType(this.k1);
        if (HMDeviceConfig.isSupportNewWatchStore()) {
            this.s0.setVisibility(0);
            this.s0.setTitle(R.string.small_tool_item_watchface_store);
        } else {
            this.s0.setTitle(R.string.watch_skin_setting);
        }
        if (this.k1 == HMDeviceSource.MILI_YORK) {
            this.s0.setLeading(R.drawable.icon_cinco_watch_skin);
            this.s0.setTitle(R.string.watch_skin_store);
        }
        switch (watchfaceType) {
            case 0:
            case 3:
            case 7:
            case 11:
            case 12:
                this.s0.setVisibility(0);
                this.s0.setLeading(R.drawable.icon_watch_skin);
                break;
            case 1:
                this.s0.setVisibility(0);
                this.s0.setLeading(R.drawable.icon_watch_skin_tempo);
                break;
            case 2:
            case 8:
                this.s0.setVisibility(0);
                this.s0.setLeading(R.drawable.icon_cinco_watch_skin);
                this.s0.setTitle(HMDeviceConfig.isMiBand4() ? R.string.watch_skin_store : R.string.watch_skin_setting);
                break;
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 13:
            case 14:
            case 15:
            case 16:
            case 19:
                this.s0.setVisibility(0);
                this.s0.setLeading(R.drawable.icon_dial_pyh);
                break;
            case 17:
                this.s0.setVisibility(0);
                this.s0.setLeading(R.drawable.watch_skin_icon_venice);
                break;
        }
    }

    private void Q2(Activity activity) {
        if (activity.isDestroyed()) {
            return;
        }
        int i2 = R.string.checking_new_apk;
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(activity, getString(i2));
        this.E1 = loadingDialogShowDialog;
        loadingDialogShowDialog.setMessage(getString(i2));
        this.E1.setCancelable(false);
        this.E1.show();
        this.D1.sendEmptyMessageDelayed(22, 30000L);
    }

    private void Q3(String str) {
        int i2 = R.string.left_hand;
        str.hashCode();
        switch (str) {
            case "ONBODY":
            case "PENDANT":
                int i3 = v.a[this.k1.ordinal()];
                if (i3 != 6) {
                    if (i3 == 12) {
                        i2 = R.string.wear_neck;
                    } else {
                        i2 = R.string.body;
                    }
                    break;
                } else {
                    i2 = R.string.chest;
                    break;
                }
                break;
            case "RIGHT_HAND":
                if (this.k1 == HMDeviceSource.MILI_AMAZFIT) {
                    i2 = R.string.wear_wrist;
                    break;
                } else {
                    i2 = R.string.right_hand;
                    break;
                }
                break;
            case "LEFT_HAND":
                if (this.k1 == HMDeviceSource.MILI_AMAZFIT) {
                    i2 = R.string.wear_wrist;
                    break;
                }
                break;
        }
        this.G.setTips(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit R1(final String str) {
        this.G0.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        this.G0.setOnClickListener(new View.OnClickListener() { // from class: u93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebHelper.launch(str);
            }
        });
        return null;
    }

    private void R2() {
        HashMap<HMDeviceSource, SortableAppItems> displaySetting = HMAppSortDataManager.getInstance().getDisplaySetting();
        SortableAppItems sortableAppItems = displaySetting.get(HMDeviceSource.MILI_PRO);
        this.l1 = new HMProDisplayItem(HMAppSortDataManager.toProDisplay(sortableAppItems));
        String[] stringArray = getResources().getStringArray(R.array.mili_pro_display_items);
        int[] iArr = {R.drawable.icon_time, R.drawable.icon_step, R.drawable.icon_mileage, R.drawable.icon_calorie, R.drawable.icon_heart, R.drawable.icon_power};
        int i2 = R.color.dark_sky_blue_three;
        int[] iArr2 = {i2, i2, i2, i2, i2, i2};
        boolean[] zArr = new boolean[stringArray.length];
        zArr[0] = true;
        boolean[] zArr2 = new boolean[stringArray.length];
        zArr2[0] = false;
        for (int i3 = 1; i3 < stringArray.length; i3++) {
            zArr[i3] = this.l1.isShow(i3 - 1);
            zArr2[i3] = true;
        }
        HMDeviceSource hMDeviceSource = this.k1;
        new AlertDialogFragment.Builder(this).setTitle(R.string.mili_pro_display_item_title).setPositiveButton(R.string.yes, new o(sortableAppItems, displaySetting)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setMultiChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(R.array.mili_pro_display_items).setIcons(iArr, iArr2).setItemsVisible(new boolean[]{true, true, true, true, !(hMDeviceSource == HMDeviceSource.MILI_NFC || hMDeviceSource == HMDeviceSource.MILI_PRO_I), true}).setItemsChecked(zArr).setItemsEnable(zArr2), new DialogInterface.OnMultiChoiceClickListener() { // from class: c93
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i4, boolean z2) {
                this.a.W1(dialogInterface, i4, z2);
            }
        }).show(getSupportFragmentManager(), ServerProtocol.DIALOG_PARAM_DISPLAY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R3() {
        HMMiLiDevice hMMiLiDevice = this.i1;
        DeviceInfo deviceInfo = hMMiLiDevice == null ? null : hMMiLiDevice.getDeviceInfo();
        com.xiaomi.hm.health.bt.profile.feature.Feature deviceFeature = deviceInfo != null ? deviceInfo.getDeviceFeature() : null;
        int i2 = deviceFeature != null && deviceFeature.hasSw(1) ? 0 : 8;
        ListTile listTile = this.I0;
        if (listTile != null) {
            listTile.setVisibility(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S1(AlexaLanguage alexaLanguage) {
        this.q0.setTips(alexaLanguage.getLanguageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S2(CompoundButton compoundButton, boolean z2) {
        compoundButton.setChecked(!z2);
        this.w1.setFail(z2 ? R.string.mili_setting_sleep_assist_open_failed : R.string.mili_setting_sleep_assist_close_failed);
    }

    private boolean S3() {
        return ConfigHelperKt.hasFeature(Feature.KONGMING_SERIES_S, this.k1) || ConfigHelperKt.hasFeature(Feature.YORK_SERIES_S, this.k1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String T1(boolean z2) {
        return " york lift wrist is on: " + z2;
    }

    private void T2() {
        int iO1 = o1();
        int i2 = 2;
        if (iO1 == 1) {
            i2 = 1;
        } else if (iO1 == 2) {
            i2 = 0;
        }
        new AlertDialogFragment.Builder(this).setTitle(R.string.setting_heartrate_detect_select).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(R.array.setting_hr_types).setItemsSummary(R.array.setting_hr_types_desc).setItemChoice(i2), new k(i2, iO1)).setCancelable(true).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T3(String str) {
        this.w1.showLoading();
        XiaomiTokenMananger.reAuthorization(this, str, new t(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U1(View view) {
        ReminderEventFactory.INSTANCE.createEvent(this, this.k1).getA();
    }

    private boolean U2() {
        return (HMDeviceConfig.supportLibrary() && Language.isSimplifiedChinese()) || HMDeviceConfig.supportLaptopUnLock() || HMDeviceConfig.hasFeatureOffWistLock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U3() {
        this.w1.showLoading();
        XiaomiTokenMananger.bind(this, new u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V1(int i2, DialogInterface dialogInterface, int i3) {
        if (i2 == 0) {
            t3(2);
            this.i1.enableFullHeartRate(true, this.B1.getFreq(), new i());
        } else if (i2 == 1) {
            t3(1);
            this.i1.enableSleepAssistHr(true, new j());
        }
    }

    private void V2() {
        final HMBaseDevice miliDevice = this.W0.getValue().getMiliDevice();
        if (miliDevice == null) {
            HMLog.i(F1, "device info null", new Object[0]);
        } else {
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: ha3
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.Z1(miliDevice);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W1(DialogInterface dialogInterface, int i2, boolean z2) {
        HMLog.d(F1, "onClick " + i2 + " " + z2, new Object[0]);
        this.l1.show(i2 + (-1), z2);
        e1(i2, z2);
    }

    private void W2() {
        final HMCalendarConfig hMCalendarConfigFromJson = HMCalendarConfig.fromJson();
        boolean zEquals = TextUtils.equals(hMCalendarConfigFromJson.getCalendar(), HMCalendarConfig.VALUE_LUNAR);
        String[] strArr = {getString(R.string.close), getString(R.string.pyh_other_calendar_lunar)};
        AlertDialogFragment.Builder title = new AlertDialogFragment.Builder(this).setTitle(R.string.pyh_other_calendar);
        AlertDialogFragment.ChoiceItems itemChoice = new AlertDialogFragment.ChoiceItems().setItems(strArr).setItemChoice(zEquals ? 1 : 0);
        final int i2 = zEquals ? 1 : 0;
        title.setSingleChoiceItems(itemChoice, new DialogInterface.OnClickListener() { // from class: qa3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.a.a2(i2, hMCalendarConfigFromJson, dialogInterface, i3);
            }
        }).setCancelable(true).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X1() {
        this.p0.setVisibility(0);
    }

    private void X2() {
        final int i2;
        final HMCalendarConfig hMCalendarConfigFromJson = HMCalendarConfig.fromJson();
        String startDayOfWeek = hMCalendarConfigFromJson.getStartDayOfWeek();
        if (TextUtils.equals(startDayOfWeek, HMCalendarConfig.VALUE_SUN)) {
            i2 = 1;
        } else {
            i2 = TextUtils.equals(startDayOfWeek, HMCalendarConfig.VALUE_SAT) ? 2 : 0;
        }
        new AlertDialogFragment.Builder(this).setTitle(R.string.pyh_start_day_of_week).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(new String[]{getString(R.string.pyh_monday), getString(R.string.pyh_sunday), getString(R.string.pyh_saturday)}).setItemChoice(i2), new DialogInterface.OnClickListener() { // from class: ra3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.a.b2(i2, hMCalendarConfigFromJson, dialogInterface, i3);
            }
        }).setCancelable(true).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y1() {
        this.q0.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y2() {
        IconToast.showError(this, R.string.long_sit_set_failed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z1(HMBaseDevice hMBaseDevice) {
        if (DeviceSpeechSupportFuncKt.supportMIAI(hMBaseDevice)) {
            runOnUiThread(new Runnable() { // from class: ca3
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.X1();
                }
            });
        }
        if (this.A1.getValue().needShowAlexa(getApplicationContext())) {
            K2();
            runOnUiThread(new Runnable() { // from class: ea3
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.Y1();
                }
            });
        }
    }

    /* JADX WARN: switch over string: strings are not added: [[RIGHT_HAND], [LEFT_HAND]] */
    private void Z2() {
        String wearHand = this.g1.getWearHand();
        wearHand.hashCode();
        int i2 = 0;
        switch (wearHand) {
            case "ONBODY":
            case "PENDANT":
                i2 = 1;
                break;
        }
        final LocationExt locationExt = new LocationExt();
        new AlertDialogFragment.Builder(this).setTitle(R.string.wear_hand).setCancelable(true).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItemChoice(i2).setItems(R.array.amazfit_wear_type), new DialogInterface.OnClickListener() { // from class: ua3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.a.c2(locationExt, dialogInterface, i3);
            }
        }).show(getSupportFragmentManager(), "showSetAmazfitWearUI");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a2(int i2, HMCalendarConfig hMCalendarConfig, DialogInterface dialogInterface, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 == 0) {
            hMCalendarConfig.setCalendar(HMCalendarConfig.VALUE_SOLAR);
        } else if (i3 == 1) {
            hMCalendarConfig.setCalendar(HMCalendarConfig.VALUE_LUNAR);
        }
        hMCalendarConfig.saveAndUpload();
        this.Q0.setTips(m1(hMCalendarConfig.getCalendar()));
        HMLog.i(F1, "calendar: " + hMCalendarConfig.toJson(), new Object[0]);
        HMMiLiDevice hMMiLiDevice = this.i1;
        if (hMMiLiDevice == null || !hMMiLiDevice.isConnected()) {
            HMLog.i(F1, "set calendar fail", new Object[0]);
        } else {
            ((HMMiLiProDevice) this.i1).setOtherCalendar((byte) hMCalendarConfig.getCalendarIndex(), new b());
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void a3() {
        int i2;
        String lightColor = this.g1.getLightColor();
        lightColor.hashCode();
        byte b2 = -1;
        switch (lightColor.hashCode()) {
            case -1955522002:
                if (lightColor.equals(HMMiliConfig.ORANGE)) {
                    b2 = 0;
                }
                break;
            case 81009:
                if (lightColor.equals(HMMiliConfig.RED)) {
                    b2 = 1;
                }
                break;
            case 2041946:
                if (lightColor.equals(HMMiliConfig.BLUE)) {
                    b2 = 2;
                }
                break;
            case 68081379:
                if (lightColor.equals(HMMiliConfig.GREEN)) {
                    b2 = 3;
                }
                break;
        }
        switch (b2) {
            case 0:
                i2 = 1;
                break;
            case 1:
                i2 = 3;
                break;
            case 2:
            default:
                i2 = 0;
                break;
            case 3:
                i2 = 2;
                break;
        }
        final HMColorTheme hMColorTheme = new HMColorTheme(true);
        new AlertDialogFragment.Builder(this).setCancelable(true).setTitle(R.string.light_color_title).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(R.array.colors).setColors(new int[]{R.color.mili_blue, R.color.mili_orange, R.color.mili_green, R.color.mili_red}).setItemChoice(i2), new DialogInterface.OnClickListener() { // from class: sa3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.a.d2(hMColorTheme, dialogInterface, i3);
            }
        }).setNeutralButton(R.string.cancel, (DialogInterface.OnClickListener) null).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b2(int i2, HMCalendarConfig hMCalendarConfig, DialogInterface dialogInterface, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 == 0) {
            hMCalendarConfig.setStartDayOfWeek(HMCalendarConfig.VALUE_MON);
        } else if (i3 == 1) {
            hMCalendarConfig.setStartDayOfWeek(HMCalendarConfig.VALUE_SUN);
        } else if (i3 == 2) {
            hMCalendarConfig.setStartDayOfWeek(HMCalendarConfig.VALUE_SAT);
        }
        hMCalendarConfig.saveAndUpload();
        this.R0.setTips(p1(hMCalendarConfig.getStartDayOfWeek()));
        HMLog.i(F1, "firstDayOfWeek: " + hMCalendarConfig.toJson(), new Object[0]);
        HMMiLiDevice hMMiLiDevice = this.i1;
        if (hMMiLiDevice == null || !hMMiLiDevice.isConnected()) {
            HMLog.i(F1, "set startDayOfWeek fail", new Object[0]);
        } else {
            ((HMMiLiProDevice) this.i1).setStartDayOfWeek((byte) hMCalendarConfig.getStartDayOfWeekIndex(), new c());
        }
    }

    private void b3() {
        new AlertDialogFragment.Builder(this).setTitle(R.string.setting_peyto_long_press_set_title).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(R.array.chaohu_setting_run_types).setItemChoice(this.g1.getLongPressSettings()), new h()).setCancelable(true).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c2(LocationExt locationExt, DialogInterface dialogInterface, int i2) {
        if (i2 == 0) {
            this.g1.setWearHand("LEFT_HAND");
            locationExt.setWear(LocationExt.Wear.WRIST);
            locationExt.setWay(LocationExt.Way.LEFT);
            L2(locationExt);
            Q3("LEFT_HAND");
            return;
        }
        if (i2 != 1) {
            return;
        }
        this.g1.setWearHand(HMMiliConfig.ONBODY);
        locationExt.setWear(LocationExt.Wear.CHEST);
        locationExt.setWay(LocationExt.Way.OTHER);
        L2(locationExt);
        Q3(HMMiliConfig.ONBODY);
    }

    private void c3() {
        this.d1.getValue().startHMAppSortActivity(this, this.k1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d2(HMColorTheme hMColorTheme, DialogInterface dialogInterface, int i2) {
        if (i2 == 0) {
            this.g1.setLightColor(HMMiliConfig.BLUE);
            hMColorTheme.setColor(HMColorTheme.Color.BLUE);
            G2(hMColorTheme);
            x3(HMMiliConfig.BLUE);
            return;
        }
        if (i2 == 1) {
            this.g1.setLightColor(HMMiliConfig.ORANGE);
            hMColorTheme.setColor(HMColorTheme.Color.ORANGE);
            G2(hMColorTheme);
            x3(HMMiliConfig.ORANGE);
            return;
        }
        if (i2 == 2) {
            this.g1.setLightColor(HMMiliConfig.GREEN);
            hMColorTheme.setColor(HMColorTheme.Color.GREEN);
            G2(hMColorTheme);
            x3(HMMiliConfig.GREEN);
            return;
        }
        if (i2 != 3) {
            return;
        }
        this.g1.setLightColor(HMMiliConfig.RED);
        hMColorTheme.setColor(HMColorTheme.Color.RED);
        G2(hMColorTheme);
        x3(HMMiliConfig.RED);
    }

    private void d3() {
        new AlertDialogFragment.Builder(this).setTitle(R.string.find_phone_ring_type).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(R.array.ring_types).setItemChoice(DeviceXFunctionsKt.getPropertyStoreApi().getRingType()), new DialogInterface.OnClickListener() { // from class: k93
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.e2(dialogInterface, i2);
            }
        }).setCancelable(true).show(getSupportFragmentManager());
    }

    private void e1(int i2, boolean z2) {
        String str;
        if (i2 == 0) {
            return;
        }
        if (i2 == 1) {
            str = z2 ? StatEvent.DeviceSetting.MILI_DISPLAY_SETTINGS_STEP_CHECK : StatEvent.DeviceSetting.MILI_DISPLAY_SETTINGS_STEP_UNCHECK;
        } else if (i2 == 2) {
            str = z2 ? StatEvent.DeviceSetting.MILI_DISPLAY_SETTINGS_DIS_CHECK : StatEvent.DeviceSetting.MILI_DISPLAY_SETTINGS_DIS_UNCHECK;
        } else if (i2 == 3) {
            str = z2 ? StatEvent.DeviceSetting.MILI_DISPLAY_SETTINGS_CAL_CHECK : StatEvent.DeviceSetting.MILI_DISPLAY_SETTINGS_CAL_UNCHECK;
        } else if (i2 == 4) {
            str = z2 ? StatEvent.DeviceSetting.MILI_DISPLAY_SETTINGS_HR_CHECK : StatEvent.DeviceSetting.MILI_DISPLAY_SETTINGS_HR_UNCHECK;
        } else if (i2 != 5) {
            str = "";
        } else {
            str = z2 ? StatEvent.DeviceSetting.MILI_DISPLAY_SETTINGS_BATTERY_CHECK : StatEvent.DeviceSetting.MILI_DISPLAY_SETTINGS_BATTERY_UNCHECK;
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.DeviceSetting.MILI_DISPLAY_SETTINGS).setValue(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e2(DialogInterface dialogInterface, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", i2);
            DeviceXFunctionsKt.getPropertyStoreApi().setProperty(Property.PROPERTY_RINGTYPE, jSONObject.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        H3(i2);
    }

    private void e3() {
        int i2;
        String wearHand = this.g1.getWearHand();
        if (s1()) {
            i2 = R.array.wear_type;
        } else {
            i2 = this.k1 == HMDeviceSource.MILI_QINLING ? R.array.wear_type_chest : R.array.wear_type_body;
        }
        wearHand.hashCode();
        int i3 = 2;
        switch (wearHand) {
            case "ONBODY":
            case "PENDANT":
                break;
            case "RIGHT_HAND":
                i3 = 1;
                break;
            case "LEFT_HAND":
            default:
                i3 = 0;
                break;
        }
        final LocationExt locationExt = new LocationExt();
        new AlertDialogFragment.Builder(this).setTitle(R.string.wear_hand).setCancelable(true).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItemChoice(i3).setItems(i2), new DialogInterface.OnClickListener() { // from class: ta3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                this.a.f2(locationExt, dialogInterface, i4);
            }
        }).show(getSupportFragmentManager(), "tag");
    }

    private boolean f1(String str) {
        if (!s1()) {
            return false;
        }
        if (!HMMiliConfig.ONBODY.equals(str) && !HMMiliConfig.ONBODY_IOS.equals(str)) {
            return false;
        }
        LocationExt locationExt = new LocationExt();
        this.g1.setWearHand("LEFT_HAND");
        locationExt.setWay(LocationExt.Way.LEFT);
        L2(locationExt);
        Q3("LEFT_HAND");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f2(LocationExt locationExt, DialogInterface dialogInterface, int i2) {
        if (i2 == 0) {
            this.g1.setWearHand("LEFT_HAND");
            locationExt.setWear(LocationExt.Wear.WRIST);
            locationExt.setWay(LocationExt.Way.LEFT);
            L2(locationExt);
            Q3("LEFT_HAND");
            return;
        }
        if (i2 == 1) {
            this.g1.setWearHand("RIGHT_HAND");
            locationExt.setWear(LocationExt.Wear.WRIST);
            locationExt.setWay(LocationExt.Way.RIGHT);
            L2(locationExt);
            Q3("RIGHT_HAND");
            return;
        }
        if (i2 != 2) {
            return;
        }
        this.g1.setWearHand(HMMiliConfig.ONBODY);
        locationExt.setWear(LocationExt.Wear.CHEST);
        locationExt.setWay(LocationExt.Way.OTHER);
        L2(locationExt);
        Q3(HMMiliConfig.ONBODY);
    }

    private void f3() {
        int timePanelType = this.g1.getTimePanelType();
        int timePanelLang = this.g1.getTimePanelLang();
        int systemLang = this.Z0.getValue().getSystemLang();
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) this.W0.getValue().getDevice(HMDeviceType.MILI);
        if (this.n1 == null) {
            View viewInflate = View.inflate(this, R.layout.time_type_select_layout, null);
            this.n1 = viewInflate;
            this.p1 = (CheckBox) viewInflate.findViewById(R.id.checkbox_time_only);
            this.q1 = (CheckBox) this.n1.findViewById(R.id.checkbox_time_date);
            this.r1 = (ImageView) this.n1.findViewById(R.id.iv_time_date);
            AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(this);
            int i2 = R.string.time_type_title;
            this.o1 = builder.setTitle(i2).setMessage(getString(i2)).setContentView(this.n1).setCancelable(false).setPositiveButton(getString(R.string.yes), new p(hMMiLiProDevice, systemLang)).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: a93
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    HMMiLiSettingActivity.g2(dialogInterface, i3);
                }
            }).create();
            this.p1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: w93
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    this.a.h2(compoundButton, z2);
                }
            });
            this.q1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: x93
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    this.a.i2(compoundButton, z2);
                }
            });
            this.n1.findViewById(R.id.ll_time_only).setOnClickListener(new View.OnClickListener() { // from class: j93
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.j2(view);
                }
            });
            this.n1.findViewById(R.id.ll_time_date).setOnClickListener(new View.OnClickListener() { // from class: o93
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.k2(view);
                }
            });
        }
        if (timePanelType == 0) {
            this.p1.setChecked(true);
            this.q1.setChecked(false);
        } else {
            this.p1.setChecked(false);
            this.q1.setChecked(true);
        }
        if (systemLang == 0) {
            this.r1.setImageResource(R.drawable.time_panel_date_cn);
        } else if (systemLang != 1) {
            this.r1.setImageResource(R.drawable.time_panel_date_en);
        } else {
            this.r1.setImageResource(R.drawable.time_panel_date_tw);
        }
        HMLog.i(F1, "timePanel :  " + timePanelType + ";" + timePanelLang + ";sysLang = " + systemLang, new Object[0]);
        this.o1.show(getSupportFragmentManager());
    }

    private void g1() {
        if (!this.Z0.getValue().xiaoAiReginAccess()) {
            new AlertDialogFragment.Builder(this).setCancelable(true).setMessage(R.string.speech_account_authorize_illegal_region_content).setNeutralButton(R.string.speech_account_authorize_base_dialog_button_custome_operation_got_it, new DialogInterface.OnClickListener() { // from class: b93
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    dialogInterface.dismiss();
                }
            }).create().show(getSupportFragmentManager());
            return;
        }
        DeviceInfo deviceInfo = this.i1.getDeviceInfo();
        String serialNumber = deviceInfo == null ? null : deviceInfo.getSerialNumber();
        HMDeviceSource hMDeviceSource = this.k1;
        if (hMDeviceSource == null) {
            hMDeviceSource = HMDeviceSource.VDEVICE;
        }
        if (XiaomiTokenMananger.hasXiaomiAiToken(hMDeviceSource.getValue(), serialNumber)) {
            D2();
        } else if (NetUtil.isNetworkConnected(getApplicationContext())) {
            v2();
        } else {
            IconToast.showError(getApplicationContext(), getString(R.string.no_network_connection));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g2(DialogInterface dialogInterface, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener) {
        this.w1.hideLoading();
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(getApplicationContext());
        builder.setCancelable(false);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setNegativeButton(str3, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(str4, onClickListener);
        builder.show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h1(int i2) {
        HMMiLiSettingActivity hMMiLiSettingActivity = L1.get();
        if (hMMiLiSettingActivity != null && i2 == 22) {
            HMLog.d("timeout", "MESSAGE_TIMEOUT", new Object[0]);
            hMMiLiSettingActivity.r1(hMMiLiSettingActivity);
            IconToast.showSuccess(hMMiLiSettingActivity, R.string.fw_uptodate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h2(CompoundButton compoundButton, boolean z2) {
        if (!z2) {
            this.q1.setEnabled(false);
            this.p1.setEnabled(true);
        } else {
            this.q1.setEnabled(true);
            this.q1.setChecked(false);
            this.p1.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        this.w1.hideLoading();
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(getApplicationContext());
        builder.setCancelable(false);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setNegativeButton(str3, onClickListener);
        builder.setPositiveButton(str4, onClickListener2);
        builder.show(getSupportFragmentManager());
    }

    private void i1() {
        HMMiLiDevice hMMiLiDevice = (HMMiLiDevice) this.W0.getValue().getDevice(HMDeviceType.MILI);
        if (this.f1.getMiliConfig().isEnableConnectedBtAdv()) {
            this.f1.getMiliConfig().setEnableConnectedBtAdv(false);
            this.f1.saveInfo(2);
            this.e1.getValue().updateProfile(false);
            if (hMMiLiDevice == null || !hMMiLiDevice.isConnected()) {
                return;
            }
            hMMiLiDevice.enableConnectedAdv(false, new HMCallback());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i2(CompoundButton compoundButton, boolean z2) {
        if (!z2) {
            this.p1.setEnabled(false);
            this.q1.setEnabled(true);
        } else {
            this.p1.setEnabled(true);
            this.p1.setChecked(false);
            this.q1.setEnabled(false);
        }
    }

    private void i3() {
        this.w1.showLoading();
        XiaomiTokenMananger.getBindInfo(new s());
    }

    @SuppressLint({"StringFormatInvalid"})
    private void initViews() {
        String wearHand = this.g1.getWearHand();
        String lightColor = this.g1.getLightColor();
        this.N0 = (LinearLayout) findViewById(R.id.item_layout);
        this.C = (TextView) findViewById(R.id.mili_setting_battery_level);
        this.D = (TextView) findViewById(R.id.mili_setting_battery_tips);
        this.E = (TextView) findViewById(R.id.mili_setting_low_battery_tips);
        this.A = (ImageView) findViewById(R.id.mili_setting_battery_img);
        this.B = (ImageView) findViewById(R.id.disconnected_img);
        this.F = (ListTile) findViewById(R.id.mili_setting_light_color);
        x3(lightColor);
        this.G = (ListTile) findViewById(R.id.mili_setting_set_wear);
        if (!f1(wearHand)) {
            Q3(wearHand);
        }
        HMDeviceSource hMDeviceSource = this.h1;
        HMDeviceSource hMDeviceSource2 = HMDeviceSource.MILI_ANETO;
        if (hMDeviceSource == hMDeviceSource2) {
            this.G.setVisibility(8);
        }
        this.H = (ListTile) findViewById(R.id.mili_setting_sleep_assist);
        this.V0 = findViewById(R.id.mili_setting_watch_divider);
        this.H.setOnCheckedChangeListener(new a());
        ListTile listTile = (ListTile) findViewById(R.id.mili_setting_vibrate_notify);
        this.I = listTile;
        listTile.setChecked(this.g1.isVibrate());
        this.I.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: y93
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                this.a.D1(compoundButton, z2);
            }
        });
        this.L = (ListTile) findViewById(R.id.play_miband2);
        this.M = (ListTile) findViewById(R.id.miband2_reset);
        this.N = (ListTile) findViewById(R.id.mili_setting_password);
        this.A0 = (ListTile) findViewById(R.id.mili_setting_long_press_item);
        y3(this.g1.getLongPressSettings());
        this.B0 = (ListTile) findViewById(R.id.mili_setting_hr_detect_item);
        this.C0 = (ListTile) findViewById(R.id.mili_setting_weather_item);
        this.D0 = (ListTile) findViewById(R.id.mili_setting_shotcut_apps_item);
        ListTile listTile2 = (ListTile) findViewById(R.id.mili_setting_playch_item);
        this.E0 = listTile2;
        listTile2.setTitle(getString(R.string.play_ch_tips, new Object[]{getString(R.string.mili_settting_mili_peyto)}));
        this.F0 = (ListTile) findViewById(R.id.mili_setting_faq_item);
        this.G0 = (ListTile) findViewById(R.id.mili_setting_instruction_item);
        this.L0 = (ListTile) findViewById(R.id.mili_setting_apps_item);
        this.M0 = (ListTile) findViewById(R.id.mili_setting_sport_sort);
        this.J = (ListTile) findViewById(R.id.mili_setting_firmware_version);
        this.K = (ListTile) findViewById(R.id.mili_setting_firmware_upgrade);
        this.O = (ListTile) findViewById(R.id.mili_setting_hr_firmware_version);
        this.P = (ListTile) findViewById(R.id.mac_address);
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().showUpdate(HMDeviceType.MILI)) {
            this.K.setVisibility(0);
        } else {
            this.K.setVisibility(8);
        }
        if (FwUpgradeFeature.supportSilentUpgrade(HMDeviceType.MILI)) {
            this.K.setVisibility(0);
        }
        this.T = (ListTile) findViewById(R.id.mili_setting_find_bracelet);
        this.U = (ListTile) findViewById(R.id.mili_setting_display_item_ll);
        this.V = (ListTile) findViewById(R.id.mili_time_display_item_ll);
        this.Q = (ListTile) findViewById(R.id.mili_setting_ges_screen_ll);
        this.R = (ListTile) findViewById(R.id.mili_setting_off_wrist_lock_ll);
        this.Q.setChecked(this.g1.isLiftWristBrightView());
        this.Q.setOnCheckedChangeListener(new l());
        ListTile listTile3 = (ListTile) findViewById(R.id.mili_setting_flip_wrist_fl);
        this.S = listTile3;
        listTile3.setChecked(this.g1.isFlipWrist());
        this.S.setOnCheckedChangeListener(new w());
        ListTile listTile4 = (ListTile) findViewById(R.id.mili_setting_set_language);
        this.H0 = listTile4;
        listTile4.setVisibility(ConfigHelperKt.hasFeature(this.k1, Feature.SUPPORT_DEVICE_LANGUAGE) ? 0 : 8);
        this.H0.setTitle(HMDeviceConfig.isBand(this.k1) ? R.string.watch_language_wristband : R.string.watch_language);
        this.H0.setOnClickListener(this);
        ListTile listTile5 = (ListTile) findViewById(R.id.mili_setting_world_clock);
        this.I0 = listTile5;
        listTile5.setOnClickListener(this);
        ListTile listTile6 = (ListTile) findViewById(R.id.mili_setting_now_time);
        this.J0 = listTile6;
        listTile6.setOnClickListener(this);
        ListTile listTile7 = (ListTile) findViewById(R.id.item_band_alarm);
        this.Z = listTile7;
        if (this.k1 == hMDeviceSource2) {
            listTile7.setVisibility(8);
        }
        w1();
        this.X = (ListTile) findViewById(R.id.item_call_alert);
        this.Y = (ListTile) findViewById(R.id.item_event_remind);
        if (ConfigHelperKt.hasMiliFeature(Feature.SUPPORT_EVENT_REMIND_NEW_NAME)) {
            this.Y.setTitle(R.string.schedule);
        }
        this.m0 = (ListTile) findViewById(R.id.item_app_notify);
        this.n0 = (ListTile) findViewById(R.id.item_long_sit_alert);
        this.W = (ListTile) findViewById(R.id.item_unlock);
        this.o0 = (ListTile) findViewById(R.id.item_broadcast);
        this.x0 = (ListTile) findViewById(R.id.sport_hr_broadcast);
        this.y0 = (ListTile) findViewById(R.id.real_time_data);
        this.p0 = (ListTile) findViewById(R.id.mili_setting_xiaoai_mijia_authorize);
        this.q0 = (ListTile) findViewById(R.id.mili_setting_alexa_authorize);
        this.s0 = (ListTile) findViewById(R.id.item_watch_skin);
        this.t0 = (ListTile) findViewById(R.id.mili_setting_enable_lock_screen);
        this.u0 = (ListTile) findViewById(R.id.mili_setting_message_preview);
        ListTile listTile8 = (ListTile) findViewById(R.id.mili_setting_library);
        this.z0 = listTile8;
        listTile8.setVisibility(U2() ? 0 : 8);
        this.z0.setOnClickListener(new View.OnClickListener() { // from class: l93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.E1(view);
            }
        });
        if (HMDeviceConfig.hasFeatureSportHrBroadcast() && HMLoginManager.isAdult()) {
            this.x0.setVisibility(0);
            this.x0.setOnClickListener(new View.OnClickListener() { // from class: m93
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.F1(view);
                }
            });
        }
        if (HMDeviceConfig.hasFeatureRtHr(this.k1) && !ConfigHelperKt.hasFeature(Feature.MI_BAND_SERIES, this.k1)) {
            this.y0.setVisibility(0);
        }
        if (y1()) {
            this.o0.setVisibility(0);
        } else {
            this.o0.setVisibility(8);
            i1();
        }
        this.w0 = (ListTile) findViewById(R.id.avoid_spite_binding_item);
        if (HMDeviceConfig.hasFeatureAvoidSpiteBind()) {
            this.w0.setVisibility(0);
            this.w0.setOnClickListener(new View.OnClickListener() { // from class: p93
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.G1(view);
                }
            });
        }
        this.u0.setChecked(this.Z0.getValue().fromMsgPreviewStr(DeviceXFunctionsKt.getPropertyStoreApi().getProperty(Property.PROPERTY_MESSAGE_PREVIEW, null)));
        this.u0.setOnCheckedChangeListener(new x());
        this.t0.setChecked(this.Z0.getValue().fromPropertyBoolStr(DeviceXFunctionsKt.getPropertyStoreApi().getProperty(Property.PROPERTY_LOCK_SCREEN_WUHAN, null)));
        this.t0.setOnCheckedChangeListener(new y());
        this.W.setOnClickListener(this);
        this.X.setOnClickListener(this);
        this.Z.setOnClickListener(this);
        this.m0.setOnClickListener(this);
        this.n0.setOnClickListener(this);
        this.o0.setOnClickListener(this);
        this.p0.setOnClickListener(this);
        this.q0.setOnClickListener(this);
        this.s0.setOnClickListener(this);
        this.K.setOnClickListener(this);
        findViewById(R.id.item_more).setOnClickListener(this);
        int i2 = R.id.item_keep_alive;
        findViewById(i2).setOnClickListener(this);
        findViewById(R.id.mili_setting_sport).setVisibility(SettingFeatureConfig.INSTANCE.isSupportSportDataSetting() ? 0 : 8);
        View viewFindViewById = findViewById(i2);
        viewFindViewById.setVisibility(0);
        viewFindViewById.setOnClickListener(this);
        HMScrollView hMScrollView = (HMScrollView) findViewById(R.id.mili_setting_scrollview);
        this.x = (HMExpandHeadView) findViewById(R.id.mili_setting_battery_rl);
        this.O0 = (ListTile) findViewById(R.id.mili_setting_ring_type_item);
        this.P0 = (ListTile) findViewById(R.id.mili_setting_night_mode_item);
        this.Q0 = (ListTile) findViewById(R.id.other_calendar_item);
        this.R0 = (ListTile) findViewById(R.id.start_day_of_week_item);
        this.T0 = (ListTile) findViewById(R.id.health_detect_item);
        if (this.W0.getValue().supportHealthDetect()) {
            this.T0.setVisibility(0);
            this.T0.setOnClickListener(new View.OnClickListener() { // from class: i93
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.H1(view);
                }
            });
        }
        if (!GlobalConfig.get().isBuildMidong()) {
            this.x.getBackgroundImage().setBackgroundResource(ConfigHelperKt.getDevicePageBg(this.k1));
        }
        hMScrollView.setHeadView(this.x);
        hMScrollView.setOnHMScrollViewStateChanged(new z());
        t1();
        findViewById(R.id.mili_setting_unbind).setOnClickListener(new View.OnClickListener() { // from class: d93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.I1(view);
            }
        });
        u1();
        ListTile listTile9 = (ListTile) findViewById(R.id.mili_setting_beep_setting);
        this.S0 = listTile9;
        listTile9.setOnClickListener(this);
    }

    private void j1(boolean z2) {
        if (this.k1 == HMDeviceSource.MILI_PRO) {
            return;
        }
        this.T.setEnabled(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j2(View view) {
        this.p1.setChecked(true);
    }

    private void j3() {
        String serialNumber = this.i1.getDeviceInfo().getSerialNumber();
        String tpacProvider = this.c1.getValue().getTpacProvider(this.i1.getMDeviceSource());
        XiaomiTokenMananger.reAuthorization(this, serialNumber, tpacProvider, new g(tpacProvider, serialNumber));
    }

    private void k1() {
        if (GlobalConfig.get().isBuildInner()) {
            this.J.setOnLongClickListener(new f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k2(View view) {
        this.q1.setChecked(true);
    }

    private boolean k3(HMDeviceSource hMDeviceSource) {
        return HMDeviceConfig.hasFeatureOffWistLock(hMDeviceSource);
    }

    private void l1() {
        if (this.i1 == null) {
            HMLog.info(new Function0() { // from class: ka3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMMiLiSettingActivity.A1();
                }
            });
            return;
        }
        this.A.setVisibility(0);
        this.A.setImageResource(R.drawable.searching_icon);
        this.C.setVisibility(4);
        this.D.setVisibility(0);
        this.D.setText(HMDeviceConfig.hasBoundWatch() ? R.string.mili_setting_finding1_watch : R.string.mili_setting_finding1);
        this.D.postDelayed(new Runnable() { // from class: ba3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.B1();
            }
        }, 2000L);
        FindDeviceWrapper.INSTANCE.findDevice(this.i1, new e());
        Analytics.recordEvent(new CountEventBuilder(this.v1));
        CincoAnalytics.cincoFindDeviceAnalytics();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l2(View view) {
        this.d1.getValue().startVibrateTypeActivity(this);
    }

    private void l3() {
        if (this.t1.getAppsRepo().isNotificationOn()) {
            this.m0.setTips(R.string.alert_enable);
        } else {
            this.m0.setTips(R.string.alert_disable);
        }
    }

    public static void launch(Context context) {
        context.startActivity(new Intent(context, (Class<?>) HMMiLiSettingActivity.class));
    }

    private String m1(String str) {
        return HMCalendarConfig.VALUE_LUNAR.equals(str) ? getString(R.string.pyh_other_calendar_lunar) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m2() {
        return "updateDeviceManualDesc device null.";
    }

    private void m3(BatteryInfo batteryInfo) {
        String string;
        this.E.setVisibility(8);
        this.B.setVisibility(8);
        if (batteryInfo == null) {
            this.C.setVisibility(8);
            this.D.setVisibility(8);
            return;
        }
        HMLog.i(F1, "Update battery info:" + batteryInfo.toString(), new Object[0]);
        int level = batteryInfo.getLevel();
        F2(level);
        j1(batteryInfo.isCharging() ^ true);
        if (batteryInfo.isCharging()) {
            this.D.setVisibility(0);
            this.D.setText(R.string.mili_setting_charging);
            if (level == 100) {
                this.A.setVisibility(8);
                this.C.setVisibility(0);
                this.D.setText(getString(R.string.mili_setting_charge_full));
                return;
            } else {
                this.A.setVisibility(0);
                this.A.setImageResource(R.drawable.charging_icon);
                this.C.setVisibility(8);
                return;
            }
        }
        this.A.setVisibility(8);
        this.C.setVisibility(level <= 0 ? 8 : 0);
        Calendar lastCharge = batteryInfo.getLastCharge();
        int deltaDayCount = TimeUtils.getDeltaDayCount(lastCharge, Calendar.getInstance());
        Calendar earliestBoundTime = this.X0.getValue().getEarliestBoundTime(this.s1);
        HMLog.d(F1, "lastCharge:" + lastCharge, new Object[0]);
        HMLog.d(F1, "earliestBound:" + earliestBoundTime, new Object[0]);
        if (deltaDayCount < 0 || earliestBoundTime == null || lastCharge.get(1) == H1) {
            this.D.setVisibility(8);
            return;
        }
        if (lastCharge.after(earliestBoundTime)) {
            string = getResources().getQuantityString(R.plurals.mili_setting_last_charge, deltaDayCount, Integer.valueOf(deltaDayCount));
            if (deltaDayCount == 0) {
                string = getString(R.string.mili_setting_last_charge_today);
            } else if (deltaDayCount == 1) {
                string = getString(R.string.mili_setting_last_charge_yestoday);
            }
        } else {
            string = getString(R.string.mili_setting_no_charge_after_bound);
        }
        this.D.setVisibility(0);
        this.D.setText(string);
        if (level <= 10) {
            this.E.setVisibility(0);
        }
    }

    private void n1() {
        if (!this.g1.isLiftWristBrightView()) {
            this.Q.setTips(R.string.has_close);
            return;
        }
        HMLiftWristConfig hMLiftWristConfigFromLiftWristConfig = this.Z0.getValue().fromLiftWristConfig(this.g1.isLiftWristBrightView(), this.f1.getMiliConfig().getLiftWristTime());
        if (hMLiftWristConfigFromLiftWristConfig.isAllDay()) {
            this.Q.setTips(R.string.ges_screen_type_all_day);
            return;
        }
        int startHour = (hMLiftWristConfigFromLiftWristConfig.getStartHour() * 60) + hMLiftWristConfigFromLiftWristConfig.getStartMinutes();
        int stopHour = (hMLiftWristConfigFromLiftWristConfig.getStopHour() * 60) + hMLiftWristConfigFromLiftWristConfig.getStopMinutes();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (startHour >= stopHour) {
            sb2.append(getString(R.string.unit_tomorrow));
            sb2.append(StringUtil.SPACE);
        }
        sb.append(TimeUtils.formatTime((Context) DeviceXFunctionsKt.getContext(), startHour));
        sb2.append(TimeUtils.formatTime((Context) DeviceXFunctionsKt.getContext(), stopHour));
        this.Q.setTips(((Object) sb) + Constants.WAVE_SEPARATOR + ((Object) sb2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n2() {
        return "updateDeviceManualDesc device info null.";
    }

    private void n3() {
        ListTile listTile = (ListTile) findViewById(R.id.mili_setting_vibrate_item);
        this.v0 = listTile;
        listTile.setVisibility(ConfigHelperKt.hasFeature(Feature.CUSTOM_VIBRATE, this.k1) ? 0 : 8);
        this.v0.setOnClickListener(new View.OnClickListener() { // from class: g93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.l2(view);
            }
        });
    }

    private int o1() {
        return this.B1.getHrDetectType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o2(HealthConfig healthConfig) throws Exception {
        this.H.setChecked(healthConfig.getUserConfig().getSleepAssistEnable());
        t3(healthConfig.getUserConfig().getHrDetectType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3() {
        HMMiLiDevice hMMiLiDevice = this.i1;
        DeviceInfo deviceInfo = hMMiLiDevice == null ? null : hMMiLiDevice.getDeviceInfo();
        if (deviceInfo != null && deviceInfo.getLanguageComBination().isSupportDeviceSettings()) {
            if (!this.i1.isConnected()) {
                try {
                    this.H0.setTips(getString(this.Z0.getValue().getLanguageStringResId(this, HmLocale.getLocale(this.Z0.getValue().getCurrentDeviceLanguage(this.k1)))));
                    return;
                } catch (Throwable th) {
                    HMLog.i(F1, th.getMessage(), new Object[0]);
                    return;
                }
            }
            try {
                HMLanguage language = this.i1.getDeviceInfo().getOtherVersion().getLanguage();
                this.Z0.getValue().saveDeviceLanguageProperty(language, this.h1);
                this.H0.setTips(getString(this.Z0.getValue().getLanguageStringResId(this, HmLocale.getLocale(language.getLanguage()))));
            } catch (Throwable th2) {
                HMLog.i(F1, th2.getMessage(), new Object[0]);
            }
        }
    }

    private String p1(String str) {
        str.hashCode();
        if (str.equals(HMCalendarConfig.VALUE_SAT)) {
            return getString(R.string.pyh_saturday);
        }
        return !str.equals(HMCalendarConfig.VALUE_SUN) ? getString(R.string.pyh_monday) : getString(R.string.pyh_sunday);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p2(View view) {
        W2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3() {
        HMMiLiDevice hMMiLiDevice = this.i1;
        if (hMMiLiDevice == null) {
            HMLog.info(new Function0() { // from class: la3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMMiLiSettingActivity.m2();
                }
            });
        } else if (hMMiLiDevice.getDeviceInfo() == null) {
            HMLog.info(new Function0() { // from class: ma3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMMiLiSettingActivity.n2();
                }
            });
        } else {
            this.Z0.getValue().isDeviceManualFaqShow(this.i1.getDeviceInfo(), new c0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int q1(float f2) {
        int i2 = (int) ((f2 / this.y1) * 255.0f);
        if (i2 > 255) {
            return 255;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q2(View view) {
        X2();
    }

    private void q3() {
        if (this.i1.getDeviceInfo() != null) {
            this.K.setDotted(this.Y0.getValue().shouldShowRedDot(this, HMDeviceType.MILI));
        } else {
            HMLog.d(F1, "updateFwUpgrade failed as get device info return null!!!", new Object[0]);
        }
    }

    private void r1(Activity activity) {
        LoadingDialog loadingDialog;
        if (activity == null || activity.isDestroyed() || activity.isFinishing() || (loadingDialog = this.E1) == null || !loadingDialog.isShowing()) {
            return;
        }
        this.E1.dismiss();
        this.E1 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean r2() throws Exception {
        AlarmClockManager.updateAlarmsFromDevice(((HMMiLiProDevice) this.W0.getValue().getDevice(HMDeviceType.MILI)).getAlarmsSync());
        return Boolean.TRUE;
    }

    private void r3() {
        HMDeviceType deviceType = this.i1.getDeviceType();
        String boundDeviceFirmwareVersion = this.W0.getValue().getBoundDeviceFirmwareVersion(deviceType);
        this.J.setTips(boundDeviceFirmwareVersion != null ? boundDeviceFirmwareVersion.replaceAll("^[vV]", "") : "");
        this.O.setTips(this.W0.getValue().getBoundDeviceHrFirmwareVersion(deviceType));
    }

    private boolean s1() {
        HMDeviceSource hMDeviceSource = this.k1;
        return (hMDeviceSource == HMDeviceSource.MILI || hMDeviceSource == HMDeviceSource.MILI_1A || hMDeviceSource == HMDeviceSource.MILI_QINLING || hMDeviceSource == HMDeviceSource.MILI_AMAZFIT) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s2(Boolean bool) {
        if (bool.booleanValue()) {
            A3();
        }
    }

    private void s3() {
        HealthDetect.INSTANCE.observeHealthConfig(new Consumer() { // from class: aa3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.o2((HealthConfig) obj);
            }
        });
    }

    private void t1() {
        View viewFindViewById = findViewById(R.id.mili_setting_watch_divider);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewFindViewById.getLayoutParams();
        Resources resources = getResources();
        int i2 = R.dimen.divider;
        layoutParams.topMargin = -resources.getDimensionPixelSize(i2);
        viewFindViewById.setLayoutParams(layoutParams);
        View viewFindViewById2 = findViewById(R.id.mili_setting_weather_divider);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) viewFindViewById2.getLayoutParams();
        layoutParams2.topMargin = -getResources().getDimensionPixelSize(i2);
        viewFindViewById2.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t2(Throwable th) {
        HMLog.i(F1, "e: " + th, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(int i2) {
        if (ConfigHelperKt.hasFeature(Feature.SUPPORT_HEALTH_DETECT_TITLE, this.h1)) {
            this.B0.setTitle(R.string.health_detect);
        }
        this.B0.setTips(HrModeExtKt.getHrDetectModelResId(i2, this.h1.getValue()));
    }

    private void u1() {
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
            HMFwOnlineUpgradeManager hMFwOnlineUpgradeManager = HMFwOnlineUpgradeManager.getInstance();
            HMDeviceType hMDeviceType = HMDeviceType.MILI;
            if (hMFwOnlineUpgradeManager.useOnline(hMDeviceType)) {
                HMBaseDevice device = this.W0.getValue().getDevice(hMDeviceType);
                if (device == null) {
                    HMLog.i(F1, "device is null", new Object[0]);
                    return;
                }
                DeviceInfo deviceInfo = device.getDeviceInfo();
                if (deviceInfo == null) {
                    HMLog.i(F1, "deviceInfo is null", new Object[0]);
                    return;
                }
                final String changeLog = HMFwOnlineUpgradeManager.getInstance().getChangeLog(deviceInfo);
                if (TextUtils.isEmpty(changeLog)) {
                    HMLog.i(F1, "changeLog is null", new Object[0]);
                } else {
                    this.J.setTrailing(R.drawable.ic_arrow_forward_20_2x);
                    this.J.setOnClickListener(new View.OnClickListener() { // from class: t93
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.C1(changeLog, view);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u2(View view) {
        this.d1.getValue().startWalletActivity(this);
    }

    private void u3() {
        if (this.f1.getMiliConfig().isEnableConnectedBtAdv()) {
            this.o0.setTips(R.string.alert_enable);
        } else {
            this.o0.setTips(R.string.alert_disable);
        }
    }

    private void v1() {
        long validUid = HMLoginManager.getValidUid();
        boolean zHasXiaomiAiToken = XiaomiTokenMananger.hasXiaomiAiToken();
        boolean zIsUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity = this.Y0.getValue().isUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity(validUid);
        if (!zHasXiaomiAiToken && zIsUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity && HMDeviceConfig.hasFeatureSpeech(this.k1)) {
            this.r0 = true;
            this.p0.performClick();
            this.Y0.getValue().setUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity(validUid, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v2() {
        this.d1.getValue().startSpeechEngineUpdateMiotAuthorizeActivity(this, 10);
    }

    private void v3() {
        HMMiliConfig miliConfig = this.f1.getMiliConfig();
        boolean zIsInComingCallEnabled = miliConfig.isInComingCallEnabled();
        boolean zIsPhoneNotifyDelayEnable = miliConfig.isPhoneNotifyDelayEnable();
        int inComingCallNotifyTime = miliConfig.getInComingCallNotifyTime();
        if (!zIsInComingCallEnabled) {
            this.X.setTips(R.string.alert_disable);
            if (this.b1.getValue().isSetAlertIncall(this.s1)) {
                this.b1.getValue().setMiuiSupportAlertIncall(this.s1, false, miliConfig.isIncallContactNotifyEnabled(), inComingCallNotifyTime);
                return;
            }
            return;
        }
        if (!zIsPhoneNotifyDelayEnable) {
            this.X.setTips(R.string.alert_enable);
            return;
        }
        this.X.setTips(String.format(getString(R.string.incoming_call_alert_tips), inComingCallNotifyTime + ""));
    }

    private void w1() {
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new b0());
    }

    private void w2() {
        PreLaunchUtilKt.setText(getTitleTextView(), PreLaunchParserKt.getDeviceTextBySource(this.k1));
    }

    private void w3() {
        if (HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(11)) {
            this.R.setVisibility(0);
        }
        this.Z.setTitle(HMDeviceConfig.hasBoundWatch() ? R.string.chaohu_alarm : R.string.mi_band_alarm);
        this.T.setTitle(HMDeviceConfig.hasBoundWatch() ? R.string.mili_setting_find_chaohu : R.string.mili_setting_find_bracelet);
        this.P0.setVisibility(HMDeviceConfig.hasFeatureBackLight(this.k1) ? 0 : 8);
        if (HMDeviceConfig.hasFeatureCalendarAndStartDayOfWeek()) {
            HMCalendarConfig hMCalendarConfigFromJson = HMCalendarConfig.fromJson();
            this.Q0.setVisibility(8);
            this.Q0.setTips(m1(hMCalendarConfigFromJson.getCalendar()));
            this.Q0.setOnClickListener(new View.OnClickListener() { // from class: h93
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.p2(view);
                }
            });
            if (HMLoginManager.isInMainland() || HMLoginManager.isUnknown()) {
                return;
            }
            this.R0.setVisibility(0);
            this.R0.setTips(p1(hMCalendarConfigFromJson.getStartDayOfWeek()));
            this.R0.setOnClickListener(new View.OnClickListener() { // from class: q93
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.q2(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x1(HMMiLiDevice hMMiLiDevice) {
        return hMMiLiDevice == null || !hMMiLiDevice.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x2() {
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(this);
        builder.setTitle(R.string.logout_title_2);
        builder.setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: v93
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.J1(dialogInterface, i2);
            }
        });
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        boolean zIsInComingCallEnabled = HMPersonInfo.getInstance().getMiliConfig().isInComingCallEnabled();
        boolean zHasBound = this.W0.getValue().hasBound(HMDeviceType.MILI);
        if (zIsInComingCallEnabled && zHasBound) {
            builder.setMessage(R.string.logout_content);
        }
        builder.show(getSupportFragmentManager());
    }

    /* JADX WARN: switch over string: strings are not added: [[BLUE]] */
    private void x3(String str) {
        int i2 = R.string.blue;
        str.hashCode();
        switch (str) {
            case "ORANGE":
                i2 = R.string.orange;
                break;
            case "RED":
                i2 = R.string.red;
                break;
            case "GREEN":
                i2 = R.string.green;
                break;
        }
        this.F.setTips(i2);
    }

    private boolean y1() {
        if (HMLoginManager.isInMainland()) {
            return true;
        }
        if (!HMLoginManager.isUnknown()) {
            return HMLoginManager.isAdult();
        }
        String country = Locale.getDefault().getCountry();
        boolean zEquals = Locale.SIMPLIFIED_CHINESE.getCountry().equals(country);
        boolean zEquals2 = Locale.US.getCountry().equals(country);
        int age = this.f1.getUserInfo().getAge();
        if (zEquals) {
            return true;
        }
        if (zEquals2) {
            if (age >= 13) {
                return true;
            }
        } else if (age >= 16) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y2() {
        this.w1.hideLoading();
        E2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(int i2) {
        String[] stringArray = getResources().getStringArray(R.array.chaohu_setting_run_types);
        HMLog.d(F1, "key:" + i2 + ",str:" + Arrays.toString(stringArray), new Object[0]);
        if (i2 < 0 || i2 >= stringArray.length) {
            return;
        }
        this.A0.setTips(stringArray[i2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z2() {
        this.w1.hideLoading();
        IconToast.showError(getApplicationContext(), R.string.speech_account_authorize_result_fail);
        E2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3() {
        if (ConfigHelperKt.hasFeature(Feature.SUPPORT_CHANGE_ALARM_ON_DEVICE, this.k1)) {
            Observable.fromCallable(new Callable() { // from class: ia3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.r2();
                }
            }).compose(RxUtil.ioToMain()).subscribe(new Action1() { // from class: oa3
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.s2((Boolean) obj);
                }
            }, new Action1() { // from class: pa3
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    HMMiLiSettingActivity.t2((Throwable) obj);
                }
            });
        }
    }

    public HMMiLiDevice getMiLiDevice() {
        return this.i1;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if ((i2 == 0 || i2 == 1) && i3 == -1) {
            finish();
            return;
        }
        if (i2 == 10 && i3 == 20) {
            if (this.c1.getValue().isSupportDeviceToken(this.k1)) {
                j3();
            } else {
                i3();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.item_unlock) {
            CincoAnalytics.cincoOperateAnalytics("ScreenUnlock");
            this.d1.getValue().startScreenUnlockActivity(this);
            Analytics.recordEvent(new CountEventBuilder(this.u1).setValue("ScreenUnlock"));
            return;
        }
        if (id == R.id.item_call_alert) {
            CincoAnalytics.cincoOperateAnalytics("Call");
            this.d1.getValue().startIncomingCallAlertActivity(this);
            Analytics.recordEvent(new CountEventBuilder(this.u1).setValue("Call"));
            return;
        }
        if (id == R.id.item_band_alarm) {
            CincoAnalytics.cincoOperateAnalytics("BandClock");
            this.d1.getValue().startMiBandAlarmActivity(this);
            Analytics.recordEvent(new CountEventBuilder(this.u1).setValue("BandClock"));
            return;
        }
        if (id == R.id.item_app_notify) {
            CincoAnalytics.cincoOperateAnalytics("AppPush");
            this.d1.getValue().startAppNotificationAlertActivity(this, HMDeviceType.MILI);
            Analytics.recordEvent(new CountEventBuilder(this.u1).setValue("AppPush"));
            return;
        }
        if (id == R.id.item_long_sit_alert) {
            CincoAnalytics.cincoOperateAnalytics("Sitting");
            this.d1.getValue().startLongSitAlertActivity(this);
            Analytics.recordEvent(new CountEventBuilder(this.u1).setValue("Sitting"));
            return;
        }
        if (id == R.id.mili_setting_find_bracelet) {
            l1();
            return;
        }
        if (id == R.id.item_broadcast) {
            CincoAnalytics.cincoOperateAnalytics("Identity");
            this.d1.getValue().startIdBroadcastActivity(this);
            Analytics.recordEvent(new CountEventBuilder(this.u1).setValue("Identity"));
            return;
        }
        if (id == R.id.mili_setting_set_wear) {
            CincoAnalytics.cincoOperateAnalytics("Wear");
            if (this.k1 == HMDeviceSource.MILI_AMAZFIT) {
                Z2();
            } else {
                e3();
            }
            Analytics.recordEvent(new CountEventBuilder(this.u1).setValue("Wear"));
            return;
        }
        if (id == R.id.mili_setting_light_color) {
            if (this.k1 != HMDeviceSource.MILI_BEATS_P) {
                a3();
                Analytics.recordEvent(new CountEventBuilder(this.u1).setValue("Light"));
                return;
            }
            return;
        }
        if (id == R.id.mili_setting_vibrate_notify) {
            ListTile listTile = this.I;
            listTile.setChecked(!listTile.isChecked());
            return;
        }
        if (id == R.id.mili_setting_sleep_assist) {
            ListTile listTile2 = this.H;
            listTile2.setChecked(!listTile2.isChecked());
            return;
        }
        if (id == R.id.mili_setting_display_item_ll) {
            Analytics.recordEvent(new CountEventBuilder(this.u1).setValue("Display"));
            R2();
            return;
        }
        if (id == R.id.mili_time_display_item_ll) {
            Analytics.recordEvent(new CountEventBuilder(this.u1).setValue("Time"));
            f3();
            return;
        }
        if (id == R.id.mili_setting_ges_screen_ll) {
            ListTile listTile3 = this.Q;
            listTile3.setChecked(!listTile3.isChecked());
            return;
        }
        if (id == R.id.mili_setting_off_wrist_lock_ll) {
            CincoAnalytics.cincoOperateAnalytics("Wrist_Lock");
            this.d1.getValue().startOffWistSettingActivity(this);
            return;
        }
        if (id == R.id.mili_setting_flip_wrist_fl) {
            ListTile listTile4 = this.S;
            listTile4.setChecked(!listTile4.isChecked());
            return;
        }
        if (id == R.id.play_miband2) {
            Analytics.recordEvent(new CountEventBuilder(this.u1).setValue("LearnMore"));
            this.d1.getValue().startMiBand2InstructionActivity(this);
            return;
        }
        if (id == R.id.miband2_reset) {
            this.d1.getValue().showHMResetAlertDialog(getSupportFragmentManager());
            return;
        }
        if (id == R.id.mili_setting_password) {
            PasswordInfo passwordInfo = this.x1;
            if (passwordInfo != null) {
                CustomToast.makeText(this, getString(R.string.unlock_password_content_bind, new Object[]{Integer.valueOf(Integer.parseInt(passwordInfo.getPwd(), 16))}), 0).show();
                return;
            } else {
                CustomToast.makeText(this, R.string.unlock_password_unset_bind, 0).show();
                return;
            }
        }
        if (id == R.id.item_more) {
            CincoAnalytics.cincoOperateAnalytics("More");
            this.d1.getValue().startAlertListActivityNew(this, this.k1);
            Analytics.recordEvent(new CountEventBuilder(this.u1).setValue("More"));
            return;
        }
        if (id == R.id.mili_setting_long_press_item) {
            b3();
            Analytics.recordEvent(new CountEventBuilder(this.u1).setValue(StatEvent.DEVICE_OPERATE_QUICKSTART));
            return;
        }
        if (id == R.id.mili_setting_hr_detect_item) {
            if (userInfoPolicyServiceLazy.getValue().interceptWithShowTip()) {
                return;
            }
            CincoAnalytics.cincoOperateAnalytics("HeartRateDetect");
            if (HMDeviceConfig.hasFeatureG3Device()) {
                this.d1.getValue().startHMHrDetectSettingActivity(this);
            } else {
                T2();
            }
            Analytics.recordEvent(new CountEventBuilder(this.u1).setValue("HeartRateDetect"));
            return;
        }
        if (id == R.id.mili_setting_weather_item) {
            if (userInfoPolicyServiceLazy.getValue().interceptWithShowTip()) {
                return;
            }
            CincoAnalytics.cincoOperateAnalytics("WeatherSet");
            this.d1.getValue().startHMWeatherSettingActivity(this);
            Analytics.recordEvent(new CountEventBuilder(this.u1).setValue("WeatherSet"));
            return;
        }
        if (id == R.id.mili_setting_playch_item) {
            CincoAnalytics.cincoOperateAnalytics("LearnMore");
            DeviceManagerApi value = this.W0.getValue();
            HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_TEMPO;
            if (value.hasBound(hMDeviceSource)) {
                WebActivity.launch(this, this.Z0.getValue().getDthBeatsChaohuTempoPlayUrl(hMDeviceSource));
            } else if (this.W0.getValue().hasBound(HMDeviceSource.MILI_WUHAN) || this.W0.getValue().hasBound(HMDeviceSource.MILI_CHONGQING)) {
                this.d1.getValue().startMiBand3InstructionActivity(this);
            } else {
                DeviceManagerApi value2 = this.W0.getValue();
                HMDeviceSource hMDeviceSource2 = HMDeviceSource.MILI_BEATS;
                if (value2.hasBound(hMDeviceSource2)) {
                    WebActivity.launch(this, this.Z0.getValue().getDthBeatsChaohuTempoPlayUrl(hMDeviceSource2));
                } else {
                    DeviceManagerApi value3 = this.W0.getValue();
                    HMDeviceSource hMDeviceSource3 = HMDeviceSource.MILI_BEATS_W;
                    if (value3.hasBound(hMDeviceSource3)) {
                        WebActivity.launch(this, this.Z0.getValue().getDthBeatsChaohuTempoPlayUrl(hMDeviceSource3));
                    } else {
                        DeviceManagerApi value4 = this.W0.getValue();
                        HMDeviceSource hMDeviceSource4 = HMDeviceSource.MILI_DTH;
                        if (value4.hasBound(hMDeviceSource4)) {
                            WebActivity.launch(this, this.Z0.getValue().getDthBeatsChaohuTempoPlayUrl(hMDeviceSource4));
                        } else {
                            DeviceManagerApi value5 = this.W0.getValue();
                            HMDeviceSource hMDeviceSource5 = HMDeviceSource.MILI_DTH_W;
                            if (value5.hasBound(hMDeviceSource5)) {
                                WebActivity.launch(this, this.Z0.getValue().getDthBeatsChaohuTempoPlayUrl(hMDeviceSource5));
                            } else if (this.W0.getValue().hasBound(HMDeviceSource.MILI_CINCO) || this.W0.getValue().hasBound(HMDeviceSource.MILI_CINCO_L) || this.W0.getValue().hasBound(HMDeviceSource.MILI_RIO)) {
                                DeviceManualUtils.showDeviceManual(this, this.k1);
                            }
                        }
                    }
                }
            }
            Analytics.recordEvent(new CountEventBuilder(this.u1).setValue("LearnMore"));
            return;
        }
        if (id == R.id.mili_setting_faq_item) {
            WebHelper.launch(this.K0);
            return;
        }
        if (id == R.id.mili_setting_apps_item) {
            CincoAnalytics.cincoOperateAnalytics("Display");
            Analytics.recordEvent(new CountEventBuilder(this.u1).setValue("Display"));
            c3();
            return;
        }
        if (id == R.id.mili_setting_sport_sort) {
            this.d1.getValue().startHMSportSortActivity(this);
            return;
        }
        if (id == R.id.mili_setting_shotcut_apps_item) {
            if (this.k1 == HMDeviceSource.MILI_CINCO) {
                CincoAnalytics.cincoOperateAnalytics("Entry_Quick");
            }
            this.d1.getValue().startShortcutAppSort(this, this.k1);
            return;
        }
        if (id == R.id.mili_setting_xiaoai_mijia_authorize) {
            CincoAnalytics.cincoOperateAnalytics("voice");
            g1();
            return;
        }
        if (id == R.id.mili_setting_alexa_authorize) {
            this.d1.getValue().showAlexaLanguageSettingActivity(this, null, getSupportFragmentManager());
            return;
        }
        if (id == R.id.item_watch_skin) {
            CincoAnalytics.cincoOperateAnalytics("WatchFace");
            if (this.s0.isIndicatorVisible()) {
                this.s0.setDotted(false);
                HMDeviceSource hMDeviceSource6 = this.k1;
                if (hMDeviceSource6 == HMDeviceSource.MILI_PEYTO || hMDeviceSource6 == HMDeviceSource.MILI_PEYTO_L || hMDeviceSource6 == HMDeviceSource.MILI_PEYTO_WL) {
                    this.Y0.getValue().setShowWatchFaceRedDot(false);
                } else if (HMDeviceConfig.hasFeatureTempoWatchFace(hMDeviceSource6)) {
                    this.Y0.getValue().setShowTempoWatchFaceRedDot(false);
                }
            }
            WatchSkinManager.jumpToWatchSkinPage(this, this.k1);
            return;
        }
        if (id == R.id.mili_setting_firmware_upgrade) {
            if (!NetUtil.isNetworkConnected(this)) {
                IconToast.showError(this, getString(R.string.no_network_connection));
                return;
            }
            if (this.Z0.getValue().isFastDoubleClick(view)) {
                return;
            }
            KeeperProxyApi value6 = this.Y0.getValue();
            HMDeviceType hMDeviceType = HMDeviceType.MILI;
            value6.setClickedVersion(this, hMDeviceType);
            this.K.setDotted(false);
            FwUpgradeFeature.Companion companion = FwUpgradeFeature.INSTANCE;
            if (companion.supportSilentUpgrade(hMDeviceType)) {
                this.d1.getValue().startHMGt2SystemUpgradeActivity(this, false, false, false);
                return;
            }
            boolean zSupportDfuV5 = companion.supportDfuV5(this.k1.getType());
            if ((DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(hMDeviceType)) ? HMFwOnlineUpgradeManager.getInstance().hasFwUpgrade(this, hMDeviceType) : HMFwUpgradeManager.getInstance().hasFwUpgrade(this, hMDeviceType)) {
                if (zSupportDfuV5 && HMFwOnlineUpgradeManager.isSupportContinueUpgrade(this.k1)) {
                    this.d1.getValue().startContinueUpgradeActivity(this, false, HMFwOnlineUpgradeManager.getInstance().getChangeLog(false));
                    return;
                } else {
                    startActivity(HMFwUpgradeInfoActivity.newIntent(this, this.k1));
                    return;
                }
            }
            this.C1 = true;
            Q2(this);
            if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
                HMFwOnlineManager.getInstance().checkFw(hMDeviceType, true);
                return;
            } else {
                NetFwUpgradeManager.checkFwFromServerAsync(true);
                return;
            }
        }
        if (id == R.id.mili_setting_ring_type_item) {
            d3();
            return;
        }
        if (id == R.id.mili_setting_enable_lock_screen) {
            ListTile listTile5 = this.t0;
            listTile5.setChecked(!listTile5.isChecked());
            return;
        }
        if (id == R.id.mili_setting_night_mode_item) {
            CincoAnalytics.cincoOperateAnalytics("Mode_Night");
            this.d1.getValue().startNightModeActivity(this);
            return;
        }
        if (id == R.id.item_keep_alive) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EVENT_MINE_OUT).setValue("Mine_Keepalive"));
            this.d1.getValue().startKeepAliveActivity(this);
            return;
        }
        if (id == R.id.mili_setting_set_language) {
            this.d1.getValue().startDeviceLanguageSettingActivity(this, HMDeviceType.MILI);
            return;
        }
        if (id == R.id.mili_setting_world_clock) {
            this.d1.getValue().startWorldClockActivity(this, HMDeviceType.MILI, this.k1);
            return;
        }
        if (id == R.id.mili_setting_sport) {
            MiliSportSettingActivity.INSTANCE.launch(this);
            return;
        }
        if (id == R.id.mili_setting_beep_setting) {
            startActivity(new Intent(this, (Class<?>) BeepSettingActivity.class));
        } else if (id == R.id.mili_setting_esim_card) {
            EsimActivity.open(this, false);
        } else if (id == R.id.mili_setting_now_time) {
            this.d1.getValue().startMiliNowTimeSettingActivity(this);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_mili_setting);
        DarkModeUtilKt.setDeviceSettingUnifyTitleStyle(this, getString(R.string.play_with_device, new Object[]{getString(R.string.mili_settting_mili_pro)}), null);
        updateTitleLayout();
        AppsNotificationRepo appsRepo = NotificationManager.getInstance().getAppsRepo();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        appsRepo.setCurrentDeviceType(hMDeviceType);
        this.y1 = (ViewUtils.dp2px(this, 98.0f) - getTitleBarHeight()) - BaseTitleActivity.getStatusBarHeight(this);
        L1 = new WeakReference<>(this);
        this.t1 = NotificationManager.getInstance();
        HMLog.i(F1, "checkNotificationAccessServiceEnabled:" + AppUtil.INSTANCE.isNotificationAccessEnabled(this), new Object[0]);
        DeviceManagerApi value = this.W0.getValue();
        this.j1 = value;
        this.i1 = (HMMiLiDevice) value.getDevice(hMDeviceType);
        this.s1 = this.j1.getBoundDeviceAddress(hMDeviceType);
        this.k1 = this.j1.getBoundDeviceSource(hMDeviceType);
        this.w1 = new LoadingDialogHelper(this);
        HMLog.d(F1, "mDeviceSource:" + this.k1, new Object[0]);
        final Device bindInfo = this.j1.getBindInfo(this.k1.getType());
        if (bindInfo == null || TextUtils.isEmpty(bindInfo.getDisplayName()) || bindInfo.getDisplayName().trim().length() <= 0) {
            getSubTitleTextView().setVisibility(8);
            HMLog.i(F1, "getBindInfo for " + this.k1 + " is null!", new Object[0]);
        } else {
            J2(getSubTitleTextView(), bindInfo.getDisplayName());
        }
        getRightImage().setOnClickListener(new View.OnClickListener() { // from class: r93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.L1(bindInfo, view);
            }
        });
        HMLog.d(F1, "mDeviceSource:" + this.k1, new Object[0]);
        initViews();
        L3();
        N3();
        O3(true);
        EventBus.getDefault().register(this);
        int i2 = v.a[this.k1.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.CHAOHU_VIEW_NUM));
            this.u1 = StatEvent.DEVICE_CHAOHU_OPERATE;
            this.v1 = StatEvent.DEVICE_FIND_CHAOHU;
        } else if (i2 != 4) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.MILI_VIEW_NUM));
            this.u1 = StatEvent.DEVICE_BAND_OPERATE;
            this.v1 = StatEvent.DEVICE_FIND_MILI;
        } else {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.TEMPO_VIEW_NUM));
            this.u1 = StatEvent.DEVICE_TEMPO_OPERATE;
            this.v1 = StatEvent.DEVICE_FIND_TEMPO;
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.DEVICE_VIEW_NUM).setValue(String.valueOf(this.k1.getValue())));
        HMDeviceSource hMDeviceSource = this.k1;
        if (hMDeviceSource == HMDeviceSource.MILI_PEYTO || hMDeviceSource == HMDeviceSource.MILI_PEYTO_L || hMDeviceSource == HMDeviceSource.MILI_PEYTO_WL) {
            this.s0.setDotted(this.Y0.getValue().getShowWatchFaceRedDot());
        } else if (HMDeviceConfig.hasFeatureTempoWatchFace(hMDeviceSource)) {
            this.s0.setDotted(this.Y0.getValue().getShowTempoWatchFaceRedDot());
        }
        B3();
        H2();
        C2();
        v1();
        CincoAnalytics.cincoDevicePageAnalytics();
        HMMiLiDevice hMMiLiDevice = this.i1;
        if (hMMiLiDevice != null && hMMiLiDevice.isConnected()) {
            p3();
        }
        s3();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
        EventBus.getDefault().unregister(this);
        this.D1.removeMessages(22);
    }

    public void onEventMainThread(ReminderChangedEvent reminderChangedEvent) {
        if (reminderChangedEvent.isFromDevice()) {
            N2();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.e1.getValue().updateProfile(false);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UIAnalytic.analyticsDevicePageVisible(this.k1);
        HMFwOnlineUpgradeManager.checkUpgradeInDevicePage(this, HMDeviceType.MILI);
        this.B1 = HealthDetect.INSTANCE.getUserConfig();
        if (HMDeviceConfig.hasFeatureProDevice()) {
            this.n0.setVisibility(0);
        } else {
            this.n0.setVisibility(8);
        }
        if (this.C0.getVisibility() == 0) {
            this.C0.setTips(WeatherSetting.fromJsonString(HMPersonInfo.getInstance().getMiliConfig().getWeatherSetting()).getDisplayCity());
        }
        if (HMDeviceConfig.hasFeatureG3Device()) {
            M2();
            boolean zIsEnabled = this.Q.isEnabled();
            this.Q.reset();
            this.Q.setSubtitle("");
            this.Q.setEnabled(zIsEnabled);
            n1();
            this.Q.setOnClickListener(new View.OnClickListener() { // from class: e93
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.O1(view);
                }
            });
            H3(DeviceXFunctionsKt.getPropertyStoreApi().getRingType());
        }
        N2();
        if (this.i1 != null) {
            q3();
        }
        if (this.P0.getVisibility() == 0) {
            C3();
        }
        if (this.w0.getVisibility() == 0) {
            this.w0.setTips(this.Z0.getValue().fromAvoidSpiteBindingStr() ? R.string.alert_enable : R.string.alert_disable);
        }
        if (this.x0.getVisibility() == 0) {
            this.x0.setTips(HMSportHRBroadcastConfig.fromJson().getEnable() ? R.string.alert_enable : R.string.alert_disable);
        }
        if (this.y0.getVisibility() == 0) {
            final IRealtimeData iRealtimeData = (IRealtimeData) KoinJavaComponent.get(IRealtimeData.class);
            this.y0.setTips(iRealtimeData.isOpen() ? R.string.alert_enable : R.string.alert_disable);
            this.y0.setOnClickListener(new View.OnClickListener() { // from class: s93
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.P1(iRealtimeData, view);
                }
            });
        }
        if (this.q0.getVisibility() == 0) {
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: da3
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.K2();
                }
            });
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        v3();
        A3();
        l3();
        J3();
        M3();
        u3();
        F3();
        o3();
        R3();
        D3();
        E3();
    }

    public void onEventMainThread(HMDeviceBatteryEvent hMDeviceBatteryEvent) {
        if (hMDeviceBatteryEvent.getDeviceType() != HMDeviceType.MILI) {
            return;
        }
        m3(hMDeviceBatteryEvent.getBatteryInfo());
    }

    public void onEventMainThread(HMDeviceAlarmEvent hMDeviceAlarmEvent) {
        if (hMDeviceAlarmEvent.fromDevice && hMDeviceAlarmEvent.getDeviceType() == HMDeviceType.MILI) {
            A3();
        }
    }

    public void onEventMainThread(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
        if (hMDeviceConnectionEvent.getConnectionType() == 1) {
            HMLog.i(F1, "Device Connected!", new Object[0]);
            V2();
        }
    }

    public void onEventMainThread(EventFwCheckResult eventFwCheckResult) {
        HMLog.d(F1, "status:" + eventFwCheckResult.isSuccess, new Object[0]);
        this.D1.removeMessages(22);
        r1(this);
        if (eventFwCheckResult.isSuccess) {
            if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
                HMFwOnlineUpgradeManager hMFwOnlineUpgradeManager = HMFwOnlineUpgradeManager.getInstance();
                HMDeviceType hMDeviceType = HMDeviceType.MILI;
                if (hMFwOnlineUpgradeManager.useOnline(hMDeviceType)) {
                    HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(this, hMDeviceType, false);
                    return;
                }
            }
            HMFwUpgradeManager.getInstance().checkFwUpgrade(this, HMDeviceType.MILI, false);
            return;
        }
        if (this.C1) {
            this.C1 = false;
            IconToast.showSuccess(this, R.string.fw_uptodate);
        }
    }
}
