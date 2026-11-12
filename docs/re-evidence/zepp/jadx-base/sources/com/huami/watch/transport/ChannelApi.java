package com.huami.watch.transport;

import android.os.RemoteException;
import com.huami.watch.util.Config;
import com.huami.watch.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class ChannelApi {
    public static final boolean DEBUG = Config.isDebug();
    private static ChannelApi d = null;
    private static final String e = "ChannelApi";
    private ArrayList<ChannelListener> a = new ArrayList<>();
    private ITransportChannelListener b = new b();
    private boolean c = false;

    public interface ChannelListener {
        void onChannelChanged(boolean z);
    }

    public class b extends ITransportChannelListener.Stub {
        private b() {
        }

        @Override // com.huami.watch.transport.ITransportChannelListener
        public void onChannelChanged(boolean z) throws RemoteException {
            Iterator it2 = ChannelApi.this.a.iterator();
            while (it2.hasNext()) {
                ((ChannelListener) it2.next()).onChannelChanged(z);
            }
        }
    }

    public static ChannelApi getInstance() {
        if (d == null) {
            d = new ChannelApi();
        }
        return d;
    }

    public Status addListener(HmApiClient hmApiClient, ChannelListener channelListener) {
        if (!this.c) {
            try {
                hmApiClient.getManager().registerChannelListener(hmApiClient.getModuleName(), this.b);
                this.c = true;
            } catch (RemoteException unused) {
                Log.e(e, "register Channel listener for [" + hmApiClient.getModuleName() + "] error", new Object[0]);
                this.c = false;
                return new Status(0);
            }
        }
        this.a.add(channelListener);
        if (DEBUG) {
            Log.d(e, "ChannelApi addListener for [" + hmApiClient.getModuleName() + "] Listenerlist size = " + this.a.size(), new Object[0]);
        }
        return new Status(1);
    }

    public void removeListener(HmApiClient hmApiClient, ChannelListener channelListener) {
        if (this.a.contains(channelListener)) {
            this.a.remove(channelListener);
            if (DEBUG) {
                Log.d(e, "ChannelApi removeListener for [" + hmApiClient.getModuleName() + "] Listenerlist size = " + this.a.size(), new Object[0]);
            }
        }
        if (this.a.size() == 0) {
            try {
                hmApiClient.getManager().unregisterChannelListener(hmApiClient.getModuleName());
            } catch (RemoteException unused) {
                Log.e(e, "register Channel listener for [" + hmApiClient.getModuleName() + "] error", new Object[0]);
            }
            this.c = false;
        }
    }
}
