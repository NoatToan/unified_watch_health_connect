package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.huawei.appgallery.agd.api.AgdConstant;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.utils.WebViewUtils;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.ResultCode;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes13.dex */
public class pap {
    private static final String[] e = {"2855670", "2934914", "2624136", "2787804", "3120668", "3279864", "3368659", "3428891", "4018400", "4142595", "4267785", "4304180", "4414136", "4587804"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f45096c = {"3509119", "3658543", "3793654", "3835521", "3904161"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f45094a = {"2624136", "2787804"};
    private static final String[] d = {"1000", "1100", AgdConstant.INSTALL_TYPE_MINI_MANUAL, AgdConstant.INSTALL_TYPE_MINI_AUTO, "1300", "1400", "1500", "1600", "1700", "1900"};
    private static final String[] i = {"1100", AgdConstant.INSTALL_TYPE_MINI_MANUAL, "1900", "130010", "210020", "2160030", "430140", "540550", "651060", "760070", "800110", "910010", "1005020", "1110030", "1260040", "1350050", "1400110", "1510010", "1605020", "1710030", "1860040", "1950050", "2010050", "3076638"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f45095b = {ResultCode.CODE_UNKNOWN_ERROR, "10002", "10003", "10004", ResultCode.CODE_AUTH_FAIL, "20001", "20002", "20003", "20004", "20005", "20006", "20007", "20008", "20009", "30001", "30002", "30003", "30004", "30005", "30006", "30007", "30008", "30009", "30010", "30011", "30012", "30013", "30014", "30015", "30016", "30017", "30018", "40001", "40002", "40003", "40004", "40005", "40006", "40007", "40008", "40009", "40010", "40011", "40012", "40013", "40014"};

    public static boolean a(long j, long j2) {
        return j2 - j > 120000;
    }

    public static boolean c(int i2) {
        return i2 == 40006 || i2 == 40007 || i2 == 40008 || i2 == 30013 || i2 == 30014 || i2 == 40009;
    }

    public static boolean d(int i2) {
        return i2 == 30008;
    }

    public static boolean e(int i2) {
        return i2 == 10003 || i2 == 10002 || i2 == 10004 || i2 == 10001 || i2 == 10005;
    }

    public static boolean e(long j, long j2) {
        if (j2 < j) {
            LogUtil.a("PLGACHIEVE_KakaUtil", "afterTimestamps is invalid");
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        return (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) ? false : true;
    }

    public static boolean c(long j, long j2) {
        if (j2 < j) {
            LogUtil.a("PLGACHIEVE_KakaUtil", "afterTimestamps is invalid");
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.setFirstDayOfWeek(2);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        calendar2.setFirstDayOfWeek(2);
        return calendar.get(3) != calendar2.get(3);
    }

    public static boolean b(long j, long j2) {
        if (j2 < j) {
            LogUtil.a("PLGACHIEVE_KakaUtil", "afterTimestamps is invalid");
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        return (calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) ? false : true;
    }

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        LogUtil.a("PLGACHIEVE_KakaUtil", "getLastSyncDate syncDate=", str);
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e2) {
            LogUtil.e("PLGACHIEVE_KakaUtil", "NumberFormatException", e2.getMessage());
            return 0L;
        }
    }

    public static String e() {
        StringBuilder sb = new StringBuilder(10);
        String str = new SimpleDateFormat("Z", Locale.ENGLISH).format(Calendar.getInstance().getTime());
        if (!TextUtils.isEmpty(str)) {
            LogUtil.a("PLGACHIEVE_KakaUtil", "getNewTimezone gmtStr =", str);
            sb.append(str);
        } else {
            sb.append("+0800");
        }
        return sb.toString();
    }

    public static boolean e(Context context) {
        if (context == null) {
            LogUtil.a("PLGACHIEVE_KakaUtil", "isRTLLanguage() context is null");
            return false;
        }
        String language = context.getResources().getConfiguration().locale.getLanguage();
        return "ar".equalsIgnoreCase(language) || "iw".equalsIgnoreCase(language) || "he".equalsIgnoreCase(language) || "fa".equalsIgnoreCase(language) || Constants.URDU_LANG.equalsIgnoreCase(language) || "ug".equalsIgnoreCase(language);
    }

    public static boolean e(long j) {
        if (0 == j) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return j >= c(true, jCurrentTimeMillis) && j <= c(false, jCurrentTimeMillis);
    }

    public static boolean m(String str) {
        return String.valueOf(1100).equals(str) || String.valueOf(1200).equals(str) || String.valueOf(KakaConstants.TASK_ENTER_TODAY_WEIGHT).equals(str);
    }

    public static boolean c(String str) {
        return String.valueOf(1200).equals(str) || String.valueOf(KakaConstants.TASK_ENTER_TODAY_WEIGHT).equals(str);
    }

    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return String.valueOf(1900).equals(str) || String.valueOf(KakaConstants.TASK_SEC_EXCHANGE_INSURANCE).equals(str) || String.valueOf(KakaConstants.TASK_HEALTH_JUMP).equals(str);
    }

    public static boolean h(String str) {
        return (String.valueOf(3).equals(str) || String.valueOf(2).equals(str)) ? false : true;
    }

    public static boolean o(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("PLGACHIEVE_KakaUtil", "judgeTaskIDByVersion key is null");
            return false;
        }
        if (!paw.c(d, str)) {
            return false;
        }
        LogUtil.a("PLGACHIEVE_KakaUtil", "judgeTaskIDByVersion true");
        return true;
    }

    public static boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("PLGACHIEVE_KakaUtil", "judgeTaskIDByVersionTwo key is null");
            return false;
        }
        if (!paw.c(i, str) && !paw.c(f45095b, str)) {
            return false;
        }
        LogUtil.d("PLGACHIEVE_KakaUtil", "judgeTaskIDByVersionTwo true taskId=", str);
        return true;
    }

