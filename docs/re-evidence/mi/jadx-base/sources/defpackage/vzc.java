package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface vzc extends IInterface {

    public static abstract class a extends Binder implements vzc {

        /* JADX INFO: renamed from: vzc$a$a, reason: collision with other inner class name */
        public static class C1130a implements vzc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f37391a;

            public C1130a(IBinder iBinder) {
                this.f37391a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f37391a;
            }

            @Override // defpackage.vzc
            public void f3(String str, String str2, String str3, String str4) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.analytics.ITrack");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    this.f37391a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static vzc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.miui.analytics.ITrack");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof vzc)) ? new C1130a(iBinder) : (vzc) iInterfaceQueryLocalInterface;
        }
    }

    void f3(String str, String str2, String str3, String str4) throws RemoteException;
}
