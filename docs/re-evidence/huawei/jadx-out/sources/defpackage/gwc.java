package defpackage;

import android.text.TextUtils;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class gwc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f36128a = "SleepDataUtils";

    public static int c(int i) {
        if (i > 85 && i <= 100) {
            return 0;
        }
        if (i < 75 || i > 85) {
            return (i <= 60 || i >= 75) ? 3 : 2;
        }
        return 1;
    }

    public static int d(int i, int i2) {
        if (i == -2) {
            i = 0;
        }
        int i3 = i < 10 ? 100 - (i * 2) : 90 - i;
        if (i3 < 0) {
            i3 = 0;
        }
        if (i == 0 && i2 == 0) {
            return 0;
        }
        return i3;
    }

    public static int b(int i) {
        int i2;
        if (i < 30) {
            i2 = 100 - ((i * 2) / 3);
        } else {
            i2 = i < 190 ? 95 - (i / 2) : 0;
        }
        LogUtil.a(f36128a, "score = " + i2);
        return i2;
    }

    public static long a(long j, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            str = "+8:00";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.setTimeZone(TimeZone.getTimeZone("GMT" + str));
        calendar.add(5, i);
        calendar.set(11, 20);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static int b(double d, long j) {
        int i = ((int) (((long) d) - j)) / 60000;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public static float b(float f) {
        if (f >= 0.0f && f < 0.5f) {
            return 20.0f;
        }
        if (f >= 0.5f && f < 0.6f) {
            return b(1, new double[]{f, 0.5d, 40.0d, 20.0d, 0.6000000238418579d, 0.5d, 20.0d});
        }
        if (f >= 0.6f && f < 0.8f) {
            return b(1, new double[]{f, 0.6000000238418579d, 60.0d, 40.0d, 0.800000011920929d, 0.6000000238418579d, 40.0d});
        }
        if (f >= 0.8f && f < 0.85f) {
            return b(1, new double[]{f, 0.800000011920929d, 70.0d, 60.0d, 0.8500000238418579d, 0.800000011920929d, 60.0d});
        }
        if (f >= 0.85f && f < 0.9f) {
            return b(1, new double[]{f, 0.8500000238418579d, 80.0d, 70.0d, 0.8999999761581421d, 0.8500000238418579d, 70.0d});
        }
        if (f >= 0.9f && f < 0.95f) {
            return b(1, new double[]{f, 0.8999999761581421d, 90.0d, 80.0d, 0.949999988079071d, 0.8999999761581421d, 80.0d});
        }
        if (f >= 0.95f) {
            return b(1, new double[]{f, 0.949999988079071d, 100.0d, 90.0d, 1.0d, 0.949999988079071d, 90.0d});
        }
        LogUtil.a(f36128a, "effieiceny wrong !");
        return 100.0f;
    }

    public static float e(int i) {
        if (i >= 0 && i < 240) {
            return 20.0f;
        }
        if (i >= 240 && i < 288) {
            return b(0, new double[]{20.0d, i, 240.0d, 40.0d, 20.0d, 288.0d, 240.0d});
        }
        if (i >= 288 && i < 336) {
            return b(0, new double[]{40.0d, i, 288.0d, 60.0d, 40.0d, 336.0d, 288.0d});
        }
        if (i >= 336 && i < 384) {
            return b(0, new double[]{60.0d, i, 336.0d, 70.0d, 60.0d, 384.0d, 336.0d});
        }
        if (i >= 384 && i < 432) {
            return b(0, new double[]{70.0d, i, 384.0d, 80.0d, 70.0d, 432.0d, 384.0d});
        }
        if (i >= 432 && i < 480) {
            return b(0, new double[]{80.0d, i, 432.0d, 90.0d, 80.0d, 480.0d, 432.0d});
        }
        if (i >= 480 && i < 504) {
            return b(0, new double[]{90.0d, i, 480.0d, 100.0d, 90.0d, 504.0d, 480.0d});
        }
        if (i >= 504 && i < 516) {
            return b(0, new double[]{100.0d, i, 504.0d, 90.0d, 100.0d, 516.0d, 504.0d});
        }
        if (i >= 516 && i < 528) {
            return b(0, new double[]{90.0d, i, 516.0d, 80.0d, 90.0d, 528.0d, 516.0d});
        }
        if (i < 528 || i >= 570) {
            return (i < 570 || i >= 600) ? b(0, new double[]{60.0d, i, 600.0d, 40.0d, 60.0d, 1440.0d, 600.0d}) : b(0, new double[]{70.0d, i, 570.0d, 60.0d, 70.0d, 600.0d, 570.0d});
        }
        return b(0, new double[]{80.0d, i, 528.0d, 70.0d, 80.0d, 570.0d, 528.0d});
    }

    public static float a(int i) {
        if (i < 0) {
            return 0.0f;
        }
        if (i >= 0 && i < 10) {
            return b(0, new double[]{100.0d, i, 0.0d, 90.0d, 100.0d, 10.0d, 0.0d});
        }
        if (i >= 10 && i < 20) {
            return b(0, new double[]{90.0d, i, 10.0d, 80.0d, 90.0d, 20.0d, 10.0d});
        }
        if (i >= 20 && i < 30) {
            return b(0, new double[]{80.0d, i, 20.0d, 70.0d, 80.0d, 30.0d, 20.0d});
        }
        if (i >= 30 && i < 60) {
            return b(0, new double[]{70.0d, i, 30.0d, 60.0d, 70.0d, 60.0d, 30.0d});
        }
        if (i < 60 || i >= 120) {
            return 40.0f;
        }
        return b(0, new double[]{60.0d, i, 60.0d, 40.0d, 60.0d, 120.0d, 60.0d});
    }

    private static float b(int i, double[] dArr) {
        double d;
        if (i == 0) {
            d = dArr[0] + (((dArr[1] - dArr[2]) * (dArr[3] - dArr[4])) / (dArr[5] - dArr[6]));
        } else {
            if (i != 1) {
                return 0.0f;
            }
            d = (((dArr[0] - dArr[1]) * (dArr[2] - dArr[3])) / (dArr[4] - dArr[5])) + dArr[6];
        }
        return (float) d;
    }

    public static boolean e(HiHealthData hiHealthData) {
        return hiHealthData.getInt("sleep_version") == 5;
    }

    public static SleepViewConstants.SleepTypeEnum e(HiHealthData hiHealthData, List<HiHealthData> list) {
        int i = hiHealthData.getInt("core_sleep_deep_key");
        int i2 = hiHealthData.getInt("core_sleep_shallow_key");
        int i3 = hiHealthData.getInt("core_sleep_wake_key");
        int i4 = hiHealthData.getInt("core_sleep_wake_count_key");
        int i5 = hiHealthData.getInt("core_sleep_wake_dream_key");
        int i6 = hiHealthData.getInt("core_sleep_day_sleep_time_key");
        int i7 = hiHealthData.getInt("core_sleep_score_key");
        int i8 = hiHealthData.getInt("core_sleep_total_sleep_time_key");
        int i9 = hiHealthData.getInt("common_sleep_duration_sleep_sum_key");
        int i10 = hiHealthData.getInt("data_session_manual_sleep_bed_time_key");
        int i11 = hiHealthData.getInt("sleep_device_category_key");
        if (e(hiHealthData)) {
            i = hiHealthData.getInt("core_sleep_deep_key_aasm");
            i2 = hiHealthData.getInt("core_sleep_shallow_key_aasm");
            i5 = hiHealthData.getInt("core_sleep_rem_key_aasm");
        }
        long jD = d(list);
        boolean z = i2 > 0 || i > 0 || i5 > 0;
        boolean z2 = i10 > 0;
        LogUtil.a(f36128a, "deepSum is", Integer.valueOf(i), "shallowSum is", Integer.valueOf(i2), "coreWakeSum is", Integer.valueOf(i3), "wakeCount is", Integer.valueOf(i4), "dreamSum is", Integer.valueOf(i5), "noonSum is", Integer.valueOf(i6), "score is", Integer.valueOf(i7), "sleepTotalTime is", Integer.valueOf(i8), " manualBedTime is ", Integer.valueOf(i10), " isSum:", Boolean.valueOf(z), " isHasManual:", Boolean.valueOf(z2), " checkCommonTime:", Integer.valueOf(i9), " sleepDeviceCategory:", Integer.valueOf(i11));
        ReleaseLogUtil.d("R_Sleep_" + f36128a, "sync success, code_st is ", Integer.valueOf(i8), " code_sc is ", Integer.valueOf(i7), " code_nn is ", Integer.valueOf(i6), " time is ", HiDateUtil.e(hiHealthData.getStartTime(), "yyyyMMdd"));
        SleepViewConstants.SleepTypeEnum sleepTypeEnumJ = SleepViewConstants.SleepTypeEnum.COMMON;
        if (i11 != 0) {
            if (z) {
                sleepTypeEnumJ = j(i11);
            } else if (i9 != 0) {
                sleepTypeEnumJ = SleepViewConstants.SleepTypeEnum.COMMON;
            } else if (d(i11)) {
                sleepTypeEnumJ = SleepViewConstants.SleepTypeEnum.MANUAL;
            } else if (i6 != 0) {
                sleepTypeEnumJ = j(i11);
            }
        } else if (z) {
            if (i7 != 0 || i5 != 0) {
                sleepTypeEnumJ = SleepViewConstants.SleepTypeEnum.SCIENCE;
            } else if (jD > 0) {
                sleepTypeEnumJ = SleepViewConstants.SleepTypeEnum.PHONE;
            }
        } else if (i9 != 0) {
            sleepTypeEnumJ = SleepViewConstants.SleepTypeEnum.COMMON;
        } else if (z2) {
            sleepTypeEnumJ = SleepViewConstants.SleepTypeEnum.MANUAL;
        } else if (i6 != 0) {
            sleepTypeEnumJ = SleepViewConstants.SleepTypeEnum.SCIENCE;
        }
        LogUtil.a(f36128a, "getSleepDeviceCategory sleepType: ", sleepTypeEnumJ);
        return sleepTypeEnumJ;
    }

    private static SleepViewConstants.SleepTypeEnum j(int i) {
        SleepViewConstants.SleepTypeEnum sleepTypeEnum = SleepViewConstants.SleepTypeEnum.COMMON;
        if (i(i)) {
            sleepTypeEnum = SleepViewConstants.SleepTypeEnum.SCIENCE;
        } else if (g(i)) {
            sleepTypeEnum = SleepViewConstants.SleepTypeEnum.PHONE;
        }
        LogUtil.a(f36128a, "judgeScienceAndPhone:", sleepTypeEnum);
        return sleepTypeEnum;
    }

    public static long d(List<HiHealthData> list) {
        long j = -1;
        if (njy.e(list)) {
            return -1L;
        }
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData.getLong("bedTime") != 0) {
                j = hiHealthData.getLong("bedTime");
            }
        }
        return j;
    }

    public static int a(List<Integer> list, int i, int i2) {
        int i3 = 0;
        if (i2 == 0 || list == null) {
            return 0;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue() - i;
            i3 += iIntValue * iIntValue;
        }
        return Math.round(i3 / i2);
    }

    public static int a(gxq gxqVar) {
        int iV = ((gxl) gxqVar.b()).v() + ((gxo) gxqVar.g()).al() + ((gxp) gxqVar.k()).bt() + ((gxn) gxqVar.h()).ac();
        int iU = ((gxl) gxqVar.b()).u();
        int iAr = ((gxo) gxqVar.g()).ar();
        int iBs = ((gxp) gxqVar.k()).bs();
        int iAb = ((gxn) gxqVar.h()).ab();
        if (iV > 0) {
            return Math.round((((iU + iAr) + iBs) + iAb) / iV);
        }
        return 0;
    }

    /* JADX INFO: renamed from: gwc$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[SleepViewConstants.SleepTypeEnum.values().length];
            e = iArr;
            try {
                iArr[SleepViewConstants.SleepTypeEnum.SCIENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[SleepViewConstants.SleepTypeEnum.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[SleepViewConstants.SleepTypeEnum.MANUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[SleepViewConstants.SleepTypeEnum.COMMON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static gxi b(gxq gxqVar) {
        int i = AnonymousClass4.e[gxqVar.n().ordinal()];
        if (i == 1) {
            return gxqVar.k();
        }
        if (i == 2) {
            return gxqVar.g();
        }
        if (i == 3) {
            return gxqVar.h();
        }
        if (i == 4) {
            return gxqVar.b();
        }
        return new gxi();
    }

    public static boolean i(int i) {
        return i == Integer.parseInt("06E", 16) || i == Integer.parseInt("06D", 16);
    }

    public static boolean g(int i) {
        return qqk.a(i);
    }

    public static boolean d(int i) {
        return i == CommonUtil.c("001", 16);
    }

    public static boolean c(gxq gxqVar) {
        return gxqVar.n() == SleepViewConstants.SleepTypeEnum.PHONE && gxqVar.g().ab();
    }

    public static boolean e(gxq gxqVar) {
        return gxqVar.n() == SleepViewConstants.SleepTypeEnum.SCIENCE && gxqVar.k().ay();
    }

    public static int a(long j, int i) {
        if (i != 365) {
            return i;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        int i2 = calendar.get(1);
        return ((i2 % 4 != 0 || i2 % 100 == 0) && i2 % 400 != 0) ? 365 : 366;
    }

    public static void c(HiHealthData hiHealthData, gxm gxmVar) {
        if (d(hiHealthData)) {
            long jB = b(hiHealthData, gxmVar.l());
            long jB2 = b(hiHealthData, hiHealthData.getLong("risingTime"));
            if (jB < jB2) {
                gxmVar.b(jB2);
            } else if (jB == jB2) {
                gxmVar.a(jB2);
            }
        }
    }

    public static boolean d(HiHealthData hiHealthData) {
        return hiHealthData.getLong("bedTime") < b(hiHealthData, hiHealthData.getLong("risingTime"));
    }

    public static long b(HiHealthData hiHealthData, long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        if (calendar.get(11) <= 20) {
            return qqk.c(j, hiHealthData.getTimeZone(), -1);
        }
        return qqk.c(j, hiHealthData.getTimeZone(), 0);
    }

    public static int d(SleepViewConstants.SleepTypeEnum sleepTypeEnum, HiHealthData hiHealthData, long j, int[] iArr) {
        long startTime;
        if (sleepTypeEnum == SleepViewConstants.SleepTypeEnum.MANUAL) {
            startTime = qqk.a(hiHealthData.getLong("data_session_manual_sleep_get_up_time_key"), hiHealthData.getTimeZone());
        } else {
            startTime = hiHealthData.getStartTime();
        }
        if (iArr[2] == 3) {
            return lsl.a(j, startTime) - 1;
        }
        int iL = lsl.l(j);
        int iL2 = lsl.l(startTime);
        return iL2 < iL ? (iL2 + 12) - iL : iL2 - iL;
    }

    public static void a(HiHealthData hiHealthData, gxs gxsVar) {
        double d = hiHealthData.getDouble("core_sleep_fall_key");
        double d2 = hiHealthData.getDouble("core_sleep_wake_up_key");
        gxsVar.c((long) d);
        gxsVar.e((long) d2);
        gxsVar.n(hiHealthData.getInt("core_sleep_deep_key"));
        gxsVar.ad(hiHealthData.getInt("core_sleep_shallow_key"));
        gxsVar.v(hiHealthData.getInt("core_sleep_wake_dream_key"));
        gxsVar.ah(hiHealthData.getInt("core_sleep_wake_key"));
        gxsVar.ae(hiHealthData.getInt("core_sleep_wake_count_key"));
        gxsVar.ab(hiHealthData.getInt("core_sleep_score_key"));
        gxsVar.z(hiHealthData.getInt("core_sleep_snore_freq_key"));
        gxsVar.f(d("core_sleep_deep_sleep_part_key", hiHealthData));
        gxsVar.b(hiHealthData.getInt("core_sleep_total_sleep_time_key"));
        gxsVar.a(hiHealthData.getDouble("core_sleep_valid_data_key"));
        gxsVar.x(hiHealthData.getInt("core_sleep_day_sleep_time_key"));
        gxsVar.a(hiHealthData.getTimeZone());
        gxsVar.d(hiHealthData.getStartTime());
        gxsVar.a(hiHealthData.getInt("core_sleep_bed_time_key"));
        gxsVar.a(hiHealthData.getLong("core_sleep_go_bed_key"));
        gxsVar.b(hiHealthData.getLong("core_sleep_off_bed_key"));
        gxsVar.a(Double.valueOf(hiHealthData.getDouble("minBreathrate")));
        gxsVar.c(Double.valueOf(hiHealthData.getDouble("maxBreathrate")));
        gxsVar.y(hiHealthData.getInt("minHeartrate"));
        gxsVar.r(hiHealthData.getInt("maxHeartrate"));
        gxsVar.d(Double.valueOf(hiHealthData.getDouble("minOxygenSaturation")));
        gxsVar.e(Double.valueOf(hiHealthData.getDouble("maxOxygenSaturation")));
        gxsVar.d(hiHealthData.getInt("core_sleep_latency_key"));
        gxsVar.e(d("avgBreathrate", hiHealthData));
        gxsVar.q(d("minBreathrateBaseline", hiHealthData));
        gxsVar.k(d("maxBreathrateBaseline", hiHealthData));
        gxsVar.j(d("breathrateDayToBaseline", hiHealthData));
        gxsVar.h(d("avgHeartrate", hiHealthData));
        gxsVar.u(d("minHeartrateBaseline", hiHealthData));
        gxsVar.p(d("maxHeartrateBaseline", hiHealthData));
        gxsVar.l(d("heartrateDayToBaseline", hiHealthData));
        gxsVar.g(d("avgHrv", hiHealthData));
        gxsVar.s(d("minHrvBaseline", hiHealthData));
        gxsVar.m(d("maxHrvBaseline", hiHealthData));
        gxsVar.o(d("hrvDayToBaseline", hiHealthData));
        gxsVar.i(d("avgOxygenSaturation", hiHealthData));
        gxsVar.w(d("minOxygenSaturationBaseline", hiHealthData));
        gxsVar.t(d("maxOxygenSaturationBaseline", hiHealthData));
        gxsVar.ai(d("oxygenSaturationDayToBaseline", hiHealthData));
        gxsVar.aa(hiHealthData.getInt("sleep_version"));
        if (gxsVar.ax() == 5) {
            gxsVar.n(hiHealthData.getInt("core_sleep_deep_key_aasm"));
            gxsVar.ad(hiHealthData.getInt("core_sleep_shallow_key_aasm"));
            gxsVar.v(hiHealthData.getInt("core_sleep_rem_key_aasm"));
            gxsVar.ac(d("core_sleep_stable_key_aasm", hiHealthData));
        }
    }

    private static int d(String str, HiHealthData hiHealthData) {
        if (hiHealthData.containsKey(str)) {
            return hiHealthData.getInt(str);
        }
        return -2;
    }

    public static void b(HiHealthData hiHealthData, List<HiHealthData> list, gxj gxjVar) {
        double d = hiHealthData.getDouble("core_sleep_fall_key");
        double d2 = hiHealthData.getDouble("core_sleep_wake_up_key");
        gxjVar.c((long) d);
        gxjVar.e((long) d2);
        gxjVar.a(hiHealthData.getInt("data_session_manual_sleep_bed_time_key"));
        gxjVar.b(hiHealthData.getInt("core_sleep_total_sleep_time_key"));
        gxjVar.d(hiHealthData.getStartTime());
        if (njy.b(list)) {
            Iterator<HiHealthData> it = list.iterator();
            while (it.hasNext()) {
                a(gxjVar, it.next(), SleepViewConstants.SleepTypeEnum.MANUAL);
            }
        }
    }

    public static void a(gxi gxiVar, HiHealthData hiHealthData, SleepViewConstants.SleepTypeEnum sleepTypeEnum) {
        if (sleepTypeEnum == SleepViewConstants.SleepTypeEnum.PHONE && hiHealthData.containsKey("bedTime") && (gxiVar instanceof gxm)) {
            gxiVar.a(hiHealthData.containsKey("bedTime") ? qqk.e(gxiVar.a(), hiHealthData.getLong("bedTime"), 0) : -1L);
            gxiVar.b(hiHealthData.containsKey("risingTime") ? qqk.e(gxiVar.d(), hiHealthData.getLong("risingTime"), 1) : -1L);
            gxm gxmVar = (gxm) gxiVar;
            c(hiHealthData, gxmVar);
            d(hiHealthData, gxmVar);
            return;
        }
        if (sleepTypeEnum == SleepViewConstants.SleepTypeEnum.MANUAL && hiHealthData.containsKey("data_session_manual_sleep_go_to_bed_time_key")) {
            gxiVar.a(qqk.e(gxiVar.a(), hiHealthData.getLong("data_session_manual_sleep_go_to_bed_time_key"), 0));
            gxiVar.b(qqk.e(gxiVar.d(), hiHealthData.getLong("data_session_manual_sleep_get_up_time_key"), 1));
            gxiVar.c(qqk.e(gxiVar.b(), hiHealthData.getLong("data_session_manual_sleep_sleep_time_key"), 0));
            gxiVar.e(qqk.e(gxiVar.l(), hiHealthData.getLong("data_session_manual_sleep_wake_time_key"), 1));
        }
    }

    public static void d(HiHealthData hiHealthData, gxm gxmVar) {
        gxmVar.d(hiHealthData.containsKey("latency") ? hiHealthData.getInt("latency") : -1);
        gxmVar.j(hiHealthData.getInt("sleepScore"));
    }

    public static void b(HiHealthData hiHealthData, List<HiHealthData> list, gxm gxmVar) {
        double d = hiHealthData.getDouble("core_sleep_fall_key");
        double d2 = hiHealthData.getDouble("core_sleep_wake_up_key");
        gxmVar.c((long) d);
        gxmVar.e((long) d2);
        gxmVar.c(hiHealthData.getInt("core_sleep_deep_key"));
        gxmVar.i(hiHealthData.getInt("core_sleep_shallow_key"));
        gxmVar.e(hiHealthData.getInt("core_sleep_day_sleep_time_key"));
        gxmVar.g(hiHealthData.getInt("core_sleep_wake_key"));
        gxmVar.b(hiHealthData.getInt("core_sleep_total_sleep_time_key"));
        gxmVar.a(hiHealthData.getTimeZone());
        gxmVar.d(hiHealthData.getStartTime());
        gxmVar.a(gxmVar.i() + gxmVar.aa());
        gxmVar.h(hiHealthData.getInt("core_sleep_wake_count_key"));
        d(list, gxmVar);
    }

    public static void d(List<HiHealthData> list, gxm gxmVar) {
        if (njy.b(list)) {
            for (HiHealthData hiHealthData : list) {
                gxmVar.m(hiHealthData.getInt("wakeUpFeeling"));
                if (!c(hiHealthData)) {
                    a(gxmVar, hiHealthData, SleepViewConstants.SleepTypeEnum.PHONE);
                    gxmVar.f(hiHealthData.getInt("sleepEndReason"));
                }
            }
        }
    }

    private static boolean c(HiHealthData hiHealthData) {
        return hiHealthData.getInt("sleepEndReason") == 0 && hiHealthData.getInt("bedTime") == 0 && hiHealthData.getInt("risingTime") == 0 && hiHealthData.getInt("sleepScore") == 0 && hiHealthData.getInt("latency") == 0 && hiHealthData.getInt("wakeCount") == 0;
    }

    public static void b(HiHealthData hiHealthData, gxk gxkVar) {
        double d = hiHealthData.getDouble("common_sleep_fall_key");
        double d2 = hiHealthData.getDouble("common_sleep_wake_up_key");
        gxkVar.c(hiHealthData.getInt("sleep_deep_key") / 60);
        gxkVar.e(hiHealthData.getInt("sleep_shallow_key") / 60);
        gxkVar.h(hiHealthData.getInt("sleep_wake_count_key"));
        gxkVar.g(hiHealthData.getInt("common_sleep_duration_sleep_sum_key") / 60);
        gxkVar.c((long) d);
        gxkVar.e((long) d2);
        gxkVar.b(hiHealthData.getInt("common_sleep_duration_sleep_sum_key") / 60);
        gxkVar.a(hiHealthData.getTimeZone());
        gxkVar.d(hiHealthData.getStartTime());
    }

    public static void b(gxq gxqVar, HiHealthData hiHealthData, List<HiHealthData> list, List<HiHealthData> list2) {
        SleepViewConstants.SleepTypeEnum sleepTypeEnumE = e(hiHealthData, list2);
        gxqVar.b(sleepTypeEnumE);
        if (sleepTypeEnumE == SleepViewConstants.SleepTypeEnum.SCIENCE) {
            gxs gxsVar = new gxs();
            a(hiHealthData, gxsVar);
            gxqVar.c(gxsVar);
        } else if (sleepTypeEnumE == SleepViewConstants.SleepTypeEnum.COMMON) {
            gxk gxkVar = new gxk();
            b(hiHealthData, gxkVar);
            gxqVar.e(gxkVar);
        } else if (sleepTypeEnumE == SleepViewConstants.SleepTypeEnum.MANUAL) {
            gxj gxjVar = new gxj();
            b(hiHealthData, list, gxjVar);
            gxqVar.c(gxjVar);
        } else if (sleepTypeEnumE == SleepViewConstants.SleepTypeEnum.PHONE) {
            gxm gxmVar = new gxm();
            b(hiHealthData, list2, gxmVar);
            gxqVar.b(gxmVar);
        }
        if (sleepTypeEnumE == SleepViewConstants.SleepTypeEnum.PHONE || !njy.b(list2)) {
            return;
        }
        gxm gxmVar2 = new gxm();
        b(hiHealthData, list2, gxmVar2);
        gxqVar.b(gxmVar2);
    }

    public static void c(List<HiHealthData> list, gxr gxrVar, boolean z) {
        if (njy.e(list, 0)) {
            return;
        }
        ArrayList<HiHealthData> arrayList = new ArrayList(list);
        for (HiHealthData hiHealthData : arrayList) {
            if (hiHealthData.getType() == 22106 || hiHealthData.getType() == 22107) {
                gxrVar.g(5);
                gxrVar.a(hiHealthData.getString("device_uniquecode"));
                LogUtil.a(f36128a, "getDeviceType mSleepDeviceType is SLEEP_FROM_MANUAL, mDeviceId is ", gxrVar.g());
                return;
            }
        }
        HiHealthData hiHealthData2 = (HiHealthData) arrayList.get(0);
        int i = hiHealthData2.getInt("trackdata_deviceType");
        String string = hiHealthData2.getString("device_uniquecode");
        if (i == 0) {
            LogUtil.a(f36128a, "getDeviceType deviceType is 0");
            return;
        }
        gxrVar.a(string);
        if (i == 32) {
            gxrVar.g(3);
        } else if (i == 506) {
            gxrVar.g(4);
        } else if (z) {
            gxrVar.g(1);
        } else {
            gxrVar.g(2);
        }
        LogUtil.a(f36128a, "getDeviceType mSleepDeviceType is ", Integer.valueOf(gxrVar.i()));
    }

    public static boolean a(List<HiHealthData> list) {
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof HiHealthData)) {
                LogUtil.e(f36128a, "judgeIfAllHiHealthData not HiHealthData");
                return false;
            }
        }
        return true;
    }

    public static List<Integer> b(List<Integer> list) {
        if (list.size() > 3) {
            double d = UnitUtil.d(j(e(list)), 1);
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(Math.abs(((double) it.next().intValue()) - d)));
            }
            double d2 = UnitUtil.d(j(arrayList), 1);
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                if (((Double) arrayList.get(i)).doubleValue() <= 3.0d * d2) {
                    arrayList2.add(list.get(i));
                }
            }
            if (arrayList2.size() > ((double) list.size()) * 0.7d) {
                return arrayList2;
            }
        }
        return list;
    }

    private static List<Double> e(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(it.next().intValue()));
        }
        return arrayList;
    }

    private static double j(List<Double> list) {
        if (list.size() == 0) {
            return Double.NaN;
        }
        Double[] dArr = (Double[]) list.toArray(new Double[0]);
        Arrays.sort(dArr);
        if (dArr.length % 2 == 0) {
            return (dArr[dArr.length / 2].doubleValue() + dArr[(dArr.length / 2) - 1].doubleValue()) / 2.0d;
        }
        return dArr[dArr.length / 2].doubleValue();
    }

    public static int c(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    public static List<List<HiHealthData>> b(List<HiHealthData> list, List<HiHealthData> list2, List<HiHealthData> list3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(list);
        arrayList.add(list2);
        arrayList.add(list3);
        return arrayList;
    }

    public static List<gxq> d(int i, long j, int[] iArr, List<List<HiHealthData>> list) {
        LogUtil.a(f36128a, "sleepDatas:", list.toString());
        ArrayList arrayList = new ArrayList();
        int i2 = iArr[0];
        int iA = i2 == 14 ? i2 / 2 : a(j, i2);
        int[] iArr2 = {iArr[0], iArr[1], i};
        List listAsList = Arrays.asList(new HiHealthData[iA]);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (HiHealthData hiHealthData : list.get(0)) {
            listAsList.set(d(SleepViewConstants.SleepTypeEnum.SCIENCE, hiHealthData, j, iArr2), hiHealthData);
        }
        for (HiHealthData hiHealthData2 : list.get(1)) {
            d(d(SleepViewConstants.SleepTypeEnum.MANUAL, hiHealthData2, j, iArr2), hiHealthData2, map);
        }
        for (HiHealthData hiHealthData3 : list.get(2)) {
            int iD = d(SleepViewConstants.SleepTypeEnum.PHONE, hiHealthData3, j, iArr2);
            if (iD > 0 && d(hiHealthData3)) {
                d(iD - 1, hiHealthData3, map2);
                d(iD, hiHealthData3, map2);
            } else {
                d(iD, hiHealthData3, map2);
            }
        }
        for (int i3 = 0; i3 < iA; i3++) {
            gxq gxqVar = new gxq(SleepViewConstants.ViewTypeEnum.DAY);
            if (listAsList.get(i3) != null) {
                b(gxqVar, (HiHealthData) listAsList.get(i3), (List) map.get(Integer.valueOf(i3)), (List) map2.get(Integer.valueOf(i3)));
            }
            arrayList.add(gxqVar);
        }
        LogUtil.a(f36128a, "sleepViewDatas:", arrayList.toString());
        return arrayList;
    }

    private static void d(int i, HiHealthData hiHealthData, Map<Integer, List<HiHealthData>> map) {
        if (njy.b(map.get(Integer.valueOf(i)))) {
            List<HiHealthData> list = map.get(Integer.valueOf(i));
            list.add(hiHealthData);
            map.put(Integer.valueOf(i), list);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(hiHealthData);
            map.put(Integer.valueOf(i), arrayList);
        }
    }

    public static void c(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            LogUtil.a(f36128a, "sort fail");
            return;
        }
        for (int i = 0; i < strArr.length - 1; i++) {
            int i2 = 0;
            while (i2 < (strArr.length - 1) - i) {
                int i3 = i2 + 1;
                if (CommonUtil.i(strArr[i2]) > CommonUtil.i(strArr[i3])) {
                    String str = strArr[i2];
                    strArr[i2] = strArr[i3];
                    strArr[i3] = str;
                    String str2 = strArr2[i2];
                    strArr[i2] = str;
                    strArr[i3] = str2;
                }
                i2 = i3;
            }
        }
    }

    public static Map<String, SleepViewConstants.SleepTypeEnum> c(List<gxq> list, Map<String, Integer> map, Map<String, String> map2, Map<String, Boolean> map3) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Date date = new Date();
        for (gxq gxqVar : list) {
            if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.COMMON) {
                date.setTime(gxqVar.b().j());
            } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
                date.setTime(gxqVar.g().j());
            } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
                date.setTime(gxqVar.k().j());
            } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
                date.setTime(gxqVar.h().j());
            }
            String strD = DateFormatUtil.d(date.getTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD);
            String strD2 = DateFormatUtil.d(date.getTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_YEAR_MONTH);
            concurrentHashMap.put(strD, gxqVar.n());
            map.put(strD, Integer.valueOf(gxqVar.k().ax()));
            map3.put(strD, Boolean.valueOf(gxqVar.k().ay()));
            if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
                if (map2.containsKey(strD2)) {
                    if (map.getOrDefault(strD, 0).intValue() == 5) {
                        map2.put(strD2, strD);
                    }
                } else {
                    map2.put(strD2, strD);
                }
            }
        }
        return concurrentHashMap;
    }
}
