package defpackage;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiConfigDataType;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hihealthservice.db.helper.HiHealthDBHelper;
import com.huawei.hihealthservice.store.interfaces.IDataInsert;
import com.huawei.hihealthservice.store.stat.HiBloodOxygenSaturationStat;
import com.huawei.hihealthservice.store.stat.HiConfigDataStat;
import com.huawei.hihealthservice.store.stat.HiCoreSleepStat;
import com.huawei.hihealthservice.store.stat.HiDicHealthDataStat;
import com.huawei.hihealthservice.store.stat.HiExerciseIntensityStat;
import com.huawei.hihealthservice.store.stat.HiHeartRateAndRestHeartRateStat;
import com.huawei.hihealthservice.store.stat.HiHeartRateUpStat;
import com.huawei.hihealthservice.store.stat.HiNewStressStat;
import com.huawei.hihealthservice.store.stat.HiPpgStat;
import com.huawei.hihealthservice.store.stat.HiSleepStat;
import com.huawei.hihealthservice.store.stat.HiSportStat;
import com.huawei.hihealthservice.store.stat.HiStatCommon;
import com.huawei.hihealthservice.store.stat.HiStressAndRelaxtionStat;
import com.huawei.hihealthservice.store.stat.HiTrackStat;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes10.dex */
public class lfz implements IDataInsert {
    private static Context e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Queue<HiHealthData> f40069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BlockingQueue<HiHealthData> f40070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private lfx f40071c;
    private ExecutorService d;
    private kyj f;

    /* synthetic */ lfz(AnonymousClass3 anonymousClass3) {
        this();
    }

    private lfz() {
        this.f40069a = new ConcurrentLinkedQueue();
        this.f40070b = new PriorityBlockingQueue();
        this.f = kyj.c();
        this.d = Executors.newSingleThreadExecutor();
        this.f40071c = lfx.b(e);
    }

    static class e {
        private static final lfz d = new lfz(null);
    }

