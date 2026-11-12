package com.xiaomi.fitness.eco.device.manager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceModelRemote;

/* JADX INFO: loaded from: classes8.dex */
public interface d extends IInterface {

    public static abstract class a extends Binder implements d {
        static final int TRANSACTION_onChange = 1;

        /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.d$a$a, reason: collision with other inner class name */
        public static class C0554a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f12079a;

            public C0554a(IBinder iBinder) {
                this.f12079a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12079a;
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.eco.device.manager.OnEcoDeviceChangeListener");
        }

        public static d asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.eco.device.manager.OnEcoDeviceChangeListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new C0554a(iBinder) : (d) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.eco.device.manager.OnEcoDeviceChangeListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.eco.device.manager.OnEcoDeviceChangeListener");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onChange((EcoDeviceModelRemote) b.b(parcel, EcoDeviceModelRemote.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    public static class b {
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void onChange(EcoDeviceModelRemote ecoDeviceModelRemote) throws RemoteException;
}
