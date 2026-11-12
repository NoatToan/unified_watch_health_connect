package com.alipay.android.app;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public interface IRemoteServiceCallback extends IInterface {

    public static abstract class Stub extends Binder implements IRemoteServiceCallback {
        public static final String DESCRIPTOR = "com.alipay.android.app.IRemoteServiceCallback";
        public static final int TRANSACTION_getVersion = 4;
        public static final int TRANSACTION_isHideLoadingScreen = 3;
        public static final int TRANSACTION_payEnd = 2;
        public static final int TRANSACTION_r03 = 5;
        public static final int TRANSACTION_startActivity = 1;

        public static class a implements IRemoteServiceCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f28259a;

            public a(IBinder iBinder) {
                this.f28259a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f28259a;
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public final int getVersion() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f28259a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public final boolean isHideLoadingScreen() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f28259a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public final void payEnd(boolean z14, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z14 ? 1 : 0);
                    parcelObtain.writeString(str);
                    this.f28259a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public final void r03(String str, String str2, Map map) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeMap(map);
                    this.f28259a.transact(5, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.android.app.IRemoteServiceCallback
            public final void startActivity(String str, String str2, int i14, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i14);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f28259a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemoteServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRemoteServiceCallback)) ? new a(iBinder) : (IRemoteServiceCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
            if (i14 == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            if (i14 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                startActivity(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i14 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                payEnd(parcel.readInt() != 0, parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i14 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean zIsHideLoadingScreen = isHideLoadingScreen();
                parcel2.writeNoException();
                parcel2.writeInt(zIsHideLoadingScreen ? 1 : 0);
                return true;
            }
            if (i14 != 4) {
                if (i14 != 5) {
                    return super.onTransact(i14, parcel, parcel2, i15);
                }
                parcel.enforceInterface(DESCRIPTOR);
                r03(parcel.readString(), parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            int version = getVersion();
            parcel2.writeNoException();
            parcel2.writeInt(version);
            return true;
        }
    }

    int getVersion();

    boolean isHideLoadingScreen();

    void payEnd(boolean z14, String str);

    void r03(String str, String str2, Map map);

    void startActivity(String str, String str2, int i14, Bundle bundle);
}
