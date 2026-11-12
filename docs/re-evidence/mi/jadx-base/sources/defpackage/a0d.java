package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.duokan.airkan.common.aidl.ParcelDeviceData;
import com.duokan.airkan.common.aidl.ParcelService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface a0d extends IInterface {

    public static abstract class a extends Binder implements a0d {
        public a() {
            attachInterface(this, "com.xiaomi.milink.discover.aidl.IUDTDiscoverService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.milink.discover.aidl.IUDTDiscoverService");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.xiaomi.milink.discover.aidl.IUDTDiscoverService");
                    int iN3 = N3(parcel.readInt(), zzc.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iN3);
                    return true;
                case 2:
                    parcel.enforceInterface("com.xiaomi.milink.discover.aidl.IUDTDiscoverService");
                    int iD = d(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iD);
                    return true;
                case 3:
                    parcel.enforceInterface("com.xiaomi.milink.discover.aidl.IUDTDiscoverService");
                    int iH2 = h2(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iH2);
                    return true;
                case 4:
                    parcel.enforceInterface("com.xiaomi.milink.discover.aidl.IUDTDiscoverService");
                    int iX1 = X1(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iX1);
                    return true;
                case 5:
                    parcel.enforceInterface("com.xiaomi.milink.discover.aidl.IUDTDiscoverService");
                    String string = parcel.readString();
                    ArrayList arrayList = new ArrayList();
                    int iH1 = h1(string, arrayList);
                    parcel2.writeNoException();
                    parcel2.writeInt(iH1);
                    parcel2.writeTypedList(arrayList);
                    return true;
                case 6:
                    parcel.enforceInterface("com.xiaomi.milink.discover.aidl.IUDTDiscoverService");
                    int iM2 = m2(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iM2);
                    return true;
                case 7:
                    parcel.enforceInterface("com.xiaomi.milink.discover.aidl.IUDTDiscoverService");
                    int iZ4 = z4(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iZ4);
                    return true;
                case 8:
                    parcel.enforceInterface("com.xiaomi.milink.discover.aidl.IUDTDiscoverService");
                    int iQ0 = Q0(parcel.readInt(), parcel.readInt() != 0 ? ParcelService.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(iQ0);
                    return true;
                case 9:
                    parcel.enforceInterface("com.xiaomi.milink.discover.aidl.IUDTDiscoverService");
                    int iS4 = s4(parcel.readInt(), parcel.readInt() != 0 ? ParcelService.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(iS4);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    int N3(int i, zzc zzcVar) throws RemoteException;

    int Q0(int i, ParcelService parcelService) throws RemoteException;

    int X1(int i, String str) throws RemoteException;

    int d(int i) throws RemoteException;

    int h1(String str, List<ParcelDeviceData> list) throws RemoteException;

    int h2(int i, String str) throws RemoteException;

    int m2(int i, String str) throws RemoteException;

    int s4(int i, ParcelService parcelService) throws RemoteException;

    int z4(int i, String str) throws RemoteException;
}
