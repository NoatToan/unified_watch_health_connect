package defpackage;

import android.content.Context;
import android.util.Log;
import com.huawei.hihealth.HealthKitCommonApi;
import com.huawei.hihealth.HealthKitDictQuery;
import com.huawei.hihealth.HiHealthAggregateQuery;
import com.huawei.hihealth.HiHealthKitApi;
import com.huawei.hihealth.HiHealthKitExtendApi;
import com.huawei.hihealth.StartSportParam;
import com.huawei.hihealth.TrendQuery;
import com.huawei.hihealth.error.HiHealthError;
import com.huawei.hihealth.listener.IuniversalCallback;
import com.huawei.hihealth.listener.ResultCallback;
import com.huawei.hihealthkit.HiHealthDataQuery;
import com.huawei.hihealthkit.HiHealthDataQueryOption;
import com.huawei.hihealthkit.context.OutOfBandContext;
import com.huawei.hihealthkit.data.store.HiRealTimeListener;
import com.huawei.hihealthkit.data.store.HiSportDataCallback;
import com.huawei.hihealthkit.data.type.HiHealthDataType;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class krt {
    private static boolean c(Context context, String str, IuniversalCallback iuniversalCallback) {
        Log.i("HiHealthDataStore", "Enter " + str);
        if (iuniversalCallback == null) {
            Log.w("HiHealthDataStore", str + " callback is null");
            return false;
        }
        if (context == null) {
            Log.w("HiHealthDataStore", str + " context is null");
            iuniversalCallback.onResult(2, null, " context is null");
            return false;
        }
        if (ksu.e(context, ksu.b())) {
            return true;
        }
        Log.w("HiHealthDataStore", str + " App does not exist");
        iuniversalCallback.onResult(1, null, "Health application does not exist");
        return false;
    }

    public static void d(Context context, final ResultCallback resultCallback) {
        if (c(context, "getGender", resultCallback != null ? new IuniversalCallback() { // from class: kso
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                resultCallback.onResultHandler(i, str);
            }
        } : null)) {
            if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).b(resultCallback);
            } else {
                HiHealthKitApi.b(context).e(resultCallback);
            }
        }
    }

    public static void b(Context context, final ResultCallback resultCallback) {
        if (c(context, "getBirthday", resultCallback != null ? new IuniversalCallback() { // from class: kru
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                resultCallback.onResultHandler(i, str);
            }
        } : null)) {
            if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).a(resultCallback);
            } else {
                HiHealthKitApi.b(context).b(resultCallback);
            }
        }
    }

    public static void e(Context context, final ResultCallback resultCallback) {
        if (c(context, "getHeight", resultCallback != null ? new IuniversalCallback() { // from class: ksg
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                resultCallback.onResultHandler(i, str);
            }
        } : null)) {
            if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).d(resultCallback);
            } else {
                HiHealthKitApi.b(context).d(resultCallback);
            }
        }
    }

    public static void c(Context context, final ResultCallback resultCallback) {
        if (c(context, "getWeight", resultCallback != null ? new IuniversalCallback() { // from class: krw
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                resultCallback.onResultHandler(i, str);
            }
        } : null)) {
            if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).c(resultCallback);
            } else {
                HiHealthKitApi.b(context).a(resultCallback);
            }
        }
    }

    public static void a(Context context, final ResultCallback resultCallback) {
        if (c(context, "getDeviceList", resultCallback != null ? new IuniversalCallback() { // from class: ksn
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                resultCallback.onResultHandler(i, str);
            }
        } : null)) {
            if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).e(resultCallback);
            } else {
                HiHealthKitApi.b(context).c(resultCallback);
            }
        }
    }

    public static void h(Context context, final ResultCallback resultCallback) {
        if (c(context, "startReadingAtrial", resultCallback != null ? new IuniversalCallback() { // from class: kst
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                resultCallback.onResultHandler(i, str);
            }
        } : null)) {
            if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).k(resultCallback);
            } else {
                HiHealthKitApi.b(context).k(resultCallback);
            }
        }
    }

    public static void g(Context context, final ResultCallback resultCallback) {
        if (c(context, "stopReadingAtrial", resultCallback != null ? new IuniversalCallback() { // from class: ksr
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                resultCallback.onResultHandler(i, str);
            }
        } : null)) {
            if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).n(resultCallback);
            } else {
                HiHealthKitApi.b(context).m(resultCallback);
            }
        }
    }

    public static void e(Context context, String str, final ResultCallback resultCallback) {
        if (c(context, "sendDeviceCommand", resultCallback != null ? new IuniversalCallback() { // from class: kse
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str2) {
                resultCallback.onResultHandler(i, str2);
            }
        } : null)) {
            if (str == null) {
                Log.w("HiHealthDataStore", "sendDeviceCommand commandOptions is null");
                resultCallback.onResultHandler(4, "commandOptions is null");
            } else if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).b(str, resultCallback);
            } else {
                HiHealthKitApi.b(context).a(str, resultCallback);
            }
        }
    }

    public static void b(Context context, HiHealthDataQuery hiHealthDataQuery, int i, final ResultCallback resultCallback) {
        if (c(context, "execQuery", resultCallback != null ? new IuniversalCallback() { // from class: ksh
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i2, Object obj, String str) {
                resultCallback.onResultHandler(i2, str);
            }
        } : null)) {
            if (hiHealthDataQuery == null) {
                Log.w("HiHealthDataStore", "execQuery hiHealthDataQuery is null");
                resultCallback.onResultHandler(4, "hiHealthDataQuery is null");
                return;
            }
            HiHealthDataQueryOption hiHealthDataQueryOption = hiHealthDataQuery.getHiHealthDataQueryOption();
            if (hiHealthDataQueryOption != null && (hiHealthDataQueryOption.getAggregateType() != null || !hiHealthDataQueryOption.getDeviceUuid().isEmpty())) {
                HiHealthAggregateQuery hiHealthAggregateQuery = new HiHealthAggregateQuery(hiHealthDataQuery);
                if (context instanceof OutOfBandContext) {
                    HiHealthKitExtendApi.a((OutOfBandContext) context).c(hiHealthAggregateQuery, i, resultCallback);
                    return;
                } else {
                    resultCallback.onResultHandler(2, "unsupported query option");
                    return;
                }
            }
            com.huawei.hihealth.HiHealthDataQuery hiHealthDataQuery2 = new com.huawei.hihealth.HiHealthDataQuery(hiHealthDataQuery);
            if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).c(hiHealthDataQuery2, i, resultCallback);
            } else {
                HiHealthKitApi.b(context).e(hiHealthDataQuery2, i, resultCallback);
            }
        }
    }

    public static void c(Context context, HiHealthDataQuery hiHealthDataQuery, int i, final ResultCallback resultCallback) {
        if (c(context, "querySleepWakeTime", resultCallback != null ? new IuniversalCallback() { // from class: krx
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i2, Object obj, String str) {
                resultCallback.onResultHandler(i2, str);
            }
        } : null)) {
            if (hiHealthDataQuery == null) {
                Log.w("HiHealthDataStore", "querySleepWakeTime hiHealthDataQuery is null");
                resultCallback.onResultHandler(4, "querySleepWakeTime hiHealthDataQuery is null");
                return;
            }
            com.huawei.hihealth.HiHealthDataQuery hiHealthDataQueryE = e(hiHealthDataQuery);
            if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).a(hiHealthDataQueryE, i, resultCallback);
            } else {
                HiHealthKitApi.b(context).c(hiHealthDataQueryE, i, resultCallback);
            }
        }
    }

    public static void c(Context context, HiHealthDataQuery hiHealthDataQuery, final ResultCallback resultCallback) {
        if (c(context, "getCount", resultCallback != null ? new IuniversalCallback() { // from class: ksd
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                resultCallback.onResultHandler(i, str);
            }
        } : null)) {
            if (hiHealthDataQuery == null) {
                Log.w("HiHealthDataStore", "getCount hiHealthDataQuery is null");
                resultCallback.onResultHandler(4, "hiHealthDataQuery is null");
                return;
            }
            com.huawei.hihealth.HiHealthDataQuery hiHealthDataQueryE = e(hiHealthDataQuery);
            if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).e(hiHealthDataQueryE, resultCallback);
            } else {
                HiHealthKitApi.b(context).b(hiHealthDataQueryE, resultCallback);
            }
        }
    }

    private static com.huawei.hihealth.HiHealthDataQuery e(HiHealthDataQuery hiHealthDataQuery) {
        HiHealthDataQueryOption hiHealthDataQueryOption = hiHealthDataQuery.getHiHealthDataQueryOption();
        return new com.huawei.hihealth.HiHealthDataQuery(hiHealthDataQuery.getSampleType(), hiHealthDataQuery.getStartTime(), hiHealthDataQuery.getEndTime(), hiHealthDataQueryOption != null ? new com.huawei.hihealth.HiHealthDataQueryOption(hiHealthDataQueryOption.getLimit(), hiHealthDataQueryOption.getOffset(), hiHealthDataQueryOption.getOrder()) : null);
    }

    public static void c(Context context, krl krlVar, final ResultCallback resultCallback) {
        if (c(context, "saveSample", resultCallback != null ? new IuniversalCallback() { // from class: ksk
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                resultCallback.onResultHandler(i, str);
            }
        } : null)) {
            if (krlVar == null) {
                Log.w("HiHealthDataStore", "saveSample hiHealthDataQuery is null");
                resultCallback.onResultHandler(4, "hiHealthData is null");
            } else if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).b(krlVar, resultCallback);
            } else {
                HiHealthKitApi.b(context).c(krlVar, resultCallback);
            }
        }
    }

    public static void a(Context context, List<krl> list, final ResultCallback resultCallback) {
        if (c(context, "saveSamples", resultCallback != null ? new IuniversalCallback() { // from class: ksi
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                resultCallback.onResultHandler(i, str);
            }
        } : null)) {
            if (list == null || list.isEmpty()) {
                Log.w("HiHealthDataStore", "saveSamples hiHealthDataList is null or empty");
                resultCallback.onResultHandler(4, "hiHealthDataList is null or empty");
            } else if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).d(list, resultCallback);
            } else {
                HiHealthKitApi.b(context).e(list, resultCallback);
            }
        }
    }

    public static void e(Context context, List<krl> list, final ResultCallback resultCallback) {
        if (c(context, "deleteSamples", resultCallback != null ? new IuniversalCallback() { // from class: ksl
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                resultCallback.onResultHandler(i, str);
            }
        } : null)) {
            if (list == null || list.isEmpty()) {
                Log.w("HiHealthDataStore", "deleteSamples hiHealthDataList is null or empty");
                resultCallback.onResultHandler(4, "hiHealthDataList is null or empty");
            } else if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).a(list, resultCallback);
            } else {
                HiHealthKitApi.b(context).d(list, resultCallback);
            }
        }
    }

    public static void a(Context context, krl krlVar, final ResultCallback resultCallback) {
        if (c(context, "saveSamples", resultCallback != null ? new IuniversalCallback() { // from class: ksp
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                resultCallback.onResultHandler(i, str);
            }
        } : null)) {
            if (krlVar == null) {
                Log.w("HiHealthDataStore", "deleteSample hiHealthData is null or empty");
                resultCallback.onResultHandler(4, "hiHealthData is null or empty");
            } else if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).d(krlVar, resultCallback);
            } else {
                HiHealthKitApi.b(context).d(krlVar, resultCallback);
            }
        }
    }

    public static void d(Context context, final HiRealTimeListener hiRealTimeListener) {
        if (c(context, "startReadingHeartRate", hiRealTimeListener != null ? new IuniversalCallback() { // from class: ksb
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                hiRealTimeListener.onResultHandler(i);
            }
        } : null)) {
            if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).c(hiRealTimeListener);
            } else {
                HiHealthKitApi.b(context).a(hiRealTimeListener);
            }
        }
    }

    public static void c(Context context, final HiRealTimeListener hiRealTimeListener) {
        if (c(context, "stopReadingHeartRate", hiRealTimeListener != null ? new IuniversalCallback() { // from class: ksj
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                hiRealTimeListener.onResultHandler(i);
            }
        } : null)) {
            if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).f(hiRealTimeListener);
            } else {
                HiHealthKitApi.b(context).g(hiRealTimeListener);
            }
        }
    }

    public static void e(Context context, final HiRealTimeListener hiRealTimeListener) {
        if (c(context, "startReadingRri", hiRealTimeListener != null ? new IuniversalCallback() { // from class: krv
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                hiRealTimeListener.onResultHandler(i);
            }
        } : null)) {
            if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).j(hiRealTimeListener);
            } else {
                HiHealthKitApi.b(context).f(hiRealTimeListener);
            }
        }
    }

    public static void a(Context context, final HiRealTimeListener hiRealTimeListener) {
        if (c(context, "stopReadingRri", hiRealTimeListener != null ? new IuniversalCallback() { // from class: kry
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                hiRealTimeListener.onResultHandler(i);
            }
        } : null)) {
            if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).h(hiRealTimeListener);
            } else {
                HiHealthKitApi.b(context).j(hiRealTimeListener);
            }
        }
    }

    private static void a(Context context, final HiSportDataCallback hiSportDataCallback) {
        if (c(context, "startRealTimeSportData", hiSportDataCallback != null ? new IuniversalCallback() { // from class: krs
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                hiSportDataCallback.onResultHandler(i);
            }
        } : null)) {
            if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).c(hiSportDataCallback);
            } else {
                HiHealthKitApi.b(context).e(hiSportDataCallback);
            }
        }
    }

    public static void e(Context context, HiSportDataCallback hiSportDataCallback) {
        a(context, hiSportDataCallback);
    }

    private static void d(Context context, final HiSportDataCallback hiSportDataCallback) {
        if (c(context, "stopRealTimeSportData", hiSportDataCallback != null ? new IuniversalCallback() { // from class: ksf
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                hiSportDataCallback.onResultHandler(i);
            }
        } : null)) {
            if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).d(hiSportDataCallback);
            } else {
                HiHealthKitApi.b(context).d(hiSportDataCallback);
            }
        }
    }

    public static void c(Context context, HiSportDataCallback hiSportDataCallback) {
        d(context, hiSportDataCallback);
    }

    public static void c(Context context, StartSportParam startSportParam, final ResultCallback resultCallback) {
        if (c(context, "startSportEx", resultCallback != null ? new IuniversalCallback() { // from class: ksm
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                resultCallback.onResultHandler(i, str);
            }
        } : null)) {
            HealthKitCommonApi.a(context).a(startSportParam, resultCallback);
        }
    }

    public static void f(Context context, final ResultCallback resultCallback) {
        if (c(context, "stopSport", resultCallback != null ? new IuniversalCallback() { // from class: ksc
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                resultCallback.onResultHandler(i, str);
            }
        } : null)) {
            HealthKitCommonApi.a(context).d(resultCallback);
        }
    }

    public static void c(Context context, HealthKitDictQuery healthKitDictQuery, IuniversalCallback iuniversalCallback) {
        if (c(context, "queryData", iuniversalCallback != null ? iuniversalCallback : null)) {
            if (healthKitDictQuery == null) {
                Log.w("HiHealthDataStore", "queryData healthKitDictQuery is null");
                iuniversalCallback.onResultHandler(2, null, HiHealthError.e(2));
            } else if (context instanceof OutOfBandContext) {
                HiHealthKitExtendApi.a((OutOfBandContext) context).c(healthKitDictQuery, iuniversalCallback);
            } else {
                HiHealthKitApi.b(context).e(healthKitDictQuery, iuniversalCallback);
            }
        }
    }

    public static HiHealthDataType.Category c(Context context, int i) {
        Log.i("HiHealthDataStore", "enter getCategory");
        if (context == null) {
            Log.w("HiHealthDataStore", "saveSample context is null");
            return HiHealthDataType.Category.UNKNOWN;
        }
        if (!ksu.e(context, ksu.b())) {
            Log.w("HiHealthDataStore", "Health application does not exist");
            return HiHealthDataType.Category.UNKNOWN;
        }
        if (context instanceof OutOfBandContext) {
            return HiHealthKitExtendApi.a((OutOfBandContext) context).b(i);
        }
        return HiHealthKitApi.b(context).a(i);
    }

    public static void c(Context context, int[] iArr, final ResultCallback resultCallback) {
        if (c(context, "syncData", resultCallback != null ? new IuniversalCallback() { // from class: ksa
            @Override // com.huawei.hihealth.listener.IuniversalCallback
            public final void onResult(int i, Object obj, String str) {
                resultCallback.onResultHandler(i, str);
            }
        } : null)) {
            HealthKitCommonApi.a(context).a(iArr, resultCallback);
        }
    }

    public static void c(Context context, TrendQuery trendQuery, int i, final IuniversalCallback iuniversalCallback) {
        IuniversalCallback iuniversalCallback2;
        if (iuniversalCallback != null) {
            Objects.requireNonNull(iuniversalCallback);
            iuniversalCallback2 = new IuniversalCallback() { // from class: krz
                @Override // com.huawei.hihealth.listener.IuniversalCallback
                public final void onResult(int i2, Object obj, String str) {
                    iuniversalCallback.onResultHandler(i2, obj, str);
                }
            };
        } else {
            iuniversalCallback2 = null;
        }
        if (c(context, "queryTrends", iuniversalCallback2)) {
            HealthKitCommonApi.a(context).a(trendQuery, i, iuniversalCallback);
        }
    }
}
