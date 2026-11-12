package com.huami.mifit.sportlib.callback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huami.mifit.sportlib.model.GPSPoint;

/* JADX INFO: loaded from: classes11.dex */
public interface IServiceSportCallback extends IInterface {

    public static class Default implements IServiceSportCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceSportCallback
        public void onDeviceStatusChanged(boolean z, boolean z2) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceSportCallback
        public void onGPSSignalChanged(int i) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceSportCallback
        public void onInaccuracyLocationChanged(GPSPoint gPSPoint) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceSportCallback
        public void onScreenStatusChanged(String str, String str2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IServiceSportCallback {
        private static final String a = "com.huami.mifit.sportlib.callback.IServiceSportCallback";
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;

        public static class a implements IServiceSportCallback {
            public static IServiceSportCallback b;
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

            @Override // com.huami.mifit.sportlib.callback.IServiceSportCallback
            public void onDeviceStatusChanged(boolean z, boolean z2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(z2 ? 1 : 0);
                    if (this.a.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onDeviceStatusChanged(z, z2);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.callback.IServiceSportCallback
            public void onGPSSignalChanged(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeInt(i);
                    if (this.a.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onGPSSignalChanged(i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.callback.IServiceSportCallback
            public void onInaccuracyLocationChanged(GPSPoint gPSPoint) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (gPSPoint != null) {
                        parcelObtain.writeInt(1);
                        gPSPoint.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.a.transact(4, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onInaccuracyLocationChanged(gPSPoint);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.callback.IServiceSportCallback
            public void onScreenStatusChanged(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (this.a.transact(3, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onScreenStatusChanged(str, str2);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, a);
        }

        public static IServiceSportCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IServiceSportCallback)) ? new a(iBinder) : (IServiceSportCallback) iInterfaceQueryLocalInterface;
        }

        public static IServiceSportCallback getDefaultImpl() {
            return a.b;
        }

        public static boolean setDefaultImpl(IServiceSportCallback iServiceSportCallback) {
            if (a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iServiceSportCallback == null) {
                return false;
            }
            a.b = iServiceSportCallback;
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
                onGPSSignalChanged(parcel.readInt());
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(a);
                onDeviceStatusChanged(parcel.readInt() != 0, parcel.readInt() != 0);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(a);
                onScreenStatusChanged(parcel.readString(), parcel.readString());
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface(a);
                onInaccuracyLocationChanged(parcel.readInt() != 0 ? GPSPoint.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(a);
            return true;
        }
    }

    void onDeviceStatusChanged(boolean z, boolean z2) throws RemoteException;

    void onGPSSignalChanged(int i) throws RemoteException;

    void onInaccuracyLocationChanged(GPSPoint gPSPoint) throws RemoteException;

    void onScreenStatusChanged(String str, String str2) throws RemoteException;
}
