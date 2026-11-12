package com.huawei.hms.kit.awareness;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.kit.awareness.a.a.f;

/* JADX INFO: loaded from: classes34.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f13855c = "com.huawei.hms.kit.awareness.IRemoteWakeup";

    /* JADX INFO: renamed from: com.huawei.hms.kit.awareness.b$b, reason: collision with other inner class name */
    public static class C0143b implements b {
        @Override // com.huawei.hms.kit.awareness.b
        public void a(f fVar) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    void a(f fVar);

    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f13856a = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString(b.f13855c);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(b.f13855c);
            a(parcel.readInt() != 0 ? f.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }

        /* JADX INFO: renamed from: com.huawei.hms.kit.awareness.b$a$a, reason: collision with other inner class name */
        static class C0142a implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static b f13857b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f13858a;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13858a;
            }

            @Override // com.huawei.hms.kit.awareness.b
            public void a(f fVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f13855c);
                    if (fVar != null) {
                        parcelObtain.writeInt(1);
                        fVar.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f13858a.transact(1, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.a().a(fVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String a() {
                return b.f13855c;
            }

            C0142a(IBinder iBinder) {
                this.f13858a = iBinder;
            }
        }

        public static boolean a(b bVar) {
            if (C0142a.f13857b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (bVar == null) {
                return false;
            }
            C0142a.f13857b = bVar;
            return true;
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f13855c);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0142a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        public static b a() {
            return C0142a.f13857b;
        }

        public a() {
            attachInterface(this, b.f13855c);
        }
    }
}
