package com.ingenic.iwds.uniconnect;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.common.api.ServiceManagerContext;
import com.ingenic.iwds.utils.IwdsAssert;
import com.ingenic.iwds.utils.IwdsLog;

/* JADX INFO: loaded from: classes18.dex */
public class ConnectionServiceManager extends ServiceManagerContext {
    public static final String ACTION_CONNECTED_ADDRESS = "iwds.uniconnect.action.connected_address";
    public static final String ACTION_DISCONNECTED_ADDRESS = "iwds.uniconnect.action.disconnected_address";
    private IConnectionService a;

    public class a extends ServiceManagerContext.ServiceClientProxy {
        public a() {
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public IBinder getBinder() {
            return ConnectionServiceManager.this.a.asBinder();
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public void onServiceConnected(IBinder iBinder) {
            ConnectionServiceManager.this.a = IConnectionService.Stub.asInterface(iBinder);
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public void onServiceDisconnected(boolean z) {
        }
    }

    public class b extends IConnectionCallBack.Stub {
        public b() {
        }

        @Override // com.ingenic.iwds.uniconnect.IConnectionCallBack
        public void stateChanged(int i, int i2) throws RemoteException {
        }
    }

    public ConnectionServiceManager(Context context) {
        super(context);
        this.m_serviceClientProxy = new a();
    }

    private Connection a(IConnectionCallBack iConnectionCallBack) {
        IwdsAssert.dieIf(this, iConnectionCallBack == null, "Connection callback is null.");
        try {
            return new Connection(getContext(), this.a.createConnection(iConnectionCallBack));
        } catch (RemoteException e) {
            IwdsLog.e(this, "Exception in createConnection: " + e);
            return null;
        }
    }

    public Connection createConnection() {
        return a(new b());
    }

    public DeviceDescriptor[] getConnectedDeviceDescriptors() {
        try {
            return this.a.getConnectedDeviceDescriptors();
        } catch (RemoteException e) {
            IwdsLog.e(this, "Exception in getConnectedDeviceDescriptors: " + e);
            return null;
        }
    }
}
