package com.huami.watch.companion.unlock;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class UnlockScanHelper {
    private static final String f = "Unlock_Scan_Helper";
    private static UnlockScanHelper g = null;
    private static final int h = 15000;
    private static final int i = 0;
    private onScanStatusListener a;
    private Context b;
    private AlertDialogFragment d;
    private Handler c = null;
    private BluetoothAdapter.LeScanCallback e = new b();

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 0) {
                return;
            }
            Log.d(UnlockScanHelper.f, "Scan Timeout.", new Object[0]);
            UnlockScanHelper.this.m();
        }
    }

    public class b implements BluetoothAdapter.LeScanCallback {
        public b() {
        }

        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            Device currentDevice = DeviceManager.getManager(UnlockScanHelper.this.b).getCurrentDevice();
            if (currentDevice == null || TextUtils.isEmpty(bluetoothDevice.getName()) || !bluetoothDevice.getName().contains(currentDevice.addressShort())) {
                return;
            }
            Log.d(UnlockScanHelper.f, "Addr = " + bluetoothDevice.getAddress() + "   Name = " + bluetoothDevice.getName(), new Object[0]);
            String address = bluetoothDevice.getAddress();
            if (TextUtils.isEmpty(address)) {
                return;
            }
            Box.putWatchRandomAddress(address.toUpperCase());
            if (UnlockScanHelper.this.a != null) {
                UnlockScanHelper.this.a.onSuccess();
            }
            UnlockScanHelper.this.stopLeScan();
            Log.d(UnlockScanHelper.f, "Le Scan Success : " + address.toUpperCase(), new Object[0]);
        }
    }

    public class c implements onScanStatusListener {
        public final /* synthetic */ Activity a;

        public c(Activity activity) {
            this.a = activity;
        }

        @Override // com.huami.watch.companion.unlock.UnlockScanHelper.onScanStatusListener
        public void onFail() {
            UnlockScanHelper.this.i();
            Toast.makeText(UnlockScanHelper.this.b, R.string.scan_random_address_failed, 0).show();
        }

        @Override // com.huami.watch.companion.unlock.UnlockScanHelper.onScanStatusListener
        public void onStart() {
            UnlockScanHelper.this.i();
            UnlockScanHelper unlockScanHelper = UnlockScanHelper.this;
            unlockScanHelper.d = unlockScanHelper.p(this.a);
        }

        @Override // com.huami.watch.companion.unlock.UnlockScanHelper.onScanStatusListener
        public void onSuccess() {
            UnlockScanHelper.this.i();
            Box.putSetRssiNeeded(true);
            UnlockScanHelper.this.r(this.a);
        }
    }

    public class d implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public d(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismiss();
        }
    }

    public class e implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;
        public final /* synthetic */ Activity b;

        public class a implements Transporter.DataSendResultCallback {
            public a() {
            }

            @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
            public void onResultBack(DataTransportResult dataTransportResult) {
                if (dataTransportResult.getResultCode() != 0) {
                    Box.putUnlockOpenDialogDisplayed(true);
                    UnlockUtil.saveIsUnlockUserOn(UnlockScanHelper.this.b, false);
                    Toast.makeText(UnlockScanHelper.this.b, UnlockScanHelper.this.b.getString(R.string.open_watch_unlock_failed), 0).show();
                    Log.d(UnlockScanHelper.f, "Send Watch Open Unlock State failed", new Object[0]);
                    return;
                }
                Box.putUnlockOpenDialogDisplayed(false);
                UnlockUtil.saveIsUnlockUserOn(UnlockScanHelper.this.b, true);
                if (!e.this.b.isDestroyed()) {
                    e eVar = e.this;
                    UnlockScanHelper.this.n(eVar.b);
                }
                Log.d(UnlockScanHelper.f, "Send Watch Open Unlock State success", new Object[0]);
            }
        }

        public e(AlertDialogFragment alertDialogFragment, Activity activity) {
            this.a = alertDialogFragment;
            this.b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismiss();
            SyncUtil.syncExtraInfoToWatch(Transporter.get(UnlockScanHelper.this.b, "com.huami.watch.companion"), 1, new a());
        }
    }

    public class f implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public class a implements Transporter.DataSendResultCallback {
            public a() {
            }

            @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
            public void onResultBack(DataTransportResult dataTransportResult) {
                if (dataTransportResult.getResultCode() != 0) {
                    Log.d(UnlockScanHelper.f, "Send Watch Close Unlock State failed", new Object[0]);
                    return;
                }
                Box.putUnlockOpenDialogDisplayed(true);
                UnlockUtil.saveIsUnlockUserOn(UnlockScanHelper.this.b, false);
                Box.putWatchRandomAddress("");
                Log.d(UnlockScanHelper.f, "Send Watch Close Unlock State success", new Object[0]);
            }
        }

        public f(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismiss();
            SyncUtil.syncExtraInfoToWatch(Transporter.get(UnlockScanHelper.this.b, "com.huami.watch.companion"), 0, new a());
        }
    }

    public interface onScanStatusListener {
        void onFail();

        void onStart();

        void onSuccess();
    }

    private UnlockScanHelper(Context context) {
        this.b = context;
        j();
    }

    public static UnlockScanHelper getHelper(Context context) {
        if (g == null) {
            g = new UnlockScanHelper(context.getApplicationContext());
        }
        return g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        AlertDialogFragment alertDialogFragment = this.d;
        if (alertDialogFragment != null) {
            try {
                alertDialogFragment.dismissAllowingStateLoss();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.d = null;
        }
    }

    private void j() {
        this.c = new a();
    }

    private void k() {
        SyncUtil.syncExtraInfoToWatch(Transporter.get(this.b, "com.huami.watch.companion"), 1, null);
    }

    private void l() {
        Handler handler = this.c;
        if (handler != null) {
            handler.removeMessages(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        Log.d(f, "Scan Failed.", new Object[0]);
        stopLeScan();
        onScanStatusListener onscanstatuslistener = this.a;
        if (onscanstatuslistener != null) {
            onscanstatuslistener.onFail();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Activity activity) {
        k();
        setOnScanStatusListener(new c(activity));
        startLeScan();
    }

    private void o() {
        Handler handler = this.c;
        if (handler == null || handler.hasMessages(0)) {
            return;
        }
        Message message = new Message();
        message.what = 0;
        this.c.sendMessageDelayed(message, 15000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AlertDialogFragment p(Activity activity) {
        if (activity == null) {
            return null;
        }
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(2);
        alertDialogFragmentNewInstance.setMessage(activity.getString(R.string.scan_random_address));
        alertDialogFragmentNewInstance.setCancelable(false);
        try {
            alertDialogFragmentNewInstance.show(activity.getFragmentManager(), "");
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
        return alertDialogFragmentNewInstance;
    }

    private void q(Activity activity) {
        if (activity == null) {
            return;
        }
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(0);
        alertDialogFragmentNewInstance.setMessage(activity.getString(R.string.unlock_lower_watch_life_time));
        alertDialogFragmentNewInstance.setCancel(activity.getString(R.string.dialog_cancel), new d(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.setConfirm(activity.getString(R.string.dialog_confirm), new e(alertDialogFragmentNewInstance, activity));
        alertDialogFragmentNewInstance.setCancelable(false);
        try {
            alertDialogFragmentNewInstance.show(activity.getFragmentManager(), "");
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(Context context) {
        context.startActivity(new Intent(context, (Class<?>) ScreenUnlockActivity.class));
    }

    public boolean checkHasConnected() {
        Device currentDevice = DeviceManager.getManager(this.b).getCurrentDevice();
        while (true) {
            boolean z = false;
            for (BluetoothDevice bluetoothDevice : ((BluetoothManager) this.b.getSystemService(DeviceSettingApiImpl.META_KEY_BLUETOOTH)).getConnectedDevices(8)) {
                if (currentDevice != null && !TextUtils.isEmpty(bluetoothDevice.getName()) && bluetoothDevice.getName().contains(currentDevice.addressShort())) {
                    if (!TextUtils.isEmpty(bluetoothDevice.getAddress())) {
                        Box.putWatchRandomAddress(bluetoothDevice.getAddress().toUpperCase());
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    public void checkWatchRandomAddress(Activity activity) {
        checkHasConnected();
        String watchRandomAddress = Box.getWatchRandomAddress();
        Log.d(f, "Check Watch Random Address : " + watchRandomAddress, new Object[0]);
        if (!TextUtils.isEmpty(watchRandomAddress)) {
            k();
            r(activity);
        } else {
            if (UnlockUtil.hasUnlockByWatch(activity, DeviceManager.getManager(activity).getCurrentDevice().addressShort())) {
                r(activity);
                return;
            }
            if (!DeviceManager.getManager(activity).getCurrentDevice().isConnected()) {
                Toast.makeText(activity, activity.getString(R.string.device_disconnected), 0).show();
            } else if (Box.getUnlockOpenDialogDisplayed()) {
                q(activity);
            } else {
                n(activity);
            }
        }
    }

    public void release() {
        stopLeScan();
        this.a = null;
        this.c = null;
        g = null;
    }

    public void setOnScanStatusListener(onScanStatusListener onscanstatuslistener) {
        this.a = onscanstatuslistener;
    }

    public void showCloseUnlockDialog(Activity activity) {
        if (activity == null) {
            return;
        }
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(1);
        alertDialogFragmentNewInstance.setMessage(activity.getString(R.string.close_watch_unlock_tips));
        alertDialogFragmentNewInstance.setNeutral(activity.getString(R.string.btn_known), new f(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.setCancelable(false);
        try {
            alertDialogFragmentNewInstance.show(activity.getFragmentManager(), "");
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void startLeScan() {
        Log.d(f, "startLeScan", new Object[0]);
        ((BluetoothManager) this.b.getSystemService(DeviceSettingApiImpl.META_KEY_BLUETOOTH)).getAdapter().startLeScan(this.e);
        l();
        o();
        onScanStatusListener onscanstatuslistener = this.a;
        if (onscanstatuslistener != null) {
            onscanstatuslistener.onStart();
        }
    }

    public void stopLeScan() {
        Log.d(f, "stopLeScan", new Object[0]);
        ((BluetoothManager) this.b.getSystemService(DeviceSettingApiImpl.META_KEY_BLUETOOTH)).getAdapter().stopLeScan(this.e);
        l();
    }
}
