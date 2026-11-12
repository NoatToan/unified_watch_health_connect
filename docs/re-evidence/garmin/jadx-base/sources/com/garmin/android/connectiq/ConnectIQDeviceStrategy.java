package com.garmin.android.connectiq;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.garmin.android.apps.connectmobile.connectiq.t0;
import com.garmin.android.connectiq.exception.InvalidStateException;
import com.garmin.android.connectiq.exception.ServiceUnavailableException;
import com.google.common.net.HttpHeaders;
import java.util.List;
import java.util.UUID;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
public class ConnectIQDeviceStrategy extends ConnectIQ {
    private boolean mBound = false;
    private ServiceConnection mConnection = new ServiceConnection() { // from class: com.garmin.android.connectiq.ConnectIQDeviceStrategy.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            t0 c0520a;
            ConnectIQDeviceStrategy connectIQDeviceStrategy = ConnectIQDeviceStrategy.this;
            int i14 = t0.a.f32021a;
            if (iBinder == null) {
                c0520a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.garmin.android.apps.connectmobile.connectiq.IConnectIQService");
                c0520a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof t0)) ? new t0.a.C0520a(iBinder) : (t0) iInterfaceQueryLocalInterface;
            }
            connectIQDeviceStrategy.mRemoteService = c0520a;
            ConnectIQDeviceStrategy.this.mBound = true;
            ConnectIQ.ConnectIQListener connectIQListener = ConnectIQDeviceStrategy.this.mListener;
            if (connectIQListener != null) {
                connectIQListener.onSdkReady();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ConnectIQDeviceStrategy.this.mRemoteService = null;
            ConnectIQDeviceStrategy.this.mBound = false;
            ConnectIQ.ConnectIQListener connectIQListener = ConnectIQDeviceStrategy.this.mListener;
            if (connectIQListener != null) {
                connectIQListener.onSdkShutDown();
            }
        }
    };
    private t0 mRemoteService;

    @Override // com.garmin.android.connectiq.ConnectIQ
    public void getApplicationInfo(String str, IQDevice iQDevice, ConnectIQ.IQApplicationInfoListener iQApplicationInfoListener) throws ServiceUnavailableException, InvalidStateException {
        verifyInitialized();
        String strReplaceAll = str.toUpperCase().replaceAll("[\\s\\-]", "");
        if (!this.mBound) {
            throw new InvalidStateException("SDK not initialized.  Did you forget to call ConnectIQ::initialize()?");
        }
        if (iQDevice == null) {
            if (iQApplicationInfoListener != null) {
                iQApplicationInfoListener.onApplicationNotInstalled(strReplaceAll);
                return;
            }
            return;
        }
        IQDeviceListenerContainer deviceListenerContainer = getMessageReceiver().getDeviceListenerContainer(iQDevice.getDeviceIdentifier());
        if (deviceListenerContainer != null) {
            deviceListenerContainer.setApplicationInfoListener(strReplaceAll, iQApplicationInfoListener);
        } else {
            IQDeviceListenerContainer iQDeviceListenerContainer = new IQDeviceListenerContainer(iQDevice.getDeviceIdentifier());
            iQDeviceListenerContainer.setApplicationInfoListener(strReplaceAll, iQApplicationInfoListener);
            getMessageReceiver().addDeviceListenerContainer(iQDevice.getDeviceIdentifier(), iQDeviceListenerContainer);
        }
        try {
            this.mRemoteService.l(this.mContext.getPackageName(), ConnectIQ.APPLICATION_INFO, iQDevice, strReplaceAll);
        } catch (RemoteException e4) {
            throw new ServiceUnavailableException(e4.getMessage());
        }
    }

    @Override // com.garmin.android.connectiq.ConnectIQ
    public List<IQDevice> getConnectedDevices() throws InvalidStateException, ServiceUnavailableException {
        verifyInitialized();
        if (!this.mBound) {
            throw new InvalidStateException("SDK not initialized.  Did you forget to call ConnectIQ::initialize()?");
        }
        try {
            return this.mRemoteService.getConnectedDevices();
        } catch (RemoteException e4) {
            throw new ServiceUnavailableException(e4.getMessage());
        }
    }

    @Override // com.garmin.android.connectiq.ConnectIQ
    public String getDevicePartNumber(IQDevice iQDevice) throws ServiceUnavailableException, InvalidStateException {
        verifyInitialized();
        if (!this.mBound) {
            throw new InvalidStateException("SDK not initialized.  Did you forget to call ConnectIQ::initialize()?");
        }
        if (iQDevice == null) {
            h.s("Device cannot be null");
            return null;
        }
        try {
            return this.mRemoteService.o(iQDevice);
        } catch (RemoteException e4) {
            throw new ServiceUnavailableException(e4.getMessage());
        }
    }

    @Override // com.garmin.android.connectiq.ConnectIQ
    public IQDevice.IQDeviceStatus getDeviceStatus(IQDevice iQDevice) throws ServiceUnavailableException, InvalidStateException {
        verifyInitialized();
        if (!this.mBound) {
            throw new InvalidStateException("SDK not initialized.  Did you forget to call ConnectIQ::initialize()?");
        }
        try {
            return IQDevice.IQDeviceStatus.values()[this.mRemoteService.J(iQDevice)];
        } catch (RemoteException e4) {
            throw new ServiceUnavailableException(e4.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            return IQDevice.IQDeviceStatus.UNKNOWN;
        }
    }

    @Override // com.garmin.android.connectiq.ConnectIQ
    public List<IQDevice> getKnownDevices() throws InvalidStateException, ServiceUnavailableException {
        verifyInitialized();
        if (!this.mBound) {
            throw new InvalidStateException("SDK not initialized.  Did you forget to call ConnectIQ::initialize()?");
        }
        try {
            return this.mRemoteService.P();
        } catch (RemoteException e4) {
            throw new ServiceUnavailableException(e4.getMessage());
        }
    }

    @Override // com.garmin.android.connectiq.ConnectIQ
    public List<IQDevice> getLinkedCompanionDevices() throws InvalidStateException, ServiceUnavailableException {
        verifyInitialized();
        if (!this.mBound) {
            throw new InvalidStateException("SDK not initialized.  Did you forget to call ConnectIQ::initialize()?");
        }
        try {
            return this.mRemoteService.r();
        } catch (RemoteException e4) {
            throw new ServiceUnavailableException(e4.getMessage());
        }
    }

    @Override // com.garmin.android.connectiq.ConnectIQ
    public void initialize(Context context, boolean z14, ConnectIQ.ConnectIQListener connectIQListener) {
        super.initialize(context, z14, connectIQListener);
        try {
            if (this.mContext.getPackageManager().getPackageInfo("com.garmin.android.apps.connectmobile", 0).versionCode >= 10347) {
                Intent intent = new Intent("com.garmin.android.apps.connectmobile.CONNECTIQ_SERVICE_ACTION");
                intent.setComponent(new ComponentName("com.garmin.android.apps.connectmobile", "com.garmin.android.apps.connectmobile.connectiq.ConnectIQService"));
                this.mContext.bindService(intent, this.mConnection, 1);
                return;
            }
            ConnectIQ.ConnectIQListener connectIQListener2 = this.mListener;
            if (connectIQListener2 != null) {
                connectIQListener2.onInitializeError(ConnectIQ.IQSdkErrorStatus.GCM_UPGRADE_NEEDED);
            }
            if (z14) {
                String packageName = this.mContext.getPackageName();
                Resources resources = this.mContext.getResources();
                int identifier = resources.getIdentifier("upgrade_needed_title", "string", packageName);
                int identifier2 = resources.getIdentifier("upgrade_needed_message", "string", packageName);
                int identifier3 = resources.getIdentifier("upgrade_cancel", "string", packageName);
                int identifier4 = resources.getIdentifier("upgrade_yes", "string", packageName);
                String string = HttpHeaders.UPGRADE;
                String string2 = identifier != 0 ? this.mContext.getString(identifier) : "Upgrade Needed";
                String string3 = identifier2 != 0 ? this.mContext.getString(identifier2) : "An upgrade to Garmin Connect Mobile is required to use this application. Would you like to upgrade now?";
                String string4 = identifier3 != 0 ? this.mContext.getString(identifier3) : "Cancel";
                if (identifier4 != 0) {
                    string = this.mContext.getString(identifier4);
                }
                displayGCMDialog(string2, string3, string4, string);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            if (z14) {
                String packageName2 = this.mContext.getPackageName();
                Resources resources2 = this.mContext.getResources();
                int identifier5 = resources2.getIdentifier("install_needed_title", "string", packageName2);
                int identifier6 = resources2.getIdentifier("install_needed_message", "string", packageName2);
                int identifier7 = resources2.getIdentifier("install_cancel", "string", packageName2);
                int identifier8 = resources2.getIdentifier("install_yes", "string", packageName2);
                displayGCMDialog(identifier5 != 0 ? this.mContext.getString(identifier5) : "Additional App Required", identifier6 != 0 ? this.mContext.getString(identifier6) : "Garmin Connect Mobile is required to use this application. Would you like to install it now?", identifier7 != 0 ? this.mContext.getString(identifier7) : "Cancel", identifier8 != 0 ? this.mContext.getString(identifier8) : "Yes");
            }
            ConnectIQ.ConnectIQListener connectIQListener3 = this.mListener;
            if (connectIQListener3 != null) {
                connectIQListener3.onInitializeError(ConnectIQ.IQSdkErrorStatus.GCM_NOT_INSTALLED);
            }
            super.initialize(context, z14, connectIQListener);
        }
    }

    @Override // com.garmin.android.connectiq.ConnectIQ
    public void openApplication(IQDevice iQDevice, IQApp iQApp, ConnectIQ.IQOpenApplicationListener iQOpenApplicationListener) throws ServiceUnavailableException, InvalidStateException {
        verifyInitialized();
        if (!this.mBound) {
            throw new InvalidStateException("SDK not initialized.  Did you forget to call ConnectIQ::initialize()?");
        }
        if (iQDevice == null) {
            if (iQOpenApplicationListener != null) {
                iQOpenApplicationListener.onOpenApplicationResponse(iQDevice, iQApp, ConnectIQ.IQOpenApplicationStatus.APP_IS_NOT_INSTALLED);
                return;
            }
            return;
        }
        IQDeviceListenerContainer deviceListenerContainer = getMessageReceiver().getDeviceListenerContainer(iQDevice.getDeviceIdentifier());
        if (deviceListenerContainer != null) {
            deviceListenerContainer.setOpenApplicationListener(iQApp.getApplicationId(), iQOpenApplicationListener);
        } else {
            IQDeviceListenerContainer iQDeviceListenerContainer = new IQDeviceListenerContainer(iQDevice.getDeviceIdentifier());
            iQDeviceListenerContainer.setOpenApplicationListener(iQApp.getApplicationId(), iQOpenApplicationListener);
            getMessageReceiver().addDeviceListenerContainer(iQDevice.getDeviceIdentifier(), iQDeviceListenerContainer);
        }
        try {
            this.mRemoteService.x(this.mContext.getPackageName(), ConnectIQ.OPEN_APPLICATION, iQDevice, iQApp);
        } catch (RemoteException e4) {
            throw new ServiceUnavailableException(e4.getMessage());
        }
    }

    @Override // com.garmin.android.connectiq.ConnectIQ
    public boolean openStore(String str) throws ServiceUnavailableException, InvalidStateException {
        verifyInitialized();
        if (!this.mBound) {
            throw new InvalidStateException("SDK not initialized.  Did you forget to call ConnectIQ::initialize()?");
        }
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    if (!str.contains("-")) {
                        str = str.replaceAll("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})", "$1-$2-$3-$4-$5");
                    }
                    return this.mRemoteService.F(UUID.fromString(str).toString());
                }
            } catch (RemoteException e4) {
                throw new ServiceUnavailableException(e4.getMessage());
            }
        }
        return this.mRemoteService.F(null);
    }

    @Override // com.garmin.android.connectiq.ConnectIQ
    public void registerAppWithBindingService(String str) throws InvalidStateException, ServiceUnavailableException {
        verifyInitialized();
        if (!this.mBound) {
            throw new InvalidStateException("SDK not initialized.  Did you forget to call ConnectIQ::initialize()?");
        }
        try {
            this.mRemoteService.e0(str, this.mContext.getPackageName(), "com.garmin.android.connectiq.GARMIN_BINDING_SERVICE_ACTION");
        } catch (RemoteException e4) {
            throw new ServiceUnavailableException(e4.getMessage());
        }
    }

    @Override // com.garmin.android.connectiq.ConnectIQ
    public void registerForRemoteAppEvents(IQApp iQApp) throws InvalidStateException, ServiceUnavailableException {
        verifyInitialized();
        if (!this.mBound) {
            throw new InvalidStateException("SDK not initialized.  Did you forget to call ConnectIQ::initialize()?");
        }
        try {
            this.mRemoteService.X(iQApp, ConnectIQ.INCOMING_MESSAGE, this.mContext.getPackageName());
        } catch (RemoteException e4) {
            throw new ServiceUnavailableException(e4.getMessage());
        }
    }

    @Override // com.garmin.android.connectiq.ConnectIQ
    public void sendImageProtocol(IQDevice iQDevice, IQApp iQApp, byte[] bArr, ConnectIQ.IQSendImageListener iQSendImageListener) {
        throw new UnsupportedOperationException();
    }

    @Override // com.garmin.android.connectiq.ConnectIQ
    public void sendMessageProtocol(IQDevice iQDevice, IQApp iQApp, byte[] bArr, ConnectIQ.IQSendMessageListener iQSendMessageListener, boolean z14) throws ServiceUnavailableException, InvalidStateException {
        verifyInitialized();
        if (!this.mBound) {
            throw new InvalidStateException("SDK not initialized.  Did you forget to call ConnectIQ::initialize()?");
        }
        if (iQDevice == null) {
            if (iQSendMessageListener != null) {
                iQSendMessageListener.onMessageStatus(iQDevice, iQApp, ConnectIQ.IQMessageStatus.FAILURE_INVALID_DEVICE);
                return;
            }
            return;
        }
        IQDeviceListenerContainer deviceListenerContainer = getMessageReceiver().getDeviceListenerContainer(iQDevice.getDeviceIdentifier());
        if (deviceListenerContainer != null) {
            deviceListenerContainer.setSendMessageListener(iQApp.getApplicationId(), iQSendMessageListener);
        } else {
            IQDeviceListenerContainer iQDeviceListenerContainer = new IQDeviceListenerContainer(iQDevice.getDeviceIdentifier());
            iQDeviceListenerContainer.setSendMessageListener(iQApp.getApplicationId(), iQSendMessageListener);
            getMessageReceiver().addDeviceListenerContainer(iQDevice.getDeviceIdentifier(), iQDeviceListenerContainer);
        }
        IQMessage iQMessage = new IQMessage(bArr, this.mContext.getPackageName(), ConnectIQ.SEND_MESSAGE_STATUS);
        t0 t0Var = this.mRemoteService;
        try {
            if (z14) {
                t0Var.M(iQMessage, iQDevice, iQApp);
            } else {
                t0Var.f0(iQMessage, iQDevice, iQApp);
            }
        } catch (RemoteException e4) {
            throw new ServiceUnavailableException(e4.getMessage());
        }
    }

    @Override // com.garmin.android.connectiq.ConnectIQ
    public void shutdown(Context context) {
        super.shutdown(context);
        if (this.mBound) {
            this.mContext.unbindService(this.mConnection);
        }
    }

    @Override // com.garmin.android.connectiq.ConnectIQ
    public void unregisterAppWithBindingService(String str) throws InvalidStateException, ServiceUnavailableException {
        verifyInitialized();
        if (!this.mBound) {
            throw new InvalidStateException("SDK not initialized.  Did you forget to call ConnectIQ::initialize()?");
        }
        try {
            this.mRemoteService.O(str, this.mContext.getPackageName());
        } catch (RemoteException e4) {
            throw new ServiceUnavailableException(e4.getMessage());
        }
    }

    @Override // com.garmin.android.connectiq.ConnectIQ
    public void unregisterForRemoteAppEvents(IQApp iQApp) throws InvalidStateException, ServiceUnavailableException {
        verifyInitialized();
        if (!this.mBound) {
            throw new InvalidStateException("SDK not initialized.  Did you forget to call ConnectIQ::initialize()?");
        }
        try {
            this.mRemoteService.a0(iQApp, this.mContext.getPackageName());
        } catch (RemoteException e4) {
            throw new ServiceUnavailableException(e4.getMessage());
        }
    }
}
