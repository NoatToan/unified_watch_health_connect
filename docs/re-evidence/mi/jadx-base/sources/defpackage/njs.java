package defpackage;

import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.user.BirthDateExt;
import com.xiaomi.hm.health.bt.sdk.DailyData;
import com.xiaomi.hm.health.bt.sdk.DailyDataResult;
import com.xiaomi.hm.health.bt.sdk.data.SleepManualData;
import com.xiaomi.hm.health.dataprocess.DataAnalysis;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.hm.health.dataprocess.UserInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes8.dex */
public class njs {
    public static int a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = (calendar.get(11) * 60) + calendar.get(12);
        return calendar.get(9) == 0 ? i : i - 1440;
    }

    public static int b(BirthDateExt birthDateExt) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2) + 1;
        int i3 = calendar.get(5);
        short year = birthDateExt.getYear();
        byte month = birthDateExt.getMonth();
        byte day = birthDateExt.getDay();
        int i4 = i - year;
        if (i2 < month) {
            return i4 - 1;
        }
        return (i2 <= month && i3 < day) ? i4 - 1 : i4;
    }

    public static /* synthetic */ int c(e1t e1tVar, e1t e1tVar2) {
        return e1tVar.d().d() - e1tVar2.d().d();
    }

    public static DailyDataResult d(j3t j3tVar, UserInfoExt userInfoExt, qd qdVar) {
        DailyDataResult dailyDataResult = new DailyDataResult();
        dailyDataResult.setError(j3tVar.m());
        dailyDataResult.setTimestamp((int) j3tVar.i());
        dailyDataResult.setTz(j3tVar.l());
        List<e1t> listB = j3tVar.b();
        if (listB != null && listB.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (e1t e1tVar : listB) {
                int[] iArrL = l(e1tVar.f(), userInfoExt, e1tVar.e());
                DailyData dailyData = new DailyData(e1tVar.d().b(), j3tVar.a(e1tVar), (e1tVar.e() == null || e1tVar.e().getStepsInfo() == null) ? new JSONArray().toString() : e1tVar.e().getStepsInfo().getStageStepSummaryJson());
                dailyData.setDistance(iArrL[0]);
                dailyData.setCalories(iArrL[1]);
                arrayList.add(dailyData);
            }
            dailyDataResult.setList(arrayList);
            dailyDataResult.setFatBurningDataList(j3tVar.c(qdVar));
            t5t.d("DataTransfer", "getDailyData finish:" + System.currentTimeMillis());
        }
        return dailyDataResult;
    }

    public static SleepManualData e(List<SleepManualData> list, SportDay sportDay) {
        if (list != null && !list.isEmpty()) {
            for (SleepManualData sleepManualData : list) {
                if (sportDay.offsetDay(new SportDay(sleepManualData.getCalendar())) == 0) {
                    return sleepManualData;
                }
            }
        }
        return null;
    }

    public static DaySportData f(e1t e1tVar) {
        DaySportData daySportDataE = e1tVar.e();
        byte[] binaryHRData = daySportDataE.getBinaryHRData(null);
        byte[] bArrC = e1tVar.c();
        if (bArrC != null) {
            daySportDataE.fromBinaryWithHRData(bArrC, binaryHRData);
        }
        return daySportDataE;
    }

    public static UserInfo g(UserInfoExt userInfoExt) {
        UserInfo userInfo = new UserInfo();
        userInfo.age = userInfoExt.getAge();
        userInfo.gender = userInfoExt.getGender().getValue();
        userInfo.goal = userInfoExt.getGoal();
        userInfo.height = userInfoExt.getHeight();
        userInfo.weight = userInfoExt.getWeight();
        return userInfo;
    }

    public static Calendar h(long j, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTimeInMillis(j);
        calendar.setTimeZone(ProfileUtils.getTimezone((byte) i));
        return calendar;
    }

    public static j3t i(UserInfoExt userInfoExt, Calendar calendar, List<k3t> list, List<SleepManualData> list2, boolean z) {
        t5t.m("DataTransfer", "analyzeActivityData");
        t5t.d("DataTransfer", "getDailyData algorithm start:" + System.currentTimeMillis());
        j3t j3tVar = new j3t(calendar, userInfoExt.getGoal(), b(userInfoExt.getBirthDate()));
        Calendar calendar2 = Calendar.getInstance();
        HashMap map = new HashMap();
        for (k3t k3tVar : list) {
            List<T> list3 = k3tVar.f23405b;
            Calendar calendar3 = k3tVar.f23404a;
            int rawOffset = calendar3.getTimeZone().getRawOffset();
            t5t.d("DataTransfer", "data size:" + list3.size() + ",data time:" + calendar3.getTime().toString() + ",phone time:" + calendar2.getTime().toString() + ",isEnd:" + k3tVar.a());
            if (k(calendar3)) {
                t5t.d("DataTransfer", "the synced data Calendar is wrong");
            } else {
                for (T t : list3) {
                    int i = calendar3.get(1);
                    int i2 = calendar3.get(2);
                    int i3 = calendar3.get(5);
                    int i4 = (calendar3.get(11) * 60) + calendar3.get(12);
                    ogt ogtVar = new ogt(i, i2, i3, rawOffset);
                    e1t e1tVar = (e1t) map.get(ogtVar);
                    if (e1tVar == null) {
                        e1tVar = new e1t(ogtVar, t);
                        map.put(ogtVar, e1tVar);
                    }
                    e1tVar.b(i4, t);
                    calendar3.add(12, 1);
                }
                if (k3tVar.a()) {
                    j3tVar.e(k3tVar.f23404a.getTimeInMillis() / 1000);
                    j3tVar.d(ProfileUtils.getTimezoneKey(k3tVar.f23404a.getTimeZone()));
                }
            }
        }
        ArrayList arrayList = new ArrayList(map.values());
        Collections.sort(arrayList, new Comparator() { // from class: mjs
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return njs.c((e1t) obj, (e1t) obj2);
            }
        });
        j(userInfoExt, arrayList, list2, z);
        Iterator it = arrayList.iterator();
        SportDay sportDay = new SportDay(calendar);
        while (it.hasNext()) {
            if (sportDay.offsetDay(((e1t) it.next()).e().getSportDay()) >= 0) {
                it.remove();
            }
        }
        j3tVar.g(arrayList);
        t5t.d("DataTransfer", "getDailyData algorithm end:" + System.currentTimeMillis());
        return j3tVar;
    }

    public static void j(UserInfoExt userInfoExt, ArrayList<e1t> arrayList, List<SleepManualData> list, boolean z) {
        UserInfo userInfoG = g(userInfoExt);
        int i = 0;
        while (i < arrayList.size()) {
            DaySportData daySportDataF = f(arrayList.get(i));
            DaySportData daySportData = (i == 0 || arrayList.get(i + (-1)).e().getSportDay().compare(daySportDataF.getSportDay().getPreDay()) != 0) ? new DaySportData(daySportDataF.getSportDay().getPreDay()) : f(arrayList.get(i - 1));
            DaySportData daySportData2 = (i == arrayList.size() - 1 || arrayList.get(i + 1).e().getSportDay().compare(daySportDataF.getSportDay().getNextDay()) != 0) ? new DaySportData(daySportDataF.getSportDay().getNextDay()) : f(arrayList.get(i + 1));
            DataAnalysis.setIs24HoursSleepDetectionStatus(Boolean.valueOf(z));
            DataAnalysis.setDaySleepDetectionStatus(1);
            DataAnalysis.dataInit(userInfoG, daySportData, daySportDataF, daySportData2);
            SleepManualData sleepManualDataE = e(list, daySportDataF.getSportDay());
            if (sleepManualDataE != null) {
                DataAnalysis.setUserModifySleep(a(sleepManualDataE.getStartTime()), a(sleepManualDataE.getStopTime()));
            }
            DataAnalysis.set24HoursSleepDetectionStatus(z ? 1 : 0);
            DataAnalysis.dataProcess(daySportDataF);
            DataAnalysis.dataDestory();
            i++;
        }
    }

    public static boolean k(Calendar calendar) {
        return calendar.get(1) <= 1975;
    }

    public static int[] l(int i, UserInfoExt userInfoExt, DaySportData daySportData) {
        int stepsCount;
        int calories;
        int distance;
        StepsInfo stepsInfo;
        UserInfo userInfoG = g(userInfoExt);
        t5t.m("DataTransfer", "realtimeStep:" + i);
        if (daySportData == null || (stepsInfo = daySportData.getStepsInfo()) == null) {
            t5t.m("DataTransfer", "no sport data today");
            stepsCount = 0;
            calories = 0;
            distance = 0;
        } else {
            stepsCount = stepsInfo.getStepsCount();
            distance = stepsInfo.getDistance();
            calories = stepsInfo.getCalories();
            t5t.m("DataTransfer", "existSteps " + stepsCount + " existDis " + distance + " existCal " + calories);
        }
        return DataAnalysis.getCalAndDis(i, stepsCount, distance, calories, userInfoG);
    }

    public static Calendar m(long j, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTimeInMillis(j);
        calendar.setTimeZone(ProfileUtils.getTimezone((byte) i));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.set(5, calendar.get(5) - 1);
        return calendar;
    }
}
