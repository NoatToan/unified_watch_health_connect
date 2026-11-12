package m9;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f117220a;

    public h(IBinder iBinder) {
        this.f117220a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f117220a;
    }

    @Override // m9.i
    public final void onSuccess() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.health.platform.client.impl.sdkservice.ISetPermissionTokenCallback");
            this.f117220a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
