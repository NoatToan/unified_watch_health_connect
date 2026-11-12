package com.huawei.appmarket.framework.coreservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes23.dex */
public interface b extends IInterface {
    void a(DataHolder dataHolder, com.huawei.appmarket.framework.coreservice.a aVar) throws RemoteException;

    public static abstract class a extends Binder implements b {

        static class d implements b {
            public static b e;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private IBinder f5262c;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5262c;
            }

            @Override // com.huawei.appmarket.framework.coreservice.b
            public void a(DataHolder dataHolder, com.huawei.appmarket.framework.coreservice.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.appmarket.framework.coreservice.IAppGalleryServiceTransport");
                    if (dataHolder != null) {
                        parcelObtain.writeInt(1);
                        dataHolder.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f5262c.transact(1, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.a().a(dataHolder, aVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            d(IBinder iBinder) {
                this.f5262c = iBinder;
            }
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.appmarket.framework.coreservice.IAppGalleryServiceTransport");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new d(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        public static b a() {
            return d.e;
        }
    }
}
