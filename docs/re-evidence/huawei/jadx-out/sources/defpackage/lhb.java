package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealthservice.sync.dataswitch.HealthDataSwitch;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBase;
import com.huawei.hwcloudmodel.healthdatacloud.model.AddHealthDataReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataByTimeReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataByVersionReq;
import com.huawei.hwcloudmodel.model.unite.AddHealthDataRsp;
import com.huawei.hwcloudmodel.model.unite.GetHealthDataByTimeRsp;
import com.huawei.hwcloudmodel.model.unite.GetHealthDataByVersionRsp;
import com.huawei.hwcloudmodel.model.unite.HealthDetail;
import com.huawei.hwcloudmodel.model.unite.ParamValidDetail;
import com.huawei.hwcloudmodel.model.unite.SyncKey;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lhb implements HiSyncBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HiSyncOption f40123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private lfz f40124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kws f40125c;
    private HealthDataSwitch d;
    private kxe e;
    private List<SyncKey> f;
    private lqo g;
    private boolean h = false;
    private int i;
    private Context j;
    private List<Integer> k;
    private int l;
    private double m;
    private int n;
    private kxk o;

    private boolean a(int i) {
        return i == 7;
    }

    public lhb(Context context, HiSyncOption hiSyncOption, int i) throws lif {
        LogUtil.d("Debug_HiSyncHealthDataByUnite", "HiSyncHealthDataByUnite create");
        this.j = context.getApplicationContext();
        this.f40123a = hiSyncOption;
        this.i = i;
        d();
    }

    private void d() throws lif {
        if (this.j == null) {
            LogUtil.e("Debug_HiSyncHealthDataByUnite", "HiSyncHealthDataByUnite init");
            return;
        }
        this.h = liq.f();
        this.g = lqo.b(this.j);
        this.o = kxk.c();
        this.e = kxe.d(this.j);
        this.f40125c = kws.e(this.j);
        this.f40124b = lfz.d(this.j);
        this.d = new HealthDataSwitch(this.j);
        this.k = b();
        List<SyncKey> listB = lhp.b(this.j).b(this.k);
        this.f = listB;
        LogUtil.a("Debug_HiSyncHealthDataByUnite", "init syncKeys is ", listB);
    }

    private List<Integer> b() {
        return Arrays.asList(13, 14, 15, 21);
    }

    private void d(int i, long j, long j2) throws lif {
        LogUtil.d("Debug_HiSyncHealthDataByUnite", "downloadEachTypeByTime type is", Integer.valueOf(i), " startTime is ", Long.valueOf(j), " endTime is ", Long.valueOf(j2));
        GetHealthDataByTimeRsp getHealthDataByTimeRspA = this.g.a(b(i, j, j2));
        if (!lih.e(getHealthDataByTimeRspA, false)) {
            LogUtil.j("Debug_HiSyncHealthDataByUnite", "downloadEachTypeByTime error type is ", Integer.valueOf(i));
            return;
        }
        List<HealthDetail> detailInfos = getHealthDataByTimeRspA.getDetailInfos();
        if (detailInfos == null || detailInfos.isEmpty()) {
            LogUtil.j("Debug_HiSyncHealthDataByUnite", "downloadEachTypeByTime data error type is ", Integer.valueOf(i));
        } else {
            d(detailInfos, i, true);
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

    private void e() throws lif {
        this.m = 1.0d / ((double) this.f.size());
        Iterator<SyncKey> it = this.f.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    private void c(SyncKey syncKey) throws lif {
        if (syncKey == null) {
            return;
        }
        Integer type = syncKey.getType();
        int iIntValue = type.intValue();
        Long version = syncKey.getVersion();
        long jLongValue = version.longValue();
        LogUtil.d("Debug_HiSyncHealthDataByUnite", "downloadOneTypeDataByVersion type is ", type, ", maxVersion is ", version);
        if (jLongValue <= 0) {
            LogUtil.j("Debug_HiSyncHealthDataByUnite", "downloadOneTypeDataByVersion cloud has no such data, type is ", type);
            return;
        }
        GetHealthDataByVersionReq getHealthDataByVersionReq = new GetHealthDataByVersionReq();
        getHealthDataByVersionReq.setDataType(Integer.valueOf(this.f40123a.getSyncMethod()));
        getHealthDataByVersionReq.setType(type);
        kul kulVarA = this.o.a(this.i, 0L, iIntValue);
        if (kulVarA == null) {
            LogUtil.d("Debug_HiSyncHealthDataByUnite", " syncAnchorTable is null");
            getHealthDataByVersionReq.setVersion(0L);
            e(getHealthDataByVersionReq, jLongValue);
        } else if (kulVarA.h() < jLongValue) {
            getHealthDataByVersionReq.setVersion(kulVarA.h());
            e(getHealthDataByVersionReq, jLongValue);
        } else {
            LogUtil.a("Debug_HiSyncHealthDataByUnite", " do not need downloadOneTypeDataByVersion data, type is ", type, ", DBversion is ", Long.valueOf(kulVarA.h()), ", maxVersion is ", version);
        }
    }

    private void e(GetHealthDataByVersionReq getHealthDataByVersionReq, long j) throws lif {
        long jC;
        ReleaseLogUtil.d("HiH_HiSyncHlthDtByUn", " downloadOneTypeDataWithMaxVersion rep = ", getHealthDataByVersionReq, ", maxVersion = ", Long.valueOf(j));
        int i = 0;
        do {
            jC = c(getHealthDataByVersionReq);
            LogUtil.d("Debug_HiSyncHealthDataByUnite", " downloadOneTypeDataWithMaxVersion downCurrentVersion is ", Long.valueOf(jC), " maxVersion is ", Long.valueOf(j));
            i++;
            if (jC <= -1) {
                return;
            }
            if (!this.o.d(this.i, getHealthDataByVersionReq.getType().intValue(), jC, 0L)) {
                LogUtil.j("Debug_HiSyncHealthDataByUnite", "downloadOneTypeDataWithMaxVersion saveVersionToDB failed!");
                return;
            }
            getHealthDataByVersionReq.setVersion(jC);
            if (lgp.h() && !liq.h()) {
                LogUtil.j("HiH_HiSyncHlthDtByUn", " downloadOneTypeDataWithMaxVersion() backgroud is running");
                return;
            } else if (i >= 20) {
                LogUtil.j("Debug_HiSyncHealthDataByUnite", " downloadOneTypeDataWithMaxVersion() pullDataByVersion too many times");
                return;
            }
        } while (jC < j);
    }

    private long c(GetHealthDataByVersionReq getHealthDataByVersionReq) throws lif {
        GetHealthDataByVersionRsp getHealthDataByVersionRspB = this.g.b(getHealthDataByVersionReq);
        if (!lih.e(getHealthDataByVersionRspB, false)) {
            LogUtil.j("Debug_HiSyncHealthDataByUnite", "downOneTypeDataOnce() SyncError checkCloudRsp");
            return -1L;
        }
        long currentVersion = getHealthDataByVersionRspB.getCurrentVersion();
        if (currentVersion <= getHealthDataByVersionReq.getVersion()) {
            ReleaseLogUtil.e("Debug_HiSyncHealthDataByUnite", "downOneTypeDataOnce downloadVersion ", Long.valueOf(currentVersion), " smaller than currentVersion ", Long.valueOf(getHealthDataByVersionReq.getVersion()));
            return -1L;
        }
        List<HealthDetail> detailInfos = getHealthDataByVersionRspB.getDetailInfos();
        if (HiCommonUtil.b(detailInfos)) {
            ReleaseLogUtil.e("HiH_HiSyncHlthDtByUn", " downOneTypeDataOnce() detailInfos is null or empty");
            return currentVersion;
        }
        if (!d(detailInfos, getHealthDataByVersionReq.getType().intValue(), false)) {
            return -1L;
        }
        liz.a().d(getHealthDataByVersionReq.getType().intValue(), new kym(this.j.getPackageName()));
        return currentVersion;
    }

    private boolean d(List<HealthDetail> list, int i, boolean z) throws lif {
        List<HiHealthData> listA;
        LogUtil.d("Debug_HiSyncHealthDataByUnite", " saveData()");
        double size = list.size();
        ReleaseLogUtil.d("Debug_HiSyncHealthDataByUnite", " saveData() type:", Integer.valueOf(i), ", size:", Double.valueOf(size));
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList();
        Collections.sort(list, lir.b());
        for (HealthDetail healthDetail : list) {
            if (healthDetail != null && (listA = this.d.a(healthDetail, this.i)) != null && !listA.isEmpty()) {
                lis.b(this.j, 1.0d / size, this.m, 15.0d);
                if (liq.h() && !z && a(i)) {
                    lgx.a(this.j, listA, 10001, this.i);
                } else {
                    arrayList2.addAll(listA);
                    if (i == 7 || i == 3 || i == 9 || i == 13) {
                        arrayList.addAll(listA);
                    }
                }
            }
        }
        this.f40124b.saveSyncHealthDetailData(arrayList2, this.i);
        if (arrayList.isEmpty()) {
            return true;
        }
        this.f40124b.prepareRealTimeHealthDataStat(arrayList);
        this.f40124b.doRealTimeHealthDataStat();
        return true;
    }

    private void d(List<HiHealthData> list) {
        if (HiCommonUtil.b(list)) {
            LogUtil.d("Debug_HiSyncHealthDataByUnite", " uploadPointsOK() hiHealthDatas is null or empty");
            return;
        }
        for (HiHealthData hiHealthData : list) {
            this.e.b(hiHealthData.getDataId(), hiHealthData.getLong("modified_time"), 1);
            hiHealthData.setUserId(this.i);
        }
        this.f40124b.prepareRealTimeHealthDataStat(list);
        this.f40124b.doRealTimeHealthDataStat();
    }

    private boolean b(List<HiHealthData> list, int i, int i2, boolean z, boolean z2) throws lif {
        AddHealthDataRsp addHealthDataRspB;
        if (z || !this.h) {
            int i3 = this.n + 1;
            this.n = i3;
            liq.c(i3, this.f40123a.getSyncManual());
        } else {
            int i4 = this.n + 1;
            this.n = i4;
            if (5 < i4) {
                this.l += 2;
                return false;
            }
        }
        List<HealthDetail> listC = this.d.c(list, i, i2);
        if (HiCommonUtil.b(listC)) {
            LogUtil.j("Debug_HiSyncHealthDataByUnite", " addHealthData() healthDetails is null or empty cloudType is ", Integer.valueOf(i2), " clientId is ", Integer.valueOf(i));
            return false;
        }
        AddHealthDataReq addHealthDataReq = new AddHealthDataReq();
        addHealthDataReq.setTimeZone(list.get(0).getTimeZone());
        addHealthDataReq.setDetailInfo(listC);
        kul kulVarA = this.o.a(this.i, 0L, i2);
        if (kulVarA == null) {
            addHealthDataReq.setLocalMaxVersion(0L);
        } else {
            addHealthDataReq.setLocalMaxVersion(Long.valueOf(kulVarA.h()));
        }
        while (true) {
            if (this.l < 2) {
                addHealthDataRspB = this.g.b(addHealthDataReq);
                if (addHealthDataRspB != null && addHealthDataRspB.getResultCode().intValue() == 1001) {
                    ParamValidDetail paramValidDetail = addHealthDataRspB.getParamValidDetail();
                    liq.d(addHealthDataRspB, paramValidDetail);
                    if (paramValidDetail == null) {
                        this.l++;
                    } else {
                        liq.a(list, paramValidDetail, (Map<Long, List<Long>>) null);
                        break;
                    }
                } else if (!lih.e(addHealthDataRspB, false)) {
                    this.l++;
                } else {
                    ReleaseLogUtil.d("HiH_HiSyncHlthDtByUn", "addDataToCloud OK ! uploadCount is ", Integer.valueOf(this.n), " type is ", Integer.valueOf(i2), ", date size = ", Integer.valueOf(list.size()));
                    break;
                }
            } else {
                ReleaseLogUtil.d("HiH_HiSyncHlthDtByUn", "addDataToCloud failed ! uploadCount is ", Integer.valueOf(this.n), " type is ", Integer.valueOf(i2), ", date size = ", Integer.valueOf(list.size()));
                return false;
            }
        }
        if (z2) {
            b(list);
        } else {
            d(list);
        }
        c(addHealthDataReq, addHealthDataRspB, i2);
        return true;
    }

    private void c(AddHealthDataReq addHealthDataReq, AddHealthDataRsp addHealthDataRsp, int i) throws lif {
        ReleaseLogUtil.d("Debug_HiSyncHealthDataByUnite", "LocalMaxVersion()=", addHealthDataReq.getLocalMaxVersion(), ",rsp=", addHealthDataRsp.getTimestamp(), ",isHasMore()=", Boolean.valueOf(addHealthDataRsp.isHasMore()), ",cloudType=", Integer.valueOf(i));
        if (addHealthDataRsp.isHasMore()) {
            SyncKey syncKey = new SyncKey();
            syncKey.setType(Integer.valueOf(i));
            syncKey.setVersion(addHealthDataRsp.getTimestamp());
            c(syncKey);
            return;
        }
        if (this.o.d(this.i, i, addHealthDataRsp.getTimestamp().longValue(), 0L)) {
            return;
        }
        ReleaseLogUtil.e("HiH_HiSyncHlthDtByUn", "downloadMore saveVersionToDB failed!");
    }

    private void d(int i) throws lif {
        List<HiHealthData> listE;
        while (this.l < 2 && (listE = e(i)) != null && !listE.isEmpty() && b(listE, i, 15, false, true)) {
        }
        this.l = 0;
    }

    private void b(List<HiHealthData> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int iB = 0;
        for (HiHealthData hiHealthData : list) {
            long dataId = hiHealthData.getDataId();
            long j = hiHealthData.getLong("modified_time");
            if (this.f40125c.a(dataId, j)) {
                iB = this.f40125c.b(dataId, j);
            }
            LogUtil.a("Debug_HiSyncHealthDataByUnite", "uploadEcgDone sequenceID is ", Long.valueOf(dataId), " Time is ", HiDateUtil.l(hiHealthData.getCreateTime()), " modifiedTime is ", HiDateUtil.l(j), " update ans is ", Integer.valueOf(iB));
        }
    }

    private List<HiHealthData> e(int i) {
        return this.f40125c.b(i, 31001, 0, 10);
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByVersion() throws lif {
        ReleaseLogUtil.d("HiH_HiSyncHlthDtByUn", "pullDataByVersion() begin !");
        lis.b(15.0d, "SYNC_HEALTH_DATA_DOWNLOAD_PERCENT_MAX_ALL");
        LogUtil.d("Debug_HiSyncHealthDataByUnite", "pullDataByVersion() keys is ", this.f);
        if (HiCommonUtil.b(this.f)) {
            LogUtil.j("Debug_HiSyncHealthDataByUnite", "pullDataByVersion() keys is null,stop pullDataByVersion");
        } else {
            e();
        }
        lis.c(this.j);
        ReleaseLogUtil.d("HiH_HiSyncHlthDtByUn", "pullDataByVersion() end !");
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByTime(long j, long j2) throws lif {
        List<SyncKey> list = this.f;
        if (list == null || list.isEmpty()) {
            LogUtil.j("Debug_HiSyncHealthDataByUnite", "pullDataByTime() keys is null,stop pullDataByVersion");
            return;
        }
        for (SyncKey syncKey : this.f) {
            Integer type = syncKey.getType();
            int iIntValue = type.intValue();
            Long version = syncKey.getVersion();
            long jLongValue = version.longValue();
            LogUtil.d("Debug_HiSyncHealthDataByUnite", "pullDataByTime type is ", type, " maxVersion is ", version);
            if (jLongValue <= 0) {
                LogUtil.j("Debug_HiSyncHealthDataByUnite", "pullDataByTime cloud has no such data ,type is ", type);
            } else if (iIntValue == 7) {
                this.m = 1.0d;
                d(iIntValue, j, j2);
            }
        }
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pushData() throws lif {
        int size;
        ReleaseLogUtil.d("HiH_HiSyncHlthDtByUn", "pushData() begin !");
        if (!lgp.m()) {
            ReleaseLogUtil.e("HiH_HiSyncHlthDtByUn", "pushData() dataPrivacy switch is closed, push end !");
            return;
        }
        lis.b(2.0d, "SYNC_HEALTH_DATA_UPLOAD_PERCENT_MAX");
        List<Integer> listH = kwt.b().h(this.i);
        if (listH != null && !listH.isEmpty()) {
            LogUtil.a("HiH_HiSyncHlthDtByUn", "clientid list size =", Integer.valueOf(listH.size()));
            size = listH.size();
            e(listH);
        } else {
            LogUtil.j("Debug_HiSyncHealthDataByUnite", "pushData() end ! no client get, maybe no data need to pushData");
            size = 0;
        }
        if (size != 0) {
            lis.b(this.j, 1.0d, 1.0d / ((double) size), 2.0d);
        } else {
            LogUtil.e("HiH_HiSyncHlthDtByUn", "pushData() divide by zero !");
        }
        lis.c(this.j);
        ReleaseLogUtil.d("HiH_HiSyncHlthDtByUn", "pushData() end !");
    }

    private void e(List<Integer> list) throws lif {
        if (!this.h) {
            c(list);
            return;
        }
        g(list);
        this.n = 0;
        a(list);
    }

    private void g(List<Integer> list) throws lif {
        List<Integer> listB = this.e.b(Collections.singletonList(2109));
        if (HiCommonUtil.b(listB)) {
            return;
        }
        listB.retainAll(list);
        Iterator<Integer> it = listB.iterator();
        while (it.hasNext()) {
            e(2109, 21, it.next().intValue());
        }
    }

    private void e(int i, int i2, int i3) throws lif {
        while (this.l < 2) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf(i));
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<HiHealthData> listC = this.e.c(i3, arrayList, HiDateUtil.p(jCurrentTimeMillis), HiDateUtil.g(jCurrentTimeMillis));
            if (listC == null || listC.isEmpty() || !b(listC, i3, i2, true, false)) {
                break;
            }
        }
        this.l = 0;
    }

    private void d(int i, int i2, int i3) throws lif {
        while (this.l < 2) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf(i));
            List<HiHealthData> listC = this.e.c(i3, arrayList, 50);
            if (listC == null || listC.isEmpty() || !b(listC, i3, i2, false, false)) {
                break;
            }
        }
        this.l = 0;
    }

    private void c(List<Integer> list) throws lif {
        List<Integer> listD = this.f40125c.d(Collections.singletonList(31001));
        if (!HiCommonUtil.b(listD)) {
            listD.retainAll(list);
            Iterator<Integer> it = listD.iterator();
            while (it.hasNext()) {
                d(it.next().intValue());
            }
        }
        a(list);
    }

    private void a(List<Integer> list) throws lif {
        List<Integer> listE = this.e.e("client_id", 0);
        if (HiCommonUtil.b(listE)) {
            return;
        }
        list.retainAll(listE);
        if (HiCommonUtil.b(list)) {
            return;
        }
        for (Integer num : list) {
            d(2101, 13, num.intValue());
            d(2102, 14, num.intValue());
            d(2109, 21, num.intValue());
        }
    }

    public String toString() {
        return "--HiSyncHealthDataByUnite{}";
    }
}
