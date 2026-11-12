package com.unionpay.tsmservice.mini;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes6.dex */
public interface ITsmServiceMini extends IInterface {

    public abstract class Stub extends Binder implements ITsmServiceMini {

        final class a implements ITsmServiceMini {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static ITsmServiceMini f10803a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f10804b;

            public a(IBinder iBinder) {
                this.f10804b = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f10804b;
            }

            @Override // com.unionpay.tsmservice.mini.ITsmServiceMini
            public final int commonInterface(String str, String str2, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.unionpay.tsmservice.mini.ITsmServiceMini");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongBinder(iTsmCallback != null ? iTsmCallback.asBinder() : null);
                    parcelObtain.writeStrongBinder(iTsmProgressCallback != null ? iTsmProgressCallback.asBinder() : null);
                    if (!this.f10804b.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().commonInterface(str, str2, iTsmCallback, iTsmProgressCallback);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.unionpay.tsmservice.mini.ITsmServiceMini");
        }

        public static ITsmServiceMini asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.unionpay.tsmservice.mini.ITsmServiceMini");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITsmServiceMini)) ? new a(iBinder) : (ITsmServiceMini) iInterfaceQueryLocalInterface;
        }

        public static ITsmServiceMini getDefaultImpl() {
            return a.f10803a;
        }

        public static boolean setDefaultImpl(ITsmServiceMini iTsmServiceMini) {
            if (a.f10803a != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iTsmServiceMini == null) {
                return false;
            }
            a.f10803a = iTsmServiceMini;
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
                parcel2.writeString("com.unionpay.tsmservice.mini.ITsmServiceMini");
                return true;
            }
            parcel.enforceInterface("com.unionpay.tsmservice.mini.ITsmServiceMini");
            int iCommonInterface = commonInterface(parcel.readString(), parcel.readString(), ITsmCallback.Stub.asInterface(parcel.readStrongBinder()), ITsmProgressCallback.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            parcel2.writeInt(iCommonInterface);
            return true;
        }
    }

    int commonInterface(String str, String str2, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback);
}
