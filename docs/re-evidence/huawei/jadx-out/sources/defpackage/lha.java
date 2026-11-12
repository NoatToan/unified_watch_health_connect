package defpackage;

import android.content.Context;
import android.os.Process;
import android.util.SparseArray;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.data.constant.HiHealthDataKey;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.sync.dataswitch.SportStatSwitch;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBase;
import com.huawei.hwcloudmodel.healthdatacloud.model.AddSportTotalReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetSportDimenStatisticsReq;
import com.huawei.hwcloudmodel.model.SportTotalData;
import com.huawei.hwcloudmodel.model.unite.GetSportDimenStatRsp;
import com.huawei.hwcloudmodel.model.unite.SportTotal;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.ThermalCallback;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lha implements HiSyncBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kwt f40118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private lqo f40120c;
    private int d;
    private HiSyncOption e;
    private SportStatSwitch f;
    private Context h;
    private int i;
    private kxk j;
    private int g = 0;
    private int n = 0;

    public lha(Context context, HiSyncOption hiSyncOption, int i) {
        this.f40119b = false;
        LogUtil.d("Debug_HiSyncDimenSportStat", "HiSyncSportStat create");
        this.h = context.getApplicationContext();
        this.e = hiSyncOption;
        this.i = i;
        c();
        this.f40119b = liq.f();
    }

    private void c() {
        this.f40120c = lqo.b(this.h);
        this.f = new SportStatSwitch(this.h);
        this.f40118a = kwt.b();
        this.j = kxk.c();
        this.d = HiDateUtil.d(System.currentTimeMillis());
    }

    private GetSportDimenStatRsp b(GetSportDimenStatisticsReq getSportDimenStatisticsReq) {
        return this.f40120c.b(getSportDimenStatisticsReq);
    }

    private void e(SparseArray<Integer> sparseArray, boolean z) throws lif {
        if (z) {
            LogUtil.d("Debug_HiSyncDimenSportStat", "downloadAllStat too much need to download ,start a thread ! downloadDaysMap is ", sparseArray);
            a(sparseArray);
        } else {
            LogUtil.d("Debug_HiSyncDimenSportStat", "downloadAllStat do not need to start a thread ! downloadDaysMap is ", sparseArray);
            e(sparseArray);
        }
    }

    private void e(SparseArray<Integer> sparseArray) throws lif {
        LogUtil.d("Debug_HiSyncDimenSportStat", "downloadAllStatByTimeSync downloadDaysMap is ", sparseArray);
        if (sparseArray == null || sparseArray.size() <= 0) {
            LogUtil.j("Debug_HiSyncDimenSportStat", "downloadAllStatByTimeSync() downloadDaysMap is null, stop pullStat!");
        } else {
            d(sparseArray);
        }
    }

    private void a(SparseArray<Integer> sparseArray) {
        if (sparseArray == null || sparseArray.size() <= 0) {
            LogUtil.j("Debug_HiSyncDimenSportStat", "downloadAllStatByTime() downloadDaysMap is null, stop pullDataByVersion!");
        } else {
            new Thread(new c(this, sparseArray)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(SparseArray<Integer> sparseArray) throws lif {
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            int iKeyAt = sparseArray.keyAt(size);
            a(iKeyAt, sparseArray.get(iKeyAt).intValue());
        }
    }

    private void a(int i, int i2) throws lif {
        if (i > i2 || i <= 0) {
            LogUtil.j("Debug_HiSyncDimenSportStat", "downloadOneStatByTime the time is not right!");
            return;
        }
        LogUtil.d("Debug_HiSyncDimenSportStat", "downloadOneStatByTime startTime is ", Integer.valueOf(i), " , endTime is ", Integer.valueOf(i2));
        GetSportDimenStatisticsReq getSportDimenStatisticsReq = new GetSportDimenStatisticsReq();
        getSportDimenStatisticsReq.setStartTime(Integer.valueOf(i));
        getSportDimenStatisticsReq.setEndTime(Integer.valueOf(i2));
        GetSportDimenStatRsp getSportDimenStatRspB = b(getSportDimenStatisticsReq);
        if (lih.e(getSportDimenStatRspB, false)) {
            List<SportTotalData> sportStat = getSportDimenStatRspB.getSportStat();
            this.j.b(this.i, this.e.getSyncDataType(), i2, 0L);
            if (sportStat == null || sportStat.isEmpty()) {
                LogUtil.j("Debug_HiSyncDimenSportStat", "downloadOneStatByTime stringListMap is null or empty");
            } else {
                b(sportStat);
            }
        }
    }

    private void b(List<SportTotalData> list) {
        List<kuk> listC = this.f.c(this.f.d(list), this.i);
        List<HiHealthData> listA = this.f.a(list, this.i);
        int iTransferHealthStatData = lfz.d(this.h).transferHealthStatData(listC);
        lfz.d(this.h).saveSyncHealthDetailData(listA, this.i);
        if (iTransferHealthStatData == 0) {
            liz.a().a(1, "sync download", new kym(this.h.getPackageName()));
        }
    }

    private boolean e(List<HiHealthData> list) throws lif {
        if (!this.f40119b) {
            int i = this.n + 1;
            this.n = i;
            liq.c(i, this.e.getSyncManual());
        } else {
            int i2 = this.n + 1;
            this.n = i2;
            if (i2 > 3) {
                this.g += 2;
                return false;
            }
        }
        List<SportTotal> listA = this.f.a(list);
        if (listA.isEmpty()) {
            this.g++;
            LogUtil.j("Debug_HiSyncDimenSportStat", "addDimenSportStat sportTotals is null or empty");
            return false;
        }
        AddSportTotalReq addSportTotalReq = new AddSportTotalReq();
        addSportTotalReq.setTotalInfo(listA);
        addSportTotalReq.setTimeZone(list.get(0).getTimeZone());
        while (this.g < 2) {
            if (!lih.e(this.f40120c.b(addSportTotalReq), false)) {
                this.g++;
            } else {
                ReleaseLogUtil.d("Debug_HiSyncDimenSportStat", "addDimenSportStat success ! uploadCount is ", Integer.valueOf(this.n));
                LogUtil.a("Debug_HiSyncDimenSportStat", "stat is ", HiJsonUtil.d(listA));
                return true;
            }
        }
        ReleaseLogUtil.d("Debug_HiSyncDimenSportStat", "addDimenSportStat failed ! uploadCount is ", Integer.valueOf(this.n));
        return false;
    }

    public void b(int i) throws lif {
        List<HiHealthData> listD;
        while (this.g < 2 && (listD = d(i)) != null && !listD.isEmpty()) {
            if (e(listD)) {
                liq.e(this.h, listD, HiHealthDataType.n(), i);
            }
        }
        this.g = 0;
    }

    private List<HiHealthData> d(int i) {
        int[] iArr = new int[2];
        if (!this.f40119b) {
            iArr[0] = 50;
            iArr[1] = 0;
            return liq.a(this.h, i, HiHealthDataType.n(), HiHealthDataKey.d(), iArr);
        }
        iArr[0] = 50;
        iArr[1] = 1;
        return liq.a(this.h, i, HiHealthDataType.n(), HiHealthDataKey.d(), iArr);
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByVersion() throws lif {
        SparseArray<Integer> sparseArrayA;
        LogUtil.a("Debug_HiSyncDimenSportStat", "pullDataByVersion() begin !");
        lis.b(1.0d, "SYNC_DIMEN_SPORT_STAT_DOWNLOAD_PERCENT_MAX");
        long jA = HiDateUtil.a(this.d);
        if (liq.h()) {
            LogUtil.d("Debug_HiSyncDimenSportStat", "pullDataByVersion() first sync pull all stat");
            sparseArrayA = liq.a(1388509200000L, jA, 90);
        } else {
            LogUtil.d("Debug_HiSyncDimenSportStat", "pullDataByVersion() only pullDataByVersion recent stat");
            sparseArrayA = liq.a(jA - HwExerciseConstants.TEN_DAY_SECOND, jA, 90);
        }
        e(sparseArrayA, false);
        lis.c(this.h);
        LogUtil.a("Debug_HiSyncDimenSportStat", "pullDataByVersion() end !");
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pushData() throws lif {
        LogUtil.a("Debug_HiSyncDimenSportStat", "pushData() begin !");
        if (!lgp.n()) {
            LogUtil.j("Debug_HiSyncDimenSportStat", "pushData() dataPrivacy switch is closed ,can not pushData right now ,push end !");
            return;
        }
        lis.b(5.0d, "SYNC_SPORT_STAT_DOWNLOAD_PERCENT_MAX");
        int iG = this.f40118a.g(this.i);
        if (iG <= 0) {
            LogUtil.j("Debug_HiSyncDimenSportStat", "pushData() no statClient get, maybe no data need to pushData");
        } else {
            b(iG);
        }
        lis.c(this.h);
        LogUtil.a("Debug_HiSyncDimenSportStat", "pushData() end !");
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByTime(long j, long j2) throws lif {
        a(liq.a(j, j2, 90));
    }

    static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SparseArray<Integer> f40121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<lha> f40122b;

        public c(lha lhaVar, SparseArray<Integer> sparseArray) {
            this.f40121a = sparseArray;
            this.f40122b = new WeakReference<>(lhaVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            lha lhaVar = this.f40122b.get();
            if (lhaVar == null) {
                LogUtil.j("Debug_HiSyncDimenSportStat", "StatDownloadRunnable() mSyncStat = null");
                return;
            }
            if (!BaseApplication.isRunningForeground()) {
                ThermalCallback.getInstance().controlThreadLevel(Collections.singletonList(Integer.valueOf(Process.myTid())), 1);
            }
            try {
                lhaVar.d(this.f40121a);
            } catch (lif e) {
                ReleaseLogUtil.a("HiH_HiSyncDimenSportStat", "downloadOneStatByTime error ! e is ", e.getMessage());
            }
        }
    }

    public String toString() {
        return "--HiSyncSportStat{}";
    }
}
