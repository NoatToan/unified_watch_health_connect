package com.huami.watch.companion.sync.ble;

import android.content.Context;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.agps.AGpsSyncHelper;
import com.huami.watch.companion.bind.BindHelper;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.config.DeviceFeature;
import com.huami.watch.companion.sync.BaseSyncHelper;
import com.huami.watch.companion.sync.ble.SyncBleAGpsHelper;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.DoLooper;
import com.huami.watch.util.FilesUtil;
import com.huami.watch.util.Log;
import com.huami.watch.util.StorageUtil;
import com.huami.watch.util.TimeUtil;
import com.huami.watch.util.ZipUtil;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.device.firmware.FwHeaderEncoder;
import com.xiaomi.hm.health.device.firmware.UihEncoder;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class SyncBleAGpsHelper extends BaseSyncHelper {
    private static final String e = "Sync-BLE-AGps";

    public class a implements IHMFirmwareUpgradeCallback {
        public final /* synthetic */ DoLooper.Result a;

        public a(DoLooper.Result result) {
            this.a = result;
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwProgress(Progress progress) {
            Log.v(SyncBleAGpsHelper.e, "Send AGps Alm: " + progress, new Object[0]);
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStart(int i) {
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStop(boolean z) {
            DoLooper.Result result = this.a;
            result.finish = true;
            result.success = z;
        }
    }

    public class b implements IHMFirmwareUpgradeCallback {
        public final /* synthetic */ DoLooper.Result a;

        public b(DoLooper.Result result) {
            this.a = result;
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwProgress(Progress progress) {
            Log.v(SyncBleAGpsHelper.e, "Send AGps Cep: " + progress, new Object[0]);
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStart(int i) {
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStop(boolean z) {
            DoLooper.Result result = this.a;
            result.finish = true;
            result.success = z;
        }
    }

    public class c implements IHMFirmwareUpgradeCallback {
        public final /* synthetic */ DoLooper.Result a;

        public c(DoLooper.Result result) {
            this.a = result;
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwProgress(Progress progress) {
            Log.v(SyncBleAGpsHelper.e, "Send AGps Glonass Alm: " + progress, new Object[0]);
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStart(int i) {
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStop(boolean z) {
            DoLooper.Result result = this.a;
            result.finish = true;
            result.success = z;
        }
    }

    public class d implements IHMFirmwareUpgradeCallback {
        public final /* synthetic */ DoLooper.Result a;

        public d(DoLooper.Result result) {
            this.a = result;
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwProgress(Progress progress) {
            Log.v(SyncBleAGpsHelper.e, "Send AGps Sony LLE: " + progress, new Object[0]);
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStart(int i) {
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStop(boolean z) {
            DoLooper.Result result = this.a;
            result.finish = true;
            result.success = z;
        }
    }

    private static boolean e(Context context) {
        Device deviceFind = BindHelper.getHelper().isBinding() ? DeviceManager.getManager(context).find(BindHelper.getHelper().getBindingDevice()) : DeviceManager.getManager(context).getCurrentDevice();
        if (deviceFind != null) {
            return DeviceFeature.isSupportAGpsSonyLLE(deviceFind);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DoLooper.Result f(DoLooper.Result result) throws Exception {
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DoLooper.Result g(DoLooper.Result result) throws Exception {
        return result;
    }

    public static SyncBleAGpsHelper getHelper(Context context) {
        return (SyncBleAGpsHelper) BaseSyncHelper.getHelper(context, null, SyncBleAGpsHelper.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DoLooper.Result h(DoLooper.Result result) throws Exception {
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DoLooper.Result i(DoLooper.Result result) throws Exception {
        return result;
    }

    private void j(File file) {
        if (AGpsSyncHelper.downloadData(this.mContext, Cloud.FILE_TYPE_AGPS_ZIP, file)) {
            File file2 = null;
            List<File> listUnzip = ZipUtil.unzip(file, file.getParentFile());
            if (!ArraysUtil.isEmpty(listUnzip)) {
                for (File file3 : listUnzip) {
                    if ("gln_alm.bin".equals(file3.getName())) {
                        file2 = file3;
                    }
                }
            }
            if (file2 != null) {
                Log.d(e, "========== Sync AGps Glonass To Watch Start...[" + file2 + "] ==========", new Object[0]);
                HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
                if (hMSmartWatchDevice != null) {
                    HMFirmwareInfo hMFirmwareInfo = new HMFirmwareInfo(file2.getAbsolutePath(), HMFirmwareType.FIRMWARE_GNS_ALM);
                    final DoLooper.Result result = new DoLooper.Result();
                    hMSmartWatchDevice.updateFwUpgrade(hMFirmwareInfo, new c(result));
                    DoLooper.doLoop(new DoLooper.Function() { // from class: yi7
                        @Override // com.huami.watch.util.DoLooper.Function
                        public final Object apply() {
                            return SyncBleAGpsHelper.f(result);
                        }
                    }, 30);
                    Log.d(e, "========== Sync AGps Glonass Alm To Watch, Success: " + result.success + " ==========", new Object[0]);
                }
            }
        }
    }

    private boolean k(File file) {
        File file2;
        if (!AGpsSyncHelper.downloadData(this.mContext, Cloud.FILE_TYPE_AGPS_ALM_ZIP, file)) {
            return false;
        }
        List<File> listUnzip = ZipUtil.unzip(file, file.getParentFile());
        File file3 = null;
        if (ArraysUtil.isEmpty(listUnzip)) {
            file2 = null;
        } else {
            file2 = null;
            for (File file4 : listUnzip) {
                String name = file4.getName();
                if ("gps_alm.bin".equals(name)) {
                    file3 = file4;
                } else if ("cep_pak.bin".equals(name)) {
                    file2 = file4;
                }
            }
        }
        if (file3 == null || file2 == null) {
            return false;
        }
        Log.d(e, "========== Sync AGps To Watch Start...[" + file3 + ", " + file2 + "] ==========", new Object[0]);
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice == null) {
            return false;
        }
        HMFirmwareInfo hMFirmwareInfo = new HMFirmwareInfo(file3.getAbsolutePath(), HMFirmwareType.FIRMWARE_GPS_ALM);
        HMFirmwareInfo hMFirmwareInfo2 = new HMFirmwareInfo(file2.getAbsolutePath(), HMFirmwareType.FIRMWARE_GPS_CEP);
        final DoLooper.Result result = new DoLooper.Result();
        hMSmartWatchDevice.updateFwUpgrade(hMFirmwareInfo, new a(result));
        DoLooper.doLoop(new DoLooper.Function() { // from class: aj7
            @Override // com.huami.watch.util.DoLooper.Function
            public final Object apply() {
                return SyncBleAGpsHelper.g(result);
            }
        }, 30);
        Log.d(e, "========== Sync AGps Alm To Watch, Success: " + result.success + " ==========", new Object[0]);
        boolean zL = result.success & (e(this.mContext) ? true : l(hMSmartWatchDevice, hMFirmwareInfo2));
        Log.d(e, "========== Sync AGps To Watch Finish, Success: " + zL + " ==========", new Object[0]);
        if (zL) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Log.d(e, "Sync AGps Save Sync Time: " + TimeUtil.formatDateTime(jCurrentTimeMillis), new Object[0]);
            AGpsSyncHelper.putAGpsSyncTime(Cloud.FILE_TYPE_AGPS_ALM_ZIP, jCurrentTimeMillis);
        }
        return zL;
    }

    private boolean l(HMSmartWatchDevice hMSmartWatchDevice, HMFirmwareInfo hMFirmwareInfo) {
        final DoLooper.Result result = new DoLooper.Result();
        hMSmartWatchDevice.updateFwUpgrade(hMFirmwareInfo, new b(result));
        DoLooper.doLoop(new DoLooper.Function() { // from class: zi7
            @Override // com.huami.watch.util.DoLooper.Function
            public final Object apply() {
                return SyncBleAGpsHelper.h(result);
            }
        }, 5000, 600);
        boolean z = result.success;
        Log.d(e, "Sync AGps Cep To Watch Finish, Success: " + z, new Object[0]);
        return z;
    }

    private boolean m(File file) {
        if (!AGpsSyncHelper.downloadData(this.mContext, AGpsSyncHelper.FILE_TYPE_SONY_LLE, file)) {
            return false;
        }
        File file2 = null;
        List<File> listUnzip = ZipUtil.unzip(file, file.getParentFile());
        if (!ArraysUtil.isEmpty(listUnzip)) {
            ArrayList arrayList = new ArrayList(listUnzip.size());
            for (File file3 : listUnzip) {
                if ("lle_bds.lle".equals(file3.getName())) {
                    arrayList.add(new FwHeaderEncoder(file3.getAbsolutePath(), HMFirmwareType.FIRMWARE_GPS_SONY_LLE_BEIDOU));
                } else if ("lle_gps.lle".equals(file3.getName())) {
                    arrayList.add(new FwHeaderEncoder(file3.getAbsolutePath(), HMFirmwareType.FIRMWARE_GPS_SONY_LLE_GPS));
                } else if ("lle_glo.lle".equals(file3.getName())) {
                    arrayList.add(new FwHeaderEncoder(file3.getAbsolutePath(), HMFirmwareType.FIRMWARE_GPS_SONY_LLE_GLONASS));
                } else if ("lle_gal.lle".equals(file3.getName())) {
                    arrayList.add(new FwHeaderEncoder(file3.getAbsolutePath(), HMFirmwareType.FIRMWARE_GPS_SONY_LLE_GALILEO));
                } else if ("lle_qzss.lle".equals(file3.getName())) {
                    arrayList.add(new FwHeaderEncoder(file3.getAbsolutePath(), HMFirmwareType.FIRMWARE_GPS_SONY_LLE_QZSS));
                }
            }
            UihEncoder uihEncoder = new UihEncoder(4, 0, 0, true);
            uihEncoder.setChildEncoder(arrayList);
            file2 = new File(uihEncoder.getPath());
        }
        if (file2 == null) {
            return false;
        }
        Log.d(e, "========== Sync AGps Sony LLE To Watch Start...[" + file2 + "] ==========", new Object[0]);
        HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
        if (hMSmartWatchDevice == null) {
            return false;
        }
        HMFirmwareInfo hMFirmwareInfo = new HMFirmwareInfo(file2.getAbsolutePath(), HMFirmwareType.FIRMWARE_BATCH);
        final DoLooper.Result result = new DoLooper.Result();
        hMSmartWatchDevice.updateFwUpgrade(hMFirmwareInfo, new d(result));
        DoLooper.doLoop(new DoLooper.Function() { // from class: xi7
            @Override // com.huami.watch.util.DoLooper.Function
            public final Object apply() {
                return SyncBleAGpsHelper.i(result);
            }
        }, 5000, 600);
        boolean z = result.success;
        Log.d(e, "========== Sync AGps Sony LLE To Watch, Success: " + z + " ==========", new Object[0]);
        if (z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Log.d(e, "Sync AGps Save Sync Sony LLE Time: " + TimeUtil.formatDateTime(jCurrentTimeMillis), new Object[0]);
            AGpsSyncHelper.putAGpsSyncTime(AGpsSyncHelper.FILE_TYPE_SONY_LLE, jCurrentTimeMillis);
        }
        return z;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() {
        boolean zK;
        File aGpsDownloadFile = StorageUtil.getAGpsDownloadFile(this.mContext, Config.isDebug());
        if (AGpsSyncHelper.isNeedSync(Cloud.FILE_TYPE_AGPS_ALM_ZIP)) {
            j(aGpsDownloadFile);
            FilesUtil.delete(aGpsDownloadFile);
            zK = k(aGpsDownloadFile);
            FilesUtil.delete(aGpsDownloadFile);
        } else {
            zK = true;
        }
        return (e(this.mContext) && AGpsSyncHelper.isNeedSync(AGpsSyncHelper.FILE_TYPE_SONY_LLE)) ? zK & m(aGpsDownloadFile) : zK;
    }
}
