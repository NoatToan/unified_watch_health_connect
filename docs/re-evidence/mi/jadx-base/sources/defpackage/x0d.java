package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface x0d extends IInterface {

    public static abstract class a extends Binder implements x0d {
        static final int TRANSACTION_close = 6;
        static final int TRANSACTION_deleteCard = 3;
        static final int TRANSACTION_executeCommands = 2;
        static final int TRANSACTION_getCplc = 4;
        static final int TRANSACTION_getDeviceList = 1;
        static final int TRANSACTION_issueEnd = 8;
        static final int TRANSACTION_issueStart = 7;
        static final int TRANSACTION_open = 5;

        /* JADX INFO: renamed from: x0d$a$a, reason: collision with other inner class name */
        public static class C1143a implements x0d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f38539a;

            public C1143a(IBinder iBinder) {
                this.f38539a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f38539a;
            }
        }

        public a() {
            attachInterface(this, "com.mi.health.nfc.opensdk.IXMWearBYDOpenService");
        }

        public static x0d asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.mi.health.nfc.opensdk.IXMWearBYDOpenService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof x0d)) ? new C1143a(iBinder) : (x0d) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.mi.health.nfc.opensdk.IXMWearBYDOpenService");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.mi.health.nfc.opensdk.IXMWearBYDOpenService");
                return true;
            }
            switch (i) {
                case 1:
                    String deviceList = getDeviceList();
                    parcel2.writeNoException();
                    parcel2.writeString(deviceList);
                    return true;
                case 2:
                    String strExecuteCommands = executeCommands(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeString(strExecuteCommands);
                    return true;
                case 3:
                    String strDeleteCard = deleteCard(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strDeleteCard);
                    return true;
                case 4:
                    String cplc = getCplc();
                    parcel2.writeNoException();
                    parcel2.writeString(cplc);
                    return true;
                case 5:
                    String strOpen = open();
                    parcel2.writeNoException();
                    parcel2.writeString(strOpen);
                    return true;
                case 6:
                    String strClose = close();
                    parcel2.writeNoException();
                    parcel2.writeString(strClose);
                    return true;
                case 7:
                    issueStart();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    issueEnd(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    String close() throws RemoteException;

    String deleteCard(String str) throws RemoteException;

    String executeCommands(Map map) throws RemoteException;

    String getCplc() throws RemoteException;

    String getDeviceList() throws RemoteException;

    void issueEnd(boolean z) throws RemoteException;

    void issueStart() throws RemoteException;

    String open() throws RemoteException;
}
