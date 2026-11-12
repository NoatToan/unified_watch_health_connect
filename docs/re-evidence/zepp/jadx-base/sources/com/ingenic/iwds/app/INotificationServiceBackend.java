package com.ingenic.iwds.app;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
public interface INotificationServiceBackend extends IInterface {

    public static abstract class Stub extends Binder implements INotificationServiceBackend {

        public static class a implements INotificationServiceBackend {
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.ingenic.iwds.app.INotificationServiceBackend
            public void onCancelAllNotification(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.app.INotificationServiceBackend");
                    parcelObtain.writeString(str);
                    this.a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.app.INotificationServiceBackend
            public void onCancelNotification(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.app.INotificationServiceBackend");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ingenic.iwds.app.INotificationServiceBackend
            public boolean onHandleNotification(String str, int i, Note note) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ingenic.iwds.app.INotificationServiceBackend");
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
        }

        public Stub() {
            attachInterface(this, "com.ingenic.iwds.app.INotificationServiceBackend");
        }

        public static INotificationServiceBackend asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.ingenic.iwds.app.INotificationServiceBackend");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INotificationServiceBackend)) ? new a(iBinder) : (INotificationServiceBackend) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ingenic.iwds.app.INotificationServiceBackend");
                boolean zOnHandleNotification = onHandleNotification(parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? Note.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(zOnHandleNotification ? 1 : 0);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.ingenic.iwds.app.INotificationServiceBackend");
                onCancelNotification(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.ingenic.iwds.app.INotificationServiceBackend");
                return true;
            }
            parcel.enforceInterface("com.ingenic.iwds.app.INotificationServiceBackend");
            onCancelAllNotification(parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void onCancelAllNotification(String str) throws RemoteException;

    void onCancelNotification(String str, int i) throws RemoteException;

    boolean onHandleNotification(String str, int i, Note note) throws RemoteException;
}
