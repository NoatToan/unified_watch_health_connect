package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface wvc extends IInterface {

    public static abstract class a extends Binder implements wvc {

        /* JADX INFO: renamed from: wvc$a$a, reason: collision with other inner class name */
        public static class C1139a implements wvc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f38400a;

            public C1139a(IBinder iBinder) {
                this.f38400a = iBinder;
            }

            @Override // defpackage.wvc
            public boolean B3(BluetoothDevice bluetoothDevice, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.bluetooth.peripheral.IPeripheralConnectionService");
                    b.b(parcelObtain, bluetoothDevice, 0);
                    parcelObtain.writeInt(i);
                    this.f38400a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.wvc
            public boolean C4(BluetoothDevice bluetoothDevice, String str, String str2, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.bluetooth.peripheral.IPeripheralConnectionService");
                    b.b(parcelObtain, bluetoothDevice, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f38400a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.wvc
            public boolean G1(BluetoothDevice bluetoothDevice) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.bluetooth.peripheral.IPeripheralConnectionService");
                    b.b(parcelObtain, bluetoothDevice, 0);
                    this.f38400a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.wvc
            public void L(BluetoothDevice bluetoothDevice, qvc qvcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.bluetooth.peripheral.IPeripheralConnectionService");
                    b.b(parcelObtain, bluetoothDevice, 0);
                    parcelObtain.writeStrongInterface(qvcVar);
                    this.f38400a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.wvc
            public boolean Q4(BluetoothDevice bluetoothDevice, String str, String str2, String str3, byte[] bArr, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.bluetooth.peripheral.IPeripheralConnectionService");
                    b.b(parcelObtain, bluetoothDevice, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i);
                    this.f38400a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.wvc
            public boolean R(BluetoothDevice bluetoothDevice, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.bluetooth.peripheral.IPeripheralConnectionService");
                    b.b(parcelObtain, bluetoothDevice, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f38400a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f38400a;
            }

            @Override // defpackage.wvc
            public boolean b2(BluetoothDevice bluetoothDevice, int i, String str, String str2, qvc qvcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.bluetooth.peripheral.IPeripheralConnectionService");
                    b.b(parcelObtain, bluetoothDevice, 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(qvcVar);
                    this.f38400a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.wvc
            public void f4(BluetoothDevice bluetoothDevice) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.bluetooth.peripheral.IPeripheralConnectionService");
                    b.b(parcelObtain, bluetoothDevice, 0);
                    this.f38400a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.wvc
            public boolean g4(BluetoothDevice bluetoothDevice, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.bluetooth.peripheral.IPeripheralConnectionService");
                    b.b(parcelObtain, bluetoothDevice, 0);
                    parcelObtain.writeInt(i);
                    this.f38400a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.wvc
            public boolean i0(BluetoothDevice bluetoothDevice, String str, String str2, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.bluetooth.peripheral.IPeripheralConnectionService");
                    b.b(parcelObtain, bluetoothDevice, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeByteArray(bArr);
                    this.f38400a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.wvc
            public void t4(BluetoothDevice bluetoothDevice, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.bluetooth.peripheral.IPeripheralConnectionService");
                    b.b(parcelObtain, bluetoothDevice, 0);
                    parcelObtain.writeInt(i);
                    this.f38400a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.wvc
            public boolean w2(BluetoothDevice bluetoothDevice, String str, String str2, String str3, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.bluetooth.peripheral.IPeripheralConnectionService");
                    b.b(parcelObtain, bluetoothDevice, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeInt(i);
                    this.f38400a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.wvc
            public boolean x4(BluetoothDevice bluetoothDevice) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.bluetooth.peripheral.IPeripheralConnectionService");
                    b.b(parcelObtain, bluetoothDevice, 0);
                    this.f38400a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static wvc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.bluetooth.peripheral.IPeripheralConnectionService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof wvc)) ? new C1139a(iBinder) : (wvc) iInterfaceQueryLocalInterface;
        }
    }

    public static class b {
        public static <T extends Parcelable> void b(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    boolean B3(BluetoothDevice bluetoothDevice, int i) throws RemoteException;

    boolean C4(BluetoothDevice bluetoothDevice, String str, String str2, boolean z) throws RemoteException;

    boolean G1(BluetoothDevice bluetoothDevice) throws RemoteException;

    void L(BluetoothDevice bluetoothDevice, qvc qvcVar) throws RemoteException;

    boolean Q4(BluetoothDevice bluetoothDevice, String str, String str2, String str3, byte[] bArr, int i) throws RemoteException;

    boolean R(BluetoothDevice bluetoothDevice, String str, String str2) throws RemoteException;

    boolean b2(BluetoothDevice bluetoothDevice, int i, String str, String str2, qvc qvcVar) throws RemoteException;

    void f4(BluetoothDevice bluetoothDevice) throws RemoteException;

    boolean g4(BluetoothDevice bluetoothDevice, int i) throws RemoteException;

    boolean i0(BluetoothDevice bluetoothDevice, String str, String str2, byte[] bArr) throws RemoteException;

    void t4(BluetoothDevice bluetoothDevice, int i) throws RemoteException;

    boolean w2(BluetoothDevice bluetoothDevice, String str, String str2, String str3, int i) throws RemoteException;

    boolean x4(BluetoothDevice bluetoothDevice) throws RemoteException;
}
