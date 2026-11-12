package com.xiaomi.smarthome.library.bluetooth.connect;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class BleConnectObserver implements IBleConnectObserver {
    private static final int MAX_OBSERVABLES = 5;
    private static volatile BleConnectObserver sInstance;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private List<BleConnectObservable> mObservables = new ArrayList();
    private BleConnectObserverReceiver mReceiver;

    public class BleConnectObservable {
        String mac;

        public BleConnectObservable(String str) {
            this.mac = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.mac.equals(((BleConnectObservable) obj).mac);
        }

        public int hashCode() {
            return this.mac.hashCode();
        }
    }

    public class BleConnectObserverReceiver extends BroadcastReceiver {
        private BleConnectObserverReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.hasExtra("key_device_address")) {
                return;
            }
            String action = intent.getAction();
            if ("com.xiaomi.smarthome.bluetooth.connect_status_changed".equals(action) && intent.hasExtra("key_connect_status")) {
                BleConnectObserver.this.processConnectStatusChanged(intent);
            } else if ("com.xiaomi.smarthome.bluetooth.character_changed".equals(action)) {
                BleConnectObserver.this.processCharacterChanged(intent);
            }
        }
    }

    private BleConnectObserver() {
        registerObserverReceiver();
    }

    public static BleConnectObserver getInstance() {
        if (sInstance == null) {
            synchronized (BleConnectObserver.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new BleConnectObserver();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processCharacterChanged(Intent intent) {
        refreshBleConnectObservable(intent.getStringExtra("key_device_address"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processConnectStatusChanged(Intent intent) {
        String stringExtra = intent.getStringExtra("key_device_address");
        int intExtra = intent.getIntExtra("key_connect_status", 0);
        if (intExtra == 16) {
            refreshBleConnectObservable(stringExtra);
        } else if (intExtra == 32) {
            removeBleConnectObservable(stringExtra);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshBleConnectObservable(String str) {
        BleConnectObservable bleConnectObservable;
        int i = 0;
        while (true) {
            if (i >= this.mObservables.size()) {
                bleConnectObservable = null;
                break;
            } else {
                if (this.mObservables.get(i).mac.equals(str)) {
                    bleConnectObservable = this.mObservables.remove(i);
                    break;
                }
                i++;
            }
        }
        if (bleConnectObservable == null) {
            bleConnectObservable = new BleConnectObservable(str);
        }
        this.mObservables.add(0, bleConnectObservable);
        if (this.mObservables.size() > 5) {
            BluetoothLog.w(String.format("BleConnectObserver reach limit", new Object[0]));
            Iterator<BleConnectObservable> it = this.mObservables.iterator();
            while (it.hasNext()) {
                BluetoothLog.w(String.format(">>> mac = %s", it.next().mac));
            }
        }
        while (this.mObservables.size() > 5) {
            List<BleConnectObservable> list = this.mObservables;
            BleConnectManager.getInstance().disconnect(list.remove(list.size() - 1).mac);
        }
    }

    private void registerObserverReceiver() {
        if (this.mReceiver == null) {
            this.mReceiver = new BleConnectObserverReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.xiaomi.smarthome.bluetooth.connect_status_changed");
            intentFilter.addAction("com.xiaomi.smarthome.bluetooth.character_changed");
            BluetoothUtils.registerReceiver(this.mReceiver, intentFilter);
        }
    }

    private void removeBleConnectObservable(String str) {
        for (int i = 0; i < this.mObservables.size(); i++) {
            if (this.mObservables.get(i).mac.equals(str)) {
                this.mObservables.remove(i);
                return;
            }
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectObserver
    public void reportAction(final String str) {
        this.mHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.library.bluetooth.connect.BleConnectObserver.1
            @Override // java.lang.Runnable
            public void run() {
                if (BluetoothUtils.isBleDeviceConnected(str)) {
                    BleConnectObserver.this.refreshBleConnectObservable(str);
                }
            }
        });
    }
}
