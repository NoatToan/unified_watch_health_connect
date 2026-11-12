package defpackage;

import android.content.Context;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.AchieveInfo;
import com.huawei.pluginachievement.manager.model.KakaLineRecord;
import com.huawei.pluginachievement.manager.model.KakaRecord;
import com.huawei.pluginachievement.manager.model.RecentMonthRecord;
import com.huawei.pluginachievement.manager.model.RecentWeekRecord;
import com.huawei.pluginachievement.manager.model.SingleDayRecord;
import com.huawei.pluginachievement.manager.model.TotalRecord;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class oum {
    public static String c(int i, String str) {
        if (i == 0) {
            return c("personal_preset_data.txt");
        }
        if (i == 8) {
            return c("get_medal_preset_data.txt");
        }
        if (i != 11) {
            return i != 13 ? str : c("level_preset_data.txt");
        }
        return c("kaka_task_preset_data.txt");
    }

    private static String c(String str) {
        LogUtil.e("AchievementMockUtil", "readPresetData start:", str);
        String str2 = "";
        try {
            InputStream inputStreamE = pee.e("achievement", str);
            try {
                if (inputStreamE == null) {
                    LogUtil.j("AchievementMockUtil", "readPresetData inputStream is null");
                    if (inputStreamE != null) {
                        inputStreamE.close();
                    }
                } else {
                    byte[] bArr = new byte[inputStreamE.available()];
                    if (inputStreamE.read(bArr) > 0) {
                        str2 = new String(bArr, "UTF-8");
                    }
                    if (inputStreamE != null) {
                        inputStreamE.close();
                    }
                }
                return str2;
            } catch (Throwable th) {
                if (inputStreamE != null) {
                    try {
                        inputStreamE.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
            LogUtil.e("AchievementMockUtil", "readPresetData failed :", str);
            return "";
        }
    }

    public static void e(final Context context) {
        LogUtil.a("AchievementMockUtil", "insertStoreDemoAchieveData");
        ThreadPoolManager.c().execute(new Runnable() { // from class: oum.3
            @Override // java.lang.Runnable
            public void run() {
                if (oum.c(context)) {
                    return;
                }
                LogUtil.a("AchievementMockUtil", "insert storedemo achievement: try again");
                oum.c(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(Context context) {
        a(context);
        if (!d(context)) {
            LogUtil.j("AchievementMockUtil", "insert storedemo insertKakaRecord failed");
            return false;
        }
        if (!i(context)) {
            LogUtil.j("AchievementMockUtil", "insert storedemo insertKakaRecord failed");
            return false;
        }
        if (!h(context)) {
            LogUtil.j("AchievementMockUtil", "insert storedemo insertKakaRecord failed");
            return false;
        }
        if (!g(context)) {
            LogUtil.j("AchievementMockUtil", "insert storedemo insertSingleDayRecord failed");
            return false;
        }
        if (!j(context)) {
            LogUtil.j("AchievementMockUtil", "insert storedemo insertRecentWeekRecord failed");
            return false;
        }
        if (!f(context)) {
            LogUtil.j("AchievementMockUtil", "insert storedemo insertRecentMonthRecord failed");
            return false;
        }
        LogUtil.a("AchievementMockUtil", "insert storedemo achievement pass");
        return true;
    }

    private static boolean d(Context context) {
        AchieveInfo achieveInfo = new AchieveInfo();
        achieveInfo.setUserLevel(2);
        achieveInfo.setUserPoint(60);
        achieveInfo.setUserReachStandardDays(10.0d);
        achieveInfo.setSyncTimestamp(System.currentTimeMillis());
        achieveInfo.saveMedals("");
        return oth.b(context).d(achieveInfo);
    }

    private static boolean i(Context context) {
        KakaLineRecord kakaLineRecord = new KakaLineRecord();
        ArrayList arrayList = new ArrayList(30);
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < 30; i++) {
            SecureRandom secureRandom = new SecureRandom();
            int iNextInt = secureRandom.nextInt(9) + 1;
            int iNextInt2 = (secureRandom.nextInt(5) + 1) * 5;
            long jNextInt = secureRandom.nextInt(5) + (i * 20);
            int i2 = iNextInt != 6 ? iNextInt : 5;
            if (i2 == 3 || i2 == 9) {
                iNextInt2 = -iNextInt2;
            }
            arrayList.add(new KakaRecord(jCurrentTimeMillis, i2, iNextInt2, jCurrentTimeMillis - (jNextInt * 3481000)));
        }
        kakaLineRecord.setKakaLineRecords(arrayList);
        kakaLineRecord.setTotalNum(10);
        return oth.b(context).d(kakaLineRecord);
    }

    private static boolean h(Context context) {
        TotalRecord totalRecord = new TotalRecord();
        totalRecord.setStartDate(System.currentTimeMillis() - 2505600000L);
        totalRecord.setEndDate(System.currentTimeMillis());
        totalRecord.setDays(30);
        totalRecord.setDistance(204.0d);
        totalRecord.setSteps(277780.0d);
        totalRecord.saveCalorie(6779000.0d);
        totalRecord.setStepsRanking(1.35d);
        return oth.b(context).d(totalRecord);
    }

    private static boolean g(Context context) {
        SingleDayRecord singleDayRecord = new SingleDayRecord();
        singleDayRecord.saveBestStepDay(String.format(Locale.ROOT, "[{\"recordDay\":%s,\"value\":25160}]", new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).format(Long.valueOf(b(19)))));
        singleDayRecord.saveBestWalkDistance(b(b(5), 2120.0d));
        singleDayRecord.saveBestRunDistance(b(b(15), 22320.0d));
        singleDayRecord.saveBestRunPace(b(b(4), 341.0d));
        singleDayRecord.saveBestRun3KMPace(b(b(13), 1294.0d));
        singleDayRecord.saveBestRun5KMPace(b(b(14), 1873.0d));
        singleDayRecord.saveBestRunHMPace(b(b(15), 8179.0d));
        singleDayRecord.saveBestCycleDistance(b(b(27), 7890.0d));
        singleDayRecord.saveBestCycleSpeed(b(b(11), 281.25d));
        return oth.b(context).d(singleDayRecord);
    }

    private static long b(int i) {
        return System.currentTimeMillis() - (((long) i) * 86400000);
    }

    private static String b(long j, double d) {
        return String.format(Locale.ROOT, "[{\"startTime\":%d,\"deviceCode\":231378400,\"endTime\":%d,\"source\":1,\"value\":%f}]", Long.valueOf(j), Long.valueOf(j), Double.valueOf(d));
    }

    private static boolean j(Context context) {
        RecentWeekRecord recentWeekRecord = new RecentWeekRecord();
        recentWeekRecord.setSteps(69460.0d);
        recentWeekRecord.setDistance(12.4d);
        recentWeekRecord.setDistanceRanking(45.93d);
        recentWeekRecord.setReportNo(101);
        recentWeekRecord.setStepsRanking(53.41d);
        recentWeekRecord.setKakaNum(45);
        recentWeekRecord.setPrice(30);
        recentWeekRecord.setUserMedals("");
        recentWeekRecord.saveFirstDate(System.currentTimeMillis() - 518400000);
        recentWeekRecord.saveEndDate(System.currentTimeMillis());
        recentWeekRecord.setMinReportNo(0);
        recentWeekRecord.setUserMedals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19");
        return oth.b(context).d(recentWeekRecord);
    }

    private static boolean f(Context context) {
        RecentMonthRecord recentMonthRecord = new RecentMonthRecord();
        recentMonthRecord.setSteps(277780.0d);
        recentMonthRecord.setDistance(71.74d);
        recentMonthRecord.setReportNo(200);
        recentMonthRecord.setDistanceRanking(61.23d);
        recentMonthRecord.setStepsRanking(55.66d);
        recentMonthRecord.setKakaNum(60);
        recentMonthRecord.setPrice(30);
        recentMonthRecord.setMedals("");
        recentMonthRecord.saveFirstDate(System.currentTimeMillis() - 2505600000L);
        recentMonthRecord.saveEndDate(System.currentTimeMillis());
        recentMonthRecord.setMinReportNo(100);
        recentMonthRecord.setMedals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19");
        return oth.b(context).d(recentMonthRecord);
    }

    private static void a(Context context) {
        oth othVarB = oth.b(context);
        othVarB.c(new AchieveInfo());
        othVarB.c(new KakaLineRecord());
        othVarB.c(new SingleDayRecord());
        othVarB.c(new RecentMonthRecord());
        othVarB.c(new RecentWeekRecord());
    }
}
