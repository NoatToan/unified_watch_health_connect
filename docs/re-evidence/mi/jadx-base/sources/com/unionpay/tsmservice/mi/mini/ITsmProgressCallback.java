package com.unionpay.tsmservice.mi.mini;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes6.dex */
public interface ITsmProgressCallback extends IInterface {

    public abstract class Stub extends Binder implements ITsmProgressCallback {

        final class a implements ITsmProgressCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static ITsmProgressCallback f10787a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f10788b;

            public a(IBinder iBinder) {
                this.f10788b = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f10788b;
            }

            @Override // com.unionpay.tsmservice.mi.mini.ITsmProgressCallback
            public final void onProgress(int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.unionpay.tsmservice.mi.mini.ITsmProgressCallback");
                    parcelObtain.writeInt(i);
                    if (this.f10788b.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
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
            attachInterface(this, "com.unionpay.tsmservice.mi.mini.ITsmProgressCallback");
        }

        public static ITsmProgressCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.unionpay.tsmservice.mi.mini.ITsmProgressCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITsmProgressCallback)) ? new a(iBinder) : (ITsmProgressCallback) iInterfaceQueryLocalInterface;
        }

        public static ITsmProgressCallback getDefaultImpl() {
            return a.f10787a;
        }

        public static boolean setDefaultImpl(ITsmProgressCallback iTsmProgressCallback) {
            if (a.f10787a != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iTsmProgressCallback == null) {
                return false;
            }
            a.f10787a = iTsmProgressCallback;
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
                parcel2.writeString("com.unionpay.tsmservice.mi.mini.ITsmProgressCallback");
                return true;
            }
            parcel.enforceInterface("com.unionpay.tsmservice.mi.mini.ITsmProgressCallback");
            onProgress(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onProgress(int i);
}
