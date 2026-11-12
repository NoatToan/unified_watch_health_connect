package com.huami.mifit.sportlib;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface LocationProvider extends IInterface {

    public static class Default implements LocationProvider {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huami.mifit.sportlib.LocationProvider
        public void startLocation(LocationListener locationListener) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.LocationProvider
        public void stopLocation() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements LocationProvider {
        private static final String a = "com.huami.mifit.sportlib.LocationProvider";
        public static final int b = 1;
        public static final int c = 2;

        public static class a implements LocationProvider {
            public static LocationProvider b;
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            public String d() {
                return Stub.a;
            }

            @Override // com.huami.mifit.sportlib.LocationProvider
            public void startLocation(LocationListener locationListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeStrongBinder(locationListener != null ? locationListener.asBinder() : null);
                    if (this.a.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().startLocation(locationListener);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.LocationProvider
            public void stopLocation() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (this.a.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().stopLocation();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, a);
        }

        public static LocationProvider asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof LocationProvider)) ? new a(iBinder) : (LocationProvider) iInterfaceQueryLocalInterface;
        }

        public static LocationProvider getDefaultImpl() {
            return a.b;
        }

        public static boolean setDefaultImpl(LocationProvider locationProvider) {
            if (a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (locationProvider == null) {
                return false;
            }
            a.b = locationProvider;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(a);
                startLocation(LocationListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(a);
                return true;
            }
            parcel.enforceInterface(a);
            stopLocation();
            parcel2.writeNoException();
            return true;
        }
    }

    void startLocation(LocationListener locationListener) throws RemoteException;

    void stopLocation() throws RemoteException;
}
