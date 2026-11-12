package com.huawei.hwservicesmgr;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IHeartStudyAIDL extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hwservicesmgr.IHeartStudyAIDL";

    String getBtDeviceBondId(String str) throws RemoteException;

    public static abstract class Stub extends Binder implements IHeartStudyAIDL {
        static final int TRANSACTION_getBtDeviceBondId = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IHeartStudyAIDL.DESCRIPTOR);
        }

        public static IHeartStudyAIDL asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IHeartStudyAIDL.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IHeartStudyAIDL)) {
                return (IHeartStudyAIDL) iInterfaceQueryLocalInterface;
            }
            return new b(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IHeartStudyAIDL.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IHeartStudyAIDL.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                String btDeviceBondId = getBtDeviceBondId(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(btDeviceBondId);
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        /* JADX INFO: loaded from: classes38.dex */
        static class b implements IHeartStudyAIDL {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private IBinder f17671c;

            b(IBinder iBinder) {
                this.f17671c = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17671c;
            }

            @Override // com.huawei.hwservicesmgr.IHeartStudyAIDL
            public String getBtDeviceBondId(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHeartStudyAIDL.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.f17671c.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
