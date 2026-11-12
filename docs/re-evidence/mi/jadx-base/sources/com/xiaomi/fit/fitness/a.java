package com.xiaomi.fit.fitness;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0362a extends Binder implements a {
        static final int TRANSACTION_deleteCurDataByPlanId = 17;
        static final int TRANSACTION_deleteDailyRecord = 11;
        static final int TRANSACTION_deleteSportReport = 12;
        static final int TRANSACTION_disconnectHealthConnect = 19;
        static final int TRANSACTION_getCurWeekPlan = 13;
        static final int TRANSACTION_getLocalCurDatePlanInfo = 15;
        static final int TRANSACTION_insertSwitchSongRecord = 7;
        static final int TRANSACTION_pullAndPushRainbowData = 4;
        static final int TRANSACTION_pullFitnessServerData = 3;
        static final int TRANSACTION_pullRedDotData = 5;
        static final int TRANSACTION_pullSportServerData = 2;
        static final int TRANSACTION_recordDailyRecordToDB = 9;
        static final int TRANSACTION_recordSportReportToDB = 10;
        static final int TRANSACTION_startSyncDataToHealthConnect = 18;
        static final int TRANSACTION_syncCurDatePlanInfo = 16;
        static final int TRANSACTION_syncMedicalDataWithServer = 6;
        static final int TRANSACTION_syncSwitchSongRecordWithServer = 8;
        static final int TRANSACTION_syncWithServer = 1;
        static final int TRANSACTION_updateWeekPlan = 14;

        /* JADX INFO: renamed from: com.xiaomi.fit.fitness.a$a$a, reason: collision with other inner class name */
        public static class C0363a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f11303a;

            public C0363a(IBinder iBinder) {
                this.f11303a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11303a;
            }

            @Override // com.xiaomi.fit.fitness.a
            public void deleteCurDataByPlanId(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                    parcelObtain.writeLong(j);
                    this.f11303a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fit.fitness.a
            public boolean deleteDailyRecord(String str, List<FitnessDBKey> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                    parcelObtain.writeString(str);
                    b.e(parcelObtain, list, 0);
                    this.f11303a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fit.fitness.a
            public boolean deleteSportReport(List<SportDBKey> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                    b.e(parcelObtain, list, 0);
                    this.f11303a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fit.fitness.a
            public void disconnectHealthConnect() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                    this.f11303a.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fit.fitness.a
            public void getCurWeekPlan(c cVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                    parcelObtain.writeStrongInterface(cVar);
                    this.f11303a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fit.fitness.a
            public void getLocalCurDatePlanInfo(c cVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                    parcelObtain.writeStrongInterface(cVar);
                    this.f11303a.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fit.fitness.a
            public void insertSwitchSongRecord(long j, int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.f11303a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fit.fitness.a
            public void pullAndPushRainbowData() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                    this.f11303a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fit.fitness.a
            public void pullFitnessServerData(long j, long j2, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeStringArray(strArr);
                    this.f11303a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fit.fitness.a
            public void pullRedDotData() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                    this.f11303a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fit.fitness.a
            public void pullSportServerData(long j, long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeLong(j2);
                    this.f11303a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fit.fitness.a
            public boolean recordDailyRecordToDB(String str, String str2, List<DailyRecordItemModel> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    b.e(parcelObtain, list, 0);
                    this.f11303a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fit.fitness.a
            public boolean recordSportReportToDB(SportDBKey sportDBKey, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                    b.f(parcelObtain, sportDBKey, 0);
                    parcelObtain.writeString(str);
                    this.f11303a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fit.fitness.a
            public void startSyncDataToHealthConnect() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                    this.f11303a.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fit.fitness.a
            public void syncCurDatePlanInfo(int i, long j, long j2, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    this.f11303a.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fit.fitness.a
            public void syncMedicalDataWithServer(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                    parcelObtain.writeString(str);
                    this.f11303a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fit.fitness.a
            public void syncSwitchSongRecordWithServer() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                    this.f11303a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fit.fitness.a
            public void syncWithServer(boolean z, String str, com.xiaomi.fit.fitness.b bVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(bVar);
                    this.f11303a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.fit.fitness.a
            public void updateWeekPlan(long j, int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.f11303a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0362a() {
            attachInterface(this, "com.xiaomi.fit.fitness.FitnessDataCenterRemote");
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0363a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fit.fitness.FitnessDataCenterRemote");
                return true;
            }
            switch (i) {
                case 1:
                    syncWithServer(parcel.readInt() != 0, parcel.readString(), com.xiaomi.fit.fitness.b.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    pullSportServerData(parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    pullFitnessServerData(parcel.readLong(), parcel.readLong(), parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    pullAndPushRainbowData();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    pullRedDotData();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    syncMedicalDataWithServer(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    insertSwitchSongRecord(parcel.readLong(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    syncSwitchSongRecordWithServer();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    boolean zRecordDailyRecordToDB = recordDailyRecordToDB(parcel.readString(), parcel.readString(), parcel.createTypedArrayList(DailyRecordItemModel.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRecordDailyRecordToDB ? 1 : 0);
                    return true;
                case 10:
                    boolean zRecordSportReportToDB = recordSportReportToDB((SportDBKey) b.d(parcel, SportDBKey.INSTANCE), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zRecordSportReportToDB ? 1 : 0);
                    return true;
                case 11:
                    boolean zDeleteDailyRecord = deleteDailyRecord(parcel.readString(), parcel.createTypedArrayList(FitnessDBKey.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(zDeleteDailyRecord ? 1 : 0);
                    return true;
                case 12:
                    boolean zDeleteSportReport = deleteSportReport(parcel.createTypedArrayList(SportDBKey.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(zDeleteSportReport ? 1 : 0);
                    return true;
                case 13:
                    getCurWeekPlan(c.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    updateWeekPlan(parcel.readLong(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    getLocalCurDatePlanInfo(c.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    syncCurDatePlanInfo(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 17:
                    deleteCurDataByPlanId(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    startSyncDataToHealthConnect();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    disconnectHealthConnect();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
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

    void deleteCurDataByPlanId(long j) throws RemoteException;

    boolean deleteDailyRecord(String str, List<FitnessDBKey> list) throws RemoteException;

    boolean deleteSportReport(List<SportDBKey> list) throws RemoteException;

    void disconnectHealthConnect() throws RemoteException;

    void getCurWeekPlan(c cVar) throws RemoteException;

    void getLocalCurDatePlanInfo(c cVar) throws RemoteException;

    void insertSwitchSongRecord(long j, int i, String str) throws RemoteException;

    void pullAndPushRainbowData() throws RemoteException;

    void pullFitnessServerData(long j, long j2, String[] strArr) throws RemoteException;

    void pullRedDotData() throws RemoteException;

    void pullSportServerData(long j, long j2) throws RemoteException;

    boolean recordDailyRecordToDB(String str, String str2, List<DailyRecordItemModel> list) throws RemoteException;

    boolean recordSportReportToDB(SportDBKey sportDBKey, String str) throws RemoteException;

    void startSyncDataToHealthConnect() throws RemoteException;

    void syncCurDatePlanInfo(int i, long j, long j2, String str) throws RemoteException;

    void syncMedicalDataWithServer(String str) throws RemoteException;

    void syncSwitchSongRecordWithServer() throws RemoteException;

    void syncWithServer(boolean z, String str, com.xiaomi.fit.fitness.b bVar) throws RemoteException;

    void updateWeekPlan(long j, int i, String str) throws RemoteException;
}
