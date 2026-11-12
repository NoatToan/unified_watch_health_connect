package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface fyc extends IInterface {

    public static abstract class a extends Binder implements fyc {
        static final int TRANSACTION_getServiceBinder = 1;
        static final int TRANSACTION_getSmartWearServiceInfo = 4;
        static final int TRANSACTION_registCallback = 2;
        static final int TRANSACTION_unRegistCallback = 3;

        /* JADX INFO: renamed from: fyc$a$a, reason: collision with other inner class name */
        public static class C0939a implements fyc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f18371a;

            public C0939a(IBinder iBinder) {
                this.f18371a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18371a;
            }
        }

        public a() {
            attachInterface(this, "com.chinatelecom.multisimservice.IServiceBinder");
        }

        public static fyc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.chinatelecom.multisimservice.IServiceBinder");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof fyc)) ? new C0939a(iBinder) : (fyc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.chinatelecom.multisimservice.IServiceBinder");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.chinatelecom.multisimservice.IServiceBinder");
                return true;
            }
            if (i == 1) {
                IBinder serviceBinder = getServiceBinder(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(serviceBinder);
            } else if (i == 2) {
                registCallback(pyc.a.s2(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 3) {
                unRegistCallback(pyc.a.s2(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                getSmartWearServiceInfo();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    IBinder getServiceBinder(String str, String str2) throws RemoteException;

    void getSmartWearServiceInfo() throws RemoteException;

    void registCallback(pyc pycVar) throws RemoteException;

    void unRegistCallback(pyc pycVar) throws RemoteException;
}
