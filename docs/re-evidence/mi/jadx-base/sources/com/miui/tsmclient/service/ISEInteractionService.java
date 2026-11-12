package com.miui.tsmclient.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface ISEInteractionService extends IInterface {
    public static final String DESCRIPTOR = "com.miui.tsmclient.service.ISEInteractionService";

    public static class Default implements ISEInteractionService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.miui.tsmclient.service.ISEInteractionService
        public void deleteCard(IServiceResponse iServiceResponse, Map map) throws RemoteException {
        }

        @Override // com.miui.tsmclient.service.ISEInteractionService
        public void issueCard(IServiceResponse iServiceResponse, Map map) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ISEInteractionService {
        static final int TRANSACTION_deleteCard = 2;
        static final int TRANSACTION_issueCard = 1;

        public static class Proxy implements ISEInteractionService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.miui.tsmclient.service.ISEInteractionService
            public void deleteCard(IServiceResponse iServiceResponse, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISEInteractionService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ISEInteractionService.DESCRIPTOR;
            }

            @Override // com.miui.tsmclient.service.ISEInteractionService
            public void issueCard(IServiceResponse iServiceResponse, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISEInteractionService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iServiceResponse);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ISEInteractionService.DESCRIPTOR);
        }

        public static ISEInteractionService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ISEInteractionService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISEInteractionService)) ? new Proxy(iBinder) : (ISEInteractionService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ISEInteractionService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ISEInteractionService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                issueCard(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                deleteCard(IServiceResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void deleteCard(IServiceResponse iServiceResponse, Map map) throws RemoteException;

    void issueCard(IServiceResponse iServiceResponse, Map map) throws RemoteException;
}
