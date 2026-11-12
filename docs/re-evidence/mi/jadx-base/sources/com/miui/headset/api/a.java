package com.miui.headset.api;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.miui.headset.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0322a extends Binder implements a {
        private static final String DESCRIPTOR = "com.miui.headset.api.IHeadsetClientController";
        static final int TRANSACTION_onReply = 2;
        static final int TRANSACTION_onReplyIsMmaHeadset = 4;
        static final int TRANSACTION_onReplyMultipointInfo = 3;
        static final int TRANSACTION_onReplySupportAncMode = 5;

        /* JADX INFO: renamed from: com.miui.headset.api.a$a$a, reason: collision with other inner class name */
        public static class C0323a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static a f10310b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f10311a;

            public C0323a(IBinder iBinder) {
                this.f10311a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10311a;
            }
        }

        public AbstractBinderC0322a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0323a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        public static a getDefaultImpl() {
            return C0323a.f10310b;
        }

        public static boolean setDefaultImpl(a aVar) {
            if (C0323a.f10310b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (aVar == null) {
                return false;
            }
            C0323a.f10310b = aVar;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onReply(parcel.readLong(), parcel.readString(), parcel.readInt());
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                onReplyMultipointInfo(parcel.readLong(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                onReplyIsMmaHeadset(parcel.readLong(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i == 5) {
                parcel.enforceInterface(DESCRIPTOR);
                onReplySupportAncMode(parcel.readLong(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    void onReply(long j, String str, int i) throws RemoteException;

    void onReplyIsMmaHeadset(long j, String str, Bundle bundle) throws RemoteException;

    void onReplyMultipointInfo(long j, String str, Bundle bundle) throws RemoteException;

    void onReplySupportAncMode(long j, String str, Bundle bundle) throws RemoteException;
}
