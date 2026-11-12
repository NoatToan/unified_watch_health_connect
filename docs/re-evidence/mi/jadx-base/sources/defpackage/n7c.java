package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface n7c extends IInterface {

    public static abstract class a extends Binder implements n7c {

        /* JADX INFO: renamed from: n7c$a$a, reason: collision with other inner class name */
        public static class C1041a implements n7c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f27615a;

            public C1041a(IBinder iBinder) {
                this.f27615a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27615a;
            }

            @Override // defpackage.n7c
            public void f(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.HighAccuracySleepCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f27615a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static n7c s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.mi.command.callback.HighAccuracySleepCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof n7c)) ? new C1041a(iBinder) : (n7c) iInterfaceQueryLocalInterface;
        }
    }

    void f(String str, boolean z) throws RemoteException;
}
