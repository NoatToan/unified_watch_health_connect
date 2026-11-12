package com.miui.headset.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        private static final String DESCRIPTOR = "com.miui.headset.api.IHeadsetHostListener";
        static final int TRANSACTION_onHeadsetHostLost = 103;
        static final int TRANSACTION_onHeadsetHostUpdate = 102;

        /* JADX INFO: renamed from: com.miui.headset.api.b$a$a, reason: collision with other inner class name */
        public static class C0324a implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static b f10312b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f10313a;

            public C0324a(IBinder iBinder) {
                this.f10313a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10313a;
            }
        }

        public a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0324a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        public static b getDefaultImpl() {
            return C0324a.f10312b;
        }

        public static boolean setDefaultImpl(b bVar) {
            if (C0324a.f10312b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (bVar == null) {
                return false;
            }
            C0324a.f10312b = bVar;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 102) {
                parcel.enforceInterface(DESCRIPTOR);
                onHeadsetHostUpdate(parcel.readInt(), parcel.readInt() != 0 ? HeadsetHost.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i == 103) {
                parcel.enforceInterface(DESCRIPTOR);
                onHeadsetHostLost(parcel.readString());
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    void onHeadsetHostLost(String str) throws RemoteException;

    void onHeadsetHostUpdate(int i, HeadsetHost headsetHost) throws RemoteException;
}
