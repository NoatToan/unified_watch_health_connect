package com.chinatelecom.multisimservice.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface ISmartWearServiceInfoCallback extends IInterface {

    public static class Default implements ISmartWearServiceInfoCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.chinatelecom.multisimservice.model.ISmartWearServiceInfoCallback
        public void getSmartWearServiceInfo(SmartWearServiceInfo smartWearServiceInfo) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ISmartWearServiceInfoCallback {
        private static final String a = "com.chinatelecom.multisimservice.model.ISmartWearServiceInfoCallback";
        public static final int b = 1;

        public static class a implements ISmartWearServiceInfoCallback {
            public static ISmartWearServiceInfoCallback b;
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

            @Override // com.chinatelecom.multisimservice.model.ISmartWearServiceInfoCallback
            public void getSmartWearServiceInfo(SmartWearServiceInfo smartWearServiceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (smartWearServiceInfo != null) {
                        parcelObtain.writeInt(1);
                        smartWearServiceInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.a.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().getSmartWearServiceInfo(smartWearServiceInfo);
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

        public static ISmartWearServiceInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISmartWearServiceInfoCallback)) ? new a(iBinder) : (ISmartWearServiceInfoCallback) iInterfaceQueryLocalInterface;
        }

        public static ISmartWearServiceInfoCallback getDefaultImpl() {
            return a.b;
        }

        public static boolean setDefaultImpl(ISmartWearServiceInfoCallback iSmartWearServiceInfoCallback) {
            if (a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iSmartWearServiceInfoCallback == null) {
                return false;
            }
            a.b = iSmartWearServiceInfoCallback;
            return true;
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
                parcel2.writeString(a);
                return true;
            }
            parcel.enforceInterface(a);
            getSmartWearServiceInfo(parcel.readInt() != 0 ? SmartWearServiceInfo.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void getSmartWearServiceInfo(SmartWearServiceInfo smartWearServiceInfo) throws RemoteException;
}
