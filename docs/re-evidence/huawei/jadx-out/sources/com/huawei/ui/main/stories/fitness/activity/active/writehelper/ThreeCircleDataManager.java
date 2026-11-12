package com.huawei.ui.main.stories.fitness.activity.active.writehelper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import androidx.media3.common.C;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.threecircle.ThreeCircleConfigUtil;
import com.huawei.ui.main.stories.fitness.activity.active.writehelper.ThreeCircleDataManager;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qdm;
import defpackage.qgm;
import defpackage.qhb;
import defpackage.tuv;
import defpackage.tve;
import health.compact.a.HiBroadcastManager;
import health.compact.a.HiDateUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class ThreeCircleDataManager implements ThreeCircleDataInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ThreeCircleDataManager f26571c;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f26573b;
    private SyncSportDataReceiver j;
    private final HashMap<Long, HiHealthData> f = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<Integer> f26572a = new CopyOnWriteArrayList<>();
    private long g = 0;
    private long e = 0;

    public static ThreeCircleDataManager a() {
        ThreeCircleDataManager threeCircleDataManager;
        if (f26571c == null) {
            synchronized (d) {
                if (f26571c == null) {
                    f26571c = new ThreeCircleDataManager();
                }
                threeCircleDataManager = f26571c;
            }
            return threeCircleDataManager;
        }
        return f26571c;
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.active.writehelper.ThreeCircleDataInterface
    public void requestAggregateData(long j, long j2, final ResponseCallback<List<HiHealthData>> responseCallback) {
        HiHealthNativeApi.a(BaseApplication.b()).aggregateHiHealthData(c(new Pair<>(Long.valueOf(j), Long.valueOf(j2))), new HiAggregateListener() { // from class: com.huawei.ui.main.stories.fitness.activity.active.writehelper.ThreeCircleDataManager.1
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                responseCallback.onResponse(i, list);
            }
        });
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.active.writehelper.ThreeCircleDataInterface
    public void clearData() {
        this.f.clear();
        if (this.j != null) {
            HiBroadcastManager.d(BaseApplication.b(), this.j);
            this.j = null;
        }
        this.f26573b = 0L;
    }

    public void d() {
        e();
        HandlerCenter.a().d(new Runnable() { // from class: tvi
            @Override // java.lang.Runnable
            public final void run() {
                ThreeCircleDataManager.b();
            }
        }, 500L);
    }

    public static /* synthetic */ void b() {
        ReleaseLogUtil.c("Track_ThreeCircleDataManager", "init synCloud");
        qdm.c(qdm.b(), System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void d(final long j, final long j2, final ResponseCallback<List<HiHealthData>> responseCallback) {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: tvf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49707c.d(j, j2, responseCallback);
                }
            });
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(4);
        c(countDownLatch);
        HashMap map = new HashMap(2);
        LogUtil.b("Track_ThreeCircleDataManager", "startTime", HiDateUtil.e(j, "yyyy-MM-dd HH:mm:ss"), "endTime", HiDateUtil.e(j2, "yyyy-MM-dd HH:mm:ss"));
        if (c(j, j2, countDownLatch, map)) {
            ReleaseLogUtil.b("Track_ThreeCircleDataManager", "search Data out of time");
            responseCallback.onResponse(5, null);
        } else {
            e(map.containsKey(0) ? map.get(0) : null, map.containsKey(1) ? map.get(1) : null, j, j2, responseCallback);
        }
    }

    public long c() {
        return this.f26573b;
    }

    private boolean c(long j, long j2, final CountDownLatch countDownLatch, final Map<Integer, List<HiHealthData>> map) {
        requestAggregateData(j, j2, new ResponseCallback() { // from class: tvc
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                ThreeCircleDataManager.e(map, countDownLatch, i, (List) obj);
            }
        });
        qhb.c().c(j, j2, new ResponseCallback() { // from class: tvj
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                ThreeCircleDataManager.c(map, countDownLatch, i, (List) obj);
            }
        });
        if (this.f26573b == 0) {
            qhb.c().e(new IBaseResponseCallback() { // from class: tvg
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f49708a.d(countDownLatch, i, obj);
                }
            });
        } else {
            countDownLatch.countDown();
        }
        try {
            if (!countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)) {
                LogUtil.e("Track_ThreeCircleDataManager", "getHealthTrackData wait timeout");
                return true;
            }
        } catch (InterruptedException unused) {
            LogUtil.d("Track_ThreeCircleDataManager", "interrupted while waiting for getHealthTrackData");
        }
        return false;
    }

    public static /* synthetic */ void e(Map map, CountDownLatch countDownLatch, int i, List list) {
        map.put(0, list);
        countDownLatch.countDown();
    }

    public static /* synthetic */ void c(Map map, CountDownLatch countDownLatch, int i, List list) {
        map.put(1, list);
        countDownLatch.countDown();
    }

    public /* synthetic */ void d(CountDownLatch countDownLatch, int i, Object obj) {
        this.f26573b = ((Long) obj).longValue();
        countDownLatch.countDown();
    }

    private void e(List<HiHealthData> list, List<HiHealthData> list2, long j, long j2, ResponseCallback<List<HiHealthData>> responseCallback) {
        HiHealthData hiHealthData;
        Map<Long, Pair<HiHealthData, HiHealthData>> mapC = c(list, list2, j, j2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(4);
        arrayList3.addAll(this.f26572a);
        tve.b(arrayList3);
        for (Map.Entry<Long, Pair<HiHealthData, HiHealthData>> entry : mapC.entrySet()) {
            boolean z = entry.getKey().longValue() >= this.f26573b;
            Pair<HiHealthData, HiHealthData> value = entry.getValue();
            if (value == null) {
                value = new Pair<>(null, null);
            }
            if (value.second == null) {
                hiHealthData = new HiHealthData();
                hiHealthData.setStartTime(entry.getKey().longValue());
            } else {
                hiHealthData = (HiHealthData) value.second;
            }
            arrayList2.add(tve.d(value.first != null ? (HiHealthData) value.first : hiHealthData, hiHealthData, arrayList, z, false));
        }
        responseCallback.onResponse(0, arrayList2);
    }

    private Map<Long, Pair<HiHealthData, HiHealthData>> c(List<HiHealthData> list, List<HiHealthData> list2, long j, long j2) {
        HashMap map = new HashMap();
        while (j < j2) {
            map.put(Long.valueOf(j), null);
            j = lsl.c(j, 1);
        }
        a(list2, map);
        d(list, map);
        return map;
    }

    private void a(List<HiHealthData> list, Map<Long, Pair<HiHealthData, HiHealthData>> map) {
        if (njy.e(list)) {
            return;
        }
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                if (map.containsKey(Long.valueOf(hiHealthData.getStartTime()))) {
                    map.put(Long.valueOf(hiHealthData.getStartTime()), new Pair<>(hiHealthData, null));
                } else {
                    long jD = DateFormatUtil.d(DateFormatUtil.a(hiHealthData.getStartTime(), lsl.a(hiHealthData.getTimeZone())));
                    if (map.containsKey(Long.valueOf(jD)) && map.get(Long.valueOf(jD)) == null) {
                        hiHealthData.setStartTime(jD);
                        map.put(Long.valueOf(jD), new Pair<>(hiHealthData, null));
                    }
                }
            }
        }
    }

    private void d(List<HiHealthData> list, Map<Long, Pair<HiHealthData, HiHealthData>> map) {
        Pair<HiHealthData, HiHealthData> pair;
        if (njy.e(list)) {
            LogUtil.b("Track_ThreeCircleDataManager", "aggregateList is empty");
            return;
        }
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData == null) {
                LogUtil.b("Track_ThreeCircleDataManager", "data is null");
            } else if (map.containsKey(Long.valueOf(hiHealthData.getStartTime()))) {
                Pair<HiHealthData, HiHealthData> pair2 = map.get(Long.valueOf(hiHealthData.getStartTime()));
                if (pair2 == null) {
                    pair = new Pair<>(null, hiHealthData);
                } else {
                    pair = new Pair<>((HiHealthData) pair2.first, hiHealthData);
                }
                map.put(Long.valueOf(hiHealthData.getStartTime()), pair);
            }
        }
    }

    private void e() {
        this.g = SharedPreferenceManager.d("three_circle", "reliable_start_time", 0L);
        long jD = SharedPreferenceManager.d("three_circle", "reliable_end_time", 0L);
        this.e = jD;
        LogUtil.b("Track_ThreeCircleDataManager", "mReliableStartTime ", Long.valueOf(this.g), "mReliableEndTime ", Long.valueOf(jD));
    }

    private void c(final CountDownLatch countDownLatch) {
        tuv.c().d(new IBaseResponseCallback() { // from class: tvh
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.e(countDownLatch, i, obj);
            }
        });
    }

    public /* synthetic */ void e(CountDownLatch countDownLatch, int i, Object obj) {
        if (!(obj instanceof HashMap)) {
            LogUtil.e("Track_ThreeCircleDataManager", "handleMsgUpdateDialog is not instanceof HashMap");
            return;
        }
        HashMap<String, Integer> map = (HashMap) obj;
        this.f26572a.clear();
        LogUtil.b("Track_ThreeCircleDataManager", "insertSportAchievementGoalVal stepValue is ", Integer.valueOf(e(map, "900200006", 10000, ThreeCircleConfigUtil.ThreeCircleConfig.STEP)), " intensityValue is ", Integer.valueOf(e(map, "900200008", 25, ThreeCircleConfigUtil.ThreeCircleConfig.INTENSITY)), " standValue is ", Integer.valueOf(e(map, "900200009", 12, ThreeCircleConfigUtil.ThreeCircleConfig.ACTIVE_HOUR)), " calorieGoalValue is ", Integer.valueOf(e(map, "900200007", 270000, ThreeCircleConfigUtil.ThreeCircleConfig.CALORIE)));
        countDownLatch.countDown();
    }

    private int e(HashMap<String, Integer> map, String str, int i, ThreeCircleConfigUtil.ThreeCircleConfig threeCircleConfig) {
        int iD = qgm.d(map, str, i);
        this.f26572a.add(Integer.valueOf(iD));
        return iD;
    }

    private HiAggregateOption c(Pair<Long, Long> pair) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(((Long) pair.first).longValue());
        hiAggregateOption.setEndTime(((Long) pair.second).longValue());
        hiAggregateOption.setSortOrder(0);
        hiAggregateOption.setType(new int[]{40002, 47101, DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE_COUNT.value(), 40004, 40003, SmartMsgConstant.MSG_TYPE_RIDE_USER, 40008});
        hiAggregateOption.setConstantsKey(new String[]{"stepUserValue", "durationUserValue", "activeUserValue", "sport_distance_sum", "sport_calorie_sum", "sport_altitude_offset_sum", "pushesVal"});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(3);
        return hiAggregateOption;
    }

    public class SyncSportDataReceiver extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f26576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f26577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f26578c;
        final /* synthetic */ ThreeCircleDataManager d;
        private boolean e;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.e("Track_ThreeCircleDataManager", "SyncSportDataReceiver onReceive intent is null or context is null");
                return;
            }
            LogUtil.b("Track_ThreeCircleDataManager", "intent.getAction()", intent.getAction());
            if ("com.huawei.hihealth.action_sync_sport_stat_data".equals(intent.getAction())) {
                this.f26577b = true;
                LogUtil.b("Track_ThreeCircleDataManager", "into STAT_DATA");
            }
            if ("com.huawei.hihealth.action_sync_all_data".equals(intent.getAction())) {
                this.e = true;
                LogUtil.b("Track_ThreeCircleDataManager", "into ALL_DATA");
            }
            if (this.f26577b && this.e) {
                LogUtil.b("Track_ThreeCircleDataManager", "all finish");
                this.d.d(this.f26578c, this.f26576a, new ResponseCallback() { // from class: tvo
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i, Object obj) {
                        LogUtil.b("Track_ThreeCircleDataManager", "pre search finish");
                    }
                });
            }
        }
    }
}
