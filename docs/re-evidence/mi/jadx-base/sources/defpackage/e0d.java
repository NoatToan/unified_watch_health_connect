package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.health.platform.client.error.ErrorStatus;

/* JADX INFO: loaded from: classes.dex */
public interface e0d extends IInterface {

    public static abstract class a extends Binder implements e0d {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* JADX INFO: renamed from: e0d$a$a, reason: collision with other inner class name */
        public static class C0918a implements e0d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f16122a;

            public C0918a(IBinder iBinder) {
                this.f16122a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16122a;
            }
        }

        public a() {
            attachInterface(this, "androidx.health.platform.client.service.IUnregisterFromDataNotificationsCallback");
        }

        public static e0d asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.health.platform.client.service.IUnregisterFromDataNotificationsCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e0d)) ? new C0918a(iBinder) : (e0d) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.health.platform.client.service.IUnregisterFromDataNotificationsCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.health.platform.client.service.IUnregisterFromDataNotificationsCallback");
                return true;
            }
            if (i == 1) {
                onSuccess();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onError((ErrorStatus) b.b(parcel, ErrorStatus.CREATOR));
            }
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

    void onError(ErrorStatus errorStatus) throws RemoteException;

    void onSuccess() throws RemoteException;
}
