package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface b extends IInterface {
    public static final String Sb = "androidx$room$IMultiInstanceInvalidationService".replace(Typography.dollar, '.');

    public static abstract class a extends Binder implements b {
        static final int TRANSACTION_broadcastInvalidation = 3;
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_unregisterCallback = 2;

        /* JADX INFO: renamed from: androidx.room.b$a$a, reason: collision with other inner class name */
        public static class C0076a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f2982a;

            public C0076a(IBinder iBinder) {
                this.f2982a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2982a;
            }

            @Override // androidx.room.b
            public void broadcastInvalidation(int i, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.Sb);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStringArray(strArr);
                    this.f2982a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.b
            public int registerCallback(androidx.room.a aVar, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.Sb);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    this.f2982a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.b
            public void unregisterCallback(androidx.room.a aVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.Sb);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeInt(i);
                    this.f2982a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, b.Sb);
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.Sb);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0076a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = b.Sb;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                int iRegisterCallback = registerCallback(androidx.room.a.AbstractBinderC0074a.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iRegisterCallback);
            } else if (i == 2) {
                unregisterCallback(androidx.room.a.AbstractBinderC0074a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                broadcastInvalidation(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    void broadcastInvalidation(int i, String[] strArr) throws RemoteException;

    int registerCallback(androidx.room.a aVar, String str) throws RemoteException;

    void unregisterCallback(androidx.room.a aVar, int i) throws RemoteException;
}
