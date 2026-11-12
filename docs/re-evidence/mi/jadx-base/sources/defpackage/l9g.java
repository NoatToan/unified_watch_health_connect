package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface l9g extends IInterface {

    public static abstract class a extends Binder implements l9g {

        /* JADX INFO: renamed from: l9g$a$a, reason: collision with other inner class name */
        public static class C1007a implements l9g {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static l9g f24802b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f24803a;

            public C1007a(IBinder iBinder) {
                this.f24803a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f24803a;
            }

            @Override // defpackage.l9g
            public String g() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    if (!this.f24803a.transact(3, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().g();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.l9g
            public boolean isSupported() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    if (!this.f24803a.transact(1, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().isSupported();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static l9g h4() {
            return C1007a.f24802b;
        }

        public static l9g s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bun.lib.MsaIdInterface");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof l9g)) ? new C1007a(iBinder) : (l9g) iInterfaceQueryLocalInterface;
        }
    }

    String g() throws RemoteException;

    boolean isSupported() throws RemoteException;
}
