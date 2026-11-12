package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface kpc extends IInterface {

    public static abstract class a extends Binder implements kpc {

        /* JADX INFO: renamed from: kpc$a$a, reason: collision with other inner class name */
        public static class C1001a implements kpc {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static kpc f24136b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f24137a;

            public C1001a(IBinder iBinder) {
                this.f24137a = iBinder;
            }

            @Override // defpackage.kpc
            public boolean J2(String str, ParcelUuid parcelUuid, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miui.bluetooth.ble.IBluetoothMiBle");
                    parcelObtain.writeString(str);
                    if (parcelUuid != null) {
                        parcelObtain.writeInt(1);
                        parcelUuid.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    if (!this.f24137a.transact(14, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().J2(str, parcelUuid, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.kpc
            public void K3(String str, ParcelUuid parcelUuid) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miui.bluetooth.ble.IBluetoothMiBle");
                    parcelObtain.writeString(str);
                    if (parcelUuid != null) {
                        parcelObtain.writeInt(1);
                        parcelUuid.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f24137a.transact(4, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().K3(str, parcelUuid);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.kpc
            public boolean O0(String str, ParcelUuid parcelUuid, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miui.bluetooth.ble.IBluetoothMiBle");
                    parcelObtain.writeString(str);
                    if (parcelUuid != null) {
                        parcelObtain.writeInt(1);
                        parcelUuid.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str2);
                    if (!this.f24137a.transact(13, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().O0(str, parcelUuid, str2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.kpc
            public void T1(IBinder iBinder, String str, ParcelUuid parcelUuid) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miui.bluetooth.ble.IBluetoothMiBle");
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeString(str);
                    if (parcelUuid != null) {
                        parcelObtain.writeInt(1);
                        parcelUuid.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f24137a.transact(2, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().T1(iBinder, str, parcelUuid);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.kpc
            public int V0(String str, ParcelUuid parcelUuid) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miui.bluetooth.ble.IBluetoothMiBle");
                    parcelObtain.writeString(str);
                    if (parcelUuid != null) {
                        parcelObtain.writeInt(1);
                        parcelUuid.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f24137a.transact(7, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().V0(str, parcelUuid);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.kpc
            public void Y0(IBinder iBinder, String str, ParcelUuid parcelUuid, lpc lpcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miui.bluetooth.ble.IBluetoothMiBle");
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeString(str);
                    if (parcelUuid != null) {
                        parcelObtain.writeInt(1);
                        parcelUuid.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(lpcVar != null ? lpcVar.asBinder() : null);
                    if (this.f24137a.transact(1, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().Y0(iBinder, str, parcelUuid, lpcVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f24137a;
            }

            @Override // defpackage.kpc
            public boolean m4(String str, ParcelUuid parcelUuid) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miui.bluetooth.ble.IBluetoothMiBle");
                    parcelObtain.writeString(str);
                    if (parcelUuid != null) {
                        parcelObtain.writeInt(1);
                        parcelUuid.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f24137a.transact(15, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().m4(str, parcelUuid);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.kpc
            public boolean n(String str, ParcelUuid parcelUuid, int i, mpc mpcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miui.bluetooth.ble.IBluetoothMiBle");
                    parcelObtain.writeString(str);
                    if (parcelUuid != null) {
                        parcelObtain.writeInt(1);
                        parcelUuid.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(mpcVar != null ? mpcVar.asBinder() : null);
                    if (!this.f24137a.transact(9, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().n(str, parcelUuid, i, mpcVar);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static kpc h4() {
            return C1001a.f24136b;
        }

        public static kpc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("miui.bluetooth.ble.IBluetoothMiBle");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof kpc)) ? new C1001a(iBinder) : (kpc) iInterfaceQueryLocalInterface;
        }
    }

    boolean J2(String str, ParcelUuid parcelUuid, int i) throws RemoteException;

    void K3(String str, ParcelUuid parcelUuid) throws RemoteException;

    boolean O0(String str, ParcelUuid parcelUuid, String str2) throws RemoteException;

    void T1(IBinder iBinder, String str, ParcelUuid parcelUuid) throws RemoteException;

    int V0(String str, ParcelUuid parcelUuid) throws RemoteException;

    void Y0(IBinder iBinder, String str, ParcelUuid parcelUuid, lpc lpcVar) throws RemoteException;

    boolean m4(String str, ParcelUuid parcelUuid) throws RemoteException;

    boolean n(String str, ParcelUuid parcelUuid, int i, mpc mpcVar) throws RemoteException;
}
