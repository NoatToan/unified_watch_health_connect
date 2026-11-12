package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface zah extends IInterface {

    public static abstract class a extends Binder implements zah {

        /* JADX INFO: renamed from: zah$a$a, reason: collision with other inner class name */
        public static class C1165a implements zah {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static zah f41075b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f41076a;

            public C1165a(IBinder iBinder) {
                this.f41076a = iBinder;
            }

            @Override // defpackage.zah
            public boolean Q2() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    if (!this.f41076a.transact(2, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().Q2();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f41076a;
            }

            @Override // defpackage.zah
            public String n2() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    if (!this.f41076a.transact(1, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().n2();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static zah h4() {
            return C1165a.f41075b;
        }

        public static zah s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof zah)) ? new C1165a(iBinder) : (zah) iInterfaceQueryLocalInterface;
        }
    }

    boolean Q2() throws RemoteException;

    String n2() throws RemoteException;
}
