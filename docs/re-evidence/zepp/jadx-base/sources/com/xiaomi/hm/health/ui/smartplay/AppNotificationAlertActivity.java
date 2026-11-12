package com.xiaomi.hm.health.ui.smartplay;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.profile.channel.module.notification.NotificationApi;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.device.feature.notification.utils.AppUtil;
import com.huami.devicex.DeviceXBuilder;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.AccountWebExtApi;
import com.huami.devicex.injection.basic.MiuiFnApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.view.widget.TipComponent;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.phone_call.sms.PhoneCallReplyMsgActivity;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.service.residentnoti.ResidentNotificationManager;
import com.xiaomi.hm.health.device.service.residentnoti.notify.ResidentNotify;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.smartplay.AppNotificationAlertActivity;
import com.xiaomi.hm.health.ui.smartplay.appnotify.AppInfo;
import com.xiaomi.hm.health.ui.smartplay.appnotify.AppInfoUtil;
import com.xiaomi.hm.health.ui.smartplay.appnotify.AppsListAdapter;
import com.xiaomi.hm.health.ui.smartplay.appnotify.SupportAppEvent;
import com.xiaomi.hm.health.ui.smartplay.appnotify.view.AppList;
import com.xiaomi.hm.health.ui.smartplay.appnotify.view.HeaderView;
import de.greenrobot.event.EventBus;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
public class AppNotificationAlertActivity extends AppCompatActivity {
    public static final String KEY_DEVICE_TYPE = "deviceType";
    private static final String q = "AppNotificationAlertActivity";
    private static final int r = 0;
    private NotificationManager a;
    private AppList b;
    private HeaderView c;
    private TipComponent j;
    private BTStatusFragment k;
    private View l;
    private LoadingDialog m;
    private List<AppInfo> n;
    private AppsListAdapter o;
    private boolean d = true;
    private HMDeviceType e = HMDeviceType.VDevice;
    private final Lazy<DeviceXNavigator> f = KoinJavaComponent.inject(DeviceXNavigator.class);
    private final Lazy<AccountWebExtApi> g = KoinJavaComponent.inject(AccountWebExtApi.class);
    private final Lazy<KeeperProxyApi> h = KoinJavaComponent.inject(KeeperProxyApi.class);
    private final Lazy<MiuiFnApi> i = KoinJavaComponent.inject(MiuiFnApi.class);
    private final DialogInterface.OnClickListener p = new DialogInterface.OnClickListener() { // from class: jh
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            this.a.G(dialogInterface, i);
        }
    };

    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AppNotificationAlertActivity.this.c.setNotifChecked(AppNotificationAlertActivity.this.a.getAppsRepo().isNotificationOn());
            AppNotificationAlertActivity.this.c.setAwakeChecked(AppNotificationAlertActivity.this.a.getAppsRepo().isScreenSleepOn());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public class b implements HeaderView.OnHeaderClickedListener {
        public b() {
        }

        @Override // com.xiaomi.hm.health.ui.smartplay.appnotify.view.HeaderView.OnHeaderClickedListener
        public void onAwakeCheckedChanged(boolean z, boolean z2) {
            AppNotificationAlertActivity.this.v(z, z2);
        }

        @Override // com.xiaomi.hm.health.ui.smartplay.appnotify.view.HeaderView.OnHeaderClickedListener
        public void onNotifCheckedChanged(boolean z, boolean z2) {
            HMLog.d(AppNotificationAlertActivity.q, "onNotifCheckedChanged: " + z + ", fromUser:" + z2, new Object[0]);
            AppNotificationAlertActivity.this.w(z, z2);
        }

        @Override // com.xiaomi.hm.health.ui.smartplay.appnotify.view.HeaderView.OnHeaderClickedListener
        public void onReplyManagementClicked() {
            PhoneCallReplyMsgActivity.start(AppNotificationAlertActivity.this);
        }
    }

    public class c extends BLEStatueListenerAdapter {
        public c() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public CharSequence getUnbindStr() {
            return AppNotificationAlertActivity.this.getResources().getString(R.string.app_notify_not_bound);
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean z) {
            HMLog.d(AppNotificationAlertActivity.q, "onEnableChanged: " + z, new Object[0]);
            AppNotificationAlertActivity.this.d = z;
            if (!z) {
                AppNotificationAlertActivity.this.s();
            } else if (AppUtil.INSTANCE.isNotificationAccessEnabled(DeviceXFunctionsKt.getContext())) {
                AppNotificationAlertActivity.this.t();
            } else {
                AppNotificationAlertActivity.this.K();
            }
        }
    }

    private boolean A() {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(this.e);
        if (!(device instanceof HMMiLiProDevice)) {
            return false;
        }
        NotificationApi notificationApi = ((HMMiLiProDevice) device).getNotificationApi();
        if (notificationApi != null) {
            return notificationApi.getVersion().getVersion() >= 4;
        }
        HMLog.info(q, new Function0() { // from class: oh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppNotificationAlertActivity.F();
            }
        });
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit B(Integer num, Boolean bool) {
        AppInfo appInfo = this.n.get(num.intValue());
        appInfo.isChecked = bool.booleanValue();
        if (bool.booleanValue()) {
            this.a.getAppsRepo().addApp(appInfo.packageName);
        } else {
            this.a.getAppsRepo().removeApp(appInfo.packageName);
        }
        this.o.update(AppInfoUtil.INSTANCE.getSortedAppInfoList(this.n));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(List list) {
        this.n = list;
        this.m.dismiss();
        AppsListAdapter appsListAdapter = new AppsListAdapter(this, A(), list);
        this.o = appsListAdapter;
        appsListAdapter.setOnCheckedChangeListener(new Function2() { // from class: qh
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return this.a.B((Integer) obj, (Boolean) obj2);
            }
        });
        this.b.setAdapter(this.o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit D(final List list) {
        runOnUiThread(new Runnable() { // from class: nh
            @Override // java.lang.Runnable
            public final void run() {
                this.a.C(list);
            }
        });
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(View view) {
        N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String F() {
        return "notification api is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(DialogInterface dialogInterface, int i) {
        if (i != -1) {
            return;
        }
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(View view, int i) {
        this.f.getValue().startNotificationDiagnosisActivity(this);
    }

    private void J() {
        s();
        L(true);
        O(getString(R.string.app_notify_access_error_title), getString(R.string.app_notify_access_error_subtitle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        s();
        L(true);
        O(getString(R.string.app_notify_access_title), getString(R.string.app_notify_access_subtitle));
    }

    private void L(boolean z) {
        this.j.setVisibility(z ? 0 : 8);
    }

    private void M(boolean z) {
        if (z) {
            this.b.setVisibility(0);
        } else {
            this.b.setVisibility(8);
        }
    }

    private void N() {
        new AlertDialogFragment.Builder(this).setMessage(getString(R.string.get_notification_access_tips)).setPositiveButton(getString(R.string.yes), this.p).setNegativeButton(getString(R.string.cancel), this.p).setCancelable(false).show(getSupportFragmentManager());
    }

    private void O(String str, String str2) {
        this.j.setTitle(str);
        this.j.setSubTitle(str2);
    }

    private void initTipsView() {
        z(getSupportFragmentManager());
        this.j.setIcon(R.drawable.ic_warning_error);
        this.j.setActionGoto(new View.OnClickListener() { // from class: lh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.E(view);
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append("NotificationAccessService is running : ");
        sb.append(!this.a.isServiceNotRunning(this));
        HMLog.i(q, sb.toString(), new Object[0]);
        if (!AppUtil.INSTANCE.isNotificationAccessEnabled(DeviceXFunctionsKt.getContext())) {
            K();
            return;
        }
        if (this.a.isServiceNotRunning(this) && this.i.getValue().isMiui(this)) {
            this.a.restartNotificationListenerService(DeviceXFunctionsKt.getContext());
            if (this.a.isServiceNotRunning(this)) {
                J();
            }
        }
    }

    private void initView() {
        this.l = findViewById(R.id.mask_view);
        this.b = (AppList) findViewById(R.id.notifi_app_list);
        this.j = (TipComponent) findViewById(R.id.access_tip);
        this.c = (HeaderView) findViewById(R.id.header_view);
        y();
        x();
        initTipsView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        this.l.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        boolean zIsNotificationOn = this.a.getAppsRepo().isNotificationOn();
        HMLog.d(q, "connectedSuccessEnableUI: " + zIsNotificationOn, new Object[0]);
        this.c.setNotifChecked(zIsNotificationOn);
        this.l.setVisibility(8);
    }

    private void u() {
        try {
            try {
                startActivityForResult(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"), 0);
            } catch (ActivityNotFoundException unused) {
                IconToast.showError(getApplicationContext(), "unknown error");
            }
        } catch (ActivityNotFoundException unused2) {
            startActivityForResult(new Intent("android.settings.NOTIFICATION_LISTENER_SETTINGS"), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(boolean z, boolean z2) {
        if (z2) {
            this.a.getAppsRepo().setScreenSleepOn(z);
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.SCREEN_OFF).setValue(z ? "On" : "Off"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(boolean z, boolean z2) {
        if (z2) {
            HMLog.d(q, "isPressed ", new Object[0]);
            if (!this.h.getValue().hasClosedNotificationByUser()) {
                ResidentNotificationManager.showNotification(ResidentNotify.INSTANCE);
                HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
                hMPersonInfo.getMiliConfig().setNotificationOn(true);
                hMPersonInfo.saveInfo(2);
            }
            if (z) {
                this.f.getValue().startKeepAliveTipsActivity(this);
            }
            this.a.getAppsRepo().setNotificationOn(z);
            M(z);
        }
    }

    private void x() {
        M(this.a.getAppsRepo().isNotificationOn());
        this.b.setHasFixedSize(true);
        this.b.setLayoutManager(new LinearLayoutManager(this));
        this.m = LoadingDialog.showDialog(this, getString(R.string.loading));
        AppInfoUtil.INSTANCE.loadAppInfoList(this, this.e, new Function1() { // from class: ph
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.D((List) obj);
            }
        });
    }

    private void y() {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(this.e);
        this.c.showMsgReply(device instanceof HMMiLiProDevice ? ((HMMiLiProDevice) device).supportMsgReply() : false);
        this.c.setNotifChecked(this.a.getAppsRepo().isNotificationOn());
        this.c.setAwakeChecked(this.a.getAppsRepo().isScreenSleepOn());
        this.c.addOnAttachStateChangeListener(new a());
        this.c.setOnHeaderClickedListener(new b());
    }

    private void z(FragmentManager fragmentManager) {
        if (this.k == null) {
            BTStatusFragment bTStatusFragmentNewInstance = BTStatusFragment.newInstance(R.id.fragment_container, fragmentManager);
            this.k = bTStatusFragmentNewInstance;
            bTStatusFragmentNewInstance.setBLEStatusListener(new c());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        HMLog.d(q, "request code: " + i + ", result code:" + i2, new Object[0]);
        if (!AppUtil.INSTANCE.isNotificationAccessEnabled(this)) {
            s();
            return;
        }
        if (this.a.isServiceNotRunning(this) && this.i.getValue().isMiui(this)) {
            J();
        } else if (!this.d) {
            s();
        } else {
            L(false);
            t();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_app_notification_alert);
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) findViewById(R.id.title_bar);
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: kh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.H(view);
            }
        });
        if (DeviceXBuilder.INSTANCE.isFlavorZepp()) {
            rainbowTitleBar.setMenuIcon(R.drawable.ic_qa);
            rainbowTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: mh
                @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
                public final void onClick(View view, int i) {
                    this.a.I(view, i);
                }
            });
        }
        int value = HMDeviceType.VDevice.getValue();
        int intExtra = getIntent().getIntExtra("deviceType", value);
        this.e = HMDeviceType.fromValue(intExtra);
        if (intExtra == value && (extras = getIntent().getExtras()) != null) {
            this.e = HMDeviceType.fromValue(extras.getInt("deviceType", value));
        }
        this.a = NotificationManager.getInstance();
        NotificationManager.getInstance().getAppsRepo().asyncAppsInfo(this.e);
        NotificationManager.getInstance().checkNotificationService(this);
        initView();
        EventBus.getDefault().register(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.g.getValue().updateProfile(false);
        EventBus.getDefault().unregister(this);
    }

    public void onEvent(SupportAppEvent supportAppEvent) {
        List<AppInfo> list = this.n;
        if (list == null || this.o == null) {
            return;
        }
        for (AppInfo appInfo : list) {
            if (appInfo.packageName.equals(supportAppEvent.getPkg())) {
                appInfo.isChecked = true;
                break;
            }
        }
        List<AppInfo> sortedAppInfoList = AppInfoUtil.INSTANCE.getSortedAppInfoList(this.n);
        this.n = sortedAppInfoList;
        this.o.update(sortedAppInfoList);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (AppUtil.INSTANCE.isNotificationAccessEnabled(DeviceXFunctionsKt.getContext())) {
            z(getSupportFragmentManager());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (AppUtil.INSTANCE.isNotificationAccessEnabled(DeviceXFunctionsKt.getContext()) || !this.d) {
            return;
        }
        K();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.APP_PUSH_VIEW_NUM));
    }
}
