package com.xiaomi.hm.health.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.p008lifecycle.Observer;
import com.chenenyu.router.Router;
import com.huami.account.HMLoginManager;
import com.huami.account.api.model.AccountInfo;
import com.huami.account.ui.AccountBindActivity;
import com.huami.account.utils.AccountHelper;
import com.huami.account.utils.LogoutDialogHelper;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.assistant.ui.v2.repo.SettingRepo;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.feedback.api.FeedbackService;
import com.huami.http.serverfault.handler.LogoutFaultHandler;
import com.huami.lib.rainbow.ListTile;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.passport.AccountManager;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.entity.BindAccount;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.utils.easypermission.manager.PermissionManagerActivity;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.update.UpdateManager;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watch.util.Util;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.activity.CardRevokeActivity;
import com.xiaomi.hm.health.baseui.GlobalTitleStyle;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.service.residentnoti.ResidentNotificationManager;
import com.xiaomi.hm.health.device.service.residentnoti.notify.ResidentNotify;
import com.xiaomi.hm.health.device.setting.realtime.RealTimeTransmissionEntry;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.lab.activity.BehaviorsActivity;
import com.xiaomi.hm.health.lightappstore.LightAppStore;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.SettingActivity;
import com.xiaomi.hm.health.ui.smartplay.NotificationHelper;
import com.xiaomi.hm.health.webapi.ServerFaultHelper;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
public class SettingActivity extends BaseTitleActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private static final String D = SettingActivity.class.getSimpleName();
    public static final String FROM_PUSH_APP_UPGRADE = "push_app_upgrade";
    public static final String FROM_SET = "Set";
    public static final String START_FROM = "START_FROM";
    private HMMiliConfig A;
    private LoadingDialog C;
    private ListTile y;
    private HMPersonInfo z;
    private boolean x = false;
    private final Lazy<DeviceManagerApi> B = KoinJavaComponent.inject(DeviceManagerApi.class);

    public static class a implements IAccount.Callback<List<BindAccount>, ErrorCode> {
        private final WeakReference<SettingActivity> a;

        public a(SettingActivity activity) {
            this.a = new WeakReference<>(activity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(ErrorCode errorCode) {
            return "listAccount_onError:" + errorCode;
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onError(final ErrorCode errorCode) {
            SettingActivity settingActivity = this.a.get();
            if (settingActivity == null || settingActivity.isFinishing()) {
                return;
            }
            HMLog.info(SettingActivity.D, new Function0() { // from class: com.xiaomi.hm.health.ui.i
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return SettingActivity.a.b(errorCode);
                }
            });
            settingActivity.C.hide();
            IconToast.showError(settingActivity, settingActivity.getString(R.string.account_bind_load_failed));
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final List<BindAccount> bindAccounts) {
            SettingActivity settingActivity = this.a.get();
            if (settingActivity == null || settingActivity.isFinishing()) {
                return;
            }
            settingActivity.C.hide();
            settingActivity.v(bindAccounts);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(View view) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_BEHAVIOR_C));
        if (RealTimeTransmissionEntry.checkCanOpenBehaviorTagging(this)) {
            Intent intent = new Intent(this, (Class<?>) BehaviorsActivity.class);
            intent.putExtra(BehaviorsActivity.KEY_IS_GT3, ConfigHelperKt.hasFeature(Feature.GT3_SOURCE));
            startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(Boolean bool) {
        findViewById(R.id.server_fault_view).setVisibility(bool.booleanValue() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C(String str, TextView textView) {
        String strReplace = str.replace("\n", " ");
        if (((int) textView.getPaint().measureText(strReplace)) > textView.getMeasuredWidth()) {
            textView.setText(str);
        } else {
            textView.setText(strReplace);
        }
    }

    private void D() {
        LogoutDialogHelper logoutDialogHelper = new LogoutDialogHelper(this);
        logoutDialogHelper.setDialogBuilder(new Function1() { // from class: yq6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.x((AlertDialogFragment.Builder) obj);
            }
        });
        logoutDialogHelper.setAfterLogoutSuccess(new Function0() { // from class: xq6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return SettingActivity.y();
            }
        });
        logoutDialogHelper.showLogout();
    }

    private void E() {
        findViewById(R.id.night_setting_mode).setOnClickListener(this);
        ListTile listTile = (ListTile) findViewById(R.id.unit);
        listTile.setOnClickListener(this);
        findViewById(R.id.about).setOnClickListener(this);
        findViewById(R.id.logout).setOnClickListener(this);
        ListTile listTile2 = (ListTile) findViewById(R.id.update);
        listTile2.setOnClickListener(this);
        listTile2.setDotted(UpdateManager.getInstance().shouldRedDotDisplay());
        ListTile listTile3 = (ListTile) findViewById(R.id.notify);
        listTile3.setTitleMaxLines(3);
        if (w()) {
            boolean zIsNotificationOn = NotificationHelper.INSTANCE.isNotificationOn();
            if (!zIsNotificationOn) {
                try {
                    ResidentNotificationManager.cancelNotification(ResidentNotify.INSTANCE);
                    HMKeeper.setClosedNotificationState(true);
                } catch (Exception unused) {
                }
            }
            listTile3.setChecked(zIsNotificationOn);
            listTile3.setOnCheckedChangeListener(this);
        } else {
            listTile3.setVisibility(8);
            listTile.setRadiusPosition(2);
        }
        if (HMDeviceConfig.hasBoundWatch() || (GlobalConfig.get().isBuildMidong() && HMDeviceConfig.hasBoundClassicWatch())) {
            listTile3.setSubtitle(R.string.notification_switch_subtitle_watch);
        }
        ListTile listTile4 = (ListTile) findViewById(R.id.cache);
        listTile4.setOnClickListener(this);
        if (!Language.isSimplifiedChinese() || !HMLoginManager.isInChina()) {
            listTile4.setVisibility(8);
        }
        View viewFindViewById = findViewById(R.id.revoke);
        viewFindViewById.setOnClickListener(this);
        if (!Language.isSimplifiedChinese()) {
            viewFindViewById.setVisibility(8);
        }
        View viewFindViewById2 = findViewById(R.id.account_bind);
        viewFindViewById2.setVisibility(HMLoginManager.supportAccountBind() ? 0 : 8);
        viewFindViewById2.setOnClickListener(this);
        this.y = (ListTile) findViewById(R.id.lab);
        if (HMDeviceConfig.hasBoundClassicWatch()) {
            this.y.setVisibility(8);
        } else {
            this.y.setVisibility(0);
            this.y.setOnClickListener(new View.OnClickListener() { // from class: tq6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.A(view);
                }
            });
        }
        LogoutFaultHandler.INSTANCE.getShouldShowTip().observe(this, new Observer() { // from class: vq6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.B((Boolean) obj);
            }
        });
        String currentAccountDesc = AccountHelper.INSTANCE.getCurrentAccountDesc();
        if (!TextUtils.isEmpty(currentAccountDesc)) {
            F(currentAccountDesc);
        }
        View viewFindViewById3 = findViewById(R.id.permission);
        viewFindViewById3.setOnClickListener(this);
        if (Build.VERSION.SDK_INT < 23) {
            viewFindViewById3.setVisibility(8);
        }
    }

    private void F(final String accountDesc) {
        final TextView textView = (TextView) findViewById(R.id.current_login_info_text);
        textView.setVisibility(0);
        textView.post(new Runnable() { // from class: wq6
            @Override // java.lang.Runnable
            public final void run() {
                SettingActivity.C(accountDesc, textView);
            }
        });
    }

    private void G(String msg) {
        LoadingDialog loadingDialog = this.C;
        if (loadingDialog == null) {
            this.C = LoadingDialog.showDialog(this);
        } else {
            loadingDialog.show();
        }
        this.C.setCancelable(false);
        if (TextUtils.isEmpty(msg)) {
            return;
        }
        this.C.setMessage(msg);
    }

    public static void lunch(Context context, String from) {
        Intent intent = new Intent(context, (Class<?>) SettingActivity.class);
        intent.putExtra(START_FROM, from);
        context.startActivity(intent);
    }

    private void u() {
        if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            IconToast.showError(this, getString(R.string.no_network_connection));
        } else {
            G(getString(R.string.account_bind_loading));
            AccountManager.getDefault(getApplicationContext()).listAccount(false, new a(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(List<BindAccount> bindAccounts) {
        AccountInfo accountInfo = new AccountInfo();
        for (BindAccount bindAccount : bindAccounts) {
            accountInfo.setAccountId(bindAccount.getThirdType(), bindAccount.getThirdId());
        }
        Intent intent = new Intent(this, (Class<?>) AccountBindActivity.class);
        intent.putExtra(AccountBindActivity.ACCOUNT_INFO, accountInfo);
        startActivity(intent);
    }

    private boolean w() {
        return this.B.getValue().hasBound(HMDeviceType.MILI) || (GlobalConfig.get().isBuildMidong() && this.B.getValue().hasBound(HMDeviceType.WATCH));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit x(AlertDialogFragment.Builder builder) {
        boolean zIsInComingCallEnabled = HMPersonInfo.getInstance().getMiliConfig().isInComingCallEnabled();
        boolean zHasBound = this.B.getValue().hasBound(HMDeviceType.MILI);
        if (zIsInComingCallEnabled && zHasBound) {
            builder.setMessage(R.string.logout_content);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit y() {
        RealTimeTransmissionEntry.stop();
        SettingRepo.INSTANCE.updateSyncCalendarDialogShow(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(ListTile listTile, CompoundButton compoundButton, boolean z) {
        if (z) {
            return;
        }
        LightAppStore.INSTANCE.saveDeveloperModeValue(false);
        listTile.setVisibility(8);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (buttonView.isPressed()) {
            this.A.setNotificationOn(isChecked);
            this.z.saveInfo(2);
            if (isChecked) {
                ResidentNotificationManager.showNotification(ResidentNotify.INSTANCE);
            } else {
                ResidentNotificationManager.cancelNotification(ResidentNotify.INSTANCE);
                HMKeeper.setClosedNotificationState(true);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.night_setting_mode) {
            Router.build("setting/NightModeSettingActivity").go(this);
            return;
        }
        if (id == R.id.unit) {
            startActivity(new Intent(this, (Class<?>) SetUnitActivity.class));
            Analytics.recordEvent(new CountEventBuilder("Setting_Out").setValue(StatEvent.EventParams.UNITS));
            return;
        }
        if (id == R.id.update) {
            if (Config.isBuildOversea()) {
                Util.toPlayStore(this);
                return;
            } else if (UpdateManager.getInstance().isUpdating(this)) {
                Toast.makeText(this, getString(R.string.updating), 0).show();
                return;
            } else {
                UpdateManager.getInstance().checkUpdate(true, this);
                return;
            }
        }
        if (id == R.id.about) {
            startActivity(new Intent(this, (Class<?>) AboutActivity.class));
            Analytics.recordEvent(new CountEventBuilder("Setting_Out").setValue(StatEvent.EventParams.ABOUT));
            return;
        }
        if (id == R.id.cache) {
            Analytics.recordEvent(new CountEventBuilder("Setting_Out").setValue(StatEvent.EventParams.CACHECLEAN));
            startActivity(new Intent(this, (Class<?>) CacheActivity.class));
            return;
        }
        if (id == R.id.permission) {
            startActivity(new Intent(this, (Class<?>) PermissionManagerActivity.class));
            return;
        }
        if (id == R.id.feedback) {
            ((FeedbackService) ((Lazy) KoinJavaComponent.get(FeedbackService.class)).getValue()).feedback(null, this, getSupportFragmentManager(), null);
            Analytics.recordEvent(new CountEventBuilder("Setting_Out").setValue(StatEvent.EventParams.FEEDBACK));
        } else if (id == R.id.logout) {
            D();
        } else if (id == R.id.account_bind) {
            u();
        } else if (id == R.id.revoke) {
            startActivity(new Intent(this, (Class<?>) CardRevokeActivity.class));
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        GlobalTitleStyle.setUnifyTitleStyle(this, getString(R.string.title_activity_setting));
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.z = hMPersonInfo;
        this.A = hMPersonInfo.getMiliConfig();
        E();
        ServerFaultHelper.enterSettingPage();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LoadingDialog loadingDialog = this.C;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
        ServerFaultHelper.exitSettingPage();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Intent intent = getIntent();
        String str = "Set";
        if (intent != null) {
            String stringExtra = intent.getStringExtra(START_FROM);
            if (!FROM_PUSH_APP_UPGRADE.equals(stringExtra)) {
                str = stringExtra;
            } else if (!this.x) {
                this.x = true;
                UpdateManager.getInstance().checkUpdate(true, this);
            }
            if (TextUtils.equals("Notification", str)) {
                Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.MINE_SETTING_NOTIFICATION_BAR));
            }
        }
        this.y.setGrayEnable(RealTimeTransmissionEntry.isOpen());
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.MINE_SETTING_VIEWNUM).setValue(str));
        final ListTile listTile = (ListTile) findViewById(R.id.developer);
        if (LightAppStore.INSTANCE.isDeveloperModeOpen()) {
            listTile.setVisibility(0);
            listTile.setChecked(true);
        }
        listTile.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: uq6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SettingActivity.z(listTile, compoundButton, z);
            }
        });
    }
}
