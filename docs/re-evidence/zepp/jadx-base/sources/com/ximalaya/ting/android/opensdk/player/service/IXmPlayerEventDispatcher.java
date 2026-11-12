package com.ximalaya.ting.android.opensdk.player.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ximalaya.ting.android.opensdk.model.track.Track;

/* JADX INFO: loaded from: classes22.dex */
public interface IXmPlayerEventDispatcher extends IInterface {

    public static abstract class Stub extends Binder implements IXmPlayerEventDispatcher {
        private static final String DESCRIPTOR = "com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher";
        public static final int TRANSACTION_onBufferProgress = 9;
        public static final int TRANSACTION_onBufferingStart = 7;
        public static final int TRANSACTION_onBufferingStop = 8;
        public static final int TRANSACTION_onError = 11;
        public static final int TRANSACTION_onPlayPause = 2;
        public static final int TRANSACTION_onPlayProgress = 10;
        public static final int TRANSACTION_onPlayStart = 1;
        public static final int TRANSACTION_onPlayStop = 3;
        public static final int TRANSACTION_onSoundPlayComplete = 4;
        public static final int TRANSACTION_onSoundPrepared = 5;
        public static final int TRANSACTION_onSoundSwitch = 6;
        public static final int TRANSACTION_popAdTipDialog = 12;

        public static class Proxy implements IXmPlayerEventDispatcher {
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

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
            public void onBufferProgress(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
            public void onBufferingStart() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
            public void onBufferingStop() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
            public void onError(XmPlayerException xmPlayerException) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (xmPlayerException != null) {
                        parcelObtain.writeInt(1);
                        xmPlayerException.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        xmPlayerException.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
            public void onPlayPause() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
            public void onPlayProgress(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
            public void onPlayStart() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
            public void onPlayStop() throws RemoteException {
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

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
            public void onSoundPlayComplete() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
            public void onSoundPrepared() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
            public void onSoundSwitch(Track track, Track track2) throws RemoteException {
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
                    if (track2 != null) {
                        parcelObtain.writeInt(1);
                        track2.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        track.readFromParcel(parcelObtain2);
                    }
                    if (parcelObtain2.readInt() != 0) {
                        track2.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.ximalaya.ting.android.opensdk.player.service.IXmPlayerEventDispatcher
            public void popAdTipDialog(Track track, long j) throws RemoteException {
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
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        track.readFromParcel(parcelObtain2);
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

        public static IXmPlayerEventDispatcher asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IXmPlayerEventDispatcher)) ? new Proxy(iBinder) : (IXmPlayerEventDispatcher) iInterfaceQueryLocalInterface;
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
                    onPlayStart();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    onPlayPause();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    onPlayStop();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    onSoundPlayComplete();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    onSoundPrepared();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    Track trackCreateFromParcel = parcel.readInt() != 0 ? Track.CREATOR.createFromParcel(parcel) : null;
                    Track trackCreateFromParcel2 = parcel.readInt() != 0 ? Track.CREATOR.createFromParcel(parcel) : null;
                    onSoundSwitch(trackCreateFromParcel, trackCreateFromParcel2);
                    parcel2.writeNoException();
                    if (trackCreateFromParcel != null) {
                        parcel2.writeInt(1);
                        trackCreateFromParcel.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    if (trackCreateFromParcel2 != null) {
                        parcel2.writeInt(1);
                        trackCreateFromParcel2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    onBufferingStart();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    onBufferingStop();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    onBufferProgress(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    onPlayProgress(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    XmPlayerException xmPlayerExceptionCreateFromParcel = parcel.readInt() != 0 ? XmPlayerException.CREATOR.createFromParcel(parcel) : null;
                    onError(xmPlayerExceptionCreateFromParcel);
                    parcel2.writeNoException();
                    if (xmPlayerExceptionCreateFromParcel != null) {
                        parcel2.writeInt(1);
                        xmPlayerExceptionCreateFromParcel.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    Track trackCreateFromParcel3 = parcel.readInt() != 0 ? Track.CREATOR.createFromParcel(parcel) : null;
                    popAdTipDialog(trackCreateFromParcel3, parcel.readLong());
                    parcel2.writeNoException();
                    if (trackCreateFromParcel3 != null) {
                        parcel2.writeInt(1);
                        trackCreateFromParcel3.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void onBufferProgress(int i) throws RemoteException;

    void onBufferingStart() throws RemoteException;

    void onBufferingStop() throws RemoteException;

    void onError(XmPlayerException xmPlayerException) throws RemoteException;

    void onPlayPause() throws RemoteException;

    void onPlayProgress(int i, int i2) throws RemoteException;

    void onPlayStart() throws RemoteException;

    void onPlayStop() throws RemoteException;

    void onSoundPlayComplete() throws RemoteException;

    void onSoundPrepared() throws RemoteException;

    void onSoundSwitch(Track track, Track track2) throws RemoteException;

    void popAdTipDialog(Track track, long j) throws RemoteException;
}
