package miuix.appcompat.app.floatingactivity.multiapp;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: miuix.appcompat.app.floatingactivity.multiapp.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1023a extends Binder implements a {

        /* JADX INFO: renamed from: miuix.appcompat.app.floatingactivity.multiapp.a$a$a, reason: collision with other inner class name */
        public static class C1024a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f26365a;

            public C1024a(IBinder iBinder) {
                this.f26365a = iBinder;
            }

            @Override // miuix.appcompat.app.floatingactivity.multiapp.a
            public void I2(b bVar, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miuix.appcompat.app.floatingactivity.multiapp.IFloatingService");
                    parcelObtain.writeStrongBinder(bVar == null ? null : bVar.asBinder());
                    parcelObtain.writeString(str);
                    this.f26365a.transact(4, parcelObtain, parcelObtain2, 0);
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            }

            @Override // miuix.appcompat.app.floatingactivity.multiapp.a
            public int J3(b bVar, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miuix.appcompat.app.floatingactivity.multiapp.IFloatingService");
                    parcelObtain.writeStrongBinder(bVar == null ? null : bVar.asBinder());
                    parcelObtain.writeString(str);
                    this.f26365a.transact(3, parcelObtain, parcelObtain2, 0);
                    int i = parcelObtain2.readInt();
                    parcelObtain2.readException();
                    return i;
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            }

            @Override // miuix.appcompat.app.floatingactivity.multiapp.a
            public Bundle R4(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miuix.appcompat.app.floatingactivity.multiapp.IFloatingService");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeBundle(bundle);
                    this.f26365a.transact(2, parcelObtain, parcelObtain2, 0);
                    Bundle bundle2 = parcelObtain2.readBundle(getClass().getClassLoader());
                    parcelObtain2.readException();
                    return bundle2;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26365a;
            }

            @Override // miuix.appcompat.app.floatingactivity.multiapp.a
            public void i3(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miuix.appcompat.app.floatingactivity.multiapp.IFloatingService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f26365a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            }
        }

        public AbstractBinderC1023a() {
            attachInterface(this, "miuix.appcompat.app.floatingactivity.multiapp.IFloatingService");
        }

        public static a s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            return iBinder.queryLocalInterface("miuix.appcompat.app.floatingactivity.multiapp.IFloatingService") instanceof a ? (a) iBinder : new C1024a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (parcel2 == null) {
                return super.onTransact(i, parcel, null, i2);
            }
            if (i == 2) {
                parcel.enforceInterface("miuix.appcompat.app.floatingactivity.multiapp.IFloatingService");
                parcel2.writeBundle(R4(parcel.readInt(), parcel.readBundle(getClass().getClassLoader())));
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("miuix.appcompat.app.floatingactivity.multiapp.IFloatingService");
                parcel2.writeInt(J3(b.a.s2(parcel.readStrongBinder()), parcel.readString()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface("miuix.appcompat.app.floatingactivity.multiapp.IFloatingService");
                I2(b.a.s2(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i != 5) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("miuix.appcompat.app.floatingactivity.multiapp.IFloatingService");
                return true;
            }
            parcel.enforceInterface("miuix.appcompat.app.floatingactivity.multiapp.IFloatingService");
            i3(parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void I2(b bVar, String str) throws RemoteException;

    int J3(b bVar, String str) throws RemoteException;

    Bundle R4(int i, Bundle bundle) throws RemoteException;

    void i3(String str, int i) throws RemoteException;
}
