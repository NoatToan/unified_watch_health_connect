package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.xms.wearable.auth.Permission;
import com.xiaomi.xms.wearable.node.DataItem;
import com.xiaomi.xms.wearable.notify.NotificationData;

/* JADX INFO: loaded from: classes2.dex */
public interface w0d extends IInterface {

    public static abstract class a extends Binder implements w0d {
        public a() {
            attachInterface(this, "com.xiaomi.xms.wearable.IWearableInterface");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.xms.wearable.IWearableInterface");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.xms.wearable.IWearableInterface");
                return true;
            }
            switch (i) {
                case 1:
                    int iL4 = l4();
                    parcel2.writeNoException();
                    parcel2.writeInt(iL4);
                    return true;
                case 2:
                    p1(parcel.readString(), (Permission) b.b(parcel, Permission.CREATOR), yvc.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    D1(parcel.readString(), (Permission[]) parcel.createTypedArray(Permission.CREATOR), bwc.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    n0(parcel.readString(), (Permission[]) parcel.createTypedArray(Permission.CREATOR), xvc.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    L3(vuc.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    b0(parcel.readString(), q0d.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    E4(parcel.readString(), parcel.readString(), r0d.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    e1(parcel.readString(), (DataItem) b.b(parcel, DataItem.CREATOR), yqc.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    m1(parcel.readString(), (DataItem) b.b(parcel, DataItem.CREATOR), zqc.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    O(parcel.readString(), (DataItem) b.b(parcel, DataItem.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    j4(parcel.readString(), parcel.createByteArray(), wtc.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    X3(parcel.readString(), xtc.a.s2(parcel.readStrongBinder()), wtc.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    Q3(parcel.readString(), wtc.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    F3(gyc.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    j5(parcel.readString(), (NotificationData) b.b(parcel, NotificationData.CREATOR), wuc.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    public static class b {
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void D1(String str, Permission[] permissionArr, bwc bwcVar) throws RemoteException;

    void E4(String str, String str2, r0d r0dVar) throws RemoteException;

    void F3(gyc gycVar) throws RemoteException;

    void L3(vuc vucVar) throws RemoteException;

    void O(String str, DataItem dataItem) throws RemoteException;

    void Q3(String str, wtc wtcVar) throws RemoteException;

    void X3(String str, xtc xtcVar, wtc wtcVar) throws RemoteException;

    void b0(String str, q0d q0dVar) throws RemoteException;

    void e1(String str, DataItem dataItem, yqc yqcVar) throws RemoteException;

    void j4(String str, byte[] bArr, wtc wtcVar) throws RemoteException;

    void j5(String str, NotificationData notificationData, wuc wucVar) throws RemoteException;

    int l4() throws RemoteException;

    void m1(String str, DataItem dataItem, zqc zqcVar) throws RemoteException;

    void n0(String str, Permission[] permissionArr, xvc xvcVar) throws RemoteException;

    void p1(String str, Permission permission, yvc yvcVar) throws RemoteException;
}
