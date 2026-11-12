package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.sync.dataswitch.HealthDataSwitch;
import com.huawei.hihealthservice.sync.dataswitch.SportDataSwitch;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBase;
import com.huawei.hwcloudmodel.healthdatacloud.model.AddHealthDataReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataByTimeReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataByVersionReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataLatestReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataLatestRsp;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetSportDataByTimeReq;
import com.huawei.hwcloudmodel.model.unite.AddHealthDataRsp;
import com.huawei.hwcloudmodel.model.unite.GetHealthDataByTimeRsp;
import com.huawei.hwcloudmodel.model.unite.GetHealthDataByVersionRsp;
import com.huawei.hwcloudmodel.model.unite.GetSportDataByTimeRsp;
import com.huawei.hwcloudmodel.model.unite.HealthDetail;
import com.huawei.hwcloudmodel.model.unite.ParamValidDetail;
import com.huawei.hwcloudmodel.model.unite.SportDetail;
import com.huawei.hwcloudmodel.model.unite.SyncKey;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class lhg implements HiSyncBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kxd f40138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kxe f40139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kwu f40140c;
    private kwq d;
    private HealthDataSwitch e;
    private HiSyncOption f;
    private List<SyncKey> h;
    private lqo i;
    private lfz j;
    private Context l;
    private SportDataSwitch m;
    private kxk n;
    private int o;
    private int p;
    private List<Integer> q;
    private int r;
    private int k = 0;
    private boolean g = false;

    private boolean b(int i) {
        return i == 3 || i == 7 || i == 9 || i == 11 || i == 12;
    }

    private boolean j(int i) {
        return i == 7;
    }

    public lhg(Context context, HiSyncOption hiSyncOption, int i) throws lif {
        LogUtil.d("HiH_HiSyncMltHlth", "HiSyncMultiHealth create");
        this.l = context.getApplicationContext();
        this.f = hiSyncOption;
        this.o = i;
        m();
    }

    private void m() throws lif {
        this.g = liq.f();
        this.i = lqo.b(this.l);
        this.n = kxk.c();
        this.m = new SportDataSwitch(this.l);
        this.f40139b = kxe.d(this.l);
        this.j = lfz.d(this.l);
        this.f40140c = kwu.c(this.l);
        this.e = new HealthDataSwitch(this.l);
        this.f40138a = kxd.e(this.l);
        this.d = kwq.e(this.l);
        this.q = n();
    }

    private List<Integer> n() {
        if (this.f.getSyncDataType() == 7) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(7);
            return arrayList;
        }
        if (this.f.getSyncDataType() == 11) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(11);
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(4);
        arrayList3.add(7);
        arrayList3.add(9);
        arrayList3.add(11);
        arrayList3.add(12);
        return arrayList3;
    }

    private void a(int i, long j, long j2, boolean z) throws Throwable {
        int i2;
        int i3;
        ReleaseLogUtil.d("HiH_HiSyncMltHlth", "downloadEachTypeByTime type is", Integer.valueOf(i), " startTime is ", Long.valueOf(j), " endTime is ", Long.valueOf(j2), "isNeedRecordTime is ", Boolean.valueOf(z));
        if (i == 1 || i == 3) {
            i2 = 10015;
        } else {
            if (i == 7) {
                i3 = 10017;
            } else if (i == 9) {
                i2 = 10016;
            } else if (i == 11) {
                i3 = 10020;
            } else if (i != 12) {
                i2 = i;
            } else {
                i3 = 10022;
            }
            i2 = i3;
        }
        if (z) {
            this.n.b(this.o, i2, HiDateUtil.d(j2), 0L);
        }
        if (10015 == i2) {
            b(j, j2, i2, z);
            return;
        }
        if (!liq.h() || 10016 != i2) {
            b(i, j, j2, i2, z);
            return;
        }
        long j3 = j2;
        int i4 = 0;
        while (i4 < 4) {
            long jO = HiDateUtil.o(liq.b(j3, 8));
            b(i, jO, j3, i2, z);
            i4++;
            j3 = jO;
            i2 = i2;
        }
    }

    private void b(long j, long j2, int i, boolean z) throws Throwable {
        boolean zB;
        GetSportDataByTimeRsp getSportDataByTimeRspB = this.i.b(d(j, j2));
        if (!lih.e(getSportDataByTimeRspB, false)) {
            LogUtil.j("HiH_HiSyncMltHlth", "downloadSportDataByTime warning");
            return;
        }
        if (z) {
            this.n.b(this.o, i, HiDateUtil.d(j), 0L);
        }
        List<SportDetail> detailInfos = getSportDataByTimeRspB.getDetailInfos();
        boolean zB2 = HiCommonUtil.b(detailInfos);
        try {
            if (zB2) {
                ReleaseLogUtil.d("HiH_HiSyncMltHlth", "downloadSportDataByTime sleepDatas null");
                return;
            }
            try {
                zB = !ljq.h(this.l, 0) ? ljq.b(this.l, 0) : false;
                try {
                    e(detailInfos);
                    if (zB) {
                        ljq.g(this.l, 0);
                    }
                    if (zB) {
                        ljq.c(this.l, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.a("HiH_HiSyncMltHlth", "downloadHealthDataByTime Exception", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(this.l, 0);
                    }
                }
            } catch (Exception e2) {
                e = e2;
                zB = false;
            } catch (Throwable th) {
                th = th;
                zB2 = false;
                if (zB2) {
                    ljq.c(this.l, 0);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void e(List<SportDetail> list) throws lif {
        d(list, true);
        this.j.doRealTimeHealthDataStat();
    }

    private void b(int i, long j, long j2, int i2, boolean z) throws Throwable {
        boolean zB;
        GetHealthDataByTimeRsp getHealthDataByTimeRspA = this.i.a(b(i, j, j2));
        if (!lih.e(getHealthDataByTimeRspA, false)) {
            LogUtil.j("HiH_HiSyncMltHlth", "downloadHealthDataByTime error type is ", Integer.valueOf(i));
            return;
        }
        if (z) {
            this.n.b(this.o, i2, HiDateUtil.d(j), 0L);
        }
        List<HealthDetail> detailInfos = getHealthDataByTimeRspA.getDetailInfos();
        if (detailInfos != null) {
            try {
                if (!detailInfos.isEmpty()) {
                    try {
                        zB = !ljq.h(this.l, 0) ? ljq.b(this.l, 0) : false;
                        try {
                            a(detailInfos, i, j, j2);
                            if (zB) {
                                ljq.g(this.l, 0);
                            }
                            if (zB) {
                                ljq.c(this.l, 0);
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            e = e;
                            ReleaseLogUtil.a("HiH_HiSyncMltHlth", "downloadHealthDataByTime Exception", LogAnonymous.b(e));
                            if (zB) {
                                ljq.c(this.l, 0);
                                return;
                            }
                            return;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        zB = false;
                    } catch (Throwable th) {
                        th = th;
                        if (0 != 0) {
                            ljq.c(this.l, 0);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        LogUtil.j("HiH_HiSyncMltHlth", "downloadHealthDataByTime data error type is ", Integer.valueOf(i));
    }

    private void a(List<HealthDetail> list, int i, long j, long j2) throws lif {
        if (a(list, i, true)) {
            if (i == 7) {
                a(j, j2);
            }
            liz.a().d(i, new kym(this.l.getPackageName()));
        }
    }

    private void a(long j, long j2) {
        HashSet hashSet = new HashSet();
        String strE = SharedPreferenceManager.e(this.l, "huawei_hihealth", "heartRate_" + this.o);
        if (!TextUtils.isEmpty(strE)) {
            hashSet.addAll((Collection) HiJsonUtil.d(strE, new TypeToken<Set<Integer>>() { // from class: com.huawei.hihealthservice.sync.syncdata.HiSyncMultiHealth$1
            }.getType()));
        }
        while (j < j2) {
            hashSet.add(Integer.valueOf(HiDateUtil.d(j)));
            j += 86400000;
        }
        SharedPreferenceManager.e(this.l, "huawei_hihealth", "heartRate_" + this.o, HiJsonUtil.d(hashSet), null);
    }

    private void d(List<SportDetail> list, boolean z) throws lif {
        List<HiHealthData> listA = this.m.a(list, this.o, 2);
        if (HiCommonUtil.b(listA)) {
            return;
        }
        Iterator<HiHealthData> it = listA.iterator();
        while (it.hasNext()) {
            it.next().setMergedStatus(999);
        }
        boolean z2 = this.j.saveSyncHealthDetailData(listA, this.o) == 0;
        if (z) {
            this.j.prepareRealTimeHealthDataStat(listA);
            this.j.doRealTimeHealthDataStat();
        } else {
            this.j.prepareAsyncHealthDataStat(listA);
        }
        if (z2) {
            liz.a().a(2, "sync download", new kym(this.l.getPackageName()));
        }
    }

    private GetHealthDataByTimeReq b(int i, long j, long j2) {
        GetHealthDataByTimeReq getHealthDataByTimeReq = new GetHealthDataByTimeReq();
        getHealthDataByTimeReq.setQueryType(2);
        getHealthDataByTimeReq.setDataType(2);
        getHealthDataByTimeReq.setStartTime(Long.valueOf(j));
        getHealthDataByTimeReq.setEndTime(Long.valueOf(j2));
        getHealthDataByTimeReq.setType(Integer.valueOf(i));
        return getHealthDataByTimeReq;
    }

    private GetSportDataByTimeReq d(long j, long j2) {
        GetSportDataByTimeReq getSportDataByTimeReq = new GetSportDataByTimeReq();
        getSportDataByTimeReq.setQueryType(2);
        getSportDataByTimeReq.setDataType(2);
        getSportDataByTimeReq.setStartTime(Long.valueOf(j));
        getSportDataByTimeReq.setEndTime(Long.valueOf(j2));
        HashSet hashSet = new HashSet(3);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
        getSportDataByTimeReq.setSportTypes(hashSet);
        return getSportDataByTimeReq;
    }

    private void j() throws lif {
        Iterator<SyncKey> it = this.h.iterator();
        while (it.hasNext()) {
            d(it.next());
            lis.b(this.l, 1.0d, 1.0d, 1.0d);
        }
    }

    private void d(SyncKey syncKey) throws lif {
        if (syncKey == null) {
            return;
        }
        Integer type = syncKey.getType();
        int iIntValue = type.intValue();
        Long version = syncKey.getVersion();
        long jLongValue = version.longValue();
        LogUtil.d("HiH_HiSyncMltHlth", "downloadOneTypeDataByVersion type is ", type, " maxVersion is ", version);
        if (jLongValue <= 0) {
            ReleaseLogUtil.e("HiH_HiSyncMltHlth", "downloadOneTypeDataByVersion cloud has no such data ,type is ", type);
            return;
        }
        GetHealthDataByVersionReq getHealthDataByVersionReq = new GetHealthDataByVersionReq();
        getHealthDataByVersionReq.setDataType(Integer.valueOf(this.f.getSyncMethod()));
        getHealthDataByVersionReq.setType(type);
        if (this.f.getSyncDataArea() == 1) {
            long jA = lkb.a(this.l, iIntValue, this.o, 0L);
            if (jA < jLongValue) {
                getHealthDataByVersionReq.setVersion(jA);
                d(getHealthDataByVersionReq, jLongValue);
                return;
            } else {
                ReleaseLogUtil.d("HiH_HiSyncMltHlth", "do not need downloadOneTypeDataByVersion data,type is ", type, " DBversion is ", Long.valueOf(jA), " maxVersion is ", version);
                return;
            }
        }
        kul kulVarA = this.n.a(this.o, 0L, iIntValue);
        if (kulVarA == null) {
            getHealthDataByVersionReq.setVersion(0L);
            d(getHealthDataByVersionReq, jLongValue);
        } else if (kulVarA.h() < jLongValue) {
            getHealthDataByVersionReq.setVersion(kulVarA.h());
            d(getHealthDataByVersionReq, jLongValue);
        } else {
            ReleaseLogUtil.d("HiH_HiSyncMltHlth", "do not need downloadOneTypeDataByVersion data,type is ", type, " DBversion is ", Long.valueOf(kulVarA.h()), " maxVersion is ", version);
        }
    }

    private void d(GetHealthDataByVersionReq getHealthDataByVersionReq, long j) throws lif {
        long jE;
        ReleaseLogUtil.d("HiH_HiSyncMltHlth", "downloadOneTypeDataWithMaxVersion rep = ", getHealthDataByVersionReq, " maxVersion = ", Long.valueOf(j));
        int i = 0;
        do {
            jE = e(getHealthDataByVersionReq);
            LogUtil.d("HiH_HiSyncMltHlth", "downloadOneTypeDataWithMaxVersion downCurrentVersion = ", Long.valueOf(jE), " maxVersion = ", Long.valueOf(j));
            i++;
            if (jE <= -1) {
                return;
            }
            if (this.f.getSyncDataArea() == 1) {
                lkb.c(this.l, getHealthDataByVersionReq.getType().intValue(), jE, this.o);
            } else if (!this.n.d(this.o, getHealthDataByVersionReq.getType().intValue(), jE, 0L)) {
                LogUtil.j("HiH_HiSyncMltHlth", "downloadOneTypeDataWithMaxVersion saveVersionToDB failed ");
                return;
            }
            getHealthDataByVersionReq.setVersion(jE);
            if (i >= 20) {
                LogUtil.j("HiH_HiSyncMltHlth", "downloadOneTypeDataWithMaxVersion pullDataByVersion too many times.");
                return;
            }
        } while (jE < j);
    }

    private long e(GetHealthDataByVersionReq getHealthDataByVersionReq) throws lif {
        GetHealthDataByVersionRsp getHealthDataByVersionRspB = this.i.b(getHealthDataByVersionReq);
        if (!lih.e(getHealthDataByVersionRspB, false)) {
            return -1L;
        }
        long currentVersion = getHealthDataByVersionRspB.getCurrentVersion();
        if (currentVersion <= getHealthDataByVersionReq.getVersion()) {
            ReleaseLogUtil.e("HiH_HiSyncMltHlth", "downOneTypeDataOnce downloadVersion ", Long.valueOf(currentVersion), " smaller than currentVersion ", Long.valueOf(getHealthDataByVersionReq.getVersion()));
            return -1L;
        }
        List<HealthDetail> detailInfos = getHealthDataByVersionRspB.getDetailInfos();
        if (detailInfos == null || detailInfos.isEmpty()) {
            ReleaseLogUtil.e("HiH_HiSyncMltHlth", "downOneTypeDataOnce detailInfos is null or empty");
            return currentVersion;
        }
        if (!a(detailInfos, getHealthDataByVersionReq.getType().intValue(), false)) {
            return -1L;
        }
        liz.a().d(getHealthDataByVersionReq.getType().intValue(), new kym(this.l.getPackageName()));
        return currentVersion;
    }

    private boolean a(List<HealthDetail> list, int i, boolean z) throws lif {
        List<HiHealthData> listA;
        ArrayList arrayList = new ArrayList(10);
        Collections.sort(list, lir.b());
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            HealthDetail healthDetail = list.get(i2);
            if (healthDetail != null && (listA = this.e.a(healthDetail, this.o)) != null && !listA.isEmpty()) {
                if (liq.h() && !z && j(i) && i2 != size - 1) {
                    lgx.a(this.l, listA, 10001, this.o);
                } else {
                    if (z || lgp.c()) {
                        Iterator<HiHealthData> it = listA.iterator();
                        while (it.hasNext()) {
                            it.next().setMergedStatus(999);
                        }
                    }
                    arrayList2.addAll(listA);
                    if (b(i)) {
                        arrayList.addAll(listA);
                    }
                }
            }
        }
        this.j.saveSyncHealthDetailData(arrayList2, this.o);
        if (arrayList.isEmpty()) {
            return true;
        }
        this.j.prepareRealTimeHealthDataStat(arrayList);
        this.j.doRealTimeHealthDataStat();
        return true;
    }

    private void d(int i, int i2) throws lif {
        while (this.r < 2) {
            if (this.g && i2 == 12 && this.k >= 4) {
                LogUtil.j("HiH_HiSyncMltHlth", "oversea exercise intensity detail data upload 1000");
                break;
            }
            List<HiHealthData> listE = e(i, i2);
            if (HiCommonUtil.b(listE) || !c(listE, i, i2, false)) {
                break;
            }
            if (this.g && i2 == 12) {
                this.k++;
                liq.a(100);
            }
        }
        this.r = 0;
    }

    private List<HiHealthData> e(int i, int i2) {
        if (i2 == 7) {
            return c(i);
        }
        if (i2 == 9) {
            return e(i);
        }
        if (i2 == 11) {
            return d(i);
        }
        if (i2 == 12) {
            return a(i);
        }
        ReleaseLogUtil.d("HiH_HiSyncMltHlth", "type is invalid!");
        return new ArrayList();
    }

    private List<HiHealthData> e(int i) {
        return this.f40140c.e(i, Arrays.asList(22101, 22102, 22103, 22104, 22105, 22106, 22107), 200);
    }

    private List<HiHealthData> c(int i) {
        return this.f40139b.c(i, Arrays.asList(2002, 2018, 2105), 200);
    }

    private List<HiHealthData> d(int i) {
        return this.f40138a.c(i, Arrays.asList(2034, 2037, 2036, 2035), 50);
    }

    private List<HiHealthData> a(int i) {
        return this.d.b(i, Collections.singletonList(7), this.g ? 250 : 50);
    }

    private void a(List<HiHealthData> list, int i) {
        if (HiCommonUtil.b(list)) {
            return;
        }
        liq.a(list, String.valueOf(i));
        for (HiHealthData hiHealthData : list) {
            e(hiHealthData, i);
            hiHealthData.setUserId(this.o);
        }
        this.j.prepareRealTimeHealthDataStat(list);
        this.j.doRealTimeHealthDataStat();
    }

    private void e(HiHealthData hiHealthData, int i) {
        long dataId = hiHealthData.getDataId();
        if (i == 7) {
            this.f40139b.b(dataId, hiHealthData.getLong("modified_time"), 1);
            return;
        }
        if (i == 9) {
            this.f40140c.a(dataId, hiHealthData.getLong("modified_time"), 1);
            return;
        }
        if (i == 11) {
            this.f40138a.e(dataId, hiHealthData.getLong("modified_time"), 1);
        } else if (i == 12) {
            this.d.d(dataId, hiHealthData.getLong("modified_time"), 1);
        } else {
            ReleaseLogUtil.d("HiH_HiSyncMltHlth", "type is invalid!");
        }
    }

    private void h(int i) throws lif {
        List<Integer> listAsList = Arrays.asList(22101, 22102, 22103, 22104, 22105, 22106, 22107);
        while (this.r < 2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<HiHealthData> listE = this.f40140c.e(i, listAsList, HiDateUtil.o(jCurrentTimeMillis), HiDateUtil.m(jCurrentTimeMillis));
            if (HiCommonUtil.b(listE) || !c(listE, i, 9, true)) {
                break;
            }
        }
        this.r = 0;
    }

    private void g(int i) throws lif {
        List<Integer> listAsList = Arrays.asList(2018, 2105, 2002);
        while (this.r < 2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<HiHealthData> listC = this.f40139b.c(i, listAsList, HiDateUtil.p(jCurrentTimeMillis), HiDateUtil.g(jCurrentTimeMillis));
            if (HiCommonUtil.b(listC) || !c(listC, i, 7, true)) {
                break;
            }
        }
        this.r = 0;
    }

    private void f(int i) throws lif {
        List<Integer> listAsList = Arrays.asList(2034, 2037, 2036, 2035);
        while (this.r < 2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<HiHealthData> listC = this.f40138a.c(i, listAsList, HiDateUtil.p(jCurrentTimeMillis), HiDateUtil.g(jCurrentTimeMillis));
            if (HiCommonUtil.b(listC) || !c(listC, i, 11, true)) {
                break;
            }
        }
        this.r = 0;
    }

    private void i(int i) throws lif {
        List<Integer> listSingletonList = Collections.singletonList(7);
        while (this.r < 2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<HiHealthData> listD = this.d.d(i, listSingletonList, HiDateUtil.p(jCurrentTimeMillis), HiDateUtil.g(jCurrentTimeMillis));
            if (HiCommonUtil.b(listD) || !c(listD, i, 12, true)) {
                break;
            }
        }
        this.r = 0;
    }

    private boolean c(List<HiHealthData> list, int i, int i2, boolean z) throws lif {
        if (z || !this.g) {
            int i3 = this.p + 1;
            this.p = i3;
            liq.c(i3, this.f.getSyncManual());
        } else {
            int i4 = this.p + 1;
            this.p = i4;
            if (20 < i4) {
                this.r += 2;
                return false;
            }
        }
        List<HealthDetail> listC = this.e.c(list, i, i2);
        if (HiCommonUtil.b(list)) {
            LogUtil.j("HiH_HiSyncMltHlth", "addHealthData healthDetails is null or empty cloudType is ", Integer.valueOf(i2), " clientId is ", Integer.valueOf(i));
            return false;
        }
        AddHealthDataReq addHealthDataReq = new AddHealthDataReq();
        addHealthDataReq.setDetailInfo(listC);
        addHealthDataReq.setTimeZone(list.get(0).getTimeZone());
        kul kulVarA = this.n.a(this.o, 0L, i2);
        if (kulVarA == null) {
            addHealthDataReq.setLocalMaxVersion(0L);
        } else {
            addHealthDataReq.setLocalMaxVersion(Long.valueOf(kulVarA.h()));
        }
        while (this.r < 2) {
            AddHealthDataRsp addHealthDataRspB = this.i.b(addHealthDataReq);
            if (addHealthDataRspB != null && addHealthDataRspB.getResultCode().intValue() == 1001 && i2 != 9) {
                ParamValidDetail paramValidDetail = addHealthDataRspB.getParamValidDetail();
                liq.d(addHealthDataRspB, paramValidDetail);
                if (paramValidDetail == null) {
                    this.r++;
                } else {
                    liq.a(list, paramValidDetail, (Map<Long, List<Long>>) null);
                    a(list, i2);
                    a(addHealthDataReq, addHealthDataRspB, i2);
                    ReleaseLogUtil.e("HiH_HiSyncMltHlth", "Multi addDataToCloud failed ! resultCode is ", addHealthDataRspB.getResultCode(), ", resultDesc is ", addHealthDataRspB.getResultDesc());
                    return true;
                }
            } else if (!lih.e(addHealthDataRspB, false)) {
                this.r++;
            } else {
                liq.a(500);
                ReleaseLogUtil.d("HiH_HiSyncMltHlth", "Multi addDataToCloud OK ! uploadCount is ", Integer.valueOf(this.p), " type is ", Integer.valueOf(i2), ", date size = ", Integer.valueOf(list.size()));
                a(list, i2);
                a(addHealthDataReq, addHealthDataRspB, i2);
                return true;
            }
        }
        ReleaseLogUtil.d("HiH_HiSyncMltHlth", "Multi addDataToCloud failed ! uploadCount is ", Integer.valueOf(this.p), " type is ", Integer.valueOf(i2), ", date size = ", Integer.valueOf(list.size()));
        return false;
    }

    private void a(AddHealthDataReq addHealthDataReq, AddHealthDataRsp addHealthDataRsp, int i) throws lif {
        ReleaseLogUtil.d("HiH_HiSyncMltHlth", "LocalMaxVersion()=", addHealthDataReq.getLocalMaxVersion(), ",rsp=", addHealthDataRsp.getTimestamp(), ",isHasMore()=", Boolean.valueOf(addHealthDataRsp.isHasMore()), ",cloudType=", Integer.valueOf(i));
        if (addHealthDataRsp.isHasMore()) {
            SyncKey syncKey = new SyncKey();
            syncKey.setType(Integer.valueOf(i));
            syncKey.setVersion(addHealthDataRsp.getTimestamp());
            d(syncKey);
            return;
        }
        if (this.n.d(this.o, i, addHealthDataRsp.getTimestamp().longValue(), 0L)) {
            return;
        }
        ReleaseLogUtil.e("HiH_HiSyncMltHlth", "downloadMore saveVersionToDB failed!");
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByVersion() throws lif {
        ReleaseLogUtil.d("HiH_HiSyncMltHlth", "pullDataByVersion() begin !");
        lis.b(3.0d, "SYNC_DOWNLOAD_MULTIHEALTH_PERCENT_MAX");
        List<SyncKey> listB = lhp.b(this.l).b(this.q);
        this.h = listB;
        LogUtil.a("HiH_HiSyncMltHlth", "pullDataByVersion() syncKeys is ", listB);
        if (HiCommonUtil.b(this.h)) {
            LogUtil.j("HiH_HiSyncMltHlth", "pullDataByVersion() keys is null,stop pullDataByVersion");
        } else {
            j();
        }
        lis.c(this.l);
        ReleaseLogUtil.d("HiH_HiSyncMltHlth", "pullDataByVersion() end !");
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByTime(long j, long j2) throws lif {
        lis.b(3.0d, "SYNC_DOWNLOAD_MULTIHEALTH_PERCENT_MAX");
        List<SyncKey> listB = lhp.b(this.l).b(this.q);
        this.h = listB;
        LogUtil.a("HiH_HiSyncMltHlth", "pullDataByTime syncKeys is ", listB);
        if (HiCommonUtil.b(this.h)) {
            LogUtil.j("HiH_HiSyncMltHlth", "pullDataByTime() keys is null,stop pullDataByVersion");
            return;
        }
        for (SyncKey syncKey : this.h) {
            Integer type = syncKey.getType();
            int iIntValue = type.intValue();
            Long version = syncKey.getVersion();
            long jLongValue = version.longValue();
            LogUtil.d("HiH_HiSyncMltHlth", "pullDataByTime type is ", type, " maxVersion is ", version);
            if (jLongValue <= 0) {
                LogUtil.j("HiH_HiSyncMltHlth", "pullDataByTime cloud has no such data ,type is ", type);
            } else if (liq.h() && 7 == iIntValue && k()) {
                e(syncKey);
            } else {
                long jP = HiDateUtil.p(j);
                if (iIntValue == 9) {
                    jP = HiDateUtil.o(j);
                }
                a(iIntValue, jP, j2, true);
                lis.b(this.l, 1.0d, 1.0d, 1.0d);
            }
        }
        lis.c(this.l);
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pushData() throws lif {
        ReleaseLogUtil.d("HiH_HiSyncMltHlth", "pushData() begin !");
        if (!lgp.m()) {
            ReleaseLogUtil.e("HiH_HiSyncMltHlth", "pushData() healthDataPrivacy switch is closed, push end!");
            return;
        }
        List<Integer> listH = kwt.b().h(this.o);
        if (HiCommonUtil.b(listH)) {
            ReleaseLogUtil.d("HiH_HiSyncMltHlth", "pushData() end ! no client");
            return;
        }
        if (this.f.getSyncDataType() == 7) {
            List<Integer> listG = g();
            if (HiCommonUtil.b(listG)) {
                ReleaseLogUtil.d("HiH_HiSyncMltHlth", "pushData() end !");
                return;
            }
            LogUtil.a("HiH_HiSyncMltHlth", "heartRateClients list before ", HiJsonUtil.d(listG));
            listG.retainAll(listH);
            if (HiCommonUtil.b(listG)) {
                ReleaseLogUtil.d("HiH_HiSyncMltHlth", "pushData() end !");
                return;
            }
            LogUtil.a("HiH_HiSyncMltHlth", "heartRateClients list after ", HiJsonUtil.d(listG));
            if (!this.g) {
                Iterator<Integer> it = listG.iterator();
                while (it.hasNext()) {
                    d(it.next().intValue(), 7);
                }
            } else {
                this.p = 0;
                for (Integer num : listG) {
                    g(num.intValue());
                    d(num.intValue(), 7);
                }
            }
            ReleaseLogUtil.d("HiH_HiSyncMltHlth", "pushData() end !");
            return;
        }
        if (this.f.getSyncDataType() == 11) {
            a(listH);
            return;
        }
        if (!this.g) {
            d(listH);
        } else {
            b(listH);
        }
        ReleaseLogUtil.d("HiH_HiSyncMltHlth", "pushData() end !");
    }

    private void d(List<Integer> list) throws lif {
        List<Integer> listG = g();
        LogUtil.a("HiH_HiSyncMltHlth", "heartRateClientIds list is ", HiJsonUtil.d(listG));
        if (!HiCommonUtil.b(listG)) {
            listG.retainAll(list);
            Iterator<Integer> it = listG.iterator();
            while (it.hasNext()) {
                d(it.next().intValue(), 7);
            }
        }
        List<Integer> listF = f();
        LogUtil.a("HiH_HiSyncMltHlth", "professionalSleepClients list is ", HiJsonUtil.d(listF));
        if (!HiCommonUtil.b(listF)) {
            listF.retainAll(list);
            Iterator<Integer> it2 = listF.iterator();
            while (it2.hasNext()) {
                d(it2.next().intValue(), 9);
            }
        }
        List<Integer> listO = o();
        LogUtil.a("HiH_HiSyncMltHlth", "stressClientIds list is ", HiJsonUtil.d(listO));
        if (!HiCommonUtil.b(listO)) {
            listO.retainAll(list);
            Iterator<Integer> it3 = listO.iterator();
            while (it3.hasNext()) {
                d(it3.next().intValue(), 11);
            }
        }
        List<Integer> listH = h();
        LogUtil.a("HiH_HiSyncMltHlth", "exerciseClientIds list is ", HiJsonUtil.d(listH));
        if (HiCommonUtil.b(listH)) {
            return;
        }
        listH.retainAll(list);
        Iterator<Integer> it4 = listH.iterator();
        while (it4.hasNext()) {
            d(it4.next().intValue(), 12);
        }
    }

    private void b(List<Integer> list) throws lif {
        List<Integer> listG = g();
        LogUtil.a("HiH_HiSyncMltHlth", "heartRateClientIds list is ", HiJsonUtil.d(listG));
        if (!HiCommonUtil.b(listG)) {
            listG.retainAll(list);
            for (Integer num : listG) {
                g(num.intValue());
                d(num.intValue(), 7);
            }
        }
        this.p = 0;
        List<Integer> listF = f();
        LogUtil.a("HiH_HiSyncMltHlth", "professionalSleepClients list is ", HiJsonUtil.d(listF));
        if (!HiCommonUtil.b(listF)) {
            listF.retainAll(list);
            for (Integer num2 : listF) {
                h(num2.intValue());
                d(num2.intValue(), 9);
            }
        }
        this.p = 0;
        List<Integer> listO = o();
        LogUtil.a("HiH_HiSyncMltHlth", "stressClientIds list is ", HiJsonUtil.d(listO));
        if (!HiCommonUtil.b(listO)) {
            listO.retainAll(list);
            for (Integer num3 : listO) {
                f(num3.intValue());
                d(num3.intValue(), 11);
            }
        }
        this.p = 0;
        this.k = 0;
        List<Integer> listH = h();
        LogUtil.a("HiH_HiSyncMltHlth", "exerciseClientIds list is ", HiJsonUtil.d(listH));
        if (HiCommonUtil.b(listH)) {
            return;
        }
        listH.retainAll(list);
        for (Integer num4 : listH) {
            i(num4.intValue());
            if (this.k < 4 && 20000 == this.f.getSyncDataType() && 5 == this.f.getSyncAction()) {
                LogUtil.j("HiH_HiSyncMltHlth", "oversea exercise intensity detail data begin to upload");
                d(num4.intValue(), 12);
            }
        }
    }

    private List<Integer> g() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(2002);
        arrayList.add(2018);
        arrayList.add(2105);
        return this.f40139b.b(arrayList);
    }

    private List<Integer> f() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(22101);
        arrayList.add(22102);
        arrayList.add(22103);
        arrayList.add(22104);
        arrayList.add(22105);
        arrayList.add(22106);
        arrayList.add(22107);
        return this.f40140c.c(arrayList);
    }

    private List<Integer> o() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(2034);
        arrayList.add(2037);
        arrayList.add(2036);
        arrayList.add(2035);
        return this.f40138a.d(arrayList);
    }

    private List<Integer> h() {
        return this.d.d(Collections.singletonList(7));
    }

    public String toString() {
        return "--HiSyncMultiHealth{}";
    }

    public void i() throws lif {
        List<SyncKey> listE = liq.e(this.l, this.f.getSyncMethod(), this.q, false);
        if (listE == null || listE.isEmpty()) {
            LogUtil.j("HiH_HiSyncMltHlth", "pullDataByVersion() keys is null,stop pullDataByVersion");
            return;
        }
        for (int i = 0; i < this.q.size(); i++) {
            this.n.d(this.o, listE.get(i).getType().intValue(), listE.get(i).getVersion().longValue(), 0L);
        }
    }

    public void a(int i, int i2) throws lif {
        a(1, HiDateUtil.a(i), HiDateUtil.a(i2), true);
    }

    public void c() throws lif {
        long jP;
        kul kulVarD = this.n.d(this.o, 0L, 10016);
        if (kulVarD != null) {
            long jP2 = HiDateUtil.p(HiDateUtil.a(kulVarD.d()));
            a(9, liq.b(jP2, 7), jP2, true);
        }
        kul kulVarD2 = this.n.d(this.o, 0L, 10015);
        if (kulVarD2 == null) {
            jP = HiDateUtil.p(this.f.getSyncStartTime());
        } else {
            jP = HiDateUtil.p(HiDateUtil.a(kulVarD2.d()));
        }
        long j = jP;
        a(3, liq.b(j, 7), j, true);
    }

    public void e() throws lif {
        kul kulVarD = this.n.d(this.o, 0L, 10017);
        if (kulVarD != null) {
            long jP = HiDateUtil.p(HiDateUtil.a(kulVarD.d()));
            a(7, liq.b(jP, 7), jP, true);
        }
    }

    public void b() throws lif {
        kul kulVarD = this.n.d(this.o, 0L, 10022);
        if (kulVarD != null) {
            long jP = HiDateUtil.p(HiDateUtil.a(kulVarD.d()));
            a(12, liq.b(jP, 7), jP, true);
        }
    }

    public void d() throws lif {
        kul kulVarD = this.n.d(this.o, 0L, 10020);
        if (kulVarD != null) {
            long jP = HiDateUtil.p(HiDateUtil.a(kulVarD.d()));
            a(11, liq.b(jP, 7), jP, true);
        }
    }

    private boolean k() {
        return !kww.c(this.l).c();
    }

    private void e(SyncKey syncKey) throws lif {
        this.n.d(this.o, syncKey.getType().intValue(), 0L, 0L);
        d(syncKey);
    }

    public boolean a() throws lif {
        kul kulVarD;
        List<Integer> listB = lhj.b(this.l).b(this.o);
        if (HiCommonUtil.b(listB) || (kulVarD = this.n.d(this.o, 0L, 10015)) == null) {
            return true;
        }
        int iD = kulVarD.d();
        LogUtil.d("HiH_HiSyncMltHlth", "downloadSevenSleepDetailData days=", listB.toString(), ", already download day=", Integer.valueOf(iD));
        for (Integer num : listB) {
            if (num.intValue() < iD) {
                long jA = HiDateUtil.a(num.intValue());
                e(HiDateUtil.k(jA), HiDateUtil.g(jA));
            }
        }
        return true;
    }

    private void e(long j, long j2) throws lif {
        GetSportDataByTimeRsp getSportDataByTimeRspB = this.i.b(d(j, j2));
        if (!lih.e(getSportDataByTimeRspB, false)) {
            LogUtil.j("HiH_HiSyncMltHlth", "downloadSportDataByTimeNoUpdateTime warning");
            return;
        }
        List<SportDetail> detailInfos = getSportDataByTimeRspB.getDetailInfos();
        if (HiCommonUtil.b(detailInfos)) {
            ReleaseLogUtil.d("HiH_HiSyncMltHlth", "sleepDatas null startTime = ", Long.valueOf(j), ", endTime = ", Long.valueOf(j2));
        } else {
            d(detailInfos, true);
            this.j.doRealTimeHealthDataStat();
        }
    }

    public void c(int i, long j, long j2) throws lif {
        a(i, j, j2, false);
    }

    public void d(int i, long j, long j2) throws lif {
        if (i == 22100) {
            a(9, j, j2, false);
        } else {
            a(3, j, j2, false);
        }
    }

    private void a(List<Integer> list) throws lif {
        List<Integer> listO = o();
        if (HiCommonUtil.b(listO)) {
            ReleaseLogUtil.d("HiH_HiSyncMltHlth", "pushData() end !");
            return;
        }
        LogUtil.a("HiH_HiSyncMltHlth", "StressClients list before ", HiJsonUtil.d(listO));
        listO.retainAll(list);
        if (HiCommonUtil.b(listO)) {
            ReleaseLogUtil.d("HiH_HiSyncMltHlth", "pushData() end !");
            return;
        }
        LogUtil.a("HiH_HiSyncMltHlth", "stressClients list after ", HiJsonUtil.d(listO));
        if (!this.g) {
            Iterator<Integer> it = listO.iterator();
            while (it.hasNext()) {
                d(it.next().intValue(), 11);
            }
        } else {
            this.p = 0;
            for (Integer num : listO) {
                f(num.intValue());
                d(num.intValue(), 11);
            }
        }
        ReleaseLogUtil.d("HiH_HiSyncMltHlth", "pushData() end !");
    }

    public void b(int i, int i2, int i3) throws lif {
        ReleaseLogUtil.d("HiH_HiSyncMltHlth", "downloadLatestData enter");
        GetHealthDataLatestReq getHealthDataLatestReq = new GetHealthDataLatestReq();
        getHealthDataLatestReq.setType(i3);
        getHealthDataLatestReq.setDataType(2);
        if (i3 == 9) {
            getHealthDataLatestReq.setTimestamp(HiDateUtil.m(System.currentTimeMillis()) + 1);
        } else {
            getHealthDataLatestReq.setTimestamp(HiDateUtil.h(System.currentTimeMillis()));
        }
        if (i > 0) {
            getHealthDataLatestReq.setDays(i);
        }
        if (i2 > 0) {
            getHealthDataLatestReq.setCounts(i2);
        }
        GetHealthDataLatestRsp getHealthDataLatestRspA = this.i.a(getHealthDataLatestReq);
        if (!lih.e(getHealthDataLatestRspA, false)) {
            ReleaseLogUtil.e("HiH_HiSyncMltHlth", "downloadLatestData warning");
            return;
        }
        List<HealthDetail> detailInfos = getHealthDataLatestRspA.getDetailInfos();
        if (njy.e(detailInfos)) {
            ReleaseLogUtil.e("HiH_HiSyncMltHlth", "downloadLatestData dataList is Empty");
        } else {
            a(detailInfos, i3, true);
            liz.a().a(liz.d(i3), "latestDataDownload", new kym(this.l.getPackageName()));
        }
    }
}
