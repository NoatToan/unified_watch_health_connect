package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattService;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface qvc extends IInterface {

    public static abstract class a extends Binder implements qvc {
        public a() {
            attachInterface(this, "com.xiaomi.bluetooth.peripheral.IPCServiceEventCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.bluetooth.peripheral.IPCServiceEventCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.bluetooth.peripheral.IPCServiceEventCallback");
                return true;
            }
            switch (i) {
                case 1:
                    q1((BluetoothDevice) b.b(parcel, BluetoothDevice.CREATOR), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    r3((BluetoothDevice) b.b(parcel, BluetoothDevice.CREATOR), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    S3((BluetoothDevice) b.b(parcel, BluetoothDevice.CREATOR), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    B2((BluetoothDevice) b.b(parcel, BluetoothDevice.CREATOR), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    A((BluetoothDevice) b.b(parcel, BluetoothDevice.CREATOR), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    K0((BluetoothDevice) b.b(parcel, BluetoothDevice.CREATOR), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    r4((BluetoothDevice) b.b(parcel, BluetoothDevice.CREATOR), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    V((BluetoothDevice) b.b(parcel, BluetoothDevice.CREATOR), parcel.createTypedArrayList(BluetoothGattService.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    q2((BluetoothDevice) b.b(parcel, BluetoothDevice.CREATOR), parcel.readString(), parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    H1((BluetoothDevice) b.b(parcel, BluetoothDevice.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    o3(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    public static class b {
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void A(BluetoothDevice bluetoothDevice, String str, String str2, String str3, int i, byte[] bArr) throws RemoteException;

    void B2(BluetoothDevice bluetoothDevice, String str, String str2, int i, byte[] bArr) throws RemoteException;

    void H1(BluetoothDevice bluetoothDevice, int i) throws RemoteException;

    void K0(BluetoothDevice bluetoothDevice, String str, String str2, String str3, int i, byte[] bArr) throws RemoteException;

    void S3(BluetoothDevice bluetoothDevice, String str, String str2, int i, byte[] bArr) throws RemoteException;

    void V(BluetoothDevice bluetoothDevice, List<BluetoothGattService> list, int i) throws RemoteException;

    void o3(int i, int i2, String str) throws RemoteException;

    void q1(BluetoothDevice bluetoothDevice, int i, int i2, long j) throws RemoteException;

    void q2(BluetoothDevice bluetoothDevice, String str, String str2, byte[] bArr) throws RemoteException;

    void r3(BluetoothDevice bluetoothDevice, byte[] bArr) throws RemoteException;

    void r4(BluetoothDevice bluetoothDevice, int i, int i2) throws RemoteException;
}
