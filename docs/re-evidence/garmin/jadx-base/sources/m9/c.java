package m9;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f117218a;

    public c(IBinder iBinder) {
        this.f117218a = iBinder;
    }

    @Override // m9.d
    public final void D(boolean z14) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.health.platform.client.impl.sdkservice.IGetIsInForegroundCallback");
            parcelObtain.writeInt(z14 ? 1 : 0);
            this.f117218a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f117218a;
    }
}
