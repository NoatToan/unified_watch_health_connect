package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface ouc extends IInterface {

    public static abstract class a extends Binder implements ouc {

        /* JADX INFO: renamed from: ouc$a$a, reason: collision with other inner class name */
        public static class C1071a implements ouc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f29692a;

            public C1071a(IBinder iBinder) {
                this.f29692a = iBinder;
            }

            @Override // defpackage.ouc
            public String R1(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.bluetooth.ble.app.IMiuiNearbyApiService");
                    parcelObtain.writeString(str);
                    this.f29692a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29692a;
            }

            @Override // defpackage.ouc
            public boolean h0(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.bluetooth.ble.app.IMiuiNearbyApiService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f29692a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static ouc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.bluetooth.ble.app.IMiuiNearbyApiService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ouc)) ? new C1071a(iBinder) : (ouc) iInterfaceQueryLocalInterface;
        }
    }

    String R1(String str) throws RemoteException;

    boolean h0(String str, int i) throws RemoteException;
}
