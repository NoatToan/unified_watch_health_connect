package com.huami.watch.transport;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.R;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.transport.ble.connection.BleConnection;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.BytesUtil;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;
import com.huami.watch.util.NotificationBuilder;
import com.huami.watch.util.ZipUtil;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.common.api.ServiceManagerContext;
import com.ingenic.iwds.datatransactor.DataTransactor;
import com.ingenic.iwds.utils.serializable.ParcelableUtils;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import com.xiaomi.hm.health.bt.profile.smartwatch.transport.HMSmartWatchTransportProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class DataTransportService extends Service {
    public static final String TRANSACTOR_UUID = "5a177e43-82e6-d483-b7e3-d7072047e3cc";
    private static final String j = "Transporter-Service";
    private static final String k = "com.huami.watch.transport.DataTransportService.Start";
    private static final String l = "4e5c2323-5685-41d4-ab47-20638aaca977";
    private HandlerThread a;
    private Handler b;
    private boolean d;
    private boolean e;
    private final Map<String, DataTransactor> c = new ArrayMap();
    private final Map<String, List<ITransportDataListener>> f = new ArrayMap();
    private final Map<String, List<ITransportChannelListener>> g = new ArrayMap();
    private final List<ITransportCallbackListener> h = new ArrayList();
    private IBinder i = new a();

    public class a extends ITransportDataService.Stub {

        /* JADX INFO: renamed from: com.huami.watch.transport.DataTransportService$a$a, reason: collision with other inner class name */
        public class RunnableC0674a implements Runnable {
            public final /* synthetic */ String a;
            public final /* synthetic */ ITransportDataListener b;

            public RunnableC0674a(String str, ITransportDataListener iTransportDataListener) {
                this.a = str;
                this.b = iTransportDataListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(DataTransportService.j, "Register DataListener, Module : " + this.a + ", " + this.b, new Object[0]);
                if (this.b == null) {
                    return;
                }
                List arrayList = (List) DataTransportService.this.f.get(this.a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    DataTransportService.this.f.put(this.a, arrayList);
                }
                if (arrayList.contains(this.b)) {
                    return;
                }
                arrayList.add(this.b);
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ String a;

            public b(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!DataTransportService.this.f.containsKey(this.a)) {
                    Log.d(DataTransportService.j, "Unregister DataListener, Module : " + this.a + " isn't exist", new Object[0]);
                    return;
                }
                if (((List) DataTransportService.this.f.get(this.a)).size() == 0) {
                    DataTransportService.this.f.remove(this.a);
                    Log.d(DataTransportService.j, "Unregister DataListener, Module : " + this.a, new Object[0]);
                }
            }
        }

        public class c implements Runnable {
            public final /* synthetic */ String a;
            public final /* synthetic */ ITransportChannelListener b;

            public c(String str, ITransportChannelListener iTransportChannelListener) {
                this.a = str;
                this.b = iTransportChannelListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(DataTransportService.j, "Register ChannelListener, Module : " + this.a + ", " + this.b, new Object[0]);
                if (this.b == null) {
                    return;
                }
                List arrayList = (List) DataTransportService.this.g.get(this.a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    DataTransportService.this.g.put(this.a, arrayList);
                }
                if (arrayList.contains(this.b)) {
                    return;
                }
                arrayList.add(this.b);
            }
        }

        public class d implements Runnable {
            public final /* synthetic */ String a;

            public d(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!DataTransportService.this.g.containsKey(this.a)) {
                    Log.d(DataTransportService.j, "Unregister ChannelListener, Module : " + this.a + " isn't exist", new Object[0]);
                    return;
                }
                if (((List) DataTransportService.this.g.get(this.a)).size() == 0) {
                    DataTransportService.this.g.remove(this.a);
                    Log.d(DataTransportService.j, "Unregister ChannelListener, Module : " + this.a, new Object[0]);
                }
            }
        }

        public class e implements Runnable {
            public final /* synthetic */ ITransportCallbackListener a;

            public e(ITransportCallbackListener iTransportCallbackListener) {
                this.a = iTransportCallbackListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(DataTransportService.j, "Register SendResultCallback : " + this.a, new Object[0]);
                if (this.a == null || DataTransportService.this.h.contains(this.a)) {
                    return;
                }
                DataTransportService.this.h.add(this.a);
            }
        }

        public class f implements Runnable {
            public final /* synthetic */ ITransportCallbackListener a;

            public f(ITransportCallbackListener iTransportCallbackListener) {
                this.a = iTransportCallbackListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (DataTransportService.this.h.contains(this.a)) {
                    Log.d(DataTransportService.j, "Unregister SendResultCallback : " + this.a, new Object[0]);
                    DataTransportService.this.h.remove(this.a);
                }
            }
        }

        public class g implements Runnable {
            public final /* synthetic */ TransportDataItem a;

            public g(TransportDataItem transportDataItem) {
                this.a = transportDataItem;
            }

            @Override // java.lang.Runnable
            public void run() {
                DataTransportService.this.r(this.a);
            }
        }

        public class h implements Runnable {
            public final /* synthetic */ String a;
            public final /* synthetic */ TransportDataItem b;

            public h(String str, TransportDataItem transportDataItem) {
                this.a = str;
                this.b = transportDataItem;
            }

            @Override // java.lang.Runnable
            public void run() {
                DataTransportService.this.s(this.a, this.b);
            }
        }

        public a() {
        }

        @Override // com.huami.watch.transport.ITransportDataService
        public void registerChannelListener(String str, ITransportChannelListener iTransportChannelListener) throws RemoteException {
            if (DataTransportService.this.b == null) {
                return;
            }
            DataTransportService.this.b.post(new c(str, iTransportChannelListener));
        }

        @Override // com.huami.watch.transport.ITransportDataService
        public void registerComponentName(ComponentName componentName, String str) {
        }

        @Override // com.huami.watch.transport.ITransportDataService
        public void registerDataListener(String str, ITransportDataListener iTransportDataListener) throws RemoteException {
            if (DataTransportService.this.b == null) {
                return;
            }
            DataTransportService.this.b.post(new RunnableC0674a(str, iTransportDataListener));
        }

        @Override // com.huami.watch.transport.ITransportDataService
        public void registersendCallbackListener(ITransportCallbackListener iTransportCallbackListener) throws RemoteException {
            if (DataTransportService.this.b == null) {
                return;
            }
            DataTransportService.this.b.post(new e(iTransportCallbackListener));
        }

        @Override // com.huami.watch.transport.ITransportDataService
        public void sendData(TransportDataItem transportDataItem) throws RemoteException {
            if (DataTransportService.this.b == null) {
                return;
            }
            DataTransportService.this.b.post(new g(transportDataItem));
        }

        @Override // com.huami.watch.transport.ITransportDataService
        public void sendDataTo(String str, TransportDataItem transportDataItem) throws RemoteException {
            if (DataTransportService.this.b == null) {
                return;
            }
            DataTransportService.this.b.post(new h(str, transportDataItem));
        }

        @Override // com.huami.watch.transport.ITransportDataService
        public void unregisterChannelListener(String str) throws RemoteException {
            if (DataTransportService.this.b == null) {
                return;
            }
            DataTransportService.this.b.post(new d(str));
        }

        @Override // com.huami.watch.transport.ITransportDataService
        public void unregisterDataListener(String str) throws RemoteException {
            if (DataTransportService.this.b == null) {
                return;
            }
            DataTransportService.this.b.post(new b(str));
        }

        @Override // com.huami.watch.transport.ITransportDataService
        public void unregistersendCallbackListener(ITransportCallbackListener iTransportCallbackListener) throws RemoteException {
            if (DataTransportService.this.b == null) {
                return;
            }
            DataTransportService.this.b.post(new f(iTransportCallbackListener));
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ Object a;
        public final /* synthetic */ String b;

        public b(Object obj, String str) {
            this.a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                TransportDataItem transportDataItem = (TransportDataItem) this.a;
                List list = (List) DataTransportService.this.f.get(transportDataItem.getModuleName());
                Log.d(DataTransportService.j, "OnDataArrived: " + transportDataItem + ", DID: " + this.b + ", Listeners: " + ArraysUtil.toString((List<?>) list), new Object[0]);
                if (Config.isDebug()) {
                    Log.v(DataTransportService.j, transportDataItem.getData() + ", MapSize: " + transportDataItem.getData().size() + ", " + transportDataItem.getData(), new Object[0]);
                }
                if (list == null || list.size() <= 0) {
                    return;
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ITransportDataListener iTransportDataListener = (ITransportDataListener) it2.next();
                    Log.d(DataTransportService.j, "OnDataArrived, Listener: " + iTransportDataListener, new Object[0]);
                    try {
                        iTransportDataListener.onDataReceived(transportDataItem);
                    } catch (DeadObjectException e) {
                        e.printStackTrace();
                        it2.remove();
                    }
                }
            } catch (Exception e2) {
                Log.e(DataTransportService.j, "OnDataArrivedErr", e2, new Object[0]);
                Analytics.exception(new Exception("OnDataArrivedErr", e2));
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ String b;

        public c(boolean z, String str) {
            this.a = z;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.i(DataTransportService.j, "OnChannelAvailable : " + this.a + ", " + this.b, new Object[0]);
            Iterator it2 = DataTransportService.this.g.values().iterator();
            while (it2.hasNext()) {
                try {
                    Iterator it3 = ((List) it2.next()).iterator();
                    while (it3.hasNext()) {
                        try {
                            ((ITransportChannelListener) it3.next()).onChannelChanged(this.a);
                        } catch (DeadObjectException e) {
                            e.printStackTrace();
                            it3.remove();
                        }
                    }
                } catch (Exception e2) {
                    Log.e(DataTransportService.j, "OnChannelChangedErr", e2, new Object[0]);
                    Analytics.exception(new Exception("OnChannelChangedErr", e2));
                }
            }
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ DataTransactor.DataTransactResult a;
        public final /* synthetic */ String b;

        public d(DataTransactor.DataTransactResult dataTransactResult, String str) {
            this.a = dataTransactResult;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TransportDataItem transportDataItem = this.a.getTransferedObject() instanceof TransportDataItem ? (TransportDataItem) this.a.getTransferedObject() : null;
            if (transportDataItem == null) {
                Log.w(DataTransportService.j, "OnSendResult : DataItem is Null!!", new Object[0]);
                return;
            }
            DataTransportResult dataTransportResult = new DataTransportResult(transportDataItem, this.a.getResultCode());
            Log.d(DataTransportService.j, "OnSendResult : " + dataTransportResult + ", " + this.b, new Object[0]);
            DataTransportService.this.t(this.b, dataTransportResult);
        }
    }

    public class e implements DataTransactor.DataTransactorCallback {
        private String a;

        public e(String str) {
            this.a = str;
        }

        @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onChannelAvailable(boolean z) {
            DataTransportService.this.n(z, this.a);
        }

        @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onDataArrived(Object obj) {
            DataTransportService.this.o(obj, this.a);
        }

        @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onLinkConnected(DeviceDescriptor deviceDescriptor, boolean z) {
            Log.i(DataTransportService.j, "OnLinkConnected : " + z + ", " + deviceDescriptor, new Object[0]);
        }

        @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onRecvFileProgress(int i) {
        }

        @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onSendFileProgress(int i) {
        }

        @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onSendResult(DataTransactor.DataTransactResult dataTransactResult) {
            DataTransportService.this.p(dataTransactResult, this.a);
        }
    }

    public static Notification buildNotification(@NonNull Context context, boolean z, String str) {
        Intent intent = new Intent(ServiceManagerContext.ACTION_NOTIFICATION_CLICKED);
        intent.addFlags(335577088);
        NotificationCompat.Builder contentIntent = NotificationBuilder.buildNotification(context, NotificationBuilder.CHANNEL_ID_FOREGROUND).setSmallIcon(R.drawable.ic_notification).setContentTitle(context.getApplicationInfo().loadLabel(context.getPackageManager())).setContentText(str).setContentIntent(PendingIntent.getActivity(context, 0, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : AMapEngineUtils.HALF_MAX_P20_WIDTH));
        if (!DeviceCompatibility.isO()) {
            contentIntent.setPriority(-2);
        }
        return contentIntent.build();
    }

    private void l() {
        BleConnection bleConnection;
        HMSmartWatchDevice hMSmartWatchDevice;
        CompanionApplication companionApplication = CompanionApplication.get();
        if (companionApplication == null || (bleConnection = companionApplication.mBleConnection) == null || (hMSmartWatchDevice = bleConnection.mBleDevice) == null) {
            return;
        }
        hMSmartWatchDevice.setDataListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(byte[] bArr) {
        TransportDataItem transportDataItem;
        try {
            transportDataItem = (TransportDataItem) ParcelableUtils.unmarshall(ZipUtil.unGZip(bArr), TransportDataItem.CREATOR);
        } catch (Exception e2) {
            Log.w(j, "ReceiveTransportDataItem Err", e2, new Object[0]);
            transportDataItem = null;
        }
        if (transportDataItem != null) {
            o(transportDataItem, DeviceUtil.UNKNOWN_DID);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(boolean z, String str) {
        Handler handler = this.b;
        if (handler == null) {
            return;
        }
        handler.post(new c(z, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(Object obj, String str) {
        Handler handler = this.b;
        if (handler == null) {
            return;
        }
        handler.post(new b(obj, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(DataTransactor.DataTransactResult dataTransactResult, String str) {
        Handler handler = this.b;
        if (handler == null) {
            return;
        }
        handler.post(new d(dataTransactResult, str));
    }

    private void q(TransportDataItem transportDataItem, boolean z) {
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice == null || z) {
            t(null, new DataTransportResult(transportDataItem, 1));
            return;
        }
        byte[] bArrMarshall = ParcelableUtils.marshall(transportDataItem);
        Log.v(j, "Send Data BLE, TransportDataItem: " + BytesUtil.log(bArrMarshall), new Object[0]);
        hMSmartWatchDevice.sendData(1, ZipUtil.gZip(bArrMarshall));
        t(null, new DataTransportResult(transportDataItem, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(TransportDataItem transportDataItem) {
        try {
            Log.d(j, "Send Data: " + transportDataItem + ", IsBLE: " + this.d + ", IsBLE MCU: " + this.e, new Object[0]);
            if (Config.isDebug()) {
                Log.v(j, transportDataItem.getData() + ", MapSize: " + transportDataItem.getData().size(), new Object[0]);
            }
            if (this.d) {
                q(transportDataItem, this.e);
                return;
            }
            synchronized (this.c) {
                if (this.c.size() > 0) {
                    for (DataTransactor dataTransactor : this.c.values()) {
                        if (dataTransactor != null) {
                            dataTransactor.send(transportDataItem);
                        }
                    }
                } else {
                    t(null, new DataTransportResult(transportDataItem, 1));
                }
            }
        } catch (Exception e2) {
            Log.e(j, "SendDataErr", e2, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(String str, TransportDataItem transportDataItem) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(String str, DataTransportResult dataTransportResult) {
        Iterator<ITransportCallbackListener> it2 = this.h.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onResultBack(dataTransportResult);
            } catch (Exception e2) {
                Log.e(j, "OnSendResultErr", e2, new Object[0]);
                if (e2 instanceof DeadObjectException) {
                    it2.remove();
                } else {
                    Analytics.exception(new Exception("OnSendResultErr", e2));
                }
            }
        }
    }

    private void u(String str) {
        NotificationBuilder.createChannel(this, NotificationBuilder.CHANNEL_ID_FOREGROUND, NotificationBuilder.CHANNEL_ID_FOREGROUND, false, false);
        NotificationManagerCompat.from(this).cancel(8888);
        startForeground(8888, buildNotification(this, true, str));
    }

    private void v(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.w(j, "Start Transactor without did/uuid : " + str + ", UUID : " + str2, new Object[0]);
            return;
        }
        Log.d(j, "Start Transactor, BLE: " + z, new Object[0]);
        if (z) {
            HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
            if (hMSmartWatchDevice != null) {
                hMSmartWatchDevice.setDataListener(new HMSmartWatchTransportProfile.DataListener() { // from class: a31
                    @Override // com.xiaomi.hm.health.bt.profile.smartwatch.transport.HMSmartWatchTransportProfile.DataListener
                    public final void onReceiveData(byte[] bArr) {
                        this.a.m(bArr);
                    }
                });
                return;
            }
            return;
        }
        synchronized (this.c) {
            DataTransactor dataTransactor = this.c.get(str);
            Log.i(j, "Start Transactor : " + str + ", UUID : " + str2 + ", Already contains : " + dataTransactor, new Object[0]);
            if (dataTransactor != null) {
                return;
            }
            DataTransactor dataTransactor2 = new DataTransactor(this, new e(str), str2);
            dataTransactor2.start();
            this.c.put(str, dataTransactor2);
            Log.d(j, "Transactors : " + this.c.toString(), new Object[0]);
        }
    }

    private void w() {
        synchronized (this.c) {
            Log.i(j, "Stop All Transactors!!", new Object[0]);
            for (DataTransactor dataTransactor : this.c.values()) {
                Log.d(j, "Stop Transactor : " + dataTransactor, new Object[0]);
                if (dataTransactor != null) {
                    dataTransactor.stop();
                }
            }
            this.c.clear();
            Log.d(j, "Transactors : " + this.c.toString(), new Object[0]);
        }
        Log.d(j, "Stop BLE Transport!!", new Object[0]);
        l();
    }

    private void x(String str) {
        stopForeground(true);
    }

    private void y(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            Log.w(j, "Stop Transactor without did : " + str, new Object[0]);
            return;
        }
        Log.d(j, "Stop Transactor, BLE: " + z, new Object[0]);
        if (z) {
            l();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.i;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.d(j, "DataTransportService onCreate!!", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("DataTransportServiceThread");
        this.a = handlerThread;
        handlerThread.start();
        this.b = new Handler(this.a.getLooper());
    }

    @Override // android.app.Service
    public void onDestroy() {
        Log.d(j, "DataTransportService onDestroy", new Object[0]);
        this.a.quitSafely();
        this.a = null;
        this.b = null;
        stopForeground(true);
        w();
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        boolean booleanExtra;
        boolean booleanExtra2;
        boolean booleanExtra3;
        boolean booleanExtra4;
        boolean booleanExtra5;
        if (intent != null) {
            booleanExtra2 = intent.getBooleanExtra("IsForeground", false);
            booleanExtra3 = intent.getBooleanExtra("IsDeviceConnected", false);
            booleanExtra4 = intent.getBooleanExtra("IsDeviceUnbound", false);
            stringExtra = intent.getStringExtra("ContentText");
            stringExtra2 = intent.getStringExtra("DeviceId");
            stringExtra3 = intent.getStringExtra("UUID");
            booleanExtra5 = intent.getBooleanExtra("IsBLE", false);
            booleanExtra = intent.getBooleanExtra("IsBLEMcu", false);
        } else {
            stringExtra = "";
            stringExtra2 = null;
            stringExtra3 = null;
            booleanExtra = false;
            booleanExtra2 = false;
            booleanExtra3 = false;
            booleanExtra4 = false;
            booleanExtra5 = false;
        }
        Log.d(j, "OnStartCommand, Foreground : " + booleanExtra2 + ", Connected : " + booleanExtra3 + ", IsDeviceUnbound : " + booleanExtra4 + ", ContentTitle : " + stringExtra + ", DID : " + stringExtra2 + ", UUID : " + stringExtra3 + ", IsBLE: " + booleanExtra5 + ", IsBle MCU: " + this.e, new Object[0]);
        this.d = booleanExtra5;
        this.e = booleanExtra;
        if (booleanExtra4) {
            y(stringExtra2, booleanExtra5);
        } else if (booleanExtra3) {
            v(stringExtra2, stringExtra3, booleanExtra5);
        }
        sendBroadcast(new Intent(k));
        return 1;
    }
}
