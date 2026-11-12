package defpackage;

import android.content.Context;
import android.os.Process;
import android.util.SparseArray;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealthservice.sync.dataswitch.CoreSleepSwitch;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBase;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthStatReq;
import com.huawei.hwcloudmodel.model.unite.GetHealthStatRsp;
import com.huawei.hwcloudmodel.model.unite.ProfessionalSleepTotal;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.ThermalCallback;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes10.dex */
public class lhh implements HiSyncBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HiSyncOption f40141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CoreSleepSwitch f40142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40143c;
    private Context d;
    private lqo e;
    private kxk i;
    private int j;

    public lhh(Context context, HiSyncOption hiSyncOption, int i) {
        LogUtil.d("HiH_HiSyncSleepStat", "HiSyncSleepStat create");
        this.d = context.getApplicationContext();
        this.f40141a = hiSyncOption;
        this.j = i;
        e();
    }

    private void e() {
        this.e = lqo.b(this.d);
        this.i = kxk.c();
        this.f40143c = HiDateUtil.d(System.currentTimeMillis());
        this.f40142b = new CoreSleepSwitch(this.d);
    }

    private void d(SparseArray<Integer> sparseArray, boolean z) throws lif {
        if (z) {
            LogUtil.d("HiH_HiSyncSleepStat", " downloadAllStat too much need to download, start a thread! downloadDaysMap is ", sparseArray);
            a(sparseArray);
        } else {
            LogUtil.d("HiH_HiSyncSleepStat", " downloadAllStat don't need to start a thread! downloadDaysMap = ", sparseArray);
            d(sparseArray);
        }
    }

    private void d(SparseArray<Integer> sparseArray) throws lif {
        LogUtil.d("HiH_HiSyncSleepStat", " downloadAllStatByTimeSync() downloadDaysMap = ", sparseArray);
        if (sparseArray == null || sparseArray.size() <= 0) {
            LogUtil.j("HiH_HiSyncSleepStat", " downloadAllStatByTimeSync() downloadDaysMap is null or empty, stop pullStat");
        } else {
            c(sparseArray);
        }
    }

    private void a(SparseArray<Integer> sparseArray) {
        if (sparseArray == null || sparseArray.size() <= 0) {
            LogUtil.j("HiH_HiSyncSleepStat", " downloadAllStatByTime() downloadDaysMap is null or empty, stop pullDataByVersion");
        } else {
            new Thread(new c(sparseArray)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(SparseArray<Integer> sparseArray) throws lif {
        LogUtil.d("HiH_HiSyncSleepStat", " performDownloadByTime ");
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            int iKeyAt = sparseArray.keyAt(size);
            e(iKeyAt, sparseArray.get(iKeyAt).intValue());
        }
    }

    private void e(int i, int i2) throws lif {
        if (i > i2 || i <= 0) {
            LogUtil.j("HiH_HiSyncSleepStat", "downloadCoreSleepStatByTime the time is not right");
            return;
        }
        ReleaseLogUtil.d("HiH_HiSyncSleepStat", "downloadCoreSleepStatByTime startTime is ", Integer.valueOf(i), " , endDay is ", Integer.valueOf(i2));
        GetHealthStatRsp getHealthStatRspD = d(i, i2);
        if (lih.e(getHealthStatRspD, false)) {
            List<ProfessionalSleepTotal> professionalSleepTotal = getHealthStatRspD.getProfessionalSleepTotal();
            this.i.b(this.j, 10009, i2, 0L);
            if (HiCommonUtil.b(professionalSleepTotal)) {
                LogUtil.j("HiH_HiSyncSleepStat", "downloadSleepStatByTime coreSleepStats is null or empty");
            } else {
                a(professionalSleepTotal);
            }
        }
    }

    private GetHealthStatRsp d(int i, int i2) {
        GetHealthStatReq getHealthStatReq = new GetHealthStatReq();
        getHealthStatReq.setStartTime(i);
        getHealthStatReq.setEndTime(i2);
        getHealthStatReq.setDataSource(2);
        getHealthStatReq.setDeviceCode(0L);
        HashSet hashSet = new HashSet(1);
        hashSet.add(9);
        getHealthStatReq.setTypes(hashSet);
        return this.e.a(getHealthStatReq);
    }

    private void a(List<ProfessionalSleepTotal> list) {
        if (c(this.f40142b.b(list, this.j)) == 0) {
            liz.a().a(3, "sync download", new kym(this.d.getPackageName()));
        }
    }

    private int c(Map<Integer, List<kuk>> map) {
        if (map == null || map.isEmpty()) {
            return 7;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, List<kuk>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            List<kuk> value = it.next().getValue();
            kuk kukVar = null;
            kuk kukVar2 = null;
            boolean z = false;
            boolean z2 = false;
            for (kuk kukVar3 : value) {
                if (kukVar3.g() == 44105) {
                    kuk kukVarB = kww.c(this.d).b(kukVar3.e(), kukVar3.g(), kukVar3.c());
                    z = kukVarB != null && kukVar3.l() < kukVarB.l();
                    kukVar = kukVar3;
                }
                if (kukVar3.g() == 44108) {
                    kuk kukVarB2 = kww.c(this.d).b(kukVar3.e(), kukVar3.g(), kukVar3.c());
                    boolean z3 = kukVarB2 != null && kukVar3.l() < kukVarB2.l();
                    kukVar2 = kukVar3;
                    z2 = z3;
                }
                if (kukVar != null && kukVar2 != null) {
                    break;
                }
            }
            if (kukVar == null && kukVar2 == null) {
                ReleaseLogUtil.d("HiH_HiSyncSleepStat", "saveCoreStatToDB Duration error");
            } else {
                e(z, z2, value);
                arrayList.addAll(value);
            }
        }
        return lfz.d(this.d).transferHealthStatData(arrayList);
    }

    private void e(boolean z, boolean z2, List<kuk> list) {
        if (z) {
            ReleaseLogUtil.d("HiH_HiSyncSleepStat", "filterLessSleepStat isLessSumDuration date:", Integer.valueOf(list.get(0).e()));
            Iterator<kuk> it = list.iterator();
            while (it.hasNext()) {
                kuk next = it.next();
                if (next.g() != 44108 && kww.c(this.d).b(next.e(), next.g(), next.c()) != null) {
                    it.remove();
                }
            }
        }
        if (z2) {
            ReleaseLogUtil.d("HiH_HiSyncSleepStat", "filterLessSleepStat isLessNoonDuration date:", Integer.valueOf(list.get(0).e()));
            list.removeIf(new Predicate() { // from class: lhi
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return lhh.a((kuk) obj);
                }
            });
        }
    }

    static /* synthetic */ boolean a(kuk kukVar) {
        return 44108 == kukVar.g();
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByVersion() throws lif {
        SparseArray<Integer> sparseArrayA;
        ReleaseLogUtil.d("HiH_HiSyncSleepStat", "pullDataByVersion() begin !");
        lis.b(1.0d, "SYNC_SLEEP_STAT_DOWNLOAD_PERCENT_MAX");
        long jA = HiDateUtil.a(this.f40143c);
        if (liq.h()) {
            LogUtil.d("HiH_HiSyncSleepStat", "pullDataByVersion() first sync pull all stat!");
            sparseArrayA = liq.a(1388509200000L, jA, 90);
        } else {
            kul kulVarA = this.i.a(this.j, 0L, 9);
            if (kulVarA == null || kulVarA.h() == 0 || kulVarA.h() > jA - HwExerciseConstants.TEN_DAY_SECOND) {
                sparseArrayA = liq.a(jA - HwExerciseConstants.TEN_DAY_SECOND, jA, 90);
            } else {
                sparseArrayA = liq.a(kulVarA.h(), jA, 90);
            }
        }
        d(sparseArrayA, false);
        lis.c(this.d);
        ReleaseLogUtil.d("HiH_HiSyncSleepStat", "pullDataByVersion() end!");
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pushData() throws lif {
        lhj.b(this.d).a(this.j, this.f40141a, this.f40142b);
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByTime(long j, long j2) throws lif {
        d(liq.a(j, j2, 90), false);
    }

    static class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        SparseArray<Integer> f40144b;
        private WeakReference<lhh> e;

        private c(lhh lhhVar, SparseArray<Integer> sparseArray) {
            this.f40144b = sparseArray;
            this.e = new WeakReference<>(lhhVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            lhh lhhVar = this.e.get();
            if (lhhVar == null) {
                LogUtil.j("HiH_HiSyncSleepStat", "StatDownloadRunnable() mSyncStat = null");
                return;
            }
            if (!BaseApplication.isRunningForeground()) {
                ThermalCallback.getInstance().controlThreadLevel(Collections.singletonList(Integer.valueOf(Process.myTid())), 1);
            }
            try {
                lhhVar.c(this.f40144b);
            } catch (lif e) {
                ReleaseLogUtil.a("HiH_HiSyncSleepStat", "downloadSleepStatByTime error ! e is ", e.getMessage());
            }
        }
    }

    public String toString() {
        return "--HiSyncSleepStat{}";
    }
}
