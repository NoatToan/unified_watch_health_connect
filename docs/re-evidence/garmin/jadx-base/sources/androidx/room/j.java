package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface j extends IInterface {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f10854h = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    public static abstract class a extends Binder implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f10855a = 0;

        /* JADX INFO: renamed from: androidx.room.j$a$a, reason: collision with other inner class name */
        public static class C0153a implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f10856a;

            public C0153a(IBinder iBinder) {
                this.f10856a = iBinder;
            }

            @Override // androidx.room.j
            public final void E(i iVar, int i14) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(j.f10854h);
                    parcelObtain.writeStrongInterface(iVar);
                    parcelObtain.writeInt(i14);
                    this.f10856a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f10856a;
            }

            @Override // androidx.room.j
            public final void c0(int i14, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(j.f10854h);
                    parcelObtain.writeInt(i14);
                    parcelObtain.writeStringArray(strArr);
                    this.f10856a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.j
            public final int y(i iVar, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(j.f10854h);
                    parcelObtain.writeStrongInterface(iVar);
                    parcelObtain.writeString(str);
                    this.f10856a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, j.f10854h);
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
            String str = j.f10854h;
            if (i14 >= 1 && i14 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i14 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            i c0152a = null;
            if (i14 == 1) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(i.f10847g);
                    c0152a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof i)) ? new i.a.C0152a(strongBinder) : (i) iInterfaceQueryLocalInterface;
                }
                int iY = ((MultiInstanceInvalidationService.a) this).y(c0152a, parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iY);
                return true;
            }
            if (i14 != 2) {
                if (i14 != 3) {
                    return super.onTransact(i14, parcel, parcel2, i15);
                }
                ((MultiInstanceInvalidationService.a) this).c0(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(i.f10847g);
                c0152a = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof i)) ? new i.a.C0152a(strongBinder2) : (i) iInterfaceQueryLocalInterface2;
            }
            ((MultiInstanceInvalidationService.a) this).E(c0152a, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void E(i iVar, int i14);

    void c0(int i14, String[] strArr);

    int y(i iVar, String str);
}
