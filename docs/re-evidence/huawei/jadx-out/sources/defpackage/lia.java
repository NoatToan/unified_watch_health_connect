package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealthservice.sync.dataswitch.HealthDataSwitch;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBase;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lia implements HiSyncBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthDataSwitch f40185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kwo f40186c;
    private Context d;
    private lfz e;
    private int f;
    private HiSyncOption g;
    private kxk h;
    private HealthDataCloudFactory i;
    private int k;
    private int n;
    private List<Integer> l = new ArrayList();
    private boolean j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f40184a = false;

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByTime(long j, long j2) throws lif {
    }

    public lia(Context context, HiSyncOption hiSyncOption, int i) throws lif {
        this.d = context;
        this.g = hiSyncOption;
        this.f = i;
        a();
    }

    private void a() throws lif {
        if (this.d == null) {
            LogUtil.e("Debug_HiSyncBusinessData", "HiSyncBusinessData init context is null");
            return;
        }
        this.j = liq.f();
        this.h = kxk.c();
        this.f40186c = kwo.b();
        this.e = lfz.d(this.d);
        this.i = lqo.b(this.d).b();
        this.f40185b = new HealthDataSwitch(this.d);
        this.l = e();
    }

    private List<Integer> e() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(5000);
        arrayList.add(5001);
        return arrayList;
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByVersion() throws lif {
        LogUtil.a("Debug_HiSyncBusinessData", "pullBusinessDataByVersion() begin !");
        Map<Integer, Long> mapD = lhp.b(this.d).d(this.l);
        if (mapD == null || mapD.isEmpty()) {
            LogUtil.j("Debug_HiSyncBusinessData", "pullDataByVersion() keys is null,stop pullDataByVersion");
        } else {
            e(mapD);
        }
        LogUtil.a("Debug_HiSyncBusinessData", "pullBusinessDataByVersion() end !");
    }

    private void e(Map<Integer, Long> map) throws lif {
        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            Integer key = entry.getKey();
            int iIntValue = key.intValue();
            Long value = entry.getValue();
            long jLongValue = value.longValue();
            LogUtil.d("Debug_HiSyncBusinessData", "downloadOneTypeDataByVersion type is ", key, ", maxVersion is ", value);
            if (jLongValue <= 0) {
                LogUtil.j("Debug_HiSyncBusinessData", "downloadOneTypeDataByVersion cloud has no such data, type is ", key);
            } else {
                lhs lhsVar = new lhs();
                lhsVar.c(iIntValue);
                kul kulVarA = this.h.a(this.f, 0L, iIntValue);
                if (kulVarA == null) {
                    LogUtil.d("Debug_HiSyncBusinessData", " syncAnchorTable is null");
                    lhsVar.b(0L);
                    d(lhsVar, jLongValue);
                } else if (kulVarA.h() < jLongValue) {
                    lhsVar.b(kulVarA.h());
                    d(lhsVar, jLongValue);
                } else {
                    LogUtil.d("Debug_HiSyncBusinessData", " do not need downloadOneTypeDataByVersion data, type is ", key, ", DBversion is ", Long.valueOf(kulVarA.h()), ", maxVersion is ", value);
                }
            }
        }
    }

    private void d(lhs lhsVar, long j) throws lif {
        long jA;
        LogUtil.d("Debug_HiSyncBusinessData", " downloadOneTypeDataWithMaxVersion rep = ", lhsVar, ", maxVersion = ", Long.valueOf(j));
        int i = 0;
        do {
            jA = a(lhsVar);
            i++;
            if (jA <= -1) {
                return;
            }
            if (!this.h.d(this.f, lhsVar.b(), jA, 0L)) {
                LogUtil.j("Debug_HiSyncBusinessData", "downloadOneTypeDataWithMaxVersion saveVersionToDB failed!");
                return;
            }
            lhsVar.b(jA);
            if (lgp.h() && !liq.h()) {
                LogUtil.j("HiH_HiSyncBusinessData", " downloadOneTypeDataWithMaxVersion() backgroud is running");
                return;
            } else if (i >= 20) {
                LogUtil.j("Debug_HiSyncBusinessData", " downloadOneTypeDataWithMaxVersion() pullDataByVersion too many times");
                return;
            }
        } while (jA < j);
    }

    private long a(lhs lhsVar) throws lif {
        lhr lhrVar = (lhr) oet.d().e(lhsVar.getUrl(), this.i.getHeaders(), ofe.c(this.i.getBody(lhsVar)), lhr.class);
        if (!lih.e(lhrVar, false)) {
            LogUtil.j("Debug_HiSyncBusinessData", "downOneTypeDataOnce() SyncError checkCloudRsp");
            return -1L;
        }
        List<lhx> listA = lhrVar.a();
        if (listA == null || listA.isEmpty()) {
            LogUtil.j("Debug_HiSyncBusinessData", " downOneTypeDataOnce() extendedServiceDatas is null or empty");
            return -1L;
        }
        long jC = lhrVar.c();
        if (jC <= lhsVar.c()) {
            ReleaseLogUtil.e("Debug_HiSyncBusinessData", "downOneTypeDataOnce downloadVersion is ", Long.valueOf(jC), " smaller than currentVersion ", Long.valueOf(lhsVar.c()));
            return -1L;
        }
        if (c(listA)) {
            return jC;
        }
        return -1L;
    }

    private boolean c(List<lhx> list) {
        HiHealthData hiHealthDataE;
        LogUtil.d("Debug_HiSyncBusinessData", " BusinessData saveData()");
        ArrayList arrayList = new ArrayList(list.size());
        for (lhx lhxVar : list) {
            if (lhxVar != null && (hiHealthDataE = this.f40185b.e(lhxVar, this.f)) != null) {
                arrayList.add(hiHealthDataE);
            }
        }
        this.e.saveSyncHealthDetailData(arrayList, this.f);
        return true;
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pushData() throws lif {
        LogUtil.a("HiH_HiSyncBusinessData", "push BusinessData begin !");
        if (!lgp.m()) {
            LogUtil.j("Debug_HiSyncBusinessData", "pushData() dataPrivacy switch is closed ,can not pushData right now ,push end !");
            return;
        }
        if (this.j) {
            LogUtil.j("Debug_HiSyncBusinessData", "pushData() isOverSea ,push end !");
            return;
        }
        kym kymVarB = kwt.b().b(this.f, 0, 0);
        if (kymVarB == null) {
            LogUtil.j("Debug_HiSyncBusinessData", "hiHealthContext is null ,push end !");
            return;
        }
        int iC = kymVarB.c();
        Iterator<Integer> it = this.l.iterator();
        while (it.hasNext()) {
            b(iC, it.next().intValue());
        }
        if (!this.f40184a) {
            LogUtil.a("Debug_HiSyncBusinessData", "mHaveUploadData is false, push BusinessData end !");
            return;
        }
        Map<Integer, Long> mapD = lhp.b(this.d).d(this.l);
        if (mapD == null || mapD.isEmpty()) {
            LogUtil.j("Debug_HiSyncBusinessData", "downloadTwice error twiceSyncVersion");
        } else {
            e(mapD);
            LogUtil.a("Debug_HiSyncBusinessData", "push BusinessData end !");
        }
    }

    private void b(int i, int i2) throws lif {
        while (this.n < 2) {
            LogUtil.a("Debug_HiSyncBusinessData", "push uploadBusinessData clientId ,", Integer.valueOf(i));
            List<HiHealthData> listA = a(i, lik.c(i2));
            if (HiCommonUtil.b(listA) || !c(listA, i, i2)) {
                break;
            }
            b(listA);
            this.f40184a = true;
        }
        this.n = 0;
    }

    private List<HiHealthData> a(int i, int i2) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(i2));
        return this.f40186c.d(i, arrayList, 0, 50);
    }

    private boolean c(List<HiHealthData> list, int i, int i2) throws lif {
        if (!this.j) {
            int i3 = this.k + 1;
            this.k = i3;
            liq.c(i3, this.g.getSyncManual());
        } else {
            int i4 = this.k + 1;
            this.k = i4;
            if (5 < i4) {
                this.n += 2;
                return false;
            }
        }
        List<lhx> listC = this.f40185b.c(list, i2);
        if (listC == null || listC.isEmpty()) {
            LogUtil.j("Debug_HiSyncBusinessData", " addHealthData() extendedServiceDataList is null or empty cloudType is ", Integer.valueOf(i2), " clientId is ", Integer.valueOf(i));
            return false;
        }
        lhu lhuVar = new lhu();
        lhuVar.d(listC);
        while (this.n < 2) {
            if (!lih.e((lhy) oet.d().e(lhuVar.getUrl(), this.i.getHeaders(), ofe.c(this.i.getBody(lhuVar)), lhy.class), false)) {
                this.n++;
            } else {
                ReleaseLogUtil.d("Debug_HiSyncBusinessData", "addBusinessData OK ! uploadCount is ", Integer.valueOf(this.k), " type is ", Integer.valueOf(i2), ", date size = ", Integer.valueOf(list.size()));
                return true;
            }
        }
        ReleaseLogUtil.d("Debug_HiSyncBusinessData", "addBusinessData failed ! uploadCount is ", Integer.valueOf(this.k), " type is ", Integer.valueOf(i2), ", date size = ", Integer.valueOf(list.size()));
        return false;
    }

    private void b(List<HiHealthData> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int iD = 0;
        for (HiHealthData hiHealthData : list) {
            long dataId = hiHealthData.getDataId();
            long j = hiHealthData.getLong("modified_time");
            if (this.f40186c.b(dataId, j)) {
                iD = this.f40186c.d(dataId, j);
            }
            LogUtil.a("Debug_HiSyncBusinessData", "uploadBusinessDataDone dataId is ", Long.valueOf(dataId), " Time is ", HiDateUtil.l(hiHealthData.getCreateTime()), " modifiedTime is ", HiDateUtil.l(j), " update ans is ", Integer.valueOf(iD));
        }
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
