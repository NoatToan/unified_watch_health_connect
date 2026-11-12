package com.huami.watch.transport;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.facebook.internal.AnalyticsEvents;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.AppUtil;
import com.huami.watch.util.Config;
import com.huami.watch.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class TransporterClassic extends Transporter {
    private static final String o = "Transporter-Classic";
    public static final String p = "com.huami.watch.transport.DataTransportService";
    private static f r;
    private static Intent s;
    private WeakReference<Context> a;
    private String b;
    private String c;
    private ITransportDataService d;
    private boolean e;
    private boolean f;
    private final List<Transporter.c> g = new ArrayList();
    private final LongSparseArray<Transporter.d> h = new LongSparseArray<>();
    private final List<Transporter.b> i = new ArrayList();
    private final List<Transporter.ServiceConnectionListener> j = new ArrayList();
    private ITransportCallbackListener k = new a();
    private ITransportDataListener l = new b();
    private ITransportChannelListener m = new c();
    private Transporter.ServiceConnectionListener n = new d();
    private static final Map<String, WeakReference<TransporterClassic>> q = new ArrayMap();
    public static final boolean DEBUG = Config.isDebug();

    public class a extends ITransportCallbackListener.Stub {
        public a() {
        }

        @Override // com.huami.watch.transport.ITransportCallbackListener
        public void onResultBack(DataTransportResult dataTransportResult) throws RemoteException {
            Transporter.d dVar;
            long createTime = dataTransportResult.getDataItem().getCreateTime();
            synchronized (TransporterClassic.this.h) {
                dVar = (Transporter.d) TransporterClassic.this.h.get(createTime);
                TransporterClassic.this.h.remove(createTime);
            }
            if (dVar != null) {
                if (TransporterClassic.DEBUG) {
                    Log.d(TransporterClassic.this.c, "OnResultBack : " + dataTransportResult + ", " + dVar, new Object[0]);
                }
                ((Transporter.DataSendResultCallback) dVar).onResultBack(dataTransportResult);
            }
        }
    }

    public class b extends ITransportDataListener.Stub {
        public b() {
        }

        @Override // com.huami.watch.transport.ITransportDataListener
        public void onDataReceived(TransportDataItem transportDataItem) throws RemoteException {
            String action = transportDataItem.getAction();
            if (TransporterClassic.DEBUG) {
                Log.d(TransporterClassic.this.c, "OnDataReceived Action : " + action, new Object[0]);
            }
            synchronized (TransporterClassic.this.g) {
                if (TransporterClassic.this.g.size() > 0) {
                    Iterator it2 = TransporterClassic.this.g.iterator();
                    while (it2.hasNext()) {
                        try {
                            ((Transporter.DataListener) ((Transporter.c) it2.next())).onDataReceived(transportDataItem);
                        } catch (Exception e) {
                            e.printStackTrace();
                            Log.e(TransporterClassic.this.c, "OnDataReceived Err", e, new Object[0]);
                            Analytics.exception(new Exception("OnDataReceived Err", e));
                        }
                    }
                }
            }
        }
    }

    public class c extends ITransportChannelListener.Stub {
        public c() {
        }

        @Override // com.huami.watch.transport.ITransportChannelListener
        public void onChannelChanged(boolean z) {
            if (TransporterClassic.DEBUG) {
                Log.d(TransporterClassic.this.c, "OnChannelChanged Available : " + z, new Object[0]);
            }
            synchronized (TransporterClassic.this.i) {
                if (TransporterClassic.this.i.size() > 0) {
                    Iterator it2 = TransporterClassic.this.i.iterator();
                    while (it2.hasNext()) {
                        try {
                            ((Transporter.ChannelListener) ((Transporter.b) it2.next())).onChannelChanged(z);
                        } catch (Exception e) {
                            e.printStackTrace();
                            Log.e(TransporterClassic.this.c, "OnChannelChanged Err", e, new Object[0]);
                            Analytics.exception(new Exception("OnChannelChanged Err", e));
                        }
                    }
                }
            }
        }
    }

    public class d implements Transporter.ServiceConnectionListener {
        public d() {
        }

        @Override // com.huami.watch.transport.Transporter.ServiceConnectionListener
        public void onServiceConnected(Bundle bundle) {
            if (TransporterClassic.DEBUG) {
                Log.d(TransporterClassic.this.c, "TransportService Connected : " + bundle, new Object[0]);
            }
            synchronized (TransporterClassic.this.j) {
                if (TransporterClassic.this.j.size() > 0) {
                    Iterator it2 = TransporterClassic.this.j.iterator();
                    while (it2.hasNext()) {
                        ((Transporter.ServiceConnectionListener) it2.next()).onServiceConnected(bundle);
                    }
                }
            }
        }

        @Override // com.huami.watch.transport.Transporter.ServiceConnectionListener
        public void onServiceConnectionFailed(Transporter.ConnectionResult connectionResult) {
            if (TransporterClassic.DEBUG) {
                Log.w(TransporterClassic.this.c, "TransportService Connect Failed : " + connectionResult, new Object[0]);
            }
            synchronized (TransporterClassic.this.j) {
                if (TransporterClassic.this.j.size() > 0) {
                    Iterator it2 = TransporterClassic.this.j.iterator();
                    while (it2.hasNext()) {
                        ((Transporter.ServiceConnectionListener) it2.next()).onServiceConnectionFailed(connectionResult);
                    }
                }
            }
        }

        @Override // com.huami.watch.transport.Transporter.ServiceConnectionListener
        public void onServiceDisconnected(Transporter.ConnectionResult connectionResult) {
            if (TransporterClassic.DEBUG) {
                Log.d(TransporterClassic.this.c, "TransportService Disconnected : " + connectionResult, new Object[0]);
            }
            synchronized (TransporterClassic.this.j) {
                if (TransporterClassic.this.j.size() > 0) {
                    Iterator it2 = TransporterClassic.this.j.iterator();
                    while (it2.hasNext()) {
                        ((Transporter.ServiceConnectionListener) it2.next()).onServiceDisconnected(connectionResult);
                    }
                }
            }
        }
    }

    public class e implements ServiceConnection {
        public e() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d(TransporterClassic.this.c, "On TransportService Connected!!", new Object[0]);
            TransporterClassic.this.d = ITransportDataService.Stub.asInterface(iBinder);
            TransporterClassic.this.e = false;
            TransporterClassic.this.f = true;
            try {
                TransporterClassic.this.d.registersendCallbackListener(TransporterClassic.this.k);
                TransporterClassic.this.d.registerChannelListener(TransporterClassic.this.b, TransporterClassic.this.m);
                TransporterClassic.this.d.registerDataListener(TransporterClassic.this.b, TransporterClassic.this.l);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(TransporterClassic.this.c, "On TransportService Disconnected!!", new Object[0]);
            try {
                if (TransporterClassic.this.d != null) {
                    TransporterClassic.this.d.unregistersendCallbackListener(TransporterClassic.this.k);
                    TransporterClassic.this.d.unregisterChannelListener(TransporterClassic.this.b);
                    TransporterClassic.this.d.unregisterDataListener(TransporterClassic.this.b);
                } else {
                    Log.w(TransporterClassic.this.c, "On TransportService Disconnected : TransportService is Null!!", new Object[0]);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            TransporterClassic.this.d = null;
            TransporterClassic.this.e = false;
            TransporterClassic.this.f = false;
        }
    }

    public static class f extends BroadcastReceiver {
        private f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            TransporterClassic transporterClassic;
            Log.d(TransporterClassic.o, "On TransportService Start Received!!", new Object[0]);
            for (WeakReference weakReference : TransporterClassic.q.values()) {
                if (weakReference != null && (transporterClassic = (TransporterClassic) weakReference.get()) != null) {
                    Log.w(transporterClassic.b, "Re-Connect To TransportService!!", new Object[0]);
                    transporterClassic.connectTransportService();
                }
            }
        }

        public /* synthetic */ f(a aVar) {
            this();
        }
    }

    private TransporterClassic(Context context, String str) {
        this.a = new WeakReference<>(context);
        this.b = str;
        this.c = "Transporter-Classic[" + str + "]";
    }

    public static Transporter get(@NonNull Context context, @NonNull String str) {
        TransporterClassic transporterClassic;
        Map<String, WeakReference<TransporterClassic>> map = q;
        synchronized (map) {
            WeakReference<TransporterClassic> weakReference = map.get(str);
            transporterClassic = weakReference != null ? weakReference.get() : null;
            if (transporterClassic == null) {
                transporterClassic = new TransporterClassic(context, str);
                map.put(str, new WeakReference<>(transporterClassic));
            }
        }
        return transporterClassic;
    }

    private void o() {
        Context context = this.a.get();
        if (context == null) {
            Log.w(this.c, "Context is Null Now!!", new Object[0]);
            this.e = false;
            return;
        }
        a aVar = null;
        if (r == null) {
            r = new f(aVar);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huami.watch.transport.DataTransportService.Start");
            context.getApplicationContext().registerReceiver(r, intentFilter);
        }
        if (s == null) {
            Intent intentCreateIntentFromAction = AppUtil.createIntentFromAction(context.getPackageManager(), p);
            s = intentCreateIntentFromAction;
            if (intentCreateIntentFromAction == null) {
                Log.e(this.c, "DataTransportService Not Found!!", new Object[0]);
                this.e = false;
                return;
            }
        }
        boolean zBindService = context.bindService(s, new e(), 1);
        if (!zBindService) {
            this.d = null;
            this.e = false;
            this.f = false;
        }
        String str = this.c;
        StringBuilder sb = new StringBuilder();
        sb.append("Bind TransportService : ");
        sb.append(zBindService ? "Success" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED);
        Log.d(str, sb.toString(), new Object[0]);
    }

    private void p(String str, @NonNull String str2, DataBundle dataBundle, Transporter.d dVar) {
        TransportDataItem transportDataItem = new TransportDataItem(this.b);
        transportDataItem.addAction(str2);
        if (dataBundle == null) {
            dataBundle = new DataBundle();
        }
        transportDataItem.setData(dataBundle);
        if (!isTransportServiceConnected()) {
            if (DEBUG) {
                Log.w(this.c, "Send : " + transportDataItem + ", TransportService Disconnected!!", new Object[0]);
            }
            if (dVar != null) {
                ((Transporter.DataSendResultCallback) dVar).onResultBack(new DataTransportResult(transportDataItem, 4));
                return;
            }
            return;
        }
        if (DEBUG) {
            Log.d(this.c, "Send : " + transportDataItem + ", " + str, new Object[0]);
        }
        if (dVar != null) {
            synchronized (this.h) {
                this.h.put(transportDataItem.getCreateTime(), dVar);
            }
        }
        try {
            if (str == null) {
                this.d.sendData(transportDataItem);
            } else {
                this.d.sendDataTo(str, transportDataItem);
            }
        } catch (RemoteException e2) {
            e2.printStackTrace();
            synchronized (this.h) {
                this.h.remove(transportDataItem.getCreateTime());
            }
        }
    }

    @Override // com.huami.watch.transport.Transporter
    public void addChannelListener(Transporter.ChannelListener channelListener) {
        synchronized (this.i) {
            if (!this.i.contains(channelListener)) {
                this.i.add(channelListener);
            }
        }
    }

    @Override // com.huami.watch.transport.Transporter
    public void addDataListener(Transporter.DataListener dataListener) {
        synchronized (this.g) {
            if (!this.g.contains(dataListener)) {
                this.g.add(dataListener);
            }
        }
    }

    @Override // com.huami.watch.transport.Transporter
    public void addServiceConnectionListener(Transporter.ServiceConnectionListener serviceConnectionListener) {
        synchronized (this.j) {
            if (!this.j.contains(serviceConnectionListener)) {
                this.j.add(serviceConnectionListener);
            }
        }
    }

    @Override // com.huami.watch.transport.Transporter
    public void connectTransportService() {
        Log.d(this.c, "Connect TransportService...\nNow Is Connected : " + this.f + ", Is Connecting : " + this.e, new Object[0]);
        if (this.f || this.e) {
            return;
        }
        this.e = true;
        o();
    }

    @Override // com.huami.watch.transport.Transporter
    public void disconnectTransportService() {
        Log.d(this.c, "Disconnect TransportService...\nNow Is Connected : " + this.f + ", Is Connecting : " + this.e, new Object[0]);
        if (this.f) {
            this.e = false;
            this.f = false;
            try {
                this.d.unregistersendCallbackListener(this.k);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.huami.watch.transport.Transporter
    public boolean isAvailable() {
        return isTransportServiceConnected();
    }

    @Override // com.huami.watch.transport.Transporter
    public boolean isTransportServiceConnected() {
        if (DEBUG) {
            Log.d(this.c, "TransportService Is Connected : " + this.f, new Object[0]);
        }
        return this.f;
    }

    @Override // com.huami.watch.transport.Transporter
    public void removeChannelListener(Transporter.ChannelListener channelListener) {
        synchronized (this.i) {
            this.i.remove(channelListener);
        }
    }

    @Override // com.huami.watch.transport.Transporter
    public void removeDataListener(Transporter.DataListener dataListener) {
        synchronized (this.g) {
            this.g.remove(dataListener);
        }
    }

    @Override // com.huami.watch.transport.Transporter
    public void removeServiceConnectionListener(Transporter.ServiceConnectionListener serviceConnectionListener) {
        synchronized (this.j) {
            this.j.remove(serviceConnectionListener);
        }
    }

    @Override // com.huami.watch.transport.Transporter
    public void send(@NonNull String str, DataBundle dataBundle, Transporter.DataSendResultCallback dataSendResultCallback) {
        p(null, str, dataBundle, dataSendResultCallback);
    }

    @Override // com.huami.watch.transport.Transporter
    public void sendTo(@NonNull String str, @NonNull String str2, DataBundle dataBundle, Transporter.DataSendResultCallback dataSendResultCallback) {
        p(str, str2, dataBundle, dataSendResultCallback);
    }
}
