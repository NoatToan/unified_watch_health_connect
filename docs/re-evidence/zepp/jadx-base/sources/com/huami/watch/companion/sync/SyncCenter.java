package com.huami.watch.companion.sync;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.agps.AGpsSyncHelper;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.device.config.DeviceFeature;
import com.huami.watch.companion.sport.pb.PBManager;
import com.huami.watch.companion.sync.SyncCenter;
import com.huami.watch.companion.sync.ble.SyncBleAGpsHelper;
import com.huami.watch.companion.sync.ble.SyncBleUtil;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.dataflow.sync.SyncWatchDataHelper;
import com.huami.watch.dataflow.sync.bean.DataType;
import com.huami.watch.dataflow.sync.ble.SyncBleDataHelper;
import com.huami.watch.dataflow.sync.sport.WatchSportDataSyncedCallback;
import com.huami.watch.dataflow.sync.sport.WatchSportDataTransmitter;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import com.xiaomi.hm.health.manager.UnitManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class SyncCenter extends BaseSyncHelper {
    public static final int STATE_FINISH_FAIL = -2;
    public static final int STATE_FINISH_SUCCESS = -1;
    public static final int STATE_NONE = 0;
    public static final int STATE_START = 1;
    public static final int STATE_SYNCING = 2;
    private static final String n = "SyncCenter";
    private int e;
    private int f;
    private boolean h;
    private int i;
    private int j;
    private String k;
    private SportDataSaveToLocalListener l;
    private final List<SyncListener> g = new ArrayList();
    private SyncSportHealthHelper.SyncListener m = new a();

    public interface SportDataSaveToLocalListener {
        void onSportDataSaveToLocal(String str, String str2);

        void updateLocalDataState(List<Pair<Long, String>> list);
    }

    public interface SyncListener {
        void onSyncStateChanged(int i, int i2, String str);
    }

    public class a implements SyncSportHealthHelper.SyncListener {
        public a() {
        }

        @Override // com.huami.watch.companion.sync.SyncSportHealthHelper.SyncListener
        public void onSyncFinish(int i, boolean z) {
            Log.i("SyncCenter", "OnSyncSportHealthFinish : " + i + ", " + z, new Object[0]);
            SyncCenter.this.i = i;
            SyncCenter.this.j = z ? -1 : -2;
            SyncCenter.this.k = null;
            SyncCenter.this.i();
        }

        @Override // com.huami.watch.companion.sync.SyncSportHealthHelper.SyncListener
        public void onSyncStart(int i) {
            Log.i("SyncCenter", "OnSyncSportHealthStart : " + i, new Object[0]);
            SyncCenter.this.i = i;
            SyncCenter.this.j = 1;
            SyncCenter.this.k = null;
            SyncCenter.this.i();
        }

        @Override // com.huami.watch.companion.sync.SyncSportHealthHelper.SyncListener
        public void onSyncing(int i, int i2, int i3, int i4, String str) {
            Log.i("SyncCenter", "OnSportHealthSyncing : " + i + ", " + str, new Object[0]);
            SyncCenter.this.i = i;
            SyncCenter.this.j = 2;
            SyncCenter.this.k = str;
            SyncCenter.this.i();
        }
    }

    public class b implements WatchSportDataSyncedCallback {
        public b() {
        }

        @Override // com.huami.watch.dataflow.sync.sport.WatchSportDataSyncedCallback
        public void transWatchSportSummaryAndDetailToLocal(String str, String str2) {
            if (SyncCenter.this.l != null) {
                SyncCenter.this.l.onSportDataSaveToLocal(str, str2);
            }
        }

        @Override // com.huami.watch.dataflow.sync.sport.WatchSportDataSyncedCallback
        public void updateWatchSportSummaryAndDetailState(List<Pair<Long, String>> list) {
            if (SyncCenter.this.l != null) {
                SyncCenter.this.l.updateLocalDataState(list);
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ List a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;

        public c(List list, int i, int i2, String str) {
            this.a = list;
            this.b = i;
            this.c = i2;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((SyncListener) it2.next()).onSyncStateChanged(this.b, this.c, this.d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(int i, SyncSportHealthHelper syncSportHealthHelper) {
        Log.d("SyncCenter", "Start SportHealth OldChannel Data Sync : " + Integer.toBinaryString(i), new Object[0]);
        if ((i & 2) > 0) {
            syncSportHealthHelper.type(2).start();
        }
        if ((i & 1) > 0) {
            syncSportHealthHelper.type(1).start();
        }
    }

    public static SyncCenter getCenter(@NonNull Context context) {
        return (SyncCenter) BaseSyncHelper.getHelper(context, null, SyncCenter.class);
    }

    private void h() {
        this.i = 2;
        this.j = 1;
        this.k = null;
        i();
        syncCloudHealth();
        this.i = 1;
        this.j = 1;
        this.k = null;
        i();
        j();
        this.f = this.e;
        this.i = Integer.MAX_VALUE;
        this.j = -2;
        this.k = null;
        i();
        Log.d("SyncCenter", "WithoutDevice, Sync Result : true", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        ArrayList arrayList = new ArrayList(this.g);
        int i = this.i;
        int i2 = this.j;
        String str = this.k;
        Log.d("SyncCenter", "OnStateChanged  : <Listeners : " + arrayList.size() + ", Type : " + Integer.toBinaryString(i) + ", State : " + i2 + ", Description : " + str + ">, IsSilent : " + this.h, new Object[0]);
        if (this.h) {
            return;
        }
        Rx.mainThread(new c(arrayList, i, i2, str));
    }

    private void j() {
        SyncCloudSportHelper.getHelper(this.mContext).start();
        SyncCloudFirstbeatHelper.getHelper(this.mContext).start();
        SyncCloudPBHelper.getHelper(this.mContext).start();
    }

    public void clearListeners() {
        synchronized (this.g) {
            this.g.clear();
        }
    }

    public int getLastSyncFailTypes() {
        return this.f;
    }

    public SyncCenter listen(@NonNull SyncListener syncListener) {
        synchronized (this.g) {
            if (!this.g.contains(syncListener)) {
                this.g.add(syncListener);
            }
        }
        return this;
    }

    public SyncCenter listenSportDataToLocal(@NonNull SportDataSaveToLocalListener sportDataSaveToLocalListener) {
        this.l = sportDataSaveToLocalListener;
        return this;
    }

    public void notifyStateChanged(SyncListener syncListener) {
        if (this.i == 0 || this.j == 0) {
            return;
        }
        listen(syncListener);
        i();
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public void onError() {
        super.onRelease();
        this.f = this.e;
        this.i = Integer.MAX_VALUE;
        this.j = -2;
        this.k = null;
        i();
        clearListeners();
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public void onRelease() {
        super.onRelease();
        SyncSportHealthHelper.getHelper(this.mContext).onRelease();
        this.e = 0;
        this.f = 0;
        clearListeners();
        this.i = 0;
        this.j = 0;
        this.k = null;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() {
        final SyncSportHealthHelper helper;
        SyncWatchDataHelper helper2;
        boolean z;
        boolean z2;
        int i;
        Transporter transporter;
        boolean zStart;
        boolean zStart2;
        int i2;
        this.i = 0;
        this.j = 0;
        this.k = null;
        final int i3 = this.e;
        Log.d("SyncCenter", "SyncTypes : " + Integer.toBinaryString(i3) + ", Silent : " + this.h, new Object[0]);
        SyncUtil.waitCurrentDeviceChannelAvailable(this.mContext, 5);
        if (!DeviceManager.getManager(this.mContext).isBoundDeviceConnected()) {
            Log.d("SyncCenter", "WithoutDevice, Sync CloudData Only!!", new Object[0]);
            h();
            this.h = false;
            return true;
        }
        Device currentDevice = DeviceManager.getManager(this.mContext).getCurrentDevice();
        if (currentDevice == null) {
            return true;
        }
        if (DeviceSource.isSeriesEverest2(currentDevice)) {
            helper = null;
            helper2 = null;
            z = true;
        } else {
            Log.d("SyncCenter", "Init Classic SyncWatchDataHelper...", new Object[0]);
            helper = SyncSportHealthHelper.getHelper(this.mContext);
            helper2 = SyncWatchDataHelper.getHelper();
            if (DeviceUtil.isRomSupportNewSportHealthChannel(this.mContext) && ((i3 & 2) > 0 || (i3 & 1) > 0)) {
                helper2.requestSyncDataStart();
            }
            z = false;
        }
        Log.d("SyncCenter", "Is BLE Device: " + z, new Object[0]);
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        String cpuId = currentDevice.getCpuId();
        String sn = currentDevice.getSN();
        int deviceSource = DeviceSource.getDeviceSource(currentDevice);
        String dataSource = DeviceSource.getDataSource(currentDevice);
        if (z) {
            SyncBleUtil.sendLoginToken(this.mContext);
        }
        String str = "SyncFailTypes : ";
        if ((i3 & 2) > 0) {
            this.i = 2;
            this.j = 1;
            this.k = null;
            i();
            if (DeviceUtil.isRomSupportNewSportHealthChannel(this.mContext)) {
                if (z) {
                    boolean zSync = SyncBleDataHelper.getHelper(this.mContext).sync(DataType.HEALTH, hMSmartWatchDevice, cpuId, deviceSource, sn, dataSource, DeviceUtil.isSupportSyncBLESingleHR(currentDevice));
                    SyncBleDataHelper.getHelper(this.mContext).sync(DataType.STRESS, hMSmartWatchDevice, cpuId, deviceSource, sn, dataSource, false);
                    zStart2 = zSync;
                } else {
                    zStart2 = helper2.sync(DataType.HEALTH);
                    if (DeviceUtil.isSupportAtrialFibrillation(currentDevice)) {
                        zStart2 &= helper2.sync(DataType.ATRIAL_FIBRILLATION);
                    }
                    if (DeviceSource.isModelXihuE(currentDevice)) {
                        zStart2 &= helper2.sync(DataType.ECG);
                    }
                    if (DeviceUtil.isSupportSyncHeartRate(currentDevice)) {
                        zStart2 &= helper2.sync(DataType.HEART_RATE);
                    }
                    if (DeviceFeature.isSupportRrPeak(currentDevice)) {
                        zStart2 &= helper2.sync(DataType.RR_PEAK);
                    }
                }
                this.j = zStart2 ? -1 : -2;
                i();
            } else {
                str = "SyncFailTypes : ";
                zStart2 = !z ? helper.type(this.i).listen(this.m).start() : true;
            }
            syncCloudHealth();
            if (zStart2) {
                i2 = 0;
            } else {
                i2 = this.i | 0;
                Log.d("SyncCenter", str + Integer.toBinaryString(i2), new Object[0]);
            }
            z2 = zStart2;
            i = i2;
        } else {
            str = "SyncFailTypes : ";
            z2 = true;
            i = 0;
        }
        if ((i3 & 1) > 0) {
            this.i = 1;
            this.j = 1;
            this.k = null;
            i();
            if (DeviceUtil.isRomSupportNewSportHealthChannel(this.mContext)) {
                WatchSportDataTransmitter.getInstance().setCallback(new b());
                zStart = !z ? helper2.sync(DataType.SPORT) : SyncBleDataHelper.getHelper(this.mContext).sync(DataType.SPORT, hMSmartWatchDevice, cpuId, deviceSource, sn, dataSource, false);
                if (DeviceSource.isSeriesEverest(currentDevice)) {
                    zStart &= !z ? helper2.sync(DataType.FIRSTBEAT) : SyncBleDataHelper.getHelper(this.mContext).sync(DataType.FIRSTBEAT, hMSmartWatchDevice, cpuId, deviceSource, sn, dataSource, false);
                }
                this.j = zStart ? -1 : -2;
                i();
            } else {
                zStart = !z ? helper.type(this.i).listen(this.m).start() : true;
            }
            if (zStart) {
                j();
            }
            if (!zStart) {
                int i4 = i | this.i;
                Log.d("SyncCenter", str + Integer.toBinaryString(i4), new Object[0]);
                i = i4;
            }
            z2 &= zStart;
        }
        this.i = 4;
        this.j = 1;
        this.k = null;
        i();
        boolean zStart3 = !z ? AGpsSyncHelper.getHelper().syncAGpsToWatch(this.mContext, 10, currentDevice).success : SyncBleAGpsHelper.getHelper(this.mContext).start();
        this.j = zStart3 ? -1 : -2;
        i();
        if (!zStart3) {
            i |= this.i;
            Log.d("SyncCenter", str + Integer.toBinaryString(i), new Object[0]);
        }
        boolean z3 = z2 & zStart3;
        if ((i3 & 8) > 0) {
            this.i = 8;
            this.j = 1;
            this.k = null;
            i();
            boolean zStart4 = SyncAssistantHelper.get(this.mContext).start();
            this.j = zStart4 ? -1 : -2;
            i();
            if (!zStart4) {
                int i5 = i | this.i;
                Log.d("SyncCenter", str + Integer.toBinaryString(i5), new Object[0]);
                i = i5;
            }
            z3 &= zStart4;
        }
        int i6 = i;
        if ((i3 & 32) > 0) {
            if (z || (transporter = this.mTransporter) == null) {
                SyncBleUtil.syncSystemTimeToWatch();
                SyncBleUtil.syncUserInfoToWatch(this.mContext);
                SyncBleUtil.sendUserCalorieGoal(this.mContext);
                SyncBleUtil.sendWeatherDailyNotify(this.mContext);
                SyncBleUtil.sendUserStepGoal(this.mContext);
                SyncBleUtil.sendUserHeartRateAllDay(this.mContext);
                SyncBleUtil.sendDistanceUnit(UnitManager.getInstance().isMetric());
                if (DeviceUtil.isSupportSyncBLEPb(this.mContext)) {
                    SyncBleUtil.sendPBInfos(PBManager.get().getAllPBToWatch(this.mContext), true);
                } else {
                    SyncUtil.syncConfirmedPbToWatch(this.mContext, CompanionModule.ACTION_SYNC_ALL_CONFIRMED_PB, PBManager.get().getAllPBToWatch(this.mContext));
                }
            } else {
                SyncUtil.syncUserInfoToWatchClassic(this.mContext, transporter);
                SyncUtil.syncSystemTimeToWatchClassic(this.mTransporter);
                SyncUtil.S(this.mContext, this.mTransporter);
                SyncTokenHelper.syncTokenToWatch(this.mContext, this.mTransporter, false);
                SyncUtil.syncConfirmedPbToWatch(this.mContext, CompanionModule.ACTION_SYNC_ALL_CONFIRMED_PB, PBManager.get().getAllPBToWatch(this.mContext));
                this.mTransporter = null;
            }
        }
        if (z3) {
            Box.putSyncCenterTime(System.currentTimeMillis());
        }
        this.f = i6;
        this.i = Integer.MAX_VALUE;
        this.j = z3 ? -1 : -2;
        this.k = null;
        i();
        clearListeners();
        this.h = false;
        if (!z && DeviceUtil.isRomSupportNewSportHealthChannel(this.mContext)) {
            Rx.io(new Runnable() { // from class: ej7
                @Override // java.lang.Runnable
                public final void run() {
                    SyncCenter.g(i3, helper);
                }
            }).safeSubscribe();
        }
        return z3;
    }

    public void removeListener(SyncListener syncListener) {
        synchronized (this.g) {
            this.g.remove(syncListener);
        }
    }

    public SyncCenter silent(boolean z) {
        this.h = z;
        return this;
    }

    public void syncCloud() {
        SyncCloudHealthHelper.getHelper(this.mContext).startAsync();
        SyncCloudHealthHRHelper.getHelper(this.mContext).startAsync();
        SyncCloudEcgHelper.getHelper(this.mContext).startAsync();
        SyncCloudFirstbeatHelper.getHelper(this.mContext).startAsync();
        SyncCloudPBHelper.getHelper(this.mContext).startAsync();
    }

    public void syncCloudHealth() {
        SyncCloudHealthHelper.getHelper(this.mContext).start();
        SyncCloudHealthHRHelper.getHelper(this.mContext).start();
        SyncCloudEcgHelper.getHelper(this.mContext).startAsync();
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public String tag() {
        return "SyncCenter";
    }

    public SyncCenter transporter(Transporter transporter) {
        this.mTransporter = transporter;
        return this;
    }

    public SyncCenter types(int i) {
        this.e = i;
        return this;
    }
}
