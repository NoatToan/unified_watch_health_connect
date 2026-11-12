package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface scb extends IInterface {

    public static abstract class a extends Binder implements scb {

        /* JADX INFO: renamed from: scb$a$a, reason: collision with other inner class name */
        public static class C1102a implements scb {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f33503a;

            public C1102a(IBinder iBinder) {
                this.f33503a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f33503a;
            }

            @Override // defpackage.scb
            public void k5(String str, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.HBPMCalibrationStatusCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.f33503a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.scb
            public void onFail(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.HBPMCalibrationStatusCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f33503a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static scb s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.mi.command.callback.HBPMCalibrationStatusCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof scb)) ? new C1102a(iBinder) : (scb) iInterfaceQueryLocalInterface;
        }
    }

    void k5(String str, int i, int i2) throws RemoteException;

    void onFail(String str, int i) throws RemoteException;
}
