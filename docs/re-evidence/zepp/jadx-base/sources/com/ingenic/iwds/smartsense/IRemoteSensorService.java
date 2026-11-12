package com.ingenic.iwds.smartsense;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public interface IRemoteSensorService extends IInterface {

    public static abstract class Stub extends Binder implements IRemoteSensorService {
        private static final String DESCRIPTOR = "com.ingenic.iwds.smartsense.IRemoteSensorService";
        public static final int TRANSACTION_getDefaultSensor = 4;
        public static final int TRANSACTION_getSensorList = 3;
        public static final int TRANSACTION_registerListener = 5;
        public static final int TRANSACTION_registerRemoteSensorListener = 1;
        public static final int TRANSACTION_unregisterListener = 6;
        public static final int TRANSACTION_unregisterRemoteSensorListener = 2;

        public static class Proxy implements IRemoteSensorService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.ingenic.iwds.smartsense.IRemoteSensorService
            public Sensor getDefaultSensor(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? Sensor.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.ingenic.iwds.smartsense.IRemoteSensorService
            public List<Sensor> getSensorList() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(Sensor.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.smartsense.IRemoteSensorService
            public boolean registerListener(String str, IRemoteSensorEventCallback iRemoteSensorEventCallback, Sensor sensor, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iRemoteSensorEventCallback != null ? iRemoteSensorEventCallback.asBinder() : null);
                    if (sensor != null) {
                        parcelObtain.writeInt(1);
                        sensor.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.smartsense.IRemoteSensorService
            public boolean registerRemoteSensorListener(String str, IRemoteSensorCallback iRemoteSensorCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iRemoteSensorCallback != null ? iRemoteSensorCallback.asBinder() : null);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.smartsense.IRemoteSensorService
            public void unregisterListener(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.smartsense.IRemoteSensorService
            public void unregisterRemoteSensorListener(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemoteSensorService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRemoteSensorService)) ? new Proxy(iBinder) : (IRemoteSensorService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zRegisterRemoteSensorListener = registerRemoteSensorListener(parcel.readString(), IRemoteSensorCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterRemoteSensorListener ? 1 : 0);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    unregisterRemoteSensorListener(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<Sensor> sensorList = getSensorList();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(sensorList);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    Sensor defaultSensor = getDefaultSensor(parcel.readInt());
                    parcel2.writeNoException();
                    if (defaultSensor != null) {
                        parcel2.writeInt(1);
                        defaultSensor.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zRegisterListener = registerListener(parcel.readString(), IRemoteSensorEventCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0 ? Sensor.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterListener ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    unregisterListener(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    Sensor getDefaultSensor(int i) throws RemoteException;

    List<Sensor> getSensorList() throws RemoteException;

    boolean registerListener(String str, IRemoteSensorEventCallback iRemoteSensorEventCallback, Sensor sensor, int i) throws RemoteException;

    boolean registerRemoteSensorListener(String str, IRemoteSensorCallback iRemoteSensorCallback) throws RemoteException;

    void unregisterListener(String str) throws RemoteException;

    void unregisterRemoteSensorListener(String str) throws RemoteException;
}
