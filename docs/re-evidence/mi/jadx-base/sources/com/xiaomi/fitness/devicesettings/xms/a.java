package com.xiaomi.fitness.devicesettings.xms;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.xms.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0539a extends Binder implements a {
        static final int TRANSACTION_checkDeviceConnectStatus = 7;
        static final int TRANSACTION_getDeviceBattery = 5;
        static final int TRANSACTION_jumpToMiHealthPage = 6;
        static final int TRANSACTION_startFindDevice = 1;
        static final int TRANSACTION_stopFindDevice = 2;
        static final int TRANSACTION_subscribeFindDevice = 3;
        static final int TRANSACTION_unsubscribeFindDevice = 4;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.xms.a$a$a, reason: collision with other inner class name */
        public static class C0540a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f12054a;

            public C0540a(IBinder iBinder) {
                this.f12054a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12054a;
            }
        }

        public AbstractBinderC0539a() {
            attachInterface(this, "com.xiaomi.fitness.devicesettings.xms.IDeviceSettingsApi");
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.devicesettings.xms.IDeviceSettingsApi");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0540a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.devicesettings.xms.IDeviceSettingsApi");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.devicesettings.xms.IDeviceSettingsApi");
                return true;
            }
            switch (i) {
                case 1:
                    startFindDevice(parcel.readString(), b.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    stopFindDevice(parcel.readString(), b.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    subscribeFindDevice(parcel.readString(), c.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    unsubscribeFindDevice(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    String deviceBattery = getDeviceBattery(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(deviceBattery);
                    return true;
                case 6:
                    jumpToMiHealthPage();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    int iCheckDeviceConnectStatus = checkDeviceConnectStatus(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iCheckDeviceConnectStatus);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    int checkDeviceConnectStatus(String str) throws RemoteException;

    String getDeviceBattery(String str) throws RemoteException;

    void jumpToMiHealthPage() throws RemoteException;

    void startFindDevice(String str, b bVar) throws RemoteException;

    void stopFindDevice(String str, b bVar) throws RemoteException;

    void subscribeFindDevice(String str, c cVar) throws RemoteException;

    void unsubscribeFindDevice(String str) throws RemoteException;
}
