package com.huawei.wearengine;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.sensor.AsyncReadCallback;
import com.huawei.wearengine.sensor.AsyncStopCallback;
import com.huawei.wearengine.sensor.Sensor;
import java.util.List;

/* JADX INFO: loaded from: classes46.dex */
public interface SensorManager extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.wearengine.SensorManager";

    int asyncRead(Device device, Sensor sensor, AsyncReadCallback asyncReadCallback) throws RemoteException;

    int asyncReadSensors(Device device, List<Sensor> list, AsyncReadCallback asyncReadCallback) throws RemoteException;

    List<Sensor> getSensorList(Device device) throws RemoteException;

    int stopAsyncRead(Device device, Sensor sensor, AsyncStopCallback asyncStopCallback) throws RemoteException;

    int stopAsyncReadSensors(Device device, List<Sensor> list, AsyncStopCallback asyncStopCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements SensorManager {
        static final int TRANSACTION_asyncRead = 2;
        static final int TRANSACTION_asyncReadSensors = 3;
        static final int TRANSACTION_getSensorList = 1;
        static final int TRANSACTION_stopAsyncRead = 4;
        static final int TRANSACTION_stopAsyncReadSensors = 5;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, SensorManager.DESCRIPTOR);
        }

        public static SensorManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(SensorManager.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof SensorManager)) {
                return (SensorManager) iInterfaceQueryLocalInterface;
            }
            return new b(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(SensorManager.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(SensorManager.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                List<Sensor> sensorList = getSensorList((Device) b.b(parcel, Device.CREATOR));
                parcel2.writeNoException();
                b.c(parcel2, sensorList, 1);
            } else if (i == 2) {
                int iAsyncRead = asyncRead((Device) b.b(parcel, Device.CREATOR), (Sensor) b.b(parcel, Sensor.CREATOR), AsyncReadCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(iAsyncRead);
            } else if (i == 3) {
                int iAsyncReadSensors = asyncReadSensors((Device) b.b(parcel, Device.CREATOR), parcel.createTypedArrayList(Sensor.CREATOR), AsyncReadCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(iAsyncReadSensors);
            } else if (i == 4) {
                int iStopAsyncRead = stopAsyncRead((Device) b.b(parcel, Device.CREATOR), (Sensor) b.b(parcel, Sensor.CREATOR), AsyncStopCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(iStopAsyncRead);
            } else if (i == 5) {
                int iStopAsyncReadSensors = stopAsyncReadSensors((Device) b.b(parcel, Device.CREATOR), parcel.createTypedArrayList(Sensor.CREATOR), AsyncStopCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(iStopAsyncReadSensors);
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class b implements SensorManager {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f30737a;

            b(IBinder iBinder) {
                this.f30737a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30737a;
            }

            @Override // com.huawei.wearengine.SensorManager
            public List<Sensor> getSensorList(Device device) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(SensorManager.DESCRIPTOR);
                    b.b(parcelObtain, device, 0);
                    this.f30737a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(Sensor.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.SensorManager
            public int asyncRead(Device device, Sensor sensor, AsyncReadCallback asyncReadCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(SensorManager.DESCRIPTOR);
                    b.b(parcelObtain, device, 0);
                    b.b(parcelObtain, sensor, 0);
                    parcelObtain.writeStrongInterface(asyncReadCallback);
                    this.f30737a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.SensorManager
            public int asyncReadSensors(Device device, List<Sensor> list, AsyncReadCallback asyncReadCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(SensorManager.DESCRIPTOR);
                    b.b(parcelObtain, device, 0);
                    b.c(parcelObtain, list, 0);
                    parcelObtain.writeStrongInterface(asyncReadCallback);
                    this.f30737a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.SensorManager
            public int stopAsyncRead(Device device, Sensor sensor, AsyncStopCallback asyncStopCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(SensorManager.DESCRIPTOR);
                    b.b(parcelObtain, device, 0);
                    b.b(parcelObtain, sensor, 0);
                    parcelObtain.writeStrongInterface(asyncStopCallback);
                    this.f30737a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.SensorManager
            public int stopAsyncReadSensors(Device device, List<Sensor> list, AsyncStopCallback asyncStopCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(SensorManager.DESCRIPTOR);
                    b.b(parcelObtain, device, 0);
                    b.c(parcelObtain, list, 0);
                    parcelObtain.writeStrongInterface(asyncStopCallback);
                    this.f30737a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void c(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                b(parcel, list.get(i2), i);
            }
        }
    }
}
