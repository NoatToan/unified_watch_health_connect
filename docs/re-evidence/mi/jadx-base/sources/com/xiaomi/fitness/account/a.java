package com.xiaomi.fitness.account;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.fitness.account.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0377a extends Binder implements a {
        static final int TRANSACTION_getMiAccountCoreInfo = 3;
        static final int TRANSACTION_getUserId = 4;
        static final int TRANSACTION_isLogin = 1;
        static final int TRANSACTION_login = 2;

        /* JADX INFO: renamed from: com.xiaomi.fitness.account.a$a$a, reason: collision with other inner class name */
        public static class C0378a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11556a;

            public C0378a(IBinder iBinder) {
                this.f11556a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11556a;
            }
        }

        public AbstractBinderC0377a() {
            attachInterface(this, "com.xiaomi.fitness.account.AccountManagerRemote");
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.account.AccountManagerRemote");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0378a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.account.AccountManagerRemote");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.account.AccountManagerRemote");
                return true;
            }
            if (i == 1) {
                boolean zIsLogin = isLogin();
                parcel2.writeNoException();
                parcel2.writeInt(zIsLogin ? 1 : 0);
            } else if (i == 2) {
                login();
                parcel2.writeNoException();
            } else if (i == 3) {
                MiAccountCoreInfo miAccountCoreInfo = getMiAccountCoreInfo();
                parcel2.writeNoException();
                b.b(parcel2, miAccountCoreInfo, 1);
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                String userId = getUserId();
                parcel2.writeNoException();
                parcel2.writeString(userId);
            }
            return true;
        }
    }

    public static class b {
        public static <T extends Parcelable> void b(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    MiAccountCoreInfo getMiAccountCoreInfo() throws RemoteException;

    String getUserId() throws RemoteException;

    boolean isLogin() throws RemoteException;

    void login() throws RemoteException;
}
