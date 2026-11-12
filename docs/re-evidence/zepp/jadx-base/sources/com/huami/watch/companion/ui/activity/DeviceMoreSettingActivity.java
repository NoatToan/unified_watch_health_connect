package com.huami.watch.companion.ui.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.R;
import com.huami.watch.companion.bind.UnbindBleHelper;
import com.huami.watch.companion.bind.UnbindHelper;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.event.DeviceUnboundEvent;
import com.huami.watch.companion.notification.NotificationTestActivity;
import com.huami.watch.companion.ui.activity.DeviceMoreSettingActivity;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.ui.view.ToastWithIcon;
import com.huami.watch.companion.update.RomUpgradeHelper;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;
import com.huami.watch.util.NetworkUtil;
import com.huami.watch.util.RxBus;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class DeviceMoreSettingActivity extends AppCompatActivity {
    private static final String f = "UI-DeviceMoreSettingActivity";
    private Activity a;
    private Device b;
    private Disposable c;
    private Transporter d;
    private LoadingDialog e;

    public class a implements Observer<Boolean> {
        public a() {
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean bool) {
            if (!bool.booleanValue()) {
                DeviceMoreSettingActivity deviceMoreSettingActivity = DeviceMoreSettingActivity.this;
                Toast.makeText(deviceMoreSettingActivity, deviceMoreSettingActivity.getString(R.string.update_up_to_date), 0).show();
            } else if (DeviceUtil.isRomSupportAutoUpdate(DeviceMoreSettingActivity.this.a)) {
                RomUpdateActivity.to(DeviceMoreSettingActivity.this.a, RomUpgradeHelper.getHelper(DeviceMoreSettingActivity.this.a).getLastRomUpdateVersion(), RomUpgradeHelper.getHelper(DeviceMoreSettingActivity.this.a).getUpdateInfo());
            } else {
                DeviceMoreSettingActivity.this.t();
            }
            DeviceMoreSettingActivity.this.dismissDialog();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            Analytics.exception(DeviceMoreSettingActivity.this, new Exception(th));
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissDialog() {
        LoadingDialog loadingDialog = this.e;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.e.dismiss();
    }

    private void initViews() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        actionbarLayout.setTitleText(getString(R.string.more_settings));
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: k81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.m(view);
            }
        });
        View viewFindViewById = findViewById(R.id.mask_view);
        viewFindViewById.setVisibility(!this.b.isConnected() ? 0 : 8);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.n(view);
            }
        });
        findViewById(R.id.assistant_lab).setVisibility((Config.isInner() && DeviceUtil.isSupportAssistant(this)) ? 0 : 8);
    }

    private void l() {
        if (DeviceManager.getManager(this).isBoundDeviceConnected()) {
            return;
        }
        ToastWithIcon.showShort(this, getString(com.huami.assistant.R.string.connect_watch_toast), com.huami.assistant.R.drawable.toast_icon_attention);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(DialogInterface dialogInterface, int i) {
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(Object obj) throws Exception {
        if (obj instanceof DeviceUnboundEvent) {
            Log.i(f, "OnDeviceUnbound : To finish this!!", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(Throwable th) throws Exception {
        HMLog.warn(f, th, new Function0() { // from class: o81
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return DeviceMoreSettingActivity.q();
            }
        });
    }

    private void s() {
        new AlertDialogFragment.Builder(this).setTitle(R.string.nfc_unbind_tips_title).setMessage(R.string.nfc_unbind_tips_info).setCancelable(true).setNeutralButton(R.string.wl_i_know_it, new DialogInterface.OnClickListener() { // from class: j81
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.o(dialogInterface, i);
            }
        }).show(getSupportFragmentManager(), "showNfcTipsDialog");
    }

    private void showLoadingDialog() {
        dismissDialog();
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.update_checking));
        this.e = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        new AlertDialogFragment.Builder(this).setTitle(getString(R.string.watch_rom_old)).setMessage(getString(R.string.watch_rom_old_tips)).setCancelable(false).setNeutralButton(getString(R.string.btn_known), (DialogInterface.OnClickListener) null).show(getSupportFragmentManager(), "RomOldDialog");
    }

    private void u() {
        Log.d(f, "Start Unbind...", new Object[0]);
        if (DeviceSource.isSeriesEverest2(this.b)) {
            UnbindBleHelper.start(this, this.b);
        } else {
            UnbindHelper.showUnbindConfirmDialog(this, this.b, this.d);
        }
    }

    private void v() {
        this.c = RxBus.get().toObservable().subscribe(new Consumer() { // from class: n81
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                DeviceMoreSettingActivity.p(obj);
            }
        }, new Consumer() { // from class: m81
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                DeviceMoreSettingActivity.r((Throwable) obj);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.a = this;
        setContentView(R.layout.activity_device_more_setting);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        String stringExtra = getIntent().getStringExtra(BaseDeviceStatusActivity.KEY_DEVICE);
        Device deviceFind = DeviceManager.getManager(this).find(stringExtra);
        this.b = deviceFind;
        if (deviceFind == null) {
            Log.w(f, "No Device for : " + stringExtra + ", Abort!!", new Object[0]);
            return;
        }
        Log.d(f, "Device : " + this.b, new Object[0]);
        initViews();
        v();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Disposable disposable = this.c;
        if (disposable != null) {
            disposable.dispose();
            this.c = null;
        }
        UnbindHelper.release();
        super.onDestroy();
    }

    public void onSettingAssistantLabClick(View view) {
        if (Config.isInner()) {
            try {
                Intent intent = new Intent();
                intent.setClassName("com.huami.watch.hmwatchmanager", "com.huami.assistant.lab.ui.LabActivity");
                startActivity(intent);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void onSettingDeviceNameClick(View view) {
        Intent intent = new Intent(this, (Class<?>) SetDeviceNameActivity.class);
        intent.putExtra("device_id", this.b.getCpuId());
        startActivity(intent);
    }

    public void onSettingNotificationTestClick(View view) {
        startActivity(new Intent(this, (Class<?>) NotificationTestActivity.class));
    }

    public void onSettingRomUpdateClick(View view) {
        if (!NetworkUtil.isOnline(this)) {
            Toast.makeText(this.a, R.string.network_unavailable, 0).show();
            return;
        }
        Device currentDevice = DeviceManager.getManager(this).getCurrentDevice();
        if (currentDevice == null || !currentDevice.isConnected()) {
            Toast.makeText(this.a, R.string.device_disconnected, 0).show();
        } else {
            showLoadingDialog();
            RomUpgradeHelper.getHelper(this).checkRomNeedUpgradeAsync(new a());
        }
    }

    public void onSettingUnbindClick(View view) {
        if (this.d == null) {
            this.d = Transporter.get(this, "com.huami.watch.companion");
        }
        if (!GlobalConfig.get().isBuildAmazfit() && (DeviceUtil.isSupportNFCDoor(this.b) || DeviceUtil.isSupportNFCUnionPay(this.b))) {
            s();
        } else {
            u();
        }
        Analytics.event(this, AnalyticsEvents.EVENT_UNBIND);
    }
}
