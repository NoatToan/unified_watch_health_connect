package com.xiaomi.smarthome.core.server.bluetooth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xiaomi.smarthome.core.entity.bluetooth.SearchResult;

/* JADX INFO: loaded from: classes10.dex */
public interface SearchResponse extends IInterface {

    public static class Default implements SearchResponse {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.SearchResponse
        public void onDeviceFounded(SearchResult searchResult) throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.SearchResponse
        public void onSearchCanceled() throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.SearchResponse
        public void onSearchStarted() throws RemoteException {
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.SearchResponse
        public void onSearchStopped() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements SearchResponse {
        private static final String DESCRIPTOR = "com.xiaomi.smarthome.core.server.bluetooth.SearchResponse";
        static final int TRANSACTION_onDeviceFounded = 2;
        static final int TRANSACTION_onSearchCanceled = 4;
        static final int TRANSACTION_onSearchStarted = 1;
        static final int TRANSACTION_onSearchStopped = 3;

        public static class Proxy implements SearchResponse {
            public static SearchResponse sDefaultImpl;
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

            @Override // com.xiaomi.smarthome.core.server.bluetooth.SearchResponse
            public void onDeviceFounded(SearchResult searchResult) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (searchResult != null) {
                        parcelObtain.writeInt(1);
                        searchResult.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onDeviceFounded(searchResult);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.SearchResponse
            public void onSearchCanceled() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onSearchCanceled();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.SearchResponse
            public void onSearchStarted() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onSearchStarted();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.SearchResponse
            public void onSearchStopped() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onSearchStopped();
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

        public static SearchResponse asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof SearchResponse)) ? new Proxy(iBinder) : (SearchResponse) iInterfaceQueryLocalInterface;
        }

        public static SearchResponse getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(SearchResponse searchResponse) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (searchResponse == null) {
                return false;
            }
            Proxy.sDefaultImpl = searchResponse;
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
                onSearchStarted();
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onDeviceFounded(parcel.readInt() != 0 ? SearchResult.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                onSearchStopped();
                parcel2.writeNoException();
                return true;
            }
            if (i != 4) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onSearchCanceled();
            parcel2.writeNoException();
            return true;
        }
    }

    void onDeviceFounded(SearchResult searchResult) throws RemoteException;

    void onSearchCanceled() throws RemoteException;

    void onSearchStarted() throws RemoteException;

    void onSearchStopped() throws RemoteException;
}
