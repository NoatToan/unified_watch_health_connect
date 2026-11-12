package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface epc extends IInterface {

    public static abstract class a extends Binder implements epc {

        /* JADX INFO: renamed from: epc$a$a, reason: collision with other inner class name */
        public static class C0925a implements epc {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static epc f16921b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f16922a;

            public C0925a(IBinder iBinder) {
                this.f16922a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16922a;
            }

            @Override // defpackage.epc
            public void c0(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.deskclock.console.IAlarmConsoleV1Callback");
                    parcelObtain.writeInt(i);
                    if (this.f16922a.transact(1, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().c0(i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.epc
            public void e(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.deskclock.console.IAlarmConsoleV1Callback");
                    parcelObtain.writeInt(i);
                    if (this.f16922a.transact(2, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().e(i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static epc h4() {
            return C0925a.f16921b;
        }

        public static epc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.deskclock.console.IAlarmConsoleV1Callback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof epc)) ? new C0925a(iBinder) : (epc) iInterfaceQueryLocalInterface;
        }
    }

    void c0(int i) throws RemoteException;

    void e(int i) throws RemoteException;
}
