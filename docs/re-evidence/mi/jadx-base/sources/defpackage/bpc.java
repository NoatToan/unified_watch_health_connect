package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface bpc extends IInterface {

    public static abstract class a extends Binder implements bpc {

        /* JADX INFO: renamed from: bpc$a$a, reason: collision with other inner class name */
        public static class C0096a implements bpc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f4450a;

            public C0096a(IBinder iBinder) {
                this.f4450a = iBinder;
            }

            @Override // defpackage.bpc
            public IBinder X2(nqc nqcVar, String str, String str2, String str3, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.aicr.IAiCrCoreService");
                    parcelObtain.writeStrongInterface(nqcVar);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.f4450a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    IBinder strongBinder = parcelObtain2.readStrongBinder();
                    if (parcelObtain2.readInt() != 0) {
                        bundle.readFromParcel(parcelObtain2);
                    }
                    return strongBinder;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4450a;
            }

            @Override // defpackage.bpc
            public void h3(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.aicr.IAiCrCoreService");
                    parcelObtain.writeString(str);
                    this.f4450a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.bpc
            public boolean isSupport(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.aicr.IAiCrCoreService");
                    parcelObtain.writeString(str);
                    this.f4450a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static bpc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.aicr.IAiCrCoreService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof bpc)) ? new C0096a(iBinder) : (bpc) iInterfaceQueryLocalInterface;
        }
    }

    IBinder X2(nqc nqcVar, String str, String str2, String str3, Bundle bundle) throws RemoteException;

    void h3(String str) throws RemoteException;

    boolean isSupport(String str) throws RemoteException;
}
