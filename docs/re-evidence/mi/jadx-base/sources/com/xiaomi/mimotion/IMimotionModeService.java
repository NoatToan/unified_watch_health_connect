package com.xiaomi.mimotion;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IMimotionModeService extends IInterface {
    public static final String DESCRIPTOR = "com.xiaomi.mimotion.IMimotionModeService";

    public static class Default implements IMimotionModeService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.mimotion.IMimotionModeService
        public int[] getRefreshRateSpeedLimitsDp() throws RemoteException {
            return null;
        }

        @Override // com.xiaomi.mimotion.IMimotionModeService
        public boolean isMimotionEnabled() throws RemoteException {
            return false;
        }

        @Override // com.xiaomi.mimotion.IMimotionModeService
        public void registerMimotionModeListener(IMimotionModeCallback iMimotionModeCallback, int i) throws RemoteException {
        }

        @Override // com.xiaomi.mimotion.IMimotionModeService
        public void unRegisterMimotionModeListener(IMimotionModeCallback iMimotionModeCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMimotionModeService {
        static final int TRANSACTION_getRefreshRateSpeedLimitsDp = 4;
        static final int TRANSACTION_isMimotionEnabled = 1;
        static final int TRANSACTION_registerMimotionModeListener = 2;
        static final int TRANSACTION_unRegisterMimotionModeListener = 3;

        public static class Proxy implements IMimotionModeService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IMimotionModeService.DESCRIPTOR;
            }

            @Override // com.xiaomi.mimotion.IMimotionModeService
            public int[] getRefreshRateSpeedLimitsDp() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMimotionModeService.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createIntArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mimotion.IMimotionModeService
            public boolean isMimotionEnabled() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMimotionModeService.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mimotion.IMimotionModeService
            public void registerMimotionModeListener(IMimotionModeCallback iMimotionModeCallback, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMimotionModeService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMimotionModeCallback);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.mimotion.IMimotionModeService
            public void unRegisterMimotionModeListener(IMimotionModeCallback iMimotionModeCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMimotionModeService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMimotionModeCallback);
                    this.mRemote.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMimotionModeService.DESCRIPTOR);
        }

        public static IMimotionModeService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IMimotionModeService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMimotionModeService)) ? new Proxy(iBinder) : (IMimotionModeService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IMimotionModeService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IMimotionModeService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                boolean zIsMimotionEnabled = isMimotionEnabled();
                parcel2.writeNoException();
                parcel2.writeInt(zIsMimotionEnabled ? 1 : 0);
            } else if (i == 2) {
                registerMimotionModeListener(IMimotionModeCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
            } else if (i == 3) {
                unRegisterMimotionModeListener(IMimotionModeCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                int[] refreshRateSpeedLimitsDp = getRefreshRateSpeedLimitsDp();
                parcel2.writeNoException();
                parcel2.writeIntArray(refreshRateSpeedLimitsDp);
            }
            return true;
        }
    }

    int[] getRefreshRateSpeedLimitsDp() throws RemoteException;

    boolean isMimotionEnabled() throws RemoteException;

    void registerMimotionModeListener(IMimotionModeCallback iMimotionModeCallback, int i) throws RemoteException;

    void unRegisterMimotionModeListener(IMimotionModeCallback iMimotionModeCallback) throws RemoteException;
}
