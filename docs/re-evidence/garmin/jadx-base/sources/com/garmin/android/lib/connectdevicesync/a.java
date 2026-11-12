package com.garmin.android.lib.connectdevicesync;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ec2.c;
import ec2.e;
import java.util.ArrayList;
import wb2.a0;
import wb2.g0;
import wb2.j;
import wb2.n;
import wb2.o;
import wb2.r;
import wb2.x;

/* JADX INFO: loaded from: classes11.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.garmin.android.lib.connectdevicesync.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0990a extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f49917a = 0;

        /* JADX INFO: renamed from: com.garmin.android.lib.connectdevicesync.a$a$a, reason: collision with other inner class name */
        public static class C0991a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f49918a;

            public C0991a(IBinder iBinder) {
                this.f49918a = iBinder;
            }

            @Override // com.garmin.android.lib.connectdevicesync.a
            public final boolean A() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.lib.connectdevicesync.RemoteDeviceSyncService");
                    this.f49918a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.garmin.android.lib.connectdevicesync.a
            public final boolean V(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.lib.connectdevicesync.RemoteDeviceSyncService");
                    parcelObtain.writeString(str);
                    this.f49918a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f49918a;
            }

            @Override // com.garmin.android.lib.connectdevicesync.a
            public final void i(o oVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.lib.connectdevicesync.RemoteDeviceSyncService");
                    parcelObtain.writeStrongInterface(oVar);
                    this.f49918a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.garmin.android.lib.connectdevicesync.a
            public final void terminate() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.lib.connectdevicesync.RemoteDeviceSyncService");
                    this.f49918a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.garmin.android.lib.connectdevicesync.a
            public final x z(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.lib.connectdevicesync.RemoteDeviceSyncService");
                    parcelObtain.writeString(str);
                    this.f49918a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? x.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0990a() {
            attachInterface(this, "com.garmin.android.lib.connectdevicesync.RemoteDeviceSyncService");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r16v0, types: [android.os.Parcel] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v23 */
        @Override // android.os.Binder
        public final boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
            wb2.a aVarB;
            wb2.a aVarB2;
            if (i14 >= 1 && i14 <= 16777215) {
                parcel.enforceInterface("com.garmin.android.lib.connectdevicesync.RemoteDeviceSyncService");
            }
            if (i14 == 1598968902) {
                parcel2.writeString("com.garmin.android.lib.connectdevicesync.RemoteDeviceSyncService");
                return true;
            }
            ?? H = 0;
            P = 0;
            ?? P = 0;
            i = 0;
            i = 0;
            i = 0;
            i = 0;
            int i16 = 0;
            a0 a0VarF = null;
            o nVar = null;
            bundleE = null;
            Bundle bundleE = null;
            a0VarArr = null;
            a0[] a0VarArr = null;
            a0VarF = null;
            a0VarF = null;
            switch (i14) {
                case 1:
                    long j8 = parcel.readLong();
                    String string = parcel.readString();
                    long j14 = parcel.readLong();
                    String string2 = parcel.readString();
                    if (DeviceSyncService.a(DeviceSyncService.this, Binder.getCallingUid())) {
                        r rVarF = r.f();
                        g0 g0VarB = DeviceSyncService.b();
                        rVarF.getClass();
                        H = r.f().h(g0VarB, j8, string, j14, j.a(string2, j.ALWAYS_SHOW_PROGRESS), "requestDeviceSync", "Normal");
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(H);
                    return true;
                case 2:
                    boolean zV = ((DeviceSyncService.a) this).V(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zV ? 1 : 0);
                    return true;
                case 3:
                    String string3 = parcel.readString();
                    if (DeviceSyncService.a(DeviceSyncService.this, Binder.getCallingUid()) && (aVarB = r.f().f184104a.b(string3)) != null && aVarB.m()) {
                        a0VarF = aVarB.f();
                    }
                    parcel2.writeNoException();
                    if (a0VarF == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a0VarF.writeToParcel(parcel2, 1);
                    return true;
                case 4:
                    x xVarZ = ((DeviceSyncService.a) this).z(parcel.readString());
                    parcel2.writeNoException();
                    if (xVarZ == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    xVarZ.writeToParcel(parcel2, 1);
                    return true;
                case 5:
                    boolean zA = ((DeviceSyncService.a) this).A();
                    parcel2.writeNoException();
                    parcel2.writeInt(zA ? 1 : 0);
                    return true;
                case 6:
                    if (DeviceSyncService.a(DeviceSyncService.this, Binder.getCallingUid())) {
                        r rVarF2 = r.f();
                        rVarF2.getClass();
                        ArrayList arrayList = new ArrayList();
                        for (wb2.a aVar : rVarF2.f184104a.f184213b.values()) {
                            if (aVar.m()) {
                                arrayList.add(aVar.f());
                            }
                        }
                        if (arrayList.size() != 0) {
                            a0VarArr = (a0[]) arrayList.toArray(new a0[0]);
                        }
                    }
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(a0VarArr, 1);
                    return true;
                case 7:
                    ((DeviceSyncService.a) this).terminate();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    long j15 = parcel.readLong();
                    if (DeviceSyncService.a(DeviceSyncService.this, Binder.getCallingUid()) && e.e()) {
                        il2.e eVar = (il2.e) e.b();
                        c cVar = eVar.f94040b;
                        if (cVar.getUserProfilePk() == j15 || (j15 != -1 && cVar.getUserProfilePk() == -1 && eVar.p())) {
                            i16 = 1;
                        }
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i16);
                    return true;
                case 9:
                    String string4 = parcel.readString();
                    if (DeviceSyncService.a(DeviceSyncService.this, Binder.getCallingUid()) && (aVarB2 = r.f().f184104a.b(string4)) != null) {
                        bundleE = aVarB2.e();
                    }
                    parcel2.writeNoException();
                    if (bundleE == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    bundleE.writeToParcel(parcel2, 1);
                    return true;
                case 10:
                    if (DeviceSyncService.a(DeviceSyncService.this, Binder.getCallingUid()) && e.e()) {
                        P = ((il2.e) e.b()).p();
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(P);
                    return true;
                case 11:
                    boolean zA2 = DeviceSyncService.a(DeviceSyncService.this, Binder.getCallingUid());
                    parcel2.writeNoException();
                    parcel2.writeInt(zA2 ? 1 : 0);
                    return true;
                case 12:
                    IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.garmin.android.lib.connectdevicesync.DeviceSyncConfigCallback");
                        nVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof o)) ? new n(strongBinder) : (o) iInterfaceQueryLocalInterface;
                    }
                    ((DeviceSyncService.a) this).i(nVar);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i14, parcel, parcel2, i15);
            }
        }
    }

    boolean A();

    boolean V(String str);

    void i(o oVar);

    void terminate();

    x z(String str);
}
