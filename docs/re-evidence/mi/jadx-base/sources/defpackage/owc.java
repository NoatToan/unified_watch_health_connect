package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface owc extends IInterface {

    public static abstract class a extends Binder implements owc {
        static final int TRANSACTION_onResult = 1;

        /* JADX INFO: renamed from: owc$a$a, reason: collision with other inner class name */
        public static class C1072a implements owc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f29758a;

            public C1072a(IBinder iBinder) {
                this.f29758a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29758a;
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.voiceassistant.query.IQueryReply");
        }

        public static owc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.voiceassistant.query.IQueryReply");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof owc)) ? new C1072a(iBinder) : (owc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.voiceassistant.query.IQueryReply");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.voiceassistant.query.IQueryReply");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onResult((Bundle) b.b(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
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

    void onResult(Bundle bundle) throws RemoteException;
}
