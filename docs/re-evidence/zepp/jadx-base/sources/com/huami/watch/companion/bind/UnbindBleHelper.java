package com.huami.watch.companion.bind;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;
import androidx.annotation.MainThread;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.R;
import com.huami.watch.companion.bind.UnbindBleHelper;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.sync.SyncManager;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Log;
import com.huami.watch.util.NetworkUtil;
import com.huami.watch.util.Rx;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes16.dex */
public class UnbindBleHelper {
    private static final String a = "UnbindBleHelper";
    private static Disposable b;
    private static DialogFragment c;

    public class a extends HMCallback {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ Device b;

        public a(Activity activity, Device device) {
            this.a = activity;
            this.b = device;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            if (z) {
                UnbindBleHelper.y(this.a, this.b);
            } else {
                UnbindBleHelper.k();
                Toast.makeText(this.a, R.string.device_unbind_fail, 1).show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k() {
        DialogFragment dialogFragment = c;
        if (dialogFragment != null) {
            LoadingDialog.dismiss(dialogFragment);
            c = null;
        }
    }

    private static boolean l(final Activity activity) {
        if (NetworkUtil.isOnline(activity)) {
            return false;
        }
        AlertDialog.setMessage(activity.getString(R.string.device_unbind_check_network)).setNeutralBtn(activity.getString(R.string.btn_known), new DialogInterface.OnClickListener() { // from class: b18
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UnbindBleHelper.m(activity, dialogInterface, i);
            }
        }).show(activity, "Unbind-NetworkUnavailable");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(Activity activity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Analytics.event(activity, AnalyticsEvents.EVENT_CONFIRM_UNBIND_NET_ERROR, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Activity activity, Device device, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Analytics.event(activity, AnalyticsEvents.EVENT_DISCONNECTED_UNBIND_CONFIRM, 1);
        if (l(activity)) {
            return;
        }
        x(activity, device, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(Activity activity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Analytics.event(activity, AnalyticsEvents.EVENT_CANCEL_DISCONNECTED_UNBIND, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(Activity activity, Device device, boolean z, DialogInterface dialogInterface, int i) {
        Analytics.event(activity, AnalyticsEvents.EVENT_SYNC_FAILED_UNBIND_CONFIRM);
        if (l(activity)) {
            return;
        }
        x(activity, device, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(Activity activity, Device device, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Analytics.event(activity, AnalyticsEvents.EVENT_UNBIND_CONFIRM, 1);
        if (l(activity) || device == null) {
            return;
        }
        if (device.isConnected()) {
            x(activity, device, false);
        } else {
            u(activity, device);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(Activity activity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Analytics.event(activity, AnalyticsEvents.EVENT_CANCEL_UNBIND, 1);
    }

    public static void release() {
        Disposable disposable = b;
        if (disposable != null) {
            disposable.dispose();
            b = null;
        }
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(Activity activity, Device device, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Boolean.valueOf(BindUtil.i(activity, device)));
    }

    @MainThread
    public static void start(final Activity activity, final Device device) {
        if (l(activity)) {
            return;
        }
        release();
        Log.i(a, "Start Unbind Device...Show Confirm Dialog!!", new Object[0]);
        AlertDialog.setMessage(activity.getString(R.string.wl_unbind_without_device)).setPositiveBtn(activity.getString(R.string.device_watch_unbind_confirm), new DialogInterface.OnClickListener() { // from class: e18
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UnbindBleHelper.q(activity, device, dialogInterface, i);
            }
        }).setNegativeBtn(activity.getString(R.string.dialog_cancel), new DialogInterface.OnClickListener() { // from class: c18
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UnbindBleHelper.r(activity, dialogInterface, i);
            }
        }).show(activity.getFragmentManager(), "Unbind-Confirm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(boolean z, Activity activity, Device device, Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            k();
            v(activity, device, z, true);
            return;
        }
        if (z) {
            y(activity, device);
            return;
        }
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice != null) {
            if (!Config.isTestMode()) {
                hMSmartWatchDevice.unbind(hMSmartWatchDevice.getAuthInfo(), new a(activity, device));
            } else {
                Log.d(a, "IsTestMode, Unbind device without Reset...", new Object[0]);
                y(activity, device);
            }
        }
    }

    private static void u(final Activity activity, final Device device) {
        AlertDialog.setTitle(activity.getString(R.string.device_disconnected)).setMessage(activity.getString(R.string.device_unbind_disconnected_tip)).setPositiveBtn(activity.getString(R.string.device_watch_unbind_confirm), new DialogInterface.OnClickListener() { // from class: f18
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UnbindBleHelper.n(activity, device, dialogInterface, i);
            }
        }).setNegativeBtn(activity.getString(R.string.dialog_cancel), new DialogInterface.OnClickListener() { // from class: d18
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UnbindBleHelper.o(activity, dialogInterface, i);
            }
        }).show(activity, "Unbind-DisconnectedConfirm");
    }

    private static void v(final Activity activity, final Device device, final boolean z, boolean z2) {
        SyncManager.showSyncFailTip(activity, activity.getString(z2 ? R.string.device_unbind_check_network : R.string.device_unbind_disconnected_tip), activity.getString(R.string.device_watch_unbind_confirm), new DialogInterface.OnClickListener() { // from class: g18
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UnbindBleHelper.p(activity, device, z, dialogInterface, i);
            }
        }, null);
    }

    private static void w(Activity activity) {
        k();
        c = LoadingDialog.setMessage(activity.getString(R.string.device_unbinding)).setCancelable(false).show(activity, "Unbinding");
    }

    private static void x(final Activity activity, final Device device, final boolean z) {
        w(activity);
        Rx.io(new ObservableOnSubscribe() { // from class: h18
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                UnbindBleHelper.s(activity, device, observableEmitter);
            }
        }).subscribe(new Consumer() { // from class: i18
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                UnbindBleHelper.t(z, activity, device, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Context context, Device device) {
        Log.d(a, "Start UnbindDevice : " + device, new Object[0]);
        boolean zIsActive = device.isActive();
        BindUtil.k(context, device.address());
        if (zIsActive) {
            BindCallback.c(context);
        }
    }
}
