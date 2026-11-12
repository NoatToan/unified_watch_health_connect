package com.xiaomi.fitness.device.manager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface j extends IInterface {

    public static abstract class a extends Binder implements j {
        static final int TRANSACTION_addProductChangeListener = 2;
        static final int TRANSACTION_clear = 1;
        static final int TRANSACTION_findProduct = 6;
        static final int TRANSACTION_getProductByModel = 5;
        static final int TRANSACTION_getProductList = 4;
        static final int TRANSACTION_isProductNotEmpty = 7;
        static final int TRANSACTION_removeProductChangeListener = 3;

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.j$a$a, reason: collision with other inner class name */
        public static class C0431a implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11924a;

            public C0431a(IBinder iBinder) {
                this.f11924a = iBinder;
            }

            @Override // com.xiaomi.fitness.device.manager.j
            public void addProductChangeListener(i iVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.ProductManagerRemote");
                    parcelObtain.writeStrongInterface(iVar);
                    this.f11924a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11924a;
            }

            @Override // com.xiaomi.fitness.device.manager.j
            public void clear() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.ProductManagerRemote");
                    this.f11924a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.j
            public WearableProduct findProduct(k kVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.ProductManagerRemote");
                    parcelObtain.writeStrongInterface(kVar);
                    this.f11924a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (WearableProduct) b.d(parcelObtain2, WearableProduct.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.j
            public WearableProduct getProductByModel(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.ProductManagerRemote");
                    parcelObtain.writeString(str);
                    this.f11924a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (WearableProduct) b.d(parcelObtain2, WearableProduct.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.j
            public List<WearableProduct> getProductList(k kVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.ProductManagerRemote");
                    parcelObtain.writeStrongInterface(kVar);
                    this.f11924a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(WearableProduct.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.j
            public boolean isProductNotEmpty() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.ProductManagerRemote");
                    this.f11924a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.j
            public void removeProductChangeListener(i iVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.ProductManagerRemote");
                    parcelObtain.writeStrongInterface(iVar);
                    this.f11924a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.device.manager.ProductManagerRemote");
        }

        public static j asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.device.manager.ProductManagerRemote");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof j)) ? new C0431a(iBinder) : (j) iInterfaceQueryLocalInterface;
        }

        @Override // com.xiaomi.fitness.device.manager.j
        public abstract /* synthetic */ void addProductChangeListener(i iVar) throws RemoteException;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.device.manager.ProductManagerRemote");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.device.manager.ProductManagerRemote");
                return true;
            }
            switch (i) {
                case 1:
                    clear();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    addProductChangeListener(i.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    removeProductChangeListener(i.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    List<WearableProduct> productList = getProductList(k.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    b.e(parcel2, productList, 1);
                    return true;
                case 5:
                    WearableProduct productByModel = getProductByModel(parcel.readString());
                    parcel2.writeNoException();
                    b.f(parcel2, productByModel, 1);
                    return true;
                case 6:
                    WearableProduct wearableProductFindProduct = findProduct(k.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    b.f(parcel2, wearableProductFindProduct, 1);
                    return true;
                case 7:
                    boolean zIsProductNotEmpty = isProductNotEmpty();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsProductNotEmpty ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        @Override // com.xiaomi.fitness.device.manager.j
        public abstract /* synthetic */ void removeProductChangeListener(i iVar) throws RemoteException;
    }

    public static class b {
        public static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void e(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                f(parcel, list.get(i2), i);
            }
        }

        public static <T extends Parcelable> void f(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void addProductChangeListener(i iVar) throws RemoteException;

    void clear() throws RemoteException;

    WearableProduct findProduct(k kVar) throws RemoteException;

    WearableProduct getProductByModel(String str) throws RemoteException;

    List<WearableProduct> getProductList(k kVar) throws RemoteException;

    boolean isProductNotEmpty() throws RemoteException;

    void removeProductChangeListener(i iVar) throws RemoteException;
}
