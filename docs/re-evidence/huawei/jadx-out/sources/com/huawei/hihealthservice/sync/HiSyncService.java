package com.huawei.hihealthservice.sync;

import android.app.IntentService;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.SparseArray;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.data.type.HiSyncType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.R;
import com.huawei.hihealthservice.store.stat.HiTrackStat;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBase;
import com.huawei.hihealthservice.sync.syncdata.dictionary.config.HiSyncSampleConfig;
import com.huawei.hihealthservice.sync.syncdata.dictionary.detail.HiSyncDictionaryDataDetail;
import com.huawei.hihealthservice.sync.syncdata.dictionary.statistics.HiSyncDictionaryDataStat;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.ThermalCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OperationKey;
import com.huawei.up.utils.NSPException;
import com.huawei.utils.FoundationCommonUtil;
import com.huawei.watchface.api.HwWatchFaceApi;
import defpackage.kuj;
import defpackage.kwi;
import defpackage.kws;
import defpackage.kwt;
import defpackage.kww;
import defpackage.kwy;
import defpackage.kwz;
import defpackage.kyj;
import defpackage.kym;
import defpackage.lfz;
import defpackage.lgp;
import defpackage.lgw;
import defpackage.lgy;
import defpackage.lha;
import defpackage.lhb;
import defpackage.lhc;
import defpackage.lhd;
import defpackage.lhe;
import defpackage.lhf;
import defpackage.lhg;
import defpackage.lhh;
import defpackage.lhl;
import defpackage.lho;
import defpackage.lhp;
import defpackage.lht;
import defpackage.lia;
import defpackage.lif;
import defpackage.lij;
import defpackage.liq;
import defpackage.lis;
import defpackage.liz;
import defpackage.ljl;
import defpackage.ljv;
import defpackage.lkb;
import defpackage.lkh;
import defpackage.lqo;
import defpackage.lsb;
import defpackage.npr;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class HiSyncService extends IntentService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f12587b = Arrays.asList("samsung", "vivo", "oppo", "iqoo", "realme", "meizu", "lenovo", "honor", "oneplus", "xiaomi", "huawei", "redmi", "poco", "motorola", "google", "sharp", "sony", "nokia");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12588a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f12589c;
    private int d;
    private int e;
    private long f;
    private boolean g;
    private long h;
    private HiSyncOption i;
    private final BroadcastReceiver j;
    private int l;
    private int m;
    private int n;

    static /* synthetic */ long d(HiSyncService hiSyncService, long j) {
        long j2 = hiSyncService.f + j;
        hiSyncService.f = j2;
        return j2;
    }

    public HiSyncService() {
        super("HiH_HiSyncService");
        this.i = null;
        this.n = 0;
        this.g = BaseApplication.isRunningForeground();
        this.f = 0L;
        this.h = 0L;
        this.j = new BroadcastReceiver() { // from class: com.huawei.hihealthservice.sync.HiSyncService.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                LogUtil.a("HiH_HiSyncService", "ForegroundStatus action: ", action);
                if (HiSyncService.this.n == 0) {
                    ReleaseLogUtil.e("HiH_HiSyncService", "sync is not running");
                    return;
                }
                if (HwWatchFaceApi.ACTION_FOREGROUND_STATUS.equals(action)) {
                    HiSyncService.this.g = intent.getBooleanExtra("isForeground", false);
                    ReleaseLogUtil.d("HiH_HiSyncService", "ForegroundStatus isForeground: ", Boolean.valueOf(HiSyncService.this.g));
                    ThermalCallback.getInstance().controlThreadLevel(Collections.singletonList(Integer.valueOf(HiSyncService.this.n)), !HiSyncService.this.g ? 1 : 0);
                    if (HiSyncService.this.g) {
                        HiSyncService.d(HiSyncService.this, SystemClock.elapsedRealtime() - HiSyncService.this.h);
                        PowerKitManager.a().a("HiH_HiSyncService", 512, "user-firstDataSync");
                        return;
                    }
                    PowerKitManager.a().a("HiH_HiSyncService", 512, "user-firstDataSync");
                    if (HiSyncService.this.f < 300000) {
                        PowerKitManager.a().d("HiH_HiSyncService", 512, 300000 - HiSyncService.this.f, "user-firstDataSync");
                        HiSyncService.this.h = SystemClock.elapsedRealtime();
                        return;
                    }
                    return;
                }
                ReleaseLogUtil.e("HiH_HiSyncService", "ForegroundStatus other action");
            }
        };
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        if (intent == null) {
            ReleaseLogUtil.e("HiH_HiSyncService", "onHandleIntent intent is null, sync stopped!!!");
            return;
        }
        if (!FoundationCommonUtil.isSystemInfoAuthorized(this.f12589c)) {
            ReleaseLogUtil.e("HiH_HiSyncService", "the isSystemInfoAuthorized is false, no need to SyncCloud");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (d(intent)) {
            if (!lgp.d(this.i, this.d, this.m)) {
                LogUtil.j("HiH_HiSyncService", "onHandleIntent wrong para, sync end ");
                return;
            }
            this.n = Process.myTid();
            if (!BaseApplication.isRunningForeground()) {
                ThermalCallback.getInstance().controlThreadLevel(Collections.singletonList(Integer.valueOf(this.n)), 1);
            }
            int syncDataType = this.i.getSyncDataType();
            this.i.setSyncModel(lgp.i());
            try {
                Utils.a(liq.c(this.i.getSyncAction()));
                ac();
                if (10018 == syncDataType) {
                    HiBroadcastUtil.d(this.f12589c, syncDataType, 0);
                }
                lgp.f().a(this.m);
                if (!Utils.o() && 20000 == this.i.getSyncDataType() && lgp.k()) {
                    kwt.b().f(this.m, kwi.b().b(HuaweiHealth.c()));
                }
                KeyValDbManager.d(this.f12589c).b("cloud_st_invalid_flag", "0", new StorageParams(1));
                aa();
                a(true);
                if (this.i.getSyncDataType() == 20000) {
                    lgp.f().o();
                }
            } catch (lif e) {
                a(syncDataType, e);
            } catch (Exception e2) {
                a(syncDataType, e2);
            }
            if (b(this.f12589c)) {
                lgp.a(this.f12589c, this.m, 300000);
            }
            ReleaseLogUtil.d("HiH_HiSyncService", "###onHandleIntent end! totalTime=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            if (syncDataType == 20000) {
                try {
                    n();
                    new HiTrackStat(this.f12589c).d(this.m);
                    if (lkh.e()) {
                        l().pushData();
                    }
                    ab();
                    x();
                    new HiTrackStat(this.f12589c).b(this.m);
                } catch (Exception e3) {
                    ReleaseLogUtil.d("HiH_HiSyncService", "delDuplicatedStat=", e3.getMessage());
                }
                if (CommonUtil.ap()) {
                    r();
                }
            }
        }
    }

    private void x() {
        if (CommonUtil.ap()) {
            String str = this.m + "_handleExpSportTrack";
            if (SharedPreferenceManager.b("HiHealthService", str, false)) {
                return;
            }
            try {
                LogUtil.a("HiH_HiSyncService", "start to handleExpSportTrack");
                LogUtil.a("HiH_HiSyncService", "end to handleExpSportTrack i=", Integer.valueOf(kws.e(BaseApplication.getContext()).a()));
            } catch (Exception e) {
                LogUtil.e("HiH_HiSyncService", "Failed to handleExpSportTrack :", ExceptionUtils.c(e));
            } finally {
                SharedPreferenceManager.a("HiHealthService", str, true);
            }
        }
    }

    private void ab() {
        String str = this.m + "_reviseAllPhoneDeviceInfo";
        if (SharedPreferenceManager.b("HiHealthService", str, false)) {
            return;
        }
        try {
            ReleaseLogUtil.d("HiH_HiSyncService", "Start to reviseAllPhoneDeviceInfo");
            HiDeviceInfo hiDeviceInfoB = kwy.b(this).b("-1");
            if (hiDeviceInfoB != null) {
                hiDeviceInfoB.setManufacturer(Build.MANUFACTURER);
                kwy.b(this).e(hiDeviceInfoB, true);
                a(this.m, this.d, hiDeviceInfoB.getDeviceId(), 0);
            }
            List<HiDeviceInfo> listE = kwy.b(this).e(32);
            if (CollectionUtils.a(listE)) {
                return;
            }
            for (HiDeviceInfo hiDeviceInfo : listE) {
                String manufacturer = hiDeviceInfo.getManufacturer();
                String deviceName = hiDeviceInfo.getDeviceName();
                List<String> list = f12587b;
                if (!list.contains(StringUtils.toLowerCase(manufacturer)) && list.contains(StringUtils.toLowerCase(deviceName))) {
                    hiDeviceInfo.setManufacturer(deviceName);
                    hiDeviceInfo.setDeviceName(manufacturer);
                    kwy.b(this).e(hiDeviceInfo, true);
                    a(this.m, this.d, hiDeviceInfo.getDeviceId(), 0);
                }
            }
            ReleaseLogUtil.d("HiH_HiSyncService", "End to reviseAllPhoneDeviceInfo");
        } catch (Exception e) {
            ReleaseLogUtil.a("HiH_HiSyncService", "Failed to reviseAllPhoneDeviceInfo cause: ", ExceptionUtils.c(e));
        } finally {
            SharedPreferenceManager.a("HiHealthService", str, true);
        }
    }

    private void a(int i, int i2, int i3, int i4) {
        kym kymVarB = kwt.b().b(i, i2, i3);
        if (kymVarB == null) {
            return;
        }
        kymVarB.h(i4);
        kwt.b().a(kymVarB);
    }

    private void n() {
        if (lkb.b(this.f12589c, "delDuplicatedStat", this.m, true) && liq.f(this.f12589c, this.m)) {
            List<kuj> listB = kww.c(this.f12589c).b();
            if (!HiCommonUtil.b(listB)) {
                for (kuj kujVar : listB) {
                    ReleaseLogUtil.d("HiH_HiSyncService", "DataStatManager duplicatedDayStat=", kujVar);
                    kww.c(this.f12589c).e(kujVar);
                }
            }
            List<kuj> listB2 = kwz.d().b();
            if (!HiCommonUtil.b(listB2)) {
                for (kuj kujVar2 : listB2) {
                    ReleaseLogUtil.d("HiH_HiSyncService", "DataStatSensitive duplicatedDayStat=", kujVar2);
                    kwz.d().e(kujVar2);
                }
            }
            lkb.c(this.f12589c, "delDuplicatedStat", false, this.m);
        }
    }

    private void r() {
        List<Integer> listC = kyj.c().c(this.m);
        if (HiCommonUtil.b(listC)) {
            ReleaseLogUtil.d("HiH_HiSyncService", "delDuplicatedTrack clientIds null");
            return;
        }
        kws kwsVarE = kws.e(this.f12589c);
        if (lkb.b(this.f12589c, "duplicated_tracks", this.m, true) && liq.f(this.f12589c, this.m)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis;
            long j2 = jCurrentTimeMillis - 1728000000;
            int i = 0;
            while (i < 18) {
                ReleaseLogUtil.d("HiH_HiSyncService", "startTime,", Long.valueOf(j2), " endTime,", Long.valueOf(j));
                int i2 = i;
                List<HiHealthData> listC2 = kwsVarE.c(listC, j2, j, 30001);
                if (HiCommonUtil.b(listC2) || listC2.size() == 1) {
                    ReleaseLogUtil.d("HiH_HiSyncService", "sequenceHealthDatas null");
                } else {
                    ReleaseLogUtil.d("HiH_HiSyncService", "sequenceHealthDatas size", Integer.valueOf(listC2.size()));
                    a(listC2);
                }
                i = i2 + 1;
                j = j2;
                j2 -= 1728000000;
            }
            lkb.c(this.f12589c, "duplicated_tracks", false, this.m);
            Iterator<Integer> it = listC.iterator();
            while (it.hasNext()) {
                kwt.b().k(it.next().intValue());
            }
        }
    }

    private void a(List<HiHealthData> list) {
        int size = list.size();
        lfz lfzVarD = lfz.d(this.f12589c);
        int i = 0;
        while (i < size - 1) {
            int i2 = i + 1;
            if (list.get(i).getStartTime() == list.get(i2).getStartTime()) {
                HiHealthData hiHealthData = list.get(i);
                HiHealthData hiHealthData2 = list.get(i2);
                ReleaseLogUtil.d("HiH_HiSyncService", "first=", Long.valueOf(hiHealthData.getStartTime()));
                hiHealthData.setUserId(this.m);
                if (hiHealthData.getMergedStatus() == hiHealthData2.getMergedStatus()) {
                    ReleaseLogUtil.d("HiH_HiSyncService", "getMergedStatus equal");
                    d(hiHealthData, 0, 0);
                    d(hiHealthData2, 1, 2);
                    lfzVarD.prepareRealTimeHealthDataStat(Collections.singletonList(hiHealthData));
                } else {
                    if (hiHealthData.getMergedStatus() == 0) {
                        d(hiHealthData, 0, 0);
                        d(hiHealthData2, 1, 2);
                    } else {
                        d(hiHealthData2, 0, 0);
                        d(hiHealthData, 1, 2);
                    }
                    lfzVarD.prepareRealTimeHealthDataStat(Collections.singletonList(hiHealthData));
                }
            }
            i = i2;
        }
        lfzVarD.doRealTimeHealthDataStat();
    }

    private void d(HiHealthData hiHealthData, int i, int i2) {
        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
        hiTrackMetaData.setDuplicated(i);
        hiHealthData.setMetaData(HiJsonUtil.d(hiTrackMetaData));
        kws.e(this.f12589c).b(hiHealthData, i2, i2);
    }

    private boolean d(Intent intent) {
        if (this.f12589c == null) {
            this.f12589c = getApplicationContext();
        }
        try {
            this.i = (HiSyncOption) intent.getParcelableExtra("sync_option");
            this.d = intent.getIntExtra("sync_appId", 0);
            this.m = intent.getIntExtra("sync_main_UserID", 0);
            this.l = intent.getIntExtra("sync_starttime", 0);
            this.e = intent.getIntExtra("sync_endtime", 0);
            this.f12588a = intent.getIntExtra("sync_datatype", 0);
            ReleaseLogUtil.d("HiH_HiSyncService", "onHandleIntent start ", this.i);
            return true;
        } catch (Exception e) {
            ReleaseLogUtil.e("HiH_HiSyncService", "Exception：", e.getClass().getSimpleName());
            return false;
        }
    }

    private void a(boolean z) {
        String strValueOf;
        if (this.i.getSyncDataType() == 0) {
            strValueOf = HiJsonUtil.d(this.i.getSyncDataTypes());
        } else {
            strValueOf = String.valueOf(this.i.getSyncDataType());
        }
        HiBroadcastUtil.e(this.f12589c, strValueOf, this.i.getSyncId(), z);
    }

    private void aa() {
        if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false)) {
            if (CompileParameterUtil.c("SUPPORT_WIFI_PUSHTYPE_NINE", false)) {
                if ((20000 == this.i.getSyncDataType() || HiSyncType.HiSyncDataType.f12263a == this.i.getSyncDataType()) && 2 == this.i.getSyncAction() && 2 == this.i.getPushAction()) {
                    HiBroadcastUtil.d(this.f12589c);
                    return;
                }
                return;
            }
            if (20000 == this.i.getSyncDataType() && 2 == this.i.getSyncAction()) {
                HiBroadcastUtil.d(this.f12589c);
            }
        }
    }

    private void a(int i, Exception exc) {
        ReleaseLogUtil.a("HiH_HiSyncService", "onHandleIntent sync failed, e is ", exc.getMessage());
        if (exc.getMessage() != null && (exc.getMessage().contains("database or disk is full") || exc.getMessage().contains("disk image is malformed"))) {
            SharedPreferenceManager.c("HuaweiHealth", "handleException", exc.getMessage() + " " + System.currentTimeMillis());
        }
        a(exc);
        lkb.f(this.f12589c, lkb.g(this.f12589c) + 1);
        lis.c(this.i.getSyncAction());
        lis.d(this.f12589c, i);
        a(false);
        try {
            lsb.d().e(20210701);
        } catch (Exception unused) {
            ReleaseLogUtil.a("HiH_HiSyncService", "sync cancel notify throw exception");
        }
        if (i == 10018 || this.i.getPushAction() == 2) {
            HiBroadcastUtil.d(this.f12589c, i, -1);
        }
    }

    private void ac() throws lif {
        int syncDataType = this.i.getSyncDataType();
        if (!liq.f(this.f12589c, this.m) && syncDataType != 20000) {
            ReleaseLogUtil.a("HiH_HiSyncService", "nonFirstSync syncDtTp=", Integer.valueOf(syncDataType), " tps=", HiJsonUtil.d(this.i.getSyncDataTypes()));
            return;
        }
        if (CommonUtil.ap()) {
            ad();
        }
        ReleaseLogUtil.d("HiH_HiSyncService", "startSync syncDtTp=", Integer.valueOf(syncDataType), " tps=", HiJsonUtil.d(this.i.getSyncDataTypes()));
        lhp.b(this.f12589c).a();
        a(new lgw(this.f12589c, this.m));
        if (syncDataType != 20000) {
            lij.b(this.f12589c, this.m);
            lij.d(this.f12589c, this.m);
            lij.a(this.f12589c, this.m);
            lij.c(this.f12589c, this.m);
            lhp.b(this.f12589c).c();
        }
        if (syncDataType != 0) {
            e(syncDataType);
        } else if (!HiCommonUtil.b(this.i.getSyncDataTypes())) {
            Iterator<Integer> it = this.i.getSyncDataTypes().iterator();
            while (it.hasNext()) {
                e(it.next().intValue());
            }
        }
        if (lgp.e(this.m)) {
            if (liq.d(this.f12589c, this.m, 1, 0L)) {
                ReleaseLogUtil.d("HiH_HiSyncService", "no data sync, do not download last seven datas");
            } else if (h().a()) {
                lgp.e(this.m, false);
            }
        }
    }

    private void ad() {
        int iC;
        int iD = HiDateUtil.d(System.currentTimeMillis());
        int iC2 = lkb.c(this.f12589c, "sync_time", this.m, 0);
        if (iC2 != 0 && iD != iC2 && (iC = lkb.c(this.f12589c, "sync_count", this.m, 0)) != 0) {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(2);
            linkedHashMap.put("sync_time", String.valueOf(iC2));
            linkedHashMap.put("sync_count", String.valueOf(iC));
            ljv.d(this.f12589c).c(OperationKey.HEALTH_APP_SYNC_COUNT_2129024.value(), linkedHashMap, false);
            lkb.b(this.f12589c, "sync_time", 0, this.m);
            lkb.b(this.f12589c, "sync_count", 0, this.m);
        }
        int iC3 = lkb.c(this.f12589c, "sync_count", this.m, 0);
        lkb.b(this.f12589c, "sync_time", iD, this.m);
        lkb.b(this.f12589c, "sync_count", iC3 + 1, this.m);
    }

    private void e(int i) throws lif {
        if (i == 1) {
            an();
            return;
        }
        if (i == 2) {
            aq();
            d(30001);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                d(DicDataTypeUtil.DataType.BLOODGLUCOSE_BLOODSUGAR.value());
                return;
            }
            if (i == 5) {
                d(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value());
                return;
            }
            if (i == 7 || i == 9) {
                a(a(i));
                return;
            }
            if (i != 15) {
                if (i == 10001) {
                    ae();
                    al();
                    return;
                }
                if (i == 10026) {
                    lkb.h(this.f12589c, lkb.i(this.f12589c) + 1);
                    ap();
                    return;
                }
                if (i == 20000) {
                    lis.c(this.f12589c, this.i.getSyncAction());
                    ai();
                    return;
                }
                if (i == 900000000) {
                    ak();
                    return;
                }
                if (i == 10003) {
                    ag();
                    return;
                } else if (i == 10004) {
                    aj();
                    HiBroadcastUtil.g(this.f12589c);
                    return;
                } else {
                    c(i);
                    return;
                }
            }
        }
        ae();
    }

    private void c(int i) throws lif {
        if (i == 11) {
            a(a(i));
            af();
            return;
        }
        if (i == 5000) {
            ah();
            return;
        }
        if (i == 10005) {
            as();
            return;
        }
        if (i != 10021 && i != 10023) {
            if (i == 10028) {
                q();
                return;
            }
            if (i == 10007) {
                lij.d(this.f12589c, this.m);
                am();
                return;
            }
            if (i == 10008) {
                an();
                aj();
                ag();
                aq();
                return;
            }
            if (i == 10018) {
                if (this.l == 0 || this.e == 0 || this.f12588a == 0) {
                    HiBroadcastUtil.d(this.f12589c, i, -2);
                    return;
                } else {
                    t();
                    return;
                }
            }
            if (i != 10019) {
                switch (i) {
                    case 10010:
                        af();
                        break;
                    case 10011:
                    case 10012:
                    case 10013:
                        break;
                    default:
                        b(i);
                        break;
                }
                return;
            }
        }
        s();
    }

    private void b(int i) throws lif {
        if (i == 22) {
            z();
            return;
        }
        if (i == 34001) {
            a(b(new HiSyncOption(this.i, i)));
        } else if (HiHealthDictManager.a(this.f12589c).a(i) != null) {
            d(i);
        } else {
            LogUtil.j("HiH_HiSyncService", "startSync syncDataType is not right, syncDataType is ", Integer.valueOf(i));
        }
    }

    private void t() throws lif {
        if (90001 == this.f12588a) {
            lhg lhgVarH = h();
            SparseArray<Integer> sparseArrayA = liq.a(HiDateUtil.k(HiDateUtil.a(this.l)), HiDateUtil.a(this.e), 9);
            if (sparseArrayA == null || sparseArrayA.size() <= 0) {
                LogUtil.j("HiH_HiSyncService", "downloadDetailDataByTime downloadDaysMap is null, stop pullDataByVersion!");
                return;
            }
            for (int size = sparseArrayA.size() - 1; size >= 0; size--) {
                int iKeyAt = sparseArrayA.keyAt(size);
                lhgVarH.a(iKeyAt, sparseArrayA.get(iKeyAt).intValue());
            }
        }
    }

    private void s() throws lif {
        LogUtil.a("HiH_HiSyncService", "downloadDetailData syncDataType = " + this.i.getSyncDataType());
        LogUtil.a("HiH_HiSyncService", "downloadDetailData downedType = " + this.i.getSyncType());
        int syncDataType = this.i.getSyncDataType();
        if (syncDataType == 10019) {
            h().d();
            return;
        }
        if (syncDataType == 10021) {
            h().b();
            return;
        }
        if (syncDataType != 10023) {
            switch (syncDataType) {
                case 10011:
                    o().d();
                    break;
                case 10012:
                    h().c();
                    break;
                case 10013:
                    h().e();
                    break;
            }
            return;
        }
        a().b();
    }

    private void ai() throws lif {
        if (!liq.f(this.f12589c, this.m)) {
            LogUtil.a("HiH_HiSyncService", "retry firstSync start");
            w();
            return;
        }
        if (this.i.getSyncDataArea() == 1 && !liq.j(this.f12589c, this.m)) {
            try {
                npr.a(2);
                npr.c(4);
                ReleaseLogUtil.d("HiH_HiSyncService", "sync all data start");
                e(false);
                u();
                liq.b(this.f12589c, this.m, true);
                lgp.a(false);
                e(true);
                lis.e(this.f12589c);
                ReleaseLogUtil.d("HiH_HiSyncService", "sync all data end");
                return;
            } finally {
                npr.d(2);
                npr.e(4);
            }
        }
        try {
            npr.a(16);
            npr.c(8);
            u();
            lis.e(this.f12589c);
        } finally {
            npr.d(16);
            npr.e(8);
        }
    }

    private void e(boolean z) {
        Notification.Builder builderC = lsb.d().c();
        builderC.setContentText(getResources().getString(R.string.IDS_hw_show_sync_cloud_history_data)).setAutoCancel(false).setOngoing(false).setSmallIcon(R.drawable.healthlogo_ic_notification);
        if (z) {
            builderC.setContentText(getResources().getString(R.string.IDS_bundle_downloaded_prompt));
        }
        lsb.d().c(20210701, builderC.build());
    }

    private void w() throws lif {
        SharedPreferenceManager.a("HiHealthService", "pullAllStatus", false);
        SharedPreferenceManager.a("HiHealthService", "pullSportStatStatus", false);
        liq.e(this.f12589c, this.m, false);
        try {
            d(this.f12589c, true);
            npr.a(2);
            npr.c(4);
            if (!this.g) {
                PowerKitManager.a().d("HiH_HiSyncService", 512, 300000L, "user-firstDataSync");
                this.h = SystemClock.elapsedRealtime();
            }
            p();
            liq.e(this.f12589c, this.m, true);
            liq.i(this.f12589c, 20000);
            lis.e(this.f12589c);
            ReleaseLogUtil.e("HiH_HiSyncService", "ALTITUDE start version");
            new lgy(this.f12589c, this.m).a();
            npr.d(2);
            npr.e(4);
            d(this.f12589c, false);
            if (Utils.o()) {
                return;
            }
            kwt.b().f(this.m, kwi.b().b(HuaweiHealth.c()));
        } catch (Throwable th) {
            ReleaseLogUtil.e("HiH_HiSyncService", "firstSync exception, not complete.");
            int i = this.m;
            liq.d(i, liq.e(i) + 1);
            npr.d(2);
            npr.e(4);
            d(this.f12589c, false);
            throw th;
        }
    }

    private void p() throws lif {
        ReleaseLogUtil.d("HiH_HiSyncService", "firstSync start");
        SharedPreferenceManager.a("HiHealthService", "is_handle_history_golf_data_stat" + this.m, true);
        lhp.b(this.f12589c).c();
        long jCurrentTimeMillis = System.currentTimeMillis();
        liq.e(true);
        lqo.b(this.f12589c).a();
        ap();
        lhf lhfVarO = o();
        lho lhoVarM = m();
        lhl lhlVarL = l();
        lha lhaVarC = c();
        HiSyncBase hiSyncBaseB = b();
        lhg lhgVarH = h();
        lhh lhhVarF = f();
        lhd lhdVarI = i();
        lhe lheVarA = a();
        HiSyncBase hiSyncBaseE = e();
        HiSyncDictionaryDataDetail hiSyncDictionaryDataDetailB = b(this.i);
        HiSyncSampleConfig hiSyncSampleConfigG = g();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        lhlVarL.pullDataByTime(liq.b(jCurrentTimeMillis2, 1), jCurrentTimeMillis2);
        lhfVarO.e(3.0d);
        liz.a().a(1, "firstSync sport", new kym(this.d));
        e(hiSyncDictionaryDataDetailB, lhgVarH, lhfVarO, lhdVarI, lheVarA);
        lhfVarO.e(1.0d);
        hiSyncSampleConfigG.pullDataByVersion();
        lhdVarI.pullDataByVersion();
        lhlVarL.pullDataByVersion();
        lhaVarC.pullDataByVersion();
        lhhVarF.pullDataByVersion();
        HiSyncBase hiSyncBaseJ = j();
        hiSyncBaseJ.pullDataByVersion();
        lhoVarM.pullDataByVersion();
        hiSyncBaseB.pullDataByVersion();
        lheVarA.d();
        lheVarA.pullDataByTime(liq.b(jCurrentTimeMillis2, 7), jCurrentTimeMillis2);
        lheVarA.pullDataByVersion();
        new lgy(this.f12589c, this.m).b();
        hiSyncDictionaryDataDetailB.pullDataByVersion();
        lhgVarH.i();
        lhgVarH.pullDataByTime(liq.b(jCurrentTimeMillis2, 7), jCurrentTimeMillis2);
        lhgVarH.pullDataByVersion();
        lhfVarO.c();
        lhfVarO.pullDataByTime(liq.b(jCurrentTimeMillis2, 7), jCurrentTimeMillis2);
        lhfVarO.pullDataByVersion();
        hiSyncBaseE.pullDataByVersion();
        HiBroadcastUtil.e(this.f12589c, 0);
        HiBroadcastUtil.a(this.f12589c);
        liz.a().a(200, "firstSync all", new kym(this.d));
        hiSyncSampleConfigG.pushData();
        lhoVarM.pushData();
        hiSyncBaseB.pushData();
        lhgVarH.pushData();
        lheVarA.pushData();
        hiSyncBaseE.pushData();
        hiSyncDictionaryDataDetailB.pushData();
        lhfVarO.pushData();
        lhlVarL.pushData();
        lhaVarC.pushData();
        lhhVarF.pushData();
        lhdVarI.pushData();
        hiSyncBaseJ.pushData();
        liq.e(false);
        ReleaseLogUtil.d("HiH_HiSyncService", "firstSync end ,totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        ljl.a(this.f12589c).c((System.currentTimeMillis() - jCurrentTimeMillis) / 1000, this.m);
    }

    private static void e(HiSyncDictionaryDataDetail hiSyncDictionaryDataDetail, lhg lhgVar, lhf lhfVar, lhd lhdVar, lhe lheVar) {
        try {
            hiSyncDictionaryDataDetail.downloadLatestSequenceData(1, 0, 30001);
            lhgVar.b(1, 0, 9);
            lhfVar.a(1, 0);
            hiSyncDictionaryDataDetail.downloadLatestPointData(0, 3, DicDataTypeUtil.DataType.WEIGHT_BODYFAT_BROAD.value());
            lhgVar.b(1, 0, 7);
            lhdVar.e(a.C, 90);
            hiSyncDictionaryDataDetail.downloadLatestPointData(1, 0, DicDataTypeUtil.DataType.EMOTION_SET.value());
            lhgVar.b(1, 0, 11);
            hiSyncDictionaryDataDetail.downloadLatestPointData(0, 1, DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value());
            lheVar.e(1, 0, 16);
            hiSyncDictionaryDataDetail.downloadLatestPointData(0, 1, DicDataTypeUtil.DataType.BLOODGLUCOSE_BLOODSUGAR.value());
            if (Utils.o()) {
                hiSyncDictionaryDataDetail.downloadLatestPointData(0, 1, DicDataTypeUtil.DataType.SKIN_TEMPERATURE_SET.value());
            } else {
                hiSyncDictionaryDataDetail.downloadLatestPointData(0, 1, DicDataTypeUtil.DataType.BODY_TEMPERATURE_SET.value());
            }
            hiSyncDictionaryDataDetail.downloadLatestPointData(0, 1, DicDataTypeUtil.DataType.HIGH_BODY_TEMPERATURE_ALARM_SET.value());
            hiSyncDictionaryDataDetail.downloadLatestPointData(0, 1, DicDataTypeUtil.DataType.LOW_BODY_TEMPERATURE_ALARM_SET.value());
            hiSyncDictionaryDataDetail.downloadLatestPointData(0, 1, DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE_ALARM_SET.value());
            hiSyncDictionaryDataDetail.downloadLatestPointData(0, 1, DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE_SET.value());
        } catch (lif e) {
            ReleaseLogUtil.a("HiH_HiSyncService", "downloadLatestData error:", e.getMessage());
        }
    }

    private void u() throws lif {
        ReleaseLogUtil.d("HiH_HiSyncService", "incrementalSync start");
        SharedPreferenceManager.a("HiHealthService", "pullAllStatus", true);
        lij.b(this.f12589c, this.m);
        lis.b(this.f12589c, 1.0d, 1.0d, 1.0d);
        lij.d(this.f12589c, this.m);
        lij.a(this.f12589c, this.m);
        lis.b(this.f12589c, 1.0d, 1.0d, 1.0d);
        lij.c(this.f12589c, this.m);
        lis.b(this.f12589c, 1.0d, 1.0d, 1.0d);
        lhp.b(this.f12589c).c();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ap();
        b(y());
        HiBroadcastUtil.e(this.f12589c, 0);
        HiBroadcastUtil.a(this.f12589c);
        liz.a().a(200, "incrementalSync", new kym(this.d));
        e(v());
        ReleaseLogUtil.d("HiH_HiSyncService", "incrementalSync end,totalTime=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    private void an() throws lif {
        a(o());
        HiBroadcastUtil.a(this.f12589c);
    }

    private void z() throws lif {
        d().pushData();
    }

    private void ag() throws lif {
        a(c());
    }

    private void d(int i) throws lif {
        HiSyncOption hiSyncOption = new HiSyncOption(this.i, i);
        HiSyncDictionaryDataStat hiSyncDictionaryDataStat = new HiSyncDictionaryDataStat(this.f12589c, hiSyncOption, this.m);
        b(hiSyncDictionaryDataStat);
        a(b(hiSyncOption));
        d(hiSyncDictionaryDataStat);
    }

    private void aj() throws lif {
        a(l());
    }

    private void aq() throws lif {
        a(m());
    }

    private void ae() throws lif {
        a(b());
    }

    private void al() throws lif {
        a(a());
    }

    private void am() throws lif {
        a(f());
    }

    private void af() throws lif {
        a(i());
    }

    private void ap() throws lif {
        lht lhtVar = new lht(this.f12589c, this.m);
        d(lhtVar);
        b(lhtVar);
    }

    private void ak() throws lif {
        a(g());
    }

    private void ah() throws lif {
        a(e());
    }

    private void q() throws lif {
        k().b();
    }

    private void as() throws lif {
        lht lhtVarK = k();
        HiUserInfo userInfo = this.i.getUserInfo();
        if (userInfo == null) {
            LogUtil.e("HiH_HiSyncService", "uploadUserBasic hiUserInfo error!");
        } else {
            lhtVarK.c(userInfo);
        }
    }

    private lhf o() {
        return new lhf(this.f12589c, new HiSyncOption(this.i, 1), this.m);
    }

    private lho m() {
        return new lho(this.f12589c, new HiSyncOption(this.i, 2), this.m);
    }

    private lhl l() {
        return new lhl(this.f12589c, new HiSyncOption(this.i, 10004), this.m);
    }

    private lhh f() {
        return new lhh(this.f12589c, new HiSyncOption(this.i, 10007), this.m);
    }

    private lhd i() {
        return new lhd(this.f12589c, new HiSyncOption(this.i, 10010), this.m);
    }

    private HiSyncBase b() throws lif {
        return new lhb(this.f12589c, new HiSyncOption(this.i, 10001), this.m);
    }

    private HiSyncBase e() throws lif {
        return new lia(this.f12589c, new HiSyncOption(this.i, 5000), this.m);
    }

    private HiSyncDictionaryDataDetail b(HiSyncOption hiSyncOption) throws lif {
        return new HiSyncDictionaryDataDetail(this.f12589c, new HiSyncOption(hiSyncOption, hiSyncOption.getSyncDataType()), this.m);
    }

    private HiSyncBase j() throws lif {
        HiSyncOption hiSyncOption = this.i;
        return new HiSyncDictionaryDataStat(this.f12589c, new HiSyncOption(hiSyncOption, hiSyncOption.getSyncDataType()), this.m);
    }

    private HiSyncBase d() throws lif {
        return new lhc(this.f12589c, this.m);
    }

    private lhg h() throws lif {
        return new lhg(this.f12589c, new HiSyncOption(this.i, 10001), this.m);
    }

    private lhg a(int i) throws lif {
        return new lhg(this.f12589c, new HiSyncOption(this.i, i), this.m);
    }

    private lhe a() {
        return new lhe(this.f12589c, new HiSyncOption(this.i, 10001), this.m);
    }

    private lha c() {
        return new lha(this.f12589c, new HiSyncOption(this.i, 10003), this.m);
    }

    private lht k() {
        return new lht(this.f12589c, this.m);
    }

    private HiSyncSampleConfig g() {
        return new HiSyncSampleConfig(this.f12589c, new HiSyncOption(this.i, 900000000), this.m);
    }

    private List<HiSyncBase> y() throws lif {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(g());
        arrayList.add(l());
        arrayList.add(o());
        arrayList.add(c());
        arrayList.add(f());
        arrayList.add(i());
        arrayList.add(j());
        arrayList.add(m());
        arrayList.add(b(this.i));
        arrayList.add(b());
        arrayList.add(a(20000));
        arrayList.add(a());
        arrayList.add(e());
        return arrayList;
    }

    private List<HiSyncBase> v() throws lif {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(o());
        arrayList.add(m());
        arrayList.add(b());
        arrayList.add(a(20000));
        arrayList.add(a());
        arrayList.add(e());
        arrayList.add(b(this.i));
        arrayList.add(g());
        arrayList.add(l());
        arrayList.add(c());
        arrayList.add(f());
        arrayList.add(i());
        arrayList.add(j());
        arrayList.add(d());
        return arrayList;
    }

    private void a(HiSyncBase hiSyncBase) throws lif {
        LogUtil.a("HiH_HiSyncService", "executeSync hiSyncBase is ", hiSyncBase);
        long jCurrentTimeMillis = System.currentTimeMillis();
        hiSyncBase.pullDataByVersion();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        LogUtil.a("HiH_HiSyncService", "executeSync downLoad end", hiSyncBase, " totalTime = ", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis));
        hiSyncBase.pushData();
        LogUtil.a("HiH_HiSyncService", "executeSync upLoad end", hiSyncBase, " totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
    }

    private void b(List<HiSyncBase> list) throws lif {
        Iterator<HiSyncBase> it = list.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    private void e(List<HiSyncBase> list) throws lif {
        Iterator<HiSyncBase> it = list.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
    }

    private void b(HiSyncBase hiSyncBase) throws lif {
        long jCurrentTimeMillis = System.currentTimeMillis();
        hiSyncBase.pullDataByVersion();
        LogUtil.a("HiH_HiSyncService", "pullDataByVersion end", hiSyncBase, " totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    private void d(HiSyncBase hiSyncBase) throws lif {
        long jCurrentTimeMillis = System.currentTimeMillis();
        hiSyncBase.pushData();
        LogUtil.a("HiH_HiSyncService", "pushData end", hiSyncBase, " totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    private boolean b(Context context) {
        int iA = liq.a();
        if (iA < 0) {
            iA = liq.d(context, this.m);
        }
        if (iA == 0) {
            return true;
        }
        return System.currentTimeMillis() - liq.e(this.f12589c, this.m) > 43200000;
    }

    private void a(Exception exc) {
        if (exc == null) {
            return;
        }
        String message = exc.getMessage();
        if (message == null) {
            LogUtil.a("HiH_HiSyncService", "checkNetErrorTimer exception.getMessage() is null");
        } else if (message.contains(NSPException.EXP_NET_ERROR_STR)) {
            LogUtil.a("HiH_HiSyncService", "checkNetErrorTimer EXP_NET_ERROR_STR");
            lgp.f().r();
        } else {
            lgp.f().o();
        }
    }

    private void d(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) FirstSyncForegroundService.class);
        try {
            if (z) {
                if (!this.g) {
                    ReleaseLogUtil.d("HiH_HiSyncService", "start FirstSync is background, can't startForegroundService");
                    return;
                } else {
                    startForegroundService(intent);
                    return;
                }
            }
            stopService(intent);
        } catch (Throwable th) {
            ReleaseLogUtil.d("HiH_HiSyncService", "executeSyncForeService appear exception:", th.getMessage());
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        LogUtil.a("HiH_HiSyncService", "enter onCreate.");
        BroadcastManager.d(this.j);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        BroadcastManager.n(this.j);
        if (this.n > 0) {
            ThermalCallback.getInstance().controlThreadLevel(Collections.singletonList(Integer.valueOf(this.n)), 0);
        }
        super.onDestroy();
        lgp.e(false);
        liq.e(false);
        lgp.a(false);
        LogUtil.a("HiH_HiSyncService", "onDestroy stop all tasks");
    }
}
