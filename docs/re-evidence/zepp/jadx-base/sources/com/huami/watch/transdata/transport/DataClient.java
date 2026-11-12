package com.huami.watch.transdata.transport;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huami.watch.transdata.DataService;
import com.huami.watch.transdata.DataTrans;
import com.huami.watch.transdata.IDataListener;
import com.huami.watch.transdata.IDataServiceAidl;
import com.huami.watch.transdata.TLog;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes16.dex */
public class DataClient {
    private static final String h = "com.huami.watch.DATA_SERVICE_CONNECTED_ACTION";
    private static final String i = "com.huami.watch.DATA_SERVICE_DISCONNECTED_ACTION";
    private static final String j = "com.huami.watch.transdata.transport.DataClient";
    private Context c;
    private BroadcastReceiver f;
    private DataService.ClientListener d = null;
    private IDataServiceAidl e = null;
    private AtomicBoolean a = new AtomicBoolean(false);
    private final ServiceConnection g = new b();
    private final IDataListener b = new c();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!TextUtils.equals(intent.getAction(), DataClient.h)) {
                TextUtils.equals(intent.getAction(), DataClient.h);
            } else {
                DataClient dataClient = DataClient.this;
                dataClient.init(dataClient.c);
            }
        }
    }

    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            DataClient.this.e = IDataServiceAidl.Stub.asInterface(iBinder);
            try {
                DataClient.this.e.registerListener(DataClient.this.c.getPackageName(), DataClient.this.b);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (DataClient.this.a != null) {
                DataClient.this.a.set(false);
            }
            DataClient.this.unRegisterListener();
            TLog.pro("onServiceDisconnected:" + componentName.getPackageName());
        }
    }

    public class c extends IDataListener.Stub {
        public c() {
        }

        @Override // com.huami.watch.transdata.IDataListener
        public DataTrans getData(String str, String str2, String str3) throws RemoteException {
            if (DataClient.this.d != null) {
                return DataClient.this.d.getData(str, str2, str3);
            }
            return null;
        }

        @Override // com.huami.watch.transdata.IDataListener
        public void onDataResult(String str, String str2, String str3) throws RemoteException {
            if (DataClient.this.d != null) {
                TLog.pro("IDataListener onDataResult");
                DataClient.this.d.onDataResult(str, str2, str3);
            }
        }
    }

    public DataClient(Context context) {
        this.c = context;
        init(context);
    }

    private void g() {
        if (this.c == null) {
            TLog.pro("Context is null");
            return;
        }
        if (this.f == null) {
            this.f = new a();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(h);
        intentFilter.addAction(i);
        this.c.registerReceiver(this.f, intentFilter);
    }

    public void init(Context context) {
        if (context == null) {
            TLog.pro("I also want to do init, but context is null, so ...");
            return;
        }
        if (this.c == null) {
            this.c = context;
        }
        Intent intent = new Intent("com.huami.watch.wearservices.DATA_SERVICE");
        intent.setPackage("com.huami.watch.wearservices");
        intent.setComponent(new ComponentName("com.huami.watch.wearservices", "com.huami.watch.transdata.DataService"));
        boolean zBindService = this.c.bindService(intent, this.g, 1);
        this.a.set(zBindService);
        TLog.pro("bindService:" + zBindService);
        g();
    }

    public void onDestory() {
        BroadcastReceiver broadcastReceiver = this.f;
        if (broadcastReceiver != null) {
            this.c.unregisterReceiver(broadcastReceiver);
        }
    }

    public void registerListener(DataService.ClientListener clientListener) {
        TLog.pro("registerListener:" + this.c.getPackageName());
        this.d = clientListener;
    }

    public void triggerSync(Map map) {
        IDataServiceAidl iDataServiceAidl = this.e;
        if (iDataServiceAidl != null) {
            try {
                iDataServiceAidl.triggered(this.c.getPackageName(), map);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public void unRegisterListener() {
        IDataServiceAidl iDataServiceAidl = this.e;
        if (iDataServiceAidl != null) {
            try {
                iDataServiceAidl.unRegisterListener(this.c.getPackageName());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }
}