    public static lfz d(Context context) {
        if (context != null) {
            e = context.getApplicationContext();
        }
        return e.d;
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataInsert
    public int transferHealthStatData(List<kuk> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("HiH_HiHlhDtIns", "transferHealthStatData statTables is null");
            return 7;
        }
        LogUtil.d("HiH_HiHlhDtIns", "transferHealthStatData() statTables size = ", Integer.valueOf(list.size()));
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<kuk> listC = ljq.c(e, list);
        List<kuk> listE = ljq.e(e, list);
        int iC = c(listC);
        int iC2 = c(listE);
        if (iC2 != 0) {
            iC = iC2;
        }
        LogUtil.d("HiH_HiHlhDtIns", "transferHealthStatData() end totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return iC;
    }

    private int c(List<kuk> list) throws Throwable {
        Exception e2;
        boolean zB;
        if (list != null) {
            boolean zIsEmpty = list.isEmpty();
            try {
                if (!zIsEmpty) {
                    try {
                        zB = !ljq.h(e, list.get(0).g()) ? ljq.b(e, list.get(0).g()) : false;
                        try {
                            int i = 0;
                            for (kuk kukVar : list) {
                                if (!ljq.d(e, kukVar.g()).b(kukVar)) {
                                    i = 4;
                                }
                            }
                            if (zB) {
                                ljq.g(e, list.get(0).g());
                            }
                            if (zB) {
                                ljq.c(e, list.get(0).g());
                            }
                            return i;
                        } catch (Exception e3) {
                            e2 = e3;
                            ReleaseLogUtil.e("HiH_HiHlhDtIns", "transferHealthStatData Exception", LogAnonymous.b(e2));
                            if (!zB) {
                                return 11;
                            }
                            ljq.c(e, list.get(0).g());
                            return 11;
                        }
                    } catch (Exception e4) {
                        e2 = e4;
                        zB = false;
                    } catch (Throwable th) {
                        th = th;
                        zIsEmpty = false;
                        if (zIsEmpty) {
                            ljq.c(e, list.get(0).g());
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return 0;
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataInsert
    public int transferHealthDetailData(List<HiHealthData> list, int i) {
        if (list == null || list.isEmpty() || i <= 0) {
            LogUtil.j("HiH_HiHlhDtIns", "transferHealthDetailData datas is null or who <= 0");
            return 7;
        }
        LogUtil.d("HiH_HiHlhDtIns", "transferHealthDetailData() data size = ", Integer.valueOf(list.size()));
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<Integer> listC = this.f.c(i);
        if (listC == null || listC.isEmpty()) {
            LogUtil.e("HiH_HiHlhDtIns", "transferHealthDetailData() clients == null or clients.isEmpty ()");
            return 10;
        }
        List<HiHealthData> listA = ljq.a(e, list);
        List<HiHealthData> listB = ljq.b(e, list);
        int iE = e(listA, i, listC);
        int iE2 = e(listB, i, listC);
        if (iE2 != 0) {
            iE = iE2;
        }
        LogUtil.d("HiH_HiHlhDtIns", "transferHealthDetailData() end totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return iE;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00af  */
    private int e(List<HiHealthData> list, int i, List<Integer> list2) throws Throwable {
        boolean zB;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        try {
            try {
                zB = !ljq.h(e, list.get(0).getType()) ? ljq.b(e, list.get(0).getType()) : false;
                int i2 = 0;
                int i3 = 0;
                while (i2 < list.size()) {
                    try {
                        HiHealthData hiHealthData = list.get(i2);
                        int clientId = hiHealthData.getClientId();
                        hiHealthData.setLastDataFlag(i2 == list.size() - 1);
                        if (!this.f40071c.a(hiHealthData, clientId, list2, i, 0)) {
                            i3 = 4;
                        }
                        i2++;
                    } catch (Exception e2) {
                        e = e2;
                        ReleaseLogUtil.e("HiH_HiHlhDtIns", "transferHealthDetailData() e = ", e);
                        if (!zB) {
                            return 11;
                        }
                        ljq.c(e, list.get(0).getType());
                        return 11;
                    }
                }
                if (zB) {
                    ljq.g(e, list.get(0).getType());
                }
                if (zB) {
                    ljq.c(e, list.get(0).getType());
                }
                return i3;
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    ljq.c(e, list.get(0).getType());
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                ljq.c(e, list.get(0).getType());
            }
            throw th;
        }
    }

    public int e(List<HiHealthData> list, int i) {
        if (list == null) {
            return 7;
        }
        return this.f40071c.c(list, i);
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataInsert
    public int saveSyncHealthDetailData(List<HiHealthData> list, int i) {
        if (list == null || list.isEmpty() || i <= 0) {
            LogUtil.j("HiH_HiHlhDtIns", "saveSyncHealthDetailData datas is null or who <= 0");
            return 7;
        }
        LogUtil.d("HiH_HiHlhDtIns", "saveSyncHealthDetailData() datas size is = ", Integer.valueOf(list.size()));
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<Integer> listC = this.f.c(i);
        if (listC == null || listC.isEmpty()) {
            LogUtil.e("HiH_HiHlhDtIns", "saveSyncHealthDetailData() null or clients ||clients.isEmpty ()");
            return 10;
        }
        List<HiHealthData> listA = ljq.a(e, list);
        List<HiHealthData> listB = ljq.b(e, list);
        int iA = a(listA, i, listC);
        int iA2 = a(listB, i, listC);
        if (iA2 != 0) {
            iA = iA2;
        }
        LogUtil.d("HiH_HiHlhDtIns", "saveSyncHealthDetailData() end totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ", errorCode = ", Integer.valueOf(iA));
        return iA;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bd  */
    private int a(List<HiHealthData> list, int i, List<Integer> list2) throws Throwable {
        boolean zB;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        try {
            zB = !ljq.h(e, list.get(0).getType()) ? ljq.b(e, list.get(0).getType()) : false;
            int i2 = 0;
            int i3 = 0;
            while (i2 < list.size()) {
                try {
                    try {
                        HiHealthData hiHealthData = list.get(i2);
                        int clientId = hiHealthData.getClientId();
                        hiHealthData.setSyncStatus(1);
                        hiHealthData.setLastDataFlag(i2 == list.size() - 1);
                        if (!this.f40071c.a(hiHealthData, clientId, list2, i, 0)) {
                            i3 = 4;
                        }
                        liq.d(i2, BaseApplication.h());
                        i2++;
                    } catch (Exception e2) {
                        e = e2;
                        ReleaseLogUtil.e("HiH_HiHlhDtIns", "saveSyncHealthDetailData Exception", LogAnonymous.b(e));
                        if (!zB) {
                            return 11;
                        }
                        ljq.c(e, list.get(0).getType());
                        return 11;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (zB) {
                        ljq.c(e, list.get(0).getType());
                    }
                    throw th;
                }
            }
            if (zB) {
                ljq.g(e, list.get(0).getType());
            }
            if (zB) {
                ljq.c(e, list.get(0).getType());
            }
            return i3;
        } catch (Exception e3) {
            e = e3;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            zB = false;
            if (zB) {
                ljq.c(e, list.get(0).getType());
            }
            throw th;
        }
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataInsert
    public boolean saveOneSyncHealthDetailData(HiHealthData hiHealthData, int i, List<Integer> list) {
        if (list == null || list.isEmpty() || i <= 0) {
            ReleaseLogUtil.e("HiH_HiHlhDtIns", "saveOneSyncHealthDetailData clients is null or who <= 0");
            return false;
        }
        int clientId = hiHealthData.getClientId();
        hiHealthData.setSyncStatus(1);
        return this.f40071c.a(hiHealthData, clientId, list, i, 0);
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataInsert
    public int bulkSaveDetailHiHealthData(List<HiHealthData> list, kym kymVar, int i) throws Throwable {
        if (list == null || list.isEmpty() || kymVar == null || kymVar.b() < 0) {
            ReleaseLogUtil.e("HiH_HiHlhDtIns", "bulkSaveDetailHiHealthData hiHealthDatas is null or app < 0");
            return 10;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA = a(ljq.b(e, list), kymVar, i);
        List<HiHealthData> listA = ljq.a(e, list);
        if (listA != null && !listA.isEmpty()) {
            if (HiHealthDBHelper.e("hihealth_sensitive.db").getWritableDatabase() == null) {
                ReleaseLogUtil.a("HiH_HiHlhDtIns", "Can not open db ", "hihealth_sensitive.db");
                return 26;
            }
            int iA2 = a(listA, kymVar, i);
            if (iA2 != 0) {
                iA = iA2;
            }
            LogUtil.d("HiH_HiHlhDtIns", "bulkSaveDetailHiHealthData() size = ", Integer.valueOf(list.size()), ",totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        }
        return iA;
    }

    private int a(List<HiHealthData> list, kym kymVar, int i) throws Throwable {
        boolean zB;
        if (list != null) {
            boolean zIsEmpty = list.isEmpty();
            try {
                if (!zIsEmpty) {
                    try {
                        zB = !ljq.h(e, list.get(0).getType()) ? ljq.b(e, list.get(0).getType()) : false;
                        try {
                            int iC = this.f40071c.c(list, kymVar, i);
                            if (zB) {
                                ljq.g(e, list.get(0).getType());
                            }
                            if (zB) {
                                ljq.c(e, list.get(0).getType());
                            }
                            return iC;
                        } catch (Exception e2) {
                            e = e2;
                            ReleaseLogUtil.e("HiH_HiHlhDtIns", "bulkSaveDetailHiHealthData() e = ", a(e));
                            if (!zB) {
                                return 11;
                            }
                            ljq.c(e, list.get(0).getType());
                            return 11;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        zB = false;
                    } catch (Throwable th) {
                        th = th;
                        zIsEmpty = false;
                        if (zIsEmpty) {
                            ljq.c(e, list.get(0).getType());
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return 0;
    }

    private String a(Exception exc) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : exc.getStackTrace()) {
            sb.append(stackTraceElement.toString());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataInsert
    public void prepareAsyncHealthDataStat(List<HiHealthData> list) {
        if (list == null) {
            return;
        }
        List<HiHealthData> listB = ljz.b(e, list);
        if (listB == null || listB.isEmpty()) {
            LogUtil.j("HiH_HiHlhDtIns", "prepareAsyncHealthDataStat() list is null ");
            return;
        }
        this.f40070b.addAll(listB);
        LogUtil.d("HiH_HiHlhDtIns", "prepareAsyncHealthDataStat() list size = ", Integer.valueOf(listB.size()), ",asyncStatList size = ", Integer.valueOf(this.f40070b.size()));
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataInsert
    public void prepareRealTimeHealthDataStat(List<HiHealthData> list) {
        prepareRealTimeHealthDataStat(list, true);
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataInsert
    public void prepareRealTimeHealthDataStat(List<HiHealthData> list, boolean z) {
        if (z) {
            a(list);
        }
        List<HiHealthData> listB = ljz.b(e, list);
        if (listB == null || listB.isEmpty()) {
            ReleaseLogUtil.e("HiH_HiHlhDtIns", "PrepareRelTmHlhDtStat List=null ");
            return;
        }
        this.f40069a.addAll(listB);
        LogUtil.d("HiH_HiHlhDtIns", "PrepareRelTmHlhDtStat ListSz=", Integer.valueOf(listB.size()), ",relTmStatListSz=", Integer.valueOf(this.f40069a.size()));
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataInsert
    public void doAsyncHealthDataStat() {
        BlockingQueue<HiHealthData> blockingQueue = this.f40070b;
        if (blockingQueue == null || blockingQueue.isEmpty()) {
            LogUtil.j("HiH_HiHlhDtIns", "doAsyncHealthDataStat() statList is null ");
            return;
        }
        LogUtil.d("HiH_HiHlhDtIns", "doAsyncHealthDataStat() start ");
        if (this.d.isShutdown()) {
            LogUtil.e("HiH_HiHlhDtIns", "doAsyncHealthDataStat singleThreadPool is closed! Restarting...");
            this.d = Executors.newSingleThreadExecutor();
        }
        this.d.execute(new b(this));
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataInsert
    public void doRealTimeHealthDataStat() {
        doRealTimeHealthDataStat(true);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    @Override // com.huawei.hihealthservice.store.interfaces.IDataInsert
    public void doRealTimeHealthDataStat(boolean z) {
        boolean zB;
        Queue<HiHealthData> queue = this.f40069a;
        if (queue == null || queue.isEmpty()) {
            return;
        }
        int type = this.f40069a.element().getType();
        Integer numValueOf = Integer.valueOf(this.f40069a.size());
        Integer numValueOf2 = Integer.valueOf(type);
        ReleaseLogUtil.d("HiH_HiHlhDtIns", "dRelTmHlhDtStat Sz:", numValueOf, ",1stDtTp:", numValueOf2);
        Integer num = null;
        try {
            try {
                zB = !ljq.h(e, type) ? ljq.b(e, type) : false;
                try {
                    a(z);
                    if (zB) {
                        ljq.g(e, type);
                    }
                    if (zB) {
                        ljq.c(e, type);
                    }
                } catch (Exception e2) {
                    e = e2;
                    ReleaseLogUtil.a("HiH_HiHlhDtIns", "dRelTmHlhDtStat Exp", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(e, type);
                    }
                }
            } catch (Throwable th) {
                th = th;
                num = numValueOf2;
                if (num != null) {
                    ljq.c(e, type);
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            if (num != null) {
                ljq.c(e, type);
            }
            throw th;
        }
    }

    private void a(List<HiHealthData> list) {
        if (HiCommonUtil.b(list)) {
            return;
        }
        if (liq.f(BaseApplication.b(), list.get(0).getUserId()) || !Utils.h()) {
            List<HiHealthData> listE = lkh.e(list);
            if (njy.e(listE)) {
                ReleaseLogUtil.e("HiH_HiHlhDtIns", "activeHourAfterProcess triggerList is empty");
                return;
            }
            for (HiHealthData hiHealthData : listE) {
                int type = hiHealthData.getType();
                if (type == 2 || type == 4 || type == 7) {
                    if (lkh.a(hiHealthData, hiHealthData.getType())) {
                        lkh.e(hiHealthData);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        BlockingQueue<HiHealthData> blockingQueue = this.f40070b;
        if (blockingQueue == null || blockingQueue.isEmpty()) {
            return;
        }
        int type = this.f40070b.element().getType();
        ReleaseLogUtil.d("HiH_HiHlhDtIns", "saveAsynHealthDatasStat() asyncStatList size = ", Integer.valueOf(this.f40070b.size()), ", firstDataType: ", Integer.valueOf(type));
        boolean zB = false;
        while (!this.f40070b.isEmpty()) {
            try {
                try {
                    if (!ljq.h(e, type)) {
                        zB = ljq.b(e, type);
                    }
                    b(this.f40070b.take());
                    if (zB) {
                        ljq.g(e, type);
                    }
                    if (zB) {
                        ljq.c(e, type);
                    }
                } catch (Exception e2) {
                    ReleaseLogUtil.a("HiH_HiHlhDtIns", "saveAsynHealthDatasStat() Exception", LogAnonymous.b(e2));
                    if (zB) {
                    }
                }
            } catch (Throwable th) {
                if (zB) {
                    ljq.c(e, type);
                }
                throw th;
            }
        }
    }

    private void a(boolean z) {
        int size = this.f40069a.size();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator<HiHealthData> it = this.f40069a.iterator();
        int i = 0;
        while (it.hasNext()) {
            e(it.next(), z);
            it.remove();
            i++;
        }
        ReleaseLogUtil.d("HiH_HiHlhDtIns", "saveRlTmDtSt sz=", Integer.valueOf(size), ", rSz=", Integer.valueOf(i), ",tlTm=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    private void b(HiHealthData hiHealthData) {
        e(hiHealthData, true);
    }

    private void e(HiHealthData hiHealthData, boolean z) {
        HiStatCommon hiExerciseIntensityStat;
        int type = hiHealthData.getType();
        boolean z2 = true;
        switch (type) {
            case 7:
                hiExerciseIntensityStat = new HiExerciseIntensityStat(e);
                break;
            case 2002:
            case 2018:
            case 2105:
                hiExerciseIntensityStat = new HiHeartRateAndRestHeartRateStat(e);
                z2 = false;
                break;
            case 2019:
            case 2020:
            case 2021:
                hiExerciseIntensityStat = new HiStressAndRelaxtionStat(e);
                z2 = false;
                break;
            case 2034:
                hiExerciseIntensityStat = new HiNewStressStat(e);
                z2 = false;
                break;
            case 2101:
            case 2102:
                hiExerciseIntensityStat = new HiHeartRateUpStat(e);
                z2 = false;
                break;
            case 2103:
                hiExerciseIntensityStat = new HiBloodOxygenSaturationStat(e);
                z2 = false;
                break;
            case AMapException.CODE_AMAP_CLIENT_UPLOADAUTO_STARTED_ERROR /* 2200 */:
                hiExerciseIntensityStat = new HiPpgStat(e);
                z2 = false;
                break;
            case 20001:
            case 40054:
                hiExerciseIntensityStat = new HiSportStat(e);
                break;
            case 22000:
                hiExerciseIntensityStat = new HiSleepStat(e);
                z2 = false;
                break;
            case 22100:
                hiExerciseIntensityStat = new HiCoreSleepStat(e);
                z2 = false;
                break;
            case 30001:
            case 30228:
                hiHealthData.setType(30001);
                hiExerciseIntensityStat = new HiTrackStat(e);
                z2 = false;
                break;
            default:
                hiExerciseIntensityStat = HiConfigDataType.h(type) ? new HiConfigDataStat(e) : null;
                d(hiHealthData);
                break;
        }
        if (hiExerciseIntensityStat != null) {
            hiExerciseIntensityStat.stat(hiHealthData);
        }
        if (z && z2) {
            lkd.d().h(hiHealthData);
        }
    }

    /* JADX INFO: renamed from: lfz$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f40072c;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            f40072c = iArr;
            try {
                iArr[HiHealthDataType.Category.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40072c[HiHealthDataType.Category.SEQUENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void d(HiHealthData hiHealthData) {
        int i = AnonymousClass3.f40072c[HiHealthDataType.d(hiHealthData.getType()).ordinal()];
        if (i == 1 || i == 2) {
            new HiDicHealthDataStat(e).a(hiHealthData);
        } else {
            LogUtil.j("HiH_HiHlhDtIns", "This type is not supported stat, type is ", Integer.valueOf(hiHealthData.getType()));
        }
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<lfz> f40073c;

        b(lfz lfzVar) {
            this.f40073c = new WeakReference<>(lfzVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            LogUtil.d("HiH_HiHlhDtIns", "doAsyncHealthDataStat enter");
            lfz lfzVar = this.f40073c.get();
            if (lfzVar == null) {
                LogUtil.j("HiH_HiHlhDtIns", "StatDataRunnable() insertStore = null");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            lfzVar.c();
            HiBroadcastUtil.e(lfz.e, 0);
            liz.a().a(200, "doAsyncHealthDataStat", new kym(lfz.e.getPackageName()));
            LogUtil.a("HiH_HiHlhDtIns", "doAsyncHealthDataStat totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        }
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IDataInsert
    public void onDestroy() {
        LogUtil.d("HiH_HiHlhDtIns", "do onDestroy");
        ExecutorService executorService = this.d;
        if (executorService != null) {
            executorService.shutdown();
        }
    }
}
