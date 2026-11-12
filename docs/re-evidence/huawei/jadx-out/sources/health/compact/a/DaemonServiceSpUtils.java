package health.compact.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.ui.widget.XiaomiWidgetProvider;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import defpackage.lsl;
import defpackage.njy;
import defpackage.nzy;
import defpackage.qqt;
import defpackage.qsr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DaemonServiceSpUtils {
    private DaemonServiceSpUtils() {
    }

    public static boolean b(Context context) {
        if (context == null) {
            LogUtil.b("Step_DaemonSvcSpUt", "isDaemonActive ", "context is null");
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonservice_sp_new", 0);
        if (sharedPreferences == null) {
            return false;
        }
        boolean z = sharedPreferences.getBoolean("THE_MAIN_UI_START_DAEMON_SERVICE", false);
        ReleaseLogUtil.c("Step_DaemonSvcSpUt", "isDaemonActive: ", Boolean.valueOf(z));
        return z;
    }

    public static void d(Context context) {
        SharedPreferences.Editor editorEdit;
        if (context == null || (editorEdit = context.getSharedPreferences("daemonservice_sp_new", 0).edit()) == null) {
            return;
        }
        editorEdit.putBoolean("THE_MAIN_UI_START_DAEMON_SERVICE", true);
        editorEdit.commit();
        LogUtil.b("Step_DaemonSvcSpUt", "enableDaemonActive success: ", true);
    }

    public static boolean e(Context context) {
        if (context == null) {
            LogUtil.b("Step_DaemonSvcSpUt", "isActivityRecognitionControlled ", "context is null");
            return true;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonservice_sp_new", 0);
        if (sharedPreferences == null) {
            return true;
        }
        String string = sharedPreferences.getString("HAS_CONTROLLED_BY_AR_KEY_NEW", "");
        ReleaseLogUtil.c("Step_DaemonSvcSpUt", "isActivityRecognitionControlled: ", string);
        return string != null && string.equals(Boolean.toString(true));
    }

    public static String a(Context context) {
        if (context == null) {
            LogUtil.b("Step_DaemonSvcSpUt", "hasControlledByActivityRecognition ", "context is null");
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonservice_sp_new", 0);
        if (sharedPreferences == null) {
            return "";
        }
        String string = sharedPreferences.getString("HAS_CONTROLLED_BY_AR_KEY_NEW", "");
        ReleaseLogUtil.c("Step_DaemonSvcSpUt", "hasControlledByActivityRecognition: ", string);
        return string;
    }

    public static void b(Context context, boolean z) {
        SharedPreferences.Editor editorEdit;
        if (context == null || (editorEdit = context.getSharedPreferences("daemonservice_sp_new", 0).edit()) == null) {
            return;
        }
        editorEdit.putString("HAS_CONTROLLED_BY_AR_KEY_NEW", Boolean.toString(z));
        editorEdit.commit();
        ReleaseLogUtil.c("Step_DaemonSvcSpUt", "setIsControlledByAr isControlled: ", Boolean.valueOf(z));
    }

    public static void c(String str) {
        SharedPreferences.Editor editorEdit;
        Context contextB = BaseApplication.b();
        if (contextB == null || (editorEdit = contextB.getSharedPreferences("daemonservice_sp_new", 0).edit()) == null) {
            return;
        }
        editorEdit.putString("FA_FORM_LIST_CACHE_KEY", str);
        editorEdit.commit();
        LogUtil.b("Step_DaemonSvcSpUt", "updateFaFormList success: ", str);
    }

    public static String c() {
        SharedPreferences sharedPreferences;
        Context contextB = BaseApplication.b();
        if (contextB == null || (sharedPreferences = contextB.getSharedPreferences("daemonservice_sp_new", 0)) == null) {
            return "";
        }
        String string = sharedPreferences.getString("FA_FORM_LIST_CACHE_KEY", "");
        LogUtil.b("Step_DaemonSvcSpUt", "getFaFormList : ", string);
        return string;
    }

    public static void b(String str) {
        SharedPreferences.Editor editorEdit;
        Context contextB = BaseApplication.b();
        if (contextB == null || (editorEdit = contextB.getSharedPreferences("daemonservice_sp_new", 0).edit()) == null) {
            return;
        }
        editorEdit.putString("FA_FORM_ABILITY_SET_KEY", str);
        editorEdit.commit();
        LogUtil.b("Step_DaemonSvcSpUt", "saveFaAbility success: ", str);
    }

    public static String b() {
        SharedPreferences sharedPreferences;
        Context contextB = BaseApplication.b();
        if (contextB == null || (sharedPreferences = contextB.getSharedPreferences("daemonservice_sp_new", 0)) == null) {
            return "";
        }
        String string = sharedPreferences.getString("FA_FORM_ABILITY_SET_KEY", "");
        LogUtil.b("Step_DaemonSvcSpUt", "getFaAbilitySet : ", string);
        return string;
    }

    public static boolean j() {
        return lsl.b(SharedPreferenceManager.c("MODULE_DEAMON_SERVER", "ABNORMAL_STEP_DIALOG_DATE", 20140101), DateFormatUtil.a(System.currentTimeMillis())) > qsr.c().b();
    }

    public static void a(long j) {
        SharedPreferenceManager.c("MODULE_DEAMON_SERVER", "ABNORMAL_STEP_GOTO_UNDERSTAND", j);
    }

    public static long h() {
        return SharedPreferenceManager.d("MODULE_DEAMON_SERVER", "ABNORMAL_STEP_GOTO_UNDERSTAND", 0L);
    }

    public static int d() {
        return SharedPreferenceManager.c("MODULE_DEAMON_SERVER", "CONTINUE_ABNORMAL_DAY", 0);
    }

    public static void n() {
        SharedPreferenceManager.c("MODULE_DEAMON_SERVER", "CONTINUE_ABNORMAL_DAY", d() + 1);
    }

    public static void m() {
        SharedPreferenceManager.c("MODULE_DEAMON_SERVER", "CONTINUE_ABNORMAL_DAY", 0L);
    }

    public static void e(boolean z) {
        SharedPreferenceManager.a("MODULE_DEAMON_SERVER", "SHOW_ABNORMAL_STEP_DIALOG", z);
    }

    public static boolean f() {
        return SharedPreferenceManager.b("MODULE_DEAMON_SERVER", "SHOW_ABNORMAL_STEP_DIALOG", false);
    }

    public static void l() {
        SharedPreferenceManager.d("MODULE_DEAMON_SERVER", "ABNORMAL_STEP_DIALOG_DATE", DateFormatUtil.a(System.currentTimeMillis()));
    }

    public static boolean i() {
        return d() >= qsr.c().a();
    }

    public static void k() {
        SharedPreferenceManager.c(Integer.toString(10000), "ALIVE_DIALOG_SETTING", DateFormatUtil.d(System.currentTimeMillis(), DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT));
    }

    public static String a() {
        return SharedPreferenceManager.b(Integer.toString(10000), "ALIVE_DIALOG_SETTING", "0");
    }

    public static void o() {
        SharedPreferenceManager.c(Integer.toString(10000), "ALIVE_DIALOG_CANCEL", DateFormatUtil.d(System.currentTimeMillis(), DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT));
    }

    public static String e() {
        return SharedPreferenceManager.b(Integer.toString(10000), "ALIVE_DIALOG_CANCEL", "0");
    }

    public static void b(String str, String str2, long j, String str3) {
        ArrayList arrayList;
        if (!"process stop".equals(str3) || !XiaomiWidgetProvider.DAEMON_SERVICE_PROCESS.equals(str)) {
            LogUtil.b("Step_DaemonSvcSpUt", "setNearAliveInfo not stop daemonService");
            return;
        }
        List<nzy> listG = g();
        nzy nzyVar = new nzy();
        nzyVar.e(j);
        if (TextUtils.isEmpty(str2)) {
            nzyVar.d("");
        } else {
            nzyVar.d(str2);
        }
        if (njy.e(listG)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(nzyVar);
            SharedPreferenceManager.c("MODULE_DEAMON_SERVER", "ALIVE_INFO_LAST_DAEMON", qqt.b(arrayList2));
        } else {
            if (listG.size() >= 3) {
                arrayList = new ArrayList(listG.subList(listG.size() - 2, listG.size()));
            } else {
                arrayList = new ArrayList(listG);
            }
            arrayList.add(nzyVar);
            SharedPreferenceManager.c("MODULE_DEAMON_SERVER", "ALIVE_INFO_LAST_DAEMON", qqt.b(arrayList));
        }
    }

    public static List<nzy> g() {
        try {
            String strB = SharedPreferenceManager.b("MODULE_DEAMON_SERVER", "ALIVE_INFO_LAST_DAEMON", "");
            if (TextUtils.isEmpty(strB)) {
                return new ArrayList();
            }
            return (List) qqt.c(strB, new TypeToken<List<nzy>>() { // from class: com.huawei.health.util.DaemonServiceSpUtils$1
            }.getType());
        } catch (JsonParseException | NullPointerException e) {
            ReleaseLogUtil.b("Step_DaemonSvcSpUt", "getNearAliveInfo ex:", ExceptionUtils.c(e));
            return new ArrayList();
        }
    }
}
