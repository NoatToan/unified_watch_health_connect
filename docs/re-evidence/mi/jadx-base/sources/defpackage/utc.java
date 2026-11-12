package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface utc extends IInterface {

    public static abstract class a extends Binder implements utc {
        static final int TRANSACTION_onComplete = 1;
        static final int TRANSACTION_onFail = 3;
        static final int TRANSACTION_onProgress = 2;

        /* JADX INFO: renamed from: utc$a$a, reason: collision with other inner class name */
        public static class C1119a implements utc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f36114a;

            public C1119a(IBinder iBinder) {
                this.f36114a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f36114a;
            }

            @Override // defpackage.utc
            public void onComplete() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.common.connect.IMassDataCallback");
                    this.f36114a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.utc
            public void onFail(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.common.connect.IMassDataCallback");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.f36114a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.utc
            public void onProgress(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.common.connect.IMassDataCallback");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.f36114a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.common.connect.IMassDataCallback");
        }

        public static utc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.common.connect.IMassDataCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof utc)) ? new C1119a(iBinder) : (utc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.common.connect.IMassDataCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.common.connect.IMassDataCallback");
                return true;
            }
            if (i == 1) {
                onComplete();
                parcel2.writeNoException();
            } else if (i == 2) {
                onProgress(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onFail(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onComplete() throws RemoteException;

    void onFail(int i, String str) throws RemoteException;

    void onProgress(int i, int i2) throws RemoteException;
}
