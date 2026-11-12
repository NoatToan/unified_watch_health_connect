package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.sport_manager_export.data.SportWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface czc extends IInterface {

    public static abstract class a extends Binder implements czc {
        static final int TRANSACTION_abnormalChangeSportStateToFinish = 38;
        static final int TRANSACTION_abnormalChangeSportStateToPause = 49;
        static final int TRANSACTION_accidentFinishSport = 11;
        static final int TRANSACTION_addAppAndDeviceSportStateListener = 46;
        static final int TRANSACTION_addBackgroundLocationPermissionListener = 43;
        static final int TRANSACTION_addSportStateChangedListener = 9;
        static final int TRANSACTION_checkSportDoing = 13;
        static final int TRANSACTION_countDownStart = 42;
        static final int TRANSACTION_finishSport = 3;
        static final int TRANSACTION_finishSportWithData = 4;
        static final int TRANSACTION_getAppLaunchType = 12;
        static final int TRANSACTION_getLocalSportState = 27;
        static final int TRANSACTION_getMinValidDistance = 31;
        static final int TRANSACTION_getPhoneDid = 28;
        static final int TRANSACTION_getRecoverSport = 36;
        static final int TRANSACTION_getRouteMatchResult = 53;
        static final int TRANSACTION_getSportDurationInSec = 29;
        static final int TRANSACTION_getSportLaunchType = 15;
        static final int TRANSACTION_getSportReportData = 35;
        static final int TRANSACTION_getSportState = 26;
        static final int TRANSACTION_getSportStateFromAppAndDevice = 45;
        static final int TRANSACTION_getSportTotalDuration = 17;
        static final int TRANSACTION_getSportType = 16;
        static final int TRANSACTION_getWholeKiloPaceList = 54;
        static final int TRANSACTION_hadAdjustmentDistance = 51;
        static final int TRANSACTION_hasOngoingSport = 14;
        static final int TRANSACTION_isAppAloneLaunch = 23;
        static final int TRANSACTION_isEcgDevice = 30;
        static final int TRANSACTION_onDestroy = 20;
        static final int TRANSACTION_onStopSport = 21;
        static final int TRANSACTION_pauseSport = 1;
        static final int TRANSACTION_refreshSportRemind = 41;
        static final int TRANSACTION_removeAppAndDeviceSportStateListener = 47;
        static final int TRANSACTION_removeRecoverSport = 22;
        static final int TRANSACTION_removeSportStateChangedListener = 10;
        static final int TRANSACTION_restartSport = 5;
        static final int TRANSACTION_resumeSport = 2;
        static final int TRANSACTION_segmentSport = 8;
        static final int TRANSACTION_setAutoPause = 37;
        static final int TRANSACTION_setGymAppLaunchType = 48;
        static final int TRANSACTION_setGymPace = 34;
        static final int TRANSACTION_setGymSpeed = 33;
        static final int TRANSACTION_setLocalReceiveListener = 40;
        static final int TRANSACTION_setSportReportDataListener = 50;
        static final int TRANSACTION_setSportSyncDataListener = 39;
        static final int TRANSACTION_shake = 52;
        static final int TRANSACTION_startLocalSport = 6;
        static final int TRANSACTION_startSport = 7;
        static final int TRANSACTION_startSportHr = 25;
        static final int TRANSACTION_startSportRemind = 44;
        static final int TRANSACTION_stopSportHr = 24;
        static final int TRANSACTION_syncLocalDeviceSportStatus = 19;
        static final int TRANSACTION_syncRecoverSport = 32;
        static final int TRANSACTION_syncWearSportStatus = 18;

        /* JADX INFO: renamed from: czc$a$a, reason: collision with other inner class name */
        public static class C0907a implements czc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14887a;

            public C0907a(IBinder iBinder) {
                this.f14887a = iBinder;
            }

            @Override // defpackage.czc
            public void abnormalChangeSportStateToFinish() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(38, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void abnormalChangeSportStateToPause() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(49, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void accidentFinishSport(String str, int i, nkk nkkVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(nkkVar);
                    this.f14887a.transact(11, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void addAppAndDeviceSportStateListener(String str, ixc ixcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(ixcVar);
                    this.f14887a.transact(46, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void addBackgroundLocationPermissionListener(ipc ipcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeStrongInterface(ipcVar);
                    this.f14887a.transact(43, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void addSportStateChangedListener(String str, ixc ixcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(ixcVar);
                    this.f14887a.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14887a;
            }

            @Override // defpackage.czc
            public boolean checkSportDoing() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void countDownStart(int i, int i2, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14887a.transact(42, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void finishSport(String str, int i, nkk nkkVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(nkkVar);
                    this.f14887a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void finishSportWithData(String str, SportWrapper sportWrapper, nkk nkkVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeString(str);
                    b.d(parcelObtain, sportWrapper, 0);
                    parcelObtain.writeStrongInterface(nkkVar);
                    this.f14887a.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public int getAppLaunchType() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public int getLocalSportState() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public int getMinValidDistance() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(31, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public String getPhoneDid() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public SportWrapper getRecoverSport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(36, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (SportWrapper) b.c(parcelObtain2, SportWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public int getRouteMatchResult() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(53, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public long getSportDurationInSec() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public int getSportLaunchType() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public SportWrapper getSportReportData() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(35, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (SportWrapper) b.c(parcelObtain2, SportWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public int getSportState() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public int getSportStateFromAppAndDevice() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(45, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public long getSportTotalDuration() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public int getSportType() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public List getWholeKiloPaceList() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(54, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void hadAdjustmentDistance(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeInt(i);
                    this.f14887a.transact(51, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public boolean hasOngoingSport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public boolean isAppAloneLaunch() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public boolean isEcgDevice(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeString(str);
                    this.f14887a.transact(30, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void onDestroy(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeString(str);
                    this.f14887a.transact(20, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void onStopSport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(21, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void pauseSport(String str, int i, nkk nkkVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(nkkVar);
                    this.f14887a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void refreshSportRemind(int i, SportWrapper sportWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeInt(i);
                    b.d(parcelObtain, sportWrapper, 0);
                    this.f14887a.transact(41, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void removeRecoverSport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(22, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void restartSport(String str, int i, nkk nkkVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(nkkVar);
                    this.f14887a.transact(5, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void resumeSport(String str, int i, nkk nkkVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(nkkVar);
                    this.f14887a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void segmentSport(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.f14887a.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void setAutoPause(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14887a.transact(37, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void setGymAppLaunchType(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeInt(i);
                    this.f14887a.transact(48, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void setGymPace(int i, nkk nkkVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(nkkVar);
                    this.f14887a.transact(34, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void setGymSpeed(float f, nkk nkkVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeFloat(f);
                    parcelObtain.writeStrongInterface(nkkVar);
                    this.f14887a.transact(33, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void setLocalReceiveListener(ptc ptcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeStrongInterface(ptcVar);
                    this.f14887a.transact(40, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void setSportReportDataListener(hxc hxcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeStrongInterface(hxcVar);
                    this.f14887a.transact(50, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void setSportSyncDataListener(jxc jxcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeStrongInterface(jxcVar);
                    this.f14887a.transact(39, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void shake(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeInt(i);
                    this.f14887a.transact(52, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void startLocalSport(String str, SportWrapper sportWrapper, nkk nkkVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeString(str);
                    b.d(parcelObtain, sportWrapper, 0);
                    parcelObtain.writeStrongInterface(nkkVar);
                    this.f14887a.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void startSport(String str, SportWrapper sportWrapper, nkk nkkVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeString(str);
                    b.d(parcelObtain, sportWrapper, 0);
                    parcelObtain.writeStrongInterface(nkkVar);
                    this.f14887a.transact(7, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void startSportRemind(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    parcelObtain.writeInt(i);
                    this.f14887a.transact(44, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void syncLocalDeviceSportStatus() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(19, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void syncRecoverSport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(32, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.czc
            public void syncWearSportStatus() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                    this.f14887a.transact(18, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
        }

        public static czc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof czc)) ? new C0907a(iBinder) : (czc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteStateApi");
                return true;
            }
            switch (i) {
                case 1:
                    pauseSport(parcel.readString(), parcel.readInt(), nkk.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 2:
                    resumeSport(parcel.readString(), parcel.readInt(), nkk.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3:
                    finishSport(parcel.readString(), parcel.readInt(), nkk.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 4:
                    finishSportWithData(parcel.readString(), (SportWrapper) b.c(parcel, SportWrapper.INSTANCE), nkk.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 5:
                    restartSport(parcel.readString(), parcel.readInt(), nkk.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 6:
                    startLocalSport(parcel.readString(), (SportWrapper) b.c(parcel, SportWrapper.INSTANCE), nkk.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 7:
                    startSport(parcel.readString(), (SportWrapper) b.c(parcel, SportWrapper.INSTANCE), nkk.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 8:
                    segmentSport(parcel.readInt(), parcel.readInt());
                    return true;
                case 9:
                    addSportStateChangedListener(parcel.readString(), ixc.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 10:
                    removeSportStateChangedListener(parcel.readString(), ixc.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 11:
                    accidentFinishSport(parcel.readString(), parcel.readInt(), nkk.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 12:
                    int appLaunchType = getAppLaunchType();
                    parcel2.writeNoException();
                    parcel2.writeInt(appLaunchType);
                    return true;
                case 13:
                    boolean zCheckSportDoing = checkSportDoing();
                    parcel2.writeNoException();
                    parcel2.writeInt(zCheckSportDoing ? 1 : 0);
                    return true;
                case 14:
                    boolean zHasOngoingSport = hasOngoingSport();
                    parcel2.writeNoException();
                    parcel2.writeInt(zHasOngoingSport ? 1 : 0);
                    return true;
                case 15:
                    int sportLaunchType = getSportLaunchType();
                    parcel2.writeNoException();
                    parcel2.writeInt(sportLaunchType);
                    return true;
                case 16:
                    int sportType = getSportType();
                    parcel2.writeNoException();
                    parcel2.writeInt(sportType);
                    return true;
                case 17:
                    long sportTotalDuration = getSportTotalDuration();
                    parcel2.writeNoException();
                    parcel2.writeLong(sportTotalDuration);
                    return true;
                case 18:
                    syncWearSportStatus();
                    return true;
                case 19:
                    syncLocalDeviceSportStatus();
                    return true;
                case 20:
                    onDestroy(parcel.readString());
                    return true;
                case 21:
                    onStopSport();
                    return true;
                case 22:
                    removeRecoverSport();
                    return true;
                case 23:
                    boolean zIsAppAloneLaunch = isAppAloneLaunch();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsAppAloneLaunch ? 1 : 0);
                    return true;
                case 24:
                    stopSportHr(ywc.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 25:
                    startSportHr(ywc.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 26:
                    int sportState = getSportState();
                    parcel2.writeNoException();
                    parcel2.writeInt(sportState);
                    return true;
                case 27:
                    int localSportState = getLocalSportState();
                    parcel2.writeNoException();
                    parcel2.writeInt(localSportState);
                    return true;
                case 28:
                    String phoneDid = getPhoneDid();
                    parcel2.writeNoException();
                    parcel2.writeString(phoneDid);
                    return true;
                case 29:
                    long sportDurationInSec = getSportDurationInSec();
                    parcel2.writeNoException();
                    parcel2.writeLong(sportDurationInSec);
                    return true;
                case 30:
                    boolean zIsEcgDevice = isEcgDevice(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsEcgDevice ? 1 : 0);
                    return true;
                case 31:
                    int minValidDistance = getMinValidDistance();
                    parcel2.writeNoException();
                    parcel2.writeInt(minValidDistance);
                    return true;
                case 32:
                    syncRecoverSport();
                    parcel2.writeNoException();
                    return true;
                case 33:
                    setGymSpeed(parcel.readFloat(), nkk.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 34:
                    setGymPace(parcel.readInt(), nkk.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 35:
                    SportWrapper sportReportData = getSportReportData();
                    parcel2.writeNoException();
                    b.d(parcel2, sportReportData, 1);
                    return true;
                case 36:
                    SportWrapper recoverSport = getRecoverSport();
                    parcel2.writeNoException();
                    b.d(parcel2, recoverSport, 1);
                    return true;
                case 37:
                    setAutoPause(parcel.readInt() != 0);
                    return true;
                case 38:
                    abnormalChangeSportStateToFinish();
                    return true;
                case 39:
                    setSportSyncDataListener(jxc.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 40:
                    setLocalReceiveListener(ptc.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 41:
                    refreshSportRemind(parcel.readInt(), (SportWrapper) b.c(parcel, SportWrapper.INSTANCE));
                    return true;
                case 42:
                    countDownStart(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 43:
                    addBackgroundLocationPermissionListener(ipc.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 44:
                    startSportRemind(parcel.readInt());
                    return true;
                case 45:
                    int sportStateFromAppAndDevice = getSportStateFromAppAndDevice();
                    parcel2.writeNoException();
                    parcel2.writeInt(sportStateFromAppAndDevice);
                    return true;
                case 46:
                    addAppAndDeviceSportStateListener(parcel.readString(), ixc.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 47:
                    removeAppAndDeviceSportStateListener(parcel.readString(), ixc.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 48:
                    setGymAppLaunchType(parcel.readInt());
                    return true;
                case 49:
                    abnormalChangeSportStateToPause();
                    return true;
                case 50:
                    setSportReportDataListener(hxc.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 51:
                    hadAdjustmentDistance(parcel.readInt());
                    return true;
                case 52:
                    shake(parcel.readInt());
                    return true;
                case 53:
                    int routeMatchResult = getRouteMatchResult();
                    parcel2.writeNoException();
                    parcel2.writeInt(routeMatchResult);
                    return true;
                case 54:
                    List wholeKiloPaceList = getWholeKiloPaceList();
                    parcel2.writeNoException();
                    parcel2.writeList(wholeKiloPaceList);
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

    void abnormalChangeSportStateToPause() throws RemoteException;

    void accidentFinishSport(String str, int i, nkk nkkVar) throws RemoteException;

    void addAppAndDeviceSportStateListener(String str, ixc ixcVar) throws RemoteException;

    void addBackgroundLocationPermissionListener(ipc ipcVar) throws RemoteException;

    void addSportStateChangedListener(String str, ixc ixcVar) throws RemoteException;

    boolean checkSportDoing() throws RemoteException;

    void countDownStart(int i, int i2, boolean z) throws RemoteException;

    void finishSport(String str, int i, nkk nkkVar) throws RemoteException;

    void finishSportWithData(String str, SportWrapper sportWrapper, nkk nkkVar) throws RemoteException;

    int getAppLaunchType() throws RemoteException;

    int getLocalSportState() throws RemoteException;

    int getMinValidDistance() throws RemoteException;

    String getPhoneDid() throws RemoteException;

    SportWrapper getRecoverSport() throws RemoteException;

    int getRouteMatchResult() throws RemoteException;

    long getSportDurationInSec() throws RemoteException;

    int getSportLaunchType() throws RemoteException;

    SportWrapper getSportReportData() throws RemoteException;

    int getSportState() throws RemoteException;

    int getSportStateFromAppAndDevice() throws RemoteException;

    long getSportTotalDuration() throws RemoteException;

    int getSportType() throws RemoteException;

    List getWholeKiloPaceList() throws RemoteException;

    void hadAdjustmentDistance(int i) throws RemoteException;

    boolean hasOngoingSport() throws RemoteException;

    boolean isAppAloneLaunch() throws RemoteException;

    boolean isEcgDevice(String str) throws RemoteException;

    void onDestroy(String str) throws RemoteException;

    void onStopSport() throws RemoteException;

    void pauseSport(String str, int i, nkk nkkVar) throws RemoteException;

    void refreshSportRemind(int i, SportWrapper sportWrapper) throws RemoteException;

    void removeAppAndDeviceSportStateListener(String str, ixc ixcVar) throws RemoteException;

    void removeRecoverSport() throws RemoteException;

    void removeSportStateChangedListener(String str, ixc ixcVar) throws RemoteException;

    void restartSport(String str, int i, nkk nkkVar) throws RemoteException;

    void resumeSport(String str, int i, nkk nkkVar) throws RemoteException;

    void segmentSport(int i, int i2) throws RemoteException;

    void setAutoPause(boolean z) throws RemoteException;

    void setGymAppLaunchType(int i) throws RemoteException;

    void setGymPace(int i, nkk nkkVar) throws RemoteException;

    void setGymSpeed(float f, nkk nkkVar) throws RemoteException;

    void setLocalReceiveListener(ptc ptcVar) throws RemoteException;

    void setSportReportDataListener(hxc hxcVar) throws RemoteException;

    void setSportSyncDataListener(jxc jxcVar) throws RemoteException;

    void shake(int i) throws RemoteException;

    void startLocalSport(String str, SportWrapper sportWrapper, nkk nkkVar) throws RemoteException;

    void startSport(String str, SportWrapper sportWrapper, nkk nkkVar) throws RemoteException;

    void startSportHr(ywc ywcVar) throws RemoteException;

    void startSportRemind(int i) throws RemoteException;

    void stopSportHr(ywc ywcVar) throws RemoteException;

    void syncLocalDeviceSportStatus() throws RemoteException;

    void syncRecoverSport() throws RemoteException;

    void syncWearSportStatus() throws RemoteException;
}
