package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface ru6 extends IInterface {

    public static abstract class a extends Binder implements ru6 {

        /* JADX INFO: renamed from: ru6$a$a, reason: collision with other inner class name */
        public static class C1099a implements ru6 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f32907a;

            public C1099a(IBinder iBinder) {
                this.f32907a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f32907a;
            }

            @Override // defpackage.ru6
            public void onFailure(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.DeviceVersionInfo");
                    parcelObtain.writeString(str);
                    this.f32907a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.ru6
            public void onSuccess(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.DeviceVersionInfo");
                    parcelObtain.writeString(str);
                    this.f32907a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static ru6 s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.mi.command.callback.DeviceVersionInfo");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ru6)) ? new C1099a(iBinder) : (ru6) iInterfaceQueryLocalInterface;
        }
    }

    void onFailure(String str) throws RemoteException;

    void onSuccess(String str) throws RemoteException;
}
