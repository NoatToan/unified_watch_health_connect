package com.ingenic.iwds.smartsense;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public interface ISensorService extends IInterface {

    public static abstract class Stub extends Binder implements ISensorService {
        private static final String DESCRIPTOR = "com.ingenic.iwds.smartsense.ISensorService";
        public static final int TRANSACTION_getDefaultSensor = 2;
        public static final int TRANSACTION_getSensorList = 1;
        public static final int TRANSACTION_registerListener = 3;
        public static final int TRANSACTION_unregisterListener = 4;

        public static class Proxy implements ISensorService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.ingenic.iwds.smartsense.ISensorService
            public Sensor getDefaultSensor(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
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

            @Override // com.ingenic.iwds.smartsense.ISensorService
            public List<Sensor> getSensorList() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(Sensor.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.smartsense.ISensorService
            public boolean registerListener(String str, ISensorEventCallback iSensorEventCallback, Sensor sensor, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iSensorEventCallback != null ? iSensorEventCallback.asBinder() : null);
                    if (sensor != null) {
                        parcelObtain.writeInt(1);
                        sensor.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.smartsense.ISensorService
            public void unregisterListener(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
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

        public static ISensorService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISensorService)) ? new Proxy(iBinder) : (ISensorService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                List<Sensor> sensorList = getSensorList();
                parcel2.writeNoException();
                parcel2.writeTypedList(sensorList);
                return true;
            }
            if (i == 2) {
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
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean zRegisterListener = registerListener(parcel.readString(), ISensorEventCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0 ? Sensor.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(zRegisterListener ? 1 : 0);
                return true;
            }
            if (i != 4) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            unregisterListener(parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    Sensor getDefaultSensor(int i) throws RemoteException;

    List<Sensor> getSensorList() throws RemoteException;

    boolean registerListener(String str, ISensorEventCallback iSensorEventCallback, Sensor sensor, int i) throws RemoteException;

    void unregisterListener(String str) throws RemoteException;
}
