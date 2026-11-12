package com.huami.watch.connect;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huami.watch.util.Log;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.uniconnect.link.Adapter;
import com.ingenic.iwds.uniconnect.link.Link;
import com.ingenic.iwds.uniconnect.link.RemoteDevice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class PhoneConnection extends BaseConnection {
    private static final String c = "Connection-Phone";
    private final List<Link> a;
    private final BroadcastReceiver b;

    public class a implements Adapter.DeviceDiscoveryCallbacks {
        public a() {
        }

        @Override // com.ingenic.iwds.uniconnect.link.Adapter.DeviceDiscoveryCallbacks
        public void onDeviceFound(RemoteDevice remoteDevice) {
            Log.d(PhoneConnection.c, "OnDeviceFound : " + remoteDevice, new Object[0]);
        }

        @Override // com.ingenic.iwds.uniconnect.link.Adapter.DeviceDiscoveryCallbacks
        public void onDiscoveryFinished() {
            Log.d(PhoneConnection.c, "OnDiscoveryFinished!!", new Object[0]);
        }

        @Override // com.ingenic.iwds.uniconnect.link.Adapter.DeviceDiscoveryCallbacks
        public void onDiscoveryStarted() {
            Log.d(PhoneConnection.c, "OnDiscoveryStarted!!", new Object[0]);
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Log.d(PhoneConnection.this.tag(), "Receive BT State Changed!!", new Object[0]);
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action) && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) == 12) {
                Log.d(PhoneConnection.this.tag(), "Receive BT State Changed : ON!!", new Object[0]);
                PhoneConnection.super.initBTLink();
                PhoneConnection.this.d();
                PhoneConnection.this.mAppContext.unregisterReceiver(this);
            }
        }
    }

    public PhoneConnection(Connectable connectable) {
        super(connectable);
        this.a = new ArrayList();
        this.b = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        ArrayList<String> bondedAddresses = getBondedAddresses();
        Log.d(c, "Bind Saved Addresses: " + bondedAddresses, new Object[0]);
        if (bondedAddresses != null) {
            synchronized (this.a) {
                for (String str : bondedAddresses) {
                    Link linkCreateLink = this.mAdapter.createLink(this.mDescriptor);
                    boolean zBondAddress = linkCreateLink.bondAddress(str);
                    if (zBondAddress) {
                        this.a.add(linkCreateLink);
                    }
                    Log.d(c, "Bind <" + str + ">, Success: " + zBondAddress, new Object[0]);
                }
            }
        }
    }

    private Link e(String str) {
        Link link = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.a) {
            for (Link link2 : this.a) {
                if (str.equalsIgnoreCase(link2.getBondedAddress())) {
                    link = link2;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Find Link <");
        sb.append(str);
        sb.append(">: ");
        sb.append(link);
        sb.append(", IsBonded: ");
        sb.append(link != null && link.isBonded());
        Log.d(c, sb.toString(), new Object[0]);
        return link;
    }

    private List<Link> f() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    private void g(Link link) {
        if (link == null || !link.isBonded()) {
            return;
        }
        Log.d(c, "Unbind Link: " + link, new Object[0]);
        link.unbond();
        this.mAdapter.destroyLink(link);
        synchronized (this.a) {
            this.a.remove(link);
        }
    }

    public boolean bind(String str) {
        if (this.mDescriptor == null) {
            return false;
        }
        Link linkE = e(str);
        if (linkE == null) {
            linkE = this.mAdapter.createLink(this.mDescriptor);
        }
        boolean zIsBonded = linkE.isBonded();
        if (zIsBonded) {
            Log.d(c, "Bind: <" + str + ">, Already Bonded!!", new Object[0]);
        } else {
            zIsBonded = linkE.bondAddress(str);
            Log.d(c, "Bind: <" + str + ">, Success: " + zIsBonded, new Object[0]);
        }
        if (zIsBonded) {
            synchronized (this.a) {
                if (!this.a.contains(linkE)) {
                    this.a.add(linkE);
                }
            }
        }
        return zIsBonded;
    }

    @Override // com.huami.watch.connect.BaseConnection
    public DeviceDescriptor createDeviceDescriptor(Adapter adapter) {
        return new DeviceDescriptor(adapter.getLocalAddress(), adapter.getLinkTag(), 2, 1);
    }

    public ArrayList<String> getBondedAddresses() {
        Adapter adapter = this.mAdapter;
        if (adapter == null) {
            return null;
        }
        return adapter.getBondedAddressStorage();
    }

    @Override // com.huami.watch.connect.BaseConnection
    public void initBTLink() {
        if (isBluetoothOn()) {
            super.initBTLink();
        } else {
            this.mAppContext.registerReceiver(this.b, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
    }

    @Override // com.huami.watch.connect.BaseConnection
    public void initIWDS() {
        Log.i(tag(), "Init IWDS : 2, DEVICE_CLASS_MOBILE", new Object[0]);
        this.mIwds.initialize(this.mAppContext, 2, 1);
    }

    public boolean isConnected(String str) {
        Link linkE = e(str);
        boolean z = linkE != null && linkE.getState() == 1;
        Log.d(tag(), "IsConnected : " + str + ", " + z, new Object[0]);
        return z;
    }

    @Override // com.huami.watch.connect.BaseConnection
    public void linkStartServerOrBond() {
    }

    public void startDiscovery() {
        this.mAdapter.startDiscovery(new a());
    }

    @Override // com.huami.watch.connect.BaseConnection
    public String tag() {
        return c;
    }

    public void unbind(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Link linkE = e(str);
        Log.d(c, "Unbind <" + str + ">: " + linkE, new Object[0]);
        g(linkE);
    }

    public void unbindAll() {
        Log.d(c, "Unbind All: " + Arrays.toString(this.a.toArray()), new Object[0]);
        synchronized (this.a) {
            Iterator<Link> it2 = this.a.iterator();
            while (it2.hasNext()) {
                g(it2.next());
            }
            this.a.clear();
        }
    }
}
