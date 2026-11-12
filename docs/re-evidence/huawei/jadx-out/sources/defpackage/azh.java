package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes22.dex */
public class azh implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f839c;
    private final IBinder e;

    protected azh(IBinder iBinder, String str) {
        this.e = iBinder;
        this.f839c = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.e;
    }

    protected final Parcel b() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f839c);
        return parcelObtain;
    }

    protected final void c(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.e.transact(i, parcel, parcelObtain, 1);
            parcelObtain.readException();
        } finally {
            parcelObtain.recycle();
            parcel.recycle();
        }
    }
}
