package com.huawei.health;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface ITrackDataReport extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.health.ITrackDataReport";

    void report(Bundle bundle) throws RemoteException;

    public static abstract class Stub extends Binder implements ITrackDataReport {
        static final int TRANSACTION_report = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, ITrackDataReport.DESCRIPTOR);
        }

        public static ITrackDataReport asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITrackDataReport.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ITrackDataReport)) {
                return (ITrackDataReport) iInterfaceQueryLocalInterface;
            }
            return new b(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ITrackDataReport.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ITrackDataReport.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            Bundle bundle = (Bundle) b.e(parcel, Bundle.CREATOR);
            report(bundle);
            parcel2.writeNoException();
            b.b(parcel2, bundle, 1);
            return true;
        }

        /* JADX INFO: loaded from: classes6.dex */
        static class b implements ITrackDataReport {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private IBinder f6126c;

            b(IBinder iBinder) {
                this.f6126c = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6126c;
            }

            @Override // com.huawei.health.ITrackDataReport
            public void report(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITrackDataReport.DESCRIPTOR);
                    b.b(parcelObtain, bundle, 0);
                    this.f6126c.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        bundle.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T e(Parcel parcel, Parcelable.Creator<T> creator) {
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
