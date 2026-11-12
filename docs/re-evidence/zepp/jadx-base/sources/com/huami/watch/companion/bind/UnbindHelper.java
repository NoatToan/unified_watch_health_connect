package com.huami.watch.companion.bind;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;
import com.huami.watch.companion.R;
import com.huami.watch.companion.bind.UnbindHelper;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.sync.SyncCenter;
import com.huami.watch.companion.sync.SyncManager;
import com.huami.watch.companion.sync.SyncUnbindHelper;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.companion.util.Broadcaster;
import com.huami.watch.transport.Transporter;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Log;
import com.huami.watch.util.NetworkUtil;
import com.huami.watch.util.Rx;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes16.dex */
public class UnbindHelper {
    private static final String a = "UnbindHelper";
    private static Disposable b;
    private static DialogFragment c;
    public static boolean sIsUnbinding;

    private static void A(Activity activity) {
        l();
        c = LoadingDialog.setMessage(activity.getString(R.string.syncing)).setCancelable(false).show(activity, "Unbind-SyncingData");
    }

    private static void B(Activity activity) {
        l();
        c = LoadingDialog.setMessage(activity.getString(R.string.device_unbinding)).setCancelable(false).show(activity, "Unbinding");
    }

    private static void C(final Activity activity, final Device device, final Transporter transporter) {
        Broadcaster.sendLocalBroadcast(activity, "com.huami.watch.companion.action.UnbindDeviceStart");
        A(activity);
        b = Rx.io(new ObservableOnSubscribe() { // from class: r18
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                UnbindHelper.t(activity, transporter, observableEmitter);
            }
        }).subscribe(new Consumer() { // from class: t18
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                UnbindHelper.u(activity, device, transporter, (Boolean) obj);
            }
        });
    }

    private static void D(final Activity activity, final Device device, final Transporter transporter, final boolean z) {
        B(activity);
        sIsUnbinding = true;
        Rx.io(new ObservableOnSubscribe() { // from class: q18
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                UnbindHelper.w(activity, device, observableEmitter);
            }
        }).subscribe(new Consumer() { // from class: k18
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                UnbindHelper.v(z, activity, device, transporter, (Boolean) obj);
            }
        });
    }

    private static void E(Context context, Device device) {
        Log.d(a, "Start UnbindDevice : " + device, new Object[0]);
        boolean zIsActive = device.isActive();
        BindUtil.k(context, device.address());
        if (zIsActive) {
            BindCallback.c(context);
        }
    }

    private static void l() {
        DialogFragment dialogFragment = c;
        if (dialogFragment != null) {
            LoadingDialog.dismiss(dialogFragment);
            c = null;
        }
    }

    private static boolean m(final Activity activity) {
        if (NetworkUtil.isOnline(activity)) {
            return false;
        }
        AlertDialog.setMessage(activity.getString(R.string.device_unbind_check_network)).setNeutralBtn(activity.getString(R.string.btn_known), new DialogInterface.OnClickListener() { // from class: j18
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UnbindHelper.n(activity, dialogInterface, i);
            }
        }).show(activity, "Unbind-NetworkUnavailable");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Activity activity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Analytics.event(activity, AnalyticsEvents.EVENT_CONFIRM_UNBIND_NET_ERROR, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(Activity activity, Device device, Transporter transporter, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Analytics.event(activity, AnalyticsEvents.EVENT_DISCONNECTED_UNBIND_CONFIRM, 1);
        if (m(activity)) {
            return;
        }
        D(activity, device, transporter, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(Activity activity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Analytics.event(activity, AnalyticsEvents.EVENT_CANCEL_DISCONNECTED_UNBIND, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(Activity activity, Device device, Transporter transporter, boolean z, DialogInterface dialogInterface, int i) {
        Analytics.event(activity, AnalyticsEvents.EVENT_SYNC_FAILED_UNBIND_CONFIRM);
        if (m(activity)) {
            return;
        }
        D(activity, device, transporter, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(Activity activity, Device device, Transporter transporter, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Analytics.event(activity, AnalyticsEvents.EVENT_UNBIND_CONFIRM, 1);
        if (m(activity) || device == null) {
            return;
        }
        if (device.isConnected()) {
            C(activity, device, transporter);
        } else {
            y(activity, device, transporter);
        }
    }

    public static void release() {
        Disposable disposable = b;
        if (disposable != null) {
            disposable.dispose();
            b = null;
        }
        l();
        sIsUnbinding = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(Activity activity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Analytics.event(activity, AnalyticsEvents.EVENT_CANCEL_UNBIND, 1);
    }

    public static void showUnbindConfirmDialog(final Activity activity, final Device device, final Transporter transporter) {
        if (m(activity)) {
            return;
        }
        release();
        Log.i(a, "Start unbind device...show confirm dialog", new Object[0]);
        AlertDialog.setMessage(activity.getString(R.string.wl_unbind_without_device)).setPositiveBtn(activity.getString(R.string.device_watch_unbind_confirm), new DialogInterface.OnClickListener() { // from class: o18
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UnbindHelper.r(activity, device, transporter, dialogInterface, i);
            }
        }).setNegativeBtn(activity.getString(R.string.dialog_cancel), new DialogInterface.OnClickListener() { // from class: m18
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UnbindHelper.s(activity, dialogInterface, i);
            }
        }).show(activity.getFragmentManager(), "Unbind-Confirm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(Activity activity, Transporter transporter, ObservableEmitter observableEmitter) throws Exception {
        boolean zBackupFromWatch = SyncManager.getManager().backupFromWatch(activity, transporter);
        if (zBackupFromWatch) {
            zBackupFromWatch = SyncCenter.getCenter(activity).types(3).silent(true).start();
        }
        observableEmitter.onNext(Boolean.valueOf(zBackupFromWatch));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(Activity activity, Device device, Transporter transporter, Boolean bool) throws Exception {
        l();
        if (bool.booleanValue()) {
            D(activity, device, transporter, false);
        } else {
            z(activity, device, transporter, false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(boolean z, final Activity activity, final Device device, Transporter transporter, Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            l();
            z(activity, device, transporter, z, true);
            sIsUnbinding = false;
        } else if (!z) {
            SyncUnbindHelper.getHelper(activity, transporter).startAsync(new Consumer() { // from class: s18
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    UnbindHelper.x(activity, device, (Boolean) obj);
                }
            });
        } else {
            E(activity, device);
            sIsUnbinding = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Activity activity, Device device, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Boolean.valueOf(BindUtil.i(activity, device)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(Activity activity, Device device, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            E(activity, device);
        } else {
            l();
            Toast.makeText(activity, R.string.device_unbind_fail, 1).show();
        }
        sIsUnbinding = false;
    }

    private static void y(final Activity activity, final Device device, final Transporter transporter) {
        AlertDialog.setTitle(activity.getString(R.string.device_disconnected)).setMessage(activity.getString(R.string.device_unbind_disconnected_tip)).setPositiveBtn(activity.getString(R.string.device_watch_unbind_confirm), new DialogInterface.OnClickListener() { // from class: n18
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UnbindHelper.o(activity, device, transporter, dialogInterface, i);
            }
        }).setNegativeBtn(activity.getString(R.string.dialog_cancel), new DialogInterface.OnClickListener() { // from class: l18
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UnbindHelper.p(activity, dialogInterface, i);
            }
        }).show(activity, "Unbind-DisconnectedConfirm");
    }

    private static void z(final Activity activity, final Device device, final Transporter transporter, final boolean z, boolean z2) {
        SyncManager.showSyncFailTip(activity, activity.getString(z2 ? R.string.device_unbind_check_network : R.string.device_unbind_disconnected_tip), activity.getString(R.string.device_watch_unbind_confirm), new DialogInterface.OnClickListener() { // from class: p18
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UnbindHelper.q(activity, device, transporter, z, dialogInterface, i);
            }
        }, null);
    }
}
