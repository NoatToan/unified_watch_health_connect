package com.xiaomi.hm.health.ui.smartplay;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.device.feature.notification.utils.AppUtil;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.MiuiFnApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.view.widget.TipComponent;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.smartplay.SMAlertByNotificationActivity;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
public class SMAlertByNotificationActivity extends BaseSmartPlayActivity {
    private static final String L = "SMAlertByNotificationActivity";
    private static final int M = 1;
    private TipComponent F;
    private ListTile G;
    private ListTile H;
    private final Lazy<DeviceManagerApi> I = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<MiuiFnApi> J = KoinJavaComponent.inject(MiuiFnApi.class);
    private BLEStatueListenerAdapter K = new b();

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            SMAlertByNotificationActivity.this.v();
        }
    }

    public class b extends BLEStatueListenerAdapter {
        public b() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public CharSequence getUnbindStr() {
            return SMAlertByNotificationActivity.this.getString(R.string.sm_alert_not_bound);
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean z) {
            SMAlertByNotificationActivity.this.C(z);
        }
    }

    private void A() {
        new AlertDialogFragment.Builder(this).setMessage(getString(R.string.get_notification_access_tips)).setPositiveButton(getString(R.string.yes), new a()).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: wg6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setCancelable(false).show(getSupportFragmentManager());
    }

    private void B() {
        BTStatusFragment bTStatusFragment = this.mFragment;
        C(bTStatusFragment != null && bTStatusFragment.getLastEnableState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(boolean z) {
        if (!AppUtil.INSTANCE.isNotificationAccessEnabled(DeviceXFunctionsKt.getContext())) {
            z(R.string.app_notify_access_title, R.string.app_notify_access_subtitle);
            return;
        }
        if (NotificationManager.getInstance().isServiceNotRunning(this) && this.J.getValue().isMiui(this)) {
            z(R.string.app_notify_access_error_title, R.string.app_notify_access_error_subtitle);
            return;
        }
        if (z) {
            this.F.setVisibility(8);
            this.G.setEnabled(true);
            this.H.setEnabled(true);
        } else {
            this.F.setVisibility(8);
            this.G.setEnabled(false);
            this.H.setEnabled(false);
        }
    }

    private void D() {
        this.H.setVisibility(8);
    }

    private void initView() {
        setStatusListener(this.K);
        TipComponent tipComponent = (TipComponent) findViewById(R.id.sm_tip);
        this.F = tipComponent;
        tipComponent.setIcon(R.drawable.ic_warning_error);
        this.G = (ListTile) findViewById(R.id.sm_enable);
        this.H = (ListTile) findViewById(R.id.sm_vibrate);
        this.F.setActionGoto(new View.OnClickListener() { // from class: xg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.w(view);
            }
        });
        B();
        this.G.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: yg6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SMAlertByNotificationActivity.x(compoundButton, z);
            }
        });
        this.G.setChecked(HMPersonInfo.getInstance().getMiliConfig().isSmsNotifyEnabled());
        HMDeviceSource boundDeviceSource = this.I.getValue().getBoundDeviceSource(HMDeviceType.MILI);
        if (!HMDeviceConfig.hasBoundWatch()) {
            setSmartTip(getString(R.string.incoming_call_alert_logo_tips));
            setSmartImageView(R.drawable.img_remind_phone_band_enable, R.drawable.img_remind_sms_enable);
            return;
        }
        setSmartTip(getString(R.string.incoming_call_alert_logo_watch_tips));
        this.G.setSubtitle(R.string.enable_sm_alert_tips_watch);
        if (boundDeviceSource == HMDeviceSource.MILI_TOKYO) {
            setSmartImageView(R.drawable.tokyo_img_remind_phone_and_watch_tokyo, R.drawable.img_remind_sms_enable);
            this.G.setSubtitle(R.string.enable_sm_alert_tips_watch_beep);
        } else if (boundDeviceSource == HMDeviceSource.MILI_VENICE || boundDeviceSource == HMDeviceSource.MILI_VENICE_W) {
            setSmartImageView(R.drawable.img_remind_phone_and_watch_venice, R.drawable.img_remind_sms_enable);
        } else if (ConfigHelperKt.hasFeature(boundDeviceSource, Feature.ROUND_WATCH_S)) {
            setSmartImageView(R.drawable.img_remind_phone_and_watch_pyh, R.drawable.img_remind_sms_enable);
        } else {
            setSmartImageView(R.drawable.img_remind_phone_and_watch, R.drawable.img_remind_sms_enable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        try {
            try {
                startActivityForResult(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"), 1);
            } catch (ActivityNotFoundException unused) {
                IconToast.showError(getApplicationContext(), "unknown error");
            }
        } catch (ActivityNotFoundException unused2) {
            startActivityForResult(new Intent("android.settings.NOTIFICATION_LISTENER_SETTINGS"), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(View view) {
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(CompoundButton compoundButton, boolean z) {
        HMPersonInfo.getInstance().getMiliConfig().setSmsNotifyEnabled(z);
        HMPersonInfo.getInstance().saveInfo(2);
    }

    private void z(int i, int i2) {
        this.F.setVisibility(0);
        this.F.setTitle(i);
        this.F.setSubTitle(getString(i2));
        this.G.setEnabled(false);
        this.H.setEnabled(false);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        B();
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setSmartContent(R.layout.activity_sm_alert_by_notification);
        setRainbowTitleText(R.string.sm_alert);
        NotificationManager.getInstance().checkNotificationService(this);
        initView();
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        D();
    }
}
