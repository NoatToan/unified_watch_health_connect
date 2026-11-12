package com.ingenic.iwds.app;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
public interface INotificationProxyService extends IInterface {

    public static abstract class Stub extends Binder implements INotificationProxyService {

        public static class a implements INotificationProxyService {
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.ingenic.iwds.app.INotificationProxyService
            public void cancel(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.app.INotificationProxyService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.app.INotificationProxyService
            public void cancelAll(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.app.INotificationProxyService");
                    parcelObtain.writeString(str);
                    this.a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.app.INotificationProxyService
            public boolean notify(String str, int i, Note note) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.app.INotificationProxyService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (note != null) {
                        parcelObtain.writeInt(1);
                        note.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.app.INotificationProxyService
            public boolean registerBackend(INotificationServiceBackend iNotificationServiceBackend, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.app.INotificationProxyService");
                    parcelObtain.writeStrongBinder(iNotificationServiceBackend != null ? iNotificationServiceBackend.asBinder() : null);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.app.INotificationProxyService
            public boolean unregisterBackend(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.app.INotificationProxyService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.ingenic.iwds.app.INotificationProxyService");
        }

        public static INotificationProxyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.ingenic.iwds.app.INotificationProxyService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INotificationProxyService)) ? new a(iBinder) : (INotificationProxyService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ingenic.iwds.app.INotificationProxyService");
                boolean zNotify = notify(parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? Note.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(zNotify ? 1 : 0);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.ingenic.iwds.app.INotificationProxyService");
                cancel(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("com.ingenic.iwds.app.INotificationProxyService");
                cancelAll(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface("com.ingenic.iwds.app.INotificationProxyService");
                boolean zRegisterBackend = registerBackend(INotificationServiceBackend.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zRegisterBackend ? 1 : 0);
                return true;
            }
            if (i != 5) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.ingenic.iwds.app.INotificationProxyService");
                return true;
            }
            parcel.enforceInterface("com.ingenic.iwds.app.INotificationProxyService");
            boolean zUnregisterBackend = unregisterBackend(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(zUnregisterBackend ? 1 : 0);
            return true;
        }
    }

    void cancel(String str, int i) throws RemoteException;

    void cancelAll(String str) throws RemoteException;

    boolean notify(String str, int i, Note note) throws RemoteException;

    boolean registerBackend(INotificationServiceBackend iNotificationServiceBackend, String str, String str2) throws RemoteException;

    boolean unregisterBackend(String str, String str2) throws RemoteException;
}
