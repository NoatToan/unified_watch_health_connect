package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.sleep.SleepApi;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class gwb {
    private gwb() {
    }

    public static void d(Date date, gxd gxdVar) {
        LogUtil.a("SleepDayDataCache", "setSleepDailyResultBeanCache time: ", date);
        String strC = qrk.c(date.getTime());
        SharedPreferenceManager.e(BaseApplication.b(), "day_sleep_cache", "CACHE_KEY_MGMT" + strC, lsr.e(Collections.singletonList(gxdVar), null), null);
    }

    public static gxd a(Date date) {
        String strC = qrk.c(date.getTime());
        ArrayList arrayList = new ArrayList();
        try {
            lsr.c(SharedPreferenceManager.e(BaseApplication.b(), "day_sleep_cache", "CACHE_KEY_MGMT" + strC), gwb.class.getClassLoader(), null, arrayList);
            if (njy.e(arrayList)) {
                return null;
            }
            return (gxd) arrayList.get(0);
        } catch (Exception e) {
            LogUtil.e("SleepDayDataCache", "getSleepDailyResultBean Exception", ExceptionUtils.c(e));
            return null;
        }
    }

    public static <T> void b(Date date, List<T> list) {
        LogUtil.a("SleepDayDataCache", "setSleepDeviceCache time: ", date);
        String strC = qrk.c(date.getTime());
        SharedPreferenceManager.e(BaseApplication.b(), "day_sleep_cache", "CACHE_KEY_DEVICE" + strC, lsr.e(list, null), null);
    }

    public static <T> List<T> b(Date date) {
        String strC = qrk.c(date.getTime());
        ArrayList arrayList = new ArrayList();
        try {
            lsr.c(SharedPreferenceManager.e(BaseApplication.b(), "day_sleep_cache", "CACHE_KEY_DEVICE" + strC), gwb.class.getClassLoader(), null, arrayList);
            return arrayList;
        } catch (Exception e) {
            LogUtil.e("SleepDayDataCache", "getSleepDeviceCache Exception", ExceptionUtils.c(e));
            return Collections.EMPTY_LIST;
        }
    }

    public static void e(final Date date) {
        ReleaseLogUtil.d("R_Sleep_SleepDayDataCache", "startSetSleepCache", date);
        int iA = DateFormatUtil.a(date.getTime());
        ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
        final String strValueOf = String.valueOf(iA);
        threadPoolManagerC.execute(new Runnable() { // from class: gwh
            @Override // java.lang.Runnable
            public final void run() {
                gwb.a(date, strValueOf);
            }
        });
    }

    static /* synthetic */ void a(Date date, final String str) {
        if (!b()) {
            LogUtil.a("SleepDayDataCache", "sleep detail page is running");
            return;
        }
        d(date, new CommonUiBaseResponse() { // from class: gwb.4
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public void onResponse(int i, Object obj) {
                LogUtil.a("SleepDayDataCache", "requestGetDayDetailData errorCode = ", Integer.valueOf(i));
                if (i == 0 && obj != null) {
                    SparseArray sparseArray = (SparseArray) obj;
                    ReleaseLogUtil.d("SleepDayDataCache", "request detail data back,  ", sparseArray.toString());
                    gwb.d(str, (SparseArray<List<HiHealthData>>) sparseArray);
                    return;
                }
                LogUtil.a("SleepDayDataCache", "requestGetDayDetailData else");
            }
        });
        b(date, new CommonUiBaseResponse() { // from class: gwb.2
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public void onResponse(int i, Object obj) {
                LogUtil.a("SleepDayDataCache", "requestGetCoreSleepDetailData errorCode = ", Integer.valueOf(i));
                if (i == 0 && obj != null) {
                    List list = (List) obj;
                    LogUtil.a("SleepDayDataCache", "request summary data back,", list.toString());
                    gwb.e(str, (List<gxq>) list);
                    return;
                }
                LogUtil.a("SleepDayDataCache", "requestGetCoreSleepDetailData else.");
            }
        });
        SleepApi sleepApi = (SleepApi) Services.d("Main", SleepApi.class);
        if (sleepApi != null) {
            sleepApi.requestSleepDevice(date, new CommonUiBaseResponse() { // from class: gwb.3
                @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                public void onResponse(int i, Object obj) {
                    LogUtil.a("SleepDayDataCache", "set device cache ,", obj);
                }
            });
        }
    }

    private static void d(Date date, final CommonUiBaseResponse commonUiBaseResponse) {
        long jA = lsl.a(date.getTime(), 20, 0);
        long jA2 = lsl.a(lsl.d(date.getTime(), -1), 20, 0);
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(DateFormatUtil.e(jA2, DateFormatUtil.DateFormatType.DATE_FORMAT_MILS), DateFormatUtil.e(jA - 1, DateFormatUtil.DateFormatType.DATE_FORMAT_MILS), HiDataReadOption.TimeFormatType.DATE_FORMAT_MILLISECONDS);
        hiDataReadOption.setType(new int[]{22100});
        hiDataReadOption.setSortOrder(0);
        HiHealthManager.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: gwb.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (!(obj instanceof SparseArray)) {
                    commonUiBaseResponse.onResponse(1, obj);
                }
                commonUiBaseResponse.onResponse(i, obj);
            }
        });
    }

    private static void b(Date date, final CommonUiBaseResponse commonUiBaseResponse) {
        gwa.c().e(date, date, a(), new IBaseResponseCallback() { // from class: gwb.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                commonUiBaseResponse.onResponse(i, obj);
            }
        });
    }

    private static int[] a() {
        return new int[]{3, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL, 1};
    }

    public static void d(String str, SparseArray<List<HiHealthData>> sparseArray) {
        LogUtil.a("SleepDayDataCache", "setSleepDetailCache time: ", str);
        Context contextB = BaseApplication.b();
        a(contextB, sparseArray.get(22100), "CACHE_KEY_CORE");
        SharedPreferenceManager.e(contextB, "day_sleep_cache", "CACHE_KEY_TIME", str, null);
    }

    private static boolean b() {
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            ReleaseLogUtil.e("R_Sleep_SleepDayDataCache", "isNeedRefreshSleepCache activity is null");
            return true;
        }
        ComponentName componentName = activityJ.getComponentName();
        if (componentName == null) {
            ReleaseLogUtil.e("R_Sleep_SleepDayDataCache", "isNeedRefreshSleepCache componentName is null");
            return false;
        }
        String className = componentName.getClassName();
        LogUtil.a("SleepDayDataCache", "isNeedRefreshSleepCache className ", className);
        return !className.contains("KnitSleepDetailActivity");
    }

    private static void a(Context context, List<HiHealthData> list, String str) {
        SharedPreferenceManager.e(context, "day_sleep_cache", str, lsr.e(list, null), null);
    }

    public static SparseArray<List<HiHealthData>> c(String str) {
        LogUtil.a("SleepDayDataCache", "getSleepDetailCache time: ", str);
        SparseArray<List<HiHealthData>> sparseArray = new SparseArray<>();
        Context contextB = BaseApplication.b();
        if (str.equals(SharedPreferenceManager.e(contextB, "day_sleep_cache", "CACHE_KEY_TIME"))) {
            try {
                a(contextB, "CACHE_KEY_CORE", 22100, sparseArray);
                return sparseArray;
            } catch (Exception unused) {
                LogUtil.d("SleepDayDataCache", "wrong type");
            }
        }
        return sparseArray;
    }

    private static void a(Context context, String str, int i, SparseArray<List<HiHealthData>> sparseArray) {
        String strE = SharedPreferenceManager.e(context, "day_sleep_cache", str);
        ArrayList arrayList = new ArrayList();
        lsr.c(strE, gwb.class.getClassLoader(), null, arrayList);
        ArrayList arrayList2 = new ArrayList();
        if (njy.b(arrayList)) {
            for (Object obj : arrayList) {
                if (obj instanceof HiHealthData) {
                    arrayList2.add((HiHealthData) obj);
                }
            }
        }
        sparseArray.put(i, arrayList2);
    }

    public static boolean c(SparseArray<List<HiHealthData>> sparseArray, SparseArray<List<HiHealthData>> sparseArray2) {
        return sparseArray == null || njy.e(sparseArray.get(22100)) || e(sparseArray.get(22100), sparseArray2.get(22100));
    }

    private static boolean e(List<HiHealthData> list, List<HiHealthData> list2) {
        return !lsr.e(list, null).equals(lsr.e(list2, null));
    }

    public static void e(String str, List<gxq> list) {
        LogUtil.a("SleepDayDataCache", "setSleepSummaryCache time: ", str);
        Context contextB = BaseApplication.b();
        b(contextB, list, "CACHE_KEY_SUMMARY");
        SharedPreferenceManager.e(contextB, "day_sleep_summary_cache", "CACHE_KEY_TIME_SUMMARY", str, null);
    }

    private static void b(Context context, List<gxq> list, String str) {
        SharedPreferenceManager.e(context, "day_sleep_summary_cache", str, lsr.e(list, null), null);
    }

    public static List<gxq> b(String str) {
        LogUtil.a("SleepDayDataCache", "getSleepSummaryCache: ", str);
        ArrayList arrayList = new ArrayList();
        Context contextB = BaseApplication.b();
        if (str.equals(SharedPreferenceManager.e(contextB, "day_sleep_summary_cache", "CACHE_KEY_TIME_SUMMARY"))) {
            e(contextB, "CACHE_KEY_SUMMARY", arrayList);
        }
        return arrayList;
    }

    private static void e(Context context, String str, List<gxq> list) {
        lsr.c(SharedPreferenceManager.e(context, "day_sleep_summary_cache", str), gwb.class.getClassLoader(), null, list);
    }

    public static <T> boolean c(List<T> list, List<T> list2) {
        if (njy.b(list)) {
            return d(list, list2);
        }
        return true;
    }

    private static boolean d(List list, List list2) {
        return !lsr.e(list, null).equals(lsr.e(list2, null));
    }

    public static void e(String str, HiHealthData hiHealthData) {
        LogUtil.a("SleepDayDataCache", "setSleepCardCache time for card: ", str);
        Context contextB = BaseApplication.b();
        b(contextB, hiHealthData, "CACHE_KEY_CARD");
        SharedPreferenceManager.e(contextB, "day_sleep_summary_cache", "CACHE_KEY_TIME_CARD", str, null);
    }

    private static void b(Context context, HiHealthData hiHealthData, String str) {
        SharedPreferenceManager.e(context, "day_sleep_summary_cache", str, lsr.e(Collections.singletonList(hiHealthData), null), null);
    }

    public static List<HiHealthData> e(String str) {
        LogUtil.a("SleepDayDataCache", "getSleepCardCache: ", str);
        ArrayList arrayList = new ArrayList();
        Context contextB = BaseApplication.b();
        if (str.equals(SharedPreferenceManager.e(contextB, "day_sleep_summary_cache", "CACHE_KEY_TIME_CARD"))) {
            d(contextB, "CACHE_KEY_CARD", arrayList);
        }
        return arrayList;
    }

    private static void d(Context context, String str, List<HiHealthData> list) {
        lsr.c(SharedPreferenceManager.e(context, "day_sleep_summary_cache", str), gwb.class.getClassLoader(), null, list);
    }
}
