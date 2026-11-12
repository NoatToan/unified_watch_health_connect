package com.huawei.profile.service;

import android.content.ComponentName;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.profile.container.ObjectContainer;
import com.huawei.profile.profile.DeviceProfile;
import com.huawei.profile.profile.DeviceProfileEx;
import com.huawei.profile.profile.ServiceCharacteristicProfile;
import com.huawei.profile.profile.ServiceProfile;
import com.huawei.profile.profile.StreamData;
import com.huawei.profile.profile.SubscribeInfo;
import com.huawei.profile.profile.SyncMode;
import com.huawei.profile.subscription.event.EventInfo;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public interface IProfileServiceCall extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.profile.service.IProfileServiceCall";

    /* JADX INFO: loaded from: classes42.dex */
    public static class Default implements IProfileServiceCall {
        @Override // com.huawei.profile.service.IProfileServiceCall
        public Bundle addDeviceList(String str, List<DeviceProfile> list, int i, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public boolean deleteDevice(String str, String str2) throws RemoteException {
            return false;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public Bundle deleteDeviceListById(String str, List<String> list, int i, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public Bundle deleteDeviceListByType(String str, int i, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public boolean deleteDeviceLocal(String str, String str2, String str3) throws RemoteException {
            return false;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public boolean deleteServiceCharacteristic(String str, String str2, String str3, String str4) throws RemoteException {
            return false;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public boolean deleteServiceOfDevice(String str, String str2, String str3) throws RemoteException {
            return false;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public Bundle deleteServiceOfDeviceWithExtraInfo(String str, String str2, List<String> list, boolean z, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public boolean findDevice(String str, boolean z, String str2, GetDeviceInfoListenerEx getDeviceInfoListenerEx, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public String getApiVersion() throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public int getApiVersionCode() throws RemoteException {
            return 0;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public boolean getAvailableDeviceInfoExs(String str, boolean z, String str2, List<String> list, List<String> list2, GetDeviceInfoListenerEx getDeviceInfoListenerEx) throws RemoteException {
            return false;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public boolean getAvailableDeviceInfos(String str, boolean z, String str2, GetDeviceInfoListener getDeviceInfoListener) throws RemoteException {
            return false;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public ObjectContainer getDevices(String str, boolean z, int i) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public ObjectContainer getDevicesById(String str, String str2, boolean z, int i) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public List<DeviceProfileEx> getDevicesByIdEx(String str, List<String> list, boolean z, int i, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public ObjectContainer getDevicesByType(String str, String str2, boolean z, int i) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public List<DeviceProfileEx> getDevicesByTypeEx(String str, List<String> list, boolean z, int i, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public ObjectContainer getDevicesByTypeLocal(String str, String str2, List<String> list) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public List<DeviceProfileEx> getDevicesEx(String str, boolean z, int i, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public ObjectContainer getDevicesWithExtraInfo(String str, boolean z, int i, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public DeviceProfileEx getHostDevice(String str, List<String> list, List<String> list2) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public ServiceCharacteristicProfile getServiceCharacteristics(String str, String str2, String str3, boolean z, int i) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public ServiceCharacteristicProfile getServiceCharacteristicsWithExtraInfo(String str, String str2, String str3, boolean z, int i, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public ObjectContainer getServicesOfDevice(String str, String str2, boolean z, int i) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public Bundle getServicesOfDeviceWithExtraInfo(String str, String str2, boolean z, int i, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public boolean putDevice(String str, DeviceProfile deviceProfile) throws RemoteException {
            return false;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public boolean putDeviceEx(String str, StreamData streamData, PutDeviceExListener putDeviceExListener) throws RemoteException {
            return false;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public boolean putDeviceLocal(String str, DeviceProfile deviceProfile) throws RemoteException {
            return false;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public boolean putDeviceWithExtraInfo(String str, DeviceProfile deviceProfile, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public boolean putServiceCharacteristic(String str, String str2, String str3, ServiceCharacteristicProfile serviceCharacteristicProfile) throws RemoteException {
            return false;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public boolean putServiceCharacteristicWithExtraInfo(String str, String str2, String str3, ServiceCharacteristicProfile serviceCharacteristicProfile, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public boolean putServiceOfDevice(String str, String str2, ServiceProfile serviceProfile) throws RemoteException {
            return false;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public boolean putServiceOfDeviceWithExtraInfo(String str, String str2, ServiceProfile serviceProfile, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public List<DeviceProfile> queryDeviceList(String str, int i, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public boolean setSwitch(String str, boolean z) throws RemoteException {
            return false;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public int setSwitchFlag(String str, boolean z) throws RemoteException {
            return 0;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public Bundle subscribeDeviceList(String str, int i, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public Bundle subscribeDeviceProfile(String str, List<SubscribeInfo> list, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public Bundle subscribeDeviceProfileWithListener(String str, List<com.huawei.profile.subscription.deviceinfo.SubscribeInfo> list, ComponentName componentName, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public String subscribeEvents(String str, List<EventInfo> list, ComponentName componentName, String str2) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public boolean syncDeviceInfoEx(String str, List<String> list, SyncMode syncMode, SyncDeviceInfoExListener syncDeviceInfoExListener, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public boolean syncDeviceInfos(String str, String str2, SyncMode syncMode, SyncDeviceInfoListener syncDeviceInfoListener, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public Bundle unsubscribeDeviceList(String str, int i, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public Bundle unsubscribeDeviceProfile(String str, List<SubscribeInfo> list, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public Bundle unsubscribeDeviceProfileWithListener(String str, List<com.huawei.profile.subscription.deviceinfo.SubscribeInfo> list, ComponentName componentName, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public String unsubscribeEvents(String str, List<EventInfo> list, ComponentName componentName, String str2) throws RemoteException {
            return null;
        }

        @Override // com.huawei.profile.service.IProfileServiceCall
        public Bundle updateDeviceListInfo(String str, List<DeviceProfile> list, int i, Bundle bundle) throws RemoteException {
            return null;
        }
    }

    Bundle addDeviceList(String str, List<DeviceProfile> list, int i, Bundle bundle) throws RemoteException;

    boolean deleteDevice(String str, String str2) throws RemoteException;

    Bundle deleteDeviceListById(String str, List<String> list, int i, Bundle bundle) throws RemoteException;

    Bundle deleteDeviceListByType(String str, int i, Bundle bundle) throws RemoteException;

    boolean deleteDeviceLocal(String str, String str2, String str3) throws RemoteException;

    boolean deleteServiceCharacteristic(String str, String str2, String str3, String str4) throws RemoteException;

    boolean deleteServiceOfDevice(String str, String str2, String str3) throws RemoteException;

    Bundle deleteServiceOfDeviceWithExtraInfo(String str, String str2, List<String> list, boolean z, Bundle bundle) throws RemoteException;

    boolean findDevice(String str, boolean z, String str2, GetDeviceInfoListenerEx getDeviceInfoListenerEx, Bundle bundle) throws RemoteException;

    String getApiVersion() throws RemoteException;

    int getApiVersionCode() throws RemoteException;

    boolean getAvailableDeviceInfoExs(String str, boolean z, String str2, List<String> list, List<String> list2, GetDeviceInfoListenerEx getDeviceInfoListenerEx) throws RemoteException;

    boolean getAvailableDeviceInfos(String str, boolean z, String str2, GetDeviceInfoListener getDeviceInfoListener) throws RemoteException;

    ObjectContainer getDevices(String str, boolean z, int i) throws RemoteException;

    ObjectContainer getDevicesById(String str, String str2, boolean z, int i) throws RemoteException;

    List<DeviceProfileEx> getDevicesByIdEx(String str, List<String> list, boolean z, int i, Bundle bundle) throws RemoteException;

    ObjectContainer getDevicesByType(String str, String str2, boolean z, int i) throws RemoteException;

    List<DeviceProfileEx> getDevicesByTypeEx(String str, List<String> list, boolean z, int i, Bundle bundle) throws RemoteException;

    ObjectContainer getDevicesByTypeLocal(String str, String str2, List<String> list) throws RemoteException;

    List<DeviceProfileEx> getDevicesEx(String str, boolean z, int i, Bundle bundle) throws RemoteException;

    ObjectContainer getDevicesWithExtraInfo(String str, boolean z, int i, Bundle bundle) throws RemoteException;

    DeviceProfileEx getHostDevice(String str, List<String> list, List<String> list2) throws RemoteException;

    ServiceCharacteristicProfile getServiceCharacteristics(String str, String str2, String str3, boolean z, int i) throws RemoteException;

    ServiceCharacteristicProfile getServiceCharacteristicsWithExtraInfo(String str, String str2, String str3, boolean z, int i, Bundle bundle) throws RemoteException;

    ObjectContainer getServicesOfDevice(String str, String str2, boolean z, int i) throws RemoteException;

    Bundle getServicesOfDeviceWithExtraInfo(String str, String str2, boolean z, int i, Bundle bundle) throws RemoteException;

    boolean putDevice(String str, DeviceProfile deviceProfile) throws RemoteException;

    boolean putDeviceEx(String str, StreamData streamData, PutDeviceExListener putDeviceExListener) throws RemoteException;

    boolean putDeviceLocal(String str, DeviceProfile deviceProfile) throws RemoteException;

    boolean putDeviceWithExtraInfo(String str, DeviceProfile deviceProfile, Bundle bundle) throws RemoteException;

    boolean putServiceCharacteristic(String str, String str2, String str3, ServiceCharacteristicProfile serviceCharacteristicProfile) throws RemoteException;

    boolean putServiceCharacteristicWithExtraInfo(String str, String str2, String str3, ServiceCharacteristicProfile serviceCharacteristicProfile, Bundle bundle) throws RemoteException;

    boolean putServiceOfDevice(String str, String str2, ServiceProfile serviceProfile) throws RemoteException;

    boolean putServiceOfDeviceWithExtraInfo(String str, String str2, ServiceProfile serviceProfile, Bundle bundle) throws RemoteException;

    List<DeviceProfile> queryDeviceList(String str, int i, Bundle bundle) throws RemoteException;

    boolean setSwitch(String str, boolean z) throws RemoteException;

    int setSwitchFlag(String str, boolean z) throws RemoteException;

    Bundle subscribeDeviceList(String str, int i, Bundle bundle) throws RemoteException;

    Bundle subscribeDeviceProfile(String str, List<SubscribeInfo> list, Bundle bundle) throws RemoteException;

    Bundle subscribeDeviceProfileWithListener(String str, List<com.huawei.profile.subscription.deviceinfo.SubscribeInfo> list, ComponentName componentName, Bundle bundle) throws RemoteException;

    String subscribeEvents(String str, List<EventInfo> list, ComponentName componentName, String str2) throws RemoteException;

    boolean syncDeviceInfoEx(String str, List<String> list, SyncMode syncMode, SyncDeviceInfoExListener syncDeviceInfoExListener, Bundle bundle) throws RemoteException;

    boolean syncDeviceInfos(String str, String str2, SyncMode syncMode, SyncDeviceInfoListener syncDeviceInfoListener, Bundle bundle) throws RemoteException;

    Bundle unsubscribeDeviceList(String str, int i, Bundle bundle) throws RemoteException;

    Bundle unsubscribeDeviceProfile(String str, List<SubscribeInfo> list, Bundle bundle) throws RemoteException;

    Bundle unsubscribeDeviceProfileWithListener(String str, List<com.huawei.profile.subscription.deviceinfo.SubscribeInfo> list, ComponentName componentName, Bundle bundle) throws RemoteException;

    String unsubscribeEvents(String str, List<EventInfo> list, ComponentName componentName, String str2) throws RemoteException;

    Bundle updateDeviceListInfo(String str, List<DeviceProfile> list, int i, Bundle bundle) throws RemoteException;

    /* JADX INFO: loaded from: classes42.dex */
    public static abstract class Stub extends Binder implements IProfileServiceCall {
        static final int TRANSACTION_addDeviceList = 28;
        static final int TRANSACTION_deleteDevice = 9;
        static final int TRANSACTION_deleteDeviceListById = 30;
        static final int TRANSACTION_deleteDeviceListByType = 29;
        static final int TRANSACTION_deleteDeviceLocal = 21;
        static final int TRANSACTION_deleteServiceCharacteristic = 11;
        static final int TRANSACTION_deleteServiceOfDevice = 10;
        static final int TRANSACTION_deleteServiceOfDeviceWithExtraInfo = 39;
        static final int TRANSACTION_findDevice = 26;
        static final int TRANSACTION_getApiVersion = 13;
        static final int TRANSACTION_getApiVersionCode = 14;
        static final int TRANSACTION_getAvailableDeviceInfoExs = 16;
        static final int TRANSACTION_getAvailableDeviceInfos = 15;
        static final int TRANSACTION_getDevices = 4;
        static final int TRANSACTION_getDevicesById = 5;
        static final int TRANSACTION_getDevicesByIdEx = 24;
        static final int TRANSACTION_getDevicesByType = 6;
        static final int TRANSACTION_getDevicesByTypeEx = 25;
        static final int TRANSACTION_getDevicesByTypeLocal = 19;
        static final int TRANSACTION_getDevicesEx = 36;
        static final int TRANSACTION_getDevicesWithExtraInfo = 45;
        static final int TRANSACTION_getHostDevice = 17;
        static final int TRANSACTION_getServiceCharacteristics = 8;
        static final int TRANSACTION_getServiceCharacteristicsWithExtraInfo = 38;
        static final int TRANSACTION_getServicesOfDevice = 7;
        static final int TRANSACTION_getServicesOfDeviceWithExtraInfo = 37;
        static final int TRANSACTION_putDevice = 1;
        static final int TRANSACTION_putDeviceEx = 44;
        static final int TRANSACTION_putDeviceLocal = 20;
        static final int TRANSACTION_putDeviceWithExtraInfo = 46;
        static final int TRANSACTION_putServiceCharacteristic = 3;
        static final int TRANSACTION_putServiceCharacteristicWithExtraInfo = 48;
        static final int TRANSACTION_putServiceOfDevice = 2;
        static final int TRANSACTION_putServiceOfDeviceWithExtraInfo = 47;
        static final int TRANSACTION_queryDeviceList = 31;
        static final int TRANSACTION_setSwitch = 27;
        static final int TRANSACTION_setSwitchFlag = 12;
        static final int TRANSACTION_subscribeDeviceList = 32;
        static final int TRANSACTION_subscribeDeviceProfile = 22;
        static final int TRANSACTION_subscribeDeviceProfileWithListener = 34;
        static final int TRANSACTION_subscribeEvents = 42;
        static final int TRANSACTION_syncDeviceInfoEx = 41;
        static final int TRANSACTION_syncDeviceInfos = 18;
        static final int TRANSACTION_unsubscribeDeviceList = 33;
        static final int TRANSACTION_unsubscribeDeviceProfile = 23;
        static final int TRANSACTION_unsubscribeDeviceProfileWithListener = 35;
        static final int TRANSACTION_unsubscribeEvents = 43;
        static final int TRANSACTION_updateDeviceListInfo = 40;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IProfileServiceCall.DESCRIPTOR);
        }

        public static IProfileServiceCall asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IProfileServiceCall.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IProfileServiceCall)) {
                return (IProfileServiceCall) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IProfileServiceCall.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IProfileServiceCall.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    boolean zPutDevice = putDevice(parcel.readString(), (DeviceProfile) _Parcel.readTypedObject(parcel, DeviceProfile.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zPutDevice ? 1 : 0);
                    return true;
                case 2:
                    boolean zPutServiceOfDevice = putServiceOfDevice(parcel.readString(), parcel.readString(), (ServiceProfile) _Parcel.readTypedObject(parcel, ServiceProfile.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zPutServiceOfDevice ? 1 : 0);
                    return true;
                case 3:
                    boolean zPutServiceCharacteristic = putServiceCharacteristic(parcel.readString(), parcel.readString(), parcel.readString(), (ServiceCharacteristicProfile) _Parcel.readTypedObject(parcel, ServiceCharacteristicProfile.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zPutServiceCharacteristic ? 1 : 0);
                    return true;
                case 4:
                    ObjectContainer devices = getDevices(parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, devices, 1);
                    return true;
                case 5:
                    ObjectContainer devicesById = getDevicesById(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, devicesById, 1);
                    return true;
                case 6:
                    ObjectContainer devicesByType = getDevicesByType(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, devicesByType, 1);
                    return true;
                case 7:
                    ObjectContainer servicesOfDevice = getServicesOfDevice(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, servicesOfDevice, 1);
                    return true;
                case 8:
                    ServiceCharacteristicProfile serviceCharacteristics = getServiceCharacteristics(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, serviceCharacteristics, 1);
                    return true;
                case 9:
                    boolean zDeleteDevice = deleteDevice(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zDeleteDevice ? 1 : 0);
                    return true;
                case 10:
                    boolean zDeleteServiceOfDevice = deleteServiceOfDevice(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zDeleteServiceOfDevice ? 1 : 0);
                    return true;
                case 11:
                    boolean zDeleteServiceCharacteristic = deleteServiceCharacteristic(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zDeleteServiceCharacteristic ? 1 : 0);
                    return true;
                case 12:
                    int switchFlag = setSwitchFlag(parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(switchFlag);
                    return true;
                case 13:
                    String apiVersion = getApiVersion();
                    parcel2.writeNoException();
                    parcel2.writeString(apiVersion);
                    return true;
                case 14:
                    int apiVersionCode = getApiVersionCode();
                    parcel2.writeNoException();
                    parcel2.writeInt(apiVersionCode);
                    return true;
                case 15:
                    boolean availableDeviceInfos = getAvailableDeviceInfos(parcel.readString(), parcel.readInt() != 0, parcel.readString(), GetDeviceInfoListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(availableDeviceInfos ? 1 : 0);
                    return true;
                case 16:
                    boolean availableDeviceInfoExs = getAvailableDeviceInfoExs(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), GetDeviceInfoListenerEx.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(availableDeviceInfoExs ? 1 : 0);
                    return true;
                case 17:
                    DeviceProfileEx hostDevice = getHostDevice(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, hostDevice, 1);
                    return true;
                case 18:
                    boolean zSyncDeviceInfos = syncDeviceInfos(parcel.readString(), parcel.readString(), (SyncMode) _Parcel.readTypedObject(parcel, SyncMode.CREATOR), SyncDeviceInfoListener.Stub.asInterface(parcel.readStrongBinder()), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zSyncDeviceInfos ? 1 : 0);
                    return true;
                case 19:
                    ObjectContainer devicesByTypeLocal = getDevicesByTypeLocal(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, devicesByTypeLocal, 1);
                    return true;
                case 20:
                    boolean zPutDeviceLocal = putDeviceLocal(parcel.readString(), (DeviceProfile) _Parcel.readTypedObject(parcel, DeviceProfile.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zPutDeviceLocal ? 1 : 0);
                    return true;
                case 21:
                    boolean zDeleteDeviceLocal = deleteDeviceLocal(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zDeleteDeviceLocal ? 1 : 0);
                    return true;
                case 22:
                    Bundle bundleSubscribeDeviceProfile = subscribeDeviceProfile(parcel.readString(), parcel.createTypedArrayList(SubscribeInfo.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, bundleSubscribeDeviceProfile, 1);
                    return true;
                case 23:
                    Bundle bundleUnsubscribeDeviceProfile = unsubscribeDeviceProfile(parcel.readString(), parcel.createTypedArrayList(SubscribeInfo.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, bundleUnsubscribeDeviceProfile, 1);
                    return true;
                case 24:
                    List<DeviceProfileEx> devicesByIdEx = getDevicesByIdEx(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, devicesByIdEx, 1);
                    return true;
                case 25:
                    List<DeviceProfileEx> devicesByTypeEx = getDevicesByTypeEx(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, devicesByTypeEx, 1);
                    return true;
                case 26:
                    boolean zFindDevice = findDevice(parcel.readString(), parcel.readInt() != 0, parcel.readString(), GetDeviceInfoListenerEx.Stub.asInterface(parcel.readStrongBinder()), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zFindDevice ? 1 : 0);
                    return true;
                case 27:
                    boolean z = setSwitch(parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(z ? 1 : 0);
                    return true;
                case 28:
                    Bundle bundleAddDeviceList = addDeviceList(parcel.readString(), parcel.createTypedArrayList(DeviceProfile.CREATOR), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, bundleAddDeviceList, 1);
                    return true;
                case 29:
                    Bundle bundleDeleteDeviceListByType = deleteDeviceListByType(parcel.readString(), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, bundleDeleteDeviceListByType, 1);
                    return true;
                case 30:
                    Bundle bundleDeleteDeviceListById = deleteDeviceListById(parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, bundleDeleteDeviceListById, 1);
                    return true;
                case 31:
                    List<DeviceProfile> listQueryDeviceList = queryDeviceList(parcel.readString(), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, listQueryDeviceList, 1);
                    return true;
                case 32:
                    Bundle bundleSubscribeDeviceList = subscribeDeviceList(parcel.readString(), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, bundleSubscribeDeviceList, 1);
                    return true;
                case 33:
                    Bundle bundleUnsubscribeDeviceList = unsubscribeDeviceList(parcel.readString(), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, bundleUnsubscribeDeviceList, 1);
                    return true;
                case 34:
                    Bundle bundleSubscribeDeviceProfileWithListener = subscribeDeviceProfileWithListener(parcel.readString(), parcel.createTypedArrayList(com.huawei.profile.subscription.deviceinfo.SubscribeInfo.CREATOR), (ComponentName) _Parcel.readTypedObject(parcel, ComponentName.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, bundleSubscribeDeviceProfileWithListener, 1);
                    return true;
                case 35:
                    Bundle bundleUnsubscribeDeviceProfileWithListener = unsubscribeDeviceProfileWithListener(parcel.readString(), parcel.createTypedArrayList(com.huawei.profile.subscription.deviceinfo.SubscribeInfo.CREATOR), (ComponentName) _Parcel.readTypedObject(parcel, ComponentName.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, bundleUnsubscribeDeviceProfileWithListener, 1);
                    return true;
                case 36:
                    List<DeviceProfileEx> devicesEx = getDevicesEx(parcel.readString(), parcel.readInt() != 0, parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, devicesEx, 1);
                    return true;
                case 37:
                    Bundle servicesOfDeviceWithExtraInfo = getServicesOfDeviceWithExtraInfo(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, servicesOfDeviceWithExtraInfo, 1);
                    return true;
                case 38:
                    ServiceCharacteristicProfile serviceCharacteristicsWithExtraInfo = getServiceCharacteristicsWithExtraInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, serviceCharacteristicsWithExtraInfo, 1);
                    return true;
                case 39:
                    Bundle bundleDeleteServiceOfDeviceWithExtraInfo = deleteServiceOfDeviceWithExtraInfo(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, bundleDeleteServiceOfDeviceWithExtraInfo, 1);
                    return true;
                case 40:
                    Bundle bundleUpdateDeviceListInfo = updateDeviceListInfo(parcel.readString(), parcel.createTypedArrayList(DeviceProfile.CREATOR), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, bundleUpdateDeviceListInfo, 1);
                    return true;
                case 41:
                    boolean zSyncDeviceInfoEx = syncDeviceInfoEx(parcel.readString(), parcel.createStringArrayList(), (SyncMode) _Parcel.readTypedObject(parcel, SyncMode.CREATOR), SyncDeviceInfoExListener.Stub.asInterface(parcel.readStrongBinder()), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zSyncDeviceInfoEx ? 1 : 0);
                    return true;
                case 42:
                    String strSubscribeEvents = subscribeEvents(parcel.readString(), parcel.createTypedArrayList(EventInfo.CREATOR), (ComponentName) _Parcel.readTypedObject(parcel, ComponentName.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strSubscribeEvents);
                    return true;
                case 43:
                    String strUnsubscribeEvents = unsubscribeEvents(parcel.readString(), parcel.createTypedArrayList(EventInfo.CREATOR), (ComponentName) _Parcel.readTypedObject(parcel, ComponentName.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strUnsubscribeEvents);
                    return true;
                case 44:
                    boolean zPutDeviceEx = putDeviceEx(parcel.readString(), (StreamData) _Parcel.readTypedObject(parcel, StreamData.CREATOR), PutDeviceExListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zPutDeviceEx ? 1 : 0);
                    return true;
                case 45:
                    ObjectContainer devicesWithExtraInfo = getDevicesWithExtraInfo(parcel.readString(), parcel.readInt() != 0, parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, devicesWithExtraInfo, 1);
                    return true;
                case 46:
                    boolean zPutDeviceWithExtraInfo = putDeviceWithExtraInfo(parcel.readString(), (DeviceProfile) _Parcel.readTypedObject(parcel, DeviceProfile.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zPutDeviceWithExtraInfo ? 1 : 0);
                    return true;
                case 47:
                    boolean zPutServiceOfDeviceWithExtraInfo = putServiceOfDeviceWithExtraInfo(parcel.readString(), parcel.readString(), (ServiceProfile) _Parcel.readTypedObject(parcel, ServiceProfile.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zPutServiceOfDeviceWithExtraInfo ? 1 : 0);
                    return true;
                case 48:
                    boolean zPutServiceCharacteristicWithExtraInfo = putServiceCharacteristicWithExtraInfo(parcel.readString(), parcel.readString(), parcel.readString(), (ServiceCharacteristicProfile) _Parcel.readTypedObject(parcel, ServiceCharacteristicProfile.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zPutServiceCharacteristicWithExtraInfo ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        static class Proxy implements IProfileServiceCall {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IProfileServiceCall.DESCRIPTOR;
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public boolean putDevice(String str, DeviceProfile deviceProfile) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedObject(parcelObtain, deviceProfile, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public boolean putServiceOfDevice(String str, String str2, ServiceProfile serviceProfile) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    _Parcel.writeTypedObject(parcelObtain, serviceProfile, 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public boolean putServiceCharacteristic(String str, String str2, String str3, ServiceCharacteristicProfile serviceCharacteristicProfile) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    _Parcel.writeTypedObject(parcelObtain, serviceCharacteristicProfile, 0);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public ObjectContainer getDevices(String str, boolean z, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ObjectContainer) _Parcel.readTypedObject(parcelObtain2, ObjectContainer.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public ObjectContainer getDevicesById(String str, String str2, boolean z, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ObjectContainer) _Parcel.readTypedObject(parcelObtain2, ObjectContainer.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public ObjectContainer getDevicesByType(String str, String str2, boolean z, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ObjectContainer) _Parcel.readTypedObject(parcelObtain2, ObjectContainer.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public ObjectContainer getServicesOfDevice(String str, String str2, boolean z, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ObjectContainer) _Parcel.readTypedObject(parcelObtain2, ObjectContainer.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public ServiceCharacteristicProfile getServiceCharacteristics(String str, String str2, String str3, boolean z, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ServiceCharacteristicProfile) _Parcel.readTypedObject(parcelObtain2, ServiceCharacteristicProfile.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public boolean deleteDevice(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public boolean deleteServiceOfDevice(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public boolean deleteServiceCharacteristic(String str, String str2, String str3, String str4) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public int setSwitchFlag(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public String getApiVersion() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public int getApiVersionCode() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public boolean getAvailableDeviceInfos(String str, boolean z, String str2, GetDeviceInfoListener getDeviceInfoListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(getDeviceInfoListener);
                    this.mRemote.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public boolean getAvailableDeviceInfoExs(String str, boolean z, String str2, List<String> list, List<String> list2, GetDeviceInfoListenerEx getDeviceInfoListenerEx) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeStringList(list2);
                    parcelObtain.writeStrongInterface(getDeviceInfoListenerEx);
                    this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public DeviceProfileEx getHostDevice(String str, List<String> list, List<String> list2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeStringList(list2);
                    this.mRemote.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (DeviceProfileEx) _Parcel.readTypedObject(parcelObtain2, DeviceProfileEx.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public boolean syncDeviceInfos(String str, String str2, SyncMode syncMode, SyncDeviceInfoListener syncDeviceInfoListener, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    _Parcel.writeTypedObject(parcelObtain, syncMode, 0);
                    parcelObtain.writeStrongInterface(syncDeviceInfoListener);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public ObjectContainer getDevicesByTypeLocal(String str, String str2, List<String> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStringList(list);
                    this.mRemote.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ObjectContainer) _Parcel.readTypedObject(parcelObtain2, ObjectContainer.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public boolean putDeviceLocal(String str, DeviceProfile deviceProfile) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedObject(parcelObtain, deviceProfile, 0);
                    this.mRemote.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public boolean deleteDeviceLocal(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.mRemote.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public Bundle subscribeDeviceProfile(String str, List<SubscribeInfo> list, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedList(parcelObtain, list, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public Bundle unsubscribeDeviceProfile(String str, List<SubscribeInfo> list, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedList(parcelObtain, list, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public List<DeviceProfileEx> getDevicesByIdEx(String str, List<String> list, boolean z, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(DeviceProfileEx.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public List<DeviceProfileEx> getDevicesByTypeEx(String str, List<String> list, boolean z, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(DeviceProfileEx.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public boolean findDevice(String str, boolean z, String str2, GetDeviceInfoListenerEx getDeviceInfoListenerEx, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(getDeviceInfoListenerEx);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public boolean setSwitch(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public Bundle addDeviceList(String str, List<DeviceProfile> list, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedList(parcelObtain, list, 0);
                    parcelObtain.writeInt(i);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public Bundle deleteDeviceListByType(String str, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public Bundle deleteDeviceListById(String str, List<String> list, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeInt(i);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(30, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public List<DeviceProfile> queryDeviceList(String str, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(31, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(DeviceProfile.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public Bundle subscribeDeviceList(String str, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(32, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public Bundle unsubscribeDeviceList(String str, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(33, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public Bundle subscribeDeviceProfileWithListener(String str, List<com.huawei.profile.subscription.deviceinfo.SubscribeInfo> list, ComponentName componentName, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedList(parcelObtain, list, 0);
                    _Parcel.writeTypedObject(parcelObtain, componentName, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(34, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public Bundle unsubscribeDeviceProfileWithListener(String str, List<com.huawei.profile.subscription.deviceinfo.SubscribeInfo> list, ComponentName componentName, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedList(parcelObtain, list, 0);
                    _Parcel.writeTypedObject(parcelObtain, componentName, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(35, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public List<DeviceProfileEx> getDevicesEx(String str, boolean z, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(36, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(DeviceProfileEx.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public Bundle getServicesOfDeviceWithExtraInfo(String str, String str2, boolean z, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(37, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public ServiceCharacteristicProfile getServiceCharacteristicsWithExtraInfo(String str, String str2, String str3, boolean z, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(38, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ServiceCharacteristicProfile) _Parcel.readTypedObject(parcelObtain2, ServiceCharacteristicProfile.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public Bundle deleteServiceOfDeviceWithExtraInfo(String str, String str2, List<String> list, boolean z, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeInt(z ? 1 : 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(39, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public Bundle updateDeviceListInfo(String str, List<DeviceProfile> list, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedList(parcelObtain, list, 0);
                    parcelObtain.writeInt(i);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(40, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public boolean syncDeviceInfoEx(String str, List<String> list, SyncMode syncMode, SyncDeviceInfoExListener syncDeviceInfoExListener, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringList(list);
                    _Parcel.writeTypedObject(parcelObtain, syncMode, 0);
                    parcelObtain.writeStrongInterface(syncDeviceInfoExListener);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(41, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public String subscribeEvents(String str, List<EventInfo> list, ComponentName componentName, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedList(parcelObtain, list, 0);
                    _Parcel.writeTypedObject(parcelObtain, componentName, 0);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(42, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public String unsubscribeEvents(String str, List<EventInfo> list, ComponentName componentName, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedList(parcelObtain, list, 0);
                    _Parcel.writeTypedObject(parcelObtain, componentName, 0);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(43, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public boolean putDeviceEx(String str, StreamData streamData, PutDeviceExListener putDeviceExListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedObject(parcelObtain, streamData, 0);
                    parcelObtain.writeStrongInterface(putDeviceExListener);
                    this.mRemote.transact(44, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public ObjectContainer getDevicesWithExtraInfo(String str, boolean z, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(45, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ObjectContainer) _Parcel.readTypedObject(parcelObtain2, ObjectContainer.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public boolean putDeviceWithExtraInfo(String str, DeviceProfile deviceProfile, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedObject(parcelObtain, deviceProfile, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(46, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public boolean putServiceOfDeviceWithExtraInfo(String str, String str2, ServiceProfile serviceProfile, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    _Parcel.writeTypedObject(parcelObtain, serviceProfile, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(47, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.profile.service.IProfileServiceCall
            public boolean putServiceCharacteristicWithExtraInfo(String str, String str2, String str3, ServiceCharacteristicProfile serviceCharacteristicProfile, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IProfileServiceCall.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    _Parcel.writeTypedObject(parcelObtain, serviceCharacteristicProfile, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(48, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes42.dex */
    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedList(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                writeTypedObject(parcel, list.get(i2), i);
            }
        }
    }
}
