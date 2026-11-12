package com.huawei.hihealth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface IHiHealth extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hihealth.IHiHealth";

    /* JADX INFO: loaded from: classes2.dex */
    public static class Default implements IHiHealth {
        @Override // com.huawei.hihealth.IHiHealth
        public boolean addExternalSubscribeTrigger(int i, int i2, HiSubscribeTrigger hiSubscribeTrigger) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hihealth.IHiHealth
        public int addHiHealthDataCustomType(String str) throws RemoteException {
            return 0;
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void aggregateHiHealthData(HiAggregateOption hiAggregateOption, IAggregateListener iAggregateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void aggregateHiHealthDataEx(List list, IAggregateListenerEx iAggregateListenerEx) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void aggregateHiHealthDataPro(HiDataAggregateProOption hiDataAggregateProOption, IAggregateListener iAggregateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void aggregateHiHealthDataProEx(List list, IAggregateListenerEx iAggregateListenerEx) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void aggregateSportStatData(HiSportStatDataAggregateOption hiSportStatDataAggregateOption, IAggregateListener iAggregateListener) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void checkDataStatus(List list, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public boolean checkHiHealthLogin(String str) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void deleteAllKitHealthData(int i, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void deleteHiHealthData(HiDataDeleteOption hiDataDeleteOption, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void deleteHiHealthDataPro(HiDataDeleteProOption hiDataDeleteProOption, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void deleteHiHealthDataProEx(List list, IDeleteListenerEx iDeleteListenerEx) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void deleteSampleConfig(HiSampleConfigProcessOption hiSampleConfigProcessOption, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void fetchAccountInfo(ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void fetchBuildInDataClient(IDataClientListener iDataClientListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void fetchDataClientByUniqueID(int i, String str, IDataClientListener iDataClientListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void fetchDataSource(HiDataSourceFetchOption hiDataSourceFetchOption, IDataClientListener iDataClientListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void fetchDataSourceByType(int i, HiTimeInterval hiTimeInterval, IDataClientListener iDataClientListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void fetchDataSourceByTypes(List list, HiTimeInterval hiTimeInterval, boolean z, IMultiDataClientListener iMultiDataClientListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void fetchGoalInfo(int i, int i2, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public int fetchHiHealthDataCustomType(String str) throws RemoteException {
            return 0;
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void fetchManualDataClient(IDataClientListener iDataClientListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void fetchPhoneDataClient(IDataClientListener iDataClientListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public HiHealthUnit fetchPreferUnit(int i) throws RemoteException {
            return null;
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void fetchRegisteredDataClient(int i, IDataClientListener iDataClientListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void fetchSequenceDataBySportType(HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void fetchSequenceDataProBySportType(HiDataReadProOption hiDataReadProOption, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void fetchSportTypeList(HiDataReadOption hiDataReadOption, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void fetchSupportedTypes(int i, ISupportedTypesListener iSupportedTypesListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void fetchUserData(ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public int getHiHealthVersionCode() throws RemoteException {
            return 0;
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void getSampleConfig(HiSampleConfigProcessOption hiSampleConfigProcessOption, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public HiUserPreference getUserPreference(String str) throws RemoteException {
            return null;
        }

        @Override // com.huawei.hihealth.IHiHealth
        public List<HiUserPreference> getUserPreferenceList(List<String> list) throws RemoteException {
            return null;
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void hiLogin(HiAccountInfo hiAccountInfo, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void hiLogout(ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void initHiHealth(HiAppInfo hiAppInfo) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void insertFitnessData(String str) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void insertHiHealthData(HiDataInsertOption hiDataInsertOption, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void insertRealTimeHiHealthData(HiDataInsertOption hiDataInsertOption, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void migrateBaseData(IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void queryHealthKitPermission(int i, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void queryKitAppInfo(IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void queryWearKitAppInfo(IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void queryWearKitPermission(int i, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void readDeviceInfo(IDataHiDeviceInfoListener iDataHiDeviceInfoListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void readHiHealthData(HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void readHiHealthDataEx(List list, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void readHiHealthDataPro(HiDataReadProOption hiDataReadProOption, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void registerDataClient(HiDeviceInfo hiDeviceInfo, List list, IRegisterClientListener iRegisterClientListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void registerDataClientWithUserInfo(HiDeviceInfo hiDeviceInfo, HiUserInfo hiUserInfo, List list, IRegisterClientListener iRegisterClientListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void requestAuthorization(HiAuthorizationOption hiAuthorizationOption, IAuthorizationListener iAuthorizationListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void setBinder(String str, IBinder iBinder, ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void setGoalInfo(int i, List list, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void setPreferUnit(int i, HiHealthUnit hiHealthUnit) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void setSampleConfig(List list, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void setUserData(HiUserInfo hiUserInfo, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public boolean setUserPreference(HiUserPreference hiUserPreference, boolean z) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void subscribeHiHealthData(List list, ISubscribeListener iSubscribeListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void synCloud(HiSyncOption hiSyncOption, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void synCloudCancel() throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void unBindHiHealth() throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void unSubscribeHiHealthData(List list, IUnSubscribeListener iUnSubscribeListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void updateHealthKitPermission(int i, int i2, int i3, boolean z, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void updateHiHealthData(HiDataUpdateOption hiDataUpdateOption, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealth
        public void updateWearKitPermission(int i, int i2, boolean z, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }
    }

    boolean addExternalSubscribeTrigger(int i, int i2, HiSubscribeTrigger hiSubscribeTrigger) throws RemoteException;

    int addHiHealthDataCustomType(String str) throws RemoteException;

    void aggregateHiHealthData(HiAggregateOption hiAggregateOption, IAggregateListener iAggregateListener) throws RemoteException;

    void aggregateHiHealthDataEx(List list, IAggregateListenerEx iAggregateListenerEx) throws RemoteException;

    void aggregateHiHealthDataPro(HiDataAggregateProOption hiDataAggregateProOption, IAggregateListener iAggregateListener) throws RemoteException;

    void aggregateHiHealthDataProEx(List list, IAggregateListenerEx iAggregateListenerEx) throws RemoteException;

    void aggregateSportStatData(HiSportStatDataAggregateOption hiSportStatDataAggregateOption, IAggregateListener iAggregateListener) throws RemoteException;

    void checkDataStatus(List list, ICommonListener iCommonListener) throws RemoteException;

    boolean checkHiHealthLogin(String str) throws RemoteException;

    void deleteAllKitHealthData(int i, IDataOperateListener iDataOperateListener) throws RemoteException;

    void deleteHiHealthData(HiDataDeleteOption hiDataDeleteOption, IDataOperateListener iDataOperateListener) throws RemoteException;

    void deleteHiHealthDataPro(HiDataDeleteProOption hiDataDeleteProOption, IDataOperateListener iDataOperateListener) throws RemoteException;

    void deleteHiHealthDataProEx(List list, IDeleteListenerEx iDeleteListenerEx) throws RemoteException;

    void deleteSampleConfig(HiSampleConfigProcessOption hiSampleConfigProcessOption, IDataOperateListener iDataOperateListener) throws RemoteException;

    void fetchAccountInfo(ICommonListener iCommonListener) throws RemoteException;

    void fetchBuildInDataClient(IDataClientListener iDataClientListener) throws RemoteException;

    void fetchDataClientByUniqueID(int i, String str, IDataClientListener iDataClientListener) throws RemoteException;

    void fetchDataSource(HiDataSourceFetchOption hiDataSourceFetchOption, IDataClientListener iDataClientListener) throws RemoteException;

    void fetchDataSourceByType(int i, HiTimeInterval hiTimeInterval, IDataClientListener iDataClientListener) throws RemoteException;

    void fetchDataSourceByTypes(List list, HiTimeInterval hiTimeInterval, boolean z, IMultiDataClientListener iMultiDataClientListener) throws RemoteException;

    void fetchGoalInfo(int i, int i2, ICommonListener iCommonListener) throws RemoteException;

    int fetchHiHealthDataCustomType(String str) throws RemoteException;

    void fetchManualDataClient(IDataClientListener iDataClientListener) throws RemoteException;

    void fetchPhoneDataClient(IDataClientListener iDataClientListener) throws RemoteException;

    HiHealthUnit fetchPreferUnit(int i) throws RemoteException;

    void fetchRegisteredDataClient(int i, IDataClientListener iDataClientListener) throws RemoteException;

    void fetchSequenceDataBySportType(HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void fetchSequenceDataProBySportType(HiDataReadProOption hiDataReadProOption, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void fetchSportTypeList(HiDataReadOption hiDataReadOption, ICommonListener iCommonListener) throws RemoteException;

    void fetchSupportedTypes(int i, ISupportedTypesListener iSupportedTypesListener) throws RemoteException;

    void fetchUserData(ICommonListener iCommonListener) throws RemoteException;

    int getHiHealthVersionCode() throws RemoteException;

    void getSampleConfig(HiSampleConfigProcessOption hiSampleConfigProcessOption, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    HiUserPreference getUserPreference(String str) throws RemoteException;

    List<HiUserPreference> getUserPreferenceList(List<String> list) throws RemoteException;

    void hiLogin(HiAccountInfo hiAccountInfo, ICommonListener iCommonListener) throws RemoteException;

    void hiLogout(ICommonListener iCommonListener) throws RemoteException;

    void initHiHealth(HiAppInfo hiAppInfo) throws RemoteException;

    void insertFitnessData(String str) throws RemoteException;

    void insertHiHealthData(HiDataInsertOption hiDataInsertOption, IDataOperateListener iDataOperateListener) throws RemoteException;

    void insertRealTimeHiHealthData(HiDataInsertOption hiDataInsertOption, IDataOperateListener iDataOperateListener) throws RemoteException;

    void migrateBaseData(IDataOperateListener iDataOperateListener) throws RemoteException;

    void queryHealthKitPermission(int i, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void queryKitAppInfo(IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void queryWearKitAppInfo(IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void queryWearKitPermission(int i, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void readDeviceInfo(IDataHiDeviceInfoListener iDataHiDeviceInfoListener) throws RemoteException;

    void readHiHealthData(HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void readHiHealthDataEx(List list, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void readHiHealthDataPro(HiDataReadProOption hiDataReadProOption, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void registerDataClient(HiDeviceInfo hiDeviceInfo, List list, IRegisterClientListener iRegisterClientListener) throws RemoteException;

    void registerDataClientWithUserInfo(HiDeviceInfo hiDeviceInfo, HiUserInfo hiUserInfo, List list, IRegisterClientListener iRegisterClientListener) throws RemoteException;

    void requestAuthorization(HiAuthorizationOption hiAuthorizationOption, IAuthorizationListener iAuthorizationListener) throws RemoteException;

    void setBinder(String str, IBinder iBinder, ICommonCallback iCommonCallback) throws RemoteException;

    void setGoalInfo(int i, List list, ICommonListener iCommonListener) throws RemoteException;

    void setPreferUnit(int i, HiHealthUnit hiHealthUnit) throws RemoteException;

    void setSampleConfig(List list, IDataOperateListener iDataOperateListener) throws RemoteException;

    void setUserData(HiUserInfo hiUserInfo, ICommonListener iCommonListener) throws RemoteException;

    boolean setUserPreference(HiUserPreference hiUserPreference, boolean z) throws RemoteException;

    void subscribeHiHealthData(List list, ISubscribeListener iSubscribeListener) throws RemoteException;

    void synCloud(HiSyncOption hiSyncOption, ICommonListener iCommonListener) throws RemoteException;

    void synCloudCancel() throws RemoteException;

    void unBindHiHealth() throws RemoteException;

    void unSubscribeHiHealthData(List list, IUnSubscribeListener iUnSubscribeListener) throws RemoteException;

    void updateHealthKitPermission(int i, int i2, int i3, boolean z, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void updateHiHealthData(HiDataUpdateOption hiDataUpdateOption, IDataOperateListener iDataOperateListener) throws RemoteException;

    void updateWearKitPermission(int i, int i2, boolean z, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    public static abstract class Stub extends Binder implements IHiHealth {
        static final int TRANSACTION_addExternalSubscribeTrigger = 6;
        static final int TRANSACTION_addHiHealthDataCustomType = 14;
        static final int TRANSACTION_aggregateHiHealthData = 8;
        static final int TRANSACTION_aggregateHiHealthDataEx = 9;
        static final int TRANSACTION_aggregateHiHealthDataPro = 57;
        static final int TRANSACTION_aggregateHiHealthDataProEx = 62;
        static final int TRANSACTION_aggregateSportStatData = 54;
        static final int TRANSACTION_checkDataStatus = 29;
        static final int TRANSACTION_checkHiHealthLogin = 38;
        static final int TRANSACTION_deleteAllKitHealthData = 49;
        static final int TRANSACTION_deleteHiHealthData = 11;
        static final int TRANSACTION_deleteHiHealthDataPro = 58;
        static final int TRANSACTION_deleteHiHealthDataProEx = 67;
        static final int TRANSACTION_deleteSampleConfig = 65;
        static final int TRANSACTION_fetchAccountInfo = 33;
        static final int TRANSACTION_fetchBuildInDataClient = 18;
        static final int TRANSACTION_fetchDataClientByUniqueID = 22;
        static final int TRANSACTION_fetchDataSource = 55;
        static final int TRANSACTION_fetchDataSourceByType = 25;
        static final int TRANSACTION_fetchDataSourceByTypes = 66;
        static final int TRANSACTION_fetchGoalInfo = 35;
        static final int TRANSACTION_fetchHiHealthDataCustomType = 15;
        static final int TRANSACTION_fetchManualDataClient = 19;
        static final int TRANSACTION_fetchPhoneDataClient = 20;
        static final int TRANSACTION_fetchPreferUnit = 23;
        static final int TRANSACTION_fetchRegisteredDataClient = 21;
        static final int TRANSACTION_fetchSequenceDataBySportType = 52;
        static final int TRANSACTION_fetchSequenceDataProBySportType = 53;
        static final int TRANSACTION_fetchSportTypeList = 51;
        static final int TRANSACTION_fetchSupportedTypes = 4;
        static final int TRANSACTION_fetchUserData = 27;
        static final int TRANSACTION_getHiHealthVersionCode = 39;
        static final int TRANSACTION_getSampleConfig = 64;
        static final int TRANSACTION_getUserPreference = 37;
        static final int TRANSACTION_getUserPreferenceList = 59;
        static final int TRANSACTION_hiLogin = 31;
        static final int TRANSACTION_hiLogout = 32;
        static final int TRANSACTION_initHiHealth = 1;
        static final int TRANSACTION_insertFitnessData = 61;
        static final int TRANSACTION_insertHiHealthData = 10;
        static final int TRANSACTION_insertRealTimeHiHealthData = 47;
        static final int TRANSACTION_migrateBaseData = 50;
        static final int TRANSACTION_queryHealthKitPermission = 42;
        static final int TRANSACTION_queryKitAppInfo = 41;
        static final int TRANSACTION_queryWearKitAppInfo = 44;
        static final int TRANSACTION_queryWearKitPermission = 45;
        static final int TRANSACTION_readDeviceInfo = 40;
        static final int TRANSACTION_readHiHealthData = 12;
        static final int TRANSACTION_readHiHealthDataEx = 60;
        static final int TRANSACTION_readHiHealthDataPro = 56;
        static final int TRANSACTION_registerDataClient = 16;
        static final int TRANSACTION_registerDataClientWithUserInfo = 17;
        static final int TRANSACTION_requestAuthorization = 3;
        static final int TRANSACTION_setBinder = 48;
        static final int TRANSACTION_setGoalInfo = 34;
        static final int TRANSACTION_setPreferUnit = 24;
        static final int TRANSACTION_setSampleConfig = 63;
        static final int TRANSACTION_setUserData = 26;
        static final int TRANSACTION_setUserPreference = 36;
        static final int TRANSACTION_subscribeHiHealthData = 5;
        static final int TRANSACTION_synCloud = 28;
        static final int TRANSACTION_synCloudCancel = 30;
        static final int TRANSACTION_unBindHiHealth = 2;
        static final int TRANSACTION_unSubscribeHiHealthData = 7;
        static final int TRANSACTION_updateHealthKitPermission = 43;
        static final int TRANSACTION_updateHiHealthData = 13;
        static final int TRANSACTION_updateWearKitPermission = 46;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IHiHealth.DESCRIPTOR);
        }

        public static IHiHealth asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IHiHealth.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IHiHealth)) {
                return (IHiHealth) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IHiHealth.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IHiHealth.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    initHiHealth((HiAppInfo) _Parcel.a(parcel, HiAppInfo.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    unBindHiHealth();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    requestAuthorization((HiAuthorizationOption) _Parcel.a(parcel, HiAuthorizationOption.CREATOR), IAuthorizationListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    fetchSupportedTypes(parcel.readInt(), ISupportedTypesListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    subscribeHiHealthData(parcel.readArrayList(getClass().getClassLoader()), ISubscribeListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    boolean zAddExternalSubscribeTrigger = addExternalSubscribeTrigger(parcel.readInt(), parcel.readInt(), (HiSubscribeTrigger) _Parcel.a(parcel, HiSubscribeTrigger.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zAddExternalSubscribeTrigger ? 1 : 0);
                    return true;
                case 7:
                    unSubscribeHiHealthData(parcel.readArrayList(getClass().getClassLoader()), IUnSubscribeListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    aggregateHiHealthData((HiAggregateOption) _Parcel.a(parcel, HiAggregateOption.CREATOR), IAggregateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    aggregateHiHealthDataEx(parcel.readArrayList(getClass().getClassLoader()), IAggregateListenerEx.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    insertHiHealthData((HiDataInsertOption) _Parcel.a(parcel, HiDataInsertOption.CREATOR), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    deleteHiHealthData((HiDataDeleteOption) _Parcel.a(parcel, HiDataDeleteOption.CREATOR), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    readHiHealthData((HiDataReadOption) _Parcel.a(parcel, HiDataReadOption.CREATOR), IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    updateHiHealthData((HiDataUpdateOption) _Parcel.a(parcel, HiDataUpdateOption.CREATOR), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    int iAddHiHealthDataCustomType = addHiHealthDataCustomType(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iAddHiHealthDataCustomType);
                    return true;
                case 15:
                    int iFetchHiHealthDataCustomType = fetchHiHealthDataCustomType(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iFetchHiHealthDataCustomType);
                    return true;
                case 16:
                    registerDataClient((HiDeviceInfo) _Parcel.a(parcel, HiDeviceInfo.CREATOR), parcel.readArrayList(getClass().getClassLoader()), IRegisterClientListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    registerDataClientWithUserInfo((HiDeviceInfo) _Parcel.a(parcel, HiDeviceInfo.CREATOR), (HiUserInfo) _Parcel.a(parcel, HiUserInfo.CREATOR), parcel.readArrayList(getClass().getClassLoader()), IRegisterClientListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    fetchBuildInDataClient(IDataClientListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 19:
                    fetchManualDataClient(IDataClientListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    fetchPhoneDataClient(IDataClientListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    fetchRegisteredDataClient(parcel.readInt(), IDataClientListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    fetchDataClientByUniqueID(parcel.readInt(), parcel.readString(), IDataClientListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    HiHealthUnit hiHealthUnitFetchPreferUnit = fetchPreferUnit(parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.d(parcel2, hiHealthUnitFetchPreferUnit, 1);
                    return true;
                case 24:
                    setPreferUnit(parcel.readInt(), (HiHealthUnit) _Parcel.a(parcel, HiHealthUnit.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    fetchDataSourceByType(parcel.readInt(), (HiTimeInterval) _Parcel.a(parcel, HiTimeInterval.CREATOR), IDataClientListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    setUserData((HiUserInfo) _Parcel.a(parcel, HiUserInfo.CREATOR), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    fetchUserData(ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 28:
                    synCloud((HiSyncOption) _Parcel.a(parcel, HiSyncOption.CREATOR), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 29:
                    checkDataStatus(parcel.readArrayList(getClass().getClassLoader()), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 30:
                    synCloudCancel();
                    parcel2.writeNoException();
                    return true;
                case 31:
                    hiLogin((HiAccountInfo) _Parcel.a(parcel, HiAccountInfo.CREATOR), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 32:
                    hiLogout(ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 33:
                    fetchAccountInfo(ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 34:
                    setGoalInfo(parcel.readInt(), parcel.readArrayList(getClass().getClassLoader()), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 35:
                    fetchGoalInfo(parcel.readInt(), parcel.readInt(), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 36:
                    boolean userPreference = setUserPreference((HiUserPreference) _Parcel.a(parcel, HiUserPreference.CREATOR), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(userPreference ? 1 : 0);
                    return true;
                case 37:
                    HiUserPreference userPreference2 = getUserPreference(parcel.readString());
                    parcel2.writeNoException();
                    _Parcel.d(parcel2, userPreference2, 1);
                    return true;
                case 38:
                    boolean zCheckHiHealthLogin = checkHiHealthLogin(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zCheckHiHealthLogin ? 1 : 0);
                    return true;
                case 39:
                    int hiHealthVersionCode = getHiHealthVersionCode();
                    parcel2.writeNoException();
                    parcel2.writeInt(hiHealthVersionCode);
                    return true;
                case 40:
                    readDeviceInfo(IDataHiDeviceInfoListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 41:
                    queryKitAppInfo(IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 42:
                    queryHealthKitPermission(parcel.readInt(), IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 43:
                    updateHealthKitPermission(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 44:
                    queryWearKitAppInfo(IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 45:
                    queryWearKitPermission(parcel.readInt(), IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 46:
                    updateWearKitPermission(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 47:
                    insertRealTimeHiHealthData((HiDataInsertOption) _Parcel.a(parcel, HiDataInsertOption.CREATOR), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 48:
                    setBinder(parcel.readString(), parcel.readStrongBinder(), ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 49:
                    deleteAllKitHealthData(parcel.readInt(), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 50:
                    migrateBaseData(IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 51:
                    fetchSportTypeList((HiDataReadOption) _Parcel.a(parcel, HiDataReadOption.CREATOR), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 52:
                    fetchSequenceDataBySportType((HiDataReadOption) _Parcel.a(parcel, HiDataReadOption.CREATOR), IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 53:
                    fetchSequenceDataProBySportType((HiDataReadProOption) _Parcel.a(parcel, HiDataReadProOption.CREATOR), IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 54:
                    aggregateSportStatData((HiSportStatDataAggregateOption) _Parcel.a(parcel, HiSportStatDataAggregateOption.CREATOR), IAggregateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 55:
                    fetchDataSource((HiDataSourceFetchOption) _Parcel.a(parcel, HiDataSourceFetchOption.CREATOR), IDataClientListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 56:
                    readHiHealthDataPro((HiDataReadProOption) _Parcel.a(parcel, HiDataReadProOption.CREATOR), IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 57:
                    aggregateHiHealthDataPro((HiDataAggregateProOption) _Parcel.a(parcel, HiDataAggregateProOption.CREATOR), IAggregateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 58:
                    deleteHiHealthDataPro((HiDataDeleteProOption) _Parcel.a(parcel, HiDataDeleteProOption.CREATOR), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 59:
                    List<HiUserPreference> userPreferenceList = getUserPreferenceList(parcel.createStringArrayList());
                    parcel2.writeNoException();
                    _Parcel.a(parcel2, userPreferenceList, 1);
                    return true;
                case 60:
                    readHiHealthDataEx(parcel.readArrayList(getClass().getClassLoader()), IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 61:
                    insertFitnessData(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 62:
                    aggregateHiHealthDataProEx(parcel.readArrayList(getClass().getClassLoader()), IAggregateListenerEx.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 63:
                    setSampleConfig(parcel.readArrayList(getClass().getClassLoader()), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 64:
                    getSampleConfig((HiSampleConfigProcessOption) _Parcel.a(parcel, HiSampleConfigProcessOption.CREATOR), IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 65:
                    deleteSampleConfig((HiSampleConfigProcessOption) _Parcel.a(parcel, HiSampleConfigProcessOption.CREATOR), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 66:
                    fetchDataSourceByTypes(parcel.readArrayList(getClass().getClassLoader()), (HiTimeInterval) _Parcel.a(parcel, HiTimeInterval.CREATOR), parcel.readInt() != 0, IMultiDataClientListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 67:
                    deleteHiHealthDataProEx(parcel.readArrayList(getClass().getClassLoader()), IDeleteListenerEx.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: loaded from: classes2.dex */
        static class Proxy implements IHiHealth {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private IBinder f12019c;

            Proxy(IBinder iBinder) {
                this.f12019c = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12019c;
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void initHiHealth(HiAppInfo hiAppInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiAppInfo, 0);
                    this.f12019c.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void unBindHiHealth() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    this.f12019c.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void requestAuthorization(HiAuthorizationOption hiAuthorizationOption, IAuthorizationListener iAuthorizationListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiAuthorizationOption, 0);
                    parcelObtain.writeStrongInterface(iAuthorizationListener);
                    this.f12019c.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void fetchSupportedTypes(int i, ISupportedTypesListener iSupportedTypesListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iSupportedTypesListener);
                    this.f12019c.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void subscribeHiHealthData(List list, ISubscribeListener iSubscribeListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeList(list);
                    parcelObtain.writeStrongInterface(iSubscribeListener);
                    this.f12019c.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public boolean addExternalSubscribeTrigger(int i, int i2, HiSubscribeTrigger hiSubscribeTrigger) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    _Parcel.d(parcelObtain, hiSubscribeTrigger, 0);
                    this.f12019c.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void unSubscribeHiHealthData(List list, IUnSubscribeListener iUnSubscribeListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeList(list);
                    parcelObtain.writeStrongInterface(iUnSubscribeListener);
                    this.f12019c.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void aggregateHiHealthData(HiAggregateOption hiAggregateOption, IAggregateListener iAggregateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiAggregateOption, 0);
                    parcelObtain.writeStrongInterface(iAggregateListener);
                    this.f12019c.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void aggregateHiHealthDataEx(List list, IAggregateListenerEx iAggregateListenerEx) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeList(list);
                    parcelObtain.writeStrongInterface(iAggregateListenerEx);
                    this.f12019c.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void insertHiHealthData(HiDataInsertOption hiDataInsertOption, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiDataInsertOption, 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.f12019c.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void deleteHiHealthData(HiDataDeleteOption hiDataDeleteOption, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiDataDeleteOption, 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.f12019c.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void readHiHealthData(HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiDataReadOption, 0);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.f12019c.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void updateHiHealthData(HiDataUpdateOption hiDataUpdateOption, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiDataUpdateOption, 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.f12019c.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public int addHiHealthDataCustomType(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.f12019c.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public int fetchHiHealthDataCustomType(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.f12019c.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void registerDataClient(HiDeviceInfo hiDeviceInfo, List list, IRegisterClientListener iRegisterClientListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiDeviceInfo, 0);
                    parcelObtain.writeList(list);
                    parcelObtain.writeStrongInterface(iRegisterClientListener);
                    this.f12019c.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void registerDataClientWithUserInfo(HiDeviceInfo hiDeviceInfo, HiUserInfo hiUserInfo, List list, IRegisterClientListener iRegisterClientListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiDeviceInfo, 0);
                    _Parcel.d(parcelObtain, hiUserInfo, 0);
                    parcelObtain.writeList(list);
                    parcelObtain.writeStrongInterface(iRegisterClientListener);
                    this.f12019c.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void fetchBuildInDataClient(IDataClientListener iDataClientListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iDataClientListener);
                    this.f12019c.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void fetchManualDataClient(IDataClientListener iDataClientListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iDataClientListener);
                    this.f12019c.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void fetchPhoneDataClient(IDataClientListener iDataClientListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iDataClientListener);
                    this.f12019c.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void fetchRegisteredDataClient(int i, IDataClientListener iDataClientListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iDataClientListener);
                    this.f12019c.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void fetchDataClientByUniqueID(int i, String str, IDataClientListener iDataClientListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iDataClientListener);
                    this.f12019c.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public HiHealthUnit fetchPreferUnit(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.f12019c.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (HiHealthUnit) _Parcel.a(parcelObtain2, HiHealthUnit.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void setPreferUnit(int i, HiHealthUnit hiHealthUnit) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    _Parcel.d(parcelObtain, hiHealthUnit, 0);
                    this.f12019c.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void fetchDataSourceByType(int i, HiTimeInterval hiTimeInterval, IDataClientListener iDataClientListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    _Parcel.d(parcelObtain, hiTimeInterval, 0);
                    parcelObtain.writeStrongInterface(iDataClientListener);
                    this.f12019c.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void setUserData(HiUserInfo hiUserInfo, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiUserInfo, 0);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.f12019c.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void fetchUserData(ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.f12019c.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void synCloud(HiSyncOption hiSyncOption, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiSyncOption, 0);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.f12019c.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void checkDataStatus(List list, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeList(list);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.f12019c.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void synCloudCancel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    this.f12019c.transact(30, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void hiLogin(HiAccountInfo hiAccountInfo, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiAccountInfo, 0);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.f12019c.transact(31, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void hiLogout(ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.f12019c.transact(32, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void fetchAccountInfo(ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.f12019c.transact(33, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void setGoalInfo(int i, List list, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeList(list);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.f12019c.transact(34, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void fetchGoalInfo(int i, int i2, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.f12019c.transact(35, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public boolean setUserPreference(HiUserPreference hiUserPreference, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiUserPreference, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f12019c.transact(36, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public HiUserPreference getUserPreference(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.f12019c.transact(37, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (HiUserPreference) _Parcel.a(parcelObtain2, HiUserPreference.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public boolean checkHiHealthLogin(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.f12019c.transact(38, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public int getHiHealthVersionCode() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    this.f12019c.transact(39, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void readDeviceInfo(IDataHiDeviceInfoListener iDataHiDeviceInfoListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iDataHiDeviceInfoListener);
                    this.f12019c.transact(40, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void queryKitAppInfo(IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.f12019c.transact(41, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void queryHealthKitPermission(int i, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.f12019c.transact(42, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void updateHealthKitPermission(int i, int i2, int i3, boolean z, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.f12019c.transact(43, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void queryWearKitAppInfo(IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.f12019c.transact(44, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void queryWearKitPermission(int i, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.f12019c.transact(45, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void updateWearKitPermission(int i, int i2, boolean z, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.f12019c.transact(46, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void insertRealTimeHiHealthData(HiDataInsertOption hiDataInsertOption, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiDataInsertOption, 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.f12019c.transact(47, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void setBinder(String str, IBinder iBinder, ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.f12019c.transact(48, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void deleteAllKitHealthData(int i, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.f12019c.transact(49, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void migrateBaseData(IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.f12019c.transact(50, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void fetchSportTypeList(HiDataReadOption hiDataReadOption, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiDataReadOption, 0);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.f12019c.transact(51, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void fetchSequenceDataBySportType(HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiDataReadOption, 0);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.f12019c.transact(52, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void fetchSequenceDataProBySportType(HiDataReadProOption hiDataReadProOption, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiDataReadProOption, 0);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.f12019c.transact(53, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void aggregateSportStatData(HiSportStatDataAggregateOption hiSportStatDataAggregateOption, IAggregateListener iAggregateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiSportStatDataAggregateOption, 0);
                    parcelObtain.writeStrongInterface(iAggregateListener);
                    this.f12019c.transact(54, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void fetchDataSource(HiDataSourceFetchOption hiDataSourceFetchOption, IDataClientListener iDataClientListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiDataSourceFetchOption, 0);
                    parcelObtain.writeStrongInterface(iDataClientListener);
                    this.f12019c.transact(55, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void readHiHealthDataPro(HiDataReadProOption hiDataReadProOption, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiDataReadProOption, 0);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.f12019c.transact(56, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void aggregateHiHealthDataPro(HiDataAggregateProOption hiDataAggregateProOption, IAggregateListener iAggregateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiDataAggregateProOption, 0);
                    parcelObtain.writeStrongInterface(iAggregateListener);
                    this.f12019c.transact(57, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void deleteHiHealthDataPro(HiDataDeleteProOption hiDataDeleteProOption, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiDataDeleteProOption, 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.f12019c.transact(58, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public List<HiUserPreference> getUserPreferenceList(List<String> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeStringList(list);
                    this.f12019c.transact(59, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(HiUserPreference.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void readHiHealthDataEx(List list, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeList(list);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.f12019c.transact(60, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void insertFitnessData(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.f12019c.transact(61, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void aggregateHiHealthDataProEx(List list, IAggregateListenerEx iAggregateListenerEx) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeList(list);
                    parcelObtain.writeStrongInterface(iAggregateListenerEx);
                    this.f12019c.transact(62, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void setSampleConfig(List list, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeList(list);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.f12019c.transact(63, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void getSampleConfig(HiSampleConfigProcessOption hiSampleConfigProcessOption, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiSampleConfigProcessOption, 0);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.f12019c.transact(64, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void deleteSampleConfig(HiSampleConfigProcessOption hiSampleConfigProcessOption, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    _Parcel.d(parcelObtain, hiSampleConfigProcessOption, 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.f12019c.transact(65, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void fetchDataSourceByTypes(List list, HiTimeInterval hiTimeInterval, boolean z, IMultiDataClientListener iMultiDataClientListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeList(list);
                    _Parcel.d(parcelObtain, hiTimeInterval, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(iMultiDataClientListener);
                    this.f12019c.transact(66, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealth
            public void deleteHiHealthDataProEx(List list, IDeleteListenerEx iDeleteListenerEx) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealth.DESCRIPTOR);
                    parcelObtain.writeList(list);
                    parcelObtain.writeStrongInterface(iDeleteListenerEx);
                    this.f12019c.transact(67, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T a(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void a(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                d(parcel, list.get(i2), i);
            }
        }
    }
}
