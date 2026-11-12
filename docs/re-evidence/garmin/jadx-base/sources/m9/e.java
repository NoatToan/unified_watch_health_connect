package m9;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f117219a;

    public e(IBinder iBinder) {
        this.f117219a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f117219a;
    }

    @Override // m9.f
    public final void c(String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.health.platform.client.impl.sdkservice.IGetPermissionTokenCallback");
            parcelObtain.writeString(str);
            this.f117219a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
