package health.compact.a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.BadParcelableException;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.health.manager.BluetoothMonitor$BluetoothDeviceInfo;
import com.huawei.health.manager.hdp.BloodPressureController;
import com.huawei.health.manager.reconnect.ReconnectManager;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dmz;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public class BluetoothMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static BluetoothMonitor f36515a;
    private volatile BloodPressureController d;
    private final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, BluetoothMonitor$BluetoothDeviceInfo> f36516b = new HashMap<>();
    private List<BluetoothMonitor$BluetoothDeviceInfo> h = new ArrayList();
    private String i = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BluetoothGattCallback f36517c = new BluetoothGattCallback() { // from class: com.huawei.health.manager.BluetoothMonitor$1
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            if (bluetoothGatt == null) {
                LogUtil.a("BluetoothMonitor", "onConnectionStateChange ", "bluetoothGatt is null");
                return;
            }
            String address = bluetoothGatt.getDevice().getAddress();
            LogUtil.d("BluetoothMonitor", "ConnectionStateChange: status =", Integer.valueOf(i), ", newState = ", Integer.valueOf(i2));
            if (i == 0) {
                synchronized (this.f8028a.e) {
                    this.f8028a.b(bluetoothGatt, i2, address);
                }
            }
        }
    };
    private BroadcastReceiver g = new BroadcastReceiver() { // from class: com.huawei.health.manager.BluetoothMonitor$2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            LogUtil.a("BluetoothMonitor", "Received action: ", action);
            if (action == null) {
                return;
            }
            action.hashCode();
            if (!action.equals("com.huawei.health.action.DEVICE_CHANGED")) {
                if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
                    if (intExtra == 12) {
                        this.d.b();
                        ReconnectManager.d().a();
                        return;
                    } else if (intExtra == 10) {
                        this.d.c();
                        ReconnectManager.d().e();
                        return;
                    } else {
                        LogUtil.a("BluetoothMonitor", "wrong action state");
                        return;
                    }
                }
                return;
            }
            try {
                int intExtra2 = intent.getIntExtra("operation", 0);
                String stringExtra = intent.getStringExtra("productId");
                String stringExtra2 = intent.getStringExtra("uniqueId");
                if (intExtra2 == 1) {
                    this.d.c(stringExtra, stringExtra2, intent.getIntExtra(Wpt.MODE, 0), intent.getStringExtra("kind"), intent.getStringExtra("name"));
                } else if (intExtra2 == -1) {
                    this.d.b(stringExtra, stringExtra2);
                } else {
                    LogUtil.a("BluetoothMonitor", "unexpected operation");
                }
            } catch (BadParcelableException e) {
                LogUtil.e("BluetoothMonitor", "BadParcelableException: ", LogAnonymous.b(e));
            }
        }
    };

    private BluetoothMonitor() {
        e();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("com.huawei.health.action.DEVICE_CHANGED");
        BroadcastManagerUtil.d(BaseApplication.b(), this.g, intentFilter, LocalBroadcast.f36595c, null);
    }

    public static BluetoothMonitor d() {
        BluetoothMonitor bluetoothMonitor;
        synchronized (BluetoothMonitor.class) {
            if (f36515a == null) {
                f36515a = new BluetoothMonitor();
            }
            bluetoothMonitor = f36515a;
        }
        return bluetoothMonitor;
    }

    public boolean b() {
        com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "isStartMonitor");
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null && defaultAdapter.isEnabled()) {
                synchronized (this.e) {
                    com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "", Integer.valueOf(this.f36516b.size()), " device(s) to be monitored");
                    for (BluetoothMonitor$BluetoothDeviceInfo bluetoothMonitor$BluetoothDeviceInfo : this.f36516b.values()) {
                        if (bluetoothMonitor$BluetoothDeviceInfo != null && bluetoothMonitor$BluetoothDeviceInfo.f == null) {
                            a(defaultAdapter, bluetoothMonitor$BluetoothDeviceInfo);
                        }
                    }
                }
                return true;
            }
            com.huawei.hwlogsmodel.LogUtil.j("BluetoothMonitor", "bluetoothAdapter is null or is not enable");
            return false;
        } catch (NullPointerException unused) {
            com.huawei.hwlogsmodel.LogUtil.e("BluetoothMonitor", "IBluetooth.getState() nullPointerException");
            return false;
        } catch (NoSuchElementException e) {
            com.huawei.hwlogsmodel.LogUtil.e("BluetoothMonitor", "isStartMonitor fail ", e.getMessage());
        }
    }

    public boolean c(String str) {
        if (str != null) {
            com.huawei.hwlogsmodel.LogUtil.d("BluetoothMonitor", "isStartMonitorByDeviceInfo device info = ", str);
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (!defaultAdapter.isEnabled()) {
                return false;
            }
            synchronized (this.e) {
                com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "", Integer.valueOf(this.f36516b.size()), " device(s) to be monitored");
                for (BluetoothMonitor$BluetoothDeviceInfo bluetoothMonitor$BluetoothDeviceInfo : this.f36516b.values()) {
                    if (bluetoothMonitor$BluetoothDeviceInfo != null && bluetoothMonitor$BluetoothDeviceInfo.f == null && (str.equals(bluetoothMonitor$BluetoothDeviceInfo.f8029a) || str.equals(bluetoothMonitor$BluetoothDeviceInfo.e))) {
                        a(defaultAdapter, bluetoothMonitor$BluetoothDeviceInfo);
                    }
                }
            }
            return true;
        }
        com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "isStartMonitorByDeviceInfo device info = null");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(BluetoothGatt bluetoothGatt, int i, String str) {
        Context contextB = BaseApplication.b();
        if (i == 2) {
            for (BluetoothMonitor$BluetoothDeviceInfo bluetoothMonitor$BluetoothDeviceInfo : this.f36516b.values()) {
                if (bluetoothMonitor$BluetoothDeviceInfo.f8029a.equals(str)) {
                    Intent intent = new Intent("com.huawei.health.action.DEVICE_CONNECTED");
                    intent.setPackage(contextB.getPackageName());
                    intent.putExtra("productId", bluetoothMonitor$BluetoothDeviceInfo.d);
                    intent.putExtra("uniqueId", bluetoothMonitor$BluetoothDeviceInfo.f8029a);
                    intent.putExtra("kind", bluetoothMonitor$BluetoothDeviceInfo.f8030b);
                    com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "sendBroadcast for ", bluetoothMonitor$BluetoothDeviceInfo.d, ", kind = ", bluetoothMonitor$BluetoothDeviceInfo.f8030b);
                    contextB.sendBroadcast(intent, LocalBroadcast.f36595c);
                    return;
                }
            }
            return;
        }
        if (i == 0) {
            String str2 = this.i;
            if (str2 != null && !this.f36516b.containsKey(str2)) {
                this.i = null;
                try {
                    bluetoothGatt.close();
                } catch (SecurityException unused) {
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.a("BluetoothMonitor", "handleBluetoothState SecurityException");
                }
            }
            for (BluetoothMonitor$BluetoothDeviceInfo bluetoothMonitor$BluetoothDeviceInfo2 : this.f36516b.values()) {
                if (bluetoothMonitor$BluetoothDeviceInfo2.f8029a.equals(str) && bluetoothMonitor$BluetoothDeviceInfo2.e.equals("AH100")) {
                    Intent intent2 = new Intent("com.huawei.health.action.DEVICE_DISCONNECTED");
                    intent2.setPackage(contextB.getPackageName());
                    intent2.putExtra("productId", bluetoothMonitor$BluetoothDeviceInfo2.d);
                    intent2.putExtra("uniqueId", bluetoothMonitor$BluetoothDeviceInfo2.f8029a);
                    intent2.putExtra("kind", bluetoothMonitor$BluetoothDeviceInfo2.f8030b);
                    com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "sendBroadcast for ", bluetoothMonitor$BluetoothDeviceInfo2.d, ", kind = ", bluetoothMonitor$BluetoothDeviceInfo2.f8030b);
                    contextB.sendBroadcast(intent2, LocalBroadcast.f36595c);
                    return;
                }
            }
            return;
        }
        com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "onConnectionStateChange ", "invalid status");
    }

    private void a(BluetoothAdapter bluetoothAdapter, BluetoothMonitor$BluetoothDeviceInfo bluetoothMonitor$BluetoothDeviceInfo) {
        try {
            if (bluetoothMonitor$BluetoothDeviceInfo.f8031c == 1) {
                if (!BluetoothAdapter.checkBluetoothAddress(bluetoothMonitor$BluetoothDeviceInfo.f8029a)) {
                    com.huawei.hwlogsmodel.LogUtil.e("BluetoothMonitor", "connectDevice invalid Bluetooth address");
                    return;
                }
                BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(bluetoothMonitor$BluetoothDeviceInfo.f8029a);
                if (remoteDevice != null) {
                    com.huawei.hwlogsmodel.LogUtil.d("BluetoothMonitor", "connGatt to #### for ####", bluetoothMonitor$BluetoothDeviceInfo.d);
                    bluetoothMonitor$BluetoothDeviceInfo.f = remoteDevice.connectGatt(BaseApplication.b(), true, this.f36517c);
                    return;
                }
                return;
            }
            if (bluetoothMonitor$BluetoothDeviceInfo.f8031c == 2) {
                com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "isStartMonitor for classic bluetooth");
                if (!BluetoothAdapter.checkBluetoothAddress(bluetoothMonitor$BluetoothDeviceInfo.f8029a)) {
                    com.huawei.hwlogsmodel.LogUtil.e("BluetoothMonitor", "connectDevice invalid Bluetooth address");
                    return;
                } else {
                    b(bluetoothAdapter.getRemoteDevice(bluetoothMonitor$BluetoothDeviceInfo.f8029a), bluetoothMonitor$BluetoothDeviceInfo.d, bluetoothMonitor$BluetoothDeviceInfo.f8029a, bluetoothMonitor$BluetoothDeviceInfo.f8030b);
                    return;
                }
            }
            com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "connectDevice ", "wrong connectMode");
        } catch (IllegalArgumentException unused) {
            com.huawei.hwlogsmodel.LogUtil.e("BluetoothMonitor", "connectDevice illegalArgumentException");
        } catch (IllegalStateException unused2) {
            com.huawei.hwlogsmodel.LogUtil.e("BluetoothMonitor", "connectDevice illegalStateException");
        } catch (SecurityException e) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("BluetoothMonitor", "connectDevice SecurityException", LogAnonymous.b(e));
        }
    }

    private void b(BluetoothDevice bluetoothDevice, String str, String str2, String str3) {
        BloodPressureController bloodPressureController = this.d;
        if (bloodPressureController == null) {
            bloodPressureController = new BloodPressureController(BaseApplication.b());
            this.d = bloodPressureController;
        }
        bloodPressureController.b(bluetoothDevice, str, str2, str3);
        bloodPressureController.a();
    }

    private void i() {
        BloodPressureController bloodPressureController = this.d;
        this.d = null;
        if (bloodPressureController != null) {
            bloodPressureController.b();
        }
    }

    public void b(String str) {
        if (str != null) {
            com.huawei.hwlogsmodel.LogUtil.d("BluetoothMonitor", "stopMonitorByDeviceInfo deviceInfo = ", str);
            synchronized (this.e) {
                for (BluetoothMonitor$BluetoothDeviceInfo bluetoothMonitor$BluetoothDeviceInfo : this.f36516b.values()) {
                    if (bluetoothMonitor$BluetoothDeviceInfo != null && bluetoothMonitor$BluetoothDeviceInfo.f != null && (str.equals(bluetoothMonitor$BluetoothDeviceInfo.e) || str.equals(bluetoothMonitor$BluetoothDeviceInfo.f8029a))) {
                        d(bluetoothMonitor$BluetoothDeviceInfo);
                    }
                }
            }
            return;
        }
        com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "stopMonitorByDeviceInfo deviceInfo = n");
    }

    public void c() {
        synchronized (this.e) {
            for (BluetoothMonitor$BluetoothDeviceInfo bluetoothMonitor$BluetoothDeviceInfo : this.f36516b.values()) {
                if (bluetoothMonitor$BluetoothDeviceInfo != null && bluetoothMonitor$BluetoothDeviceInfo.f != null) {
                    d(bluetoothMonitor$BluetoothDeviceInfo);
                }
            }
        }
    }

    private void d(BluetoothMonitor$BluetoothDeviceInfo bluetoothMonitor$BluetoothDeviceInfo) {
        com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "disconnectDevice enter");
        if (bluetoothMonitor$BluetoothDeviceInfo.f8031c == 1) {
            BluetoothGatt bluetoothGatt = (BluetoothGatt) bluetoothMonitor$BluetoothDeviceInfo.f;
            if (bluetoothGatt != null) {
                com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "BluetoothGatt disconnect and close");
                try {
                    bluetoothGatt.disconnect();
                } catch (SecurityException unused) {
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.a("BluetoothMonitor", "disconnectDevice SecurityException");
                }
            }
            bluetoothMonitor$BluetoothDeviceInfo.f = null;
            return;
        }
        if (bluetoothMonitor$BluetoothDeviceInfo.f8031c == 2) {
            com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "stopMonitor for classic bluetooth");
            i();
        } else {
            com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "disconnectDevice ", "wrong connect mode");
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0073 A[Catch: all -> 0x0085, PHI: r3 r4
      0x0073: PHI (r3v5 android.database.Cursor) = (r3v3 android.database.Cursor), (r3v4 android.database.Cursor), (r3v9 android.database.Cursor) binds: [B:24:0x0071, B:18:0x005d, B:10:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r4v7 android.database.sqlite.SQLiteDatabase) = 
      (r4v5 android.database.sqlite.SQLiteDatabase)
      (r4v6 android.database.sqlite.SQLiteDatabase)
      (r4v10 android.database.sqlite.SQLiteDatabase)
     binds: [B:24:0x0071, B:18:0x005d, B:10:0x0046] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0085, blocks: (B:9:0x0043, B:26:0x0076, B:27:0x007c, B:25:0x0073, B:17:0x005a, B:23:0x006e, B:31:0x0081, B:35:0x0089, B:36:0x008c), top: B:41:0x0006 }] */
    private int e() {
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase;
        int size;
        synchronized (this.e) {
            Cursor cursorQuery = null;
            try {
                try {
                    try {
                        sQLiteDatabaseOpenOrCreateDatabase = BaseApplication.b().openOrCreateDatabase("device.db", 0, null);
                        try {
                            cursorQuery = sQLiteDatabaseOpenOrCreateDatabase.query("device", new String[]{"productId", "uniqueId", Wpt.MODE, "kind", "name"}, "auto=1", null, null, null, null, null);
                            b(cursorQuery);
                            cursorQuery.close();
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (sQLiteDatabaseOpenOrCreateDatabase != null) {
                                sQLiteDatabaseOpenOrCreateDatabase.close();
                            }
                        } catch (SQLiteException unused) {
                            com.huawei.hwlogsmodel.LogUtil.j("BluetoothMonitor", "loadDeviceList SQLiteException");
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (sQLiteDatabaseOpenOrCreateDatabase != null) {
                                sQLiteDatabaseOpenOrCreateDatabase.close();
                            }
                        } catch (NumberFormatException unused2) {
                            com.huawei.hwlogsmodel.LogUtil.j("BluetoothMonitor", "loadDeviceList NumberFormatException");
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (sQLiteDatabaseOpenOrCreateDatabase != null) {
                                sQLiteDatabaseOpenOrCreateDatabase.close();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (SQLiteException unused3) {
                    sQLiteDatabaseOpenOrCreateDatabase = null;
                } catch (NumberFormatException unused4) {
                    sQLiteDatabaseOpenOrCreateDatabase = null;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabaseOpenOrCreateDatabase = null;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (sQLiteDatabaseOpenOrCreateDatabase != null) {
                        sQLiteDatabaseOpenOrCreateDatabase.close();
                    }
                    throw th;
                }
                size = this.f36516b.size();
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return size;
    }

    private void b(Cursor cursor) {
        int iC = 0;
        int iC2 = 0;
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            String prodId = ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).getProdId(string);
            int iC3 = SharedPreferenceManager.c(String.valueOf(10000), cursor.getString(1), 2);
            if (d(prodId, iC3, iC, iC2) && !this.f36516b.containsKey(cursor.getString(1))) {
                iC = c(iC, prodId, iC3);
                iC2 = c(iC2, prodId, iC3);
                BluetoothMonitor$BluetoothDeviceInfo bluetoothMonitor$BluetoothDeviceInfo = new BluetoothMonitor$BluetoothDeviceInfo();
                bluetoothMonitor$BluetoothDeviceInfo.d = string;
                bluetoothMonitor$BluetoothDeviceInfo.f8029a = cursor.getString(1);
                bluetoothMonitor$BluetoothDeviceInfo.f8031c = Integer.parseInt(cursor.getString(2), 10);
                bluetoothMonitor$BluetoothDeviceInfo.f8030b = cursor.getString(3);
                bluetoothMonitor$BluetoothDeviceInfo.e = cursor.getString(4);
                com.huawei.hwlogsmodel.LogUtil.d("BluetoothMonitor", "loadDeviceList() mdi.name = ", bluetoothMonitor$BluetoothDeviceInfo.e);
                bluetoothMonitor$BluetoothDeviceInfo.f = null;
                this.f36516b.put(bluetoothMonitor$BluetoothDeviceInfo.f8029a, bluetoothMonitor$BluetoothDeviceInfo);
                this.h.add(bluetoothMonitor$BluetoothDeviceInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, String str2, int i, String str3, String str4) {
        if (str == null || str2 == null || str4 == null) {
            return;
        }
        com.huawei.hwlogsmodel.LogUtil.d("BluetoothMonitor", "Device for ", str, " was added mode = ", Integer.valueOf(i), ",name = ", str4);
        synchronized (this.e) {
            if (!this.f36516b.containsKey(str2)) {
                a(str, ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).getProdId(str));
                BluetoothMonitor$BluetoothDeviceInfo bluetoothMonitor$BluetoothDeviceInfo = new BluetoothMonitor$BluetoothDeviceInfo();
                bluetoothMonitor$BluetoothDeviceInfo.d = str;
                bluetoothMonitor$BluetoothDeviceInfo.f8029a = str2;
                bluetoothMonitor$BluetoothDeviceInfo.f8031c = i;
                bluetoothMonitor$BluetoothDeviceInfo.f8030b = str3;
                bluetoothMonitor$BluetoothDeviceInfo.e = str4;
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter.isEnabled()) {
                    a(defaultAdapter, bluetoothMonitor$BluetoothDeviceInfo);
                }
                this.f36516b.put(str2, bluetoothMonitor$BluetoothDeviceInfo);
                this.h.add(bluetoothMonitor$BluetoothDeviceInfo);
            }
        }
    }

    private void a(String str, String str2) {
        if (this.f36516b.size() < 2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!dmz.ac.contains(str2)) {
            com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "Not second-generation jump rope.");
            return;
        }
        for (BluetoothMonitor$BluetoothDeviceInfo bluetoothMonitor$BluetoothDeviceInfo : this.h) {
            if (bluetoothMonitor$BluetoothDeviceInfo.d.equals(str)) {
                arrayList.add(bluetoothMonitor$BluetoothDeviceInfo.f8029a);
            }
        }
        com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "device size is ", Integer.valueOf(arrayList.size()));
        if (arrayList.size() < 2) {
            return;
        }
        String str3 = (String) arrayList.get(0);
        com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "remove device ", CommonUtil.n(str3));
        b(str, str3);
    }

    private boolean d(String str, int i, int i2, int i3) {
        com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "isNeedAddSecondRopeMonitorProfile connectMode = ", Integer.valueOf(i));
        if (dmz.ac.contains(str) && i == 2) {
            return false;
        }
        if ("2G97".equals(str)) {
            return i2 < 2;
        }
        return !"2G98".equals(str) || i3 < 2;
    }

    private int c(int i, String str, int i2) {
        return (!dmz.ac.contains(str) || i2 == 2) ? i : i + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        if (str2 != null) {
            com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "Device for ", str, " was removed");
            synchronized (this.e) {
                this.i = str2;
                BluetoothMonitor$BluetoothDeviceInfo bluetoothMonitor$BluetoothDeviceInfoRemove = this.f36516b.remove(str2);
                this.h.remove(bluetoothMonitor$BluetoothDeviceInfoRemove);
                if (bluetoothMonitor$BluetoothDeviceInfoRemove == null || bluetoothMonitor$BluetoothDeviceInfoRemove.f8031c != 1) {
                    if (bluetoothMonitor$BluetoothDeviceInfoRemove != null && bluetoothMonitor$BluetoothDeviceInfoRemove.f8031c == 2) {
                        com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "removeDevice");
                        i();
                    } else {
                        com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "removeDevice ", "wrong connectMode");
                    }
                } else {
                    BluetoothProfile bluetoothProfile = bluetoothMonitor$BluetoothDeviceInfoRemove.f;
                    if (!(bluetoothProfile instanceof BluetoothGatt)) {
                        com.huawei.hwlogsmodel.LogUtil.a("BluetoothMonitor", "removeDevice ", "wrong object type");
                    } else {
                        try {
                            ((BluetoothGatt) bluetoothProfile).disconnect();
                        } catch (SecurityException unused) {
                            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("BluetoothMonitor", "removeDevice SecurityException");
                        }
                        SharedPreferenceManager.b(String.valueOf(10000), str2);
                    }
                }
            }
        }
    }

    public void a() {
        BaseApplication.b().unregisterReceiver(this.g);
    }
}
