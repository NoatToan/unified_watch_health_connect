package com.huami.watch.companion.bind;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.R;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.account.UserInfoManager;
import com.huami.watch.companion.agps.AGpsSyncHelper;
import com.huami.watch.companion.app.WatchWidgetNewManager;
import com.huami.watch.companion.bind.BindHelper;
import com.huami.watch.companion.bluetooth.BluetoothReceiver;
import com.huami.watch.companion.common.ASyncHelper;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.event.BluetoothPairingConfirmEvent;
import com.huami.watch.companion.event.BluetoothPairingUserConfirmedEvent;
import com.huami.watch.companion.event.ConnectedEvent;
import com.huami.watch.companion.event.DeviceBoundEvent;
import com.huami.watch.companion.initial.InitialState;
import com.huami.watch.companion.manager.UnitManager;
import com.huami.watch.companion.notification.NotificationManager;
import com.huami.watch.companion.sport.SportSortManager;
import com.huami.watch.companion.sync.SyncCenter;
import com.huami.watch.companion.sync.SyncDeviceInfoHelper;
import com.huami.watch.companion.sync.SyncResult;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.companion.usersettings.UserSettingsManager;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.companion.util.Broadcaster;
import com.huami.watch.companion.util.KeyValueUtil;
import com.huami.watch.companion.watchface.WatchFaceManager;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.AndroidPermissions;
import com.huami.watch.util.BTUtil;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import com.xiaomi.mipush.sdk.Constants;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class BindHelper extends ASyncHelper {
    public static final int PERMISSION_REQUEST_COARSE_LOCATION = 1;
    public static final int STATE_BT_PAIRING_CONFIRM = 5;
    public static final int STATE_BT_PAIRING_USER_CANCELED = 7;
    public static final int STATE_BT_PAIRING_USER_CONFIRMED = 6;
    public static final int STATE_BT_REQUEST_PAIRING = 4;
    public static final int STATE_CONNECTED = 9;
    public static final int STATE_CONNECTING = 8;
    public static final int STATE_FAIL_CANCEL = -2;
    public static final int STATE_FAIL_DISCONNECT = -4;
    public static final int STATE_FAIL_TIMEOUT = -3;
    public static final int STATE_FINISH = -7;
    public static final int STATE_PREPARE = -1;
    public static final int STATE_PREPARING = -10;
    public static final int STATE_RESTORE = 13;
    public static final int STATE_RESTORE_CONFIRM = 10;
    public static final int STATE_RESTORE_NO = 14;
    public static final int STATE_RESTORE_USER_CONFIRMED_NO = 12;
    public static final int STATE_RESTORE_USER_CONFIRMED_YES = 11;
    public static final int STATE_RETRY = -5;
    public static final int STATE_SCAN_QR_START = 2;
    public static final int STATE_SCAN_QR_SUCCESS = 3;
    public static final int STATE_START = 1;
    public static final int STATE_SUCCESS = -6;
    private static final String l = "Bind-Helper";
    private static final int m = 30;
    private static int n = 2;
    public static BindHelper sHelper;
    public boolean c;
    private BindHelperUI d;
    private boolean e;
    private Transporter g;
    private Disposable k;
    public Handler mHandler;
    public int b = 60000;
    public l f = new l();
    private Transporter.DataListener h = new c();
    private Transporter.ChannelListener i = new d();
    private Runnable j = new e();

    public static class BindHelperUI extends ASyncHelper {
        private static final String f = "Bind-Helper-UI";
        private BindHelper b;
        private Activity c;
        private BluetoothReceiver d = new BluetoothReceiver();
        private AlertDialogFragment e;

        public class a implements DialogInterface.OnClickListener {
            public final /* synthetic */ Activity a;

            public a(Activity activity) {
                this.a = activity;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                AndroidPermissions.request(this.a, "android.permission.ACCESS_COARSE_LOCATION", 1);
            }
        }

        public class b implements View.OnClickListener {
            public b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BindHelperUI.this.b.notifyStateChanged(11);
            }
        }

        public class c implements View.OnClickListener {
            public c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BindHelperUI.this.b.notifyStateChanged(12);
            }
        }

        public class d implements View.OnClickListener {
            public final /* synthetic */ Activity a;

            public d(Activity activity) {
                this.a = activity;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BindHelperUI.this.e.dismissAllowingStateLoss();
                Analytics.event(this.a, AnalyticsEvents.EVENT_REBIND, 1);
                Log.i(BindHelperUI.f, "User Retry!!", new Object[0]);
                BindHelperUI.this.b.q0();
            }
        }

        public class e implements View.OnClickListener {
            public e() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BindHelperUI.this.b.notifyStateChanged(-2);
            }
        }

        public BindHelperUI(BindHelper bindHelper, Activity activity) {
            this.b = bindHelper;
            this.c = activity;
        }

        private void d() {
            AlertDialogFragment alertDialogFragment = this.e;
            if (alertDialogFragment != null) {
                try {
                    alertDialogFragment.dismissAllowingStateLoss();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                this.e = null;
            }
        }

        private void e(Activity activity) {
            Log.i(f, "OnBT PairingConfirm...", new Object[0]);
            r(activity);
        }

        private void f() {
            Log.i(f, "OnBT Pairing UserCanceled!!", new Object[0]);
            d();
        }

        private void g(Activity activity) {
            Log.i(f, "OnBT RequestPairing...", new Object[0]);
            r(activity);
        }

        private void h(Context context, boolean z) {
            Log.i(f, "OnBind Fail, Restore : " + z, new Object[0]);
            d();
            if (z) {
                Toast.makeText(context, R.string.bind_restore_fail, 0).show();
            } else {
                Toast.makeText(context, R.string.bind_fail, 0).show();
            }
            Analytics.event(context, AnalyticsEvents.EVENT_PAIR_FAILED, 1);
        }

        private void i(Activity activity, boolean z, int i) {
            Log.w(f, "OnBind Fail, Rebind..., Restore : " + z + ", FailCode : " + i, new Object[0]);
            t(activity, z, i);
        }

        private void j(Context context, boolean z) {
            Log.i(f, "OnBind Success, Restore : " + z, new Object[0]);
            d();
            Toast.makeText(context, R.string.bind_success, 0).show();
        }

        private void k(Activity activity) {
            Log.i(f, "OnConnecting...", new Object[0]);
            r(activity);
        }

        private void l(Activity activity) {
            Log.i(f, "On Prepare!!", new Object[0]);
            if (!InitialState.environmentVerifyForBinding(activity)) {
                this.b.notifyStateChanged(-10);
                return;
            }
            if (Build.VERSION.SDK_INT > 30 || AndroidPermissions.checkGranted(activity, "android.permission.ACCESS_COARSE_LOCATION")) {
                this.b.notifyStateChanged(1);
                this.b.notifyStateChanged(2);
            } else {
                s(activity);
                this.b.notifyStateChanged(-10);
            }
        }

        private void m(Activity activity) {
            Log.i(f, "OnRestore Confirm...", new Object[0]);
            d();
            String str = this.b.f.a;
            if (!TextUtils.isEmpty(str)) {
                u(activity, DeviceUtil.addressShort(str));
                return;
            }
            Log.w(f, "BindingDevice is Empty, Abort : " + str, new Object[0]);
        }

        private void n(Context context) {
            Log.i(f, "OnRestore UserConfirmed No!!", new Object[0]);
            d();
            InitialState.toBindingTip(context, false);
        }

        private void o(Context context) {
            Log.i(f, "OnRestore UserConfirmed Yes!!", new Object[0]);
            d();
            InitialState.toBindingTip(context, true);
        }

        private void onScanQRSuccess(Context context) {
            Log.i(f, "OnScanQR Success...", new Object[0]);
            this.d.register(context);
            this.d.onBindRequestPairingStart();
        }

        private void p(Activity activity) {
            Log.i(f, "OnScanQR Start..." + activity, new Object[0]);
            InitialState.toScan(activity);
        }

        private void r(Activity activity) {
            d();
            AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(2);
            this.e = alertDialogFragmentNewInstance;
            alertDialogFragmentNewInstance.setMessage(activity.getString(R.string.binding));
            this.e.setCancelable(false);
            FragmentTransaction fragmentTransactionBeginTransaction = activity.getFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction.add(this.e, "Connecting...");
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }

        @TargetApi(23)
        private static void s(Activity activity) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle(activity.getString(R.string.permission_request_location));
            builder.setMessage(activity.getString(R.string.permission_request_location_tip));
            builder.setPositiveButton(android.R.string.ok, new a(activity));
            builder.show();
        }

        private void t(Activity activity, boolean z, int i) {
            d();
            AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(4);
            this.e = alertDialogFragmentNewInstance;
            alertDialogFragmentNewInstance.setTitle(activity.getString(R.string.restored_failed));
            if (z) {
                this.e.setMessage(activity.getString(R.string.restoring_but_disconnected));
            } else {
                this.e.setMessage(activity.getString(R.string.initialing_but_disconnected));
            }
            if (i == 1) {
                this.e.setMessage(activity.getString(R.string.bind_fail_network_disconnect));
            }
            this.e.setNeutral(activity.getString(R.string.initialing_restart), new d(activity));
            this.e.setCancel(null, new e());
            FragmentTransaction fragmentTransactionBeginTransaction = activity.getFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction.add(this.e, "Rebind");
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }

        private void u(Activity activity, String str) {
            d();
            AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(3);
            this.e = alertDialogFragmentNewInstance;
            alertDialogFragmentNewInstance.setTitle(activity.getString(R.string.restore_back_up));
            this.e.setMessage(activity.getString(R.string.restore_confirm_msg));
            this.e.setConfirm(activity.getString(R.string.restore_confirm), new b());
            this.e.setCancel(activity.getString(R.string.restore_no), new c());
            this.e.setCancelable(false);
            FragmentTransaction fragmentTransactionBeginTransaction = activity.getFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction.add(this.e, "RestoreConfirm");
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }

        public void q(int i) {
            Activity activity = this.c;
            switch (i) {
                case -6:
                    j(activity, this.b.I());
                    break;
                case -5:
                    i(activity, this.b.I(), this.b.f.b);
                    break;
                case -4:
                case -3:
                    h(activity, this.b.I());
                    break;
                case -1:
                    l(activity);
                    break;
                case 2:
                    p(activity);
                    break;
                case 3:
                    onScanQRSuccess(activity);
                    break;
                case 4:
                    g(activity);
                    break;
                case 5:
                    e(activity);
                    break;
                case 7:
                    f();
                    break;
                case 8:
                    k(activity);
                    break;
                case 10:
                    m(activity);
                    break;
                case 11:
                    o(activity);
                    break;
                case 12:
                    n(activity);
                    break;
            }
        }

        @Override // com.huami.watch.companion.common.ASyncHelper
        public void release() {
            super.release();
            d();
            this.d.unregister(this.c);
        }

        @Override // com.huami.watch.companion.common.ASyncHelper
        public String tag() {
            return f;
        }
    }

    public class a implements Runnable {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BindHelper.this.notifyStateChanged(this.a);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BindHelper.this.release();
        }
    }

    public class c implements Transporter.DataListener {
        public c() {
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
            if (CompanionModule.ACTION_INITIAL_FINISH.equals(transportDataItem.getAction())) {
                BindHelper.this.m0(-6);
            }
        }
    }

    public class d implements Transporter.ChannelListener {
        public d() {
        }

        @Override // com.huami.watch.transport.Transporter.ChannelListener
        public void onChannelChanged(boolean z) {
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d(BindHelper.l, "Check Bind Result : " + BindHelper.this.e + ", LastState : " + ((String) BindHelper.this.mStateDescriptions.get(BindHelper.this.mState)), new Object[0]);
            if (BindHelper.this.e) {
                return;
            }
            if (BindHelper.this.mState == 14 || BindHelper.this.mState == 13) {
                BindHelper.this.f.d(1);
            }
            BindHelper.this.notifyStateChanged(-3);
        }
    }

    public class f implements Consumer<Object> {
        public f() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Object obj) throws Exception {
            Log.d(BindHelper.l, "Event : " + obj, new Object[0]);
            if (obj instanceof BluetoothPairingConfirmEvent) {
                if (BindHelper.this.mState == 4 || BindHelper.this.mState == 5) {
                    BindHelper.this.notifyStateChanged(5);
                    return;
                }
                return;
            }
            if (obj instanceof BluetoothPairingUserConfirmedEvent) {
                if (BindHelper.this.mState == 5) {
                    boolean z = ((BluetoothPairingUserConfirmedEvent) obj).confirmed;
                    BindHelper.this.notifyStateChanged(z ? 6 : 7);
                    BindHelper.this.notifyStateChanged(z ? 8 : -2);
                    return;
                }
                return;
            }
            if (!(obj instanceof ConnectedEvent) || 1 > BindHelper.this.mState || BindHelper.this.mState >= 9) {
                return;
            }
            BindHelper.this.notifyStateChanged(9);
        }
    }

    public class g implements Consumer<Integer> {
        public final /* synthetic */ Context a;

        public g(Context context) {
            this.a = context;
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Integer num) throws Exception {
            try {
                BindHelper.this.onStateChanged(this.a, num.intValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class h implements Action {
        public h() {
        }

        @Override // io.reactivex.functions.Action
        public void run() throws Exception {
            BindHelper.this.notifyStateChanged(InitialState.isNewUser() ? 12 : 10);
        }
    }

    public class i implements Runnable {
        public final /* synthetic */ Context a;

        public i(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d(BindHelper.l, "OnConnected, Sync DeviceInfo from Watch...", new Object[0]);
            String str = BindHelper.this.f.a;
            if (DeviceManager.getManager(this.a).find(str) != null) {
                BindHelper.this.syncDeviceInfoFromWatch(this.a, str);
            }
        }
    }

    public class j implements Transporter.DataSendResultCallback {
        public final /* synthetic */ Context a;

        public class a implements Transporter.DataSendResultCallback {
            public a() {
            }

            @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
            public void onResultBack(DataTransportResult dataTransportResult) {
                if (dataTransportResult.getResultCode() == 0) {
                    return;
                }
                BindHelper.this.m0(-4);
            }
        }

        public j(Context context) {
            this.a = context;
        }

        @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
        public void onResultBack(DataTransportResult dataTransportResult) {
            if (BindHelper.this.I()) {
                if (dataTransportResult.getResultCode() != 0) {
                    BindHelper.this.m0(-4);
                    return;
                }
                a aVar = new a();
                BindHelper bindHelper = BindHelper.this;
                bindHelper.r0(this.a, bindHelper.g, aVar);
                Analytics.event(this.a, AnalyticsEvents.EVENT_BIND_START_RESTORE, 1);
            }
        }
    }

    public class k implements Transporter.DataSendResultCallback {
        public final /* synthetic */ Context a;

        public k(Context context) {
            this.a = context;
        }

        @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
        public void onResultBack(DataTransportResult dataTransportResult) {
            if (dataTransportResult.getResultCode() != 0) {
                BindHelper.this.m0(-4);
                return;
            }
            Device deviceFind = DeviceManager.getManager(this.a).find(BindHelper.this.f.a);
            if (deviceFind != null) {
                WatchFaceManager.getManager().resetDefaultWatchFace(this.a, deviceFind);
                WatchWidgetNewManager.get().resetDefaultWidgetSequence(this.a, DeviceUtil.getHuamiModel(deviceFind));
            }
            String string = UserSettings.getString(this.a.getContentResolver(), UserSettingsKeys.KEY_WATCHFACE_SELECTED);
            String string2 = UserSettings.getString(this.a.getContentResolver(), UserSettingsKeys.KEY_WIDGET);
            UserSettingsManager.getManager(this.a).clearAll();
            NotificationManager.init(this.a);
            UnitManager.getInstance(this.a).init();
            UserSettings.put(this.a.getContentResolver(), UserSettingsKeys.KEY_WATCHFACE_SELECTED, string);
            UserSettings.put(this.a.getContentResolver(), UserSettingsKeys.KEY_WIDGET, string2);
            BindHelper.this.m0(-6);
        }
    }

    public static class l {
        public String a;
        public int b;

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            Log.d(BindHelper.l, "Clear BindingDevice: " + this.a, new Object[0]);
            this.a = null;
            Box.get().remove("BindingDevice");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String e() {
            return Box.get().getString("BindingDevice");
        }

        public void d(int i) {
            Log.d(BindHelper.l, "Fail, Code: " + i, new Object[0]);
            this.b = i;
        }

        public void f(String str) {
            Log.d(BindHelper.l, "Save BindingDevice [" + str + "]", new Object[0]);
            this.a = str;
            Box.get().put("BindingDevice", str);
        }
    }

    private void F() {
        this.f.c();
    }

    private String G() {
        return this.f.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean I() {
        boolean z = this.mState == 13;
        Log.d(l, "CurrentState: " + this.mStateDescriptions.get(this.mState) + ", IsRestoring: " + z, new Object[0]);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String J() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K(Throwable th) throws Exception {
        HMLog.warn(l, th, new Function0() { // from class: yv
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BindHelper.J();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(Integer num) throws Exception {
        try {
            this.d.q(num.intValue());
        } catch (Exception e2) {
            e2.printStackTrace();
            Log.e(this.d.tag(), "OnStateChangedErr!!", e2, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M(ObservableEmitter observableEmitter) throws Exception {
        BTUtil.startDiscovery();
        observableEmitter.onNext(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(Context context, ObservableEmitter observableEmitter) throws Exception {
        BTUtil.cancelDiscovery();
        BindUtil.f(context);
        observableEmitter.onNext(Boolean.valueOf(BindUtil.e(this.f.a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource O(final Context context, Boolean bool) throws Exception {
        return Rx.io(new ObservableOnSubscribe() { // from class: bw
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.N(context, observableEmitter);
            }
        }).observable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            return;
        }
        notifyStateChanged(-2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q(Throwable th) throws Exception {
        HMLog.warn(l, th, new Function0() { // from class: zv
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BindHelper.T();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(Context context, SyncResult syncResult) throws Exception {
        Log.d(l, "Sync AGpsData Skip RemainRetry : " + n, new Object[0]);
        if (syncResult.success || n <= 0) {
            s0(context);
            SyncUtil.syncWatchFacesFromWatch(this.g);
        } else {
            this.f.d(syncResult.failCode);
            n--;
            m0(-4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(final Context context, String str, SyncResult syncResult) throws Exception {
        if (syncResult.success) {
            AGpsSyncHelper.getHelper().syncAGpsToWatchObservable(context, 0L, 30, str).subscribe(new Consumer() { // from class: gw
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.R(context, (SyncResult) obj);
                }
            });
        } else {
            this.f.d(syncResult.failCode);
            m0(-4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String T() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(Context context, SyncResult syncResult) throws Exception {
        Log.d(l, "Sync AGpsData Skip RemainRetry : " + n, new Object[0]);
        if (syncResult.success || n <= 0) {
            t0(context);
            SyncUtil.syncWatchFacesFromWatch(this.g);
        } else {
            this.f.d(syncResult.failCode);
            n--;
            m0(-4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(final Context context, String str, SyncResult syncResult) throws Exception {
        if (syncResult.success) {
            AGpsSyncHelper.getHelper().syncAGpsToWatchObservable(context, 0L, 30, str).subscribe(new Consumer() { // from class: fw
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.U(context, (SyncResult) obj);
                }
            });
        } else {
            this.f.d(syncResult.failCode);
            m0(-4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String W() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void X(Throwable th) throws Exception {
        HMLog.warn(l, th, new Function0() { // from class: aw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BindHelper.W();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(Context context, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(v0(context));
    }

    private void Z() {
        Log.i(l, "OnBT Pairing Confirm...", new Object[0]);
        removeCheckBindResult();
    }

    private void a0() {
        Log.i(l, "OnBT Pairing UserCanceled!!", new Object[0]);
    }

    private void b0() {
        Log.i(l, "OnBT Pairing UserConfirmed!!", new Object[0]);
    }

    private void c0(Context context, boolean z) {
        Log.w(l, "OnBind Fail, Cancelled : " + z, new Object[0]);
        this.e = false;
        removeCheckBindResult();
        BindUtil.unbindDeviceWithCloud(context, this.f.a);
        BindUtil.connectCurrentDevice(context);
        if (z) {
            m0(-7);
            return;
        }
        Broadcaster.sendLocalBroadcast(context, "com.huami.watch.companion.action.BindDeviceFailed");
        Analytics.event(context, AnalyticsEvents.EVENT_BIND_FAILED, 1);
        m0(-5);
    }

    private void d0(Context context) {
        Log.w(l, "OnBind Fail : Cancel!!", new Object[0]);
        c0(context, true);
    }

    public static String decodeAddress(String str) throws ArrayIndexOutOfBoundsException {
        Log.d(l, "Scan QR Result : " + str, new Object[0]);
        if (!TextUtils.isEmpty(str) && str.startsWith("http")) {
            try {
                Uri uri = Uri.parse(str);
                str = uri.getQueryParameter("mac");
                Log.d(l, "Scan QR Result MAC Addr Encoded : " + str + ", Model : " + uri.getQueryParameter("m"), new Object[0]);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (TextUtils.isEmpty(str) || !str.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
            return str;
        }
        String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (strArrSplit[1] == null) {
            return str;
        }
        char[] charArray = strArrSplit[1].toCharArray();
        char[] charArray2 = strArrSplit[0].toCharArray();
        for (int i2 = 0; i2 < charArray2.length; i2++) {
            charArray2[i2] = (char) (charArray2[i2] - charArray[i2]);
        }
        String str2 = new String(charArray2);
        Log.d(l, "Scan QR Result MAC Addr Decoded : " + str2, new Object[0]);
        return str2;
    }

    public static String decodeModel(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("http")) {
            return "";
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("m");
            Log.d(l, "DecodeModel : " + queryParameter, new Object[0]);
            return queryParameter;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String decodeVersion(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("http")) {
            return "";
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("v");
            Log.d(l, "DecodeVersion : " + queryParameter, new Object[0]);
            return queryParameter;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private void e0(Context context) {
        Log.w(l, "OnBind Fail : Disconnected, " + this.f.b, new Object[0]);
        c0(context, false);
    }

    private void f0(Context context) {
        Log.w(l, "OnBind Fail : Timeout, " + this.f.b, new Object[0]);
        Analytics.event(context, AnalyticsEvents.EVENT_BIND_TIME_OUT, 1);
        c0(context, false);
    }

    private void g0() {
        Log.i(l, "==================== OnBind Finish ====================", new Object[0]);
        removeCheckBindResult();
        n0();
    }

    public static BindHelper getHelper() {
        if (sHelper == null) {
            sHelper = new BindHelper();
        }
        return sHelper;
    }

    private void h0(Context context) {
        Log.i(l, "OnBind Success, InitialBind : " + InitialState.isFirstBind(), new Object[0]);
        this.e = true;
        removeCheckBindResult();
        InitialState.setNewUserTag(false);
        UserSettings.putBoolean(context.getContentResolver(), UserSettingsKeys.KEY_ACCOUNT_NEW_USER, false);
        if (InitialState.isFirstBind()) {
            InitialState.setInitialled(true);
        }
        String str = this.f.a;
        Broadcaster.sendLocalBroadcast(context, "com.huami.watch.companion.action.BindDeviceFinished");
        Analytics.event(context, AnalyticsEvents.EVENT_BIND_SUCCESSFUL, 1);
        m0(-7);
        BindCallback.a(context);
        RxBus.get().post(new DeviceBoundEvent(str));
    }

    private void i0() {
        Log.i(l, "OnConnecting...", new Object[0]);
        postCheckBindResultDelay();
    }

    @SuppressLint({"CheckResult"})
    private void j0(final Context context) {
        Log.i(l, "OnNotRestore Start...", new Object[0]);
        final String str = this.f.a;
        this.k = u0(context).subscribe(new Consumer() { // from class: iw
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.V(context, str, (SyncResult) obj);
            }
        }, new Consumer() { // from class: wv
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BindHelper.X((Throwable) obj);
            }
        });
        postCheckBindResultDelay();
    }

    private void k0(Context context) {
        Log.i(l, "OnRestore UserConfirmed No!!", new Object[0]);
        Analytics.event(context, AnalyticsEvents.EVENT_CANCEL_RESTORE, 1);
    }

    private void l0(Context context) {
        Log.i(l, "OnRestore UserConfirmed Yes!!", new Object[0]);
        Analytics.event(context, AnalyticsEvents.EVENT_CONFIRM_RESTORE, 1);
    }

    private void n0() {
        if (this.mHandler != null) {
            Log.d(l, "Post Release!!", new Object[0]);
            this.mHandler.post(new b());
        }
    }

    public static BindHelper newHelper() {
        Log.d(l, "New Helper!!", new Object[0]);
        BindHelper bindHelper = new BindHelper();
        sHelper = bindHelper;
        return bindHelper;
    }

    private String o0(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cmiitId", "2016DP4306");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static void onRequestEnableBluetoothOrNetworkResult(boolean z) {
        if (z) {
            getHelper().m0(1);
            getHelper().m0(2);
        }
    }

    public static void onRequestLocationPermissionResult(int[] iArr) {
        if (iArr[0] != 0) {
            Log.w(l, "Coarse Location Permission Not Granted!!", new Object[0]);
            return;
        }
        Log.d(l, "Coarse Location Permission Granted!!", new Object[0]);
        getHelper().m0(1);
        getHelper().m0(2);
    }

    private void p0() {
        BindHelperUI bindHelperUI = this.d;
        if (bindHelperUI != null) {
            bindHelperUI.release();
            this.d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0() {
        Log.i(l, "==================== OnBind Restart... ====================", new Object[0]);
        notifyStateChanged(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(Context context, Transporter transporter, Transporter.DataSendResultCallback dataSendResultCallback) {
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("UID", Account.getUID(context));
        dataBundle.putBoolean(CompanionModule.KEY_USER_OVERSEA, Account.isOversea(context));
        dataBundle.putString(CompanionModule.KEY_USER_MI_ID, Account.getMIID(context));
        dataBundle.putParcelable(CompanionModule.KEY_USER_INFO, UserInfoManager.get());
        dataBundle.putString(CompanionModule.KEY_EXTRA_INFO, o0(context));
        dataBundle.putString(CompanionModule.KEY_USER_SETTINGS, KeyValueUtil.toJsonStr(UserSettingsManager.getManager(context).getAllWatch()));
        String str = this.f.a;
        Device deviceFind = DeviceManager.getManager(context).find(str);
        if (deviceFind == null) {
            Log.w(l, "No BindingDevice : " + str, new Object[0]);
            return;
        }
        dataBundle.putString(CompanionModule.KEY_SPORT_ORDER, SportSortManager.getManager().toBindRestoreJson(context, deviceFind));
        transporter.send(CompanionModule.ACTION_SYNC_DATA, dataBundle, dataSendResultCallback);
        InitialState.setUserSavedWatchFaceSyncedToWatch(false);
        SyncUtil.syncUserSavedSelectedWatchFace(context, deviceFind);
        if (deviceFind.info().isExperienceMode()) {
            Log.i(l, "ExperienceMode, Start Sync Health&Sport Data...", new Object[0]);
            SyncCenter.getCenter(context).types(3).transporter(this.g).start();
        }
    }

    private void s0(Context context) {
        Transporter transporter = this.g;
        if (transporter == null) {
            Log.w(l, "Transporter is NULL!!", new Object[0]);
        } else {
            transporter.send(CompanionModule.ACTION_SYNC_DATA_START, new j(context));
        }
    }

    private void t0(Context context) {
        if (this.g == null) {
            Log.w(l, "Transporter is NULL!!", new Object[0]);
            return;
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("UID", Account.getUID(context));
        dataBundle.putBoolean(CompanionModule.KEY_USER_OVERSEA, Account.isOversea(context));
        dataBundle.putString(CompanionModule.KEY_USER_MI_ID, Account.getMIID(context));
        dataBundle.putParcelable(CompanionModule.KEY_USER_INFO, UserInfoManager.get());
        dataBundle.putString(CompanionModule.KEY_EXTRA_INFO, o0(context));
        this.g.send(CompanionModule.ACTION_INITIAL_FINISH, dataBundle, new k(context));
    }

    private Observable<SyncResult> u0(final Context context) {
        Log.d(l, "SyncDeviceInfoDelay!!", new Object[0]);
        return Rx.io(new ObservableOnSubscribe() { // from class: uv
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.Y(context, observableEmitter);
            }
        }).timer(2L, TimeUnit.SECONDS).observable();
    }

    public void H(Activity activity, Consumer<Integer> consumer) {
        Log.d(tag(), "Init HelpUI : " + activity, new Object[0]);
        p0();
        BindHelperUI bindHelperUI = new BindHelperUI(this, activity);
        this.d = bindHelperUI;
        bindHelperUI.addCallback(new Consumer() { // from class: ew
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.L((Integer) obj);
            }
        });
        this.d.addCallback(consumer);
    }

    @Override // com.huami.watch.companion.common.ASyncHelper
    public void fillStateDescriptions(SparseArray<String> sparseArray) {
        sparseArray.put(1, "STATE_START");
        sparseArray.put(2, "STATE_SCAN_QR_START");
        sparseArray.put(3, "STATE_SCAN_QR_SUCCESS");
        sparseArray.put(4, "STATE_BT_REQUEST_PAIRING");
        sparseArray.put(5, "STATE_BT_PAIRING_CONFIRM");
        sparseArray.put(6, "STATE_BT_PAIRING_USER_CONFIRMED");
        sparseArray.put(7, "STATE_BT_PAIRING_USER_CANCELED");
        sparseArray.put(8, "STATE_CONNECTING");
        sparseArray.put(9, "STATE_CONNECTED");
        sparseArray.put(10, "STATE_RESTORE_CONFIRM");
        sparseArray.put(11, "STATE_RESTORE_USER_CONFIRMED_YES");
        sparseArray.put(12, "STATE_RESTORE_USER_CONFIRMED_NO");
        sparseArray.put(13, "STATE_RESTORE");
        sparseArray.put(14, "STATE_RESTORE_NO");
        sparseArray.put(-1, "STATE_PREPARE");
        sparseArray.put(-10, "STATE_PREPARING");
        sparseArray.put(-2, "STATE_FAIL_CANCEL");
        sparseArray.put(-3, "STATE_FAIL_TIMEOUT");
        sparseArray.put(-4, "STATE_FAIL_DISCONNECT");
        sparseArray.put(-5, "STATE_RETRY");
        sparseArray.put(-6, "STATE_SUCCESS");
        sparseArray.put(-7, "STATE_FINISH");
    }

    public String getBindingDevice() {
        return this.f.a;
    }

    public void init(Context context, Consumer<Integer> consumer) {
        if (this.c) {
            Log.w(l, "Already Initialled, Abort!!", new Object[0]);
            return;
        }
        Log.d(tag(), "Init Helper..." + context + ", Callback: " + consumer, new Object[0]);
        if (context instanceof Activity) {
            H((Activity) context, consumer);
        }
        this.mHandler = new Handler();
        Transporter transporter = Transporter.get(context, "com.huami.watch.companion");
        this.g = transporter;
        transporter.addDataListener(this.h);
        this.g.addChannelListener(this.i);
        this.mSubscription = RxBus.get().toObservable().subscribe(new f(), new Consumer() { // from class: vv
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BindHelper.K((Throwable) obj);
            }
        });
        addCallback(new g(context));
        this.c = true;
    }

    public boolean isBinding() {
        boolean z = this.mState >= 1;
        Log.d(l, "CurrentState: " + this.mStateDescriptions.get(this.mState) + ", IsBinding: " + z, new Object[0]);
        return z;
    }

    public void m0(int i2) {
        if (this.mHandler != null) {
            Log.d(l, "Post NotifyStateChanged: " + state(i2), new Object[0]);
            this.mHandler.post(new a(i2));
        }
    }

    @Override // com.huami.watch.companion.common.ASyncHelper
    public void notifyStateChanged(int i2) {
        Log.d(tag(), "NotifyStateChanged : " + state(i2), new Object[0]);
        super.notifyStateChanged(i2);
        BindHelperUI bindHelperUI = this.d;
        if (bindHelperUI != null) {
            bindHelperUI.notifyStateChanged(i2);
        }
    }

    public void notifyStateChangedUI() {
        notifyStateChangedUI(null);
    }

    public void onBTRequestPairing(final Context context) {
        Log.i(l, "OnBT Pairing...", new Object[0]);
        postCheckBindResultDelay();
        Rx.io(new ObservableOnSubscribe() { // from class: cw
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                BindHelper.M(observableEmitter);
            }
        }).observable().delay(1L, TimeUnit.SECONDS).flatMap(new Function() { // from class: xv
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.O(context, (Boolean) obj);
            }
        }).subscribe(Rx.safeObserver(new Consumer() { // from class: dw
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.P((Boolean) obj);
            }
        }));
    }

    public void onConnected(Context context) {
        Log.i(l, "OnConnected!!", new Object[0]);
        removeCheckBindResult();
        Rx.io(new i(context)).subscribe(new h());
        Analytics.event(context, AnalyticsEvents.EVENT_PAIR_SUCCESSFUL, 1);
    }

    @SuppressLint({"CheckResult"})
    public void onRestore(final Context context) {
        Log.i(l, "OnRestore Start...", new Object[0]);
        final String str = this.f.a;
        this.k = u0(context).subscribe(new Consumer() { // from class: hw
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.S(context, str, (SyncResult) obj);
            }
        }, new Consumer() { // from class: jw
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BindHelper.Q((Throwable) obj);
            }
        });
        postCheckBindResultDelay();
    }

    public void onScanQRSuccess(Context context) {
        Log.i(l, "OnScan QR Success!!", new Object[0]);
        Analytics.event(context, AnalyticsEvents.EVENT_SCAN_QR_SUCCESS, 1);
    }

    public void onStart(Context context) {
        Log.i(l, "OnStart...", new Object[0]);
        BindCallback.b(context);
    }

    public void onStateChanged(Context context, int i2) {
        switch (i2) {
            case -7:
                g0();
                break;
            case -6:
                h0(context);
                break;
            case -4:
                e0(context);
                break;
            case -3:
                f0(context);
                break;
            case -2:
                d0(context);
                break;
            case 1:
                onStart(context);
                break;
            case 3:
                onScanQRSuccess(context);
                break;
            case 4:
                onBTRequestPairing(context);
                break;
            case 5:
                Z();
                break;
            case 6:
                b0();
                break;
            case 7:
                a0();
                break;
            case 8:
                i0();
                break;
            case 9:
                onConnected(context);
                break;
            case 11:
                l0(context);
                break;
            case 12:
                k0(context);
                break;
            case 13:
                onRestore(context);
                break;
            case 14:
                j0(context);
                break;
        }
    }

    public void postCheckBindResultDelay() {
        if (this.mHandler != null) {
            Log.d(l, "Post Check Bind Result Delay : " + this.b, new Object[0]);
            this.mHandler.removeCallbacks(this.j);
            this.mHandler.postDelayed(this.j, (long) this.b);
        }
    }

    @Override // com.huami.watch.companion.common.ASyncHelper
    public void release() {
        if (isIdle()) {
            return;
        }
        Log.i(l, "Release, LastState : " + this.mStateDescriptions.get(this.mState), new Object[0]);
        super.release();
        p0();
        Disposable disposable = this.k;
        if (disposable != null) {
            disposable.dispose();
            this.k = null;
        }
        Transporter transporter = this.g;
        if (transporter != null) {
            transporter.removeDataListener(this.h);
            this.g.removeChannelListener(this.i);
            this.g = null;
        }
        this.mHandler = null;
        this.e = false;
        this.c = false;
        F();
    }

    public void releaseUnfinished(Context context) {
        String strG = G();
        release();
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        Log.i(l, "Release Unfinished: " + strG, new Object[0]);
        F();
        BindUtil.unbindDeviceWithCloud(context, strG);
    }

    public void removeCallbackUI(Consumer<Integer> consumer) {
        BindHelperUI bindHelperUI = this.d;
        if (bindHelperUI != null) {
            bindHelperUI.removeCallback(consumer);
        }
    }

    public void removeCheckBindResult() {
        if (this.mHandler != null) {
            Log.d(l, "Remove Check Bind Result!!", new Object[0]);
            this.mHandler.removeCallbacks(this.j);
        }
    }

    public void saveBindingDevice(String str) {
        this.f.f(str);
    }

    public void start(Context context, Consumer<Integer> consumer) {
        Log.i(l, "==================== OnBind Start... ====================", new Object[0]);
        if (this.mState > 0) {
            Log.w(l, "Already Start: " + this.mStateDescriptions.get(this.mState) + ", Release...", new Object[0]);
        }
        release();
        init(context, consumer);
        notifyStateChanged(-1);
    }

    public boolean syncDeviceInfoFromWatch(Context context, String str) {
        return SyncDeviceInfoHelper.getHelper(context).address(str).start();
    }

    @Override // com.huami.watch.companion.common.ASyncHelper
    public String tag() {
        return l;
    }

    @NonNull
    public SyncResult v0(Context context) {
        Log.d(l, "Sync DeviceInfo...", new Object[0]);
        SyncResult syncResult = new SyncResult();
        String str = this.f.a;
        Device deviceFind = DeviceManager.getManager(context).find(str);
        if (deviceFind == null) {
            Log.w(l, "No BindingDevice : " + str, new Object[0]);
            return syncResult;
        }
        boolean zSyncDeviceInfoFromWatch = syncDeviceInfoFromWatch(context, str);
        if (zSyncDeviceInfoFromWatch) {
            zSyncDeviceInfoFromWatch = BindUtil.h(context, deviceFind);
            if (!zSyncDeviceInfoFromWatch) {
                BindUtil.j(context, deviceFind.getCpuId());
                zSyncDeviceInfoFromWatch = BindUtil.h(context, deviceFind);
            }
            if (!zSyncDeviceInfoFromWatch) {
                syncResult.failCode = 1;
            }
        } else {
            syncResult.failCode = 2;
        }
        syncResult.finish = true;
        syncResult.success = zSyncDeviceInfoFromWatch;
        return syncResult;
    }

    public void notifyStateChangedUI(Consumer<Integer> consumer) {
        BindHelperUI bindHelperUI;
        if (isIdle() || (bindHelperUI = this.d) == null) {
            return;
        }
        bindHelperUI.addCallback(consumer);
        this.d.notifyStateChanged(this.mState);
    }
}
