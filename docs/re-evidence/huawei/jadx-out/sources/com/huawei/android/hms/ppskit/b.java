package com.huawei.android.hms.ppskit;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public interface b extends IInterface {
    void a(RemoteInstallReq remoteInstallReq, Uri uri, c cVar);

    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: com.huawei.android.hms.ppskit.b$a$a, reason: collision with other inner class name */
        static class C0057a implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static b f5126b;
            private IBinder e;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.e;
            }

            @Override // com.huawei.android.hms.ppskit.b
            public void a(RemoteInstallReq remoteInstallReq, Uri uri, c cVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.android.hms.ppskit.IPPSInstallationService");
                    if (remoteInstallReq != null) {
                        parcelObtain.writeInt(1);
                        remoteInstallReq.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    if (this.e.transact(1, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.a().a(remoteInstallReq, uri, cVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            C0057a(IBinder iBinder) {
                this.e = iBinder;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("com.huawei.android.hms.ppskit.IPPSInstallationService");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.huawei.android.hms.ppskit.IPPSInstallationService");
            a(parcel.readInt() != 0 ? RemoteInstallReq.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, c.a.a(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.android.hms.ppskit.IPPSInstallationService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0057a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        public static b a() {
            return C0057a.f5126b;
        }
    }
}
