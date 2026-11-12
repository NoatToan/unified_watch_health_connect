package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes9.dex */
public interface lbi extends IInterface {

    public static abstract class a extends Binder implements lbi {
        static final int TRANSACTION_findProduct = 3;
        static final int TRANSACTION_getProductByModel = 1;
        static final int TRANSACTION_getProductList = 2;
        static final int TRANSACTION_getVersion = 4;

        /* JADX INFO: renamed from: lbi$a$a, reason: collision with other inner class name */
        public static class C1008a implements lbi {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f24866a;

            public C1008a(IBinder iBinder) {
                this.f24866a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f24866a;
            }

            @Override // defpackage.lbi
            public String findProduct(qbi qbiVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.research.ProductInfoFetcher");
                    parcelObtain.writeStrongInterface(qbiVar);
                    this.f24866a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.lbi
            public String getProductByModel(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.research.ProductInfoFetcher");
                    parcelObtain.writeString(str);
                    this.f24866a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.lbi
            public String getProductList(qbi qbiVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.research.ProductInfoFetcher");
                    parcelObtain.writeStrongInterface(qbiVar);
                    this.f24866a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.research.ProductInfoFetcher");
        }

        public static lbi asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.research.ProductInfoFetcher");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof lbi)) ? new C1008a(iBinder) : (lbi) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.research.ProductInfoFetcher");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.research.ProductInfoFetcher");
                return true;
            }
            if (i == 1) {
                String productByModel = getProductByModel(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(productByModel);
            } else if (i == 2) {
                String productList = getProductList(qbi.a.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeString(productList);
            } else if (i == 3) {
                String strFindProduct = findProduct(qbi.a.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeString(strFindProduct);
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                int version = getVersion();
                parcel2.writeNoException();
                parcel2.writeInt(version);
            }
            return true;
        }
    }

    String findProduct(qbi qbiVar) throws RemoteException;

    String getProductByModel(String str) throws RemoteException;

    String getProductList(qbi qbiVar) throws RemoteException;

    int getVersion() throws RemoteException;
}
