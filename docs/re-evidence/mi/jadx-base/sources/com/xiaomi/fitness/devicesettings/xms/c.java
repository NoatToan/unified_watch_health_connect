package com.xiaomi.fitness.devicesettings.xms;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface c extends IInterface {

    public static abstract class a extends Binder implements c {

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.xms.c$a$a, reason: collision with other inner class name */
        public static class C0542a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f12056a;

            public C0542a(IBinder iBinder) {
                this.f12056a = iBinder;
            }

            @Override // com.xiaomi.fitness.devicesettings.xms.c
            public void U1(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.devicesettings.xms.IFindDeviceListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f12056a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12056a;
            }
        }

        public static c s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.devicesettings.xms.IFindDeviceListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new C0542a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }
    }

    void U1(String str, int i) throws RemoteException;
}
