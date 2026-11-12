package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface jrc extends IInterface {

    public static abstract class a extends Binder implements jrc {

        /* JADX INFO: renamed from: jrc$a$a, reason: collision with other inner class name */
        public static class C0983a implements jrc {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static jrc f23057b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f23058a;

            public C0983a(IBinder iBinder) {
                this.f23058a = iBinder;
            }

            @Override // defpackage.jrc
            public String Q(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.coolpad.deviceidsupport.IDeviceIdManager");
                    parcelObtain.writeString(str);
                    if (!this.f23058a.transact(2, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().Q(str);
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
                return this.f23058a;
            }
        }

        public static jrc h4() {
            return C0983a.f23057b;
        }

        public static jrc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.coolpad.deviceidsupport.IDeviceIdManager");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof jrc)) ? new C0983a(iBinder) : (jrc) iInterfaceQueryLocalInterface;
        }
    }

    String Q(String str) throws RemoteException;
}
