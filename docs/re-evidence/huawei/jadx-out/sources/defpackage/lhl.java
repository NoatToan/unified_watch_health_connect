package defpackage;

import android.content.Context;
import android.os.Process;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hihealthservice.sync.dataswitch.SportStatSwitch;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBase;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetSportStatReq;
import com.huawei.hwcloudmodel.model.SportTotalData;
import com.huawei.hwcloudmodel.model.unite.GetSportStatRsp;
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
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lhl implements HiSyncBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f40149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40151c;
    private HiSyncOption d;
    private lqo e;
    private HiDataReadOption f;
    private kxk h;
    private SportStatSwitch j;

    public lhl(Context context, HiSyncOption hiSyncOption, int i) {
        LogUtil.d("HiH_HiSyncTtlSptStat", "HiSyncSportStat create");
        this.f40149a = context.getApplicationContext();
        this.d = hiSyncOption;
        this.f40150b = i;
        e();
    }

    private void e() {
        this.e = lqo.b(this.f40149a);
        this.j = new SportStatSwitch(this.f40149a);
        this.h = kxk.c();
        this.f40151c = HiDateUtil.d(System.currentTimeMillis());
        this.f = a();
    }

    private void a(SparseArray<Integer> sparseArray, boolean z) throws lif {
        if (z) {
            LogUtil.d("HiH_HiSyncTtlSptStat", "downloadAllStat too much need to download ,start a thread ! downloadDaysMap is ", sparseArray);
            c(sparseArray);
            return;
        }
        LogUtil.d("HiH_HiSyncTtlSptStat", "downloadAllStat do not need to start a thread ! downloadDaysMap is ", sparseArray);
        a(sparseArray);
        HiBroadcastUtil.e(this.f40149a, 1);
        HiBroadcastUtil.h(this.f40149a);
        liz.a().a(1, "HiSyncTotalSportStat", new kym(this.f40149a.getPackageName()));
    }

    private void a(SparseArray<Integer> sparseArray) throws lif {
        LogUtil.d("HiH_HiSyncTtlSptStat", "downloadAllStatByTimeSync downloadDaysMap is ", sparseArray);
        if (sparseArray == null || sparseArray.size() <= 0) {
            LogUtil.j("HiH_HiSyncTtlSptStat", "downloadAllStatByTimeSync() downloadDaysMap is null,stop pullStat");
        } else {
            e(sparseArray);
        }
    }

    private void c(SparseArray<Integer> sparseArray) {
        if (sparseArray == null || sparseArray.size() <= 0) {
            LogUtil.j("HiH_HiSyncTtlSptStat", "downloadAllStatByTime() downloadDaysMap is null,stop pullDataByVersion");
        } else {
            new Thread(new b(sparseArray)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(SparseArray<Integer> sparseArray) throws lif {
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            int iKeyAt = sparseArray.keyAt(size);
            a(iKeyAt, sparseArray.get(iKeyAt).intValue());
            lis.b(this.f40149a, 1.0d, 1.0d, 1.0d);
        }
        lkd.d().d(this.f40149a, this.f40150b);
    }

    private void a(int i, int i2) throws lif {
        if (i > i2 || i <= 0) {
            LogUtil.j("HiH_HiSyncTtlSptStat", "downloadOneStatByTime the time is not right");
            return;
        }
        ReleaseLogUtil.d("HiH_HiSyncTtlSptStat", "downloadOneStatByTime startTime is ", Integer.valueOf(i), " , endTime is ", Integer.valueOf(i2));
        GetSportStatReq getSportStatReq = new GetSportStatReq();
        getSportStatReq.setStartTime(Integer.valueOf(i));
        getSportStatReq.setEndTime(Integer.valueOf(i2));
        getSportStatReq.setDataSource(3);
        GetSportStatRsp getSportStatRspD = this.e.d(getSportStatReq);
        if (lih.e(getSportStatRspD, false)) {
            this.h.b(this.f40150b, this.d.getSyncDataType(), i2, 0L);
            List<SportTotalData> sportStat = getSportStatRspD.getSportStat();
            if (HiCommonUtil.b(sportStat)) {
                LogUtil.j("HiH_HiSyncTtlSptStat", "downloadOneStatByTime sportsStat is null or empty");
            } else {
                d(sportStat);
            }
        }
    }

    private void d(List<SportTotalData> list) {
        LogUtil.d("HiH_HiSyncTtlSptStat", "saveSportTotalToDB sportsStat size=", Integer.valueOf(list.size()));
        b(list);
        LogUtil.d("HiH_HiSyncTtlSptStat", "saveSportTotalToDB check after sportsStat size=", Integer.valueOf(list.size()));
        List<kuk> listC = this.j.c(list, this.f40150b);
        List<HiHealthData> listA = this.j.a(list, this.f40150b);
        int iTransferHealthStatData = lfz.d(this.f40149a).transferHealthStatData(listC);
        lfz.d(this.f40149a).saveSyncHealthDetailData(listA, this.f40150b);
        if (iTransferHealthStatData == 0) {
            liz.a().a(1, "sync download", new kym(this.f40149a.getPackageName()));
        }
    }

    private void b(List<SportTotalData> list) {
        ArrayList<SportTotalData> arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (SportTotalData sportTotalData : list) {
            if (sportTotalData != null) {
                if (sportTotalData.getSportType().intValue() != 0) {
                    LogUtil.j("HiH_HiSyncTtlSptStat", "saveSportTotalToDB the sport stat type is not right ,type is ", sportTotalData.getSportType());
                } else if (0 == sportTotalData.getDeviceCode().longValue()) {
                    if (sportTotalData.getDataSource().intValue() == 0) {
                        arrayList.add(sportTotalData);
                    } else {
                        arrayList2.add(sportTotalData);
                    }
                }
            }
        }
        for (SportTotalData sportTotalData2 : arrayList) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((SportTotalData) it.next()).getRecordDay().equals(sportTotalData2.getRecordDay())) {
                    LogUtil.a("HiH_HiSyncTtlSptStat", "saveSportTotalToDB app and cloud has same day stat, day= ", sportTotalData2.getRecordDay());
                    list.remove(sportTotalData2);
                    break;
                }
            }
        }
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByVersion() throws lif {
        SparseArray<Integer> sparseArrayA;
        ReleaseLogUtil.d("HiH_HiSyncTtlSptStat", "pullDataByVersion() begin !");
        lis.b(1.0d, "SYNC_SPORT_STAT_DOWNLOAD_PERCENT_MAX");
        long jA = HiDateUtil.a(this.f40151c);
        if (liq.h()) {
            LogUtil.d("HiH_HiSyncTtlSptStat", "pullDataByVersion() first sync pull all stat!");
            sparseArrayA = liq.a(1388509200000L, jA, 90);
        } else {
            LogUtil.d("HiH_HiSyncTtlSptStat", "pullDataByVersion() only pullDataByVersion recent stat!");
            sparseArrayA = liq.a(jA - HwExerciseConstants.TEN_DAY_SECOND, jA, 90);
        }
        a(sparseArrayA, false);
        lis.c(this.f40149a);
        ReleaseLogUtil.d("HiH_HiSyncTtlSptStat", "pullDataByVersion() end!");
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByTime(long j, long j2) throws lif {
        a(liq.a(j, j2, 90), false);
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pushData() throws lif {
        lhn.e(this.f40149a).a(this.f40150b, this.f, this.d, this.j);
    }

    private HiDataReadOption a() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        int[] iArr = {901, 902, 903, 904, 905, TypedValues.Custom.TYPE_REFERENCE, 907};
        hiDataReadOption.setConstantsKey(new String[]{"deviceStepStat", "deviceDistanceStat", "deviceCalorieStat", "deviceAltitudeStat", "deviceFloorStat", "deviceDurationStat", "deviceStatPushes"});
        hiDataReadOption.setType(iArr);
        return hiDataReadOption;
    }

    static class b implements Runnable {
        private WeakReference<lhl> d;
        SparseArray<Integer> e;

        private b(lhl lhlVar, SparseArray<Integer> sparseArray) {
            this.e = sparseArray;
            this.d = new WeakReference<>(lhlVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            lhl lhlVar = this.d.get();
            if (lhlVar == null) {
                LogUtil.j("HiH_HiSyncTtlSptStat", "StatDownloadRunnable() mSyncStat = null");
                return;
            }
            try {
                if (!BaseApplication.isRunningForeground()) {
                    ThermalCallback.getInstance().controlThreadLevel(Collections.singletonList(Integer.valueOf(Process.myTid())), 1);
                }
                lhlVar.e(this.e);
                liq.i(lhlVar.f40149a, 10004);
            } catch (lif e) {
                ReleaseLogUtil.a("HiH_HiSyncTtlSptStat", "downloadOneStatByTime error ! e is ", e.getMessage());
            }
        }
    }

    public String toString() {
        return "--HiSyncTotalSportStat{}";
    }
}
