package defpackage;

import android.content.SharedPreferences;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class glw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile glw f35645c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f35647b = {n()};
    private String e = f(g());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35646a = f(j());

    private glw() {
    }

    public static glw c() {
        if (f35645c == null) {
            synchronized (gls.class) {
                if (f35645c == null) {
                    f35645c = new glw();
                }
            }
        }
        return f35645c;
    }

    private String n() {
        return "getLimitAllKey";
    }

    private String g() {
        return "getLanguage";
    }

    private String j() {
        return "getHuid";
    }

    private long e(String[] strArr) {
        long jLongValue = 0;
        for (String str : strArr) {
            jLongValue += ifp.a((Object) f(str)).longValue();
        }
        return jLongValue;
    }

    private String c(String str, String[] strArr) {
        return new StringBuffer().append(str).append("_").append(String.valueOf(e(strArr))).toString();
    }

    private void l(String str) {
        d(str, this.f35647b);
    }

    private void d(String str, String[] strArr) {
        e(str, c(String.valueOf(ift.g(System.currentTimeMillis())), strArr));
    }

    private boolean m(String str) {
        return a(str, this.f35647b);
    }

    private boolean a(String str, String[] strArr) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        String str2 = this.f35646a;
        if ((str2 != null && !str2.equals(accountInfo)) || (this.f35646a == null && accountInfo != null)) {
            this.f35646a = accountInfo;
            e(j(), this.f35646a);
            b();
        }
        String strB = btx.b();
        String str3 = this.e;
        if ((str3 != null && !str3.equals(strB)) || (this.e == null && strB != null)) {
            this.e = strB;
            e(g(), this.e);
            b();
        }
        String strF = f(str);
        String[] strArrSplit = strF != null ? strF.split("_") : null;
        if (strArrSplit == null || strArrSplit.length != 2) {
            return true;
        }
        boolean zA = a(ifp.a((Object) strArrSplit[0]).longValue(), ifp.a((Object) strArrSplit[1]).longValue(), e(strArr));
        LogUtil.d("Suggestion_DataUpdateHelper", str, " isNeedUpdate ", Boolean.valueOf(zA));
        return zA;
    }

    private boolean a(long j, long j2, long j3) {
        LogUtil.d("Suggestion_DataUpdateHelper", "lastUpdateTime:", Long.valueOf(j), ",lastVersion:", Long.valueOf(j2), ",limitVersion:", Long.valueOf(j3));
        long jG = ift.g(System.currentTimeMillis()) - j;
        return jG > 3600 || jG < 0 || j2 != j3;
    }

    private void n(String str) {
        e(str, String.valueOf(0));
    }

    private void k(String str) {
        e(str, String.valueOf(ifp.a((Object) f(str)).longValue() + 1));
    }

    public void b() {
        k(n());
    }

    public void c(String str) {
        l(i(str));
    }

    private String i(String str) {
        return "getWorkoutFilters_" + str;
    }

    public boolean b(String str, String str2, String str3) {
        return m(e(str, str2, str3));
    }

    public boolean d(String str, String str2, String str3, String str4) {
        return m(c(str, str2, str3, str4));
    }

    public void a(String str, String str2, String str3) {
        l(e(str, str2, str3));
    }

    public void e(String str, String str2, String str3, String str4) {
        l(c(str, str2, str3, str4));
    }

    private String e(String str, String str2, String str3) {
        String string;
        synchronized (this) {
            HashMap map = new HashMap(4);
            map.put("action", "getWorkoutInfo");
            map.put(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID, str);
            map.put("sex", str2);
            map.put("version", str3);
            string = map.toString();
        }
        return string;
    }

    private String c(String str, String str2, String str3, String str4) {
        String string;
        synchronized (this) {
            HashMap map = new HashMap(5);
            map.put("action", "getWorkoutInfo");
            map.put(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID, str);
            map.put("sex", str2);
            map.put("version", str3);
            map.put("language", str4);
            string = map.toString();
        }
        return string;
    }

    public boolean d(String str) {
        return m(j(str));
    }

    public void b(String str) {
        l(j(str));
    }

    public void e(String str) {
        g(j(str));
    }

    private String j(String str) {
        String string;
        synchronized (this) {
            HashMap map = new HashMap(2);
            map.put("action", "getGetPlanProgress");
            map.put("planId", str);
            string = map.toString();
        }
        return string;
    }

    public boolean b(int i, int i2) {
        return m(d(i, i2));
    }

    public void a(int i, int i2) {
        l(d(i, i2));
    }

    private String d(int i, int i2) {
        String string;
        synchronized (this) {
            HashMap map = new HashMap(3);
            map.put("action", "getFinishedPlans");
            map.put("pageStart", Integer.valueOf(i));
            map.put(IAchieveDBMgr.PARAM_PAGE_SIZE, Integer.valueOf(i2));
            string = map.toString();
        }
        return string;
    }

    public boolean d() {
        return m(f());
    }

    public void h() {
        l(f());
    }

    public void e() {
        n(f());
    }

    private String f() {
        return "getCurrentPlan";
    }

    public boolean a() {
        return m("getSmartPlan");
    }

    public void i() {
        l("getSmartPlan");
    }

    public boolean a(String str) {
        return m(h(str));
    }

    private String h(String str) {
        HashMap map = new HashMap(2);
        map.put("action", "getQueryTrainCountByWorkoutId");
        map.put(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID, str);
        return map.toString();
    }

    private void e(String str, String str2) {
        if (m().edit().putString(str, str2).commit()) {
            return;
        }
        LogUtil.e("Suggestion_DataUpdateHelper", "key=", str, "value=", str2);
    }

    private String f(String str) {
        return m().getString(str, "");
    }

    private SharedPreferences m() {
        return BaseApplication.getContext().getApplicationContext().getSharedPreferences("fit_DataUpdateHelper", 0);
    }

    private void g(String str) {
        SharedPreferences.Editor editorEdit = m().edit();
        editorEdit.remove(str);
        if (editorEdit.commit()) {
            return;
        }
        LogUtil.e("Suggestion_DataUpdateHelper", "deleteSharedPreference error key=", str);
    }
}
