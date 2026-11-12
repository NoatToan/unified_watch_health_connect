package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.health.platform.client.error.ErrorStatus;

/* JADX INFO: loaded from: classes.dex */
public interface h0d extends IInterface {

    public static abstract class a extends Binder implements h0d {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* JADX INFO: renamed from: h0d$a$a, reason: collision with other inner class name */
        public static class C0951a implements h0d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f19537a;

            public C0951a(IBinder iBinder) {
                this.f19537a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f19537a;
            }
        }

        public a() {
            attachInterface(this, "androidx.health.platform.client.service.IUpdateDataCallback");
        }

        public static h0d asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.health.platform.client.service.IUpdateDataCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof h0d)) ? new C0951a(iBinder) : (h0d) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.health.platform.client.service.IUpdateDataCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.health.platform.client.service.IUpdateDataCallback");
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
