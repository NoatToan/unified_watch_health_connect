package com.huami.watch.transport;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import androidx.collection.ArrayMap;
import com.huami.watch.util.AppUtil;
import com.huami.watch.util.Config;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public class DataTransportManager {
    public static final boolean DEBUG = Config.isDebug();
    private Context b;
    private ITransportDataService c;
    private b d;
    private Intent e;
    private String f;
    private c g;
    private HmApiClient.ConnectionCallbacks h;
    private HmApiClient.OnConnectionFailedListener i;
    private final String a = "Trans-Manager";
    private ArrayMap<String, DataApi.CallbackListener> j = new ArrayMap<>();

    public class b extends Handler {
        public static final int d = 19;
        public static final int e = 87;
        public static final int f = 20;
        public static final int g = 14;
        public static final int h = 9;
        public static final int i = 0;
        public static final int j = 3;
        private int a;
        private ServiceConnection b;

        public class a implements ServiceConnection {
            public a() {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                DataTransportManager.this.c = ITransportDataService.Stub.asInterface(iBinder);
                b.this.e(iBinder);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                b.this.f();
            }
        }

        private b() {
            this.a = 0;
            this.b = new a();
        }

        public void a() {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 19;
            messageObtain.sendToTarget();
        }

        public void b() {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 87;
            messageObtain.sendToTarget();
        }

        public int c() {
            int i2;
            synchronized (this) {
                i2 = this.a;
            }
            return i2;
        }

        public void d(int i2) {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 9;
            messageObtain.obj = Integer.valueOf(i2);
            messageObtain.sendToTarget();
        }

        public void e(IBinder iBinder) {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 20;
            messageObtain.obj = iBinder;
            messageObtain.sendToTarget();
        }

        public void f() {
            Message messageObtain = Message.obtain(this);
            messageObtain.what = 14;
            messageObtain.sendToTarget();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            boolean zBindService = false;
            if (i2 == 9) {
                synchronized (this) {
                    this.a = 0;
                }
                DataTransportManager.this.i.onServicesConnectionFailed(new ConnectionResult(((Integer) message.obj).intValue()));
                return;
            }
            if (i2 == 14) {
                synchronized (this) {
                    if (this.a == 3) {
                        this.a = 0;
                    }
                }
                DataTransportManager.this.h.onServicesDisConnected(new ConnectionResult(3));
                return;
            }
            if (i2 == 87) {
                try {
                    DataTransportManager.this.c.unregistersendCallbackListener(DataTransportManager.this.g);
                    Log.d("Trans-Manager", "HmApiClient [" + this.b + "] disconnect to Transport service", new Object[0]);
                } catch (RemoteException e2) {
                    Log.e("Trans-Manager", "register callback listener error : ", e2, new Object[0]);
                }
                DataTransportManager.this.b.unbindService(this.b);
                f();
                return;
            }
            if (i2 != 19) {
                if (i2 != 20) {
                    return;
                }
                synchronized (this) {
                    this.a = 3;
                }
                DataTransportManager.this.h.onServicesConnected(new Bundle());
                try {
                    DataTransportManager.this.c.registersendCallbackListener(DataTransportManager.this.g);
                    return;
                } catch (RemoteException e3) {
                    e3.printStackTrace();
                    Log.e("Trans-Manager", "register callback list error!", new Object[0]);
                    return;
                }
            }
            try {
                Log.d("Trans-Manager", "HmApiClient [" + this.b + "] connect to Transport service", new Object[0]);
                zBindService = DataTransportManager.this.b.bindService(DataTransportManager.this.e, this.b, 1);
            } catch (Exception e4) {
                Log.e("Trans-Manager", "Failed binding to DataTransportService.", e4, new Object[0]);
            }
            if (zBindService) {
                return;
            }
            d(1);
        }
    }

    public class c extends ITransportCallbackListener.Stub {
        private c() {
        }

        @Override // com.huami.watch.transport.ITransportCallbackListener
        public void onResultBack(DataTransportResult dataTransportResult) throws RemoteException {
            String strValueOf = String.valueOf(dataTransportResult.getDataItem().getCreateTime());
            DataApi.CallbackListener callbackListener = (DataApi.CallbackListener) DataTransportManager.this.j.get(strValueOf);
            if (callbackListener != null) {
                callbackListener.onResultBack(dataTransportResult);
                DataTransportManager.this.j.remove(strValueOf);
            }
        }
    }

    public DataTransportManager(Context context, String str, HmApiClient.ConnectionCallbacks connectionCallbacks, HmApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.b = context;
        this.d = new b();
        this.h = connectionCallbacks;
        this.i = onConnectionFailedListener;
        this.e = AppUtil.createIntentFromAction(context.getPackageManager(), TransporterClassic.p);
        this.f = str;
        this.g = new c();
    }

    public static DataTransportManager getInstance(Context context) {
        return new DataTransportManager(context, null, null, null);
    }

    public void connect() {
        this.d.a();
    }

    public void disconnect() {
        this.d.b();
    }

    public boolean isConnected() {
        return this.d.c() == 3;
    }

    public void registerChannelListener(String str, ITransportChannelListener iTransportChannelListener) throws RemoteException {
        ITransportDataService iTransportDataService = this.c;
        if (iTransportDataService != null) {
            iTransportDataService.registerChannelListener(str, iTransportChannelListener);
        }
    }

    public void registerDataCallback(long j, DataApi.CallbackListener callbackListener) {
        this.j.put(String.valueOf(j), callbackListener);
    }

    public void registerDataListener(String str, ITransportDataListener iTransportDataListener) throws RemoteException {
        ITransportDataService iTransportDataService = this.c;
        if (iTransportDataService != null) {
            iTransportDataService.registerDataListener(str, iTransportDataListener);
        }
    }

    public void sendData(TransportDataItem transportDataItem) {
        if (DEBUG) {
            Log.d("Trans-Manager", "sendData uri : " + transportDataItem.getUri() + ", data : " + transportDataItem.getData(), new Object[0]);
        }
        try {
            ITransportDataService iTransportDataService = this.c;
            if (iTransportDataService != null) {
                iTransportDataService.sendData(transportDataItem);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.d("Trans-Manager", "Send Data Exception : " + e, new Object[0]);
        }
    }

    public void unregisterChannelListener(String str) throws RemoteException {
        ITransportDataService iTransportDataService = this.c;
        if (iTransportDataService != null) {
            iTransportDataService.unregisterChannelListener(str);
        }
    }

    public void unregisterDataListener(String str) throws RemoteException {
        ITransportDataService iTransportDataService = this.c;
        if (iTransportDataService != null) {
            iTransportDataService.unregisterDataListener(str);
        }
    }

    public static DataTransportManager getInstance(Context context, String str, HmApiClient.ConnectionCallbacks connectionCallbacks, HmApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new DataTransportManager(context, str, connectionCallbacks, onConnectionFailedListener);
    }
}
