package com.google.android.clockwork.companion.partnerapi;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes21.dex */
public interface PartnerHostedApi extends IInterface {
    public static final String DESCRIPTOR = "com.google.android.clockwork.companion.partnerapi.PartnerHostedApi";

    SmartWatchInfo getPendingPairingSmartWatchInfo() throws RemoteException;

    public static abstract class Stub extends Binder implements PartnerHostedApi {
        static final int TRANSACTION_getPendingPairingSmartWatchInfo = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, PartnerHostedApi.DESCRIPTOR);
        }

        public static PartnerHostedApi asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(PartnerHostedApi.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof PartnerHostedApi)) {
                return (PartnerHostedApi) iInterfaceQueryLocalInterface;
            }
            return new c(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(PartnerHostedApi.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(PartnerHostedApi.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                SmartWatchInfo pendingPairingSmartWatchInfo = getPendingPairingSmartWatchInfo();
                parcel2.writeNoException();
                e.d(parcel2, pendingPairingSmartWatchInfo, 1);
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class c implements PartnerHostedApi {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f4211b;

            c(IBinder iBinder) {
                this.f4211b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4211b;
            }

            @Override // com.google.android.clockwork.companion.partnerapi.PartnerHostedApi
            public SmartWatchInfo getPendingPairingSmartWatchInfo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(PartnerHostedApi.DESCRIPTOR);
                    this.f4211b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (SmartWatchInfo) e.e(parcelObtain2, SmartWatchInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class e {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T e(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
