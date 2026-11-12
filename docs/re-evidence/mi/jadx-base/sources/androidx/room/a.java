package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface a extends IInterface {
    public static final String Rb = "androidx$room$IMultiInstanceInvalidationCallback".replace(Typography.dollar, '.');

    /* JADX INFO: renamed from: androidx.room.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0074a extends Binder implements a {
        static final int TRANSACTION_onInvalidation = 1;

        /* JADX INFO: renamed from: androidx.room.a$a$a, reason: collision with other inner class name */
        public static class C0075a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f2981a;

            public C0075a(IBinder iBinder) {
                this.f2981a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2981a;
            }

            @Override // androidx.room.a
            public void onInvalidation(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.Rb);
                    parcelObtain.writeStringArray(strArr);
                    this.f2981a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0074a() {
            attachInterface(this, a.Rb);
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.Rb);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0075a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = a.Rb;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onInvalidation(parcel.createStringArray());
            return true;
        }
    }

    void onInvalidation(String[] strArr) throws RemoteException;
}
