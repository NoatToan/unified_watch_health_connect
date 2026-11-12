package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.sport_eco_manager_export.data.EcoSportWrapper;

/* JADX INFO: loaded from: classes10.dex */
public interface isc extends IInterface {

    public static abstract class a extends Binder implements isc {
        static final int TRANSACTION_abnormalChangeSportStateToFinish = 37;
        static final int TRANSACTION_accidentFinishSport = 9;
        static final int TRANSACTION_addAppAndDeviceSportStateListener = 45;
        static final int TRANSACTION_addSportStateChangedListener = 7;
        static final int TRANSACTION_checkSportDoing = 11;
        static final int TRANSACTION_connectChanged = 49;
        static final int TRANSACTION_countDownStart = 42;
        static final int TRANSACTION_finishSport = 3;
        static final int TRANSACTION_getAppLaunchType = 10;
        static final int TRANSACTION_getLocalSportState = 25;
        static final int TRANSACTION_getMinValidDistance = 28;
        static final int TRANSACTION_getPhoneDid = 26;
        static final int TRANSACTION_getRecoverSport = 35;
        static final int TRANSACTION_getSportDurationInSec = 27;
        static final int TRANSACTION_getSportLaunchType = 13;
        static final int TRANSACTION_getSportReportData = 34;
        static final int TRANSACTION_getSportState = 24;
        static final int TRANSACTION_getSportStateFromAppAndDevice = 44;
        static final int TRANSACTION_getSportTotalDuration = 15;
        static final int TRANSACTION_getSportType = 14;
        static final int TRANSACTION_hasOngoingSport = 12;
        static final int TRANSACTION_isAppAloneLaunch = 21;
        static final int TRANSACTION_onDestroy = 18;
        static final int TRANSACTION_onStopSport = 19;
        static final int TRANSACTION_pauseSport = 1;
        static final int TRANSACTION_refreshSportRemind = 41;
        static final int TRANSACTION_removeAppAndDeviceSportStateListener = 46;
        static final int TRANSACTION_removeRecoverSport = 20;
        static final int TRANSACTION_removeSportStateChangedListener = 8;
        static final int TRANSACTION_restartSport = 4;
        static final int TRANSACTION_resumeSport = 2;
        static final int TRANSACTION_setAutoPause = 36;
        static final int TRANSACTION_setFtpStateReceiveListener = 40;
        static final int TRANSACTION_setGymAppLaunchType = 47;
        static final int TRANSACTION_setGymFtpPercentRpm = 32;
        static final int TRANSACTION_setGymFtpTest = 31;
        static final int TRANSACTION_setGymPace = 33;
        static final int TRANSACTION_setGymSpeed = 30;
        static final int TRANSACTION_setLocalReceiveListener = 39;
        static final int TRANSACTION_setSportSyncDataListener = 38;
        static final int TRANSACTION_startLocalSport = 5;
        static final int TRANSACTION_startSport = 6;
        static final int TRANSACTION_startSportHr = 23;
        static final int TRANSACTION_startSportRemind = 43;
        static final int TRANSACTION_stopSportHr = 22;
        static final int TRANSACTION_syncLocalDeviceSportStatus = 17;
        static final int TRANSACTION_syncRecoverSport = 29;
        static final int TRANSACTION_syncWearSportStatus = 16;
        static final int TRANSACTION_updateSportStateData = 48;

        /* JADX INFO: renamed from: isc$a$a, reason: collision with other inner class name */
        public static class C0975a implements isc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f22044a;

            public C0975a(IBinder iBinder) {
                this.f22044a = iBinder;
            }

