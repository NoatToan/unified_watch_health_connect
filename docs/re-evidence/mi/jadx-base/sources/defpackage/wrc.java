package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.clockwork.companion.partnerapi.EcoAppNotificationConfig;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface wrc extends IInterface {

    public static abstract class a extends Binder implements wrc {
        public a() {
            attachInterface(this, "com.xiaomi.eco.common.connect.IEcoApiCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.eco.common.connect.IEcoApiCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.eco.common.connect.IEcoApiCallback");
                return true;
            }
            switch (i) {
                case 1:
                    onConnected();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    onConnectFailure(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    onConnectSuccess();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    onDisconnected();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    onDisconnectSuccess();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onDisconnectFailure(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    b(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    onBindSuccess(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    int i3 = parcel.readInt();
                    byte[] bArr = i3 < 0 ? null : new byte[i3];
                    onLocalBindSuccess(string, string2, string3, string4, string5, bArr);
                    parcel2.writeNoException();
                    parcel2.writeByteArray(bArr);
                    return true;
                case 10:
                    onBindFailure(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    onBondSuccess();
                    parcel2.writeNoException();
                    return true;
                case 12:
                    onBondFailure(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    onRemoveSuccess();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    onRemoveFailure(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    P4(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 16:
                    handleData(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 17:
                    s(parcel.readString(), parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    updateDid(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 19:
                    t(parcel.readString(), csc.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    showButtonConfirmDialog();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    dismissButtonConfirmDialog();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    dismissOOB();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    I3(parcel.createStringArrayList());
                    parcel2.writeNoException();
                    return true;
                case 24:
                    u(parcel.createTypedArrayList(EcoAppNotificationConfig.CREATOR));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void I3(List<String> list) throws RemoteException;

    void P4(int i, byte[] bArr) throws RemoteException;

    void b(int i, String str) throws RemoteException;

    void dismissButtonConfirmDialog() throws RemoteException;

    void dismissOOB() throws RemoteException;

    void handleData(int i, byte[] bArr) throws RemoteException;

    void onBindFailure(int i, String str) throws RemoteException;

    void onBindSuccess(String str, String str2, String str3, String str4) throws RemoteException;

    void onBondFailure(int i) throws RemoteException;

    void onBondSuccess() throws RemoteException;

    void onConnectFailure(int i) throws RemoteException;

    void onConnectSuccess() throws RemoteException;

    void onConnected() throws RemoteException;

    void onDisconnectFailure(int i) throws RemoteException;

    void onDisconnectSuccess() throws RemoteException;

    void onDisconnected() throws RemoteException;

    void onLocalBindSuccess(String str, String str2, String str3, String str4, String str5, byte[] bArr) throws RemoteException;

    void onRemoveFailure(int i) throws RemoteException;

    void onRemoveSuccess() throws RemoteException;

    void s(String str, String str2, byte[] bArr) throws RemoteException;

    void showButtonConfirmDialog() throws RemoteException;

    void t(String str, csc cscVar) throws RemoteException;

    void u(List<EcoAppNotificationConfig> list) throws RemoteException;

    void updateDid(String str) throws RemoteException;
}
