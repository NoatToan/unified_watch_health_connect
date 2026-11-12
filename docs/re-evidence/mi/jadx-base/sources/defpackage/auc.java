package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface auc extends IInterface {

    public static abstract class a extends Binder implements auc {

        /* JADX INFO: renamed from: auc$a$a, reason: collision with other inner class name */
        public static class C0092a implements auc {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static auc f3454b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f3455a;

            public C0092a(IBinder iBinder) {
                this.f3455a = iBinder;
            }

            @Override // defpackage.auc
            public boolean A1(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miui.bluetooth.ble.IMiBleDeviceManager");
                    parcelObtain.writeString(str);
                    if (!this.f3455a.transact(6, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().A1(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.auc
            public int F(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miui.bluetooth.ble.IMiBleDeviceManager");
                    parcelObtain.writeString(str);
                    if (!this.f3455a.transact(7, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().F(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.auc
            public boolean R2(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miui.bluetooth.ble.IMiBleDeviceManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.f3455a.transact(18, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().R2(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3455a;
            }

            @Override // defpackage.auc
            public boolean f2(String str, String str2, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miui.bluetooth.ble.IMiBleDeviceManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    if (!this.f3455a.transact(3, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().f2(str, str2, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.auc
            public int i2() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miui.bluetooth.ble.IMiBleDeviceManager");
                    if (!this.f3455a.transact(12, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().i2();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.auc
            public int k1(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miui.bluetooth.ble.IMiBleDeviceManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.f3455a.transact(4, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().k1(str, str2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static auc h4() {
            return C0092a.f3454b;
        }

        public static auc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("miui.bluetooth.ble.IMiBleDeviceManager");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof auc)) ? new C0092a(iBinder) : (auc) iInterfaceQueryLocalInterface;
        }
    }

    boolean A1(String str) throws RemoteException;

    int F(String str) throws RemoteException;

    boolean R2(String str, byte[] bArr) throws RemoteException;

    boolean f2(String str, String str2, int i) throws RemoteException;

    int i2() throws RemoteException;

    int k1(String str, String str2) throws RemoteException;
}
