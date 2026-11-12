package com.huami.watch.transport;

import android.os.RemoteException;
import androidx.collection.ArrayMap;
import com.huami.watch.util.Config;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public class DataApi {
    public static final boolean DEBUG = Config.isDebug();
    private static DataApi d = null;
    private static final String e = "DataApi";
    private ArrayMap<String, DataListener> a = new ArrayMap<>();
    private boolean c = false;
    private ITransportDataListener b = new b();

    public interface CallbackListener {
        void onResultBack(DataTransportResult dataTransportResult);
    }

    public interface DataListener {
        void onDataReceived(TransportDataItem transportDataItem);
    }

    public class b extends ITransportDataListener.Stub {
        private b() {
        }

        @Override // com.huami.watch.transport.ITransportDataListener
        public void onDataReceived(TransportDataItem transportDataItem) throws RemoteException {
            DataListener dataListener = (DataListener) DataApi.this.a.get(transportDataItem.getModuleName());
            if (dataListener != null) {
                dataListener.onDataReceived(transportDataItem);
            }
        }
    }

    public static DataApi getInstance() {
        if (d == null) {
            d = new DataApi();
        }
        return d;
    }

    public Status addListener(HmApiClient hmApiClient, DataListener dataListener) {
        if (!this.c) {
            try {
                hmApiClient.getManager().registerDataListener(hmApiClient.getModuleName(), this.b);
                this.c = true;
            } catch (RemoteException unused) {
                Log.e(e, "register Data listener for [" + hmApiClient.getModuleName() + "] error", new Object[0]);
                this.c = false;
                return new Status(0);
            }
        }
        this.a.put(hmApiClient.getModuleName(), dataListener);
        if (DEBUG) {
            Log.d(e, "DataApi addListener for [" + hmApiClient.getModuleName() + "] Listenerlist size = " + this.a.size(), new Object[0]);
        }
        return new Status(1);
    }

    public void removeListener(HmApiClient hmApiClient, DataListener dataListener) {
        if (this.a.containsKey(hmApiClient.getModuleName())) {
            this.a.remove(hmApiClient.getModuleName());
            if (DEBUG) {
                Log.d(e, "DataApi removeListener for [" + hmApiClient.getModuleName() + "] Listenerlist size = " + this.a.size(), new Object[0]);
            }
        }
        if (this.a.size() == 0) {
            try {
                hmApiClient.getManager().unregisterDataListener(hmApiClient.getModuleName());
            } catch (RemoteException unused) {
                Log.e(e, "register Data listener for [" + hmApiClient.getModuleName() + "] error", new Object[0]);
            }
            this.c = false;
        }
    }

    public void sendData(HmApiClient hmApiClient, TransportDataItem transportDataItem, CallbackListener callbackListener) {
        if (callbackListener != null) {
            hmApiClient.getManager().registerDataCallback(transportDataItem.getCreateTime(), callbackListener);
        }
        hmApiClient.getManager().sendData(transportDataItem);
    }
}
