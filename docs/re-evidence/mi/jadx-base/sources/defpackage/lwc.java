package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface lwc extends IInterface {

    public static abstract class a extends Binder implements lwc {
        static final int TRANSACTION_onReturn = 1;

        /* JADX INFO: renamed from: lwc$a$a, reason: collision with other inner class name */
        public static class C1010a implements lwc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f25491a;

            public C1010a(IBinder iBinder) {
                this.f25491a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f25491a;
            }
        }

        public a() {
            attachInterface(this, "com.tencent.qqmusiclite.business.third.IQQMusicActionCallback");
        }

        public static lwc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.tencent.qqmusiclite.business.third.IQQMusicActionCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof lwc)) ? new C1010a(iBinder) : (lwc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.tencent.qqmusiclite.business.third.IQQMusicActionCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.tencent.qqmusiclite.business.third.IQQMusicActionCallback");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onReturn((Bundle) b.b(parcel, Bundle.CREATOR));
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

    void onReturn(Bundle bundle) throws RemoteException;
}
