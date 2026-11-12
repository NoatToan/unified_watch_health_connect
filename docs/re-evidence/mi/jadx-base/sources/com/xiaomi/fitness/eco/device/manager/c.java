package com.xiaomi.fitness.eco.device.manager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.device.manager.i;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import defpackage.aw7;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface c extends IInterface {

    public static abstract class a extends Binder implements c {
        static final int TRANSACTION_addProductChangeListener = 2;
        static final int TRANSACTION_clear = 1;
        static final int TRANSACTION_findProduct = 6;
        static final int TRANSACTION_getProductByModel = 5;
        static final int TRANSACTION_getProductList = 4;
        static final int TRANSACTION_removeProductChangeListener = 3;

        /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.c$a$a, reason: collision with other inner class name */
        public static class C0553a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f12078a;

            public C0553a(IBinder iBinder) {
                this.f12078a = iBinder;
            }

            @Override // com.xiaomi.fitness.eco.device.manager.c
            public void addProductChangeListener(i iVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoProductManagerRemote");
                    parcelObtain.writeStrongInterface(iVar);
                    this.f12078a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12078a;
            }

            @Override // com.xiaomi.fitness.eco.device.manager.c
            public void clear() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoProductManagerRemote");
                    this.f12078a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.c
            public EcoProduct findProduct(aw7 aw7Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoProductManagerRemote");
                    parcelObtain.writeStrongInterface(aw7Var);
                    this.f12078a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (EcoProduct) b.d(parcelObtain2, EcoProduct.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.c
            public EcoProduct getProductByModel(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoProductManagerRemote");
                    parcelObtain.writeString(str);
                    this.f12078a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (EcoProduct) b.d(parcelObtain2, EcoProduct.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.c
            public List<EcoProduct> getProductList(aw7 aw7Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoProductManagerRemote");
                    parcelObtain.writeStrongInterface(aw7Var);
                    this.f12078a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(EcoProduct.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.c
            public void removeProductChangeListener(i iVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoProductManagerRemote");
                    parcelObtain.writeStrongInterface(iVar);
                    this.f12078a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.eco.device.manager.EcoProductManagerRemote");
        }

        public static c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.eco.device.manager.EcoProductManagerRemote");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new C0553a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // com.xiaomi.fitness.eco.device.manager.c
        public abstract /* synthetic */ void addProductChangeListener(i iVar) throws RemoteException;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.eco.device.manager.EcoProductManagerRemote");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.eco.device.manager.EcoProductManagerRemote");
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
                    List<EcoProduct> productList = getProductList(aw7.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    b.e(parcel2, productList, 1);
                    return true;
                case 5:
                    EcoProduct productByModel = getProductByModel(parcel.readString());
                    parcel2.writeNoException();
                    b.f(parcel2, productByModel, 1);
                    return true;
                case 6:
                    EcoProduct ecoProductFindProduct = findProduct(aw7.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    b.f(parcel2, ecoProductFindProduct, 1);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        @Override // com.xiaomi.fitness.eco.device.manager.c
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

    EcoProduct findProduct(aw7 aw7Var) throws RemoteException;

    EcoProduct getProductByModel(String str) throws RemoteException;

    List<EcoProduct> getProductList(aw7 aw7Var) throws RemoteException;

    void removeProductChangeListener(i iVar) throws RemoteException;
}
