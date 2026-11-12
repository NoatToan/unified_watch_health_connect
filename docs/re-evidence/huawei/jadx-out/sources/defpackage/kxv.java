package defpackage;

import android.os.Looper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.data.listener.HealthTrendListener;
import com.huawei.hihealth.data.type.HealthTrendDataType;
import com.huawei.hihealth.model.HealthTrendReport;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.HiDateUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class kxv {
    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(final List<String> list, final int[] iArr, final int i, final HealthTrendListener healthTrendListener, final boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: kxw
                @Override // java.lang.Runnable
                public final void run() {
                    kxv.a((List<String>) list, iArr, i, healthTrendListener, z);
                }
            });
            return;
        }
        if ((!z && c()) || !NetworkUtil.h()) {
            ReleaseLogUtil.d("R_HlthTrendCacheUt", "cache is valid or network unavailable");
            healthTrendListener.onResult(0, b(list, iArr));
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        List<String> listA = HealthTrendDataType.a();
        kxu.c(listA, listA, new ResultCallback<kyb>() { // from class: kxv.3
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(kyb kybVar) {
                countDownLatch.countDown();
                if (kybVar.getResultCode().intValue() == 0) {
                    kxv.a(kybVar.c());
                    healthTrendListener.onResult(0, kxv.b(list, iArr));
                } else {
                    healthTrendListener.onResult(0, kxv.b(list, iArr));
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                countDownLatch.countDown();
                healthTrendListener.onResult(0, kxv.b(list, iArr));
            }
        });
        if (i == 0) {
            return;
        }
        try {
            boolean zAwait = countDownLatch.await(i, TimeUnit.MILLISECONDS);
            ReleaseLogUtil.d("R_HlthTrendCacheUt", "getHealthTrend isCountZero = ", Boolean.valueOf(zAwait));
            if (zAwait) {
                return;
            }
            healthTrendListener.onResult(1023, b(list, iArr));
        } catch (InterruptedException unused) {
            ReleaseLogUtil.e("R_HlthTrendCacheUt", "getHealthTrend exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void d(final List<String> list, final int[] iArr, final int i, final HealthTrendListener healthTrendListener, final String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: kxx
                @Override // java.lang.Runnable
                public final void run() {
                    kxv.d(list, iArr, i, healthTrendListener, str);
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 : iArr) {
            if (i2 == 1 && arrayList.isEmpty()) {
                arrayList.addAll(list);
            } else if (i2 == 2 && arrayList2.isEmpty()) {
                arrayList2.addAll(list);
            } else {
                ReleaseLogUtil.e("R_HlthTrendCacheUt", "getHealthTrendWithRecordDay, periodType is wrong");
            }
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        kxu.b(arrayList, arrayList2, str, new ResultCallback<kyb>() { // from class: kxv.5
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(kyb kybVar) {
                countDownLatch.countDown();
                if (kybVar.getResultCode().intValue() == 0) {
                    healthTrendListener.onResult(0, kybVar.c());
                } else {
                    healthTrendListener.onResult(1004, new ArrayList());
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                countDownLatch.countDown();
                healthTrendListener.onResult(1004, new ArrayList());
            }
        });
        if (i <= 0) {
            return;
        }
        try {
            boolean zAwait = countDownLatch.await(i, TimeUnit.MILLISECONDS);
            ReleaseLogUtil.d("R_HlthTrendCacheUt", "getHealthTrendWithRecordDay isCountZero = ", Boolean.valueOf(zAwait));
            if (zAwait) {
                return;
            }
            healthTrendListener.onResult(1023, new ArrayList());
        } catch (InterruptedException unused) {
            ReleaseLogUtil.e("R_HlthTrendCacheUt", "getHealthTrendWithRecordDay exception");
        }
    }

    private static void b(String str, String str2, String str3) {
        SharedPreferenceManager.c("HealthKit", str + "_" + str2, str3);
    }

    private static String a(String str, String str2) {
        return SharedPreferenceManager.b("HealthKit", str + "_" + str2, "");
    }

    private static long a(String str) {
        long jD = SharedPreferenceManager.d("HealthKit", str + "_HealthTrendUpdateTime_V3", 0L);
        ReleaseLogUtil.d("R_HlthTrendCacheUt", "getHealthTrend getCacheUpdateTime = ", Long.valueOf(jD));
        return jD;
    }

    private static void d(String str, long j) {
        ReleaseLogUtil.d("R_HlthTrendCacheUt", "getHealthTrend saveCacheUpdateTime = ", Long.valueOf(j));
        SharedPreferenceManager.c("HealthKit", str + "_HealthTrendUpdateTime_V3", j);
    }

    private static boolean c() {
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        int iD = HiDateUtil.d(System.currentTimeMillis());
        int iD2 = HiDateUtil.d(a(strC));
        LogUtil.a("HealthTrendCacheUtil", "getHealthTrend isCacheValid currentDay = ", Integer.valueOf(iD), ", updateDay = ", Integer.valueOf(iD2));
        boolean z = iD == iD2;
        ReleaseLogUtil.d("R_HlthTrendCacheUt", "getHealthTrend isCacheValid = ", Boolean.valueOf(z));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(List<HealthTrendReport> list) {
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        for (Map.Entry<String, List<HealthTrendReport>> entry : c(list).entrySet()) {
            b(strC, entry.getKey(), new Gson().toJson(entry.getValue()));
        }
        d(strC, System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<HealthTrendReport> b(List<String> list, int[] iArr) {
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            List<HealthTrendReport> listA = a((List<HealthTrendReport>) new Gson().fromJson(a(strC, it.next()), new TypeToken<List<HealthTrendReport>>() { // from class: com.huawei.hihealthservice.healthtrend.HealthTrendCacheUtil$3
            }.getType()), iArr);
            if (njy.b(listA)) {
                arrayList.addAll(listA);
            }
        }
        LogUtil.a("HealthTrendCacheUtil", "getHealthTrendFromCache result = ", arrayList);
        return arrayList;
    }

    private static List<HealthTrendReport> a(List<HealthTrendReport> list, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            for (int i : iArr) {
                for (HealthTrendReport healthTrendReport : list) {
                    if (healthTrendReport.getTrendPeriod() == i) {
                        arrayList.add(healthTrendReport);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private static Map<String, List<HealthTrendReport>> c(List<HealthTrendReport> list) {
        HashMap map = new HashMap();
        if (!njy.e(list)) {
            for (HealthTrendReport healthTrendReport : list) {
                String item = healthTrendReport.getItem();
                if (map.containsKey(item)) {
                    ((List) map.get(item)).add(healthTrendReport);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(healthTrendReport);
                    map.put(item, arrayList);
                }
            }
        }
        return map;
    }
}
