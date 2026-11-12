package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;
import com.google.gson.JsonObject;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.healthmodel.HealthLifeApi;
import com.huawei.health.healthmodel.HealthModelApi;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.health.healthmodel.bean.HealthLifeStatistic;
import com.huawei.health.healthmodel.bean.HealthLifeTaskBean;
import com.huawei.health.healthmodel.bean.ImageBean;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.R;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ffv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f34006b = {R.string.IDS_settings_steps, R.string.IDS_intensity_new, R.string.IDS_health_model_workout, R.string.IDS_health_model_breath, R.string.IDS_health_model_wake_up, R.string.IDS_health_model_sleep, R.string.IDS_smile, R.string.IDS_mindfulness, R.string.IDS_drink_water, R.string.IDS_take_medicine, R.string.IDS_health_model_blood_pressure, R.string.IDS_health_model_diet, R.string.IDS_health_model_weight};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SparseIntArray f34007c = new SparseIntArray();

    private static HealthLifeApi w() {
        return (HealthLifeApi) Services.d("BasicHealthModel", HealthLifeApi.class);
    }

    public static HealthModelApi c() {
        boolean zIsInstalledModule = AppBundle.d().isInstalledModule("PluginHealthModel");
        ReleaseLogUtil.c("R_HL_HealthLifeUtil", "getHealthModelApi isInstalledModule ", Boolean.valueOf(zIsInstalledModule));
        if (zIsInstalledModule) {
            return (HealthModelApi) Services.d("PluginHealthModel", HealthModelApi.class);
        }
        v();
        boolean zIsInstalledModule2 = AppBundle.d().isInstalledModule("PluginHealthModel");
        ReleaseLogUtil.c("R_HL_HealthLifeUtil", "getHealthModelApi initHealthModelApi isInstalledModule ", Boolean.valueOf(zIsInstalledModule2));
        if (zIsInstalledModule2) {
            return (HealthModelApi) Services.d("PluginHealthModel", HealthModelApi.class);
        }
        return null;
    }

    private static void v() {
        HandlerExecutor.b(new Runnable() { // from class: ffs
            @Override // java.lang.Runnable
            public final void run() {
                ffv.p();
            }
        });
    }

    static /* synthetic */ void p() {
        Intent intent = new Intent();
        intent.putExtra("moduleName", "PluginHealthModel");
        AppBundle.d().launchActivity(BaseApplication.b(), intent, new AppBundleLauncher.InstallCallback() { // from class: ffu
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent2) {
                return ffv.c(context, intent2);
            }
        });
    }

    static /* synthetic */ boolean c(Context context, Intent intent) {
        ReleaseLogUtil.c("R_HL_HealthLifeUtil", "initHealthModelApi context ", context, " newIntent ", intent);
        return false;
    }

    public static void o() {
        k();
    }

    public static void k() {
        HealthLifeApi healthLifeApiW = w();
        LogUtil.a("HL_HealthLifeUtil", "initHealthLife api ", healthLifeApiW);
        if (healthLifeApiW == null) {
            return;
        }
        healthLifeApiW.initHealthLife();
    }

    public static void x() {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "setBinder api is null");
        } else {
            healthLifeApiW.setBinder();
        }
    }

    public static void m() {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "initDeviceManager api is null");
        } else {
            healthLifeApiW.initDeviceManager();
        }
    }

    public static void r() {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "registerH5ProService api is null");
        } else {
            healthLifeApiW.registerH5ProService();
        }
    }

    public static void q() {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "onDestroy api is null");
        } else {
            healthLifeApiW.onDestroy();
        }
    }

    public static void u() {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "resetCache api is null");
        } else {
            healthLifeApiW.resetCache();
        }
    }

    public static boolean n() {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "isJoinHealthModel api is null");
            return false;
        }
        return healthLifeApiW.isJoinHealthModel();
    }

    public static ArrayList<Integer> d() {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getBloodPressurePlanIdList api is null");
            return new ArrayList<>();
        }
        return healthLifeApiW.getBloodPressurePlanIdList();
    }

    public static List<dfl> e() {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getBloodPressureAlarmInfoList api is null");
            return Collections.EMPTY_LIST;
        }
        return healthLifeApiW.getBloodPressureAlarmInfoList();
    }

    public static void e(String str, ResponseCallback<ffq> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "queryInterventionPlanInfo callback is null");
            return;
        }
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "queryInterventionPlanInfo api is null");
            responseCallback.onResponse(-1, new ffq());
        } else {
            healthLifeApiW.queryInterventionPlanInfo(str, responseCallback);
        }
    }

    public static void c(String str, ResponseCallback<ffd> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getHealthLifeChallenge callback is null");
            return;
        }
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getHealthLifeChallenge api is null");
            responseCallback.onResponse(-1, new ffd());
        } else {
            healthLifeApiW.getHealthLifeChallenge(str, responseCallback);
        }
    }

    public static void a(Context context, Uri uri) {
        e(context, uri, (View) null);
    }

    public static void e(Context context, Uri uri, View view) {
        HealthModelApi healthModelApiC = c();
        if (healthModelApiC == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "gotoHealthModel healthModelApi is null");
            Intent intent = new Intent();
            intent.setPackage(BaseApplication.d());
            intent.setClassName(BaseApplication.b(), "com.huawei.health.MainActivity");
            intent.setFlags(131072);
            intent.putExtra(Constants.HOME_TAB_NAME, Constants.HOME);
            iov.d(context, intent);
            return;
        }
        healthModelApiC.gotoHealthModel(context, uri, view);
    }

    public static void c(Context context, Uri uri) {
        HealthModelApi healthModelApiC = c();
        if (healthModelApiC == null) {
            HealthModelApi healthModelApiC2 = c();
            if (healthModelApiC2 != null) {
                healthModelApiC2.gotoHealthModel(context, uri, null);
                return;
            }
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "gotoHealthModelByLink healthModelApi is null");
            Intent intent = new Intent();
            intent.setPackage(BaseApplication.d());
            intent.setClassName(BaseApplication.b(), "com.huawei.health.MainActivity");
            intent.setFlags(131072);
            intent.putExtra(Constants.HOME_TAB_NAME, Constants.HOME);
            iov.d(context, intent);
            return;
        }
        healthModelApiC.gotoHealthModel(context, uri, null);
    }

    public static void d(List<HealthLifeBean> list) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "refreshLastDayRecordListCache api is null");
        } else {
            healthLifeApiW.refreshLastDayRecordListCache(list);
        }
    }

    public static List<HealthLifeTaskBean> h() {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getLastDayRecordListCache api is null");
            return Collections.EMPTY_LIST;
        }
        return healthLifeApiW.getLastDayRecordListCache();
    }

    public static List<HealthLifeTaskBean> b() {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getDayRecordListCache api is null");
            return Collections.EMPTY_LIST;
        }
        return healthLifeApiW.getDayRecordListCache();
    }

    public static void b(int i, ResponseCallback<List<HealthLifeTaskBean>> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getDayRecordList callback is null");
            return;
        }
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getDayRecordList api is null");
            responseCallback.onResponse(-1, Collections.EMPTY_LIST);
        } else {
            healthLifeApiW.getDayRecordList(i, responseCallback);
        }
    }

    public static void d(int i) {
        if (i != 5 && i != 7) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "refreshTask id ", Integer.valueOf(i));
            return;
        }
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "refreshTask api is null");
        } else {
            healthLifeApiW.refreshTask(i);
        }
    }

    public static void b(Context context, HealthLifeTaskBean healthLifeTaskBean, String str, ResponseCallback<HealthLifeTaskBean> responseCallback) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "showTaskDialog api is null");
        } else {
            healthLifeApiW.showTaskDialog(context, healthLifeTaskBean, str, responseCallback);
        }
    }

    public static SparseIntArray i() {
        SparseIntArray sparseIntArray = f34007c;
        if (sparseIntArray == null || sparseIntArray.size() <= 0) {
            f34007c = c(f34006b);
        }
        return f34007c;
    }

    public static SparseIntArray c(int[] iArr) {
        if (njy.d(iArr)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getTaskArray array ", iArr);
            return new SparseIntArray();
        }
        ArrayList<Integer> arrayListJ = j();
        int size = arrayListJ.size();
        int length = iArr.length;
        SparseIntArray sparseIntArray = new SparseIntArray();
        Iterator<Integer> it = arrayListJ.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            int iMin = Math.min(Math.max(iIntValue - 2, 0), size - 2);
            if (iMin < 0 || iMin >= length) {
                ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getTaskArray index ", Integer.valueOf(iMin));
            } else {
                sparseIntArray.append(iIntValue, iArr[iMin]);
            }
        }
        return sparseIntArray;
    }

    public static ArrayList<Integer> j() {
        return b(R.array.task_id);
    }

    public static ArrayList<Integer> b(int i) {
        ArrayList<Integer> arrayList = new ArrayList<>(16);
        try {
            String[] stringArray = BaseApplication.b().getResources().getStringArray(i);
            if (njy.e(stringArray, 0)) {
                ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getCapabilitySet capabilitySetArray is Array Index Out Of Bound");
                return arrayList;
            }
            for (String str : stringArray) {
                arrayList.add(Integer.valueOf(CommonUtil.j(str)));
            }
            return arrayList;
        } catch (Resources.NotFoundException e) {
            ReleaseLogUtil.b("R_HL_HealthLifeUtil", "getCapabilitySet exception ", LogAnonymous.b(e));
        }
    }

    public static boolean c(HealthLifeBean healthLifeBean) {
        grv grvVar;
        String extendInfo = healthLifeBean.getExtendInfo();
        return (TextUtils.isEmpty(extendInfo) || (grvVar = (grv) HiJsonUtil.d(extendInfo, grv.class)) == null || grvVar.c() == 0) ? false : true;
    }

    public static int e(int i) {
        Context contextB = BaseApplication.b();
        if (i == 1) {
            return ContextCompat.getColor(contextB, R.color.clover_relax_pressure_mood);
        }
        if (i == 2) {
            return ContextCompat.getColor(contextB, R.color.clover_mood_pressure_normal);
        }
        if (i == 3) {
            return ContextCompat.getColor(contextB, R.color.clover_mood_pressure_medium);
        }
        if (i == 4) {
            return ContextCompat.getColor(contextB, R.color.clover_mood_pressure_high);
        }
        return ContextCompat.getColor(contextB, R.color.clover_relax_pressure_mood);
    }

    public static String d(String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str) || String.valueOf(0).equals(str)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getTimeText result is ", str);
            return "";
        }
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        if (length > 1) {
            str3 = strArrSplit[0];
            str2 = strArrSplit[1];
        } else if (length == 1) {
            str2 = strArrSplit[0];
            str3 = "";
        } else {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getTimeText other");
            str2 = "";
            str3 = str2;
        }
        if ((TextUtils.isEmpty(str3) || CommonUtils.j(str3) > 0) && !TextUtils.isEmpty(str2)) {
            String[] strArrSplit2 = str2.split(":");
            if (strArrSplit2.length >= 1) {
                String str4 = strArrSplit2[0];
                int iJ = CommonUtils.j(str4);
                if (iJ >= 0 && iJ < 24) {
                    return str2;
                }
                ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getTimeText hour ", Integer.valueOf(iJ), " hourText ", str4, " result ", str);
            }
        }
        return "";
    }

    public static void d(List<String> list, final ResponseCallback<List<HealthLifeBean>> responseCallback) {
        Context contextB = BaseApplication.b();
        boolean zAb = CommonUtil.ab(contextB);
        boolean zB = qgr.b(contextB);
        if (!zAb || zB) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "syncUpdateHealthGoal isNetworkConnected ", Boolean.valueOf(zAb), " isStepCard ", Boolean.valueOf(zB));
            if (responseCallback != null) {
                responseCallback.onResponse(-1, Collections.EMPTY_LIST);
                return;
            }
            return;
        }
        final HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "syncUpdateHealthGoal api is null");
            if (responseCallback != null) {
                responseCallback.onResponse(-1, Collections.EMPTY_LIST);
                return;
            }
            return;
        }
        qgm.a(list, new IBaseResponseCallback() { // from class: ffr
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                ffv.a(healthLifeApiW, responseCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void a(HealthLifeApi healthLifeApi, ResponseCallback responseCallback, int i, Object obj) {
        if (!(obj instanceof Map)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "syncUpdateHealthGoal onResponse object instanceof Map false");
            return;
        }
        HashMap map = (HashMap) obj;
        int iD = qgm.d(map, "900200006", 0);
        int iD2 = qgm.d(map, "900200008", 0);
        LogUtil.a("HL_HealthLifeUtil", "syncUpdateHealthGoal onResponse stepGoal ", Integer.valueOf(iD), " intensityGoal ", Integer.valueOf(iD2));
        ArrayList arrayList = new ArrayList(2);
        if (iD > 0) {
            HealthLifeBean healthLifeBean = new HealthLifeBean();
            healthLifeBean.setId(2);
            healthLifeBean.setTarget(String.valueOf(iD));
            arrayList.add(healthLifeBean);
        }
        if (iD2 > 0) {
            HealthLifeBean healthLifeBean2 = new HealthLifeBean();
            healthLifeBean2.setId(3);
            healthLifeBean2.setTarget(String.valueOf(iD2));
            arrayList.add(healthLifeBean2);
        }
        if (njy.b(arrayList)) {
            healthLifeApi.syncUpdateHealthGoal(arrayList, responseCallback, "UPDATE_GOAL");
        }
    }

    public static int b(int i, int i2) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getCloverComplete api is null cloverId ", Integer.valueOf(i), " date ", Integer.valueOf(i2));
            return 0;
        }
        return healthLifeApiW.getCloverComplete(i, i2);
    }

    public static List<HealthLifeBean> e(long j, long j2) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getCloverComplete api is null.");
            return new ArrayList();
        }
        return healthLifeApiW.queryHealthLifeBeanList(j, j2);
    }

    public static Object e(Context context, Object obj) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getCardReader api is null context ", context, " cardConfig ", obj);
            return null;
        }
        return healthLifeApiW.getCardReader(context, obj);
    }

    public static String a(int i) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getSubscriptionTaskData api is null date ", Integer.valueOf(i));
            return "";
        }
        return healthLifeApiW.getSubscriptionData(i);
    }

    public static void d(int i, ResponseCallback<ffc> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "queryWeekHealthReport callback is null");
            return;
        }
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "queryWeekHealthReport api is null startDay ", Integer.valueOf(i), " callback ", responseCallback);
        } else {
            healthLifeApiW.queryWeekHealthReport(i, responseCallback);
        }
    }

    public static void f(List<dfl> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "updateBloodPressureTarget list ", list);
            return;
        }
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "updateBloodPressureTarget api is null list ", list);
        } else {
            healthLifeApiW.updateBloodPressureTarget(list);
        }
    }

    public static List<HealthLifeTaskBean> c(List<Integer> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getTaskDayRecordList idList ", list);
            return Collections.EMPTY_LIST;
        }
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getTaskDayRecordList api is null idList ", list);
            return Collections.EMPTY_LIST;
        }
        return healthLifeApiW.getTaskDayRecordList(list);
    }

    public static float c(List<HealthLifeBean> list, int i) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getCloverScale list ", list, " type ", Integer.valueOf(i));
            return 0.0f;
        }
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getCloverScale api is null list ", list);
            return 0.0f;
        }
        return healthLifeApiW.getCloverScale(list, i);
    }

    public static boolean b(List<HealthLifeBean> list, float f, float f2, float f3) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "isPerfectClover list ", list, " top ", Float.valueOf(f), " left ", Float.valueOf(f2), " right ", Float.valueOf(f3));
            return false;
        }
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "isPerfectClover api is null list ", list, " top ", Float.valueOf(f), " left ", Float.valueOf(f2), " right ", Float.valueOf(f3));
            return false;
        }
        return healthLifeApiW.isPerfectClover(list, f, f2, f3);
    }

    public static int b(List<HealthLifeBean> list, int i) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getActiveTaskId list ", list, " type ", Integer.valueOf(i));
            return 0;
        }
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getActiveTaskId api is null list ", list);
            return 0;
        }
        return healthLifeApiW.getActiveTaskId(list, i);
    }

    public static List<ImageBean> e(String str) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getTaskDialogImageList api is null");
            return Collections.EMPTY_LIST;
        }
        return healthLifeApiW.getTaskDialogImageList(str);
    }

    public static void c(int i, Context context) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "setAboutEvent api is null");
        } else {
            healthLifeApiW.setAboutEvent(i, context);
        }
    }

    public static void a(int i, int i2, Bitmap bitmap) {
        if (BaseApplication.j() == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "topActivity is null");
            return;
        }
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "shareSleepTask api is null");
        } else {
            healthLifeApiW.shareSleepTask(i, i2, bitmap);
        }
    }

    public static void y() {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "sendDeviceTaskData api is null");
        } else {
            healthLifeApiW.sendDeviceTaskData();
        }
    }

    public static int g() {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getPlayType api is null");
            return 0;
        }
        return healthLifeApiW.getPlayType();
    }

    public static Pair<Integer, String> a(List<HealthLifeBean> list) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getRemindTipMap api is null");
            return new Pair<>(-1, "");
        }
        return healthLifeApiW.getRemindTipMap(list);
    }

    public static void c(int i, ResponseCallback<ffe> responseCallback) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getHealthLifeConDays api is null date ", Integer.valueOf(i), " callback ", responseCallback);
            responseCallback.onResponse(-1, new ffe());
        } else {
            healthLifeApiW.getHealthLifeConDays(i, responseCallback);
        }
    }

    public static void b(ffe ffeVar) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "setTaskConsInfoCache api is null");
        } else {
            healthLifeApiW.setHealthLifeTaskConsInfoCache(ffeVar);
        }
    }

    public static void b(List<HealthLifeTaskBean> list, ffe ffeVar) {
        if (ffeVar == null || njy.e(ffeVar.d()) || njy.e(list)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "HealthTaskConsInfo is null");
            return;
        }
        boolean z = false;
        for (HealthLifeStatistic healthLifeStatistic : ffeVar.d()) {
            for (HealthLifeTaskBean healthLifeTaskBean : list) {
                if (healthLifeStatistic.getId() == healthLifeTaskBean.getId() && !healthLifeStatistic.hasToday() && healthLifeTaskBean.getComplete() > 0) {
                    z = true;
                    healthLifeStatistic.setHasToday(true);
                    healthLifeStatistic.addConDays();
                    LogUtil.a("HL_HealthLifeUtil", "update task id ", Integer.valueOf(healthLifeTaskBean.getId()), " consDays is ", Integer.valueOf(healthLifeStatistic.getConDays()));
                    break;
                }
            }
        }
        if (z) {
            b(ffeVar);
        }
    }

    public static void d(List<HealthLifeBean> list, ffe ffeVar) {
        if (ffeVar == null || njy.e(ffeVar.d()) || njy.e(list)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "HealthTaskConsInfo is null");
            return;
        }
        boolean z = false;
        for (HealthLifeStatistic healthLifeStatistic : ffeVar.d()) {
            for (HealthLifeBean healthLifeBean : list) {
                if (healthLifeStatistic.getId() == healthLifeBean.getId() && healthLifeBean.getComplete() > 0 && !healthLifeStatistic.hasToday()) {
                    healthLifeStatistic.addConDays();
                    z = true;
                    healthLifeStatistic.setHasToday(true);
                    LogUtil.a("HL_HealthLifeUtil", "update task id ", Integer.valueOf(healthLifeBean.getId()), " consDays is ", Integer.valueOf(healthLifeStatistic.getConDays()));
                    break;
                }
            }
        }
        if (z) {
            b(ffeVar);
        }
    }

    public static List<Integer> c(int i) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getTaskConsInfoCache api is null");
            return new ArrayList();
        }
        return healthLifeApiW.getSmallShownIdsCache(i);
    }

    public static void e(List<Integer> list) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getTaskConsInfoCache api is null");
        } else {
            healthLifeApiW.setSmallShownIdsCache(list);
        }
    }

    public static List<Integer> b(List<HealthLifeTaskBean> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<HealthLifeTaskBean> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getId()));
        }
        return arrayList;
    }

    public static void c(String str, boolean z) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getTaskConsInfoCache api is null");
        } else {
            healthLifeApiW.setHealthLifeSwitch(str, z);
        }
    }

    public static boolean d(String str, boolean z) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getTaskConsInfoCache api is null");
            return true;
        }
        return healthLifeApiW.getHealthLifeSwitch(str, z);
    }

    public static String e(String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
            LogUtil.a("HL_HealthLifeUtil", "JSONException");
        }
        LogUtil.a("HL_HealthLifeUtil", "configdata is ", jSONObject.toString());
        return jSONObject.toString();
    }

    public static String a(String str, String str2) {
        JsonObject jsonObject = (JsonObject) HiJsonUtil.d(str, JsonObject.class);
        if (jsonObject == null || jsonObject.isJsonNull() || !jsonObject.isJsonObject() || jsonObject.get(str2) == null) {
            LogUtil.j("HL_HealthLifeUtil", "configData fromJson is null");
            return null;
        }
        return jsonObject.get(str2).getAsString();
    }

    public static Calendar b(String str) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getTaskConsInfoCache api is null");
            return null;
        }
        return healthLifeApiW.getHourAndMinute(str);
    }

    public static boolean t() {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "isSupportHealthLife api is null");
            return false;
        }
        return healthLifeApiW.isSupportHealthLife();
    }

    public static boolean l() {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "isHealthLife api is null");
            return false;
        }
        return healthLifeApiW.isHealthLife();
    }

    public static void a(ResponseCallback<Boolean> responseCallback) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "isHealthLife api is null");
        } else {
            healthLifeApiW.isHealthLife(responseCallback);
        }
    }

    public static boolean s() {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW != null) {
            return healthLifeApiW.getShowGuidePageCount() < 1;
        }
        ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getShowGuidePageCount api is null");
        return false;
    }

    public static void i(int i) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "setShowGuidePageCount api is null");
        } else {
            healthLifeApiW.setShowGuidePageCount(i);
        }
    }

    public static String a() {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getHealthLifePlanId api is null");
            return "";
        }
        return healthLifeApiW.getHealthLifePlanId();
    }

    public static void e(int i, ResponseCallback<String> responseCallback) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "setHealthLifeVersion api is null");
        } else {
            healthLifeApiW.setHealthLifeVersion(i, responseCallback);
        }
    }

    public static void a(qex qexVar, ResponseCallback<qey> responseCallback) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "createPlan api is null");
        } else {
            healthLifeApiW.createPlan(qexVar, responseCallback);
        }
    }

    public static void d(qev qevVar, ResponseCallback<List<qey>> responseCallback) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "queryPlan api is null");
        } else {
            healthLifeApiW.queryPlan(qevVar, responseCallback);
        }
    }

    public static void c(qfv qfvVar, ResponseCallback<qgc> responseCallback) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "createTask api is null");
        } else {
            healthLifeApiW.createTask(qfvVar, responseCallback);
        }
    }

    public static qfj a(List<String> list, ResponseCallback<qfj> responseCallback) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "querySchedule api is null");
            return null;
        }
        return healthLifeApiW.querySchedule(list, responseCallback);
    }

    public static qfj d(String str, List<String> list, qfn qfnVar, ResponseCallback<qfj> responseCallback) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "querySchedule api is null querySchedulesReq ", qfnVar);
            return null;
        }
        return healthLifeApiW.querySchedule(str, list, qfnVar, responseCallback);
    }

    public static void a(int i, ResponseCallback<qfr> responseCallback) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "drinkWater api is null");
        } else {
            healthLifeApiW.drinkWater(i, responseCallback);
        }
    }

    public static List<nrh> e(int i, int i2, ResponseCallback<List<nrh>> responseCallback) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getLeafProgress api is null");
            return Collections.EMPTY_LIST;
        }
        return healthLifeApiW.getLeafProgress(i, i2, responseCallback);
    }

    public static void d(String str, String str2, ResponseCallback<String> responseCallback) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "updateDietRecord api is null");
        } else {
            healthLifeApiW.updateDietRecord(str, str2, responseCallback);
        }
    }

    public static void d(qfj qfjVar) {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "refreshLastQuerySchedulesResp api is null");
        } else {
            healthLifeApiW.refreshLastQuerySchedulesResp(qfjVar);
        }
    }

    public static qfj f() {
        HealthLifeApi healthLifeApiW = w();
        if (healthLifeApiW == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getLastQuerySchedulesResp api is null");
            return null;
        }
        return healthLifeApiW.getLastQuerySchedulesResp();
    }
}
