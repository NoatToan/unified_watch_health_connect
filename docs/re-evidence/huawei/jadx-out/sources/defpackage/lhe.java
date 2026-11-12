package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealthservice.db.helper.HiHealthDBHelper;
import com.huawei.hihealthservice.sync.dataswitch.HealthDataSwitch;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBase;
import com.huawei.hwcloudmodel.healthdatacloud.model.AddHealthDataReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataByTimeReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataByVersionReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataLatestReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataLatestRsp;
import com.huawei.hwcloudmodel.model.unite.AddHealthDataRsp;
import com.huawei.hwcloudmodel.model.unite.GetHealthDataByTimeRsp;
import com.huawei.hwcloudmodel.model.unite.GetHealthDataByVersionRsp;
import com.huawei.hwcloudmodel.model.unite.HealthDetail;
import com.huawei.hwcloudmodel.model.unite.ParamValidDetail;
import com.huawei.hwcloudmodel.model.unite.SyncKey;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lhe implements HiSyncBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f40132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private lfz f40133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HiSyncOption f40134c;
    private lqo d;
    private HealthDataSwitch e;
    private boolean f = false;
    private int g;
    private List<SyncKey> h;
    private List<Integer> i;
    private kxk j;
    private int n;
    private int o;

    private boolean c(int i) {
        return i == 16;
    }

    public lhe(Context context, HiSyncOption hiSyncOption, int i) {
        LogUtil.d("Debug_HiSyncHealthSensitiveData", "HiSyncHealthSensitiveData create");
        this.f40132a = context.getApplicationContext();
        this.f40134c = hiSyncOption;
        this.g = i;
        e();
    }

    private void e() {
        if (this.f40132a == null) {
            LogUtil.e("Debug_HiSyncHealthSensitiveData", "HiSyncHealthSensitiveData init failed, mContext is null");
            return;
        }
        this.f = liq.f();
        this.d = lqo.b(this.f40132a);
        this.j = kxk.c();
        this.f40133b = lfz.d(this.f40132a);
        this.e = new HealthDataSwitch(this.f40132a);
        this.i = a();
        List<SyncKey> listB = lhp.b(this.f40132a).b(this.i);
        this.h = listB;
        LogUtil.a("Debug_HiSyncHealthSensitiveData", "init syncKeys is ", listB);
    }

    private List<Integer> a() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(18);
        arrayList.add(16);
        arrayList.add(19);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    public void a(int i, long j, long j2) throws Throwable {
        boolean zB;
        ReleaseLogUtil.d("Debug_HiSyncHealthSensitiveData", "downloadEachTypeByTime type is ", Integer.valueOf(i), " startTime is ", Long.valueOf(j), " endTime is ", Long.valueOf(j2));
        GetHealthDataByTimeRsp getHealthDataByTimeRspA = this.d.a(b(i, j, j2));
        boolean z = false;
        if (!lih.e(getHealthDataByTimeRspA, false)) {
            LogUtil.j("Debug_HiSyncHealthSensitiveData", "downloadEachTypeByTime error type is ", Integer.valueOf(i));
            return;
        }
        List<HealthDetail> detailInfos = getHealthDataByTimeRspA.getDetailInfos();
        if (detailInfos == null || detailInfos.isEmpty()) {
            LogUtil.j("Debug_HiSyncHealthSensitiveData", "downloadEachTypeByTime data error type is ", Integer.valueOf(i));
            return;
        }
        try {
            zB = !ljq.h(this.f40132a, 10001) ? ljq.b(this.f40132a, 10001) : false;
            try {
                try {
                    d(detailInfos, i, 0L);
                    if (zB) {
                        ljq.g(this.f40132a, 10001);
                    }
                    if (zB) {
                        ljq.c(this.f40132a, 10001);
                    }
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.a("HiH_HiSyncHlthSensDt", "downloadEachTypeByTime Exception", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(this.f40132a, 10001);
                    }
                }
            } catch (Throwable th) {
                th = th;
                z = zB;
                if (z) {
                    ljq.c(this.f40132a, 10001);
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            if (z) {
                ljq.c(this.f40132a, 10001);
            }
            throw th;
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

    private void c() throws lif {
        Iterator<SyncKey> it = this.h.iterator();
        while (it.hasNext()) {
            b(it.next());
            lis.b(this.f40132a, 1.0d, 1.0d, 1.0d);
        }
    }

    private void b(SyncKey syncKey) throws lif {
        if (syncKey == null) {
            LogUtil.j("Debug_HiSyncHealthSensitiveData", "downloadOneTypeDataByVersion syncKey is null!");
            return;
        }
        Integer type = syncKey.getType();
        int iIntValue = type.intValue();
        Long version = syncKey.getVersion();
        long jLongValue = version.longValue();
        LogUtil.a("Debug_HiSyncHealthSensitiveData", "downloadOneTypeDataByVersion type is ", type, ", cloudDataVersion is ", version);
        if (jLongValue <= 0) {
            LogUtil.j("Debug_HiSyncHealthSensitiveData", "downloadOneTypeDataByVersion cloud has no such data, type is ", type);
            return;
        }
        GetHealthDataByVersionReq getHealthDataByVersionReq = new GetHealthDataByVersionReq();
        getHealthDataByVersionReq.setDataType(Integer.valueOf(this.f40134c.getSyncMethod()));
        getHealthDataByVersionReq.setType(type);
        if (this.f40134c.getSyncDataArea() == 1 && iIntValue == 16) {
            long jA = lkb.a(this.f40132a, iIntValue, this.g, 0L);
            ReleaseLogUtil.d("Debug_HiSyncHealthSensitiveData", "downloadAllSpO2Data,type is ", type, " DBversion is ", Long.valueOf(jA), " maxVersion is ", version);
            if (jA < jLongValue) {
                getHealthDataByVersionReq.setVersion(jA);
                d(getHealthDataByVersionReq, jLongValue);
            }
        }
        kul kulVarA = this.j.a(this.g, 0L, iIntValue);
        if (kulVarA == null) {
            LogUtil.a("Debug_HiSyncHealthSensitiveData", " syncAnchorTable is null");
            getHealthDataByVersionReq.setVersion(0L);
            d(getHealthDataByVersionReq, jLongValue);
        } else {
            if (kulVarA.h() < jLongValue) {
                LogUtil.a("Debug_HiSyncHealthSensitiveData", "Local version is ", Long.valueOf(kulVarA.h()));
                getHealthDataByVersionReq.setVersion(kulVarA.h());
                d(getHealthDataByVersionReq, jLongValue);
                return;
            }
            LogUtil.a("Debug_HiSyncHealthSensitiveData", " do not need downloadOneTypeDataByVersion data, type is ", type, ", DBDataversion is ", Long.valueOf(kulVarA.h()), ", cloudDataVersion is ", version);
        }
    }

    private void d(GetHealthDataByVersionReq getHealthDataByVersionReq, long j) throws lif {
        long jD;
        ReleaseLogUtil.d("HiH_HiSyncHlthSensDt", " downloadOneTypeDataWithMaxVersion rep = ", getHealthDataByVersionReq, ", maxVersion = ", Long.valueOf(j));
        int i = 0;
        do {
            jD = d(getHealthDataByVersionReq);
            LogUtil.d("Debug_HiSyncHealthSensitiveData", " downloadOneTypeDataWithMaxVersion downCurrentVersion is ", Long.valueOf(jD), " maxVersion is ", Long.valueOf(j));
            i++;
            if (jD <= -1) {
                return;
            }
            if (this.f40134c.getSyncDataArea() == 1 && getHealthDataByVersionReq.getType().intValue() == 16) {
                lkb.c(this.f40132a, getHealthDataByVersionReq.getType().intValue(), jD, this.g);
            } else if (!this.j.d(this.g, getHealthDataByVersionReq.getType().intValue(), jD, 0L)) {
                LogUtil.j("Debug_HiSyncHealthSensitiveData", "downloadOneTypeDataWithMaxVersion saveVersionToDB failed!");
                return;
            }
            getHealthDataByVersionReq.setVersion(jD);
            if (lgp.h() && !liq.h()) {
                LogUtil.j("HiH_HiSyncHlthSensDt", " downloadOneTypeDataWithMaxVersion() backgroud is running");
                return;
            } else if (i >= 20) {
                LogUtil.j("Debug_HiSyncHealthSensitiveData", " downloadOneTypeDataWithMaxVersion() pullDataByVersion too many times");
                return;
            }
        } while (jD < j);
    }

    public void d(int i, long j, long j2) throws lif {
        if (HiHealthDBHelper.e("hihealth_sensitive.db").getWritableDatabase() == null) {
            LogUtil.e("Debug_HiSyncHealthSensitiveData", "Can not open db ", "hihealth_sensitive.db");
        } else {
            a(i, j, j2);
        }
    }

    private long d(GetHealthDataByVersionReq getHealthDataByVersionReq) throws lif {
        GetHealthDataByVersionRsp getHealthDataByVersionRspB = this.d.b(getHealthDataByVersionReq);
        if (!lih.e(getHealthDataByVersionRspB, false)) {
            LogUtil.j("Debug_HiSyncHealthSensitiveData", "downOneTypeDataOnce() SyncError checkCloudRsp");
            return -1L;
        }
        long currentVersion = getHealthDataByVersionRspB.getCurrentVersion();
        if (currentVersion <= getHealthDataByVersionReq.getVersion()) {
            ReleaseLogUtil.e("HiH_HiSyncHlthSensDt", "downOneTypeDataOnce downloadVersion ", Long.valueOf(currentVersion), " smaller than currentVersion ", Long.valueOf(getHealthDataByVersionReq.getVersion()));
            return -1L;
        }
        List<HealthDetail> detailInfos = getHealthDataByVersionRspB.getDetailInfos();
        if (HiCommonUtil.b(detailInfos)) {
            ReleaseLogUtil.e("HiH_HiSyncHlthSensDt", "downOneTypeDataOnce() detailInfos is null or empty");
            return currentVersion;
        }
        if (!d(detailInfos, getHealthDataByVersionReq.getType().intValue(), getHealthDataByVersionReq.getVersion())) {
            return -1L;
        }
        liz.a().d(getHealthDataByVersionReq.getType().intValue(), new kym(this.f40132a.getPackageName()));
        return currentVersion;
    }

    private boolean d(List<HealthDetail> list, int i, long j) throws lif {
        List<HiHealthData> listA;
        LogUtil.d("Debug_HiSyncHealthSensitiveData", " saveData()");
        ArrayList arrayList = new ArrayList(10);
        Collections.sort(list, lir.b());
        for (HealthDetail healthDetail : list) {
            if (healthDetail != null && healthDetail.getVersion() >= j && (listA = this.e.a(healthDetail, this.g)) != null && !listA.isEmpty()) {
                this.f40133b.saveSyncHealthDetailData(listA, this.g);
                if (c(i)) {
                    arrayList.addAll(listA);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        this.f40133b.prepareRealTimeHealthDataStat(arrayList);
        this.f40133b.doRealTimeHealthDataStat();
        return true;
    }

    private void d(List<HiHealthData> list) {
        if (HiCommonUtil.b(list)) {
            LogUtil.d("Debug_HiSyncHealthSensitiveData", " uploadPointsOK() hiHealthDatas is null or empty");
            return;
        }
        for (HiHealthData hiHealthData : list) {
            ljq.a(this.f40132a, hiHealthData.getType()).b(hiHealthData.getDataId(), hiHealthData.getLong("modified_time"), 1);
            hiHealthData.setUserId(this.g);
        }
        this.f40133b.prepareRealTimeHealthDataStat(list);
        this.f40133b.doRealTimeHealthDataStat();
    }

    private boolean b(List<HiHealthData> list, int i, int i2, boolean z) throws lif {
        if (z || !this.f) {
            int i3 = this.n + 1;
            this.n = i3;
            liq.c(i3, this.f40134c.getSyncManual());
        } else {
            int i4 = this.n + 1;
            this.n = i4;
            if (i4 > 5) {
                this.o += 2;
                return false;
            }
        }
        List<HealthDetail> listC = this.e.c(list, i, i2);
        if (listC == null || listC.isEmpty()) {
            LogUtil.j("Debug_HiSyncHealthSensitiveData", " addHealthData() healthDetails is null or empty cloudType is ", Integer.valueOf(i2), " clientId is ", Integer.valueOf(i));
            return false;
        }
        AddHealthDataReq addHealthDataReq = new AddHealthDataReq();
        addHealthDataReq.setTimeZone(list.get(0).getTimeZone());
        addHealthDataReq.setDetailInfo(listC);
        kul kulVarA = this.j.a(this.g, 0L, i2);
        if (kulVarA == null) {
            addHealthDataReq.setLocalMaxVersion(0L);
        } else {
            addHealthDataReq.setLocalMaxVersion(Long.valueOf(kulVarA.h()));
        }
        while (this.o < 2) {
            AddHealthDataRsp addHealthDataRspB = this.d.b(addHealthDataReq);
            if (addHealthDataRspB != null && addHealthDataRspB.getResultCode().intValue() == 1001) {
                ParamValidDetail paramValidDetail = addHealthDataRspB.getParamValidDetail();
                liq.d(addHealthDataRspB, paramValidDetail);
                if (paramValidDetail == null) {
                    this.o++;
                } else {
                    liq.a(list, paramValidDetail, (Map<Long, List<Long>>) null);
                    d(list);
                    c(addHealthDataReq, addHealthDataRspB, i2);
                    ReleaseLogUtil.e("HiH_HiSyncHlthSensDt", "addDataToCloud failed ! resultCode is ", addHealthDataRspB.getResultCode(), ", resultDesc is ", addHealthDataRspB.getResultDesc());
                    return true;
                }
            } else if (!lih.e(addHealthDataRspB, false)) {
                this.o++;
            } else {
                ReleaseLogUtil.d("HiH_HiSyncHlthSensDt", "addDataToCloud OK ! uploadCount is ", Integer.valueOf(this.n), " type is ", Integer.valueOf(i2), ", date size = ", Integer.valueOf(list.size()));
                d(list);
                c(addHealthDataReq, addHealthDataRspB, i2);
                return true;
            }
        }
        ReleaseLogUtil.d("HiH_HiSyncHlthSensDt", "addDataToCloud failed ! uploadCount is ", Integer.valueOf(this.n), " type is ", Integer.valueOf(i2), ", date size = ", Integer.valueOf(list.size()));
        return false;
    }

    private void c(AddHealthDataReq addHealthDataReq, AddHealthDataRsp addHealthDataRsp, int i) throws lif {
        ReleaseLogUtil.d("Debug_HiSyncHealthSensitiveData", "LocalMaxVersion()=", addHealthDataReq.getLocalMaxVersion(), ",rsp=", addHealthDataRsp.getTimestamp(), ",isHasMore()=", Boolean.valueOf(addHealthDataRsp.isHasMore()), ",cloudType=", Integer.valueOf(i));
        if (addHealthDataRsp.isHasMore()) {
            SyncKey syncKey = new SyncKey();
            syncKey.setType(Integer.valueOf(i));
            syncKey.setVersion(addHealthDataRsp.getTimestamp());
            b(syncKey);
            return;
        }
        if (this.j.d(this.g, i, addHealthDataRsp.getTimestamp().longValue(), 0L)) {
            return;
        }
        ReleaseLogUtil.e("HiH_HiSyncHlthSensDt", "downloadMore saveVersionToDB failed!");
    }

    private void e(int i, int i2) throws lif {
        while (this.o < 2) {
            List<HiHealthData> listB = b(i, i2);
            if (HiCommonUtil.b(listB) || !b(listB, i, i2, false)) {
                break;
            }
        }
        this.o = 0;
    }

    private List<HiHealthData> b(int i, int i2) {
        if (i2 == 4) {
            return d(i);
        }
        if (i2 == 16) {
            return a(i);
        }
        if (i2 == 18) {
            return e(i);
        }
        if (i2 == 19) {
            return b(i);
        }
        ReleaseLogUtil.d("Debug_HiSyncHealthSensitiveData", "type is invalid!");
        return new ArrayList();
    }

    private List<HiHealthData> d(int i) {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(2015);
        arrayList.add(2008);
        arrayList.add(2009);
        arrayList.add(2010);
        arrayList.add(2011);
        arrayList.add(2012);
        arrayList.add(2013);
        arrayList.add(2014);
        arrayList.add(2106);
        return ljq.a(this.f40132a, 10001).c(i, arrayList, 50);
    }

    private List<HiHealthData> e(int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(2104);
        return ljq.a(this.f40132a, 2104).c(i, arrayList, 50);
    }

    private List<HiHealthData> a(int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(2103);
        return ljq.a(this.f40132a, 2103).c(i, arrayList, 200);
    }

    private List<HiHealthData> b(int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(2107);
        return ljq.a(this.f40132a, 2107).c(i, arrayList, 50);
    }

    private void h(int i) throws lif {
        while (this.o < 2) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(2103);
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<HiHealthData> listC = ljq.a(this.f40132a, 2103).c(i, arrayList, HiDateUtil.p(jCurrentTimeMillis), HiDateUtil.g(jCurrentTimeMillis));
            if (listC == null || listC.isEmpty() || !b(listC, i, 16, true)) {
                break;
            }
        }
        this.o = 0;
    }

    private void i(int i) throws lif {
        while (this.o < 2) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(2107);
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<HiHealthData> listC = ljq.a(this.f40132a, 2107).c(i, arrayList, HiDateUtil.p(jCurrentTimeMillis), HiDateUtil.g(jCurrentTimeMillis));
            if (listC == null || listC.isEmpty() || !b(listC, i, 19, true)) {
                break;
            }
        }
        this.o = 0;
    }

    public void b() throws lif {
        if (HiHealthDBHelper.e("hihealth_sensitive.db").getWritableDatabase() == null) {
            LogUtil.e("Debug_HiSyncHealthSensitiveData", "Can not open db ", "hihealth_sensitive.db");
            return;
        }
        kul kulVarD = this.j.d(this.g, 0L, 10024);
        if (kulVarD != null) {
            long jP = HiDateUtil.p(HiDateUtil.a(kulVarD.d()));
            this.j.b(this.g, 10024, HiDateUtil.d(jP), 0L);
            a(16, liq.b(jP, 7), jP);
        }
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByVersion() throws lif {
        lis.b(5.0d, "SYNC_SENSITIVE_DOWNLOAD_PERCENT_MAX_ALL");
        if (HiHealthDBHelper.e("hihealth_sensitive.db").getWritableDatabase() == null) {
            LogUtil.e("Debug_HiSyncHealthSensitiveData", "Can not open db ", "hihealth_sensitive.db");
            lis.c(this.f40132a);
            return;
        }
        ReleaseLogUtil.d("HiH_HiSyncHlthSensDt", "pullDataByVersion() begin !");
        LogUtil.d("Debug_HiSyncHealthSensitiveData", "pullDataByVersion() keys is ", this.h);
        if (HiCommonUtil.b(this.h)) {
            LogUtil.j("Debug_HiSyncHealthSensitiveData", "pullDataByVersion() keys is null, stop pullDataByVersion");
        } else {
            c();
        }
        lis.c(this.f40132a);
        ReleaseLogUtil.d("HiH_HiSyncHlthSensDt", "pullDataByVersion() end !");
    }

    public void d() {
        List<SyncKey> listC = lhp.b(this.f40132a).c(16);
        if (HiCommonUtil.b(listC)) {
            ReleaseLogUtil.e("Debug_HiSyncHealthSensitiveData", "BLOOD_OXYGEN not exist in cloud");
        } else {
            this.j.d(this.g, 16, listC.get(0).getVersion().longValue(), 0L);
        }
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByTime(long j, long j2) throws lif {
        if (HiHealthDBHelper.e("hihealth_sensitive.db").getWritableDatabase() == null) {
            LogUtil.e("Debug_HiSyncHealthSensitiveData", "Can not open db ", "hihealth_sensitive.db");
            return;
        }
        List<SyncKey> list = this.h;
        if (list == null || list.isEmpty()) {
            LogUtil.j("Debug_HiSyncHealthSensitiveData", "pullDataByTime() keys is null,stop pullDataByVersion");
            return;
        }
        for (SyncKey syncKey : this.h) {
            Integer type = syncKey.getType();
            int iIntValue = type.intValue();
            Long version = syncKey.getVersion();
            long jLongValue = version.longValue();
            LogUtil.a("Debug_HiSyncHealthSensitiveData", "pullDataByTime type is ", type, " cloudDataVersion is ", version);
            if (jLongValue <= 0) {
                LogUtil.j("Debug_HiSyncHealthSensitiveData", "pullDataByTime cloud has no such data, type is ", type);
            } else if (iIntValue != 16) {
                continue;
            } else {
                HiDataReadOption hiDataReadOption = new HiDataReadOption();
                hiDataReadOption.setStartTime(0L);
                hiDataReadOption.setEndTime(System.currentTimeMillis());
                hiDataReadOption.setType(new int[]{47204});
                hiDataReadOption.setCount(1);
                hiDataReadOption.setSortOrder(1);
                List<HiHealthData> listD = kwz.d().d(hiDataReadOption, hiDataReadOption.getType(), kyn.d(this.f40132a).e(0, this.g, 0));
                if (HiCommonUtil.b(listD)) {
                    return;
                }
                long startTime = listD.get(0).getStartTime() + 86400000;
                long jB = liq.b(startTime, 7);
                this.j.b(this.g, 10024, HiDateUtil.d(startTime), 0L);
                a(iIntValue, jB, startTime);
            }
        }
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pushData() throws lif {
        if (HiHealthDBHelper.e("hihealth_sensitive.db").getWritableDatabase() == null) {
            LogUtil.e("Debug_HiSyncHealthSensitiveData", "Can not open db ", "hihealth_sensitive.db");
            return;
        }
        ReleaseLogUtil.d("HiH_HiSyncHlthSensDt", "pushData() begin !");
        if (!lgp.m()) {
            ReleaseLogUtil.e("HiH_HiSyncHlthSensDt", "pushData() dataPrivacy switch is closed, push end!");
            return;
        }
        lij.e(this.f40132a, this.g);
        List<Integer> listH = kwt.b().h(this.g);
        if (HiCommonUtil.b(listH)) {
            ReleaseLogUtil.d("HiH_HiSyncHlthSensDt", "pushData() end!");
            return;
        }
        List<Integer> listE = kxc.c().e("client_id", 0);
        if (HiCommonUtil.b(listE)) {
            ReleaseLogUtil.d("HiH_HiSyncHlthSensDt", "pushData() end!");
            return;
        }
        listH.retainAll(listE);
        if (HiCommonUtil.b(listH)) {
            ReleaseLogUtil.d("HiH_HiSyncHlthSensDt", "pushData() end!");
            return;
        }
        LogUtil.a("HiH_HiSyncHlthSensDt", "clientid list size = ", Integer.valueOf(listH.size()));
        if (!this.f) {
            b(listH);
        } else {
            c(listH);
            this.n = 0;
            a(16, listH);
            a(19, listH);
        }
        ReleaseLogUtil.d("HiH_HiSyncHlthSensDt", "pushData() end!");
    }

    private void c(List<Integer> list) throws lif {
        for (Integer num : list) {
            f(num.intValue());
            h(num.intValue());
            i(num.intValue());
        }
    }

    private void f(int i) throws lif {
        while (this.o < 2) {
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(2015);
            arrayList.add(2008);
            arrayList.add(2009);
            arrayList.add(2010);
            arrayList.add(2011);
            arrayList.add(2012);
            arrayList.add(2013);
            arrayList.add(2014);
            arrayList.add(2106);
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<HiHealthData> listC = ljq.a(this.f40132a, 10001).c(i, arrayList, HiDateUtil.p(jCurrentTimeMillis), HiDateUtil.g(jCurrentTimeMillis));
            if (listC == null || listC.isEmpty() || !b(listC, i, 0, true)) {
                break;
            }
        }
        this.o = 0;
    }

    private void b(List<Integer> list) throws lif {
        for (Integer num : list) {
            e(num.intValue(), 18);
            e(num.intValue(), 16);
            e(num.intValue(), 19);
        }
    }

    private void a(int i, List<Integer> list) throws lif {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            e(it.next().intValue(), i);
        }
        this.n = 0;
    }

    public String toString() {
        return "--HiSyncHealthSensitiveData {}";
    }

    public void e(int i, int i2, int i3) throws lif {
        ReleaseLogUtil.d("Debug_HiSyncHealthSensitiveData", "enter downloadLatestData type = ", Integer.valueOf(i3));
        if (HiHealthDBHelper.e("hihealth_sensitive.db").getWritableDatabase() == null) {
            ReleaseLogUtil.a("Debug_HiSyncHealthSensitiveData", "Can not open db ", "hihealth_sensitive.db");
            return;
        }
        GetHealthDataLatestReq getHealthDataLatestReq = new GetHealthDataLatestReq();
        getHealthDataLatestReq.setType(i3);
        getHealthDataLatestReq.setDataType(2);
        getHealthDataLatestReq.setTimestamp(HiDateUtil.h(System.currentTimeMillis()));
        if (i > 0) {
            getHealthDataLatestReq.setDays(i);
        }
        if (i2 > 0) {
            getHealthDataLatestReq.setCounts(i2);
        }
        GetHealthDataLatestRsp getHealthDataLatestRspA = this.d.a(getHealthDataLatestReq);
        if (!lih.e(getHealthDataLatestRspA, false)) {
            ReleaseLogUtil.e("Debug_HiSyncHealthSensitiveData", "downloadLatestData warning");
            return;
        }
        List<HealthDetail> detailInfos = getHealthDataLatestRspA.getDetailInfos();
        if (njy.e(detailInfos)) {
            ReleaseLogUtil.e("Debug_HiSyncHealthSensitiveData", "downloadLatestData dataList is Empty");
        } else {
            d(detailInfos, i3, 0L);
            liz.a().a(liz.d(i3), "latestDataDownload", new kym(this.f40132a.getPackageName()));
        }
    }
}
