package com.xiaomi.fitness.eco.device.manager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceModelRemote;
import defpackage.g8h;
import defpackage.hbk;
import defpackage.sh7;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0549a extends Binder implements a {
        static final int TRANSACTION_addDeviceStatusListener = 21;
        static final int TRANSACTION_bindDevice = 24;
        static final int TRANSACTION_cancelBind = 25;
        static final int TRANSACTION_connectLocalDevice = 8;
        static final int TRANSACTION_deauthorize = 19;
        static final int TRANSACTION_disconnectDevice = 9;
        static final int TRANSACTION_ecoConnectDeviceByDid = 7;
        static final int TRANSACTION_ecoFetchDeviceInfoList = 14;
        static final int TRANSACTION_findDeviceModel = 26;
        static final int TRANSACTION_getDeviceInfo = 4;
        static final int TRANSACTION_getDeviceInfoInAll = 16;
        static final int TRANSACTION_getDeviceInfoList = 15;
        static final int TRANSACTION_getDeviceModel = 13;
        static final int TRANSACTION_getDeviceModelByMac = 17;
        static final int TRANSACTION_getDeviceModels = 11;
        static final int TRANSACTION_getDeviceStatus = 2;
        static final int TRANSACTION_getEcoDeviceSize = 18;
        static final int TRANSACTION_getLocalDeviceModel = 12;
        static final int TRANSACTION_getProduct = 23;
        static final int TRANSACTION_isConnectActive = 6;
        static final int TRANSACTION_isConnected = 1;
        static final int TRANSACTION_refreshEcoList = 27;
        static final int TRANSACTION_removeDeviceModel = 10;
        static final int TRANSACTION_removeDeviceStatusListener = 22;
        static final int TRANSACTION_setDeviceInfo = 5;
        static final int TRANSACTION_setDeviceStatus = 3;
        static final int TRANSACTION_unbindDevice = 20;

        /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.a$a$a, reason: collision with other inner class name */
        public static class C0550a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f12076a;

            public C0550a(IBinder iBinder) {
                this.f12076a = iBinder;
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public void addDeviceStatusListener(g8h g8hVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeStrongInterface(g8hVar);
                    this.f12076a.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12076a;
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public void bindDevice(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, sh7 sh7Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    parcelObtain.writeString(str5);
                    parcelObtain.writeString(str6);
                    parcelObtain.writeString(str7);
                    parcelObtain.writeString(str8);
                    parcelObtain.writeStrongInterface(sh7Var);
                    this.f12076a.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public void cancelBind(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f12076a.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public void connectLocalDevice(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f12076a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public void deauthorize(String str, l lVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(lVar);
                    this.f12076a.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public void disconnectDevice(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f12076a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public void ecoConnectDeviceByDid(boolean z, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeString(str);
                    this.f12076a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public void ecoFetchDeviceInfoList() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    this.f12076a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public EcoDeviceModelRemote findDeviceModel(com.xiaomi.fitness.eco.device.manager.b bVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeStrongInterface(bVar);
                    this.f12076a.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (EcoDeviceModelRemote) b.d(parcelObtain2, EcoDeviceModelRemote.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public EcoDeviceInfo getDeviceInfo(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f12076a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (EcoDeviceInfo) b.d(parcelObtain2, EcoDeviceInfo.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public EcoDeviceInfo getDeviceInfoInAll(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f12076a.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (EcoDeviceInfo) b.d(parcelObtain2, EcoDeviceInfo.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public List<EcoDeviceInfo> getDeviceInfoList() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    this.f12076a.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(EcoDeviceInfo.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public EcoDeviceModelRemote getDeviceModel(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f12076a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (EcoDeviceModelRemote) b.d(parcelObtain2, EcoDeviceModelRemote.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public EcoDeviceModelRemote getDeviceModelByMac(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f12076a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (EcoDeviceModelRemote) b.d(parcelObtain2, EcoDeviceModelRemote.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public List<EcoDeviceModelRemote> getDeviceModels() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    this.f12076a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(EcoDeviceModelRemote.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public int getDeviceStatus(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f12076a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public int getEcoDeviceSize() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    this.f12076a.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public EcoDeviceModelRemote getLocalDeviceModel(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f12076a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (EcoDeviceModelRemote) b.d(parcelObtain2, EcoDeviceModelRemote.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public boolean isConnectActive(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f12076a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public boolean isConnected(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f12076a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public void refreshEcoList(hbk hbkVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeStrongInterface(hbkVar);
                    this.f12076a.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public void removeDeviceModel(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f12076a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public void removeDeviceStatusListener(g8h g8hVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeStrongInterface(g8hVar);
                    this.f12076a.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public void setDeviceInfo(EcoDeviceInfo ecoDeviceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    b.f(parcelObtain, ecoDeviceInfo, 0);
                    this.f12076a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public void setDeviceStatus(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f12076a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.a
            public void unbindDevice(String str, l lVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(lVar);
                    this.f12076a.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0549a() {
            attachInterface(this, "com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0550a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // com.xiaomi.fitness.eco.device.manager.a
        public abstract /* synthetic */ void addDeviceStatusListener(g8h g8hVar) throws RemoteException;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerRemote");
                return true;
            }
            switch (i) {
                case 1:
                    boolean zIsConnected = isConnected(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsConnected ? 1 : 0);
                    return true;
                case 2:
                    int deviceStatus = getDeviceStatus(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(deviceStatus);
                    return true;
                case 3:
                    setDeviceStatus(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    EcoDeviceInfo deviceInfo = getDeviceInfo(parcel.readString());
                    parcel2.writeNoException();
                    b.f(parcel2, deviceInfo, 1);
                    return true;
                case 5:
                    setDeviceInfo((EcoDeviceInfo) b.d(parcel, EcoDeviceInfo.INSTANCE));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    boolean zIsConnectActive = isConnectActive(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsConnectActive ? 1 : 0);
                    return true;
                case 7:
                    ecoConnectDeviceByDid(parcel.readInt() != 0, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    connectLocalDevice(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    disconnectDevice(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    removeDeviceModel(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    List<EcoDeviceModelRemote> deviceModels = getDeviceModels();
                    parcel2.writeNoException();
                    b.e(parcel2, deviceModels, 1);
                    return true;
                case 12:
                    EcoDeviceModelRemote localDeviceModel = getLocalDeviceModel(parcel.readString());
                    parcel2.writeNoException();
                    b.f(parcel2, localDeviceModel, 1);
                    return true;
                case 13:
                    EcoDeviceModelRemote deviceModel = getDeviceModel(parcel.readString());
                    parcel2.writeNoException();
                    b.f(parcel2, deviceModel, 1);
                    return true;
                case 14:
                    ecoFetchDeviceInfoList();
                    parcel2.writeNoException();
                    return true;
                case 15:
                    List<EcoDeviceInfo> deviceInfoList = getDeviceInfoList();
                    parcel2.writeNoException();
                    b.e(parcel2, deviceInfoList, 1);
                    return true;
                case 16:
                    EcoDeviceInfo deviceInfoInAll = getDeviceInfoInAll(parcel.readString());
                    parcel2.writeNoException();
                    b.f(parcel2, deviceInfoInAll, 1);
                    return true;
                case 17:
                    EcoDeviceModelRemote deviceModelByMac = getDeviceModelByMac(parcel.readString());
                    parcel2.writeNoException();
                    b.f(parcel2, deviceModelByMac, 1);
                    return true;
                case 18:
                    int ecoDeviceSize = getEcoDeviceSize();
                    parcel2.writeNoException();
                    parcel2.writeInt(ecoDeviceSize);
                    return true;
                case 19:
                    deauthorize(parcel.readString(), l.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    unbindDevice(parcel.readString(), l.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    addDeviceStatusListener(g8h.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    removeDeviceStatusListener(g8h.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    EcoProduct product = getProduct(parcel.readString());
                    parcel2.writeNoException();
                    b.f(parcel2, product, 1);
                    return true;
                case 24:
                    bindDevice(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), sh7.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    cancelBind(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 26:
                    EcoDeviceModelRemote ecoDeviceModelRemoteFindDeviceModel = findDeviceModel(com.xiaomi.fitness.eco.device.manager.b.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    b.f(parcel2, ecoDeviceModelRemoteFindDeviceModel, 1);
                    return true;
                case 27:
                    refreshEcoList(hbk.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        @Override // com.xiaomi.fitness.eco.device.manager.a
        public abstract /* synthetic */ void removeDeviceStatusListener(g8h g8hVar) throws RemoteException;
    }

    public static class b {
        public static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void e(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                f(parcel, list.get(i2), i);
            }
        }

        public static <T extends Parcelable> void f(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void addDeviceStatusListener(g8h g8hVar) throws RemoteException;

    void bindDevice(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, sh7 sh7Var) throws RemoteException;

    void cancelBind(String str) throws RemoteException;

    void connectLocalDevice(String str) throws RemoteException;

    void deauthorize(String str, l lVar) throws RemoteException;

    void disconnectDevice(String str) throws RemoteException;

    void ecoConnectDeviceByDid(boolean z, String str) throws RemoteException;

    void ecoFetchDeviceInfoList() throws RemoteException;

    EcoDeviceModelRemote findDeviceModel(com.xiaomi.fitness.eco.device.manager.b bVar) throws RemoteException;

    EcoDeviceInfo getDeviceInfo(String str) throws RemoteException;

    EcoDeviceInfo getDeviceInfoInAll(String str) throws RemoteException;

    List<EcoDeviceInfo> getDeviceInfoList() throws RemoteException;

    EcoDeviceModelRemote getDeviceModel(String str) throws RemoteException;

    EcoDeviceModelRemote getDeviceModelByMac(String str) throws RemoteException;

    List<EcoDeviceModelRemote> getDeviceModels() throws RemoteException;

    int getDeviceStatus(String str) throws RemoteException;

    int getEcoDeviceSize() throws RemoteException;

    EcoDeviceModelRemote getLocalDeviceModel(String str) throws RemoteException;

    EcoProduct getProduct(String str) throws RemoteException;

    boolean isConnectActive(String str) throws RemoteException;

    boolean isConnected(String str) throws RemoteException;

    void refreshEcoList(hbk hbkVar) throws RemoteException;

    void removeDeviceModel(String str) throws RemoteException;

    void removeDeviceStatusListener(g8h g8hVar) throws RemoteException;

    void setDeviceInfo(EcoDeviceInfo ecoDeviceInfo) throws RemoteException;

    void setDeviceStatus(String str, int i) throws RemoteException;

    void unbindDevice(String str, l lVar) throws RemoteException;
}
