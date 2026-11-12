package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.health.platform.client.error.ErrorStatus;
import androidx.health.platform.client.response.ReadDataResponse;

/* JADX INFO: loaded from: classes.dex */
public interface swc extends IInterface {

    public static abstract class a extends Binder implements swc {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* JADX INFO: renamed from: swc$a$a, reason: collision with other inner class name */
        public static class C1109a implements swc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f34053a;

            public C1109a(IBinder iBinder) {
                this.f34053a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f34053a;
            }
        }

        public a() {
            attachInterface(this, "androidx.health.platform.client.service.IReadDataCallback");
        }

        public static swc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.health.platform.client.service.IReadDataCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof swc)) ? new C1109a(iBinder) : (swc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.health.platform.client.service.IReadDataCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.health.platform.client.service.IReadDataCallback");
                return true;
            }
            if (i == 1) {
                onSuccess((ReadDataResponse) b.b(parcel, ReadDataResponse.CREATOR));
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

    void onSuccess(ReadDataResponse readDataResponse) throws RemoteException;
}
