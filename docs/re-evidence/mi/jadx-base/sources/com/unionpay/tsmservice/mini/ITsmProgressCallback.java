package com.unionpay.tsmservice.mini;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes6.dex */
public interface ITsmProgressCallback extends IInterface {

    public abstract class Stub extends Binder implements ITsmProgressCallback {

        final class a implements ITsmProgressCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static ITsmProgressCallback f10801a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f10802b;

            public a(IBinder iBinder) {
                this.f10802b = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f10802b;
            }

            @Override // com.unionpay.tsmservice.mini.ITsmProgressCallback
            public final void onProgress(int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.unionpay.tsmservice.mini.ITsmProgressCallback");
                    parcelObtain.writeInt(i);
                    if (this.f10802b.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onProgress(i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.unionpay.tsmservice.mini.ITsmProgressCallback");
        }

        public static ITsmProgressCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.unionpay.tsmservice.mini.ITsmProgressCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITsmProgressCallback)) ? new a(iBinder) : (ITsmProgressCallback) iInterfaceQueryLocalInterface;
        }

        public static ITsmProgressCallback getDefaultImpl() {
            return a.f10801a;
        }

        public static boolean setDefaultImpl(ITsmProgressCallback iTsmProgressCallback) {
            if (a.f10801a != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iTsmProgressCallback == null) {
                return false;
            }
            a.f10801a = iTsmProgressCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.unionpay.tsmservice.mini.ITsmProgressCallback");
                return true;
            }
            parcel.enforceInterface("com.unionpay.tsmservice.mini.ITsmProgressCallback");
            onProgress(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onProgress(int i);
}
