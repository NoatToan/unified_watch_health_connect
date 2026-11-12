package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface hpk extends IInterface {

    public static abstract class a extends Binder implements hpk {

        /* JADX INFO: renamed from: hpk$a$a, reason: collision with other inner class name */
        public static class C0954a implements hpk {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f20321a;

            public C0954a(IBinder iBinder) {
                this.f20321a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f20321a;
            }

            @Override // defpackage.hpk
            public void onFailure(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.ResearchCommandCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f20321a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.hpk
            public void onSuccess(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.ResearchCommandCallback");
                    parcelObtain.writeString(str);
                    this.f20321a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static hpk s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.mi.command.callback.ResearchCommandCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof hpk)) ? new C0954a(iBinder) : (hpk) iInterfaceQueryLocalInterface;
        }
    }

    void onFailure(String str, int i) throws RemoteException;

    void onSuccess(String str) throws RemoteException;
}
