package com.huami.watch.transdata;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.huami.watch.transdata.transport.DataTransporter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes16.dex */
public class DataService extends Service {
    private DataBinder a = new DataBinder();
    private DataTransporter b;

    public interface ClientListener {
        DataTrans getData(String str, String str2, String str3);

        void onDataResult(String str, String str2, String str3);
    }

    public class DataBinder extends IDataServiceAidl.Stub {
        private ConcurrentHashMap<String, IDataListener> e;

        public class a implements IBinder.DeathRecipient {
            public final /* synthetic */ String b;

            public a(String str) {
                this.b = str;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                IDataListener iDataListener = (IDataListener) DataBinder.this.e.remove(this.b);
                if (iDataListener != null && iDataListener.asBinder() != null) {
                    iDataListener.asBinder().unlinkToDeath(this, 0);
                }
                TLog.pro("linkToDeath:IDataListener");
            }
        }

        public DataBinder() {
        }

        private void b(String str, Map map) {
            if (DataService.this.b == null) {
                return;
            }
            DataService.this.b.sendTrigger(str);
        }

        public ConcurrentHashMap<String, IDataListener> getDataListener() {
            return this.e;
        }

        @Override // com.huami.watch.transdata.IDataServiceAidl
        public void registerListener(String str, IDataListener iDataListener) throws RemoteException {
            TLog.pro("registerListener by " + str);
            if (this.e == null) {
                this.e = new ConcurrentHashMap<>();
            }
            iDataListener.asBinder().linkToDeath(new a(str), 0);
            this.e.put(str, iDataListener);
            if (DataService.this.b != null) {
                DataService.this.b.registerNew(str);
            }
        }

        @Override // com.huami.watch.transdata.IDataServiceAidl
        public void triggered(String str, Map map) throws RemoteException {
            TLog.pro("triggered by " + str);
            b(str, map);
        }

        @Override // com.huami.watch.transdata.IDataServiceAidl
        public void unRegisterListener(String str) throws RemoteException {
            ConcurrentHashMap<String, IDataListener> concurrentHashMap = this.e;
            if (concurrentHashMap != null) {
                concurrentHashMap.remove(str);
            }
        }
    }

    private void b() {
        sendBroadcast(new Intent("com.huami.watch.DATA_SERVICE_CONNECTED_ACTION"));
    }

    private void c() {
        sendBroadcast(new Intent("com.huami.watch.DATA_SERVICE_DISCONNECTED_ACTION"));
    }

    public IDataListener getClientForPkg(String str) {
        DataBinder dataBinder = this.a;
        if (dataBinder == null || dataBinder.getDataListener() == null) {
            return null;
        }
        return this.a.getDataListener().get(str);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        TLog.pro("on bind ..");
        return this.a;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        TLog.pro("on create ..");
        if (this.b == null) {
            this.b = new DataTransporter(this);
        }
        b();
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        TLog.pro("on TaskRemoved ..");
    }
}
