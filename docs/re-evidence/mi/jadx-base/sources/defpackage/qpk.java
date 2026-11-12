package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.mi.command.data.CalibrationResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface qpk extends IInterface {

    public static abstract class a extends Binder implements qpk {

        /* JADX INFO: renamed from: qpk$a$a, reason: collision with other inner class name */
        public static class C1090a implements qpk {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f31724a;

            public C1090a(IBinder iBinder) {
                this.f31724a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f31724a;
            }

            @Override // defpackage.qpk
            public void onFailure(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.ResearchReportCalibrationCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f31724a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.qpk
            public void onSuccess(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.ResearchReportCalibrationCallback");
                    parcelObtain.writeString(str);
                    this.f31724a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.qpk
            public void s0(CalibrationResponse calibrationResponse) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.ResearchReportCalibrationCallback");
                    b.b(parcelObtain, calibrationResponse, 0);
                    this.f31724a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static qpk s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.mi.command.callback.ResearchReportCalibrationCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof qpk)) ? new C1090a(iBinder) : (qpk) iInterfaceQueryLocalInterface;
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

    void onFailure(String str, int i) throws RemoteException;

    void onSuccess(String str) throws RemoteException;

    void s0(CalibrationResponse calibrationResponse) throws RemoteException;
}
