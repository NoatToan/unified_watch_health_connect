package m9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import k32.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends Binder implements IInterface {
    public g() {
        attachInterface(this, "androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 >= 1 && i14 <= 16777215) {
            parcel.enforceInterface("androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService");
        }
        if (i14 == 1598968902) {
            parcel2.writeString("androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService");
            return true;
        }
        Object hVar = null;
        if (i14 == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.health.platform.client.impl.sdkservice.ISetPermissionTokenCallback");
                hVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof i)) ? new h(strongBinder) : (i) iInterfaceQueryLocalInterface;
            }
            b bVar = (b) this;
            bVar.k0(string);
            bVar.f117217b.execute(new fh2.a(bVar, 16, string2, hVar));
            return true;
        }
        if (i14 == 2) {
            String string3 = parcel.readString();
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.health.platform.client.impl.sdkservice.IGetPermissionTokenCallback");
                hVar = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof f)) ? new e(strongBinder2) : (f) iInterfaceQueryLocalInterface2;
            }
            b bVar2 = (b) this;
            bVar2.k0(string3);
            bVar2.f117217b.execute(new l0.e(4, bVar2, hVar));
            return true;
        }
        if (i14 != 3) {
            return super.onTransact(i14, parcel, parcel2, i15);
        }
        String string4 = parcel.readString();
        IBinder strongBinder3 = parcel.readStrongBinder();
        if (strongBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("androidx.health.platform.client.impl.sdkservice.IGetIsInForegroundCallback");
            hVar = (iInterfaceQueryLocalInterface3 == null || !(iInterfaceQueryLocalInterface3 instanceof d)) ? new c(strongBinder3) : (d) iInterfaceQueryLocalInterface3;
        }
        b bVar3 = (b) this;
        bVar3.k0(string4);
        bVar3.f117217b.execute(new n(hVar, 11));
        return true;
    }
}
