package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import health.compact.a.UnitUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class uwa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f50628b = "sport_notification";
    public static String d = "sleep_notification";

    private static long b(long j, float f, long j2, float f2, float f3) {
        return ((long) (((f - f3) * (j2 - j)) / (f - f2))) + j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(int i) {
        return (i == 262 || i == 281 || i == 264 || i == 265) ? 0 : 1;
    }

    public static void d(long j, long j2) {
        LogUtil.a("BloodSugarEventHandler", "handleSleepBloodSugarEvent");
        emq.a("sync_sleep_time_key", j + "," + j2);
    }

    public static void d() {
        LogUtil.a("BloodSugarEventHandler", "recordSportBloodSugarEvent");
        nkb.d().c(new b());
    }

    public static void b() {
        LogUtil.a("BloodSugarEventHandler", "handleSleepBloodSugarEvent");
        String strA = a("sync_sleep_time_key");
        if (TextUtils.isEmpty(strA)) {
            LogUtil.a("BloodSugarEventHandler", "timeString is null");
            return;
        }
        String[] strArrSplit = strA.split(",");
        if (strArrSplit.length < 2) {
            LogUtil.a("BloodSugarEventHandler", "size to small");
            return;
        }
        String str = strArrSplit[0];
        String str2 = strArrSplit[1];
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.a("BloodSugarEventHandler", "two time is null");
            return;
        }
        try {
            d(Long.parseLong(str), Long.parseLong(str2), 0, -1);
        } catch (NumberFormatException unused) {
            LogUtil.e("BloodSugarEventHandler", "String to long is wrong");
        }
    }

    public static void a() {
        LogUtil.a("BloodSugarEventHandler", "handleSportBloodSugarEvent");
        String strA = a("sync_sport_time_key");
        if (TextUtils.isEmpty(strA)) {
            LogUtil.a("BloodSugarEventHandler", "timeString is null");
            return;
        }
        String[] strArrSplit = strA.split(",");
        if (strArrSplit.length < 3) {
            LogUtil.a("BloodSugarEventHandler", "size to small");
            return;
        }
        String str = strArrSplit[0];
        String str2 = strArrSplit[1];
        String str3 = strArrSplit[2];
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            LogUtil.a("BloodSugarEventHandler", "two time is null");
            return;
        }
        try {
            d(Long.parseLong(str), Long.parseLong(str2), 1, Integer.parseInt(str3));
        } catch (NumberFormatException unused) {
            LogUtil.e("BloodSugarEventHandler", "String parse is wrong");
        }
    }

    private static String a(String str) {
        String strB = emq.b(str);
        emq.a(str, "");
        return strB;
    }

    private static void d(long j, long j2, int i, int i2) {
        LogUtil.a("BloodSugarEventHandler", "type=", Integer.valueOf(i), ", queryBloodSugarContinueData");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setType(new int[]{2108});
        hiDataReadOption.setReadType(0);
        hiDataReadOption.setSortOrder(0);
        Bundle bundle = new Bundle();
        bundle.putLong("key_start_time", j);
        bundle.putLong("key_end_time", j2);
        if (i2 != -1) {
            bundle.putInt("key_sport_type", i2);
        }
        nkb.d().b(BaseApplication.getContext(), hiDataReadOption, new c(i, bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(long j, long j2, List<HiHealthData> list) {
        LogUtil.a("BloodSugarEventHandler", "handleSleepBloodSugarData");
        ArrayList arrayList = new ArrayList(4);
        float f = emq.d()[1];
        int i = 0;
        long jA = 0;
        HiHealthData hiHealthData = null;
        HiHealthData hiHealthData2 = null;
        for (HiHealthData hiHealthData3 : list) {
            if (hiHealthData != null && hiHealthData3.getEndTime() - hiHealthData.getEndTime() > 2100000 && !arrayList.isEmpty()) {
                arrayList.add(hiHealthData);
                arrayList.add(hiHealthData);
                i++;
                jA += a(arrayList, f);
                arrayList.clear();
            }
            if (hiHealthData3.getFloatValue() <= f) {
                if (arrayList.isEmpty()) {
                    if (hiHealthData == null) {
                        hiHealthData = hiHealthData3;
                    }
                    arrayList.add(hiHealthData);
                    arrayList.add(hiHealthData3);
                }
                hiHealthData2 = hiHealthData3;
            } else if (!arrayList.isEmpty()) {
                arrayList.add(hiHealthData);
                arrayList.add(hiHealthData3);
                i++;
                jA += a(arrayList, f);
                arrayList.clear();
            }
            hiHealthData = hiHealthData3;
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(hiHealthData);
            arrayList.add(hiHealthData);
            i++;
            jA += a(arrayList, f);
        }
        d(jA, i, hiHealthData2, j, j2);
    }

    private static void d(long j, int i, HiHealthData hiHealthData, long j2, long j3) {
        if (i == 0) {
            return;
        }
        LogUtil.a("BloodSugarEventHandler", "time=", Long.valueOf(j), ", count=", Integer.valueOf(i));
        int iRound = Math.round(((j / 1000.0f) / 60.0f) / i);
        long endTime = hiHealthData.getEndTime();
        Resources resources = BaseApplication.getContext().getResources();
        e(endTime, resources.getString(R.string.IDS_hypoglycaemia_notify_title), resources.getString(R.string.IDS_hypoglycaemia_notify_desc, DateFormatUtil.a(j2, DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE), DateFormatUtil.a(j3, DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE), resources.getQuantityString(R.plurals.IDS_hypoglycaemia_event, i, Integer.valueOf(i)), resources.getQuantityString(R.plurals.IDS_hw_map_time_unit_value_minutes, iRound, Integer.valueOf(iRound))), d);
    }

    private static long a(List<HiHealthData> list, float f) {
        if (list.size() != 4) {
            LogUtil.j("BloodSugarEventHandler", "getIntervalTime error");
            return 0L;
        }
        HiHealthData hiHealthData = list.get(0);
        HiHealthData hiHealthData2 = list.get(1);
        long jB = b(hiHealthData.getEndTime(), hiHealthData.getFloatValue(), hiHealthData2.getEndTime(), hiHealthData2.getFloatValue(), f);
        HiHealthData hiHealthData3 = list.get(2);
        HiHealthData hiHealthData4 = list.get(3);
        return b(hiHealthData3.getEndTime(), hiHealthData3.getFloatValue(), hiHealthData4.getEndTime(), hiHealthData4.getFloatValue(), f) - jB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(long j, List<HiHealthData> list, int i) {
        String string;
        LogUtil.a("BloodSugarEventHandler", "handleSleepBloodSugarData");
        long j2 = 0;
        int i2 = 0;
        for (HiHealthData hiHealthData : list) {
            long endTime = hiHealthData.getEndTime();
            if (b(hiHealthData) == 1003) {
                i2++;
            }
            j2 = endTime;
        }
        String strE = UnitUtil.e(new BigDecimal(i2).divide(new BigDecimal(list.size()), 2, 4).multiply(BigDecimal.valueOf(100L)).doubleValue(), 2, 0);
        LogUtil.a("BloodSugarEventHandler", "proportion : ", strE);
        Resources resources = BaseApplication.getContext().getResources();
        String string2 = resources.getString(R.string.IDS_hw_show_healthdata_monitoring);
        if (i == 0) {
            string = resources.getString(R.string.IDS_blood_sugar_notification2);
        } else {
            string = resources.getString(R.string.IDS_blood_sugar_notification);
        }
        e(j2, string2, String.format(Locale.ENGLISH, string, DateFormatUtil.a(j, DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE), strE), f50628b);
    }

    private static int b(HiHealthData hiHealthData) {
        try {
            return Integer.parseInt(uvz.d(BaseApplication.getContext(), hiHealthData.getType(), hiHealthData.getFloatValue()).get("HEALTH_BLOOD_SUGAR_LEVEL_KEY"));
        } catch (NumberFormatException unused) {
            LogUtil.j("BloodSugarEventHandler", "levelValue is String, parse to Integer error");
            return 1000;
        }
    }

    private static void e(final long j, final String str, final String str2, final String str3) {
        LogUtil.a("BloodSugarEventHandler", "sendNotification, ", str3);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: uwb
            @Override // java.lang.Runnable
            public final void run() {
                uwa.d(j, str3, str, str2);
            }
        });
    }

    static /* synthetic */ void d(long j, String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("extra_service_id", "BloodSugarCardConstructor");
        map.put("extra_page_type", String.valueOf(8));
        map.put("extra_time_stamp", String.valueOf(j));
        map.put("notification_type", str);
        miy.e(BaseApplication.getContext()).d(miy.b("healthDetail", map, str2, str3), lsb.d());
    }

    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bundle f50629a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f50630c;

        c(int i, Bundle bundle) {
            this.f50630c = i;
            this.f50629a = bundle;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (!(obj instanceof List)) {
                LogUtil.a("BloodSugarEventHandler", "type=", Integer.valueOf(this.f50630c), ", no bloodsugar data");
                return;
            }
            List list = (List) obj;
            if (njy.e(list)) {
                LogUtil.a("BloodSugarEventHandler", "type=", Integer.valueOf(this.f50630c), ", HiHealthData List is Empty!");
                return;
            }
            LogUtil.a("BloodSugarEventHandler", "type=", Integer.valueOf(this.f50630c), ", handleBloodSugarData");
            int i2 = this.f50630c;
            if (i2 == 0) {
                if (this.f50629a.containsKey("key_start_time") && this.f50629a.containsKey("key_end_time")) {
                    uwa.b(this.f50629a.getLong("key_start_time"), this.f50629a.getLong("key_end_time"), (List<HiHealthData>) list);
                    return;
                }
                return;
            }
            if (i2 == 1) {
                if (this.f50629a.containsKey("key_start_time") && this.f50629a.containsKey("key_sport_type")) {
                    uwa.d(this.f50629a.getLong("key_start_time"), list, this.f50629a.getInt("key_sport_type"));
                    return;
                }
                return;
            }
            LogUtil.a("BloodSugarEventHandler", "not know type = ", Integer.valueOf(i2));
        }
    }

    static class b implements IBaseResponseCallback {
        private b() {
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (!(obj instanceof MotionPathSimplify)) {
                LogUtil.a("BloodSugarEventHandler", "no sport data");
                return;
            }
            MotionPathSimplify motionPathSimplify = (MotionPathSimplify) obj;
            LogUtil.a("BloodSugarEventHandler", "save sport data to sp, ", motionPathSimplify.requestStartTime() + "," + motionPathSimplify.requestEndTime() + "," + uwa.d(motionPathSimplify.requestSportType()));
            emq.a("sync_sport_time_key", motionPathSimplify.requestStartTime() + "," + motionPathSimplify.requestEndTime() + "," + uwa.d(motionPathSimplify.requestSportType()));
        }
    }
}
