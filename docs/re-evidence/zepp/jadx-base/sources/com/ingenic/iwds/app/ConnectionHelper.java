package com.ingenic.iwds.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.common.api.ConnectFailedReason;
import com.ingenic.iwds.common.api.ServiceClient;
import com.ingenic.iwds.common.api.ServiceManagerContext;
import com.ingenic.iwds.uniconnect.ConnectionServiceManager;
import com.ingenic.iwds.utils.IwdsAssert;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
public abstract class ConnectionHelper implements ServiceClient.ConnectionCallbacks {
    private ConnectionServiceManager m_connectionService;
    private Context m_context;
    private ArrayList<DeviceDescriptor> m_devices;
    private IntentFilter m_filter = new IntentFilter();
    private BroadcastReceiver m_receiver = new a();
    private ServiceClient m_serviceClient;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(ConnectionServiceManager.ACTION_CONNECTED_ADDRESS)) {
                ConnectionHelper.this.handleConnectedDevice((DeviceDescriptor) intent.getParcelableExtra("DeviceDescriptor"));
            } else if (intent.getAction().equals(ConnectionServiceManager.ACTION_DISCONNECTED_ADDRESS)) {
                ConnectionHelper.this.handleDisconnectedDevice((DeviceDescriptor) intent.getParcelableExtra("DeviceDescriptor"));
            }
        }
    }

    public ConnectionHelper(Context context) {
        IwdsAssert.dieIf(this, context == null, "Context is null.");
        Context applicationContext = context.getApplicationContext();
        this.m_context = applicationContext;
        IwdsAssert.dieIf(this, applicationContext == null, "Application context is null");
        this.m_devices = new ArrayList<>();
        this.m_serviceClient = new ServiceClient(this.m_context, ServiceManagerContext.SERVICE_CONNECTION, this);
        this.m_filter.addAction(ConnectionServiceManager.ACTION_CONNECTED_ADDRESS);
        this.m_filter.addAction(ConnectionServiceManager.ACTION_DISCONNECTED_ADDRESS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleConnectedDevice(DeviceDescriptor deviceDescriptor) {
        if (this.m_devices.contains(deviceDescriptor)) {
            return;
        }
        this.m_devices.add(deviceDescriptor);
        onConnectedDevice(deviceDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleDisconnectedDevice(DeviceDescriptor deviceDescriptor) {
        if (this.m_devices.remove(deviceDescriptor)) {
            onDisconnectedDevice(deviceDescriptor);
        }
    }

    public boolean isStarted() {
        return this.m_serviceClient.isConnected();
    }

    @Override // com.ingenic.iwds.common.api.ServiceClient.ConnectionCallbacks
    public void onConnectFailed(ServiceClient serviceClient, ConnectFailedReason connectFailedReason) {
        IwdsAssert.dieIf((Object) this, true, "Failed to connect to ConnectionService: " + connectFailedReason.toString());
    }

    @Override // com.ingenic.iwds.common.api.ServiceClient.ConnectionCallbacks
    public void onConnected(ServiceClient serviceClient) {
        boolean z;
        if (this.m_connectionService != null) {
            return;
        }
        ConnectionServiceManager connectionServiceManager = (ConnectionServiceManager) this.m_serviceClient.getServiceManagerContext();
        this.m_connectionService = connectionServiceManager;
        onServiceConnected(connectionServiceManager);
        this.m_context.registerReceiver(this.m_receiver, this.m_filter);
        DeviceDescriptor[] connectedDeviceDescriptors = this.m_connectionService.getConnectedDeviceDescriptors();
        ArrayList<DeviceDescriptor> arrayList = (ArrayList) this.m_devices.clone();
        int length = connectedDeviceDescriptors == null ? 0 : connectedDeviceDescriptors.length;
        for (DeviceDescriptor deviceDescriptor : arrayList) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else {
                    if (connectedDeviceDescriptors[i].equals(deviceDescriptor)) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            if (!z) {
                handleDisconnectedDevice(deviceDescriptor);
            }
        }
        if (connectedDeviceDescriptors == null) {
            return;
        }
        for (DeviceDescriptor deviceDescriptor2 : connectedDeviceDescriptors) {
            handleConnectedDevice(deviceDescriptor2);
        }
    }

    public abstract void onConnectedDevice(DeviceDescriptor deviceDescriptor);

    @Override // com.ingenic.iwds.common.api.ServiceClient.ConnectionCallbacks
    public void onDisconnected(ServiceClient serviceClient, boolean z) {
        if (this.m_connectionService != null) {
            this.m_context.unregisterReceiver(this.m_receiver);
            this.m_connectionService = null;
            Iterator<DeviceDescriptor> it2 = this.m_devices.iterator();
            while (it2.hasNext()) {
                onDisconnectedDevice(it2.next());
            }
            this.m_devices.clear();
        }
        onServiceDisconnected(z);
    }

    public abstract void onDisconnectedDevice(DeviceDescriptor deviceDescriptor);

    public abstract void onServiceConnected(ConnectionServiceManager connectionServiceManager);

    public abstract void onServiceDisconnected(boolean z);

    public void start() {
        this.m_serviceClient.connect();
    }

    public void stop() {
        this.m_serviceClient.disconnect();
    }
}
