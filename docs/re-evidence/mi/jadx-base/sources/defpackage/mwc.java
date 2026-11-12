package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface mwc extends IInterface {

    public static abstract class a extends Binder implements mwc {
        static final int TRANSACTION_fetchData = 2;
        static final int TRANSACTION_onEvent = 1;

        /* JADX INFO: renamed from: mwc$a$a, reason: collision with other inner class name */
        public static class C1038a implements mwc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f27283a;

            public C1038a(IBinder iBinder) {
                this.f27283a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27283a;
            }
        }

        public a() {
            attachInterface(this, "com.tencent.qqmusiclite.business.third.IQQMusicEventCallback");
        }

        public static mwc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.tencent.qqmusiclite.business.third.IQQMusicEventCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof mwc)) ? new C1038a(iBinder) : (mwc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.tencent.qqmusiclite.business.third.IQQMusicEventCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.tencent.qqmusiclite.business.third.IQQMusicEventCallback");
                return true;
            }
            if (i == 1) {
                onEvent(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                Bundle bundleFetchData = fetchData(parcel.readString());
                parcel2.writeNoException();
                b.d(parcel2, bundleFetchData, 1);
            }
            return true;
        }
    }

    public static class b {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    Bundle fetchData(String str) throws RemoteException;

    void onEvent(String str, Bundle bundle) throws RemoteException;
}
