package com.ingenic.iwds.devicemanager;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.ingenic.iwds.common.api.ServiceManagerContext;
import com.ingenic.iwds.utils.IwdsLog;

/* JADX INFO: loaded from: classes18.dex */
public class DeviceManagerServiceManager extends ServiceManagerContext {
    public static final String ACTION_WEAR_ON_LEFT_HAND = "iwds.devicemanager.action.wear_on_left_hand";
    public static final String ACTION_WEAR_ON_RIGHT_HAND = "iwds.devicemanager.action.wear_on_right_hand";
    private IDeviceManagerService a;

    public class a extends ServiceManagerContext.ServiceClientProxy {
        public a() {
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public IBinder getBinder() {
            return DeviceManagerServiceManager.this.a.asBinder();
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public void onServiceConnected(IBinder iBinder) {
            DeviceManagerServiceManager.this.a = IDeviceManagerService.Stub.asInterface(iBinder);
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public void onServiceDisconnected(boolean z) {
        }
    }

    public DeviceManagerServiceManager(Context context) {
        super(context);
        this.m_serviceClientProxy = new a();
    }

    public boolean isWearOnRightHand() {
        try {
            return this.a.isWearOnRightHand();
        } catch (RemoteException e) {
            IwdsLog.e(this, "Exception in isWearOnRightHand: " + e.toString());
            return false;
        }
    }

    public void setWearOnRightHand(boolean z) {
        try {
            this.a.setWearOnRightHand(z);
        } catch (RemoteException e) {
            IwdsLog.e(this, "Exception in setWearOnRightHand: " + e.toString());
        }
    }
}