            @Override // defpackage.isc
            public void abnormalChangeSportStateToFinish() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(37, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void accidentFinishSport(String str, int i, ew7 ew7Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(ew7Var);
                    this.f22044a.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void addAppAndDeviceSportStateListener(String str, esc escVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(escVar);
                    this.f22044a.transact(45, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void addSportStateChangedListener(String str, esc escVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(escVar);
                    this.f22044a.transact(7, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22044a;
            }

            @Override // defpackage.isc
            public boolean checkSportDoing() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void connectChanged(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f22044a.transact(49, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void countDownStart(int i, int i2, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f22044a.transact(42, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void finishSport(String str, int i, ew7 ew7Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(ew7Var);
                    this.f22044a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public int getAppLaunchType() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public int getLocalSportState() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public int getMinValidDistance() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public String getPhoneDid() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public EcoSportWrapper getRecoverSport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(35, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (EcoSportWrapper) b.c(parcelObtain2, EcoSportWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public long getSportDurationInSec() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public int getSportLaunchType() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public EcoSportWrapper getSportReportData() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(34, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (EcoSportWrapper) b.c(parcelObtain2, EcoSportWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public int getSportState() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public int getSportStateFromAppAndDevice() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(44, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public long getSportTotalDuration() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public int getSportType() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public boolean hasOngoingSport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public boolean isAppAloneLaunch() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void onDestroy(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeString(str);
                    this.f22044a.transact(18, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void onStopSport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(19, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void pauseSport(String str, int i, ew7 ew7Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(ew7Var);
                    this.f22044a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void refreshSportRemind(int i, EcoSportWrapper ecoSportWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeInt(i);
                    b.d(parcelObtain, ecoSportWrapper, 0);
                    this.f22044a.transact(41, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void removeRecoverSport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(20, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void restartSport(String str, int i, ew7 ew7Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(ew7Var);
                    this.f22044a.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void resumeSport(String str, int i, ew7 ew7Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(ew7Var);
                    this.f22044a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void setAutoPause(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f22044a.transact(36, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void setFtpStateReceiveListener(psc pscVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeStrongInterface(pscVar);
                    this.f22044a.transact(40, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void setGymAppLaunchType(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeInt(i);
                    this.f22044a.transact(47, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void setGymFtpPercentRpm(int i, ew7 ew7Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(ew7Var);
                    this.f22044a.transact(32, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void setGymFtpTest(boolean z, ew7 ew7Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(ew7Var);
                    this.f22044a.transact(31, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void setGymPace(int i, ew7 ew7Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(ew7Var);
                    this.f22044a.transact(33, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void setGymSpeed(float f, ew7 ew7Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeFloat(f);
                    parcelObtain.writeStrongInterface(ew7Var);
                    this.f22044a.transact(30, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void setLocalReceiveListener(bsc bscVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeStrongInterface(bscVar);
                    this.f22044a.transact(39, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void setSportSyncDataListener(fsc fscVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeStrongInterface(fscVar);
                    this.f22044a.transact(38, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void startLocalSport(String str, EcoSportWrapper ecoSportWrapper, ew7 ew7Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeString(str);
                    b.d(parcelObtain, ecoSportWrapper, 0);
                    parcelObtain.writeStrongInterface(ew7Var);
                    this.f22044a.transact(5, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void startSport(String str, EcoSportWrapper ecoSportWrapper, ew7 ew7Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeString(str);
                    b.d(parcelObtain, ecoSportWrapper, 0);
                    parcelObtain.writeStrongInterface(ew7Var);
                    this.f22044a.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void startSportRemind(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    parcelObtain.writeInt(i);
                    this.f22044a.transact(43, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void syncLocalDeviceSportStatus() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(17, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void syncRecoverSport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void syncWearSportStatus() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    this.f22044a.transact(16, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.isc
            public void updateSportStateData(EcoSportWrapper ecoSportWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                    b.d(parcelObtain, ecoSportWrapper, 0);
                    this.f22044a.transact(48, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
        }

        public static isc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof isc)) ? new C0975a(iBinder) : (isc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteStateApi");
                return true;
            }
            switch (i) {
                case 1:
                    pauseSport(parcel.readString(), parcel.readInt(), ew7.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 2:
                    resumeSport(parcel.readString(), parcel.readInt(), ew7.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3:
                    finishSport(parcel.readString(), parcel.readInt(), ew7.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 4:
                    restartSport(parcel.readString(), parcel.readInt(), ew7.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 5:
                    startLocalSport(parcel.readString(), (EcoSportWrapper) b.c(parcel, EcoSportWrapper.INSTANCE), ew7.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 6:
                    startSport(parcel.readString(), (EcoSportWrapper) b.c(parcel, EcoSportWrapper.INSTANCE), ew7.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 7:
                    addSportStateChangedListener(parcel.readString(), esc.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 8:
                    removeSportStateChangedListener(parcel.readString(), esc.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 9:
                    accidentFinishSport(parcel.readString(), parcel.readInt(), ew7.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 10:
                    int appLaunchType = getAppLaunchType();
                    parcel2.writeNoException();
                    parcel2.writeInt(appLaunchType);
                    return true;
                case 11:
                    boolean zCheckSportDoing = checkSportDoing();
                    parcel2.writeNoException();
                    parcel2.writeInt(zCheckSportDoing ? 1 : 0);
                    return true;
                case 12:
                    boolean zHasOngoingSport = hasOngoingSport();
                    parcel2.writeNoException();
                    parcel2.writeInt(zHasOngoingSport ? 1 : 0);
                    return true;
                case 13:
                    int sportLaunchType = getSportLaunchType();
                    parcel2.writeNoException();
                    parcel2.writeInt(sportLaunchType);
                    return true;
                case 14:
                    int sportType = getSportType();
                    parcel2.writeNoException();
                    parcel2.writeInt(sportType);
                    return true;
                case 15:
                    long sportTotalDuration = getSportTotalDuration();
                    parcel2.writeNoException();
                    parcel2.writeLong(sportTotalDuration);
                    return true;
                case 16:
                    syncWearSportStatus();
                    return true;
                case 17:
                    syncLocalDeviceSportStatus();
                    return true;
                case 18:
                    onDestroy(parcel.readString());
                    return true;
                case 19:
                    onStopSport();
                    return true;
                case 20:
                    removeRecoverSport();
                    return true;
                case 21:
                    boolean zIsAppAloneLaunch = isAppAloneLaunch();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsAppAloneLaunch ? 1 : 0);
                    return true;
                case 22:
                    stopSportHr(dsc.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 23:
                    startSportHr(dsc.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 24:
                    int sportState = getSportState();
                    parcel2.writeNoException();
                    parcel2.writeInt(sportState);
                    return true;
                case 25:
                    int localSportState = getLocalSportState();
                    parcel2.writeNoException();
                    parcel2.writeInt(localSportState);
                    return true;
                case 26:
                    String phoneDid = getPhoneDid();
                    parcel2.writeNoException();
                    parcel2.writeString(phoneDid);
                    return true;
                case 27:
                    long sportDurationInSec = getSportDurationInSec();
                    parcel2.writeNoException();
                    parcel2.writeLong(sportDurationInSec);
                    return true;
                case 28:
                    int minValidDistance = getMinValidDistance();
                    parcel2.writeNoException();
                    parcel2.writeInt(minValidDistance);
                    return true;
                case 29:
                    syncRecoverSport();
                    parcel2.writeNoException();
                    return true;
                case 30:
                    setGymSpeed(parcel.readFloat(), ew7.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 31:
                    setGymFtpTest(parcel.readInt() != 0, ew7.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 32:
                    setGymFtpPercentRpm(parcel.readInt(), ew7.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 33:
                    setGymPace(parcel.readInt(), ew7.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 34:
                    EcoSportWrapper sportReportData = getSportReportData();
                    parcel2.writeNoException();
                    b.d(parcel2, sportReportData, 1);
                    return true;
                case 35:
                    EcoSportWrapper recoverSport = getRecoverSport();
                    parcel2.writeNoException();
                    b.d(parcel2, recoverSport, 1);
                    return true;
                case 36:
                    setAutoPause(parcel.readInt() != 0);
                    return true;
                case 37:
                    abnormalChangeSportStateToFinish();
                    return true;
                case 38:
                    setSportSyncDataListener(fsc.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 39:
                    setLocalReceiveListener(bsc.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 40:
                    setFtpStateReceiveListener(psc.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 41:
                    refreshSportRemind(parcel.readInt(), (EcoSportWrapper) b.c(parcel, EcoSportWrapper.INSTANCE));
                    return true;
                case 42:
                    countDownStart(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 43:
                    startSportRemind(parcel.readInt());
                    return true;
                case 44:
                    int sportStateFromAppAndDevice = getSportStateFromAppAndDevice();
                    parcel2.writeNoException();
                    parcel2.writeInt(sportStateFromAppAndDevice);
                    return true;
                case 45:
                    addAppAndDeviceSportStateListener(parcel.readString(), esc.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 46:
                    removeAppAndDeviceSportStateListener(parcel.readString(), esc.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 47:
                    setGymAppLaunchType(parcel.readInt());
                    return true;
                case 48:
                    updateSportStateData((EcoSportWrapper) b.c(parcel, EcoSportWrapper.INSTANCE));
                    return true;
                case 49:
                    connectChanged(parcel.readInt() != 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    public static class b {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void abnormalChangeSportStateToFinish() throws RemoteException;

    void accidentFinishSport(String str, int i, ew7 ew7Var) throws RemoteException;

    void addAppAndDeviceSportStateListener(String str, esc escVar) throws RemoteException;

    void addSportStateChangedListener(String str, esc escVar) throws RemoteException;

    boolean checkSportDoing() throws RemoteException;

    void connectChanged(boolean z) throws RemoteException;

    void countDownStart(int i, int i2, boolean z) throws RemoteException;

    void finishSport(String str, int i, ew7 ew7Var) throws RemoteException;

    int getAppLaunchType() throws RemoteException;

    int getLocalSportState() throws RemoteException;

    int getMinValidDistance() throws RemoteException;

    String getPhoneDid() throws RemoteException;

    EcoSportWrapper getRecoverSport() throws RemoteException;

    long getSportDurationInSec() throws RemoteException;

    int getSportLaunchType() throws RemoteException;

    EcoSportWrapper getSportReportData() throws RemoteException;

    int getSportState() throws RemoteException;

    int getSportStateFromAppAndDevice() throws RemoteException;

    long getSportTotalDuration() throws RemoteException;

    int getSportType() throws RemoteException;

    boolean hasOngoingSport() throws RemoteException;

    boolean isAppAloneLaunch() throws RemoteException;

    void onDestroy(String str) throws RemoteException;

    void onStopSport() throws RemoteException;

    void pauseSport(String str, int i, ew7 ew7Var) throws RemoteException;

    void refreshSportRemind(int i, EcoSportWrapper ecoSportWrapper) throws RemoteException;

    void removeAppAndDeviceSportStateListener(String str, esc escVar) throws RemoteException;

    void removeRecoverSport() throws RemoteException;

    void removeSportStateChangedListener(String str, esc escVar) throws RemoteException;

    void restartSport(String str, int i, ew7 ew7Var) throws RemoteException;

    void resumeSport(String str, int i, ew7 ew7Var) throws RemoteException;

    void setAutoPause(boolean z) throws RemoteException;

    void setFtpStateReceiveListener(psc pscVar) throws RemoteException;

    void setGymAppLaunchType(int i) throws RemoteException;

    void setGymFtpPercentRpm(int i, ew7 ew7Var) throws RemoteException;

    void setGymFtpTest(boolean z, ew7 ew7Var) throws RemoteException;

    void setGymPace(int i, ew7 ew7Var) throws RemoteException;

    void setGymSpeed(float f, ew7 ew7Var) throws RemoteException;

    void setLocalReceiveListener(bsc bscVar) throws RemoteException;

    void setSportSyncDataListener(fsc fscVar) throws RemoteException;

    void startLocalSport(String str, EcoSportWrapper ecoSportWrapper, ew7 ew7Var) throws RemoteException;

    void startSport(String str, EcoSportWrapper ecoSportWrapper, ew7 ew7Var) throws RemoteException;

    void startSportHr(dsc dscVar) throws RemoteException;

    void startSportRemind(int i) throws RemoteException;

    void stopSportHr(dsc dscVar) throws RemoteException;

    void syncLocalDeviceSportStatus() throws RemoteException;

    void syncRecoverSport() throws RemoteException;

    void syncWearSportStatus() throws RemoteException;

    void updateSportStateData(EcoSportWrapper ecoSportWrapper) throws RemoteException;
}
