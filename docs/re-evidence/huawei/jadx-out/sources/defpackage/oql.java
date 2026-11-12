package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.phdkit.DataContentListener;
import com.huawei.phdkit.DataReceiveListener;
import com.huawei.phdkit.DeviceData;
import com.huawei.phdkit.DeviceStateListener;
import com.huawei.phdkit.DiscoveryListener;
import com.huawei.phdkit.DvLiteBinder;
import com.huawei.phdkit.DvLiteCommand;
import defpackage.yit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes41.dex */
public class oql {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Context f44359c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBinder.DeathRecipient f44360a;
    private Map<String, DataReceiveListener> f;
    private boolean g;
    private Map<String, DataReceiveListener> h;
    private DvLiteBinder i;
    private boolean j;
    private DeviceStateListener m;
    private ExecutorService o;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f44358b = new Object();
    private static final Object d = new Object();

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final oql f44369c = new oql();
    }

    private oql() {
        this.g = true;
        this.h = new HashMap(4);
        this.j = false;
        this.f = new ConcurrentHashMap();
        this.f44360a = new IBinder.DeathRecipient() { // from class: oql.4
            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                try {
                    Log.i("PhdKit", "binderDied enter");
                    if (oql.this.m != null) {
                        oql.this.m.onServiceDied();
                    }
                    if (oql.this.i != null) {
                        oql.this.i = null;
                    }
                    oql.this.f.clear();
                    synchronized (oql.d) {
                        oql.this.h.clear();
                        Log.i("PhdKit", "mDataListenerMap.clear()");
                    }
                } catch (RemoteException unused) {
                    Log.e("PhdKit", "binderDied RemoteException");
                }
            }
        };
        Log.i("PhdKit", "getInstance create");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.o = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: oql.5
            @Override // java.lang.Runnable
            public void run() {
                oql.this.a();
            }
        });
    }

    public Map<String, DataReceiveListener> d() {
        return this.f;
    }

    public void b(IBinder iBinder) {
        yit.e("PhdKit", "setWearEnginePhdkitBinder enter");
        try {
            this.i = DvLiteBinder.Stub.asInterface(iBinder);
            yit.a("PhdKit", "setWearEnginePhdkitBinder mApiAidl: " + this.i);
            DvLiteBinder dvLiteBinder = this.i;
            if (dvLiteBinder == null) {
                yit.c("PhdKit", "onServiceConnected error !");
                return;
            }
            dvLiteBinder.asBinder().linkToDeath(this.f44360a, 0);
            Object obj = f44358b;
            synchronized (obj) {
                yit.e("PhdKit", "setWearEnginePhdkitBinder BIND_LOCK unlock");
                this.j = true;
                obj.notifyAll();
            }
        } catch (RemoteException unused) {
            yit.c("PhdKit", "setBinder exception");
        }
    }

    public static oql d(Context context) {
        Log.i("PhdKit", "PhdKit getInstance");
        if (context != null) {
            f44359c = context.getApplicationContext();
        }
        return a.f44369c;
    }

    private void e() {
        yit.e("PhdKit", "phdkit startPhoneService enter");
        if (yjd.c()) {
            yit.e("PhdKit", "phdkit startPhoneService start phone service");
            Intent intent = new Intent();
            intent.setAction("com.huawei.bone.action.StartPhoneService");
            intent.setPackage("com.huawei.health");
            intent.putExtra("WearEngineDataKey", "WearEnginePhdkitStartPhoneService");
            try {
                yiv.a().startService(intent);
            } catch (IllegalStateException | SecurityException unused) {
                yit.c("PhdKit", "startPhoneService fail");
                throw new IllegalStateException(String.valueOf(12));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Log.d("PhdKit", "bindService enter");
        if (this.i != null) {
            return;
        }
        synchronized (e) {
            if (this.i == null) {
                Log.w("PhdKit", "bindService mApiAidl == null");
                e();
                b();
            }
        }
    }

    private void b() {
        synchronized (f44358b) {
            this.j = false;
            try {
                if (this.i != null) {
                    Log.i("PhdKit", "bindService bind mApiAidl is not null");
                    return;
                }
                while (!this.j) {
                    yit.e("PhdKit", "setWearEnginePhdkitBinder BIND_LOCK lock on");
                    f44358b.wait(30000L);
                    this.j = true;
                }
                Log.i("PhdKit", "bindService bind over mApiAidl is null");
            } catch (InterruptedException unused) {
                Log.e("PhdKit", "waitBind() InterruptedException");
            }
        }
    }

    public boolean b(int i, final DiscoveryListener discoveryListener) {
        if (discoveryListener == null) {
            return false;
        }
        Log.i("PhdKit", "startDiscovery enter");
        this.o.execute(new Runnable() { // from class: oql.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    oql.this.a();
                    if (oql.this.i == null) {
                        Log.e("PhdKit", "startDiscovery mApiAidl is null");
                        discoveryListener.onDeviceFound(new ArrayList());
                    } else {
                        Log.i("PhdKit", "startDiscovery send");
                        oql.this.i.startDiscovery(discoveryListener);
                    }
                } catch (RemoteException unused) {
                    Log.e("PhdKit", "startDiscovery mApiAidl is null");
                }
            }
        });
        return true;
    }

    public void d(String str, byte[] bArr) {
        Log.i("PhdKit", "sendDataCommand enter");
        d(str, bArr, 1, 1);
    }

    public void c(String str, byte[] bArr) {
        Log.i("PhdKit", "sendControlCommand enter");
        Log.d("PhdKit", "sendControlCommand data " + oqn.a(bArr));
        d(str, bArr, 2, 2);
    }

    private void d(final String str, final byte[] bArr, final int i, final int i2) {
        e(this.o.submit(new Callable<Integer>() { // from class: oql.3
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                if (oql.this.g) {
                    oql.this.a();
                    if (oql.this.c(bArr, str)) {
                        oql.this.e(str);
                        Log.e("PhdKit", "sendData mApiAidl parameter is invalid.");
                        return -1;
                    }
                    try {
                        DvLiteCommand dvLiteCommand = new DvLiteCommand();
                        dvLiteCommand.setServiceId(48);
                        dvLiteCommand.setCommandId(i);
                        dvLiteCommand.setDataContents(oqn.a(oqn.e(1) + oqn.b(bArr.length) + oqn.a(bArr)));
                        dvLiteCommand.setUdid(str);
                        dvLiteCommand.setPriority(i2);
                        oql.this.i.sendBluetoothData(dvLiteCommand);
                        return 0;
                    } catch (RemoteException unused) {
                        Log.e("PhdKit", "sendData RemoteException occur");
                        return 12;
                    } catch (IllegalStateException e2) {
                        Log.e("PhdKit", "sendData IllegalStateException occur");
                        return Integer.valueOf(yio.e(e2.getMessage()));
                    }
                }
                Log.w("PhdKit", "sendData MSDP isn't binded.");
                return -1;
            }
        }), "sendData");
    }

    public int e(final String str, final DataReceiveListener dataReceiveListener) {
        Log.i("PhdKit", "connectDevice enter");
        if (dataReceiveListener == null || TextUtils.isEmpty(str)) {
            Log.i("PhdKit", "dataListener is null or udid is null");
            return -2;
        }
        this.o.execute(new Runnable() { // from class: oql.2
            @Override // java.lang.Runnable
            public void run() {
                oql.this.a();
                if (oql.this.i != null) {
                    try {
                        oql.this.g = true;
                        DvLiteBinder dvLiteBinder = oql.this.i;
                        String str2 = str;
                        dvLiteBinder.connectDevice(str2, oql.this.b(str2, dataReceiveListener));
                        return;
                    } catch (RemoteException unused) {
                        Log.e("PhdKit", "RemoteException occur");
                        return;
                    }
                }
                Log.e("PhdKit", "connectDevice mApiAidl is null");
            }
        });
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DataContentListener b(final String str, final DataReceiveListener dataReceiveListener) {
        return new DataContentListener.Stub() { // from class: com.huawei.phdkit.PhdKit$6
            @Override // com.huawei.phdkit.DataContentListener
            public void getResult(String str2, String str3) throws RemoteException {
                yit.a("PhdKit", "getResult: " + str3);
                this.this$0.d(str2, str3, dataReceiveListener);
            }

            @Override // com.huawei.phdkit.DataContentListener
            public void getStatus(DeviceData deviceData) throws RemoteException {
                if (deviceData == null) {
                    Log.w("PhdKit", "getStatus onDataChanged deviceData is null");
                    return;
                }
                yit.a("PhdKit", "getStatus udid: " + deviceData.getUdid());
                yit.e("PhdKit", "getStatus errorCode: " + deviceData.getErrorCode());
                if (deviceData.getErrorCode() == 0) {
                    this.this$0.c(str, dataReceiveListener);
                }
                Log.i("PhdKit", "connectDevice onDataChanged");
                dataReceiveListener.onDataChanged(deviceData);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, DataReceiveListener dataReceiveListener) {
        synchronized (d) {
            this.h.put(str, dataReceiveListener);
        }
    }

    private void c(int i, String str, List<oqs> list, DataReceiveListener dataReceiveListener) {
        if (list == null) {
            return;
        }
        DeviceData deviceData = new DeviceData();
        deviceData.setErrorCode(0);
        deviceData.setStatus(1);
        deviceData.setUdid(str);
        for (oqs oqsVar : list) {
            try {
                int i2 = Integer.parseInt(oqsVar.c(), 16);
                if (i2 == 1) {
                    deviceData.setErrorCode(0);
                    deviceData.setDataContents(oqn.a(oqsVar.b()));
                    deviceData.setLinkType(i);
                } else if (i2 == 127) {
                    deviceData.setErrorCode(-2);
                    deviceData.setDataContents(oqn.a(oqsVar.b()));
                } else {
                    Log.w("PhdKit", "Invalid control types");
                }
            } catch (NumberFormatException unused) {
                Log.e("PhdKit", "musicOperation NumberFormatException");
            }
        }
        try {
            yit.e("PhdKit", "DataListener onDataChanged");
            dataReceiveListener.onDataChanged(deviceData);
        } catch (RemoteException e2) {
            Log.e("PhdKit", "sendDataCallback remoteException:" + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2, DataReceiveListener dataReceiveListener) {
        if (str == null || str2 == null || dataReceiveListener == null) {
            Log.w("PhdKit", "inputer parameters is invaild.");
            return;
        }
        byte[] bArrA = oqn.a(str2);
        if (str2.length() < 4) {
            Log.e("PhdKit", "data lenth less four.");
            return;
        }
        try {
            List<oqs> listE = new oqo().d(str2.substring(4, str2.length())).e();
            byte b2 = bArrA[1];
            if (b2 != 1 && b2 != 2) {
                Log.i("PhdKit", "other commandID getResult().");
            } else {
                c(b2, str, listE, dataReceiveListener);
            }
        } catch (IndexOutOfBoundsException unused) {
            Log.e("PhdKit", "IndexOutOfBoundsException");
        } catch (oqr unused2) {
            Log.e("PhdKit", "TlvException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        if (str == null) {
            Log.i("PhdKit", "sendData uuid is null.");
            return;
        }
        DeviceData deviceData = new DeviceData();
        deviceData.setErrorCode(-2);
        deviceData.setStatus(0);
        deviceData.setUdid(str);
        synchronized (d) {
            try {
                DataReceiveListener dataReceiveListener = this.h.get(str);
                if (dataReceiveListener != null) {
                    Log.i("PhdKit", "sendErrorInfo onDataChanged");
                    dataReceiveListener.onDataChanged(deviceData);
                } else {
                    Log.i("PhdKit", "sendData uuid is invalid.");
                }
            } catch (RemoteException unused) {
                Log.e("PhdKit", "RemoteException occur");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(byte[] bArr, String str) {
        if (this.i == null || bArr == null) {
            Log.e("PhdKit", "sendData mApiAidl parameter is invalid.");
            return true;
        }
        if (bArr.length != 0 && bArr.length <= 2048) {
            return false;
        }
        e(str);
        Log.e("PhdKit", "data is invalid.");
        return true;
    }

    private void e(Future<Integer> future, String str) {
        try {
            if (future == null) {
                yit.b("PhdKit", str + " future is null");
                throw new IllegalStateException(String.valueOf(12));
            }
            int iIntValue = future.get(30000L, TimeUnit.MILLISECONDS).intValue();
            if (iIntValue != 0 && iIntValue != -1) {
                throw new IllegalStateException(String.valueOf(iIntValue));
            }
        } catch (InterruptedException unused) {
            yit.b("PhdKit", str + " InterruptedException");
            throw new IllegalStateException(String.valueOf(12));
        } catch (ExecutionException unused2) {
            yit.b("PhdKit", str + " ExecutionException");
            throw new IllegalStateException(String.valueOf(12));
        } catch (TimeoutException unused3) {
            yit.b("PhdKit", str + " TimeoutException");
            throw new IllegalStateException(String.valueOf(12));
        }
    }
}
