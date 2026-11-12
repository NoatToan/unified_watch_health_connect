package com.huami.watch.connect;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.huami.watch.util.Log;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.uniconnect.link.Adapter;
import com.ingenic.iwds.uniconnect.link.Link;

/* JADX INFO: loaded from: classes16.dex */
public class WatchConnection extends BaseConnection {
    private static final String c = "Connection-Watch";
    private Link a;
    private final BroadcastReceiver b;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Log.d(WatchConnection.this.tag(), "Receive BT Scan Mode Changed!!", new Object[0]);
            if (!"android.bluetooth.adapter.action.SCAN_MODE_CHANGED".equals(action) || WatchConnection.this.mAdapter.getLocalAddress() == null) {
                return;
            }
            WatchConnection watchConnection = WatchConnection.this;
            watchConnection.mDescriptor = watchConnection.createDeviceDescriptor(watchConnection.mAdapter);
            WatchConnection watchConnection2 = WatchConnection.this;
            watchConnection2.mConnectable.onCreateDeviceDescription(watchConnection2.mDescriptor);
            Log.d(WatchConnection.this.tag(), "OnCreateDeviceDescription : " + WatchConnection.this.mDescriptor, new Object[0]);
            WatchConnection.this.c();
            WatchConnection.this.mAppContext.unregisterReceiver(this);
        }
    }

    public WatchConnection(@NonNull Connectable connectable) {
        super(connectable);
        this.b = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Log.i(tag(), "Link : Start Server!!", new Object[0]);
        DeviceDescriptor deviceDescriptor = this.mDescriptor;
        if (deviceDescriptor == null) {
            return;
        }
        Link linkCreateLink = this.mAdapter.createLink(deviceDescriptor);
        this.a = linkCreateLink;
        if (linkCreateLink.startServer()) {
            Log.i(tag(), "Start Server Success!!", new Object[0]);
        } else {
            Log.e(tag(), "Start Server Failed!!", new Object[0]);
        }
    }

    @Override // com.huami.watch.connect.BaseConnection
    public DeviceDescriptor createDeviceDescriptor(Adapter adapter) {
        return new DeviceDescriptor(adapter.getLocalAddress(), adapter.getLinkTag(), 0, 1);
    }

    @Override // com.huami.watch.connect.BaseConnection
    public void initBTAdapter() {
        super.initBTAdapter();
        if (BaseConnection.isAirplaneModeON(this.mAppContext)) {
            return;
        }
        Log.d(tag(), "Enable BT Adapter!!", new Object[0]);
        this.mAdapter.enable();
    }

    @Override // com.huami.watch.connect.BaseConnection
    public void initIWDS() {
        Log.i(tag(), "Init IWDS : 0, DEVICE_CLASS_WEARABLE", new Object[0]);
        this.mIwds.initialize(this.mAppContext, 0, 1);
    }

    @Override // com.huami.watch.connect.BaseConnection
    public void linkStartServerOrBond() {
        if (this.mDescriptor != null) {
            c();
        } else {
            this.mAppContext.registerReceiver(this.b, new IntentFilter("android.bluetooth.adapter.action.SCAN_MODE_CHANGED"));
        }
    }

    @Override // com.huami.watch.connect.BaseConnection
    public String tag() {
        return c;
    }
}
