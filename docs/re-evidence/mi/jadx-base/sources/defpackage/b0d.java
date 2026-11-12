package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface b0d extends IInterface {

    public static abstract class a extends Binder implements b0d {

        /* JADX INFO: renamed from: b0d$a$a, reason: collision with other inner class name */
        public static class C0095a implements b0d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static b0d f3645b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f3646a;

            public C0095a(IBinder iBinder) {
                this.f3646a = iBinder;
            }

            @Override // defpackage.b0d
            public void T0(int i, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.milink.transmit.aidl.IUDTTransmitCallback");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    if (this.f3646a.transact(3, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().T0(i, i2, i3);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.b0d
            public void V3(int i, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.milink.transmit.aidl.IUDTTransmitCallback");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    if (this.f3646a.transact(4, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().V3(i, i2, i3);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.b0d
            public void a4(int i, int i2, int i3, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.milink.transmit.aidl.IUDTTransmitCallback");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (this.f3646a.transact(2, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().a4(i, i2, i3, z);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3646a;
            }

            @Override // defpackage.b0d
            public void e0(int i, int i2, int i3, byte[] bArr, int i4) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.milink.transmit.aidl.IUDTTransmitCallback");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i4);
                    if (this.f3646a.transact(7, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().e0(i, i2, i3, bArr, i4);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.b0d
            public void f1(int i, int i2, int i3, byte[] bArr, int i4) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.milink.transmit.aidl.IUDTTransmitCallback");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i4);
                    if (this.f3646a.transact(6, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().f1(i, i2, i3, bArr, i4);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.b0d
            public void o0(int i, int i2, int i3, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.milink.transmit.aidl.IUDTTransmitCallback");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (this.f3646a.transact(1, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().o0(i, i2, i3, z);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.b0d
            public void z3(int i, int i2, int i3, byte[] bArr, int i4) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.milink.transmit.aidl.IUDTTransmitCallback");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i4);
                    if (this.f3646a.transact(5, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().z3(i, i2, i3, bArr, i4);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static b0d h4() {
            return C0095a.f3645b;
        }

        public static b0d s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.milink.transmit.aidl.IUDTTransmitCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b0d)) ? new C0095a(iBinder) : (b0d) iInterfaceQueryLocalInterface;
        }
    }

    void T0(int i, int i2, int i3) throws RemoteException;

    void V3(int i, int i2, int i3) throws RemoteException;

    void a4(int i, int i2, int i3, boolean z) throws RemoteException;

    void e0(int i, int i2, int i3, byte[] bArr, int i4) throws RemoteException;

    void f1(int i, int i2, int i3, byte[] bArr, int i4) throws RemoteException;

    void o0(int i, int i2, int i3, boolean z) throws RemoteException;

    void z3(int i, int i2, int i3, byte[] bArr, int i4) throws RemoteException;
}
