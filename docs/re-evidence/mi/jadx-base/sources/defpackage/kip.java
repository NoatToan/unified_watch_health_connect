package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.account.token.MiAccessToken;

/* JADX INFO: loaded from: classes9.dex */
public interface kip extends IInterface {

    public static abstract class a extends Binder implements kip {
        static final int TRANSACTION_addTokenChangeListener = 3;
        static final int TRANSACTION_getServiceToken = 1;
        static final int TRANSACTION_setServiceToken = 2;
        static final int TRANSACTION_update = 4;

        /* JADX INFO: renamed from: kip$a$a, reason: collision with other inner class name */
        public static class C0992a implements kip {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f23898a;

            public C0992a(IBinder iBinder) {
                this.f23898a = iBinder;
            }

            @Override // defpackage.kip
            public void addTokenChangeListener(String str, n7h n7hVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.login.TokenManagerRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(n7hVar);
                    this.f23898a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23898a;
            }

            @Override // defpackage.kip
            public MiAccessToken getServiceToken(String str, boolean z, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.login.TokenManagerRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    this.f23898a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (MiAccessToken) b.c(parcelObtain2, MiAccessToken.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.kip
            public void setServiceToken(String str, MiAccessToken miAccessToken) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.login.TokenManagerRemote");
                    parcelObtain.writeString(str);
                    b.d(parcelObtain, miAccessToken, 0);
                    this.f23898a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.kip
            public void update() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.login.TokenManagerRemote");
                    this.f23898a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.login.TokenManagerRemote");
        }

        public static kip asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.login.TokenManagerRemote");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof kip)) ? new C0992a(iBinder) : (kip) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.login.TokenManagerRemote");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.login.TokenManagerRemote");
                return true;
            }
            if (i == 1) {
                MiAccessToken serviceToken = getServiceToken(parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                parcel2.writeNoException();
                b.d(parcel2, serviceToken, 1);
            } else if (i == 2) {
                setServiceToken(parcel.readString(), (MiAccessToken) b.c(parcel, MiAccessToken.CREATOR));
                parcel2.writeNoException();
            } else if (i == 3) {
                addTokenChangeListener(parcel.readString(), n7h.a.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                update();
                parcel2.writeNoException();
            }
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

    void addTokenChangeListener(String str, n7h n7hVar) throws RemoteException;

    MiAccessToken getServiceToken(String str, boolean z, int i) throws RemoteException;

    void setServiceToken(String str, MiAccessToken miAccessToken) throws RemoteException;

    void update() throws RemoteException;
}
