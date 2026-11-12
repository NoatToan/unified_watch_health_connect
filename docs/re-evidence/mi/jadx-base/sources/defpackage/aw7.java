package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;

/* JADX INFO: loaded from: classes8.dex */
public interface aw7 extends IInterface {

    public static abstract class a extends Binder implements aw7 {
        static final int TRANSACTION_predicate = 1;

        /* JADX INFO: renamed from: aw7$a$a, reason: collision with other inner class name */
        public static class C0093a implements aw7 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f3509a;

            public C0093a(IBinder iBinder) {
                this.f3509a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3509a;
            }

            @Override // defpackage.aw7
            public boolean predicate(EcoProduct ecoProduct) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.export.EcoProductPredicate");
                    b.d(parcelObtain, ecoProduct, 0);
                    this.f3509a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.eco.device.manager.export.EcoProductPredicate");
        }

        public static aw7 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.eco.device.manager.export.EcoProductPredicate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof aw7)) ? new C0093a(iBinder) : (aw7) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.eco.device.manager.export.EcoProductPredicate");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.eco.device.manager.export.EcoProductPredicate");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            boolean zPredicate = predicate((EcoProduct) b.c(parcel, EcoProduct.CREATOR));
            parcel2.writeNoException();
            parcel2.writeInt(zPredicate ? 1 : 0);
            return true;
        }
    }

    public static class b {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    boolean predicate(EcoProduct ecoProduct) throws RemoteException;
}
