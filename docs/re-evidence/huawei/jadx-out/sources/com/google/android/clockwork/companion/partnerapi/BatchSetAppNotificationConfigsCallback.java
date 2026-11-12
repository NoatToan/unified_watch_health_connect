package com.google.android.clockwork.companion.partnerapi;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface BatchSetAppNotificationConfigsCallback extends IInterface {
    public static final String DESCRIPTOR = "com.google.android.clockwork.companion.partnerapi.BatchSetAppNotificationConfigsCallback";

    void onResult(Map map) throws RemoteException;

    void onTimeout() throws RemoteException;

    public static abstract class Stub extends Binder implements BatchSetAppNotificationConfigsCallback {
        static final int TRANSACTION_onResult = 1;
        static final int TRANSACTION_onTimeout = 2;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, BatchSetAppNotificationConfigsCallback.DESCRIPTOR);
        }

        public static BatchSetAppNotificationConfigsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(BatchSetAppNotificationConfigsCallback.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof BatchSetAppNotificationConfigsCallback)) {
                return (BatchSetAppNotificationConfigsCallback) iInterfaceQueryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(BatchSetAppNotificationConfigsCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(BatchSetAppNotificationConfigsCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onResult(parcel.readHashMap(getClass().getClassLoader()));
            } else if (i == 2) {
                onTimeout();
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class a implements BatchSetAppNotificationConfigsCallback {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private IBinder f4208c;

            a(IBinder iBinder) {
                this.f4208c = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4208c;
            }

            @Override // com.google.android.clockwork.companion.partnerapi.BatchSetAppNotificationConfigsCallback
            public void onResult(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(BatchSetAppNotificationConfigsCallback.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.f4208c.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.android.clockwork.companion.partnerapi.BatchSetAppNotificationConfigsCallback
            public void onTimeout() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(BatchSetAppNotificationConfigsCallback.DESCRIPTOR);
                    this.f4208c.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }
}
