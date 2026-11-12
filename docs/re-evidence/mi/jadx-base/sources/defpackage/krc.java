package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface krc extends IInterface {

    public static abstract class a extends Binder implements krc {

        /* JADX INFO: renamed from: krc$a$a, reason: collision with other inner class name */
        public static class C1002a implements krc {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static krc f24212b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f24213a;

            public C1002a(IBinder iBinder) {
                this.f24213a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f24213a;
            }

            @Override // defpackage.krc
            public String g() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    if (!this.f24213a.transact(1, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().g();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static krc h4() {
            return C1002a.f24212b;
        }

        public static krc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof krc)) ? new C1002a(iBinder) : (krc) iInterfaceQueryLocalInterface;
        }
    }

    String g() throws RemoteException;
}
