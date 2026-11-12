package wb2;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f184066a;

    public n(IBinder iBinder) {
        this.f184066a = iBinder;
    }

    @Override // wb2.o
    public final List<String> Q(long j8) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.garmin.android.lib.connectdevicesync.DeviceSyncConfigCallback");
            parcelObtain.writeLong(j8);
            this.f184066a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createStringArrayList();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f184066a;
    }
}
