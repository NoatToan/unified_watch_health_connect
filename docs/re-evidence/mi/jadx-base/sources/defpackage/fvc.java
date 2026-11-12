package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.health.platform.client.changes.ChangesEvent;

/* JADX INFO: loaded from: classes.dex */
public interface fvc extends IInterface {

    public static abstract class a extends Binder implements fvc {
        static final int TRANSACTION_onChanges = 1;

        /* JADX INFO: renamed from: fvc$a$a, reason: collision with other inner class name */
        public static class C0937a implements fvc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f18284a;

            public C0937a(IBinder iBinder) {
                this.f18284a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18284a;
            }
        }

        public a() {
            attachInterface(this, "androidx.health.platform.client.service.IOnChangesListener");
        }

        public static fvc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.health.platform.client.service.IOnChangesListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof fvc)) ? new C0937a(iBinder) : (fvc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.health.platform.client.service.IOnChangesListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.health.platform.client.service.IOnChangesListener");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onChanges((ChangesEvent) b.b(parcel, ChangesEvent.CREATOR));
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

    void onChanges(ChangesEvent changesEvent) throws RemoteException;
}
