package com.milink.api.v1.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface IMcsDeviceListener extends IInterface {

    public static class Default implements IMcsDeviceListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.milink.api.v1.aidl.IMcsDeviceListener
        public void onDeviceFound(String str, String str2, String str3) throws RemoteException {
        }

        @Override // com.milink.api.v1.aidl.IMcsDeviceListener
        public void onDeviceFound2(String str, String str2, String str3, String str4, String str5, String str6) throws RemoteException {
        }

        @Override // com.milink.api.v1.aidl.IMcsDeviceListener
        public void onDeviceLost(String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMcsDeviceListener {
        private static final String DESCRIPTOR = "com.milink.api.v1.aidl.IMcsDeviceListener";
        static final int TRANSACTION_onDeviceFound = 1;
        static final int TRANSACTION_onDeviceFound2 = 2;
        static final int TRANSACTION_onDeviceLost = 3;

        public static class Proxy implements IMcsDeviceListener {
            public static IMcsDeviceListener sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.milink.api.v1.aidl.IMcsDeviceListener
            public void onDeviceFound(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onDeviceFound(str, str2, str3);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcsDeviceListener
            public void onDeviceFound2(String str, String str2, String str3, String str4, String str5, String str6) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    parcelObtain.writeString(str5);
                    parcelObtain.writeString(str6);
                    try {
                        if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } else {
                            Stub.getDefaultImpl().onDeviceFound2(str, str2, str3, str4, str5, str6);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        }
                    } catch (Throwable th) {
                        th = th;
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // com.milink.api.v1.aidl.IMcsDeviceListener
            public void onDeviceLost(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onDeviceLost(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMcsDeviceListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMcsDeviceListener)) ? new Proxy(iBinder) : (IMcsDeviceListener) iInterfaceQueryLocalInterface;
        }

        public static IMcsDeviceListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IMcsDeviceListener iMcsDeviceListener) {
            if (Proxy.sDefaultImpl != null || iMcsDeviceListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = iMcsDeviceListener;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onDeviceFound(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onDeviceFound2(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onDeviceLost(parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void onDeviceFound(String str, String str2, String str3) throws RemoteException;

    void onDeviceFound2(String str, String str2, String str3, String str4, String str5, String str6) throws RemoteException;

    void onDeviceLost(String str) throws RemoteException;
}
