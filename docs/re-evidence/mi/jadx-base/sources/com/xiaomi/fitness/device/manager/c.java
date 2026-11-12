package com.xiaomi.fitness.device.manager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.device.manager.bean.DeviceParameter;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.device.manager.remote.DeviceModelRemote;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface c extends IInterface {

    public static abstract class a extends Binder implements c {
        static final int TRANSACTION_addAccessoryDeviceStateListener = 39;
        static final int TRANSACTION_addDeviceChangeListener = 30;
        static final int TRANSACTION_addDeviceStatusListener = 28;
        static final int TRANSACTION_bindDevice = 33;
        static final int TRANSACTION_cancelBind = 34;
        static final int TRANSACTION_connectDevice = 7;
        static final int TRANSACTION_connectLocalDevice = 10;
        static final int TRANSACTION_deauthorize = 24;
        static final int TRANSACTION_disconnectDevice = 11;
        static final int TRANSACTION_ecoConnectDeviceByDid = 9;
        static final int TRANSACTION_findDeviceModel = 36;
        static final int TRANSACTION_getAccessoryDeviceModels = 38;
        static final int TRANSACTION_getAccessoryMode = 42;
        static final int TRANSACTION_getCurrentDeviceModel = 15;
        static final int TRANSACTION_getCurrentPhoneSid = 35;
        static final int TRANSACTION_getDeviceCapability = 18;
        static final int TRANSACTION_getDeviceCapabilityV2 = 19;
        static final int TRANSACTION_getDeviceInfo = 5;
        static final int TRANSACTION_getDeviceInfoByModelFromAllDevice = 44;
        static final int TRANSACTION_getDeviceInfoInAll = 21;
        static final int TRANSACTION_getDeviceInfoList = 20;
        static final int TRANSACTION_getDeviceModel = 17;
        static final int TRANSACTION_getDeviceModelByMac = 22;
        static final int TRANSACTION_getDeviceModels = 13;
        static final int TRANSACTION_getDeviceStatus = 2;
        static final int TRANSACTION_getLocalDeviceModel = 16;
        static final int TRANSACTION_getLocalDeviceModels = 14;
        static final int TRANSACTION_getNeedKeepAliveDeviceModel = 45;
        static final int TRANSACTION_getProduct = 32;
        static final int TRANSACTION_getRequestStatus = 43;
        static final int TRANSACTION_getWearableDeviceSize = 23;
        static final int TRANSACTION_hasAccessoryMode = 41;
        static final int TRANSACTION_isConnectActive = 8;
        static final int TRANSACTION_isConnected = 1;
        static final int TRANSACTION_isCurrent = 4;
        static final int TRANSACTION_removeAccessoryDeviceStateListener = 40;
        static final int TRANSACTION_removeDeviceChangeListener = 31;
        static final int TRANSACTION_removeDeviceModel = 12;
        static final int TRANSACTION_removeDeviceStatusListener = 29;
        static final int TRANSACTION_requestDeviceList = 46;
        static final int TRANSACTION_setDeviceInfo = 6;
        static final int TRANSACTION_setDeviceStatus = 3;
        static final int TRANSACTION_switchDevice = 27;
        static final int TRANSACTION_switchDeviceWearMode = 37;
        static final int TRANSACTION_unbindBloodSugarDevice = 26;
        static final int TRANSACTION_unbindDevice = 25;

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.c$a$a, reason: collision with other inner class name */
        public static class C0422a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11904a;

            public C0422a(IBinder iBinder) {
                this.f11904a = iBinder;
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void addAccessoryDeviceStateListener(f fVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeStrongInterface(fVar);
                    this.f11904a.transact(39, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void addDeviceChangeListener(g gVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeStrongInterface(gVar);
                    this.f11904a.transact(30, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void addDeviceStatusListener(h hVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeStrongInterface(hVar);
                    this.f11904a.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11904a;
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void bindDevice(DeviceParameter deviceParameter, com.xiaomi.fitness.device.manager.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    b.f(parcelObtain, deviceParameter, 0);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f11904a.transact(33, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void cancelBind(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f11904a.transact(34, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void connectDevice(boolean z, boolean z2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(z2 ? 1 : 0);
                    this.f11904a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void connectLocalDevice(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f11904a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void deauthorize(String str, l lVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(lVar);
                    this.f11904a.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void disconnectDevice(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f11904a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void ecoConnectDeviceByDid(boolean z, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeString(str);
                    this.f11904a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public DeviceModelRemote findDeviceModel(d dVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeStrongInterface(dVar);
                    this.f11904a.transact(36, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (DeviceModelRemote) b.d(parcelObtain2, DeviceModelRemote.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public List<DeviceModelRemote> getAccessoryDeviceModels() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    this.f11904a.transact(38, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(DeviceModelRemote.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public int getAccessoryMode(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f11904a.transact(42, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public DeviceModelRemote getCurrentDeviceModel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    this.f11904a.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (DeviceModelRemote) b.d(parcelObtain2, DeviceModelRemote.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public String getCurrentPhoneSid() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    this.f11904a.transact(35, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public int getDeviceCapability(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f11904a.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public int getDeviceCapabilityV2(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f11904a.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public WearableDeviceInfo getDeviceInfo(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f11904a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (WearableDeviceInfo) b.d(parcelObtain2, WearableDeviceInfo.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public WearableDeviceInfo getDeviceInfoByModelFromAllDevice(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f11904a.transact(44, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (WearableDeviceInfo) b.d(parcelObtain2, WearableDeviceInfo.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public WearableDeviceInfo getDeviceInfoInAll(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f11904a.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (WearableDeviceInfo) b.d(parcelObtain2, WearableDeviceInfo.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public List<WearableDeviceInfo> getDeviceInfoList() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    this.f11904a.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(WearableDeviceInfo.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public DeviceModelRemote getDeviceModel(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f11904a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (DeviceModelRemote) b.d(parcelObtain2, DeviceModelRemote.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public DeviceModelRemote getDeviceModelByMac(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f11904a.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (DeviceModelRemote) b.d(parcelObtain2, DeviceModelRemote.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public List<DeviceModelRemote> getDeviceModels() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    this.f11904a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(DeviceModelRemote.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public int getDeviceStatus(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f11904a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public DeviceModelRemote getLocalDeviceModel(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f11904a.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (DeviceModelRemote) b.d(parcelObtain2, DeviceModelRemote.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public List<DeviceModelRemote> getLocalDeviceModels() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    this.f11904a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(DeviceModelRemote.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public List<DeviceModelRemote> getNeedKeepAliveDeviceModel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    this.f11904a.transact(45, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(DeviceModelRemote.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public int getRequestStatus() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    this.f11904a.transact(43, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public int getWearableDeviceSize() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    this.f11904a.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public boolean hasAccessoryMode(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeInt(i);
                    this.f11904a.transact(41, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public boolean isConnectActive(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f11904a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public boolean isConnected(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f11904a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public boolean isCurrent(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f11904a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void removeAccessoryDeviceStateListener(f fVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeStrongInterface(fVar);
                    this.f11904a.transact(40, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void removeDeviceChangeListener(g gVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeStrongInterface(gVar);
                    this.f11904a.transact(31, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void removeDeviceModel(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f11904a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void removeDeviceStatusListener(h hVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeStrongInterface(hVar);
                    this.f11904a.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void requestDeviceList(com.xiaomi.fitness.device.manager.b bVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeStrongInterface(bVar);
                    this.f11904a.transact(46, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void setDeviceInfo(WearableDeviceInfo wearableDeviceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    b.f(parcelObtain, wearableDeviceInfo, 0);
                    this.f11904a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void setDeviceStatus(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f11904a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void switchDevice(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    this.f11904a.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void switchDeviceWearMode(String str, int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f11904a.transact(37, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void unbindBloodSugarDevice(String str, l lVar, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(lVar);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f11904a.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.c
            public void unbindDevice(String str, l lVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(lVar);
                    this.f11904a.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.device.manager.DeviceManagerRemote");
        }

        public static c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new C0422a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // com.xiaomi.fitness.device.manager.c
        public abstract /* synthetic */ void addAccessoryDeviceStateListener(f fVar) throws RemoteException;

        @Override // com.xiaomi.fitness.device.manager.c
        public abstract /* synthetic */ void addDeviceChangeListener(g gVar) throws RemoteException;

        @Override // com.xiaomi.fitness.device.manager.c
        public abstract /* synthetic */ void addDeviceStatusListener(h hVar) throws RemoteException;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.device.manager.DeviceManagerRemote");
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
                    boolean zIsCurrent = isCurrent(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsCurrent ? 1 : 0);
                    return true;
                case 5:
                    WearableDeviceInfo deviceInfo = getDeviceInfo(parcel.readString());
                    parcel2.writeNoException();
                    b.f(parcel2, deviceInfo, 1);
                    return true;
                case 6:
                    setDeviceInfo((WearableDeviceInfo) b.d(parcel, WearableDeviceInfo.INSTANCE));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    connectDevice(parcel.readInt() != 0, parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    boolean zIsConnectActive = isConnectActive(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsConnectActive ? 1 : 0);
                    return true;
                case 9:
                    ecoConnectDeviceByDid(parcel.readInt() != 0, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    connectLocalDevice(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    disconnectDevice(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    removeDeviceModel(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    List<DeviceModelRemote> deviceModels = getDeviceModels();
                    parcel2.writeNoException();
                    b.e(parcel2, deviceModels, 1);
                    return true;
                case 14:
                    List<DeviceModelRemote> localDeviceModels = getLocalDeviceModels();
                    parcel2.writeNoException();
                    b.e(parcel2, localDeviceModels, 1);
                    return true;
                case 15:
                    DeviceModelRemote currentDeviceModel = getCurrentDeviceModel();
                    parcel2.writeNoException();
                    b.f(parcel2, currentDeviceModel, 1);
                    return true;
                case 16:
                    DeviceModelRemote localDeviceModel = getLocalDeviceModel(parcel.readString());
                    parcel2.writeNoException();
                    b.f(parcel2, localDeviceModel, 1);
                    return true;
                case 17:
                    DeviceModelRemote deviceModel = getDeviceModel(parcel.readString());
                    parcel2.writeNoException();
                    b.f(parcel2, deviceModel, 1);
                    return true;
                case 18:
                    int deviceCapability = getDeviceCapability(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(deviceCapability);
                    return true;
                case 19:
                    int deviceCapabilityV2 = getDeviceCapabilityV2(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(deviceCapabilityV2);
                    return true;
                case 20:
                    List<WearableDeviceInfo> deviceInfoList = getDeviceInfoList();
                    parcel2.writeNoException();
                    b.e(parcel2, deviceInfoList, 1);
                    return true;
                case 21:
                    WearableDeviceInfo deviceInfoInAll = getDeviceInfoInAll(parcel.readString());
                    parcel2.writeNoException();
                    b.f(parcel2, deviceInfoInAll, 1);
                    return true;
                case 22:
                    DeviceModelRemote deviceModelByMac = getDeviceModelByMac(parcel.readString());
                    parcel2.writeNoException();
                    b.f(parcel2, deviceModelByMac, 1);
                    return true;
                case 23:
                    int wearableDeviceSize = getWearableDeviceSize();
                    parcel2.writeNoException();
                    parcel2.writeInt(wearableDeviceSize);
                    return true;
                case 24:
                    deauthorize(parcel.readString(), l.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    unbindDevice(parcel.readString(), l.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    unbindBloodSugarDevice(parcel.readString(), l.a.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    switchDevice(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 28:
                    addDeviceStatusListener(h.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 29:
                    removeDeviceStatusListener(h.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 30:
                    addDeviceChangeListener(g.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 31:
                    removeDeviceChangeListener(g.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 32:
                    WearableProduct product = getProduct(parcel.readString());
                    parcel2.writeNoException();
                    b.f(parcel2, product, 1);
                    return true;
                case 33:
                    bindDevice((DeviceParameter) b.d(parcel, DeviceParameter.CREATOR), com.xiaomi.fitness.device.manager.a.AbstractBinderC0419a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 34:
                    cancelBind(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 35:
                    String currentPhoneSid = getCurrentPhoneSid();
                    parcel2.writeNoException();
                    parcel2.writeString(currentPhoneSid);
                    return true;
                case 36:
                    DeviceModelRemote deviceModelRemoteFindDeviceModel = findDeviceModel(d.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    b.f(parcel2, deviceModelRemoteFindDeviceModel, 1);
                    return true;
                case 37:
                    switchDeviceWearMode(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 38:
                    List<DeviceModelRemote> accessoryDeviceModels = getAccessoryDeviceModels();
                    parcel2.writeNoException();
                    b.e(parcel2, accessoryDeviceModels, 1);
                    return true;
                case 39:
                    addAccessoryDeviceStateListener(f.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 40:
                    removeAccessoryDeviceStateListener(f.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 41:
                    boolean zHasAccessoryMode = hasAccessoryMode(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zHasAccessoryMode ? 1 : 0);
                    return true;
                case 42:
                    int accessoryMode = getAccessoryMode(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(accessoryMode);
                    return true;
                case 43:
                    int requestStatus = getRequestStatus();
                    parcel2.writeNoException();
                    parcel2.writeInt(requestStatus);
                    return true;
                case 44:
                    WearableDeviceInfo deviceInfoByModelFromAllDevice = getDeviceInfoByModelFromAllDevice(parcel.readString());
                    parcel2.writeNoException();
                    b.f(parcel2, deviceInfoByModelFromAllDevice, 1);
                    return true;
                case 45:
                    List<DeviceModelRemote> needKeepAliveDeviceModel = getNeedKeepAliveDeviceModel();
                    parcel2.writeNoException();
                    b.e(parcel2, needKeepAliveDeviceModel, 1);
                    return true;
                case 46:
                    requestDeviceList(com.xiaomi.fitness.device.manager.b.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        @Override // com.xiaomi.fitness.device.manager.c
        public abstract /* synthetic */ void removeAccessoryDeviceStateListener(f fVar) throws RemoteException;

        @Override // com.xiaomi.fitness.device.manager.c
        public abstract /* synthetic */ void removeDeviceChangeListener(g gVar) throws RemoteException;

        @Override // com.xiaomi.fitness.device.manager.c
        public abstract /* synthetic */ void removeDeviceStatusListener(h hVar) throws RemoteException;
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

    void addAccessoryDeviceStateListener(f fVar) throws RemoteException;

    void addDeviceChangeListener(g gVar) throws RemoteException;

    void addDeviceStatusListener(h hVar) throws RemoteException;

    void bindDevice(DeviceParameter deviceParameter, com.xiaomi.fitness.device.manager.a aVar) throws RemoteException;

    void cancelBind(String str) throws RemoteException;

    void connectDevice(boolean z, boolean z2) throws RemoteException;

    void connectLocalDevice(String str) throws RemoteException;

    void deauthorize(String str, l lVar) throws RemoteException;

    void disconnectDevice(String str) throws RemoteException;

    void ecoConnectDeviceByDid(boolean z, String str) throws RemoteException;

    DeviceModelRemote findDeviceModel(d dVar) throws RemoteException;

    List<DeviceModelRemote> getAccessoryDeviceModels() throws RemoteException;

    int getAccessoryMode(String str) throws RemoteException;

    DeviceModelRemote getCurrentDeviceModel() throws RemoteException;

    String getCurrentPhoneSid() throws RemoteException;

    int getDeviceCapability(String str) throws RemoteException;

    int getDeviceCapabilityV2(String str) throws RemoteException;

    WearableDeviceInfo getDeviceInfo(String str) throws RemoteException;

    WearableDeviceInfo getDeviceInfoByModelFromAllDevice(String str) throws RemoteException;

    WearableDeviceInfo getDeviceInfoInAll(String str) throws RemoteException;

    List<WearableDeviceInfo> getDeviceInfoList() throws RemoteException;

    DeviceModelRemote getDeviceModel(String str) throws RemoteException;

    DeviceModelRemote getDeviceModelByMac(String str) throws RemoteException;

    List<DeviceModelRemote> getDeviceModels() throws RemoteException;

    int getDeviceStatus(String str) throws RemoteException;

    DeviceModelRemote getLocalDeviceModel(String str) throws RemoteException;

    List<DeviceModelRemote> getLocalDeviceModels() throws RemoteException;

    List<DeviceModelRemote> getNeedKeepAliveDeviceModel() throws RemoteException;

    WearableProduct getProduct(String str) throws RemoteException;

    int getRequestStatus() throws RemoteException;

    int getWearableDeviceSize() throws RemoteException;

    boolean hasAccessoryMode(int i) throws RemoteException;

    boolean isConnectActive(String str) throws RemoteException;

    boolean isConnected(String str) throws RemoteException;

    boolean isCurrent(String str) throws RemoteException;

    void removeAccessoryDeviceStateListener(f fVar) throws RemoteException;

    void removeDeviceChangeListener(g gVar) throws RemoteException;

    void removeDeviceModel(String str) throws RemoteException;

    void removeDeviceStatusListener(h hVar) throws RemoteException;

    void requestDeviceList(com.xiaomi.fitness.device.manager.b bVar) throws RemoteException;

    void setDeviceInfo(WearableDeviceInfo wearableDeviceInfo) throws RemoteException;

    void setDeviceStatus(String str, int i) throws RemoteException;

    void switchDevice(String str) throws RemoteException;

    void switchDeviceWearMode(String str, int i, boolean z) throws RemoteException;

    void unbindBloodSugarDevice(String str, l lVar, boolean z) throws RemoteException;

    void unbindDevice(String str, l lVar) throws RemoteException;
}
