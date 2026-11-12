package p9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.permission.Permission;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface l extends IInterface {

    public static abstract class a extends Binder implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f136445a = 0;

        /* JADX INFO: renamed from: p9.l$a$a, reason: collision with other inner class name */
        public static class C2587a implements l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f136446a;

            public C2587a(IBinder iBinder) {
                this.f136446a = iBinder;
            }

            @Override // p9.l
            public final int G() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    this.f136446a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p9.l
            public final void L(n9.s sVar, n9.w wVar, f9.d dVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.b(parcelObtain, sVar);
                    b.b(parcelObtain, wVar);
                    parcelObtain.writeStrongInterface(dVar);
                    this.f136446a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p9.l
            public final void R(n9.s sVar, List list, f9.c cVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.b(parcelObtain, sVar);
                    if (list == null) {
                        parcelObtain.writeInt(-1);
                    } else {
                        int size = list.size();
                        parcelObtain.writeInt(size);
                        for (int i14 = 0; i14 < size; i14++) {
                            b.b(parcelObtain, (Parcelable) list.get(i14));
                        }
                    }
                    parcelObtain.writeStrongInterface(cVar);
                    this.f136446a.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f136446a;
            }

            @Override // p9.l
            public final void b0(n9.s sVar, n9.e eVar, f9.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.b(parcelObtain, sVar);
                    b.b(parcelObtain, eVar);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f136446a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p9.l
            public final void h(n9.s sVar, n9.c cVar, f9.b bVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.b(parcelObtain, sVar);
                    b.b(parcelObtain, cVar);
                    parcelObtain.writeStrongInterface(bVar);
                    this.f136446a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.health.platform.client.service.IHealthDataService");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
            if (i14 >= 1 && i14 <= 16777215) {
                parcel.enforceInterface("androidx.health.platform.client.service.IHealthDataService");
            }
            if (i14 == 1598968902) {
                parcel2.writeString("androidx.health.platform.client.service.IHealthDataService");
                return true;
            }
            if (i14 == 1) {
                int iG = G();
                parcel2.writeNoException();
                parcel2.writeInt(iG);
                return true;
            }
            if (i14 == 4) {
                parcel.createTypedArrayList(Permission.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.health.platform.client.service.IGetGrantedPermissionsCallback");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof k)) {
                        new j(strongBinder);
                    }
                }
                Z();
                parcel2.writeNoException();
                return true;
            }
            IInterface c2588a = null;
            switch (i14) {
                case 9:
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.health.platform.client.service.IRevokeAllPermissionsCallback");
                        if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof w)) {
                            new v(strongBinder2);
                        }
                    }
                    t();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    n9.s sVar = (n9.s) b.a(parcel, n9.s.CREATOR);
                    n9.w wVar = (n9.w) b.a(parcel, n9.w.CREATOR);
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("androidx.health.platform.client.service.IInsertDataCallback");
                        c2588a = (iInterfaceQueryLocalInterface3 == null || !(iInterfaceQueryLocalInterface3 instanceof m)) ? new m.a.C2588a(strongBinder3) : (m) iInterfaceQueryLocalInterface3;
                    }
                    L(sVar, wVar, (f9.d) c2588a);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    n9.s sVar2 = (n9.s) b.a(parcel, n9.s.CREATOR);
                    n9.e eVar = (n9.e) b.a(parcel, n9.e.CREATOR);
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("androidx.health.platform.client.service.IDeleteDataCallback");
                        c2588a = (iInterfaceQueryLocalInterface4 == null || !(iInterfaceQueryLocalInterface4 instanceof c)) ? new c.a.C2584a(strongBinder4) : (c) iInterfaceQueryLocalInterface4;
                    }
                    b0(sVar2, eVar, (f9.a) c2588a);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("androidx.health.platform.client.service.IReadDataCallback");
                        if (iInterfaceQueryLocalInterface5 == null || !(iInterfaceQueryLocalInterface5 instanceof o)) {
                            new n(strongBinder5);
                        }
                    }
                    j0();
                    parcel2.writeNoException();
                    return true;
                case 13:
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("androidx.health.platform.client.service.IUpdateDataCallback");
                        if (iInterfaceQueryLocalInterface6 == null || !(iInterfaceQueryLocalInterface6 instanceof a0)) {
                            new z(strongBinder6);
                        }
                    }
                    h0();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    n9.s sVar3 = (n9.s) b.a(parcel, n9.s.CREATOR);
                    n9.c cVar = (n9.c) b.a(parcel, n9.c.CREATOR);
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("androidx.health.platform.client.service.IDeleteDataRangeCallback");
                        c2588a = (iInterfaceQueryLocalInterface7 == null || !(iInterfaceQueryLocalInterface7 instanceof d)) ? new d.a.C2585a(strongBinder7) : (d) iInterfaceQueryLocalInterface7;
                    }
                    h(sVar3, cVar, (f9.b) c2588a);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("androidx.health.platform.client.service.IAggregateDataCallback");
                        if (iInterfaceQueryLocalInterface8 == null || !(iInterfaceQueryLocalInterface8 instanceof p9.b)) {
                            new p9.a(strongBinder8);
                        }
                    }
                    j();
                    parcel2.writeNoException();
                    return true;
                case 16:
                    IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("androidx.health.platform.client.service.IReadDataRangeCallback");
                        if (iInterfaceQueryLocalInterface9 == null || !(iInterfaceQueryLocalInterface9 instanceof q)) {
                            new p(strongBinder9);
                        }
                    }
                    v();
                    parcel2.writeNoException();
                    return true;
                case 17:
                    IBinder strongBinder10 = parcel.readStrongBinder();
                    if (strongBinder10 != null) {
                        IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("androidx.health.platform.client.service.IGetChangesTokenCallback");
                        if (iInterfaceQueryLocalInterface10 == null || !(iInterfaceQueryLocalInterface10 instanceof i)) {
                            new h(strongBinder10);
                        }
                    }
                    K();
                    parcel2.writeNoException();
                    return true;
                case 18:
                    IBinder strongBinder11 = parcel.readStrongBinder();
                    if (strongBinder11 != null) {
                        IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("androidx.health.platform.client.service.IGetChangesCallback");
                        if (iInterfaceQueryLocalInterface11 == null || !(iInterfaceQueryLocalInterface11 instanceof g)) {
                            new f(strongBinder11);
                        }
                    }
                    C();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    IBinder strongBinder12 = parcel.readStrongBinder();
                    if (strongBinder12 != null) {
                        IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("androidx.health.platform.client.service.IRegisterForDataNotificationsCallback");
                        if (iInterfaceQueryLocalInterface12 == null || !(iInterfaceQueryLocalInterface12 instanceof u)) {
                            new t(strongBinder12);
                        }
                    }
                    u();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    IBinder strongBinder13 = parcel.readStrongBinder();
                    if (strongBinder13 != null) {
                        IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("androidx.health.platform.client.service.IUnregisterFromDataNotificationsCallback");
                        if (iInterfaceQueryLocalInterface13 == null || !(iInterfaceQueryLocalInterface13 instanceof y)) {
                            new x(strongBinder13);
                        }
                    }
                    k();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    IBinder strongBinder14 = parcel.readStrongBinder();
                    if (strongBinder14 != null) {
                        IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("androidx.health.platform.client.service.IUpsertExerciseRouteCallback");
                        if (iInterfaceQueryLocalInterface14 == null || !(iInterfaceQueryLocalInterface14 instanceof c0)) {
                            new b0(strongBinder14);
                        }
                    }
                    i0();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    IBinder strongBinder15 = parcel.readStrongBinder();
                    if (strongBinder15 != null) {
                        IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("androidx.health.platform.client.service.IReadExerciseRouteCallback");
                        if (iInterfaceQueryLocalInterface15 == null || !(iInterfaceQueryLocalInterface15 instanceof s)) {
                            new r(strongBinder15);
                        }
                    }
                    W();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    n9.s sVar4 = (n9.s) b.a(parcel, n9.s.CREATOR);
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Permission.CREATOR);
                    IBinder strongBinder16 = parcel.readStrongBinder();
                    if (strongBinder16 != null) {
                        IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("androidx.health.platform.client.service.IFilterGrantedPermissionsCallback");
                        c2588a = (iInterfaceQueryLocalInterface16 == null || !(iInterfaceQueryLocalInterface16 instanceof e)) ? new e.a.C2586a(strongBinder16) : (e) iInterfaceQueryLocalInterface16;
                    }
                    R(sVar4, arrayListCreateTypedArrayList, (f9.c) c2588a);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i14, parcel, parcel2, i15);
            }
        }
    }

    public static class b {
        public static Object a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void b(Parcel parcel, Parcelable parcelable) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, 0);
            }
        }
    }

    void C();

    int G();

    void K();

    void L(n9.s sVar, n9.w wVar, f9.d dVar);

    void R(n9.s sVar, List list, f9.c cVar);

    void W();

    void Z();

    void b0(n9.s sVar, n9.e eVar, f9.a aVar);

    void h(n9.s sVar, n9.c cVar, f9.b bVar);

    void h0();

    void i0();

    void j();

    void j0();

    void k();

    void t();

    void u();

    void v();
}
