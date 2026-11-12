package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.account.token.MiAccessToken;

/* JADX INFO: loaded from: classes9.dex */
public interface n7h extends IInterface {

    public static abstract class a extends Binder implements n7h {
        static final int TRANSACTION_onChange = 1;

        /* JADX INFO: renamed from: n7h$a$a, reason: collision with other inner class name */
        public static class C1042a implements n7h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f27620a;

            public C1042a(IBinder iBinder) {
                this.f27620a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27620a;
            }

            @Override // defpackage.n7h
            public void onChange(String str, MiAccessToken miAccessToken) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.login.OnAccessTokenChangeListener");
                    parcelObtain.writeString(str);
                    b.d(parcelObtain, miAccessToken, 0);
                    this.f27620a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        miAccessToken.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.login.OnAccessTokenChangeListener");
        }

        public static n7h asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.login.OnAccessTokenChangeListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof n7h)) ? new C1042a(iBinder) : (n7h) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.login.OnAccessTokenChangeListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.login.OnAccessTokenChangeListener");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            String string = parcel.readString();
            MiAccessToken miAccessToken = (MiAccessToken) b.c(parcel, MiAccessToken.CREATOR);
            onChange(string, miAccessToken);
            parcel2.writeNoException();
            b.d(parcel2, miAccessToken, 1);
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

    void onChange(String str, MiAccessToken miAccessToken) throws RemoteException;
}
