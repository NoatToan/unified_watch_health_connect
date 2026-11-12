package defpackage;

import android.os.Looper;
import android.util.SparseArray;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class jei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f38479a = new Object();
    private static volatile jei d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f38480b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f38481c = false;
    private ScheduledExecutorService e;
    private int f;
    private int g;
    private float h;
    private long i;
    private float j;
    private long k;
    private int o;

    public int i() {
        return this.g;
    }

    public long e() {
        return this.i;
    }

    public long h() {
        return this.k;
    }

    public int d() {
        return this.f;
    }

    public int j() {
        return this.o;
    }

    public float g() {
        return this.h;
    }

    public float f() {
        return this.j;
    }

    public static jei b() {
        if (d == null) {
            synchronized (f38479a) {
                if (d == null) {
                    d = new jei();
                }
            }
        }
        return d;
    }

    public void a(final int i) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: jei.4
                @Override // java.lang.Runnable
                public void run() {
                    jei.this.a(i);
                }
            });
            return;
        }
        LogUtil.d("Track_SmartCoachHistorySportData", "enter startQueryUserHistorySportData() ");
        try {
            Thread.sleep(10000L);
            LogUtil.d("Track_SmartCoachHistorySportData", "Thread.sleep recover");
            d(i);
        } catch (InterruptedException e) {
            LogUtil.e("Track_SmartCoachHistorySportData", LogAnonymous.b(e));
        }
    }

    private void d(int i) {
        LogUtil.d("Track_SmartCoachHistorySportData", "enter executeQuerySportData()");
        m();
        long jCurrentTimeMillis = System.currentTimeMillis();
        b(i, jCurrentTimeMillis, lsl.e(jCurrentTimeMillis, 0));
        if (this.e == null) {
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            this.e = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new a(), 5L, 5L, TimeUnit.SECONDS);
        }
    }

    private void b(int i, long j, long j2) {
        jef.e(j2, j, i, new IBaseResponseCallback() { // from class: jei.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (njy.b(obj, HiHealthData.class)) {
                    List list = (List) obj;
                    jei.this.g = list.size();
                    jei.this.i = 0L;
                    jei.this.f = 0;
                    jei.this.h = Float.MAX_VALUE;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(((HiHealthData) list.get(i3)).getMetaData(), HiTrackMetaData.class);
                        if (jei.this.c(hiTrackMetaData)) {
                            jei.this.g--;
                        } else {
                            if (hiTrackMetaData.getTotalTime() > jei.this.i) {
                                jei.this.i = hiTrackMetaData.getTotalTime();
                            }
                            if (hiTrackMetaData.getTotalDistance() > jei.this.f) {
                                jei.this.f = hiTrackMetaData.getTotalDistance();
                            }
                            float fC = jei.this.c(hiTrackMetaData.getPaceMap());
                            if (fC > 0.0f && fC < jei.this.h) {
                                jei.this.h = fC;
                            }
                        }
                    }
                    if (Math.abs(jei.this.h - Float.MAX_VALUE) <= 1.0E-6f) {
                        jei.this.h = 0.0f;
                    }
                    LogUtil.d("Track_SmartCoachHistorySportData", "executeQuerySportData mLastMonthRunCount = ", Integer.valueOf(jei.this.g), " mLastMonthMaxRunTime = ", Long.valueOf(jei.this.i), " mLastMonthMaxRunDistance = ", Integer.valueOf(jei.this.f), " mLastMonthOneKiloMetreFastPace = ", Float.valueOf(jei.this.h));
                } else {
                    LogUtil.j("Track_SmartCoachHistorySportData", "last month have no sport record.");
                }
                jei.this.f38480b = true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float c(Map<Integer, Float> map) {
        Map<Integer, Float> mapA;
        if (map == null || map.size() == 0 || (mapA = izn.a(map)) == null || mapA.size() <= 0) {
            return 0.0f;
        }
        float fFloatValue = Float.MAX_VALUE;
        for (Map.Entry<Integer, Float> entry : mapA.entrySet()) {
            if (entry.getValue().floatValue() < fFloatValue) {
                fFloatValue = entry.getValue().floatValue();
            }
        }
        return fFloatValue;
    }

    private void m() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        final int[] iArr = {30006};
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(10);
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: jei.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (obj == null) {
                    LogUtil.j("Track_SmartCoachHistorySportData", "getLastRunData The return run data is null");
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("Track_SmartCoachHistorySportData", "getLastRunData The return run data is empty");
                    return;
                }
                Object obj2 = sparseArray.get(iArr[0]);
                List list = njy.b(obj2, HiHealthData.class) ? (List) obj2 : null;
                if (list == null || list.size() == 0) {
                    LogUtil.j("Track_SmartCoachHistorySportData", "getLastRunData list is null or empty");
                } else {
                    jei.this.a((List<HiHealthData>) list);
                }
                jei.this.f38481c = true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<HiHealthData> list) {
        boolean z = false;
        for (int i = 0; i < list.size(); i++) {
            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(list.get(i).getMetaData(), HiTrackMetaData.class);
            if (!c(hiTrackMetaData)) {
                if (!z) {
                    this.o = hiTrackMetaData.getTotalDistance();
                    this.k = hiTrackMetaData.getTotalTime();
                    z = true;
                }
                if (hiTrackMetaData.getTotalDistance() > 3000 && hiTrackMetaData.getAvgPace() < 600.0f) {
                    this.j = hiTrackMetaData.getAvgPace();
                    break;
                }
            }
        }
        LogUtil.d("Track_SmartCoachHistorySportData", "getLastRunData mRecentOneRunDistance = ", Integer.valueOf(this.o), " mRecentOneRunTime = ", Long.valueOf(this.k), " mRecentOneRunAveragePace = ", Float.valueOf(this.j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(HiTrackMetaData hiTrackMetaData) {
        return hiTrackMetaData == null || hiTrackMetaData.getDuplicated() == 1 || hiTrackMetaData.getAbnormalTrack() != 0;
    }

    class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (jei.d != null && jei.this.f38480b && jei.this.f38481c) {
                jeh.e().b();
            }
        }
    }

    private void k() {
        ScheduledExecutorService scheduledExecutorService = this.e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.e = null;
        }
    }

    private static void n() {
        synchronized (f38479a) {
            d = null;
        }
    }

    public void a() {
        LogUtil.d("Track_SmartCoachHistorySportData", "destory()");
        k();
        n();
    }
}
