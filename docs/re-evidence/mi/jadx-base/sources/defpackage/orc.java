package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface orc extends IInterface {

    public static abstract class a extends Binder implements orc {

        /* JADX INFO: renamed from: orc$a$a, reason: collision with other inner class name */
        public static class C1062a implements orc {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static orc f29419b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f29420a;

            public C1062a(IBinder iBinder) {
                this.f29420a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29420a;
            }

            @Override // defpackage.orc
            public String g() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    if (!this.f29420a.transact(1, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().g();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.orc
            public boolean isSupport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    if (!this.f29420a.transact(3, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().isSupport();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static orc h4() {
            return C1062a.f29419b;
        }

        public static orc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.zui.deviceidservice.IDeviceidInterface");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof orc)) ? new C1062a(iBinder) : (orc) iInterfaceQueryLocalInterface;
        }
    }

    String g() throws RemoteException;

    boolean isSupport() throws RemoteException;
}
