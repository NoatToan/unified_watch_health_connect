package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.plan.model.model.WorkoutRecommendRule;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class gmr {
    public static void e(List<FitWorkout> list) {
        b(list, 0);
    }

    public static void b(List<FitWorkout> list, int i) {
        long jF = ltb.f();
        if (i == 0) {
            buh.d("RECOMMEND_WORKOUT_KEY_COURSE", new Gson().toJson(list));
            buh.d("RECOMMEND_WORKOUT_CREATE_TIME_COURSE", Long.toString(jF));
            return;
        }
        buh.d("RECOMMEND_WORKOUT_KEY_COURSE" + i, new Gson().toJson(list));
        buh.d("RECOMMEND_WORKOUT_CREATE_TIME_COURSE" + i, Long.toString(jF));
    }

    public static List<FitWorkout> e() {
        return e(0);
    }

    public static List<FitWorkout> e(int i) {
        String strE;
        String strE2;
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            strE2 = buh.e("RECOMMEND_WORKOUT_CREATE_TIME_COURSE");
            strE = buh.e("RECOMMEND_WORKOUT_KEY_COURSE");
        } else {
            String strE3 = buh.e("RECOMMEND_WORKOUT_CREATE_TIME_COURSE" + i);
            strE = buh.e("RECOMMEND_WORKOUT_KEY_COURSE" + i);
            strE2 = strE3;
        }
        if (!TextUtils.isEmpty(strE2) && !TextUtils.isEmpty(strE)) {
            long jF = ltb.f() - CommonUtil.i(strE2);
            if (jF > 0 && jF < 86400000) {
                try {
                    return (List) new Gson().fromJson(strE, new TypeToken<List<FitWorkout>>() { // from class: com.huawei.health.plan.model.data.RecommendWorkoutInterators$1
                    }.getType());
                } catch (JsonSyntaxException e) {
                    LogUtil.j("RecommendWorkoutInterators", "parse RecommendData error ", e.getMessage());
                }
            }
        }
        return arrayList;
    }

    public static String a() {
        String strE = buh.e("RECOMMEND_WORKOUT_RULE_KEY_COURSE");
        long jF = ltb.f();
        String strValueOf = String.valueOf(jF);
        if (TextUtils.isEmpty(strE)) {
            return c(strValueOf, "");
        }
        try {
            WorkoutRecommendRule workoutRecommendRule = (WorkoutRecommendRule) new Gson().fromJson(strE, WorkoutRecommendRule.class);
            String ruleDate = workoutRecommendRule.getRuleDate();
            String ruleName = workoutRecommendRule.getRuleName();
            if (TextUtils.isEmpty(ruleDate) || TextUtils.isEmpty(ruleName)) {
                return c(strValueOf, ruleName);
            }
            long jI = jF - CommonUtil.i(ruleDate);
            return (jI < 0 || jI > 604800000) ? c(strValueOf, ruleName) : ruleName;
        } catch (JsonSyntaxException e) {
            LogUtil.j("RecommendWorkoutInterators", "parse RecommendRule error ", e.getMessage());
            return c(strValueOf, "");
        }
    }

    public static String c(String str, String str2) {
        String strA = a(str2);
        buh.d("RECOMMEND_WORKOUT_RULE_KEY_COURSE", new Gson().toJson(new WorkoutRecommendRule(strA, str)));
        return strA;
    }

    private static String a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        d(stringBuffer);
        List<WorkoutRecord> listC = c();
        if (listC != null && listC.size() > 0) {
            a(stringBuffer, listC);
            return stringBuffer.toString();
        }
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split(",");
            if (strArrSplit.length == 4) {
                stringBuffer.append(strArrSplit[2] + ",");
                stringBuffer.append(strArrSplit[3]);
                return stringBuffer.toString();
            }
        }
        stringBuffer.append("-1,-1");
        return stringBuffer.toString();
    }

    private static void a(StringBuffer stringBuffer, List<WorkoutRecord> list) {
        Iterator<WorkoutRecord> it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int iC = 0;
        int iE = 0;
        int iA = 0;
        int iB = 0;
        while (it.hasNext()) {
            FitWorkout fitWorkoutA = a(it.next());
            if (fitWorkoutA != null) {
                int iAcquireDifficulty = fitWorkoutA.acquireDifficulty();
                if (iAcquireDifficulty == 6) {
                    i++;
                }
                if (iAcquireDifficulty == 0) {
                    i2++;
                }
                if (iAcquireDifficulty == 1) {
                    i3++;
                }
                if (iAcquireDifficulty == 2) {
                    i4++;
                }
                String fitnessGoal = fitWorkoutA.getFitnessGoal();
                if (!TextUtils.isEmpty(fitnessGoal)) {
                    c cVarD = new c(iC, iE, iA, iB, fitnessGoal).d();
                    iC = cVarD.c();
                    iE = cVarD.e();
                    iA = cVarD.a();
                    iB = cVarD.b();
                }
            }
        }
        stringBuffer.append(a(i, i2, i3, i4) + ",");
        stringBuffer.append(b(iC, iE, iA, iB));
    }

    private static FitWorkout a(WorkoutRecord workoutRecord) {
        FitWorkout fitWorkoutA;
        if (workoutRecord.acquireFinishRate() <= 50.0f || (fitWorkoutA = gmc.g().o().a(workoutRecord.acquireWorkoutId())) == null || fitWorkoutA.isRunModelCourse()) {
            return null;
        }
        return fitWorkoutA;
    }

    private static List<WorkoutRecord> c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(5, -14);
        return gls.b().getWorkoutRecords(calendar.getTimeInMillis(), jCurrentTimeMillis);
    }

    private static String a(int i, int i2, int i3, int i4) {
        String str;
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return "-1";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("l1Count", Integer.valueOf(i));
        linkedHashMap.put("l2Count", Integer.valueOf(i2));
        linkedHashMap.put("l3Count", Integer.valueOf(i3));
        linkedHashMap.put("l4Count", Integer.valueOf(i4));
        int iIntValue = ((Integer) Collections.max(linkedHashMap.values())).intValue();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "";
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((Integer) entry.getValue()).intValue() == iIntValue) {
                str = (String) entry.getKey();
                break;
            }
        }
        if ("l1Count".equals(str) || "l2Count".equals(str)) {
            return "0";
        }
        if ("l3Count".equals(str)) {
            return "1";
        }
        if (!"l4Count".equals(str)) {
            return "-1";
        }
        return "2";
    }

    private static String b(int i, int i2, int i3, int i4) {
        String str;
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return "-1";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("fatLossCount", Integer.valueOf(i));
        linkedHashMap.put("shapingCount", Integer.valueOf(i2));
        linkedHashMap.put("muscleCount", Integer.valueOf(i3));
        linkedHashMap.put("keepHealthCount", Integer.valueOf(i4));
        int iIntValue = ((Integer) Collections.max(linkedHashMap.values())).intValue();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "";
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((Integer) entry.getValue()).intValue() == iIntValue) {
                str = (String) entry.getKey();
                break;
            }
        }
        if ("fatLossCount".equals(str)) {
            return "0";
        }
        if ("shapingCount".equals(str)) {
            return "1";
        }
        if ("muscleCount".equals(str)) {
            return "2";
        }
        if (!"keepHealthCount".equals(str)) {
            return "-1";
        }
        return "3";
    }

    private static void d(StringBuffer stringBuffer) {
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.j("RecommendWorkoutInterators", "getFitnessDatas : userProfileMgrApi is null.");
            return;
        }
        UserInfomation userInfo = userProfileMgrApi.getUserInfo();
        if (userInfo != null) {
            int heightOrDefaultValue = userInfo.getHeightOrDefaultValue();
            float weightOrDefaultValue = userInfo.getWeightOrDefaultValue();
            int genderOrDefaultValue = userInfo.getGenderOrDefaultValue();
            if (genderOrDefaultValue != 1 && genderOrDefaultValue != 0) {
                genderOrDefaultValue = -1;
            }
            stringBuffer.append(genderOrDefaultValue + ",");
            double d = btv.d(heightOrDefaultValue, weightOrDefaultValue);
            if (d > 0.0d && d <= 18.5d) {
                stringBuffer.append("0");
            } else if (d > 18.5d && d < 25.0d) {
                stringBuffer.append("1");
            } else if (d >= 25.0d) {
                stringBuffer.append("2");
            } else {
                stringBuffer.append("-1");
            }
            stringBuffer.append(",");
            return;
        }
        stringBuffer.append("-1,-1,");
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f35737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35739c;
        private int d;
        private int e;

        c(int i, int i2, int i3, int i4, String str) {
            this.f35739c = i;
            this.f35737a = i2;
            this.e = i3;
            this.d = i4;
            this.f35738b = str;
        }

        public int c() {
            return this.f35739c;
        }

        public int e() {
            return this.f35737a;
        }

        public int a() {
            return this.e;
        }

        public int b() {
            return this.d;
        }

        public c d() {
            if (this.f35738b.indexOf("0") >= 0) {
                this.f35739c++;
            }
            if (this.f35738b.indexOf("1") >= 0) {
                this.f35737a++;
            }
            if (this.f35738b.indexOf("2") >= 0) {
                this.e++;
            }
            if (this.f35738b.indexOf("3") >= 0) {
                this.d++;
            }
            return this;
        }
    }
}
