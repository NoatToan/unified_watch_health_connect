package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface ivc extends IInterface {

    public static abstract class a extends Binder implements ivc {
        static final int TRANSACTION_downloadESimProfile = 4;
        static final int TRANSACTION_getAttachedDeviceMultiSimInfo = 3;
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_unRegisterCallback = 2;

        /* JADX INFO: renamed from: ivc$a$a, reason: collision with other inner class name */
        public static class C0977a implements ivc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f22130a;

            public C0977a(IBinder iBinder) {
                this.f22130a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22130a;
            }
        }

        public a() {
            attachInterface(this, "com.chinatelecom.multisimservice.IOpenMultiSim");
        }

        public static ivc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.chinatelecom.multisimservice.IOpenMultiSim");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ivc)) ? new C0977a(iBinder) : (ivc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.chinatelecom.multisimservice.IOpenMultiSim");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.chinatelecom.multisimservice.IOpenMultiSim");
                return true;
            }
            if (i == 1) {
                registerCallback(jvc.a.s2(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 2) {
                unRegisterCallback(jvc.a.s2(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 3) {
                getAttachedDeviceMultiSimInfo();
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                downloadESimProfile(parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void downloadESimProfile(String str) throws RemoteException;

    void getAttachedDeviceMultiSimInfo() throws RemoteException;

    void registerCallback(jvc jvcVar) throws RemoteException;

    void unRegisterCallback(jvc jvcVar) throws RemoteException;
}
