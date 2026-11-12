package com.huawei.hihealth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.hihealth.model.EventTypeInfo;
import com.huawei.hihealth.model.SubscribeModel;
import com.huawei.hihealth.model.Subscriber;
import com.huawei.hihealth.option.HiHealthCapabilityQuery;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface IHiHealthKit extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hihealth.IHiHealthKit";

    public static class Default implements IHiHealthKit {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void bindDevice(String str, String str2, String str3, int i, ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void connectSportDevice(int i, ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void deleteSample(int i, HiHealthKitData hiHealthKitData, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void deleteSamples(int i, List list, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void execQuery(int i, HiHealthDataQuery hiHealthDataQuery, int i2, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void getBirthday(int i, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public String getCategory(int i) throws RemoteException {
            return null;
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void getCount(int i, HiHealthDataQuery hiHealthDataQuery, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void getDataAuthStatus(int i, int i2, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void getDataAuthStatusEx(int i, int[] iArr, int[] iArr2, IBaseCallback iBaseCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void getDeviceList(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void getGender(int i, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void getHealthyLivingData(int i, HiHealthCapabilityQuery hiHealthCapabilityQuery, ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void getHeight(int i, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public int getServiceApiLevel() throws RemoteException {
            return 0;
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void getSwitch(int i, String str, ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void getUserInfo(List<String> list, ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void getUserPreference(List<String> list, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void getWeight(int i, ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void pauseSport(ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public String preRequestAuth(int i, int[] iArr, int[] iArr2, IBaseCallback iBaseCallback) throws RemoteException {
            return null;
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void pushMsgToWearable(String str, String str2, ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void queryData(HealthKitDictQuery healthKitDictQuery, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void querySleepWakeTime(int i, HiHealthDataQuery hiHealthDataQuery, int i2, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void queryTrends(TrendQuery trendQuery, int i, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void readFromWearable(String str, String str2, IReadCallback iReadCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void registerDataAutoReport(DataReportModel dataReportModel, IRegisterRealTimeCallback iRegisterRealTimeCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void registerPackageName(String str) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void registerRealTimeSportCallback(ISportDataCallback iSportDataCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void requestAuthorization(int i, int[] iArr, int[] iArr2, IBaseCallback iBaseCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void resumeSport(ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void saveSample(int i, HiHealthKitData hiHealthKitData, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void saveSamples(int i, List<HiHealthKitData> list, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void sendDeviceCommand(int i, String str, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void sendDeviceControlinstruction(String str, ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void setBinder(IBinder iBinder) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void setKitVersion(String str) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void setUserPreference(HiUserPreferenceData hiUserPreferenceData, boolean z, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void startReadingAtrial(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void startReadingHeartRate(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void startReadingRRI(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void startSport(int i, ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void startSportEnhance(StartSportParam startSportParam, ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void stopReadingAtrial(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void stopReadingHeartRate(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void stopReadingRRI(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void stopSport(ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void subscribeData(SubscribeModel subscribeModel, ISubScribeCallback iSubScribeCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void subscribeDataEx(Subscriber subscriber, EventTypeInfo eventTypeInfo, ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void syncData(int[] iArr, ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void unSubscribeData(SubscribeModel subscribeModel, ISubScribeCallback iSubScribeCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void unSubscribeDataEx(Subscriber subscriber, EventTypeInfo eventTypeInfo, ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void unregisterDataAutoReport(DataReportModel dataReportModel, IRegisterRealTimeCallback iRegisterRealTimeCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void unregisterRealTimeSportCallback(ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKit
        public void writeToWearable(String str, String str2, byte[] bArr, String str3, IWriteCallback iWriteCallback) throws RemoteException {
        }
    }

    void bindDevice(String str, String str2, String str3, int i, ICommonCallback iCommonCallback) throws RemoteException;

    void connectSportDevice(int i, ICommonCallback iCommonCallback) throws RemoteException;

    void deleteSample(int i, HiHealthKitData hiHealthKitData, IDataOperateListener iDataOperateListener) throws RemoteException;

    void deleteSamples(int i, List list, IDataOperateListener iDataOperateListener) throws RemoteException;

    void execQuery(int i, HiHealthDataQuery hiHealthDataQuery, int i2, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void getBirthday(int i, ICommonListener iCommonListener) throws RemoteException;

    String getCategory(int i) throws RemoteException;

    void getCount(int i, HiHealthDataQuery hiHealthDataQuery, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void getDataAuthStatus(int i, int i2, IDataOperateListener iDataOperateListener) throws RemoteException;

    void getDataAuthStatusEx(int i, int[] iArr, int[] iArr2, IBaseCallback iBaseCallback) throws RemoteException;

    void getDeviceList(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException;

    void getGender(int i, ICommonListener iCommonListener) throws RemoteException;

    void getHealthyLivingData(int i, HiHealthCapabilityQuery hiHealthCapabilityQuery, ICommonCallback iCommonCallback) throws RemoteException;

    void getHeight(int i, ICommonListener iCommonListener) throws RemoteException;

    int getServiceApiLevel() throws RemoteException;

    void getSwitch(int i, String str, ICommonCallback iCommonCallback) throws RemoteException;

    void getUserInfo(List<String> list, ICommonCallback iCommonCallback) throws RemoteException;

    void getUserPreference(List<String> list, IDataOperateListener iDataOperateListener) throws RemoteException;

    void getWeight(int i, ICommonListener iCommonListener) throws RemoteException;

    void pauseSport(ICommonCallback iCommonCallback) throws RemoteException;

    String preRequestAuth(int i, int[] iArr, int[] iArr2, IBaseCallback iBaseCallback) throws RemoteException;

    void pushMsgToWearable(String str, String str2, ICommonCallback iCommonCallback) throws RemoteException;

    void queryData(HealthKitDictQuery healthKitDictQuery, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void querySleepWakeTime(int i, HiHealthDataQuery hiHealthDataQuery, int i2, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void queryTrends(TrendQuery trendQuery, int i, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void readFromWearable(String str, String str2, IReadCallback iReadCallback) throws RemoteException;

    void registerDataAutoReport(DataReportModel dataReportModel, IRegisterRealTimeCallback iRegisterRealTimeCallback) throws RemoteException;

    void registerPackageName(String str) throws RemoteException;

    void registerRealTimeSportCallback(ISportDataCallback iSportDataCallback) throws RemoteException;

    void requestAuthorization(int i, int[] iArr, int[] iArr2, IBaseCallback iBaseCallback) throws RemoteException;

    void resumeSport(ICommonCallback iCommonCallback) throws RemoteException;

    void saveSample(int i, HiHealthKitData hiHealthKitData, IDataOperateListener iDataOperateListener) throws RemoteException;

    void saveSamples(int i, List<HiHealthKitData> list, IDataOperateListener iDataOperateListener) throws RemoteException;

    void sendDeviceCommand(int i, String str, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException;

    void sendDeviceControlinstruction(String str, ICommonCallback iCommonCallback) throws RemoteException;

    void setBinder(IBinder iBinder) throws RemoteException;

    void setKitVersion(String str) throws RemoteException;

    void setUserPreference(HiUserPreferenceData hiUserPreferenceData, boolean z, IDataOperateListener iDataOperateListener) throws RemoteException;

    void startReadingAtrial(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException;

    void startReadingHeartRate(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException;

    void startReadingRRI(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException;

    void startSport(int i, ICommonCallback iCommonCallback) throws RemoteException;

    void startSportEnhance(StartSportParam startSportParam, ICommonCallback iCommonCallback) throws RemoteException;

    void stopReadingAtrial(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException;

    void stopReadingHeartRate(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException;

    void stopReadingRRI(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException;

    void stopSport(ICommonCallback iCommonCallback) throws RemoteException;

    void subscribeData(SubscribeModel subscribeModel, ISubScribeCallback iSubScribeCallback) throws RemoteException;

    void subscribeDataEx(Subscriber subscriber, EventTypeInfo eventTypeInfo, ICommonCallback iCommonCallback) throws RemoteException;

    void syncData(int[] iArr, ICommonCallback iCommonCallback) throws RemoteException;

    void unSubscribeData(SubscribeModel subscribeModel, ISubScribeCallback iSubScribeCallback) throws RemoteException;

    void unSubscribeDataEx(Subscriber subscriber, EventTypeInfo eventTypeInfo, ICommonCallback iCommonCallback) throws RemoteException;

    void unregisterDataAutoReport(DataReportModel dataReportModel, IRegisterRealTimeCallback iRegisterRealTimeCallback) throws RemoteException;

    void unregisterRealTimeSportCallback(ICommonCallback iCommonCallback) throws RemoteException;

    void writeToWearable(String str, String str2, byte[] bArr, String str3, IWriteCallback iWriteCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements IHiHealthKit {
        static final int TRANSACTION_bindDevice = 41;
        static final int TRANSACTION_connectSportDevice = 54;
        static final int TRANSACTION_deleteSample = 34;
        static final int TRANSACTION_deleteSamples = 8;
        static final int TRANSACTION_execQuery = 5;
        static final int TRANSACTION_getBirthday = 2;
        static final int TRANSACTION_getCategory = 37;
        static final int TRANSACTION_getCount = 6;
        static final int TRANSACTION_getDataAuthStatus = 10;
        static final int TRANSACTION_getDataAuthStatusEx = 29;
        static final int TRANSACTION_getDeviceList = 15;
        static final int TRANSACTION_getGender = 1;
        static final int TRANSACTION_getHealthyLivingData = 33;
        static final int TRANSACTION_getHeight = 3;
        static final int TRANSACTION_getServiceApiLevel = 32;
        static final int TRANSACTION_getSwitch = 24;
        static final int TRANSACTION_getUserInfo = 43;
        static final int TRANSACTION_getUserPreference = 45;
        static final int TRANSACTION_getWeight = 4;
        static final int TRANSACTION_pauseSport = 51;
        static final int TRANSACTION_preRequestAuth = 35;
        static final int TRANSACTION_pushMsgToWearable = 21;
        static final int TRANSACTION_queryData = 40;
        static final int TRANSACTION_querySleepWakeTime = 25;
        static final int TRANSACTION_queryTrends = 55;
        static final int TRANSACTION_readFromWearable = 20;
        static final int TRANSACTION_registerDataAutoReport = 38;
        static final int TRANSACTION_registerPackageName = 31;
        static final int TRANSACTION_registerRealTimeSportCallback = 22;
        static final int TRANSACTION_requestAuthorization = 9;
        static final int TRANSACTION_resumeSport = 52;
        static final int TRANSACTION_saveSample = 7;
        static final int TRANSACTION_saveSamples = 36;
        static final int TRANSACTION_sendDeviceCommand = 16;
        static final int TRANSACTION_sendDeviceControlinstruction = 50;
        static final int TRANSACTION_setBinder = 28;
        static final int TRANSACTION_setKitVersion = 30;
        static final int TRANSACTION_setUserPreference = 44;
        static final int TRANSACTION_startReadingAtrial = 17;
        static final int TRANSACTION_startReadingHeartRate = 11;
        static final int TRANSACTION_startReadingRRI = 13;
        static final int TRANSACTION_startSport = 26;
        static final int TRANSACTION_startSportEnhance = 42;
        static final int TRANSACTION_stopReadingAtrial = 18;
        static final int TRANSACTION_stopReadingHeartRate = 12;
        static final int TRANSACTION_stopReadingRRI = 14;
        static final int TRANSACTION_stopSport = 27;
        static final int TRANSACTION_subscribeData = 46;
        static final int TRANSACTION_subscribeDataEx = 48;
        static final int TRANSACTION_syncData = 53;
        static final int TRANSACTION_unSubscribeData = 47;
        static final int TRANSACTION_unSubscribeDataEx = 49;
        static final int TRANSACTION_unregisterDataAutoReport = 39;
        static final int TRANSACTION_unregisterRealTimeSportCallback = 23;
        static final int TRANSACTION_writeToWearable = 19;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IHiHealthKit.DESCRIPTOR);
        }

        public static IHiHealthKit asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IHiHealthKit.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IHiHealthKit)) {
                return (IHiHealthKit) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IHiHealthKit.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IHiHealthKit.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    getGender(parcel.readInt(), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    getBirthday(parcel.readInt(), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    getHeight(parcel.readInt(), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    getWeight(parcel.readInt(), ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    execQuery(parcel.readInt(), (HiHealthDataQuery) _Parcel.a(parcel, HiHealthDataQuery.CREATOR), parcel.readInt(), IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    getCount(parcel.readInt(), (HiHealthDataQuery) _Parcel.a(parcel, HiHealthDataQuery.CREATOR), IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    saveSample(parcel.readInt(), (HiHealthKitData) _Parcel.a(parcel, HiHealthKitData.CREATOR), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    deleteSamples(parcel.readInt(), parcel.readArrayList(getClass().getClassLoader()), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    requestAuthorization(parcel.readInt(), parcel.createIntArray(), parcel.createIntArray(), IBaseCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    getDataAuthStatus(parcel.readInt(), parcel.readInt(), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    startReadingHeartRate(parcel.readInt(), IRealTimeDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    stopReadingHeartRate(parcel.readInt(), IRealTimeDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    startReadingRRI(parcel.readInt(), IRealTimeDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    stopReadingRRI(parcel.readInt(), IRealTimeDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    getDeviceList(parcel.readInt(), IRealTimeDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    sendDeviceCommand(parcel.readInt(), parcel.readString(), IRealTimeDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    startReadingAtrial(parcel.readInt(), IRealTimeDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    stopReadingAtrial(parcel.readInt(), IRealTimeDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 19:
                    writeToWearable(parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readString(), IWriteCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    readFromWearable(parcel.readString(), parcel.readString(), IReadCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    pushMsgToWearable(parcel.readString(), parcel.readString(), ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    registerRealTimeSportCallback(ISportDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    unregisterRealTimeSportCallback(ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    getSwitch(parcel.readInt(), parcel.readString(), ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    querySleepWakeTime(parcel.readInt(), (HiHealthDataQuery) _Parcel.a(parcel, HiHealthDataQuery.CREATOR), parcel.readInt(), IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    startSport(parcel.readInt(), ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    stopSport(ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 28:
                    setBinder(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case 29:
                    getDataAuthStatusEx(parcel.readInt(), parcel.createIntArray(), parcel.createIntArray(), IBaseCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 30:
                    setKitVersion(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 31:
                    registerPackageName(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 32:
                    int serviceApiLevel = getServiceApiLevel();
                    parcel2.writeNoException();
                    parcel2.writeInt(serviceApiLevel);
                    return true;
                case 33:
                    getHealthyLivingData(parcel.readInt(), (HiHealthCapabilityQuery) _Parcel.a(parcel, HiHealthCapabilityQuery.CREATOR), ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 34:
                    deleteSample(parcel.readInt(), (HiHealthKitData) _Parcel.a(parcel, HiHealthKitData.CREATOR), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 35:
                    String strPreRequestAuth = preRequestAuth(parcel.readInt(), parcel.createIntArray(), parcel.createIntArray(), IBaseCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeString(strPreRequestAuth);
                    return true;
                case 36:
                    saveSamples(parcel.readInt(), parcel.createTypedArrayList(HiHealthKitData.CREATOR), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 37:
                    String category = getCategory(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(category);
                    return true;
                case 38:
                    registerDataAutoReport((DataReportModel) _Parcel.a(parcel, DataReportModel.CREATOR), IRegisterRealTimeCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 39:
                    unregisterDataAutoReport((DataReportModel) _Parcel.a(parcel, DataReportModel.CREATOR), IRegisterRealTimeCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 40:
                    queryData((HealthKitDictQuery) _Parcel.a(parcel, HealthKitDictQuery.CREATOR), IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 41:
                    bindDevice(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 42:
                    startSportEnhance((StartSportParam) _Parcel.a(parcel, StartSportParam.CREATOR), ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 43:
                    getUserInfo(parcel.createStringArrayList(), ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 44:
                    setUserPreference((HiUserPreferenceData) _Parcel.a(parcel, HiUserPreferenceData.CREATOR), parcel.readInt() != 0, IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 45:
                    getUserPreference(parcel.createStringArrayList(), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 46:
                    subscribeData((SubscribeModel) _Parcel.a(parcel, SubscribeModel.CREATOR), ISubScribeCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 47:
                    unSubscribeData((SubscribeModel) _Parcel.a(parcel, SubscribeModel.CREATOR), ISubScribeCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 48:
                    subscribeDataEx((Subscriber) _Parcel.a(parcel, Subscriber.CREATOR), (EventTypeInfo) _Parcel.a(parcel, EventTypeInfo.CREATOR), ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 49:
                    unSubscribeDataEx((Subscriber) _Parcel.a(parcel, Subscriber.CREATOR), (EventTypeInfo) _Parcel.a(parcel, EventTypeInfo.CREATOR), ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 50:
                    sendDeviceControlinstruction(parcel.readString(), ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 51:
                    pauseSport(ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 52:
                    resumeSport(ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 53:
                    syncData(parcel.createIntArray(), ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 54:
                    connectSportDevice(parcel.readInt(), ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 55:
                    queryTrends((TrendQuery) _Parcel.a(parcel, TrendQuery.CREATOR), parcel.readInt(), IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        static class Proxy implements IHiHealthKit {
            private IBinder e;

            Proxy(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.e;
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void getGender(int i, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.e.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void getBirthday(int i, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.e.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void getHeight(int i, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.e.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void getWeight(int i, ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.e.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void execQuery(int i, HiHealthDataQuery hiHealthDataQuery, int i2, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    _Parcel.e(parcelObtain, hiHealthDataQuery, 0);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.e.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void getCount(int i, HiHealthDataQuery hiHealthDataQuery, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    _Parcel.e(parcelObtain, hiHealthDataQuery, 0);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.e.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void saveSample(int i, HiHealthKitData hiHealthKitData, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    _Parcel.e(parcelObtain, hiHealthKitData, 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.e.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void deleteSamples(int i, List list, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeList(list);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.e.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void requestAuthorization(int i, int[] iArr, int[] iArr2, IBaseCallback iBaseCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeIntArray(iArr);
                    parcelObtain.writeIntArray(iArr2);
                    parcelObtain.writeStrongInterface(iBaseCallback);
                    this.e.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void getDataAuthStatus(int i, int i2, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.e.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void startReadingHeartRate(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iRealTimeDataCallback);
                    this.e.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void stopReadingHeartRate(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iRealTimeDataCallback);
                    this.e.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void startReadingRRI(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iRealTimeDataCallback);
                    this.e.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void stopReadingRRI(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iRealTimeDataCallback);
                    this.e.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void getDeviceList(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iRealTimeDataCallback);
                    this.e.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void sendDeviceCommand(int i, String str, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iRealTimeDataCallback);
                    this.e.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void startReadingAtrial(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iRealTimeDataCallback);
                    this.e.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void stopReadingAtrial(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iRealTimeDataCallback);
                    this.e.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void writeToWearable(String str, String str2, byte[] bArr, String str3, IWriteCallback iWriteCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeStrongInterface(iWriteCallback);
                    this.e.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void readFromWearable(String str, String str2, IReadCallback iReadCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(iReadCallback);
                    this.e.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void pushMsgToWearable(String str, String str2, ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void registerRealTimeSportCallback(ISportDataCallback iSportDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iSportDataCallback);
                    this.e.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void unregisterRealTimeSportCallback(ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void getSwitch(int i, String str, ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void querySleepWakeTime(int i, HiHealthDataQuery hiHealthDataQuery, int i2, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    _Parcel.e(parcelObtain, hiHealthDataQuery, 0);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.e.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void startSport(int i, ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void stopSport(ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void setBinder(IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.e.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void getDataAuthStatusEx(int i, int[] iArr, int[] iArr2, IBaseCallback iBaseCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeIntArray(iArr);
                    parcelObtain.writeIntArray(iArr2);
                    parcelObtain.writeStrongInterface(iBaseCallback);
                    this.e.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void setKitVersion(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.e.transact(30, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void registerPackageName(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.e.transact(31, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public int getServiceApiLevel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    this.e.transact(32, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void getHealthyLivingData(int i, HiHealthCapabilityQuery hiHealthCapabilityQuery, ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    _Parcel.e(parcelObtain, hiHealthCapabilityQuery, 0);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(33, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void deleteSample(int i, HiHealthKitData hiHealthKitData, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    _Parcel.e(parcelObtain, hiHealthKitData, 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.e.transact(34, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public String preRequestAuth(int i, int[] iArr, int[] iArr2, IBaseCallback iBaseCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeIntArray(iArr);
                    parcelObtain.writeIntArray(iArr2);
                    parcelObtain.writeStrongInterface(iBaseCallback);
                    this.e.transact(35, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void saveSamples(int i, List<HiHealthKitData> list, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    _Parcel.d(parcelObtain, list, 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.e.transact(36, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public String getCategory(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.e.transact(37, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void registerDataAutoReport(DataReportModel dataReportModel, IRegisterRealTimeCallback iRegisterRealTimeCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    _Parcel.e(parcelObtain, dataReportModel, 0);
                    parcelObtain.writeStrongInterface(iRegisterRealTimeCallback);
                    this.e.transact(38, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void unregisterDataAutoReport(DataReportModel dataReportModel, IRegisterRealTimeCallback iRegisterRealTimeCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    _Parcel.e(parcelObtain, dataReportModel, 0);
                    parcelObtain.writeStrongInterface(iRegisterRealTimeCallback);
                    this.e.transact(39, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void queryData(HealthKitDictQuery healthKitDictQuery, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    _Parcel.e(parcelObtain, healthKitDictQuery, 0);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.e.transact(40, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void bindDevice(String str, String str2, String str3, int i, ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(41, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void startSportEnhance(StartSportParam startSportParam, ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    _Parcel.e(parcelObtain, startSportParam, 0);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(42, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void getUserInfo(List<String> list, ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(43, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void setUserPreference(HiUserPreferenceData hiUserPreferenceData, boolean z, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    _Parcel.e(parcelObtain, hiUserPreferenceData, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.e.transact(44, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void getUserPreference(List<String> list, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.e.transact(45, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void subscribeData(SubscribeModel subscribeModel, ISubScribeCallback iSubScribeCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    _Parcel.e(parcelObtain, subscribeModel, 0);
                    parcelObtain.writeStrongInterface(iSubScribeCallback);
                    this.e.transact(46, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void unSubscribeData(SubscribeModel subscribeModel, ISubScribeCallback iSubScribeCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    _Parcel.e(parcelObtain, subscribeModel, 0);
                    parcelObtain.writeStrongInterface(iSubScribeCallback);
                    this.e.transact(47, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void subscribeDataEx(Subscriber subscriber, EventTypeInfo eventTypeInfo, ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    _Parcel.e(parcelObtain, subscriber, 0);
                    _Parcel.e(parcelObtain, eventTypeInfo, 0);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(48, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void unSubscribeDataEx(Subscriber subscriber, EventTypeInfo eventTypeInfo, ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    _Parcel.e(parcelObtain, subscriber, 0);
                    _Parcel.e(parcelObtain, eventTypeInfo, 0);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(49, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void sendDeviceControlinstruction(String str, ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(50, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void pauseSport(ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(51, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void resumeSport(ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(52, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void syncData(int[] iArr, ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeIntArray(iArr);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(53, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void connectSportDevice(int i, ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(54, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKit
            public void queryTrends(TrendQuery trendQuery, int i, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKit.DESCRIPTOR);
                    _Parcel.e(parcelObtain, trendQuery, 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.e.transact(55, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T a(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void e(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                e(parcel, list.get(i2), i);
            }
        }
    }
}
