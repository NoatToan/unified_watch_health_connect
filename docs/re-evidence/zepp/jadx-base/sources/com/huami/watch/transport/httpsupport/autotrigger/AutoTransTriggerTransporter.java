package com.huami.watch.transport.httpsupport.autotrigger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;

/* JADX INFO: loaded from: classes6.dex */
public class AutoTransTriggerTransporter implements Transporter.ChannelListener, Transporter.ServiceConnectionListener, Transporter.DataListener {
    private static final String d = "TargetPackages";
    private static final String e = "com.huami.watch.companion.RequestSyncData";
    private static final String f = "trans_data";
    private static final String g = "com.huami.watch.companion.syncdata";
    private static final String[] h = {"com.huami.watch.health", "com.huami.watch.sport"};
    private static AutoTransTriggerTransporter i;
    private Context a;
    private BroadcastReceiver b;
    private Transporter c;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (TextUtils.equals(TransportDataAutomaticAlarm.TRIGGER_ACTION, intent.getAction())) {
                Log.i(AutoTransTriggerTransporter.f, "close auto blue trans already ...");
            }
        }
    }

    public class b implements Transporter.DataSendResultCallback {
        public b() {
        }

        @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
        public void onResultBack(DataTransportResult dataTransportResult) {
            String str;
            String string;
            if (dataTransportResult == null) {
                string = "trigger sync data send null result...";
            } else {
                int resultCode = dataTransportResult.getResultCode();
                StringBuilder sb = new StringBuilder();
                sb.append("trigger sync data send result:");
                if (resultCode == 0) {
                    str = "OK";
                } else {
                    str = "FAILED ,CODE:" + dataTransportResult.getResultCode();
                }
                sb.append(str);
                string = sb.toString();
            }
            Log.i(AutoTransTriggerTransporter.f, string);
        }
    }

    public AutoTransTriggerTransporter(Context context) {
        this.a = context;
        b();
        a();
    }

    private void a() {
        if (this.b == null) {
            this.b = new a();
        }
        this.a.registerReceiver(this.b, new IntentFilter(TransportDataAutomaticAlarm.TRIGGER_ACTION));
        Log.i(f, "registerReceiver");
    }

    private void b() {
        Transporter transporter = Transporter.get(this.a, "com.huami.watch.companion.syncdata");
        this.c = transporter;
        transporter.addDataListener(this);
        this.c.addChannelListener(this);
        this.c.addServiceConnectionListener(this);
        this.c.connectTransportService();
    }

    public static AutoTransTriggerTransporter getInstance(Context context) {
        if (i == null) {
            synchronized (AutoTransTriggerTransporter.class) {
                if (i == null) {
                    i = new AutoTransTriggerTransporter(context);
                }
            }
        }
        return i;
    }

    public void clear() {
        Context context;
        Transporter transporter = this.c;
        if (transporter != null) {
            transporter.removeServiceConnectionListener(this);
            this.c.removeDataListener(this);
            this.c.removeChannelListener(this);
        }
        BroadcastReceiver broadcastReceiver = this.b;
        if (broadcastReceiver != null && (context = this.a) != null) {
            context.unregisterReceiver(broadcastReceiver);
            Log.i(f, "unregisterReceiver");
        }
        i = null;
    }

    @Override // com.huami.watch.transport.Transporter.ChannelListener
    public void onChannelChanged(boolean z) {
        Log.i(f, "onChannelChanged:" + z);
    }

    @Override // com.huami.watch.transport.Transporter.DataListener
    public void onDataReceived(TransportDataItem transportDataItem) {
        Log.i(f, "onDataReceived");
    }

    @Override // com.huami.watch.transport.Transporter.ServiceConnectionListener
    public void onServiceConnected(Bundle bundle) {
        Log.i(f, "onServiceConnected");
    }

    @Override // com.huami.watch.transport.Transporter.ServiceConnectionListener
    public void onServiceConnectionFailed(Transporter.ConnectionResult connectionResult) {
        Log.i(f, "onServiceConnectionFailed");
    }

    @Override // com.huami.watch.transport.Transporter.ServiceConnectionListener
    public void onServiceDisconnected(Transporter.ConnectionResult connectionResult) {
        Log.i(f, "onServiceDisconnected");
    }

    public void sendTriggerSyncToAssist() {
        Transporter transporter = this.c;
        if (transporter == null || !transporter.isTransportServiceConnected()) {
            return;
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.putStringArray(d, h);
        this.c.send("com.huami.watch.companion.RequestSyncData", dataBundle, new b());
    }
}
