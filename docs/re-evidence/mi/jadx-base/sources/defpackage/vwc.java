package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.health.platform.client.error.ErrorStatus;

/* JADX INFO: loaded from: classes.dex */
public interface vwc extends IInterface {

    public static abstract class a extends Binder implements vwc {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* JADX INFO: renamed from: vwc$a$a, reason: collision with other inner class name */
        public static class C1128a implements vwc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f37302a;

            public C1128a(IBinder iBinder) {
                this.f37302a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f37302a;
            }
        }

        public a() {
            attachInterface(this, "androidx.health.platform.client.service.IRegisterForDataNotificationsCallback");
        }

        public static vwc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.health.platform.client.service.IRegisterForDataNotificationsCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof vwc)) ? new C1128a(iBinder) : (vwc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.health.platform.client.service.IRegisterForDataNotificationsCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.health.platform.client.service.IRegisterForDataNotificationsCallback");
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
