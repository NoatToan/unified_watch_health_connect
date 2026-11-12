package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface csc extends IInterface {

    public static abstract class a extends Binder implements csc {

        /* JADX INFO: renamed from: csc$a$a, reason: collision with other inner class name */
        public static class C0904a implements csc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14672a;

            public C0904a(IBinder iBinder) {
                this.f14672a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14672a;
            }

            @Override // defpackage.csc
            public void onCancel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoOOBCallback");
                    this.f14672a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.csc
            public void onConfirm() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.eco.common.connect.IEcoOOBCallback");
                    this.f14672a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.eco.common.connect.IEcoOOBCallback");
        }

        public static csc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.eco.common.connect.IEcoOOBCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof csc)) ? new C0904a(iBinder) : (csc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.eco.common.connect.IEcoOOBCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.eco.common.connect.IEcoOOBCallback");
                return true;
            }
            if (i == 1) {
                onConfirm();
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onCancel();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onCancel() throws RemoteException;

    void onConfirm() throws RemoteException;
}
