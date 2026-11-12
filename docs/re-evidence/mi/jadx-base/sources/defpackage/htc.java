package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.health.platform.client.error.ErrorStatus;
import androidx.health.platform.client.response.InsertDataResponse;

/* JADX INFO: loaded from: classes.dex */
public interface htc extends IInterface {

    public static abstract class a extends Binder implements htc {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* JADX INFO: renamed from: htc$a$a, reason: collision with other inner class name */
        public static class C0957a implements htc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f20427a;

            public C0957a(IBinder iBinder) {
                this.f20427a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f20427a;
            }
        }

        public a() {
            attachInterface(this, "androidx.health.platform.client.service.IInsertDataCallback");
        }

        public static htc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.health.platform.client.service.IInsertDataCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof htc)) ? new C0957a(iBinder) : (htc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.health.platform.client.service.IInsertDataCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.health.platform.client.service.IInsertDataCallback");
                return true;
            }
            if (i == 1) {
                onSuccess((InsertDataResponse) b.b(parcel, InsertDataResponse.CREATOR));
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

    void onSuccess(InsertDataResponse insertDataResponse) throws RemoteException;
}
