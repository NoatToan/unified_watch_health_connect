package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.health.platform.client.error.ErrorStatus;
import androidx.health.platform.client.response.GetChangesTokenResponse;

/* JADX INFO: loaded from: classes.dex */
public interface rsc extends IInterface {

    public static abstract class a extends Binder implements rsc {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* JADX INFO: renamed from: rsc$a$a, reason: collision with other inner class name */
        public static class C1098a implements rsc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f32853a;

            public C1098a(IBinder iBinder) {
                this.f32853a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f32853a;
            }
        }

        public a() {
            attachInterface(this, "androidx.health.platform.client.service.IGetChangesTokenCallback");
        }

        public static rsc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.health.platform.client.service.IGetChangesTokenCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof rsc)) ? new C1098a(iBinder) : (rsc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.health.platform.client.service.IGetChangesTokenCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.health.platform.client.service.IGetChangesTokenCallback");
                return true;
            }
            if (i == 1) {
                onSuccess((GetChangesTokenResponse) b.b(parcel, GetChangesTokenResponse.CREATOR));
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

    void onSuccess(GetChangesTokenResponse getChangesTokenResponse) throws RemoteException;
}
