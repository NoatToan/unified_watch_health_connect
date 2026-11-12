package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.extractor.ts.TsExtractor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.ProcessUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes19.dex */
public class uub {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pair<Integer, Integer> f50571b = new Pair<>(60, 230);
    private static final Pair<Integer, Integer> e = new Pair<>(45, 130);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pair<Integer, Integer> f50572c = new Pair<>(130, 80);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pair<Integer, Integer> f50570a = new Pair<>(Integer.valueOf(TsExtractor.TS_STREAM_TYPE_E_AC3), 85);
    private static final Pair<Integer, Integer> d = new Pair<>(120, 70);

    private static float e(int i, int i2, int i3) {
        float f = (i - i2) / (i3 - i2);
        if (f < 0.0f) {
            return 0.0f;
        }
        return (f * 64.0f) + 45.0f;
    }

    public static void e(List<dfl> list, ResponseCallback<Object> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("BloodPressureUtils", "saveBloodPressureMeasurePlan callback is null");
            return;
        }
        if (njy.e(list)) {
            LogUtil.j("BloodPressureUtils", "saveBloodPressureMeasurePlan bloodPressureAlarmInfoList ", list);
            responseCallback.onResponse(-1, list);
        } else {
            String strD = HiJsonUtil.d(dfp.c(list));
            Objects.requireNonNull(responseCallback);
            vdo.a("900300001", strD, new cct(responseCallback));
        }
    }

    public static void e(final List<dfl> list) {
        e(list, (ResponseCallback<Object>) new ResponseCallback() { // from class: uud
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                ffv.f(list);
            }
        });
    }

    public static List<dfl> d() {
        final ArrayList arrayList = new ArrayList();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        c((ResponseCallback<List<dfl>>) new ResponseCallback() { // from class: uui
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                uub.b(arrayList, countDownLatch, i, (List) obj);
            }
        });
        try {
            countDownLatch.await();
            return arrayList;
        } catch (InterruptedException e2) {
            LogUtil.e("BloodPressureUtils", "getBloodPressureMeasurePlan interruptedException ", LogAnonymous.b(e2));
            return arrayList;
        }
    }

    static /* synthetic */ void b(List list, CountDownLatch countDownLatch, int i, List list2) {
        list.addAll(list2);
        countDownLatch.countDown();
    }

    public static void c(final ResponseCallback<List<dfl>> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("BloodPressureUtils", "getBloodPressureMeasurePlan callback is null");
        } else {
            d((ResponseCallback<Pair<Long, List<dfl>>>) new ResponseCallback() { // from class: uuh
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    responseCallback.onResponse(i, (List) ((Pair) obj).second);
                }
            });
        }
    }

    public static void d(ResponseCallback<Pair<Long, List<dfl>>> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("BloodPressureUtils", "getBloodPressureMeasurePlanWithModifiedTime callback is null");
        } else {
            vdo.c("900300001", new AnonymousClass2(responseCallback));
        }
    }

    /* JADX INFO: renamed from: uub$2, reason: invalid class name */
    class AnonymousClass2 implements HiDataReadResultListener {
        final /* synthetic */ ResponseCallback e;

        AnonymousClass2(ResponseCallback responseCallback) {
            this.e = responseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(final Object obj, final int i, final int i2) {
            ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
            final ResponseCallback responseCallback = this.e;
            threadPoolManagerC.execute(new Runnable() { // from class: uug
                @Override // java.lang.Runnable
                public final void run() {
                    uub.AnonymousClass2.c(obj, i, i2, responseCallback);
                }
            });
        }

        static /* synthetic */ void c(Object obj, int i, int i2, ResponseCallback responseCallback) {
            LogUtil.a("BloodPressureUtils", "getBloodPressureMeasurePlanWithModifiedTime onResult object ", obj, " errorCode ", Integer.valueOf(i), " anchor ", Integer.valueOf(i2));
            if (!njy.b(obj, HiSampleConfig.class)) {
                responseCallback.onResponse(i, new Pair(0L, uub.c()));
                return;
            }
            List list = (List) obj;
            if (njy.e(list)) {
                responseCallback.onResponse(i, new Pair(0L, uub.c()));
                return;
            }
            HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(0);
            if (hiSampleConfig == null) {
                responseCallback.onResponse(i, new Pair(0L, uub.c()));
                return;
            }
            long modifiedTime = hiSampleConfig.getModifiedTime();
            String configData = hiSampleConfig.getConfigData();
            if (TextUtils.isEmpty(configData)) {
                responseCallback.onResponse(i, new Pair(Long.valueOf(modifiedTime), uub.c()));
                return;
            }
            List<dfl> listD = dfp.d((dfm) HiJsonUtil.d(configData, dfm.class));
            if (njy.e(listD)) {
                responseCallback.onResponse(i, new Pair(Long.valueOf(modifiedTime), uub.c()));
            } else {
                responseCallback.onResponse(i, new Pair(Long.valueOf(modifiedTime), listD));
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("BloodPressureUtils", "getBloodPressureMeasurePlanWithModifiedTime intentType ", Integer.valueOf(i), " object ", obj, " errorCode ", Integer.valueOf(i2), " anchor ", Integer.valueOf(i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<dfl> c() {
        if (Utils.k()) {
            LogUtil.j("BloodPressureUtils", "getOldBloodPressureMeasurePlan isOverseaNoCloudVersion ");
            return Collections.EMPTY_LIST;
        }
        List<dfl> listE = ffv.e();
        if (!njy.e(listE)) {
            return listE;
        }
        LogUtil.j("BloodPressureUtils", "getOldBloodPressureMeasurePlan alarmInfoList ", listE);
        return Collections.EMPTY_LIST;
    }

    public static void d(boolean z) {
        if (z) {
            Calendar calendar = Calendar.getInstance();
            int i = 7;
            if (Utils.o()) {
                calendar.set(7, 7);
            } else {
                calendar.set(7, 1);
                i = 1;
            }
            calendar.set(11, 20);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            long timeInMillis = calendar.getTimeInMillis();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jA = a(i, 20, 21);
            if (jCurrentTimeMillis > timeInMillis) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(jA);
                calendar2.add(4, 1);
                jA = calendar2.getTimeInMillis();
            }
            LogUtil.a("BloodPressureUtils", "setting time ", DateFormatUtil.d(jA, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT));
            vym.b(1100, jA, 604800000L);
            return;
        }
        vym.d(1100);
    }

    public static int c(Context context) {
        int i = 0;
        try {
            SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase("device.db", 0, null);
            try {
                Cursor cursorQuery = sQLiteDatabaseOpenOrCreateDatabase.query("device", new String[]{"productId"}, "kind = 'HDK_BLOOD_PRESSURE'", null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        i++;
                    } catch (Throwable th) {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (sQLiteDatabaseOpenOrCreateDatabase != null) {
                    sQLiteDatabaseOpenOrCreateDatabase.close();
                }
                return i;
            } catch (Throwable th3) {
                if (sQLiteDatabaseOpenOrCreateDatabase != null) {
                    try {
                        sQLiteDatabaseOpenOrCreateDatabase.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (SQLException unused) {
            LogUtil.e("BloodPressureUtils", "getBondedProducts SQLException");
            return i;
        }
    }

    public static long a(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(7, i);
        int iNextInt = new SecureRandom().nextInt(((i3 - i2) * 60) + 1);
        calendar.set(11, i2 + (iNextInt / 60));
        calendar.set(12, iNextInt % 60);
        calendar.set(13, 0);
        calendar.set(14, 0);
        ReleaseLogUtil.d("R_BloodPressureUtils", "getRandomTime: ", Integer.valueOf(calendar.get(11)), ":", Integer.valueOf(calendar.get(12)), " ", Long.valueOf(calendar.getTimeInMillis()));
        return calendar.getTimeInMillis();
    }

    public static float e(int i, int i2) {
        Pair<Integer, Integer> pairB = b("Twenty-four-hours");
        if (i >= ((Integer) pairB.first).intValue() && i2 >= ((Integer) pairB.second).intValue()) {
            return e(i, ((Integer) pairB.first).intValue(), ((Integer) f50571b.second).intValue());
        }
        if (i >= ((Integer) pairB.first).intValue()) {
            return e(i, ((Integer) pairB.first).intValue(), ((Integer) f50571b.second).intValue());
        }
        if (i2 >= ((Integer) pairB.second).intValue()) {
            return e(i2, ((Integer) pairB.second).intValue(), ((Integer) e.second).intValue());
        }
        return c(i, i2, ((Integer) pairB.first).intValue(), ((Integer) pairB.second).intValue());
    }

    private static float c(int i, int i2, int i3, int i4) {
        int i5;
        int iIntValue = ((Integer) f50571b.first).intValue();
        int iIntValue2 = ((Integer) e.first).intValue();
        int i6 = i3 - iIntValue;
        if (i6 == 0 || (i5 = i4 - iIntValue2) == 0) {
            LogUtil.j("BloodPressureUtils", "systolic is minSystolic or diastolic is minDiastolic");
            return 0.0f;
        }
        float f = (i - iIntValue) / i6;
        float f2 = (i2 - iIntValue2) / i5;
        if (f <= 0.0f) {
            f = 0.0f;
        }
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        int i7 = (f < 0.0f ? 0 : 1) + (f2 < 0.0f ? 0 : 1);
        if (i7 == 0) {
            return 0.0f;
        }
        return Math.max(Math.min((f + f2) / i7, 1.0f), 0.0f) * 45.0f;
    }

    public static boolean a(int i, int i2) {
        Pair<Integer, Integer> pairB = b("Twenty-four-hours");
        return i >= ((Integer) pairB.first).intValue() || i2 >= ((Integer) pairB.second).intValue();
    }

    public static Pair<Integer, Integer> b(String str) {
        ArrayList<fdg> arrayListE = fdm.d().e();
        if (njy.e(arrayListE)) {
            LogUtil.j("BloodPressureUtils", "gradeList is empty!");
            if ("Twenty-four-hours".equals(str)) {
                return f50572c;
            }
            if ("day".equals(str)) {
                return f50570a;
            }
            if ("night".equals(str)) {
                return d;
            }
            LogUtil.e("BloodPressureUtils", "bloodPressureType is error");
            return f50572c;
        }
        int iIntValue = 0;
        int iIntValue2 = 0;
        for (int i = 0; i < arrayListE.size(); i++) {
            fdg fdgVar = arrayListE.get(i);
            if (fdgVar == null) {
                LogUtil.e("BloodPressureUtils", "bloodPressureFeatureInfo is null");
            } else if (str.equals(fdgVar.d())) {
                List<fdg.b> listC = fdgVar.c();
                if (njy.e(listC)) {
                    LogUtil.e("BloodPressureUtils", "thresholdList is empty");
                } else {
                    fdg.b bVar = listC.get(0);
                    if (bVar == null) {
                        LogUtil.e("BloodPressureUtils", "dynamicBloodPressureTypeCategorization is null");
                    } else {
                        List<Integer> listC2 = bVar.c();
                        List<Integer> listB = bVar.b();
                        if (njy.e(listC2) || njy.e(listB)) {
                            LogUtil.e("BloodPressureUtils", "sysList or diaList is empty");
                        } else if (!njy.c(listC2, 1) || !njy.c(listB, 1)) {
                            LogUtil.e("BloodPressureUtils", "sysList or diaList is out bounds");
                        } else {
                            iIntValue = listC2.get(1).intValue();
                            iIntValue2 = listB.get(1).intValue();
                        }
                    }
                }
            }
        }
        return new Pair<>(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
    }

    public static boolean a() {
        if (!ProcessUtil.b()) {
            LogUtil.j("BloodPressureUtils", "isDeviceSupportDynamicBp not in main process");
            return false;
        }
        DeviceInfo deviceInfoD = mgg.d("BloodPressureUtils");
        if (deviceInfoD == null) {
            LogUtil.j("BloodPressureUtils", "isDeviceSupportDynamicBp deviceInfo is null");
            return false;
        }
        boolean zD = eey.d(deviceInfoD, 205);
        LogUtil.a("BloodPressureUtils", "isDeviceSupportDynamicBp isSupport : ", Boolean.valueOf(zD));
        return zD;
    }

    public static void b(final ResponseCallback<dfk> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("BloodPressureUtils", "getBloodPressureReminderPlan callback is null");
        } else {
            vdo.c("900300060", new HiDataReadResultListener() { // from class: uub.5
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(final Object obj, final int i, final int i2) {
                    ThreadPoolManager.c().execute(new Runnable() { // from class: uub.5.2
                        @Override // java.lang.Runnable
                        public void run() {
                            LogUtil.a("BloodPressureUtils", "getBloodPressureReminderPlan onResult object ", obj, " errorCode ", Integer.valueOf(i), " anchor ", Integer.valueOf(i2));
                            if (!njy.b(obj, HiSampleConfig.class)) {
                                LogUtil.j("BloodPressureUtils", "getBloodPressureReminderPlan type match fail!");
                                return;
                            }
                            List list = (List) obj;
                            if (njy.e(list)) {
                                LogUtil.j("BloodPressureUtils", "getBloodPressureReminderPlan list empty!");
                                return;
                            }
                            HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(0);
                            if (hiSampleConfig == null) {
                                LogUtil.j("BloodPressureUtils", "getBloodPressureReminderPlan empty!");
                                return;
                            }
                            String configData = hiSampleConfig.getConfigData();
                            if (TextUtils.isEmpty(configData)) {
                                LogUtil.j("BloodPressureUtils", "getBloodPressureReminderPlan configData empty!");
                            } else {
                                responseCallback.onResponse(i, (dfk) HiJsonUtil.d(configData, dfk.class));
                            }
                        }
                    });
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                    LogUtil.a("BloodPressureUtils", "getBloodPressureReminderPlan intentType ", Integer.valueOf(i), " object ", obj, " errorCode ", Integer.valueOf(i2), " anchor ", Integer.valueOf(i3));
                }
            });
        }
    }

    public static void d(dfk dfkVar, ResponseCallback<Object> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("BloodPressureUtils", "saveBloodPressureRemindPlan callback is null");
            return;
        }
        if (njy.e(dfkVar.a())) {
            LogUtil.j("BloodPressureUtils", "saveBloodPressureRemindPlan getReminderPlans ", dfkVar.toString());
            responseCallback.onResponse(-1, dfkVar);
        } else {
            String strD = HiJsonUtil.d(dfkVar);
            Objects.requireNonNull(responseCallback);
            vdo.a("900300060", strD, new cct(responseCallback));
        }
    }
}
