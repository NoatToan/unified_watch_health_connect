package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealthservice.sync.dataswitch.SportDataSwitch;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBase;
import com.huawei.hwcloudmodel.healthdatacloud.model.AddSportDataReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetSleepSportsDataLatestReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetSleepSportsDataLatestRsp;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetSportDataByTimeReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetSportDataByVersionReq;
import com.huawei.hwcloudmodel.model.unite.AddSportDataRsp;
import com.huawei.hwcloudmodel.model.unite.GetSportDataByTimeRsp;
import com.huawei.hwcloudmodel.model.unite.GetSportDataByVersionRsp;
import com.huawei.hwcloudmodel.model.unite.ParamValidDetail;
import com.huawei.hwcloudmodel.model.unite.ParamValidFailDetail;
import com.huawei.hwcloudmodel.model.unite.SportDetail;
import com.huawei.hwcloudmodel.model.unite.SyncKey;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lhf implements HiSyncBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f40135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f40136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kwt f40137c;
    private kwq d;
    private kwv e;
    private kxg f;
    private int g;
    private HiSyncOption h;
    private SparseArray<Integer> i;
    private lfz j;
    private Context k;
    private kxo l;
    private int m;
    private lqo o;
    private long p;
    private HiDataReadOption q;
    private SportDataSwitch r;
    private double s;
    private double t;
    private kxk u;
    private List<SyncKey> w;
    private int v = 0;
    private int y = 0;
    private boolean n = false;

    public lhf(Context context, HiSyncOption hiSyncOption, int i) {
        LogUtil.a("HiH_HiSyncSport", "HiSyncSport create");
        this.k = context.getApplicationContext();
        this.h = hiSyncOption;
        this.m = i;
        this.g = hiSyncOption.getSyncModel();
        e();
    }

    private void e() {
        this.n = liq.f();
        this.o = lqo.b(this.k);
        this.r = new SportDataSwitch(this.k);
        this.l = kxo.a();
        this.f40137c = kwt.b();
        this.u = kxk.c();
        this.e = kwv.e(this.k);
        this.d = kwq.e(this.k);
        this.f = kxg.c(this.k);
        this.j = lfz.d(this.k);
        this.q = i();
    }

    private GetSportDataByVersionRsp c(GetSportDataByVersionReq getSportDataByVersionReq) {
        return this.o.a(getSportDataByVersionReq);
    }

    private void a() throws Throwable {
        LogUtil.a("HiH_HiSyncSport", "downloadByVersion");
        Iterator<SyncKey> it = this.w.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    private void b(SyncKey syncKey) throws Throwable {
        if (syncKey == null || syncKey.getType().intValue() != 1) {
            LogUtil.j("HiH_HiSyncSport", "downloadByKey the key is not right");
            return;
        }
        Long deviceCode = syncKey.getDeviceCode();
        long jLongValue = deviceCode.longValue();
        Long version = syncKey.getVersion();
        long jLongValue2 = version.longValue();
        if (jLongValue2 <= 0) {
            LogUtil.j("HiH_HiSyncSport", "downloadByKey the maxVersion is not right , wrong key is ", syncKey);
            return;
        }
        GetSportDataByVersionReq getSportDataByVersionReq = new GetSportDataByVersionReq();
        getSportDataByVersionReq.setDataType(Integer.valueOf(this.h.getSyncMethod()));
        getSportDataByVersionReq.setDeviceCode(deviceCode);
        if (this.h.getSyncDataArea() == 1) {
            long jA = lkb.a(this.k, 1, this.m, 0L);
            if (jA < jLongValue2) {
                getSportDataByVersionReq.setVersion(Long.valueOf(jA));
                e(getSportDataByVersionReq, jLongValue2);
                return;
            } else {
                LogUtil.a("HiH_HiSyncSport", "do not need download data,DB version is ", Long.valueOf(jA), ", max version is ", version);
                return;
            }
        }
        kul kulVarA = this.u.a(this.m, jLongValue, 1);
        if (kulVarA == null) {
            getSportDataByVersionReq.setVersion(0);
            e(getSportDataByVersionReq, jLongValue2);
        } else if (kulVarA.h() < jLongValue2) {
            getSportDataByVersionReq.setVersion(Long.valueOf(kulVarA.h()));
            e(getSportDataByVersionReq, jLongValue2);
        } else {
            LogUtil.a("HiH_HiSyncSport", "do not need download data,DB version is ", Long.valueOf(kulVarA.h()), ", max version is ", version);
        }
    }

    private void a(long j, long j2, boolean z) throws Throwable {
        LogUtil.a("HiH_HiSyncSport", "performDownloadByTime startTime is ", Long.valueOf(j), " endTime is ", Long.valueOf(j2));
        SparseArray<Integer> sparseArrayA = liq.a(j, j2, 9);
        this.i = sparseArrayA;
        if (sparseArrayA == null) {
            LogUtil.j("HiH_HiSyncSport", "performDownloadByTime downloadDaysMap is null");
            return;
        }
        int size = sparseArrayA.size();
        if (size <= 0) {
            LogUtil.j("HiH_HiSyncSport", "performDownloadByTime downloadDaysMap size is wrong, size is ", Integer.valueOf(size));
            return;
        }
        LogUtil.a("HiH_HiSyncSport", "performDownloadByTime downloadDaysMap is ", this.i, ", and size = ", Integer.valueOf(size));
        this.t = 1.0d / ((double) size);
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            int iKeyAt = this.i.keyAt(size);
            c(d(iKeyAt, this.i.get(iKeyAt).intValue(), z));
        }
        if (liq.h()) {
            for (int i = 0; i < 3; i++) {
                int iD = HiDateUtil.d(j);
                j = liq.b(j, 8);
                c(c(HiDateUtil.d(j), iD, z));
            }
        }
    }

    private Map<String, List<SportDetail>> c(int i, int i2, boolean z) throws lif {
        LogUtil.a("HiH_HiSyncSport", "downloadSleepByTime startDay is ", Integer.valueOf(i), " endDay is ", Integer.valueOf(i2));
        if (i > i2) {
            return null;
        }
        if (z) {
            this.u.b(this.m, 10015, i2, 0L);
        }
        GetSportDataByTimeReq getSportDataByTimeReq = new GetSportDataByTimeReq();
        getSportDataByTimeReq.setQueryType(1);
        getSportDataByTimeReq.setDataType(Integer.valueOf(this.h.getSyncMethod()));
        getSportDataByTimeReq.setStartTime(Long.valueOf(i));
        getSportDataByTimeReq.setEndTime(Long.valueOf(i2));
        HashSet hashSet = new HashSet();
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
        getSportDataByTimeReq.setSportTypes(hashSet);
        GetSportDataByTimeRsp getSportDataByTimeRspB = this.o.b(getSportDataByTimeReq);
        if (!lih.e(getSportDataByTimeRspB, false)) {
            LogUtil.j("HiH_HiSyncSport", "downloadSleepByTime warning");
            return null;
        }
        if (z) {
            this.u.b(this.m, 10015, i, 0L);
        }
        return getSportDataByTimeRspB.getData();
    }

    private Map<String, List<SportDetail>> d(int i, int i2, boolean z) throws lif {
        LogUtil.a("HiH_HiSyncSport", "downloadOneByTime startDay is ", Integer.valueOf(i), " endDay is ", Integer.valueOf(i2));
        if (i > i2) {
            return null;
        }
        if (z) {
            this.u.b(this.m, PrebakedEffectId.RT_CALENDAR_DATE, i2, 0L);
            this.u.b(this.m, 10015, i2, 0L);
        }
        GetSportDataByTimeRsp getSportDataByTimeRspD = d(i, i2, 1, this.h.getSyncMethod());
        if (!lih.e(getSportDataByTimeRspD, false)) {
            LogUtil.j("HiH_HiSyncSport", "downloadOneByTime warning");
            return null;
        }
        if (z) {
            this.u.b(this.m, PrebakedEffectId.RT_CALENDAR_DATE, i, 0L);
            this.u.b(this.m, 10015, i, 0L);
        }
        return getSportDataByTimeRspD.getData();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    private void c(Map<String, List<SportDetail>> map) throws Throwable {
        boolean zB;
        if (map == null || map.isEmpty()) {
            LogUtil.j("HiH_HiSyncSport", "downloadOneByTime stringListMap is null or empty");
            return;
        }
        try {
            zB = !ljq.h(this.k, 0) ? ljq.b(this.k, 0) : false;
            try {
                try {
                    if (c(map, false)) {
                        liz.a().a(1, "sync download", new kym(this.k.getPackageName()));
                    }
                    this.j.doAsyncHealthDataStat();
                    if (zB) {
                        ljq.g(this.k, 0);
                    }
                    if (zB) {
                        ljq.c(this.k, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.a("HiH_HiSyncSport", "saveDataByTime Exception", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(this.k, 0);
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (zB) {
                    ljq.c(this.k, 0);
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            zB = false;
            if (zB) {
                ljq.c(this.k, 0);
            }
            throw th;
        }
    }

    private GetSportDataByTimeRsp d(int i, int i2, int i3, int i4) {
        GetSportDataByTimeReq getSportDataByTimeReq = new GetSportDataByTimeReq();
        getSportDataByTimeReq.setQueryType(Integer.valueOf(i3));
        getSportDataByTimeReq.setDataType(Integer.valueOf(i4));
        getSportDataByTimeReq.setStartTime(Long.valueOf(i));
        getSportDataByTimeReq.setEndTime(Long.valueOf(i2));
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
        hashSet.add(10);
        hashSet.add(14);
        getSportDataByTimeReq.setSportTypes(hashSet);
        return this.o.b(getSportDataByTimeReq);
    }

    private void e(GetSportDataByVersionReq getSportDataByVersionReq, long j) throws Throwable {
        LogUtil.a("HiH_HiSyncSport", "performDownloadByVersion GetSportDataByVersionReq = ", getSportDataByVersionReq, " maxVersion = ", Long.valueOf(j));
        long jLongValue = getSportDataByVersionReq.getVersion().longValue();
        this.p = jLongValue;
        if (jLongValue <= 0) {
            this.p = 0L;
        }
        this.f40136b = this.p;
        int i = 0;
        while (true) {
            long jA = a(getSportDataByVersionReq, j);
            LogUtil.a("HiH_HiSyncSport", "performDownloadByVersion downCurrentVersion = ", Long.valueOf(jA), " maxVersion = ", Long.valueOf(j));
            i++;
            if (jA <= -1) {
                return;
            }
            if (this.h.getSyncDataArea() == 1) {
                lkb.c(this.k, 1, jA, this.m);
            } else if (!this.u.d(this.m, 1, jA, getSportDataByVersionReq.getDeviceCode().longValue())) {
                LogUtil.j("HiH_HiSyncSport", "performDownloadByVersion saveVersionToDB failed ");
            }
            getSportDataByVersionReq.setVersion(Long.valueOf(jA));
            if (lgp.h() && !liq.h()) {
                LogUtil.j("HiH_HiSyncSport", "performDownloadByVersion backgroud is running");
                return;
            } else if (i >= 20) {
                LogUtil.j("HiH_HiSyncSport", "performDownloadByVersion pullDataByVersion too many times.");
                return;
            } else if (this.g != 3 && jA >= j) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0094 A[PHI: r1
      0x0094: PHI (r1v4 boolean) = (r1v3 boolean), (r1v7 boolean) binds: [B:42:0x00b9, B:31:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00be  */
    private long a(GetSportDataByVersionReq getSportDataByVersionReq, long j) throws Throwable {
        long jLongValue;
        Throwable th;
        boolean zB;
        Exception e;
        boolean zC;
        GetSportDataByVersionRsp getSportDataByVersionRspC = c(getSportDataByVersionReq);
        if (!lih.e(getSportDataByVersionRspC, false)) {
            return -1L;
        }
        Map<String, List<SportDetail>> mapB = b(getSportDataByVersionRspC);
        if (mapB == null || mapB.isEmpty()) {
            LogUtil.j("HiH_HiSyncSport", "downloadByVersionOnce stringListMap is null or empty");
            return getSportDataByVersionRspC.getCurrentVersion().longValue();
        }
        if (getSportDataByVersionRspC.getCurrentVersion() == null) {
            jLongValue = a(mapB);
        } else {
            jLongValue = getSportDataByVersionRspC.getCurrentVersion().longValue();
        }
        long j2 = this.f40136b;
        if (jLongValue <= j2) {
            ReleaseLogUtil.e("HiH_HiSyncSport", "downloadByVersionOnce downloadVersion is ", Long.valueOf(jLongValue), " smaller than currentVersion ", Long.valueOf(j2));
            return -1L;
        }
        this.t = (jLongValue - j2) / (j - this.p);
        this.f40136b = jLongValue;
        if (liq.h()) {
            try {
                zB = !ljq.h(BaseApplication.b(), 0) ? ljq.b(BaseApplication.b(), 0) : false;
                try {
                    try {
                        LogUtil.a("HiH_HiSyncSport", "downloadByVersionOnce first sync ,save data to temp ,downloadVersion is ", Long.valueOf(jLongValue));
                        zC = c(mapB, false);
                        if (zB) {
                            try {
                                ljq.g(BaseApplication.b(), 0);
                            } catch (Exception e2) {
                                e = e2;
                                ReleaseLogUtil.e("HiH_HiSyncSport", "downloadByVersionOnce() Exception", LogAnonymous.b(e));
                                if (zB) {
                                    ljq.c(BaseApplication.b(), 0);
                                }
                            }
                        }
                        if (zB) {
                            ljq.c(BaseApplication.b(), 0);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        zC = false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                zB = false;
                zC = false;
            } catch (Throwable th3) {
                th = th3;
                zB = false;
                if (zB) {
                    ljq.c(BaseApplication.b(), 0);
                }
                throw th;
            }
        } else {
            zC = c(mapB, true);
        }
        if (!zC) {
            return -1L;
        }
        liz.a().a(2, "sync download", new kym(this.k.getPackageName()));
        return jLongValue;
    }

    private Map<String, List<SportDetail>> b(GetSportDataByVersionRsp getSportDataByVersionRsp) {
        if (this.g == 3) {
            HashMap map = new HashMap(1);
            List<SportDetail> detailInfos = getSportDataByVersionRsp.getDetailInfos();
            if (detailInfos == null || detailInfos.isEmpty()) {
                return null;
            }
            map.put("one", detailInfos);
            return map;
        }
        return getSportDataByVersionRsp.getData();
    }

    private long a(Map<String, List<SportDetail>> map) {
        long j = Long.MIN_VALUE;
        long j2 = Long.MAX_VALUE;
        for (List<SportDetail> list : map.values()) {
            if (list != null && !list.isEmpty()) {
                Iterator<SportDetail> it = list.iterator();
                while (it.hasNext()) {
                    long jLongValue = it.next().getVersion().longValue();
                    if (jLongValue >= j) {
                        j = jLongValue;
                    }
                    if (jLongValue < j2) {
                        j2 = jLongValue;
                    }
                }
            }
        }
        return j;
    }

    private boolean c(Map<String, List<SportDetail>> map, final boolean z) throws lif {
        List<HiHealthData> listA;
        double size = map.size();
        for (List<SportDetail> list : map.values()) {
            if (lgp.h() && !liq.h()) {
                lis.b(this.k, 1.0d / size, 1.0d, this.f40135a);
            } else {
                lis.b(this.k, 1.0d / size, this.t, this.f40135a);
            }
            if (list != null && !list.isEmpty() && (listA = this.r.a(list, this.m, this.g)) != null && !listA.isEmpty()) {
                if (liq.h() && !z) {
                    lgx.a(this.k, listA, 1, this.m);
                } else {
                    ArrayList arrayList = new ArrayList(listA.size());
                    final ArrayList arrayList2 = new ArrayList(listA.size());
                    a(listA, arrayList, arrayList2);
                    Collections.sort(arrayList, new ljn.h());
                    d(z, arrayList);
                    if (!arrayList2.isEmpty()) {
                        ThreadPoolManager.c().execute(new Runnable() { // from class: lhm
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f40152a.d(z, arrayList2);
                            }
                        });
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void d(boolean z, List<HiHealthData> list) {
        this.j.saveSyncHealthDetailData(list, this.m);
        if (!z) {
            this.j.prepareAsyncHealthDataStat(list);
        } else {
            this.j.prepareRealTimeHealthDataStat(list);
            this.j.doRealTimeHealthDataStat();
        }
    }

    private void a(List<HiHealthData> list, List<HiHealthData> list2, List<HiHealthData> list3) {
        if (this.h.getSyncType() == 0) {
            list2.addAll(list);
            return;
        }
        for (HiHealthData hiHealthData : list) {
            if (this.h.getSyncType() == hiHealthData.getType()) {
                hiHealthData.setMergedStatus(999);
                list2.add(hiHealthData);
            } else if (HiHealthDataType.d(hiHealthData.getType()) == HiHealthDataType.Category.SESSION) {
                list2.add(hiHealthData);
            } else {
                list3.add(hiHealthData);
            }
        }
        LogUtil.a("HiH_HiSyncSport", "sync size = ", Integer.valueOf(list2.size()), ", async size = ", Integer.valueOf(list3.size()));
    }

    private void c(List<HiHealthData> list) {
        if (njy.e(list)) {
            return;
        }
        liq.a(list, String.valueOf(1));
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            d(it.next(), 1);
        }
    }

    private void d(HiHealthData hiHealthData, int i) {
        if (this.e.a(hiHealthData.getDataId(), hiHealthData.getLong("modified_time"), i) > 0) {
            long startTime = hiHealthData.getStartTime();
            long endTime = hiHealthData.getEndTime();
            int clientId = hiHealthData.getClientId();
            this.d.e(clientId, startTime, endTime, 2, i);
            this.d.e(clientId, startTime, endTime, 4, i);
            this.d.e(clientId, startTime, endTime, 3, i);
            this.d.e(clientId, startTime, endTime, 5, i);
            this.d.e(clientId, startTime, endTime, 8, i);
        }
    }

    private void b(List<HiHealthData> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (HiHealthData hiHealthData : list) {
            this.f.c(hiHealthData.getDataId(), hiHealthData.getLong("modified_time"), 1);
        }
    }

    private boolean e(List<HiHealthData> list, int i, boolean z) throws lif {
        if (z || !this.n) {
            int i2 = this.y + 1;
            this.y = i2;
            liq.a(i2, this.h.getSyncManual());
        } else {
            int i3 = this.y + 1;
            this.y = i3;
            if (5 < i3) {
                return false;
            }
        }
        List<SportDetail> listC = this.r.c(list, i, this.g);
        if (HiCommonUtil.b(listC)) {
            LogUtil.j("HiH_HiSyncSport", "addDataToCloud sportDetails is null or empty dataType is ", Integer.valueOf(i));
            return false;
        }
        AddSportDataReq addSportDataReq = new AddSportDataReq();
        addSportDataReq.setDetailInfo(listC);
        addSportDataReq.setTimeZone(list.get(0).getTimeZone());
        while (this.v < 2) {
            AddSportDataRsp addSportDataRspA = this.o.a(addSportDataReq);
            if (i == 1 && addSportDataRspA != null && addSportDataRspA.getResultCode().intValue() == 1001) {
                ParamValidDetail paramValidDetail = addSportDataRspA.getParamValidDetail();
                liq.d(addSportDataRspA, paramValidDetail);
                if (paramValidDetail == null) {
                    this.v++;
                } else {
                    ReleaseLogUtil.e("HiH_HiSyncSport", "addDataToCloud part failed ! resultCode is ", addSportDataRspA.getResultCode(), ", resultDesc is ", addSportDataRspA.getResultDesc());
                    d(list, paramValidDetail);
                    return true;
                }
            } else if (!lih.e(addSportDataRspA, false)) {
                this.v++;
            } else {
                ReleaseLogUtil.d("HiH_HiSyncSport", "addDataToCloud OK ! uploadCount is ", Integer.valueOf(this.y), " dataType is ", Integer.valueOf(i));
                if (i == 1) {
                    c(list);
                } else {
                    b(list);
                }
                return true;
            }
        }
        ReleaseLogUtil.d("HiH_HiSyncSport", "addDataToCloud failed ! uploadCount is ", Integer.valueOf(this.y), " dataType is ", Integer.valueOf(i));
        LogUtil.a("HiH_", "addDataToCloud failed ! uploadCount is ", Integer.valueOf(this.y), " dataType is ", Integer.valueOf(i));
        return false;
    }

    private void d(List<HiHealthData> list, ParamValidDetail paramValidDetail) {
        if (njy.e(list)) {
            return;
        }
        List<ParamValidFailDetail> failList = paramValidDetail.getFailList();
        ArrayList arrayList = new ArrayList();
        for (ParamValidFailDetail paramValidFailDetail : failList) {
            if (paramValidFailDetail != null) {
                arrayList.add(Long.valueOf(paramValidFailDetail.getDataId()));
            }
        }
        for (HiHealthData hiHealthData : list) {
            if (arrayList.contains(Long.valueOf(hiHealthData.getDataId()))) {
                d(hiHealthData, 3);
            } else {
                d(hiHealthData, 1);
            }
        }
    }

    private void c(int i) throws lif {
        while (this.v < 2) {
            List<HiHealthData> listA = a(i);
            if (HiCommonUtil.b(listA)) {
                break;
            }
            LogUtil.a("HiH_HiSyncSport", "getUploadSportData size =", Integer.valueOf(listA.size()));
            if (!e(listA, 1, false)) {
                LogUtil.j("HiH_HiSyncSport", "uploadSportData upload failed，clientId is ", Integer.valueOf(i));
                break;
            } else if (listA.size() < 1000) {
                LogUtil.a("HiH_HiSyncSport", "uploadSportData the size is smaller than HiSyncUtil.UPLOAD_SPORT_DATA_MAX, size is", Integer.valueOf(listA.size()));
                break;
            }
        }
        this.v = 0;
    }

    private void g(int i) throws lif {
        while (this.v < 2) {
            HiDataReadOption hiDataReadOption = new HiDataReadOption();
            long jCurrentTimeMillis = System.currentTimeMillis();
            hiDataReadOption.setTimeInterval(HiDateUtil.p(jCurrentTimeMillis), HiDateUtil.g(jCurrentTimeMillis));
            hiDataReadOption.setConstantsKey(new String[]{"step", "calorie", "distance", "altitude_offset", "pushesVal"});
            hiDataReadOption.setType(new int[]{2, 4, 3, 5, 8});
            hiDataReadOption.setAlignType(20001);
            List<HiHealthData> listC = this.l.c(i, hiDataReadOption);
            if (listC == null || listC.isEmpty()) {
                break;
            }
            LogUtil.a("HiH_HiSyncSport", "uploadTodaySportData size =", Integer.valueOf(listC.size()));
            if (!e(listC, 1, true)) {
                LogUtil.j("HiH_HiSyncSport", "uploadTodaySportData upload failed，clientId is ", Integer.valueOf(i));
                break;
            } else if (listC.size() < 1000) {
                LogUtil.a("HiH_HiSyncSport", "uploadTodaySportData the size is smaller than HiSyncUtil.UPLOAD_SPORT_DATA_MAX, size is", Integer.valueOf(listC.size()));
                break;
            }
        }
        this.v = 0;
    }

    private void b(int i) throws lif {
        List<Integer> listAsList = Arrays.asList(22001, 22002, 22003);
        while (this.v < 2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<HiHealthData> listE = this.f.e(i, listAsList, HiDateUtil.o(jCurrentTimeMillis), HiDateUtil.m(jCurrentTimeMillis));
            if (listE == null || listE.isEmpty()) {
                break;
            }
            LogUtil.a("HiH_HiSyncSport", "uploadTodaySleepData size =", Integer.valueOf(listE.size()));
            if (!e(listE, 3, true)) {
                LogUtil.j("HiH_HiSyncSport", "uploadTodaySleepData upload failed，clientId is ", Integer.valueOf(i));
                break;
            } else if (listE.size() < 1000) {
                LogUtil.a("HiH_HiSyncSport", "uploadTodaySleepData the size is smaller than HiSyncUtil.UPLOAD_SPORT_DATA_MAX, size is", Integer.valueOf(listE.size()));
                break;
            }
        }
        this.v = 0;
    }

    private List<HiHealthData> a(int i) {
        return this.l.c(i, this.q, 1000);
    }

    private void e(int i) throws lif {
        while (this.v < 2) {
            List<HiHealthData> listD = d(i);
            if (HiCommonUtil.b(listD)) {
                break;
            }
            LogUtil.a("HiH_HiSyncSport", "getUploadSleepData size =", Integer.valueOf(listD.size()));
            if (!e(listD, 3, false)) {
                LogUtil.j("HiH_HiSyncSport", "uploadSleepData upload failed，clientId is ", Integer.valueOf(i));
                break;
            } else if (listD.size() < 1000) {
                LogUtil.a("HiH_HiSyncSport", "uploadSleepData the size is smaller than HiSyncUtil.UPLOAD_SPORT_DATA_MAX, size is", Integer.valueOf(listD.size()));
                break;
            }
        }
        this.v = 0;
    }

    private List<HiHealthData> d(int i) {
        return this.f.c(i, Arrays.asList(22001, 22002, 22003), 1000);
    }

    private HiDataReadOption i() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setConstantsKey(new String[]{"step", "calorie", "distance", "altitude_offset", "pushesVal"});
        hiDataReadOption.setType(new int[]{2, 4, 3, 5, 8});
        hiDataReadOption.setAlignType(20001);
        return hiDataReadOption;
    }

    private void b() throws lif {
        int i = this.g;
        if (i == 3) {
            LogUtil.a("HiH_HiSyncSport", "pullDataByVersion 3.0 model");
            this.w = liq.e(this.k, this.h.getSyncMethod(), this.h.getSyncDataType());
        } else if (i == 2) {
            LogUtil.a("HiH_HiSyncSport", "pullDataByVersion 2.0 model");
            this.w = lhp.b(this.k).c(this.h.getSyncDataType());
        } else {
            LogUtil.a("HiH_HiSyncSport", "pullDataByVersion else");
        }
        LogUtil.a("HiH_HiSyncSport", "pullDataByVersion() syncKeys is ", this.w);
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByVersion() throws lif {
        ReleaseLogUtil.d("HiH_HiSyncSport", "pullDataByVersion() begin !");
        this.f40135a = 2.0d;
        lis.b(2.0d, "SYNC_SPORT_DOWNLOAD_PERCENT_MAX_ALL");
        b();
        List<SyncKey> list = this.w;
        if (list == null || list.isEmpty()) {
            LogUtil.j("HiH_HiSyncSport", "pullDataByVersion() syncKeys is null,stop pullDataByVersion");
            return;
        }
        a();
        lis.c(this.k);
        ReleaseLogUtil.d("HiH_HiSyncSport", "pullDataByVersion() end !");
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pushData() throws lif {
        ReleaseLogUtil.d("HiH_HiSyncSport", "pushData() begin !");
        boolean zN = lgp.n();
        boolean zM = lgp.m();
        if (!zN && !zM) {
            ReleaseLogUtil.e("HiH_HiSyncSport", "pushData() sportDataPrivacy switch is closed and healthDataPrivacy switch is closed , push end !");
            return;
        }
        lis.b(5.0d, "SYNC_SPORT_UPLOAD_PERCENT_MAX");
        List<Integer> listH = this.f40137c.h(this.m);
        if (listH == null || listH.isEmpty()) {
            LogUtil.j("HiH_HiSyncSport", "pushData() no client get, maybe no data need to pushData");
        } else {
            LogUtil.a("HiH_HiSyncSport", "clientid list size =", Integer.valueOf(listH.size()));
            this.s = 1.0d / ((double) listH.size());
            if (!this.n) {
                for (Integer num : listH) {
                    if (zN) {
                        c(num.intValue());
                    }
                    if (zM) {
                        e(num.intValue());
                    }
                }
            } else {
                a(listH, zN, zM);
                this.y = 0;
                for (Integer num2 : listH) {
                    if (zN) {
                        c(num2.intValue());
                    }
                }
                this.y = 0;
                for (Integer num3 : listH) {
                    if (zM) {
                        e(num3.intValue());
                    }
                    lis.b(this.k, 1.0d, this.s, 5.0d);
                }
            }
        }
        pullDataByVersion();
        lis.c(this.k);
        ReleaseLogUtil.d("HiH_HiSyncSport", "pushData() end !");
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByTime(long j, long j2) throws lif {
        this.f40135a = 3.0d;
        lis.b(3.0d, "SYNC_SPORT_DOWNLOAD_PERCENT_BY_TIME");
        a(j, j2, true);
        lis.c(this.k);
    }

    public String toString() {
        return "--HiSyncSport{}";
    }

    private void a(List<Integer> list, boolean z, boolean z2) throws lif {
        for (Integer num : list) {
            if (z) {
                g(num.intValue());
            }
            if (z2) {
                b(num.intValue());
            }
        }
    }

    public void c() throws lif {
        b();
        List<SyncKey> list = this.w;
        if (list == null || list.isEmpty()) {
            LogUtil.j("HiH_HiSyncSport", "pullDataByVersion() syncKeys is null,stop pullDataByVersion");
            return;
        }
        this.u.d(this.m, 1, this.w.get(0).getVersion().longValue(), this.w.get(0).getDeviceCode().longValue());
    }

    public void d() throws lif {
        kul kulVarD = this.u.d(this.m, 0L, PrebakedEffectId.RT_CALENDAR_DATE);
        if (kulVarD != null) {
            long jA = HiDateUtil.a(kulVarD.d());
            a(liq.b(jA, 7), jA, true);
        }
    }

    public void a(long j, long j2) throws lif {
        if (Utils.o()) {
            a(liq.b(j, 1), j2, false);
        } else {
            a(j, j2, false);
        }
    }

    public void e(double d) {
        lis.b(d, "SYNC_SPORT_DOWNLOAD_PERCENT_MAX_ALL");
        lis.c(this.k);
    }

    public void a(int i, int i2) throws lif {
        ReleaseLogUtil.d("HiH_HiSyncSport", "downloadLatestSleepData enter");
        GetSleepSportsDataLatestReq getSleepSportsDataLatestReq = new GetSleepSportsDataLatestReq();
        getSleepSportsDataLatestReq.setTimestamp(HiDateUtil.m(System.currentTimeMillis()) + 1);
        getSleepSportsDataLatestReq.setDataType(2);
        if (i > 0) {
            getSleepSportsDataLatestReq.setDays(i);
        }
        if (i2 > 0) {
            getSleepSportsDataLatestReq.setCounts(i2);
        }
        GetSleepSportsDataLatestRsp getSleepSportsDataLatestRspE = this.o.e(getSleepSportsDataLatestReq);
        if (!lih.e(getSleepSportsDataLatestRspE, false)) {
            ReleaseLogUtil.e("HiH_HiSyncSport", "downloadLatestSleepData warning");
            return;
        }
        List<HiHealthData> listA = this.r.a(getSleepSportsDataLatestRspE.getDetailInfos(), this.m, this.g);
        if (njy.e(listA)) {
            ReleaseLogUtil.e("HiH_HiSyncSport", "downloadLatestSleepData dataList is Empty");
        } else {
            d(true, listA);
            liz.a().a(2, "latestDataDownload", new kym(this.k.getPackageName()));
        }
    }
}
