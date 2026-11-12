package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface hvc extends IInterface {

    public static abstract class a extends Binder implements hvc {

        /* JADX INFO: renamed from: hvc$a$a, reason: collision with other inner class name */
        public static class C0958a implements hvc {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static hvc f20508b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f20509a;

            public C0958a(IBinder iBinder) {
                this.f20509a = iBinder;
            }

            @Override // defpackage.hvc
            public String T(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (!this.f20509a.transact(1, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().T(str, str2, str3);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f20509a;
            }
        }

        public static hvc h4() {
            return C0958a.f20508b;
        }

        public static hvc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof hvc)) ? new C0958a(iBinder) : (hvc) iInterfaceQueryLocalInterface;
        }
    }

    String T(String str, String str2, String str3) throws RemoteException;
}
