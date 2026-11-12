package com.milink.sdk.photo;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface IPhotoCastService extends IInterface {

    public static class Default implements IPhotoCastService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.milink.sdk.photo.IPhotoCastService
        public int checkAccess() throws RemoteException {
            return 0;
        }

        @Override // com.milink.sdk.photo.IPhotoCastService
        public String getCastingDeviceName() throws RemoteException {
            return null;
        }

        @Override // com.milink.sdk.photo.IPhotoCastService
        public int[] getCastingDeviceSize() throws RemoteException {
            return null;
        }

        @Override // com.milink.sdk.photo.IPhotoCastService
        public int init(IPhotoCastCallback iPhotoCastCallback) throws RemoteException {
            return 0;
        }

        @Override // com.milink.sdk.photo.IPhotoCastService
        public int release(IPhotoCastCallback iPhotoCastCallback) throws RemoteException {
            return 0;
        }

        @Override // com.milink.sdk.photo.IPhotoCastService
        public int rotate(String str, float f) throws RemoteException {
            return 0;
        }

        @Override // com.milink.sdk.photo.IPhotoCastService
        public int setDataSource(IPhotoCastDataSource iPhotoCastDataSource) throws RemoteException {
            return 0;
        }

        @Override // com.milink.sdk.photo.IPhotoCastService
        public int show(String str) throws RemoteException {
            return 0;
        }

        @Override // com.milink.sdk.photo.IPhotoCastService
        public int startSlide() throws RemoteException {
            return 0;
        }

        @Override // com.milink.sdk.photo.IPhotoCastService
        public int stop() throws RemoteException {
            return 0;
        }

        @Override // com.milink.sdk.photo.IPhotoCastService
        public int stopSlide() throws RemoteException {
            return 0;
        }

        @Override // com.milink.sdk.photo.IPhotoCastService
        public int zoom(String str, int i, int i2, int i3, int i4, int i5, int i6, float f) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IPhotoCastService {
        private static final String DESCRIPTOR = "com.milink.sdk.photo.IPhotoCastService";
        static final int TRANSACTION_checkAccess = 3;
        static final int TRANSACTION_getCastingDeviceName = 5;
        static final int TRANSACTION_getCastingDeviceSize = 6;
        static final int TRANSACTION_init = 1;
        static final int TRANSACTION_release = 2;
        static final int TRANSACTION_rotate = 9;
        static final int TRANSACTION_setDataSource = 4;
        static final int TRANSACTION_show = 7;
        static final int TRANSACTION_startSlide = 11;
        static final int TRANSACTION_stop = 10;
        static final int TRANSACTION_stopSlide = 12;
        static final int TRANSACTION_zoom = 8;

        public static class Proxy implements IPhotoCastService {
            public static IPhotoCastService sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.milink.sdk.photo.IPhotoCastService
            public int checkAccess() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().checkAccess();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.photo.IPhotoCastService
            public String getCastingDeviceName() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCastingDeviceName();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.photo.IPhotoCastService
            public int[] getCastingDeviceSize() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCastingDeviceSize();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createIntArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.milink.sdk.photo.IPhotoCastService
            public int init(IPhotoCastCallback iPhotoCastCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iPhotoCastCallback != null ? iPhotoCastCallback.asBinder() : null);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().init(iPhotoCastCallback);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.photo.IPhotoCastService
            public int release(IPhotoCastCallback iPhotoCastCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iPhotoCastCallback != null ? iPhotoCastCallback.asBinder() : null);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().release(iPhotoCastCallback);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.photo.IPhotoCastService
            public int rotate(String str, float f) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeFloat(f);
                    if (!this.mRemote.transact(9, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().rotate(str, f);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.photo.IPhotoCastService
            public int setDataSource(IPhotoCastDataSource iPhotoCastDataSource) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iPhotoCastDataSource != null ? iPhotoCastDataSource.asBinder() : null);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setDataSource(iPhotoCastDataSource);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.photo.IPhotoCastService
            public int show(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().show(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.photo.IPhotoCastService
            public int startSlide() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(11, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startSlide();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.photo.IPhotoCastService
            public int stop() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(10, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().stop();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.photo.IPhotoCastService
            public int stopSlide() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(12, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().stopSlide();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.photo.IPhotoCastService
            public int zoom(String str, int i, int i2, int i3, int i4, int i5, int i6, float f) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeInt(i5);
                    parcelObtain.writeInt(i6);
                    parcelObtain.writeFloat(f);
                    try {
                        if (!this.mRemote.transact(8, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                            int iZoom = Stub.getDefaultImpl().zoom(str, i, i2, i3, i4, i5, i6, f);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return iZoom;
                        }
                        parcelObtain2.readException();
                        int i7 = parcelObtain2.readInt();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return i7;
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
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IPhotoCastService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IPhotoCastService)) ? new Proxy(iBinder) : (IPhotoCastService) iInterfaceQueryLocalInterface;
        }

        public static IPhotoCastService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPhotoCastService iPhotoCastService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iPhotoCastService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iPhotoCastService;
            return true;
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
                    int iInit = init(IPhotoCastCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iInit);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iRelease = release(IPhotoCastCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iRelease);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iCheckAccess = checkAccess();
                    parcel2.writeNoException();
                    parcel2.writeInt(iCheckAccess);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int dataSource = setDataSource(IPhotoCastDataSource.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(dataSource);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    String castingDeviceName = getCastingDeviceName();
                    parcel2.writeNoException();
                    parcel2.writeString(castingDeviceName);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    int[] castingDeviceSize = getCastingDeviceSize();
                    parcel2.writeNoException();
                    parcel2.writeIntArray(castingDeviceSize);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iShow = show(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iShow);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iZoom = zoom(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat());
                    parcel2.writeNoException();
                    parcel2.writeInt(iZoom);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iRotate = rotate(parcel.readString(), parcel.readFloat());
                    parcel2.writeNoException();
                    parcel2.writeInt(iRotate);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iStop = stop();
                    parcel2.writeNoException();
                    parcel2.writeInt(iStop);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iStartSlide = startSlide();
                    parcel2.writeNoException();
                    parcel2.writeInt(iStartSlide);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iStopSlide = stopSlide();
                    parcel2.writeNoException();
                    parcel2.writeInt(iStopSlide);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    int checkAccess() throws RemoteException;

    String getCastingDeviceName() throws RemoteException;

    int[] getCastingDeviceSize() throws RemoteException;

    int init(IPhotoCastCallback iPhotoCastCallback) throws RemoteException;

    int release(IPhotoCastCallback iPhotoCastCallback) throws RemoteException;

    int rotate(String str, float f) throws RemoteException;

    int setDataSource(IPhotoCastDataSource iPhotoCastDataSource) throws RemoteException;

    int show(String str) throws RemoteException;

    int startSlide() throws RemoteException;

    int stop() throws RemoteException;

    int stopSlide() throws RemoteException;

    int zoom(String str, int i, int i2, int i3, int i4, int i5, int i6, float f) throws RemoteException;
}
