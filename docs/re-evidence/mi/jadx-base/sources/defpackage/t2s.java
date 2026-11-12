package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public class t2s implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f34248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34249b;

    public t2s(IBinder iBinder, String str) {
        this.f34248a = iBinder;
        this.f34249b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34248a;
    }

    public final void h4(int i, Parcel parcel) throws RemoteException {
        try {
            this.f34248a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel s2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f34249b);
        return parcelObtain;
    }
}
