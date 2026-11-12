package com.ximalaya.ting.android.opensdk.player.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ximalaya.ting.android.opensdk.model.track.Track;

/* JADX INFO: loaded from: classes22.dex */
public interface IXmCommonBusinessDispatcher extends IInterface {

    public static abstract class Stub extends Binder implements IXmCommonBusinessDispatcher {
        private static final String DESCRIPTOR = "com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessDispatcher";
        public static final int TRANSACTION_closeApp = 3;
        public static final int TRANSACTION_getDownloadPlayPath = 1;
        public static final int TRANSACTION_imei = 5;
        public static final int TRANSACTION_isOldTrackDownload = 2;
        public static final int TRANSACTION_macAddress = 6;
        public static final int TRANSACTION_oaid = 4;
        public static final int TRANSACTION_serial = 7;

        public static class Proxy implements IXmCommonBusinessDispatcher {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessDispatcher
            public void closeApp() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessDispatcher
            public String getDownloadPlayPath(Track track) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (track != null) {
                        parcelObtain.writeInt(1);
                        track.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessDispatcher
            public String imei() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessDispatcher
            public void isOldTrackDownload(Track track) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (track != null) {
                        parcelObtain.writeInt(1);
                        track.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessDispatcher
            public String macAddress() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessDispatcher
            public String oaid() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessDispatcher
            public String serial() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IXmCommonBusinessDispatcher asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IXmCommonBusinessDispatcher)) ? new Proxy(iBinder) : (IXmCommonBusinessDispatcher) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    String downloadPlayPath = getDownloadPlayPath(parcel.readInt() != 0 ? Track.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeString(downloadPlayPath);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    isOldTrackDownload(parcel.readInt() != 0 ? Track.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    closeApp();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    String strOaid = oaid();
                    parcel2.writeNoException();
                    parcel2.writeString(strOaid);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    String strImei = imei();
                    parcel2.writeNoException();
                    parcel2.writeString(strImei);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    String strMacAddress = macAddress();
                    parcel2.writeNoException();
                    parcel2.writeString(strMacAddress);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    String strSerial = serial();
                    parcel2.writeNoException();
                    parcel2.writeString(strSerial);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void closeApp() throws RemoteException;

    String getDownloadPlayPath(Track track) throws RemoteException;

    String imei() throws RemoteException;

    void isOldTrackDownload(Track track) throws RemoteException;

    String macAddress() throws RemoteException;

    String oaid() throws RemoteException;

    String serial() throws RemoteException;
}
