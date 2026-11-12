package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.health.suggestion.RunCourseRecommendCallback;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginfitnessadvice.FitWorkout;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes29.dex */
public class gnr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap<String, Integer> f35840b = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static TreeMap<Integer, Integer[]> f35839a = new TreeMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static TreeMap<Integer, Integer[]> f35841c = new TreeMap<>();

    private static int a(double d) {
        if (d >= 500.0d) {
            return 4;
        }
        if (d >= 450.0d) {
            return 3;
        }
        return (d < 396.0d && d < 354.0d) ? 1 : 2;
    }

    private static int b(double d) {
        if (d >= 573.0d) {
            return 4;
        }
        if (d >= 522.0d) {
            return 3;
        }
        return (d < 467.0d && d < 418.0d) ? 1 : 2;
    }

    static {
        f35839a.put(0, new Integer[]{26, 32, 38, 44, 51, 57, 63, 69, 0, 24});
        f35839a.put(25, new Integer[]{26, 31, 36, 43, 49, 54, 60, 66, 25, 29});
        f35839a.put(30, new Integer[]{23, 29, 35, 41, 46, 52, 57, 62, 30, 34});
        f35839a.put(35, new Integer[]{23, 28, 33, 39, 44, 49, 55, 61, 35, 39});
        f35839a.put(40, new Integer[]{20, 26, 32, 36, 42, 47, 52, 57, 40, 44});
        f35839a.put(45, new Integer[]{20, 25, 30, 35, 40, 44, 49, 54, 45, 49});
        f35839a.put(50, new Integer[]{20, 24, 28, 33, 37, 42, 47, 52, 50, 54});
        f35839a.put(55, new Integer[]{17, 22, 27, 31, 35, 40, 44, 48, 55, 59});
        f35839a.put(60, new Integer[]{17, 21, 25, 29, 33, 37, 41, 45, 60, 65});
        f35841c.put(0, new Integer[]{22, 27, 32, 37, 42, 47, 52, 57, 0, 24});
        f35841c.put(25, new Integer[]{21, 26, 31, 36, 41, 45, 50, 55, 25, 29});
        f35841c.put(30, new Integer[]{20, 25, 30, 34, 38, 43, 47, 51, 30, 34});
        f35841c.put(35, new Integer[]{20, 24, 28, 32, 36, 41, 45, 49, 35, 39});
        f35841c.put(40, new Integer[]{18, 22, 26, 30, 34, 38, 42, 46, 40, 44});
        f35841c.put(45, new Integer[]{18, 21, 24, 28, 32, 36, 39, 42, 45, 49});
        f35841c.put(50, new Integer[]{14, 19, 23, 26, 30, 33, 37, 41, 50, 54});
        f35841c.put(55, new Integer[]{15, 18, 21, 24, 28, 31, 34, 37, 55, 59});
        f35841c.put(60, new Integer[]{13, 16, 19, 22, 25, 28, 31, 34, 60, 65});
    }

    public static double b(hcr hcrVar) {
        if (hcrVar == null) {
            LogUtil.j("Suggest_RunCourseRecommendUtil", "runCourseBean == null");
            return 0.0d;
        }
        int i = hcrVar.d().i();
        double dB = hcrVar.b();
        int iC = hcrVar.e().c();
        double dA = a(hcrVar.a().b());
        return ((4.0d - Math.abs(((double) i) - dB)) * 10.0d) + ((4.0d - Math.abs(((double) iC) - dA)) * 10.0d) + ((4.0d - Math.abs(((double) hcrVar.e().a()) - dA)) * 10.0d) + ((e((hcrVar.d().h() / 1000.0d) / 60.0d) - e(((double) hcrVar.a().e()) / 60.0d)) * 0.1d);
    }

    public static void a(int i) {
        d("userPurpose", Integer.toString(i));
    }

    public static void e(int i, int i2, double d) {
        d("userFitnessLevel", Integer.toString(i));
        d("userPurpose", Integer.toString(i2));
        d("userPurposeTime", Double.toString(d));
    }

    public static int b(hcp hcpVar) {
        if (hcpVar == null) {
            LogUtil.j("Suggest_RunCourseRecommendUtil", "userFitnessInfoBean == null");
            return 1;
        }
        if (!hcpVar.g()) {
            LogUtil.a("Suggest_RunCourseRecommendUtil", "userFitnessInfoBean.getAverageDistance()= ", Integer.valueOf(hcpVar.e()));
            if (hcpVar.e() < 2000) {
                return 1;
            }
            if (hcpVar.a() == 0) {
                return a(hcpVar.c());
            }
            return b(hcpVar.c());
        }
        return e(hcpVar.j(), d(hcpVar.a(), hcpVar.d()));
    }

    private static double e(double d) {
        return new BigDecimal(d).setScale(1, 1).doubleValue();
    }

    private static int e(int i, Integer[] numArr) {
        if (numArr != null && numArr.length > 1 && numArr.length == 10) {
            if (i >= numArr[5].intValue()) {
                return 4;
            }
            if (i >= numArr[4].intValue()) {
                return 3;
            }
            if (i >= numArr[2].intValue()) {
                return 2;
            }
        }
        return 1;
    }

    public static Integer[] d(int i, int i2) {
        Map.Entry<Integer, Integer[]> entryFloorEntry;
        if (i2 == 0) {
            LogUtil.j("Suggest_RunCourseRecommendUtil", "getOxRange maybe on wrong age 0");
        }
        if (i == 0) {
            entryFloorEntry = f35839a.floorEntry(Integer.valueOf(i2));
        } else {
            entryFloorEntry = f35841c.floorEntry(Integer.valueOf(i2));
        }
        if (entryFloorEntry != null) {
            return entryFloorEntry.getValue();
        }
        return new Integer[]{0};
    }

    public static int[] d(hcp hcpVar, int i, hcv hcvVar) {
        if (hcpVar == null || hcvVar == null) {
            LogUtil.j("Suggest_RunCourseRecommendUtil", "userFitnessInfoBean == null || userPurposeBean == null");
            return new int[]{1, 1};
        }
        if (hcvVar.c() != 0) {
            return new int[]{hcvVar.c(), hcvVar.a()};
        }
        if (hcpVar.b() == 0.0d) {
            return new int[]{1, 1};
        }
        if (24.0d < hcpVar.b()) {
            return new int[]{2, 2};
        }
        if (hcpVar.b() >= 24.0d || hcpVar.b() <= 0.0d) {
            return new int[]{1, 1};
        }
        if (i == 1) {
            return new int[]{1, 1};
        }
        if (i == 2) {
            return new int[]{3, 1};
        }
        if (i == 3) {
            return new int[]{3, 4};
        }
        if (i == 4) {
            return new int[]{4, 3};
        }
        return new int[]{1, 1};
    }

    public static int a(String str) {
        f35840b.put("R001", 1);
        f35840b.put("R002", 1);
        f35840b.put("R012R", 1);
        f35840b.put("R014R", 1);
        f35840b.put("R013R", 2);
        f35840b.put("R016R", 2);
        f35840b.put("R017R", 3);
        f35840b.put("R018R", 3);
        f35840b.put("R019R", 3);
        f35840b.put("R020R", 3);
        f35840b.put("R021R", 4);
        f35840b.put("R022R", 4);
        f35840b.put("R023R", 4);
        f35840b.put("R024R", 4);
        f35840b.put("R008R", 1);
        f35840b.put("R009R", 1);
        f35840b.put("R011R", 3);
        f35840b.put("R010R", 3);
        f35840b.put("R015R", 2);
        if (f35840b.containsKey(str)) {
            return f35840b.get(str).intValue();
        }
        return 0;
    }

    public static void c(String str, long j, FitWorkout fitWorkout) {
        if (str == null || fitWorkout == null) {
            LogUtil.j("Suggest_RunCourseRecommendUtil", "label == null|| fitWorkout == null");
            return;
        }
        String string = Integer.toString(a(fitWorkout.acquireId()));
        LogUtil.a("Suggest_RunCourseRecommendUtil", "courseIdStr= ", string);
        a(str, string, j, null);
        d(str, j, string);
    }

    public static void a(String str, String str2, long j, hcv hcvVar) {
        hcv hcvVarC;
        if (str == null || str2 == null) {
            LogUtil.j("Suggest_RunCourseRecommendUtil", "label == null||courseIdStr==null");
            return;
        }
        hcv hcvVar2 = new hcv();
        if (hcvVar != null) {
            a(str, a(hcvVar));
            return;
        }
        String strI = i(str);
        if (strI != null && (hcvVarC = c(strI)) != null && hcvVarC.c() != 0) {
            hcvVar2.a(j);
            hcvVar2.b(hcvVarC.e());
            hcvVar2.c(CommonUtil.j(str2));
            hcvVar2.e(hcvVarC.a());
        } else {
            hcvVar2.a(j);
            hcvVar2.b(j);
            hcvVar2.c(CommonUtil.j(str2));
            hcvVar2.e(CommonUtil.j(str2));
        }
        LogUtil.a("Suggest_RunCourseRecommendUtil", "setLastUseOrWatchCourse buildRequestParam", a(hcvVar2));
        a(str, a(hcvVar2));
    }

    private static void d(final String str, final long j, final String str2) {
        LogUtil.a("Suggest_RunCourseRecommendUtil", "setLastUseCourseToDb");
        final hcv hcvVar = new hcv();
        a(str, new RunCourseRecommendCallback() { // from class: gnr.4
            @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
            public void onSuccess(List<String> list) {
            }

            @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
            public void onSuccess(String str3) {
                hcv hcvVarC = gnr.c(str3);
                if (hcvVarC == null || hcvVarC.c() == 0) {
                    hcvVar.a(j);
                    hcvVar.b(j);
                    hcvVar.c(CommonUtil.j(str2));
                    hcvVar.e(CommonUtil.j(str2));
                } else {
                    hcvVar.a(j);
                    hcvVar.b(hcvVarC.e());
                    hcvVar.c(CommonUtil.j(str2));
                    hcvVar.e(hcvVarC.c());
                }
                gnr.b(str, gnr.a(hcvVar));
            }

            @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
            public void onFailure(int i, String str3) {
                hcvVar.a(j);
                hcvVar.b(j);
                hcvVar.c(CommonUtil.j(str2));
                hcvVar.e(CommonUtil.j(str2));
                gnr.b(str, gnr.a(hcvVar));
            }
        });
    }

    public static hcv b(String str) {
        if (str == null) {
            LogUtil.j("Suggest_RunCourseRecommendUtil", "getLastUseCourse label == null ");
            return null;
        }
        LogUtil.a("Suggest_RunCourseRecommendUtil", "getLastUseCourse");
        return c(i(str));
    }

    public static void e(List<String> list, long j) {
        hco hcoVar = new hco();
        hcoVar.a(list);
        hcoVar.b(j);
        String strE = e(hcoVar);
        LogUtil.a("Suggest_RunCourseRecommendUtil", "setFourRecommendCourse buildRequestParam(tempBean)", strE);
        a("save_run_course_recommend", strE);
        h(strE);
    }

    public static String c() {
        String strI = i("save_run_course_recommend");
        LogUtil.a("Suggest_RunCourseRecommendUtil", "getFourRecommendCourse .get ", strI);
        return strI;
    }

    public static void g(String str) {
        if (str == null) {
            LogUtil.j("Suggest_RunCourseRecommendUtil", "setUserFitness info == null ");
        } else {
            a("run_course_recommend_config", str);
        }
    }

    public static String a() {
        return i("run_course_recommend_config");
    }

    private static void d(String str, String str2) {
        if (str == null || str2 == null) {
            LogUtil.j("Suggest_RunCourseRecommendUtil", "insertLabel, key == null || value == null");
        } else {
            ((UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class)).initLabel(str, str2, LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        }
    }

    public static void j(final String str) {
        if (str == null) {
            LogUtil.j("Suggest_RunCourseRecommendUtil", "setUserBodyInfoToDb userInfo == null ");
        } else {
            lsy.a(new Runnable() { // from class: gnr.3
                @Override // java.lang.Runnable
                public void run() {
                    HiHealthManager.d(BaseApplication.getContext()).setUserPreference(new HiUserPreference("run_course_recommend_config", str), true);
                }
            });
        }
    }

    public static void b(final RunCourseRecommendCallback runCourseRecommendCallback) {
        if (runCourseRecommendCallback == null) {
            LogUtil.j("Suggest_RunCourseRecommendUtil", "getUserBodyInfoFromDb callback == null ");
        } else {
            lsy.a(new Runnable() { // from class: gnr.1
                @Override // java.lang.Runnable
                public void run() {
                    HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("run_course_recommend_config");
                    if (userPreference == null) {
                        runCourseRecommendCallback.onFailure(0, "getUserBodyInfoFromDb userPreference is null");
                    } else if (TextUtils.isEmpty(userPreference.getValue())) {
                        runCourseRecommendCallback.onFailure(0, "getUserBodyInfoFromDb userinfo is null");
                    } else {
                        runCourseRecommendCallback.onSuccess(userPreference.getValue());
                        LogUtil.a("Suggest_RunCourseRecommendUtil", "getUserBodyInfoFromDb callback.onSuccess .");
                    }
                }
            });
        }
    }

    private static void h(final String str) {
        if (str == null) {
            LogUtil.j("Suggest_RunCourseRecommendUtil", "setCourseToDb userInfo == null ");
        } else {
            lsy.a(new Runnable() { // from class: gnr.5
                @Override // java.lang.Runnable
                public void run() {
                    HiHealthManager.d(BaseApplication.getContext()).setUserPreference(new HiUserPreference("save_run_course_recommend", str), true);
                    LogUtil.a("Suggest_RunCourseRecommendUtil", "setCourseToDb finish.");
                }
            });
        }
    }

    public static void d(final RunCourseRecommendCallback runCourseRecommendCallback) {
        if (runCourseRecommendCallback == null) {
            LogUtil.j("Suggest_RunCourseRecommendUtil", "getCourseFromDb callback == null ");
        } else {
            lsy.a(new Runnable() { // from class: gnr.2
                @Override // java.lang.Runnable
                public void run() {
                    HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("save_run_course_recommend");
                    if (userPreference == null) {
                        runCourseRecommendCallback.onFailure(0, "getCourseFromDb userPreference is null");
                    } else if (TextUtils.isEmpty(userPreference.getValue())) {
                        runCourseRecommendCallback.onFailure(0, "getCourseFromDb userinfo is null");
                    } else {
                        runCourseRecommendCallback.onSuccess(userPreference.getValue());
                        LogUtil.a("Suggest_RunCourseRecommendUtil", "getCourseFromDb callback.onSuccess .");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final String str, final String str2) {
        lsy.a(new Runnable() { // from class: gnr.6
            @Override // java.lang.Runnable
            public void run() {
                HiHealthManager.d(BaseApplication.getContext()).setUserPreference(new HiUserPreference(str, str2), true);
                LogUtil.a("Suggest_RunCourseRecommendUtil", "setUseOrWatchCourseToDb finish.");
            }
        });
    }

    public static void a(final String str, final RunCourseRecommendCallback runCourseRecommendCallback) {
        if (str == null || runCourseRecommendCallback == null) {
            LogUtil.j("Suggest_RunCourseRecommendUtil", "getUseOrWatchCourseFromDb key == null || callback == null ");
        } else {
            lsy.a(new Runnable() { // from class: gnr.10
                @Override // java.lang.Runnable
                public void run() {
                    HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference(str);
                    if (userPreference == null) {
                        runCourseRecommendCallback.onFailure(0, "getUseOrWatchCourseFromDb userPreference is null");
                    } else if (TextUtils.isEmpty(userPreference.getValue())) {
                        runCourseRecommendCallback.onFailure(0, "getUseOrWatchCourseFromDb userinfo is null");
                    } else {
                        runCourseRecommendCallback.onSuccess(userPreference.getValue());
                        LogUtil.a("Suggest_RunCourseRecommendUtil", "getUseOrWatchCourseFromDb callback.onSuccess");
                    }
                }
            });
        }
    }

    public static String c(hcp hcpVar) {
        if (hcpVar == null) {
            return null;
        }
        LogUtil.a("Suggest_RunCourseRecommendUtil", "buildRequestParam UserFitnessInfoBean");
        return new Gson().toJson(hcpVar);
    }

    private static String e(hco hcoVar) {
        if (hcoVar == null) {
            return null;
        }
        LogUtil.a("Suggest_RunCourseRecommendUtil", "buildRequestParam runCourseRecommendBean");
        return new Gson().toJson(hcoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a(hcv hcvVar) {
        if (hcvVar == null) {
            return null;
        }
        LogUtil.a("Suggest_RunCourseRecommendUtil", "buildRequestParam userPurposeBean");
        return new Gson().toJson(hcvVar);
    }

    public static hcp e(String str) {
        if (str == null) {
            LogUtil.e("Suggest_RunCourseRecommendUtil", "UserFitnessInfo data == null");
            return null;
        }
        try {
            return (hcp) new Gson().fromJson(str, hcp.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("Suggest_RunCourseRecommendUtil", "UserFitnessInfo Json Exception");
            return null;
        }
    }

    public static hco d(String str) {
        if (str == null) {
            LogUtil.e("Suggest_RunCourseRecommendUtil", "Recommend data == null");
            return null;
        }
        try {
            return (hco) new Gson().fromJson(str, hco.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("Suggest_RunCourseRecommendUtil", "Recommend Json Exception");
            return null;
        }
    }

    public static hcv c(String str) {
        if (str == null) {
            LogUtil.e("Suggest_RunCourseRecommendUtil", "UserPurpose data == null");
            return null;
        }
        try {
            return (hcv) new Gson().fromJson(str, hcv.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("Suggest_RunCourseRecommendUtil", "UserPurpose Json Exception");
            return null;
        }
    }

    public static int e(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 6) {
            LogUtil.a("Suggest_RunCourseRecommendUtil", "difficulty is null");
        }
        return 1;
    }

    private static void a(String str, String str2) {
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), str, str2, null);
    }

    private static String i(String str) {
        return SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), str);
    }
}
