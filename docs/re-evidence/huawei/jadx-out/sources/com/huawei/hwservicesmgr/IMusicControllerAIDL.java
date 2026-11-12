package com.huawei.hwservicesmgr;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.hwcommonmodel.datatypes.MusicInfo;

/* JADX INFO: loaded from: classes38.dex */
public interface IMusicControllerAIDL extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hwservicesmgr.IMusicControllerAIDL";

    void controllMusic(int i) throws RemoteException;

    MusicInfo getCurrentMusicInfo() throws RemoteException;

    void initMusic() throws RemoteException;

    void remoteListener() throws RemoteException;

    void setCallback(IMusicChangedCallback iMusicChangedCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements IMusicControllerAIDL {
        static final int TRANSACTION_controllMusic = 3;
        static final int TRANSACTION_getCurrentMusicInfo = 2;
        static final int TRANSACTION_initMusic = 1;
        static final int TRANSACTION_remoteListener = 5;
        static final int TRANSACTION_setCallback = 4;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IMusicControllerAIDL.DESCRIPTOR);
        }

        public static IMusicControllerAIDL asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IMusicControllerAIDL.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IMusicControllerAIDL)) {
                return (IMusicControllerAIDL) iInterfaceQueryLocalInterface;
            }
            return new c(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IMusicControllerAIDL.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IMusicControllerAIDL.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                initMusic();
                parcel2.writeNoException();
            } else if (i == 2) {
                MusicInfo currentMusicInfo = getCurrentMusicInfo();
                parcel2.writeNoException();
                d.b(parcel2, currentMusicInfo, 1);
            } else if (i == 3) {
                controllMusic(parcel.readInt());
                parcel2.writeNoException();
            } else if (i == 4) {
                setCallback(IMusicChangedCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 5) {
                remoteListener();
                parcel2.writeNoException();
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class c implements IMusicControllerAIDL {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f17672a;

            c(IBinder iBinder) {
                this.f17672a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17672a;
            }

            @Override // com.huawei.hwservicesmgr.IMusicControllerAIDL
            public void initMusic() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMusicControllerAIDL.DESCRIPTOR);
                    this.f17672a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IMusicControllerAIDL
            public MusicInfo getCurrentMusicInfo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMusicControllerAIDL.DESCRIPTOR);
                    this.f17672a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (MusicInfo) d.d(parcelObtain2, MusicInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IMusicControllerAIDL
            public void controllMusic(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMusicControllerAIDL.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.f17672a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IMusicControllerAIDL
            public void setCallback(IMusicChangedCallback iMusicChangedCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMusicControllerAIDL.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMusicChangedCallback);
                    this.f17672a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hwservicesmgr.IMusicControllerAIDL
            public void remoteListener() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMusicControllerAIDL.DESCRIPTOR);
                    this.f17672a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class d {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