    public static boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PLGACHIEVE_KakaUtil", "isTaskIdInHealthLife taskId is null");
            return false;
        }
        if (!paw.c(e, str)) {
            return false;
        }
        LogUtil.d("PLGACHIEVE_KakaUtil", "isTaskIdInHealthLife true taskId=", str);
        return true;
    }

    public static boolean g(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PLGACHIEVE_KakaUtil", "isTaskIdInHealthLife taskId is null");
            return false;
        }
        if (!paw.c(f45096c, str)) {
            return false;
        }
        LogUtil.d("PLGACHIEVE_KakaUtil", "isTaskIdInHealthLife true taskId=", str);
        return true;
    }

    public static boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PLGACHIEVE_KakaUtil", "isTaskIdInHealthLife taskId is null");
            return false;
        }
        if (!paw.c(f45094a, str)) {
            return false;
        }
        LogUtil.d("PLGACHIEVE_KakaUtil", "isTaskIdInHealthLife true taskId=", str);
        return true;
    }

    public static long c(boolean z, long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        if (z) {
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
        } else {
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 999);
        }
        return calendar.getTimeInMillis();
    }

    public static void c(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                LogUtil.j("PLGACHIEVE_KakaUtil", "avoidImplicitProblem: packageManager is null ");
                return;
            }
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity == null) {
                LogUtil.j("PLGACHIEVE_KakaUtil", "avoidImplicitProblem: resolveInfo is null ");
                return;
            }
            intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("PLGACHIEVE_KakaUtil", "avoidImplicitProblem: exception -> " + e2.getMessage());
        }
    }

    public static long d(String str) {
        try {
            return new SimpleDateFormat("yyyyMMdd").parse(str).getTime();
        } catch (ParseException unused) {
            LogUtil.e("PLGACHIEVE_KakaUtil", "getDateZeroTimeStamp parseException");
            return 0L;
        }
    }

    public static int[] b(long j) {
        int i2 = (int) (j / 86400000);
        long j2 = j - (((long) i2) * 86400000);
        int i3 = (int) (j2 / 3600000);
        long j3 = j2 - (((long) i3) * 3600000);
        int i4 = (int) (j3 / 60000);
        return new int[]{i2, i3, i4, (int) ((j3 - (((long) i4) * 60000)) / 1000)};
    }

    public static String b(int i2) {
        String strE = UnitUtil.e(i2, 1, 0);
        String strE2 = UnitUtil.e(0.0d, 1, 0);
        if (String.valueOf(i2).length() != 1) {
            return strE;
        }
        return strE2 + strE;
    }

    public static boolean b(osg osgVar) {
        if (osgVar == null) {
            LogUtil.j("PLGACHIEVE_KakaUtil", "isKakaTaskFinished oldTaskInfo is null");
            return false;
        }
        if (e(a(osa.e(BaseApplication.getContext(), "kakaSyncDate")), System.currentTimeMillis())) {
            return false;
        }
        String strT = osgVar.t();
        LogUtil.a("PLGACHIEVE_KakaUtil", "isKakaTaskFinished taskStatus = ", strT);
        return String.valueOf(1).equals(strT) || String.valueOf(2).equals(strT) || String.valueOf(3).equals(strT);
    }

    public static List<osg> e(int[] iArr, List<osg> list) {
        ArrayList arrayList = new ArrayList(2);
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_KakaUtil", "getTaskListsByRules taskLists is empty");
            return arrayList;
        }
        if (iArr == null || iArr.length == 0) {
            LogUtil.j("PLGACHIEVE_KakaUtil", "getTaskListsByRules taskRules is empty");
            return list;
        }
        HashSet hashSet = new HashSet();
        for (int i2 : iArr) {
            hashSet.add(Integer.valueOf(i2));
        }
        for (osg osgVar : list) {
            if (hashSet.contains(Integer.valueOf(osgVar.ai()))) {
                arrayList.add(osgVar);
            }
        }
        LogUtil.a("PLGACHIEVE_KakaUtil", "getTaskListsByRules taskLists size = ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public static void e(int i2, int i3, int i4) {
        LogUtil.a("PLGACHIEVE_KakaUtil", "kakaPageClickBiEvent type ", Integer.valueOf(i2), " result ", Integer.valueOf(i3), " value ", Integer.valueOf(i4));
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("type", Integer.valueOf(i2));
        map.put("status", Integer.valueOf(i4));
        if (i2 == 6) {
            map.put("result", Integer.valueOf(i3));
        }
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SUCCESSES_KAKA_1100006.value(), map, 0);
    }

    public static void a(CountDownLatch countDownLatch) {
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void c() {
        long jC = qrk.c(System.currentTimeMillis(), 0) + 72000000;
        LogUtil.a("PLGACHIEVE_KakaUtil", "registerKakaReminder requestCode ", 20210603, ", time ", Long.valueOf(jC));
        Context context = BaseApplication.getContext();
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.pluginachievement.ui.kakatask.KakaReminderReceiver");
        intent.putExtra("reminderHuid", LoginInit.getInstance(context).getAccountInfo(1011));
        intent.putExtra("reminderTime", jC);
        xjk.a(20210603, intent, 201326592, 0, jC, 86400000L);
    }

    public static void d() {
        LogUtil.a("PLGACHIEVE_KakaUtil", "cancelKakaReminder requestCode ", 20210603);
        Context context = BaseApplication.getContext();
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.pluginachievement.ui.kakatask.KakaReminderReceiver");
        intent.setPackage(BaseApplication.getAppPackage());
        xjk.d(20210603, intent, 201326592);
    }

    public static void a(osg osgVar) {
        if (osgVar.ai() == 10005) {
            LogUtil.a("PLGACHIEVE_KakaUtil", "save vip taskId to sp");
            osa.b(BaseApplication.getContext(), "needReloadTaskId", osgVar.h());
        }
    }

    public static void b(String str) {
        String strC = osa.c(BaseApplication.getContext(), "needReloadTaskId", "");
        LogUtil.a("PLGACHIEVE_KakaUtil", "clearVipTaskStatusToSp start");
        if (TextUtils.isEmpty(strC) || !strC.equals(str)) {
            return;
        }
        LogUtil.d("PLGACHIEVE_KakaUtil", "clearVipTaskStatusToSp vipTaskId = ", strC);
        osa.b(BaseApplication.getContext(), "needReloadTaskId", "");
    }

    public static void b() {
        String strC = osa.c(BaseApplication.getContext(), "needReloadTaskId", "");
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        LogUtil.a("PLGACHIEVE_KakaUtil", "vip task need refresh to cloud");
        osg osgVar = new osg();
        osgVar.b(strC);
        osgVar.r(10005);
        osgVar.n(0);
        otu.b(BaseApplication.getContext()).d(osgVar, 1);
    }

    public static boolean e(osg osgVar) {
        if (osgVar.ai() == 10005) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "MAIN_VIP_KEY");
            LogUtil.a("PLGACHIEVE_KakaUtil", "parseKakaTaskInfo vip status = :", strE);
            LogUtil.a("PLGACHIEVE_KakaUtil", "parseKakaTaskInfo vip task status = :", osgVar.t());
            if (!"0".equals(strE) && !String.valueOf(1).equals(osgVar.t())) {
                return false;
            }
            LogUtil.a("PLGACHIEVE_KakaUtil", "parseKakaTaskInfo show vip task ");
        }
        return true;
    }

    public static void a(Context context, int i2) {
        LogUtil.a("PLGACHIEVE_KakaUtil", "gotoVipPage vip status = :", SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "MAIN_VIP_KEY"));
        irz.d(context, "from=" + i2);
    }

    public static String a(int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i2);
        calendar.set(12, i3);
        return UnitUtil.d("HH:mm", calendar.getTimeInMillis());
    }

    public static void c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("PLGACHIEVE_KakaUtil", "jumpToH5OrSchemePage context or pagePath is empty");
            return;
        }
        if (str.startsWith("http") || str.startsWith(ProxyConfig.MATCH_HTTPS)) {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            Intent intentCreateWebViewIntent = ddv.b().createWebViewIntent(context, bundle, 268435456);
            if (intentCreateWebViewIntent == null) {
                LogUtil.j("PLGACHIEVE_KakaUtil", "jumpToH5OrSchemePage h5 intent is null");
                return;
            } else {
                context.startActivity(intentCreateWebViewIntent);
                LogUtil.a("PLGACHIEVE_KakaUtil", "jumpToH5OrSchemePage jump to webviewActivity");
                return;
            }
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
        intent.addCategory("android.intent.category.DEFAULT").addFlags(268435456);
        lsx.c(intent, context);
        LogUtil.a("PLGACHIEVE_KakaUtil", "jumpToH5OrSchemePage jump to scheme page");
    }

    public static Map<String, Object> c(ArrayList<ozs> arrayList, int i2) {
        HashMap map = new HashMap(2);
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<ozs> it = arrayList.iterator();
            int i3 = 0;
            int i4 = 0;
            while (it.hasNext()) {
                ozu ozuVarE = it.next().e();
                if (ozuVarE != null && (i2 != 1 || !e(ozuVarE.k()))) {
                    i3++;
                    if ("2".equals(ozuVarE.j())) {
                        i4++;
                    }
                }
            }
            LogUtil.a("PLGACHIEVE_KakaUtil", "aquireKakaTaskInfo taskSize ", Integer.valueOf(i3), " finishCount ", Integer.valueOf(i4), " from ", Integer.valueOf(i2));
            map.put("task_size", Integer.valueOf(i3));
            map.put("finish_count", Integer.valueOf(i4));
        }
        return map;
    }

    public static ArrayList<ozs> a() {
        ArrayList<ozs> arrayList = new ArrayList<>(0);
        HashMap map = new HashMap(2);
        map.put(ParsedFieldTag.KAKA_TASK_SCENARIO, String.valueOf(0));
        List<osf> listD = otl.b(BaseApplication.getContext()).d(12, map);
        if (listD == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(listD.size());
        osg osgVar = null;
        boolean z = true;
        for (osf osfVar : listD) {
            if (osfVar instanceof osg) {
                osg osgVar2 = (osg) osfVar;
                int iA = qrs.a(osgVar2.t());
                if (osgVar2.ai() == 10004 && iA < 1) {
                    z = false;
                }
                if (osgVar2.ai() == 30008) {
                    osgVar = osgVar2;
                }
                arrayList2.add(osgVar2);
            }
        }
        if (osgVar != null && !z) {
            arrayList2.remove(osgVar);
        }
        return oyx.b(arrayList2);
    }

    public static void e(int i2, int i3) {
        LogUtil.a("PLGACHIEVE_KakaUtil", "setKakaDelayEventBi event ", Integer.valueOf(i2));
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("event", Integer.valueOf(i2));
        map.put("from", Integer.valueOf(i3));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SUCCESSES_KAKA_1100082.value(), map, 0);
    }

    public static boolean b(UserAchieveWrapper userAchieveWrapper) {
        if (userAchieveWrapper == null) {
            return false;
        }
        return userAchieveWrapper.getContentType() == 11 || userAchieveWrapper.getContentType() == 19 || userAchieveWrapper.getContentType() == 20 || userAchieveWrapper.getContentType() == 15;
    }

    public static void e(String str) {
        if (k(WebViewUtils.VMALL_PACKAGE_NAME)) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("vmall://com.vmall.client/home/activity?isShowLayout=false&pn=pointsmall" + str));
            intent.setPackage(WebViewUtils.VMALL_PACKAGE_NAME);
            intent.setFlags(268435456);
            c(intent);
            return;
        }
        n(str);
        LogUtil.a("PLGACHIEVE_KakaUtil", "gotoVmall : VMALL APP is not installed");
    }

    private static boolean k(String str) {
        if (lsj.c(BaseApplication.getContext(), str)) {
            return true;
        }
        LogUtil.j("PLGACHIEVE_KakaUtil", "isInstallVmallApp VMALL APP is not installed");
        return false;
    }

    private static void n(final String str) {
        GRSManager.c(BaseApplication.getContext()).d("domainMVmall", new GrsQueryCallback() { // from class: pap.5
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str2) {
                if (TextUtils.isEmpty(str2)) {
                    LogUtil.j("PLGACHIEVE_KakaUtil", "gotoVmallWeb vmallHost is empty");
                    return;
                }
                Intent intent = new Intent();
                intent.setClassName(com.huawei.haf.application.BaseApplication.d(), "com.huawei.operation.activity.WebViewActivity");
                intent.putExtra("url", str2 + "/portal/activity/index.html?isShowLayout=false&pn=pointsmall" + str);
                pap.c(BaseApplication.getContext(), intent);
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i2) {
                LogUtil.j("PLGACHIEVE_KakaUtil", "onCallBackFail index = ", Integer.valueOf(i2));
            }
        });
    }

    private static void c(Intent intent) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = BaseApplication.getContext().getPackageManager();
        if (packageManager == null || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536)) == null) {
            return;
        }
        ComponentName componentName = new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name);
        intent.setComponent(componentName);
        qrs.c(intent, componentName.getPackageName(), BaseApplication.getContext(), qre.f(R.string.vmall_shop_huawei));
    }
}
