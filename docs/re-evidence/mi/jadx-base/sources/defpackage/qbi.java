package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes9.dex */
public interface qbi extends IInterface {

    public static abstract class a extends Binder implements qbi {
        static final int TRANSACTION_predicate = 1;

        /* JADX INFO: renamed from: qbi$a$a, reason: collision with other inner class name */
        public static class C1087a implements qbi {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f31342a;

            public C1087a(IBinder iBinder) {
                this.f31342a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f31342a;
            }

            @Override // defpackage.qbi
            public boolean predicate(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.research.ProductPredicate");
                    parcelObtain.writeString(str);
                    this.f31342a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.research.ProductPredicate");
        }

        public static qbi asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.research.ProductPredicate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof qbi)) ? new C1087a(iBinder) : (qbi) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.research.ProductPredicate");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.research.ProductPredicate");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            boolean zPredicate = predicate(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(zPredicate ? 1 : 0);
            return true;
        }
    }

    boolean predicate(String str) throws RemoteException;
}
