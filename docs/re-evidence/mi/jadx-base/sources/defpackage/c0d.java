package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface c0d extends IInterface {

    public static abstract class a extends Binder implements c0d {
        public a() {
            attachInterface(this, "com.xiaomi.milink.transmit.aidl.IUDTTransmitService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.milink.transmit.aidl.IUDTTransmitService");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.xiaomi.milink.transmit.aidl.IUDTTransmitService");
                    int iV4 = v4(parcel.readInt(), b0d.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iV4);
                    return true;
                case 2:
                    parcel.enforceInterface("com.xiaomi.milink.transmit.aidl.IUDTTransmitService");
                    int iD = d(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iD);
                    return true;
                case 3:
                    parcel.enforceInterface("com.xiaomi.milink.transmit.aidl.IUDTTransmitService");
                    int iL3 = l3(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iL3);
                    return true;
                case 4:
                    parcel.enforceInterface("com.xiaomi.milink.transmit.aidl.IUDTTransmitService");
                    int iD4 = d4(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iD4);
                    return true;
                case 5:
                    parcel.enforceInterface("com.xiaomi.milink.transmit.aidl.IUDTTransmitService");
                    int iY2 = y2(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iY2);
                    return true;
                case 6:
                    parcel.enforceInterface("com.xiaomi.milink.transmit.aidl.IUDTTransmitService");
                    int iQ = q(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iQ);
                    return true;
                case 7:
                    parcel.enforceInterface("com.xiaomi.milink.transmit.aidl.IUDTTransmitService");
                    int iM2 = M2(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(iM2);
                    return true;
                case 8:
                    parcel.enforceInterface("com.xiaomi.milink.transmit.aidl.IUDTTransmitService");
                    int iJ0 = j0(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(iJ0);
                    return true;
                case 9:
                    parcel.enforceInterface("com.xiaomi.milink.transmit.aidl.IUDTTransmitService");
                    int iA3 = A3(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iA3);
                    return true;
                case 10:
                    parcel.enforceInterface("com.xiaomi.milink.transmit.aidl.IUDTTransmitService");
                    int iT4 = T4(parcel.readInt(), parcel.readInt(), parcel.createByteArray(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iT4);
                    return true;
                case 11:
                    parcel.enforceInterface("com.xiaomi.milink.transmit.aidl.IUDTTransmitService");
                    int iO3 = O3(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(iO3);
                    return true;
                case 12:
                    parcel.enforceInterface("com.xiaomi.milink.transmit.aidl.IUDTTransmitService");
                    int iP3 = p3(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iP3);
                    return true;
                case 13:
                    parcel.enforceInterface("com.xiaomi.milink.transmit.aidl.IUDTTransmitService");
                    int iE = E(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(iE);
                    return true;
                case 14:
                    parcel.enforceInterface("com.xiaomi.milink.transmit.aidl.IUDTTransmitService");
                    int iD1 = d1(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iD1);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    int A3(int i) throws RemoteException;

    int E(int i, int i2, int i3, int i4, byte[] bArr) throws RemoteException;

    int M2(int i, int i2, int i3, int i4, boolean z) throws RemoteException;

    int O3(int i, int i2, int i3, int i4, byte[] bArr) throws RemoteException;

    int T4(int i, int i2, byte[] bArr, int i3) throws RemoteException;

    int d(int i) throws RemoteException;

    int d1(int i, int i2, int i3, int i4) throws RemoteException;

    int d4(int i) throws RemoteException;

    int j0(int i, int i2, int i3, int i4, boolean z) throws RemoteException;

    int l3(int i) throws RemoteException;

    int p3(int i, int i2, int i3, int i4, int i5) throws RemoteException;

    int q(int i) throws RemoteException;

    int v4(int i, b0d b0dVar) throws RemoteException;

    int y2(int i) throws RemoteException;
}
