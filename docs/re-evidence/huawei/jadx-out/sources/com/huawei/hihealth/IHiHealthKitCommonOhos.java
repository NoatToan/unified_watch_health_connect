package com.huawei.hihealth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.hihealthkit.context.OutOfBandData;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface IHiHealthKitCommonOhos extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hihealth.IHiHealthKitCommonOhos";

    public static class Default implements IHiHealthKitCommonOhos {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
        public void execQueryOhos(OutOfBandData outOfBandData, IDataReadResultListenerOhos iDataReadResultListenerOhos, int i, HiHealthDataQuery hiHealthDataQuery) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
        public String getCategory(int i) throws RemoteException {
            return null;
        }

        @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
        public int getServiceApiLevel(OutOfBandData outOfBandData) throws RemoteException {
            return 0;
        }

        @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
        public void getUserInfo(OutOfBandData outOfBandData, List<String> list, ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
        public void getUserPreference(OutOfBandData outOfBandData, List<String> list, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
        public void isAvailable(OutOfBandData outOfBandData, ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
        public void queryDataOhos(OutOfBandData outOfBandData, HealthKitDictQuery healthKitDictQuery, IDataReadResultListenerOhos iDataReadResultListenerOhos) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
        public void registerPackageName(String str) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
        public void registerSportData(OutOfBandData outOfBandData, ISportDataCallback iSportDataCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
        public void saveSamplesOhos(OutOfBandData outOfBandData, List<HiHealthKitDataOhos> list, IDataOperateListenerOhos iDataOperateListenerOhos) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
        public void setKitVersion(String str) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
        public void setUserPreference(OutOfBandData outOfBandData, HiUserPreferenceData hiUserPreferenceData, boolean z, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
        public void startSportEnhance(OutOfBandData outOfBandData, StartSportParam startSportParam, ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
        public void stopSport(OutOfBandData outOfBandData, ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
        public void unregisterSportData(OutOfBandData outOfBandData, ICommonCallback iCommonCallback) throws RemoteException {
        }
    }

    void execQueryOhos(OutOfBandData outOfBandData, IDataReadResultListenerOhos iDataReadResultListenerOhos, int i, HiHealthDataQuery hiHealthDataQuery) throws RemoteException;

    String getCategory(int i) throws RemoteException;

    int getServiceApiLevel(OutOfBandData outOfBandData) throws RemoteException;

    void getUserInfo(OutOfBandData outOfBandData, List<String> list, ICommonCallback iCommonCallback) throws RemoteException;

    void getUserPreference(OutOfBandData outOfBandData, List<String> list, IDataOperateListener iDataOperateListener) throws RemoteException;

    void isAvailable(OutOfBandData outOfBandData, ICommonCallback iCommonCallback) throws RemoteException;

    void queryDataOhos(OutOfBandData outOfBandData, HealthKitDictQuery healthKitDictQuery, IDataReadResultListenerOhos iDataReadResultListenerOhos) throws RemoteException;

    void registerPackageName(String str) throws RemoteException;

    void registerSportData(OutOfBandData outOfBandData, ISportDataCallback iSportDataCallback) throws RemoteException;

    void saveSamplesOhos(OutOfBandData outOfBandData, List<HiHealthKitDataOhos> list, IDataOperateListenerOhos iDataOperateListenerOhos) throws RemoteException;

    void setKitVersion(String str) throws RemoteException;

    void setUserPreference(OutOfBandData outOfBandData, HiUserPreferenceData hiUserPreferenceData, boolean z, IDataOperateListener iDataOperateListener) throws RemoteException;

    void startSportEnhance(OutOfBandData outOfBandData, StartSportParam startSportParam, ICommonCallback iCommonCallback) throws RemoteException;

    void stopSport(OutOfBandData outOfBandData, ICommonCallback iCommonCallback) throws RemoteException;

    void unregisterSportData(OutOfBandData outOfBandData, ICommonCallback iCommonCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements IHiHealthKitCommonOhos {
        static final int TRANSACTION_execQueryOhos = 1;
        static final int TRANSACTION_getCategory = 5;
        static final int TRANSACTION_getServiceApiLevel = 4;
        static final int TRANSACTION_getUserInfo = 8;
        static final int TRANSACTION_getUserPreference = 10;
        static final int TRANSACTION_isAvailable = 15;
        static final int TRANSACTION_queryDataOhos = 7;
        static final int TRANSACTION_registerPackageName = 3;
        static final int TRANSACTION_registerSportData = 13;
        static final int TRANSACTION_saveSamplesOhos = 6;
        static final int TRANSACTION_setKitVersion = 2;
        static final int TRANSACTION_setUserPreference = 9;
        static final int TRANSACTION_startSportEnhance = 11;
        static final int TRANSACTION_stopSport = 12;
        static final int TRANSACTION_unregisterSportData = 14;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IHiHealthKitCommonOhos.DESCRIPTOR);
        }

        public static IHiHealthKitCommonOhos asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IHiHealthKitCommonOhos.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IHiHealthKitCommonOhos)) {
                return (IHiHealthKitCommonOhos) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IHiHealthKitCommonOhos.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IHiHealthKitCommonOhos.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    execQueryOhos((OutOfBandData) _Parcel.e(parcel, OutOfBandData.CREATOR), IDataReadResultListenerOhos.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (HiHealthDataQuery) _Parcel.e(parcel, HiHealthDataQuery.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    setKitVersion(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    registerPackageName(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int serviceApiLevel = getServiceApiLevel((OutOfBandData) _Parcel.e(parcel, OutOfBandData.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(serviceApiLevel);
                    return true;
                case 5:
                    String category = getCategory(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(category);
                    return true;
                case 6:
                    saveSamplesOhos((OutOfBandData) _Parcel.e(parcel, OutOfBandData.CREATOR), parcel.createTypedArrayList(HiHealthKitDataOhos.CREATOR), IDataOperateListenerOhos.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    queryDataOhos((OutOfBandData) _Parcel.e(parcel, OutOfBandData.CREATOR), (HealthKitDictQuery) _Parcel.e(parcel, HealthKitDictQuery.CREATOR), IDataReadResultListenerOhos.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    getUserInfo((OutOfBandData) _Parcel.e(parcel, OutOfBandData.CREATOR), parcel.createStringArrayList(), ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    setUserPreference((OutOfBandData) _Parcel.e(parcel, OutOfBandData.CREATOR), (HiUserPreferenceData) _Parcel.e(parcel, HiUserPreferenceData.CREATOR), parcel.readInt() != 0, IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    getUserPreference((OutOfBandData) _Parcel.e(parcel, OutOfBandData.CREATOR), parcel.createStringArrayList(), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    startSportEnhance((OutOfBandData) _Parcel.e(parcel, OutOfBandData.CREATOR), (StartSportParam) _Parcel.e(parcel, StartSportParam.CREATOR), ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    stopSport((OutOfBandData) _Parcel.e(parcel, OutOfBandData.CREATOR), ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    registerSportData((OutOfBandData) _Parcel.e(parcel, OutOfBandData.CREATOR), ISportDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    unregisterSportData((OutOfBandData) _Parcel.e(parcel, OutOfBandData.CREATOR), ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    isAvailable((OutOfBandData) _Parcel.e(parcel, OutOfBandData.CREATOR), ICommonCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        static class Proxy implements IHiHealthKitCommonOhos {
            private IBinder e;

            Proxy(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.e;
            }

            @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
            public void execQueryOhos(OutOfBandData outOfBandData, IDataReadResultListenerOhos iDataReadResultListenerOhos, int i, HiHealthDataQuery hiHealthDataQuery) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKitCommonOhos.DESCRIPTOR);
                    _Parcel.c(parcelObtain, outOfBandData, 0);
                    parcelObtain.writeStrongInterface(iDataReadResultListenerOhos);
                    parcelObtain.writeInt(i);
                    _Parcel.c(parcelObtain, hiHealthDataQuery, 0);
                    this.e.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
            public void setKitVersion(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKitCommonOhos.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.e.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
            public void registerPackageName(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKitCommonOhos.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.e.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
            public int getServiceApiLevel(OutOfBandData outOfBandData) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKitCommonOhos.DESCRIPTOR);
                    _Parcel.c(parcelObtain, outOfBandData, 0);
                    this.e.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
            public String getCategory(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKitCommonOhos.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.e.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
            public void saveSamplesOhos(OutOfBandData outOfBandData, List<HiHealthKitDataOhos> list, IDataOperateListenerOhos iDataOperateListenerOhos) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKitCommonOhos.DESCRIPTOR);
                    _Parcel.c(parcelObtain, outOfBandData, 0);
                    _Parcel.a(parcelObtain, list, 0);
                    parcelObtain.writeStrongInterface(iDataOperateListenerOhos);
                    this.e.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
            public void queryDataOhos(OutOfBandData outOfBandData, HealthKitDictQuery healthKitDictQuery, IDataReadResultListenerOhos iDataReadResultListenerOhos) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKitCommonOhos.DESCRIPTOR);
                    _Parcel.c(parcelObtain, outOfBandData, 0);
                    _Parcel.c(parcelObtain, healthKitDictQuery, 0);
                    parcelObtain.writeStrongInterface(iDataReadResultListenerOhos);
                    this.e.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
            public void getUserInfo(OutOfBandData outOfBandData, List<String> list, ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKitCommonOhos.DESCRIPTOR);
                    _Parcel.c(parcelObtain, outOfBandData, 0);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
            public void setUserPreference(OutOfBandData outOfBandData, HiUserPreferenceData hiUserPreferenceData, boolean z, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKitCommonOhos.DESCRIPTOR);
                    _Parcel.c(parcelObtain, outOfBandData, 0);
                    _Parcel.c(parcelObtain, hiUserPreferenceData, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.e.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
            public void getUserPreference(OutOfBandData outOfBandData, List<String> list, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKitCommonOhos.DESCRIPTOR);
                    _Parcel.c(parcelObtain, outOfBandData, 0);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.e.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
            public void startSportEnhance(OutOfBandData outOfBandData, StartSportParam startSportParam, ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKitCommonOhos.DESCRIPTOR);
                    _Parcel.c(parcelObtain, outOfBandData, 0);
                    _Parcel.c(parcelObtain, startSportParam, 0);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
            public void stopSport(OutOfBandData outOfBandData, ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKitCommonOhos.DESCRIPTOR);
                    _Parcel.c(parcelObtain, outOfBandData, 0);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
            public void registerSportData(OutOfBandData outOfBandData, ISportDataCallback iSportDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKitCommonOhos.DESCRIPTOR);
                    _Parcel.c(parcelObtain, outOfBandData, 0);
                    parcelObtain.writeStrongInterface(iSportDataCallback);
                    this.e.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
            public void unregisterSportData(OutOfBandData outOfBandData, ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKitCommonOhos.DESCRIPTOR);
                    _Parcel.c(parcelObtain, outOfBandData, 0);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
            public void isAvailable(OutOfBandData outOfBandData, ICommonCallback iCommonCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHiHealthKitCommonOhos.DESCRIPTOR);
                    _Parcel.c(parcelObtain, outOfBandData, 0);
                    parcelObtain.writeStrongInterface(iCommonCallback);
                    this.e.transact(15, parcelObtain, parcelObtain2, 0);
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
        public static <T> T e(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void c(Parcel parcel, T t, int i) {
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
                c(parcel, list.get(i2), i);
            }
        }
    }
}
