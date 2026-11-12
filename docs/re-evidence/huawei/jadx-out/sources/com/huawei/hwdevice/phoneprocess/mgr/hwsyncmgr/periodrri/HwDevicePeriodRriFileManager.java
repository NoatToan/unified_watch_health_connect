package com.huawei.hwdevice.phoneprocess.mgr.hwsyncmgr.periodrri;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.datatype.PeriodRriEntity;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwcommonmodel.utils.ThermalCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import defpackage.ecu;
import defpackage.eey;
import defpackage.ets;
import defpackage.mbs;
import defpackage.mga;
import defpackage.mgb;
import defpackage.mhp;
import defpackage.mit;
import defpackage.mnn;
import defpackage.mrj;
import defpackage.myk;
import defpackage.myw;
import defpackage.myz;
import defpackage.mzj;
import defpackage.xjt;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes11.dex */
public class HwDevicePeriodRriFileManager extends HwBaseManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f17501b = new Object();
    private static HwDevicePeriodRriFileManager e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f17502a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f17503c;
    private boolean d;
    private int f;
    private int g;
    private long h;
    private IBaseResponseCallback i;
    private ITransferSleepAndDFXFileCallback.Stub j;
    private long k;
    private e l;
    private final Object m;
    private boolean n;
    private Timer o;
    private long r;

    private HwDevicePeriodRriFileManager(Context context) {
        super(context);
        this.n = false;
        this.h = 0L;
        this.f17502a = -1L;
        this.m = new Object();
        this.o = null;
        this.l = null;
        this.d = false;
        this.f17503c = 0L;
        this.j = new ITransferSleepAndDFXFileCallback.Stub() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwsyncmgr.periodrri.HwDevicePeriodRriFileManager.2
            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onSuccess(int i, final String str, String str2) throws RemoteException {
                ReleaseLogUtil.d("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "mPeriodFileCallback() onSuccess");
                mit.b("HwDevicePeriodRriFileManager", new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwsyncmgr.periodrri.HwDevicePeriodRriFileManager.2.4
                    @Override // java.lang.Runnable
                    public void run() throws Throwable {
                        HwDevicePeriodRriFileManager.this.e(str);
                    }
                });
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onFailure(int i, String str) throws RemoteException {
                ReleaseLogUtil.d("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "stress sync fail : ", Integer.valueOf(i));
                HwDevicePeriodRriFileManager.this.c();
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onProgress(int i, String str) throws RemoteException {
                LogUtil.d("HwDevicePeriodRriFileManager", "onProgress progress:", Integer.valueOf(i));
            }
        };
        this.i = new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwsyncmgr.periodrri.HwDevicePeriodRriFileManager.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                boolean z;
                ReleaseLogUtil.d("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "SaveData result errorCode: ", Integer.valueOf(i));
                if (obj == null) {
                    z = false;
                } else if (i == 0 || (i == 4 && obj.toString().equals("true"))) {
                    z = true;
                } else {
                    LogUtil.j("HwDevicePeriodRriFileManager", "SaveData enter else");
                    z = false;
                }
                HwDevicePeriodRriFileManager.this.d(z, z ? "Save successful." : "Save fail.");
                LogUtil.a("HwDevicePeriodRriFileManager", "save data end.");
            }
        };
        d();
    }

    public static HwDevicePeriodRriFileManager getInstance() {
        HwDevicePeriodRriFileManager hwDevicePeriodRriFileManager;
        synchronized (f17501b) {
            if (e == null) {
                e = new HwDevicePeriodRriFileManager(BaseApplication.getContext());
            }
            hwDevicePeriodRriFileManager = e;
        }
        return hwDevicePeriodRriFileManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void e(String str) throws Throwable {
        File file;
        File file2;
        File file3;
        File file4;
        FileInputStream fileInputStreamOpenInputStream = null;
        try {
            try {
                if (TextUtils.isEmpty(str) || !str.contains("rrisqi_data")) {
                    LogUtil.j("HwDevicePeriodRriFileManager", "on this time no data startTime :", Long.valueOf(i()), "endTime :", Long.valueOf(this.r));
                    b("finalTransferDataContent is empty or error");
                    file4 = null;
                } else {
                    LogUtil.a("HwDevicePeriodRriFileManager", "rri sync success");
                    file = str.contains("/") ? new File(str) : new File(BaseApplication.getContext().getFilesDir(), str);
                    try {
                        String strC = CommonUtil.c(file.getCanonicalPath());
                        if (TextUtils.isEmpty(strC)) {
                            b("saveTransferDataContent realFilePath is empty");
                            xjt.an("HwDevicePeriodRriFileManager saveTransferDataContent: realFilePath is empty");
                            a((FileInputStream) null, file);
                            return;
                        }
                        file2 = FileUtils.getFile(strC);
                        try {
                            fileInputStreamOpenInputStream = FileUtils.openInputStream(file2);
                            PeriodRriEntity periodRriEntityD = myz.d(fileInputStreamOpenInputStream);
                            if (periodRriEntityD == null) {
                                b("saveTransferDataContent periodRriEntity is null");
                                xjt.an("HwDevicePeriodRriFileManager saveTransferDataContent: periodRriEntity is null");
                                a(fileInputStreamOpenInputStream, file2);
                                return;
                            } else {
                                b(periodRriEntityD);
                                ReleaseLogUtil.d("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "transFile type is Stress file size :", Long.valueOf(file2.length()));
                                c(periodRriEntityD);
                                file4 = file2;
                            }
                        } catch (FileNotFoundException unused) {
                            b("saveTransferDataContent FileNotFoundException");
                            xjt.an("HwDevicePeriodRriFileManager saveTransferDataContent: FileNotFoundException");
                            file3 = file2;
                            a((FileInputStream) null, file3);
                            return;
                        } catch (IOException unused2) {
                            b("saveTransferDataContent IOException");
                            xjt.an("HwDevicePeriodRriFileManager saveTransferDataContent: IOException");
                            file3 = file2;
                            a((FileInputStream) null, file3);
                            return;
                        }
                    } catch (FileNotFoundException unused3) {
                        file2 = file;
                    } catch (IOException unused4) {
                        file2 = file;
                    } catch (Throwable th) {
                        th = th;
                        a(fileInputStreamOpenInputStream, file);
                        throw th;
                    }
                }
                a(fileInputStreamOpenInputStream, file4);
            } catch (Throwable th2) {
                fileInputStreamOpenInputStream = null;
                th = th2;
                file = str;
            }
        } catch (FileNotFoundException unused5) {
            file2 = null;
        } catch (IOException unused6) {
            file2 = null;
        } catch (Throwable th3) {
            th = th3;
            file = 0;
        }
    }

    private void c(PeriodRriEntity periodRriEntity) {
        int iFetchVersion = periodRriEntity.fetchVersion();
        ReleaseLogUtil.d("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "parse file version is :", Integer.valueOf(iFetchVersion));
        if (iFetchVersion >= 3) {
            if (iFetchVersion == 3) {
                a(periodRriEntity);
                return;
            } else {
                c();
                return;
            }
        }
        boolean zE = e(periodRriEntity);
        LogUtil.a("HwDevicePeriodRriFileManager", "isAllDataDirty :", Boolean.valueOf(zE));
        if (zE) {
            h();
        } else {
            a(myw.b().b(periodRriEntity));
        }
    }

    private void h() {
        long j = this.h + 1;
        this.r = j;
        LogUtil.a("HwDevicePeriodRriFileManager", "update mUploadLastTime :", Long.valueOf(j), "All data is dirty");
        b(this.r);
        c();
    }

    private void a(FileInputStream fileInputStream, File file) {
        try {
            if (fileInputStream == null) {
                LogUtil.j("HwDevicePeriodRriFileManager", "finally closeStream fileInputStream is null");
            } else {
                fileInputStream.close();
            }
            if (file != null) {
                LogUtil.a("HwDevicePeriodRriFileManager", "delete result:", Boolean.valueOf(file.delete()));
            }
            LogUtil.a("HwDevicePeriodRriFileManager", "finally close");
        } catch (IOException unused) {
            LogUtil.e("HwDevicePeriodRriFileManager", "closeStream IOException");
        }
    }

    public void getPeriodRriFileFromDevice() {
        ReleaseLogUtil.d("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "getPeriodRriFileFromDevice enter");
        DeviceInfo deviceInfoA = myk.a("HwDevicePeriodRriFileManager");
        if (deviceInfoA != null && mgb.d(deviceInfoA.getDeviceIdentify()) == 2) {
            ReleaseLogUtil.e("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "getPeriodRriFileFromDevice mode is FAMILY_PAIR_MODE");
            mzj.b().a("HwDevicePeriodRriFileManager");
            return;
        }
        if (deviceInfoA == null || deviceInfoA.getDeviceConnectState() != 2) {
            ReleaseLogUtil.e("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "getPeriodRriFileFromDevice DeviceInfo is null or not connect");
            mzj.b().a("HwDevicePeriodRriFileManager");
            return;
        }
        if (!ThermalCallback.getInstance().isTriggerTask()) {
            ReleaseLogUtil.e("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "getPeriodRriFileFromDevice does not have the conditions to trigger the task.");
            return;
        }
        if (!myk.e(myk.a("HwDevicePeriodRriFileManager"))) {
            ReleaseLogUtil.e("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "getPeriodRriFileFromDevice checkHiHealthType is false");
            mzj.b().a("HwDevicePeriodRriFileManager");
            return;
        }
        if (this.n) {
            ReleaseLogUtil.e("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "getPeriodRriFileFromDevice is running");
            return;
        }
        this.n = true;
        n();
        this.f17502a = -1L;
        DeviceCapability deviceCapabilityB = myk.b();
        if (deviceCapabilityB == null) {
            ReleaseLogUtil.e("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "capability is null");
            c();
        } else if (!deviceCapabilityB.isSupportPressAutoMonitor()) {
            ReleaseLogUtil.e("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "no support press data");
            c();
        } else {
            d(deviceInfoA);
        }
    }

    public boolean isPeriodRriSyncing() {
        return this.n;
    }

    private void d(final DeviceInfo deviceInfo) {
        mit.b("HwDevicePeriodRriFileManager", new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwsyncmgr.periodrri.HwDevicePeriodRriFileManager.3
            @Override // java.lang.Runnable
            public void run() {
                HwDevicePeriodRriFileManager.this.d = false;
                HwDevicePeriodRriFileManager.this.f17503c = 0L;
                if (!HwDevicePeriodRriFileManager.this.c(deviceInfo)) {
                    int[] iArrF = HwDevicePeriodRriFileManager.this.f();
                    int i = iArrF[0];
                    int i2 = iArrF[1];
                    if (i >= i2 && i - i2 <= 300) {
                        LogUtil.a("HwDevicePeriodRriFileManager", "future time :", Integer.valueOf(i));
                        i = i2 - 61;
                    } else if (i - i2 > 300) {
                        LogUtil.a("HwDevicePeriodRriFileManager", "future time :", Integer.valueOf(i));
                        i = i2 - 61;
                        HwDevicePeriodRriFileManager.this.b(i);
                    } else if (i < 0) {
                        i = 0;
                    } else {
                        LogUtil.a("HwDevicePeriodRriFileManager", "normal time no need change.");
                    }
                    if (HwDevicePeriodRriFileManager.this.j == null) {
                        HwDevicePeriodRriFileManager.this.b("mPeriodFileCallback is null");
                        return;
                    }
                    HwDevicePeriodRriFileManager.this.k = System.currentTimeMillis();
                    int[] iArr = {i, i2};
                    LogUtil.a("HwDevicePeriodRriFileManager", "syncPeriodRriFileFromDevice: timeArray = " + Arrays.toString(iArr));
                    if (i2 - i > 86400) {
                        HwDevicePeriodRriFileManager.this.d = true;
                        HwDevicePeriodRriFileManager.this.g = i;
                        int i3 = i2 - 86400;
                        iArr[0] = i3;
                        HwDevicePeriodRriFileManager.this.f = i3;
                    } else {
                        HwDevicePeriodRriFileManager.this.d = false;
                    }
                    LogUtil.a("HwDevicePeriodRriFileManager", "syncPeriodRriFileFromDevice: mIsNeedSecondSync = " + HwDevicePeriodRriFileManager.this.d);
                    HwDevicePeriodRriFileManager.this.a(iArr);
                    return;
                }
                ReleaseLogUtil.d("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "User need do pressure adjust first");
                HwDevicePeriodRriFileManager.this.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int[] iArr) {
        LogUtil.a("HwDevicePeriodRriFileManager", "startFileProcess: times = " + Arrays.toString(iArr));
        if (iArr == null || iArr.length != 2) {
            ReleaseLogUtil.e("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "startFileProcess: times error");
            c();
            return;
        }
        DeviceCapability deviceCapabilityB = myk.b();
        if (deviceCapabilityB == null) {
            ReleaseLogUtil.e("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "capability is null");
            c();
            return;
        }
        if (!deviceCapabilityB.isSupportPressAutoMonitor()) {
            ReleaseLogUtil.e("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "no support press data");
            c();
            return;
        }
        if (deviceCapabilityB.isSupportRriNewFile()) {
            ReleaseLogUtil.d("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "startFileProcess startRequestFile");
            mrj.e().a(e(iArr), this.j);
            return;
        }
        ReleaseLogUtil.d("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "startFileProcess getFile");
        TransferFileInfo transferFileInfo = new TransferFileInfo();
        transferFileInfo.setType(4);
        transferFileInfo.setPriority(2);
        transferFileInfo.setSuspend(0);
        transferFileInfo.setTaskType(0);
        transferFileInfo.setRecordId(new ArrayList(16));
        transferFileInfo.setStartTime(iArr[0]);
        transferFileInfo.setEndTime(iArr[1]);
        mnn.a().e(transferFileInfo, this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 206);
        boolean zE = ets.e();
        if (zD && !zE) {
            ReleaseLogUtil.d("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "checkPressureAdjust isSupportEmotionAutoMonitor");
            return false;
        }
        if (!j()) {
            ReleaseLogUtil.d("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "User do not pressure adjust");
            c();
            return true;
        }
        ReleaseLogUtil.d("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "User has pressure adjust");
        return false;
    }

    private mhp e(int[] iArr) {
        mhp mhpVar = new mhp();
        mhpVar.a("rrisqi_data.bin");
        mhpVar.c(16);
        mhpVar.e(false);
        mhpVar.c(iArr);
        mhpVar.d(null);
        return mhpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] f() {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int[] iArr = {(int) i(), iCurrentTimeMillis};
        this.r = iCurrentTimeMillis;
        ReleaseLogUtil.d("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "lastSyncTime :", Integer.valueOf(iArr[0]), ", now :", Integer.valueOf(iCurrentTimeMillis));
        return iArr;
    }

    private boolean e(PeriodRriEntity periodRriEntity) {
        boolean z = false;
        if (periodRriEntity == null) {
            LogUtil.j("HwDevicePeriodRriFileManager", "entity is null");
            return false;
        }
        List<PeriodRriEntity.RriDataEntity> listFetchRriDataList = periodRriEntity.fetchRriDataList();
        ArrayList arrayList = new ArrayList(16);
        if (listFetchRriDataList == null || listFetchRriDataList.isEmpty()) {
            LogUtil.j("HwDevicePeriodRriFileManager", "entity has no data");
        } else {
            boolean z2 = true;
            for (PeriodRriEntity.RriDataEntity rriDataEntity : listFetchRriDataList) {
                if (b(rriDataEntity)) {
                    LogUtil.d("HwDevicePeriodRriFileManager", "ready remove dirtyData :", rriDataEntity.toString());
                    long jFetchStartTime = rriDataEntity.fetchStartTime();
                    long jFetchStartTime2 = this.h;
                    if (jFetchStartTime > jFetchStartTime2) {
                        jFetchStartTime2 = rriDataEntity.fetchStartTime();
                    }
                    this.h = jFetchStartTime2;
                } else {
                    arrayList.add(rriDataEntity);
                    z2 = false;
                }
            }
            z = z2;
        }
        periodRriEntity.configRriDataList(arrayList);
        return z;
    }

    private boolean b(PeriodRriEntity.RriDataEntity rriDataEntity) {
        if (rriDataEntity == null) {
            LogUtil.j("HwDevicePeriodRriFileManager", "dataEntity is null");
            return false;
        }
        List<Integer> listFetchRriList = rriDataEntity.fetchRriList();
        if (listFetchRriList == null || listFetchRriList.isEmpty()) {
            LogUtil.j("HwDevicePeriodRriFileManager", "This data has no dirty data");
            return false;
        }
        Iterator<Integer> it = listFetchRriList.iterator();
        while (it.hasNext()) {
            if (it.next().intValue() > 2000) {
                LogUtil.d("HwDevicePeriodRriFileManager", "This is dirty data :", rriDataEntity.toString());
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("HwDevicePeriodRriFileManager", "finishSync: mIsNeedSecondSync = " + this.d);
        if (this.d) {
            this.d = false;
            a(new int[]{this.g, this.f});
            return;
        }
        this.n = false;
        a();
        BroadcastManagerUtil.e(BaseApplication.getContext(), new Intent("com.huawei.health.action.PERIOD_RRI_SYNC_FINISH"));
        LogUtil.a("HwDevicePeriodRriFileManager", "finishSync sendBroadcastPackage end");
        mzj.b().a("HwDevicePeriodRriFileManager");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (str == null) {
            str = "null exception";
        }
        ReleaseLogUtil.d("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", str);
        c();
    }

    private void b(PeriodRriEntity periodRriEntity) {
        List<PeriodRriEntity.RriDataEntity> listFetchRriDataList = periodRriEntity.fetchRriDataList();
        if (listFetchRriDataList != null && !listFetchRriDataList.isEmpty()) {
            PeriodRriEntity.RriDataEntity rriDataEntity = listFetchRriDataList.get(listFetchRriDataList.size() - 1);
            long jFetchStartTime = rriDataEntity.fetchStartTime() + 1;
            this.r = jFetchStartTime;
            LogUtil.a("HwDevicePeriodRriFileManager", "max time :", Long.valueOf(jFetchStartTime), "time is :", Long.valueOf(rriDataEntity.fetchStartTime()));
            return;
        }
        LogUtil.j("HwDevicePeriodRriFileManager", "no rri data. update time by press time");
        List<HiStressMetaData> listFetchPressDataList = periodRriEntity.fetchPressDataList();
        if (listFetchPressDataList != null && !listFetchPressDataList.isEmpty()) {
            int size = listFetchPressDataList.size() - 1;
            long jFetchStressEndTime = listFetchPressDataList.get(size).fetchStressEndTime() + 1;
            this.r = jFetchStressEndTime;
            LogUtil.a("HwDevicePeriodRriFileManager", "max time :", Long.valueOf(jFetchStressEndTime), "time is :", Long.valueOf(listFetchPressDataList.get(size).fetchStressEndTime()));
            return;
        }
        LogUtil.j("HwDevicePeriodRriFileManager", "Data is wrong, upload time by app system time");
    }

    private long i() {
        Cursor cursorQueryStorageData = queryStorageData("HWDevicePeriodRRIFileManager", 1, "Device_ID='" + KeyValDbManager.d(BaseApplication.getContext()).c("user_id") + myk.d() + "' OR Device_ID='" + myk.d() + "'");
        long jE = 0;
        if (cursorQueryStorageData == null) {
            LogUtil.j("HwDevicePeriodRriFileManager", "get lastTimeStamp query error");
            return 0L;
        }
        if (cursorQueryStorageData.moveToNext()) {
            LogUtil.a("HwDevicePeriodRriFileManager", "getLastTimestamp moveToNext() is not null");
            jE = e(cursorQueryStorageData);
        }
        cursorQueryStorageData.close();
        LogUtil.a("HwDevicePeriodRriFileManager", "getLastTimestamp :", Long.valueOf(jE));
        return jE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        LogUtil.a("HwDevicePeriodRriFileManager", "setLastTimestamp: mIsNeedSecondSync = " + this.d);
        if (this.d) {
            this.f17503c = j;
            return;
        }
        long jMax = Math.max(this.f17503c, j);
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        Cursor cursorQueryStorageData = queryStorageData("HWDevicePeriodRRIFileManager", 1, "Device_ID='" + strC + myk.d() + "'");
        if (cursorQueryStorageData != null) {
            if (cursorQueryStorageData.moveToNext()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("Time_Stamp", Long.valueOf(jMax));
                updateStorageData("HWDevicePeriodRRIFileManager", 1, contentValues, "Device_ID='" + strC + myk.d() + "'");
                LogUtil.a("HwDevicePeriodRriFileManager", "setLastTimestamp update: ", Long.valueOf(jMax));
            } else {
                insertStorageData("HWDevicePeriodRRIFileManager", 1, d(jMax, strC + myk.d()));
                LogUtil.a("HwDevicePeriodRriFileManager", "setLastTimestamp new: ", Long.valueOf(jMax));
            }
            cursorQueryStorageData.close();
        }
        deleteStorageData("HWDevicePeriodRRIFileManager", 1, "Device_ID='" + myk.d() + "'");
    }

    private long e(Cursor cursor) {
        return cursor.getLong(cursor.getColumnIndex("Time_Stamp"));
    }

    private ContentValues d(long j, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("Device_ID", str);
        contentValues.put("Time_Stamp", Long.valueOf(j));
        return contentValues;
    }

    private void d() {
        if (createStorageDataTable("HWDevicePeriodRRIFileManager", 1, g()) != 0) {
            LogUtil.j("HwDevicePeriodRriFileManager", "database is bad.");
            if (!deleteDatabase()) {
                LogUtil.j("HwDevicePeriodRriFileManager", "data base error.");
            } else {
                createStorageDataTable("HWDevicePeriodRRIFileManager", 1, g());
            }
        }
    }

    private String g() {
        return "_id integer primary key autoincrement,Device_ID NVARCHAR(300) not null,Time_Stamp integer not null";
    }

    private boolean j() {
        final boolean[] zArr = new boolean[1];
        final Semaphore semaphore = new Semaphore(0);
        ((HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class)).getUserPressureAdjustDatas(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwsyncmgr.periodrri.HwDevicePeriodRriFileManager.5
            /* JADX WARN: Code duplicated, block: B:16:0x0067  */
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                boolean z;
                LogUtil.a("HwDevicePeriodRriFileManager", "isAlreadyDoPressureAdjust errorCode :", Integer.valueOf(i));
                if (i == 0 && (obj instanceof String)) {
                    HiStressMetaData hiStressMetaDataA = mbs.a((String) obj);
                    if (hiStressMetaDataA == null) {
                        LogUtil.j("HwDevicePeriodRriFileManager", "metaData is null");
                        semaphore.release();
                        return;
                    }
                    LogUtil.a("HwDevicePeriodRriFileManager", "isAlreadyDoPressureAdjust startTime :", new Date(hiStressMetaDataA.fetchStressStartTime()));
                    int iFetchStressCalibFlag = hiStressMetaDataA.fetchStressCalibFlag();
                    LogUtil.a("HwDevicePeriodRriFileManager", "calibrationMark :", Integer.valueOf(iFetchStressCalibFlag));
                    int iFetchStressScore = hiStressMetaDataA.fetchStressScore();
                    z = true;
                    if (iFetchStressCalibFlag != 1 || iFetchStressScore <= 0 || iFetchStressScore >= 100) {
                        z = false;
                    } else {
                        LogUtil.a("HwDevicePeriodRriFileManager", "isAlreadyDoPressureAdjust isAlreadyDoPressureAdjust");
                    }
                } else {
                    z = false;
                }
                zArr[0] = z;
                semaphore.release();
            }
        });
        try {
            if (semaphore.tryAcquire(5L, TimeUnit.SECONDS)) {
                LogUtil.a("HwDevicePeriodRriFileManager", "semaphore tryAcquire()");
            } else {
                LogUtil.j("HwDevicePeriodRriFileManager", "semaphore tryAcquire() fail");
            }
        } catch (InterruptedException unused) {
            LogUtil.e("HwDevicePeriodRriFileManager", "InterruptedException");
        }
        return zArr[0];
    }

    private static DeviceInfo e() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwDevicePeriodRriFileManager");
        if (deviceList == null || deviceList.isEmpty()) {
            return null;
        }
        return deviceList.get(0);
    }

    public static boolean isSupportStressTenMinuteValues() {
        if (e() == null) {
            LogUtil.j("HwDevicePeriodRriFileManager", "isSupportStressValues deviceInfo is null");
            return false;
        }
        return eey.d(e(), 251);
    }

    private void a(PeriodRriEntity periodRriEntity) {
        this.f17502a = periodRriEntity.fetchFailTime();
        List<HiStressMetaData> listFetchPressDataList = periodRriEntity.fetchPressDataList();
        ArrayList arrayList = new ArrayList(16);
        LogUtil.a("HwDevicePeriodRriFileManager", "isSupportStressTenMinuteValues=", Boolean.valueOf(isSupportStressTenMinuteValues()));
        if (listFetchPressDataList != null && listFetchPressDataList.size() > 0) {
            for (HiStressMetaData hiStressMetaData : listFetchPressDataList) {
                hiStressMetaData.configStressStartTime(hiStressMetaData.fetchStressStartTime() * 1000);
                hiStressMetaData.configStressEndTime(hiStressMetaData.fetchStressEndTime() * 1000);
                hiStressMetaData.configStressDevNo(myk.e());
                hiStressMetaData.configStressFeatureAtts(b());
                if (isSupportStressTenMinuteValues()) {
                    hiStressMetaData.configStressTimeType(1);
                } else {
                    hiStressMetaData.configStressTimeType(0);
                }
                arrayList.add(hiStressMetaData);
            }
        } else {
            ReleaseLogUtil.e("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "periodRriEntity.fetchPressDataList() is null");
            xjt.an("HwDevicePeriodRriFileManager startNewCycleMeasure: dataBeanList is null or empty");
        }
        if (arrayList.size() > 0) {
            a(arrayList);
        } else {
            d(false, "No periodRri data.");
        }
    }

    private void a(List<HiStressMetaData> list) {
        boolean zD = myz.d(list);
        LogUtil.a("HwDevicePeriodRriFileManager", "saveData isAdjustStressData: ", Boolean.valueOf(zD));
        if (!zD) {
            d(false, "isAdjustStressDate is false");
            return;
        }
        DeviceInfo deviceInfoA = myk.a("HwDevicePeriodRriFileManager");
        if (deviceInfoA == null) {
            d(false, "currentDeviceInfo is null");
            return;
        }
        mga.h(deviceInfoA);
        String strD = myk.d();
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi != null) {
            healthDataMgrApi.setStressData(strD, list, this.i);
        } else {
            LogUtil.j("HwDevicePeriodRriFileManager", "saveData healthDataMgrApi is null");
            d(false, "saveData healthDataMgrApi is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z, String str) {
        ReleaseLogUtil.d("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "onResponse isSuccess :", Boolean.valueOf(z), ", message:", str);
        if (z) {
            LogUtil.a("HwDevicePeriodRriFileManager", "push data to UI success,update time success");
            long j = this.f17502a;
            if (j != -1) {
                long j2 = j / 1000;
                this.r = j2;
                LogUtil.a("HwDevicePeriodRriFileManager", "save pressure fail.get failTime :", Long.valueOf(j2));
            }
            b(this.r);
            if (CommonUtil.ap()) {
                xjt.d("RriFile sync duration: " + (System.currentTimeMillis() - this.k));
            }
        } else {
            LogUtil.j("HwDevicePeriodRriFileManager", "save fail, not update time");
        }
        c();
    }

    private List<String> b() {
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < 12; i++) {
            arrayList.add("0");
        }
        return arrayList;
    }

    private void n() {
        synchronized (this.m) {
            e eVar = this.l;
            if (eVar != null) {
                eVar.cancel();
            }
            this.l = new e();
            Timer timer = new Timer("HwDevicePeriodRriFileManager");
            this.o = timer;
            timer.schedule(this.l, 1200000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.j("HwDevicePeriodRriFileManager", "enter mSyncTimer");
        synchronized (this.m) {
            e eVar = this.l;
            if (eVar != null) {
                eVar.cancel();
                this.l = null;
                LogUtil.j("HwDevicePeriodRriFileManager", "sync timeout,task cancel");
            }
            Timer timer = this.o;
            if (timer != null) {
                timer.cancel();
                this.o = null;
                LogUtil.j("HwDevicePeriodRriFileManager", "sync timeout,mSyncTimer cancel");
            }
        }
    }

    class e extends TimerTask {
        e() {
            LogUtil.a("HwDevicePeriodRriFileManager", "SyncTimerTask start");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ReleaseLogUtil.d("BTSYNC_PeriodRri_HwDevicePeriodRriFileManager", "SyncTimerTask timeout");
            HwDevicePeriodRriFileManager.this.n = false;
            HwDevicePeriodRriFileManager.this.a();
            mzj.b().a("HwDevicePeriodRriFileManager");
        }
    }
}
