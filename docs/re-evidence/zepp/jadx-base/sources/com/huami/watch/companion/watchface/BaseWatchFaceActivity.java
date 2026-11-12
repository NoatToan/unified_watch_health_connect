package com.huami.watch.companion.watchface;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.event.ConnectedEvent;
import com.huami.watch.companion.event.DisconnectedEvent;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import com.huami.watch.companion.watchface.BaseWatchFaceActivity;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseWatchFaceActivity extends AppCompatActivity {
    private static final String a = "BaseWatchFaceActivity";
    public boolean isConnect;
    public Transporter.DataListener mDataListener = new a();
    public Device mDevice;
    public String mDeviceId;
    public DialogFragment mDisConnectDialog;
    public DialogFragment mLoadDialog;
    public Disposable mSubscription;
    public Transporter mTransporter;

    public class a implements Transporter.DataListener {
        public a() {
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
            if (BaseWatchFaceActivity.this.mDevice.isActive()) {
                BaseWatchFaceActivity.this.r(transportDataItem);
            } else {
                Log.w(BaseWatchFaceActivity.a, "Device is Inactivated, Ignore!!", new Object[0]);
            }
        }
    }

    private void i() {
        this.mSubscription = RxBus.get().toObservable().subscribe(new Consumer() { // from class: ds
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.j(obj);
            }
        }, new Consumer() { // from class: es
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BaseWatchFaceActivity.l((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(Object obj) throws Exception {
        if (obj instanceof DisconnectedEvent) {
            if (DeviceManager.getManager(this).getCurrentDevice() == null) {
                return;
            }
            q();
        } else if (obj instanceof ConnectedEvent) {
            p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Throwable th) throws Exception {
        HMLog.warn(a, th, new Function0() { // from class: fs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseWatchFaceActivity.k();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(boolean z, DataTransportResult dataTransportResult) {
        dismissDialog(this.mLoadDialog);
        if (dataTransportResult == null || dataTransportResult.getResultCode() != 0) {
            Toast.makeText(this, R.string.xihu_watch_face_set_current_failed, 0).show();
            return;
        }
        RxBus.get().postMainThread(new WatchFaceArrivingEvent("setCurrentWatchFace"));
        syncAllWatchFace(z);
        Toast.makeText(this, R.string.xihu_watch_face_set_current_success, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(DataTransportResult dataTransportResult) {
        Log.d(a, "send Action query_all_watchface result: " + dataTransportResult, new Object[0]);
    }

    private void p() {
        this.isConnect = true;
        dismissDialog(this.mDisConnectDialog);
    }

    private void q() {
        this.isConnect = false;
        dismissDialog(this.mDisConnectDialog);
        this.mDisConnectDialog = AlertDialog.setTitle(getString(R.string.xihu_delete_app_dialog_title)).setMessage(getString(R.string.watch_disconnect)).setCancelable(false).setPositiveBtn(getString(R.string.xihu_watch_face_connect_bluetooth)).setNegativeBtn(getString(R.string.xihu_watch_face_exit_manager), new DialogInterface.OnClickListener() { // from class: as
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.m(dialogInterface, i);
            }
        }).show(getFragmentManager(), "disconnectDialog");
    }

    public void dismissDialog(DialogFragment dialogFragment) {
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        Device currentDevice = DeviceManager.getManager(this).getCurrentDevice();
        this.mDevice = currentDevice;
        if (currentDevice == null || !currentDevice.isConnected()) {
            return;
        }
        this.mDeviceId = this.mDevice.getCpuId();
        this.isConnect = this.mDevice.isConnected();
        i();
        if (this.mTransporter == null) {
            Transporter transporter = Transporter.get(this, "com.huami.watchface");
            this.mTransporter = transporter;
            transporter.addDataListener(this.mDataListener);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Disposable disposable = this.mSubscription;
        if (disposable != null) {
            disposable.dispose();
        }
        Transporter transporter = this.mTransporter;
        if (transporter != null) {
            transporter.removeDataListener(this.mDataListener);
        }
    }

    abstract void r(TransportDataItem transportDataItem);

    public void setCurrentWatch(int i, final boolean z) {
        if (z) {
            showLoadDialog(getString(R.string.loading), "setCurrentWatchFaceDialog");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", i);
            syncDataToWatch(WatchFaceModule.ACTION_CURRENT, jSONObject.toString(), new Transporter.DataSendResultCallback() { // from class: bs
                @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
                public final void onResultBack(DataTransportResult dataTransportResult) {
                    this.a.n(z, dataTransportResult);
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void showLoadDialog(String str, String str2) {
        dismissDialog(this.mLoadDialog);
        this.mLoadDialog = LoadingDialog.setMessage(str).setCancelable(false).show(getFragmentManager(), str2);
    }

    public void syncAllWatchFace(boolean z) {
        if (this.mTransporter != null) {
            if (z) {
                showLoadDialog(getString(R.string.loading), "syncAllWatchFaceLoad");
            }
            this.mTransporter.send(WatchFaceModule.ACTION_QUERY_ALL_WATCHFACE, new Transporter.DataSendResultCallback() { // from class: cs
                @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
                public final void onResultBack(DataTransportResult dataTransportResult) {
                    BaseWatchFaceActivity.o(dataTransportResult);
                }
            });
        }
    }

    public void syncDataToWatch(String str, String str2, Transporter.DataSendResultCallback dataSendResultCallback) {
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("data", str2);
        this.mTransporter.send(str, dataBundle, dataSendResultCallback);
    }
}
