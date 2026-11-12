package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface m61 extends IInterface {

    public static abstract class a extends Binder implements m61 {

        /* JADX INFO: renamed from: m61$a$a, reason: collision with other inner class name */
        public static class C1014a implements m61 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f25795a;

            public C1014a(IBinder iBinder) {
                this.f25795a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f25795a;
            }

            @Override // defpackage.m61
            public void f(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.AllDaySpo2Callback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f25795a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static m61 s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.mi.command.callback.AllDaySpo2Callback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof m61)) ? new C1014a(iBinder) : (m61) iInterfaceQueryLocalInterface;
        }
    }

    void f(String str, boolean z) throws RemoteException;
}
