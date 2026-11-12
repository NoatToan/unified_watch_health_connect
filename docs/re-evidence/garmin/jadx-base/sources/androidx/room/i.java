package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface i extends IInterface {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f10847g = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    public static abstract class a extends Binder implements i {

        /* JADX INFO: renamed from: androidx.room.i$a$a, reason: collision with other inner class name */
        public static class C0152a implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f10848a;

            public C0152a(IBinder iBinder) {
                this.f10848a = iBinder;
            }

            @Override // androidx.room.i
            public final void H(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(i.f10847g);
                    parcelObtain.writeStringArray(strArr);
                    this.f10848a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f10848a;
            }
        }

        public a() {
            attachInterface(this, i.f10847g);
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
            String str = i.f10847g;
            if (i14 >= 1 && i14 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i14 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i14 != 1) {
                return super.onTransact(i14, parcel, parcel2, i15);
            }
            ((r.a) this).H(parcel.createStringArray());
            return true;
        }
    }

    void H(String[] strArr);
}
