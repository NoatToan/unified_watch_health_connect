package defpackage;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hihealthservice.store.merge.HiDataSequenceMerge;
import com.huawei.hihealthservice.sync.dataswitch.MotionPathDataSwitch;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBase;
import com.huawei.hwcloudmodel.healthdatacloud.model.BaseMetaData;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetMotionPathByVersionReq;
import com.huawei.hwcloudmodel.model.unite.GetMotionPathByVersionRsp;
import com.huawei.hwcloudmodel.model.unite.MotionPathDetail;
import com.huawei.hwcloudmodel.model.unite.SyncKey;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OperationKey;
import health.compact.a.HiCommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lho implements HiSyncBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f40158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HiSyncOption f40159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private lqo f40160c;
    private int d;
    private lfz e;
    private MotionPathDataSwitch f;
    private Context g;
    private List<SyncKey> h;
    private long i;
    private int j;
    private kxk k;

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByTime(long j, long j2) throws lif {
    }

    public lho(Context context, HiSyncOption hiSyncOption, int i) {
        LogUtil.a("HiH_HiSyncTrack", "HiSyncTrack create");
        this.g = context.getApplicationContext();
        this.f40159b = hiSyncOption;
        this.j = i;
        this.d = hiSyncOption.getSyncModel();
        a();
    }

    private void a() {
        this.f40160c = lqo.b(this.g);
        this.f = new MotionPathDataSwitch(this.g);
        this.k = kxk.c();
        this.e = lfz.d(this.g);
    }

    private GetMotionPathByVersionRsp a(GetMotionPathByVersionReq getMotionPathByVersionReq) {
        return this.f40160c.e(getMotionPathByVersionReq);
    }

    private void b() throws lif {
        b(this.h.get(0));
    }

    protected void b(SyncKey syncKey) throws lif {
        LogUtil.d("HiH_HiSyncTrack", "downloadOneByVersion key = ", syncKey);
        if (syncKey == null || syncKey.getType().intValue() != 2) {
            LogUtil.j("HiH_HiSyncTrack", "downloadOneByVersion the key is not right");
            return;
        }
        Long deviceCode = syncKey.getDeviceCode();
        long jLongValue = deviceCode.longValue();
        Long version = syncKey.getVersion();
        long jLongValue2 = version.longValue();
        if (jLongValue2 <= 0) {
            ReleaseLogUtil.e("HiH_HiSyncTrack", "downloadOneByVersion the maxVersion is not right , maxVersion is ", version);
            return;
        }
        kul kulVarA = this.k.a(this.j, jLongValue, this.f40159b.getSyncDataType());
        GetMotionPathByVersionReq getMotionPathByVersionReq = new GetMotionPathByVersionReq();
        getMotionPathByVersionReq.setDataType(Integer.valueOf(this.f40159b.getSyncMethod()));
        getMotionPathByVersionReq.setDeviceCode(deviceCode);
        getMotionPathByVersionReq.setCondition("all");
        if (kulVarA == null) {
            getMotionPathByVersionReq.setVersion(0);
            d(getMotionPathByVersionReq, jLongValue2);
        } else if (kulVarA.h() < jLongValue2) {
            getMotionPathByVersionReq.setVersion(Long.valueOf(kulVarA.h()));
            d(getMotionPathByVersionReq, jLongValue2);
        } else {
            LogUtil.a("HiH_HiSyncTrack", "do not need pullDataByVersion data, DBversion is ", Long.valueOf(kulVarA.h()));
        }
    }

    private void d(GetMotionPathByVersionReq getMotionPathByVersionReq, long j) throws Throwable {
        ReleaseLogUtil.d("HiH_HiSyncTrack", "performDownloadByVersion req = ", getMotionPathByVersionReq, " maxVersion = ", Long.valueOf(j));
        long jLongValue = getMotionPathByVersionReq.getVersion().longValue();
        this.i = jLongValue;
        if (jLongValue <= 0) {
            this.i = 0L;
        }
        this.f40158a = this.i;
        int i = 0;
        while (true) {
            long jE = e(getMotionPathByVersionReq);
            ReleaseLogUtil.d("HiH_HiSyncTrack", "performDownloadByVersion downCurrentVersion = ", Long.valueOf(jE), " maxVersion = ", Long.valueOf(j));
            i++;
            if (jE <= 0) {
                return;
            }
            if (!this.k.d(this.j, this.f40159b.getSyncDataType(), jE, getMotionPathByVersionReq.getDeviceCode().longValue())) {
                ReleaseLogUtil.e("HiH_HiSyncTrack", "performDownloadByVersion saveVersionToDB failed ");
            }
            getMotionPathByVersionReq.setVersion(Long.valueOf(jE));
            if (i >= 20) {
                LogUtil.j("HiH_HiSyncTrack", "performDownloadByVersion pullDataByVersion too many times.");
            }
            lis.b(this.g, 1.0d, 1.0d, 1.0d);
            if (this.d != 3 && jE >= j) {
                return;
            }
        }
    }

    private long e(GetMotionPathByVersionReq getMotionPathByVersionReq) throws Throwable {
        long jLongValue;
        ReleaseLogUtil.d("HiH_HiSyncTrack", "performDownloadByVersion req = ", getMotionPathByVersionReq);
        GetMotionPathByVersionRsp getMotionPathByVersionRspA = a(getMotionPathByVersionReq);
        if (!lih.e(getMotionPathByVersionRspA, false)) {
            return -1L;
        }
        List<BaseMetaData> deleteInfos = getMotionPathByVersionRspA.getDeleteInfos();
        if (!HiCommonUtil.b(deleteInfos) && !liq.h()) {
            b(deleteInfos);
        }
        List<MotionPathDetail> detailInfos = getMotionPathByVersionRspA.getDetailInfos();
        if (detailInfos == null || detailInfos.isEmpty()) {
            LogUtil.j("HiH_HiSyncTrack", "downloadTrack cloudTracks is null or empty");
            return getMotionPathByVersionRspA.getCurrentVersion().longValue();
        }
        if (getMotionPathByVersionRspA.getCurrentVersion() == null) {
            jLongValue = Long.MIN_VALUE;
            long j = Long.MAX_VALUE;
            for (MotionPathDetail motionPathDetail : detailInfos) {
                if (motionPathDetail != null) {
                    long jLongValue2 = motionPathDetail.getVersion().longValue();
                    if (jLongValue2 >= jLongValue) {
                        jLongValue = jLongValue2;
                    }
                    if (jLongValue2 < j) {
                        j = jLongValue2;
                    }
                }
            }
            LogUtil.a("HiH_HiSyncTrack", "downloadTrack maxTempVersion is ", Long.valueOf(jLongValue), " minTempVersion is ", Long.valueOf(j));
        } else {
            jLongValue = getMotionPathByVersionRspA.getCurrentVersion().longValue();
        }
        long j2 = this.f40158a;
        if (jLongValue <= j2) {
            ReleaseLogUtil.e("HiH_HiSyncTrack", "downloadTrack downloadVersion is ", Long.valueOf(jLongValue), " smaller than currentVersion ", Long.valueOf(j2));
            return -1L;
        }
        this.f40158a = jLongValue;
        List<HiHealthData> listC = this.f.c(detailInfos, this.j, this.d);
        ReleaseLogUtil.d("HiH_HiSyncTrack", "saveData cloudTracks is ", Integer.valueOf(detailInfos.size()), ", saveTracks is ", Integer.valueOf(listC.size()));
        d(listC, true);
        return jLongValue;
    }

    private void b(List<BaseMetaData> list) throws Throwable {
        boolean zB;
        ArrayList arrayList = new ArrayList(10);
        kws kwsVarE = kws.e(this.g);
        for (BaseMetaData baseMetaData : list) {
            ReleaseLogUtil.e("HiH_HiSyncTrack", "deleteSequences ", baseMetaData.toString());
            List<Integer> listC = kwt.b().c(this.g, Long.valueOf(baseMetaData.getDeviceCode()), this.j);
            if (HiCommonUtil.b(listC)) {
                ReleaseLogUtil.e("HiH_HiSyncTrack", "deleteSequence clientId error");
            } else {
                boolean z = false;
                List<HiHealthData> listB = kwsVarE.b(baseMetaData.getStartTime(), baseMetaData.getEndTime(), new int[]{30001}[0], listC, lke.b(baseMetaData.getSubType()));
                if (listB == null || listB.isEmpty()) {
                    ReleaseLogUtil.e("HiH_HiSyncTrack", "deleteSequence not found");
                } else {
                    HiHealthData hiHealthData = listB.get(0);
                    try {
                        zB = !ljq.h(this.g, 30001) ? ljq.b(this.g, 30001) : false;
                        try {
                            try {
                                int iC = kwsVarE.c(hiHealthData);
                                if (iC <= 0) {
                                    ReleaseLogUtil.e("HiH_HiSyncTrack", "deleteSequences() fail");
                                } else {
                                    hiHealthData.setUserId(this.j);
                                    hiHealthData.setSyncStatus(2);
                                    arrayList.add(hiHealthData);
                                }
                                if (zB && iC > 0) {
                                    ljq.g(this.g, 30001);
                                }
                                if (zB) {
                                    ljq.c(this.g, 30001);
                                }
                            } catch (Exception e) {
                                e = e;
                                ReleaseLogUtil.a("HiH_HiSyncTrack", "deleteSequences Exception ", LogAnonymous.b(e));
                                if (zB) {
                                    ljq.c(this.g, 30001);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            z = zB;
                            if (z) {
                                ljq.c(this.g, 30001);
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        zB = false;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        c(arrayList, kwt.b().b(this.j));
        a(arrayList);
    }

    private void c(List<HiHealthData> list, List<Integer> list2) {
        HiDataSequenceMerge hiDataSequenceMerge = new HiDataSequenceMerge(this.g);
        if (HiCommonUtil.b(list)) {
            return;
        }
        for (HiHealthData hiHealthData : list) {
            hiDataSequenceMerge.merge(hiHealthData, hiHealthData.getClientId(), list2);
        }
    }

    private void a(List<HiHealthData> list) {
        if (HiCommonUtil.b(list)) {
            return;
        }
        lfz lfzVarD = lfz.d(this.g);
        lfzVarD.prepareRealTimeHealthDataStat(list);
        lfzVarD.doRealTimeHealthDataStat();
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0108 A[PHI: r9 r14
      0x0108: PHI (r9v0 int) = (r9v1 int), (r9v3 int) binds: [B:62:0x0106, B:38:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r14v2 int) = (r14v3 int), (r14v6 int) binds: [B:62:0x0106, B:38:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0115  */
    /* JADX WARN: Code duplicated, block: B:67:0x012c  */
    /* JADX WARN: Code duplicated, block: B:70:0x016b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0176  */
    /* JADX WARN: Code duplicated, block: B:75:0x0184  */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x00dc: MOVE (r11 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r16 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:48:0x00dc */
    private void d(List<HiHealthData> list, boolean z) throws Throwable {
        boolean zB;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (HiCommonUtil.b(list)) {
            return;
        }
        char c2 = 0;
        try {
            if (ljq.h(BaseApplication.b(), 0)) {
                zB = false;
            } else {
                try {
                    zB = ljq.b(BaseApplication.b(), 0);
                } catch (Exception e) {
                    e = e;
                    zB = false;
                    i = 0;
                    try {
                        i2 = 0;
                        ReleaseLogUtil.e("HiH_HiSyncTrack", "saveData Exception", LogAnonymous.b(e));
                        if (zB) {
                            ljq.c(BaseApplication.b(), i2);
                        }
                        if (i == list.size()) {
                            liz.a().a(4, "sync download", new kym(this.g.getPackageName()));
                        } else {
                            ReleaseLogUtil.d("HiH_HiSyncTrack", "saveData cloudTracks error ", Integer.valueOf(i));
                            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(5);
                            linkedHashMap.put(OpAnalyticsConstants.RESULT_DESCRIBE, "saveDataError");
                            ljv.d(this.g).c(OperationKey.HEALTH_APP_SYNC_CLOUD_FAILED_85070023.value(), linkedHashMap, false);
                        }
                        LogUtil.a("HiH_HiSyncTrack", "saveData end saveDetailTime =  ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                        if (z) {
                            this.e.prepareRealTimeHealthDataStat(list);
                            this.e.doRealTimeHealthDataStat();
                        } else {
                            this.e.prepareAsyncHealthDataStat(list);
                            this.e.doAsyncHealthDataStat();
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (zB) {
                            ljq.c(BaseApplication.b(), 0);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    zB = false;
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    throw th;
                }
            }
            try {
                try {
                    List<Integer> listC = kyj.c().c(this.j);
                    try {
                        if (listC != null && !listC.isEmpty()) {
                            i = 0;
                            for (HiHealthData hiHealthData : list) {
                                try {
                                    if (this.e.saveOneSyncHealthDetailData(hiHealthData, this.j, listC)) {
                                        i++;
                                    } else {
                                        Object[] objArr = new Object[2];
                                        objArr[c2] = "saveTrackError";
                                        objArr[1] = hiHealthData;
                                        ReleaseLogUtil.d("HiH_HiSyncTrack", objArr);
                                        LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>(5);
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("saveTrackError");
                                        sb.append(hiHealthData.getStartTime());
                                        linkedHashMap2.put(OpAnalyticsConstants.RESULT_DESCRIBE, sb.toString());
                                        ljv.d(this.g).c(OperationKey.HEALTH_APP_SYNC_CLOUD_FAILED_85070023.value(), linkedHashMap2, false);
                                    }
                                    try {
                                        hiHealthData.setSequenceData(null);
                                        zB = zB;
                                        c2 = 0;
                                    } catch (Exception e2) {
                                        e = e2;
                                        zB = zB;
                                        i2 = 0;
                                        ReleaseLogUtil.e("HiH_HiSyncTrack", "saveData Exception", LogAnonymous.b(e));
                                        if (zB) {
                                            ljq.c(BaseApplication.b(), i2);
                                        }
                                        if (i == list.size()) {
                                            liz.a().a(4, "sync download", new kym(this.g.getPackageName()));
                                        } else {
                                            ReleaseLogUtil.d("HiH_HiSyncTrack", "saveData cloudTracks error ", Integer.valueOf(i));
                                            LinkedHashMap<String, String> linkedHashMap3 = new LinkedHashMap<>(5);
                                            linkedHashMap3.put(OpAnalyticsConstants.RESULT_DESCRIBE, "saveDataError");
                                            ljv.d(this.g).c(OperationKey.HEALTH_APP_SYNC_CLOUD_FAILED_85070023.value(), linkedHashMap3, false);
                                        }
                                        LogUtil.a("HiH_HiSyncTrack", "saveData end saveDetailTime =  ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                                        if (z) {
                                            this.e.prepareRealTimeHealthDataStat(list);
                                            this.e.doRealTimeHealthDataStat();
                                        } else {
                                            this.e.prepareAsyncHealthDataStat(list);
                                            this.e.doAsyncHealthDataStat();
                                        }
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    zB = zB;
                                }
                            }
                            zB = zB;
                            if (zB) {
                                ljq.g(BaseApplication.b(), 0);
                            }
                            if (zB) {
                                i2 = 0;
                                ljq.c(BaseApplication.b(), i2);
                            }
                            if (i == list.size()) {
                                liz.a().a(4, "sync download", new kym(this.g.getPackageName()));
                            } else {
                                ReleaseLogUtil.d("HiH_HiSyncTrack", "saveData cloudTracks error ", Integer.valueOf(i));
                                LinkedHashMap<String, String> linkedHashMap4 = new LinkedHashMap<>(5);
                                linkedHashMap4.put(OpAnalyticsConstants.RESULT_DESCRIBE, "saveDataError");
                                ljv.d(this.g).c(OperationKey.HEALTH_APP_SYNC_CLOUD_FAILED_85070023.value(), linkedHashMap4, false);
                            }
                            LogUtil.a("HiH_HiSyncTrack", "saveData end saveDetailTime =  ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                            if (z) {
                                this.e.prepareRealTimeHealthDataStat(list);
                                this.e.doRealTimeHealthDataStat();
                            } else {
                                this.e.prepareAsyncHealthDataStat(list);
                                this.e.doAsyncHealthDataStat();
                            }
                        }
                        z2 = zB;
                        try {
                            LogUtil.e("HiH_HiSyncTrack", "(saveData() null == clients) ||clients.isEmpty ()");
                            if (z2) {
                                ljq.c(BaseApplication.b(), 0);
                            }
                        } catch (Exception e4) {
                            e = e4;
                            zB = z2;
                            i = 0;
                            i2 = 0;
                            ReleaseLogUtil.e("HiH_HiSyncTrack", "saveData Exception", LogAnonymous.b(e));
                            if (zB) {
                                ljq.c(BaseApplication.b(), i2);
                            }
                            if (i == list.size()) {
                                liz.a().a(4, "sync download", new kym(this.g.getPackageName()));
                            } else {
                                ReleaseLogUtil.d("HiH_HiSyncTrack", "saveData cloudTracks error ", Integer.valueOf(i));
                                LinkedHashMap<String, String> linkedHashMap5 = new LinkedHashMap<>(5);
                                linkedHashMap5.put(OpAnalyticsConstants.RESULT_DESCRIBE, "saveDataError");
                                ljv.d(this.g).c(OperationKey.HEALTH_APP_SYNC_CLOUD_FAILED_85070023.value(), linkedHashMap5, false);
                            }
                            LogUtil.a("HiH_HiSyncTrack", "saveData end saveDetailTime =  ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                            if (z) {
                                this.e.prepareRealTimeHealthDataStat(list);
                                this.e.doRealTimeHealthDataStat();
                            } else {
                                this.e.prepareAsyncHealthDataStat(list);
                                this.e.doAsyncHealthDataStat();
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        zB = z3;
                        if (zB) {
                            ljq.c(BaseApplication.b(), 0);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Exception e5) {
                e = e5;
                z2 = zB;
            }
        } catch (Exception e6) {
            e = e6;
            zB = false;
        } catch (Throwable th5) {
            th = th5;
            zB = false;
        }
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByVersion() throws lif {
        ReleaseLogUtil.d("HiH_HiSyncTrack", "downLoad() begin !");
        lis.b(30.0d, "SYNC_TRACK_DOWNLOAD_PERCENT_MAX_ALL");
        int i = this.d;
        if (i == 3) {
            LogUtil.a("HiH_HiSyncTrack", "downLoad 3.0 model");
            this.h = liq.e(this.g, this.f40159b.getSyncMethod(), this.f40159b.getSyncDataType());
        } else if (i == 2) {
            LogUtil.a("HiH_HiSyncTrack", "downLoad 2.0 model");
            this.h = lhp.b(this.g).c(this.f40159b.getSyncDataType());
        } else {
            LogUtil.a("HiH_HiSyncTrack", "downLoad else");
        }
        ReleaseLogUtil.d("HiH_HiSyncTrack", "pullDataByVersion() end ! syncKeys is ", this.h);
        if (HiCommonUtil.b(this.h)) {
            LogUtil.j("HiH_HiSyncTrack", "pullDataByVersion() end ! versions is null,stop pullDataByVersion");
        } else {
            b();
        }
        lis.c(this.g);
        HiBroadcastUtil.e(this.g, 2);
        liz.a().a(4, "HiSyncTrack", new kym(this.g.getPackageName()));
        ReleaseLogUtil.d("HiH_HiSyncTrack", "pullDataByVersion() end !");
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pushData() throws lif {
        lhq.a(this.g).b(this.j, this.f40159b, this.d, this.f, this);
    }

    public String toString() {
        return "--HiSyncTrack{}";
    }
}
