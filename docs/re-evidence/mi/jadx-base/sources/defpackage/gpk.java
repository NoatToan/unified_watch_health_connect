package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.mi.command.data.CalibrationResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface gpk extends IInterface {

    public static abstract class a extends Binder implements gpk {

        /* JADX INFO: renamed from: gpk$a$a, reason: collision with other inner class name */
        public static class C0943a implements gpk {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f19217a;

            public C0943a(IBinder iBinder) {
                this.f19217a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f19217a;
            }

            @Override // defpackage.gpk
            public void k3(CalibrationResponse calibrationResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.ResearchCalibrationCallback");
                    b.b(parcelObtain, calibrationResponse, 0);
                    this.f19217a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.gpk
            public void onFailure(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.ResearchCalibrationCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f19217a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.gpk
            public void onSuccess(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.ResearchCalibrationCallback");
                    parcelObtain.writeString(str);
                    this.f19217a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.gpk
            public void u3(CalibrationResponse calibrationResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.ResearchCalibrationCallback");
                    b.b(parcelObtain, calibrationResponse, 0);
                    this.f19217a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static gpk s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.mi.command.callback.ResearchCalibrationCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof gpk)) ? new C0943a(iBinder) : (gpk) iInterfaceQueryLocalInterface;
        }
    }

    public static class b {
        public static <T extends Parcelable> void b(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void k3(CalibrationResponse calibrationResponse) throws RemoteException;

    void onFailure(String str, int i) throws RemoteException;

    void onSuccess(String str) throws RemoteException;

    void u3(CalibrationResponse calibrationResponse) throws RemoteException;
}
