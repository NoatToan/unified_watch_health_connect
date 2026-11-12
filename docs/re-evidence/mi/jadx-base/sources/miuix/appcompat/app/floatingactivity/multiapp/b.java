package miuix.appcompat.app.floatingactivity.multiapp;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: miuix.appcompat.app.floatingactivity.multiapp.b$a$a, reason: collision with other inner class name */
        public static class C1025a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f26366a;

            public C1025a(IBinder iBinder) {
                this.f26366a = iBinder;
            }

            @Override // miuix.appcompat.app.floatingactivity.multiapp.b
            public Bundle P2(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miuix.appcompat.app.floatingactivity.multiapp.IServiceNotify");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeBundle(bundle);
                    this.f26366a.transact(1, parcelObtain, parcelObtain2, 0);
                    Bundle bundle2 = parcelObtain2.readBundle();
                    parcelObtain2.readException();
                    return bundle2;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26366a;
            }
        }

        public a() {
            attachInterface(this, "miuix.appcompat.app.floatingactivity.multiapp.IServiceNotify");
        }

        public static b s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("miuix.appcompat.app.floatingactivity.multiapp.IServiceNotify");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C1025a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("miuix.appcompat.app.floatingactivity.multiapp.IServiceNotify");
                return true;
            }
            parcel.enforceInterface("miuix.appcompat.app.floatingactivity.multiapp.IServiceNotify");
            parcel2.writeBundle(P2(parcel.readInt(), parcel.readBundle()));
            parcel2.writeNoException();
            return true;
        }
    }

    Bundle P2(int i, Bundle bundle) throws RemoteException;
}
