package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xiaomi.miplay.audioclient.MediaMetaData;
import com.xiaomi.miplay.audioclient.MiPlayDevice;
import com.xiaomi.miplay.audioclient.MiPlayDeviceControlCenter;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface cuc extends IInterface {

    public static abstract class a extends Binder implements cuc {
        public a() {
            attachInterface(this, "com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    z1();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    m3();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    v3(parcel.readInt() != 0 ? MiPlayDevice.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    x3(parcel.readInt() != 0 ? MiPlayDevice.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    onDeviceLost(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    o(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    k4(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    H3(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    W3(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    P0(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    F0(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    H2(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    a1(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    q3(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    k2(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    l0(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    w1(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    o1(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    a0(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    G4(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    f5(parcel.readInt() != 0 ? MiPlayDeviceControlCenter.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    i1(parcel.readInt() != 0 ? MiPlayDeviceControlCenter.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    b3(parcel.readInt() != 0 ? MediaMetaData.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    u4(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    E1(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    B1(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    S2(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 28:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    x0(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 29:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    K1(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 30:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    i5(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 31:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    x1(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 32:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    L4(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 33:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    W2(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    h();
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    l1(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    U2(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    t0(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 38:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    M3(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 39:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    L2(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    w(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    M1(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    t2(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    o4(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    C(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    S1(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 46:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    c4(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    s1(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 48:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    z0(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    G(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    n3(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 51:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    s3(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 52:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    W1(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 53:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    U(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 54:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    x2(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 55:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    B0(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 56:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    u1(parcel.readString(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 57:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    b1(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 58:
                    parcel.enforceInterface("com.xiaomi.miplay.audioclient.IMiPlayClientCallback");
                    c2(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void B0(Map map) throws RemoteException;

    void B1(Map map) throws RemoteException;

    void C(Map map) throws RemoteException;

    void E1(Map map) throws RemoteException;

    void F0(Map map) throws RemoteException;

    void G(String str) throws RemoteException;

    void G4(String str) throws RemoteException;

    void H2(Map map) throws RemoteException;

    void H3(Map map) throws RemoteException;

    void K1(Map map) throws RemoteException;

    void L2(Map map) throws RemoteException;

    void L4(Map map) throws RemoteException;

    void M1(Map map) throws RemoteException;

    void M3(Map map) throws RemoteException;

    void P0(Map map) throws RemoteException;

    void S1(String str) throws RemoteException;

    void S2(Map map) throws RemoteException;

    void U(String str, int i) throws RemoteException;

    void U2(Map map) throws RemoteException;

    void W1(String str, String str2, int i) throws RemoteException;

    void W2(String str) throws RemoteException;

    void W3(Map map) throws RemoteException;

    void a0(Map map) throws RemoteException;

    void a1(Map map) throws RemoteException;

    void b1(String str, String str2) throws RemoteException;

    void b3(MediaMetaData mediaMetaData) throws RemoteException;

    void c2(String str, String str2) throws RemoteException;

    void c4(String str, String str2) throws RemoteException;

    void f5(MiPlayDeviceControlCenter miPlayDeviceControlCenter) throws RemoteException;

    void h() throws RemoteException;

    void i1(MiPlayDeviceControlCenter miPlayDeviceControlCenter) throws RemoteException;

    void i5(Map map) throws RemoteException;

    void k2(Map map) throws RemoteException;

    void k4(String str, int i) throws RemoteException;

    void l0(Map map) throws RemoteException;

    void l1(Map map) throws RemoteException;

    void m3() throws RemoteException;

    void n3(String str, byte[] bArr) throws RemoteException;

    void o(Map map) throws RemoteException;

    void o1(Map map) throws RemoteException;

    void o4(Map map) throws RemoteException;

    void onDeviceLost(String str) throws RemoteException;

    void q3(Map map) throws RemoteException;

    void s1(String str, int i) throws RemoteException;

    void s3(String str, int i, int i2) throws RemoteException;

    void t0(Map map) throws RemoteException;

    void t2(Map map) throws RemoteException;

    void u1(String str, int i, String str2) throws RemoteException;

    void u4(Map map) throws RemoteException;

    void v3(MiPlayDevice miPlayDevice) throws RemoteException;

    void w(Map map) throws RemoteException;

    void w1(Map map) throws RemoteException;

    void x0(Map map) throws RemoteException;

    void x1(String str, byte[] bArr) throws RemoteException;

    void x2(Map map) throws RemoteException;

    void x3(MiPlayDevice miPlayDevice) throws RemoteException;

    void z0(String str) throws RemoteException;

    void z1() throws RemoteException;
}
