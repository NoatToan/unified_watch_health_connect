package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.android.deskclock.console.ConsoleAlarm;

/* JADX INFO: loaded from: classes4.dex */
public interface dpc extends IInterface {

    public static abstract class a extends Binder implements dpc {
        private static final String DESCRIPTOR = "com.android.deskclock.console.IAlarmConsoleV1";
        static final int TRANSACTION_onAlert = 3;
        static final int TRANSACTION_onDismiss = 4;
        static final int TRANSACTION_onSnooze = 5;
        static final int TRANSACTION_registerConsoleCallback = 1;
        static final int TRANSACTION_unregisterConsoleCallback = 2;

        /* JADX INFO: renamed from: dpc$a$a, reason: collision with other inner class name */
        public static class C0914a implements dpc {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static dpc f15788b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f15789a;

            public C0914a(IBinder iBinder) {
                this.f15789a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15789a;
            }
        }

        public a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static dpc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof dpc)) ? new C0914a(iBinder) : (dpc) iInterfaceQueryLocalInterface;
        }

        public static dpc getDefaultImpl() {
            return C0914a.f15788b;
        }

        public static boolean setDefaultImpl(dpc dpcVar) {
            if (C0914a.f15788b != null || dpcVar == null) {
                return false;
            }
            C0914a.f15788b = dpcVar;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                registerConsoleCallback(epc.a.s2(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                unregisterConsoleCallback();
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                onAlert(parcel.readInt() != 0 ? ConsoleAlarm.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                onDismiss(parcel.readInt() != 0 ? ConsoleAlarm.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i != 5) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onSnooze(parcel.readInt() != 0 ? ConsoleAlarm.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void onAlert(ConsoleAlarm consoleAlarm) throws RemoteException;

    void onDismiss(ConsoleAlarm consoleAlarm) throws RemoteException;

    void onSnooze(ConsoleAlarm consoleAlarm) throws RemoteException;

    void registerConsoleCallback(epc epcVar) throws RemoteException;

    void unregisterConsoleCallback() throws RemoteException;
}
