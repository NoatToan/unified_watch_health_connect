package com.ingenic.iwds.uniconnect.link;

import android.content.Context;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.utils.IwdsAssert;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes18.dex */
public abstract class Adapter {
    public static String TAG_ANDROID_BT_DATA_CHANNEL = "Android BT data channel";
    public static String TAG_BLE_DATA_CHANNEL = "BLE data channel";
    private Context a;
    private AdapterManager b;
    private LinkManager c;
    private String d;
    private ReentrantLock g = new ReentrantLock();
    private ArrayList<RemoteDevice> e = new ArrayList<>();
    private ArrayList<Link> f = new ArrayList<>();

    public interface DeviceDiscoveryCallbacks {
        void onDeviceFound(RemoteDevice remoteDevice);

        void onDiscoveryFinished();

        void onDiscoveryStarted();
    }

    public Adapter(Context context, AdapterManager adapterManager, String str) {
        this.a = context;
        this.b = adapterManager;
        this.c = adapterManager.a();
        this.d = str;
    }

    public static Adapter a(Context context, AdapterManager adapterManager, String str) {
        Adapter bleAdapter;
        if (str.equals(TAG_ANDROID_BT_DATA_CHANNEL)) {
            bleAdapter = new AndroidBtAdapter(context, adapterManager);
        } else {
            bleAdapter = str.equals(TAG_BLE_DATA_CHANNEL) ? new BleAdapter(context, adapterManager) : null;
        }
        IwdsAssert.dieIf("Adapter", bleAdapter == null, "Unsupport link type, tag: " + str);
        return bleAdapter;
    }

    public void addRemoteDevice(RemoteDevice remoteDevice) {
        this.e.add(remoteDevice);
    }

    public void b(int i, boolean z, String str) {
        this.g.lock();
        for (Link link : this.f) {
            this.g.unlock();
            if (link.isBonded() || link.isServerStarted()) {
                if (!link.isRoleAsClientSide()) {
                    link.e(i, str);
                } else if (link.getBondedAddress().equals(str)) {
                    link.e(i, str);
                }
            }
            this.g.lock();
        }
        this.g.unlock();
    }

    public abstract void cancelDiscovey();

    public void clearRemoteDevices() {
        this.e.clear();
    }

    public Link createLink(DeviceDescriptor deviceDescriptor) {
        IwdsAssert.dieIf(this, deviceDescriptor == null, "Device descriptor is null.");
        Link link = new Link(this.c, deviceDescriptor, this.d);
        this.g.lock();
        this.f.add(link);
        this.g.unlock();
        return link;
    }

    public void destroyLink(Link link) {
        if (link.isBonded() || link.isServerStarted()) {
            if (link.isRoleAsClientSide()) {
                link.unbond();
            } else {
                link.stopServer();
            }
        }
        this.g.lock();
        this.f.remove(link);
        this.g.unlock();
    }

    public abstract void disable();

    public abstract boolean enable();

    public ArrayList<String> getBondedAddressStorage() {
        ArrayList<String> arrayListF = this.c.f();
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : arrayListF) {
            if (this.c.a(str).equals(this.d)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public Context getContext() {
        return this.a;
    }

    public String getLinkTag() {
        return this.d;
    }

    public abstract String getLocalAddress();

    public ArrayList<RemoteDevice> getRemoteDevices() {
        return this.e;
    }

    public abstract boolean isEnabled();

    public abstract int startDiscovery(DeviceDiscoveryCallbacks deviceDiscoveryCallbacks);
}
