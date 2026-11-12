package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface puc extends IInterface {

    public static abstract class a extends Binder implements puc {

        /* JADX INFO: renamed from: puc$a$a, reason: collision with other inner class name */
        public static class C1079a implements puc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f30789a;

            public C1079a(IBinder iBinder) {
                this.f30789a = iBinder;
            }

            @Override // defpackage.puc
            public boolean H0(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.bluetooth.ble.app.IMiuiUnlockService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f30789a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30789a;
            }

            @Override // defpackage.puc
            public int getVersion() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.bluetooth.ble.app.IMiuiUnlockService");
                    this.f30789a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.puc
            public int q0(String str, int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.bluetooth.ble.app.IMiuiUnlockService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f30789a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static puc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.bluetooth.ble.app.IMiuiUnlockService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof puc)) ? new C1079a(iBinder) : (puc) iInterfaceQueryLocalInterface;
        }
    }

    boolean H0(String str, boolean z) throws RemoteException;

    int getVersion() throws RemoteException;

    int q0(String str, int i, boolean z) throws RemoteException;
}
